package com.lwansbrough.RCTCamera;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.AsyncTask;
import android.util.Log;
import android.view.MotionEvent;
import android.view.TextureView;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import e.f.c.h;
import e.f.c.i;
import e.f.c.k;
import e.f.c.n;
import e.f.c.p;
import e.f.c.s.j;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;

class e extends TextureView implements TextureView.SurfaceTextureListener, Camera.PreviewCallback {
  public static volatile boolean n = false;
  
  private int c;
  
  private int d;
  
  private SurfaceTexture e;
  
  private int f;
  
  private int g;
  
  private boolean h;
  
  private boolean i;
  
  private Camera j;
  
  private boolean k = false;
  
  private float l;
  
  private final i m = new i();
  
  public e(Context paramContext, int paramInt) {
    super(paramContext);
    setSurfaceTextureListener(this);
    this.c = paramInt;
    a(b.d().a());
  }
  
  private float a(MotionEvent paramMotionEvent) {
    float f1 = paramMotionEvent.getX(0) - paramMotionEvent.getX(1);
    float f2 = paramMotionEvent.getY(0) - paramMotionEvent.getY(1);
    return (float)Math.sqrt((f1 * f1 + f2 * f2));
  }
  
  private void a(List<String> paramList) {
    EnumMap<e.f.c.e, Object> enumMap = new EnumMap<e.f.c.e, Object>(e.f.c.e.class);
    EnumSet<e.f.c.a> enumSet = EnumSet.noneOf(e.f.c.a.class);
    if (paramList != null) {
      Iterator<String> iterator = paramList.iterator();
      while (iterator.hasNext()) {
        e.f.c.a a = b(iterator.next());
        if (a != null)
          enumSet.add(a); 
      } 
    } 
    enumMap.put(e.f.c.e.e, enumSet);
    this.m.a(enumMap);
  }
  
  private e.f.c.a b(String paramString) {
    if ("aztec".equals(paramString))
      return e.f.c.a.c; 
    if ("ean13".equals(paramString))
      return e.f.c.a.j; 
    if ("ean8".equals(paramString))
      return e.f.c.a.i; 
    if ("qr".equals(paramString))
      return e.f.c.a.n; 
    if ("pdf417".equals(paramString))
      return e.f.c.a.m; 
    if ("upce".equals(paramString))
      return e.f.c.a.r; 
    if ("datamatrix".equals(paramString))
      return e.f.c.a.h; 
    if ("code39".equals(paramString))
      return e.f.c.a.e; 
    if ("code93".equals(paramString))
      return e.f.c.a.f; 
    if ("interleaved2of5".equals(paramString))
      return e.f.c.a.k; 
    if ("codabar".equals(paramString))
      return e.f.c.a.d; 
    if ("code128".equals(paramString))
      return e.f.c.a.g; 
    if ("maxicode".equals(paramString))
      return e.f.c.a.l; 
    if ("rss14".equals(paramString))
      return e.f.c.a.o; 
    if ("rssexpanded".equals(paramString))
      return e.f.c.a.p; 
    if ("upca".equals(paramString))
      return e.f.c.a.q; 
    if ("upceanextension".equals(paramString))
      return e.f.c.a.s; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Unsupported code.. [");
    stringBuilder.append(paramString);
    stringBuilder.append("]");
    Log.v("RCTCamera", stringBuilder.toString());
    return null;
  }
  
  private void b(MotionEvent paramMotionEvent, Camera.Parameters paramParameters) {
    int j;
    int m = paramParameters.getMaxZoom();
    int k = paramParameters.getZoom();
    float f1 = a(paramMotionEvent);
    float f2 = this.l;
    if (f1 > f2) {
      j = k;
      if (k < m)
        j = k + 1; 
    } else {
      j = k;
      if (f1 < f2) {
        j = k;
        if (k > 0)
          j = k - 1; 
      } 
    } 
    this.l = f1;
    paramParameters.setZoom(j);
    try {
      this.j.setParameters(paramParameters);
      return;
    } catch (RuntimeException runtimeException) {
      Log.e("RCTCameraViewFinder", "setParameters failed", runtimeException);
      return;
    } 
  }
  
  private Activity e() {
    for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper)context).getBaseContext()) {
      if (context instanceof Activity)
        return (Activity)context; 
    } 
    return null;
  }
  
  private void f() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield h : Z
    //   6: ifne -> 381
    //   9: iconst_1
    //   10: istore_2
    //   11: aload_0
    //   12: iconst_1
    //   13: putfield h : Z
    //   16: aload_0
    //   17: invokestatic d : ()Lcom/lwansbrough/RCTCamera/b;
    //   20: aload_0
    //   21: getfield c : I
    //   24: invokevirtual a : (I)Landroid/hardware/Camera;
    //   27: putfield j : Landroid/hardware/Camera;
    //   30: aload_0
    //   31: getfield j : Landroid/hardware/Camera;
    //   34: invokevirtual getParameters : ()Landroid/hardware/Camera$Parameters;
    //   37: astore #4
    //   39: aload_0
    //   40: getfield d : I
    //   43: ifne -> 395
    //   46: iconst_1
    //   47: istore_1
    //   48: goto -> 51
    //   51: aload_0
    //   52: getfield d : I
    //   55: iconst_1
    //   56: if_icmpne -> 400
    //   59: goto -> 402
    //   62: new java/lang/StringBuilder
    //   65: dup
    //   66: invokespecial <init> : ()V
    //   69: astore_3
    //   70: aload_3
    //   71: ldc_w 'Unsupported capture mode:'
    //   74: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   77: pop
    //   78: aload_3
    //   79: aload_0
    //   80: getfield d : I
    //   83: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   86: pop
    //   87: new java/lang/RuntimeException
    //   90: dup
    //   91: aload_3
    //   92: invokevirtual toString : ()Ljava/lang/String;
    //   95: invokespecial <init> : (Ljava/lang/String;)V
    //   98: athrow
    //   99: aload #4
    //   101: invokevirtual getSupportedFocusModes : ()Ljava/util/List;
    //   104: astore_3
    //   105: iload_1
    //   106: ifeq -> 134
    //   109: aload_3
    //   110: ldc_w 'continuous-picture'
    //   113: invokeinterface contains : (Ljava/lang/Object;)Z
    //   118: ifeq -> 134
    //   121: ldc_w 'continuous-picture'
    //   124: astore_3
    //   125: aload #4
    //   127: aload_3
    //   128: invokevirtual setFocusMode : (Ljava/lang/String;)V
    //   131: goto -> 176
    //   134: iload_2
    //   135: ifeq -> 157
    //   138: aload_3
    //   139: ldc_w 'continuous-video'
    //   142: invokeinterface contains : (Ljava/lang/Object;)Z
    //   147: ifeq -> 157
    //   150: ldc_w 'continuous-video'
    //   153: astore_3
    //   154: goto -> 125
    //   157: aload_3
    //   158: ldc_w 'auto'
    //   161: invokeinterface contains : (Ljava/lang/Object;)Z
    //   166: ifeq -> 176
    //   169: ldc_w 'auto'
    //   172: astore_3
    //   173: goto -> 125
    //   176: iload_1
    //   177: ifeq -> 189
    //   180: aload #4
    //   182: invokevirtual getSupportedPictureSizes : ()Ljava/util/List;
    //   185: astore_3
    //   186: goto -> 204
    //   189: iload_2
    //   190: ifeq -> 313
    //   193: invokestatic d : ()Lcom/lwansbrough/RCTCamera/b;
    //   196: aload_0
    //   197: getfield j : Landroid/hardware/Camera;
    //   200: invokevirtual a : (Landroid/hardware/Camera;)Ljava/util/List;
    //   203: astore_3
    //   204: invokestatic d : ()Lcom/lwansbrough/RCTCamera/b;
    //   207: aload_3
    //   208: ldc_w 2147483647
    //   211: ldc_w 2147483647
    //   214: invokevirtual a : (Ljava/util/List;II)Landroid/hardware/Camera$Size;
    //   217: astore_3
    //   218: aload #4
    //   220: aload_3
    //   221: getfield width : I
    //   224: aload_3
    //   225: getfield height : I
    //   228: invokevirtual setPictureSize : (II)V
    //   231: aload_0
    //   232: getfield j : Landroid/hardware/Camera;
    //   235: aload #4
    //   237: invokevirtual setParameters : (Landroid/hardware/Camera$Parameters;)V
    //   240: goto -> 255
    //   243: astore_3
    //   244: ldc_w 'RCTCameraViewFinder'
    //   247: ldc_w 'setParameters failed'
    //   250: aload_3
    //   251: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   254: pop
    //   255: aload_0
    //   256: getfield j : Landroid/hardware/Camera;
    //   259: aload_0
    //   260: getfield e : Landroid/graphics/SurfaceTexture;
    //   263: invokevirtual setPreviewTexture : (Landroid/graphics/SurfaceTexture;)V
    //   266: aload_0
    //   267: getfield j : Landroid/hardware/Camera;
    //   270: invokevirtual startPreview : ()V
    //   273: aload_0
    //   274: getfield k : Z
    //   277: ifeq -> 297
    //   280: aload_0
    //   281: invokespecial e : ()Landroid/app/Activity;
    //   284: astore_3
    //   285: aload_3
    //   286: ifnull -> 297
    //   289: aload_3
    //   290: invokevirtual getWindow : ()Landroid/view/Window;
    //   293: aconst_null
    //   294: invokevirtual setBackgroundDrawable : (Landroid/graphics/drawable/Drawable;)V
    //   297: aload_0
    //   298: getfield j : Landroid/hardware/Camera;
    //   301: aload_0
    //   302: invokevirtual setPreviewCallback : (Landroid/hardware/Camera$PreviewCallback;)V
    //   305: aload_0
    //   306: iconst_0
    //   307: putfield h : Z
    //   310: goto -> 381
    //   313: new java/lang/StringBuilder
    //   316: dup
    //   317: invokespecial <init> : ()V
    //   320: astore_3
    //   321: aload_3
    //   322: ldc_w 'Unsupported capture mode:'
    //   325: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   328: pop
    //   329: aload_3
    //   330: aload_0
    //   331: getfield d : I
    //   334: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   337: pop
    //   338: new java/lang/RuntimeException
    //   341: dup
    //   342: aload_3
    //   343: invokevirtual toString : ()Ljava/lang/String;
    //   346: invokespecial <init> : (Ljava/lang/String;)V
    //   349: athrow
    //   350: astore_3
    //   351: goto -> 374
    //   354: astore_3
    //   355: aload_3
    //   356: invokevirtual printStackTrace : ()V
    //   359: aload_0
    //   360: invokespecial g : ()V
    //   363: goto -> 305
    //   366: astore_3
    //   367: aload_3
    //   368: invokevirtual printStackTrace : ()V
    //   371: goto -> 305
    //   374: aload_0
    //   375: iconst_0
    //   376: putfield h : Z
    //   379: aload_3
    //   380: athrow
    //   381: aload_0
    //   382: monitorexit
    //   383: return
    //   384: astore_3
    //   385: aload_0
    //   386: monitorexit
    //   387: goto -> 392
    //   390: aload_3
    //   391: athrow
    //   392: goto -> 390
    //   395: iconst_0
    //   396: istore_1
    //   397: goto -> 51
    //   400: iconst_0
    //   401: istore_2
    //   402: iload_1
    //   403: ifne -> 99
    //   406: iload_2
    //   407: ifeq -> 62
    //   410: goto -> 99
    // Exception table:
    //   from	to	target	type
    //   2	9	384	finally
    //   11	16	384	finally
    //   16	46	366	java/lang/NullPointerException
    //   16	46	354	java/lang/Exception
    //   16	46	350	finally
    //   51	59	366	java/lang/NullPointerException
    //   51	59	354	java/lang/Exception
    //   51	59	350	finally
    //   62	99	366	java/lang/NullPointerException
    //   62	99	354	java/lang/Exception
    //   62	99	350	finally
    //   99	105	366	java/lang/NullPointerException
    //   99	105	354	java/lang/Exception
    //   99	105	350	finally
    //   109	121	366	java/lang/NullPointerException
    //   109	121	354	java/lang/Exception
    //   109	121	350	finally
    //   125	131	366	java/lang/NullPointerException
    //   125	131	354	java/lang/Exception
    //   125	131	350	finally
    //   138	150	366	java/lang/NullPointerException
    //   138	150	354	java/lang/Exception
    //   138	150	350	finally
    //   157	169	366	java/lang/NullPointerException
    //   157	169	354	java/lang/Exception
    //   157	169	350	finally
    //   180	186	366	java/lang/NullPointerException
    //   180	186	354	java/lang/Exception
    //   180	186	350	finally
    //   193	204	366	java/lang/NullPointerException
    //   193	204	354	java/lang/Exception
    //   193	204	350	finally
    //   204	231	366	java/lang/NullPointerException
    //   204	231	354	java/lang/Exception
    //   204	231	350	finally
    //   231	240	243	java/lang/RuntimeException
    //   231	240	354	java/lang/Exception
    //   231	240	350	finally
    //   244	255	366	java/lang/NullPointerException
    //   244	255	354	java/lang/Exception
    //   244	255	350	finally
    //   255	285	366	java/lang/NullPointerException
    //   255	285	354	java/lang/Exception
    //   255	285	350	finally
    //   289	297	366	java/lang/NullPointerException
    //   289	297	354	java/lang/Exception
    //   289	297	350	finally
    //   297	305	366	java/lang/NullPointerException
    //   297	305	354	java/lang/Exception
    //   297	305	350	finally
    //   305	310	384	finally
    //   313	350	366	java/lang/NullPointerException
    //   313	350	354	java/lang/Exception
    //   313	350	350	finally
    //   355	363	350	finally
    //   367	371	350	finally
    //   374	381	384	finally
  }
  
  private void g() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield i : Z
    //   6: ifne -> 78
    //   9: aload_0
    //   10: iconst_1
    //   11: putfield i : Z
    //   14: aload_0
    //   15: getfield j : Landroid/hardware/Camera;
    //   18: ifnull -> 51
    //   21: aload_0
    //   22: getfield j : Landroid/hardware/Camera;
    //   25: invokevirtual stopPreview : ()V
    //   28: aload_0
    //   29: getfield j : Landroid/hardware/Camera;
    //   32: aconst_null
    //   33: invokevirtual setPreviewCallback : (Landroid/hardware/Camera$PreviewCallback;)V
    //   36: invokestatic d : ()Lcom/lwansbrough/RCTCamera/b;
    //   39: aload_0
    //   40: getfield c : I
    //   43: invokevirtual g : (I)V
    //   46: aload_0
    //   47: aconst_null
    //   48: putfield j : Landroid/hardware/Camera;
    //   51: aload_0
    //   52: iconst_0
    //   53: putfield i : Z
    //   56: goto -> 78
    //   59: astore_1
    //   60: goto -> 71
    //   63: astore_1
    //   64: aload_1
    //   65: invokevirtual printStackTrace : ()V
    //   68: goto -> 51
    //   71: aload_0
    //   72: iconst_0
    //   73: putfield i : Z
    //   76: aload_1
    //   77: athrow
    //   78: aload_0
    //   79: monitorexit
    //   80: return
    //   81: astore_1
    //   82: aload_0
    //   83: monitorexit
    //   84: goto -> 89
    //   87: aload_1
    //   88: athrow
    //   89: goto -> 87
    // Exception table:
    //   from	to	target	type
    //   2	14	81	finally
    //   14	51	63	java/lang/Exception
    //   14	51	59	finally
    //   51	56	81	finally
    //   64	68	59	finally
    //   71	78	81	finally
  }
  
  public int a() {
    return this.c;
  }
  
  public void a(int paramInt) {
    if (this.c == paramInt)
      return; 
    (new Thread(new a(this, paramInt))).start();
  }
  
  public void a(MotionEvent paramMotionEvent, Camera.Parameters paramParameters) {
    List<Camera.Area> list = paramParameters.getSupportedFocusModes();
    if (list != null && list.contains("auto")) {
      if (paramParameters.getMaxNumFocusAreas() == 0)
        return; 
      this.j.cancelAutoFocus();
      try {
        Camera.Area area = c.a(paramMotionEvent, this.f, this.g);
        paramParameters.setFocusMode("auto");
        list = new ArrayList();
        list.add(area);
        paramParameters.setFocusAreas(list);
        if (paramParameters.getMaxNumMeteringAreas() > 0)
          paramParameters.setMeteringAreas(list); 
        try {
          this.j.setParameters(paramParameters);
        } catch (RuntimeException runtimeException) {
          Log.e("RCTCameraViewFinder", "setParameters failed", runtimeException);
        } 
        try {
          this.j.autoFocus(new b(this));
          return;
        } catch (Exception exception) {
          exception.printStackTrace();
          return;
        } 
      } catch (RuntimeException runtimeException) {
        runtimeException.printStackTrace();
      } 
    } 
  }
  
  public void a(String paramString) {
    b.d().a(this.c, paramString);
  }
  
  public void a(boolean paramBoolean) {
    this.k = paramBoolean;
  }
  
  public double b() {
    int j = b.d().f(this.c);
    int k = b.d().c(this.c);
    return (j / k);
  }
  
  public void b(int paramInt) {
    b.d().b(this.c, paramInt);
    this.d = paramInt;
  }
  
  public void c() {
    if (this.e != null)
      f(); 
  }
  
  public void c(int paramInt) {
    b.d().c(this.c, paramInt);
  }
  
  public void d() {
    if (this.j != null)
      g(); 
  }
  
  public void d(int paramInt) {
    b.d().d(this.c, paramInt);
  }
  
  public void e(int paramInt) {
    b.d().e(this.c, paramInt);
  }
  
  public void onPreviewFrame(byte[] paramArrayOfbyte, Camera paramCamera) {
    if (b.d().c() && !n) {
      n = true;
      (new c(this, paramCamera, paramArrayOfbyte)).execute((Object[])new Void[0]);
    } 
  }
  
  public void onSurfaceTextureAvailable(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2) {
    this.e = paramSurfaceTexture;
    this.f = paramInt1;
    this.g = paramInt2;
    f();
  }
  
  public boolean onSurfaceTextureDestroyed(SurfaceTexture paramSurfaceTexture) {
    this.e = null;
    this.f = 0;
    this.g = 0;
    g();
    return true;
  }
  
  public void onSurfaceTextureSizeChanged(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2) {
    this.f = paramInt1;
    this.g = paramInt2;
  }
  
  public void onSurfaceTextureUpdated(SurfaceTexture paramSurfaceTexture) {}
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent) {
    Camera camera = this.j;
    if (camera == null)
      return false; 
    Camera.Parameters parameters = camera.getParameters();
    int j = paramMotionEvent.getAction();
    if (paramMotionEvent.getPointerCount() > 1) {
      if (j == 5) {
        this.l = a(paramMotionEvent);
        return true;
      } 
      if (j == 2 && parameters.isZoomSupported()) {
        this.j.cancelAutoFocus();
        b(paramMotionEvent, parameters);
        return true;
      } 
    } else if (j == 1) {
      a(paramMotionEvent, parameters);
    } 
    return true;
  }
  
  class a implements Runnable {
    a(e this$0, int param1Int) {}
    
    public void run() {
      this.d.d();
      e.a(this.d, this.c);
      this.d.c();
    }
  }
  
  class b implements Camera.AutoFocusCallback {
    b(e this$0) {}
    
    public void onAutoFocus(boolean param1Boolean, Camera param1Camera) {
      if (param1Boolean)
        param1Camera.cancelAutoFocus(); 
    }
  }
  
  private class c extends AsyncTask<Void, Void, Void> {
    private byte[] a;
    
    private final Camera b;
    
    c(e this$0, Camera param1Camera, byte[] param1ArrayOfbyte) {
      this.b = param1Camera;
      this.a = param1ArrayOfbyte;
    }
    
    private n a() {
      Camera.Size size = this.b.getParameters().getPreviewSize();
      int i = size.width;
      int j = size.height;
      n n2 = a(i, j, false);
      if (n2 != null)
        return n2; 
      n2 = a(i, j, true);
      if (n2 != null)
        return n2; 
      a(i, j);
      i = size.height;
      j = size.width;
      n n1 = a(i, j, false);
      return (n1 != null) ? n1 : a(i, j, true);
    }
    
    private n a(int param1Int1, int param1Int2, boolean param1Boolean) {
      try {
        e.f.c.c c1;
        k k = new k(this.a, param1Int1, param1Int2, 0, 0, param1Int1, param1Int2, false);
        if (param1Boolean) {
          c1 = new e.f.c.c((e.f.c.b)new j(k.d()));
        } else {
          c1 = new e.f.c.c((e.f.c.b)new j((h)c1));
        } 
        return n;
      } finally {
        Exception exception = null;
        e.a(this.c).a();
      } 
    }
    
    private void a(int param1Int1, int param1Int2) {
      byte[] arrayOfByte = new byte[this.a.length];
      for (int i = 0; i < param1Int1; i++) {
        int j;
        for (j = 0; j < param1Int2; j++) {
          int k = i * param1Int2 + j;
          int m = j * param1Int1 + param1Int1 - i - 1;
          if (k >= 0) {
            byte[] arrayOfByte1 = this.a;
            if (k < arrayOfByte1.length && m >= 0 && m < arrayOfByte1.length)
              arrayOfByte[m] = arrayOfByte1[k]; 
          } 
        } 
      } 
      this.a = arrayOfByte;
    }
    
    protected Void a(Void... param1VarArgs) {
      if (isCancelled())
        return null; 
      try {
        n n = a();
        if (n != null) {
          ReactApplicationContext reactApplicationContext = RCTCameraModule.getReactContextSingleton();
          WritableMap writableMap = Arguments.createMap();
          WritableArray writableArray = Arguments.createArray();
          p[] arrayOfP = n.d();
          if (arrayOfP != null) {
            int j = arrayOfP.length;
            for (int i = 0; i < j; i++) {
              p p = arrayOfP[i];
              WritableMap writableMap1 = Arguments.createMap();
              writableMap1.putString("x", String.valueOf(p.a()));
              writableMap1.putString("y", String.valueOf(p.b()));
              writableArray.pushMap((ReadableMap)writableMap1);
            } 
          } 
          writableMap.putArray("bounds", (ReadableArray)writableArray);
          writableMap.putString("data", n.e());
          writableMap.putString("type", n.a().toString());
          ((DeviceEventManagerModule.RCTDeviceEventEmitter)reactApplicationContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("CameraBarCodeReadAndroid", writableMap);
          e.a(this.c).a();
          e.n = false;
          return null;
        } 
        Exception exception = new Exception();
        throw exception;
      } finally {}
      e.a(this.c).a();
      e.n = false;
      return null;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/lwansbrough/RCTCamera/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */