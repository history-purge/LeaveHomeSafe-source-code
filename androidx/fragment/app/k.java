package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import androidx.core.util.f;
import b.g.e.a;

public abstract class k<E> extends g {
  private final Activity c;
  
  private final Context d;
  
  private final Handler e;
  
  final n f = new o();
  
  k(Activity paramActivity, Context paramContext, Handler paramHandler, int paramInt) {
    this.c = paramActivity;
    f.a(paramContext, "context == null");
    this.d = paramContext;
    f.a(paramHandler, "handler == null");
    this.e = paramHandler;
  }
  
  k(e parame) {
    this((Activity)parame, (Context)parame, new Handler(), 0);
  }
  
  public View a(int paramInt) {
    return null;
  }
  
  public void a(Fragment paramFragment, @SuppressLint({"UnknownNullness"}) Intent paramIntent, int paramInt, Bundle paramBundle) {
    if (paramInt == -1) {
      a.a(this.d, paramIntent, paramBundle);
      return;
    } 
    throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
  }
  
  public boolean a(Fragment paramFragment) {
    return true;
  }
  
  public boolean c() {
    return true;
  }
  
  Activity e() {
    return this.c;
  }
  
  Context f() {
    return this.d;
  }
  
  Handler h() {
    return this.e;
  }
  
  public abstract E i();
  
  public LayoutInflater j() {
    return LayoutInflater.from(this.d);
  }
  
  public void k() {}
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/fragment/app/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */