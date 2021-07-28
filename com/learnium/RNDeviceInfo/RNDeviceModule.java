package com.learnium.RNDeviceInfo;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.FeatureInfo;
import android.content.pm.PackageInfo;
import android.hardware.Camera;
import android.hardware.camera2.CameraManager;
import android.location.LocationManager;
import android.media.AudioManager;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.os.StatFs;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.webkit.WebSettings;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.learnium.RNDeviceInfo.d.a;
import com.learnium.RNDeviceInfo.d.b;
import e.e.o.d0.a.a;
import java.io.PrintStream;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

@a(name = "RNDeviceInfo")
public class RNDeviceModule extends ReactContextBaseJavaModule {
  private static String BATTERY_LEVEL = "batteryLevel";
  
  private static String BATTERY_STATE = "batteryState";
  
  private static String LOW_POWER_MODE = "lowPowerMode";
  
  public static final String NAME = "RNDeviceInfo";
  
  private final a deviceIdResolver;
  
  private final b deviceTypeResolver;
  
  private BroadcastReceiver headphoneConnectionReceiver;
  
  private c installReferrerClient;
  
  private double mLastBatteryLevel = -1.0D;
  
  private String mLastBatteryState = "";
  
  private boolean mLastPowerSaveState = false;
  
  private BroadcastReceiver receiver;
  
  public RNDeviceModule(ReactApplicationContext paramReactApplicationContext) {
    super(paramReactApplicationContext);
    this.deviceTypeResolver = new b((Context)paramReactApplicationContext);
    this.deviceIdResolver = new a((Context)paramReactApplicationContext);
    this.installReferrerClient = new c(paramReactApplicationContext.getBaseContext());
  }
  
  private long getBlockSize(StatFs paramStatFs, Boolean paramBoolean) {
    return paramBoolean.booleanValue() ? paramStatFs.getBlockSizeLong() : paramStatFs.getBlockSize();
  }
  
  private BigInteger getDirTotalCapacity(StatFs paramStatFs) {
    boolean bool;
    long l1;
    long l2;
    if (Build.VERSION.SDK_INT >= 18) {
      bool = true;
    } else {
      bool = false;
    } 
    if (bool) {
      l1 = paramStatFs.getBlockCountLong();
    } else {
      l1 = paramStatFs.getBlockCount();
    } 
    if (bool) {
      l2 = paramStatFs.getBlockSizeLong();
    } else {
      l2 = paramStatFs.getBlockSize();
    } 
    return BigInteger.valueOf(l1).multiply(BigInteger.valueOf(l2));
  }
  
  private PackageInfo getPackageInfo() {
    return getReactApplicationContext().getPackageManager().getPackageInfo(getReactApplicationContext().getPackageName(), 0);
  }
  
  private WritableMap getPowerStateFromIntent(Intent paramIntent) {
    String str;
    if (paramIntent == null)
      return null; 
    int i = paramIntent.getIntExtra("level", -1);
    int j = paramIntent.getIntExtra("scale", -1);
    int k = paramIntent.getIntExtra("plugged", -1);
    int m = paramIntent.getIntExtra("status", -1);
    float f = i / j;
    if (k == 0) {
      str = "unplugged";
    } else if (m == 2) {
      str = "charging";
    } else if (m == 5) {
      str = "full";
    } else {
      str = "unknown";
    } 
    PowerManager powerManager = (PowerManager)getReactApplicationContext().getSystemService("power");
    boolean bool = false;
    if (Build.VERSION.SDK_INT >= 21)
      bool = powerManager.isPowerSaveMode(); 
    WritableMap writableMap = Arguments.createMap();
    writableMap.putString(BATTERY_STATE, str);
    writableMap.putDouble(BATTERY_LEVEL, f);
    writableMap.putBoolean(LOW_POWER_MODE, bool);
    return writableMap;
  }
  
  private long getTotalAvailableBlocks(StatFs paramStatFs, Boolean paramBoolean) {
    return paramBoolean.booleanValue() ? paramStatFs.getAvailableBlocksLong() : paramStatFs.getAvailableBlocks();
  }
  
  @SuppressLint({"MissingPermission"})
  private WifiInfo getWifiInfo() {
    WifiManager wifiManager = (WifiManager)getReactApplicationContext().getApplicationContext().getSystemService("wifi");
    return (wifiManager != null) ? wifiManager.getConnectionInfo() : null;
  }
  
  private void initializeHeadphoneConnectionReceiver() {
    IntentFilter intentFilter = new IntentFilter();
    intentFilter.addAction("android.intent.action.HEADSET_PLUG");
    intentFilter.addAction("android.media.ACTION_SCO_AUDIO_STATE_UPDATED");
    this.headphoneConnectionReceiver = new b(this);
    getReactApplicationContext().registerReceiver(this.headphoneConnectionReceiver, intentFilter);
  }
  
  private void sendEvent(ReactContext paramReactContext, String paramString, Object paramObject) {
    ((DeviceEventManagerModule.RCTDeviceEventEmitter)paramReactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(paramString, paramObject);
  }
  
  @ReactMethod
  public void getAndroidId(Promise paramPromise) {
    paramPromise.resolve(getAndroidIdSync());
  }
  
  @ReactMethod(isBlockingSynchronousMethod = true)
  @SuppressLint({"HardwareIds"})
  public String getAndroidIdSync() {
    return getUniqueIdSync();
  }
  
  @ReactMethod
  public void getApiLevel(Promise paramPromise) {
    paramPromise.resolve(Integer.valueOf(getApiLevelSync()));
  }
  
  @ReactMethod(isBlockingSynchronousMethod = true)
  public int getApiLevelSync() {
    return Build.VERSION.SDK_INT;
  }
  
  @ReactMethod
  public void getAvailableLocationProviders(Promise paramPromise) {
    paramPromise.resolve(getAvailableLocationProvidersSync());
  }
  
  @ReactMethod(isBlockingSynchronousMethod = true)
  public WritableMap getAvailableLocationProvidersSync() {
    LocationManager locationManager = (LocationManager)getReactApplicationContext().getSystemService("location");
    WritableMap writableMap = Arguments.createMap();
    try {
      for (String str : locationManager.getProviders(false))
        writableMap.putBoolean(str, locationManager.isProviderEnabled(str)); 
    } catch (Exception exception) {
      System.err.println("Unable to get location providers. LocationManager was null");
    } 
    return writableMap;
  }
  
  @ReactMethod
  public void getBaseOs(Promise paramPromise) {
    paramPromise.resolve(getBaseOsSync());
  }
  
  @ReactMethod(isBlockingSynchronousMethod = true)
  public String getBaseOsSync() {
    return (Build.VERSION.SDK_INT >= 23) ? Build.VERSION.BASE_OS : "unknown";
  }
  
  @ReactMethod
  public void getBatteryLevel(Promise paramPromise) {
    paramPromise.resolve(Double.valueOf(getBatteryLevelSync()));
  }
  
  @ReactMethod(isBlockingSynchronousMethod = true)
  public double getBatteryLevelSync() {
    WritableMap writableMap = getPowerStateFromIntent(getReactApplicationContext().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED")));
    return (writableMap == null) ? 0.0D : writableMap.getDouble(BATTERY_LEVEL);
  }
  
  @ReactMethod
  public void getBootloader(Promise paramPromise) {
    paramPromise.resolve(getBootloaderSync());
  }
  
  @ReactMethod(isBlockingSynchronousMethod = true)
  public String getBootloaderSync() {
    return Build.BOOTLOADER;
  }
  
  @ReactMethod
  public void getBuildId(Promise paramPromise) {
    paramPromise.resolve(getBuildIdSync());
  }
  
  @ReactMethod(isBlockingSynchronousMethod = true)
  public String getBuildIdSync() {
    return Build.ID;
  }
  
  @ReactMethod
  public void getCarrier(Promise paramPromise) {
    paramPromise.resolve(getCarrierSync());
  }
  
  @ReactMethod(isBlockingSynchronousMethod = true)
  public String getCarrierSync() {
    TelephonyManager telephonyManager = (TelephonyManager)getReactApplicationContext().getSystemService("phone");
    if (telephonyManager != null)
      return telephonyManager.getNetworkOperatorName(); 
    System.err.println("Unable to get network operator name. TelephonyManager was null");
    return "unknown";
  }
  
  @ReactMethod
  public void getCodename(Promise paramPromise) {
    paramPromise.resolve(getCodenameSync());
  }
  
  @ReactMethod(isBlockingSynchronousMethod = true)
  public String getCodenameSync() {
    return Build.VERSION.CODENAME;
  }
  
  public Map<String, Object> getConstants() {
    String str2;
    String str3;
    String str1 = "unknown";
    try {
      String str = (getPackageInfo()).versionName;
      str3 = Integer.toString((getPackageInfo()).versionCode);
      str2 = getReactApplicationContext().getApplicationInfo().loadLabel(getReactApplicationContext().getPackageManager()).toString();
      str1 = str;
    } catch (Exception exception) {
      str2 = "unknown";
      str3 = str2;
    } 
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    hashMap.put("uniqueId", getUniqueIdSync());
    hashMap.put("deviceId", Build.BOARD);
    hashMap.put("bundleId", getReactApplicationContext().getPackageName());
    hashMap.put("systemName", "Android");
    hashMap.put("systemVersion", Build.VERSION.RELEASE);
    hashMap.put("appVersion", str1);
    hashMap.put("buildNumber", str3);
    hashMap.put("isTablet", Boolean.valueOf(this.deviceTypeResolver.b()));
    hashMap.put("appName", str2);
    hashMap.put("brand", Build.BRAND);
    hashMap.put("model", Build.MODEL);
    hashMap.put("deviceType", this.deviceTypeResolver.a().a());
    return (Map)hashMap;
  }
  
  @ReactMethod
  public void getDevice(Promise paramPromise) {
    paramPromise.resolve(getDeviceSync());
  }
  
  @ReactMethod
  public void getDeviceName(Promise paramPromise) {
    paramPromise.resolve(getDeviceNameSync());
  }
  
  @ReactMethod(isBlockingSynchronousMethod = true)
  public String getDeviceNameSync() {
    try {
      String str = Settings.Secure.getString(getReactApplicationContext().getContentResolver(), "bluetooth_name");
      if (str != null)
        return str; 
      if (Build.VERSION.SDK_INT >= 25) {
        str = Settings.Global.getString(getReactApplicationContext().getContentResolver(), "device_name");
        if (str != null)
          return str; 
      } 
    } catch (Exception exception) {}
    return "unknown";
  }
  
  @ReactMethod(isBlockingSynchronousMethod = true)
  public String getDeviceSync() {
    return Build.DEVICE;
  }
  
  @ReactMethod
  public void getDisplay(Promise paramPromise) {
    paramPromise.resolve(getDisplaySync());
  }
  
  @ReactMethod(isBlockingSynchronousMethod = true)
  public String getDisplaySync() {
    return Build.DISPLAY;
  }
  
  @ReactMethod
  public void getFingerprint(Promise paramPromise) {
    paramPromise.resolve(getFingerprintSync());
  }
  
  @ReactMethod(isBlockingSynchronousMethod = true)
  public String getFingerprintSync() {
    return Build.FINGERPRINT;
  }
  
  @ReactMethod
  public void getFirstInstallTime(Promise paramPromise) {
    paramPromise.resolve(Double.valueOf(getFirstInstallTimeSync()));
  }
  
  @ReactMethod(isBlockingSynchronousMethod = true)
  public double getFirstInstallTimeSync() {
    try {
      long l = (getPackageInfo()).firstInstallTime;
      return l;
    } catch (Exception exception) {
      return -1.0D;
    } 
  }
  
  @ReactMethod
  public void getFontScale(Promise paramPromise) {
    paramPromise.resolve(Float.valueOf(getFontScaleSync()));
  }
  
  @ReactMethod(isBlockingSynchronousMethod = true)
  public float getFontScaleSync() {
    return (getReactApplicationContext().getResources().getConfiguration()).fontScale;
  }
  
  @ReactMethod
  public void getFreeDiskStorage(Promise paramPromise) {
    paramPromise.resolve(Double.valueOf(getFreeDiskStorageSync()));
  }
  
  @ReactMethod
  public void getFreeDiskStorageOld(Promise paramPromise) {
    paramPromise.resolve(Double.valueOf(getFreeDiskStorageOldSync()));
  }
  
  @ReactMethod(isBlockingSynchronousMethod = true)
  public double getFreeDiskStorageOldSync() {
    try {
      long l1;
      long l2;
      StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getAbsolutePath());
      if (Build.VERSION.SDK_INT < 18) {
        l1 = statFs.getAvailableBlocks();
        l2 = statFs.getBlockSize();
      } else {
        l1 = statFs.getAvailableBlocksLong();
        l2 = statFs.getBlockSizeLong();
      } 
      return BigInteger.valueOf(l1).multiply(BigInteger.valueOf(l2)).doubleValue();
    } catch (Exception exception) {
      return -1.0D;
    } 
  }
  
  @ReactMethod(isBlockingSynchronousMethod = true)
  public double getFreeDiskStorageSync() {
    StatFs statFs;
    try {
      StatFs statFs1 = new StatFs(Environment.getRootDirectory().getAbsolutePath());
      statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
      if (Build.VERSION.SDK_INT >= 18) {
        boolean bool2 = true;
        Boolean bool3 = Boolean.valueOf(bool2);
        long l3 = getTotalAvailableBlocks(statFs1, bool3);
        long l4 = getBlockSize(statFs1, bool3);
        double d3 = BigInteger.valueOf(l3).multiply(BigInteger.valueOf(l4)).doubleValue();
        l3 = getTotalAvailableBlocks(statFs, bool3);
        l4 = getBlockSize(statFs, bool3);
        double d4 = BigInteger.valueOf(l3).multiply(BigInteger.valueOf(l4)).doubleValue();
        return d3 + d4;
      } 
    } catch (Exception exception) {
      return -1.0D;
    } 
    boolean bool = false;
    Boolean bool1 = Boolean.valueOf(bool);
    long l1 = getTotalAvailableBlocks((StatFs)exception, bool1);
    long l2 = getBlockSize((StatFs)exception, bool1);
    double d1 = BigInteger.valueOf(l1).multiply(BigInteger.valueOf(l2)).doubleValue();
    l1 = getTotalAvailableBlocks(statFs, bool1);
    l2 = getBlockSize(statFs, bool1);
    double d2 = BigInteger.valueOf(l1).multiply(BigInteger.valueOf(l2)).doubleValue();
    return d1 + d2;
  }
  
  @ReactMethod
  public void getHardware(Promise paramPromise) {
    paramPromise.resolve(getHardwareSync());
  }
  
  @ReactMethod(isBlockingSynchronousMethod = true)
  public String getHardwareSync() {
    return Build.HARDWARE;
  }
  
  @ReactMethod
  public void getHost(Promise paramPromise) {
    paramPromise.resolve(getHostSync());
  }
  
  @ReactMethod(isBlockingSynchronousMethod = true)
  public String getHostSync() {
    return Build.HOST;
  }
  
  @ReactMethod
  public void getIncremental(Promise paramPromise) {
    paramPromise.resolve(getIncrementalSync());
  }
  
  @ReactMethod(isBlockingSynchronousMethod = true)
  public String getIncrementalSync() {
    return Build.VERSION.INCREMENTAL;
  }
  
  @ReactMethod
  public void getInstallReferrer(Promise paramPromise) {
    paramPromise.resolve(getInstallReferrerSync());
  }
  
  @ReactMethod(isBlockingSynchronousMethod = true)
  public String getInstallReferrerSync() {
    return getReactApplicationContext().getSharedPreferences("react-native-device-info", 0).getString("installReferrer", "unknown");
  }
  
  @ReactMethod
  public void getInstallerPackageName(Promise paramPromise) {
    paramPromise.resolve(getInstallerPackageNameSync());
  }
  
  @ReactMethod(isBlockingSynchronousMethod = true)
  public String getInstallerPackageNameSync() {
    String str1 = getReactApplicationContext().getPackageName();
    String str2 = getReactApplicationContext().getPackageManager().getInstallerPackageName(str1);
    str1 = str2;
    if (str2 == null)
      str1 = "unknown"; 
    return str1;
  }
  
  @ReactMethod
  public void getInstanceId(Promise paramPromise) {
    paramPromise.resolve(getInstanceIdSync());
  }
  
  @ReactMethod(isBlockingSynchronousMethod = true)
  public String getInstanceIdSync() {
    return this.deviceIdResolver.c();
  }
  
  @ReactMethod
  public void getIpAddress(Promise paramPromise) {
    paramPromise.resolve(getIpAddressSync());
  }
  
  @ReactMethod(isBlockingSynchronousMethod = true)
  public String getIpAddressSync() {
    try {
      return InetAddress.getByAddress(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(getWifiInfo().getIpAddress()).array()).getHostAddress();
    } catch (Exception exception) {
      return "unknown";
    } 
  }
  
  @ReactMethod
  public void getLastUpdateTime(Promise paramPromise) {
    paramPromise.resolve(Double.valueOf(getLastUpdateTimeSync()));
  }
  
  @ReactMethod(isBlockingSynchronousMethod = true)
  public double getLastUpdateTimeSync() {
    try {
      long l = (getPackageInfo()).lastUpdateTime;
      return l;
    } catch (Exception exception) {
      return -1.0D;
    } 
  }
  
  @ReactMethod
  public void getMacAddress(Promise paramPromise) {
    paramPromise.resolve(getMacAddressSync());
  }
  
  @ReactMethod(isBlockingSynchronousMethod = true)
  @SuppressLint({"HardwareIds"})
  public String getMacAddressSync() {
    String str1;
    byte[] arrayOfByte;
    WifiInfo wifiInfo = getWifiInfo();
    if (wifiInfo != null) {
      str1 = wifiInfo.getMacAddress();
    } else {
      str1 = "";
    } 
    String str2 = str1;
    if (getReactApplicationContext().checkCallingOrSelfPermission("android.permission.INTERNET") == 0) {
      String str = str1;
      try {
        Iterator<NetworkInterface> iterator = Collections.<NetworkInterface>list(NetworkInterface.getNetworkInterfaces()).iterator();
        while (true) {
          str2 = str1;
          str = str1;
          if (iterator.hasNext()) {
            str = str1;
            NetworkInterface networkInterface = iterator.next();
            str = str1;
            if (!networkInterface.getName().equalsIgnoreCase("wlan0"))
              continue; 
            str = str1;
            arrayOfByte = networkInterface.getHardwareAddress();
            if (arrayOfByte == null) {
              str1 = "";
              continue;
            } 
            str = str1;
            StringBuilder stringBuilder = new StringBuilder();
            str = str1;
            int j = arrayOfByte.length;
            for (int i = 0; i < j; i++) {
              str = str1;
              stringBuilder.append(String.format("%02X:", new Object[] { Byte.valueOf(arrayOfByte[i]) }));
            } 
            str = str1;
            if (stringBuilder.length() > 0) {
              str = str1;
              stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            } 
            str = str1;
            str1 = stringBuilder.toString();
            continue;
          } 
          break;
        } 
        return (String)arrayOfByte;
      } catch (Exception exception) {
        return str;
      } 
    } 
    return (String)arrayOfByte;
  }
  
  @ReactMethod
  public void getMaxMemory(Promise paramPromise) {
    paramPromise.resolve(Double.valueOf(getMaxMemorySync()));
  }
  
  @ReactMethod(isBlockingSynchronousMethod = true)
  public double getMaxMemorySync() {
    return Runtime.getRuntime().maxMemory();
  }
  
  public String getName() {
    return "RNDeviceInfo";
  }
  
  @ReactMethod
  public void getPowerState(Promise paramPromise) {
    paramPromise.resolve(getPowerStateSync());
  }
  
  @ReactMethod(isBlockingSynchronousMethod = true)
  public WritableMap getPowerStateSync() {
    return getPowerStateFromIntent(getReactApplicationContext().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED")));
  }
  
  @ReactMethod
  public void getPreviewSdkInt(Promise paramPromise) {
    paramPromise.resolve(getPreviewSdkIntSync());
  }
  
  @ReactMethod(isBlockingSynchronousMethod = true)
  public String getPreviewSdkIntSync() {
    return (Build.VERSION.SDK_INT >= 23) ? Integer.toString(Build.VERSION.PREVIEW_SDK_INT) : "unknown";
  }
  
  @ReactMethod
  public void getProduct(Promise paramPromise) {
    paramPromise.resolve(getProductSync());
  }
  
  @ReactMethod(isBlockingSynchronousMethod = true)
  public String getProductSync() {
    return Build.PRODUCT;
  }
  
  @ReactMethod
  public void getSecurityPatch(Promise paramPromise) {
    paramPromise.resolve(getSecurityPatchSync());
  }
  
  @ReactMethod(isBlockingSynchronousMethod = true)
  public String getSecurityPatchSync() {
    return (Build.VERSION.SDK_INT >= 23) ? Build.VERSION.SECURITY_PATCH : "unknown";
  }
  
  @ReactMethod
  public void getSerialNumber(Promise paramPromise) {
    paramPromise.resolve(getSerialNumberSync());
  }
  
  @ReactMethod(isBlockingSynchronousMethod = true)
  @SuppressLint({"HardwareIds", "MissingPermission"})
  public String getSerialNumberSync() {
    try {
      if (Build.VERSION.SDK_INT >= 26 && getReactApplicationContext().checkCallingOrSelfPermission("android.permission.READ_PHONE_STATE") == 0)
        return Build.getSerial(); 
    } catch (Exception exception) {
      PrintStream printStream = System.err;
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("getSerialNumber failed, it probably should not be used: ");
      stringBuilder.append(exception.getMessage());
      printStream.println(stringBuilder.toString());
    } 
    return "unknown";
  }
  
  @ReactMethod
  public void getSupported32BitAbis(Promise paramPromise) {
    paramPromise.resolve(getSupported32BitAbisSync());
  }
  
  @ReactMethod(isBlockingSynchronousMethod = true)
  public WritableArray getSupported32BitAbisSync() {
    WritableNativeArray writableNativeArray = new WritableNativeArray();
    if (Build.VERSION.SDK_INT >= 21) {
      String[] arrayOfString = Build.SUPPORTED_32_BIT_ABIS;
      int j = arrayOfString.length;
      for (int i = 0; i < j; i++)
        writableNativeArray.pushString(arrayOfString[i]); 
    } 
    return (WritableArray)writableNativeArray;
  }
  
  @ReactMethod
  public void getSupported64BitAbis(Promise paramPromise) {
    paramPromise.resolve(getSupported64BitAbisSync());
  }
  
  @ReactMethod(isBlockingSynchronousMethod = true)
  public WritableArray getSupported64BitAbisSync() {
    WritableNativeArray writableNativeArray = new WritableNativeArray();
    if (Build.VERSION.SDK_INT >= 21) {
      String[] arrayOfString = Build.SUPPORTED_64_BIT_ABIS;
      int j = arrayOfString.length;
      for (int i = 0; i < j; i++)
        writableNativeArray.pushString(arrayOfString[i]); 
    } 
    return (WritableArray)writableNativeArray;
  }
  
  @ReactMethod
  public void getSupportedAbis(Promise paramPromise) {
    paramPromise.resolve(getSupportedAbisSync());
  }
  
  @ReactMethod(isBlockingSynchronousMethod = true)
  public WritableArray getSupportedAbisSync() {
    WritableNativeArray writableNativeArray = new WritableNativeArray();
    if (Build.VERSION.SDK_INT >= 21) {
      String[] arrayOfString = Build.SUPPORTED_ABIS;
      int j = arrayOfString.length;
      for (int i = 0; i < j; i++)
        writableNativeArray.pushString(arrayOfString[i]); 
    } else {
      writableNativeArray.pushString(Build.CPU_ABI);
    } 
    return (WritableArray)writableNativeArray;
  }
  
  @ReactMethod
  public void getSystemAvailableFeatures(Promise paramPromise) {
    paramPromise.resolve(getSystemAvailableFeaturesSync());
  }
  
  @ReactMethod(isBlockingSynchronousMethod = true)
  public WritableArray getSystemAvailableFeaturesSync() {
    FeatureInfo[] arrayOfFeatureInfo = getReactApplicationContext().getPackageManager().getSystemAvailableFeatures();
    WritableArray writableArray = Arguments.createArray();
    int j = arrayOfFeatureInfo.length;
    for (int i = 0; i < j; i++) {
      String str = (arrayOfFeatureInfo[i]).name;
      if (str != null)
        writableArray.pushString(str); 
    } 
    return writableArray;
  }
  
  @ReactMethod
  public void getSystemManufacturer(Promise paramPromise) {
    paramPromise.resolve(getSystemManufacturerSync());
  }
  
  @ReactMethod(isBlockingSynchronousMethod = true)
  public String getSystemManufacturerSync() {
    return Build.MANUFACTURER;
  }
  
  @ReactMethod
  public void getTags(Promise paramPromise) {
    paramPromise.resolve(getTagsSync());
  }
  
  @ReactMethod(isBlockingSynchronousMethod = true)
  public String getTagsSync() {
    return Build.TAGS;
  }
  
  @ReactMethod
  public void getTotalDiskCapacity(Promise paramPromise) {
    paramPromise.resolve(Double.valueOf(getTotalDiskCapacitySync()));
  }
  
  @ReactMethod
  public void getTotalDiskCapacityOld(Promise paramPromise) {
    paramPromise.resolve(Double.valueOf(getTotalDiskCapacityOldSync()));
  }
  
  @ReactMethod(isBlockingSynchronousMethod = true)
  @Deprecated
  public double getTotalDiskCapacityOldSync() {
    try {
      StatFs statFs = new StatFs(Environment.getRootDirectory().getAbsolutePath());
      return BigInteger.valueOf(statFs.getBlockCount()).multiply(BigInteger.valueOf(statFs.getBlockSize())).doubleValue();
    } catch (Exception exception) {
      return -1.0D;
    } 
  }
  
  @ReactMethod(isBlockingSynchronousMethod = true)
  public double getTotalDiskCapacitySync() {
    try {
      StatFs statFs1 = new StatFs(Environment.getRootDirectory().getAbsolutePath());
      StatFs statFs2 = new StatFs(Environment.getDataDirectory().getAbsolutePath());
      return getDirTotalCapacity(statFs1).add(getDirTotalCapacity(statFs2)).doubleValue();
    } catch (Exception exception) {
      return -1.0D;
    } 
  }
  
  @ReactMethod
  public void getTotalMemory(Promise paramPromise) {
    paramPromise.resolve(Double.valueOf(getTotalMemorySync()));
  }
  
  @ReactMethod(isBlockingSynchronousMethod = true)
  public double getTotalMemorySync() {
    ActivityManager activityManager = (ActivityManager)getReactApplicationContext().getSystemService("activity");
    ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
    if (activityManager != null) {
      activityManager.getMemoryInfo(memoryInfo);
      return memoryInfo.totalMem;
    } 
    System.err.println("Unable to getMemoryInfo. ActivityManager was null");
    return -1.0D;
  }
  
  @ReactMethod
  public void getType(Promise paramPromise) {
    paramPromise.resolve(getTypeSync());
  }
  
  @ReactMethod(isBlockingSynchronousMethod = true)
  public String getTypeSync() {
    return Build.TYPE;
  }
  
  @ReactMethod(isBlockingSynchronousMethod = true)
  @SuppressLint({"HardwareIds"})
  public String getUniqueIdSync() {
    return Settings.Secure.getString(getReactApplicationContext().getContentResolver(), "android_id");
  }
  
  @ReactMethod
  public void getUsedMemory(Promise paramPromise) {
    paramPromise.resolve(Integer.valueOf(getUsedMemorySync()));
  }
  
  @ReactMethod(isBlockingSynchronousMethod = true)
  public int getUsedMemorySync() {
    Runtime runtime = Runtime.getRuntime();
    return (int)(runtime.totalMemory() - runtime.freeMemory());
  }
  
  @ReactMethod
  public void getUserAgent(Promise paramPromise) {
    paramPromise.resolve(getUserAgentSync());
  }
  
  @ReactMethod(isBlockingSynchronousMethod = true)
  public String getUserAgentSync() {
    try {
      return (Build.VERSION.SDK_INT >= 17) ? WebSettings.getDefaultUserAgent((Context)getReactApplicationContext()) : System.getProperty("http.agent");
    } catch (RuntimeException runtimeException) {
      return System.getProperty("http.agent");
    } 
  }
  
  @ReactMethod
  public void hasSystemFeature(String paramString, Promise paramPromise) {
    paramPromise.resolve(Boolean.valueOf(hasSystemFeatureSync(paramString)));
  }
  
  @ReactMethod(isBlockingSynchronousMethod = true)
  public boolean hasSystemFeatureSync(String paramString) {
    return (paramString == null || paramString.equals("")) ? false : getReactApplicationContext().getPackageManager().hasSystemFeature(paramString);
  }
  
  public void initialize() {
    IntentFilter intentFilter = new IntentFilter();
    intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
    intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
    intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
    if (Build.VERSION.SDK_INT >= 21)
      intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED"); 
    this.receiver = new a(this);
    getReactApplicationContext().registerReceiver(this.receiver, intentFilter);
    initializeHeadphoneConnectionReceiver();
  }
  
  @ReactMethod
  public void isAirplaneMode(Promise paramPromise) {
    paramPromise.resolve(Boolean.valueOf(isAirplaneModeSync()));
  }
  
  @ReactMethod(isBlockingSynchronousMethod = true)
  public boolean isAirplaneModeSync() {
    return (Build.VERSION.SDK_INT < 17) ? ((Settings.System.getInt(getReactApplicationContext().getContentResolver(), "airplane_mode_on", 0) != 0)) : ((Settings.Global.getInt(getReactApplicationContext().getContentResolver(), "airplane_mode_on", 0) != 0));
  }
  
  @ReactMethod
  public void isBatteryCharging(Promise paramPromise) {
    paramPromise.resolve(Boolean.valueOf(isBatteryChargingSync()));
  }
  
  @ReactMethod(isBlockingSynchronousMethod = true)
  public boolean isBatteryChargingSync() {
    boolean bool1;
    IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
    Intent intent = getReactApplicationContext().registerReceiver(null, intentFilter);
    boolean bool2 = false;
    if (intent != null) {
      bool1 = intent.getIntExtra("status", -1);
    } else {
      bool1 = false;
    } 
    if (bool1 == 2)
      bool2 = true; 
    return bool2;
  }
  
  @ReactMethod
  public void isCameraPresent(Promise paramPromise) {
    paramPromise.resolve(Boolean.valueOf(isCameraPresentSync()));
  }
  
  @ReactMethod(isBlockingSynchronousMethod = true)
  public boolean isCameraPresentSync() {
    if (Build.VERSION.SDK_INT >= 21) {
      CameraManager cameraManager = (CameraManager)getReactApplicationContext().getSystemService("camera");
      try {
        int i = (cameraManager.getCameraIdList()).length;
        return (i > 0);
      } catch (Exception exception) {
        return false;
      } 
    } 
    return (Camera.getNumberOfCameras() > 0);
  }
  
  @ReactMethod
  public void isEmulator(Promise paramPromise) {
    paramPromise.resolve(Boolean.valueOf(isEmulatorSync()));
  }
  
  @ReactMethod(isBlockingSynchronousMethod = true)
  @SuppressLint({"HardwareIds"})
  public boolean isEmulatorSync() {
    return (Build.FINGERPRINT.startsWith("generic") || Build.FINGERPRINT.startsWith("unknown") || Build.MODEL.contains("google_sdk") || Build.MODEL.toLowerCase(Locale.ROOT).contains("droid4x") || Build.MODEL.contains("Emulator") || Build.MODEL.contains("Android SDK built for x86") || Build.MANUFACTURER.contains("Genymotion") || Build.HARDWARE.contains("goldfish") || Build.HARDWARE.contains("ranchu") || Build.HARDWARE.contains("vbox86") || Build.PRODUCT.contains("sdk") || Build.PRODUCT.contains("google_sdk") || Build.PRODUCT.contains("sdk_google") || Build.PRODUCT.contains("sdk_x86") || Build.PRODUCT.contains("vbox86p") || Build.PRODUCT.contains("emulator") || Build.PRODUCT.contains("simulator") || Build.BOARD.toLowerCase(Locale.ROOT).contains("nox") || Build.BOOTLOADER.toLowerCase(Locale.ROOT).contains("nox") || Build.HARDWARE.toLowerCase(Locale.ROOT).contains("nox") || Build.PRODUCT.toLowerCase(Locale.ROOT).contains("nox") || Build.SERIAL.toLowerCase(Locale.ROOT).contains("nox") || (Build.BRAND.startsWith("generic") && Build.DEVICE.startsWith("generic")));
  }
  
  @ReactMethod
  public void isHeadphonesConnected(Promise paramPromise) {
    paramPromise.resolve(Boolean.valueOf(isHeadphonesConnectedSync()));
  }
  
  @ReactMethod(isBlockingSynchronousMethod = true)
  public boolean isHeadphonesConnectedSync() {
    AudioManager audioManager = (AudioManager)getReactApplicationContext().getSystemService("audio");
    return (audioManager.isWiredHeadsetOn() || audioManager.isBluetoothA2dpOn());
  }
  
  @ReactMethod
  public void isLocationEnabled(Promise paramPromise) {
    paramPromise.resolve(Boolean.valueOf(isLocationEnabledSync()));
  }
  
  @ReactMethod(isBlockingSynchronousMethod = true)
  public boolean isLocationEnabledSync() {
    int i = Build.VERSION.SDK_INT;
    if (i >= 28) {
      LocationManager locationManager = (LocationManager)getReactApplicationContext().getSystemService("location");
      try {
        return locationManager.isLocationEnabled();
      } catch (Exception exception) {
        System.err.println("Unable to determine if location enabled. LocationManager was null");
        return false;
      } 
    } 
    return (i >= 19) ? ((Settings.Secure.getInt(getReactApplicationContext().getContentResolver(), "location_mode", 0) != 0)) : (TextUtils.isEmpty(Settings.Secure.getString(getReactApplicationContext().getContentResolver(), "location_providers_allowed")) ^ true);
  }
  
  @ReactMethod
  public void isPinOrFingerprintSet(Promise paramPromise) {
    paramPromise.resolve(Boolean.valueOf(isPinOrFingerprintSetSync()));
  }
  
  @ReactMethod(isBlockingSynchronousMethod = true)
  public boolean isPinOrFingerprintSetSync() {
    KeyguardManager keyguardManager = (KeyguardManager)getReactApplicationContext().getSystemService("keyguard");
    if (keyguardManager != null)
      return keyguardManager.isKeyguardSecure(); 
    System.err.println("Unable to determine keyguard status. KeyguardManager was null");
    return false;
  }
  
  public void onCatalystInstanceDestroy() {
    getReactApplicationContext().unregisterReceiver(this.receiver);
    getReactApplicationContext().unregisterReceiver(this.headphoneConnectionReceiver);
  }
  
  class a extends BroadcastReceiver {
    a(RNDeviceModule this$0) {}
    
    public void onReceive(Context param1Context, Intent param1Intent) {
      WritableMap writableMap = this.a.getPowerStateFromIntent(param1Intent);
      if (writableMap == null)
        return; 
      String str = writableMap.getString(RNDeviceModule.BATTERY_STATE);
      Double double_ = Double.valueOf(writableMap.getDouble(RNDeviceModule.BATTERY_LEVEL));
      Boolean bool = Boolean.valueOf(writableMap.getBoolean(RNDeviceModule.LOW_POWER_MODE));
      if (!this.a.mLastBatteryState.equalsIgnoreCase(str) || this.a.mLastPowerSaveState != bool.booleanValue()) {
        RNDeviceModule rNDeviceModule = this.a;
        rNDeviceModule.sendEvent((ReactContext)rNDeviceModule.getReactApplicationContext(), "RNDeviceInfo_powerStateDidChange", str);
        RNDeviceModule.access$402(this.a, str);
        RNDeviceModule.access$502(this.a, bool.booleanValue());
      } 
      if (this.a.mLastBatteryLevel != double_.doubleValue()) {
        RNDeviceModule rNDeviceModule = this.a;
        rNDeviceModule.sendEvent((ReactContext)rNDeviceModule.getReactApplicationContext(), "RNDeviceInfo_batteryLevelDidChange", double_);
        if (double_.doubleValue() <= 0.15D) {
          rNDeviceModule = this.a;
          rNDeviceModule.sendEvent((ReactContext)rNDeviceModule.getReactApplicationContext(), "RNDeviceInfo_batteryLevelIsLow", double_);
        } 
        RNDeviceModule.access$802(this.a, double_.doubleValue());
      } 
    }
  }
  
  class b extends BroadcastReceiver {
    b(RNDeviceModule this$0) {}
    
    public void onReceive(Context param1Context, Intent param1Intent) {
      boolean bool = this.a.isHeadphonesConnectedSync();
      RNDeviceModule rNDeviceModule = this.a;
      rNDeviceModule.sendEvent((ReactContext)rNDeviceModule.getReactApplicationContext(), "RNDeviceInfo_headphoneConnectionDidChange", Boolean.valueOf(bool));
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/learnium/RNDeviceInfo/RNDeviceModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */