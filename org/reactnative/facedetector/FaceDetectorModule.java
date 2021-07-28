package org.reactnative.facedetector;

import android.content.Context;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.reactnative.facedetector.c.a;

public class FaceDetectorModule extends ReactContextBaseJavaModule {
  private static final String TAG = "RNFaceDetector";
  
  private static ReactApplicationContext mScopedContext;
  
  public FaceDetectorModule(ReactApplicationContext paramReactApplicationContext) {
    super(paramReactApplicationContext);
    mScopedContext = paramReactApplicationContext;
  }
  
  @ReactMethod
  public void detectFaces(ReadableMap paramReadableMap, Promise paramPromise) {
    (new a((Context)mScopedContext, paramReadableMap, paramPromise)).execute((Object[])new Void[0]);
  }
  
  public Map<String, Object> getConstants() {
    return Collections.unmodifiableMap(new a());
  }
  
  public String getName() {
    return "RNFaceDetector";
  }
  
  class a extends HashMap<String, Object> {
    a() {
      put((K)"Mode", (V)c());
      put((K)"Landmarks", (V)b());
      put((K)"Classifications", (V)a());
    }
    
    private Map<String, Object> a() {
      return Collections.unmodifiableMap(new b());
    }
    
    private Map<String, Object> b() {
      return Collections.unmodifiableMap(new c());
    }
    
    private Map<String, Object> c() {
      return Collections.unmodifiableMap(new a());
    }
    
    class a extends HashMap<String, Object> {
      a() {
        put((K)"fast", (V)Integer.valueOf(b.m));
        put((K)"accurate", (V)Integer.valueOf(b.l));
      }
    }
    
    class b extends HashMap<String, Object> {
      b() {
        put((K)"all", (V)Integer.valueOf(b.h));
        put((K)"none", (V)Integer.valueOf(b.i));
      }
    }
    
    class c extends HashMap<String, Object> {
      c() {
        put((K)"all", (V)Integer.valueOf(b.j));
        put((K)"none", (V)Integer.valueOf(b.k));
      }
    }
  }
  
  class a extends HashMap<String, Object> {
    a() {
      put((K)"fast", (V)Integer.valueOf(b.m));
      put((K)"accurate", (V)Integer.valueOf(b.l));
    }
  }
  
  class b extends HashMap<String, Object> {
    b() {
      put((K)"all", (V)Integer.valueOf(b.h));
      put((K)"none", (V)Integer.valueOf(b.i));
    }
  }
  
  class c extends HashMap<String, Object> {
    c() {
      put((K)"all", (V)Integer.valueOf(b.j));
      put((K)"none", (V)Integer.valueOf(b.k));
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/org/reactnative/facedetector/FaceDetectorModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */