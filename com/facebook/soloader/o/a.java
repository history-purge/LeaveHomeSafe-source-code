package com.facebook.soloader.o;

public class a {
  private static b a;
  
  public static void a(b paramb) {
    // Byte code:
    //   0: ldc com/facebook/soloader/o/a
    //   2: monitorenter
    //   3: getstatic com/facebook/soloader/o/a.a : Lcom/facebook/soloader/o/b;
    //   6: ifnonnull -> 17
    //   9: aload_0
    //   10: putstatic com/facebook/soloader/o/a.a : Lcom/facebook/soloader/o/b;
    //   13: ldc com/facebook/soloader/o/a
    //   15: monitorexit
    //   16: return
    //   17: new java/lang/IllegalStateException
    //   20: dup
    //   21: ldc 'Cannot re-initialize NativeLoader.'
    //   23: invokespecial <init> : (Ljava/lang/String;)V
    //   26: athrow
    //   27: astore_0
    //   28: ldc com/facebook/soloader/o/a
    //   30: monitorexit
    //   31: aload_0
    //   32: athrow
    // Exception table:
    //   from	to	target	type
    //   3	13	27	finally
    //   17	27	27	finally
  }
  
  public static boolean a() {
    // Byte code:
    //   0: ldc com/facebook/soloader/o/a
    //   2: monitorenter
    //   3: getstatic com/facebook/soloader/o/a.a : Lcom/facebook/soloader/o/b;
    //   6: astore_1
    //   7: aload_1
    //   8: ifnull -> 16
    //   11: iconst_1
    //   12: istore_0
    //   13: goto -> 18
    //   16: iconst_0
    //   17: istore_0
    //   18: ldc com/facebook/soloader/o/a
    //   20: monitorexit
    //   21: iload_0
    //   22: ireturn
    //   23: astore_1
    //   24: ldc com/facebook/soloader/o/a
    //   26: monitorexit
    //   27: aload_1
    //   28: athrow
    // Exception table:
    //   from	to	target	type
    //   3	7	23	finally
  }
  
  public static boolean a(String paramString) {
    // Byte code:
    //   0: ldc com/facebook/soloader/o/a
    //   2: monitorenter
    //   3: getstatic com/facebook/soloader/o/a.a : Lcom/facebook/soloader/o/b;
    //   6: ifnull -> 22
    //   9: ldc com/facebook/soloader/o/a
    //   11: monitorexit
    //   12: getstatic com/facebook/soloader/o/a.a : Lcom/facebook/soloader/o/b;
    //   15: aload_0
    //   16: invokeinterface a : (Ljava/lang/String;)Z
    //   21: ireturn
    //   22: new java/lang/IllegalStateException
    //   25: dup
    //   26: ldc 'NativeLoader has not been initialized.  To use standard native library loading, call NativeLoader.init(new SystemDelegate()).'
    //   28: invokespecial <init> : (Ljava/lang/String;)V
    //   31: athrow
    //   32: astore_0
    //   33: ldc com/facebook/soloader/o/a
    //   35: monitorexit
    //   36: aload_0
    //   37: athrow
    // Exception table:
    //   from	to	target	type
    //   3	12	32	finally
    //   22	32	32	finally
    //   33	36	32	finally
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/soloader/o/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */