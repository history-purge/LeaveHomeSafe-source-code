package androidx.biometric;

import android.os.Build;
import android.os.CancellationSignal;
import android.util.Log;

class g {
  private final c a = new a(this);
  
  private CancellationSignal b;
  
  private b.g.j.a c;
  
  void a() {
    if (Build.VERSION.SDK_INT >= 16) {
      CancellationSignal cancellationSignal = this.b;
      if (cancellationSignal != null) {
        try {
          b.a(cancellationSignal);
        } catch (NullPointerException nullPointerException) {
          Log.e("CancelSignalProvider", "Got NPE while canceling biometric authentication.", nullPointerException);
        } 
        this.b = null;
      } 
    } 
    b.g.j.a a1 = this.c;
    if (a1 != null) {
      try {
        a1.a();
      } catch (NullPointerException nullPointerException) {
        Log.e("CancelSignalProvider", "Got NPE while canceling fingerprint authentication.", nullPointerException);
      } 
      this.c = null;
    } 
  }
  
  CancellationSignal b() {
    if (this.b == null)
      this.b = this.a.a(); 
    return this.b;
  }
  
  b.g.j.a c() {
    if (this.c == null)
      this.c = this.a.b(); 
    return this.c;
  }
  
  class a implements c {
    a(g this$0) {}
    
    public CancellationSignal a() {
      return g.b.a();
    }
    
    public b.g.j.a b() {
      return new b.g.j.a();
    }
  }
  
  private static class b {
    static CancellationSignal a() {
      return new CancellationSignal();
    }
    
    static void a(CancellationSignal param1CancellationSignal) {
      param1CancellationSignal.cancel();
    }
  }
  
  static interface c {
    CancellationSignal a();
    
    b.g.j.a b();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/biometric/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */