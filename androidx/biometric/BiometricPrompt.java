package androidx.biometric;

import android.annotation.SuppressLint;
import android.os.Build;
import android.security.identity.IdentityCredential;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.e;
import androidx.fragment.app.n;
import androidx.fragment.app.x;
import androidx.lifecycle.g;
import androidx.lifecycle.i;
import androidx.lifecycle.q;
import androidx.lifecycle.v;
import androidx.lifecycle.x;
import java.lang.ref.WeakReference;
import java.security.Signature;
import java.util.concurrent.Executor;
import javax.crypto.Cipher;
import javax.crypto.Mac;

public class BiometricPrompt {
  private n a;
  
  @SuppressLint({"LambdaLast"})
  public BiometricPrompt(e parame, Executor paramExecutor, a parama) {
    if (parame != null) {
      if (paramExecutor != null) {
        if (parama != null) {
          a(parame.k(), a(parame), paramExecutor, parama);
          return;
        } 
        throw new IllegalArgumentException("AuthenticationCallback must not be null.");
      } 
      throw new IllegalArgumentException("Executor must not be null.");
    } 
    throw new IllegalArgumentException("FragmentActivity must not be null.");
  }
  
  private static d a(n paramn) {
    return (d)paramn.c("androidx.biometric.BiometricFragment");
  }
  
  private static f a(e parame) {
    return (parame != null) ? (f)(new v((x)parame)).a(f.class) : null;
  }
  
  private void a(d paramd, c paramc) {
    n n1 = this.a;
    if (n1 == null) {
      Log.e("BiometricPromptCompat", "Unable to start authentication. Client fragment manager was null.");
      return;
    } 
    if (n1.D()) {
      Log.e("BiometricPromptCompat", "Unable to start authentication. Called after onSaveInstanceState().");
      return;
    } 
    b(this.a).a(paramd, paramc);
  }
  
  private void a(n paramn, f paramf, Executor paramExecutor, a parama) {
    this.a = paramn;
    if (paramf != null) {
      if (paramExecutor != null)
        paramf.a(paramExecutor); 
      paramf.a(parama);
    } 
  }
  
  private static d b(n paramn) {
    d d2 = a(paramn);
    d d1 = d2;
    if (d2 == null) {
      d1 = d.K0();
      x x = paramn.b();
      x.a(d1, "androidx.biometric.BiometricFragment");
      x.b();
      paramn.p();
    } 
    return d1;
  }
  
  public void a() {
    n n1 = this.a;
    if (n1 == null) {
      Log.e("BiometricPromptCompat", "Unable to start authentication. Client fragment manager was null.");
      return;
    } 
    d d = a(n1);
    if (d == null) {
      Log.e("BiometricPromptCompat", "Unable to cancel authentication. BiometricFragment not found.");
      return;
    } 
    d.c(3);
  }
  
  public void a(d paramd) {
    if (paramd != null) {
      a(paramd, null);
      return;
    } 
    throw new IllegalArgumentException("PromptInfo cannot be null.");
  }
  
  private static class ResetCallbackObserver implements i {
    private final WeakReference<f> c;
    
    @q(g.b.ON_DESTROY)
    public void resetCallback() {
      if (this.c.get() != null)
        ((f)this.c.get()).F(); 
    }
  }
  
  public static abstract class a {
    public void a(int param1Int, CharSequence param1CharSequence) {}
    
    public void a(BiometricPrompt.b param1b) {}
    
    public void c() {}
  }
  
  public static class b {
    private final BiometricPrompt.c a;
    
    private final int b;
    
    b(BiometricPrompt.c param1c, int param1Int) {
      this.a = param1c;
      this.b = param1Int;
    }
    
    public int a() {
      return this.b;
    }
    
    public BiometricPrompt.c b() {
      return this.a;
    }
  }
  
  public static class c {
    private final Signature a = null;
    
    private final Cipher b = null;
    
    private final Mac c = null;
    
    private final IdentityCredential d;
    
    public c(IdentityCredential param1IdentityCredential) {
      this.d = param1IdentityCredential;
    }
    
    public c(Signature param1Signature) {
      this.d = null;
    }
    
    public c(Cipher param1Cipher) {
      this.d = null;
    }
    
    public c(Mac param1Mac) {
      this.d = null;
    }
    
    public Cipher a() {
      return this.b;
    }
    
    public IdentityCredential b() {
      return this.d;
    }
    
    public Mac c() {
      return this.c;
    }
    
    public Signature d() {
      return this.a;
    }
  }
  
  public static class d {
    private final CharSequence a;
    
    private final CharSequence b;
    
    private final CharSequence c;
    
    private final CharSequence d;
    
    private final boolean e;
    
    private final boolean f;
    
    private final int g;
    
    d(CharSequence param1CharSequence1, CharSequence param1CharSequence2, CharSequence param1CharSequence3, CharSequence param1CharSequence4, boolean param1Boolean1, boolean param1Boolean2, int param1Int) {
      this.a = param1CharSequence1;
      this.b = param1CharSequence2;
      this.c = param1CharSequence3;
      this.d = param1CharSequence4;
      this.e = param1Boolean1;
      this.f = param1Boolean2;
      this.g = param1Int;
    }
    
    public int a() {
      return this.g;
    }
    
    public CharSequence b() {
      return this.c;
    }
    
    public CharSequence c() {
      CharSequence charSequence = this.d;
      return (charSequence != null) ? charSequence : "";
    }
    
    public CharSequence d() {
      return this.b;
    }
    
    public CharSequence e() {
      return this.a;
    }
    
    public boolean f() {
      return this.e;
    }
    
    @Deprecated
    public boolean g() {
      return this.f;
    }
    
    public static class a {
      private CharSequence a = null;
      
      private CharSequence b = null;
      
      private CharSequence c = null;
      
      private CharSequence d = null;
      
      private boolean e = true;
      
      private boolean f = false;
      
      private int g = 0;
      
      public a a(int param2Int) {
        this.g = param2Int;
        return this;
      }
      
      public a a(CharSequence param2CharSequence) {
        this.c = param2CharSequence;
        return this;
      }
      
      public a a(boolean param2Boolean) {
        this.e = param2Boolean;
        return this;
      }
      
      public BiometricPrompt.d a() {
        if (!TextUtils.isEmpty(this.a)) {
          if (b.d(this.g)) {
            boolean bool;
            int i = this.g;
            if (i != 0) {
              bool = b.b(i);
            } else {
              bool = this.f;
            } 
            if (!TextUtils.isEmpty(this.d) || bool) {
              if (TextUtils.isEmpty(this.d) || !bool)
                return new BiometricPrompt.d(this.a, this.b, this.c, this.d, this.e, this.f, this.g); 
              throw new IllegalArgumentException("Negative text must not be set if device credential authentication is allowed.");
            } 
            throw new IllegalArgumentException("Negative text must be set and non-empty.");
          } 
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Authenticator combination is unsupported on API ");
          stringBuilder.append(Build.VERSION.SDK_INT);
          stringBuilder.append(": ");
          stringBuilder.append(b.a(this.g));
          throw new IllegalArgumentException(stringBuilder.toString());
        } 
        throw new IllegalArgumentException("Title must be set and non-empty.");
      }
      
      public a b(CharSequence param2CharSequence) {
        this.d = param2CharSequence;
        return this;
      }
      
      @Deprecated
      public a b(boolean param2Boolean) {
        this.f = param2Boolean;
        return this;
      }
      
      public a c(CharSequence param2CharSequence) {
        this.b = param2CharSequence;
        return this;
      }
      
      public a d(CharSequence param2CharSequence) {
        this.a = param2CharSequence;
        return this;
      }
    }
  }
  
  public static class a {
    private CharSequence a = null;
    
    private CharSequence b = null;
    
    private CharSequence c = null;
    
    private CharSequence d = null;
    
    private boolean e = true;
    
    private boolean f = false;
    
    private int g = 0;
    
    public a a(int param1Int) {
      this.g = param1Int;
      return this;
    }
    
    public a a(CharSequence param1CharSequence) {
      this.c = param1CharSequence;
      return this;
    }
    
    public a a(boolean param1Boolean) {
      this.e = param1Boolean;
      return this;
    }
    
    public BiometricPrompt.d a() {
      if (!TextUtils.isEmpty(this.a)) {
        if (b.d(this.g)) {
          boolean bool;
          int i = this.g;
          if (i != 0) {
            bool = b.b(i);
          } else {
            bool = this.f;
          } 
          if (!TextUtils.isEmpty(this.d) || bool) {
            if (TextUtils.isEmpty(this.d) || !bool)
              return new BiometricPrompt.d(this.a, this.b, this.c, this.d, this.e, this.f, this.g); 
            throw new IllegalArgumentException("Negative text must not be set if device credential authentication is allowed.");
          } 
          throw new IllegalArgumentException("Negative text must be set and non-empty.");
        } 
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Authenticator combination is unsupported on API ");
        stringBuilder.append(Build.VERSION.SDK_INT);
        stringBuilder.append(": ");
        stringBuilder.append(b.a(this.g));
        throw new IllegalArgumentException(stringBuilder.toString());
      } 
      throw new IllegalArgumentException("Title must be set and non-empty.");
    }
    
    public a b(CharSequence param1CharSequence) {
      this.d = param1CharSequence;
      return this;
    }
    
    @Deprecated
    public a b(boolean param1Boolean) {
      this.f = param1Boolean;
      return this;
    }
    
    public a c(CharSequence param1CharSequence) {
      this.b = param1CharSequence;
      return this;
    }
    
    public a d(CharSequence param1CharSequence) {
      this.a = param1CharSequence;
      return this;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/biometric/BiometricPrompt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */