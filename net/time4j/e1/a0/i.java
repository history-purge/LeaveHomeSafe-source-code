package net.time4j.e1.a0;

import java.util.Set;
import net.time4j.d1.d;
import net.time4j.d1.n;
import net.time4j.d1.o;
import net.time4j.d1.p;
import net.time4j.e1.a;
import net.time4j.e1.g;

final class i {
  private final h<?> a;
  
  private final int b;
  
  private final int c;
  
  private final b d;
  
  private final d e;
  
  private final int f;
  
  private final int g;
  
  private final int h;
  
  private final boolean i;
  
  private final int j;
  
  i(h<?> paramh, int paramInt1, int paramInt2, b paramb) {
    this(paramh, paramInt1, paramInt2, paramb, null, 0, 0, 0, false, -1);
  }
  
  private i(h<?> paramh, int paramInt1, int paramInt2, b paramb, d paramd, int paramInt3, int paramInt4, int paramInt5, boolean paramBoolean, int paramInt6) {
    if (paramh != null) {
      if (paramInt1 >= 0) {
        if (paramInt2 >= 0) {
          if (paramInt3 >= 0) {
            if (paramInt4 >= 0) {
              if (paramInt5 >= 0) {
                this.a = paramh;
                this.b = paramInt1;
                this.c = paramInt2;
                this.d = paramb;
                this.e = paramd;
                this.f = paramInt3;
                this.g = paramInt4;
                this.h = paramInt5;
                this.i = paramBoolean;
                this.j = paramInt6;
                return;
              } 
              StringBuilder stringBuilder4 = new StringBuilder();
              stringBuilder4.append("Invalid pad-width: ");
              stringBuilder4.append(paramInt5);
              throw new IllegalArgumentException(stringBuilder4.toString());
            } 
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append("Invalid pad-width: ");
            stringBuilder3.append(paramInt4);
            throw new IllegalArgumentException(stringBuilder3.toString());
          } 
          StringBuilder stringBuilder2 = new StringBuilder();
          stringBuilder2.append("Reserved chars must not be negative: ");
          stringBuilder2.append(paramInt3);
          throw new IllegalArgumentException(stringBuilder2.toString());
        } 
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("Invalid section: ");
        stringBuilder1.append(paramInt2);
        throw new IllegalArgumentException(stringBuilder1.toString());
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Invalid level: ");
      stringBuilder.append(paramInt1);
      throw new IllegalArgumentException(stringBuilder.toString());
    } 
    throw new NullPointerException("Missing format processor.");
  }
  
  private char a(d paramd) {
    return ((Character)paramd.a(a.p, Character.valueOf(' '))).charValue();
  }
  
  private static <V> h<V> a(h<V> paramh, p<?> paramp) {
    if (paramh.b() == null)
      return paramh; 
    if (paramh.b().getType() == paramp.getType() || paramp instanceof net.time4j.e1.b0.a)
      return paramh.a((p)paramp); 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Cannot change element value type: ");
    stringBuilder.append(paramp.name());
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  private static boolean a(Object paramObject1, Object paramObject2) {
    return (paramObject1 == null) ? ((paramObject2 == null)) : paramObject1.equals(paramObject2);
  }
  
  private boolean a(o paramo) {
    b b1 = this.d;
    boolean bool = true;
    if (b1 == null)
      return true; 
    n<o> n = b1.b();
    if (n != null) {
      if (n.b(paramo))
        return true; 
      bool = false;
    } 
    return bool;
  }
  
  private d b(d paramd) {
    b b1 = this.d;
    return (b1 == null) ? paramd : new p(b1, paramd);
  }
  
  private void b(CharSequence paramCharSequence, s params, d paramd, t<?> paramt, boolean paramBoolean) {
    int j = params.f();
    try {
      this.a.a(paramCharSequence, params, paramd, paramt, paramBoolean);
      return;
    } catch (RuntimeException runtimeException) {
      params.a(j, runtimeException.getMessage());
      return;
    } 
  }
  
  private boolean c(d paramd) {
    return ((g)paramd.a(a.f, g.d)).c();
  }
  
  private String i() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Pad width exceeded: ");
    stringBuilder.append(this.a.b().name());
    return stringBuilder.toString();
  }
  
  private String j() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Pad width mismatched: ");
    stringBuilder.append(this.a.b().name());
    return stringBuilder.toString();
  }
  
  int a() {
    return this.b;
  }
  
  int a(o paramo, Appendable paramAppendable, d paramd, Set<g> paramSet, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokespecial a : (Lnet/time4j/d1/o;)Z
    //   5: ifne -> 10
    //   8: iconst_0
    //   9: ireturn
    //   10: iload #5
    //   12: ifeq -> 23
    //   15: aload_0
    //   16: getfield e : Lnet/time4j/d1/d;
    //   19: astore_3
    //   20: goto -> 29
    //   23: aload_0
    //   24: aload_3
    //   25: invokespecial b : (Lnet/time4j/d1/d;)Lnet/time4j/d1/d;
    //   28: astore_3
    //   29: aload_0
    //   30: getfield g : I
    //   33: ifne -> 60
    //   36: aload_0
    //   37: getfield h : I
    //   40: ifne -> 60
    //   43: aload_0
    //   44: getfield a : Lnet/time4j/e1/a0/h;
    //   47: aload_1
    //   48: aload_2
    //   49: aload_3
    //   50: aload #4
    //   52: iload #5
    //   54: invokeinterface a : (Lnet/time4j/d1/o;Ljava/lang/Appendable;Lnet/time4j/d1/d;Ljava/util/Set;Z)I
    //   59: ireturn
    //   60: aconst_null
    //   61: astore #15
    //   63: aload_2
    //   64: instanceof java/lang/StringBuilder
    //   67: ifeq -> 86
    //   70: aload_2
    //   71: checkcast java/lang/StringBuilder
    //   74: astore #14
    //   76: aload #14
    //   78: invokevirtual length : ()I
    //   81: istore #9
    //   83: goto -> 98
    //   86: new java/lang/StringBuilder
    //   89: dup
    //   90: invokespecial <init> : ()V
    //   93: astore #14
    //   95: iconst_m1
    //   96: istore #9
    //   98: aload_2
    //   99: instanceof java/lang/CharSequence
    //   102: ifeq -> 171
    //   105: aload #4
    //   107: ifnull -> 171
    //   110: aload #14
    //   112: aload_2
    //   113: if_acmpne -> 144
    //   116: aload_0
    //   117: getfield a : Lnet/time4j/e1/a0/h;
    //   120: astore #15
    //   122: aload #15
    //   124: instanceof net/time4j/e1/a0/f
    //   127: ifne -> 138
    //   130: aload #15
    //   132: instanceof net/time4j/e1/a0/z
    //   135: ifeq -> 144
    //   138: iconst_0
    //   139: istore #7
    //   141: goto -> 155
    //   144: aload_2
    //   145: checkcast java/lang/CharSequence
    //   148: invokeinterface length : ()I
    //   153: istore #7
    //   155: new java/util/LinkedHashSet
    //   158: dup
    //   159: invokespecial <init> : ()V
    //   162: astore #15
    //   164: iload #7
    //   166: istore #10
    //   168: goto -> 174
    //   171: iconst_m1
    //   172: istore #10
    //   174: aload_0
    //   175: aload_3
    //   176: invokespecial c : (Lnet/time4j/d1/d;)Z
    //   179: istore #13
    //   181: aload_0
    //   182: aload_3
    //   183: invokespecial a : (Lnet/time4j/d1/d;)C
    //   186: istore #6
    //   188: aload #14
    //   190: invokevirtual length : ()I
    //   193: istore #7
    //   195: aload_0
    //   196: getfield a : Lnet/time4j/e1/a0/h;
    //   199: aload_1
    //   200: aload #14
    //   202: aload_3
    //   203: aload #15
    //   205: iload #5
    //   207: invokeinterface a : (Lnet/time4j/d1/o;Ljava/lang/Appendable;Lnet/time4j/d1/d;Ljava/util/Set;Z)I
    //   212: pop
    //   213: aload #14
    //   215: invokevirtual length : ()I
    //   218: iload #7
    //   220: isub
    //   221: istore #8
    //   223: aload_0
    //   224: getfield g : I
    //   227: istore #7
    //   229: iload #7
    //   231: ifle -> 506
    //   234: iload #13
    //   236: ifeq -> 261
    //   239: iload #8
    //   241: iload #7
    //   243: if_icmpgt -> 249
    //   246: goto -> 261
    //   249: new java/lang/IllegalArgumentException
    //   252: dup
    //   253: aload_0
    //   254: invokespecial i : ()Ljava/lang/String;
    //   257: invokespecial <init> : (Ljava/lang/String;)V
    //   260: athrow
    //   261: iload #8
    //   263: istore #7
    //   265: iconst_0
    //   266: istore #11
    //   268: iload #7
    //   270: aload_0
    //   271: getfield g : I
    //   274: if_icmpge -> 320
    //   277: iload #9
    //   279: iconst_m1
    //   280: if_icmpne -> 295
    //   283: aload_2
    //   284: iload #6
    //   286: invokeinterface append : (C)Ljava/lang/Appendable;
    //   291: pop
    //   292: goto -> 305
    //   295: aload #14
    //   297: iload #9
    //   299: iload #6
    //   301: invokevirtual insert : (IC)Ljava/lang/StringBuilder;
    //   304: pop
    //   305: iload #7
    //   307: iconst_1
    //   308: iadd
    //   309: istore #7
    //   311: iload #11
    //   313: iconst_1
    //   314: iadd
    //   315: istore #11
    //   317: goto -> 268
    //   320: iload #9
    //   322: iconst_m1
    //   323: if_icmpne -> 335
    //   326: aload_2
    //   327: aload #14
    //   329: invokeinterface append : (Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    //   334: pop
    //   335: iload #10
    //   337: iconst_m1
    //   338: if_icmpeq -> 411
    //   341: iload #10
    //   343: iload #11
    //   345: iadd
    //   346: istore #9
    //   348: aload #15
    //   350: invokeinterface iterator : ()Ljava/util/Iterator;
    //   355: astore_1
    //   356: aload_1
    //   357: invokeinterface hasNext : ()Z
    //   362: ifeq -> 411
    //   365: aload_1
    //   366: invokeinterface next : ()Ljava/lang/Object;
    //   371: checkcast net/time4j/e1/a0/g
    //   374: astore_3
    //   375: aload #4
    //   377: new net/time4j/e1/a0/g
    //   380: dup
    //   381: aload_3
    //   382: invokevirtual a : ()Lnet/time4j/d1/p;
    //   385: aload_3
    //   386: invokevirtual c : ()I
    //   389: iload #9
    //   391: iadd
    //   392: aload_3
    //   393: invokevirtual b : ()I
    //   396: iload #9
    //   398: iadd
    //   399: invokespecial <init> : (Lnet/time4j/d1/p;II)V
    //   402: invokeinterface add : (Ljava/lang/Object;)Z
    //   407: pop
    //   408: goto -> 356
    //   411: aload_0
    //   412: getfield h : I
    //   415: istore #12
    //   417: iload #7
    //   419: istore #9
    //   421: iload #12
    //   423: ifle -> 658
    //   426: iload #8
    //   428: istore #11
    //   430: iload #7
    //   432: istore #10
    //   434: iload #13
    //   436: ifeq -> 469
    //   439: iload #8
    //   441: iload #12
    //   443: if_icmpgt -> 457
    //   446: iload #8
    //   448: istore #11
    //   450: iload #7
    //   452: istore #10
    //   454: goto -> 469
    //   457: new java/lang/IllegalArgumentException
    //   460: dup
    //   461: aload_0
    //   462: invokespecial i : ()Ljava/lang/String;
    //   465: invokespecial <init> : (Ljava/lang/String;)V
    //   468: athrow
    //   469: iload #10
    //   471: istore #9
    //   473: iload #11
    //   475: aload_0
    //   476: getfield h : I
    //   479: if_icmpge -> 658
    //   482: aload_2
    //   483: iload #6
    //   485: invokeinterface append : (C)Ljava/lang/Appendable;
    //   490: pop
    //   491: iload #11
    //   493: iconst_1
    //   494: iadd
    //   495: istore #11
    //   497: iload #10
    //   499: iconst_1
    //   500: iadd
    //   501: istore #10
    //   503: goto -> 469
    //   506: iload #13
    //   508: ifeq -> 535
    //   511: iload #8
    //   513: aload_0
    //   514: getfield h : I
    //   517: if_icmpgt -> 523
    //   520: goto -> 535
    //   523: new java/lang/IllegalArgumentException
    //   526: dup
    //   527: aload_0
    //   528: invokespecial i : ()Ljava/lang/String;
    //   531: invokespecial <init> : (Ljava/lang/String;)V
    //   534: athrow
    //   535: iload #9
    //   537: iconst_m1
    //   538: if_icmpne -> 550
    //   541: aload_2
    //   542: aload #14
    //   544: invokeinterface append : (Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    //   549: pop
    //   550: iload #8
    //   552: istore #7
    //   554: iload #7
    //   556: aload_0
    //   557: getfield h : I
    //   560: if_icmpge -> 581
    //   563: aload_2
    //   564: iload #6
    //   566: invokeinterface append : (C)Ljava/lang/Appendable;
    //   571: pop
    //   572: iload #7
    //   574: iconst_1
    //   575: iadd
    //   576: istore #7
    //   578: goto -> 554
    //   581: iload #7
    //   583: istore #9
    //   585: iload #10
    //   587: iconst_m1
    //   588: if_icmpeq -> 658
    //   591: aload #15
    //   593: invokeinterface iterator : ()Ljava/util/Iterator;
    //   598: astore_1
    //   599: iload #7
    //   601: istore #9
    //   603: aload_1
    //   604: invokeinterface hasNext : ()Z
    //   609: ifeq -> 658
    //   612: aload_1
    //   613: invokeinterface next : ()Ljava/lang/Object;
    //   618: checkcast net/time4j/e1/a0/g
    //   621: astore_2
    //   622: aload #4
    //   624: new net/time4j/e1/a0/g
    //   627: dup
    //   628: aload_2
    //   629: invokevirtual a : ()Lnet/time4j/d1/p;
    //   632: aload_2
    //   633: invokevirtual c : ()I
    //   636: iload #10
    //   638: iadd
    //   639: aload_2
    //   640: invokevirtual b : ()I
    //   643: iload #10
    //   645: iadd
    //   646: invokespecial <init> : (Lnet/time4j/d1/p;II)V
    //   649: invokeinterface add : (Ljava/lang/Object;)Z
    //   654: pop
    //   655: goto -> 599
    //   658: iload #9
    //   660: ireturn
  }
  
  i a(int paramInt) {
    if (this.i)
      return new i(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, true, paramInt); 
    throw new IllegalStateException("This step is not starting an or-block.");
  }
  
  i a(int paramInt1, int paramInt2) {
    return new i(this.a, this.b, this.c, this.d, null, this.f, this.g + paramInt1, this.h + paramInt2, this.i, this.j);
  }
  
  i a(p<?> paramp) {
    h<?> h1 = a(this.a, paramp);
    return (this.a == h1) ? this : new i(h1, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
  }
  
  i a(c<?> paramc) {
    b b2 = paramc.b();
    b b1 = b2;
    if (this.d != null) {
      a.b b3 = new a.b();
      b3.a(b2.a());
      b3.a(this.d.a());
      b1 = b2.a(b3.a());
    } 
    return new i(this.a.a(paramc, b1, this.f), this.b, this.c, this.d, b1, this.f, this.g, this.h, this.i, this.j);
  }
  
  void a(CharSequence paramCharSequence, s params, d paramd, t<?> paramt, boolean paramBoolean) {
    if (paramBoolean) {
      paramd = this.e;
    } else {
      paramd = b(paramd);
    } 
    if (this.g == 0 && this.h == 0) {
      b(paramCharSequence, params, paramd, paramt, paramBoolean);
      return;
    } 
    boolean bool = c(paramd);
    char c = a(paramd);
    int k = params.f();
    int n = paramCharSequence.length();
    int j;
    for (j = k; j < n && paramCharSequence.charAt(j) == c; j++);
    int m = j - k;
    if (bool && m > this.g) {
      params.a(k, i());
      return;
    } 
    params.a(j);
    b(paramCharSequence, params, paramd, paramt, paramBoolean);
    if (params.i())
      return; 
    j = params.f();
    int i1 = j - k - m;
    if (bool) {
      int i2 = this.g;
      if (i2 > 0 && m + i1 != i2) {
        params.a(k, j());
        return;
      } 
    } 
    m = 0;
    k = j;
    for (j = m; k < n && (!bool || i1 + j < this.h) && paramCharSequence.charAt(k) == c; j++)
      k++; 
    if (bool) {
      m = this.h;
      if (m > 0 && i1 + j != m) {
        params.a(k - j, j());
        return;
      } 
    } 
    params.a(k);
  }
  
  h<?> b() {
    return this.a;
  }
  
  i b(int paramInt) {
    return new i(this.a, this.b, this.c, this.d, null, this.f + paramInt, this.g, this.h, this.i, this.j);
  }
  
  int c() {
    return this.c;
  }
  
  boolean d() {
    return !!(this.a instanceof j);
  }
  
  boolean e() {
    return this.i;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof i) {
      paramObject = paramObject;
      return (this.a.equals(((i)paramObject).a) && this.b == ((i)paramObject).b && this.c == ((i)paramObject).c && a(this.d, ((i)paramObject).d) && a(this.e, ((i)paramObject).e) && this.f == ((i)paramObject).f && this.g == ((i)paramObject).g && this.h == ((i)paramObject).h && this.i == ((i)paramObject).i && this.j == ((i)paramObject).j);
    } 
    return false;
  }
  
  boolean f() {
    return this.a.a();
  }
  
  int g() {
    return this.j;
  }
  
  i h() {
    if (!this.i)
      return new i(this.a, this.b, this.c, this.d, null, this.f, this.g, this.h, true, -1); 
    throw new IllegalStateException("Cannot start or-block twice.");
  }
  
  public int hashCode() {
    int j;
    int k = this.a.hashCode();
    b b1 = this.d;
    if (b1 == null) {
      j = 0;
    } else {
      j = b1.hashCode();
    } 
    return k * 7 + j * 31;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("[processor=");
    stringBuilder.append(this.a);
    stringBuilder.append(", level=");
    stringBuilder.append(this.b);
    stringBuilder.append(", section=");
    stringBuilder.append(this.c);
    if (this.d != null) {
      stringBuilder.append(", attributes=");
      stringBuilder.append(this.d);
    } 
    stringBuilder.append(", reserved=");
    stringBuilder.append(this.f);
    stringBuilder.append(", pad-left=");
    stringBuilder.append(this.g);
    stringBuilder.append(", pad-right=");
    stringBuilder.append(this.h);
    if (this.i)
      stringBuilder.append(", or-block-started"); 
    stringBuilder.append(']');
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/e1/a0/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */