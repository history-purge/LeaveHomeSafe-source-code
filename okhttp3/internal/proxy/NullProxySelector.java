package okhttp3.internal.proxy;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.Collections;
import java.util.List;

public class NullProxySelector extends ProxySelector {
  public void connectFailed(URI paramURI, SocketAddress paramSocketAddress, IOException paramIOException) {}
  
  public List<Proxy> select(URI paramURI) {
    if (paramURI != null)
      return Collections.singletonList(Proxy.NO_PROXY); 
    throw new IllegalArgumentException("uri must not be null");
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/okhttp3/internal/proxy/NullProxySelector.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */