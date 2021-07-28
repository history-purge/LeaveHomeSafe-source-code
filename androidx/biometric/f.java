package androidx.biometric;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.o;
import androidx.lifecycle.u;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

public class f extends u {
  private Executor c;
  
  private BiometricPrompt.a d;
  
  private BiometricPrompt.d e;
  
  private BiometricPrompt.c f;
  
  private a g;
  
  private g h;
  
  private DialogInterface.OnClickListener i;
  
  private CharSequence j;
  
  private int k = 0;
  
  private boolean l;
  
  private boolean m;
  
  private boolean n;
  
  private boolean o;
  
  private boolean p;
  
  private o<BiometricPrompt.b> q;
  
  private o<c> r;
  
  private o<CharSequence> s;
  
  private o<Boolean> t;
  
  private o<Boolean> u;
  
  private boolean v = true;
  
  private o<Boolean> w;
  
  private int x = 0;
  
  private o<Integer> y;
  
  private o<CharSequence> z;
  
  private static <T> void a(o<T> paramo, T paramT) {
    if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
      paramo.b(paramT);
      return;
    } 
    paramo.a(paramT);
  }
  
  LiveData<Boolean> A() {
    if (this.w == null)
      this.w = new o(); 
    return (LiveData<Boolean>)this.w;
  }
  
  boolean B() {
    return this.v;
  }
  
  boolean C() {
    return this.p;
  }
  
  LiveData<Boolean> D() {
    if (this.u == null)
      this.u = new o(); 
    return (LiveData<Boolean>)this.u;
  }
  
  boolean E() {
    return this.l;
  }
  
  void F() {
    this.d = null;
  }
  
  void a(int paramInt) {
    this.k = paramInt;
  }
  
  void a(BiometricPrompt.a parama) {
    this.d = parama;
  }
  
  void a(BiometricPrompt.b paramb) {
    if (this.q == null)
      this.q = new o(); 
    a(this.q, paramb);
  }
  
  void a(BiometricPrompt.c paramc) {
    this.f = paramc;
  }
  
  void a(BiometricPrompt.d paramd) {
    this.e = paramd;
  }
  
  void a(c paramc) {
    if (this.r == null)
      this.r = new o(); 
    a(this.r, paramc);
  }
  
  void a(CharSequence paramCharSequence) {
    if (this.s == null)
      this.s = new o(); 
    a(this.s, paramCharSequence);
  }
  
  void a(Executor paramExecutor) {
    this.c = paramExecutor;
  }
  
  void a(boolean paramBoolean) {
    if (this.t == null)
      this.t = new o(); 
    a(this.t, Boolean.valueOf(paramBoolean));
  }
  
  void b(int paramInt) {
    this.x = paramInt;
  }
  
  void b(CharSequence paramCharSequence) {
    if (this.z == null)
      this.z = new o(); 
    a(this.z, paramCharSequence);
  }
  
  void b(boolean paramBoolean) {
    this.m = paramBoolean;
  }
  
  int c() {
    BiometricPrompt.d d1 = this.e;
    return (d1 != null) ? b.a(d1, this.f) : 0;
  }
  
  void c(int paramInt) {
    if (this.y == null)
      this.y = new o(); 
    a(this.y, Integer.valueOf(paramInt));
  }
  
  void c(CharSequence paramCharSequence) {
    this.j = paramCharSequence;
  }
  
  void c(boolean paramBoolean) {
    this.n = paramBoolean;
  }
  
  a d() {
    if (this.g == null)
      this.g = new a(new b(this)); 
    return this.g;
  }
  
  void d(boolean paramBoolean) {
    this.o = paramBoolean;
  }
  
  o<c> e() {
    if (this.r == null)
      this.r = new o(); 
    return this.r;
  }
  
  void e(boolean paramBoolean) {
    if (this.w == null)
      this.w = new o(); 
    a(this.w, Boolean.valueOf(paramBoolean));
  }
  
  LiveData<CharSequence> f() {
    if (this.s == null)
      this.s = new o(); 
    return (LiveData<CharSequence>)this.s;
  }
  
  void f(boolean paramBoolean) {
    this.v = paramBoolean;
  }
  
  LiveData<BiometricPrompt.b> g() {
    if (this.q == null)
      this.q = new o(); 
    return (LiveData<BiometricPrompt.b>)this.q;
  }
  
  void g(boolean paramBoolean) {
    this.p = paramBoolean;
  }
  
  int h() {
    return this.k;
  }
  
  void h(boolean paramBoolean) {
    if (this.u == null)
      this.u = new o(); 
    a(this.u, Boolean.valueOf(paramBoolean));
  }
  
  g i() {
    if (this.h == null)
      this.h = new g(); 
    return this.h;
  }
  
  void i(boolean paramBoolean) {
    this.l = paramBoolean;
  }
  
  BiometricPrompt.a j() {
    if (this.d == null)
      this.d = new a(this); 
    return this.d;
  }
  
  Executor k() {
    Executor executor = this.c;
    return (executor != null) ? executor : new c();
  }
  
  BiometricPrompt.c l() {
    return this.f;
  }
  
  CharSequence m() {
    BiometricPrompt.d d1 = this.e;
    return (d1 != null) ? d1.b() : null;
  }
  
  LiveData<CharSequence> n() {
    if (this.z == null)
      this.z = new o(); 
    return (LiveData<CharSequence>)this.z;
  }
  
  int o() {
    return this.x;
  }
  
  LiveData<Integer> p() {
    if (this.y == null)
      this.y = new o(); 
    return (LiveData<Integer>)this.y;
  }
  
  int q() {
    int i = c();
    return (b.c(i) && !b.b(i)) ? 2 : -1;
  }
  
  DialogInterface.OnClickListener r() {
    if (this.i == null)
      this.i = new d(this); 
    return this.i;
  }
  
  CharSequence s() {
    CharSequence charSequence = this.j;
    if (charSequence != null)
      return charSequence; 
    BiometricPrompt.d d1 = this.e;
    return (d1 != null) ? d1.c() : null;
  }
  
  CharSequence t() {
    BiometricPrompt.d d1 = this.e;
    return (d1 != null) ? d1.d() : null;
  }
  
  CharSequence u() {
    BiometricPrompt.d d1 = this.e;
    return (d1 != null) ? d1.e() : null;
  }
  
  LiveData<Boolean> v() {
    if (this.t == null)
      this.t = new o(); 
    return (LiveData<Boolean>)this.t;
  }
  
  boolean w() {
    return this.m;
  }
  
  boolean x() {
    BiometricPrompt.d d1 = this.e;
    return (d1 == null || d1.f());
  }
  
  boolean y() {
    return this.n;
  }
  
  boolean z() {
    return this.o;
  }
  
  class a extends BiometricPrompt.a {
    a(f this$0) {}
  }
  
  private static final class b extends a.d {
    private final WeakReference<f> a;
    
    b(f param1f) {
      this.a = new WeakReference<f>(param1f);
    }
    
    void a() {
      if (this.a.get() != null && ((f)this.a.get()).w())
        ((f)this.a.get()).a(true); 
    }
    
    void a(int param1Int, CharSequence param1CharSequence) {
      if (this.a.get() != null && !((f)this.a.get()).y() && ((f)this.a.get()).w())
        ((f)this.a.get()).a(new c(param1Int, param1CharSequence)); 
    }
    
    void a(BiometricPrompt.b param1b) {
      if (this.a.get() != null && ((f)this.a.get()).w()) {
        BiometricPrompt.b b1 = param1b;
        if (param1b.a() == -1)
          b1 = new BiometricPrompt.b(param1b.b(), ((f)this.a.get()).q()); 
        ((f)this.a.get()).a(b1);
      } 
    }
    
    void a(CharSequence param1CharSequence) {
      if (this.a.get() != null)
        ((f)this.a.get()).a(param1CharSequence); 
    }
  }
  
  private static class c implements Executor {
    private final Handler c = new Handler(Looper.getMainLooper());
    
    public void execute(Runnable param1Runnable) {
      this.c.post(param1Runnable);
    }
  }
  
  private static class d implements DialogInterface.OnClickListener {
    private final WeakReference<f> c;
    
    d(f param1f) {
      this.c = new WeakReference<f>(param1f);
    }
    
    public void onClick(DialogInterface param1DialogInterface, int param1Int) {
      if (this.c.get() != null)
        ((f)this.c.get()).h(true); 
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/biometric/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */