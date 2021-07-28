package net.time4j.history;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import net.time4j.d1.a0;
import net.time4j.d1.c;
import net.time4j.d1.l0;
import net.time4j.d1.p;
import net.time4j.d1.p0;
import net.time4j.e1.a0.l;
import net.time4j.e1.u;
import net.time4j.f;
import net.time4j.f0;
import net.time4j.history.q.b;

public final class d implements p0, Serializable {
  public static final c<p> r = net.time4j.e1.a.a("YEAR_DEFINITION", p.class);
  
  public static final d s;
  
  private static final long serialVersionUID = 4100690610730913643L;
  
  public static final d t;
  
  public static final d u;
  
  private static final long v = ((Long)f0.b(1582, 10, 15).e((p)a0.e)).longValue();
  
  private static final d w = b(v);
  
  private static final d x;
  
  private static final Map<String, d> y;
  
  private final transient b c;
  
  private final transient List<f> d;
  
  private final transient a e;
  
  private final transient o f;
  
  private final transient g g;
  
  private final transient p<h> h;
  
  private final transient p<j> i;
  
  private final transient u<Integer> j;
  
  private final transient p<Integer> k;
  
  private final transient p<Integer> l;
  
  private final transient u<Integer> m;
  
  private final transient u<Integer> n;
  
  private final transient u<Integer> o;
  
  private final transient p<Integer> p;
  
  private final transient Set<p<?>> q;
  
  static {
    ArrayList<f> arrayList = new ArrayList();
    arrayList.add(new f(-57959L, c.d, c.e));
    arrayList.add(new f(-53575L, c.e, c.d));
    arrayList.add(new f(-38611L, c.d, c.c));
    x = new d(b.e, Collections.unmodifiableList(arrayList));
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    f0 f01 = t.b(h.a(j.d, 988, 3, 1));
    f0 f02 = t.b(h.a(j.d, 1382, 12, 24));
    f0 f03 = t.b(h.a(j.d, 1421, 12, 24));
    f0 f04 = t.b(h.a(j.d, 1699, 12, 31));
    hashMap.put("ES", s().a(n.c.f(1383).a(n.f.f(1556))).a(g.b(f02)));
    hashMap.put("PT", s().a(n.c.f(1422).a(n.f.f(1556))).a(g.b(f03)));
    hashMap.put("FR", b(f0.b(1582, 12, 20)).a(n.g.f(1567)));
    hashMap.put("DE", s().a(n.f.f(1544)));
    hashMap.put("DE-BAYERN", b(f0.b(1583, 10, 16)).a(n.f.f(1544)));
    hashMap.put("DE-PREUSSEN", b(f0.b(1610, 9, 2)).a(n.f.f(1559)));
    hashMap.put("DE-PROTESTANT", b(f0.b(1700, 3, 1)).a(n.f.f(1559)));
    hashMap.put("NL", b(f0.b(1583, 1, 1)));
    hashMap.put("AT", b(f0.b(1584, 1, 17)));
    hashMap.put("CH", b(f0.b(1584, 1, 22)));
    hashMap.put("HU", b(f0.b(1587, 11, 1)));
    hashMap.put("DK", b(f0.b(1700, 3, 1)).a(n.i.f(1623)));
    hashMap.put("NO", b(f0.b(1700, 3, 1)).a(n.i.f(1623)));
    hashMap.put("IT", s().a(n.f.f(1583)));
    hashMap.put("IT-FLORENCE", s().a(n.i.f(1749)));
    hashMap.put("IT-PISA", s().a(n.j.f(1749)));
    hashMap.put("IT-VENICE", s().a(n.d.f(1798)));
    hashMap.put("GB", b(f0.b(1752, 9, 14)).a(n.f.f(1087).a(n.c.f(1155)).a(n.i.f(1752))));
    hashMap.put("GB-SCT", b(f0.b(1752, 9, 14)).a(n.f.f(1087).a(n.c.f(1155)).a(n.i.f(1600))));
    hashMap.put("RU", b(f0.b(1918, 2, 14)).a(n.c.f(988).a(n.d.f(1493)).a(n.e.f(1700))).a(g.b(f01, f04)));
    hashMap.put("SE", x);
    y = Collections.unmodifiableMap(hashMap);
  }
  
  private d(b paramb, List<f> paramList) {
    this(paramb, paramList, null, null, g.d);
  }
  
  private d(b paramb, List<f> paramList, a parama, o paramo, g paramg) {
    if (!paramList.isEmpty()) {
      if (paramb != null) {
        if (paramg != null) {
          this.c = paramb;
          this.d = paramList;
          this.e = parama;
          this.f = paramo;
          this.g = paramg;
          this.h = (p<h>)new i(this);
          this.i = (p<j>)new k(this);
          this.j = (u<Integer>)new l('y', 1, 999999999, this, 2);
          this.k = (p<Integer>)new l(false, 1, 999999999, this, 6);
          this.l = (p<Integer>)new l(false, 1, 999999999, this, 7);
          this.m = (u<Integer>)new l('M', 1, 12, this, 3);
          this.n = (u<Integer>)new l('d', 1, 31, this, 4);
          this.o = (u<Integer>)new l('D', 1, 365, this, 5);
          this.p = (p<Integer>)new l(false, 1, 10000000, this, 8);
          HashSet<p<h>> hashSet = new HashSet();
          hashSet.add(this.h);
          hashSet.add(this.i);
          hashSet.add(this.j);
          hashSet.add(this.k);
          hashSet.add(this.l);
          hashSet.add(this.m);
          hashSet.add(this.n);
          hashSet.add(this.o);
          hashSet.add(this.p);
          this.q = Collections.unmodifiableSet(hashSet);
          return;
        } 
        throw new NullPointerException("Missing era preference.");
      } 
      throw new NullPointerException("Missing historic variant.");
    } 
    throw new IllegalArgumentException("At least one cutover event must be present in chronological history.");
  }
  
  private static f0 a(String[] paramArrayOfString, String paramString) {
    paramArrayOfString = paramArrayOfString[1].split("=");
    if (paramArrayOfString.length == 2) {
      if (paramArrayOfString[0].equals("cutover"))
        try {
          return (f0)l.l.a(paramArrayOfString[1]);
        } catch (ParseException parseException) {} 
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("Invalid cutover definition: ");
      stringBuilder1.append(paramString);
      throw new IllegalArgumentException(stringBuilder1.toString());
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Invalid syntax in variant description: ");
    stringBuilder.append(paramString);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public static d a(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: ldc_w 'historic-'
    //   4: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   7: ifeq -> 769
    //   10: aload_0
    //   11: bipush #9
    //   13: invokevirtual substring : (I)Ljava/lang/String;
    //   16: ldc_w ':'
    //   19: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
    //   22: astore #6
    //   24: aload #6
    //   26: arraylength
    //   27: ifeq -> 758
    //   30: aload #6
    //   32: iconst_0
    //   33: aaload
    //   34: invokestatic valueOf : (Ljava/lang/String;)Lnet/time4j/history/q/b;
    //   37: astore #4
    //   39: getstatic net/time4j/history/d$a.a : [I
    //   42: aload #4
    //   44: invokevirtual ordinal : ()I
    //   47: iaload
    //   48: tableswitch default -> 88, 1 -> 754, 2 -> 750, 3 -> 746, 4 -> 189, 5 -> 121, 6 -> 101
    //   88: new java/lang/UnsupportedOperationException
    //   91: dup
    //   92: aload #4
    //   94: invokevirtual name : ()Ljava/lang/String;
    //   97: invokespecial <init> : (Ljava/lang/String;)V
    //   100: athrow
    //   101: aload #6
    //   103: aload_0
    //   104: invokestatic a : ([Ljava/lang/String;Ljava/lang/String;)Lnet/time4j/f0;
    //   107: invokestatic b : (Lnet/time4j/f0;)Lnet/time4j/history/d;
    //   110: astore #4
    //   112: iconst_2
    //   113: istore_1
    //   114: aload #4
    //   116: astore #5
    //   118: goto -> 196
    //   121: aload #6
    //   123: aload_0
    //   124: invokestatic a : ([Ljava/lang/String;Ljava/lang/String;)Lnet/time4j/f0;
    //   127: sipush #1582
    //   130: bipush #10
    //   132: bipush #15
    //   134: invokestatic b : (III)Lnet/time4j/f0;
    //   137: invokevirtual equals : (Ljava/lang/Object;)Z
    //   140: ifeq -> 151
    //   143: invokestatic s : ()Lnet/time4j/history/d;
    //   146: astore #4
    //   148: goto -> 112
    //   151: new java/lang/StringBuilder
    //   154: dup
    //   155: invokespecial <init> : ()V
    //   158: astore #4
    //   160: aload #4
    //   162: ldc_w 'Inconsistent cutover date: '
    //   165: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   168: pop
    //   169: aload #4
    //   171: aload_0
    //   172: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   175: pop
    //   176: new java/lang/IllegalArgumentException
    //   179: dup
    //   180: aload #4
    //   182: invokevirtual toString : ()Ljava/lang/String;
    //   185: invokespecial <init> : (Ljava/lang/String;)V
    //   188: athrow
    //   189: invokestatic t : ()Lnet/time4j/history/d;
    //   192: astore #5
    //   194: iconst_1
    //   195: istore_1
    //   196: aload #6
    //   198: iload_1
    //   199: aaload
    //   200: ldc_w '='
    //   203: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
    //   206: astore #7
    //   208: aload #5
    //   210: astore #4
    //   212: aload #7
    //   214: iconst_0
    //   215: aaload
    //   216: ldc_w 'ancient-julian-leap-years'
    //   219: invokevirtual equals : (Ljava/lang/Object;)Z
    //   222: ifeq -> 314
    //   225: aload #7
    //   227: iconst_1
    //   228: aaload
    //   229: iconst_1
    //   230: aload #7
    //   232: iconst_1
    //   233: aaload
    //   234: invokevirtual length : ()I
    //   237: iconst_1
    //   238: isub
    //   239: invokevirtual substring : (II)Ljava/lang/String;
    //   242: astore #7
    //   244: aload #5
    //   246: astore #4
    //   248: aload #7
    //   250: invokevirtual isEmpty : ()Z
    //   253: ifne -> 314
    //   256: aload #7
    //   258: ldc_w ','
    //   261: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
    //   264: astore #4
    //   266: aload #4
    //   268: arraylength
    //   269: newarray int
    //   271: astore #7
    //   273: iconst_0
    //   274: istore_2
    //   275: iload_2
    //   276: aload #4
    //   278: arraylength
    //   279: if_icmpge -> 302
    //   282: aload #7
    //   284: iload_2
    //   285: iconst_1
    //   286: aload #4
    //   288: iload_2
    //   289: aaload
    //   290: invokestatic parseInt : (Ljava/lang/String;)I
    //   293: isub
    //   294: iastore
    //   295: iload_2
    //   296: iconst_1
    //   297: iadd
    //   298: istore_2
    //   299: goto -> 275
    //   302: aload #5
    //   304: aload #7
    //   306: invokestatic a : ([I)Lnet/time4j/history/a;
    //   309: invokevirtual a : (Lnet/time4j/history/a;)Lnet/time4j/history/d;
    //   312: astore #4
    //   314: aload #6
    //   316: iload_1
    //   317: iconst_1
    //   318: iadd
    //   319: aaload
    //   320: ldc_w '='
    //   323: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
    //   326: astore #7
    //   328: aload #4
    //   330: astore #5
    //   332: aload #7
    //   334: iconst_0
    //   335: aaload
    //   336: ldc_w 'new-year-strategy'
    //   339: invokevirtual equals : (Ljava/lang/Object;)Z
    //   342: ifeq -> 487
    //   345: aload #7
    //   347: iconst_1
    //   348: aaload
    //   349: iconst_1
    //   350: aload #7
    //   352: iconst_1
    //   353: aaload
    //   354: invokevirtual length : ()I
    //   357: iconst_1
    //   358: isub
    //   359: invokevirtual substring : (II)Ljava/lang/String;
    //   362: ldc_w ','
    //   365: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
    //   368: astore #7
    //   370: aconst_null
    //   371: astore #5
    //   373: iconst_0
    //   374: istore_2
    //   375: iload_2
    //   376: aload #7
    //   378: arraylength
    //   379: if_icmpge -> 478
    //   382: aload #7
    //   384: iload_2
    //   385: aaload
    //   386: ldc_w '->'
    //   389: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
    //   392: astore #8
    //   394: aload #8
    //   396: iconst_0
    //   397: aaload
    //   398: invokestatic valueOf : (Ljava/lang/String;)Lnet/time4j/history/n;
    //   401: astore #9
    //   403: aload #8
    //   405: arraylength
    //   406: iconst_2
    //   407: if_icmpne -> 421
    //   410: aload #8
    //   412: iconst_1
    //   413: aaload
    //   414: invokestatic parseInt : (Ljava/lang/String;)I
    //   417: istore_3
    //   418: goto -> 424
    //   421: ldc 2147483647
    //   423: istore_3
    //   424: aload #5
    //   426: ifnonnull -> 458
    //   429: aload #9
    //   431: getstatic net/time4j/history/n.c : Lnet/time4j/history/n;
    //   434: if_acmpne -> 447
    //   437: iload_3
    //   438: sipush #567
    //   441: if_icmpne -> 447
    //   444: goto -> 471
    //   447: aload #9
    //   449: iload_3
    //   450: invokevirtual f : (I)Lnet/time4j/history/o;
    //   453: astore #5
    //   455: goto -> 471
    //   458: aload #5
    //   460: aload #9
    //   462: iload_3
    //   463: invokevirtual f : (I)Lnet/time4j/history/o;
    //   466: invokevirtual a : (Lnet/time4j/history/o;)Lnet/time4j/history/o;
    //   469: astore #5
    //   471: iload_2
    //   472: iconst_1
    //   473: iadd
    //   474: istore_2
    //   475: goto -> 375
    //   478: aload #4
    //   480: aload #5
    //   482: invokevirtual a : (Lnet/time4j/history/o;)Lnet/time4j/history/d;
    //   485: astore #5
    //   487: aload #6
    //   489: iload_1
    //   490: iconst_2
    //   491: iadd
    //   492: aaload
    //   493: ldc_w '='
    //   496: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
    //   499: astore #4
    //   501: aload #4
    //   503: iconst_0
    //   504: aaload
    //   505: ldc_w 'era-preference'
    //   508: invokevirtual equals : (Ljava/lang/Object;)Z
    //   511: ifeq -> 743
    //   514: aload #4
    //   516: iconst_1
    //   517: aaload
    //   518: iconst_1
    //   519: aload #4
    //   521: iconst_1
    //   522: aaload
    //   523: invokevirtual length : ()I
    //   526: iconst_1
    //   527: isub
    //   528: invokevirtual substring : (II)Ljava/lang/String;
    //   531: astore #4
    //   533: aload #4
    //   535: ldc_w 'default'
    //   538: invokevirtual equals : (Ljava/lang/Object;)Z
    //   541: ifne -> 743
    //   544: aload #4
    //   546: ldc_w ','
    //   549: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
    //   552: astore #7
    //   554: aload #7
    //   556: iconst_0
    //   557: aaload
    //   558: iconst_5
    //   559: invokevirtual substring : (I)Ljava/lang/String;
    //   562: invokestatic valueOf : (Ljava/lang/String;)Lnet/time4j/history/j;
    //   565: astore #4
    //   567: aload #7
    //   569: iconst_1
    //   570: aaload
    //   571: bipush #7
    //   573: invokevirtual substring : (I)Ljava/lang/String;
    //   576: invokestatic a : (Ljava/lang/CharSequence;)Lnet/time4j/f0;
    //   579: astore #6
    //   581: aload #7
    //   583: iconst_2
    //   584: aaload
    //   585: iconst_5
    //   586: invokevirtual substring : (I)Ljava/lang/String;
    //   589: invokestatic a : (Ljava/lang/CharSequence;)Lnet/time4j/f0;
    //   592: astore #7
    //   594: getstatic net/time4j/history/d$a.b : [I
    //   597: aload #4
    //   599: invokevirtual ordinal : ()I
    //   602: iaload
    //   603: istore_1
    //   604: iload_1
    //   605: iconst_1
    //   606: if_icmpeq -> 690
    //   609: iload_1
    //   610: iconst_2
    //   611: if_icmpeq -> 669
    //   614: iload_1
    //   615: iconst_3
    //   616: if_icmpne -> 631
    //   619: aload #6
    //   621: aload #7
    //   623: invokestatic a : (Lnet/time4j/f0;Lnet/time4j/f0;)Lnet/time4j/history/g;
    //   626: astore #4
    //   628: goto -> 678
    //   631: new java/lang/StringBuilder
    //   634: dup
    //   635: invokespecial <init> : ()V
    //   638: astore #4
    //   640: aload #4
    //   642: ldc_w 'BC/AD not allowed as era preference: '
    //   645: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   648: pop
    //   649: aload #4
    //   651: aload_0
    //   652: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   655: pop
    //   656: new java/lang/IllegalArgumentException
    //   659: dup
    //   660: aload #4
    //   662: invokevirtual toString : ()Ljava/lang/String;
    //   665: invokespecial <init> : (Ljava/lang/String;)V
    //   668: athrow
    //   669: aload #6
    //   671: aload #7
    //   673: invokestatic b : (Lnet/time4j/f0;Lnet/time4j/f0;)Lnet/time4j/history/g;
    //   676: astore #4
    //   678: aload #5
    //   680: aload #4
    //   682: invokevirtual a : (Lnet/time4j/history/g;)Lnet/time4j/history/d;
    //   685: astore #4
    //   687: goto -> 702
    //   690: aload #6
    //   692: aload #7
    //   694: invokestatic c : (Lnet/time4j/f0;Lnet/time4j/f0;)Lnet/time4j/history/g;
    //   697: astore #4
    //   699: goto -> 678
    //   702: aload #4
    //   704: areturn
    //   705: new java/lang/StringBuilder
    //   708: dup
    //   709: invokespecial <init> : ()V
    //   712: astore #4
    //   714: aload #4
    //   716: ldc_w 'Invalid date syntax: '
    //   719: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   722: pop
    //   723: aload #4
    //   725: aload_0
    //   726: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   729: pop
    //   730: new java/lang/IllegalArgumentException
    //   733: dup
    //   734: aload #4
    //   736: invokevirtual toString : ()Ljava/lang/String;
    //   739: invokespecial <init> : (Ljava/lang/String;)V
    //   742: athrow
    //   743: aload #5
    //   745: areturn
    //   746: getstatic net/time4j/history/d.u : Lnet/time4j/history/d;
    //   749: areturn
    //   750: getstatic net/time4j/history/d.t : Lnet/time4j/history/d;
    //   753: areturn
    //   754: getstatic net/time4j/history/d.s : Lnet/time4j/history/d;
    //   757: areturn
    //   758: new java/lang/IllegalArgumentException
    //   761: dup
    //   762: ldc_w 'Invalid variant description.'
    //   765: invokespecial <init> : (Ljava/lang/String;)V
    //   768: athrow
    //   769: new java/lang/StringBuilder
    //   772: dup
    //   773: invokespecial <init> : ()V
    //   776: astore #4
    //   778: aload #4
    //   780: ldc_w 'Variant does not start with "historic-": '
    //   783: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   786: pop
    //   787: aload #4
    //   789: aload_0
    //   790: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   793: pop
    //   794: new java/lang/IllegalArgumentException
    //   797: dup
    //   798: aload #4
    //   800: invokevirtual toString : ()Ljava/lang/String;
    //   803: invokespecial <init> : (Ljava/lang/String;)V
    //   806: astore_0
    //   807: goto -> 812
    //   810: aload_0
    //   811: athrow
    //   812: goto -> 810
    //   815: astore #4
    //   817: goto -> 705
    // Exception table:
    //   from	to	target	type
    //   554	604	815	java/text/ParseException
    //   619	628	815	java/text/ParseException
    //   631	669	815	java/text/ParseException
    //   669	678	815	java/text/ParseException
    //   678	687	815	java/text/ParseException
    //   690	699	815	java/text/ParseException
  }
  
  public static d a(Locale paramLocale) {
    d d2;
    String str = paramLocale.getCountry();
    if (!paramLocale.getVariant().isEmpty()) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(str);
      stringBuilder.append("-");
      stringBuilder.append(paramLocale.getVariant());
      str = stringBuilder.toString();
      d d3 = y.get(str);
    } else {
      paramLocale = null;
    } 
    Locale locale = paramLocale;
    if (paramLocale == null)
      d2 = y.get(str); 
    d d1 = d2;
    if (d2 == null)
      d1 = s(); 
    return d1;
  }
  
  private static void a(long paramLong) {
    if (paramLong >= v)
      return; 
    throw new IllegalArgumentException("Gregorian calendar did not exist before 1582-10-15");
  }
  
  private static boolean a(Object paramObject1, Object paramObject2) {
    return (paramObject1 == null) ? ((paramObject2 == null)) : paramObject1.equals(paramObject2);
  }
  
  private static d b(long paramLong) {
    b b1;
    if (paramLong == v) {
      b1 = b.f;
    } else {
      b1 = b.g;
    } 
    return new d(b1, Collections.singletonList(new f(paramLong, c.d, c.c)));
  }
  
  public static d b(f0 paramf0) {
    if (paramf0.equals(f0.I().i()))
      return t; 
    if (paramf0.equals(f0.I().j()))
      return s; 
    long l = ((Long)paramf0.e((p)a0.e)).longValue();
    a(l);
    return (l == v) ? w : b(l);
  }
  
  private boolean e(h paramh) {
    int i = paramh.b().f(paramh.c());
    d d1 = u;
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = false;
    null = false;
    if (this == d1) {
      if (i < -5508 || (i == -5508 && paramh.getMonth() < 9) || i > 999979465)
        null = true; 
      return null;
    } 
    if (this == t) {
      null = bool1;
      if (Math.abs(i) > 999979465)
        null = true; 
      return null;
    } 
    if (this == s) {
      null = bool2;
      if (Math.abs(i) > 999999999)
        null = true; 
      return null;
    } 
    if (i >= -44) {
      null = bool3;
      return (i > 9999) ? true : null;
    } 
    return true;
  }
  
  private b r() {
    a a1 = this.e;
    return (a1 != null) ? a1.a() : c.d;
  }
  
  private void readObject(ObjectInputStream paramObjectInputStream) {
    throw new InvalidObjectException("Serialization proxy required.");
  }
  
  public static d s() {
    return w;
  }
  
  public static d t() {
    return x;
  }
  
  private Object writeReplace() {
    return new SPX(this, 3);
  }
  
  public p<Integer> a() {
    return this.p;
  }
  
  public p<Integer> a(p paramp) {
    int i = a.c[paramp.ordinal()];
    if (i != 1) {
      if (i != 2) {
        if (i == 3)
          return this.l; 
        throw new UnsupportedOperationException(paramp.name());
      } 
      return this.k;
    } 
    return (p<Integer>)this.j;
  }
  
  public d a(a parama) {
    if (parama != null)
      return !o() ? this : new d(this.c, this.d, parama, this.f, this.g); 
    throw new NullPointerException("Missing ancient julian leap years.");
  }
  
  public d a(g paramg) {
    return !paramg.equals(this.g) ? (!o() ? this : new d(this.c, this.d, this.e, this.f, paramg)) : this;
  }
  
  public d a(o paramo) {
    return paramo.equals(o.d) ? ((this.f == null) ? this : new d(this.c, this.d, this.e, null, this.g)) : (!o() ? this : new d(this.c, this.d, this.e, paramo, this.g));
  }
  
  public h a(f0 paramf0) {
    h h3;
    long l = ((Long)paramf0.e((p)a0.e)).longValue();
    int i = this.d.size() - 1;
    while (true) {
      if (i >= 0) {
        f f = this.d.get(i);
        if (l >= f.a) {
          h h = f.b.a(l);
          break;
        } 
        i--;
        continue;
      } 
      h3 = null;
      break;
    } 
    h h2 = h3;
    if (h3 == null)
      h2 = r().a(l); 
    j j = this.g.a(h2, paramf0);
    h h1 = h2;
    if (j != h2.b())
      h1 = h.a(j, j.a(h2.b(), h2.c()), h2.getMonth(), h2.a()); 
    if (!e(h1))
      return h1; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Out of supported range: ");
    stringBuilder.append(h1);
    IllegalArgumentException illegalArgumentException = new IllegalArgumentException(stringBuilder.toString());
    throw illegalArgumentException;
  }
  
  h a(h paramh) {
    b b1 = c(paramh);
    if (b1 == null)
      return paramh; 
    int i = b1.c(paramh);
    h h1 = paramh;
    if (i < paramh.a())
      h1 = h.a(paramh.b(), paramh.c(), paramh.getMonth(), i); 
    return h1;
  }
  
  public h a(j paramj, int paramInt) {
    h h = l().a(paramj, paramInt);
    if (d(h)) {
      f0 f0 = b(h);
      j j1 = this.g.a(h, f0);
      h h1 = h;
      if (j1 != paramj)
        h1 = h.a(j1, j1.a(h.b(), h.c()), h.getMonth(), h.a()); 
      return h1;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Cannot determine valid New Year: ");
    stringBuilder.append(paramj);
    stringBuilder.append("-");
    stringBuilder.append(paramInt);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public int b(j paramj, int paramInt) {
    try {
      h h1;
      h h2;
      o o1 = this.f;
      boolean bool = true;
      if (o1 == null) {
        h2 = h.a(paramj, paramInt, 1, 1);
        h1 = h.a(paramj, paramInt, 12, 31);
        paramInt = bool;
      } else {
        h2 = this.f.a((j)h1, paramInt);
        if (h1 == j.c) {
          if (paramInt == 1) {
            h1 = this.f.a(j.d, 1);
          } else {
            h1 = this.f.a((j)h1, paramInt - 1);
          } 
        } else {
          h h = this.f.a((j)h1, paramInt + 1);
          if (h1 == j.f) {
            h1 = this.f.a(j.d, h1.f(paramInt));
            if (h1.a(h2) > 0)
              paramInt = 0; 
          } 
          h1 = h;
        } 
        paramInt = 0;
      } 
      long l = f.j.a((l0)b(h2), (l0)b(h1));
      return (int)(l + paramInt);
    } catch (RuntimeException runtimeException) {
      return -1;
    } 
  }
  
  public p<h> b() {
    return this.h;
  }
  
  public f0 b(h paramh) {
    if (!e(paramh)) {
      b b1 = c(paramh);
      if (b1 != null)
        return f0.a(b1.b(paramh), a0.e); 
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("Invalid historic date: ");
      stringBuilder1.append(paramh);
      throw new IllegalArgumentException(stringBuilder1.toString());
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Out of supported range: ");
    stringBuilder.append(paramh);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public p<Integer> c() {
    return (p<Integer>)this.n;
  }
  
  b c(h paramh) {
    for (int i = this.d.size() - 1; i >= 0; i--) {
      f f = this.d.get(i);
      if (paramh.a(f.c) >= 0)
        return f.b; 
      if (paramh.a(f.d) > 0)
        return null; 
    } 
    return r();
  }
  
  public p<Integer> d() {
    return (p<Integer>)this.o;
  }
  
  public boolean d(h paramh) {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (paramh != null) {
      if (e(paramh))
        return false; 
      b b1 = c(paramh);
      bool1 = bool2;
      if (b1 != null) {
        bool1 = bool2;
        if (b1.a(paramh))
          bool1 = true; 
      } 
    } 
    return bool1;
  }
  
  public p<j> e() {
    return this.i;
  }
  
  public boolean equals(Object paramObject) {
    boolean bool = true;
    if (this == paramObject)
      return true; 
    if (paramObject instanceof d) {
      paramObject = paramObject;
      if (this.c == ((d)paramObject).c && a(this.e, ((d)paramObject).e) && a(this.f, ((d)paramObject).f) && this.g.equals(((d)paramObject).g)) {
        if (this.c == b.g) {
          if (((f)this.d.get(0)).a == ((f)((d)paramObject).d.get(0)).a)
            return true; 
          bool = false;
        } 
        return bool;
      } 
    } 
    return false;
  }
  
  public a f() {
    a a1 = this.e;
    if (a1 != null)
      return a1; 
    throw new UnsupportedOperationException("No historic julian leap years were defined.");
  }
  
  public Set<p<?>> g() {
    return this.q;
  }
  
  g h() {
    return this.g;
  }
  
  public int hashCode() {
    b b1 = this.c;
    if (b1 == b.g) {
      long l = ((f)this.d.get(0)).a;
      return (int)(l ^ l << 32L);
    } 
    return b1.hashCode();
  }
  
  List<f> i() {
    return this.d;
  }
  
  public f0 j() {
    List<f> list = this.d;
    long l = ((f)list.get(list.size() - 1)).a;
    if (l != Long.MIN_VALUE)
      return f0.a(l, a0.e); 
    throw new UnsupportedOperationException("Proleptic history without any gregorian reform date.");
  }
  
  b k() {
    return this.c;
  }
  
  public o l() {
    o o2 = this.f;
    o o1 = o2;
    if (o2 == null)
      o1 = o.d; 
    return o1;
  }
  
  public String m() {
    StringBuilder stringBuilder = new StringBuilder(64);
    stringBuilder.append("historic-");
    stringBuilder.append(this.c.name());
    int j = a.a[this.c.ordinal()];
    int i = 1;
    if (j != 1 && j != 2 && j != 3) {
      if (j == 5 || j == 6) {
        stringBuilder.append(":cutover=");
        stringBuilder.append(j());
      } 
      stringBuilder.append(":ancient-julian-leap-years=");
      a a1 = this.e;
      if (a1 != null) {
        int[] arrayOfInt = a1.b();
        stringBuilder.append('[');
        stringBuilder.append(arrayOfInt[0]);
        while (i < arrayOfInt.length) {
          stringBuilder.append(',');
          stringBuilder.append(arrayOfInt[i]);
          i++;
        } 
        stringBuilder.append(']');
      } else {
        stringBuilder.append("[]");
      } 
      stringBuilder.append(":new-year-strategy=");
      stringBuilder.append(l());
      stringBuilder.append(":era-preference=");
      stringBuilder.append(h());
    } else {
      stringBuilder.append(":no-cutover");
    } 
    return stringBuilder.toString();
  }
  
  public boolean n() {
    return (this.e != null);
  }
  
  public boolean o() {
    List<f> list = this.d;
    return (((f)list.get(list.size() - 1)).a > Long.MIN_VALUE);
  }
  
  public u<Integer> p() {
    return this.m;
  }
  
  public u<Integer> q() {
    return this.j;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("ChronoHistory[");
    stringBuilder.append(m());
    stringBuilder.append("]");
    return stringBuilder.toString();
  }
  
  static {
    b b1 = b.d;
    c c1 = c.c;
    s = new d(b1, Collections.singletonList(new f(Long.MIN_VALUE, c1, c1)));
    b1 = b.c;
    c1 = c.d;
    t = new d(b1, Collections.singletonList(new f(Long.MIN_VALUE, c1, c1)));
    b1 = b.h;
    c1 = c.d;
    u = new d(b1, Collections.singletonList(new f(Long.MIN_VALUE, c1, c1)), null, new o(n.e, 2147483647), g.a((f0)f0.I().i()));
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/history/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */