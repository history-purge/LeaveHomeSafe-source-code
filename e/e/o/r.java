package e.e.o;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.view.View;
import android.view.ViewGroup;
import b.g.m.v;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.CatalystInstanceImpl;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.JSIModule;
import com.facebook.react.bridge.JSIModulePackage;
import com.facebook.react.bridge.JSIModuleType;
import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.MemoryPressureListener;
import com.facebook.react.bridge.NativeModuleCallExceptionHandler;
import com.facebook.react.bridge.NativeModuleRegistry;
import com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.bridge.queue.ReactQueueConfigurationSpec;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.modules.appregistry.AppRegistry;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.fabric.ReactFabric;
import com.facebook.react.turbomodule.core.interfaces.TurboModuleRegistry;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.p0;
import com.facebook.react.uimanager.q0;
import com.facebook.react.uimanager.y;
import com.facebook.soloader.SoLoader;
import e.e.o.b0.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class r {
  private static final String x = "r";
  
  private final Set<y> a = Collections.synchronizedSet(new HashSet<y>());
  
  private volatile LifecycleState b;
  
  private j c;
  
  private volatile Thread d;
  
  private final JavaScriptExecutorFactory e;
  
  private final JSBundleLoader f;
  
  private final String g;
  
  private final List<v> h;
  
  private final com.facebook.react.devsupport.h.c i;
  
  private final boolean j;
  
  private final NotThreadSafeBridgeIdleDebugListener k;
  
  private final Object l = new Object();
  
  private volatile ReactContext m;
  
  private final Context n;
  
  private com.facebook.react.modules.core.b o;
  
  private Activity p;
  
  private final Collection<k> q = Collections.synchronizedList(new ArrayList<k>());
  
  private volatile boolean r = false;
  
  private volatile Boolean s = Boolean.valueOf(false);
  
  private final e t;
  
  private final NativeModuleCallExceptionHandler u;
  
  private final JSIModulePackage v;
  
  private List<ViewManager> w;
  
  r(Context paramContext, Activity paramActivity, com.facebook.react.modules.core.b paramb, JavaScriptExecutorFactory paramJavaScriptExecutorFactory, JSBundleLoader paramJSBundleLoader, String paramString, List<v> paramList, boolean paramBoolean1, NotThreadSafeBridgeIdleDebugListener paramNotThreadSafeBridgeIdleDebugListener, LifecycleState paramLifecycleState, p0 paramp0, NativeModuleCallExceptionHandler paramNativeModuleCallExceptionHandler, com.facebook.react.devsupport.f paramf, boolean paramBoolean2, com.facebook.react.devsupport.h.a parama, int paramInt1, int paramInt2, JSIModulePackage paramJSIModulePackage, Map<String, Object> paramMap) {
    e.e.e.e.a.a(x, "ReactInstanceManager.ctor()");
    a(paramContext);
    com.facebook.react.uimanager.c.b(paramContext);
    this.n = paramContext;
    this.p = paramActivity;
    this.o = paramb;
    this.e = paramJavaScriptExecutorFactory;
    this.f = paramJSBundleLoader;
    this.g = paramString;
    this.h = new ArrayList<v>();
    this.j = paramBoolean1;
    com.facebook.systrace.a.a(0L, "ReactInstanceManager.initDevSupportManager");
    this.i = com.facebook.react.devsupport.a.a(paramContext, k(), this.g, paramBoolean1, paramf, parama, paramInt1, paramMap);
    com.facebook.systrace.a.a(0L);
    this.k = paramNotThreadSafeBridgeIdleDebugListener;
    this.b = paramLifecycleState;
    this.t = new e(paramContext);
    this.u = paramNativeModuleCallExceptionHandler;
    synchronized (this.h) {
      e.e.h.b.c.a().a(e.e.h.c.a.a, "RNCore: Use Split Packages");
      this.h.add(new a(this, new a(this), paramp0, paramBoolean2, paramInt2));
      if (this.j)
        this.h.add(new b()); 
      this.h.addAll(paramList);
      this.v = paramJSIModulePackage;
      com.facebook.react.modules.core.g.b();
      if (this.j)
        this.i.f(); 
      return;
    } 
  }
  
  private NativeModuleRegistry a(ReactApplicationContext paramReactApplicationContext, List<v> paramList, boolean paramBoolean) {
    // Byte code:
    //   0: new e/e/o/f
    //   3: dup
    //   4: aload_1
    //   5: aload_0
    //   6: invokespecial <init> : (Lcom/facebook/react/bridge/ReactApplicationContext;Le/e/o/r;)V
    //   9: astore #4
    //   11: getstatic com/facebook/react/bridge/ReactMarkerConstants.PROCESS_PACKAGES_START : Lcom/facebook/react/bridge/ReactMarkerConstants;
    //   14: invokestatic logMarker : (Lcom/facebook/react/bridge/ReactMarkerConstants;)V
    //   17: aload_0
    //   18: getfield h : Ljava/util/List;
    //   21: astore_1
    //   22: aload_1
    //   23: monitorenter
    //   24: aload_2
    //   25: invokeinterface iterator : ()Ljava/util/Iterator;
    //   30: astore_2
    //   31: aload_2
    //   32: invokeinterface hasNext : ()Z
    //   37: ifeq -> 117
    //   40: aload_2
    //   41: invokeinterface next : ()Ljava/lang/Object;
    //   46: checkcast e/e/o/v
    //   49: astore #5
    //   51: iload_3
    //   52: ifeq -> 72
    //   55: aload_0
    //   56: getfield h : Ljava/util/List;
    //   59: aload #5
    //   61: invokeinterface contains : (Ljava/lang/Object;)Z
    //   66: ifeq -> 72
    //   69: goto -> 31
    //   72: lconst_0
    //   73: ldc_w 'createAndProcessCustomReactPackage'
    //   76: invokestatic a : (JLjava/lang/String;)V
    //   79: iload_3
    //   80: ifeq -> 95
    //   83: aload_0
    //   84: getfield h : Ljava/util/List;
    //   87: aload #5
    //   89: invokeinterface add : (Ljava/lang/Object;)Z
    //   94: pop
    //   95: aload_0
    //   96: aload #5
    //   98: aload #4
    //   100: invokespecial a : (Le/e/o/v;Le/e/o/f;)V
    //   103: lconst_0
    //   104: invokestatic a : (J)V
    //   107: goto -> 31
    //   110: astore_2
    //   111: lconst_0
    //   112: invokestatic a : (J)V
    //   115: aload_2
    //   116: athrow
    //   117: aload_1
    //   118: monitorexit
    //   119: getstatic com/facebook/react/bridge/ReactMarkerConstants.PROCESS_PACKAGES_END : Lcom/facebook/react/bridge/ReactMarkerConstants;
    //   122: invokestatic logMarker : (Lcom/facebook/react/bridge/ReactMarkerConstants;)V
    //   125: getstatic com/facebook/react/bridge/ReactMarkerConstants.BUILD_NATIVE_MODULE_REGISTRY_START : Lcom/facebook/react/bridge/ReactMarkerConstants;
    //   128: invokestatic logMarker : (Lcom/facebook/react/bridge/ReactMarkerConstants;)V
    //   131: lconst_0
    //   132: ldc_w 'buildNativeModuleRegistry'
    //   135: invokestatic a : (JLjava/lang/String;)V
    //   138: aload #4
    //   140: invokevirtual a : ()Lcom/facebook/react/bridge/NativeModuleRegistry;
    //   143: astore_1
    //   144: lconst_0
    //   145: invokestatic a : (J)V
    //   148: getstatic com/facebook/react/bridge/ReactMarkerConstants.BUILD_NATIVE_MODULE_REGISTRY_END : Lcom/facebook/react/bridge/ReactMarkerConstants;
    //   151: invokestatic logMarker : (Lcom/facebook/react/bridge/ReactMarkerConstants;)V
    //   154: aload_1
    //   155: areturn
    //   156: astore_1
    //   157: lconst_0
    //   158: invokestatic a : (J)V
    //   161: getstatic com/facebook/react/bridge/ReactMarkerConstants.BUILD_NATIVE_MODULE_REGISTRY_END : Lcom/facebook/react/bridge/ReactMarkerConstants;
    //   164: invokestatic logMarker : (Lcom/facebook/react/bridge/ReactMarkerConstants;)V
    //   167: aload_1
    //   168: athrow
    //   169: astore_2
    //   170: aload_1
    //   171: monitorexit
    //   172: goto -> 177
    //   175: aload_2
    //   176: athrow
    //   177: goto -> 175
    // Exception table:
    //   from	to	target	type
    //   24	31	169	finally
    //   31	51	169	finally
    //   55	69	169	finally
    //   72	79	169	finally
    //   83	95	110	finally
    //   95	103	110	finally
    //   103	107	169	finally
    //   111	117	169	finally
    //   117	119	169	finally
    //   138	144	156	finally
    //   170	172	169	finally
  }
  
  private ReactApplicationContext a(JavaScriptExecutor paramJavaScriptExecutor, JSBundleLoader paramJSBundleLoader) {
    com.facebook.react.devsupport.h.c c1;
    e.e.e.e.a.a("ReactNative", "ReactInstanceManager.createReactContext()");
    ReactMarker.logMarker(ReactMarkerConstants.CREATE_REACT_CONTEXT_START, paramJavaScriptExecutor.getName());
    ReactApplicationContext reactApplicationContext = new ReactApplicationContext(this.n);
    NativeModuleCallExceptionHandler nativeModuleCallExceptionHandler = this.u;
    if (nativeModuleCallExceptionHandler == null)
      c1 = this.i; 
    reactApplicationContext.setNativeModuleCallExceptionHandler((NativeModuleCallExceptionHandler)c1);
    NativeModuleRegistry nativeModuleRegistry = a(reactApplicationContext, this.h, false);
    null = (new CatalystInstanceImpl.Builder()).setReactQueueConfigurationSpec(ReactQueueConfigurationSpec.createDefault()).setJSExecutor(paramJavaScriptExecutor).setRegistry(nativeModuleRegistry).setJSBundleLoader(paramJSBundleLoader).setNativeModuleCallExceptionHandler((NativeModuleCallExceptionHandler)c1);
    ReactMarker.logMarker(ReactMarkerConstants.CREATE_CATALYST_INSTANCE_START);
    com.facebook.systrace.a.a(0L, "createCatalystInstance");
    try {
      String str;
      CatalystInstanceImpl catalystInstanceImpl = null.build();
      com.facebook.systrace.a.a(0L);
      ReactMarker.logMarker(ReactMarkerConstants.CREATE_CATALYST_INSTANCE_END);
      reactApplicationContext.initializeWithInstance((CatalystInstance)catalystInstanceImpl);
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("ReactInstanceManager.createReactContext: mJSIModulePackage ");
      if (this.v != null) {
        str = "not null";
      } else {
        str = "null";
      } 
      stringBuilder.append(str);
      e.e.e.e.a.b("ReactNative", stringBuilder.toString());
      JSIModulePackage jSIModulePackage = this.v;
      if (jSIModulePackage != null) {
        String str1;
        catalystInstanceImpl.addJSIModules(jSIModulePackage.getJSIModules(reactApplicationContext, catalystInstanceImpl.getJavaScriptContextHolder()));
        stringBuilder = new StringBuilder();
        stringBuilder.append("ReactInstanceManager.createReactContext: ReactFeatureFlags.useTurboModules == ");
        if (!a.a) {
          str1 = "false";
        } else {
          str1 = "true";
        } 
        stringBuilder.append(str1);
        e.e.e.e.a.b("ReactNative", stringBuilder.toString());
        if (a.a) {
          JSIModule jSIModule = catalystInstanceImpl.getJSIModule(JSIModuleType.TurboModuleManager);
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("ReactInstanceManager.createReactContext: TurboModuleManager ");
          if (jSIModule == null) {
            str1 = "not created";
          } else {
            str1 = "created";
          } 
          stringBuilder1.append(str1);
          e.e.e.e.a.b("ReactNative", stringBuilder1.toString());
          catalystInstanceImpl.setTurboModuleManager(jSIModule);
          TurboModuleRegistry turboModuleRegistry = (TurboModuleRegistry)jSIModule;
          Iterator<String> iterator = turboModuleRegistry.b().iterator();
          while (iterator.hasNext())
            turboModuleRegistry.b(iterator.next()); 
        } 
      } 
      NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener = this.k;
      if (notThreadSafeBridgeIdleDebugListener != null)
        catalystInstanceImpl.addBridgeIdleDebugListener(notThreadSafeBridgeIdleDebugListener); 
      if (com.facebook.systrace.a.b(0L))
        catalystInstanceImpl.setGlobalVariable("__RCTProfileIsProfiling", "true"); 
      ReactMarker.logMarker(ReactMarkerConstants.PRE_RUN_JS_BUNDLE_START);
      com.facebook.systrace.a.a(0L, "runJSBundle");
      return reactApplicationContext;
    } finally {
      com.facebook.systrace.a.a(0L);
      ReactMarker.logMarker(ReactMarkerConstants.CREATE_CATALYST_INSTANCE_END);
    } 
  }
  
  static void a(Context paramContext) {
    SoLoader.a(paramContext, false);
  }
  
  private void a(JavaScriptExecutorFactory paramJavaScriptExecutorFactory, JSBundleLoader paramJSBundleLoader) {
    e.e.e.e.a.a("ReactNative", "ReactInstanceManager.recreateReactContextInBackground()");
    UiThreadUtil.assertOnUiThread();
    j j1 = new j(this, paramJavaScriptExecutorFactory, paramJSBundleLoader);
    if (this.d == null) {
      a(j1);
      return;
    } 
    this.c = j1;
  }
  
  private void a(ReactContext paramReactContext) {
    e.e.e.e.a.a("ReactNative", "ReactInstanceManager.tearDownReactContext()");
    UiThreadUtil.assertOnUiThread();
    if (this.b == LifecycleState.e)
      paramReactContext.onHostPause(); 
    synchronized (this.a) {
      Iterator<y> iterator = this.a.iterator();
      while (iterator.hasNext())
        d(iterator.next()); 
      this.t.b((MemoryPressureListener)paramReactContext.getCatalystInstance());
      paramReactContext.destroy();
      this.i.b(paramReactContext);
      return;
    } 
  }
  
  private void a(y paramy, CatalystInstance paramCatalystInstance) {
    e.e.e.e.a.a("ReactNative", "ReactInstanceManager.detachViewFromInstance()");
    UiThreadUtil.assertOnUiThread();
    if (paramy.getUIManagerType() == 2) {
      ((ReactFabric)paramCatalystInstance.getJSModule(ReactFabric.class)).unmountComponentAtNode(paramy.getRootViewTag());
      return;
    } 
    ((AppRegistry)paramCatalystInstance.getJSModule(AppRegistry.class)).unmountApplicationComponentAtRootTag(paramy.getRootViewTag());
  }
  
  private void a(j paramj) {
    e.e.e.e.a.a("ReactNative", "ReactInstanceManager.runCreateReactContextOnNewThread()");
    UiThreadUtil.assertOnUiThread();
    synchronized (this.a) {
      synchronized (this.l) {
        if (this.m != null) {
          a(this.m);
          this.m = null;
        } 
        this.d = new Thread(null, new e(this, paramj), "create_react_context");
        ReactMarker.logMarker(ReactMarkerConstants.REACT_CONTEXT_THREAD_START);
        this.d.start();
        return;
      } 
    } 
  }
  
  private void a(v paramv, f paramf) {
    com.facebook.systrace.b.b b1 = com.facebook.systrace.b.a(0L, "processPackage");
    b1.a("className", paramv.getClass().getSimpleName());
    b1.a();
    boolean bool = paramv instanceof x;
    if (bool)
      ((x)paramv).a(); 
    paramf.a(paramv);
    if (bool)
      ((x)paramv).b(); 
    com.facebook.systrace.b.a(0L).a();
  }
  
  private void b(ReactApplicationContext paramReactApplicationContext) {
    Set<y> set;
    k[] arrayOfK;
    e.e.e.e.a.a("ReactNative", "ReactInstanceManager.setupReactContext()");
    ReactMarker.logMarker(ReactMarkerConstants.PRE_SETUP_REACT_CONTEXT_END);
    ReactMarker.logMarker(ReactMarkerConstants.SETUP_REACT_CONTEXT_START);
    com.facebook.systrace.a.a(0L, "setupReactContext");
    synchronized (this.a) {
      synchronized (this.l) {
        e.e.m.a.a.a(paramReactApplicationContext);
        this.m = (ReactContext)paramReactApplicationContext;
        null = (Object<y>)paramReactApplicationContext.getCatalystInstance();
        e.e.m.a.a.a(null);
        null = null;
        null.initialize();
        this.i.a((ReactContext)paramReactApplicationContext);
        this.t.a((MemoryPressureListener)null);
        m();
        ReactMarker.logMarker(ReactMarkerConstants.ATTACH_MEASURED_ROOT_VIEWS_START);
        null = (Object<y>)this.a.iterator();
        while (null.hasNext())
          c(null.next()); 
        ReactMarker.logMarker(ReactMarkerConstants.ATTACH_MEASURED_ROOT_VIEWS_END);
        arrayOfK = new k[this.q.size()];
        UiThreadUtil.runOnUiThread(new f(this, this.q.<k>toArray(arrayOfK), paramReactApplicationContext));
        com.facebook.systrace.a.a(0L);
        ReactMarker.logMarker(ReactMarkerConstants.SETUP_REACT_CONTEXT_END);
        paramReactApplicationContext.runOnJSQueueThread(new g(this));
        paramReactApplicationContext.runOnNativeModulesQueueThread(new h(this));
        return;
      } 
    } 
  }
  
  private void b(boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokevirtual b : ()Lcom/facebook/react/bridge/ReactContext;
    //   6: astore_2
    //   7: aload_2
    //   8: ifnull -> 43
    //   11: iload_1
    //   12: ifne -> 35
    //   15: aload_0
    //   16: getfield b : Lcom/facebook/react/common/LifecycleState;
    //   19: getstatic com/facebook/react/common/LifecycleState.d : Lcom/facebook/react/common/LifecycleState;
    //   22: if_acmpeq -> 35
    //   25: aload_0
    //   26: getfield b : Lcom/facebook/react/common/LifecycleState;
    //   29: getstatic com/facebook/react/common/LifecycleState.c : Lcom/facebook/react/common/LifecycleState;
    //   32: if_acmpne -> 43
    //   35: aload_2
    //   36: aload_0
    //   37: getfield p : Landroid/app/Activity;
    //   40: invokevirtual onHostResume : (Landroid/app/Activity;)V
    //   43: aload_0
    //   44: getstatic com/facebook/react/common/LifecycleState.e : Lcom/facebook/react/common/LifecycleState;
    //   47: putfield b : Lcom/facebook/react/common/LifecycleState;
    //   50: aload_0
    //   51: monitorexit
    //   52: return
    //   53: astore_2
    //   54: aload_0
    //   55: monitorexit
    //   56: aload_2
    //   57: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	53	finally
    //   15	35	53	finally
    //   35	43	53	finally
    //   43	50	53	finally
  }
  
  private void c(y paramy) {
    e.e.e.e.a.b("ReactNative", "ReactInstanceManager.attachRootViewToInstance()");
    com.facebook.systrace.a.a(0L, "attachRootViewToInstance");
    UIManager uIManager = q0.c(this.m, paramy.getUIManagerType());
    if (uIManager != null) {
      WritableNativeMap writableNativeMap;
      WritableMap writableMap;
      Bundle bundle = paramy.getAppProperties();
      ViewGroup viewGroup = paramy.getRootViewGroup();
      if (bundle == null) {
        writableNativeMap = new WritableNativeMap();
      } else {
        writableMap = Arguments.fromBundle((Bundle)writableNativeMap);
      } 
      int i = uIManager.addRootView((View)viewGroup, writableMap, paramy.getInitialUITemplate());
      paramy.setRootViewTag(i);
      if (paramy.getUIManagerType() == 2) {
        uIManager.updateRootLayoutSpecs(i, paramy.getWidthMeasureSpec(), paramy.getHeightMeasureSpec());
        paramy.setShouldLogContentAppeared(true);
      } else {
        paramy.a();
      } 
      com.facebook.systrace.a.a(0L, "pre_rootView.onAttachedToReactInstance", i);
      UiThreadUtil.runOnUiThread(new i(this, i, paramy));
      com.facebook.systrace.a.a(0L);
      return;
    } 
    throw new IllegalStateException("Unable to attach a rootView to ReactInstance when UIManager is not properly initialized.");
  }
  
  private void d(y paramy) {
    paramy.getRootViewGroup().removeAllViews();
    paramy.getRootViewGroup().setId(-1);
  }
  
  public static s j() {
    return new s();
  }
  
  private com.facebook.react.devsupport.e k() {
    return new b(this);
  }
  
  private void l() {
    UiThreadUtil.assertOnUiThread();
    com.facebook.react.modules.core.b b1 = this.o;
    if (b1 != null)
      b1.e(); 
  }
  
  private void m() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield b : Lcom/facebook/react/common/LifecycleState;
    //   6: getstatic com/facebook/react/common/LifecycleState.e : Lcom/facebook/react/common/LifecycleState;
    //   9: if_acmpne -> 17
    //   12: aload_0
    //   13: iconst_1
    //   14: invokespecial b : (Z)V
    //   17: aload_0
    //   18: monitorexit
    //   19: return
    //   20: astore_1
    //   21: aload_0
    //   22: monitorexit
    //   23: aload_1
    //   24: athrow
    // Exception table:
    //   from	to	target	type
    //   2	17	20	finally
  }
  
  private void n() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokevirtual b : ()Lcom/facebook/react/bridge/ReactContext;
    //   6: astore_1
    //   7: aload_1
    //   8: ifnull -> 46
    //   11: aload_0
    //   12: getfield b : Lcom/facebook/react/common/LifecycleState;
    //   15: getstatic com/facebook/react/common/LifecycleState.e : Lcom/facebook/react/common/LifecycleState;
    //   18: if_acmpne -> 32
    //   21: aload_1
    //   22: invokevirtual onHostPause : ()V
    //   25: aload_0
    //   26: getstatic com/facebook/react/common/LifecycleState.d : Lcom/facebook/react/common/LifecycleState;
    //   29: putfield b : Lcom/facebook/react/common/LifecycleState;
    //   32: aload_0
    //   33: getfield b : Lcom/facebook/react/common/LifecycleState;
    //   36: getstatic com/facebook/react/common/LifecycleState.d : Lcom/facebook/react/common/LifecycleState;
    //   39: if_acmpne -> 46
    //   42: aload_1
    //   43: invokevirtual onHostDestroy : ()V
    //   46: aload_0
    //   47: getstatic com/facebook/react/common/LifecycleState.c : Lcom/facebook/react/common/LifecycleState;
    //   50: putfield b : Lcom/facebook/react/common/LifecycleState;
    //   53: aload_0
    //   54: monitorexit
    //   55: return
    //   56: astore_1
    //   57: aload_0
    //   58: monitorexit
    //   59: aload_1
    //   60: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	56	finally
    //   11	32	56	finally
    //   32	46	56	finally
    //   46	53	56	finally
  }
  
  private void o() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokevirtual b : ()Lcom/facebook/react/bridge/ReactContext;
    //   6: astore_1
    //   7: aload_1
    //   8: ifnull -> 49
    //   11: aload_0
    //   12: getfield b : Lcom/facebook/react/common/LifecycleState;
    //   15: getstatic com/facebook/react/common/LifecycleState.c : Lcom/facebook/react/common/LifecycleState;
    //   18: if_acmpne -> 36
    //   21: aload_1
    //   22: aload_0
    //   23: getfield p : Landroid/app/Activity;
    //   26: invokevirtual onHostResume : (Landroid/app/Activity;)V
    //   29: aload_1
    //   30: invokevirtual onHostPause : ()V
    //   33: goto -> 49
    //   36: aload_0
    //   37: getfield b : Lcom/facebook/react/common/LifecycleState;
    //   40: getstatic com/facebook/react/common/LifecycleState.e : Lcom/facebook/react/common/LifecycleState;
    //   43: if_acmpne -> 49
    //   46: goto -> 29
    //   49: aload_0
    //   50: getstatic com/facebook/react/common/LifecycleState.d : Lcom/facebook/react/common/LifecycleState;
    //   53: putfield b : Lcom/facebook/react/common/LifecycleState;
    //   56: aload_0
    //   57: monitorexit
    //   58: return
    //   59: astore_1
    //   60: aload_0
    //   61: monitorexit
    //   62: goto -> 67
    //   65: aload_1
    //   66: athrow
    //   67: goto -> 65
    // Exception table:
    //   from	to	target	type
    //   2	7	59	finally
    //   11	29	59	finally
    //   29	33	59	finally
    //   36	46	59	finally
    //   49	56	59	finally
  }
  
  private void p() {
    e.e.e.e.a.a(x, "ReactInstanceManager.recreateReactContextInBackgroundFromBundleLoader()");
    e.e.h.b.c.a().a(e.e.h.c.a.a, "RNCore: load from BundleLoader");
    a(this.e, this.f);
  }
  
  private void q() {
    e.e.e.e.a.a(x, "ReactInstanceManager.recreateReactContextInBackgroundInner()");
    e.e.h.b.c.a().a(e.e.h.c.a.a, "RNCore: recreateReactContextInBackground");
    UiThreadUtil.assertOnUiThread();
    if (this.j && this.g != null) {
      com.facebook.react.modules.debug.c.a a = this.i.b();
      if (!com.facebook.systrace.a.b(0L)) {
        if (this.f == null) {
          this.i.d();
          return;
        } 
        this.i.a(new c(this, a));
        return;
      } 
    } 
    p();
  }
  
  public ViewManager a(String paramString) {
    synchronized (this.l) {
      ReactApplicationContext reactApplicationContext = (ReactApplicationContext)b();
      if (reactApplicationContext == null || !reactApplicationContext.hasActiveCatalystInstance())
        return null; 
      synchronized (this.h) {
        for (v v : this.h) {
          if (v instanceof a0) {
            ViewManager viewManager = ((a0)v).a(reactApplicationContext, paramString);
            if (viewManager != null)
              return viewManager; 
          } 
        } 
        return null;
      } 
    } 
  }
  
  public List<ViewManager> a(ReactApplicationContext paramReactApplicationContext) {
    ReactMarker.logMarker(ReactMarkerConstants.CREATE_VIEW_MANAGERS_START);
    com.facebook.systrace.a.a(0L, "createAllViewManagers");
    try {
      if (this.w == null)
        synchronized (this.h) {
          if (this.w == null) {
            this.w = new ArrayList<ViewManager>();
            for (v v : this.h)
              this.w.addAll(v.createViewManagers(paramReactApplicationContext)); 
            return this.w;
          } 
        }  
      return this.w;
    } finally {
      com.facebook.systrace.a.a(0L);
      ReactMarker.logMarker(ReactMarkerConstants.CREATE_VIEW_MANAGERS_END);
    } 
  }
  
  public void a() {
    e.e.e.e.a.a(x, "ReactInstanceManager.createReactContextInBackground()");
    UiThreadUtil.assertOnUiThread();
    if (!this.r) {
      this.r = true;
      q();
    } 
  }
  
  public void a(Activity paramActivity) {
    if (paramActivity == this.p)
      g(); 
  }
  
  public void a(Activity paramActivity, int paramInt1, int paramInt2, Intent paramIntent) {
    ReactContext reactContext = b();
    if (reactContext != null)
      reactContext.onActivityResult(paramActivity, paramInt1, paramInt2, paramIntent); 
  }
  
  public void a(Activity paramActivity, com.facebook.react.modules.core.b paramb) {
    UiThreadUtil.assertOnUiThread();
    this.o = paramb;
    c(paramActivity);
  }
  
  public void a(Intent paramIntent) {
    UiThreadUtil.assertOnUiThread();
    ReactContext reactContext = b();
    if (reactContext == null) {
      e.e.e.e.a.e(x, "Instance detached from instance manager");
      return;
    } 
    String str = paramIntent.getAction();
    Uri uri = paramIntent.getData();
    if (uri != null && ("android.intent.action.VIEW".equals(str) || "android.nfc.action.NDEF_DISCOVERED".equals(str)))
      ((DeviceEventManagerModule)reactContext.getNativeModule(DeviceEventManagerModule.class)).emitNewIntentReceived(uri); 
    reactContext.onNewIntent(this.p, paramIntent);
  }
  
  public void a(y paramy) {
    UiThreadUtil.assertOnUiThread();
    this.a.add(paramy);
    d(paramy);
    ReactContext reactContext = b();
    if (this.d == null && reactContext != null)
      c(paramy); 
  }
  
  public void a(k paramk) {
    this.q.add(paramk);
  }
  
  public void a(boolean paramBoolean) {
    UiThreadUtil.assertOnUiThread();
    ReactContext reactContext = b();
    if (reactContext != null)
      reactContext.onWindowFocusChange(paramBoolean); 
  }
  
  public ReactContext b() {
    synchronized (this.l) {
      return this.m;
    } 
  }
  
  public void b(Activity paramActivity) {
    boolean bool;
    e.e.m.a.a.a(this.p);
    if (paramActivity == this.p) {
      bool = true;
    } else {
      bool = false;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Pausing an activity that is not the current activity, this is incorrect! Current activity: ");
    stringBuilder.append(this.p.getClass().getSimpleName());
    stringBuilder.append(" Paused activity: ");
    stringBuilder.append(paramActivity.getClass().getSimpleName());
    e.e.m.a.a.a(bool, stringBuilder.toString());
    h();
  }
  
  public void b(y paramy) {
    UiThreadUtil.assertOnUiThread();
    synchronized (this.a) {
      if (this.a.contains(paramy)) {
        ReactContext reactContext = b();
        this.a.remove(paramy);
        if (reactContext != null && reactContext.hasActiveCatalystInstance())
          a(paramy, reactContext.getCatalystInstance()); 
      } 
      return;
    } 
  }
  
  public void b(k paramk) {
    this.q.remove(paramk);
  }
  
  public com.facebook.react.devsupport.h.c c() {
    return this.i;
  }
  
  public void c(Activity paramActivity) {
    UiThreadUtil.assertOnUiThread();
    this.p = paramActivity;
    if (this.j) {
      View view = this.p.getWindow().getDecorView();
      if (!v.G(view)) {
        view.addOnAttachStateChangeListener(new d(this, view));
      } else {
        this.i.d(true);
      } 
    } 
    b(false);
  }
  
  public List<String> d() {
    com.facebook.systrace.a.a(0L, "ReactInstanceManager.getViewManagerNames");
    synchronized (this.l) {
      null = (ReactApplicationContext)b();
      if (null == null || !null.hasActiveCatalystInstance())
        return null; 
      synchronized (this.h) {
        HashSet<String> hashSet = new HashSet();
        for (v v : this.h) {
          com.facebook.systrace.b.b b1 = com.facebook.systrace.b.a(0L, "ReactInstanceManager.getViewManagerName");
          b1.a("Package", v.getClass().getSimpleName());
          b1.a();
          if (v instanceof a0) {
            List<String> list = ((a0)v).a(null);
            if (list != null)
              hashSet.addAll(list); 
          } 
          com.facebook.systrace.b.a(0L).a();
        } 
        com.facebook.systrace.a.a(0L);
        return new ArrayList<String>(hashSet);
      } 
    } 
  }
  
  public boolean e() {
    return this.r;
  }
  
  public void f() {
    UiThreadUtil.assertOnUiThread();
    ReactContext reactContext = this.m;
    if (reactContext == null) {
      e.e.e.e.a.e(x, "Instance detached from instance manager");
      l();
      return;
    } 
    ((DeviceEventManagerModule)reactContext.getNativeModule(DeviceEventManagerModule.class)).emitHardwareBackPressed();
  }
  
  public void g() {
    UiThreadUtil.assertOnUiThread();
    if (this.j)
      this.i.d(false); 
    n();
    this.p = null;
  }
  
  public void h() {
    UiThreadUtil.assertOnUiThread();
    this.o = null;
    if (this.j)
      this.i.d(false); 
    o();
  }
  
  public void i() {
    UiThreadUtil.assertOnUiThread();
    this.i.g();
  }
  
  class a implements com.facebook.react.modules.core.b {
    a(r this$0) {}
    
    public void e() {
      r.a(this.c);
    }
  }
  
  class b implements com.facebook.react.devsupport.e {
    b(r this$0) {}
  }
  
  class c implements com.facebook.react.devsupport.h.d {
    c(r this$0, com.facebook.react.modules.debug.c.a param1a) {}
  }
  
  class d implements View.OnAttachStateChangeListener {
    d(r this$0, View param1View) {}
    
    public void onViewAttachedToWindow(View param1View) {
      this.c.removeOnAttachStateChangeListener(this);
      r.c(this.d).d(true);
    }
    
    public void onViewDetachedFromWindow(View param1View) {}
  }
  
  class e implements Runnable {
    e(r this$0, r.j param1j) {}
    
    public void run() {
      // Byte code:
      //   0: getstatic com/facebook/react/bridge/ReactMarkerConstants.REACT_CONTEXT_THREAD_END : Lcom/facebook/react/bridge/ReactMarkerConstants;
      //   3: invokestatic logMarker : (Lcom/facebook/react/bridge/ReactMarkerConstants;)V
      //   6: aload_0
      //   7: getfield d : Le/e/o/r;
      //   10: invokestatic d : (Le/e/o/r;)Ljava/lang/Boolean;
      //   13: astore_2
      //   14: aload_2
      //   15: monitorenter
      //   16: aload_0
      //   17: getfield d : Le/e/o/r;
      //   20: invokestatic d : (Le/e/o/r;)Ljava/lang/Boolean;
      //   23: invokevirtual booleanValue : ()Z
      //   26: istore_1
      //   27: iload_1
      //   28: ifeq -> 44
      //   31: aload_0
      //   32: getfield d : Le/e/o/r;
      //   35: invokestatic d : (Le/e/o/r;)Ljava/lang/Boolean;
      //   38: invokevirtual wait : ()V
      //   41: goto -> 16
      //   44: aload_2
      //   45: monitorexit
      //   46: aload_0
      //   47: getfield d : Le/e/o/r;
      //   50: iconst_1
      //   51: invokestatic a : (Le/e/o/r;Z)Z
      //   54: pop
      //   55: bipush #-4
      //   57: invokestatic setThreadPriority : (I)V
      //   60: getstatic com/facebook/react/bridge/ReactMarkerConstants.VM_INIT : Lcom/facebook/react/bridge/ReactMarkerConstants;
      //   63: invokestatic logMarker : (Lcom/facebook/react/bridge/ReactMarkerConstants;)V
      //   66: aload_0
      //   67: getfield d : Le/e/o/r;
      //   70: aload_0
      //   71: getfield c : Le/e/o/r$j;
      //   74: invokevirtual b : ()Lcom/facebook/react/bridge/JavaScriptExecutorFactory;
      //   77: invokeinterface create : ()Lcom/facebook/react/bridge/JavaScriptExecutor;
      //   82: aload_0
      //   83: getfield c : Le/e/o/r$j;
      //   86: invokevirtual a : ()Lcom/facebook/react/bridge/JSBundleLoader;
      //   89: invokestatic a : (Le/e/o/r;Lcom/facebook/react/bridge/JavaScriptExecutor;Lcom/facebook/react/bridge/JSBundleLoader;)Lcom/facebook/react/bridge/ReactApplicationContext;
      //   92: astore_2
      //   93: aload_0
      //   94: getfield d : Le/e/o/r;
      //   97: aconst_null
      //   98: invokestatic a : (Le/e/o/r;Ljava/lang/Thread;)Ljava/lang/Thread;
      //   101: pop
      //   102: getstatic com/facebook/react/bridge/ReactMarkerConstants.PRE_SETUP_REACT_CONTEXT_START : Lcom/facebook/react/bridge/ReactMarkerConstants;
      //   105: invokestatic logMarker : (Lcom/facebook/react/bridge/ReactMarkerConstants;)V
      //   108: new e/e/o/r$e$a
      //   111: dup
      //   112: aload_0
      //   113: invokespecial <init> : (Le/e/o/r$e;)V
      //   116: astore_3
      //   117: aload_2
      //   118: new e/e/o/r$e$b
      //   121: dup
      //   122: aload_0
      //   123: aload_2
      //   124: invokespecial <init> : (Le/e/o/r$e;Lcom/facebook/react/bridge/ReactApplicationContext;)V
      //   127: invokevirtual runOnNativeModulesQueueThread : (Ljava/lang/Runnable;)V
      //   130: aload_3
      //   131: invokestatic runOnUiThread : (Ljava/lang/Runnable;)V
      //   134: return
      //   135: astore_2
      //   136: aload_0
      //   137: getfield d : Le/e/o/r;
      //   140: invokestatic c : (Le/e/o/r;)Lcom/facebook/react/devsupport/h/c;
      //   143: aload_2
      //   144: invokeinterface handleException : (Ljava/lang/Exception;)V
      //   149: return
      //   150: astore_3
      //   151: aload_2
      //   152: monitorexit
      //   153: goto -> 158
      //   156: aload_3
      //   157: athrow
      //   158: goto -> 156
      //   161: astore_3
      //   162: goto -> 16
      // Exception table:
      //   from	to	target	type
      //   16	27	150	finally
      //   31	41	161	java/lang/InterruptedException
      //   31	41	150	finally
      //   44	46	150	finally
      //   55	134	135	java/lang/Exception
      //   151	153	150	finally
    }
    
    class a implements Runnable {
      a(r.e this$0) {}
      
      public void run() {
        if (r.b(this.c.d) != null) {
          r r = this.c.d;
          r.b(r, r.b(r));
          r.a(this.c.d, (r.j)null);
        } 
      }
    }
    
    class b implements Runnable {
      b(r.e this$0, ReactApplicationContext param2ReactApplicationContext) {}
      
      public void run() {
        try {
          r.a(this.d.d, this.c);
          return;
        } catch (Exception exception) {
          e.e.e.e.a.b("ReactNative", "ReactInstanceManager caught exception in setupReactContext", exception);
          r.c(this.d.d).handleException(exception);
          return;
        } 
      }
    }
  }
  
  class a implements Runnable {
    a(r this$0) {}
    
    public void run() {
      if (r.b(this.c.d) != null) {
        r r = this.c.d;
        r.b(r, r.b(r));
        r.a(this.c.d, (r.j)null);
      } 
    }
  }
  
  class b implements Runnable {
    b(r this$0, ReactApplicationContext param1ReactApplicationContext) {}
    
    public void run() {
      try {
        r.a(this.d.d, this.c);
        return;
      } catch (Exception exception) {
        e.e.e.e.a.b("ReactNative", "ReactInstanceManager caught exception in setupReactContext", exception);
        r.c(this.d.d).handleException(exception);
        return;
      } 
    }
  }
  
  class f implements Runnable {
    f(r this$0, r.k[] param1ArrayOfk, ReactApplicationContext param1ReactApplicationContext) {}
    
    public void run() {
      for (r.k k1 : this.c) {
        if (k1 != null)
          k1.a((ReactContext)this.d); 
      } 
    }
  }
  
  class g implements Runnable {
    g(r this$0) {}
    
    public void run() {
      Process.setThreadPriority(0);
      ReactMarker.logMarker(ReactMarkerConstants.CHANGE_THREAD_PRIORITY, "js_default");
    }
  }
  
  class h implements Runnable {
    h(r this$0) {}
    
    public void run() {
      Process.setThreadPriority(0);
    }
  }
  
  class i implements Runnable {
    i(r this$0, int param1Int, y param1y) {}
    
    public void run() {
      com.facebook.systrace.a.c(0L, "pre_rootView.onAttachedToReactInstance", this.c);
      this.d.a(101);
    }
  }
  
  private class j {
    private final JavaScriptExecutorFactory a;
    
    private final JSBundleLoader b;
    
    public j(r this$0, JavaScriptExecutorFactory param1JavaScriptExecutorFactory, JSBundleLoader param1JSBundleLoader) {
      e.e.m.a.a.a(param1JavaScriptExecutorFactory);
      this.a = param1JavaScriptExecutorFactory;
      e.e.m.a.a.a(param1JSBundleLoader);
      this.b = param1JSBundleLoader;
    }
    
    public JSBundleLoader a() {
      return this.b;
    }
    
    public JavaScriptExecutorFactory b() {
      return this.a;
    }
  }
  
  public static interface k {
    void a(ReactContext param1ReactContext);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/o/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */