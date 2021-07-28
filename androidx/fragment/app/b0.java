package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.g;
import androidx.lifecycle.j;
import androidx.lifecycle.k;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.b;
import androidx.savedstate.c;

class b0 implements c {
  private k c = null;
  
  private b d = null;
  
  public g a() {
    b();
    return (g)this.c;
  }
  
  void a(Bundle paramBundle) {
    this.d.a(paramBundle);
  }
  
  void a(g.b paramb) {
    this.c.a(paramb);
  }
  
  void a(g.c paramc) {
    this.c.b(paramc);
  }
  
  void b() {
    if (this.c == null) {
      this.c = new k((j)this);
      this.d = b.a(this);
    } 
  }
  
  void b(Bundle paramBundle) {
    this.d.b(paramBundle);
  }
  
  public SavedStateRegistry c() {
    return this.d.a();
  }
  
  boolean d() {
    return (this.c != null);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/fragment/app/b0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */