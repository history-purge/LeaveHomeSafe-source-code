package e.d.c.r;

import e.d.b.b;
import e.d.c.j;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.DecimalFormat;

public class a extends j<b> {
  public a(b paramb) {
    super(paramb);
  }
  
  private static int a(String paramString) {
    return (new b(paramString.getBytes())).g(0);
  }
  
  private String a() {
    String str = ((b)this.a).p(40);
    if (str == null)
      return null; 
    try {
      int i = a(str);
      switch (i) {
        default:
          return String.format("Unknown (%s)", new Object[] { str });
        case 1413959252:
          return "Taligent, Inc.";
        case 1398099543:
          return "Sun Microsystems, Inc.";
        case 1397180704:
          return "Silicon Graphics, Inc.";
        case 1297303124:
          return "Microsoft Corporation";
        case 1095782476:
          break;
      } 
      return "Apple Computer, Inc.";
    } catch (IOException iOException) {
      return str;
    } 
  }
  
  public static String a(double paramDouble, int paramInt, boolean paramBoolean) {
    // Byte code:
    //   0: ldc ''
    //   2: astore #18
    //   4: iconst_1
    //   5: istore #8
    //   7: iload_2
    //   8: iconst_1
    //   9: if_icmpge -> 45
    //   12: new java/lang/StringBuilder
    //   15: dup
    //   16: invokespecial <init> : ()V
    //   19: astore #16
    //   21: aload #16
    //   23: ldc ''
    //   25: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   28: pop
    //   29: aload #16
    //   31: dload_0
    //   32: invokestatic round : (D)J
    //   35: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   38: pop
    //   39: aload #16
    //   41: invokevirtual toString : ()Ljava/lang/String;
    //   44: areturn
    //   45: dload_0
    //   46: d2l
    //   47: invokestatic abs : (J)J
    //   50: lstore #14
    //   52: dload_0
    //   53: invokestatic abs : (D)D
    //   56: dstore #4
    //   58: lload #14
    //   60: l2d
    //   61: dstore #6
    //   63: dload #6
    //   65: invokestatic isNaN : (D)Z
    //   68: pop
    //   69: dload #4
    //   71: dload #6
    //   73: dsub
    //   74: ldc2_w 10.0
    //   77: iload_2
    //   78: i2d
    //   79: invokestatic pow : (DD)D
    //   82: dmul
    //   83: invokestatic round : (D)J
    //   86: l2i
    //   87: i2l
    //   88: lstore #12
    //   90: ldc ''
    //   92: astore #16
    //   94: lload #12
    //   96: lstore #10
    //   98: iload_2
    //   99: ifle -> 192
    //   102: lload #10
    //   104: ldc2_w 10
    //   107: lrem
    //   108: invokestatic abs : (J)J
    //   111: l2i
    //   112: i2b
    //   113: istore #9
    //   115: lload #10
    //   117: ldc2_w 10
    //   120: ldiv
    //   121: lstore #10
    //   123: aload #16
    //   125: invokevirtual length : ()I
    //   128: ifgt -> 149
    //   131: iload_3
    //   132: ifne -> 149
    //   135: iload #9
    //   137: ifne -> 149
    //   140: aload #16
    //   142: astore #17
    //   144: iload_2
    //   145: iconst_1
    //   146: if_icmpne -> 181
    //   149: new java/lang/StringBuilder
    //   152: dup
    //   153: invokespecial <init> : ()V
    //   156: astore #17
    //   158: aload #17
    //   160: iload #9
    //   162: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   165: pop
    //   166: aload #17
    //   168: aload #16
    //   170: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   173: pop
    //   174: aload #17
    //   176: invokevirtual toString : ()Ljava/lang/String;
    //   179: astore #17
    //   181: iload_2
    //   182: iconst_1
    //   183: isub
    //   184: istore_2
    //   185: aload #17
    //   187: astore #16
    //   189: goto -> 98
    //   192: lload #14
    //   194: lload #10
    //   196: ladd
    //   197: lstore #10
    //   199: dload_0
    //   200: dconst_0
    //   201: dcmpg
    //   202: ifge -> 228
    //   205: iload #8
    //   207: istore_2
    //   208: lload #10
    //   210: lconst_0
    //   211: lcmp
    //   212: ifne -> 230
    //   215: lload #12
    //   217: lconst_0
    //   218: lcmp
    //   219: ifeq -> 228
    //   222: iload #8
    //   224: istore_2
    //   225: goto -> 230
    //   228: iconst_0
    //   229: istore_2
    //   230: new java/lang/StringBuilder
    //   233: dup
    //   234: invokespecial <init> : ()V
    //   237: astore #19
    //   239: aload #18
    //   241: astore #17
    //   243: iload_2
    //   244: ifeq -> 251
    //   247: ldc '-'
    //   249: astore #17
    //   251: aload #19
    //   253: aload #17
    //   255: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   258: pop
    //   259: aload #19
    //   261: lload #10
    //   263: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   266: pop
    //   267: aload #19
    //   269: ldc '.'
    //   271: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   274: pop
    //   275: aload #19
    //   277: aload #16
    //   279: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   282: pop
    //   283: aload #19
    //   285: invokevirtual toString : ()Ljava/lang/String;
    //   288: areturn
  }
  
  private String b() {
    String str = ((b)this.a).p(12);
    if (str == null)
      return null; 
    try {
      int i = a(str);
      switch (i) {
        default:
          return String.format("Unknown (%s)", new Object[] { str });
        case 1936744803:
          return "ColorSpace Conversion";
        case 1935896178:
          return "Input Device";
        case 1886549106:
          return "Output Device";
        case 1852662636:
          return "Named Color";
        case 1835955314:
          return "Display Device";
        case 1818848875:
          return "DeviceLink";
        case 1633842036:
          break;
      } 
      return "Abstract";
    } catch (IOException iOException) {
      return str;
    } 
  }
  
  private String c() {
    Integer integer = ((b)this.a).k(8);
    return (integer == null) ? null : String.format("%d.%d.%d", new Object[] { Integer.valueOf((integer.intValue() & 0xFF000000) >> 24), Integer.valueOf((integer.intValue() & 0xF00000) >> 20), Integer.valueOf((integer.intValue() & 0xF0000) >> 16) });
  }
  
  private String d() {
    return a(64, new String[] { "Perceptual", "Media-Relative Colorimetric", "Saturation", "ICC-Absolute Colorimetric" });
  }
  
  private String j(int paramInt) {
    float f1;
    float f2;
    float f3;
    float f4;
    int i;
    String str2;
    String str3;
    try {
      StringBuilder stringBuilder1;
      StringBuilder stringBuilder2;
      DecimalFormat decimalFormat1;
      byte[] arrayOfByte = ((b)this.a).d(paramInt);
      if (arrayOfByte == null)
        return ((b)this.a).p(paramInt); 
      b b = new b(arrayOfByte);
      int k = 0;
      paramInt = 0;
      i = b.g(0);
      switch (i) {
        default:
          return String.format("%s (0x%08X): %d bytes", new Object[] { c.a(i), Integer.valueOf(i), Integer.valueOf(arrayOfByte.length) });
        case 1952807028:
          try {
            return new String(arrayOfByte, 8, arrayOfByte.length - 8 - 1, "ASCII");
          } catch (UnsupportedEncodingException unsupportedEncodingException) {
            return new String(arrayOfByte, 8, arrayOfByte.length - 8 - 1);
          } 
        case 1936287520:
          return c.a(b.g(8));
        case 1835824483:
          k = b.g(8);
          stringBuilder2 = new StringBuilder();
          stringBuilder2.append(k);
          while (true) {
            if (paramInt < k) {
              String str4;
              int m = paramInt * 12 + 16;
              String str5 = c.a(b.g(m));
              i = b.g(m + 4);
              m = b.g(m + 8);
              try {
                str4 = new String(arrayOfByte, m, i, "UTF-16BE");
              } catch (UnsupportedEncodingException unsupportedEncodingException) {
                str4 = new String(arrayOfByte, m, i);
              } 
              stringBuilder2.append(" ");
              stringBuilder2.append(str5);
              stringBuilder2.append("(");
              stringBuilder2.append(str4);
              stringBuilder2.append(")");
              paramInt++;
              continue;
            } 
            return stringBuilder2.toString();
          } 
        case 1835360627:
          paramInt = b.g(8);
          f1 = b.j(12);
          f2 = b.j(16);
          f3 = b.j(20);
          k = b.g(24);
          f4 = b.j(28);
          i = b.g(32);
          str3 = "Unknown";
          if (paramInt != 0) {
            if (paramInt != 1) {
              if (paramInt != 2) {
                str2 = String.format("Unknown %d", new Object[] { Integer.valueOf(paramInt) });
              } else {
                str2 = "1964 10°";
              } 
            } else {
              str2 = "1931 2°";
            } 
          } else {
            str2 = "Unknown";
          } 
          if (k != 0) {
            if (k != 1) {
              if (k != 2) {
                str3 = String.format("Unknown %d", new Object[] { Integer.valueOf(paramInt) });
                break;
              } 
              str3 = "0/d or d/0";
            } else {
              str3 = "0/45 or 45/0";
            } 
            switch (i) {
              default:
                str = String.format("Unknown %d", new Object[] { Integer.valueOf(i) });
                decimalFormat2 = new DecimalFormat("0.###");
                return String.format("%s Observer, Backing (%s, %s, %s), Geometry %s, Flare %d%%, Illuminant %s", new Object[] { str2, decimalFormat2.format(f1), decimalFormat2.format(f2), decimalFormat2.format(f3), str3, Integer.valueOf(Math.round(f4 * 100.0F)), str });
              case 8:
                str = "F8";
                decimalFormat2 = new DecimalFormat("0.###");
                return String.format("%s Observer, Backing (%s, %s, %s), Geometry %s, Flare %d%%, Illuminant %s", new Object[] { str2, decimalFormat2.format(f1), decimalFormat2.format(f2), decimalFormat2.format(f3), str3, Integer.valueOf(Math.round(f4 * 100.0F)), str });
              case 7:
                str = "Equi-Power (E)";
                decimalFormat2 = new DecimalFormat("0.###");
                return String.format("%s Observer, Backing (%s, %s, %s), Geometry %s, Flare %d%%, Illuminant %s", new Object[] { str2, decimalFormat2.format(f1), decimalFormat2.format(f2), decimalFormat2.format(f3), str3, Integer.valueOf(Math.round(f4 * 100.0F)), str });
              case 6:
                str = "A";
                decimalFormat2 = new DecimalFormat("0.###");
                return String.format("%s Observer, Backing (%s, %s, %s), Geometry %s, Flare %d%%, Illuminant %s", new Object[] { str2, decimalFormat2.format(f1), decimalFormat2.format(f2), decimalFormat2.format(f3), str3, Integer.valueOf(Math.round(f4 * 100.0F)), str });
              case 5:
                str = "D55";
                decimalFormat2 = new DecimalFormat("0.###");
                return String.format("%s Observer, Backing (%s, %s, %s), Geometry %s, Flare %d%%, Illuminant %s", new Object[] { str2, decimalFormat2.format(f1), decimalFormat2.format(f2), decimalFormat2.format(f3), str3, Integer.valueOf(Math.round(f4 * 100.0F)), str });
              case 4:
                str = "F2";
                decimalFormat2 = new DecimalFormat("0.###");
                return String.format("%s Observer, Backing (%s, %s, %s), Geometry %s, Flare %d%%, Illuminant %s", new Object[] { str2, decimalFormat2.format(f1), decimalFormat2.format(f2), decimalFormat2.format(f3), str3, Integer.valueOf(Math.round(f4 * 100.0F)), str });
              case 3:
                str = "D93";
                decimalFormat2 = new DecimalFormat("0.###");
                return String.format("%s Observer, Backing (%s, %s, %s), Geometry %s, Flare %d%%, Illuminant %s", new Object[] { str2, decimalFormat2.format(f1), decimalFormat2.format(f2), decimalFormat2.format(f3), str3, Integer.valueOf(Math.round(f4 * 100.0F)), str });
              case 2:
                str = "D65";
                decimalFormat2 = new DecimalFormat("0.###");
                return String.format("%s Observer, Backing (%s, %s, %s), Geometry %s, Flare %d%%, Illuminant %s", new Object[] { str2, decimalFormat2.format(f1), decimalFormat2.format(f2), decimalFormat2.format(f3), str3, Integer.valueOf(Math.round(f4 * 100.0F)), str });
              case 1:
                str = "D50";
                decimalFormat2 = new DecimalFormat("0.###");
                return String.format("%s Observer, Backing (%s, %s, %s), Geometry %s, Flare %d%%, Illuminant %s", new Object[] { str2, decimalFormat2.format(f1), decimalFormat2.format(f2), decimalFormat2.format(f3), str3, Integer.valueOf(Math.round(f4 * 100.0F)), str });
              case 0:
                break;
            } 
            String str = "unknown";
            DecimalFormat decimalFormat2 = new DecimalFormat("0.###");
            return String.format("%s Observer, Backing (%s, %s, %s), Geometry %s, Flare %d%%, Illuminant %s", new Object[] { str2, decimalFormat2.format(f1), decimalFormat2.format(f2), decimalFormat2.format(f3), str3, Integer.valueOf(Math.round(f4 * 100.0F)), str });
          } 
          break;
        case 1684370275:
          return new String((byte[])str2, 12, str3.g(8) - 1);
        case 1668641398:
          k = str3.g(8);
          stringBuilder1 = new StringBuilder();
          for (paramInt = 0; paramInt < k; paramInt++) {
            if (paramInt != 0)
              stringBuilder1.append(", "); 
            i = str3.k(paramInt * 2 + 12);
            double d = i;
            Double.isNaN(d);
            d /= 65535.0D;
            stringBuilder1.append(a(d, 7, false));
          } 
          return stringBuilder1.toString();
        case 1482250784:
          stringBuilder1 = new StringBuilder();
          decimalFormat1 = new DecimalFormat("0.####");
          i = (str2.length - 8) / 12;
          for (paramInt = k; paramInt < i; paramInt++) {
            k = paramInt * 12 + 8;
            f1 = str3.j(k);
            f2 = str3.j(k + 4);
            f3 = str3.j(k + 8);
            if (paramInt > 0)
              stringBuilder1.append(", "); 
            stringBuilder1.append("(");
            stringBuilder1.append(decimalFormat1.format(f1));
            stringBuilder1.append(", ");
            stringBuilder1.append(decimalFormat1.format(f2));
            stringBuilder1.append(", ");
            stringBuilder1.append(decimalFormat1.format(f3));
            stringBuilder1.append(")");
          } 
          return stringBuilder1.toString();
      } 
    } catch (IOException iOException) {
      return null;
    } 
    switch (i) {
      default:
        str1 = String.format("Unknown %d", new Object[] { Integer.valueOf(i) });
        decimalFormat = new DecimalFormat("0.###");
        return String.format("%s Observer, Backing (%s, %s, %s), Geometry %s, Flare %d%%, Illuminant %s", new Object[] { str2, decimalFormat.format(f1), decimalFormat.format(f2), decimalFormat.format(f3), str3, Integer.valueOf(Math.round(f4 * 100.0F)), str1 });
      case 8:
        str1 = "F8";
        decimalFormat = new DecimalFormat("0.###");
        return String.format("%s Observer, Backing (%s, %s, %s), Geometry %s, Flare %d%%, Illuminant %s", new Object[] { str2, decimalFormat.format(f1), decimalFormat.format(f2), decimalFormat.format(f3), str3, Integer.valueOf(Math.round(f4 * 100.0F)), str1 });
      case 7:
        str1 = "Equi-Power (E)";
        decimalFormat = new DecimalFormat("0.###");
        return String.format("%s Observer, Backing (%s, %s, %s), Geometry %s, Flare %d%%, Illuminant %s", new Object[] { str2, decimalFormat.format(f1), decimalFormat.format(f2), decimalFormat.format(f3), str3, Integer.valueOf(Math.round(f4 * 100.0F)), str1 });
      case 6:
        str1 = "A";
        decimalFormat = new DecimalFormat("0.###");
        return String.format("%s Observer, Backing (%s, %s, %s), Geometry %s, Flare %d%%, Illuminant %s", new Object[] { str2, decimalFormat.format(f1), decimalFormat.format(f2), decimalFormat.format(f3), str3, Integer.valueOf(Math.round(f4 * 100.0F)), str1 });
      case 5:
        str1 = "D55";
        decimalFormat = new DecimalFormat("0.###");
        return String.format("%s Observer, Backing (%s, %s, %s), Geometry %s, Flare %d%%, Illuminant %s", new Object[] { str2, decimalFormat.format(f1), decimalFormat.format(f2), decimalFormat.format(f3), str3, Integer.valueOf(Math.round(f4 * 100.0F)), str1 });
      case 4:
        str1 = "F2";
        decimalFormat = new DecimalFormat("0.###");
        return String.format("%s Observer, Backing (%s, %s, %s), Geometry %s, Flare %d%%, Illuminant %s", new Object[] { str2, decimalFormat.format(f1), decimalFormat.format(f2), decimalFormat.format(f3), str3, Integer.valueOf(Math.round(f4 * 100.0F)), str1 });
      case 3:
        str1 = "D93";
        decimalFormat = new DecimalFormat("0.###");
        return String.format("%s Observer, Backing (%s, %s, %s), Geometry %s, Flare %d%%, Illuminant %s", new Object[] { str2, decimalFormat.format(f1), decimalFormat.format(f2), decimalFormat.format(f3), str3, Integer.valueOf(Math.round(f4 * 100.0F)), str1 });
      case 2:
        str1 = "D65";
        decimalFormat = new DecimalFormat("0.###");
        return String.format("%s Observer, Backing (%s, %s, %s), Geometry %s, Flare %d%%, Illuminant %s", new Object[] { str2, decimalFormat.format(f1), decimalFormat.format(f2), decimalFormat.format(f3), str3, Integer.valueOf(Math.round(f4 * 100.0F)), str1 });
      case 1:
        str1 = "D50";
        decimalFormat = new DecimalFormat("0.###");
        return String.format("%s Observer, Backing (%s, %s, %s), Geometry %s, Flare %d%%, Illuminant %s", new Object[] { str2, decimalFormat.format(f1), decimalFormat.format(f2), decimalFormat.format(f3), str3, Integer.valueOf(Math.round(f4 * 100.0F)), str1 });
      case 0:
        break;
    } 
    String str1 = "unknown";
    DecimalFormat decimalFormat = new DecimalFormat("0.###");
    return String.format("%s Observer, Backing (%s, %s, %s), Geometry %s, Flare %d%%, Illuminant %s", new Object[] { str2, decimalFormat.format(f1), decimalFormat.format(f2), decimalFormat.format(f3), str3, Integer.valueOf(Math.round(f4 * 100.0F)), str1 });
  }
  
  public String c(int paramInt) {
    return (paramInt != 8) ? ((paramInt != 12) ? ((paramInt != 40) ? ((paramInt != 64) ? ((paramInt > 538976288 && paramInt < 2054847098) ? j(paramInt) : super.c(paramInt)) : d()) : a()) : b()) : c();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/r/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */