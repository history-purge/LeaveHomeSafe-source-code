package androidx.viewpager2.adapter;

import android.os.Handler;
import androidx.lifecycle.g;
import androidx.lifecycle.h;
import androidx.lifecycle.i;
import androidx.lifecycle.j;

class FragmentStateAdapter$5 implements h {
  public void a(j paramj, g.b paramb) {
    if (paramb == g.b.ON_DESTROY) {
      this.c.removeCallbacks(this.d);
      paramj.a().b((i)this);
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/viewpager2/adapter/FragmentStateAdapter$5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */