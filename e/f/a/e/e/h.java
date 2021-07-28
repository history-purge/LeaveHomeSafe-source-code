package e.f.a.e.e;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;

public class h {
  private static h b;
  
  private final Context a;
  
  private h(Context paramContext) {
    this.a = paramContext.getApplicationContext();
  }
  
  @RecentlyNonNull
  public static h a(@RecentlyNonNull Context paramContext) {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic a : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4: pop
    //   5: ldc e/f/a/e/e/h
    //   7: monitorenter
    //   8: getstatic e/f/a/e/e/h.b : Le/f/a/e/e/h;
    //   11: ifnonnull -> 29
    //   14: aload_0
    //   15: invokestatic a : (Landroid/content/Context;)V
    //   18: new e/f/a/e/e/h
    //   21: dup
    //   22: aload_0
    //   23: invokespecial <init> : (Landroid/content/Context;)V
    //   26: putstatic e/f/a/e/e/h.b : Le/f/a/e/e/h;
    //   29: ldc e/f/a/e/e/h
    //   31: monitorexit
    //   32: getstatic e/f/a/e/e/h.b : Le/f/a/e/e/h;
    //   35: areturn
    //   36: astore_0
    //   37: ldc e/f/a/e/e/h
    //   39: monitorexit
    //   40: aload_0
    //   41: athrow
    // Exception table:
    //   from	to	target	type
    //   8	29	36	finally
    //   29	32	36	finally
    //   37	40	36	finally
  }
  
  private static r a(PackageInfo paramPackageInfo, r... paramVarArgs) {
    Signature[] arrayOfSignature = paramPackageInfo.signatures;
    if (arrayOfSignature == null)
      return null; 
    if (arrayOfSignature.length != 1) {
      Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
      return null;
    } 
    int i = 0;
    t t = new t(arrayOfSignature[0].toByteArray());
    while (i < paramVarArgs.length) {
      if (paramVarArgs[i].equals(t))
        return paramVarArgs[i]; 
      i++;
    } 
    return null;
  }
  
  @RecentlyNonNull
  public static boolean a(@RecentlyNonNull PackageInfo paramPackageInfo, @RecentlyNonNull boolean paramBoolean) {
    if (paramPackageInfo != null && paramPackageInfo.signatures != null) {
      r r;
      if (paramBoolean) {
        r = a(paramPackageInfo, v.a);
      } else {
        r = a((PackageInfo)r, new r[] { v.a[0] });
      } 
      if (r != null)
        return true; 
    } 
    return false;
  }
  
  @RecentlyNonNull
  public boolean a(@RecentlyNonNull PackageInfo paramPackageInfo) {
    if (paramPackageInfo == null)
      return false; 
    if (a(paramPackageInfo, false))
      return true; 
    if (a(paramPackageInfo, true)) {
      if (g.b(this.a))
        return true; 
      Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
    } 
    return false;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/e/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */