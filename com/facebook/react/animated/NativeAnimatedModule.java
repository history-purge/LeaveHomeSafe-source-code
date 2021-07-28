package com.facebook.react.animated;

import com.facebook.fbreact.specs.NativeAnimatedModuleSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.n0;
import com.facebook.react.uimanager.t0;
import e.e.o.d0.a.a;
import java.util.ArrayList;
import java.util.Iterator;

@a(name = "NativeAnimatedModule")
public class NativeAnimatedModule extends NativeAnimatedModuleSpec implements LifecycleEventListener, t0 {
  public static final String NAME = "NativeAnimatedModule";
  
  private final com.facebook.react.uimanager.e mAnimatedFrameCallback;
  
  private l mNodesManager;
  
  private ArrayList<v> mOperations = new ArrayList<v>();
  
  private ArrayList<v> mPreOperations = new ArrayList<v>();
  
  private final com.facebook.react.modules.core.g mReactChoreographer = com.facebook.react.modules.core.g.a();
  
  public NativeAnimatedModule(ReactApplicationContext paramReactApplicationContext) {
    super(paramReactApplicationContext);
    this.mAnimatedFrameCallback = new k(this, (ReactContext)paramReactApplicationContext);
  }
  
  private void clearFrameCallback() {
    com.facebook.react.modules.core.g g1 = this.mReactChoreographer;
    e.e.m.a.a.a(g1);
    g1.b(com.facebook.react.modules.core.g.c.e, (com.facebook.react.modules.core.a.a)this.mAnimatedFrameCallback);
  }
  
  private void enqueueFrameCallback() {
    com.facebook.react.modules.core.g g1 = this.mReactChoreographer;
    e.e.m.a.a.a(g1);
    g1.a(com.facebook.react.modules.core.g.c.e, (com.facebook.react.modules.core.a.a)this.mAnimatedFrameCallback);
  }
  
  private l getNodesManager() {
    if (this.mNodesManager == null) {
      ReactApplicationContext reactApplicationContext = getReactApplicationContextIfActiveOrWarn();
      if (reactApplicationContext != null)
        this.mNodesManager = new l((UIManagerModule)reactApplicationContext.getNativeModule(UIManagerModule.class)); 
    } 
    return this.mNodesManager;
  }
  
  public void addAnimatedEventToView(double paramDouble, String paramString, ReadableMap paramReadableMap) {
    int i = (int)paramDouble;
    this.mOperations.add(new l(this, i, paramString, paramReadableMap));
  }
  
  public void addListener(String paramString) {}
  
  public void connectAnimatedNodeToView(double paramDouble1, double paramDouble2) {
    int i = (int)paramDouble1;
    int j = (int)paramDouble2;
    this.mOperations.add(new h(this, i, j));
  }
  
  public void connectAnimatedNodes(double paramDouble1, double paramDouble2) {
    int i = (int)paramDouble1;
    int j = (int)paramDouble2;
    this.mOperations.add(new f(this, i, j));
  }
  
  public void createAnimatedNode(double paramDouble, ReadableMap paramReadableMap) {
    int i = (int)paramDouble;
    this.mOperations.add(new p(this, i, paramReadableMap));
  }
  
  public void disconnectAnimatedNodeFromView(double paramDouble1, double paramDouble2) {
    int i = (int)paramDouble1;
    int j = (int)paramDouble2;
    this.mOperations.add(new i(this, i, j));
  }
  
  public void disconnectAnimatedNodes(double paramDouble1, double paramDouble2) {
    int i = (int)paramDouble1;
    int j = (int)paramDouble2;
    this.mOperations.add(new g(this, i, j));
  }
  
  public void dropAnimatedNode(double paramDouble) {
    int i = (int)paramDouble;
    this.mOperations.add(new t(this, i));
  }
  
  public void extractAnimatedNodeOffset(double paramDouble) {
    int i = (int)paramDouble;
    this.mOperations.add(new c(this, i));
  }
  
  public void flattenAnimatedNodeOffset(double paramDouble) {
    int i = (int)paramDouble;
    this.mOperations.add(new b(this, i));
  }
  
  public String getName() {
    return "NativeAnimatedModule";
  }
  
  public void initialize() {
    ReactApplicationContext reactApplicationContext = getReactApplicationContextIfActiveOrWarn();
    if (reactApplicationContext != null && !reactApplicationContext.isBridgeless()) {
      reactApplicationContext.addLifecycleEventListener(this);
      ((UIManagerModule)reactApplicationContext.getNativeModule(UIManagerModule.class)).addUIManagerListener(this);
    } 
  }
  
  public void onHostDestroy() {}
  
  public void onHostPause() {
    clearFrameCallback();
  }
  
  public void onHostResume() {
    enqueueFrameCallback();
  }
  
  public void removeAnimatedEventFromView(double paramDouble1, String paramString, double paramDouble2) {
    int i = (int)paramDouble1;
    int j = (int)paramDouble2;
    this.mOperations.add(new m(this, i, paramString, j));
  }
  
  public void removeListeners(double paramDouble) {}
  
  public void restoreDefaultValues(double paramDouble) {
    int i = (int)paramDouble;
    this.mPreOperations.add(new j(this, i));
  }
  
  public void setAnimatedNodeOffset(double paramDouble1, double paramDouble2) {
    int i = (int)paramDouble1;
    this.mOperations.add(new a(this, i, paramDouble2));
  }
  
  public void setAnimatedNodeValue(double paramDouble1, double paramDouble2) {
    int i = (int)paramDouble1;
    this.mOperations.add(new u(this, i, paramDouble2));
  }
  
  public void setNodesManager(l paraml) {
    this.mNodesManager = paraml;
  }
  
  public void startAnimatingNode(double paramDouble1, double paramDouble2, ReadableMap paramReadableMap, Callback paramCallback) {
    int i = (int)paramDouble1;
    int j = (int)paramDouble2;
    this.mOperations.add(new d(this, i, j, paramReadableMap, paramCallback));
  }
  
  public void startListeningToAnimatedNodeValue(double paramDouble) {
    int i = (int)paramDouble;
    q q = new q(this, i);
    this.mOperations.add(new r(this, i, q));
  }
  
  public void stopAnimation(double paramDouble) {
    int i = (int)paramDouble;
    this.mOperations.add(new e(this, i));
  }
  
  public void stopListeningToAnimatedNodeValue(double paramDouble) {
    int i = (int)paramDouble;
    this.mOperations.add(new s(this, i));
  }
  
  public void willDispatchViewUpdates(UIManagerModule paramUIManagerModule) {
    if (this.mOperations.isEmpty() && this.mPreOperations.isEmpty())
      return; 
    ArrayList<v> arrayList1 = this.mPreOperations;
    ArrayList<v> arrayList2 = this.mOperations;
    this.mPreOperations = new ArrayList<v>();
    this.mOperations = new ArrayList<v>();
    paramUIManagerModule.prependUIBlock(new n(this, arrayList1));
    paramUIManagerModule.addUIBlock(new o(this, arrayList2));
  }
  
  class a implements v {
    a(NativeAnimatedModule this$0, int param1Int, double param1Double) {}
    
    public void a(l param1l) {
      param1l.a(this.a, this.b);
    }
  }
  
  class b implements v {
    b(NativeAnimatedModule this$0, int param1Int) {}
    
    public void a(l param1l) {
      param1l.c(this.a);
    }
  }
  
  class c implements v {
    c(NativeAnimatedModule this$0, int param1Int) {}
    
    public void a(l param1l) {
      param1l.b(this.a);
    }
  }
  
  class d implements v {
    d(NativeAnimatedModule this$0, int param1Int1, int param1Int2, ReadableMap param1ReadableMap, Callback param1Callback) {}
    
    public void a(l param1l) {
      param1l.a(this.a, this.b, this.c, this.d);
    }
  }
  
  class e implements v {
    e(NativeAnimatedModule this$0, int param1Int) {}
    
    public void a(l param1l) {
      param1l.f(this.a);
    }
  }
  
  class f implements v {
    f(NativeAnimatedModule this$0, int param1Int1, int param1Int2) {}
    
    public void a(l param1l) {
      param1l.b(this.a, this.b);
    }
  }
  
  class g implements v {
    g(NativeAnimatedModule this$0, int param1Int1, int param1Int2) {}
    
    public void a(l param1l) {
      param1l.d(this.a, this.b);
    }
  }
  
  class h implements v {
    h(NativeAnimatedModule this$0, int param1Int1, int param1Int2) {}
    
    public void a(l param1l) {
      param1l.a(this.a, this.b);
    }
  }
  
  class i implements v {
    i(NativeAnimatedModule this$0, int param1Int1, int param1Int2) {}
    
    public void a(l param1l) {
      param1l.c(this.a, this.b);
    }
  }
  
  class j implements v {
    j(NativeAnimatedModule this$0, int param1Int) {}
    
    public void a(l param1l) {
      param1l.e(this.a);
    }
  }
  
  class k extends com.facebook.react.uimanager.e {
    k(NativeAnimatedModule this$0, ReactContext param1ReactContext) {
      super(param1ReactContext);
    }
    
    protected void b(long param1Long) {
      try {
        l l = this.c.getNodesManager();
        if (l.a())
          l.a(param1Long); 
        com.facebook.react.modules.core.g g = this.c.mReactChoreographer;
        e.e.m.a.a.a(g);
        g.a(com.facebook.react.modules.core.g.c.e, (com.facebook.react.modules.core.a.a)this.c.mAnimatedFrameCallback);
        return;
      } catch (Exception exception) {
        e.e.e.e.a.b("ReactNative", "Exception while executing animated frame callback.", exception);
        throw new RuntimeException(exception);
      } 
    }
  }
  
  class l implements v {
    l(NativeAnimatedModule this$0, int param1Int, String param1String, ReadableMap param1ReadableMap) {}
    
    public void a(l param1l) {
      param1l.a(this.a, this.b, this.c);
    }
  }
  
  class m implements v {
    m(NativeAnimatedModule this$0, int param1Int1, String param1String, int param1Int2) {}
    
    public void a(l param1l) {
      param1l.a(this.a, this.b, this.c);
    }
  }
  
  class n implements n0 {
    n(NativeAnimatedModule this$0, ArrayList param1ArrayList) {}
    
    public void a(com.facebook.react.uimanager.m param1m) {
      l l = this.b.getNodesManager();
      Iterator<NativeAnimatedModule.v> iterator = this.a.iterator();
      while (iterator.hasNext())
        ((NativeAnimatedModule.v)iterator.next()).a(l); 
    }
  }
  
  class o implements n0 {
    o(NativeAnimatedModule this$0, ArrayList param1ArrayList) {}
    
    public void a(com.facebook.react.uimanager.m param1m) {
      l l = this.b.getNodesManager();
      Iterator<NativeAnimatedModule.v> iterator = this.a.iterator();
      while (iterator.hasNext())
        ((NativeAnimatedModule.v)iterator.next()).a(l); 
    }
  }
  
  class p implements v {
    p(NativeAnimatedModule this$0, int param1Int, ReadableMap param1ReadableMap) {}
    
    public void a(l param1l) {
      param1l.a(this.a, this.b);
    }
  }
  
  class q implements c {
    q(NativeAnimatedModule this$0, int param1Int) {}
    
    public void a(double param1Double) {
      WritableMap writableMap = Arguments.createMap();
      writableMap.putInt("tag", this.a);
      writableMap.putDouble("value", param1Double);
      ReactApplicationContext reactApplicationContext = this.b.getReactApplicationContextIfActiveOrWarn();
      if (reactApplicationContext != null)
        ((DeviceEventManagerModule.RCTDeviceEventEmitter)reactApplicationContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("onAnimatedValueUpdate", writableMap); 
    }
  }
  
  class r implements v {
    r(NativeAnimatedModule this$0, int param1Int, c param1c) {}
    
    public void a(l param1l) {
      param1l.a(this.a, this.b);
    }
  }
  
  class s implements v {
    s(NativeAnimatedModule this$0, int param1Int) {}
    
    public void a(l param1l) {
      param1l.g(this.a);
    }
  }
  
  class t implements v {
    t(NativeAnimatedModule this$0, int param1Int) {}
    
    public void a(l param1l) {
      param1l.a(this.a);
    }
  }
  
  class u implements v {
    u(NativeAnimatedModule this$0, int param1Int, double param1Double) {}
    
    public void a(l param1l) {
      param1l.b(this.a, this.b);
    }
  }
  
  private static interface v {
    void a(l param1l);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/animated/NativeAnimatedModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */