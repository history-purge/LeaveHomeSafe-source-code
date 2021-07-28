package com.facebook.react.modules.debug;

import com.facebook.fbreact.specs.NativeSourceCodeSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import e.e.m.a.a;
import e.e.o.d0.a.a;
import java.util.HashMap;
import java.util.Map;

@a(name = "SourceCode")
public class SourceCodeModule extends NativeSourceCodeSpec {
  public static final String NAME = "SourceCode";
  
  public SourceCodeModule(ReactApplicationContext paramReactApplicationContext) {
    super(paramReactApplicationContext);
  }
  
  public String getName() {
    return "SourceCode";
  }
  
  protected Map<String, Object> getTypedExportedConstants() {
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    String str = getReactApplicationContext().getSourceURL();
    a.a(str, "No source URL loaded, have you initialised the instance?");
    hashMap.put("scriptURL", str);
    return (Map)hashMap;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/modules/debug/SourceCodeModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */