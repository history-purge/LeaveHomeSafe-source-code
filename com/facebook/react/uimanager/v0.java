package com.facebook.react.uimanager;

import android.os.SystemClock;
import android.view.View;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactSoftException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.g1.a;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class v0 {
  private static final String B = "v0";
  
  private long A;
  
  private final int[] a = new int[4];
  
  private final m b;
  
  private final Object c = new Object();
  
  private final Object d = new Object();
  
  private final j e;
  
  private final ReactApplicationContext f;
  
  private final boolean g;
  
  private ArrayList<h> h = new ArrayList<h>();
  
  private ArrayList<u> i = new ArrayList<u>();
  
  private ArrayList<Runnable> j = new ArrayList<Runnable>();
  
  private ArrayDeque<u> k = new ArrayDeque<u>();
  
  private a l;
  
  private boolean m = false;
  
  private boolean n = false;
  
  private boolean o = false;
  
  private long p;
  
  private long q;
  
  private long r;
  
  private long s;
  
  private long t;
  
  private long u;
  
  private long v;
  
  private long w;
  
  private long x;
  
  private long y;
  
  private long z;
  
  public v0(ReactApplicationContext paramReactApplicationContext, m paramm, int paramInt) {
    this.b = paramm;
    int i = paramInt;
    if (paramInt == -1)
      i = 8; 
    this.e = new j((ReactContext)paramReactApplicationContext, i, null);
    this.f = paramReactApplicationContext;
    this.g = e.e.o.b0.a.f;
  }
  
  private void j() {
    if (this.n) {
      e.e.e.e.a.e("ReactNative", "Not flushing pending UI operations because of previously thrown Exception");
      return;
    } 
    synchronized (this.c) {
      if (!this.j.isEmpty()) {
        ArrayList<Runnable> arrayList = this.j;
        this.j = new ArrayList<Runnable>();
        long l = SystemClock.uptimeMillis();
        null = (Object<Runnable>)arrayList.iterator();
        while (null.hasNext())
          ((Runnable)null.next()).run(); 
        if (this.o) {
          this.w = SystemClock.uptimeMillis() - l;
          this.x = this.p;
          this.o = false;
          com.facebook.systrace.a.a(0L, "batchedExecutionTime", 0, 1000000L * l);
          com.facebook.systrace.a.c(0L, "batchedExecutionTime", 0);
        } 
        this.p = 0L;
        return;
      } 
      return;
    } 
  }
  
  public void a() {
    this.i.add(new c(this, 0, 0, true, false));
  }
  
  public void a(int paramInt) {
    this.i.add(new p(this, paramInt));
  }
  
  public void a(int paramInt, float paramFloat1, float paramFloat2, Callback paramCallback) {
    this.i.add(new k(paramInt, paramFloat1, paramFloat2, paramCallback, null));
  }
  
  public void a(int paramInt1, int paramInt2) {
    this.i.add(new q(paramInt1, paramInt2, null));
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
    this.i.add(new v(this, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6));
  }
  
  @Deprecated
  public void a(int paramInt1, int paramInt2, ReadableArray paramReadableArray) {
    ArrayList<u> arrayList;
    g g = new g(this, paramInt1, paramInt2, paramReadableArray);
    if (this.g) {
      ArrayList<h> arrayList1 = this.h;
    } else {
      arrayList = this.i;
    } 
    arrayList.add(g);
  }
  
  public void a(int paramInt1, int paramInt2, boolean paramBoolean) {
    this.i.add(new c(this, paramInt1, paramInt2, false, paramBoolean));
  }
  
  public void a(int paramInt, long paramLong1, long paramLong2) {
    com.facebook.systrace.b.b b = com.facebook.systrace.b.a(0L, "UIViewOperationQueue.dispatchViewUpdates");
    b.a("batchId", paramInt);
    b.a();
    try {
      ArrayList arrayList;
      long l1 = SystemClock.uptimeMillis();
      long l2 = SystemClock.currentThreadTimeMillis();
      boolean bool = this.h.isEmpty();
      ArrayDeque<u> arrayDeque = null;
      if (!bool) {
        ArrayList<h> arrayList1 = this.h;
        this.h = new ArrayList<h>();
      } else {
        b = null;
      } 
      if (!this.i.isEmpty()) {
        arrayList = this.i;
        this.i = new ArrayList<u>();
      } else {
        arrayList = null;
      } 
      Object object = this.d;
      /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
      try {
        if (!this.k.isEmpty()) {
          arrayDeque = this.k;
          this.k = new ArrayDeque<u>();
        } 
        /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
        if (this.l != null)
          this.l.a(); 
      } finally {
        b = null;
      } 
    } finally {}
    com.facebook.systrace.a.a(0L);
    throw b;
  }
  
  public void a(int paramInt, View paramView) {
    this.b.a(paramInt, paramView);
  }
  
  public void a(int paramInt, Callback paramCallback) {
    this.i.add(new o(paramInt, paramCallback, null));
  }
  
  public void a(int paramInt, ReadableArray paramReadableArray, Callback paramCallback1, Callback paramCallback2) {
    this.i.add(new s(this, paramInt, paramReadableArray, paramCallback1, paramCallback2));
  }
  
  public void a(int paramInt, Object paramObject) {
    this.i.add(new x(this, paramInt, paramObject));
  }
  
  public void a(int paramInt, String paramString, ReadableArray paramReadableArray) {
    ArrayList<u> arrayList;
    i i = new i(this, paramInt, paramString, paramReadableArray);
    if (this.g) {
      ArrayList<h> arrayList1 = this.h;
    } else {
      arrayList = this.i;
    } 
    arrayList.add(i);
  }
  
  public void a(int paramInt, String paramString, c0 paramc0) {
    this.A++;
    this.i.add(new w(paramInt, paramc0, null));
  }
  
  public void a(int paramInt, int[] paramArrayOfint1, w0[] paramArrayOfw0, int[] paramArrayOfint2) {
    this.i.add(new m(this, paramInt, paramArrayOfint1, paramArrayOfw0, paramArrayOfint2));
  }
  
  public void a(ReadableMap paramReadableMap, Callback paramCallback) {
    this.i.add(new d(paramReadableMap, paramCallback, null));
  }
  
  public void a(a0 parama0, o0.b paramb) {
    this.i.add(new l(parama0, paramb, null));
  }
  
  public void a(a parama) {
    this.l = parama;
  }
  
  public void a(k0 paramk0, int paramInt, String paramString, c0 paramc0) {
    synchronized (this.d) {
      this.z++;
      this.k.addLast(new e(this, paramk0, paramInt, paramString, paramc0));
      return;
    } 
  }
  
  public void a(n0 paramn0) {
    this.i.add(new t(this, paramn0));
  }
  
  public void a(boolean paramBoolean) {
    this.i.add(new r(paramBoolean, null));
  }
  
  public void b() {
    this.i.add(new f(null));
  }
  
  public void b(int paramInt, Callback paramCallback) {
    this.i.add(new n(paramInt, paramCallback, null));
  }
  
  public void b(n0 paramn0) {
    this.i.add(0, new t(this, paramn0));
  }
  
  m c() {
    return this.b;
  }
  
  public Map<String, Long> d() {
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    hashMap.put("CommitStartTime", Long.valueOf(this.q));
    hashMap.put("CommitEndTime", Long.valueOf(this.r));
    hashMap.put("LayoutTime", Long.valueOf(this.s));
    hashMap.put("DispatchViewUpdatesTime", Long.valueOf(this.t));
    hashMap.put("RunStartTime", Long.valueOf(this.u));
    hashMap.put("RunEndTime", Long.valueOf(this.v));
    hashMap.put("BatchedExecutionTime", Long.valueOf(this.w));
    hashMap.put("NonBatchedExecutionTime", Long.valueOf(this.x));
    hashMap.put("NativeModulesThreadCpuTime", Long.valueOf(this.y));
    hashMap.put("CreateViewCount", Long.valueOf(this.z));
    hashMap.put("UpdatePropsCount", Long.valueOf(this.A));
    return (Map)hashMap;
  }
  
  public boolean e() {
    return (this.i.isEmpty() && this.h.isEmpty());
  }
  
  void f() {
    this.m = false;
    com.facebook.react.modules.core.g.a().b(com.facebook.react.modules.core.g.c.d, this.e);
    j();
  }
  
  public void g() {
    this.o = true;
    this.q = 0L;
    this.z = 0L;
    this.A = 0L;
  }
  
  void h() {
    this.m = true;
    com.facebook.react.modules.core.g.a().a(com.facebook.react.modules.core.g.c.d, this.e);
  }
  
  class a implements Runnable {
    a(v0 this$0, int param1Int, ArrayList param1ArrayList1, ArrayDeque param1ArrayDeque, ArrayList param1ArrayList2, long param1Long1, long param1Long2, long param1Long3, long param1Long4) {}
    
    public void run() {
      com.facebook.systrace.b.b b = com.facebook.systrace.b.a(0L, "DispatchUI");
      b.a("BatchId", this.c);
      b.a();
      try {
        long l = SystemClock.uptimeMillis();
        if (this.d != null) {
          Iterator<v0.h> iterator = this.d.iterator();
          while (true) {
            String str;
            Exception exception;
            if (iterator.hasNext()) {
              v0.h h = iterator.next();
            } else {
              break;
            } 
            ReactSoftException.logSoftException(str, exception);
          } 
        } 
        if (this.e != null) {
          Iterator<v0.u> iterator = this.e.iterator();
          while (iterator.hasNext())
            ((v0.u)iterator.next()).execute(); 
        } 
        if (this.f != null) {
          Iterator<v0.u> iterator = this.f.iterator();
          while (iterator.hasNext())
            ((v0.u)iterator.next()).execute(); 
        } 
        if (v0.c(this.k) && v0.d(this.k) == 0L) {
          v0.a(this.k, this.g);
          v0.b(this.k, SystemClock.uptimeMillis());
          v0.c(this.k, this.h);
          v0.d(this.k, this.i);
          v0.e(this.k, l);
          v0.f(this.k, v0.e(this.k));
          v0.g(this.k, this.j);
          com.facebook.systrace.a.a(0L, "delayBeforeDispatchViewUpdates", 0, v0.d(this.k) * 1000000L);
          com.facebook.systrace.a.b(0L, "delayBeforeDispatchViewUpdates", 0, v0.f(this.k) * 1000000L);
          com.facebook.systrace.a.a(0L, "delayBeforeBatchRunStart", 0, v0.f(this.k) * 1000000L);
          com.facebook.systrace.a.b(0L, "delayBeforeBatchRunStart", 0, v0.g(this.k) * 1000000L);
        } 
        v0.a(this.k).b();
        if (v0.h(this.k) != null)
          v0.h(this.k).b(); 
        com.facebook.systrace.a.a(0L);
        return;
      } catch (Exception exception) {
        v0.a(this.k, true);
        throw exception;
      } finally {}
      com.facebook.systrace.a.a(0L);
      throw b;
    }
  }
  
  class b extends GuardedRunnable {
    b(v0 this$0, ReactContext param1ReactContext) {
      super(param1ReactContext);
    }
    
    public void runGuarded() {
      v0.j(this.c);
    }
  }
  
  private final class c extends y {
    private final int b;
    
    private final boolean c;
    
    private final boolean d;
    
    public c(v0 this$0, int param1Int1, int param1Int2, boolean param1Boolean1, boolean param1Boolean2) {
      super(this$0, param1Int1);
      this.b = param1Int2;
      this.d = param1Boolean1;
      this.c = param1Boolean2;
    }
    
    public void execute() {
      if (!this.d) {
        v0.a(this.e).a(this.a, this.b, this.c);
        return;
      } 
      v0.a(this.e).a();
    }
  }
  
  private class d implements u {
    private final ReadableMap a;
    
    private final Callback b;
    
    private d(v0 this$0, ReadableMap param1ReadableMap, Callback param1Callback) {
      this.a = param1ReadableMap;
      this.b = param1Callback;
    }
    
    public void execute() {
      v0.a(this.c).a(this.a, this.b);
    }
  }
  
  private final class e extends y {
    private final k0 b;
    
    private final String c;
    
    private final c0 d;
    
    public e(v0 this$0, k0 param1k0, int param1Int, String param1String, c0 param1c0) {
      super(this$0, param1Int);
      this.b = param1k0;
      this.c = param1String;
      this.d = param1c0;
      com.facebook.systrace.a.d(0L, "createView", this.a);
    }
    
    public void execute() {
      com.facebook.systrace.a.b(0L, "createView", this.a);
      v0.a(this.e).a(this.b, this.a, this.c, this.d);
    }
  }
  
  private final class f implements u {
    private f(v0 this$0) {}
    
    public void execute() {
      v0.a(this.a).c();
    }
  }
  
  @Deprecated
  private final class g extends y implements h {
    private final int b;
    
    private final ReadableArray c;
    
    private int d = 0;
    
    public g(v0 this$0, int param1Int1, int param1Int2, ReadableArray param1ReadableArray) {
      super(this$0, param1Int1);
      this.b = param1Int2;
      this.c = param1ReadableArray;
    }
    
    public int a() {
      return this.d;
    }
    
    public void b() {
      v0.a(this.e).a(this.a, this.b, this.c);
    }
    
    public void c() {
      this.d++;
    }
    
    public void execute() {
      try {
        return;
      } finally {
        Exception exception = null;
        ReactSoftException.logSoftException(v0.i(), new RuntimeException("Error dispatching View Command", exception));
      } 
    }
  }
  
  private static interface h {
    int a();
    
    void b();
    
    void c();
  }
  
  private final class i extends y implements h {
    private final String b;
    
    private final ReadableArray c;
    
    private int d = 0;
    
    public i(v0 this$0, int param1Int, String param1String, ReadableArray param1ReadableArray) {
      super(this$0, param1Int);
      this.b = param1String;
      this.c = param1ReadableArray;
    }
    
    public int a() {
      return this.d;
    }
    
    public void b() {
      v0.a(this.e).a(this.a, this.b, this.c);
    }
    
    public void c() {
      this.d++;
    }
    
    public void execute() {
      try {
        return;
      } finally {
        Exception exception = null;
        ReactSoftException.logSoftException(v0.i(), new RuntimeException("Error dispatching View Command", exception));
      } 
    }
  }
  
  private class j extends e {
    private final int c;
    
    private j(v0 this$0, ReactContext param1ReactContext, int param1Int) {
      super(param1ReactContext);
      this.c = param1Int;
    }
    
    private void c(long param1Long) {
      while (true) {
        if (16L - (System.nanoTime() - param1Long) / 1000000L < this.c)
          return; 
        synchronized (v0.k(this.d)) {
          if (v0.l(this.d).isEmpty())
            return; 
          v0.u u = v0.l(this.d).pollFirst();
          try {
            long l = SystemClock.uptimeMillis();
            u.execute();
            v0.h(this.d, v0.m(this.d) + SystemClock.uptimeMillis() - l);
          } catch (Exception null) {
            v0.a(this.d, true);
            throw null;
          } 
        } 
      } 
    }
    
    public void b(long param1Long) {
      if (v0.i(this.d)) {
        e.e.e.e.a.e("ReactNative", "Not flushing pending UI operations because of previously thrown Exception");
        return;
      } 
      com.facebook.systrace.a.a(0L, "dispatchNonBatchedUIOperations");
      try {
        c(param1Long);
        com.facebook.systrace.a.a(0L);
        v0.j(this.d);
        return;
      } finally {
        com.facebook.systrace.a.a(0L);
      } 
    }
  }
  
  private final class k implements u {
    private final int a;
    
    private final float b;
    
    private final float c;
    
    private final Callback d;
    
    private k(v0 this$0, int param1Int, float param1Float1, float param1Float2, Callback param1Callback) {
      this.a = param1Int;
      this.b = param1Float1;
      this.c = param1Float2;
      this.d = param1Callback;
    }
    
    public void execute() {
      try {
        v0.a(this.e).a(this.a, v0.n(this.e));
        float f1 = v0.n(this.e)[0];
        float f2 = v0.n(this.e)[1];
        int i = v0.a(this.e).a(this.a, this.b, this.c);
        try {
          v0.a(this.e).a(i, v0.n(this.e));
          f1 = q.a(v0.n(this.e)[0] - f1);
          f2 = q.a(v0.n(this.e)[1] - f2);
          float f3 = q.a(v0.n(this.e)[2]);
          float f4 = q.a(v0.n(this.e)[3]);
          this.d.invoke(new Object[] { Integer.valueOf(i), Float.valueOf(f1), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4) });
          return;
        } catch (g g) {
          this.d.invoke(new Object[0]);
        } 
        return;
      } catch (g g) {
        this.d.invoke(new Object[0]);
        return;
      } 
    }
  }
  
  private final class l implements u {
    private final a0 a;
    
    private final o0.b b;
    
    private l(v0 this$0, a0 param1a0, o0.b param1b) {
      this.a = param1a0;
      this.b = param1b;
    }
    
    public void execute() {
      this.b.a(this.a);
    }
  }
  
  private final class m extends y {
    private final int[] b;
    
    private final w0[] c;
    
    private final int[] d;
    
    public m(v0 this$0, int param1Int, int[] param1ArrayOfint1, w0[] param1ArrayOfw0, int[] param1ArrayOfint2) {
      super(this$0, param1Int);
      this.b = param1ArrayOfint1;
      this.c = param1ArrayOfw0;
      this.d = param1ArrayOfint2;
    }
    
    public void execute() {
      v0.a(this.e).a(this.a, this.b, this.c, this.d);
    }
  }
  
  private final class n implements u {
    private final int a;
    
    private final Callback b;
    
    private n(v0 this$0, int param1Int, Callback param1Callback) {
      this.a = param1Int;
      this.b = param1Callback;
    }
    
    public void execute() {
      try {
        v0.a(this.c).b(this.a, v0.n(this.c));
        float f1 = q.a(v0.n(this.c)[0]);
        float f2 = q.a(v0.n(this.c)[1]);
        float f3 = q.a(v0.n(this.c)[2]);
        float f4 = q.a(v0.n(this.c)[3]);
        this.b.invoke(new Object[] { Float.valueOf(f1), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4) });
        return;
      } catch (o o) {
        this.b.invoke(new Object[0]);
        return;
      } 
    }
  }
  
  private final class o implements u {
    private final int a;
    
    private final Callback b;
    
    private o(v0 this$0, int param1Int, Callback param1Callback) {
      this.a = param1Int;
      this.b = param1Callback;
    }
    
    public void execute() {
      try {
        v0.a(this.c).a(this.a, v0.n(this.c));
        float f1 = q.a(v0.n(this.c)[0]);
        float f2 = q.a(v0.n(this.c)[1]);
        float f3 = q.a(v0.n(this.c)[2]);
        float f4 = q.a(v0.n(this.c)[3]);
        this.b.invoke(new Object[] { Integer.valueOf(0), Integer.valueOf(0), Float.valueOf(f3), Float.valueOf(f4), Float.valueOf(f1), Float.valueOf(f2) });
        return;
      } catch (o o1) {
        this.b.invoke(new Object[0]);
        return;
      } 
    }
  }
  
  private final class p extends y {
    public p(v0 this$0, int param1Int) {
      super(this$0, param1Int);
    }
    
    public void execute() {
      v0.a(this.b).a(this.a);
    }
  }
  
  private final class q extends y {
    private final int b;
    
    private q(v0 this$0, int param1Int1, int param1Int2) {
      super(param1Int1);
      this.b = param1Int2;
    }
    
    public void execute() {
      v0.a(this.c).a(this.a, this.b);
    }
  }
  
  private class r implements u {
    private final boolean a;
    
    private r(v0 this$0, boolean param1Boolean) {
      this.a = param1Boolean;
    }
    
    public void execute() {
      v0.a(this.b).a(this.a);
    }
  }
  
  private final class s extends y {
    private final ReadableArray b;
    
    private final Callback c;
    
    private final Callback d;
    
    public s(v0 this$0, int param1Int, ReadableArray param1ReadableArray, Callback param1Callback1, Callback param1Callback2) {
      super(this$0, param1Int);
      this.b = param1ReadableArray;
      this.c = param1Callback1;
      this.d = param1Callback2;
    }
    
    public void execute() {
      v0.a(this.e).a(this.a, this.b, this.d, this.c);
    }
  }
  
  private class t implements u {
    private final n0 a;
    
    public t(v0 this$0, n0 param1n0) {
      this.a = param1n0;
    }
    
    public void execute() {
      this.a.a(v0.a(this.b));
    }
  }
  
  public static interface u {
    void execute();
  }
  
  private final class v extends y {
    private final int b;
    
    private final int c;
    
    private final int d;
    
    private final int e;
    
    private final int f;
    
    public v(v0 this$0, int param1Int1, int param1Int2, int param1Int3, int param1Int4, int param1Int5, int param1Int6) {
      super(this$0, param1Int2);
      this.b = param1Int1;
      this.c = param1Int3;
      this.d = param1Int4;
      this.e = param1Int5;
      this.f = param1Int6;
      com.facebook.systrace.a.d(0L, "updateLayout", this.a);
    }
    
    public void execute() {
      com.facebook.systrace.a.b(0L, "updateLayout", this.a);
      v0.a(this.g).a(this.b, this.a, this.c, this.d, this.e, this.f);
    }
  }
  
  private final class w extends y {
    private final c0 b;
    
    private w(v0 this$0, int param1Int, c0 param1c0) {
      super(param1Int);
      this.b = param1c0;
    }
    
    public void execute() {
      v0.a(this.c).a(this.a, this.b);
    }
  }
  
  private final class x extends y {
    private final Object b;
    
    public x(v0 this$0, int param1Int, Object param1Object) {
      super(this$0, param1Int);
      this.b = param1Object;
    }
    
    public void execute() {
      v0.a(this.c).a(this.a, this.b);
    }
  }
  
  private abstract class y implements u {
    public int a;
    
    public y(v0 this$0, int param1Int) {
      this.a = param1Int;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/uimanager/v0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */