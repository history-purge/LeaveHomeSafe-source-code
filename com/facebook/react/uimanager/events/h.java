package com.facebook.react.uimanager.events;

import android.util.SparseIntArray;

public class h {
  private final SparseIntArray a = new SparseIntArray();
  
  public void a(long paramLong) {
    this.a.put((int)paramLong, 0);
  }
  
  public short b(long paramLong) {
    int i = this.a.get((int)paramLong, -1);
    if (i != -1)
      return (short)(0xFFFF & i); 
    throw new RuntimeException("Tried to get non-existent cookie");
  }
  
  public boolean c(long paramLong) {
    return !(this.a.get((int)paramLong, -1) == -1);
  }
  
  public void d(long paramLong) {
    SparseIntArray sparseIntArray = this.a;
    int i = (int)paramLong;
    int j = sparseIntArray.get(i, -1);
    if (j != -1) {
      this.a.put(i, j + 1);
      return;
    } 
    throw new RuntimeException("Tried to increment non-existent cookie");
  }
  
  public void e(long paramLong) {
    this.a.delete((int)paramLong);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/uimanager/events/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */