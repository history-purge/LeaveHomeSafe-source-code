package com.swmansion.reanimated;

import android.util.SparseArray;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.NativeModuleCallExceptionHandler;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.core.g;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.a0;
import com.facebook.react.uimanager.e;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.e;
import com.facebook.react.uimanager.o0;
import com.facebook.react.uimanager.u0;
import com.swmansion.reanimated.nodes.EventNode;
import com.swmansion.reanimated.nodes.a;
import com.swmansion.reanimated.nodes.b;
import com.swmansion.reanimated.nodes.c;
import com.swmansion.reanimated.nodes.d;
import com.swmansion.reanimated.nodes.e;
import com.swmansion.reanimated.nodes.f;
import com.swmansion.reanimated.nodes.g;
import com.swmansion.reanimated.nodes.h;
import com.swmansion.reanimated.nodes.i;
import com.swmansion.reanimated.nodes.k;
import com.swmansion.reanimated.nodes.l;
import com.swmansion.reanimated.nodes.m;
import com.swmansion.reanimated.nodes.n;
import com.swmansion.reanimated.nodes.o;
import com.swmansion.reanimated.nodes.p;
import com.swmansion.reanimated.nodes.q;
import com.swmansion.reanimated.nodes.r;
import com.swmansion.reanimated.nodes.s;
import com.swmansion.reanimated.nodes.t;
import com.swmansion.reanimated.nodes.u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

public class b implements e {
  private static final Double t = Double.valueOf(0.0D);
  
  private final SparseArray<m> a = new SparseArray();
  
  private final Map<String, EventNode> b = new HashMap<String, EventNode>();
  
  private final o0 c;
  
  private final DeviceEventManagerModule.RCTDeviceEventEmitter d;
  
  private final g e;
  
  private final e f;
  
  private final UIManagerModule.e g;
  
  private final AtomicBoolean h = new AtomicBoolean();
  
  private final n i;
  
  private final ReactContext j;
  
  private final UIManagerModule k;
  
  private List<d> l = new ArrayList<d>();
  
  private ConcurrentLinkedQueue<com.facebook.react.uimanager.events.c> m = new ConcurrentLinkedQueue<com.facebook.react.uimanager.events.c>();
  
  private boolean n;
  
  public double o;
  
  public final d p;
  
  public Set<String> q = Collections.emptySet();
  
  public Set<String> r = Collections.emptySet();
  
  private Queue<c> s = new LinkedList<c>();
  
  public b(ReactContext paramReactContext) {
    this.j = paramReactContext;
    this.k = (UIManagerModule)paramReactContext.getNativeModule(UIManagerModule.class);
    this.p = new d();
    this.c = this.k.getUIImplementation();
    this.g = this.k.getDirectEventNamesResolver();
    this.k.getEventDispatcher().a(this);
    this.d = (DeviceEventManagerModule.RCTDeviceEventEmitter)paramReactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class);
    this.e = g.a();
    this.f = new a(this, paramReactContext);
    this.i = new n(this);
  }
  
  private void a(long paramLong) {
    double d1 = paramLong;
    Double.isNaN(d1);
    this.o = d1 / 1000000.0D;
    while (!this.m.isEmpty())
      b(this.m.poll()); 
    if (!this.l.isEmpty()) {
      List<d> list = this.l;
      this.l = new ArrayList<d>(list.size());
      int j = list.size();
      int i;
      for (i = 0; i < j; i++)
        ((d)list.get(i)).b(); 
    } 
    if (this.n)
      m.runUpdates(this.p); 
    if (!this.s.isEmpty()) {
      Queue<c> queue = this.s;
      this.s = new LinkedList<c>();
      ReactContext reactContext = this.j;
      reactContext.runOnNativeModulesQueueThread((Runnable)new b(this, reactContext.getExceptionHandler(), queue));
    } 
    this.h.set(false);
    this.n = false;
    if (!this.l.isEmpty() || !this.m.isEmpty())
      d(); 
  }
  
  private void b(com.facebook.react.uimanager.events.c paramc) {
    if (!this.b.isEmpty()) {
      String str = this.g.a(paramc.d());
      int i = paramc.g();
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(i);
      stringBuilder.append(str);
      str = stringBuilder.toString();
      EventNode eventNode = this.b.get(str);
      if (eventNode != null)
        paramc.a((RCTEventEmitter)eventNode); 
    } 
  }
  
  private void d() {
    if (!this.h.getAndSet(true))
      this.e.a(g.c.e, (com.facebook.react.modules.core.a.a)this.f); 
  }
  
  private void e() {
    if (this.h.getAndSet(false))
      this.e.b(g.c.e, (com.facebook.react.modules.core.a.a)this.f); 
  }
  
  public <T extends m> T a(int paramInt, Class<T> paramClass) {
    StringBuilder stringBuilder1;
    m m = (m)this.a.get(paramInt);
    if (m == null) {
      if (paramClass == m.class || paramClass == u.class)
        return (T)this.i; 
      stringBuilder1 = new StringBuilder();
      stringBuilder1.append("Requested node with id ");
      stringBuilder1.append(paramInt);
      stringBuilder1.append(" of type ");
      stringBuilder1.append(paramClass);
      stringBuilder1.append(" cannot be found");
      throw new IllegalArgumentException(stringBuilder1.toString());
    } 
    if (paramClass.isInstance(stringBuilder1))
      return (T)stringBuilder1; 
    StringBuilder stringBuilder2 = new StringBuilder();
    stringBuilder2.append("Node with id ");
    stringBuilder2.append(paramInt);
    stringBuilder2.append(" is of incompatible type ");
    stringBuilder2.append(stringBuilder1.getClass());
    stringBuilder2.append(", requested type was ");
    stringBuilder2.append(paramClass);
    throw new IllegalArgumentException(stringBuilder2.toString());
  }
  
  public void a() {
    if (this.h.get()) {
      e();
      this.h.set(true);
    } 
  }
  
  public void a(int paramInt) {
    this.a.remove(paramInt);
  }
  
  public void a(int paramInt1, int paramInt2) {
    m m = (m)this.a.get(paramInt1);
    if (m != null) {
      if (m instanceof q) {
        ((q)m).a(paramInt2);
        return;
      } 
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("Animated node connected to view should beof type ");
      stringBuilder1.append(q.class.getName());
      throw new JSApplicationIllegalArgumentException(stringBuilder1.toString());
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Animated node with ID ");
    stringBuilder.append(paramInt1);
    stringBuilder.append(" does not exists");
    throw new JSApplicationIllegalArgumentException(stringBuilder.toString());
  }
  
  public void a(int paramInt, Callback paramCallback) {
    paramCallback.invoke(new Object[] { ((m)this.a.get(paramInt)).value() });
  }
  
  public void a(int paramInt, ReadableMap paramReadableMap) {
    if (this.a.get(paramInt) == null) {
      q q;
      StringBuilder stringBuilder1;
      String str = paramReadableMap.getString("type");
      if ("props".equals(str)) {
        q = new q(paramInt, paramReadableMap, this, this.c);
      } else {
        s s;
        if ("style".equals(str)) {
          s = new s(paramInt, (ReadableMap)q, this);
        } else {
          t t;
          if ("transform".equals(str)) {
            t = new t(paramInt, (ReadableMap)s, this);
          } else {
            u u;
            if ("value".equals(str)) {
              u = new u(paramInt, (ReadableMap)t, this);
            } else {
              c c;
              if ("block".equals(str)) {
                c = new c(paramInt, (ReadableMap)u, this);
              } else {
                h h;
                if ("cond".equals(str)) {
                  h = new h(paramInt, (ReadableMap)c, this);
                } else {
                  o o;
                  if ("op".equals(str)) {
                    o = new o(paramInt, (ReadableMap)h, this);
                  } else {
                    r r;
                    if ("set".equals(str)) {
                      r = new r(paramInt, (ReadableMap)o, this);
                    } else {
                      i i;
                      if ("debug".equals(str)) {
                        i = new i(paramInt, (ReadableMap)r, this);
                      } else {
                        e e1;
                        if ("clock".equals(str)) {
                          e1 = new e(paramInt, (ReadableMap)i, this);
                        } else {
                          f.a a;
                          if ("clockStart".equals(str)) {
                            a = new f.a(paramInt, (ReadableMap)e1, this);
                          } else {
                            f.b b1;
                            if ("clockStop".equals(str)) {
                              b1 = new f.b(paramInt, (ReadableMap)a, this);
                            } else {
                              f.c c1;
                              if ("clockTest".equals(str)) {
                                c1 = new f.c(paramInt, (ReadableMap)b1, this);
                              } else {
                                l l;
                                if ("call".equals(str)) {
                                  l = new l(paramInt, (ReadableMap)c1, this);
                                } else {
                                  b b2;
                                  if ("bezier".equals(str)) {
                                    b2 = new b(paramInt, (ReadableMap)l, this);
                                  } else {
                                    EventNode eventNode;
                                    if ("event".equals(str)) {
                                      eventNode = new EventNode(paramInt, (ReadableMap)b2, this);
                                    } else {
                                      a a1;
                                      if ("always".equals(str)) {
                                        a1 = new a(paramInt, (ReadableMap)eventNode, this);
                                      } else {
                                        g g1;
                                        if ("concat".equals(str)) {
                                          g1 = new g(paramInt, (ReadableMap)a1, this);
                                        } else {
                                          p p;
                                          if ("param".equals(str)) {
                                            p = new p(paramInt, (ReadableMap)g1, this);
                                          } else {
                                            k k;
                                            if ("func".equals(str)) {
                                              k = new k(paramInt, (ReadableMap)p, this);
                                            } else if ("callfunc".equals(str)) {
                                              d d1 = new d(paramInt, (ReadableMap)k, this);
                                            } else {
                                              stringBuilder1 = new StringBuilder();
                                              stringBuilder1.append("Unsupported node type: ");
                                              stringBuilder1.append(str);
                                              throw new JSApplicationIllegalArgumentException(stringBuilder1.toString());
                                            } 
                                          } 
                                        } 
                                      } 
                                    } 
                                  } 
                                } 
                              } 
                            } 
                          } 
                        } 
                      } 
                    } 
                  } 
                } 
              } 
            } 
          } 
        } 
      } 
      this.a.put(paramInt, stringBuilder1);
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Animated node with ID ");
    stringBuilder.append(paramInt);
    stringBuilder.append(" already exists");
    throw new JSApplicationIllegalArgumentException(stringBuilder.toString());
  }
  
  public void a(int paramInt, WritableMap paramWritableMap) {
    this.s.add(new c(this, paramInt, paramWritableMap));
  }
  
  public void a(int paramInt, Double paramDouble) {
    m m = (m)this.a.get(paramInt);
    if (m != null)
      ((u)m).a(paramDouble); 
  }
  
  public void a(int paramInt1, String paramString, int paramInt2) {
    StringBuilder stringBuilder2 = new StringBuilder();
    stringBuilder2.append(paramInt1);
    stringBuilder2.append(paramString);
    paramString = stringBuilder2.toString();
    EventNode eventNode = (EventNode)this.a.get(paramInt2);
    if (eventNode != null) {
      if (!this.b.containsKey(paramString)) {
        this.b.put(paramString, eventNode);
        return;
      } 
      throw new JSApplicationIllegalArgumentException("Event handler already set for the given view and event type");
    } 
    StringBuilder stringBuilder1 = new StringBuilder();
    stringBuilder1.append("Event node ");
    stringBuilder1.append(paramInt2);
    stringBuilder1.append(" does not exists");
    throw new JSApplicationIllegalArgumentException(stringBuilder1.toString());
  }
  
  public void a(com.facebook.react.uimanager.events.c paramc) {
    if (UiThreadUtil.isOnUiThread()) {
      b(paramc);
      return;
    } 
    this.m.offer(paramc);
    d();
  }
  
  public void a(d paramd) {
    this.l.add(paramd);
    d();
  }
  
  public void a(String paramString, WritableMap paramWritableMap) {
    this.d.emit(paramString, paramWritableMap);
  }
  
  public void a(Set<String> paramSet1, Set<String> paramSet2) {
    this.r = paramSet1;
    this.q = paramSet2;
  }
  
  public Object b(int paramInt) {
    m m = (m)this.a.get(paramInt);
    return (m != null) ? m.value() : t;
  }
  
  public void b() {
    if (this.h.getAndSet(false))
      d(); 
  }
  
  public void b(int paramInt1, int paramInt2) {
    m m1 = (m)this.a.get(paramInt1);
    m m2 = (m)this.a.get(paramInt2);
    if (m2 != null) {
      m1.addChild(m2);
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Animated node with ID ");
    stringBuilder.append(paramInt2);
    stringBuilder.append(" does not exists");
    throw new JSApplicationIllegalArgumentException(stringBuilder.toString());
  }
  
  public void b(int paramInt1, String paramString, int paramInt2) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramInt1);
    stringBuilder.append(paramString);
    paramString = stringBuilder.toString();
    this.b.remove(paramString);
  }
  
  public void c() {
    this.n = true;
    d();
  }
  
  public void c(int paramInt1, int paramInt2) {
    m m = (m)this.a.get(paramInt1);
    if (m != null) {
      if (m instanceof q) {
        ((q)m).b(paramInt2);
        return;
      } 
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("Animated node connected to view should beof type ");
      stringBuilder1.append(q.class.getName());
      throw new JSApplicationIllegalArgumentException(stringBuilder1.toString());
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Animated node with ID ");
    stringBuilder.append(paramInt1);
    stringBuilder.append(" does not exists");
    throw new JSApplicationIllegalArgumentException(stringBuilder.toString());
  }
  
  public void d(int paramInt1, int paramInt2) {
    m m1 = (m)this.a.get(paramInt1);
    m m2 = (m)this.a.get(paramInt2);
    if (m2 != null) {
      m1.removeChild(m2);
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Animated node with ID ");
    stringBuilder.append(paramInt2);
    stringBuilder.append(" does not exists");
    throw new JSApplicationIllegalArgumentException(stringBuilder.toString());
  }
  
  class a extends e {
    a(b this$0, ReactContext param1ReactContext) {
      super(param1ReactContext);
    }
    
    protected void b(long param1Long) {
      b.a(this.c, param1Long);
    }
  }
  
  class b extends GuardedRunnable {
    b(b this$0, NativeModuleCallExceptionHandler param1NativeModuleCallExceptionHandler, Queue param1Queue) {
      super(param1NativeModuleCallExceptionHandler);
    }
    
    public void runGuarded() {
      boolean bool = u0.a(b.a(this.d));
      while (!this.c.isEmpty()) {
        b.c c = this.c.remove();
        a0 a0 = b.a(this.d).f(c.a);
        if (a0 != null)
          b.b(this.d).updateView(c.a, a0.m(), (ReadableMap)c.b); 
      } 
      if (bool)
        b.a(this.d).a(-1); 
    }
  }
  
  private final class c {
    public int a;
    
    public WritableMap b;
    
    public c(b this$0, int param1Int, WritableMap param1WritableMap) {
      this.a = param1Int;
      this.b = param1WritableMap;
    }
  }
  
  public static interface d {
    void b();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/swmansion/reanimated/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */