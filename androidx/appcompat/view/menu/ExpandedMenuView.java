package androidx.appcompat.view.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.widget.x0;

public final class ExpandedMenuView extends ListView implements g.b, o, AdapterView.OnItemClickListener {
  private static final int[] e = new int[] { 16842964, 16843049 };
  
  private g c;
  
  private int d;
  
  public ExpandedMenuView(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, 16842868);
  }
  
  public ExpandedMenuView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet);
    setOnItemClickListener(this);
    x0 x0 = x0.a(paramContext, paramAttributeSet, e, paramInt, 0);
    if (x0.g(0))
      setBackgroundDrawable(x0.b(0)); 
    if (x0.g(1))
      setDivider(x0.b(1)); 
    x0.b();
  }
  
  public void a(g paramg) {
    this.c = paramg;
  }
  
  public boolean a(j paramj) {
    return this.c.a((MenuItem)paramj, 0);
  }
  
  public int getWindowAnimations() {
    return this.d;
  }
  
  protected void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    setChildrenDrawingCacheEnabled(false);
  }
  
  public void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong) {
    a((j)getAdapter().getItem(paramInt));
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/appcompat/view/menu/ExpandedMenuView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */