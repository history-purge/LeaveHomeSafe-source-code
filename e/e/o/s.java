package e.e.o;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.facebook.hermes.reactexecutor.a;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.JSIModulePackage;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.NativeModuleCallExceptionHandler;
import com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.devsupport.f;
import com.facebook.react.devsupport.h.a;
import com.facebook.react.jscexecutor.a;
import com.facebook.react.modules.core.b;
import com.facebook.react.modules.systeminfo.a;
import com.facebook.react.uimanager.p0;
import com.facebook.soloader.SoLoader;
import e.e.m.a.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class s {
  private final List<v> a = new ArrayList<v>();
  
  private String b;
  
  private JSBundleLoader c;
  
  private String d;
  
  private NotThreadSafeBridgeIdleDebugListener e;
  
  private Application f;
  
  private boolean g;
  
  private LifecycleState h;
  
  private p0 i;
  
  private NativeModuleCallExceptionHandler j;
  
  private Activity k;
  
  private b l;
  
  private f m;
  
  private boolean n;
  
  private a o;
  
  private JavaScriptExecutorFactory p;
  
  private int q = 1;
  
  private int r = -1;
  
  private JSIModulePackage s;
  
  private Map<String, Object> t;
  
  private JavaScriptExecutorFactory a(String paramString1, String paramString2, Context paramContext) {
    try {
      r.a(paramContext);
      SoLoader.a("jscexecutor");
      return (JavaScriptExecutorFactory)new a(paramString1, paramString2);
    } catch (UnsatisfiedLinkError unsatisfiedLinkError) {
      if (!unsatisfiedLinkError.getMessage().contains("__cxa_bad_typeid"))
        try {
          return (JavaScriptExecutorFactory)new a();
        } catch (UnsatisfiedLinkError unsatisfiedLinkError1) {
          unsatisfiedLinkError1.printStackTrace();
          throw unsatisfiedLinkError;
        }  
      throw unsatisfiedLinkError;
    } 
  }
  
  public r a() {
    a.a(this.f, "Application property has not been set with this builder");
    if (this.h == LifecycleState.e)
      a.a(this.k, "Activity needs to be set if initial lifecycle state is resumed"); 
    boolean bool = this.g;
    boolean bool1 = true;
    if (bool || this.b != null || this.c != null) {
      bool = true;
    } else {
      bool = false;
    } 
    a.a(bool, "JS Bundle File or Asset URL has to be provided when dev support is disabled");
    bool = bool1;
    if (this.d == null) {
      bool = bool1;
      if (this.b == null)
        if (this.c != null) {
          bool = bool1;
        } else {
          bool = false;
        }  
    } 
    a.a(bool, "Either MainModulePath or JS Bundle File needs to be provided");
    if (this.i == null)
      this.i = new p0(); 
    String str1 = this.f.getPackageName();
    String str2 = a.a();
    Application application = this.f;
    Activity activity = this.k;
    b b1 = this.l;
    JavaScriptExecutorFactory javaScriptExecutorFactory = this.p;
    if (javaScriptExecutorFactory == null)
      javaScriptExecutorFactory = a(str1, str2, application.getApplicationContext()); 
    if (this.c == null) {
      str1 = this.b;
      if (str1 != null) {
        JSBundleLoader jSBundleLoader1 = JSBundleLoader.createAssetLoader((Context)this.f, str1, false);
        str2 = this.d;
        List<v> list1 = this.a;
        bool = this.g;
        NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener1 = this.e;
        LifecycleState lifecycleState1 = this.h;
        a.a(lifecycleState1, "Initial lifecycle state was not set");
        return new r((Context)application, activity, b1, javaScriptExecutorFactory, jSBundleLoader1, str2, list1, bool, notThreadSafeBridgeIdleDebugListener1, lifecycleState1, this.i, this.j, this.m, this.n, this.o, this.q, this.r, this.s, this.t);
      } 
    } 
    JSBundleLoader jSBundleLoader = this.c;
    str2 = this.d;
    List<v> list = this.a;
    bool = this.g;
    NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener = this.e;
    LifecycleState lifecycleState = this.h;
    a.a(lifecycleState, "Initial lifecycle state was not set");
    return new r((Context)application, activity, b1, javaScriptExecutorFactory, jSBundleLoader, str2, list, bool, notThreadSafeBridgeIdleDebugListener, lifecycleState, this.i, this.j, this.m, this.n, this.o, this.q, this.r, this.s, this.t);
  }
  
  public s a(Application paramApplication) {
    this.f = paramApplication;
    return this;
  }
  
  public s a(JSBundleLoader paramJSBundleLoader) {
    this.c = paramJSBundleLoader;
    this.b = null;
    return this;
  }
  
  public s a(JSIModulePackage paramJSIModulePackage) {
    this.s = paramJSIModulePackage;
    return this;
  }
  
  public s a(JavaScriptExecutorFactory paramJavaScriptExecutorFactory) {
    this.p = paramJavaScriptExecutorFactory;
    return this;
  }
  
  public s a(LifecycleState paramLifecycleState) {
    this.h = paramLifecycleState;
    return this;
  }
  
  public s a(f paramf) {
    this.m = paramf;
    return this;
  }
  
  public s a(p0 paramp0) {
    this.i = paramp0;
    return this;
  }
  
  public s a(v paramv) {
    this.a.add(paramv);
    return this;
  }
  
  public s a(String paramString) {
    if (paramString == null) {
      paramString = null;
    } else {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("assets://");
      stringBuilder.append(paramString);
      paramString = stringBuilder.toString();
    } 
    this.b = paramString;
    this.c = null;
    return this;
  }
  
  public s a(boolean paramBoolean) {
    this.g = paramBoolean;
    return this;
  }
  
  public s b(String paramString) {
    if (paramString.startsWith("assets://")) {
      this.b = paramString;
      this.c = null;
      return this;
    } 
    a(JSBundleLoader.createFileLoader(paramString));
    return this;
  }
  
  public s c(String paramString) {
    this.d = paramString;
    return this;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/o/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */