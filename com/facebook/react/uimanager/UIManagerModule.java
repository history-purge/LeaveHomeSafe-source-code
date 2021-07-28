package com.facebook.react.uimanager;

import android.content.ComponentCallbacks;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.media.AudioManager;
import android.view.View;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.OnBatchCompleteListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.d;
import com.facebook.react.uimanager.f1.a;
import com.facebook.react.uimanager.g1.a;
import e.e.o.d0.a.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@a(name = "UIManager")
public class UIManagerModule extends ReactContextBaseJavaModule implements OnBatchCompleteListener, LifecycleEventListener, UIManager {
  private static final boolean DEBUG = e.e.h.b.c.a().a(e.e.h.c.a.d);
  
  public static final String NAME = "UIManager";
  
  private int mBatchId = 0;
  
  private final Map<String, Object> mCustomDirectEvents;
  
  private final d mEventDispatcher;
  
  private final List<t0> mListeners = new ArrayList<t0>();
  
  private final f mMemoryTrimCallback = new f(null);
  
  private final Map<String, Object> mModuleConstants;
  
  private final o0 mUIImplementation;
  
  private Map<String, WritableMap> mViewManagerConstantsCache;
  
  private volatile int mViewManagerConstantsCacheSize;
  
  private final a1 mViewManagerRegistry;
  
  public UIManagerModule(ReactApplicationContext paramReactApplicationContext, g paramg, int paramInt) {
    this(paramReactApplicationContext, paramg, new p0(), paramInt);
  }
  
  @Deprecated
  public UIManagerModule(ReactApplicationContext paramReactApplicationContext, g paramg, p0 paramp0, int paramInt) {
    super(paramReactApplicationContext);
    c.b((Context)paramReactApplicationContext);
    this.mEventDispatcher = new d(paramReactApplicationContext);
    this.mModuleConstants = createConstants(paramg);
    this.mCustomDirectEvents = r0.c();
    this.mViewManagerRegistry = new a1(paramg);
    this.mUIImplementation = paramp0.a(paramReactApplicationContext, this.mViewManagerRegistry, this.mEventDispatcher, paramInt);
    paramReactApplicationContext.addLifecycleEventListener(this);
  }
  
  public UIManagerModule(ReactApplicationContext paramReactApplicationContext, List<ViewManager> paramList, int paramInt) {
    this(paramReactApplicationContext, paramList, new p0(), paramInt);
  }
  
  @Deprecated
  public UIManagerModule(ReactApplicationContext paramReactApplicationContext, List<ViewManager> paramList, p0 paramp0, int paramInt) {
    super(paramReactApplicationContext);
    c.b((Context)paramReactApplicationContext);
    this.mEventDispatcher = new d(paramReactApplicationContext);
    this.mCustomDirectEvents = com.facebook.react.common.f.b();
    this.mModuleConstants = createConstants(paramList, null, this.mCustomDirectEvents);
    this.mViewManagerRegistry = new a1(paramList);
    this.mUIImplementation = paramp0.a(paramReactApplicationContext, this.mViewManagerRegistry, this.mEventDispatcher, paramInt);
    paramReactApplicationContext.addLifecycleEventListener(this);
  }
  
  private WritableMap computeConstantsForViewManager(String paramString) {
    if (paramString != null) {
      ViewManager viewManager = this.mUIImplementation.b(paramString);
    } else {
      paramString = null;
    } 
    if (paramString == null)
      return null; 
    com.facebook.systrace.b.b b = com.facebook.systrace.b.a(0L, "UIManagerModule.getConstantsForViewManager");
    b.a("ViewManager", paramString.getName());
    b.a("Lazy", Boolean.valueOf(true));
    b.a();
    try {
      Map<String, Object> map = s0.a((ViewManager)paramString, null, null, null, this.mCustomDirectEvents);
      if (map != null)
        return (WritableMap)Arguments.makeNativeMap(map); 
      return null;
    } finally {
      com.facebook.systrace.b.a(0L).a();
    } 
  }
  
  private static Map<String, Object> createConstants(g paramg) {
    ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_START);
    com.facebook.systrace.b.b b = com.facebook.systrace.b.a(0L, "CreateUIManagerConstants");
    b.a("Lazy", Boolean.valueOf(true));
    b.a();
    try {
      return s0.a(paramg);
    } finally {
      com.facebook.systrace.a.a(0L);
      ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_END);
    } 
  }
  
  private static Map<String, Object> createConstants(List<ViewManager> paramList, Map<String, Object> paramMap1, Map<String, Object> paramMap2) {
    ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_START);
    com.facebook.systrace.b.b b = com.facebook.systrace.b.a(0L, "CreateUIManagerConstants");
    b.a("Lazy", Boolean.valueOf(false));
    b.a();
    try {
      return s0.a(paramList, paramMap1, paramMap2);
    } finally {
      com.facebook.systrace.a.a(0L);
      ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_END);
    } 
  }
  
  public <T extends View> int addRootView(T paramT) {
    return addRootView(paramT, null, null);
  }
  
  public <T extends View> int addRootView(T paramT, WritableMap paramWritableMap, String paramString) {
    com.facebook.systrace.a.a(0L, "UIManagerModule.addRootView");
    int i = z.a();
    k0 k0 = new k0(getReactApplicationContext(), paramT.getContext(), ((y)paramT).getSurfaceID());
    this.mUIImplementation.a(paramT, i, k0);
    com.facebook.systrace.a.a(0L);
    return i;
  }
  
  public void addUIBlock(n0 paramn0) {
    this.mUIImplementation.a(paramn0);
  }
  
  public void addUIManagerListener(t0 paramt0) {
    this.mListeners.add(paramt0);
  }
  
  @ReactMethod
  public void clearJSResponder() {
    this.mUIImplementation.a();
  }
  
  @ReactMethod
  public void configureNextLayoutAnimation(ReadableMap paramReadableMap, Callback paramCallback1, Callback paramCallback2) {
    this.mUIImplementation.a(paramReadableMap, paramCallback1);
  }
  
  @ReactMethod
  public void createView(int paramInt1, String paramString, int paramInt2, ReadableMap paramReadableMap) {
    if (DEBUG) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("(UIManager.createView) tag: ");
      stringBuilder.append(paramInt1);
      stringBuilder.append(", class: ");
      stringBuilder.append(paramString);
      stringBuilder.append(", props: ");
      stringBuilder.append(paramReadableMap);
      String str = stringBuilder.toString();
      e.e.e.e.a.a("ReactNative", str);
      e.e.h.b.c.a().a(e.e.h.c.a.d, str);
    } 
    this.mUIImplementation.a(paramInt1, paramString, paramInt2, paramReadableMap);
  }
  
  @ReactMethod
  public void dismissPopupMenu() {
    this.mUIImplementation.c();
  }
  
  @Deprecated
  public void dispatchCommand(int paramInt1, int paramInt2, ReadableArray paramReadableArray) {
    this.mUIImplementation.a(paramInt1, paramInt2, paramReadableArray);
  }
  
  public void dispatchCommand(int paramInt, String paramString, ReadableArray paramReadableArray) {
    this.mUIImplementation.a(paramInt, paramString, paramReadableArray);
  }
  
  @ReactMethod
  public void dispatchViewManagerCommand(int paramInt, Dynamic paramDynamic, ReadableArray paramReadableArray) {
    UIManager uIManager = q0.c((ReactContext)getReactApplicationContext(), a.a(paramInt));
    if (uIManager == null)
      return; 
    if (paramDynamic.getType() == ReadableType.Number) {
      uIManager.dispatchCommand(paramInt, paramDynamic.asInt(), paramReadableArray);
      return;
    } 
    if (paramDynamic.getType() == ReadableType.String)
      uIManager.dispatchCommand(paramInt, paramDynamic.asString(), paramReadableArray); 
  }
  
  @ReactMethod
  public void findSubviewIn(int paramInt, ReadableArray paramReadableArray, Callback paramCallback) {
    this.mUIImplementation.a(paramInt, Math.round(q.a(paramReadableArray.getDouble(0))), Math.round(q.a(paramReadableArray.getDouble(1))), paramCallback);
  }
  
  public Map<String, Object> getConstants() {
    return this.mModuleConstants;
  }
  
  @ReactMethod(isBlockingSynchronousMethod = true)
  public WritableMap getConstantsForViewManager(String paramString) {
    WritableMap writableMap;
    Map<String, WritableMap> map = this.mViewManagerConstantsCache;
    if (map != null && map.containsKey(paramString)) {
      writableMap = this.mViewManagerConstantsCache.get(paramString);
      int i = this.mViewManagerConstantsCacheSize - 1;
      this.mViewManagerConstantsCacheSize = i;
      if (i <= 0)
        this.mViewManagerConstantsCache = null; 
      return writableMap;
    } 
    return computeConstantsForViewManager((String)writableMap);
  }
  
  @ReactMethod(isBlockingSynchronousMethod = true)
  public WritableMap getDefaultEventTypes() {
    return (WritableMap)Arguments.makeNativeMap(s0.a());
  }
  
  public e getDirectEventNamesResolver() {
    return new a(this);
  }
  
  public d getEventDispatcher() {
    return this.mEventDispatcher;
  }
  
  public String getName() {
    return "UIManager";
  }
  
  public Map<String, Long> getPerformanceCounters() {
    return this.mUIImplementation.d();
  }
  
  public o0 getUIImplementation() {
    return this.mUIImplementation;
  }
  
  @Deprecated
  public a1 getViewManagerRegistry_DO_NOT_USE() {
    return this.mViewManagerRegistry;
  }
  
  public void initialize() {
    getReactApplicationContext().registerComponentCallbacks((ComponentCallbacks)this.mMemoryTrimCallback);
    this.mEventDispatcher.a(1, (RCTEventEmitter)getReactApplicationContext().getJSModule(RCTEventEmitter.class));
  }
  
  public void invalidateNodeLayout(int paramInt) {
    StringBuilder stringBuilder;
    a0 a0 = this.mUIImplementation.f(paramInt);
    if (a0 == null) {
      stringBuilder = new StringBuilder();
      stringBuilder.append("Warning : attempted to dirty a non-existent react shadow node. reactTag=");
      stringBuilder.append(paramInt);
      e.e.e.e.a.e("ReactNative", stringBuilder.toString());
      return;
    } 
    stringBuilder.f();
    this.mUIImplementation.a(-1);
  }
  
  @ReactMethod
  public void manageChildren(int paramInt, ReadableArray paramReadableArray1, ReadableArray paramReadableArray2, ReadableArray paramReadableArray3, ReadableArray paramReadableArray4, ReadableArray paramReadableArray5) {
    if (DEBUG) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("(UIManager.manageChildren) tag: ");
      stringBuilder.append(paramInt);
      stringBuilder.append(", moveFrom: ");
      stringBuilder.append(paramReadableArray1);
      stringBuilder.append(", moveTo: ");
      stringBuilder.append(paramReadableArray2);
      stringBuilder.append(", addTags: ");
      stringBuilder.append(paramReadableArray3);
      stringBuilder.append(", atIndices: ");
      stringBuilder.append(paramReadableArray4);
      stringBuilder.append(", removeFrom: ");
      stringBuilder.append(paramReadableArray5);
      String str = stringBuilder.toString();
      e.e.e.e.a.a("ReactNative", str);
      e.e.h.b.c.a().a(e.e.h.c.a.d, str);
    } 
    this.mUIImplementation.a(paramInt, paramReadableArray1, paramReadableArray2, paramReadableArray3, paramReadableArray4, paramReadableArray5);
  }
  
  @ReactMethod
  public void measure(int paramInt, Callback paramCallback) {
    this.mUIImplementation.a(paramInt, paramCallback);
  }
  
  @ReactMethod
  public void measureInWindow(int paramInt, Callback paramCallback) {
    this.mUIImplementation.b(paramInt, paramCallback);
  }
  
  @ReactMethod
  public void measureLayout(int paramInt1, int paramInt2, Callback paramCallback1, Callback paramCallback2) {
    this.mUIImplementation.a(paramInt1, paramInt2, paramCallback1, paramCallback2);
  }
  
  @ReactMethod
  @Deprecated
  public void measureLayoutRelativeToParent(int paramInt, Callback paramCallback1, Callback paramCallback2) {
    this.mUIImplementation.a(paramInt, paramCallback1, paramCallback2);
  }
  
  public void onBatchComplete() {
    int i = this.mBatchId;
    this.mBatchId = i + 1;
    com.facebook.systrace.b.b b = com.facebook.systrace.b.a(0L, "onBatchCompleteUI");
    b.a("BatchId", i);
    b.a();
    null = this.mListeners.iterator();
    while (null.hasNext())
      ((t0)null.next()).willDispatchViewUpdates(this); 
    try {
      this.mUIImplementation.a(i);
      return;
    } finally {
      com.facebook.systrace.a.a(0L);
    } 
  }
  
  public void onCatalystInstanceDestroy() {
    super.onCatalystInstanceDestroy();
    this.mEventDispatcher.b();
    getReactApplicationContext().unregisterComponentCallbacks((ComponentCallbacks)this.mMemoryTrimCallback);
    d1.a().b();
    z0.a();
  }
  
  public void onHostDestroy() {
    this.mUIImplementation.f();
  }
  
  public void onHostPause() {
    this.mUIImplementation.g();
  }
  
  public void onHostResume() {
    this.mUIImplementation.h();
  }
  
  @ReactMethod
  @Deprecated
  public void playTouchSound() {
    AudioManager audioManager = (AudioManager)getReactApplicationContext().getSystemService("audio");
    if (audioManager != null)
      audioManager.playSoundEffect(0); 
  }
  
  @Deprecated
  public void preComputeConstantsForViewManager(List<String> paramList) {
    b.d.a<String, WritableMap> a = new b.d.a();
    for (String str : paramList) {
      WritableMap writableMap = computeConstantsForViewManager(str);
      if (writableMap != null)
        a.put(str, writableMap); 
    } 
    this.mViewManagerConstantsCacheSize = paramList.size();
    this.mViewManagerConstantsCache = Collections.unmodifiableMap((Map<? extends String, ? extends WritableMap>)a);
  }
  
  public void prependUIBlock(n0 paramn0) {
    this.mUIImplementation.b(paramn0);
  }
  
  public void profileNextBatch() {
    this.mUIImplementation.i();
  }
  
  @ReactMethod
  public void removeRootView(int paramInt) {
    this.mUIImplementation.c(paramInt);
  }
  
  @ReactMethod
  @Deprecated
  public void removeSubviewsFromContainerWithID(int paramInt) {
    this.mUIImplementation.d(paramInt);
  }
  
  public void removeUIManagerListener(t0 paramt0) {
    this.mListeners.remove(paramt0);
  }
  
  @ReactMethod
  @Deprecated
  public void replaceExistingNonRootView(int paramInt1, int paramInt2) {
    this.mUIImplementation.a(paramInt1, paramInt2);
  }
  
  @Deprecated
  public int resolveRootTagFromReactTag(int paramInt) {
    return a.b(paramInt) ? paramInt : this.mUIImplementation.e(paramInt);
  }
  
  public View resolveView(int paramInt) {
    UiThreadUtil.assertOnUiThread();
    return this.mUIImplementation.e().c().b(paramInt);
  }
  
  @ReactMethod
  public void sendAccessibilityEvent(int paramInt1, int paramInt2) {
    int i = a.a(paramInt1);
    if (i == 2) {
      UIManager uIManager = q0.c((ReactContext)getReactApplicationContext(), i);
      if (uIManager != null) {
        uIManager.sendAccessibilityEvent(paramInt1, paramInt2);
        return;
      } 
    } else {
      this.mUIImplementation.b(paramInt1, paramInt2);
    } 
  }
  
  @ReactMethod
  public void setChildren(int paramInt, ReadableArray paramReadableArray) {
    if (DEBUG) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("(UIManager.setChildren) tag: ");
      stringBuilder.append(paramInt);
      stringBuilder.append(", children: ");
      stringBuilder.append(paramReadableArray);
      String str = stringBuilder.toString();
      e.e.e.e.a.a("ReactNative", str);
      e.e.h.b.c.a().a(e.e.h.c.a.d, str);
    } 
    this.mUIImplementation.a(paramInt, paramReadableArray);
  }
  
  @ReactMethod
  public void setJSResponder(int paramInt, boolean paramBoolean) {
    this.mUIImplementation.a(paramInt, paramBoolean);
  }
  
  @ReactMethod
  public void setLayoutAnimationEnabledExperimental(boolean paramBoolean) {
    this.mUIImplementation.a(paramBoolean);
  }
  
  public void setViewHierarchyUpdateDebugListener(a parama) {
    this.mUIImplementation.a(parama);
  }
  
  public void setViewLocalData(int paramInt, Object paramObject) {
    ReactApplicationContext reactApplicationContext = getReactApplicationContext();
    reactApplicationContext.assertOnUiQueueThread();
    reactApplicationContext.runOnNativeModulesQueueThread((Runnable)new b(this, (ReactContext)reactApplicationContext, paramInt, paramObject));
  }
  
  @ReactMethod
  public void showPopupMenu(int paramInt, ReadableArray paramReadableArray, Callback paramCallback1, Callback paramCallback2) {
    this.mUIImplementation.a(paramInt, paramReadableArray, paramCallback1, paramCallback2);
  }
  
  public void synchronouslyUpdateViewOnUIThread(int paramInt, ReadableMap paramReadableMap) {
    int i = a.a(paramInt);
    if (i == 2) {
      UIManager uIManager = q0.c((ReactContext)getReactApplicationContext(), i);
      if (uIManager != null) {
        uIManager.synchronouslyUpdateViewOnUIThread(paramInt, paramReadableMap);
        return;
      } 
    } else {
      this.mUIImplementation.a(paramInt, new c0(paramReadableMap));
    } 
  }
  
  public void updateNodeSize(int paramInt1, int paramInt2, int paramInt3) {
    getReactApplicationContext().assertOnNativeModulesQueueThread();
    this.mUIImplementation.a(paramInt1, paramInt2, paramInt3);
  }
  
  public void updateRootLayoutSpecs(int paramInt1, int paramInt2, int paramInt3) {
    ReactApplicationContext reactApplicationContext = getReactApplicationContext();
    reactApplicationContext.runOnNativeModulesQueueThread((Runnable)new d(this, (ReactContext)reactApplicationContext, paramInt1, paramInt2, paramInt3));
  }
  
  @ReactMethod
  public void updateView(int paramInt, String paramString, ReadableMap paramReadableMap) {
    ReactApplicationContext reactApplicationContext;
    if (DEBUG) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("(UIManager.updateView) tag: ");
      stringBuilder.append(paramInt);
      stringBuilder.append(", class: ");
      stringBuilder.append(paramString);
      stringBuilder.append(", props: ");
      stringBuilder.append(paramReadableMap);
      String str = stringBuilder.toString();
      e.e.e.e.a.a("ReactNative", str);
      e.e.h.b.c.a().a(e.e.h.c.a.d, str);
    } 
    int i = a.a(paramInt);
    if (i == 2) {
      reactApplicationContext = getReactApplicationContext();
      if (reactApplicationContext.hasActiveCatalystInstance()) {
        UIManager uIManager = q0.c((ReactContext)reactApplicationContext, i);
        if (uIManager != null) {
          reactApplicationContext.runOnUiQueueThread(new c(this, uIManager, paramInt, paramReadableMap));
          return;
        } 
      } 
    } else {
      this.mUIImplementation.a(paramInt, (String)reactApplicationContext, paramReadableMap);
    } 
  }
  
  @ReactMethod
  @Deprecated
  public void viewIsDescendantOf(int paramInt1, int paramInt2, Callback paramCallback) {
    this.mUIImplementation.a(paramInt1, paramInt2, paramCallback);
  }
  
  class a implements e {
    a(UIManagerModule this$0) {}
    
    public String a(String param1String) {
      Map map = (Map)this.a.mCustomDirectEvents.get(param1String);
      if (map != null)
        param1String = (String)map.get("registrationName"); 
      return param1String;
    }
  }
  
  class b extends GuardedRunnable {
    b(UIManagerModule this$0, ReactContext param1ReactContext, int param1Int, Object param1Object) {
      super(param1ReactContext);
    }
    
    public void runGuarded() {
      this.e.mUIImplementation.a(this.c, this.d);
    }
  }
  
  class c implements Runnable {
    c(UIManagerModule this$0, UIManager param1UIManager, int param1Int, ReadableMap param1ReadableMap) {}
    
    public void run() {
      this.c.synchronouslyUpdateViewOnUIThread(this.d, this.e);
    }
  }
  
  class d extends GuardedRunnable {
    d(UIManagerModule this$0, ReactContext param1ReactContext, int param1Int1, int param1Int2, int param1Int3) {
      super(param1ReactContext);
    }
    
    public void runGuarded() {
      this.f.mUIImplementation.b(this.c, this.d, this.e);
      this.f.mUIImplementation.a(-1);
    }
  }
  
  public static interface e {
    String a(String param1String);
  }
  
  private class f implements ComponentCallbacks2 {
    private f(UIManagerModule this$0) {}
    
    public void onConfigurationChanged(Configuration param1Configuration) {}
    
    public void onLowMemory() {}
    
    public void onTrimMemory(int param1Int) {
      if (param1Int >= 60)
        d1.a().b(); 
    }
  }
  
  public static interface g {
    ViewManager a(String param1String);
    
    List<String> a();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/uimanager/UIManagerModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */