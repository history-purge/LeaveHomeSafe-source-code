package net.time4j.calendar;

import java.io.Serializable;
import java.text.ParsePosition;
import java.util.Locale;
import net.time4j.b0;
import net.time4j.d1.d;
import net.time4j.d1.o;
import net.time4j.d1.p;
import net.time4j.e1.a;
import net.time4j.e1.b;
import net.time4j.e1.b0.a;
import net.time4j.e1.j;
import net.time4j.e1.m;
import net.time4j.e1.t;
import net.time4j.e1.u;
import net.time4j.e1.w;

class g implements u<h>, Serializable {
  static final g c = new g();
  
  private static final long serialVersionUID = -5874268477318061153L;
  
  public char a() {
    return 'M';
  }
  
  public int a(o paramo1, o paramo2) {
    return ((h)paramo1.e((p)this)).a((h)paramo2.e((p)this));
  }
  
  public h a(CharSequence paramCharSequence, ParsePosition paramParsePosition, d paramd) {
    // Byte code:
    //   0: aload_3
    //   1: getstatic net/time4j/e1/a.c : Lnet/time4j/d1/c;
    //   4: getstatic java/util/Locale.ROOT : Ljava/util/Locale;
    //   7: invokeinterface a : (Lnet/time4j/d1/c;Ljava/lang/Object;)Ljava/lang/Object;
    //   12: checkcast java/util/Locale
    //   15: astore #18
    //   17: aload_1
    //   18: invokeinterface length : ()I
    //   23: istore #11
    //   25: aload_2
    //   26: invokevirtual getIndex : ()I
    //   29: istore #10
    //   31: iload #10
    //   33: iload #11
    //   35: if_icmplt -> 46
    //   38: aload_2
    //   39: iload #11
    //   41: invokevirtual setErrorIndex : (I)V
    //   44: aconst_null
    //   45: areturn
    //   46: aload_3
    //   47: getstatic net/time4j/e1/b0/a.b : Lnet/time4j/d1/c;
    //   50: invokeinterface b : (Lnet/time4j/d1/c;)Z
    //   55: ifeq -> 470
    //   58: ldc 'generic'
    //   60: aload #18
    //   62: invokestatic a : (Ljava/lang/String;Ljava/util/Locale;)Lnet/time4j/e1/b;
    //   65: invokevirtual a : ()Ljava/util/Map;
    //   68: astore #17
    //   70: aload_3
    //   71: getstatic net/time4j/e1/a.l : Lnet/time4j/d1/c;
    //   74: getstatic net/time4j/e1/j.c : Lnet/time4j/e1/j;
    //   77: invokeinterface a : (Lnet/time4j/d1/c;Ljava/lang/Object;)Ljava/lang/Object;
    //   82: checkcast net/time4j/e1/j
    //   85: astore #16
    //   87: aload_3
    //   88: getstatic net/time4j/e1/a.m : Lnet/time4j/d1/c;
    //   91: aload #16
    //   93: invokevirtual a : ()Ljava/lang/String;
    //   96: iconst_0
    //   97: invokevirtual charAt : (I)C
    //   100: invokestatic valueOf : (C)Ljava/lang/Character;
    //   103: invokeinterface a : (Lnet/time4j/d1/c;Ljava/lang/Object;)Ljava/lang/Object;
    //   108: checkcast java/lang/Character
    //   111: invokevirtual charValue : ()C
    //   114: istore #4
    //   116: aload_3
    //   117: getstatic net/time4j/calendar/h.d : Lnet/time4j/d1/c;
    //   120: ldc 'R'
    //   122: aload #17
    //   124: ldc 'leap-alignment'
    //   126: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   131: invokevirtual equals : (Ljava/lang/Object;)Z
    //   134: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   137: invokeinterface a : (Lnet/time4j/d1/c;Ljava/lang/Object;)Ljava/lang/Object;
    //   142: checkcast java/lang/Boolean
    //   145: invokevirtual booleanValue : ()Z
    //   148: istore #15
    //   150: aload_3
    //   151: getstatic net/time4j/calendar/h.c : Lnet/time4j/d1/c;
    //   154: aload #17
    //   156: ldc 'leap-indicator'
    //   158: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   163: checkcast java/lang/String
    //   166: iconst_0
    //   167: invokevirtual charAt : (I)C
    //   170: invokestatic valueOf : (C)Ljava/lang/Character;
    //   173: invokeinterface a : (Lnet/time4j/d1/c;Ljava/lang/Object;)Ljava/lang/Object;
    //   178: checkcast java/lang/Character
    //   181: invokevirtual charValue : ()C
    //   184: istore #12
    //   186: iload #15
    //   188: ifne -> 216
    //   191: aload_1
    //   192: iload #10
    //   194: invokeinterface charAt : (I)C
    //   199: iload #12
    //   201: if_icmpne -> 216
    //   204: iload #10
    //   206: iconst_1
    //   207: iadd
    //   208: istore #5
    //   210: iconst_1
    //   211: istore #6
    //   213: goto -> 223
    //   216: iload #10
    //   218: istore #5
    //   220: iconst_0
    //   221: istore #6
    //   223: iload #5
    //   225: istore #7
    //   227: aload #16
    //   229: invokevirtual b : ()Z
    //   232: ifeq -> 272
    //   235: iload #5
    //   237: istore #7
    //   239: iload #5
    //   241: iload #11
    //   243: if_icmpge -> 272
    //   246: iload #5
    //   248: istore #7
    //   250: aload_1
    //   251: iload #5
    //   253: invokeinterface charAt : (I)C
    //   258: iload #4
    //   260: if_icmpne -> 272
    //   263: iload #5
    //   265: iconst_1
    //   266: iadd
    //   267: istore #5
    //   269: goto -> 235
    //   272: bipush #12
    //   274: istore #5
    //   276: iconst_0
    //   277: istore #8
    //   279: aload #16
    //   281: astore_3
    //   282: iload #5
    //   284: iconst_1
    //   285: if_icmplt -> 384
    //   288: iload #8
    //   290: ifne -> 384
    //   293: aload_3
    //   294: iload #4
    //   296: iload #5
    //   298: invokestatic a : (Lnet/time4j/e1/j;CI)Ljava/lang/String;
    //   301: astore #16
    //   303: aload #16
    //   305: invokevirtual length : ()I
    //   308: istore #13
    //   310: iconst_0
    //   311: istore #9
    //   313: iload #7
    //   315: iload #9
    //   317: iadd
    //   318: istore #14
    //   320: iload #11
    //   322: iload #14
    //   324: if_icmple -> 348
    //   327: aload_1
    //   328: iload #14
    //   330: invokeinterface charAt : (I)C
    //   335: aload #16
    //   337: iload #9
    //   339: invokevirtual charAt : (I)C
    //   342: if_icmpeq -> 348
    //   345: goto -> 372
    //   348: iload #9
    //   350: iconst_1
    //   351: iadd
    //   352: istore #9
    //   354: iload #9
    //   356: iload #13
    //   358: if_icmpne -> 381
    //   361: iload #7
    //   363: iload #13
    //   365: iadd
    //   366: istore #7
    //   368: iload #5
    //   370: istore #8
    //   372: iload #5
    //   374: iconst_1
    //   375: isub
    //   376: istore #5
    //   378: goto -> 282
    //   381: goto -> 313
    //   384: iload #8
    //   386: ifne -> 397
    //   389: aload_2
    //   390: iload #10
    //   392: invokevirtual setErrorIndex : (I)V
    //   395: aconst_null
    //   396: areturn
    //   397: iload #6
    //   399: istore #5
    //   401: iload #7
    //   403: istore #9
    //   405: iload #15
    //   407: ifeq -> 455
    //   410: iload #6
    //   412: istore #5
    //   414: iload #7
    //   416: istore #9
    //   418: iload #11
    //   420: iload #7
    //   422: if_icmple -> 455
    //   425: iload #6
    //   427: istore #5
    //   429: iload #7
    //   431: istore #9
    //   433: aload_1
    //   434: iload #7
    //   436: invokeinterface charAt : (I)C
    //   441: iload #12
    //   443: if_icmpne -> 455
    //   446: iload #7
    //   448: iconst_1
    //   449: iadd
    //   450: istore #9
    //   452: iconst_1
    //   453: istore #5
    //   455: iload #8
    //   457: invokestatic f : (I)Lnet/time4j/calendar/h;
    //   460: astore_1
    //   461: aload_2
    //   462: iload #9
    //   464: invokevirtual setIndex : (I)V
    //   467: goto -> 611
    //   470: aload_3
    //   471: getstatic net/time4j/e1/a.g : Lnet/time4j/d1/c;
    //   474: getstatic net/time4j/e1/w.c : Lnet/time4j/e1/w;
    //   477: invokeinterface a : (Lnet/time4j/d1/c;Ljava/lang/Object;)Ljava/lang/Object;
    //   482: checkcast net/time4j/e1/w
    //   485: astore #19
    //   487: aload_3
    //   488: getstatic net/time4j/e1/a.h : Lnet/time4j/d1/c;
    //   491: getstatic net/time4j/e1/m.c : Lnet/time4j/e1/m;
    //   494: invokeinterface a : (Lnet/time4j/d1/c;Ljava/lang/Object;)Ljava/lang/Object;
    //   499: checkcast net/time4j/e1/m
    //   502: astore #20
    //   504: ldc 'chinese'
    //   506: aload #18
    //   508: invokestatic a : (Ljava/lang/String;Ljava/util/Locale;)Lnet/time4j/e1/b;
    //   511: aload #19
    //   513: aload #20
    //   515: invokevirtual d : (Lnet/time4j/e1/w;Lnet/time4j/e1/m;)Lnet/time4j/e1/t;
    //   518: aload_1
    //   519: aload_2
    //   520: ldc net/time4j/b0
    //   522: aload_3
    //   523: invokevirtual a : (Ljava/lang/CharSequence;Ljava/text/ParsePosition;Ljava/lang/Class;Lnet/time4j/d1/d;)Ljava/lang/Enum;
    //   526: checkcast net/time4j/b0
    //   529: astore #17
    //   531: aload #17
    //   533: astore #16
    //   535: aload #17
    //   537: ifnonnull -> 590
    //   540: aload_2
    //   541: iconst_m1
    //   542: invokevirtual setErrorIndex : (I)V
    //   545: aload_2
    //   546: iload #10
    //   548: invokevirtual setIndex : (I)V
    //   551: ldc 'chinese'
    //   553: aload #18
    //   555: invokestatic a : (Ljava/lang/String;Ljava/util/Locale;)Lnet/time4j/e1/b;
    //   558: aload #19
    //   560: aload #20
    //   562: invokevirtual a : (Lnet/time4j/e1/w;Lnet/time4j/e1/m;)Lnet/time4j/e1/t;
    //   565: aload_1
    //   566: aload_2
    //   567: ldc net/time4j/b0
    //   569: aload_3
    //   570: invokevirtual a : (Ljava/lang/CharSequence;Ljava/text/ParsePosition;Ljava/lang/Class;Lnet/time4j/d1/d;)Ljava/lang/Enum;
    //   573: checkcast net/time4j/b0
    //   576: astore_1
    //   577: aload_1
    //   578: astore #16
    //   580: aload_1
    //   581: ifnull -> 590
    //   584: iconst_1
    //   585: istore #5
    //   587: goto -> 596
    //   590: iconst_0
    //   591: istore #5
    //   593: aload #16
    //   595: astore_1
    //   596: aload_1
    //   597: ifnonnull -> 603
    //   600: goto -> 389
    //   603: aload_1
    //   604: invokevirtual a : ()I
    //   607: invokestatic f : (I)Lnet/time4j/calendar/h;
    //   610: astore_1
    //   611: aload_1
    //   612: astore_2
    //   613: iload #5
    //   615: ifeq -> 623
    //   618: aload_1
    //   619: invokevirtual c : ()Lnet/time4j/calendar/h;
    //   622: astore_2
    //   623: aload_2
    //   624: areturn
  }
  
  public void a(o paramo, Appendable paramAppendable, d paramd) {
    String str;
    Locale locale = (Locale)paramd.a(a.c, Locale.ROOT);
    h h = (h)paramo.e((p)this);
    if (paramd.b(a.b)) {
      str = h.a(locale, (j)paramd.a(a.l, j.c), paramd);
    } else {
      t t;
      w w = (w)paramd.a(a.g, w.c);
      m m = (m)paramd.a(a.h, m.c);
      boolean bool = h.b();
      b b = b.a("chinese", locale);
      if (bool) {
        t = b.a(w, m);
      } else {
        t = b.d((w)t, m);
      } 
      str = t.a((Enum)b0.f(h.a()));
    } 
    paramAppendable.append(str);
  }
  
  public h b() {
    return h.f(12);
  }
  
  public boolean c() {
    return false;
  }
  
  public boolean d() {
    return true;
  }
  
  public Class<h> getType() {
    return h.class;
  }
  
  public String name() {
    return "MONTH_OF_YEAR";
  }
  
  public h q() {
    return h.f(1);
  }
  
  protected Object readResolve() {
    return c;
  }
  
  public boolean s() {
    return false;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/calendar/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */