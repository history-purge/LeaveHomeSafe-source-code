package e.d.c.o.a0;

import e.d.b.m;
import e.d.c.j;

public class k0 extends j<l0> {
  public k0(l0 paraml0) {
    super(paraml0);
  }
  
  public String a() {
    int[] arrayOfInt = ((l0)this.a).j(512);
    if (arrayOfInt == null)
      return null; 
    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < arrayOfInt.length; i++) {
      stringBuilder.append((short)arrayOfInt[i]);
      if (i < arrayOfInt.length - 1)
        stringBuilder.append(" "); 
    } 
    return (stringBuilder.length() == 0) ? null : stringBuilder.toString();
  }
  
  public String b() {
    Integer integer = ((l0)this.a).k(4096);
    if (integer == null)
      return null; 
    short s = integer.shortValue();
    if (s != 0) {
      if (s != 20) {
        if (s != 22) {
          if (s != 256) {
            if (s != 512) {
              StringBuilder stringBuilder;
              switch (s) {
                default:
                  switch (s) {
                    default:
                      stringBuilder = new StringBuilder();
                      stringBuilder.append("Unknown (");
                      stringBuilder.append(integer);
                      stringBuilder.append(")");
                      return stringBuilder.toString();
                    case 36:
                      return "White Fluorescent";
                    case 35:
                      return "Cool White Fluorescent";
                    case 34:
                      return "Day White Fluorescent";
                    case 33:
                      break;
                  } 
                  return "Daylight Fluorescent";
                case 18:
                  return "Fine Weather";
                case 17:
                  return "Cloudy";
                case 16:
                  break;
              } 
              return "Shade";
            } 
            return "Custom 1-4";
          } 
          return "One Touch White Balance";
        } 
        return "Evening Sunlight";
      } 
      return "Tungsten (Incandescent)";
    } 
    return "Unknown";
  }
  
  public String c() {
    int[] arrayOfInt = ((l0)this.a).j(1537);
    if (arrayOfInt == null)
      return null; 
    m[] arrayOfM = new m[arrayOfInt.length / 2];
    boolean bool = false;
    int i;
    for (i = 0; i < arrayOfInt.length / 2; i++) {
      int k = i * 2;
      arrayOfM[i] = new m((short)arrayOfInt[k], (short)arrayOfInt[k + 1]);
    } 
    StringBuilder stringBuilder = new StringBuilder();
    for (i = bool; i < arrayOfM.length; i++) {
      stringBuilder.append(arrayOfM[i].doubleValue());
      if (i < arrayOfM.length - 1)
        stringBuilder.append(" "); 
    } 
    return (stringBuilder.length() == 0) ? null : stringBuilder.toString();
  }
  
  public String c(int paramInt) {
    return (paramInt != 0) ? ((paramInt != 512) ? ((paramInt != 1537) ? ((paramInt != 4096) ? super.c(paramInt) : b()) : c()) : a()) : b(0, 4);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/o/a0/k0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */