package com.facebook.react.fabric;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.NativeMap;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.RetryableMountingLayerException;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.fabric.e.a;
import com.facebook.react.fabric.e.b;
import com.facebook.react.fabric.events.EventBeatManager;
import com.facebook.react.fabric.events.EventEmitterWrapper;
import com.facebook.react.fabric.events.FabricEventEmitter;
import com.facebook.react.fabric.mounting.mountitems.BatchMountItem;
import com.facebook.react.fabric.mounting.mountitems.a;
import com.facebook.react.fabric.mounting.mountitems.b;
import com.facebook.react.fabric.mounting.mountitems.c;
import com.facebook.react.fabric.mounting.mountitems.d;
import com.facebook.react.fabric.mounting.mountitems.e;
import com.facebook.react.fabric.mounting.mountitems.f;
import com.facebook.react.fabric.mounting.mountitems.g;
import com.facebook.react.fabric.mounting.mountitems.h;
import com.facebook.react.fabric.mounting.mountitems.i;
import com.facebook.react.fabric.mounting.mountitems.j;
import com.facebook.react.fabric.mounting.mountitems.k;
import com.facebook.react.fabric.mounting.mountitems.l;
import com.facebook.react.fabric.mounting.mountitems.m;
import com.facebook.react.fabric.mounting.mountitems.n;
import com.facebook.react.fabric.mounting.mountitems.o;
import com.facebook.react.fabric.mounting.mountitems.p;
import com.facebook.react.fabric.mounting.mountitems.q;
import com.facebook.react.modules.core.g;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.d;
import com.facebook.react.uimanager.j0;
import com.facebook.react.uimanager.k0;
import com.facebook.react.uimanager.y;
import com.facebook.react.uimanager.z;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@SuppressLint({"MissingNativeLoadLibrary"})
public class c implements UIManager, LifecycleEventListener {
  public static final boolean A;
  
  private Binding c;
  
  private final ReactApplicationContext d;
  
  private final b e;
  
  private final d f;
  
  private final ConcurrentHashMap<Integer, k0> g;
  
  private final EventBeatManager h;
  
  private final Object i;
  
  private final Object j;
  
  private final Object k;
  
  private boolean l;
  
  private int m;
  
  private List<c> n;
  
  private List<g> o;
  
  private ArrayDeque<g> p;
  
  private final c q;
  
  private volatile boolean r;
  
  private long s;
  
  private long t;
  
  private long u;
  
  private long v;
  
  private long w;
  
  private long x;
  
  private long y;
  
  private int z;
  
  static {
    boolean bool;
    if (e.e.o.b0.a.b || e.e.h.b.c.a().a(e.e.h.c.a.e)) {
      bool = true;
    } else {
      bool = false;
    } 
    A = bool;
    b.a();
  }
  
  private void a(c paramc) {
    if (e.e.o.b0.a.f)
      synchronized (this.i) {
        this.n.add(paramc);
        return;
      }  
    synchronized (this.j) {
      this.o.add(paramc);
      return;
    } 
  }
  
  private boolean a() {
    if (this.m == 0)
      this.t = 0L; 
    this.s = SystemClock.uptimeMillis();
    List<c> list = d();
    List<g> list1 = b();
    if (list1 == null && list == null)
      return false; 
    if (list != null) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("FabricUIManager::mountViews viewCommandMountItems to execute: ");
      stringBuilder.append(list.size());
      com.facebook.systrace.a.a(0L, stringBuilder.toString());
      for (c c1 : list) {
        ReactNoCrashSoftException reactNoCrashSoftException;
        RuntimeException runtimeException;
        if (A);
        try {
          c1.a(this.e);
          continue;
        } catch (RetryableMountingLayerException retryableMountingLayerException) {
          if (c1.a() == 0) {
            c1.b();
            a(c1);
            continue;
          } 
        } finally {
          Exception exception = null;
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Caught exception executing ViewCommand: ");
          stringBuilder1.append(reactNoCrashSoftException.toString());
        } 
        ReactSoftException.logSoftException("FabricUIManager", runtimeException);
      } 
      com.facebook.systrace.a.a(0L);
    } 
    ArrayDeque<g> arrayDeque = c();
    if (arrayDeque != null) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("FabricUIManager::mountViews preMountItems to execute: ");
      stringBuilder.append(arrayDeque.size());
      com.facebook.systrace.a.a(0L, stringBuilder.toString());
      while (!arrayDeque.isEmpty())
        ((g)arrayDeque.pollFirst()).a(this.e); 
      com.facebook.systrace.a.a(0L);
    } 
    if (list1 != null) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("FabricUIManager::mountViews mountItems to execute: ");
      stringBuilder.append(list1.size());
      com.facebook.systrace.a.a(0L, stringBuilder.toString());
      long l = SystemClock.uptimeMillis();
      for (g g : list1) {
        if (A)
          for (String str : g.toString().split("\n")) {
            StringBuilder stringBuilder1 = new StringBuilder();
            stringBuilder1.append("dispatchMountItems: Executing mountItem: ");
            stringBuilder1.append(str);
            e.e.e.e.a.a("FabricUIManager", stringBuilder1.toString());
          }  
        g.a(this.e);
      } 
      this.t += SystemClock.uptimeMillis() - l;
    } 
    com.facebook.systrace.a.a(0L);
    return true;
  }
  
  private List<g> b() {
    synchronized (this.j) {
      List<g> list = this.o;
      if (list.isEmpty())
        return null; 
      this.o = new ArrayList<g>();
      return list;
    } 
  }
  
  private ArrayDeque<g> c() {
    synchronized (this.k) {
      ArrayDeque<g> arrayDeque = this.p;
      if (arrayDeque.isEmpty())
        return null; 
      this.p = new ArrayDeque<g>(250);
      return arrayDeque;
    } 
  }
  
  @e.e.n.a.a
  private g createBatchMountItem(g[] paramArrayOfg, int paramInt1, int paramInt2) {
    return (g)new BatchMountItem(paramArrayOfg, paramInt1, paramInt2);
  }
  
  @e.e.n.a.a
  private g createMountItem(String paramString, ReadableMap paramReadableMap, Object paramObject, int paramInt1, int paramInt2, boolean paramBoolean) {
    paramString = a.a(paramString);
    k0 k0 = this.g.get(Integer.valueOf(paramInt1));
    if (k0 != null)
      return (g)new a(k0, paramInt1, paramInt2, paramString, paramReadableMap, (j0)paramObject, paramBoolean); 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Unable to find ReactContext for root: ");
    stringBuilder.append(paramInt1);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  private List<c> d() {
    if (!e.e.o.b0.a.f)
      return null; 
    synchronized (this.i) {
      List<c> list = this.n;
      if (list.isEmpty())
        return null; 
      this.n = new ArrayList<c>();
      return list;
    } 
  }
  
  @e.e.n.a.a
  private g deleteMountItem(int paramInt) {
    return (g)new b(paramInt);
  }
  
  private void e() {
    if (this.l)
      return; 
    try {
      boolean bool = a();
      this.l = false;
      int i = this.m;
      if (i < 10 && bool) {
        if (i > 2) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Re-dispatched ");
          stringBuilder.append(this.m);
          stringBuilder.append(" times. This indicates setState (?) is likely being called too many times during mounting.");
          ReactSoftException.logSoftException("FabricUIManager", (Throwable)new ReactNoCrashSoftException(stringBuilder.toString()));
        } 
        this.m++;
        e();
      } 
      return;
    } finally {
      null = null;
    } 
  }
  
  @e.e.n.a.a
  private g insertMountItem(int paramInt1, int paramInt2, int paramInt3) {
    return (g)new f(paramInt1, paramInt2, paramInt3);
  }
  
  @e.e.n.a.a
  private long measure(int paramInt, String paramString, ReadableMap paramReadableMap1, ReadableMap paramReadableMap2, ReadableMap paramReadableMap3, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
    return measure(paramInt, paramString, paramReadableMap1, paramReadableMap2, paramReadableMap3, paramFloat1, paramFloat2, paramFloat3, paramFloat4, null);
  }
  
  @e.e.n.a.a
  private long measure(int paramInt, String paramString, ReadableMap paramReadableMap1, ReadableMap paramReadableMap2, ReadableMap paramReadableMap3, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, int[] paramArrayOfint) {
    ReactContext reactContext;
    if (paramInt < 0) {
      ReactApplicationContext reactApplicationContext = this.d;
    } else {
      reactContext = (ReactContext)this.g.get(Integer.valueOf(paramInt));
    } 
    return this.e.a((Context)reactContext, paramString, paramReadableMap1, paramReadableMap2, paramReadableMap3, a.b(paramFloat1, paramFloat2), a.a(paramFloat1, paramFloat2), a.b(paramFloat3, paramFloat4), a.a(paramFloat3, paramFloat4), paramArrayOfint);
  }
  
  @e.e.n.a.a
  private void preallocateView(int paramInt1, int paramInt2, String paramString, ReadableMap paramReadableMap, Object paramObject, boolean paramBoolean) {
    k0 k0 = this.g.get(Integer.valueOf(paramInt1));
    String str = a.a(paramString);
    synchronized (this.k) {
      this.p.add(new h(k0, paramInt1, paramInt2, str, paramReadableMap, (j0)paramObject, paramBoolean));
      return;
    } 
  }
  
  @e.e.n.a.a
  private g removeDeleteMultiMountItem(int[] paramArrayOfint) {
    return (g)new i(paramArrayOfint);
  }
  
  @e.e.n.a.a
  private g removeMountItem(int paramInt1, int paramInt2, int paramInt3) {
    return (g)new j(paramInt1, paramInt2, paramInt3);
  }
  
  @e.e.n.a.a
  private void scheduleMountItem(g paramg, int paramInt, long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, long paramLong7) {
    boolean bool = paramg instanceof BatchMountItem;
    if (bool) {
      this.v = paramLong1;
      this.w = paramLong5 - paramLong4;
      this.y = paramLong7 - paramLong6;
      this.x = SystemClock.uptimeMillis() - paramLong6;
      this.u = SystemClock.uptimeMillis();
    } 
    synchronized (this.j) {
      this.o.add(paramg);
      if (UiThreadUtil.isOnUiThread())
        e(); 
      if (bool) {
        ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_COMMIT_START, null, paramInt, paramLong1);
        ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_FINISH_TRANSACTION_START, null, paramInt, paramLong6);
        ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_FINISH_TRANSACTION_END, null, paramInt, paramLong7);
        ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_DIFF_START, null, paramInt, paramLong2);
        ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_DIFF_END, null, paramInt, paramLong3);
        ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_LAYOUT_START, null, paramInt, paramLong4);
        ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_LAYOUT_END, null, paramInt, paramLong5);
        ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_COMMIT_END, null, paramInt);
      } 
      return;
    } 
  }
  
  @e.e.n.a.a
  private g updateEventEmitterMountItem(int paramInt, Object paramObject) {
    return (g)new l(paramInt, (EventEmitterWrapper)paramObject);
  }
  
  @e.e.n.a.a
  private g updateLayoutMountItem(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
    return (g)new m(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
  }
  
  @e.e.n.a.a
  private g updateLocalDataMountItem(int paramInt, ReadableMap paramReadableMap) {
    return (g)new n(paramInt, paramReadableMap);
  }
  
  @e.e.n.a.a
  private g updatePaddingMountItem(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    return (g)new o(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
  }
  
  @e.e.n.a.a
  private g updatePropsMountItem(int paramInt, ReadableMap paramReadableMap) {
    return (g)new p(paramInt, paramReadableMap);
  }
  
  @e.e.n.a.a
  private g updateStateMountItem(int paramInt, Object paramObject) {
    return (g)new q(paramInt, (j0)paramObject);
  }
  
  public void a(int paramInt, String paramString, WritableMap paramWritableMap) {
    StringBuilder stringBuilder;
    EventEmitterWrapper eventEmitterWrapper = this.e.b(paramInt);
    if (eventEmitterWrapper == null) {
      stringBuilder = new StringBuilder();
      stringBuilder.append("Unable to invoke event: ");
      stringBuilder.append(paramString);
      stringBuilder.append(" for reactTag: ");
      stringBuilder.append(paramInt);
      e.e.e.e.a.a("FabricUIManager", stringBuilder.toString());
      return;
    } 
    eventEmitterWrapper.a(paramString, (WritableMap)stringBuilder);
  }
  
  public <T extends View> int addRootView(T paramT, WritableMap paramWritableMap, String paramString) {
    int i = z.a();
    y y = (y)paramT;
    k0 k0 = new k0(this.d, paramT.getContext(), y.getSurfaceID());
    this.e.a(i, (View)paramT);
    String str = y.getJSModuleName();
    this.g.put(Integer.valueOf(i), k0);
    if (A)
      e.e.e.e.a.a("FabricUIManager", "Starting surface for module: %s and reactTag: %d", str, Integer.valueOf(i)); 
    this.c.startSurface(i, str, (NativeMap)paramWritableMap);
    if (paramString != null)
      this.c.renderTemplateToSurface(i, paramString); 
    return i;
  }
  
  @e.e.n.a.a
  public void clearJSResponder() {
    synchronized (this.j) {
      this.o.add(new b(this));
      return;
    } 
  }
  
  @Deprecated
  public void dispatchCommand(int paramInt1, int paramInt2, ReadableArray paramReadableArray) {
    a((c)new d(paramInt1, paramInt2, paramReadableArray));
  }
  
  public void dispatchCommand(int paramInt, String paramString, ReadableArray paramReadableArray) {
    a((c)new e(paramInt, paramString, paramReadableArray));
  }
  
  public d getEventDispatcher() {
    return this.f;
  }
  
  public Map<String, Long> getPerformanceCounters() {
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    hashMap.put("CommitStartTime", Long.valueOf(this.v));
    hashMap.put("LayoutTime", Long.valueOf(this.w));
    hashMap.put("DispatchViewUpdatesTime", Long.valueOf(this.u));
    hashMap.put("RunStartTime", Long.valueOf(this.s));
    hashMap.put("BatchedExecutionTime", Long.valueOf(this.t));
    hashMap.put("FinishFabricTransactionTime", Long.valueOf(this.x));
    hashMap.put("FinishFabricTransactionCPPTime", Long.valueOf(this.y));
    return (Map)hashMap;
  }
  
  public void initialize() {
    this.f.a(2, (RCTEventEmitter)new FabricEventEmitter(this));
    this.f.a((com.facebook.react.uimanager.events.a)this.h);
  }
  
  public void onCatalystInstanceDestroy() {
    e.e.e.e.a.c("FabricUIManager", "FabricUIManager.onCatalystInstanceDestroy");
    if (this.r) {
      ReactSoftException.logSoftException("FabricUIManager", new IllegalStateException("Cannot double-destroy FabricUIManager"));
      return;
    } 
    this.r = true;
    this.q.b();
    throw null;
  }
  
  public void onHostDestroy() {}
  
  public void onHostPause() {
    g.a().b(g.c.d, this.q);
  }
  
  public void onHostResume() {
    g.a().a(g.c.d, this.q);
  }
  
  @e.e.n.a.a
  public void onRequestEventBeat() {
    this.f.a();
  }
  
  public void profileNextBatch() {}
  
  public void sendAccessibilityEvent(int paramInt1, int paramInt2) {
    synchronized (this.j) {
      this.o.add(new k(paramInt1, paramInt2));
      return;
    } 
  }
  
  @e.e.n.a.a
  public void setJSResponder(int paramInt1, int paramInt2, boolean paramBoolean) {
    synchronized (this.j) {
      this.o.add(new a(this, paramInt1, paramInt2, paramBoolean));
      return;
    } 
  }
  
  public void synchronouslyUpdateViewOnUIThread(int paramInt, ReadableMap paramReadableMap) {
    UiThreadUtil.assertOnUiThread();
    long l = SystemClock.uptimeMillis();
    int i = this.z;
    this.z = i + 1;
    try {
      ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_UPDATE_UI_MAIN_THREAD_START, null, i);
      if (A)
        e.e.e.e.a.a("FabricUIManager", "SynchronouslyUpdateViewOnUIThread for tag %d", Integer.valueOf(paramInt)); 
      g g = updatePropsMountItem(paramInt, paramReadableMap);
      try {
        scheduleMountItem(g, i, l, 0L, 0L, 0L, 0L, 0L, 0L);
        ReactMarkerConstants reactMarkerConstants = ReactMarkerConstants.FABRIC_UPDATE_UI_MAIN_THREAD_END;
        ReactMarker.logFabricMarker(reactMarkerConstants, null, i);
        return;
      } catch (Exception exception) {
      
      } finally {}
    } catch (Exception exception) {
    
    } finally {}
    try {
      ReactSoftException.logSoftException("FabricUIManager", (Throwable)new ReactNoCrashSoftException("Caught exception in synchronouslyUpdateViewOnUIThread", (Throwable)paramReadableMap));
      ReactMarkerConstants reactMarkerConstants = ReactMarkerConstants.FABRIC_UPDATE_UI_MAIN_THREAD_END;
      ReactMarker.logFabricMarker(reactMarkerConstants, null, i);
      return;
    } finally {}
    ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_UPDATE_UI_MAIN_THREAD_END, null, i);
    throw paramReadableMap;
  }
  
  public void updateRootLayoutSpecs(int paramInt1, int paramInt2, int paramInt3) {
    boolean bool1;
    boolean bool2;
    if (A)
      e.e.e.e.a.a("FabricUIManager", "Updating Root Layout Specs"); 
    k0 k0 = this.g.get(Integer.valueOf(paramInt1));
    if (k0 != null) {
      bool1 = com.facebook.react.modules.i18nmanager.a.a().b((Context)k0);
      bool2 = com.facebook.react.modules.i18nmanager.a.a().a((Context)k0);
    } else {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("updateRootLayoutSpecs called before ReactContext set for tag: ");
      stringBuilder.append(paramInt1);
      ReactSoftException.logSoftException("FabricUIManager", new IllegalStateException(stringBuilder.toString()));
      bool1 = false;
      bool2 = false;
    } 
    this.c.setConstraints(paramInt1, a.b(paramInt2), a.a(paramInt2), a.b(paramInt3), a.a(paramInt3), bool1, bool2);
  }
  
  class a implements g {
    a(c this$0, int param1Int1, int param1Int2, boolean param1Boolean) {}
    
    public void a(b param1b) {
      param1b.a(this.a, this.b, this.c);
    }
  }
  
  class b implements g {
    b(c this$0) {}
    
    public void a(b param1b) {
      param1b.a();
    }
  }
  
  private class c extends d {
    void b() {
      throw null;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/fabric/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */