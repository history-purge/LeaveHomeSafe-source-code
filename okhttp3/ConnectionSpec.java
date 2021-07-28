package okhttp3;

import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import okhttp3.internal.Util;

public final class ConnectionSpec {
  private static final CipherSuite[] APPROVED_CIPHER_SUITES;
  
  public static final ConnectionSpec CLEARTEXT;
  
  public static final ConnectionSpec COMPATIBLE_TLS;
  
  public static final ConnectionSpec MODERN_TLS;
  
  private static final CipherSuite[] RESTRICTED_CIPHER_SUITES = new CipherSuite[] { 
      CipherSuite.TLS_AES_128_GCM_SHA256, CipherSuite.TLS_AES_256_GCM_SHA384, CipherSuite.TLS_CHACHA20_POLY1305_SHA256, CipherSuite.TLS_AES_128_CCM_SHA256, CipherSuite.TLS_AES_256_CCM_8_SHA256, CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, 
      CipherSuite.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256 };
  
  public static final ConnectionSpec RESTRICTED_TLS;
  
  final String[] cipherSuites;
  
  final boolean supportsTlsExtensions;
  
  final boolean tls;
  
  final String[] tlsVersions;
  
  static {
    APPROVED_CIPHER_SUITES = new CipherSuite[] { 
        CipherSuite.TLS_AES_128_GCM_SHA256, CipherSuite.TLS_AES_256_GCM_SHA384, CipherSuite.TLS_CHACHA20_POLY1305_SHA256, CipherSuite.TLS_AES_128_CCM_SHA256, CipherSuite.TLS_AES_256_CCM_8_SHA256, CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, 
        CipherSuite.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256, CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_RSA_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_RSA_WITH_AES_128_CBC_SHA, CipherSuite.TLS_RSA_WITH_AES_256_CBC_SHA, CipherSuite.TLS_RSA_WITH_3DES_EDE_CBC_SHA };
    RESTRICTED_TLS = (new Builder(true)).cipherSuites(RESTRICTED_CIPHER_SUITES).tlsVersions(new TlsVersion[] { TlsVersion.TLS_1_3, TlsVersion.TLS_1_2 }).supportsTlsExtensions(true).build();
    MODERN_TLS = (new Builder(true)).cipherSuites(APPROVED_CIPHER_SUITES).tlsVersions(new TlsVersion[] { TlsVersion.TLS_1_3, TlsVersion.TLS_1_2, TlsVersion.TLS_1_1, TlsVersion.TLS_1_0 }).supportsTlsExtensions(true).build();
    COMPATIBLE_TLS = (new Builder(true)).cipherSuites(APPROVED_CIPHER_SUITES).tlsVersions(new TlsVersion[] { TlsVersion.TLS_1_0 }).supportsTlsExtensions(true).build();
    CLEARTEXT = (new Builder(false)).build();
  }
  
  ConnectionSpec(Builder paramBuilder) {
    this.tls = paramBuilder.tls;
    this.cipherSuites = paramBuilder.cipherSuites;
    this.tlsVersions = paramBuilder.tlsVersions;
    this.supportsTlsExtensions = paramBuilder.supportsTlsExtensions;
  }
  
  private ConnectionSpec supportedSpec(SSLSocket paramSSLSocket, boolean paramBoolean) {
    String[] arrayOfString2;
    String[] arrayOfString3;
    if (this.cipherSuites != null) {
      arrayOfString2 = Util.intersect(CipherSuite.ORDER_BY_NAME, paramSSLSocket.getEnabledCipherSuites(), this.cipherSuites);
    } else {
      arrayOfString2 = paramSSLSocket.getEnabledCipherSuites();
    } 
    if (this.tlsVersions != null) {
      arrayOfString3 = Util.intersect(Util.NATURAL_ORDER, paramSSLSocket.getEnabledProtocols(), this.tlsVersions);
    } else {
      arrayOfString3 = paramSSLSocket.getEnabledProtocols();
    } 
    String[] arrayOfString4 = paramSSLSocket.getSupportedCipherSuites();
    int i = Util.indexOf(CipherSuite.ORDER_BY_NAME, arrayOfString4, "TLS_FALLBACK_SCSV");
    String[] arrayOfString1 = arrayOfString2;
    if (paramBoolean) {
      arrayOfString1 = arrayOfString2;
      if (i != -1)
        arrayOfString1 = Util.concat(arrayOfString2, arrayOfString4[i]); 
    } 
    return (new Builder(this)).cipherSuites(arrayOfString1).tlsVersions(arrayOfString3).build();
  }
  
  void apply(SSLSocket paramSSLSocket, boolean paramBoolean) {
    ConnectionSpec connectionSpec = supportedSpec(paramSSLSocket, paramBoolean);
    String[] arrayOfString2 = connectionSpec.tlsVersions;
    if (arrayOfString2 != null)
      paramSSLSocket.setEnabledProtocols(arrayOfString2); 
    String[] arrayOfString1 = connectionSpec.cipherSuites;
    if (arrayOfString1 != null)
      paramSSLSocket.setEnabledCipherSuites(arrayOfString1); 
  }
  
  public List<CipherSuite> cipherSuites() {
    String[] arrayOfString = this.cipherSuites;
    return (arrayOfString != null) ? CipherSuite.forJavaNames(arrayOfString) : null;
  }
  
  public boolean equals(Object paramObject) {
    if (!(paramObject instanceof ConnectionSpec))
      return false; 
    if (paramObject == this)
      return true; 
    paramObject = paramObject;
    boolean bool = this.tls;
    if (bool != ((ConnectionSpec)paramObject).tls)
      return false; 
    if (bool) {
      if (!Arrays.equals((Object[])this.cipherSuites, (Object[])((ConnectionSpec)paramObject).cipherSuites))
        return false; 
      if (!Arrays.equals((Object[])this.tlsVersions, (Object[])((ConnectionSpec)paramObject).tlsVersions))
        return false; 
      if (this.supportsTlsExtensions != ((ConnectionSpec)paramObject).supportsTlsExtensions)
        return false; 
    } 
    return true;
  }
  
  public int hashCode() {
    return this.tls ? (((527 + Arrays.hashCode((Object[])this.cipherSuites)) * 31 + Arrays.hashCode((Object[])this.tlsVersions)) * 31 + (this.supportsTlsExtensions ^ true)) : 17;
  }
  
  public boolean isCompatible(SSLSocket paramSSLSocket) {
    if (!this.tls)
      return false; 
    String[] arrayOfString = this.tlsVersions;
    if (arrayOfString != null && !Util.nonEmptyIntersection(Util.NATURAL_ORDER, arrayOfString, paramSSLSocket.getEnabledProtocols()))
      return false; 
    arrayOfString = this.cipherSuites;
    return !(arrayOfString != null && !Util.nonEmptyIntersection(CipherSuite.ORDER_BY_NAME, arrayOfString, paramSSLSocket.getEnabledCipherSuites()));
  }
  
  public boolean isTls() {
    return this.tls;
  }
  
  public boolean supportsTlsExtensions() {
    return this.supportsTlsExtensions;
  }
  
  public List<TlsVersion> tlsVersions() {
    String[] arrayOfString = this.tlsVersions;
    return (arrayOfString != null) ? TlsVersion.forJavaNames(arrayOfString) : null;
  }
  
  public String toString() {
    String str1;
    if (!this.tls)
      return "ConnectionSpec()"; 
    String[] arrayOfString = this.cipherSuites;
    String str2 = "[all enabled]";
    if (arrayOfString != null) {
      str1 = cipherSuites().toString();
    } else {
      str1 = "[all enabled]";
    } 
    if (this.tlsVersions != null)
      str2 = tlsVersions().toString(); 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("ConnectionSpec(cipherSuites=");
    stringBuilder.append(str1);
    stringBuilder.append(", tlsVersions=");
    stringBuilder.append(str2);
    stringBuilder.append(", supportsTlsExtensions=");
    stringBuilder.append(this.supportsTlsExtensions);
    stringBuilder.append(")");
    return stringBuilder.toString();
  }
  
  public static final class Builder {
    String[] cipherSuites;
    
    boolean supportsTlsExtensions;
    
    boolean tls;
    
    String[] tlsVersions;
    
    public Builder(ConnectionSpec param1ConnectionSpec) {
      this.tls = param1ConnectionSpec.tls;
      this.cipherSuites = param1ConnectionSpec.cipherSuites;
      this.tlsVersions = param1ConnectionSpec.tlsVersions;
      this.supportsTlsExtensions = param1ConnectionSpec.supportsTlsExtensions;
    }
    
    Builder(boolean param1Boolean) {
      this.tls = param1Boolean;
    }
    
    public Builder allEnabledCipherSuites() {
      if (this.tls) {
        this.cipherSuites = null;
        return this;
      } 
      throw new IllegalStateException("no cipher suites for cleartext connections");
    }
    
    public Builder allEnabledTlsVersions() {
      if (this.tls) {
        this.tlsVersions = null;
        return this;
      } 
      throw new IllegalStateException("no TLS versions for cleartext connections");
    }
    
    public ConnectionSpec build() {
      return new ConnectionSpec(this);
    }
    
    public Builder cipherSuites(String... param1VarArgs) {
      if (this.tls) {
        if (param1VarArgs.length != 0) {
          this.cipherSuites = (String[])param1VarArgs.clone();
          return this;
        } 
        throw new IllegalArgumentException("At least one cipher suite is required");
      } 
      throw new IllegalStateException("no cipher suites for cleartext connections");
    }
    
    public Builder cipherSuites(CipherSuite... param1VarArgs) {
      if (this.tls) {
        String[] arrayOfString = new String[param1VarArgs.length];
        for (int i = 0; i < param1VarArgs.length; i++)
          arrayOfString[i] = (param1VarArgs[i]).javaName; 
        return cipherSuites(arrayOfString);
      } 
      IllegalStateException illegalStateException = new IllegalStateException("no cipher suites for cleartext connections");
      throw illegalStateException;
    }
    
    public Builder supportsTlsExtensions(boolean param1Boolean) {
      if (this.tls) {
        this.supportsTlsExtensions = param1Boolean;
        return this;
      } 
      throw new IllegalStateException("no TLS extensions for cleartext connections");
    }
    
    public Builder tlsVersions(String... param1VarArgs) {
      if (this.tls) {
        if (param1VarArgs.length != 0) {
          this.tlsVersions = (String[])param1VarArgs.clone();
          return this;
        } 
        throw new IllegalArgumentException("At least one TLS version is required");
      } 
      throw new IllegalStateException("no TLS versions for cleartext connections");
    }
    
    public Builder tlsVersions(TlsVersion... param1VarArgs) {
      if (this.tls) {
        String[] arrayOfString = new String[param1VarArgs.length];
        for (int i = 0; i < param1VarArgs.length; i++)
          arrayOfString[i] = (param1VarArgs[i]).javaName; 
        return tlsVersions(arrayOfString);
      } 
      IllegalStateException illegalStateException = new IllegalStateException("no TLS versions for cleartext connections");
      throw illegalStateException;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/okhttp3/ConnectionSpec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */