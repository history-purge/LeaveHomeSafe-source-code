package androidx.activity.d;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public final class b {
  private final Set<c> a = new CopyOnWriteArraySet<c>();
  
  private volatile Context b;
  
  public void a() {
    this.b = null;
  }
  
  public void a(Context paramContext) {
    this.b = paramContext;
    Iterator<c> iterator = this.a.iterator();
    while (iterator.hasNext())
      ((c)iterator.next()).a(paramContext); 
  }
  
  public void a(c paramc) {
    if (this.b != null)
      paramc.a(this.b); 
    this.a.add(paramc);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/activity/d/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */