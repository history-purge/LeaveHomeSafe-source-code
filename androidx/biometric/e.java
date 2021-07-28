package androidx.biometric;

import android.content.Context;
import android.hardware.biometrics.BiometricManager;
import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class e {
  private final d a;
  
  private final BiometricManager b;
  
  private final b.g.g.a.a c;
  
  e(d paramd) {
    b.g.g.a.a a1;
    this.a = paramd;
    int i = Build.VERSION.SDK_INT;
    BiometricManager biometricManager2 = null;
    if (i >= 29) {
      biometricManager1 = paramd.b();
    } else {
      biometricManager1 = null;
    } 
    this.b = biometricManager1;
    BiometricManager biometricManager1 = biometricManager2;
    if (Build.VERSION.SDK_INT <= 29)
      a1 = paramd.f(); 
    this.c = a1;
  }
  
  public static e a(Context paramContext) {
    return new e(new c(paramContext));
  }
  
  private int b() {
    b.g.g.a.a a1 = this.c;
    if (a1 == null) {
      Log.e("BiometricManager", "Failure in canAuthenticate(). FingerprintManager was null.");
      return 1;
    } 
    return !a1.b() ? 12 : (!this.c.a() ? 11 : 0);
  }
  
  private int b(int paramInt) {
    if (!b.d(paramInt))
      return -2; 
    byte b = 12;
    if (paramInt == 0)
      return 12; 
    if (!this.a.e())
      return 12; 
    if (b.b(paramInt))
      return this.a.c() ? 0 : 11; 
    int i = Build.VERSION.SDK_INT;
    if (i == 29)
      return b.e(paramInt) ? e() : d(); 
    if (i == 28) {
      paramInt = b;
      if (this.a.a())
        paramInt = c(); 
      return paramInt;
    } 
    return b();
  }
  
  private int c() {
    return !this.a.c() ? b() : ((b() == 0) ? 0 : -1);
  }
  
  private int d() {
    Method method = a.a();
    if (method != null) {
      BiometricPrompt.CryptoObject cryptoObject = h.a(h.a());
      if (cryptoObject != null)
        try {
          Object object = method.invoke(this.b, new Object[] { cryptoObject });
          if (object instanceof Integer)
            return ((Integer)object).intValue(); 
          Log.w("BiometricManager", "Invalid return type for canAuthenticate(CryptoObject).");
        } catch (IllegalAccessException illegalAccessException) {
          Log.w("BiometricManager", "Failed to invoke canAuthenticate(CryptoObject).", illegalAccessException);
        } catch (IllegalArgumentException illegalArgumentException) {
        
        } catch (InvocationTargetException invocationTargetException) {} 
    } 
    int j = e();
    int i = j;
    if (!this.a.d()) {
      if (j != 0)
        return j; 
      i = c();
    } 
    return i;
  }
  
  private int e() {
    BiometricManager biometricManager = this.b;
    if (biometricManager == null) {
      Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
      return 1;
    } 
    return a.a(biometricManager);
  }
  
  @Deprecated
  public int a() {
    return a(255);
  }
  
  public int a(int paramInt) {
    if (Build.VERSION.SDK_INT >= 30) {
      BiometricManager biometricManager = this.b;
      if (biometricManager == null) {
        Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
        return 1;
      } 
      return b.a(biometricManager, paramInt);
    } 
    return b(paramInt);
  }
  
  private static class a {
    static int a(BiometricManager param1BiometricManager) {
      return param1BiometricManager.canAuthenticate();
    }
    
    static BiometricManager a(Context param1Context) {
      return (BiometricManager)param1Context.getSystemService(BiometricManager.class);
    }
    
    static Method a() {
      try {
        return BiometricManager.class.getMethod("canAuthenticate", new Class[] { BiometricPrompt.CryptoObject.class });
      } catch (NoSuchMethodException noSuchMethodException) {
        return null;
      } 
    }
  }
  
  private static class b {
    static int a(BiometricManager param1BiometricManager, int param1Int) {
      return param1BiometricManager.canAuthenticate(param1Int);
    }
  }
  
  private static class c implements d {
    private final Context a;
    
    c(Context param1Context) {
      this.a = param1Context.getApplicationContext();
    }
    
    public boolean a() {
      return m.a(this.a);
    }
    
    public BiometricManager b() {
      return e.a.a(this.a);
    }
    
    public boolean c() {
      return l.b(this.a);
    }
    
    public boolean d() {
      return i.a(this.a, Build.MODEL);
    }
    
    public boolean e() {
      return (l.a(this.a) != null);
    }
    
    public b.g.g.a.a f() {
      return b.g.g.a.a.a(this.a);
    }
  }
  
  static interface d {
    boolean a();
    
    BiometricManager b();
    
    boolean c();
    
    boolean d();
    
    boolean e();
    
    b.g.g.a.a f();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/biometric/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */