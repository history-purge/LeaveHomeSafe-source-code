package androidx.biometric;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.d;
import androidx.lifecycle.j;
import androidx.lifecycle.p;
import androidx.lifecycle.v;
import androidx.lifecycle.x;

public class k extends d {
  final Handler r0 = new Handler(Looper.getMainLooper());
  
  final Runnable s0 = new a(this);
  
  f t0;
  
  private int u0;
  
  private int v0;
  
  private ImageView w0;
  
  TextView x0;
  
  private void D0() {
    androidx.fragment.app.e e = h();
    if (e == null)
      return; 
    this.t0 = (f)(new v((x)e)).a(f.class);
    this.t0.p().a((j)this, new c(this));
    this.t0.n().a((j)this, new d(this));
  }
  
  static k E0() {
    return new k();
  }
  
  private Drawable a(int paramInt1, int paramInt2) {
    Context context = o();
    if (context == null) {
      Log.w("FingerprintFragment", "Unable to get asset. Context is null.");
      return null;
    } 
    if (paramInt1 != 0 || paramInt2 != 1) {
      if (paramInt1 == 1 && paramInt2 == 2) {
        paramInt1 = q.fingerprint_dialog_error;
      } else {
        if ((paramInt1 != 2 || paramInt2 != 1) && (paramInt1 != 1 || paramInt2 != 3))
          return null; 
        paramInt1 = q.fingerprint_dialog_fp_icon;
      } 
      return b.g.e.a.c(context, paramInt1);
    } 
    paramInt1 = q.fingerprint_dialog_fp_icon;
  }
  
  private boolean b(int paramInt1, int paramInt2) {
    if (paramInt1 == 0 && paramInt2 == 1)
      return false; 
    if (paramInt1 == 1 && paramInt2 == 2)
      return true; 
    if (paramInt1 == 2 && paramInt2 == 1)
      return true; 
    if (paramInt1 != 1 || paramInt2 == 3);
    return false;
  }
  
  private int f(int paramInt) {
    Context context = o();
    androidx.fragment.app.e e = h();
    if (context == null || e == null) {
      Log.w("FingerprintFragment", "Unable to get themed color. Context or activity is null.");
      return 0;
    } 
    TypedValue typedValue = new TypedValue();
    context.getTheme().resolveAttribute(paramInt, typedValue, true);
    TypedArray typedArray = e.obtainStyledAttributes(typedValue.data, new int[] { paramInt });
    paramInt = typedArray.getColor(0, 0);
    typedArray.recycle();
    return paramInt;
  }
  
  void C0() {
    Context context = o();
    if (context == null) {
      Log.w("FingerprintFragment", "Not resetting the dialog. Context is null.");
      return;
    } 
    this.t0.c(1);
    this.t0.b(context.getString(t.fingerprint_dialog_touch_sensor));
  }
  
  void a(CharSequence paramCharSequence) {
    TextView textView = this.x0;
    if (textView != null)
      textView.setText(paramCharSequence); 
  }
  
  public void c(Bundle paramBundle) {
    boolean bool;
    super.c(paramBundle);
    D0();
    if (Build.VERSION.SDK_INT >= 26) {
      bool = f(f.a());
    } else {
      Context context = o();
      if (context != null) {
        bool = b.g.e.a.a(context, p.biometric_error_color);
      } else {
        bool = false;
      } 
    } 
    this.u0 = bool;
    this.v0 = f(16842808);
  }
  
  void d(int paramInt) {
    if (this.w0 == null)
      return; 
    if (Build.VERSION.SDK_INT >= 23) {
      int i = this.t0.o();
      Drawable drawable = a(i, paramInt);
      if (drawable == null)
        return; 
      this.w0.setImageDrawable(drawable);
      if (b(i, paramInt))
        e.a(drawable); 
      this.t0.b(paramInt);
    } 
  }
  
  public void d0() {
    super.d0();
    this.r0.removeCallbacksAndMessages(null);
  }
  
  void e(int paramInt) {
    if (this.x0 != null) {
      if (paramInt == 2) {
        paramInt = 1;
      } else {
        paramInt = 0;
      } 
      TextView textView = this.x0;
      if (paramInt != 0) {
        paramInt = this.u0;
      } else {
        paramInt = this.v0;
      } 
      textView.setTextColor(paramInt);
    } 
  }
  
  public void e0() {
    super.e0();
    this.t0.b(0);
    this.t0.c(1);
    this.t0.b(a(t.fingerprint_dialog_touch_sensor));
  }
  
  public Dialog n(Bundle paramBundle) {
    CharSequence charSequence;
    androidx.appcompat.app.c.a a = new androidx.appcompat.app.c.a(t0());
    a.a(this.t0.u());
    View view = LayoutInflater.from(a.b()).inflate(s.fingerprint_dialog_layout, null);
    TextView textView = (TextView)view.findViewById(r.fingerprint_subtitle);
    if (textView != null) {
      CharSequence charSequence1 = this.t0.t();
      if (TextUtils.isEmpty(charSequence1)) {
        textView.setVisibility(8);
      } else {
        textView.setVisibility(0);
        textView.setText(charSequence1);
      } 
    } 
    textView = (TextView)view.findViewById(r.fingerprint_description);
    if (textView != null) {
      CharSequence charSequence1 = this.t0.m();
      if (TextUtils.isEmpty(charSequence1)) {
        textView.setVisibility(8);
      } else {
        textView.setVisibility(0);
        textView.setText(charSequence1);
      } 
    } 
    this.w0 = (ImageView)view.findViewById(r.fingerprint_icon);
    this.x0 = (TextView)view.findViewById(r.fingerprint_error);
    if (b.b(this.t0.c())) {
      charSequence = a(t.confirm_device_credential_password);
    } else {
      charSequence = this.t0.s();
    } 
    a.a(charSequence, new b(this));
    a.b(view);
    androidx.appcompat.app.c c = a.a();
    c.setCanceledOnTouchOutside(false);
    return (Dialog)c;
  }
  
  public void onCancel(DialogInterface paramDialogInterface) {
    super.onCancel(paramDialogInterface);
    this.t0.e(true);
  }
  
  class a implements Runnable {
    a(k this$0) {}
    
    public void run() {
      this.c.C0();
    }
  }
  
  class b implements DialogInterface.OnClickListener {
    b(k this$0) {}
    
    public void onClick(DialogInterface param1DialogInterface, int param1Int) {
      this.c.t0.h(true);
    }
  }
  
  class c implements p<Integer> {
    c(k this$0) {}
    
    public void a(Integer param1Integer) {
      k k2 = this.a;
      k2.r0.removeCallbacks(k2.s0);
      this.a.d(param1Integer.intValue());
      this.a.e(param1Integer.intValue());
      k k1 = this.a;
      k1.r0.postDelayed(k1.s0, 2000L);
    }
  }
  
  class d implements p<CharSequence> {
    d(k this$0) {}
    
    public void a(CharSequence param1CharSequence) {
      k k2 = this.a;
      k2.r0.removeCallbacks(k2.s0);
      this.a.a(param1CharSequence);
      k k1 = this.a;
      k1.r0.postDelayed(k1.s0, 2000L);
    }
  }
  
  private static class e {
    static void a(Drawable param1Drawable) {
      if (param1Drawable instanceof AnimatedVectorDrawable)
        ((AnimatedVectorDrawable)param1Drawable).start(); 
    }
  }
  
  private static class f {
    static int a() {
      return o.colorError;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/biometric/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */