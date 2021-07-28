package okhttp3;

import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;
import java.net.URLStreamHandlerFactory;
import okhttp3.internal.URLFilter;
import okhttp3.internal.annotations.EverythingIsNonNull;
import okhttp3.internal.huc.OkHttpURLConnection;
import okhttp3.internal.huc.OkHttpsURLConnection;

@EverythingIsNonNull
public final class OkUrlFactory implements URLStreamHandlerFactory, Cloneable {
  private OkHttpClient client;
  
  private URLFilter urlFilter;
  
  public OkUrlFactory(OkHttpClient paramOkHttpClient) {
    this.client = paramOkHttpClient;
  }
  
  public OkHttpClient client() {
    return this.client;
  }
  
  public OkUrlFactory clone() {
    return new OkUrlFactory(this.client);
  }
  
  public URLStreamHandler createURLStreamHandler(final String protocol) {
    return (!protocol.equals("http") && !protocol.equals("https")) ? null : new URLStreamHandler() {
        protected int getDefaultPort() {
          if (protocol.equals("http"))
            return 80; 
          if (protocol.equals("https"))
            return 443; 
          throw new AssertionError();
        }
        
        protected URLConnection openConnection(URL param1URL) {
          return OkUrlFactory.this.open(param1URL);
        }
        
        protected URLConnection openConnection(URL param1URL, Proxy param1Proxy) {
          return OkUrlFactory.this.open(param1URL, param1Proxy);
        }
      };
  }
  
  public HttpURLConnection open(URL paramURL) {
    return open(paramURL, this.client.proxy());
  }
  
  HttpURLConnection open(URL paramURL, Proxy paramProxy) {
    String str = paramURL.getProtocol();
    OkHttpClient okHttpClient = this.client.newBuilder().proxy(paramProxy).build();
    if (str.equals("http"))
      return (HttpURLConnection)new OkHttpURLConnection(paramURL, okHttpClient, this.urlFilter); 
    if (str.equals("https"))
      return (HttpURLConnection)new OkHttpsURLConnection(paramURL, okHttpClient, this.urlFilter); 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Unexpected protocol: ");
    stringBuilder.append(str);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public OkUrlFactory setClient(OkHttpClient paramOkHttpClient) {
    this.client = paramOkHttpClient;
    return this;
  }
  
  void setUrlFilter(URLFilter paramURLFilter) {
    this.urlFilter = paramURLFilter;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/okhttp3/OkUrlFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */