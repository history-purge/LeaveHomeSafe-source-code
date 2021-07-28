package okhttp3;

import java.nio.charset.Charset;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import okhttp3.internal.Util;

public final class Challenge {
  private final Map<String, String> authParams;
  
  private final String scheme;
  
  public Challenge(String paramString1, String paramString2) {
    if (paramString1 != null) {
      if (paramString2 != null) {
        this.scheme = paramString1;
        this.authParams = Collections.singletonMap("realm", paramString2);
        return;
      } 
      throw new NullPointerException("realm == null");
    } 
    throw new NullPointerException("scheme == null");
  }
  
  public Challenge(String paramString, Map<String, String> paramMap) {
    if (paramString != null) {
      if (paramMap != null) {
        this.scheme = paramString;
        LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>();
        for (Map.Entry<String, String> entry : paramMap.entrySet()) {
          if (entry.getKey() == null) {
            paramString = null;
          } else {
            paramString = ((String)entry.getKey()).toLowerCase(Locale.US);
          } 
          linkedHashMap.put(paramString, entry.getValue());
        } 
        this.authParams = Collections.unmodifiableMap(linkedHashMap);
        return;
      } 
      throw new NullPointerException("authParams == null");
    } 
    NullPointerException nullPointerException = new NullPointerException("scheme == null");
    throw nullPointerException;
  }
  
  public Map<String, String> authParams() {
    return this.authParams;
  }
  
  public Charset charset() {
    String str = this.authParams.get("charset");
    if (str != null)
      try {
        return Charset.forName(str);
      } catch (Exception exception) {} 
    return Util.ISO_8859_1;
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject instanceof Challenge) {
      paramObject = paramObject;
      if (((Challenge)paramObject).scheme.equals(this.scheme) && ((Challenge)paramObject).authParams.equals(this.authParams))
        return true; 
    } 
    return false;
  }
  
  public int hashCode() {
    return (899 + this.scheme.hashCode()) * 31 + this.authParams.hashCode();
  }
  
  public String realm() {
    return this.authParams.get("realm");
  }
  
  public String scheme() {
    return this.scheme;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(this.scheme);
    stringBuilder.append(" authParams=");
    stringBuilder.append(this.authParams);
    return stringBuilder.toString();
  }
  
  public Challenge withCharset(Charset paramCharset) {
    if (paramCharset != null) {
      LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<String, String>(this.authParams);
      linkedHashMap.put("charset", paramCharset.name());
      return new Challenge(this.scheme, linkedHashMap);
    } 
    throw new NullPointerException("charset == null");
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/okhttp3/Challenge.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */