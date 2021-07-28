package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Base64;
import android.view.View;
import android.view.ViewParent;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.c;
import com.facebook.react.uimanager.e1.a;
import com.facebook.react.uimanager.v;
import com.facebook.react.uimanager.w;
import com.facebook.react.views.view.f;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;

@SuppressLint({"ViewConstructor"})
public class f0 extends f implements v, w {
  private final Map<String, x0> A = new HashMap<String, x0>();
  
  private final Map<String, a> B = new HashMap<String, a>();
  
  private Canvas C;
  
  private final float D = (c.a()).density;
  
  private float E;
  
  private float F;
  
  private float G;
  
  private float H;
  
  private c0 I;
  
  private c0 J;
  
  private String K;
  
  private int L;
  
  final Matrix M = new Matrix();
  
  private boolean N = true;
  
  private boolean O = false;
  
  int P = 0;
  
  private Bitmap u;
  
  private Runnable v = null;
  
  private boolean w = false;
  
  private final Map<String, x0> x = new HashMap<String, x0>();
  
  private final Map<String, x0> y = new HashMap<String, x0>();
  
  private final Map<String, x0> z = new HashMap<String, x0>();
  
  public f0(ReactContext paramReactContext) {
    super((Context)paramReactContext);
  }
  
  private int c(float paramFloat1, float paramFloat2) {
    int j;
    if (!this.w || !this.N)
      return getId(); 
    float[] arrayOfFloat = new float[2];
    arrayOfFloat[0] = paramFloat1;
    arrayOfFloat[1] = paramFloat2;
    this.M.mapPoints(arrayOfFloat);
    int k = getChildCount() - 1;
    int i = -1;
    while (true) {
      j = i;
      if (k >= 0) {
        View view = getChildAt(k);
        if (view instanceof x0) {
          i = ((x0)view).a(arrayOfFloat);
        } else if (view instanceof f0) {
          i = ((f0)view).c(paramFloat1, paramFloat2);
        } 
        if (i != -1) {
          j = i;
          break;
        } 
        k--;
        continue;
      } 
      break;
    } 
    i = j;
    if (j == -1)
      i = getId(); 
    return i;
  }
  
  private RectF getViewBox() {
    float f1 = this.E;
    float f2 = this.D;
    float f3 = this.F;
    return new RectF(f1 * f2, f3 * f2, (f1 + this.G) * f2, (f3 + this.H) * f2);
  }
  
  private void i() {
    if (!this.O)
      return; 
    int i = 0;
    this.O = false;
    while (i < getChildCount()) {
      View view = getChildAt(i);
      if (view instanceof x0)
        ((x0)view).f(); 
      i++;
    } 
  }
  
  private Bitmap j() {
    boolean bool2 = true;
    this.O = true;
    float f1 = getWidth();
    float f2 = getHeight();
    boolean bool1 = bool2;
    if (!Float.isNaN(f1)) {
      bool1 = bool2;
      if (!Float.isNaN(f2)) {
        bool1 = bool2;
        if (f1 >= 1.0F) {
          bool1 = bool2;
          if (f2 >= 1.0F)
            if (Math.log10(f1) + Math.log10(f2) > 42.0D) {
              bool1 = bool2;
            } else {
              bool1 = false;
            }  
        } 
      } 
    } 
    if (bool1)
      return null; 
    Bitmap bitmap = Bitmap.createBitmap((int)f1, (int)f2, Bitmap.Config.ARGB_8888);
    a(new Canvas(bitmap));
    return bitmap;
  }
  
  public int a(float paramFloat1, float paramFloat2) {
    return c(paramFloat1, paramFloat2);
  }
  
  a a(String paramString) {
    return this.B.get(paramString);
  }
  
  String a(int paramInt1, int paramInt2) {
    Bitmap bitmap = Bitmap.createBitmap(paramInt1, paramInt2, Bitmap.Config.ARGB_8888);
    i();
    a(new Canvas(bitmap));
    i();
    invalidate();
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
    bitmap.recycle();
    return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
  }
  
  void a(Canvas paramCanvas) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: iconst_1
    //   4: putfield O : Z
    //   7: aload_0
    //   8: aload_1
    //   9: putfield C : Landroid/graphics/Canvas;
    //   12: new android/graphics/Matrix
    //   15: dup
    //   16: invokespecial <init> : ()V
    //   19: astore #10
    //   21: aload_0
    //   22: getfield K : Ljava/lang/String;
    //   25: ifnull -> 171
    //   28: aload_0
    //   29: invokespecial getViewBox : ()Landroid/graphics/RectF;
    //   32: astore #10
    //   34: aload_1
    //   35: invokevirtual getWidth : ()I
    //   38: i2f
    //   39: fstore #5
    //   41: aload_1
    //   42: invokevirtual getHeight : ()I
    //   45: i2f
    //   46: fstore #4
    //   48: aload_0
    //   49: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   52: instanceof com/horcrux/svg/x0
    //   55: istore #9
    //   57: fload #5
    //   59: fstore_3
    //   60: fload #4
    //   62: fstore_2
    //   63: iload #9
    //   65: ifeq -> 110
    //   68: aload_0
    //   69: getfield I : Lcom/horcrux/svg/c0;
    //   72: fload #5
    //   74: f2d
    //   75: dconst_0
    //   76: aload_0
    //   77: getfield D : F
    //   80: f2d
    //   81: ldc2_w 12.0
    //   84: invokestatic a : (Lcom/horcrux/svg/c0;DDDD)D
    //   87: d2f
    //   88: fstore_3
    //   89: aload_0
    //   90: getfield J : Lcom/horcrux/svg/c0;
    //   93: fload #4
    //   95: f2d
    //   96: dconst_0
    //   97: aload_0
    //   98: getfield D : F
    //   101: f2d
    //   102: ldc2_w 12.0
    //   105: invokestatic a : (Lcom/horcrux/svg/c0;DDDD)D
    //   108: d2f
    //   109: fstore_2
    //   110: new android/graphics/RectF
    //   113: dup
    //   114: fconst_0
    //   115: fconst_0
    //   116: fload_3
    //   117: fload_2
    //   118: invokespecial <init> : (FFFF)V
    //   121: astore #11
    //   123: iload #9
    //   125: ifeq -> 135
    //   128: aload_1
    //   129: aload #11
    //   131: invokevirtual clipRect : (Landroid/graphics/RectF;)Z
    //   134: pop
    //   135: aload #10
    //   137: aload #11
    //   139: aload_0
    //   140: getfield K : Ljava/lang/String;
    //   143: aload_0
    //   144: getfield L : I
    //   147: invokestatic a : (Landroid/graphics/RectF;Landroid/graphics/RectF;Ljava/lang/String;I)Landroid/graphics/Matrix;
    //   150: astore #10
    //   152: aload_0
    //   153: aload #10
    //   155: aload_0
    //   156: getfield M : Landroid/graphics/Matrix;
    //   159: invokevirtual invert : (Landroid/graphics/Matrix;)Z
    //   162: putfield N : Z
    //   165: aload_1
    //   166: aload #10
    //   168: invokevirtual concat : (Landroid/graphics/Matrix;)V
    //   171: new android/graphics/Paint
    //   174: dup
    //   175: invokespecial <init> : ()V
    //   178: astore #11
    //   180: aload #11
    //   182: sipush #385
    //   185: invokevirtual setFlags : (I)V
    //   188: aload #11
    //   190: getstatic android/graphics/Typeface.DEFAULT : Landroid/graphics/Typeface;
    //   193: invokevirtual setTypeface : (Landroid/graphics/Typeface;)Landroid/graphics/Typeface;
    //   196: pop
    //   197: iconst_0
    //   198: istore #8
    //   200: iconst_0
    //   201: istore #7
    //   203: iload #8
    //   205: istore #6
    //   207: iload #7
    //   209: aload_0
    //   210: invokevirtual getChildCount : ()I
    //   213: if_icmpge -> 243
    //   216: aload_0
    //   217: iload #7
    //   219: invokevirtual getChildAt : (I)Landroid/view/View;
    //   222: astore #12
    //   224: aload #12
    //   226: instanceof com/horcrux/svg/x0
    //   229: ifeq -> 345
    //   232: aload #12
    //   234: checkcast com/horcrux/svg/x0
    //   237: invokevirtual h : ()V
    //   240: goto -> 345
    //   243: iload #6
    //   245: aload_0
    //   246: invokevirtual getChildCount : ()I
    //   249: if_icmpge -> 331
    //   252: aload_0
    //   253: iload #6
    //   255: invokevirtual getChildAt : (I)Landroid/view/View;
    //   258: astore #12
    //   260: aload #12
    //   262: instanceof com/horcrux/svg/x0
    //   265: ifeq -> 322
    //   268: aload #12
    //   270: checkcast com/horcrux/svg/x0
    //   273: astore #12
    //   275: aload #12
    //   277: aload_1
    //   278: aload #10
    //   280: invokevirtual a : (Landroid/graphics/Canvas;Landroid/graphics/Matrix;)I
    //   283: istore #7
    //   285: aload #12
    //   287: aload_1
    //   288: aload #11
    //   290: fconst_1
    //   291: invokevirtual b : (Landroid/graphics/Canvas;Landroid/graphics/Paint;F)V
    //   294: aload #12
    //   296: aload_1
    //   297: iload #7
    //   299: invokevirtual a : (Landroid/graphics/Canvas;I)V
    //   302: aload #12
    //   304: invokevirtual g : ()Z
    //   307: ifeq -> 322
    //   310: aload_0
    //   311: getfield w : Z
    //   314: ifne -> 322
    //   317: aload_0
    //   318: iconst_1
    //   319: putfield w : Z
    //   322: iload #6
    //   324: iconst_1
    //   325: iadd
    //   326: istore #6
    //   328: goto -> 243
    //   331: aload_0
    //   332: monitorexit
    //   333: return
    //   334: astore_1
    //   335: aload_0
    //   336: monitorexit
    //   337: goto -> 342
    //   340: aload_1
    //   341: athrow
    //   342: goto -> 340
    //   345: iload #7
    //   347: iconst_1
    //   348: iadd
    //   349: istore #7
    //   351: goto -> 203
    // Exception table:
    //   from	to	target	type
    //   2	21	334	finally
    //   21	57	334	finally
    //   68	110	334	finally
    //   110	123	334	finally
    //   128	135	334	finally
    //   135	171	334	finally
    //   171	197	334	finally
    //   207	240	334	finally
    //   243	322	334	finally
  }
  
  void a(a parama, String paramString) {
    this.B.put(paramString, parama);
  }
  
  void a(x0 paramx0, String paramString) {
    this.x.put(paramString, paramx0);
  }
  
  x0 b(String paramString) {
    return this.x.get(paramString);
  }
  
  void b(x0 paramx0, String paramString) {
    this.z.put(paramString, paramx0);
  }
  
  public boolean b(float paramFloat1, float paramFloat2) {
    return true;
  }
  
  x0 c(String paramString) {
    return this.z.get(paramString);
  }
  
  void c(x0 paramx0, String paramString) {
    this.A.put(paramString, paramx0);
  }
  
  x0 d(String paramString) {
    return this.A.get(paramString);
  }
  
  void d(x0 paramx0, String paramString) {
    this.y.put(paramString, paramx0);
  }
  
  x0 e(String paramString) {
    return this.y.get(paramString);
  }
  
  void e() {
    if (!this.w)
      this.w = true; 
  }
  
  boolean f() {
    return this.w;
  }
  
  boolean g() {
    return this.O ^ true;
  }
  
  Rect getCanvasBounds() {
    return this.C.getClipBounds();
  }
  
  String h() {
    Bitmap bitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
    i();
    a(new Canvas(bitmap));
    i();
    invalidate();
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
    bitmap.recycle();
    return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
  }
  
  public void invalidate() {
    super.invalidate();
    ViewParent viewParent = getParent();
    if (viewParent instanceof x0) {
      if (!this.O)
        return; 
      this.O = false;
      ((x0)viewParent).getSvgView().invalidate();
      return;
    } 
    Bitmap bitmap = this.u;
    if (bitmap != null)
      bitmap.recycle(); 
    this.u = null;
  }
  
  protected void onDraw(Canvas paramCanvas) {
    if (getParent() instanceof x0)
      return; 
    super.onDraw(paramCanvas);
    if (this.u == null)
      this.u = j(); 
    Bitmap bitmap = this.u;
    if (bitmap != null) {
      paramCanvas.drawBitmap(bitmap, 0.0F, 0.0F, null);
      Runnable runnable = this.v;
      if (runnable != null) {
        runnable.run();
        this.v = null;
      } 
    } 
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    invalidate();
  }
  
  @a(name = "align")
  public void setAlign(String paramString) {
    this.K = paramString;
    invalidate();
    i();
  }
  
  @a(name = "bbHeight")
  public void setBbHeight(Dynamic paramDynamic) {
    this.J = c0.b(paramDynamic);
    invalidate();
    i();
  }
  
  @a(name = "bbWidth")
  public void setBbWidth(Dynamic paramDynamic) {
    this.I = c0.b(paramDynamic);
    invalidate();
    i();
  }
  
  public void setId(int paramInt) {
    super.setId(paramInt);
    SvgViewManager.setSvgView(paramInt, this);
  }
  
  @a(name = "meetOrSlice")
  public void setMeetOrSlice(int paramInt) {
    this.L = paramInt;
    invalidate();
    i();
  }
  
  @a(name = "minX")
  public void setMinX(float paramFloat) {
    this.E = paramFloat;
    invalidate();
    i();
  }
  
  @a(name = "minY")
  public void setMinY(float paramFloat) {
    this.F = paramFloat;
    invalidate();
    i();
  }
  
  @a(name = "tintColor")
  public void setTintColor(Integer paramInteger) {
    int i;
    if (paramInteger == null) {
      i = 0;
    } else {
      i = paramInteger.intValue();
    } 
    this.P = i;
    invalidate();
    i();
  }
  
  void setToDataUrlTask(Runnable paramRunnable) {
    this.v = paramRunnable;
  }
  
  @a(name = "vbHeight")
  public void setVbHeight(float paramFloat) {
    this.H = paramFloat;
    invalidate();
    i();
  }
  
  @a(name = "vbWidth")
  public void setVbWidth(float paramFloat) {
    this.G = paramFloat;
    invalidate();
    i();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/horcrux/svg/f0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */