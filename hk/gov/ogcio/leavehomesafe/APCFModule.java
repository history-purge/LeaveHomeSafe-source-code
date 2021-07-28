package hk.gov.ogcio.leavehomesafe;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableNativeArray;

public class APCFModule extends ReactContextBaseJavaModule {
  APCFModule(ReactApplicationContext paramReactApplicationContext) {
    super(paramReactApplicationContext);
  }
  
  @ReactMethod
  public void evtPbk(Promise paramPromise) {
    try {
      String[] arrayOfString = (new JNIHelper()).getPbk();
      WritableNativeArray writableNativeArray = new WritableNativeArray();
      int j = arrayOfString.length;
      for (int i = 0; i < j; i++)
        writableNativeArray.pushString(arrayOfString[i]); 
      paramPromise.resolve(writableNativeArray);
      return;
    } catch (Exception exception) {
      paramPromise.reject(exception);
      return;
    } 
  }
  
  public String getName() {
    return "APCFModule";
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/hk/gov/ogcio/leavehomesafe/APCFModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */