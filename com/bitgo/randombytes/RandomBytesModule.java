package com.bitgo.randombytes;

import android.util.Base64;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;

class RandomBytesModule extends ReactContextBaseJavaModule {
  private static final String SEED_KEY = "seed";
  
  public RandomBytesModule(ReactApplicationContext paramReactApplicationContext) {
    super(paramReactApplicationContext);
  }
  
  private String getRandomBytes(int paramInt) {
    SecureRandom secureRandom = new SecureRandom();
    byte[] arrayOfByte = new byte[paramInt];
    secureRandom.nextBytes(arrayOfByte);
    return Base64.encodeToString(arrayOfByte, 2);
  }
  
  public Map<String, Object> getConstants() {
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    hashMap.put("seed", getRandomBytes(4096));
    return (Map)hashMap;
  }
  
  public String getName() {
    return "RNRandomBytes";
  }
  
  @ReactMethod
  public void randomBytes(int paramInt, Callback paramCallback) {
    paramCallback.invoke(new Object[] { null, getRandomBytes(paramInt) });
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/bitgo/randombytes/RandomBytesModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */