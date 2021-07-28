package e.f.a.e.i.n;

final class q6 extends l6 {
  private static int a(byte[] paramArrayOfbyte, int paramInt1, long paramLong, int paramInt2) {
    if (paramInt2 != 0) {
      if (paramInt2 != 1) {
        if (paramInt2 == 2)
          return k6.a(paramInt1, h6.a(paramArrayOfbyte, paramLong), h6.a(paramArrayOfbyte, paramLong + 1L)); 
        throw new AssertionError();
      } 
      return k6.a(paramInt1, h6.a(paramArrayOfbyte, paramLong));
    } 
    return k6.a(paramInt1);
  }
  
  final int a(int paramInt1, byte[] paramArrayOfbyte, int paramInt2, int paramInt3) {
    // Byte code:
    //   0: iload_3
    //   1: iload #4
    //   3: ior
    //   4: aload_2
    //   5: arraylength
    //   6: iload #4
    //   8: isub
    //   9: ior
    //   10: iflt -> 391
    //   13: iload_3
    //   14: i2l
    //   15: lstore #7
    //   17: iload #4
    //   19: i2l
    //   20: lload #7
    //   22: lsub
    //   23: l2i
    //   24: istore_3
    //   25: iload_3
    //   26: bipush #16
    //   28: if_icmpge -> 36
    //   31: iconst_0
    //   32: istore_1
    //   33: goto -> 74
    //   36: lload #7
    //   38: lstore #5
    //   40: iconst_0
    //   41: istore_1
    //   42: iload_1
    //   43: iload_3
    //   44: if_icmpge -> 72
    //   47: aload_2
    //   48: lload #5
    //   50: invokestatic a : ([BJ)B
    //   53: ifge -> 59
    //   56: goto -> 74
    //   59: iload_1
    //   60: iconst_1
    //   61: iadd
    //   62: istore_1
    //   63: lload #5
    //   65: lconst_1
    //   66: ladd
    //   67: lstore #5
    //   69: goto -> 42
    //   72: iload_3
    //   73: istore_1
    //   74: iload_3
    //   75: iload_1
    //   76: isub
    //   77: istore_3
    //   78: lload #7
    //   80: iload_1
    //   81: i2l
    //   82: ladd
    //   83: lstore #5
    //   85: iload_3
    //   86: istore_1
    //   87: iconst_0
    //   88: istore #4
    //   90: iload_1
    //   91: istore_3
    //   92: iload #4
    //   94: istore_1
    //   95: iload_3
    //   96: ifle -> 139
    //   99: lload #5
    //   101: lconst_1
    //   102: ladd
    //   103: lstore #9
    //   105: aload_2
    //   106: lload #5
    //   108: invokestatic a : ([BJ)B
    //   111: istore #4
    //   113: iload #4
    //   115: istore_1
    //   116: lload #9
    //   118: lstore #7
    //   120: iload #4
    //   122: iflt -> 143
    //   125: iload_3
    //   126: iconst_1
    //   127: isub
    //   128: istore_3
    //   129: lload #9
    //   131: lstore #5
    //   133: iload #4
    //   135: istore_1
    //   136: goto -> 95
    //   139: lload #5
    //   141: lstore #7
    //   143: iload_3
    //   144: ifne -> 149
    //   147: iconst_0
    //   148: ireturn
    //   149: iload_3
    //   150: iconst_1
    //   151: isub
    //   152: istore_3
    //   153: iload_1
    //   154: bipush #-32
    //   156: if_icmpge -> 201
    //   159: iload_3
    //   160: ifne -> 165
    //   163: iload_1
    //   164: ireturn
    //   165: iload_3
    //   166: iconst_1
    //   167: isub
    //   168: istore_3
    //   169: iload_1
    //   170: bipush #-62
    //   172: if_icmplt -> 199
    //   175: lload #7
    //   177: lconst_1
    //   178: ladd
    //   179: lstore #5
    //   181: iload_3
    //   182: istore_1
    //   183: aload_2
    //   184: lload #7
    //   186: invokestatic a : ([BJ)B
    //   189: bipush #-65
    //   191: if_icmple -> 196
    //   194: iconst_m1
    //   195: ireturn
    //   196: goto -> 87
    //   199: iconst_m1
    //   200: ireturn
    //   201: iload_1
    //   202: bipush #-16
    //   204: if_icmpge -> 298
    //   207: iload_3
    //   208: iconst_2
    //   209: if_icmpge -> 221
    //   212: aload_2
    //   213: iload_1
    //   214: lload #7
    //   216: iload_3
    //   217: invokestatic a : ([BIJI)I
    //   220: ireturn
    //   221: iload_3
    //   222: iconst_2
    //   223: isub
    //   224: istore_3
    //   225: lload #7
    //   227: lconst_1
    //   228: ladd
    //   229: lstore #5
    //   231: aload_2
    //   232: lload #7
    //   234: invokestatic a : ([BJ)B
    //   237: istore #4
    //   239: iload #4
    //   241: bipush #-65
    //   243: if_icmpgt -> 296
    //   246: iload_1
    //   247: bipush #-32
    //   249: if_icmpne -> 259
    //   252: iload #4
    //   254: bipush #-96
    //   256: if_icmplt -> 296
    //   259: iload_1
    //   260: bipush #-19
    //   262: if_icmpne -> 272
    //   265: iload #4
    //   267: bipush #-96
    //   269: if_icmpge -> 296
    //   272: aload_2
    //   273: lload #5
    //   275: invokestatic a : ([BJ)B
    //   278: bipush #-65
    //   280: if_icmple -> 285
    //   283: iconst_m1
    //   284: ireturn
    //   285: lload #5
    //   287: lconst_1
    //   288: ladd
    //   289: lstore #5
    //   291: iload_3
    //   292: istore_1
    //   293: goto -> 87
    //   296: iconst_m1
    //   297: ireturn
    //   298: iload_3
    //   299: iconst_3
    //   300: if_icmpge -> 312
    //   303: aload_2
    //   304: iload_1
    //   305: lload #7
    //   307: iload_3
    //   308: invokestatic a : ([BIJI)I
    //   311: ireturn
    //   312: iload_3
    //   313: iconst_3
    //   314: isub
    //   315: istore_3
    //   316: lload #7
    //   318: lconst_1
    //   319: ladd
    //   320: lstore #5
    //   322: aload_2
    //   323: lload #7
    //   325: invokestatic a : ([BJ)B
    //   328: istore #4
    //   330: iload #4
    //   332: bipush #-65
    //   334: if_icmpgt -> 389
    //   337: iload_1
    //   338: bipush #28
    //   340: ishl
    //   341: iload #4
    //   343: bipush #112
    //   345: iadd
    //   346: iadd
    //   347: bipush #30
    //   349: ishr
    //   350: ifne -> 389
    //   353: lload #5
    //   355: lconst_1
    //   356: ladd
    //   357: lstore #7
    //   359: aload_2
    //   360: lload #5
    //   362: invokestatic a : ([BJ)B
    //   365: bipush #-65
    //   367: if_icmpgt -> 389
    //   370: lload #7
    //   372: lconst_1
    //   373: ladd
    //   374: lstore #5
    //   376: iload_3
    //   377: istore_1
    //   378: aload_2
    //   379: lload #7
    //   381: invokestatic a : ([BJ)B
    //   384: bipush #-65
    //   386: if_icmple -> 196
    //   389: iconst_m1
    //   390: ireturn
    //   391: new java/lang/ArrayIndexOutOfBoundsException
    //   394: dup
    //   395: ldc 'Array length=%d, index=%d, limit=%d'
    //   397: iconst_3
    //   398: anewarray java/lang/Object
    //   401: dup
    //   402: iconst_0
    //   403: aload_2
    //   404: arraylength
    //   405: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   408: aastore
    //   409: dup
    //   410: iconst_1
    //   411: iload_3
    //   412: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   415: aastore
    //   416: dup
    //   417: iconst_2
    //   418: iload #4
    //   420: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   423: aastore
    //   424: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   427: invokespecial <init> : (Ljava/lang/String;)V
    //   430: astore_2
    //   431: goto -> 436
    //   434: aload_2
    //   435: athrow
    //   436: goto -> 434
  }
  
  final int a(CharSequence paramCharSequence, byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    long l1 = paramInt1;
    long l2 = paramInt2 + l1;
    int i = paramCharSequence.length();
    if (i <= paramInt2 && paramArrayOfbyte.length - paramInt2 >= paramInt1) {
      long l3;
      paramInt2 = 0;
      while (true) {
        l3 = 1L;
        if (paramInt2 < i) {
          paramInt1 = paramCharSequence.charAt(paramInt2);
          if (paramInt1 < 128) {
            h6.a(paramArrayOfbyte, l1, (byte)paramInt1);
            paramInt2++;
            l1 = 1L + l1;
            continue;
          } 
        } 
        break;
      } 
      paramInt1 = paramInt2;
      long l4 = l1;
      if (paramInt2 == i)
        return (int)l1; 
      while (paramInt1 < i) {
        char c1 = paramCharSequence.charAt(paramInt1);
        if (c1 < '' && l4 < l2) {
          h6.a(paramArrayOfbyte, l4, (byte)c1);
          long l = l3;
          l1 = l4 + l3;
          l3 = l;
        } else if (c1 < 'ࠀ' && l4 <= l2 - 2L) {
          l1 = l4 + l3;
          h6.a(paramArrayOfbyte, l4, (byte)(c1 >>> 6 | 0x3C0));
          h6.a(paramArrayOfbyte, l1, (byte)(c1 & 0x3F | 0x80));
          l1 += l3;
        } else if ((c1 < '?' || '?' < c1) && l4 <= l2 - 3L) {
          l1 = l4 + l3;
          h6.a(paramArrayOfbyte, l4, (byte)(c1 >>> 12 | 0x1E0));
          l3 = l1 + l3;
          h6.a(paramArrayOfbyte, l1, (byte)(c1 >>> 6 & 0x3F | 0x80));
          h6.a(paramArrayOfbyte, l3, (byte)(c1 & 0x3F | 0x80));
          l1 = l3 + 1L;
          l3 = 1L;
        } else if (l4 <= l2 - 4L) {
          paramInt2 = paramInt1 + 1;
          if (paramInt2 != i) {
            char c2 = paramCharSequence.charAt(paramInt2);
            if (Character.isSurrogatePair(c1, c2)) {
              paramInt1 = Character.toCodePoint(c1, c2);
              l3 = l4 + 1L;
              h6.a(paramArrayOfbyte, l4, (byte)(paramInt1 >>> 18 | 0xF0));
              l1 = l3 + 1L;
              h6.a(paramArrayOfbyte, l3, (byte)(paramInt1 >>> 12 & 0x3F | 0x80));
              l4 = l1 + 1L;
              h6.a(paramArrayOfbyte, l1, (byte)(paramInt1 >>> 6 & 0x3F | 0x80));
              l3 = 1L;
              l1 = l4 + 1L;
              h6.a(paramArrayOfbyte, l4, (byte)(paramInt1 & 0x3F | 0x80));
              paramInt1 = paramInt2;
            } else {
              paramInt1 = paramInt2;
              throw new n6(paramInt1 - 1, i);
            } 
          } else {
            throw new n6(paramInt1 - 1, i);
          } 
        } else {
          if ('?' <= c1 && c1 <= '?') {
            paramInt2 = paramInt1 + 1;
            if (paramInt2 == i || !Character.isSurrogatePair(c1, paramCharSequence.charAt(paramInt2)))
              throw new n6(paramInt1, i); 
          } 
          paramCharSequence = new StringBuilder(46);
          paramCharSequence.append("Failed writing ");
          paramCharSequence.append(c1);
          paramCharSequence.append(" at index ");
          paramCharSequence.append(l4);
          throw new ArrayIndexOutOfBoundsException(paramCharSequence.toString());
        } 
        paramInt1++;
        l4 = l1;
      } 
      return (int)l4;
    } 
    char c = paramCharSequence.charAt(i - 1);
    paramCharSequence = new StringBuilder(37);
    paramCharSequence.append("Failed writing ");
    paramCharSequence.append(c);
    paramCharSequence.append(" at index ");
    paramCharSequence.append(paramInt1 + paramInt2);
    ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException = new ArrayIndexOutOfBoundsException(paramCharSequence.toString());
    throw arrayIndexOutOfBoundsException;
  }
  
  final String b(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    if ((paramInt1 | paramInt2 | paramArrayOfbyte.length - paramInt1 - paramInt2) >= 0) {
      int j = paramInt1 + paramInt2;
      char[] arrayOfChar = new char[paramInt2];
      paramInt2 = 0;
      while (paramInt1 < j) {
        byte b = h6.a(paramArrayOfbyte, paramInt1);
        if (m6.a(b)) {
          paramInt1++;
          m6.a(b, arrayOfChar, paramInt2);
          paramInt2++;
        } 
      } 
      int i = paramInt2;
      paramInt2 = paramInt1;
      paramInt1 = i;
      while (paramInt2 < j) {
        i = paramInt2 + 1;
        byte b = h6.a(paramArrayOfbyte, paramInt2);
        if (m6.a(b)) {
          paramInt2 = paramInt1 + 1;
          m6.a(b, arrayOfChar, paramInt1);
          paramInt1 = paramInt2;
          paramInt2 = i;
          while (paramInt2 < j) {
            b = h6.a(paramArrayOfbyte, paramInt2);
            if (m6.a(b)) {
              paramInt2++;
              m6.a(b, arrayOfChar, paramInt1);
              paramInt1++;
            } 
          } 
          continue;
        } 
        if (m6.b(b)) {
          if (i < j) {
            m6.a(b, h6.a(paramArrayOfbyte, i), arrayOfChar, paramInt1);
            paramInt2 = i + 1;
            paramInt1++;
            continue;
          } 
          throw q3.f();
        } 
        if (m6.c(b)) {
          if (i < j - 1) {
            paramInt2 = i + 1;
            m6.a(b, h6.a(paramArrayOfbyte, i), h6.a(paramArrayOfbyte, paramInt2), arrayOfChar, paramInt1);
            paramInt2++;
            paramInt1++;
            continue;
          } 
          throw q3.f();
        } 
        if (i < j - 2) {
          paramInt2 = i + 1;
          byte b1 = h6.a(paramArrayOfbyte, i);
          i = paramInt2 + 1;
          m6.a(b, b1, h6.a(paramArrayOfbyte, paramInt2), h6.a(paramArrayOfbyte, i), arrayOfChar, paramInt1);
          paramInt2 = i + 1;
          paramInt1 = paramInt1 + 1 + 1;
          continue;
        } 
        throw q3.f();
      } 
      return new String(arrayOfChar, 0, paramInt1);
    } 
    ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException = new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[] { Integer.valueOf(paramArrayOfbyte.length), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }));
    throw arrayIndexOutOfBoundsException;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/n/q6.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */