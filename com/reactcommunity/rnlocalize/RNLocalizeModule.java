package com.reactcommunity.rnlocalize;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
import android.provider.Settings;
import android.text.TextUtils;
import android.text.format.DateFormat;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import e.e.o.d0.a.a;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Currency;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

@a(name = "RNLocalize")
public class RNLocalizeModule extends ReactContextBaseJavaModule implements LifecycleEventListener {
  public static final String MODULE_NAME = "RNLocalize";
  
  private final List<String> USES_FAHRENHEIT = Arrays.asList(new String[] { "BS", "BZ", "KY", "PR", "PW", "US" });
  
  private final List<String> USES_IMPERIAL = Arrays.asList(new String[] { "LR", "MM", "US" });
  
  private final List<String> USES_RTL_LAYOUT = Arrays.asList(new String[] { 
        "ar", "ckb", "fa", "he", "ks", "lrc", "mzn", "ps", "ug", "ur", 
        "yi" });
  
  private boolean emitChangeOnResume = false;
  
  private boolean mainActivityVisible = true;
  
  public RNLocalizeModule(ReactApplicationContext paramReactApplicationContext) {
    super(paramReactApplicationContext);
    IntentFilter intentFilter = new IntentFilter();
    intentFilter.addAction("android.intent.action.DATE_CHANGED");
    intentFilter.addAction("android.intent.action.LOCALE_CHANGED");
    intentFilter.addAction("android.intent.action.TIME_SET");
    intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
    a a = new a(this);
    paramReactApplicationContext.addLifecycleEventListener(this);
    paramReactApplicationContext.registerReceiver(a, intentFilter);
  }
  
  private String createLanguageTag(String paramString1, String paramString2, String paramString3) {
    String str = paramString1;
    if (!TextUtils.isEmpty(paramString2)) {
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append(paramString1);
      stringBuilder1.append("-");
      stringBuilder1.append(paramString2);
      str = stringBuilder1.toString();
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(str);
    stringBuilder.append("-");
    stringBuilder.append(paramString3);
    return stringBuilder.toString();
  }
  
  private void emitLocalizationDidChange() {
    if (getReactApplicationContext().hasActiveCatalystInstance())
      ((DeviceEventManagerModule.RCTDeviceEventEmitter)getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("localizationDidChange", getExportedConstants()); 
  }
  
  private String getCountryCode(Locale paramLocale) {
    try {
      String str = paramLocale.getCountry();
      if (str.equals("419"))
        return "UN"; 
      boolean bool = TextUtils.isEmpty(str);
      if (bool)
        str = ""; 
      return str;
    } catch (Exception exception) {
      return "";
    } 
  }
  
  private String getCurrencyCode(Locale paramLocale) {
    try {
      Currency currency = Currency.getInstance(paramLocale);
      return (currency == null) ? "" : currency.getCurrencyCode();
    } catch (Exception exception) {
      return "";
    } 
  }
  
  private WritableMap getExportedConstants() {
    List<Locale> list = getLocales();
    Locale locale = list.get(0);
    String str2 = getRegionCode(locale);
    String str1 = str2;
    if (TextUtils.isEmpty(str2))
      str1 = "US"; 
    ArrayList<String> arrayList1 = new ArrayList();
    ArrayList<String> arrayList2 = new ArrayList();
    WritableArray writableArray1 = Arguments.createArray();
    WritableArray writableArray2 = Arguments.createArray();
    for (Locale locale1 : list) {
      String str4 = getLanguageCode(locale1);
      String str5 = getScriptCode(locale1);
      String str3 = getCountryCode(locale1);
      String str6 = getCurrencyCode(locale1);
      str2 = str3;
      if (TextUtils.isEmpty(str3))
        str2 = str1; 
      str3 = createLanguageTag(str4, str5, str2);
      WritableMap writableMap1 = Arguments.createMap();
      writableMap1.putString("languageCode", str4);
      writableMap1.putString("countryCode", str2);
      writableMap1.putString("languageTag", str3);
      writableMap1.putBoolean("isRTL", getIsRTL(locale1));
      if (!TextUtils.isEmpty(str5))
        writableMap1.putString("scriptCode", str5); 
      if (!arrayList1.contains(str3)) {
        arrayList1.add(str3);
        writableArray1.pushMap((ReadableMap)writableMap1);
      } 
      if (!TextUtils.isEmpty(str6) && !arrayList2.contains(str6)) {
        arrayList2.add(str6);
        writableArray2.pushString(str6);
      } 
    } 
    if (writableArray2.size() == 0)
      writableArray2.pushString("USD"); 
    WritableMap writableMap = Arguments.createMap();
    writableMap.putString("calendar", "gregorian");
    writableMap.putString("country", str1);
    writableMap.putArray("currencies", (ReadableArray)writableArray2);
    writableMap.putArray("locales", (ReadableArray)writableArray1);
    writableMap.putMap("numberFormatSettings", (ReadableMap)getNumberFormatSettings(locale));
    if (this.USES_FAHRENHEIT.contains(str1)) {
      str2 = "fahrenheit";
    } else {
      str2 = "celsius";
    } 
    writableMap.putString("temperatureUnit", str2);
    writableMap.putString("timeZone", TimeZone.getDefault().getID());
    writableMap.putBoolean("uses24HourClock", DateFormat.is24HourFormat((Context)getReactApplicationContext()));
    writableMap.putBoolean("usesAutoDateAndTime", getUsesAutoDateAndTime());
    writableMap.putBoolean("usesAutoTimeZone", getUsesAutoTimeZone());
    writableMap.putBoolean("usesMetricSystem", this.USES_IMPERIAL.contains(str1) ^ true);
    return writableMap;
  }
  
  private boolean getIsRTL(Locale paramLocale) {
    return (Build.VERSION.SDK_INT >= 17) ? ((TextUtils.getLayoutDirectionFromLocale(paramLocale) == 1)) : this.USES_RTL_LAYOUT.contains(getLanguageCode(paramLocale));
  }
  
  private String getLanguageCode(Locale paramLocale) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual getLanguage : ()Ljava/lang/String;
    //   4: astore_1
    //   5: aload_1
    //   6: invokevirtual hashCode : ()I
    //   9: istore_2
    //   10: iload_2
    //   11: sipush #3365
    //   14: if_icmpeq -> 64
    //   17: iload_2
    //   18: sipush #3374
    //   21: if_icmpeq -> 49
    //   24: iload_2
    //   25: sipush #3391
    //   28: if_icmpeq -> 34
    //   31: goto -> 79
    //   34: aload_1
    //   35: ldc_w 'ji'
    //   38: invokevirtual equals : (Ljava/lang/Object;)Z
    //   41: ifeq -> 79
    //   44: iconst_2
    //   45: istore_2
    //   46: goto -> 81
    //   49: aload_1
    //   50: ldc_w 'iw'
    //   53: invokevirtual equals : (Ljava/lang/Object;)Z
    //   56: ifeq -> 79
    //   59: iconst_0
    //   60: istore_2
    //   61: goto -> 81
    //   64: aload_1
    //   65: ldc_w 'in'
    //   68: invokevirtual equals : (Ljava/lang/Object;)Z
    //   71: ifeq -> 79
    //   74: iconst_1
    //   75: istore_2
    //   76: goto -> 81
    //   79: iconst_m1
    //   80: istore_2
    //   81: iload_2
    //   82: ifeq -> 104
    //   85: iload_2
    //   86: iconst_1
    //   87: if_icmpeq -> 100
    //   90: iload_2
    //   91: iconst_2
    //   92: if_icmpeq -> 97
    //   95: aload_1
    //   96: areturn
    //   97: ldc 'yi'
    //   99: areturn
    //   100: ldc_w 'id'
    //   103: areturn
    //   104: ldc 'he'
    //   106: areturn
  }
  
  private List<Locale> getLocales() {
    ArrayList<Locale> arrayList = new ArrayList();
    Configuration configuration = getReactApplicationContext().getResources().getConfiguration();
    if (Build.VERSION.SDK_INT < 24) {
      arrayList.add(configuration.locale);
      return arrayList;
    } 
    LocaleList localeList = configuration.getLocales();
    for (int i = 0; i < localeList.size(); i++)
      arrayList.add(localeList.get(i)); 
    return arrayList;
  }
  
  private WritableMap getNumberFormatSettings(Locale paramLocale) {
    WritableMap writableMap = Arguments.createMap();
    DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(paramLocale);
    writableMap.putString("decimalSeparator", String.valueOf(decimalFormatSymbols.getDecimalSeparator()));
    writableMap.putString("groupingSeparator", String.valueOf(decimalFormatSymbols.getGroupingSeparator()));
    return writableMap;
  }
  
  private String getRegionCode(Locale paramLocale) {
    String str = getSystemProperty("ro.miui.region");
    return !TextUtils.isEmpty(str) ? str : getCountryCode(paramLocale);
  }
  
  private String getScriptCode(Locale paramLocale) {
    if (Build.VERSION.SDK_INT < 21)
      return ""; 
    String str2 = paramLocale.getScript();
    String str1 = str2;
    if (TextUtils.isEmpty(str2))
      str1 = ""; 
    return str1;
  }
  
  private String getSystemProperty(String paramString) {
    try {
      Class<?> clazz = Class.forName("android.os.SystemProperties");
      return (String)clazz.getMethod("get", new Class[] { String.class }).invoke(clazz, new Object[] { paramString });
    } catch (Exception exception) {
      return "";
    } 
  }
  
  private boolean getUsesAutoDateAndTime() {
    ContentResolver contentResolver = getReactApplicationContext().getContentResolver();
    int i = Build.VERSION.SDK_INT;
    boolean bool = false;
    if (i >= 17) {
      i = Settings.Global.getInt(contentResolver, "auto_time", 0);
    } else {
      i = Settings.System.getInt(contentResolver, "auto_time", 0);
    } 
    if (i != 0)
      bool = true; 
    return bool;
  }
  
  private boolean getUsesAutoTimeZone() {
    ContentResolver contentResolver = getReactApplicationContext().getContentResolver();
    int i = Build.VERSION.SDK_INT;
    boolean bool = false;
    if (i >= 17) {
      i = Settings.Global.getInt(contentResolver, "auto_time_zone", 0);
    } else {
      i = Settings.System.getInt(contentResolver, "auto_time_zone", 0);
    } 
    if (i != 0)
      bool = true; 
    return bool;
  }
  
  private void onLocalizationDidChange() {
    if (this.mainActivityVisible) {
      emitLocalizationDidChange();
      return;
    } 
    this.emitChangeOnResume = true;
  }
  
  public Map<String, Object> getConstants() {
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    hashMap.put("initialConstants", getExportedConstants());
    return (Map)hashMap;
  }
  
  public String getName() {
    return "RNLocalize";
  }
  
  public void onHostDestroy() {}
  
  public void onHostPause() {
    this.mainActivityVisible = false;
  }
  
  public void onHostResume() {
    this.mainActivityVisible = true;
    if (this.emitChangeOnResume) {
      emitLocalizationDidChange();
      this.emitChangeOnResume = false;
    } 
  }
  
  class a extends BroadcastReceiver {
    a(RNLocalizeModule this$0) {}
    
    public void onReceive(Context param1Context, Intent param1Intent) {
      if (param1Intent.getAction() != null)
        this.a.onLocalizationDidChange(); 
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/reactcommunity/rnlocalize/RNLocalizeModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */