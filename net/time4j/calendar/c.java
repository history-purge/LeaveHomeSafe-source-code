package net.time4j.calendar;

import java.io.Serializable;
import java.text.ParsePosition;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public final class c implements Comparable<c>, Serializable {
  private static final String[] c = new String[] { "jia", "yi", "bing", "ding", "wu", "ji", "geng", "xin", "ren", "gui" };
  
  private static final String[] d = new String[] { "jiǎ", "yǐ", "bǐng", "dīng", "wù", "jǐ", "gēng", "xīn", "rén", "guǐ" };
  
  private static final String[] e = new String[] { "甲", "乙", "丙", "丁", "戊", "己", "庚", "辛", "壬", "癸" };
  
  private static final String[] f = new String[] { "갑", "을", "병", "정", "무", "기", "경", "신", "임", "계" };
  
  private static final String[] g = new String[] { "giáp", "ất", "bính", "đinh", "mậu", "kỷ", "canh", "tân", "nhâm", "quý" };
  
  private static final String[] h = new String[] { "Цзя", "И", "Бин", "Дин", "У", "Цзи", "Гэн", "Синь", "Жэнь", "Гуй" };
  
  private static final String[] i = new String[] { 
      "zi", "chou", "yin", "mao", "chen", "si", "wu", "wei", "shen", "you", 
      "xu", "hai" };
  
  private static final String[] j = new String[] { 
      "zǐ", "chǒu", "yín", "mǎo", "chén", "sì", "wǔ", "wèi", "shēn", "yǒu", 
      "xū", "hài" };
  
  private static final String[] k = new String[] { 
      "子", "丑", "寅", "卯", "辰", "巳", "午", "未", "申", "酉", 
      "戌", "亥" };
  
  private static final String[] l = new String[] { 
      "자", "축", "인", "묘", "진", "사", "오", "미", "신", "유", 
      "술", "해" };
  
  private static final String[] m = new String[] { 
      "tí", "sửu", "dần", "mão", "thìn", "tị", "ngọ", "mùi", "thân", "dậu", 
      "tuất", "hợi" };
  
  private static final String[] n = new String[] { 
      "Цзы", "Чоу", "Инь", "Мао", "Чэнь", "Сы", "У", "Вэй", "Шэнь", "Ю", 
      "Сюй", "Хай" };
  
  private static final c[] o;
  
  private static final Map<String, String[]> p;
  
  private static final Map<String, String[]> q;
  
  private static final Set<String> r;
  
  private static final long serialVersionUID = 4908662352833192131L;
  
  private final int year;
  
  static {
    c[] arrayOfC = new c[60];
    while (i < 60) {
      int j = i + 1;
      arrayOfC[i] = new c(j);
      i = j;
    } 
    o = arrayOfC;
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    hashMap.put("root", c);
    hashMap.put("zh", e);
    hashMap.put("ja", e);
    hashMap.put("ko", f);
    hashMap.put("vi", g);
    hashMap.put("ru", h);
    p = Collections.unmodifiableMap(hashMap);
    hashMap = new HashMap<Object, Object>();
    hashMap.put("root", i);
    hashMap.put("zh", k);
    hashMap.put("ja", k);
    hashMap.put("ko", l);
    hashMap.put("vi", m);
    hashMap.put("ru", n);
    q = Collections.unmodifiableMap(hashMap);
    HashSet<String> hashSet = new HashSet();
    hashSet.add("zh");
    hashSet.add("ja");
    hashSet.add("ko");
    r = Collections.unmodifiableSet(hashSet);
  }
  
  private c(int paramInt) {
    this.year = paramInt;
  }
  
  private static char a(char paramChar) {
    if (paramChar != 'à')
      if (paramChar != 'ù') {
        if (paramChar != 'ē') {
          if (paramChar != 'ī') {
            if (paramChar != 'ū') {
              if (paramChar != 'ǎ') {
                if (paramChar != 'ǐ') {
                  if (paramChar != 'ǒ') {
                    if (paramChar != 'è' && paramChar != 'é')
                      return (paramChar != 'ì' && paramChar != 'í') ? paramChar : 'i'; 
                  } else {
                    return 'o';
                  } 
                } else {
                  return 'i';
                } 
                return 'e';
              } 
            } else {
              return 'u';
            } 
          } else {
            return 'i';
          } 
        } else {
          return 'e';
        } 
      } else {
        return 'u';
      }  
    return 'a';
  }
  
  static c a(CharSequence paramCharSequence, ParsePosition paramParsePosition, Locale paramLocale, boolean paramBoolean) {
    // Byte code:
    //   0: aload_2
    //   1: astore #18
    //   3: aload_1
    //   4: invokevirtual getIndex : ()I
    //   7: istore #5
    //   9: aload_0
    //   10: invokeinterface length : ()I
    //   15: istore #9
    //   17: aload_2
    //   18: invokevirtual getLanguage : ()Ljava/lang/String;
    //   21: invokevirtual isEmpty : ()Z
    //   24: istore #14
    //   26: iload #5
    //   28: iconst_1
    //   29: iadd
    //   30: istore #7
    //   32: iload #7
    //   34: iload #9
    //   36: if_icmpge -> 710
    //   39: iload #5
    //   41: ifge -> 47
    //   44: goto -> 710
    //   47: iload #7
    //   49: istore #6
    //   51: getstatic net/time4j/calendar/c.r : Ljava/util/Set;
    //   54: aload_2
    //   55: invokevirtual getLanguage : ()Ljava/lang/String;
    //   58: invokeinterface contains : (Ljava/lang/Object;)Z
    //   63: ifeq -> 216
    //   66: invokestatic values : ()[Lnet/time4j/calendar/c$c;
    //   69: astore #15
    //   71: aload #15
    //   73: arraylength
    //   74: istore #8
    //   76: iconst_0
    //   77: istore #6
    //   79: iload #6
    //   81: iload #8
    //   83: if_icmpge -> 125
    //   86: aload #15
    //   88: iload #6
    //   90: aaload
    //   91: astore_2
    //   92: aload_2
    //   93: aload #18
    //   95: invokevirtual a : (Ljava/util/Locale;)Ljava/lang/String;
    //   98: iconst_0
    //   99: invokevirtual charAt : (I)C
    //   102: aload_0
    //   103: iload #5
    //   105: invokeinterface charAt : (I)C
    //   110: if_icmpne -> 116
    //   113: goto -> 127
    //   116: iload #6
    //   118: iconst_1
    //   119: iadd
    //   120: istore #6
    //   122: goto -> 79
    //   125: aconst_null
    //   126: astore_2
    //   127: aload_2
    //   128: ifnull -> 204
    //   131: invokestatic values : ()[Lnet/time4j/calendar/c$b;
    //   134: astore #15
    //   136: aload #15
    //   138: arraylength
    //   139: istore #8
    //   141: iconst_0
    //   142: istore #6
    //   144: iload #6
    //   146: iload #8
    //   148: if_icmpge -> 204
    //   151: aload #15
    //   153: iload #6
    //   155: aaload
    //   156: astore #16
    //   158: aload #16
    //   160: aload #18
    //   162: invokevirtual a : (Ljava/util/Locale;)Ljava/lang/String;
    //   165: iconst_0
    //   166: invokevirtual charAt : (I)C
    //   169: aload_0
    //   170: iload #7
    //   172: invokeinterface charAt : (I)C
    //   177: if_icmpne -> 195
    //   180: iload #5
    //   182: iconst_2
    //   183: iadd
    //   184: istore #5
    //   186: aload_2
    //   187: astore #15
    //   189: aload #16
    //   191: astore_2
    //   192: goto -> 658
    //   195: iload #6
    //   197: iconst_1
    //   198: iadd
    //   199: istore #6
    //   201: goto -> 144
    //   204: aconst_null
    //   205: astore #16
    //   207: aload_2
    //   208: astore #15
    //   210: aload #16
    //   212: astore_2
    //   213: goto -> 658
    //   216: iload #6
    //   218: iload #9
    //   220: if_icmpge -> 252
    //   223: aload_0
    //   224: iload #6
    //   226: invokeinterface charAt : (I)C
    //   231: bipush #45
    //   233: if_icmpne -> 243
    //   236: iload #6
    //   238: istore #7
    //   240: goto -> 255
    //   243: iload #6
    //   245: iconst_1
    //   246: iadd
    //   247: istore #6
    //   249: goto -> 216
    //   252: iconst_m1
    //   253: istore #7
    //   255: iload #7
    //   257: iconst_m1
    //   258: if_icmpne -> 269
    //   261: aload_1
    //   262: iload #5
    //   264: invokevirtual setErrorIndex : (I)V
    //   267: aconst_null
    //   268: areturn
    //   269: invokestatic values : ()[Lnet/time4j/calendar/c$c;
    //   272: astore #16
    //   274: aload #16
    //   276: arraylength
    //   277: istore #11
    //   279: aconst_null
    //   280: astore #15
    //   282: iconst_0
    //   283: istore #6
    //   285: iload #6
    //   287: iload #11
    //   289: if_icmpge -> 427
    //   292: aload #16
    //   294: iload #6
    //   296: aaload
    //   297: astore #19
    //   299: aload #19
    //   301: aload #18
    //   303: invokevirtual a : (Ljava/util/Locale;)Ljava/lang/String;
    //   306: astore #20
    //   308: iload #5
    //   310: istore #8
    //   312: iload #8
    //   314: iload #7
    //   316: if_icmpge -> 410
    //   319: iload #8
    //   321: iload #5
    //   323: isub
    //   324: istore #12
    //   326: aload_0
    //   327: iload #8
    //   329: invokeinterface charAt : (I)C
    //   334: istore #4
    //   336: iload #4
    //   338: istore #10
    //   340: iload #14
    //   342: ifeq -> 352
    //   345: iload #4
    //   347: invokestatic a : (C)C
    //   350: istore #10
    //   352: aload #15
    //   354: astore #17
    //   356: iload #12
    //   358: aload #20
    //   360: invokevirtual length : ()I
    //   363: if_icmpge -> 414
    //   366: aload #15
    //   368: astore #17
    //   370: aload #20
    //   372: iload #12
    //   374: invokevirtual charAt : (I)C
    //   377: iload #10
    //   379: if_icmpne -> 414
    //   382: iload #12
    //   384: iconst_1
    //   385: iadd
    //   386: aload #20
    //   388: invokevirtual length : ()I
    //   391: if_icmpne -> 401
    //   394: aload #19
    //   396: astore #17
    //   398: goto -> 414
    //   401: iload #8
    //   403: iconst_1
    //   404: iadd
    //   405: istore #8
    //   407: goto -> 312
    //   410: aload #15
    //   412: astore #17
    //   414: iload #6
    //   416: iconst_1
    //   417: iadd
    //   418: istore #6
    //   420: aload #17
    //   422: astore #15
    //   424: goto -> 285
    //   427: aload #15
    //   429: ifnonnull -> 468
    //   432: iload_3
    //   433: ifeq -> 460
    //   436: iload #14
    //   438: ifne -> 460
    //   441: iload #7
    //   443: iconst_1
    //   444: iadd
    //   445: iload #9
    //   447: if_icmpge -> 460
    //   450: aload_0
    //   451: aload_1
    //   452: getstatic java/util/Locale.ROOT : Ljava/util/Locale;
    //   455: iconst_1
    //   456: invokestatic a : (Ljava/lang/CharSequence;Ljava/text/ParsePosition;Ljava/util/Locale;Z)Lnet/time4j/calendar/c;
    //   459: areturn
    //   460: aload_1
    //   461: iload #5
    //   463: invokevirtual setErrorIndex : (I)V
    //   466: aconst_null
    //   467: areturn
    //   468: invokestatic values : ()[Lnet/time4j/calendar/c$b;
    //   471: astore #19
    //   473: aload #19
    //   475: arraylength
    //   476: istore #12
    //   478: iconst_0
    //   479: istore #8
    //   481: aconst_null
    //   482: astore #16
    //   484: iload #9
    //   486: istore #6
    //   488: iload #8
    //   490: iload #12
    //   492: if_icmpge -> 655
    //   495: aload #19
    //   497: iload #8
    //   499: aaload
    //   500: astore #18
    //   502: aload #18
    //   504: aload_2
    //   505: invokevirtual a : (Ljava/util/Locale;)Ljava/lang/String;
    //   508: astore #20
    //   510: iload #7
    //   512: iconst_1
    //   513: iadd
    //   514: istore #10
    //   516: iload #10
    //   518: iload #6
    //   520: if_icmpge -> 630
    //   523: iload #10
    //   525: iload #7
    //   527: isub
    //   528: iconst_1
    //   529: isub
    //   530: istore #13
    //   532: aload_0
    //   533: iload #10
    //   535: invokeinterface charAt : (I)C
    //   540: istore #4
    //   542: iload #4
    //   544: istore #11
    //   546: iload #14
    //   548: ifeq -> 558
    //   551: iload #4
    //   553: invokestatic a : (C)C
    //   556: istore #11
    //   558: iload #5
    //   560: istore #9
    //   562: aload #16
    //   564: astore #17
    //   566: iload #13
    //   568: aload #20
    //   570: invokevirtual length : ()I
    //   573: if_icmpge -> 638
    //   576: iload #5
    //   578: istore #9
    //   580: aload #16
    //   582: astore #17
    //   584: aload #20
    //   586: iload #13
    //   588: invokevirtual charAt : (I)C
    //   591: iload #11
    //   593: if_icmpne -> 638
    //   596: iload #13
    //   598: iconst_1
    //   599: iadd
    //   600: aload #20
    //   602: invokevirtual length : ()I
    //   605: if_icmpne -> 621
    //   608: iload #10
    //   610: iconst_1
    //   611: iadd
    //   612: istore #9
    //   614: aload #18
    //   616: astore #17
    //   618: goto -> 638
    //   621: iload #10
    //   623: iconst_1
    //   624: iadd
    //   625: istore #10
    //   627: goto -> 516
    //   630: aload #16
    //   632: astore #17
    //   634: iload #5
    //   636: istore #9
    //   638: iload #8
    //   640: iconst_1
    //   641: iadd
    //   642: istore #8
    //   644: iload #9
    //   646: istore #5
    //   648: aload #17
    //   650: astore #16
    //   652: goto -> 488
    //   655: aload #16
    //   657: astore_2
    //   658: aload #15
    //   660: ifnull -> 683
    //   663: aload_2
    //   664: ifnonnull -> 670
    //   667: goto -> 683
    //   670: aload_1
    //   671: iload #5
    //   673: invokevirtual setIndex : (I)V
    //   676: aload #15
    //   678: aload_2
    //   679: invokestatic a : (Lnet/time4j/calendar/c$c;Lnet/time4j/calendar/c$b;)Lnet/time4j/calendar/c;
    //   682: areturn
    //   683: iload_3
    //   684: ifeq -> 702
    //   687: iload #14
    //   689: ifne -> 702
    //   692: aload_0
    //   693: aload_1
    //   694: getstatic java/util/Locale.ROOT : Ljava/util/Locale;
    //   697: iconst_1
    //   698: invokestatic a : (Ljava/lang/CharSequence;Ljava/text/ParsePosition;Ljava/util/Locale;Z)Lnet/time4j/calendar/c;
    //   701: areturn
    //   702: aload_1
    //   703: iload #5
    //   705: invokevirtual setErrorIndex : (I)V
    //   708: aconst_null
    //   709: areturn
    //   710: aload_1
    //   711: iload #5
    //   713: invokevirtual setErrorIndex : (I)V
    //   716: aconst_null
    //   717: areturn
  }
  
  public static c a(c paramc, b paramb) {
    int i = paramc.ordinal();
    return g(i + 1 + net.time4j.c1.c.b((paramb.ordinal() - i) * 25, 60));
  }
  
  public static c g(int paramInt) {
    if (paramInt >= 1 && paramInt <= 60)
      return o[paramInt - 1]; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Out of range: ");
    stringBuilder.append(paramInt);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  private Object readResolve() {
    return g(this.year);
  }
  
  public int a(c paramc) {
    return this.year - paramc.year;
  }
  
  public String a(Locale paramLocale) {
    String str;
    c c1 = c();
    b b = a();
    if (r.contains(paramLocale.getLanguage())) {
      str = "";
    } else {
      str = "-";
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(c1.a(paramLocale));
    stringBuilder.append(str);
    stringBuilder.append(b.a(paramLocale));
    return stringBuilder.toString();
  }
  
  public b a() {
    int j = this.year % 12;
    int i = j;
    if (j == 0)
      i = 12; 
    return b.values()[i - 1];
  }
  
  public int b() {
    return this.year;
  }
  
  public c c() {
    int j = this.year % 10;
    int i = j;
    if (j == 0)
      i = 10; 
    return c.values()[i - 1];
  }
  
  public boolean equals(Object paramObject) {
    boolean bool = paramObject instanceof c;
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (bool) {
      bool1 = bool2;
      if (this.year == ((c)paramObject).year)
        bool1 = true; 
    } 
    return bool1;
  }
  
  public j f(int paramInt) {
    if (paramInt >= 1)
      return new a(this, paramInt); 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Cycle number must not be smaller than 1: ");
    stringBuilder.append(paramInt);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public int hashCode() {
    return this.year;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(a(Locale.ROOT));
    stringBuilder.append("(");
    stringBuilder.append(String.valueOf(this.year));
    stringBuilder.append(")");
    return stringBuilder.toString();
  }
  
  static {
    int i = 0;
  }
  
  class a extends j {
    a(c this$0, int param1Int) {}
    
    public int b() {
      return (this.a - 1) * 60 + c.b(this.b) - 1;
    }
  }
  
  public enum b {
    c, d, e, f, g, h, i, j, k, l, m, n;
    
    public String a(Locale param1Locale) {
      String str2 = param1Locale.getLanguage();
      Map map = c.r();
      String str1 = str2;
      if (str2.isEmpty())
        str1 = "root"; 
      String[] arrayOfString2 = (String[])map.get(str1);
      String[] arrayOfString1 = arrayOfString2;
      if (arrayOfString2 == null)
        arrayOfString1 = c.s(); 
      return arrayOfString1[ordinal()];
    }
  }
  
  public enum c {
    c, d, e, f, g, h, i, j, k, l;
    
    public String a(Locale param1Locale) {
      String str2 = param1Locale.getLanguage();
      Map map = c.d();
      String str1 = str2;
      if (str2.isEmpty())
        str1 = "root"; 
      String[] arrayOfString2 = (String[])map.get(str1);
      String[] arrayOfString1 = arrayOfString2;
      if (arrayOfString2 == null)
        arrayOfString1 = c.q(); 
      return arrayOfString1[ordinal()];
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/calendar/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */