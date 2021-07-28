package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.internal.f;
import com.google.android.gms.common.api.internal.k;
import e.f.a.e.e.d;
import e.f.a.e.e.e;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

public abstract class g<T extends IInterface> extends c<T> implements a.f, b0 {
  private final d w;
  
  private final Set<Scope> x;
  
  private final Account y;
  
  @Deprecated
  protected g(@RecentlyNonNull Context paramContext, @RecentlyNonNull Looper paramLooper, @RecentlyNonNull int paramInt, @RecentlyNonNull d paramd, @RecentlyNonNull f.a parama, @RecentlyNonNull f.b paramb) {
    this(paramContext, paramLooper, paramInt, paramd, (f)parama, (k)paramb);
  }
  
  protected g(@RecentlyNonNull Context paramContext, @RecentlyNonNull Looper paramLooper, @RecentlyNonNull int paramInt, @RecentlyNonNull d paramd, @RecentlyNonNull f paramf, @RecentlyNonNull k paramk) {
    this(paramContext, paramLooper, h, d1, paramInt, paramd, paramf, paramk);
  }
  
  private g(Context paramContext, Looper paramLooper, h paramh, d paramd, int paramInt, d paramd1, f paramf, k paramk) {
    super(paramContext, paramLooper, paramh, (e)paramd, paramInt, a(paramf), a(paramk), paramd1.g());
    this.w = paramd1;
    this.y = paramd1.a();
    Set<Scope> set = paramd1.d();
    b(set);
    this.x = set;
  }
  
  private static c.a a(f paramf) {
    return (paramf == null) ? null : new y(paramf);
  }
  
  private static c.b a(k paramk) {
    return (paramk == null) ? null : new z(paramk);
  }
  
  private final Set<Scope> b(Set<Scope> paramSet) {
    a(paramSet);
    Iterator<Scope> iterator = paramSet.iterator();
    while (iterator.hasNext()) {
      if (paramSet.contains(iterator.next()))
        continue; 
      throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
    } 
    return paramSet;
  }
  
  @RecentlyNonNull
  protected final d B() {
    return this.w;
  }
  
  protected Set<Scope> a(@RecentlyNonNull Set<Scope> paramSet) {
    return paramSet;
  }
  
  public Set<Scope> b() {
    return j() ? this.x : Collections.emptySet();
  }
  
  @RecentlyNullable
  public final Account n() {
    return this.y;
  }
  
  @RecentlyNonNull
  protected final Set<Scope> t() {
    return this.x;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/common/internal/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */