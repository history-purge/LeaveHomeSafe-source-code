package com.rnfingerprint;

import android.annotation.TargetApi;
import android.security.keystore.KeyGenParameterSpec;
import java.security.KeyStore;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;

@TargetApi(23)
public class c {
  private Cipher a;
  
  private KeyStore b() {
    KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
    KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
    keyStore.load(null);
    keyGenerator.init((AlgorithmParameterSpec)(new KeyGenParameterSpec.Builder("example_key", 3)).setBlockModes(new String[] { "CBC" }).setUserAuthenticationRequired(true).setEncryptionPaddings(new String[] { "PKCS7Padding" }).build());
    keyGenerator.generateKey();
    return keyStore;
  }
  
  public Cipher a() {
    Cipher cipher = this.a;
    if (cipher != null)
      return cipher; 
    try {
      KeyStore keyStore = b();
      this.a = Cipher.getInstance("AES/CBC/PKCS7Padding");
      keyStore.load(null);
      this.a.init(1, keyStore.getKey("example_key", null));
    } catch (Exception exception) {}
    return this.a;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/rnfingerprint/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */