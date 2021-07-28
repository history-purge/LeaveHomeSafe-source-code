package com.facebook.react.bridge;

import android.content.res.AssetManager;
import android.os.AsyncTask;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.queue.MessageQueueThread;
import com.facebook.react.bridge.queue.QueueThreadExceptionHandler;
import com.facebook.react.bridge.queue.ReactQueueConfiguration;
import com.facebook.react.bridge.queue.ReactQueueConfigurationImpl;
import com.facebook.react.bridge.queue.ReactQueueConfigurationSpec;
import com.facebook.react.turbomodule.core.CallInvokerHolderImpl;
import com.facebook.react.turbomodule.core.interfaces.CallInvokerHolder;
import com.facebook.react.turbomodule.core.interfaces.TurboModuleRegistry;
import com.facebook.react.turbomodule.core.interfaces.a;
import com.facebook.systrace.TraceListener;
import com.facebook.systrace.a;
import e.e.e.e.a;
import e.e.m.a.a;
import e.e.n.a.a;
import e.e.o.b0.a;
import e.e.o.d0.a.a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

@a
public class CatalystInstanceImpl implements CatalystInstance {
  private static final AtomicInteger sNextInstanceIdForTrace = new AtomicInteger(1);
  
  private volatile boolean mAcceptCalls;
  
  private final CopyOnWriteArrayList<NotThreadSafeBridgeIdleDebugListener> mBridgeIdleListeners;
  
  private volatile boolean mDestroyed;
  
  private final HybridData mHybridData;
  
  private boolean mInitialized;
  
  private boolean mJSBundleHasLoaded;
  
  private final JSBundleLoader mJSBundleLoader;
  
  private final ArrayList<PendingJSCall> mJSCallsPendingInit;
  
  private final Object mJSCallsPendingInitLock;
  
  private final JSIModuleRegistry mJSIModuleRegistry;
  
  private final JavaScriptModuleRegistry mJSModuleRegistry;
  
  private volatile boolean mJSThreadDestructionComplete;
  
  private JavaScriptContextHolder mJavaScriptContextHolder;
  
  private final String mJsPendingCallsTitleForTrace;
  
  private final NativeModuleCallExceptionHandler mNativeModuleCallExceptionHandler;
  
  private final NativeModuleRegistry mNativeModuleRegistry;
  
  private final MessageQueueThread mNativeModulesQueueThread;
  
  private volatile boolean mNativeModulesThreadDestructionComplete;
  
  private final AtomicInteger mPendingJSCalls = new AtomicInteger(0);
  
  private final ReactQueueConfigurationImpl mReactQueueConfiguration;
  
  private String mSourceURL;
  
  private final TraceListener mTraceListener;
  
  private JSIModule mTurboModuleManagerJSIModule;
  
  private volatile TurboModuleRegistry mTurboModuleRegistry;
  
  private CatalystInstanceImpl(ReactQueueConfigurationSpec paramReactQueueConfigurationSpec, JavaScriptExecutor paramJavaScriptExecutor, NativeModuleRegistry paramNativeModuleRegistry, JSBundleLoader paramJSBundleLoader, NativeModuleCallExceptionHandler paramNativeModuleCallExceptionHandler) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("pending_js_calls_instance");
    stringBuilder.append(sNextInstanceIdForTrace.getAndIncrement());
    this.mJsPendingCallsTitleForTrace = stringBuilder.toString();
    this.mDestroyed = false;
    this.mNativeModulesThreadDestructionComplete = false;
    this.mJSThreadDestructionComplete = false;
    this.mJSCallsPendingInit = new ArrayList<PendingJSCall>();
    this.mJSCallsPendingInitLock = new Object();
    this.mJSIModuleRegistry = new JSIModuleRegistry();
    this.mInitialized = false;
    this.mAcceptCalls = false;
    this.mTurboModuleRegistry = null;
    this.mTurboModuleManagerJSIModule = null;
    a.a("ReactNative", "Initializing React Xplat Bridge.");
    a.a(0L, "createCatalystInstanceImpl");
    this.mHybridData = initHybrid();
    this.mReactQueueConfiguration = ReactQueueConfigurationImpl.create(paramReactQueueConfigurationSpec, new NativeExceptionHandler());
    this.mBridgeIdleListeners = new CopyOnWriteArrayList<NotThreadSafeBridgeIdleDebugListener>();
    this.mNativeModuleRegistry = paramNativeModuleRegistry;
    this.mJSModuleRegistry = new JavaScriptModuleRegistry();
    this.mJSBundleLoader = paramJSBundleLoader;
    this.mNativeModuleCallExceptionHandler = paramNativeModuleCallExceptionHandler;
    this.mNativeModulesQueueThread = this.mReactQueueConfiguration.getNativeModulesQueueThread();
    this.mTraceListener = new JSProfilerTraceListener(this);
    a.a(0L);
    a.a("ReactNative", "Initializing React Xplat Bridge before initializeBridge");
    a.a(0L, "initializeCxxBridge");
    initializeBridge(new BridgeCallback(this), paramJavaScriptExecutor, this.mReactQueueConfiguration.getJSQueueThread(), this.mNativeModulesQueueThread, this.mNativeModuleRegistry.getJavaModules(this), this.mNativeModuleRegistry.getCxxModules());
    a.a("ReactNative", "Initializing React Xplat Bridge after initializeBridge");
    a.a(0L);
    this.mJavaScriptContextHolder = new JavaScriptContextHolder(getJavaScriptContext());
  }
  
  private void decrementPendingJSCalls() {
    boolean bool;
    int i = this.mPendingJSCalls.decrementAndGet();
    if (i == 0) {
      bool = true;
    } else {
      bool = false;
    } 
    a.e(0L, this.mJsPendingCallsTitleForTrace, i);
    if (bool && !this.mBridgeIdleListeners.isEmpty())
      this.mNativeModulesQueueThread.runOnQueue(new Runnable() {
            public void run() {
              Iterator<NotThreadSafeBridgeIdleDebugListener> iterator = CatalystInstanceImpl.this.mBridgeIdleListeners.iterator();
              while (iterator.hasNext())
                ((NotThreadSafeBridgeIdleDebugListener)iterator.next()).onTransitionToBridgeIdle(); 
            }
          }); 
  }
  
  private native long getJavaScriptContext();
  
  private <T extends NativeModule> String getNameFromAnnotation(Class<T> paramClass) {
    a a = paramClass.<a>getAnnotation(a.class);
    if (a != null)
      return a.name(); 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Could not find @ReactModule annotation in ");
    stringBuilder.append(paramClass.getCanonicalName());
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  private TurboModuleRegistry getTurboModuleRegistry() {
    if (a.a) {
      TurboModuleRegistry turboModuleRegistry = this.mTurboModuleRegistry;
      a.a(turboModuleRegistry, "TurboModules are enabled, but mTurboModuleRegistry hasn't been set.");
      return turboModuleRegistry;
    } 
    return null;
  }
  
  private void incrementPendingJSCalls() {
    boolean bool;
    int i = this.mPendingJSCalls.getAndIncrement();
    if (i == 0) {
      bool = true;
    } else {
      bool = false;
    } 
    a.e(0L, this.mJsPendingCallsTitleForTrace, i + 1);
    if (bool && !this.mBridgeIdleListeners.isEmpty())
      this.mNativeModulesQueueThread.runOnQueue(new Runnable() {
            public void run() {
              Iterator<NotThreadSafeBridgeIdleDebugListener> iterator = CatalystInstanceImpl.this.mBridgeIdleListeners.iterator();
              while (iterator.hasNext())
                ((NotThreadSafeBridgeIdleDebugListener)iterator.next()).onTransitionToBridgeBusy(); 
            }
          }); 
  }
  
  private static native HybridData initHybrid();
  
  private native void initializeBridge(ReactCallback paramReactCallback, JavaScriptExecutor paramJavaScriptExecutor, MessageQueueThread paramMessageQueueThread1, MessageQueueThread paramMessageQueueThread2, Collection<JavaModuleWrapper> paramCollection, Collection<ModuleHolder> paramCollection1);
  
  private native void jniCallJSCallback(int paramInt, NativeArray paramNativeArray);
  
  private native void jniCallJSFunction(String paramString1, String paramString2, NativeArray paramNativeArray);
  
  private native void jniExtendNativeModules(Collection<JavaModuleWrapper> paramCollection, Collection<ModuleHolder> paramCollection1);
  
  private native void jniHandleMemoryPressure(int paramInt);
  
  private native void jniLoadScriptFromAssets(AssetManager paramAssetManager, String paramString, boolean paramBoolean);
  
  private native void jniLoadScriptFromFile(String paramString1, String paramString2, boolean paramBoolean);
  
  private native void jniRegisterSegment(int paramInt, String paramString);
  
  private native void jniSetSourceURL(String paramString);
  
  private void onNativeException(Exception paramException) {
    a.b("ReactNative", "CatalystInstanceImpl caught native exception", paramException);
    this.mNativeModuleCallExceptionHandler.handleException(paramException);
    this.mReactQueueConfiguration.getUIQueueThread().runOnQueue(new Runnable() {
          public void run() {
            CatalystInstanceImpl.this.destroy();
          }
        });
  }
  
  public void addBridgeIdleDebugListener(NotThreadSafeBridgeIdleDebugListener paramNotThreadSafeBridgeIdleDebugListener) {
    this.mBridgeIdleListeners.add(paramNotThreadSafeBridgeIdleDebugListener);
  }
  
  public void addJSIModules(List<JSIModuleSpec> paramList) {
    this.mJSIModuleRegistry.registerModules(paramList);
  }
  
  public void callFunction(PendingJSCall paramPendingJSCall) {
    String str;
    if (this.mDestroyed) {
      str = paramPendingJSCall.toString();
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Calling JS function after bridge has been destroyed: ");
      stringBuilder.append(str);
      a.e("ReactNative", stringBuilder.toString());
      return;
    } 
    if (!this.mAcceptCalls)
      synchronized (this.mJSCallsPendingInitLock) {
        if (!this.mAcceptCalls) {
          this.mJSCallsPendingInit.add(str);
          return;
        } 
      }  
    str.call(this);
  }
  
  public void callFunction(String paramString1, String paramString2, NativeArray paramNativeArray) {
    callFunction(new PendingJSCall(paramString1, paramString2, paramNativeArray));
  }
  
  public void destroy() {
    a.a("ReactNative", "CatalystInstanceImpl.destroy() start");
    UiThreadUtil.assertOnUiThread();
    if (a.d) {
      destroyV2();
      return;
    } 
    destroyV1();
  }
  
  public void destroyV1() {
    a.a("ReactNative", "CatalystInstanceImpl.destroyV1() start");
    UiThreadUtil.assertOnUiThread();
    if (this.mDestroyed)
      return; 
    ReactMarker.logMarker(ReactMarkerConstants.DESTROY_CATALYST_INSTANCE_START);
    this.mDestroyed = true;
    this.mNativeModulesQueueThread.runOnQueue(new Runnable() {
          public void run() {
            CatalystInstanceImpl.this.mNativeModuleRegistry.notifyJSInstanceDestroy();
            CatalystInstanceImpl.this.mJSIModuleRegistry.notifyJSInstanceDestroy();
            AtomicInteger atomicInteger = CatalystInstanceImpl.this.mPendingJSCalls;
            boolean bool = false;
            if (atomicInteger.getAndSet(0) == 0)
              bool = true; 
            if (!CatalystInstanceImpl.this.mBridgeIdleListeners.isEmpty())
              for (NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener : CatalystInstanceImpl.this.mBridgeIdleListeners) {
                if (!bool)
                  notThreadSafeBridgeIdleDebugListener.onTransitionToBridgeIdle(); 
                notThreadSafeBridgeIdleDebugListener.onBridgeDestroyed();
              }  
            CatalystInstanceImpl.this.getReactQueueConfiguration().getJSQueueThread().runOnQueue(new Runnable() {
                  public void run() {
                    if (CatalystInstanceImpl.this.mTurboModuleManagerJSIModule != null)
                      CatalystInstanceImpl.this.mTurboModuleManagerJSIModule.onCatalystInstanceDestroy(); 
                    CatalystInstanceImpl.this.getReactQueueConfiguration().getUIQueueThread().runOnQueue(new Runnable() {
                          public void run() {
                            AsyncTask.execute(new Runnable() {
                                  public void run() {
                                    CatalystInstanceImpl.this.mJavaScriptContextHolder.clear();
                                    CatalystInstanceImpl.this.mHybridData.resetNative();
                                    CatalystInstanceImpl.this.getReactQueueConfiguration().destroy();
                                    a.a("ReactNative", "CatalystInstanceImpl.destroy() end");
                                    ReactMarker.logMarker(ReactMarkerConstants.DESTROY_CATALYST_INSTANCE_END);
                                  }
                                });
                          }
                        });
                  }
                });
          }
        });
    a.b(this.mTraceListener);
  }
  
  public void destroyV2() {
    a.a("ReactNative", "CatalystInstanceImpl.destroyV2() start");
    UiThreadUtil.assertOnUiThread();
    if (this.mDestroyed)
      return; 
    ReactMarker.logMarker(ReactMarkerConstants.DESTROY_CATALYST_INSTANCE_START);
    this.mDestroyed = true;
    this.mNativeModulesThreadDestructionComplete = false;
    this.mJSThreadDestructionComplete = false;
    this.mNativeModulesQueueThread.runOnQueue(new Runnable() {
          public void run() {
            a.a("CatalystInstanceImpl", ".destroy on native modules thread");
            CatalystInstanceImpl.this.mNativeModuleRegistry.notifyJSInstanceDestroy();
            CatalystInstanceImpl.this.mJSIModuleRegistry.notifyJSInstanceDestroy();
            AtomicInteger atomicInteger = CatalystInstanceImpl.this.mPendingJSCalls;
            boolean bool = false;
            if (atomicInteger.getAndSet(0) == 0)
              bool = true; 
            if (!CatalystInstanceImpl.this.mBridgeIdleListeners.isEmpty())
              for (NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener : CatalystInstanceImpl.this.mBridgeIdleListeners) {
                if (!bool)
                  notThreadSafeBridgeIdleDebugListener.onTransitionToBridgeIdle(); 
                notThreadSafeBridgeIdleDebugListener.onBridgeDestroyed();
              }  
            CatalystInstanceImpl.access$1102(CatalystInstanceImpl.this, true);
            a.a("CatalystInstanceImpl", ".destroy on native modules thread finished");
          }
        });
    getReactQueueConfiguration().getJSQueueThread().runOnQueue(new Runnable() {
          public void run() {
            a.a("CatalystInstanceImpl", ".destroy on JS thread");
            if (CatalystInstanceImpl.this.mTurboModuleManagerJSIModule != null)
              CatalystInstanceImpl.this.mTurboModuleManagerJSIModule.onCatalystInstanceDestroy(); 
            CatalystInstanceImpl.access$1202(CatalystInstanceImpl.this, true);
            a.a("CatalystInstanceImpl", ".destroy on JS thread finished");
          }
        });
    long l = System.currentTimeMillis();
    while (!this.mNativeModulesThreadDestructionComplete || !this.mJSThreadDestructionComplete) {
      if (System.currentTimeMillis() - l > 100L) {
        a.e("ReactNative", "CatalystInstanceImpl.destroy() timed out waiting for Native Modules and JS thread teardown");
        break;
      } 
    } 
    this.mJavaScriptContextHolder.clear();
    this.mHybridData.resetNative();
    getReactQueueConfiguration().destroy();
    a.a("ReactNative", "CatalystInstanceImpl.destroy() end");
    ReactMarker.logMarker(ReactMarkerConstants.DESTROY_CATALYST_INSTANCE_END);
    a.b(this.mTraceListener);
  }
  
  public void extendNativeModules(NativeModuleRegistry paramNativeModuleRegistry) {
    this.mNativeModuleRegistry.registerModules(paramNativeModuleRegistry);
    jniExtendNativeModules(paramNativeModuleRegistry.getJavaModules(this), paramNativeModuleRegistry.getCxxModules());
  }
  
  public native CallInvokerHolderImpl getJSCallInvokerHolder();
  
  public JSIModule getJSIModule(JSIModuleType paramJSIModuleType) {
    return this.mJSIModuleRegistry.getModule(paramJSIModuleType);
  }
  
  public <T extends JavaScriptModule> T getJSModule(Class<T> paramClass) {
    return this.mJSModuleRegistry.getJavaScriptModule(this, paramClass);
  }
  
  public JavaScriptContextHolder getJavaScriptContextHolder() {
    return this.mJavaScriptContextHolder;
  }
  
  public native CallInvokerHolderImpl getNativeCallInvokerHolder();
  
  public <T extends NativeModule> T getNativeModule(Class<T> paramClass) {
    return (T)getNativeModule(getNameFromAnnotation(paramClass));
  }
  
  public NativeModule getNativeModule(String paramString) {
    if (getTurboModuleRegistry() != null) {
      String str;
      a a = getTurboModuleRegistry().b(paramString);
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("CatalystInstanceImpl.getNativeModule: TurboModule ");
      stringBuilder.append(paramString);
      if (a == null) {
        str = " not";
      } else {
        str = "";
      } 
      stringBuilder.append(str);
      stringBuilder.append(" found");
      a.b("ReactNative", stringBuilder.toString());
      if (a != null)
        return (NativeModule)a; 
    } 
    return this.mNativeModuleRegistry.getModule(paramString);
  }
  
  public Collection<NativeModule> getNativeModules() {
    ArrayList<NativeModule> arrayList = new ArrayList();
    arrayList.addAll(this.mNativeModuleRegistry.getAllModules());
    if (getTurboModuleRegistry() != null) {
      Iterator<NativeModule> iterator = getTurboModuleRegistry().a().iterator();
      while (iterator.hasNext())
        arrayList.add(iterator.next()); 
    } 
    return arrayList;
  }
  
  public ReactQueueConfiguration getReactQueueConfiguration() {
    return (ReactQueueConfiguration)this.mReactQueueConfiguration;
  }
  
  public String getSourceURL() {
    return this.mSourceURL;
  }
  
  public void handleMemoryPressure(int paramInt) {
    if (this.mDestroyed)
      return; 
    jniHandleMemoryPressure(paramInt);
  }
  
  public <T extends NativeModule> boolean hasNativeModule(Class<T> paramClass) {
    String str = getNameFromAnnotation(paramClass);
    return (getTurboModuleRegistry() != null && getTurboModuleRegistry().a(str)) ? true : this.mNativeModuleRegistry.hasModule(str);
  }
  
  public boolean hasRunJSBundle() {
    synchronized (this.mJSCallsPendingInitLock) {
      if (this.mJSBundleHasLoaded && this.mAcceptCalls)
        return true; 
    } 
    boolean bool = false;
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=SYNTHETIC_LOCAL_VARIABLE_2} */
    return bool;
  }
  
  public void initialize() {
    a.a("ReactNative", "CatalystInstanceImpl.initialize()");
    a.a(this.mInitialized ^ true, "This catalyst instance has already been initialized");
    a.a(this.mAcceptCalls, "RunJSBundle hasn't completed.");
    this.mInitialized = true;
    this.mNativeModulesQueueThread.runOnQueue(new Runnable() {
          public void run() {
            CatalystInstanceImpl.this.mNativeModuleRegistry.notifyJSInstanceInitialized();
          }
        });
  }
  
  public void invokeCallback(int paramInt, NativeArrayInterface paramNativeArrayInterface) {
    if (this.mDestroyed) {
      a.e("ReactNative", "Invoking JS callback after bridge has been destroyed.");
      return;
    } 
    jniCallJSCallback(paramInt, (NativeArray)paramNativeArrayInterface);
  }
  
  public boolean isDestroyed() {
    return this.mDestroyed;
  }
  
  public void loadScriptFromAssets(AssetManager paramAssetManager, String paramString, boolean paramBoolean) {
    this.mSourceURL = paramString;
    jniLoadScriptFromAssets(paramAssetManager, paramString, paramBoolean);
  }
  
  public void loadScriptFromFile(String paramString1, String paramString2, boolean paramBoolean) {
    this.mSourceURL = paramString2;
    jniLoadScriptFromFile(paramString1, paramString2, paramBoolean);
  }
  
  public void registerSegment(int paramInt, String paramString) {
    jniRegisterSegment(paramInt, paramString);
  }
  
  public void removeBridgeIdleDebugListener(NotThreadSafeBridgeIdleDebugListener paramNotThreadSafeBridgeIdleDebugListener) {
    this.mBridgeIdleListeners.remove(paramNotThreadSafeBridgeIdleDebugListener);
  }
  
  public void runJSBundle() {
    a.a("ReactNative", "CatalystInstanceImpl.runJSBundle()");
    a.a(this.mJSBundleHasLoaded ^ true, "JS bundle was already loaded!");
    this.mJSBundleLoader.loadScript(this);
    synchronized (this.mJSCallsPendingInitLock) {
      this.mAcceptCalls = true;
      Iterator<PendingJSCall> iterator = this.mJSCallsPendingInit.iterator();
      while (iterator.hasNext())
        ((PendingJSCall)iterator.next()).call(this); 
      this.mJSCallsPendingInit.clear();
      this.mJSBundleHasLoaded = true;
      a.a(this.mTraceListener);
      return;
    } 
  }
  
  public native void setGlobalVariable(String paramString1, String paramString2);
  
  public void setSourceURLs(String paramString1, String paramString2) {
    this.mSourceURL = paramString1;
    jniSetSourceURL(paramString2);
  }
  
  public void setTurboModuleManager(JSIModule paramJSIModule) {
    this.mTurboModuleRegistry = (TurboModuleRegistry)paramJSIModule;
    this.mTurboModuleManagerJSIModule = paramJSIModule;
  }
  
  static {
    ReactBridge.staticInit();
  }
  
  private static class BridgeCallback implements ReactCallback {
    private final WeakReference<CatalystInstanceImpl> mOuter;
    
    BridgeCallback(CatalystInstanceImpl param1CatalystInstanceImpl) {
      this.mOuter = new WeakReference<CatalystInstanceImpl>(param1CatalystInstanceImpl);
    }
    
    public void decrementPendingJSCalls() {
      CatalystInstanceImpl catalystInstanceImpl = this.mOuter.get();
      if (catalystInstanceImpl != null)
        catalystInstanceImpl.decrementPendingJSCalls(); 
    }
    
    public void incrementPendingJSCalls() {
      CatalystInstanceImpl catalystInstanceImpl = this.mOuter.get();
      if (catalystInstanceImpl != null)
        catalystInstanceImpl.incrementPendingJSCalls(); 
    }
    
    public void onBatchComplete() {
      CatalystInstanceImpl catalystInstanceImpl = this.mOuter.get();
      if (catalystInstanceImpl != null)
        catalystInstanceImpl.mNativeModuleRegistry.onBatchComplete(); 
    }
  }
  
  public static class Builder {
    private JSBundleLoader mJSBundleLoader;
    
    private JavaScriptExecutor mJSExecutor;
    
    private NativeModuleCallExceptionHandler mNativeModuleCallExceptionHandler;
    
    private ReactQueueConfigurationSpec mReactQueueConfigurationSpec;
    
    private NativeModuleRegistry mRegistry;
    
    public CatalystInstanceImpl build() {
      ReactQueueConfigurationSpec reactQueueConfigurationSpec = this.mReactQueueConfigurationSpec;
      a.a(reactQueueConfigurationSpec);
      reactQueueConfigurationSpec = reactQueueConfigurationSpec;
      JavaScriptExecutor javaScriptExecutor = this.mJSExecutor;
      a.a(javaScriptExecutor);
      javaScriptExecutor = javaScriptExecutor;
      NativeModuleRegistry nativeModuleRegistry = this.mRegistry;
      a.a(nativeModuleRegistry);
      nativeModuleRegistry = nativeModuleRegistry;
      JSBundleLoader jSBundleLoader = this.mJSBundleLoader;
      a.a(jSBundleLoader);
      jSBundleLoader = jSBundleLoader;
      NativeModuleCallExceptionHandler nativeModuleCallExceptionHandler = this.mNativeModuleCallExceptionHandler;
      a.a(nativeModuleCallExceptionHandler);
      return new CatalystInstanceImpl(reactQueueConfigurationSpec, javaScriptExecutor, nativeModuleRegistry, jSBundleLoader, nativeModuleCallExceptionHandler);
    }
    
    public Builder setJSBundleLoader(JSBundleLoader param1JSBundleLoader) {
      this.mJSBundleLoader = param1JSBundleLoader;
      return this;
    }
    
    public Builder setJSExecutor(JavaScriptExecutor param1JavaScriptExecutor) {
      this.mJSExecutor = param1JavaScriptExecutor;
      return this;
    }
    
    public Builder setNativeModuleCallExceptionHandler(NativeModuleCallExceptionHandler param1NativeModuleCallExceptionHandler) {
      this.mNativeModuleCallExceptionHandler = param1NativeModuleCallExceptionHandler;
      return this;
    }
    
    public Builder setReactQueueConfigurationSpec(ReactQueueConfigurationSpec param1ReactQueueConfigurationSpec) {
      this.mReactQueueConfigurationSpec = param1ReactQueueConfigurationSpec;
      return this;
    }
    
    public Builder setRegistry(NativeModuleRegistry param1NativeModuleRegistry) {
      this.mRegistry = param1NativeModuleRegistry;
      return this;
    }
  }
  
  private static class JSProfilerTraceListener implements TraceListener {
    private final WeakReference<CatalystInstanceImpl> mOuter;
    
    public JSProfilerTraceListener(CatalystInstanceImpl param1CatalystInstanceImpl) {
      this.mOuter = new WeakReference<CatalystInstanceImpl>(param1CatalystInstanceImpl);
    }
    
    public void onTraceStarted() {
      CatalystInstanceImpl catalystInstanceImpl = this.mOuter.get();
      if (catalystInstanceImpl != null)
        ((Systrace)catalystInstanceImpl.<Systrace>getJSModule(Systrace.class)).setEnabled(true); 
    }
    
    public void onTraceStopped() {
      CatalystInstanceImpl catalystInstanceImpl = this.mOuter.get();
      if (catalystInstanceImpl != null)
        ((Systrace)catalystInstanceImpl.<Systrace>getJSModule(Systrace.class)).setEnabled(false); 
    }
  }
  
  private class NativeExceptionHandler implements QueueThreadExceptionHandler {
    private NativeExceptionHandler() {}
    
    public void handleException(Exception param1Exception) {
      CatalystInstanceImpl.this.onNativeException(param1Exception);
    }
  }
  
  public static class PendingJSCall {
    public NativeArray mArguments;
    
    public String mMethod;
    
    public String mModule;
    
    public PendingJSCall(String param1String1, String param1String2, NativeArray param1NativeArray) {
      this.mModule = param1String1;
      this.mMethod = param1String2;
      this.mArguments = param1NativeArray;
    }
    
    void call(CatalystInstanceImpl param1CatalystInstanceImpl) {
      NativeArray nativeArray = this.mArguments;
      if (nativeArray == null)
        nativeArray = new WritableNativeArray(); 
      param1CatalystInstanceImpl.jniCallJSFunction(this.mModule, this.mMethod, nativeArray);
    }
    
    public String toString() {
      String str;
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(this.mModule);
      stringBuilder.append(".");
      stringBuilder.append(this.mMethod);
      stringBuilder.append("(");
      NativeArray nativeArray = this.mArguments;
      if (nativeArray == null) {
        str = "";
      } else {
        str = str.toString();
      } 
      stringBuilder.append(str);
      stringBuilder.append(")");
      return stringBuilder.toString();
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/bridge/CatalystInstanceImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */