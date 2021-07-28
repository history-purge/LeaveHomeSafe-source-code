package androidx.biometric;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.x;
import androidx.lifecycle.v;
import androidx.lifecycle.x;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

public class d extends Fragment {
  Handler b0 = new Handler(Looper.getMainLooper());
  
  f c0;
  
  private void C0() {
    if (h() == null)
      return; 
    this.c0 = (f)(new v((x)h())).a(f.class);
    this.c0.g().a((androidx.lifecycle.j)this, new c(this));
    this.c0.e().a((androidx.lifecycle.j)this, new d(this));
    this.c0.f().a((androidx.lifecycle.j)this, new e(this));
    this.c0.v().a((androidx.lifecycle.j)this, new f(this));
    this.c0.D().a((androidx.lifecycle.j)this, new g(this));
    this.c0.A().a((androidx.lifecycle.j)this, new h(this));
  }
  
  private void D0() {
    this.c0.i(false);
    if (P()) {
      androidx.fragment.app.n n = z();
      k k = (k)n.c("androidx.biometric.FingerprintDialogFragment");
      if (k != null) {
        if (k.P()) {
          k.x0();
          return;
        } 
        x x = n.b();
        x.a((Fragment)k);
        x.b();
      } 
    } 
  }
  
  private int E0() {
    Context context = o();
    return (context != null && i.c(context, Build.MODEL)) ? 0 : 2000;
  }
  
  private boolean F0() {
    androidx.fragment.app.e e = h();
    return (e != null && e.isChangingConfigurations());
  }
  
  private boolean G0() {
    androidx.fragment.app.e e = h();
    return (e != null && this.c0.l() != null && i.a((Context)e, Build.MANUFACTURER, Build.MODEL));
  }
  
  private boolean H0() {
    return (Build.VERSION.SDK_INT == 28 && !m.a(o()));
  }
  
  private boolean I0() {
    return (Build.VERSION.SDK_INT < 28 || G0() || H0());
  }
  
  private void J0() {
    androidx.fragment.app.e e = h();
    if (e == null) {
      Log.e("BiometricFragment", "Failed to check device credential. Client FragmentActivity not found.");
      return;
    } 
    KeyguardManager keyguardManager = l.a((Context)e);
    if (keyguardManager == null) {
      b(12, a(t.generic_error_no_keyguard));
      return;
    } 
    CharSequence charSequence3 = this.c0.u();
    CharSequence charSequence1 = this.c0.t();
    CharSequence charSequence2 = this.c0.m();
    if (charSequence1 == null)
      charSequence1 = charSequence2; 
    Intent intent = l.a(keyguardManager, charSequence3, charSequence1);
    if (intent == null) {
      b(14, a(t.generic_error_no_device_credential));
      return;
    } 
    this.c0.c(true);
    if (I0())
      D0(); 
    intent.setFlags(134742016);
    startActivityForResult(intent, 1);
  }
  
  static d K0() {
    return new d();
  }
  
  private void L0() {
    if (!this.c0.w()) {
      Log.w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
      return;
    } 
    this.c0.k().execute(new b(this));
  }
  
  private void M0() {
    BiometricPrompt.Builder builder = m.a(t0().getApplicationContext());
    CharSequence charSequence1 = this.c0.u();
    CharSequence charSequence2 = this.c0.t();
    CharSequence charSequence3 = this.c0.m();
    if (charSequence1 != null)
      m.c(builder, charSequence1); 
    if (charSequence2 != null)
      m.b(builder, charSequence2); 
    if (charSequence3 != null)
      m.a(builder, charSequence3); 
    charSequence1 = this.c0.s();
    if (!TextUtils.isEmpty(charSequence1))
      m.a(builder, charSequence1, this.c0.k(), this.c0.r()); 
    if (Build.VERSION.SDK_INT >= 29)
      n.a(builder, this.c0.x()); 
    int i = this.c0.c();
    int j = Build.VERSION.SDK_INT;
    if (j >= 30) {
      o.a(builder, i);
    } else if (j >= 29) {
      n.b(builder, b.b(i));
    } 
    a(m.a(builder), o());
  }
  
  private void N0() {
    Context context = t0().getApplicationContext();
    b.g.g.a.a a = b.g.g.a.a.a(context);
    int i = a(a);
    if (i != 0) {
      b(i, j.a(context, i));
      return;
    } 
    if (P()) {
      this.c0.f(true);
      if (!i.c(context, Build.MODEL)) {
        this.b0.postDelayed(new i(this), 500L);
        k.E0().a(z(), "androidx.biometric.FingerprintDialogFragment");
      } 
      this.c0.a(0);
      a(a, context);
    } 
  }
  
  private static int a(b.g.g.a.a parama) {
    return !parama.b() ? 12 : (!parama.a() ? 11 : 0);
  }
  
  private void b(BiometricPrompt.b paramb) {
    c(paramb);
    w0();
  }
  
  private void b(CharSequence paramCharSequence) {
    if (paramCharSequence == null)
      paramCharSequence = a(t.default_error_msg); 
    this.c0.c(2);
    this.c0.b(paramCharSequence);
  }
  
  private void c(int paramInt, CharSequence paramCharSequence) {
    if (this.c0.y()) {
      Log.v("BiometricFragment", "Error not sent to client. User is confirming their device credential.");
      return;
    } 
    if (!this.c0.w()) {
      Log.w("BiometricFragment", "Error not sent to client. Client is not awaiting a result.");
      return;
    } 
    this.c0.b(false);
    this.c0.k().execute(new a(this, paramInt, paramCharSequence));
  }
  
  private void c(BiometricPrompt.b paramb) {
    if (!this.c0.w()) {
      Log.w("BiometricFragment", "Success not sent to client. Client is not awaiting a result.");
      return;
    } 
    this.c0.b(false);
    this.c0.k().execute(new k(this, paramb));
  }
  
  private void d(int paramInt) {
    if (paramInt == -1) {
      b(new BiometricPrompt.b(null, 1));
      return;
    } 
    b(10, a(t.generic_error_user_canceled));
  }
  
  void A0() {
    if (Build.VERSION.SDK_INT < 21) {
      Log.e("BiometricFragment", "Failed to check device credential. Not supported prior to API 21.");
      return;
    } 
    J0();
  }
  
  void B0() {
    if (!this.c0.E()) {
      if (o() == null) {
        Log.w("BiometricFragment", "Not showing biometric prompt. Context is null.");
        return;
      } 
      this.c0.i(true);
      this.c0.b(true);
      if (I0()) {
        N0();
        return;
      } 
      M0();
    } 
  }
  
  public void a(int paramInt1, int paramInt2, Intent paramIntent) {
    super.a(paramInt1, paramInt2, paramIntent);
    if (paramInt1 == 1) {
      this.c0.c(false);
      d(paramInt2);
    } 
  }
  
  void a(int paramInt, CharSequence paramCharSequence) {
    if (!j.a(paramInt))
      paramInt = 8; 
    Context context = o();
    int i = Build.VERSION.SDK_INT;
    if (i >= 21 && i < 29 && j.b(paramInt) && context != null && l.b(context) && b.b(this.c0.c())) {
      J0();
      return;
    } 
    if (I0()) {
      if (paramCharSequence == null)
        paramCharSequence = j.a(o(), paramInt); 
      if (paramInt == 5) {
        i = this.c0.h();
        if (i == 0 || i == 3)
          c(paramInt, paramCharSequence); 
        w0();
        return;
      } 
      if (this.c0.B()) {
        b(paramInt, paramCharSequence);
      } else {
        b(paramCharSequence);
        this.b0.postDelayed(new j(this, paramInt, paramCharSequence), E0());
      } 
      this.c0.f(true);
      return;
    } 
    if (paramCharSequence == null) {
      paramCharSequence = new StringBuilder();
      paramCharSequence.append(a(t.default_error_msg));
      paramCharSequence.append(" ");
      paramCharSequence.append(paramInt);
      paramCharSequence = paramCharSequence.toString();
    } 
    b(paramInt, paramCharSequence);
  }
  
  void a(BiometricPrompt paramBiometricPrompt, Context paramContext) {
    String str;
    BiometricPrompt.CryptoObject cryptoObject = h.a(this.c0.l());
    CancellationSignal cancellationSignal = this.c0.i().b();
    p p = new p();
    BiometricPrompt.AuthenticationCallback authenticationCallback = this.c0.d().a();
    if (cryptoObject == null)
      try {
        m.a(paramBiometricPrompt, cancellationSignal, p, authenticationCallback);
        return;
      } catch (NullPointerException nullPointerException) {
        Log.e("BiometricFragment", "Got NPE while authenticating with biometric prompt.", nullPointerException);
        if (paramContext != null) {
          str = paramContext.getString(t.default_error_msg);
        } else {
          str = "";
        } 
        b(1, str);
        return;
      }  
    m.a((BiometricPrompt)str, cryptoObject, cancellationSignal, p, authenticationCallback);
  }
  
  void a(BiometricPrompt.b paramb) {
    b(paramb);
  }
  
  void a(BiometricPrompt.d paramd, BiometricPrompt.c paramc) {
    f f1;
    androidx.fragment.app.e e = h();
    if (e == null) {
      Log.e("BiometricFragment", "Not launching prompt. Client activity was null.");
      return;
    } 
    this.c0.a(paramd);
    int i = b.a(paramd, paramc);
    int j = Build.VERSION.SDK_INT;
    if (j >= 23 && j < 30 && i == 15 && paramc == null) {
      f1 = this.c0;
      paramc = h.a();
    } else {
      f1 = this.c0;
    } 
    f1.a(paramc);
    if (x0()) {
      f1 = this.c0;
      String str = a(t.confirm_device_credential_password);
    } else {
      f1 = this.c0;
      paramc = null;
    } 
    f1.c((CharSequence)paramc);
    if (Build.VERSION.SDK_INT >= 21 && x0() && e.a((Context)e).a(255) != 0) {
      this.c0.b(true);
      J0();
      return;
    } 
    if (this.c0.z()) {
      this.b0.postDelayed(new q(this), 600L);
      return;
    } 
    B0();
  }
  
  void a(b.g.g.a.a parama, Context paramContext) {
    b.g.g.a.a.d d1 = h.b(this.c0.l());
    b.g.j.a a1 = this.c0.i().c();
    b.g.g.a.a.b b = this.c0.d().b();
    try {
      parama.a(d1, 0, a1, b, null);
      return;
    } catch (NullPointerException nullPointerException) {
      Log.e("BiometricFragment", "Got NPE while authenticating with fingerprint.", nullPointerException);
      b(1, j.a(paramContext, 1));
      return;
    } 
  }
  
  void a(CharSequence paramCharSequence) {
    if (I0())
      b(paramCharSequence); 
  }
  
  void b(int paramInt, CharSequence paramCharSequence) {
    c(paramInt, paramCharSequence);
    w0();
  }
  
  void c(int paramInt) {
    if (paramInt != 3 && this.c0.C())
      return; 
    if (I0()) {
      this.c0.a(paramInt);
      if (paramInt == 1)
        c(10, j.a(o(), 10)); 
    } 
    this.c0.i().a();
  }
  
  public void c(Bundle paramBundle) {
    super.c(paramBundle);
    C0();
  }
  
  public void f0() {
    super.f0();
    if (Build.VERSION.SDK_INT == 29 && b.b(this.c0.c())) {
      this.c0.g(true);
      this.b0.postDelayed(new s(this.c0), 250L);
    } 
  }
  
  public void g0() {
    super.g0();
    if (Build.VERSION.SDK_INT < 29 && !this.c0.y() && !F0())
      c(0); 
  }
  
  void w0() {
    this.c0.i(false);
    D0();
    if (!this.c0.y() && P()) {
      x x = z().b();
      x.a(this);
      x.b();
    } 
    Context context = o();
    if (context != null && i.b(context, Build.MODEL)) {
      this.c0.d(true);
      this.b0.postDelayed(new r(this.c0), 600L);
    } 
  }
  
  boolean x0() {
    return (Build.VERSION.SDK_INT <= 28 && b.b(this.c0.c()));
  }
  
  void y0() {
    if (I0())
      b(a(t.fingerprint_not_recognized)); 
    L0();
  }
  
  void z0() {
    CharSequence charSequence = this.c0.s();
    if (charSequence == null)
      charSequence = a(t.default_error_msg); 
    b(13, charSequence);
    c(2);
  }
  
  class a implements Runnable {
    a(d this$0, int param1Int, CharSequence param1CharSequence) {}
    
    public void run() {
      this.e.c0.j().a(this.c, this.d);
    }
  }
  
  class b implements Runnable {
    b(d this$0) {}
    
    public void run() {
      this.c.c0.j().c();
    }
  }
  
  class c implements androidx.lifecycle.p<BiometricPrompt.b> {
    c(d this$0) {}
    
    public void a(BiometricPrompt.b param1b) {
      if (param1b != null) {
        this.a.a(param1b);
        this.a.c0.a((BiometricPrompt.b)null);
      } 
    }
  }
  
  class d implements androidx.lifecycle.p<c> {
    d(d this$0) {}
    
    public void a(c param1c) {
      if (param1c != null) {
        this.a.a(param1c.a(), param1c.b());
        this.a.c0.a((c)null);
      } 
    }
  }
  
  class e implements androidx.lifecycle.p<CharSequence> {
    e(d this$0) {}
    
    public void a(CharSequence param1CharSequence) {
      if (param1CharSequence != null) {
        this.a.a(param1CharSequence);
        this.a.c0.a((c)null);
      } 
    }
  }
  
  class f implements androidx.lifecycle.p<Boolean> {
    f(d this$0) {}
    
    public void a(Boolean param1Boolean) {
      if (param1Boolean.booleanValue()) {
        this.a.y0();
        this.a.c0.a(false);
      } 
    }
  }
  
  class g implements androidx.lifecycle.p<Boolean> {
    g(d this$0) {}
    
    public void a(Boolean param1Boolean) {
      if (param1Boolean.booleanValue()) {
        if (this.a.x0()) {
          this.a.A0();
        } else {
          this.a.z0();
        } 
        this.a.c0.h(false);
      } 
    }
  }
  
  class h implements androidx.lifecycle.p<Boolean> {
    h(d this$0) {}
    
    public void a(Boolean param1Boolean) {
      if (param1Boolean.booleanValue()) {
        this.a.c(1);
        this.a.w0();
        this.a.c0.e(false);
      } 
    }
  }
  
  class i implements Runnable {
    i(d this$0) {}
    
    public void run() {
      this.c.c0.f(false);
    }
  }
  
  class j implements Runnable {
    j(d this$0, int param1Int, CharSequence param1CharSequence) {}
    
    public void run() {
      this.e.b(this.c, this.d);
    }
  }
  
  class k implements Runnable {
    k(d this$0, BiometricPrompt.b param1b) {}
    
    public void run() {
      this.d.c0.j().a(this.c);
    }
  }
  
  private static class l {
    static Intent a(KeyguardManager param1KeyguardManager, CharSequence param1CharSequence1, CharSequence param1CharSequence2) {
      return param1KeyguardManager.createConfirmDeviceCredentialIntent(param1CharSequence1, param1CharSequence2);
    }
  }
  
  private static class m {
    static BiometricPrompt.Builder a(Context param1Context) {
      return new BiometricPrompt.Builder(param1Context);
    }
    
    static BiometricPrompt a(BiometricPrompt.Builder param1Builder) {
      return param1Builder.build();
    }
    
    static void a(BiometricPrompt.Builder param1Builder, CharSequence param1CharSequence) {
      param1Builder.setDescription(param1CharSequence);
    }
    
    static void a(BiometricPrompt.Builder param1Builder, CharSequence param1CharSequence, Executor param1Executor, DialogInterface.OnClickListener param1OnClickListener) {
      param1Builder.setNegativeButton(param1CharSequence, param1Executor, param1OnClickListener);
    }
    
    static void a(BiometricPrompt param1BiometricPrompt, BiometricPrompt.CryptoObject param1CryptoObject, CancellationSignal param1CancellationSignal, Executor param1Executor, BiometricPrompt.AuthenticationCallback param1AuthenticationCallback) {
      param1BiometricPrompt.authenticate(param1CryptoObject, param1CancellationSignal, param1Executor, param1AuthenticationCallback);
    }
    
    static void a(BiometricPrompt param1BiometricPrompt, CancellationSignal param1CancellationSignal, Executor param1Executor, BiometricPrompt.AuthenticationCallback param1AuthenticationCallback) {
      param1BiometricPrompt.authenticate(param1CancellationSignal, param1Executor, param1AuthenticationCallback);
    }
    
    static void b(BiometricPrompt.Builder param1Builder, CharSequence param1CharSequence) {
      param1Builder.setSubtitle(param1CharSequence);
    }
    
    static void c(BiometricPrompt.Builder param1Builder, CharSequence param1CharSequence) {
      param1Builder.setTitle(param1CharSequence);
    }
  }
  
  private static class n {
    static void a(BiometricPrompt.Builder param1Builder, boolean param1Boolean) {
      param1Builder.setConfirmationRequired(param1Boolean);
    }
    
    static void b(BiometricPrompt.Builder param1Builder, boolean param1Boolean) {
      param1Builder.setDeviceCredentialAllowed(param1Boolean);
    }
  }
  
  private static class o {
    static void a(BiometricPrompt.Builder param1Builder, int param1Int) {
      param1Builder.setAllowedAuthenticators(param1Int);
    }
  }
  
  private static class p implements Executor {
    private final Handler c = new Handler(Looper.getMainLooper());
    
    public void execute(Runnable param1Runnable) {
      this.c.post(param1Runnable);
    }
  }
  
  private static class q implements Runnable {
    private final WeakReference<d> c;
    
    q(d param1d) {
      this.c = new WeakReference<d>(param1d);
    }
    
    public void run() {
      if (this.c.get() != null)
        ((d)this.c.get()).B0(); 
    }
  }
  
  private static class r implements Runnable {
    private final WeakReference<f> c;
    
    r(f param1f) {
      this.c = new WeakReference<f>(param1f);
    }
    
    public void run() {
      if (this.c.get() != null)
        ((f)this.c.get()).d(false); 
    }
  }
  
  private static class s implements Runnable {
    private final WeakReference<f> c;
    
    s(f param1f) {
      this.c = new WeakReference<f>(param1f);
    }
    
    public void run() {
      if (this.c.get() != null)
        ((f)this.c.get()).g(false); 
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/biometric/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */