package e.d.c.t;

import e.d.a.k.d;
import e.d.a.k.f;
import e.d.b.n;
import e.d.b.o;
import e.d.c.b;
import e.d.c.e;
import java.io.IOException;
import java.util.Collections;

public class c implements d {
  private void a(o paramo, b paramb, int paramInt1, int paramInt2, int paramInt3) {
    // Byte code:
    //   0: iload_3
    //   1: bipush #8
    //   3: ishl
    //   4: iload #4
    //   6: ior
    //   7: istore_3
    //   8: iload #5
    //   10: ifne -> 21
    //   13: aload_2
    //   14: iload_3
    //   15: ldc ''
    //   17: invokevirtual a : (ILjava/lang/String;)V
    //   20: return
    //   21: iload_3
    //   22: sipush #256
    //   25: if_icmpeq -> 132
    //   28: iload_3
    //   29: sipush #278
    //   32: if_icmpeq -> 132
    //   35: iload_3
    //   36: sipush #346
    //   39: if_icmpeq -> 92
    //   42: iload_3
    //   43: sipush #378
    //   46: if_icmpeq -> 132
    //   49: iload_3
    //   50: sipush #512
    //   53: if_icmpeq -> 132
    //   56: iload_3
    //   57: sipush #522
    //   60: if_icmpeq -> 73
    //   63: iload_3
    //   64: sipush #582
    //   67: if_icmpeq -> 132
    //   70: goto -> 161
    //   73: aload_2
    //   74: iload_3
    //   75: aload_1
    //   76: invokevirtual j : ()S
    //   79: invokevirtual a : (II)V
    //   82: aload_1
    //   83: iload #5
    //   85: iconst_1
    //   86: isub
    //   87: i2l
    //   88: invokevirtual a : (J)V
    //   91: return
    //   92: aload_1
    //   93: iload #5
    //   95: invokevirtual a : (I)[B
    //   98: astore #7
    //   100: aload #7
    //   102: invokestatic a : ([B)Ljava/lang/String;
    //   105: astore #6
    //   107: aload #6
    //   109: astore_1
    //   110: aload #6
    //   112: ifnonnull -> 125
    //   115: new java/lang/String
    //   118: dup
    //   119: aload #7
    //   121: invokespecial <init> : ([B)V
    //   124: astore_1
    //   125: aload_2
    //   126: iload_3
    //   127: aload_1
    //   128: invokevirtual a : (ILjava/lang/String;)V
    //   131: return
    //   132: iload #5
    //   134: iconst_2
    //   135: if_icmplt -> 161
    //   138: aload_1
    //   139: invokevirtual h : ()I
    //   142: istore #4
    //   144: aload_1
    //   145: iload #5
    //   147: iconst_2
    //   148: isub
    //   149: i2l
    //   150: invokevirtual a : (J)V
    //   153: aload_2
    //   154: iload_3
    //   155: iload #4
    //   157: invokevirtual a : (II)V
    //   160: return
    //   161: aload_2
    //   162: sipush #346
    //   165: invokevirtual p : (I)Ljava/lang/String;
    //   168: astore #7
    //   170: aload #7
    //   172: ifnull -> 185
    //   175: aload #7
    //   177: invokestatic forName : (Ljava/lang/String;)Ljava/nio/charset/Charset;
    //   180: astore #6
    //   182: goto -> 188
    //   185: aconst_null
    //   186: astore #6
    //   188: aload #7
    //   190: ifnull -> 205
    //   193: aload_1
    //   194: iload #5
    //   196: aload #6
    //   198: invokevirtual d : (ILjava/nio/charset/Charset;)Le/d/c/h;
    //   201: astore_1
    //   202: goto -> 247
    //   205: aload_1
    //   206: iload #5
    //   208: invokevirtual a : (I)[B
    //   211: astore_1
    //   212: aload_1
    //   213: invokestatic b : ([B)Ljava/nio/charset/Charset;
    //   216: astore #6
    //   218: aload #6
    //   220: ifnull -> 237
    //   223: new e/d/c/h
    //   226: dup
    //   227: aload_1
    //   228: aload #6
    //   230: invokespecial <init> : ([BLjava/nio/charset/Charset;)V
    //   233: astore_1
    //   234: goto -> 247
    //   237: new e/d/c/h
    //   240: dup
    //   241: aload_1
    //   242: aconst_null
    //   243: invokespecial <init> : ([BLjava/nio/charset/Charset;)V
    //   246: astore_1
    //   247: aload_2
    //   248: iload_3
    //   249: invokevirtual a : (I)Z
    //   252: ifeq -> 315
    //   255: aload_2
    //   256: iload_3
    //   257: invokevirtual s : (I)[Le/d/c/h;
    //   260: astore #7
    //   262: aload #7
    //   264: ifnonnull -> 276
    //   267: iconst_1
    //   268: anewarray e/d/c/h
    //   271: astore #6
    //   273: goto -> 298
    //   276: aload #7
    //   278: arraylength
    //   279: iconst_1
    //   280: iadd
    //   281: anewarray e/d/c/h
    //   284: astore #6
    //   286: aload #7
    //   288: iconst_0
    //   289: aload #6
    //   291: iconst_0
    //   292: aload #7
    //   294: arraylength
    //   295: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   298: aload #6
    //   300: aload #6
    //   302: arraylength
    //   303: iconst_1
    //   304: isub
    //   305: aload_1
    //   306: aastore
    //   307: aload_2
    //   308: iload_3
    //   309: aload #6
    //   311: invokevirtual a : (I[Le/d/c/h;)V
    //   314: return
    //   315: aload_2
    //   316: iload_3
    //   317: aload_1
    //   318: invokevirtual a : (ILe/d/c/h;)V
    //   321: return
    //   322: astore #6
    //   324: goto -> 185
    // Exception table:
    //   from	to	target	type
    //   175	182	322	finally
  }
  
  public Iterable<f> a() {
    return Collections.singletonList(f.p);
  }
  
  public void a(o paramo, e parame, long paramLong) {
    a(paramo, parame, paramLong, null);
  }
  
  public void a(o paramo, e parame, long paramLong, b paramb) {
    b b1 = new b();
    parame.a(b1);
    if (paramb != null)
      b1.a(paramb); 
    int i = 0;
    while (true) {
      if (i < paramLong) {
        try {
          String str;
          short s = paramo.j();
          int j = i + 1;
          if (s != 28) {
            if (j != paramLong) {
              StringBuilder stringBuilder = new StringBuilder();
              stringBuilder.append("Invalid IPTC tag marker at offset ");
              stringBuilder.append(j - 1);
              stringBuilder.append(". Expected '0x");
              stringBuilder.append(Integer.toHexString(28));
              stringBuilder.append("' but got '0x");
              stringBuilder.append(Integer.toHexString(s));
              stringBuilder.append("'.");
              b1.a(stringBuilder.toString());
            } 
            return;
          } 
          if ((j + 4) > paramLong) {
            str = "Too few bytes remain for a valid IPTC tag";
          } else {
            try {
              short s1 = str.j();
              short s2 = str.j();
              int m = str.h();
              int k = j;
              i = m;
              if (m > 32767) {
                i = str.h();
                i = (m & 0x7FFF) << 16 | i;
                k = j + 2;
              } 
              k = k + 4 + i;
              if (k > paramLong) {
                str = "Data for tag extends beyond end of IPTC segment";
              } else {
                try {
                  a((o)str, b1, s1, s2, i);
                  i = k;
                  continue;
                } catch (IOException null) {}
              } 
            } catch (IOException null) {}
          } 
        } catch (IOException iOException) {}
      } else {
        return;
      } 
      b1.a((String)iOException);
      return;
    } 
  }
  
  public void a(Iterable<byte[]> paramIterable, e parame, f paramf) {
    for (byte[] arrayOfByte : paramIterable) {
      if (arrayOfByte.length != 0 && arrayOfByte[0] == 28)
        a((o)new n(arrayOfByte), parame, arrayOfByte.length); 
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/t/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */