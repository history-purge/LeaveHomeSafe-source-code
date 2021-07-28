package e.f.a.e.n.f;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.util.SparseArray;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.q;
import e.f.a.e.i.n.c7;
import e.f.a.e.i.n.g7;
import e.f.a.e.i.n.i;
import e.f.a.e.i.n.k;
import e.f.a.e.i.n.n;
import e.f.a.e.i.n.o;
import e.f.a.e.n.a;
import e.f.a.e.n.b;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;

public final class e extends a<d> {
  private final o c;
  
  private e(o paramo) {
    this.c = paramo;
  }
  
  @RecentlyNonNull
  public final SparseArray<d> a(@RecentlyNonNull b paramb) {
    k k = new k(new Rect());
    if (paramb != null) {
      c7 c7 = c7.a(paramb);
      Bitmap bitmap1 = paramb.a();
      boolean bool = false;
      if (bitmap1 != null) {
        bitmap1 = paramb.a();
      } else {
        b.b b1 = paramb.c();
        ByteBuffer byteBuffer = paramb.b();
        q.a(byteBuffer);
        byteBuffer = byteBuffer;
        int m = b1.a();
        int n = c7.c;
        int i1 = c7.d;
        if (byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
          arrayOfByte = byteBuffer.array();
        } else {
          arrayOfByte = new byte[byteBuffer.capacity()];
          byteBuffer.get(arrayOfByte);
        } 
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        (new YuvImage(arrayOfByte, m, n, i1, null)).compressToJpeg(new Rect(0, 0, n, i1), 100, byteArrayOutputStream);
        byte[] arrayOfByte = byteArrayOutputStream.toByteArray();
        bitmap1 = BitmapFactory.decodeByteArray(arrayOfByte, 0, arrayOfByte.length);
      } 
      q.a(bitmap1);
      Bitmap bitmap2 = g7.a(bitmap1, c7);
      if (!k.c.isEmpty()) {
        Rect rect1;
        Rect rect2 = k.c;
        int m = paramb.c().f();
        int n = paramb.c().b();
        int i1 = c7.g;
        if (i1 != 1) {
          if (i1 != 2) {
            if (i1 != 3) {
              rect1 = rect2;
            } else {
              rect1 = new Rect(rect2.top, m - rect2.right, rect2.bottom, m - rect2.left);
            } 
          } else {
            rect1 = new Rect(m - rect2.right, n - rect2.bottom, m - rect2.left, n - rect2.top);
          } 
        } else {
          rect1 = new Rect(n - rect2.bottom, rect2.left, n - rect2.top, rect2.right);
        } 
        k.c.set(rect1);
      } 
      c7.g = 0;
      i[] arrayOfI = this.c.a(bitmap2, c7, k);
      SparseArray sparseArray1 = new SparseArray();
      int j = arrayOfI.length;
      int i;
      for (i = 0; i < j; i++) {
        i i1 = arrayOfI[i];
        SparseArray sparseArray3 = (SparseArray)sparseArray1.get(i1.l);
        SparseArray sparseArray2 = sparseArray3;
        if (sparseArray3 == null) {
          sparseArray2 = new SparseArray();
          sparseArray1.append(i1.l, sparseArray2);
        } 
        sparseArray2.append(i1.m, i1);
      } 
      SparseArray<d> sparseArray = new SparseArray(sparseArray1.size());
      for (i = bool; i < sparseArray1.size(); i++)
        sparseArray.append(sparseArray1.keyAt(i), new d((SparseArray<i>)sparseArray1.valueAt(i))); 
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
    
    private n b;
    
    public a(@RecentlyNonNull Context param1Context) {
      this.a = param1Context;
      this.b = new n();
    }
    
    @RecentlyNonNull
    public e a() {
      return new e(new o(this.a, this.b), null);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/n/f/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */