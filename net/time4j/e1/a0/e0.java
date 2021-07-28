package net.time4j.e1.a0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import net.time4j.d1.d;
import net.time4j.d1.o;
import net.time4j.d1.p;
import net.time4j.e1.a;
import net.time4j.e1.e;
import net.time4j.e1.g;
import net.time4j.tz.f;
import net.time4j.tz.k;
import net.time4j.tz.p;

final class e0 implements h<k> {
  static final e0 h = new e0();
  
  private final e c;
  
  private final boolean d;
  
  private final List<String> e;
  
  private final boolean f;
  
  private final g g;
  
  private e0() {
    this.c = e.e;
    this.d = true;
    this.e = Collections.emptyList();
    this.f = true;
    this.g = g.d;
  }
  
  e0(e parame, boolean paramBoolean, List<String> paramList) {
    if (parame != null) {
      if (!paramList.isEmpty()) {
        paramList = new ArrayList<String>(paramList);
        Iterator<String> iterator = paramList.iterator();
        while (iterator.hasNext()) {
          if (!((String)iterator.next()).trim().isEmpty())
            continue; 
          throw new IllegalArgumentException("Zero offset must not be white-space-only.");
        } 
        this.c = parame;
        this.d = paramBoolean;
        this.e = Collections.unmodifiableList(paramList);
        this.f = true;
        this.g = g.d;
        return;
      } 
      throw new IllegalArgumentException("Missing zero offsets.");
    } 
    NullPointerException nullPointerException = new NullPointerException("Missing display mode.");
    throw nullPointerException;
  }
  
  private e0(e parame, boolean paramBoolean1, List<String> paramList, boolean paramBoolean2, g paramg) {
    this.c = parame;
    this.d = paramBoolean1;
    this.e = paramList;
    this.f = paramBoolean2;
    this.g = paramg;
  }
  
  private static int a(CharSequence paramCharSequence, int paramInt, g paramg) {
    int i = 0;
    int j = 0;
    while (i < 2) {
      int k = paramInt + i;
      if (k >= paramCharSequence.length()) {
        k = 0;
      } else {
        k = paramCharSequence.charAt(k);
      } 
      if (k >= 48 && k <= 57) {
        j = j * 10 + k - 48;
        i++;
        continue;
      } 
      return (i == 0 || paramg.c()) ? -1000 : (j ^ 0xFFFFFFFF);
    } 
    return j;
  }
  
  private static p a(o paramo, d paramd) {
    if (paramd.b(a.d)) {
      k k = (k)paramd.a(a.d);
      if (k instanceof p)
        return (p)k; 
      if (k != null) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("Use a timezone offset instead of [");
        stringBuilder1.append(k.a());
        stringBuilder1.append("] when formatting [");
        stringBuilder1.append(paramo);
        stringBuilder1.append("].");
        throw new IllegalArgumentException(stringBuilder1.toString());
      } 
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Cannot extract timezone offset from format attributes for: ");
    stringBuilder.append(paramo);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public int a(o paramo, Appendable paramAppendable, d paramd, Set<g> paramSet, boolean paramBoolean) {
    // Byte code:
    //   0: aload_2
    //   1: instanceof java/lang/CharSequence
    //   4: ifeq -> 21
    //   7: aload_2
    //   8: checkcast java/lang/CharSequence
    //   11: invokeinterface length : ()I
    //   16: istore #8
    //   18: goto -> 24
    //   21: iconst_m1
    //   22: istore #8
    //   24: aconst_null
    //   25: astore #15
    //   27: aload_1
    //   28: invokeinterface d : ()Z
    //   33: ifeq -> 44
    //   36: aload_1
    //   37: invokeinterface c : ()Lnet/time4j/tz/k;
    //   42: astore #15
    //   44: aload #15
    //   46: ifnonnull -> 58
    //   49: aload_1
    //   50: aload_3
    //   51: invokestatic a : (Lnet/time4j/d1/o;Lnet/time4j/d1/d;)Lnet/time4j/tz/p;
    //   54: astore_1
    //   55: goto -> 95
    //   58: aload #15
    //   60: instanceof net/time4j/tz/p
    //   63: ifeq -> 75
    //   66: aload #15
    //   68: checkcast net/time4j/tz/p
    //   71: astore_1
    //   72: goto -> 95
    //   75: aload_1
    //   76: instanceof net/time4j/c1/f
    //   79: ifeq -> 635
    //   82: aload #15
    //   84: invokestatic a : (Lnet/time4j/tz/k;)Lnet/time4j/tz/l;
    //   87: aload_1
    //   88: checkcast net/time4j/c1/f
    //   91: invokevirtual b : (Lnet/time4j/c1/f;)Lnet/time4j/tz/p;
    //   94: astore_1
    //   95: aload_1
    //   96: invokevirtual r : ()I
    //   99: istore #12
    //   101: aload_1
    //   102: invokevirtual q : ()I
    //   105: istore #11
    //   107: iconst_0
    //   108: istore #10
    //   110: iload #12
    //   112: iload #11
    //   114: ior
    //   115: ifne -> 149
    //   118: aload_0
    //   119: getfield e : Ljava/util/List;
    //   122: iconst_0
    //   123: invokeinterface get : (I)Ljava/lang/Object;
    //   128: checkcast java/lang/String
    //   131: astore_1
    //   132: aload_2
    //   133: aload_1
    //   134: invokeinterface append : (Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    //   139: pop
    //   140: aload_1
    //   141: invokevirtual length : ()I
    //   144: istore #7
    //   146: goto -> 591
    //   149: iconst_1
    //   150: istore #9
    //   152: iload #12
    //   154: iflt -> 171
    //   157: iload #11
    //   159: ifge -> 165
    //   162: goto -> 171
    //   165: iconst_0
    //   166: istore #7
    //   168: goto -> 174
    //   171: iconst_1
    //   172: istore #7
    //   174: iload #7
    //   176: ifeq -> 186
    //   179: bipush #45
    //   181: istore #6
    //   183: goto -> 190
    //   186: bipush #43
    //   188: istore #6
    //   190: aload_2
    //   191: iload #6
    //   193: invokeinterface append : (C)Ljava/lang/Appendable;
    //   198: pop
    //   199: iload #12
    //   201: invokestatic abs : (I)I
    //   204: istore #7
    //   206: iload #7
    //   208: sipush #3600
    //   211: idiv
    //   212: istore #14
    //   214: iload #7
    //   216: bipush #60
    //   218: idiv
    //   219: bipush #60
    //   221: irem
    //   222: istore #13
    //   224: iload #7
    //   226: bipush #60
    //   228: irem
    //   229: istore #12
    //   231: iload #9
    //   233: istore #7
    //   235: iload #14
    //   237: bipush #10
    //   239: if_icmpge -> 254
    //   242: aload_2
    //   243: bipush #48
    //   245: invokeinterface append : (C)Ljava/lang/Appendable;
    //   250: pop
    //   251: iconst_2
    //   252: istore #7
    //   254: iload #14
    //   256: invokestatic valueOf : (I)Ljava/lang/String;
    //   259: astore_1
    //   260: aload_2
    //   261: aload_1
    //   262: invokeinterface append : (Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    //   267: pop
    //   268: iload #7
    //   270: aload_1
    //   271: invokevirtual length : ()I
    //   274: iadd
    //   275: istore #9
    //   277: aload_0
    //   278: getfield c : Lnet/time4j/e1/e;
    //   281: getstatic net/time4j/e1/e.g : Lnet/time4j/e1/e;
    //   284: if_acmpne -> 302
    //   287: iload #9
    //   289: istore #7
    //   291: iload #13
    //   293: ifeq -> 299
    //   296: goto -> 302
    //   299: goto -> 591
    //   302: iload #9
    //   304: istore #7
    //   306: aload_0
    //   307: getfield d : Z
    //   310: ifeq -> 328
    //   313: aload_2
    //   314: bipush #58
    //   316: invokeinterface append : (C)Ljava/lang/Appendable;
    //   321: pop
    //   322: iload #9
    //   324: iconst_1
    //   325: iadd
    //   326: istore #7
    //   328: iload #7
    //   330: istore #9
    //   332: iload #13
    //   334: bipush #10
    //   336: if_icmpge -> 354
    //   339: aload_2
    //   340: bipush #48
    //   342: invokeinterface append : (C)Ljava/lang/Appendable;
    //   347: pop
    //   348: iload #7
    //   350: iconst_1
    //   351: iadd
    //   352: istore #9
    //   354: iload #13
    //   356: invokestatic valueOf : (I)Ljava/lang/String;
    //   359: astore_1
    //   360: aload_2
    //   361: aload_1
    //   362: invokeinterface append : (Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    //   367: pop
    //   368: iload #9
    //   370: aload_1
    //   371: invokevirtual length : ()I
    //   374: iadd
    //   375: istore #9
    //   377: aload_0
    //   378: getfield c : Lnet/time4j/e1/e;
    //   381: astore_1
    //   382: iload #9
    //   384: istore #7
    //   386: aload_1
    //   387: getstatic net/time4j/e1/e.g : Lnet/time4j/e1/e;
    //   390: if_acmpeq -> 299
    //   393: iload #9
    //   395: istore #7
    //   397: aload_1
    //   398: getstatic net/time4j/e1/e.f : Lnet/time4j/e1/e;
    //   401: if_acmpeq -> 299
    //   404: aload_1
    //   405: getstatic net/time4j/e1/e.d : Lnet/time4j/e1/e;
    //   408: if_acmpeq -> 423
    //   411: iload #9
    //   413: istore #7
    //   415: iload #12
    //   417: iload #11
    //   419: ior
    //   420: ifeq -> 299
    //   423: iload #9
    //   425: istore #7
    //   427: aload_0
    //   428: getfield d : Z
    //   431: ifeq -> 449
    //   434: aload_2
    //   435: bipush #58
    //   437: invokeinterface append : (C)Ljava/lang/Appendable;
    //   442: pop
    //   443: iload #9
    //   445: iconst_1
    //   446: iadd
    //   447: istore #7
    //   449: iload #7
    //   451: istore #9
    //   453: iload #12
    //   455: bipush #10
    //   457: if_icmpge -> 475
    //   460: aload_2
    //   461: bipush #48
    //   463: invokeinterface append : (C)Ljava/lang/Appendable;
    //   468: pop
    //   469: iload #7
    //   471: iconst_1
    //   472: iadd
    //   473: istore #9
    //   475: iload #12
    //   477: invokestatic valueOf : (I)Ljava/lang/String;
    //   480: astore_1
    //   481: aload_2
    //   482: aload_1
    //   483: invokeinterface append : (Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    //   488: pop
    //   489: aload_1
    //   490: invokevirtual length : ()I
    //   493: iload #9
    //   495: iadd
    //   496: istore #7
    //   498: iload #11
    //   500: ifeq -> 591
    //   503: aload_2
    //   504: bipush #46
    //   506: invokeinterface append : (C)Ljava/lang/Appendable;
    //   511: pop
    //   512: iload #7
    //   514: iconst_1
    //   515: iadd
    //   516: istore #9
    //   518: iload #11
    //   520: invokestatic abs : (I)I
    //   523: invokestatic valueOf : (I)Ljava/lang/String;
    //   526: astore_1
    //   527: aload_1
    //   528: invokevirtual length : ()I
    //   531: istore #11
    //   533: iload #10
    //   535: istore #7
    //   537: iload #7
    //   539: bipush #9
    //   541: iload #11
    //   543: isub
    //   544: if_icmpge -> 571
    //   547: aload_2
    //   548: bipush #48
    //   550: invokeinterface append : (C)Ljava/lang/Appendable;
    //   555: pop
    //   556: iload #9
    //   558: iconst_1
    //   559: iadd
    //   560: istore #9
    //   562: iload #7
    //   564: iconst_1
    //   565: iadd
    //   566: istore #7
    //   568: goto -> 537
    //   571: aload_2
    //   572: aload_1
    //   573: invokeinterface append : (Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    //   578: pop
    //   579: aload_1
    //   580: invokevirtual length : ()I
    //   583: iload #9
    //   585: iadd
    //   586: istore #7
    //   588: goto -> 591
    //   591: iload #8
    //   593: iconst_m1
    //   594: if_icmpeq -> 632
    //   597: iload #7
    //   599: ifle -> 632
    //   602: aload #4
    //   604: ifnull -> 632
    //   607: aload #4
    //   609: new net/time4j/e1/a0/g
    //   612: dup
    //   613: getstatic net/time4j/e1/a0/b0.c : Lnet/time4j/e1/a0/b0;
    //   616: iload #8
    //   618: iload #8
    //   620: iload #7
    //   622: iadd
    //   623: invokespecial <init> : (Lnet/time4j/d1/p;II)V
    //   626: invokeinterface add : (Ljava/lang/Object;)Z
    //   631: pop
    //   632: iload #7
    //   634: ireturn
    //   635: new java/lang/StringBuilder
    //   638: dup
    //   639: invokespecial <init> : ()V
    //   642: astore_2
    //   643: aload_2
    //   644: ldc 'Cannot extract timezone offset from: '
    //   646: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   649: pop
    //   650: aload_2
    //   651: aload_1
    //   652: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   655: pop
    //   656: new java/lang/IllegalArgumentException
    //   659: dup
    //   660: aload_2
    //   661: invokevirtual toString : ()Ljava/lang/String;
    //   664: invokespecial <init> : (Ljava/lang/String;)V
    //   667: astore_1
    //   668: goto -> 673
    //   671: aload_1
    //   672: athrow
    //   673: goto -> 671
  }
  
  public h<k> a(p<k> paramp) {
    return this;
  }
  
  public h<k> a(c<?> paramc, d paramd, int paramInt) {
    return new e0(this.c, this.d, this.e, ((Boolean)paramd.a(a.i, Boolean.TRUE)).booleanValue(), (g)paramd.a(a.f, g.d));
  }
  
  public void a(CharSequence paramCharSequence, s params, d paramd, t<?> paramt, boolean paramBoolean) {
    g g1;
    int k = paramCharSequence.length();
    int i = params.f();
    if (i >= k) {
      params.a(i, "Missing timezone offset.");
      return;
    } 
    for (String str : this.e) {
      int m = str.length();
      if (k - i >= m) {
        boolean bool;
        m += i;
        String str1 = paramCharSequence.subSequence(i, m).toString();
        if (paramBoolean) {
          bool = this.f;
        } else {
          bool = ((Boolean)paramd.a(a.i, Boolean.TRUE)).booleanValue();
        } 
        if ((bool && str1.equalsIgnoreCase(str)) || (!bool && str1.equals(str))) {
          paramt.c(b0.d, p.m);
          params.a(m);
          return;
        } 
      } 
    } 
    if (paramBoolean) {
      g1 = this.g;
    } else {
      g1 = (g)paramd.a(a.f, g.d);
    } 
    char c = paramCharSequence.charAt(i);
    if (c == '+') {
      f f = f.d;
    } else if (c == '-') {
      f f = f.c;
    } else {
      if (Character.isDigit(c) && g1.a()) {
        f f = f.d;
      } else {
        params.a(i, "Missing sign of timezone offset.");
        return;
      } 
      int m = a(paramCharSequence, i, g1);
    } 
    int j = a(paramCharSequence, ++i, g1);
  }
  
  public boolean a() {
    return false;
  }
  
  public p<k> b() {
    return b0.d;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof e0) {
      paramObject = paramObject;
      return (this.c == ((e0)paramObject).c && this.d == ((e0)paramObject).d && this.e.equals(((e0)paramObject).e));
    } 
    return false;
  }
  
  public int hashCode() {
    throw new RuntimeException("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:632)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder(64);
    stringBuilder.append(e0.class.getName());
    stringBuilder.append("[precision=");
    stringBuilder.append(this.c);
    stringBuilder.append(", extended=");
    stringBuilder.append(this.d);
    stringBuilder.append(", zero-offsets=");
    stringBuilder.append(this.e);
    stringBuilder.append(']');
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/e1/a0/e0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */