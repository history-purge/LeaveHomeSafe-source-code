package androidx.recyclerview.widget;

import android.view.View;

class m {
  static int a(RecyclerView.a0 parama0, k paramk, View paramView1, View paramView2, RecyclerView.o paramo, boolean paramBoolean) {
    if (paramo.e() == 0 || parama0.a() == 0 || paramView1 == null || paramView2 == null)
      return 0; 
    if (!paramBoolean)
      return Math.abs(paramo.l(paramView1) - paramo.l(paramView2)) + 1; 
    int i = paramk.a(paramView2);
    int j = paramk.d(paramView1);
    return Math.min(paramk.g(), i - j);
  }
  
  static int a(RecyclerView.a0 parama0, k paramk, View paramView1, View paramView2, RecyclerView.o paramo, boolean paramBoolean1, boolean paramBoolean2) {
    if (paramo.e() != 0 && parama0.a() != 0 && paramView1 != null) {
      if (paramView2 == null)
        return 0; 
      int i = Math.min(paramo.l(paramView1), paramo.l(paramView2));
      int j = Math.max(paramo.l(paramView1), paramo.l(paramView2));
      if (paramBoolean2) {
        i = Math.max(0, parama0.a() - j - 1);
      } else {
        i = Math.max(0, i);
      } 
      if (!paramBoolean1)
        return i; 
      j = Math.abs(paramk.a(paramView2) - paramk.d(paramView1));
      int n = Math.abs(paramo.l(paramView1) - paramo.l(paramView2));
      float f = j / (n + 1);
      return Math.round(i * f + (paramk.f() - paramk.d(paramView1)));
    } 
    return 0;
  }
  
  static int b(RecyclerView.a0 parama0, k paramk, View paramView1, View paramView2, RecyclerView.o paramo, boolean paramBoolean) {
    if (paramo.e() == 0 || parama0.a() == 0 || paramView1 == null || paramView2 == null)
      return 0; 
    if (!paramBoolean)
      return parama0.a(); 
    int i = paramk.a(paramView2);
    int j = paramk.d(paramView1);
    int n = Math.abs(paramo.l(paramView1) - paramo.l(paramView2));
    return (int)((i - j) / (n + 1) * parama0.a());
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/recyclerview/widget/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */