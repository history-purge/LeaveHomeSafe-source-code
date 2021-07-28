package e.d.c.x.i;

import e.d.c.j;
import e.d.c.x.b;
import e.d.c.x.d;

public class q extends b {
  public q(r paramr) {
    super(paramr);
  }
  
  private String a() {
    Integer integer = ((d)((j)this).a).k(11);
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
    Integer integer = ((d)((j)this).a).k(paramInt);
    if (integer == null)
      return null; 
    paramInt = integer.intValue();
    if (paramInt != -1) {
      if (paramInt != 0) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unknown (");
        stringBuilder.append(integer);
        stringBuilder.append(")");
        return stringBuilder.toString();
      } 
      return "Color table within file";
    } 
    return (((d)((j)this).a).k(9).intValue() < 16) ? "Default" : "None";
  }
  
  private String k(int paramInt) {
    Integer integer = ((d)((j)this).a).k(paramInt);
    if (integer == null)
      return null; 
    paramInt = integer.intValue();
    if (paramInt != 34 && paramInt != 36 && paramInt != 40) {
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
  
  private String l(int paramInt) {
    String str = ((d)((j)this).a).p(paramInt);
    if (str == null)
      return null; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(str);
    stringBuilder.append(" pixels");
    return stringBuilder.toString();
  }
  
  public String c(int paramInt) {
    return (paramInt != 4 && paramInt != 5) ? ((paramInt != 9) ? ((paramInt != 11) ? ((paramInt != 13) ? super.c(paramInt) : j(paramInt)) : a()) : k(paramInt)) : l(paramInt);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/x/i/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */