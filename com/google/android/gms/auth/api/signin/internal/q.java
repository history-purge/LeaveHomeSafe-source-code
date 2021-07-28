package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

public final class q {
  private static q b;
  
  private c a;
  
  private q(Context paramContext) {
    this.a = c.a(paramContext);
    this.a.b();
    this.a.c();
  }
  
  public static q a(Context paramContext) {
    // Byte code:
    //   0: ldc com/google/android/gms/auth/api/signin/internal/q
    //   2: monitorenter
    //   3: aload_0
    //   4: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   7: invokestatic b : (Landroid/content/Context;)Lcom/google/android/gms/auth/api/signin/internal/q;
    //   10: astore_0
    //   11: ldc com/google/android/gms/auth/api/signin/internal/q
    //   13: monitorexit
    //   14: aload_0
    //   15: areturn
    //   16: astore_0
    //   17: ldc com/google/android/gms/auth/api/signin/internal/q
    //   19: monitorexit
    //   20: aload_0
    //   21: athrow
    // Exception table:
    //   from	to	target	type
    //   3	11	16	finally
  }
  
  private static q b(Context paramContext) {
    // Byte code:
    //   0: ldc com/google/android/gms/auth/api/signin/internal/q
    //   2: monitorenter
    //   3: getstatic com/google/android/gms/auth/api/signin/internal/q.b : Lcom/google/android/gms/auth/api/signin/internal/q;
    //   6: ifnull -> 18
    //   9: getstatic com/google/android/gms/auth/api/signin/internal/q.b : Lcom/google/android/gms/auth/api/signin/internal/q;
    //   12: astore_0
    //   13: ldc com/google/android/gms/auth/api/signin/internal/q
    //   15: monitorexit
    //   16: aload_0
    //   17: areturn
    //   18: new com/google/android/gms/auth/api/signin/internal/q
    //   21: dup
    //   22: aload_0
    //   23: invokespecial <init> : (Landroid/content/Context;)V
    //   26: astore_0
    //   27: aload_0
    //   28: putstatic com/google/android/gms/auth/api/signin/internal/q.b : Lcom/google/android/gms/auth/api/signin/internal/q;
    //   31: ldc com/google/android/gms/auth/api/signin/internal/q
    //   33: monitorexit
    //   34: aload_0
    //   35: areturn
    //   36: astore_0
    //   37: ldc com/google/android/gms/auth/api/signin/internal/q
    //   39: monitorexit
    //   40: aload_0
    //   41: athrow
    // Exception table:
    //   from	to	target	type
    //   3	13	36	finally
    //   18	31	36	finally
  }
  
  public final void a() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield a : Lcom/google/android/gms/auth/api/signin/internal/c;
    //   6: invokevirtual a : ()V
    //   9: aload_0
    //   10: monitorexit
    //   11: return
    //   12: astore_1
    //   13: aload_0
    //   14: monitorexit
    //   15: aload_1
    //   16: athrow
    // Exception table:
    //   from	to	target	type
    //   2	9	12	finally
  }
  
  public final void a(GoogleSignInOptions paramGoogleSignInOptions, GoogleSignInAccount paramGoogleSignInAccount) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield a : Lcom/google/android/gms/auth/api/signin/internal/c;
    //   6: aload_2
    //   7: aload_1
    //   8: invokevirtual a : (Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;)V
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: astore_1
    //   15: aload_0
    //   16: monitorexit
    //   17: aload_1
    //   18: athrow
    // Exception table:
    //   from	to	target	type
    //   2	11	14	finally
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/auth/api/signin/internal/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */