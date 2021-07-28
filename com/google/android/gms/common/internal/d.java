package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.view.View;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.api.Scope;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class d {
  private final Account a;
  
  private final Set<Scope> b;
  
  private final Set<Scope> c;
  
  private final Map<com.google.android.gms.common.api.a<?>, b> d;
  
  private final String e;
  
  private final String f;
  
  private final e.f.a.e.k.a g;
  
  private Integer h;
  
  public d(Account paramAccount, @RecentlyNonNull Set<Scope> paramSet, @RecentlyNonNull Map<com.google.android.gms.common.api.a<?>, b> paramMap, @RecentlyNonNull int paramInt, @RecentlyNonNull View paramView, @RecentlyNonNull String paramString1, @RecentlyNonNull String paramString2, @RecentlyNonNull e.f.a.e.k.a parama, @RecentlyNonNull boolean paramBoolean) {
    Set<Scope> set;
    this.a = paramAccount;
    if (paramSet == null) {
      set = Collections.emptySet();
    } else {
      set = Collections.unmodifiableSet(paramSet);
    } 
    this.b = set;
    Map<com.google.android.gms.common.api.a<?>, b> map = paramMap;
    if (paramMap == null)
      map = Collections.emptyMap(); 
    this.d = map;
    this.e = paramString1;
    this.f = paramString2;
    this.g = parama;
    HashSet<Scope> hashSet = new HashSet<Scope>(this.b);
    Iterator iterator = this.d.values().iterator();
    while (iterator.hasNext())
      hashSet.addAll(((b)iterator.next()).a); 
    this.c = Collections.unmodifiableSet(hashSet);
  }
  
  @RecentlyNullable
  public final Account a() {
    return this.a;
  }
  
  @RecentlyNonNull
  public final Set<Scope> a(@RecentlyNonNull com.google.android.gms.common.api.a<?> parama) {
    b b = this.d.get(parama);
    if (b == null || b.a.isEmpty())
      return this.b; 
    HashSet<Scope> hashSet = new HashSet<Scope>(this.b);
    hashSet.addAll(b.a);
    return hashSet;
  }
  
  public final void a(@RecentlyNonNull Integer paramInteger) {
    this.h = paramInteger;
  }
  
  @Deprecated
  @RecentlyNullable
  public final String b() {
    Account account = this.a;
    return (account != null) ? account.name : null;
  }
  
  @RecentlyNonNull
  public final Account c() {
    Account account = this.a;
    return (account != null) ? account : new Account("<<default account>>", "com.google");
  }
  
  @RecentlyNonNull
  public final Set<Scope> d() {
    return this.c;
  }
  
  @RecentlyNullable
  public final String e() {
    return this.e;
  }
  
  @RecentlyNonNull
  public final Set<Scope> f() {
    return this.b;
  }
  
  @RecentlyNullable
  public final String g() {
    return this.f;
  }
  
  @RecentlyNonNull
  public final e.f.a.e.k.a h() {
    return this.g;
  }
  
  @RecentlyNullable
  public final Integer i() {
    return this.h;
  }
  
  public static final class a {
    private Account a;
    
    private b.d.b<Scope> b;
    
    private String c;
    
    private String d;
    
    private e.f.a.e.k.a e = e.f.a.e.k.a.c;
    
    @RecentlyNonNull
    public final a a(Account param1Account) {
      this.a = param1Account;
      return this;
    }
    
    @RecentlyNonNull
    public final a a(@RecentlyNonNull String param1String) {
      this.c = param1String;
      return this;
    }
    
    @RecentlyNonNull
    public final a a(@RecentlyNonNull Collection<Scope> param1Collection) {
      if (this.b == null)
        this.b = new b.d.b(); 
      this.b.addAll(param1Collection);
      return this;
    }
    
    @RecentlyNonNull
    public final d a() {
      return new d(this.a, (Set<Scope>)this.b, null, 0, null, this.c, this.d, this.e, false);
    }
    
    @RecentlyNonNull
    public final a b(@RecentlyNonNull String param1String) {
      this.d = param1String;
      return this;
    }
  }
  
  public static final class b {
    public final Set<Scope> a;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/common/internal/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */