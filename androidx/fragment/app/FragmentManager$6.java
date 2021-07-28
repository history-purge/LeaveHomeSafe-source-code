package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.g;
import androidx.lifecycle.h;
import androidx.lifecycle.i;
import androidx.lifecycle.j;

class FragmentManager$6 implements h {
  public void a(j paramj, g.b paramb) {
    if (paramb == g.b.ON_START) {
      Bundle bundle = (Bundle)n.a(this.f).get(this.c);
      if (bundle != null) {
        this.d.a(this.c, bundle);
        this.f.a(this.c);
      } 
    } 
    if (paramb == g.b.ON_DESTROY) {
      this.e.b((i)this);
      n.b(this.f).remove(this.c);
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/fragment/app/FragmentManager$6.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */