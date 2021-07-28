package com.google.firebase.r;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class e {
  private static volatile e b;
  
  private final Set<g> a = new HashSet<g>();
  
  public static e b() {
    // Byte code:
    //   0: getstatic com/google/firebase/r/e.b : Lcom/google/firebase/r/e;
    //   3: astore_0
    //   4: aload_0
    //   5: ifnonnull -> 44
    //   8: ldc com/google/firebase/r/e
    //   10: monitorenter
    //   11: getstatic com/google/firebase/r/e.b : Lcom/google/firebase/r/e;
    //   14: astore_1
    //   15: aload_1
    //   16: astore_0
    //   17: aload_1
    //   18: ifnonnull -> 33
    //   21: new com/google/firebase/r/e
    //   24: dup
    //   25: invokespecial <init> : ()V
    //   28: astore_0
    //   29: aload_0
    //   30: putstatic com/google/firebase/r/e.b : Lcom/google/firebase/r/e;
    //   33: ldc com/google/firebase/r/e
    //   35: monitorexit
    //   36: aload_0
    //   37: areturn
    //   38: astore_0
    //   39: ldc com/google/firebase/r/e
    //   41: monitorexit
    //   42: aload_0
    //   43: athrow
    //   44: aload_0
    //   45: areturn
    // Exception table:
    //   from	to	target	type
    //   11	15	38	finally
    //   21	33	38	finally
    //   33	36	38	finally
    //   39	42	38	finally
  }
  
  Set<g> a() {
    synchronized (this.a) {
      return Collections.unmodifiableSet(this.a);
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/firebase/r/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */