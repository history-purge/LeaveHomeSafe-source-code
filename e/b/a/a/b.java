package e.b.a.a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import java.util.List;

class b extends a {
  private int a = 0;
  
  private final Context b;
  
  private e.f.a.d.a.a c;
  
  private ServiceConnection d;
  
  public b(Context paramContext) {
    this.b = paramContext.getApplicationContext();
  }
  
  private boolean d() {
    PackageManager packageManager = this.b.getPackageManager();
    try {
      int i = (packageManager.getPackageInfo("com.android.vending", 128)).versionCode;
      return (i >= 80837300);
    } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {
      return false;
    } 
  }
  
  public void a() {
    this.a = 3;
    if (this.d != null) {
      e.b.a.b.a.a("InstallReferrerClient", "Unbinding from service.");
      this.b.unbindService(this.d);
      this.d = null;
    } 
    this.c = null;
  }
  
  public void a(c paramc) {
    if (!c()) {
      int i = this.a;
      if (i == 1) {
        e.b.a.b.a.b("InstallReferrerClient", "Client is already in the process of connecting to the service.");
        paramc.a(3);
        return;
      } 
      if (i != 3) {
        e.b.a.b.a.a("InstallReferrerClient", "Starting install referrer service setup.");
        Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        List<ResolveInfo> list = this.b.getPackageManager().queryIntentServices(intent, 0);
        if (list != null && !list.isEmpty()) {
          ResolveInfo resolveInfo = list.get(0);
          ServiceInfo serviceInfo = resolveInfo.serviceInfo;
          if (serviceInfo != null) {
            String str2 = serviceInfo.packageName;
            String str1 = resolveInfo.serviceInfo.name;
            if ("com.android.vending".equals(str2) && str1 != null && d()) {
              intent = new Intent(intent);
              this.d = new b(paramc, null);
              if (this.b.bindService(intent, this.d, 1)) {
                e.b.a.b.a.a("InstallReferrerClient", "Service was bonded successfully.");
                return;
              } 
              e.b.a.b.a.b("InstallReferrerClient", "Connection to service is blocked.");
              this.a = 0;
              paramc.a(1);
              return;
            } 
            e.b.a.b.a.b("InstallReferrerClient", "Play Store missing or incompatible. Version 8.3.73 or later required.");
            this.a = 0;
            paramc.a(2);
            return;
          } 
        } 
        this.a = 0;
        e.b.a.b.a.a("InstallReferrerClient", "Install Referrer service unavailable on device.");
        paramc.a(2);
        return;
      } 
      e.b.a.b.a.b("InstallReferrerClient", "Client was already closed and can't be reused. Please create another instance.");
      paramc.a(3);
      return;
    } 
    e.b.a.b.a.a("InstallReferrerClient", "Service connection is valid. No need to re-initialize.");
    paramc.a(0);
  }
  
  public d b() {
    if (c()) {
      Bundle bundle = new Bundle();
      bundle.putString("package_name", this.b.getPackageName());
      try {
        return new d(this.c.b(bundle));
      } catch (RemoteException remoteException) {
        e.b.a.b.a.b("InstallReferrerClient", "RemoteException getting install referrer information");
        this.a = 0;
        throw remoteException;
      } 
    } 
    throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
  }
  
  public boolean c() {
    return (this.a == 2 && this.c != null && this.d != null);
  }
  
  private final class b implements ServiceConnection {
    private final c a;
    
    private b(b this$0, c param1c) {
      if (param1c != null) {
        this.a = param1c;
        return;
      } 
      throw new RuntimeException("Please specify a listener to know when setup is done.");
    }
    
    public void onServiceConnected(ComponentName param1ComponentName, IBinder param1IBinder) {
      e.b.a.b.a.a("InstallReferrerClient", "Install Referrer service connected.");
      b.a(this.b, e.f.a.d.a.a.a.a(param1IBinder));
      b.a(this.b, 2);
      this.a.a(0);
    }
    
    public void onServiceDisconnected(ComponentName param1ComponentName) {
      e.b.a.b.a.b("InstallReferrerClient", "Install Referrer service disconnected.");
      b.a(this.b, (e.f.a.d.a.a)null);
      b.a(this.b, 0);
      this.a.a();
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/b/a/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */