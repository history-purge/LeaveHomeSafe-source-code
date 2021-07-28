package e.f.a.e.e.m;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.common.util.d;
import java.util.concurrent.ConcurrentHashMap;

public class a {
  private static final Object b = new Object();
  
  private static volatile a c;
  
  private ConcurrentHashMap<ServiceConnection, ServiceConnection> a = new ConcurrentHashMap<ServiceConnection, ServiceConnection>();
  
  @RecentlyNonNull
  public static a a() {
    if (c == null)
      synchronized (b) {
        if (c == null)
          c = new a(); 
      }  
    a a1 = c;
    q.a(a1);
    return a1;
  }
  
  @SuppressLint({"UntrackedBindService"})
  private final boolean a(Context paramContext, String paramString, Intent paramIntent, ServiceConnection paramServiceConnection, int paramInt, boolean paramBoolean) {
    ComponentName componentName = paramIntent.getComponent();
    if (componentName == null) {
      paramBoolean = false;
    } else {
      paramBoolean = d.a(paramContext, componentName.getPackageName());
    } 
    if (paramBoolean) {
      Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
      return false;
    } 
    if (a(paramServiceConnection)) {
      ServiceConnection serviceConnection = this.a.putIfAbsent(paramServiceConnection, paramServiceConnection);
      if (serviceConnection != null && paramServiceConnection != serviceConnection)
        Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", new Object[] { paramServiceConnection, paramString, paramIntent.getAction() })); 
      try {
        boolean bool = paramContext.bindService(paramIntent, paramServiceConnection, paramInt);
        paramBoolean = bool;
      } finally {
        this.a.remove(paramServiceConnection, paramServiceConnection);
      } 
    } else {
      paramBoolean = paramContext.bindService(paramIntent, paramServiceConnection, paramInt);
    } 
    return paramBoolean;
  }
  
  private static boolean a(ServiceConnection paramServiceConnection) {
    return !(paramServiceConnection instanceof com.google.android.gms.common.internal.s0);
  }
  
  @SuppressLint({"UntrackedBindService"})
  public void a(@RecentlyNonNull Context paramContext, @RecentlyNonNull ServiceConnection paramServiceConnection) {
    if (a(paramServiceConnection) && this.a.containsKey(paramServiceConnection))
      try {
        ServiceConnection serviceConnection = this.a.get(paramServiceConnection);
        try {
          paramContext.unbindService(serviceConnection);
        } catch (IllegalArgumentException|IllegalStateException illegalArgumentException) {}
        return;
      } finally {
        this.a.remove(paramServiceConnection);
      }  
    try {
      paramContext.unbindService(paramServiceConnection);
      return;
    } catch (IllegalArgumentException|IllegalStateException illegalArgumentException) {
      return;
    } 
  }
  
  @RecentlyNonNull
  public boolean a(@RecentlyNonNull Context paramContext, @RecentlyNonNull Intent paramIntent, @RecentlyNonNull ServiceConnection paramServiceConnection, @RecentlyNonNull int paramInt) {
    return a(paramContext, paramContext.getClass().getName(), paramIntent, paramServiceConnection, paramInt);
  }
  
  @RecentlyNonNull
  public final boolean a(@RecentlyNonNull Context paramContext, @RecentlyNonNull String paramString, @RecentlyNonNull Intent paramIntent, @RecentlyNonNull ServiceConnection paramServiceConnection, @RecentlyNonNull int paramInt) {
    return a(paramContext, paramString, paramIntent, paramServiceConnection, paramInt, true);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/e/m/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */