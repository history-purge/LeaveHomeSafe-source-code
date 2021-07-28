package e.f.a.e.i.n;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Matrix;
import java.nio.ByteBuffer;

public final class g7 {
  public static Bitmap a(Bitmap paramBitmap, c7 paramc7) {
    int j = paramBitmap.getWidth();
    int k = paramBitmap.getHeight();
    Bitmap bitmap = paramBitmap;
    if (paramc7.g != 0) {
      Matrix matrix = new Matrix();
      int m = paramc7.g;
      if (m != 0) {
        if (m != 1) {
          if (m != 2) {
            if (m == 3) {
              m = 270;
            } else {
              throw new IllegalArgumentException("Unsupported rotation degree.");
            } 
          } else {
            m = 180;
          } 
        } else {
          m = 90;
        } 
      } else {
        m = 0;
      } 
      matrix.postRotate(m);
      bitmap = Bitmap.createBitmap(paramBitmap, 0, 0, j, k, matrix, false);
    } 
    int i = paramc7.g;
    if (i == 1 || i == 3) {
      paramc7.c = k;
      paramc7.d = j;
    } 
    return bitmap;
  }
  
  public static ByteBuffer a(Bitmap paramBitmap, boolean paramBoolean) {
    int m = paramBitmap.getWidth();
    int i = paramBitmap.getHeight();
    int k = m * i;
    ByteBuffer byteBuffer = ByteBuffer.allocateDirect(((m + 1) / 2 * (i + 1) / 2 << 1) + k);
    i = 0;
    int j;
    for (j = k; i < k; j = n) {
      int i1 = i % m;
      int i2 = i / m;
      int i4 = paramBitmap.getPixel(i1, i2);
      int n = Color.red(i4);
      int i3 = Color.green(i4);
      i4 = Color.blue(i4);
      float f1 = n;
      float f2 = i3;
      float f3 = i4;
      byteBuffer.put(i, (byte)(int)(0.299F * f1 + 0.587F * f2 + 0.114F * f3));
      n = j;
      if (i2 % 2 == 0) {
        n = j;
        if (i1 % 2 == 0) {
          i1 = j + 1;
          byteBuffer.put(j, (byte)(int)(-0.169F * f1 + -0.331F * f2 + f3 * 0.5F + 128.0F));
          n = i1 + 1;
          byteBuffer.put(i1, (byte)(int)(f1 * 0.5F + f2 * -0.419F + f3 * -0.081F + 128.0F));
        } 
      } 
      i++;
    } 
    return byteBuffer;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/n/g7.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */