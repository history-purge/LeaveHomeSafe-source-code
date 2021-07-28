package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

final class c {
  protected static final Class<?> a;
  
  protected static final Field b;
  
  protected static final Field c;
  
  protected static final Method d;
  
  protected static final Method e;
  
  protected static final Method f;
  
  private static final Handler g = new Handler(Looper.getMainLooper());
  
  static {
    a = a();
    b = b();
    c = c();
    d = b(a);
    e = a(a);
    f = c(a);
  }
  
  private static Class<?> a() {
    try {
      return Class.forName("android.app.ActivityThread");
    } finally {
      Exception exception = null;
    } 
  }
  
  private static Method a(Class<?> paramClass) {
    if (paramClass == null)
      return null; 
    try {
      Method method = paramClass.getDeclaredMethod("performStopActivity", new Class[] { IBinder.class, boolean.class });
      return method;
    } finally {
      paramClass = null;
    } 
  }
  
  static boolean a(Activity paramActivity) {
    if (Build.VERSION.SDK_INT >= 28) {
      paramActivity.recreate();
      return true;
    } 
    if (d() && f == null)
      return false; 
    if (e == null && d == null)
      return false; 
    try {
      Object object1 = c.get(paramActivity);
      if (object1 == null)
        return false; 
      Object object2 = b.get(paramActivity);
      if (object2 == null)
        return false; 
      Application application = paramActivity.getApplication();
      d d = new d(paramActivity);
      application.registerActivityLifecycleCallbacks(d);
      g.post(new a(d, object1));
    } finally {
      paramActivity = null;
    } 
  }
  
  protected static boolean a(Object paramObject, Activity paramActivity) {
    try {
      Object object = c.get(paramActivity);
      if (object != paramObject)
        return false; 
      return true;
    } finally {
      paramObject = null;
      Log.e("ActivityRecreator", "Exception while fetching field values", (Throwable)paramObject);
    } 
  }
  
  private static Field b() {
    try {
      Field field = Activity.class.getDeclaredField("mMainThread");
      return field;
    } finally {
      Exception exception = null;
    } 
  }
  
  private static Method b(Class<?> paramClass) {
    if (paramClass == null)
      return null; 
    try {
      Method method = paramClass.getDeclaredMethod("performStopActivity", new Class[] { IBinder.class, boolean.class, String.class });
      return method;
    } finally {
      paramClass = null;
    } 
  }
  
  private static Field c() {
    try {
      Field field = Activity.class.getDeclaredField("mToken");
      return field;
    } finally {
      Exception exception = null;
    } 
  }
  
  private static Method c(Class<?> paramClass) {
    if (d()) {
      if (paramClass == null)
        return null; 
      try {
        Method method = paramClass.getDeclaredMethod("requestRelaunchActivity", new Class[] { IBinder.class, List.class, List.class, int.class, boolean.class, Configuration.class, Configuration.class, boolean.class, boolean.class });
        return method;
      } finally {
        paramClass = null;
      } 
    } 
    return null;
  }
  
  private static boolean d() {
    int i = Build.VERSION.SDK_INT;
    return (i == 26 || i == 27);
  }
  
  class a implements Runnable {
    a(c this$0, Object param1Object) {}
    
    public void run() {
      this.c.c = this.d;
    }
  }
  
  class b implements Runnable {
    b(c this$0, c.d param1d) {}
    
    public void run() {
      this.c.unregisterActivityLifecycleCallbacks(this.d);
    }
  }
  
  class c implements Runnable {
    c(c this$0, Object param1Object1) {}
    
    public void run() {
      try {
        return;
      } catch (RuntimeException runtimeException) {
        return;
      } finally {
        Exception exception = null;
        Log.e("ActivityRecreator", "Exception while invoking performStopActivity", exception);
      } 
    }
  }
  
  private static final class d implements Application.ActivityLifecycleCallbacks {
    Object c;
    
    private Activity d;
    
    private boolean e = false;
    
    private boolean f = false;
    
    private boolean g = false;
    
    d(Activity param1Activity) {
      this.d = param1Activity;
    }
    
    public void onActivityCreated(Activity param1Activity, Bundle param1Bundle) {}
    
    public void onActivityDestroyed(Activity param1Activity) {
      if (this.d == param1Activity) {
        this.d = null;
        this.f = true;
      } 
    }
    
    public void onActivityPaused(Activity param1Activity) {
      if (this.f && !this.g && !this.e && c.a(this.c, param1Activity)) {
        this.g = true;
        this.c = null;
      } 
    }
    
    public void onActivityResumed(Activity param1Activity) {}
    
    public void onActivitySaveInstanceState(Activity param1Activity, Bundle param1Bundle) {}
    
    public void onActivityStarted(Activity param1Activity) {
      if (this.d == param1Activity)
        this.e = true; 
    }
    
    public void onActivityStopped(Activity param1Activity) {}
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/core/app/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */