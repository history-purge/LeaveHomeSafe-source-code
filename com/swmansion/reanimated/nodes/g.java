package com.swmansion.reanimated.nodes;

import com.facebook.react.bridge.ReadableMap;
import com.swmansion.reanimated.b;
import com.swmansion.reanimated.e;
import java.text.NumberFormat;
import java.util.Locale;

public class g extends m {
  private static final NumberFormat b = NumberFormat.getInstance(Locale.ENGLISH);
  
  private final int[] a;
  
  static {
    b.setMinimumFractionDigits(0);
    b.setGroupingUsed(false);
  }
  
  public g(int paramInt, ReadableMap paramReadableMap, b paramb) {
    super(paramInt, paramReadableMap, paramb);
    this.a = e.a(paramReadableMap.getArray("input"));
  }
  
  protected String evaluate() {
    StringBuilder stringBuilder = new StringBuilder();
    int i = 0;
    while (true) {
      int[] arrayOfInt = this.a;
      if (i < arrayOfInt.length) {
        Object object2 = this.mNodesManager.a(arrayOfInt[i], m.class).value();
        Object object1 = object2;
        if (object2 instanceof Double)
          object1 = b.format(object2); 
        stringBuilder.append(object1);
        i++;
        continue;
      } 
      return stringBuilder.toString();
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/swmansion/reanimated/nodes/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */