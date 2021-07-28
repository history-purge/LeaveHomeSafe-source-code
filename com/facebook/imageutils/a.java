package com.facebook.imageutils;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.os.Build;
import android.util.Pair;
import androidx.core.util.e;
import e.e.e.d.i;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class a {
  private static final e<ByteBuffer> a = new e(12);
  
  public static int a(int paramInt1, int paramInt2, Bitmap.Config paramConfig) {
    return paramInt1 * paramInt2 * a(paramConfig);
  }
  
  public static int a(Bitmap.Config paramConfig) {
    int i = a.a[paramConfig.ordinal()];
    if (i != 1) {
      if (i != 2) {
        if (i != 3 && i != 4) {
          if (i == 5)
            return 8; 
          throw new UnsupportedOperationException("The provided Bitmap.Config is not supported");
        } 
        return 2;
      } 
      return 1;
    } 
    return 4;
  }
  
  @SuppressLint({"NewApi"})
  public static int a(Bitmap paramBitmap) {
    if (paramBitmap == null)
      return 0; 
    if (Build.VERSION.SDK_INT > 19)
      try {
        return paramBitmap.getAllocationByteCount();
      } catch (NullPointerException nullPointerException) {} 
    return (Build.VERSION.SDK_INT >= 12) ? paramBitmap.getByteCount() : (paramBitmap.getRowBytes() * paramBitmap.getHeight());
  }
  
  public static Pair<Integer, Integer> a(InputStream paramInputStream) {
    i.a(paramInputStream);
    ByteBuffer byteBuffer2 = (ByteBuffer)a.a();
    ByteBuffer byteBuffer1 = byteBuffer2;
    if (byteBuffer2 == null)
      byteBuffer1 = ByteBuffer.allocate(16384); 
    BitmapFactory.Options options = new BitmapFactory.Options();
    options.inJustDecodeBounds = true;
    try {
      Pair<Integer, Integer> pair;
      options.inTempStorage = byteBuffer1.array();
      byteBuffer2 = null;
      BitmapFactory.decodeStream(paramInputStream, null, options);
      ByteBuffer byteBuffer = byteBuffer2;
      if (options.outWidth != -1)
        if (options.outHeight == -1) {
          byteBuffer = byteBuffer2;
        } else {
          pair = new Pair(Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
        }  
      return pair;
    } finally {
      a.a(byteBuffer1);
    } 
  }
  
  public static b b(InputStream paramInputStream) {
    i.a(paramInputStream);
    ByteBuffer byteBuffer2 = (ByteBuffer)a.a();
    ByteBuffer byteBuffer1 = byteBuffer2;
    if (byteBuffer2 == null)
      byteBuffer1 = ByteBuffer.allocate(16384); 
    BitmapFactory.Options options = new BitmapFactory.Options();
    options.inJustDecodeBounds = true;
    try {
      ColorSpace colorSpace;
      options.inTempStorage = byteBuffer1.array();
      byteBuffer2 = null;
      BitmapFactory.decodeStream(paramInputStream, null, options);
      ByteBuffer byteBuffer = byteBuffer2;
      if (Build.VERSION.SDK_INT >= 26)
        colorSpace = options.outColorSpace; 
      return new b(options.outWidth, options.outHeight, colorSpace);
    } finally {
      a.a(byteBuffer1);
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/imageutils/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */