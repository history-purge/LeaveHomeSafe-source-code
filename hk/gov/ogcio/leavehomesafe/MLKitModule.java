package hk.gov.ogcio.leavehomesafe;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.util.Base64;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import e.f.a.e.m.g;
import e.f.a.e.m.h;
import e.f.a.e.m.l;
import java.io.IOException;

public class MLKitModule extends ReactContextBaseJavaModule {
  private String ERR_OCR_MODEL_UNAVAILABLE = "OCR_MODEL_UNAVAILABLE";
  
  private ReactApplicationContext mReactContext;
  
  MLKitModule(ReactApplicationContext paramReactApplicationContext) {
    super(paramReactApplicationContext);
    this.mReactContext = paramReactApplicationContext;
  }
  
  private static int exifToDegrees(int paramInt) {
    return (paramInt == 6) ? 90 : ((paramInt == 3) ? 180 : ((paramInt == 8) ? 270 : 0));
  }
  
  private WritableMap getCoordinates(Rect paramRect) {
    WritableMap writableMap = Arguments.createMap();
    if (paramRect == null) {
      writableMap.putNull("top");
      writableMap.putNull("left");
      writableMap.putNull("width");
      writableMap.putNull("height");
      return writableMap;
    } 
    writableMap.putInt("top", paramRect.top);
    writableMap.putInt("left", paramRect.left);
    writableMap.putInt("width", paramRect.width());
    writableMap.putInt("height", paramRect.height());
    return writableMap;
  }
  
  private WritableArray getCornerPoints(Point[] paramArrayOfPoint) {
    WritableArray writableArray = Arguments.createArray();
    if (paramArrayOfPoint == null)
      return writableArray; 
    int j = paramArrayOfPoint.length;
    for (int i = 0; i < j; i++) {
      Point point = paramArrayOfPoint[i];
      WritableMap writableMap = Arguments.createMap();
      writableMap.putInt("x", point.x);
      writableMap.putInt("y", point.y);
      writableArray.pushMap((ReadableMap)writableMap);
    } 
    return writableArray;
  }
  
  private WritableArray renderArray(e.f.b.b.b.a parama) {
    WritableArray writableArray = Arguments.createArray();
    for (e.f.b.b.b.a.d d : parama.a()) {
      WritableArray writableArray1 = Arguments.createArray();
      for (e.f.b.b.b.a.b b : d.d()) {
        WritableArray writableArray2 = Arguments.createArray();
        for (e.f.b.b.b.a.a a1 : b.d()) {
          WritableMap writableMap3 = Arguments.createMap();
          writableMap3.putString("text", a1.d());
          writableMap3.putMap("bounding", (ReadableMap)getCoordinates(a1.a()));
          writableMap3.putArray("cornerPoints", (ReadableArray)getCornerPoints(a1.b()));
          writableArray2.pushMap((ReadableMap)writableMap3);
        } 
        WritableMap writableMap1 = Arguments.createMap();
        WritableMap writableMap2 = getCoordinates(b.a());
        writableMap1.putString("text", b.e());
        writableMap1.putMap("bounding", (ReadableMap)writableMap2);
        writableMap1.putArray("elements", (ReadableArray)writableArray2);
        writableMap1.putArray("cornerPoints", (ReadableArray)getCornerPoints(b.b()));
        writableArray1.pushMap((ReadableMap)writableMap1);
      } 
      WritableMap writableMap = Arguments.createMap();
      writableMap.putMap("bounding", (ReadableMap)getCoordinates(d.a()));
      writableMap.putString("text", d.e());
      writableMap.putArray("lines", (ReadableArray)writableArray1);
      writableMap.putArray("cornerPoints", (ReadableArray)getCornerPoints(d.b()));
      writableArray.pushMap((ReadableMap)writableMap);
    } 
    return writableArray;
  }
  
  @ReactMethod
  public void detectFromBase64(String paramString, int paramInt, Promise paramPromise) {
    try {
      e.f.b.b.b.c c = e.f.b.b.b.b.a();
      byte[] arrayOfByte = Base64.decode(paramString, 0);
      paramInt = exifToDegrees(paramInt);
      l l = c.a(e.f.b.b.a.a.a(BitmapFactory.decodeByteArray(arrayOfByte, 0, arrayOfByte.length), paramInt));
      l.a(new b(this, paramPromise));
      l.a(new a(this, paramPromise));
      return;
    } catch (Exception exception) {
      paramPromise.reject(exception);
      exception.printStackTrace();
      return;
    } 
  }
  
  @ReactMethod
  public void detectFromUri(String paramString, Promise paramPromise) {
    e.f.b.b.b.c c = e.f.b.b.b.b.a();
    try {
      l l = c.a(e.f.b.b.a.a.a((Context)this.mReactContext, Uri.parse(paramString)));
      l.a(new d(this, paramPromise));
      l.a(new c(this, paramPromise));
      return;
    } catch (IOException iOException) {
      paramPromise.reject(iOException);
      iOException.printStackTrace();
      return;
    } 
  }
  
  public String getName() {
    return "MLKitModule";
  }
  
  class a implements g {
    a(MLKitModule this$0, Promise param1Promise) {}
    
    public void a(Exception param1Exception) {
      if (param1Exception instanceof e.f.b.a.a && ((e.f.b.a.a)param1Exception).a() == 14) {
        this.a.reject(new Exception(this.b.ERR_OCR_MODEL_UNAVAILABLE));
      } else {
        this.a.reject(param1Exception);
      } 
      param1Exception.printStackTrace();
    }
  }
  
  class b implements h<e.f.b.b.b.a> {
    b(MLKitModule this$0, Promise param1Promise) {}
    
    public void a(e.f.b.b.b.a param1a) {
      this.a.resolve(this.b.renderArray(param1a));
    }
  }
  
  class c implements g {
    c(MLKitModule this$0, Promise param1Promise) {}
    
    public void a(Exception param1Exception) {
      if (param1Exception instanceof e.f.b.a.a && ((e.f.b.a.a)param1Exception).a() == 14) {
        this.a.reject(new Exception(this.b.ERR_OCR_MODEL_UNAVAILABLE));
      } else {
        this.a.reject(param1Exception);
      } 
      param1Exception.printStackTrace();
    }
  }
  
  class d implements h<e.f.b.b.b.a> {
    d(MLKitModule this$0, Promise param1Promise) {}
    
    public void a(e.f.b.b.b.a param1a) {
      this.a.resolve(this.b.renderArray(param1a));
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/hk/gov/ogcio/leavehomesafe/MLKitModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */