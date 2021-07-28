package e.f.a.f.t;

import android.content.Context;
import android.graphics.Color;
import e.f.a.f.b;
import e.f.a.f.x.b;

public class a {
  private final boolean a;
  
  private final int b;
  
  private final int c;
  
  private final float d;
  
  public a(Context paramContext) {
    this.a = b.a(paramContext, b.elevationOverlayEnabled, false);
    this.b = e.f.a.f.q.a.a(paramContext, b.elevationOverlayColor, 0);
    this.c = e.f.a.f.q.a.a(paramContext, b.colorSurface, 0);
    this.d = (paramContext.getResources().getDisplayMetrics()).density;
  }
  
  private boolean a(int paramInt) {
    return (b.g.f.a.c(paramInt, 255) == this.c);
  }
  
  public float a(float paramFloat) {
    float f = this.d;
    return (f > 0.0F) ? ((paramFloat <= 0.0F) ? 0.0F : Math.min(((float)Math.log1p((paramFloat / f)) * 4.5F + 2.0F) / 100.0F, 1.0F)) : 0.0F;
  }
  
  public int a(int paramInt, float paramFloat) {
    paramFloat = a(paramFloat);
    int i = Color.alpha(paramInt);
    return b.g.f.a.c(e.f.a.f.q.a.a(b.g.f.a.c(paramInt, 255), this.b, paramFloat), i);
  }
  
  public boolean a() {
    return this.a;
  }
  
  public int b(int paramInt, float paramFloat) {
    int i = paramInt;
    if (this.a) {
      i = paramInt;
      if (a(paramInt))
        i = a(paramInt, paramFloat); 
    } 
    return i;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/f/t/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */