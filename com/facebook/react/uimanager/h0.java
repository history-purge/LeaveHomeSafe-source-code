package com.facebook.react.uimanager;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.facebook.react.common.g;

public class h0 {
  private final SparseArray<a0> a = new SparseArray();
  
  private final SparseBooleanArray b = new SparseBooleanArray();
  
  private final g c = new g();
  
  public int a() {
    this.c.a();
    return this.b.size();
  }
  
  public a0 a(int paramInt) {
    this.c.a();
    return (a0)this.a.get(paramInt);
  }
  
  public void a(a0 parama0) {
    this.c.a();
    this.a.put(parama0.t(), parama0);
  }
  
  public int b(int paramInt) {
    this.c.a();
    return this.b.keyAt(paramInt);
  }
  
  public void b(a0 parama0) {
    this.c.a();
    int i = parama0.t();
    this.a.put(i, parama0);
    this.b.put(i, true);
  }
  
  public boolean c(int paramInt) {
    this.c.a();
    return this.b.get(paramInt);
  }
  
  public void d(int paramInt) {
    this.c.a();
    if (!this.b.get(paramInt)) {
      this.a.remove(paramInt);
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Trying to remove root node ");
    stringBuilder.append(paramInt);
    stringBuilder.append(" without using removeRootNode!");
    throw new g(stringBuilder.toString());
  }
  
  public void e(int paramInt) {
    this.c.a();
    if (paramInt == -1)
      return; 
    if (this.b.get(paramInt)) {
      this.a.remove(paramInt);
      this.b.delete(paramInt);
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("View with tag ");
    stringBuilder.append(paramInt);
    stringBuilder.append(" is not registered as a root view");
    throw new g(stringBuilder.toString());
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/uimanager/h0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */