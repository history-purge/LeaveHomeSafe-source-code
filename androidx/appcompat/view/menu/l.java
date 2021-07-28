package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

abstract class l implements q, n, AdapterView.OnItemClickListener {
  private Rect c;
  
  protected static int a(ListAdapter paramListAdapter, ViewGroup paramViewGroup, Context paramContext, int paramInt) {
    int j = 0;
    int m = View.MeasureSpec.makeMeasureSpec(0, 0);
    int i1 = View.MeasureSpec.makeMeasureSpec(0, 0);
    int i2 = paramListAdapter.getCount();
    ViewGroup viewGroup = paramViewGroup;
    paramViewGroup = null;
    int i = 0;
    int k = 0;
    while (j < i2) {
      FrameLayout frameLayout2;
      int i4 = paramListAdapter.getItemViewType(j);
      int i3 = k;
      if (i4 != k) {
        paramViewGroup = null;
        i3 = i4;
      } 
      ViewGroup viewGroup1 = viewGroup;
      if (viewGroup == null)
        frameLayout2 = new FrameLayout(paramContext); 
      View view = paramListAdapter.getView(j, (View)paramViewGroup, (ViewGroup)frameLayout2);
      view.measure(m, i1);
      k = view.getMeasuredWidth();
      if (k >= paramInt)
        return paramInt; 
      i4 = i;
      if (k > i)
        i4 = k; 
      j++;
      k = i3;
      FrameLayout frameLayout1 = frameLayout2;
      i = i4;
    } 
    return i;
  }
  
  protected static f a(ListAdapter paramListAdapter) {
    return (paramListAdapter instanceof HeaderViewListAdapter) ? (f)((HeaderViewListAdapter)paramListAdapter).getWrappedAdapter() : (f)paramListAdapter;
  }
  
  protected static boolean b(g paramg) {
    int j = paramg.size();
    for (int i = 0; i < j; i++) {
      MenuItem menuItem = paramg.getItem(i);
      if (menuItem.isVisible() && menuItem.getIcon() != null)
        return true; 
    } 
    return false;
  }
  
  public abstract void a(int paramInt);
  
  public void a(Context paramContext, g paramg) {}
  
  public void a(Rect paramRect) {
    this.c = paramRect;
  }
  
  public abstract void a(View paramView);
  
  public abstract void a(PopupWindow.OnDismissListener paramOnDismissListener);
  
  public abstract void a(g paramg);
  
  public boolean a(g paramg, j paramj) {
    return false;
  }
  
  public abstract void b(int paramInt);
  
  public abstract void b(boolean paramBoolean);
  
  public boolean b(g paramg, j paramj) {
    return false;
  }
  
  public abstract void c(int paramInt);
  
  public abstract void c(boolean paramBoolean);
  
  protected boolean d() {
    return true;
  }
  
  public Rect f() {
    return this.c;
  }
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong) {
    ListAdapter listAdapter = (ListAdapter)paramAdapterView.getAdapter();
    g g = (a(listAdapter)).c;
    MenuItem menuItem = (MenuItem)listAdapter.getItem(paramInt);
    if (d()) {
      paramInt = 0;
    } else {
      paramInt = 4;
    } 
    g.a(menuItem, this, paramInt);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/appcompat/view/menu/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */