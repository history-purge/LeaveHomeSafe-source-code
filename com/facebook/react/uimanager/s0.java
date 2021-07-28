package com.facebook.react.uimanager;

import com.facebook.react.common.f;
import com.facebook.systrace.b;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class s0 {
  static Map<String, Object> a() {
    return f.a("bubblingEventTypes", r0.a(), "directEventTypes", r0.c());
  }
  
  static Map<String, Object> a(UIManagerModule.g paramg) {
    Map<String, Object> map = r0.b();
    map.put("ViewManagerNames", paramg.a());
    map.put("LazyViewManagersEnabled", Boolean.valueOf(true));
    return map;
  }
  
  static Map<String, Object> a(ViewManager paramViewManager, Map<String, Object> paramMap1, Map<String, Object> paramMap2, Map paramMap3, Map paramMap4) {
    HashMap<String, Map<String, Object>> hashMap = f.b();
    Map<String, Object> map1 = paramViewManager.getExportedCustomBubblingEventTypeConstants();
    if (map1 != null) {
      a(paramMap3, map1);
      a(map1, paramMap1);
      hashMap.put("bubblingEventTypes", map1);
    } else if (paramMap1 != null) {
      hashMap.put("bubblingEventTypes", paramMap1);
    } 
    paramMap1 = paramViewManager.getExportedCustomDirectEventTypeConstants();
    if (paramMap1 != null) {
      a(paramMap4, paramMap1);
      a(paramMap1, paramMap2);
      hashMap.put("directEventTypes", paramMap1);
    } else if (paramMap2 != null) {
      hashMap.put("directEventTypes", paramMap2);
    } 
    paramMap1 = paramViewManager.getExportedViewConstants();
    if (paramMap1 != null)
      hashMap.put("Constants", paramMap1); 
    paramMap1 = (Map)paramViewManager.getCommandsMap();
    if (paramMap1 != null)
      hashMap.put("Commands", paramMap1); 
    Map<String, String> map = paramViewManager.getNativeProps();
    if (!map.isEmpty())
      hashMap.put("NativeProps", map); 
    return (Map)hashMap;
  }
  
  static Map<String, Object> a(List<ViewManager> paramList, Map<String, Object> paramMap1, Map<String, Object> paramMap2) {
    Map<String, Object> map = r0.b();
    Map<? extends String, ?> map1 = r0.a();
    Map<? extends String, ?> map2 = r0.c();
    if (paramMap1 != null)
      paramMap1.putAll(map1); 
    if (paramMap2 != null)
      paramMap2.putAll(map2); 
    for (ViewManager viewManager : paramList) {
      String str = viewManager.getName();
      b.b b = b.a(0L, "UIManagerModuleConstantsHelper.createConstants");
      b.a("ViewManager", str);
      b.a("Lazy", Boolean.valueOf(false));
      b.a();
      try {
        Map<String, Object> map3 = a(viewManager, null, null, paramMap1, paramMap2);
        if (!map3.isEmpty())
          map.put(str, map3); 
      } finally {
        b.a(0L);
      } 
    } 
    map.put("genericBubblingEventTypes", map1);
    map.put("genericDirectEventTypes", map2);
    return map;
  }
  
  private static void a(Map paramMap1, Map paramMap2) {
    if (paramMap1 != null && paramMap2 != null) {
      if (paramMap2.isEmpty())
        return; 
      for (Object object : paramMap2.keySet()) {
        Object object1 = paramMap2.get(object);
        Object object2 = paramMap1.get(object);
        if (object2 != null && object1 instanceof Map && object2 instanceof Map) {
          a((Map)object2, (Map)object1);
          continue;
        } 
        paramMap1.put(object, object1);
      } 
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/uimanager/s0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */