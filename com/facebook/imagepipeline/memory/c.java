package com.facebook.imagepipeline.memory;

public class c {
  public static final int a = b();
  
  private static int b = 384;
  
  private static volatile b c;
  
  public static b a() {
    // Byte code:
    //   0: getstatic com/facebook/imagepipeline/memory/c.c : Lcom/facebook/imagepipeline/memory/b;
    //   3: ifnonnull -> 43
    //   6: ldc com/facebook/imagepipeline/memory/c
    //   8: monitorenter
    //   9: getstatic com/facebook/imagepipeline/memory/c.c : Lcom/facebook/imagepipeline/memory/b;
    //   12: ifnonnull -> 31
    //   15: new com/facebook/imagepipeline/memory/b
    //   18: dup
    //   19: getstatic com/facebook/imagepipeline/memory/c.b : I
    //   22: getstatic com/facebook/imagepipeline/memory/c.a : I
    //   25: invokespecial <init> : (II)V
    //   28: putstatic com/facebook/imagepipeline/memory/c.c : Lcom/facebook/imagepipeline/memory/b;
    //   31: ldc com/facebook/imagepipeline/memory/c
    //   33: monitorexit
    //   34: goto -> 43
    //   37: astore_0
    //   38: ldc com/facebook/imagepipeline/memory/c
    //   40: monitorexit
    //   41: aload_0
    //   42: athrow
    //   43: getstatic com/facebook/imagepipeline/memory/c.c : Lcom/facebook/imagepipeline/memory/b;
    //   46: areturn
    // Exception table:
    //   from	to	target	type
    //   9	31	37	finally
    //   31	34	37	finally
    //   38	41	37	finally
  }
  
  private static int b() {
    int i = (int)Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
    return (i > 16777216L) ? (i / 4 * 3) : (i / 2);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/imagepipeline/memory/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */