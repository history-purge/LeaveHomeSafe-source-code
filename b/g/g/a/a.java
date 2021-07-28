package b.g.g.a;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

@Deprecated
public class a {
  private final Context a;
  
  private a(Context paramContext) {
    this.a = paramContext;
  }
  
  private static FingerprintManager.AuthenticationCallback a(b paramb) {
    return new a(paramb);
  }
  
  private static FingerprintManager.CryptoObject a(d paramd) {
    FingerprintManager.CryptoObject cryptoObject = null;
    if (paramd == null)
      return null; 
    if (paramd.a() != null)
      return new FingerprintManager.CryptoObject(paramd.a()); 
    if (paramd.c() != null)
      return new FingerprintManager.CryptoObject(paramd.c()); 
    if (paramd.b() != null)
      cryptoObject = new FingerprintManager.CryptoObject(paramd.b()); 
    return cryptoObject;
  }
  
  static d a(FingerprintManager.CryptoObject paramCryptoObject) {
    d d = null;
    if (paramCryptoObject == null)
      return null; 
    if (paramCryptoObject.getCipher() != null)
      return new d(paramCryptoObject.getCipher()); 
    if (paramCryptoObject.getSignature() != null)
      return new d(paramCryptoObject.getSignature()); 
    if (paramCryptoObject.getMac() != null)
      d = new d(paramCryptoObject.getMac()); 
    return d;
  }
  
  public static a a(Context paramContext) {
    return new a(paramContext);
  }
  
  private static FingerprintManager b(Context paramContext) {
    int i = Build.VERSION.SDK_INT;
    return (i == 23 || (i > 23 && paramContext.getPackageManager().hasSystemFeature("android.hardware.fingerprint"))) ? (FingerprintManager)paramContext.getSystemService(FingerprintManager.class) : null;
  }
  
  public void a(d paramd, int paramInt, b.g.j.a parama, b paramb, Handler paramHandler) {
    if (Build.VERSION.SDK_INT >= 23) {
      FingerprintManager fingerprintManager = b(this.a);
      if (fingerprintManager != null) {
        if (parama != null) {
          CancellationSignal cancellationSignal = (CancellationSignal)parama.b();
        } else {
          parama = null;
        } 
        fingerprintManager.authenticate(a(paramd), (CancellationSignal)parama, paramInt, a(paramb), paramHandler);
      } 
    } 
  }
  
  public boolean a() {
    int i = Build.VERSION.SDK_INT;
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (i >= 23) {
      FingerprintManager fingerprintManager = b(this.a);
      bool1 = bool2;
      if (fingerprintManager != null) {
        bool1 = bool2;
        if (fingerprintManager.hasEnrolledFingerprints())
          bool1 = true; 
      } 
    } 
    return bool1;
  }
  
  public boolean b() {
    int i = Build.VERSION.SDK_INT;
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (i >= 23) {
      FingerprintManager fingerprintManager = b(this.a);
      bool1 = bool2;
      if (fingerprintManager != null) {
        bool1 = bool2;
        if (fingerprintManager.isHardwareDetected())
          bool1 = true; 
      } 
    } 
    return bool1;
  }
  
  class a extends FingerprintManager.AuthenticationCallback {
    a(a this$0) {}
    
    public void onAuthenticationError(int param1Int, CharSequence param1CharSequence) {
      this.a.a(param1Int, param1CharSequence);
    }
    
    public void onAuthenticationFailed() {
      this.a.a();
    }
    
    public void onAuthenticationHelp(int param1Int, CharSequence param1CharSequence) {
      this.a.b(param1Int, param1CharSequence);
    }
    
    public void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult param1AuthenticationResult) {
      this.a.a(new a.c(a.a(param1AuthenticationResult.getCryptoObject())));
    }
  }
  
  public static abstract class b {
    public abstract void a();
    
    public abstract void a(int param1Int, CharSequence param1CharSequence);
    
    public abstract void a(a.c param1c);
    
    public abstract void b(int param1Int, CharSequence param1CharSequence);
  }
  
  public static final class c {
    private final a.d a;
    
    public c(a.d param1d) {
      this.a = param1d;
    }
    
    public a.d a() {
      return this.a;
    }
  }
  
  public static class d {
    private final Signature a;
    
    private final Cipher b;
    
    private final Mac c;
    
    public d(Signature param1Signature) {
      this.a = param1Signature;
      this.b = null;
      this.c = null;
    }
    
    public d(Cipher param1Cipher) {
      this.b = param1Cipher;
      this.a = null;
      this.c = null;
    }
    
    public d(Mac param1Mac) {
      this.c = param1Mac;
      this.b = null;
      this.a = null;
    }
    
    public Cipher a() {
      return this.b;
    }
    
    public Mac b() {
      return this.c;
    }
    
    public Signature c() {
      return this.a;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/g/g/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */