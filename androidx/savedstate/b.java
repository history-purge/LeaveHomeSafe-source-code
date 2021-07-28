package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.g;
import androidx.lifecycle.i;

public final class b {
  private final c a;
  
  private final SavedStateRegistry b;
  
  private b(c paramc) {
    this.a = paramc;
    this.b = new SavedStateRegistry();
  }
  
  public static b a(c paramc) {
    return new b(paramc);
  }
  
  public SavedStateRegistry a() {
    return this.b;
  }
  
  public void a(Bundle paramBundle) {
    g g = this.a.a();
    if (g.a() == g.c.d) {
      g.a((i)new Recreator(this.a));
      this.b.a(g, paramBundle);
      return;
    } 
    throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
  }
  
  public void b(Bundle paramBundle) {
    this.b.a(paramBundle);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/savedstate/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */