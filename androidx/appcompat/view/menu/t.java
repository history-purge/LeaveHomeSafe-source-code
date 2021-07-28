package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import b.g.h.a.a;
import b.g.h.a.c;

class t extends p implements SubMenu {
  private final c e;
  
  t(Context paramContext, c paramc) {
    super(paramContext, (a)paramc);
    this.e = paramc;
  }
  
  public void clearHeader() {
    this.e.clearHeader();
  }
  
  public MenuItem getItem() {
    return a(this.e.getItem());
  }
  
  public SubMenu setHeaderIcon(int paramInt) {
    this.e.setHeaderIcon(paramInt);
    return this;
  }
  
  public SubMenu setHeaderIcon(Drawable paramDrawable) {
    this.e.setHeaderIcon(paramDrawable);
    return this;
  }
  
  public SubMenu setHeaderTitle(int paramInt) {
    this.e.setHeaderTitle(paramInt);
    return this;
  }
  
  public SubMenu setHeaderTitle(CharSequence paramCharSequence) {
    this.e.setHeaderTitle(paramCharSequence);
    return this;
  }
  
  public SubMenu setHeaderView(View paramView) {
    this.e.setHeaderView(paramView);
    return this;
  }
  
  public SubMenu setIcon(int paramInt) {
    this.e.setIcon(paramInt);
    return this;
  }
  
  public SubMenu setIcon(Drawable paramDrawable) {
    this.e.setIcon(paramDrawable);
    return this;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/appcompat/view/menu/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */