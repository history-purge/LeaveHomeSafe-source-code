package net.time4j.calendar.s;

class a {
  static int a(double paramDouble) {
    long l = Double.doubleToLongBits(paramDouble);
    return (int)(l ^ l >>> 32L);
  }
  
  static double b(double paramDouble) {
    double d;
    while (true) {
      d = paramDouble;
      if (Double.compare(0.0D, paramDouble) > 0) {
        paramDouble += 360.0D;
        continue;
      } 
      break;
    } 
    while (Double.compare(d, 360.0D) >= 0)
      d -= 360.0D; 
    return d;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/calendar/s/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */