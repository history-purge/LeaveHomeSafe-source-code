package com.google.android.material.textfield;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import e.f.a.f.a0.g;
import e.f.a.f.a0.k;

class c extends g {
  private int A;
  
  private final Paint y = new Paint(1);
  
  private final RectF z;
  
  c() {
    this(null);
  }
  
  c(k paramk) {
    super(paramk);
    u();
    this.z = new RectF();
  }
  
  private void a(Canvas paramCanvas) {
    if (!a(getCallback()))
      paramCanvas.restoreToCount(this.A); 
  }
  
  private boolean a(Drawable.Callback paramCallback) {
    return paramCallback instanceof View;
  }
  
  private void b(Canvas paramCanvas) {
    View view;
    Drawable.Callback callback = getCallback();
    if (a(callback)) {
      view = (View)callback;
      if (view.getLayerType() != 2) {
        view.setLayerType(2, null);
        return;
      } 
    } else {
      c((Canvas)view);
    } 
  }
  
  private void c(Canvas paramCanvas) {
    int i;
    if (Build.VERSION.SDK_INT >= 21) {
      i = paramCanvas.saveLayer(0.0F, 0.0F, paramCanvas.getWidth(), paramCanvas.getHeight(), null);
    } else {
      i = paramCanvas.saveLayer(0.0F, 0.0F, paramCanvas.getWidth(), paramCanvas.getHeight(), null, 31);
    } 
    this.A = i;
  }
  
  private void u() {
    this.y.setStyle(Paint.Style.FILL_AND_STROKE);
    this.y.setColor(-1);
    this.y.setXfermode((Xfermode)new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
  }
  
  void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
    RectF rectF = this.z;
    if (paramFloat1 != rectF.left || paramFloat2 != rectF.top || paramFloat3 != rectF.right || paramFloat4 != rectF.bottom) {
      this.z.set(paramFloat1, paramFloat2, paramFloat3, paramFloat4);
      invalidateSelf();
    } 
  }
  
  void a(RectF paramRectF) {
    a(paramRectF.left, paramRectF.top, paramRectF.right, paramRectF.bottom);
  }
  
  public void draw(Canvas paramCanvas) {
    b(paramCanvas);
    super.draw(paramCanvas);
    paramCanvas.drawRect(this.z, this.y);
    a(paramCanvas);
  }
  
  boolean s() {
    return this.z.isEmpty() ^ true;
  }
  
  void t() {
    a(0.0F, 0.0F, 0.0F, 0.0F);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/material/textfield/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */