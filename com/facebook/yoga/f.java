package com.facebook.yoga;

public class f extends e {
  public void a() {
    long l = this.a;
    if (l != 0L) {
      this.a = 0L;
      YogaNative.jni_YGConfigFreeJNI(l);
    } 
  }
  
  protected void finalize() {
    try {
      a();
      return;
    } finally {
      super.finalize();
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/yoga/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */