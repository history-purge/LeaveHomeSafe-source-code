package org.reactnative.camera;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.n0;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import org.reactnative.camera.h.d;

public class CameraModule extends ReactContextBaseJavaModule {
  static final int GOOGLE_VISION_BARCODE_MODE_ALTERNATE = 1;
  
  static final int GOOGLE_VISION_BARCODE_MODE_INVERTED = 2;
  
  static final int GOOGLE_VISION_BARCODE_MODE_NORMAL = 0;
  
  private static final String TAG = "CameraModule";
  
  public static final Map<String, Object> VALID_BARCODE_TYPES = Collections.unmodifiableMap(new e());
  
  static final int VIDEO_1080P = 1;
  
  static final int VIDEO_2160P = 0;
  
  static final int VIDEO_480P = 3;
  
  static final int VIDEO_4x3 = 4;
  
  static final int VIDEO_720P = 2;
  
  private d mScopedContext;
  
  public CameraModule(ReactApplicationContext paramReactApplicationContext) {
    super(paramReactApplicationContext);
    this.mScopedContext = new d((Context)paramReactApplicationContext);
  }
  
  @ReactMethod
  public void checkIfRecordAudioPermissionsAreDefined(Promise paramPromise) {
    try {
      PackageInfo packageInfo = getCurrentActivity().getPackageManager().getPackageInfo(getReactApplicationContext().getPackageName(), 4096);
      if (packageInfo.requestedPermissions != null) {
        String[] arrayOfString = packageInfo.requestedPermissions;
        int j = arrayOfString.length;
        for (int i = 0; i < j; i++) {
          if (arrayOfString[i].equals("android.permission.RECORD_AUDIO")) {
            paramPromise.resolve(Boolean.valueOf(true));
            return;
          } 
        } 
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
    paramPromise.resolve(Boolean.valueOf(false));
  }
  
  @ReactMethod
  public void getAvailablePictureSizes(String paramString, int paramInt, Promise paramPromise) {
    ((UIManagerModule)getReactApplicationContext().getNativeModule(UIManagerModule.class)).addUIBlock(new c(this, paramInt, paramString, paramPromise));
  }
  
  @ReactMethod
  public void getCameraIds(int paramInt, Promise paramPromise) {
    ((UIManagerModule)getReactApplicationContext().getNativeModule(UIManagerModule.class)).addUIBlock(new b(this, paramInt, paramPromise));
  }
  
  public Map<String, Object> getConstants() {
    return Collections.unmodifiableMap(new f());
  }
  
  public String getName() {
    return "RNCameraModule";
  }
  
  public d getScopedContext() {
    return this.mScopedContext;
  }
  
  @ReactMethod
  public void getSupportedPreviewFpsRange(int paramInt, Promise paramPromise) {
    ((UIManagerModule)getReactApplicationContext().getNativeModule(UIManagerModule.class)).addUIBlock(new d(this, paramInt, paramPromise));
  }
  
  @ReactMethod
  public void getSupportedRatios(int paramInt, Promise paramPromise) {
    ((UIManagerModule)getReactApplicationContext().getNativeModule(UIManagerModule.class)).addUIBlock(new a(this, paramInt, paramPromise));
  }
  
  @ReactMethod
  public void pausePreview(int paramInt) {
    ((UIManagerModule)getReactApplicationContext().getNativeModule(UIManagerModule.class)).addUIBlock(new g(this, paramInt));
  }
  
  @ReactMethod
  public void pauseRecording(int paramInt) {
    ((UIManagerModule)getReactApplicationContext().getNativeModule(UIManagerModule.class)).addUIBlock(new l(this, paramInt));
  }
  
  @ReactMethod
  public void record(ReadableMap paramReadableMap, int paramInt, Promise paramPromise) {
    ReactApplicationContext reactApplicationContext = getReactApplicationContext();
    File file = this.mScopedContext.a();
    ((UIManagerModule)reactApplicationContext.getNativeModule(UIManagerModule.class)).addUIBlock(new j(this, paramInt, paramReadableMap, paramPromise, file));
  }
  
  @ReactMethod
  public void resumePreview(int paramInt) {
    ((UIManagerModule)getReactApplicationContext().getNativeModule(UIManagerModule.class)).addUIBlock(new h(this, paramInt));
  }
  
  @ReactMethod
  public void resumeRecording(int paramInt) {
    ((UIManagerModule)getReactApplicationContext().getNativeModule(UIManagerModule.class)).addUIBlock(new m(this, paramInt));
  }
  
  @ReactMethod
  public void stopRecording(int paramInt) {
    ((UIManagerModule)getReactApplicationContext().getNativeModule(UIManagerModule.class)).addUIBlock(new k(this, paramInt));
  }
  
  @ReactMethod
  public void takePicture(ReadableMap paramReadableMap, int paramInt, Promise paramPromise) {
    ReactApplicationContext reactApplicationContext = getReactApplicationContext();
    File file = this.mScopedContext.a();
    ((UIManagerModule)reactApplicationContext.getNativeModule(UIManagerModule.class)).addUIBlock(new i(this, paramInt, paramReadableMap, paramPromise, file));
  }
  
  class a implements n0 {
    a(CameraModule this$0, int param1Int, Promise param1Promise) {}
    
    public void a(com.facebook.react.uimanager.m param1m) {
      try {
        d d = (d)param1m.b(this.a);
        WritableArray writableArray = Arguments.createArray();
        if (d.f()) {
          Iterator<e.f.a.b.a> iterator = d.getSupportedAspectRatios().iterator();
          while (iterator.hasNext())
            writableArray.pushString(((e.f.a.b.a)iterator.next()).toString()); 
          this.b.resolve(writableArray);
          return;
        } 
        this.b.reject("E_CAMERA_UNAVAILABLE", "Camera is not running");
        return;
      } catch (Exception exception) {
        exception.printStackTrace();
        return;
      } 
    }
  }
  
  class b implements n0 {
    b(CameraModule this$0, int param1Int, Promise param1Promise) {}
    
    public void a(com.facebook.react.uimanager.m param1m) {
      try {
        d d = (d)param1m.b(this.a);
        WritableArray writableArray = Arguments.createArray();
        for (Properties properties : d.getCameraIds()) {
          WritableNativeMap writableNativeMap = new WritableNativeMap();
          writableNativeMap.putString("id", properties.getProperty("id"));
          writableNativeMap.putInt("type", Integer.valueOf(properties.getProperty("type")).intValue());
          writableArray.pushMap((ReadableMap)writableNativeMap);
        } 
        this.b.resolve(writableArray);
        return;
      } catch (Exception exception) {
        exception.printStackTrace();
        this.b.reject("E_CAMERA_FAILED", exception.getMessage());
        return;
      } 
    }
  }
  
  class c implements n0 {
    c(CameraModule this$0, int param1Int, String param1String, Promise param1Promise) {}
    
    public void a(com.facebook.react.uimanager.m param1m) {
      try {
        d d = (d)param1m.b(this.a);
        WritableArray writableArray = Arguments.createArray();
        if (d.f()) {
          Iterator<e.f.a.b.j> iterator = d.a(e.f.a.b.a.a(this.b)).iterator();
          while (iterator.hasNext())
            writableArray.pushString(((e.f.a.b.j)iterator.next()).toString()); 
          this.c.resolve(writableArray);
          return;
        } 
        this.c.reject("E_CAMERA_UNAVAILABLE", "Camera is not running");
        return;
      } catch (Exception exception) {
        this.c.reject("E_CAMERA_BAD_VIEWTAG", "getAvailablePictureSizesAsync: Expected a Camera component");
        return;
      } 
    }
  }
  
  class d implements n0 {
    d(CameraModule this$0, int param1Int, Promise param1Promise) {}
    
    public void a(com.facebook.react.uimanager.m param1m) {
      try {
        d d1 = (d)param1m.b(this.a);
        WritableArray writableArray = Arguments.createArray();
        for (int[] arrayOfInt : d1.getSupportedPreviewFpsRange()) {
          WritableNativeMap writableNativeMap = new WritableNativeMap();
          writableNativeMap.putInt("MAXIMUM_FPS", arrayOfInt[0]);
          writableNativeMap.putInt("MINIMUM_FPS", arrayOfInt[1]);
          writableArray.pushMap((ReadableMap)writableNativeMap);
        } 
        this.b.resolve(writableArray);
        return;
      } catch (Exception exception) {
        exception.printStackTrace();
        return;
      } 
    }
  }
  
  class e extends HashMap<String, Object> {
    e() {
      put((K)"aztec", (V)e.f.c.a.c.toString());
      put((K)"ean13", (V)e.f.c.a.j.toString());
      put((K)"ean8", (V)e.f.c.a.i.toString());
      put((K)"qr", (V)e.f.c.a.n.toString());
      put((K)"pdf417", (V)e.f.c.a.m.toString());
      put((K)"upc_e", (V)e.f.c.a.r.toString());
      put((K)"datamatrix", (V)e.f.c.a.h.toString());
      put((K)"code39", (V)e.f.c.a.e.toString());
      put((K)"code93", (V)e.f.c.a.f.toString());
      put((K)"interleaved2of5", (V)e.f.c.a.k.toString());
      put((K)"codabar", (V)e.f.c.a.d.toString());
      put((K)"code128", (V)e.f.c.a.g.toString());
      put((K)"maxicode", (V)e.f.c.a.l.toString());
      put((K)"rss14", (V)e.f.c.a.o.toString());
      put((K)"rssexpanded", (V)e.f.c.a.p.toString());
      put((K)"upc_a", (V)e.f.c.a.q.toString());
      put((K)"upc_ean", (V)e.f.c.a.s.toString());
    }
  }
  
  class f extends HashMap<String, Object> {
    f() {
      put((K)"Type", (V)f());
      put((K)"FlashMode", (V)c());
      put((K)"AutoFocus", (V)a());
      put((K)"WhiteBalance", (V)h());
      put((K)"VideoQuality", (V)g());
      put((K)"BarCodeType", (V)b());
      put((K)"FaceDetection", (V)Collections.unmodifiableMap(new a()));
      put((K)"GoogleVisionBarcodeDetection", (V)Collections.unmodifiableMap(new b()));
      put((K)"Orientation", (V)Collections.unmodifiableMap(new c()));
    }
    
    private Map<String, Object> a() {
      return Collections.unmodifiableMap(new f());
    }
    
    private Map<String, Object> b() {
      return CameraModule.VALID_BARCODE_TYPES;
    }
    
    private Map<String, Object> c() {
      return Collections.unmodifiableMap(new e());
    }
    
    private Map<String, Object> d() {
      return Collections.unmodifiableMap(new i());
    }
    
    private Map<String, Object> f() {
      return Collections.unmodifiableMap(new d());
    }
    
    private Map<String, Object> g() {
      return Collections.unmodifiableMap(new h());
    }
    
    private Map<String, Object> h() {
      return Collections.unmodifiableMap(new g());
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
          put((K)"fast", (V)Integer.valueOf(org.reactnative.facedetector.b.m));
          put((K)"accurate", (V)Integer.valueOf(org.reactnative.facedetector.b.l));
        }
      }
      
      class b extends HashMap<String, Object> {
        b() {
          put((K)"all", (V)Integer.valueOf(org.reactnative.facedetector.b.h));
          put((K)"none", (V)Integer.valueOf(org.reactnative.facedetector.b.i));
        }
      }
      
      class c extends HashMap<String, Object> {
        c() {
          put((K)"all", (V)Integer.valueOf(org.reactnative.facedetector.b.j));
          put((K)"none", (V)Integer.valueOf(org.reactnative.facedetector.b.k));
        }
      }
    }
    
    class a extends HashMap<String, Object> {
      a() {
        put((K)"fast", (V)Integer.valueOf(org.reactnative.facedetector.b.m));
        put((K)"accurate", (V)Integer.valueOf(org.reactnative.facedetector.b.l));
      }
    }
    
    class b extends HashMap<String, Object> {
      b() {
        put((K)"all", (V)Integer.valueOf(org.reactnative.facedetector.b.h));
        put((K)"none", (V)Integer.valueOf(org.reactnative.facedetector.b.i));
      }
    }
    
    class c extends HashMap<String, Object> {
      c() {
        put((K)"all", (V)Integer.valueOf(org.reactnative.facedetector.b.j));
        put((K)"none", (V)Integer.valueOf(org.reactnative.facedetector.b.k));
      }
    }
    
    class b extends HashMap<String, Object> {
      b() {
        put((K)"BarcodeType", (V)k.b.a.a.b);
        put((K)"BarcodeMode", (V)CameraModule.f.a(CameraModule.f.this));
      }
    }
    
    class c extends HashMap<String, Object> {
      c() {
        put((K)"auto", (V)Integer.valueOf(0));
        put((K)"portrait", (V)Integer.valueOf(1));
        put((K)"portraitUpsideDown", (V)Integer.valueOf(2));
        put((K)"landscapeLeft", (V)Integer.valueOf(3));
        put((K)"landscapeRight", (V)Integer.valueOf(4));
      }
    }
    
    class d extends HashMap<String, Object> {
      d() {
        put((K)"front", (V)Integer.valueOf(1));
        put((K)"back", (V)Integer.valueOf(0));
      }
    }
    
    class e extends HashMap<String, Object> {
      e() {
        put((K)"off", (V)Integer.valueOf(0));
        put((K)"on", (V)Integer.valueOf(1));
        put((K)"auto", (V)Integer.valueOf(3));
        put((K)"torch", (V)Integer.valueOf(2));
      }
    }
    
    class f extends HashMap<String, Object> {
      f() {
        put((K)"on", (V)Boolean.valueOf(true));
        put((K)"off", (V)Boolean.valueOf(false));
      }
    }
    
    class g extends HashMap<String, Object> {
      g() {
        put((K)"auto", (V)Integer.valueOf(0));
        put((K)"cloudy", (V)Integer.valueOf(1));
        put((K)"sunny", (V)Integer.valueOf(2));
        put((K)"shadow", (V)Integer.valueOf(3));
        put((K)"fluorescent", (V)Integer.valueOf(4));
        put((K)"incandescent", (V)Integer.valueOf(5));
      }
    }
    
    class h extends HashMap<String, Object> {
      h() {
        put((K)"2160p", (V)Integer.valueOf(0));
        put((K)"1080p", (V)Integer.valueOf(1));
        put((K)"720p", (V)Integer.valueOf(2));
        put((K)"480p", (V)Integer.valueOf(3));
        put((K)"4:3", (V)Integer.valueOf(4));
      }
    }
    
    class i extends HashMap<String, Object> {
      i() {
        put((K)"NORMAL", (V)Integer.valueOf(0));
        put((K)"ALTERNATE", (V)Integer.valueOf(1));
        put((K)"INVERTED", (V)Integer.valueOf(2));
      }
    }
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
        put((K)"fast", (V)Integer.valueOf(org.reactnative.facedetector.b.m));
        put((K)"accurate", (V)Integer.valueOf(org.reactnative.facedetector.b.l));
      }
    }
    
    class b extends HashMap<String, Object> {
      b() {
        put((K)"all", (V)Integer.valueOf(org.reactnative.facedetector.b.h));
        put((K)"none", (V)Integer.valueOf(org.reactnative.facedetector.b.i));
      }
    }
    
    class c extends HashMap<String, Object> {
      c() {
        put((K)"all", (V)Integer.valueOf(org.reactnative.facedetector.b.j));
        put((K)"none", (V)Integer.valueOf(org.reactnative.facedetector.b.k));
      }
    }
  }
  
  class a extends HashMap<String, Object> {
    a() {
      put((K)"fast", (V)Integer.valueOf(org.reactnative.facedetector.b.m));
      put((K)"accurate", (V)Integer.valueOf(org.reactnative.facedetector.b.l));
    }
  }
  
  class b extends HashMap<String, Object> {
    b() {
      put((K)"all", (V)Integer.valueOf(org.reactnative.facedetector.b.h));
      put((K)"none", (V)Integer.valueOf(org.reactnative.facedetector.b.i));
    }
  }
  
  class c extends HashMap<String, Object> {
    c() {
      put((K)"all", (V)Integer.valueOf(org.reactnative.facedetector.b.j));
      put((K)"none", (V)Integer.valueOf(org.reactnative.facedetector.b.k));
    }
  }
  
  class b extends HashMap<String, Object> {
    b() {
      put((K)"BarcodeType", (V)k.b.a.a.b);
      put((K)"BarcodeMode", (V)CameraModule.f.a(this.this$1));
    }
  }
  
  class c extends HashMap<String, Object> {
    c() {
      put((K)"auto", (V)Integer.valueOf(0));
      put((K)"portrait", (V)Integer.valueOf(1));
      put((K)"portraitUpsideDown", (V)Integer.valueOf(2));
      put((K)"landscapeLeft", (V)Integer.valueOf(3));
      put((K)"landscapeRight", (V)Integer.valueOf(4));
    }
  }
  
  class d extends HashMap<String, Object> {
    d() {
      put((K)"front", (V)Integer.valueOf(1));
      put((K)"back", (V)Integer.valueOf(0));
    }
  }
  
  class e extends HashMap<String, Object> {
    e() {
      put((K)"off", (V)Integer.valueOf(0));
      put((K)"on", (V)Integer.valueOf(1));
      put((K)"auto", (V)Integer.valueOf(3));
      put((K)"torch", (V)Integer.valueOf(2));
    }
  }
  
  class f extends HashMap<String, Object> {
    f() {
      put((K)"on", (V)Boolean.valueOf(true));
      put((K)"off", (V)Boolean.valueOf(false));
    }
  }
  
  class g extends HashMap<String, Object> {
    g() {
      put((K)"auto", (V)Integer.valueOf(0));
      put((K)"cloudy", (V)Integer.valueOf(1));
      put((K)"sunny", (V)Integer.valueOf(2));
      put((K)"shadow", (V)Integer.valueOf(3));
      put((K)"fluorescent", (V)Integer.valueOf(4));
      put((K)"incandescent", (V)Integer.valueOf(5));
    }
  }
  
  class h extends HashMap<String, Object> {
    h() {
      put((K)"2160p", (V)Integer.valueOf(0));
      put((K)"1080p", (V)Integer.valueOf(1));
      put((K)"720p", (V)Integer.valueOf(2));
      put((K)"480p", (V)Integer.valueOf(3));
      put((K)"4:3", (V)Integer.valueOf(4));
    }
  }
  
  class i extends HashMap<String, Object> {
    i() {
      put((K)"NORMAL", (V)Integer.valueOf(0));
      put((K)"ALTERNATE", (V)Integer.valueOf(1));
      put((K)"INVERTED", (V)Integer.valueOf(2));
    }
  }
  
  class g implements n0 {
    g(CameraModule this$0, int param1Int) {}
    
    public void a(com.facebook.react.uimanager.m param1m) {
      try {
        d d = (d)param1m.b(this.a);
        if (d.f()) {
          d.g();
          return;
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
  }
  
  class h implements n0 {
    h(CameraModule this$0, int param1Int) {}
    
    public void a(com.facebook.react.uimanager.m param1m) {
      try {
        d d = (d)param1m.b(this.a);
        if (d.f()) {
          d.i();
          return;
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
  }
  
  class i implements n0 {
    i(CameraModule this$0, int param1Int, ReadableMap param1ReadableMap, Promise param1Promise, File param1File) {}
    
    public void a(com.facebook.react.uimanager.m param1m) {
      d d = (d)param1m.b(this.a);
      try {
        if (d.f()) {
          d.b(this.b, this.c, this.d);
          return;
        } 
        this.c.reject("E_CAMERA_UNAVAILABLE", "Camera is not running");
        return;
      } catch (Exception exception) {
        this.c.reject("E_TAKE_PICTURE_FAILED", exception.getMessage());
        return;
      } 
    }
  }
  
  class j implements n0 {
    j(CameraModule this$0, int param1Int, ReadableMap param1ReadableMap, Promise param1Promise, File param1File) {}
    
    public void a(com.facebook.react.uimanager.m param1m) {
      try {
        d d = (d)param1m.b(this.a);
        if (d.f()) {
          d.a(this.b, this.c, this.d);
          return;
        } 
        this.c.reject("E_CAMERA_UNAVAILABLE", "Camera is not running");
        return;
      } catch (Exception exception) {
        this.c.reject("E_CAPTURE_FAILED", exception.getMessage());
        return;
      } 
    }
  }
  
  class k implements n0 {
    k(CameraModule this$0, int param1Int) {}
    
    public void a(com.facebook.react.uimanager.m param1m) {
      try {
        d d = (d)param1m.b(this.a);
        if (d.f()) {
          d.m();
          return;
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
  }
  
  class l implements n0 {
    l(CameraModule this$0, int param1Int) {}
    
    public void a(com.facebook.react.uimanager.m param1m) {
      try {
        d d = (d)param1m.b(this.a);
        if (d.f()) {
          d.h();
          return;
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
  }
  
  class m implements n0 {
    m(CameraModule this$0, int param1Int) {}
    
    public void a(com.facebook.react.uimanager.m param1m) {
      try {
        d d = (d)param1m.b(this.a);
        if (d.f()) {
          d.j();
          return;
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/org/reactnative/camera/CameraModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */