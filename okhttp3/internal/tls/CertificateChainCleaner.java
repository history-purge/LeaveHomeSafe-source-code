package okhttp3.internal.tls;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.X509TrustManager;
import okhttp3.internal.platform.Platform;

public abstract class CertificateChainCleaner {
  public static CertificateChainCleaner get(X509TrustManager paramX509TrustManager) {
    return Platform.get().buildCertificateChainCleaner(paramX509TrustManager);
  }
  
  public static CertificateChainCleaner get(X509Certificate... paramVarArgs) {
    return new BasicCertificateChainCleaner(new BasicTrustRootIndex(paramVarArgs));
  }
  
  public abstract List<Certificate> clean(List<Certificate> paramList, String paramString);
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/okhttp3/internal/tls/CertificateChainCleaner.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */