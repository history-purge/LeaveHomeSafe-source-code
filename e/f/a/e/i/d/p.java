package e.f.a.e.i.d;

import android.net.Uri;

public final class p {
  private final String a;
  
  private final Uri b;
  
  private final String c;
  
  private final String d;
  
  private final boolean e;
  
  private final boolean f;
  
  public p(Uri paramUri) {
    this(null, paramUri, "", "", false, false);
  }
  
  private p(String paramString1, Uri paramUri, String paramString2, String paramString3, boolean paramBoolean1, boolean paramBoolean2) {
    this.a = paramString1;
    this.b = paramUri;
    this.c = paramString2;
    this.d = paramString3;
    this.e = paramBoolean1;
    this.f = paramBoolean2;
  }
  
  public final <T> f<T> a(String paramString, T paramT, o<T> paramo) {
    return f.b(this, paramString, paramT, paramo);
  }
  
  public final f<String> a(String paramString1, String paramString2) {
    return f.b(this, paramString1, (String)null);
  }
  
  public final f<Boolean> a(String paramString, boolean paramBoolean) {
    return f.b(this, paramString, false);
  }
  
  public final p a(String paramString) {
    boolean bool = this.e;
    if (!bool)
      return new p(this.a, this.b, paramString, this.d, bool, this.f); 
    throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
  }
  
  public final p b(String paramString) {
    return new p(this.a, this.b, this.c, paramString, this.e, this.f);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/d/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */