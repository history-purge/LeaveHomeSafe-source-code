package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.view.View;

public class i extends o {
  private k d;
  
  private k e;
  
  private float a(RecyclerView.o paramo, k paramk) {
    int i1 = paramo.e();
    if (i1 == 0)
      return 1.0F; 
    int n = 0;
    View view1 = null;
    View view2 = null;
    int j = Integer.MAX_VALUE;
    int m;
    for (m = Integer.MIN_VALUE; n < i1; m = i3) {
      int i3;
      View view4;
      View view3 = paramo.d(n);
      int i2 = paramo.l(view3);
      if (i2 == -1) {
        view4 = view1;
        i3 = m;
      } else {
        int i4 = j;
        if (i2 < j) {
          view1 = view3;
          i4 = i2;
        } 
        view4 = view1;
        j = i4;
        i3 = m;
        if (i2 > m) {
          view2 = view3;
          i3 = i2;
          j = i4;
          view4 = view1;
        } 
      } 
      n++;
      view1 = view4;
    } 
    if (view1 != null) {
      if (view2 == null)
        return 1.0F; 
      int i2 = Math.min(paramk.d(view1), paramk.d(view2));
      i2 = Math.max(paramk.a(view1), paramk.a(view2)) - i2;
      return (i2 == 0) ? 1.0F : (i2 * 1.0F / (m - j + 1));
    } 
    return 1.0F;
  }
  
  private int a(RecyclerView.o paramo, View paramView, k paramk) {
    return paramk.d(paramView) + paramk.b(paramView) / 2 - paramk.f() + paramk.g() / 2;
  }
  
  private int a(RecyclerView.o paramo, k paramk, int paramInt1, int paramInt2) {
    int[] arrayOfInt = b(paramInt1, paramInt2);
    float f = a(paramo, paramk);
    if (f <= 0.0F)
      return 0; 
    if (Math.abs(arrayOfInt[0]) > Math.abs(arrayOfInt[1])) {
      paramInt1 = arrayOfInt[0];
    } else {
      paramInt1 = arrayOfInt[1];
    } 
    return Math.round(paramInt1 / f);
  }
  
  private View b(RecyclerView.o paramo, k paramk) {
    int n = paramo.e();
    View view = null;
    if (n == 0)
      return null; 
    int i1 = paramk.f();
    int i2 = paramk.g() / 2;
    int m = Integer.MAX_VALUE;
    int j = 0;
    while (j < n) {
      View view1 = paramo.d(j);
      int i4 = Math.abs(paramk.d(view1) + paramk.b(view1) / 2 - i1 + i2);
      int i3 = m;
      if (i4 < m) {
        view = view1;
        i3 = i4;
      } 
      j++;
      m = i3;
    } 
    return view;
  }
  
  private k d(RecyclerView.o paramo) {
    k k1 = this.e;
    if (k1 == null || k1.a != paramo)
      this.e = k.a(paramo); 
    return this.e;
  }
  
  private k e(RecyclerView.o paramo) {
    k k1 = this.d;
    if (k1 == null || k1.a != paramo)
      this.d = k.b(paramo); 
    return this.d;
  }
  
  public int a(RecyclerView.o paramo, int paramInt1, int paramInt2) {
    if (!(paramo instanceof RecyclerView.z.b))
      return -1; 
    int m = paramo.j();
    if (m == 0)
      return -1; 
    View view = c(paramo);
    if (view == null)
      return -1; 
    int n = paramo.l(view);
    if (n == -1)
      return -1; 
    RecyclerView.z.b b = (RecyclerView.z.b)paramo;
    int j = m - 1;
    PointF pointF = b.a(j);
    if (pointF == null)
      return -1; 
    if (paramo.a()) {
      int i1 = a(paramo, d(paramo), paramInt1, 0);
      paramInt1 = i1;
      if (pointF.x < 0.0F)
        paramInt1 = -i1; 
    } else {
      paramInt1 = 0;
    } 
    if (paramo.b()) {
      int i1 = a(paramo, e(paramo), 0, paramInt2);
      paramInt2 = i1;
      if (pointF.y < 0.0F)
        paramInt2 = -i1; 
    } else {
      paramInt2 = 0;
    } 
    if (paramo.b())
      paramInt1 = paramInt2; 
    if (paramInt1 == 0)
      return -1; 
    paramInt2 = n + paramInt1;
    paramInt1 = paramInt2;
    if (paramInt2 < 0)
      paramInt1 = 0; 
    paramInt2 = paramInt1;
    if (paramInt1 >= m)
      paramInt2 = j; 
    return paramInt2;
  }
  
  public int[] a(RecyclerView.o paramo, View paramView) {
    int[] arrayOfInt = new int[2];
    if (paramo.a()) {
      arrayOfInt[0] = a(paramo, paramView, d(paramo));
    } else {
      arrayOfInt[0] = 0;
    } 
    if (paramo.b()) {
      arrayOfInt[1] = a(paramo, paramView, e(paramo));
      return arrayOfInt;
    } 
    arrayOfInt[1] = 0;
    return arrayOfInt;
  }
  
  public View c(RecyclerView.o paramo) {
    if (paramo.b()) {
      k k1 = e(paramo);
      return b(paramo, k1);
    } 
    if (paramo.a()) {
      k k1 = d(paramo);
      return b(paramo, k1);
    } 
    return null;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/recyclerview/widget/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */