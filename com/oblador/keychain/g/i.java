package com.oblador.keychain.g;

import android.annotation.SuppressLint;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.security.keystore.KeyInfo;
import android.security.keystore.UserNotAuthenticatedException;
import android.util.Log;
import com.oblador.keychain.f;
import com.oblador.keychain.h.d;
import com.oblador.keychain.i.a;
import com.oblador.keychain.i.c;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.NoSuchPaddingException;

public class i extends f {
  private e.d b(String paramString1, String paramString2, String paramString3, f paramf) {
    KeyStore keyStore = k();
    if (!keyStore.containsAlias(paramString1))
      a(paramString1, paramf); 
    PublicKey publicKey = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(keyStore.getCertificate(paramString1).getPublicKey().getEncoded()));
    return new e.d(a(publicKey, paramString3), a(publicKey, paramString2), this);
  }
  
  protected KeyInfo a(Key paramKey) {
    if (Build.VERSION.SDK_INT >= 23)
      return KeyFactory.getInstance(paramKey.getAlgorithm(), "AndroidKeyStore").<KeyInfo>getKeySpec(paramKey, KeyInfo.class); 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Unsupported API");
    stringBuilder.append(Build.VERSION.SDK_INT);
    stringBuilder.append(" version detected.");
    throw new c(stringBuilder.toString());
  }
  
  public e.d a(String paramString1, String paramString2, String paramString3, f paramf) {
    StringBuilder stringBuilder1;
    a(paramf);
    String str = f.a(paramString1, i());
    try {
      return b(str, paramString3, paramString2, paramf);
    } catch (NoSuchAlgorithmException noSuchAlgorithmException) {
    
    } catch (InvalidKeySpecException invalidKeySpecException) {
    
    } catch (NoSuchPaddingException noSuchPaddingException) {
    
    } catch (InvalidKeyException invalidKeyException) {
    
    } catch (KeyStoreException keyStoreException) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Could not access Keystore for service ");
      stringBuilder.append(paramString1);
      throw new a(stringBuilder.toString(), keyStoreException);
    } catch (c c) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Could not access Keystore for service ");
      stringBuilder.append(paramString1);
      throw new a(stringBuilder.toString(), c);
    } catch (IOException iOException) {
      stringBuilder1 = new StringBuilder();
      stringBuilder1.append("I/O error: ");
      stringBuilder1.append(iOException.getMessage());
      throw new a(stringBuilder1.toString(), iOException);
    } finally {
      paramString1 = null;
      stringBuilder1 = new StringBuilder();
      stringBuilder1.append("Unknown error: ");
      stringBuilder1.append(paramString1.getMessage());
    } 
    StringBuilder stringBuilder2 = new StringBuilder();
    stringBuilder2.append("Could not encrypt data for service ");
    stringBuilder2.append(paramString1);
    throw new a(stringBuilder2.toString(), stringBuilder1);
  }
  
  protected Key a(KeyGenParameterSpec paramKeyGenParameterSpec) {
    if (Build.VERSION.SDK_INT >= 23) {
      KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(l(), "AndroidKeyStore");
      keyPairGenerator.initialize((AlgorithmParameterSpec)paramKeyGenParameterSpec);
      return keyPairGenerator.generateKeyPair().getPrivate();
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Unsupported API");
    stringBuilder.append(Build.VERSION.SDK_INT);
    stringBuilder.append(" version detected.");
    throw new c(stringBuilder.toString());
  }
  
  @SuppressLint({"NewApi"})
  public void a(d paramd, String paramString, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, f paramf) {
    a(paramf);
    String str1 = f.a(paramString, i());
    AtomicInteger atomicInteger = new AtomicInteger(1);
    try {
    
    } catch (UserNotAuthenticatedException userNotAuthenticatedException) {
    
    } finally {
      atomicInteger = null;
      paramd.a(null, (Throwable)atomicInteger);
    } 
    String str2 = f.g;
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Unlock of keystore is needed. Error: ");
    stringBuilder.append(atomicInteger.getMessage());
    Log.d(str2, stringBuilder.toString(), (Throwable)atomicInteger);
    paramd.a(new e.b(str1, (Key)paramf, paramArrayOfbyte2, paramArrayOfbyte1));
  }
  
  @SuppressLint({"NewApi"})
  protected KeyGenParameterSpec.Builder b(String paramString) {
    if (Build.VERSION.SDK_INT >= 23)
      return (new KeyGenParameterSpec.Builder(paramString, 3)).setBlockModes(new String[] { "ECB" }).setEncryptionPaddings(new String[] { "PKCS1Padding" }).setRandomizedEncryptionRequired(true).setUserAuthenticationRequired(true).setUserAuthenticationValidityDurationSeconds(5).setKeySize(3072); 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Unsupported API");
    stringBuilder.append(Build.VERSION.SDK_INT);
    stringBuilder.append(" version detected.");
    throw new c(stringBuilder.toString());
  }
  
  public boolean b() {
    return true;
  }
  
  public String c() {
    return "KeystoreRSAECB";
  }
  
  public int e() {
    return 23;
  }
  
  protected String j() {
    return "RSA/ECB/PKCS1Padding";
  }
  
  protected String l() {
    return "RSA";
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/oblador/keychain/g/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */