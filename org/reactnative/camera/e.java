package org.reactnative.camera;

import android.media.CamcorderProfile;
import android.os.Build;
import android.view.ViewGroup;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.UIManagerModule;
import e.f.c.n;
import org.reactnative.camera.f.a;
import org.reactnative.camera.f.b;
import org.reactnative.camera.f.c;
import org.reactnative.camera.f.d;
import org.reactnative.camera.f.e;
import org.reactnative.camera.f.f;
import org.reactnative.camera.f.g;
import org.reactnative.camera.f.h;
import org.reactnative.camera.f.i;
import org.reactnative.camera.f.j;
import org.reactnative.camera.f.k;
import org.reactnative.camera.f.l;
import org.reactnative.camera.f.m;

public class e {
  public static final String[][] a;
  
  static {
    String[] arrayOfString1 = { "string", "Artist" };
    String[] arrayOfString2 = { "int", "BitsPerSample" };
    String[] arrayOfString3 = { "int", "Compression" };
    String[] arrayOfString4 = { "string", "Copyright" };
    String[] arrayOfString5 = { "string", "ImageDescription" };
    String[] arrayOfString6 = { "int", "ImageLength" };
    String[] arrayOfString7 = { "int", "JPEGInterchangeFormat" };
    String[] arrayOfString8 = { "string", "Make" };
    String[] arrayOfString9 = { "int", "Orientation" };
    String[] arrayOfString10 = { "int", "PlanarConfiguration" };
    String[] arrayOfString11 = { "int", "SamplesPerPixel" };
    String[] arrayOfString12 = { "string", "Software" };
    String[] arrayOfString13 = { "double", "YCbCrCoefficients" };
    String[] arrayOfString14 = { "int", "YCbCrPositioning" };
    String[] arrayOfString15 = { "string", "ComponentsConfiguration" };
    String[] arrayOfString16 = { "string", "DateTimeDigitized" };
    String[] arrayOfString17 = { "double", "ExposureIndex" };
    String[] arrayOfString18 = { "int", "ExposureMode" };
    String[] arrayOfString19 = { "double", "ExposureTime" };
    String[] arrayOfString20 = { "string", "FileSource" };
    String[] arrayOfString21 = { "double", "FocalLength" };
    String[] arrayOfString22 = { "string", "ImageUniqueID" };
    String[] arrayOfString23 = { "int", "LightSource" };
    String[] arrayOfString24 = { "string", "MakerNote" };
    String[] arrayOfString25 = { "int", "PixelYDimension" };
    String[] arrayOfString26 = { "int", "Sharpness" };
    String[] arrayOfString27 = { "string", "SubSecTimeOriginal" };
    String[] arrayOfString28 = { "int", "SubjectLocation" };
    String[] arrayOfString29 = { "int", "GPSAltitudeRef" };
    String[] arrayOfString30 = { "double", "GPSDestBearing" };
    String[] arrayOfString31 = { "double", "GPSDestDistance" };
    String[] arrayOfString32 = { "string", "GPSDestLatitudeRef" };
    String[] arrayOfString33 = { "double", "GPSDestLongitude" };
    String[] arrayOfString34 = { "string", "GPSDestLongitudeRef" };
    String[] arrayOfString35 = { "int", "GPSDifferential" };
    String[] arrayOfString36 = { "string", "GPSImgDirectionRef" };
    String[] arrayOfString37 = { "string", "GPSMapDatum" };
    String[] arrayOfString38 = { "string", "GPSSatellites" };
    String[] arrayOfString39 = { "string", "GPSSpeedRef" };
    String[] arrayOfString40 = { "double", "GPSTrack" };
    String[] arrayOfString41 = { "string", "GPSVersionID" };
    String[] arrayOfString42 = { "int", "DefaultCropSize" };
    String[] arrayOfString43 = { "int", "SensorBottomBorder" };
    String[] arrayOfString44 = { "int", "SensorTopBorder" };
    a = new String[][] { 
        arrayOfString1, arrayOfString2, arrayOfString3, arrayOfString4, { "string", "DateTime" }, arrayOfString5, arrayOfString6, { "int", "ImageWidth" }, arrayOfString7, { "int", "JPEGInterchangeFormatLength" }, 
        arrayOfString8, { "string", "Model" }, arrayOfString9, { "int", "PhotometricInterpretation" }, arrayOfString10, { "double", "PrimaryChromaticities" }, { "double", "ReferenceBlackWhite" }, { "int", "ResolutionUnit" }, { "int", "RowsPerStrip" }, arrayOfString11, 
        arrayOfString12, { "int", "StripByteCounts" }, { "int", "StripOffsets" }, { "int", "TransferFunction" }, { "double", "WhitePoint" }, { "double", "XResolution" }, arrayOfString13, arrayOfString14, { "int", "YCbCrSubSampling" }, { "double", "YResolution" }, 
        { "double", "ApertureValue" }, { "double", "BrightnessValue" }, { "string", "CFAPattern" }, { "int", "ColorSpace" }, arrayOfString15, { "double", "CompressedBitsPerPixel" }, { "int", "Contrast" }, { "int", "CustomRendered" }, arrayOfString16, { "string", "DateTimeOriginal" }, 
        { "string", "DeviceSettingDescription" }, { "double", "DigitalZoomRatio" }, { "string", "ExifVersion" }, { "double", "ExposureBiasValue" }, arrayOfString17, arrayOfString18, { "int", "ExposureProgram" }, arrayOfString19, { "double", "FNumber" }, arrayOfString20, 
        { "int", "Flash" }, { "double", "FlashEnergy" }, { "string", "FlashpixVersion" }, arrayOfString21, { "int", "FocalLengthIn35mmFilm" }, { "int", "FocalPlaneResolutionUnit" }, { "double", "FocalPlaneXResolution" }, { "double", "FocalPlaneYResolution" }, { "int", "GainControl" }, { "int", "ISOSpeedRatings" }, 
        arrayOfString22, arrayOfString23, arrayOfString24, { "double", "MaxApertureValue" }, { "int", "MeteringMode" }, { "int", "NewSubfileType" }, { "string", "OECF" }, { "int", "PixelXDimension" }, arrayOfString25, { "string", "RelatedSoundFile" }, 
        { "int", "Saturation" }, { "int", "SceneCaptureType" }, { "string", "SceneType" }, { "int", "SensingMethod" }, arrayOfString26, { "double", "ShutterSpeedValue" }, { "string", "SpatialFrequencyResponse" }, { "string", "SpectralSensitivity" }, { "int", "SubfileType" }, { "string", "SubSecTime" }, 
        { "string", "SubSecTimeDigitized" }, arrayOfString27, { "int", "SubjectArea" }, { "double", "SubjectDistance" }, { "int", "SubjectDistanceRange" }, arrayOfString28, { "string", "UserComment" }, { "int", "WhiteBalance" }, arrayOfString29, { "string", "GPSAreaInformation" }, 
        { "double", "GPSDOP" }, { "string", "GPSDateStamp" }, arrayOfString30, { "string", "GPSDestBearingRef" }, arrayOfString31, { "string", "GPSDestDistanceRef" }, { "double", "GPSDestLatitude" }, arrayOfString32, arrayOfString33, arrayOfString34, 
        arrayOfString35, { "double", "GPSImgDirection" }, arrayOfString36, { "string", "GPSLatitudeRef" }, { "string", "GPSLongitudeRef" }, arrayOfString37, { "string", "GPSMeasureMode" }, { "string", "GPSProcessingMethod" }, arrayOfString38, { "double", "GPSSpeed" }, 
        arrayOfString39, { "string", "GPSStatus" }, { "string", "GPSTimeStamp" }, arrayOfString40, { "string", "GPSTrackRef" }, arrayOfString41, { "string", "InteroperabilityIndex" }, { "int", "ThumbnailImageLength" }, { "int", "ThumbnailImageWidth" }, { "int", "DNGVersion" }, 
        arrayOfString42, { "int", "PreviewImageStart" }, { "int", "PreviewImageLength" }, { "int", "AspectFrame" }, arrayOfString43, { "int", "SensorLeftBorder" }, { "int", "SensorRightBorder" }, arrayOfString44, { "int", "ISO" } };
  }
  
  public static int a(int paramInt1, int paramInt2, int paramInt3) {
    if (paramInt2 == 1) {
      paramInt1 = paramInt3 + paramInt1;
      return paramInt1 % 360;
    } 
    if (c(paramInt1)) {
      paramInt2 = 180;
    } else {
      paramInt2 = 0;
    } 
    paramInt1 = paramInt3 - paramInt1 + paramInt2;
    return paramInt1 % 360;
  }
  
  public static CamcorderProfile a(int paramInt) {
    CamcorderProfile camcorderProfile = CamcorderProfile.get(1);
    int i = b(paramInt);
    if (CamcorderProfile.hasProfile(i)) {
      CamcorderProfile camcorderProfile1 = CamcorderProfile.get(i);
      camcorderProfile = camcorderProfile1;
      if (paramInt == 4) {
        camcorderProfile1.videoFrameWidth = 640;
        camcorderProfile = camcorderProfile1;
      } 
    } 
    return camcorderProfile;
  }
  
  public static void a(ViewGroup paramViewGroup) {
    ReactContext reactContext = (ReactContext)paramViewGroup.getContext();
    reactContext.runOnNativeModulesQueueThread(new f(paramViewGroup, reactContext));
  }
  
  public static void a(ViewGroup paramViewGroup, WritableArray paramWritableArray) {
    ReactContext reactContext = (ReactContext)paramViewGroup.getContext();
    reactContext.runOnNativeModulesQueueThread(new l(paramViewGroup, paramWritableArray, reactContext));
  }
  
  public static void a(ViewGroup paramViewGroup, WritableArray paramWritableArray, byte[] paramArrayOfbyte) {
    ReactContext reactContext = (ReactContext)paramViewGroup.getContext();
    reactContext.runOnNativeModulesQueueThread(new a(paramViewGroup, paramWritableArray, paramArrayOfbyte, reactContext));
  }
  
  public static void a(ViewGroup paramViewGroup, WritableMap paramWritableMap) {
    ReactContext reactContext = (ReactContext)paramViewGroup.getContext();
    reactContext.runOnNativeModulesQueueThread(new g(paramViewGroup, paramWritableMap, reactContext));
  }
  
  public static void a(ViewGroup paramViewGroup, n paramn, int paramInt1, int paramInt2, byte[] paramArrayOfbyte) {
    ReactContext reactContext = (ReactContext)paramViewGroup.getContext();
    reactContext.runOnNativeModulesQueueThread(new c(paramViewGroup, paramn, paramInt1, paramInt2, paramArrayOfbyte, reactContext));
  }
  
  public static void a(ViewGroup paramViewGroup, String paramString) {
    ReactContext reactContext = (ReactContext)paramViewGroup.getContext();
    reactContext.runOnNativeModulesQueueThread(new e(paramViewGroup, paramString, reactContext));
  }
  
  public static void a(ViewGroup paramViewGroup, k.b.a.b paramb) {
    ReactContext reactContext = (ReactContext)paramViewGroup.getContext();
    reactContext.runOnNativeModulesQueueThread(new b(paramViewGroup, paramb, reactContext));
  }
  
  public static void a(ViewGroup paramViewGroup, org.reactnative.facedetector.b paramb) {
    ReactContext reactContext = (ReactContext)paramViewGroup.getContext();
    reactContext.runOnNativeModulesQueueThread(new m(paramViewGroup, paramb, reactContext));
  }
  
  public static void a(ViewGroup paramViewGroup, boolean paramBoolean, int paramInt1, int paramInt2) {
    ReactContext reactContext = (ReactContext)paramViewGroup.getContext();
    reactContext.runOnNativeModulesQueueThread(new k(paramViewGroup, paramBoolean, paramInt1, paramInt2, reactContext));
  }
  
  public static void a(b.k.a.a parama) {
    String[][] arrayOfString = a;
    int j = arrayOfString.length;
    for (int i = 0; i < j; i++)
      parama.a(arrayOfString[i][1], null); 
    parama.a("GPSLatitude", null);
    parama.a("GPSLongitude", null);
    parama.a("GPSAltitude", null);
  }
  
  public static void a(b.k.a.a parama, ReadableMap paramReadableMap) {
    for (String[] arrayOfString : a) {
      String str = arrayOfString[1];
      if (paramReadableMap.hasKey(str)) {
        String str1 = arrayOfString[0];
        byte b = -1;
        int i = str1.hashCode();
        if (i != -1325958191) {
          if (i != -891985903) {
            if (i == 104431 && str1.equals("int"))
              b = 1; 
          } else if (str1.equals("string")) {
            b = 0;
          } 
        } else if (str1.equals("double")) {
          b = 2;
        } 
        if (b != 0) {
          if (b != 1) {
            if (b == 2) {
              parama.a(str, Double.toString(paramReadableMap.getDouble(str)));
              paramReadableMap.getDouble(str);
            } 
          } else {
            parama.a(str, Integer.toString(paramReadableMap.getInt(str)));
            paramReadableMap.getInt(str);
          } 
        } else {
          parama.a(str, paramReadableMap.getString(str));
        } 
      } 
    } 
    if (paramReadableMap.hasKey("GPSLatitude") && paramReadableMap.hasKey("GPSLongitude"))
      parama.a(paramReadableMap.getDouble("GPSLatitude"), paramReadableMap.getDouble("GPSLongitude")); 
    if (paramReadableMap.hasKey("GPSAltitude"))
      parama.b(paramReadableMap.getDouble("GPSAltitude")); 
  }
  
  private static int b(int paramInt) {
    if (paramInt != 0) {
      if (paramInt != 1)
        return (paramInt != 2) ? ((paramInt != 3 && paramInt != 4) ? 1 : 4) : 5; 
    } else if (Build.VERSION.SDK_INT >= 21) {
      return 8;
    } 
    return 6;
  }
  
  public static WritableMap b(b.k.a.a parama) {
    WritableMap writableMap = Arguments.createMap();
    for (String[] arrayOfString : a) {
      String str = arrayOfString[1];
      if (parama.a(str) != null) {
        String str1 = arrayOfString[0];
        byte b = -1;
        int i = str1.hashCode();
        if (i != -1325958191) {
          if (i != -891985903) {
            if (i == 104431 && str1.equals("int"))
              b = 1; 
          } else if (str1.equals("string")) {
            b = 0;
          } 
        } else if (str1.equals("double")) {
          b = 2;
        } 
        if (b != 0) {
          if (b != 1) {
            if (b == 2)
              writableMap.putDouble(str, parama.a(str, 0.0D)); 
          } else {
            writableMap.putInt(str, parama.a(str, 0));
          } 
        } else {
          writableMap.putString(str, parama.a(str));
        } 
      } 
    } 
    double[] arrayOfDouble = parama.a();
    if (arrayOfDouble != null) {
      writableMap.putDouble("GPSLatitude", arrayOfDouble[0]);
      writableMap.putDouble("GPSLongitude", arrayOfDouble[1]);
      writableMap.putDouble("GPSAltitude", parama.a(0.0D));
    } 
    return writableMap;
  }
  
  public static void b(ViewGroup paramViewGroup) {
    ReactContext reactContext = (ReactContext)paramViewGroup.getContext();
    reactContext.runOnNativeModulesQueueThread(new h(paramViewGroup, reactContext));
  }
  
  public static void b(ViewGroup paramViewGroup, WritableArray paramWritableArray) {
    ReactContext reactContext = (ReactContext)paramViewGroup.getContext();
    reactContext.runOnNativeModulesQueueThread(new d(paramViewGroup, paramWritableArray, reactContext));
  }
  
  public static void b(ViewGroup paramViewGroup, WritableMap paramWritableMap) {
    ReactContext reactContext = (ReactContext)paramViewGroup.getContext();
    reactContext.runOnNativeModulesQueueThread(new i(paramViewGroup, paramWritableMap, reactContext));
  }
  
  public static void c(ViewGroup paramViewGroup) {
    ReactContext reactContext = (ReactContext)paramViewGroup.getContext();
    reactContext.runOnNativeModulesQueueThread(new j(paramViewGroup, reactContext));
  }
  
  private static boolean c(int paramInt) {
    return (paramInt == 90 || paramInt == 270);
  }
  
  class a implements Runnable {
    a(e this$0, WritableArray param1WritableArray, byte[] param1ArrayOfbyte, ReactContext param1ReactContext) {}
    
    public void run() {
      c c = c.b(this.c.getId(), this.d, this.e);
      ((UIManagerModule)this.f.getNativeModule(UIManagerModule.class)).getEventDispatcher().a((com.facebook.react.uimanager.events.c)c);
    }
  }
  
  class b implements Runnable {
    b(e this$0, k.b.a.b param1b, ReactContext param1ReactContext) {}
    
    public void run() {
      b b1 = b.b(this.c.getId(), this.d);
      ((UIManagerModule)this.e.getNativeModule(UIManagerModule.class)).getEventDispatcher().a((com.facebook.react.uimanager.events.c)b1);
    }
  }
  
  class c implements Runnable {
    c(e this$0, n param1n, int param1Int1, int param1Int2, byte[] param1ArrayOfbyte, ReactContext param1ReactContext) {}
    
    public void run() {
      a a = a.b(this.c.getId(), this.d, this.e, this.f, this.g);
      ((UIManagerModule)this.h.getNativeModule(UIManagerModule.class)).getEventDispatcher().a((com.facebook.react.uimanager.events.c)a);
    }
  }
  
  class d implements Runnable {
    d(e this$0, WritableArray param1WritableArray, ReactContext param1ReactContext) {}
    
    public void run() {
      l l = l.b(this.c.getId(), this.d);
      ((UIManagerModule)this.e.getNativeModule(UIManagerModule.class)).getEventDispatcher().a((com.facebook.react.uimanager.events.c)l);
    }
  }
  
  class e implements Runnable {
    e(e this$0, String param1String, ReactContext param1ReactContext) {}
    
    public void run() {
      d d = d.b(this.c.getId(), this.d);
      ((UIManagerModule)this.e.getNativeModule(UIManagerModule.class)).getEventDispatcher().a((com.facebook.react.uimanager.events.c)d);
    }
  }
  
  class f implements Runnable {
    f(e this$0, ReactContext param1ReactContext) {}
    
    public void run() {
      e e = e.b(this.c.getId());
      ((UIManagerModule)this.d.getNativeModule(UIManagerModule.class)).getEventDispatcher().a((com.facebook.react.uimanager.events.c)e);
    }
  }
  
  class g implements Runnable {
    g(e this$0, WritableMap param1WritableMap, ReactContext param1ReactContext) {}
    
    public void run() {
      h h = h.b(this.c.getId(), this.d);
      ((UIManagerModule)this.e.getNativeModule(UIManagerModule.class)).getEventDispatcher().a((com.facebook.react.uimanager.events.c)h);
    }
  }
  
  class h implements Runnable {
    h(e this$0, ReactContext param1ReactContext) {}
    
    public void run() {
      i i = i.b(this.c.getId());
      ((UIManagerModule)this.d.getNativeModule(UIManagerModule.class)).getEventDispatcher().a((com.facebook.react.uimanager.events.c)i);
    }
  }
  
  class i implements Runnable {
    i(e this$0, WritableMap param1WritableMap, ReactContext param1ReactContext) {}
    
    public void run() {
      k k = k.b(this.c.getId(), this.d);
      ((UIManagerModule)this.e.getNativeModule(UIManagerModule.class)).getEventDispatcher().a((com.facebook.react.uimanager.events.c)k);
    }
  }
  
  class j implements Runnable {
    j(e this$0, ReactContext param1ReactContext) {}
    
    public void run() {
      j j1 = j.b(this.c.getId());
      ((UIManagerModule)this.d.getNativeModule(UIManagerModule.class)).getEventDispatcher().a((com.facebook.react.uimanager.events.c)j1);
    }
  }
  
  class k implements Runnable {
    k(e this$0, boolean param1Boolean, int param1Int1, int param1Int2, ReactContext param1ReactContext) {}
    
    public void run() {
      m m = m.b(this.c.getId(), this.d, this.e, this.f);
      ((UIManagerModule)this.g.getNativeModule(UIManagerModule.class)).getEventDispatcher().a((com.facebook.react.uimanager.events.c)m);
    }
  }
  
  class l implements Runnable {
    l(e this$0, WritableArray param1WritableArray, ReactContext param1ReactContext) {}
    
    public void run() {
      g g = g.b(this.c.getId(), this.d);
      ((UIManagerModule)this.e.getNativeModule(UIManagerModule.class)).getEventDispatcher().a((com.facebook.react.uimanager.events.c)g);
    }
  }
  
  class m implements Runnable {
    m(e this$0, org.reactnative.facedetector.b param1b, ReactContext param1ReactContext) {}
    
    public void run() {
      f f = f.b(this.c.getId(), this.d);
      ((UIManagerModule)this.e.getNativeModule(UIManagerModule.class)).getEventDispatcher().a((com.facebook.react.uimanager.events.c)f);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/org/reactnative/camera/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */