package com.facebook.react.bridge;

import com.facebook.systrace.a;
import e.e.m.a.a;
import e.e.o.d0.a.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class NativeModuleRegistry {
  private final Map<String, ModuleHolder> mModules;
  
  private final ReactApplicationContext mReactApplicationContext;
  
  public NativeModuleRegistry(ReactApplicationContext paramReactApplicationContext, Map<String, ModuleHolder> paramMap) {
    this.mReactApplicationContext = paramReactApplicationContext;
    this.mModules = paramMap;
  }
  
  private Map<String, ModuleHolder> getModuleMap() {
    return this.mModules;
  }
  
  private ReactApplicationContext getReactApplicationContext() {
    return this.mReactApplicationContext;
  }
  
  public List<NativeModule> getAllModules() {
    ArrayList<NativeModule> arrayList = new ArrayList();
    Iterator<ModuleHolder> iterator = this.mModules.values().iterator();
    while (iterator.hasNext())
      arrayList.add(((ModuleHolder)iterator.next()).getModule()); 
    return arrayList;
  }
  
  Collection<ModuleHolder> getCxxModules() {
    ArrayList<ModuleHolder> arrayList = new ArrayList();
    for (Map.Entry<String, ModuleHolder> entry : this.mModules.entrySet()) {
      if (((ModuleHolder)entry.getValue()).isCxxModule())
        arrayList.add(entry.getValue()); 
    } 
    return arrayList;
  }
  
  Collection<JavaModuleWrapper> getJavaModules(JSInstance paramJSInstance) {
    ArrayList<JavaModuleWrapper> arrayList = new ArrayList();
    for (Map.Entry<String, ModuleHolder> entry : this.mModules.entrySet()) {
      if (!((ModuleHolder)entry.getValue()).isCxxModule())
        arrayList.add(new JavaModuleWrapper(paramJSInstance, (ModuleHolder)entry.getValue())); 
    } 
    return arrayList;
  }
  
  public <T extends NativeModule> T getModule(Class<T> paramClass) {
    a a = paramClass.<a>getAnnotation(a.class);
    if (a != null) {
      ModuleHolder moduleHolder = (ModuleHolder)this.mModules.get(a.name());
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append(a.name());
      stringBuilder1.append(" could not be found. Is it defined in ");
      stringBuilder1.append(paramClass.getName());
      a.a(moduleHolder, stringBuilder1.toString());
      return (T)((ModuleHolder)moduleHolder).getModule();
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Could not find @ReactModule annotation in class ");
    stringBuilder.append(paramClass.getName());
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public NativeModule getModule(String paramString) {
    ModuleHolder moduleHolder = (ModuleHolder)this.mModules.get(paramString);
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Could not find module with name ");
    stringBuilder.append(paramString);
    a.a(moduleHolder, stringBuilder.toString());
    return ((ModuleHolder)moduleHolder).getModule();
  }
  
  public <T extends NativeModule> boolean hasModule(Class<T> paramClass) {
    String str = ((a)paramClass.<a>getAnnotation(a.class)).name();
    return this.mModules.containsKey(str);
  }
  
  public boolean hasModule(String paramString) {
    return this.mModules.containsKey(paramString);
  }
  
  void notifyJSInstanceDestroy() {
    this.mReactApplicationContext.assertOnNativeModulesQueueThread();
    a.a(0L, "NativeModuleRegistry_notifyJSInstanceDestroy");
    try {
      Iterator<ModuleHolder> iterator = this.mModules.values().iterator();
      while (iterator.hasNext())
        ((ModuleHolder)iterator.next()).destroy(); 
      return;
    } finally {
      a.a(0L);
    } 
  }
  
  void notifyJSInstanceInitialized() {
    this.mReactApplicationContext.assertOnNativeModulesQueueThread("From version React Native v0.44, native modules are explicitly not initialized on the UI thread. See https://github.com/facebook/react-native/wiki/Breaking-Changes#d4611211-reactnativeandroidbreaking-move-nativemodule-initialization-off-ui-thread---aaachiuuu  for more details.");
    ReactMarker.logMarker(ReactMarkerConstants.NATIVE_MODULE_INITIALIZE_START);
    a.a(0L, "NativeModuleRegistry_notifyJSInstanceInitialized");
    try {
      Iterator<ModuleHolder> iterator = this.mModules.values().iterator();
      while (iterator.hasNext())
        ((ModuleHolder)iterator.next()).markInitializable(); 
      return;
    } finally {
      a.a(0L);
      ReactMarker.logMarker(ReactMarkerConstants.NATIVE_MODULE_INITIALIZE_END);
    } 
  }
  
  public void onBatchComplete() {
    ModuleHolder moduleHolder = this.mModules.get("UIManager");
    if (moduleHolder != null && moduleHolder.hasInstance())
      ((OnBatchCompleteListener)moduleHolder.getModule()).onBatchComplete(); 
  }
  
  void registerModules(NativeModuleRegistry paramNativeModuleRegistry) {
    a.a(this.mReactApplicationContext.equals(paramNativeModuleRegistry.getReactApplicationContext()), "Extending native modules with non-matching application contexts.");
    for (Map.Entry<String, ModuleHolder> entry : paramNativeModuleRegistry.getModuleMap().entrySet()) {
      String str = (String)entry.getKey();
      if (!this.mModules.containsKey(str)) {
        ModuleHolder moduleHolder = (ModuleHolder)entry.getValue();
        this.mModules.put(str, moduleHolder);
      } 
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/bridge/NativeModuleRegistry.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */