package io.invertase.firebase.app;

import android.content.Context;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.google.firebase.g;
import f.a.a.a.b;
import io.invertase.firebase.common.ReactNativeFirebaseModule;
import io.invertase.firebase.common.e;
import io.invertase.firebase.common.f;
import io.invertase.firebase.common.g;
import io.invertase.firebase.common.h;
import io.invertase.firebase.common.i;
import io.invertase.firebase.common.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ReactNativeFirebaseAppModule extends ReactNativeFirebaseModule {
  private static final String TAG = "App";
  
  ReactNativeFirebaseAppModule(ReactApplicationContext paramReactApplicationContext) {
    super(paramReactApplicationContext, "App");
  }
  
  @ReactMethod
  public void deleteApp(String paramString, Promise paramPromise) {
    g g = g.a(paramString);
    if (g != null)
      g.a(); 
    paramPromise.resolve(null);
  }
  
  @ReactMethod
  public void eventsAddListener(String paramString) {
    g.b().a(paramString);
  }
  
  @ReactMethod
  public void eventsGetListeners(Promise paramPromise) {
    paramPromise.resolve(g.b().a());
  }
  
  @ReactMethod
  public void eventsNotifyReady(Boolean paramBoolean) {
    g.b().b(paramBoolean);
  }
  
  @ReactMethod
  public void eventsPing(String paramString, ReadableMap paramReadableMap, Promise paramPromise) {
    g.b().b((b)new f(paramString, e.a(paramReadableMap)));
    paramPromise.resolve(e.a(paramReadableMap));
  }
  
  @ReactMethod
  public void eventsRemoveListener(String paramString, Boolean paramBoolean) {
    g.b().a(paramString, paramBoolean);
  }
  
  public Map<String, Object> getConstants() {
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    ArrayList<Map> arrayList = new ArrayList();
    Iterator<g> iterator = g.b((Context)getReactApplicationContext()).iterator();
    while (iterator.hasNext())
      arrayList.add(e.a(iterator.next())); 
    hashMap.put("NATIVE_FIREBASE_APPS", arrayList);
    hashMap.put("FIREBASE_RAW_JSON", h.c().b());
    return (Map)hashMap;
  }
  
  public void initialize() {
    super.initialize();
    g.b().a(getContext());
  }
  
  @ReactMethod
  public void initializeApp(ReadableMap paramReadableMap1, ReadableMap paramReadableMap2, Promise paramPromise) {
    paramPromise.resolve(e.b(e.a(paramReadableMap1, paramReadableMap2, (Context)getContext())));
  }
  
  @ReactMethod
  public void jsonGetAll(Promise paramPromise) {
    paramPromise.resolve(h.c().a());
  }
  
  @ReactMethod
  public void metaGetAll(Promise paramPromise) {
    paramPromise.resolve(i.c().a());
  }
  
  @ReactMethod
  public void preferencesClearAll(Promise paramPromise) {
    j.d().a();
    paramPromise.resolve(null);
  }
  
  @ReactMethod
  public void preferencesGetAll(Promise paramPromise) {
    paramPromise.resolve(j.d().b());
  }
  
  @ReactMethod
  public void preferencesSetBool(String paramString, boolean paramBoolean, Promise paramPromise) {
    j.d().a(paramString, paramBoolean);
    paramPromise.resolve(null);
  }
  
  @ReactMethod
  public void preferencesSetString(String paramString1, String paramString2, Promise paramPromise) {
    j.d().a(paramString1, paramString2);
    paramPromise.resolve(null);
  }
  
  @ReactMethod
  public void setAutomaticDataCollectionEnabled(String paramString, Boolean paramBoolean) {
    g.a(paramString).a(paramBoolean);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/io/invertase/firebase/app/ReactNativeFirebaseAppModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */