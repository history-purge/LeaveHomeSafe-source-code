package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class c<T extends IInterface> {
  private static final e.f.a.e.e.c[] v = new e.f.a.e.e.c[0];
  
  private volatile String a = null;
  
  private t0 b;
  
  private final Context c;
  
  private final h d;
  
  final Handler e;
  
  private final Object f = new Object();
  
  private final Object g = new Object();
  
  private m h;
  
  @RecentlyNonNull
  protected c i;
  
  private T j;
  
  private final ArrayList<h<?>> k = new ArrayList<h<?>>();
  
  private i l;
  
  private int m = 1;
  
  private final a n;
  
  private final b o;
  
  private final int p;
  
  private final String q;
  
  private e.f.a.e.e.a r = null;
  
  private boolean s = false;
  
  private volatile k0 t = null;
  
  @RecentlyNonNull
  protected AtomicInteger u = new AtomicInteger(0);
  
  protected c(@RecentlyNonNull Context paramContext, @RecentlyNonNull Looper paramLooper, @RecentlyNonNull h paramh, @RecentlyNonNull e.f.a.e.e.e parame, @RecentlyNonNull int paramInt, a parama, b paramb, String paramString) {
    q.a(paramContext, "Context must not be null");
    this.c = paramContext;
    q.a(paramLooper, "Looper must not be null");
    Looper looper = paramLooper;
    q.a(paramh, "Supervisor must not be null");
    this.d = paramh;
    q.a(parame, "API availability must not be null");
    e.f.a.e.e.e e1 = parame;
    this.e = (Handler)new g(this, paramLooper);
    this.p = paramInt;
    this.n = parama;
    this.o = paramb;
    this.q = paramString;
  }
  
  private final String B() {
    String str2 = this.q;
    String str1 = str2;
    if (str2 == null)
      str1 = this.c.getClass().getName(); 
    return str1;
  }
  
  private final boolean C() {
    synchronized (this.f) {
      if (this.m == 3)
        return true; 
    } 
    boolean bool = false;
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=SYNTHETIC_LOCAL_VARIABLE_2} */
    return bool;
  }
  
  private final boolean D() {
    if (this.s)
      return false; 
    if (TextUtils.isEmpty(v()))
      return false; 
    if (TextUtils.isEmpty(s()))
      return false; 
    try {
      Class.forName(v());
      return true;
    } catch (ClassNotFoundException classNotFoundException) {
      return false;
    } 
  }
  
  private final void a(int paramInt, T paramT) {
    boolean bool1;
    boolean bool2;
    boolean bool3 = false;
    if (paramInt == 4) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    if (paramT != null) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    if (bool1 == bool2)
      bool3 = true; 
    q.a(bool3);
    synchronized (this.f) {
      this.m = paramInt;
      this.j = paramT;
      if (paramInt != 1) {
        if (paramInt != 2 && paramInt != 3) {
          if (paramInt == 4) {
            q.a(paramT);
            a(paramT);
          } 
        } else {
          t0 t01;
          i i1 = this.l;
          if (i1 != null && this.b != null) {
            String str4 = this.b.a();
            String str5 = this.b.b();
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str4).length() + 70 + String.valueOf(str5).length());
            stringBuilder.append("Calling connect() while still connected, missing disconnect() for ");
            stringBuilder.append(str4);
            stringBuilder.append(" on ");
            stringBuilder.append(str5);
            Log.e("GmsClient", stringBuilder.toString());
            h h2 = this.d;
            str5 = this.b.a();
            q.a(str5);
            h2.a(str5, this.b.b(), this.b.c(), i1, B(), this.b.d());
            this.u.incrementAndGet();
          } 
          i i2 = new i(this, this.u.get());
          this.l = i2;
          if (this.m == 3 && s() != null) {
            t01 = new t0(q().getPackageName(), s(), true, h.a(), false);
          } else {
            t01 = new t0(x(), w(), false, h.a(), y());
          } 
          this.b = t01;
          if (this.b.d() && d() < 17895000) {
            String str = String.valueOf(this.b.a());
            if (str.length() != 0) {
              str = "Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(str);
            } else {
              str = new String("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ");
            } 
            throw new IllegalStateException(str);
          } 
          h h1 = this.d;
          String str1 = this.b.a();
          q.a(str1);
          str1 = str1;
          String str2 = this.b.b();
          paramInt = this.b.c();
          String str3 = B();
          if (!h1.a(new h.a(str1, str2, paramInt, this.b.d()), i2, str3)) {
            String str4 = this.b.a();
            String str5 = this.b.b();
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str4).length() + 34 + String.valueOf(str5).length());
            stringBuilder.append("unable to connect to service: ");
            stringBuilder.append(str4);
            stringBuilder.append(" on ");
            stringBuilder.append(str5);
            Log.e("GmsClient", stringBuilder.toString());
            a(16, (Bundle)null, this.u.get());
          } 
        } 
      } else {
        i i1 = this.l;
        if (i1 != null) {
          h h1 = this.d;
          String str = this.b.a();
          q.a(str);
          h1.a(str, this.b.b(), this.b.c(), i1, B(), this.b.d());
          this.l = null;
        } 
      } 
      return;
    } 
  }
  
  private final void a(k0 paramk0) {
    this.t = paramk0;
  }
  
  private final boolean a(int paramInt1, int paramInt2, T paramT) {
    synchronized (this.f) {
      if (this.m != paramInt1)
        return false; 
      a(paramInt2, paramT);
      return true;
    } 
  }
  
  private final void c(int paramInt) {
    if (C()) {
      paramInt = 5;
      this.s = true;
    } else {
      paramInt = 4;
    } 
    Handler handler = this.e;
    handler.sendMessage(handler.obtainMessage(paramInt, this.u.get(), 16));
  }
  
  @RecentlyNonNull
  public boolean A() {
    return false;
  }
  
  @RecentlyNullable
  protected abstract T a(@RecentlyNonNull IBinder paramIBinder);
  
  protected void a(@RecentlyNonNull int paramInt) {
    System.currentTimeMillis();
  }
  
  protected final void a(@RecentlyNonNull int paramInt1, Bundle paramBundle, @RecentlyNonNull int paramInt2) {
    Handler handler = this.e;
    handler.sendMessage(handler.obtainMessage(7, paramInt2, -1, new l(this, paramInt1, null)));
  }
  
  protected void a(@RecentlyNonNull int paramInt1, IBinder paramIBinder, Bundle paramBundle, @RecentlyNonNull int paramInt2) {
    Handler handler = this.e;
    handler.sendMessage(handler.obtainMessage(1, paramInt2, -1, new k(this, paramInt1, paramIBinder, paramBundle)));
  }
  
  protected void a(@RecentlyNonNull T paramT) {
    System.currentTimeMillis();
  }
  
  public void a(@RecentlyNonNull c paramc) {
    q.a(paramc, "Connection progress callbacks cannot be null.");
    this.i = paramc;
    a(2, (T)null);
  }
  
  public void a(@RecentlyNonNull e parame) {
    parame.a();
  }
  
  public void a(j paramj, @RecentlyNonNull Set<Scope> paramSet) {
    Bundle bundle = r();
    f f = new f(this.p);
    f.f = this.c.getPackageName();
    f.i = bundle;
    if (paramSet != null)
      f.h = paramSet.<Scope>toArray(new Scope[paramSet.size()]); 
    if (j()) {
      Account account = n();
      if (account == null)
        account = new Account("<<default account>>", "com.google"); 
      f.j = account;
      if (paramj != null)
        f.g = paramj.asBinder(); 
    } else if (z()) {
      f.j = n();
    } 
    f.k = v;
    f.l = o();
    if (A())
      f.o = true; 
    try {
      synchronized (this.g) {
        if (this.h != null) {
          this.h.a(new j(this, this.u.get()), f);
        } else {
          Log.w("GmsClient", "mServiceBroker is null, client disconnected");
        } 
        return;
      } 
    } catch (DeadObjectException deadObjectException) {
      Log.w("GmsClient", "IGmsServiceBroker.getService failed", (Throwable)deadObjectException);
      b(3);
      return;
    } catch (SecurityException securityException) {
      throw securityException;
    } catch (RemoteException remoteException) {
      Log.w("GmsClient", "IGmsServiceBroker.getService failed", (Throwable)remoteException);
      a(8, (IBinder)null, (Bundle)null, this.u.get());
      return;
    } catch (RuntimeException runtimeException) {
      Log.w("GmsClient", "IGmsServiceBroker.getService failed", runtimeException);
      a(8, (IBinder)null, (Bundle)null, this.u.get());
      return;
    } 
  }
  
  protected void a(@RecentlyNonNull e.f.a.e.e.a parama) {
    parama.b();
    System.currentTimeMillis();
  }
  
  public void a(@RecentlyNonNull String paramString) {
    this.a = paramString;
    i();
  }
  
  @RecentlyNonNull
  public boolean a() {
    synchronized (this.f) {
      if (this.m == 4)
        return true; 
    } 
    boolean bool = false;
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=SYNTHETIC_LOCAL_VARIABLE_2} */
    return bool;
  }
  
  public void b(@RecentlyNonNull int paramInt) {
    Handler handler = this.e;
    handler.sendMessage(handler.obtainMessage(6, this.u.get(), paramInt));
  }
  
  @RecentlyNonNull
  public boolean c() {
    return true;
  }
  
  @RecentlyNonNull
  public abstract int d();
  
  @RecentlyNonNull
  public boolean e() {
    synchronized (this.f) {
      if (this.m == 2 || this.m == 3)
        return true; 
    } 
    boolean bool = false;
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=SYNTHETIC_LOCAL_VARIABLE_2} */
    return bool;
  }
  
  @RecentlyNullable
  public final e.f.a.e.e.c[] f() {
    k0 k01 = this.t;
    return (k01 == null) ? null : k01.d;
  }
  
  @RecentlyNonNull
  public String g() {
    if (a()) {
      t0 t01 = this.b;
      if (t01 != null)
        return t01.b(); 
    } 
    throw new RuntimeException("Failed to connect when checking package");
  }
  
  @RecentlyNullable
  public String h() {
    return this.a;
  }
  
  public void i() {
    this.u.incrementAndGet();
    synchronized (this.k) {
      int k = this.k.size();
      for (int j = 0; j < k; j++)
        ((h)this.k.get(j)).d(); 
      this.k.clear();
      synchronized (this.g) {
        this.h = null;
        a(1, (T)null);
        return;
      } 
    } 
  }
  
  @RecentlyNonNull
  public boolean j() {
    return false;
  }
  
  protected final void l() {
    if (a())
      return; 
    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
  }
  
  @RecentlyNonNull
  protected boolean m() {
    return false;
  }
  
  @RecentlyNullable
  public abstract Account n();
  
  @RecentlyNonNull
  public e.f.a.e.e.c[] o() {
    return v;
  }
  
  @RecentlyNullable
  public Bundle p() {
    return null;
  }
  
  @RecentlyNonNull
  public final Context q() {
    return this.c;
  }
  
  @RecentlyNonNull
  protected Bundle r() {
    return new Bundle();
  }
  
  @RecentlyNullable
  protected String s() {
    return null;
  }
  
  @RecentlyNonNull
  protected abstract Set<Scope> t();
  
  @RecentlyNonNull
  public final T u() {
    synchronized (this.f) {
      if (this.m != 5) {
        l();
        T t = this.j;
        q.a(t, "Client is connected but service is null");
        return t;
      } 
      throw new DeadObjectException();
    } 
  }
  
  protected abstract String v();
  
  protected abstract String w();
  
  @RecentlyNonNull
  protected String x() {
    return "com.google.android.gms";
  }
  
  @RecentlyNonNull
  protected boolean y() {
    return false;
  }
  
  @RecentlyNonNull
  public boolean z() {
    return false;
  }
  
  public static interface a {
    void onConnected(Bundle param1Bundle);
    
    void onConnectionSuspended(@RecentlyNonNull int param1Int);
  }
  
  public static interface b {
    void onConnectionFailed(@RecentlyNonNull e.f.a.e.e.a param1a);
  }
  
  public static interface c {
    void a(@RecentlyNonNull e.f.a.e.e.a param1a);
  }
  
  protected class d implements c {
    public d(@RecentlyNonNull c this$0) {}
    
    public void a(@RecentlyNonNull e.f.a.e.e.a param1a) {
      c c1;
      if (param1a.r()) {
        c1 = this.a;
        c1.a((j)null, c1.t());
        return;
      } 
      if (c.g(this.a) != null)
        c.g(this.a).onConnectionFailed((e.f.a.e.e.a)c1); 
    }
  }
  
  public static interface e {
    void a();
  }
  
  private abstract class f extends h<Boolean> {
    private final int d;
    
    private final Bundle e;
    
    protected f(c this$0, int param1Int, Bundle param1Bundle) {
      super(this$0, Boolean.valueOf(true));
      this.d = param1Int;
      this.e = param1Bundle;
    }
    
    protected final void a() {}
    
    protected abstract void a(e.f.a.e.e.a param1a);
    
    protected abstract boolean e();
  }
  
  final class g extends e.f.a.e.i.f.h {
    public g(c this$0, Looper param1Looper) {
      super(param1Looper);
    }
    
    private static void a(Message param1Message) {
      c.h h1 = (c.h)param1Message.obj;
      h1.a();
      h1.c();
    }
    
    private static boolean b(Message param1Message) {
      int i = param1Message.what;
      return (i != 2 && i != 1) ? ((i == 7)) : true;
    }
    
    public final void handleMessage(Message param1Message) {
      e.f.a.e.e.a a;
      if (this.a.u.get() != param1Message.arg1) {
        if (b(param1Message))
          a(param1Message); 
        return;
      } 
      int i = param1Message.what;
      if ((i == 1 || i == 7 || (i == 4 && !this.a.m()) || param1Message.what == 5) && !this.a.e()) {
        a(param1Message);
        return;
      } 
      i = param1Message.what;
      PendingIntent pendingIntent = null;
      if (i == 4) {
        c.a(this.a, new e.f.a.e.e.a(param1Message.arg2));
        if (c.b(this.a) && !c.c(this.a)) {
          c.a(this.a, 3, (IInterface)null);
          return;
        } 
        if (c.d(this.a) != null) {
          a = c.d(this.a);
        } else {
          a = new e.f.a.e.e.a(8);
        } 
        this.a.i.a(a);
        this.a.a(a);
        return;
      } 
      if (i == 5) {
        if (c.d(this.a) != null) {
          a = c.d(this.a);
        } else {
          a = new e.f.a.e.e.a(8);
        } 
        this.a.i.a(a);
        this.a.a(a);
        return;
      } 
      if (i == 3) {
        Object object = ((Message)a).obj;
        if (object instanceof PendingIntent)
          pendingIntent = (PendingIntent)object; 
        a = new e.f.a.e.e.a(((Message)a).arg2, pendingIntent);
        this.a.i.a(a);
        this.a.a(a);
        return;
      } 
      if (i == 6) {
        c.a(this.a, 5, (IInterface)null);
        if (c.e(this.a) != null)
          c.e(this.a).onConnectionSuspended(((Message)a).arg2); 
        this.a.a(((Message)a).arg2);
        c.a(this.a, 5, 1, (IInterface)null);
        return;
      } 
      if (i == 2 && !this.a.a()) {
        a((Message)a);
        return;
      } 
      if (b((Message)a)) {
        ((c.h)((Message)a).obj).b();
        return;
      } 
      i = ((Message)a).what;
      StringBuilder stringBuilder = new StringBuilder(45);
      stringBuilder.append("Don't know how to handle message: ");
      stringBuilder.append(i);
      Log.wtf("GmsClient", stringBuilder.toString(), new Exception());
    }
  }
  
  protected abstract class h<TListener> {
    private TListener a;
    
    private boolean b;
    
    public h(c this$0, TListener param1TListener) {
      this.a = param1TListener;
      this.b = false;
    }
    
    protected abstract void a();
    
    protected abstract void a(TListener param1TListener);
    
    public final void b() {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: getfield a : Ljava/lang/Object;
      //   6: astore_1
      //   7: aload_0
      //   8: getfield b : Z
      //   11: ifeq -> 67
      //   14: aload_0
      //   15: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
      //   18: astore_2
      //   19: new java/lang/StringBuilder
      //   22: dup
      //   23: aload_2
      //   24: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
      //   27: invokevirtual length : ()I
      //   30: bipush #47
      //   32: iadd
      //   33: invokespecial <init> : (I)V
      //   36: astore_3
      //   37: aload_3
      //   38: ldc 'Callback proxy '
      //   40: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   43: pop
      //   44: aload_3
      //   45: aload_2
      //   46: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   49: pop
      //   50: aload_3
      //   51: ldc ' being reused. This is not safe.'
      //   53: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   56: pop
      //   57: ldc 'GmsClient'
      //   59: aload_3
      //   60: invokevirtual toString : ()Ljava/lang/String;
      //   63: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
      //   66: pop
      //   67: aload_0
      //   68: monitorexit
      //   69: aload_1
      //   70: ifnull -> 88
      //   73: aload_0
      //   74: aload_1
      //   75: invokevirtual a : (Ljava/lang/Object;)V
      //   78: goto -> 92
      //   81: astore_1
      //   82: aload_0
      //   83: invokevirtual a : ()V
      //   86: aload_1
      //   87: athrow
      //   88: aload_0
      //   89: invokevirtual a : ()V
      //   92: aload_0
      //   93: monitorenter
      //   94: aload_0
      //   95: iconst_1
      //   96: putfield b : Z
      //   99: aload_0
      //   100: monitorexit
      //   101: aload_0
      //   102: invokevirtual c : ()V
      //   105: return
      //   106: astore_1
      //   107: aload_0
      //   108: monitorexit
      //   109: aload_1
      //   110: athrow
      //   111: astore_1
      //   112: aload_0
      //   113: monitorexit
      //   114: aload_1
      //   115: athrow
      // Exception table:
      //   from	to	target	type
      //   2	67	111	finally
      //   67	69	111	finally
      //   73	78	81	java/lang/RuntimeException
      //   94	101	106	finally
      //   107	109	106	finally
      //   112	114	111	finally
    }
    
    public final void c() {
      d();
      synchronized (c.f(this.c)) {
        c.f(this.c).remove(this);
        return;
      } 
    }
    
    public final void d() {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: aconst_null
      //   4: putfield a : Ljava/lang/Object;
      //   7: aload_0
      //   8: monitorexit
      //   9: return
      //   10: astore_1
      //   11: aload_0
      //   12: monitorexit
      //   13: aload_1
      //   14: athrow
      // Exception table:
      //   from	to	target	type
      //   2	9	10	finally
      //   11	13	10	finally
    }
  }
  
  public final class i implements ServiceConnection {
    private final int a;
    
    public i(c this$0, int param1Int) {
      this.a = param1Int;
    }
    
    public final void onServiceConnected(ComponentName param1ComponentName, IBinder param1IBinder) {
      null = this.b;
      if (param1IBinder == null) {
        c.a(null, 16);
        return;
      } 
      synchronized (c.a(null)) {
        c c1 = this.b;
        IInterface iInterface = param1IBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (iInterface != null && iInterface instanceof m) {
          iInterface = iInterface;
        } else {
          iInterface = new l(param1IBinder);
        } 
        c.a(c1, (m)iInterface);
        this.b.a(0, (Bundle)null, this.a);
        return;
      } 
    }
    
    public final void onServiceDisconnected(ComponentName param1ComponentName) {
      synchronized (c.a(this.b)) {
        c.a(this.b, (m)null);
        null = this.b.e;
        null.sendMessage(null.obtainMessage(6, this.a, 1));
        return;
      } 
    }
  }
  
  public static final class j extends k.a {
    private c a;
    
    private final int b;
    
    public j(c param1c, int param1Int) {
      this.a = param1c;
      this.b = param1Int;
    }
    
    public final void a(int param1Int, IBinder param1IBinder, Bundle param1Bundle) {
      q.a(this.a, "onPostInitComplete can be called only once per call to getRemoteService");
      this.a.a(param1Int, param1IBinder, param1Bundle, this.b);
      this.a = null;
    }
    
    public final void a(int param1Int, IBinder param1IBinder, k0 param1k0) {
      c c1 = this.a;
      q.a(c1, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
      q.a(param1k0);
      c.a(c1, param1k0);
      a(param1Int, param1IBinder, param1k0.c);
    }
    
    public final void b(int param1Int, Bundle param1Bundle) {
      Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }
  }
  
  protected final class k extends f {
    private final IBinder g;
    
    public k(c this$0, int param1Int, IBinder param1IBinder, Bundle param1Bundle) {
      super(this$0, param1Int, param1Bundle);
      this.g = param1IBinder;
    }
    
    protected final void a(e.f.a.e.e.a param1a) {
      if (c.g(this.h) != null)
        c.g(this.h).onConnectionFailed(param1a); 
      this.h.a(param1a);
    }
    
    protected final boolean e() {
      try {
        IBinder iBinder = this.g;
        q.a(iBinder);
        String str = iBinder.getInterfaceDescriptor();
        if (!this.h.v().equals(str)) {
          String str1 = this.h.v();
          StringBuilder stringBuilder = new StringBuilder(String.valueOf(str1).length() + 34 + String.valueOf(str).length());
          stringBuilder.append("service descriptor mismatch: ");
          stringBuilder.append(str1);
          stringBuilder.append(" vs. ");
          stringBuilder.append(str);
          Log.e("GmsClient", stringBuilder.toString());
          return false;
        } 
        str = this.h.a(this.g);
        if (str != null && (c.a(this.h, 2, 4, (IInterface)str) || c.a(this.h, 3, 4, (IInterface)str))) {
          c.a(this.h, (e.f.a.e.e.a)null);
          Bundle bundle = this.h.p();
          if (c.e(this.h) != null)
            c.e(this.h).onConnected(bundle); 
          return true;
        } 
        return false;
      } catch (RemoteException remoteException) {
        Log.w("GmsClient", "service probably died");
        return false;
      } 
    }
  }
  
  protected final class l extends f {
    public l(c this$0, int param1Int, Bundle param1Bundle) {
      super(this$0, param1Int, null);
    }
    
    protected final void a(e.f.a.e.e.a param1a) {
      if (this.g.m() && c.b(this.g)) {
        c.a(this.g, 16);
        return;
      } 
      this.g.i.a(param1a);
      this.g.a(param1a);
    }
    
    protected final boolean e() {
      this.g.i.a(e.f.a.e.e.a.g);
      return true;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/common/internal/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */