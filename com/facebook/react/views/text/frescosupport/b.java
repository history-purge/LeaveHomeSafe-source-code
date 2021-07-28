package com.facebook.react.views.text.frescosupport;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.TextView;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.modules.fresco.a;
import com.facebook.react.uimanager.q;
import com.facebook.react.views.image.d;
import com.facebook.react.views.text.z;
import e.e.j.c.a;
import e.e.j.e.r;
import e.e.j.f.a;
import e.e.j.h.a;
import e.e.l.o.d;

public class b extends z {
  private Drawable c;
  
  private final e.e.j.c.b d;
  
  private final e.e.j.i.b<a> e;
  
  private final Object f;
  
  private int g;
  
  private int h;
  
  private Uri i;
  
  private int j;
  
  private ReadableMap k;
  
  private String l;
  
  private TextView m;
  
  public b(Resources paramResources, int paramInt1, int paramInt2, int paramInt3, Uri paramUri, ReadableMap paramReadableMap, e.e.j.c.b paramb, Object paramObject, String paramString) {
    this.e = new e.e.j.i.b((e.e.j.h.b)e.e.j.f.b.a(paramResources).a());
    this.d = paramb;
    this.f = paramObject;
    this.h = paramInt3;
    if (paramUri == null)
      paramUri = Uri.EMPTY; 
    this.i = paramUri;
    this.k = paramReadableMap;
    this.j = (int)q.b(paramInt2);
    this.g = (int)q.b(paramInt1);
    this.l = paramString;
  }
  
  private r.b a(String paramString) {
    return d.a(paramString);
  }
  
  public Drawable a() {
    return this.c;
  }
  
  public void a(TextView paramTextView) {
    this.m = paramTextView;
  }
  
  public int b() {
    return this.g;
  }
  
  public void c() {
    this.e.f();
  }
  
  public void d() {
    this.e.g();
  }
  
  public void draw(Canvas paramCanvas, CharSequence paramCharSequence, int paramInt1, int paramInt2, float paramFloat, int paramInt3, int paramInt4, int paramInt5, Paint paramPaint) {
    if (this.c == null) {
      a a1 = a.a(d.b(this.i), this.k);
      ((a)this.e.c()).a(a(this.l));
      e.e.j.c.b b1 = this.d;
      b1.k();
      b1.a(this.e.b());
      b1.a(this.f);
      b1.b(a1);
      a a = b1.a();
      this.e.a((a)a);
      this.d.k();
      this.c = this.e.d();
      this.c.setBounds(0, 0, this.j, this.g);
      paramInt1 = this.h;
      if (paramInt1 != 0)
        this.c.setColorFilter(paramInt1, PorterDuff.Mode.SRC_IN); 
      this.c.setCallback((Drawable.Callback)this.m);
    } 
    paramCanvas.save();
    paramInt1 = (int)(paramPaint.descent() - paramPaint.ascent());
    paramCanvas.translate(paramFloat, (paramInt4 + (int)paramPaint.descent() - paramInt1 / 2 - ((this.c.getBounds()).bottom - (this.c.getBounds()).top) / 2));
    this.c.draw(paramCanvas);
    paramCanvas.restore();
  }
  
  public void e() {
    this.e.f();
  }
  
  public void f() {
    this.e.g();
  }
  
  public int getSize(Paint paramPaint, CharSequence paramCharSequence, int paramInt1, int paramInt2, Paint.FontMetricsInt paramFontMetricsInt) {
    if (paramFontMetricsInt != null) {
      paramFontMetricsInt.ascent = -this.g;
      paramFontMetricsInt.descent = 0;
      paramFontMetricsInt.top = paramFontMetricsInt.ascent;
      paramFontMetricsInt.bottom = 0;
    } 
    return this.j;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/text/frescosupport/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */