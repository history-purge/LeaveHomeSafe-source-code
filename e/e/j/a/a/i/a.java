package e.e.j.a.a.i;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class a implements b {
  private final List<b> a;
  
  public a(b... paramVarArgs) {
    this.a = new ArrayList<b>(paramVarArgs.length);
    Collections.addAll(this.a, paramVarArgs);
  }
  
  public void a(b paramb) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield a : Ljava/util/List;
    //   6: aload_1
    //   7: invokeinterface add : (Ljava/lang/Object;)Z
    //   12: pop
    //   13: aload_0
    //   14: monitorexit
    //   15: return
    //   16: astore_1
    //   17: aload_0
    //   18: monitorexit
    //   19: aload_1
    //   20: athrow
    // Exception table:
    //   from	to	target	type
    //   2	13	16	finally
  }
  
  public void a(String paramString1, int paramInt, boolean paramBoolean, String paramString2) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield a : Ljava/util/List;
    //   6: invokeinterface size : ()I
    //   11: istore #6
    //   13: iconst_0
    //   14: istore #5
    //   16: iload #5
    //   18: iload #6
    //   20: if_icmpge -> 79
    //   23: aload_0
    //   24: getfield a : Ljava/util/List;
    //   27: iload #5
    //   29: invokeinterface get : (I)Ljava/lang/Object;
    //   34: checkcast e/e/j/a/a/i/b
    //   37: astore #7
    //   39: aload #7
    //   41: ifnull -> 70
    //   44: aload #7
    //   46: aload_1
    //   47: iload_2
    //   48: iload_3
    //   49: aload #4
    //   51: invokeinterface a : (Ljava/lang/String;IZLjava/lang/String;)V
    //   56: goto -> 70
    //   59: astore #7
    //   61: ldc 'ForwardingImageOriginListener'
    //   63: ldc 'InternalListener exception in onImageLoaded'
    //   65: aload #7
    //   67: invokestatic b : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   70: iload #5
    //   72: iconst_1
    //   73: iadd
    //   74: istore #5
    //   76: goto -> 16
    //   79: aload_0
    //   80: monitorexit
    //   81: return
    //   82: astore_1
    //   83: aload_0
    //   84: monitorexit
    //   85: goto -> 90
    //   88: aload_1
    //   89: athrow
    //   90: goto -> 88
    // Exception table:
    //   from	to	target	type
    //   2	13	82	finally
    //   23	39	82	finally
    //   44	56	59	java/lang/Exception
    //   44	56	82	finally
    //   61	70	82	finally
  }
  
  public void b(b paramb) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield a : Ljava/util/List;
    //   6: aload_1
    //   7: invokeinterface remove : (Ljava/lang/Object;)Z
    //   12: pop
    //   13: aload_0
    //   14: monitorexit
    //   15: return
    //   16: astore_1
    //   17: aload_0
    //   18: monitorexit
    //   19: aload_1
    //   20: athrow
    // Exception table:
    //   from	to	target	type
    //   2	13	16	finally
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/j/a/a/i/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */