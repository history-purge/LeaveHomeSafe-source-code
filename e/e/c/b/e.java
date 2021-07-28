package e.e.c.b;

import android.content.Context;
import e.e.c.a.d;
import e.e.c.a.j;
import e.e.e.a.a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public class e implements i, a {
  private static final Class<?> q = e.class;
  
  private static final long r = TimeUnit.HOURS.toMillis(2L);
  
  private static final long s = TimeUnit.MINUTES.toMillis(30L);
  
  private final long a;
  
  private final long b;
  
  private final CountDownLatch c;
  
  private long d;
  
  private final e.e.c.a.c e;
  
  final Set<String> f;
  
  private long g;
  
  private final e.e.e.i.a h;
  
  private final d i;
  
  private final h j;
  
  private final e.e.c.a.a k;
  
  private final boolean l;
  
  private final b m;
  
  private final com.facebook.common.time.a n;
  
  private final Object o = new Object();
  
  private boolean p;
  
  public e(d paramd, h paramh, c paramc, e.e.c.a.c paramc1, e.e.c.a.a parama, e.e.e.a.b paramb, Context paramContext, Executor paramExecutor, boolean paramBoolean) {
    this.a = paramc.b;
    long l = paramc.c;
    this.b = l;
    this.d = l;
    this.h = e.e.e.i.a.b();
    this.i = paramd;
    this.j = paramh;
    this.g = -1L;
    this.e = paramc1;
    l = paramc.a;
    this.k = parama;
    this.m = new b();
    this.n = (com.facebook.common.time.a)com.facebook.common.time.c.a();
    this.l = paramBoolean;
    this.f = new HashSet<String>();
    if (paramb != null)
      paramb.a(this); 
    if (this.l) {
      this.c = new CountDownLatch(1);
      paramExecutor.execute(new a(this));
      return;
    } 
    this.c = new CountDownLatch(0);
  }
  
  private e.e.b.a a(d.b paramb, d paramd, String paramString) {
    synchronized (this.o) {
      e.e.b.a a1 = paramb.a(paramd);
      this.f.add(paramString);
      this.m.a(a1.size(), 1L);
      return a1;
    } 
  }
  
  private d.b a(String paramString, d paramd) {
    b();
    return this.i.a(paramString, paramd);
  }
  
  private Collection<d.a> a(Collection<d.a> paramCollection) {
    long l1 = this.n.now();
    long l2 = r;
    ArrayList<d.a> arrayList1 = new ArrayList(paramCollection.size());
    ArrayList<d.a> arrayList2 = new ArrayList(paramCollection.size());
    for (d.a a1 : paramCollection) {
      if (a1.c() > l1 + l2) {
        arrayList1.add(a1);
        continue;
      } 
      arrayList2.add(a1);
    } 
    Collections.sort(arrayList2, this.j.get());
    arrayList1.addAll(arrayList2);
    return arrayList1;
  }
  
  private void a(long paramLong, e.e.c.a.c.a parama) {
    try {
      Collection<d.a> collection = a(this.i.b());
      long l2 = this.m.b();
      int j = 0;
      Iterator<d.a> iterator = collection.iterator();
      long l1 = 0L;
      while (iterator.hasNext()) {
        d.a a1 = iterator.next();
        if (l1 > l2 - paramLong)
          break; 
        long l = this.i.a(a1);
        this.f.remove(a1.a());
        if (l > 0L) {
          j++;
          l1 += l;
          j j1 = j.b();
          j1.a(a1.a());
          j1.a(parama);
          j1.c(l);
          j1.b(l2 - l1);
          j1.a(paramLong);
          this.e.c(j1);
          j1.a();
        } 
      } 
      this.m.a(-l1, -j);
      this.i.d();
      return;
    } catch (IOException iOException) {
      e.e.c.a.a a1 = this.k;
      e.e.c.a.a.a a2 = e.e.c.a.a.a.q;
      Class<?> clazz = q;
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("evictAboveSize: ");
      stringBuilder.append(iOException.getMessage());
      a1.a(a2, clazz, stringBuilder.toString(), iOException);
      throw iOException;
    } 
  }
  
  private void b() {
    synchronized (this.o) {
      boolean bool = c();
      e();
      long l = this.m.b();
      if (l > this.d && !bool) {
        this.m.d();
        c();
      } 
      if (l > this.d)
        a(this.d * 9L / 10L, e.e.c.a.c.a.c); 
      return;
    } 
  }
  
  private boolean c() {
    long l = this.n.now();
    if (this.m.c()) {
      long l1 = this.g;
      if (l1 != -1L && l - l1 <= s)
        return false; 
    } 
    return d();
  }
  
  private boolean d() {
    Set<String> set;
    long l2 = this.n.now();
    long l1 = r + l2;
    if (this.l && this.f.isEmpty()) {
      set = this.f;
    } else if (this.l) {
      set = new HashSet();
    } else {
      set = null;
    } 
    try {
      Iterator<d.a> iterator = this.i.b().iterator();
      long l4 = -1L;
      byte b1 = 0;
      boolean bool = false;
      long l3 = 0L;
      int k = 0;
      int j = 0;
      while (true) {
        byte b2;
        boolean bool1;
        int m;
        long l;
        if (iterator.hasNext()) {
          d.a a1 = iterator.next();
          m = j + 1;
          l = l3 + a1.b();
          if (a1.c() > l1) {
            b2 = b1 + 1;
            bool1 = (int)(bool + a1.b());
            l3 = Math.max(a1.c() - l2, l4);
            j = 1;
          } else {
            l3 = l4;
            j = k;
            b2 = b1;
            bool1 = bool;
            if (this.l) {
              set.add(a1.a());
              l3 = l4;
              j = k;
              b2 = b1;
              bool1 = bool;
            } 
          } 
        } else {
          if (k) {
            e.e.c.a.a a1 = this.k;
            e.e.c.a.a.a a2 = e.e.c.a.a.a.f;
            Class<?> clazz = q;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Future timestamp found in ");
            stringBuilder.append(b1);
            stringBuilder.append(" files , with a total size of ");
            stringBuilder.append(bool);
            stringBuilder.append(" bytes, and a maximum time delta of ");
            stringBuilder.append(l4);
            stringBuilder.append("ms");
            a1.a(a2, clazz, stringBuilder.toString(), null);
          } 
          l1 = this.m.a();
          l4 = j;
          if (l1 != l4 || this.m.b() != l3) {
            if (this.l && this.f != set) {
              this.f.clear();
              this.f.addAll(set);
            } 
            this.m.b(l3, l4);
          } 
          this.g = l2;
          return true;
        } 
        l4 = l3;
        k = j;
        j = m;
        l3 = l;
        b1 = b2;
        bool = bool1;
      } 
    } catch (IOException iOException) {
      e.e.c.a.a a1 = this.k;
      e.e.c.a.a.a a2 = e.e.c.a.a.a.r;
      Class<?> clazz = q;
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("calcFileCacheSize: ");
      stringBuilder.append(iOException.getMessage());
      a1.a(a2, clazz, stringBuilder.toString(), iOException);
      return false;
    } 
  }
  
  private void e() {
    long l;
    e.e.e.i.a.a a1;
    if (this.i.c()) {
      a1 = e.e.e.i.a.a.d;
    } else {
      a1 = e.e.e.i.a.a.c;
    } 
    if (this.h.a(a1, this.b - this.m.b())) {
      l = this.a;
    } else {
      l = this.b;
    } 
    this.d = l;
  }
  
  public e.e.b.a a(d paramd, j paramj) {
    j j1 = j.b();
    j1.a(paramd);
    this.e.g(j1);
    synchronized (this.o) {
      String str = e.e.c.a.e.a(paramd);
      j1.a(str);
      try {
        null = a(str, paramd);
        try {
          null.a(paramj, paramd);
          e.e.b.a a1 = a((d.b)null, paramd, str);
          j1.c(a1.size());
          j1.b(this.m.b());
          this.e.b(j1);
          if (!null.s())
            e.e.e.e.a.a(q, "Failed to delete temp file"); 
          return a1;
        } finally {
          if (!null.s())
            e.e.e.e.a.a(q, "Failed to delete temp file"); 
        } 
      } catch (IOException iOException) {
        j1.a(iOException);
        this.e.e(j1);
        e.e.e.e.a.a(q, "Failed inserting a file into the cache", iOException);
        throw iOException;
      } finally {}
      j1.a();
      throw paramd;
    } 
  }
  
  public void a() {
    Object object = this.o;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
    try {
      this.i.a();
      this.f.clear();
      this.e.a();
    } catch (IOException iOException) {
      e.e.c.a.a a1 = this.k;
      e.e.c.a.a.a a2 = e.e.c.a.a.a.q;
      Class<?> clazz = q;
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("clearAll: ");
      stringBuilder.append(iOException.getMessage());
      a1.a(a2, clazz, stringBuilder.toString(), iOException);
    } catch (NullPointerException nullPointerException) {
    
    } finally {
      Exception exception;
    } 
    this.m.d();
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
  }
  
  public void a(d paramd) {
    Object object = this.o;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
    try {
      List<String> list = e.e.c.a.e.b(paramd);
      for (int j = 0; j < list.size(); j++) {
        String str = list.get(j);
        this.i.a(str);
        this.f.remove(str);
      } 
    } catch (IOException iOException) {
      e.e.c.a.a a1 = this.k;
      e.e.c.a.a.a a2 = e.e.c.a.a.a.p;
      Class<?> clazz = q;
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("delete: ");
      stringBuilder.append(iOException.getMessage());
      a1.a(a2, clazz, stringBuilder.toString(), iOException);
    } finally {}
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
  }
  
  public boolean b(d paramd) {
    synchronized (this.o) {
      if (d(paramd))
        return true; 
      try {
        List<String> list = e.e.c.a.e.b(paramd);
        for (int j = 0;; j++) {
          if (j < list.size()) {
            String str = list.get(j);
            if (this.i.b(str, paramd)) {
              this.f.add(str);
              return true;
            } 
          } else {
            return false;
          } 
        } 
      } catch (IOException iOException) {}
      return false;
    } 
  }
  
  public e.e.b.a c(d paramd) {
    j j = j.b();
    j.a(paramd);
    try {
      synchronized (this.o) {
        List<String> list = e.e.c.a.e.b(paramd);
        int k = 0;
        String str2 = null;
        String str1 = str2;
        while (true) {
          e.e.b.a a1;
          if (k < list.size()) {
            str2 = list.get(k);
            j.a(str2);
            a1 = this.i.c(str2, paramd);
            if (a1 == null) {
              k++;
              continue;
            } 
          } 
          if (a1 == null) {
            this.e.a(j);
            this.f.remove(str2);
          } else {
            this.e.f(j);
            this.f.add(str2);
          } 
          j.a();
          return a1;
        } 
      } 
    } catch (IOException iOException) {
      this.k.a(e.e.c.a.a.a.r, q, "getResource", iOException);
      j.a(iOException);
      this.e.d(j);
      j.a();
      return null;
    } finally {}
    j.a();
    throw paramd;
  }
  
  public boolean d(d paramd) {
    synchronized (this.o) {
      List<String> list = e.e.c.a.e.b(paramd);
      for (int j = 0;; j++) {
        if (j < list.size()) {
          String str = list.get(j);
          if (this.f.contains(str))
            return true; 
        } else {
          return false;
        } 
      } 
    } 
  }
  
  class a implements Runnable {
    a(e this$0) {}
    
    public void run() {
      synchronized (e.a(this.c)) {
        e.b(this.c);
        e.a(this.c, true);
        e.c(this.c).countDown();
        return;
      } 
    }
  }
  
  static class b {
    private boolean a = false;
    
    private long b = -1L;
    
    private long c = -1L;
    
    public long a() {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: getfield c : J
      //   6: lstore_1
      //   7: aload_0
      //   8: monitorexit
      //   9: lload_1
      //   10: lreturn
      //   11: astore_3
      //   12: aload_0
      //   13: monitorexit
      //   14: aload_3
      //   15: athrow
      // Exception table:
      //   from	to	target	type
      //   2	7	11	finally
    }
    
    public void a(long param1Long1, long param1Long2) {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: getfield a : Z
      //   6: ifeq -> 29
      //   9: aload_0
      //   10: aload_0
      //   11: getfield b : J
      //   14: lload_1
      //   15: ladd
      //   16: putfield b : J
      //   19: aload_0
      //   20: aload_0
      //   21: getfield c : J
      //   24: lload_3
      //   25: ladd
      //   26: putfield c : J
      //   29: aload_0
      //   30: monitorexit
      //   31: return
      //   32: astore #5
      //   34: aload_0
      //   35: monitorexit
      //   36: aload #5
      //   38: athrow
      // Exception table:
      //   from	to	target	type
      //   2	29	32	finally
    }
    
    public long b() {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: getfield b : J
      //   6: lstore_1
      //   7: aload_0
      //   8: monitorexit
      //   9: lload_1
      //   10: lreturn
      //   11: astore_3
      //   12: aload_0
      //   13: monitorexit
      //   14: aload_3
      //   15: athrow
      // Exception table:
      //   from	to	target	type
      //   2	7	11	finally
    }
    
    public void b(long param1Long1, long param1Long2) {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: lload_3
      //   4: putfield c : J
      //   7: aload_0
      //   8: lload_1
      //   9: putfield b : J
      //   12: aload_0
      //   13: iconst_1
      //   14: putfield a : Z
      //   17: aload_0
      //   18: monitorexit
      //   19: return
      //   20: astore #5
      //   22: aload_0
      //   23: monitorexit
      //   24: aload #5
      //   26: athrow
      // Exception table:
      //   from	to	target	type
      //   2	17	20	finally
    }
    
    public boolean c() {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: getfield a : Z
      //   6: istore_1
      //   7: aload_0
      //   8: monitorexit
      //   9: iload_1
      //   10: ireturn
      //   11: astore_2
      //   12: aload_0
      //   13: monitorexit
      //   14: aload_2
      //   15: athrow
      // Exception table:
      //   from	to	target	type
      //   2	7	11	finally
    }
    
    public void d() {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: iconst_0
      //   4: putfield a : Z
      //   7: aload_0
      //   8: ldc2_w -1
      //   11: putfield c : J
      //   14: aload_0
      //   15: ldc2_w -1
      //   18: putfield b : J
      //   21: aload_0
      //   22: monitorexit
      //   23: return
      //   24: astore_1
      //   25: aload_0
      //   26: monitorexit
      //   27: aload_1
      //   28: athrow
      // Exception table:
      //   from	to	target	type
      //   2	21	24	finally
    }
  }
  
  public static class c {
    public final long a;
    
    public final long b;
    
    public final long c;
    
    public c(long param1Long1, long param1Long2, long param1Long3) {
      this.a = param1Long1;
      this.b = param1Long2;
      this.c = param1Long3;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/c/b/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */