package io.invertase.firebase.messaging;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.WritableMap;
import com.google.firebase.messaging.j0;
import io.invertase.firebase.common.f;
import io.invertase.firebase.common.k;
import java.util.Map;

public class o {
  static WritableMap a(j0.c paramc) {
    WritableMap writableMap1 = Arguments.createMap();
    WritableMap writableMap2 = Arguments.createMap();
    if (paramc.n() != null)
      writableMap1.putString("title", paramc.n()); 
    if (paramc.p() != null)
      writableMap1.putString("titleLocKey", paramc.p()); 
    if (paramc.o() != null)
      writableMap1.putArray("titleLocArgs", (ReadableArray)Arguments.fromJavaArgs((Object[])paramc.o())); 
    if (paramc.a() != null)
      writableMap1.putString("body", paramc.a()); 
    if (paramc.c() != null)
      writableMap1.putString("bodyLocKey", paramc.c()); 
    if (paramc.b() != null)
      writableMap1.putArray("bodyLocArgs", (ReadableArray)Arguments.fromJavaArgs((Object[])paramc.b())); 
    if (paramc.d() != null)
      writableMap2.putString("channelId", paramc.d()); 
    if (paramc.e() != null)
      writableMap2.putString("clickAction", paramc.e()); 
    if (paramc.f() != null)
      writableMap2.putString("color", paramc.f()); 
    if (paramc.g() != null)
      writableMap2.putString("smallIcon", paramc.g()); 
    if (paramc.h() != null)
      writableMap2.putString("imageUrl", paramc.h().toString()); 
    if (paramc.i() != null)
      writableMap2.putString("link", paramc.i().toString()); 
    if (paramc.j() != null)
      writableMap2.putInt("count", paramc.j().intValue()); 
    if (paramc.k() != null)
      writableMap2.putInt("priority", paramc.k().intValue()); 
    if (paramc.l() != null)
      writableMap2.putString("sound", paramc.l()); 
    if (paramc.m() != null)
      writableMap2.putString("ticker", paramc.m()); 
    if (paramc.q() != null)
      writableMap2.putInt("visibility", paramc.q().intValue()); 
    writableMap1.putMap("android", (ReadableMap)writableMap2);
    return writableMap1;
  }
  
  static WritableMap a(j0 paramj0) {
    WritableMap writableMap1 = Arguments.createMap();
    WritableMap writableMap2 = Arguments.createMap();
    if (paramj0.b() != null)
      writableMap1.putString("collapseKey", paramj0.b()); 
    if (paramj0.d() != null)
      writableMap1.putString("from", paramj0.d()); 
    if (paramj0.v() != null)
      writableMap1.putString("to", paramj0.v()); 
    if (paramj0.e() != null)
      writableMap1.putString("messageId", paramj0.e()); 
    if (paramj0.r() != null)
      writableMap1.putString("messageType", paramj0.r()); 
    if (paramj0.c().size() > 0)
      for (Map.Entry entry : paramj0.c().entrySet())
        writableMap2.putString((String)entry.getKey(), (String)entry.getValue());  
    writableMap1.putMap("data", (ReadableMap)writableMap2);
    writableMap1.putDouble("ttl", paramj0.x());
    writableMap1.putDouble("sentTime", paramj0.u());
    if (paramj0.t() != null)
      writableMap1.putMap("notification", (ReadableMap)a(paramj0.t())); 
    return writableMap1;
  }
  
  static j0 a(ReadableMap paramReadableMap) {
    j0.b b = new j0.b(paramReadableMap.getString("to"));
    if (paramReadableMap.hasKey("ttl"))
      b.a(paramReadableMap.getInt("ttl")); 
    if (paramReadableMap.hasKey("messageId"))
      b.b(paramReadableMap.getString("messageId")); 
    if (paramReadableMap.hasKey("messageType"))
      b.c(paramReadableMap.getString("messageType")); 
    if (paramReadableMap.hasKey("collapseKey"))
      b.a(paramReadableMap.getString("collapseKey")); 
    if (paramReadableMap.hasKey("data")) {
      paramReadableMap = paramReadableMap.getMap("data");
      ReadableMapKeySetIterator readableMapKeySetIterator = paramReadableMap.keySetIterator();
      while (readableMapKeySetIterator.hasNextKey()) {
        String str = readableMapKeySetIterator.nextKey();
        b.a(str, paramReadableMap.getString(str));
      } 
    } 
    return b.a();
  }
  
  public static f a() {
    return new f("messaging_message_deleted", Arguments.createMap());
  }
  
  public static f a(j0 paramj0, Boolean paramBoolean) {
    String str;
    if (paramBoolean.booleanValue()) {
      str = "messaging_notification_opened";
    } else {
      str = "messaging_message_received";
    } 
    return new f(str, a(paramj0));
  }
  
  public static f a(String paramString) {
    WritableMap writableMap = Arguments.createMap();
    writableMap.putString("messageId", paramString);
    return new f("messaging_message_sent", writableMap);
  }
  
  public static f a(String paramString, Exception paramException) {
    WritableMap writableMap = Arguments.createMap();
    writableMap.putString("messageId", paramString);
    writableMap.putMap("error", (ReadableMap)k.a(paramException));
    return new f("messaging_message_send_error", writableMap);
  }
  
  public static f b(String paramString) {
    WritableMap writableMap = Arguments.createMap();
    writableMap.putString("token", paramString);
    return new f("messaging_token_refresh", writableMap);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/io/invertase/firebase/messaging/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */