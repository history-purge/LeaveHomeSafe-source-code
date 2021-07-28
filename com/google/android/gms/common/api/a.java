package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.internal.f;
import com.google.android.gms.common.api.internal.k;
import com.google.android.gms.common.internal.j;
import com.google.android.gms.common.internal.q;
import java.util.Set;

public final class a<O extends a.d> {
  private final a<?, O> a;
  
  private final g<?> b;
  
  private final String c;
  
  public <C extends f> a(@RecentlyNonNull String paramString, @RecentlyNonNull a<C, O> parama, @RecentlyNonNull g<C> paramg) {
    q.a(parama, "Cannot construct an Api with a null ClientBuilder");
    q.a(paramg, "Cannot construct an Api with a null ClientKey");
    this.c = paramString;
    this.a = parama;
    this.b = paramg;
  }
  
  @RecentlyNonNull
  public final a<?, O> a() {
    return this.a;
  }
  
  @RecentlyNonNull
  public final c<?> b() {
    return this.b;
  }
  
  @RecentlyNonNull
  public final String c() {
    return this.c;
  }
  
  public static class a<T extends f, O> extends e<T, O> {
    @Deprecated
    @RecentlyNonNull
    public T a(@RecentlyNonNull Context param1Context, @RecentlyNonNull Looper param1Looper, @RecentlyNonNull com.google.android.gms.common.internal.d param1d, @RecentlyNonNull O param1O, @RecentlyNonNull f.a param1a, @RecentlyNonNull f.b param1b) {
      a(param1Context, param1Looper, param1d, param1O, param1a, param1b);
      throw null;
    }
    
    @RecentlyNonNull
    public T a(@RecentlyNonNull Context param1Context, @RecentlyNonNull Looper param1Looper, @RecentlyNonNull com.google.android.gms.common.internal.d param1d, @RecentlyNonNull O param1O, @RecentlyNonNull f param1f, @RecentlyNonNull k param1k) {
      throw new UnsupportedOperationException("buildClient must be implemented");
    }
  }
  
  public static interface b {}
  
  public static class c<C extends b> {}
  
  public static interface d {
    static {
      new d(null);
    }
    
    public static interface a extends c, e {
      @RecentlyNonNull
      Account a();
    }
    
    public static interface b extends c {
      @RecentlyNonNull
      GoogleSignInAccount b();
    }
    
    public static interface c extends d {}
    
    public static final class d implements e {
      private d() {}
    }
    
    public static interface e extends d {}
    
    public static interface f extends c, e {}
  }
  
  public static interface a extends d.c, d.e {
    @RecentlyNonNull
    Account a();
  }
  
  public static interface b extends d.c {
    @RecentlyNonNull
    GoogleSignInAccount b();
  }
  
  public static interface c extends d {}
  
  public static final class d implements d.e {
    private d() {}
  }
  
  public static interface e extends d {}
  
  public static interface f extends d.c, d.e {}
  
  public static class e<T extends b, O> {}
  
  public static interface f extends b {
    void a(@RecentlyNonNull com.google.android.gms.common.internal.c.c param1c);
    
    void a(@RecentlyNonNull com.google.android.gms.common.internal.c.e param1e);
    
    void a(j param1j, Set<Scope> param1Set);
    
    void a(@RecentlyNonNull String param1String);
    
    @RecentlyNonNull
    boolean a();
    
    Set<Scope> b();
    
    @RecentlyNonNull
    boolean c();
    
    @RecentlyNonNull
    int d();
    
    @RecentlyNonNull
    boolean e();
    
    @RecentlyNonNull
    e.f.a.e.e.c[] f();
    
    @RecentlyNonNull
    String g();
    
    @RecentlyNullable
    String h();
    
    void i();
    
    @RecentlyNonNull
    boolean j();
  }
  
  public static final class g<C extends f> extends c<C> {}
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/common/api/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */