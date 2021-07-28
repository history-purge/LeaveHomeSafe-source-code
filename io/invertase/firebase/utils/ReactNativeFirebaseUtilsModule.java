package io.invertase.firebase.utils;

import android.app.Activity;
import android.content.Context;
import android.content.IntentSender;
import android.os.Build;
import android.os.Environment;
import android.provider.Settings;
import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import e.f.a.e.e.a;
import e.f.a.e.e.d;
import io.invertase.firebase.app.a;
import io.invertase.firebase.common.ReactNativeFirebaseModule;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class ReactNativeFirebaseUtilsModule extends ReactNativeFirebaseModule {
  private static final String FIREBASE_TEST_LAB = "firebase.test.lab";
  
  private static final String KEY_CACHE_DIRECTORY = "CACHES_DIRECTORY";
  
  private static final String KEY_DOCUMENT_DIRECTORY = "DOCUMENT_DIRECTORY";
  
  private static final String KEY_EXTERNAL_DIRECTORY = "EXTERNAL_DIRECTORY";
  
  private static final String KEY_EXT_STORAGE_DIRECTORY = "EXTERNAL_STORAGE_DIRECTORY";
  
  private static final String KEY_LIBRARY_DIRECTORY = "LIBRARY_DIRECTORY";
  
  private static final String KEY_MAIN_BUNDLE = "MAIN_BUNDLE";
  
  private static final String KEY_MOVIES_DIRECTORY = "MOVIES_DIRECTORY";
  
  private static final String KEY_PICS_DIRECTORY = "PICTURES_DIRECTORY";
  
  private static final String KEY_TEMP_DIRECTORY = "TEMP_DIRECTORY";
  
  private static final String TAG = "Utils";
  
  public ReactNativeFirebaseUtilsModule(ReactApplicationContext paramReactApplicationContext) {
    super(paramReactApplicationContext, "Utils");
  }
  
  private WritableMap getPlayServicesStatusMap() {
    WritableMap writableMap = Arguments.createMap();
    d d = d.a();
    int i = d.a((Context)getContext());
    writableMap.putInt("status", i);
    if (i == 0) {
      writableMap.putBoolean("isAvailable", true);
      return writableMap;
    } 
    writableMap.putBoolean("isAvailable", false);
    writableMap.putString("error", d.a(i));
    writableMap.putBoolean("isUserResolvableError", d.b(i));
    writableMap.putBoolean("hasResolution", (new a(i)).e());
    return writableMap;
  }
  
  private int isGooglePlayServicesAvailable() {
    return d.a().a((Context)getContext());
  }
  
  private static Boolean isRunningInTestLab() {
    return Boolean.valueOf("true".equals(Settings.System.getString(a.a().getContentResolver(), "firebase.test.lab")));
  }
  
  @ReactMethod
  public void androidGetPlayServicesStatus(Promise paramPromise) {
    paramPromise.resolve(getPlayServicesStatusMap());
  }
  
  @ReactMethod
  public void androidMakePlayServicesAvailable() {
    if (isGooglePlayServicesAvailable() != 0) {
      Activity activity = getActivity();
      if (activity != null)
        d.a().a(activity); 
    } 
  }
  
  @ReactMethod
  public void androidPromptForPlayServices() {
    int i = isGooglePlayServicesAvailable();
    d d = d.a();
    if (i != 0 && d.b(i)) {
      Activity activity = getActivity();
      if (activity != null)
        d.a(activity, i, i).show(); 
    } 
  }
  
  @ReactMethod
  public void androidResolutionForPlayServices() {
    int i = isGooglePlayServicesAvailable();
    a a = new a(i);
    if (!a.r() && a.e()) {
      Activity activity = getActivity();
      if (activity != null)
        try {
          a.a(activity, i);
          return;
        } catch (android.content.IntentSender.SendIntentException sendIntentException) {
          Log.d("Utils", "resolutionForPlayServices", (Throwable)sendIntentException);
        }  
    } 
  }
  
  public Map<String, Object> getConstants() {
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    hashMap.put("isRunningInTestLab", isRunningInTestLab());
    hashMap.put("androidPlayServices", getPlayServicesStatusMap());
    ReactApplicationContext reactApplicationContext = getReactApplicationContext();
    hashMap.put("MAIN_BUNDLE", "");
    hashMap.put("LIBRARY_DIRECTORY", reactApplicationContext.getFilesDir().getAbsolutePath());
    hashMap.put("TEMP_DIRECTORY", reactApplicationContext.getCacheDir().getAbsolutePath());
    hashMap.put("CACHES_DIRECTORY", reactApplicationContext.getCacheDir().getAbsolutePath());
    if (Build.VERSION.SDK_INT >= 19) {
      file = reactApplicationContext.getExternalFilesDir(null);
    } else {
      file = reactApplicationContext.getFilesDir();
    } 
    hashMap.put("DOCUMENT_DIRECTORY", file.getAbsolutePath());
    hashMap.put("PICTURES_DIRECTORY", Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).getAbsolutePath());
    hashMap.put("MOVIES_DIRECTORY", Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES).getAbsolutePath());
    File file = Environment.getExternalStorageDirectory();
    if (file != null)
      hashMap.put("EXTERNAL_STORAGE_DIRECTORY", file.getAbsolutePath()); 
    file = reactApplicationContext.getExternalFilesDir(null);
    if (file != null)
      hashMap.put("EXTERNAL_DIRECTORY", file.getAbsolutePath()); 
    return (Map)hashMap;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/io/invertase/firebase/utils/ReactNativeFirebaseUtilsModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */