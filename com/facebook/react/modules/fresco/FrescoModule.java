package com.facebook.react.modules.fresco;

import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.modules.network.a;
import com.facebook.react.modules.network.c;
import com.facebook.react.modules.network.g;
import com.facebook.react.turbomodule.core.interfaces.a;
import e.e.e.e.a;
import e.e.j.a.a.c;
import e.e.l.b.a.a;
import e.e.l.f.i;
import e.e.l.n.f0;
import e.e.o.d0.a.a;
import e.e.o.e0.a.a;
import java.net.CookieHandler;
import java.util.HashSet;
import okhttp3.CookieJar;
import okhttp3.JavaNetCookieJar;
import okhttp3.OkHttpClient;

@a(name = "FrescoModule", needsEagerInit = true)
public class FrescoModule extends ReactContextBaseJavaModule implements a, LifecycleEventListener, a {
  public static final String NAME = "FrescoModule";
  
  private static boolean sHasBeenInitialized = false;
  
  private final boolean mClearOnDestroy;
  
  private i mConfig;
  
  public FrescoModule(ReactApplicationContext paramReactApplicationContext) {
    this(paramReactApplicationContext, true, null);
  }
  
  public FrescoModule(ReactApplicationContext paramReactApplicationContext, boolean paramBoolean) {
    this(paramReactApplicationContext, paramBoolean, null);
  }
  
  public FrescoModule(ReactApplicationContext paramReactApplicationContext, boolean paramBoolean, i parami) {
    super(paramReactApplicationContext);
    this.mClearOnDestroy = paramBoolean;
    this.mConfig = parami;
  }
  
  private static i getDefaultConfig(ReactContext paramReactContext) {
    return getDefaultConfigBuilder(paramReactContext).a();
  }
  
  public static i.b getDefaultConfigBuilder(ReactContext paramReactContext) {
    HashSet<c> hashSet = new HashSet();
    hashSet.add(new c());
    OkHttpClient okHttpClient = g.a();
    ((a)okHttpClient.cookieJar()).a((CookieJar)new JavaNetCookieJar((CookieHandler)new c(paramReactContext)));
    i.b b = a.a(paramReactContext.getApplicationContext(), okHttpClient);
    b.a((f0)new b(okHttpClient));
    b.a(false);
    b.a(hashSet);
    return b;
  }
  
  public static boolean hasBeenInitialized() {
    return sHasBeenInitialized;
  }
  
  public void clearSensitiveData() {
    c.a().a();
  }
  
  public String getName() {
    return "FrescoModule";
  }
  
  public void initialize() {
    super.initialize();
    getReactApplicationContext().addLifecycleEventListener(this);
    if (!hasBeenInitialized()) {
      if (this.mConfig == null)
        this.mConfig = getDefaultConfig((ReactContext)getReactApplicationContext()); 
      c.a(getReactApplicationContext().getApplicationContext(), this.mConfig);
      sHasBeenInitialized = true;
    } else if (this.mConfig != null) {
      a.e("ReactNative", "Fresco has already been initialized with a different config. The new Fresco configuration will be ignored!");
    } 
    this.mConfig = null;
  }
  
  public void onHostDestroy() {
    if (hasBeenInitialized() && this.mClearOnDestroy)
      c.a().c(); 
  }
  
  public void onHostPause() {}
  
  public void onHostResume() {}
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/modules/fresco/FrescoModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */