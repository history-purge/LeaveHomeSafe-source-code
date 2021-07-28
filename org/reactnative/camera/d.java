package org.reactnative.camera;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.media.CamcorderProfile;
import android.os.AsyncTask;
import android.os.Build;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.k0;
import e.f.a.b.e;
import e.f.c.i;
import e.f.c.n;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.reactnative.camera.g.a;
import org.reactnative.camera.g.b;
import org.reactnative.camera.g.c;
import org.reactnative.camera.g.d;
import org.reactnative.camera.g.e;
import org.reactnative.camera.g.f;
import org.reactnative.camera.g.g;
import org.reactnative.camera.g.h;
import org.reactnative.camera.g.i;
import org.reactnative.camera.g.j;
import org.reactnative.camera.h.c;

public class d extends e implements LifecycleEventListener, b, f, d, j, g {
  public volatile boolean A;
  
  public volatile boolean B;
  
  private i C;
  
  private org.reactnative.facedetector.b D;
  
  private k.b.a.b E;
  
  private boolean F;
  
  private boolean G;
  
  private boolean H;
  
  private boolean I;
  
  private boolean J;
  
  private int K;
  
  private int L;
  
  private int M;
  
  private int N;
  
  private int O;
  
  private boolean P;
  
  private int Q;
  
  private int R;
  
  private boolean S;
  
  private float T;
  
  private float U;
  
  private float V;
  
  private float W;
  
  private int a0;
  
  private int b0;
  
  private GestureDetector.SimpleOnGestureListener c0;
  
  private ScaleGestureDetector.OnScaleGestureListener d0;
  
  private k0 j;
  
  private Queue<Promise> k = new ConcurrentLinkedQueue<Promise>();
  
  private Map<Promise, ReadableMap> l = new ConcurrentHashMap<Promise, ReadableMap>();
  
  private Map<Promise, File> m = new ConcurrentHashMap<Promise, File>();
  
  private Promise n;
  
  private List<String> o = null;
  
  private boolean p;
  
  private ScaleGestureDetector q;
  
  private GestureDetector r;
  
  private boolean s;
  
  private boolean t;
  
  private boolean u;
  
  private Boolean v;
  
  private Boolean w;
  
  private boolean x;
  
  public volatile boolean y;
  
  public volatile boolean z;
  
  public d(k0 paramk0) {
    super((Context)paramk0, true);
    Boolean bool = Boolean.valueOf(false);
    this.p = false;
    this.s = false;
    this.t = true;
    this.u = false;
    this.v = bool;
    this.w = bool;
    this.x = false;
    this.y = false;
    this.z = false;
    this.A = false;
    this.B = false;
    this.F = false;
    this.G = false;
    this.H = false;
    this.I = false;
    this.J = false;
    this.K = org.reactnative.facedetector.b.m;
    this.L = org.reactnative.facedetector.b.k;
    this.M = org.reactnative.facedetector.b.i;
    this.N = k.b.a.b.h;
    this.O = k.b.a.b.e;
    this.P = true;
    this.S = false;
    this.T = 0.0F;
    this.U = 0.0F;
    this.V = 0.0F;
    this.W = 0.0F;
    this.a0 = 0;
    this.b0 = 0;
    this.c0 = new f(this);
    this.d0 = new g(this);
    this.j = paramk0;
    paramk0.addLifecycleEventListener(this);
    a(new a(this));
  }
  
  private void a(float paramFloat) {
    float f1 = getZoom();
    paramFloat = paramFloat - 1.0F + f1;
    if (paramFloat > f1) {
      paramFloat = Math.min(paramFloat, 1.0F);
    } else {
      paramFloat = Math.max(paramFloat, 0.0F);
    } 
    setZoom(paramFloat);
  }
  
  private int b(float paramFloat) {
    Resources resources = getResources();
    resources.getConfiguration();
    return (int)(paramFloat / (resources.getDisplayMetrics()).density);
  }
  
  private boolean n() {
    int k = Build.VERSION.SDK_INT;
    boolean bool = true;
    if (k >= 23) {
      if (b.g.e.a.a(getContext(), "android.permission.CAMERA") == 0)
        return true; 
      bool = false;
    } 
    return bool;
  }
  
  private void o() {
    this.C = new i();
    EnumMap<e.f.c.e, Object> enumMap = new EnumMap<e.f.c.e, Object>(e.f.c.e.class);
    EnumSet<e.f.c.a> enumSet = EnumSet.noneOf(e.f.c.a.class);
    List<String> list = this.o;
    if (list != null)
      for (String str : list) {
        str = (String)CameraModule.VALID_BARCODE_TYPES.get(str);
        if (str != null)
          enumSet.add(e.f.c.a.valueOf(str)); 
      }  
    enumMap.put(e.f.c.e.e, enumSet);
    this.C.a(enumMap);
  }
  
  private void p() {
    this.E = new k.b.a.b((Context)this.j);
    this.E.a(this.N);
  }
  
  private void q() {
    this.D = new org.reactnative.facedetector.b((Context)this.j);
    this.D.c(this.K);
    this.D.b(this.L);
    this.D.a(this.M);
    this.D.a(this.P);
  }
  
  public void a() {
    this.B = false;
  }
  
  public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
    this.S = true;
    this.T = paramFloat1;
    this.U = paramFloat2;
    this.V = paramFloat3;
    this.W = paramFloat4;
  }
  
  public void a(int paramInt1, int paramInt2) {
    this.a0 = paramInt1;
    this.b0 = paramInt2;
  }
  
  public void a(ReadableMap paramReadableMap, Promise paramPromise, File paramFile) {
    this.i.post(new c(this, paramReadableMap, paramFile, paramPromise));
  }
  
  public void a(WritableArray paramWritableArray) {
    if (!this.I)
      return; 
    e.b((ViewGroup)this, paramWritableArray);
  }
  
  public void a(WritableArray paramWritableArray, int paramInt1, int paramInt2, byte[] paramArrayOfbyte) {
    if (!this.G)
      return; 
    if (this.p) {
      try {
        YuvImage yuvImage = new YuvImage(paramArrayOfbyte, 17, paramInt1, paramInt2, null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        yuvImage.compressToJpeg(new Rect(0, 0, paramInt1, paramInt2), 100, byteArrayOutputStream);
        byte[] arrayOfByte = byteArrayOutputStream.toByteArray();
        paramArrayOfbyte = arrayOfByte;
      } catch (Exception exception) {
        throw new RuntimeException(String.format("Error decoding imageData from NV21 format (%d bytes)", new Object[] { Integer.valueOf(paramArrayOfbyte.length) }), exception);
      } 
    } else {
      paramArrayOfbyte = null;
    } 
    e.a((ViewGroup)this, (WritableArray)exception, paramArrayOfbyte);
  }
  
  public void a(WritableMap paramWritableMap) {
    e.a((ViewGroup)this, paramWritableMap);
  }
  
  public void a(n paramn, int paramInt1, int paramInt2, byte[] paramArrayOfbyte) {
    String str = paramn.a().toString();
    if (this.H) {
      if (!this.o.contains(str))
        return; 
      if (this.p) {
        try {
          YuvImage yuvImage = new YuvImage(paramArrayOfbyte, 17, paramInt1, paramInt2, null);
          ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
          yuvImage.compressToJpeg(new Rect(0, 0, paramInt1, paramInt2), 100, byteArrayOutputStream);
          byte[] arrayOfByte = byteArrayOutputStream.toByteArray();
          paramArrayOfbyte = arrayOfByte;
        } catch (Exception exception) {
          throw new RuntimeException(String.format("Error decoding imageData from NV21 format (%d bytes)", new Object[] { Integer.valueOf(paramArrayOfbyte.length) }), exception);
        } 
      } else {
        paramArrayOfbyte = null;
      } 
      e.a((ViewGroup)this, (n)exception, paramInt1, paramInt2, paramArrayOfbyte);
    } 
  }
  
  public void a(k.b.a.b paramb) {
    if (!this.G)
      return; 
    e.a((ViewGroup)this, paramb);
  }
  
  public void a(org.reactnative.facedetector.b paramb) {
    if (!this.F)
      return; 
    e.a((ViewGroup)this, paramb);
  }
  
  public void b() {
    this.y = false;
    i i1 = this.C;
    if (i1 != null)
      i1.a(); 
  }
  
  public void b(ReadableMap paramReadableMap, Promise paramPromise, File paramFile) {
    this.i.post(new b(this, paramPromise, paramReadableMap, paramFile));
  }
  
  public void b(WritableArray paramWritableArray) {
    if (!this.F)
      return; 
    e.a((ViewGroup)this, paramWritableArray);
  }
  
  public void c() {
    this.z = false;
  }
  
  public void d() {
    this.A = false;
  }
  
  public void onHostDestroy() {
    org.reactnative.facedetector.b b2 = this.D;
    if (b2 != null)
      b2.b(); 
    k.b.a.b b1 = this.E;
    if (b1 != null)
      b1.b(); 
    this.C = null;
    this.j.removeLifecycleEventListener(this);
    this.i.post(new e(this));
  }
  
  public void onHostPause() {
    if (this.v.booleanValue())
      this.w = Boolean.valueOf(true); 
    if (!this.s && f()) {
      this.s = true;
      l();
    } 
  }
  
  public void onHostResume() {
    if (n()) {
      this.i.post(new d(this));
      return;
    } 
    e.a((ViewGroup)this, "Camera permissions not granted - component could not be rendered.");
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    View view = getView();
    if (view == null)
      return; 
    float f1 = (paramInt3 - paramInt1);
    float f2 = (paramInt4 - paramInt2);
    float f3 = getAspectRatio().t();
    paramInt1 = (getResources().getConfiguration()).orientation;
    setBackgroundColor(-16777216);
    if (paramInt1 == 2) {
      float f4 = f3 * f2;
      if (f4 < f1) {
        paramInt1 = (int)(f1 / f3);
      } else {
        paramInt1 = (int)f4;
        paramInt3 = (int)f2;
        paramInt2 = paramInt1;
        paramInt1 = paramInt3;
      } 
    } else {
      float f4 = f3 * f1;
      if (f4 > f2) {
        paramInt1 = (int)f4;
      } else {
        paramInt1 = (int)(f2 / f3);
        paramInt3 = (int)f2;
        paramInt2 = paramInt1;
        paramInt1 = paramInt3;
      } 
    } 
    paramInt2 = (int)f1;
    paramInt3 = (int)((f1 - paramInt2) / 2.0F);
    paramInt4 = (int)((f2 - paramInt1) / 2.0F);
    this.Q = paramInt3;
    this.R = paramInt4;
    view.layout(paramInt3, paramInt4, paramInt2 + paramInt3, paramInt1 + paramInt4);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent) {
    if (this.x)
      this.q.onTouchEvent(paramMotionEvent); 
    if (this.J)
      this.r.onTouchEvent(paramMotionEvent); 
    return true;
  }
  
  @SuppressLint({"all"})
  public void requestLayout() {}
  
  public void setBarCodeTypes(List<String> paramList) {
    this.o = paramList;
    o();
  }
  
  public void setDetectedImageInEvent(boolean paramBoolean) {
    this.p = paramBoolean;
  }
  
  public void setFaceDetectionClassifications(int paramInt) {
    this.M = paramInt;
    org.reactnative.facedetector.b b1 = this.D;
    if (b1 != null)
      b1.a(paramInt); 
  }
  
  public void setFaceDetectionLandmarks(int paramInt) {
    this.L = paramInt;
    org.reactnative.facedetector.b b1 = this.D;
    if (b1 != null)
      b1.b(paramInt); 
  }
  
  public void setFaceDetectionMode(int paramInt) {
    this.K = paramInt;
    org.reactnative.facedetector.b b1 = this.D;
    if (b1 != null)
      b1.c(paramInt); 
  }
  
  public void setGoogleVisionBarcodeMode(int paramInt) {
    this.O = paramInt;
  }
  
  public void setGoogleVisionBarcodeType(int paramInt) {
    this.N = paramInt;
    k.b.a.b b1 = this.E;
    if (b1 != null)
      b1.a(paramInt); 
  }
  
  public void setShouldDetectFaces(boolean paramBoolean) {
    if (paramBoolean && this.D == null)
      q(); 
    this.F = paramBoolean;
    if (this.F || this.G || this.H || this.I) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    } 
    setScanning(paramBoolean);
  }
  
  public void setShouldDetectTouches(boolean paramBoolean) {
    GestureDetector gestureDetector;
    if (!this.J && paramBoolean) {
      gestureDetector = new GestureDetector((Context)this.j, (GestureDetector.OnGestureListener)this.c0);
    } else {
      gestureDetector = null;
    } 
    this.r = gestureDetector;
    this.J = paramBoolean;
  }
  
  public void setShouldGoogleDetectBarcodes(boolean paramBoolean) {
    if (paramBoolean && this.E == null)
      p(); 
    this.G = paramBoolean;
    if (this.F || this.G || this.H || this.I) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    } 
    setScanning(paramBoolean);
  }
  
  public void setShouldRecognizeText(boolean paramBoolean) {
    this.I = paramBoolean;
    if (this.F || this.G || this.H || this.I) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    } 
    setScanning(paramBoolean);
  }
  
  public void setShouldScanBarCodes(boolean paramBoolean) {
    if (paramBoolean && this.C == null)
      o(); 
    this.H = paramBoolean;
    if (this.F || this.G || this.H || this.I) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    } 
    setScanning(paramBoolean);
  }
  
  public void setTracking(boolean paramBoolean) {
    this.P = paramBoolean;
    org.reactnative.facedetector.b b1 = this.D;
    if (b1 != null)
      b1.a(paramBoolean); 
  }
  
  public void setUseNativeZoom(boolean paramBoolean) {
    ScaleGestureDetector scaleGestureDetector;
    if (!this.x && paramBoolean) {
      scaleGestureDetector = new ScaleGestureDetector((Context)this.j, this.d0);
    } else {
      scaleGestureDetector = null;
    } 
    this.q = scaleGestureDetector;
    this.x = paramBoolean;
  }
  
  class a extends e.b {
    a(d this$0) {}
    
    public void a(e param1e, String param1String, int param1Int1, int param1Int2) {
      WritableMap writableMap = Arguments.createMap();
      writableMap.putInt("videoOrientation", param1Int1);
      writableMap.putInt("deviceOrientation", param1Int2);
      writableMap.putString("uri", c.b(new File(param1String)).toString());
      e.b((ViewGroup)param1e, writableMap);
    }
    
    public void a(e param1e, byte[] param1ArrayOfbyte, int param1Int) {
      Promise promise = d.a(this.a).poll();
      ReadableMap readableMap = (ReadableMap)d.b(this.a).remove(promise);
      if (readableMap.hasKey("fastMode") && readableMap.getBoolean("fastMode"))
        promise.resolve(null); 
      File file = (File)d.m(this.a).remove(promise);
      if (Build.VERSION.SDK_INT >= 11) {
        (new h(param1ArrayOfbyte, promise, readableMap, file, param1Int, this.a)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new Void[0]);
      } else {
        (new h(param1ArrayOfbyte, promise, readableMap, file, param1Int, this.a)).execute((Object[])new Void[0]);
      } 
      e.b((ViewGroup)param1e);
    }
    
    public void a(e param1e, byte[] param1ArrayOfbyte, int param1Int1, int param1Int2, int param1Int3) {
      boolean bool1;
      boolean bool2;
      boolean bool3;
      int i = e.a(param1Int3, this.a.getFacing(), this.a.getCameraOrientation());
      if (d.w(this.a) && !this.a.y && param1e instanceof b) {
        param1Int3 = 1;
      } else {
        param1Int3 = 0;
      } 
      if (d.x(this.a) && !this.a.z && param1e instanceof f) {
        bool1 = true;
      } else {
        bool1 = false;
      } 
      if (d.y(this.a) && !this.a.A && param1e instanceof d) {
        bool3 = true;
      } else {
        bool3 = false;
      } 
      if (d.z(this.a) && !this.a.B && param1e instanceof j) {
        bool2 = true;
      } else {
        bool2 = false;
      } 
      if (param1Int3 == 0 && !bool1 && !bool3 && !bool2)
        return; 
      double d1 = param1ArrayOfbyte.length;
      double d2 = param1Int1;
      Double.isNaN(d2);
      double d3 = param1Int2;
      Double.isNaN(d3);
      if (d1 < d2 * 1.5D * d3)
        return; 
      if (param1Int3 != 0) {
        d d4 = this.a;
        d4.y = true;
        (new a((b)param1e, d.c(d4), param1ArrayOfbyte, param1Int1, param1Int2, d.d(this.a), d.e(this.a), d.f(this.a), d.g(this.a), d.h(this.a), d.i(this.a), d.j(this.a), this.a.getAspectRatio().t())).execute((Object[])new Void[0]);
      } 
      if (bool1) {
        a a2 = this;
        d d4 = a2.a;
        d4.z = true;
        (new e((f)param1e, d.k(d4), param1ArrayOfbyte, param1Int1, param1Int2, i, (a2.a.getResources().getDisplayMetrics()).density, a2.a.getFacing(), a2.a.getWidth(), a2.a.getHeight(), d.l(a2.a), d.n(a2.a))).execute((Object[])new Void[0]);
      } 
      a a1 = this;
      if (bool3) {
        d d4 = a1.a;
        d4.A = true;
        if (d.o(d4) == k.b.a.b.e) {
          d.a(a1.a, false);
        } else if (d.o(a1.a) == k.b.a.b.f) {
          d4 = a1.a;
          d.a(d4, d.p(d4) ^ true);
        } else if (d.o(a1.a) == k.b.a.b.g) {
          d.a(a1.a, true);
        } 
        if (d.p(a1.a))
          for (param1Int3 = 0; param1Int3 < param1ArrayOfbyte.length; param1Int3++)
            param1ArrayOfbyte[param1Int3] = (byte)(param1ArrayOfbyte[param1Int3] ^ 0xFFFFFFFF);  
        (new c((d)param1e, d.q(a1.a), param1ArrayOfbyte, param1Int1, param1Int2, i, (a1.a.getResources().getDisplayMetrics()).density, a1.a.getFacing(), a1.a.getWidth(), a1.a.getHeight(), d.l(a1.a), d.n(a1.a))).execute((Object[])new Void[0]);
      } 
      if (bool2) {
        d d4 = a1.a;
        d4.B = true;
        (new i((j)param1e, d.r(d4), param1ArrayOfbyte, param1Int1, param1Int2, i, (a1.a.getResources().getDisplayMetrics()).density, a1.a.getFacing(), a1.a.getWidth(), a1.a.getHeight(), d.l(a1.a), d.n(a1.a))).execute((Object[])new Void[0]);
      } 
    }
    
    public void b(e param1e) {
      e.a((ViewGroup)param1e);
    }
    
    public void b(e param1e, String param1String, int param1Int1, int param1Int2) {
      if (d.u(this.a) != null) {
        if (param1String != null) {
          WritableMap writableMap = Arguments.createMap();
          writableMap.putBoolean("isRecordingInterrupted", d.v(this.a).booleanValue());
          writableMap.putInt("videoOrientation", param1Int1);
          writableMap.putInt("deviceOrientation", param1Int2);
          writableMap.putString("uri", c.b(new File(param1String)).toString());
          d.u(this.a).resolve(writableMap);
        } else {
          d.u(this.a).reject("E_RECORDING", "Couldn't stop recording - there is none in progress");
        } 
        d.b(this.a, Boolean.valueOf(false));
        d.a(this.a, Boolean.valueOf(false));
        d.a(this.a, (Promise)null);
      } 
    }
    
    public void c(e param1e) {
      e.a((ViewGroup)param1e, "Camera view threw an error - component could not be rendered.");
    }
    
    public void d(e param1e) {
      e.c((ViewGroup)param1e);
    }
  }
  
  class b implements Runnable {
    b(d this$0, Promise param1Promise, ReadableMap param1ReadableMap, File param1File) {}
    
    public void run() {
      d.a(this.f).add(this.c);
      d.b(this.f).put(this.c, this.d);
      d.m(this.f).put(this.c, this.e);
      try {
        d.a(this.f, this.d);
        return;
      } catch (Exception exception) {
        d.a(this.f).remove(this.c);
        d.b(this.f).remove(this.c);
        d.m(this.f).remove(this.c);
        this.c.reject("E_TAKE_PICTURE_FAILED", exception.getMessage());
        return;
      } 
    }
  }
  
  class c implements Runnable {
    c(d this$0, ReadableMap param1ReadableMap, File param1File, Promise param1Promise) {}
    
    public void run() {
      try {
        byte b1;
        byte b2;
        byte b3;
        boolean bool1;
        boolean bool2;
        String str;
        if (this.c.hasKey("path")) {
          str = this.c.getString("path");
        } else {
          str = c.a(this.d, ".mp4");
        } 
        if (this.c.hasKey("maxDuration")) {
          b1 = this.c.getInt("maxDuration");
        } else {
          b1 = -1;
        } 
        if (this.c.hasKey("maxFileSize")) {
          b2 = this.c.getInt("maxFileSize");
        } else {
          b2 = -1;
        } 
        if (this.c.hasKey("fps")) {
          b3 = this.c.getInt("fps");
        } else {
          b3 = -1;
        } 
        CamcorderProfile camcorderProfile = CamcorderProfile.get(1);
        if (this.c.hasKey("quality"))
          camcorderProfile = e.a(this.c.getInt("quality")); 
        if (this.c.hasKey("videoBitrate"))
          camcorderProfile.videoBitRate = this.c.getInt("videoBitrate"); 
        if (this.c.hasKey("mute")) {
          bool2 = this.c.getBoolean("mute") ^ true;
        } else {
          bool2 = true;
        } 
        if (this.c.hasKey("orientation")) {
          bool1 = this.c.getInt("orientation");
        } else {
          bool1 = false;
        } 
        if (d.a(this.f, str, b1 * 1000, b2, bool2, camcorderProfile, bool1, b3)) {
          d.b(this.f, Boolean.valueOf(true));
          d.a(this.f, this.e);
          return;
        } 
        this.e.reject("E_RECORDING_FAILED", "Starting video recording failed. Another recording might be in progress.");
        return;
      } catch (IOException iOException) {
        this.e.reject("E_RECORDING_FAILED", "Starting video recording failed - could not create video file.");
        return;
      } 
    }
  }
  
  class d implements Runnable {
    d(d this$0) {}
    
    public void run() {
      if ((d.s(this.c) && !this.c.f()) || d.t(this.c)) {
        d.b(this.c, false);
        d.c(this.c, false);
        this.c.k();
      } 
    }
  }
  
  class e implements Runnable {
    e(d this$0) {}
    
    public void run() {
      this.c.l();
      this.c.e();
    }
  }
  
  class f extends GestureDetector.SimpleOnGestureListener {
    f(d this$0) {}
    
    public boolean onDoubleTap(MotionEvent param1MotionEvent) {
      d d1 = this.c;
      e.a((ViewGroup)d1, true, d.a(d1, param1MotionEvent.getX()), d.a(this.c, param1MotionEvent.getY()));
      return true;
    }
    
    public boolean onSingleTapUp(MotionEvent param1MotionEvent) {
      d d1 = this.c;
      e.a((ViewGroup)d1, false, d.a(d1, param1MotionEvent.getX()), d.a(this.c, param1MotionEvent.getY()));
      return true;
    }
  }
  
  class g implements ScaleGestureDetector.OnScaleGestureListener {
    g(d this$0) {}
    
    public boolean onScale(ScaleGestureDetector param1ScaleGestureDetector) {
      d.b(this.a, param1ScaleGestureDetector.getScaleFactor());
      return true;
    }
    
    public boolean onScaleBegin(ScaleGestureDetector param1ScaleGestureDetector) {
      d.b(this.a, param1ScaleGestureDetector.getScaleFactor());
      return true;
    }
    
    public void onScaleEnd(ScaleGestureDetector param1ScaleGestureDetector) {}
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/org/reactnative/camera/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */