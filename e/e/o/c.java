package e.e.o;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.PowerManager;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import e.e.o.c0.a;
import e.e.o.c0.b;
import e.e.o.c0.c;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public abstract class c extends Service implements c {
  private static PowerManager.WakeLock d;
  
  private final Set<Integer> c = new CopyOnWriteArraySet<Integer>();
  
  @SuppressLint({"WakelockTimeout"})
  public static void a(Context paramContext) {
    PowerManager.WakeLock wakeLock = d;
    if (wakeLock == null || !wakeLock.isHeld()) {
      PowerManager powerManager = (PowerManager)paramContext.getSystemService("power");
      e.e.m.a.a.a(powerManager);
      d = powerManager.newWakeLock(1, c.class.getCanonicalName());
      d.setReferenceCounted(false);
      d.acquire();
    } 
  }
  
  private void a(ReactContext paramReactContext, a parama) {
    b b = b.a(paramReactContext);
    b.a(this);
    UiThreadUtil.runOnUiThread(new b(this, b, parama));
  }
  
  protected a a(Intent paramIntent) {
    return null;
  }
  
  protected u a() {
    return ((p)getApplication()).a();
  }
  
  protected void a(a parama) {
    UiThreadUtil.assertOnUiThread();
    a((Context)this);
    r r = a().h();
    ReactContext reactContext = r.b();
    if (reactContext == null) {
      r.a(new a(this, parama, r));
      r.a();
      return;
    } 
    a(reactContext, parama);
  }
  
  public IBinder onBind(Intent paramIntent) {
    return null;
  }
  
  public void onDestroy() {
    super.onDestroy();
    if (a().l()) {
      ReactContext reactContext = a().h().b();
      if (reactContext != null)
        b.a(reactContext).b(this); 
    } 
    PowerManager.WakeLock wakeLock = d;
    if (wakeLock != null)
      wakeLock.release(); 
  }
  
  public void onHeadlessJsTaskFinish(int paramInt) {
    this.c.remove(Integer.valueOf(paramInt));
    if (this.c.size() == 0)
      stopSelf(); 
  }
  
  public void onHeadlessJsTaskStart(int paramInt) {}
  
  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2) {
    a a = a(paramIntent);
    if (a != null) {
      a(a);
      return 3;
    } 
    return 2;
  }
  
  class a implements r.k {
    a(c this$0, a param1a, r param1r) {}
    
    public void a(ReactContext param1ReactContext) {
      c.a(this.c, param1ReactContext, this.a);
      this.b.b(this);
    }
  }
  
  class b implements Runnable {
    b(c this$0, b param1b, a param1a) {}
    
    public void run() {
      int i = this.c.a(this.d);
      c.a(this.e).add(Integer.valueOf(i));
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/o/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */