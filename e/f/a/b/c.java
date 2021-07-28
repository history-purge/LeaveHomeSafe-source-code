package e.f.a.b;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.CamcorderProfile;
import android.media.Image;
import android.media.ImageReader;
import android.media.MediaActionSound;
import android.media.MediaRecorder;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.Size;
import android.util.SparseIntArray;
import android.view.Surface;
import com.facebook.react.bridge.ReadableMap;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.SortedSet;

@TargetApi(21)
class c extends f implements MediaRecorder.OnInfoListener, MediaRecorder.OnErrorListener {
  private static final SparseIntArray R = new SparseIntArray();
  
  private j A;
  
  private int B;
  
  private a C;
  
  private a D;
  
  private boolean E;
  
  private int F;
  
  private float G;
  
  private int H;
  
  private int I;
  
  private int J;
  
  private float K;
  
  private float L;
  
  private int M;
  
  private boolean N;
  
  private Boolean O;
  
  private Surface P;
  
  private Rect Q;
  
  private final CameraManager f;
  
  private final CameraDevice.StateCallback g;
  
  private final CameraCaptureSession.StateCallback h;
  
  j i;
  
  private final ImageReader.OnImageAvailableListener j;
  
  private String k;
  
  private String l;
  
  private CameraCharacteristics m;
  
  CameraDevice n;
  
  MediaActionSound o;
  
  CameraCaptureSession p;
  
  CaptureRequest.Builder q;
  
  Set<String> r;
  
  private ImageReader s;
  
  private ImageReader t;
  
  private int u;
  
  private MediaRecorder v;
  
  private String w;
  
  private boolean x;
  
  private final k y;
  
  private final k z;
  
  static {
    R.put(0, 1);
    R.put(1, 0);
  }
  
  c(f.a parama, i parami, Context paramContext, Handler paramHandler) {
    super(parama, parami, paramHandler);
    char c1;
    this.g = new a(this);
    this.h = new b(this);
    this.i = new c(this);
    this.j = new d(this);
    this.o = new MediaActionSound();
    this.r = new HashSet<String>();
    this.y = new k();
    this.z = new k();
    this.C = g.a;
    this.O = Boolean.valueOf(false);
    this.f = (CameraManager)paramContext.getSystemService("camera");
    this.f.registerAvailabilityCallback(new e(this), null);
    if (this.N) {
      c1 = '#';
    } else {
      c1 = 'Ā';
    } 
    this.u = c1;
    this.d.a(new f(this));
  }
  
  private boolean J() {
    String str2;
    String str1 = this.l;
    if (str1 == null) {
      try {
        int m = R.get(this.B);
        String[] arrayOfString = this.f.getCameraIdList();
        if (arrayOfString.length == 0) {
          Log.e("Camera2", "No cameras available.");
          return false;
        } 
        int n = arrayOfString.length;
        for (int i = 0;; i++) {
          if (i < n) {
            str2 = arrayOfString[i];
            CameraCharacteristics cameraCharacteristics = this.f.getCameraCharacteristics(str2);
            Integer integer = (Integer)cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
            if (integer == null) {
              Log.e("Camera2", "Unexpected state: LENS_FACING null");
            } else if (integer.intValue() == m) {
              this.k = str2;
              this.m = cameraCharacteristics;
              return true;
            } 
          } else {
            this.k = arrayOfString[0];
            this.m = this.f.getCameraCharacteristics(this.k);
            Integer integer = (Integer)this.m.get(CameraCharacteristics.LENS_FACING);
            if (integer == null) {
              Log.e("Camera2", "Unexpected state: LENS_FACING null");
              return false;
            } 
            m = R.size();
            for (i = 0;; i++) {
              if (i < m) {
                if (R.valueAt(i) == integer.intValue()) {
                  this.B = R.keyAt(i);
                  return true;
                } 
              } else {
                this.B = 0;
                return true;
              } 
            } 
            break;
          } 
        } 
      } catch (CameraAccessException cameraAccessException) {
        str2 = "Failed to get a list of camera devices";
      } 
      Log.e("Camera2", str2, (Throwable)cameraAccessException);
      return false;
    } 
    try {
      this.m = this.f.getCameraCharacteristics((String)cameraAccessException);
      Integer integer = (Integer)this.m.get(CameraCharacteristics.LENS_FACING);
      if (integer == null) {
        Log.e("Camera2", "Unexpected state: LENS_FACING null");
        return false;
      } 
      int m = R.size();
      for (int i = 0;; i++) {
        if (i < m) {
          if (R.valueAt(i) == integer.intValue()) {
            this.B = R.keyAt(i);
            this.k = this.l;
            return true;
          } 
        } else {
          this.k = this.l;
          return true;
        } 
      } 
    } catch (Exception exception) {
      str2 = "Failed to get camera characteristics";
    } 
    Log.e("Camera2", str2, exception);
    return false;
  }
  
  private j K() {
    int n = this.d.i();
    int i = this.d.c();
    int i1 = n;
    int m = i;
    if (n < i) {
      m = n;
      i1 = i;
    } 
    SortedSet<j> sortedSet = this.y.b(this.C);
    for (j j1 : sortedSet) {
      if (j1.r() >= i1 && j1.q() >= m)
        return j1; 
    } 
    return sortedSet.last();
  }
  
  private void L() {
    StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap)this.m.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
    if (streamConfigurationMap != null) {
      this.y.a();
      for (Size size : streamConfigurationMap.getOutputSizes(this.d.d())) {
        int i = size.getWidth();
        int m = size.getHeight();
        if (i <= 1920 && m <= 1080)
          this.y.a(new j(i, m)); 
      } 
      this.z.a();
      a(this.z, streamConfigurationMap);
      if (this.A == null)
        this.A = this.z.b(this.C).last(); 
      for (a a1 : this.y.c()) {
        if (!this.z.c().contains(a1))
          this.y.a(a1); 
      } 
      if (!this.y.c().contains(this.C))
        this.C = this.y.c().iterator().next(); 
      this.H = ((Integer)this.m.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Failed to get configuration map: ");
    stringBuilder.append(this.k);
    IllegalStateException illegalStateException = new IllegalStateException(stringBuilder.toString());
    throw illegalStateException;
  }
  
  private int M() {
    byte b;
    int i = ((Integer)this.m.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
    if (this.B == 0) {
      b = this.J;
      return (i + b) % 360;
    } 
    if (f(this.J)) {
      b = 180;
    } else {
      b = 0;
    } 
    i += this.J;
    return (i + b) % 360;
  }
  
  private boolean N() {
    return (((Integer)this.m.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF)).intValue() >= 1);
  }
  
  private void O() {
    this.q.set(CaptureRequest.CONTROL_AF_TRIGGER, Integer.valueOf(1));
    try {
      this.i.a(1);
      this.p.capture(this.q.build(), this.i, null);
      return;
    } catch (CameraAccessException cameraAccessException) {
      Log.e("Camera2", "Failed to lock focus.", (Throwable)cameraAccessException);
      return;
    } 
  }
  
  private void P() {
    if (Build.VERSION.SDK_INT >= 24)
      this.v.pause(); 
  }
  
  private void Q() {
    ImageReader imageReader = this.t;
    if (imageReader != null)
      imageReader.close(); 
    j j1 = this.y.b(this.C).last();
    this.t = ImageReader.newInstance(j1.r(), j1.q(), 35, 1);
    this.t.setOnImageAvailableListener(this.j, null);
  }
  
  private void R() {
    ImageReader imageReader = this.s;
    if (imageReader != null)
      imageReader.close(); 
    this.s = ImageReader.newInstance(this.A.r(), this.A.q(), 256, 1);
    this.s.setOnImageAvailableListener(this.j, null);
  }
  
  private void S() {
    if (Build.VERSION.SDK_INT >= 24)
      this.v.resume(); 
  }
  
  private void T() {
    try {
      this.f.openCamera(this.k, this.g, null);
      return;
    } catch (CameraAccessException cameraAccessException) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Failed to open camera: ");
      stringBuilder.append(this.k);
      throw new RuntimeException(stringBuilder.toString(), cameraAccessException);
    } 
  }
  
  private void U() {
    this.x = false;
    try {
      this.p.stopRepeating();
      this.p.abortCaptures();
      this.v.stop();
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
    this.v.reset();
    this.v.release();
    this.v = null;
    this.c.c();
    String str = this.w;
    if (str == null || !(new File(str)).exists()) {
      this.c.b(null, 0, 0);
      return;
    } 
    this.c.b(this.w, 0, 0);
    this.w = null;
  }
  
  private void a(CamcorderProfile paramCamcorderProfile, boolean paramBoolean) {
    this.v.setOutputFormat(paramCamcorderProfile.fileFormat);
    this.v.setVideoFrameRate(paramCamcorderProfile.videoFrameRate);
    this.v.setVideoSize(paramCamcorderProfile.videoFrameWidth, paramCamcorderProfile.videoFrameHeight);
    this.v.setVideoEncodingBitRate(paramCamcorderProfile.videoBitRate);
    this.v.setVideoEncoder(paramCamcorderProfile.videoCodec);
    if (paramBoolean) {
      this.v.setAudioEncodingBitRate(paramCamcorderProfile.audioBitRate);
      this.v.setAudioChannels(paramCamcorderProfile.audioChannels);
      this.v.setAudioSamplingRate(paramCamcorderProfile.audioSampleRate);
      this.v.setAudioEncoder(paramCamcorderProfile.audioCodec);
    } 
  }
  
  private void a(String paramString, int paramInt1, int paramInt2, boolean paramBoolean, CamcorderProfile paramCamcorderProfile) {
    CamcorderProfile camcorderProfile;
    this.v = new MediaRecorder();
    this.v.setVideoSource(2);
    if (paramBoolean)
      this.v.setAudioSource(1); 
    this.v.setOutputFile(paramString);
    this.w = paramString;
    if (!CamcorderProfile.hasProfile(Integer.parseInt(this.k), paramCamcorderProfile.quality)) {
      camcorderProfile = CamcorderProfile.get(1);
    } else {
      camcorderProfile = paramCamcorderProfile;
    } 
    camcorderProfile.videoBitRate = paramCamcorderProfile.videoBitRate;
    a(camcorderProfile, paramBoolean);
    this.v.setOrientationHint(M());
    if (paramInt1 != -1)
      this.v.setMaxDuration(paramInt1); 
    if (paramInt2 != -1)
      this.v.setMaxFileSize(paramInt2); 
    this.v.setOnInfoListener(this);
    this.v.setOnErrorListener(this);
  }
  
  public static boolean a(Context paramContext) {
    try {
      CameraManager cameraManager = (CameraManager)paramContext.getSystemService("camera");
      String[] arrayOfString = cameraManager.getCameraIdList();
      int m = arrayOfString.length;
      for (int i = 0;; i++) {
        if (i < m) {
          Integer integer = (Integer)cameraManager.getCameraCharacteristics(arrayOfString[i]).get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
          if (integer == null || integer.intValue() == 2) {
            Log.w("Camera2", "Camera2 can only run in legacy mode and should not be used.");
            return true;
          } 
        } else {
          return false;
        } 
      } 
    } catch (CameraAccessException cameraAccessException) {
      Log.e("Camera2", "Failed to check camera legacy status, returning true.", (Throwable)cameraAccessException);
      return true;
    } 
  }
  
  private MeteringRectangle b(float paramFloat1, float paramFloat2) {
    Rect rect = (Rect)this.m.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
    int i = (int)(paramFloat2 * rect.height());
    return new MeteringRectangle(Math.max((int)(paramFloat1 * rect.width()) - 150, 0), Math.max(i - 150, 0), 300, 300, 999);
  }
  
  private boolean f(int paramInt) {
    return (paramInt == 90 || paramInt == 270);
  }
  
  void A() {
    // Byte code:
    //   0: aload_0
    //   1: getfield n : Landroid/hardware/camera2/CameraDevice;
    //   4: iconst_2
    //   5: invokevirtual createCaptureRequest : (I)Landroid/hardware/camera2/CaptureRequest$Builder;
    //   8: astore #4
    //   10: aload_0
    //   11: getfield N : Z
    //   14: ifeq -> 36
    //   17: aload_0
    //   18: sipush #256
    //   21: putfield u : I
    //   24: aload #4
    //   26: aload_0
    //   27: getfield t : Landroid/media/ImageReader;
    //   30: invokevirtual getSurface : ()Landroid/view/Surface;
    //   33: invokevirtual removeTarget : (Landroid/view/Surface;)V
    //   36: aload #4
    //   38: aload_0
    //   39: getfield s : Landroid/media/ImageReader;
    //   42: invokevirtual getSurface : ()Landroid/view/Surface;
    //   45: invokevirtual addTarget : (Landroid/view/Surface;)V
    //   48: aload #4
    //   50: getstatic android/hardware/camera2/CaptureRequest.CONTROL_AF_MODE : Landroid/hardware/camera2/CaptureRequest$Key;
    //   53: aload_0
    //   54: getfield q : Landroid/hardware/camera2/CaptureRequest$Builder;
    //   57: getstatic android/hardware/camera2/CaptureRequest.CONTROL_AF_MODE : Landroid/hardware/camera2/CaptureRequest$Key;
    //   60: invokevirtual get : (Landroid/hardware/camera2/CaptureRequest$Key;)Ljava/lang/Object;
    //   63: invokevirtual set : (Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V
    //   66: aload_0
    //   67: getfield F : I
    //   70: istore_1
    //   71: iload_1
    //   72: ifeq -> 172
    //   75: iload_1
    //   76: iconst_1
    //   77: if_icmpeq -> 153
    //   80: iload_1
    //   81: iconst_2
    //   82: if_icmpeq -> 129
    //   85: iload_1
    //   86: iconst_3
    //   87: if_icmpeq -> 117
    //   90: iload_1
    //   91: iconst_4
    //   92: if_icmpeq -> 98
    //   95: goto -> 196
    //   98: getstatic android/hardware/camera2/CaptureRequest.CONTROL_AE_MODE : Landroid/hardware/camera2/CaptureRequest$Key;
    //   101: astore_3
    //   102: iconst_2
    //   103: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   106: astore_2
    //   107: aload #4
    //   109: aload_3
    //   110: aload_2
    //   111: invokevirtual set : (Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V
    //   114: goto -> 196
    //   117: getstatic android/hardware/camera2/CaptureRequest.CONTROL_AE_MODE : Landroid/hardware/camera2/CaptureRequest$Key;
    //   120: astore_3
    //   121: iconst_2
    //   122: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   125: astore_2
    //   126: goto -> 107
    //   129: aload #4
    //   131: getstatic android/hardware/camera2/CaptureRequest.CONTROL_AE_MODE : Landroid/hardware/camera2/CaptureRequest$Key;
    //   134: iconst_1
    //   135: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   138: invokevirtual set : (Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V
    //   141: getstatic android/hardware/camera2/CaptureRequest.FLASH_MODE : Landroid/hardware/camera2/CaptureRequest$Key;
    //   144: astore_3
    //   145: iconst_2
    //   146: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   149: astore_2
    //   150: goto -> 107
    //   153: getstatic android/hardware/camera2/CaptureRequest.CONTROL_AE_MODE : Landroid/hardware/camera2/CaptureRequest$Key;
    //   156: astore_2
    //   157: iconst_3
    //   158: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   161: astore_3
    //   162: aload #4
    //   164: aload_2
    //   165: aload_3
    //   166: invokevirtual set : (Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V
    //   169: goto -> 196
    //   172: aload #4
    //   174: getstatic android/hardware/camera2/CaptureRequest.CONTROL_AE_MODE : Landroid/hardware/camera2/CaptureRequest$Key;
    //   177: iconst_1
    //   178: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   181: invokevirtual set : (Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V
    //   184: getstatic android/hardware/camera2/CaptureRequest.FLASH_MODE : Landroid/hardware/camera2/CaptureRequest$Key;
    //   187: astore_2
    //   188: iconst_0
    //   189: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   192: astore_3
    //   193: goto -> 162
    //   196: aload #4
    //   198: getstatic android/hardware/camera2/CaptureRequest.JPEG_ORIENTATION : Landroid/hardware/camera2/CaptureRequest$Key;
    //   201: aload_0
    //   202: invokespecial M : ()I
    //   205: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   208: invokevirtual set : (Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V
    //   211: aload_0
    //   212: getfield i : Le/f/a/b/c$j;
    //   215: invokevirtual a : ()Lcom/facebook/react/bridge/ReadableMap;
    //   218: ldc_w 'quality'
    //   221: invokeinterface hasKey : (Ljava/lang/String;)Z
    //   226: ifeq -> 263
    //   229: aload_0
    //   230: getfield i : Le/f/a/b/c$j;
    //   233: invokevirtual a : ()Lcom/facebook/react/bridge/ReadableMap;
    //   236: ldc_w 'quality'
    //   239: invokeinterface getDouble : (Ljava/lang/String;)D
    //   244: ldc2_w 100.0
    //   247: dmul
    //   248: d2i
    //   249: istore_1
    //   250: aload #4
    //   252: getstatic android/hardware/camera2/CaptureRequest.JPEG_QUALITY : Landroid/hardware/camera2/CaptureRequest$Key;
    //   255: iload_1
    //   256: i2b
    //   257: invokestatic valueOf : (B)Ljava/lang/Byte;
    //   260: invokevirtual set : (Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V
    //   263: aload #4
    //   265: getstatic android/hardware/camera2/CaptureRequest.SCALER_CROP_REGION : Landroid/hardware/camera2/CaptureRequest$Key;
    //   268: aload_0
    //   269: getfield q : Landroid/hardware/camera2/CaptureRequest$Builder;
    //   272: getstatic android/hardware/camera2/CaptureRequest.SCALER_CROP_REGION : Landroid/hardware/camera2/CaptureRequest$Key;
    //   275: invokevirtual get : (Landroid/hardware/camera2/CaptureRequest$Key;)Ljava/lang/Object;
    //   278: invokevirtual set : (Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V
    //   281: aload_0
    //   282: getfield p : Landroid/hardware/camera2/CameraCaptureSession;
    //   285: invokevirtual stopRepeating : ()V
    //   288: aload_0
    //   289: getfield p : Landroid/hardware/camera2/CameraCaptureSession;
    //   292: aload #4
    //   294: invokevirtual build : ()Landroid/hardware/camera2/CaptureRequest;
    //   297: new e/f/a/b/c$i
    //   300: dup
    //   301: aload_0
    //   302: invokespecial <init> : (Le/f/a/b/c;)V
    //   305: aconst_null
    //   306: invokevirtual capture : (Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;Landroid/os/Handler;)I
    //   309: pop
    //   310: return
    //   311: astore_2
    //   312: ldc 'Camera2'
    //   314: ldc_w 'Cannot capture a still picture.'
    //   317: aload_2
    //   318: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   321: pop
    //   322: return
    // Exception table:
    //   from	to	target	type
    //   0	36	311	android/hardware/camera2/CameraAccessException
    //   36	71	311	android/hardware/camera2/CameraAccessException
    //   98	107	311	android/hardware/camera2/CameraAccessException
    //   107	114	311	android/hardware/camera2/CameraAccessException
    //   117	126	311	android/hardware/camera2/CameraAccessException
    //   129	150	311	android/hardware/camera2/CameraAccessException
    //   153	162	311	android/hardware/camera2/CameraAccessException
    //   162	169	311	android/hardware/camera2/CameraAccessException
    //   172	193	311	android/hardware/camera2/CameraAccessException
    //   196	263	311	android/hardware/camera2/CameraAccessException
    //   263	310	311	android/hardware/camera2/CameraAccessException
  }
  
  public Surface B() {
    Surface surface = this.P;
    return (surface != null) ? surface : this.d.e();
  }
  
  void C() {
    if (s() && this.d.j() && this.s != null) {
      if (this.t == null)
        return; 
      j j1 = K();
      this.d.a(j1.r(), j1.q());
      Surface surface = B();
      try {
        this.q = this.n.createCaptureRequest(1);
        this.q.addTarget(surface);
        if (this.N)
          this.q.addTarget(this.t.getSurface()); 
        this.n.createCaptureSession(Arrays.asList(new Surface[] { surface, this.s.getSurface(), this.t.getSurface() }, ), this.h, null);
        return;
      } catch (CameraAccessException cameraAccessException) {
        Log.e("Camera2", "Failed to start capture session", (Throwable)cameraAccessException);
        this.c.a();
      } 
    } 
  }
  
  void D() {
    this.q.set(CaptureRequest.CONTROL_AF_TRIGGER, Integer.valueOf(2));
    try {
      this.p.capture(this.q.build(), this.i, null);
      E();
      F();
      if (this.N) {
        this.u = 35;
        C();
        return;
      } 
      this.q.set(CaptureRequest.CONTROL_AF_TRIGGER, Integer.valueOf(0));
      this.p.setRepeatingRequest(this.q.build(), this.i, null);
      this.i.a(0);
      return;
    } catch (CameraAccessException cameraAccessException) {
      Log.e("Camera2", "Failed to restart camera preview.", (Throwable)cameraAccessException);
      return;
    } 
  }
  
  void E() {
    boolean bool = this.E;
    Integer integer = Integer.valueOf(0);
    if (bool) {
      int[] arrayOfInt = (int[])this.m.get(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
      if (arrayOfInt == null || arrayOfInt.length == 0 || (arrayOfInt.length == 1 && arrayOfInt[0] == 0)) {
        this.E = false;
      } else {
        CaptureRequest.Builder builder1 = this.q;
        CaptureRequest.Key key1 = CaptureRequest.CONTROL_AF_MODE;
        integer = Integer.valueOf(4);
        builder1.set(key1, integer);
      } 
    } 
    CaptureRequest.Builder builder = this.q;
    CaptureRequest.Key key = CaptureRequest.CONTROL_AF_MODE;
    builder.set(key, integer);
  }
  
  void F() {
    int i = this.F;
    byte b = 1;
    if (i != 0)
      if (i != 1) {
        if (i != 2) {
          if (i != 3) {
            b = 4;
            if (i != 4)
              return; 
          } else {
            CaptureRequest.Builder builder1 = this.q;
            CaptureRequest.Key key1 = CaptureRequest.CONTROL_AE_MODE;
            Integer integer1 = Integer.valueOf(2);
            builder1.set(key1, integer1);
          } 
        } else {
          this.q.set(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(1));
          CaptureRequest.Builder builder1 = this.q;
          CaptureRequest.Key key1 = CaptureRequest.FLASH_MODE;
          Integer integer1 = Integer.valueOf(2);
          builder1.set(key1, integer1);
        } 
      } else {
        CaptureRequest.Builder builder1 = this.q;
        CaptureRequest.Key key1 = CaptureRequest.CONTROL_AE_MODE;
        Integer integer1 = Integer.valueOf(3);
        builder1.set(key1, integer1);
      }  
    this.q.set(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(b));
    CaptureRequest.Builder builder = this.q;
    CaptureRequest.Key key = CaptureRequest.FLASH_MODE;
    Integer integer = Integer.valueOf(0);
    builder.set(key, integer);
  }
  
  void G() {
    if (this.E)
      return; 
    Float float_ = (Float)this.m.get(CameraCharacteristics.LENS_INFO_MINIMUM_FOCUS_DISTANCE);
    if (float_ != null) {
      float f1 = this.K;
      float f2 = float_.floatValue();
      this.q.set(CaptureRequest.LENS_FOCUS_DISTANCE, Float.valueOf(f1 * f2));
      return;
    } 
    throw new NullPointerException("Unexpected state: LENS_INFO_MINIMUM_FOCUS_DISTANCE null");
  }
  
  void H() {
    // Byte code:
    //   0: aload_0
    //   1: getfield M : I
    //   4: istore_3
    //   5: iconst_1
    //   6: istore_1
    //   7: iload_3
    //   8: ifeq -> 124
    //   11: iload_3
    //   12: iconst_1
    //   13: if_icmpeq -> 94
    //   16: iconst_5
    //   17: istore_1
    //   18: iconst_2
    //   19: istore_2
    //   20: iload_3
    //   21: iconst_2
    //   22: if_icmpeq -> 124
    //   25: iload_3
    //   26: iconst_3
    //   27: if_icmpeq -> 77
    //   30: iload_3
    //   31: iconst_4
    //   32: if_icmpeq -> 57
    //   35: iload_3
    //   36: iconst_5
    //   37: if_icmpeq -> 41
    //   40: return
    //   41: aload_0
    //   42: getfield q : Landroid/hardware/camera2/CaptureRequest$Builder;
    //   45: astore #4
    //   47: getstatic android/hardware/camera2/CaptureRequest.CONTROL_AWB_MODE : Landroid/hardware/camera2/CaptureRequest$Key;
    //   50: astore #5
    //   52: iload_2
    //   53: istore_1
    //   54: goto -> 108
    //   57: aload_0
    //   58: getfield q : Landroid/hardware/camera2/CaptureRequest$Builder;
    //   61: astore #4
    //   63: getstatic android/hardware/camera2/CaptureRequest.CONTROL_AWB_MODE : Landroid/hardware/camera2/CaptureRequest$Key;
    //   66: astore #5
    //   68: iconst_3
    //   69: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   72: astore #6
    //   74: goto -> 114
    //   77: aload_0
    //   78: getfield q : Landroid/hardware/camera2/CaptureRequest$Builder;
    //   81: astore #4
    //   83: getstatic android/hardware/camera2/CaptureRequest.CONTROL_AWB_MODE : Landroid/hardware/camera2/CaptureRequest$Key;
    //   86: astore #5
    //   88: bipush #8
    //   90: istore_1
    //   91: goto -> 108
    //   94: aload_0
    //   95: getfield q : Landroid/hardware/camera2/CaptureRequest$Builder;
    //   98: astore #4
    //   100: getstatic android/hardware/camera2/CaptureRequest.CONTROL_AWB_MODE : Landroid/hardware/camera2/CaptureRequest$Key;
    //   103: astore #5
    //   105: bipush #6
    //   107: istore_1
    //   108: iload_1
    //   109: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   112: astore #6
    //   114: aload #4
    //   116: aload #5
    //   118: aload #6
    //   120: invokevirtual set : (Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V
    //   123: return
    //   124: aload_0
    //   125: getfield q : Landroid/hardware/camera2/CaptureRequest$Builder;
    //   128: getstatic android/hardware/camera2/CaptureRequest.CONTROL_AWB_MODE : Landroid/hardware/camera2/CaptureRequest$Key;
    //   131: iload_1
    //   132: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   135: invokevirtual set : (Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V
    //   138: return
  }
  
  void I() {
    float f1 = ((Float)this.m.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM)).floatValue();
    f1 = this.L * (f1 - 1.0F) + 1.0F;
    Rect rect = (Rect)this.m.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
    if (rect != null) {
      int n = rect.width();
      int i = rect.height();
      int i1 = (int)(n / f1);
      int m = (int)(i / f1);
      n = (n - i1) / 2;
      i = (i - m) / 2;
      rect = new Rect(rect.left + n, rect.top + i, rect.right - n, rect.bottom - i);
      if (f1 != 1.0F) {
        this.q.set(CaptureRequest.SCALER_CROP_REGION, rect);
        return;
      } 
      this.q.set(CaptureRequest.SCALER_CROP_REGION, this.Q);
    } 
  }
  
  a a() {
    return this.C;
  }
  
  SortedSet<j> a(a parama) {
    return this.z.b(parama);
  }
  
  void a(float paramFloat) {
    Log.e("CAMERA_2:: ", "Adjusting exposure is not currently supported for Camera2");
  }
  
  void a(float paramFloat1, float paramFloat2) {
    if (this.p == null)
      return; 
    h h = new h(this);
    try {
      this.p.stopRepeating();
    } catch (CameraAccessException cameraAccessException) {
      Log.e("Camera2", "Failed to manual focus.", (Throwable)cameraAccessException);
    } 
    this.q.set(CaptureRequest.CONTROL_AF_TRIGGER, Integer.valueOf(2));
    this.q.set(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(0));
    try {
      this.p.capture(this.q.build(), h, null);
    } catch (CameraAccessException cameraAccessException) {
      Log.e("Camera2", "Failed to manual focus.", (Throwable)cameraAccessException);
    } 
    if (N()) {
      MeteringRectangle meteringRectangle = b(paramFloat1, paramFloat2);
      this.q.set(CaptureRequest.CONTROL_AF_REGIONS, new MeteringRectangle[] { meteringRectangle });
    } 
    this.q.set(CaptureRequest.CONTROL_MODE, Integer.valueOf(1));
    this.q.set(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(1));
    this.q.set(CaptureRequest.CONTROL_AF_TRIGGER, Integer.valueOf(1));
    this.q.setTag("FOCUS_TAG");
    try {
      this.p.capture(this.q.build(), h, null);
      return;
    } catch (CameraAccessException cameraAccessException) {
      Log.e("Camera2", "Failed to manual focus.", (Throwable)cameraAccessException);
      return;
    } 
  }
  
  void a(int paramInt) {
    this.J = paramInt;
  }
  
  public void a(SurfaceTexture paramSurfaceTexture) {
    if (paramSurfaceTexture != null) {
      this.P = new Surface(paramSurfaceTexture);
    } else {
      this.P = null;
    } 
    (new Handler(Looper.getMainLooper())).post(new g(this));
  }
  
  void a(ReadableMap paramReadableMap) {
    this.i.a(paramReadableMap);
    if (this.E) {
      O();
      return;
    } 
    A();
  }
  
  void a(j paramj) {
    a a1;
    CameraCaptureSession cameraCaptureSession = this.p;
    if (cameraCaptureSession != null) {
      try {
        cameraCaptureSession.stopRepeating();
      } catch (CameraAccessException cameraAccessException) {
        cameraAccessException.printStackTrace();
      } 
      this.p.close();
      this.p = null;
    } 
    ImageReader imageReader = this.s;
    if (imageReader != null)
      imageReader.close(); 
    if (paramj == null) {
      a1 = this.C;
      if (a1 != null) {
        if (this.A == null)
          return; 
        this.z.b(a1).last();
      } else {
        return;
      } 
    } else {
      this.A = (j)a1;
    } 
    R();
    C();
  }
  
  protected void a(k paramk, StreamConfigurationMap paramStreamConfigurationMap) {
    for (Size size : paramStreamConfigurationMap.getOutputSizes(this.u))
      this.z.a(new j(size.getWidth(), size.getHeight())); 
  }
  
  void a(String paramString) {
    if (!org.reactnative.camera.h.b.a(this.l, paramString)) {
      this.l = paramString;
      if (!org.reactnative.camera.h.b.a(this.l, this.k) && s()) {
        y();
        x();
      } 
    } 
  }
  
  void a(boolean paramBoolean) {
    if (this.E == paramBoolean)
      return; 
    this.E = paramBoolean;
    if (this.q != null) {
      E();
      CameraCaptureSession cameraCaptureSession = this.p;
      if (cameraCaptureSession != null)
        try {
          cameraCaptureSession.setRepeatingRequest(this.q.build(), this.i, null);
          return;
        } catch (CameraAccessException cameraAccessException) {
          this.E ^= 0x1;
        }  
    } 
  }
  
  boolean a(String paramString, int paramInt1, int paramInt2, boolean paramBoolean, CamcorderProfile paramCamcorderProfile, int paramInt3, int paramInt4) {
    if (!this.x) {
      a(paramString, paramInt1, paramInt2, paramBoolean, paramCamcorderProfile);
      try {
        this.v.prepare();
        if (this.p != null) {
          this.p.close();
          this.p = null;
        } 
        j j1 = K();
        this.d.a(j1.r(), j1.q());
        Surface surface1 = B();
        Surface surface2 = this.v.getSurface();
        this.q = this.n.createCaptureRequest(3);
        this.q.addTarget(surface1);
        this.q.addTarget(surface2);
        this.n.createCaptureSession(Arrays.asList(new Surface[] { surface1, surface2 }, ), this.h, null);
        this.v.start();
        this.x = true;
        this.c.a(this.w, 0, 0);
        return true;
      } catch (CameraAccessException cameraAccessException) {
      
      } catch (IOException iOException) {}
      iOException.printStackTrace();
    } 
    return false;
  }
  
  public void b(float paramFloat) {
    float f1 = this.K;
    if (f1 == paramFloat)
      return; 
    this.K = paramFloat;
    if (this.p != null) {
      G();
      try {
        this.p.setRepeatingRequest(this.q.build(), this.i, null);
        return;
      } catch (CameraAccessException cameraAccessException) {
        this.K = f1;
      } 
    } 
  }
  
  void b(int paramInt) {
    this.I = paramInt;
    this.d.a(this.I);
  }
  
  void b(boolean paramBoolean) {
    this.O = Boolean.valueOf(paramBoolean);
  }
  
  boolean b() {
    return this.E;
  }
  
  boolean b(a parama) {
    if (parama != null && this.y.b()) {
      this.D = parama;
      return false;
    } 
    if (parama != null && !parama.equals(this.C)) {
      if (!this.y.c().contains(parama))
        return false; 
      this.C = parama;
      R();
      Q();
      CameraCaptureSession cameraCaptureSession = this.p;
      if (cameraCaptureSession != null) {
        cameraCaptureSession.close();
        this.p = null;
        C();
      } 
      return true;
    } 
    return false;
  }
  
  String c() {
    return this.l;
  }
  
  public void c(float paramFloat) {
    float f1 = this.L;
    if (f1 == paramFloat)
      return; 
    this.L = paramFloat;
    if (this.p != null) {
      I();
      try {
        this.p.setRepeatingRequest(this.q.build(), this.i, null);
        return;
      } catch (CameraAccessException cameraAccessException) {
        this.L = f1;
      } 
    } 
  }
  
  void c(int paramInt) {
    if (this.B == paramInt)
      return; 
    this.B = paramInt;
    if (s()) {
      y();
      x();
    } 
  }
  
  void c(boolean paramBoolean) {
    byte b;
    if (this.N == paramBoolean)
      return; 
    this.N = paramBoolean;
    if (!this.N) {
      b = 256;
    } else {
      b = 35;
    } 
    this.u = b;
    CameraCaptureSession cameraCaptureSession = this.p;
    if (cameraCaptureSession != null) {
      cameraCaptureSession.close();
      this.p = null;
    } 
    C();
  }
  
  List<Properties> d() {
    try {
      ArrayList<Properties> arrayList = new ArrayList();
      String[] arrayOfString = this.f.getCameraIdList();
      int m = arrayOfString.length;
      int i = 0;
      while (true) {
        if (i < m) {
          boolean bool;
          String str = arrayOfString[i];
          Properties properties = new Properties();
          Integer integer = (Integer)this.f.getCameraCharacteristics(str).get(CameraCharacteristics.LENS_FACING);
          properties.put("id", str);
          if (integer.intValue() == 0) {
            bool = true;
          } else {
            bool = false;
          } 
          properties.put("type", String.valueOf(bool));
          arrayList.add(properties);
          i++;
          continue;
        } 
        return arrayList;
      } 
    } catch (CameraAccessException cameraAccessException) {
      RuntimeException runtimeException = new RuntimeException("Failed to get a list of camera ids", (Throwable)cameraAccessException);
      throw runtimeException;
    } 
  }
  
  void d(int paramInt) {
    int i = this.F;
    if (i == paramInt)
      return; 
    this.F = paramInt;
    if (this.q != null) {
      F();
      CameraCaptureSession cameraCaptureSession = this.p;
      if (cameraCaptureSession != null)
        try {
          cameraCaptureSession.setRepeatingRequest(this.q.build(), this.i, null);
          return;
        } catch (CameraAccessException cameraAccessException) {
          this.F = i;
        }  
    } 
  }
  
  int e() {
    return this.H;
  }
  
  public void e(int paramInt) {
    int i = this.M;
    if (i == paramInt)
      return; 
    this.M = paramInt;
    if (this.p != null) {
      H();
      try {
        this.p.setRepeatingRequest(this.q.build(), this.i, null);
        return;
      } catch (CameraAccessException cameraAccessException) {
        this.M = i;
      } 
    } 
  }
  
  float f() {
    return this.G;
  }
  
  int g() {
    return this.B;
  }
  
  int h() {
    return this.F;
  }
  
  float i() {
    return this.K;
  }
  
  j j() {
    return this.A;
  }
  
  public boolean k() {
    return this.O.booleanValue();
  }
  
  public j l() {
    return new j(this.d.i(), this.d.c());
  }
  
  boolean m() {
    return this.N;
  }
  
  Set<a> n() {
    return this.y.c();
  }
  
  public ArrayList<int[]> o() {
    Log.e("CAMERA_2:: ", "getSupportedPreviewFpsRange is not currently supported for Camera2");
    return (ArrayList)new ArrayList<int>();
  }
  
  public void onError(MediaRecorder paramMediaRecorder, int paramInt1, int paramInt2) {
    z();
  }
  
  public void onInfo(MediaRecorder paramMediaRecorder, int paramInt1, int paramInt2) {
    if (paramInt1 == 800 || paramInt1 == 801)
      z(); 
  }
  
  public int q() {
    return this.M;
  }
  
  float r() {
    return this.L;
  }
  
  boolean s() {
    return (this.n != null);
  }
  
  public void t() {
    try {
      this.p.stopRepeating();
      return;
    } catch (CameraAccessException cameraAccessException) {
      cameraAccessException.printStackTrace();
      return;
    } 
  }
  
  void u() {
    P();
  }
  
  public void v() {
    D();
  }
  
  void w() {
    S();
  }
  
  boolean x() {
    if (!J()) {
      this.C = this.D;
      this.c.a();
      return false;
    } 
    L();
    b(this.D);
    this.D = null;
    R();
    Q();
    T();
    return true;
  }
  
  void y() {
    CameraCaptureSession cameraCaptureSession = this.p;
    if (cameraCaptureSession != null) {
      cameraCaptureSession.close();
      this.p = null;
    } 
    CameraDevice cameraDevice = this.n;
    if (cameraDevice != null) {
      cameraDevice.close();
      this.n = null;
    } 
    ImageReader imageReader = this.s;
    if (imageReader != null) {
      imageReader.close();
      this.s = null;
    } 
    imageReader = this.t;
    if (imageReader != null) {
      imageReader.close();
      this.t = null;
    } 
    MediaRecorder mediaRecorder = this.v;
    if (mediaRecorder != null) {
      mediaRecorder.stop();
      this.v.reset();
      this.v.release();
      this.v = null;
      if (this.x) {
        this.c.c();
        this.c.b(this.w, 0, 0);
        this.x = false;
      } 
    } 
  }
  
  void z() {
    if (this.x) {
      U();
      CameraCaptureSession cameraCaptureSession = this.p;
      if (cameraCaptureSession != null) {
        cameraCaptureSession.close();
        this.p = null;
      } 
      C();
    } 
  }
  
  class a extends CameraDevice.StateCallback {
    a(c this$0) {}
    
    public void onClosed(CameraDevice param1CameraDevice) {
      this.a.c.b();
    }
    
    public void onDisconnected(CameraDevice param1CameraDevice) {
      this.a.n = null;
    }
    
    public void onError(CameraDevice param1CameraDevice, int param1Int) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("onError: ");
      stringBuilder.append(param1CameraDevice.getId());
      stringBuilder.append(" (");
      stringBuilder.append(param1Int);
      stringBuilder.append(")");
      Log.e("Camera2", stringBuilder.toString());
      this.a.n = null;
    }
    
    public void onOpened(CameraDevice param1CameraDevice) {
      c c1 = this.a;
      c1.n = param1CameraDevice;
      c1.c.d();
      this.a.C();
    }
  }
  
  class b extends CameraCaptureSession.StateCallback {
    b(c this$0) {}
    
    public void onClosed(CameraCaptureSession param1CameraCaptureSession) {
      CameraCaptureSession cameraCaptureSession = this.a.p;
      if (cameraCaptureSession != null && cameraCaptureSession.equals(param1CameraCaptureSession))
        this.a.p = null; 
    }
    
    public void onConfigureFailed(CameraCaptureSession param1CameraCaptureSession) {
      Log.e("Camera2", "Failed to configure capture session.");
    }
    
    public void onConfigured(CameraCaptureSession param1CameraCaptureSession) {
      String str;
      c c1 = this.a;
      if (c1.n == null)
        return; 
      c1.p = param1CameraCaptureSession;
      c.a(c1, (Rect)c1.q.get(CaptureRequest.SCALER_CROP_REGION));
      this.a.E();
      this.a.F();
      this.a.G();
      this.a.H();
      this.a.I();
      try {
        this.a.p.setRepeatingRequest(this.a.q.build(), this.a.i, null);
        return;
      } catch (CameraAccessException cameraAccessException) {
        str = "Failed to start camera preview because it couldn't access camera";
      } catch (IllegalStateException illegalStateException) {
        str = "Failed to start camera preview.";
      } 
      Log.e("Camera2", str, illegalStateException);
    }
  }
  
  class c extends j {
    c(c this$0) {}
    
    public void b() {
      this.c.q.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, Integer.valueOf(1));
      a(3);
      try {
        this.c.p.capture(this.c.q.build(), this, null);
        this.c.q.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, Integer.valueOf(0));
        return;
      } catch (CameraAccessException cameraAccessException) {
        Log.e("Camera2", "Failed to run precapture sequence.", (Throwable)cameraAccessException);
        return;
      } 
    }
    
    public void c() {
      this.c.A();
    }
  }
  
  class d implements ImageReader.OnImageAvailableListener {
    d(c this$0) {}
    
    public void onImageAvailable(ImageReader param1ImageReader) {
      Image image = param1ImageReader.acquireNextImage();
      try {
        Image.Plane[] arrayOfPlane = image.getPlanes();
        if (arrayOfPlane.length > 0) {
          ByteBuffer byteBuffer = arrayOfPlane[0].getBuffer();
          byte[] arrayOfByte = new byte[byteBuffer.remaining()];
          byteBuffer.get(arrayOfByte);
          if (image.getFormat() == 256) {
            this.a.c.a(arrayOfByte, 0);
          } else {
            this.a.c.a(arrayOfByte, image.getWidth(), image.getHeight(), c.a(this.a));
          } 
          image.close();
        } 
        return;
      } finally {
        if (image != null)
          try {
            image.close();
          } finally {} 
      } 
    }
  }
  
  class e extends CameraManager.AvailabilityCallback {
    e(c this$0) {}
    
    public void onCameraAvailable(String param1String) {
      super.onCameraAvailable(param1String);
      this.a.r.add(param1String);
    }
    
    public void onCameraUnavailable(String param1String) {
      super.onCameraUnavailable(param1String);
      this.a.r.remove(param1String);
    }
  }
  
  class f implements i.a {
    f(c this$0) {}
    
    public void a() {
      this.a.y();
    }
    
    public void b() {
      this.a.C();
    }
  }
  
  class g implements Runnable {
    g(c this$0) {}
    
    public void run() {
      CameraCaptureSession cameraCaptureSession = this.c.p;
      if (cameraCaptureSession != null) {
        cameraCaptureSession.close();
        this.c.p = null;
      } 
      this.c.C();
    }
  }
  
  class h extends CameraCaptureSession.CaptureCallback {
    h(c this$0) {}
    
    public void onCaptureCompleted(CameraCaptureSession param1CameraCaptureSession, CaptureRequest param1CaptureRequest, TotalCaptureResult param1TotalCaptureResult) {
      super.onCaptureCompleted(param1CameraCaptureSession, param1CaptureRequest, param1TotalCaptureResult);
      if (param1CaptureRequest.getTag() == "FOCUS_TAG") {
        this.a.q.set(CaptureRequest.CONTROL_AF_TRIGGER, null);
        try {
          this.a.p.setRepeatingRequest(this.a.q.build(), null, null);
          return;
        } catch (CameraAccessException cameraAccessException) {
          Log.e("Camera2", "Failed to manual focus.", (Throwable)cameraAccessException);
        } 
      } 
    }
    
    public void onCaptureFailed(CameraCaptureSession param1CameraCaptureSession, CaptureRequest param1CaptureRequest, CaptureFailure param1CaptureFailure) {
      super.onCaptureFailed(param1CameraCaptureSession, param1CaptureRequest, param1CaptureFailure);
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Manual AF failure: ");
      stringBuilder.append(param1CaptureFailure);
      Log.e("Camera2", stringBuilder.toString());
    }
  }
  
  class i extends CameraCaptureSession.CaptureCallback {
    i(c this$0) {}
    
    public void onCaptureCompleted(CameraCaptureSession param1CameraCaptureSession, CaptureRequest param1CaptureRequest, TotalCaptureResult param1TotalCaptureResult) {
      if (this.a.i.a().hasKey("pauseAfterCapture") && !this.a.i.a().getBoolean("pauseAfterCapture"))
        this.a.D(); 
      if (c.b(this.a).booleanValue())
        this.a.o.play(0); 
    }
  }
  
  private static abstract class j extends CameraCaptureSession.CaptureCallback {
    private int a;
    
    private ReadableMap b = null;
    
    private void a(CaptureResult param1CaptureResult) {
      Integer integer;
      int i = this.a;
      if (i != 1) {
        if (i != 3) {
          if (i != 4)
            return; 
          integer = (Integer)param1CaptureResult.get(CaptureResult.CONTROL_AE_STATE);
          if (integer == null || integer.intValue() != 5) {
            a(5);
            c();
            return;
          } 
        } else {
          integer = (Integer)integer.get(CaptureResult.CONTROL_AE_STATE);
          if (integer == null || integer.intValue() == 5 || integer.intValue() == 4 || integer.intValue() == 2) {
            a(4);
            return;
          } 
        } 
      } else {
        Integer integer1 = (Integer)integer.get(CaptureResult.CONTROL_AF_STATE);
        if (integer1 == null)
          return; 
        if (integer1.intValue() == 4 || integer1.intValue() == 5) {
          integer = (Integer)integer.get(CaptureResult.CONTROL_AE_STATE);
          if (integer == null || integer.intValue() == 2) {
            a(5);
            c();
            return;
          } 
          a(2);
          b();
        } 
      } 
    }
    
    ReadableMap a() {
      return this.b;
    }
    
    void a(int param1Int) {
      this.a = param1Int;
    }
    
    void a(ReadableMap param1ReadableMap) {
      this.b = param1ReadableMap;
    }
    
    public abstract void b();
    
    public abstract void c();
    
    public void onCaptureCompleted(CameraCaptureSession param1CameraCaptureSession, CaptureRequest param1CaptureRequest, TotalCaptureResult param1TotalCaptureResult) {
      a((CaptureResult)param1TotalCaptureResult);
    }
    
    public void onCaptureProgressed(CameraCaptureSession param1CameraCaptureSession, CaptureRequest param1CaptureRequest, CaptureResult param1CaptureResult) {
      a(param1CaptureResult);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/b/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */