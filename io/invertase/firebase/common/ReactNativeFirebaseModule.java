package io.invertase.firebase.common;

import android.app.Activity;
import android.content.Context;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.WritableMap;
import f.a.a.a.a;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ReactNativeFirebaseModule extends ReactContextBaseJavaModule implements a {
  private static Map<String, ExecutorService> executors = new HashMap<String, ExecutorService>();
  
  private String moduleName;
  
  public ReactNativeFirebaseModule(ReactApplicationContext paramReactApplicationContext, String paramString) {
    super(paramReactApplicationContext);
    this.moduleName = paramString;
  }
  
  public static void rejectPromiseWithCodeAndMessage(Promise paramPromise, String paramString1, String paramString2) {
    WritableMap writableMap = Arguments.createMap();
    writableMap.putString("code", paramString1);
    writableMap.putString("message", paramString2);
    paramPromise.reject(paramString1, paramString2, writableMap);
  }
  
  public static void rejectPromiseWithCodeAndMessage(Promise paramPromise, String paramString1, String paramString2, String paramString3) {
    WritableMap writableMap = Arguments.createMap();
    writableMap.putString("code", paramString1);
    writableMap.putString("message", paramString2);
    writableMap.putString("nativeErrorMessage", paramString3);
    paramPromise.reject(paramString1, paramString2, writableMap);
  }
  
  public static void rejectPromiseWithExceptionMap(Promise paramPromise, Exception paramException) {
    paramPromise.reject(paramException, k.a(paramException));
  }
  
  public Activity getActivity() {
    return getCurrentActivity();
  }
  
  public Context getApplicationContext() {
    return getReactApplicationContext().getApplicationContext();
  }
  
  public Map<String, Object> getConstants() {
    return new HashMap<String, Object>();
  }
  
  public ReactContext getContext() {
    return (ReactContext)getReactApplicationContext();
  }
  
  public ExecutorService getExecutor() {
    ExecutorService executorService = executors.get(getName());
    if (executorService != null)
      return executorService; 
    executorService = Executors.newSingleThreadExecutor();
    executors.put(getName(), executorService);
    return executorService;
  }
  
  public String getName() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("RNFB");
    stringBuilder.append(this.moduleName);
    stringBuilder.append("Module");
    return stringBuilder.toString();
  }
  
  public void initialize() {
    super.initialize();
  }
  
  public void onCatalystInstanceDestroy() {
    ExecutorService executorService = executors.get(getName());
    if (executorService != null) {
      executorService.shutdownNow();
      executors.remove(getName());
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/io/invertase/firebase/common/ReactNativeFirebaseModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */