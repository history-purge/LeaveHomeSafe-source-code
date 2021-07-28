package io.invertase.firebase.common;

import android.content.Context;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.google.firebase.g;
import com.google.firebase.j;
import java.util.HashMap;
import java.util.Map;

public class e {
  public static WritableMap a(ReadableMap paramReadableMap) {
    WritableMap writableMap = Arguments.createMap();
    writableMap.merge(paramReadableMap);
    return writableMap;
  }
  
  public static g a(ReadableMap paramReadableMap1, ReadableMap paramReadableMap2, Context paramContext) {
    g g;
    j.b b = new j.b();
    String str = paramReadableMap2.getString("name");
    b.a(paramReadableMap1.getString("apiKey"));
    b.b(paramReadableMap1.getString("appId"));
    b.f(paramReadableMap1.getString("projectId"));
    b.c(paramReadableMap1.getString("databaseURL"));
    if (paramReadableMap1.hasKey("gaTrackingId"))
      b.d(paramReadableMap1.getString("gaTrackingId")); 
    b.g(paramReadableMap1.getString("storageBucket"));
    b.e(paramReadableMap1.getString("messagingSenderId"));
    if (str.equals("[DEFAULT]")) {
      g = g.a(paramContext, b.a());
    } else {
      g = g.a(paramContext, b.a(), str);
    } 
    if (paramReadableMap2.hasKey("automaticDataCollectionEnabled"))
      g.b(paramReadableMap2.getBoolean("automaticDataCollectionEnabled")); 
    if (paramReadableMap2.hasKey("automaticResourceManagement"))
      g.a(paramReadableMap2.getBoolean("automaticResourceManagement")); 
    return g;
  }
  
  public static Map<String, Object> a(g paramg) {
    String str = paramg.c();
    j j = paramg.d();
    HashMap<Object, Object> hashMap1 = new HashMap<Object, Object>();
    HashMap<Object, Object> hashMap2 = new HashMap<Object, Object>();
    HashMap<Object, Object> hashMap3 = new HashMap<Object, Object>();
    hashMap3.put("name", str);
    hashMap3.put("automaticDataCollectionEnabled", Boolean.valueOf(paramg.f()));
    hashMap2.put("apiKey", j.a());
    hashMap2.put("appId", j.b());
    hashMap2.put("projectId", j.f());
    hashMap2.put("databaseURL", j.c());
    hashMap2.put("gaTrackingId", j.d());
    hashMap2.put("messagingSenderId", j.e());
    hashMap2.put("storageBucket", j.g());
    hashMap1.put("options", hashMap2);
    hashMap1.put("appConfig", hashMap3);
    return (Map)hashMap1;
  }
  
  public static WritableMap b(g paramg) {
    return (WritableMap)Arguments.makeNativeMap(a(paramg));
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/io/invertase/firebase/common/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */