package net.time4j.e1.b0;

public class c {
  public static String a(String paramString) {
    // Byte code:
    //   0: new java/lang/StringBuilder
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore #7
    //   9: aload_0
    //   10: invokevirtual length : ()I
    //   13: istore #6
    //   15: iconst_0
    //   16: istore_2
    //   17: iconst_0
    //   18: istore_3
    //   19: iload_2
    //   20: iload #6
    //   22: if_icmpge -> 186
    //   25: aload_0
    //   26: iload_2
    //   27: invokevirtual charAt : (I)C
    //   30: istore_1
    //   31: iload_1
    //   32: bipush #39
    //   34: if_icmpne -> 93
    //   37: iload_2
    //   38: iconst_1
    //   39: iadd
    //   40: istore #4
    //   42: iload #4
    //   44: iload #6
    //   46: if_icmpge -> 73
    //   49: aload_0
    //   50: iload #4
    //   52: invokevirtual charAt : (I)C
    //   55: bipush #39
    //   57: if_icmpne -> 73
    //   60: aload #7
    //   62: iload_1
    //   63: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   66: pop
    //   67: iload #4
    //   69: istore_2
    //   70: goto -> 77
    //   73: iload_3
    //   74: iconst_1
    //   75: ixor
    //   76: istore_3
    //   77: aload #7
    //   79: iload_1
    //   80: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   83: pop
    //   84: iload_2
    //   85: istore #4
    //   87: iload_3
    //   88: istore #5
    //   90: goto -> 175
    //   93: iload_3
    //   94: ifeq -> 100
    //   97: goto -> 77
    //   100: iload_2
    //   101: istore #4
    //   103: iload_3
    //   104: istore #5
    //   106: iload_1
    //   107: bipush #122
    //   109: if_icmpeq -> 175
    //   112: iload_2
    //   113: istore #4
    //   115: iload_3
    //   116: istore #5
    //   118: iload_1
    //   119: bipush #90
    //   121: if_icmpeq -> 175
    //   124: iload_2
    //   125: istore #4
    //   127: iload_3
    //   128: istore #5
    //   130: iload_1
    //   131: bipush #118
    //   133: if_icmpeq -> 175
    //   136: iload_2
    //   137: istore #4
    //   139: iload_3
    //   140: istore #5
    //   142: iload_1
    //   143: bipush #86
    //   145: if_icmpeq -> 175
    //   148: iload_2
    //   149: istore #4
    //   151: iload_3
    //   152: istore #5
    //   154: iload_1
    //   155: bipush #120
    //   157: if_icmpeq -> 175
    //   160: iload_2
    //   161: istore #4
    //   163: iload_3
    //   164: istore #5
    //   166: iload_1
    //   167: bipush #88
    //   169: if_icmpeq -> 175
    //   172: goto -> 77
    //   175: iload #4
    //   177: iconst_1
    //   178: iadd
    //   179: istore_2
    //   180: iload #5
    //   182: istore_3
    //   183: goto -> 19
    //   186: iconst_0
    //   187: istore_2
    //   188: iload_2
    //   189: aload #7
    //   191: invokevirtual length : ()I
    //   194: if_icmpge -> 287
    //   197: aload #7
    //   199: iload_2
    //   200: invokevirtual charAt : (I)C
    //   203: istore #4
    //   205: iload #4
    //   207: bipush #32
    //   209: if_icmpne -> 239
    //   212: iload_2
    //   213: iconst_1
    //   214: iadd
    //   215: istore_3
    //   216: iload_3
    //   217: aload #7
    //   219: invokevirtual length : ()I
    //   222: if_icmpge -> 239
    //   225: aload #7
    //   227: iload_3
    //   228: invokevirtual charAt : (I)C
    //   231: bipush #32
    //   233: if_icmpne -> 239
    //   236: goto -> 269
    //   239: iload #4
    //   241: bipush #91
    //   243: if_icmpeq -> 269
    //   246: iload #4
    //   248: bipush #93
    //   250: if_icmpeq -> 269
    //   253: iload #4
    //   255: bipush #40
    //   257: if_icmpeq -> 269
    //   260: iload_2
    //   261: istore_3
    //   262: iload #4
    //   264: bipush #41
    //   266: if_icmpne -> 280
    //   269: aload #7
    //   271: iload_2
    //   272: invokevirtual deleteCharAt : (I)Ljava/lang/StringBuilder;
    //   275: pop
    //   276: iload_2
    //   277: iconst_1
    //   278: isub
    //   279: istore_3
    //   280: iload_3
    //   281: iconst_1
    //   282: iadd
    //   283: istore_2
    //   284: goto -> 188
    //   287: aload #7
    //   289: invokevirtual toString : ()Ljava/lang/String;
    //   292: invokevirtual trim : ()Ljava/lang/String;
    //   295: astore #7
    //   297: aload #7
    //   299: ldc ' ''
    //   301: invokevirtual endsWith : (Ljava/lang/String;)Z
    //   304: ifeq -> 345
    //   307: new java/lang/StringBuilder
    //   310: dup
    //   311: invokespecial <init> : ()V
    //   314: astore_0
    //   315: aload_0
    //   316: aload #7
    //   318: iconst_0
    //   319: aload #7
    //   321: invokevirtual length : ()I
    //   324: iconst_2
    //   325: isub
    //   326: invokevirtual substring : (II)Ljava/lang/String;
    //   329: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   332: pop
    //   333: aload_0
    //   334: ldc '''
    //   336: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   339: pop
    //   340: aload_0
    //   341: invokevirtual toString : ()Ljava/lang/String;
    //   344: areturn
    //   345: aload #7
    //   347: astore_0
    //   348: aload #7
    //   350: ldc ','
    //   352: invokevirtual endsWith : (Ljava/lang/String;)Z
    //   355: ifeq -> 372
    //   358: aload #7
    //   360: iconst_0
    //   361: aload #7
    //   363: invokevirtual length : ()I
    //   366: iconst_1
    //   367: isub
    //   368: invokevirtual substring : (II)Ljava/lang/String;
    //   371: astore_0
    //   372: aload_0
    //   373: areturn
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/e1/b0/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */