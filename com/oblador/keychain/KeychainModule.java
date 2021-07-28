package com.oblador.keychain;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.biometric.BiometricPrompt;
import androidx.biometric.e;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.oblador.keychain.g.e;
import com.oblador.keychain.g.f;
import com.oblador.keychain.g.g;
import com.oblador.keychain.g.h;
import com.oblador.keychain.g.i;
import com.oblador.keychain.h.d;
import com.oblador.keychain.h.h;
import com.oblador.keychain.i.a;
import com.oblador.keychain.i.b;
import com.oblador.keychain.i.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class KeychainModule extends ReactContextBaseJavaModule {
  public static final String EMPTY_STRING = "";
  
  public static final String FACE_SUPPORTED_NAME = "Face";
  
  public static final String FINGERPRINT_SUPPORTED_NAME = "Fingerprint";
  
  public static final String IRIS_SUPPORTED_NAME = "Iris";
  
  public static final String KEYCHAIN_MODULE = "RNKeychainManager";
  
  private static final String LOG_TAG = "KeychainModule";
  
  public static final String WARMING_UP_ALIAS = "warmingUp";
  
  private final Map<String, e> cipherStorageMap = new HashMap<String, e>();
  
  private final e prefsStorage;
  
  private boolean supportWeak = false;
  
  public KeychainModule(ReactApplicationContext paramReactApplicationContext) {
    super(paramReactApplicationContext);
    this.prefsStorage = new e(paramReactApplicationContext);
    addCipherStorageToMap((e)new g(paramReactApplicationContext));
    addCipherStorageToMap((e)new h());
    if (Build.VERSION.SDK_INT >= 23)
      addCipherStorageToMap((e)new i()); 
  }
  
  private void addCipherStorageToMap(e parame) {
    this.cipherStorageMap.put(parame.c(), parame);
  }
  
  private e.c decryptCredentials(String paramString1, e parame, e.a parama, String paramString2, BiometricPrompt.d paramd) {
    String str = parama.c;
    if (str.equals(parame.c()))
      return decryptToResult(paramString1, parame, parama, paramd); 
    e e1 = getCipherStorageByName(str);
    if (e1 != null) {
      e.c c = decryptToResult(paramString1, e1, parama, paramd);
      if ("automaticUpgradeToMoreSecuredStorage".equals(paramString2))
        try {
          migrateCipherStorage(paramString1, parame, e1, c);
          return c;
        } catch (a a1) {
          Log.w("RNKeychainManager", "Migrating to a less safe storage is not allowed. Keeping the old one");
        }  
      return c;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Wrong cipher storage name '");
    stringBuilder.append(str);
    stringBuilder.append("' or cipher not available");
    throw new c(stringBuilder.toString());
  }
  
  private e.c decryptToResult(String paramString, e parame, e.a parama, BiometricPrompt.d paramd) {
    d d1 = getInteractiveHandler(parame, paramd);
    parame.a(d1, paramString, (byte[])parama.a, (byte[])parama.b, f.c);
    a.a(d1.b());
    if (d1.a() != null)
      return d1.a(); 
    throw new a("No decryption results and no error. Something deeply wrong!");
  }
  
  private Collection<String> doGetAllGenericPasswordServices() {
    Set<String> set = this.prefsStorage.a();
    ArrayList<e> arrayList = new ArrayList(set.size());
    Iterator<String> iterator = set.iterator();
    while (iterator.hasNext())
      arrayList.add(getCipherStorageByName(iterator.next())); 
    HashSet<String> hashSet = new HashSet();
    Iterator<e> iterator1 = arrayList.iterator();
    while (iterator1.hasNext()) {
      for (String str : ((e)iterator1.next()).g()) {
        if (!str.equals("warmingUp"))
          hashSet.add(str); 
      } 
    } 
    return hashSet;
  }
  
  private static String getAccessControlOrDefault(ReadableMap paramReadableMap) {
    return getAccessControlOrDefault(paramReadableMap, "None");
  }
  
  private static String getAccessControlOrDefault(ReadableMap paramReadableMap, String paramString) {
    if (paramReadableMap != null && paramReadableMap.hasKey("accessControl")) {
      String str = paramReadableMap.getString("accessControl");
    } else {
      paramReadableMap = null;
    } 
    return (String)((paramReadableMap == null) ? paramString : paramReadableMap);
  }
  
  private static String getAliasOrDefault(String paramString) {
    String str = paramString;
    if (paramString == null)
      str = ""; 
    return str;
  }
  
  private static int getAuthenticators(ReadableMap paramReadableMap) {
    return (paramReadableMap != null && paramReadableMap.hasKey("supportWeak") && paramReadableMap.getBoolean("supportWeak")) ? 33023 : 15;
  }
  
  private static BiometricPrompt.d getPromptInfo(ReadableMap paramReadableMap) {
    ReadableMap readableMap;
    if (paramReadableMap != null && paramReadableMap.hasKey("authenticationPrompt")) {
      readableMap = paramReadableMap.getMap("authenticationPrompt");
    } else {
      readableMap = null;
    } 
    BiometricPrompt.d.a a = new BiometricPrompt.d.a();
    if (readableMap != null && readableMap.hasKey("title"))
      a.d(readableMap.getString("title")); 
    if (readableMap != null && readableMap.hasKey("subtitle"))
      a.c(readableMap.getString("subtitle")); 
    if (readableMap != null && readableMap.hasKey("description"))
      a.a(readableMap.getString("description")); 
    if (readableMap != null && readableMap.hasKey("cancel")) {
      String str = readableMap.getString("cancel");
      if (paramReadableMap != null && (!paramReadableMap.hasKey("supportWeak") || (paramReadableMap.hasKey("supportWeak") && !paramReadableMap.getBoolean("supportWeak"))))
        a.b(str); 
    } 
    a.a(getAuthenticators(paramReadableMap));
    a.a(false);
    if (Build.VERSION.SDK_INT == 29 && paramReadableMap != null && paramReadableMap.hasKey("supportWeak") && paramReadableMap.getBoolean("supportWeak"))
      a.b(true); 
    return a.a();
  }
  
  private f getSecurityLevel(boolean paramBoolean) {
    try {
      e e1 = getCipherStorageForCurrentAPILevel(paramBoolean);
      return !e1.a().a(f.d) ? f.c : (e1.f() ? f.e : f.d);
    } catch (a a) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Security Level Exception: ");
      stringBuilder.append(a.getMessage());
      Log.w("RNKeychainManager", stringBuilder.toString(), (Throwable)a);
      return f.c;
    } 
  }
  
  private static f getSecurityLevelOrDefault(ReadableMap paramReadableMap) {
    return getSecurityLevelOrDefault(paramReadableMap, f.c.name());
  }
  
  private static f getSecurityLevelOrDefault(ReadableMap paramReadableMap, String paramString) {
    String str;
    if (paramReadableMap != null && paramReadableMap.hasKey("securityLevel")) {
      String str1 = paramReadableMap.getString("securityLevel");
    } else {
      paramReadableMap = null;
    } 
    ReadableMap readableMap = paramReadableMap;
    if (paramReadableMap == null)
      str = paramString; 
    return f.valueOf(str);
  }
  
  private static String getSecurityRulesOrDefault(ReadableMap paramReadableMap) {
    return getSecurityRulesOrDefault(paramReadableMap, "automaticUpgradeToMoreSecuredStorage");
  }
  
  private static String getSecurityRulesOrDefault(ReadableMap paramReadableMap, String paramString) {
    if (paramReadableMap != null && paramReadableMap.hasKey("rules")) {
      String str = paramReadableMap.getString("accessControl");
    } else {
      paramReadableMap = null;
    } 
    return (String)((paramReadableMap == null) ? paramString : paramReadableMap);
  }
  
  private e getSelectedStorage(ReadableMap paramReadableMap) {
    e e1;
    boolean bool = getUseBiometry(getAccessControlOrDefault(paramReadableMap));
    String str1 = getSpecificStorageOrDefault(paramReadableMap);
    if (str1 != null) {
      e e2 = getCipherStorageByName(str1);
    } else {
      str1 = null;
    } 
    String str2 = str1;
    if (str1 == null)
      e1 = getCipherStorageForCurrentAPILevel(bool); 
    return e1;
  }
  
  private static String getServiceOrDefault(ReadableMap paramReadableMap) {
    if (paramReadableMap != null && paramReadableMap.hasKey("service")) {
      String str = paramReadableMap.getString("service");
    } else {
      paramReadableMap = null;
    } 
    return getAliasOrDefault((String)paramReadableMap);
  }
  
  private static String getSpecificStorageOrDefault(ReadableMap paramReadableMap) {
    return (paramReadableMap != null && paramReadableMap.hasKey("storage")) ? paramReadableMap.getString("storage") : null;
  }
  
  public static boolean getUseBiometry(String paramString) {
    return ("BiometryAny".equals(paramString) || "BiometryCurrentSet".equals(paramString) || "BiometryAnyOrDevicePasscode".equals(paramString) || "BiometryCurrentSetOrDevicePasscode".equals(paramString));
  }
  
  private void internalWarmingBestCipher() {
    try {
      f f;
      long l = System.nanoTime();
      StringBuilder stringBuilder2 = new StringBuilder();
      stringBuilder2.append("warming up started at ");
      stringBuilder2.append(l);
      Log.v("RNKeychainManager", stringBuilder2.toString());
      f f1 = (f)getCipherStorageForCurrentAPILevel();
      f1.h();
      if (f1.f()) {
        f = f.e;
      } else {
        f = f.d;
      } 
      f1.a("warmingUp", f);
      f1.k();
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("warming up takes: ");
      stringBuilder1.append(TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - l));
      return;
    } finally {
      Exception exception = null;
      Log.e("RNKeychainManager", "warming up failed!", exception);
    } 
  }
  
  private boolean isBiometricAuthAvailable() {
    return (this.supportWeak && !b.f((Context)getReactApplicationContext())) ? false : (!(!this.supportWeak && !b.e((Context)getReactApplicationContext())));
  }
  
  private void setSupportWeak(ReadableMap paramReadableMap) {
    this.supportWeak = false;
    if (paramReadableMap != null && paramReadableMap.hasKey("supportWeak"))
      this.supportWeak = paramReadableMap.getBoolean("supportWeak"); 
  }
  
  public static void throwIfEmptyLoginPassword(String paramString1, String paramString2) {
    if (!TextUtils.isEmpty(paramString1) && !TextUtils.isEmpty(paramString2))
      return; 
    throw new b("you passed empty or null username/password");
  }
  
  public static void throwIfInsufficientLevel(e parame, f paramf) {
    if (parame.a().a(paramf))
      return; 
    throw new a(String.format("Cipher Storage is too weak. Required security level is: %s, but only %s is provided", new Object[] { paramf.name(), parame.a().name() }));
  }
  
  public static KeychainModule withWarming(ReactApplicationContext paramReactApplicationContext) {
    KeychainModule keychainModule = new KeychainModule(paramReactApplicationContext);
    keychainModule.getClass();
    Thread thread = new Thread(new a(keychainModule), "keychain-warming-up");
    thread.setDaemon(true);
    thread.start();
    return keychainModule;
  }
  
  @ReactMethod
  public void getAllGenericPasswordServices(Promise paramPromise) {
    try {
      paramPromise.resolve(Arguments.makeNativeArray(doGetAllGenericPasswordServices().toArray()));
      return;
    } catch (c c) {
      paramPromise.reject("E_KEYSTORE_ACCESS_ERROR", (Throwable)c);
      return;
    } 
  }
  
  e getCipherStorageByName(String paramString) {
    return this.cipherStorageMap.get(paramString);
  }
  
  e getCipherStorageForCurrentAPILevel() {
    return getCipherStorageForCurrentAPILevel(true);
  }
  
  e getCipherStorageForCurrentAPILevel(boolean paramBoolean) {
    boolean bool;
    int i = Build.VERSION.SDK_INT;
    if ((isFingerprintAuthAvailable() || isFaceAuthAvailable() || isIrisAuthAvailable()) && paramBoolean) {
      bool = true;
    } else {
      bool = false;
    } 
    e e1 = null;
    for (e e2 : this.cipherStorageMap.values()) {
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("Probe cipher storage: ");
      stringBuilder1.append(e2.getClass().getSimpleName());
      Log.d("RNKeychainManager", stringBuilder1.toString());
      int j = e2.e();
      int k = e2.d();
      if (j <= i) {
        j = 1;
      } else {
        j = 0;
      } 
      if (j == 0 || (e1 != null && k < e1.d()) || (e2.b() && !bool))
        continue; 
      e1 = e2;
    } 
    if (e1 != null) {
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("Selected storage: ");
      stringBuilder1.append(e1.getClass().getSimpleName());
      Log.d("RNKeychainManager", stringBuilder1.toString());
      return e1;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Unsupported Android SDK ");
    stringBuilder.append(Build.VERSION.SDK_INT);
    a a = new a(stringBuilder.toString());
    throw a;
  }
  
  public Map<String, Object> getConstants() {
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    hashMap.put(f.c.a(), f.c.name());
    hashMap.put(f.d.a(), f.d.name());
    hashMap.put(f.e.a(), f.e.name());
    return (Map)hashMap;
  }
  
  protected void getGenericPassword(String paramString, ReadableMap paramReadableMap, Promise paramPromise) {
    String str;
    try {
      StringBuilder stringBuilder;
      setSupportWeak(paramReadableMap);
      e.a a = this.prefsStorage.a(paramString);
      if (a == null) {
        stringBuilder = new StringBuilder();
        stringBuilder.append("No entry found for service: ");
        stringBuilder.append(paramString);
        return;
      } 
      e e1 = getCipherStorageForCurrentAPILevel(getUseBiometry(getAccessControlOrDefault((ReadableMap)stringBuilder)));
      e.c c = decryptCredentials(paramString, e1, a, getSecurityRulesOrDefault((ReadableMap)stringBuilder), getPromptInfo((ReadableMap)stringBuilder));
      WritableMap writableMap = Arguments.createMap();
      writableMap.putString("service", paramString);
      writableMap.putString("username", (String)((e.a)c).a);
      writableMap.putString("password", (String)((e.a)c).b);
      return;
    } catch (c c) {
    
    } catch (a a) {
    
    } finally {
      paramString = null;
      Log.e("RNKeychainManager", paramString.getMessage(), (Throwable)paramString);
    } 
    paramPromise.reject(str, (Throwable)paramString);
  }
  
  @ReactMethod
  public void getGenericPasswordForOptions(ReadableMap paramReadableMap, Promise paramPromise) {
    getGenericPassword(getServiceOrDefault(paramReadableMap), paramReadableMap, paramPromise);
  }
  
  protected d getInteractiveHandler(e parame, BiometricPrompt.d paramd) {
    return h.a(getReactApplicationContext(), parame, paramd);
  }
  
  @ReactMethod
  public void getInternetCredentialsForServer(String paramString, ReadableMap paramReadableMap, Promise paramPromise) {
    getGenericPassword(paramString, paramReadableMap, paramPromise);
  }
  
  public String getName() {
    return "RNKeychainManager";
  }
  
  @ReactMethod
  public void getSecurityLevel(ReadableMap paramReadableMap, Promise paramPromise) {
    paramPromise.resolve(getSecurityLevel(getUseBiometry(getAccessControlOrDefault(paramReadableMap))).name());
  }
  
  @ReactMethod
  public void getSupportedBiometryType(Promise paramPromise) {
    String str;
    Exception exception;
    try {
      boolean bool = isBiometricAuthAvailable();
      str = null;
      return;
    } catch (Exception null) {
    
    } finally {
      exception = null;
      Log.e("RNKeychainManager", exception.getMessage(), exception);
    } 
    paramPromise.reject(str, exception);
  }
  
  @ReactMethod
  public void hasInternetCredentialsForServer(String paramString, Promise paramPromise) {
    StringBuilder stringBuilder;
    paramString = getAliasOrDefault(paramString);
    e.a a = this.prefsStorage.a(paramString);
    if (a == null) {
      stringBuilder = new StringBuilder();
      stringBuilder.append("No entry found for service: ");
      stringBuilder.append(paramString);
      Log.e("RNKeychainManager", stringBuilder.toString());
      paramPromise.resolve(Boolean.valueOf(false));
      return;
    } 
    WritableMap writableMap = Arguments.createMap();
    writableMap.putString("service", paramString);
    writableMap.putString("storage", ((e.a)stringBuilder).c);
    paramPromise.resolve(writableMap);
  }
  
  boolean isFaceAuthAvailable() {
    return this.supportWeak ? ((b.f((Context)getReactApplicationContext()) && b.a((Context)getReactApplicationContext()))) : ((b.e((Context)getReactApplicationContext()) && b.a((Context)getReactApplicationContext())));
  }
  
  boolean isFingerprintAuthAvailable() {
    return this.supportWeak ? ((b.f((Context)getReactApplicationContext()) && b.b((Context)getReactApplicationContext()))) : ((b.e((Context)getReactApplicationContext()) && b.b((Context)getReactApplicationContext())));
  }
  
  boolean isIrisAuthAvailable() {
    return this.supportWeak ? ((b.f((Context)getReactApplicationContext()) && b.c((Context)getReactApplicationContext()))) : ((b.e((Context)getReactApplicationContext()) && b.c((Context)getReactApplicationContext())));
  }
  
  boolean isSecureHardwareAvailable() {
    try {
      return getCipherStorageForCurrentAPILevel().f();
    } catch (a a) {
      return false;
    } 
  }
  
  @ReactMethod
  public void isSensorAvailable(Promise paramPromise) {
    try {
      WritableMap writableMap;
      int i = Build.VERSION.SDK_INT;
      if (i >= 23) {
        i = e.a((Context)getReactApplicationContext()).a();
        if (i == 0) {
          writableMap = Arguments.createMap();
          writableMap.putBoolean("available", true);
        } else {
          String str;
          WritableMap writableMap1 = Arguments.createMap();
          writableMap1.putBoolean("available", false);
          if (i != 1) {
            if (i != 11) {
              if (i != 12)
                paramPromise.resolve(writableMap1); 
              str = "BIOMETRIC_ERROR_NO_HARDWARE";
            } else {
              str = "BIOMETRIC_ERROR_NONE_ENROLLED";
            } 
          } else {
            str = "BIOMETRIC_ERROR_HW_UNAVAILABLE";
          } 
          writableMap1.putString("error", str);
          paramPromise.resolve(writableMap1);
        } 
      } else {
        writableMap = Arguments.createMap();
        writableMap.putBoolean("available", false);
        writableMap.putString("error", "Unsupported android version");
      } 
      paramPromise.resolve(writableMap);
      return;
    } catch (Exception exception) {
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("Error detecting biometrics availability: ");
      stringBuilder1.append(exception.getMessage());
      String str = stringBuilder1.toString();
      StringBuilder stringBuilder2 = new StringBuilder();
      stringBuilder2.append("Error detecting biometrics availability: ");
      stringBuilder2.append(exception.getMessage());
      paramPromise.reject(str, stringBuilder2.toString());
      return;
    } 
  }
  
  void migrateCipherStorage(String paramString, e parame1, e parame2, e.c paramc) {
    e.d d = parame1.a(paramString, (String)((e.a)paramc).a, (String)((e.a)paramc).b, paramc.a());
    this.prefsStorage.a(paramString, d);
    parame2.a(paramString);
  }
  
  protected void resetGenericPassword(String paramString, Promise paramPromise) {
    Exception exception;
    try {
      e.a a = this.prefsStorage.a(paramString);
      if (a != null) {
        e e1 = getCipherStorageByName(a.c);
        if (e1 != null)
          e1.a(paramString); 
      } 
      return;
    } catch (c c) {
    
    } finally {
      exception = null;
      Log.e("RNKeychainManager", exception.getMessage(), exception);
    } 
    paramPromise.reject(paramString, exception);
  }
  
  @ReactMethod
  public void resetGenericPasswordForOptions(ReadableMap paramReadableMap, Promise paramPromise) {
    resetGenericPassword(getServiceOrDefault(paramReadableMap), paramPromise);
  }
  
  @ReactMethod
  public void resetInternetCredentialsForServer(String paramString, Promise paramPromise) {
    resetGenericPassword(paramString, paramPromise);
  }
  
  protected void setGenericPassword(String paramString1, String paramString2, String paramString3, ReadableMap paramReadableMap, Promise paramPromise) {
    try {
      throwIfEmptyLoginPassword(paramString2, paramString3);
      setSupportWeak(paramReadableMap);
      f f = getSecurityLevelOrDefault(paramReadableMap);
      e e1 = getSelectedStorage(paramReadableMap);
      throwIfInsufficientLevel(e1, f);
      e.d d = e1.a(paramString1, paramString2, paramString3, f);
      this.prefsStorage.a(paramString1, d);
      WritableMap writableMap = Arguments.createMap();
      writableMap.putString("service", paramString1);
      return;
    } catch (b b) {
    
    } catch (a a) {
    
    } finally {
      paramString1 = null;
      Log.e("RNKeychainManager", paramString1.getMessage(), (Throwable)paramString1);
    } 
    paramPromise.reject(paramString2, (Throwable)paramString1);
  }
  
  @ReactMethod
  public void setGenericPasswordForOptions(ReadableMap paramReadableMap, String paramString1, String paramString2, Promise paramPromise) {
    setGenericPassword(getServiceOrDefault(paramReadableMap), paramString1, paramString2, paramReadableMap, paramPromise);
  }
  
  @ReactMethod
  public void setInternetCredentialsForServer(String paramString1, String paramString2, String paramString3, ReadableMap paramReadableMap, Promise paramPromise) {
    setGenericPassword(paramString1, paramString2, paramString3, paramReadableMap, paramPromise);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/oblador/keychain/KeychainModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */