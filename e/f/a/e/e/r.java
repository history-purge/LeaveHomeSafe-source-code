package e.f.a.e.e;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.common.internal.v0;
import e.f.a.e.f.a;
import e.f.a.e.f.b;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

abstract class r extends v0 {
  private int a;
  
  protected r(byte[] paramArrayOfbyte) {
    boolean bool;
    if (paramArrayOfbyte.length == 25) {
      bool = true;
    } else {
      bool = false;
    } 
    q.a(bool);
    this.a = Arrays.hashCode(paramArrayOfbyte);
  }
  
  protected static byte[] a(String paramString) {
    try {
      return paramString.getBytes("ISO-8859-1");
    } catch (UnsupportedEncodingException unsupportedEncodingException) {
      throw new AssertionError(unsupportedEncodingException);
    } 
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject != null) {
      if (!(paramObject instanceof com.google.android.gms.common.internal.u0))
        return false; 
      try {
        paramObject = paramObject;
        if (paramObject.g() != hashCode())
          return false; 
        paramObject = paramObject.zzb();
        if (paramObject == null)
          return false; 
        paramObject = b.a((a)paramObject);
        return Arrays.equals(zza(), (byte[])paramObject);
      } catch (RemoteException remoteException) {
        Log.e("GoogleCertificates", "Failed to get Google certificates from remote", (Throwable)remoteException);
      } 
    } 
    return false;
  }
  
  public final int g() {
    return hashCode();
  }
  
  public int hashCode() {
    return this.a;
  }
  
  abstract byte[] zza();
  
  public final a zzb() {
    return b.a(zza());
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/e/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */