package com.facebook.yoga;

public abstract class e extends c {
  long a;
  
  e() {
    this(YogaNative.jni_YGConfigNewJNI());
  }
  
  private e(long paramLong) {
    if (paramLong != 0L) {
      this.a = paramLong;
      return;
    } 
    throw new IllegalStateException("Failed to allocate native memory");
  }
  
  public void a(float paramFloat) {
    YogaNative.jni_YGConfigSetPointScaleFactorJNI(this.a, paramFloat);
  }
  
  public void a(boolean paramBoolean) {
    YogaNative.jni_YGConfigSetUseLegacyStretchBehaviourJNI(this.a, paramBoolean);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/yoga/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */