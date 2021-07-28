package e.e.l.c;

import android.os.Build;
import com.facebook.imagepipeline.memory.f0;
import com.facebook.imagepipeline.platform.f;
import e.e.l.f.a;

public class g {
  public static f a(f0 paramf0, f paramf, a parama) {
    int i = Build.VERSION.SDK_INT;
    return (f)((i >= 21) ? new a(paramf0.a(), parama) : ((i >= 11) ? new e(new b(paramf0.f()), paramf, parama) : new c()));
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/l/c/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */