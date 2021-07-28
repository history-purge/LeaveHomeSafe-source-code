package com.horcrux.svg;

import android.graphics.Matrix;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.a0;
import com.facebook.react.uimanager.i;
import com.facebook.react.uimanager.j;
import com.facebook.react.uimanager.k0;
import com.facebook.react.uimanager.m0;
import com.facebook.react.uimanager.q;
import com.facebook.react.uimanager.r;
import java.lang.reflect.Array;
import java.util.Locale;

class RenderableViewManager extends ViewGroupManager<x0> {
  private static final float CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER = 5.0F;
  
  private static final double EPSILON = 1.0E-5D;
  
  private static final int PERSPECTIVE_ARRAY_INVERTED_CAMERA_DISTANCE_INDEX = 2;
  
  private static final SparseArray<b0> mTagToRenderableView;
  
  private static final SparseArray<Runnable> mTagToRunnable;
  
  private static final c sMatrixDecompositionContext = new c();
  
  private static final double[] sTransformDecompositionArray = new double[16];
  
  private final String mClassName;
  
  private final e svgClass;
  
  static {
    mTagToRenderableView = new SparseArray();
    mTagToRunnable = new SparseArray();
  }
  
  private RenderableViewManager(e parame) {
    this.svgClass = parame;
    this.mClassName = parame.toString();
  }
  
  private static void decomposeMatrix() {
    c c1 = sMatrixDecompositionContext;
    double[] arrayOfDouble5 = c1.f;
    double[] arrayOfDouble1 = c1.g;
    double[] arrayOfDouble3 = c1.h;
    double[] arrayOfDouble6 = c1.i;
    double[] arrayOfDouble2 = c1.j;
    if (isZero(sTransformDecompositionArray[15]))
      return; 
    double[][] arrayOfDouble7 = (double[][])Array.newInstance(double.class, new int[] { 4, 4 });
    double[] arrayOfDouble8 = new double[16];
    int i;
    for (i = 0; i < 4; i++) {
      int j;
      for (j = 0; j < 4; j++) {
        double[] arrayOfDouble = sTransformDecompositionArray;
        int k = i * 4 + j;
        double d = arrayOfDouble[k] / arrayOfDouble[15];
        arrayOfDouble7[i][j] = d;
        if (j == 3)
          d = 0.0D; 
        arrayOfDouble8[k] = d;
      } 
    } 
    arrayOfDouble8[15] = 1.0D;
    if (isZero(j.a(arrayOfDouble8)))
      return; 
    if (!isZero(arrayOfDouble7[0][3]) || !isZero(arrayOfDouble7[1][3]) || !isZero(arrayOfDouble7[2][3])) {
      double d1 = arrayOfDouble7[0][3];
      double d2 = arrayOfDouble7[1][3];
      double d3 = arrayOfDouble7[2][3];
      double d4 = arrayOfDouble7[3][3];
      arrayOfDouble8 = j.d(j.b(arrayOfDouble8));
      j.b(new double[] { d1, d2, d3, d4 }, arrayOfDouble8, arrayOfDouble5);
    } else {
      arrayOfDouble5[2] = 0.0D;
      arrayOfDouble5[1] = 0.0D;
      arrayOfDouble5[0] = 0.0D;
      arrayOfDouble5[3] = 1.0D;
    } 
    System.arraycopy(arrayOfDouble7[3], 0, arrayOfDouble6, 0, 3);
    double[][] arrayOfDouble4 = (double[][])Array.newInstance(double.class, new int[] { 3, 3 });
    for (i = 0; i < 3; i++) {
      arrayOfDouble4[i][0] = arrayOfDouble7[i][0];
      arrayOfDouble4[i][1] = arrayOfDouble7[i][1];
      arrayOfDouble4[i][2] = arrayOfDouble7[i][2];
    } 
    arrayOfDouble1[0] = j.e(arrayOfDouble4[0]);
    arrayOfDouble4[0] = j.i(arrayOfDouble4[0], arrayOfDouble1[0]);
    arrayOfDouble3[0] = j.b(arrayOfDouble4[0], arrayOfDouble4[1]);
    arrayOfDouble4[1] = j.a(arrayOfDouble4[1], arrayOfDouble4[0], 1.0D, -arrayOfDouble3[0]);
    arrayOfDouble3[0] = j.b(arrayOfDouble4[0], arrayOfDouble4[1]);
    arrayOfDouble4[1] = j.a(arrayOfDouble4[1], arrayOfDouble4[0], 1.0D, -arrayOfDouble3[0]);
    arrayOfDouble1[1] = j.e(arrayOfDouble4[1]);
    arrayOfDouble4[1] = j.i(arrayOfDouble4[1], arrayOfDouble1[1]);
    arrayOfDouble3[0] = arrayOfDouble3[0] / arrayOfDouble1[1];
    arrayOfDouble3[1] = j.b(arrayOfDouble4[0], arrayOfDouble4[2]);
    arrayOfDouble4[2] = j.a(arrayOfDouble4[2], arrayOfDouble4[0], 1.0D, -arrayOfDouble3[1]);
    arrayOfDouble3[2] = j.b(arrayOfDouble4[1], arrayOfDouble4[2]);
    arrayOfDouble4[2] = j.a(arrayOfDouble4[2], arrayOfDouble4[1], 1.0D, -arrayOfDouble3[2]);
    arrayOfDouble1[2] = j.e(arrayOfDouble4[2]);
    arrayOfDouble4[2] = j.i(arrayOfDouble4[2], arrayOfDouble1[2]);
    arrayOfDouble3[1] = arrayOfDouble3[1] / arrayOfDouble1[2];
    arrayOfDouble3[2] = arrayOfDouble3[2] / arrayOfDouble1[2];
    arrayOfDouble3 = j.a(arrayOfDouble4[1], arrayOfDouble4[2]);
    if (j.b(arrayOfDouble4[0], arrayOfDouble3) < 0.0D)
      for (i = 0; i < 3; i++) {
        arrayOfDouble1[i] = arrayOfDouble1[i] * -1.0D;
        arrayOfDouble3 = arrayOfDouble4[i];
        arrayOfDouble3[0] = arrayOfDouble3[0] * -1.0D;
        arrayOfDouble3 = arrayOfDouble4[i];
        arrayOfDouble3[1] = arrayOfDouble3[1] * -1.0D;
        arrayOfDouble3 = arrayOfDouble4[i];
        arrayOfDouble3[2] = arrayOfDouble3[2] * -1.0D;
      }  
    arrayOfDouble2[0] = j.c(-Math.atan2(arrayOfDouble4[2][1], arrayOfDouble4[2][2]) * 57.29577951308232D);
    arrayOfDouble2[1] = j.c(-Math.atan2(-arrayOfDouble4[2][0], Math.sqrt(arrayOfDouble4[2][1] * arrayOfDouble4[2][1] + arrayOfDouble4[2][2] * arrayOfDouble4[2][2])) * 57.29577951308232D);
    arrayOfDouble2[2] = j.c(-Math.atan2(arrayOfDouble4[1][0], arrayOfDouble4[0][0]) * 57.29577951308232D);
  }
  
  static b0 getRenderableViewByTag(int paramInt) {
    return (b0)mTagToRenderableView.get(paramInt);
  }
  
  private void invalidateSvgView(x0 paramx0) {
    f0 f0 = paramx0.getSvgView();
    if (f0 != null)
      f0.invalidate(); 
    if (paramx0 instanceof u0)
      ((u0)paramx0).r().f(); 
  }
  
  private static boolean isZero(double paramDouble) {
    return (!Double.isNaN(paramDouble) && Math.abs(paramDouble) < 1.0E-5D);
  }
  
  private static void resetTransformProperty(View paramView) {
    paramView.setTranslationX(0.0F);
    paramView.setTranslationY(0.0F);
    paramView.setRotation(0.0F);
    paramView.setRotationX(0.0F);
    paramView.setRotationY(0.0F);
    paramView.setScaleX(1.0F);
    paramView.setScaleY(1.0F);
    paramView.setCameraDistance(0.0F);
  }
  
  static void runWhenViewIsAvailable(int paramInt, Runnable paramRunnable) {
    mTagToRunnable.put(paramInt, paramRunnable);
  }
  
  static void setRenderableView(int paramInt, b0 paramb0) {
    mTagToRenderableView.put(paramInt, paramb0);
    Runnable runnable = (Runnable)mTagToRunnable.get(paramInt);
    if (runnable != null) {
      runnable.run();
      mTagToRunnable.delete(paramInt);
    } 
  }
  
  private static void setTransformProperty(View paramView, ReadableArray paramReadableArray) {
    m0.a(paramReadableArray, sTransformDecompositionArray);
    decomposeMatrix();
    paramView.setTranslationX(q.b((float)sMatrixDecompositionContext.i[0]));
    paramView.setTranslationY(q.b((float)sMatrixDecompositionContext.i[1]));
    paramView.setRotation((float)sMatrixDecompositionContext.j[2]);
    paramView.setRotationX((float)sMatrixDecompositionContext.j[0]);
    paramView.setRotationY((float)sMatrixDecompositionContext.j[1]);
    paramView.setScaleX((float)sMatrixDecompositionContext.g[0]);
    paramView.setScaleY((float)sMatrixDecompositionContext.g[1]);
    double[] arrayOfDouble = sMatrixDecompositionContext.f;
    if (arrayOfDouble.length > 2) {
      float f2 = (float)arrayOfDouble[2];
      float f1 = f2;
      if (f2 == 0.0F)
        f1 = 7.8125E-4F; 
      f1 = -1.0F / f1;
      f2 = (com.facebook.react.uimanager.c.a()).density;
      paramView.setCameraDistance(f2 * f2 * f1 * 5.0F);
    } 
  }
  
  protected void addEventEmitters(k0 paramk0, x0 paramx0) {
    super.addEventEmitters(paramk0, (View)paramx0);
    paramx0.setOnHierarchyChangeListener(new a(this));
  }
  
  public i createShadowNodeInstance() {
    return new d(this);
  }
  
  protected x0 createViewInstance(k0 paramk0) {
    StringBuilder stringBuilder;
    switch (b.b[this.svgClass.ordinal()]) {
      default:
        stringBuilder = new StringBuilder();
        stringBuilder.append("Unexpected type ");
        stringBuilder.append(this.svgClass.toString());
        throw new IllegalStateException(stringBuilder.toString());
      case 20:
        return new i((ReactContext)stringBuilder);
      case 19:
        return new p((ReactContext)stringBuilder);
      case 18:
        return new q((ReactContext)stringBuilder);
      case 17:
        return new u((ReactContext)stringBuilder);
      case 16:
        return new z((ReactContext)stringBuilder);
      case 15:
        return new o((ReactContext)stringBuilder);
      case 14:
        return new g0((ReactContext)stringBuilder);
      case 13:
        return new v0((ReactContext)stringBuilder);
      case 12:
        return new e((ReactContext)stringBuilder);
      case 11:
        return new c((ReactContext)stringBuilder);
      case 10:
        return new m((ReactContext)stringBuilder);
      case 9:
        return new i0((ReactContext)stringBuilder);
      case 8:
        return new h0((ReactContext)stringBuilder);
      case 7:
        return new u0((ReactContext)stringBuilder);
      case 6:
        return new a0((ReactContext)stringBuilder);
      case 5:
        return new n((ReactContext)stringBuilder);
      case 4:
        return new g((ReactContext)stringBuilder);
      case 3:
        return new b((ReactContext)stringBuilder);
      case 2:
        return new t((ReactContext)stringBuilder);
      case 1:
        break;
    } 
    return new l((ReactContext)stringBuilder);
  }
  
  public String getName() {
    return this.mClassName;
  }
  
  public Class<d> getShadowNodeClass() {
    return d.class;
  }
  
  protected void onAfterUpdateTransaction(x0 paramx0) {
    super.onAfterUpdateTransaction((View)paramx0);
    invalidateSvgView(paramx0);
  }
  
  public void onDropViewInstance(x0 paramx0) {
    super.onDropViewInstance((View)paramx0);
    mTagToRenderableView.remove(paramx0.getId());
  }
  
  @com.facebook.react.uimanager.e1.a(name = "clipPath")
  public void setClipPath(x0 paramx0, String paramString) {
    paramx0.setClipPath(paramString);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "clipRule")
  public void setClipRule(x0 paramx0, int paramInt) {
    paramx0.setClipRule(paramInt);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "display")
  public void setDisplay(x0 paramx0, String paramString) {
    paramx0.setDisplay(paramString);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "fill")
  public void setFill(b0 paramb0, Dynamic paramDynamic) {
    paramb0.setFill(paramDynamic);
  }
  
  @com.facebook.react.uimanager.e1.a(defaultFloat = 1.0F, name = "fillOpacity")
  public void setFillOpacity(b0 paramb0, float paramFloat) {
    paramb0.setFillOpacity(paramFloat);
  }
  
  @com.facebook.react.uimanager.e1.a(defaultInt = 1, name = "fillRule")
  public void setFillRule(b0 paramb0, int paramInt) {
    paramb0.setFillRule(paramInt);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "markerEnd")
  public void setMarkerEnd(x0 paramx0, String paramString) {
    paramx0.setMarkerEnd(paramString);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "markerMid")
  public void setMarkerMid(x0 paramx0, String paramString) {
    paramx0.setMarkerMid(paramString);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "markerStart")
  public void setMarkerStart(x0 paramx0, String paramString) {
    paramx0.setMarkerStart(paramString);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "mask")
  public void setMask(x0 paramx0, String paramString) {
    paramx0.setMask(paramString);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "matrix")
  public void setMatrix(x0 paramx0, Dynamic paramDynamic) {
    paramx0.setMatrix(paramDynamic);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "name")
  public void setName(x0 paramx0, String paramString) {
    paramx0.setName(paramString);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "onLayout")
  public void setOnLayout(x0 paramx0, boolean paramBoolean) {
    paramx0.setOnLayout(paramBoolean);
  }
  
  @com.facebook.react.uimanager.e1.a(defaultFloat = 1.0F, name = "opacity")
  public void setOpacity(x0 paramx0, float paramFloat) {
    paramx0.setOpacity(paramFloat);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "pointerEvents")
  public void setPointerEvents(x0 paramx0, String paramString) {
    r r;
    if (paramString == null) {
      r = r.f;
    } else {
      r = r.valueOf(r.toUpperCase(Locale.US).replace("-", "_"));
    } 
    paramx0.setPointerEvents(r);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "propList")
  public void setPropList(b0 paramb0, ReadableArray paramReadableArray) {
    paramb0.setPropList(paramReadableArray);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "responsible")
  public void setResponsible(x0 paramx0, boolean paramBoolean) {
    paramx0.setResponsible(paramBoolean);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "stroke")
  public void setStroke(b0 paramb0, Dynamic paramDynamic) {
    paramb0.setStroke(paramDynamic);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "strokeDasharray")
  public void setStrokeDasharray(b0 paramb0, ReadableArray paramReadableArray) {
    paramb0.setStrokeDasharray(paramReadableArray);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "strokeDashoffset")
  public void setStrokeDashoffset(b0 paramb0, float paramFloat) {
    paramb0.setStrokeDashoffset(paramFloat);
  }
  
  @com.facebook.react.uimanager.e1.a(defaultInt = 1, name = "strokeLinecap")
  public void setStrokeLinecap(b0 paramb0, int paramInt) {
    paramb0.setStrokeLinecap(paramInt);
  }
  
  @com.facebook.react.uimanager.e1.a(defaultInt = 1, name = "strokeLinejoin")
  public void setStrokeLinejoin(b0 paramb0, int paramInt) {
    paramb0.setStrokeLinejoin(paramInt);
  }
  
  @com.facebook.react.uimanager.e1.a(defaultFloat = 4.0F, name = "strokeMiterlimit")
  public void setStrokeMiterlimit(b0 paramb0, float paramFloat) {
    paramb0.setStrokeMiterlimit(paramFloat);
  }
  
  @com.facebook.react.uimanager.e1.a(defaultFloat = 1.0F, name = "strokeOpacity")
  public void setStrokeOpacity(b0 paramb0, float paramFloat) {
    paramb0.setStrokeOpacity(paramFloat);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "strokeWidth")
  public void setStrokeWidth(b0 paramb0, Dynamic paramDynamic) {
    paramb0.setStrokeWidth(paramDynamic);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "transform")
  public void setTransform(x0 paramx0, Dynamic paramDynamic) {
    if (paramDynamic.getType() != ReadableType.Array)
      return; 
    ReadableArray readableArray = paramDynamic.asArray();
    if (readableArray == null) {
      resetTransformProperty((View)paramx0);
    } else {
      setTransformProperty((View)paramx0, readableArray);
    } 
    Matrix matrix = paramx0.getMatrix();
    paramx0.y = matrix;
    paramx0.D = matrix.invert(paramx0.B);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "vectorEffect")
  public void setVectorEffect(b0 paramb0, int paramInt) {
    paramb0.setVectorEffect(paramInt);
  }
  
  static class CircleViewManager extends RenderableViewManager {
    CircleViewManager() {
      super(RenderableViewManager.e.i, null);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "cx")
    public void setCx(b param1b, Dynamic param1Dynamic) {
      param1b.setCx(param1Dynamic);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "cy")
    public void setCy(b param1b, Dynamic param1Dynamic) {
      param1b.setCy(param1Dynamic);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "r")
    public void setR(b param1b, Dynamic param1Dynamic) {
      param1b.setR(param1Dynamic);
    }
  }
  
  static class ClipPathViewManager extends GroupViewManager {
    ClipPathViewManager() {
      super(RenderableViewManager.e.m);
    }
  }
  
  static class DefsViewManager extends RenderableViewManager {
    DefsViewManager() {
      super(RenderableViewManager.e.n, null);
    }
  }
  
  static class EllipseViewManager extends RenderableViewManager {
    EllipseViewManager() {
      super(RenderableViewManager.e.j, null);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "cx")
    public void setCx(g param1g, Dynamic param1Dynamic) {
      param1g.setCx(param1Dynamic);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "cy")
    public void setCy(g param1g, Dynamic param1Dynamic) {
      param1g.setCy(param1Dynamic);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "rx")
    public void setRx(g param1g, Dynamic param1Dynamic) {
      param1g.setRx(param1Dynamic);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "ry")
    public void setRy(g param1g, Dynamic param1Dynamic) {
      param1g.setRy(param1Dynamic);
    }
  }
  
  static class ForeignObjectManager extends GroupViewManager {
    ForeignObjectManager() {
      super(RenderableViewManager.e.v);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "height")
    public void setHeight(i param1i, Dynamic param1Dynamic) {
      param1i.setHeight(param1Dynamic);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "width")
    public void setWidth(i param1i, Dynamic param1Dynamic) {
      param1i.setWidth(param1Dynamic);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "x")
    public void setX(i param1i, Dynamic param1Dynamic) {
      param1i.setX(param1Dynamic);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "y")
    public void setY(i param1i, Dynamic param1Dynamic) {
      param1i.setY(param1Dynamic);
    }
  }
  
  static class GroupViewManager extends RenderableViewManager {
    GroupViewManager() {
      super(RenderableViewManager.e.c, null);
    }
    
    GroupViewManager(RenderableViewManager.e param1e) {
      super(param1e, null);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "font")
    public void setFont(l param1l, ReadableMap param1ReadableMap) {
      param1l.setFont(param1ReadableMap);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "fontSize")
    public void setFontSize(l param1l, Dynamic param1Dynamic) {
      JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
      int i = RenderableViewManager.b.a[param1Dynamic.getType().ordinal()];
      if (i != 1) {
        if (i != 2)
          return; 
        javaOnlyMap.putString("fontSize", param1Dynamic.asString());
      } else {
        javaOnlyMap.putDouble("fontSize", param1Dynamic.asDouble());
      } 
      param1l.setFont((ReadableMap)javaOnlyMap);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "fontWeight")
    public void setFontWeight(l param1l, Dynamic param1Dynamic) {
      JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
      int i = RenderableViewManager.b.a[param1Dynamic.getType().ordinal()];
      if (i != 1) {
        if (i != 2)
          return; 
        javaOnlyMap.putString("fontWeight", param1Dynamic.asString());
      } else {
        javaOnlyMap.putDouble("fontWeight", param1Dynamic.asDouble());
      } 
      param1l.setFont((ReadableMap)javaOnlyMap);
    }
  }
  
  static class ImageViewManager extends RenderableViewManager {
    ImageViewManager() {
      super(RenderableViewManager.e.h, null);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "align")
    public void setAlign(m param1m, String param1String) {
      param1m.setAlign(param1String);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "height")
    public void setHeight(m param1m, Dynamic param1Dynamic) {
      param1m.setHeight(param1Dynamic);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "meetOrSlice")
    public void setMeetOrSlice(m param1m, int param1Int) {
      param1m.setMeetOrSlice(param1Int);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "src")
    public void setSrc(m param1m, ReadableMap param1ReadableMap) {
      param1m.setSrc(param1ReadableMap);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "width")
    public void setWidth(m param1m, Dynamic param1Dynamic) {
      param1m.setWidth(param1Dynamic);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "x")
    public void setX(m param1m, Dynamic param1Dynamic) {
      param1m.setX(param1Dynamic);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "y")
    public void setY(m param1m, Dynamic param1Dynamic) {
      param1m.setY(param1Dynamic);
    }
  }
  
  static class LineViewManager extends RenderableViewManager {
    LineViewManager() {
      super(RenderableViewManager.e.k, null);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "x1")
    public void setX1(n param1n, Dynamic param1Dynamic) {
      param1n.setX1(param1Dynamic);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "x2")
    public void setX2(n param1n, Dynamic param1Dynamic) {
      param1n.setX2(param1Dynamic);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "y1")
    public void setY1(n param1n, Dynamic param1Dynamic) {
      param1n.setY1(param1Dynamic);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "y2")
    public void setY2(n param1n, Dynamic param1Dynamic) {
      param1n.setY2(param1Dynamic);
    }
  }
  
  static class LinearGradientManager extends RenderableViewManager {
    LinearGradientManager() {
      super(RenderableViewManager.e.q, null);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "gradient")
    public void setGradient(o param1o, ReadableArray param1ReadableArray) {
      param1o.setGradient(param1ReadableArray);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "gradientTransform")
    public void setGradientTransform(o param1o, ReadableArray param1ReadableArray) {
      param1o.setGradientTransform(param1ReadableArray);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "gradientUnits")
    public void setGradientUnits(o param1o, int param1Int) {
      param1o.setGradientUnits(param1Int);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "x1")
    public void setX1(o param1o, Dynamic param1Dynamic) {
      param1o.setX1(param1Dynamic);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "x2")
    public void setX2(o param1o, Dynamic param1Dynamic) {
      param1o.setX2(param1Dynamic);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "y1")
    public void setY1(o param1o, Dynamic param1Dynamic) {
      param1o.setY1(param1Dynamic);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "y2")
    public void setY2(o param1o, Dynamic param1Dynamic) {
      param1o.setY2(param1Dynamic);
    }
  }
  
  static class MarkerManager extends GroupViewManager {
    MarkerManager() {
      super(RenderableViewManager.e.u);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "align")
    public void setAlign(p param1p, String param1String) {
      param1p.setAlign(param1String);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "markerHeight")
    public void setMarkerHeight(p param1p, Dynamic param1Dynamic) {
      param1p.setMarkerHeight(param1Dynamic);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "markerUnits")
    public void setMarkerUnits(p param1p, String param1String) {
      param1p.setMarkerUnits(param1String);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "markerWidth")
    public void setMarkerWidth(p param1p, Dynamic param1Dynamic) {
      param1p.setMarkerWidth(param1Dynamic);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "meetOrSlice")
    public void setMeetOrSlice(p param1p, int param1Int) {
      param1p.setMeetOrSlice(param1Int);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "minX")
    public void setMinX(p param1p, float param1Float) {
      param1p.setMinX(param1Float);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "minY")
    public void setMinY(p param1p, float param1Float) {
      param1p.setMinY(param1Float);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "orient")
    public void setOrient(p param1p, String param1String) {
      param1p.setOrient(param1String);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "refX")
    public void setRefX(p param1p, Dynamic param1Dynamic) {
      param1p.setRefX(param1Dynamic);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "refY")
    public void setRefY(p param1p, Dynamic param1Dynamic) {
      param1p.setRefY(param1Dynamic);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "vbHeight")
    public void setVbHeight(p param1p, float param1Float) {
      param1p.setVbHeight(param1Float);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "vbWidth")
    public void setVbWidth(p param1p, float param1Float) {
      param1p.setVbWidth(param1Float);
    }
  }
  
  static class MaskManager extends GroupViewManager {
    MaskManager() {
      super(RenderableViewManager.e.t);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "height")
    public void setHeight(q param1q, Dynamic param1Dynamic) {
      param1q.setHeight(param1Dynamic);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "maskContentUnits")
    public void setMaskContentUnits(q param1q, int param1Int) {
      param1q.setMaskContentUnits(param1Int);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "maskTransform")
    public void setMaskTransform(q param1q, ReadableArray param1ReadableArray) {
      param1q.setMaskTransform(param1ReadableArray);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "maskUnits")
    public void setMaskUnits(q param1q, int param1Int) {
      param1q.setMaskUnits(param1Int);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "width")
    public void setWidth(q param1q, Dynamic param1Dynamic) {
      param1q.setWidth(param1Dynamic);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "x")
    public void setX(q param1q, Dynamic param1Dynamic) {
      param1q.setX(param1Dynamic);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "y")
    public void setY(q param1q, Dynamic param1Dynamic) {
      param1q.setY(param1Dynamic);
    }
  }
  
  static class PathViewManager extends RenderableViewManager {
    PathViewManager() {
      super(RenderableViewManager.e.d, null);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "d")
    public void setD(t param1t, String param1String) {
      param1t.setD(param1String);
    }
  }
  
  static class PatternManager extends GroupViewManager {
    PatternManager() {
      super(RenderableViewManager.e.s);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "align")
    public void setAlign(u param1u, String param1String) {
      param1u.setAlign(param1String);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "height")
    public void setHeight(u param1u, Dynamic param1Dynamic) {
      param1u.setHeight(param1Dynamic);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "meetOrSlice")
    public void setMeetOrSlice(u param1u, int param1Int) {
      param1u.setMeetOrSlice(param1Int);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "minX")
    public void setMinX(u param1u, float param1Float) {
      param1u.setMinX(param1Float);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "minY")
    public void setMinY(u param1u, float param1Float) {
      param1u.setMinY(param1Float);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "patternContentUnits")
    public void setPatternContentUnits(u param1u, int param1Int) {
      param1u.setPatternContentUnits(param1Int);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "patternTransform")
    public void setPatternTransform(u param1u, ReadableArray param1ReadableArray) {
      param1u.setPatternTransform(param1ReadableArray);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "patternUnits")
    public void setPatternUnits(u param1u, int param1Int) {
      param1u.setPatternUnits(param1Int);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "vbHeight")
    public void setVbHeight(u param1u, float param1Float) {
      param1u.setVbHeight(param1Float);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "vbWidth")
    public void setVbWidth(u param1u, float param1Float) {
      param1u.setVbWidth(param1Float);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "width")
    public void setWidth(u param1u, Dynamic param1Dynamic) {
      param1u.setWidth(param1Dynamic);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "x")
    public void setX(u param1u, Dynamic param1Dynamic) {
      param1u.setX(param1Dynamic);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "y")
    public void setY(u param1u, Dynamic param1Dynamic) {
      param1u.setY(param1Dynamic);
    }
  }
  
  static class RadialGradientManager extends RenderableViewManager {
    RadialGradientManager() {
      super(RenderableViewManager.e.r, null);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "cx")
    public void setCx(z param1z, Dynamic param1Dynamic) {
      param1z.setCx(param1Dynamic);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "cy")
    public void setCy(z param1z, Dynamic param1Dynamic) {
      param1z.setCy(param1Dynamic);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "fx")
    public void setFx(z param1z, Dynamic param1Dynamic) {
      param1z.setFx(param1Dynamic);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "fy")
    public void setFy(z param1z, Dynamic param1Dynamic) {
      param1z.setFy(param1Dynamic);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "gradient")
    public void setGradient(z param1z, ReadableArray param1ReadableArray) {
      param1z.setGradient(param1ReadableArray);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "gradientTransform")
    public void setGradientTransform(z param1z, ReadableArray param1ReadableArray) {
      param1z.setGradientTransform(param1ReadableArray);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "gradientUnits")
    public void setGradientUnits(z param1z, int param1Int) {
      param1z.setGradientUnits(param1Int);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "rx")
    public void setRx(z param1z, Dynamic param1Dynamic) {
      param1z.setRx(param1Dynamic);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "ry")
    public void setRy(z param1z, Dynamic param1Dynamic) {
      param1z.setRy(param1Dynamic);
    }
  }
  
  static class RectViewManager extends RenderableViewManager {
    RectViewManager() {
      super(RenderableViewManager.e.l, null);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "height")
    public void setHeight(a0 param1a0, Dynamic param1Dynamic) {
      param1a0.setHeight(param1Dynamic);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "rx")
    public void setRx(a0 param1a0, Dynamic param1Dynamic) {
      param1a0.setRx(param1Dynamic);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "ry")
    public void setRy(a0 param1a0, Dynamic param1Dynamic) {
      param1a0.setRy(param1Dynamic);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "width")
    public void setWidth(a0 param1a0, Dynamic param1Dynamic) {
      param1a0.setWidth(param1Dynamic);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "x")
    public void setX(a0 param1a0, Dynamic param1Dynamic) {
      param1a0.setX(param1Dynamic);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "y")
    public void setY(a0 param1a0, Dynamic param1Dynamic) {
      param1a0.setY(param1Dynamic);
    }
  }
  
  static class SymbolManager extends GroupViewManager {
    SymbolManager() {
      super(RenderableViewManager.e.p);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "align")
    public void setAlign(g0 param1g0, String param1String) {
      param1g0.setAlign(param1String);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "meetOrSlice")
    public void setMeetOrSlice(g0 param1g0, int param1Int) {
      param1g0.setMeetOrSlice(param1Int);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "minX")
    public void setMinX(g0 param1g0, float param1Float) {
      param1g0.setMinX(param1Float);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "minY")
    public void setMinY(g0 param1g0, float param1Float) {
      param1g0.setMinY(param1Float);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "vbHeight")
    public void setVbHeight(g0 param1g0, float param1Float) {
      param1g0.setVbHeight(param1Float);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "vbWidth")
    public void setVbWidth(g0 param1g0, float param1Float) {
      param1g0.setVbWidth(param1Float);
    }
  }
  
  static class TSpanViewManager extends TextViewManager {
    TSpanViewManager() {
      super(RenderableViewManager.e.f);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "content")
    public void setContent(h0 param1h0, String param1String) {
      param1h0.setContent(param1String);
    }
  }
  
  static class TextPathViewManager extends TextViewManager {
    TextPathViewManager() {
      super(RenderableViewManager.e.g);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "href")
    public void setHref(i0 param1i0, String param1String) {
      param1i0.setHref(param1String);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "method")
    public void setMethod(i0 param1i0, String param1String) {
      param1i0.setMethod(param1String);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "midLine")
    public void setSharp(i0 param1i0, String param1String) {
      param1i0.setSharp(param1String);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "side")
    public void setSide(i0 param1i0, String param1String) {
      param1i0.setSide(param1String);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "spacing")
    public void setSpacing(i0 param1i0, String param1String) {
      param1i0.setSpacing(param1String);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "startOffset")
    public void setStartOffset(i0 param1i0, Dynamic param1Dynamic) {
      param1i0.setStartOffset(param1Dynamic);
    }
  }
  
  static class TextViewManager extends GroupViewManager {
    TextViewManager() {
      super(RenderableViewManager.e.e);
    }
    
    TextViewManager(RenderableViewManager.e param1e) {
      super(param1e);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "baselineShift")
    public void setBaselineShift(u0 param1u0, Dynamic param1Dynamic) {
      param1u0.setBaselineShift(param1Dynamic);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "dx")
    public void setDeltaX(u0 param1u0, Dynamic param1Dynamic) {
      param1u0.setDeltaX(param1Dynamic);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "dy")
    public void setDeltaY(u0 param1u0, Dynamic param1Dynamic) {
      param1u0.setDeltaY(param1Dynamic);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "font")
    public void setFont(u0 param1u0, ReadableMap param1ReadableMap) {
      param1u0.setFont(param1ReadableMap);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "inlineSize")
    public void setInlineSize(u0 param1u0, Dynamic param1Dynamic) {
      param1u0.setInlineSize(param1Dynamic);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "lengthAdjust")
    public void setLengthAdjust(u0 param1u0, String param1String) {
      param1u0.setLengthAdjust(param1String);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "alignmentBaseline")
    public void setMethod(u0 param1u0, String param1String) {
      param1u0.setMethod(param1String);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "rotate")
    public void setRotate(u0 param1u0, Dynamic param1Dynamic) {
      param1u0.setRotate(param1Dynamic);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "textLength")
    public void setTextLength(u0 param1u0, Dynamic param1Dynamic) {
      param1u0.setTextLength(param1Dynamic);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "verticalAlign")
    public void setVerticalAlign(u0 param1u0, String param1String) {
      param1u0.setVerticalAlign(param1String);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "x")
    public void setX(u0 param1u0, Dynamic param1Dynamic) {
      param1u0.setPositionX(param1Dynamic);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "y")
    public void setY(u0 param1u0, Dynamic param1Dynamic) {
      param1u0.setPositionY(param1Dynamic);
    }
  }
  
  static class UseViewManager extends RenderableViewManager {
    UseViewManager() {
      super(RenderableViewManager.e.o, null);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "height")
    public void setHeight(v0 param1v0, Dynamic param1Dynamic) {
      param1v0.setHeight(param1Dynamic);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "href")
    public void setHref(v0 param1v0, String param1String) {
      param1v0.setHref(param1String);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "width")
    public void setWidth(v0 param1v0, Dynamic param1Dynamic) {
      param1v0.setWidth(param1Dynamic);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "x")
    public void setX(v0 param1v0, Dynamic param1Dynamic) {
      param1v0.setX(param1Dynamic);
    }
    
    @com.facebook.react.uimanager.e1.a(name = "y")
    public void setY(v0 param1v0, Dynamic param1Dynamic) {
      param1v0.setY(param1Dynamic);
    }
  }
  
  class a implements ViewGroup.OnHierarchyChangeListener {
    a(RenderableViewManager this$0) {}
    
    public void onChildViewAdded(View param1View1, View param1View2) {
      if (param1View1 instanceof x0)
        this.c.invalidateSvgView((x0)param1View1); 
    }
    
    public void onChildViewRemoved(View param1View1, View param1View2) {
      if (param1View1 instanceof x0)
        this.c.invalidateSvgView((x0)param1View1); 
    }
  }
  
  static class c extends j.a {
    final double[] f = new double[4];
    
    final double[] g = new double[3];
    
    final double[] h = new double[3];
    
    final double[] i = new double[3];
    
    final double[] j = new double[3];
  }
  
  class d extends i {
    d(RenderableViewManager this$0) {}
    
    @com.facebook.react.uimanager.e1.b(names = {"alignSelf", "alignItems", "collapsable", "flex", "flexBasis", "flexDirection", "flexGrow", "flexShrink", "flexWrap", "justifyContent", "overflow", "alignContent", "display", "position", "right", "top", "bottom", "left", "start", "end", "width", "height", "minWidth", "maxWidth", "minHeight", "maxHeight", "margin", "marginVertical", "marginHorizontal", "marginLeft", "marginRight", "marginTop", "marginBottom", "marginStart", "marginEnd", "padding", "paddingVertical", "paddingHorizontal", "paddingLeft", "paddingRight", "paddingTop", "paddingBottom", "paddingStart", "paddingEnd", "borderWidth", "borderStartWidth", "borderEndWidth", "borderTopWidth", "borderBottomWidth", "borderLeftWidth", "borderRightWidth"})
    public void ignoreLayoutProps(int param1Int, Dynamic param1Dynamic) {}
  }
  
  private enum e {
    c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/horcrux/svg/RenderableViewManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */