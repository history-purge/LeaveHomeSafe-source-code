package e.d.c.n;

import e.d.c.j;

public class a extends j<b> {
  public a(b paramb) {
    super(paramb);
  }
  
  public String a() {
    return a(30, 1, new String[] { "Grayscale", "Lab", "RGB", "CMYK" });
  }
  
  public String c(int paramInt) {
    switch (paramInt) {
      default:
        return ((b)this.a).p(paramInt);
      case 32:
      case 33:
        return j(paramInt);
      case 30:
        return a();
      case 28:
      case 29:
        break;
    } 
    return k(paramInt);
  }
  
  public String j(int paramInt) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(((b)this.a).p(paramInt));
    stringBuilder.append(" bytes");
    return stringBuilder.toString();
  }
  
  public String k(int paramInt) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(((b)this.a).p(paramInt));
    stringBuilder.append(" pixels");
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/n/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */