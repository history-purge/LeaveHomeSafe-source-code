package androidx.fragment.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.core.util.f;

public class i {
  private final k<?> a;
  
  private i(k<?> paramk) {
    this.a = paramk;
  }
  
  public static i a(k<?> paramk) {
    f.a(paramk, "callbacks == null");
    return new i(paramk);
  }
  
  public View a(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet) {
    return this.a.f.w().onCreateView(paramView, paramString, paramContext, paramAttributeSet);
  }
  
  public void a() {
    this.a.f.d();
  }
  
  public void a(Configuration paramConfiguration) {
    this.a.f.a(paramConfiguration);
  }
  
  public void a(Parcelable paramParcelable) {
    k<?> k1 = this.a;
    if (k1 instanceof androidx.lifecycle.x) {
      k1.f.a(paramParcelable);
      return;
    } 
    throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
  }
  
  public void a(Menu paramMenu) {
    this.a.f.a(paramMenu);
  }
  
  public void a(Fragment paramFragment) {
    k<?> k1 = this.a;
    k1.f.a(k1, k1, paramFragment);
  }
  
  public void a(boolean paramBoolean) {
    this.a.f.a(paramBoolean);
  }
  
  public boolean a(Menu paramMenu, MenuInflater paramMenuInflater) {
    return this.a.f.a(paramMenu, paramMenuInflater);
  }
  
  public boolean a(MenuItem paramMenuItem) {
    return this.a.f.a(paramMenuItem);
  }
  
  public void b() {
    this.a.f.f();
  }
  
  public void b(boolean paramBoolean) {
    this.a.f.b(paramBoolean);
  }
  
  public boolean b(Menu paramMenu) {
    return this.a.f.b(paramMenu);
  }
  
  public boolean b(MenuItem paramMenuItem) {
    return this.a.f.b(paramMenuItem);
  }
  
  public void c() {
    this.a.f.g();
  }
  
  public void d() {
    this.a.f.i();
  }
  
  public void e() {
    this.a.f.j();
  }
  
  public void f() {
    this.a.f.l();
  }
  
  public void g() {
    this.a.f.m();
  }
  
  public void h() {
    this.a.f.n();
  }
  
  public boolean i() {
    return this.a.f.c(true);
  }
  
  public n j() {
    return this.a.f;
  }
  
  public void k() {
    this.a.f.E();
  }
  
  public Parcelable l() {
    return this.a.f.G();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/fragment/app/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */