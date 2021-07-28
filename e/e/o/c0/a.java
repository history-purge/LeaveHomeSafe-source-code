package e.e.o.c0;

import com.facebook.react.bridge.WritableMap;

public class a {
  private final String a;
  
  private final WritableMap b;
  
  private final long c;
  
  private final boolean d;
  
  private final d e;
  
  public a(a parama) {
    this.a = parama.a;
    this.b = parama.b.copy();
    this.c = parama.c;
    this.d = parama.d;
    d d1 = parama.e;
    if (d1 != null) {
      d1.copy();
    } else {
      d1 = null;
    } 
    this.e = d1;
  }
  
  public a(String paramString, WritableMap paramWritableMap, long paramLong) {
    this(paramString, paramWritableMap, paramLong, false);
  }
  
  public a(String paramString, WritableMap paramWritableMap, long paramLong, boolean paramBoolean) {
    this(paramString, paramWritableMap, paramLong, paramBoolean, e.a);
  }
  
  public a(String paramString, WritableMap paramWritableMap, long paramLong, boolean paramBoolean, d paramd) {
    this.a = paramString;
    this.b = paramWritableMap;
    this.c = paramLong;
    this.d = paramBoolean;
    this.e = paramd;
  }
  
  WritableMap a() {
    return this.b;
  }
  
  d b() {
    return this.e;
  }
  
  String c() {
    return this.a;
  }
  
  long d() {
    return this.c;
  }
  
  boolean e() {
    return this.d;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/o/c0/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */