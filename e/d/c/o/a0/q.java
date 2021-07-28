package e.d.c.o.a0;

import e.d.c.j;

public class q extends j<r> {
  public q(r paramr) {
    super(paramr);
  }
  
  public String a() {
    byte[] arrayOfByte = ((r)this.a).d(1037);
    if (arrayOfByte == null || arrayOfByte.length < 4)
      return null; 
    String str = String.format("%d %d %d %d", new Object[] { Byte.valueOf(arrayOfByte[0]), Byte.valueOf(arrayOfByte[1]), Byte.valueOf(arrayOfByte[2]), Byte.valueOf(arrayOfByte[3]) });
    return str.equals("0 0 0 0") ? "Program AE" : (str.equals("1 0 0 0") ? "Aperture-priority AE" : (str.equals("1 1 0 0") ? "Aperture-priority AE (1)" : (str.equals("2 0 0 0") ? "Shutter speed priority AE" : (str.equals("3 0 0 0") ? "Manual" : String.format("Unknown (%s)", new Object[] { str })))));
  }
  
  public String c(int paramInt) {
    return (paramInt != 1037) ? super.c(paramInt) : a();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/o/a0/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */