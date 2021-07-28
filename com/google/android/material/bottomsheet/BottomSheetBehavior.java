package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b.g.m.v;
import e.f.a.f.a0.k;
import e.f.a.f.j;
import e.f.a.f.k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.c<V> {
  private static final int K = j.Widget_Design_BottomSheet_Modal;
  
  int A;
  
  WeakReference<V> B;
  
  WeakReference<View> C;
  
  private final ArrayList<e> D = new ArrayList<e>();
  
  private VelocityTracker E;
  
  int F;
  
  private int G;
  
  boolean H;
  
  private Map<View, Integer> I;
  
  private final b.i.b.c.c J = new c(this);
  
  private int a = 0;
  
  private boolean b = true;
  
  private float c;
  
  private int d;
  
  private boolean e;
  
  private int f;
  
  private boolean g;
  
  private e.f.a.f.a0.g h;
  
  private k i;
  
  private boolean j;
  
  private g k = null;
  
  private ValueAnimator l;
  
  int m;
  
  int n;
  
  int o;
  
  float p = 0.5F;
  
  int q;
  
  float r = -1.0F;
  
  boolean s;
  
  private boolean t;
  
  int u = 4;
  
  b.i.b.c v;
  
  private boolean w;
  
  private int x;
  
  private boolean y;
  
  int z;
  
  public BottomSheetBehavior() {}
  
  public BottomSheetBehavior(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, k.BottomSheetBehavior_Layout);
    this.g = typedArray.hasValue(k.BottomSheetBehavior_Layout_shapeAppearance);
    boolean bool = typedArray.hasValue(k.BottomSheetBehavior_Layout_backgroundTint);
    if (bool) {
      a(paramContext, paramAttributeSet, bool, e.f.a.f.x.c.a(paramContext, typedArray, k.BottomSheetBehavior_Layout_backgroundTint));
    } else {
      a(paramContext, paramAttributeSet, bool);
    } 
    d();
    if (Build.VERSION.SDK_INT >= 21)
      this.r = typedArray.getDimension(k.BottomSheetBehavior_Layout_android_elevation, -1.0F); 
    TypedValue typedValue = typedArray.peekValue(k.BottomSheetBehavior_Layout_behavior_peekHeight);
    if (typedValue != null) {
      int j = typedValue.data;
      if (j == -1) {
        c(j);
        b(typedArray.getBoolean(k.BottomSheetBehavior_Layout_behavior_hideable, false));
        a(typedArray.getBoolean(k.BottomSheetBehavior_Layout_behavior_fitToContents, true));
        c(typedArray.getBoolean(k.BottomSheetBehavior_Layout_behavior_skipCollapsed, false));
        d(typedArray.getInt(k.BottomSheetBehavior_Layout_behavior_saveFlags, 0));
        a(typedArray.getFloat(k.BottomSheetBehavior_Layout_behavior_halfExpandedRatio, 0.5F));
        b(typedArray.getInt(k.BottomSheetBehavior_Layout_behavior_expandedOffset, 0));
        typedArray.recycle();
        this.c = ViewConfiguration.get(paramContext).getScaledMaximumFlingVelocity();
        return;
      } 
    } 
    int i = typedArray.getDimensionPixelSize(k.BottomSheetBehavior_Layout_behavior_peekHeight, -1);
    c(i);
    b(typedArray.getBoolean(k.BottomSheetBehavior_Layout_behavior_hideable, false));
    a(typedArray.getBoolean(k.BottomSheetBehavior_Layout_behavior_fitToContents, true));
    c(typedArray.getBoolean(k.BottomSheetBehavior_Layout_behavior_skipCollapsed, false));
    d(typedArray.getInt(k.BottomSheetBehavior_Layout_behavior_saveFlags, 0));
    a(typedArray.getFloat(k.BottomSheetBehavior_Layout_behavior_halfExpandedRatio, 0.5F));
    b(typedArray.getInt(k.BottomSheetBehavior_Layout_behavior_expandedOffset, 0));
    typedArray.recycle();
    this.c = ViewConfiguration.get(paramContext).getScaledMaximumFlingVelocity();
  }
  
  private void a(Context paramContext, AttributeSet paramAttributeSet, boolean paramBoolean) {
    a(paramContext, paramAttributeSet, paramBoolean, (ColorStateList)null);
  }
  
  private void a(Context paramContext, AttributeSet paramAttributeSet, boolean paramBoolean, ColorStateList paramColorStateList) {
    if (this.g) {
      this.i = k.a(paramContext, paramAttributeSet, e.f.a.f.b.bottomSheetStyle, K).a();
      this.h = new e.f.a.f.a0.g(this.i);
      this.h.a(paramContext);
      if (paramBoolean && paramColorStateList != null) {
        this.h.a(paramColorStateList);
        return;
      } 
      TypedValue typedValue = new TypedValue();
      paramContext.getTheme().resolveAttribute(16842801, typedValue, true);
      this.h.setTint(typedValue.data);
    } 
  }
  
  private void a(V paramV, b.g.m.e0.c.a parama, int paramInt) {
    v.a((View)paramV, parama, null, new d(this, paramInt));
  }
  
  private void a(f paramf) {
    int i = this.a;
    if (i == 0)
      return; 
    if (i == -1 || (i & 0x1) == 1)
      this.d = paramf.f; 
    i = this.a;
    if (i == -1 || (i & 0x2) == 2)
      this.b = paramf.g; 
    i = this.a;
    if (i == -1 || (i & 0x4) == 4)
      this.s = paramf.h; 
    i = this.a;
    if (i == -1 || (i & 0x8) == 8)
      this.t = paramf.i; 
  }
  
  private void b() {
    int i;
    if (this.e) {
      i = Math.max(this.f, this.A - this.z * 9 / 16);
    } else {
      i = this.d;
    } 
    if (this.b) {
      this.q = Math.max(this.A - i, this.n);
      return;
    } 
    this.q = this.A - i;
  }
  
  private void c() {
    this.o = (int)(this.A * (1.0F - this.p));
  }
  
  private void d() {
    this.l = ValueAnimator.ofFloat(new float[] { 0.0F, 1.0F });
    this.l.setDuration(500L);
    this.l.addUpdateListener(new b(this));
  }
  
  private void d(boolean paramBoolean) {
    WeakReference<V> weakReference = this.B;
    if (weakReference == null)
      return; 
    ViewParent viewParent = ((View)weakReference.get()).getParent();
    if (!(viewParent instanceof CoordinatorLayout))
      return; 
    CoordinatorLayout coordinatorLayout = (CoordinatorLayout)viewParent;
    int j = coordinatorLayout.getChildCount();
    if (Build.VERSION.SDK_INT >= 16 && paramBoolean)
      if (this.I == null) {
        this.I = new HashMap<View, Integer>(j);
      } else {
        return;
      }  
    for (int i = 0; i < j; i++) {
      byte b;
      View view = coordinatorLayout.getChildAt(i);
      if (view == this.B.get())
        continue; 
      if (!paramBoolean) {
        Map<View, Integer> map = this.I;
        if (map != null && map.containsKey(view)) {
          b = ((Integer)this.I.get(view)).intValue();
        } else {
          continue;
        } 
      } else {
        if (Build.VERSION.SDK_INT >= 16)
          this.I.put(view, Integer.valueOf(view.getImportantForAccessibility())); 
        b = 4;
      } 
      v.h(view, b);
      continue;
    } 
    if (!paramBoolean)
      this.I = null; 
  }
  
  private int e() {
    return this.b ? this.n : this.m;
  }
  
  private float f() {
    VelocityTracker velocityTracker = this.E;
    if (velocityTracker == null)
      return 0.0F; 
    velocityTracker.computeCurrentVelocity(1000, this.c);
    return this.E.getYVelocity(this.F);
  }
  
  private void g() {
    this.F = -1;
    VelocityTracker velocityTracker = this.E;
    if (velocityTracker != null) {
      velocityTracker.recycle();
      this.E = null;
    } 
  }
  
  private void g(int paramInt) {
    View view = (View)this.B.get();
    if (view == null)
      return; 
    ViewParent viewParent = view.getParent();
    if (viewParent != null && viewParent.isLayoutRequested() && v.G(view)) {
      view.post(new a(this, view, paramInt));
      return;
    } 
    a(view, paramInt);
  }
  
  private void h() {
    b.g.m.e0.c.a a;
    WeakReference<V> weakReference = this.B;
    if (weakReference == null)
      return; 
    View view = (View)weakReference.get();
    if (view == null)
      return; 
    v.f(view, 524288);
    v.f(view, 262144);
    v.f(view, 1048576);
    if (this.s && this.u != 5)
      a((V)view, b.g.m.e0.c.a.m, 5); 
    int i = this.u;
    byte b = 6;
    if (i != 3) {
      if (i != 4) {
        if (i != 6)
          return; 
        a((V)view, b.g.m.e0.c.a.l, 4);
        a((V)view, b.g.m.e0.c.a.k, 3);
        return;
      } 
      if (this.b)
        b = 3; 
      a = b.g.m.e0.c.a.k;
    } else {
      if (this.b)
        b = 4; 
      a = b.g.m.e0.c.a.l;
    } 
    a((V)view, a, b);
  }
  
  private void h(int paramInt) {
    boolean bool;
    if (paramInt == 2)
      return; 
    if (paramInt == 3) {
      bool = true;
    } else {
      bool = false;
    } 
    if (this.j != bool) {
      this.j = bool;
      if (this.h != null) {
        ValueAnimator valueAnimator = this.l;
        if (valueAnimator != null) {
          float f;
          if (valueAnimator.isRunning()) {
            this.l.reverse();
            return;
          } 
          if (bool) {
            f = 0.0F;
          } else {
            f = 1.0F;
          } 
          this.l.setFloatValues(new float[] { 1.0F - f, f });
          this.l.start();
        } 
      } 
    } 
  }
  
  View a(View paramView) {
    if (v.J(paramView))
      return paramView; 
    if (paramView instanceof ViewGroup) {
      ViewGroup viewGroup = (ViewGroup)paramView;
      int i = 0;
      int j = viewGroup.getChildCount();
      while (i < j) {
        View view = a(viewGroup.getChildAt(i));
        if (view != null)
          return view; 
        i++;
      } 
    } 
    return null;
  }
  
  public void a() {
    super.a();
    this.B = null;
    this.v = null;
  }
  
  public void a(float paramFloat) {
    if (paramFloat > 0.0F && paramFloat < 1.0F) {
      this.p = paramFloat;
      return;
    } 
    throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
  }
  
  void a(int paramInt) {
    View view = (View)this.B.get();
    if (view != null && !this.D.isEmpty()) {
      float f2;
      int i = this.q;
      if (paramInt > i) {
        f2 = (i - paramInt);
        f1 = (this.A - i);
      } else {
        f2 = (i - paramInt);
        f1 = (i - e());
      } 
      float f1 = f2 / f1;
      for (paramInt = 0; paramInt < this.D.size(); paramInt++)
        ((e)this.D.get(paramInt)).a(view, f1); 
    } 
  }
  
  public final void a(int paramInt, boolean paramBoolean) {
    // Byte code:
    //   0: iconst_1
    //   1: istore_3
    //   2: iload_1
    //   3: iconst_m1
    //   4: if_icmpne -> 24
    //   7: aload_0
    //   8: getfield e : Z
    //   11: ifne -> 42
    //   14: aload_0
    //   15: iconst_1
    //   16: putfield e : Z
    //   19: iload_3
    //   20: istore_1
    //   21: goto -> 63
    //   24: aload_0
    //   25: getfield e : Z
    //   28: ifne -> 47
    //   31: aload_0
    //   32: getfield d : I
    //   35: iload_1
    //   36: if_icmpeq -> 42
    //   39: goto -> 47
    //   42: iconst_0
    //   43: istore_1
    //   44: goto -> 63
    //   47: aload_0
    //   48: iconst_0
    //   49: putfield e : Z
    //   52: aload_0
    //   53: iconst_0
    //   54: iload_1
    //   55: invokestatic max : (II)I
    //   58: putfield d : I
    //   61: iload_3
    //   62: istore_1
    //   63: iload_1
    //   64: ifeq -> 121
    //   67: aload_0
    //   68: getfield B : Ljava/lang/ref/WeakReference;
    //   71: ifnull -> 121
    //   74: aload_0
    //   75: invokespecial b : ()V
    //   78: aload_0
    //   79: getfield u : I
    //   82: iconst_4
    //   83: if_icmpne -> 121
    //   86: aload_0
    //   87: getfield B : Ljava/lang/ref/WeakReference;
    //   90: invokevirtual get : ()Ljava/lang/Object;
    //   93: checkcast android/view/View
    //   96: astore #4
    //   98: aload #4
    //   100: ifnull -> 121
    //   103: iload_2
    //   104: ifeq -> 116
    //   107: aload_0
    //   108: aload_0
    //   109: getfield u : I
    //   112: invokespecial g : (I)V
    //   115: return
    //   116: aload #4
    //   118: invokevirtual requestLayout : ()V
    //   121: return
  }
  
  void a(View paramView, int paramInt) {
    StringBuilder stringBuilder;
    int i;
    if (paramInt == 4) {
      i = this.q;
    } else if (paramInt == 6) {
      i = this.o;
      if (this.b) {
        int j = this.n;
        if (i <= j) {
          i = j;
          paramInt = 3;
        } 
      } 
    } else if (paramInt == 3) {
      i = e();
    } else if (this.s && paramInt == 5) {
      i = this.A;
    } else {
      stringBuilder = new StringBuilder();
      stringBuilder.append("Illegal state argument: ");
      stringBuilder.append(paramInt);
      throw new IllegalArgumentException(stringBuilder.toString());
    } 
    a((View)stringBuilder, paramInt, i, false);
  }
  
  void a(View paramView, int paramInt1, int paramInt2, boolean paramBoolean) {
    if (paramBoolean) {
      paramBoolean = this.v.d(paramView.getLeft(), paramInt2);
    } else {
      paramBoolean = this.v.b(paramView, paramView.getLeft(), paramInt2);
    } 
    if (paramBoolean) {
      f(2);
      h(paramInt1);
      if (this.k == null)
        this.k = new g(this, paramView, paramInt1); 
      if (!g.a(this.k)) {
        g g1 = this.k;
        g1.e = paramInt1;
        v.a(paramView, g1);
        g.a(this.k, true);
        return;
      } 
      this.k.e = paramInt1;
      return;
    } 
    f(paramInt1);
  }
  
  public void a(CoordinatorLayout.f paramf) {
    super.a(paramf);
    this.B = null;
    this.v = null;
  }
  
  public void a(CoordinatorLayout paramCoordinatorLayout, V paramV, Parcelable paramParcelable) {
    // Byte code:
    //   0: aload_3
    //   1: checkcast com/google/android/material/bottomsheet/BottomSheetBehavior$f
    //   4: astore_3
    //   5: aload_0
    //   6: aload_1
    //   7: aload_2
    //   8: aload_3
    //   9: invokevirtual e : ()Landroid/os/Parcelable;
    //   12: invokespecial a : (Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/os/Parcelable;)V
    //   15: aload_0
    //   16: aload_3
    //   17: invokespecial a : (Lcom/google/android/material/bottomsheet/BottomSheetBehavior$f;)V
    //   20: aload_3
    //   21: getfield e : I
    //   24: istore #5
    //   26: iload #5
    //   28: iconst_1
    //   29: if_icmpeq -> 42
    //   32: iload #5
    //   34: istore #4
    //   36: iload #5
    //   38: iconst_2
    //   39: if_icmpne -> 45
    //   42: iconst_4
    //   43: istore #4
    //   45: aload_0
    //   46: iload #4
    //   48: putfield u : I
    //   51: return
  }
  
  public void a(CoordinatorLayout paramCoordinatorLayout, V paramV, View paramView, int paramInt) {
    // Byte code:
    //   0: aload_2
    //   1: invokevirtual getTop : ()I
    //   4: istore #4
    //   6: aload_0
    //   7: invokespecial e : ()I
    //   10: istore #6
    //   12: iconst_3
    //   13: istore #5
    //   15: iload #4
    //   17: iload #6
    //   19: if_icmpne -> 28
    //   22: aload_0
    //   23: iconst_3
    //   24: invokevirtual f : (I)V
    //   27: return
    //   28: aload_0
    //   29: getfield C : Ljava/lang/ref/WeakReference;
    //   32: astore_1
    //   33: aload_1
    //   34: ifnull -> 286
    //   37: aload_3
    //   38: aload_1
    //   39: invokevirtual get : ()Ljava/lang/Object;
    //   42: if_acmpne -> 286
    //   45: aload_0
    //   46: getfield y : Z
    //   49: ifne -> 53
    //   52: return
    //   53: aload_0
    //   54: getfield x : I
    //   57: ifle -> 69
    //   60: aload_0
    //   61: invokespecial e : ()I
    //   64: istore #4
    //   66: goto -> 271
    //   69: aload_0
    //   70: getfield s : Z
    //   73: ifeq -> 100
    //   76: aload_0
    //   77: aload_2
    //   78: aload_0
    //   79: invokespecial f : ()F
    //   82: invokevirtual a : (Landroid/view/View;F)Z
    //   85: ifeq -> 100
    //   88: aload_0
    //   89: getfield A : I
    //   92: istore #4
    //   94: iconst_5
    //   95: istore #5
    //   97: goto -> 271
    //   100: aload_0
    //   101: getfield x : I
    //   104: ifne -> 213
    //   107: aload_2
    //   108: invokevirtual getTop : ()I
    //   111: istore #4
    //   113: aload_0
    //   114: getfield b : Z
    //   117: ifeq -> 152
    //   120: iload #4
    //   122: aload_0
    //   123: getfield n : I
    //   126: isub
    //   127: invokestatic abs : (I)I
    //   130: iload #4
    //   132: aload_0
    //   133: getfield q : I
    //   136: isub
    //   137: invokestatic abs : (I)I
    //   140: if_icmpge -> 220
    //   143: aload_0
    //   144: getfield n : I
    //   147: istore #4
    //   149: goto -> 271
    //   152: aload_0
    //   153: getfield o : I
    //   156: istore #6
    //   158: iload #4
    //   160: iload #6
    //   162: if_icmpge -> 189
    //   165: iload #4
    //   167: iload #4
    //   169: aload_0
    //   170: getfield q : I
    //   173: isub
    //   174: invokestatic abs : (I)I
    //   177: if_icmpge -> 261
    //   180: aload_0
    //   181: getfield m : I
    //   184: istore #4
    //   186: goto -> 271
    //   189: iload #4
    //   191: iload #6
    //   193: isub
    //   194: invokestatic abs : (I)I
    //   197: iload #4
    //   199: aload_0
    //   200: getfield q : I
    //   203: isub
    //   204: invokestatic abs : (I)I
    //   207: if_icmpge -> 220
    //   210: goto -> 261
    //   213: aload_0
    //   214: getfield b : Z
    //   217: ifeq -> 232
    //   220: aload_0
    //   221: getfield q : I
    //   224: istore #4
    //   226: iconst_4
    //   227: istore #5
    //   229: goto -> 271
    //   232: aload_2
    //   233: invokevirtual getTop : ()I
    //   236: istore #4
    //   238: iload #4
    //   240: aload_0
    //   241: getfield o : I
    //   244: isub
    //   245: invokestatic abs : (I)I
    //   248: iload #4
    //   250: aload_0
    //   251: getfield q : I
    //   254: isub
    //   255: invokestatic abs : (I)I
    //   258: if_icmpge -> 220
    //   261: aload_0
    //   262: getfield o : I
    //   265: istore #4
    //   267: bipush #6
    //   269: istore #5
    //   271: aload_0
    //   272: aload_2
    //   273: iload #5
    //   275: iload #4
    //   277: iconst_0
    //   278: invokevirtual a : (Landroid/view/View;IIZ)V
    //   281: aload_0
    //   282: iconst_0
    //   283: putfield y : Z
    //   286: return
  }
  
  public void a(CoordinatorLayout paramCoordinatorLayout, V paramV, View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int[] paramArrayOfint) {}
  
  public void a(CoordinatorLayout paramCoordinatorLayout, V paramV, View paramView, int paramInt1, int paramInt2, int[] paramArrayOfint, int paramInt3) {
    // Byte code:
    //   0: iload #7
    //   2: iconst_1
    //   3: if_icmpne -> 7
    //   6: return
    //   7: aload_0
    //   8: getfield C : Ljava/lang/ref/WeakReference;
    //   11: astore_1
    //   12: aload_1
    //   13: ifnull -> 27
    //   16: aload_1
    //   17: invokevirtual get : ()Ljava/lang/Object;
    //   20: checkcast android/view/View
    //   23: astore_1
    //   24: goto -> 29
    //   27: aconst_null
    //   28: astore_1
    //   29: aload_3
    //   30: aload_1
    //   31: if_acmpeq -> 35
    //   34: return
    //   35: aload_2
    //   36: invokevirtual getTop : ()I
    //   39: istore #4
    //   41: iload #4
    //   43: iload #5
    //   45: isub
    //   46: istore #7
    //   48: iload #5
    //   50: ifle -> 115
    //   53: iload #7
    //   55: aload_0
    //   56: invokespecial e : ()I
    //   59: if_icmpge -> 94
    //   62: aload #6
    //   64: iconst_1
    //   65: iload #4
    //   67: aload_0
    //   68: invokespecial e : ()I
    //   71: isub
    //   72: iastore
    //   73: aload_2
    //   74: aload #6
    //   76: iconst_1
    //   77: iaload
    //   78: ineg
    //   79: invokestatic e : (Landroid/view/View;I)V
    //   82: iconst_3
    //   83: istore #4
    //   85: aload_0
    //   86: iload #4
    //   88: invokevirtual f : (I)V
    //   91: goto -> 184
    //   94: aload #6
    //   96: iconst_1
    //   97: iload #5
    //   99: iastore
    //   100: aload_2
    //   101: iload #5
    //   103: ineg
    //   104: invokestatic e : (Landroid/view/View;I)V
    //   107: aload_0
    //   108: iconst_1
    //   109: invokevirtual f : (I)V
    //   112: goto -> 184
    //   115: iload #5
    //   117: ifge -> 184
    //   120: aload_3
    //   121: iconst_m1
    //   122: invokevirtual canScrollVertically : (I)Z
    //   125: ifne -> 184
    //   128: aload_0
    //   129: getfield q : I
    //   132: istore #8
    //   134: iload #7
    //   136: iload #8
    //   138: if_icmple -> 175
    //   141: aload_0
    //   142: getfield s : Z
    //   145: ifeq -> 151
    //   148: goto -> 175
    //   151: aload #6
    //   153: iconst_1
    //   154: iload #4
    //   156: iload #8
    //   158: isub
    //   159: iastore
    //   160: aload_2
    //   161: aload #6
    //   163: iconst_1
    //   164: iaload
    //   165: ineg
    //   166: invokestatic e : (Landroid/view/View;I)V
    //   169: iconst_4
    //   170: istore #4
    //   172: goto -> 85
    //   175: aload #6
    //   177: iconst_1
    //   178: iload #5
    //   180: iastore
    //   181: goto -> 100
    //   184: aload_0
    //   185: aload_2
    //   186: invokevirtual getTop : ()I
    //   189: invokevirtual a : (I)V
    //   192: aload_0
    //   193: iload #5
    //   195: putfield x : I
    //   198: aload_0
    //   199: iconst_1
    //   200: putfield y : Z
    //   203: return
  }
  
  public void a(boolean paramBoolean) {
    int i;
    if (this.b == paramBoolean)
      return; 
    this.b = paramBoolean;
    if (this.B != null)
      b(); 
    if (this.b && this.u == 6) {
      i = 3;
    } else {
      i = this.u;
    } 
    f(i);
    h();
  }
  
  boolean a(View paramView, float paramFloat) {
    return this.t ? true : ((paramView.getTop() < this.q) ? false : ((Math.abs(paramView.getTop() + paramFloat * 0.1F - this.q) / this.d > 0.5F)));
  }
  
  public boolean a(CoordinatorLayout paramCoordinatorLayout, V paramV, int paramInt) {
    if (v.m((View)paramCoordinatorLayout) && !v.m((View)paramV))
      paramV.setFitsSystemWindows(true); 
    if (this.B == null) {
      this.f = paramCoordinatorLayout.getResources().getDimensionPixelSize(e.f.a.f.d.design_bottom_sheet_peek_height_min);
      this.B = new WeakReference<V>(paramV);
      if (this.g) {
        e.f.a.f.a0.g g2 = this.h;
        if (g2 != null)
          v.a((View)paramV, (Drawable)g2); 
      } 
      e.f.a.f.a0.g g1 = this.h;
      if (g1 != null) {
        boolean bool;
        float f2 = this.r;
        float f1 = f2;
        if (f2 == -1.0F)
          f1 = v.l((View)paramV); 
        g1.a(f1);
        if (this.u == 3) {
          bool = true;
        } else {
          bool = false;
        } 
        this.j = bool;
        g1 = this.h;
        if (this.j) {
          f1 = 0.0F;
        } else {
          f1 = 1.0F;
        } 
        g1.b(f1);
      } 
      h();
      if (v.n((View)paramV) == 0)
        v.h((View)paramV, 1); 
    } 
    if (this.v == null)
      this.v = b.i.b.c.a((ViewGroup)paramCoordinatorLayout, this.J); 
    int i = paramV.getTop();
    paramCoordinatorLayout.c((View)paramV, paramInt);
    this.z = paramCoordinatorLayout.getWidth();
    this.A = paramCoordinatorLayout.getHeight();
    this.n = Math.max(0, this.A - paramV.getHeight());
    c();
    b();
    paramInt = this.u;
    if (paramInt == 3) {
      paramInt = e();
    } else if (paramInt == 6) {
      paramInt = this.o;
    } else if (this.s && paramInt == 5) {
      paramInt = this.A;
    } else {
      paramInt = this.u;
      if (paramInt == 4) {
        paramInt = this.q;
      } else {
        if (paramInt == 1 || paramInt == 2)
          v.e((View)paramV, i - paramV.getTop()); 
        this.C = new WeakReference<View>(a((View)paramV));
        return true;
      } 
    } 
    v.e((View)paramV, paramInt);
    this.C = new WeakReference<View>(a((View)paramV));
    return true;
  }
  
  public boolean a(CoordinatorLayout paramCoordinatorLayout, V paramV, MotionEvent paramMotionEvent) {
    View view;
    boolean bool = paramV.isShown();
    boolean bool1 = false;
    if (!bool) {
      this.w = true;
      return false;
    } 
    int i = paramMotionEvent.getActionMasked();
    if (i == 0)
      g(); 
    if (this.E == null)
      this.E = VelocityTracker.obtain(); 
    this.E.addMovement(paramMotionEvent);
    V v = null;
    if (i != 0) {
      if (i == 1 || i == 3) {
        this.H = false;
        this.F = -1;
        if (this.w) {
          this.w = false;
          return false;
        } 
      } 
    } else {
      int j = (int)paramMotionEvent.getX();
      this.G = (int)paramMotionEvent.getY();
      if (this.u != 2) {
        WeakReference<View> weakReference1 = this.C;
        if (weakReference1 != null) {
          View view1 = weakReference1.get();
        } else {
          weakReference1 = null;
        } 
        if (weakReference1 != null && paramCoordinatorLayout.a((View)weakReference1, j, this.G)) {
          this.F = paramMotionEvent.getPointerId(paramMotionEvent.getActionIndex());
          this.H = true;
        } 
      } 
      if (this.F == -1 && !paramCoordinatorLayout.a((View)paramV, j, this.G)) {
        bool = true;
      } else {
        bool = false;
      } 
      this.w = bool;
    } 
    if (!this.w) {
      b.i.b.c c1 = this.v;
      if (c1 != null && c1.b(paramMotionEvent))
        return true; 
    } 
    WeakReference<View> weakReference = this.C;
    paramV = v;
    if (weakReference != null)
      view = weakReference.get(); 
    bool = bool1;
    if (i == 2) {
      bool = bool1;
      if (view != null) {
        bool = bool1;
        if (!this.w) {
          bool = bool1;
          if (this.u != 1) {
            bool = bool1;
            if (!paramCoordinatorLayout.a(view, (int)paramMotionEvent.getX(), (int)paramMotionEvent.getY())) {
              bool = bool1;
              if (this.v != null) {
                bool = bool1;
                if (Math.abs(this.G - paramMotionEvent.getY()) > this.v.d())
                  bool = true; 
              } 
            } 
          } 
        } 
      } 
    } 
    return bool;
  }
  
  public boolean a(CoordinatorLayout paramCoordinatorLayout, V paramV, View paramView, float paramFloat1, float paramFloat2) {
    WeakReference<View> weakReference = this.C;
    boolean bool = false;
    null = bool;
    if (weakReference != null) {
      null = bool;
      if (paramView == weakReference.get()) {
        if (this.u == 3) {
          null = bool;
          return super.a(paramCoordinatorLayout, (View)paramV, paramView, paramFloat1, paramFloat2) ? true : null;
        } 
      } else {
        return null;
      } 
    } else {
      return null;
    } 
    return true;
  }
  
  public void b(int paramInt) {
    if (paramInt >= 0) {
      this.m = paramInt;
      return;
    } 
    throw new IllegalArgumentException("offset must be greater than or equal to 0");
  }
  
  public void b(boolean paramBoolean) {
    if (this.s != paramBoolean) {
      this.s = paramBoolean;
      if (!paramBoolean && this.u == 5)
        e(4); 
      h();
    } 
  }
  
  public boolean b(CoordinatorLayout paramCoordinatorLayout, V paramV, MotionEvent paramMotionEvent) {
    if (!paramV.isShown())
      return false; 
    int i = paramMotionEvent.getActionMasked();
    if (this.u == 1 && i == 0)
      return true; 
    b.i.b.c c1 = this.v;
    if (c1 != null)
      c1.a(paramMotionEvent); 
    if (i == 0)
      g(); 
    if (this.E == null)
      this.E = VelocityTracker.obtain(); 
    this.E.addMovement(paramMotionEvent);
    if (i == 2 && !this.w && Math.abs(this.G - paramMotionEvent.getY()) > this.v.d())
      this.v.a((View)paramV, paramMotionEvent.getPointerId(paramMotionEvent.getActionIndex())); 
    return this.w ^ true;
  }
  
  public boolean b(CoordinatorLayout paramCoordinatorLayout, V paramV, View paramView1, View paramView2, int paramInt1, int paramInt2) {
    boolean bool = false;
    this.x = 0;
    this.y = false;
    if ((paramInt1 & 0x2) != 0)
      bool = true; 
    return bool;
  }
  
  public void c(int paramInt) {
    a(paramInt, false);
  }
  
  public void c(boolean paramBoolean) {
    this.t = paramBoolean;
  }
  
  public Parcelable d(CoordinatorLayout paramCoordinatorLayout, V paramV) {
    return (Parcelable)new f(super.d(paramCoordinatorLayout, (View)paramV), this);
  }
  
  public void d(int paramInt) {
    this.a = paramInt;
  }
  
  public void e(int paramInt) {
    if (paramInt == this.u)
      return; 
    if (this.B == null) {
      if (paramInt == 4 || paramInt == 3 || paramInt == 6 || (this.s && paramInt == 5))
        this.u = paramInt; 
      return;
    } 
    g(paramInt);
  }
  
  void f(int paramInt) {
    if (this.u == paramInt)
      return; 
    this.u = paramInt;
    WeakReference<V> weakReference = this.B;
    if (weakReference == null)
      return; 
    View view = (View)weakReference.get();
    if (view == null)
      return; 
    int i = 0;
    if (paramInt == 6 || paramInt == 3) {
      d(true);
    } else if (paramInt == 5 || paramInt == 4) {
      d(false);
    } 
    h(paramInt);
    while (i < this.D.size()) {
      ((e)this.D.get(i)).a(view, paramInt);
      i++;
    } 
    h();
  }
  
  class a implements Runnable {
    a(BottomSheetBehavior this$0, View param1View, int param1Int) {}
    
    public void run() {
      this.e.a(this.c, this.d);
    }
  }
  
  class b implements ValueAnimator.AnimatorUpdateListener {
    b(BottomSheetBehavior this$0) {}
    
    public void onAnimationUpdate(ValueAnimator param1ValueAnimator) {
      float f = ((Float)param1ValueAnimator.getAnimatedValue()).floatValue();
      if (BottomSheetBehavior.a(this.a) != null)
        BottomSheetBehavior.a(this.a).b(f); 
    }
  }
  
  class c extends b.i.b.c.c {
    c(BottomSheetBehavior this$0) {}
    
    public int a(View param1View, int param1Int1, int param1Int2) {
      return param1View.getLeft();
    }
    
    public void a(View param1View, float param1Float1, float param1Float2) {
      // Byte code:
      //   0: iconst_4
      //   1: istore #4
      //   3: fload_3
      //   4: fconst_0
      //   5: fcmpg
      //   6: ifge -> 73
      //   9: aload_0
      //   10: getfield a : Lcom/google/android/material/bottomsheet/BottomSheetBehavior;
      //   13: invokestatic b : (Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)Z
      //   16: ifeq -> 34
      //   19: aload_0
      //   20: getfield a : Lcom/google/android/material/bottomsheet/BottomSheetBehavior;
      //   23: getfield n : I
      //   26: istore #5
      //   28: iconst_3
      //   29: istore #4
      //   31: goto -> 355
      //   34: aload_1
      //   35: invokevirtual getTop : ()I
      //   38: istore #4
      //   40: aload_0
      //   41: getfield a : Lcom/google/android/material/bottomsheet/BottomSheetBehavior;
      //   44: astore #7
      //   46: aload #7
      //   48: getfield o : I
      //   51: istore #5
      //   53: iload #4
      //   55: iload #5
      //   57: if_icmple -> 63
      //   60: goto -> 225
      //   63: aload #7
      //   65: getfield m : I
      //   68: istore #5
      //   70: goto -> 28
      //   73: aload_0
      //   74: getfield a : Lcom/google/android/material/bottomsheet/BottomSheetBehavior;
      //   77: astore #7
      //   79: aload #7
      //   81: getfield s : Z
      //   84: ifeq -> 138
      //   87: aload #7
      //   89: aload_1
      //   90: fload_3
      //   91: invokevirtual a : (Landroid/view/View;F)Z
      //   94: ifeq -> 138
      //   97: aload_1
      //   98: invokevirtual getTop : ()I
      //   101: aload_0
      //   102: getfield a : Lcom/google/android/material/bottomsheet/BottomSheetBehavior;
      //   105: getfield q : I
      //   108: if_icmpgt -> 123
      //   111: fload_2
      //   112: invokestatic abs : (F)F
      //   115: fload_3
      //   116: invokestatic abs : (F)F
      //   119: fcmpg
      //   120: ifge -> 138
      //   123: aload_0
      //   124: getfield a : Lcom/google/android/material/bottomsheet/BottomSheetBehavior;
      //   127: getfield A : I
      //   130: istore #5
      //   132: iconst_5
      //   133: istore #4
      //   135: goto -> 355
      //   138: fload_3
      //   139: fconst_0
      //   140: fcmpl
      //   141: ifeq -> 232
      //   144: fload_2
      //   145: invokestatic abs : (F)F
      //   148: fload_3
      //   149: invokestatic abs : (F)F
      //   152: fcmpl
      //   153: ifle -> 159
      //   156: goto -> 232
      //   159: aload_0
      //   160: getfield a : Lcom/google/android/material/bottomsheet/BottomSheetBehavior;
      //   163: invokestatic b : (Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)Z
      //   166: ifeq -> 181
      //   169: aload_0
      //   170: getfield a : Lcom/google/android/material/bottomsheet/BottomSheetBehavior;
      //   173: getfield q : I
      //   176: istore #5
      //   178: goto -> 355
      //   181: aload_1
      //   182: invokevirtual getTop : ()I
      //   185: istore #5
      //   187: iload #5
      //   189: aload_0
      //   190: getfield a : Lcom/google/android/material/bottomsheet/BottomSheetBehavior;
      //   193: getfield o : I
      //   196: isub
      //   197: invokestatic abs : (I)I
      //   200: iload #5
      //   202: aload_0
      //   203: getfield a : Lcom/google/android/material/bottomsheet/BottomSheetBehavior;
      //   206: getfield q : I
      //   209: isub
      //   210: invokestatic abs : (I)I
      //   213: if_icmpge -> 169
      //   216: aload_0
      //   217: getfield a : Lcom/google/android/material/bottomsheet/BottomSheetBehavior;
      //   220: getfield o : I
      //   223: istore #5
      //   225: bipush #6
      //   227: istore #4
      //   229: goto -> 355
      //   232: aload_1
      //   233: invokevirtual getTop : ()I
      //   236: istore #5
      //   238: aload_0
      //   239: getfield a : Lcom/google/android/material/bottomsheet/BottomSheetBehavior;
      //   242: invokestatic b : (Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)Z
      //   245: ifeq -> 280
      //   248: iload #5
      //   250: aload_0
      //   251: getfield a : Lcom/google/android/material/bottomsheet/BottomSheetBehavior;
      //   254: getfield n : I
      //   257: isub
      //   258: invokestatic abs : (I)I
      //   261: iload #5
      //   263: aload_0
      //   264: getfield a : Lcom/google/android/material/bottomsheet/BottomSheetBehavior;
      //   267: getfield q : I
      //   270: isub
      //   271: invokestatic abs : (I)I
      //   274: if_icmpge -> 169
      //   277: goto -> 19
      //   280: aload_0
      //   281: getfield a : Lcom/google/android/material/bottomsheet/BottomSheetBehavior;
      //   284: astore #7
      //   286: aload #7
      //   288: getfield o : I
      //   291: istore #6
      //   293: iload #5
      //   295: iload #6
      //   297: if_icmpge -> 328
      //   300: iload #5
      //   302: iload #5
      //   304: aload #7
      //   306: getfield q : I
      //   309: isub
      //   310: invokestatic abs : (I)I
      //   313: if_icmpge -> 216
      //   316: aload_0
      //   317: getfield a : Lcom/google/android/material/bottomsheet/BottomSheetBehavior;
      //   320: getfield m : I
      //   323: istore #5
      //   325: goto -> 28
      //   328: iload #5
      //   330: iload #6
      //   332: isub
      //   333: invokestatic abs : (I)I
      //   336: iload #5
      //   338: aload_0
      //   339: getfield a : Lcom/google/android/material/bottomsheet/BottomSheetBehavior;
      //   342: getfield q : I
      //   345: isub
      //   346: invokestatic abs : (I)I
      //   349: if_icmpge -> 169
      //   352: goto -> 216
      //   355: aload_0
      //   356: getfield a : Lcom/google/android/material/bottomsheet/BottomSheetBehavior;
      //   359: aload_1
      //   360: iload #4
      //   362: iload #5
      //   364: iconst_1
      //   365: invokevirtual a : (Landroid/view/View;IIZ)V
      //   368: return
    }
    
    public void a(View param1View, int param1Int1, int param1Int2, int param1Int3, int param1Int4) {
      this.a.a(param1Int2);
    }
    
    public int b(View param1View) {
      BottomSheetBehavior bottomSheetBehavior = this.a;
      return bottomSheetBehavior.s ? bottomSheetBehavior.A : bottomSheetBehavior.q;
    }
    
    public int b(View param1View, int param1Int1, int param1Int2) {
      int i = BottomSheetBehavior.c(this.a);
      BottomSheetBehavior bottomSheetBehavior = this.a;
      if (bottomSheetBehavior.s) {
        param1Int2 = bottomSheetBehavior.A;
      } else {
        param1Int2 = bottomSheetBehavior.q;
      } 
      return b.g.i.a.a(param1Int1, i, param1Int2);
    }
    
    public boolean b(View param1View, int param1Int) {
      BottomSheetBehavior bottomSheetBehavior = this.a;
      int i = bottomSheetBehavior.u;
      if (i == 1)
        return false; 
      if (bottomSheetBehavior.H)
        return false; 
      if (i == 3 && bottomSheetBehavior.F == param1Int) {
        WeakReference<View> weakReference1 = bottomSheetBehavior.C;
        if (weakReference1 != null) {
          View view = weakReference1.get();
        } else {
          weakReference1 = null;
        } 
        if (weakReference1 != null && weakReference1.canScrollVertically(-1))
          return false; 
      } 
      WeakReference<View> weakReference = this.a.B;
      return (weakReference != null && weakReference.get() == param1View);
    }
    
    public void c(int param1Int) {
      if (param1Int == 1)
        this.a.f(1); 
    }
  }
  
  class d implements b.g.m.e0.f {
    d(BottomSheetBehavior this$0, int param1Int) {}
    
    public boolean a(View param1View, b.g.m.e0.f.a param1a) {
      this.b.e(this.a);
      return true;
    }
  }
  
  public static abstract class e {
    public abstract void a(View param1View, float param1Float);
    
    public abstract void a(View param1View, int param1Int);
  }
  
  protected static class f extends b.i.a.a {
    public static final Parcelable.Creator<f> CREATOR = (Parcelable.Creator<f>)new a();
    
    final int e;
    
    int f;
    
    boolean g;
    
    boolean h;
    
    boolean i;
    
    public f(Parcel param1Parcel, ClassLoader param1ClassLoader) {
      super(param1Parcel, param1ClassLoader);
      this.e = param1Parcel.readInt();
      this.f = param1Parcel.readInt();
      int i = param1Parcel.readInt();
      boolean bool2 = false;
      if (i == 1) {
        bool1 = true;
      } else {
        bool1 = false;
      } 
      this.g = bool1;
      if (param1Parcel.readInt() == 1) {
        bool1 = true;
      } else {
        bool1 = false;
      } 
      this.h = bool1;
      boolean bool1 = bool2;
      if (param1Parcel.readInt() == 1)
        bool1 = true; 
      this.i = bool1;
    }
    
    public f(Parcelable param1Parcelable, BottomSheetBehavior<?> param1BottomSheetBehavior) {
      super(param1Parcelable);
      this.e = param1BottomSheetBehavior.u;
      this.f = BottomSheetBehavior.d(param1BottomSheetBehavior);
      this.g = BottomSheetBehavior.b(param1BottomSheetBehavior);
      this.h = param1BottomSheetBehavior.s;
      this.i = BottomSheetBehavior.e(param1BottomSheetBehavior);
    }
    
    public void writeToParcel(Parcel param1Parcel, int param1Int) {
      throw new RuntimeException("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }
    
    static final class a implements Parcelable.ClassLoaderCreator<f> {
      public BottomSheetBehavior.f createFromParcel(Parcel param2Parcel) {
        return new BottomSheetBehavior.f(param2Parcel, null);
      }
      
      public BottomSheetBehavior.f createFromParcel(Parcel param2Parcel, ClassLoader param2ClassLoader) {
        return new BottomSheetBehavior.f(param2Parcel, param2ClassLoader);
      }
      
      public BottomSheetBehavior.f[] newArray(int param2Int) {
        return new BottomSheetBehavior.f[param2Int];
      }
    }
  }
  
  static final class a implements Parcelable.ClassLoaderCreator<f> {
    public BottomSheetBehavior.f createFromParcel(Parcel param1Parcel) {
      return new BottomSheetBehavior.f(param1Parcel, null);
    }
    
    public BottomSheetBehavior.f createFromParcel(Parcel param1Parcel, ClassLoader param1ClassLoader) {
      return new BottomSheetBehavior.f(param1Parcel, param1ClassLoader);
    }
    
    public BottomSheetBehavior.f[] newArray(int param1Int) {
      return new BottomSheetBehavior.f[param1Int];
    }
  }
  
  private class g implements Runnable {
    private final View c;
    
    private boolean d;
    
    int e;
    
    g(BottomSheetBehavior this$0, View param1View, int param1Int) {
      this.c = param1View;
      this.e = param1Int;
    }
    
    public void run() {
      b.i.b.c c = this.f.v;
      if (c != null && c.a(true)) {
        v.a(this.c, this);
      } else {
        this.f.f(this.e);
      } 
      this.d = false;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/material/bottomsheet/BottomSheetBehavior.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */