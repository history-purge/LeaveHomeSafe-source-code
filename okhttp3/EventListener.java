package okhttp3;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;

public abstract class EventListener {
  public static final EventListener NONE = new EventListener() {
    
    };
  
  static Factory factory(final EventListener listener) {
    return new Factory() {
        public EventListener create(Call param1Call) {
          return listener;
        }
      };
  }
  
  public void callEnd(Call paramCall) {}
  
  public void callFailed(Call paramCall, IOException paramIOException) {}
  
  public void callStart(Call paramCall) {}
  
  public void connectEnd(Call paramCall, InetSocketAddress paramInetSocketAddress, Proxy paramProxy, Protocol paramProtocol) {}
  
  public void connectFailed(Call paramCall, InetSocketAddress paramInetSocketAddress, Proxy paramProxy, Protocol paramProtocol, IOException paramIOException) {}
  
  public void connectStart(Call paramCall, InetSocketAddress paramInetSocketAddress, Proxy paramProxy) {}
  
  public void connectionAcquired(Call paramCall, Connection paramConnection) {}
  
  public void connectionReleased(Call paramCall, Connection paramConnection) {}
  
  public void dnsEnd(Call paramCall, String paramString, List<InetAddress> paramList) {}
  
  public void dnsStart(Call paramCall, String paramString) {}
  
  public void requestBodyEnd(Call paramCall, long paramLong) {}
  
  public void requestBodyStart(Call paramCall) {}
  
  public void requestHeadersEnd(Call paramCall, Request paramRequest) {}
  
  public void requestHeadersStart(Call paramCall) {}
  
  public void responseBodyEnd(Call paramCall, long paramLong) {}
  
  public void responseBodyStart(Call paramCall) {}
  
  public void responseHeadersEnd(Call paramCall, Response paramResponse) {}
  
  public void responseHeadersStart(Call paramCall) {}
  
  public void secureConnectEnd(Call paramCall, Handshake paramHandshake) {}
  
  public void secureConnectStart(Call paramCall) {}
  
  public static interface Factory {
    EventListener create(Call param1Call);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/okhttp3/EventListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */