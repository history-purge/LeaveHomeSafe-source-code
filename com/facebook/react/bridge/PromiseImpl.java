package com.facebook.react.bridge;

public class PromiseImpl implements Promise {
  private static final String ERROR_DEFAULT_CODE = "EUNSPECIFIED";
  
  private static final String ERROR_DEFAULT_MESSAGE = "Error not specified.";
  
  private static final String ERROR_MAP_KEY_CODE = "code";
  
  private static final String ERROR_MAP_KEY_MESSAGE = "message";
  
  private static final String ERROR_MAP_KEY_NATIVE_STACK = "nativeStackAndroid";
  
  private static final String ERROR_MAP_KEY_USER_INFO = "userInfo";
  
  private static final int ERROR_STACK_FRAME_LIMIT = 50;
  
  private static final String STACK_FRAME_KEY_CLASS = "class";
  
  private static final String STACK_FRAME_KEY_FILE = "file";
  
  private static final String STACK_FRAME_KEY_LINE_NUMBER = "lineNumber";
  
  private static final String STACK_FRAME_KEY_METHOD_NAME = "methodName";
  
  private Callback mReject;
  
  private Callback mResolve;
  
  public PromiseImpl(Callback paramCallback1, Callback paramCallback2) {
    this.mResolve = paramCallback1;
    this.mReject = paramCallback2;
  }
  
  @Deprecated
  public void reject(String paramString) {
    reject(null, paramString, null, null);
  }
  
  public void reject(String paramString, WritableMap paramWritableMap) {
    reject(paramString, null, null, paramWritableMap);
  }
  
  public void reject(String paramString1, String paramString2) {
    reject(paramString1, paramString2, null, null);
  }
  
  public void reject(String paramString1, String paramString2, WritableMap paramWritableMap) {
    reject(paramString1, paramString2, null, paramWritableMap);
  }
  
  public void reject(String paramString1, String paramString2, Throwable paramThrowable) {
    reject(paramString1, paramString2, paramThrowable, null);
  }
  
  public void reject(String paramString1, String paramString2, Throwable paramThrowable, WritableMap paramWritableMap) {
    if (this.mReject == null) {
      this.mResolve = null;
      return;
    } 
    WritableNativeMap writableNativeMap = new WritableNativeMap();
    String str = paramString1;
    if (paramString1 == null)
      str = "EUNSPECIFIED"; 
    writableNativeMap.putString("code", str);
    if (paramString2 == null)
      if (paramThrowable != null) {
        paramString2 = paramThrowable.getMessage();
      } else {
        paramString2 = "Error not specified.";
      }  
    writableNativeMap.putString("message", paramString2);
    if (paramWritableMap != null) {
      writableNativeMap.putMap("userInfo", paramWritableMap);
    } else {
      writableNativeMap.putNull("userInfo");
    } 
    if (paramThrowable != null) {
      StackTraceElement[] arrayOfStackTraceElement = paramThrowable.getStackTrace();
      WritableNativeArray writableNativeArray = new WritableNativeArray();
      int i;
      for (i = 0; i < arrayOfStackTraceElement.length && i < 50; i++) {
        StackTraceElement stackTraceElement = arrayOfStackTraceElement[i];
        paramWritableMap = new WritableNativeMap();
        paramWritableMap.putString("class", stackTraceElement.getClassName());
        paramWritableMap.putString("file", stackTraceElement.getFileName());
        paramWritableMap.putInt("lineNumber", stackTraceElement.getLineNumber());
        paramWritableMap.putString("methodName", stackTraceElement.getMethodName());
        writableNativeArray.pushMap(paramWritableMap);
      } 
      writableNativeMap.putArray("nativeStackAndroid", writableNativeArray);
    } else {
      writableNativeMap.putArray("nativeStackAndroid", new WritableNativeArray());
    } 
    this.mReject.invoke(new Object[] { writableNativeMap });
    this.mResolve = null;
    this.mReject = null;
  }
  
  public void reject(String paramString, Throwable paramThrowable) {
    reject(paramString, null, paramThrowable, null);
  }
  
  public void reject(String paramString, Throwable paramThrowable, WritableMap paramWritableMap) {
    reject(paramString, null, paramThrowable, paramWritableMap);
  }
  
  public void reject(Throwable paramThrowable) {
    reject(null, null, paramThrowable, null);
  }
  
  public void reject(Throwable paramThrowable, WritableMap paramWritableMap) {
    reject(null, null, paramThrowable, paramWritableMap);
  }
  
  public void resolve(Object paramObject) {
    Callback callback = this.mResolve;
    if (callback != null) {
      callback.invoke(new Object[] { paramObject });
      this.mResolve = null;
      this.mReject = null;
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/bridge/PromiseImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */