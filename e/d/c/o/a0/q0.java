package e.d.c.o.a0;

import e.d.c.h;
import e.d.c.j;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class q0 extends j<r0> {
  public q0(r0 paramr0) {
    super(paramr0);
  }
  
  public String c(int paramInt) {
    Double double_;
    h h;
    String str;
    int[] arrayOfInt;
    DecimalFormat decimalFormat;
    switch (paramInt) {
      default:
        return super.c(paramInt);
      case 86:
        return ((r0)this.a).p(paramInt);
      case 84:
        double_ = ((r0)this.a).g(paramInt);
        decimalFormat = new DecimalFormat("0.000");
        return (double_ == null) ? null : decimalFormat.format(double_);
      case 82:
        return String.format("%d", new Object[] { ((r0)this.a).k(paramInt) });
      case 80:
        return a(paramInt, new String[] { "Off", "On" });
      case 72:
      case 74:
      case 76:
      case 78:
        return String.format("%d", new Object[] { ((r0)this.a).k(paramInt) });
      case 42:
        h = ((r0)this.a).r(paramInt);
        return (h == null) ? null : h.toString();
      case 38:
      case 40:
        return String.format("%d", new Object[] { ((r0)this.a).k(paramInt) });
      case 36:
        return a(paramInt, new String[] { "New", "Waxing Crescent", "First Quarter", "Waxing Gibbous", "Full", "Waning Gibbous", "Last Quarter", "Waning Crescent" });
      case 22:
        str = ((r0)this.a).p(paramInt);
        try {
          SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
          return simpleDateFormat.format(simpleDateFormat.parse(str));
        } catch (ParseException parseException) {
          return null;
        } 
      case 18:
        return String.format("%d", new Object[] { ((r0)this.a).k(paramInt) });
      case 14:
        arrayOfInt = ((r0)this.a).j(paramInt);
        return (arrayOfInt == null) ? null : String.format("%d/%d", new Object[] { Integer.valueOf(arrayOfInt[0]), Integer.valueOf(arrayOfInt[1]) });
      case 12:
        return ((r0)this.a).p(paramInt);
      case 2:
        return ((r0)this.a).p(paramInt);
      case 0:
        break;
    } 
    return String.format("%d", new Object[] { ((r0)this.a).k(paramInt) });
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/o/a0/q0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */