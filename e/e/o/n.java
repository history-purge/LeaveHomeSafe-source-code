package e.e.o;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import com.facebook.react.bridge.Callback;
import com.facebook.react.modules.core.f;

public class n {
  private final Activity a;
  
  private final String b;
  
  private f c;
  
  private Callback d;
  
  private q e;
  
  public n(m paramm, String paramString) {
    this.a = (Activity)paramm;
    this.b = paramString;
  }
  
  protected y a() {
    return new y(b());
  }
  
  public void a(int paramInt1, int paramInt2, Intent paramIntent) {
    this.e.a(paramInt1, paramInt2, paramIntent, true);
  }
  
  public void a(int paramInt, String[] paramArrayOfString, int[] paramArrayOfint) {
    this.d = new b(this, paramInt, paramArrayOfString, paramArrayOfint);
  }
  
  protected void a(Bundle paramBundle) {
    String str = d();
    this.e = new a(this, e(), f(), str, c());
    if (this.b != null)
      a(str); 
  }
  
  protected void a(String paramString) {
    this.e.a(paramString);
    e().setContentView((View)this.e.b());
  }
  
  public void a(boolean paramBoolean) {
    if (f().l())
      f().h().a(paramBoolean); 
  }
  
  @TargetApi(23)
  public void a(String[] paramArrayOfString, int paramInt, f paramf) {
    this.c = paramf;
    e().requestPermissions(paramArrayOfString, paramInt);
  }
  
  public boolean a(int paramInt, KeyEvent paramKeyEvent) {
    if (f().l() && f().k() && paramInt == 90) {
      paramKeyEvent.startTracking();
      return true;
    } 
    return false;
  }
  
  public boolean a(Intent paramIntent) {
    if (f().l()) {
      f().h().a(paramIntent);
      return true;
    } 
    return false;
  }
  
  protected Context b() {
    Activity activity = this.a;
    e.e.m.a.a.a(activity);
    return (Context)activity;
  }
  
  public boolean b(int paramInt, KeyEvent paramKeyEvent) {
    if (f().l() && f().k() && paramInt == 90) {
      f().h().i();
      return true;
    } 
    return false;
  }
  
  protected Bundle c() {
    return null;
  }
  
  public boolean c(int paramInt, KeyEvent paramKeyEvent) {
    return this.e.a(paramInt, paramKeyEvent);
  }
  
  public String d() {
    return this.b;
  }
  
  protected Activity e() {
    return (Activity)b();
  }
  
  protected u f() {
    return ((p)e().getApplication()).a();
  }
  
  public boolean g() {
    return this.e.c();
  }
  
  protected void h() {
    this.e.d();
  }
  
  protected void i() {
    this.e.e();
  }
  
  protected void j() {
    this.e.f();
    Callback callback = this.d;
    if (callback != null) {
      callback.invoke(new Object[0]);
      this.d = null;
    } 
  }
  
  class a extends q {
    a(n this$0, Activity param1Activity, u param1u, String param1String, Bundle param1Bundle) {
      super(param1Activity, param1u, param1String, param1Bundle);
    }
    
    protected y a() {
      return this.f.a();
    }
  }
  
  class b implements Callback {
    b(n this$0, int param1Int, String[] param1ArrayOfString, int[] param1ArrayOfint) {}
    
    public void invoke(Object... param1VarArgs) {
      if (n.a(this.d) != null && n.a(this.d).onRequestPermissionsResult(this.a, this.b, this.c))
        n.a(this.d, (f)null); 
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/o/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */