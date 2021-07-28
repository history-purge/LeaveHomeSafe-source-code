package b.r;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.ArrayList;

@SuppressLint({"ViewConstructor"})
class j extends FrameLayout {
  private ViewGroup c;
  
  private boolean d;
  
  j(ViewGroup paramViewGroup) {
    super(paramViewGroup.getContext());
    setClipChildren(false);
    this.c = paramViewGroup;
    this.c.setTag(s.ghost_view_holder, this);
    j0.a(this.c).a((View)this);
    this.d = true;
  }
  
  private int a(ArrayList<View> paramArrayList) {
    ArrayList<View> arrayList = new ArrayList();
    int i = getChildCount() - 1;
    int k = 0;
    while (k <= i) {
      int m = (k + i) / 2;
      a(((l)getChildAt(m)).e, arrayList);
      if (a(paramArrayList, arrayList)) {
        k = m + 1;
      } else {
        i = m - 1;
      } 
      arrayList.clear();
    } 
    return k;
  }
  
  static j a(ViewGroup paramViewGroup) {
    return (j)paramViewGroup.getTag(s.ghost_view_holder);
  }
  
  private static void a(View paramView, ArrayList<View> paramArrayList) {
    ViewParent viewParent = paramView.getParent();
    if (viewParent instanceof ViewGroup)
      a((View)viewParent, paramArrayList); 
    paramArrayList.add(paramView);
  }
  
  private static boolean a(View paramView1, View paramView2) {
    ViewGroup viewGroup = (ViewGroup)paramView1.getParent();
    int k = viewGroup.getChildCount();
    int i = Build.VERSION.SDK_INT;
    boolean bool = false;
    if (i >= 21 && paramView1.getZ() != paramView2.getZ()) {
      if (paramView1.getZ() > paramView2.getZ())
        bool = true; 
      return bool;
    } 
    for (i = 0; i < k; i++) {
      View view = viewGroup.getChildAt(j0.a(viewGroup, i));
      if (view == paramView1)
        return false; 
      if (view == paramView2)
        return true; 
    } 
    return true;
  }
  
  private static boolean a(ArrayList<View> paramArrayList1, ArrayList<View> paramArrayList2) {
    if (!paramArrayList1.isEmpty() && !paramArrayList2.isEmpty()) {
      boolean bool = false;
      if (paramArrayList1.get(0) != paramArrayList2.get(0))
        return true; 
      int k = Math.min(paramArrayList1.size(), paramArrayList2.size());
      for (int i = 1; i < k; i++) {
        View view1 = paramArrayList1.get(i);
        View view2 = paramArrayList2.get(i);
        if (view1 != view2)
          return a(view1, view2); 
      } 
      if (paramArrayList2.size() == k)
        bool = true; 
      return bool;
    } 
    return true;
  }
  
  void a() {
    if (this.d) {
      j0.a(this.c).b((View)this);
      j0.a(this.c).a((View)this);
      return;
    } 
    throw new IllegalStateException("This GhostViewHolder is detached!");
  }
  
  void a(l paraml) {
    ArrayList<View> arrayList = new ArrayList();
    a(paraml.e, arrayList);
    int i = a(arrayList);
    if (i < 0 || i >= getChildCount()) {
      addView((View)paraml);
      return;
    } 
    addView((View)paraml, i);
  }
  
  public void onViewAdded(View paramView) {
    if (this.d) {
      super.onViewAdded(paramView);
      return;
    } 
    throw new IllegalStateException("This GhostViewHolder is detached!");
  }
  
  public void onViewRemoved(View paramView) {
    super.onViewRemoved(paramView);
    if ((getChildCount() == 1 && getChildAt(0) == paramView) || getChildCount() == 0) {
      this.c.setTag(s.ghost_view_holder, null);
      j0.a(this.c).b((View)this);
      this.d = false;
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/r/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */