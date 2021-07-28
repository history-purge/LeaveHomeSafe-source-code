package okhttp3;

import j.f;

public abstract class WebSocketListener {
  public void onClosed(WebSocket paramWebSocket, int paramInt, String paramString) {}
  
  public void onClosing(WebSocket paramWebSocket, int paramInt, String paramString) {}
  
  public void onFailure(WebSocket paramWebSocket, Throwable paramThrowable, Response paramResponse) {}
  
  public void onMessage(WebSocket paramWebSocket, f paramf) {}
  
  public void onMessage(WebSocket paramWebSocket, String paramString) {}
  
  public void onOpen(WebSocket paramWebSocket, Response paramResponse) {}
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/okhttp3/WebSocketListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */