package com.facebook.imagepipeline.nativecode;

public class d {
  private static boolean a;
  
  public static void a() {
    // Byte code:
    //   0: ldc com/facebook/imagepipeline/nativecode/d
    //   2: monitorenter
    //   3: getstatic com/facebook/imagepipeline/nativecode/d.a : Z
    //   6: ifne -> 35
    //   9: getstatic android/os/Build$VERSION.SDK_INT : I
    //   12: istore_0
    //   13: iload_0
    //   14: bipush #16
    //   16: if_icmpgt -> 25
    //   19: ldc 'fb_jpegturbo'
    //   21: invokestatic a : (Ljava/lang/String;)Z
    //   24: pop
    //   25: ldc 'native-imagetranscoder'
    //   27: invokestatic a : (Ljava/lang/String;)Z
    //   30: pop
    //   31: iconst_1
    //   32: putstatic com/facebook/imagepipeline/nativecode/d.a : Z
    //   35: ldc com/facebook/imagepipeline/nativecode/d
    //   37: monitorexit
    //   38: return
    //   39: astore_1
    //   40: ldc com/facebook/imagepipeline/nativecode/d
    //   42: monitorexit
    //   43: aload_1
    //   44: athrow
    //   45: astore_1
    //   46: goto -> 25
    // Exception table:
    //   from	to	target	type
    //   3	13	39	finally
    //   19	25	45	java/lang/UnsatisfiedLinkError
    //   19	25	39	finally
    //   25	35	39	finally
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/imagepipeline/nativecode/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */