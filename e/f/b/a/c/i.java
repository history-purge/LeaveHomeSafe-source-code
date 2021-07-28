package e.f.b.a.c;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.q;
import com.google.firebase.components.n;
import com.google.firebase.components.p;
import com.google.firebase.components.s;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import e.f.a.e.m.n;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

public class i {
  private static final AtomicReference<i> b = new AtomicReference<i>();
  
  private s a;
  
  @RecentlyNonNull
  public static i a(@RecentlyNonNull Context paramContext) {
    i i1 = new i();
    Context context = paramContext.getApplicationContext();
    if (context != null)
      paramContext = context; 
    List list = p.a(paramContext, MlKitComponentDiscoveryService.class).a();
    Executor executor = n.a;
    n n1 = n.a(paramContext, Context.class, new Class[0]);
    n n2 = n.a(i1, i.class, new Class[0]);
    boolean bool = true;
    i1.a = new s(executor, list, new n[] { n1, n2 });
    i1.a.a(true);
    if ((i)b.getAndSet(i1) != null)
      bool = false; 
    q.b(bool, "MlKitContext is already initialized");
    return i1;
  }
  
  @RecentlyNonNull
  public static i b() {
    boolean bool;
    i i1 = b.get();
    if (i1 != null) {
      bool = true;
    } else {
      bool = false;
    } 
    q.b(bool, "MlKitContext has not been initialized");
    return i1;
  }
  
  @RecentlyNonNull
  public Context a() {
    return a(Context.class);
  }
  
  @RecentlyNonNull
  public <T> T a(@RecentlyNonNull Class<T> paramClass) {
    boolean bool;
    if (b.get() == this) {
      bool = true;
    } else {
      bool = false;
    } 
    q.b(bool, "MlKitContext has been deleted");
    q.a(this.a);
    return (T)this.a.a(paramClass);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/b/a/c/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */