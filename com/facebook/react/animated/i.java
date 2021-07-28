package com.facebook.react.animated;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class i extends s {
  private static final Pattern t = Pattern.compile("[+-]?(\\d+\\.?\\d*|\\.\\d+)([eE][+-]?\\d+)?");
  
  private final double[] i;
  
  private final double[] j;
  
  private String k;
  
  private double[][] l;
  
  private final boolean m;
  
  private final Matcher n;
  
  private final String o;
  
  private final String p;
  
  private s q;
  
  private boolean r;
  
  private int s;
  
  public i(ReadableMap paramReadableMap) {
    boolean bool;
    double[] arrayOfDouble;
    this.i = a(paramReadableMap.getArray("inputRange"));
    ReadableArray readableArray = paramReadableMap.getArray("outputRange");
    if (readableArray.getType(0) == ReadableType.String) {
      bool = true;
    } else {
      bool = false;
    } 
    this.m = bool;
    if (this.m) {
      int k = readableArray.size();
      this.j = new double[k];
      this.k = readableArray.getString(0);
      this.r = this.k.startsWith("rgb");
      this.n = t.matcher(this.k);
      ArrayList<ArrayList> arrayList = new ArrayList();
      int j;
      for (j = 0; j < k; j++) {
        String str = readableArray.getString(j);
        Matcher matcher = t.matcher(str);
        ArrayList<Double> arrayList1 = new ArrayList();
        arrayList.add(arrayList1);
        while (matcher.find())
          arrayList1.add(Double.valueOf(Double.parseDouble(matcher.group()))); 
        this.j[j] = ((Double)arrayList1.get(0)).doubleValue();
      } 
      this.s = ((ArrayList)arrayList.get(0)).size();
      this.l = new double[this.s][];
      for (j = 0; j < this.s; j++) {
        arrayOfDouble = new double[k];
        this.l[j] = arrayOfDouble;
        for (int m = 0; m < k; m++)
          arrayOfDouble[m] = ((Double)((ArrayList)arrayList.get(m)).get(j)).doubleValue(); 
      } 
    } else {
      this.j = a((ReadableArray)arrayOfDouble);
      this.n = null;
    } 
    this.o = paramReadableMap.getString("extrapolateLeft");
    this.p = paramReadableMap.getString("extrapolateRight");
  }
  
  private static double a(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, String paramString1, String paramString2) {
    // Byte code:
    //   0: iconst_m1
    //   1: istore #17
    //   3: dload_0
    //   4: dload_2
    //   5: dcmpg
    //   6: ifge -> 165
    //   9: aload #10
    //   11: invokevirtual hashCode : ()I
    //   14: istore #16
    //   16: iload #16
    //   18: ldc -1289044198
    //   20: if_icmpeq -> 72
    //   23: iload #16
    //   25: ldc -135761730
    //   27: if_icmpeq -> 56
    //   30: iload #16
    //   32: ldc 94742715
    //   34: if_icmpeq -> 40
    //   37: goto -> 88
    //   40: aload #10
    //   42: ldc 'clamp'
    //   44: invokevirtual equals : (Ljava/lang/Object;)Z
    //   47: ifeq -> 88
    //   50: iconst_1
    //   51: istore #16
    //   53: goto -> 91
    //   56: aload #10
    //   58: ldc 'identity'
    //   60: invokevirtual equals : (Ljava/lang/Object;)Z
    //   63: ifeq -> 88
    //   66: iconst_0
    //   67: istore #16
    //   69: goto -> 91
    //   72: aload #10
    //   74: ldc 'extend'
    //   76: invokevirtual equals : (Ljava/lang/Object;)Z
    //   79: ifeq -> 88
    //   82: iconst_2
    //   83: istore #16
    //   85: goto -> 91
    //   88: iconst_m1
    //   89: istore #16
    //   91: iload #16
    //   93: ifeq -> 163
    //   96: iload #16
    //   98: iconst_1
    //   99: if_icmpeq -> 157
    //   102: iload #16
    //   104: iconst_2
    //   105: if_icmpne -> 111
    //   108: goto -> 165
    //   111: new java/lang/StringBuilder
    //   114: dup
    //   115: invokespecial <init> : ()V
    //   118: astore #11
    //   120: aload #11
    //   122: ldc 'Invalid extrapolation type '
    //   124: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   127: pop
    //   128: aload #11
    //   130: aload #10
    //   132: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   135: pop
    //   136: aload #11
    //   138: ldc 'for left extrapolation'
    //   140: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   143: pop
    //   144: new com/facebook/react/bridge/JSApplicationIllegalArgumentException
    //   147: dup
    //   148: aload #11
    //   150: invokevirtual toString : ()Ljava/lang/String;
    //   153: invokespecial <init> : (Ljava/lang/String;)V
    //   156: athrow
    //   157: dload_2
    //   158: dstore #12
    //   160: goto -> 168
    //   163: dload_0
    //   164: dreturn
    //   165: dload_0
    //   166: dstore #12
    //   168: dload #12
    //   170: dstore #14
    //   172: dload #12
    //   174: dload #4
    //   176: dcmpl
    //   177: ifle -> 352
    //   180: aload #11
    //   182: invokevirtual hashCode : ()I
    //   185: istore #16
    //   187: iload #16
    //   189: ldc -1289044198
    //   191: if_icmpeq -> 255
    //   194: iload #16
    //   196: ldc -135761730
    //   198: if_icmpeq -> 235
    //   201: iload #16
    //   203: ldc 94742715
    //   205: if_icmpeq -> 215
    //   208: iload #17
    //   210: istore #16
    //   212: goto -> 272
    //   215: iload #17
    //   217: istore #16
    //   219: aload #11
    //   221: ldc 'clamp'
    //   223: invokevirtual equals : (Ljava/lang/Object;)Z
    //   226: ifeq -> 272
    //   229: iconst_1
    //   230: istore #16
    //   232: goto -> 272
    //   235: iload #17
    //   237: istore #16
    //   239: aload #11
    //   241: ldc 'identity'
    //   243: invokevirtual equals : (Ljava/lang/Object;)Z
    //   246: ifeq -> 272
    //   249: iconst_0
    //   250: istore #16
    //   252: goto -> 272
    //   255: iload #17
    //   257: istore #16
    //   259: aload #11
    //   261: ldc 'extend'
    //   263: invokevirtual equals : (Ljava/lang/Object;)Z
    //   266: ifeq -> 272
    //   269: iconst_2
    //   270: istore #16
    //   272: iload #16
    //   274: ifeq -> 349
    //   277: iload #16
    //   279: iconst_1
    //   280: if_icmpeq -> 342
    //   283: iload #16
    //   285: iconst_2
    //   286: if_icmpne -> 296
    //   289: dload #12
    //   291: dstore #14
    //   293: goto -> 352
    //   296: new java/lang/StringBuilder
    //   299: dup
    //   300: invokespecial <init> : ()V
    //   303: astore #10
    //   305: aload #10
    //   307: ldc 'Invalid extrapolation type '
    //   309: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   312: pop
    //   313: aload #10
    //   315: aload #11
    //   317: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   320: pop
    //   321: aload #10
    //   323: ldc 'for right extrapolation'
    //   325: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   328: pop
    //   329: new com/facebook/react/bridge/JSApplicationIllegalArgumentException
    //   332: dup
    //   333: aload #10
    //   335: invokevirtual toString : ()Ljava/lang/String;
    //   338: invokespecial <init> : (Ljava/lang/String;)V
    //   341: athrow
    //   342: dload #4
    //   344: dstore #14
    //   346: goto -> 352
    //   349: dload #12
    //   351: dreturn
    //   352: dload #6
    //   354: dload #8
    //   356: dcmpl
    //   357: ifne -> 363
    //   360: dload #6
    //   362: dreturn
    //   363: dload_2
    //   364: dload #4
    //   366: dcmpl
    //   367: ifne -> 382
    //   370: dload_0
    //   371: dload_2
    //   372: dcmpg
    //   373: ifgt -> 379
    //   376: dload #6
    //   378: dreturn
    //   379: dload #8
    //   381: dreturn
    //   382: dload #6
    //   384: dload #8
    //   386: dload #6
    //   388: dsub
    //   389: dload #14
    //   391: dload_2
    //   392: dsub
    //   393: dmul
    //   394: dload #4
    //   396: dload_2
    //   397: dsub
    //   398: ddiv
    //   399: dadd
    //   400: dreturn
  }
  
  static double a(double paramDouble, double[] paramArrayOfdouble1, double[] paramArrayOfdouble2, String paramString1, String paramString2) {
    int j = a(paramDouble, paramArrayOfdouble1);
    double d = paramArrayOfdouble1[j];
    int k = j + 1;
    return a(paramDouble, d, paramArrayOfdouble1[k], paramArrayOfdouble2[j], paramArrayOfdouble2[k], paramString1, paramString2);
  }
  
  private static int a(double paramDouble, double[] paramArrayOfdouble) {
    int j;
    for (j = 1; j < paramArrayOfdouble.length - 1 && paramArrayOfdouble[j] < paramDouble; j++);
    return j - 1;
  }
  
  private static double[] a(ReadableArray paramReadableArray) {
    double[] arrayOfDouble = new double[paramReadableArray.size()];
    for (int j = 0; j < arrayOfDouble.length; j++)
      arrayOfDouble[j] = paramReadableArray.getDouble(j); 
    return arrayOfDouble;
  }
  
  public void a() {
    // Byte code:
    //   0: aload_0
    //   1: getfield q : Lcom/facebook/react/animated/s;
    //   4: astore #10
    //   6: aload #10
    //   8: ifnonnull -> 12
    //   11: return
    //   12: aload #10
    //   14: invokevirtual e : ()D
    //   17: dstore #5
    //   19: aload_0
    //   20: dload #5
    //   22: aload_0
    //   23: getfield i : [D
    //   26: aload_0
    //   27: getfield j : [D
    //   30: aload_0
    //   31: getfield o : Ljava/lang/String;
    //   34: aload_0
    //   35: getfield p : Ljava/lang/String;
    //   38: invokestatic a : (D[D[DLjava/lang/String;Ljava/lang/String;)D
    //   41: putfield f : D
    //   44: aload_0
    //   45: getfield m : Z
    //   48: ifeq -> 299
    //   51: aload_0
    //   52: getfield s : I
    //   55: iconst_1
    //   56: if_icmple -> 277
    //   59: new java/lang/StringBuffer
    //   62: dup
    //   63: aload_0
    //   64: getfield k : Ljava/lang/String;
    //   67: invokevirtual length : ()I
    //   70: invokespecial <init> : (I)V
    //   73: astore #11
    //   75: aload_0
    //   76: getfield n : Ljava/util/regex/Matcher;
    //   79: invokevirtual reset : ()Ljava/util/regex/Matcher;
    //   82: pop
    //   83: iconst_0
    //   84: istore #7
    //   86: aload_0
    //   87: getfield n : Ljava/util/regex/Matcher;
    //   90: invokevirtual find : ()Z
    //   93: ifeq -> 257
    //   96: aload_0
    //   97: getfield i : [D
    //   100: astore #10
    //   102: aload_0
    //   103: getfield l : [[D
    //   106: astore #12
    //   108: iload #7
    //   110: iconst_1
    //   111: iadd
    //   112: istore #8
    //   114: dload #5
    //   116: aload #10
    //   118: aload #12
    //   120: iload #7
    //   122: aaload
    //   123: aload_0
    //   124: getfield o : Ljava/lang/String;
    //   127: aload_0
    //   128: getfield p : Ljava/lang/String;
    //   131: invokestatic a : (D[D[DLjava/lang/String;Ljava/lang/String;)D
    //   134: dstore_1
    //   135: aload_0
    //   136: getfield r : Z
    //   139: ifeq -> 210
    //   142: iload #8
    //   144: iconst_4
    //   145: if_icmpne -> 154
    //   148: iconst_1
    //   149: istore #7
    //   151: goto -> 157
    //   154: iconst_0
    //   155: istore #7
    //   157: dload_1
    //   158: dstore_3
    //   159: iload #7
    //   161: ifeq -> 170
    //   164: dload_1
    //   165: ldc2_w 1000.0
    //   168: dmul
    //   169: dstore_3
    //   170: dload_3
    //   171: invokestatic round : (D)J
    //   174: l2i
    //   175: istore #9
    //   177: iload #7
    //   179: ifeq -> 200
    //   182: iload #9
    //   184: i2d
    //   185: dstore_1
    //   186: dload_1
    //   187: invokestatic isNaN : (D)Z
    //   190: pop
    //   191: dload_1
    //   192: ldc2_w 1000.0
    //   195: ddiv
    //   196: dstore_1
    //   197: goto -> 222
    //   200: iload #9
    //   202: invokestatic toString : (I)Ljava/lang/String;
    //   205: astore #10
    //   207: goto -> 238
    //   210: dload_1
    //   211: d2i
    //   212: istore #7
    //   214: iload #7
    //   216: i2d
    //   217: dload_1
    //   218: dcmpl
    //   219: ifeq -> 231
    //   222: dload_1
    //   223: invokestatic toString : (D)Ljava/lang/String;
    //   226: astore #10
    //   228: goto -> 238
    //   231: iload #7
    //   233: invokestatic toString : (I)Ljava/lang/String;
    //   236: astore #10
    //   238: aload_0
    //   239: getfield n : Ljava/util/regex/Matcher;
    //   242: aload #11
    //   244: aload #10
    //   246: invokevirtual appendReplacement : (Ljava/lang/StringBuffer;Ljava/lang/String;)Ljava/util/regex/Matcher;
    //   249: pop
    //   250: iload #8
    //   252: istore #7
    //   254: goto -> 86
    //   257: aload_0
    //   258: getfield n : Ljava/util/regex/Matcher;
    //   261: aload #11
    //   263: invokevirtual appendTail : (Ljava/lang/StringBuffer;)Ljava/lang/StringBuffer;
    //   266: pop
    //   267: aload #11
    //   269: invokevirtual toString : ()Ljava/lang/String;
    //   272: astore #10
    //   274: goto -> 293
    //   277: aload_0
    //   278: getfield n : Ljava/util/regex/Matcher;
    //   281: aload_0
    //   282: getfield f : D
    //   285: invokestatic valueOf : (D)Ljava/lang/String;
    //   288: invokevirtual replaceFirst : (Ljava/lang/String;)Ljava/lang/String;
    //   291: astore #10
    //   293: aload_0
    //   294: aload #10
    //   296: putfield e : Ljava/lang/Object;
    //   299: return
  }
  
  public void b(b paramb) {
    if (this.q == null) {
      if (paramb instanceof s) {
        this.q = (s)paramb;
        return;
      } 
      throw new IllegalArgumentException("Parent is of an invalid type");
    } 
    throw new IllegalStateException("Parent already attached");
  }
  
  public void c(b paramb) {
    if (paramb == this.q) {
      this.q = null;
      return;
    } 
    throw new IllegalArgumentException("Invalid parent node provided");
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/animated/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */