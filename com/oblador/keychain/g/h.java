package com.oblador.keychain.g;

import android.annotation.TargetApi;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.security.keystore.KeyInfo;
import android.util.Log;
import com.oblador.keychain.f;
import com.oblador.keychain.h.d;
import com.oblador.keychain.i.a;
import com.oblador.keychain.i.c;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;

@TargetApi(23)
public class h extends f {
  protected KeyInfo a(Key paramKey) {
    if (Build.VERSION.SDK_INT >= 23)
      return (KeyInfo)SecretKeyFactory.getInstance(paramKey.getAlgorithm(), "AndroidKeyStore").getKeySpec((SecretKey)paramKey, KeyInfo.class); 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Unsupported API");
    stringBuilder.append(Build.VERSION.SDK_INT);
    stringBuilder.append(" version detected.");
    throw new c(stringBuilder.toString());
  }
  
  public f a() {
    return f.e;
  }
  
  public e.c a(String paramString, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, f paramf) {
    a(paramf);
    String str = f.a(paramString, i());
    AtomicInteger atomicInteger = new AtomicInteger(1);
    try {
      return new e.c(a(key, paramArrayOfbyte1), a(key, paramArrayOfbyte2), b(key));
    } catch (GeneralSecurityException generalSecurityException) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Could not decrypt data with alias: ");
      stringBuilder.append(paramString);
      throw new a(stringBuilder.toString(), generalSecurityException);
    } finally {
      paramArrayOfbyte1 = null;
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Unknown error with alias: ");
      stringBuilder.append(paramString);
      stringBuilder.append(", error: ");
      stringBuilder.append(paramArrayOfbyte1.getMessage());
    } 
  }
  
  public e.d a(String paramString1, String paramString2, String paramString3, f paramf) {
    a(paramf);
    String str = f.a(paramString1, i());
    AtomicInteger atomicInteger = new AtomicInteger(1);
    try {
      return new e.d(a(key, paramString2), a(key, paramString3), this);
    } catch (GeneralSecurityException generalSecurityException) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Could not encrypt data with alias: ");
      stringBuilder.append(paramString1);
      throw new a(stringBuilder.toString(), generalSecurityException);
    } finally {
      paramString2 = null;
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Unknown error with alias: ");
      stringBuilder.append(paramString1);
      stringBuilder.append(", error: ");
      stringBuilder.append(paramString2.getMessage());
    } 
  }
  
  public String a(Key paramKey, byte[] paramArrayOfbyte) {
    return a(paramKey, paramArrayOfbyte, f.d.b);
  }
  
  protected String a(Key paramKey, byte[] paramArrayOfbyte, f.a parama) {
    Cipher cipher = h();
    try {
      return new String(cipher.doFinal(paramArrayOfbyte, 16, paramArrayOfbyte.length - 16), f.h);
    } finally {
      Log.w(f.g, paramKey.getMessage(), (Throwable)paramKey);
    } 
  }
  
  protected Key a(KeyGenParameterSpec paramKeyGenParameterSpec) {
    if (Build.VERSION.SDK_INT >= 23) {
      KeyGenerator keyGenerator = KeyGenerator.getInstance(l(), "AndroidKeyStore");
      keyGenerator.init((AlgorithmParameterSpec)paramKeyGenParameterSpec);
      return keyGenerator.generateKey();
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Unsupported API");
    stringBuilder.append(Build.VERSION.SDK_INT);
    stringBuilder.append(" version detected.");
    throw new c(stringBuilder.toString());
  }
  
  public void a(d paramd, String paramString, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, f paramf) {
    try {
      return;
    } finally {
      paramString = null;
      paramd.a(null, (Throwable)paramString);
    } 
  }
  
  public byte[] a(Key paramKey, String paramString) {
    return a(paramKey, paramString, f.d.a);
  }
  
  protected KeyGenParameterSpec.Builder b(String paramString) {
    if (Build.VERSION.SDK_INT >= 23)
      return (new KeyGenParameterSpec.Builder(paramString, 3)).setBlockModes(new String[] { "CBC" }).setEncryptionPaddings(new String[] { "PKCS7Padding" }).setRandomizedEncryptionRequired(true).setKeySize(256); 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Unsupported API");
    stringBuilder.append(Build.VERSION.SDK_INT);
    stringBuilder.append(" version detected.");
    throw new c(stringBuilder.toString());
  }
  
  public boolean b() {
    return false;
  }
  
  public String c() {
    return "KeystoreAESCBC";
  }
  
  public int e() {
    return 23;
  }
  
  public String i() {
    return "RN_KEYCHAIN_DEFAULT_ALIAS";
  }
  
  protected String j() {
    return "AES/CBC/PKCS7Padding";
  }
  
  protected String l() {
    return "AES";
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/oblador/keychain/g/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */