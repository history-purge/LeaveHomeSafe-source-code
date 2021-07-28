package androidx.biometric;

import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.security.identity.IdentityCredential;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Signature;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

class h {
  static BiometricPrompt.CryptoObject a(BiometricPrompt.c paramc) {
    if (paramc == null)
      return null; 
    Cipher cipher = paramc.a();
    if (cipher != null)
      return b.a(cipher); 
    Signature signature = paramc.d();
    if (signature != null)
      return b.a(signature); 
    Mac mac = paramc.c();
    if (mac != null)
      return b.a(mac); 
    if (Build.VERSION.SDK_INT >= 30) {
      IdentityCredential identityCredential = paramc.b();
      if (identityCredential != null)
        return c.a(identityCredential); 
    } 
    return null;
  }
  
  static BiometricPrompt.c a() {
    try {
      KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
      keyStore.load(null);
      KeyGenParameterSpec.Builder builder = a.a("androidxBiometric", 3);
      a.b(builder);
      a.c(builder);
      KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
      a.a(keyGenerator, a.a(builder));
      keyGenerator.generateKey();
      SecretKey secretKey = (SecretKey)keyStore.getKey("androidxBiometric", null);
      Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
      cipher.init(1, secretKey);
      return new BiometricPrompt.c(cipher);
    } catch (NoSuchPaddingException noSuchPaddingException) {
    
    } catch (NoSuchAlgorithmException noSuchAlgorithmException) {
    
    } catch (CertificateException certificateException) {
    
    } catch (KeyStoreException keyStoreException) {
    
    } catch (InvalidKeyException invalidKeyException) {
    
    } catch (InvalidAlgorithmParameterException invalidAlgorithmParameterException) {
    
    } catch (UnrecoverableKeyException unrecoverableKeyException) {
    
    } catch (IOException iOException) {
    
    } catch (NoSuchProviderException noSuchProviderException) {}
    Log.w("CryptoObjectUtils", "Failed to create fake crypto object.", noSuchProviderException);
    return null;
  }
  
  static BiometricPrompt.c a(BiometricPrompt.CryptoObject paramCryptoObject) {
    BiometricPrompt.c c;
    Mac mac2 = null;
    if (paramCryptoObject == null)
      return null; 
    Cipher cipher = b.a(paramCryptoObject);
    if (cipher != null)
      return new BiometricPrompt.c(cipher); 
    Signature signature = b.c(paramCryptoObject);
    if (signature != null)
      return new BiometricPrompt.c(signature); 
    Mac mac1 = b.b(paramCryptoObject);
    if (mac1 != null)
      return new BiometricPrompt.c(mac1); 
    mac1 = mac2;
    if (Build.VERSION.SDK_INT >= 30) {
      IdentityCredential identityCredential = c.a(paramCryptoObject);
      mac1 = mac2;
      if (identityCredential != null)
        c = new BiometricPrompt.c(identityCredential); 
    } 
    return c;
  }
  
  static BiometricPrompt.c a(b.g.g.a.a.d paramd) {
    BiometricPrompt.c c;
    b.g.g.a.a.d d1 = null;
    if (paramd == null)
      return null; 
    Cipher cipher = paramd.a();
    if (cipher != null)
      return new BiometricPrompt.c(cipher); 
    Signature signature = paramd.c();
    if (signature != null)
      return new BiometricPrompt.c(signature); 
    Mac mac = paramd.b();
    paramd = d1;
    if (mac != null)
      c = new BiometricPrompt.c(mac); 
    return c;
  }
  
  static b.g.g.a.a.d b(BiometricPrompt.c paramc) {
    if (paramc == null)
      return null; 
    Cipher cipher = paramc.a();
    if (cipher != null)
      return new b.g.g.a.a.d(cipher); 
    Signature signature = paramc.d();
    if (signature != null)
      return new b.g.g.a.a.d(signature); 
    Mac mac = paramc.c();
    if (mac != null)
      return new b.g.g.a.a.d(mac); 
    if (Build.VERSION.SDK_INT >= 30 && paramc.b() != null)
      Log.e("CryptoObjectUtils", "Identity credential is not supported by FingerprintManager."); 
    return null;
  }
  
  private static class a {
    static KeyGenParameterSpec.Builder a(String param1String, int param1Int) {
      return new KeyGenParameterSpec.Builder(param1String, param1Int);
    }
    
    static KeyGenParameterSpec a(KeyGenParameterSpec.Builder param1Builder) {
      return param1Builder.build();
    }
    
    static void a(KeyGenerator param1KeyGenerator, KeyGenParameterSpec param1KeyGenParameterSpec) {
      param1KeyGenerator.init((AlgorithmParameterSpec)param1KeyGenParameterSpec);
    }
    
    static void b(KeyGenParameterSpec.Builder param1Builder) {
      param1Builder.setBlockModes(new String[] { "CBC" });
    }
    
    static void c(KeyGenParameterSpec.Builder param1Builder) {
      param1Builder.setEncryptionPaddings(new String[] { "PKCS7Padding" });
    }
  }
  
  private static class b {
    static BiometricPrompt.CryptoObject a(Signature param1Signature) {
      return new BiometricPrompt.CryptoObject(param1Signature);
    }
    
    static BiometricPrompt.CryptoObject a(Cipher param1Cipher) {
      return new BiometricPrompt.CryptoObject(param1Cipher);
    }
    
    static BiometricPrompt.CryptoObject a(Mac param1Mac) {
      return new BiometricPrompt.CryptoObject(param1Mac);
    }
    
    static Cipher a(BiometricPrompt.CryptoObject param1CryptoObject) {
      return param1CryptoObject.getCipher();
    }
    
    static Mac b(BiometricPrompt.CryptoObject param1CryptoObject) {
      return param1CryptoObject.getMac();
    }
    
    static Signature c(BiometricPrompt.CryptoObject param1CryptoObject) {
      return param1CryptoObject.getSignature();
    }
  }
  
  private static class c {
    static BiometricPrompt.CryptoObject a(IdentityCredential param1IdentityCredential) {
      return new BiometricPrompt.CryptoObject(param1IdentityCredential);
    }
    
    static IdentityCredential a(BiometricPrompt.CryptoObject param1CryptoObject) {
      return param1CryptoObject.getIdentityCredential();
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/biometric/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */