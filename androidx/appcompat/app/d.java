package androidx.appcompat.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.c1;
import androidx.core.app.a;
import androidx.core.app.g;
import androidx.core.app.o;
import androidx.fragment.app.e;
import b.a.o.b;

public class d extends e implements e, o.a, b {
  private f q;
  
  private Resources r;
  
  private boolean b(KeyEvent paramKeyEvent) {
    if (Build.VERSION.SDK_INT < 26 && !paramKeyEvent.isCtrlPressed() && !KeyEvent.metaStateHasNoModifiers(paramKeyEvent.getMetaState()) && paramKeyEvent.getRepeatCount() == 0 && !KeyEvent.isModifierKey(paramKeyEvent.getKeyCode())) {
      Window window = getWindow();
      if (window != null && window.getDecorView() != null && window.getDecorView().dispatchKeyShortcutEvent(paramKeyEvent))
        return true; 
    } 
    return false;
  }
  
  public b a(b.a parama) {
    return null;
  }
  
  public void a(Intent paramIntent) {
    g.a((Activity)this, paramIntent);
  }
  
  public void a(Toolbar paramToolbar) {
    p().a(paramToolbar);
  }
  
  public void a(o paramo) {
    paramo.a((Activity)this);
  }
  
  public void a(b paramb) {}
  
  public void addContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams) {
    p().a(paramView, paramLayoutParams);
  }
  
  protected void attachBaseContext(Context paramContext) {
    super.attachBaseContext(p().b(paramContext));
  }
  
  protected void b(int paramInt) {}
  
  public void b(o paramo) {}
  
  public void b(b paramb) {}
  
  public boolean b(Intent paramIntent) {
    return g.b((Activity)this, paramIntent);
  }
  
  public void closeOptionsMenu() {
    a a1 = q();
    if (getWindow().hasFeature(0) && (a1 == null || !a1.e()))
      super.closeOptionsMenu(); 
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent) {
    int i = paramKeyEvent.getKeyCode();
    a a1 = q();
    return (i == 82 && a1 != null && a1.a(paramKeyEvent)) ? true : super.dispatchKeyEvent(paramKeyEvent);
  }
  
  public <T extends View> T findViewById(int paramInt) {
    return p().a(paramInt);
  }
  
  public MenuInflater getMenuInflater() {
    return p().b();
  }
  
  public Resources getResources() {
    if (this.r == null && c1.b())
      this.r = (Resources)new c1((Context)this, super.getResources()); 
    Resources resources2 = this.r;
    Resources resources1 = resources2;
    if (resources2 == null)
      resources1 = super.getResources(); 
    return resources1;
  }
  
  public Intent h() {
    return g.a((Activity)this);
  }
  
  public void invalidateOptionsMenu() {
    p().e();
  }
  
  public void o() {
    p().e();
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration) {
    super.onConfigurationChanged(paramConfiguration);
    if (this.r != null) {
      DisplayMetrics displayMetrics = super.getResources().getDisplayMetrics();
      this.r.updateConfiguration(paramConfiguration, displayMetrics);
    } 
    p().a(paramConfiguration);
  }
  
  public void onContentChanged() {
    r();
  }
  
  protected void onCreate(Bundle paramBundle) {
    f f1 = p();
    f1.d();
    f1.a(paramBundle);
    super.onCreate(paramBundle);
  }
  
  protected void onDestroy() {
    super.onDestroy();
    p().f();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent) {
    return b(paramKeyEvent) ? true : super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public final boolean onMenuItemSelected(int paramInt, MenuItem paramMenuItem) {
    if (super.onMenuItemSelected(paramInt, paramMenuItem))
      return true; 
    a a1 = q();
    return (paramMenuItem.getItemId() == 16908332 && a1 != null && (a1.g() & 0x4) != 0) ? s() : false;
  }
  
  public boolean onMenuOpened(int paramInt, Menu paramMenu) {
    return super.onMenuOpened(paramInt, paramMenu);
  }
  
  public void onPanelClosed(int paramInt, Menu paramMenu) {
    super.onPanelClosed(paramInt, paramMenu);
  }
  
  protected void onPostCreate(Bundle paramBundle) {
    super.onPostCreate(paramBundle);
    p().b(paramBundle);
  }
  
  protected void onPostResume() {
    super.onPostResume();
    p().g();
  }
  
  protected void onSaveInstanceState(Bundle paramBundle) {
    super.onSaveInstanceState(paramBundle);
    p().c(paramBundle);
  }
  
  protected void onStart() {
    super.onStart();
    p().h();
  }
  
  protected void onStop() {
    super.onStop();
    p().i();
  }
  
  protected void onTitleChanged(CharSequence paramCharSequence, int paramInt) {
    super.onTitleChanged(paramCharSequence, paramInt);
    p().a(paramCharSequence);
  }
  
  public void openOptionsMenu() {
    a a1 = q();
    if (getWindow().hasFeature(0) && (a1 == null || !a1.k()))
      super.openOptionsMenu(); 
  }
  
  public f p() {
    if (this.q == null)
      this.q = f.a((Activity)this, this); 
    return this.q;
  }
  
  public a q() {
    return p().c();
  }
  
  @Deprecated
  public void r() {}
  
  public boolean s() {
    Intent intent = h();
    if (intent != null) {
      if (b(intent)) {
        o o = o.a((Context)this);
        a(o);
        b(o);
        o.a();
        try {
          a.a((Activity)this);
        } catch (IllegalStateException illegalStateException) {
          finish();
        } 
      } else {
        a((Intent)illegalStateException);
      } 
      return true;
    } 
    return false;
  }
  
  public void setContentView(int paramInt) {
    p().c(paramInt);
  }
  
  public void setContentView(View paramView) {
    p().a(paramView);
  }
  
  public void setContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams) {
    p().b(paramView, paramLayoutParams);
  }
  
  public void setTheme(int paramInt) {
    super.setTheme(paramInt);
    p().d(paramInt);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/appcompat/app/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */