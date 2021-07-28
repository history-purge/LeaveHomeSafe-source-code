package e.f.b.a.b;

import androidx.annotation.RecentlyNonNull;
import com.google.firebase.p.b;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class c {
  private final Map<Class<? extends b>, b<? extends e.f.b.a.c.o.c<? extends b>>> a = new HashMap<Class<? extends b>, b<? extends e.f.b.a.c.o.c<? extends b>>>();
  
  public c(@RecentlyNonNull Set<a> paramSet) {
    for (a a : paramSet)
      this.a.put(a.a(), a.b()); 
  }
  
  public static class a {
    private final Class<? extends b> a;
    
    private final b<? extends e.f.b.a.c.o.c<? extends b>> b;
    
    public <RemoteT extends b> a(@RecentlyNonNull Class<RemoteT> param1Class, @RecentlyNonNull b<? extends e.f.b.a.c.o.c<RemoteT>> param1b) {
      this.a = param1Class;
      this.b = param1b;
    }
    
    final Class<? extends b> a() {
      return this.a;
    }
    
    final b<? extends e.f.b.a.c.o.c<? extends b>> b() {
      return this.b;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/b/a/b/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */