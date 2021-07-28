package e.d.c.z;

import e.d.c.j;

public class a extends j<b> {
  public a(b paramb) {
    super(paramb);
  }
  
  public String a() {
    return a(10, 3, new String[] { "24-bit color", "16 colors" });
  }
  
  public String b() {
    return a(12, 1, new String[] { "Color or B&W", "Grayscale" });
  }
  
  public String c() {
    return a(1, new String[] { "2.5 with fixed EGA palette information", null, "2.8 with modifiable EGA palette information", "2.8 without palette information (default palette)", "PC Paintbrush for Windows", "3.0 or better" });
  }
  
  public String c(int paramInt) {
    return (paramInt != 1) ? ((paramInt != 10) ? ((paramInt != 12) ? super.c(paramInt) : b()) : a()) : c();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/z/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */