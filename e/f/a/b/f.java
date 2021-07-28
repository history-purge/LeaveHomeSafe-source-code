package e.f.a.b;

import android.graphics.SurfaceTexture;
import android.media.CamcorderProfile;
import android.os.Handler;
import android.view.View;
import com.facebook.react.bridge.ReadableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.SortedSet;

abstract class f {
  protected final a c;
  
  protected final i d;
  
  protected final Handler e;
  
  f(a parama, i parami, Handler paramHandler) {
    this.c = parama;
    this.d = parami;
    this.e = paramHandler;
  }
  
  abstract a a();
  
  abstract SortedSet<j> a(a parama);
  
  abstract void a(float paramFloat);
  
  abstract void a(float paramFloat1, float paramFloat2);
  
  abstract void a(int paramInt);
  
  public abstract void a(SurfaceTexture paramSurfaceTexture);
  
  abstract void a(ReadableMap paramReadableMap);
  
  abstract void a(j paramj);
  
  abstract void a(String paramString);
  
  abstract void a(boolean paramBoolean);
  
  abstract boolean a(String paramString, int paramInt1, int paramInt2, boolean paramBoolean, CamcorderProfile paramCamcorderProfile, int paramInt3, int paramInt4);
  
  abstract void b(float paramFloat);
  
  abstract void b(int paramInt);
  
  abstract void b(boolean paramBoolean);
  
  abstract boolean b();
  
  abstract boolean b(a parama);
  
  abstract String c();
  
  abstract void c(float paramFloat);
  
  abstract void c(int paramInt);
  
  abstract void c(boolean paramBoolean);
  
  abstract List<Properties> d();
  
  abstract void d(int paramInt);
  
  abstract int e();
  
  abstract void e(int paramInt);
  
  abstract float f();
  
  abstract int g();
  
  abstract int h();
  
  abstract float i();
  
  abstract j j();
  
  abstract boolean k();
  
  public abstract j l();
  
  abstract boolean m();
  
  abstract Set<a> n();
  
  public abstract ArrayList<int[]> o();
  
  View p() {
    return this.d.h();
  }
  
  abstract int q();
  
  abstract float r();
  
  abstract boolean s();
  
  public abstract void t();
  
  abstract void u();
  
  public abstract void v();
  
  abstract void w();
  
  abstract boolean x();
  
  abstract void y();
  
  abstract void z();
  
  static interface a {
    void a();
    
    void a(String param1String, int param1Int1, int param1Int2);
    
    void a(byte[] param1ArrayOfbyte, int param1Int);
    
    void a(byte[] param1ArrayOfbyte, int param1Int1, int param1Int2, int param1Int3);
    
    void b();
    
    void b(String param1String, int param1Int1, int param1Int2);
    
    void c();
    
    void d();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/b/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */