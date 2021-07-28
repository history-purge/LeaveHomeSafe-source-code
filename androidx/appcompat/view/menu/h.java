package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.c;
import b.a.g;

class h implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, n.a {
  private g c;
  
  private c d;
  
  e e;
  
  private n.a f;
  
  public h(g paramg) {
    this.c = paramg;
  }
  
  public void a() {
    c c1 = this.d;
    if (c1 != null)
      c1.dismiss(); 
  }
  
  public void a(IBinder paramIBinder) {
    g g1 = this.c;
    c.a a1 = new c.a(g1.e());
    this.e = new e(a1.b(), g.abc_list_menu_item_layout);
    this.e.a(this);
    this.c.a(this.e);
    a1.a(this.e.b(), this);
    View view = g1.i();
    if (view != null) {
      a1.a(view);
    } else {
      a1.a(g1.g());
      a1.a(g1.h());
    } 
    a1.a(this);
    this.d = a1.a();
    this.d.setOnDismissListener(this);
    WindowManager.LayoutParams layoutParams = this.d.getWindow().getAttributes();
    layoutParams.type = 1003;
    if (paramIBinder != null)
      layoutParams.token = paramIBinder; 
    layoutParams.flags |= 0x20000;
    this.d.show();
  }
  
  public void a(g paramg, boolean paramBoolean) {
    if (paramBoolean || paramg == this.c)
      a(); 
    n.a a1 = this.f;
    if (a1 != null)
      a1.a(paramg, paramBoolean); 
  }
  
  public boolean a(g paramg) {
    n.a a1 = this.f;
    return (a1 != null) ? a1.a(paramg) : false;
  }
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt) {
    this.c.a((MenuItem)this.e.b().getItem(paramInt), 0);
  }
  
  public void onDismiss(DialogInterface paramDialogInterface) {
    this.e.a(this.c, true);
  }
  
  public boolean onKey(DialogInterface paramDialogInterface, int paramInt, KeyEvent paramKeyEvent) {
    if (paramInt == 82 || paramInt == 4) {
      KeyEvent.DispatcherState dispatcherState;
      if (paramKeyEvent.getAction() == 0 && paramKeyEvent.getRepeatCount() == 0) {
        Window window = this.d.getWindow();
        if (window != null) {
          View view = window.getDecorView();
          if (view != null) {
            dispatcherState = view.getKeyDispatcherState();
            if (dispatcherState != null) {
              dispatcherState.startTracking(paramKeyEvent, this);
              return true;
            } 
          } 
        } 
      } else if (paramKeyEvent.getAction() == 1 && !paramKeyEvent.isCanceled()) {
        Window window = this.d.getWindow();
        if (window != null) {
          View view = window.getDecorView();
          if (view != null) {
            KeyEvent.DispatcherState dispatcherState1 = view.getKeyDispatcherState();
            if (dispatcherState1 != null && dispatcherState1.isTracking(paramKeyEvent)) {
              this.c.a(true);
              dispatcherState.dismiss();
              return true;
            } 
          } 
        } 
      } 
    } 
    return this.c.performShortcut(paramInt, paramKeyEvent, 0);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/appcompat/view/menu/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */