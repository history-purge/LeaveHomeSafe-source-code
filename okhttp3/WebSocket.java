package okhttp3;

import j.f;

public interface WebSocket {
  void cancel();
  
  boolean close(int paramInt, String paramString);
  
  long queueSize();
  
  Request request();
  
  boolean send(f paramf);
  
  boolean send(String paramString);
  
  public static interface Factory {
    WebSocket newWebSocket(Request param1Request, WebSocketListener param1WebSocketListener);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/okhttp3/WebSocket.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */