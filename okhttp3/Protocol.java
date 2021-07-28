package okhttp3;

import java.io.IOException;

public enum Protocol {
  H2_PRIOR_KNOWLEDGE,
  HTTP_1_0("http/1.0"),
  HTTP_1_1("http/1.1"),
  HTTP_2("http/1.1"),
  QUIC("http/1.1"),
  SPDY_3("spdy/3.1");
  
  private final String protocol;
  
  static {
    HTTP_2 = new Protocol("HTTP_2", 3, "h2");
    H2_PRIOR_KNOWLEDGE = new Protocol("H2_PRIOR_KNOWLEDGE", 4, "h2_prior_knowledge");
    QUIC = new Protocol("QUIC", 5, "quic");
    $VALUES = new Protocol[] { HTTP_1_0, HTTP_1_1, SPDY_3, HTTP_2, H2_PRIOR_KNOWLEDGE, QUIC };
  }
  
  Protocol(String paramString1) {
    this.protocol = paramString1;
  }
  
  public static Protocol get(String paramString) {
    if (paramString.equals(HTTP_1_0.protocol))
      return HTTP_1_0; 
    if (paramString.equals(HTTP_1_1.protocol))
      return HTTP_1_1; 
    if (paramString.equals(H2_PRIOR_KNOWLEDGE.protocol))
      return H2_PRIOR_KNOWLEDGE; 
    if (paramString.equals(HTTP_2.protocol))
      return HTTP_2; 
    if (paramString.equals(SPDY_3.protocol))
      return SPDY_3; 
    if (paramString.equals(QUIC.protocol))
      return QUIC; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Unexpected protocol: ");
    stringBuilder.append(paramString);
    throw new IOException(stringBuilder.toString());
  }
  
  public String toString() {
    return this.protocol;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/okhttp3/Protocol.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */