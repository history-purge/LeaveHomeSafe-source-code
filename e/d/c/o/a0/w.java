package e.d.c.o.a0;

import e.d.b.m;
import e.d.c.j;
import java.text.DecimalFormat;
import java.util.HashMap;

public class w extends j<x> {
  private static final HashMap<Integer, String> b = new HashMap<Integer, String>();
  
  private static final HashMap<Integer, String> c = new HashMap<Integer, String>();
  
  static {
    HashMap<Integer, String> hashMap = c;
    Integer integer = Integer.valueOf(0);
    hashMap.put(integer, "Off");
    c.put(Integer.valueOf(1), "Soft Focus");
    c.put(Integer.valueOf(2), "Pop Art");
    c.put(Integer.valueOf(3), "Pale & Light Color");
    c.put(Integer.valueOf(4), "Light Tone");
    c.put(Integer.valueOf(5), "Pin Hole");
    c.put(Integer.valueOf(6), "Grainy Film");
    c.put(Integer.valueOf(9), "Diorama");
    c.put(Integer.valueOf(10), "Cross Process");
    c.put(Integer.valueOf(12), "Fish Eye");
    c.put(Integer.valueOf(13), "Drawing");
    c.put(Integer.valueOf(14), "Gentle Sepia");
    c.put(Integer.valueOf(15), "Pale & Light Color II");
    c.put(Integer.valueOf(16), "Pop Art II");
    c.put(Integer.valueOf(17), "Pin Hole II");
    c.put(Integer.valueOf(18), "Pin Hole III");
    c.put(Integer.valueOf(19), "Grainy Film II");
    c.put(Integer.valueOf(20), "Dramatic Tone");
    c.put(Integer.valueOf(21), "Punk");
    c.put(Integer.valueOf(22), "Soft Focus 2");
    c.put(Integer.valueOf(23), "Sparkle");
    c.put(Integer.valueOf(24), "Watercolor");
    c.put(Integer.valueOf(25), "Key Line");
    c.put(Integer.valueOf(26), "Key Line II");
    c.put(Integer.valueOf(27), "Miniature");
    c.put(Integer.valueOf(28), "Reflection");
    c.put(Integer.valueOf(29), "Fragmented");
    c.put(Integer.valueOf(31), "Cross Process II");
    c.put(Integer.valueOf(32), "Dramatic Tone II");
    c.put(Integer.valueOf(33), "Watercolor I");
    c.put(Integer.valueOf(34), "Watercolor II");
    c.put(Integer.valueOf(35), "Diorama II");
    c.put(Integer.valueOf(36), "Vintage");
    c.put(Integer.valueOf(37), "Vintage II");
    c.put(Integer.valueOf(38), "Vintage III");
    c.put(Integer.valueOf(39), "Partial Color");
    c.put(Integer.valueOf(40), "Partial Color II");
    c.put(Integer.valueOf(41), "Partial Color III");
    b.put(integer, "0");
    b.put(Integer.valueOf(-31999), "Highlights ");
    b.put(Integer.valueOf(-31998), "Shadows ");
    b.put(Integer.valueOf(-31997), "Midtones ");
  }
  
  public w(x paramx) {
    super(paramx);
  }
  
  private String j(int paramInt) {
    int[] arrayOfInt = ((x)this.a).j(paramInt);
    if (arrayOfInt == null || arrayOfInt.length == 0)
      return null; 
    StringBuilder stringBuilder = new StringBuilder();
    for (paramInt = 0; paramInt < arrayOfInt.length; paramInt++) {
      if (paramInt == 0) {
        String str;
        if (c.containsKey(Integer.valueOf(arrayOfInt[paramInt]))) {
          str = c.get(Integer.valueOf(arrayOfInt[paramInt]));
        } else {
          str = "[unknown]";
        } 
        stringBuilder.append(str);
      } else {
        stringBuilder.append(arrayOfInt[paramInt]);
      } 
      stringBuilder.append("; ");
    } 
    return stringBuilder.substring(0, stringBuilder.length() - 2);
  }
  
  private String k(int paramInt) {
    int[] arrayOfInt = ((x)this.a).j(paramInt);
    return (arrayOfInt == null || arrayOfInt.length < 3) ? null : String.format("%d (min %d, max %d)", new Object[] { Integer.valueOf(arrayOfInt[0]), Integer.valueOf(arrayOfInt[1]), Integer.valueOf(arrayOfInt[2]) });
  }
  
  public String A() {
    return a(1540, new String[] { "Off", "On, Mode 1", "On, Mode 2", "On, Mode 3", "On, Mode 4" });
  }
  
  public String B() {
    return a(768, new String[] { "Off", "On", "Super Macro" });
  }
  
  public String C() {
    return j(1324);
  }
  
  public String D() {
    Integer integer = ((x)this.a).k(2304);
    if (integer == null)
      return null; 
    DecimalFormat decimalFormat = new DecimalFormat("#.##");
    double d = integer.intValue();
    Double.isNaN(d);
    return String.format("%s kPa", new Object[] { decimalFormat.format(d / 10.0D) });
  }
  
  public String E() {
    int[] arrayOfInt = ((x)this.a).j(2305);
    if (arrayOfInt == null || arrayOfInt.length < 2)
      return null; 
    DecimalFormat decimalFormat = new DecimalFormat("#.##");
    double d = arrayOfInt[0];
    Double.isNaN(d);
    String str = decimalFormat.format(d / 10.0D);
    d = arrayOfInt[1];
    Double.isNaN(d);
    return String.format("%s m, %s ft", new Object[] { str, decimalFormat.format(d / 10.0D) });
  }
  
  public String F() {
    m[] arrayOfM = ((x)this.a).o(1030);
    if (arrayOfM != null) {
      if (arrayOfM.length == 0)
        return "n/a"; 
      if (arrayOfM.length == 3) {
        if (arrayOfM[0].a() == 0L && arrayOfM[1].a() == 0L && arrayOfM[2].a() == 0L)
          return "n/a"; 
      } else if (arrayOfM.length == 4 && arrayOfM[0].a() == 0L && arrayOfM[1].a() == 0L && arrayOfM[2].a() == 0L && arrayOfM[3].a() == 0L) {
        return "n/a (x4)";
      } 
      StringBuilder stringBuilder = new StringBuilder();
      int k = arrayOfM.length;
      for (int i = 0; i < k; i++) {
        stringBuilder.append(arrayOfM[i]);
        stringBuilder.append(", ");
      } 
      return stringBuilder.substring(0, stringBuilder.length() - 2);
    } 
    return "n/a";
  }
  
  public String G() {
    Integer integer = ((x)this.a).k(514);
    if (integer == null)
      return null; 
    int i = integer.intValue();
    if (i != 2) {
      if (i != 3) {
        if (i != 5) {
          if (i != 261) {
            if (i != 515) {
              if (i != 1027) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unknown (");
                stringBuilder.append(integer);
                stringBuilder.append(")");
                return stringBuilder.toString();
              } 
              return "Spot+Shadow control";
            } 
            return "Spot+Highlight control";
          } 
          return "Pattern+AF";
        } 
        return "ESP";
      } 
      return "Spot";
    } 
    return "Center-weighted average";
  }
  
  public String H() {
    return a(1284, new String[] { "Off", "CM1 (Red Enhance)", "CM2 (Green Enhance)", "CM3 (Blue Enhance)", "CM4 (Skin Tones)" });
  }
  
  public String I() {
    return a(516, new String[] { "Off", "On" });
  }
  
  public String J() {
    int[] arrayOfInt = ((x)this.a).j(1319);
    if (arrayOfInt == null)
      return null; 
    String str = String.format("%d %d %d", new Object[] { Integer.valueOf(arrayOfInt[0]), Integer.valueOf(arrayOfInt[1]), Integer.valueOf(arrayOfInt[2]) });
    if (str.equals("0 0 0"))
      return "n/a"; 
    if (str.equals("-2 -2 1"))
      return "Off"; 
    if (str.equals("-1 -2 1"))
      return "Low"; 
    if (str.equals("0 -2 1"))
      return "Standard"; 
    if (str.equals("1 -2 1"))
      return "High"; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Unknown (");
    stringBuilder.append(str);
    stringBuilder.append(")");
    return stringBuilder.toString();
  }
  
  public String K() {
    Integer integer = ((x)this.a).k(1290);
    if (integer == null)
      return null; 
    int i = integer.intValue();
    String str = "(none)";
    if (i == 0)
      return "(none)"; 
    StringBuilder stringBuilder = new StringBuilder();
    i = integer.intValue();
    if ((i & 0x1) != 0)
      stringBuilder.append("Noise Reduction, "); 
    if ((i >> 1 & 0x1) != 0)
      stringBuilder.append("Noise Filter, "); 
    if ((i >> 2 & 0x1) != 0)
      stringBuilder.append("Noise Filter (ISO Boost), "); 
    if ((i >> 3 & 0x1) != 0)
      stringBuilder.append("Auto, "); 
    if (stringBuilder.length() != 0)
      str = stringBuilder.substring(0, stringBuilder.length() - 2); 
    return str;
  }
  
  public String L() {
    String str;
    int[] arrayOfInt = ((x)this.a).j(1537);
    if (arrayOfInt == null)
      return null; 
    if (arrayOfInt.length == 0 || arrayOfInt[0] == 0)
      return "Off"; 
    int i = arrayOfInt[0];
    if (i != 1) {
      if (i != 2) {
        if (i != 3) {
          if (i != 4) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unknown (");
            stringBuilder.append(arrayOfInt[0]);
            stringBuilder.append(")");
            str = stringBuilder.toString();
          } else {
            str = "Top to Bottom";
          } 
        } else {
          str = "Bottom to Top";
        } 
      } else {
        str = "Right to Left";
      } 
    } else {
      str = "Left to Right";
    } 
    return String.format("%s, Shot %d", new Object[] { str, Integer.valueOf(arrayOfInt[1]) });
  }
  
  public String M() {
    return a(1317, new String[] { "n/a", "Neutral", "Yellow", "Orange", "Red", "Green" });
  }
  
  public String N() {
    return k(1315);
  }
  
  public String O() {
    String str;
    int[] arrayOfInt1 = ((x)this.a).j(1312);
    int[] arrayOfInt2 = arrayOfInt1;
    if (arrayOfInt1 == null) {
      Integer integer = ((x)this.a).k(1290);
      if (integer == null)
        return null; 
      arrayOfInt2 = new int[] { integer.intValue() };
    } 
    if (arrayOfInt2.length == 0)
      return null; 
    StringBuilder stringBuilder = new StringBuilder();
    int i = arrayOfInt2[0];
    if (i != 1) {
      if (i != 2) {
        if (i != 3) {
          if (i != 4) {
            if (i != 5) {
              if (i != 256) {
                if (i != 512) {
                  stringBuilder.append("Unknown (");
                  stringBuilder.append(arrayOfInt2[0]);
                  str = ")";
                } else {
                  str = "Sepia";
                } 
              } else {
                str = "Monotone";
              } 
            } else {
              str = "i-Enhance";
            } 
          } else {
            str = "Portrait";
          } 
        } else {
          str = "Muted";
        } 
      } else {
        str = "Natural";
      } 
    } else {
      str = "Vivid";
    } 
    stringBuilder.append(str);
    if (arrayOfInt2.length > 1) {
      stringBuilder.append("; ");
      stringBuilder.append(arrayOfInt2[1]);
    } 
    return stringBuilder.toString();
  }
  
  public String P() {
    int[] arrayOfInt = ((x)this.a).j(1325);
    if (arrayOfInt == null)
      return null; 
    String str = String.format("%d %d %d", new Object[] { Integer.valueOf(arrayOfInt[0]), Integer.valueOf(arrayOfInt[1]), Integer.valueOf(arrayOfInt[2]) });
    if (str.equals("0 0 0"))
      return "n/a"; 
    if (str.equals("-1 -1 1"))
      return "Low"; 
    if (str.equals("0 -1 1"))
      return "Standard"; 
    if (str.equals("1 -1 1"))
      return "High"; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Unknown (");
    stringBuilder.append(str);
    stringBuilder.append(")");
    return stringBuilder.toString();
  }
  
  public String Q() {
    return k(1313);
  }
  
  public String R() {
    return k(1316);
  }
  
  public String S() {
    return a(1318, new String[] { "n/a", "Neutral", "Sepia", "Blue", "Purple", "Green" });
  }
  
  public String T() {
    String str;
    int[] arrayOfInt = ((x)this.a).j(2308);
    if (arrayOfInt == null || arrayOfInt.length < 2)
      return null; 
    if (arrayOfInt[0] != 0) {
      double d = arrayOfInt[0];
      Double.isNaN(d);
      str = Double.toString(d / 10.0D);
    } else {
      str = "n/a";
    } 
    return String.format("%s %d", new Object[] { str, Integer.valueOf(arrayOfInt[1]) });
  }
  
  public String U() {
    return a(256, new String[] { "No", "Yes" });
  }
  
  public String V() {
    String str;
    int[] arrayOfInt = ((x)this.a).j(2307);
    if (arrayOfInt == null || arrayOfInt.length < 2)
      return null; 
    if (arrayOfInt[0] != 0) {
      double d = -arrayOfInt[0];
      Double.isNaN(d);
      str = Double.toString(d / 10.0D);
    } else {
      str = "n/a";
    } 
    return String.format("%s %d", new Object[] { str, Integer.valueOf(arrayOfInt[1]) });
  }
  
  public String W() {
    Integer integer = ((x)this.a).k(1289);
    if (integer == null)
      return null; 
    int i = integer.intValue();
    if (i != 0) {
      if (i != 54) {
        if (i != 57) {
          if (i != 142) {
            if (i != 154) {
              if (i != 59) {
                if (i != 60) {
                  StringBuilder stringBuilder;
                  switch (i) {
                    default:
                      switch (i) {
                        default:
                          stringBuilder = new StringBuilder();
                          stringBuilder.append("Unknown (");
                          stringBuilder.append(integer);
                          stringBuilder.append(")");
                          return stringBuilder.toString();
                        case 67:
                          return "Soft Background Shot";
                        case 66:
                          return "e-Portrait";
                        case 65:
                          return "Multiple Exposure";
                        case 64:
                          return "Bird Watching";
                        case 63:
                          break;
                      } 
                      return "Slow Shutter";
                    case 50:
                      return "Shooting Guide";
                    case 49:
                      return "Underwater Snapshot";
                    case 48:
                      return "Nature Macro";
                    case 47:
                      return "Vivid";
                    case 46:
                      return "Children";
                    case 45:
                      return "Low Key";
                    case 44:
                      return "Underwater Wide2";
                    case 43:
                      return "Snow";
                    case 42:
                      return "Beach";
                    case 41:
                      return "Auction";
                    case 40:
                      return "Digital Image Stabilization";
                    case 39:
                      return "High Key";
                    case 38:
                      return "Shoot & Select2";
                    case 37:
                      return "Shoot & Select1";
                    case 36:
                      return "Underwater Macro";
                    case 35:
                      return "Underwater Wide1";
                    case 34:
                      return "Pet";
                    case 33:
                      return "My Mode";
                    case 32:
                      return "Behind Glass";
                    case 31:
                      return "Available Light";
                    case 30:
                      return "Candle";
                    case 29:
                      return "Self Portrait+Timer";
                    case 28:
                      return "Beach & Snow";
                    case 27:
                      return "Shoot & Select";
                    case 26:
                      return "Museum";
                    case 25:
                      return "Documents";
                    case 24:
                      return "Food";
                    case 23:
                      return "Super Macro";
                    case 22:
                      return "Macro";
                    case 21:
                      return "Beauty Skin";
                    case 20:
                      return "Sunset";
                    case 19:
                      return "Fireworks";
                    case 18:
                      return "Indoor";
                    case 17:
                      return "Night+Portrait";
                    case 16:
                      return "Landscape+Portrait";
                    case 15:
                      return "Movie";
                    case 14:
                      return "2 in 1";
                    case 13:
                      return "Panorama";
                    case 12:
                      return "Self Portrait";
                    case 11:
                      return "Night Scene";
                    case 10:
                      return "Landscape";
                    case 9:
                      return "Landscape+Portrait";
                    case 8:
                      return "Portrait";
                    case 7:
                      return "Sport";
                    case 6:
                      break;
                  } 
                  return "Auto";
                } 
                return "Quick Shutter";
              } 
              return "Smile Shot";
            } 
            return "HDR";
          } 
          return "Hand-held Starlight";
        } 
        return "Bulb";
      } 
      return "Face Portrait";
    } 
    return "Standard";
  }
  
  public String X() {
    return a(1292, new String[] { "Off", "On" });
  }
  
  public String Y() {
    return k(1286);
  }
  
  public String Z() {
    int[] arrayOfInt = ((x)this.a).j(2052);
    if (arrayOfInt == null || arrayOfInt.length < 2)
      return null; 
    int i = arrayOfInt[0];
    int k = arrayOfInt[1];
    return (i == 0 && k == 0) ? "No" : ((i == 9 && k == 8) ? "Focus-stacked (8 images)" : String.format("Unknown (%d %d)", new Object[] { Integer.valueOf(i), Integer.valueOf(k) }));
  }
  
  public String a() {
    return a(513, new String[] { "Off", "On" });
  }
  
  public String a0() {
    int[] arrayOfInt = ((x)this.a).j(1326);
    if (arrayOfInt == null || arrayOfInt.length == 0)
      return null; 
    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < arrayOfInt.length; i++) {
      if (i == 0 || i == 4 || i == 8 || i == 12 || i == 16 || i == 20 || i == 24) {
        stringBuilder.append(b.get(Integer.valueOf(arrayOfInt[i])));
      } else {
        stringBuilder.append(arrayOfInt[i]);
      } 
      stringBuilder.append("; ");
    } 
    return stringBuilder.substring(0, stringBuilder.length() - 2);
  }
  
  public String b() {
    // Byte code:
    //   0: aload_0
    //   1: getfield a : Le/d/c/b;
    //   4: checkcast e/d/c/o/a0/x
    //   7: sipush #772
    //   10: invokevirtual m : (I)Ljava/lang/Object;
    //   13: astore #7
    //   15: aconst_null
    //   16: astore #5
    //   18: aload #7
    //   20: ifnull -> 239
    //   23: aload #7
    //   25: instanceof [J
    //   28: ifne -> 33
    //   31: aconst_null
    //   32: areturn
    //   33: new java/lang/StringBuilder
    //   36: dup
    //   37: invokespecial <init> : ()V
    //   40: astore #6
    //   42: aload #7
    //   44: checkcast [J
    //   47: astore #7
    //   49: aload #7
    //   51: arraylength
    //   52: istore_2
    //   53: iconst_0
    //   54: istore_1
    //   55: iload_1
    //   56: iload_2
    //   57: if_icmpge -> 222
    //   60: aload #7
    //   62: iload_1
    //   63: laload
    //   64: lstore_3
    //   65: lload_3
    //   66: lconst_0
    //   67: lcmp
    //   68: ifne -> 74
    //   71: goto -> 215
    //   74: aload #6
    //   76: invokevirtual length : ()I
    //   79: ifeq -> 90
    //   82: aload #6
    //   84: ldc ', '
    //   86: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   89: pop
    //   90: lload_3
    //   91: ldc2_w 913916549
    //   94: lcmp
    //   95: ifne -> 114
    //   98: ldc_w 'Left '
    //   101: astore #5
    //   103: aload #6
    //   105: aload #5
    //   107: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   110: pop
    //   111: goto -> 146
    //   114: lload_3
    //   115: ldc2_w 2038007173
    //   118: lcmp
    //   119: ifne -> 130
    //   122: ldc_w 'Center '
    //   125: astore #5
    //   127: goto -> 103
    //   130: lload_3
    //   131: ldc2_w 3178875269
    //   134: lcmp
    //   135: ifne -> 146
    //   138: ldc_w 'Right '
    //   141: astore #5
    //   143: goto -> 103
    //   146: aload #6
    //   148: ldc_w '(%d/255,%d/255)-(%d/255,%d/255)'
    //   151: iconst_4
    //   152: anewarray java/lang/Object
    //   155: dup
    //   156: iconst_0
    //   157: lload_3
    //   158: bipush #24
    //   160: lshr
    //   161: ldc2_w 255
    //   164: land
    //   165: invokestatic valueOf : (J)Ljava/lang/Long;
    //   168: aastore
    //   169: dup
    //   170: iconst_1
    //   171: lload_3
    //   172: bipush #16
    //   174: lshr
    //   175: ldc2_w 255
    //   178: land
    //   179: invokestatic valueOf : (J)Ljava/lang/Long;
    //   182: aastore
    //   183: dup
    //   184: iconst_2
    //   185: lload_3
    //   186: bipush #8
    //   188: lshr
    //   189: ldc2_w 255
    //   192: land
    //   193: invokestatic valueOf : (J)Ljava/lang/Long;
    //   196: aastore
    //   197: dup
    //   198: iconst_3
    //   199: lload_3
    //   200: ldc2_w 255
    //   203: land
    //   204: invokestatic valueOf : (J)Ljava/lang/Long;
    //   207: aastore
    //   208: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   211: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   214: pop
    //   215: iload_1
    //   216: iconst_1
    //   217: iadd
    //   218: istore_1
    //   219: goto -> 55
    //   222: aload #6
    //   224: invokevirtual length : ()I
    //   227: ifne -> 232
    //   230: aconst_null
    //   231: areturn
    //   232: aload #6
    //   234: invokevirtual toString : ()Ljava/lang/String;
    //   237: astore #5
    //   239: aload #5
    //   241: areturn
  }
  
  public String b0() {
    Integer integer = ((x)this.a).k(1280);
    if (integer == null)
      return null; 
    int i = integer.intValue();
    if (i != 0) {
      if (i != 1) {
        if (i != 48) {
          if (i != 67) {
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
                                stringBuilder = new StringBuilder();
                                stringBuilder.append("Unknown (");
                                stringBuilder.append(integer);
                                stringBuilder.append(")");
                                return stringBuilder.toString();
                              case 515:
                                return "Custom WB 4";
                              case 514:
                                return "Custom WB 3";
                              case 513:
                                return "Custom WB 2";
                              case 512:
                                break;
                            } 
                            return "Custom WB 1";
                          case 259:
                            return "One Touch WB 4";
                          case 258:
                            return "One Touch WB 3";
                          case 257:
                            return "One Touch WB 2";
                          case 256:
                            break;
                        } 
                        return "One Touch WB 1";
                      case 36:
                        return "White Fluorescent";
                      case 35:
                        return "4000K (Cool white fluorescent)";
                      case 34:
                        return "4500K (Neutral white fluorescent)";
                      case 33:
                        break;
                    } 
                    return "6600K (Daylight fluorescent)";
                  case 23:
                    return "5500K (Flash)";
                  case 22:
                    return "Auto Setup";
                  case 21:
                    return "3600K (Tungsten light-like)";
                  case 20:
                    break;
                } 
                return "3000K (Tungsten light)";
              case 18:
                return "5300K (Fine Weather)";
              case 17:
                return "6000K (Cloudy)";
              case 16:
                break;
            } 
            return "7500K (Fine Weather with Shade)";
          } 
          return "Underwater";
        } 
        return "3600K (Tungsten light-like)";
      } 
      return "Auto (Keep Warm Color Off)";
    } 
    return "Auto";
  }
  
  public String c() {
    return a(774, new String[] { "Off", "On" });
  }
  
  public String c(int paramInt) {
    if (paramInt != 0)
      if (paramInt != 1280) {
        if (paramInt != 1281) {
          if (paramInt != 1312) {
            if (paramInt != 1313) {
              if (paramInt != 1536) {
                if (paramInt != 1537) {
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
                                          switch (paramInt) {
                                            default:
                                              return super.c(paramInt);
                                            case 1327:
                                              return g();
                                            case 1326:
                                              return a0();
                                            case 1325:
                                              return P();
                                            case 1324:
                                              break;
                                          } 
                                          return C();
                                        case 1319:
                                          return J();
                                        case 1318:
                                          return S();
                                        case 1317:
                                          return M();
                                        case 1316:
                                          return R();
                                        case 1315:
                                          break;
                                      } 
                                      return N();
                                    case 1292:
                                      return X();
                                    case 1291:
                                      return n();
                                    case 1290:
                                      return K();
                                    case 1289:
                                      break;
                                  } 
                                  return W();
                                case 1287:
                                  return j();
                                case 1286:
                                  return Y();
                                case 1285:
                                  return k();
                                case 1284:
                                  return H();
                                case 1283:
                                  break;
                              } 
                              return l();
                            case 1030:
                              return F();
                            case 1029:
                              return t();
                            case 1028:
                              return s();
                            case 1027:
                              break;
                          } 
                          return v();
                        case 516:
                          return I();
                        case 515:
                          return q();
                        case 514:
                          return G();
                        case 513:
                          return a();
                        case 512:
                          break;
                      } 
                      return p();
                    case 2312:
                      return m();
                    case 2308:
                      return T();
                    case 2307:
                      return V();
                    case 2306:
                      return r();
                    case 2305:
                      return E();
                    case 2304:
                      return D();
                    case 2052:
                      return Z();
                    case 1540:
                      return A();
                    case 1539:
                      return z();
                    case 1330:
                      return i();
                    case 1321:
                      return f();
                    case 1295:
                      return y();
                    case 1024:
                      return u();
                    case 774:
                      return c();
                    case 773:
                      return d();
                    case 772:
                      return b();
                    case 771:
                      return e();
                    case 770:
                      return x();
                    case 769:
                      return w();
                    case 768:
                      return B();
                    case 256:
                      return U();
                    case 0:
                      break;
                  } 
                } else {
                  return L();
                } 
              } else {
                return o();
              } 
            } else {
              return Q();
            } 
          } else {
            return O();
          } 
        } else {
          return c0();
        } 
      } else {
        return b0();
      }  
    return h();
  }
  
  public String c0() {
    Integer integer = ((x)this.a).k(1281);
    return (integer == null) ? null : ((integer.intValue() == 0) ? "Auto" : integer.toString());
  }
  
  public String d() {
    m[] arrayOfM = ((x)this.a).o(773);
    if (arrayOfM == null)
      return "n/a"; 
    if (arrayOfM.length < 4)
      return null; 
    if (arrayOfM.length == 5 && arrayOfM[0].longValue() == 0L) {
      i = 1;
    } else {
      i = 0;
    } 
    int k = (int)(arrayOfM[i].doubleValue() * 100.0D);
    int m = (int)(arrayOfM[i + 1].doubleValue() * 100.0D);
    int n = (int)(arrayOfM[i + 2].doubleValue() * 100.0D);
    int i = (int)(arrayOfM[i + 3].doubleValue() * 100.0D);
    return (k + m + n + i == 0) ? "n/a" : String.format("(%d%%,%d%%) (%d%%,%d%%)", new Object[] { Integer.valueOf(k), Integer.valueOf(m), Integer.valueOf(n), Integer.valueOf(i) });
  }
  
  public String e() {
    return a(771, new String[] { "Not Ready", "Ready" });
  }
  
  public String f() {
    return j(1321);
  }
  
  public String g() {
    int[] arrayOfInt = ((x)this.a).j(1327);
    if (arrayOfInt == null)
      return null; 
    StringBuilder stringBuilder = new StringBuilder();
    int i = 0;
    while (true) {
      String str;
      if (i < arrayOfInt.length) {
        if (i == 0) {
          if (c.containsKey(Integer.valueOf(arrayOfInt[i]))) {
            str = c.get(Integer.valueOf(arrayOfInt[i]));
          } else {
            str = "[unknown]";
          } 
        } else {
          int k;
          if (i == 3) {
            stringBuilder.append("Partial Color ");
            k = arrayOfInt[i];
          } else {
            if (i == 4) {
              switch (arrayOfInt[i]) {
                default:
                  stringBuilder.append("Unknown (");
                  k = arrayOfInt[i];
                  stringBuilder.append(k);
                  stringBuilder.append(")");
                case 32864:
                  str = "B&W";
                  stringBuilder.append(str);
                case 32848:
                  str = "White Edge";
                  stringBuilder.append(str);
                case 32832:
                  str = "Soft Focus";
                  stringBuilder.append(str);
                case 32816:
                  str = "Frame";
                  stringBuilder.append(str);
                case 32800:
                  str = "Pin Hole";
                  stringBuilder.append(str);
                case 32784:
                  str = "Star Light";
                  stringBuilder.append(str);
                case 0:
                  str = "No Effect";
                  stringBuilder.append(str);
              } 
            } else {
              if (i == 6) {
                k = arrayOfInt[i];
                if (k != 0) {
                  if (k != 1) {
                    if (k != 2) {
                      if (k != 3) {
                        if (k != 4) {
                          stringBuilder.append("Unknown (");
                          k = arrayOfInt[i];
                        } else {
                          str = "Green Color Filter";
                          stringBuilder.append(str);
                        } 
                      } else {
                        str = "Red Color Filter";
                        stringBuilder.append(str);
                      } 
                    } else {
                      str = "Orange Color Filter";
                      stringBuilder.append(str);
                    } 
                  } else {
                    str = "Yellow Color Filter";
                    stringBuilder.append(str);
                  } 
                } else {
                  str = "No Color Filter";
                  stringBuilder.append(str);
                } 
              } else {
                k = arrayOfInt[i];
                stringBuilder.append(k);
              } 
              stringBuilder.append(k);
              stringBuilder.append(")");
            } 
            i++;
            continue;
          } 
          stringBuilder.append(k);
        } 
      } else {
        break;
      } 
      stringBuilder.append(str);
    } 
    return stringBuilder.substring(0, stringBuilder.length() - 2);
  }
  
  public String h() {
    return b(0, 4);
  }
  
  public String i() {
    int[] arrayOfInt = ((x)this.a).j(1330);
    if (arrayOfInt == null)
      return null; 
    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < arrayOfInt.length; i++) {
      int k;
      if (i == 0) {
        stringBuilder.append("Color ");
        k = arrayOfInt[i];
      } else if (i == 3) {
        stringBuilder.append("Strength ");
        k = arrayOfInt[i];
      } else {
        k = arrayOfInt[i];
      } 
      stringBuilder.append(k);
      stringBuilder.append("; ");
    } 
    return stringBuilder.substring(0, stringBuilder.length() - 2);
  }
  
  public String j() {
    return a(1287, new String[] { "sRGB", "Adobe RGB", "Pro Photo RGB" });
  }
  
  public String k() {
    return k(1285);
  }
  
  public String l() {
    return k(1283);
  }
  
  public String m() {
    Object object = ((x)this.a).m(2312);
    return (object == null) ? null : object.toString();
  }
  
  public String n() {
    return a(1291, new String[] { "Off", "On" });
  }
  
  public String o() {
    String str;
    int[] arrayOfInt = ((x)this.a).j(1536);
    if (arrayOfInt == null)
      return null; 
    if (arrayOfInt.length == 0 || arrayOfInt[0] == 0)
      return "Single Shot"; 
    StringBuilder stringBuilder = new StringBuilder();
    if (arrayOfInt[0] == 5 && arrayOfInt.length >= 3) {
      int i = arrayOfInt[2];
      if ((i & 0x1) > 0)
        stringBuilder.append("AE"); 
      if ((i >> 1 & 0x1) > 0)
        stringBuilder.append("WB"); 
      if ((i >> 2 & 0x1) > 0)
        stringBuilder.append("FL"); 
      if ((i >> 3 & 0x1) > 0)
        stringBuilder.append("MF"); 
      if ((i >> 6 & 0x1) > 0)
        stringBuilder.append("Focus"); 
      str = " Bracketing";
    } else {
      int i = arrayOfInt[0];
      if (i != 1) {
        if (i != 2) {
          if (i != 3) {
            if (i != 4) {
              stringBuilder.append("Unknown (");
              stringBuilder.append(arrayOfInt[0]);
              str = ")";
            } else {
              str = "Exposure+WB Bracketing";
            } 
          } else {
            str = "White Balance Bracketing";
          } 
        } else {
          str = "Exposure Bracketing";
        } 
      } else {
        str = "Continuous Shooting";
      } 
    } 
    stringBuilder.append(str);
    stringBuilder.append(", Shot ");
    stringBuilder.append(arrayOfInt[1]);
    return stringBuilder.toString();
  }
  
  public String p() {
    return a(512, 1, new String[] { "Manual", "Program", "Aperture-priority AE", "Shutter speed priority", "Program-shift" });
  }
  
  public String q() {
    return g(515);
  }
  
  public String r() {
    return a(2306, new String[] { "Off", "On" });
  }
  
  public String s() {
    String str;
    int[] arrayOfInt = ((x)this.a).j(1028);
    if (arrayOfInt == null)
      return null; 
    if (arrayOfInt.length == 0)
      return null; 
    StringBuilder stringBuilder = new StringBuilder();
    int i = arrayOfInt[0];
    if (i != 0) {
      if (i != 3) {
        if (i != 4) {
          if (i != 5) {
            stringBuilder.append("Unknown (");
            stringBuilder.append(arrayOfInt[0]);
            str = ")";
          } else {
            str = "Manual";
          } 
        } else {
          str = "Auto";
        } 
      } else {
        str = "TTL";
      } 
    } else {
      str = "Off";
    } 
    stringBuilder.append(str);
    for (i = 1; i < arrayOfInt.length; i++) {
      stringBuilder.append("; ");
      stringBuilder.append(arrayOfInt[i]);
    } 
    return stringBuilder.toString();
  }
  
  public String t() {
    m[] arrayOfM = ((x)this.a).o(1029);
    if (arrayOfM == null || arrayOfM.length == 0)
      return null; 
    if (arrayOfM.length == 3) {
      if (arrayOfM[0].a() == 0L && arrayOfM[1].a() == 0L && arrayOfM[2].a() == 0L)
        return "n/a"; 
    } else if (arrayOfM.length == 4 && arrayOfM[0].a() == 0L && arrayOfM[1].a() == 0L && arrayOfM[2].a() == 0L && arrayOfM[3].a() == 0L) {
      return "n/a (x4)";
    } 
    StringBuilder stringBuilder = new StringBuilder();
    int k = arrayOfM.length;
    for (int i = 0; i < k; i++) {
      stringBuilder.append(arrayOfM[i]);
      stringBuilder.append(", ");
    } 
    return stringBuilder.substring(0, stringBuilder.length() - 2);
  }
  
  public String u() {
    Integer integer = ((x)this.a).k(1024);
    if (integer == null)
      return null; 
    if (integer.intValue() == 0)
      return "Off"; 
    StringBuilder stringBuilder = new StringBuilder();
    int i = integer.intValue();
    if ((i & 0x1) != 0)
      stringBuilder.append("On, "); 
    if ((i >> 1 & 0x1) != 0)
      stringBuilder.append("Fill-in, "); 
    if ((i >> 2 & 0x1) != 0)
      stringBuilder.append("Red-eye, "); 
    if ((i >> 3 & 0x1) != 0)
      stringBuilder.append("Slow-sync, "); 
    if ((i >> 4 & 0x1) != 0)
      stringBuilder.append("Forced On, "); 
    if ((i >> 5 & 0x1) != 0)
      stringBuilder.append("2nd Curtain, "); 
    return stringBuilder.substring(0, stringBuilder.length() - 2);
  }
  
  public String v() {
    Integer integer = ((x)this.a).k(1027);
    if (integer == null)
      return null; 
    int i = integer.intValue();
    if (i != 0) {
      if (i != 1) {
        if (i != 2) {
          if (i != 3) {
            if (i != 4) {
              StringBuilder stringBuilder;
              switch (i) {
                default:
                  switch (i) {
                    default:
                      stringBuilder = new StringBuilder();
                      stringBuilder.append("Unknown (");
                      stringBuilder.append(integer);
                      stringBuilder.append(")");
                      return stringBuilder.toString();
                    case 20:
                      return "Channel 4, High";
                    case 19:
                      return "Channel 3, High";
                    case 18:
                      return "Channel 2, High";
                    case 17:
                      break;
                  } 
                  return "Channel 1, High";
                case 12:
                  return "Channel 4, Mid";
                case 11:
                  return "Channel 3, Mid";
                case 10:
                  return "Channel 2, Mid";
                case 9:
                  break;
              } 
              return "Channel 1, Mid";
            } 
            return "Channel 4, Low";
          } 
          return "Channel 3, Low";
        } 
        return "Channel 2, Low";
      } 
      return "Channel 1, Low";
    } 
    return "Off";
  }
  
  public String w() {
    String str;
    int[] arrayOfInt1 = ((x)this.a).j(769);
    int[] arrayOfInt2 = arrayOfInt1;
    if (arrayOfInt1 == null) {
      Integer integer = ((x)this.a).k(769);
      if (integer == null)
        return null; 
      arrayOfInt2 = new int[] { integer.intValue() };
    } 
    if (arrayOfInt2.length == 0)
      return null; 
    StringBuilder stringBuilder = new StringBuilder();
    int i = arrayOfInt2[0];
    if (i != 0) {
      if (i != 1) {
        if (i != 2) {
          if (i != 3) {
            if (i != 4) {
              if (i != 10) {
                StringBuilder stringBuilder1 = new StringBuilder();
                stringBuilder1.append("Unknown (");
                stringBuilder1.append(arrayOfInt2[0]);
                stringBuilder1.append(")");
                str = stringBuilder1.toString();
              } else {
                str = "MF";
              } 
            } else {
              str = "Face detect";
            } 
          } else {
            str = "Multi AF";
          } 
        } else {
          str = "Continuous AF";
        } 
      } else {
        str = "Sequential shooting AF";
      } 
    } else {
      str = "Single AF";
    } 
    stringBuilder.append(str);
    if (arrayOfInt2.length > 1) {
      stringBuilder.append("; ");
      i = arrayOfInt2[1];
      if (i == 0) {
        stringBuilder.append("(none)");
      } else {
        if ((i & 0x1) > 0)
          stringBuilder.append("S-AF, "); 
        if ((i >> 2 & 0x1) > 0)
          stringBuilder.append("C-AF, "); 
        if ((i >> 4 & 0x1) > 0)
          stringBuilder.append("MF, "); 
        if ((i >> 5 & 0x1) > 0)
          stringBuilder.append("Face detect, "); 
        if ((i >> 6 & 0x1) > 0)
          stringBuilder.append("Imager AF, "); 
        if ((i >> 7 & 0x1) > 0)
          stringBuilder.append("Live View Magnification Frame, "); 
        if ((i >> 8 & 0x1) > 0)
          stringBuilder.append("AF sensor, "); 
        stringBuilder.setLength(stringBuilder.length() - 2);
      } 
    } 
    return stringBuilder.toString();
  }
  
  public String x() {
    String str;
    int[] arrayOfInt1 = ((x)this.a).j(770);
    int[] arrayOfInt2 = arrayOfInt1;
    if (arrayOfInt1 == null) {
      Integer integer = ((x)this.a).k(770);
      if (integer == null)
        return null; 
      arrayOfInt2 = new int[] { integer.intValue() };
    } 
    if (arrayOfInt2.length == 0)
      return null; 
    StringBuilder stringBuilder = new StringBuilder();
    int i = arrayOfInt2[0];
    if (i != 0) {
      if (i != 1) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("Unknown (");
        stringBuilder1.append(arrayOfInt2[0]);
        stringBuilder1.append(")");
        str = stringBuilder1.toString();
      } else {
        str = "AF used";
      } 
    } else {
      str = "AF not used";
    } 
    stringBuilder.append(str);
    if (arrayOfInt2.length > 1) {
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("; ");
      stringBuilder1.append(arrayOfInt2[1]);
      stringBuilder.append(stringBuilder1.toString());
    } 
    return stringBuilder.toString();
  }
  
  public String y() {
    StringBuilder stringBuilder;
    int[] arrayOfInt = ((x)this.a).j(1295);
    if (arrayOfInt == null || arrayOfInt.length < 3)
      return null; 
    String str = String.format("%d %d %d", new Object[] { Integer.valueOf(arrayOfInt[0]), Integer.valueOf(arrayOfInt[1]), Integer.valueOf(arrayOfInt[2]) });
    if (str.equals("0 0 0")) {
      str = "n/a";
    } else if (str.equals("-1 -1 1")) {
      str = "Low Key";
    } else if (str.equals("0 -1 1")) {
      str = "Normal";
    } else if (str.equals("1 -1 1")) {
      str = "High Key";
    } else {
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("Unknown (");
      stringBuilder1.append(str);
      stringBuilder1.append(")");
      str = stringBuilder1.toString();
    } 
    if (arrayOfInt.length > 3) {
      String str1;
      if (arrayOfInt[3] == 0) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(str);
        str1 = "; User-Selected";
        stringBuilder = stringBuilder1;
        stringBuilder.append(str1);
        return stringBuilder.toString();
      } 
      if (str1[3] == '\001') {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append((String)stringBuilder);
        String str3 = "; Auto-Override";
        stringBuilder = stringBuilder1;
        String str2 = str3;
        stringBuilder.append(str2);
        return stringBuilder.toString();
      } 
    } 
    return (String)stringBuilder;
  }
  
  public String z() {
    return a(1539, 1, new String[] { "SQ", "HQ", "SHQ", "RAW", "SQ (5)" });
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/o/a0/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */