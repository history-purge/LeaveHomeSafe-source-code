package e.f.a.b;

import android.content.Context;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import b.g.m.v;
import org.reactnative.camera.b;

class l extends i {
  final SurfaceView d;
  
  l(Context paramContext, ViewGroup paramViewGroup) {
    this.d = (SurfaceView)View.inflate(paramContext, b.surface_view, paramViewGroup).findViewById(org.reactnative.camera.a.surface_view);
    SurfaceHolder surfaceHolder = this.d.getHolder();
    surfaceHolder.setType(3);
    surfaceHolder.addCallback(new a(this));
  }
  
  void a(int paramInt) {}
  
  Class d() {
    return SurfaceHolder.class;
  }
  
  Surface e() {
    return f().getSurface();
  }
  
  SurfaceHolder f() {
    return this.d.getHolder();
  }
  
  View h() {
    return (View)this.d;
  }
  
  boolean j() {
    return (i() != 0 && c() != 0);
  }
  
  class a implements SurfaceHolder.Callback {
    a(l this$0) {}
    
    public void surfaceChanged(SurfaceHolder param1SurfaceHolder, int param1Int1, int param1Int2, int param1Int3) {
      this.c.b(param1Int2, param1Int3);
      if (!v.H((View)this.c.d))
        this.c.a(); 
    }
    
    public void surfaceCreated(SurfaceHolder param1SurfaceHolder) {}
    
    public void surfaceDestroyed(SurfaceHolder param1SurfaceHolder) {
      this.c.b(0, 0);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/b/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */