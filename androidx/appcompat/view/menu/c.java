package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import b.d.g;
import b.g.h.a.b;

abstract class c {
  final Context a;
  
  private g<b, MenuItem> b;
  
  private g<b.g.h.a.c, SubMenu> c;
  
  c(Context paramContext) {
    this.a = paramContext;
  }
  
  final MenuItem a(MenuItem paramMenuItem) {
    MenuItem menuItem = paramMenuItem;
    if (paramMenuItem instanceof b) {
      b b = (b)paramMenuItem;
      if (this.b == null)
        this.b = new g(); 
      paramMenuItem = (MenuItem)this.b.get(paramMenuItem);
      menuItem = paramMenuItem;
      if (paramMenuItem == null) {
        menuItem = new k(this.a, b);
        this.b.put(b, menuItem);
      } 
    } 
    return menuItem;
  }
  
  final SubMenu a(SubMenu paramSubMenu) {
    if (paramSubMenu instanceof b.g.h.a.c) {
      b.g.h.a.c c1 = (b.g.h.a.c)paramSubMenu;
      if (this.c == null)
        this.c = new g(); 
      SubMenu subMenu = (SubMenu)this.c.get(c1);
      paramSubMenu = subMenu;
      if (subMenu == null) {
        paramSubMenu = new t(this.a, c1);
        this.c.put(c1, paramSubMenu);
      } 
      return paramSubMenu;
    } 
    return paramSubMenu;
  }
  
  final void a(int paramInt) {
    if (this.b == null)
      return; 
    for (int i = 0; i < this.b.size(); i = j + 1) {
      int j = i;
      if (((b)this.b.b(i)).getGroupId() == paramInt) {
        this.b.c(i);
        j = i - 1;
      } 
    } 
  }
  
  final void b() {
    g<b, MenuItem> g2 = this.b;
    if (g2 != null)
      g2.clear(); 
    g<b.g.h.a.c, SubMenu> g1 = this.c;
    if (g1 != null)
      g1.clear(); 
  }
  
  final void b(int paramInt) {
    if (this.b == null)
      return; 
    for (int i = 0; i < this.b.size(); i++) {
      if (((b)this.b.b(i)).getItemId() == paramInt) {
        this.b.c(i);
        return;
      } 
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/appcompat/view/menu/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */