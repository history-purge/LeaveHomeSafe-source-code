package e.d.c.o;

import e.d.a.e;
import e.d.b.m;
import e.d.c.b;
import e.d.c.j;
import java.io.UnsupportedEncodingException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

public abstract class a<T extends b> extends j<T> {
  public a(T paramT) {
    super((b)paramT);
  }
  
  private static String a(int[] paramArrayOfint) {
    if (paramArrayOfint == null)
      return null; 
    int k = paramArrayOfint.length;
    int i = 2;
    if (k < 2)
      return "<truncated data>"; 
    if (paramArrayOfint[0] == 0 && paramArrayOfint[1] == 0)
      return "<zero pattern size>"; 
    k = paramArrayOfint[0] * paramArrayOfint[1] + 2;
    if (k > paramArrayOfint.length)
      return "<invalid pattern size>"; 
    String[] arrayOfString = new String[7];
    arrayOfString[0] = "Red";
    arrayOfString[1] = "Green";
    arrayOfString[2] = "Blue";
    arrayOfString[3] = "Cyan";
    arrayOfString[4] = "Magenta";
    arrayOfString[5] = "Yellow";
    arrayOfString[6] = "White";
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("[");
    while (i < k) {
      String str;
      if (paramArrayOfint[i] <= arrayOfString.length - 1) {
        str = arrayOfString[paramArrayOfint[i]];
      } else {
        str = "Unknown";
      } 
      stringBuilder.append(str);
      if ((i - 2) % paramArrayOfint[1] == 0) {
        str = ",";
      } else if (i != k - 1) {
        str = "][";
      } else {
        continue;
      } 
      stringBuilder.append(str);
      continue;
      i++;
    } 
    stringBuilder.append("]");
    return stringBuilder.toString();
  }
  
  private int[] j(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield a : Le/d/c/b;
    //   4: iload_1
    //   5: invokevirtual d : (I)[B
    //   8: astore #9
    //   10: aload #9
    //   12: ifnonnull -> 17
    //   15: aconst_null
    //   16: areturn
    //   17: aload #9
    //   19: arraylength
    //   20: istore_2
    //   21: iconst_4
    //   22: istore #5
    //   24: iconst_0
    //   25: istore_1
    //   26: iload_2
    //   27: iconst_4
    //   28: if_icmpge -> 63
    //   31: aload #9
    //   33: arraylength
    //   34: newarray int
    //   36: astore #7
    //   38: iload_1
    //   39: aload #9
    //   41: arraylength
    //   42: if_icmpge -> 60
    //   45: aload #7
    //   47: iload_1
    //   48: aload #9
    //   50: iload_1
    //   51: baload
    //   52: iastore
    //   53: iload_1
    //   54: iconst_1
    //   55: iadd
    //   56: istore_1
    //   57: goto -> 38
    //   60: aload #7
    //   62: areturn
    //   63: aload #9
    //   65: arraylength
    //   66: iconst_2
    //   67: isub
    //   68: newarray int
    //   70: astore #8
    //   72: new e/d/b/b
    //   75: dup
    //   76: aload #9
    //   78: invokespecial <init> : ([B)V
    //   81: astore #10
    //   83: aload #10
    //   85: iconst_0
    //   86: invokevirtual e : (I)S
    //   89: istore_3
    //   90: aload #10
    //   92: iconst_2
    //   93: invokevirtual e : (I)S
    //   96: istore #4
    //   98: iconst_0
    //   99: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   102: astore #7
    //   104: iload_3
    //   105: istore_1
    //   106: iload #4
    //   108: istore_2
    //   109: iload_3
    //   110: iload #4
    //   112: imul
    //   113: iconst_2
    //   114: iadd
    //   115: aload #9
    //   117: arraylength
    //   118: if_icmple -> 174
    //   121: aload #10
    //   123: invokevirtual b : ()Z
    //   126: ifne -> 280
    //   129: iconst_1
    //   130: istore #6
    //   132: goto -> 135
    //   135: aload #10
    //   137: iload #6
    //   139: invokevirtual a : (Z)V
    //   142: aload #10
    //   144: iconst_0
    //   145: invokevirtual e : (I)S
    //   148: istore_1
    //   149: aload #10
    //   151: iconst_2
    //   152: invokevirtual e : (I)S
    //   155: istore_3
    //   156: iload_1
    //   157: istore #4
    //   159: iload_3
    //   160: istore_2
    //   161: aload #9
    //   163: arraylength
    //   164: iload_1
    //   165: iload_3
    //   166: imul
    //   167: iconst_2
    //   168: iadd
    //   169: if_icmplt -> 183
    //   172: iload_3
    //   173: istore_2
    //   174: iconst_1
    //   175: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   178: astore #7
    //   180: iload_1
    //   181: istore #4
    //   183: aload #7
    //   185: invokevirtual booleanValue : ()Z
    //   188: ifeq -> 277
    //   191: aload #8
    //   193: iconst_0
    //   194: iload #4
    //   196: iastore
    //   197: aload #8
    //   199: iconst_1
    //   200: iload_2
    //   201: iastore
    //   202: iload #5
    //   204: istore_1
    //   205: iload_1
    //   206: aload #9
    //   208: arraylength
    //   209: if_icmpge -> 277
    //   212: aload #8
    //   214: iload_1
    //   215: iconst_2
    //   216: isub
    //   217: aload #10
    //   219: iload_1
    //   220: invokevirtual i : (I)B
    //   223: iastore
    //   224: iload_1
    //   225: iconst_1
    //   226: iadd
    //   227: istore_1
    //   228: goto -> 205
    //   231: astore #7
    //   233: aload_0
    //   234: getfield a : Le/d/c/b;
    //   237: astore #9
    //   239: new java/lang/StringBuilder
    //   242: dup
    //   243: invokespecial <init> : ()V
    //   246: astore #10
    //   248: aload #10
    //   250: ldc 'IO exception processing data: '
    //   252: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   255: pop
    //   256: aload #10
    //   258: aload #7
    //   260: invokevirtual getMessage : ()Ljava/lang/String;
    //   263: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   266: pop
    //   267: aload #9
    //   269: aload #10
    //   271: invokevirtual toString : ()Ljava/lang/String;
    //   274: invokevirtual a : (Ljava/lang/String;)V
    //   277: aload #8
    //   279: areturn
    //   280: iconst_0
    //   281: istore #6
    //   283: goto -> 135
    // Exception table:
    //   from	to	target	type
    //   72	104	231	java/io/IOException
    //   109	129	231	java/io/IOException
    //   135	156	231	java/io/IOException
    //   161	172	231	java/io/IOException
    //   174	180	231	java/io/IOException
    //   183	191	231	java/io/IOException
    //   205	224	231	java/io/IOException
  }
  
  private String k(int paramInt) {
    byte[] arrayOfByte = this.a.d(paramInt);
    if (arrayOfByte == null)
      return null; 
    try {
      return (new String(arrayOfByte, "UTF-16LE")).trim();
    } catch (UnsupportedEncodingException unsupportedEncodingException) {
      return null;
    } 
  }
  
  public String A() {
    m m = this.a.n(41486);
    if (m == null)
      return null; 
    String str = z();
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(m.c().a(true));
    if (str == null) {
      str = "";
    } else {
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append(" ");
      stringBuilder1.append(str.toLowerCase());
      str = stringBuilder1.toString();
    } 
    stringBuilder.append(str);
    return stringBuilder.toString();
  }
  
  public String B() {
    m m = this.a.n(41487);
    if (m == null)
      return null; 
    String str = z();
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(m.c().a(true));
    if (str == null) {
      str = "";
    } else {
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append(" ");
      stringBuilder1.append(str.toLowerCase());
      str = stringBuilder1.toString();
    } 
    stringBuilder.append(str);
    return stringBuilder.toString();
  }
  
  public String C() {
    return a(41991, new String[] { "None", "Low gain up", "Low gain down", "High gain up", "High gain down" });
  }
  
  public String D() {
    String str = this.a.p(257);
    if (str == null)
      return null; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(str);
    stringBuilder.append(" pixels");
    return stringBuilder.toString();
  }
  
  public String E() {
    String str = this.a.p(256);
    if (str == null)
      return null; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(str);
    stringBuilder.append(" pixels");
    return stringBuilder.toString();
  }
  
  public String F() {
    String str = this.a.p(1);
    if (str == null)
      return null; 
    if ("R98".equalsIgnoreCase(str.trim()))
      return "Recommended Exif Interoperability Rules (ExifR98)"; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Unknown (");
    stringBuilder.append(str);
    stringBuilder.append(")");
    return stringBuilder.toString();
  }
  
  public String G() {
    return b(2, 2);
  }
  
  public String H() {
    Integer integer = this.a.k(34855);
    return (integer != null) ? Integer.toString(integer.intValue()) : null;
  }
  
  public String I() {
    Integer integer = this.a.k(512);
    if (integer == null)
      return null; 
    int i = integer.intValue();
    if (i != 1) {
      if (i != 14) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unknown (");
        stringBuilder.append(integer);
        stringBuilder.append(")");
        return stringBuilder.toString();
      } 
      return "Lossless";
    } 
    return "Baseline";
  }
  
  public String J() {
    return e(42034);
  }
  
  public String K() {
    Double double_ = this.a.g(37381);
    return (double_ == null) ? null : j.a(e.a(double_.doubleValue()));
  }
  
  public String L() {
    Integer integer = this.a.k(37383);
    if (integer == null)
      return null; 
    int i = integer.intValue();
    if (i != 255) {
      StringBuilder stringBuilder;
      switch (i) {
        default:
          stringBuilder = new StringBuilder();
          stringBuilder.append("Unknown (");
          stringBuilder.append(integer);
          stringBuilder.append(")");
          return stringBuilder.toString();
        case 6:
          return "Partial";
        case 5:
          return "Multi-segment";
        case 4:
          return "Multi-spot";
        case 3:
          return "Spot";
        case 2:
          return "Center weighted average";
        case 1:
          return "Average";
        case 0:
          break;
      } 
      return "Unknown";
    } 
    return "(Other)";
  }
  
  public String M() {
    return a(254, 0, new String[] { "Full-resolution image", "Reduced-resolution image", "Single page of multi-page image", "Single page of multi-page reduced-resolution image", "Transparency mask", "Transparency mask of reduced-resolution image", "Transparency mask of multi-page image", "Transparency mask of reduced-resolution multi-page image" });
  }
  
  public String N() {
    return f(274);
  }
  
  public String O() {
    Integer integer = this.a.k(262);
    if (integer == null)
      return null; 
    int i = integer.intValue();
    if (i != 32803) {
      if (i != 32892) {
        switch (i) {
          default:
            switch (i) {
              default:
                switch (i) {
                  default:
                    return "Unknown colour space";
                  case 32845:
                    return "Pixar LogLuv";
                  case 32844:
                    break;
                } 
                return "Pixar LogL";
              case 10:
                return "ITULab";
              case 9:
                return "ICCLab";
              case 8:
                break;
            } 
            return "CIELab";
          case 6:
            return "YCbCr";
          case 5:
            return "CMYK";
          case 4:
            return "Transparency Mask";
          case 3:
            return "RGB Palette";
          case 2:
            return "RGB";
          case 1:
            return "BlackIsZero";
          case 0:
            break;
        } 
        return "WhiteIsZero";
      } 
      return "Linear Raw";
    } 
    return "Color Filter Array";
  }
  
  public String P() {
    return a(284, 1, new String[] { "Chunky (contiguous for each subsampling pixel)", "Separate (Y-plane/Cb-plane/Cr-plane format)" });
  }
  
  public String Q() {
    // Byte code:
    //   0: aload_0
    //   1: getfield a : Le/d/c/b;
    //   4: sipush #532
    //   7: invokevirtual j : (I)[I
    //   10: astore #6
    //   12: aload #6
    //   14: ifnull -> 29
    //   17: aload #6
    //   19: astore #5
    //   21: aload #6
    //   23: arraylength
    //   24: bipush #6
    //   26: if_icmpge -> 103
    //   29: aload_0
    //   30: getfield a : Le/d/c/b;
    //   33: sipush #532
    //   36: invokevirtual m : (I)Ljava/lang/Object;
    //   39: astore #5
    //   41: aload #5
    //   43: ifnull -> 185
    //   46: aload #5
    //   48: instanceof [J
    //   51: ifeq -> 185
    //   54: aload #5
    //   56: checkcast [J
    //   59: astore #6
    //   61: aload #6
    //   63: arraylength
    //   64: bipush #6
    //   66: if_icmpge -> 71
    //   69: aconst_null
    //   70: areturn
    //   71: aload #6
    //   73: arraylength
    //   74: newarray int
    //   76: astore #5
    //   78: iconst_0
    //   79: istore_1
    //   80: iload_1
    //   81: aload #6
    //   83: arraylength
    //   84: if_icmpge -> 103
    //   87: aload #5
    //   89: iload_1
    //   90: aload #6
    //   92: iload_1
    //   93: laload
    //   94: l2i
    //   95: iastore
    //   96: iload_1
    //   97: iconst_1
    //   98: iadd
    //   99: istore_1
    //   100: goto -> 80
    //   103: aload #5
    //   105: iconst_0
    //   106: iaload
    //   107: istore_1
    //   108: aload #5
    //   110: iconst_1
    //   111: iaload
    //   112: istore_2
    //   113: aload #5
    //   115: iconst_2
    //   116: iaload
    //   117: istore_3
    //   118: aload #5
    //   120: iconst_3
    //   121: iaload
    //   122: istore #4
    //   124: ldc_w '[%d,%d,%d] [%d,%d,%d]'
    //   127: bipush #6
    //   129: anewarray java/lang/Object
    //   132: dup
    //   133: iconst_0
    //   134: iload_1
    //   135: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   138: aastore
    //   139: dup
    //   140: iconst_1
    //   141: iload_3
    //   142: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   145: aastore
    //   146: dup
    //   147: iconst_2
    //   148: aload #5
    //   150: iconst_4
    //   151: iaload
    //   152: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   155: aastore
    //   156: dup
    //   157: iconst_3
    //   158: iload_2
    //   159: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   162: aastore
    //   163: dup
    //   164: iconst_4
    //   165: iload #4
    //   167: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   170: aastore
    //   171: dup
    //   172: iconst_5
    //   173: aload #5
    //   175: iconst_5
    //   176: iaload
    //   177: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   180: aastore
    //   181: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   184: areturn
    //   185: aconst_null
    //   186: areturn
  }
  
  public String R() {
    return a(296, 1, new String[] { "(No unit)", "Inch", "cm" });
  }
  
  public String S() {
    String str = this.a.p(278);
    if (str == null)
      return null; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(str);
    stringBuilder.append(" rows/strip");
    return stringBuilder.toString();
  }
  
  public String T() {
    String str = this.a.p(277);
    if (str == null)
      return null; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(str);
    stringBuilder.append(" samples/pixel");
    return stringBuilder.toString();
  }
  
  public String U() {
    return a(41993, new String[] { "None", "Low saturation", "High saturation" });
  }
  
  public String V() {
    return a(41990, new String[] { "Standard", "Landscape", "Portrait", "Night scene" });
  }
  
  public String W() {
    return a(41729, 1, new String[] { "Directly photographed image" });
  }
  
  public String X() {
    return a(41495, 1, new String[] { "(Not defined)", "One-chip color area sensor", "Two-chip color area sensor", "Three-chip color area sensor", "Color sequential area sensor", null, "Trilinear sensor", "Color sequential linear sensor" });
  }
  
  public String Y() {
    return a(34864, new String[] { "Unknown", "Standard Output Sensitivity", "Recommended Exposure Index", "ISO Speed", "Standard Output Sensitivity and Recommended Exposure Index", "Standard Output Sensitivity and ISO Speed", "Recommended Exposure Index and ISO Speed", "Standard Output Sensitivity, Recommended Exposure Index and ISO Speed" });
  }
  
  public String Z() {
    return a(41994, new String[] { "None", "Low", "Hard" });
  }
  
  public String a() {
    Integer integer = this.a.k(41989);
    return (integer == null) ? null : ((integer.intValue() == 0) ? "Unknown" : j.b(integer.intValue()));
  }
  
  public String a0() {
    return h(37377);
  }
  
  public String b() {
    Double double_ = this.a.g(37378);
    return (double_ == null) ? null : j.a(e.a(double_.doubleValue()));
  }
  
  public String b0() {
    String str = this.a.p(279);
    if (str == null)
      return null; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(str);
    stringBuilder.append(" bytes");
    return stringBuilder.toString();
  }
  
  public String c() {
    String str = this.a.p(258);
    if (str == null)
      return null; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(str);
    stringBuilder.append(" bits/component/pixel");
    return stringBuilder.toString();
  }
  
  public String c(int paramInt) {
    switch (paramInt) {
      default:
        return super.c(paramInt);
      case 42034:
        return J();
      case 41996:
        return e0();
      case 41994:
        return Z();
      case 41993:
        return U();
      case 41992:
        return j();
      case 41991:
        return C();
      case 41990:
        return V();
      case 41989:
        return a();
      case 41988:
        return l();
      case 41987:
        return i0();
      case 41986:
        return q();
      case 41985:
        return k();
      case 41730:
        return e();
      case 41729:
        return W();
      case 41728:
        return u();
      case 41495:
        return X();
      case 41488:
        return z();
      case 41487:
        return B();
      case 41486:
        return A();
      case 40963:
        return m();
      case 40962:
        return n();
      case 40961:
        return f();
      case 40960:
        return x();
      case 40095:
        return m0();
      case 40094:
        return l0();
      case 40093:
        return j0();
      case 40092:
        return k0();
      case 40091:
        return n0();
      case 37510:
        return g0();
      case 37386:
        return y();
      case 37385:
        return w();
      case 37384:
        return h0();
      case 37383:
        return L();
      case 37382:
        return d0();
      case 37381:
        return K();
      case 37380:
        return p();
      case 37378:
        return b();
      case 37377:
        return a0();
      case 37122:
        return h();
      case 37121:
        return g();
      case 36864:
        return o();
      case 34864:
        return Y();
      case 34855:
        return H();
      case 34850:
        return r();
      case 33437:
        return t();
      case 33434:
        return s();
      case 33422:
        return d();
      case 532:
        return Q();
      case 531:
        return p0();
      case 530:
        return q0();
      case 512:
        return I();
      case 296:
        return R();
      case 284:
        return P();
      case 283:
        return r0();
      case 282:
        return o0();
      case 279:
        return b0();
      case 278:
        return S();
      case 277:
        return T();
      case 274:
        return N();
      case 266:
        return v();
      case 263:
        return f0();
      case 262:
        return O();
      case 259:
        return i();
      case 258:
        return c();
      case 257:
        return D();
      case 256:
        return E();
      case 255:
        return c0();
      case 254:
        return M();
      case 2:
        return G();
      case 1:
        break;
    } 
    return F();
  }
  
  public String c0() {
    return a(255, 1, new String[] { "Full-resolution image", "Reduced-resolution image", "Single page of multi-page image" });
  }
  
  public String d() {
    byte[] arrayOfByte = this.a.d(33422);
    if (arrayOfByte == null)
      return null; 
    int[] arrayOfInt = this.a.j(33421);
    int i = 0;
    if (arrayOfInt == null)
      return String.format("Repeat Pattern not found for CFAPattern (%s)", new Object[] { super.c(33422) }); 
    if (arrayOfInt.length == 2 && arrayOfByte.length == arrayOfInt[0] * arrayOfInt[1]) {
      int[] arrayOfInt1 = new int[arrayOfByte.length + 2];
      arrayOfInt1[0] = arrayOfInt[0];
      arrayOfInt1[1] = arrayOfInt[1];
      while (i < arrayOfByte.length) {
        arrayOfInt1[i + 2] = arrayOfByte[i] & 0xFF;
        i++;
      } 
      return a(arrayOfInt1);
    } 
    return String.format("Unknown Pattern (%s)", new Object[] { super.c(33422) });
  }
  
  public String d0() {
    m m = this.a.n(37382);
    if (m == null)
      return null; 
    DecimalFormat decimalFormat = new DecimalFormat("0.0##");
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(decimalFormat.format(m.doubleValue()));
    stringBuilder.append(" metres");
    return stringBuilder.toString();
  }
  
  public String e() {
    return a(j(41730));
  }
  
  public String e0() {
    return a(41996, new String[] { "Unknown", "Macro", "Close view", "Distant view" });
  }
  
  public String f() {
    Integer integer = this.a.k(40961);
    if (integer == null)
      return null; 
    if (integer.intValue() == 1)
      return "sRGB"; 
    if (integer.intValue() == 65535)
      return "Undefined"; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Unknown (");
    stringBuilder.append(integer);
    stringBuilder.append(")");
    return stringBuilder.toString();
  }
  
  public String f0() {
    return a(263, 1, new String[] { "No dithering or halftoning", "Ordered dither or halftone", "Randomized dither" });
  }
  
  public String g() {
    int[] arrayOfInt = this.a.j(37121);
    if (arrayOfInt == null)
      return null; 
    String[] arrayOfString = new String[7];
    int i = 0;
    arrayOfString[0] = "";
    arrayOfString[1] = "Y";
    arrayOfString[2] = "Cb";
    arrayOfString[3] = "Cr";
    arrayOfString[4] = "R";
    arrayOfString[5] = "G";
    arrayOfString[6] = "B";
    StringBuilder stringBuilder = new StringBuilder();
    while (i < Math.min(4, arrayOfInt.length)) {
      int k = arrayOfInt[i];
      if (k > 0 && k < arrayOfString.length)
        stringBuilder.append(arrayOfString[k]); 
      i++;
    } 
    return stringBuilder.toString();
  }
  
  public String g0() {
    byte[] arrayOfByte = this.a.d(37510);
    if (arrayOfByte == null)
      return null; 
    if (arrayOfByte.length == 0)
      return ""; 
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    hashMap.put("ASCII", System.getProperty("file.encoding"));
    hashMap.put("UNICODE", "UTF-16LE");
    hashMap.put("JIS", "Shift-JIS");
    try {
      if (arrayOfByte.length >= 10) {
        String str = new String(arrayOfByte, 0, 10);
        for (Map.Entry<Object, Object> entry : hashMap.entrySet()) {
          String str1 = (String)entry.getKey();
          String str2 = (String)entry.getValue();
          if (str.startsWith(str1))
            for (int i = str1.length();; i++) {
              if (i < 10) {
                byte b = arrayOfByte[i];
                if (b != 0 && b != 32)
                  return (new String(arrayOfByte, i, arrayOfByte.length - i, str2)).trim(); 
              } else {
                return (new String(arrayOfByte, 10, arrayOfByte.length - 10, str2)).trim();
              } 
            }  
        } 
      } 
      return (new String(arrayOfByte, System.getProperty("file.encoding"))).trim();
    } catch (UnsupportedEncodingException unsupportedEncodingException) {
      return null;
    } 
  }
  
  public String h() {
    StringBuilder stringBuilder;
    m m = this.a.n(37122);
    if (m == null)
      return null; 
    String str = m.a(true);
    if (m.q() && m.intValue() == 1) {
      stringBuilder = new StringBuilder();
      stringBuilder.append(str);
      str = " bit/pixel";
    } else {
      stringBuilder = new StringBuilder();
      stringBuilder.append(str);
      str = " bits/pixel";
    } 
    stringBuilder.append(str);
    return stringBuilder.toString();
  }
  
  public String h0() {
    Integer integer = this.a.k(37384);
    if (integer == null)
      return null; 
    int i = integer.intValue();
    if (i != 0) {
      if (i != 1) {
        if (i != 2) {
          if (i != 3) {
            if (i != 4) {
              if (i != 255) {
                StringBuilder stringBuilder;
                switch (i) {
                  default:
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Unknown (");
                    stringBuilder.append(integer);
                    stringBuilder.append(")");
                    return stringBuilder.toString();
                  case 24:
                    return "Studio Tungsten";
                  case 23:
                    return "D50";
                  case 22:
                    return "D75";
                  case 21:
                    return "D65";
                  case 20:
                    return "D55";
                  case 19:
                    return "Standard light (C)";
                  case 18:
                    return "Standard light (B)";
                  case 17:
                    return "Standard light";
                  case 16:
                    return "Warm White Fluorescent";
                  case 15:
                    return "White Fluorescent";
                  case 14:
                    return "Cool White Fluorescent";
                  case 13:
                    return "Day White Fluorescent";
                  case 12:
                    return "Daylight Fluorescent";
                  case 11:
                    return "Shade";
                  case 10:
                    return "Cloudy";
                  case 9:
                    break;
                } 
                return "Fine Weather";
              } 
              return "(Other)";
            } 
            return "Flash";
          } 
          return "Tungsten";
        } 
        return "Florescent";
      } 
      return "Daylight";
    } 
    return "Unknown";
  }
  
  public String i() {
    Integer integer = this.a.k(259);
    if (integer == null)
      return null; 
    int i = integer.intValue();
    if (i != 32766) {
      if (i != 32767) {
        StringBuilder stringBuilder;
        switch (i) {
          default:
            switch (i) {
              default:
                switch (i) {
                  default:
                    switch (i) {
                      default:
                        switch (i) {
                          default:
                            switch (i) {
                              default:
                                switch (i) {
                                  default:
                                    switch (i) {
                                      default:
                                        switch (i) {
                                          default:
                                            stringBuilder = new StringBuilder();
                                            stringBuilder.append("Unknown (");
                                            stringBuilder.append(integer);
                                            stringBuilder.append(")");
                                            return stringBuilder.toString();
                                          case 34720:
                                            return "Microsoft Document Imaging (MDI) Vector";
                                          case 34719:
                                            return "Microsoft Document Imaging (MDI) Progressive Transform Codec";
                                          case 34718:
                                            break;
                                        } 
                                        return "Microsoft Document Imaging (MDI) Binary Level Codec";
                                      case 34713:
                                        return "Nikon NEF Compressed";
                                      case 34712:
                                        break;
                                    } 
                                    return "JPEG 2000";
                                  case 34677:
                                    return "SGILog24";
                                  case 34676:
                                    break;
                                } 
                                return "SGILog";
                              case 32947:
                                return "DCS";
                              case 32946:
                                break;
                            } 
                            return "Deflate";
                          case 32909:
                            return "PixarLog";
                          case 32908:
                            break;
                        } 
                        return "PixarFilm";
                      case 32898:
                        return "IT8BL";
                      case 32897:
                        return "IT8MP";
                      case 32896:
                        return "IT8LW";
                      case 32895:
                        break;
                    } 
                    return "IT8CTPAD";
                  case 32773:
                    return "PackBits";
                  case 32772:
                    return "Samsung SRW Compressed 2";
                  case 32771:
                    return "CCIRLEW";
                  case 32770:
                    return "Samsung SRW Compressed";
                  case 32769:
                    break;
                } 
                return "Packed RAW";
              case 65535:
                return "Pentax PEF Compressed";
              case 65000:
                return "Kodak DCR Compressed";
              case 34892:
                return "Lossy JPEG";
              case 34715:
                return "JBIG2 TIFF FX";
              case 34661:
                return "JBIG";
              case 32867:
                return "Kodak KDC Compressed";
              case 32809:
                return "Thunderscan";
              case 262:
                return "Kodak 262";
              case 99:
                break;
            } 
            return "JPEG";
          case 10:
            return "JBIG Color";
          case 9:
            return "JBIG B&W";
          case 8:
            return "Adobe Deflate";
          case 7:
            return "JPEG";
          case 6:
            return "JPEG (old-style)";
          case 5:
            return "LZW";
          case 4:
            return "T6/Group 4 Fax";
          case 3:
            return "T4/Group 3 Fax";
          case 2:
            return "CCITT 1D";
          case 1:
            break;
        } 
        return "Uncompressed";
      } 
      return "Sony ARW Compressed";
    } 
    return "Next";
  }
  
  public String i0() {
    return a(41987, new String[] { "Auto white balance", "Manual white balance" });
  }
  
  public String j() {
    return a(41992, new String[] { "None", "Soft", "Hard" });
  }
  
  public String j0() {
    return k(40093);
  }
  
  public String k() {
    return a(41985, new String[] { "Normal process", "Custom process" });
  }
  
  public String k0() {
    return k(40092);
  }
  
  public String l() {
    m m = this.a.n(41988);
    return (m == null) ? null : ((m.b() == 0L) ? "Digital zoom not used" : (new DecimalFormat("0.#")).format(m.doubleValue()));
  }
  
  public String l0() {
    return k(40094);
  }
  
  public String m() {
    Integer integer = this.a.k(40963);
    if (integer == null)
      return null; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(integer);
    stringBuilder.append(" pixels");
    return stringBuilder.toString();
  }
  
  public String m0() {
    return k(40095);
  }
  
  public String n() {
    Integer integer = this.a.k(40962);
    if (integer == null)
      return null; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(integer);
    stringBuilder.append(" pixels");
    return stringBuilder.toString();
  }
  
  public String n0() {
    return k(40091);
  }
  
  public String o() {
    return b(36864, 2);
  }
  
  public String o0() {
    m m = this.a.n(282);
    if (m == null)
      return null; 
    String str1 = R();
    String str2 = m.a(true);
    if (str1 == null) {
      str1 = "unit";
    } else {
      str1 = str1.toLowerCase();
    } 
    return String.format("%s dots per %s", new Object[] { str2, str1 });
  }
  
  public String p() {
    m m = this.a.n(37380);
    if (m == null)
      return null; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(m.a(true));
    stringBuilder.append(" EV");
    return stringBuilder.toString();
  }
  
  public String p0() {
    return a(531, 1, new String[] { "Center of pixel array", "Datum point" });
  }
  
  public String q() {
    return a(41986, new String[] { "Auto exposure", "Manual exposure", "Auto bracket" });
  }
  
  public String q0() {
    int[] arrayOfInt = this.a.j(530);
    return (arrayOfInt == null || arrayOfInt.length < 2) ? null : ((arrayOfInt[0] == 2 && arrayOfInt[1] == 1) ? "YCbCr4:2:2" : ((arrayOfInt[0] == 2 && arrayOfInt[1] == 2) ? "YCbCr4:2:0" : "(Unknown)"));
  }
  
  public String r() {
    return a(34850, 1, new String[] { "Manual control", "Program normal", "Aperture priority", "Shutter priority", "Program creative (slow program)", "Program action (high-speed program)", "Portrait mode", "Landscape mode" });
  }
  
  public String r0() {
    m m = this.a.n(283);
    if (m == null)
      return null; 
    String str1 = R();
    String str2 = m.a(true);
    if (str1 == null) {
      str1 = "unit";
    } else {
      str1 = str1.toLowerCase();
    } 
    return String.format("%s dots per %s", new Object[] { str2, str1 });
  }
  
  public String s() {
    String str = this.a.p(33434);
    if (str == null)
      return null; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(str);
    stringBuilder.append(" sec");
    return stringBuilder.toString();
  }
  
  public String t() {
    m m = this.a.n(33437);
    return (m == null) ? null : j.a(m.doubleValue());
  }
  
  public String u() {
    return a(41728, 1, new String[] { "Film Scanner", "Reflection Print Scanner", "Digital Still Camera (DSC)" });
  }
  
  public String v() {
    return a(266, 1, new String[] { "Normal", "Reversed" });
  }
  
  public String w() {
    String str;
    Integer integer = this.a.k(37385);
    if (integer == null)
      return null; 
    StringBuilder stringBuilder = new StringBuilder();
    if ((integer.intValue() & 0x1) != 0) {
      str = "Flash fired";
    } else {
      str = "Flash did not fire";
    } 
    stringBuilder.append(str);
    if ((integer.intValue() & 0x4) != 0) {
      if ((integer.intValue() & 0x2) != 0) {
        str = ", return detected";
      } else {
        str = ", return not detected";
      } 
      stringBuilder.append(str);
    } 
    if ((integer.intValue() & 0x10) != 0)
      stringBuilder.append(", auto"); 
    if ((integer.intValue() & 0x40) != 0)
      stringBuilder.append(", red-eye reduction"); 
    return stringBuilder.toString();
  }
  
  public String x() {
    return b(40960, 2);
  }
  
  public String y() {
    m m = this.a.n(37386);
    return (m == null) ? null : j.b(m.doubleValue());
  }
  
  public String z() {
    return a(41488, 1, new String[] { "(No unit)", "Inches", "cm" });
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/o/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */