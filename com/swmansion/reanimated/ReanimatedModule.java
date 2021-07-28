package com.swmansion.reanimated;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.n0;
import com.facebook.react.uimanager.t0;
import com.swmansion.reanimated.f.c;
import e.e.o.d0.a.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@a(name = "ReanimatedModule")
public class ReanimatedModule extends ReactContextBaseJavaModule implements LifecycleEventListener, t0 {
  public static final String NAME = "ReanimatedModule";
  
  private b mNodesManager;
  
  private ArrayList<m> mOperations = new ArrayList<m>();
  
  private c mTransitionManager;
  
  public ReanimatedModule(ReactApplicationContext paramReactApplicationContext) {
    super(paramReactApplicationContext);
  }
  
  private b getNodesManager() {
    if (this.mNodesManager == null)
      this.mNodesManager = new b((ReactContext)getReactApplicationContext()); 
    return this.mNodesManager;
  }
  
  @ReactMethod
  public void animateNextTransition(int paramInt, ReadableMap paramReadableMap) {
    this.mTransitionManager.a(paramInt, paramReadableMap);
  }
  
  @ReactMethod
  public void attachEvent(int paramInt1, String paramString, int paramInt2) {
    this.mOperations.add(new k(this, paramInt1, paramString, paramInt2));
  }
  
  @ReactMethod
  public void configureProps(ReadableArray paramReadableArray1, ReadableArray paramReadableArray2) {
    int j = paramReadableArray1.size();
    HashSet<String> hashSet2 = new HashSet(j);
    boolean bool = false;
    int i;
    for (i = 0; i < j; i++)
      hashSet2.add(paramReadableArray1.getString(i)); 
    j = paramReadableArray2.size();
    HashSet<String> hashSet1 = new HashSet(j);
    for (i = bool; i < j; i++)
      hashSet1.add(paramReadableArray2.getString(i)); 
    this.mOperations.add(new a(this, hashSet2, hashSet1));
  }
  
  @ReactMethod
  public void connectNodeToView(int paramInt1, int paramInt2) {
    this.mOperations.add(new i(this, paramInt1, paramInt2));
  }
  
  @ReactMethod
  public void connectNodes(int paramInt1, int paramInt2) {
    this.mOperations.add(new g(this, paramInt1, paramInt2));
  }
  
  @ReactMethod
  public void createNode(int paramInt, ReadableMap paramReadableMap) {
    this.mOperations.add(new e(this, paramInt, paramReadableMap));
  }
  
  @ReactMethod
  public void detachEvent(int paramInt1, String paramString, int paramInt2) {
    this.mOperations.add(new l(this, paramInt1, paramString, paramInt2));
  }
  
  @ReactMethod
  public void disconnectNodeFromView(int paramInt1, int paramInt2) {
    this.mOperations.add(new j(this, paramInt1, paramInt2));
  }
  
  @ReactMethod
  public void disconnectNodes(int paramInt1, int paramInt2) {
    this.mOperations.add(new h(this, paramInt1, paramInt2));
  }
  
  @ReactMethod
  public void dropNode(int paramInt) {
    this.mOperations.add(new f(this, paramInt));
  }
  
  public String getName() {
    return "ReanimatedModule";
  }
  
  @ReactMethod
  public void getValue(int paramInt, Callback paramCallback) {
    this.mOperations.add(new b(this, paramInt, paramCallback));
  }
  
  public void initialize() {
    ReactApplicationContext reactApplicationContext = getReactApplicationContext();
    UIManagerModule uIManagerModule = (UIManagerModule)reactApplicationContext.getNativeModule(UIManagerModule.class);
    reactApplicationContext.addLifecycleEventListener(this);
    uIManagerModule.addUIManagerListener(this);
    this.mTransitionManager = new c(uIManagerModule);
  }
  
  public void onHostDestroy() {}
  
  public void onHostPause() {
    b b1 = this.mNodesManager;
    if (b1 != null)
      b1.a(); 
  }
  
  public void onHostResume() {
    b b1 = this.mNodesManager;
    if (b1 != null)
      b1.b(); 
  }
  
  @ReactMethod
  public void setValue(int paramInt, Double paramDouble) {
    this.mOperations.add(new c(this, paramInt, paramDouble));
  }
  
  public void willDispatchViewUpdates(UIManagerModule paramUIManagerModule) {
    if (this.mOperations.isEmpty())
      return; 
    ArrayList<m> arrayList = this.mOperations;
    this.mOperations = new ArrayList<m>();
    paramUIManagerModule.addUIBlock(new d(this, arrayList));
  }
  
  class a implements m {
    a(ReanimatedModule this$0, Set param1Set1, Set param1Set2) {}
    
    public void a(b param1b) {
      param1b.a(this.a, this.b);
    }
  }
  
  class b implements m {
    b(ReanimatedModule this$0, int param1Int, Callback param1Callback) {}
    
    public void a(b param1b) {
      param1b.a(this.a, this.b);
    }
  }
  
  class c implements m {
    c(ReanimatedModule this$0, int param1Int, Double param1Double) {}
    
    public void a(b param1b) {
      param1b.a(this.a, this.b);
    }
  }
  
  class d implements n0 {
    d(ReanimatedModule this$0, ArrayList param1ArrayList) {}
    
    public void a(com.facebook.react.uimanager.m param1m) {
      b b = this.b.getNodesManager();
      Iterator<ReanimatedModule.m> iterator = this.a.iterator();
      while (iterator.hasNext())
        ((ReanimatedModule.m)iterator.next()).a(b); 
    }
  }
  
  class e implements m {
    e(ReanimatedModule this$0, int param1Int, ReadableMap param1ReadableMap) {}
    
    public void a(b param1b) {
      param1b.a(this.a, this.b);
    }
  }
  
  class f implements m {
    f(ReanimatedModule this$0, int param1Int) {}
    
    public void a(b param1b) {
      param1b.a(this.a);
    }
  }
  
  class g implements m {
    g(ReanimatedModule this$0, int param1Int1, int param1Int2) {}
    
    public void a(b param1b) {
      param1b.b(this.a, this.b);
    }
  }
  
  class h implements m {
    h(ReanimatedModule this$0, int param1Int1, int param1Int2) {}
    
    public void a(b param1b) {
      param1b.d(this.a, this.b);
    }
  }
  
  class i implements m {
    i(ReanimatedModule this$0, int param1Int1, int param1Int2) {}
    
    public void a(b param1b) {
      param1b.a(this.a, this.b);
    }
  }
  
  class j implements m {
    j(ReanimatedModule this$0, int param1Int1, int param1Int2) {}
    
    public void a(b param1b) {
      param1b.c(this.a, this.b);
    }
  }
  
  class k implements m {
    k(ReanimatedModule this$0, int param1Int1, String param1String, int param1Int2) {}
    
    public void a(b param1b) {
      param1b.a(this.a, this.b, this.c);
    }
  }
  
  class l implements m {
    l(ReanimatedModule this$0, int param1Int1, String param1String, int param1Int2) {}
    
    public void a(b param1b) {
      param1b.b(this.a, this.b, this.c);
    }
  }
  
  private static interface m {
    void a(b param1b);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/swmansion/reanimated/ReanimatedModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */