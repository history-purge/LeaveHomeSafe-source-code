package net.time4j.android;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import net.time4j.android.spi.AndroidResourceLoader;
import net.time4j.c1.d;
import net.time4j.e1.a0.c;
import net.time4j.e1.e;
import net.time4j.f0;
import net.time4j.o0;
import net.time4j.tz.k;
import net.time4j.tz.l;

public class ApplicationStarter {
  private static final AtomicBoolean a = new AtomicBoolean(false);
  
  private static final AtomicBoolean b = new AtomicBoolean(false);
  
  public static void a(Context paramContext) {
    if (paramContext != null && !b.getAndSet(true)) {
      System.setProperty("net.time4j.allow.system.tz.override", "true");
      paramContext.registerReceiver(new b(null), new IntentFilter("android.intent.action.TIMEZONE_CHANGED"));
    } 
  }
  
  public static void a(Context paramContext, a parama) {
    if (!a.getAndSet(true)) {
      System.setProperty("net.time4j.base.ResourceLoader", "net.time4j.android.spi.AndroidResourceLoader");
      ((AndroidResourceLoader)d.c()).a(paramContext, parama);
    } 
  }
  
  public static void a(Context paramContext, boolean paramBoolean) {
    long l = System.nanoTime();
    a(paramContext, (a)null);
    a(paramContext.getApplicationContext());
    f0 f0 = f0.b(2019, 1, 2);
    StringBuilder stringBuilder2 = new StringBuilder();
    stringBuilder2.append("Starting Time4A (v4.2-2018i published on ");
    stringBuilder2.append(f0);
    stringBuilder2.append(")");
    Log.i("TIME4A", stringBuilder2.toString());
    if (paramBoolean) {
      a a = new a(System.nanoTime());
      Executors.defaultThreadFactory().newThread(a).start();
    } 
    l = (System.nanoTime() - l) / 1000000L;
    StringBuilder stringBuilder1 = new StringBuilder();
    stringBuilder1.append("Main-Thread consumed in ms: ");
    stringBuilder1.append(l);
    Log.i("TIME4A", stringBuilder1.toString());
  }
  
  static final class a implements Runnable {
    a(long param1Long) {}
    
    public void run() {
      StringBuilder stringBuilder1;
      e e = e.d;
      k k = l.r().d();
      Locale locale = Locale.getDefault();
      StringBuilder stringBuilder2 = new StringBuilder();
      stringBuilder2.append("System time zone at start: [");
      stringBuilder2.append(k.a());
      stringBuilder2.append("]");
      Log.i("TIME4A", stringBuilder2.toString());
      stringBuilder2 = new StringBuilder();
      stringBuilder2.append("System locale at start: [");
      stringBuilder2.append(locale.toString());
      stringBuilder2.append("]");
      Log.i("TIME4A", stringBuilder2.toString());
      try {
        Log.i("TIME4A", c.a(e, e, locale, k).a(o0.c()));
        long l = (System.nanoTime() - this.c) / 1000000L;
        stringBuilder1 = new StringBuilder();
        stringBuilder1.append("Prefetch thread consumed (in ms): ");
        stringBuilder1.append(l);
        Log.i("TIME4A", stringBuilder1.toString());
        return;
      } catch (RuntimeException runtimeException) {
        stringBuilder2 = new StringBuilder();
        stringBuilder2.append("Error on prefetch thread with: time zone=");
        stringBuilder2.append(stringBuilder1.a());
        stringBuilder2.append(", locale=");
        stringBuilder2.append(locale);
        stringBuilder2.append("!");
        Log.e("TIME4A", stringBuilder2.toString(), runtimeException);
        throw runtimeException;
      } 
    }
  }
  
  private static class b extends BroadcastReceiver {
    private b() {}
    
    public void onReceive(Context param1Context, Intent param1Intent) {
      l.b.a();
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Event ACTION_TIMEZONE_CHANGED received, system timezone changed to: [");
      stringBuilder.append(l.r().d().a());
      stringBuilder.append("]. Original tz-id reported by Android: [");
      stringBuilder.append(param1Intent.getStringExtra("time-zone"));
      stringBuilder.append("]");
      Log.i("TIME4A", stringBuilder.toString());
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/android/ApplicationStarter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */