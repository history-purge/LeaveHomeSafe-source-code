package b.g.m;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public abstract class b {
  private b a;
  
  public b(Context paramContext) {}
  
  public View a(MenuItem paramMenuItem) {
    return c();
  }
  
  public void a(SubMenu paramSubMenu) {}
  
  public void a(a parama) {}
  
  public void a(b paramb) {
    if (this.a != null && paramb != null) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this ");
      stringBuilder.append(getClass().getSimpleName());
      stringBuilder.append(" instance while it is still in use somewhere else?");
      Log.w("ActionProvider(support)", stringBuilder.toString());
    } 
    this.a = paramb;
  }
  
  public boolean a() {
    return false;
  }
  
  public boolean b() {
    return true;
  }
  
  public abstract View c();
  
  public boolean d() {
    return false;
  }
  
  public boolean e() {
    return false;
  }
  
  public void f() {
    this.a = null;
  }
  
  public static interface a {}
  
  public static interface b {
    void onActionProviderVisibilityChanged(boolean param1Boolean);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/g/m/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */