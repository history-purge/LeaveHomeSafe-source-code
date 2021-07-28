package e.e.o;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import com.facebook.react.devsupport.c;
import com.facebook.react.modules.core.b;
import e.e.m.a.a;

public class q {
  private final Activity a;
  
  private y b;
  
  private Bundle c;
  
  private c d;
  
  private u e;
  
  public q(Activity paramActivity, u paramu, String paramString, Bundle paramBundle) {
    this.a = paramActivity;
    this.c = paramBundle;
    this.d = new c();
    this.e = paramu;
  }
  
  private u g() {
    return this.e;
  }
  
  protected y a() {
    throw null;
  }
  
  public void a(int paramInt1, int paramInt2, Intent paramIntent, boolean paramBoolean) {
    if (g().l() && paramBoolean)
      g().h().a(this.a, paramInt1, paramInt2, paramIntent); 
  }
  
  public void a(String paramString) {
    if (this.b == null) {
      this.b = a();
      this.b.a(g().h(), paramString, this.c);
      return;
    } 
    throw new IllegalStateException("Cannot loadApp while app is already running.");
  }
  
  public boolean a(int paramInt, KeyEvent paramKeyEvent) {
    if (g().l() && g().k()) {
      if (paramInt == 82) {
        g().h().i();
        return true;
      } 
      c c1 = this.d;
      a.a(c1);
      if (c1.a(paramInt, this.a.getCurrentFocus())) {
        g().h().c().d();
        return true;
      } 
    } 
    return false;
  }
  
  public y b() {
    return this.b;
  }
  
  public boolean c() {
    if (g().l()) {
      g().h().f();
      return true;
    } 
    return false;
  }
  
  public void d() {
    y y1 = this.b;
    if (y1 != null) {
      y1.c();
      this.b = null;
    } 
    if (g().l())
      g().h().a(this.a); 
  }
  
  public void e() {
    if (g().l())
      g().h().b(this.a); 
  }
  
  public void f() {
    if (g().l()) {
      if (this.a instanceof b) {
        r r = g().h();
        Activity activity = this.a;
        r.a(activity, (b)activity);
        return;
      } 
      throw new ClassCastException("Host Activity does not implement DefaultHardwareBackBtnHandler");
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/o/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */