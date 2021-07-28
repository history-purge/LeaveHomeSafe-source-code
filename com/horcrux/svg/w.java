package com.horcrux.svg;

import com.facebook.react.bridge.ReadableArray;

class w {
  static double a(c0 paramc0, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4) {
    if (paramc0 == null)
      return paramDouble2; 
    c0.b b = paramc0.b;
    double d2 = paramc0.a;
    double d1 = paramDouble4;
    switch (a.a[b.ordinal()]) {
      default:
        paramDouble1 = d2;
        paramDouble1 *= paramDouble3;
        return paramDouble1 + paramDouble2;
      case 10:
        d1 = 15.0D;
        break;
      case 9:
        d1 = 1.25D;
        break;
      case 8:
        d1 = 90.0D;
        break;
      case 7:
        d1 = 3.543307D;
        break;
      case 6:
        d1 = 35.43307D;
        break;
      case 5:
        d1 = paramDouble4 / 2.0D;
        break;
      case 3:
        paramDouble1 = d2 / 100.0D * paramDouble1;
        return paramDouble1 + paramDouble2;
      case 1:
      case 2:
        d1 = 1.0D;
        break;
      case 4:
        break;
    } 
    paramDouble1 = d2 * d1;
    paramDouble1 *= paramDouble3;
    return paramDouble1 + paramDouble2;
  }
  
  static double a(String paramString, double paramDouble1, double paramDouble2, double paramDouble3) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual trim : ()Ljava/lang/String;
    //   4: astore_0
    //   5: aload_0
    //   6: invokevirtual length : ()I
    //   9: istore #11
    //   11: iload #11
    //   13: iconst_1
    //   14: isub
    //   15: istore #7
    //   17: iload #11
    //   19: ifeq -> 423
    //   22: aload_0
    //   23: ldc 'normal'
    //   25: invokevirtual equals : (Ljava/lang/Object;)Z
    //   28: ifeq -> 34
    //   31: goto -> 423
    //   34: aload_0
    //   35: iload #7
    //   37: invokevirtual codePointAt : (I)I
    //   40: bipush #37
    //   42: if_icmpne -> 65
    //   45: aload_0
    //   46: iconst_0
    //   47: iload #7
    //   49: invokevirtual substring : (II)Ljava/lang/String;
    //   52: invokestatic valueOf : (Ljava/lang/String;)Ljava/lang/Double;
    //   55: invokevirtual doubleValue : ()D
    //   58: ldc2_w 100.0
    //   61: ddiv
    //   62: dload_1
    //   63: dmul
    //   64: dreturn
    //   65: iload #11
    //   67: iconst_2
    //   68: isub
    //   69: istore #9
    //   71: iload #9
    //   73: ifle -> 412
    //   76: aload_0
    //   77: iload #9
    //   79: invokevirtual substring : (I)Ljava/lang/String;
    //   82: astore #12
    //   84: aload #12
    //   86: invokevirtual hashCode : ()I
    //   89: istore #7
    //   91: iload #7
    //   93: sipush #3178
    //   96: if_icmpeq -> 247
    //   99: iload #7
    //   101: sipush #3240
    //   104: if_icmpeq -> 231
    //   107: iload #7
    //   109: sipush #3365
    //   112: if_icmpeq -> 214
    //   115: iload #7
    //   117: sipush #3488
    //   120: if_icmpeq -> 198
    //   123: iload #7
    //   125: sipush #3571
    //   128: if_icmpeq -> 182
    //   131: iload #7
    //   133: sipush #3588
    //   136: if_icmpeq -> 166
    //   139: iload #7
    //   141: sipush #3592
    //   144: if_icmpeq -> 150
    //   147: goto -> 263
    //   150: aload #12
    //   152: ldc 'px'
    //   154: invokevirtual equals : (Ljava/lang/Object;)Z
    //   157: ifeq -> 263
    //   160: iconst_0
    //   161: istore #7
    //   163: goto -> 266
    //   166: aload #12
    //   168: ldc 'pt'
    //   170: invokevirtual equals : (Ljava/lang/Object;)Z
    //   173: ifeq -> 263
    //   176: iconst_2
    //   177: istore #7
    //   179: goto -> 266
    //   182: aload #12
    //   184: ldc 'pc'
    //   186: invokevirtual equals : (Ljava/lang/Object;)Z
    //   189: ifeq -> 263
    //   192: iconst_3
    //   193: istore #7
    //   195: goto -> 266
    //   198: aload #12
    //   200: ldc 'mm'
    //   202: invokevirtual equals : (Ljava/lang/Object;)Z
    //   205: ifeq -> 263
    //   208: iconst_4
    //   209: istore #7
    //   211: goto -> 266
    //   214: aload #12
    //   216: ldc 'in'
    //   218: invokevirtual equals : (Ljava/lang/Object;)Z
    //   221: ifeq -> 263
    //   224: bipush #6
    //   226: istore #7
    //   228: goto -> 266
    //   231: aload #12
    //   233: ldc 'em'
    //   235: invokevirtual equals : (Ljava/lang/Object;)Z
    //   238: ifeq -> 263
    //   241: iconst_1
    //   242: istore #7
    //   244: goto -> 266
    //   247: aload #12
    //   249: ldc 'cm'
    //   251: invokevirtual equals : (Ljava/lang/Object;)Z
    //   254: ifeq -> 263
    //   257: iconst_5
    //   258: istore #7
    //   260: goto -> 266
    //   263: iconst_m1
    //   264: istore #7
    //   266: iload #9
    //   268: istore #8
    //   270: iload #9
    //   272: istore #10
    //   274: iload #7
    //   276: tableswitch default -> 320, 0 -> 324, 1 -> 391, 2 -> 382, 3 -> 370, 4 -> 358, 5 -> 346, 6 -> 334
    //   320: iload #11
    //   322: istore #8
    //   324: dconst_1
    //   325: dstore #5
    //   327: iload #8
    //   329: istore #10
    //   331: goto -> 391
    //   334: ldc2_w 90.0
    //   337: dstore #5
    //   339: iload #9
    //   341: istore #10
    //   343: goto -> 391
    //   346: ldc2_w 35.43307
    //   349: dstore #5
    //   351: iload #9
    //   353: istore #10
    //   355: goto -> 391
    //   358: ldc2_w 3.543307
    //   361: dstore #5
    //   363: iload #9
    //   365: istore #10
    //   367: goto -> 391
    //   370: ldc2_w 15.0
    //   373: dstore #5
    //   375: iload #9
    //   377: istore #10
    //   379: goto -> 391
    //   382: ldc2_w 1.25
    //   385: dstore #5
    //   387: iload #9
    //   389: istore #10
    //   391: aload_0
    //   392: iconst_0
    //   393: iload #10
    //   395: invokevirtual substring : (II)Ljava/lang/String;
    //   398: invokestatic valueOf : (Ljava/lang/String;)Ljava/lang/Double;
    //   401: invokevirtual doubleValue : ()D
    //   404: dload #5
    //   406: dmul
    //   407: dstore_1
    //   408: dload_1
    //   409: dload_3
    //   410: dmul
    //   411: dreturn
    //   412: aload_0
    //   413: invokestatic valueOf : (Ljava/lang/String;)Ljava/lang/Double;
    //   416: invokevirtual doubleValue : ()D
    //   419: dstore_1
    //   420: goto -> 408
    //   423: dconst_0
    //   424: dreturn
  }
  
  static int a(ReadableArray paramReadableArray, float[] paramArrayOffloat, float paramFloat) {
    int i = paramReadableArray.size();
    if (i != 6)
      return i; 
    paramArrayOffloat[0] = (float)paramReadableArray.getDouble(0);
    paramArrayOffloat[1] = (float)paramReadableArray.getDouble(2);
    paramArrayOffloat[2] = (float)paramReadableArray.getDouble(4) * paramFloat;
    paramArrayOffloat[3] = (float)paramReadableArray.getDouble(1);
    paramArrayOffloat[4] = (float)paramReadableArray.getDouble(3);
    paramArrayOffloat[5] = (float)paramReadableArray.getDouble(5) * paramFloat;
    return 6;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/horcrux/svg/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */