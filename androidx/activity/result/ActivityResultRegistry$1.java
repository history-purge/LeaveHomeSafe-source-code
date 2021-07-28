package androidx.activity.result;

import androidx.activity.result.h.a;
import androidx.lifecycle.g;
import androidx.lifecycle.h;
import androidx.lifecycle.j;

class ActivityResultRegistry$1 implements h {
  public void a(j paramj, g.b paramb) {
    if (g.b.ON_START.equals(paramb)) {
      this.f.f.put(this.c, new e.b(this.d, this.e));
      if (this.f.g.containsKey(this.c)) {
        paramj = (j)this.f.g.get(this.c);
        this.f.g.remove(this.c);
        this.d.a(paramj);
      } 
      a a1 = (a)this.f.h.getParcelable(this.c);
      if (a1 != null) {
        this.f.h.remove(this.c);
        this.d.a(this.e.a(a1.f(), a1.e()));
        return;
      } 
    } else {
      if (g.b.ON_STOP.equals(paramb)) {
        this.f.f.remove(this.c);
        return;
      } 
      if (g.b.ON_DESTROY.equals(paramb))
        this.f.a(this.c); 
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/activity/result/ActivityResultRegistry$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */