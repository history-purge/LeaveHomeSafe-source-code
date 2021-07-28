package e.e.f;

import com.facebook.crypto.cipher.NativeGCMCipher;
import e.e.f.i.a;
import e.e.f.j.b;
import e.e.f.j.c;
import e.e.f.k.a;
import e.e.f.k.b;
import java.io.DataInputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class e implements d {
  private final b a;
  
  private final a b;
  
  private final f c;
  
  public e(b paramb, a parama, f paramf) {
    this.a = paramb;
    this.b = parama;
    this.c = paramf;
  }
  
  private void a(NativeGCMCipher paramNativeGCMCipher, byte paramByte1, byte paramByte2, byte[] paramArrayOfbyte) {
    paramNativeGCMCipher.c(new byte[] { paramByte1 }, 1);
    paramNativeGCMCipher.c(new byte[] { paramByte2 }, 1);
    paramNativeGCMCipher.c(paramArrayOfbyte, paramArrayOfbyte.length);
  }
  
  public int a() {
    f f1 = this.c;
    return f1.ivLength + 2 + f1.tagLength;
  }
  
  public InputStream a(InputStream paramInputStream, g paramg) {
    byte b1 = (byte)paramInputStream.read();
    byte b2 = (byte)paramInputStream.read();
    boolean bool2 = false;
    if (b1 == 1) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Unexpected crypto version ");
    stringBuilder.append(b1);
    a.a(bool1, stringBuilder.toString());
    boolean bool1 = bool2;
    if (b2 == this.c.cipherId)
      bool1 = true; 
    stringBuilder = new StringBuilder();
    stringBuilder.append("Unexpected cipher ID ");
    stringBuilder.append(b2);
    a.a(bool1, stringBuilder.toString());
    byte[] arrayOfByte = new byte[this.c.ivLength];
    (new DataInputStream(paramInputStream)).readFully(arrayOfByte);
    NativeGCMCipher nativeGCMCipher = new NativeGCMCipher(this.a);
    nativeGCMCipher.a(this.b.b(), arrayOfByte);
    a(nativeGCMCipher, b1, b2, paramg.a());
    return (InputStream)new b(paramInputStream, nativeGCMCipher, this.c.tagLength);
  }
  
  public OutputStream a(OutputStream paramOutputStream, g paramg, byte[] paramArrayOfbyte) {
    paramOutputStream.write(1);
    paramOutputStream.write(this.c.cipherId);
    byte[] arrayOfByte2 = this.b.a();
    NativeGCMCipher nativeGCMCipher = new NativeGCMCipher(this.a);
    nativeGCMCipher.b(this.b.b(), arrayOfByte2);
    paramOutputStream.write(arrayOfByte2);
    byte[] arrayOfByte1 = paramg.a();
    a(nativeGCMCipher, (byte)1, this.c.cipherId, arrayOfByte1);
    return (OutputStream)new c(paramOutputStream, nativeGCMCipher, paramArrayOfbyte, this.c.tagLength);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/f/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */