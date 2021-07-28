package com.horcrux.svg;

import android.graphics.Matrix;
import android.graphics.RectF;

class w0 {
  static Matrix a(RectF paramRectF1, RectF paramRectF2, String paramString, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield left : F
    //   4: f2d
    //   5: dstore #8
    //   7: aload_0
    //   8: getfield top : F
    //   11: f2d
    //   12: dstore #10
    //   14: aload_0
    //   15: invokevirtual width : ()F
    //   18: f2d
    //   19: dstore #12
    //   21: aload_0
    //   22: invokevirtual height : ()F
    //   25: f2d
    //   26: dstore #20
    //   28: aload_1
    //   29: getfield left : F
    //   32: f2d
    //   33: dstore #18
    //   35: aload_1
    //   36: getfield top : F
    //   39: f2d
    //   40: dstore #14
    //   42: aload_1
    //   43: invokevirtual width : ()F
    //   46: f2d
    //   47: dstore #16
    //   49: aload_1
    //   50: invokevirtual height : ()F
    //   53: f2d
    //   54: dstore #22
    //   56: dload #16
    //   58: invokestatic isNaN : (D)Z
    //   61: pop
    //   62: dload #12
    //   64: invokestatic isNaN : (D)Z
    //   67: pop
    //   68: dload #16
    //   70: dload #12
    //   72: ddiv
    //   73: dstore #6
    //   75: dload #22
    //   77: invokestatic isNaN : (D)Z
    //   80: pop
    //   81: dload #20
    //   83: invokestatic isNaN : (D)Z
    //   86: pop
    //   87: dload #22
    //   89: dload #20
    //   91: ddiv
    //   92: dstore #4
    //   94: dload #8
    //   96: invokestatic isNaN : (D)Z
    //   99: pop
    //   100: dload #18
    //   102: invokestatic isNaN : (D)Z
    //   105: pop
    //   106: dload #18
    //   108: dload #8
    //   110: dload #6
    //   112: dmul
    //   113: dsub
    //   114: dstore #8
    //   116: dload #10
    //   118: invokestatic isNaN : (D)Z
    //   121: pop
    //   122: dload #14
    //   124: invokestatic isNaN : (D)Z
    //   127: pop
    //   128: dload #14
    //   130: dload #10
    //   132: dload #4
    //   134: dmul
    //   135: dsub
    //   136: dstore #14
    //   138: iload_3
    //   139: iconst_2
    //   140: if_icmpne -> 298
    //   143: dload #6
    //   145: dload #4
    //   147: invokestatic min : (DD)D
    //   150: dstore #6
    //   152: dload #6
    //   154: dconst_1
    //   155: dcmpl
    //   156: ifle -> 221
    //   159: dload #16
    //   161: invokestatic isNaN : (D)Z
    //   164: pop
    //   165: dload #16
    //   167: dload #6
    //   169: ddiv
    //   170: dstore #4
    //   172: dload #12
    //   174: invokestatic isNaN : (D)Z
    //   177: pop
    //   178: dload #8
    //   180: dload #4
    //   182: dload #12
    //   184: dsub
    //   185: ldc2_w 2.0
    //   188: ddiv
    //   189: dsub
    //   190: dstore #4
    //   192: dload #22
    //   194: invokestatic isNaN : (D)Z
    //   197: pop
    //   198: dload #22
    //   200: dload #6
    //   202: ddiv
    //   203: dstore #8
    //   205: dload #20
    //   207: invokestatic isNaN : (D)Z
    //   210: pop
    //   211: dload #8
    //   213: dload #20
    //   215: dsub
    //   216: dstore #8
    //   218: goto -> 272
    //   221: dload #12
    //   223: invokestatic isNaN : (D)Z
    //   226: pop
    //   227: dload #16
    //   229: invokestatic isNaN : (D)Z
    //   232: pop
    //   233: dload #8
    //   235: dload #16
    //   237: dload #12
    //   239: dload #6
    //   241: dmul
    //   242: dsub
    //   243: ldc2_w 2.0
    //   246: ddiv
    //   247: dsub
    //   248: dstore #4
    //   250: dload #20
    //   252: invokestatic isNaN : (D)Z
    //   255: pop
    //   256: dload #22
    //   258: invokestatic isNaN : (D)Z
    //   261: pop
    //   262: dload #22
    //   264: dload #20
    //   266: dload #6
    //   268: dmul
    //   269: dsub
    //   270: dstore #8
    //   272: dload #14
    //   274: dload #8
    //   276: ldc2_w 2.0
    //   279: ddiv
    //   280: dsub
    //   281: dstore #10
    //   283: dload #6
    //   285: dstore #18
    //   287: dload #6
    //   289: dstore #14
    //   291: dload #4
    //   293: dstore #16
    //   295: goto -> 537
    //   298: aload_2
    //   299: ldc 'none'
    //   301: invokevirtual equals : (Ljava/lang/Object;)Z
    //   304: ifne -> 327
    //   307: iload_3
    //   308: ifne -> 327
    //   311: dload #6
    //   313: dload #4
    //   315: invokestatic min : (DD)D
    //   318: dstore #4
    //   320: dload #4
    //   322: dstore #6
    //   324: goto -> 353
    //   327: aload_2
    //   328: ldc 'none'
    //   330: invokevirtual equals : (Ljava/lang/Object;)Z
    //   333: ifne -> 353
    //   336: iload_3
    //   337: iconst_1
    //   338: if_icmpne -> 353
    //   341: dload #6
    //   343: dload #4
    //   345: invokestatic max : (DD)D
    //   348: dstore #4
    //   350: goto -> 320
    //   353: dload #8
    //   355: dstore #10
    //   357: aload_2
    //   358: ldc 'xMid'
    //   360: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   363: ifeq -> 395
    //   366: dload #12
    //   368: invokestatic isNaN : (D)Z
    //   371: pop
    //   372: dload #16
    //   374: invokestatic isNaN : (D)Z
    //   377: pop
    //   378: dload #8
    //   380: dload #16
    //   382: dload #12
    //   384: dload #6
    //   386: dmul
    //   387: dsub
    //   388: ldc2_w 2.0
    //   391: ddiv
    //   392: dadd
    //   393: dstore #10
    //   395: dload #10
    //   397: dstore #8
    //   399: aload_2
    //   400: ldc 'xMax'
    //   402: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   405: ifeq -> 433
    //   408: dload #12
    //   410: invokestatic isNaN : (D)Z
    //   413: pop
    //   414: dload #16
    //   416: invokestatic isNaN : (D)Z
    //   419: pop
    //   420: dload #10
    //   422: dload #16
    //   424: dload #12
    //   426: dload #6
    //   428: dmul
    //   429: dsub
    //   430: dadd
    //   431: dstore #8
    //   433: dload #14
    //   435: dstore #12
    //   437: aload_2
    //   438: ldc 'YMid'
    //   440: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   443: ifeq -> 475
    //   446: dload #20
    //   448: invokestatic isNaN : (D)Z
    //   451: pop
    //   452: dload #22
    //   454: invokestatic isNaN : (D)Z
    //   457: pop
    //   458: dload #14
    //   460: dload #22
    //   462: dload #20
    //   464: dload #4
    //   466: dmul
    //   467: dsub
    //   468: ldc2_w 2.0
    //   471: ddiv
    //   472: dadd
    //   473: dstore #12
    //   475: dload #6
    //   477: dstore #14
    //   479: dload #12
    //   481: dstore #10
    //   483: dload #8
    //   485: dstore #16
    //   487: dload #4
    //   489: dstore #18
    //   491: aload_2
    //   492: ldc 'YMax'
    //   494: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   497: ifeq -> 537
    //   500: dload #20
    //   502: invokestatic isNaN : (D)Z
    //   505: pop
    //   506: dload #22
    //   508: invokestatic isNaN : (D)Z
    //   511: pop
    //   512: dload #12
    //   514: dload #22
    //   516: dload #20
    //   518: dload #4
    //   520: dmul
    //   521: dsub
    //   522: dadd
    //   523: dstore #10
    //   525: dload #4
    //   527: dstore #18
    //   529: dload #8
    //   531: dstore #16
    //   533: dload #6
    //   535: dstore #14
    //   537: new android/graphics/Matrix
    //   540: dup
    //   541: invokespecial <init> : ()V
    //   544: astore_0
    //   545: aload_0
    //   546: dload #16
    //   548: d2f
    //   549: dload #10
    //   551: d2f
    //   552: invokevirtual postTranslate : (FF)Z
    //   555: pop
    //   556: aload_0
    //   557: dload #14
    //   559: d2f
    //   560: dload #18
    //   562: d2f
    //   563: invokevirtual preScale : (FF)Z
    //   566: pop
    //   567: aload_0
    //   568: areturn
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/horcrux/svg/w0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */