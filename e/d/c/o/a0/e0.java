package e.d.c.o.a0;

import e.d.a.e;
import e.d.b.h;
import e.d.b.m;
import e.d.c.j;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class e0 extends j<f0> {
  public e0(f0 paramf0) {
    super(paramf0);
  }
  
  public String A() {
    return a(61461, new String[] { "No", "Yes" });
  }
  
  public String B() {
    return a(61443, new String[] { "Normal", "Red-eye reduction", "Rear flash sync", "Wireless" });
  }
  
  public String C() {
    return a(4100, new String[] { null, null, "On", "Off" });
  }
  
  public String D() {
    Long long_ = ((f0)this.a).l(61459);
    if (long_ == null)
      return null; 
    double d = long_.longValue();
    Double.isNaN(d);
    return j.b(d / 256.0D);
  }
  
  public String E() {
    m m = ((f0)this.a).n(517);
    if (m == null)
      return null; 
    DecimalFormat decimalFormat = new DecimalFormat("0.###");
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(decimalFormat.format(m.doubleValue()));
    stringBuilder.append(" mm");
    return stringBuilder.toString();
  }
  
  public String F() {
    return a(61490, new String[] { "Wide Focus (Normal)", "Spot Focus" });
  }
  
  public String G() {
    Long long_ = ((f0)this.a).l(61460);
    if (long_ == null)
      return null; 
    if (long_.longValue() == 0L)
      return "Infinity"; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(long_);
    stringBuilder.append(" mm");
    return stringBuilder.toString();
  }
  
  public String H() {
    return a(61489, new String[] { "Auto Focus", "Manual Focus" });
  }
  
  public String I() {
    return a(4107, new String[] { "Auto", "Manual" });
  }
  
  public String J() {
    return a(4106, new String[] { "Normal", "Macro" });
  }
  
  public String K() {
    return a(61480, new String[] { "Standard Form", "Data Form" });
  }
  
  public String L() {
    return a(258, new String[] { "Raw", "Super Fine", "Fine", "Standard", "Extra Fine" });
  }
  
  public String M() {
    return a(259, new String[] { "Raw", "Super Fine", "Fine", "Standard", "Extra Fine" });
  }
  
  public String N() {
    return a(61446, new String[] { "Raw", "Super Fine", "Fine", "Standard", "Economy", "Extra Fine" });
  }
  
  public String O() {
    return a(61445, new String[] { "2560 x 1920", "1600 x 1200", "1280 x 960", "640 x 480" });
  }
  
  public String P() {
    return a(61484, new String[] { "Did Not Fire", "Fired" });
  }
  
  public String Q() {
    if (!((f0)this.a).f())
      return "N/A"; 
    Long long_ = ((f0)this.a).l(61457);
    if (long_ == null)
      return null; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(long_);
    stringBuilder.append(" min");
    return stringBuilder.toString();
  }
  
  public String R() {
    return a(61479, new String[] { "Still Image", "Time Lapse Movie" });
  }
  
  public String S() {
    if (!((f0)this.a).f())
      return "N/A"; 
    Long long_ = ((f0)this.a).l(61458);
    return (long_ == null) ? null : Long.toString(long_.longValue());
  }
  
  public String T() {
    return a(61477, new String[] { "100", "200", "400", "800", "Auto", "64" });
  }
  
  public String U() {
    m m = ((f0)this.a).n(4097);
    return (m == null) ? null : String.valueOf(Math.round(Math.pow(2.0D, m.doubleValue() - 5.0D) * 100.0D));
  }
  
  public String V() {
    String str = ((f0)this.a).p(519);
    if (str != null) {
      Integer integer = ((f0)this.a).k(513);
      if (integer == null)
        return null; 
      if ((str.startsWith("SX") && !str.startsWith("SX151")) || str.startsWith("D4322")) {
        int k = integer.intValue();
        if (k != 0) {
          if (k != 1) {
            if (k != 2) {
              if (k != 6) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unknown (");
                stringBuilder.append(integer.toString());
                stringBuilder.append(")");
                return stringBuilder.toString();
              } 
              return "RAW";
            } 
            return "Super High Quality (Fine)";
          } 
          return "High Quality (Normal)";
        } 
        return "Standard Quality (Low)";
      } 
      int i = integer.intValue();
      if (i != 0) {
        if (i != 1) {
          if (i != 2) {
            if (i != 4) {
              if (i != 5) {
                if (i != 6) {
                  if (i != 33) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Unknown (");
                    stringBuilder.append(integer.toString());
                    stringBuilder.append(")");
                    return stringBuilder.toString();
                  } 
                  return "Uncompressed";
                } 
                return "Small-Fine";
              } 
              return "Medium-Fine";
            } 
            return "RAW";
          } 
          return "Super High Quality (Fine)";
        } 
        return "High Quality (Normal)";
      } 
      return "Standard Quality (Low)";
    } 
    return a(513, 1, new String[] { "Standard Quality", "High Quality", "Super High Quality" });
  }
  
  public String W() {
    Long long_ = ((f0)this.a).l(61468);
    return (long_ == null) ? null : ((long_.longValue() == 0L) ? "File Number Memory Off" : Long.toString(long_.longValue()));
  }
  
  public String X() {
    return a(61452, new String[] { "Off", "On" });
  }
  
  public String Y() {
    return a(514, new String[] { "Normal (no macro)", "Macro" });
  }
  
  public String Z() {
    return b(0, 2);
  }
  
  public String a() {
    Double double_ = ((f0)this.a).g(4098);
    return (double_ == null) ? null : j.a(e.a(double_.doubleValue()));
  }
  
  public String a0() {
    Long long_ = ((f0)this.a).l(61463);
    if (long_ == null)
      return null; 
    double d = long_.longValue();
    Double.isNaN(d);
    return j.a(Math.pow(d / 16.0D - 0.5D, 2.0D));
  }
  
  public String b() {
    Long long_ = ((f0)this.a).l(61451);
    if (long_ == null)
      return null; 
    double d = long_.longValue();
    Double.isNaN(d);
    return j.a(Math.pow(d / 16.0D - 0.5D, 2.0D));
  }
  
  public String b0() {
    return a(61448, new String[] { "Multi-Segment", "Centre Weighted", "Spot" });
  }
  
  public String c() {
    Long long_ = ((f0)this.a).l(61485);
    DecimalFormat decimalFormat = new DecimalFormat("0.##");
    if (long_ == null)
      return null; 
    double d = long_.longValue();
    Double.isNaN(d);
    return decimalFormat.format(d / 8.0D - 6.0D);
  }
  
  public String c(int paramInt) {
    if (paramInt != 0) {
      if (paramInt != 519) {
        if (paramInt != 521) {
          if (paramInt != 770) {
            if (paramInt != 4100) {
              if (paramInt != 4111) {
                if (paramInt != 4113) {
                  if (paramInt != 4117) {
                    if (paramInt != 4137) {
                      if (paramInt != 4149) {
                        if (paramInt != 4106) {
                          if (paramInt != 4107) {
                            if (paramInt != 4119) {
                              if (paramInt != 4120) {
                                switch (paramInt) {
                                  default:
                                    switch (paramInt) {
                                      default:
                                        switch (paramInt) {
                                          default:
                                            switch (paramInt) {
                                              default:
                                                switch (paramInt) {
                                                  default:
                                                    switch (paramInt) {
                                                      default:
                                                        return super.c(paramInt);
                                                      case 61491:
                                                        return t();
                                                      case 61490:
                                                        return F();
                                                      case 61489:
                                                        return H();
                                                      case 61488:
                                                        return u0();
                                                      case 61487:
                                                        return m0();
                                                      case 61486:
                                                        return l0();
                                                      case 61485:
                                                        return c();
                                                      case 61484:
                                                        return P();
                                                      case 61483:
                                                        return g();
                                                      case 61482:
                                                        return m();
                                                      case 61481:
                                                        return o();
                                                      case 61480:
                                                        return K();
                                                      case 61479:
                                                        return R();
                                                      case 61478:
                                                        return k();
                                                      case 61477:
                                                        return T();
                                                      case 61476:
                                                        return z();
                                                      case 61475:
                                                        return n0();
                                                      case 61474:
                                                        return g0();
                                                      case 61473:
                                                        return q();
                                                      case 61472:
                                                        return f0();
                                                      case 61471:
                                                        return q0();
                                                      case 61470:
                                                        return s0();
                                                      case 61469:
                                                        return t0();
                                                      case 61468:
                                                        return W();
                                                      case 61467:
                                                        break;
                                                    } 
                                                    return y();
                                                  case 61464:
                                                    return a0();
                                                  case 61463:
                                                    return o0();
                                                  case 61462:
                                                    return s();
                                                  case 61461:
                                                    return A();
                                                  case 61460:
                                                    return G();
                                                  case 61459:
                                                    return D();
                                                  case 61458:
                                                    return S();
                                                  case 61457:
                                                    break;
                                                } 
                                                return Q();
                                              case 61455:
                                                return i();
                                              case 61454:
                                                return w();
                                              case 61453:
                                                return u();
                                              case 61452:
                                                return X();
                                              case 61451:
                                                return b();
                                              case 61450:
                                                return e();
                                              case 61449:
                                                return d();
                                              case 61448:
                                                return b0();
                                              case 61447:
                                                return i0();
                                              case 61446:
                                                return N();
                                              case 61445:
                                                return O();
                                              case 61444:
                                                return r0();
                                              case 61443:
                                                return B();
                                              case 61442:
                                                break;
                                            } 
                                            return x();
                                          case 4098:
                                            return a();
                                          case 4097:
                                            return U();
                                          case 4096:
                                            break;
                                        } 
                                        return j0();
                                      case 517:
                                        return E();
                                      case 516:
                                        return v();
                                      case 515:
                                        return f();
                                      case 514:
                                        return Y();
                                      case 513:
                                        return V();
                                      case 512:
                                        break;
                                    } 
                                    return k0();
                                  case 259:
                                    return M();
                                  case 258:
                                    return L();
                                  case 257:
                                    break;
                                } 
                                return p();
                              } 
                              return h();
                            } 
                            return e0();
                          } 
                          return I();
                        } 
                        return J();
                      } 
                      return d0();
                    } 
                    return r();
                  } 
                  return p0();
                } 
                return n();
              } 
              return h0();
            } 
            return C();
          } 
          return c0();
        } 
        return j();
      } 
      return l();
    } 
    return Z();
  }
  
  public String c0() {
    return a(770, new String[] { "Off", "On", "On (Preset)" });
  }
  
  public String d() {
    Long long_ = ((f0)this.a).l(61449);
    if (long_ == null)
      return null; 
    double d = long_.longValue();
    Double.isNaN(d);
    d = Math.pow(d / 8.0D - 1.0D, 2.0D);
    DecimalFormat decimalFormat = new DecimalFormat("0.##");
    decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
    return decimalFormat.format(d * 3.125D);
  }
  
  public String d0() {
    return a(4149, new String[] { "No", "Yes" });
  }
  
  public String e() {
    Long long_ = ((f0)this.a).l(61450);
    if (long_ == null)
      return null; 
    double d = (49L - long_.longValue());
    Double.isNaN(d);
    d = Math.pow(d / 8.0D, 2.0D);
    DecimalFormat decimalFormat = new DecimalFormat("0.###");
    decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(decimalFormat.format(d));
    stringBuilder.append(" sec");
    return stringBuilder.toString();
  }
  
  public String e0() {
    int[] arrayOfInt = ((f0)this.a).j(4119);
    if (arrayOfInt == null)
      return null; 
    double d = (short)arrayOfInt[0];
    Double.isNaN(d);
    return String.valueOf(d / 256.0D);
  }
  
  public String f() {
    return a(515, new String[] { "Off", "On" });
  }
  
  public String f0() {
    Long long_ = ((f0)this.a).l(61472);
    return (long_ == null) ? null : Long.toString(long_.longValue() - 3L);
  }
  
  public String g() {
    return super.c(61483);
  }
  
  public String g0() {
    return a(61474, new String[] { "Hard", "Normal", "Soft" });
  }
  
  public String h() {
    int[] arrayOfInt = ((f0)this.a).j(4120);
    if (arrayOfInt == null)
      return null; 
    double d = (short)arrayOfInt[0];
    Double.isNaN(d);
    return String.valueOf(d / 256.0D);
  }
  
  public String h0() {
    return a(4111, new String[] { "Normal", "Hard", "Soft" });
  }
  
  public String i() {
    return a(61455, new String[] { "1/3 EV", "2/3 EV", "1 EV" });
  }
  
  public String i0() {
    return a(61447, new String[] { "Single", "Continuous", "Self Timer", null, "Bracketing", "Interval", "UHS Continuous", "HS Continuous" });
  }
  
  public String j() {
    byte[] arrayOfByte = ((f0)this.a).d(521);
    return (arrayOfByte == null) ? null : new String(arrayOfByte);
  }
  
  public String j0() {
    return h(4096);
  }
  
  public String k() {
    return a(61478, new String[] { "DiMAGE 7", "DiMAGE 5", "DiMAGE S304", "DiMAGE S404", "DiMAGE 7i", "DiMAGE 7Hi", "DiMAGE A1", "DiMAGE S414" });
  }
  
  public String k0() {
    // Byte code:
    //   0: aload_0
    //   1: getfield a : Le/d/c/b;
    //   4: checkcast e/d/c/o/a0/f0
    //   7: sipush #512
    //   10: invokevirtual m : (I)Ljava/lang/Object;
    //   13: checkcast [J
    //   16: astore #4
    //   18: aload #4
    //   20: ifnonnull -> 25
    //   23: aconst_null
    //   24: areturn
    //   25: aload #4
    //   27: arraylength
    //   28: iconst_1
    //   29: if_icmpge -> 36
    //   32: ldc_w ''
    //   35: areturn
    //   36: new java/lang/StringBuilder
    //   39: dup
    //   40: invokespecial <init> : ()V
    //   43: astore_3
    //   44: aload #4
    //   46: iconst_0
    //   47: laload
    //   48: l2i
    //   49: istore_1
    //   50: iload_1
    //   51: ifeq -> 94
    //   54: iload_1
    //   55: iconst_1
    //   56: if_icmpeq -> 69
    //   59: iload_1
    //   60: iconst_2
    //   61: if_icmpeq -> 87
    //   64: iload_1
    //   65: iconst_3
    //   66: if_icmpeq -> 80
    //   69: aload_3
    //   70: ldc_w 'Unknown picture taking mode'
    //   73: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   76: pop
    //   77: goto -> 104
    //   80: ldc_w 'Panorama picture taking mode'
    //   83: astore_2
    //   84: goto -> 98
    //   87: ldc_w 'Fast picture taking mode'
    //   90: astore_2
    //   91: goto -> 98
    //   94: ldc_w 'Normal picture taking mode'
    //   97: astore_2
    //   98: aload_3
    //   99: aload_2
    //   100: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   103: pop
    //   104: aload #4
    //   106: arraylength
    //   107: iconst_2
    //   108: if_icmplt -> 187
    //   111: aload #4
    //   113: iconst_1
    //   114: laload
    //   115: l2i
    //   116: istore_1
    //   117: iload_1
    //   118: ifeq -> 187
    //   121: iload_1
    //   122: iconst_1
    //   123: if_icmpeq -> 180
    //   126: iload_1
    //   127: iconst_2
    //   128: if_icmpeq -> 173
    //   131: iload_1
    //   132: iconst_3
    //   133: if_icmpeq -> 166
    //   136: aload_3
    //   137: ldc_w ' / '
    //   140: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   143: pop
    //   144: aload_3
    //   145: aload #4
    //   147: iconst_1
    //   148: laload
    //   149: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   152: pop
    //   153: ldc_w 'th in a sequence'
    //   156: astore_2
    //   157: aload_3
    //   158: aload_2
    //   159: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   162: pop
    //   163: goto -> 187
    //   166: ldc_w ' / 3rd in a sequence'
    //   169: astore_2
    //   170: goto -> 157
    //   173: ldc_w ' / 2nd in a sequence'
    //   176: astore_2
    //   177: goto -> 157
    //   180: ldc_w ' / 1st in a sequence'
    //   183: astore_2
    //   184: goto -> 157
    //   187: aload #4
    //   189: arraylength
    //   190: iconst_3
    //   191: if_icmplt -> 254
    //   194: aload #4
    //   196: iconst_2
    //   197: laload
    //   198: l2i
    //   199: istore_1
    //   200: iload_1
    //   201: iconst_1
    //   202: if_icmpeq -> 244
    //   205: iload_1
    //   206: iconst_2
    //   207: if_icmpeq -> 237
    //   210: iload_1
    //   211: iconst_3
    //   212: if_icmpeq -> 230
    //   215: iload_1
    //   216: iconst_4
    //   217: if_icmpeq -> 223
    //   220: goto -> 254
    //   223: ldc_w ' / Top to bottom panorama direction'
    //   226: astore_2
    //   227: goto -> 248
    //   230: ldc_w ' / Bottom to top panorama direction'
    //   233: astore_2
    //   234: goto -> 248
    //   237: ldc_w ' / Right to left panorama direction'
    //   240: astore_2
    //   241: goto -> 248
    //   244: ldc_w ' / Left to right panorama direction'
    //   247: astore_2
    //   248: aload_3
    //   249: aload_2
    //   250: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   253: pop
    //   254: aload_3
    //   255: invokevirtual toString : ()Ljava/lang/String;
    //   258: areturn
  }
  
  public String l() {
    String str2 = ((f0)this.a).p(519);
    if (str2 == null)
      return null; 
    String str1 = str2;
    if (f0.f.containsKey(str2))
      str1 = f0.f.get(str2); 
    return str1;
  }
  
  public String l0() {
    return super.c(61486);
  }
  
  public String m() {
    Long long_ = ((f0)this.a).l(61482);
    return (long_ == null) ? null : Long.toString(long_.longValue() - 3L);
  }
  
  public String m0() {
    return super.c(61487);
  }
  
  public String n() {
    int[] arrayOfInt = ((f0)this.a).j(4113);
    if (arrayOfInt == null)
      return null; 
    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < arrayOfInt.length; i++) {
      stringBuilder.append((short)arrayOfInt[i]);
      if (i < arrayOfInt.length - 1)
        stringBuilder.append(" "); 
    } 
    return (stringBuilder.length() == 0) ? null : stringBuilder.toString();
  }
  
  public String n0() {
    return a(61475, new String[] { "None", "Portrait", "Text", "Night Portrait", "Sunset", "Sports Action" });
  }
  
  public String o() {
    return a(61481, new String[] { "Natural Color", "Black & White", "Vivid Color", "Solarization", "AdobeRGB" });
  }
  
  public String o0() {
    Long long_ = ((f0)this.a).l(61463);
    if (long_ == null)
      return null; 
    int i = (int)(long_.longValue() >> 8L & 0xFFL);
    int k = (int)(long_.longValue() >> 16L & 0xFFL);
    int m = (int)(0xFFL & long_.longValue());
    return !h.b(i, k, m) ? "Invalid time" : String.format("%02d:%02d:%02d", new Object[] { Integer.valueOf(i), Integer.valueOf(k), Integer.valueOf(m) });
  }
  
  public String p() {
    return a(257, new String[] { "Natural Colour", "Black & White", "Vivid Colour", "Solarization", "AdobeRGB" });
  }
  
  public String p0() {
    int[] arrayOfInt = ((f0)this.a).j(4117);
    if (arrayOfInt == null)
      return null; 
    String str = String.format("%d %d", new Object[] { Integer.valueOf(arrayOfInt[0]), Integer.valueOf(arrayOfInt[1]) });
    if (str.equals("1 0"))
      return "Auto"; 
    if (str.equals("1 2"))
      return "Auto (2)"; 
    if (str.equals("1 4"))
      return "Auto (4)"; 
    if (str.equals("2 2"))
      return "3000 Kelvin"; 
    if (str.equals("2 3"))
      return "3700 Kelvin"; 
    if (str.equals("2 4"))
      return "4000 Kelvin"; 
    if (str.equals("2 5"))
      return "4500 Kelvin"; 
    if (str.equals("2 6"))
      return "5500 Kelvin"; 
    if (str.equals("2 7"))
      return "6500 Kelvin"; 
    if (str.equals("2 8"))
      return "7500 Kelvin"; 
    if (str.equals("3 0"))
      return "One-touch"; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Unknown ");
    stringBuilder.append(str);
    return stringBuilder.toString();
  }
  
  public String q() {
    Long long_ = ((f0)this.a).l(61473);
    return (long_ == null) ? null : Long.toString(long_.longValue() - 3L);
  }
  
  public String q0() {
    Long long_ = ((f0)this.a).l(61471);
    DecimalFormat decimalFormat = new DecimalFormat("0.##");
    if (long_ == null)
      return null; 
    double d = long_.longValue();
    Double.isNaN(d);
    return decimalFormat.format(d / 256.0D);
  }
  
  public String r() {
    return a(4137, new String[] { "High", "Normal", "Low" });
  }
  
  public String r0() {
    return a(61444, new String[] { 
          "Auto", "Daylight", "Cloudy", "Tungsten", null, "Custom", null, "Fluorescent", "Fluorescent 2", null, 
          null, "Custom 2", "Custom 3" });
  }
  
  public String s() {
    Long long_ = ((f0)this.a).l(61462);
    if (long_ == null)
      return null; 
    int i = (int)(long_.longValue() & 0xFFL);
    int k = (int)(long_.longValue() >> 16L & 0xFFL);
    int m = (int)(0xFFL & long_.longValue() >> 8L) + 1970;
    return !h.a(m, k, i) ? "Invalid date" : String.format("%04d-%02d-%02d", new Object[] { Integer.valueOf(m), Integer.valueOf(k + 1), Integer.valueOf(i) });
  }
  
  public String s0() {
    Long long_ = ((f0)this.a).l(61470);
    DecimalFormat decimalFormat = new DecimalFormat("0.##");
    if (long_ == null)
      return null; 
    double d = long_.longValue();
    Double.isNaN(d);
    return decimalFormat.format(d / 256.0D);
  }
  
  public String t() {
    return a(61491, new String[] { "Exposure", "Contrast", "Saturation", "Filter" });
  }
  
  public String t0() {
    Long long_ = ((f0)this.a).l(61469);
    DecimalFormat decimalFormat = new DecimalFormat("0.##");
    if (long_ == null)
      return null; 
    double d = long_.longValue();
    Double.isNaN(d);
    return decimalFormat.format(d / 256.0D);
  }
  
  public String u() {
    return a(61453, new String[] { "Off", "Electronic magnification", "Digital zoom 2x" });
  }
  
  public String u0() {
    return a(61488, new String[] { "No Zone or AF Failed", "Center Zone (Horizontal Orientation)", "Center Zone (Vertical Orientation)", "Left Zone", "Right Zone" });
  }
  
  public String v() {
    m m = ((f0)this.a).n(516);
    return (m == null) ? null : m.a(false);
  }
  
  public String w() {
    Long long_ = ((f0)this.a).l(61454);
    DecimalFormat decimalFormat = new DecimalFormat("0.##");
    if (long_ == null)
      return null; 
    StringBuilder stringBuilder = new StringBuilder();
    double d = long_.longValue();
    Double.isNaN(d);
    stringBuilder.append(decimalFormat.format(d / 3.0D - 2.0D));
    stringBuilder.append(" EV");
    return stringBuilder.toString();
  }
  
  public String x() {
    return a(61442, new String[] { "P", "A", "S", "M" });
  }
  
  public String y() {
    return a(61467, new String[] { "Off", "On" });
  }
  
  public String z() {
    Long long_ = ((f0)this.a).l(61476);
    DecimalFormat decimalFormat = new DecimalFormat("0.##");
    if (long_ == null)
      return null; 
    StringBuilder stringBuilder = new StringBuilder();
    double d = (long_.longValue() - 6L);
    Double.isNaN(d);
    stringBuilder.append(decimalFormat.format(d / 3.0D));
    stringBuilder.append(" EV");
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/o/a0/e0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */