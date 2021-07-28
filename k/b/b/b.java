package k.b.b;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import org.reactnative.camera.h.a;

public class b {
  public static a a(Bitmap paramBitmap) {
    e.f.a.e.n.b.a a1 = new e.f.a.e.n.b.a();
    a1.a(paramBitmap);
    a a = new a(paramBitmap.getWidth(), paramBitmap.getHeight());
    return new a(a1.a(), a);
  }
  
  public static a a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, int paramInt3) {
    boolean bool;
    e.f.a.e.n.b.a a1 = new e.f.a.e.n.b.a();
    a1.a(ByteBuffer.wrap(paramArrayOfbyte), paramInt1, paramInt2, 17);
    if (paramInt3 != 90) {
      if (paramInt3 != 180) {
        if (paramInt3 != 270) {
          bool = false;
        } else {
          bool = true;
        } 
      } else {
        bool = true;
      } 
    } else {
      bool = true;
    } 
    a1.a(bool);
    a a = new a(paramInt1, paramInt2, paramInt3);
    return new a(a1.a(), a);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/k/b/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */