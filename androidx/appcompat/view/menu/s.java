package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public class s extends g implements SubMenu {
  private g B;
  
  private j C;
  
  public s(Context paramContext, g paramg, j paramj) {
    super(paramContext);
    this.B = paramg;
    this.C = paramj;
  }
  
  public void a(g.a parama) {
    this.B.a(parama);
  }
  
  boolean a(g paramg, MenuItem paramMenuItem) {
    return (super.a(paramg, paramMenuItem) || this.B.a(paramg, paramMenuItem));
  }
  
  public boolean a(j paramj) {
    return this.B.a(paramj);
  }
  
  public boolean b(j paramj) {
    return this.B.b(paramj);
  }
  
  public String d() {
    boolean bool;
    j j1 = this.C;
    if (j1 != null) {
      bool = j1.getItemId();
    } else {
      bool = false;
    } 
    if (!bool)
      return null; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(super.d());
    stringBuilder.append(":");
    stringBuilder.append(bool);
    return stringBuilder.toString();
  }
  
  public MenuItem getItem() {
    return (MenuItem)this.C;
  }
  
  public g m() {
    return this.B.m();
  }
  
  public boolean o() {
    return this.B.o();
  }
  
  public boolean p() {
    return this.B.p();
  }
  
  public boolean q() {
    return this.B.q();
  }
  
  public void setGroupDividerEnabled(boolean paramBoolean) {
    this.B.setGroupDividerEnabled(paramBoolean);
  }
  
  public SubMenu setHeaderIcon(int paramInt) {
    d(paramInt);
    return this;
  }
  
  public SubMenu setHeaderIcon(Drawable paramDrawable) {
    a(paramDrawable);
    return this;
  }
  
  public SubMenu setHeaderTitle(int paramInt) {
    e(paramInt);
    return this;
  }
  
  public SubMenu setHeaderTitle(CharSequence paramCharSequence) {
    a(paramCharSequence);
    return this;
  }
  
  public SubMenu setHeaderView(View paramView) {
    a(paramView);
    return this;
  }
  
  public SubMenu setIcon(int paramInt) {
    this.C.setIcon(paramInt);
    return this;
  }
  
  public SubMenu setIcon(Drawable paramDrawable) {
    this.C.setIcon(paramDrawable);
    return this;
  }
  
  public void setQwertyMode(boolean paramBoolean) {
    this.B.setQwertyMode(paramBoolean);
  }
  
  public Menu t() {
    return (Menu)this.B;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/appcompat/view/menu/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */