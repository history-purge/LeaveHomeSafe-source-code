package okhttp3.internal.tls;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import okhttp3.internal.Util;

public final class OkHostnameVerifier implements HostnameVerifier {
  private static final int ALT_DNS_NAME = 2;
  
  private static final int ALT_IPA_NAME = 7;
  
  public static final OkHostnameVerifier INSTANCE = new OkHostnameVerifier();
  
  public static List<String> allSubjectAltNames(X509Certificate paramX509Certificate) {
    List<String> list2 = getSubjectAltNames(paramX509Certificate, 7);
    List<String> list1 = getSubjectAltNames(paramX509Certificate, 2);
    ArrayList<String> arrayList = new ArrayList(list2.size() + list1.size());
    arrayList.addAll(list2);
    arrayList.addAll(list1);
    return arrayList;
  }
  
  private static List<String> getSubjectAltNames(X509Certificate paramX509Certificate, int paramInt) {
    ArrayList<String> arrayList = new ArrayList();
    try {
      Collection<List<?>> collection = paramX509Certificate.getSubjectAlternativeNames();
      if (collection == null)
        return Collections.emptyList(); 
      for (List<Integer> list : collection) {
        if (list == null || list.size() < 2)
          continue; 
        Integer integer = list.get(0);
        if (integer != null && integer.intValue() == paramInt) {
          String str = (String)list.get(1);
          if (str != null)
            arrayList.add(str); 
        } 
      } 
      return arrayList;
    } catch (CertificateParsingException certificateParsingException) {
      return Collections.emptyList();
    } 
  }
  
  private boolean verifyHostname(String paramString, X509Certificate paramX509Certificate) {
    paramString = paramString.toLowerCase(Locale.US);
    Iterator<String> iterator = getSubjectAltNames(paramX509Certificate, 2).iterator();
    while (iterator.hasNext()) {
      if (verifyHostname(paramString, iterator.next()))
        return true; 
    } 
    return false;
  }
  
  private boolean verifyIpAddress(String paramString, X509Certificate paramX509Certificate) {
    List<String> list = getSubjectAltNames(paramX509Certificate, 7);
    int j = list.size();
    for (int i = 0; i < j; i++) {
      if (paramString.equalsIgnoreCase(list.get(i)))
        return true; 
    } 
    return false;
  }
  
  public boolean verify(String paramString, X509Certificate paramX509Certificate) {
    return Util.verifyAsIpAddress(paramString) ? verifyIpAddress(paramString, paramX509Certificate) : verifyHostname(paramString, paramX509Certificate);
  }
  
  public boolean verify(String paramString, SSLSession paramSSLSession) {
    try {
      return verify(paramString, (X509Certificate)paramSSLSession.getPeerCertificates()[0]);
    } catch (SSLException sSLException) {
      return false;
    } 
  }
  
  public boolean verifyHostname(String paramString1, String paramString2) {
    if (paramString1 != null && paramString1.length() != 0 && !paramString1.startsWith(".")) {
      if (paramString1.endsWith(".."))
        return false; 
      if (paramString2 != null && paramString2.length() != 0 && !paramString2.startsWith(".")) {
        if (paramString2.endsWith(".."))
          return false; 
        String str2 = paramString1;
        if (!paramString1.endsWith(".")) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append(paramString1);
          stringBuilder.append('.');
          str2 = stringBuilder.toString();
        } 
        paramString1 = paramString2;
        if (!paramString2.endsWith(".")) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append(paramString2);
          stringBuilder.append('.');
          str1 = stringBuilder.toString();
        } 
        String str1 = str1.toLowerCase(Locale.US);
        if (!str1.contains("*"))
          return str2.equals(str1); 
        if (str1.startsWith("*.")) {
          if (str1.indexOf('*', 1) != -1)
            return false; 
          if (str2.length() < str1.length())
            return false; 
          if ("*.".equals(str1))
            return false; 
          str1 = str1.substring(1);
          if (!str2.endsWith(str1))
            return false; 
          int i = str2.length() - str1.length();
          return !(i > 0 && str2.lastIndexOf('.', i - 1) != -1);
        } 
      } 
    } 
    return false;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/okhttp3/internal/tls/OkHostnameVerifier.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */