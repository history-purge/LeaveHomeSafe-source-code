package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.internal.a;
import com.google.android.gms.common.api.internal.a0;
import com.google.android.gms.common.api.internal.b;
import com.google.android.gms.common.api.internal.d;
import com.google.android.gms.common.api.internal.g;
import com.google.android.gms.common.api.internal.g0;
import com.google.android.gms.common.api.internal.n;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.common.util.k;

public class e<O extends a.d> implements g<O> {
  private final Context a;
  
  private final a<O> b;
  
  private final O c;
  
  private final b<O> d;
  
  private final Looper e;
  
  private final int f;
  
  private final f g;
  
  private final g h;
  
  public e(@RecentlyNonNull Context paramContext, @RecentlyNonNull a<O> parama, @RecentlyNonNull O paramO, @RecentlyNonNull a parama1) {
    q.a(paramContext, "Null context is not permitted.");
    q.a(parama, "Api must not be null.");
    q.a(parama1, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
    this.a = paramContext.getApplicationContext();
    a(paramContext);
    this.b = parama;
    this.c = paramO;
    this.e = parama1.b;
    this.d = b.a(this.b, (a.d)this.c);
    this.g = (f)new a0(this);
    this.h = g.a(this.a);
    this.f = this.h.a();
    n n = parama1.a;
    this.h.a(this);
  }
  
  @Deprecated
  public e(@RecentlyNonNull Context paramContext, @RecentlyNonNull a<O> parama, @RecentlyNonNull O paramO, @RecentlyNonNull n paramn) {
    this(paramContext, parama, paramO, a1.a());
  }
  
  private final <A extends a.b, T extends d<? extends l, A>> T a(int paramInt, T paramT) {
    paramT.b();
    this.h.a(this, paramInt, (d)paramT);
    return paramT;
  }
  
  private static String a(Object paramObject) {
    if (k.k())
      try {
        return (String)Context.class.getMethod("getAttributionTag", new Class[0]).invoke(paramObject, new Object[0]);
      } catch (NoSuchMethodException|IllegalAccessException|java.lang.reflect.InvocationTargetException noSuchMethodException) {} 
    return null;
  }
  
  public final a.f a(Looper paramLooper, g.a<O> parama) {
    d d1 = b().a();
    a.a<?, O> a1 = this.b.a();
    q.a(a1);
    return (a.f)a1.a(this.a, paramLooper, d1, this.c, (f.a)parama, (f.b)parama);
  }
  
  @RecentlyNonNull
  public f a() {
    return this.g;
  }
  
  @RecentlyNonNull
  public <A extends a.b, T extends d<? extends l, A>> T a(@RecentlyNonNull T paramT) {
    a(2, paramT);
    return paramT;
  }
  
  public final g0 a(Context paramContext, Handler paramHandler) {
    return new g0(paramContext, paramHandler, b().a());
  }
  
  @RecentlyNonNull
  public <A extends a.b, T extends d<? extends l, A>> T b(@RecentlyNonNull T paramT) {
    a(1, paramT);
    return paramT;
  }
  
  @RecentlyNonNull
  protected d.a b() {
    // Byte code:
    //   0: new com/google/android/gms/common/internal/d$a
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_2
    //   8: aload_0
    //   9: getfield c : Lcom/google/android/gms/common/api/a$d;
    //   12: astore_1
    //   13: aload_1
    //   14: instanceof com/google/android/gms/common/api/a$d$b
    //   17: ifeq -> 42
    //   20: aload_1
    //   21: checkcast com/google/android/gms/common/api/a$d$b
    //   24: invokeinterface b : ()Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;
    //   29: astore_1
    //   30: aload_1
    //   31: ifnull -> 42
    //   34: aload_1
    //   35: invokevirtual b : ()Landroid/accounts/Account;
    //   38: astore_1
    //   39: goto -> 69
    //   42: aload_0
    //   43: getfield c : Lcom/google/android/gms/common/api/a$d;
    //   46: astore_1
    //   47: aload_1
    //   48: instanceof com/google/android/gms/common/api/a$d$a
    //   51: ifeq -> 67
    //   54: aload_1
    //   55: checkcast com/google/android/gms/common/api/a$d$a
    //   58: invokeinterface a : ()Landroid/accounts/Account;
    //   63: astore_1
    //   64: goto -> 69
    //   67: aconst_null
    //   68: astore_1
    //   69: aload_2
    //   70: aload_1
    //   71: invokevirtual a : (Landroid/accounts/Account;)Lcom/google/android/gms/common/internal/d$a;
    //   74: pop
    //   75: aload_0
    //   76: getfield c : Lcom/google/android/gms/common/api/a$d;
    //   79: astore_1
    //   80: aload_1
    //   81: instanceof com/google/android/gms/common/api/a$d$b
    //   84: ifeq -> 109
    //   87: aload_1
    //   88: checkcast com/google/android/gms/common/api/a$d$b
    //   91: invokeinterface b : ()Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;
    //   96: astore_1
    //   97: aload_1
    //   98: ifnull -> 109
    //   101: aload_1
    //   102: invokevirtual x : ()Ljava/util/Set;
    //   105: astore_1
    //   106: goto -> 113
    //   109: invokestatic emptySet : ()Ljava/util/Set;
    //   112: astore_1
    //   113: aload_2
    //   114: aload_1
    //   115: invokevirtual a : (Ljava/util/Collection;)Lcom/google/android/gms/common/internal/d$a;
    //   118: pop
    //   119: aload_2
    //   120: aload_0
    //   121: getfield a : Landroid/content/Context;
    //   124: invokevirtual getClass : ()Ljava/lang/Class;
    //   127: invokevirtual getName : ()Ljava/lang/String;
    //   130: invokevirtual b : (Ljava/lang/String;)Lcom/google/android/gms/common/internal/d$a;
    //   133: pop
    //   134: aload_2
    //   135: aload_0
    //   136: getfield a : Landroid/content/Context;
    //   139: invokevirtual getPackageName : ()Ljava/lang/String;
    //   142: invokevirtual a : (Ljava/lang/String;)Lcom/google/android/gms/common/internal/d$a;
    //   145: pop
    //   146: aload_2
    //   147: areturn
  }
  
  @RecentlyNonNull
  public b<O> c() {
    return this.d;
  }
  
  @RecentlyNonNull
  public Context d() {
    return this.a;
  }
  
  @RecentlyNonNull
  public Looper e() {
    return this.e;
  }
  
  @RecentlyNonNull
  public final int f() {
    return this.f;
  }
  
  public static class a {
    @RecentlyNonNull
    public final n a;
    
    @RecentlyNonNull
    public final Looper b;
    
    static {
      (new a()).a();
    }
    
    private a(n param1n, Account param1Account, Looper param1Looper) {
      this.a = param1n;
      this.b = param1Looper;
    }
    
    public static class a {
      private n a;
      
      private Looper b;
      
      @RecentlyNonNull
      public a a(@RecentlyNonNull n param2n) {
        q.a(param2n, "StatusExceptionMapper must not be null.");
        this.a = param2n;
        return this;
      }
      
      @RecentlyNonNull
      public e.a a() {
        if (this.a == null)
          this.a = (n)new a(); 
        if (this.b == null)
          this.b = Looper.getMainLooper(); 
        return new e.a(this.a, null, this.b, null);
      }
    }
  }
  
  public static class a {
    private n a;
    
    private Looper b;
    
    @RecentlyNonNull
    public a a(@RecentlyNonNull n param1n) {
      q.a(param1n, "StatusExceptionMapper must not be null.");
      this.a = param1n;
      return this;
    }
    
    @RecentlyNonNull
    public e.a a() {
      if (this.a == null)
        this.a = (n)new a(); 
      if (this.b == null)
        this.b = Looper.getMainLooper(); 
      return new e.a(this.a, null, this.b, null);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/common/api/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */