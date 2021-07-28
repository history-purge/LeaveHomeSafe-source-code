package com.facebook.react.views.art;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.uimanager.a0;
import com.facebook.react.uimanager.e1.a;
import com.facebook.react.uimanager.i;
import com.facebook.react.uimanager.k0;
import com.facebook.react.uimanager.v0;
import e.e.e.e.a;

public class d extends i implements TextureView.SurfaceTextureListener, LifecycleEventListener {
  private Surface B;
  
  private Integer C;
  
  private void b(boolean paramBoolean) {
    Surface surface = this.B;
    if (surface == null || !surface.isValid()) {
      f((a0)this);
      return;
    } 
    try {
      Canvas canvas = this.B.lockCanvas(null);
      PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
      int j = 0;
      canvas.drawColor(0, mode);
      if (this.C != null)
        canvas.drawColor(this.C.intValue()); 
      Paint paint = new Paint();
      while (true) {
        if (j < a()) {
          f f = (f)a(j);
          f.a(canvas, paint, 1.0F);
          if (paramBoolean) {
            f.L();
          } else {
            f.e();
          } 
        } else {
          if (this.B == null)
            return; 
          this.B.unlockCanvasAndPost(canvas);
          return;
        } 
        j++;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
    
    } catch (IllegalStateException illegalStateException) {}
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(illegalStateException.getClass().getSimpleName());
    stringBuilder.append(" in Surface.unlockCanvasAndPost");
    a.b("ReactNative", stringBuilder.toString());
  }
  
  private void f(a0 parama0) {
    for (int j = 0; j < parama0.a(); j++) {
      a0 a01 = parama0.a(j);
      a01.e();
      f(a01);
    } 
  }
  
  public boolean I() {
    return true;
  }
  
  public void a(k0 paramk0) {
    super.a(paramk0);
    if (Build.VERSION.SDK_INT > 24)
      paramk0.addLifecycleEventListener(this); 
  }
  
  public void a(v0 paramv0) {
    super.a(paramv0);
    b(false);
    paramv0.a(t(), this);
  }
  
  public void a(c paramc) {
    SurfaceTexture surfaceTexture = paramc.getSurfaceTexture();
    paramc.setSurfaceTextureListener(this);
    if (surfaceTexture != null && this.B == null) {
      this.B = new Surface(surfaceTexture);
      b(true);
    } 
  }
  
  public void dispose() {
    super.dispose();
    if (Build.VERSION.SDK_INT > 24)
      h().removeLifecycleEventListener(this); 
  }
  
  public void onHostDestroy() {}
  
  public void onHostPause() {}
  
  public void onHostResume() {
    b(false);
  }
  
  public void onSurfaceTextureAvailable(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2) {
    this.B = new Surface(paramSurfaceTexture);
    b(false);
  }
  
  public boolean onSurfaceTextureDestroyed(SurfaceTexture paramSurfaceTexture) {
    this.B.release();
    this.B = null;
    return true;
  }
  
  public void onSurfaceTextureSizeChanged(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2) {}
  
  public void onSurfaceTextureUpdated(SurfaceTexture paramSurfaceTexture) {}
  
  @a(customType = "Color", name = "backgroundColor")
  public void setBackgroundColor(Integer paramInteger) {
    this.C = paramInteger;
    L();
  }
  
  public boolean y() {
    return false;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/art/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */