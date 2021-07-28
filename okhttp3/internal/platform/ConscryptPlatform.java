package okhttp3.internal.platform;

import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.Protocol;
import org.conscrypt.Conscrypt;

public class ConscryptPlatform extends Platform {
  public static ConscryptPlatform buildIfSupported() {
    try {
      Class.forName("org.conscrypt.Conscrypt");
      return !Conscrypt.isAvailable() ? null : new ConscryptPlatform();
    } catch (ClassNotFoundException classNotFoundException) {
      return null;
    } 
  }
  
  private Provider getProvider() {
    return Conscrypt.newProviderBuilder().provideTrustManager().build();
  }
  
  public void configureSslSocketFactory(SSLSocketFactory paramSSLSocketFactory) {
    if (Conscrypt.isConscrypt(paramSSLSocketFactory))
      Conscrypt.setUseEngineSocket(paramSSLSocketFactory, true); 
  }
  
  public void configureTlsExtensions(SSLSocket paramSSLSocket, String paramString, List<Protocol> paramList) {
    if (Conscrypt.isConscrypt(paramSSLSocket)) {
      if (paramString != null) {
        Conscrypt.setUseSessionTickets(paramSSLSocket, true);
        Conscrypt.setHostname(paramSSLSocket, paramString);
      } 
      Conscrypt.setApplicationProtocols(paramSSLSocket, Platform.alpnProtocolNames(paramList).<String>toArray(new String[0]));
      return;
    } 
    super.configureTlsExtensions(paramSSLSocket, paramString, paramList);
  }
  
  public SSLContext getSSLContext() {
    try {
      return SSLContext.getInstance("TLSv1.3", getProvider());
    } catch (NoSuchAlgorithmException noSuchAlgorithmException) {
      try {
        return SSLContext.getInstance("TLS", getProvider());
      } catch (NoSuchAlgorithmException noSuchAlgorithmException1) {
        throw new IllegalStateException("No TLS provider", noSuchAlgorithmException);
      } 
    } 
  }
  
  public String getSelectedProtocol(SSLSocket paramSSLSocket) {
    return Conscrypt.isConscrypt(paramSSLSocket) ? Conscrypt.getApplicationProtocol(paramSSLSocket) : super.getSelectedProtocol(paramSSLSocket);
  }
  
  public X509TrustManager trustManager(SSLSocketFactory paramSSLSocketFactory) {
    if (!Conscrypt.isConscrypt(paramSSLSocketFactory))
      return super.trustManager(paramSSLSocketFactory); 
    try {
      paramSSLSocketFactory = Platform.readFieldOrNull(paramSSLSocketFactory, Object.class, "sslParameters");
      return (paramSSLSocketFactory != null) ? Platform.<X509TrustManager>readFieldOrNull(paramSSLSocketFactory, X509TrustManager.class, "x509TrustManager") : null;
    } catch (Exception exception) {
      throw new UnsupportedOperationException("clientBuilder.sslSocketFactory(SSLSocketFactory) not supported on Conscrypt", exception);
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/okhttp3/internal/platform/ConscryptPlatform.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */