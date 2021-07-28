package e.f.a.b;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import org.reactnative.camera.b;

@TargetApi(14)
class m extends i {
  private final TextureView d;
  
  private int e;
  
  m(Context paramContext, ViewGroup paramViewGroup) {
    this.d = (TextureView)View.inflate(paramContext, b.texture_view, paramViewGroup).findViewById(org.reactnative.camera.a.texture_view);
    this.d.setSurfaceTextureListener(new a(this));
  }
  
  void a(int paramInt) {
    this.e = paramInt;
    k();
  }
  
  @TargetApi(15)
  void a(int paramInt1, int paramInt2) {
    this.d.getSurfaceTexture().setDefaultBufferSize(paramInt1, paramInt2);
  }
  
  Class d() {
    return SurfaceTexture.class;
  }
  
  Surface e() {
    return new Surface(this.d.getSurfaceTexture());
  }
  
  SurfaceTexture g() {
    return this.d.getSurfaceTexture();
  }
  
  View h() {
    return (View)this.d;
  }
  
  boolean j() {
    return (this.d.getSurfaceTexture() != null);
  }
  
  void k() {
    Matrix matrix = new Matrix();
    int j = this.e;
    if (j % 180 == 90) {
      float[] arrayOfFloat;
      j = i();
      int k = c();
      float f1 = j;
      float f2 = k;
      if (this.e == 90) {
        arrayOfFloat = new float[8];
        arrayOfFloat[0] = 0.0F;
        arrayOfFloat[1] = f2;
        arrayOfFloat[2] = 0.0F;
        arrayOfFloat[3] = 0.0F;
        arrayOfFloat[4] = f1;
        arrayOfFloat[5] = f2;
        arrayOfFloat[6] = f1;
        arrayOfFloat[7] = 0.0F;
      } else {
        arrayOfFloat = new float[8];
        arrayOfFloat[0] = f1;
        arrayOfFloat[1] = 0.0F;
        arrayOfFloat[2] = f1;
        arrayOfFloat[3] = f2;
        arrayOfFloat[4] = 0.0F;
        arrayOfFloat[5] = 0.0F;
        arrayOfFloat[6] = 0.0F;
        arrayOfFloat[7] = f2;
      } 
      matrix.setPolyToPoly(new float[] { 0.0F, 0.0F, f1, 0.0F, 0.0F, f2, f1, f2 }, 0, arrayOfFloat, 0, 4);
    } else if (j == 180) {
      matrix.postRotate(180.0F, (i() / 2), (c() / 2));
    } 
    this.d.setTransform(matrix);
  }
  
  class a implements TextureView.SurfaceTextureListener {
    a(m this$0) {}
    
    public void onSurfaceTextureAvailable(SurfaceTexture param1SurfaceTexture, int param1Int1, int param1Int2) {
      this.c.b(param1Int1, param1Int2);
      this.c.k();
      this.c.a();
    }
    
    public boolean onSurfaceTextureDestroyed(SurfaceTexture param1SurfaceTexture) {
      this.c.b(0, 0);
      this.c.b();
      return true;
    }
    
    public void onSurfaceTextureSizeChanged(SurfaceTexture param1SurfaceTexture, int param1Int1, int param1Int2) {
      this.c.b(param1Int1, param1Int2);
      this.c.k();
      this.c.a();
    }
    
    public void onSurfaceTextureUpdated(SurfaceTexture param1SurfaceTexture) {}
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/b/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */