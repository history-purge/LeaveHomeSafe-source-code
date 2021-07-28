package e.e.o.i0.b;

import android.content.Context;
import android.net.Uri;

public class a {
  private Uri a;
  
  private String b;
  
  private double c;
  
  private boolean d;
  
  public a(Context paramContext, String paramString) {
    this(paramContext, paramString, 0.0D, 0.0D);
  }
  
  public a(Context paramContext, String paramString, double paramDouble1, double paramDouble2) {
    this.b = paramString;
    this.c = paramDouble1 * paramDouble2;
    this.a = b(paramContext);
  }
  
  private Uri a(Context paramContext) {
    this.d = true;
    return c.a().c(paramContext, this.b);
  }
  
  private Uri b(Context paramContext) {
    try {
      Uri uri2 = Uri.parse(this.b);
      Uri uri1 = uri2;
      if (uri2.getScheme() == null)
        uri1 = a(paramContext); 
      return uri1;
    } catch (Exception exception) {
      return a(paramContext);
    } 
  }
  
  public double a() {
    return this.c;
  }
  
  public String b() {
    return this.b;
  }
  
  public Uri c() {
    Uri uri = this.a;
    e.e.m.a.a.a(uri);
    return uri;
  }
  
  public boolean d() {
    return this.d;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/o/i0/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */