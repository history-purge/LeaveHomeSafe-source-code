package androidx.core.widget;

import android.view.View;
import android.widget.ListView;

public class f extends a {
  private final ListView u;
  
  public f(ListView paramListView) {
    super((View)paramListView);
    this.u = paramListView;
  }
  
  public void a(int paramInt1, int paramInt2) {
    g.b(this.u, paramInt2);
  }
  
  public boolean a(int paramInt) {
    return false;
  }
  
  public boolean b(int paramInt) {
    ListView listView = this.u;
    int i = listView.getCount();
    if (i == 0)
      return false; 
    int j = listView.getChildCount();
    int k = listView.getFirstVisiblePosition();
    if (paramInt > 0) {
      if (k + j >= i && listView.getChildAt(j - 1).getBottom() <= listView.getHeight())
        return false; 
    } else {
      return (paramInt < 0) ? (!(k <= 0 && listView.getChildAt(0).getTop() >= 0)) : false;
    } 
    return true;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/core/widget/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */