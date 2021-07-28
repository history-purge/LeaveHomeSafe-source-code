package e.f.b.b.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.Image;
import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.internal.q;
import com.google.mlkit.vision.common.internal.d;
import e.f.a.e.i.j.d6;
import e.f.a.e.i.j.f6;
import e.f.b.a.c.h;
import java.nio.ByteBuffer;

public class a implements h {
  private volatile Bitmap a;
  
  private volatile ByteBuffer b;
  
  private volatile b c;
  
  private final int d;
  
  private final int e;
  
  private final int f;
  
  private final int g;
  
  private a(Bitmap paramBitmap, int paramInt) {
    q.a(paramBitmap);
    this.a = paramBitmap;
    this.d = paramBitmap.getWidth();
    this.e = paramBitmap.getHeight();
    this.f = paramInt;
    this.g = -1;
  }
  
  public static a a(@RecentlyNonNull Context paramContext, @RecentlyNonNull Uri paramUri) {
    int i;
    q.a(paramContext, "Please provide a valid Context");
    q.a(paramUri, "Please provide a valid imageUri");
    long l = SystemClock.elapsedRealtime();
    Bitmap bitmap = d.a().a(paramContext.getContentResolver(), paramUri);
    a a1 = new a(bitmap, 0);
    if (Build.VERSION.SDK_INT > 19) {
      i = bitmap.getAllocationByteCount();
    } else {
      i = bitmap.getByteCount();
    } 
    a(-1, 4, l, -1, -1, i, 0);
    return a1;
  }
  
  public static a a(@RecentlyNonNull Bitmap paramBitmap, int paramInt) {
    int i;
    long l = SystemClock.elapsedRealtime();
    a a1 = new a(paramBitmap, paramInt);
    if (Build.VERSION.SDK_INT > 19) {
      i = paramBitmap.getAllocationByteCount();
    } else {
      i = paramBitmap.getByteCount();
    } 
    a(-1, 1, l, -1, -1, i, paramInt);
    return a1;
  }
  
  private static void a(int paramInt1, int paramInt2, long paramLong, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
    f6.a(d6.a("vision-common"), paramInt1, paramInt2, paramLong, paramInt3, paramInt4, paramInt5, paramInt6);
  }
  
  @RecentlyNullable
  public Bitmap a() {
    return this.a;
  }
  
  @RecentlyNullable
  public ByteBuffer b() {
    return this.b;
  }
  
  public int c() {
    return this.g;
  }
  
  public int d() {
    return this.e;
  }
  
  @RecentlyNullable
  public Image.Plane[] e() {
    if (this.c == null)
      return null; 
    this.c.a();
    throw null;
  }
  
  public int f() {
    return this.f;
  }
  
  public int g() {
    return this.d;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/b/b/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */