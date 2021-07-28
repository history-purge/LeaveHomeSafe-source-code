package e.d.c.q;

import e.d.b.b;
import e.d.b.f;
import e.d.b.o;
import e.d.c.b;
import e.d.c.c;
import e.d.c.e;
import e.d.c.f0.c;
import e.d.c.h;
import e.d.c.r.c;
import java.io.ByteArrayOutputStream;

public class k {
  private static void a(o paramo, int paramInt, e parame) {
    byte[] arrayOfByte;
    if (paramInt != 11) {
      parame.a((b)new c(String.format("Invalid GIF application extension block size. Expected 11, got %d.", new Object[] { Integer.valueOf(paramInt) })));
      return;
    } 
    String str = paramo.c(paramInt, f.a);
    if (str.equals("XMP DataXMP")) {
      arrayOfByte = a(paramo);
      (new c()).a(arrayOfByte, 0, arrayOfByte.length - 257, parame, null);
      return;
    } 
    if (str.equals("ICCRGBG1012")) {
      arrayOfByte = a((o)arrayOfByte, arrayOfByte.b() & 0xFF);
      if (arrayOfByte.length != 0) {
        (new c()).a((e.d.b.k)new b(arrayOfByte), parame);
        return;
      } 
    } else {
      b b;
      if (str.equals("NETSCAPE2.0")) {
        arrayOfByte.a(2L);
        paramInt = arrayOfByte.h();
        arrayOfByte.a(1L);
        b = new b();
        b.a(1, paramInt);
        parame.a(b);
        return;
      } 
      d((o)b);
    } 
  }
  
  private static byte[] a(o paramo) {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    byte[] arrayOfByte = new byte[257];
    while (true) {
      byte b = paramo.b();
      if (b == 0)
        return byteArrayOutputStream.toByteArray(); 
      int i = b & 0xFF;
      arrayOfByte[0] = b;
      paramo.a(arrayOfByte, 1, i);
      byteArrayOutputStream.write(arrayOfByte, 0, i + 1);
    } 
  }
  
  private static byte[] a(o paramo, int paramInt) {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    while (paramInt > 0) {
      byteArrayOutputStream.write(paramo.a(paramInt), 0, paramInt);
      paramInt = paramo.b() & 0xFF;
    } 
    return byteArrayOutputStream.toByteArray();
  }
  
  private static d b(o paramo, int paramInt) {
    return new d(new h(a(paramo, paramInt), f.c));
  }
  
  private static h b(o paramo) {
    String str1;
    boolean bool1;
    h h = new h();
    if (!paramo.c(3).equals("GIF")) {
      str1 = "Invalid GIF file signature";
      h.a(str1);
      return h;
    } 
    String str2 = str1.c(3);
    if (!str2.equals("87a") && !str2.equals("89a")) {
      str1 = "Unexpected GIF version";
      h.a(str1);
      return h;
    } 
    boolean bool2 = true;
    h.a(1, str2);
    h.a(2, str1.h());
    h.a(3, str1.h());
    short s = str1.j();
    if (s >> 7 != 0) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    h.a(4, 1 << (s & 0x7) + 1);
    if (str2.equals("89a")) {
      if ((s & 0x8) == 0)
        bool2 = false; 
      h.a(5, bool2);
    } 
    h.a(6, ((s & 0x70) >> 4) + 1);
    h.a(7, bool1);
    h.a(8, str1.j());
    s = str1.j();
    if (s != 0) {
      double d = s;
      Double.isNaN(d);
      h.a(9, (float)((d + 15.0D) / 64.0D));
    } 
    return h;
  }
  
  private static void b(o paramo, e parame) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual f : ()B
    //   4: istore_2
    //   5: aload_0
    //   6: invokevirtual j : ()S
    //   9: istore_3
    //   10: aload_0
    //   11: invokevirtual g : ()J
    //   14: lstore #4
    //   16: iload_2
    //   17: bipush #-7
    //   19: if_icmpeq -> 102
    //   22: iload_2
    //   23: iconst_1
    //   24: if_icmpeq -> 87
    //   27: iload_2
    //   28: bipush #-2
    //   30: if_icmpeq -> 77
    //   33: iload_2
    //   34: iconst_m1
    //   35: if_icmpeq -> 68
    //   38: aload_1
    //   39: new e/d/c/c
    //   42: dup
    //   43: ldc 'Unsupported GIF extension block with type 0x%02X.'
    //   45: iconst_1
    //   46: anewarray java/lang/Object
    //   49: dup
    //   50: iconst_0
    //   51: iload_2
    //   52: invokestatic valueOf : (B)Ljava/lang/Byte;
    //   55: aastore
    //   56: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   59: invokespecial <init> : (Ljava/lang/String;)V
    //   62: invokevirtual a : (Le/d/c/b;)V
    //   65: goto -> 115
    //   68: aload_0
    //   69: iload_3
    //   70: aload_1
    //   71: invokestatic a : (Le/d/b/o;ILe/d/c/e;)V
    //   74: goto -> 115
    //   77: aload_0
    //   78: iload_3
    //   79: invokestatic b : (Le/d/b/o;I)Le/d/c/q/d;
    //   82: astore #6
    //   84: goto -> 109
    //   87: aload_0
    //   88: iload_3
    //   89: invokestatic d : (Le/d/b/o;I)Le/d/c/b;
    //   92: astore #6
    //   94: aload #6
    //   96: ifnull -> 115
    //   99: goto -> 109
    //   102: aload_0
    //   103: iload_3
    //   104: invokestatic c : (Le/d/b/o;I)Le/d/c/q/f;
    //   107: astore #6
    //   109: aload_1
    //   110: aload #6
    //   112: invokevirtual a : (Le/d/c/b;)V
    //   115: lload #4
    //   117: iload_3
    //   118: i2l
    //   119: ladd
    //   120: aload_0
    //   121: invokevirtual g : ()J
    //   124: lsub
    //   125: lstore #4
    //   127: lload #4
    //   129: lconst_0
    //   130: lcmp
    //   131: ifle -> 140
    //   134: aload_0
    //   135: lload #4
    //   137: invokevirtual a : (J)V
    //   140: return
  }
  
  private static f c(o paramo, int paramInt) {
    f f = new f();
    paramInt = paramo.j();
    f.a(2, f.b.f(paramInt >> 2 & 0x7));
    boolean bool2 = false;
    if ((paramInt & 0x2) >> 1 == 1) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    f.a(3, bool1);
    boolean bool1 = bool2;
    if ((paramInt & 0x1) == 1)
      bool1 = true; 
    f.a(4, bool1);
    f.a(1, paramo.h());
    f.a(5, paramo.j());
    paramo.a(1L);
    return f;
  }
  
  private static j c(o paramo) {
    boolean bool1;
    boolean bool2;
    j j = new j();
    int i = paramo.h();
    boolean bool3 = true;
    j.a(1, i);
    j.a(2, paramo.h());
    j.a(3, paramo.h());
    j.a(4, paramo.h());
    i = paramo.b();
    if (i >> 7 != 0) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    if ((i & 0x40) != 0) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    j.a(5, bool1);
    j.a(6, bool2);
    if (bool1) {
      if ((i & 0x20) != 0) {
        bool1 = bool3;
      } else {
        bool1 = false;
      } 
      j.a(7, bool1);
      i &= 0x7;
      j.a(8, i + 1);
      paramo.a(((2 << i) * 3));
    } 
    paramo.b();
    return j;
  }
  
  private static b d(o paramo, int paramInt) {
    if (paramInt != 12)
      return (b)new c(String.format("Invalid GIF plain text block size. Expected 12, got %d.", new Object[] { Integer.valueOf(paramInt) })); 
    paramo.a(12L);
    d(paramo);
    return null;
  }
  
  private static void d(o paramo) {
    while (true) {
      short s = paramo.j();
      if (s == 0)
        return; 
      paramo.a(s);
    } 
  }
  
  public void a(o paramo, e parame) {
    // Byte code:
    //   0: aload_1
    //   1: iconst_0
    //   2: invokevirtual a : (Z)V
    //   5: aload_1
    //   6: invokestatic b : (Le/d/b/o;)Le/d/c/q/h;
    //   9: astore #6
    //   11: aload_2
    //   12: aload #6
    //   14: invokevirtual a : (Le/d/c/b;)V
    //   17: aload #6
    //   19: invokevirtual d : ()Z
    //   22: ifeq -> 26
    //   25: return
    //   26: aconst_null
    //   27: astore #5
    //   29: aload #5
    //   31: astore #4
    //   33: aload #6
    //   35: bipush #7
    //   37: invokevirtual b : (I)Z
    //   40: ifeq -> 71
    //   43: aload #6
    //   45: iconst_4
    //   46: invokevirtual k : (I)Ljava/lang/Integer;
    //   49: astore #4
    //   51: goto -> 71
    //   54: aload_2
    //   55: new e/d/c/c
    //   58: dup
    //   59: ldc 'GIF did not had hasGlobalColorTable bit.'
    //   61: invokespecial <init> : (Ljava/lang/String;)V
    //   64: invokevirtual a : (Le/d/c/b;)V
    //   67: aload #5
    //   69: astore #4
    //   71: aload #4
    //   73: ifnull -> 88
    //   76: aload_1
    //   77: aload #4
    //   79: invokevirtual intValue : ()I
    //   82: iconst_3
    //   83: imul
    //   84: i2l
    //   85: invokevirtual a : (J)V
    //   88: aload_1
    //   89: invokevirtual f : ()B
    //   92: istore_3
    //   93: iload_3
    //   94: bipush #33
    //   96: if_icmpeq -> 140
    //   99: iload_3
    //   100: bipush #44
    //   102: if_icmpeq -> 125
    //   105: iload_3
    //   106: bipush #59
    //   108: if_icmpeq -> 192
    //   111: aload_2
    //   112: new e/d/c/c
    //   115: dup
    //   116: ldc 'Unknown gif block marker found.'
    //   118: invokespecial <init> : (Ljava/lang/String;)V
    //   121: invokevirtual a : (Le/d/c/b;)V
    //   124: return
    //   125: aload_2
    //   126: aload_1
    //   127: invokestatic c : (Le/d/b/o;)Le/d/c/q/j;
    //   130: invokevirtual a : (Le/d/c/b;)V
    //   133: aload_1
    //   134: invokestatic d : (Le/d/b/o;)V
    //   137: goto -> 88
    //   140: aload_1
    //   141: aload_2
    //   142: invokestatic b : (Le/d/b/o;Le/d/c/e;)V
    //   145: goto -> 88
    //   148: new e/d/c/c
    //   151: dup
    //   152: ldc 'IOException processing GIF data'
    //   154: invokespecial <init> : (Ljava/lang/String;)V
    //   157: astore_1
    //   158: aload_2
    //   159: aload_1
    //   160: invokevirtual a : (Le/d/c/b;)V
    //   163: return
    //   164: new e/d/c/c
    //   167: dup
    //   168: ldc 'IOException processing GIF data'
    //   170: invokespecial <init> : (Ljava/lang/String;)V
    //   173: astore_1
    //   174: goto -> 158
    //   177: astore_1
    //   178: goto -> 164
    //   181: astore #4
    //   183: goto -> 54
    //   186: astore_1
    //   187: goto -> 148
    //   190: astore_1
    //   191: return
    //   192: return
    // Exception table:
    //   from	to	target	type
    //   5	17	177	java/io/IOException
    //   33	51	181	e/d/c/f
    //   33	51	186	java/io/IOException
    //   54	67	186	java/io/IOException
    //   76	88	186	java/io/IOException
    //   88	93	190	java/io/IOException
    //   111	124	186	java/io/IOException
    //   125	137	186	java/io/IOException
    //   140	145	186	java/io/IOException
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/q/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */