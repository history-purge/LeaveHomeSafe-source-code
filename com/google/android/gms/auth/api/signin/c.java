package com.google.android.gms.auth.api.signin;

import android.content.Context;
import com.google.android.gms.auth.api.signin.internal.j;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.internal.n;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.internal.p;
import e.f.a.e.m.l;

public class c extends e<GoogleSignInOptions> {
  private static int i = a.a;
  
  c(Context paramContext, GoogleSignInOptions paramGoogleSignInOptions) {
    super(paramContext, e.f.a.e.a.a.a.e, (com.google.android.gms.common.api.a.d)paramGoogleSignInOptions, (n)new com.google.android.gms.common.api.internal.a());
  }
  
  private final int i() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: getstatic com/google/android/gms/auth/api/signin/c.i : I
    //   5: getstatic com/google/android/gms/auth/api/signin/c$a.a : I
    //   8: if_icmpne -> 76
    //   11: aload_0
    //   12: invokevirtual d : ()Landroid/content/Context;
    //   15: astore_2
    //   16: invokestatic a : ()Le/f/a/e/e/d;
    //   19: astore_3
    //   20: aload_3
    //   21: aload_2
    //   22: ldc 12451000
    //   24: invokevirtual a : (Landroid/content/Context;I)I
    //   27: istore_1
    //   28: iload_1
    //   29: ifne -> 43
    //   32: getstatic com/google/android/gms/auth/api/signin/c$a.d : I
    //   35: istore_1
    //   36: iload_1
    //   37: putstatic com/google/android/gms/auth/api/signin/c.i : I
    //   40: goto -> 76
    //   43: aload_3
    //   44: aload_2
    //   45: iload_1
    //   46: aconst_null
    //   47: invokevirtual a : (Landroid/content/Context;ILjava/lang/String;)Landroid/content/Intent;
    //   50: ifnonnull -> 69
    //   53: aload_2
    //   54: ldc 'com.google.android.gms.auth.api.fallback'
    //   56: invokestatic a : (Landroid/content/Context;Ljava/lang/String;)I
    //   59: ifeq -> 69
    //   62: getstatic com/google/android/gms/auth/api/signin/c$a.c : I
    //   65: istore_1
    //   66: goto -> 36
    //   69: getstatic com/google/android/gms/auth/api/signin/c$a.b : I
    //   72: istore_1
    //   73: goto -> 36
    //   76: getstatic com/google/android/gms/auth/api/signin/c.i : I
    //   79: istore_1
    //   80: aload_0
    //   81: monitorexit
    //   82: iload_1
    //   83: ireturn
    //   84: astore_2
    //   85: aload_0
    //   86: monitorexit
    //   87: goto -> 92
    //   90: aload_2
    //   91: athrow
    //   92: goto -> 90
    // Exception table:
    //   from	to	target	type
    //   2	28	84	finally
    //   32	36	84	finally
    //   36	40	84	finally
    //   43	66	84	finally
    //   69	73	84	finally
    //   76	80	84	finally
  }
  
  public l<Void> g() {
    boolean bool;
    f f = a();
    Context context = d();
    if (i() == a.c) {
      bool = true;
    } else {
      bool = false;
    } 
    return p.a(j.b(f, context, bool));
  }
  
  public l<Void> h() {
    boolean bool;
    f f = a();
    Context context = d();
    if (i() == a.c) {
      bool = true;
    } else {
      bool = false;
    } 
    return p.a(j.a(f, context, bool));
  }
  
  static {
    new b(null);
  }
  
  enum a {
    a, b, c, d;
    
    public static int[] a() {
      return (int[])e.clone();
    }
  }
  
  private static final class b implements p.a<d, GoogleSignInAccount> {
    private b() {}
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/auth/api/signin/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */