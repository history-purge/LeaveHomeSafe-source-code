package okhttp3.internal.huc;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.security.Permission;
import java.security.Principal;
import java.security.cert.Certificate;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.Handshake;
import okhttp3.OkHttpClient;
import okhttp3.internal.URLFilter;

public final class OkHttpsURLConnection extends DelegatingHttpsURLConnection {
  private final OkHttpURLConnection delegate;
  
  public OkHttpsURLConnection(URL paramURL, OkHttpClient paramOkHttpClient) {
    this(new OkHttpURLConnection(paramURL, paramOkHttpClient));
  }
  
  public OkHttpsURLConnection(URL paramURL, OkHttpClient paramOkHttpClient, URLFilter paramURLFilter) {
    this(new OkHttpURLConnection(paramURL, paramOkHttpClient, paramURLFilter));
  }
  
  public OkHttpsURLConnection(OkHttpURLConnection paramOkHttpURLConnection) {
    super(paramOkHttpURLConnection);
    this.delegate = paramOkHttpURLConnection;
  }
  
  public HostnameVerifier getHostnameVerifier() {
    return this.delegate.client.hostnameVerifier();
  }
  
  public SSLSocketFactory getSSLSocketFactory() {
    return this.delegate.client.sslSocketFactory();
  }
  
  protected Handshake handshake() {
    OkHttpURLConnection okHttpURLConnection = this.delegate;
    if (okHttpURLConnection.call != null)
      return okHttpURLConnection.handshake; 
    throw new IllegalStateException("Connection has not yet been established");
  }
  
  public void setHostnameVerifier(HostnameVerifier paramHostnameVerifier) {
    OkHttpURLConnection okHttpURLConnection = this.delegate;
    okHttpURLConnection.client = okHttpURLConnection.client.newBuilder().hostnameVerifier(paramHostnameVerifier).build();
  }
  
  public void setSSLSocketFactory(SSLSocketFactory paramSSLSocketFactory) {
    if (paramSSLSocketFactory != null) {
      OkHttpURLConnection okHttpURLConnection = this.delegate;
      okHttpURLConnection.client = okHttpURLConnection.client.newBuilder().sslSocketFactory(paramSSLSocketFactory).build();
      return;
    } 
    throw new IllegalArgumentException("sslSocketFactory == null");
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/okhttp3/internal/huc/OkHttpsURLConnection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */