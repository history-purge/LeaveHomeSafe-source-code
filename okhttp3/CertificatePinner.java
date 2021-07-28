package okhttp3;

import j.f;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import okhttp3.internal.Util;
import okhttp3.internal.tls.CertificateChainCleaner;

public final class CertificatePinner {
  public static final CertificatePinner DEFAULT = (new Builder()).build();
  
  private final CertificateChainCleaner certificateChainCleaner;
  
  private final Set<Pin> pins;
  
  CertificatePinner(Set<Pin> paramSet, CertificateChainCleaner paramCertificateChainCleaner) {
    this.pins = paramSet;
    this.certificateChainCleaner = paramCertificateChainCleaner;
  }
  
  public static String pin(Certificate paramCertificate) {
    if (paramCertificate instanceof X509Certificate) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("sha256/");
      stringBuilder.append(sha256((X509Certificate)paramCertificate).a());
      return stringBuilder.toString();
    } 
    throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
  }
  
  static f sha1(X509Certificate paramX509Certificate) {
    return f.a(paramX509Certificate.getPublicKey().getEncoded()).q();
  }
  
  static f sha256(X509Certificate paramX509Certificate) {
    return f.a(paramX509Certificate.getPublicKey().getEncoded()).r();
  }
  
  public void check(String paramString, List<Certificate> paramList) {
    StringBuilder stringBuilder1;
    List<Pin> list1 = findMatchingPins(paramString);
    if (list1.isEmpty())
      return; 
    CertificateChainCleaner certificateChainCleaner = this.certificateChainCleaner;
    List<Certificate> list = paramList;
    if (certificateChainCleaner != null)
      list = certificateChainCleaner.clean(paramList, paramString); 
    int k = list.size();
    boolean bool = false;
    int i;
    for (i = 0; i < k; i++) {
      X509Certificate x509Certificate = (X509Certificate)list.get(i);
      int n = list1.size();
      certificateChainCleaner = null;
      CertificateChainCleaner certificateChainCleaner1 = certificateChainCleaner;
      for (int m = 0; m < n; m++) {
        Pin pin = list1.get(m);
        if (pin.hashAlgorithm.equals("sha256/")) {
          f f2;
          CertificateChainCleaner certificateChainCleaner2 = certificateChainCleaner;
          if (certificateChainCleaner == null)
            f2 = sha256(x509Certificate); 
          f f1 = f2;
          if (pin.hash.equals(f2))
            return; 
        } else if (pin.hashAlgorithm.equals("sha1/")) {
          f f2;
          CertificateChainCleaner certificateChainCleaner2 = certificateChainCleaner1;
          if (certificateChainCleaner1 == null)
            f2 = sha1(x509Certificate); 
          f f1 = f2;
          if (pin.hash.equals(f2))
            return; 
        } else {
          stringBuilder1 = new StringBuilder();
          stringBuilder1.append("unsupported hashAlgorithm: ");
          stringBuilder1.append(pin.hashAlgorithm);
          throw new AssertionError(stringBuilder1.toString());
        } 
      } 
    } 
    StringBuilder stringBuilder2 = new StringBuilder();
    stringBuilder2.append("Certificate pinning failure!");
    stringBuilder2.append("\n  Peer certificate chain:");
    int j = list.size();
    for (i = 0; i < j; i++) {
      X509Certificate x509Certificate = (X509Certificate)list.get(i);
      stringBuilder2.append("\n    ");
      stringBuilder2.append(pin(x509Certificate));
      stringBuilder2.append(": ");
      stringBuilder2.append(x509Certificate.getSubjectDN().getName());
    } 
    stringBuilder2.append("\n  Pinned certificates for ");
    stringBuilder2.append((String)stringBuilder1);
    stringBuilder2.append(":");
    j = list1.size();
    for (i = bool; i < j; i++) {
      Pin pin = list1.get(i);
      stringBuilder2.append("\n    ");
      stringBuilder2.append(pin);
    } 
    SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(stringBuilder2.toString());
    throw sSLPeerUnverifiedException;
  }
  
  public void check(String paramString, Certificate... paramVarArgs) {
    check(paramString, Arrays.asList(paramVarArgs));
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (paramObject instanceof CertificatePinner) {
      CertificateChainCleaner certificateChainCleaner = this.certificateChainCleaner;
      paramObject = paramObject;
      if (Util.equal(certificateChainCleaner, ((CertificatePinner)paramObject).certificateChainCleaner) && this.pins.equals(((CertificatePinner)paramObject).pins))
        return true; 
    } 
    return false;
  }
  
  List<Pin> findMatchingPins(String paramString) {
    List<?> list = Collections.emptyList();
    for (Pin pin : this.pins) {
      if (pin.matches(paramString)) {
        List<?> list1 = list;
        if (list.isEmpty())
          list1 = new ArrayList(); 
        list1.add(pin);
        list = list1;
      } 
    } 
    return (List)list;
  }
  
  public int hashCode() {
    byte b;
    CertificateChainCleaner certificateChainCleaner = this.certificateChainCleaner;
    if (certificateChainCleaner != null) {
      b = certificateChainCleaner.hashCode();
    } else {
      b = 0;
    } 
    return b * 31 + this.pins.hashCode();
  }
  
  CertificatePinner withCertificateChainCleaner(CertificateChainCleaner paramCertificateChainCleaner) {
    return Util.equal(this.certificateChainCleaner, paramCertificateChainCleaner) ? this : new CertificatePinner(this.pins, paramCertificateChainCleaner);
  }
  
  public static final class Builder {
    private final List<CertificatePinner.Pin> pins = new ArrayList<CertificatePinner.Pin>();
    
    public Builder add(String param1String, String... param1VarArgs) {
      if (param1String != null) {
        int j = param1VarArgs.length;
        for (int i = 0; i < j; i++) {
          String str = param1VarArgs[i];
          this.pins.add(new CertificatePinner.Pin(param1String, str));
        } 
        return this;
      } 
      NullPointerException nullPointerException = new NullPointerException("pattern == null");
      throw nullPointerException;
    }
    
    public CertificatePinner build() {
      return new CertificatePinner(new LinkedHashSet<CertificatePinner.Pin>(this.pins), null);
    }
  }
  
  static final class Pin {
    private static final String WILDCARD = "*.";
    
    final String canonicalHostname;
    
    final f hash;
    
    final String hashAlgorithm;
    
    final String pattern;
    
    Pin(String param1String1, String param1String2) {
      byte b;
      StringBuilder stringBuilder2;
      this.pattern = param1String1;
      if (param1String1.startsWith("*.")) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("http://");
        String str2 = param1String1.substring(2);
        stringBuilder1 = stringBuilder;
        String str1 = str2;
      } else {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("http://");
        stringBuilder2 = stringBuilder1;
        stringBuilder1 = stringBuilder;
      } 
      stringBuilder1.append((String)stringBuilder2);
      this.canonicalHostname = HttpUrl.get(stringBuilder1.toString()).host();
      if (param1String2.startsWith("sha1/")) {
        this.hashAlgorithm = "sha1/";
        b = 5;
      } else if (param1String2.startsWith("sha256/")) {
        this.hashAlgorithm = "sha256/";
        b = 7;
      } else {
        stringBuilder1 = new StringBuilder();
        stringBuilder1.append("pins must start with 'sha256/' or 'sha1/': ");
        stringBuilder1.append(param1String2);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(stringBuilder1.toString());
        throw illegalArgumentException;
      } 
      this.hash = f.a(param1String2.substring(b));
      if (this.hash != null)
        return; 
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("pins must be base64: ");
      stringBuilder1.append(param1String2);
      throw new IllegalArgumentException(stringBuilder1.toString());
    }
    
    public boolean equals(Object param1Object) {
      if (param1Object instanceof Pin) {
        String str = this.pattern;
        param1Object = param1Object;
        if (str.equals(((Pin)param1Object).pattern) && this.hashAlgorithm.equals(((Pin)param1Object).hashAlgorithm) && this.hash.equals(((Pin)param1Object).hash))
          return true; 
      } 
      return false;
    }
    
    public int hashCode() {
      return ((527 + this.pattern.hashCode()) * 31 + this.hashAlgorithm.hashCode()) * 31 + this.hash.hashCode();
    }
    
    boolean matches(String param1String) {
      if (this.pattern.startsWith("*.")) {
        int i = param1String.indexOf('.');
        if (param1String.length() - i - 1 == this.canonicalHostname.length()) {
          String str = this.canonicalHostname;
          if (param1String.regionMatches(false, i + 1, str, 0, str.length()))
            return true; 
        } 
        return false;
      } 
      return param1String.equals(this.canonicalHostname);
    }
    
    public String toString() {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(this.hashAlgorithm);
      stringBuilder.append(this.hash.a());
      return stringBuilder.toString();
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/okhttp3/CertificatePinner.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */