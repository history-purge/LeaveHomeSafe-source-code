package e.d.c.m;

import e.d.c.b;
import java.util.HashMap;

public class b extends b {
  protected static final HashMap<Integer, String> e = new HashMap<Integer, String>();
  
  static {
    e.put(Integer.valueOf(-2), "Bitmap type");
    e.put(Integer.valueOf(-1), "Header Size");
    e.put(Integer.valueOf(1), "Image Height");
    e.put(Integer.valueOf(2), "Image Width");
    e.put(Integer.valueOf(3), "Planes");
    e.put(Integer.valueOf(4), "Bits Per Pixel");
    e.put(Integer.valueOf(5), "Compression");
    e.put(Integer.valueOf(6), "X Pixels per Meter");
    e.put(Integer.valueOf(7), "Y Pixels per Meter");
    e.put(Integer.valueOf(8), "Palette Colour Count");
    e.put(Integer.valueOf(9), "Important Colour Count");
    e.put(Integer.valueOf(10), "Rendering");
    e.put(Integer.valueOf(11), "Color Encoding");
    e.put(Integer.valueOf(12), "Red Mask");
    e.put(Integer.valueOf(13), "Green Mask");
    e.put(Integer.valueOf(14), "Blue Mask");
    e.put(Integer.valueOf(15), "Alpha Mask");
    e.put(Integer.valueOf(16), "Color Space Type");
    e.put(Integer.valueOf(17), "Red Gamma Curve");
    e.put(Integer.valueOf(18), "Green Gamma Curve");
    e.put(Integer.valueOf(19), "Blue Gamma Curve");
    e.put(Integer.valueOf(20), "Rendering Intent");
    e.put(Integer.valueOf(21), "Linked Profile File Name");
  }
  
  public b() {
    a(new a(this));
  }
  
  public String a() {
    return "BMP Header";
  }
  
  protected HashMap<Integer, String> b() {
    return e;
  }
  
  public b f() {
    Integer integer = k(-2);
    return (integer == null) ? null : b.f(integer.intValue());
  }
  
  public c g() {
    Integer integer = k(11);
    return (integer == null) ? null : c.f(integer.intValue());
  }
  
  public d h() {
    Long long_ = l(16);
    return (long_ == null) ? null : d.a(long_.longValue());
  }
  
  public e i() {
    return e.a(this);
  }
  
  public f j() {
    Integer integer = k(10);
    return (integer == null) ? null : f.f(integer.intValue());
  }
  
  public g k() {
    Integer integer = k(20);
    return (integer == null) ? null : g.a(integer.intValue());
  }
  
  public enum b {
    c(19778),
    d(16706),
    e(17225),
    f(18755),
    g(20547),
    h(21584);
    
    private final int value;
    
    b(int param1Int1) {
      this.value = param1Int1;
    }
    
    public static b f(int param1Int) {
      for (b b1 : values()) {
        if (b1.value == param1Int)
          return b1; 
      } 
      return null;
    }
    
    public String toString() {
      StringBuilder stringBuilder;
      switch (b.a.a[ordinal()]) {
        default:
          stringBuilder = new StringBuilder();
          stringBuilder.append("Unimplemented bitmap type ");
          stringBuilder.append(super.toString());
          throw new IllegalStateException(stringBuilder.toString());
        case 6:
          return "Monochrome Pointer";
        case 5:
          return "Monochrome Icon";
        case 4:
          return "Color Pointer";
        case 3:
          return "Color Icon";
        case 2:
          return "Bitmap Array";
        case 1:
          break;
      } 
      return "Standard";
    }
  }
  
  public enum c {
    c(0);
    
    private final int value;
    
    c(int param1Int1) {
      this.value = param1Int1;
    }
    
    public static c f(int param1Int) {
      return (param1Int == 0) ? c : null;
    }
  }
  
  public enum d {
    c(0L),
    d(1934772034L),
    e(1466527264L),
    f(1279872587L),
    g(1296188740L);
    
    private final long value;
    
    d(long param1Long) {
      this.value = param1Long;
    }
    
    public static d a(long param1Long) {
      for (d d1 : values()) {
        if (d1.value == param1Long)
          return d1; 
      } 
      return null;
    }
    
    public long a() {
      return this.value;
    }
    
    public String toString() {
      int i = b.a.d[ordinal()];
      if (i != 1) {
        if (i != 2) {
          if (i != 3) {
            if (i != 4) {
              if (i == 5)
                return "Embedded Profile"; 
              StringBuilder stringBuilder = new StringBuilder();
              stringBuilder.append("Unimplemented color space type ");
              stringBuilder.append(super.toString());
              throw new IllegalStateException(stringBuilder.toString());
            } 
            return "Linked Profile";
          } 
          return "System Default Color Space, sRGB";
        } 
        return "sRGB Color Space";
      } 
      return "Calibrated RGB";
    }
  }
  
  public enum e {
    c(0),
    d(1),
    e(2),
    f(3),
    g(3),
    h(4),
    i(4),
    j(5),
    k(6),
    l(11),
    m(12),
    n(13);
    
    private final int value;
    
    e(int param1Int1) {
      this.value = param1Int1;
    }
    
    public static e a(int param1Int1, int param1Int2) {
      switch (param1Int1) {
        default:
          return null;
        case 13:
          return n;
        case 12:
          return m;
        case 11:
          return l;
        case 6:
          return k;
        case 5:
          return j;
        case 4:
          return (param1Int2 == 64) ? i : h;
        case 3:
          return (param1Int2 == 64) ? g : f;
        case 2:
          return e;
        case 1:
          return d;
        case 0:
          break;
      } 
      return c;
    }
    
    public static e a(b param1b) {
      Integer integer2 = param1b.k(5);
      if (integer2 == null)
        return null; 
      Integer integer1 = param1b.k(-1);
      return (integer1 == null) ? null : a(integer2.intValue(), integer1.intValue());
    }
    
    public String toString() {
      StringBuilder stringBuilder;
      switch (b.a.b[ordinal()]) {
        default:
          stringBuilder = new StringBuilder();
          stringBuilder.append("Unimplemented compression type ");
          stringBuilder.append(super.toString());
          throw new IllegalStateException(stringBuilder.toString());
        case 12:
          return "CMYK RLE-4";
        case 11:
          return "CMYK RLE-8";
        case 10:
          return "CMYK Uncompressed";
        case 9:
          return "RGBA Bit Fields";
        case 8:
          return "PNG";
        case 7:
          return "RLE 24-bit/pixel";
        case 6:
          return "JPEG";
        case 5:
          return "Huffman 1D";
        case 4:
          return "Bit Fields";
        case 3:
          return "RLE 4-bit/pixel";
        case 2:
          return "RLE 8-bit/pixel";
        case 1:
          break;
      } 
      return "None";
    }
  }
  
  public enum f {
    c(0),
    d(1),
    e(2),
    f(3);
    
    private final int value;
    
    f(int param1Int1) {
      this.value = param1Int1;
    }
    
    public static f f(int param1Int) {
      for (f f1 : values()) {
        if (f1.value == param1Int)
          return f1; 
      } 
      return null;
    }
    
    public String toString() {
      int i = b.a.c[ordinal()];
      if (i != 1) {
        if (i != 2) {
          if (i != 3) {
            if (i == 4)
              return "Super-circle Halftoning"; 
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unimplemented rendering halftoning algorithm type ");
            stringBuilder.append(super.toString());
            throw new IllegalStateException(stringBuilder.toString());
          } 
          return "Processing Algorithm for Noncoded Document Acquisition";
        } 
        return "Error Diffusion Halftoning";
      } 
      return "No Halftoning Algorithm";
    }
  }
  
  public enum g {
    c(1),
    d(2),
    e(4),
    f(8);
    
    private final int value;
    
    g(int param1Int1) {
      this.value = param1Int1;
    }
    
    public static g a(long param1Long) {
      for (g g1 : values()) {
        if (g1.value == param1Long)
          return g1; 
      } 
      return null;
    }
    
    public String toString() {
      int i = b.a.e[ordinal()];
      if (i != 1) {
        if (i != 2) {
          if (i != 3) {
            if (i == 4)
              return "Match, Absolute Colorimetric"; 
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unimplemented rendering intent ");
            stringBuilder.append(super.toString());
            throw new IllegalStateException(stringBuilder.toString());
          } 
          return "Picture, Perceptual";
        } 
        return "Proof, Relative Colorimetric";
      } 
      return "Graphic, Saturation";
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/m/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */