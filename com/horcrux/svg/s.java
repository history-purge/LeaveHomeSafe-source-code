package com.horcrux.svg;

import android.graphics.Path;
import java.util.ArrayList;

class s {
  static float a;
  
  private static int b;
  
  private static int c;
  
  private static String d;
  
  private static Path e;
  
  static ArrayList<r> f;
  
  private static float g;
  
  private static float h;
  
  private static float i;
  
  private static float j;
  
  private static float k;
  
  private static float l;
  
  private static boolean m;
  
  private static double a(double paramDouble) {
    double d = Math.pow(10.0D, 4.0D);
    paramDouble = Math.round(paramDouble * d);
    Double.isNaN(paramDouble);
    return paramDouble / d;
  }
  
  static Path a(String paramString) {
    f = new ArrayList<r>();
    e = new Path();
    if (paramString == null)
      return e; 
    c = paramString.length();
    d = paramString;
    b = 0;
    g = 0.0F;
    h = 0.0F;
    i = 0.0F;
    j = 0.0F;
    k = 0.0F;
    l = 0.0F;
    m = false;
    byte b = 32;
    while (true) {
      while (true)
        break; 
      if (SYNTHETIC_LOCAL_VARIABLE_5 != null) {
        if (SYNTHETIC_LOCAL_VARIABLE_6 != null) {
          b = 77;
          continue;
        } 
        b = 109;
      } 
    } 
    return e;
  }
  
  private static void a() {
    if (m) {
      g = k;
      h = l;
      m = false;
      e.close();
      f.add(new r(f.g, new v[] { new v(g, h) }));
    } 
  }
  
  private static void a(float paramFloat1, float paramFloat2) {
    b(paramFloat1 + g, paramFloat2 + h);
  }
  
  private static void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
    float f1 = g;
    float f2 = h;
    b(paramFloat1 + f1, paramFloat2 + f2, paramFloat3 + f1, paramFloat4 + f2);
  }
  
  private static void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
    f();
    g = paramFloat5;
    h = paramFloat6;
    Path path = e;
    float f = a;
    path.cubicTo(paramFloat1 * f, paramFloat2 * f, paramFloat3 * f, paramFloat4 * f, paramFloat5 * f, paramFloat6 * f);
    f.add(new r(f.c, new v[] { new v(paramFloat1, paramFloat2), new v(paramFloat3, paramFloat4), new v(paramFloat5, paramFloat6) }));
  }
  
  private static void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, boolean paramBoolean, float paramFloat7) {
    // Byte code:
    //   0: fload #7
    //   2: f2d
    //   3: dstore #8
    //   5: dload #8
    //   7: invokestatic cos : (D)D
    //   10: d2f
    //   11: fstore #10
    //   13: dload #8
    //   15: invokestatic sin : (D)D
    //   18: d2f
    //   19: fstore #11
    //   21: fload #10
    //   23: fload_2
    //   24: fmul
    //   25: fstore #13
    //   27: fload #11
    //   29: fneg
    //   30: fload_3
    //   31: fmul
    //   32: fstore #7
    //   34: fload #11
    //   36: fload_2
    //   37: fmul
    //   38: fstore #14
    //   40: fload #10
    //   42: fload_3
    //   43: fmul
    //   44: fstore_3
    //   45: fload #5
    //   47: fload #4
    //   49: fsub
    //   50: fstore #5
    //   52: fload #5
    //   54: fconst_0
    //   55: fcmpg
    //   56: ifge -> 90
    //   59: iload #6
    //   61: ifeq -> 90
    //   64: fload #5
    //   66: f2d
    //   67: dstore #8
    //   69: dload #8
    //   71: invokestatic isNaN : (D)Z
    //   74: pop
    //   75: dload #8
    //   77: ldc2_w 6.283185307179586
    //   80: dadd
    //   81: dstore #8
    //   83: dload #8
    //   85: d2f
    //   86: fstore_2
    //   87: goto -> 130
    //   90: fload #5
    //   92: fstore_2
    //   93: fload #5
    //   95: fconst_0
    //   96: fcmpl
    //   97: ifle -> 130
    //   100: fload #5
    //   102: fstore_2
    //   103: iload #6
    //   105: ifne -> 130
    //   108: fload #5
    //   110: f2d
    //   111: dstore #8
    //   113: dload #8
    //   115: invokestatic isNaN : (D)Z
    //   118: pop
    //   119: dload #8
    //   121: ldc2_w 6.283185307179586
    //   124: dsub
    //   125: dstore #8
    //   127: goto -> 83
    //   130: fload_2
    //   131: f2d
    //   132: dstore #8
    //   134: dload #8
    //   136: invokestatic isNaN : (D)Z
    //   139: pop
    //   140: dload #8
    //   142: ldc2_w 1.5707963267948966
    //   145: ddiv
    //   146: invokestatic a : (D)D
    //   149: invokestatic abs : (D)D
    //   152: invokestatic ceil : (D)D
    //   155: d2i
    //   156: istore #21
    //   158: fload_2
    //   159: iload #21
    //   161: i2f
    //   162: fdiv
    //   163: fstore_2
    //   164: fload_2
    //   165: ldc 4.0
    //   167: fdiv
    //   168: f2d
    //   169: invokestatic tan : (D)D
    //   172: ldc2_w 1.3333333333333333
    //   175: dmul
    //   176: d2f
    //   177: fstore #15
    //   179: fload #4
    //   181: f2d
    //   182: dstore #8
    //   184: dload #8
    //   186: invokestatic cos : (D)D
    //   189: d2f
    //   190: fstore #12
    //   192: dload #8
    //   194: invokestatic sin : (D)D
    //   197: d2f
    //   198: fstore #11
    //   200: iconst_0
    //   201: istore #22
    //   203: fload #4
    //   205: fstore #10
    //   207: fload_2
    //   208: fstore #4
    //   210: fload #7
    //   212: fstore_2
    //   213: fload_3
    //   214: fstore #7
    //   216: fload #13
    //   218: fstore_3
    //   219: fload #14
    //   221: fstore #5
    //   223: iload #22
    //   225: iload #21
    //   227: if_icmpge -> 505
    //   230: fload #12
    //   232: fload #15
    //   234: fload #11
    //   236: fmul
    //   237: fsub
    //   238: fstore #14
    //   240: fload #11
    //   242: fload #12
    //   244: fload #15
    //   246: fmul
    //   247: fadd
    //   248: fstore #16
    //   250: fload #10
    //   252: fload #4
    //   254: fadd
    //   255: fstore #10
    //   257: fload #10
    //   259: f2d
    //   260: dstore #8
    //   262: dload #8
    //   264: invokestatic cos : (D)D
    //   267: d2f
    //   268: fstore #12
    //   270: dload #8
    //   272: invokestatic sin : (D)D
    //   275: d2f
    //   276: fstore #11
    //   278: fload #15
    //   280: fload #11
    //   282: fmul
    //   283: fload #12
    //   285: fadd
    //   286: fstore #17
    //   288: fload #11
    //   290: fload #15
    //   292: fload #12
    //   294: fmul
    //   295: fsub
    //   296: fstore #18
    //   298: fload_0
    //   299: fload_3
    //   300: fload #14
    //   302: fmul
    //   303: fadd
    //   304: fload_2
    //   305: fload #16
    //   307: fmul
    //   308: fadd
    //   309: fstore #13
    //   311: fload_1
    //   312: fload #14
    //   314: fload #5
    //   316: fmul
    //   317: fadd
    //   318: fload #16
    //   320: fload #7
    //   322: fmul
    //   323: fadd
    //   324: fstore #14
    //   326: fload_0
    //   327: fload_3
    //   328: fload #17
    //   330: fmul
    //   331: fadd
    //   332: fload_2
    //   333: fload #18
    //   335: fmul
    //   336: fadd
    //   337: fstore #16
    //   339: fload_1
    //   340: fload #17
    //   342: fload #5
    //   344: fmul
    //   345: fadd
    //   346: fload #18
    //   348: fload #7
    //   350: fmul
    //   351: fadd
    //   352: fstore #17
    //   354: fload_0
    //   355: fload_3
    //   356: fload #12
    //   358: fmul
    //   359: fadd
    //   360: fload_2
    //   361: fload #11
    //   363: fmul
    //   364: fadd
    //   365: fstore #18
    //   367: fload_1
    //   368: fload #5
    //   370: fload #12
    //   372: fmul
    //   373: fadd
    //   374: fload #7
    //   376: fload #11
    //   378: fmul
    //   379: fadd
    //   380: fstore #19
    //   382: getstatic com/horcrux/svg/s.e : Landroid/graphics/Path;
    //   385: astore #23
    //   387: getstatic com/horcrux/svg/s.a : F
    //   390: fstore #20
    //   392: aload #23
    //   394: fload #13
    //   396: fload #20
    //   398: fmul
    //   399: fload #14
    //   401: fload #20
    //   403: fmul
    //   404: fload #16
    //   406: fload #20
    //   408: fmul
    //   409: fload #17
    //   411: fload #20
    //   413: fmul
    //   414: fload #18
    //   416: fload #20
    //   418: fmul
    //   419: fload #19
    //   421: fload #20
    //   423: fmul
    //   424: invokevirtual cubicTo : (FFFFFF)V
    //   427: getstatic com/horcrux/svg/s.f : Ljava/util/ArrayList;
    //   430: new com/horcrux/svg/r
    //   433: dup
    //   434: getstatic com/horcrux/svg/f.c : Lcom/horcrux/svg/f;
    //   437: iconst_3
    //   438: anewarray com/horcrux/svg/v
    //   441: dup
    //   442: iconst_0
    //   443: new com/horcrux/svg/v
    //   446: dup
    //   447: fload #13
    //   449: f2d
    //   450: fload #14
    //   452: f2d
    //   453: invokespecial <init> : (DD)V
    //   456: aastore
    //   457: dup
    //   458: iconst_1
    //   459: new com/horcrux/svg/v
    //   462: dup
    //   463: fload #16
    //   465: f2d
    //   466: fload #17
    //   468: f2d
    //   469: invokespecial <init> : (DD)V
    //   472: aastore
    //   473: dup
    //   474: iconst_2
    //   475: new com/horcrux/svg/v
    //   478: dup
    //   479: fload #18
    //   481: f2d
    //   482: fload #19
    //   484: f2d
    //   485: invokespecial <init> : (DD)V
    //   488: aastore
    //   489: invokespecial <init> : (Lcom/horcrux/svg/f;[Lcom/horcrux/svg/v;)V
    //   492: invokevirtual add : (Ljava/lang/Object;)Z
    //   495: pop
    //   496: iload #22
    //   498: iconst_1
    //   499: iadd
    //   500: istore #22
    //   502: goto -> 223
    //   505: return
  }
  
  private static void a(float paramFloat1, float paramFloat2, float paramFloat3, boolean paramBoolean1, boolean paramBoolean2, float paramFloat4, float paramFloat5) {
    b(paramFloat1, paramFloat2, paramFloat3, paramBoolean1, paramBoolean2, paramFloat4 + g, paramFloat5 + h);
  }
  
  private static boolean a(char paramChar) {
    return Character.isUpperCase(paramChar);
  }
  
  private static void b(float paramFloat1, float paramFloat2) {
    f();
    g = paramFloat1;
    i = paramFloat1;
    h = paramFloat2;
    j = paramFloat2;
    Path path = e;
    float f = a;
    path.lineTo(paramFloat1 * f, f * paramFloat2);
    f.add(new r(f.f, new v[] { new v(paramFloat1, paramFloat2) }));
  }
  
  private static void b(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
    i = paramFloat1;
    j = paramFloat2;
    paramFloat1 *= 2.0F;
    float f1 = (paramFloat3 + paramFloat1) / 3.0F;
    paramFloat2 *= 2.0F;
    float f2 = (paramFloat4 + paramFloat2) / 3.0F;
    a((g + paramFloat1) / 3.0F, (h + paramFloat2) / 3.0F, f1, f2, paramFloat3, paramFloat4);
  }
  
  private static void b(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
    float f1 = g;
    float f2 = h;
    c(paramFloat1 + f1, paramFloat2 + f2, paramFloat3 + f1, paramFloat4 + f2, paramFloat5 + f1, paramFloat6 + f2);
  }
  
  private static void b(float paramFloat1, float paramFloat2, float paramFloat3, boolean paramBoolean1, boolean paramBoolean2, float paramFloat4, float paramFloat5) {
    // Byte code:
    //   0: getstatic com/horcrux/svg/s.g : F
    //   3: fstore #11
    //   5: getstatic com/horcrux/svg/s.h : F
    //   8: fstore #10
    //   10: fload_1
    //   11: fconst_0
    //   12: fcmpl
    //   13: ifne -> 36
    //   16: fload_0
    //   17: fconst_0
    //   18: fcmpl
    //   19: ifne -> 31
    //   22: fload #6
    //   24: fload #10
    //   26: fsub
    //   27: fstore_1
    //   28: goto -> 36
    //   31: fload_0
    //   32: fstore_1
    //   33: goto -> 36
    //   36: fload_1
    //   37: invokestatic abs : (F)F
    //   40: fstore #9
    //   42: fload_0
    //   43: fconst_0
    //   44: fcmpl
    //   45: ifne -> 57
    //   48: fload #5
    //   50: fload #11
    //   52: fsub
    //   53: fstore_0
    //   54: goto -> 57
    //   57: fload_0
    //   58: invokestatic abs : (F)F
    //   61: fstore_1
    //   62: fload_1
    //   63: fconst_0
    //   64: fcmpl
    //   65: ifeq -> 683
    //   68: fload #9
    //   70: fconst_0
    //   71: fcmpl
    //   72: ifeq -> 683
    //   75: fload #5
    //   77: fload #11
    //   79: fcmpl
    //   80: ifne -> 94
    //   83: fload #6
    //   85: fload #10
    //   87: fcmpl
    //   88: ifne -> 94
    //   91: goto -> 683
    //   94: fload_2
    //   95: f2d
    //   96: invokestatic toRadians : (D)D
    //   99: d2f
    //   100: fstore #12
    //   102: fload #12
    //   104: f2d
    //   105: dstore #7
    //   107: dload #7
    //   109: invokestatic cos : (D)D
    //   112: d2f
    //   113: fstore #14
    //   115: dload #7
    //   117: invokestatic sin : (D)D
    //   120: d2f
    //   121: fstore #15
    //   123: fload #5
    //   125: fload #11
    //   127: fsub
    //   128: fstore #13
    //   130: fload #6
    //   132: fload #10
    //   134: fsub
    //   135: fstore #6
    //   137: fload #14
    //   139: fload #13
    //   141: fmul
    //   142: fconst_2
    //   143: fdiv
    //   144: fload #15
    //   146: fload #6
    //   148: fmul
    //   149: fconst_2
    //   150: fdiv
    //   151: fadd
    //   152: fstore #5
    //   154: fload #15
    //   156: fneg
    //   157: fstore #16
    //   159: fload #16
    //   161: fload #13
    //   163: fmul
    //   164: fconst_2
    //   165: fdiv
    //   166: fload #14
    //   168: fload #6
    //   170: fmul
    //   171: fconst_2
    //   172: fdiv
    //   173: fadd
    //   174: fstore #17
    //   176: fload_1
    //   177: fload_1
    //   178: fmul
    //   179: fstore #18
    //   181: fload #18
    //   183: fload #9
    //   185: fmul
    //   186: fload #9
    //   188: fmul
    //   189: fstore_0
    //   190: fload #9
    //   192: fload #9
    //   194: fmul
    //   195: fload #5
    //   197: fmul
    //   198: fload #5
    //   200: fmul
    //   201: fstore_2
    //   202: fload #18
    //   204: fload #17
    //   206: fmul
    //   207: fload #17
    //   209: fmul
    //   210: fstore #18
    //   212: fload_0
    //   213: fload #18
    //   215: fsub
    //   216: fload_2
    //   217: fsub
    //   218: fstore #19
    //   220: fload #19
    //   222: fconst_0
    //   223: fcmpg
    //   224: ifge -> 262
    //   227: fconst_1
    //   228: fload #19
    //   230: fload_0
    //   231: fdiv
    //   232: fsub
    //   233: f2d
    //   234: invokestatic sqrt : (D)D
    //   237: d2f
    //   238: fstore_0
    //   239: fload_1
    //   240: fload_0
    //   241: fmul
    //   242: fstore_1
    //   243: fload #9
    //   245: fload_0
    //   246: fmul
    //   247: fstore_0
    //   248: fload #13
    //   250: fconst_2
    //   251: fdiv
    //   252: fstore #5
    //   254: fload #6
    //   256: fconst_2
    //   257: fdiv
    //   258: fstore_2
    //   259: goto -> 341
    //   262: fload #19
    //   264: fload #18
    //   266: fload_2
    //   267: fadd
    //   268: fdiv
    //   269: f2d
    //   270: invokestatic sqrt : (D)D
    //   273: d2f
    //   274: fstore_2
    //   275: fload_2
    //   276: fstore_0
    //   277: iload_3
    //   278: iload #4
    //   280: if_icmpne -> 286
    //   283: fload_2
    //   284: fneg
    //   285: fstore_0
    //   286: fload_0
    //   287: fneg
    //   288: fload #17
    //   290: fmul
    //   291: fload_1
    //   292: fmul
    //   293: fload #9
    //   295: fdiv
    //   296: fstore_2
    //   297: fload_0
    //   298: fload #5
    //   300: fmul
    //   301: fload #9
    //   303: fmul
    //   304: fload_1
    //   305: fdiv
    //   306: fstore_0
    //   307: fload #14
    //   309: fload_2
    //   310: fmul
    //   311: fload #15
    //   313: fload_0
    //   314: fmul
    //   315: fsub
    //   316: fload #13
    //   318: fconst_2
    //   319: fdiv
    //   320: fadd
    //   321: fstore #5
    //   323: fload #6
    //   325: fconst_2
    //   326: fdiv
    //   327: fload_2
    //   328: fload #15
    //   330: fmul
    //   331: fload_0
    //   332: fload #14
    //   334: fmul
    //   335: fadd
    //   336: fadd
    //   337: fstore_2
    //   338: fload #9
    //   340: fstore_0
    //   341: fload #14
    //   343: fload_1
    //   344: fdiv
    //   345: fstore #9
    //   347: fload #15
    //   349: fload_1
    //   350: fdiv
    //   351: fstore #15
    //   353: fload #16
    //   355: fload_0
    //   356: fdiv
    //   357: fstore #16
    //   359: fload #14
    //   361: fload_0
    //   362: fdiv
    //   363: fstore #17
    //   365: fload #5
    //   367: fneg
    //   368: fstore #14
    //   370: fload_2
    //   371: fneg
    //   372: fstore #18
    //   374: fload #16
    //   376: fload #14
    //   378: fmul
    //   379: fload #17
    //   381: fload #18
    //   383: fmul
    //   384: fadd
    //   385: f2d
    //   386: fload #14
    //   388: fload #9
    //   390: fmul
    //   391: fload #18
    //   393: fload #15
    //   395: fmul
    //   396: fadd
    //   397: f2d
    //   398: invokestatic atan2 : (DD)D
    //   401: d2f
    //   402: fstore #14
    //   404: fload #13
    //   406: fload #5
    //   408: fsub
    //   409: fstore #18
    //   411: fload #6
    //   413: fload_2
    //   414: fsub
    //   415: fstore #19
    //   417: fload #16
    //   419: fload #18
    //   421: fmul
    //   422: fload #17
    //   424: fload #19
    //   426: fmul
    //   427: fadd
    //   428: f2d
    //   429: fload #9
    //   431: fload #18
    //   433: fmul
    //   434: fload #15
    //   436: fload #19
    //   438: fmul
    //   439: fadd
    //   440: f2d
    //   441: invokestatic atan2 : (DD)D
    //   444: d2f
    //   445: fstore #15
    //   447: fload #5
    //   449: fload #11
    //   451: fadd
    //   452: fstore #5
    //   454: fload_2
    //   455: fload #10
    //   457: fadd
    //   458: fstore #9
    //   460: fload #13
    //   462: fload #11
    //   464: fadd
    //   465: fstore #11
    //   467: fload #6
    //   469: fload #10
    //   471: fadd
    //   472: fstore #6
    //   474: invokestatic f : ()V
    //   477: fload #11
    //   479: putstatic com/horcrux/svg/s.i : F
    //   482: fload #11
    //   484: putstatic com/horcrux/svg/s.g : F
    //   487: fload #6
    //   489: putstatic com/horcrux/svg/s.j : F
    //   492: fload #6
    //   494: putstatic com/horcrux/svg/s.h : F
    //   497: fload_1
    //   498: fload_0
    //   499: fcmpl
    //   500: ifne -> 665
    //   503: fload #12
    //   505: fconst_0
    //   506: fcmpl
    //   507: ifeq -> 513
    //   510: goto -> 665
    //   513: fload #14
    //   515: f2d
    //   516: invokestatic toDegrees : (D)D
    //   519: d2f
    //   520: fstore #10
    //   522: fload #10
    //   524: fload #15
    //   526: f2d
    //   527: invokestatic toDegrees : (D)D
    //   530: d2f
    //   531: fsub
    //   532: ldc 360.0
    //   534: frem
    //   535: invokestatic abs : (F)F
    //   538: fstore_2
    //   539: iload_3
    //   540: ifeq -> 555
    //   543: fload_2
    //   544: fstore_0
    //   545: fload_2
    //   546: ldc 180.0
    //   548: fcmpg
    //   549: ifge -> 569
    //   552: goto -> 564
    //   555: fload_2
    //   556: fstore_0
    //   557: fload_2
    //   558: ldc 180.0
    //   560: fcmpl
    //   561: ifle -> 569
    //   564: ldc 360.0
    //   566: fload_2
    //   567: fsub
    //   568: fstore_0
    //   569: fload_0
    //   570: fstore_2
    //   571: iload #4
    //   573: ifne -> 579
    //   576: fload_0
    //   577: fneg
    //   578: fstore_2
    //   579: getstatic com/horcrux/svg/s.a : F
    //   582: fstore_0
    //   583: new android/graphics/RectF
    //   586: dup
    //   587: fload #5
    //   589: fload_1
    //   590: fsub
    //   591: fload_0
    //   592: fmul
    //   593: fload #9
    //   595: fload_1
    //   596: fsub
    //   597: fload_0
    //   598: fmul
    //   599: fload #5
    //   601: fload_1
    //   602: fadd
    //   603: fload_0
    //   604: fmul
    //   605: fload #9
    //   607: fload_1
    //   608: fadd
    //   609: fload_0
    //   610: fmul
    //   611: invokespecial <init> : (FFFF)V
    //   614: astore #20
    //   616: getstatic com/horcrux/svg/s.e : Landroid/graphics/Path;
    //   619: aload #20
    //   621: fload #10
    //   623: fload_2
    //   624: invokevirtual arcTo : (Landroid/graphics/RectF;FF)V
    //   627: getstatic com/horcrux/svg/s.f : Ljava/util/ArrayList;
    //   630: new com/horcrux/svg/r
    //   633: dup
    //   634: getstatic com/horcrux/svg/f.c : Lcom/horcrux/svg/f;
    //   637: iconst_1
    //   638: anewarray com/horcrux/svg/v
    //   641: dup
    //   642: iconst_0
    //   643: new com/horcrux/svg/v
    //   646: dup
    //   647: fload #11
    //   649: f2d
    //   650: fload #6
    //   652: f2d
    //   653: invokespecial <init> : (DD)V
    //   656: aastore
    //   657: invokespecial <init> : (Lcom/horcrux/svg/f;[Lcom/horcrux/svg/v;)V
    //   660: invokevirtual add : (Ljava/lang/Object;)Z
    //   663: pop
    //   664: return
    //   665: fload #5
    //   667: fload #9
    //   669: fload_1
    //   670: fload_0
    //   671: fload #14
    //   673: fload #15
    //   675: iload #4
    //   677: fload #12
    //   679: invokestatic a : (FFFFFFZF)V
    //   682: return
    //   683: fload #5
    //   685: fload #6
    //   687: invokestatic b : (FF)V
    //   690: return
  }
  
  private static boolean b() {
    h();
    char c = d.charAt(b);
    boolean bool = false;
    if (c == '0' || c == '1') {
      int i = ++b;
      if (i < c && d.charAt(i) == ',')
        b++; 
      h();
      if (c == '1')
        bool = true; 
      return bool;
    } 
    throw new Error(String.format("Unexpected flag '%c' (i=%d, s=%s)", new Object[] { Character.valueOf(c), Integer.valueOf(b), d }));
  }
  
  private static boolean b(char paramChar) {
    switch (paramChar) {
      default:
        return false;
      case 'A':
      case 'C':
      case 'H':
      case 'L':
      case 'M':
      case 'Q':
      case 'S':
      case 'T':
      case 'V':
      case 'Z':
      case 'a':
      case 'c':
      case 'h':
      case 'l':
      case 'm':
      case 'q':
      case 's':
      case 't':
      case 'v':
      case 'z':
        break;
    } 
    return true;
  }
  
  private static float c() {
    if (b != c) {
      float f = e();
      h();
      d();
      return f;
    } 
    throw new Error(String.format("Unexpected end (s=%s)", new Object[] { d }));
  }
  
  private static void c(float paramFloat1, float paramFloat2) {
    d(paramFloat1 + g, paramFloat2 + h);
  }
  
  private static void c(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
    float f1 = g;
    float f2 = h;
    d(paramFloat1 + f1, paramFloat2 + f2, paramFloat3 + f1, paramFloat4 + f2);
  }
  
  private static void c(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
    i = paramFloat3;
    j = paramFloat4;
    a(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
  }
  
  private static boolean c(char paramChar) {
    return ((paramChar >= '0' && paramChar <= '9') || paramChar == '.' || paramChar == '-' || paramChar == '+');
  }
  
  private static void d() {
    int i = b;
    if (i < c && d.charAt(i) == ',')
      b++; 
  }
  
  private static void d(float paramFloat1, float paramFloat2) {
    g = paramFloat1;
    i = paramFloat1;
    k = paramFloat1;
    h = paramFloat2;
    j = paramFloat2;
    l = paramFloat2;
    Path path = e;
    float f = a;
    path.moveTo(paramFloat1 * f, f * paramFloat2);
    f.add(new r(f.e, new v[] { new v(paramFloat1, paramFloat2) }));
  }
  
  private static void d(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
    float f1 = g;
    float f2 = i;
    float f3 = h;
    float f4 = j;
    i = paramFloat1;
    j = paramFloat2;
    a(f1 * 2.0F - f2, f3 * 2.0F - f4, paramFloat1, paramFloat2, paramFloat3, paramFloat4);
  }
  
  private static float e() {
    // Byte code:
    //   0: invokestatic h : ()V
    //   3: getstatic com/horcrux/svg/s.b : I
    //   6: istore #5
    //   8: iload #5
    //   10: getstatic com/horcrux/svg/s.c : I
    //   13: if_icmpeq -> 422
    //   16: getstatic com/horcrux/svg/s.d : Ljava/lang/String;
    //   19: iload #5
    //   21: invokevirtual charAt : (I)C
    //   24: istore_1
    //   25: iload_1
    //   26: bipush #45
    //   28: if_icmpeq -> 39
    //   31: iload_1
    //   32: istore_0
    //   33: iload_1
    //   34: bipush #43
    //   36: if_icmpne -> 57
    //   39: getstatic com/horcrux/svg/s.b : I
    //   42: iconst_1
    //   43: iadd
    //   44: putstatic com/horcrux/svg/s.b : I
    //   47: getstatic com/horcrux/svg/s.d : Ljava/lang/String;
    //   50: getstatic com/horcrux/svg/s.b : I
    //   53: invokevirtual charAt : (I)C
    //   56: istore_0
    //   57: iload_0
    //   58: bipush #48
    //   60: if_icmplt -> 99
    //   63: iload_0
    //   64: bipush #57
    //   66: if_icmpgt -> 99
    //   69: invokestatic g : ()V
    //   72: getstatic com/horcrux/svg/s.b : I
    //   75: istore #4
    //   77: iload_0
    //   78: istore_3
    //   79: iload #4
    //   81: getstatic com/horcrux/svg/s.c : I
    //   84: if_icmpge -> 107
    //   87: getstatic com/horcrux/svg/s.d : Ljava/lang/String;
    //   90: iload #4
    //   92: invokevirtual charAt : (I)C
    //   95: istore_3
    //   96: goto -> 107
    //   99: iload_0
    //   100: bipush #46
    //   102: if_icmpne -> 382
    //   105: iload_0
    //   106: istore_3
    //   107: iload_3
    //   108: istore #4
    //   110: iload_3
    //   111: bipush #46
    //   113: if_icmpne -> 153
    //   116: getstatic com/horcrux/svg/s.b : I
    //   119: iconst_1
    //   120: iadd
    //   121: putstatic com/horcrux/svg/s.b : I
    //   124: invokestatic g : ()V
    //   127: getstatic com/horcrux/svg/s.b : I
    //   130: istore #6
    //   132: iload_3
    //   133: istore #4
    //   135: iload #6
    //   137: getstatic com/horcrux/svg/s.c : I
    //   140: if_icmpge -> 153
    //   143: getstatic com/horcrux/svg/s.d : Ljava/lang/String;
    //   146: iload #6
    //   148: invokevirtual charAt : (I)C
    //   151: istore #4
    //   153: iload #4
    //   155: bipush #101
    //   157: if_icmpeq -> 167
    //   160: iload #4
    //   162: bipush #69
    //   164: if_icmpne -> 301
    //   167: getstatic com/horcrux/svg/s.b : I
    //   170: istore_3
    //   171: iload_3
    //   172: iconst_1
    //   173: iadd
    //   174: getstatic com/horcrux/svg/s.c : I
    //   177: if_icmpge -> 301
    //   180: getstatic com/horcrux/svg/s.d : Ljava/lang/String;
    //   183: iload_3
    //   184: iconst_1
    //   185: iadd
    //   186: invokevirtual charAt : (I)C
    //   189: istore_3
    //   190: iload_3
    //   191: bipush #109
    //   193: if_icmpeq -> 301
    //   196: iload_3
    //   197: bipush #120
    //   199: if_icmpeq -> 301
    //   202: getstatic com/horcrux/svg/s.b : I
    //   205: iconst_1
    //   206: iadd
    //   207: putstatic com/horcrux/svg/s.b : I
    //   210: getstatic com/horcrux/svg/s.d : Ljava/lang/String;
    //   213: getstatic com/horcrux/svg/s.b : I
    //   216: invokevirtual charAt : (I)C
    //   219: istore_0
    //   220: iload_0
    //   221: bipush #43
    //   223: if_icmpeq -> 290
    //   226: iload_0
    //   227: bipush #45
    //   229: if_icmpne -> 235
    //   232: goto -> 290
    //   235: iload_0
    //   236: bipush #48
    //   238: if_icmplt -> 250
    //   241: iload_0
    //   242: bipush #57
    //   244: if_icmpgt -> 250
    //   247: goto -> 298
    //   250: new java/lang/Error
    //   253: dup
    //   254: ldc_w 'Invalid number formating character '%c' (i=%d, s=%s)'
    //   257: iconst_3
    //   258: anewarray java/lang/Object
    //   261: dup
    //   262: iconst_0
    //   263: iload_0
    //   264: invokestatic valueOf : (C)Ljava/lang/Character;
    //   267: aastore
    //   268: dup
    //   269: iconst_1
    //   270: getstatic com/horcrux/svg/s.b : I
    //   273: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   276: aastore
    //   277: dup
    //   278: iconst_2
    //   279: getstatic com/horcrux/svg/s.d : Ljava/lang/String;
    //   282: aastore
    //   283: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   286: invokespecial <init> : (Ljava/lang/String;)V
    //   289: athrow
    //   290: getstatic com/horcrux/svg/s.b : I
    //   293: iconst_1
    //   294: iadd
    //   295: putstatic com/horcrux/svg/s.b : I
    //   298: invokestatic g : ()V
    //   301: getstatic com/horcrux/svg/s.d : Ljava/lang/String;
    //   304: iload #5
    //   306: getstatic com/horcrux/svg/s.b : I
    //   309: invokevirtual substring : (II)Ljava/lang/String;
    //   312: astore #7
    //   314: aload #7
    //   316: invokestatic parseFloat : (Ljava/lang/String;)F
    //   319: fstore_2
    //   320: fload_2
    //   321: invokestatic isInfinite : (F)Z
    //   324: ifne -> 336
    //   327: fload_2
    //   328: invokestatic isNaN : (F)Z
    //   331: ifne -> 336
    //   334: fload_2
    //   335: freturn
    //   336: new java/lang/Error
    //   339: dup
    //   340: ldc_w 'Invalid number '%s' (start=%d, i=%d, s=%s)'
    //   343: iconst_4
    //   344: anewarray java/lang/Object
    //   347: dup
    //   348: iconst_0
    //   349: aload #7
    //   351: aastore
    //   352: dup
    //   353: iconst_1
    //   354: iload #5
    //   356: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   359: aastore
    //   360: dup
    //   361: iconst_2
    //   362: getstatic com/horcrux/svg/s.b : I
    //   365: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   368: aastore
    //   369: dup
    //   370: iconst_3
    //   371: getstatic com/horcrux/svg/s.d : Ljava/lang/String;
    //   374: aastore
    //   375: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   378: invokespecial <init> : (Ljava/lang/String;)V
    //   381: athrow
    //   382: new java/lang/Error
    //   385: dup
    //   386: ldc_w 'Invalid number formating character '%c' (i=%d, s=%s)'
    //   389: iconst_3
    //   390: anewarray java/lang/Object
    //   393: dup
    //   394: iconst_0
    //   395: iload_0
    //   396: invokestatic valueOf : (C)Ljava/lang/Character;
    //   399: aastore
    //   400: dup
    //   401: iconst_1
    //   402: getstatic com/horcrux/svg/s.b : I
    //   405: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   408: aastore
    //   409: dup
    //   410: iconst_2
    //   411: getstatic com/horcrux/svg/s.d : Ljava/lang/String;
    //   414: aastore
    //   415: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   418: invokespecial <init> : (Ljava/lang/String;)V
    //   421: athrow
    //   422: new java/lang/Error
    //   425: dup
    //   426: ldc_w 'Unexpected end (s=%s)'
    //   429: iconst_1
    //   430: anewarray java/lang/Object
    //   433: dup
    //   434: iconst_0
    //   435: getstatic com/horcrux/svg/s.d : Ljava/lang/String;
    //   438: aastore
    //   439: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   442: invokespecial <init> : (Ljava/lang/String;)V
    //   445: athrow
  }
  
  private static void e(float paramFloat1, float paramFloat2) {
    f(paramFloat1 + g, paramFloat2 + h);
  }
  
  private static void f() {
    if (!m) {
      k = g;
      l = h;
      m = true;
    } 
  }
  
  private static void f(float paramFloat1, float paramFloat2) {
    b(g * 2.0F - i, h * 2.0F - j, paramFloat1, paramFloat2);
  }
  
  private static void g() {
    while (true) {
      int i = b;
      if (i < c && Character.isDigit(d.charAt(i))) {
        b++;
        continue;
      } 
      break;
    } 
  }
  
  private static void h() {
    while (true) {
      int i = b;
      if (i < c && Character.isWhitespace(d.charAt(i))) {
        b++;
        continue;
      } 
      break;
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/horcrux/svg/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */