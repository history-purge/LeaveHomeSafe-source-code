package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import b.d.b;
import java.lang.ref.WeakReference;
import java.util.Iterator;

public abstract class f {
  private static int c = -100;
  
  private static final b<WeakReference<f>> d = new b();
  
  private static final Object e = new Object();
  
  public static f a(Activity paramActivity, e parame) {
    return new g(paramActivity, parame);
  }
  
  public static f a(Dialog paramDialog, e parame) {
    return new g(paramDialog, parame);
  }
  
  static void a(f paramf) {
    synchronized (e) {
      c(paramf);
      d.add(new WeakReference<f>(paramf));
      return;
    } 
  }
  
  static void b(f paramf) {
    synchronized (e) {
      c(paramf);
      return;
    } 
  }
  
  private static void c(f paramf) {
    synchronized (e) {
      Iterator<WeakReference<f>> iterator = d.iterator();
      while (iterator.hasNext()) {
        f f1 = ((WeakReference<f>)iterator.next()).get();
        if (f1 == paramf || f1 == null)
          iterator.remove(); 
      } 
      return;
    } 
  }
  
  public static int j() {
    return c;
  }
  
  public int a() {
    return -100;
  }
  
  public abstract <T extends View> T a(int paramInt);
  
  @Deprecated
  public void a(Context paramContext) {}
  
  public abstract void a(Configuration paramConfiguration);
  
  public abstract void a(Bundle paramBundle);
  
  public abstract void a(View paramView);
  
  public abstract void a(View paramView, ViewGroup.LayoutParams paramLayoutParams);
  
  public abstract void a(Toolbar paramToolbar);
  
  public abstract void a(CharSequence paramCharSequence);
  
  public Context b(Context paramContext) {
    a(paramContext);
    return paramContext;
  }
  
  public abstract MenuInflater b();
  
  public abstract void b(Bundle paramBundle);
  
  public abstract void b(View paramView, ViewGroup.LayoutParams paramLayoutParams);
  
  public abstract boolean b(int paramInt);
  
  public abstract a c();
  
  public abstract void c(int paramInt);
  
  public abstract void c(Bundle paramBundle);
  
  public abstract void d();
  
  public void d(int paramInt) {}
  
  public abstract void e();
  
  public abstract void f();
  
  public abstract void g();
  
  public abstract void h();
  
  public abstract void i();
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/appcompat/app/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */