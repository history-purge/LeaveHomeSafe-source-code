package e.f.a.c.i.a0;

import android.util.SparseArray;
import e.f.a.c.d;
import java.util.HashMap;

public final class a {
  private static SparseArray<d> a = new SparseArray();
  
  private static HashMap<d, Integer> b = new HashMap<d, Integer>();
  
  static {
    b.put(d.c, Integer.valueOf(0));
    b.put(d.d, Integer.valueOf(1));
    b.put(d.e, Integer.valueOf(2));
    for (d d : b.keySet())
      a.append(((Integer)b.get(d)).intValue(), d); 
  }
  
  public static int a(d paramd) {
    Integer integer = b.get(paramd);
    if (integer != null)
      return integer.intValue(); 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("PriorityMapping is missing known Priority value ");
    stringBuilder.append(paramd);
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  public static d a(int paramInt) {
    d d = (d)a.get(paramInt);
    if (d != null)
      return d; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Unknown Priority for value ");
    stringBuilder.append(paramInt);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/c/i/a0/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */