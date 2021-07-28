package e.d.c.o.a0;

import e.d.b.m;
import e.d.c.j;

public class a0 extends j<b0> {
  public a0(b0 paramb0) {
    super(paramb0);
  }
  
  public String a() {
    Integer integer = ((b0)this.a).k(776);
    return (integer == null) ? null : integer.toString();
  }
  
  public String b() {
    return a(521, new String[] { "Off", "On" });
  }
  
  public String c() {
    return a(4612, new String[] { "Bounce or Off", "Direct" });
  }
  
  public String c(int paramInt) {
    return (paramInt != 0) ? ((paramInt != 521) ? ((paramInt != 773) ? ((paramInt != 776) ? ((paramInt != 4609) ? ((paramInt != 5376) ? ((paramInt != 5632) ? ((paramInt != 4612) ? ((paramInt != 4613) ? ((paramInt != 4617) ? ((paramInt != 4618) ? super.c(paramInt) : i()) : j()) : e()) : c()) : h()) : k()) : d()) : a()) : f()) : b()) : g();
  }
  
  public String d() {
    int[] arrayOfInt = ((b0)this.a).j(4609);
    if (arrayOfInt == null || arrayOfInt.length < 2)
      return null; 
    String str = String.format("%d %d", new Object[] { Short.valueOf((short)arrayOfInt[0]), Short.valueOf((short)arrayOfInt[1]) });
    if (str.equals("0 0"))
      return "Off"; 
    if (str.equals("1 0"))
      return "On"; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Unknown (");
    stringBuilder.append(str);
    stringBuilder.append(")");
    return stringBuilder.toString();
  }
  
  public String e() {
    int[] arrayOfInt2 = ((b0)this.a).j(4613);
    int[] arrayOfInt1 = arrayOfInt2;
    if (arrayOfInt2 == null) {
      Integer integer = ((b0)this.a).k(4613);
      if (integer == null)
        return null; 
      arrayOfInt1 = new int[] { integer.intValue() };
    } 
    if (arrayOfInt1.length == 0)
      return null; 
    String str2 = String.format("%d", new Object[] { Short.valueOf((short)arrayOfInt1[0]) });
    String str1 = str2;
    if (arrayOfInt1.length > 1) {
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append(str2);
      stringBuilder1.append(" ");
      stringBuilder1.append(String.format("%d", new Object[] { Short.valueOf((short)arrayOfInt1[1]) }));
      str1 = stringBuilder1.toString();
    } 
    if (str1.equals("0"))
      return "Off"; 
    if (str1.equals("1"))
      return "On"; 
    if (str1.equals("0 0"))
      return "Off"; 
    if (str1.equals("1 0"))
      return "On"; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Unknown (");
    stringBuilder.append(str1);
    stringBuilder.append(")");
    return stringBuilder.toString();
  }
  
  public String f() {
    m m = ((b0)this.a).n(773);
    if (m == null)
      return "inf"; 
    if (m.b() != 4294967295L) {
      if (m.b() == 0L)
        return "inf"; 
      StringBuilder stringBuilder = new StringBuilder();
      double d = m.b();
      Double.isNaN(d);
      stringBuilder.append(d / 1000.0D);
      stringBuilder.append(" m");
      return stringBuilder.toString();
    } 
    return "inf";
  }
  
  public String g() {
    return b(0, 4);
  }
  
  public String h() {
    String str;
    byte[] arrayOfByte = ((b0)this.a).d(5632);
    if (arrayOfByte == null)
      return null; 
    if ((arrayOfByte[0] | arrayOfByte[1] | arrayOfByte[2] | arrayOfByte[3]) == 0)
      return "Off"; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("On, ");
    if ((arrayOfByte[43] & 0x1) > 0) {
      str = "Mode 1";
    } else {
      str = "Mode 2";
    } 
    stringBuilder.append(str);
    return stringBuilder.toString();
  }
  
  public String i() {
    return a(4618, new String[] { "Off", "On" });
  }
  
  public String j() {
    int[] arrayOfInt = ((b0)this.a).j(4617);
    if (arrayOfInt == null)
      return null; 
    if ((short)arrayOfInt[0] == 0)
      return "Off"; 
    if ((short)arrayOfInt[1] == 1)
      return "Full"; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("On (1/");
    stringBuilder.append((short)arrayOfInt[1]);
    stringBuilder.append(" strength)");
    return stringBuilder.toString();
  }
  
  public String k() {
    return ((b0)this.a).p(5376);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/o/a0/a0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */