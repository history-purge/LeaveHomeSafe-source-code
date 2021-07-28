package com.facebook.imagepipeline.memory;

import e.e.e.d.i;
import e.e.e.g.g;
import e.e.e.h.a;

public class x implements g {
  private final int c;
  
  a<u> d;
  
  public x(a<u> parama, int paramInt) {
    boolean bool;
    i.a(parama);
    if (paramInt >= 0 && paramInt <= ((u)parama.b()).b()) {
      bool = true;
    } else {
      bool = false;
    } 
    i.a(bool);
    this.d = parama.clone();
    this.c = paramInt;
  }
  
  public byte a(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokevirtual a : ()V
    //   6: iconst_1
    //   7: istore #4
    //   9: iload_1
    //   10: iflt -> 68
    //   13: iconst_1
    //   14: istore_3
    //   15: goto -> 18
    //   18: iload_3
    //   19: invokestatic a : (Z)V
    //   22: iload_1
    //   23: aload_0
    //   24: getfield c : I
    //   27: if_icmpge -> 73
    //   30: iload #4
    //   32: istore_3
    //   33: goto -> 36
    //   36: iload_3
    //   37: invokestatic a : (Z)V
    //   40: aload_0
    //   41: getfield d : Le/e/e/h/a;
    //   44: invokevirtual b : ()Ljava/lang/Object;
    //   47: checkcast com/facebook/imagepipeline/memory/u
    //   50: iload_1
    //   51: invokeinterface a : (I)B
    //   56: istore_2
    //   57: aload_0
    //   58: monitorexit
    //   59: iload_2
    //   60: ireturn
    //   61: astore #5
    //   63: aload_0
    //   64: monitorexit
    //   65: aload #5
    //   67: athrow
    //   68: iconst_0
    //   69: istore_3
    //   70: goto -> 18
    //   73: iconst_0
    //   74: istore_3
    //   75: goto -> 36
    // Exception table:
    //   from	to	target	type
    //   2	6	61	finally
    //   18	30	61	finally
    //   36	57	61	finally
  }
  
  public int a(int paramInt1, byte[] paramArrayOfbyte, int paramInt2, int paramInt3) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokevirtual a : ()V
    //   6: iload_1
    //   7: iload #4
    //   9: iadd
    //   10: aload_0
    //   11: getfield c : I
    //   14: if_icmpgt -> 58
    //   17: iconst_1
    //   18: istore #5
    //   20: goto -> 23
    //   23: iload #5
    //   25: invokestatic a : (Z)V
    //   28: aload_0
    //   29: getfield d : Le/e/e/h/a;
    //   32: invokevirtual b : ()Ljava/lang/Object;
    //   35: checkcast com/facebook/imagepipeline/memory/u
    //   38: iload_1
    //   39: aload_2
    //   40: iload_3
    //   41: iload #4
    //   43: invokeinterface a : (I[BII)I
    //   48: istore_1
    //   49: aload_0
    //   50: monitorexit
    //   51: iload_1
    //   52: ireturn
    //   53: astore_2
    //   54: aload_0
    //   55: monitorexit
    //   56: aload_2
    //   57: athrow
    //   58: iconst_0
    //   59: istore #5
    //   61: goto -> 23
    // Exception table:
    //   from	to	target	type
    //   2	17	53	finally
    //   23	49	53	finally
  }
  
  void a() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokevirtual isClosed : ()Z
    //   6: istore_1
    //   7: iload_1
    //   8: ifne -> 14
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: new e/e/e/g/g$a
    //   17: dup
    //   18: invokespecial <init> : ()V
    //   21: athrow
    //   22: astore_2
    //   23: aload_0
    //   24: monitorexit
    //   25: aload_2
    //   26: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	22	finally
    //   14	22	22	finally
  }
  
  public void close() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield d : Le/e/e/h/a;
    //   6: invokestatic b : (Le/e/e/h/a;)V
    //   9: aload_0
    //   10: aconst_null
    //   11: putfield d : Le/e/e/h/a;
    //   14: aload_0
    //   15: monitorexit
    //   16: return
    //   17: astore_1
    //   18: aload_0
    //   19: monitorexit
    //   20: aload_1
    //   21: athrow
    // Exception table:
    //   from	to	target	type
    //   2	14	17	finally
  }
  
  public boolean isClosed() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield d : Le/e/e/h/a;
    //   6: invokestatic c : (Le/e/e/h/a;)Z
    //   9: istore_1
    //   10: aload_0
    //   11: monitorexit
    //   12: iload_1
    //   13: iconst_1
    //   14: ixor
    //   15: ireturn
    //   16: astore_2
    //   17: aload_0
    //   18: monitorexit
    //   19: aload_2
    //   20: athrow
    // Exception table:
    //   from	to	target	type
    //   2	10	16	finally
  }
  
  public int size() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokevirtual a : ()V
    //   6: aload_0
    //   7: getfield c : I
    //   10: istore_1
    //   11: aload_0
    //   12: monitorexit
    //   13: iload_1
    //   14: ireturn
    //   15: astore_2
    //   16: aload_0
    //   17: monitorexit
    //   18: aload_2
    //   19: athrow
    // Exception table:
    //   from	to	target	type
    //   2	11	15	finally
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/imagepipeline/memory/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */