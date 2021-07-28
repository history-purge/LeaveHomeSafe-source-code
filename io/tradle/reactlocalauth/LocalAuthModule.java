package io.tradle.reactlocalauth;

import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Intent;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.BaseActivityEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;

public class LocalAuthModule extends ReactContextBaseJavaModule {
  private static final int AUTH_REQUEST = 18864;
  
  private static final String E_ACTIVITY_DOES_NOT_EXIST = "E_ACTIVITY_DOES_NOT_EXIST";
  
  private static final String E_AUTH_CANCELLED = "LAErrorUserCancel";
  
  private static final String E_FAILED_TO_SHOW_AUTH = "E_FAILED_TO_SHOW_AUTH";
  
  private static final String E_ONE_REQ_AT_A_TIME = "E_ONE_REQ_AT_A_TIME";
  
  private Promise authPromise;
  
  private final ActivityEventListener mActivityEventListener = (ActivityEventListener)new a(this);
  
  private KeyguardManager mKeyguardManager;
  
  private final ReactApplicationContext reactContext;
  
  public LocalAuthModule(ReactApplicationContext paramReactApplicationContext) {
    super(paramReactApplicationContext);
    this.reactContext = paramReactApplicationContext;
    paramReactApplicationContext.addActivityEventListener(this.mActivityEventListener);
    this.mKeyguardManager = (KeyguardManager)this.reactContext.getSystemService("keyguard");
  }
  
  @ReactMethod
  public void authenticate(ReadableMap paramReadableMap, Promise paramPromise) {
    String str;
    Activity activity = getCurrentActivity();
    if (this.authPromise != null) {
      str = "E_ONE_REQ_AT_A_TIME";
      String str1 = "Activity doesn't exist";
    } else {
      String str1;
      if (str == null) {
        str = "E_ACTIVITY_DOES_NOT_EXIST";
        str1 = "One auth request at a time";
      } else {
        this.authPromise = paramPromise;
        if (str1.hasKey("reason")) {
          String str2 = str1.getString("reason");
        } else {
          paramPromise = null;
        } 
        if (str1.hasKey("description")) {
          str1 = str1.getString("description");
        } else {
          str1 = null;
        } 
        try {
          str.startActivityForResult(this.mKeyguardManager.createConfirmDeviceCredentialIntent((CharSequence)paramPromise, str1), 18864);
          return;
        } catch (Exception exception) {
          this.authPromise.reject("E_FAILED_TO_SHOW_AUTH", exception);
          this.authPromise = null;
          return;
        } 
      } 
    } 
    paramPromise.reject(str, (String)exception);
  }
  
  public String getName() {
    return "RNLocalAuth";
  }
  
  @ReactMethod
  public void isDeviceSecure(Promise paramPromise) {
    paramPromise.resolve(Boolean.valueOf(this.mKeyguardManager.isDeviceSecure()));
  }
  
  class a extends BaseActivityEventListener {
    a(LocalAuthModule this$0) {}
    
    public void onActivityResult(Activity param1Activity, int param1Int1, int param1Int2, Intent param1Intent) {
      if (param1Int1 == 18864) {
        if (this.c.authPromise == null)
          return; 
        if (param1Int2 == 0) {
          this.c.authPromise.reject("LAErrorUserCancel", "User canceled");
        } else if (param1Int2 == -1) {
          this.c.authPromise.resolve(Boolean.valueOf(true));
        } 
        LocalAuthModule.access$002(this.c, null);
      } 
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/io/tradle/reactlocalauth/LocalAuthModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */