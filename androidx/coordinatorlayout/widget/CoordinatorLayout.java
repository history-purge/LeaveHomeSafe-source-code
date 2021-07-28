package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import b.g.m.d0;
import b.g.m.n;
import b.g.m.o;
import b.g.m.q;
import b.g.m.r;
import b.g.m.v;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CoordinatorLayout extends ViewGroup implements n, o {
  private static final androidx.core.util.d<Rect> A;
  
  static final String w;
  
  static final Class<?>[] x = new Class[] { Context.class, AttributeSet.class };
  
  static final ThreadLocal<Map<String, Constructor<c>>> y = new ThreadLocal<Map<String, Constructor<c>>>();
  
  static final Comparator<View> z;
  
  private final List<View> c;
  
  private final a<View> d;
  
  private final List<View> e;
  
  private final List<View> f;
  
  private Paint g;
  
  private final int[] h;
  
  private final int[] i;
  
  private boolean j;
  
  private boolean k;
  
  private int[] l;
  
  private View m;
  
  private View n;
  
  private g o;
  
  private boolean p;
  
  private d0 q;
  
  private boolean r;
  
  private Drawable s;
  
  ViewGroup.OnHierarchyChangeListener t;
  
  private r u;
  
  private final q v;
  
  static {
    A = (androidx.core.util.d<Rect>)new androidx.core.util.e(12);
  }
  
  public CoordinatorLayout(Context paramContext) {
    this(paramContext, null);
  }
  
  public CoordinatorLayout(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, b.f.a.coordinatorLayoutStyle);
  }
  
  public CoordinatorLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    TypedArray typedArray;
    this.c = new ArrayList<View>();
    this.d = new a<View>();
    this.e = new ArrayList<View>();
    this.f = new ArrayList<View>();
    this.h = new int[2];
    this.i = new int[2];
    this.v = new q(this);
    boolean bool = false;
    int[] arrayOfInt = b.f.c.CoordinatorLayout;
    if (paramInt == 0) {
      typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, arrayOfInt, 0, b.f.b.Widget_Support_CoordinatorLayout);
    } else {
      typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, (int[])typedArray, paramInt, 0);
    } 
    if (Build.VERSION.SDK_INT >= 29) {
      int[] arrayOfInt1 = b.f.c.CoordinatorLayout;
      if (paramInt == 0) {
        saveAttributeDataForStyleable(paramContext, arrayOfInt1, paramAttributeSet, typedArray, 0, b.f.b.Widget_Support_CoordinatorLayout);
      } else {
        saveAttributeDataForStyleable(paramContext, arrayOfInt1, paramAttributeSet, typedArray, paramInt, 0);
      } 
    } 
    paramInt = typedArray.getResourceId(b.f.c.CoordinatorLayout_keylines, 0);
    if (paramInt != 0) {
      Resources resources = paramContext.getResources();
      this.l = resources.getIntArray(paramInt);
      float f = (resources.getDisplayMetrics()).density;
      int i = this.l.length;
      for (paramInt = bool; paramInt < i; paramInt++) {
        int[] arrayOfInt1 = this.l;
        arrayOfInt1[paramInt] = (int)(arrayOfInt1[paramInt] * f);
      } 
    } 
    this.s = typedArray.getDrawable(b.f.c.CoordinatorLayout_statusBarBackground);
    typedArray.recycle();
    f();
    super.setOnHierarchyChangeListener(new e(this));
    if (v.n((View)this) == 0)
      v.h((View)this, 1); 
  }
  
  private static int a(int paramInt1, int paramInt2, int paramInt3) {
    return (paramInt1 < paramInt2) ? paramInt2 : ((paramInt1 > paramInt3) ? paramInt3 : paramInt1);
  }
  
  static c a(Context paramContext, AttributeSet paramAttributeSet, String paramString) {
    String str;
    if (TextUtils.isEmpty(paramString))
      return null; 
    if (paramString.startsWith(".")) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(paramContext.getPackageName());
      stringBuilder.append(paramString);
      str = stringBuilder.toString();
    } else if (paramString.indexOf('.') >= 0) {
      str = paramString;
    } else {
      str = paramString;
      if (!TextUtils.isEmpty(w)) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(w);
        stringBuilder.append('.');
        stringBuilder.append(paramString);
        str = stringBuilder.toString();
      } 
    } 
    try {
      Map<Object, Object> map2 = (Map)y.get();
      Map<Object, Object> map1 = map2;
      if (map2 == null) {
        map1 = new HashMap<Object, Object>();
        y.set(map1);
      } 
      Constructor<?> constructor2 = (Constructor)map1.get(str);
      Constructor<?> constructor1 = constructor2;
      if (constructor2 == null) {
        constructor1 = Class.forName(str, false, paramContext.getClassLoader()).getConstructor(x);
        constructor1.setAccessible(true);
        map1.put(str, constructor1);
      } 
      return (c)constructor1.newInstance(new Object[] { paramContext, paramAttributeSet });
    } catch (Exception exception) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Could not inflate Behavior subclass ");
      stringBuilder.append(str);
      throw new RuntimeException(stringBuilder.toString(), exception);
    } 
  }
  
  private static void a(Rect paramRect) {
    paramRect.setEmpty();
    A.a(paramRect);
  }
  
  private void a(View paramView, int paramInt1, Rect paramRect1, Rect paramRect2, f paramf, int paramInt2, int paramInt3) {
    int i = b.g.m.d.a(c(paramf.c), paramInt1);
    paramInt1 = b.g.m.d.a(d(paramf.d), paramInt1);
    int m = i & 0x7;
    int k = i & 0x70;
    int j = paramInt1 & 0x7;
    i = paramInt1 & 0x70;
    if (j != 1) {
      if (j != 5) {
        paramInt1 = paramRect1.left;
      } else {
        paramInt1 = paramRect1.right;
      } 
    } else {
      paramInt1 = paramRect1.left + paramRect1.width() / 2;
    } 
    if (i != 16) {
      if (i != 80) {
        i = paramRect1.top;
      } else {
        i = paramRect1.bottom;
      } 
    } else {
      i = paramRect1.top + paramRect1.height() / 2;
    } 
    if (m != 1) {
      j = paramInt1;
      if (m != 5)
        j = paramInt1 - paramInt2; 
    } else {
      j = paramInt1 - paramInt2 / 2;
    } 
    if (k != 16) {
      paramInt1 = i;
      if (k != 80)
        paramInt1 = i - paramInt3; 
    } else {
      paramInt1 = i - paramInt3 / 2;
    } 
    paramRect2.set(j, paramInt1, paramInt2 + j, paramInt3 + paramInt1);
  }
  
  private void a(View paramView, Rect paramRect, int paramInt) {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic I : (Landroid/view/View;)Z
    //   4: ifne -> 8
    //   7: return
    //   8: aload_1
    //   9: invokevirtual getWidth : ()I
    //   12: ifle -> 460
    //   15: aload_1
    //   16: invokevirtual getHeight : ()I
    //   19: ifgt -> 23
    //   22: return
    //   23: aload_1
    //   24: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   27: checkcast androidx/coordinatorlayout/widget/CoordinatorLayout$f
    //   30: astore #10
    //   32: aload #10
    //   34: invokevirtual d : ()Landroidx/coordinatorlayout/widget/CoordinatorLayout$c;
    //   37: astore #11
    //   39: invokestatic d : ()Landroid/graphics/Rect;
    //   42: astore #8
    //   44: invokestatic d : ()Landroid/graphics/Rect;
    //   47: astore #9
    //   49: aload #9
    //   51: aload_1
    //   52: invokevirtual getLeft : ()I
    //   55: aload_1
    //   56: invokevirtual getTop : ()I
    //   59: aload_1
    //   60: invokevirtual getRight : ()I
    //   63: aload_1
    //   64: invokevirtual getBottom : ()I
    //   67: invokevirtual set : (IIII)V
    //   70: aload #11
    //   72: ifnull -> 156
    //   75: aload #11
    //   77: aload_0
    //   78: aload_1
    //   79: aload #8
    //   81: invokevirtual a : (Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/graphics/Rect;)Z
    //   84: ifeq -> 156
    //   87: aload #9
    //   89: aload #8
    //   91: invokevirtual contains : (Landroid/graphics/Rect;)Z
    //   94: ifeq -> 100
    //   97: goto -> 163
    //   100: new java/lang/StringBuilder
    //   103: dup
    //   104: invokespecial <init> : ()V
    //   107: astore_1
    //   108: aload_1
    //   109: ldc_w 'Rect should be within the child's bounds. Rect:'
    //   112: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   115: pop
    //   116: aload_1
    //   117: aload #8
    //   119: invokevirtual toShortString : ()Ljava/lang/String;
    //   122: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   125: pop
    //   126: aload_1
    //   127: ldc_w ' | Bounds:'
    //   130: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   133: pop
    //   134: aload_1
    //   135: aload #9
    //   137: invokevirtual toShortString : ()Ljava/lang/String;
    //   140: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   143: pop
    //   144: new java/lang/IllegalArgumentException
    //   147: dup
    //   148: aload_1
    //   149: invokevirtual toString : ()Ljava/lang/String;
    //   152: invokespecial <init> : (Ljava/lang/String;)V
    //   155: athrow
    //   156: aload #8
    //   158: aload #9
    //   160: invokevirtual set : (Landroid/graphics/Rect;)V
    //   163: aload #9
    //   165: invokestatic a : (Landroid/graphics/Rect;)V
    //   168: aload #8
    //   170: invokevirtual isEmpty : ()Z
    //   173: ifeq -> 182
    //   176: aload #8
    //   178: invokestatic a : (Landroid/graphics/Rect;)V
    //   181: return
    //   182: aload #10
    //   184: getfield h : I
    //   187: iload_3
    //   188: invokestatic a : (II)I
    //   191: istore #5
    //   193: iload #5
    //   195: bipush #48
    //   197: iand
    //   198: bipush #48
    //   200: if_icmpne -> 247
    //   203: aload #8
    //   205: getfield top : I
    //   208: aload #10
    //   210: getfield topMargin : I
    //   213: isub
    //   214: aload #10
    //   216: getfield j : I
    //   219: isub
    //   220: istore_3
    //   221: aload_2
    //   222: getfield top : I
    //   225: istore #4
    //   227: iload_3
    //   228: iload #4
    //   230: if_icmpge -> 247
    //   233: aload_0
    //   234: aload_1
    //   235: iload #4
    //   237: iload_3
    //   238: isub
    //   239: invokespecial f : (Landroid/view/View;I)V
    //   242: iconst_1
    //   243: istore_3
    //   244: goto -> 249
    //   247: iconst_0
    //   248: istore_3
    //   249: iload_3
    //   250: istore #4
    //   252: iload #5
    //   254: bipush #80
    //   256: iand
    //   257: bipush #80
    //   259: if_icmpne -> 315
    //   262: aload_0
    //   263: invokevirtual getHeight : ()I
    //   266: aload #8
    //   268: getfield bottom : I
    //   271: isub
    //   272: aload #10
    //   274: getfield bottomMargin : I
    //   277: isub
    //   278: aload #10
    //   280: getfield j : I
    //   283: iadd
    //   284: istore #6
    //   286: aload_2
    //   287: getfield bottom : I
    //   290: istore #7
    //   292: iload_3
    //   293: istore #4
    //   295: iload #6
    //   297: iload #7
    //   299: if_icmpge -> 315
    //   302: aload_0
    //   303: aload_1
    //   304: iload #6
    //   306: iload #7
    //   308: isub
    //   309: invokespecial f : (Landroid/view/View;I)V
    //   312: iconst_1
    //   313: istore #4
    //   315: iload #4
    //   317: ifne -> 326
    //   320: aload_0
    //   321: aload_1
    //   322: iconst_0
    //   323: invokespecial f : (Landroid/view/View;I)V
    //   326: iload #5
    //   328: iconst_3
    //   329: iand
    //   330: iconst_3
    //   331: if_icmpne -> 378
    //   334: aload #8
    //   336: getfield left : I
    //   339: aload #10
    //   341: getfield leftMargin : I
    //   344: isub
    //   345: aload #10
    //   347: getfield i : I
    //   350: isub
    //   351: istore_3
    //   352: aload_2
    //   353: getfield left : I
    //   356: istore #4
    //   358: iload_3
    //   359: iload #4
    //   361: if_icmpge -> 378
    //   364: aload_0
    //   365: aload_1
    //   366: iload #4
    //   368: iload_3
    //   369: isub
    //   370: invokespecial e : (Landroid/view/View;I)V
    //   373: iconst_1
    //   374: istore_3
    //   375: goto -> 380
    //   378: iconst_0
    //   379: istore_3
    //   380: iload_3
    //   381: istore #4
    //   383: iload #5
    //   385: iconst_5
    //   386: iand
    //   387: iconst_5
    //   388: if_icmpne -> 444
    //   391: aload_0
    //   392: invokevirtual getWidth : ()I
    //   395: aload #8
    //   397: getfield right : I
    //   400: isub
    //   401: aload #10
    //   403: getfield rightMargin : I
    //   406: isub
    //   407: aload #10
    //   409: getfield i : I
    //   412: iadd
    //   413: istore #5
    //   415: aload_2
    //   416: getfield right : I
    //   419: istore #6
    //   421: iload_3
    //   422: istore #4
    //   424: iload #5
    //   426: iload #6
    //   428: if_icmpge -> 444
    //   431: aload_0
    //   432: aload_1
    //   433: iload #5
    //   435: iload #6
    //   437: isub
    //   438: invokespecial e : (Landroid/view/View;I)V
    //   441: iconst_1
    //   442: istore #4
    //   444: iload #4
    //   446: ifne -> 455
    //   449: aload_0
    //   450: aload_1
    //   451: iconst_0
    //   452: invokespecial e : (Landroid/view/View;I)V
    //   455: aload #8
    //   457: invokestatic a : (Landroid/graphics/Rect;)V
    //   460: return
  }
  
  private void a(View paramView1, View paramView2, int paramInt) {
    Rect rect1 = d();
    Rect rect2 = d();
    try {
      a(paramView2, rect1);
      a(paramView1, paramInt, rect1, rect2);
      paramView1.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
      return;
    } finally {
      a(rect1);
      a(rect2);
    } 
  }
  
  private void a(f paramf, Rect paramRect, int paramInt1, int paramInt2) {
    int j = getWidth();
    int i = getHeight();
    j = Math.max(getPaddingLeft() + paramf.leftMargin, Math.min(paramRect.left, j - getPaddingRight() - paramInt1 - paramf.rightMargin));
    i = Math.max(getPaddingTop() + paramf.topMargin, Math.min(paramRect.top, i - getPaddingBottom() - paramInt2 - paramf.bottomMargin));
    paramRect.set(j, i, paramInt1 + j, paramInt2 + i);
  }
  
  private void a(List<View> paramList) {
    paramList.clear();
    boolean bool = isChildrenDrawingOrderEnabled();
    int j = getChildCount();
    for (int i = j - 1; i >= 0; i--) {
      int k;
      if (bool) {
        k = getChildDrawingOrder(j, i);
      } else {
        k = i;
      } 
      paramList.add(getChildAt(k));
    } 
    Comparator<View> comparator = z;
    if (comparator != null)
      Collections.sort(paramList, comparator); 
  }
  
  private void a(boolean paramBoolean) {
    int j = getChildCount();
    int i;
    for (i = 0; i < j; i++) {
      View view = getChildAt(i);
      c<View> c = ((f)view.getLayoutParams()).d();
      if (c != null) {
        long l = SystemClock.uptimeMillis();
        MotionEvent motionEvent = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
        if (paramBoolean) {
          c.a(this, view, motionEvent);
        } else {
          c.b(this, view, motionEvent);
        } 
        motionEvent.recycle();
      } 
    } 
    for (i = 0; i < j; i++)
      ((f)getChildAt(i).getLayoutParams()).h(); 
    this.m = null;
    this.j = false;
  }
  
  private boolean a(MotionEvent paramMotionEvent, int paramInt) {
    boolean bool2;
    int j = paramMotionEvent.getActionMasked();
    List<View> list = this.e;
    a(list);
    int k = list.size();
    f f = null;
    int i = 0;
    boolean bool1 = false;
    boolean bool = false;
    while (true) {
      bool2 = bool1;
      if (i < k) {
        MotionEvent motionEvent;
        f f1;
        View view = list.get(i);
        f f2 = (f)view.getLayoutParams();
        c<View> c = f2.d();
        boolean bool3 = true;
        if ((bool1 || bool) && j != 0) {
          bool2 = bool1;
          bool3 = bool;
          f2 = f;
          if (c != null) {
            f2 = f;
            if (f == null) {
              long l = SystemClock.uptimeMillis();
              motionEvent = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
            } 
            if (paramInt != 0) {
              if (paramInt != 1) {
                bool2 = bool1;
                bool3 = bool;
              } else {
                c.b(this, view, motionEvent);
                bool2 = bool1;
                bool3 = bool;
              } 
            } else {
              c.a(this, view, motionEvent);
              bool2 = bool1;
              bool3 = bool;
            } 
          } 
        } else {
          bool2 = bool1;
          if (!bool1) {
            bool2 = bool1;
            if (c != null) {
              if (paramInt != 0) {
                if (paramInt == 1)
                  bool1 = c.b(this, view, paramMotionEvent); 
              } else {
                bool1 = c.a(this, view, paramMotionEvent);
              } 
              bool2 = bool1;
              if (bool1) {
                this.m = view;
                bool2 = bool1;
              } 
            } 
          } 
          bool1 = motionEvent.b();
          boolean bool4 = motionEvent.b(this, view);
          if (bool4 && !bool1) {
            bool = bool3;
          } else {
            bool = false;
          } 
          if (bool4 && !bool)
            break; 
          f1 = f;
          bool3 = bool;
        } 
        i++;
        bool1 = bool2;
        bool = bool3;
        f = f1;
        continue;
      } 
      break;
    } 
    list.clear();
    return bool2;
  }
  
  private int b(int paramInt) {
    StringBuilder stringBuilder;
    int[] arrayOfInt = this.l;
    if (arrayOfInt == null) {
      stringBuilder = new StringBuilder();
      stringBuilder.append("No keylines defined for ");
      stringBuilder.append(this);
      stringBuilder.append(" - attempted index lookup ");
      stringBuilder.append(paramInt);
      Log.e("CoordinatorLayout", stringBuilder.toString());
      return 0;
    } 
    if (paramInt < 0 || paramInt >= stringBuilder.length) {
      stringBuilder = new StringBuilder();
      stringBuilder.append("Keyline index ");
      stringBuilder.append(paramInt);
      stringBuilder.append(" out of range for ");
      stringBuilder.append(this);
      Log.e("CoordinatorLayout", stringBuilder.toString());
      return 0;
    } 
    return stringBuilder[paramInt];
  }
  
  private d0 b(d0 paramd0) {
    if (paramd0.i())
      return paramd0; 
    int i = 0;
    int j = getChildCount();
    d0 d01;
    for (d01 = paramd0; i < j; d01 = paramd0) {
      View view = getChildAt(i);
      paramd0 = d01;
      if (v.m(view)) {
        c<View> c = ((f)view.getLayoutParams()).d();
        paramd0 = d01;
        if (c != null) {
          d01 = c.a(this, view, d01);
          paramd0 = d01;
          if (d01.i())
            return d01; 
        } 
      } 
      i++;
    } 
    return d01;
  }
  
  private void b(View paramView, int paramInt1, int paramInt2) {
    f f = (f)paramView.getLayoutParams();
    int i = b.g.m.d.a(e(f.c), paramInt2);
    int i3 = i & 0x7;
    int i2 = i & 0x70;
    int i1 = getWidth();
    int m = getHeight();
    int j = paramView.getMeasuredWidth();
    int k = paramView.getMeasuredHeight();
    i = paramInt1;
    if (paramInt2 == 1)
      i = i1 - paramInt1; 
    paramInt1 = b(i) - j;
    paramInt2 = 0;
    if (i3 != 1) {
      if (i3 == 5)
        paramInt1 += j; 
    } else {
      paramInt1 += j / 2;
    } 
    if (i2 != 16) {
      if (i2 == 80)
        paramInt2 = k + 0; 
    } else {
      paramInt2 = 0 + k / 2;
    } 
    paramInt1 = Math.max(getPaddingLeft() + f.leftMargin, Math.min(paramInt1, i1 - getPaddingRight() - j - f.rightMargin));
    paramInt2 = Math.max(getPaddingTop() + f.topMargin, Math.min(paramInt2, m - getPaddingBottom() - k - f.bottomMargin));
    paramView.layout(paramInt1, paramInt2, j + paramInt1, k + paramInt2);
  }
  
  private static int c(int paramInt) {
    int i = paramInt;
    if (paramInt == 0)
      i = 17; 
    return i;
  }
  
  private static int d(int paramInt) {
    int i = paramInt;
    if ((paramInt & 0x7) == 0)
      i = paramInt | 0x800003; 
    paramInt = i;
    if ((i & 0x70) == 0)
      paramInt = i | 0x30; 
    return paramInt;
  }
  
  private static Rect d() {
    Rect rect2 = (Rect)A.a();
    Rect rect1 = rect2;
    if (rect2 == null)
      rect1 = new Rect(); 
    return rect1;
  }
  
  private void d(View paramView, int paramInt) {
    f f = (f)paramView.getLayoutParams();
    Rect rect1 = d();
    rect1.set(getPaddingLeft() + f.leftMargin, getPaddingTop() + f.topMargin, getWidth() - getPaddingRight() - f.rightMargin, getHeight() - getPaddingBottom() - f.bottomMargin);
    if (this.q != null && v.m((View)this) && !v.m(paramView)) {
      rect1.left += this.q.e();
      rect1.top += this.q.g();
      rect1.right -= this.q.f();
      rect1.bottom -= this.q.d();
    } 
    Rect rect2 = d();
    b.g.m.d.a(d(f.c), paramView.getMeasuredWidth(), paramView.getMeasuredHeight(), rect1, rect2, paramInt);
    paramView.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
    a(rect1);
    a(rect2);
  }
  
  private static int e(int paramInt) {
    int i = paramInt;
    if (paramInt == 0)
      i = 8388661; 
    return i;
  }
  
  private void e() {
    this.c.clear();
    this.d.a();
    int j = getChildCount();
    for (int i = 0; i < j; i++) {
      View view = getChildAt(i);
      f f = d(view);
      f.a(this, view);
      this.d.a(view);
      for (int k = 0; k < j; k++) {
        if (k != i) {
          View view1 = getChildAt(k);
          if (f.a(this, view, view1)) {
            if (!this.d.b(view1))
              this.d.a(view1); 
            this.d.a(view1, view);
          } 
        } 
      } 
    } 
    this.c.addAll(this.d.b());
    Collections.reverse(this.c);
  }
  
  private void e(View paramView, int paramInt) {
    f f = (f)paramView.getLayoutParams();
    int i = f.i;
    if (i != paramInt) {
      v.d(paramView, paramInt - i);
      f.i = paramInt;
    } 
  }
  
  private boolean e(View paramView) {
    return this.d.e(paramView);
  }
  
  private void f() {
    if (Build.VERSION.SDK_INT < 21)
      return; 
    if (v.m((View)this)) {
      if (this.u == null)
        this.u = new a(this); 
      v.a((View)this, this.u);
      setSystemUiVisibility(1280);
      return;
    } 
    v.a((View)this, null);
  }
  
  private void f(View paramView, int paramInt) {
    f f = (f)paramView.getLayoutParams();
    int i = f.j;
    if (i != paramInt) {
      v.e(paramView, paramInt - i);
      f.j = paramInt;
    } 
  }
  
  final d0 a(d0 paramd0) {
    d0 d01 = paramd0;
    if (!androidx.core.util.b.a(this.q, paramd0)) {
      boolean bool1;
      this.q = paramd0;
      boolean bool2 = true;
      if (paramd0 != null && paramd0.g() > 0) {
        bool1 = true;
      } else {
        bool1 = false;
      } 
      this.r = bool1;
      if (!this.r && getBackground() == null) {
        bool1 = bool2;
      } else {
        bool1 = false;
      } 
      setWillNotDraw(bool1);
      d01 = b(paramd0);
      requestLayout();
    } 
    return d01;
  }
  
  void a() {
    if (this.k) {
      if (this.o == null)
        this.o = new g(this); 
      getViewTreeObserver().addOnPreDrawListener(this.o);
    } 
    this.p = true;
  }
  
  final void a(int paramInt) {
    int j = v.p((View)this);
    int k = this.c.size();
    Rect rect1 = d();
    Rect rect2 = d();
    Rect rect3 = d();
    for (int i = 0; i < k; i++) {
      View view = this.c.get(i);
      f f = (f)view.getLayoutParams();
      if (paramInt == 0 && view.getVisibility() == 8)
        continue; 
      int m;
      for (m = 0; m < i; m++) {
        View view1 = this.c.get(m);
        if (f.l == view1)
          b(view, j); 
      } 
      a(view, true, rect2);
      if (f.g != 0 && !rect2.isEmpty()) {
        m = b.g.m.d.a(f.g, j);
        int i1 = m & 0x70;
        if (i1 != 48) {
          if (i1 == 80)
            rect1.bottom = Math.max(rect1.bottom, getHeight() - rect2.top); 
        } else {
          rect1.top = Math.max(rect1.top, rect2.bottom);
        } 
        m &= 0x7;
        if (m != 3) {
          if (m == 5)
            rect1.right = Math.max(rect1.right, getWidth() - rect2.left); 
        } else {
          rect1.left = Math.max(rect1.left, rect2.right);
        } 
      } 
      if (f.h != 0 && view.getVisibility() == 0)
        a(view, rect1, j); 
      if (paramInt != 2) {
        b(view, rect3);
        if (rect3.equals(rect2))
          continue; 
        c(view, rect2);
      } 
      for (m = i + 1; m < k; m++) {
        View view1 = this.c.get(m);
        f f1 = (f)view1.getLayoutParams();
        c<View> c = f1.d();
        if (c != null && c.a(this, view1, view))
          if (paramInt == 0 && f1.e()) {
            f1.g();
          } else {
            boolean bool;
            if (paramInt != 2) {
              bool = c.b(this, view1, view);
            } else {
              c.c(this, view1, view);
              bool = true;
            } 
            if (paramInt == 1)
              f1.a(bool); 
          }  
      } 
      continue;
    } 
    a(rect1);
    a(rect2);
    a(rect3);
  }
  
  public void a(View paramView) {
    List<View> list = this.d.c(paramView);
    if (list != null && !list.isEmpty())
      for (int i = 0; i < list.size(); i++) {
        View view = list.get(i);
        c<View> c = ((f)view.getLayoutParams()).d();
        if (c != null)
          c.b(this, view, paramView); 
      }  
  }
  
  public void a(View paramView, int paramInt) {
    this.v.a(paramView, paramInt);
    int j = getChildCount();
    for (int i = 0; i < j; i++) {
      View view = getChildAt(i);
      f f = (f)view.getLayoutParams();
      if (f.a(paramInt)) {
        c<View> c = f.d();
        if (c != null)
          c.a(this, view, paramView, paramInt); 
        f.b(paramInt);
        f.g();
      } 
    } 
    this.n = null;
  }
  
  public void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    measureChildWithMargins(paramView, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    a(paramView, paramInt1, paramInt2, paramInt3, paramInt4, 0, this.i);
  }
  
  public void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int[] paramArrayOfint) {
    int m = getChildCount();
    boolean bool = false;
    int j = 0;
    int k = 0;
    int i;
    for (i = 0; j < m; i = i1) {
      int i1;
      int i2;
      View view = getChildAt(j);
      if (view.getVisibility() == 8) {
        i2 = k;
        i1 = i;
      } else {
        f f = (f)view.getLayoutParams();
        if (!f.a(paramInt5)) {
          i2 = k;
          i1 = i;
        } else {
          c<View> c = f.d();
          i2 = k;
          i1 = i;
          if (c != null) {
            int[] arrayOfInt2 = this.h;
            arrayOfInt2[0] = 0;
            arrayOfInt2[1] = 0;
            c.a(this, view, paramView, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, arrayOfInt2);
            int[] arrayOfInt1 = this.h;
            if (paramInt3 > 0) {
              i1 = Math.max(k, arrayOfInt1[0]);
            } else {
              i1 = Math.min(k, arrayOfInt1[0]);
            } 
            if (paramInt4 > 0) {
              i = Math.max(i, this.h[1]);
            } else {
              i = Math.min(i, this.h[1]);
            } 
            i2 = i1;
            i1 = i;
            bool = true;
          } 
        } 
      } 
      j++;
      k = i2;
    } 
    paramArrayOfint[0] = paramArrayOfint[0] + k;
    paramArrayOfint[1] = paramArrayOfint[1] + i;
    if (bool)
      a(1); 
  }
  
  public void a(View paramView, int paramInt1, int paramInt2, int[] paramArrayOfint, int paramInt3) {
    int m = getChildCount();
    boolean bool = false;
    int j = 0;
    int k = 0;
    int i;
    for (i = 0; j < m; i = i1) {
      int i1;
      int i2;
      View view = getChildAt(j);
      if (view.getVisibility() == 8) {
        i2 = k;
        i1 = i;
      } else {
        f f = (f)view.getLayoutParams();
        if (!f.a(paramInt3)) {
          i2 = k;
          i1 = i;
        } else {
          c<View> c = f.d();
          i2 = k;
          i1 = i;
          if (c != null) {
            int[] arrayOfInt2 = this.h;
            arrayOfInt2[0] = 0;
            arrayOfInt2[1] = 0;
            c.a(this, view, paramView, paramInt1, paramInt2, arrayOfInt2, paramInt3);
            int[] arrayOfInt1 = this.h;
            if (paramInt1 > 0) {
              i1 = Math.max(k, arrayOfInt1[0]);
            } else {
              i1 = Math.min(k, arrayOfInt1[0]);
            } 
            arrayOfInt1 = this.h;
            if (paramInt2 > 0) {
              i = Math.max(i, arrayOfInt1[1]);
            } else {
              i = Math.min(i, arrayOfInt1[1]);
            } 
            i2 = i1;
            i1 = i;
            bool = true;
          } 
        } 
      } 
      j++;
      k = i2;
    } 
    paramArrayOfint[0] = k;
    paramArrayOfint[1] = i;
    if (bool)
      a(1); 
  }
  
  void a(View paramView, int paramInt, Rect paramRect1, Rect paramRect2) {
    f f = (f)paramView.getLayoutParams();
    int i = paramView.getMeasuredWidth();
    int j = paramView.getMeasuredHeight();
    a(paramView, paramInt, paramRect1, paramRect2, f, i, j);
    a(f, paramRect2, i, j);
  }
  
  void a(View paramView, Rect paramRect) {
    b.a(this, paramView, paramRect);
  }
  
  public void a(View paramView1, View paramView2, int paramInt1, int paramInt2) {
    this.v.a(paramView1, paramView2, paramInt1, paramInt2);
    this.n = paramView2;
    int j = getChildCount();
    int i;
    for (i = 0; i < j; i++) {
      View view = getChildAt(i);
      f f = (f)view.getLayoutParams();
      if (f.a(paramInt2)) {
        c<View> c = f.d();
        if (c != null)
          c.a(this, view, paramView1, paramView2, paramInt1, paramInt2); 
      } 
    } 
  }
  
  void a(View paramView, boolean paramBoolean, Rect paramRect) {
    if (paramView.isLayoutRequested() || paramView.getVisibility() == 8) {
      paramRect.setEmpty();
      return;
    } 
    if (paramBoolean) {
      a(paramView, paramRect);
      return;
    } 
    paramRect.set(paramView.getLeft(), paramView.getTop(), paramView.getRight(), paramView.getBottom());
  }
  
  public boolean a(View paramView, int paramInt1, int paramInt2) {
    Rect rect = d();
    a(paramView, rect);
    try {
      return rect.contains(paramInt1, paramInt2);
    } finally {
      a(rect);
    } 
  }
  
  public List<View> b(View paramView) {
    List<View> list = this.d.d(paramView);
    this.f.clear();
    if (list != null)
      this.f.addAll(list); 
    return this.f;
  }
  
  void b() {
    boolean bool1;
    int j = getChildCount();
    boolean bool2 = false;
    int i = 0;
    while (true) {
      bool1 = bool2;
      if (i < j) {
        if (e(getChildAt(i))) {
          bool1 = true;
          break;
        } 
        i++;
        continue;
      } 
      break;
    } 
    if (bool1 != this.p) {
      if (bool1) {
        a();
        return;
      } 
      c();
    } 
  }
  
  void b(View paramView, int paramInt) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   4: checkcast androidx/coordinatorlayout/widget/CoordinatorLayout$f
    //   7: astore #6
    //   9: aload #6
    //   11: getfield k : Landroid/view/View;
    //   14: ifnull -> 212
    //   17: invokestatic d : ()Landroid/graphics/Rect;
    //   20: astore #7
    //   22: invokestatic d : ()Landroid/graphics/Rect;
    //   25: astore #8
    //   27: invokestatic d : ()Landroid/graphics/Rect;
    //   30: astore #9
    //   32: aload_0
    //   33: aload #6
    //   35: getfield k : Landroid/view/View;
    //   38: aload #7
    //   40: invokevirtual a : (Landroid/view/View;Landroid/graphics/Rect;)V
    //   43: iconst_0
    //   44: istore_3
    //   45: aload_0
    //   46: aload_1
    //   47: iconst_0
    //   48: aload #8
    //   50: invokevirtual a : (Landroid/view/View;ZLandroid/graphics/Rect;)V
    //   53: aload_1
    //   54: invokevirtual getMeasuredWidth : ()I
    //   57: istore #4
    //   59: aload_1
    //   60: invokevirtual getMeasuredHeight : ()I
    //   63: istore #5
    //   65: aload_0
    //   66: aload_1
    //   67: iload_2
    //   68: aload #7
    //   70: aload #9
    //   72: aload #6
    //   74: iload #4
    //   76: iload #5
    //   78: invokespecial a : (Landroid/view/View;ILandroid/graphics/Rect;Landroid/graphics/Rect;Landroidx/coordinatorlayout/widget/CoordinatorLayout$f;II)V
    //   81: aload #9
    //   83: getfield left : I
    //   86: aload #8
    //   88: getfield left : I
    //   91: if_icmpne -> 109
    //   94: iload_3
    //   95: istore_2
    //   96: aload #9
    //   98: getfield top : I
    //   101: aload #8
    //   103: getfield top : I
    //   106: if_icmpeq -> 111
    //   109: iconst_1
    //   110: istore_2
    //   111: aload_0
    //   112: aload #6
    //   114: aload #9
    //   116: iload #4
    //   118: iload #5
    //   120: invokespecial a : (Landroidx/coordinatorlayout/widget/CoordinatorLayout$f;Landroid/graphics/Rect;II)V
    //   123: aload #9
    //   125: getfield left : I
    //   128: aload #8
    //   130: getfield left : I
    //   133: isub
    //   134: istore_3
    //   135: aload #9
    //   137: getfield top : I
    //   140: aload #8
    //   142: getfield top : I
    //   145: isub
    //   146: istore #4
    //   148: iload_3
    //   149: ifeq -> 157
    //   152: aload_1
    //   153: iload_3
    //   154: invokestatic d : (Landroid/view/View;I)V
    //   157: iload #4
    //   159: ifeq -> 168
    //   162: aload_1
    //   163: iload #4
    //   165: invokestatic e : (Landroid/view/View;I)V
    //   168: iload_2
    //   169: ifeq -> 197
    //   172: aload #6
    //   174: invokevirtual d : ()Landroidx/coordinatorlayout/widget/CoordinatorLayout$c;
    //   177: astore #10
    //   179: aload #10
    //   181: ifnull -> 197
    //   184: aload #10
    //   186: aload_0
    //   187: aload_1
    //   188: aload #6
    //   190: getfield k : Landroid/view/View;
    //   193: invokevirtual b : (Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;)Z
    //   196: pop
    //   197: aload #7
    //   199: invokestatic a : (Landroid/graphics/Rect;)V
    //   202: aload #8
    //   204: invokestatic a : (Landroid/graphics/Rect;)V
    //   207: aload #9
    //   209: invokestatic a : (Landroid/graphics/Rect;)V
    //   212: return
  }
  
  void b(View paramView, Rect paramRect) {
    paramRect.set(((f)paramView.getLayoutParams()).f());
  }
  
  public boolean b(View paramView1, View paramView2, int paramInt1, int paramInt2) {
    int j = getChildCount();
    int i = 0;
    boolean bool = false;
    while (i < j) {
      View view = getChildAt(i);
      if (view.getVisibility() != 8) {
        f f = (f)view.getLayoutParams();
        c<View> c = f.d();
        if (c != null) {
          boolean bool1 = c.b(this, view, paramView1, paramView2, paramInt1, paramInt2);
          f.a(paramInt2, bool1);
          bool |= bool1;
        } else {
          f.a(paramInt2, false);
        } 
      } 
      i++;
    } 
    return bool;
  }
  
  public List<View> c(View paramView) {
    List<? extends View> list = this.d.c(paramView);
    this.f.clear();
    if (list != null)
      this.f.addAll(list); 
    return this.f;
  }
  
  void c() {
    if (this.k && this.o != null)
      getViewTreeObserver().removeOnPreDrawListener(this.o); 
    this.p = false;
  }
  
  public void c(View paramView, int paramInt) {
    f f = (f)paramView.getLayoutParams();
    if (!f.a()) {
      View view = f.k;
      if (view != null) {
        a(paramView, view, paramInt);
        return;
      } 
      int i = f.e;
      if (i >= 0) {
        b(paramView, i, paramInt);
        return;
      } 
      d(paramView, paramInt);
      return;
    } 
    throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
  }
  
  void c(View paramView, Rect paramRect) {
    ((f)paramView.getLayoutParams()).a(paramRect);
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams) {
    return (paramLayoutParams instanceof f && super.checkLayoutParams(paramLayoutParams));
  }
  
  f d(View paramView) {
    f f = (f)paramView.getLayoutParams();
    if (!f.b) {
      d d1;
      if (paramView instanceof b) {
        c = ((b)paramView).getBehavior();
        if (c == null)
          Log.e("CoordinatorLayout", "Attached behavior class is null"); 
        f.a(c);
        f.b = true;
        return f;
      } 
      Class<?> clazz = c.getClass();
      c c = null;
      while (clazz != null) {
        d d2 = clazz.<d>getAnnotation(d.class);
        d1 = d2;
        if (d2 == null) {
          clazz = clazz.getSuperclass();
          d1 = d2;
        } 
      } 
      if (d1 != null)
        try {
          f.a(d1.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (Exception exception) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Default behavior class ");
          stringBuilder.append(d1.value().getName());
          stringBuilder.append(" could not be instantiated. Did you forget a default constructor?");
          Log.e("CoordinatorLayout", stringBuilder.toString(), exception);
        }  
      f.b = true;
      return f;
    } 
    return f;
  }
  
  protected boolean drawChild(Canvas paramCanvas, View paramView, long paramLong) {
    f f = (f)paramView.getLayoutParams();
    c<View> c = f.a;
    if (c != null) {
      float f1 = c.c(this, paramView);
      if (f1 > 0.0F) {
        if (this.g == null)
          this.g = new Paint(); 
        this.g.setColor(f.a.b(this, paramView));
        this.g.setAlpha(a(Math.round(f1 * 255.0F), 0, 255));
        int i = paramCanvas.save();
        if (paramView.isOpaque())
          paramCanvas.clipRect(paramView.getLeft(), paramView.getTop(), paramView.getRight(), paramView.getBottom(), Region.Op.DIFFERENCE); 
        paramCanvas.drawRect(getPaddingLeft(), getPaddingTop(), (getWidth() - getPaddingRight()), (getHeight() - getPaddingBottom()), this.g);
        paramCanvas.restoreToCount(i);
      } 
    } 
    return super.drawChild(paramCanvas, paramView, paramLong);
  }
  
  protected void drawableStateChanged() {
    super.drawableStateChanged();
    int[] arrayOfInt = getDrawableState();
    Drawable drawable = this.s;
    byte b = 0;
    int i = b;
    if (drawable != null) {
      i = b;
      if (drawable.isStateful())
        i = false | drawable.setState(arrayOfInt); 
    } 
    if (i != 0)
      invalidate(); 
  }
  
  protected f generateDefaultLayoutParams() {
    return new f(-2, -2);
  }
  
  public f generateLayoutParams(AttributeSet paramAttributeSet) {
    return new f(getContext(), paramAttributeSet);
  }
  
  protected f generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams) {
    return (paramLayoutParams instanceof f) ? new f((f)paramLayoutParams) : ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams) ? new f((ViewGroup.MarginLayoutParams)paramLayoutParams) : new f(paramLayoutParams));
  }
  
  final List<View> getDependencySortedChildren() {
    e();
    return Collections.unmodifiableList(this.c);
  }
  
  public final d0 getLastWindowInsets() {
    return this.q;
  }
  
  public int getNestedScrollAxes() {
    return this.v.a();
  }
  
  public Drawable getStatusBarBackground() {
    return this.s;
  }
  
  protected int getSuggestedMinimumHeight() {
    return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
  }
  
  protected int getSuggestedMinimumWidth() {
    return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
  }
  
  public void onAttachedToWindow() {
    super.onAttachedToWindow();
    a(false);
    if (this.p) {
      if (this.o == null)
        this.o = new g(this); 
      getViewTreeObserver().addOnPreDrawListener(this.o);
    } 
    if (this.q == null && v.m((View)this))
      v.N((View)this); 
    this.k = true;
  }
  
  public void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    a(false);
    if (this.p && this.o != null)
      getViewTreeObserver().removeOnPreDrawListener(this.o); 
    View view = this.n;
    if (view != null)
      onStopNestedScroll(view); 
    this.k = false;
  }
  
  public void onDraw(Canvas paramCanvas) {
    super.onDraw(paramCanvas);
    if (this.r && this.s != null) {
      boolean bool;
      d0 d01 = this.q;
      if (d01 != null) {
        bool = d01.g();
      } else {
        bool = false;
      } 
      if (bool) {
        this.s.setBounds(0, 0, getWidth(), bool);
        this.s.draw(paramCanvas);
      } 
    } 
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent) {
    int i = paramMotionEvent.getActionMasked();
    if (i == 0)
      a(true); 
    boolean bool = a(paramMotionEvent, 0);
    if (i == 1 || i == 3)
      a(true); 
    return bool;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    paramInt2 = v.p((View)this);
    paramInt3 = this.c.size();
    for (paramInt1 = 0; paramInt1 < paramInt3; paramInt1++) {
      View view = this.c.get(paramInt1);
      if (view.getVisibility() != 8) {
        c<View> c = ((f)view.getLayoutParams()).d();
        if (c == null || !c.a(this, view, paramInt2))
          c(view, paramInt2); 
      } 
    } 
  }
  
  protected void onMeasure(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial e : ()V
    //   4: aload_0
    //   5: invokevirtual b : ()V
    //   8: aload_0
    //   9: invokevirtual getPaddingLeft : ()I
    //   12: istore #13
    //   14: aload_0
    //   15: invokevirtual getPaddingTop : ()I
    //   18: istore #14
    //   20: aload_0
    //   21: invokevirtual getPaddingRight : ()I
    //   24: istore #15
    //   26: aload_0
    //   27: invokevirtual getPaddingBottom : ()I
    //   30: istore #16
    //   32: aload_0
    //   33: invokestatic p : (Landroid/view/View;)I
    //   36: istore #17
    //   38: iload #17
    //   40: iconst_1
    //   41: if_icmpne -> 50
    //   44: iconst_1
    //   45: istore #5
    //   47: goto -> 53
    //   50: iconst_0
    //   51: istore #5
    //   53: iload_1
    //   54: invokestatic getMode : (I)I
    //   57: istore #18
    //   59: iload_1
    //   60: invokestatic getSize : (I)I
    //   63: istore #19
    //   65: iload_2
    //   66: invokestatic getMode : (I)I
    //   69: istore #20
    //   71: iload_2
    //   72: invokestatic getSize : (I)I
    //   75: istore #21
    //   77: aload_0
    //   78: invokevirtual getSuggestedMinimumWidth : ()I
    //   81: istore #10
    //   83: aload_0
    //   84: invokevirtual getSuggestedMinimumHeight : ()I
    //   87: istore #4
    //   89: aload_0
    //   90: getfield q : Lb/g/m/d0;
    //   93: ifnull -> 109
    //   96: aload_0
    //   97: invokestatic m : (Landroid/view/View;)Z
    //   100: ifeq -> 109
    //   103: iconst_1
    //   104: istore #6
    //   106: goto -> 112
    //   109: iconst_0
    //   110: istore #6
    //   112: aload_0
    //   113: getfield c : Ljava/util/List;
    //   116: invokeinterface size : ()I
    //   121: istore #7
    //   123: iconst_0
    //   124: istore #9
    //   126: iconst_0
    //   127: istore #8
    //   129: iload #8
    //   131: iload #7
    //   133: if_icmpge -> 504
    //   136: aload_0
    //   137: getfield c : Ljava/util/List;
    //   140: iload #8
    //   142: invokeinterface get : (I)Ljava/lang/Object;
    //   147: checkcast android/view/View
    //   150: astore #25
    //   152: aload #25
    //   154: invokevirtual getVisibility : ()I
    //   157: bipush #8
    //   159: if_icmpne -> 165
    //   162: goto -> 495
    //   165: aload #25
    //   167: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   170: checkcast androidx/coordinatorlayout/widget/CoordinatorLayout$f
    //   173: astore #24
    //   175: aload #24
    //   177: getfield e : I
    //   180: istore_3
    //   181: iload_3
    //   182: iflt -> 285
    //   185: iload #18
    //   187: ifeq -> 285
    //   190: aload_0
    //   191: iload_3
    //   192: invokespecial b : (I)I
    //   195: istore_3
    //   196: aload #24
    //   198: getfield c : I
    //   201: invokestatic e : (I)I
    //   204: iload #17
    //   206: invokestatic a : (II)I
    //   209: bipush #7
    //   211: iand
    //   212: istore #11
    //   214: iload #11
    //   216: iconst_3
    //   217: if_icmpne -> 225
    //   220: iload #5
    //   222: ifeq -> 236
    //   225: iload #11
    //   227: iconst_5
    //   228: if_icmpne -> 251
    //   231: iload #5
    //   233: ifeq -> 251
    //   236: iconst_0
    //   237: iload #19
    //   239: iload #15
    //   241: isub
    //   242: iload_3
    //   243: isub
    //   244: invokestatic max : (II)I
    //   247: istore_3
    //   248: goto -> 287
    //   251: iload #11
    //   253: iconst_5
    //   254: if_icmpne -> 262
    //   257: iload #5
    //   259: ifeq -> 273
    //   262: iload #11
    //   264: iconst_3
    //   265: if_icmpne -> 285
    //   268: iload #5
    //   270: ifeq -> 285
    //   273: iconst_0
    //   274: iload_3
    //   275: iload #13
    //   277: isub
    //   278: invokestatic max : (II)I
    //   281: istore_3
    //   282: goto -> 287
    //   285: iconst_0
    //   286: istore_3
    //   287: iload #4
    //   289: istore #12
    //   291: iload #6
    //   293: ifeq -> 373
    //   296: aload #25
    //   298: invokestatic m : (Landroid/view/View;)Z
    //   301: ifne -> 373
    //   304: aload_0
    //   305: getfield q : Lb/g/m/d0;
    //   308: invokevirtual e : ()I
    //   311: istore #4
    //   313: aload_0
    //   314: getfield q : Lb/g/m/d0;
    //   317: invokevirtual f : ()I
    //   320: istore #23
    //   322: aload_0
    //   323: getfield q : Lb/g/m/d0;
    //   326: invokevirtual g : ()I
    //   329: istore #11
    //   331: aload_0
    //   332: getfield q : Lb/g/m/d0;
    //   335: invokevirtual d : ()I
    //   338: istore #22
    //   340: iload #19
    //   342: iload #4
    //   344: iload #23
    //   346: iadd
    //   347: isub
    //   348: iload #18
    //   350: invokestatic makeMeasureSpec : (II)I
    //   353: istore #4
    //   355: iload #21
    //   357: iload #11
    //   359: iload #22
    //   361: iadd
    //   362: isub
    //   363: iload #20
    //   365: invokestatic makeMeasureSpec : (II)I
    //   368: istore #11
    //   370: goto -> 379
    //   373: iload_1
    //   374: istore #4
    //   376: iload_2
    //   377: istore #11
    //   379: aload #24
    //   381: invokevirtual d : ()Landroidx/coordinatorlayout/widget/CoordinatorLayout$c;
    //   384: astore #26
    //   386: aload #26
    //   388: ifnull -> 411
    //   391: aload #26
    //   393: aload_0
    //   394: aload #25
    //   396: iload #4
    //   398: iload_3
    //   399: iload #11
    //   401: iconst_0
    //   402: invokevirtual a : (Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;IIII)Z
    //   405: ifne -> 423
    //   408: goto -> 411
    //   411: aload_0
    //   412: aload #25
    //   414: iload #4
    //   416: iload_3
    //   417: iload #11
    //   419: iconst_0
    //   420: invokevirtual a : (Landroid/view/View;IIII)V
    //   423: iload #10
    //   425: iload #13
    //   427: iload #15
    //   429: iadd
    //   430: aload #25
    //   432: invokevirtual getMeasuredWidth : ()I
    //   435: iadd
    //   436: aload #24
    //   438: getfield leftMargin : I
    //   441: iadd
    //   442: aload #24
    //   444: getfield rightMargin : I
    //   447: iadd
    //   448: invokestatic max : (II)I
    //   451: istore #10
    //   453: iload #12
    //   455: iload #14
    //   457: iload #16
    //   459: iadd
    //   460: aload #25
    //   462: invokevirtual getMeasuredHeight : ()I
    //   465: iadd
    //   466: aload #24
    //   468: getfield topMargin : I
    //   471: iadd
    //   472: aload #24
    //   474: getfield bottomMargin : I
    //   477: iadd
    //   478: invokestatic max : (II)I
    //   481: istore #4
    //   483: iload #9
    //   485: aload #25
    //   487: invokevirtual getMeasuredState : ()I
    //   490: invokestatic combineMeasuredStates : (II)I
    //   493: istore #9
    //   495: iload #8
    //   497: iconst_1
    //   498: iadd
    //   499: istore #8
    //   501: goto -> 129
    //   504: aload_0
    //   505: iload #10
    //   507: iload_1
    //   508: ldc_w -16777216
    //   511: iload #9
    //   513: iand
    //   514: invokestatic resolveSizeAndState : (III)I
    //   517: iload #4
    //   519: iload_2
    //   520: iload #9
    //   522: bipush #16
    //   524: ishl
    //   525: invokestatic resolveSizeAndState : (III)I
    //   528: invokevirtual setMeasuredDimension : (II)V
    //   531: return
  }
  
  public boolean onNestedFling(View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean) {
    int j = getChildCount();
    int i = 0;
    boolean bool;
    for (bool = false; i < j; bool = bool1) {
      boolean bool1;
      View view = getChildAt(i);
      if (view.getVisibility() == 8) {
        bool1 = bool;
      } else {
        f f = (f)view.getLayoutParams();
        if (!f.a(0)) {
          bool1 = bool;
        } else {
          c<View> c = f.d();
          bool1 = bool;
          if (c != null)
            bool1 = bool | c.a(this, view, paramView, paramFloat1, paramFloat2, paramBoolean); 
        } 
      } 
      i++;
    } 
    if (bool)
      a(1); 
    return bool;
  }
  
  public boolean onNestedPreFling(View paramView, float paramFloat1, float paramFloat2) {
    int j = getChildCount();
    int i = 0;
    boolean bool;
    for (bool = false; i < j; bool = bool1) {
      boolean bool1;
      View view = getChildAt(i);
      if (view.getVisibility() == 8) {
        bool1 = bool;
      } else {
        f f = (f)view.getLayoutParams();
        if (!f.a(0)) {
          bool1 = bool;
        } else {
          c<View> c = f.d();
          bool1 = bool;
          if (c != null)
            bool1 = bool | c.a(this, view, paramView, paramFloat1, paramFloat2); 
        } 
      } 
      i++;
    } 
    return bool;
  }
  
  public void onNestedPreScroll(View paramView, int paramInt1, int paramInt2, int[] paramArrayOfint) {
    a(paramView, paramInt1, paramInt2, paramArrayOfint, 0);
  }
  
  public void onNestedScroll(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    a(paramView, paramInt1, paramInt2, paramInt3, paramInt4, 0);
  }
  
  public void onNestedScrollAccepted(View paramView1, View paramView2, int paramInt) {
    a(paramView1, paramView2, paramInt, 0);
  }
  
  protected void onRestoreInstanceState(Parcelable paramParcelable) {
    if (!(paramParcelable instanceof h)) {
      super.onRestoreInstanceState(paramParcelable);
      return;
    } 
    h h = (h)paramParcelable;
    super.onRestoreInstanceState(h.e());
    SparseArray<Parcelable> sparseArray = h.e;
    int i = 0;
    int j = getChildCount();
    while (i < j) {
      View view = getChildAt(i);
      int k = view.getId();
      c<View> c = d(view).d();
      if (k != -1 && c != null) {
        Parcelable parcelable = (Parcelable)sparseArray.get(k);
        if (parcelable != null)
          c.a(this, view, parcelable); 
      } 
      i++;
    } 
  }
  
  protected Parcelable onSaveInstanceState() {
    h h = new h(super.onSaveInstanceState());
    SparseArray<Parcelable> sparseArray = new SparseArray();
    int j = getChildCount();
    for (int i = 0; i < j; i++) {
      View view = getChildAt(i);
      int k = view.getId();
      c<View> c = ((f)view.getLayoutParams()).d();
      if (k != -1 && c != null) {
        Parcelable parcelable = c.d(this, view);
        if (parcelable != null)
          sparseArray.append(k, parcelable); 
      } 
    } 
    h.e = sparseArray;
    return (Parcelable)h;
  }
  
  public boolean onStartNestedScroll(View paramView1, View paramView2, int paramInt) {
    return b(paramView1, paramView2, paramInt, 0);
  }
  
  public void onStopNestedScroll(View paramView) {
    a(paramView, 0);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual getActionMasked : ()I
    //   4: istore_2
    //   5: aload_0
    //   6: getfield m : Landroid/view/View;
    //   9: ifnonnull -> 29
    //   12: aload_0
    //   13: aload_1
    //   14: iconst_1
    //   15: invokespecial a : (Landroid/view/MotionEvent;I)Z
    //   18: istore_3
    //   19: iload_3
    //   20: istore #4
    //   22: iload_3
    //   23: ifeq -> 76
    //   26: goto -> 31
    //   29: iconst_0
    //   30: istore_3
    //   31: aload_0
    //   32: getfield m : Landroid/view/View;
    //   35: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   38: checkcast androidx/coordinatorlayout/widget/CoordinatorLayout$f
    //   41: invokevirtual d : ()Landroidx/coordinatorlayout/widget/CoordinatorLayout$c;
    //   44: astore #8
    //   46: iload_3
    //   47: istore #4
    //   49: aload #8
    //   51: ifnull -> 76
    //   54: aload #8
    //   56: aload_0
    //   57: aload_0
    //   58: getfield m : Landroid/view/View;
    //   61: aload_1
    //   62: invokevirtual b : (Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/MotionEvent;)Z
    //   65: istore #5
    //   67: iload_3
    //   68: istore #4
    //   70: iload #5
    //   72: istore_3
    //   73: goto -> 78
    //   76: iconst_0
    //   77: istore_3
    //   78: aload_0
    //   79: getfield m : Landroid/view/View;
    //   82: astore #9
    //   84: aconst_null
    //   85: astore #8
    //   87: aload #9
    //   89: ifnonnull -> 107
    //   92: iload_3
    //   93: aload_0
    //   94: aload_1
    //   95: invokespecial onTouchEvent : (Landroid/view/MotionEvent;)Z
    //   98: ior
    //   99: istore #5
    //   101: aload #8
    //   103: astore_1
    //   104: goto -> 144
    //   107: iload_3
    //   108: istore #5
    //   110: aload #8
    //   112: astore_1
    //   113: iload #4
    //   115: ifeq -> 144
    //   118: invokestatic uptimeMillis : ()J
    //   121: lstore #6
    //   123: lload #6
    //   125: lload #6
    //   127: iconst_3
    //   128: fconst_0
    //   129: fconst_0
    //   130: iconst_0
    //   131: invokestatic obtain : (JJIFFI)Landroid/view/MotionEvent;
    //   134: astore_1
    //   135: aload_0
    //   136: aload_1
    //   137: invokespecial onTouchEvent : (Landroid/view/MotionEvent;)Z
    //   140: pop
    //   141: iload_3
    //   142: istore #5
    //   144: aload_1
    //   145: ifnull -> 152
    //   148: aload_1
    //   149: invokevirtual recycle : ()V
    //   152: iload_2
    //   153: iconst_1
    //   154: if_icmpeq -> 162
    //   157: iload_2
    //   158: iconst_3
    //   159: if_icmpne -> 167
    //   162: aload_0
    //   163: iconst_0
    //   164: invokespecial a : (Z)V
    //   167: iload #5
    //   169: ireturn
  }
  
  public boolean requestChildRectangleOnScreen(View paramView, Rect paramRect, boolean paramBoolean) {
    c<View> c = ((f)paramView.getLayoutParams()).d();
    return (c != null && c.a(this, paramView, paramRect, paramBoolean)) ? true : super.requestChildRectangleOnScreen(paramView, paramRect, paramBoolean);
  }
  
  public void requestDisallowInterceptTouchEvent(boolean paramBoolean) {
    super.requestDisallowInterceptTouchEvent(paramBoolean);
    if (paramBoolean && !this.j) {
      a(false);
      this.j = true;
    } 
  }
  
  public void setFitsSystemWindows(boolean paramBoolean) {
    super.setFitsSystemWindows(paramBoolean);
    f();
  }
  
  public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener paramOnHierarchyChangeListener) {
    this.t = paramOnHierarchyChangeListener;
  }
  
  public void setStatusBarBackground(Drawable paramDrawable) {
    Drawable drawable = this.s;
    if (drawable != paramDrawable) {
      Drawable drawable1 = null;
      if (drawable != null)
        drawable.setCallback(null); 
      if (paramDrawable != null)
        drawable1 = paramDrawable.mutate(); 
      this.s = drawable1;
      paramDrawable = this.s;
      if (paramDrawable != null) {
        boolean bool;
        if (paramDrawable.isStateful())
          this.s.setState(getDrawableState()); 
        androidx.core.graphics.drawable.a.a(this.s, v.p((View)this));
        paramDrawable = this.s;
        if (getVisibility() == 0) {
          bool = true;
        } else {
          bool = false;
        } 
        paramDrawable.setVisible(bool, false);
        this.s.setCallback((Drawable.Callback)this);
      } 
      v.M((View)this);
    } 
  }
  
  public void setStatusBarBackgroundColor(int paramInt) {
    setStatusBarBackground((Drawable)new ColorDrawable(paramInt));
  }
  
  public void setStatusBarBackgroundResource(int paramInt) {
    Drawable drawable;
    if (paramInt != 0) {
      drawable = b.g.e.a.c(getContext(), paramInt);
    } else {
      drawable = null;
    } 
    setStatusBarBackground(drawable);
  }
  
  public void setVisibility(int paramInt) {
    boolean bool;
    super.setVisibility(paramInt);
    if (paramInt == 0) {
      bool = true;
    } else {
      bool = false;
    } 
    Drawable drawable = this.s;
    if (drawable != null && drawable.isVisible() != bool)
      this.s.setVisible(bool, false); 
  }
  
  protected boolean verifyDrawable(Drawable paramDrawable) {
    return (super.verifyDrawable(paramDrawable) || paramDrawable == this.s);
  }
  
  static {
    Package package_ = CoordinatorLayout.class.getPackage();
    if (package_ != null) {
      String str = package_.getName();
    } else {
      package_ = null;
    } 
    w = (String)package_;
    if (Build.VERSION.SDK_INT >= 21) {
      z = new i();
    } else {
      z = null;
    } 
  }
  
  class a implements r {
    a(CoordinatorLayout this$0) {}
    
    public d0 a(View param1View, d0 param1d0) {
      return this.a.a(param1d0);
    }
  }
  
  public static interface b {
    CoordinatorLayout.c getBehavior();
  }
  
  public static abstract class c<V extends View> {
    public c() {}
    
    public c(Context param1Context, AttributeSet param1AttributeSet) {}
    
    public d0 a(CoordinatorLayout param1CoordinatorLayout, V param1V, d0 param1d0) {
      return param1d0;
    }
    
    public void a() {}
    
    public void a(CoordinatorLayout.f param1f) {}
    
    public void a(CoordinatorLayout param1CoordinatorLayout, V param1V, Parcelable param1Parcelable) {}
    
    public void a(CoordinatorLayout param1CoordinatorLayout, V param1V, View param1View, int param1Int) {
      if (param1Int == 0)
        d(param1CoordinatorLayout, param1V, param1View); 
    }
    
    @Deprecated
    public void a(CoordinatorLayout param1CoordinatorLayout, V param1V, View param1View, int param1Int1, int param1Int2, int param1Int3, int param1Int4) {}
    
    @Deprecated
    public void a(CoordinatorLayout param1CoordinatorLayout, V param1V, View param1View, int param1Int1, int param1Int2, int param1Int3, int param1Int4, int param1Int5) {
      if (param1Int5 == 0)
        a(param1CoordinatorLayout, param1V, param1View, param1Int1, param1Int2, param1Int3, param1Int4); 
    }
    
    public void a(CoordinatorLayout param1CoordinatorLayout, V param1V, View param1View, int param1Int1, int param1Int2, int param1Int3, int param1Int4, int param1Int5, int[] param1ArrayOfint) {
      param1ArrayOfint[0] = param1ArrayOfint[0] + param1Int3;
      param1ArrayOfint[1] = param1ArrayOfint[1] + param1Int4;
      a(param1CoordinatorLayout, param1V, param1View, param1Int1, param1Int2, param1Int3, param1Int4, param1Int5);
    }
    
    @Deprecated
    public void a(CoordinatorLayout param1CoordinatorLayout, V param1V, View param1View, int param1Int1, int param1Int2, int[] param1ArrayOfint) {}
    
    public void a(CoordinatorLayout param1CoordinatorLayout, V param1V, View param1View, int param1Int1, int param1Int2, int[] param1ArrayOfint, int param1Int3) {
      if (param1Int3 == 0)
        a(param1CoordinatorLayout, param1V, param1View, param1Int1, param1Int2, param1ArrayOfint); 
    }
    
    @Deprecated
    public void a(CoordinatorLayout param1CoordinatorLayout, V param1V, View param1View1, View param1View2, int param1Int) {}
    
    public void a(CoordinatorLayout param1CoordinatorLayout, V param1V, View param1View1, View param1View2, int param1Int1, int param1Int2) {
      if (param1Int2 == 0)
        a(param1CoordinatorLayout, param1V, param1View1, param1View2, param1Int1); 
    }
    
    public boolean a(CoordinatorLayout param1CoordinatorLayout, V param1V) {
      return (c(param1CoordinatorLayout, param1V) > 0.0F);
    }
    
    public boolean a(CoordinatorLayout param1CoordinatorLayout, V param1V, int param1Int) {
      return false;
    }
    
    public boolean a(CoordinatorLayout param1CoordinatorLayout, V param1V, int param1Int1, int param1Int2, int param1Int3, int param1Int4) {
      return false;
    }
    
    public boolean a(CoordinatorLayout param1CoordinatorLayout, V param1V, Rect param1Rect) {
      return false;
    }
    
    public boolean a(CoordinatorLayout param1CoordinatorLayout, V param1V, Rect param1Rect, boolean param1Boolean) {
      return false;
    }
    
    public boolean a(CoordinatorLayout param1CoordinatorLayout, V param1V, MotionEvent param1MotionEvent) {
      return false;
    }
    
    public boolean a(CoordinatorLayout param1CoordinatorLayout, V param1V, View param1View) {
      return false;
    }
    
    public boolean a(CoordinatorLayout param1CoordinatorLayout, V param1V, View param1View, float param1Float1, float param1Float2) {
      return false;
    }
    
    public boolean a(CoordinatorLayout param1CoordinatorLayout, V param1V, View param1View, float param1Float1, float param1Float2, boolean param1Boolean) {
      return false;
    }
    
    public int b(CoordinatorLayout param1CoordinatorLayout, V param1V) {
      return -16777216;
    }
    
    public boolean b(CoordinatorLayout param1CoordinatorLayout, V param1V, MotionEvent param1MotionEvent) {
      return false;
    }
    
    public boolean b(CoordinatorLayout param1CoordinatorLayout, V param1V, View param1View) {
      return false;
    }
    
    @Deprecated
    public boolean b(CoordinatorLayout param1CoordinatorLayout, V param1V, View param1View1, View param1View2, int param1Int) {
      return false;
    }
    
    public boolean b(CoordinatorLayout param1CoordinatorLayout, V param1V, View param1View1, View param1View2, int param1Int1, int param1Int2) {
      return (param1Int2 == 0) ? b(param1CoordinatorLayout, param1V, param1View1, param1View2, param1Int1) : false;
    }
    
    public float c(CoordinatorLayout param1CoordinatorLayout, V param1V) {
      return 0.0F;
    }
    
    public void c(CoordinatorLayout param1CoordinatorLayout, V param1V, View param1View) {}
    
    public Parcelable d(CoordinatorLayout param1CoordinatorLayout, V param1V) {
      return (Parcelable)View.BaseSavedState.EMPTY_STATE;
    }
    
    @Deprecated
    public void d(CoordinatorLayout param1CoordinatorLayout, V param1V, View param1View) {}
  }
  
  @Deprecated
  @Retention(RetentionPolicy.RUNTIME)
  public static @interface d {
    Class<? extends CoordinatorLayout.c> value();
  }
  
  private class e implements ViewGroup.OnHierarchyChangeListener {
    e(CoordinatorLayout this$0) {}
    
    public void onChildViewAdded(View param1View1, View param1View2) {
      ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.c.t;
      if (onHierarchyChangeListener != null)
        onHierarchyChangeListener.onChildViewAdded(param1View1, param1View2); 
    }
    
    public void onChildViewRemoved(View param1View1, View param1View2) {
      this.c.a(2);
      ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.c.t;
      if (onHierarchyChangeListener != null)
        onHierarchyChangeListener.onChildViewRemoved(param1View1, param1View2); 
    }
  }
  
  public static class f extends ViewGroup.MarginLayoutParams {
    CoordinatorLayout.c a;
    
    boolean b = false;
    
    public int c = 0;
    
    public int d = 0;
    
    public int e = -1;
    
    int f = -1;
    
    public int g = 0;
    
    public int h = 0;
    
    int i;
    
    int j;
    
    View k;
    
    View l;
    
    private boolean m;
    
    private boolean n;
    
    private boolean o;
    
    private boolean p;
    
    final Rect q = new Rect();
    
    public f(int param1Int1, int param1Int2) {
      super(param1Int1, param1Int2);
    }
    
    f(Context param1Context, AttributeSet param1AttributeSet) {
      super(param1Context, param1AttributeSet);
      TypedArray typedArray = param1Context.obtainStyledAttributes(param1AttributeSet, b.f.c.CoordinatorLayout_Layout);
      this.c = typedArray.getInteger(b.f.c.CoordinatorLayout_Layout_android_layout_gravity, 0);
      this.f = typedArray.getResourceId(b.f.c.CoordinatorLayout_Layout_layout_anchor, -1);
      this.d = typedArray.getInteger(b.f.c.CoordinatorLayout_Layout_layout_anchorGravity, 0);
      this.e = typedArray.getInteger(b.f.c.CoordinatorLayout_Layout_layout_keyline, -1);
      this.g = typedArray.getInt(b.f.c.CoordinatorLayout_Layout_layout_insetEdge, 0);
      this.h = typedArray.getInt(b.f.c.CoordinatorLayout_Layout_layout_dodgeInsetEdges, 0);
      this.b = typedArray.hasValue(b.f.c.CoordinatorLayout_Layout_layout_behavior);
      if (this.b)
        this.a = CoordinatorLayout.a(param1Context, param1AttributeSet, typedArray.getString(b.f.c.CoordinatorLayout_Layout_layout_behavior)); 
      typedArray.recycle();
      CoordinatorLayout.c c1 = this.a;
      if (c1 != null)
        c1.a(this); 
    }
    
    public f(ViewGroup.LayoutParams param1LayoutParams) {
      super(param1LayoutParams);
    }
    
    public f(ViewGroup.MarginLayoutParams param1MarginLayoutParams) {
      super(param1MarginLayoutParams);
    }
    
    public f(f param1f) {
      super(param1f);
    }
    
    private void a(View param1View, CoordinatorLayout param1CoordinatorLayout) {
      this.k = param1CoordinatorLayout.findViewById(this.f);
      View view = this.k;
      if (view != null) {
        if (view == param1CoordinatorLayout) {
          if (!param1CoordinatorLayout.isInEditMode())
            throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout"); 
        } else {
          ViewParent viewParent = view.getParent();
          while (true) {
            if (viewParent != param1CoordinatorLayout && viewParent != null) {
              if (viewParent == param1View) {
                if (!param1CoordinatorLayout.isInEditMode())
                  throw new IllegalStateException("Anchor must not be a descendant of the anchored view"); 
              } else {
                if (viewParent instanceof View)
                  view = (View)viewParent; 
                viewParent = viewParent.getParent();
                continue;
              } 
            } else {
              break;
            } 
            this.l = null;
            this.k = null;
            return;
          } 
          this.l = view;
          return;
        } 
      } else if (!param1CoordinatorLayout.isInEditMode()) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Could not find CoordinatorLayout descendant view with id ");
        stringBuilder.append(param1CoordinatorLayout.getResources().getResourceName(this.f));
        stringBuilder.append(" to anchor view ");
        stringBuilder.append(param1View);
        IllegalStateException illegalStateException = new IllegalStateException(stringBuilder.toString());
        throw illegalStateException;
      } 
      this.l = null;
      this.k = null;
    }
    
    private boolean a(View param1View, int param1Int) {
      int i = b.g.m.d.a(((f)param1View.getLayoutParams()).g, param1Int);
      return (i != 0 && (b.g.m.d.a(this.h, param1Int) & i) == i);
    }
    
    private boolean b(View param1View, CoordinatorLayout param1CoordinatorLayout) {
      if (this.k.getId() != this.f)
        return false; 
      View view = this.k;
      for (ViewParent viewParent = view.getParent(); viewParent != param1CoordinatorLayout; viewParent = viewParent.getParent()) {
        if (viewParent == null || viewParent == param1View) {
          this.l = null;
          this.k = null;
          return false;
        } 
        if (viewParent instanceof View)
          view = (View)viewParent; 
      } 
      this.l = view;
      return true;
    }
    
    View a(CoordinatorLayout param1CoordinatorLayout, View param1View) {
      if (this.f == -1) {
        this.l = null;
        this.k = null;
        return null;
      } 
      if (this.k == null || !b(param1View, param1CoordinatorLayout))
        a(param1View, param1CoordinatorLayout); 
      return this.k;
    }
    
    void a(int param1Int, boolean param1Boolean) {
      if (param1Int != 0) {
        if (param1Int != 1)
          return; 
        this.o = param1Boolean;
        return;
      } 
      this.n = param1Boolean;
    }
    
    void a(Rect param1Rect) {
      this.q.set(param1Rect);
    }
    
    public void a(CoordinatorLayout.c param1c) {
      CoordinatorLayout.c c1 = this.a;
      if (c1 != param1c) {
        if (c1 != null)
          c1.a(); 
        this.a = param1c;
        this.b = true;
        if (param1c != null)
          param1c.a(this); 
      } 
    }
    
    void a(boolean param1Boolean) {
      this.p = param1Boolean;
    }
    
    boolean a() {
      return (this.k == null && this.f != -1);
    }
    
    boolean a(int param1Int) {
      return (param1Int != 0) ? ((param1Int != 1) ? false : this.o) : this.n;
    }
    
    boolean a(CoordinatorLayout param1CoordinatorLayout, View param1View1, View param1View2) {
      if (param1View2 != this.l && !a(param1View2, v.p((View)param1CoordinatorLayout))) {
        CoordinatorLayout.c<View> c1 = this.a;
        if (c1 == null || !c1.a(param1CoordinatorLayout, param1View1, param1View2))
          return false; 
      } 
      return true;
    }
    
    void b(int param1Int) {
      a(param1Int, false);
    }
    
    boolean b() {
      if (this.a == null)
        this.m = false; 
      return this.m;
    }
    
    boolean b(CoordinatorLayout param1CoordinatorLayout, View param1View) {
      boolean bool1;
      boolean bool2 = this.m;
      if (bool2)
        return true; 
      CoordinatorLayout.c<View> c1 = this.a;
      if (c1 != null) {
        bool1 = c1.a(param1CoordinatorLayout, param1View);
      } else {
        bool1 = false;
      } 
      bool1 |= bool2;
      this.m = bool1;
      return bool1;
    }
    
    public int c() {
      return this.f;
    }
    
    public CoordinatorLayout.c d() {
      return this.a;
    }
    
    boolean e() {
      return this.p;
    }
    
    Rect f() {
      return this.q;
    }
    
    void g() {
      this.p = false;
    }
    
    void h() {
      this.m = false;
    }
  }
  
  class g implements ViewTreeObserver.OnPreDrawListener {
    g(CoordinatorLayout this$0) {}
    
    public boolean onPreDraw() {
      this.c.a(0);
      return true;
    }
  }
  
  protected static class h extends b.i.a.a {
    public static final Parcelable.Creator<h> CREATOR = (Parcelable.Creator<h>)new a();
    
    SparseArray<Parcelable> e;
    
    public h(Parcel param1Parcel, ClassLoader param1ClassLoader) {
      super(param1Parcel, param1ClassLoader);
      int j = param1Parcel.readInt();
      int[] arrayOfInt = new int[j];
      param1Parcel.readIntArray(arrayOfInt);
      Parcelable[] arrayOfParcelable = param1Parcel.readParcelableArray(param1ClassLoader);
      this.e = new SparseArray(j);
      for (int i = 0; i < j; i++)
        this.e.append(arrayOfInt[i], arrayOfParcelable[i]); 
    }
    
    public h(Parcelable param1Parcelable) {
      super(param1Parcelable);
    }
    
    public void writeToParcel(Parcel param1Parcel, int param1Int) {
      byte b;
      super.writeToParcel(param1Parcel, param1Int);
      SparseArray<Parcelable> sparseArray = this.e;
      int i = 0;
      if (sparseArray != null) {
        b = sparseArray.size();
      } else {
        b = 0;
      } 
      param1Parcel.writeInt(b);
      int[] arrayOfInt = new int[b];
      Parcelable[] arrayOfParcelable = new Parcelable[b];
      while (i < b) {
        arrayOfInt[i] = this.e.keyAt(i);
        arrayOfParcelable[i] = (Parcelable)this.e.valueAt(i);
        i++;
      } 
      param1Parcel.writeIntArray(arrayOfInt);
      param1Parcel.writeParcelableArray(arrayOfParcelable, param1Int);
    }
    
    static final class a implements Parcelable.ClassLoaderCreator<h> {
      public CoordinatorLayout.h createFromParcel(Parcel param2Parcel) {
        return new CoordinatorLayout.h(param2Parcel, null);
      }
      
      public CoordinatorLayout.h createFromParcel(Parcel param2Parcel, ClassLoader param2ClassLoader) {
        return new CoordinatorLayout.h(param2Parcel, param2ClassLoader);
      }
      
      public CoordinatorLayout.h[] newArray(int param2Int) {
        return new CoordinatorLayout.h[param2Int];
      }
    }
  }
  
  static final class a implements Parcelable.ClassLoaderCreator<h> {
    public CoordinatorLayout.h createFromParcel(Parcel param1Parcel) {
      return new CoordinatorLayout.h(param1Parcel, null);
    }
    
    public CoordinatorLayout.h createFromParcel(Parcel param1Parcel, ClassLoader param1ClassLoader) {
      return new CoordinatorLayout.h(param1Parcel, param1ClassLoader);
    }
    
    public CoordinatorLayout.h[] newArray(int param1Int) {
      return new CoordinatorLayout.h[param1Int];
    }
  }
  
  static class i implements Comparator<View> {
    public int a(View param1View1, View param1View2) {
      float f1 = v.A(param1View1);
      float f2 = v.A(param1View2);
      return (f1 > f2) ? -1 : ((f1 < f2) ? 1 : 0);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/coordinatorlayout/widget/CoordinatorLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */