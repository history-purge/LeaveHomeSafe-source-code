package e.f.a.f.m;

import android.graphics.Canvas;
import android.os.Build;

public class a {
  public static int a(Canvas paramCanvas, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, int paramInt) {
    return (Build.VERSION.SDK_INT > 21) ? paramCanvas.saveLayerAlpha(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramInt) : paramCanvas.saveLayerAlpha(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramInt, 31);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/f/m/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */