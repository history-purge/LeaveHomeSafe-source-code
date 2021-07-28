package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobInfo;
import e.f.a.c.d;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class n {
  private long a(int paramInt, long paramLong) {
    long l;
    paramInt--;
    if (paramLong > 1L) {
      l = paramLong;
    } else {
      l = 2L;
    } 
    double d1 = Math.max(1.0D, Math.log(10000.0D) / Math.log((l * paramInt)));
    double d2 = Math.pow(3.0D, paramInt);
    double d3 = paramLong;
    Double.isNaN(d3);
    return (long)(d2 * d3 * d1);
  }
  
  public static n a(e.f.a.c.i.z.a parama) {
    a a1 = c();
    d d = d.c;
    b.a a2 = b.d();
    a2.a(30000L);
    a2.b(86400000L);
    a1.a(d, a2.a());
    d = d.e;
    a2 = b.d();
    a2.a(1000L);
    a2.b(86400000L);
    a1.a(d, a2.a());
    d = d.d;
    a2 = b.d();
    a2.a(86400000L);
    a2.b(86400000L);
    a2.a(a(new c[] { c.c, c.d }));
    a1.a(d, a2.a());
    a1.a(parama);
    return a1.a();
  }
  
  static n a(e.f.a.c.i.z.a parama, Map<d, b> paramMap) {
    return new k(parama, paramMap);
  }
  
  private static <T> Set<T> a(T... paramVarArgs) {
    return Collections.unmodifiableSet(new HashSet<T>(Arrays.asList(paramVarArgs)));
  }
  
  private void a(JobInfo.Builder paramBuilder, Set<c> paramSet) {
    if (paramSet.contains(c.c)) {
      paramBuilder.setRequiredNetworkType(2);
    } else {
      paramBuilder.setRequiredNetworkType(1);
    } 
    if (paramSet.contains(c.e))
      paramBuilder.setRequiresCharging(true); 
    if (paramSet.contains(c.d))
      paramBuilder.setRequiresDeviceIdle(true); 
  }
  
  public static a c() {
    return new a();
  }
  
  public long a(d paramd, long paramLong, int paramInt) {
    long l = a().a();
    b b = b().get(paramd);
    return Math.min(Math.max(a(paramInt, b.a()), paramLong - l), b.c());
  }
  
  public JobInfo.Builder a(JobInfo.Builder paramBuilder, d paramd, long paramLong, int paramInt) {
    paramBuilder.setMinimumLatency(a(paramd, paramLong, paramInt));
    a(paramBuilder, ((b)b().get(paramd)).b());
    return paramBuilder;
  }
  
  abstract e.f.a.c.i.z.a a();
  
  abstract Map<d, b> b();
  
  public static class a {
    private e.f.a.c.i.z.a a;
    
    private Map<d, n.b> b = new HashMap<d, n.b>();
    
    public a a(d param1d, n.b param1b) {
      this.b.put(param1d, param1b);
      return this;
    }
    
    public a a(e.f.a.c.i.z.a param1a) {
      this.a = param1a;
      return this;
    }
    
    public n a() {
      if (this.a != null) {
        if (this.b.keySet().size() >= (d.values()).length) {
          Map<d, n.b> map = this.b;
          this.b = new HashMap<d, n.b>();
          return n.a(this.a, map);
        } 
        throw new IllegalStateException("Not all priorities have been configured");
      } 
      throw new NullPointerException("missing required property: clock");
    }
  }
  
  public static abstract class b {
    public static a d() {
      l.b b1 = new l.b();
      b1.a(Collections.emptySet());
      return b1;
    }
    
    abstract long a();
    
    abstract Set<n.c> b();
    
    abstract long c();
    
    public static abstract class a {
      public abstract a a(long param2Long);
      
      public abstract a a(Set<n.c> param2Set);
      
      public abstract n.b a();
      
      public abstract a b(long param2Long);
    }
  }
  
  public static abstract class a {
    public abstract a a(long param1Long);
    
    public abstract a a(Set<n.c> param1Set);
    
    public abstract n.b a();
    
    public abstract a b(long param1Long);
  }
  
  public enum c {
    c, d, e;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/datatransport/runtime/scheduling/jobscheduling/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */