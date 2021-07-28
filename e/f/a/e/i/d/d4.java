package e.f.a.e.i.d;

import java.nio.ByteBuffer;

abstract class d4 {
  static void b(CharSequence paramCharSequence, ByteBuffer paramByteBuffer) {
    // Byte code:
    //   0: aload_0
    //   1: invokeinterface length : ()I
    //   6: istore #10
    //   8: aload_1
    //   9: invokevirtual position : ()I
    //   12: istore #6
    //   14: iconst_0
    //   15: istore #5
    //   17: iload #5
    //   19: iload #10
    //   21: if_icmpge -> 80
    //   24: iload #6
    //   26: istore #8
    //   28: iload #5
    //   30: istore #7
    //   32: aload_0
    //   33: iload #5
    //   35: invokeinterface charAt : (I)C
    //   40: istore #9
    //   42: iload #9
    //   44: sipush #128
    //   47: if_icmpge -> 80
    //   50: iload #6
    //   52: istore #8
    //   54: iload #5
    //   56: istore #7
    //   58: aload_1
    //   59: iload #6
    //   61: iload #5
    //   63: iadd
    //   64: iload #9
    //   66: i2b
    //   67: invokevirtual put : (IB)Ljava/nio/ByteBuffer;
    //   70: pop
    //   71: iload #5
    //   73: iconst_1
    //   74: iadd
    //   75: istore #5
    //   77: goto -> 17
    //   80: iload #5
    //   82: iload #10
    //   84: if_icmpne -> 676
    //   87: iload #6
    //   89: istore #8
    //   91: iload #5
    //   93: istore #7
    //   95: aload_1
    //   96: iload #6
    //   98: iload #5
    //   100: iadd
    //   101: invokevirtual position : (I)Ljava/nio/Buffer;
    //   104: pop
    //   105: return
    //   106: iload #5
    //   108: iload #10
    //   110: if_icmpge -> 545
    //   113: iload #6
    //   115: istore #8
    //   117: iload #5
    //   119: istore #7
    //   121: aload_0
    //   122: iload #5
    //   124: invokeinterface charAt : (I)C
    //   129: istore_3
    //   130: iload_3
    //   131: sipush #128
    //   134: if_icmpge -> 157
    //   137: iload #6
    //   139: istore #8
    //   141: iload #5
    //   143: istore #7
    //   145: aload_1
    //   146: iload #6
    //   148: iload_3
    //   149: i2b
    //   150: invokevirtual put : (IB)Ljava/nio/ByteBuffer;
    //   153: pop
    //   154: goto -> 686
    //   157: iload_3
    //   158: sipush #2048
    //   161: if_icmpge -> 226
    //   164: iload #6
    //   166: iconst_1
    //   167: iadd
    //   168: istore #8
    //   170: iload_3
    //   171: bipush #6
    //   173: iushr
    //   174: sipush #192
    //   177: ior
    //   178: i2b
    //   179: istore_2
    //   180: iload #8
    //   182: istore #7
    //   184: aload_1
    //   185: iload #6
    //   187: iload_2
    //   188: invokevirtual put : (IB)Ljava/nio/ByteBuffer;
    //   191: pop
    //   192: iload #8
    //   194: istore #7
    //   196: aload_1
    //   197: iload #8
    //   199: iload_3
    //   200: bipush #63
    //   202: iand
    //   203: sipush #128
    //   206: ior
    //   207: i2b
    //   208: invokevirtual put : (IB)Ljava/nio/ByteBuffer;
    //   211: pop
    //   212: iload #8
    //   214: istore #6
    //   216: goto -> 686
    //   219: iload #7
    //   221: istore #8
    //   223: goto -> 561
    //   226: iload_3
    //   227: ldc 55296
    //   229: if_icmplt -> 455
    //   232: ldc 57343
    //   234: iload_3
    //   235: if_icmpge -> 241
    //   238: goto -> 455
    //   241: iload #5
    //   243: iconst_1
    //   244: iadd
    //   245: istore #7
    //   247: iload #7
    //   249: iload #10
    //   251: if_icmpeq -> 435
    //   254: iload #6
    //   256: istore #5
    //   258: aload_0
    //   259: iload #7
    //   261: invokeinterface charAt : (I)C
    //   266: istore #4
    //   268: iload #6
    //   270: istore #5
    //   272: iload_3
    //   273: iload #4
    //   275: invokestatic isSurrogatePair : (CC)Z
    //   278: ifeq -> 417
    //   281: iload #6
    //   283: istore #5
    //   285: iload_3
    //   286: iload #4
    //   288: invokestatic toCodePoint : (CC)I
    //   291: istore #11
    //   293: iload #6
    //   295: iconst_1
    //   296: iadd
    //   297: istore #8
    //   299: iload #11
    //   301: bipush #18
    //   303: iushr
    //   304: sipush #240
    //   307: ior
    //   308: i2b
    //   309: istore_2
    //   310: iload #8
    //   312: istore #5
    //   314: aload_1
    //   315: iload #6
    //   317: iload_2
    //   318: invokevirtual put : (IB)Ljava/nio/ByteBuffer;
    //   321: pop
    //   322: iload #8
    //   324: iconst_1
    //   325: iadd
    //   326: istore #9
    //   328: iload #11
    //   330: bipush #12
    //   332: iushr
    //   333: bipush #63
    //   335: iand
    //   336: sipush #128
    //   339: ior
    //   340: i2b
    //   341: istore_2
    //   342: iload #9
    //   344: istore #5
    //   346: aload_1
    //   347: iload #8
    //   349: iload_2
    //   350: invokevirtual put : (IB)Ljava/nio/ByteBuffer;
    //   353: pop
    //   354: iload #9
    //   356: iconst_1
    //   357: iadd
    //   358: istore #6
    //   360: iload #11
    //   362: bipush #6
    //   364: iushr
    //   365: bipush #63
    //   367: iand
    //   368: sipush #128
    //   371: ior
    //   372: i2b
    //   373: istore_2
    //   374: iload #6
    //   376: istore #5
    //   378: aload_1
    //   379: iload #9
    //   381: iload_2
    //   382: invokevirtual put : (IB)Ljava/nio/ByteBuffer;
    //   385: pop
    //   386: iload #6
    //   388: istore #5
    //   390: aload_1
    //   391: iload #6
    //   393: iload #11
    //   395: bipush #63
    //   397: iand
    //   398: sipush #128
    //   401: ior
    //   402: i2b
    //   403: invokevirtual put : (IB)Ljava/nio/ByteBuffer;
    //   406: pop
    //   407: iload #7
    //   409: istore #5
    //   411: goto -> 686
    //   414: goto -> 424
    //   417: iload #7
    //   419: istore #5
    //   421: goto -> 435
    //   424: iload #5
    //   426: istore #8
    //   428: iload #7
    //   430: istore #5
    //   432: goto -> 561
    //   435: iload #6
    //   437: istore #8
    //   439: iload #5
    //   441: istore #7
    //   443: new e/f/a/e/i/d/f4
    //   446: dup
    //   447: iload #5
    //   449: iload #10
    //   451: invokespecial <init> : (II)V
    //   454: athrow
    //   455: iload #6
    //   457: iconst_1
    //   458: iadd
    //   459: istore #9
    //   461: iload_3
    //   462: bipush #12
    //   464: iushr
    //   465: sipush #224
    //   468: ior
    //   469: i2b
    //   470: istore_2
    //   471: iload #9
    //   473: istore #7
    //   475: aload_1
    //   476: iload #6
    //   478: iload_2
    //   479: invokevirtual put : (IB)Ljava/nio/ByteBuffer;
    //   482: pop
    //   483: iload #9
    //   485: iconst_1
    //   486: iadd
    //   487: istore #6
    //   489: iload_3
    //   490: bipush #6
    //   492: iushr
    //   493: bipush #63
    //   495: iand
    //   496: sipush #128
    //   499: ior
    //   500: i2b
    //   501: istore_2
    //   502: iload #6
    //   504: istore #8
    //   506: iload #5
    //   508: istore #7
    //   510: aload_1
    //   511: iload #9
    //   513: iload_2
    //   514: invokevirtual put : (IB)Ljava/nio/ByteBuffer;
    //   517: pop
    //   518: iload #6
    //   520: istore #8
    //   522: iload #5
    //   524: istore #7
    //   526: aload_1
    //   527: iload #6
    //   529: iload_3
    //   530: bipush #63
    //   532: iand
    //   533: sipush #128
    //   536: ior
    //   537: i2b
    //   538: invokevirtual put : (IB)Ljava/nio/ByteBuffer;
    //   541: pop
    //   542: goto -> 686
    //   545: iload #6
    //   547: istore #8
    //   549: iload #5
    //   551: istore #7
    //   553: aload_1
    //   554: iload #6
    //   556: invokevirtual position : (I)Ljava/nio/Buffer;
    //   559: pop
    //   560: return
    //   561: aload_1
    //   562: invokevirtual position : ()I
    //   565: istore #6
    //   567: iload #5
    //   569: iload #8
    //   571: aload_1
    //   572: invokevirtual position : ()I
    //   575: isub
    //   576: iconst_1
    //   577: iadd
    //   578: invokestatic max : (II)I
    //   581: istore #7
    //   583: aload_0
    //   584: iload #5
    //   586: invokeinterface charAt : (I)C
    //   591: istore_3
    //   592: new java/lang/StringBuilder
    //   595: dup
    //   596: bipush #37
    //   598: invokespecial <init> : (I)V
    //   601: astore_0
    //   602: aload_0
    //   603: ldc 'Failed writing '
    //   605: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   608: pop
    //   609: aload_0
    //   610: iload_3
    //   611: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   614: pop
    //   615: aload_0
    //   616: ldc ' at index '
    //   618: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   621: pop
    //   622: aload_0
    //   623: iload #6
    //   625: iload #7
    //   627: iadd
    //   628: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   631: pop
    //   632: new java/lang/ArrayIndexOutOfBoundsException
    //   635: dup
    //   636: aload_0
    //   637: invokevirtual toString : ()Ljava/lang/String;
    //   640: invokespecial <init> : (Ljava/lang/String;)V
    //   643: astore_0
    //   644: goto -> 649
    //   647: aload_0
    //   648: athrow
    //   649: goto -> 647
    //   652: astore #12
    //   654: iload #7
    //   656: istore #5
    //   658: goto -> 561
    //   661: astore #12
    //   663: goto -> 219
    //   666: astore #12
    //   668: goto -> 424
    //   671: astore #12
    //   673: goto -> 414
    //   676: iload #6
    //   678: iload #5
    //   680: iadd
    //   681: istore #6
    //   683: goto -> 106
    //   686: iload #5
    //   688: iconst_1
    //   689: iadd
    //   690: istore #5
    //   692: iload #6
    //   694: iconst_1
    //   695: iadd
    //   696: istore #6
    //   698: goto -> 106
    // Exception table:
    //   from	to	target	type
    //   32	42	652	java/lang/IndexOutOfBoundsException
    //   58	71	652	java/lang/IndexOutOfBoundsException
    //   95	105	652	java/lang/IndexOutOfBoundsException
    //   121	130	652	java/lang/IndexOutOfBoundsException
    //   145	154	652	java/lang/IndexOutOfBoundsException
    //   184	192	661	java/lang/IndexOutOfBoundsException
    //   196	212	661	java/lang/IndexOutOfBoundsException
    //   258	268	666	java/lang/IndexOutOfBoundsException
    //   272	281	666	java/lang/IndexOutOfBoundsException
    //   285	293	666	java/lang/IndexOutOfBoundsException
    //   314	322	671	java/lang/IndexOutOfBoundsException
    //   346	354	666	java/lang/IndexOutOfBoundsException
    //   378	386	671	java/lang/IndexOutOfBoundsException
    //   390	407	671	java/lang/IndexOutOfBoundsException
    //   443	455	652	java/lang/IndexOutOfBoundsException
    //   475	483	661	java/lang/IndexOutOfBoundsException
    //   510	518	652	java/lang/IndexOutOfBoundsException
    //   526	542	652	java/lang/IndexOutOfBoundsException
    //   553	560	652	java/lang/IndexOutOfBoundsException
  }
  
  abstract int a(int paramInt1, byte[] paramArrayOfbyte, int paramInt2, int paramInt3);
  
  abstract int a(CharSequence paramCharSequence, byte[] paramArrayOfbyte, int paramInt1, int paramInt2);
  
  abstract void a(CharSequence paramCharSequence, ByteBuffer paramByteBuffer);
  
  final boolean a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    return (a(0, paramArrayOfbyte, paramInt1, paramInt2) == 0);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/d/d4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */