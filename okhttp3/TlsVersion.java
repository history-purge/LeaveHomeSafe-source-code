package okhttp3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public enum TlsVersion {
  SSL_3_0,
  TLS_1_0,
  TLS_1_1,
  TLS_1_2,
  TLS_1_3("TLSv1.3");
  
  final String javaName;
  
  static {
    TLS_1_2 = new TlsVersion("TLS_1_2", 1, "TLSv1.2");
    TLS_1_1 = new TlsVersion("TLS_1_1", 2, "TLSv1.1");
    TLS_1_0 = new TlsVersion("TLS_1_0", 3, "TLSv1");
    SSL_3_0 = new TlsVersion("SSL_3_0", 4, "SSLv3");
    $VALUES = new TlsVersion[] { TLS_1_3, TLS_1_2, TLS_1_1, TLS_1_0, SSL_3_0 };
  }
  
  TlsVersion(String paramString1) {
    this.javaName = paramString1;
  }
  
  public static TlsVersion forJavaName(String paramString) {
    int i = paramString.hashCode();
    if (i != 79201641) {
      if (i != 79923350) {
        switch (i) {
          default:
            i = -1;
            break;
          case -503070501:
            if (paramString.equals("TLSv1.3")) {
              i = 0;
              break;
            } 
          case -503070502:
            if (paramString.equals("TLSv1.2")) {
              i = 1;
              break;
            } 
          case -503070503:
            if (paramString.equals("TLSv1.1")) {
              i = 2;
              break;
            } 
        } 
      } else if (paramString.equals("TLSv1")) {
        i = 3;
      } else {
      
      } 
    } else if (paramString.equals("SSLv3")) {
      i = 4;
    } else {
    
    } 
    if (i != 0) {
      if (i != 1) {
        if (i != 2) {
          if (i != 3) {
            if (i == 4)
              return SSL_3_0; 
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unexpected TLS version: ");
            stringBuilder.append(paramString);
            throw new IllegalArgumentException(stringBuilder.toString());
          } 
          return TLS_1_0;
        } 
        return TLS_1_1;
      } 
      return TLS_1_2;
    } 
    return TLS_1_3;
  }
  
  static List<TlsVersion> forJavaNames(String... paramVarArgs) {
    ArrayList<TlsVersion> arrayList = new ArrayList(paramVarArgs.length);
    int j = paramVarArgs.length;
    for (int i = 0; i < j; i++)
      arrayList.add(forJavaName(paramVarArgs[i])); 
    return Collections.unmodifiableList(arrayList);
  }
  
  public String javaName() {
    return this.javaName;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/okhttp3/TlsVersion.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */