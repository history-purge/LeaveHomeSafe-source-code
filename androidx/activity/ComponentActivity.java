package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.d.a;
import androidx.activity.d.b;
import androidx.activity.d.c;
import androidx.activity.result.c;
import androidx.activity.result.e;
import androidx.activity.result.f;
import androidx.activity.result.g;
import androidx.activity.result.h.a;
import androidx.core.app.f;
import androidx.lifecycle.f;
import androidx.lifecycle.g;
import androidx.lifecycle.h;
import androidx.lifecycle.i;
import androidx.lifecycle.j;
import androidx.lifecycle.k;
import androidx.lifecycle.r;
import androidx.lifecycle.t;
import androidx.lifecycle.v;
import androidx.lifecycle.w;
import androidx.lifecycle.x;
import androidx.lifecycle.y;
import androidx.lifecycle.z;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.c;
import androidx.savedstate.d;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;

public class ComponentActivity extends f implements a, j, x, f, c, c, f, c {
  final b d = new b();
  
  private final k e = new k(this);
  
  final androidx.savedstate.b f = androidx.savedstate.b.a(this);
  
  private w g;
  
  private v.b h;
  
  private final OnBackPressedDispatcher i = new OnBackPressedDispatcher(new a(this));
  
  private int j;
  
  private final e k;
  
  public ComponentActivity() {
    new AtomicInteger();
    this.k = new b(this);
    if (a() != null) {
      if (Build.VERSION.SDK_INT >= 19)
        a().a((i)new h(this) {
              public void a(j param1j, g.b param1b) {
                if (param1b == g.b.ON_STOP) {
                  Window window = this.c.getWindow();
                  if (window != null) {
                    View view = window.peekDecorView();
                  } else {
                    window = null;
                  } 
                  if (window != null)
                    window.cancelPendingInputEvents(); 
                } 
              }
            }); 
      a().a((i)new h(this) {
            public void a(j param1j, g.b param1b) {
              if (param1b == g.b.ON_DESTROY) {
                this.c.d.a();
                if (!this.c.isChangingConfigurations())
                  this.c.d().a(); 
              } 
            }
          });
      a().a((i)new h(this) {
            public void a(j param1j, g.b param1b) {
              this.c.i();
              this.c.a().b((i)this);
            }
          });
      int i = Build.VERSION.SDK_INT;
      if (19 <= i && i <= 23)
        a().a((i)new ImmLeaksCleaner((Activity)this)); 
      return;
    } 
    throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
  }
  
  private void k() {
    y.a(getWindow().getDecorView(), this);
    z.a(getWindow().getDecorView(), this);
    d.a(getWindow().getDecorView(), this);
  }
  
  public g a() {
    return (g)this.e;
  }
  
  public final void a(c paramc) {
    this.d.a(paramc);
  }
  
  public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View paramView, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams paramLayoutParams) {
    k();
    super.addContentView(paramView, paramLayoutParams);
  }
  
  public final OnBackPressedDispatcher b() {
    return this.i;
  }
  
  public final SavedStateRegistry c() {
    return this.f.a();
  }
  
  public w d() {
    if (getApplication() != null) {
      i();
      return this.g;
    } 
    throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
  }
  
  public v.b f() {
    if (getApplication() != null) {
      if (this.h == null) {
        Bundle bundle;
        Application application = getApplication();
        if (getIntent() != null) {
          bundle = getIntent().getExtras();
        } else {
          bundle = null;
        } 
        this.h = (v.b)new t(application, this, bundle);
      } 
      return this.h;
    } 
    throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
  }
  
  public final e g() {
    return this.k;
  }
  
  void i() {
    if (this.g == null) {
      c c1 = (c)getLastNonConfigurationInstance();
      if (c1 != null)
        this.g = c1.a; 
      if (this.g == null)
        this.g = new w(); 
    } 
  }
  
  @Deprecated
  public Object j() {
    return null;
  }
  
  @Deprecated
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent) {
    if (!this.k.a(paramInt1, paramInt2, paramIntent))
      super.onActivityResult(paramInt1, paramInt2, paramIntent); 
  }
  
  public void onBackPressed() {
    this.i.a();
  }
  
  protected void onCreate(Bundle paramBundle) {
    this.f.a(paramBundle);
    this.d.a((Context)this);
    super.onCreate(paramBundle);
    this.k.a(paramBundle);
    r.a((Activity)this);
    int i = this.j;
    if (i != 0)
      setContentView(i); 
  }
  
  @Deprecated
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfint) {
    if (!this.k.a(paramInt, -1, (new Intent()).putExtra("androidx.activity.result.contract.extra.PERMISSIONS", paramArrayOfString).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", paramArrayOfint)) && Build.VERSION.SDK_INT >= 23)
      super.onRequestPermissionsResult(paramInt, paramArrayOfString, paramArrayOfint); 
  }
  
  public final Object onRetainNonConfigurationInstance() {
    Object object = j();
    w w2 = this.g;
    w w1 = w2;
    if (w2 == null) {
      c c2 = (c)getLastNonConfigurationInstance();
      w1 = w2;
      if (c2 != null)
        w1 = c2.a; 
    } 
    if (w1 == null && object == null)
      return null; 
    c c1 = new c();
    c1.a = w1;
    return c1;
  }
  
  protected void onSaveInstanceState(Bundle paramBundle) {
    g g = a();
    if (g instanceof k)
      ((k)g).b(g.c.e); 
    super.onSaveInstanceState(paramBundle);
    this.f.b(paramBundle);
    this.k.b(paramBundle);
  }
  
  public void reportFullyDrawn() {
    // Byte code:
    //   0: invokestatic b : ()Z
    //   3: ifeq -> 38
    //   6: new java/lang/StringBuilder
    //   9: dup
    //   10: invokespecial <init> : ()V
    //   13: astore_2
    //   14: aload_2
    //   15: ldc_w 'reportFullyDrawn() for '
    //   18: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   21: pop
    //   22: aload_2
    //   23: aload_0
    //   24: invokevirtual getComponentName : ()Landroid/content/ComponentName;
    //   27: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   30: pop
    //   31: aload_2
    //   32: invokevirtual toString : ()Ljava/lang/String;
    //   35: invokestatic a : (Ljava/lang/String;)V
    //   38: getstatic android/os/Build$VERSION.SDK_INT : I
    //   41: bipush #19
    //   43: if_icmple -> 53
    //   46: aload_0
    //   47: invokespecial reportFullyDrawn : ()V
    //   50: goto -> 76
    //   53: getstatic android/os/Build$VERSION.SDK_INT : I
    //   56: bipush #19
    //   58: if_icmpne -> 76
    //   61: aload_0
    //   62: ldc_w 'android.permission.UPDATE_DEVICE_STATS'
    //   65: invokestatic a : (Landroid/content/Context;Ljava/lang/String;)I
    //   68: istore_1
    //   69: iload_1
    //   70: ifne -> 76
    //   73: goto -> 46
    //   76: invokestatic a : ()V
    //   79: return
    //   80: astore_2
    //   81: invokestatic a : ()V
    //   84: goto -> 89
    //   87: aload_2
    //   88: athrow
    //   89: goto -> 87
    // Exception table:
    //   from	to	target	type
    //   0	38	80	finally
    //   38	46	80	finally
    //   46	50	80	finally
    //   53	69	80	finally
  }
  
  public void setContentView(int paramInt) {
    k();
    super.setContentView(paramInt);
  }
  
  public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View paramView) {
    k();
    super.setContentView(paramView);
  }
  
  public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View paramView, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams paramLayoutParams) {
    k();
    super.setContentView(paramView, paramLayoutParams);
  }
  
  @Deprecated
  public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent paramIntent, int paramInt) {
    super.startActivityForResult(paramIntent, paramInt);
  }
  
  @Deprecated
  public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent paramIntent, int paramInt, Bundle paramBundle) {
    super.startActivityForResult(paramIntent, paramInt, paramBundle);
  }
  
  @Deprecated
  public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender paramIntentSender, int paramInt1, Intent paramIntent, int paramInt2, int paramInt3, int paramInt4) {
    super.startIntentSenderForResult(paramIntentSender, paramInt1, paramIntent, paramInt2, paramInt3, paramInt4);
  }
  
  @Deprecated
  public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender paramIntentSender, int paramInt1, Intent paramIntent, int paramInt2, int paramInt3, int paramInt4, Bundle paramBundle) {
    super.startIntentSenderForResult(paramIntentSender, paramInt1, paramIntent, paramInt2, paramInt3, paramInt4, paramBundle);
  }
  
  class a implements Runnable {
    a(ComponentActivity this$0) {}
    
    public void run() {
      try {
        ComponentActivity.a(this.c);
        return;
      } catch (IllegalStateException illegalStateException) {
        if (TextUtils.equals(illegalStateException.getMessage(), "Can not perform this action after onSaveInstanceState"))
          return; 
        throw illegalStateException;
      } 
    }
  }
  
  class b extends e {
    b(ComponentActivity this$0) {}
    
    public <I, O> void a(int param1Int, a<I, O> param1a, I param1I, androidx.core.app.b param1b) {
      String[] arrayOfString1;
      String[] arrayOfString2;
      g g;
      ComponentActivity componentActivity = this.i;
      a.a a1 = param1a.b((Context)componentActivity, param1I);
      if (a1 != null) {
        (new Handler(Looper.getMainLooper())).post(new a(this, param1Int, a1));
        return;
      } 
      Intent intent = param1a.a((Context)componentActivity, param1I);
      if (intent.getExtras() != null && intent.getExtras().getClassLoader() == null)
        intent.setExtrasClassLoader(componentActivity.getClassLoader()); 
      if (intent.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
        Bundle bundle = intent.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        intent.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
      } else if (param1b == null) {
        param1a = null;
      } else {
        param1b.a();
        throw null;
      } 
      if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intent.getAction())) {
        arrayOfString2 = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        arrayOfString1 = arrayOfString2;
        if (arrayOfString2 == null)
          arrayOfString1 = new String[0]; 
        androidx.core.app.a.a((Activity)componentActivity, arrayOfString1, param1Int);
        return;
      } 
      if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(arrayOfString2.getAction())) {
        g = (g)arrayOfString2.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
        try {
          androidx.core.app.a.a((Activity)componentActivity, g.h(), param1Int, g.e(), g.f(), g.g(), 0, (Bundle)arrayOfString1);
          return;
        } catch (android.content.IntentSender.SendIntentException sendIntentException) {
          (new Handler(Looper.getMainLooper())).post(new b(this, param1Int, sendIntentException));
          return;
        } 
      } 
      androidx.core.app.a.a((Activity)componentActivity, (Intent)g, param1Int, (Bundle)sendIntentException);
    }
    
    class a implements Runnable {
      a(ComponentActivity.b this$0, int param2Int, a.a param2a) {}
      
      public void run() {
        this.e.a(this.c, this.d.a());
      }
    }
    
    class b implements Runnable {
      b(ComponentActivity.b this$0, int param2Int, IntentSender.SendIntentException param2SendIntentException) {}
      
      public void run() {
        this.e.a(this.c, 0, (new Intent()).setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (Serializable)this.d));
      }
    }
  }
  
  class a implements Runnable {
    a(ComponentActivity this$0, int param1Int, a.a param1a) {}
    
    public void run() {
      this.e.a(this.c, this.d.a());
    }
  }
  
  class b implements Runnable {
    b(ComponentActivity this$0, int param1Int, IntentSender.SendIntentException param1SendIntentException) {}
    
    public void run() {
      this.e.a(this.c, 0, (new Intent()).setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (Serializable)this.d));
    }
  }
  
  static final class c {
    w a;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/activity/ComponentActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */