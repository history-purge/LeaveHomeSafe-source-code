package net.time4j.e1;

import java.util.Collections;
import java.util.HashMap;
import net.time4j.d1.e;

public abstract class d<V extends Comparable<V>> extends e<V> {
  static {
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    hashMap.put("YEAR_OF_DISPLAY", "L_year");
    hashMap.put("MONTH_AS_NUMBER", "L_month");
    hashMap.put("HOUR_FROM_0_TO_24", "L_hour");
    hashMap.put("DAY_OF_MONTH", "L_day");
    Collections.unmodifiableMap(hashMap);
  }
  
  protected d(String paramString) {
    super(paramString);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/e1/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */