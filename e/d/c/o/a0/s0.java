package e.d.c.o.a0;

import e.d.c.h;
import e.d.c.j;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class s0 extends j<t0> {
  public s0(t0 paramt0) {
    super(paramt0);
  }
  
  public String c(int paramInt) {
    h h;
    Double double_;
    String str;
    int[] arrayOfInt;
    DecimalFormat decimalFormat;
    switch (paramInt) {
      default:
        return super.c(paramInt);
      case 80:
        return ((t0)this.a).p(paramInt);
      case 75:
        h = ((t0)this.a).r(paramInt);
        return (h == null) ? null : h.toString();
      case 73:
        double_ = ((t0)this.a).g(paramInt);
        decimalFormat = new DecimalFormat("0.000");
        return (double_ == null) ? null : decimalFormat.format(double_);
      case 72:
        return a(paramInt, new String[] { "Off", "On" });
      case 68:
      case 70:
        return String.format("%d", new Object[] { ((t0)this.a).k(paramInt) });
      case 67:
        return a(paramInt, new String[] { "New", "Waxing Crescent", "First Quarter", "Waxing Gibbous", "Full", "Waning Gibbous", "Last Quarter", "Waning Crescent" });
      case 59:
        str = ((t0)this.a).p(paramInt);
        try {
          SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
          return simpleDateFormat.format(simpleDateFormat.parse(str));
        } catch (ParseException parseException) {
          return null;
        } 
      case 55:
        return String.format("%d", new Object[] { ((t0)this.a).k(paramInt) });
      case 53:
        arrayOfInt = ((t0)this.a).j(paramInt);
        return (arrayOfInt == null) ? null : String.format("%d/%d", new Object[] { Integer.valueOf(arrayOfInt[0]), Integer.valueOf(arrayOfInt[1]) });
      case 24:
      case 31:
      case 38:
      case 45:
      case 52:
        return ((t0)this.a).p(paramInt);
      case 22:
        return String.format("%d", new Object[] { ((t0)this.a).k(paramInt) });
      case 18:
        return String.format("0x%08X", new Object[] { ((t0)this.a).k(paramInt) });
      case 14:
        return String.format("%d", new Object[] { ((t0)this.a).k(paramInt) });
      case 10:
        return String.format("0x%08X", new Object[] { ((t0)this.a).k(paramInt) });
      case 0:
        break;
    } 
    return ((t0)this.a).p(paramInt);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/o/a0/s0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */