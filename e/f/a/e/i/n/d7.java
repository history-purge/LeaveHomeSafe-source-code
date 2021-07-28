package e.f.a.e.i.n;

import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import e.f.a.e.n.c;

public abstract class d7<T> {
  private final Context a;
  
  private final Object b = new Object();
  
  private final String c;
  
  private final String d;
  
  private final String e;
  
  private boolean f = false;
  
  private boolean g = false;
  
  private T h;
  
  public d7(Context paramContext, String paramString1, String paramString2) {
    this.a = paramContext;
    this.c = paramString1;
    String str = String.valueOf(paramString2);
    if (str.length() != 0) {
      str = "com.google.android.gms.vision.dynamite.".concat(str);
    } else {
      str = new String("com.google.android.gms.vision.dynamite.");
    } 
    this.d = str;
    this.e = paramString2;
  }
  
  protected abstract T a(DynamiteModule paramDynamiteModule, Context paramContext);
  
  protected abstract void a();
  
  public final boolean b() {
    return (d() != null);
  }
  
  public final void c() {
    synchronized (this.b) {
      if (this.h == null)
        return; 
      try {
        a();
      } catch (RemoteException remoteException) {
        Log.e(this.c, "Could not finalize native handle", (Throwable)remoteException);
      } 
      return;
    } 
  }
  
  protected final T d() {
    synchronized (this.b) {
      DynamiteModule.a a1;
      if (this.h != null)
        return this.h; 
      DynamiteModule.a a2 = null;
      try {
        DynamiteModule dynamiteModule = DynamiteModule.a(this.a, DynamiteModule.j, this.d);
      } catch (com.google.android.gms.dynamite.DynamiteModule.a null) {
        String str = String.format("%s.%s", new Object[] { "com.google.android.gms.vision", this.e });
        c.a("Cannot load thick client module, fall back to load optional module %s", new Object[] { str });
        try {
          DynamiteModule dynamiteModule = DynamiteModule.a(this.a, DynamiteModule.i, str);
        } catch (com.google.android.gms.dynamite.DynamiteModule.a a) {
          c.a((Throwable)a, "Error loading optional module %s", new Object[] { str });
          a = a2;
          if (!this.f) {
            c.a("Broadcasting download intent for dependency %s", new Object[] { this.e });
            String str1 = this.e;
            Intent intent = new Intent();
            intent.setClassName("com.google.android.gms", "com.google.android.gms.vision.DependencyBroadcastReceiverProxy");
            intent.putExtra("com.google.android.gms.vision.DEPENDENCIES", str1);
            intent.setAction("com.google.android.gms.vision.DEPENDENCY");
            this.a.sendBroadcast(intent);
            this.f = true;
            a1 = a2;
          } 
        } 
      } 
      if (a1 != null)
        try {
          this.h = a((DynamiteModule)a1, this.a);
        } catch (com.google.android.gms.dynamite.DynamiteModule.a a) {
          Log.e(this.c, "Error creating remote native handle", (Throwable)a);
        } catch (RemoteException remoteException) {} 
      if (!this.g && this.h == null) {
        Log.w(this.c, "Native handle not yet available. Reverting to no-op handle.");
        this.g = true;
      } else if (this.g && this.h != null) {
        Log.w(this.c, "Native handle is now available.");
      } 
      return this.h;
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/n/d7.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */