package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.d0;
import androidx.appcompat.widget.y0;
import b.a.o.i;
import b.g.m.v;
import java.util.ArrayList;

class k extends a {
  d0 a;
  
  boolean b;
  
  Window.Callback c;
  
  private boolean d;
  
  private boolean e;
  
  private ArrayList<a.b> f = new ArrayList<a.b>();
  
  private final Runnable g = new a(this);
  
  private final Toolbar.f h = new b(this);
  
  k(Toolbar paramToolbar, CharSequence paramCharSequence, Window.Callback paramCallback) {
    this.a = (d0)new y0(paramToolbar, false);
    this.c = (Window.Callback)new e(this, paramCallback);
    this.a.setWindowCallback(this.c);
    paramToolbar.setOnMenuItemClickListener(this.h);
    this.a.setWindowTitle(paramCharSequence);
  }
  
  private Menu n() {
    if (!this.d) {
      this.a.a(new c(this), new d(this));
      this.d = true;
    } 
    return this.a.l();
  }
  
  public void a(int paramInt1, int paramInt2) {
    int i = this.a.k();
    this.a.a(paramInt1 & paramInt2 | (paramInt2 ^ 0xFFFFFFFF) & i);
  }
  
  public void a(Configuration paramConfiguration) {
    super.a(paramConfiguration);
  }
  
  public void a(Drawable paramDrawable) {
    this.a.a(paramDrawable);
  }
  
  public void a(CharSequence paramCharSequence) {
    this.a.setTitle(paramCharSequence);
  }
  
  public boolean a(int paramInt, KeyEvent paramKeyEvent) {
    Menu menu = n();
    if (menu != null) {
      if (paramKeyEvent != null) {
        i = paramKeyEvent.getDeviceId();
      } else {
        i = -1;
      } 
      int i = KeyCharacterMap.load(i).getKeyboardType();
      boolean bool = true;
      if (i == 1)
        bool = false; 
      menu.setQwertyMode(bool);
      return menu.performShortcut(paramInt, paramKeyEvent, 0);
    } 
    return false;
  }
  
  public boolean a(KeyEvent paramKeyEvent) {
    if (paramKeyEvent.getAction() == 1)
      k(); 
    return true;
  }
  
  public void b(CharSequence paramCharSequence) {
    this.a.setWindowTitle(paramCharSequence);
  }
  
  public void b(boolean paramBoolean) {
    if (paramBoolean == this.e)
      return; 
    this.e = paramBoolean;
    int j = this.f.size();
    for (int i = 0; i < j; i++)
      ((a.b)this.f.get(i)).a(paramBoolean); 
  }
  
  public void c(boolean paramBoolean) {}
  
  public void d(boolean paramBoolean) {
    boolean bool;
    if (paramBoolean) {
      bool = true;
    } else {
      bool = false;
    } 
    a(bool, 4);
  }
  
  public void e(boolean paramBoolean) {}
  
  public boolean e() {
    return this.a.d();
  }
  
  public boolean f() {
    if (this.a.j()) {
      this.a.collapseActionView();
      return true;
    } 
    return false;
  }
  
  public int g() {
    return this.a.k();
  }
  
  public Context h() {
    return this.a.i();
  }
  
  public boolean i() {
    this.a.h().removeCallbacks(this.g);
    v.a((View)this.a.h(), this.g);
    return true;
  }
  
  void j() {
    this.a.h().removeCallbacks(this.g);
  }
  
  public boolean k() {
    return this.a.e();
  }
  
  public Window.Callback l() {
    return this.c;
  }
  
  void m() {
    g g;
    null = n();
    if (null instanceof g) {
      g = (g)null;
    } else {
      g = null;
    } 
    if (g != null)
      g.s(); 
    try {
      null.clear();
      if (!this.c.onCreatePanelMenu(0, null) || !this.c.onPreparePanel(0, null, null))
        null.clear(); 
      return;
    } finally {
      if (g != null)
        g.r(); 
    } 
  }
  
  class a implements Runnable {
    a(k this$0) {}
    
    public void run() {
      this.c.m();
    }
  }
  
  class b implements Toolbar.f {
    b(k this$0) {}
    
    public boolean onMenuItemClick(MenuItem param1MenuItem) {
      return this.a.c.onMenuItemSelected(0, param1MenuItem);
    }
  }
  
  private final class c implements n.a {
    private boolean c;
    
    c(k this$0) {}
    
    public void a(g param1g, boolean param1Boolean) {
      if (this.c)
        return; 
      this.c = true;
      this.d.a.g();
      Window.Callback callback = this.d.c;
      if (callback != null)
        callback.onPanelClosed(108, (Menu)param1g); 
      this.c = false;
    }
    
    public boolean a(g param1g) {
      Window.Callback callback = this.d.c;
      if (callback != null) {
        callback.onMenuOpened(108, (Menu)param1g);
        return true;
      } 
      return false;
    }
  }
  
  private final class d implements g.a {
    d(k this$0) {}
    
    public void a(g param1g) {
      k k1 = this.c;
      if (k1.c != null) {
        if (k1.a.a()) {
          this.c.c.onPanelClosed(108, (Menu)param1g);
          return;
        } 
        if (this.c.c.onPreparePanel(0, null, (Menu)param1g))
          this.c.c.onMenuOpened(108, (Menu)param1g); 
      } 
    }
    
    public boolean a(g param1g, MenuItem param1MenuItem) {
      return false;
    }
  }
  
  private class e extends i {
    public e(k this$0, Window.Callback param1Callback) {
      super(param1Callback);
    }
    
    public View onCreatePanelView(int param1Int) {
      return (param1Int == 0) ? new View(this.d.a.i()) : super.onCreatePanelView(param1Int);
    }
    
    public boolean onPreparePanel(int param1Int, View param1View, Menu param1Menu) {
      boolean bool = super.onPreparePanel(param1Int, param1View, param1Menu);
      if (bool) {
        k k1 = this.d;
        if (!k1.b) {
          k1.a.b();
          this.d.b = true;
        } 
      } 
      return bool;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/appcompat/app/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */