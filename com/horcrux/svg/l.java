package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.view.View;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.e1.a;

@SuppressLint({"ViewConstructor"})
class l extends b0 {
  ReadableMap K0;
  
  private j L0;
  
  public l(ReactContext paramReactContext) {
    super(paramReactContext);
  }
  
  private static <T> T a(T paramT) {
    if (paramT != null)
      return paramT; 
    throw new NullPointerException();
  }
  
  int a(float[] paramArrayOffloat) {
    if (this.C) {
      if (!this.D)
        return -1; 
      float[] arrayOfFloat = new float[2];
      this.A.mapPoints(arrayOfFloat, paramArrayOffloat);
      this.B.mapPoints(arrayOfFloat);
      int i = Math.round(arrayOfFloat[0]);
      int k = Math.round(arrayOfFloat[1]);
      Path path = getClipPath();
      if (path != null) {
        if (this.f0 != path) {
          this.f0 = path;
          this.k0 = new RectF();
          path.computeBounds(this.k0, true);
          this.o0 = a(path, this.k0);
        } 
        if (!this.o0.contains(i, k))
          return -1; 
      } 
      for (i = getChildCount() - 1; i >= 0; i--) {
        View view = getChildAt(i);
        if (view instanceof x0) {
          if (!(view instanceof q)) {
            x0 x0 = (x0)view;
            k = x0.a(arrayOfFloat);
            if (k != -1) {
              i = k;
              if (!x0.g()) {
                if (k != view.getId())
                  return k; 
                i = getId();
              } 
              return i;
            } 
          } 
        } else if (view instanceof f0) {
          k = ((f0)view).a(arrayOfFloat[0], arrayOfFloat[1]);
          if (k != view.getId())
            return k; 
        } 
      } 
    } 
    return -1;
  }
  
  Path a(Canvas paramCanvas, Paint paramPaint, Region.Op paramOp) {
    Path path = new Path();
    int k = Build.VERSION.SDK_INT;
    boolean bool = false;
    int i = 0;
    if (k >= 19) {
      Path.Op op = Path.Op.valueOf(paramOp.name());
      while (i < getChildCount()) {
        View view = getChildAt(i);
        if (!(view instanceof q) && view instanceof x0) {
          Path path1;
          x0 x0 = (x0)view;
          Matrix matrix = x0.x;
          if (x0 instanceof l) {
            path1 = ((l)x0).a(paramCanvas, paramPaint, paramOp);
          } else {
            path1 = path1.c(paramCanvas, paramPaint);
          } 
          path1.transform(matrix);
          path.op(path1, op);
        } 
        i++;
      } 
    } else {
      Region region1 = new Region(paramCanvas.getClipBounds());
      Region region2 = new Region();
      for (i = bool; i < getChildCount(); i++) {
        View view = getChildAt(i);
        if (!(view instanceof q) && view instanceof x0) {
          Path path1;
          x0 x0 = (x0)view;
          Matrix matrix = x0.x;
          if (x0 instanceof l) {
            path1 = ((l)x0).a(paramCanvas, paramPaint, paramOp);
          } else {
            path1 = path1.c(paramCanvas, paramPaint);
          } 
          if (matrix != null)
            path1.transform(matrix); 
          Region region = new Region();
          region.setPath(path1, region1);
          region2.op(region, paramOp);
        } 
      } 
      path.addPath(region2.getBoundaryPath());
    } 
    return path;
  }
  
  void a(Canvas paramCanvas) {
    RectF rectF = new RectF(paramCanvas.getClipBounds());
    Matrix matrix = this.x;
    if (matrix != null)
      matrix.mapRect(rectF); 
    matrix = this.y;
    if (matrix != null)
      matrix.mapRect(rectF); 
    this.L0 = new j(this.L, rectF.width(), rectF.height());
  }
  
  void a(Canvas paramCanvas, Paint paramPaint, float paramFloat) {
    a(paramCanvas);
    a(paramCanvas, paramPaint);
    d(paramCanvas, paramPaint, paramFloat);
  }
  
  Path c(Canvas paramCanvas, Paint paramPaint) {
    Path path = this.b0;
    if (path != null)
      return path; 
    this.b0 = new Path();
    for (int i = 0; i < getChildCount(); i++) {
      View view = getChildAt(i);
      if (!(view instanceof q) && view instanceof x0) {
        x0 x0 = (x0)view;
        Matrix matrix = x0.x;
        this.b0.addPath(x0.c(paramCanvas, paramPaint), matrix);
      } 
    } 
    return this.b0;
  }
  
  void d(Canvas paramCanvas, Paint paramPaint, float paramFloat) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual n : ()V
    //   4: aload_0
    //   5: invokevirtual getSvgView : ()Lcom/horcrux/svg/f0;
    //   8: astore #7
    //   10: new android/graphics/RectF
    //   13: dup
    //   14: invokespecial <init> : ()V
    //   17: astore #8
    //   19: iconst_0
    //   20: istore #4
    //   22: iload #4
    //   24: aload_0
    //   25: invokevirtual getChildCount : ()I
    //   28: if_icmpge -> 221
    //   31: aload_0
    //   32: iload #4
    //   34: invokevirtual getChildAt : (I)Landroid/view/View;
    //   37: astore #9
    //   39: aload #9
    //   41: instanceof com/horcrux/svg/q
    //   44: ifeq -> 50
    //   47: goto -> 212
    //   50: aload #9
    //   52: instanceof com/horcrux/svg/x0
    //   55: ifeq -> 178
    //   58: aload #9
    //   60: checkcast com/horcrux/svg/x0
    //   63: astore #9
    //   65: ldc 'none'
    //   67: aload #9
    //   69: getfield O : Ljava/lang/String;
    //   72: invokevirtual equals : (Ljava/lang/Object;)Z
    //   75: ifeq -> 81
    //   78: goto -> 212
    //   81: aload #9
    //   83: instanceof com/horcrux/svg/b0
    //   86: istore #6
    //   88: iload #6
    //   90: ifeq -> 102
    //   93: aload #9
    //   95: checkcast com/horcrux/svg/b0
    //   98: aload_0
    //   99: invokevirtual a : (Lcom/horcrux/svg/b0;)V
    //   102: aload #9
    //   104: aload_1
    //   105: aload_0
    //   106: getfield w : Landroid/graphics/Matrix;
    //   109: invokevirtual a : (Landroid/graphics/Canvas;Landroid/graphics/Matrix;)I
    //   112: istore #5
    //   114: aload #9
    //   116: aload_1
    //   117: aload_2
    //   118: aload_0
    //   119: getfield v : F
    //   122: fload_3
    //   123: fmul
    //   124: invokevirtual b : (Landroid/graphics/Canvas;Landroid/graphics/Paint;F)V
    //   127: aload #9
    //   129: invokevirtual getClientRect : ()Landroid/graphics/RectF;
    //   132: astore #10
    //   134: aload #10
    //   136: ifnull -> 146
    //   139: aload #8
    //   141: aload #10
    //   143: invokevirtual union : (Landroid/graphics/RectF;)V
    //   146: aload #9
    //   148: aload_1
    //   149: iload #5
    //   151: invokevirtual a : (Landroid/graphics/Canvas;I)V
    //   154: iload #6
    //   156: ifeq -> 167
    //   159: aload #9
    //   161: checkcast com/horcrux/svg/b0
    //   164: invokevirtual j : ()V
    //   167: aload #9
    //   169: invokevirtual g : ()Z
    //   172: ifeq -> 212
    //   175: goto -> 207
    //   178: aload #9
    //   180: instanceof com/horcrux/svg/f0
    //   183: ifeq -> 212
    //   186: aload #9
    //   188: checkcast com/horcrux/svg/f0
    //   191: astore #9
    //   193: aload #9
    //   195: aload_1
    //   196: invokevirtual a : (Landroid/graphics/Canvas;)V
    //   199: aload #9
    //   201: invokevirtual f : ()Z
    //   204: ifeq -> 212
    //   207: aload #7
    //   209: invokevirtual e : ()V
    //   212: iload #4
    //   214: iconst_1
    //   215: iadd
    //   216: istore #4
    //   218: goto -> 22
    //   221: aload_0
    //   222: aload #8
    //   224: invokevirtual setClientRect : (Landroid/graphics/RectF;)V
    //   227: aload_0
    //   228: invokevirtual m : ()V
    //   231: return
  }
  
  void e(Canvas paramCanvas, Paint paramPaint, float paramFloat) {
    super.a(paramCanvas, paramPaint, paramFloat);
  }
  
  void h() {
    if (this.P != null)
      getSvgView().d(this, this.P); 
    for (int i = 0; i < getChildCount(); i++) {
      View view = getChildAt(i);
      if (view instanceof x0)
        ((x0)view).h(); 
    } 
  }
  
  void j() {
    for (int i = 0; i < getChildCount(); i++) {
      View view = getChildAt(i);
      if (view instanceof b0)
        ((b0)view).j(); 
    } 
  }
  
  j k() {
    return this.L0;
  }
  
  j l() {
    l l1 = getTextRoot();
    a(l1);
    return l1.k();
  }
  
  void m() {
    l().i();
  }
  
  void n() {
    l().a(this, this.K0);
  }
  
  @a(name = "font")
  public void setFont(ReadableMap paramReadableMap) {
    this.K0 = paramReadableMap;
    invalidate();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/horcrux/svg/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */