package io.invertase.firebase.common;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import f.a.a.a.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class g {
  private static g g = new g();
  
  private final List<b> a = new ArrayList<b>();
  
  private final Handler b = new Handler(Looper.getMainLooper());
  
  private final HashMap<String, Integer> c = new HashMap<String, Integer>();
  
  private ReactContext d;
  
  private Boolean e = Boolean.valueOf(false);
  
  private int f;
  
  public static g b() {
    return g;
  }
  
  private void c() {
    synchronized (this.c) {
      for (b b : new ArrayList(this.a)) {
        if (this.c.containsKey(b.a())) {
          this.a.remove(b);
          b(b);
        } 
      } 
      return;
    } 
  }
  
  private boolean c(b paramb) {
    if (this.e.booleanValue()) {
      ReactContext reactContext = this.d;
      if (reactContext != null) {
        if (!reactContext.hasActiveCatalystInstance())
          return false; 
        try {
          DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter = (DeviceEventManagerModule.RCTDeviceEventEmitter)this.d.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class);
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("rnfb_");
          stringBuilder.append(paramb.a());
          rCTDeviceEventEmitter.emit(stringBuilder.toString(), paramb.b());
          return true;
        } catch (Exception exception) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Error sending Event ");
          stringBuilder.append(paramb.a());
          Log.wtf("RNFB_EMITTER", stringBuilder.toString(), exception);
        } 
      } 
    } 
    return false;
  }
  
  public WritableMap a() {
    null = Arguments.createMap();
    WritableMap writableMap = Arguments.createMap();
    null.putInt("listeners", this.f);
    null.putInt("queued", this.a.size());
    synchronized (this.c) {
      for (Map.Entry<String, Integer> entry : this.c.entrySet())
        writableMap.putInt((String)entry.getKey(), ((Integer)entry.getValue()).intValue()); 
      null.putMap("events", (ReadableMap)writableMap);
      return null;
    } 
  }
  
  public void a(ReactContext paramReactContext) {
    this.b.post(new d(this, paramReactContext));
  }
  
  public void a(String paramString) {
    synchronized (this.c) {
      this.f++;
      if (!this.c.containsKey(paramString)) {
        this.c.put(paramString, Integer.valueOf(1));
      } else {
        int i = ((Integer)this.c.get(paramString)).intValue();
        this.c.put(paramString, Integer.valueOf(i + 1));
      } 
      this.b.post(new c(this));
      return;
    } 
  }
  
  public void a(String paramString, Boolean paramBoolean) {
    synchronized (this.c) {
      if (this.c.containsKey(paramString)) {
        int i = ((Integer)this.c.get(paramString)).intValue();
        if (i <= 1 || paramBoolean.booleanValue()) {
          this.c.remove(paramString);
        } else {
          this.c.put(paramString, Integer.valueOf(i - 1));
        } 
        int j = this.f;
        if (!paramBoolean.booleanValue())
          i = 1; 
        this.f = j - i;
      } 
      return;
    } 
  }
  
  public void b(b paramb) {
    this.b.post(new b(this, paramb));
  }
  
  public void b(Boolean paramBoolean) {
    this.b.post(new a(this, paramBoolean));
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/io/invertase/firebase/common/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */