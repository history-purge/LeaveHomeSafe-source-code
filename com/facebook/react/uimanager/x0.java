package com.facebook.react.uimanager;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class x0 {
  private final ViewGroup a;
  
  private int b = 0;
  
  private int[] c;
  
  public x0(ViewGroup paramViewGroup) {
    this.a = paramViewGroup;
  }
  
  public int a(int paramInt1, int paramInt2) {
    if (this.c == null) {
      ArrayList<View> arrayList = new ArrayList();
      boolean bool = false;
      int i;
      for (i = 0; i < paramInt1; i++)
        arrayList.add(this.a.getChildAt(i)); 
      Collections.sort(arrayList, new a(this));
      this.c = new int[paramInt1];
      for (i = bool; i < paramInt1; i++) {
        View view = arrayList.get(i);
        this.c[i] = this.a.indexOfChild(view);
      } 
    } 
    return this.c[paramInt2];
  }
  
  public void a(View paramView) {
    if (ViewGroupManager.getViewZIndex(paramView) != null)
      this.b++; 
    this.c = null;
  }
  
  public boolean a() {
    return (this.b > 0);
  }
  
  public void b() {
    int i = 0;
    this.b = 0;
    while (i < this.a.getChildCount()) {
      if (ViewGroupManager.getViewZIndex(this.a.getChildAt(i)) != null)
        this.b++; 
      i++;
    } 
    this.c = null;
  }
  
  public void b(View paramView) {
    if (ViewGroupManager.getViewZIndex(paramView) != null)
      this.b--; 
    this.c = null;
  }
  
  class a implements Comparator<View> {
    a(x0 this$0) {}
    
    public int a(View param1View1, View param1View2) {
      Integer integer4 = ViewGroupManager.getViewZIndex(param1View1);
      Integer integer1 = Integer.valueOf(0);
      Integer integer3 = integer4;
      if (integer4 == null)
        integer3 = integer1; 
      integer4 = ViewGroupManager.getViewZIndex(param1View2);
      Integer integer2 = integer4;
      if (integer4 == null)
        integer2 = integer1; 
      return integer3.intValue() - integer2.intValue();
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/uimanager/x0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */