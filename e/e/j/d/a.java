package e.e.j.d;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import e.e.j.d.b.b;
import e.e.j.e.r;
import java.util.HashMap;
import java.util.Map;

public class a extends Drawable implements b {
  private String c;
  
  private String d;
  
  private int e;
  
  private int f;
  
  private int g;
  
  private String h;
  
  private r.b i;
  
  private HashMap<String, String> j = new HashMap<String, String>();
  
  private int k;
  
  private int l;
  
  private int m = 80;
  
  private final Paint n = new Paint(1);
  
  private final Matrix o = new Matrix();
  
  private final Rect p = new Rect();
  
  private final RectF q = new RectF();
  
  private int r;
  
  private int s;
  
  private int t;
  
  private int u;
  
  private int v;
  
  private long w;
  
  private String x;
  
  public a() {
    a();
  }
  
  private void a(Canvas paramCanvas, String paramString, Object... paramVarArgs) {
    if (paramVarArgs != null)
      paramString = String.format(paramString, paramVarArgs); 
    paramCanvas.drawText(paramString, this.u, this.v, this.n);
    this.v += this.t;
  }
  
  private void a(Rect paramRect, int paramInt1, int paramInt2) {
    paramInt1 = Math.min(40, Math.max(10, Math.min(paramRect.width() / paramInt2, paramRect.height() / paramInt1)));
    this.n.setTextSize(paramInt1);
    this.t = paramInt1 + 8;
    if (this.m == 80)
      this.t *= -1; 
    this.r = paramRect.left + 10;
    if (this.m == 80) {
      paramInt1 = paramRect.bottom - 10;
    } else {
      paramInt1 = paramRect.top + 10 + 10;
    } 
    this.s = paramInt1;
  }
  
  int a(int paramInt1, int paramInt2, r.b paramb) {
    int j = getBounds().width();
    int i = getBounds().height();
    if (j > 0 && i > 0 && paramInt1 > 0) {
      if (paramInt2 <= 0)
        return 1727284022; 
      int m = j;
      int k = i;
      if (paramb != null) {
        Rect rect = this.p;
        rect.top = 0;
        rect.left = 0;
        rect.right = j;
        rect.bottom = i;
        this.o.reset();
        paramb.a(this.o, this.p, paramInt1, paramInt2, 0.0F, 0.0F);
        RectF rectF = this.q;
        rectF.top = 0.0F;
        rectF.left = 0.0F;
        rectF.right = paramInt1;
        rectF.bottom = paramInt2;
        this.o.mapRect(rectF);
        m = (int)this.q.width();
        k = (int)this.q.height();
        m = Math.min(j, m);
        k = Math.min(i, k);
      } 
      float f1 = m;
      float f2 = k;
      paramInt1 = Math.abs(paramInt1 - m);
      paramInt2 = Math.abs(paramInt2 - k);
      float f3 = paramInt1;
      if (f3 < f1 * 0.1F && paramInt2 < 0.1F * f2)
        return 1716301648; 
      if (f3 < f1 * 0.5F && paramInt2 < f2 * 0.5F)
        return 1728026624; 
    } 
    return 1727284022;
  }
  
  public void a() {
    this.e = -1;
    this.f = -1;
    this.g = -1;
    this.j = new HashMap<String, String>();
    this.k = -1;
    this.l = -1;
    this.h = null;
    a((String)null);
    this.w = -1L;
    this.x = null;
    invalidateSelf();
  }
  
  public void a(int paramInt) {
    this.g = paramInt;
  }
  
  public void a(int paramInt1, int paramInt2) {
    this.e = paramInt1;
    this.f = paramInt2;
    invalidateSelf();
  }
  
  public void a(long paramLong) {
    this.w = paramLong;
    invalidateSelf();
  }
  
  public void a(r.b paramb) {
    this.i = paramb;
  }
  
  public void a(String paramString) {
    if (paramString == null)
      paramString = "none"; 
    this.c = paramString;
    invalidateSelf();
  }
  
  public void b(String paramString) {
    this.x = paramString;
    invalidateSelf();
  }
  
  public void draw(Canvas paramCanvas) {
    Rect rect = getBounds();
    this.n.setStyle(Paint.Style.STROKE);
    this.n.setStrokeWidth(2.0F);
    this.n.setColor(-26624);
    paramCanvas.drawRect(rect.left, rect.top, rect.right, rect.bottom, this.n);
    this.n.setStyle(Paint.Style.FILL);
    this.n.setColor(a(this.e, this.f, this.i));
    paramCanvas.drawRect(rect.left, rect.top, rect.right, rect.bottom, this.n);
    this.n.setStyle(Paint.Style.FILL);
    this.n.setStrokeWidth(0.0F);
    this.n.setColor(-1);
    this.u = this.r;
    this.v = this.s;
    String str3 = this.d;
    if (str3 != null) {
      a(paramCanvas, "IDs: %s, %s", new Object[] { this.c, str3 });
    } else {
      a(paramCanvas, "ID: %s", new Object[] { this.c });
    } 
    a(paramCanvas, "D: %dx%d", new Object[] { Integer.valueOf(rect.width()), Integer.valueOf(rect.height()) });
    a(paramCanvas, "I: %dx%d", new Object[] { Integer.valueOf(this.e), Integer.valueOf(this.f) });
    a(paramCanvas, "I: %d KiB", new Object[] { Integer.valueOf(this.g / 1024) });
    String str2 = this.h;
    if (str2 != null)
      a(paramCanvas, "i format: %s", new Object[] { str2 }); 
    int i = this.k;
    if (i > 0)
      a(paramCanvas, "anim: f %d, l %d", new Object[] { Integer.valueOf(i), Integer.valueOf(this.l) }); 
    r.b b1 = this.i;
    if (b1 != null)
      a(paramCanvas, "scale: %s", new Object[] { b1 }); 
    long l = this.w;
    if (l >= 0L)
      a(paramCanvas, "t: %d ms", new Object[] { Long.valueOf(l) }); 
    String str1 = this.x;
    if (str1 != null)
      a(paramCanvas, "origin: %s", new Object[] { str1 }); 
    for (Map.Entry<String, String> entry : this.j.entrySet()) {
      a(paramCanvas, "%s: %s", new Object[] { entry.getKey(), entry.getValue() });
    } 
  }
  
  public int getOpacity() {
    return -3;
  }
  
  protected void onBoundsChange(Rect paramRect) {
    super.onBoundsChange(paramRect);
    a(paramRect, 9, 8);
  }
  
  public void setAlpha(int paramInt) {}
  
  public void setColorFilter(ColorFilter paramColorFilter) {}
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/j/d/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */