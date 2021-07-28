package org.linusu;

import android.util.Base64;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import java.security.SecureRandom;

public class RNGetRandomValuesModule extends ReactContextBaseJavaModule {
  private final ReactApplicationContext reactContext;
  
  public RNGetRandomValuesModule(ReactApplicationContext paramReactApplicationContext) {
    super(paramReactApplicationContext);
    this.reactContext = paramReactApplicationContext;
  }
  
  public String getName() {
    return "RNGetRandomValues";
  }
  
  @ReactMethod(isBlockingSynchronousMethod = true)
  public String getRandomBase64(int paramInt) {
    byte[] arrayOfByte = new byte[paramInt];
    (new SecureRandom()).nextBytes(arrayOfByte);
    return Base64.encodeToString(arrayOfByte, 2);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/org/linusu/RNGetRandomValuesModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */