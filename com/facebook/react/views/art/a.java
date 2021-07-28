package com.facebook.react.views.art;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;

public class a extends f {
  protected RectF F;
  
  private static RectF a(float[] paramArrayOffloat) {
    if (paramArrayOffloat.length == 4)
      return new RectF(paramArrayOffloat[0], paramArrayOffloat[1], paramArrayOffloat[0] + paramArrayOffloat[2], paramArrayOffloat[1] + paramArrayOffloat[3]); 
    throw new JSApplicationIllegalArgumentException("Clipping should be array of length 4 (e.g. [x, y, width, height])");
  }
  
  public void a(Canvas paramCanvas, Paint paramPaint, float paramFloat) {
    paramFloat *= this.A;
    if (paramFloat > 0.01F) {
      b(paramCanvas);
      RectF rectF = this.F;
      if (rectF != null) {
        float f1 = rectF.left;
        float f2 = this.C;
        paramCanvas.clipRect(f1 * f2, rectF.top * f2, rectF.right * f2, rectF.bottom * f2);
      } 
      int i;
      for (i = 0; i < a(); i++) {
        f f1 = (f)a(i);
        f1.a(paramCanvas, paramPaint, paramFloat);
        f1.e();
      } 
      a(paramCanvas);
    } 
  }
  
  @com.facebook.react.uimanager.e1.a(name = "clipping")
  public void setClipping(ReadableArray paramReadableArray) {
    float[] arrayOfFloat = g.a(paramReadableArray);
    if (arrayOfFloat != null) {
      this.F = a(arrayOfFloat);
      L();
    } 
  }
  
  public boolean y() {
    return true;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/art/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */