package com.facebook.react.views.art;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.b0;
import com.facebook.react.uimanager.c;
import com.facebook.react.uimanager.e1.a;

public abstract class f extends b0 {
  private static final float[] D = new float[9];
  
  private static final float[] E = new float[9];
  
  protected float A = 1.0F;
  
  private Matrix B = new Matrix();
  
  protected final float C = (c.b()).density;
  
  protected void Q() {
    float[] arrayOfFloat1 = E;
    float[] arrayOfFloat2 = D;
    arrayOfFloat1[0] = arrayOfFloat2[0];
    arrayOfFloat1[1] = arrayOfFloat2[2];
    float f1 = arrayOfFloat2[4];
    float f2 = this.C;
    arrayOfFloat1[2] = f1 * f2;
    arrayOfFloat1[3] = arrayOfFloat2[1];
    arrayOfFloat1[4] = arrayOfFloat2[3];
    arrayOfFloat1[5] = arrayOfFloat2[5] * f2;
    arrayOfFloat1[6] = 0.0F;
    arrayOfFloat1[7] = 0.0F;
    arrayOfFloat1[8] = 1.0F;
    if (this.B == null)
      this.B = new Matrix(); 
    this.B.setValues(E);
  }
  
  protected void a(Canvas paramCanvas) {
    paramCanvas.restore();
  }
  
  public abstract void a(Canvas paramCanvas, Paint paramPaint, float paramFloat);
  
  protected final void b(Canvas paramCanvas) {
    paramCanvas.save();
    Matrix matrix = this.B;
    if (matrix != null)
      paramCanvas.concat(matrix); 
  }
  
  @a(defaultFloat = 1.0F, name = "opacity")
  public void setOpacity(float paramFloat) {
    this.A = paramFloat;
    L();
  }
  
  @a(name = "transform")
  public void setTransform(ReadableArray paramReadableArray) {
    if (paramReadableArray != null) {
      int i = g.a(paramReadableArray, D);
      if (i == 6) {
        Q();
      } else if (i != -1) {
        throw new JSApplicationIllegalArgumentException("Transform matrices must be of size 6");
      } 
    } else {
      this.B = null;
    } 
    L();
  }
  
  public boolean y() {
    return true;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/art/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */