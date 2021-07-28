package com.facebook.react.bridge;

import e.e.e.e.a;
import e.e.o.d0.a.a;
import javax.inject.Provider;

public class ModuleSpec {
  private static final String TAG = "ModuleSpec";
  
  private final String mName;
  
  private final Provider<? extends NativeModule> mProvider;
  
  private final Class<? extends NativeModule> mType = null;
  
  private ModuleSpec(Provider<? extends NativeModule> paramProvider) {
    this.mProvider = paramProvider;
    this.mName = null;
  }
  
  private ModuleSpec(Provider<? extends NativeModule> paramProvider, String paramString) {
    this.mProvider = paramProvider;
    this.mName = paramString;
  }
  
  public static ModuleSpec nativeModuleSpec(Class<? extends NativeModule> paramClass, Provider<? extends NativeModule> paramProvider) {
    StringBuilder stringBuilder;
    a a = paramClass.<a>getAnnotation(a.class);
    if (a == null) {
      stringBuilder = new StringBuilder();
      stringBuilder.append("Could not find @ReactModule annotation on ");
      stringBuilder.append(paramClass.getName());
      stringBuilder.append(". So creating the module eagerly to get the name. Consider adding an annotation to make this Lazy");
      a.e("ModuleSpec", stringBuilder.toString());
      return new ModuleSpec(paramProvider, ((NativeModule)paramProvider.get()).getName());
    } 
    return new ModuleSpec(paramProvider, stringBuilder.name());
  }
  
  public static ModuleSpec nativeModuleSpec(String paramString, Provider<? extends NativeModule> paramProvider) {
    return new ModuleSpec(paramProvider, paramString);
  }
  
  public static ModuleSpec viewManagerSpec(Provider<? extends NativeModule> paramProvider) {
    return new ModuleSpec(paramProvider);
  }
  
  public String getName() {
    return this.mName;
  }
  
  public Provider<? extends NativeModule> getProvider() {
    return this.mProvider;
  }
  
  public Class<? extends NativeModule> getType() {
    return this.mType;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/bridge/ModuleSpec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */