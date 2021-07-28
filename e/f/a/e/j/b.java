package e.f.a.e.j;

import android.net.Uri;
import com.google.android.gms.common.api.a;
import e.f.a.e.i.l.d;
import e.f.a.e.i.l.e;

public final class b {
  private static final a.g<e> a = new a.g();
  
  private static final a.a<e, a.d.d> b = new h();
  
  static {
    new a("Phenotype.API", b, a);
    new d();
  }
  
  public static Uri a(String paramString) {
    paramString = String.valueOf(Uri.encode(paramString));
    if (paramString.length() != 0) {
      paramString = "content://com.google.android.gms.phenotype/".concat(paramString);
    } else {
      paramString = new String("content://com.google.android.gms.phenotype/");
    } 
    return Uri.parse(paramString);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/j/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */