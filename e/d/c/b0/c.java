package e.d.c.b0;

import e.d.a.n.d;
import e.d.c.b;
import java.util.HashMap;

public class c extends b {
  protected static final HashMap<Integer, String> f = new HashMap<Integer, String>();
  
  private final d e;
  
  static {
    f.put(Integer.valueOf(2), "Image Height");
    f.put(Integer.valueOf(1), "Image Width");
    f.put(Integer.valueOf(3), "Bits Per Sample");
    f.put(Integer.valueOf(4), "Color Type");
    f.put(Integer.valueOf(5), "Compression Type");
    f.put(Integer.valueOf(6), "Filter Method");
    f.put(Integer.valueOf(7), "Interlace Method");
    f.put(Integer.valueOf(8), "Palette Size");
    f.put(Integer.valueOf(9), "Palette Has Transparency");
    f.put(Integer.valueOf(10), "sRGB Rendering Intent");
    f.put(Integer.valueOf(11), "Image Gamma");
    f.put(Integer.valueOf(12), "ICC Profile Name");
    f.put(Integer.valueOf(13), "Textual Data");
    f.put(Integer.valueOf(14), "Last Modification Time");
    f.put(Integer.valueOf(15), "Background Color");
    f.put(Integer.valueOf(16), "Pixels Per Unit X");
    f.put(Integer.valueOf(17), "Pixels Per Unit Y");
    f.put(Integer.valueOf(18), "Unit Specifier");
    f.put(Integer.valueOf(19), "Significant Bits");
  }
  
  public c(d paramd) {
    this.e = paramd;
    a(new b(this));
  }
  
  public String a() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("PNG-");
    stringBuilder.append(this.e.b());
    return stringBuilder.toString();
  }
  
  protected HashMap<Integer, String> b() {
    return f;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/b0/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */