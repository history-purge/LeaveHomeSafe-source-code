package e.a.a.j;

import e.a.a.b;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public final class c {
  public static b a(String paramString) {
    i i = new i();
    a(paramString, i);
    return i;
  }
  
  public static b a(String paramString, b paramb) {
    // Byte code:
    //   0: aload_0
    //   1: ifnull -> 832
    //   4: aload_0
    //   5: invokevirtual length : ()I
    //   8: ifne -> 13
    //   11: aload_1
    //   12: areturn
    //   13: new e/a/a/j/g
    //   16: dup
    //   17: aload_0
    //   18: invokespecial <init> : (Ljava/lang/String;)V
    //   21: astore_0
    //   22: iconst_0
    //   23: istore #6
    //   25: aload_0
    //   26: iconst_0
    //   27: invokevirtual a : (I)C
    //   30: bipush #45
    //   32: if_icmpne -> 39
    //   35: aload_0
    //   36: invokevirtual d : ()V
    //   39: aload_0
    //   40: ldc 'Invalid year in date string'
    //   42: sipush #9999
    //   45: invokevirtual a : (Ljava/lang/String;I)I
    //   48: istore_3
    //   49: aload_0
    //   50: invokevirtual b : ()Z
    //   53: ifeq -> 79
    //   56: aload_0
    //   57: invokevirtual a : ()C
    //   60: bipush #45
    //   62: if_icmpne -> 68
    //   65: goto -> 79
    //   68: new e/a/a/d
    //   71: dup
    //   72: ldc 'Invalid date string, after year'
    //   74: iconst_5
    //   75: invokespecial <init> : (Ljava/lang/String;I)V
    //   78: athrow
    //   79: iload_3
    //   80: istore_2
    //   81: aload_0
    //   82: iconst_0
    //   83: invokevirtual a : (I)C
    //   86: bipush #45
    //   88: if_icmpne -> 94
    //   91: iload_3
    //   92: ineg
    //   93: istore_2
    //   94: aload_1
    //   95: iload_2
    //   96: invokeinterface setYear : (I)V
    //   101: aload_0
    //   102: invokevirtual b : ()Z
    //   105: ifne -> 110
    //   108: aload_1
    //   109: areturn
    //   110: aload_0
    //   111: invokevirtual d : ()V
    //   114: aload_0
    //   115: ldc 'Invalid month in date string'
    //   117: bipush #12
    //   119: invokevirtual a : (Ljava/lang/String;I)I
    //   122: istore_2
    //   123: aload_0
    //   124: invokevirtual b : ()Z
    //   127: ifeq -> 153
    //   130: aload_0
    //   131: invokevirtual a : ()C
    //   134: bipush #45
    //   136: if_icmpne -> 142
    //   139: goto -> 153
    //   142: new e/a/a/d
    //   145: dup
    //   146: ldc 'Invalid date string, after month'
    //   148: iconst_5
    //   149: invokespecial <init> : (Ljava/lang/String;I)V
    //   152: athrow
    //   153: aload_1
    //   154: iload_2
    //   155: invokeinterface setMonth : (I)V
    //   160: aload_0
    //   161: invokevirtual b : ()Z
    //   164: ifne -> 169
    //   167: aload_1
    //   168: areturn
    //   169: aload_0
    //   170: invokevirtual d : ()V
    //   173: aload_0
    //   174: ldc 'Invalid day in date string'
    //   176: bipush #31
    //   178: invokevirtual a : (Ljava/lang/String;I)I
    //   181: istore_2
    //   182: aload_0
    //   183: invokevirtual b : ()Z
    //   186: ifeq -> 212
    //   189: aload_0
    //   190: invokevirtual a : ()C
    //   193: bipush #84
    //   195: if_icmpne -> 201
    //   198: goto -> 212
    //   201: new e/a/a/d
    //   204: dup
    //   205: ldc 'Invalid date string, after day'
    //   207: iconst_5
    //   208: invokespecial <init> : (Ljava/lang/String;I)V
    //   211: athrow
    //   212: aload_1
    //   213: iload_2
    //   214: invokeinterface c : (I)V
    //   219: aload_0
    //   220: invokevirtual b : ()Z
    //   223: ifne -> 228
    //   226: aload_1
    //   227: areturn
    //   228: aload_0
    //   229: invokevirtual d : ()V
    //   232: aload_1
    //   233: aload_0
    //   234: ldc 'Invalid hour in date string'
    //   236: bipush #23
    //   238: invokevirtual a : (Ljava/lang/String;I)I
    //   241: invokeinterface a : (I)V
    //   246: aload_0
    //   247: invokevirtual b : ()Z
    //   250: ifne -> 255
    //   253: aload_1
    //   254: areturn
    //   255: aload_0
    //   256: invokevirtual a : ()C
    //   259: bipush #58
    //   261: if_icmpne -> 341
    //   264: aload_0
    //   265: invokevirtual d : ()V
    //   268: aload_0
    //   269: ldc 'Invalid minute in date string'
    //   271: bipush #59
    //   273: invokevirtual a : (Ljava/lang/String;I)I
    //   276: istore_2
    //   277: aload_0
    //   278: invokevirtual b : ()Z
    //   281: ifeq -> 334
    //   284: aload_0
    //   285: invokevirtual a : ()C
    //   288: bipush #58
    //   290: if_icmpeq -> 334
    //   293: aload_0
    //   294: invokevirtual a : ()C
    //   297: bipush #90
    //   299: if_icmpeq -> 334
    //   302: aload_0
    //   303: invokevirtual a : ()C
    //   306: bipush #43
    //   308: if_icmpeq -> 334
    //   311: aload_0
    //   312: invokevirtual a : ()C
    //   315: bipush #45
    //   317: if_icmpne -> 323
    //   320: goto -> 334
    //   323: new e/a/a/d
    //   326: dup
    //   327: ldc 'Invalid date string, after minute'
    //   329: iconst_5
    //   330: invokespecial <init> : (Ljava/lang/String;I)V
    //   333: athrow
    //   334: aload_1
    //   335: iload_2
    //   336: invokeinterface b : (I)V
    //   341: aload_0
    //   342: invokevirtual b : ()Z
    //   345: ifne -> 350
    //   348: aload_1
    //   349: areturn
    //   350: aload_0
    //   351: invokevirtual b : ()Z
    //   354: ifeq -> 583
    //   357: aload_0
    //   358: invokevirtual a : ()C
    //   361: bipush #58
    //   363: if_icmpne -> 583
    //   366: aload_0
    //   367: invokevirtual d : ()V
    //   370: aload_0
    //   371: ldc 'Invalid whole seconds in date string'
    //   373: bipush #59
    //   375: invokevirtual a : (Ljava/lang/String;I)I
    //   378: istore_2
    //   379: aload_0
    //   380: invokevirtual b : ()Z
    //   383: ifeq -> 436
    //   386: aload_0
    //   387: invokevirtual a : ()C
    //   390: bipush #46
    //   392: if_icmpeq -> 436
    //   395: aload_0
    //   396: invokevirtual a : ()C
    //   399: bipush #90
    //   401: if_icmpeq -> 436
    //   404: aload_0
    //   405: invokevirtual a : ()C
    //   408: bipush #43
    //   410: if_icmpeq -> 436
    //   413: aload_0
    //   414: invokevirtual a : ()C
    //   417: bipush #45
    //   419: if_icmpne -> 425
    //   422: goto -> 436
    //   425: new e/a/a/d
    //   428: dup
    //   429: ldc 'Invalid date string, after whole seconds'
    //   431: iconst_5
    //   432: invokespecial <init> : (Ljava/lang/String;I)V
    //   435: athrow
    //   436: aload_1
    //   437: iload_2
    //   438: invokeinterface d : (I)V
    //   443: aload_0
    //   444: invokevirtual a : ()C
    //   447: bipush #46
    //   449: if_icmpne -> 624
    //   452: aload_0
    //   453: invokevirtual d : ()V
    //   456: aload_0
    //   457: invokevirtual c : ()I
    //   460: istore_2
    //   461: aload_0
    //   462: ldc 'Invalid fractional seconds in date string'
    //   464: ldc 999999999
    //   466: invokevirtual a : (Ljava/lang/String;I)I
    //   469: istore_3
    //   470: aload_0
    //   471: invokevirtual b : ()Z
    //   474: ifeq -> 518
    //   477: aload_0
    //   478: invokevirtual a : ()C
    //   481: bipush #90
    //   483: if_icmpeq -> 518
    //   486: aload_0
    //   487: invokevirtual a : ()C
    //   490: bipush #43
    //   492: if_icmpeq -> 518
    //   495: aload_0
    //   496: invokevirtual a : ()C
    //   499: bipush #45
    //   501: if_icmpne -> 507
    //   504: goto -> 518
    //   507: new e/a/a/d
    //   510: dup
    //   511: ldc 'Invalid date string, after fractional second'
    //   513: iconst_5
    //   514: invokespecial <init> : (Ljava/lang/String;I)V
    //   517: athrow
    //   518: aload_0
    //   519: invokevirtual c : ()I
    //   522: iload_2
    //   523: isub
    //   524: istore_2
    //   525: iload_3
    //   526: istore #4
    //   528: iload_2
    //   529: istore #5
    //   531: iload_2
    //   532: bipush #9
    //   534: if_icmple -> 549
    //   537: iload_3
    //   538: bipush #10
    //   540: idiv
    //   541: istore_3
    //   542: iload_2
    //   543: iconst_1
    //   544: isub
    //   545: istore_2
    //   546: goto -> 525
    //   549: iload #5
    //   551: bipush #9
    //   553: if_icmpge -> 572
    //   556: iload #4
    //   558: bipush #10
    //   560: imul
    //   561: istore #4
    //   563: iload #5
    //   565: iconst_1
    //   566: iadd
    //   567: istore #5
    //   569: goto -> 549
    //   572: aload_1
    //   573: iload #4
    //   575: invokeinterface e : (I)V
    //   580: goto -> 624
    //   583: aload_0
    //   584: invokevirtual a : ()C
    //   587: bipush #90
    //   589: if_icmpeq -> 624
    //   592: aload_0
    //   593: invokevirtual a : ()C
    //   596: bipush #43
    //   598: if_icmpeq -> 624
    //   601: aload_0
    //   602: invokevirtual a : ()C
    //   605: bipush #45
    //   607: if_icmpne -> 613
    //   610: goto -> 624
    //   613: new e/a/a/d
    //   616: dup
    //   617: ldc 'Invalid date string, after time'
    //   619: iconst_5
    //   620: invokespecial <init> : (Ljava/lang/String;I)V
    //   623: athrow
    //   624: aload_0
    //   625: invokevirtual b : ()Z
    //   628: ifne -> 633
    //   631: aload_1
    //   632: areturn
    //   633: aload_0
    //   634: invokevirtual a : ()C
    //   637: bipush #90
    //   639: if_icmpne -> 649
    //   642: aload_0
    //   643: invokevirtual d : ()V
    //   646: goto -> 766
    //   649: aload_0
    //   650: invokevirtual b : ()Z
    //   653: ifeq -> 766
    //   656: aload_0
    //   657: invokevirtual a : ()C
    //   660: bipush #43
    //   662: if_icmpne -> 670
    //   665: iconst_1
    //   666: istore_2
    //   667: goto -> 681
    //   670: aload_0
    //   671: invokevirtual a : ()C
    //   674: bipush #45
    //   676: if_icmpne -> 755
    //   679: iconst_m1
    //   680: istore_2
    //   681: aload_0
    //   682: invokevirtual d : ()V
    //   685: aload_0
    //   686: ldc 'Invalid time zone hour in date string'
    //   688: bipush #23
    //   690: invokevirtual a : (Ljava/lang/String;I)I
    //   693: istore #7
    //   695: iload #7
    //   697: istore #4
    //   699: iload_2
    //   700: istore_3
    //   701: iload #6
    //   703: istore #5
    //   705: aload_0
    //   706: invokevirtual b : ()Z
    //   709: ifeq -> 775
    //   712: aload_0
    //   713: invokevirtual a : ()C
    //   716: bipush #58
    //   718: if_icmpne -> 744
    //   721: aload_0
    //   722: invokevirtual d : ()V
    //   725: aload_0
    //   726: ldc 'Invalid time zone minute in date string'
    //   728: bipush #59
    //   730: invokevirtual a : (Ljava/lang/String;I)I
    //   733: istore #5
    //   735: iload #7
    //   737: istore #4
    //   739: iload_2
    //   740: istore_3
    //   741: goto -> 775
    //   744: new e/a/a/d
    //   747: dup
    //   748: ldc 'Invalid date string, after time zone hour'
    //   750: iconst_5
    //   751: invokespecial <init> : (Ljava/lang/String;I)V
    //   754: athrow
    //   755: new e/a/a/d
    //   758: dup
    //   759: ldc 'Time zone must begin with 'Z', '+', or '-''
    //   761: iconst_5
    //   762: invokespecial <init> : (Ljava/lang/String;I)V
    //   765: athrow
    //   766: iconst_0
    //   767: istore #4
    //   769: iconst_0
    //   770: istore_3
    //   771: iload #6
    //   773: istore #5
    //   775: aload_1
    //   776: new java/util/SimpleTimeZone
    //   779: dup
    //   780: iload #4
    //   782: sipush #3600
    //   785: imul
    //   786: sipush #1000
    //   789: imul
    //   790: iload #5
    //   792: bipush #60
    //   794: imul
    //   795: sipush #1000
    //   798: imul
    //   799: iadd
    //   800: iload_3
    //   801: imul
    //   802: ldc ''
    //   804: invokespecial <init> : (ILjava/lang/String;)V
    //   807: invokeinterface setTimeZone : (Ljava/util/TimeZone;)V
    //   812: aload_0
    //   813: invokevirtual b : ()Z
    //   816: ifne -> 821
    //   819: aload_1
    //   820: areturn
    //   821: new e/a/a/d
    //   824: dup
    //   825: ldc 'Invalid date string, extra chars at end'
    //   827: iconst_5
    //   828: invokespecial <init> : (Ljava/lang/String;I)V
    //   831: athrow
    //   832: new e/a/a/d
    //   835: dup
    //   836: ldc 'Parameter must not be null'
    //   838: iconst_4
    //   839: invokespecial <init> : (Ljava/lang/String;I)V
    //   842: astore_0
    //   843: goto -> 848
    //   846: aload_0
    //   847: athrow
    //   848: goto -> 846
  }
  
  public static String a(b paramb) {
    StringBuffer stringBuffer = new StringBuffer();
    if (paramb.o()) {
      DecimalFormat decimalFormat = new DecimalFormat("0000", new DecimalFormatSymbols(Locale.ENGLISH));
      stringBuffer.append(decimalFormat.format(paramb.getYear()));
      if (paramb.getMonth() == 0)
        return stringBuffer.toString(); 
      decimalFormat.applyPattern("'-'00");
      stringBuffer.append(decimalFormat.format(paramb.getMonth()));
      if (paramb.getDay() == 0)
        return stringBuffer.toString(); 
      stringBuffer.append(decimalFormat.format(paramb.getDay()));
      if (paramb.m()) {
        stringBuffer.append('T');
        decimalFormat.applyPattern("00");
        stringBuffer.append(decimalFormat.format(paramb.getHour()));
        stringBuffer.append(':');
        stringBuffer.append(decimalFormat.format(paramb.getMinute()));
        if (paramb.getSecond() != 0 || paramb.i() != 0) {
          double d1 = paramb.getSecond();
          double d2 = paramb.i();
          Double.isNaN(d2);
          d2 /= 1.0E9D;
          Double.isNaN(d1);
          decimalFormat.applyPattern(":00.#########");
          stringBuffer.append(decimalFormat.format(d1 + d2));
        } 
        if (paramb.k()) {
          long l = paramb.l().getTimeInMillis();
          int i = paramb.getTimeZone().getOffset(l);
          if (i == 0) {
            stringBuffer.append('Z');
          } else {
            int j = i / 3600000;
            i = Math.abs(i % 3600000 / 60000);
            decimalFormat.applyPattern("+00;-00");
            stringBuffer.append(decimalFormat.format(j));
            decimalFormat.applyPattern(":00");
            stringBuffer.append(decimalFormat.format(i));
          } 
        } 
      } 
    } 
    return stringBuffer.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/a/a/j/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */