package e.f.b.a.c;

import androidx.annotation.RecentlyNonNull;
import com.google.firebase.p.b;
import java.util.concurrent.Executor;

public class d {
  private final b<? extends Executor> a;
  
  public d(@RecentlyNonNull b<? extends Executor> paramb) {
    this.a = paramb;
  }
  
  @RecentlyNonNull
  public Executor a(Executor paramExecutor) {
    return (paramExecutor != null) ? paramExecutor : (Executor)this.a.get();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/b/a/c/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */