package e.f.c.w;

import e.f.c.a;
import e.f.c.d;
import e.f.c.e;
import e.f.c.j;
import e.f.c.n;
import e.f.c.p;
import e.f.c.s.a;
import java.util.Arrays;
import java.util.Map;

public final class c extends k {
  static final int[] e = new int[] { 
      52, 289, 97, 352, 49, 304, 112, 37, 292, 100, 
      265, 73, 328, 25, 280, 88, 13, 268, 76, 28, 
      259, 67, 322, 19, 274, 82, 7, 262, 70, 22, 
      385, 193, 448, 145, 400, 208, 133, 388, 196, 168, 
      162, 138, 42 };
  
  private final boolean a;
  
  private final boolean b;
  
  private final StringBuilder c;
  
  private final int[] d;
  
  public c() {
    this(false);
  }
  
  public c(boolean paramBoolean) {
    this(paramBoolean, false);
  }
  
  public c(boolean paramBoolean1, boolean paramBoolean2) {
    this.a = paramBoolean1;
    this.b = paramBoolean2;
    this.c = new StringBuilder(20);
    this.d = new int[9];
  }
  
  private static char a(int paramInt) {
    int i = 0;
    while (true) {
      int[] arrayOfInt = e;
      if (i < arrayOfInt.length) {
        if (arrayOfInt[i] == paramInt)
          return "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".charAt(i); 
        i++;
        continue;
      } 
      if (paramInt == 148)
        return '*'; 
      j j = j.a();
      throw j;
    } 
  }
  
  private static int a(int[] paramArrayOfint) {
    int j = paramArrayOfint.length;
    boolean bool = false;
    for (int i = 0;; i = m) {
      int i3 = paramArrayOfint.length;
      int n = 0;
      int m;
      for (m = Integer.MAX_VALUE; n < i3; m = i4) {
        int i5 = paramArrayOfint[n];
        int i4 = m;
        if (i5 < m) {
          i4 = m;
          if (i5 > i)
            i4 = i5; 
        } 
        n++;
      } 
      int i2 = 0;
      i = 0;
      int i1 = 0;
      for (n = 0; i2 < j; n = i3) {
        int i6 = paramArrayOfint[i2];
        int i5 = i;
        int i4 = i1;
        i3 = n;
        if (i6 > m) {
          i4 = i1 | 1 << j - 1 - i2;
          i5 = i + 1;
          i3 = n + i6;
        } 
        i2++;
        i = i5;
        i1 = i4;
      } 
      if (i == 3) {
        i2 = i;
        i = bool;
        while (i < j && i2 > 0) {
          int i4 = paramArrayOfint[i];
          i3 = i2;
          if (i4 > m) {
            i3 = i2 - 1;
            if (i4 << 1 >= n)
              return -1; 
          } 
          i++;
          i2 = i3;
        } 
        return i1;
      } 
      if (i <= 3)
        return -1; 
    } 
  }
  
  private static String a(CharSequence paramCharSequence) {
    // Byte code:
    //   0: aload_0
    //   1: invokeinterface length : ()I
    //   6: istore #5
    //   8: new java/lang/StringBuilder
    //   11: dup
    //   12: iload #5
    //   14: invokespecial <init> : (I)V
    //   17: astore #6
    //   19: iconst_0
    //   20: istore_3
    //   21: iload_3
    //   22: iload #5
    //   24: if_icmpge -> 350
    //   27: aload_0
    //   28: iload_3
    //   29: invokeinterface charAt : (I)C
    //   34: istore_2
    //   35: iload_2
    //   36: bipush #43
    //   38: if_icmpeq -> 64
    //   41: iload_2
    //   42: bipush #36
    //   44: if_icmpeq -> 64
    //   47: iload_2
    //   48: bipush #37
    //   50: if_icmpeq -> 64
    //   53: iload_3
    //   54: istore #4
    //   56: iload_2
    //   57: istore_1
    //   58: iload_2
    //   59: bipush #47
    //   61: if_icmpne -> 331
    //   64: iload_3
    //   65: iconst_1
    //   66: iadd
    //   67: istore #4
    //   69: aload_0
    //   70: iload #4
    //   72: invokeinterface charAt : (I)C
    //   77: istore_3
    //   78: iload_2
    //   79: bipush #36
    //   81: if_icmpeq -> 311
    //   84: iload_2
    //   85: bipush #37
    //   87: if_icmpeq -> 167
    //   90: iload_2
    //   91: bipush #43
    //   93: if_icmpeq -> 143
    //   96: iload_2
    //   97: bipush #47
    //   99: if_icmpeq -> 107
    //   102: iconst_0
    //   103: istore_1
    //   104: goto -> 331
    //   107: iload_3
    //   108: bipush #65
    //   110: if_icmplt -> 127
    //   113: iload_3
    //   114: bipush #79
    //   116: if_icmpgt -> 127
    //   119: iload_3
    //   120: bipush #32
    //   122: isub
    //   123: istore_3
    //   124: goto -> 328
    //   127: iload_3
    //   128: bipush #90
    //   130: if_icmpne -> 139
    //   133: bipush #58
    //   135: istore_1
    //   136: goto -> 331
    //   139: invokestatic a : ()Le/f/c/f;
    //   142: athrow
    //   143: iload_3
    //   144: bipush #65
    //   146: if_icmplt -> 163
    //   149: iload_3
    //   150: bipush #90
    //   152: if_icmpgt -> 163
    //   155: iload_3
    //   156: bipush #32
    //   158: iadd
    //   159: istore_3
    //   160: goto -> 328
    //   163: invokestatic a : ()Le/f/c/f;
    //   166: athrow
    //   167: iload_3
    //   168: bipush #65
    //   170: if_icmplt -> 187
    //   173: iload_3
    //   174: bipush #69
    //   176: if_icmpgt -> 187
    //   179: iload_3
    //   180: bipush #38
    //   182: isub
    //   183: istore_3
    //   184: goto -> 328
    //   187: iload_3
    //   188: bipush #70
    //   190: if_icmplt -> 207
    //   193: iload_3
    //   194: bipush #74
    //   196: if_icmpgt -> 207
    //   199: iload_3
    //   200: bipush #11
    //   202: isub
    //   203: istore_3
    //   204: goto -> 328
    //   207: iload_3
    //   208: bipush #75
    //   210: if_icmplt -> 227
    //   213: iload_3
    //   214: bipush #79
    //   216: if_icmpgt -> 227
    //   219: iload_3
    //   220: bipush #16
    //   222: iadd
    //   223: istore_3
    //   224: goto -> 328
    //   227: iload_3
    //   228: bipush #80
    //   230: if_icmplt -> 247
    //   233: iload_3
    //   234: bipush #84
    //   236: if_icmpgt -> 247
    //   239: iload_3
    //   240: bipush #43
    //   242: iadd
    //   243: istore_3
    //   244: goto -> 328
    //   247: iload_3
    //   248: bipush #85
    //   250: if_icmpne -> 256
    //   253: goto -> 102
    //   256: iload_3
    //   257: bipush #86
    //   259: if_icmpne -> 268
    //   262: bipush #64
    //   264: istore_1
    //   265: goto -> 331
    //   268: iload_3
    //   269: bipush #87
    //   271: if_icmpne -> 280
    //   274: bipush #96
    //   276: istore_1
    //   277: goto -> 331
    //   280: iload_3
    //   281: bipush #88
    //   283: if_icmpeq -> 305
    //   286: iload_3
    //   287: bipush #89
    //   289: if_icmpeq -> 305
    //   292: iload_3
    //   293: bipush #90
    //   295: if_icmpne -> 301
    //   298: goto -> 305
    //   301: invokestatic a : ()Le/f/c/f;
    //   304: athrow
    //   305: bipush #127
    //   307: istore_1
    //   308: goto -> 331
    //   311: iload_3
    //   312: bipush #65
    //   314: if_icmplt -> 346
    //   317: iload_3
    //   318: bipush #90
    //   320: if_icmpgt -> 346
    //   323: iload_3
    //   324: bipush #64
    //   326: isub
    //   327: istore_3
    //   328: iload_3
    //   329: i2c
    //   330: istore_1
    //   331: aload #6
    //   333: iload_1
    //   334: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   337: pop
    //   338: iload #4
    //   340: iconst_1
    //   341: iadd
    //   342: istore_3
    //   343: goto -> 21
    //   346: invokestatic a : ()Le/f/c/f;
    //   349: athrow
    //   350: aload #6
    //   352: invokevirtual toString : ()Ljava/lang/String;
    //   355: areturn
  }
  
  private static int[] a(a parama, int[] paramArrayOfint) {
    int i1 = parama.c();
    int n = parama.b(0);
    int i2 = paramArrayOfint.length;
    int i = n;
    boolean bool = false;
    int m = 0;
    while (n < i1) {
      int i3;
      if (parama.a(n) != bool) {
        paramArrayOfint[m] = paramArrayOfint[m] + 1;
        i3 = i;
      } else {
        if (m == i2 - 1) {
          if (a(paramArrayOfint) == 148 && parama.a(Math.max(0, i - (n - i) / 2), i, false))
            return new int[] { i, n }; 
          int i5 = i + paramArrayOfint[0] + paramArrayOfint[1];
          i = m - 1;
          System.arraycopy(paramArrayOfint, 2, paramArrayOfint, 0, i);
          paramArrayOfint[i] = 0;
          paramArrayOfint[m] = 0;
          i = m - 1;
          m = i5;
        } else {
          int i5 = m + 1;
          m = i;
          i = i5;
        } 
        paramArrayOfint[i] = 1;
        int i4 = bool ^ true;
        i3 = m;
        m = i;
      } 
      n++;
      i = i3;
    } 
    j j = j.a();
    throw j;
  }
  
  public n a(int paramInt, a parama, Map<e, ?> paramMap) {
    int[] arrayOfInt2 = this.d;
    Arrays.fill(arrayOfInt2, 0);
    StringBuilder stringBuilder = this.c;
    stringBuilder.setLength(0);
    int[] arrayOfInt1 = a(parama, arrayOfInt2);
    int i = parama.b(arrayOfInt1[1]);
    int j = parama.c();
    while (true) {
      k.a(parama, i, arrayOfInt2);
      int m = a(arrayOfInt2);
      if (m >= 0) {
        char c1 = a(m);
        stringBuilder.append(c1);
        int i1 = arrayOfInt2.length;
        int n = i;
        for (m = 0; m < i1; m++)
          n += arrayOfInt2[m]; 
        i1 = parama.b(n);
        if (c1 == '*') {
          stringBuilder.setLength(stringBuilder.length() - 1);
          int i2 = arrayOfInt2.length;
          n = 0;
          m = 0;
          while (n < i2) {
            m += arrayOfInt2[n];
            n++;
          } 
          if (i1 == j || i1 - i - m << 1 >= m) {
            if (this.a) {
              j = stringBuilder.length() - 1;
              n = 0;
              i1 = 0;
              while (n < j) {
                i1 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(this.c.charAt(n));
                n++;
              } 
              if (stringBuilder.charAt(j) == "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".charAt(i1 % 43)) {
                stringBuilder.setLength(j);
              } else {
                throw d.a();
              } 
            } 
            if (stringBuilder.length() != 0) {
              String str;
              if (this.b) {
                str = a(stringBuilder);
              } else {
                str = stringBuilder.toString();
              } 
              float f1 = (arrayOfInt1[1] + arrayOfInt1[0]) / 2.0F;
              float f2 = i;
              float f3 = m / 2.0F;
              float f4 = paramInt;
              p p1 = new p(f1, f4);
              p p2 = new p(f2 + f3, f4);
              a a1 = a.e;
              return new n(str, null, new p[] { p1, p2 }, a1);
            } 
            throw j.a();
          } 
          throw j.a();
        } 
        i = i1;
        continue;
      } 
      j j1 = j.a();
      throw j1;
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/c/w/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */