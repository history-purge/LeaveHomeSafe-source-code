package e.e.a.a.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import e.e.f.f;
import e.e.f.i.a;

public class d implements a {
  private final f a;
  
  private final SharedPreferences b;
  
  private final b c;
  
  protected byte[] d;
  
  protected boolean e;
  
  public d(Context paramContext, f paramf) {
    this.b = paramContext.getSharedPreferences(a(paramf), 0);
    this.c = new b();
    this.a = paramf;
  }
  
  private static String a(f paramf) {
    if (paramf == f.c)
      return "crypto"; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("crypto.");
    stringBuilder.append(String.valueOf(paramf));
    return stringBuilder.toString();
  }
  
  private byte[] a(String paramString, int paramInt) {
    byte[] arrayOfByte = new byte[paramInt];
    this.c.nextBytes(arrayOfByte);
    SharedPreferences.Editor editor = this.b.edit();
    editor.putString(paramString, a(arrayOfByte));
    editor.commit();
    return arrayOfByte;
  }
  
  private byte[] b(String paramString, int paramInt) {
    String str = this.b.getString(paramString, null);
    return (str == null) ? a(paramString, paramInt) : a(str);
  }
  
  String a(byte[] paramArrayOfbyte) {
    return (paramArrayOfbyte == null) ? null : Base64.encodeToString(paramArrayOfbyte, 0);
  }
  
  public byte[] a() {
    byte[] arrayOfByte = new byte[this.a.ivLength];
    this.c.nextBytes(arrayOfByte);
    return arrayOfByte;
  }
  
  byte[] a(String paramString) {
    return (paramString == null) ? null : Base64.decode(paramString, 0);
  }
  
  public byte[] b() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield e : Z
    //   6: ifne -> 26
    //   9: aload_0
    //   10: aload_0
    //   11: ldc 'cipher_key'
    //   13: aload_0
    //   14: getfield a : Le/e/f/f;
    //   17: getfield keyLength : I
    //   20: invokespecial b : (Ljava/lang/String;I)[B
    //   23: putfield d : [B
    //   26: aload_0
    //   27: iconst_1
    //   28: putfield e : Z
    //   31: aload_0
    //   32: getfield d : [B
    //   35: astore_1
    //   36: aload_0
    //   37: monitorexit
    //   38: aload_1
    //   39: areturn
    //   40: astore_1
    //   41: aload_0
    //   42: monitorexit
    //   43: aload_1
    //   44: athrow
    // Exception table:
    //   from	to	target	type
    //   2	26	40	finally
    //   26	36	40	finally
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/a/a/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */