package com.lwansbrough.RCTCamera;

import android.content.ContentValues;
import android.content.Context;
import android.hardware.Camera;
import android.media.MediaActionSound;
import android.media.MediaRecorder;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Log;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RCTCameraModule extends ReactContextBaseJavaModule implements MediaRecorder.OnInfoListener, MediaRecorder.OnErrorListener, LifecycleEventListener {
  public static final int MEDIA_TYPE_IMAGE = 1;
  
  public static final int MEDIA_TYPE_VIDEO = 2;
  
  public static final int RCT_CAMERA_ASPECT_FILL = 0;
  
  public static final int RCT_CAMERA_ASPECT_FIT = 1;
  
  public static final int RCT_CAMERA_ASPECT_STRETCH = 2;
  
  public static final int RCT_CAMERA_CAPTURE_MODE_STILL = 0;
  
  public static final int RCT_CAMERA_CAPTURE_MODE_VIDEO = 1;
  
  public static final String RCT_CAMERA_CAPTURE_QUALITY_1080P = "1080p";
  
  public static final String RCT_CAMERA_CAPTURE_QUALITY_480P = "480p";
  
  public static final String RCT_CAMERA_CAPTURE_QUALITY_720P = "720p";
  
  public static final String RCT_CAMERA_CAPTURE_QUALITY_HIGH = "high";
  
  public static final String RCT_CAMERA_CAPTURE_QUALITY_LOW = "low";
  
  public static final String RCT_CAMERA_CAPTURE_QUALITY_MEDIUM = "medium";
  
  public static final String RCT_CAMERA_CAPTURE_QUALITY_PREVIEW = "preview";
  
  public static final int RCT_CAMERA_CAPTURE_TARGET_CAMERA_ROLL = 2;
  
  public static final int RCT_CAMERA_CAPTURE_TARGET_DISK = 1;
  
  public static final int RCT_CAMERA_CAPTURE_TARGET_MEMORY = 0;
  
  public static final int RCT_CAMERA_CAPTURE_TARGET_TEMP = 3;
  
  public static final int RCT_CAMERA_FLASH_MODE_AUTO = 2;
  
  public static final int RCT_CAMERA_FLASH_MODE_OFF = 0;
  
  public static final int RCT_CAMERA_FLASH_MODE_ON = 1;
  
  public static final int RCT_CAMERA_ORIENTATION_AUTO = 2147483647;
  
  public static final int RCT_CAMERA_ORIENTATION_LANDSCAPE_LEFT = 1;
  
  public static final int RCT_CAMERA_ORIENTATION_LANDSCAPE_RIGHT = 3;
  
  public static final int RCT_CAMERA_ORIENTATION_PORTRAIT = 0;
  
  public static final int RCT_CAMERA_ORIENTATION_PORTRAIT_UPSIDE_DOWN = 2;
  
  public static final int RCT_CAMERA_TORCH_MODE_AUTO = 2;
  
  public static final int RCT_CAMERA_TORCH_MODE_OFF = 0;
  
  public static final int RCT_CAMERA_TORCH_MODE_ON = 1;
  
  public static final int RCT_CAMERA_TYPE_BACK = 2;
  
  public static final int RCT_CAMERA_TYPE_FRONT = 1;
  
  private static final String TAG = "RCTCameraModule";
  
  private static ReactApplicationContext _reactContext;
  
  private long MRStartTime;
  
  private f _sensorOrientationChecker;
  
  private Camera mCamera = null;
  
  private MediaRecorder mMediaRecorder;
  
  private ReadableMap mRecordingOptions;
  
  private Promise mRecordingPromise = null;
  
  private Boolean mSafeToCapture = Boolean.valueOf(true);
  
  private File mVideoFile;
  
  public RCTCameraModule(ReactApplicationContext paramReactApplicationContext) {
    super(paramReactApplicationContext);
    _reactContext = paramReactApplicationContext;
    this._sensorOrientationChecker = new f(_reactContext);
    _reactContext.addLifecycleEventListener(this);
  }
  
  private void addToMediaStore(String paramString) {
    MediaScannerConnection.scanFile((Context)_reactContext, new String[] { paramString }, null, null);
  }
  
  private void captureWithOrientation(ReadableMap paramReadableMap, Promise paramPromise, int paramInt) {
    Camera camera = b.d().a(paramReadableMap.getInt("type"));
    if (camera == null) {
      paramPromise.reject("No camera found.");
      return;
    } 
    if (paramReadableMap.getInt("mode") == 1) {
      record(paramReadableMap, paramPromise, paramInt);
      return;
    } 
    b.d().a(paramReadableMap.getInt("type"), paramReadableMap.getString("quality"));
    if (paramReadableMap.hasKey("playSoundOnCapture") && paramReadableMap.getBoolean("playSoundOnCapture"))
      (new MediaActionSound()).play(0); 
    if (paramReadableMap.hasKey("quality"))
      b.d().a(paramReadableMap.getInt("type"), paramReadableMap.getString("quality")); 
    b.d().a(paramReadableMap.getInt("type"), paramInt);
    camera.setPreviewCallback(null);
    c c = new c(this, paramReadableMap, paramPromise);
    d d = new d(this, camera);
    if (this.mSafeToCapture.booleanValue())
      try {
        camera.takePicture(d, null, c);
        this.mSafeToCapture = Boolean.valueOf(false);
        return;
      } catch (RuntimeException runtimeException) {
        Log.e("RCTCameraModule", "Couldn't capture photo.", runtimeException);
      }  
  }
  
  public static byte[] convertFileToByteArray(File paramFile) {
    try {
      FileInputStream fileInputStream = new FileInputStream(paramFile);
      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
      byte[] arrayOfByte = new byte[8192];
      while (true) {
        int i = fileInputStream.read(arrayOfByte);
        if (i != -1) {
          byteArrayOutputStream.write(arrayOfByte, 0, i);
          continue;
        } 
        return byteArrayOutputStream.toByteArray();
      } 
    } catch (IOException iOException) {
      iOException.printStackTrace();
      return null;
    } 
  }
  
  private File getOutputCameraRollFile(int paramInt) {
    return getOutputFile(paramInt, Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM));
  }
  
  private File getOutputFile(int paramInt, File paramFile) {
    StringBuilder stringBuilder;
    if (!paramFile.exists() && !paramFile.mkdirs()) {
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("failed to create directory:");
      stringBuilder1.append(paramFile.getAbsolutePath());
      Log.e("RCTCameraModule", stringBuilder1.toString());
      return null;
    } 
    String str = String.format("%s", new Object[] { (new SimpleDateFormat("yyyyMMdd_HHmmss")).format(new Date()) });
    if (paramInt == 1) {
      str = String.format("IMG_%s.jpg", new Object[] { str });
    } else {
      if (paramInt == 2) {
        str = String.format("VID_%s.mp4", new Object[] { str });
        return new File(String.format("%s%s%s", new Object[] { paramFile.getPath(), File.separator, str }));
      } 
      stringBuilder = new StringBuilder();
      stringBuilder.append("Unsupported media type:");
      stringBuilder.append(paramInt);
      Log.e("RCTCameraModule", stringBuilder.toString());
      return null;
    } 
    return new File(String.format("%s%s%s", new Object[] { stringBuilder.getPath(), File.separator, str }));
  }
  
  private File getOutputMediaFile(int paramInt) {
    StringBuilder stringBuilder;
    if (paramInt == 1) {
      String str = Environment.DIRECTORY_PICTURES;
    } else {
      if (paramInt == 2) {
        String str = Environment.DIRECTORY_MOVIES;
        return getOutputFile(paramInt, Environment.getExternalStoragePublicDirectory(str));
      } 
      stringBuilder = new StringBuilder();
      stringBuilder.append("Unsupported media type:");
      stringBuilder.append(paramInt);
      Log.e("RCTCameraModule", stringBuilder.toString());
      return null;
    } 
    return getOutputFile(paramInt, Environment.getExternalStoragePublicDirectory((String)stringBuilder));
  }
  
  public static ReactApplicationContext getReactContextSingleton() {
    return _reactContext;
  }
  
  private File getTempMediaFile(int paramInt) {
    try {
      String str = (new SimpleDateFormat("yyyyMMdd_HHmmss")).format(new Date());
      File file = _reactContext.getCacheDir();
      if (paramInt == 1) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("IMG_");
        stringBuilder1.append(str);
        String str1 = stringBuilder1.toString();
        str = ".jpg";
        return File.createTempFile(str1, str, file);
      } 
      if (paramInt == 2) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("VID_");
        stringBuilder1.append(str);
        String str1 = stringBuilder1.toString();
        str = ".mp4";
        return File.createTempFile(str1, str, file);
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Unsupported media type:");
      stringBuilder.append(paramInt);
      Log.e("RCTCameraModule", stringBuilder.toString());
      return null;
    } catch (Exception exception) {
      Log.e("RCTCameraModule", exception.getMessage());
      return null;
    } 
  }
  
  private Throwable prepareMediaRecorder(ReadableMap paramReadableMap, int paramInt) {
    // Byte code:
    //   0: invokestatic d : ()Lcom/lwansbrough/RCTCamera/b;
    //   3: aload_1
    //   4: ldc 'type'
    //   6: invokeinterface getInt : (Ljava/lang/String;)I
    //   11: aload_1
    //   12: ldc 'quality'
    //   14: invokeinterface getString : (Ljava/lang/String;)Ljava/lang/String;
    //   19: invokevirtual b : (ILjava/lang/String;)Landroid/media/CamcorderProfile;
    //   22: astore #4
    //   24: aload #4
    //   26: ifnonnull -> 40
    //   29: new java/lang/RuntimeException
    //   32: dup
    //   33: ldc_w 'CamcorderProfile not found in prepareMediaRecorder.'
    //   36: invokespecial <init> : (Ljava/lang/String;)V
    //   39: areturn
    //   40: aload_0
    //   41: getfield mCamera : Landroid/hardware/Camera;
    //   44: invokevirtual unlock : ()V
    //   47: aload_0
    //   48: new android/media/MediaRecorder
    //   51: dup
    //   52: invokespecial <init> : ()V
    //   55: putfield mMediaRecorder : Landroid/media/MediaRecorder;
    //   58: aload_0
    //   59: getfield mMediaRecorder : Landroid/media/MediaRecorder;
    //   62: aload_0
    //   63: invokevirtual setOnInfoListener : (Landroid/media/MediaRecorder$OnInfoListener;)V
    //   66: aload_0
    //   67: getfield mMediaRecorder : Landroid/media/MediaRecorder;
    //   70: aload_0
    //   71: invokevirtual setOnErrorListener : (Landroid/media/MediaRecorder$OnErrorListener;)V
    //   74: aload_0
    //   75: getfield mMediaRecorder : Landroid/media/MediaRecorder;
    //   78: aload_0
    //   79: getfield mCamera : Landroid/hardware/Camera;
    //   82: invokevirtual setCamera : (Landroid/hardware/Camera;)V
    //   85: aload_0
    //   86: getfield mMediaRecorder : Landroid/media/MediaRecorder;
    //   89: iconst_5
    //   90: invokevirtual setAudioSource : (I)V
    //   93: aload_0
    //   94: getfield mMediaRecorder : Landroid/media/MediaRecorder;
    //   97: iconst_1
    //   98: invokevirtual setVideoSource : (I)V
    //   101: iload_2
    //   102: ifeq -> 157
    //   105: iload_2
    //   106: iconst_1
    //   107: if_icmpeq -> 147
    //   110: iload_2
    //   111: iconst_2
    //   112: if_icmpeq -> 135
    //   115: iload_2
    //   116: iconst_3
    //   117: if_icmpeq -> 123
    //   120: goto -> 170
    //   123: aload_0
    //   124: getfield mMediaRecorder : Landroid/media/MediaRecorder;
    //   127: astore_3
    //   128: sipush #180
    //   131: istore_2
    //   132: goto -> 165
    //   135: aload_0
    //   136: getfield mMediaRecorder : Landroid/media/MediaRecorder;
    //   139: astore_3
    //   140: sipush #270
    //   143: istore_2
    //   144: goto -> 165
    //   147: aload_0
    //   148: getfield mMediaRecorder : Landroid/media/MediaRecorder;
    //   151: astore_3
    //   152: iconst_0
    //   153: istore_2
    //   154: goto -> 165
    //   157: aload_0
    //   158: getfield mMediaRecorder : Landroid/media/MediaRecorder;
    //   161: astore_3
    //   162: bipush #90
    //   164: istore_2
    //   165: aload_3
    //   166: iload_2
    //   167: invokevirtual setOrientationHint : (I)V
    //   170: aload #4
    //   172: iconst_2
    //   173: putfield fileFormat : I
    //   176: aload_0
    //   177: getfield mMediaRecorder : Landroid/media/MediaRecorder;
    //   180: aload #4
    //   182: invokevirtual setProfile : (Landroid/media/CamcorderProfile;)V
    //   185: aload_0
    //   186: aconst_null
    //   187: putfield mVideoFile : Ljava/io/File;
    //   190: aload_1
    //   191: ldc_w 'target'
    //   194: invokeinterface getInt : (Ljava/lang/String;)I
    //   199: istore_2
    //   200: iload_2
    //   201: ifeq -> 237
    //   204: iload_2
    //   205: iconst_2
    //   206: if_icmpeq -> 228
    //   209: iload_2
    //   210: iconst_3
    //   211: if_icmpeq -> 237
    //   214: aload_0
    //   215: iconst_2
    //   216: invokespecial getOutputMediaFile : (I)Ljava/io/File;
    //   219: astore_3
    //   220: aload_0
    //   221: aload_3
    //   222: putfield mVideoFile : Ljava/io/File;
    //   225: goto -> 246
    //   228: aload_0
    //   229: iconst_2
    //   230: invokespecial getOutputCameraRollFile : (I)Ljava/io/File;
    //   233: astore_3
    //   234: goto -> 220
    //   237: aload_0
    //   238: iconst_2
    //   239: invokespecial getTempMediaFile : (I)Ljava/io/File;
    //   242: astore_3
    //   243: goto -> 220
    //   246: aload_0
    //   247: getfield mVideoFile : Ljava/io/File;
    //   250: astore_3
    //   251: aload_3
    //   252: ifnonnull -> 266
    //   255: new java/lang/RuntimeException
    //   258: dup
    //   259: ldc_w 'Error while preparing output file in prepareMediaRecorder.'
    //   262: invokespecial <init> : (Ljava/lang/String;)V
    //   265: areturn
    //   266: aload_0
    //   267: getfield mMediaRecorder : Landroid/media/MediaRecorder;
    //   270: aload_3
    //   271: invokevirtual getPath : ()Ljava/lang/String;
    //   274: invokevirtual setOutputFile : (Ljava/lang/String;)V
    //   277: aload_1
    //   278: ldc_w 'totalSeconds'
    //   281: invokeinterface hasKey : (Ljava/lang/String;)Z
    //   286: ifeq -> 311
    //   289: aload_1
    //   290: ldc_w 'totalSeconds'
    //   293: invokeinterface getInt : (Ljava/lang/String;)I
    //   298: istore_2
    //   299: aload_0
    //   300: getfield mMediaRecorder : Landroid/media/MediaRecorder;
    //   303: iload_2
    //   304: sipush #1000
    //   307: imul
    //   308: invokevirtual setMaxDuration : (I)V
    //   311: aload_1
    //   312: ldc_w 'maxFileSize'
    //   315: invokeinterface hasKey : (Ljava/lang/String;)Z
    //   320: ifeq -> 342
    //   323: aload_1
    //   324: ldc_w 'maxFileSize'
    //   327: invokeinterface getInt : (Ljava/lang/String;)I
    //   332: istore_2
    //   333: aload_0
    //   334: getfield mMediaRecorder : Landroid/media/MediaRecorder;
    //   337: iload_2
    //   338: i2l
    //   339: invokevirtual setMaxFileSize : (J)V
    //   342: aload_0
    //   343: getfield mMediaRecorder : Landroid/media/MediaRecorder;
    //   346: invokevirtual prepare : ()V
    //   349: aconst_null
    //   350: areturn
    //   351: astore_1
    //   352: ldc 'RCTCameraModule'
    //   354: ldc_w 'Media recorder prepare error.'
    //   357: aload_1
    //   358: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   361: pop
    //   362: aload_0
    //   363: invokespecial releaseMediaRecorder : ()V
    //   366: aload_1
    //   367: areturn
    // Exception table:
    //   from	to	target	type
    //   342	349	351	java/lang/Exception
  }
  
  private void processImage(a parama, ReadableMap paramReadableMap, Promise paramPromise) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_2
    //   3: ldc_w 'fixOrientation'
    //   6: invokeinterface hasKey : (Ljava/lang/String;)Z
    //   11: istore #14
    //   13: iconst_0
    //   14: istore #12
    //   16: iload #14
    //   18: ifeq -> 43
    //   21: aload_2
    //   22: ldc_w 'fixOrientation'
    //   25: invokeinterface getBoolean : (Ljava/lang/String;)Z
    //   30: istore #14
    //   32: iload #14
    //   34: ifeq -> 43
    //   37: iconst_1
    //   38: istore #10
    //   40: goto -> 46
    //   43: iconst_0
    //   44: istore #10
    //   46: iload #10
    //   48: ifeq -> 71
    //   51: aload_1
    //   52: invokevirtual a : ()V
    //   55: goto -> 71
    //   58: astore #15
    //   60: aload_3
    //   61: ldc_w 'Error fixing orientation image'
    //   64: aload #15
    //   66: invokeinterface reject : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   71: aload_1
    //   72: invokevirtual c : ()I
    //   75: i2d
    //   76: dstore #4
    //   78: aload_1
    //   79: invokevirtual b : ()I
    //   82: istore #10
    //   84: iload #10
    //   86: i2d
    //   87: dstore #6
    //   89: dload #4
    //   91: invokestatic isNaN : (D)Z
    //   94: pop
    //   95: dload #6
    //   97: invokestatic isNaN : (D)Z
    //   100: pop
    //   101: dload #4
    //   103: dload #6
    //   105: ddiv
    //   106: dstore #4
    //   108: aload_2
    //   109: ldc 'type'
    //   111: invokeinterface getInt : (Ljava/lang/String;)I
    //   116: istore #10
    //   118: invokestatic d : ()Lcom/lwansbrough/RCTCamera/b;
    //   121: iload #10
    //   123: invokevirtual e : (I)I
    //   126: i2d
    //   127: dstore #6
    //   129: invokestatic d : ()Lcom/lwansbrough/RCTCamera/b;
    //   132: iload #10
    //   134: invokevirtual d : (I)I
    //   137: istore #10
    //   139: iload #10
    //   141: i2d
    //   142: dstore #8
    //   144: dload #6
    //   146: invokestatic isNaN : (D)Z
    //   149: pop
    //   150: dload #8
    //   152: invokestatic isNaN : (D)Z
    //   155: pop
    //   156: dload #6
    //   158: dload #8
    //   160: ddiv
    //   161: dstore #6
    //   163: dload #6
    //   165: dconst_1
    //   166: dcmpl
    //   167: ifle -> 176
    //   170: iconst_1
    //   171: istore #10
    //   173: goto -> 179
    //   176: iconst_0
    //   177: istore #10
    //   179: dload #4
    //   181: dconst_1
    //   182: dcmpl
    //   183: ifle -> 192
    //   186: iconst_1
    //   187: istore #11
    //   189: goto -> 195
    //   192: iconst_0
    //   193: istore #11
    //   195: iload #10
    //   197: iload #11
    //   199: if_icmpeq -> 208
    //   202: iconst_1
    //   203: istore #10
    //   205: goto -> 211
    //   208: iconst_0
    //   209: istore #10
    //   211: dload #6
    //   213: dstore #4
    //   215: goto -> 221
    //   218: iconst_0
    //   219: istore #10
    //   221: aload_2
    //   222: ldc_w 'cropToPreview'
    //   225: invokeinterface hasKey : (Ljava/lang/String;)Z
    //   230: ifeq -> 255
    //   233: aload_2
    //   234: ldc_w 'cropToPreview'
    //   237: invokeinterface getBoolean : (Ljava/lang/String;)Z
    //   242: istore #14
    //   244: iload #14
    //   246: ifeq -> 255
    //   249: iconst_1
    //   250: istore #11
    //   252: goto -> 258
    //   255: iconst_0
    //   256: istore #11
    //   258: iload #11
    //   260: ifeq -> 300
    //   263: dload #4
    //   265: dstore #6
    //   267: iload #10
    //   269: ifeq -> 278
    //   272: dconst_1
    //   273: dload #4
    //   275: ddiv
    //   276: dstore #6
    //   278: aload_1
    //   279: dload #6
    //   281: invokevirtual a : (D)V
    //   284: goto -> 300
    //   287: astore #15
    //   289: aload_3
    //   290: ldc_w 'Error cropping image to preview'
    //   293: aload #15
    //   295: invokeinterface reject : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   300: iload #12
    //   302: istore #11
    //   304: aload_2
    //   305: ldc_w 'mirrorImage'
    //   308: invokeinterface hasKey : (Ljava/lang/String;)Z
    //   313: ifeq -> 339
    //   316: aload_2
    //   317: ldc_w 'mirrorImage'
    //   320: invokeinterface getBoolean : (Ljava/lang/String;)Z
    //   325: istore #14
    //   327: iload #12
    //   329: istore #11
    //   331: iload #14
    //   333: ifeq -> 339
    //   336: iconst_1
    //   337: istore #11
    //   339: iload #11
    //   341: ifeq -> 364
    //   344: aload_1
    //   345: invokevirtual d : ()V
    //   348: goto -> 364
    //   351: astore #15
    //   353: aload_3
    //   354: ldc_w 'Error mirroring image'
    //   357: aload #15
    //   359: invokeinterface reject : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   364: bipush #80
    //   366: istore #11
    //   368: aload_2
    //   369: ldc_w 'jpegQuality'
    //   372: invokeinterface hasKey : (Ljava/lang/String;)Z
    //   377: ifeq -> 391
    //   380: aload_2
    //   381: ldc_w 'jpegQuality'
    //   384: invokeinterface getInt : (Ljava/lang/String;)I
    //   389: istore #11
    //   391: iload #10
    //   393: ifeq -> 405
    //   396: aload_1
    //   397: invokevirtual b : ()I
    //   400: istore #12
    //   402: goto -> 411
    //   405: aload_1
    //   406: invokevirtual c : ()I
    //   409: istore #12
    //   411: iload #10
    //   413: ifeq -> 425
    //   416: aload_1
    //   417: invokevirtual c : ()I
    //   420: istore #10
    //   422: goto -> 431
    //   425: aload_1
    //   426: invokevirtual b : ()I
    //   429: istore #10
    //   431: aload_2
    //   432: ldc_w 'target'
    //   435: invokeinterface getInt : (Ljava/lang/String;)I
    //   440: istore #13
    //   442: iload #13
    //   444: ifeq -> 655
    //   447: iload #13
    //   449: iconst_1
    //   450: if_icmpeq -> 602
    //   453: iload #13
    //   455: iconst_2
    //   456: if_icmpeq -> 532
    //   459: iload #13
    //   461: iconst_3
    //   462: if_icmpeq -> 468
    //   465: goto -> 709
    //   468: aload_0
    //   469: iconst_1
    //   470: invokespecial getTempMediaFile : (I)Ljava/io/File;
    //   473: astore #15
    //   475: aload #15
    //   477: ifnonnull -> 492
    //   480: aload_3
    //   481: ldc_w 'Error creating media file.'
    //   484: invokeinterface reject : (Ljava/lang/String;)V
    //   489: aload_0
    //   490: monitorexit
    //   491: return
    //   492: aload_1
    //   493: aload #15
    //   495: aload_2
    //   496: iload #11
    //   498: invokevirtual a : (Ljava/io/File;Lcom/facebook/react/bridge/ReadableMap;I)V
    //   501: aload #15
    //   503: astore_1
    //   504: aload_0
    //   505: aload_1
    //   506: iload #12
    //   508: iload #10
    //   510: aload_3
    //   511: iconst_0
    //   512: invokespecial resolveImage : (Ljava/io/File;IILcom/facebook/react/bridge/Promise;Z)V
    //   515: goto -> 709
    //   518: astore_1
    //   519: aload_3
    //   520: ldc_w 'failed to save image file'
    //   523: aload_1
    //   524: invokeinterface reject : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   529: aload_0
    //   530: monitorexit
    //   531: return
    //   532: aload_0
    //   533: iconst_1
    //   534: invokespecial getOutputCameraRollFile : (I)Ljava/io/File;
    //   537: astore #15
    //   539: aload #15
    //   541: ifnonnull -> 556
    //   544: aload_3
    //   545: ldc_w 'Error creating media file.'
    //   548: invokeinterface reject : (Ljava/lang/String;)V
    //   553: aload_0
    //   554: monitorexit
    //   555: return
    //   556: aload_1
    //   557: aload #15
    //   559: aload_2
    //   560: iload #11
    //   562: invokevirtual a : (Ljava/io/File;Lcom/facebook/react/bridge/ReadableMap;I)V
    //   565: aload_0
    //   566: aload #15
    //   568: invokevirtual getAbsolutePath : ()Ljava/lang/String;
    //   571: invokespecial addToMediaStore : (Ljava/lang/String;)V
    //   574: aload_0
    //   575: aload #15
    //   577: iload #12
    //   579: iload #10
    //   581: aload_3
    //   582: iconst_1
    //   583: invokespecial resolveImage : (Ljava/io/File;IILcom/facebook/react/bridge/Promise;Z)V
    //   586: goto -> 709
    //   589: aload_3
    //   590: ldc_w 'failed to save image file'
    //   593: aload_1
    //   594: invokeinterface reject : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   599: aload_0
    //   600: monitorexit
    //   601: return
    //   602: aload_0
    //   603: iconst_1
    //   604: invokespecial getOutputMediaFile : (I)Ljava/io/File;
    //   607: astore #15
    //   609: aload #15
    //   611: ifnonnull -> 626
    //   614: aload_3
    //   615: ldc_w 'Error creating media file.'
    //   618: invokeinterface reject : (Ljava/lang/String;)V
    //   623: aload_0
    //   624: monitorexit
    //   625: return
    //   626: aload_1
    //   627: aload #15
    //   629: aload_2
    //   630: iload #11
    //   632: invokevirtual a : (Ljava/io/File;Lcom/facebook/react/bridge/ReadableMap;I)V
    //   635: aload #15
    //   637: astore_1
    //   638: goto -> 504
    //   641: astore_1
    //   642: aload_3
    //   643: ldc_w 'failed to save image file'
    //   646: aload_1
    //   647: invokeinterface reject : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   652: aload_0
    //   653: monitorexit
    //   654: return
    //   655: aload_1
    //   656: iload #11
    //   658: invokevirtual a : (I)Ljava/lang/String;
    //   661: astore_1
    //   662: new com/facebook/react/bridge/WritableNativeMap
    //   665: dup
    //   666: invokespecial <init> : ()V
    //   669: astore_2
    //   670: aload_2
    //   671: ldc_w 'data'
    //   674: aload_1
    //   675: invokeinterface putString : (Ljava/lang/String;Ljava/lang/String;)V
    //   680: aload_2
    //   681: ldc_w 'width'
    //   684: iload #12
    //   686: invokeinterface putInt : (Ljava/lang/String;I)V
    //   691: aload_2
    //   692: ldc_w 'height'
    //   695: iload #10
    //   697: invokeinterface putInt : (Ljava/lang/String;I)V
    //   702: aload_3
    //   703: aload_2
    //   704: invokeinterface resolve : (Ljava/lang/Object;)V
    //   709: aload_0
    //   710: monitorexit
    //   711: return
    //   712: astore_1
    //   713: aload_0
    //   714: monitorexit
    //   715: goto -> 720
    //   718: aload_1
    //   719: athrow
    //   720: goto -> 718
    //   723: astore #15
    //   725: goto -> 218
    //   728: astore_1
    //   729: goto -> 589
    //   732: astore_1
    //   733: goto -> 589
    // Exception table:
    //   from	to	target	type
    //   2	13	712	finally
    //   21	32	712	finally
    //   51	55	58	com/lwansbrough/RCTCamera/a$b
    //   51	55	712	finally
    //   60	71	712	finally
    //   71	84	712	finally
    //   108	139	723	java/lang/IllegalArgumentException
    //   108	139	712	finally
    //   221	244	712	finally
    //   278	284	287	java/lang/IllegalArgumentException
    //   278	284	712	finally
    //   289	300	712	finally
    //   304	327	712	finally
    //   344	348	351	com/lwansbrough/RCTCamera/a$b
    //   344	348	712	finally
    //   353	364	712	finally
    //   368	391	712	finally
    //   396	402	712	finally
    //   405	411	712	finally
    //   416	422	712	finally
    //   425	431	712	finally
    //   431	442	712	finally
    //   468	475	712	finally
    //   480	489	712	finally
    //   492	501	518	java/io/IOException
    //   492	501	712	finally
    //   504	515	712	finally
    //   519	529	712	finally
    //   532	539	712	finally
    //   544	553	712	finally
    //   556	565	732	java/io/IOException
    //   556	565	728	java/lang/NullPointerException
    //   556	565	712	finally
    //   565	586	712	finally
    //   589	599	712	finally
    //   602	609	712	finally
    //   614	623	712	finally
    //   626	635	641	java/io/IOException
    //   626	635	712	finally
    //   642	652	712	finally
    //   655	709	712	finally
  }
  
  private void record(ReadableMap paramReadableMap, Promise paramPromise, int paramInt) {
    if (this.mRecordingPromise != null)
      return; 
    this.mCamera = b.d().a(paramReadableMap.getInt("type"));
    if (this.mCamera == null) {
      paramPromise.reject(new RuntimeException("No camera found."));
      return;
    } 
    Throwable throwable = prepareMediaRecorder(paramReadableMap, paramInt);
    if (throwable != null) {
      paramPromise.reject(throwable);
      return;
    } 
    try {
      this.mMediaRecorder.start();
      this.MRStartTime = System.currentTimeMillis();
      this.mRecordingOptions = paramReadableMap;
      this.mRecordingPromise = paramPromise;
      return;
    } catch (Exception exception) {
      Log.e("RCTCameraModule", "Media recorder start error.", exception);
      paramPromise.reject(exception);
      return;
    } 
  }
  
  private void releaseMediaRecorder() {
    String str;
    long l = System.currentTimeMillis() - this.MRStartTime;
    if (l < 1500L)
      try {
        Thread.sleep(1500L - l);
      } catch (InterruptedException interruptedException) {
        Log.e("RCTCameraModule", "releaseMediaRecorder thread sleep error.", interruptedException);
      }  
    MediaRecorder mediaRecorder = this.mMediaRecorder;
    if (mediaRecorder != null) {
      try {
        mediaRecorder.stop();
      } catch (RuntimeException runtimeException) {
        Log.e("RCTCameraModule", "Media recorder stop error.", runtimeException);
      } 
      this.mMediaRecorder.reset();
      this.mMediaRecorder.release();
      this.mMediaRecorder = null;
    } 
    Camera camera = this.mCamera;
    if (camera != null)
      camera.lock(); 
    if (this.mRecordingPromise == null)
      return; 
    File file = new File(this.mVideoFile.getPath());
    if (!file.exists()) {
      this.mRecordingPromise.reject(new RuntimeException("There is nothing recorded."));
      this.mRecordingPromise = null;
      return;
    } 
    file.setReadable(true, false);
    file.setWritable(true, false);
    WritableNativeMap writableNativeMap = new WritableNativeMap();
    int i = this.mRecordingOptions.getInt("target");
    if (i != 0) {
      if (i != 1)
        if (i != 2) {
          if (i != 3) {
            this.mRecordingPromise = null;
            return;
          } 
        } else {
          ContentValues contentValues = new ContentValues();
          contentValues.put("_data", this.mVideoFile.getPath());
          if (this.mRecordingOptions.hasKey("title")) {
            str = this.mRecordingOptions.getString("title");
          } else {
            str = "video";
          } 
          contentValues.put("title", str);
          if (this.mRecordingOptions.hasKey("description"))
            contentValues.put("description", Boolean.valueOf(this.mRecordingOptions.hasKey("description"))); 
          if (this.mRecordingOptions.hasKey("latitude"))
            contentValues.put("latitude", this.mRecordingOptions.getString("latitude")); 
          if (this.mRecordingOptions.hasKey("longitude"))
            contentValues.put("longitude", this.mRecordingOptions.getString("longitude")); 
          contentValues.put("mime_type", "video/mp4");
          _reactContext.getContentResolver().insert(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, contentValues);
          addToMediaStore(this.mVideoFile.getAbsolutePath());
        }  
      writableNativeMap.putString("path", Uri.fromFile(this.mVideoFile).toString());
      this.mRecordingPromise.resolve(writableNativeMap);
    } else {
      writableNativeMap.putString("data", new String(convertFileToByteArray(this.mVideoFile), 2));
      this.mRecordingPromise.resolve(writableNativeMap);
      str.delete();
    } 
    this.mRecordingPromise = null;
  }
  
  private void resolveImage(File paramFile, int paramInt1, int paramInt2, Promise paramPromise, boolean paramBoolean) {
    e e;
    WritableNativeMap writableNativeMap = new WritableNativeMap();
    writableNativeMap.putString("path", Uri.fromFile(paramFile).toString());
    writableNativeMap.putInt("width", paramInt1);
    writableNativeMap.putInt("height", paramInt2);
    if (paramBoolean) {
      ReactApplicationContext reactApplicationContext = _reactContext;
      String str = paramFile.getAbsolutePath();
      e = new e(this, (WritableMap)writableNativeMap, paramPromise);
      MediaScannerConnection.scanFile((Context)reactApplicationContext, new String[] { str }, null, e);
      return;
    } 
    e.resolve(writableNativeMap);
  }
  
  @ReactMethod
  public void capture(ReadableMap paramReadableMap, Promise paramPromise) {
    int i;
    if (b.d() == null) {
      paramPromise.reject("Camera is not ready yet.");
      return;
    } 
    if (paramReadableMap.hasKey("orientation")) {
      i = paramReadableMap.getInt("orientation");
    } else {
      i = b.d().b();
    } 
    if (i == Integer.MAX_VALUE) {
      this._sensorOrientationChecker.c();
      this._sensorOrientationChecker.a(new b(this, paramReadableMap, paramPromise));
      return;
    } 
    captureWithOrientation(paramReadableMap, paramPromise, i);
  }
  
  public Map<String, Object> getConstants() {
    return Collections.unmodifiableMap(new a());
  }
  
  public String getName() {
    return "RCTCameraModule";
  }
  
  @ReactMethod
  public void hasFlash(ReadableMap paramReadableMap, Promise paramPromise) {
    boolean bool;
    Camera camera = b.d().a(paramReadableMap.getInt("type"));
    if (camera == null) {
      paramPromise.reject("No camera found.");
      return;
    } 
    List list = camera.getParameters().getSupportedFlashModes();
    if (list != null && !list.isEmpty()) {
      bool = true;
    } else {
      bool = false;
    } 
    paramPromise.resolve(Boolean.valueOf(bool));
  }
  
  public void onError(MediaRecorder paramMediaRecorder, int paramInt1, int paramInt2) {
    if (this.mRecordingPromise != null)
      releaseMediaRecorder(); 
  }
  
  public void onHostDestroy() {}
  
  public void onHostPause() {
    if (this.mRecordingPromise != null)
      releaseMediaRecorder(); 
  }
  
  public void onHostResume() {
    this.mSafeToCapture = Boolean.valueOf(true);
  }
  
  public void onInfo(MediaRecorder paramMediaRecorder, int paramInt1, int paramInt2) {
    if ((paramInt1 == 800 || paramInt1 == 801) && this.mRecordingPromise != null)
      releaseMediaRecorder(); 
  }
  
  @ReactMethod
  public void setZoom(ReadableMap paramReadableMap, int paramInt) {
    b b = b.d();
    if (b == null)
      return; 
    Camera camera = b.a(paramReadableMap.getInt("type"));
    if (camera == null)
      return; 
    Camera.Parameters parameters = camera.getParameters();
    int i = parameters.getMaxZoom();
    if (parameters.isZoomSupported() && paramInt >= 0 && paramInt < i) {
      parameters.setZoom(paramInt);
      try {
        camera.setParameters(parameters);
        return;
      } catch (RuntimeException runtimeException) {
        Log.e("RCTCameraModule", "setParameters failed", runtimeException);
      } 
    } 
  }
  
  @ReactMethod
  public void stopCapture(Promise paramPromise) {
    String str;
    if (this.mRecordingPromise != null) {
      releaseMediaRecorder();
      str = "Finished recording.";
    } else {
      str = "Not recording.";
    } 
    paramPromise.resolve(str);
  }
  
  class a extends HashMap<String, Object> {
    a() {
      put((K)"Aspect", (V)a());
      put((K)"BarCodeType", (V)b());
      put((K)"Type", (V)j());
      put((K)"CaptureQuality", (V)d());
      put((K)"CaptureMode", (V)c());
      put((K)"CaptureTarget", (V)f());
      put((K)"Orientation", (V)h());
      put((K)"FlashMode", (V)g());
      put((K)"TorchMode", (V)i());
    }
    
    private Map<String, Object> a() {
      return Collections.unmodifiableMap(new a());
    }
    
    private Map<String, Object> b() {
      return Collections.unmodifiableMap(new b());
    }
    
    private Map<String, Object> c() {
      return Collections.unmodifiableMap(new e());
    }
    
    private Map<String, Object> d() {
      return Collections.unmodifiableMap(new d());
    }
    
    private Map<String, Object> f() {
      return Collections.unmodifiableMap(new f());
    }
    
    private Map<String, Object> g() {
      return Collections.unmodifiableMap(new h());
    }
    
    private Map<String, Object> h() {
      return Collections.unmodifiableMap(new g());
    }
    
    private Map<String, Object> i() {
      return Collections.unmodifiableMap(new i());
    }
    
    private Map<String, Object> j() {
      return Collections.unmodifiableMap(new c());
    }
    
    class a extends HashMap<String, Object> {
      a() {
        put((K)"stretch", (V)Integer.valueOf(2));
        put((K)"fit", (V)Integer.valueOf(1));
        put((K)"fill", (V)Integer.valueOf(0));
      }
    }
    
    class b extends HashMap<String, Object> {}
    
    class c extends HashMap<String, Object> {
      c() {
        put((K)"front", (V)Integer.valueOf(1));
        put((K)"back", (V)Integer.valueOf(2));
      }
    }
    
    class d extends HashMap<String, Object> {
      d() {
        put((K)"low", (V)"low");
        put((K)"medium", (V)"medium");
        put((K)"high", (V)"high");
        put((K)"photo", (V)"high");
        put((K)"preview", (V)"preview");
        put((K)"480p", (V)"480p");
        put((K)"720p", (V)"720p");
        put((K)"1080p", (V)"1080p");
      }
    }
    
    class e extends HashMap<String, Object> {
      e() {
        put((K)"still", (V)Integer.valueOf(0));
        put((K)"video", (V)Integer.valueOf(1));
      }
    }
    
    class f extends HashMap<String, Object> {
      f() {
        put((K)"memory", (V)Integer.valueOf(0));
        put((K)"disk", (V)Integer.valueOf(1));
        put((K)"cameraRoll", (V)Integer.valueOf(2));
        put((K)"temp", (V)Integer.valueOf(3));
      }
    }
    
    class g extends HashMap<String, Object> {
      g() {
        put((K)"auto", (V)Integer.valueOf(2147483647));
        put((K)"landscapeLeft", (V)Integer.valueOf(1));
        put((K)"landscapeRight", (V)Integer.valueOf(3));
        put((K)"portrait", (V)Integer.valueOf(0));
        put((K)"portraitUpsideDown", (V)Integer.valueOf(2));
      }
    }
    
    class h extends HashMap<String, Object> {
      h() {
        put((K)"off", (V)Integer.valueOf(0));
        put((K)"on", (V)Integer.valueOf(1));
        put((K)"auto", (V)Integer.valueOf(2));
      }
    }
    
    class i extends HashMap<String, Object> {
      i() {
        put((K)"off", (V)Integer.valueOf(0));
        put((K)"on", (V)Integer.valueOf(1));
        put((K)"auto", (V)Integer.valueOf(2));
      }
    }
  }
  
  class a extends HashMap<String, Object> {
    a() {
      put((K)"stretch", (V)Integer.valueOf(2));
      put((K)"fit", (V)Integer.valueOf(1));
      put((K)"fill", (V)Integer.valueOf(0));
    }
  }
  
  class b extends HashMap<String, Object> {}
  
  class c extends HashMap<String, Object> {
    c() {
      put((K)"front", (V)Integer.valueOf(1));
      put((K)"back", (V)Integer.valueOf(2));
    }
  }
  
  class d extends HashMap<String, Object> {
    d() {
      put((K)"low", (V)"low");
      put((K)"medium", (V)"medium");
      put((K)"high", (V)"high");
      put((K)"photo", (V)"high");
      put((K)"preview", (V)"preview");
      put((K)"480p", (V)"480p");
      put((K)"720p", (V)"720p");
      put((K)"1080p", (V)"1080p");
    }
  }
  
  class e extends HashMap<String, Object> {
    e() {
      put((K)"still", (V)Integer.valueOf(0));
      put((K)"video", (V)Integer.valueOf(1));
    }
  }
  
  class f extends HashMap<String, Object> {
    f() {
      put((K)"memory", (V)Integer.valueOf(0));
      put((K)"disk", (V)Integer.valueOf(1));
      put((K)"cameraRoll", (V)Integer.valueOf(2));
      put((K)"temp", (V)Integer.valueOf(3));
    }
  }
  
  class g extends HashMap<String, Object> {
    g() {
      put((K)"auto", (V)Integer.valueOf(2147483647));
      put((K)"landscapeLeft", (V)Integer.valueOf(1));
      put((K)"landscapeRight", (V)Integer.valueOf(3));
      put((K)"portrait", (V)Integer.valueOf(0));
      put((K)"portraitUpsideDown", (V)Integer.valueOf(2));
    }
  }
  
  class h extends HashMap<String, Object> {
    h() {
      put((K)"off", (V)Integer.valueOf(0));
      put((K)"on", (V)Integer.valueOf(1));
      put((K)"auto", (V)Integer.valueOf(2));
    }
  }
  
  class i extends HashMap<String, Object> {
    i() {
      put((K)"off", (V)Integer.valueOf(0));
      put((K)"on", (V)Integer.valueOf(1));
      put((K)"auto", (V)Integer.valueOf(2));
    }
  }
  
  class b implements g {
    b(RCTCameraModule this$0, ReadableMap param1ReadableMap, Promise param1Promise) {}
    
    public void a() {
      int i = this.c._sensorOrientationChecker.a();
      this.c._sensorOrientationChecker.d();
      this.c._sensorOrientationChecker.b();
      this.c.captureWithOrientation(this.a, this.b, i);
    }
  }
  
  class c implements Camera.PictureCallback {
    c(RCTCameraModule this$0, ReadableMap param1ReadableMap, Promise param1Promise) {}
    
    public void onPictureTaken(byte[] param1ArrayOfbyte, Camera param1Camera) {
      param1Camera.stopPreview();
      param1Camera.startPreview();
      AsyncTask.execute(new a(this, param1ArrayOfbyte));
      RCTCameraModule.access$302(this.c, Boolean.valueOf(true));
    }
    
    class a implements Runnable {
      a(RCTCameraModule.c this$0, byte[] param2ArrayOfbyte) {}
      
      public void run() {
        RCTCameraModule rCTCameraModule = this.d.c;
        a a1 = new a(this.c);
        RCTCameraModule.c c1 = this.d;
        rCTCameraModule.processImage(a1, c1.a, c1.b);
      }
    }
  }
  
  class a implements Runnable {
    a(RCTCameraModule this$0, byte[] param1ArrayOfbyte) {}
    
    public void run() {
      RCTCameraModule rCTCameraModule = this.d.c;
      a a1 = new a(this.c);
      RCTCameraModule.c c1 = this.d;
      rCTCameraModule.processImage(a1, c1.a, c1.b);
    }
  }
  
  class d implements Camera.ShutterCallback {
    d(RCTCameraModule this$0, Camera param1Camera) {}
    
    public void onShutter() {
      try {
        this.a.setPreviewCallback(null);
        this.a.setPreviewTexture(null);
        return;
      } catch (Exception exception) {
        exception.printStackTrace();
        return;
      } 
    }
  }
  
  class e implements MediaScannerConnection.OnScanCompletedListener {
    e(RCTCameraModule this$0, WritableMap param1WritableMap, Promise param1Promise) {}
    
    public void onScanCompleted(String param1String, Uri param1Uri) {
      if (param1Uri != null)
        this.a.putString("mediaUri", param1Uri.toString()); 
      this.b.resolve(this.a);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/lwansbrough/RCTCamera/RCTCameraModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */