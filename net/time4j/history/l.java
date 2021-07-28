package net.time4j.history;

import java.io.InvalidObjectException;
import java.text.ParsePosition;
import java.util.List;
import java.util.Locale;
import net.time4j.b0;
import net.time4j.c1.c;
import net.time4j.d1.d;
import net.time4j.d1.e;
import net.time4j.d1.h;
import net.time4j.d1.o;
import net.time4j.d1.p;
import net.time4j.d1.q;
import net.time4j.d1.r;
import net.time4j.d1.x;
import net.time4j.d1.z;
import net.time4j.e1.b;
import net.time4j.e1.b0.a;
import net.time4j.e1.g;
import net.time4j.e1.j;
import net.time4j.e1.m;
import net.time4j.e1.t;
import net.time4j.e1.w;
import net.time4j.f0;
import net.time4j.history.q.c;

final class l extends c implements a {
  private static final long serialVersionUID = -6283098762945747308L;
  
  private final transient int g;
  
  private final d history;
  
  l(char paramChar, int paramInt1, int paramInt2, d paramd, int paramInt3) {
    super(a(paramInt3), paramChar, paramInt1, paramInt2);
    this.history = paramd;
    this.g = paramInt3;
  }
  
  private int a(int paramInt1, int paramInt2, int paramInt3) {
    if (paramInt2 >= 0) {
      byte b = 100;
      if (paramInt2 < 100 && paramInt1 >= 100) {
        if (paramInt2 < 10)
          b = 10; 
        if (Math.abs(paramInt2 - c.b(paramInt1, b)) <= paramInt3)
          return c.a(paramInt1, b) * b + paramInt2; 
      } 
    } 
    return Integer.MAX_VALUE;
  }
  
  private static int a(j paramj, char paramChar, CharSequence paramCharSequence, int paramInt, ParsePosition paramParsePosition, g paramg) {
    int n;
    long l2;
    boolean bool = paramj.b();
    int k = 0;
    int m = 0;
    long l1 = 0L;
    if (bool) {
      boolean bool1;
      if (paramj == j.c && paramCharSequence.charAt(paramInt) == '-') {
        k = paramInt + 1;
        bool1 = true;
      } else {
        k = paramInt;
        bool1 = false;
      } 
      if (!paramg.c())
        m = paramj.a().charAt(0); 
      int i1 = Math.min(k + 9, paramCharSequence.length());
      n = k;
      while (k < i1) {
        int i2 = paramCharSequence.charAt(k) - paramChar;
        if (i2 >= 0 && i2 <= 9) {
          l1 = l1 * 10L + i2;
          n++;
        } else if (m != 0 && paramChar != m) {
          int i3 = paramCharSequence.charAt(k) - m;
          if (i3 >= 0 && i3 <= 9) {
            l1 = l1 * 10L + i3;
            n++;
            i3 = m;
          } else {
            break;
          } 
        } else {
          break;
        } 
        k++;
      } 
      if (l1 > 2147483647L) {
        paramParsePosition.setErrorIndex(paramInt);
        return Integer.MIN_VALUE;
      } 
      l2 = l1;
      if (bool1) {
        int i2;
        if (n == paramInt + 1) {
          i2 = paramInt;
        } else {
          l2 = c.b(l1);
          i2 = n;
          l1 = l2;
        } 
        paramParsePosition.setIndex(i2);
        return (int)l1;
      } 
    } else {
      m = paramCharSequence.length();
      int i1;
      for (i1 = paramInt; i1 < m && paramj.a(paramCharSequence.charAt(i1)); i1++)
        k++; 
      i1 = paramInt;
      if (k > 0) {
        i1 = paramInt + k;
        l1 = paramj.a(paramCharSequence.subSequence(paramInt, i1).toString(), paramg);
      } 
      paramParsePosition.setIndex(i1);
      return (int)l1;
    } 
    int i = n;
    l1 = l2;
  }
  
  private static String a(int paramInt) {
    StringBuilder stringBuilder;
    switch (paramInt) {
      default:
        stringBuilder = new StringBuilder();
        stringBuilder.append("Unknown element index: ");
        stringBuilder.append(paramInt);
        throw new UnsupportedOperationException(stringBuilder.toString());
      case 8:
        return "CENTURY_OF_ERA";
      case 7:
        return "YEAR_BEFORE";
      case 6:
        return "YEAR_AFTER";
      case 5:
        return "HISTORIC_DAY_OF_YEAR";
      case 4:
        return "HISTORIC_DAY_OF_MONTH";
      case 3:
        return "HISTORIC_MONTH";
      case 2:
        break;
    } 
    return "YEAR_OF_ERA";
  }
  
  private static String a(String paramString, int paramInt, char paramChar) {
    int j = paramString.length();
    if (paramInt <= j)
      return paramString; 
    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < paramInt - j; i++)
      stringBuilder.append(paramChar); 
    stringBuilder.append(paramString);
    return stringBuilder.toString();
  }
  
  private String a(j paramj, char paramChar, int paramInt1, int paramInt2, int paramInt3) {
    String str;
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramj.f(paramInt1));
    stringBuilder.append('/');
    if (paramj.b() && paramInt2 >= 100 && c.a(paramInt1, 100) == c.a(paramInt2, 100)) {
      paramInt1 = c.b(paramInt2, 100);
      if (paramInt1 < 10)
        stringBuilder.append(paramChar); 
      str = paramj.f(paramInt1);
    } else {
      str = paramj.f(paramInt2);
    } 
    stringBuilder.append(str);
    return paramj.b() ? a(stringBuilder.toString(), paramInt3, paramChar) : stringBuilder.toString();
  }
  
  private t a(d paramd, m paramm) {
    return b.a((Locale)paramd.a(net.time4j.e1.a.c, Locale.ROOT)).d((w)paramd.a(net.time4j.e1.a.g, w.c), paramm);
  }
  
  private void a(String paramString, int paramInt) {
    if (paramString.length() <= paramInt)
      return; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Element ");
    stringBuilder.append(name());
    stringBuilder.append(" cannot be printed as the formatted value ");
    stringBuilder.append(paramString);
    stringBuilder.append(" exceeds the maximum width of ");
    stringBuilder.append(paramInt);
    stringBuilder.append(".");
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  private Object readResolve() {
    String str = name();
    if (str.equals("YEAR_OF_ERA"))
      return this.history.q(); 
    if (str.equals("HISTORIC_MONTH"))
      return this.history.p(); 
    if (str.equals("HISTORIC_DAY_OF_MONTH"))
      return this.history.c(); 
    if (str.equals("HISTORIC_DAY_OF_YEAR"))
      return this.history.d(); 
    if (str.equals("YEAR_AFTER"))
      return this.history.a(p.d); 
    if (str.equals("YEAR_BEFORE"))
      return this.history.a(p.e); 
    if (str.equals("CENTURY_OF_ERA"))
      return this.history.a(); 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Unknown element: ");
    stringBuilder.append(str);
    throw new InvalidObjectException(stringBuilder.toString());
  }
  
  public Integer a(CharSequence paramCharSequence, ParsePosition paramParsePosition, d paramd) {
    return a(paramCharSequence, paramParsePosition, paramd, null);
  }
  
  public Integer a(CharSequence paramCharSequence, ParsePosition paramParsePosition, d paramd, q<?> paramq) {
    // Byte code:
    //   0: aload_0
    //   1: getfield g : I
    //   4: istore #6
    //   6: iload #6
    //   8: iconst_3
    //   9: if_icmpne -> 181
    //   12: aload_2
    //   13: invokevirtual getIndex : ()I
    //   16: istore #6
    //   18: aload_3
    //   19: getstatic net/time4j/e1/b0/a.b : Lnet/time4j/d1/c;
    //   22: iconst_0
    //   23: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   26: invokeinterface a : (Lnet/time4j/d1/c;Ljava/lang/Object;)Ljava/lang/Object;
    //   31: checkcast java/lang/Integer
    //   34: invokevirtual intValue : ()I
    //   37: ifne -> 202
    //   40: aload_3
    //   41: getstatic net/time4j/e1/a.h : Lnet/time4j/d1/c;
    //   44: getstatic net/time4j/e1/m.c : Lnet/time4j/e1/m;
    //   47: invokeinterface a : (Lnet/time4j/d1/c;Ljava/lang/Object;)Ljava/lang/Object;
    //   52: checkcast net/time4j/e1/m
    //   55: astore #15
    //   57: aload_0
    //   58: aload_3
    //   59: aload #15
    //   61: invokespecial a : (Lnet/time4j/d1/d;Lnet/time4j/e1/m;)Lnet/time4j/e1/t;
    //   64: aload_1
    //   65: aload_2
    //   66: ldc_w net/time4j/b0
    //   69: aload_3
    //   70: invokevirtual a : (Ljava/lang/CharSequence;Ljava/text/ParsePosition;Ljava/lang/Class;Lnet/time4j/d1/d;)Ljava/lang/Enum;
    //   73: checkcast net/time4j/b0
    //   76: astore #14
    //   78: aload #14
    //   80: astore #4
    //   82: aload #14
    //   84: ifnonnull -> 165
    //   87: aload #14
    //   89: astore #4
    //   91: aload_3
    //   92: getstatic net/time4j/e1/a.k : Lnet/time4j/d1/c;
    //   95: getstatic java/lang/Boolean.TRUE : Ljava/lang/Boolean;
    //   98: invokeinterface a : (Lnet/time4j/d1/c;Ljava/lang/Object;)Ljava/lang/Object;
    //   103: checkcast java/lang/Boolean
    //   106: invokevirtual booleanValue : ()Z
    //   109: ifeq -> 165
    //   112: aload_2
    //   113: iconst_m1
    //   114: invokevirtual setErrorIndex : (I)V
    //   117: aload_2
    //   118: iload #6
    //   120: invokevirtual setIndex : (I)V
    //   123: getstatic net/time4j/e1/m.c : Lnet/time4j/e1/m;
    //   126: astore #14
    //   128: aload #14
    //   130: astore #4
    //   132: aload #15
    //   134: aload #14
    //   136: if_acmpne -> 144
    //   139: getstatic net/time4j/e1/m.d : Lnet/time4j/e1/m;
    //   142: astore #4
    //   144: aload_0
    //   145: aload_3
    //   146: aload #4
    //   148: invokespecial a : (Lnet/time4j/d1/d;Lnet/time4j/e1/m;)Lnet/time4j/e1/t;
    //   151: aload_1
    //   152: aload_2
    //   153: ldc_w net/time4j/b0
    //   156: aload_3
    //   157: invokevirtual a : (Ljava/lang/CharSequence;Ljava/text/ParsePosition;Ljava/lang/Class;Lnet/time4j/d1/d;)Ljava/lang/Enum;
    //   160: checkcast net/time4j/b0
    //   163: astore #4
    //   165: aload #4
    //   167: ifnonnull -> 172
    //   170: aconst_null
    //   171: areturn
    //   172: aload #4
    //   174: invokevirtual a : ()I
    //   177: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   180: areturn
    //   181: iload #6
    //   183: bipush #6
    //   185: if_icmpeq -> 614
    //   188: iload #6
    //   190: bipush #7
    //   192: if_icmpeq -> 614
    //   195: iload #6
    //   197: bipush #8
    //   199: if_icmpeq -> 614
    //   202: aload_3
    //   203: getstatic net/time4j/e1/a.l : Lnet/time4j/d1/c;
    //   206: getstatic net/time4j/e1/j.c : Lnet/time4j/e1/j;
    //   209: invokeinterface a : (Lnet/time4j/d1/c;Ljava/lang/Object;)Ljava/lang/Object;
    //   214: checkcast net/time4j/e1/j
    //   217: astore #15
    //   219: aload_3
    //   220: getstatic net/time4j/e1/a.m : Lnet/time4j/d1/c;
    //   223: invokeinterface b : (Lnet/time4j/d1/c;)Z
    //   228: ifeq -> 251
    //   231: aload_3
    //   232: getstatic net/time4j/e1/a.m : Lnet/time4j/d1/c;
    //   235: invokeinterface a : (Lnet/time4j/d1/c;)Ljava/lang/Object;
    //   240: checkcast java/lang/Character
    //   243: invokevirtual charValue : ()C
    //   246: istore #5
    //   248: goto -> 277
    //   251: aload #15
    //   253: invokevirtual b : ()Z
    //   256: ifeq -> 273
    //   259: aload #15
    //   261: invokevirtual a : ()Ljava/lang/String;
    //   264: iconst_0
    //   265: invokevirtual charAt : (I)C
    //   268: istore #5
    //   270: goto -> 248
    //   273: bipush #48
    //   275: istore #5
    //   277: aload #15
    //   279: invokevirtual b : ()Z
    //   282: ifeq -> 293
    //   285: getstatic net/time4j/e1/g.d : Lnet/time4j/e1/g;
    //   288: astore #14
    //   290: goto -> 310
    //   293: aload_3
    //   294: getstatic net/time4j/e1/a.f : Lnet/time4j/d1/c;
    //   297: getstatic net/time4j/e1/g.d : Lnet/time4j/e1/g;
    //   300: invokeinterface a : (Lnet/time4j/d1/c;Ljava/lang/Object;)Ljava/lang/Object;
    //   305: checkcast net/time4j/e1/g
    //   308: astore #14
    //   310: aload_2
    //   311: invokevirtual getIndex : ()I
    //   314: istore #13
    //   316: aload #15
    //   318: iload #5
    //   320: aload_1
    //   321: iload #13
    //   323: aload_2
    //   324: aload #14
    //   326: invokestatic a : (Lnet/time4j/e1/j;CLjava/lang/CharSequence;ILjava/text/ParsePosition;Lnet/time4j/e1/g;)I
    //   329: istore #6
    //   331: aload_2
    //   332: invokevirtual getIndex : ()I
    //   335: istore #10
    //   337: aload_0
    //   338: getfield g : I
    //   341: iconst_2
    //   342: if_icmpne -> 589
    //   345: iload #10
    //   347: iload #13
    //   349: if_icmple -> 589
    //   352: getstatic net/time4j/history/o.d : Lnet/time4j/history/o;
    //   355: aload_0
    //   356: getfield history : Lnet/time4j/history/d;
    //   359: invokevirtual l : ()Lnet/time4j/history/o;
    //   362: invokevirtual equals : (Ljava/lang/Object;)Z
    //   365: ifne -> 589
    //   368: iload #10
    //   370: aload_1
    //   371: invokeinterface length : ()I
    //   376: if_icmpge -> 589
    //   379: aload_1
    //   380: iload #10
    //   382: invokeinterface charAt : (I)C
    //   387: bipush #47
    //   389: if_icmpne -> 589
    //   392: aload_3
    //   393: getstatic net/time4j/history/d.r : Lnet/time4j/d1/c;
    //   396: getstatic net/time4j/history/p.c : Lnet/time4j/history/p;
    //   399: invokeinterface a : (Lnet/time4j/d1/c;Ljava/lang/Object;)Ljava/lang/Object;
    //   404: getstatic net/time4j/history/p.c : Lnet/time4j/history/p;
    //   407: if_acmpne -> 589
    //   410: iload #10
    //   412: iconst_1
    //   413: iadd
    //   414: istore #7
    //   416: iload #6
    //   418: istore #9
    //   420: aload #15
    //   422: iload #5
    //   424: aload_1
    //   425: iload #7
    //   427: aload_2
    //   428: aload #14
    //   430: invokestatic a : (Lnet/time4j/e1/j;CLjava/lang/CharSequence;ILjava/text/ParsePosition;Lnet/time4j/e1/g;)I
    //   433: istore #11
    //   435: aload_2
    //   436: invokevirtual getIndex : ()I
    //   439: istore #8
    //   441: iload #8
    //   443: iload #7
    //   445: if_icmpne -> 457
    //   448: aload_2
    //   449: iload #10
    //   451: invokevirtual setIndex : (I)V
    //   454: goto -> 589
    //   457: aload_0
    //   458: getfield history : Lnet/time4j/history/d;
    //   461: invokevirtual l : ()Lnet/time4j/history/o;
    //   464: getstatic net/time4j/history/j.d : Lnet/time4j/history/j;
    //   467: iload #9
    //   469: invokevirtual b : (Lnet/time4j/history/j;I)Lnet/time4j/history/n;
    //   472: getstatic net/time4j/history/n.j : Lnet/time4j/history/n;
    //   475: if_acmpne -> 484
    //   478: iconst_2
    //   479: istore #7
    //   481: goto -> 487
    //   484: iconst_1
    //   485: istore #7
    //   487: aload_0
    //   488: iload #9
    //   490: iload #11
    //   492: iload #7
    //   494: invokespecial a : (III)I
    //   497: istore #12
    //   499: aload #15
    //   501: invokevirtual b : ()Z
    //   504: ifeq -> 549
    //   507: iload #12
    //   509: ldc 2147483647
    //   511: if_icmpeq -> 549
    //   514: iload #12
    //   516: istore #6
    //   518: iload #8
    //   520: istore #7
    //   522: aload #4
    //   524: ifnull -> 593
    //   527: aload #4
    //   529: getstatic net/time4j/history/q/c.f : Lnet/time4j/d1/p;
    //   532: iload #9
    //   534: invokevirtual a : (Lnet/time4j/d1/p;I)Lnet/time4j/d1/q;
    //   537: pop
    //   538: iload #12
    //   540: istore #6
    //   542: iload #8
    //   544: istore #7
    //   546: goto -> 593
    //   549: iload #11
    //   551: iload #9
    //   553: isub
    //   554: invokestatic abs : (I)I
    //   557: iload #7
    //   559: if_icmpgt -> 448
    //   562: aload #4
    //   564: ifnull -> 578
    //   567: aload #4
    //   569: getstatic net/time4j/history/q/c.f : Lnet/time4j/d1/p;
    //   572: iload #9
    //   574: invokevirtual a : (Lnet/time4j/d1/p;I)Lnet/time4j/d1/q;
    //   577: pop
    //   578: iload #11
    //   580: istore #6
    //   582: iload #8
    //   584: istore #7
    //   586: goto -> 593
    //   589: iload #10
    //   591: istore #7
    //   593: iload #7
    //   595: iload #13
    //   597: if_icmpne -> 608
    //   600: aload_2
    //   601: iload #13
    //   603: invokevirtual setErrorIndex : (I)V
    //   606: aconst_null
    //   607: areturn
    //   608: iload #6
    //   610: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   613: areturn
    //   614: new java/lang/StringBuilder
    //   617: dup
    //   618: invokespecial <init> : ()V
    //   621: astore_1
    //   622: aload_1
    //   623: ldc_w 'Not parseable as text element: '
    //   626: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   629: pop
    //   630: aload_1
    //   631: aload_0
    //   632: invokevirtual name : ()Ljava/lang/String;
    //   635: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   638: pop
    //   639: new net/time4j/d1/r
    //   642: dup
    //   643: aload_1
    //   644: invokevirtual toString : ()Ljava/lang/String;
    //   647: invokespecial <init> : (Ljava/lang/String;)V
    //   650: astore_1
    //   651: goto -> 656
    //   654: aload_1
    //   655: athrow
    //   656: goto -> 654
  }
  
  protected <T extends q<T>> z<T, Integer> a(x<T> paramx) {
    return paramx.c((p)f0.q) ? new a<T>(this.g, this.history) : null;
  }
  
  public void a(o paramo, Appendable paramAppendable, d paramd) {
    byte b;
    j j = (j)paramd.a(net.time4j.e1.a.l, j.c);
    if (paramd.b(net.time4j.e1.a.m)) {
      b = ((Character)paramd.a(net.time4j.e1.a.m)).charValue();
    } else if (j.b()) {
      b = j.a().charAt(0);
    } else {
      b = 48;
    } 
    a(paramo, paramAppendable, paramd, j, b, 1, 10);
  }
  
  public void a(o paramo, Appendable paramAppendable, d paramd, j paramj, char paramChar, int paramInt1, int paramInt2) {
    h h;
    if (this.g == 5) {
      paramAppendable.append(String.valueOf(paramo.e(this.history.d())));
      return;
    } 
    if (paramo instanceof net.time4j.c1.a) {
      h = this.history.a(f0.a((net.time4j.c1.a)paramo));
    } else {
      h = (h)h.e(this.history.b());
    } 
    int i = this.g;
    boolean bool = false;
    if (i != 2) {
      StringBuilder stringBuilder;
      if (i != 3) {
        if (i == 4) {
          str1 = String.valueOf(h.a());
        } else {
          stringBuilder = new StringBuilder();
          stringBuilder.append("Not printable as text: ");
          stringBuilder.append(name());
          throw new r(stringBuilder.toString());
        } 
      } else {
        paramInt1 = ((Integer)paramd.a(a.b, Integer.valueOf(0))).intValue();
        paramInt2 = stringBuilder.getMonth();
        if (paramInt1 == 0) {
          str1 = a(paramd, (m)paramd.a(net.time4j.e1.a.h, m.c)).a((Enum)b0.f(paramInt2));
        } else {
          str2 = paramj.f(paramInt2);
          str1 = str2;
          if (paramj.b())
            str1 = a(str2, paramInt1, paramChar); 
        } 
      } 
      paramAppendable.append(str1);
      return;
    } 
    o o1 = this.history.l();
    int k = str1.c();
    String str4 = null;
    String str3 = str4;
    i = k;
    if (!o.d.equals(o1)) {
      int m = str1.a(o1);
      str3 = str4;
      i = k;
      if (m != k)
        if (str2.a(d.r, p.c) == p.c) {
          str3 = a(paramj, paramChar, m, k, paramInt1);
          i = k;
        } else {
          i = m;
          str3 = str4;
        }  
    } 
    String str1 = str3;
    if (str3 == null)
      if (paramj.b()) {
        str1 = a(paramj.f(i), paramInt1, paramChar);
      } else {
        str1 = paramj.f(i);
      }  
    String str2 = str1;
    if (paramj.b()) {
      i = paramj.a().charAt(0);
      str2 = str1;
      if (paramChar != i) {
        StringBuilder stringBuilder = new StringBuilder();
        k = str1.length();
        for (paramInt1 = bool; paramInt1 < k; paramInt1++) {
          char c2 = str1.charAt(paramInt1);
          char c1 = c2;
          if (paramj.a(c2))
            c1 = (char)(c2 + paramChar - i); 
          stringBuilder.append(c1);
        } 
        str2 = stringBuilder.toString();
      } 
      a(str2, paramInt2);
    } 
    paramAppendable.append(str2);
  }
  
  protected boolean a(e<?> parame) {
    return this.history.equals(((l)parame).history);
  }
  
  protected boolean g() {
    return false;
  }
  
  private static class a<C extends q<C>> implements z<C, Integer> {
    private final int c;
    
    private final d d;
    
    a(int param1Int, d param1d) {
      this.c = param1Int;
      this.d = param1d;
    }
    
    private h a(C param1C, int param1Int) {
      StringBuilder stringBuilder2;
      h h3;
      p p1;
      h h2;
      StringBuilder stringBuilder1;
      int j;
      h h4 = this.d.a((f0)param1C.e((p)f0.q));
      p p3 = p.c;
      o o = this.d.l();
      int i = this.c;
      p p2 = p3;
      switch (i) {
        default:
          stringBuilder2 = new StringBuilder();
          stringBuilder2.append("Unknown element index: ");
          stringBuilder2.append(this.c);
          throw new UnsupportedOperationException(stringBuilder2.toString());
        case 8:
          j = h4.c() % 100;
          i = j;
          if (j == 0)
            i = 100; 
          h3 = h.a(h4.b(), (param1Int - 1) * 100 + i, h4.getMonth(), h4.a(), p3, o);
          return this.d.a(h3);
        case 6:
        case 7:
          if (i == 6) {
            p p = p.d;
            break;
          } 
          p1 = p.e;
          break;
        case 5:
          i = h4.a(this.d.l());
          h2 = this.d.a(h4.b(), i);
          i = this.d.b(h4.b(), i);
          if (param1Int == 1)
            return h2; 
          if (param1Int > 1 && param1Int <= i) {
            f0 f0 = (f0)this.d.b(h2).b(h.a((param1Int - 1)));
            return this.d.a(f0);
          } 
          stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Out of range: ");
          stringBuilder1.append(param1Int);
          throw new IllegalArgumentException(stringBuilder1.toString());
        case 4:
          return h.a(h4.b(), h4.c(), h4.getMonth(), param1Int);
        case 3:
          h1 = h.a(h4.b(), h4.c(), param1Int, h4.a());
          return this.d.a(h1);
        case 2:
          break;
      } 
      h h1 = h.a(h4.b(), param1Int, h4.getMonth(), h4.a(), (p)h1, o);
      return this.d.a(h1);
    }
    
    public p<?> a(C param1C) {
      throw new UnsupportedOperationException("Never called.");
    }
    
    public C a(C param1C, Integer param1Integer, boolean param1Boolean) {
      if (param1Integer != null) {
        h h = a(param1C, param1Integer.intValue());
        return (C)param1C.b((p)f0.q, this.d.b(h));
      } 
      throw new IllegalArgumentException("Missing historic element value.");
    }
    
    public boolean a(C param1C, Integer param1Integer) {
      if (param1Integer == null)
        return false; 
      try {
        h h = a(param1C, param1Integer.intValue());
        return this.d.d(h);
      } catch (IllegalArgumentException illegalArgumentException) {
        return false;
      } 
    }
    
    public p<?> b(C param1C) {
      throw new UnsupportedOperationException("Never called.");
    }
    
    public Integer c(C param1C) {
      // Byte code:
      //   0: aload_0
      //   1: getfield d : Lnet/time4j/history/d;
      //   4: aload_1
      //   5: getstatic net/time4j/f0.q : Lnet/time4j/e;
      //   8: invokevirtual e : (Lnet/time4j/d1/p;)Ljava/lang/Object;
      //   11: checkcast net/time4j/f0
      //   14: invokevirtual a : (Lnet/time4j/f0;)Lnet/time4j/history/h;
      //   17: astore #5
      //   19: aload_0
      //   20: getfield c : I
      //   23: istore_3
      //   24: ldc 999984973
      //   26: istore_2
      //   27: iload_3
      //   28: tableswitch default -> 451, 2 -> 278, 3 -> 150, 4 -> 122, 5 -> 75, 6 -> 278, 7 -> 278, 8 -> 278
      //   72: goto -> 393
      //   75: aload #5
      //   77: aload_0
      //   78: getfield d : Lnet/time4j/history/d;
      //   81: invokevirtual l : ()Lnet/time4j/history/o;
      //   84: invokevirtual a : (Lnet/time4j/history/o;)I
      //   87: istore_2
      //   88: aload_0
      //   89: getfield d : Lnet/time4j/history/d;
      //   92: aload #5
      //   94: invokevirtual b : ()Lnet/time4j/history/j;
      //   97: iload_2
      //   98: invokevirtual b : (Lnet/time4j/history/j;I)I
      //   101: istore_2
      //   102: iload_2
      //   103: iconst_m1
      //   104: if_icmpeq -> 112
      //   107: iload_2
      //   108: invokestatic valueOf : (I)Ljava/lang/Integer;
      //   111: areturn
      //   112: new net/time4j/d1/r
      //   115: dup
      //   116: ldc 'Length of historic year undefined.'
      //   118: invokespecial <init> : (Ljava/lang/String;)V
      //   121: athrow
      //   122: aload_0
      //   123: getfield d : Lnet/time4j/history/d;
      //   126: aload #5
      //   128: invokevirtual c : (Lnet/time4j/history/h;)Lnet/time4j/history/b;
      //   131: aload #5
      //   133: invokeinterface c : (Lnet/time4j/history/h;)I
      //   138: istore_2
      //   139: aload_0
      //   140: aload_1
      //   141: iload_2
      //   142: invokespecial a : (Lnet/time4j/d1/q;I)Lnet/time4j/history/h;
      //   145: astore #4
      //   147: goto -> 177
      //   150: aload #5
      //   152: invokevirtual b : ()Lnet/time4j/history/j;
      //   155: getstatic net/time4j/history/j.f : Lnet/time4j/history/j;
      //   158: if_acmpne -> 454
      //   161: aload #5
      //   163: invokevirtual c : ()I
      //   166: ldc 999984973
      //   168: if_icmpne -> 454
      //   171: bipush #8
      //   173: istore_2
      //   174: goto -> 139
      //   177: aload_0
      //   178: getfield d : Lnet/time4j/history/d;
      //   181: aload #4
      //   183: invokevirtual d : (Lnet/time4j/history/h;)Z
      //   186: ifeq -> 194
      //   189: iload_2
      //   190: invokestatic valueOf : (I)Ljava/lang/Integer;
      //   193: areturn
      //   194: aload_0
      //   195: getfield d : Lnet/time4j/history/d;
      //   198: invokevirtual i : ()Ljava/util/List;
      //   201: astore #6
      //   203: aload #6
      //   205: invokeinterface size : ()I
      //   210: iconst_1
      //   211: isub
      //   212: istore_2
      //   213: aload #4
      //   215: astore_1
      //   216: iload_2
      //   217: iflt -> 252
      //   220: aload #6
      //   222: iload_2
      //   223: invokeinterface get : (I)Ljava/lang/Object;
      //   228: checkcast net/time4j/history/f
      //   231: astore_1
      //   232: aload #5
      //   234: aload_1
      //   235: getfield c : Lnet/time4j/history/h;
      //   238: invokevirtual a : (Lnet/time4j/history/h;)I
      //   241: ifge -> 460
      //   244: aload_1
      //   245: getfield d : Lnet/time4j/history/h;
      //   248: astore_1
      //   249: goto -> 252
      //   252: aload_0
      //   253: getfield c : I
      //   256: iconst_3
      //   257: if_icmpne -> 268
      //   260: aload_1
      //   261: invokevirtual getMonth : ()I
      //   264: istore_2
      //   265: goto -> 273
      //   268: aload_1
      //   269: invokevirtual a : ()I
      //   272: istore_2
      //   273: iload_2
      //   274: invokestatic valueOf : (I)Ljava/lang/Integer;
      //   277: areturn
      //   278: aload_0
      //   279: getfield d : Lnet/time4j/history/d;
      //   282: getstatic net/time4j/history/d.u : Lnet/time4j/history/d;
      //   285: if_acmpne -> 291
      //   288: goto -> 368
      //   291: aload_0
      //   292: getfield d : Lnet/time4j/history/d;
      //   295: getstatic net/time4j/history/d.t : Lnet/time4j/history/d;
      //   298: if_acmpne -> 321
      //   301: ldc 999979465
      //   303: istore_2
      //   304: aload #5
      //   306: invokevirtual b : ()Lnet/time4j/history/j;
      //   309: getstatic net/time4j/history/j.c : Lnet/time4j/history/j;
      //   312: if_acmpne -> 368
      //   315: ldc 999979466
      //   317: istore_2
      //   318: goto -> 368
      //   321: aload_0
      //   322: getfield d : Lnet/time4j/history/d;
      //   325: getstatic net/time4j/history/d.s : Lnet/time4j/history/d;
      //   328: if_acmpne -> 351
      //   331: ldc 999999999
      //   333: istore_2
      //   334: aload #5
      //   336: invokevirtual b : ()Lnet/time4j/history/j;
      //   339: getstatic net/time4j/history/j.c : Lnet/time4j/history/j;
      //   342: if_acmpne -> 368
      //   345: ldc 1000000000
      //   347: istore_2
      //   348: goto -> 368
      //   351: aload #5
      //   353: invokevirtual b : ()Lnet/time4j/history/j;
      //   356: getstatic net/time4j/history/j.c : Lnet/time4j/history/j;
      //   359: if_acmpne -> 467
      //   362: bipush #45
      //   364: istore_2
      //   365: goto -> 368
      //   368: iload_2
      //   369: istore_3
      //   370: aload_0
      //   371: getfield c : I
      //   374: bipush #8
      //   376: if_icmpne -> 388
      //   379: iload_2
      //   380: iconst_1
      //   381: isub
      //   382: bipush #100
      //   384: idiv
      //   385: iconst_1
      //   386: iadd
      //   387: istore_3
      //   388: iload_3
      //   389: invokestatic valueOf : (I)Ljava/lang/Integer;
      //   392: areturn
      //   393: new java/lang/StringBuilder
      //   396: dup
      //   397: invokespecial <init> : ()V
      //   400: astore_1
      //   401: aload_1
      //   402: ldc 'Unknown element index: '
      //   404: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   407: pop
      //   408: aload_1
      //   409: aload_0
      //   410: getfield c : I
      //   413: invokevirtual append : (I)Ljava/lang/StringBuilder;
      //   416: pop
      //   417: new java/lang/UnsupportedOperationException
      //   420: dup
      //   421: aload_1
      //   422: invokevirtual toString : ()Ljava/lang/String;
      //   425: invokespecial <init> : (Ljava/lang/String;)V
      //   428: athrow
      //   429: astore_1
      //   430: new net/time4j/d1/r
      //   433: dup
      //   434: aload_1
      //   435: invokevirtual getMessage : ()Ljava/lang/String;
      //   438: aload_1
      //   439: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Exception;)V
      //   442: astore_1
      //   443: goto -> 448
      //   446: aload_1
      //   447: athrow
      //   448: goto -> 446
      //   451: goto -> 72
      //   454: bipush #12
      //   456: istore_2
      //   457: goto -> 139
      //   460: iload_2
      //   461: iconst_1
      //   462: isub
      //   463: istore_2
      //   464: goto -> 213
      //   467: sipush #9999
      //   470: istore_2
      //   471: goto -> 368
      // Exception table:
      //   from	to	target	type
      //   0	24	429	java/lang/RuntimeException
      //   75	102	429	java/lang/RuntimeException
      //   107	112	429	java/lang/RuntimeException
      //   112	122	429	java/lang/RuntimeException
      //   122	139	429	java/lang/RuntimeException
      //   139	147	429	java/lang/RuntimeException
      //   150	171	429	java/lang/RuntimeException
      //   177	194	429	java/lang/RuntimeException
      //   194	213	429	java/lang/RuntimeException
      //   220	249	429	java/lang/RuntimeException
      //   252	265	429	java/lang/RuntimeException
      //   268	273	429	java/lang/RuntimeException
      //   273	278	429	java/lang/RuntimeException
      //   278	288	429	java/lang/RuntimeException
      //   291	301	429	java/lang/RuntimeException
      //   304	315	429	java/lang/RuntimeException
      //   321	331	429	java/lang/RuntimeException
      //   334	345	429	java/lang/RuntimeException
      //   351	362	429	java/lang/RuntimeException
      //   370	388	429	java/lang/RuntimeException
      //   388	393	429	java/lang/RuntimeException
      //   393	429	429	java/lang/RuntimeException
    }
    
    public Integer d(C param1C) {
      try {
        h h2 = this.d.a((f0)param1C.e((p)f0.q));
        if (this.c == 2 || this.c == 6 || this.c == 7 || this.c == 8)
          return (h2.b() == j.f && h2.getMonth() >= 9) ? Integer.valueOf(0) : Integer.valueOf(1); 
        h h1 = a(param1C, 1);
        if (this.d.d(h1))
          return Integer.valueOf(1); 
        if (this.c != 5) {
          List<f> list = this.d.i();
          int i = list.size() - 1;
          while (true) {
            h h = h1;
            if (i >= 0) {
              f f = list.get(i);
              if (h2.a(f.c) >= 0) {
                h = f.c;
              } else {
                i--;
                continue;
              } 
            } 
            if (this.c == 3) {
              i = h.getMonth();
            } else {
              i = h.a();
            } 
            return Integer.valueOf(i);
          } 
        } 
        throw new r("Historic New Year cannot be determined.");
      } catch (IllegalArgumentException illegalArgumentException) {
        r r = new r(illegalArgumentException.getMessage(), illegalArgumentException);
        throw r;
      } 
    }
    
    public Integer e(C param1C) {
      try {
        h h1;
        int i;
        long l;
        f0 f0 = (f0)param1C.e((p)f0.q);
        h h2 = this.d.a(f0);
        switch (this.c) {
          case 8:
            i = (h2.c() - 1) / 100 + 1;
            return Integer.valueOf(i);
          case 6:
          case 7:
            i = h2.a(this.d.l());
            return Integer.valueOf(i);
          case 5:
            l = f0.q();
            i = h2.a(this.d.l());
            h1 = this.d.a(h2.b(), i);
            i = (int)(l - this.d.b(h1).q() + 1L);
            return Integer.valueOf(i);
          case 4:
            i = h2.a();
            return Integer.valueOf(i);
          case 3:
            i = h2.getMonth();
            return Integer.valueOf(i);
          case 2:
            i = h2.c();
            return Integer.valueOf(i);
        } 
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unknown element index: ");
        stringBuilder.append(this.c);
        throw new UnsupportedOperationException(stringBuilder.toString());
      } catch (IllegalArgumentException illegalArgumentException) {
        throw new r(illegalArgumentException.getMessage(), illegalArgumentException);
      } 
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/history/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */