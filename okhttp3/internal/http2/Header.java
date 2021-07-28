package okhttp3.internal.http2;

import j.f;
import okhttp3.Headers;
import okhttp3.internal.Util;

public final class Header {
  public static final f PSEUDO_PREFIX = f.d(":");
  
  public static final f RESPONSE_STATUS = f.d(":status");
  
  public static final String RESPONSE_STATUS_UTF8 = ":status";
  
  public static final f TARGET_AUTHORITY;
  
  public static final String TARGET_AUTHORITY_UTF8 = ":authority";
  
  public static final f TARGET_METHOD = f.d(":method");
  
  public static final String TARGET_METHOD_UTF8 = ":method";
  
  public static final f TARGET_PATH = f.d(":path");
  
  public static final String TARGET_PATH_UTF8 = ":path";
  
  public static final f TARGET_SCHEME = f.d(":scheme");
  
  public static final String TARGET_SCHEME_UTF8 = ":scheme";
  
  final int hpackSize;
  
  public final f name;
  
  public final f value;
  
  static {
    TARGET_AUTHORITY = f.d(":authority");
  }
  
  public Header(f paramf1, f paramf2) {
    this.name = paramf1;
    this.value = paramf2;
    this.hpackSize = paramf1.s() + 32 + paramf2.s();
  }
  
  public Header(f paramf, String paramString) {
    this(paramf, f.d(paramString));
  }
  
  public Header(String paramString1, String paramString2) {
    this(f.d(paramString1), f.d(paramString2));
  }
  
  public boolean equals(Object paramObject) {
    boolean bool = paramObject instanceof Header;
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (bool) {
      paramObject = paramObject;
      bool1 = bool2;
      if (this.name.equals(((Header)paramObject).name)) {
        bool1 = bool2;
        if (this.value.equals(((Header)paramObject).value))
          bool1 = true; 
      } 
    } 
    return bool1;
  }
  
  public int hashCode() {
    return (527 + this.name.hashCode()) * 31 + this.value.hashCode();
  }
  
  public String toString() {
    return Util.format("%s: %s", new Object[] { this.name.v(), this.value.v() });
  }
  
  static interface Listener {
    void onHeaders(Headers param1Headers);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/okhttp3/internal/http2/Header.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */