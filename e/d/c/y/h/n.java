package e.d.c.y.h;

import e.d.c.b;
import e.d.c.j;

public class n extends j<o> {
  public n(o paramo) {
    super((b)paramo);
  }
  
  private String a() {
    Integer integer = ((o)this.a).k(113);
    if (integer == null)
      return null; 
    int i = integer.intValue();
    if (i != -1) {
      if (i != 0) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unknown (");
        stringBuilder.append(integer);
        stringBuilder.append(")");
        return stringBuilder.toString();
      } 
      return "Color table within file";
    } 
    integer = ((o)this.a).k(109);
    return (integer == null) ? "None" : ((integer.intValue() < 16) ? "Default" : "None");
  }
  
  private String b() {
    Integer integer = ((o)this.a).k(109);
    if (integer == null)
      return null; 
    int i = integer.intValue();
    if (i != 34 && i != 36 && i != 40) {
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("Unknown (");
      stringBuilder1.append(integer);
      str = ")";
      stringBuilder1.append(str);
      return stringBuilder1.toString();
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(str.intValue() - 32);
    String str = "-bit grayscale";
    stringBuilder.append(str);
    return stringBuilder.toString();
  }
  
  private String c() {
    Integer integer = ((o)this.a).k(111);
    if (integer == null)
      return null; 
    int i = integer.intValue();
    if (i != 0) {
      if (i != 32) {
        if (i != 36) {
          if (i != 64) {
            StringBuilder stringBuilder;
            switch (i) {
              default:
                stringBuilder = new StringBuilder();
                stringBuilder.append("Unknown (");
                stringBuilder.append(integer);
                stringBuilder.append(")");
                return stringBuilder.toString();
              case 260:
                return "Straight alpha blend";
              case 259:
                return "Composition (dither copy)";
              case 258:
                return "Premul black alpha";
              case 257:
                return "Premul white alpha";
              case 256:
                break;
            } 
            return "Straight alpha";
          } 
          return "Dither copy";
        } 
        return "Transparent";
      } 
      return "Blend";
    } 
    return "Copy";
  }
  
  private String j(int paramInt) {
    String str = ((o)this.a).p(paramInt);
    if (str == null)
      return null; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(str);
    stringBuilder.append(" pixels");
    return stringBuilder.toString();
  }
  
  public String c(int paramInt) {
    return (paramInt != 104 && paramInt != 105) ? ((paramInt != 109) ? ((paramInt != 111) ? ((paramInt != 113) ? super.c(paramInt) : a()) : c()) : b()) : j(paramInt);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/y/h/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */