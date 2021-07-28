package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.g;
import androidx.lifecycle.j;
import androidx.lifecycle.k;
import androidx.lifecycle.r;
import b.d.g;
import b.g.m.e;

public class f extends Activity implements j, e.a {
  private k c;
  
  public f() {
    new g();
    this.c = new k(this);
  }
  
  public boolean a(KeyEvent paramKeyEvent) {
    return super.dispatchKeyEvent(paramKeyEvent);
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent) {
    View view = getWindow().getDecorView();
    return (view != null && e.a(view, paramKeyEvent)) ? true : e.a(this, view, (Window.Callback)this, paramKeyEvent);
  }
  
  public boolean dispatchKeyShortcutEvent(KeyEvent paramKeyEvent) {
    View view = getWindow().getDecorView();
    return (view != null && e.a(view, paramKeyEvent)) ? true : super.dispatchKeyShortcutEvent(paramKeyEvent);
  }
  
  @SuppressLint({"RestrictedApi"})
  protected void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    r.a(this);
  }
  
  protected void onSaveInstanceState(Bundle paramBundle) {
    this.c.a(g.c.e);
    super.onSaveInstanceState(paramBundle);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/core/app/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */