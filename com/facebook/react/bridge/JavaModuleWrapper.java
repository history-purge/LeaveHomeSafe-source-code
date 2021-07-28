package com.facebook.react.bridge;

import com.facebook.systrace.a;
import com.facebook.systrace.b;
import e.e.n.a.a;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

@a
public class JavaModuleWrapper {
  private final ArrayList<MethodDescriptor> mDescs;
  
  private final JSInstance mJSInstance;
  
  private final ArrayList<NativeModule.NativeMethod> mMethods;
  
  private final ModuleHolder mModuleHolder;
  
  public JavaModuleWrapper(JSInstance paramJSInstance, ModuleHolder paramModuleHolder) {
    this.mJSInstance = paramJSInstance;
    this.mModuleHolder = paramModuleHolder;
    this.mMethods = new ArrayList<NativeModule.NativeMethod>();
    this.mDescs = new ArrayList<MethodDescriptor>();
  }
  
  @a
  private void findMethods() {
    a.a(0L, "findMethods");
    HashSet hashSet = new HashSet();
    Class<?> clazz1 = this.mModuleHolder.getModule().getClass();
    Class<?> clazz2 = clazz1.getSuperclass();
    if (ReactModuleWithSpec.class.isAssignableFrom(clazz2))
      clazz1 = clazz2; 
    for (Method method : clazz1.getDeclaredMethods()) {
      ReactMethod reactMethod = method.<ReactMethod>getAnnotation(ReactMethod.class);
      if (reactMethod != null) {
        String str = method.getName();
        if (!hashSet.contains(str)) {
          MethodDescriptor methodDescriptor = new MethodDescriptor();
          JavaMethodWrapper javaMethodWrapper = new JavaMethodWrapper(this, method, reactMethod.isBlockingSynchronousMethod());
          methodDescriptor.name = str;
          methodDescriptor.type = javaMethodWrapper.getType();
          if (methodDescriptor.type == "sync") {
            methodDescriptor.signature = javaMethodWrapper.getSignature();
            methodDescriptor.method = method;
          } 
          this.mMethods.add(javaMethodWrapper);
          this.mDescs.add(methodDescriptor);
        } else {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Java Module ");
          stringBuilder.append(getName());
          stringBuilder.append(" method name already registered: ");
          stringBuilder.append(str);
          throw new IllegalArgumentException(stringBuilder.toString());
        } 
      } 
    } 
    a.a(0L);
  }
  
  @a
  public NativeMap getConstants() {
    if (!this.mModuleHolder.getHasConstants())
      return null; 
    String str = getName();
    b.b b = b.a(0L, "JavaModuleWrapper.getConstants");
    b.a("moduleName", str);
    b.a();
    ReactMarker.logMarker(ReactMarkerConstants.GET_CONSTANTS_START, str);
    BaseJavaModule baseJavaModule = getModule();
    a.a(0L, "module.getConstants");
    null = baseJavaModule.getConstants();
    a.a(0L);
    a.a(0L, "create WritableNativeMap");
    ReactMarker.logMarker(ReactMarkerConstants.CONVERT_CONSTANTS_START, str);
    try {
      return Arguments.makeNativeMap(null);
    } finally {
      ReactMarker.logMarker(ReactMarkerConstants.CONVERT_CONSTANTS_END, str);
      a.a(0L);
      ReactMarker.logMarker(ReactMarkerConstants.GET_CONSTANTS_END, str);
      b.a(0L).a();
    } 
  }
  
  @a
  public List<MethodDescriptor> getMethodDescriptors() {
    if (this.mDescs.isEmpty())
      findMethods(); 
    return this.mDescs;
  }
  
  @a
  public BaseJavaModule getModule() {
    return (BaseJavaModule)this.mModuleHolder.getModule();
  }
  
  @a
  public String getName() {
    return this.mModuleHolder.getName();
  }
  
  @a
  public void invoke(int paramInt, ReadableNativeArray paramReadableNativeArray) {
    ArrayList<NativeModule.NativeMethod> arrayList = this.mMethods;
    if (arrayList != null) {
      if (paramInt >= arrayList.size())
        return; 
      ((NativeModule.NativeMethod)this.mMethods.get(paramInt)).invoke(this.mJSInstance, paramReadableNativeArray);
    } 
  }
  
  @a
  public class MethodDescriptor {
    @a
    Method method;
    
    @a
    String name;
    
    @a
    String signature;
    
    @a
    String type;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/bridge/JavaModuleWrapper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */