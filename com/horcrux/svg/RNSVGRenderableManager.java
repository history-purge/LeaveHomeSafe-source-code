package com.horcrux.svg;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import android.graphics.Region;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;

class RNSVGRenderableManager extends ReactContextBaseJavaModule {
  private static final int DEFAULT_BUFFER_SIZE = 4096;
  
  private static final int EOF = -1;
  
  RNSVGRenderableManager(ReactApplicationContext paramReactApplicationContext) {
    super(paramReactApplicationContext);
  }
  
  @ReactMethod(isBlockingSynchronousMethod = true)
  public WritableMap getBBox(int paramInt, ReadableMap paramReadableMap) {
    WritableMap writableMap;
    b0 b0 = RenderableViewManager.getRenderableViewByTag(paramInt);
    if (b0 == null)
      return Arguments.createMap(); 
    boolean bool1 = paramReadableMap.getBoolean("fill");
    boolean bool2 = paramReadableMap.getBoolean("stroke");
    boolean bool3 = paramReadableMap.getBoolean("markers");
    boolean bool4 = paramReadableMap.getBoolean("clipped");
    try {
      b0.c(null, null);
      float f = b0.L;
      b0.i();
      RectF rectF1 = new RectF();
      RectF rectF3 = b0.h0;
      RectF rectF4 = b0.i0;
      RectF rectF5 = b0.j0;
      RectF rectF2 = b0.k0;
      if (bool1 && rectF3 != null)
        rectF1.union(rectF3); 
      if (bool2 && rectF4 != null)
        rectF1.union(rectF4); 
      if (bool3 && rectF5 != null)
        rectF1.union(rectF5); 
      if (bool4 && rectF2 != null)
        rectF1.intersect(rectF2); 
      writableMap = Arguments.createMap();
      writableMap.putDouble("x", (rectF1.left / f));
      writableMap.putDouble("y", (rectF1.top / f));
      writableMap.putDouble("width", (rectF1.width() / f));
      writableMap.putDouble("height", (rectF1.height() / f));
      return writableMap;
    } catch (NullPointerException nullPointerException) {
      writableMap.invalidate();
      return Arguments.createMap();
    } 
  }
  
  @ReactMethod(isBlockingSynchronousMethod = true)
  public WritableMap getCTM(int paramInt) {
    b0 b0 = RenderableViewManager.getRenderableViewByTag(paramInt);
    if (b0 == null)
      return Arguments.createMap(); 
    float f = b0.L;
    Matrix matrix = new Matrix(b0.w);
    matrix.preConcat((b0.getSvgView()).M);
    float[] arrayOfFloat = new float[9];
    matrix.getValues(arrayOfFloat);
    WritableMap writableMap = Arguments.createMap();
    writableMap.putDouble("a", arrayOfFloat[0]);
    writableMap.putDouble("b", arrayOfFloat[3]);
    writableMap.putDouble("c", arrayOfFloat[1]);
    writableMap.putDouble("d", arrayOfFloat[4]);
    writableMap.putDouble("e", (arrayOfFloat[2] / f));
    writableMap.putDouble("f", (arrayOfFloat[5] / f));
    return writableMap;
  }
  
  public String getName() {
    return "RNSVGRenderableManager";
  }
  
  @ReactMethod(isBlockingSynchronousMethod = true)
  public WritableMap getPointAtLength(int paramInt, ReadableMap paramReadableMap) {
    WritableMap writableMap;
    b0 b0 = RenderableViewManager.getRenderableViewByTag(paramInt);
    if (b0 == null)
      return Arguments.createMap(); 
    try {
      Path path = b0.c(null, null);
      PathMeasure pathMeasure = new PathMeasure(path, false);
      float f1 = (float)paramReadableMap.getDouble("length");
      float f2 = b0.L;
      float[] arrayOfFloat1 = new float[2];
      float[] arrayOfFloat2 = new float[2];
      pathMeasure.getPosTan(Math.max(0.0F, Math.min(f1, pathMeasure.getLength())), arrayOfFloat1, arrayOfFloat2);
      double d = Math.atan2(arrayOfFloat2[1], arrayOfFloat2[0]);
      writableMap = Arguments.createMap();
      writableMap.putDouble("x", (arrayOfFloat1[0] / f2));
      writableMap.putDouble("y", (arrayOfFloat1[1] / f2));
      writableMap.putDouble("angle", d);
      return writableMap;
    } catch (NullPointerException nullPointerException) {
      writableMap.invalidate();
      return Arguments.createMap();
    } 
  }
  
  @ReactMethod
  public void getRawResource(String paramString, Promise paramPromise) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual getReactApplicationContext : ()Lcom/facebook/react/bridge/ReactApplicationContext;
    //   4: astore #4
    //   6: aload #4
    //   8: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   11: astore #5
    //   13: aload #5
    //   15: aload #5
    //   17: aload_1
    //   18: ldc 'raw'
    //   20: aload #4
    //   22: invokevirtual getPackageName : ()Ljava/lang/String;
    //   25: invokevirtual getIdentifier : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
    //   28: invokevirtual openRawResource : (I)Ljava/io/InputStream;
    //   31: astore_1
    //   32: new java/io/InputStreamReader
    //   35: dup
    //   36: aload_1
    //   37: getstatic com/facebook/react/common/h.a : Ljava/nio/charset/Charset;
    //   40: invokespecial <init> : (Ljava/io/InputStream;Ljava/nio/charset/Charset;)V
    //   43: astore #4
    //   45: sipush #4096
    //   48: newarray char
    //   50: astore #5
    //   52: new java/lang/StringBuilder
    //   55: dup
    //   56: invokespecial <init> : ()V
    //   59: astore #6
    //   61: aload #4
    //   63: aload #5
    //   65: iconst_0
    //   66: sipush #4096
    //   69: invokevirtual read : ([CII)I
    //   72: istore_3
    //   73: iload_3
    //   74: iconst_m1
    //   75: if_icmpeq -> 91
    //   78: aload #6
    //   80: aload #5
    //   82: iconst_0
    //   83: iload_3
    //   84: invokevirtual append : ([CII)Ljava/lang/StringBuilder;
    //   87: pop
    //   88: goto -> 61
    //   91: aload_2
    //   92: aload #6
    //   94: invokevirtual toString : ()Ljava/lang/String;
    //   97: invokeinterface resolve : (Ljava/lang/Object;)V
    //   102: aload_1
    //   103: invokevirtual close : ()V
    //   106: return
    //   107: astore #4
    //   109: aload_1
    //   110: invokevirtual close : ()V
    //   113: aload #4
    //   115: athrow
    //   116: astore_1
    //   117: aload_1
    //   118: invokevirtual printStackTrace : ()V
    //   121: aload_2
    //   122: aload_1
    //   123: invokeinterface reject : (Ljava/lang/Throwable;)V
    //   128: return
    //   129: astore_1
    //   130: return
    //   131: astore_1
    //   132: goto -> 113
    // Exception table:
    //   from	to	target	type
    //   0	32	116	java/lang/Exception
    //   32	61	107	finally
    //   61	73	107	finally
    //   78	88	107	finally
    //   91	102	107	finally
    //   102	106	129	java/io/IOException
    //   102	106	116	java/lang/Exception
    //   109	113	131	java/io/IOException
    //   109	113	116	java/lang/Exception
    //   113	116	116	java/lang/Exception
  }
  
  @ReactMethod(isBlockingSynchronousMethod = true)
  public WritableMap getScreenCTM(int paramInt) {
    b0 b0 = RenderableViewManager.getRenderableViewByTag(paramInt);
    if (b0 == null)
      return Arguments.createMap(); 
    float[] arrayOfFloat = new float[9];
    b0.w.getValues(arrayOfFloat);
    float f = b0.L;
    WritableMap writableMap = Arguments.createMap();
    writableMap.putDouble("a", arrayOfFloat[0]);
    writableMap.putDouble("b", arrayOfFloat[3]);
    writableMap.putDouble("c", arrayOfFloat[1]);
    writableMap.putDouble("d", arrayOfFloat[4]);
    writableMap.putDouble("e", (arrayOfFloat[2] / f));
    writableMap.putDouble("f", (arrayOfFloat[5] / f));
    return writableMap;
  }
  
  @ReactMethod(isBlockingSynchronousMethod = true)
  public float getTotalLength(int paramInt) {
    b0 b0 = RenderableViewManager.getRenderableViewByTag(paramInt);
    if (b0 == null)
      return 0.0F; 
    try {
      Path path = b0.c(null, null);
      return (new PathMeasure(path, false)).getLength() / b0.L;
    } catch (NullPointerException nullPointerException) {
      b0.invalidate();
      return -1.0F;
    } 
  }
  
  @ReactMethod(isBlockingSynchronousMethod = true)
  public boolean isPointInFill(int paramInt, ReadableMap paramReadableMap) {
    b0 b0 = RenderableViewManager.getRenderableViewByTag(paramInt);
    boolean bool = false;
    if (b0 == null)
      return false; 
    float f = b0.L;
    if (b0.a(new float[] { (float)paramReadableMap.getDouble("x") * f, (float)paramReadableMap.getDouble("y") * f }) != -1)
      bool = true; 
    return bool;
  }
  
  @ReactMethod(isBlockingSynchronousMethod = true)
  public boolean isPointInStroke(int paramInt, ReadableMap paramReadableMap) {
    b0 b0 = RenderableViewManager.getRenderableViewByTag(paramInt);
    boolean bool = false;
    if (b0 == null)
      return false; 
    try {
      b0.c(null, null);
      b0.i();
      float f = b0.L;
      double d2 = paramReadableMap.getDouble("x");
      double d1 = f;
      Double.isNaN(d1);
      paramInt = (int)(d2 * d1);
      d2 = paramReadableMap.getDouble("y");
      Double.isNaN(d1);
      int i = (int)(d2 * d1);
      Region region = b0.n0;
      boolean bool1 = bool;
      if (region != null) {
        bool1 = bool;
        if (region.contains(paramInt, i))
          bool1 = true; 
      } 
      return bool1;
    } catch (NullPointerException nullPointerException) {
      b0.invalidate();
      return false;
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/horcrux/svg/RNSVGRenderableManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */