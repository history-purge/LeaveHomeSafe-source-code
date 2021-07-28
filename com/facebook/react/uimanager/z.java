package com.facebook.react.uimanager;

public class z {
  private static int a = 1;
  
  public static int a() {
    // Byte code:
    //   0: ldc com/facebook/react/uimanager/z
    //   2: monitorenter
    //   3: getstatic com/facebook/react/uimanager/z.a : I
    //   6: istore_0
    //   7: getstatic com/facebook/react/uimanager/z.a : I
    //   10: bipush #10
    //   12: iadd
    //   13: putstatic com/facebook/react/uimanager/z.a : I
    //   16: ldc com/facebook/react/uimanager/z
    //   18: monitorexit
    //   19: iload_0
    //   20: ireturn
    //   21: astore_1
    //   22: ldc com/facebook/react/uimanager/z
    //   24: monitorexit
    //   25: aload_1
    //   26: athrow
    // Exception table:
    //   from	to	target	type
    //   3	16	21	finally
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/uimanager/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */