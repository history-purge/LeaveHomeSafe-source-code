package e.f.a.e.n;

import android.util.SparseIntArray;

public final class h {
  private static final Object c = new Object();
  
  private static int d;
  
  private final SparseIntArray a = new SparseIntArray();
  
  private final SparseIntArray b = new SparseIntArray();
  
  public final int a(int paramInt) {
    synchronized (c) {
      int i = this.a.get(paramInt, -1);
      if (i != -1)
        return i; 
      i = d;
      d++;
      this.a.append(paramInt, i);
      this.b.append(i, paramInt);
      return i;
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/n/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */