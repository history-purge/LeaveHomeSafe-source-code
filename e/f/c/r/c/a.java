package e.f.c.r.c;

import e.f.c.s.e;

public final class a {
  private static final String[] b = new String[] { 
      "CTRL_PS", " ", "A", "B", "C", "D", "E", "F", "G", "H", 
      "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", 
      "S", "T", "U", "V", "W", "X", "Y", "Z", "CTRL_LL", "CTRL_ML", 
      "CTRL_DL", "CTRL_BS" };
  
  private static final String[] c = new String[] { 
      "CTRL_PS", " ", "a", "b", "c", "d", "e", "f", "g", "h", 
      "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", 
      "s", "t", "u", "v", "w", "x", "y", "z", "CTRL_US", "CTRL_ML", 
      "CTRL_DL", "CTRL_BS" };
  
  private static final String[] d = new String[] { 
      "CTRL_PS", " ", "\001", "\002", "\003", "\004", "\005", "\006", "\007", "\b", 
      "\t", "\n", "\013", "\f", "\r", "\033", "\034", "\035", "\036", "\037", 
      "@", "\\", "^", "_", "`", "|", "~", "", "CTRL_LL", "CTRL_UL", 
      "CTRL_PL", "CTRL_BS" };
  
  private static final String[] e = new String[] { 
      "", "\r", "\r\n", ". ", ", ", ": ", "!", "\"", "#", "$", 
      "%", "&", "'", "(", ")", "*", "+", ",", "-", ".", 
      "/", ":", ";", "<", "=", ">", "?", "[", "]", "{", 
      "}", "CTRL_UL" };
  
  private static final String[] f = new String[] { 
      "CTRL_PS", " ", "0", "1", "2", "3", "4", "5", "6", "7", 
      "8", "9", ",", ".", "CTRL_UL", "CTRL_US" };
  
  private e.f.c.r.a a;
  
  private static byte a(boolean[] paramArrayOfboolean, int paramInt) {
    int i = paramArrayOfboolean.length - paramInt;
    if (i >= 8) {
      paramInt = a(paramArrayOfboolean, paramInt, 8);
      return (byte)paramInt;
    } 
    paramInt = a(paramArrayOfboolean, paramInt, i) << 8 - i;
    return (byte)paramInt;
  }
  
  private static int a(int paramInt, boolean paramBoolean) {
    byte b;
    if (paramBoolean) {
      b = 88;
    } else {
      b = 112;
    } 
    return (b + (paramInt << 4)) * paramInt;
  }
  
  private static int a(boolean[] paramArrayOfboolean, int paramInt1, int paramInt2) {
    int j = paramInt1;
    int i = 0;
    while (j < paramInt1 + paramInt2) {
      int k = i << 1;
      i = k;
      if (paramArrayOfboolean[j])
        i = k | 0x1; 
      j++;
    } 
    return i;
  }
  
  private static b a(char paramChar) {
    return (paramChar != 'B') ? ((paramChar != 'D') ? ((paramChar != 'P') ? ((paramChar != 'L') ? ((paramChar != 'M') ? b.c : b.e) : b.d) : b.g) : b.f) : b.h;
  }
  
  private static String a(b paramb, int paramInt) {
    int i = a.a[paramb.ordinal()];
    if (i != 1) {
      if (i != 2) {
        if (i != 3) {
          if (i != 4) {
            if (i == 5)
              return f[paramInt]; 
            throw new IllegalStateException("Bad table");
          } 
          return e[paramInt];
        } 
        return d[paramInt];
      } 
      return c[paramInt];
    } 
    return b[paramInt];
  }
  
  static byte[] a(boolean[] paramArrayOfboolean) {
    byte[] arrayOfByte = new byte[(paramArrayOfboolean.length + 7) / 8];
    for (int i = 0; i < arrayOfByte.length; i++)
      arrayOfByte[i] = a(paramArrayOfboolean, i << 3); 
    return arrayOfByte;
  }
  
  private boolean[] a(e.f.c.s.b paramb) {
    boolean bool = this.a.e();
    int k = this.a.d();
    if (bool) {
      i = 11;
    } else {
      i = 14;
    } 
    int m = i + (k << 2);
    int[] arrayOfInt = new int[m];
    boolean[] arrayOfBoolean = new boolean[a(k, bool)];
    if (bool) {
      for (i = 0; i < arrayOfInt.length; i++)
        arrayOfInt[i] = i; 
    } else {
      int n = m / 2;
      int i1 = (m + 1 + (n - 1) / 15 * 2) / 2;
      for (i = 0; i < n; i++) {
        int i2 = i / 15 + i;
        arrayOfInt[n - i - 1] = i1 - i2 - 1;
        arrayOfInt[n + i] = i2 + i1 + 1;
      } 
    } 
    int i = 0;
    int j = 0;
    while (i < k) {
      if (bool) {
        n = 9;
      } else {
        n = 12;
      } 
      int i1 = (k - i << 2) + n;
      int i2 = i << 1;
      int i3 = m - 1 - i2;
      int n;
      for (n = 0; n < i1; n++) {
        int i5 = n << 1;
        int i4;
        for (i4 = 0; i4 < 2; i4++) {
          int i6 = i2 + i4;
          int i7 = arrayOfInt[i6];
          int i8 = i2 + n;
          arrayOfBoolean[j + i5 + i4] = paramb.b(i7, arrayOfInt[i8]);
          i7 = arrayOfInt[i8];
          i8 = i3 - i4;
          arrayOfBoolean[i1 * 2 + j + i5 + i4] = paramb.b(i7, arrayOfInt[i8]);
          i7 = arrayOfInt[i8];
          i8 = i3 - n;
          arrayOfBoolean[i1 * 4 + j + i5 + i4] = paramb.b(i7, arrayOfInt[i8]);
          arrayOfBoolean[i1 * 6 + j + i5 + i4] = paramb.b(arrayOfInt[i8], arrayOfInt[i6]);
        } 
      } 
      j += i1 << 3;
      i++;
    } 
    return arrayOfBoolean;
  }
  
  private boolean[] b(boolean[] paramArrayOfboolean) {
    // Byte code:
    //   0: aload_0
    //   1: getfield a : Le/f/c/r/a;
    //   4: invokevirtual d : ()I
    //   7: istore_3
    //   8: bipush #8
    //   10: istore_2
    //   11: iload_3
    //   12: iconst_2
    //   13: if_icmpgt -> 27
    //   16: bipush #6
    //   18: istore_2
    //   19: getstatic e/f/c/s/n/a.j : Le/f/c/s/n/a;
    //   22: astore #11
    //   24: goto -> 78
    //   27: aload_0
    //   28: getfield a : Le/f/c/r/a;
    //   31: invokevirtual d : ()I
    //   34: bipush #8
    //   36: if_icmpgt -> 47
    //   39: getstatic e/f/c/s/n/a.n : Le/f/c/s/n/a;
    //   42: astore #11
    //   44: goto -> 78
    //   47: aload_0
    //   48: getfield a : Le/f/c/r/a;
    //   51: invokevirtual d : ()I
    //   54: bipush #22
    //   56: if_icmpgt -> 70
    //   59: bipush #10
    //   61: istore_2
    //   62: getstatic e/f/c/s/n/a.i : Le/f/c/s/n/a;
    //   65: astore #11
    //   67: goto -> 78
    //   70: bipush #12
    //   72: istore_2
    //   73: getstatic e/f/c/s/n/a.h : Le/f/c/s/n/a;
    //   76: astore #11
    //   78: aload_0
    //   79: getfield a : Le/f/c/r/a;
    //   82: invokevirtual c : ()I
    //   85: istore #7
    //   87: aload_1
    //   88: arraylength
    //   89: iload_2
    //   90: idiv
    //   91: istore #5
    //   93: iload #5
    //   95: iload #7
    //   97: if_icmplt -> 393
    //   100: aload_1
    //   101: arraylength
    //   102: istore_3
    //   103: iload #5
    //   105: newarray int
    //   107: astore #12
    //   109: iload_3
    //   110: iload_2
    //   111: irem
    //   112: istore_3
    //   113: iconst_0
    //   114: istore #4
    //   116: iload #4
    //   118: iload #5
    //   120: if_icmpge -> 147
    //   123: aload #12
    //   125: iload #4
    //   127: aload_1
    //   128: iload_3
    //   129: iload_2
    //   130: invokestatic a : ([ZII)I
    //   133: iastore
    //   134: iload #4
    //   136: iconst_1
    //   137: iadd
    //   138: istore #4
    //   140: iload_3
    //   141: iload_2
    //   142: iadd
    //   143: istore_3
    //   144: goto -> 116
    //   147: new e/f/c/s/n/c
    //   150: dup
    //   151: aload #11
    //   153: invokespecial <init> : (Le/f/c/s/n/a;)V
    //   156: aload #12
    //   158: iload #5
    //   160: iload #7
    //   162: isub
    //   163: invokevirtual a : ([II)V
    //   166: iconst_1
    //   167: iload_2
    //   168: ishl
    //   169: iconst_1
    //   170: isub
    //   171: istore #8
    //   173: iconst_0
    //   174: istore_3
    //   175: iconst_0
    //   176: istore #4
    //   178: iload_3
    //   179: iload #7
    //   181: if_icmpge -> 242
    //   184: aload #12
    //   186: iload_3
    //   187: iaload
    //   188: istore #6
    //   190: iload #6
    //   192: ifeq -> 238
    //   195: iload #6
    //   197: iload #8
    //   199: if_icmpeq -> 238
    //   202: iload #6
    //   204: iconst_1
    //   205: if_icmpeq -> 221
    //   208: iload #4
    //   210: istore #5
    //   212: iload #6
    //   214: iload #8
    //   216: iconst_1
    //   217: isub
    //   218: if_icmpne -> 227
    //   221: iload #4
    //   223: iconst_1
    //   224: iadd
    //   225: istore #5
    //   227: iload_3
    //   228: iconst_1
    //   229: iadd
    //   230: istore_3
    //   231: iload #5
    //   233: istore #4
    //   235: goto -> 178
    //   238: invokestatic a : ()Le/f/c/f;
    //   241: athrow
    //   242: iload #7
    //   244: iload_2
    //   245: imul
    //   246: iload #4
    //   248: isub
    //   249: newarray boolean
    //   251: astore_1
    //   252: iconst_0
    //   253: istore #5
    //   255: iconst_0
    //   256: istore_3
    //   257: iload #5
    //   259: iload #7
    //   261: if_icmpge -> 385
    //   264: aload #12
    //   266: iload #5
    //   268: iaload
    //   269: istore #9
    //   271: iload #9
    //   273: iconst_1
    //   274: if_icmpeq -> 339
    //   277: iload #9
    //   279: iload #8
    //   281: iconst_1
    //   282: isub
    //   283: if_icmpne -> 289
    //   286: goto -> 339
    //   289: iload_2
    //   290: iconst_1
    //   291: isub
    //   292: istore #6
    //   294: iload_3
    //   295: istore #4
    //   297: iload #6
    //   299: iflt -> 373
    //   302: iconst_1
    //   303: iload #6
    //   305: ishl
    //   306: iload #9
    //   308: iand
    //   309: ifeq -> 318
    //   312: iconst_1
    //   313: istore #10
    //   315: goto -> 321
    //   318: iconst_0
    //   319: istore #10
    //   321: aload_1
    //   322: iload_3
    //   323: iload #10
    //   325: bastore
    //   326: iload #6
    //   328: iconst_1
    //   329: isub
    //   330: istore #6
    //   332: iload_3
    //   333: iconst_1
    //   334: iadd
    //   335: istore_3
    //   336: goto -> 294
    //   339: iload #9
    //   341: iconst_1
    //   342: if_icmple -> 351
    //   345: iconst_1
    //   346: istore #10
    //   348: goto -> 354
    //   351: iconst_0
    //   352: istore #10
    //   354: aload_1
    //   355: iload_3
    //   356: iload_3
    //   357: iload_2
    //   358: iadd
    //   359: iconst_1
    //   360: isub
    //   361: iload #10
    //   363: invokestatic fill : ([ZIIZ)V
    //   366: iload_3
    //   367: iload_2
    //   368: iconst_1
    //   369: isub
    //   370: iadd
    //   371: istore #4
    //   373: iload #5
    //   375: iconst_1
    //   376: iadd
    //   377: istore #5
    //   379: iload #4
    //   381: istore_3
    //   382: goto -> 257
    //   385: aload_1
    //   386: areturn
    //   387: astore_1
    //   388: aload_1
    //   389: invokestatic a : (Ljava/lang/Throwable;)Le/f/c/f;
    //   392: athrow
    //   393: invokestatic a : ()Le/f/c/f;
    //   396: astore_1
    //   397: goto -> 402
    //   400: aload_1
    //   401: athrow
    //   402: goto -> 400
    // Exception table:
    //   from	to	target	type
    //   147	166	387	e/f/c/s/n/d
  }
  
  private static String c(boolean[] paramArrayOfboolean) {
    int j = paramArrayOfboolean.length;
    b b1 = b.c;
    StringBuilder stringBuilder = new StringBuilder(20);
    b b2 = b1;
    int i = 0;
    while (i < j) {
      if (b1 == b.h) {
        if (j - i >= 5) {
          int m = a(paramArrayOfboolean, i, 5);
          int n = i + 5;
          i = n;
          int k = m;
          if (m == 0)
            if (j - n >= 11) {
              k = a(paramArrayOfboolean, n, 11) + 31;
              i = n + 11;
            } else {
              break;
            }  
          for (m = 0; m < k; m++) {
            if (j - i < 8) {
              i = j;
              break;
            } 
            stringBuilder.append((char)a(paramArrayOfboolean, i, 8));
            i += 8;
          } 
        } else {
          break;
        } 
      } else {
        byte b;
        if (b1 == b.f) {
          b = 4;
        } else {
          b = 5;
        } 
        if (j - i >= b) {
          b b3;
          int k = a(paramArrayOfboolean, i, b);
          i += b;
          String str = a(b1, k);
          if (str.startsWith("CTRL_")) {
            b2 = a(str.charAt(5));
            if (str.charAt(6) != 'L') {
              b3 = b1;
              b1 = b2;
              b2 = b3;
              continue;
            } 
          } else {
            stringBuilder.append((String)b3);
          } 
        } else {
          break;
        } 
      } 
      b1 = b2;
    } 
    return stringBuilder.toString();
  }
  
  public e a(e.f.c.r.a parama) {
    this.a = parama;
    boolean[] arrayOfBoolean = b(a(parama.a()));
    e e = new e(a(arrayOfBoolean), c(arrayOfBoolean), null, null);
    e.a(arrayOfBoolean.length);
    return e;
  }
  
  private enum b {
    c, d, e, f, g, h;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/c/r/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */