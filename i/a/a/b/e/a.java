package i.a.a.b.e;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public class a implements d {
  protected Mac a;
  
  protected int b;
  
  protected String c;
  
  public a(String paramString) {
    this.c = paramString;
    try {
      this.a = Mac.getInstance(paramString);
      this.b = this.a.getMacLength();
      return;
    } catch (NoSuchAlgorithmException noSuchAlgorithmException) {
      throw new RuntimeException(noSuchAlgorithmException);
    } 
  }
  
  public int a() {
    return this.b;
  }
  
  public void a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    try {
      this.a.update(paramArrayOfbyte, paramInt1, paramInt2);
      return;
    } catch (IllegalStateException illegalStateException) {
      throw new RuntimeException(illegalStateException);
    } 
  }
  
  public byte[] a(byte[] paramArrayOfbyte) {
    return this.a.doFinal(paramArrayOfbyte);
  }
  
  public void b(byte[] paramArrayOfbyte) {
    try {
      this.a.init(new SecretKeySpec(paramArrayOfbyte, this.c));
      return;
    } catch (InvalidKeyException invalidKeyException) {
      throw new RuntimeException(invalidKeyException);
    } 
  }
  
  public byte[] b() {
    return this.a.doFinal();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/i/a/a/b/e/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */