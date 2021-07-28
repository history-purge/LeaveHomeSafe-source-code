package e.d.c.w;

import e.d.c.j;

public class a extends j<b> {
  public a(b paramb) {
    super(paramb);
  }
  
  public String a() {
    String str;
    Integer integer = ((b)this.a).k(1);
    if (integer == null)
      return null; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(integer);
    if (integer.intValue() == 1) {
      str = " Huffman table";
    } else {
      str = " Huffman tables";
    } 
    stringBuilder.append(str);
    return stringBuilder.toString();
  }
  
  public String c(int paramInt) {
    return (paramInt != 1) ? super.c(paramInt) : a();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/w/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */