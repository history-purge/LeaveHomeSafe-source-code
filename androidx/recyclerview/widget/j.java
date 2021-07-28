package androidx.recyclerview.widget;

import java.util.List;

class j {
  final a a;
  
  j(a parama) {
    this.a = parama;
  }
  
  private void a(List<a.b> paramList, int paramInt1, int paramInt2) {
    a.b b1 = paramList.get(paramInt1);
    a.b b2 = paramList.get(paramInt2);
    int i = b2.a;
    if (i != 1) {
      if (i != 2) {
        if (i != 4)
          return; 
        b(paramList, paramInt1, b1, paramInt2, b2);
        return;
      } 
      a(paramList, paramInt1, b1, paramInt2, b2);
      return;
    } 
    c(paramList, paramInt1, b1, paramInt2, b2);
  }
  
  private int b(List<a.b> paramList) {
    int i = paramList.size() - 1;
    for (boolean bool = false; i >= 0; bool = bool1) {
      boolean bool1;
      if (((a.b)paramList.get(i)).a == 8) {
        bool1 = bool;
        if (bool)
          return i; 
      } else {
        bool1 = true;
      } 
      i--;
    } 
    return -1;
  }
  
  private void c(List<a.b> paramList, int paramInt1, a.b paramb1, int paramInt2, a.b paramb2) {
    if (paramb1.d < paramb2.b) {
      i = -1;
    } else {
      i = 0;
    } 
    int k = i;
    if (paramb1.b < paramb2.b)
      k = i + 1; 
    int i = paramb2.b;
    int m = paramb1.b;
    if (i <= m)
      paramb1.b = m + paramb2.d; 
    i = paramb2.b;
    m = paramb1.d;
    if (i <= m)
      paramb1.d = m + paramb2.d; 
    paramb2.b += k;
    paramList.set(paramInt1, paramb2);
    paramList.set(paramInt2, paramb1);
  }
  
  void a(List<a.b> paramList) {
    while (true) {
      int i = b(paramList);
      if (i != -1) {
        a(paramList, i, i + 1);
        continue;
      } 
      break;
    } 
  }
  
  void a(List<a.b> paramList, int paramInt1, a.b paramb1, int paramInt2, a.b paramb2) {
    // Byte code:
    //   0: aload_3
    //   1: getfield b : I
    //   4: istore #6
    //   6: aload_3
    //   7: getfield d : I
    //   10: istore #8
    //   12: iconst_0
    //   13: istore #7
    //   15: aload #5
    //   17: getfield b : I
    //   20: istore #9
    //   22: iload #6
    //   24: iload #8
    //   26: if_icmpge -> 61
    //   29: iload #9
    //   31: iload #6
    //   33: if_icmpne -> 55
    //   36: aload #5
    //   38: getfield d : I
    //   41: iload #8
    //   43: iload #6
    //   45: isub
    //   46: if_icmpne -> 55
    //   49: iconst_0
    //   50: istore #6
    //   52: goto -> 86
    //   55: iconst_0
    //   56: istore #6
    //   58: goto -> 95
    //   61: iload #9
    //   63: iload #8
    //   65: iconst_1
    //   66: iadd
    //   67: if_icmpne -> 92
    //   70: aload #5
    //   72: getfield d : I
    //   75: iload #6
    //   77: iload #8
    //   79: isub
    //   80: if_icmpne -> 92
    //   83: iconst_1
    //   84: istore #6
    //   86: iconst_1
    //   87: istore #7
    //   89: goto -> 95
    //   92: iconst_1
    //   93: istore #6
    //   95: aload_3
    //   96: getfield d : I
    //   99: istore #8
    //   101: aload #5
    //   103: getfield b : I
    //   106: istore #9
    //   108: iload #8
    //   110: iload #9
    //   112: if_icmpge -> 127
    //   115: aload #5
    //   117: iload #9
    //   119: iconst_1
    //   120: isub
    //   121: putfield b : I
    //   124: goto -> 192
    //   127: aload #5
    //   129: getfield d : I
    //   132: istore #10
    //   134: iload #8
    //   136: iload #9
    //   138: iload #10
    //   140: iadd
    //   141: if_icmpge -> 192
    //   144: aload #5
    //   146: iload #10
    //   148: iconst_1
    //   149: isub
    //   150: putfield d : I
    //   153: aload_3
    //   154: iconst_2
    //   155: putfield a : I
    //   158: aload_3
    //   159: iconst_1
    //   160: putfield d : I
    //   163: aload #5
    //   165: getfield d : I
    //   168: ifne -> 191
    //   171: aload_1
    //   172: iload #4
    //   174: invokeinterface remove : (I)Ljava/lang/Object;
    //   179: pop
    //   180: aload_0
    //   181: getfield a : Landroidx/recyclerview/widget/j$a;
    //   184: aload #5
    //   186: invokeinterface a : (Landroidx/recyclerview/widget/a$b;)V
    //   191: return
    //   192: aload_3
    //   193: getfield b : I
    //   196: istore #8
    //   198: aload #5
    //   200: getfield b : I
    //   203: istore #9
    //   205: aconst_null
    //   206: astore #11
    //   208: iload #8
    //   210: iload #9
    //   212: if_icmpgt -> 227
    //   215: aload #5
    //   217: iload #9
    //   219: iconst_1
    //   220: iadd
    //   221: putfield b : I
    //   224: goto -> 284
    //   227: aload #5
    //   229: getfield d : I
    //   232: istore #10
    //   234: iload #8
    //   236: iload #9
    //   238: iload #10
    //   240: iadd
    //   241: if_icmpge -> 284
    //   244: aload_0
    //   245: getfield a : Landroidx/recyclerview/widget/j$a;
    //   248: iconst_2
    //   249: iload #8
    //   251: iconst_1
    //   252: iadd
    //   253: iload #9
    //   255: iload #10
    //   257: iadd
    //   258: iload #8
    //   260: isub
    //   261: aconst_null
    //   262: invokeinterface a : (IIILjava/lang/Object;)Landroidx/recyclerview/widget/a$b;
    //   267: astore #11
    //   269: aload #5
    //   271: aload_3
    //   272: getfield b : I
    //   275: aload #5
    //   277: getfield b : I
    //   280: isub
    //   281: putfield d : I
    //   284: iload #7
    //   286: ifeq -> 319
    //   289: aload_1
    //   290: iload_2
    //   291: aload #5
    //   293: invokeinterface set : (ILjava/lang/Object;)Ljava/lang/Object;
    //   298: pop
    //   299: aload_1
    //   300: iload #4
    //   302: invokeinterface remove : (I)Ljava/lang/Object;
    //   307: pop
    //   308: aload_0
    //   309: getfield a : Landroidx/recyclerview/widget/j$a;
    //   312: aload_3
    //   313: invokeinterface a : (Landroidx/recyclerview/widget/a$b;)V
    //   318: return
    //   319: iload #6
    //   321: ifeq -> 432
    //   324: aload #11
    //   326: ifnull -> 385
    //   329: aload_3
    //   330: getfield b : I
    //   333: istore #6
    //   335: iload #6
    //   337: aload #11
    //   339: getfield b : I
    //   342: if_icmple -> 357
    //   345: aload_3
    //   346: iload #6
    //   348: aload #11
    //   350: getfield d : I
    //   353: isub
    //   354: putfield b : I
    //   357: aload_3
    //   358: getfield d : I
    //   361: istore #6
    //   363: iload #6
    //   365: aload #11
    //   367: getfield b : I
    //   370: if_icmple -> 385
    //   373: aload_3
    //   374: iload #6
    //   376: aload #11
    //   378: getfield d : I
    //   381: isub
    //   382: putfield d : I
    //   385: aload_3
    //   386: getfield b : I
    //   389: istore #6
    //   391: iload #6
    //   393: aload #5
    //   395: getfield b : I
    //   398: if_icmple -> 413
    //   401: aload_3
    //   402: iload #6
    //   404: aload #5
    //   406: getfield d : I
    //   409: isub
    //   410: putfield b : I
    //   413: aload_3
    //   414: getfield d : I
    //   417: istore #6
    //   419: iload #6
    //   421: aload #5
    //   423: getfield b : I
    //   426: if_icmple -> 549
    //   429: goto -> 537
    //   432: aload #11
    //   434: ifnull -> 493
    //   437: aload_3
    //   438: getfield b : I
    //   441: istore #6
    //   443: iload #6
    //   445: aload #11
    //   447: getfield b : I
    //   450: if_icmplt -> 465
    //   453: aload_3
    //   454: iload #6
    //   456: aload #11
    //   458: getfield d : I
    //   461: isub
    //   462: putfield b : I
    //   465: aload_3
    //   466: getfield d : I
    //   469: istore #6
    //   471: iload #6
    //   473: aload #11
    //   475: getfield b : I
    //   478: if_icmplt -> 493
    //   481: aload_3
    //   482: iload #6
    //   484: aload #11
    //   486: getfield d : I
    //   489: isub
    //   490: putfield d : I
    //   493: aload_3
    //   494: getfield b : I
    //   497: istore #6
    //   499: iload #6
    //   501: aload #5
    //   503: getfield b : I
    //   506: if_icmplt -> 521
    //   509: aload_3
    //   510: iload #6
    //   512: aload #5
    //   514: getfield d : I
    //   517: isub
    //   518: putfield b : I
    //   521: aload_3
    //   522: getfield d : I
    //   525: istore #6
    //   527: iload #6
    //   529: aload #5
    //   531: getfield b : I
    //   534: if_icmplt -> 549
    //   537: aload_3
    //   538: iload #6
    //   540: aload #5
    //   542: getfield d : I
    //   545: isub
    //   546: putfield d : I
    //   549: aload_1
    //   550: iload_2
    //   551: aload #5
    //   553: invokeinterface set : (ILjava/lang/Object;)Ljava/lang/Object;
    //   558: pop
    //   559: aload_3
    //   560: getfield b : I
    //   563: aload_3
    //   564: getfield d : I
    //   567: if_icmpeq -> 583
    //   570: aload_1
    //   571: iload #4
    //   573: aload_3
    //   574: invokeinterface set : (ILjava/lang/Object;)Ljava/lang/Object;
    //   579: pop
    //   580: goto -> 592
    //   583: aload_1
    //   584: iload #4
    //   586: invokeinterface remove : (I)Ljava/lang/Object;
    //   591: pop
    //   592: aload #11
    //   594: ifnull -> 606
    //   597: aload_1
    //   598: iload_2
    //   599: aload #11
    //   601: invokeinterface add : (ILjava/lang/Object;)V
    //   606: return
  }
  
  void b(List<a.b> paramList, int paramInt1, a.b paramb1, int paramInt2, a.b paramb2) {
    // Byte code:
    //   0: aload_3
    //   1: getfield d : I
    //   4: istore #6
    //   6: aload #5
    //   8: getfield b : I
    //   11: istore #7
    //   13: aconst_null
    //   14: astore #10
    //   16: iload #6
    //   18: iload #7
    //   20: if_icmpge -> 35
    //   23: aload #5
    //   25: iload #7
    //   27: iconst_1
    //   28: isub
    //   29: putfield b : I
    //   32: goto -> 86
    //   35: aload #5
    //   37: getfield d : I
    //   40: istore #8
    //   42: iload #6
    //   44: iload #7
    //   46: iload #8
    //   48: iadd
    //   49: if_icmpge -> 86
    //   52: aload #5
    //   54: iload #8
    //   56: iconst_1
    //   57: isub
    //   58: putfield d : I
    //   61: aload_0
    //   62: getfield a : Landroidx/recyclerview/widget/j$a;
    //   65: iconst_4
    //   66: aload_3
    //   67: getfield b : I
    //   70: iconst_1
    //   71: aload #5
    //   73: getfield c : Ljava/lang/Object;
    //   76: invokeinterface a : (IIILjava/lang/Object;)Landroidx/recyclerview/widget/a$b;
    //   81: astore #9
    //   83: goto -> 89
    //   86: aconst_null
    //   87: astore #9
    //   89: aload_3
    //   90: getfield b : I
    //   93: istore #6
    //   95: aload #5
    //   97: getfield b : I
    //   100: istore #7
    //   102: iload #6
    //   104: iload #7
    //   106: if_icmpgt -> 121
    //   109: aload #5
    //   111: iload #7
    //   113: iconst_1
    //   114: iadd
    //   115: putfield b : I
    //   118: goto -> 184
    //   121: aload #5
    //   123: getfield d : I
    //   126: istore #8
    //   128: iload #6
    //   130: iload #7
    //   132: iload #8
    //   134: iadd
    //   135: if_icmpge -> 184
    //   138: iload #7
    //   140: iload #8
    //   142: iadd
    //   143: iload #6
    //   145: isub
    //   146: istore #7
    //   148: aload_0
    //   149: getfield a : Landroidx/recyclerview/widget/j$a;
    //   152: iconst_4
    //   153: iload #6
    //   155: iconst_1
    //   156: iadd
    //   157: iload #7
    //   159: aload #5
    //   161: getfield c : Ljava/lang/Object;
    //   164: invokeinterface a : (IIILjava/lang/Object;)Landroidx/recyclerview/widget/a$b;
    //   169: astore #10
    //   171: aload #5
    //   173: aload #5
    //   175: getfield d : I
    //   178: iload #7
    //   180: isub
    //   181: putfield d : I
    //   184: aload_1
    //   185: iload #4
    //   187: aload_3
    //   188: invokeinterface set : (ILjava/lang/Object;)Ljava/lang/Object;
    //   193: pop
    //   194: aload #5
    //   196: getfield d : I
    //   199: ifle -> 215
    //   202: aload_1
    //   203: iload_2
    //   204: aload #5
    //   206: invokeinterface set : (ILjava/lang/Object;)Ljava/lang/Object;
    //   211: pop
    //   212: goto -> 234
    //   215: aload_1
    //   216: iload_2
    //   217: invokeinterface remove : (I)Ljava/lang/Object;
    //   222: pop
    //   223: aload_0
    //   224: getfield a : Landroidx/recyclerview/widget/j$a;
    //   227: aload #5
    //   229: invokeinterface a : (Landroidx/recyclerview/widget/a$b;)V
    //   234: aload #9
    //   236: ifnull -> 248
    //   239: aload_1
    //   240: iload_2
    //   241: aload #9
    //   243: invokeinterface add : (ILjava/lang/Object;)V
    //   248: aload #10
    //   250: ifnull -> 262
    //   253: aload_1
    //   254: iload_2
    //   255: aload #10
    //   257: invokeinterface add : (ILjava/lang/Object;)V
    //   262: return
  }
  
  static interface a {
    a.b a(int param1Int1, int param1Int2, int param1Int3, Object param1Object);
    
    void a(a.b param1b);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/recyclerview/widget/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */