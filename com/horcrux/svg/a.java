package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import com.facebook.react.bridge.ReadableArray;

class a {
  private final a a;
  
  private final c0[] b;
  
  private ReadableArray c;
  
  private final boolean d;
  
  private boolean e;
  
  private Matrix f;
  
  private Rect g;
  
  private u h;
  
  a(a parama, c0[] paramArrayOfc0, b paramb) {
    boolean bool;
    this.a = parama;
    this.b = paramArrayOfc0;
    if (paramb == b.c) {
      bool = true;
    } else {
      bool = false;
    } 
    this.d = bool;
  }
  
  private double a(c0 paramc0, double paramDouble, float paramFloat1, float paramFloat2) {
    double d;
    if (this.d && paramc0.b == c0.b.d) {
      d = paramDouble;
    } else {
      d = paramFloat1;
    } 
    return w.a(paramc0, paramDouble, 0.0D, d, paramFloat2);
  }
  
  private RectF a(RectF paramRectF) {
    float f2;
    if (!this.d)
      paramRectF = new RectF(this.g); 
    float f3 = paramRectF.width();
    float f4 = paramRectF.height();
    boolean bool = this.d;
    float f1 = 0.0F;
    if (bool) {
      f1 = paramRectF.left;
      f2 = paramRectF.top;
    } else {
      f2 = 0.0F;
    } 
    return new RectF(f1, f2, f3 + f1, f4 + f2);
  }
  
  private static void a(ReadableArray paramReadableArray, int paramInt, float[] paramArrayOffloat, int[] paramArrayOfint, float paramFloat) {
    int i;
    for (i = 0; i < paramInt; i++) {
      int j = i * 2;
      paramArrayOffloat[i] = (float)paramReadableArray.getDouble(j);
      j = paramReadableArray.getInt(j + 1);
      paramArrayOfint[i] = j & 0xFFFFFF | Math.round((j >>> 24) * paramFloat) << 24;
    } 
  }
  
  void a(Matrix paramMatrix) {
    this.f = paramMatrix;
  }
  
  void a(Paint paramPaint, RectF paramRectF, float paramFloat1, float paramFloat2) {
    LinearGradient linearGradient;
    Matrix matrix;
    c0 c01;
    paramRectF = a(paramRectF);
    float f1 = paramRectF.width();
    float f2 = paramRectF.height();
    float f3 = paramRectF.left;
    float f4 = paramRectF.top;
    float f5 = paramPaint.getTextSize();
    if (this.a == a.e) {
      c0 c02 = this.b[0];
      double d4 = f1;
      double d1 = a(c02, d4, paramFloat1, f5);
      c02 = this.b[1];
      double d3 = f2;
      double d2 = a(c02, d3, paramFloat1, f5);
      d4 = a(this.b[2], d4, paramFloat1, f5);
      d3 = a(this.b[3], d3, paramFloat1, f5);
      if (d4 > 1.0D) {
        if (d3 <= 1.0D)
          return; 
        Bitmap bitmap = Bitmap.createBitmap((int)d4, (int)d3, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        RectF rectF = this.h.getViewBox();
        if (rectF != null && rectF.width() > 0.0F && rectF.height() > 0.0F) {
          RectF rectF1 = new RectF((float)d1, (float)d2, (float)d4, (float)d3);
          u u1 = this.h;
          canvas.concat(w0.a(rectF, rectF1, u1.W0, u1.X0));
        } 
        if (this.e)
          canvas.scale(f1 / paramFloat1, f2 / paramFloat1); 
        this.h.a(canvas, new Paint(), paramFloat2);
        matrix = new Matrix();
        Matrix matrix1 = this.f;
        if (matrix1 != null)
          matrix.preConcat(matrix1); 
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        bitmapShader.setLocalMatrix(matrix);
        paramPaint.setShader((Shader)bitmapShader);
      } 
      return;
    } 
    int i = this.c.size();
    if (i == 0) {
      e.e.e.e.a.e("ReactNative", "Gradient contains no stops");
      return;
    } 
    i /= 2;
    int[] arrayOfInt = new int[i];
    float[] arrayOfFloat = new float[i];
    a(this.c, i, arrayOfFloat, arrayOfInt, paramFloat2);
    if (arrayOfFloat.length == 1) {
      i = arrayOfInt[0];
      int j = arrayOfInt[0];
      paramFloat2 = arrayOfFloat[0];
      float f = arrayOfFloat[0];
      e.e.e.e.a.e("ReactNative", "Gradient contains only one stop");
      arrayOfInt = new int[] { i, j };
      arrayOfFloat = new float[] { paramFloat2, f };
    } 
    a a1 = this.a;
    if (a1 == a.c) {
      c01 = this.b[0];
      double d6 = f1;
      double d1 = a(c01, d6, paramFloat1, f5);
      double d2 = f3;
      Double.isNaN(d2);
      c01 = this.b[1];
      double d5 = f2;
      double d3 = a(c01, d5, paramFloat1, f5);
      double d4 = f4;
      Double.isNaN(d4);
      d6 = a(this.b[2], d6, paramFloat1, f5);
      Double.isNaN(d2);
      d5 = a(this.b[3], d5, paramFloat1, f5);
      Double.isNaN(d4);
      linearGradient = new LinearGradient((float)(d1 + d2), (float)(d3 + d4), (float)(d6 + d2), (float)(d5 + d4), arrayOfInt, arrayOfFloat, Shader.TileMode.CLAMP);
      if (this.f != null) {
        matrix = new Matrix();
        matrix.preConcat(this.f);
        linearGradient.setLocalMatrix(matrix);
      } 
      paramPaint.setShader((Shader)linearGradient);
      return;
    } 
    if (c01 == a.d) {
      c01 = this.b[2];
      double d3 = f1;
      double d1 = a(c01, d3, paramFloat1, f5);
      c01 = this.b[3];
      double d5 = f2;
      double d2 = a(c01, d5, paramFloat1, f5) / d1;
      d3 = a(this.b[4], d3, paramFloat1, f5);
      double d4 = f3;
      Double.isNaN(d4);
      c01 = this.b[5];
      Double.isNaN(d5);
      d5 = a(c01, d5 / d2, paramFloat1, f5);
      double d6 = f4;
      Double.isNaN(d6);
      d6 /= d2;
      RadialGradient radialGradient = new RadialGradient((float)(d3 + d4), (float)(d5 + d6), (float)d1, (int[])linearGradient, (float[])matrix, Shader.TileMode.CLAMP);
      matrix = new Matrix();
      matrix.preScale(1.0F, (float)d2);
      Matrix matrix1 = this.f;
      if (matrix1 != null)
        matrix.preConcat(matrix1); 
      radialGradient.setLocalMatrix(matrix);
      paramPaint.setShader((Shader)radialGradient);
    } 
  }
  
  void a(Rect paramRect) {
    this.g = paramRect;
  }
  
  void a(ReadableArray paramReadableArray) {
    this.c = paramReadableArray;
  }
  
  void a(b paramb) {
    boolean bool;
    if (paramb == b.c) {
      bool = true;
    } else {
      bool = false;
    } 
    this.e = bool;
  }
  
  void a(u paramu) {
    this.h = paramu;
  }
  
  enum a {
    c, d, e;
  }
  
  enum b {
    c, d;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/horcrux/svg/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */