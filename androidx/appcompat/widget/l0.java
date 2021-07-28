package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.j;
import java.lang.reflect.Method;

public class l0 extends j0 implements k0 {
  private static Method L;
  
  private k0 K;
  
  static {
    try {
      if (Build.VERSION.SDK_INT <= 28) {
        Class<boolean> clazz = boolean.class;
        L = PopupWindow.class.getDeclaredMethod("setTouchModal", new Class[] { clazz });
        return;
      } 
    } catch (NoSuchMethodException noSuchMethodException) {
      Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
    } 
  }
  
  public l0(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2) {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
  }
  
  f0 a(Context paramContext, boolean paramBoolean) {
    a a = new a(paramContext, paramBoolean);
    a.setHoverListener(this);
    return a;
  }
  
  public void a(g paramg, MenuItem paramMenuItem) {
    k0 k01 = this.K;
    if (k01 != null)
      k01.a(paramg, paramMenuItem); 
  }
  
  public void a(k0 paramk0) {
    this.K = paramk0;
  }
  
  public void a(Object paramObject) {
    if (Build.VERSION.SDK_INT >= 23)
      this.G.setEnterTransition((Transition)paramObject); 
  }
  
  public void b(g paramg, MenuItem paramMenuItem) {
    k0 k01 = this.K;
    if (k01 != null)
      k01.b(paramg, paramMenuItem); 
  }
  
  public void b(Object paramObject) {
    if (Build.VERSION.SDK_INT >= 23)
      this.G.setExitTransition((Transition)paramObject); 
  }
  
  public void c(boolean paramBoolean) {
    if (Build.VERSION.SDK_INT <= 28) {
      Method method = L;
      if (method != null)
        try {
          method.invoke(this.G, new Object[] { Boolean.valueOf(paramBoolean) });
          return;
        } catch (Exception exception) {
          Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
          return;
        }  
    } else {
      this.G.setTouchModal(paramBoolean);
    } 
  }
  
  public static class a extends f0 {
    final int q;
    
    final int r;
    
    private k0 s;
    
    private MenuItem t;
    
    public a(Context param1Context, boolean param1Boolean) {
      super(param1Context, param1Boolean);
      Configuration configuration = param1Context.getResources().getConfiguration();
      if (Build.VERSION.SDK_INT >= 17 && 1 == configuration.getLayoutDirection()) {
        this.q = 21;
        this.r = 22;
        return;
      } 
      this.q = 22;
      this.r = 21;
    }
    
    public boolean onHoverEvent(MotionEvent param1MotionEvent) {
      if (this.s != null) {
        int i;
        j j;
        ListAdapter listAdapter1 = getAdapter();
        if (listAdapter1 instanceof HeaderViewListAdapter) {
          HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter)listAdapter1;
          i = headerViewListAdapter.getHeadersCount();
          listAdapter1 = headerViewListAdapter.getWrappedAdapter();
        } else {
          i = 0;
        } 
        f f = (f)listAdapter1;
        ListAdapter listAdapter2 = null;
        listAdapter1 = listAdapter2;
        if (param1MotionEvent.getAction() != 10) {
          int k = pointToPosition((int)param1MotionEvent.getX(), (int)param1MotionEvent.getY());
          listAdapter1 = listAdapter2;
          if (k != -1) {
            i = k - i;
            listAdapter1 = listAdapter2;
            if (i >= 0) {
              listAdapter1 = listAdapter2;
              if (i < f.getCount())
                j = f.getItem(i); 
            } 
          } 
        } 
        MenuItem menuItem = this.t;
        if (menuItem != j) {
          g g = f.b();
          if (menuItem != null)
            this.s.b(g, menuItem); 
          this.t = (MenuItem)j;
          if (j != null)
            this.s.a(g, (MenuItem)j); 
        } 
      } 
      return super.onHoverEvent(param1MotionEvent);
    }
    
    public boolean onKeyDown(int param1Int, KeyEvent param1KeyEvent) {
      ListMenuItemView listMenuItemView = (ListMenuItemView)getSelectedView();
      if (listMenuItemView != null && param1Int == this.q) {
        if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu())
          performItemClick((View)listMenuItemView, getSelectedItemPosition(), getSelectedItemId()); 
        return true;
      } 
      if (listMenuItemView != null && param1Int == this.r) {
        setSelection(-1);
        ((f)getAdapter()).b().a(false);
        return true;
      } 
      return super.onKeyDown(param1Int, param1KeyEvent);
    }
    
    public void setHoverListener(k0 param1k0) {
      this.s = param1k0;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/appcompat/widget/l0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */