package com.peel.react;

import java.net.InetSocketAddress;

public interface a {
  void onClose(Integer paramInteger, String paramString);
  
  void onConnect(Integer paramInteger, InetSocketAddress paramInetSocketAddress);
  
  void onConnection(Integer paramInteger1, Integer paramInteger2, InetSocketAddress paramInetSocketAddress);
  
  void onData(Integer paramInteger, byte[] paramArrayOfbyte);
  
  void onError(Integer paramInteger, String paramString);
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/peel/react/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */