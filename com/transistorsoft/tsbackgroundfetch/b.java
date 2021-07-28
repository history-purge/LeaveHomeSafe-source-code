package com.transistorsoft.tsbackgroundfetch;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class b {
  private static b d;
  
  private static ExecutorService e;
  
  private static Handler f;
  
  private Context a;
  
  private c b;
  
  private final Map<String, c> c = new HashMap<String, c>();
  
  private b(Context paramContext) {
    this.a = paramContext;
  }
  
  public static b a(Context paramContext) {
    if (d == null)
      d = b(paramContext.getApplicationContext()); 
    return d;
  }
  
  private static b b(Context paramContext) {
    // Byte code:
    //   0: ldc com/transistorsoft/tsbackgroundfetch/b
    //   2: monitorenter
    //   3: getstatic com/transistorsoft/tsbackgroundfetch/b.d : Lcom/transistorsoft/tsbackgroundfetch/b;
    //   6: ifnonnull -> 23
    //   9: new com/transistorsoft/tsbackgroundfetch/b
    //   12: dup
    //   13: aload_0
    //   14: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   17: invokespecial <init> : (Landroid/content/Context;)V
    //   20: putstatic com/transistorsoft/tsbackgroundfetch/b.d : Lcom/transistorsoft/tsbackgroundfetch/b;
    //   23: getstatic com/transistorsoft/tsbackgroundfetch/b.d : Lcom/transistorsoft/tsbackgroundfetch/b;
    //   26: astore_0
    //   27: ldc com/transistorsoft/tsbackgroundfetch/b
    //   29: monitorexit
    //   30: aload_0
    //   31: areturn
    //   32: astore_0
    //   33: ldc com/transistorsoft/tsbackgroundfetch/b
    //   35: monitorexit
    //   36: aload_0
    //   37: athrow
    // Exception table:
    //   from	to	target	type
    //   3	23	32	finally
    //   23	27	32	finally
  }
  
  private void b(a parama) {
    c c1;
    c c2 = b(parama.c());
    if (c2 == null) {
      a.a(this.a, parama.c(), parama.b());
      return;
    } 
    if (b().booleanValue()) {
      c1 = this.b;
      if (c1 != null) {
        c1.a(parama.c());
        return;
      } 
    } else {
      if (c1.m()) {
        Log.d("TSBackgroundFetch", "- Stopping on terminate");
      } else {
        if (c1.d() != null)
          try {
            parama.a(this.a, (c)c1);
            return;
          } catch (b b1) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Headless task error: ");
            stringBuilder.append(b1.getMessage());
            Log.e("TSBackgroundFetch", stringBuilder.toString());
            b1.printStackTrace();
            return;
          }  
        Log.w("TSBackgroundFetch", "- BackgroundFetch event has occurred while app is terminated but there's no jobService configured to handle the event.  BackgroundFetch will terminate.");
        a(b1.c());
      } 
      d(b1.c());
      return;
    } 
  }
  
  public static ExecutorService e() {
    if (e == null)
      e = Executors.newCachedThreadPool(); 
    return e;
  }
  
  private void e(String paramString) {
    StringBuilder stringBuilder1;
    StringBuilder stringBuilder2 = new StringBuilder();
    stringBuilder2.append("- registerTask: ");
    stringBuilder2.append(paramString);
    Log.d("TSBackgroundFetch", stringBuilder2.toString());
    c c1 = b(paramString);
    if (c1 == null) {
      stringBuilder1 = new StringBuilder();
      stringBuilder1.append("- registerTask failed to find BackgroundFetchConfig for taskId ");
      stringBuilder1.append(paramString);
      Log.e("TSBackgroundFetch", stringBuilder1.toString());
      return;
    } 
    stringBuilder1.b(this.a);
    a.b(this.a, (c)stringBuilder1);
  }
  
  public static Handler f() {
    if (f == null)
      f = new Handler(Looper.getMainLooper()); 
    return f;
  }
  
  c a() {
    return this.b;
  }
  
  void a(a parama) {
    a.a(parama);
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("- Background Fetch event received: ");
    stringBuilder.append(parama.c());
    Log.d("TSBackgroundFetch", stringBuilder.toString());
    synchronized (this.c) {
      if (this.c.isEmpty()) {
        c.a(this.a, new b(this, parama));
        return;
      } 
      b(parama);
      return;
    } 
  }
  
  public void a(c paramc) {
    synchronized (this.c) {
      this.c.containsKey(paramc.n());
      paramc.b(this.a);
      this.c.put(paramc.n(), paramc);
      e(paramc.n());
      return;
    } 
  }
  
  public void a(c paramc, c paramc1) {
    Log.d("TSBackgroundFetch", "- configure");
    this.b = paramc1;
    synchronized (this.c) {
      this.c.put(paramc.n(), paramc);
      c(paramc.n());
      return;
    } 
  }
  
  public void a(String paramString) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("- finish: ");
    stringBuilder.append(paramString);
    Log.d("TSBackgroundFetch", stringBuilder.toString());
    a a = a.b(paramString);
    if (a != null)
      a.a(); 
    c c1 = b(paramString);
    if (c1 != null && !c1.f()) {
      c1.a(this.a);
      synchronized (this.c) {
        this.c.remove(paramString);
        return;
      } 
    } 
  }
  
  c b(String paramString) {
    synchronized (this.c) {
      if (this.c.containsKey(paramString))
        return this.c.get(paramString); 
    } 
    paramString = null;
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=SYNTHETIC_LOCAL_VARIABLE_2} */
    return (c)paramString;
  }
  
  public Boolean b() {
    Boolean bool = Boolean.valueOf(false);
    Context context = this.a;
    if (context != null) {
      if (this.b == null)
        return bool; 
      ActivityManager activityManager = (ActivityManager)context.getSystemService("activity");
      try {
        Boolean bool1;
        Iterator<ActivityManager.RunningTaskInfo> iterator = activityManager.getRunningTasks(2147483647).iterator();
        while (true) {
          bool1 = bool;
          if (iterator.hasNext()) {
            ActivityManager.RunningTaskInfo runningTaskInfo = iterator.next();
            if (this.a.getPackageName().equalsIgnoreCase(runningTaskInfo.baseActivity.getPackageName())) {
              bool1 = Boolean.valueOf(true);
              break;
            } 
            continue;
          } 
          break;
        } 
        return bool1;
      } catch (SecurityException securityException) {
        Log.w("TSBackgroundFetch", "TSBackgroundFetch attempted to determine if MainActivity is active but was stopped due to a missing permission.  Please add the permission 'android.permission.GET_TASKS' to your AndroidManifest.  See Installation steps for more information");
        throw securityException;
      } 
    } 
    return bool;
  }
  
  void c() {
    c.a(this.a, new a(this));
  }
  
  @TargetApi(21)
  public void c(String paramString) {
    Log.d("TSBackgroundFetch", "- start");
    if (a.b(paramString) != null) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("[TSBackgroundFetch start] Task ");
      stringBuilder.append(paramString);
      stringBuilder.append(" already registered");
      Log.e("TSBackgroundFetch", stringBuilder.toString());
      return;
    } 
    e(paramString);
  }
  
  public int d() {
    return 2;
  }
  
  public void d(String paramString) {
    String str = "- stop";
    if (paramString != null) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("- stop");
      stringBuilder.append(": ");
      stringBuilder.append(paramString);
      str = stringBuilder.toString();
    } 
    Log.d("TSBackgroundFetch", str);
    if (paramString == null)
      synchronized (this.c) {
        for (c c2 : this.c.values()) {
          a a1 = a.b(c2.n());
          if (a1 != null) {
            a1.a();
            a.c(c2.n());
          } 
          a.a(this.a, c2.n(), c2.c());
          c2.a(this.a);
        } 
        a.e();
        return;
      }  
    a a = a.b(paramString);
    if (a != null) {
      a.a();
      a.c(a.c());
    } 
    c c1 = b(paramString);
    if (c1 != null) {
      c1.a(this.a);
      a.a(this.a, c1.n(), c1.c());
    } 
  }
  
  class a implements c.c {
    a(b this$0) {}
    
    public void a(List<c> param1List) {
      for (c c1 : param1List) {
        if (!c1.l() || c1.m()) {
          c1.a(b.a(this.a));
          continue;
        } 
        synchronized (b.b(this.a)) {
          b.b(this.a).put(c1.n(), c1);
          if (Build.VERSION.SDK_INT < 22 || c1.b()) {
            if (c1.o()) {
              this.a.c(c1.n());
              continue;
            } 
            this.a.a(c1);
          } 
        } 
      } 
    }
  }
  
  class b implements c.c {
    b(b this$0, a param1a) {}
    
    public void a(List<c> param1List) {
      synchronized (b.b(this.b)) {
        for (c c1 : param1List)
          b.b(this.b).put(c1.n(), c1); 
        b.a(this.b, this.a);
        return;
      } 
    }
  }
  
  public static interface c {
    void a(String param1String);
    
    void b(String param1String);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/transistorsoft/tsbackgroundfetch/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */