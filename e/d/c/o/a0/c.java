package e.d.c.o.a0;

import e.d.c.j;
import java.text.DecimalFormat;
import java.util.HashMap;

public class c extends j<d> {
  private static final HashMap<Integer, String> b = new HashMap<Integer, String>();
  
  static {
    b.put(Integer.valueOf(1), "Canon EF 50mm f/1.8");
    b.put(Integer.valueOf(2), "Canon EF 28mm f/2.8");
    b.put(Integer.valueOf(3), "Canon EF 135mm f/2.8 Soft");
    b.put(Integer.valueOf(4), "Canon EF 35-105mm f/3.5-4.5 or Sigma Lens");
    b.put(Integer.valueOf(5), "Canon EF 35-70mm f/3.5-4.5");
    b.put(Integer.valueOf(6), "Canon EF 28-70mm f/3.5-4.5 or Sigma or Tokina Lens");
    b.put(Integer.valueOf(7), "Canon EF 100-300mm f/5.6L");
    b.put(Integer.valueOf(8), "Canon EF 100-300mm f/5.6 or Sigma or Tokina Lens");
    b.put(Integer.valueOf(9), "Canon EF 70-210mm f/4");
    b.put(Integer.valueOf(10), "Canon EF 50mm f/2.5 Macro or Sigma Lens");
    b.put(Integer.valueOf(11), "Canon EF 35mm f/2");
    b.put(Integer.valueOf(13), "Canon EF 15mm f/2.8 Fisheye");
    b.put(Integer.valueOf(14), "Canon EF 50-200mm f/3.5-4.5L");
    b.put(Integer.valueOf(15), "Canon EF 50-200mm f/3.5-4.5");
    b.put(Integer.valueOf(16), "Canon EF 35-135mm f/3.5-4.5");
    b.put(Integer.valueOf(17), "Canon EF 35-70mm f/3.5-4.5A");
    b.put(Integer.valueOf(18), "Canon EF 28-70mm f/3.5-4.5");
    b.put(Integer.valueOf(20), "Canon EF 100-200mm f/4.5A");
    b.put(Integer.valueOf(21), "Canon EF 80-200mm f/2.8L");
    b.put(Integer.valueOf(22), "Canon EF 20-35mm f/2.8L or Tokina Lens");
    b.put(Integer.valueOf(23), "Canon EF 35-105mm f/3.5-4.5");
    b.put(Integer.valueOf(24), "Canon EF 35-80mm f/4-5.6 Power Zoom");
    b.put(Integer.valueOf(25), "Canon EF 35-80mm f/4-5.6 Power Zoom");
    b.put(Integer.valueOf(26), "Canon EF 100mm f/2.8 Macro or Other Lens");
    b.put(Integer.valueOf(27), "Canon EF 35-80mm f/4-5.6");
    b.put(Integer.valueOf(28), "Canon EF 80-200mm f/4.5-5.6 or Tamron Lens");
    b.put(Integer.valueOf(29), "Canon EF 50mm f/1.8 II");
    b.put(Integer.valueOf(30), "Canon EF 35-105mm f/4.5-5.6");
    b.put(Integer.valueOf(31), "Canon EF 75-300mm f/4-5.6 or Tamron Lens");
    b.put(Integer.valueOf(32), "Canon EF 24mm f/2.8 or Sigma Lens");
    b.put(Integer.valueOf(33), "Voigtlander or Carl Zeiss Lens");
    b.put(Integer.valueOf(35), "Canon EF 35-80mm f/4-5.6");
    b.put(Integer.valueOf(36), "Canon EF 38-76mm f/4.5-5.6");
    b.put(Integer.valueOf(37), "Canon EF 35-80mm f/4-5.6 or Tamron Lens");
    b.put(Integer.valueOf(38), "Canon EF 80-200mm f/4.5-5.6");
    b.put(Integer.valueOf(39), "Canon EF 75-300mm f/4-5.6");
    b.put(Integer.valueOf(40), "Canon EF 28-80mm f/3.5-5.6");
    b.put(Integer.valueOf(41), "Canon EF 28-90mm f/4-5.6");
    b.put(Integer.valueOf(42), "Canon EF 28-200mm f/3.5-5.6 or Tamron Lens");
    b.put(Integer.valueOf(43), "Canon EF 28-105mm f/4-5.6");
    b.put(Integer.valueOf(44), "Canon EF 90-300mm f/4.5-5.6");
    b.put(Integer.valueOf(45), "Canon EF-S 18-55mm f/3.5-5.6 [II]");
    b.put(Integer.valueOf(46), "Canon EF 28-90mm f/4-5.6");
    b.put(Integer.valueOf(47), "Zeiss Milvus 35mm f/2 or 50mm f/2");
    b.put(Integer.valueOf(48), "Canon EF-S 18-55mm f/3.5-5.6 IS");
    b.put(Integer.valueOf(49), "Canon EF-S 55-250mm f/4-5.6 IS");
    b.put(Integer.valueOf(50), "Canon EF-S 18-200mm f/3.5-5.6 IS");
    b.put(Integer.valueOf(51), "Canon EF-S 18-135mm f/3.5-5.6 IS");
    b.put(Integer.valueOf(52), "Canon EF-S 18-55mm f/3.5-5.6 IS II");
    b.put(Integer.valueOf(53), "Canon EF-S 18-55mm f/3.5-5.6 III");
    b.put(Integer.valueOf(54), "Canon EF-S 55-250mm f/4-5.6 IS II");
    b.put(Integer.valueOf(94), "Canon TS-E 17mm f/4L");
    b.put(Integer.valueOf(95), "Canon TS-E 24.0mm f/3.5 L II");
    b.put(Integer.valueOf(124), "Canon MP-E 65mm f/2.8 1-5x Macro Photo");
    b.put(Integer.valueOf(125), "Canon TS-E 24mm f/3.5L");
    b.put(Integer.valueOf(126), "Canon TS-E 45mm f/2.8");
    b.put(Integer.valueOf(127), "Canon TS-E 90mm f/2.8");
    b.put(Integer.valueOf(129), "Canon EF 300mm f/2.8L");
    b.put(Integer.valueOf(130), "Canon EF 50mm f/1.0L");
    b.put(Integer.valueOf(131), "Canon EF 28-80mm f/2.8-4L or Sigma Lens");
    b.put(Integer.valueOf(132), "Canon EF 1200mm f/5.6L");
    b.put(Integer.valueOf(134), "Canon EF 600mm f/4L IS");
    b.put(Integer.valueOf(135), "Canon EF 200mm f/1.8L");
    b.put(Integer.valueOf(136), "Canon EF 300mm f/2.8L");
    b.put(Integer.valueOf(137), "Canon EF 85mm f/1.2L or Sigma or Tamron Lens");
    b.put(Integer.valueOf(138), "Canon EF 28-80mm f/2.8-4L");
    b.put(Integer.valueOf(139), "Canon EF 400mm f/2.8L");
    b.put(Integer.valueOf(140), "Canon EF 500mm f/4.5L");
    b.put(Integer.valueOf(141), "Canon EF 500mm f/4.5L");
    b.put(Integer.valueOf(142), "Canon EF 300mm f/2.8L IS");
    b.put(Integer.valueOf(143), "Canon EF 500mm f/4L IS or Sigma Lens");
    b.put(Integer.valueOf(144), "Canon EF 35-135mm f/4-5.6 USM");
    b.put(Integer.valueOf(145), "Canon EF 100-300mm f/4.5-5.6 USM");
    b.put(Integer.valueOf(146), "Canon EF 70-210mm f/3.5-4.5 USM");
    b.put(Integer.valueOf(147), "Canon EF 35-135mm f/4-5.6 USM");
    b.put(Integer.valueOf(148), "Canon EF 28-80mm f/3.5-5.6 USM");
    b.put(Integer.valueOf(149), "Canon EF 100mm f/2 USM");
    b.put(Integer.valueOf(150), "Canon EF 14mm f/2.8L or Sigma Lens");
    b.put(Integer.valueOf(151), "Canon EF 200mm f/2.8L");
    b.put(Integer.valueOf(152), "Canon EF 300mm f/4L IS or Sigma Lens");
    b.put(Integer.valueOf(153), "Canon EF 35-350mm f/3.5-5.6L or Sigma or Tamron Lens");
    b.put(Integer.valueOf(154), "Canon EF 20mm f/2.8 USM or Zeiss Lens");
    b.put(Integer.valueOf(155), "Canon EF 85mm f/1.8 USM");
    b.put(Integer.valueOf(156), "Canon EF 28-105mm f/3.5-4.5 USM or Tamron Lens");
    b.put(Integer.valueOf(160), "Canon EF 20-35mm f/3.5-4.5 USM or Tamron or Tokina Lens");
    b.put(Integer.valueOf(161), "Canon EF 28-70mm f/2.8L or Sigma or Tamron Lens");
    b.put(Integer.valueOf(162), "Canon EF 200mm f/2.8L");
    b.put(Integer.valueOf(163), "Canon EF 300mm f/4L");
    b.put(Integer.valueOf(164), "Canon EF 400mm f/5.6L");
    b.put(Integer.valueOf(165), "Canon EF 70-200mm f/2.8 L");
    b.put(Integer.valueOf(166), "Canon EF 70-200mm f/2.8 L + 1.4x");
    b.put(Integer.valueOf(167), "Canon EF 70-200mm f/2.8 L + 2x");
    b.put(Integer.valueOf(168), "Canon EF 28mm f/1.8 USM or Sigma Lens");
    b.put(Integer.valueOf(169), "Canon EF 17-35mm f/2.8L or Sigma Lens");
    b.put(Integer.valueOf(170), "Canon EF 200mm f/2.8L II");
    b.put(Integer.valueOf(171), "Canon EF 300mm f/4L");
    b.put(Integer.valueOf(172), "Canon EF 400mm f/5.6L or Sigma Lens");
    b.put(Integer.valueOf(173), "Canon EF 180mm Macro f/3.5L or Sigma Lens");
    b.put(Integer.valueOf(174), "Canon EF 135mm f/2L or Other Lens");
    b.put(Integer.valueOf(175), "Canon EF 400mm f/2.8L");
    b.put(Integer.valueOf(176), "Canon EF 24-85mm f/3.5-4.5 USM");
    b.put(Integer.valueOf(177), "Canon EF 300mm f/4L IS");
    b.put(Integer.valueOf(178), "Canon EF 28-135mm f/3.5-5.6 IS");
    b.put(Integer.valueOf(179), "Canon EF 24mm f/1.4L");
    b.put(Integer.valueOf(180), "Canon EF 35mm f/1.4L or Other Lens");
    b.put(Integer.valueOf(181), "Canon EF 100-400mm f/4.5-5.6L IS + 1.4x or Sigma Lens");
    b.put(Integer.valueOf(182), "Canon EF 100-400mm f/4.5-5.6L IS + 2x or Sigma Lens");
    b.put(Integer.valueOf(183), "Canon EF 100-400mm f/4.5-5.6L IS or Sigma Lens");
    b.put(Integer.valueOf(184), "Canon EF 400mm f/2.8L + 2x");
    b.put(Integer.valueOf(185), "Canon EF 600mm f/4L IS");
    b.put(Integer.valueOf(186), "Canon EF 70-200mm f/4L");
    b.put(Integer.valueOf(187), "Canon EF 70-200mm f/4L + 1.4x");
    b.put(Integer.valueOf(188), "Canon EF 70-200mm f/4L + 2x");
    b.put(Integer.valueOf(189), "Canon EF 70-200mm f/4L + 2.8x");
    b.put(Integer.valueOf(190), "Canon EF 100mm f/2.8 Macro USM");
    b.put(Integer.valueOf(191), "Canon EF 400mm f/4 DO IS");
    b.put(Integer.valueOf(193), "Canon EF 35-80mm f/4-5.6 USM");
    b.put(Integer.valueOf(194), "Canon EF 80-200mm f/4.5-5.6 USM");
    b.put(Integer.valueOf(195), "Canon EF 35-105mm f/4.5-5.6 USM");
    b.put(Integer.valueOf(196), "Canon EF 75-300mm f/4-5.6 USM");
    b.put(Integer.valueOf(197), "Canon EF 75-300mm f/4-5.6 IS USM");
    b.put(Integer.valueOf(198), "Canon EF 50mm f/1.4 USM or Zeiss Lens");
    b.put(Integer.valueOf(199), "Canon EF 28-80mm f/3.5-5.6 USM");
    b.put(Integer.valueOf(200), "Canon EF 75-300mm f/4-5.6 USM");
    b.put(Integer.valueOf(201), "Canon EF 28-80mm f/3.5-5.6 USM");
    b.put(Integer.valueOf(202), "Canon EF 28-80mm f/3.5-5.6 USM IV");
    b.put(Integer.valueOf(208), "Canon EF 22-55mm f/4-5.6 USM");
    b.put(Integer.valueOf(209), "Canon EF 55-200mm f/4.5-5.6");
    b.put(Integer.valueOf(210), "Canon EF 28-90mm f/4-5.6 USM");
    b.put(Integer.valueOf(211), "Canon EF 28-200mm f/3.5-5.6 USM");
    b.put(Integer.valueOf(212), "Canon EF 28-105mm f/4-5.6 USM");
    b.put(Integer.valueOf(213), "Canon EF 90-300mm f/4.5-5.6 USM or Tamron Lens");
    b.put(Integer.valueOf(214), "Canon EF-S 18-55mm f/3.5-5.6 USM");
    b.put(Integer.valueOf(215), "Canon EF 55-200mm f/4.5-5.6 II USM");
    b.put(Integer.valueOf(217), "Tamron AF 18-270mm f/3.5-6.3 Di II VC PZD");
    b.put(Integer.valueOf(224), "Canon EF 70-200mm f/2.8L IS");
    b.put(Integer.valueOf(225), "Canon EF 70-200mm f/2.8L IS + 1.4x");
    b.put(Integer.valueOf(226), "Canon EF 70-200mm f/2.8L IS + 2x");
    b.put(Integer.valueOf(227), "Canon EF 70-200mm f/2.8L IS + 2.8x");
    b.put(Integer.valueOf(228), "Canon EF 28-105mm f/3.5-4.5 USM");
    b.put(Integer.valueOf(229), "Canon EF 16-35mm f/2.8L");
    b.put(Integer.valueOf(230), "Canon EF 24-70mm f/2.8L");
    b.put(Integer.valueOf(231), "Canon EF 17-40mm f/4L");
    b.put(Integer.valueOf(232), "Canon EF 70-300mm f/4.5-5.6 DO IS USM");
    b.put(Integer.valueOf(233), "Canon EF 28-300mm f/3.5-5.6L IS");
    b.put(Integer.valueOf(234), "Canon EF-S 17-85mm f/4-5.6 IS USM or Tokina Lens");
    b.put(Integer.valueOf(235), "Canon EF-S 10-22mm f/3.5-4.5 USM");
    b.put(Integer.valueOf(236), "Canon EF-S 60mm f/2.8 Macro USM");
    b.put(Integer.valueOf(237), "Canon EF 24-105mm f/4L IS");
    b.put(Integer.valueOf(238), "Canon EF 70-300mm f/4-5.6 IS USM");
    b.put(Integer.valueOf(239), "Canon EF 85mm f/1.2L II");
    b.put(Integer.valueOf(240), "Canon EF-S 17-55mm f/2.8 IS USM");
    b.put(Integer.valueOf(241), "Canon EF 50mm f/1.2L");
    b.put(Integer.valueOf(242), "Canon EF 70-200mm f/4L IS");
    b.put(Integer.valueOf(243), "Canon EF 70-200mm f/4L IS + 1.4x");
    b.put(Integer.valueOf(244), "Canon EF 70-200mm f/4L IS + 2x");
    b.put(Integer.valueOf(245), "Canon EF 70-200mm f/4L IS + 2.8x");
    b.put(Integer.valueOf(246), "Canon EF 16-35mm f/2.8L II");
    b.put(Integer.valueOf(247), "Canon EF 14mm f/2.8L II USM");
    b.put(Integer.valueOf(248), "Canon EF 200mm f/2L IS or Sigma Lens");
    b.put(Integer.valueOf(249), "Canon EF 800mm f/5.6L IS");
    b.put(Integer.valueOf(250), "Canon EF 24mm f/1.4L II or Sigma Lens");
    b.put(Integer.valueOf(251), "Canon EF 70-200mm f/2.8L IS II USM");
    b.put(Integer.valueOf(252), "Canon EF 70-200mm f/2.8L IS II USM + 1.4x");
    b.put(Integer.valueOf(253), "Canon EF 70-200mm f/2.8L IS II USM + 2x");
    b.put(Integer.valueOf(254), "Canon EF 100mm f/2.8L Macro IS USM");
    b.put(Integer.valueOf(255), "Sigma 24-105mm f/4 DG OS HSM | A or Other Sigma Lens");
    b.put(Integer.valueOf(488), "Canon EF-S 15-85mm f/3.5-5.6 IS USM");
    b.put(Integer.valueOf(489), "Canon EF 70-300mm f/4-5.6L IS USM");
    b.put(Integer.valueOf(490), "Canon EF 8-15mm f/4L Fisheye USM");
    b.put(Integer.valueOf(491), "Canon EF 300mm f/2.8L IS II USM");
    b.put(Integer.valueOf(492), "Canon EF 400mm f/2.8L IS II USM");
    b.put(Integer.valueOf(493), "Canon EF 500mm f/4L IS II USM or EF 24-105mm f4L IS USM");
    b.put(Integer.valueOf(494), "Canon EF 600mm f/4.0L IS II USM");
    b.put(Integer.valueOf(495), "Canon EF 24-70mm f/2.8L II USM");
    b.put(Integer.valueOf(496), "Canon EF 200-400mm f/4L IS USM");
    b.put(Integer.valueOf(499), "Canon EF 200-400mm f/4L IS USM + 1.4x");
    b.put(Integer.valueOf(502), "Canon EF 28mm f/2.8 IS USM");
    b.put(Integer.valueOf(503), "Canon EF 24mm f/2.8 IS USM");
    b.put(Integer.valueOf(504), "Canon EF 24-70mm f/4L IS USM");
    b.put(Integer.valueOf(505), "Canon EF 35mm f/2 IS USM");
    b.put(Integer.valueOf(506), "Canon EF 400mm f/4 DO IS II USM");
    b.put(Integer.valueOf(507), "Canon EF 16-35mm f/4L IS USM");
    b.put(Integer.valueOf(508), "Canon EF 11-24mm f/4L USM");
    b.put(Integer.valueOf(747), "Canon EF 100-400mm f/4.5-5.6L IS II USM");
    b.put(Integer.valueOf(750), "Canon EF 35mm f/1.4L II USM");
    b.put(Integer.valueOf(4142), "Canon EF-S 18-135mm f/3.5-5.6 IS STM");
    b.put(Integer.valueOf(4143), "Canon EF-M 18-55mm f/3.5-5.6 IS STM or Tamron Lens");
    b.put(Integer.valueOf(4144), "Canon EF 40mm f/2.8 STM");
    b.put(Integer.valueOf(4145), "Canon EF-M 22mm f/2 STM");
    b.put(Integer.valueOf(4146), "Canon EF-S 18-55mm f/3.5-5.6 IS STM");
    b.put(Integer.valueOf(4147), "Canon EF-M 11-22mm f/4-5.6 IS STM");
    b.put(Integer.valueOf(4148), "Canon EF-S 55-250mm f/4-5.6 IS STM");
    b.put(Integer.valueOf(4149), "Canon EF-M 55-200mm f/4.5-6.3 IS STM");
    b.put(Integer.valueOf(4150), "Canon EF-S 10-18mm f/4.5-5.6 IS STM");
    b.put(Integer.valueOf(4152), "Canon EF 24-105mm f/3.5-5.6 IS STM");
    b.put(Integer.valueOf(4153), "Canon EF-M 15-45mm f/3.5-6.3 IS STM");
    b.put(Integer.valueOf(4154), "Canon EF-S 24mm f/2.8 STM");
    b.put(Integer.valueOf(4156), "Canon EF 50mm f/1.8 STM");
    b.put(Integer.valueOf(36912), "Canon EF-S 18-135mm f/3.5-5.6 IS USM");
    b.put(Integer.valueOf(65535), "N/A");
  }
  
  public c(d paramd) {
    super(paramd);
  }
  
  private double j(int paramInt) {
    byte b;
    int i;
    if (paramInt < 0) {
      i = -paramInt;
      b = -1;
    } else {
      b = 1;
      i = paramInt;
    } 
    int k = i & 0x1F;
    if (k == 12) {
      paramInt = 10;
    } else {
      paramInt = k;
      if (k == 20)
        paramInt = 21; 
    } 
    double d = (b * (i - k + paramInt));
    Double.isNaN(d);
    return d / 32.0D;
  }
  
  public String A() {
    return a(49425, 3, new String[] { "Evaluative", "Partial", "Centre weighted" });
  }
  
  public String B() {
    Integer integer = ((d)this.a).k(49435);
    return (integer == null) ? null : ((integer.intValue() > 512) ? String.format("Unknown (%d)", new Object[] { integer }) : j.a(Math.exp(j(integer.intValue()) * Math.log(2.0D) / 2.0D)));
  }
  
  public String C() {
    Integer integer = ((d)this.a).k(49446);
    if (integer == null)
      return null; 
    int i = integer.intValue();
    if (i != 100) {
      StringBuilder stringBuilder;
      switch (i) {
        default:
          stringBuilder = new StringBuilder();
          stringBuilder.append("Unknown (");
          stringBuilder.append(integer);
          stringBuilder.append(")");
          return stringBuilder.toString();
        case 6:
          return "Custom";
        case 5:
          return "B&W";
        case 4:
          return "Sepia";
        case 3:
          return "Smooth";
        case 2:
          return "Neutral";
        case 1:
          return "Vivid";
        case 0:
          break;
      } 
      return "Off";
    } 
    return "My Color Data";
  }
  
  public String D() {
    return a(49411, 2, new String[] { "Normal", "Fine", null, "Superfine" });
  }
  
  public String E() {
    return a(49417, 1, new String[] { "JPEG", "CRW+THM", "AVI+THM", "TIF", "TIF+JPEG", "CR2", "CR2+JPEG", null, "MOV", "MP4" });
  }
  
  public String F() {
    return a(49453, 0, new String[] { "n/a", "sRAW1 (mRAW)", "sRAW2 (sRAW)" });
  }
  
  public String G() {
    Integer integer = ((d)this.a).k(49422);
    if (integer == null)
      return null; 
    int i = integer.intValue();
    if (i != 0) {
      if (i != 1) {
        if (i != 65535) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Unknown (");
          stringBuilder.append(integer);
          stringBuilder.append(")");
          return stringBuilder.toString();
        } 
        return "Low";
      } 
      return "High";
    } 
    return "Normal";
  }
  
  public String H() {
    Integer integer = ((d)this.a).k(49410);
    if (integer == null)
      return null; 
    if (integer.intValue() == 0)
      return "Self timer not used"; 
    DecimalFormat decimalFormat = new DecimalFormat("0.##");
    StringBuilder stringBuilder = new StringBuilder();
    double d = integer.intValue();
    Double.isNaN(d);
    stringBuilder.append(decimalFormat.format(d * 0.1D));
    stringBuilder.append(" sec");
    return stringBuilder.toString();
  }
  
  public String I() {
    Integer integer = ((d)this.a).k(12);
    return (integer == null) ? null : String.format("%04X%05d", new Object[] { Integer.valueOf(integer.intValue() >> 8 & 0xFF), Integer.valueOf(integer.intValue() & 0xFF) });
  }
  
  public String J() {
    Integer integer = ((d)this.a).k(49423);
    if (integer == null)
      return null; 
    int i = integer.intValue();
    if (i != 0) {
      if (i != 1) {
        if (i != 65535) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Unknown (");
          stringBuilder.append(integer);
          stringBuilder.append(")");
          return stringBuilder.toString();
        } 
        return "Low";
      } 
      return "High";
    } 
    return "Normal";
  }
  
  public String K() {
    Integer integer = ((d)this.a).k(49432);
    if (integer == null)
      return null; 
    String str = o();
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(Integer.toString(integer.intValue()));
    stringBuilder.append(" ");
    stringBuilder.append(str);
    return stringBuilder.toString();
  }
  
  public String L() {
    return a(49445, 0, new String[] { "Center", "AF Point" });
  }
  
  public String M() {
    Integer integer = ((d)this.a).k(53770);
    if (integer == null)
      return null; 
    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < 16; i++) {
      if ((integer.intValue() & 1 << i) != 0) {
        if (stringBuilder.length() != 0)
          stringBuilder.append(','); 
        stringBuilder.append(i);
      } 
    } 
    return (stringBuilder.length() == 0) ? "None" : stringBuilder.toString();
  }
  
  public String N() {
    return a(49671, new String[] { "Auto", "Sunny", "Cloudy", "Tungsten", "Florescent", "Flash", "Custom" });
  }
  
  public String a() {
    return a(49439, 0, new String[] { "Normal AE", "Exposure Compensation", "AE Lock", "AE Lock + Exposure Comp.", "No AE" });
  }
  
  public String b() {
    return a(49427, 12288, new String[] { "None (MF)", "Auto selected", "Right", "Centre", "Left" });
  }
  
  public String c() {
    Integer integer = ((d)this.a).k(49678);
    if (integer == null)
      return null; 
    if ((integer.intValue() & 0x7) == 0)
      return "Right"; 
    if ((integer.intValue() & 0x7) == 1)
      return "Centre"; 
    if ((integer.intValue() & 0x7) == 2)
      return "Left"; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Unknown (");
    stringBuilder.append(integer);
    stringBuilder.append(")");
    return stringBuilder.toString();
  }
  
  public String c(int paramInt) {
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
                          case 49679:
                            return l();
                          case 49678:
                            break;
                        } 
                        return c();
                      case 49447:
                        return y();
                      case 49446:
                        return C();
                      case 49445:
                        break;
                    } 
                    return L();
                  case 49441:
                    return h();
                  case 49440:
                    return r();
                  case 49439:
                    return a();
                  case 49438:
                    return p();
                  case 49437:
                    return m();
                  case 49436:
                    return k();
                  case 49435:
                    return B();
                  case 49434:
                    return z();
                  case 49433:
                    return o();
                  case 49432:
                    return K();
                  case 49431:
                    return w();
                  case 49430:
                    break;
                } 
                return v();
              case 49428:
                return j();
              case 49427:
                return b();
              case 49426:
                return s();
              case 49425:
                return A();
              case 49424:
                return u();
              case 49423:
                return J();
              case 49422:
                return G();
              case 49421:
                return f();
              case 49420:
                return g();
              case 49419:
                return i();
              case 49418:
                return t();
              case 49417:
                break;
            } 
            return E();
          case 49413:
            return e();
          case 49412:
            return n();
          case 49411:
            return D();
          case 49410:
            return H();
          case 49409:
            break;
        } 
        return x();
      case 53770:
        return M();
      case 49671:
        return N();
      case 49453:
        return F();
      case 49449:
        return d();
      case 49415:
        return q();
      case 12:
        break;
    } 
    return I();
  }
  
  public String d() {
    Integer integer = ((d)this.a).k(49449);
    return (integer == null) ? null : ((integer.intValue() == 32767) ? "n/a" : integer.toString());
  }
  
  public String e() {
    Integer integer = ((d)this.a).k(49413);
    if (integer == null)
      return null; 
    int i = integer.intValue();
    if (i != 0) {
      if (i != 1) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unknown (");
        stringBuilder.append(integer);
        stringBuilder.append(")");
        return stringBuilder.toString();
      } 
    } else {
      integer = ((d)this.a).k(49410);
      if (integer != null)
        return (integer.intValue() == 0) ? "Single shot" : "Single shot with self-timer"; 
    } 
    return "Continuous";
  }
  
  public String f() {
    Integer integer = ((d)this.a).k(49421);
    if (integer == null)
      return null; 
    int i = integer.intValue();
    if (i != 0) {
      if (i != 1) {
        if (i != 65535) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Unknown (");
          stringBuilder.append(integer);
          stringBuilder.append(")");
          return stringBuilder.toString();
        } 
        return "Low";
      } 
      return "High";
    } 
    return "Normal";
  }
  
  public String g() {
    return a(49420, new String[] { "No digital zoom", "2x", "4x" });
  }
  
  public String h() {
    Integer integer = ((d)this.a).k(49441);
    return (integer == null) ? null : ((integer.intValue() == 65535) ? integer.toString() : j.a((integer.intValue() / 10.0F)));
  }
  
  public String i() {
    return a(49419, new String[] { 
          "Full auto", "Manual", "Landscape", "Fast shutter", "Slow shutter", "Night", "B&W", "Sepia", "Portrait", "Sports", 
          "Macro / Closeup", "Pan focus" });
  }
  
  public String j() {
    return a(49428, new String[] { "Easy shooting", "Program", "Tv-priority", "Av-priority", "Manual", "A-DEP" });
  }
  
  public String k() {
    return a(49436, new String[] { "Flash did not fire", "Flash fired" });
  }
  
  public String l() {
    String str;
    Integer integer2 = ((d)this.a).k(49679);
    if (integer2 == null)
      return null; 
    boolean bool = false;
    Integer integer1 = integer2;
    if (integer2.intValue() > 61440) {
      integer1 = Integer.valueOf(Integer.valueOf(65535 - integer2.intValue()).intValue() + 1);
      bool = true;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    if (bool) {
      str = "-";
    } else {
      str = "";
    } 
    stringBuilder.append(str);
    stringBuilder.append(Float.toString(integer1.intValue() / 32.0F));
    stringBuilder.append(" EV");
    return stringBuilder.toString();
  }
  
  public String m() {
    Integer integer = ((d)this.a).k(49437);
    if (integer == null)
      return null; 
    if ((integer.intValue() >> 14 & 0x1) != 0)
      return "External E-TTL"; 
    if ((integer.intValue() >> 13 & 0x1) != 0)
      return "Internal flash"; 
    if ((integer.intValue() >> 11 & 0x1) != 0)
      return "FP sync used"; 
    if ((integer.intValue() >> 4 & 0x1) != 0)
      return "FP sync enabled"; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Unknown (");
    stringBuilder.append(integer);
    stringBuilder.append(")");
    return stringBuilder.toString();
  }
  
  public String n() {
    Integer integer = ((d)this.a).k(49412);
    if (integer == null)
      return null; 
    int i = integer.intValue();
    if (i != 16) {
      StringBuilder stringBuilder;
      switch (i) {
        default:
          stringBuilder = new StringBuilder();
          stringBuilder.append("Unknown (");
          stringBuilder.append(integer);
          stringBuilder.append(")");
          return stringBuilder.toString();
        case 6:
          return "On and red-eye reduction";
        case 5:
          return "Auto and red-eye reduction";
        case 4:
          return "Slow-synchro";
        case 3:
          return "Red-eye reduction";
        case 2:
          return "On";
        case 1:
          return "Auto";
        case 0:
          break;
      } 
      return "No flash fired";
    } 
    return "External flash";
  }
  
  public String o() {
    Integer integer = ((d)this.a).k(49433);
    return (integer == null) ? null : ((integer.intValue() != 0) ? Integer.toString(integer.intValue()) : "");
  }
  
  public String p() {
    return a(49438, 0, new String[] { "Single", "Continuous", null, null, null, null, null, null, "Manual" });
  }
  
  public String q() {
    return a(49415, new String[] { "One-shot", "AI Servo", "AI Focus", "Manual Focus", "Single", "Continuous", "Manual Focus" });
  }
  
  public String r() {
    return a(49440, new String[] { "Single", "Continuous" });
  }
  
  public String s() {
    Integer integer = ((d)this.a).k(49426);
    if (integer == null)
      return null; 
    int i = integer.intValue();
    if (i != 0) {
      if (i != 1) {
        if (i != 3) {
          if (i != 8) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unknown (");
            stringBuilder.append(integer);
            stringBuilder.append(")");
            return stringBuilder.toString();
          } 
          return "Locked (Pan Mode)";
        } 
        return "Close-up (Macro)";
      } 
      return "Auto";
    } 
    return "Manual";
  }
  
  public String t() {
    return a(49418, new String[] { "Large", "Medium", "Small" });
  }
  
  public String u() {
    Integer integer = ((d)this.a).k(49424);
    if (integer == null)
      return null; 
    if ((integer.intValue() & 0x4000) != 0) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("");
      stringBuilder.append(integer.intValue() & 0xFFFFBFFF);
      return stringBuilder.toString();
    } 
    int i = integer.intValue();
    if (i != 0) {
      StringBuilder stringBuilder;
      switch (i) {
        default:
          stringBuilder = new StringBuilder();
          stringBuilder.append("Unknown (");
          stringBuilder.append(integer);
          stringBuilder.append(")");
          return stringBuilder.toString();
        case 19:
          return "400";
        case 18:
          return "200";
        case 17:
          return "100";
        case 16:
          return "50";
        case 15:
          break;
      } 
      return "Auto";
    } 
    return "Not specified (see ISOSpeedRatings tag)";
  }
  
  public String v() {
    Integer integer = ((d)this.a).k(49430);
    return (integer == null) ? null : (b.containsKey(integer) ? b.get(integer) : String.format("Unknown (%d)", new Object[] { integer }));
  }
  
  public String w() {
    Integer integer = ((d)this.a).k(49431);
    if (integer == null)
      return null; 
    String str = o();
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(Integer.toString(integer.intValue()));
    stringBuilder.append(" ");
    stringBuilder.append(str);
    return stringBuilder.toString();
  }
  
  public String x() {
    return a(49409, 1, new String[] { "Macro", "Normal" });
  }
  
  public String y() {
    Integer integer = ((d)this.a).k(49447);
    if (integer == null)
      return null; 
    int i = integer.intValue();
    if (i != 0) {
      if (i != 1280) {
        if (i != 1282) {
          if (i != 1284) {
            if (i != 32767) {
              StringBuilder stringBuilder = new StringBuilder();
              stringBuilder.append("Unknown (");
              stringBuilder.append(integer);
              stringBuilder.append(")");
              return stringBuilder.toString();
            } 
            return "n/a";
          } 
          return "Low";
        } 
        return "Medium";
      } 
      return "Full";
    } 
    return "n/a";
  }
  
  public String z() {
    Integer integer = ((d)this.a).k(49434);
    return (integer == null) ? null : ((integer.intValue() > 512) ? String.format("Unknown (%d)", new Object[] { integer }) : j.a(Math.exp(j(integer.intValue()) * Math.log(2.0D) / 2.0D)));
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/o/a0/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */