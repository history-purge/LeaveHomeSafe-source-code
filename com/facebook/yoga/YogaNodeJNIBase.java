package com.facebook.yoga;

import e.e.n.a.a;
import java.util.ArrayList;
import java.util.List;

@a
public abstract class YogaNodeJNIBase extends p implements Cloneable {
  @a
  private float[] arr = null;
  
  private YogaNodeJNIBase c;
  
  private List<YogaNodeJNIBase> d;
  
  private m e;
  
  private b f;
  
  protected long g;
  
  private boolean h = true;
  
  @a
  private int mLayoutDirection = 0;
  
  YogaNodeJNIBase() {
    this(YogaNative.jni_YGNodeNewJNI());
  }
  
  private YogaNodeJNIBase(long paramLong) {
    if (paramLong != 0L) {
      this.g = paramLong;
      return;
    } 
    throw new IllegalStateException("Failed to allocate native memory");
  }
  
  YogaNodeJNIBase(c paramc) {
    this(YogaNative.jni_YGNodeNewWithConfigJNI(((e)paramc).a));
  }
  
  private static v a(long paramLong) {
    return new v(Float.intBitsToFloat((int)paramLong), (int)(paramLong >> 32L));
  }
  
  @a
  private final long replaceChild(YogaNodeJNIBase paramYogaNodeJNIBase, int paramInt) {
    List<YogaNodeJNIBase> list = this.d;
    if (list != null) {
      list.remove(paramInt);
      this.d.add(paramInt, paramYogaNodeJNIBase);
      paramYogaNodeJNIBase.c = this;
      return paramYogaNodeJNIBase.g;
    } 
    throw new IllegalStateException("Cannot replace child. YogaNode does not have children");
  }
  
  public float a(j paramj) {
    float[] arrayOfFloat = this.arr;
    if (arrayOfFloat != null) {
      int i = 0;
      if (((int)arrayOfFloat[0] & 0x2) == 2) {
        if (((int)arrayOfFloat[0] & 0x1) != 1)
          i = 4; 
        i = 10 - i;
        switch (a.a[paramj.ordinal()]) {
          default:
            throw new IllegalArgumentException("Cannot get layout paddings of multi-edge shorthands");
          case 6:
            return (c() == h.e) ? this.arr[i] : this.arr[i + 2];
          case 5:
            return (c() == h.e) ? this.arr[i + 2] : this.arr[i];
          case 4:
            return this.arr[i + 3];
          case 3:
            return this.arr[i + 2];
          case 2:
            return this.arr[i + 1];
          case 1:
            break;
        } 
        return this.arr[i];
      } 
    } 
    return 0.0F;
  }
  
  public YogaNodeJNIBase a(int paramInt) {
    List<YogaNodeJNIBase> list = this.d;
    if (list != null) {
      YogaNodeJNIBase yogaNodeJNIBase = list.remove(paramInt);
      yogaNodeJNIBase.c = null;
      YogaNative.jni_YGNodeRemoveChildJNI(this.g, yogaNodeJNIBase.g);
      return yogaNodeJNIBase;
    } 
    throw new IllegalStateException("Trying to remove a child of a YogaNode that does not have children");
  }
  
  public void a() {
    YogaNative.jni_YGNodeMarkDirtyJNI(this.g);
  }
  
  public void a(float paramFloat) {
    YogaNative.jni_YGNodeStyleSetAspectRatioJNI(this.g, paramFloat);
  }
  
  public void a(float paramFloat1, float paramFloat2) {
    ArrayList<YogaNodeJNIBase> arrayList = new ArrayList();
    arrayList.add(this);
    boolean bool = false;
    int i;
    for (i = 0; i < arrayList.size(); i++) {
      List<YogaNodeJNIBase> list = ((YogaNodeJNIBase)arrayList.get(i)).d;
      if (list != null)
        arrayList.addAll(list); 
    } 
    YogaNodeJNIBase[] arrayOfYogaNodeJNIBase = arrayList.<YogaNodeJNIBase>toArray(new YogaNodeJNIBase[arrayList.size()]);
    long[] arrayOfLong = new long[arrayOfYogaNodeJNIBase.length];
    for (i = bool; i < arrayOfYogaNodeJNIBase.length; i++)
      arrayOfLong[i] = (arrayOfYogaNodeJNIBase[i]).g; 
    YogaNative.jni_YGNodeCalculateLayoutJNI(this.g, paramFloat1, paramFloat2, arrayOfLong, arrayOfYogaNodeJNIBase);
  }
  
  public void a(a parama) {
    YogaNative.jni_YGNodeStyleSetAlignContentJNI(this.g, parama.a());
  }
  
  public void a(h paramh) {
    YogaNative.jni_YGNodeStyleSetDirectionJNI(this.g, paramh.a());
  }
  
  public void a(i parami) {
    YogaNative.jni_YGNodeStyleSetDisplayJNI(this.g, parami.a());
  }
  
  public void a(j paramj, float paramFloat) {
    YogaNative.jni_YGNodeStyleSetBorderJNI(this.g, paramj.a(), paramFloat);
  }
  
  public void a(k paramk) {
    YogaNative.jni_YGNodeStyleSetFlexDirectionJNI(this.g, paramk.a());
  }
  
  public void a(l paraml) {
    YogaNative.jni_YGNodeStyleSetJustifyContentJNI(this.g, paraml.a());
  }
  
  public void a(m paramm) {
    boolean bool;
    this.e = paramm;
    long l = this.g;
    if (paramm != null) {
      bool = true;
    } else {
      bool = false;
    } 
    YogaNative.jni_YGNodeSetHasMeasureFuncJNI(l, bool);
  }
  
  public void a(p paramp, int paramInt) {
    paramp = paramp;
    if (((YogaNodeJNIBase)paramp).c == null) {
      if (this.d == null)
        this.d = new ArrayList<YogaNodeJNIBase>(4); 
      this.d.add(paramInt, paramp);
      ((YogaNodeJNIBase)paramp).c = this;
      YogaNative.jni_YGNodeInsertChildJNI(this.g, ((YogaNodeJNIBase)paramp).g, paramInt);
      return;
    } 
    throw new IllegalStateException("Child already has a parent, it must be removed first.");
  }
  
  public void a(s params) {
    YogaNative.jni_YGNodeStyleSetOverflowJNI(this.g, params.a());
  }
  
  public void a(t paramt) {
    YogaNative.jni_YGNodeStyleSetPositionTypeJNI(this.g, paramt.a());
  }
  
  public void a(w paramw) {
    YogaNative.jni_YGNodeStyleSetFlexWrapJNI(this.g, paramw.a());
  }
  
  public void a(Object paramObject) {}
  
  public v b() {
    return a(YogaNative.jni_YGNodeStyleGetHeightJNI(this.g));
  }
  
  public void b(float paramFloat) {
    YogaNative.jni_YGNodeStyleSetFlexJNI(this.g, paramFloat);
  }
  
  public void b(a parama) {
    YogaNative.jni_YGNodeStyleSetAlignItemsJNI(this.g, parama.a());
  }
  
  public void b(j paramj) {
    YogaNative.jni_YGNodeStyleSetMarginAutoJNI(this.g, paramj.a());
  }
  
  public void b(j paramj, float paramFloat) {
    YogaNative.jni_YGNodeStyleSetMarginJNI(this.g, paramj.a(), paramFloat);
  }
  
  @a
  public final float baseline(float paramFloat1, float paramFloat2) {
    return this.f.a(this, paramFloat1, paramFloat2);
  }
  
  public h c() {
    int i;
    float[] arrayOfFloat = this.arr;
    if (arrayOfFloat != null) {
      i = (int)arrayOfFloat[5];
    } else {
      i = this.mLayoutDirection;
    } 
    return h.f(i);
  }
  
  public void c(float paramFloat) {
    YogaNative.jni_YGNodeStyleSetFlexBasisJNI(this.g, paramFloat);
  }
  
  public void c(a parama) {
    YogaNative.jni_YGNodeStyleSetAlignSelfJNI(this.g, parama.a());
  }
  
  public void c(j paramj, float paramFloat) {
    YogaNative.jni_YGNodeStyleSetMarginPercentJNI(this.g, paramj.a(), paramFloat);
  }
  
  public float d() {
    float[] arrayOfFloat = this.arr;
    return (arrayOfFloat != null) ? arrayOfFloat[2] : 0.0F;
  }
  
  public void d(float paramFloat) {
    YogaNative.jni_YGNodeStyleSetFlexBasisPercentJNI(this.g, paramFloat);
  }
  
  public void d(j paramj, float paramFloat) {
    YogaNative.jni_YGNodeStyleSetPaddingJNI(this.g, paramj.a(), paramFloat);
  }
  
  public void e(float paramFloat) {
    YogaNative.jni_YGNodeStyleSetFlexGrowJNI(this.g, paramFloat);
  }
  
  public void e(j paramj, float paramFloat) {
    YogaNative.jni_YGNodeStyleSetPaddingPercentJNI(this.g, paramj.a(), paramFloat);
  }
  
  public float f() {
    float[] arrayOfFloat = this.arr;
    return (arrayOfFloat != null) ? arrayOfFloat[1] : 0.0F;
  }
  
  public void f(float paramFloat) {
    YogaNative.jni_YGNodeStyleSetFlexShrinkJNI(this.g, paramFloat);
  }
  
  public void f(j paramj, float paramFloat) {
    YogaNative.jni_YGNodeStyleSetPositionJNI(this.g, paramj.a(), paramFloat);
  }
  
  public float g() {
    float[] arrayOfFloat = this.arr;
    return (arrayOfFloat != null) ? arrayOfFloat[3] : 0.0F;
  }
  
  public void g(float paramFloat) {
    YogaNative.jni_YGNodeStyleSetHeightJNI(this.g, paramFloat);
  }
  
  public void g(j paramj, float paramFloat) {
    YogaNative.jni_YGNodeStyleSetPositionPercentJNI(this.g, paramj.a(), paramFloat);
  }
  
  public float h() {
    float[] arrayOfFloat = this.arr;
    return (arrayOfFloat != null) ? arrayOfFloat[4] : 0.0F;
  }
  
  public void h(float paramFloat) {
    YogaNative.jni_YGNodeStyleSetHeightPercentJNI(this.g, paramFloat);
  }
  
  public v i() {
    return a(YogaNative.jni_YGNodeStyleGetWidthJNI(this.g));
  }
  
  public void i(float paramFloat) {
    YogaNative.jni_YGNodeStyleSetMaxHeightJNI(this.g, paramFloat);
  }
  
  public void j(float paramFloat) {
    YogaNative.jni_YGNodeStyleSetMaxHeightPercentJNI(this.g, paramFloat);
  }
  
  public boolean j() {
    float[] arrayOfFloat = this.arr;
    if (arrayOfFloat != null) {
      boolean bool = false;
      if (((int)arrayOfFloat[0] & 0x10) == 16)
        bool = true; 
      return bool;
    } 
    return this.h;
  }
  
  public void k(float paramFloat) {
    YogaNative.jni_YGNodeStyleSetMaxWidthJNI(this.g, paramFloat);
  }
  
  public boolean k() {
    return YogaNative.jni_YGNodeIsDirtyJNI(this.g);
  }
  
  public void l(float paramFloat) {
    YogaNative.jni_YGNodeStyleSetMaxWidthPercentJNI(this.g, paramFloat);
  }
  
  public boolean l() {
    return (this.e != null);
  }
  
  public void m() {
    float[] arrayOfFloat = this.arr;
    if (arrayOfFloat != null)
      arrayOfFloat[0] = ((int)arrayOfFloat[0] & 0xFFFFFFEF); 
    this.h = false;
  }
  
  public void m(float paramFloat) {
    YogaNative.jni_YGNodeStyleSetMinHeightJNI(this.g, paramFloat);
  }
  
  @a
  public final long measure(float paramFloat1, int paramInt1, float paramFloat2, int paramInt2) {
    if (l())
      return this.e.a(this, paramFloat1, n.f(paramInt1), paramFloat2, n.f(paramInt2)); 
    throw new RuntimeException("Measure function isn't defined!");
  }
  
  public void n() {
    this.e = null;
    this.f = null;
    this.arr = null;
    this.h = true;
    this.mLayoutDirection = 0;
    YogaNative.jni_YGNodeResetJNI(this.g);
  }
  
  public void n(float paramFloat) {
    YogaNative.jni_YGNodeStyleSetMinHeightPercentJNI(this.g, paramFloat);
  }
  
  public void o() {
    YogaNative.jni_YGNodeStyleSetFlexBasisAutoJNI(this.g);
  }
  
  public void o(float paramFloat) {
    YogaNative.jni_YGNodeStyleSetMinWidthJNI(this.g, paramFloat);
  }
  
  public void p() {
    YogaNative.jni_YGNodeStyleSetHeightAutoJNI(this.g);
  }
  
  public void p(float paramFloat) {
    YogaNative.jni_YGNodeStyleSetMinWidthPercentJNI(this.g, paramFloat);
  }
  
  public void q() {
    YogaNative.jni_YGNodeStyleSetWidthAutoJNI(this.g);
  }
  
  public void q(float paramFloat) {
    YogaNative.jni_YGNodeStyleSetWidthJNI(this.g, paramFloat);
  }
  
  public void r(float paramFloat) {
    YogaNative.jni_YGNodeStyleSetWidthPercentJNI(this.g, paramFloat);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/yoga/YogaNodeJNIBase.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */