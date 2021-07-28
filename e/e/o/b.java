package e.e.o;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.devsupport.JSCHeapCapture;
import com.facebook.react.module.model.ReactModuleInfo;
import e.e.o.d0.a.a;
import java.util.HashMap;
import java.util.Map;

public class b extends z {
  public NativeModule a(String paramString, ReactApplicationContext paramReactApplicationContext) {
    byte b1;
    if (paramString.hashCode() == 133931840 && paramString.equals("JSCHeapCapture")) {
      b1 = 0;
    } else {
      b1 = -1;
    } 
    if (b1 == 0)
      return (NativeModule)new JSCHeapCapture(paramReactApplicationContext); 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("In CoreModulesPackage, could not find Native module for ");
    stringBuilder.append(paramString);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public com.facebook.react.module.model.a c() {
    try {
      return (com.facebook.react.module.model.a)Class.forName("com.facebook.react.DebugCorePackage$$ReactModuleInfoProvider").newInstance();
    } catch (ClassNotFoundException classNotFoundException) {
      Class[] arrayOfClass = new Class[1];
      int i = 0;
      arrayOfClass[0] = JSCHeapCapture.class;
      HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
      int j = arrayOfClass.length;
      while (i < j) {
        Class<?> clazz = arrayOfClass[i];
        a a = (a)clazz.getAnnotation(a.class);
        hashMap.put(a.name(), new ReactModuleInfo(a.name(), clazz.getName(), a.canOverrideExistingModule(), a.needsEagerInit(), a.hasConstants(), a.isCxxModule(), com.facebook.react.turbomodule.core.interfaces.a.class.isAssignableFrom(clazz)));
        i++;
      } 
      return new a(this, hashMap);
    } catch (InstantiationException instantiationException) {
      throw new RuntimeException("No ReactModuleInfoProvider for DebugCorePackage$$ReactModuleInfoProvider", instantiationException);
    } catch (IllegalAccessException illegalAccessException) {
      throw new RuntimeException("No ReactModuleInfoProvider for DebugCorePackage$$ReactModuleInfoProvider", illegalAccessException);
    } 
  }
  
  class a implements com.facebook.react.module.model.a {
    a(b this$0, Map param1Map) {}
    
    public Map<String, ReactModuleInfo> a() {
      return this.a;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/o/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */