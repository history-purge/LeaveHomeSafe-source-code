package e.d.a.p;

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
    //   14: ifge -> 151
    //   17: new e/d/c/x/h/a
    //   20: dup
    //   21: aload_0
    //   22: invokespecial <init> : (Le/d/b/o;)V
    //   25: astore #6
    //   27: aload_3
    //   28: aload #6
    //   30: invokevirtual c : (Le/d/c/x/h/a;)Z
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
    //   54: invokevirtual a : (Le/d/c/x/h/a;)Le/d/a/p/a;
    //   57: invokestatic a : (Le/d/b/p;JLe/d/a/p/a;)V
    //   60: goto -> 0
    //   63: aload_3
    //   64: aload #6
    //   66: invokevirtual b : (Le/d/c/x/h/a;)Z
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
    //   88: invokevirtual a : (Le/d/c/x/h/a;[B)Le/d/a/p/a;
    //   91: astore #6
    //   93: aload #6
    //   95: astore_3
    //   96: goto -> 0
    //   99: aload #6
    //   101: getfield a : J
    //   104: lconst_1
    //   105: lcmp
    //   106: ifle -> 125
    //   109: aload_0
    //   110: aload #6
    //   112: getfield a : J
    //   115: ldc2_w 8
    //   118: lsub
    //   119: invokevirtual a : (J)V
    //   122: goto -> 0
    //   125: aload #6
    //   127: getfield a : J
    //   130: lstore #4
    //   132: lload #4
    //   134: ldc2_w -1
    //   137: lcmp
    //   138: ifne -> 0
    //   141: return
    //   142: astore_0
    //   143: aload_3
    //   144: aload_0
    //   145: invokevirtual getMessage : ()Ljava/lang/String;
    //   148: invokevirtual a : (Ljava/lang/String;)V
    //   151: return
    // Exception table:
    //   from	to	target	type
    //   8	17	142	java/io/IOException
    //   17	60	142	java/io/IOException
    //   63	93	142	java/io/IOException
    //   99	122	142	java/io/IOException
    //   125	132	142	java/io/IOException
  }
  
  public static void a(InputStream paramInputStream, a parama) {
    p p = new p(paramInputStream);
    p.a(true);
    a(p, -1L, parama);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/a/p/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */