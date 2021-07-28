package com.facebook.jni;

import com.facebook.jni.annotations.DoNotStrip;
import com.facebook.soloader.o.a;

@DoNotStrip
public class HybridData {
  @DoNotStrip
  private Destructor mDestructor = new Destructor(this);
  
  static {
    a.a("fbjni");
  }
  
  public boolean isValid() {
    return (this.mDestructor.mNativePointer != 0L);
  }
  
  public void resetNative() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield mDestructor : Lcom/facebook/jni/HybridData$Destructor;
    //   6: invokevirtual destruct : ()V
    //   9: aload_0
    //   10: monitorexit
    //   11: return
    //   12: astore_1
    //   13: aload_0
    //   14: monitorexit
    //   15: aload_1
    //   16: athrow
    // Exception table:
    //   from	to	target	type
    //   2	9	12	finally
  }
  
  public static class Destructor extends DestructorThread.Destructor {
    @DoNotStrip
    private long mNativePointer;
    
    Destructor(Object param1Object) {
      super(param1Object);
    }
    
    static native void deleteNative(long param1Long);
    
    protected final void destruct() {
      deleteNative(this.mNativePointer);
      this.mNativePointer = 0L;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/jni/HybridData.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */