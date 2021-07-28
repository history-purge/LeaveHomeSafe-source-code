package com.facebook.react.bridge;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.facebook.react.bridge.queue.MessageQueueThread;
import com.facebook.react.bridge.queue.ReactQueueConfiguration;
import com.facebook.react.common.LifecycleState;
import e.e.e.e.a;
import e.e.m.a.a;
import e.e.o.b0.a;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArraySet;

public class ReactContext extends ContextWrapper {
  private static final String EARLY_JS_ACCESS_EXCEPTION_MESSAGE = "Tried to access a JS module before the React instance was fully set up. Calls to ReactContext#getJSModule should only happen once initialize() has been called on your native module.";
  
  private static final String EARLY_NATIVE_MODULE_EXCEPTION_MESSAGE = "Trying to call native module before CatalystInstance has been set!";
  
  private static final String LATE_JS_ACCESS_EXCEPTION_MESSAGE = "Tried to access a JS module after the React instance was destroyed.";
  
  private static final String LATE_NATIVE_MODULE_EXCEPTION_MESSAGE = "Trying to call native module after CatalystInstance has been destroyed!";
  
  private static final String TAG = "ReactContext";
  
  private final CopyOnWriteArraySet<ActivityEventListener> mActivityEventListeners = new CopyOnWriteArraySet<ActivityEventListener>();
  
  private CatalystInstance mCatalystInstance;
  
  private WeakReference<Activity> mCurrentActivity;
  
  private volatile boolean mDestroyed = false;
  
  private NativeModuleCallExceptionHandler mExceptionHandlerWrapper;
  
  private LayoutInflater mInflater;
  
  private MessageQueueThread mJSMessageQueueThread;
  
  private final CopyOnWriteArraySet<LifecycleEventListener> mLifecycleEventListeners = new CopyOnWriteArraySet<LifecycleEventListener>();
  
  private LifecycleState mLifecycleState = LifecycleState.c;
  
  private NativeModuleCallExceptionHandler mNativeModuleCallExceptionHandler;
  
  private MessageQueueThread mNativeModulesMessageQueueThread;
  
  private MessageQueueThread mUiMessageQueueThread;
  
  private final CopyOnWriteArraySet<WindowFocusChangeListener> mWindowFocusEventListeners = new CopyOnWriteArraySet<WindowFocusChangeListener>();
  
  public ReactContext(Context paramContext) {
    super(paramContext);
  }
  
  private void raiseCatalystInstanceMissingException() {
    String str;
    if (this.mDestroyed) {
      str = "Trying to call native module after CatalystInstance has been destroyed!";
    } else {
      str = "Trying to call native module before CatalystInstance has been set!";
    } 
    throw new IllegalStateException(str);
  }
  
  public void addActivityEventListener(ActivityEventListener paramActivityEventListener) {
    this.mActivityEventListeners.add(paramActivityEventListener);
  }
  
  public void addLifecycleEventListener(final LifecycleEventListener listener) {
    this.mLifecycleEventListeners.add(listener);
    if (hasActiveCatalystInstance()) {
      int i = null.$SwitchMap$com$facebook$react$common$LifecycleState[this.mLifecycleState.ordinal()];
      if (i != 1 && i != 2) {
        if (i == 3) {
          runOnUiQueueThread(new Runnable() {
                public void run() {
                  if (!ReactContext.this.mLifecycleEventListeners.contains(listener))
                    return; 
                  try {
                    listener.onHostResume();
                    return;
                  } catch (RuntimeException runtimeException) {
                    ReactContext.this.handleException(runtimeException);
                    return;
                  } 
                }
              });
          return;
        } 
        throw new IllegalStateException("Unhandled lifecycle state.");
      } 
    } 
  }
  
  public void addWindowFocusChangeListener(WindowFocusChangeListener paramWindowFocusChangeListener) {
    this.mWindowFocusEventListeners.add(paramWindowFocusChangeListener);
  }
  
  public void assertOnJSQueueThread() {
    MessageQueueThread messageQueueThread = this.mJSMessageQueueThread;
    a.a(messageQueueThread);
    messageQueueThread.assertIsOnThread();
  }
  
  public void assertOnNativeModulesQueueThread() {
    MessageQueueThread messageQueueThread = this.mNativeModulesMessageQueueThread;
    a.a(messageQueueThread);
    messageQueueThread.assertIsOnThread();
  }
  
  public void assertOnNativeModulesQueueThread(String paramString) {
    MessageQueueThread messageQueueThread = this.mNativeModulesMessageQueueThread;
    a.a(messageQueueThread);
    messageQueueThread.assertIsOnThread(paramString);
  }
  
  public void assertOnUiQueueThread() {
    MessageQueueThread messageQueueThread = this.mUiMessageQueueThread;
    a.a(messageQueueThread);
    messageQueueThread.assertIsOnThread();
  }
  
  public void destroy() {
    UiThreadUtil.assertOnUiThread();
    this.mDestroyed = true;
    CatalystInstance catalystInstance = this.mCatalystInstance;
    if (catalystInstance != null) {
      catalystInstance.destroy();
      if (a.e)
        this.mCatalystInstance = null; 
    } 
  }
  
  public CatalystInstance getCatalystInstance() {
    CatalystInstance catalystInstance = this.mCatalystInstance;
    a.a(catalystInstance);
    return catalystInstance;
  }
  
  public Activity getCurrentActivity() {
    WeakReference<Activity> weakReference = this.mCurrentActivity;
    return (weakReference == null) ? null : weakReference.get();
  }
  
  public NativeModuleCallExceptionHandler getExceptionHandler() {
    if (this.mExceptionHandlerWrapper == null)
      this.mExceptionHandlerWrapper = new ExceptionHandlerWrapper(); 
    return this.mExceptionHandlerWrapper;
  }
  
  public JSIModule getJSIModule(JSIModuleType paramJSIModuleType) {
    if (hasActiveCatalystInstance())
      return this.mCatalystInstance.getJSIModule(paramJSIModuleType); 
    throw new IllegalStateException("Unable to retrieve a JSIModule if CatalystInstance is not active.");
  }
  
  public <T extends JavaScriptModule> T getJSModule(Class<T> paramClass) {
    CatalystInstance catalystInstance = this.mCatalystInstance;
    if (catalystInstance == null) {
      if (this.mDestroyed)
        throw new IllegalStateException("Tried to access a JS module after the React instance was destroyed."); 
      throw new IllegalStateException("Tried to access a JS module before the React instance was fully set up. Calls to ReactContext#getJSModule should only happen once initialize() has been called on your native module.");
    } 
    return catalystInstance.getJSModule(paramClass);
  }
  
  public JavaScriptContextHolder getJavaScriptContextHolder() {
    return this.mCatalystInstance.getJavaScriptContextHolder();
  }
  
  public LifecycleState getLifecycleState() {
    return this.mLifecycleState;
  }
  
  public <T extends NativeModule> T getNativeModule(Class<T> paramClass) {
    if (this.mCatalystInstance == null)
      raiseCatalystInstanceMissingException(); 
    return this.mCatalystInstance.getNativeModule(paramClass);
  }
  
  public String getSourceURL() {
    return this.mCatalystInstance.getSourceURL();
  }
  
  public Object getSystemService(String paramString) {
    if ("layout_inflater".equals(paramString)) {
      if (this.mInflater == null)
        this.mInflater = LayoutInflater.from(getBaseContext()).cloneInContext((Context)this); 
      return this.mInflater;
    } 
    return getBaseContext().getSystemService(paramString);
  }
  
  public void handleException(Exception paramException) {
    boolean bool1;
    boolean bool2;
    CatalystInstance catalystInstance = this.mCatalystInstance;
    boolean bool3 = false;
    if (catalystInstance != null) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    if (bool2 && !this.mCatalystInstance.isDestroyed()) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    if (this.mNativeModuleCallExceptionHandler != null)
      bool3 = true; 
    if (bool1 && bool3) {
      this.mNativeModuleCallExceptionHandler.handleException(paramException);
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Unable to handle Exception - catalystInstanceVariableExists: ");
    stringBuilder.append(bool2);
    stringBuilder.append(" - isCatalystInstanceAlive: ");
    stringBuilder.append(bool1 ^ true);
    stringBuilder.append(" - hasExceptionHandler: ");
    stringBuilder.append(bool3);
    a.b("ReactNative", stringBuilder.toString(), paramException);
    throw new IllegalStateException(paramException);
  }
  
  public boolean hasActiveCatalystInstance() {
    CatalystInstance catalystInstance = this.mCatalystInstance;
    return (catalystInstance != null && !catalystInstance.isDestroyed());
  }
  
  public boolean hasCatalystInstance() {
    return (this.mCatalystInstance != null);
  }
  
  public boolean hasCurrentActivity() {
    WeakReference<Activity> weakReference = this.mCurrentActivity;
    return (weakReference != null && weakReference.get() != null);
  }
  
  public <T extends NativeModule> boolean hasNativeModule(Class<T> paramClass) {
    if (this.mCatalystInstance == null)
      raiseCatalystInstanceMissingException(); 
    return this.mCatalystInstance.hasNativeModule(paramClass);
  }
  
  public void initializeMessageQueueThreads(ReactQueueConfiguration paramReactQueueConfiguration) {
    if (this.mUiMessageQueueThread == null && this.mNativeModulesMessageQueueThread == null && this.mJSMessageQueueThread == null) {
      this.mUiMessageQueueThread = paramReactQueueConfiguration.getUIQueueThread();
      this.mNativeModulesMessageQueueThread = paramReactQueueConfiguration.getNativeModulesQueueThread();
      this.mJSMessageQueueThread = paramReactQueueConfiguration.getJSQueueThread();
      return;
    } 
    throw new IllegalStateException("Message queue threads already initialized");
  }
  
  public void initializeWithInstance(CatalystInstance paramCatalystInstance) {
    if (paramCatalystInstance != null) {
      if (this.mCatalystInstance == null) {
        if (this.mDestroyed)
          ReactSoftException.logSoftException("ReactContext", new IllegalStateException("Cannot initialize ReactContext after it has been destroyed.")); 
        this.mCatalystInstance = paramCatalystInstance;
        initializeMessageQueueThreads(paramCatalystInstance.getReactQueueConfiguration());
        return;
      } 
      throw new IllegalStateException("ReactContext has been already initialized");
    } 
    throw new IllegalArgumentException("CatalystInstance cannot be null.");
  }
  
  public boolean isBridgeless() {
    return false;
  }
  
  public boolean isOnJSQueueThread() {
    MessageQueueThread messageQueueThread = this.mJSMessageQueueThread;
    a.a(messageQueueThread);
    return messageQueueThread.isOnThread();
  }
  
  public boolean isOnNativeModulesQueueThread() {
    MessageQueueThread messageQueueThread = this.mNativeModulesMessageQueueThread;
    a.a(messageQueueThread);
    return messageQueueThread.isOnThread();
  }
  
  public boolean isOnUiQueueThread() {
    MessageQueueThread messageQueueThread = this.mUiMessageQueueThread;
    a.a(messageQueueThread);
    return messageQueueThread.isOnThread();
  }
  
  public void onActivityResult(Activity paramActivity, int paramInt1, int paramInt2, Intent paramIntent) {
    for (ActivityEventListener activityEventListener : this.mActivityEventListeners) {
      try {
        activityEventListener.onActivityResult(paramActivity, paramInt1, paramInt2, paramIntent);
      } catch (RuntimeException runtimeException) {
        handleException(runtimeException);
      } 
    } 
  }
  
  public void onHostDestroy() {
    UiThreadUtil.assertOnUiThread();
    this.mLifecycleState = LifecycleState.c;
    for (LifecycleEventListener lifecycleEventListener : this.mLifecycleEventListeners) {
      try {
        lifecycleEventListener.onHostDestroy();
      } catch (RuntimeException runtimeException) {
        handleException(runtimeException);
      } 
    } 
    this.mCurrentActivity = null;
  }
  
  public void onHostPause() {
    this.mLifecycleState = LifecycleState.d;
    ReactMarker.logMarker(ReactMarkerConstants.ON_HOST_PAUSE_START);
    for (LifecycleEventListener lifecycleEventListener : this.mLifecycleEventListeners) {
      try {
        lifecycleEventListener.onHostPause();
      } catch (RuntimeException runtimeException) {
        handleException(runtimeException);
      } 
    } 
    ReactMarker.logMarker(ReactMarkerConstants.ON_HOST_PAUSE_END);
  }
  
  public void onHostResume(Activity paramActivity) {
    this.mLifecycleState = LifecycleState.e;
    this.mCurrentActivity = new WeakReference<Activity>(paramActivity);
    ReactMarker.logMarker(ReactMarkerConstants.ON_HOST_RESUME_START);
    for (LifecycleEventListener lifecycleEventListener : this.mLifecycleEventListeners) {
      try {
        lifecycleEventListener.onHostResume();
      } catch (RuntimeException runtimeException) {
        handleException(runtimeException);
      } 
    } 
    ReactMarker.logMarker(ReactMarkerConstants.ON_HOST_RESUME_END);
  }
  
  public void onNewIntent(Activity paramActivity, Intent paramIntent) {
    UiThreadUtil.assertOnUiThread();
    this.mCurrentActivity = new WeakReference<Activity>(paramActivity);
    for (ActivityEventListener activityEventListener : this.mActivityEventListeners) {
      try {
        activityEventListener.onNewIntent(paramIntent);
      } catch (RuntimeException runtimeException) {
        handleException(runtimeException);
      } 
    } 
  }
  
  public void onWindowFocusChange(boolean paramBoolean) {
    UiThreadUtil.assertOnUiThread();
    for (WindowFocusChangeListener windowFocusChangeListener : this.mWindowFocusEventListeners) {
      try {
        windowFocusChangeListener.onWindowFocusChange(paramBoolean);
      } catch (RuntimeException runtimeException) {
        handleException(runtimeException);
      } 
    } 
  }
  
  public void removeActivityEventListener(ActivityEventListener paramActivityEventListener) {
    this.mActivityEventListeners.remove(paramActivityEventListener);
  }
  
  public void removeLifecycleEventListener(LifecycleEventListener paramLifecycleEventListener) {
    this.mLifecycleEventListeners.remove(paramLifecycleEventListener);
  }
  
  public void removeWindowFocusChangeListener(WindowFocusChangeListener paramWindowFocusChangeListener) {
    this.mWindowFocusEventListeners.remove(paramWindowFocusChangeListener);
  }
  
  public void resetPerfStats() {
    MessageQueueThread messageQueueThread = this.mNativeModulesMessageQueueThread;
    if (messageQueueThread != null)
      messageQueueThread.resetPerfStats(); 
    messageQueueThread = this.mJSMessageQueueThread;
    if (messageQueueThread != null)
      messageQueueThread.resetPerfStats(); 
  }
  
  public void runOnJSQueueThread(Runnable paramRunnable) {
    MessageQueueThread messageQueueThread = this.mJSMessageQueueThread;
    a.a(messageQueueThread);
    messageQueueThread.runOnQueue(paramRunnable);
  }
  
  public void runOnNativeModulesQueueThread(Runnable paramRunnable) {
    MessageQueueThread messageQueueThread = this.mNativeModulesMessageQueueThread;
    a.a(messageQueueThread);
    messageQueueThread.runOnQueue(paramRunnable);
  }
  
  public void runOnUiQueueThread(Runnable paramRunnable) {
    MessageQueueThread messageQueueThread = this.mUiMessageQueueThread;
    a.a(messageQueueThread);
    messageQueueThread.runOnQueue(paramRunnable);
  }
  
  public void setNativeModuleCallExceptionHandler(NativeModuleCallExceptionHandler paramNativeModuleCallExceptionHandler) {
    this.mNativeModuleCallExceptionHandler = paramNativeModuleCallExceptionHandler;
  }
  
  public boolean startActivityForResult(Intent paramIntent, int paramInt, Bundle paramBundle) {
    Activity activity = getCurrentActivity();
    a.a(activity);
    activity.startActivityForResult(paramIntent, paramInt, paramBundle);
    return true;
  }
  
  public class ExceptionHandlerWrapper implements NativeModuleCallExceptionHandler {
    public void handleException(Exception param1Exception) {
      ReactContext.this.handleException(param1Exception);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/bridge/ReactContext.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */