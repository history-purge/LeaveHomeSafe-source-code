package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.f;
import androidx.core.app.a;
import androidx.lifecycle.g;
import androidx.lifecycle.j;
import androidx.lifecycle.k;
import androidx.lifecycle.w;
import androidx.lifecycle.x;
import androidx.savedstate.SavedStateRegistry;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;

public class e extends ComponentActivity implements a.b, a.d {
  final i l = i.a(new c(this));
  
  final k m = new k((j)this);
  
  boolean n;
  
  boolean o;
  
  boolean p = true;
  
  public e() {
    p();
  }
  
  private static boolean a(n paramn, g.c paramc) {
    Iterator<Fragment> iterator = paramn.u().iterator();
    boolean bool = false;
    while (iterator.hasNext()) {
      Fragment fragment = iterator.next();
      if (fragment == null)
        continue; 
      boolean bool1 = bool;
      if (fragment.w() != null)
        bool1 = bool | a(fragment.n(), paramc); 
      b0 b0 = fragment.U;
      bool = bool1;
      if (b0 != null) {
        bool = bool1;
        if (b0.a().a().a(g.c.f)) {
          fragment.U.a(paramc);
          bool = true;
        } 
      } 
      if (fragment.T.a().a(g.c.f)) {
        fragment.T.b(paramc);
        bool = true;
      } 
    } 
    return bool;
  }
  
  private void p() {
    c().a("android:support:fragments", new a(this));
    a(new b(this));
  }
  
  final View a(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet) {
    return this.l.a(paramView, paramString, paramContext, paramAttributeSet);
  }
  
  @Deprecated
  public final void a(int paramInt) {}
  
  @Deprecated
  public void a(Fragment paramFragment) {}
  
  @Deprecated
  protected boolean a(View paramView, Menu paramMenu) {
    return super.onPreparePanel(0, paramView, paramMenu);
  }
  
  public void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString) {
    super.dump(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("Local FragmentActivity ");
    paramPrintWriter.print(Integer.toHexString(System.identityHashCode(this)));
    paramPrintWriter.println(" State:");
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramString);
    stringBuilder.append("  ");
    String str = stringBuilder.toString();
    paramPrintWriter.print(str);
    paramPrintWriter.print("mCreated=");
    paramPrintWriter.print(this.n);
    paramPrintWriter.print(" mResumed=");
    paramPrintWriter.print(this.o);
    paramPrintWriter.print(" mStopped=");
    paramPrintWriter.print(this.p);
    if (getApplication() != null)
      b.n.a.a.a((j)this).a(str, paramFileDescriptor, paramPrintWriter, paramArrayOfString); 
    this.l.j().a(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
  }
  
  public n k() {
    return this.l.j();
  }
  
  @Deprecated
  public b.n.a.a l() {
    return b.n.a.a.a((j)this);
  }
  
  void m() {
    do {
    
    } while (a(k(), g.c.e));
  }
  
  protected void n() {
    this.m.a(g.b.ON_RESUME);
    this.l.f();
  }
  
  @Deprecated
  public void o() {
    invalidateOptionsMenu();
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent) {
    this.l.k();
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration) {
    super.onConfigurationChanged(paramConfiguration);
    this.l.k();
    this.l.a(paramConfiguration);
  }
  
  protected void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    this.m.a(g.b.ON_CREATE);
    this.l.b();
  }
  
  public boolean onCreatePanelMenu(int paramInt, Menu paramMenu) {
    return (paramInt == 0) ? (super.onCreatePanelMenu(paramInt, paramMenu) | this.l.a(paramMenu, getMenuInflater())) : super.onCreatePanelMenu(paramInt, paramMenu);
  }
  
  public View onCreateView(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet) {
    View view = a(paramView, paramString, paramContext, paramAttributeSet);
    return (view == null) ? super.onCreateView(paramView, paramString, paramContext, paramAttributeSet) : view;
  }
  
  public View onCreateView(String paramString, Context paramContext, AttributeSet paramAttributeSet) {
    View view = a(null, paramString, paramContext, paramAttributeSet);
    return (view == null) ? super.onCreateView(paramString, paramContext, paramAttributeSet) : view;
  }
  
  protected void onDestroy() {
    super.onDestroy();
    this.l.c();
    this.m.a(g.b.ON_DESTROY);
  }
  
  public void onLowMemory() {
    super.onLowMemory();
    this.l.d();
  }
  
  public boolean onMenuItemSelected(int paramInt, MenuItem paramMenuItem) {
    return super.onMenuItemSelected(paramInt, paramMenuItem) ? true : ((paramInt != 0) ? ((paramInt != 6) ? false : this.l.a(paramMenuItem)) : this.l.b(paramMenuItem));
  }
  
  public void onMultiWindowModeChanged(boolean paramBoolean) {
    this.l.a(paramBoolean);
  }
  
  protected void onNewIntent(@SuppressLint({"UnknownNullness"}) Intent paramIntent) {
    super.onNewIntent(paramIntent);
    this.l.k();
  }
  
  public void onPanelClosed(int paramInt, Menu paramMenu) {
    if (paramInt == 0)
      this.l.a(paramMenu); 
    super.onPanelClosed(paramInt, paramMenu);
  }
  
  protected void onPause() {
    super.onPause();
    this.o = false;
    this.l.e();
    this.m.a(g.b.ON_PAUSE);
  }
  
  public void onPictureInPictureModeChanged(boolean paramBoolean) {
    this.l.b(paramBoolean);
  }
  
  protected void onPostResume() {
    super.onPostResume();
    n();
  }
  
  public boolean onPreparePanel(int paramInt, View paramView, Menu paramMenu) {
    return (paramInt == 0) ? (a(paramView, paramMenu) | this.l.b(paramMenu)) : super.onPreparePanel(paramInt, paramView, paramMenu);
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfint) {
    this.l.k();
    super.onRequestPermissionsResult(paramInt, paramArrayOfString, paramArrayOfint);
  }
  
  protected void onResume() {
    super.onResume();
    this.o = true;
    this.l.k();
    this.l.i();
  }
  
  protected void onStart() {
    super.onStart();
    this.p = false;
    if (!this.n) {
      this.n = true;
      this.l.a();
    } 
    this.l.k();
    this.l.i();
    this.m.a(g.b.ON_START);
    this.l.g();
  }
  
  public void onStateNotSaved() {
    this.l.k();
  }
  
  protected void onStop() {
    super.onStop();
    this.p = true;
    m();
    this.l.h();
    this.m.a(g.b.ON_STOP);
  }
  
  class a implements SavedStateRegistry.b {
    a(e this$0) {}
    
    public Bundle a() {
      Bundle bundle = new Bundle();
      this.a.m();
      this.a.m.a(g.b.ON_STOP);
      Parcelable parcelable = this.a.l.l();
      if (parcelable != null)
        bundle.putParcelable("android:support:fragments", parcelable); 
      return bundle;
    }
  }
  
  class b implements androidx.activity.d.c {
    b(e this$0) {}
    
    public void a(Context param1Context) {
      this.a.l.a((Fragment)null);
      Bundle bundle = this.a.c().a("android:support:fragments");
      if (bundle != null) {
        Parcelable parcelable = bundle.getParcelable("android:support:fragments");
        this.a.l.a(parcelable);
      } 
    }
  }
  
  class c extends k<e> implements x, androidx.activity.c, f, r {
    public c(e this$0) {
      super(this$0);
    }
    
    public View a(int param1Int) {
      return this.g.findViewById(param1Int);
    }
    
    public g a() {
      return (g)this.g.m;
    }
    
    public void a(n param1n, Fragment param1Fragment) {
      this.g.a(param1Fragment);
    }
    
    public boolean a(Fragment param1Fragment) {
      return this.g.isFinishing() ^ true;
    }
    
    public OnBackPressedDispatcher b() {
      return this.g.b();
    }
    
    public boolean c() {
      Window window = this.g.getWindow();
      return (window != null && window.peekDecorView() != null);
    }
    
    public w d() {
      return this.g.d();
    }
    
    public androidx.activity.result.e g() {
      return this.g.g();
    }
    
    public e i() {
      return this.g;
    }
    
    public LayoutInflater j() {
      return this.g.getLayoutInflater().cloneInContext((Context)this.g);
    }
    
    public void k() {
      this.g.o();
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/fragment/app/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */