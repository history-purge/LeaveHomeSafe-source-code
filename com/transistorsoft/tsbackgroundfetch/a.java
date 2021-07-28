package com.transistorsoft.tsbackgroundfetch;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PersistableBundle;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class a {
  static int f = 60000;
  
  private static final List<a> g = new ArrayList<a>();
  
  private FetchJobService.b a;
  
  private String b;
  
  private int c;
  
  private Runnable d;
  
  private boolean e = false;
  
  a(Context paramContext, String paramString, FetchJobService.b paramb, int paramInt) {
    this.b = paramString;
    this.a = paramb;
    this.c = paramInt;
    this.d = new a(this, paramContext);
    b.f().postDelayed(this.d, f);
  }
  
  static PendingIntent a(Context paramContext, String paramString) {
    Intent intent = new Intent(paramContext, FetchAlarmReceiver.class);
    intent.setAction(paramString);
    return PendingIntent.getBroadcast(paramContext, 0, intent, 134217728);
  }
  
  static void a(Context paramContext, String paramString, int paramInt) {
    JobScheduler jobScheduler;
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("- cancel taskId=");
    stringBuilder.append(paramString);
    stringBuilder.append(", jobId=");
    stringBuilder.append(paramInt);
    Log.i("TSBackgroundFetch", stringBuilder.toString());
    if (Build.VERSION.SDK_INT >= 21 && paramInt != 0) {
      jobScheduler = (JobScheduler)paramContext.getSystemService("jobscheduler");
      if (jobScheduler != null) {
        jobScheduler.cancel(paramInt);
        return;
      } 
    } else {
      AlarmManager alarmManager = (AlarmManager)jobScheduler.getSystemService("alarm");
      if (alarmManager != null)
        alarmManager.cancel(a((Context)jobScheduler, paramString)); 
    } 
  }
  
  static void a(a parama) {
    synchronized (g) {
      g.add(parama);
      return;
    } 
  }
  
  static a b(String paramString) {
    synchronized (g) {
      for (a a1 : g) {
        if (a1.a(paramString))
          return a1; 
      } 
      return null;
    } 
  }
  
  static void b(Context paramContext, c paramc) {
    JobInfo.Builder builder;
    long l;
    Log.d("TSBackgroundFetch", paramc.toString());
    if (paramc.o()) {
      l = TimeUnit.MINUTES.toMillis(paramc.e());
    } else {
      l = paramc.a();
    } 
    int i = Build.VERSION.SDK_INT;
    boolean bool = false;
    if (i >= 21 && !paramc.b()) {
      JobScheduler jobScheduler = (JobScheduler)paramContext.getSystemService("jobscheduler");
      builder = (new JobInfo.Builder(paramc.c(), new ComponentName(paramContext, FetchJobService.class))).setRequiredNetworkType(paramc.g()).setRequiresDeviceIdle(paramc.j()).setRequiresCharging(paramc.i());
      boolean bool1 = bool;
      if (paramc.l()) {
        bool1 = bool;
        if (!paramc.m())
          bool1 = true; 
      } 
      builder = builder.setPersisted(bool1);
      if (paramc.f()) {
        if (Build.VERSION.SDK_INT >= 24) {
          builder.setPeriodic(l, l);
        } else {
          builder.setPeriodic(l);
        } 
      } else {
        builder.setMinimumLatency(l);
      } 
      PersistableBundle persistableBundle = new PersistableBundle();
      persistableBundle.putString("taskId", paramc.n());
      builder.setExtras(persistableBundle);
      if (Build.VERSION.SDK_INT >= 26) {
        builder.setRequiresStorageNotLow(paramc.k());
        builder.setRequiresBatteryNotLow(paramc.h());
      } 
      if (jobScheduler != null) {
        jobScheduler.schedule(builder.build());
        return;
      } 
    } else {
      AlarmManager alarmManager = (AlarmManager)builder.getSystemService("alarm");
      if (alarmManager != null) {
        PendingIntent pendingIntent = a((Context)builder, paramc.n());
        long l1 = System.currentTimeMillis() + l;
        if (paramc.f()) {
          alarmManager.setRepeating(0, l1, l, pendingIntent);
          return;
        } 
        i = Build.VERSION.SDK_INT;
        if (i >= 23) {
          alarmManager.setExactAndAllowWhileIdle(0, l1, pendingIntent);
          return;
        } 
        if (i >= 19) {
          alarmManager.setExact(0, l1, pendingIntent);
          return;
        } 
        alarmManager.set(0, l1, pendingIntent);
      } 
    } 
  }
  
  static void c(String paramString) {
    // Byte code:
    //   0: getstatic com/transistorsoft/tsbackgroundfetch/a.g : Ljava/util/List;
    //   3: astore_3
    //   4: aload_3
    //   5: monitorenter
    //   6: aconst_null
    //   7: astore_2
    //   8: getstatic com/transistorsoft/tsbackgroundfetch/a.g : Ljava/util/List;
    //   11: invokeinterface iterator : ()Ljava/util/Iterator;
    //   16: astore #4
    //   18: aload_2
    //   19: astore_1
    //   20: aload #4
    //   22: invokeinterface hasNext : ()Z
    //   27: ifeq -> 49
    //   30: aload #4
    //   32: invokeinterface next : ()Ljava/lang/Object;
    //   37: checkcast com/transistorsoft/tsbackgroundfetch/a
    //   40: astore_1
    //   41: aload_1
    //   42: aload_0
    //   43: invokevirtual a : (Ljava/lang/String;)Z
    //   46: ifeq -> 18
    //   49: aload_1
    //   50: ifnull -> 63
    //   53: getstatic com/transistorsoft/tsbackgroundfetch/a.g : Ljava/util/List;
    //   56: aload_1
    //   57: invokeinterface remove : (Ljava/lang/Object;)Z
    //   62: pop
    //   63: aload_3
    //   64: monitorexit
    //   65: return
    //   66: astore_0
    //   67: aload_3
    //   68: monitorexit
    //   69: goto -> 74
    //   72: aload_0
    //   73: athrow
    //   74: goto -> 72
    // Exception table:
    //   from	to	target	type
    //   8	18	66	finally
    //   20	49	66	finally
    //   53	63	66	finally
    //   63	65	66	finally
    //   67	69	66	finally
  }
  
  static void e() {
    synchronized (g) {
      g.clear();
      return;
    } 
  }
  
  void a() {
    FetchJobService.b b1 = this.a;
    if (b1 != null)
      b1.finish(); 
    if (this.d != null)
      b.f().removeCallbacks(this.d); 
    this.a = null;
    c(this.b);
  }
  
  void a(Context paramContext) {
    b.c c;
    this.e = true;
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("[BGTask] timeout: ");
    stringBuilder.append(this.b);
    Log.d("TSBackgroundFetch", stringBuilder.toString());
    b b1 = b.a(paramContext);
    if (b1.b().booleanValue()) {
      c = b1.a();
      if (c != null) {
        c.b(this.b);
        return;
      } 
    } else {
      c c1 = b1.b(this.b);
      if (c1 != null) {
        if (c1.d() != null) {
          a((Context)c, c1);
          return;
        } 
      } else {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("[BGTask] failed to load config for taskId: ");
        stringBuilder1.append(this.b);
        Log.e("TSBackgroundFetch", stringBuilder1.toString());
      } 
      b1.a(this.b);
    } 
  }
  
  void a(Context paramContext, c paramc) {
    try {
      Class<?> clazz = Class.forName(paramc.d());
      Class[] arrayOfClass = new Class[2];
      arrayOfClass[0] = Context.class;
      arrayOfClass[1] = a.class;
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = paramContext;
      arrayOfObject[1] = this;
      try {
        clazz.getDeclaredConstructor(arrayOfClass).newInstance(arrayOfObject);
        return;
      } catch (NoSuchMethodException noSuchMethodException) {
        noSuchMethodException = clazz.getConstructor(new Class[0]).newInstance(new Object[0]);
        noSuchMethodException.getClass().getDeclaredMethod("onFetch", arrayOfClass).invoke(noSuchMethodException, arrayOfObject);
      } 
      return;
    } catch (ClassNotFoundException classNotFoundException) {
      throw new b(classNotFoundException.getMessage());
    } catch (NoSuchMethodException noSuchMethodException) {
      throw new b(noSuchMethodException.getMessage());
    } catch (IllegalAccessException illegalAccessException) {
      throw new b(illegalAccessException.getMessage());
    } catch (InstantiationException instantiationException) {
      throw new b(instantiationException.getMessage());
    } catch (InvocationTargetException invocationTargetException) {
      throw new b(invocationTargetException.getMessage());
    } 
  }
  
  boolean a(String paramString) {
    String str = this.b;
    return (str != null && str.equalsIgnoreCase(paramString));
  }
  
  int b() {
    return this.c;
  }
  
  public String c() {
    return this.b;
  }
  
  public boolean d() {
    return this.e;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("[BGTask taskId=");
    stringBuilder.append(this.b);
    stringBuilder.append("]");
    return stringBuilder.toString();
  }
  
  class a implements Runnable {
    a(a this$0, Context param1Context) {}
    
    public void run() {
      this.d.a(this.c);
    }
  }
  
  static class b extends RuntimeException {
    public b(String param1String) {
      super(param1String);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/transistorsoft/tsbackgroundfetch/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */