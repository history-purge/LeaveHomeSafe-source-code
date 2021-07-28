package com.google.android.gms.common.api.internal;

import b.d.a;
import com.google.android.gms.common.api.c;
import e.f.a.e.e.a;
import e.f.a.e.m.m;
import java.util.Map;
import java.util.Set;

public final class p0 {
  private final a<b<?>, a> a;
  
  private final a<b<?>, String> b;
  
  private final m<Map<b<?>, String>> c;
  
  private int d;
  
  private boolean e;
  
  public final Set<b<?>> a() {
    return this.a.keySet();
  }
  
  public final void a(b<?> paramb, a parama, String paramString) {
    this.a.put(paramb, parama);
    this.b.put(paramb, paramString);
    this.d--;
    if (!parama.r())
      this.e = true; 
    if (this.d == 0) {
      if (this.e) {
        c c = new c(this.a);
        this.c.a((Exception)c);
        return;
      } 
      this.c.a(this.b);
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/common/api/internal/p0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */