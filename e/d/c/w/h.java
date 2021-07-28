package e.d.c.w;

import e.d.a.k.d;
import e.d.a.k.f;
import e.d.b.n;
import e.d.b.o;
import e.d.c.e;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;

public class h implements d {
  private byte[] a(o paramo, int paramInt) {
    byte[] arrayOfByte = new byte[paramInt];
    int i;
    for (i = 0; i < paramInt; i++) {
      byte b = paramo.b();
      if ((b & 0xFF) == 255) {
        byte b1 = paramo.b();
        if (b1 != 0) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Marker ");
          stringBuilder.append(f.a(b1));
          stringBuilder.append(" found inside DHT segment");
          throw new IOException(stringBuilder.toString());
        } 
      } 
      arrayOfByte[i] = b;
    } 
    return arrayOfByte;
  }
  
  public Iterable<f> a() {
    return Collections.singletonList(f.y);
  }
  
  public void a(o paramo, e parame) {
    // Byte code:
    //   0: aload_2
    //   1: ldc e/d/c/w/b
    //   3: invokevirtual b : (Ljava/lang/Class;)Le/d/c/b;
    //   6: checkcast e/d/c/w/b
    //   9: astore #8
    //   11: aload #8
    //   13: astore #7
    //   15: aload #8
    //   17: ifnonnull -> 35
    //   20: new e/d/c/w/b
    //   23: dup
    //   24: invokespecial <init> : ()V
    //   27: astore #7
    //   29: aload_2
    //   30: aload #7
    //   32: invokevirtual a : (Le/d/c/b;)V
    //   35: aload_1
    //   36: invokevirtual a : ()I
    //   39: ifle -> 132
    //   42: aload_1
    //   43: invokevirtual b : ()B
    //   46: istore #5
    //   48: iload #5
    //   50: sipush #240
    //   53: iand
    //   54: iconst_4
    //   55: ishr
    //   56: invokestatic f : (I)Le/d/c/w/b$a$a;
    //   59: astore_2
    //   60: aload_0
    //   61: aload_1
    //   62: bipush #16
    //   64: invokespecial a : (Le/d/b/o;I)[B
    //   67: astore #8
    //   69: aload #8
    //   71: arraylength
    //   72: istore #6
    //   74: iconst_0
    //   75: istore_3
    //   76: iconst_0
    //   77: istore #4
    //   79: goto -> 149
    //   82: aload_0
    //   83: aload_1
    //   84: iload #4
    //   86: invokespecial a : (Le/d/b/o;I)[B
    //   89: astore #9
    //   91: aload #7
    //   93: invokevirtual f : ()Ljava/util/List;
    //   96: new e/d/c/w/b$a
    //   99: dup
    //   100: aload_2
    //   101: iload #5
    //   103: bipush #15
    //   105: iand
    //   106: aload #8
    //   108: aload #9
    //   110: invokespecial <init> : (Le/d/c/w/b$a$a;I[B[B)V
    //   113: invokeinterface add : (Ljava/lang/Object;)Z
    //   118: pop
    //   119: goto -> 35
    //   122: astore_1
    //   123: aload #7
    //   125: aload_1
    //   126: invokevirtual getMessage : ()Ljava/lang/String;
    //   129: invokevirtual a : (Ljava/lang/String;)V
    //   132: aload #7
    //   134: iconst_1
    //   135: aload #7
    //   137: invokevirtual f : ()Ljava/util/List;
    //   140: invokeinterface size : ()I
    //   145: invokevirtual a : (II)V
    //   148: return
    //   149: iload_3
    //   150: iload #6
    //   152: if_icmpge -> 82
    //   155: iload #4
    //   157: aload #8
    //   159: iload_3
    //   160: baload
    //   161: sipush #255
    //   164: iand
    //   165: iadd
    //   166: istore #4
    //   168: iload_3
    //   169: iconst_1
    //   170: iadd
    //   171: istore_3
    //   172: goto -> 149
    // Exception table:
    //   from	to	target	type
    //   35	74	122	java/io/IOException
    //   82	119	122	java/io/IOException
  }
  
  public void a(Iterable<byte[]> paramIterable, e parame, f paramf) {
    Iterator<byte> iterator = paramIterable.iterator();
    while (iterator.hasNext())
      a((o)new n((byte[])iterator.next()), parame); 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/w/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */