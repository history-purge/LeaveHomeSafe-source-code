package e.f.a.e.n.d;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.Image;
import android.os.Build;
import android.util.SparseArray;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.q;
import e.f.a.e.i.n.c7;
import e.f.a.e.i.n.g4;
import e.f.a.e.i.n.g6;
import e.f.a.e.n.a;
import java.nio.ByteBuffer;

public final class b extends a<a> {
  private final g6 c;
  
  private b(g6 paramg6) {
    this.c = paramg6;
  }
  
  @RecentlyNonNull
  public final SparseArray<a> a(@RecentlyNonNull e.f.a.e.n.b paramb) {
    if (paramb != null) {
      a[] arrayOfA;
      c7 c7 = c7.a(paramb);
      Bitmap bitmap = paramb.a();
      int i = 0;
      if (bitmap != null) {
        g6 g61 = this.c;
        Bitmap bitmap1 = paramb.a();
        q.a(bitmap1);
        arrayOfA = g61.a(bitmap1, c7);
        if (arrayOfA == null)
          throw new IllegalArgumentException("Internal barcode detector error; check logcat output."); 
      } else {
        a[] arrayOfA1;
        g6 g61;
        if (Build.VERSION.SDK_INT >= 19 && arrayOfA.d() != null) {
          Image.Plane[] arrayOfPlane2 = arrayOfA.d();
          q.a(arrayOfPlane2);
          ByteBuffer byteBuffer = arrayOfPlane2[0].getBuffer();
          Image.Plane[] arrayOfPlane1 = arrayOfA.d();
          q.a(arrayOfPlane1);
          c7 c71 = new c7(arrayOfPlane1[0].getRowStride(), c7.d, c7.e, c7.f, c7.g);
          g61 = this.c;
          q.a(byteBuffer);
          arrayOfA1 = g61.a(byteBuffer, c71);
        } else {
          ByteBuffer byteBuffer = arrayOfA1.b();
          g6 g62 = this.c;
          q.a(byteBuffer);
          arrayOfA = g62.a(byteBuffer, (c7)g61);
        } 
      } 
      SparseArray<a> sparseArray = new SparseArray(arrayOfA.length);
      int j = arrayOfA.length;
      while (i < j) {
        a a1 = arrayOfA[i];
        sparseArray.append(a1.d.hashCode(), a1);
        i++;
      } 
      return sparseArray;
    } 
    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("No frame supplied.");
    throw illegalArgumentException;
  }
  
  public final void a() {
    super.a();
    this.c.c();
  }
  
  public final boolean b() {
    return this.c.b();
  }
  
  public static class a {
    private Context a;
    
    private g4 b;
    
    public a(@RecentlyNonNull Context param1Context) {
      this.a = param1Context;
      this.b = new g4();
    }
    
    @RecentlyNonNull
    public a a(int param1Int) {
      this.b.c = param1Int;
      return this;
    }
    
    @RecentlyNonNull
    public b a() {
      return new b(new g6(this.a, this.b), null);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/n/d/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */