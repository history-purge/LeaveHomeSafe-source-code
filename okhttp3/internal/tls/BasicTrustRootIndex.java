package okhttp3.internal.tls;

import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

public final class BasicTrustRootIndex implements TrustRootIndex {
  private final Map<X500Principal, Set<X509Certificate>> subjectToCaCerts = new LinkedHashMap<X500Principal, Set<X509Certificate>>();
  
  public BasicTrustRootIndex(X509Certificate... paramVarArgs) {
    int j = paramVarArgs.length;
    for (int i = 0; i < j; i++) {
      X509Certificate x509Certificate = paramVarArgs[i];
      X500Principal x500Principal = x509Certificate.getSubjectX500Principal();
      Set<X509Certificate> set2 = this.subjectToCaCerts.get(x500Principal);
      Set<X509Certificate> set1 = set2;
      if (set2 == null) {
        set1 = new LinkedHashSet(1);
        this.subjectToCaCerts.put(x500Principal, set1);
      } 
      set1.add(x509Certificate);
    } 
  }
  
  public boolean equals(Object paramObject) {
    return (paramObject == this) ? true : ((paramObject instanceof BasicTrustRootIndex && ((BasicTrustRootIndex)paramObject).subjectToCaCerts.equals(this.subjectToCaCerts)));
  }
  
  public X509Certificate findByIssuerAndSignature(X509Certificate paramX509Certificate) {
    X500Principal x500Principal = paramX509Certificate.getIssuerX500Principal();
    Set set = this.subjectToCaCerts.get(x500Principal);
    if (set == null)
      return null; 
    Iterator<X509Certificate> iterator = set.iterator();
    while (true) {
      if (iterator.hasNext()) {
        X509Certificate x509Certificate = iterator.next();
        PublicKey publicKey = x509Certificate.getPublicKey();
        try {
          paramX509Certificate.verify(publicKey);
          return x509Certificate;
        } catch (Exception exception) {
          continue;
        } 
      } 
      return null;
    } 
  }
  
  public int hashCode() {
    return this.subjectToCaCerts.hashCode();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/okhttp3/internal/tls/BasicTrustRootIndex.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */