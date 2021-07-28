package e.e.f.k;

import java.util.ArrayList;

public class c implements b {
  private static final ArrayList<String> d = new a();
  
  private boolean a = true;
  
  private boolean b = false;
  
  private volatile UnsatisfiedLinkError c = null;
  
  private boolean b() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield a : Z
    //   6: ifne -> 18
    //   9: aload_0
    //   10: getfield b : Z
    //   13: istore_1
    //   14: aload_0
    //   15: monitorexit
    //   16: iload_1
    //   17: ireturn
    //   18: getstatic e/e/f/k/c.d : Ljava/util/ArrayList;
    //   21: invokevirtual iterator : ()Ljava/util/Iterator;
    //   24: astore_2
    //   25: aload_2
    //   26: invokeinterface hasNext : ()Z
    //   31: ifeq -> 49
    //   34: aload_2
    //   35: invokeinterface next : ()Ljava/lang/Object;
    //   40: checkcast java/lang/String
    //   43: invokestatic loadLibrary : (Ljava/lang/String;)V
    //   46: goto -> 25
    //   49: aload_0
    //   50: iconst_1
    //   51: putfield b : Z
    //   54: goto -> 68
    //   57: astore_2
    //   58: aload_0
    //   59: aload_2
    //   60: putfield c : Ljava/lang/UnsatisfiedLinkError;
    //   63: aload_0
    //   64: iconst_0
    //   65: putfield b : Z
    //   68: aload_0
    //   69: iconst_0
    //   70: putfield a : Z
    //   73: aload_0
    //   74: getfield b : Z
    //   77: istore_1
    //   78: aload_0
    //   79: monitorexit
    //   80: iload_1
    //   81: ireturn
    //   82: astore_2
    //   83: aload_0
    //   84: monitorexit
    //   85: goto -> 90
    //   88: aload_2
    //   89: athrow
    //   90: goto -> 88
    // Exception table:
    //   from	to	target	type
    //   2	14	82	finally
    //   18	25	57	java/lang/UnsatisfiedLinkError
    //   18	25	82	finally
    //   25	46	57	java/lang/UnsatisfiedLinkError
    //   25	46	82	finally
    //   49	54	57	java/lang/UnsatisfiedLinkError
    //   49	54	82	finally
    //   58	68	82	finally
    //   68	78	82	finally
  }
  
  public void a() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokespecial b : ()Z
    //   6: istore_1
    //   7: iload_1
    //   8: ifeq -> 14
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: new e/e/f/h/a
    //   17: dup
    //   18: aload_0
    //   19: getfield c : Ljava/lang/UnsatisfiedLinkError;
    //   22: invokespecial <init> : (Ljava/lang/Throwable;)V
    //   25: athrow
    //   26: astore_2
    //   27: aload_0
    //   28: monitorexit
    //   29: aload_2
    //   30: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	26	finally
    //   14	26	26	finally
  }
  
  static final class a extends ArrayList<String> {
    a() {
      add((E)"conceal");
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/f/k/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */