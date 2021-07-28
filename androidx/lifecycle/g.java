package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;

public abstract class g {
  public g() {
    new AtomicReference();
  }
  
  public abstract c a();
  
  public abstract void a(i parami);
  
  public abstract void b(i parami);
  
  public enum b {
    ON_ANY, ON_CREATE, ON_DESTROY, ON_PAUSE, ON_RESUME, ON_START, ON_STOP;
    
    static {
      ON_PAUSE = new b("ON_PAUSE", 3);
      ON_STOP = new b("ON_STOP", 4);
      ON_DESTROY = new b("ON_DESTROY", 5);
      ON_ANY = new b("ON_ANY", 6);
      $VALUES = new b[] { ON_CREATE, ON_START, ON_RESUME, ON_PAUSE, ON_STOP, ON_DESTROY, ON_ANY };
    }
    
    public static b a(g.c param1c) {
      int i = g.a.a[param1c.ordinal()];
      return (i != 1) ? ((i != 2) ? ((i != 3) ? null : ON_PAUSE) : ON_STOP) : ON_DESTROY;
    }
    
    public static b b(g.c param1c) {
      int i = g.a.a[param1c.ordinal()];
      return (i != 1) ? ((i != 2) ? ((i != 5) ? null : ON_CREATE) : ON_RESUME) : ON_START;
    }
    
    public g.c a() {
      StringBuilder stringBuilder;
      switch (g.a.b[ordinal()]) {
        default:
          stringBuilder = new StringBuilder();
          stringBuilder.append(this);
          stringBuilder.append(" has no target state");
          throw new IllegalArgumentException(stringBuilder.toString());
        case 6:
          return g.c.c;
        case 5:
          return g.c.g;
        case 3:
        case 4:
          return g.c.f;
        case 1:
        case 2:
          break;
      } 
      return g.c.e;
    }
  }
  
  public enum c {
    c, d, e, f, g;
    
    public boolean a(c param1c) {
      return (compareTo((E)param1c) >= 0);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/lifecycle/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */