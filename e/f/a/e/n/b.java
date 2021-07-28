package e.f.a.e.n;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.media.Image;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import java.nio.ByteBuffer;

public class b {
  private final b a = new b();
  
  private ByteBuffer b = null;
  
  private c c = null;
  
  private Bitmap d = null;
  
  private b() {}
  
  @RecentlyNullable
  public Bitmap a() {
    return this.d;
  }
  
  @RecentlyNullable
  public ByteBuffer b() {
    Bitmap bitmap = this.d;
    if (bitmap != null) {
      if (bitmap == null)
        return null; 
      int i = bitmap.getWidth();
      int j = this.d.getHeight();
      int k = i * j;
      int[] arrayOfInt = new int[k];
      this.d.getPixels(arrayOfInt, 0, i, 0, 0, i, j);
      byte[] arrayOfByte = new byte[k];
      for (i = 0; i < arrayOfInt.length; i++)
        arrayOfByte[i] = (byte)(int)(Color.red(arrayOfInt[i]) * 0.299F + Color.green(arrayOfInt[i]) * 0.587F + Color.blue(arrayOfInt[i]) * 0.114F); 
      return ByteBuffer.wrap(arrayOfByte);
    } 
    return this.b;
  }
  
  @RecentlyNonNull
  public b c() {
    return this.a;
  }
  
  @RecentlyNullable
  public Image.Plane[] d() {
    c c1 = this.c;
    if (c1 == null)
      return null; 
    c1.a();
    throw null;
  }
  
  public static class a {
    private final b a = new b(null);
    
    @RecentlyNonNull
    public a a(int param1Int) {
      b.b.d(this.a.c(), param1Int);
      return this;
    }
    
    @RecentlyNonNull
    public a a(@RecentlyNonNull Bitmap param1Bitmap) {
      int i = param1Bitmap.getWidth();
      int j = param1Bitmap.getHeight();
      b.a(this.a, param1Bitmap);
      b.b b1 = this.a.c();
      b.b.a(b1, i);
      b.b.b(b1, j);
      return this;
    }
    
    @RecentlyNonNull
    public a a(@RecentlyNonNull ByteBuffer param1ByteBuffer, int param1Int1, int param1Int2, int param1Int3) {
      if (param1ByteBuffer != null) {
        if (param1ByteBuffer.capacity() >= param1Int1 * param1Int2) {
          if (param1Int3 == 16 || param1Int3 == 17 || param1Int3 == 842094169) {
            b.a(this.a, param1ByteBuffer);
            b.b b1 = this.a.c();
            b.b.a(b1, param1Int1);
            b.b.b(b1, param1Int2);
            b.b.c(b1, param1Int3);
            return this;
          } 
          StringBuilder stringBuilder = new StringBuilder(37);
          stringBuilder.append("Unsupported image format: ");
          stringBuilder.append(param1Int3);
          throw new IllegalArgumentException(stringBuilder.toString());
        } 
        throw new IllegalArgumentException("Invalid image data size.");
      } 
      throw new IllegalArgumentException("Null image data supplied.");
    }
    
    @RecentlyNonNull
    public b a() {
      if (b.a(this.a) != null || b.b(this.a) != null || b.c(this.a) != null)
        return this.a; 
      throw new IllegalStateException("Missing image data.  Call either setBitmap or setImageData to specify the image");
    }
  }
  
  public static class b {
    private int a;
    
    private int b;
    
    private int c;
    
    private long d;
    
    private int e;
    
    private int f = -1;
    
    public int a() {
      return this.f;
    }
    
    public int b() {
      return this.b;
    }
    
    public int c() {
      return this.c;
    }
    
    public int d() {
      return this.e;
    }
    
    public long e() {
      return this.d;
    }
    
    public int f() {
      return this.a;
    }
  }
  
  private static final class c {
    final Image.Plane[] a() {
      throw null;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/n/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */