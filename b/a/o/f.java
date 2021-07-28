package b.a.o;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.view.menu.p;
import b.d.g;
import b.g.h.a.b;
import java.util.ArrayList;

public class f extends ActionMode {
  final Context a;
  
  final b b;
  
  public f(Context paramContext, b paramb) {
    this.a = paramContext;
    this.b = paramb;
  }
  
  public void finish() {
    this.b.a();
  }
  
  public View getCustomView() {
    return this.b.b();
  }
  
  public Menu getMenu() {
    return (Menu)new p(this.a, (b.g.h.a.a)this.b.c());
  }
  
  public MenuInflater getMenuInflater() {
    return this.b.d();
  }
  
  public CharSequence getSubtitle() {
    return this.b.e();
  }
  
  public Object getTag() {
    return this.b.f();
  }
  
  public CharSequence getTitle() {
    return this.b.g();
  }
  
  public boolean getTitleOptionalHint() {
    return this.b.h();
  }
  
  public void invalidate() {
    this.b.i();
  }
  
  public boolean isTitleOptional() {
    return this.b.j();
  }
  
  public void setCustomView(View paramView) {
    this.b.a(paramView);
  }
  
  public void setSubtitle(int paramInt) {
    this.b.a(paramInt);
  }
  
  public void setSubtitle(CharSequence paramCharSequence) {
    this.b.a(paramCharSequence);
  }
  
  public void setTag(Object paramObject) {
    this.b.a(paramObject);
  }
  
  public void setTitle(int paramInt) {
    this.b.b(paramInt);
  }
  
  public void setTitle(CharSequence paramCharSequence) {
    this.b.b(paramCharSequence);
  }
  
  public void setTitleOptionalHint(boolean paramBoolean) {
    this.b.a(paramBoolean);
  }
  
  public static class a implements b.a {
    final ActionMode.Callback a;
    
    final Context b;
    
    final ArrayList<f> c;
    
    final g<Menu, Menu> d;
    
    public a(Context param1Context, ActionMode.Callback param1Callback) {
      this.b = param1Context;
      this.a = param1Callback;
      this.c = new ArrayList<f>();
      this.d = new g();
    }
    
    private Menu a(Menu param1Menu) {
      p p;
      Menu menu2 = (Menu)this.d.get(param1Menu);
      Menu menu1 = menu2;
      if (menu2 == null) {
        p = new p(this.b, (b.g.h.a.a)param1Menu);
        this.d.put(param1Menu, p);
      } 
      return (Menu)p;
    }
    
    public void a(b param1b) {
      this.a.onDestroyActionMode(b(param1b));
    }
    
    public boolean a(b param1b, Menu param1Menu) {
      return this.a.onPrepareActionMode(b(param1b), a(param1Menu));
    }
    
    public boolean a(b param1b, MenuItem param1MenuItem) {
      return this.a.onActionItemClicked(b(param1b), (MenuItem)new k(this.b, (b)param1MenuItem));
    }
    
    public ActionMode b(b param1b) {
      int j = this.c.size();
      for (int i = 0; i < j; i++) {
        f f1 = this.c.get(i);
        if (f1 != null && f1.b == param1b)
          return f1; 
      } 
      f f = new f(this.b, param1b);
      this.c.add(f);
      return f;
    }
    
    public boolean b(b param1b, Menu param1Menu) {
      return this.a.onCreateActionMode(b(param1b), a(param1Menu));
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/a/o/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */