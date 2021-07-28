package com.facebook.react.modules.network;

import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

public class o extends SSLSocketFactory {
  private SSLSocketFactory a;
  
  public o() {
    SSLContext sSLContext = SSLContext.getInstance("TLS");
    sSLContext.init(null, null, null);
    this.a = sSLContext.getSocketFactory();
  }
  
  private Socket a(Socket paramSocket) {
    if (paramSocket != null && paramSocket instanceof SSLSocket)
      ((SSLSocket)paramSocket).setEnabledProtocols(new String[] { "TLSv1", "TLSv1.1", "TLSv1.2" }); 
    return paramSocket;
  }
  
  public Socket createSocket(String paramString, int paramInt) {
    Socket socket = this.a.createSocket(paramString, paramInt);
    a(socket);
    return socket;
  }
  
  public Socket createSocket(String paramString, int paramInt1, InetAddress paramInetAddress, int paramInt2) {
    Socket socket = this.a.createSocket(paramString, paramInt1, paramInetAddress, paramInt2);
    a(socket);
    return socket;
  }
  
  public Socket createSocket(InetAddress paramInetAddress, int paramInt) {
    Socket socket = this.a.createSocket(paramInetAddress, paramInt);
    a(socket);
    return socket;
  }
  
  public Socket createSocket(InetAddress paramInetAddress1, int paramInt1, InetAddress paramInetAddress2, int paramInt2) {
    Socket socket = this.a.createSocket(paramInetAddress1, paramInt1, paramInetAddress2, paramInt2);
    a(socket);
    return socket;
  }
  
  public Socket createSocket(Socket paramSocket, String paramString, int paramInt, boolean paramBoolean) {
    paramSocket = this.a.createSocket(paramSocket, paramString, paramInt, paramBoolean);
    a(paramSocket);
    return paramSocket;
  }
  
  public String[] getDefaultCipherSuites() {
    return this.a.getDefaultCipherSuites();
  }
  
  public String[] getSupportedCipherSuites() {
    return this.a.getSupportedCipherSuites();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/modules/network/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */