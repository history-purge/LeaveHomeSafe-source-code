package com.facebook.react.bridge;

public interface Promise {
  @Deprecated
  void reject(String paramString);
  
  void reject(String paramString, WritableMap paramWritableMap);
  
  void reject(String paramString1, String paramString2);
  
  void reject(String paramString1, String paramString2, WritableMap paramWritableMap);
  
  void reject(String paramString1, String paramString2, Throwable paramThrowable);
  
  void reject(String paramString1, String paramString2, Throwable paramThrowable, WritableMap paramWritableMap);
  
  void reject(String paramString, Throwable paramThrowable);
  
  void reject(String paramString, Throwable paramThrowable, WritableMap paramWritableMap);
  
  void reject(Throwable paramThrowable);
  
  void reject(Throwable paramThrowable, WritableMap paramWritableMap);
  
  void resolve(Object paramObject);
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/bridge/Promise.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */