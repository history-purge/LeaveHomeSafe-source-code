package b.a.o;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public abstract class b {
  private Object c;
  
  private boolean d;
  
  public abstract void a();
  
  public abstract void a(int paramInt);
  
  public abstract void a(View paramView);
  
  public abstract void a(CharSequence paramCharSequence);
  
  public void a(Object paramObject) {
    this.c = paramObject;
  }
  
  public void a(boolean paramBoolean) {
    this.d = paramBoolean;
  }
  
  public abstract View b();
  
  public abstract void b(int paramInt);
  
  public abstract void b(CharSequence paramCharSequence);
  
  public abstract Menu c();
  
  public abstract MenuInflater d();
  
  public abstract CharSequence e();
  
  public Object f() {
    return this.c;
  }
  
  public abstract CharSequence g();
  
  public boolean h() {
    return this.d;
  }
  
  public abstract void i();
  
  public abstract boolean j();
  
  public static interface a {
    void a(b param1b);
    
    boolean a(b param1b, Menu param1Menu);
    
    boolean a(b param1b, MenuItem param1MenuItem);
    
    boolean b(b param1b, Menu param1Menu);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/a/o/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */