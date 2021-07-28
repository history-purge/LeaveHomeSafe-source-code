package b.g.f;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import b.d.e;
import b.g.e.d.c;
import b.g.e.d.f;
import b.g.k.b;

@SuppressLint({"NewApi"})
public class d {
  private static final j a;
  
  private static final e<String, Typeface> b = new e(16);
  
  public static Typeface a(Context paramContext, Resources paramResources, int paramInt1, String paramString, int paramInt2) {
    Typeface typeface = a.a(paramContext, paramResources, paramInt1, paramString, paramInt2);
    if (typeface != null) {
      String str = a(paramResources, paramInt1, paramInt2);
      b.a(str, typeface);
    } 
    return typeface;
  }
  
  public static Typeface a(Context paramContext, Typeface paramTypeface, int paramInt) {
    if (paramContext != null) {
      if (Build.VERSION.SDK_INT < 21) {
        Typeface typeface = b(paramContext, paramTypeface, paramInt);
        if (typeface != null)
          return typeface; 
      } 
      return Typeface.create(paramTypeface, paramInt);
    } 
    throw new IllegalArgumentException("Context cannot be null");
  }
  
  public static Typeface a(Context paramContext, CancellationSignal paramCancellationSignal, b.f[] paramArrayOff, int paramInt) {
    return a.a(paramContext, paramCancellationSignal, paramArrayOff, paramInt);
  }
  
  public static Typeface a(Context paramContext, c.a parama, Resources paramResources, int paramInt1, int paramInt2, f.a parama1, Handler paramHandler, boolean paramBoolean) {
    Typeface typeface;
    c.d d1;
    if (parama instanceof c.d) {
      byte b;
      d1 = (c.d)parama;
      boolean bool = false;
      if (paramBoolean ? (d1.a() == 0) : (parama1 == null))
        bool = true; 
      if (paramBoolean) {
        b = d1.c();
      } else {
        b = -1;
      } 
      typeface = b.a(paramContext, d1.b(), parama1, paramHandler, bool, b, paramInt2);
    } else {
      Typeface typeface1 = a.a((Context)typeface, (c.b)d1, paramResources, paramInt2);
      typeface = typeface1;
      if (parama1 != null)
        if (typeface1 != null) {
          parama1.a(typeface1, paramHandler);
          typeface = typeface1;
        } else {
          parama1.a(-3, paramHandler);
          typeface = typeface1;
        }  
    } 
    if (typeface != null)
      b.a(a(paramResources, paramInt1, paramInt2), typeface); 
    return typeface;
  }
  
  private static String a(Resources paramResources, int paramInt1, int paramInt2) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramResources.getResourcePackageName(paramInt1));
    stringBuilder.append("-");
    stringBuilder.append(paramInt1);
    stringBuilder.append("-");
    stringBuilder.append(paramInt2);
    return stringBuilder.toString();
  }
  
  private static Typeface b(Context paramContext, Typeface paramTypeface, int paramInt) {
    c.b b = a.a(paramTypeface);
    return (b == null) ? null : a.a(paramContext, b, paramContext.getResources(), paramInt);
  }
  
  public static Typeface b(Resources paramResources, int paramInt1, int paramInt2) {
    return (Typeface)b.b(a(paramResources, paramInt1, paramInt2));
  }
  
  static {
    j j1;
    int i = Build.VERSION.SDK_INT;
    if (i >= 29) {
      j1 = new i();
    } else if (i >= 28) {
      j1 = new h();
    } else if (i >= 26) {
      j1 = new g();
    } else if (i >= 24 && f.a()) {
      j1 = new f();
    } else if (Build.VERSION.SDK_INT >= 21) {
      j1 = new e();
    } else {
      j1 = new j();
    } 
    a = j1;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/g/f/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */