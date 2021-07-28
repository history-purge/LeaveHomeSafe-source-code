package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;

public class r extends Fragment {
  private a c;
  
  public static void a(Activity paramActivity) {
    if (Build.VERSION.SDK_INT >= 29)
      b.registerIn(paramActivity); 
    FragmentManager fragmentManager = paramActivity.getFragmentManager();
    if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
      fragmentManager.beginTransaction().add(new r(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
      fragmentManager.executePendingTransactions();
    } 
  }
  
  static void a(Activity paramActivity, g.b paramb) {
    if (paramActivity instanceof l) {
      ((l)paramActivity).a().a(paramb);
      return;
    } 
    if (paramActivity instanceof j) {
      g g = ((j)paramActivity).a();
      if (g instanceof k)
        ((k)g).a(paramb); 
    } 
  }
  
  private void a(g.b paramb) {
    if (Build.VERSION.SDK_INT < 29)
      a(getActivity(), paramb); 
  }
  
  private void a(a parama) {
    if (parama != null)
      parama.a(); 
  }
  
  private void b(a parama) {
    if (parama != null)
      parama.b(); 
  }
  
  private void c(a parama) {
    if (parama != null)
      parama.c(); 
  }
  
  public void onActivityCreated(Bundle paramBundle) {
    super.onActivityCreated(paramBundle);
    a(this.c);
    a(g.b.ON_CREATE);
  }
  
  public void onDestroy() {
    super.onDestroy();
    a(g.b.ON_DESTROY);
    this.c = null;
  }
  
  public void onPause() {
    super.onPause();
    a(g.b.ON_PAUSE);
  }
  
  public void onResume() {
    super.onResume();
    b(this.c);
    a(g.b.ON_RESUME);
  }
  
  public void onStart() {
    super.onStart();
    c(this.c);
    a(g.b.ON_START);
  }
  
  public void onStop() {
    super.onStop();
    a(g.b.ON_STOP);
  }
  
  static interface a {
    void a();
    
    void b();
    
    void c();
  }
  
  static class b implements Application.ActivityLifecycleCallbacks {
    static void registerIn(Activity param1Activity) {
      param1Activity.registerActivityLifecycleCallbacks(new b());
    }
    
    public void onActivityCreated(Activity param1Activity, Bundle param1Bundle) {}
    
    public void onActivityDestroyed(Activity param1Activity) {}
    
    public void onActivityPaused(Activity param1Activity) {}
    
    public void onActivityPostCreated(Activity param1Activity, Bundle param1Bundle) {
      r.a(param1Activity, g.b.ON_CREATE);
    }
    
    public void onActivityPostResumed(Activity param1Activity) {
      r.a(param1Activity, g.b.ON_RESUME);
    }
    
    public void onActivityPostStarted(Activity param1Activity) {
      r.a(param1Activity, g.b.ON_START);
    }
    
    public void onActivityPreDestroyed(Activity param1Activity) {
      r.a(param1Activity, g.b.ON_DESTROY);
    }
    
    public void onActivityPrePaused(Activity param1Activity) {
      r.a(param1Activity, g.b.ON_PAUSE);
    }
    
    public void onActivityPreStopped(Activity param1Activity) {
      r.a(param1Activity, g.b.ON_STOP);
    }
    
    public void onActivityResumed(Activity param1Activity) {}
    
    public void onActivitySaveInstanceState(Activity param1Activity, Bundle param1Bundle) {}
    
    public void onActivityStarted(Activity param1Activity) {}
    
    public void onActivityStopped(Activity param1Activity) {}
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/lifecycle/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */