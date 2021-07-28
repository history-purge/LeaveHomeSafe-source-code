package com.facebook.crypto.cipher;

import e.e.f.k.b;

public class NativeGCMCipher {
  private a a = a.c;
  
  private final b b;
  
  public NativeGCMCipher(b paramb) {
    this.b = paramb;
  }
  
  private String a(String paramString, Object... paramVarArgs) {
    return String.format(null, paramString, paramVarArgs);
  }
  
  private void c() {
    boolean bool;
    a a1 = this.a;
    if (a1 == a.g || a1 == a.f) {
      bool = true;
    } else {
      bool = false;
    } 
    e.e.f.k.a.b(bool, "Cipher has not been finalized");
  }
  
  private void d() {
    boolean bool;
    a a1 = this.a;
    if (a1 == a.e || a1 == a.d) {
      bool = true;
    } else {
      bool = false;
    } 
    e.e.f.k.a.b(bool, "Cipher has not been initialized");
  }
  
  private native int nativeDecryptFinal(byte[] paramArrayOfbyte, int paramInt);
  
  private native int nativeDecryptInit(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2);
  
  private native int nativeDestroy();
  
  private native int nativeEncryptFinal(byte[] paramArrayOfbyte, int paramInt);
  
  private native int nativeEncryptInit(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2);
  
  private static native int nativeFailure();
  
  private native int nativeGetCipherBlockSize();
  
  private native int nativeUpdate(byte[] paramArrayOfbyte1, int paramInt1, int paramInt2, byte[] paramArrayOfbyte2, int paramInt3);
  
  private native int nativeUpdateAad(byte[] paramArrayOfbyte, int paramInt);
  
  public int a(byte[] paramArrayOfbyte1, int paramInt1, int paramInt2, byte[] paramArrayOfbyte2, int paramInt3) {
    d();
    paramInt3 = nativeUpdate(paramArrayOfbyte1, paramInt1, paramInt2, paramArrayOfbyte2, paramInt3);
    if (paramInt3 >= 0)
      return paramInt3; 
    throw new a(a("update: Offset = %d; DataLen = %d; Result = %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) }));
  }
  
  public void a() {
    c();
    if (nativeDestroy() != nativeFailure()) {
      this.a = a.c;
      return;
    } 
    throw new a("destroy");
  }
  
  public void a(byte[] paramArrayOfbyte, int paramInt) {
    boolean bool;
    if (this.a == a.e) {
      bool = true;
    } else {
      bool = false;
    } 
    e.e.f.k.a.b(bool, "Cipher has not been initialized");
    this.a = a.g;
    if (nativeDecryptFinal(paramArrayOfbyte, paramInt) != nativeFailure())
      return; 
    throw new a("The message could not be decrypted successfully.It has either been tampered with or the wrong resource is being decrypted.");
  }
  
  public void a(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    boolean bool;
    if (this.a == a.c) {
      bool = true;
    } else {
      bool = false;
    } 
    e.e.f.k.a.b(bool, "Cipher has already been initialized");
    this.b.a();
    if (nativeDecryptInit(paramArrayOfbyte1, paramArrayOfbyte2) != nativeFailure()) {
      this.a = a.e;
      return;
    } 
    throw new a("decryptInit");
  }
  
  public int b() {
    d();
    return nativeGetCipherBlockSize();
  }
  
  public void b(byte[] paramArrayOfbyte, int paramInt) {
    boolean bool;
    if (this.a == a.d) {
      bool = true;
    } else {
      bool = false;
    } 
    e.e.f.k.a.b(bool, "Cipher has not been initialized");
    this.a = a.f;
    if (nativeEncryptFinal(paramArrayOfbyte, paramInt) != nativeFailure())
      return; 
    throw new a(a("encryptFinal: %d", new Object[] { Integer.valueOf(paramInt) }));
  }
  
  public void b(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    boolean bool;
    if (this.a == a.c) {
      bool = true;
    } else {
      bool = false;
    } 
    e.e.f.k.a.b(bool, "Cipher has already been initialized");
    this.b.a();
    if (nativeEncryptInit(paramArrayOfbyte1, paramArrayOfbyte2) != nativeFailure()) {
      this.a = a.d;
      return;
    } 
    throw new a("encryptInit");
  }
  
  public void c(byte[] paramArrayOfbyte, int paramInt) {
    d();
    if (nativeUpdateAad(paramArrayOfbyte, paramInt) >= 0)
      return; 
    throw new a(a("updateAAd: DataLen = %d", new Object[] { Integer.valueOf(paramInt) }));
  }
  
  private enum a {
    c, d, e, f, g;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/crypto/cipher/NativeGCMCipher.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */