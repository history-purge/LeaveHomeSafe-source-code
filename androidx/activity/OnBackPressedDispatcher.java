package androidx.activity;

import android.annotation.SuppressLint;
import androidx.lifecycle.g;
import androidx.lifecycle.h;
import androidx.lifecycle.i;
import androidx.lifecycle.j;
import java.util.ArrayDeque;
import java.util.Iterator;

public final class OnBackPressedDispatcher {
  private final Runnable a;
  
  final ArrayDeque<b> b = new ArrayDeque<b>();
  
  public OnBackPressedDispatcher(Runnable paramRunnable) {
    this.a = paramRunnable;
  }
  
  a a(b paramb) {
    this.b.add(paramb);
    a a = new a(this, paramb);
    paramb.a(a);
    return a;
  }
  
  public void a() {
    Iterator<b> iterator = this.b.descendingIterator();
    while (iterator.hasNext()) {
      b b = iterator.next();
      if (b.b()) {
        b.a();
        return;
      } 
    } 
    Runnable runnable = this.a;
    if (runnable != null)
      runnable.run(); 
  }
  
  @SuppressLint({"LambdaLast"})
  public void a(j paramj, b paramb) {
    g g = paramj.a();
    if (g.a() == g.c.c)
      return; 
    paramb.a(new LifecycleOnBackPressedCancellable(this, g, paramb));
  }
  
  private class LifecycleOnBackPressedCancellable implements h, a {
    private final g c;
    
    private final b d;
    
    private a e;
    
    LifecycleOnBackPressedCancellable(OnBackPressedDispatcher this$0, g param1g, b param1b) {
      this.c = param1g;
      this.d = param1b;
      param1g.a((i)this);
    }
    
    public void a(j param1j, g.b param1b) {
      if (param1b == g.b.ON_START) {
        this.e = this.f.a(this.d);
        return;
      } 
      if (param1b == g.b.ON_STOP) {
        a a1 = this.e;
        if (a1 != null) {
          a1.cancel();
          return;
        } 
      } else if (param1b == g.b.ON_DESTROY) {
        cancel();
      } 
    }
    
    public void cancel() {
      this.c.b((i)this);
      this.d.b(this);
      a a1 = this.e;
      if (a1 != null) {
        a1.cancel();
        this.e = null;
      } 
    }
  }
  
  private class a implements a {
    private final b c;
    
    a(OnBackPressedDispatcher this$0, b param1b) {
      this.c = param1b;
    }
    
    public void cancel() {
      this.d.b.remove(this.c);
      this.c.b(this);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/activity/OnBackPressedDispatcher.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */