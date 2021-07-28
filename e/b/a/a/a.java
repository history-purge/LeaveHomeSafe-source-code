package e.b.a.a;

import android.content.Context;

public abstract class a {
  public static b a(Context paramContext) {
    return new b(paramContext, null);
  }
  
  public abstract void a();
  
  public abstract void a(c paramc);
  
  public abstract d b();
  
  public static final class b {
    private final Context a;
    
    private b(Context param1Context) {
      this.a = param1Context;
    }
    
    public a a() {
      Context context = this.a;
      if (context != null)
        return new b(context); 
      throw new IllegalArgumentException("Please provide a valid Context.");
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/b/a/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */