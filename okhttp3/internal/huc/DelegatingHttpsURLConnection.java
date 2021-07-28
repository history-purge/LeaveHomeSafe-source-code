package okhttp3.internal.huc;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.Permission;
import java.security.Principal;
import java.security.cert.Certificate;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.Handshake;

abstract class DelegatingHttpsURLConnection extends HttpsURLConnection {
  private final HttpURLConnection delegate;
  
  DelegatingHttpsURLConnection(HttpURLConnection paramHttpURLConnection) {
    super(paramHttpURLConnection.getURL());
    this.delegate = paramHttpURLConnection;
  }
  
  public void addRequestProperty(String paramString1, String paramString2) {
    this.delegate.addRequestProperty(paramString1, paramString2);
  }
  
  public void connect() {
    this.connected = true;
    this.delegate.connect();
  }
  
  public void disconnect() {
    this.delegate.disconnect();
  }
  
  public boolean getAllowUserInteraction() {
    return this.delegate.getAllowUserInteraction();
  }
  
  public String getCipherSuite() {
    Handshake handshake = handshake();
    return (handshake != null) ? handshake.cipherSuite().javaName() : null;
  }
  
  public int getConnectTimeout() {
    return this.delegate.getConnectTimeout();
  }
  
  public Object getContent() {
    return this.delegate.getContent();
  }
  
  public Object getContent(Class[] paramArrayOfClass) {
    return this.delegate.getContent(paramArrayOfClass);
  }
  
  public String getContentEncoding() {
    return this.delegate.getContentEncoding();
  }
  
  public int getContentLength() {
    return this.delegate.getContentLength();
  }
  
  public long getContentLengthLong() {
    return this.delegate.getContentLengthLong();
  }
  
  public String getContentType() {
    return this.delegate.getContentType();
  }
  
  public long getDate() {
    return this.delegate.getDate();
  }
  
  public boolean getDefaultUseCaches() {
    return this.delegate.getDefaultUseCaches();
  }
  
  public boolean getDoInput() {
    return this.delegate.getDoInput();
  }
  
  public boolean getDoOutput() {
    return this.delegate.getDoOutput();
  }
  
  public InputStream getErrorStream() {
    return this.delegate.getErrorStream();
  }
  
  public long getExpiration() {
    return this.delegate.getExpiration();
  }
  
  public String getHeaderField(int paramInt) {
    return this.delegate.getHeaderField(paramInt);
  }
  
  public String getHeaderField(String paramString) {
    return this.delegate.getHeaderField(paramString);
  }
  
  public long getHeaderFieldDate(String paramString, long paramLong) {
    return this.delegate.getHeaderFieldDate(paramString, paramLong);
  }
  
  public int getHeaderFieldInt(String paramString, int paramInt) {
    return this.delegate.getHeaderFieldInt(paramString, paramInt);
  }
  
  public String getHeaderFieldKey(int paramInt) {
    return this.delegate.getHeaderFieldKey(paramInt);
  }
  
  public long getHeaderFieldLong(String paramString, long paramLong) {
    return this.delegate.getHeaderFieldLong(paramString, paramLong);
  }
  
  public Map<String, List<String>> getHeaderFields() {
    return this.delegate.getHeaderFields();
  }
  
  public abstract HostnameVerifier getHostnameVerifier();
  
  public long getIfModifiedSince() {
    return this.delegate.getIfModifiedSince();
  }
  
  public InputStream getInputStream() {
    return this.delegate.getInputStream();
  }
  
  public boolean getInstanceFollowRedirects() {
    return this.delegate.getInstanceFollowRedirects();
  }
  
  public long getLastModified() {
    return this.delegate.getLastModified();
  }
  
  public Certificate[] getLocalCertificates() {
    Handshake handshake = handshake();
    Certificate[] arrayOfCertificate = null;
    if (handshake == null)
      return null; 
    List list = handshake.localCertificates();
    if (!list.isEmpty())
      arrayOfCertificate = (Certificate[])list.toArray((Object[])new Certificate[list.size()]); 
    return arrayOfCertificate;
  }
  
  public Principal getLocalPrincipal() {
    Handshake handshake = handshake();
    return (handshake != null) ? handshake.localPrincipal() : null;
  }
  
  public OutputStream getOutputStream() {
    return this.delegate.getOutputStream();
  }
  
  public Principal getPeerPrincipal() {
    Handshake handshake = handshake();
    return (handshake != null) ? handshake.peerPrincipal() : null;
  }
  
  public Permission getPermission() {
    return this.delegate.getPermission();
  }
  
  public int getReadTimeout() {
    return this.delegate.getReadTimeout();
  }
  
  public String getRequestMethod() {
    return this.delegate.getRequestMethod();
  }
  
  public Map<String, List<String>> getRequestProperties() {
    return this.delegate.getRequestProperties();
  }
  
  public String getRequestProperty(String paramString) {
    return this.delegate.getRequestProperty(paramString);
  }
  
  public int getResponseCode() {
    return this.delegate.getResponseCode();
  }
  
  public String getResponseMessage() {
    return this.delegate.getResponseMessage();
  }
  
  public abstract SSLSocketFactory getSSLSocketFactory();
  
  public Certificate[] getServerCertificates() {
    Handshake handshake = handshake();
    Certificate[] arrayOfCertificate = null;
    if (handshake == null)
      return null; 
    List list = handshake.peerCertificates();
    if (!list.isEmpty())
      arrayOfCertificate = (Certificate[])list.toArray((Object[])new Certificate[list.size()]); 
    return arrayOfCertificate;
  }
  
  public URL getURL() {
    return this.delegate.getURL();
  }
  
  public boolean getUseCaches() {
    return this.delegate.getUseCaches();
  }
  
  protected abstract Handshake handshake();
  
  public void setAllowUserInteraction(boolean paramBoolean) {
    this.delegate.setAllowUserInteraction(paramBoolean);
  }
  
  public void setChunkedStreamingMode(int paramInt) {
    this.delegate.setChunkedStreamingMode(paramInt);
  }
  
  public void setConnectTimeout(int paramInt) {
    this.delegate.setConnectTimeout(paramInt);
  }
  
  public void setDefaultUseCaches(boolean paramBoolean) {
    this.delegate.setDefaultUseCaches(paramBoolean);
  }
  
  public void setDoInput(boolean paramBoolean) {
    this.delegate.setDoInput(paramBoolean);
  }
  
  public void setDoOutput(boolean paramBoolean) {
    this.delegate.setDoOutput(paramBoolean);
  }
  
  public void setFixedLengthStreamingMode(int paramInt) {
    this.delegate.setFixedLengthStreamingMode(paramInt);
  }
  
  public void setFixedLengthStreamingMode(long paramLong) {
    this.delegate.setFixedLengthStreamingMode(paramLong);
  }
  
  public abstract void setHostnameVerifier(HostnameVerifier paramHostnameVerifier);
  
  public void setIfModifiedSince(long paramLong) {
    this.delegate.setIfModifiedSince(paramLong);
  }
  
  public void setInstanceFollowRedirects(boolean paramBoolean) {
    this.delegate.setInstanceFollowRedirects(paramBoolean);
  }
  
  public void setReadTimeout(int paramInt) {
    this.delegate.setReadTimeout(paramInt);
  }
  
  public void setRequestMethod(String paramString) {
    this.delegate.setRequestMethod(paramString);
  }
  
  public void setRequestProperty(String paramString1, String paramString2) {
    this.delegate.setRequestProperty(paramString1, paramString2);
  }
  
  public abstract void setSSLSocketFactory(SSLSocketFactory paramSSLSocketFactory);
  
  public void setUseCaches(boolean paramBoolean) {
    this.delegate.setUseCaches(paramBoolean);
  }
  
  public String toString() {
    return this.delegate.toString();
  }
  
  public boolean usingProxy() {
    return this.delegate.usingProxy();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/okhttp3/internal/huc/DelegatingHttpsURLConnection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */