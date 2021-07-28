package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.net.Uri;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import e.e.e.b.f;
import e.e.g.c;
import e.e.g.e;
import e.e.j.a.a.c;
import e.e.l.f.h;
import e.e.l.g.b;
import e.e.l.k.b;
import e.e.l.o.c;
import e.e.o.i0.b.c;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

@SuppressLint({"ViewConstructor"})
class m extends b0 {
  private c0 K0;
  
  private c0 L0;
  
  private c0 M0;
  
  private c0 N0;
  
  private String O0;
  
  private int P0;
  
  private int Q0;
  
  private String R0;
  
  private int S0;
  
  private final AtomicBoolean T0 = new AtomicBoolean(false);
  
  public m(ReactContext paramReactContext) {
    super(paramReactContext);
  }
  
  private void a(Canvas paramCanvas, Paint paramPaint, Bitmap paramBitmap, float paramFloat) {
    if (this.P0 == 0 || this.Q0 == 0) {
      this.P0 = paramBitmap.getWidth();
      this.Q0 = paramBitmap.getHeight();
    } 
    RectF rectF2 = k();
    RectF rectF1 = new RectF(0.0F, 0.0F, this.P0, this.Q0);
    w0.a(rectF1, rectF2, this.R0, this.S0).mapRect(rectF1);
    paramCanvas.clipPath(c(paramCanvas, paramPaint));
    Path path = b(paramCanvas, paramPaint);
    if (path != null)
      paramCanvas.clipPath(path); 
    Paint paint = new Paint();
    paint.setAlpha((int)(paramFloat * 255.0F));
    paramCanvas.drawBitmap(paramBitmap, null, rectF1, paint);
    this.w.mapRect(rectF1);
    setClientRect(rectF1);
  }
  
  private void a(h paramh, c paramc) {
    this.T0.set(true);
    paramh.a(paramc, this.u).a((e)new a(this), (Executor)f.b());
  }
  
  private void a(h paramh, c paramc, Canvas paramCanvas, Paint paramPaint, float paramFloat) {
    c c1 = paramh.b(paramc, this.u);
    try {
      e.e.e.h.a a = (e.e.e.h.a)c1.a();
      if (a == null) {
        c1.close();
        return;
      } 
      try {
        b b = (b)a.b();
        boolean bool = b instanceof e.e.l.k.a;
        if (!bool) {
          e.e.e.h.a.b(a);
          c1.close();
          return;
        } 
        Bitmap bitmap = ((e.e.l.k.a)b).r();
        if (bitmap == null) {
          e.e.e.h.a.b(a);
          c1.close();
          return;
        } 
        a(paramCanvas, paramPaint, bitmap, paramFloat);
        e.e.e.h.a.b(a);
        c1.close();
        return;
      } catch (Exception exception) {
        throw new IllegalStateException(exception);
      } finally {}
      e.e.e.h.a.b(a);
      throw paramCanvas;
    } catch (Exception exception) {
      throw new IllegalStateException(exception);
    } finally {}
    c1.close();
    throw paramc;
  }
  
  private RectF k() {
    double d4 = c(this.K0);
    double d5 = a(this.L0);
    double d2 = c(this.M0);
    double d3 = a(this.N0);
    double d1 = d2;
    if (d2 == 0.0D)
      d1 = (this.P0 * this.L); 
    d2 = d3;
    if (d3 == 0.0D)
      d2 = (this.Q0 * this.L); 
    return new RectF((float)d4, (float)d5, (float)(d4 + d1), (float)(d5 + d2));
  }
  
  void a(Canvas paramCanvas, Paint paramPaint, float paramFloat) {
    if (!this.T0.get()) {
      h h = c.a();
      c c = c.a((new e.e.o.i0.b.a((Context)this.u, this.O0)).c());
      if (h.a(c)) {
        a(h, c, paramCanvas, paramPaint, paramFloat * this.v);
        return;
      } 
      a(h, c);
    } 
  }
  
  Path c(Canvas paramCanvas, Paint paramPaint) {
    this.b0 = new Path();
    this.b0.addRect(k(), Path.Direction.CW);
    return this.b0;
  }
  
  @com.facebook.react.uimanager.e1.a(name = "align")
  public void setAlign(String paramString) {
    this.R0 = paramString;
    invalidate();
  }
  
  @com.facebook.react.uimanager.e1.a(name = "height")
  public void setHeight(Dynamic paramDynamic) {
    this.N0 = c0.b(paramDynamic);
    invalidate();
  }
  
  @com.facebook.react.uimanager.e1.a(name = "meetOrSlice")
  public void setMeetOrSlice(int paramInt) {
    this.S0 = paramInt;
    invalidate();
  }
  
  @com.facebook.react.uimanager.e1.a(name = "src")
  public void setSrc(ReadableMap paramReadableMap) {
    if (paramReadableMap != null) {
      this.O0 = paramReadableMap.getString("uri");
      String str = this.O0;
      if (str != null) {
        boolean bool;
        if (str.isEmpty())
          return; 
        if (paramReadableMap.hasKey("width") && paramReadableMap.hasKey("height")) {
          this.P0 = paramReadableMap.getInt("width");
          bool = paramReadableMap.getInt("height");
        } else {
          bool = false;
          this.P0 = 0;
        } 
        this.Q0 = bool;
        if (Uri.parse(this.O0).getScheme() == null)
          c.a().c((Context)this.u, this.O0); 
      } 
    } 
  }
  
  @com.facebook.react.uimanager.e1.a(name = "width")
  public void setWidth(Dynamic paramDynamic) {
    this.M0 = c0.b(paramDynamic);
    invalidate();
  }
  
  @com.facebook.react.uimanager.e1.a(name = "x")
  public void setX(Dynamic paramDynamic) {
    this.K0 = c0.b(paramDynamic);
    invalidate();
  }
  
  @com.facebook.react.uimanager.e1.a(name = "y")
  public void setY(Dynamic paramDynamic) {
    this.L0 = c0.b(paramDynamic);
    invalidate();
  }
  
  class a extends b {
    a(m this$0) {}
    
    public void a(Bitmap param1Bitmap) {
      m.a(this.a).set(false);
      f0 f0 = this.a.getSvgView();
      if (f0 != null)
        f0.invalidate(); 
    }
    
    public void e(c param1c) {
      m.a(this.a).set(false);
      e.e.e.e.a.a("ReactNative", param1c.e(), "RNSVG: fetchDecodedImage failed!", new Object[0]);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/horcrux/svg/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */