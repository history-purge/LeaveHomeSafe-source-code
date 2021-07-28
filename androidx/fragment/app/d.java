package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.j;
import androidx.lifecycle.p;
import androidx.lifecycle.y;
import androidx.lifecycle.z;

public class d extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
  private Handler b0;
  
  private Runnable c0 = new a(this);
  
  private DialogInterface.OnCancelListener d0 = new b(this);
  
  private DialogInterface.OnDismissListener e0 = new c(this);
  
  private int f0 = 0;
  
  private int g0 = 0;
  
  private boolean h0 = true;
  
  private boolean i0 = true;
  
  private int j0 = -1;
  
  private boolean k0;
  
  private p<j> l0 = new d(this);
  
  private Dialog m0;
  
  private boolean n0;
  
  private boolean o0;
  
  private boolean p0;
  
  private boolean q0 = false;
  
  private void a(boolean paramBoolean1, boolean paramBoolean2) {
    if (this.o0)
      return; 
    this.o0 = true;
    this.p0 = false;
    Dialog dialog = this.m0;
    if (dialog != null) {
      dialog.setOnDismissListener(null);
      this.m0.dismiss();
      if (!paramBoolean2)
        if (Looper.myLooper() == this.b0.getLooper()) {
          onDismiss((DialogInterface)this.m0);
        } else {
          this.b0.post(this.c0);
        }  
    } 
    this.n0 = true;
    if (this.j0 >= 0) {
      z().a(this.j0, 1);
      this.j0 = -1;
      return;
    } 
    x x = z().b();
    x.a(this);
    if (paramBoolean1) {
      x.b();
      return;
    } 
    x.a();
  }
  
  private void o(Bundle paramBundle) {
    if (!this.i0)
      return; 
    if (!this.q0)
      try {
        this.k0 = true;
        this.m0 = n(paramBundle);
        if (this.i0) {
          a(this.m0, this.f0);
          Context context = o();
          if (context instanceof Activity)
            this.m0.setOwnerActivity((Activity)context); 
          this.m0.setCancelable(this.h0);
          this.m0.setOnCancelListener(this.d0);
          this.m0.setOnDismissListener(this.e0);
          this.q0 = true;
        } else {
          this.m0 = null;
        } 
        return;
      } finally {
        this.k0 = false;
      }  
  }
  
  boolean A0() {
    return this.q0;
  }
  
  public final Dialog B0() {
    Dialog dialog = y0();
    if (dialog != null)
      return dialog; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("DialogFragment ");
    stringBuilder.append(this);
    stringBuilder.append(" does not have a Dialog.");
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  public void a(Dialog paramDialog, int paramInt) {
    if (paramInt != 1 && paramInt != 2) {
      if (paramInt != 3)
        return; 
      Window window = paramDialog.getWindow();
      if (window != null)
        window.addFlags(24); 
    } 
    paramDialog.requestWindowFeature(1);
  }
  
  public void a(Context paramContext) {
    super.a(paramContext);
    N().a(this.l0);
    if (!this.p0)
      this.o0 = false; 
  }
  
  public void a(n paramn, String paramString) {
    this.o0 = false;
    this.p0 = true;
    x x = paramn.b();
    x.a(this, paramString);
    x.a();
  }
  
  void b(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle) {
    super.b(paramLayoutInflater, paramViewGroup, paramBundle);
    if (this.J == null && this.m0 != null && paramBundle != null) {
      Bundle bundle = paramBundle.getBundle("android:savedDialogState");
      if (bundle != null)
        this.m0.onRestoreInstanceState(bundle); 
    } 
  }
  
  public void b0() {
    super.b0();
    Dialog dialog = this.m0;
    if (dialog != null) {
      this.n0 = true;
      dialog.setOnDismissListener(null);
      this.m0.dismiss();
      if (!this.o0)
        onDismiss((DialogInterface)this.m0); 
      this.m0 = null;
      this.q0 = false;
    } 
  }
  
  View c(int paramInt) {
    Dialog dialog = this.m0;
    return (dialog != null) ? dialog.findViewById(paramInt) : null;
  }
  
  public void c(Bundle paramBundle) {
    boolean bool;
    super.c(paramBundle);
    this.b0 = new Handler();
    if (this.z == 0) {
      bool = true;
    } else {
      bool = false;
    } 
    this.i0 = bool;
    if (paramBundle != null) {
      this.f0 = paramBundle.getInt("android:style", 0);
      this.g0 = paramBundle.getInt("android:theme", 0);
      this.h0 = paramBundle.getBoolean("android:cancelable", true);
      this.i0 = paramBundle.getBoolean("android:showsDialog", this.i0);
      this.j0 = paramBundle.getInt("android:backStackId", -1);
    } 
  }
  
  public void c0() {
    super.c0();
    if (!this.p0 && !this.o0)
      this.o0 = true; 
    N().b(this.l0);
  }
  
  public LayoutInflater d(Bundle paramBundle) {
    StringBuilder stringBuilder;
    LayoutInflater layoutInflater2 = super.d(paramBundle);
    if (!this.i0 || this.k0) {
      if (n.d(2)) {
        String str1;
        stringBuilder = new StringBuilder();
        stringBuilder.append("getting layout inflater for DialogFragment ");
        stringBuilder.append(this);
        String str2 = stringBuilder.toString();
        if (!this.i0) {
          stringBuilder = new StringBuilder();
          str1 = "mShowsDialog = false: ";
        } else {
          stringBuilder = new StringBuilder();
          str1 = "mCreatingDialog = true: ";
        } 
        stringBuilder.append(str1);
        stringBuilder.append(str2);
        Log.d("FragmentManager", stringBuilder.toString());
      } 
      return layoutInflater2;
    } 
    o((Bundle)stringBuilder);
    if (n.d(2)) {
      stringBuilder = new StringBuilder();
      stringBuilder.append("get layout inflater for DialogFragment ");
      stringBuilder.append(this);
      stringBuilder.append(" from dialog context");
      Log.d("FragmentManager", stringBuilder.toString());
    } 
    Dialog dialog = this.m0;
    LayoutInflater layoutInflater1 = layoutInflater2;
    if (dialog != null)
      layoutInflater1 = layoutInflater2.cloneInContext(dialog.getContext()); 
    return layoutInflater1;
  }
  
  public void e(Bundle paramBundle) {
    super.e(paramBundle);
    Dialog dialog = this.m0;
    if (dialog != null) {
      Bundle bundle = dialog.onSaveInstanceState();
      bundle.putBoolean("android:dialogShowing", false);
      paramBundle.putBundle("android:savedDialogState", bundle);
    } 
    int i = this.f0;
    if (i != 0)
      paramBundle.putInt("android:style", i); 
    i = this.g0;
    if (i != 0)
      paramBundle.putInt("android:theme", i); 
    boolean bool = this.h0;
    if (!bool)
      paramBundle.putBoolean("android:cancelable", bool); 
    bool = this.i0;
    if (!bool)
      paramBundle.putBoolean("android:showsDialog", bool); 
    i = this.j0;
    if (i != -1)
      paramBundle.putInt("android:backStackId", i); 
  }
  
  public void f(Bundle paramBundle) {
    super.f(paramBundle);
    if (this.m0 != null && paramBundle != null) {
      paramBundle = paramBundle.getBundle("android:savedDialogState");
      if (paramBundle != null)
        this.m0.onRestoreInstanceState(paramBundle); 
    } 
  }
  
  public void f0() {
    super.f0();
    Dialog dialog = this.m0;
    if (dialog != null) {
      this.n0 = false;
      dialog.show();
      View view = this.m0.getWindow().getDecorView();
      y.a(view, this);
      z.a(view, this);
      androidx.savedstate.d.a(view, this);
    } 
  }
  
  g g() {
    return new e(this, super.g());
  }
  
  public void g0() {
    super.g0();
    Dialog dialog = this.m0;
    if (dialog != null)
      dialog.hide(); 
  }
  
  public void j(boolean paramBoolean) {
    this.h0 = paramBoolean;
    Dialog dialog = this.m0;
    if (dialog != null)
      dialog.setCancelable(paramBoolean); 
  }
  
  public void k(boolean paramBoolean) {
    this.i0 = paramBoolean;
  }
  
  public Dialog n(Bundle paramBundle) {
    if (n.d(3)) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("onCreateDialog called for DialogFragment ");
      stringBuilder.append(this);
      Log.d("FragmentManager", stringBuilder.toString());
    } 
    return new Dialog(t0(), z0());
  }
  
  public void onCancel(DialogInterface paramDialogInterface) {}
  
  public void onDismiss(DialogInterface paramDialogInterface) {
    if (!this.n0) {
      if (n.d(3)) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("onDismiss called for DialogFragment ");
        stringBuilder.append(this);
        Log.d("FragmentManager", stringBuilder.toString());
      } 
      a(true, true);
    } 
  }
  
  public void w0() {
    a(false, false);
  }
  
  public void x0() {
    a(true, false);
  }
  
  public Dialog y0() {
    return this.m0;
  }
  
  public int z0() {
    return this.g0;
  }
  
  class a implements Runnable {
    a(d this$0) {}
    
    @SuppressLint({"SyntheticAccessor"})
    public void run() {
      d.b(this.c).onDismiss((DialogInterface)d.a(this.c));
    }
  }
  
  class b implements DialogInterface.OnCancelListener {
    b(d this$0) {}
    
    @SuppressLint({"SyntheticAccessor"})
    public void onCancel(DialogInterface param1DialogInterface) {
      if (d.a(this.c) != null) {
        d d1 = this.c;
        d1.onCancel((DialogInterface)d.a(d1));
      } 
    }
  }
  
  class c implements DialogInterface.OnDismissListener {
    c(d this$0) {}
    
    @SuppressLint({"SyntheticAccessor"})
    public void onDismiss(DialogInterface param1DialogInterface) {
      if (d.a(this.c) != null) {
        d d1 = this.c;
        d1.onDismiss((DialogInterface)d.a(d1));
      } 
    }
  }
  
  class d implements p<j> {
    d(d this$0) {}
    
    @SuppressLint({"SyntheticAccessor"})
    public void a(j param1j) {
      if (param1j != null && d.c(this.a)) {
        View view = this.a.u0();
        if (view.getParent() == null) {
          if (d.a(this.a) != null) {
            if (n.d(3)) {
              StringBuilder stringBuilder = new StringBuilder();
              stringBuilder.append("DialogFragment ");
              stringBuilder.append(this);
              stringBuilder.append(" setting the content view on ");
              stringBuilder.append(d.a(this.a));
              Log.d("FragmentManager", stringBuilder.toString());
            } 
            d.a(this.a).setContentView(view);
            return;
          } 
        } else {
          throw new IllegalStateException("DialogFragment can not be attached to a container view");
        } 
      } 
    }
  }
  
  class e extends g {
    e(d this$0, g param1g) {}
    
    public View a(int param1Int) {
      View view = this.b.c(param1Int);
      return (view != null) ? view : (this.a.c() ? this.a.a(param1Int) : null);
    }
    
    public boolean c() {
      return (this.b.A0() || this.a.c());
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/fragment/app/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */