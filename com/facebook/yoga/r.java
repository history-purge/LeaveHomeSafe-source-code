package com.facebook.yoga;

public class r extends YogaNodeJNIBase {
  public r() {}
  
  public r(c paramc) {
    super(paramc);
  }
  
  protected void finalize() {
    try {
      s();
      return;
    } finally {
      super.finalize();
    } 
  }
  
  public void s() {
    long l = this.g;
    if (l != 0L) {
      this.g = 0L;
      YogaNative.jni_YGNodeFreeJNI(l);
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/yoga/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */