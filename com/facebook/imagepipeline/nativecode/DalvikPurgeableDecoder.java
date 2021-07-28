package com.facebook.imagepipeline.nativecode;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Rect;
import android.os.Build;
import com.facebook.imagepipeline.memory.b;
import com.facebook.imagepipeline.memory.c;
import com.facebook.imagepipeline.platform.f;
import com.facebook.imageutils.a;
import com.facebook.soloader.d;
import e.e.e.d.d;
import e.e.e.d.i;
import e.e.e.d.n;
import e.e.e.g.g;
import e.e.e.h.a;
import e.e.l.e.g;
import e.e.l.k.d;
import java.util.Locale;

@d
public abstract class DalvikPurgeableDecoder implements f {
  protected static final byte[] b = new byte[] { -1, -39 };
  
  private final b a = c.a();
  
  public static BitmapFactory.Options a(int paramInt, Bitmap.Config paramConfig) {
    BitmapFactory.Options options = new BitmapFactory.Options();
    options.inDither = true;
    options.inPreferredConfig = paramConfig;
    options.inPurgeable = true;
    options.inInputShareable = true;
    options.inSampleSize = paramInt;
    if (Build.VERSION.SDK_INT >= 11)
      options.inMutable = true; 
    return options;
  }
  
  public static boolean a(a<g> parama, int paramInt) {
    g g = (g)parama.b();
    return (paramInt >= 2 && g.a(paramInt - 2) == -1 && g.a(paramInt - 1) == -39);
  }
  
  @d
  private static native void nativePinBitmap(Bitmap paramBitmap);
  
  protected abstract Bitmap a(a<g> parama, int paramInt, BitmapFactory.Options paramOptions);
  
  protected abstract Bitmap a(a<g> parama, BitmapFactory.Options paramOptions);
  
  public a<Bitmap> a(Bitmap paramBitmap) {
    i.a(paramBitmap);
    try {
      nativePinBitmap(paramBitmap);
      if (this.a.b(paramBitmap))
        return a.a(paramBitmap, this.a.d()); 
      int i = a.a(paramBitmap);
      paramBitmap.recycle();
      throw new g(String.format(Locale.US, "Attempted to pin a bitmap of size %d bytes. The current pool count is %d, the current pool size is %d bytes. The current pool max count is %d, the current pool max size is %d bytes.", new Object[] { Integer.valueOf(i), Integer.valueOf(this.a.a()), Long.valueOf(this.a.e()), Integer.valueOf(this.a.b()), Integer.valueOf(this.a.c()) }));
    } catch (Exception exception) {
      paramBitmap.recycle();
      n.a(exception);
      throw null;
    } 
  }
  
  public a<Bitmap> a(d paramd, Bitmap.Config paramConfig, Rect paramRect, int paramInt) {
    return a(paramd, paramConfig, paramRect, paramInt, null);
  }
  
  public a<Bitmap> a(d paramd, Bitmap.Config paramConfig, Rect paramRect, int paramInt, ColorSpace paramColorSpace) {
    null = a(paramd.x(), paramConfig);
    if (Build.VERSION.SDK_INT >= 26)
      OreoUtils.a(null, paramColorSpace); 
    a<g> a = paramd.b();
    i.a(a);
    try {
      return a(a(a, paramInt, null));
    } finally {
      a.b(a);
    } 
  }
  
  public a<Bitmap> a(d paramd, Bitmap.Config paramConfig, Rect paramRect, ColorSpace paramColorSpace) {
    null = a(paramd.x(), paramConfig);
    if (Build.VERSION.SDK_INT >= 26)
      OreoUtils.a(null, paramColorSpace); 
    a<g> a = paramd.b();
    i.a(a);
    try {
      return a(a(a, null));
    } finally {
      a.b(a);
    } 
  }
  
  static {
    a.a();
  }
  
  @d
  private static class OreoUtils {
    @TargetApi(26)
    static void a(BitmapFactory.Options param1Options, ColorSpace param1ColorSpace) {
      ColorSpace colorSpace = param1ColorSpace;
      if (param1ColorSpace == null)
        colorSpace = ColorSpace.get(ColorSpace.Named.SRGB); 
      param1Options.inPreferredColorSpace = colorSpace;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/imagepipeline/nativecode/DalvikPurgeableDecoder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */