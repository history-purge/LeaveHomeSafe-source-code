package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Xfermode;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.JavaOnlyArray;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.r;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class b0 extends x0 {
  static b0 I0;
  
  private static final Pattern J0 = Pattern.compile("[0-9.-]+");
  
  public Paint.Join A0 = Paint.Join.MITER;
  
  public ReadableArray B0;
  
  public float C0 = 1.0F;
  
  public Path.FillType D0 = Path.FillType.WINDING;
  
  private ArrayList<String> E0;
  
  private ArrayList<Object> F0;
  
  private ArrayList<String> G0;
  
  private ArrayList<String> H0;
  
  public int s0 = 0;
  
  public ReadableArray t0;
  
  public c0[] u0;
  
  public c0 v0 = new c0(1.0D);
  
  public float w0 = 1.0F;
  
  public float x0 = 4.0F;
  
  public float y0 = 0.0F;
  
  public Paint.Cap z0 = Paint.Cap.BUTT;
  
  b0(ReactContext paramReactContext) {
    super(paramReactContext);
    setPivotX(0.0F);
    setPivotY(0.0F);
  }
  
  private static double a(double paramDouble) {
    if (paramDouble <= 0.0D)
      return 0.0D; 
    double d = paramDouble;
    if (paramDouble >= 1.0D)
      d = 1.0D; 
    return d;
  }
  
  private void a(Paint paramPaint, float paramFloat, ReadableArray paramReadableArray) {
    a a;
    int i = paramReadableArray.getInt(0);
    if (i != 0) {
      ReadableArray readableArray;
      if (i != 1) {
        if (i != 2) {
          if (i != 3) {
            if (i != 4)
              return; 
            b0 b01 = I0;
            if (b01 != null) {
              readableArray = b01.t0;
              if (readableArray != null) {
                a(paramPaint, paramFloat, readableArray);
                return;
              } 
            } 
          } else {
            b0 b01 = I0;
            if (b01 != null) {
              readableArray = b01.B0;
              if (readableArray != null) {
                a(paramPaint, paramFloat, readableArray);
                return;
              } 
            } 
          } 
        } else {
          i = (getSvgView()).P;
          paramPaint.setColor(i);
        } 
      } else {
        a = getSvgView().a(readableArray.getString(1));
        if (a != null) {
          a.a(paramPaint, this.g0, this.L, paramFloat);
          return;
        } 
      } 
    } else {
      if (a.size() == 2) {
        i = a.getInt(1);
        i = Math.round((i >>> 24) * paramFloat) << 24 | i & 0xFFFFFF;
      } else {
        double d;
        if (a.size() > 4) {
          d = a.getDouble(4);
          double d1 = paramFloat;
          Double.isNaN(d1);
          d = d * d1 * 255.0D;
        } else {
          d = (paramFloat * 255.0F);
        } 
        paramPaint.setARGB((int)d, (int)(a.getDouble(1) * 255.0D), (int)(a.getDouble(2) * 255.0D), (int)(a.getDouble(3) * 255.0D));
        return;
      } 
      paramPaint.setColor(i);
    } 
  }
  
  private boolean a(String paramString) {
    ArrayList<String> arrayList = this.H0;
    return (arrayList != null && arrayList.contains(paramString));
  }
  
  private ArrayList<String> getAttributeList() {
    return this.H0;
  }
  
  int a(float[] paramArrayOffloat) {
    if (this.b0 != null && this.C) {
      if (!this.D)
        return -1; 
      if (this.q0 == r.c)
        return -1; 
      float[] arrayOfFloat = new float[2];
      this.A.mapPoints(arrayOfFloat, paramArrayOffloat);
      this.B.mapPoints(arrayOfFloat);
      int i = Math.round(arrayOfFloat[0]);
      int j = Math.round(arrayOfFloat[1]);
      i();
      Region region = this.l0;
      if (region == null || !region.contains(i, j)) {
        region = this.n0;
        if (region != null) {
          if (!region.contains(i, j)) {
            region = this.m0;
            if (region != null) {
              if (!region.contains(i, j))
                return -1; 
            } else {
              return -1;
            } 
          } 
        } else {
          return -1;
        } 
      } 
      return (getClipPath() != null && !this.o0.contains(i, j)) ? -1 : getId();
    } 
    return -1;
  }
  
  Region a(Path paramPath, RectF paramRectF) {
    Region region = new Region();
    region.setPath(paramPath, new Region((int)Math.floor(paramRectF.left), (int)Math.floor(paramRectF.top), (int)Math.ceil(paramRectF.right), (int)Math.ceil(paramRectF.bottom)));
    return region;
  }
  
  void a(Canvas paramCanvas, Paint paramPaint, float paramFloat) {
    boolean bool1;
    paramFloat *= this.v;
    Path path = this.b0;
    boolean bool2 = false;
    if (path == null) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    if (bool1) {
      this.b0 = c(paramCanvas, paramPaint);
      this.b0.setFillType(this.D0);
    } 
    if (this.s0 == 1)
      bool2 = true; 
    path = this.b0;
    if (bool2) {
      path = new Path();
      this.b0.transform(this.w, path);
      paramCanvas.setMatrix(null);
    } 
    if (bool1 || path != this.b0) {
      this.g0 = new RectF();
      path.computeBounds(this.g0, true);
    } 
    RectF rectF = new RectF(this.g0);
    this.w.mapRect(rectF);
    setClientRect(rectF);
    a(paramCanvas, paramPaint);
    if (a(paramPaint, this.C0 * paramFloat)) {
      if (bool1) {
        this.c0 = new Path();
        paramPaint.getFillPath(path, this.c0);
      } 
      paramCanvas.drawPath(path, paramPaint);
    } 
    if (b(paramPaint, this.w0 * paramFloat)) {
      if (bool1) {
        this.d0 = new Path();
        paramPaint.getFillPath(path, this.d0);
      } 
      paramCanvas.drawPath(path, paramPaint);
    } 
    c(paramCanvas, paramPaint, paramFloat);
  }
  
  void a(b0 paramb0) {
    ArrayList<String> arrayList = paramb0.getAttributeList();
    if (arrayList != null) {
      if (arrayList.size() == 0)
        return; 
      this.F0 = new ArrayList();
      ArrayList<String> arrayList1 = this.G0;
      if (arrayList1 == null) {
        arrayList1 = new ArrayList<String>();
      } else {
        arrayList1 = new ArrayList<String>(arrayList1);
      } 
      this.H0 = arrayList1;
      int i = 0;
      int j = arrayList.size();
      while (i < j) {
        try {
          String str = arrayList.get(i);
          Field field = getClass().getField(str);
          Object object = field.get(paramb0);
          this.F0.add(field.get(this));
          if (!a(str)) {
            this.H0.add(str);
            field.set(this, object);
          } 
          i++;
        } catch (Exception exception) {
          throw new IllegalStateException(exception);
        } 
      } 
      this.E0 = arrayList;
    } 
  }
  
  boolean a(Paint paramPaint, float paramFloat) {
    ReadableArray readableArray = this.B0;
    if (readableArray != null && readableArray.size() > 0) {
      paramPaint.reset();
      paramPaint.setFlags(385);
      paramPaint.setStyle(Paint.Style.FILL);
      a(paramPaint, paramFloat, this.B0);
      return true;
    } 
    return false;
  }
  
  void b(Canvas paramCanvas, Paint paramPaint, float paramFloat) {
    l l;
    if (this.H != null) {
      l = (q)getSvgView().d(this.H);
    } else {
      l = null;
    } 
    if (l != null) {
      Rect rect = paramCanvas.getClipBounds();
      int k = rect.height();
      int m = rect.width();
      Bitmap bitmap1 = Bitmap.createBitmap(m, k, Bitmap.Config.ARGB_8888);
      Bitmap bitmap2 = Bitmap.createBitmap(m, k, Bitmap.Config.ARGB_8888);
      Bitmap bitmap3 = Bitmap.createBitmap(m, k, Bitmap.Config.ARGB_8888);
      Canvas canvas1 = new Canvas(bitmap2);
      Canvas canvas3 = new Canvas(bitmap1);
      Canvas canvas2 = new Canvas(bitmap3);
      canvas3.clipRect((float)c(((q)l).M0), (float)a(((q)l).N0), (float)c(((q)l).O0), (float)a(((q)l).P0));
      Paint paint2 = new Paint(1);
      l.a(canvas3, paint2, 1.0F);
      int i = m * k;
      int[] arrayOfInt = new int[i];
      bitmap1.getPixels(arrayOfInt, 0, m, 0, 0, m, k);
      int j = 0;
      Paint paint1 = paint2;
      while (j < i) {
        int n = arrayOfInt[j];
        double d1 = (n >> 16 & 0xFF);
        Double.isNaN(d1);
        double d2 = (n >> 8 & 0xFF);
        Double.isNaN(d2);
        double d3 = (n & 0xFF);
        Double.isNaN(d3);
        d1 = a((d1 * 0.299D + d2 * 0.587D + d3 * 0.144D) / 255.0D);
        d2 = (n >>> 24);
        Double.isNaN(d2);
        arrayOfInt[j] = (int)(d2 * d1) << 24;
        j++;
      } 
      bitmap1.setPixels(arrayOfInt, 0, m, 0, 0, m, k);
      a(canvas1, paramPaint, paramFloat);
      paint1.setXfermode((Xfermode)new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
      canvas2.drawBitmap(bitmap2, 0.0F, 0.0F, null);
      canvas2.drawBitmap(bitmap1, 0.0F, 0.0F, paint1);
      paramCanvas.drawBitmap(bitmap3, 0.0F, 0.0F, paramPaint);
      return;
    } 
    a(paramCanvas, paramPaint, paramFloat);
  }
  
  boolean b(Paint paramPaint, float paramFloat) {
    paramPaint.reset();
    double d = b(this.v0);
    int i = 0;
    if (d != 0.0D) {
      ReadableArray readableArray = this.t0;
      if (readableArray != null) {
        if (readableArray.size() == 0)
          return false; 
        paramPaint.setFlags(385);
        paramPaint.setStyle(Paint.Style.STROKE);
        paramPaint.setStrokeCap(this.z0);
        paramPaint.setStrokeJoin(this.A0);
        paramPaint.setStrokeMiter(this.x0 * this.L);
        paramPaint.setStrokeWidth((float)d);
        a(paramPaint, paramFloat, this.t0);
        c0[] arrayOfC0 = this.u0;
        if (arrayOfC0 != null) {
          int j = arrayOfC0.length;
          float[] arrayOfFloat = new float[j];
          while (i < j) {
            arrayOfFloat[i] = (float)b(this.u0[i]);
            i++;
          } 
          paramPaint.setPathEffect((PathEffect)new DashPathEffect(arrayOfFloat, this.y0));
        } 
        return true;
      } 
    } 
    return false;
  }
  
  void c(Canvas paramCanvas, Paint paramPaint, float paramFloat) {
    p p1 = (p)getSvgView().c(this.I);
    p p2 = (p)getSvgView().c(this.J);
    p p3 = (p)getSvgView().c(this.K);
    if (this.p0 != null && (p1 != null || p2 != null || p3 != null)) {
      double d;
      I0 = this;
      ArrayList<x> arrayList = x.a(this.p0);
      c0 c01 = this.v0;
      if (c01 != null) {
        d = b(c01);
      } else {
        d = 1.0D;
      } 
      float f = (float)d;
      this.e0 = new Path();
      for (x x : arrayList) {
        p p;
        y y = x.a;
        int i = a.a[y.ordinal()];
        if (i != 1) {
          if (i != 2) {
            if (i != 3) {
              y = null;
            } else {
              p = p3;
            } 
          } else {
            p = p2;
          } 
        } else {
          p = p1;
        } 
        if (p == null)
          continue; 
        p.a(paramCanvas, paramPaint, paramFloat, x, f);
        Matrix matrix = p.Y0;
        this.e0.addPath(p.c(paramCanvas, paramPaint), matrix);
      } 
      I0 = null;
    } 
  }
  
  void i() {
    if (this.l0 == null && this.c0 != null) {
      this.h0 = new RectF();
      this.c0.computeBounds(this.h0, true);
      this.l0 = a(this.c0, this.h0);
    } 
    if (this.l0 == null && this.b0 != null) {
      this.h0 = new RectF();
      this.b0.computeBounds(this.h0, true);
      this.l0 = a(this.b0, this.h0);
    } 
    if (this.n0 == null && this.d0 != null) {
      this.i0 = new RectF();
      this.d0.computeBounds(this.i0, true);
      this.n0 = a(this.d0, this.i0);
    } 
    if (this.m0 == null && this.e0 != null) {
      this.j0 = new RectF();
      this.e0.computeBounds(this.j0, true);
      this.m0 = a(this.e0, this.j0);
    } 
    Path path = getClipPath();
    if (path != null && this.f0 != path) {
      this.f0 = path;
      this.k0 = new RectF();
      path.computeBounds(this.k0, true);
      this.o0 = a(path, this.k0);
    } 
  }
  
  void j() {
    ArrayList<String> arrayList = this.E0;
    if (arrayList != null && this.F0 != null)
      try {
        for (int i = arrayList.size() - 1; i >= 0; i--)
          getClass().getField(this.E0.get(i)).set(this, this.F0.get(i)); 
        this.E0 = null;
        this.F0 = null;
        this.H0 = this.G0;
        return;
      } catch (Exception exception) {
        throw new IllegalStateException(exception);
      }  
  }
  
  @com.facebook.react.uimanager.e1.a(name = "fill")
  public void setFill(Dynamic paramDynamic) {
    JavaOnlyArray javaOnlyArray;
    Matcher matcher;
    if (paramDynamic == null || paramDynamic.isNull()) {
      this.B0 = null;
      invalidate();
      return;
    } 
    ReadableType readableType = paramDynamic.getType();
    boolean bool = readableType.equals(ReadableType.Number);
    int i = 0;
    if (bool) {
      javaOnlyArray = JavaOnlyArray.of(new Object[] { Integer.valueOf(0), Integer.valueOf(paramDynamic.asInt()) });
    } else {
      ReadableArray readableArray;
      if (readableType.equals(ReadableType.Array)) {
        readableArray = javaOnlyArray.asArray();
      } else {
        JavaOnlyArray javaOnlyArray1 = new JavaOnlyArray();
        javaOnlyArray1.pushInt(0);
        matcher = J0.matcher(readableArray.asString());
        while (matcher.find()) {
          double d2 = Double.parseDouble(matcher.group());
          double d1 = d2;
          if (i < 3)
            d1 = d2 / 255.0D; 
          javaOnlyArray1.pushDouble(d1);
          i++;
        } 
        this.B0 = (ReadableArray)javaOnlyArray1;
        invalidate();
      } 
    } 
    this.B0 = (ReadableArray)matcher;
    invalidate();
  }
  
  @com.facebook.react.uimanager.e1.a(defaultFloat = 1.0F, name = "fillOpacity")
  public void setFillOpacity(float paramFloat) {
    this.C0 = paramFloat;
    invalidate();
  }
  
  @com.facebook.react.uimanager.e1.a(defaultInt = 1, name = "fillRule")
  public void setFillRule(int paramInt) {
    if (paramInt != 0) {
      if (paramInt != 1) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("fillRule ");
        stringBuilder.append(paramInt);
        stringBuilder.append(" unrecognized");
        throw new JSApplicationIllegalArgumentException(stringBuilder.toString());
      } 
    } else {
      this.D0 = Path.FillType.EVEN_ODD;
    } 
    invalidate();
  }
  
  public void setId(int paramInt) {
    super.setId(paramInt);
    RenderableViewManager.setRenderableView(paramInt, this);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "propList")
  public void setPropList(ReadableArray paramReadableArray) {
    if (paramReadableArray != null) {
      ArrayList<String> arrayList = new ArrayList();
      this.H0 = arrayList;
      this.G0 = arrayList;
      for (int i = 0; i < paramReadableArray.size(); i++)
        this.G0.add(paramReadableArray.getString(i)); 
    } 
    invalidate();
  }
  
  @com.facebook.react.uimanager.e1.a(name = "stroke")
  public void setStroke(Dynamic paramDynamic) {
    JavaOnlyArray javaOnlyArray;
    Matcher matcher;
    if (paramDynamic == null || paramDynamic.isNull()) {
      this.t0 = null;
      invalidate();
      return;
    } 
    ReadableType readableType = paramDynamic.getType();
    boolean bool = readableType.equals(ReadableType.Number);
    int i = 0;
    if (bool) {
      javaOnlyArray = JavaOnlyArray.of(new Object[] { Integer.valueOf(0), Integer.valueOf(paramDynamic.asInt()) });
    } else {
      ReadableArray readableArray;
      if (readableType.equals(ReadableType.Array)) {
        readableArray = javaOnlyArray.asArray();
      } else {
        JavaOnlyArray javaOnlyArray1 = new JavaOnlyArray();
        javaOnlyArray1.pushInt(0);
        matcher = J0.matcher(readableArray.asString());
        while (matcher.find()) {
          double d2 = Double.parseDouble(matcher.group());
          double d1 = d2;
          if (i < 3)
            d1 = d2 / 255.0D; 
          javaOnlyArray1.pushDouble(d1);
          i++;
        } 
        this.t0 = (ReadableArray)javaOnlyArray1;
        invalidate();
      } 
    } 
    this.t0 = (ReadableArray)matcher;
    invalidate();
  }
  
  @com.facebook.react.uimanager.e1.a(name = "strokeDasharray")
  public void setStrokeDasharray(ReadableArray paramReadableArray) {
    if (paramReadableArray != null) {
      int j = paramReadableArray.size();
      this.u0 = new c0[j];
      for (int i = 0; i < j; i++)
        this.u0[i] = c0.b(paramReadableArray.getDynamic(i)); 
    } else {
      this.u0 = null;
    } 
    invalidate();
  }
  
  @com.facebook.react.uimanager.e1.a(name = "strokeDashoffset")
  public void setStrokeDashoffset(float paramFloat) {
    this.y0 = paramFloat * this.L;
    invalidate();
  }
  
  @com.facebook.react.uimanager.e1.a(defaultInt = 1, name = "strokeLinecap")
  public void setStrokeLinecap(int paramInt) {
    Paint.Cap cap;
    if (paramInt != 0) {
      if (paramInt != 1) {
        if (paramInt == 2) {
          cap = Paint.Cap.SQUARE;
        } else {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("strokeLinecap ");
          stringBuilder.append(paramInt);
          stringBuilder.append(" unrecognized");
          throw new JSApplicationIllegalArgumentException(stringBuilder.toString());
        } 
      } else {
        cap = Paint.Cap.ROUND;
      } 
    } else {
      cap = Paint.Cap.BUTT;
    } 
    this.z0 = cap;
    invalidate();
  }
  
  @com.facebook.react.uimanager.e1.a(defaultInt = 1, name = "strokeLinejoin")
  public void setStrokeLinejoin(int paramInt) {
    Paint.Join join;
    if (paramInt != 0) {
      if (paramInt != 1) {
        if (paramInt == 2) {
          join = Paint.Join.BEVEL;
        } else {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("strokeLinejoin ");
          stringBuilder.append(paramInt);
          stringBuilder.append(" unrecognized");
          throw new JSApplicationIllegalArgumentException(stringBuilder.toString());
        } 
      } else {
        join = Paint.Join.ROUND;
      } 
    } else {
      join = Paint.Join.MITER;
    } 
    this.A0 = join;
    invalidate();
  }
  
  @com.facebook.react.uimanager.e1.a(defaultFloat = 4.0F, name = "strokeMiterlimit")
  public void setStrokeMiterlimit(float paramFloat) {
    this.x0 = paramFloat;
    invalidate();
  }
  
  @com.facebook.react.uimanager.e1.a(defaultFloat = 1.0F, name = "strokeOpacity")
  public void setStrokeOpacity(float paramFloat) {
    this.w0 = paramFloat;
    invalidate();
  }
  
  @com.facebook.react.uimanager.e1.a(name = "strokeWidth")
  public void setStrokeWidth(Dynamic paramDynamic) {
    this.v0 = c0.b(paramDynamic);
    invalidate();
  }
  
  @com.facebook.react.uimanager.e1.a(name = "vectorEffect")
  public void setVectorEffect(int paramInt) {
    this.s0 = paramInt;
    invalidate();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/horcrux/svg/b0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */