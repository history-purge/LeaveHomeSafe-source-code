package b.a.o;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

public class e extends b implements g.a {
  private Context e;
  
  private ActionBarContextView f;
  
  private b.a g;
  
  private WeakReference<View> h;
  
  private boolean i;
  
  private g j;
  
  public e(Context paramContext, ActionBarContextView paramActionBarContextView, b.a parama, boolean paramBoolean) {
    this.e = paramContext;
    this.f = paramActionBarContextView;
    this.g = parama;
    g g1 = new g(paramActionBarContextView.getContext());
    g1.c(1);
    this.j = g1;
    this.j.a(this);
  }
  
  public void a() {
    if (this.i)
      return; 
    this.i = true;
    this.f.sendAccessibilityEvent(32);
    this.g.a(this);
  }
  
  public void a(int paramInt) {
    a(this.e.getString(paramInt));
  }
  
  public void a(View paramView) {
    this.f.setCustomView(paramView);
    if (paramView != null) {
      WeakReference<View> weakReference = new WeakReference<View>(paramView);
    } else {
      paramView = null;
    } 
    this.h = (WeakReference<View>)paramView;
  }
  
  public void a(g paramg) {
    i();
    this.f.d();
  }
  
  public void a(CharSequence paramCharSequence) {
    this.f.setSubtitle(paramCharSequence);
  }
  
  public void a(boolean paramBoolean) {
    super.a(paramBoolean);
    this.f.setTitleOptional(paramBoolean);
  }
  
  public boolean a(g paramg, MenuItem paramMenuItem) {
    return this.g.a(this, paramMenuItem);
  }
  
  public View b() {
    WeakReference<View> weakReference = this.h;
    return (weakReference != null) ? weakReference.get() : null;
  }
  
  public void b(int paramInt) {
    b(this.e.getString(paramInt));
  }
  
  public void b(CharSequence paramCharSequence) {
    this.f.setTitle(paramCharSequence);
  }
  
  public Menu c() {
    return (Menu)this.j;
  }
  
  public MenuInflater d() {
    return new g(this.f.getContext());
  }
  
  public CharSequence e() {
    return this.f.getSubtitle();
  }
  
  public CharSequence g() {
    return this.f.getTitle();
  }
  
  public void i() {
    this.g.a(this, (Menu)this.j);
  }
  
  public boolean j() {
    return this.f.b();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/a/o/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */