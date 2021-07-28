package com.facebook.react.modules.fresco;

import android.net.Uri;
import android.os.SystemClock;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import e.e.l.b.a.b;
import e.e.l.n.f0;
import e.e.l.n.s;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;

class b extends b {
  public b(OkHttpClient paramOkHttpClient) {
    super(paramOkHttpClient);
    paramOkHttpClient.dispatcher().executorService();
  }
  
  private Map<String, String> a(ReadableMap paramReadableMap) {
    if (paramReadableMap == null)
      return null; 
    ReadableMapKeySetIterator readableMapKeySetIterator = paramReadableMap.keySetIterator();
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    while (readableMapKeySetIterator.hasNextKey()) {
      String str = readableMapKeySetIterator.nextKey();
      hashMap.put(str, paramReadableMap.getString(str));
    } 
    return (Map)hashMap;
  }
  
  public void a(b.c paramc, f0.a parama) {
    Map<?, ?> map1;
    paramc.f = SystemClock.elapsedRealtime();
    Uri uri = paramc.h();
    if (paramc.b().f() instanceof a) {
      map1 = a(((a)paramc.b().f()).u());
    } else {
      map1 = null;
    } 
    Map<?, ?> map2 = map1;
    if (map1 == null)
      map2 = Collections.emptyMap(); 
    a(paramc, parama, (new Request.Builder()).cacheControl((new CacheControl.Builder()).noStore().build()).url(uri.toString()).headers(Headers.of(map2)).get().build());
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/modules/fresco/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */