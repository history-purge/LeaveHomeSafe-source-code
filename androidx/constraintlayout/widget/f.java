package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ViewGroup;

public class f extends ViewGroup {
  e c;
  
  protected a generateDefaultLayoutParams() {
    return new a(-2, -2);
  }
  
  protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams) {
    return (ViewGroup.LayoutParams)new ConstraintLayout.b(paramLayoutParams);
  }
  
  public a generateLayoutParams(AttributeSet paramAttributeSet) {
    return new a(getContext(), paramAttributeSet);
  }
  
  public e getConstraintSet() {
    if (this.c == null)
      this.c = new e(); 
    this.c.a(this);
    return this.c;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
  
  public static class a extends ConstraintLayout.b {
    public float A0;
    
    public float o0 = 1.0F;
    
    public boolean p0;
    
    public float q0;
    
    public float r0;
    
    public float s0;
    
    public float t0;
    
    public float u0;
    
    public float v0;
    
    public float w0;
    
    public float x0;
    
    public float y0;
    
    public float z0;
    
    public a(int param1Int1, int param1Int2) {
      super(param1Int1, param1Int2);
      this.p0 = false;
      this.q0 = 0.0F;
      this.r0 = 0.0F;
      this.s0 = 0.0F;
      this.t0 = 0.0F;
      this.u0 = 1.0F;
      this.v0 = 1.0F;
      this.w0 = 0.0F;
      this.x0 = 0.0F;
      this.y0 = 0.0F;
      this.z0 = 0.0F;
      this.A0 = 0.0F;
    }
    
    public a(Context param1Context, AttributeSet param1AttributeSet) {
      super(param1Context, param1AttributeSet);
      int i = 0;
      this.p0 = false;
      this.q0 = 0.0F;
      this.r0 = 0.0F;
      this.s0 = 0.0F;
      this.t0 = 0.0F;
      this.u0 = 1.0F;
      this.v0 = 1.0F;
      this.w0 = 0.0F;
      this.x0 = 0.0F;
      this.y0 = 0.0F;
      this.z0 = 0.0F;
      this.A0 = 0.0F;
      TypedArray typedArray = param1Context.obtainStyledAttributes(param1AttributeSet, k.ConstraintSet);
      int j = typedArray.getIndexCount();
      while (i < j) {
        int k = typedArray.getIndex(i);
        if (k == k.ConstraintSet_android_alpha) {
          this.o0 = typedArray.getFloat(k, this.o0);
        } else if (k == k.ConstraintSet_android_elevation) {
          if (Build.VERSION.SDK_INT >= 21) {
            this.q0 = typedArray.getFloat(k, this.q0);
            this.p0 = true;
          } 
        } else if (k == k.ConstraintSet_android_rotationX) {
          this.s0 = typedArray.getFloat(k, this.s0);
        } else if (k == k.ConstraintSet_android_rotationY) {
          this.t0 = typedArray.getFloat(k, this.t0);
        } else if (k == k.ConstraintSet_android_rotation) {
          this.r0 = typedArray.getFloat(k, this.r0);
        } else if (k == k.ConstraintSet_android_scaleX) {
          this.u0 = typedArray.getFloat(k, this.u0);
        } else if (k == k.ConstraintSet_android_scaleY) {
          this.v0 = typedArray.getFloat(k, this.v0);
        } else if (k == k.ConstraintSet_android_transformPivotX) {
          this.w0 = typedArray.getFloat(k, this.w0);
        } else if (k == k.ConstraintSet_android_transformPivotY) {
          this.x0 = typedArray.getFloat(k, this.x0);
        } else if (k == k.ConstraintSet_android_translationX) {
          this.y0 = typedArray.getFloat(k, this.y0);
        } else if (k == k.ConstraintSet_android_translationY) {
          this.z0 = typedArray.getFloat(k, this.z0);
        } else if (k == k.ConstraintSet_android_translationZ && Build.VERSION.SDK_INT >= 21) {
          this.A0 = typedArray.getFloat(k, this.A0);
        } 
        i++;
      } 
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/constraintlayout/widget/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */