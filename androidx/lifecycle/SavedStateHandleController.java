package androidx.lifecycle;

import android.os.Bundle;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.c;
import java.util.Iterator;

final class SavedStateHandleController implements h {
  private final String c;
  
  private boolean d = false;
  
  private final s e;
  
  SavedStateHandleController(String paramString, s params) {
    this.c = paramString;
    this.e = params;
  }
  
  static SavedStateHandleController a(SavedStateRegistry paramSavedStateRegistry, g paramg, String paramString, Bundle paramBundle) {
    SavedStateHandleController savedStateHandleController = new SavedStateHandleController(paramString, s.a(paramSavedStateRegistry.a(paramString), paramBundle));
    savedStateHandleController.a(paramSavedStateRegistry, paramg);
    b(paramSavedStateRegistry, paramg);
    return savedStateHandleController;
  }
  
  static void a(u paramu, SavedStateRegistry paramSavedStateRegistry, g paramg) {
    SavedStateHandleController savedStateHandleController = paramu.<SavedStateHandleController>a("androidx.lifecycle.savedstate.vm.tag");
    if (savedStateHandleController != null && !savedStateHandleController.b()) {
      savedStateHandleController.a(paramSavedStateRegistry, paramg);
      b(paramSavedStateRegistry, paramg);
    } 
  }
  
  private static void b(SavedStateRegistry paramSavedStateRegistry, g paramg) {
    g.c c = paramg.a();
    if (c == g.c.d || c.a(g.c.f)) {
      paramSavedStateRegistry.a(a.class);
      return;
    } 
    paramg.a(new h(paramg, paramSavedStateRegistry) {
          public void a(j param1j, g.b param1b) {
            if (param1b == g.b.ON_START) {
              this.c.b(this);
              this.d.a(SavedStateHandleController.a.class);
            } 
          }
        });
  }
  
  s a() {
    return this.e;
  }
  
  public void a(j paramj, g.b paramb) {
    if (paramb == g.b.ON_DESTROY) {
      this.d = false;
      paramj.a().b(this);
    } 
  }
  
  void a(SavedStateRegistry paramSavedStateRegistry, g paramg) {
    if (!this.d) {
      this.d = true;
      paramg.a(this);
      paramSavedStateRegistry.a(this.c, this.e.a());
      return;
    } 
    throw new IllegalStateException("Already attached to lifecycleOwner");
  }
  
  boolean b() {
    return this.d;
  }
  
  static final class a implements SavedStateRegistry.a {
    public void a(c param1c) {
      if (param1c instanceof x) {
        w w = ((x)param1c).d();
        SavedStateRegistry savedStateRegistry = param1c.c();
        Iterator<String> iterator = w.b().iterator();
        while (iterator.hasNext())
          SavedStateHandleController.a(w.a(iterator.next()), savedStateRegistry, param1c.a()); 
        if (!w.b().isEmpty())
          savedStateRegistry.a(a.class); 
        return;
      } 
      IllegalStateException illegalStateException = new IllegalStateException("Internal error: OnRecreation should be registered only on componentsthat implement ViewModelStoreOwner");
      throw illegalStateException;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/lifecycle/SavedStateHandleController.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */