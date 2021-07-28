package com.horcrux.svg;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;

class h {
  static final h p = new h();
  
  final double a = 12.0D;
  
  final String b = "";
  
  final k0 c = k0.c;
  
  final ReadableMap d = null;
  
  m0 e = m0.c;
  
  int f = 400;
  
  final String g = "";
  
  final String h = "";
  
  final l0 i = l0.c;
  
  final n0 j = n0.c;
  
  private final o0 k = o0.c;
  
  final double l = 0.0D;
  
  final double m = 0.0D;
  
  final double n = 0.0D;
  
  final boolean o = false;
  
  private h() {}
  
  h(ReadableMap paramReadableMap, h paramh, double paramDouble) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_2
    //   5: getfield a : D
    //   8: dstore #5
    //   10: aload_1
    //   11: ldc 'fontSize'
    //   13: invokeinterface hasKey : (Ljava/lang/String;)Z
    //   18: ifeq -> 40
    //   21: aload_0
    //   22: aload_0
    //   23: aload_1
    //   24: ldc 'fontSize'
    //   26: dconst_1
    //   27: dload #5
    //   29: dload #5
    //   31: invokespecial a : (Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;DDD)D
    //   34: putfield a : D
    //   37: goto -> 46
    //   40: aload_0
    //   41: dload #5
    //   43: putfield a : D
    //   46: aload_1
    //   47: ldc 'fontWeight'
    //   49: invokeinterface hasKey : (Ljava/lang/String;)Z
    //   54: ifeq -> 151
    //   57: aload_1
    //   58: ldc 'fontWeight'
    //   60: invokeinterface getType : (Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableType;
    //   65: getstatic com/facebook/react/bridge/ReadableType.Number : Lcom/facebook/react/bridge/ReadableType;
    //   68: if_acmpne -> 91
    //   71: aload_1
    //   72: ldc 'fontWeight'
    //   74: invokeinterface getDouble : (Ljava/lang/String;)D
    //   79: dstore #5
    //   81: aload_0
    //   82: aload_2
    //   83: dload #5
    //   85: invokespecial a : (Lcom/horcrux/svg/h;D)V
    //   88: goto -> 156
    //   91: aload_1
    //   92: ldc 'fontWeight'
    //   94: invokeinterface getString : (Ljava/lang/String;)Ljava/lang/String;
    //   99: astore #9
    //   101: aload #9
    //   103: invokestatic b : (Ljava/lang/String;)Z
    //   106: ifeq -> 136
    //   109: aload_0
    //   110: aload #9
    //   112: invokestatic a : (Ljava/lang/String;)Lcom/horcrux/svg/m0;
    //   115: aload_2
    //   116: invokestatic a : (Lcom/horcrux/svg/m0;Lcom/horcrux/svg/h;)I
    //   119: putfield f : I
    //   122: aload_0
    //   123: aload_0
    //   124: getfield f : I
    //   127: invokestatic c : (I)Lcom/horcrux/svg/m0;
    //   130: putfield e : Lcom/horcrux/svg/m0;
    //   133: goto -> 156
    //   136: aload #9
    //   138: ifnull -> 151
    //   141: aload #9
    //   143: invokestatic parseDouble : (Ljava/lang/String;)D
    //   146: dstore #5
    //   148: goto -> 81
    //   151: aload_0
    //   152: aload_2
    //   153: invokespecial a : (Lcom/horcrux/svg/h;)V
    //   156: aload_1
    //   157: ldc 'fontData'
    //   159: invokeinterface hasKey : (Ljava/lang/String;)Z
    //   164: ifeq -> 180
    //   167: aload_1
    //   168: ldc 'fontData'
    //   170: invokeinterface getMap : (Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableMap;
    //   175: astore #9
    //   177: goto -> 186
    //   180: aload_2
    //   181: getfield d : Lcom/facebook/react/bridge/ReadableMap;
    //   184: astore #9
    //   186: aload_0
    //   187: aload #9
    //   189: putfield d : Lcom/facebook/react/bridge/ReadableMap;
    //   192: aload_1
    //   193: ldc 'fontFamily'
    //   195: invokeinterface hasKey : (Ljava/lang/String;)Z
    //   200: ifeq -> 216
    //   203: aload_1
    //   204: ldc 'fontFamily'
    //   206: invokeinterface getString : (Ljava/lang/String;)Ljava/lang/String;
    //   211: astore #9
    //   213: goto -> 222
    //   216: aload_2
    //   217: getfield b : Ljava/lang/String;
    //   220: astore #9
    //   222: aload_0
    //   223: aload #9
    //   225: putfield b : Ljava/lang/String;
    //   228: aload_1
    //   229: ldc 'fontStyle'
    //   231: invokeinterface hasKey : (Ljava/lang/String;)Z
    //   236: ifeq -> 255
    //   239: aload_1
    //   240: ldc 'fontStyle'
    //   242: invokeinterface getString : (Ljava/lang/String;)Ljava/lang/String;
    //   247: invokestatic valueOf : (Ljava/lang/String;)Lcom/horcrux/svg/k0;
    //   250: astore #9
    //   252: goto -> 261
    //   255: aload_2
    //   256: getfield c : Lcom/horcrux/svg/k0;
    //   259: astore #9
    //   261: aload_0
    //   262: aload #9
    //   264: putfield c : Lcom/horcrux/svg/k0;
    //   267: aload_1
    //   268: ldc 'fontFeatureSettings'
    //   270: invokeinterface hasKey : (Ljava/lang/String;)Z
    //   275: ifeq -> 291
    //   278: aload_1
    //   279: ldc 'fontFeatureSettings'
    //   281: invokeinterface getString : (Ljava/lang/String;)Ljava/lang/String;
    //   286: astore #9
    //   288: goto -> 297
    //   291: aload_2
    //   292: getfield g : Ljava/lang/String;
    //   295: astore #9
    //   297: aload_0
    //   298: aload #9
    //   300: putfield g : Ljava/lang/String;
    //   303: aload_1
    //   304: ldc 'fontVariationSettings'
    //   306: invokeinterface hasKey : (Ljava/lang/String;)Z
    //   311: ifeq -> 327
    //   314: aload_1
    //   315: ldc 'fontVariationSettings'
    //   317: invokeinterface getString : (Ljava/lang/String;)Ljava/lang/String;
    //   322: astore #9
    //   324: goto -> 333
    //   327: aload_2
    //   328: getfield h : Ljava/lang/String;
    //   331: astore #9
    //   333: aload_0
    //   334: aload #9
    //   336: putfield h : Ljava/lang/String;
    //   339: aload_1
    //   340: ldc 'fontVariantLigatures'
    //   342: invokeinterface hasKey : (Ljava/lang/String;)Z
    //   347: ifeq -> 366
    //   350: aload_1
    //   351: ldc 'fontVariantLigatures'
    //   353: invokeinterface getString : (Ljava/lang/String;)Ljava/lang/String;
    //   358: invokestatic valueOf : (Ljava/lang/String;)Lcom/horcrux/svg/l0;
    //   361: astore #9
    //   363: goto -> 372
    //   366: aload_2
    //   367: getfield i : Lcom/horcrux/svg/l0;
    //   370: astore #9
    //   372: aload_0
    //   373: aload #9
    //   375: putfield i : Lcom/horcrux/svg/l0;
    //   378: aload_1
    //   379: ldc 'textAnchor'
    //   381: invokeinterface hasKey : (Ljava/lang/String;)Z
    //   386: ifeq -> 405
    //   389: aload_1
    //   390: ldc 'textAnchor'
    //   392: invokeinterface getString : (Ljava/lang/String;)Ljava/lang/String;
    //   397: invokestatic valueOf : (Ljava/lang/String;)Lcom/horcrux/svg/n0;
    //   400: astore #9
    //   402: goto -> 411
    //   405: aload_2
    //   406: getfield j : Lcom/horcrux/svg/n0;
    //   409: astore #9
    //   411: aload_0
    //   412: aload #9
    //   414: putfield j : Lcom/horcrux/svg/n0;
    //   417: aload_1
    //   418: ldc 'textDecoration'
    //   420: invokeinterface hasKey : (Ljava/lang/String;)Z
    //   425: ifeq -> 444
    //   428: aload_1
    //   429: ldc 'textDecoration'
    //   431: invokeinterface getString : (Ljava/lang/String;)Ljava/lang/String;
    //   436: invokestatic a : (Ljava/lang/String;)Lcom/horcrux/svg/o0;
    //   439: astore #9
    //   441: goto -> 450
    //   444: aload_2
    //   445: getfield k : Lcom/horcrux/svg/o0;
    //   448: astore #9
    //   450: aload_0
    //   451: aload #9
    //   453: putfield k : Lcom/horcrux/svg/o0;
    //   456: aload_1
    //   457: ldc 'kerning'
    //   459: invokeinterface hasKey : (Ljava/lang/String;)Z
    //   464: istore #8
    //   466: iload #8
    //   468: ifne -> 487
    //   471: aload_2
    //   472: getfield o : Z
    //   475: ifeq -> 481
    //   478: goto -> 487
    //   481: iconst_0
    //   482: istore #7
    //   484: goto -> 490
    //   487: iconst_1
    //   488: istore #7
    //   490: aload_0
    //   491: iload #7
    //   493: putfield o : Z
    //   496: iload #8
    //   498: ifeq -> 519
    //   501: aload_0
    //   502: aload_1
    //   503: ldc 'kerning'
    //   505: dload_3
    //   506: aload_0
    //   507: getfield a : D
    //   510: dconst_0
    //   511: invokespecial a : (Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;DDD)D
    //   514: dstore #5
    //   516: goto -> 525
    //   519: aload_2
    //   520: getfield l : D
    //   523: dstore #5
    //   525: aload_0
    //   526: dload #5
    //   528: putfield l : D
    //   531: aload_1
    //   532: ldc 'wordSpacing'
    //   534: invokeinterface hasKey : (Ljava/lang/String;)Z
    //   539: ifeq -> 560
    //   542: aload_0
    //   543: aload_1
    //   544: ldc 'wordSpacing'
    //   546: dload_3
    //   547: aload_0
    //   548: getfield a : D
    //   551: dconst_0
    //   552: invokespecial a : (Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;DDD)D
    //   555: dstore #5
    //   557: goto -> 566
    //   560: aload_2
    //   561: getfield m : D
    //   564: dstore #5
    //   566: aload_0
    //   567: dload #5
    //   569: putfield m : D
    //   572: aload_1
    //   573: ldc 'letterSpacing'
    //   575: invokeinterface hasKey : (Ljava/lang/String;)Z
    //   580: ifeq -> 600
    //   583: aload_0
    //   584: aload_1
    //   585: ldc 'letterSpacing'
    //   587: dload_3
    //   588: aload_0
    //   589: getfield a : D
    //   592: dconst_0
    //   593: invokespecial a : (Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;DDD)D
    //   596: dstore_3
    //   597: goto -> 605
    //   600: aload_2
    //   601: getfield n : D
    //   604: dstore_3
    //   605: aload_0
    //   606: dload_3
    //   607: putfield n : D
    //   610: return
  }
  
  private double a(ReadableMap paramReadableMap, String paramString, double paramDouble1, double paramDouble2, double paramDouble3) {
    return (paramReadableMap.getType(paramString) == ReadableType.Number) ? paramReadableMap.getDouble(paramString) : w.a(paramReadableMap.getString(paramString), paramDouble3, paramDouble1, paramDouble2);
  }
  
  private void a(h paramh) {
    this.f = paramh.f;
    this.e = paramh.e;
  }
  
  private void a(h paramh, double paramDouble) {
    long l = Math.round(paramDouble);
    if (l >= 1L && l <= 1000L) {
      this.f = (int)l;
      this.e = a.c(this.f);
      return;
    } 
    a(paramh);
  }
  
  static class a {
    private static final m0[] a;
    
    private static final int[] b = new int[] { 
        400, 700, 100, 200, 300, 400, 500, 600, 700, 800, 
        900 };
    
    private static int a(int param1Int) {
      return (param1Int < 350) ? 400 : ((param1Int < 550) ? 700 : ((param1Int < 900) ? 900 : param1Int));
    }
    
    static int a(m0 param1m0, h param1h) {
      return (param1m0 == m0.n) ? a(param1h.f) : ((param1m0 == m0.o) ? b(param1h.f) : b[param1m0.ordinal()]);
    }
    
    private static int b(int param1Int) {
      return (param1Int < 100) ? param1Int : ((param1Int < 550) ? 100 : ((param1Int < 750) ? 400 : 700));
    }
    
    static m0 c(int param1Int) {
      return a[Math.round(param1Int / 100.0F)];
    }
    
    static {
      m0 m01 = m0.e;
      m0 m02 = m0.f;
      m0 m03 = m0.g;
      m0 m04 = m0.c;
      m0 m05 = m0.i;
      m0 m06 = m0.j;
      m0 m07 = m0.d;
      m0 m08 = m0.l;
      m0 m09 = m0.m;
      a = new m0[] { 
          m01, m01, m02, m03, m04, m05, m06, m07, m08, m09, 
          m09 };
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/horcrux/svg/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */