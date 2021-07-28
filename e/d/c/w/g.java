package e.d.c.w;

import e.d.c.j;

public class g extends j<i> {
  public g(i parami) {
    super(parami);
  }
  
  public String a() {
    String str = ((i)this.a).p(0);
    if (str == null)
      return null; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(str);
    stringBuilder.append(" bits");
    return stringBuilder.toString();
  }
  
  public String b() {
    return a(-3, new String[] { 
          "Baseline", "Extended sequential, Huffman", "Progressive, Huffman", "Lossless, Huffman", null, "Differential sequential, Huffman", "Differential progressive, Huffman", "Differential lossless, Huffman", "Reserved for JPEG extensions", "Extended sequential, arithmetic", 
          "Progressive, arithmetic", "Lossless, arithmetic", null, "Differential sequential, arithmetic", "Differential progressive, arithmetic", "Differential lossless, arithmetic" });
  }
  
  public String c() {
    String str = ((i)this.a).p(1);
    if (str == null)
      return null; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(str);
    stringBuilder.append(" pixels");
    return stringBuilder.toString();
  }
  
  public String c(int paramInt) {
    if (paramInt != -3) {
      if (paramInt != 3) {
        if (paramInt != 0) {
          if (paramInt != 1) {
            switch (paramInt) {
              default:
                return super.c(paramInt);
              case 9:
                return j(3);
              case 8:
                paramInt = 2;
                return j(paramInt);
              case 7:
                return j(1);
              case 6:
                break;
            } 
            paramInt = 0;
            return j(paramInt);
          } 
          return c();
        } 
        return a();
      } 
      return d();
    } 
    return b();
  }
  
  public String d() {
    String str = ((i)this.a).p(3);
    if (str == null)
      return null; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(str);
    stringBuilder.append(" pixels");
    return stringBuilder.toString();
  }
  
  public String j(int paramInt) {
    f f = ((i)this.a).v(paramInt);
    if (f == null)
      return null; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(f.a());
    stringBuilder.append(" component: ");
    stringBuilder.append(f);
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/w/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */