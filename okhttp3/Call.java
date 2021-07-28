package okhttp3;

import j.u;

public interface Call extends Cloneable {
  void cancel();
  
  Call clone();
  
  void enqueue(Callback paramCallback);
  
  Response execute();
  
  boolean isCanceled();
  
  boolean isExecuted();
  
  Request request();
  
  u timeout();
  
  public static interface Factory {
    Call newCall(Request param1Request);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/okhttp3/Call.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */