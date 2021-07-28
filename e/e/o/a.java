package e.e.o;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.devsupport.LogBoxModule;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.core.ExceptionsManagerModule;
import com.facebook.react.modules.core.HeadlessJsTaskSupportModule;
import com.facebook.react.modules.core.TimingModule;
import com.facebook.react.modules.debug.DevSettingsModule;
import com.facebook.react.modules.debug.SourceCodeModule;
import com.facebook.react.modules.deviceinfo.DeviceInfoModule;
import com.facebook.react.modules.systeminfo.AndroidInfoModule;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.p0;
import e.e.o.d0.a.a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class a extends z implements x {
  private final r a;
  
  private final com.facebook.react.modules.core.b b;
  
  private final boolean c;
  
  private final int d;
  
  public a(r paramr, com.facebook.react.modules.core.b paramb, p0 paramp0, boolean paramBoolean, int paramInt) {
    this.a = paramr;
    this.b = paramb;
    this.c = paramBoolean;
    this.d = paramInt;
  }
  
  private UIManagerModule c(ReactApplicationContext paramReactApplicationContext) {
    ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_START);
    com.facebook.systrace.a.a(0L, "createUIManagerModule");
    try {
      if (this.c) {
        uIManagerModule = new UIManagerModule(paramReactApplicationContext, new b(this), this.d);
        return uIManagerModule;
      } 
      UIManagerModule uIManagerModule = new UIManagerModule((ReactApplicationContext)uIManagerModule, this.a.a((ReactApplicationContext)uIManagerModule), this.d);
      return uIManagerModule;
    } finally {
      com.facebook.systrace.a.a(0L);
      ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_END);
    } 
  }
  
  public NativeModule a(String paramString, ReactApplicationContext paramReactApplicationContext) {
    StringBuilder stringBuilder;
    byte b1;
    switch (paramString.hashCode()) {
      default:
        b1 = -1;
        break;
      case 1861242489:
        if (paramString.equals("UIManager")) {
          b1 = 8;
          break;
        } 
      case 1256514152:
        if (paramString.equals("HeadlessJsTaskSupport")) {
          b1 = 5;
          break;
        } 
      case 881516744:
        if (paramString.equals("SourceCode")) {
          b1 = 6;
          break;
        } 
      case 512434409:
        if (paramString.equals("ExceptionsManager")) {
          b1 = 3;
          break;
        } 
      case -790603268:
        if (paramString.equals("PlatformConstants")) {
          b1 = 0;
          break;
        } 
      case -1037217463:
        if (paramString.equals("DeviceEventManager")) {
          b1 = 1;
          break;
        } 
      case -1520650172:
        if (paramString.equals("DeviceInfo")) {
          b1 = 9;
          break;
        } 
      case -1633589448:
        if (paramString.equals("DevSettings")) {
          b1 = 2;
          break;
        } 
      case -1789797270:
        if (paramString.equals("Timing")) {
          b1 = 7;
          break;
        } 
      case -2013505529:
        if (paramString.equals("LogBox")) {
          b1 = 4;
          break;
        } 
    } 
    switch (b1) {
      default:
        stringBuilder = new StringBuilder();
        stringBuilder.append("In CoreModulesPackage, could not find Native module for ");
        stringBuilder.append(paramString);
        throw new IllegalArgumentException(stringBuilder.toString());
      case 9:
        return (NativeModule)new DeviceInfoModule((ReactApplicationContext)stringBuilder);
      case 8:
        return (NativeModule)c((ReactApplicationContext)stringBuilder);
      case 7:
        return (NativeModule)new TimingModule((ReactApplicationContext)stringBuilder, this.a.c());
      case 6:
        return (NativeModule)new SourceCodeModule((ReactApplicationContext)stringBuilder);
      case 5:
        return (NativeModule)new HeadlessJsTaskSupportModule((ReactApplicationContext)stringBuilder);
      case 4:
        return (NativeModule)new LogBoxModule((ReactApplicationContext)stringBuilder, this.a.c());
      case 3:
        return (NativeModule)new ExceptionsManagerModule(this.a.c());
      case 2:
        return (NativeModule)new DevSettingsModule((ReactApplicationContext)stringBuilder, this.a.c());
      case 1:
        return (NativeModule)new DeviceEventManagerModule((ReactApplicationContext)stringBuilder, this.b);
      case 0:
        break;
    } 
    return (NativeModule)new AndroidInfoModule((ReactApplicationContext)stringBuilder);
  }
  
  public void a() {
    ReactMarker.logMarker(ReactMarkerConstants.PROCESS_CORE_REACT_PACKAGE_START);
  }
  
  public void b() {
    ReactMarker.logMarker(ReactMarkerConstants.PROCESS_CORE_REACT_PACKAGE_END);
  }
  
  public com.facebook.react.module.model.a c() {
    try {
      return (com.facebook.react.module.model.a)Class.forName("com.facebook.react.CoreModulesPackage$$ReactModuleInfoProvider").newInstance();
    } catch (ClassNotFoundException classNotFoundException) {
      Class[] arrayOfClass = new Class[10];
      int i = 0;
      arrayOfClass[0] = AndroidInfoModule.class;
      arrayOfClass[1] = DeviceEventManagerModule.class;
      arrayOfClass[2] = DeviceInfoModule.class;
      arrayOfClass[3] = DevSettingsModule.class;
      arrayOfClass[4] = ExceptionsManagerModule.class;
      arrayOfClass[5] = LogBoxModule.class;
      arrayOfClass[6] = HeadlessJsTaskSupportModule.class;
      arrayOfClass[7] = SourceCodeModule.class;
      arrayOfClass[8] = TimingModule.class;
      arrayOfClass[9] = UIManagerModule.class;
      HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
      int j = arrayOfClass.length;
      while (i < j) {
        Class<?> clazz = arrayOfClass[i];
        a a1 = (a)clazz.getAnnotation(a.class);
        hashMap.put(a1.name(), new ReactModuleInfo(a1.name(), clazz.getName(), a1.canOverrideExistingModule(), a1.needsEagerInit(), a1.hasConstants(), a1.isCxxModule(), com.facebook.react.turbomodule.core.interfaces.a.class.isAssignableFrom(clazz)));
        i++;
      } 
      return new a(this, hashMap);
    } catch (InstantiationException instantiationException) {
      throw new RuntimeException("No ReactModuleInfoProvider for CoreModulesPackage$$ReactModuleInfoProvider", instantiationException);
    } catch (IllegalAccessException illegalAccessException) {
      throw new RuntimeException("No ReactModuleInfoProvider for CoreModulesPackage$$ReactModuleInfoProvider", illegalAccessException);
    } 
  }
  
  class a implements com.facebook.react.module.model.a {
    a(a this$0, Map param1Map) {}
    
    public Map<String, ReactModuleInfo> a() {
      return this.a;
    }
  }
  
  class b implements UIManagerModule.g {
    b(a this$0) {}
    
    public ViewManager a(String param1String) {
      return a.a(this.a).a(param1String);
    }
    
    public List<String> a() {
      return a.a(this.a).d();
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/o/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */