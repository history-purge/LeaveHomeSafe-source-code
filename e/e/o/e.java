package e.e.o;

import android.content.ComponentCallbacks;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import com.facebook.react.bridge.MemoryPressureListener;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class e implements ComponentCallbacks2 {
  private final Set<MemoryPressureListener> c = Collections.synchronizedSet(new LinkedHashSet<MemoryPressureListener>());
  
  e(Context paramContext) {
    paramContext.getApplicationContext().registerComponentCallbacks((ComponentCallbacks)this);
  }
  
  private void a(int paramInt) {
    Set<MemoryPressureListener> set = this.c;
    MemoryPressureListener[] arrayOfMemoryPressureListener = set.<MemoryPressureListener>toArray(new MemoryPressureListener[set.size()]);
    int j = arrayOfMemoryPressureListener.length;
    for (int i = 0; i < j; i++)
      arrayOfMemoryPressureListener[i].handleMemoryPressure(paramInt); 
  }
  
  public void a(MemoryPressureListener paramMemoryPressureListener) {
    this.c.add(paramMemoryPressureListener);
  }
  
  public void b(MemoryPressureListener paramMemoryPressureListener) {
    this.c.remove(paramMemoryPressureListener);
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration) {}
  
  public void onLowMemory() {}
  
  public void onTrimMemory(int paramInt) {
    a(paramInt);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/o/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */