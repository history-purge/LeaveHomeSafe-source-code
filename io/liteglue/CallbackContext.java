package io.liteglue;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;

public class CallbackContext {
  private static final String LOG_TAG = "SQLitePlugin";
  
  private Callback errorCallback;
  
  private Callback successCallback;
  
  public CallbackContext(Callback paramCallback1, Callback paramCallback2) {
    this.successCallback = paramCallback1;
    this.errorCallback = paramCallback2;
  }
  
  public void error(WritableMap paramWritableMap) {
    this.errorCallback.invoke(new Object[] { paramWritableMap });
  }
  
  public void error(String paramString) {
    this.errorCallback.invoke(new Object[] { paramString });
  }
  
  public void success() {
    this.successCallback.invoke(new Object[] { "Success" });
  }
  
  public void success(WritableArray paramWritableArray) {
    this.successCallback.invoke(new Object[] { paramWritableArray });
  }
  
  public void success(WritableMap paramWritableMap) {
    this.successCallback.invoke(new Object[] { paramWritableMap });
  }
  
  public void success(String paramString) {
    this.successCallback.invoke(new Object[] { paramString });
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/io/liteglue/CallbackContext.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */