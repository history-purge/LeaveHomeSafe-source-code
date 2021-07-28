package com.facebook.react.views.art;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.graphics.Shader;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.e1.a;
import e.e.e.e.a;

public class b extends f {
  protected Path F;
  
  private float[] G;
  
  private float[] H;
  
  private float[] I;
  
  private float J = 1.0F;
  
  private int K = 1;
  
  private int L = 1;
  
  private Path a(float[] paramArrayOffloat) {
    Path path = new Path();
    path.moveTo(0.0F, 0.0F);
    int i = 0;
    while (i < paramArrayOffloat.length) {
      StringBuilder stringBuilder1;
      int j = i + 1;
      int k = (int)paramArrayOffloat[i];
      if (k != 0) {
        i = 1;
        if (k != 1) {
          if (k != 2) {
            if (k != 3) {
              if (k == 4) {
                k = j + 1;
                float f5 = paramArrayOffloat[j];
                float f4 = this.C;
                float f6 = f5 * f4;
                j = k + 1;
                float f7 = paramArrayOffloat[k] * f4;
                k = j + 1;
                float f8 = paramArrayOffloat[j] * f4;
                j = k + 1;
                float f9 = (float)Math.toDegrees(paramArrayOffloat[k]);
                k = j + 1;
                f4 = (float)Math.toDegrees(paramArrayOffloat[j]);
                j = k + 1;
                if (paramArrayOffloat[k] == 1.0F)
                  i = 0; 
                f4 -= f9;
                if (Math.abs(f4) >= 360.0F) {
                  Path.Direction direction;
                  if (i != 0) {
                    direction = Path.Direction.CCW;
                  } else {
                    direction = Path.Direction.CW;
                  } 
                  path.addCircle(f6, f7, f8, direction);
                  i = j;
                  continue;
                } 
                f5 = b(f4, 360.0F);
                f4 = f5;
                if (i != 0) {
                  f4 = f5;
                  if (f5 < 360.0F)
                    f4 = (360.0F - f5) * -1.0F; 
                } 
                path.arcTo(new RectF(f6 - f8, f7 - f8, f6 + f8, f7 + f8), f9, f4);
                i = j;
                continue;
              } 
              stringBuilder1 = new StringBuilder();
              stringBuilder1.append("Unrecognized drawing instruction ");
              stringBuilder1.append(k);
              throw new JSApplicationIllegalArgumentException(stringBuilder1.toString());
            } 
            i = j + 1;
            StringBuilder stringBuilder3 = stringBuilder1[j];
            float f3 = this.C;
            j = i + 1;
            StringBuilder stringBuilder4 = stringBuilder1[i];
            i = j + 1;
            StringBuilder stringBuilder5 = stringBuilder1[j];
            j = i + 1;
            StringBuilder stringBuilder6 = stringBuilder1[i];
            k = j + 1;
            StringBuilder stringBuilder7 = stringBuilder1[j];
            i = k + 1;
            path.cubicTo(stringBuilder3 * f3, stringBuilder4 * f3, stringBuilder5 * f3, stringBuilder6 * f3, stringBuilder7 * f3, stringBuilder1[k] * f3);
            continue;
          } 
          k = j + 1;
          StringBuilder stringBuilder = stringBuilder1[j];
          float f2 = this.C;
          i = k + 1;
          path.lineTo(stringBuilder * f2, stringBuilder1[k] * f2);
          continue;
        } 
        path.close();
        i = j;
        continue;
      } 
      k = j + 1;
      StringBuilder stringBuilder2 = stringBuilder1[j];
      float f1 = this.C;
      i = k + 1;
      path.moveTo(stringBuilder2 * f1, stringBuilder1[k] * f1);
    } 
    return path;
  }
  
  private float b(float paramFloat1, float paramFloat2) {
    float f1 = paramFloat1 % paramFloat2;
    paramFloat1 = f1;
    if (f1 < 0.0F)
      paramFloat1 = f1 + paramFloat2; 
    return paramFloat1;
  }
  
  public void a(Canvas paramCanvas, Paint paramPaint, float paramFloat) {
    paramFloat *= this.A;
    if (paramFloat > 0.01F) {
      b(paramCanvas);
      if (this.F != null) {
        if (a(paramPaint, paramFloat))
          paramCanvas.drawPath(this.F, paramPaint); 
        if (b(paramPaint, paramFloat))
          paramCanvas.drawPath(this.F, paramPaint); 
        a(paramCanvas);
      } else {
        throw new JSApplicationIllegalArgumentException("Shapes should have a valid path (d) prop");
      } 
    } 
    e();
  }
  
  protected boolean a(Paint paramPaint, float paramFloat) {
    float[] arrayOfFloat = this.H;
    int i = 0;
    if (arrayOfFloat != null && arrayOfFloat.length > 0) {
      StringBuilder stringBuilder;
      paramPaint.reset();
      paramPaint.setFlags(1);
      paramPaint.setStyle(Paint.Style.FILL);
      arrayOfFloat = this.H;
      int j = (int)arrayOfFloat[0];
      if (j != 0) {
        float[] arrayOfFloat1;
        if (j != 1) {
          stringBuilder = new StringBuilder();
          stringBuilder.append("ART: Color type ");
          stringBuilder.append(j);
          stringBuilder.append(" not supported!");
          a.e("ReactNative", stringBuilder.toString());
          return true;
        } 
        if (arrayOfFloat.length < 5) {
          stringBuilder = new StringBuilder();
          stringBuilder.append("[ARTShapeShadowNode setupFillPaint] expects 5 elements, received ");
          stringBuilder.append(this.H.length);
          a.e("ReactNative", stringBuilder.toString());
          return false;
        } 
        paramFloat = arrayOfFloat[1];
        float f1 = this.C;
        float f2 = arrayOfFloat[2];
        float f3 = arrayOfFloat[3];
        float f4 = arrayOfFloat[4];
        j = (arrayOfFloat.length - 5) / 5;
        if (j > 0) {
          int[] arrayOfInt = new int[j];
          arrayOfFloat1 = new float[j];
          while (i < j) {
            float[] arrayOfFloat2 = this.H;
            arrayOfFloat1[i] = arrayOfFloat2[j * 4 + 5 + i];
            int k = i * 4 + 5;
            int m = (int)(arrayOfFloat2[k + 0] * 255.0F);
            int n = (int)(arrayOfFloat2[k + 1] * 255.0F);
            int i1 = (int)(arrayOfFloat2[k + 2] * 255.0F);
            arrayOfInt[i] = Color.argb((int)(arrayOfFloat2[k + 3] * 255.0F), m, n, i1);
            i++;
          } 
        } else {
          arrayOfFloat = null;
          arrayOfFloat1 = arrayOfFloat;
        } 
        stringBuilder.setShader((Shader)new LinearGradient(paramFloat * f1, f2 * f1, f3 * f1, f4 * f1, (int[])arrayOfFloat, arrayOfFloat1, Shader.TileMode.CLAMP));
        return true;
      } 
      if (arrayOfFloat.length > 4) {
        paramFloat = arrayOfFloat[4] * paramFloat * 255.0F;
      } else {
        paramFloat *= 255.0F;
      } 
      i = (int)paramFloat;
      arrayOfFloat = this.H;
      stringBuilder.setARGB(i, (int)(arrayOfFloat[1] * 255.0F), (int)(arrayOfFloat[2] * 255.0F), (int)(arrayOfFloat[3] * 255.0F));
      return true;
    } 
    return false;
  }
  
  protected boolean b(Paint paramPaint, float paramFloat) {
    if (this.J != 0.0F) {
      float[] arrayOfFloat = this.G;
      if (arrayOfFloat != null) {
        StringBuilder stringBuilder;
        Paint.Cap cap;
        Paint.Join join;
        if (arrayOfFloat.length == 0)
          return false; 
        paramPaint.reset();
        paramPaint.setFlags(1);
        paramPaint.setStyle(Paint.Style.STROKE);
        int i = this.K;
        if (i != 0) {
          if (i != 1) {
            if (i == 2) {
              cap = Paint.Cap.SQUARE;
            } else {
              stringBuilder = new StringBuilder();
              stringBuilder.append("strokeCap ");
              stringBuilder.append(this.K);
              stringBuilder.append(" unrecognized");
              throw new JSApplicationIllegalArgumentException(stringBuilder.toString());
            } 
          } else {
            cap = Paint.Cap.ROUND;
          } 
        } else {
          cap = Paint.Cap.BUTT;
        } 
        stringBuilder.setStrokeCap(cap);
        i = this.L;
        if (i != 0) {
          if (i != 1) {
            if (i == 2) {
              join = Paint.Join.BEVEL;
            } else {
              stringBuilder = new StringBuilder();
              stringBuilder.append("strokeJoin ");
              stringBuilder.append(this.L);
              stringBuilder.append(" unrecognized");
              throw new JSApplicationIllegalArgumentException(stringBuilder.toString());
            } 
          } else {
            join = Paint.Join.ROUND;
          } 
        } else {
          join = Paint.Join.MITER;
        } 
        stringBuilder.setStrokeJoin(join);
        stringBuilder.setStrokeWidth(this.J * this.C);
        float[] arrayOfFloat1 = this.G;
        if (arrayOfFloat1.length > 3) {
          paramFloat = arrayOfFloat1[3] * paramFloat * 255.0F;
        } else {
          paramFloat *= 255.0F;
        } 
        i = (int)paramFloat;
        arrayOfFloat1 = this.G;
        stringBuilder.setARGB(i, (int)(arrayOfFloat1[0] * 255.0F), (int)(arrayOfFloat1[1] * 255.0F), (int)(arrayOfFloat1[2] * 255.0F));
        arrayOfFloat1 = this.I;
        if (arrayOfFloat1 != null && arrayOfFloat1.length > 0)
          stringBuilder.setPathEffect((PathEffect)new DashPathEffect(arrayOfFloat1, 0.0F)); 
        return true;
      } 
    } 
    return false;
  }
  
  @a(name = "fill")
  public void setFill(ReadableArray paramReadableArray) {
    this.H = g.a(paramReadableArray);
    L();
  }
  
  @a(name = "d")
  public void setShapePath(ReadableArray paramReadableArray) {
    this.F = a(g.a(paramReadableArray));
    L();
  }
  
  @a(name = "stroke")
  public void setStroke(ReadableArray paramReadableArray) {
    this.G = g.a(paramReadableArray);
    L();
  }
  
  @a(defaultInt = 1, name = "strokeCap")
  public void setStrokeCap(int paramInt) {
    this.K = paramInt;
    L();
  }
  
  @a(name = "strokeDash")
  public void setStrokeDash(ReadableArray paramReadableArray) {
    this.I = g.a(paramReadableArray);
    L();
  }
  
  @a(defaultInt = 1, name = "strokeJoin")
  public void setStrokeJoin(int paramInt) {
    this.L = paramInt;
    L();
  }
  
  @a(defaultFloat = 1.0F, name = "strokeWidth")
  public void setStrokeWidth(float paramFloat) {
    this.J = paramFloat;
    L();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/art/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */