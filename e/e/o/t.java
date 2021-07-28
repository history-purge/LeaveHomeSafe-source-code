package e.e.o;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.List;

@Deprecated
public abstract class t implements v {
  public abstract List<NativeModule> a(ReactApplicationContext paramReactApplicationContext, r paramr);
  
  public List<NativeModule> createNativeModules(ReactApplicationContext paramReactApplicationContext) {
    throw new RuntimeException("ReactInstancePackage must be passed in the ReactInstanceManager.");
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/o/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */