package com.google.mlkit.vision.common.internal;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.media.Image;
import android.os.Build;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.q;
import e.f.b.a.a;
import e.f.b.b.a.a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

public class c {
  private static final c a = new c();
  
  private static Bitmap a(Bitmap paramBitmap, int paramInt1, int paramInt2, int paramInt3) {
    if (paramInt1 == 0)
      return Bitmap.createBitmap(paramBitmap, 0, 0, paramInt2, paramInt3); 
    Matrix matrix = new Matrix();
    matrix.postRotate(paramInt1);
    return Bitmap.createBitmap(paramBitmap, 0, 0, paramInt2, paramInt3, matrix, true);
  }
  
  private final Bitmap a(ByteBuffer paramByteBuffer, int paramInt1, int paramInt2, int paramInt3) {
    byte[] arrayOfByte = a(a(paramByteBuffer), paramInt1, paramInt2);
    Bitmap bitmap = BitmapFactory.decodeByteArray(arrayOfByte, 0, arrayOfByte.length);
    return a(bitmap, paramInt3, bitmap.getWidth(), bitmap.getHeight());
  }
  
  @RecentlyNonNull
  public static c a() {
    return a;
  }
  
  @RecentlyNonNull
  public static ByteBuffer a(@RecentlyNonNull ByteBuffer paramByteBuffer, boolean paramBoolean) {
    int j;
    int m;
    ByteBuffer byteBuffer;
    paramByteBuffer.rewind();
    int i = paramByteBuffer.limit();
    int k = i / 6;
    if (paramBoolean) {
      byteBuffer = ByteBuffer.allocate(i);
    } else {
      byteBuffer = ByteBuffer.allocateDirect(i);
    } 
    byte b = 0;
    i = 0;
    while (true) {
      m = k * 4;
      j = b;
      if (i < m) {
        byteBuffer.put(i, paramByteBuffer.get(i));
        i++;
        continue;
      } 
      break;
    } 
    while (j < k + k) {
      byteBuffer.put(m + j, paramByteBuffer.get(j % 2 * k + m + j / 2));
      j++;
    } 
    return byteBuffer;
  }
  
  static final ByteBuffer a(Image.Plane[] paramArrayOfPlane, int paramInt1, int paramInt2) {
    int j = paramInt1 * paramInt2;
    int i = j / 4;
    byte[] arrayOfByte = new byte[i + i + j];
    ByteBuffer byteBuffer1 = paramArrayOfPlane[1].getBuffer();
    ByteBuffer byteBuffer2 = paramArrayOfPlane[2].getBuffer();
    int k = byteBuffer2.position();
    int m = byteBuffer1.limit();
    byteBuffer2.position(k + 1);
    byteBuffer1.limit(m - 1);
    i = byteBuffer2.remaining();
    int n = (j + j) / 4;
    if (i == n - 2 && byteBuffer2.compareTo(byteBuffer1) == 0) {
      i = 1;
    } else {
      i = 0;
    } 
    byteBuffer2.position(k);
    byteBuffer1.limit(m);
    if (i != 0) {
      paramArrayOfPlane[0].getBuffer().get(arrayOfByte, 0, j);
      byteBuffer1 = paramArrayOfPlane[1].getBuffer();
      paramArrayOfPlane[2].getBuffer().get(arrayOfByte, j, 1);
      byteBuffer1.get(arrayOfByte, j + 1, n - 1);
    } else {
      a(paramArrayOfPlane[0], paramInt1, paramInt2, arrayOfByte, 0, 1);
      a(paramArrayOfPlane[1], paramInt1, paramInt2, arrayOfByte, j + 1, 2);
      a(paramArrayOfPlane[2], paramInt1, paramInt2, arrayOfByte, j, 2);
    } 
    return ByteBuffer.wrap(arrayOfByte);
  }
  
  @TargetApi(19)
  private static final void a(Image.Plane paramPlane, int paramInt1, int paramInt2, byte[] paramArrayOfbyte, int paramInt3, int paramInt4) {
    ByteBuffer byteBuffer = paramPlane.getBuffer();
    byteBuffer.rewind();
    int i = (byteBuffer.limit() + paramPlane.getRowStride() - 1) / paramPlane.getRowStride();
    if (i == 0)
      return; 
    int j = paramInt1 / paramInt2 / i;
    paramInt2 = paramInt3;
    paramInt3 = 0;
    paramInt1 = 0;
    while (paramInt3 < i) {
      int k = paramInt1;
      int m;
      for (m = 0; m < j; m++) {
        paramArrayOfbyte[paramInt2] = byteBuffer.get(k);
        paramInt2 += paramInt4;
        k += paramPlane.getPixelStride();
      } 
      paramInt1 += paramPlane.getRowStride();
      paramInt3++;
    } 
  }
  
  private static byte[] a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    YuvImage yuvImage = new YuvImage(paramArrayOfbyte, 17, paramInt1, paramInt2, null);
    try {
      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
      try {
        yuvImage.compressToJpeg(new Rect(0, 0, paramInt1, paramInt2), 100, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
      } finally {
        try {
          byteArrayOutputStream.close();
        } finally {
          byteArrayOutputStream = null;
        } 
      } 
    } catch (IOException iOException) {
      Log.w("ImageConvertUtils", "Error closing ByteArrayOutputStream");
      throw new a("Image conversion error from NV21 format", 13);
    } 
  }
  
  public Bitmap a(@RecentlyNonNull a parama) {
    Bitmap bitmap1;
    int i = parama.c();
    if (i != -1) {
      if (i != 17) {
        if (i != 35) {
          if (i == 842094169) {
            ByteBuffer byteBuffer1 = parama.b();
            q.a(byteBuffer1);
            byteBuffer1 = byteBuffer1;
            i = parama.g();
            int j = parama.d();
            int k = parama.f();
            byte[] arrayOfByte = a(a(byteBuffer1, true).array(), i, j);
            bitmap1 = BitmapFactory.decodeByteArray(arrayOfByte, 0, arrayOfByte.length);
            return a(bitmap1, k, bitmap1.getWidth(), bitmap1.getHeight());
          } 
          throw new a("Unsupported image format", 13);
        } 
        if (Build.VERSION.SDK_INT >= 19) {
          Image.Plane[] arrayOfPlane = bitmap1.e();
          q.a(arrayOfPlane);
          return a(a(arrayOfPlane, bitmap1.g(), bitmap1.d()), bitmap1.g(), bitmap1.d(), bitmap1.f());
        } 
        throw new a("Unsupported image format", 13);
      } 
      ByteBuffer byteBuffer = bitmap1.b();
      q.a(byteBuffer);
      return a(byteBuffer, bitmap1.g(), bitmap1.d(), bitmap1.f());
    } 
    Bitmap bitmap2 = bitmap1.a();
    q.a(bitmap2);
    return a(bitmap2, bitmap1.f(), bitmap1.g(), bitmap1.d());
  }
  
  @RecentlyNonNull
  public byte[] a(@RecentlyNonNull ByteBuffer paramByteBuffer) {
    if (paramByteBuffer.hasArray() && paramByteBuffer.arrayOffset() == 0)
      return paramByteBuffer.array(); 
    paramByteBuffer.rewind();
    byte[] arrayOfByte = new byte[paramByteBuffer.limit()];
    paramByteBuffer.get(arrayOfByte, 0, arrayOfByte.length);
    return arrayOfByte;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/mlkit/vision/common/internal/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */