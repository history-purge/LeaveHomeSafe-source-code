package e.d.a.l;

import e.d.b.p;
import java.io.InputStream;

public class c {
  private static void a(p paramp, long paramLong, a parama) {
    // Byte code:
    //   0: lload_1
    //   1: ldc2_w -1
    //   4: lcmp
    //   5: ifeq -> 17
    //   8: aload_0
    //   9: invokevirtual g : ()J
    //   12: lload_1
    //   13: lcmp
    //   14: ifge -> 175
    //   17: new e/d/c/y/g/b
    //   20: dup
    //   21: aload_0
    //   22: invokespecial <init> : (Le/d/b/o;)V
    //   25: astore #6
    //   27: aload_3
    //   28: aload #6
    //   30: invokevirtual c : (Le/d/c/y/g/b;)Z
    //   33: ifeq -> 63
    //   36: aload_0
    //   37: aload #6
    //   39: getfield a : J
    //   42: aload_0
    //   43: invokevirtual g : ()J
    //   46: ladd
    //   47: ldc2_w 8
    //   50: lsub
    //   51: aload_3
    //   52: aload #6
    //   54: invokevirtual a : (Le/d/c/y/g/b;)Le/d/a/l/a;
    //   57: invokestatic a : (Le/d/b/p;JLe/d/a/l/a;)V
    //   60: goto -> 0
    //   63: aload_3
    //   64: aload #6
    //   66: invokevirtual b : (Le/d/c/y/g/b;)Z
    //   69: ifeq -> 99
    //   72: aload_3
    //   73: aload #6
    //   75: aload_0
    //   76: aload #6
    //   78: getfield a : J
    //   81: l2i
    //   82: bipush #8
    //   84: isub
    //   85: invokevirtual a : (I)[B
    //   88: invokevirtual a : (Le/d/c/y/g/b;[B)Le/d/a/l/a;
    //   91: astore #6
    //   93: aload #6
    //   95: astore_3
    //   96: goto -> 0
    //   99: aload #6
    //   101: getfield c : Ljava/lang/String;
    //   104: ifnull -> 123
    //   107: aload_0
    //   108: aload #6
    //   110: getfield a : J
    //   113: ldc2_w 24
    //   116: lsub
    //   117: invokevirtual a : (J)V
    //   120: goto -> 0
    //   123: aload #6
    //   125: getfield a : J
    //   128: lconst_1
    //   129: lcmp
    //   130: ifle -> 149
    //   133: aload_0
    //   134: aload #6
    //   136: getfield a : J
    //   139: ldc2_w 8
    //   142: lsub
    //   143: invokevirtual a : (J)V
    //   146: goto -> 0
    //   149: aload #6
    //   151: getfield a : J
    //   154: lstore #4
    //   156: lload #4
    //   158: ldc2_w -1
    //   161: lcmp
    //   162: ifne -> 0
    //   165: return
    //   166: astore_0
    //   167: aload_3
    //   168: aload_0
    //   169: invokevirtual getMessage : ()Ljava/lang/String;
    //   172: invokevirtual a : (Ljava/lang/String;)V
    //   175: return
    // Exception table:
    //   from	to	target	type
    //   8	17	166	java/io/IOException
    //   17	60	166	java/io/IOException
    //   63	93	166	java/io/IOException
    //   99	120	166	java/io/IOException
    //   123	146	166	java/io/IOException
    //   149	156	166	java/io/IOException
  }
  
  public static void a(InputStream paramInputStream, a parama) {
    p p = new p(paramInputStream);
    p.a(true);
    a(p, -1L, parama);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/a/l/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */