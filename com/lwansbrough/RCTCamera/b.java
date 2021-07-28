package com.lwansbrough.RCTCamera;

import android.hardware.Camera;
import android.media.CamcorderProfile;
import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class b {
  private static b h;
  
  private static final b i = new b(853, 480);
  
  private static final b j = new b(1280, 720);
  
  private static final b k = new b(1920, 1080);
  
  private final HashMap<Integer, a> a;
  
  private final HashMap<Integer, Integer> b;
  
  private final Map<Number, Camera> c;
  
  private boolean d;
  
  private List<String> e;
  
  private int f;
  
  private int g;
  
  private b(int paramInt) {
    byte b1 = 0;
    this.d = false;
    this.e = null;
    this.f = -1;
    this.g = 0;
    this.c = new HashMap<Number, Camera>();
    this.a = new HashMap<Integer, a>();
    this.b = new HashMap<Integer, Integer>();
    this.g = paramInt;
    for (paramInt = b1; paramInt < Camera.getNumberOfCameras(); paramInt++) {
      HashMap<Integer, a> hashMap;
      Integer integer;
      a a;
      Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
      Camera.getCameraInfo(paramInt, cameraInfo);
      int i = cameraInfo.facing;
      b1 = 1;
      if (i == 1 && this.a.get(Integer.valueOf(1)) == null) {
        hashMap = this.a;
        integer = Integer.valueOf(1);
        a = new a(this, cameraInfo);
      } else if (((Camera.CameraInfo)a).facing == 0) {
        hashMap = this.a;
        b1 = 2;
        if (hashMap.get(Integer.valueOf(2)) == null) {
          hashMap = this.a;
          integer = Integer.valueOf(2);
          a = new a(this, (Camera.CameraInfo)a);
        } else {
          continue;
        } 
      } else {
        continue;
      } 
      hashMap.put(integer, a);
      this.b.put(Integer.valueOf(b1), Integer.valueOf(paramInt));
      a(b1);
      g(b1);
      continue;
    } 
  }
  
  private Camera.Size b(List<Camera.Size> paramList) {
    Object object;
    Iterator<Camera.Size> iterator = paramList.iterator();
    paramList = null;
    while (iterator.hasNext()) {
      Camera.Size size = iterator.next();
      if (object == null)
        continue; 
      int i = ((Camera.Size)object).width;
      int j = ((Camera.Size)object).height;
      if (size.width * size.height < i * j)
        continue; 
      continue;
      object = SYNTHETIC_LOCAL_VARIABLE_4;
    } 
    return (Camera.Size)object;
  }
  
  private Camera.Size b(List<Camera.Size> paramList, int paramInt1, int paramInt2) {
    Object object;
    Iterator<Camera.Size> iterator = paramList.iterator();
    paramList = null;
    while (iterator.hasNext()) {
      Camera.Size size = iterator.next();
      if (object == null)
        continue; 
      double d = Math.sqrt(Math.pow((((Camera.Size)object).width - paramInt1), 2.0D) + Math.pow((((Camera.Size)object).height - paramInt2), 2.0D));
      if (Math.sqrt(Math.pow((size.width - paramInt1), 2.0D) + Math.pow((size.height - paramInt2), 2.0D)) < d)
        continue; 
      continue;
      object = SYNTHETIC_LOCAL_VARIABLE_6;
    } 
    return (Camera.Size)object;
  }
  
  public static b d() {
    return h;
  }
  
  public static void k(int paramInt) {
    h = new b(paramInt);
  }
  
  public Camera.Size a(List<Camera.Size> paramList, int paramInt1, int paramInt2) {
    Camera.Size size;
    Iterator<Camera.Size> iterator = paramList.iterator();
    paramList = null;
    while (iterator.hasNext()) {
      Camera.Size size1 = iterator.next();
      int i = size1.width;
      if (i <= paramInt1) {
        int j = size1.height;
        if (j <= paramInt2 && (paramList == null || i * j > ((Camera.Size)paramList).width * ((Camera.Size)paramList).height))
          size = size1; 
      } 
    } 
    return size;
  }
  
  public Camera a(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield c : Ljava/util/Map;
    //   6: iload_1
    //   7: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   10: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   15: ifnonnull -> 88
    //   18: aload_0
    //   19: getfield b : Ljava/util/HashMap;
    //   22: iload_1
    //   23: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   26: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   29: astore_2
    //   30: aload_2
    //   31: ifnull -> 88
    //   34: aload_0
    //   35: getfield b : Ljava/util/HashMap;
    //   38: iload_1
    //   39: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   42: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   45: checkcast java/lang/Integer
    //   48: invokevirtual intValue : ()I
    //   51: invokestatic open : (I)Landroid/hardware/Camera;
    //   54: astore_2
    //   55: aload_0
    //   56: getfield c : Ljava/util/Map;
    //   59: iload_1
    //   60: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   63: aload_2
    //   64: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   69: pop
    //   70: aload_0
    //   71: iload_1
    //   72: invokevirtual b : (I)V
    //   75: goto -> 88
    //   78: astore_2
    //   79: ldc 'RCTCamera'
    //   81: ldc 'acquireCameraInstance failed'
    //   83: aload_2
    //   84: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   87: pop
    //   88: aload_0
    //   89: getfield c : Ljava/util/Map;
    //   92: iload_1
    //   93: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   96: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   101: checkcast android/hardware/Camera
    //   104: astore_2
    //   105: aload_0
    //   106: monitorexit
    //   107: aload_2
    //   108: areturn
    //   109: astore_2
    //   110: aload_0
    //   111: monitorexit
    //   112: aload_2
    //   113: athrow
    // Exception table:
    //   from	to	target	type
    //   2	30	109	finally
    //   34	75	78	java/lang/Exception
    //   34	75	109	finally
    //   79	88	109	finally
    //   88	105	109	finally
  }
  
  public List<String> a() {
    return this.e;
  }
  
  protected List<Camera.Size> a(Camera paramCamera) {
    Camera.Parameters parameters = paramCamera.getParameters();
    List<Camera.Size> list = parameters.getSupportedVideoSizes();
    return (list != null) ? list : parameters.getSupportedPreviewSizes();
  }
  
  public void a(int paramInt1, int paramInt2) {
    Camera camera = this.c.get(Integer.valueOf(paramInt1));
    if (camera == null)
      return; 
    a a = this.a.get(Integer.valueOf(paramInt1));
    Camera.CameraInfo cameraInfo = a.a;
    paramInt1 = cameraInfo.orientation;
    int i = cameraInfo.facing;
    paramInt2 *= 90;
    if (i == 1) {
      paramInt1 += paramInt2;
    } else {
      paramInt1 = paramInt1 - paramInt2 + 360;
    } 
    a.b = paramInt1 % 360;
    Camera.Parameters parameters = camera.getParameters();
    parameters.setRotation(a.b);
    try {
      camera.setParameters(parameters);
      return;
    } catch (Exception exception) {
      exception.printStackTrace();
      return;
    } 
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3) {
    a a = this.a.get(Integer.valueOf(paramInt1));
    if (a == null)
      return; 
    a.e = paramInt2;
    a.f = paramInt3;
  }
  
  public void a(int paramInt, String paramString) {
    b b3;
    Camera.Size size3;
    b b2;
    Camera.Size size2;
    b b1;
    Camera.Size size1;
    Camera camera = a(paramInt);
    if (camera == null)
      return; 
    Camera.Parameters parameters = camera.getParameters();
    String str = null;
    List<Camera.Size> list = parameters.getSupportedPictureSizes();
    paramInt = -1;
    switch (paramString.hashCode()) {
      case 46737913:
        if (paramString.equals("1080p"))
          paramInt = 6; 
        break;
      case 3202466:
        if (paramString.equals("high"))
          paramInt = 2; 
        break;
      case 1688155:
        if (paramString.equals("720p"))
          paramInt = 5; 
        break;
      case 1604548:
        if (paramString.equals("480p"))
          paramInt = 4; 
        break;
      case 107348:
        if (paramString.equals("low"))
          paramInt = 0; 
        break;
      case -318184504:
        if (paramString.equals("preview"))
          paramInt = 3; 
        break;
      case -1078030475:
        if (paramString.equals("medium"))
          paramInt = 1; 
        break;
    } 
    switch (paramInt) {
      default:
        paramString = str;
        break;
      case 6:
        b3 = k;
        size3 = a(list, b3.a, b3.b);
        break;
      case 5:
        b2 = j;
        size2 = a(list, b2.a, b2.b);
        break;
      case 4:
        b1 = i;
        size1 = a(list, b1.a, b1.b);
        break;
      case 3:
        size1 = a(parameters.getSupportedPreviewSizes(), 2147483647, 2147483647);
        size1 = b(parameters.getSupportedPictureSizes(), size1.width, size1.height);
        break;
      case 2:
        size1 = a(parameters.getSupportedPictureSizes(), 2147483647, 2147483647);
        break;
      case 1:
        size1 = list.get(list.size() / 2);
        break;
      case 0:
        size1 = b(list);
        break;
    } 
    if (size1 != null) {
      parameters.setPictureSize(size1.width, size1.height);
      try {
        camera.setParameters(parameters);
        return;
      } catch (RuntimeException runtimeException) {
        Log.e("RCTCamera", "setParameters failed", runtimeException);
      } 
    } 
  }
  
  public void a(List<String> paramList) {
    this.e = paramList;
  }
  
  public void a(boolean paramBoolean) {
    this.d = paramBoolean;
  }
  
  public int b() {
    return this.f;
  }
  
  public CamcorderProfile b(int paramInt, String paramString) {
    CamcorderProfile camcorderProfile;
    Camera.Size<Camera.Size> size;
    Camera camera = a(paramInt);
    if (camera == null)
      return null; 
    List<Camera.Size> list = a(camera);
    byte b1 = -1;
    switch (paramString.hashCode()) {
      case 46737913:
        if (paramString.equals("1080p"))
          b1 = 5; 
        break;
      case 3202466:
        if (paramString.equals("high"))
          b1 = 2; 
        break;
      case 1688155:
        if (paramString.equals("720p"))
          b1 = 4; 
        break;
      case 1604548:
        if (paramString.equals("480p"))
          b1 = 3; 
        break;
      case 107348:
        if (paramString.equals("low"))
          b1 = 0; 
        break;
      case -1078030475:
        if (paramString.equals("medium"))
          b1 = 1; 
        break;
    } 
    if (b1 != 0) {
      if (b1 != 1) {
        if (b1 != 2) {
          if (b1 != 3) {
            if (b1 != 4) {
              String str;
              if (b1 != 5) {
                paramString = null;
                str = paramString;
              } else {
                b b2 = k;
                size = a((List<Camera.Size>)str, b2.a, b2.b);
                camcorderProfile = CamcorderProfile.get(((Integer)this.b.get(Integer.valueOf(paramInt))).intValue(), 6);
              } 
            } else {
              b b2 = j;
              size = a((List<Camera.Size>)size, b2.a, b2.b);
              camcorderProfile = CamcorderProfile.get(((Integer)this.b.get(Integer.valueOf(paramInt))).intValue(), 5);
            } 
          } else {
            b b2 = i;
            size = a((List<Camera.Size>)size, b2.a, b2.b);
            camcorderProfile = CamcorderProfile.get(((Integer)this.b.get(Integer.valueOf(paramInt))).intValue(), 4);
          } 
        } else {
          size = a((List<Camera.Size>)size, 2147483647, 2147483647);
          camcorderProfile = CamcorderProfile.get(((Integer)this.b.get(Integer.valueOf(paramInt))).intValue(), 1);
        } 
      } else {
        size = size.get(size.size() / 2);
        camcorderProfile = CamcorderProfile.get(((Integer)this.b.get(Integer.valueOf(paramInt))).intValue(), 5);
      } 
    } else {
      size = b((List<Camera.Size>)size);
      camcorderProfile = CamcorderProfile.get(((Integer)this.b.get(Integer.valueOf(paramInt))).intValue(), 4);
    } 
    if (camcorderProfile == null)
      return null; 
    if (size != null) {
      camcorderProfile.videoFrameHeight = size.height;
      camcorderProfile.videoFrameWidth = size.width;
    } 
    return camcorderProfile;
  }
  
  public void b(int paramInt) {
    Camera camera = this.c.get(Integer.valueOf(paramInt));
    if (camera == null)
      return; 
    a a = this.a.get(Integer.valueOf(paramInt));
    Camera.CameraInfo cameraInfo = a.a;
    paramInt = cameraInfo.orientation;
    if (cameraInfo.facing == 1) {
      int k = this.g;
      i = (k * 90 + paramInt) % 360;
      paramInt = (720 - paramInt - k * 90) % 360;
    } else {
      i = (paramInt - this.g * 90 + 360) % 360;
      paramInt = i;
    } 
    a.b = i;
    i(i);
    camera.setDisplayOrientation(paramInt);
    Camera.Parameters parameters = camera.getParameters();
    parameters.setRotation(a.b);
    Camera.Size size = a(parameters.getSupportedPreviewSizes(), 2147483647, 2147483647);
    paramInt = size.width;
    int i = size.height;
    parameters.setPreviewSize(paramInt, i);
    try {
      camera.setParameters(parameters);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
    int j = a.b;
    if (j == 0 || j == 180) {
      a.c = paramInt;
      a.d = i;
      return;
    } 
    a.c = i;
    a.d = paramInt;
  }
  
  public void b(int paramInt1, int paramInt2) {
    Camera camera = this.c.get(Integer.valueOf(paramInt1));
    if (camera == null)
      return; 
    Camera.Parameters parameters = camera.getParameters();
    boolean bool = true;
    if (paramInt2 != 1)
      bool = false; 
    parameters.setRecordingHint(bool);
    try {
      camera.setParameters(parameters);
      return;
    } catch (RuntimeException runtimeException) {
      Log.e("RCTCamera", "setParameters failed", runtimeException);
      return;
    } 
  }
  
  public int c(int paramInt) {
    a a = this.a.get(Integer.valueOf(paramInt));
    return (a == null) ? 0 : a.d;
  }
  
  public void c(int paramInt1, int paramInt2) {
    Camera camera = a(paramInt1);
    if (camera == null)
      return; 
    Camera.Parameters parameters = camera.getParameters();
    String str = parameters.getFlashMode();
    if (paramInt2 != 0) {
      if (paramInt2 != 1) {
        if (paramInt2 == 2)
          str = "auto"; 
      } else {
        str = "on";
      } 
    } else {
      str = "off";
    } 
    List list = parameters.getSupportedFlashModes();
    if (list != null && list.contains(str)) {
      parameters.setFlashMode(str);
      try {
        camera.setParameters(parameters);
        return;
      } catch (RuntimeException runtimeException) {
        Log.e("RCTCamera", "setParameters failed", runtimeException);
      } 
    } 
  }
  
  public boolean c() {
    return this.d;
  }
  
  public int d(int paramInt) {
    a a = this.a.get(Integer.valueOf(paramInt));
    return (a == null) ? 0 : a.f;
  }
  
  public void d(int paramInt1, int paramInt2) {
    Camera camera = a(paramInt1);
    if (camera == null)
      return; 
    Camera.Parameters parameters = camera.getParameters();
    String str = parameters.getFlashMode();
    if (paramInt2 != 0) {
      if (paramInt2 == 1)
        str = "torch"; 
    } else {
      str = "off";
    } 
    List list = parameters.getSupportedFlashModes();
    if (list != null && list.contains(str)) {
      parameters.setFlashMode(str);
      try {
        camera.setParameters(parameters);
        return;
      } catch (RuntimeException runtimeException) {
        Log.e("RCTCamera", "setParameters failed", runtimeException);
      } 
    } 
  }
  
  public int e(int paramInt) {
    a a = this.a.get(Integer.valueOf(paramInt));
    return (a == null) ? 0 : a.e;
  }
  
  public void e(int paramInt1, int paramInt2) {
    Camera camera = a(paramInt1);
    if (camera == null)
      return; 
    Camera.Parameters parameters = camera.getParameters();
    paramInt1 = parameters.getMaxZoom();
    if (parameters.isZoomSupported() && paramInt2 >= 0 && paramInt2 < paramInt1) {
      parameters.setZoom(paramInt2);
      try {
        camera.setParameters(parameters);
        return;
      } catch (RuntimeException runtimeException) {
        Log.e("RCTCamera", "setParameters failed", runtimeException);
      } 
    } 
  }
  
  public int f(int paramInt) {
    a a = this.a.get(Integer.valueOf(paramInt));
    return (a == null) ? 0 : a.c;
  }
  
  public void g(int paramInt) {
    Camera camera = this.c.get(Integer.valueOf(paramInt));
    if (camera != null) {
      this.c.remove(Integer.valueOf(paramInt));
      camera.release();
    } 
  }
  
  public void h(int paramInt) {
    this.g = paramInt;
    b(1);
    b(2);
  }
  
  public void i(int paramInt) {}
  
  public void j(int paramInt) {
    if (this.f == paramInt)
      return; 
    this.f = paramInt;
    b(1);
    b(2);
  }
  
  private class a {
    public final Camera.CameraInfo a;
    
    public int b = 0;
    
    public int c = -1;
    
    public int d = -1;
    
    public int e = -1;
    
    public int f = -1;
    
    public a(b this$0, Camera.CameraInfo param1CameraInfo) {
      this.a = param1CameraInfo;
    }
  }
  
  private static class b {
    public int a;
    
    public int b;
    
    public b(int param1Int1, int param1Int2) {
      this.a = param1Int1;
      this.b = param1Int2;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/lwansbrough/RCTCamera/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */