package e.f.a.b;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.media.CamcorderProfile;
import android.media.MediaActionSound;
import android.media.MediaRecorder;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.SurfaceHolder;
import com.facebook.react.bridge.ReadableMap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.SortedSet;
import java.util.concurrent.atomic.AtomicBoolean;

class b extends f implements MediaRecorder.OnInfoListener, MediaRecorder.OnErrorListener, Camera.PreviewCallback {
  private static final b.d.h<String> J = new b.d.h();
  
  private static final b.d.h<String> K = new b.d.h();
  
  private int A;
  
  private int B;
  
  private float C;
  
  private int D;
  
  private boolean E;
  
  private Boolean F;
  
  private boolean G;
  
  private boolean H;
  
  private SurfaceTexture I;
  
  private int f;
  
  private String g;
  
  private final AtomicBoolean h;
  
  Camera i;
  
  MediaActionSound j;
  
  private Camera.Parameters k;
  
  private final Camera.CameraInfo l;
  
  private MediaRecorder m;
  
  private String n;
  
  private final AtomicBoolean o;
  
  private final k p;
  
  private boolean q;
  
  private boolean r;
  
  private final k s;
  
  private j t;
  
  private a u;
  
  private boolean v;
  
  private int w;
  
  private int x;
  
  private float y;
  
  private int z;
  
  static {
    K.c(0, "auto");
    K.c(1, "cloudy-daylight");
    K.c(2, "daylight");
    K.c(3, "shade");
    K.c(4, "fluorescent");
    K.c(5, "incandescent");
  }
  
  b(f.a parama, i parami, Handler paramHandler) {
    super(parama, parami, paramHandler);
    new Handler();
    this.h = new AtomicBoolean(false);
    this.j = new MediaActionSound();
    this.l = new Camera.CameraInfo();
    this.o = new AtomicBoolean(false);
    this.p = new k();
    this.q = false;
    this.r = true;
    this.s = new k();
    this.B = 0;
    this.F = Boolean.valueOf(false);
    parami.a(new a(this));
  }
  
  private a C() {
    Iterator<a> iterator = this.p.c().iterator();
    a a1 = null;
    while (iterator.hasNext()) {
      a a2 = iterator.next();
      a1 = a2;
      if (a2.equals(g.a)) {
        a1 = a2;
        break;
      } 
    } 
    return a1;
  }
  
  private void D() {
    int m;
    String str = this.g;
    if (str == null) {
      try {
        m = Camera.getNumberOfCameras();
        if (m == 0) {
          this.f = -1;
          Log.w("CAMERA_1::", "getNumberOfCameras returned 0. No camera available.");
          return;
        } 
      } catch (Exception exception) {
        Log.e("CAMERA_1::", "chooseCamera failed.", exception);
        this.f = -1;
      } 
    } else {
      try {
        this.f = Integer.parseInt((String)exception);
        Camera.getCameraInfo(this.f, this.l);
        return;
      } catch (Exception exception1) {}
      this.f = -1;
    } 
    for (int i = 0;; i++) {
      if (i < m) {
        Camera.getCameraInfo(i, this.l);
        if (this.l.facing == this.w) {
          this.f = i;
          return;
        } 
      } else {
        this.f = 0;
        Camera.getCameraInfo(this.f, this.l);
        return;
      } 
    } 
  }
  
  private boolean E() {
    if (this.i != null)
      G(); 
    int i = this.f;
    if (i == -1)
      return false; 
    try {
      this.i = Camera.open(i);
      this.k = this.i.getParameters();
      this.p.a();
      for (Camera.Size size : this.k.getSupportedPreviewSizes())
        this.p.a(new j(size.width, size.height)); 
      this.s.a();
      for (Camera.Size size : this.k.getSupportedPictureSizes())
        this.s.a(new j(size.width, size.height)); 
      for (a a1 : this.p.c()) {
        if (this.s.b(a1) == null)
          this.p.a(a1); 
      } 
      if (this.u == null)
        this.u = g.a; 
      A();
      this.i.setDisplayOrientation(i(this.z));
      this.c.d();
      return true;
    } catch (RuntimeException runtimeException) {
      return false;
    } 
  }
  
  private void F() {
    if (Build.VERSION.SDK_INT >= 24)
      this.m.pause(); 
  }
  
  private void G() {
    Camera camera = this.i;
    if (camera != null) {
      camera.release();
      this.i = null;
      this.c.b();
      this.h.set(false);
      this.o.set(false);
    } 
  }
  
  private void H() {
    if (Build.VERSION.SDK_INT >= 24)
      this.m.resume(); 
  }
  
  private void I() {
    if (!this.q) {
      Camera camera = this.i;
      if (camera != null)
        try {
          this.q = true;
          camera.startPreview();
          if (this.E) {
            this.i.setPreviewCallback(this);
            return;
          } 
        } catch (Exception exception) {
          this.q = false;
          Log.e("CAMERA_1::", "startCameraPreview failed", exception);
        }  
    } 
  }
  
  private void J() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield m : Landroid/media/MediaRecorder;
    //   6: astore_3
    //   7: aload_3
    //   8: ifnull -> 65
    //   11: aload_0
    //   12: getfield m : Landroid/media/MediaRecorder;
    //   15: invokevirtual stop : ()V
    //   18: goto -> 32
    //   21: astore_3
    //   22: ldc 'CAMERA_1::'
    //   24: ldc_w 'stopMediaRecorder stop failed'
    //   27: aload_3
    //   28: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   31: pop
    //   32: aload_0
    //   33: getfield m : Landroid/media/MediaRecorder;
    //   36: invokevirtual reset : ()V
    //   39: aload_0
    //   40: getfield m : Landroid/media/MediaRecorder;
    //   43: invokevirtual release : ()V
    //   46: goto -> 60
    //   49: astore_3
    //   50: ldc 'CAMERA_1::'
    //   52: ldc_w 'stopMediaRecorder reset failed'
    //   55: aload_3
    //   56: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   59: pop
    //   60: aload_0
    //   61: aconst_null
    //   62: putfield m : Landroid/media/MediaRecorder;
    //   65: aload_0
    //   66: getfield c : Le/f/a/b/f$a;
    //   69: invokeinterface c : ()V
    //   74: aload_0
    //   75: aload_0
    //   76: getfield A : I
    //   79: invokevirtual f : (I)I
    //   82: istore_1
    //   83: aload_0
    //   84: getfield n : Ljava/lang/String;
    //   87: ifnull -> 154
    //   90: new java/io/File
    //   93: dup
    //   94: aload_0
    //   95: getfield n : Ljava/lang/String;
    //   98: invokespecial <init> : (Ljava/lang/String;)V
    //   101: invokevirtual exists : ()Z
    //   104: ifne -> 110
    //   107: goto -> 154
    //   110: aload_0
    //   111: getfield c : Le/f/a/b/f$a;
    //   114: astore_3
    //   115: aload_0
    //   116: getfield n : Ljava/lang/String;
    //   119: astore #4
    //   121: aload_0
    //   122: getfield B : I
    //   125: ifeq -> 191
    //   128: aload_0
    //   129: getfield B : I
    //   132: istore_2
    //   133: goto -> 136
    //   136: aload_3
    //   137: aload #4
    //   139: iload_2
    //   140: iload_1
    //   141: invokeinterface b : (Ljava/lang/String;II)V
    //   146: aload_0
    //   147: aconst_null
    //   148: putfield n : Ljava/lang/String;
    //   151: aload_0
    //   152: monitorexit
    //   153: return
    //   154: aload_0
    //   155: getfield c : Le/f/a/b/f$a;
    //   158: astore_3
    //   159: aload_0
    //   160: getfield B : I
    //   163: ifeq -> 196
    //   166: aload_0
    //   167: getfield B : I
    //   170: istore_2
    //   171: goto -> 174
    //   174: aload_3
    //   175: aconst_null
    //   176: iload_2
    //   177: iload_1
    //   178: invokeinterface b : (Ljava/lang/String;II)V
    //   183: aload_0
    //   184: monitorexit
    //   185: return
    //   186: astore_3
    //   187: aload_0
    //   188: monitorexit
    //   189: aload_3
    //   190: athrow
    //   191: iload_1
    //   192: istore_2
    //   193: goto -> 136
    //   196: iload_1
    //   197: istore_2
    //   198: goto -> 174
    // Exception table:
    //   from	to	target	type
    //   2	7	186	finally
    //   11	18	21	java/lang/RuntimeException
    //   11	18	186	finally
    //   22	32	186	finally
    //   32	46	49	java/lang/RuntimeException
    //   32	46	186	finally
    //   50	60	186	finally
    //   60	65	186	finally
    //   65	107	186	finally
    //   110	133	186	finally
    //   136	153	186	finally
    //   154	171	186	finally
    //   174	185	186	finally
    //   187	189	186	finally
  }
  
  private void K() {
    if (this.i != null) {
      if (!this.h.get() && !this.o.get()) {
        this.e.post(new c(this));
        return;
      } 
      this.G = true;
    } 
  }
  
  private j a(int paramInt1, int paramInt2, SortedSet<j> paramSortedSet) {
    if (paramSortedSet == null || paramSortedSet.isEmpty())
      return null; 
    j j2 = paramSortedSet.last();
    j j1 = j2;
    if (paramInt1 != 0) {
      j1 = j2;
      if (paramInt2 != 0) {
        Iterator<j> iterator = paramSortedSet.iterator();
        while (true) {
          j1 = j2;
          if (iterator.hasNext()) {
            j1 = iterator.next();
            if (paramInt1 <= j1.r() && paramInt2 <= j1.q())
              break; 
            continue;
          } 
          break;
        } 
      } 
    } 
    return j1;
  }
  
  private j a(SortedSet<j> paramSortedSet) {
    j j1;
    if (!this.d.j())
      return paramSortedSet.first(); 
    int n = this.d.i();
    int i = this.d.c();
    int i1 = n;
    int m = i;
    if (k(this.z)) {
      m = n;
      i1 = i;
    } 
    SortedSet sortedSet = null;
    Iterator<j> iterator = paramSortedSet.iterator();
    paramSortedSet = sortedSet;
    while (iterator.hasNext()) {
      j j2 = iterator.next();
      j1 = j2;
      if (i1 <= j2.r()) {
        j1 = j2;
        if (m <= j2.q()) {
          j1 = j2;
          break;
        } 
      } 
    } 
    return j1;
  }
  
  private void a(CamcorderProfile paramCamcorderProfile, boolean paramBoolean, int paramInt) {
    if (!j(paramInt))
      paramInt = paramCamcorderProfile.videoFrameRate; 
    this.m.setOutputFormat(paramCamcorderProfile.fileFormat);
    this.m.setVideoFrameRate(paramInt);
    this.m.setVideoSize(paramCamcorderProfile.videoFrameWidth, paramCamcorderProfile.videoFrameHeight);
    this.m.setVideoEncodingBitRate(paramCamcorderProfile.videoBitRate);
    this.m.setVideoEncoder(paramCamcorderProfile.videoCodec);
    if (paramBoolean) {
      this.m.setAudioEncodingBitRate(paramCamcorderProfile.audioBitRate);
      this.m.setAudioChannels(paramCamcorderProfile.audioChannels);
      this.m.setAudioSamplingRate(paramCamcorderProfile.audioSampleRate);
      this.m.setAudioEncoder(paramCamcorderProfile.audioCodec);
    } 
  }
  
  private void a(String paramString, int paramInt1, int paramInt2, boolean paramBoolean, CamcorderProfile paramCamcorderProfile, int paramInt3) {
    CamcorderProfile camcorderProfile;
    this.m = new MediaRecorder();
    this.i.unlock();
    this.m.setCamera(this.i);
    this.m.setVideoSource(1);
    if (paramBoolean)
      this.m.setAudioSource(5); 
    this.m.setOutputFile(paramString);
    this.n = paramString;
    if (CamcorderProfile.hasProfile(this.f, paramCamcorderProfile.quality)) {
      camcorderProfile = CamcorderProfile.get(this.f, paramCamcorderProfile.quality);
    } else {
      camcorderProfile = CamcorderProfile.get(this.f, 1);
    } 
    camcorderProfile.videoBitRate = paramCamcorderProfile.videoBitRate;
    a(camcorderProfile, paramBoolean, paramInt3);
    MediaRecorder mediaRecorder = this.m;
    paramInt3 = this.B;
    if (paramInt3 != 0) {
      paramInt3 = g(paramInt3);
    } else {
      paramInt3 = this.A;
    } 
    mediaRecorder.setOrientationHint(h(paramInt3));
    if (paramInt1 != -1)
      this.m.setMaxDuration(paramInt1); 
    if (paramInt2 != -1)
      this.m.setMaxFileSize(paramInt2); 
    this.m.setOnInfoListener(this);
    this.m.setOnErrorListener(this);
  }
  
  private Rect b(float paramFloat1, float paramFloat2) {
    int n = (int)(paramFloat1 * 2000.0F);
    int i = (int)(paramFloat2 * 2000.0F);
    int m = n - 150;
    int i1 = i - 150;
    n += 150;
    int i2 = i + 150;
    i = m;
    if (m < 0)
      i = 0; 
    m = n;
    if (n > 2000)
      m = 2000; 
    n = i1;
    if (i1 < 0)
      n = 0; 
    i1 = i2;
    if (i2 > 2000)
      i1 = 2000; 
    return new Rect(i - 1000, n - 1000, m - 1000, i1 - 1000);
  }
  
  private boolean d(float paramFloat) {
    this.y = paramFloat;
    boolean bool = s();
    byte b1 = 0;
    if (bool) {
      int i = this.k.getMinExposureCompensation();
      int m = this.k.getMaxExposureCompensation();
      if (i != m) {
        paramFloat = this.y;
        int n = b1;
        if (paramFloat >= 0.0F) {
          n = b1;
          if (paramFloat <= 1.0F)
            n = (int)(paramFloat * (m - i)) + i; 
        } 
        this.k.setExposureCompensation(n);
        return true;
      } 
    } 
    return false;
  }
  
  private boolean d(boolean paramBoolean) {
    this.v = paramBoolean;
    if (s()) {
      List<String> list = this.k.getSupportedFocusModes();
      if (paramBoolean) {
        String str1 = "continuous-picture";
        if (list.contains("continuous-picture")) {
          this.k.setFocusMode(str1);
          return true;
        } 
      } 
      if (this.E) {
        String str1 = "macro";
        if (list.contains("macro")) {
          this.k.setFocusMode(str1);
          return true;
        } 
      } 
      String str = "fixed";
      if (list.contains("fixed")) {
        this.k.setFocusMode(str);
        return true;
      } 
      str = "infinity";
      if (list.contains("infinity")) {
        this.k.setFocusMode(str);
        return true;
      } 
      this.k.setFocusMode(list.get(0));
      return true;
    } 
    return false;
  }
  
  private void e(boolean paramBoolean) {
    this.F = Boolean.valueOf(paramBoolean);
    Camera camera = this.i;
    if (camera != null)
      try {
        if (!camera.enableShutterSound(false)) {
          this.F = Boolean.valueOf(false);
          return;
        } 
      } catch (Exception exception) {
        Log.e("CAMERA_1::", "setPlaySoundInternal failed", exception);
        this.F = Boolean.valueOf(false);
      }  
  }
  
  private boolean e(float paramFloat) {
    if (s() && this.k.isZoomSupported()) {
      int i = (int)(this.k.getMaxZoom() * paramFloat);
      this.k.setZoom(i);
      this.C = paramFloat;
      return true;
    } 
    this.C = paramFloat;
    return false;
  }
  
  private void f(boolean paramBoolean) {
    this.E = paramBoolean;
    if (s()) {
      if (this.E) {
        this.i.setPreviewCallback(this);
        return;
      } 
      this.i.setPreviewCallback(null);
    } 
  }
  
  private int h(int paramInt) {
    byte b1;
    Camera.CameraInfo cameraInfo = this.l;
    if (cameraInfo.facing == 0)
      return (cameraInfo.orientation + paramInt) % 360; 
    if (k(paramInt)) {
      b1 = 180;
    } else {
      b1 = 0;
    } 
    return (this.l.orientation + paramInt + b1) % 360;
  }
  
  private int i(int paramInt) {
    Camera.CameraInfo cameraInfo = this.l;
    int i = cameraInfo.facing;
    int m = cameraInfo.orientation;
    return (i == 1) ? ((360 - (m + paramInt) % 360) % 360) : ((m - paramInt + 360) % 360);
  }
  
  private boolean j(int paramInt) {
    ArrayList<int[]> arrayList = o();
    int i = paramInt * 1000;
    Iterator<int> iterator = arrayList.iterator();
    while (true) {
      boolean bool1 = iterator.hasNext();
      boolean bool = false;
      if (bool1) {
        boolean bool2;
        int[] arrayOfInt = (int[])iterator.next();
        if (i >= arrayOfInt[0] && i <= arrayOfInt[1]) {
          paramInt = 1;
        } else {
          paramInt = 0;
        } 
        if (i > 0) {
          bool2 = true;
        } else {
          bool2 = false;
        } 
        boolean bool3 = bool;
        if (paramInt != 0) {
          bool3 = bool;
          if (bool2)
            bool3 = true; 
        } 
        if (bool3)
          return true; 
        continue;
      } 
      Log.w("CAMERA_1::", "fps (framePerSecond) received an unsupported value and will be ignored.");
      return false;
    } 
  }
  
  private boolean k(int paramInt) {
    return (paramInt == 90 || paramInt == 270);
  }
  
  private boolean l(int paramInt) {
    if (s()) {
      List list = this.k.getSupportedFlashModes();
      String str = (String)J.a(paramInt);
      if (list == null)
        return false; 
      if (list.contains(str)) {
        this.k.setFlashMode(str);
        this.x = paramInt;
        return true;
      } 
      if (!list.contains(J.a(this.x))) {
        this.k.setFlashMode("off");
        return true;
      } 
      return false;
    } 
    this.x = paramInt;
    return false;
  }
  
  private boolean m(int paramInt) {
    this.D = paramInt;
    if (s()) {
      List list = this.k.getSupportedWhiteBalance();
      String str = (String)K.a(paramInt);
      if (list != null && list.contains(str)) {
        this.k.setWhiteBalance(str);
        return true;
      } 
      str = (String)K.a(this.D);
      if (list == null || !list.contains(str)) {
        this.k.setWhiteBalance("auto");
        return true;
      } 
      return false;
    } 
    return false;
  }
  
  void A() {
    SortedSet<j> sortedSet2 = this.p.b(this.u);
    SortedSet<j> sortedSet1 = sortedSet2;
    if (sortedSet2 == null) {
      Log.w("CAMERA_1::", "adjustCameraParameters received an unsupported aspect ratio value and will be ignored.");
      this.u = C();
      sortedSet1 = this.p.b(this.u);
    } 
    j j2 = a(sortedSet1);
    j j1 = this.t;
    if (j1 != null) {
      j1 = a(j1.r(), this.t.q(), this.s.b(this.u));
    } else {
      j1 = a(0, 0, this.s.b(this.u));
    } 
    boolean bool = this.q;
    if (bool) {
      this.i.stopPreview();
      this.q = false;
    } 
    this.k.setPreviewSize(j2.r(), j2.q());
    this.k.setPictureSize(j1.r(), j1.q());
    int i = this.B;
    if (i != 0) {
      this.k.setRotation(h(g(i)));
    } else {
      this.k.setRotation(h(this.A));
    } 
    d(this.v);
    l(this.x);
    d(this.y);
    b(this.u);
    e(this.C);
    m(this.D);
    f(this.E);
    e(this.F.booleanValue());
    try {
      this.i.setParameters(this.k);
    } catch (RuntimeException runtimeException) {
      Log.e("CAMERA_1::", "setParameters failed", runtimeException);
    } 
    if (bool)
      I(); 
  }
  
  @SuppressLint({"NewApi"})
  void B() {
    try {
      Camera camera;
      SurfaceTexture surfaceTexture;
      this.H = false;
      if (this.i != null) {
        if (this.I != null) {
          camera = this.i;
          surfaceTexture = this.I;
        } else {
          if (this.d.d() == SurfaceHolder.class) {
            boolean bool;
            if (this.q && Build.VERSION.SDK_INT < 14) {
              bool = true;
            } else {
              bool = false;
            } 
            if (bool) {
              this.i.stopPreview();
              this.q = false;
            } 
            this.i.setPreviewDisplay(this.d.f());
            if (bool) {
              I();
              return;
            } 
          } else {
            camera = this.i;
            surfaceTexture = (SurfaceTexture)this.d.g();
            camera.setPreviewTexture(surfaceTexture);
          } 
          return;
        } 
      } else {
        return;
      } 
      camera.setPreviewTexture(surfaceTexture);
    } catch (Exception exception) {
      Log.e("CAMERA_1::", "setUpPreview failed", exception);
    } 
  }
  
  a a() {
    return this.u;
  }
  
  SortedSet<j> a(a parama) {
    return this.s.b(parama);
  }
  
  void a(float paramFloat) {
    if (paramFloat == this.y)
      return; 
    if (d(paramFloat))
      try {
        if (this.i != null) {
          this.i.setParameters(this.k);
          return;
        } 
      } catch (RuntimeException runtimeException) {
        Log.e("CAMERA_1::", "setParameters failed", runtimeException);
      }  
  }
  
  void a(float paramFloat1, float paramFloat2) {
    this.e.post(new b(this, paramFloat1, paramFloat2));
  }
  
  void a(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield A : I
    //   6: iload_1
    //   7: if_icmpne -> 13
    //   10: aload_0
    //   11: monitorexit
    //   12: return
    //   13: aload_0
    //   14: iload_1
    //   15: putfield A : I
    //   18: aload_0
    //   19: invokevirtual s : ()Z
    //   22: ifeq -> 89
    //   25: aload_0
    //   26: getfield B : I
    //   29: ifne -> 89
    //   32: aload_0
    //   33: getfield o : Ljava/util/concurrent/atomic/AtomicBoolean;
    //   36: invokevirtual get : ()Z
    //   39: ifne -> 89
    //   42: aload_0
    //   43: getfield h : Ljava/util/concurrent/atomic/AtomicBoolean;
    //   46: invokevirtual get : ()Z
    //   49: ifne -> 89
    //   52: aload_0
    //   53: getfield k : Landroid/hardware/Camera$Parameters;
    //   56: aload_0
    //   57: iload_1
    //   58: invokespecial h : (I)I
    //   61: invokevirtual setRotation : (I)V
    //   64: aload_0
    //   65: getfield i : Landroid/hardware/Camera;
    //   68: aload_0
    //   69: getfield k : Landroid/hardware/Camera$Parameters;
    //   72: invokevirtual setParameters : (Landroid/hardware/Camera$Parameters;)V
    //   75: goto -> 89
    //   78: astore_2
    //   79: ldc 'CAMERA_1::'
    //   81: ldc_w 'setParameters failed'
    //   84: aload_2
    //   85: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   88: pop
    //   89: aload_0
    //   90: monitorexit
    //   91: return
    //   92: astore_2
    //   93: aload_0
    //   94: monitorexit
    //   95: aload_2
    //   96: athrow
    // Exception table:
    //   from	to	target	type
    //   2	12	92	finally
    //   13	64	92	finally
    //   64	75	78	java/lang/RuntimeException
    //   64	75	92	finally
    //   79	89	92	finally
    //   89	91	92	finally
    //   93	95	92	finally
  }
  
  public void a(SurfaceTexture paramSurfaceTexture) {
    this.e.post(new j(this, paramSurfaceTexture));
  }
  
  void a(ReadableMap paramReadableMap) {
    if (s()) {
      if (this.q) {
        b(paramReadableMap);
        return;
      } 
      throw new IllegalStateException("Preview is paused - resume it before taking a picture.");
    } 
    throw new IllegalStateException("Camera is not ready. Call start() before takePicture().");
  }
  
  void a(j paramj) {
    if (paramj == null && this.t == null)
      return; 
    if (paramj != null && paramj.equals(this.t))
      return; 
    this.t = paramj;
    if (s())
      this.e.post(new g(this)); 
  }
  
  void a(String paramString) {
    if (!org.reactnative.camera.h.b.a(this.g, paramString)) {
      this.g = paramString;
      if (!org.reactnative.camera.h.b.a(this.g, String.valueOf(this.f)))
        this.e.post(new f(this)); 
    } 
  }
  
  void a(boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: getfield v : Z
    //   4: iload_1
    //   5: if_icmpne -> 9
    //   8: return
    //   9: aload_0
    //   10: monitorenter
    //   11: aload_0
    //   12: iload_1
    //   13: invokespecial d : (Z)Z
    //   16: istore_1
    //   17: iload_1
    //   18: ifeq -> 53
    //   21: aload_0
    //   22: getfield i : Landroid/hardware/Camera;
    //   25: ifnull -> 53
    //   28: aload_0
    //   29: getfield i : Landroid/hardware/Camera;
    //   32: aload_0
    //   33: getfield k : Landroid/hardware/Camera$Parameters;
    //   36: invokevirtual setParameters : (Landroid/hardware/Camera$Parameters;)V
    //   39: goto -> 53
    //   42: astore_2
    //   43: ldc 'CAMERA_1::'
    //   45: ldc_w 'setParameters failed'
    //   48: aload_2
    //   49: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   52: pop
    //   53: aload_0
    //   54: monitorexit
    //   55: return
    //   56: astore_2
    //   57: aload_0
    //   58: monitorexit
    //   59: aload_2
    //   60: athrow
    // Exception table:
    //   from	to	target	type
    //   11	17	56	finally
    //   21	39	42	java/lang/RuntimeException
    //   21	39	56	finally
    //   43	53	56	finally
    //   53	55	56	finally
    //   57	59	56	finally
  }
  
  boolean a(String paramString, int paramInt1, int paramInt2, boolean paramBoolean, CamcorderProfile paramCamcorderProfile, int paramInt3, int paramInt4) {
    f.a a1;
    if (!this.h.get() && this.o.compareAndSet(false, true)) {
      if (paramInt3 != 0)
        this.B = paramInt3; 
      try {
        a(paramString, paramInt1, paramInt2, paramBoolean, paramCamcorderProfile, paramInt4);
        this.m.prepare();
        this.m.start();
        try {
          this.i.setParameters(this.k);
        } catch (Exception exception1) {
          Log.e("CAMERA_1::", "Record setParameters failed", exception1);
        } 
        paramInt2 = f(this.A);
        a1 = this.c;
        if (this.B != 0) {
          paramInt1 = this.B;
          a1.a(paramString, paramInt1, paramInt2);
          return true;
        } 
      } catch (Exception exception) {
        this.o.set(false);
        Log.e("CAMERA_1::", "Record start failed", exception);
        return false;
      } 
    } else {
      return false;
    } 
    paramInt1 = paramInt2;
    a1.a((String)exception, paramInt1, paramInt2);
    return true;
  }
  
  public void b(float paramFloat) {}
  
  void b(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield z : I
    //   6: iload_1
    //   7: if_icmpne -> 13
    //   10: aload_0
    //   11: monitorexit
    //   12: return
    //   13: aload_0
    //   14: iload_1
    //   15: putfield z : I
    //   18: aload_0
    //   19: invokevirtual s : ()Z
    //   22: ifeq -> 95
    //   25: aload_0
    //   26: getfield q : Z
    //   29: ifeq -> 103
    //   32: getstatic android/os/Build$VERSION.SDK_INT : I
    //   35: bipush #14
    //   37: if_icmpge -> 103
    //   40: iconst_1
    //   41: istore_2
    //   42: goto -> 45
    //   45: iload_2
    //   46: ifeq -> 61
    //   49: aload_0
    //   50: getfield i : Landroid/hardware/Camera;
    //   53: invokevirtual stopPreview : ()V
    //   56: aload_0
    //   57: iconst_0
    //   58: putfield q : Z
    //   61: aload_0
    //   62: getfield i : Landroid/hardware/Camera;
    //   65: aload_0
    //   66: iload_1
    //   67: invokespecial i : (I)I
    //   70: invokevirtual setDisplayOrientation : (I)V
    //   73: goto -> 87
    //   76: astore_3
    //   77: ldc 'CAMERA_1::'
    //   79: ldc_w 'setDisplayOrientation failed'
    //   82: aload_3
    //   83: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   86: pop
    //   87: iload_2
    //   88: ifeq -> 95
    //   91: aload_0
    //   92: invokespecial I : ()V
    //   95: aload_0
    //   96: monitorexit
    //   97: return
    //   98: astore_3
    //   99: aload_0
    //   100: monitorexit
    //   101: aload_3
    //   102: athrow
    //   103: iconst_0
    //   104: istore_2
    //   105: goto -> 45
    // Exception table:
    //   from	to	target	type
    //   2	12	98	finally
    //   13	40	98	finally
    //   49	61	98	finally
    //   61	73	76	java/lang/RuntimeException
    //   61	73	98	finally
    //   77	87	98	finally
    //   91	95	98	finally
    //   95	97	98	finally
    //   99	101	98	finally
  }
  
  void b(ReadableMap paramReadableMap) {
    if (!this.o.get() && this.h.compareAndSet(false, true))
      try {
        boolean bool = paramReadableMap.hasKey("orientation");
        if (bool && paramReadableMap.getInt("orientation") != 0) {
          this.B = paramReadableMap.getInt("orientation");
          int i = g(this.B);
          this.k.setRotation(h(i));
          try {
            this.i.setParameters(this.k);
          } catch (RuntimeException runtimeException) {
            Log.e("CAMERA_1::", "setParameters rotation failed", runtimeException);
          } 
        } 
        if (paramReadableMap.hasKey("quality")) {
          this.k.setJpegQuality((int)(paramReadableMap.getDouble("quality") * 100.0D));
          try {
            this.i.setParameters(this.k);
          } catch (RuntimeException runtimeException) {
            Log.e("CAMERA_1::", "setParameters quality failed", runtimeException);
          } 
        } 
        this.i.takePicture(null, null, null, new i(this, paramReadableMap));
        return;
      } catch (Exception exception) {
        this.h.set(false);
        throw exception;
      }  
    throw new IllegalStateException("Camera capture failed. Camera is already capturing.");
  }
  
  void b(boolean paramBoolean) {
    if (paramBoolean == this.F.booleanValue())
      return; 
    e(paramBoolean);
  }
  
  boolean b() {
    if (!s())
      return this.v; 
    String str = this.k.getFocusMode();
    return (str != null && str.contains("continuous"));
  }
  
  boolean b(a parama) {
    if (this.u == null || !s()) {
      this.u = parama;
      return true;
    } 
    if (!this.u.equals(parama))
      if (this.p.b(parama) == null) {
        Log.w("CAMERA_1::", "setAspectRatio received an unsupported value and will be ignored.");
      } else {
        this.u = parama;
        this.e.post(new h(this));
        return true;
      }  
    return false;
  }
  
  String c() {
    return this.g;
  }
  
  void c(float paramFloat) {
    if (paramFloat == this.C)
      return; 
    if (e(paramFloat))
      try {
        if (this.i != null) {
          this.i.setParameters(this.k);
          return;
        } 
      } catch (RuntimeException runtimeException) {
        Log.e("CAMERA_1::", "setParameters failed", runtimeException);
      }  
  }
  
  void c(int paramInt) {
    if (this.w == paramInt)
      return; 
    this.w = paramInt;
    this.e.post(new e(this));
  }
  
  void c(boolean paramBoolean) {
    if (paramBoolean == this.E)
      return; 
    f(paramBoolean);
  }
  
  List<Properties> d() {
    ArrayList<Properties> arrayList = new ArrayList();
    Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
    int m = Camera.getNumberOfCameras();
    for (int i = 0; i < m; i++) {
      Properties properties = new Properties();
      Camera.getCameraInfo(i, cameraInfo);
      properties.put("id", String.valueOf(i));
      properties.put("type", String.valueOf(cameraInfo.facing));
      arrayList.add(properties);
    } 
    return arrayList;
  }
  
  void d(int paramInt) {
    if (paramInt == this.x)
      return; 
    if (l(paramInt))
      try {
        if (this.i != null) {
          this.i.setParameters(this.k);
          return;
        } 
      } catch (RuntimeException runtimeException) {
        Log.e("CAMERA_1::", "setParameters failed", runtimeException);
      }  
  }
  
  int e() {
    return this.l.orientation;
  }
  
  public void e(int paramInt) {
    if (paramInt == this.D)
      return; 
    if (m(paramInt))
      try {
        if (this.i != null) {
          this.i.setParameters(this.k);
          return;
        } 
      } catch (RuntimeException runtimeException) {
        Log.e("CAMERA_1::", "setParameters failed", runtimeException);
      }  
  }
  
  float f() {
    return this.y;
  }
  
  int f(int paramInt) {
    return (paramInt != 0) ? ((paramInt != 90) ? ((paramInt != 180) ? ((paramInt != 270) ? 1 : 3) : 2) : 4) : 1;
  }
  
  int g() {
    return this.w;
  }
  
  int g(int paramInt) {
    return (paramInt != 1) ? ((paramInt != 2) ? ((paramInt != 3) ? ((paramInt != 4) ? 1 : 90) : 270) : 180) : 0;
  }
  
  int h() {
    return this.x;
  }
  
  float i() {
    return 0.0F;
  }
  
  j j() {
    return this.t;
  }
  
  public boolean k() {
    return this.F.booleanValue();
  }
  
  public j l() {
    Camera.Size size = this.k.getPreviewSize();
    return new j(size.width, size.height);
  }
  
  boolean m() {
    return this.E;
  }
  
  Set<a> n() {
    k k1 = this.p;
    for (a a1 : k1.c()) {
      if (this.s.b(a1) == null)
        k1.a(a1); 
    } 
    return k1.c();
  }
  
  public ArrayList<int[]> o() {
    return (ArrayList<int[]>)this.k.getSupportedPreviewFpsRange();
  }
  
  public void onError(MediaRecorder paramMediaRecorder, int paramInt1, int paramInt2) {
    z();
  }
  
  public void onInfo(MediaRecorder paramMediaRecorder, int paramInt1, int paramInt2) {
    if (paramInt1 == 800 || paramInt1 == 801)
      z(); 
  }
  
  public void onPreviewFrame(byte[] paramArrayOfbyte, Camera paramCamera) {
    Camera.Size size = this.k.getPreviewSize();
    this.c.a(paramArrayOfbyte, size.width, size.height, this.A);
  }
  
  public int q() {
    return this.D;
  }
  
  float r() {
    return this.C;
  }
  
  boolean s() {
    return (this.i != null);
  }
  
  public void t() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: iconst_0
    //   4: putfield q : Z
    //   7: aload_0
    //   8: iconst_0
    //   9: putfield r : Z
    //   12: aload_0
    //   13: getfield i : Landroid/hardware/Camera;
    //   16: ifnull -> 26
    //   19: aload_0
    //   20: getfield i : Landroid/hardware/Camera;
    //   23: invokevirtual stopPreview : ()V
    //   26: aload_0
    //   27: monitorexit
    //   28: return
    //   29: astore_1
    //   30: aload_0
    //   31: monitorexit
    //   32: aload_1
    //   33: athrow
    // Exception table:
    //   from	to	target	type
    //   2	26	29	finally
    //   26	28	29	finally
    //   30	32	29	finally
  }
  
  void u() {
    F();
  }
  
  public void v() {
    this.e.post(new d(this));
  }
  
  void w() {
    H();
  }
  
  boolean x() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokespecial D : ()V
    //   6: aload_0
    //   7: invokespecial E : ()Z
    //   10: ifne -> 26
    //   13: aload_0
    //   14: getfield c : Le/f/a/b/f$a;
    //   17: invokeinterface a : ()V
    //   22: aload_0
    //   23: monitorexit
    //   24: iconst_1
    //   25: ireturn
    //   26: aload_0
    //   27: getfield d : Le/f/a/b/i;
    //   30: invokevirtual j : ()Z
    //   33: ifeq -> 51
    //   36: aload_0
    //   37: invokevirtual B : ()V
    //   40: aload_0
    //   41: getfield r : Z
    //   44: ifeq -> 51
    //   47: aload_0
    //   48: invokespecial I : ()V
    //   51: aload_0
    //   52: monitorexit
    //   53: iconst_1
    //   54: ireturn
    //   55: astore_1
    //   56: aload_0
    //   57: monitorexit
    //   58: aload_1
    //   59: athrow
    // Exception table:
    //   from	to	target	type
    //   2	24	55	finally
    //   26	51	55	finally
    //   51	53	55	finally
    //   56	58	55	finally
  }
  
  void y() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield m : Landroid/media/MediaRecorder;
    //   6: astore_3
    //   7: aload_3
    //   8: ifnull -> 129
    //   11: aload_0
    //   12: getfield m : Landroid/media/MediaRecorder;
    //   15: invokevirtual stop : ()V
    //   18: goto -> 32
    //   21: astore_3
    //   22: ldc 'CAMERA_1::'
    //   24: ldc_w 'mMediaRecorder.stop() failed'
    //   27: aload_3
    //   28: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   31: pop
    //   32: aload_0
    //   33: getfield m : Landroid/media/MediaRecorder;
    //   36: invokevirtual reset : ()V
    //   39: aload_0
    //   40: getfield m : Landroid/media/MediaRecorder;
    //   43: invokevirtual release : ()V
    //   46: goto -> 60
    //   49: astore_3
    //   50: ldc 'CAMERA_1::'
    //   52: ldc_w 'mMediaRecorder.release() failed'
    //   55: aload_3
    //   56: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   59: pop
    //   60: aload_0
    //   61: aconst_null
    //   62: putfield m : Landroid/media/MediaRecorder;
    //   65: aload_0
    //   66: getfield o : Ljava/util/concurrent/atomic/AtomicBoolean;
    //   69: invokevirtual get : ()Z
    //   72: ifeq -> 129
    //   75: aload_0
    //   76: getfield c : Le/f/a/b/f$a;
    //   79: invokeinterface c : ()V
    //   84: aload_0
    //   85: aload_0
    //   86: getfield A : I
    //   89: invokevirtual f : (I)I
    //   92: istore_2
    //   93: aload_0
    //   94: getfield c : Le/f/a/b/f$a;
    //   97: astore_3
    //   98: aload_0
    //   99: getfield n : Ljava/lang/String;
    //   102: astore #4
    //   104: aload_0
    //   105: getfield B : I
    //   108: ifeq -> 182
    //   111: aload_0
    //   112: getfield B : I
    //   115: istore_1
    //   116: goto -> 119
    //   119: aload_3
    //   120: aload #4
    //   122: iload_1
    //   123: iload_2
    //   124: invokeinterface b : (Ljava/lang/String;II)V
    //   129: aload_0
    //   130: getfield i : Landroid/hardware/Camera;
    //   133: ifnull -> 170
    //   136: aload_0
    //   137: iconst_0
    //   138: putfield q : Z
    //   141: aload_0
    //   142: getfield i : Landroid/hardware/Camera;
    //   145: invokevirtual stopPreview : ()V
    //   148: aload_0
    //   149: getfield i : Landroid/hardware/Camera;
    //   152: aconst_null
    //   153: invokevirtual setPreviewCallback : (Landroid/hardware/Camera$PreviewCallback;)V
    //   156: goto -> 170
    //   159: astore_3
    //   160: ldc 'CAMERA_1::'
    //   162: ldc_w 'stop preview cleanup failed'
    //   165: aload_3
    //   166: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   169: pop
    //   170: aload_0
    //   171: invokespecial G : ()V
    //   174: aload_0
    //   175: monitorexit
    //   176: return
    //   177: astore_3
    //   178: aload_0
    //   179: monitorexit
    //   180: aload_3
    //   181: athrow
    //   182: iload_2
    //   183: istore_1
    //   184: goto -> 119
    // Exception table:
    //   from	to	target	type
    //   2	7	177	finally
    //   11	18	21	java/lang/RuntimeException
    //   11	18	177	finally
    //   22	32	177	finally
    //   32	46	49	java/lang/RuntimeException
    //   32	46	177	finally
    //   50	60	177	finally
    //   60	116	177	finally
    //   119	129	177	finally
    //   129	141	177	finally
    //   141	156	159	java/lang/Exception
    //   141	156	177	finally
    //   160	170	177	finally
    //   170	176	177	finally
    //   178	180	177	finally
  }
  
  void z() {
    if (this.o.compareAndSet(true, false)) {
      J();
      Camera camera = this.i;
      if (camera != null)
        camera.lock(); 
      if (this.G)
        K(); 
    } 
  }
  
  static {
    J.c(0, "off");
    J.c(1, "on");
    J.c(2, "torch");
    J.c(3, "auto");
    J.c(4, "red-eye");
  }
  
  class a implements i.a {
    a(b this$0) {}
    
    public void a() {
      synchronized (this.a) {
        if (this.a.i != null) {
          b.a(this.a, true);
          try {
            this.a.i.setPreviewCallback(null);
            this.a.i.setPreviewDisplay(null);
          } catch (Exception exception) {
            Log.e("CAMERA_1::", "onSurfaceDestroyed preview cleanup failed", exception);
          } 
        } 
        this.a.e.post(new b(this));
        return;
      } 
    }
    
    public void b() {
      synchronized (this.a) {
        if (!b.a(this.a)) {
          b.b(this.a);
        } else {
          this.a.e.post(new a(this));
        } 
        return;
      } 
    }
    
    class a implements Runnable {
      a(b.a this$0) {}
      
      public void run() {
        this.c.a.x();
      }
    }
    
    class b implements Runnable {
      b(b.a this$0) {}
      
      public void run() {
        this.c.a.y();
      }
    }
  }
  
  class a implements Runnable {
    a(b this$0) {}
    
    public void run() {
      this.c.a.x();
    }
  }
  
  class b implements Runnable {
    b(b this$0) {}
    
    public void run() {
      this.c.a.y();
    }
  }
  
  class b implements Runnable {
    b(b this$0, float param1Float1, float param1Float2) {}
    
    public void run() {
      synchronized (this.e) {
        if (this.e.i != null) {
          Camera.Parameters parameters = b.d(this.e);
          if (parameters == null)
            return; 
          String str = parameters.getFocusMode();
          Rect rect = b.a(this.e, this.c, this.d);
          ArrayList<Camera.Area> arrayList = new ArrayList();
          arrayList.add(new Camera.Area(rect, 1000));
          if (parameters.getMaxNumFocusAreas() != 0 && str != null && (str.equals("auto") || str.equals("macro") || str.equals("continuous-picture") || str.equals("continuous-video"))) {
            parameters.setFocusMode("auto");
            parameters.setFocusAreas(arrayList);
            if (parameters.getMaxNumMeteringAreas() > 0)
              parameters.setMeteringAreas(arrayList); 
            if (!parameters.getSupportedFocusModes().contains("auto"))
              return; 
            try {
              this.e.i.setParameters(parameters);
            } catch (RuntimeException null) {
              Log.e("CAMERA_1::", "setParameters failed", runtimeException);
            } 
            try {
              this.e.i.autoFocus(new a(this));
            } catch (RuntimeException runtimeException) {
              Log.e("CAMERA_1::", "autoFocus failed", runtimeException);
            } 
          } else if (runtimeException.getMaxNumMeteringAreas() > 0) {
            if (!runtimeException.getSupportedFocusModes().contains("auto"))
              return; 
            runtimeException.setFocusMode("auto");
            runtimeException.setFocusAreas(arrayList);
            runtimeException.setMeteringAreas(arrayList);
            try {
              this.e.i.setParameters((Camera.Parameters)runtimeException);
            } catch (RuntimeException runtimeException1) {
              Log.e("CAMERA_1::", "setParameters failed", runtimeException1);
            } 
            try {
              this.e.i.autoFocus(new b(this));
            } catch (RuntimeException runtimeException1) {
              Log.e("CAMERA_1::", "autoFocus failed", runtimeException1);
            } 
          } else {
            try {
              this.e.i.autoFocus(new c(this));
            } catch (RuntimeException runtimeException1) {
              Log.e("CAMERA_1::", "autoFocus failed", runtimeException1);
            } 
          } 
        } 
        return;
      } 
    }
    
    class a implements Camera.AutoFocusCallback {
      a(b.b this$0) {}
      
      public void onAutoFocus(boolean param2Boolean, Camera param2Camera) {}
    }
    
    class b implements Camera.AutoFocusCallback {
      b(b.b this$0) {}
      
      public void onAutoFocus(boolean param2Boolean, Camera param2Camera) {}
    }
    
    class c implements Camera.AutoFocusCallback {
      c(b.b this$0) {}
      
      public void onAutoFocus(boolean param2Boolean, Camera param2Camera) {}
    }
  }
  
  class a implements Camera.AutoFocusCallback {
    a(b this$0) {}
    
    public void onAutoFocus(boolean param1Boolean, Camera param1Camera) {}
  }
  
  class b implements Camera.AutoFocusCallback {
    b(b this$0) {}
    
    public void onAutoFocus(boolean param1Boolean, Camera param1Camera) {}
  }
  
  class c implements Camera.AutoFocusCallback {
    c(b this$0) {}
    
    public void onAutoFocus(boolean param1Boolean, Camera param1Camera) {}
  }
  
  class c implements Runnable {
    c(b this$0) {}
    
    public void run() {
      synchronized (this.c) {
        if (this.c.i != null) {
          b.b(this.c, false);
          this.c.B();
          this.c.A();
          if (b.f(this.c))
            b.g(this.c); 
        } 
        return;
      } 
    }
  }
  
  class d implements Runnable {
    d(b this$0) {}
    
    public void run() {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: getfield c : Le/f/a/b/b;
      //   6: iconst_1
      //   7: invokestatic c : (Le/f/a/b/b;Z)Z
      //   10: pop
      //   11: aload_0
      //   12: getfield c : Le/f/a/b/b;
      //   15: invokestatic g : (Le/f/a/b/b;)V
      //   18: aload_0
      //   19: monitorexit
      //   20: return
      //   21: astore_1
      //   22: aload_0
      //   23: monitorexit
      //   24: aload_1
      //   25: athrow
      // Exception table:
      //   from	to	target	type
      //   2	20	21	finally
      //   22	24	21	finally
    }
  }
  
  class e implements Runnable {
    e(b this$0) {}
    
    public void run() {
      if (this.c.s()) {
        this.c.y();
        this.c.x();
      } 
    }
  }
  
  class f implements Runnable {
    f(b this$0) {}
    
    public void run() {
      if (this.c.s()) {
        this.c.y();
        this.c.x();
      } 
    }
  }
  
  class g implements Runnable {
    g(b this$0) {}
    
    public void run() {
      synchronized (this.c) {
        if (this.c.i != null)
          this.c.A(); 
        return;
      } 
    }
  }
  
  class h implements Runnable {
    h(b this$0) {}
    
    public void run() {
      synchronized (this.c) {
        if (this.c.i != null)
          this.c.A(); 
        return;
      } 
    }
  }
  
  class i implements Camera.PictureCallback {
    i(b this$0, ReadableMap param1ReadableMap) {}
    
    public void onPictureTaken(byte[] param1ArrayOfbyte, Camera param1Camera) {
      if (b.h(this.b).booleanValue())
        this.b.j.play(0); 
      synchronized (this.b) {
        if (this.b.i != null)
          if (this.a.hasKey("pauseAfterCapture") && !this.a.getBoolean("pauseAfterCapture")) {
            this.b.i.startPreview();
            b.d(this.b, true);
            if (b.i(this.b))
              this.b.i.setPreviewCallback(this.b); 
          } else {
            this.b.i.stopPreview();
            b.d(this.b, false);
            this.b.i.setPreviewCallback(null);
          }  
        b.j(this.b).set(false);
        b.a(this.b, 0);
        null = this.b;
        null.c.a(param1ArrayOfbyte, null.f(b.c(null)));
        if (b.e(this.b))
          b.b(this.b); 
        return;
      } 
    }
  }
  
  class j implements Runnable {
    j(b this$0, SurfaceTexture param1SurfaceTexture) {}
    
    public void run() {
      try {
        Camera camera;
        SurfaceTexture surfaceTexture;
        if (this.d.i == null) {
          b.a(this.d, this.c);
          return;
        } 
        this.d.i.stopPreview();
        b.d(this.d, false);
        if (this.c == null) {
          camera = this.d.i;
          surfaceTexture = (SurfaceTexture)this.d.d.g();
        } else {
          camera = this.d.i;
          surfaceTexture = this.c;
        } 
        camera.setPreviewTexture(surfaceTexture);
        b.a(this.d, this.c);
        b.g(this.d);
        return;
      } catch (IOException iOException) {
        Log.e("CAMERA_1::", "setPreviewTexture failed", iOException);
        return;
      } 
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */