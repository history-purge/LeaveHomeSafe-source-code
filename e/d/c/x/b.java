package e.d.c.x;

import e.d.c.j;
import java.util.ArrayList;
import java.util.Arrays;

public class b extends j<d> {
  public b(d paramd) {
    super(paramd);
  }
  
  private String a() {
    String[] arrayOfString = ((d)this.a).q(4098);
    if (arrayOfString == null)
      return null; 
    ArrayList<String> arrayList = new ArrayList();
    int k = arrayOfString.length;
    for (int i = 0; i < k; i++) {
      String str1 = arrayOfString[i];
      String str2 = c.a(4096, str1);
      if (str2 != null)
        str1 = str2; 
      arrayList.add(str1);
    } 
    return Arrays.toString(arrayList.toArray());
  }
  
  private String b() {
    Long long_ = ((d)this.a).l(259);
    if (long_ == null)
      return null; 
    double d1 = long_.longValue();
    double d2 = Math.pow(60.0D, 2.0D);
    Double.isNaN(d1);
    Integer integer1 = Integer.valueOf((int)(d1 / d2));
    d1 = long_.longValue();
    d2 = Math.pow(60.0D, 1.0D);
    Double.isNaN(d1);
    d1 /= d2;
    d2 = (integer1.intValue() * 60);
    Double.isNaN(d2);
    Integer integer2 = Integer.valueOf((int)(d1 - d2));
    d1 = long_.longValue();
    d2 = Math.pow(60.0D, 0.0D);
    Double.isNaN(d1);
    d1 /= d2;
    d2 = (integer2.intValue() * 60);
    Double.isNaN(d2);
    return String.format("%1$02d:%2$02d:%3$02d", new Object[] { integer1, integer2, Integer.valueOf((int)Math.ceil(d1 - d2)) });
  }
  
  private String c() {
    byte[] arrayOfByte = ((d)this.a).d(4096);
    return (arrayOfByte == null) ? null : c.a(4096, new String(arrayOfByte));
  }
  
  public String c(int paramInt) {
    return (paramInt != 259) ? ((paramInt != 4096) ? ((paramInt != 4098) ? super.c(paramInt) : a()) : c()) : b();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/x/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */