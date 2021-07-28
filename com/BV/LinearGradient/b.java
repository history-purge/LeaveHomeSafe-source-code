package com.BV.LinearGradient;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.q;

public class b extends View {
  private final Paint c = new Paint(1);
  
  private Path d;
  
  private RectF e;
  
  private LinearGradient f;
  
  private float[] g;
  
  private float[] h = new float[] { 0.0F, 0.0F };
  
  private float[] i = new float[] { 0.0F, 1.0F };
  
  private int[] j;
  
  private boolean k = false;
  
  private float[] l = new float[] { 0.5F, 0.5F };
  
  private float m = 45.0F;
  
  private int[] n = new int[] { 0, 0 };
  
  private float[] o = new float[] { 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F };
  
  public b(Context paramContext) {
    super(paramContext);
  }
  
  private void a() {
    int[] arrayOfInt = this.j;
    if (arrayOfInt != null) {
      float[] arrayOfFloat2 = this.g;
      if (arrayOfFloat2 != null && arrayOfInt.length != arrayOfFloat2.length)
        return; 
      float[] arrayOfFloat3 = this.h;
      float[] arrayOfFloat4 = this.i;
      arrayOfFloat2 = arrayOfFloat3;
      float[] arrayOfFloat1 = arrayOfFloat4;
      if (this.k) {
        arrayOfFloat2 = arrayOfFloat3;
        arrayOfFloat1 = arrayOfFloat4;
        if (this.l != null) {
          arrayOfFloat2 = a(this.m);
          arrayOfFloat3 = this.l;
          float f1 = arrayOfFloat3[0];
          float f2 = arrayOfFloat2[0] / 2.0F;
          float f3 = arrayOfFloat3[1];
          float f4 = arrayOfFloat2[1] / 2.0F;
          arrayOfFloat1 = new float[2];
          arrayOfFloat1[0] = arrayOfFloat3[0] + arrayOfFloat2[0] / 2.0F;
          arrayOfFloat1[1] = arrayOfFloat3[1] + arrayOfFloat2[1] / 2.0F;
          arrayOfFloat2 = new float[] { f1 - f2, f3 - f4 };
        } 
      } 
      float f = arrayOfFloat2[0];
      int[] arrayOfInt1 = this.n;
      this.f = new LinearGradient(arrayOfInt1[0] * f, arrayOfFloat2[1] * arrayOfInt1[1], arrayOfFloat1[0] * arrayOfInt1[0], arrayOfFloat1[1] * arrayOfInt1[1], this.j, this.g, Shader.TileMode.CLAMP);
      this.c.setShader((Shader)this.f);
      invalidate();
    } 
  }
  
  private float[] a(float paramFloat) {
    float f = (float)Math.sqrt(2.0D);
    double d = ((paramFloat - 90.0F) * 0.017453292F);
    return new float[] { (float)Math.cos(d) * f, (float)Math.sin(d) * f };
  }
  
  private void b() {
    if (this.d == null) {
      this.d = new Path();
      this.e = new RectF();
    } 
    this.d.reset();
    RectF rectF = this.e;
    int[] arrayOfInt = this.n;
    rectF.set(0.0F, 0.0F, arrayOfInt[0], arrayOfInt[1]);
    this.d.addRoundRect(this.e, this.o, Path.Direction.CW);
  }
  
  protected void onDraw(Canvas paramCanvas) {
    super.onDraw(paramCanvas);
    Path path = this.d;
    if (path == null) {
      paramCanvas.drawPaint(this.c);
      return;
    } 
    paramCanvas.drawPath(path, this.c);
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.n = new int[] { paramInt1, paramInt2 };
    b();
    a();
  }
  
  public void setAngle(float paramFloat) {
    this.m = paramFloat;
    a();
  }
  
  public void setAngleCenter(ReadableArray paramReadableArray) {
    this.l = new float[] { (float)paramReadableArray.getDouble(0), (float)paramReadableArray.getDouble(1) };
    a();
  }
  
  public void setBorderRadii(ReadableArray paramReadableArray) {
    float[] arrayOfFloat = new float[paramReadableArray.size()];
    for (int i = 0; i < arrayOfFloat.length; i++)
      arrayOfFloat[i] = q.b((float)paramReadableArray.getDouble(i)); 
    this.o = arrayOfFloat;
    b();
    a();
  }
  
  public void setColors(ReadableArray paramReadableArray) {
    int[] arrayOfInt = new int[paramReadableArray.size()];
    for (int i = 0; i < arrayOfInt.length; i++)
      arrayOfInt[i] = paramReadableArray.getInt(i); 
    this.j = arrayOfInt;
    a();
  }
  
  public void setEndPosition(ReadableArray paramReadableArray) {
    this.i = new float[] { (float)paramReadableArray.getDouble(0), (float)paramReadableArray.getDouble(1) };
    a();
  }
  
  public void setLocations(ReadableArray paramReadableArray) {
    float[] arrayOfFloat = new float[paramReadableArray.size()];
    for (int i = 0; i < arrayOfFloat.length; i++)
      arrayOfFloat[i] = (float)paramReadableArray.getDouble(i); 
    this.g = arrayOfFloat;
    a();
  }
  
  public void setStartPosition(ReadableArray paramReadableArray) {
    this.h = new float[] { (float)paramReadableArray.getDouble(0), (float)paramReadableArray.getDouble(1) };
    a();
  }
  
  public void setUseAngle(boolean paramBoolean) {
    this.k = paramBoolean;
    a();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/BV/LinearGradient/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */