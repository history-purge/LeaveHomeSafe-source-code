package com.th3rdwave.safeareacontext;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.f;
import com.facebook.react.uimanager.q;
import java.util.Map;

class l {
  static Map<String, Float> a(a parama) {
    return f.a("top", Float.valueOf(q.a(parama.a)), "right", Float.valueOf(q.a(parama.b)), "bottom", Float.valueOf(q.a(parama.c)), "left", Float.valueOf(q.a(parama.d)));
  }
  
  static Map<String, Float> a(c paramc) {
    return f.a("x", Float.valueOf(q.a(paramc.a)), "y", Float.valueOf(q.a(paramc.b)), "width", Float.valueOf(q.a(paramc.c)), "height", Float.valueOf(q.a(paramc.d)));
  }
  
  static WritableMap b(a parama) {
    WritableMap writableMap = Arguments.createMap();
    writableMap.putDouble("top", q.a(parama.a));
    writableMap.putDouble("right", q.a(parama.b));
    writableMap.putDouble("bottom", q.a(parama.c));
    writableMap.putDouble("left", q.a(parama.d));
    return writableMap;
  }
  
  static WritableMap b(c paramc) {
    WritableMap writableMap = Arguments.createMap();
    writableMap.putDouble("x", q.a(paramc.a));
    writableMap.putDouble("y", q.a(paramc.b));
    writableMap.putDouble("width", q.a(paramc.c));
    writableMap.putDouble("height", q.a(paramc.d));
    return writableMap;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/th3rdwave/safeareacontext/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */