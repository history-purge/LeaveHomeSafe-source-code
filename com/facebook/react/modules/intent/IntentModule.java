package com.facebook.react.modules.intent;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import com.facebook.fbreact.specs.NativeLinkingSpec;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import e.e.o.d0.a.a;

@a(name = "IntentAndroid")
public class IntentModule extends NativeLinkingSpec {
  public static final String NAME = "IntentAndroid";
  
  public IntentModule(ReactApplicationContext paramReactApplicationContext) {
    super(paramReactApplicationContext);
  }
  
  public void addListener(String paramString) {}
  
  public void canOpenURL(String paramString, Promise paramPromise) {
    if (paramString == null || paramString.isEmpty()) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Invalid URL: ");
      stringBuilder.append(paramString);
      paramPromise.reject((Throwable)new JSApplicationIllegalArgumentException(stringBuilder.toString()));
      return;
    } 
    try {
      boolean bool;
      Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(paramString));
      intent.addFlags(268435456);
      if (intent.resolveActivity(getReactApplicationContext().getPackageManager()) != null) {
        bool = true;
      } else {
        bool = false;
      } 
      paramPromise.resolve(Boolean.valueOf(bool));
      return;
    } catch (Exception exception) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Could not check if URL '");
      stringBuilder.append(paramString);
      stringBuilder.append("' can be opened: ");
      stringBuilder.append(exception.getMessage());
      paramPromise.reject((Throwable)new JSApplicationIllegalArgumentException(stringBuilder.toString()));
      return;
    } 
  }
  
  public void getInitialURL(Promise paramPromise) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual getCurrentActivity : ()Landroid/app/Activity;
    //   4: astore #4
    //   6: aconst_null
    //   7: astore_3
    //   8: aload_3
    //   9: astore_2
    //   10: aload #4
    //   12: ifnull -> 68
    //   15: aload #4
    //   17: invokevirtual getIntent : ()Landroid/content/Intent;
    //   20: astore_2
    //   21: aload_2
    //   22: invokevirtual getAction : ()Ljava/lang/String;
    //   25: astore #4
    //   27: aload_2
    //   28: invokevirtual getData : ()Landroid/net/Uri;
    //   31: astore #5
    //   33: aload_3
    //   34: astore_2
    //   35: aload #5
    //   37: ifnull -> 68
    //   40: ldc 'android.intent.action.VIEW'
    //   42: aload #4
    //   44: invokevirtual equals : (Ljava/lang/Object;)Z
    //   47: ifne -> 62
    //   50: aload_3
    //   51: astore_2
    //   52: ldc 'android.nfc.action.NDEF_DISCOVERED'
    //   54: aload #4
    //   56: invokevirtual equals : (Ljava/lang/Object;)Z
    //   59: ifeq -> 68
    //   62: aload #5
    //   64: invokevirtual toString : ()Ljava/lang/String;
    //   67: astore_2
    //   68: aload_1
    //   69: aload_2
    //   70: invokeinterface resolve : (Ljava/lang/Object;)V
    //   75: return
    //   76: astore_2
    //   77: new java/lang/StringBuilder
    //   80: dup
    //   81: invokespecial <init> : ()V
    //   84: astore_3
    //   85: aload_3
    //   86: ldc 'Could not get the initial URL : '
    //   88: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   91: pop
    //   92: aload_3
    //   93: aload_2
    //   94: invokevirtual getMessage : ()Ljava/lang/String;
    //   97: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   100: pop
    //   101: aload_1
    //   102: new com/facebook/react/bridge/JSApplicationIllegalArgumentException
    //   105: dup
    //   106: aload_3
    //   107: invokevirtual toString : ()Ljava/lang/String;
    //   110: invokespecial <init> : (Ljava/lang/String;)V
    //   113: invokeinterface reject : (Ljava/lang/Throwable;)V
    //   118: return
    // Exception table:
    //   from	to	target	type
    //   0	6	76	java/lang/Exception
    //   15	33	76	java/lang/Exception
    //   40	50	76	java/lang/Exception
    //   52	62	76	java/lang/Exception
    //   62	68	76	java/lang/Exception
    //   68	75	76	java/lang/Exception
  }
  
  public String getName() {
    return "IntentAndroid";
  }
  
  public void openSettings(Promise paramPromise) {
    try {
      Intent intent = new Intent();
      Activity activity = getCurrentActivity();
      String str = getReactApplicationContext().getPackageName();
      intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
      intent.addCategory("android.intent.category.DEFAULT");
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("package:");
      stringBuilder.append(str);
      intent.setData(Uri.parse(stringBuilder.toString()));
      intent.addFlags(268435456);
      intent.addFlags(1073741824);
      intent.addFlags(8388608);
      activity.startActivity(intent);
      paramPromise.resolve(Boolean.valueOf(true));
      return;
    } catch (Exception exception) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Could not open the Settings: ");
      stringBuilder.append(exception.getMessage());
      paramPromise.reject((Throwable)new JSApplicationIllegalArgumentException(stringBuilder.toString()));
      return;
    } 
  }
  
  public void openURL(String paramString, Promise paramPromise) {
    if (paramString == null || paramString.isEmpty()) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Invalid URL: ");
      stringBuilder.append(paramString);
      paramPromise.reject((Throwable)new JSApplicationIllegalArgumentException(stringBuilder.toString()));
      return;
    } 
    try {
      String str1;
      Activity activity = getCurrentActivity();
      Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(paramString).normalizeScheme());
      String str2 = getReactApplicationContext().getPackageName();
      ComponentName componentName = intent.resolveActivity(getReactApplicationContext().getPackageManager());
      if (componentName != null) {
        str1 = componentName.getPackageName();
      } else {
        str1 = "";
      } 
      if (activity == null || !str2.equals(str1))
        intent.addFlags(268435456); 
      if (activity != null) {
        activity.startActivity(intent);
      } else {
        getReactApplicationContext().startActivity(intent);
      } 
      paramPromise.resolve(Boolean.valueOf(true));
      return;
    } catch (Exception exception) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Could not open URL '");
      stringBuilder.append(paramString);
      stringBuilder.append("': ");
      stringBuilder.append(exception.getMessage());
      paramPromise.reject((Throwable)new JSApplicationIllegalArgumentException(stringBuilder.toString()));
      return;
    } 
  }
  
  public void removeListeners(double paramDouble) {}
  
  public void sendIntent(String paramString, ReadableArray paramReadableArray, Promise paramPromise) {
    StringBuilder stringBuilder;
    if (paramString == null || paramString.isEmpty()) {
      stringBuilder = new StringBuilder();
      stringBuilder.append("Invalid Action: ");
      stringBuilder.append(paramString);
      stringBuilder.append(".");
      paramPromise.reject((Throwable)new JSApplicationIllegalArgumentException(stringBuilder.toString()));
      return;
    } 
    Intent intent = new Intent(paramString);
    if (intent.resolveActivity(getReactApplicationContext().getPackageManager()) == null) {
      stringBuilder = new StringBuilder();
      stringBuilder.append("Could not launch Intent with action ");
      stringBuilder.append(paramString);
      stringBuilder.append(".");
      paramPromise.reject((Throwable)new JSApplicationIllegalArgumentException(stringBuilder.toString()));
      return;
    } 
    if (stringBuilder != null) {
      int i;
      for (i = 0; i < stringBuilder.size(); i++) {
        ReadableMap readableMap = stringBuilder.getMap(i);
        paramString = readableMap.keySetIterator().nextKey();
        ReadableType readableType = readableMap.getType(paramString);
        int j = a.a[readableType.ordinal()];
        if (j != 1) {
          if (j != 2) {
            if (j != 3) {
              stringBuilder = new StringBuilder();
              stringBuilder.append("Extra type for ");
              stringBuilder.append(paramString);
              stringBuilder.append(" not supported.");
              paramPromise.reject((Throwable)new JSApplicationIllegalArgumentException(stringBuilder.toString()));
              return;
            } 
            intent.putExtra(paramString, readableMap.getBoolean(paramString));
          } else {
            intent.putExtra(paramString, Double.valueOf(readableMap.getDouble(paramString)));
          } 
        } else {
          intent.putExtra(paramString, readableMap.getString(paramString));
        } 
      } 
    } 
    getReactApplicationContext().startActivity(intent);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/modules/intent/IntentModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */