package androidx.biometric;

import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;

class a {
  private BiometricPrompt.AuthenticationCallback a;
  
  private b.g.g.a.a.b b;
  
  final d c;
  
  a(d paramd) {
    this.c = paramd;
  }
  
  BiometricPrompt.AuthenticationCallback a() {
    if (this.a == null)
      this.a = b.a(this.c); 
    return this.a;
  }
  
  b.g.g.a.a.b b() {
    if (this.b == null)
      this.b = new a(this); 
    return this.b;
  }
  
  class a extends b.g.g.a.a.b {
    a(a this$0) {}
    
    public void a() {
      this.a.c.a();
    }
    
    public void a(int param1Int, CharSequence param1CharSequence) {
      this.a.c.a(param1Int, param1CharSequence);
    }
    
    public void a(b.g.g.a.a.c param1c) {
      if (param1c != null) {
        BiometricPrompt.c c1 = h.a(param1c.a());
      } else {
        param1c = null;
      } 
      BiometricPrompt.b b1 = new BiometricPrompt.b((BiometricPrompt.c)param1c, 2);
      this.a.c.a(b1);
    }
    
    public void b(int param1Int, CharSequence param1CharSequence) {
      this.a.c.a(param1CharSequence);
    }
  }
  
  private static class b {
    static BiometricPrompt.AuthenticationCallback a(a.d param1d) {
      return new a(param1d);
    }
    
    class a extends BiometricPrompt.AuthenticationCallback {
      a(a.b this$0) {}
      
      public void onAuthenticationError(int param2Int, CharSequence param2CharSequence) {
        this.a.a(param2Int, param2CharSequence);
      }
      
      public void onAuthenticationFailed() {
        this.a.a();
      }
      
      public void onAuthenticationHelp(int param2Int, CharSequence param2CharSequence) {}
      
      public void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult param2AuthenticationResult) {
        BiometricPrompt.c c;
        if (param2AuthenticationResult != null) {
          c = h.a(param2AuthenticationResult.getCryptoObject());
        } else {
          c = null;
        } 
        int j = Build.VERSION.SDK_INT;
        int i = -1;
        if (j >= 30) {
          if (param2AuthenticationResult != null)
            i = a.c.a(param2AuthenticationResult); 
        } else if (j != 29) {
          i = 2;
        } 
        BiometricPrompt.b b = new BiometricPrompt.b(c, i);
        this.a.a(b);
      }
    }
  }
  
  class a extends BiometricPrompt.AuthenticationCallback {
    a(a this$0) {}
    
    public void onAuthenticationError(int param1Int, CharSequence param1CharSequence) {
      this.a.a(param1Int, param1CharSequence);
    }
    
    public void onAuthenticationFailed() {
      this.a.a();
    }
    
    public void onAuthenticationHelp(int param1Int, CharSequence param1CharSequence) {}
    
    public void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult param1AuthenticationResult) {
      BiometricPrompt.c c;
      if (param1AuthenticationResult != null) {
        c = h.a(param1AuthenticationResult.getCryptoObject());
      } else {
        c = null;
      } 
      int j = Build.VERSION.SDK_INT;
      int i = -1;
      if (j >= 30) {
        if (param1AuthenticationResult != null)
          i = a.c.a(param1AuthenticationResult); 
      } else if (j != 29) {
        i = 2;
      } 
      BiometricPrompt.b b = new BiometricPrompt.b(c, i);
      this.a.a(b);
    }
  }
  
  private static class c {
    static int a(BiometricPrompt.AuthenticationResult param1AuthenticationResult) {
      return param1AuthenticationResult.getAuthenticationType();
    }
  }
  
  static class d {
    void a() {
      throw null;
    }
    
    void a(int param1Int, CharSequence param1CharSequence) {
      throw null;
    }
    
    void a(BiometricPrompt.b param1b) {
      throw null;
    }
    
    void a(CharSequence param1CharSequence) {
      throw null;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/biometric/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */