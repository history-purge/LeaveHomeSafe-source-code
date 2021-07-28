package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import b.e.b.k.e;
import b.e.b.k.f;
import b.e.b.k.g;
import java.util.ArrayList;
import java.util.HashMap;

public class ConstraintLayout extends ViewGroup {
  SparseArray<View> c = new SparseArray();
  
  private ArrayList<c> d = new ArrayList<c>(4);
  
  protected f e = new f();
  
  private int f = 0;
  
  private int g = 0;
  
  private int h = Integer.MAX_VALUE;
  
  private int i = Integer.MAX_VALUE;
  
  protected boolean j = true;
  
  private int k = 263;
  
  private e l = null;
  
  protected d m = null;
  
  private int n = -1;
  
  private HashMap<String, Integer> o = new HashMap<String, Integer>();
  
  private int p = -1;
  
  private int q = -1;
  
  private SparseArray<e> r = new SparseArray();
  
  c s = new c(this, this);
  
  public ConstraintLayout(Context paramContext) {
    super(paramContext);
    a((AttributeSet)null, 0, 0);
  }
  
  public ConstraintLayout(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    a(paramAttributeSet, 0, 0);
  }
  
  public ConstraintLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramAttributeSet, paramInt, 0);
  }
  
  @TargetApi(21)
  public ConstraintLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2) {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
    a(paramAttributeSet, paramInt1, paramInt2);
  }
  
  private void a(AttributeSet paramAttributeSet, int paramInt1, int paramInt2) {
    this.e.a(this);
    this.e.a(this.s);
    this.c.put(getId(), this);
    this.l = null;
    if (paramAttributeSet != null) {
      TypedArray typedArray = getContext().obtainStyledAttributes(paramAttributeSet, k.ConstraintLayout_Layout, paramInt1, paramInt2);
      paramInt2 = typedArray.getIndexCount();
      paramInt1 = 0;
      while (true) {
        if (paramInt1 < paramInt2) {
          int i = typedArray.getIndex(paramInt1);
          if (i == k.ConstraintLayout_Layout_android_minWidth) {
            this.f = typedArray.getDimensionPixelOffset(i, this.f);
          } else if (i == k.ConstraintLayout_Layout_android_minHeight) {
            this.g = typedArray.getDimensionPixelOffset(i, this.g);
          } else if (i == k.ConstraintLayout_Layout_android_maxWidth) {
            this.h = typedArray.getDimensionPixelOffset(i, this.h);
          } else if (i == k.ConstraintLayout_Layout_android_maxHeight) {
            this.i = typedArray.getDimensionPixelOffset(i, this.i);
          } else if (i == k.ConstraintLayout_Layout_layout_optimizationLevel) {
            this.k = typedArray.getInt(i, this.k);
          } else if (i == k.ConstraintLayout_Layout_layoutDescription) {
            i = typedArray.getResourceId(i, 0);
            if (i != 0)
              try {
                b(i);
              } catch (android.content.res.Resources.NotFoundException notFoundException) {
                this.m = null;
              }  
          } else if (i == k.ConstraintLayout_Layout_constraintSet) {
            i = typedArray.getResourceId(i, 0);
            try {
              this.l = new e();
              this.l.b(getContext(), i);
            } catch (android.content.res.Resources.NotFoundException notFoundException) {
              this.l = null;
            } 
            this.n = i;
          } 
          paramInt1++;
          continue;
        } 
        typedArray.recycle();
        this.e.t(this.k);
        return;
      } 
    } 
    this.e.t(this.k);
  }
  
  private void b() {
    this.j = true;
    this.p = -1;
    this.q = -1;
  }
  
  private final e c(int paramInt) {
    if (paramInt == 0)
      return (e)this.e; 
    View view2 = (View)this.c.get(paramInt);
    View view1 = view2;
    if (view2 == null) {
      view2 = findViewById(paramInt);
      view1 = view2;
      if (view2 != null) {
        view1 = view2;
        if (view2 != this) {
          view1 = view2;
          if (view2.getParent() == this) {
            onViewAdded(view2);
            view1 = view2;
          } 
        } 
      } 
    } 
    return (e)((view1 == this) ? this.e : ((view1 == null) ? null : ((b)view1.getLayoutParams()).m0));
  }
  
  private void c() {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual isInEditMode : ()Z
    //   4: istore #4
    //   6: aload_0
    //   7: invokevirtual getChildCount : ()I
    //   10: istore_2
    //   11: iconst_0
    //   12: istore_1
    //   13: iload_1
    //   14: iload_2
    //   15: if_icmpge -> 49
    //   18: aload_0
    //   19: aload_0
    //   20: iload_1
    //   21: invokevirtual getChildAt : (I)Landroid/view/View;
    //   24: invokevirtual a : (Landroid/view/View;)Lb/e/b/k/e;
    //   27: astore #5
    //   29: aload #5
    //   31: ifnonnull -> 37
    //   34: goto -> 42
    //   37: aload #5
    //   39: invokevirtual G : ()V
    //   42: iload_1
    //   43: iconst_1
    //   44: iadd
    //   45: istore_1
    //   46: goto -> 13
    //   49: iload #4
    //   51: ifeq -> 145
    //   54: iconst_0
    //   55: istore_1
    //   56: iload_1
    //   57: iload_2
    //   58: if_icmpge -> 145
    //   61: aload_0
    //   62: iload_1
    //   63: invokevirtual getChildAt : (I)Landroid/view/View;
    //   66: astore #7
    //   68: aload_0
    //   69: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   72: aload #7
    //   74: invokevirtual getId : ()I
    //   77: invokevirtual getResourceName : (I)Ljava/lang/String;
    //   80: astore #6
    //   82: aload_0
    //   83: iconst_0
    //   84: aload #6
    //   86: aload #7
    //   88: invokevirtual getId : ()I
    //   91: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   94: invokevirtual a : (ILjava/lang/Object;Ljava/lang/Object;)V
    //   97: aload #6
    //   99: bipush #47
    //   101: invokevirtual indexOf : (I)I
    //   104: istore_3
    //   105: aload #6
    //   107: astore #5
    //   109: iload_3
    //   110: iconst_m1
    //   111: if_icmpeq -> 124
    //   114: aload #6
    //   116: iload_3
    //   117: iconst_1
    //   118: iadd
    //   119: invokevirtual substring : (I)Ljava/lang/String;
    //   122: astore #5
    //   124: aload_0
    //   125: aload #7
    //   127: invokevirtual getId : ()I
    //   130: invokespecial c : (I)Lb/e/b/k/e;
    //   133: aload #5
    //   135: invokevirtual a : (Ljava/lang/String;)V
    //   138: iload_1
    //   139: iconst_1
    //   140: iadd
    //   141: istore_1
    //   142: goto -> 56
    //   145: aload_0
    //   146: getfield n : I
    //   149: iconst_m1
    //   150: if_icmpeq -> 206
    //   153: iconst_0
    //   154: istore_1
    //   155: iload_1
    //   156: iload_2
    //   157: if_icmpge -> 206
    //   160: aload_0
    //   161: iload_1
    //   162: invokevirtual getChildAt : (I)Landroid/view/View;
    //   165: astore #5
    //   167: aload #5
    //   169: invokevirtual getId : ()I
    //   172: aload_0
    //   173: getfield n : I
    //   176: if_icmpne -> 199
    //   179: aload #5
    //   181: instanceof androidx/constraintlayout/widget/f
    //   184: ifeq -> 199
    //   187: aload_0
    //   188: aload #5
    //   190: checkcast androidx/constraintlayout/widget/f
    //   193: invokevirtual getConstraintSet : ()Landroidx/constraintlayout/widget/e;
    //   196: putfield l : Landroidx/constraintlayout/widget/e;
    //   199: iload_1
    //   200: iconst_1
    //   201: iadd
    //   202: istore_1
    //   203: goto -> 155
    //   206: aload_0
    //   207: getfield l : Landroidx/constraintlayout/widget/e;
    //   210: astore #5
    //   212: aload #5
    //   214: ifnull -> 224
    //   217: aload #5
    //   219: aload_0
    //   220: iconst_1
    //   221: invokevirtual a : (Landroidx/constraintlayout/widget/ConstraintLayout;Z)V
    //   224: aload_0
    //   225: getfield e : Lb/e/b/k/f;
    //   228: invokevirtual I : ()V
    //   231: aload_0
    //   232: getfield d : Ljava/util/ArrayList;
    //   235: invokevirtual size : ()I
    //   238: istore_3
    //   239: iload_3
    //   240: ifle -> 272
    //   243: iconst_0
    //   244: istore_1
    //   245: iload_1
    //   246: iload_3
    //   247: if_icmpge -> 272
    //   250: aload_0
    //   251: getfield d : Ljava/util/ArrayList;
    //   254: iload_1
    //   255: invokevirtual get : (I)Ljava/lang/Object;
    //   258: checkcast androidx/constraintlayout/widget/c
    //   261: aload_0
    //   262: invokevirtual e : (Landroidx/constraintlayout/widget/ConstraintLayout;)V
    //   265: iload_1
    //   266: iconst_1
    //   267: iadd
    //   268: istore_1
    //   269: goto -> 245
    //   272: iconst_0
    //   273: istore_1
    //   274: iload_1
    //   275: iload_2
    //   276: if_icmpge -> 310
    //   279: aload_0
    //   280: iload_1
    //   281: invokevirtual getChildAt : (I)Landroid/view/View;
    //   284: astore #5
    //   286: aload #5
    //   288: instanceof androidx/constraintlayout/widget/i
    //   291: ifeq -> 303
    //   294: aload #5
    //   296: checkcast androidx/constraintlayout/widget/i
    //   299: aload_0
    //   300: invokevirtual b : (Landroidx/constraintlayout/widget/ConstraintLayout;)V
    //   303: iload_1
    //   304: iconst_1
    //   305: iadd
    //   306: istore_1
    //   307: goto -> 274
    //   310: aload_0
    //   311: getfield r : Landroid/util/SparseArray;
    //   314: invokevirtual clear : ()V
    //   317: aload_0
    //   318: getfield r : Landroid/util/SparseArray;
    //   321: iconst_0
    //   322: aload_0
    //   323: getfield e : Lb/e/b/k/f;
    //   326: invokevirtual put : (ILjava/lang/Object;)V
    //   329: aload_0
    //   330: getfield r : Landroid/util/SparseArray;
    //   333: aload_0
    //   334: invokevirtual getId : ()I
    //   337: aload_0
    //   338: getfield e : Lb/e/b/k/f;
    //   341: invokevirtual put : (ILjava/lang/Object;)V
    //   344: iconst_0
    //   345: istore_1
    //   346: iload_1
    //   347: iload_2
    //   348: if_icmpge -> 387
    //   351: aload_0
    //   352: iload_1
    //   353: invokevirtual getChildAt : (I)Landroid/view/View;
    //   356: astore #5
    //   358: aload_0
    //   359: aload #5
    //   361: invokevirtual a : (Landroid/view/View;)Lb/e/b/k/e;
    //   364: astore #6
    //   366: aload_0
    //   367: getfield r : Landroid/util/SparseArray;
    //   370: aload #5
    //   372: invokevirtual getId : ()I
    //   375: aload #6
    //   377: invokevirtual put : (ILjava/lang/Object;)V
    //   380: iload_1
    //   381: iconst_1
    //   382: iadd
    //   383: istore_1
    //   384: goto -> 346
    //   387: iconst_0
    //   388: istore_1
    //   389: iload_1
    //   390: iload_2
    //   391: if_icmpge -> 459
    //   394: aload_0
    //   395: iload_1
    //   396: invokevirtual getChildAt : (I)Landroid/view/View;
    //   399: astore #5
    //   401: aload_0
    //   402: aload #5
    //   404: invokevirtual a : (Landroid/view/View;)Lb/e/b/k/e;
    //   407: astore #6
    //   409: aload #6
    //   411: ifnonnull -> 417
    //   414: goto -> 452
    //   417: aload #5
    //   419: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   422: checkcast androidx/constraintlayout/widget/ConstraintLayout$b
    //   425: astore #7
    //   427: aload_0
    //   428: getfield e : Lb/e/b/k/f;
    //   431: aload #6
    //   433: invokevirtual a : (Lb/e/b/k/e;)V
    //   436: aload_0
    //   437: iload #4
    //   439: aload #5
    //   441: aload #6
    //   443: aload #7
    //   445: aload_0
    //   446: getfield r : Landroid/util/SparseArray;
    //   449: invokevirtual a : (ZLandroid/view/View;Lb/e/b/k/e;Landroidx/constraintlayout/widget/ConstraintLayout$b;Landroid/util/SparseArray;)V
    //   452: iload_1
    //   453: iconst_1
    //   454: iadd
    //   455: istore_1
    //   456: goto -> 389
    //   459: return
    //   460: astore #5
    //   462: goto -> 138
    // Exception table:
    //   from	to	target	type
    //   68	105	460	android/content/res/Resources$NotFoundException
    //   114	124	460	android/content/res/Resources$NotFoundException
    //   124	138	460	android/content/res/Resources$NotFoundException
  }
  
  private boolean d() {
    boolean bool1;
    int j = getChildCount();
    boolean bool2 = false;
    int i = 0;
    while (true) {
      bool1 = bool2;
      if (i < j) {
        if (getChildAt(i).isLayoutRequested()) {
          bool1 = true;
          break;
        } 
        i++;
        continue;
      } 
      break;
    } 
    if (bool1)
      c(); 
    return bool1;
  }
  
  private int getPaddingWidth() {
    int j = getPaddingLeft();
    int i = 0;
    j = Math.max(0, j) + Math.max(0, getPaddingRight());
    if (Build.VERSION.SDK_INT >= 17) {
      i = Math.max(0, getPaddingStart());
      i = Math.max(0, getPaddingEnd()) + i;
    } 
    if (i > 0)
      j = i; 
    return j;
  }
  
  public View a(int paramInt) {
    return (View)this.c.get(paramInt);
  }
  
  public final e a(View paramView) {
    return (e)((paramView == this) ? this.e : ((paramView == null) ? null : ((b)paramView.getLayoutParams()).m0));
  }
  
  public Object a(int paramInt, Object paramObject) {
    if (paramInt == 0 && paramObject instanceof String) {
      paramObject = paramObject;
      HashMap<String, Integer> hashMap = this.o;
      if (hashMap != null && hashMap.containsKey(paramObject))
        return this.o.get(paramObject); 
    } 
    return null;
  }
  
  protected void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean1, boolean paramBoolean2) {
    c c1 = this.s;
    int i = c1.e;
    paramInt3 += c1.d;
    paramInt4 += i;
    if (Build.VERSION.SDK_INT >= 11) {
      paramInt1 = ViewGroup.resolveSizeAndState(paramInt3, paramInt1, 0);
      paramInt3 = ViewGroup.resolveSizeAndState(paramInt4, paramInt2, 0);
      paramInt2 = Math.min(this.h, paramInt1 & 0xFFFFFF);
      paramInt3 = Math.min(this.i, paramInt3 & 0xFFFFFF);
      paramInt1 = paramInt2;
      if (paramBoolean1)
        paramInt1 = paramInt2 | 0x1000000; 
      paramInt2 = paramInt3;
      if (paramBoolean2)
        paramInt2 = paramInt3 | 0x1000000; 
      setMeasuredDimension(paramInt1, paramInt2);
      this.p = paramInt1;
      this.q = paramInt2;
      return;
    } 
    setMeasuredDimension(paramInt3, paramInt4);
    this.p = paramInt3;
    this.q = paramInt4;
  }
  
  public void a(int paramInt, Object paramObject1, Object paramObject2) {
    if (paramInt == 0 && paramObject1 instanceof String && paramObject2 instanceof Integer) {
      if (this.o == null)
        this.o = new HashMap<String, Integer>(); 
      String str = (String)paramObject1;
      paramInt = str.indexOf("/");
      paramObject1 = str;
      if (paramInt != -1)
        paramObject1 = str.substring(paramInt + 1); 
      paramInt = ((Integer)paramObject2).intValue();
      this.o.put(paramObject1, Integer.valueOf(paramInt));
    } 
  }
  
  protected void a(f paramf, int paramInt1, int paramInt2, int paramInt3) {
    int i = View.MeasureSpec.getMode(paramInt2);
    int i1 = View.MeasureSpec.getSize(paramInt2);
    int j = View.MeasureSpec.getMode(paramInt3);
    int m = View.MeasureSpec.getSize(paramInt3);
    int k = Math.max(0, getPaddingTop());
    int i3 = Math.max(0, getPaddingBottom());
    int n = k + i3;
    int i2 = getPaddingWidth();
    this.s.a(paramInt2, paramInt3, k, i3, i2, n);
    if (Build.VERSION.SDK_INT >= 17) {
      paramInt2 = Math.max(0, getPaddingStart());
      paramInt3 = Math.max(0, getPaddingEnd());
      if (paramInt2 > 0 || paramInt3 > 0) {
        if (a())
          paramInt2 = paramInt3; 
      } else {
        paramInt2 = Math.max(0, getPaddingLeft());
      } 
    } else {
      paramInt2 = Math.max(0, getPaddingLeft());
    } 
    paramInt3 = i1 - i2;
    m -= n;
    a(paramf, i, paramInt3, j, m);
    paramf.a(paramInt1, i, paramInt3, j, m, this.p, this.q, paramInt2, k);
  }
  
  protected void a(f paramf, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    // Byte code:
    //   0: aload_0
    //   1: getfield s : Landroidx/constraintlayout/widget/ConstraintLayout$c;
    //   4: astore #9
    //   6: aload #9
    //   8: getfield e : I
    //   11: istore #6
    //   13: aload #9
    //   15: getfield d : I
    //   18: istore #7
    //   20: getstatic b/e/b/k/e$b.c : Lb/e/b/k/e$b;
    //   23: astore #9
    //   25: aload_0
    //   26: invokevirtual getChildCount : ()I
    //   29: istore #8
    //   31: iload_2
    //   32: ldc_w -2147483648
    //   35: if_icmpeq -> 98
    //   38: iload_2
    //   39: ifeq -> 77
    //   42: iload_2
    //   43: ldc_w 1073741824
    //   46: if_icmpeq -> 58
    //   49: aload #9
    //   51: astore #10
    //   53: iconst_0
    //   54: istore_3
    //   55: goto -> 125
    //   58: aload_0
    //   59: getfield h : I
    //   62: iload #7
    //   64: isub
    //   65: iload_3
    //   66: invokestatic min : (II)I
    //   69: istore_3
    //   70: aload #9
    //   72: astore #10
    //   74: goto -> 125
    //   77: getstatic b/e/b/k/e$b.d : Lb/e/b/k/e$b;
    //   80: astore #11
    //   82: aload #11
    //   84: astore #10
    //   86: iload #8
    //   88: ifne -> 53
    //   91: aload #11
    //   93: astore #10
    //   95: goto -> 116
    //   98: getstatic b/e/b/k/e$b.d : Lb/e/b/k/e$b;
    //   101: astore #11
    //   103: aload #11
    //   105: astore #10
    //   107: iload #8
    //   109: ifne -> 125
    //   112: aload #11
    //   114: astore #10
    //   116: iconst_0
    //   117: aload_0
    //   118: getfield f : I
    //   121: invokestatic max : (II)I
    //   124: istore_3
    //   125: iload #4
    //   127: ldc_w -2147483648
    //   130: if_icmpeq -> 190
    //   133: iload #4
    //   135: ifeq -> 169
    //   138: iload #4
    //   140: ldc_w 1073741824
    //   143: if_icmpeq -> 152
    //   146: iconst_0
    //   147: istore #5
    //   149: goto -> 218
    //   152: aload_0
    //   153: getfield i : I
    //   156: iload #6
    //   158: isub
    //   159: iload #5
    //   161: invokestatic min : (II)I
    //   164: istore #5
    //   166: goto -> 218
    //   169: getstatic b/e/b/k/e$b.d : Lb/e/b/k/e$b;
    //   172: astore #11
    //   174: aload #11
    //   176: astore #9
    //   178: iload #8
    //   180: ifne -> 146
    //   183: aload #11
    //   185: astore #9
    //   187: goto -> 208
    //   190: getstatic b/e/b/k/e$b.d : Lb/e/b/k/e$b;
    //   193: astore #11
    //   195: aload #11
    //   197: astore #9
    //   199: iload #8
    //   201: ifne -> 218
    //   204: aload #11
    //   206: astore #9
    //   208: iconst_0
    //   209: aload_0
    //   210: getfield g : I
    //   213: invokestatic max : (II)I
    //   216: istore #5
    //   218: iload_3
    //   219: aload_1
    //   220: invokevirtual z : ()I
    //   223: if_icmpne -> 235
    //   226: iload #5
    //   228: aload_1
    //   229: invokevirtual j : ()I
    //   232: if_icmpeq -> 239
    //   235: aload_1
    //   236: invokevirtual M : ()V
    //   239: aload_1
    //   240: iconst_0
    //   241: invokevirtual q : (I)V
    //   244: aload_1
    //   245: iconst_0
    //   246: invokevirtual r : (I)V
    //   249: aload_1
    //   250: aload_0
    //   251: getfield h : I
    //   254: iload #7
    //   256: isub
    //   257: invokevirtual k : (I)V
    //   260: aload_1
    //   261: aload_0
    //   262: getfield i : I
    //   265: iload #6
    //   267: isub
    //   268: invokevirtual j : (I)V
    //   271: aload_1
    //   272: iconst_0
    //   273: invokevirtual m : (I)V
    //   276: aload_1
    //   277: iconst_0
    //   278: invokevirtual l : (I)V
    //   281: aload_1
    //   282: aload #10
    //   284: invokevirtual a : (Lb/e/b/k/e$b;)V
    //   287: aload_1
    //   288: iload_3
    //   289: invokevirtual p : (I)V
    //   292: aload_1
    //   293: aload #9
    //   295: invokevirtual b : (Lb/e/b/k/e$b;)V
    //   298: aload_1
    //   299: iload #5
    //   301: invokevirtual h : (I)V
    //   304: aload_1
    //   305: aload_0
    //   306: getfield f : I
    //   309: iload #7
    //   311: isub
    //   312: invokevirtual m : (I)V
    //   315: aload_1
    //   316: aload_0
    //   317: getfield g : I
    //   320: iload #6
    //   322: isub
    //   323: invokevirtual l : (I)V
    //   326: return
  }
  
  protected void a(boolean paramBoolean, View paramView, e parame, b paramb, SparseArray<e> paramSparseArray) {
    // Byte code:
    //   0: aload #4
    //   2: invokevirtual a : ()V
    //   5: aload #4
    //   7: iconst_0
    //   8: putfield n0 : Z
    //   11: aload_3
    //   12: aload_2
    //   13: invokevirtual getVisibility : ()I
    //   16: invokevirtual o : (I)V
    //   19: aload #4
    //   21: getfield a0 : Z
    //   24: ifeq -> 38
    //   27: aload_3
    //   28: iconst_1
    //   29: invokevirtual b : (Z)V
    //   32: aload_3
    //   33: bipush #8
    //   35: invokevirtual o : (I)V
    //   38: aload_3
    //   39: aload_2
    //   40: invokevirtual a : (Ljava/lang/Object;)V
    //   43: aload_2
    //   44: instanceof androidx/constraintlayout/widget/c
    //   47: ifeq -> 65
    //   50: aload_2
    //   51: checkcast androidx/constraintlayout/widget/c
    //   54: aload_3
    //   55: aload_0
    //   56: getfield e : Lb/e/b/k/f;
    //   59: invokevirtual O : ()Z
    //   62: invokevirtual a : (Lb/e/b/k/e;Z)V
    //   65: aload #4
    //   67: getfield Y : Z
    //   70: ifeq -> 170
    //   73: aload_3
    //   74: checkcast b/e/b/k/g
    //   77: astore_2
    //   78: aload #4
    //   80: getfield j0 : I
    //   83: istore #7
    //   85: aload #4
    //   87: getfield k0 : I
    //   90: istore #8
    //   92: aload #4
    //   94: getfield l0 : F
    //   97: fstore #6
    //   99: getstatic android/os/Build$VERSION.SDK_INT : I
    //   102: bipush #17
    //   104: if_icmpge -> 128
    //   107: aload #4
    //   109: getfield a : I
    //   112: istore #7
    //   114: aload #4
    //   116: getfield b : I
    //   119: istore #8
    //   121: aload #4
    //   123: getfield c : F
    //   126: fstore #6
    //   128: fload #6
    //   130: ldc_w -1.0
    //   133: fcmpl
    //   134: ifeq -> 144
    //   137: aload_2
    //   138: fload #6
    //   140: invokevirtual e : (F)V
    //   143: return
    //   144: iload #7
    //   146: iconst_m1
    //   147: if_icmpeq -> 157
    //   150: aload_2
    //   151: iload #7
    //   153: invokevirtual s : (I)V
    //   156: return
    //   157: iload #8
    //   159: iconst_m1
    //   160: if_icmpeq -> 1423
    //   163: aload_2
    //   164: iload #8
    //   166: invokevirtual t : (I)V
    //   169: return
    //   170: aload #4
    //   172: getfield c0 : I
    //   175: istore #8
    //   177: aload #4
    //   179: getfield d0 : I
    //   182: istore #7
    //   184: aload #4
    //   186: getfield e0 : I
    //   189: istore #10
    //   191: aload #4
    //   193: getfield f0 : I
    //   196: istore #12
    //   198: aload #4
    //   200: getfield g0 : I
    //   203: istore #9
    //   205: aload #4
    //   207: getfield h0 : I
    //   210: istore #11
    //   212: aload #4
    //   214: getfield i0 : F
    //   217: fstore #6
    //   219: getstatic android/os/Build$VERSION.SDK_INT : I
    //   222: bipush #17
    //   224: if_icmpge -> 408
    //   227: aload #4
    //   229: getfield d : I
    //   232: istore #13
    //   234: aload #4
    //   236: getfield e : I
    //   239: istore #14
    //   241: aload #4
    //   243: getfield f : I
    //   246: istore #10
    //   248: aload #4
    //   250: getfield g : I
    //   253: istore #12
    //   255: aload #4
    //   257: getfield t : I
    //   260: istore #9
    //   262: aload #4
    //   264: getfield v : I
    //   267: istore #11
    //   269: aload #4
    //   271: getfield z : F
    //   274: fstore #6
    //   276: iload #13
    //   278: istore #8
    //   280: iload #14
    //   282: istore #7
    //   284: iload #13
    //   286: iconst_m1
    //   287: if_icmpne -> 353
    //   290: iload #13
    //   292: istore #8
    //   294: iload #14
    //   296: istore #7
    //   298: iload #14
    //   300: iconst_m1
    //   301: if_icmpne -> 353
    //   304: aload #4
    //   306: getfield q : I
    //   309: istore #8
    //   311: iload #8
    //   313: iconst_m1
    //   314: if_icmpeq -> 324
    //   317: iload #14
    //   319: istore #7
    //   321: goto -> 353
    //   324: aload #4
    //   326: getfield p : I
    //   329: istore #15
    //   331: iload #13
    //   333: istore #8
    //   335: iload #14
    //   337: istore #7
    //   339: iload #15
    //   341: iconst_m1
    //   342: if_icmpeq -> 353
    //   345: iload #15
    //   347: istore #7
    //   349: iload #13
    //   351: istore #8
    //   353: iload #10
    //   355: iconst_m1
    //   356: if_icmpne -> 405
    //   359: iload #12
    //   361: iconst_m1
    //   362: if_icmpne -> 405
    //   365: aload #4
    //   367: getfield r : I
    //   370: istore #13
    //   372: iload #13
    //   374: iconst_m1
    //   375: if_icmpeq -> 385
    //   378: iload #13
    //   380: istore #10
    //   382: goto -> 405
    //   385: aload #4
    //   387: getfield s : I
    //   390: istore #13
    //   392: iload #13
    //   394: iconst_m1
    //   395: if_icmpeq -> 405
    //   398: iload #13
    //   400: istore #12
    //   402: goto -> 408
    //   405: goto -> 408
    //   408: aload #4
    //   410: getfield m : I
    //   413: istore #13
    //   415: iload #13
    //   417: iconst_m1
    //   418: if_icmpeq -> 454
    //   421: aload #5
    //   423: iload #13
    //   425: invokevirtual get : (I)Ljava/lang/Object;
    //   428: checkcast b/e/b/k/e
    //   431: astore_2
    //   432: aload_2
    //   433: ifnull -> 1050
    //   436: aload_3
    //   437: aload_2
    //   438: aload #4
    //   440: getfield o : F
    //   443: aload #4
    //   445: getfield n : I
    //   448: invokevirtual a : (Lb/e/b/k/e;FI)V
    //   451: goto -> 1050
    //   454: iload #8
    //   456: iconst_m1
    //   457: if_icmpeq -> 497
    //   460: aload #5
    //   462: iload #8
    //   464: invokevirtual get : (I)Ljava/lang/Object;
    //   467: checkcast b/e/b/k/e
    //   470: astore #17
    //   472: aload #17
    //   474: ifnull -> 494
    //   477: getstatic b/e/b/k/d$b.d : Lb/e/b/k/d$b;
    //   480: astore_2
    //   481: aload #4
    //   483: getfield leftMargin : I
    //   486: istore #7
    //   488: aload_2
    //   489: astore #16
    //   491: goto -> 536
    //   494: goto -> 549
    //   497: iload #7
    //   499: iconst_m1
    //   500: if_icmpeq -> 549
    //   503: aload #5
    //   505: iload #7
    //   507: invokevirtual get : (I)Ljava/lang/Object;
    //   510: checkcast b/e/b/k/e
    //   513: astore #17
    //   515: aload #17
    //   517: ifnull -> 549
    //   520: getstatic b/e/b/k/d$b.d : Lb/e/b/k/d$b;
    //   523: astore #16
    //   525: getstatic b/e/b/k/d$b.f : Lb/e/b/k/d$b;
    //   528: astore_2
    //   529: aload #4
    //   531: getfield leftMargin : I
    //   534: istore #7
    //   536: aload_3
    //   537: aload #16
    //   539: aload #17
    //   541: aload_2
    //   542: iload #7
    //   544: iload #9
    //   546: invokevirtual a : (Lb/e/b/k/d$b;Lb/e/b/k/e;Lb/e/b/k/d$b;II)V
    //   549: iload #10
    //   551: iconst_m1
    //   552: if_icmpeq -> 591
    //   555: aload #5
    //   557: iload #10
    //   559: invokevirtual get : (I)Ljava/lang/Object;
    //   562: checkcast b/e/b/k/e
    //   565: astore #16
    //   567: aload #16
    //   569: ifnull -> 642
    //   572: getstatic b/e/b/k/d$b.f : Lb/e/b/k/d$b;
    //   575: astore_2
    //   576: getstatic b/e/b/k/d$b.d : Lb/e/b/k/d$b;
    //   579: astore #17
    //   581: aload #4
    //   583: getfield rightMargin : I
    //   586: istore #7
    //   588: goto -> 629
    //   591: iload #12
    //   593: iconst_m1
    //   594: if_icmpeq -> 642
    //   597: aload #5
    //   599: iload #12
    //   601: invokevirtual get : (I)Ljava/lang/Object;
    //   604: checkcast b/e/b/k/e
    //   607: astore #16
    //   609: aload #16
    //   611: ifnull -> 642
    //   614: getstatic b/e/b/k/d$b.f : Lb/e/b/k/d$b;
    //   617: astore #17
    //   619: aload #4
    //   621: getfield rightMargin : I
    //   624: istore #7
    //   626: aload #17
    //   628: astore_2
    //   629: aload_3
    //   630: aload_2
    //   631: aload #16
    //   633: aload #17
    //   635: iload #7
    //   637: iload #11
    //   639: invokevirtual a : (Lb/e/b/k/d$b;Lb/e/b/k/e;Lb/e/b/k/d$b;II)V
    //   642: aload #4
    //   644: getfield h : I
    //   647: istore #7
    //   649: iload #7
    //   651: iconst_m1
    //   652: if_icmpeq -> 696
    //   655: aload #5
    //   657: iload #7
    //   659: invokevirtual get : (I)Ljava/lang/Object;
    //   662: checkcast b/e/b/k/e
    //   665: astore #17
    //   667: aload #17
    //   669: ifnull -> 762
    //   672: getstatic b/e/b/k/d$b.e : Lb/e/b/k/d$b;
    //   675: astore_2
    //   676: aload #4
    //   678: getfield topMargin : I
    //   681: istore #7
    //   683: aload #4
    //   685: getfield u : I
    //   688: istore #8
    //   690: aload_2
    //   691: astore #16
    //   693: goto -> 749
    //   696: aload #4
    //   698: getfield i : I
    //   701: istore #7
    //   703: iload #7
    //   705: iconst_m1
    //   706: if_icmpeq -> 762
    //   709: aload #5
    //   711: iload #7
    //   713: invokevirtual get : (I)Ljava/lang/Object;
    //   716: checkcast b/e/b/k/e
    //   719: astore #17
    //   721: aload #17
    //   723: ifnull -> 762
    //   726: getstatic b/e/b/k/d$b.e : Lb/e/b/k/d$b;
    //   729: astore #16
    //   731: getstatic b/e/b/k/d$b.g : Lb/e/b/k/d$b;
    //   734: astore_2
    //   735: aload #4
    //   737: getfield topMargin : I
    //   740: istore #7
    //   742: aload #4
    //   744: getfield u : I
    //   747: istore #8
    //   749: aload_3
    //   750: aload #16
    //   752: aload #17
    //   754: aload_2
    //   755: iload #7
    //   757: iload #8
    //   759: invokevirtual a : (Lb/e/b/k/d$b;Lb/e/b/k/e;Lb/e/b/k/d$b;II)V
    //   762: aload #4
    //   764: getfield j : I
    //   767: istore #7
    //   769: iload #7
    //   771: iconst_m1
    //   772: if_icmpeq -> 818
    //   775: aload #5
    //   777: iload #7
    //   779: invokevirtual get : (I)Ljava/lang/Object;
    //   782: checkcast b/e/b/k/e
    //   785: astore #16
    //   787: aload #16
    //   789: ifnull -> 883
    //   792: getstatic b/e/b/k/d$b.g : Lb/e/b/k/d$b;
    //   795: astore_2
    //   796: getstatic b/e/b/k/d$b.e : Lb/e/b/k/d$b;
    //   799: astore #17
    //   801: aload #4
    //   803: getfield bottomMargin : I
    //   806: istore #7
    //   808: aload #4
    //   810: getfield w : I
    //   813: istore #8
    //   815: goto -> 870
    //   818: aload #4
    //   820: getfield k : I
    //   823: istore #7
    //   825: iload #7
    //   827: iconst_m1
    //   828: if_icmpeq -> 883
    //   831: aload #5
    //   833: iload #7
    //   835: invokevirtual get : (I)Ljava/lang/Object;
    //   838: checkcast b/e/b/k/e
    //   841: astore #16
    //   843: aload #16
    //   845: ifnull -> 883
    //   848: getstatic b/e/b/k/d$b.g : Lb/e/b/k/d$b;
    //   851: astore #17
    //   853: aload #4
    //   855: getfield bottomMargin : I
    //   858: istore #7
    //   860: aload #4
    //   862: getfield w : I
    //   865: istore #8
    //   867: aload #17
    //   869: astore_2
    //   870: aload_3
    //   871: aload_2
    //   872: aload #16
    //   874: aload #17
    //   876: iload #7
    //   878: iload #8
    //   880: invokevirtual a : (Lb/e/b/k/d$b;Lb/e/b/k/e;Lb/e/b/k/d$b;II)V
    //   883: aload #4
    //   885: getfield l : I
    //   888: istore #7
    //   890: iload #7
    //   892: iconst_m1
    //   893: if_icmpeq -> 1017
    //   896: aload_0
    //   897: getfield c : Landroid/util/SparseArray;
    //   900: iload #7
    //   902: invokevirtual get : (I)Ljava/lang/Object;
    //   905: checkcast android/view/View
    //   908: astore_2
    //   909: aload #5
    //   911: aload #4
    //   913: getfield l : I
    //   916: invokevirtual get : (I)Ljava/lang/Object;
    //   919: checkcast b/e/b/k/e
    //   922: astore #5
    //   924: aload #5
    //   926: ifnull -> 1017
    //   929: aload_2
    //   930: ifnull -> 1017
    //   933: aload_2
    //   934: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   937: instanceof androidx/constraintlayout/widget/ConstraintLayout$b
    //   940: ifeq -> 1017
    //   943: aload_2
    //   944: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   947: checkcast androidx/constraintlayout/widget/ConstraintLayout$b
    //   950: astore_2
    //   951: aload #4
    //   953: iconst_1
    //   954: putfield X : Z
    //   957: aload_2
    //   958: iconst_1
    //   959: putfield X : Z
    //   962: aload_3
    //   963: getstatic b/e/b/k/d$b.h : Lb/e/b/k/d$b;
    //   966: invokevirtual a : (Lb/e/b/k/d$b;)Lb/e/b/k/d;
    //   969: aload #5
    //   971: getstatic b/e/b/k/d$b.h : Lb/e/b/k/d$b;
    //   974: invokevirtual a : (Lb/e/b/k/d$b;)Lb/e/b/k/d;
    //   977: iconst_0
    //   978: iconst_m1
    //   979: iconst_1
    //   980: invokevirtual a : (Lb/e/b/k/d;IIZ)Z
    //   983: pop
    //   984: aload_3
    //   985: iconst_1
    //   986: invokevirtual a : (Z)V
    //   989: aload_2
    //   990: getfield m0 : Lb/e/b/k/e;
    //   993: iconst_1
    //   994: invokevirtual a : (Z)V
    //   997: aload_3
    //   998: getstatic b/e/b/k/d$b.e : Lb/e/b/k/d$b;
    //   1001: invokevirtual a : (Lb/e/b/k/d$b;)Lb/e/b/k/d;
    //   1004: invokevirtual i : ()V
    //   1007: aload_3
    //   1008: getstatic b/e/b/k/d$b.g : Lb/e/b/k/d$b;
    //   1011: invokevirtual a : (Lb/e/b/k/d$b;)Lb/e/b/k/d;
    //   1014: invokevirtual i : ()V
    //   1017: fload #6
    //   1019: fconst_0
    //   1020: fcmpl
    //   1021: iflt -> 1030
    //   1024: aload_3
    //   1025: fload #6
    //   1027: invokevirtual a : (F)V
    //   1030: aload #4
    //   1032: getfield A : F
    //   1035: fstore #6
    //   1037: fload #6
    //   1039: fconst_0
    //   1040: fcmpl
    //   1041: iflt -> 1050
    //   1044: aload_3
    //   1045: fload #6
    //   1047: invokevirtual c : (F)V
    //   1050: iload_1
    //   1051: ifeq -> 1086
    //   1054: aload #4
    //   1056: getfield P : I
    //   1059: iconst_m1
    //   1060: if_icmpne -> 1072
    //   1063: aload #4
    //   1065: getfield Q : I
    //   1068: iconst_m1
    //   1069: if_icmpeq -> 1086
    //   1072: aload_3
    //   1073: aload #4
    //   1075: getfield P : I
    //   1078: aload #4
    //   1080: getfield Q : I
    //   1083: invokevirtual b : (II)V
    //   1086: aload #4
    //   1088: getfield V : Z
    //   1091: ifne -> 1175
    //   1094: aload #4
    //   1096: getfield width : I
    //   1099: iconst_m1
    //   1100: if_icmpne -> 1160
    //   1103: aload #4
    //   1105: getfield S : Z
    //   1108: ifeq -> 1118
    //   1111: getstatic b/e/b/k/e$b.e : Lb/e/b/k/e$b;
    //   1114: astore_2
    //   1115: goto -> 1122
    //   1118: getstatic b/e/b/k/e$b.f : Lb/e/b/k/e$b;
    //   1121: astore_2
    //   1122: aload_3
    //   1123: aload_2
    //   1124: invokevirtual a : (Lb/e/b/k/e$b;)V
    //   1127: aload_3
    //   1128: getstatic b/e/b/k/d$b.d : Lb/e/b/k/d$b;
    //   1131: invokevirtual a : (Lb/e/b/k/d$b;)Lb/e/b/k/d;
    //   1134: aload #4
    //   1136: getfield leftMargin : I
    //   1139: putfield e : I
    //   1142: aload_3
    //   1143: getstatic b/e/b/k/d$b.f : Lb/e/b/k/d$b;
    //   1146: invokevirtual a : (Lb/e/b/k/d$b;)Lb/e/b/k/d;
    //   1149: aload #4
    //   1151: getfield rightMargin : I
    //   1154: putfield e : I
    //   1157: goto -> 1208
    //   1160: aload_3
    //   1161: getstatic b/e/b/k/e$b.e : Lb/e/b/k/e$b;
    //   1164: invokevirtual a : (Lb/e/b/k/e$b;)V
    //   1167: aload_3
    //   1168: iconst_0
    //   1169: invokevirtual p : (I)V
    //   1172: goto -> 1208
    //   1175: aload_3
    //   1176: getstatic b/e/b/k/e$b.c : Lb/e/b/k/e$b;
    //   1179: invokevirtual a : (Lb/e/b/k/e$b;)V
    //   1182: aload_3
    //   1183: aload #4
    //   1185: getfield width : I
    //   1188: invokevirtual p : (I)V
    //   1191: aload #4
    //   1193: getfield width : I
    //   1196: bipush #-2
    //   1198: if_icmpne -> 1208
    //   1201: aload_3
    //   1202: getstatic b/e/b/k/e$b.d : Lb/e/b/k/e$b;
    //   1205: invokevirtual a : (Lb/e/b/k/e$b;)V
    //   1208: aload #4
    //   1210: getfield W : Z
    //   1213: ifne -> 1297
    //   1216: aload #4
    //   1218: getfield height : I
    //   1221: iconst_m1
    //   1222: if_icmpne -> 1282
    //   1225: aload #4
    //   1227: getfield T : Z
    //   1230: ifeq -> 1240
    //   1233: getstatic b/e/b/k/e$b.e : Lb/e/b/k/e$b;
    //   1236: astore_2
    //   1237: goto -> 1244
    //   1240: getstatic b/e/b/k/e$b.f : Lb/e/b/k/e$b;
    //   1243: astore_2
    //   1244: aload_3
    //   1245: aload_2
    //   1246: invokevirtual b : (Lb/e/b/k/e$b;)V
    //   1249: aload_3
    //   1250: getstatic b/e/b/k/d$b.e : Lb/e/b/k/d$b;
    //   1253: invokevirtual a : (Lb/e/b/k/d$b;)Lb/e/b/k/d;
    //   1256: aload #4
    //   1258: getfield topMargin : I
    //   1261: putfield e : I
    //   1264: aload_3
    //   1265: getstatic b/e/b/k/d$b.g : Lb/e/b/k/d$b;
    //   1268: invokevirtual a : (Lb/e/b/k/d$b;)Lb/e/b/k/d;
    //   1271: aload #4
    //   1273: getfield bottomMargin : I
    //   1276: putfield e : I
    //   1279: goto -> 1330
    //   1282: aload_3
    //   1283: getstatic b/e/b/k/e$b.e : Lb/e/b/k/e$b;
    //   1286: invokevirtual b : (Lb/e/b/k/e$b;)V
    //   1289: aload_3
    //   1290: iconst_0
    //   1291: invokevirtual h : (I)V
    //   1294: goto -> 1330
    //   1297: aload_3
    //   1298: getstatic b/e/b/k/e$b.c : Lb/e/b/k/e$b;
    //   1301: invokevirtual b : (Lb/e/b/k/e$b;)V
    //   1304: aload_3
    //   1305: aload #4
    //   1307: getfield height : I
    //   1310: invokevirtual h : (I)V
    //   1313: aload #4
    //   1315: getfield height : I
    //   1318: bipush #-2
    //   1320: if_icmpne -> 1330
    //   1323: aload_3
    //   1324: getstatic b/e/b/k/e$b.d : Lb/e/b/k/e$b;
    //   1327: invokevirtual b : (Lb/e/b/k/e$b;)V
    //   1330: aload_3
    //   1331: aload #4
    //   1333: getfield B : Ljava/lang/String;
    //   1336: invokevirtual b : (Ljava/lang/String;)V
    //   1339: aload_3
    //   1340: aload #4
    //   1342: getfield D : F
    //   1345: invokevirtual b : (F)V
    //   1348: aload_3
    //   1349: aload #4
    //   1351: getfield E : F
    //   1354: invokevirtual d : (F)V
    //   1357: aload_3
    //   1358: aload #4
    //   1360: getfield F : I
    //   1363: invokevirtual i : (I)V
    //   1366: aload_3
    //   1367: aload #4
    //   1369: getfield G : I
    //   1372: invokevirtual n : (I)V
    //   1375: aload_3
    //   1376: aload #4
    //   1378: getfield H : I
    //   1381: aload #4
    //   1383: getfield J : I
    //   1386: aload #4
    //   1388: getfield L : I
    //   1391: aload #4
    //   1393: getfield N : F
    //   1396: invokevirtual a : (IIIF)V
    //   1399: aload_3
    //   1400: aload #4
    //   1402: getfield I : I
    //   1405: aload #4
    //   1407: getfield K : I
    //   1410: aload #4
    //   1412: getfield M : I
    //   1415: aload #4
    //   1417: getfield O : F
    //   1420: invokevirtual b : (IIIF)V
    //   1423: return
  }
  
  protected boolean a() {
    int i = Build.VERSION.SDK_INT;
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (i >= 17) {
      if (((getContext().getApplicationInfo()).flags & 0x400000) != 0) {
        i = 1;
      } else {
        i = 0;
      } 
      bool1 = bool2;
      if (i != 0) {
        bool1 = bool2;
        if (1 == getLayoutDirection())
          bool1 = true; 
      } 
    } 
    return bool1;
  }
  
  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams) {
    super.addView(paramView, paramInt, paramLayoutParams);
    if (Build.VERSION.SDK_INT < 14)
      onViewAdded(paramView); 
  }
  
  protected void b(int paramInt) {
    this.m = new d(getContext(), this, paramInt);
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams) {
    return paramLayoutParams instanceof b;
  }
  
  protected void dispatchDraw(Canvas paramCanvas) {
    ArrayList<c> arrayList = this.d;
    if (arrayList != null) {
      int i = arrayList.size();
      if (i > 0) {
        int j;
        for (j = 0; j < i; j++)
          ((c)this.d.get(j)).d(this); 
      } 
    } 
    super.dispatchDraw(paramCanvas);
    if (isInEditMode()) {
      int j = getChildCount();
      float f1 = getWidth();
      float f2 = getHeight();
      int i;
      for (i = 0; i < j; i++) {
        View view = getChildAt(i);
        if (view.getVisibility() != 8) {
          Object object = view.getTag();
          if (object != null && object instanceof String) {
            object = ((String)object).split(",");
            if (object.length == 4) {
              int m = Integer.parseInt((String)object[0]);
              int i1 = Integer.parseInt((String)object[1]);
              int n = Integer.parseInt((String)object[2]);
              int k = Integer.parseInt((String)object[3]);
              m = (int)(m / 1080.0F * f1);
              i1 = (int)(i1 / 1920.0F * f2);
              n = (int)(n / 1080.0F * f1);
              k = (int)(k / 1920.0F * f2);
              object = new Paint();
              object.setColor(-65536);
              float f3 = m;
              float f4 = i1;
              float f5 = (m + n);
              paramCanvas.drawLine(f3, f4, f5, f4, (Paint)object);
              float f6 = (i1 + k);
              paramCanvas.drawLine(f5, f4, f5, f6, (Paint)object);
              paramCanvas.drawLine(f5, f6, f3, f6, (Paint)object);
              paramCanvas.drawLine(f3, f6, f3, f4, (Paint)object);
              object.setColor(-16711936);
              paramCanvas.drawLine(f3, f4, f5, f6, (Paint)object);
              paramCanvas.drawLine(f3, f6, f5, f4, (Paint)object);
            } 
          } 
        } 
      } 
    } 
  }
  
  public void forceLayout() {
    b();
    super.forceLayout();
  }
  
  protected b generateDefaultLayoutParams() {
    return new b(-2, -2);
  }
  
  protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams) {
    return (ViewGroup.LayoutParams)new b(paramLayoutParams);
  }
  
  public b generateLayoutParams(AttributeSet paramAttributeSet) {
    return new b(getContext(), paramAttributeSet);
  }
  
  public int getMaxHeight() {
    return this.i;
  }
  
  public int getMaxWidth() {
    return this.h;
  }
  
  public int getMinHeight() {
    return this.g;
  }
  
  public int getMinWidth() {
    return this.f;
  }
  
  public int getOptimizationLevel() {
    return this.e.K();
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    paramInt3 = getChildCount();
    paramBoolean = isInEditMode();
    paramInt2 = 0;
    for (paramInt1 = 0; paramInt1 < paramInt3; paramInt1++) {
      View view = getChildAt(paramInt1);
      b b = (b)view.getLayoutParams();
      e e1 = b.m0;
      if ((view.getVisibility() != 8 || b.Y || b.Z || b.b0 || paramBoolean) && !b.a0) {
        paramInt4 = e1.A();
        int i = e1.B();
        int j = e1.z() + paramInt4;
        int k = e1.j() + i;
        view.layout(paramInt4, i, j, k);
        if (view instanceof i) {
          view = ((i)view).getContent();
          if (view != null) {
            view.setVisibility(0);
            view.layout(paramInt4, i, j, k);
          } 
        } 
      } 
    } 
    paramInt3 = this.d.size();
    if (paramInt3 > 0)
      for (paramInt1 = paramInt2; paramInt1 < paramInt3; paramInt1++)
        ((c)this.d.get(paramInt1)).b(this);  
  }
  
  protected void onMeasure(int paramInt1, int paramInt2) {
    this.e.f(a());
    if (this.j) {
      this.j = false;
      if (d())
        this.e.Q(); 
    } 
    a(this.e, this.k, paramInt1, paramInt2);
    a(paramInt1, paramInt2, this.e.z(), this.e.j(), this.e.P(), this.e.N());
  }
  
  public void onViewAdded(View paramView) {
    if (Build.VERSION.SDK_INT >= 14)
      super.onViewAdded(paramView); 
    e e1 = a(paramView);
    if (paramView instanceof h && !(e1 instanceof g)) {
      b b = (b)paramView.getLayoutParams();
      b.m0 = (e)new g();
      b.Y = true;
      ((g)b.m0).u(b.R);
    } 
    if (paramView instanceof c) {
      c c1 = (c)paramView;
      c1.b();
      ((b)paramView.getLayoutParams()).Z = true;
      if (!this.d.contains(c1))
        this.d.add(c1); 
    } 
    this.c.put(paramView.getId(), paramView);
    this.j = true;
  }
  
  public void onViewRemoved(View paramView) {
    if (Build.VERSION.SDK_INT >= 14)
      super.onViewRemoved(paramView); 
    this.c.remove(paramView.getId());
    e e1 = a(paramView);
    this.e.c(e1);
    this.d.remove(paramView);
    this.j = true;
  }
  
  public void removeView(View paramView) {
    super.removeView(paramView);
    if (Build.VERSION.SDK_INT < 14)
      onViewRemoved(paramView); 
  }
  
  public void requestLayout() {
    b();
    super.requestLayout();
  }
  
  public void setConstraintSet(e parame) {
    this.l = parame;
  }
  
  public void setId(int paramInt) {
    this.c.remove(getId());
    super.setId(paramInt);
    this.c.put(getId(), this);
  }
  
  public void setMaxHeight(int paramInt) {
    if (paramInt == this.i)
      return; 
    this.i = paramInt;
    requestLayout();
  }
  
  public void setMaxWidth(int paramInt) {
    if (paramInt == this.h)
      return; 
    this.h = paramInt;
    requestLayout();
  }
  
  public void setMinHeight(int paramInt) {
    if (paramInt == this.g)
      return; 
    this.g = paramInt;
    requestLayout();
  }
  
  public void setMinWidth(int paramInt) {
    if (paramInt == this.f)
      return; 
    this.f = paramInt;
    requestLayout();
  }
  
  public void setOnConstraintsChanged(g paramg) {
    d d1 = this.m;
    if (d1 != null)
      d1.a(paramg); 
  }
  
  public void setOptimizationLevel(int paramInt) {
    this.k = paramInt;
    this.e.t(paramInt);
  }
  
  public boolean shouldDelayChildPressedState() {
    return false;
  }
  
  public static class b extends ViewGroup.MarginLayoutParams {
    public float A = 0.5F;
    
    public String B = null;
    
    int C = 1;
    
    public float D = -1.0F;
    
    public float E = -1.0F;
    
    public int F = 0;
    
    public int G = 0;
    
    public int H = 0;
    
    public int I = 0;
    
    public int J = 0;
    
    public int K = 0;
    
    public int L = 0;
    
    public int M = 0;
    
    public float N = 1.0F;
    
    public float O = 1.0F;
    
    public int P = -1;
    
    public int Q = -1;
    
    public int R = -1;
    
    public boolean S = false;
    
    public boolean T = false;
    
    public String U = null;
    
    boolean V = true;
    
    boolean W = true;
    
    boolean X = false;
    
    boolean Y = false;
    
    boolean Z = false;
    
    public int a = -1;
    
    boolean a0 = false;
    
    public int b = -1;
    
    boolean b0 = false;
    
    public float c = -1.0F;
    
    int c0 = -1;
    
    public int d = -1;
    
    int d0 = -1;
    
    public int e = -1;
    
    int e0 = -1;
    
    public int f = -1;
    
    int f0 = -1;
    
    public int g = -1;
    
    int g0 = -1;
    
    public int h = -1;
    
    int h0 = -1;
    
    public int i = -1;
    
    float i0 = 0.5F;
    
    public int j = -1;
    
    int j0;
    
    public int k = -1;
    
    int k0;
    
    public int l = -1;
    
    float l0;
    
    public int m = -1;
    
    e m0 = new e();
    
    public int n = 0;
    
    public boolean n0;
    
    public float o = 0.0F;
    
    public int p = -1;
    
    public int q = -1;
    
    public int r = -1;
    
    public int s = -1;
    
    public int t = -1;
    
    public int u = -1;
    
    public int v = -1;
    
    public int w = -1;
    
    public int x = -1;
    
    public int y = -1;
    
    public float z = 0.5F;
    
    public b(int param1Int1, int param1Int2) {
      super(param1Int1, param1Int2);
    }
    
    public b(Context param1Context, AttributeSet param1AttributeSet) {
      // Byte code:
      //   0: aload_0
      //   1: aload_1
      //   2: aload_2
      //   3: invokespecial <init> : (Landroid/content/Context;Landroid/util/AttributeSet;)V
      //   6: aload_0
      //   7: iconst_m1
      //   8: putfield a : I
      //   11: aload_0
      //   12: iconst_m1
      //   13: putfield b : I
      //   16: aload_0
      //   17: ldc -1.0
      //   19: putfield c : F
      //   22: aload_0
      //   23: iconst_m1
      //   24: putfield d : I
      //   27: aload_0
      //   28: iconst_m1
      //   29: putfield e : I
      //   32: aload_0
      //   33: iconst_m1
      //   34: putfield f : I
      //   37: aload_0
      //   38: iconst_m1
      //   39: putfield g : I
      //   42: aload_0
      //   43: iconst_m1
      //   44: putfield h : I
      //   47: aload_0
      //   48: iconst_m1
      //   49: putfield i : I
      //   52: aload_0
      //   53: iconst_m1
      //   54: putfield j : I
      //   57: aload_0
      //   58: iconst_m1
      //   59: putfield k : I
      //   62: aload_0
      //   63: iconst_m1
      //   64: putfield l : I
      //   67: aload_0
      //   68: iconst_m1
      //   69: putfield m : I
      //   72: aload_0
      //   73: iconst_0
      //   74: putfield n : I
      //   77: aload_0
      //   78: fconst_0
      //   79: putfield o : F
      //   82: aload_0
      //   83: iconst_m1
      //   84: putfield p : I
      //   87: aload_0
      //   88: iconst_m1
      //   89: putfield q : I
      //   92: aload_0
      //   93: iconst_m1
      //   94: putfield r : I
      //   97: aload_0
      //   98: iconst_m1
      //   99: putfield s : I
      //   102: aload_0
      //   103: iconst_m1
      //   104: putfield t : I
      //   107: aload_0
      //   108: iconst_m1
      //   109: putfield u : I
      //   112: aload_0
      //   113: iconst_m1
      //   114: putfield v : I
      //   117: aload_0
      //   118: iconst_m1
      //   119: putfield w : I
      //   122: aload_0
      //   123: iconst_m1
      //   124: putfield x : I
      //   127: aload_0
      //   128: iconst_m1
      //   129: putfield y : I
      //   132: aload_0
      //   133: ldc 0.5
      //   135: putfield z : F
      //   138: aload_0
      //   139: ldc 0.5
      //   141: putfield A : F
      //   144: aload_0
      //   145: aconst_null
      //   146: putfield B : Ljava/lang/String;
      //   149: aload_0
      //   150: iconst_1
      //   151: putfield C : I
      //   154: aload_0
      //   155: ldc -1.0
      //   157: putfield D : F
      //   160: aload_0
      //   161: ldc -1.0
      //   163: putfield E : F
      //   166: aload_0
      //   167: iconst_0
      //   168: putfield F : I
      //   171: aload_0
      //   172: iconst_0
      //   173: putfield G : I
      //   176: aload_0
      //   177: iconst_0
      //   178: putfield H : I
      //   181: aload_0
      //   182: iconst_0
      //   183: putfield I : I
      //   186: aload_0
      //   187: iconst_0
      //   188: putfield J : I
      //   191: aload_0
      //   192: iconst_0
      //   193: putfield K : I
      //   196: aload_0
      //   197: iconst_0
      //   198: putfield L : I
      //   201: aload_0
      //   202: iconst_0
      //   203: putfield M : I
      //   206: aload_0
      //   207: fconst_1
      //   208: putfield N : F
      //   211: aload_0
      //   212: fconst_1
      //   213: putfield O : F
      //   216: aload_0
      //   217: iconst_m1
      //   218: putfield P : I
      //   221: aload_0
      //   222: iconst_m1
      //   223: putfield Q : I
      //   226: aload_0
      //   227: iconst_m1
      //   228: putfield R : I
      //   231: aload_0
      //   232: iconst_0
      //   233: putfield S : Z
      //   236: aload_0
      //   237: iconst_0
      //   238: putfield T : Z
      //   241: aload_0
      //   242: aconst_null
      //   243: putfield U : Ljava/lang/String;
      //   246: aload_0
      //   247: iconst_1
      //   248: putfield V : Z
      //   251: aload_0
      //   252: iconst_1
      //   253: putfield W : Z
      //   256: aload_0
      //   257: iconst_0
      //   258: putfield X : Z
      //   261: aload_0
      //   262: iconst_0
      //   263: putfield Y : Z
      //   266: aload_0
      //   267: iconst_0
      //   268: putfield Z : Z
      //   271: aload_0
      //   272: iconst_0
      //   273: putfield a0 : Z
      //   276: aload_0
      //   277: iconst_0
      //   278: putfield b0 : Z
      //   281: aload_0
      //   282: iconst_m1
      //   283: putfield c0 : I
      //   286: aload_0
      //   287: iconst_m1
      //   288: putfield d0 : I
      //   291: aload_0
      //   292: iconst_m1
      //   293: putfield e0 : I
      //   296: aload_0
      //   297: iconst_m1
      //   298: putfield f0 : I
      //   301: aload_0
      //   302: iconst_m1
      //   303: putfield g0 : I
      //   306: aload_0
      //   307: iconst_m1
      //   308: putfield h0 : I
      //   311: aload_0
      //   312: ldc 0.5
      //   314: putfield i0 : F
      //   317: aload_0
      //   318: new b/e/b/k/e
      //   321: dup
      //   322: invokespecial <init> : ()V
      //   325: putfield m0 : Lb/e/b/k/e;
      //   328: aload_1
      //   329: aload_2
      //   330: getstatic androidx/constraintlayout/widget/k.ConstraintLayout_Layout : [I
      //   333: invokevirtual obtainStyledAttributes : (Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
      //   336: astore_2
      //   337: aload_2
      //   338: invokevirtual getIndexCount : ()I
      //   341: istore #7
      //   343: iconst_0
      //   344: istore #5
      //   346: iload #5
      //   348: iload #7
      //   350: if_icmpge -> 2046
      //   353: aload_2
      //   354: iload #5
      //   356: invokevirtual getIndex : (I)I
      //   359: istore #6
      //   361: getstatic androidx/constraintlayout/widget/ConstraintLayout$b$a.a : Landroid/util/SparseIntArray;
      //   364: iload #6
      //   366: invokevirtual get : (I)I
      //   369: tableswitch default -> 592, 0 -> 2037, 1 -> 2023, 2 -> 1987, 3 -> 1970, 4 -> 1925, 5 -> 1908, 6 -> 1891, 7 -> 1874, 8 -> 1838, 9 -> 1802, 10 -> 1766, 11 -> 1730, 12 -> 1694, 13 -> 1658, 14 -> 1622, 15 -> 1586, 16 -> 1550, 17 -> 1514, 18 -> 1478, 19 -> 1442, 20 -> 1406, 21 -> 1389, 22 -> 1372, 23 -> 1355, 24 -> 1338, 25 -> 1321, 26 -> 1304, 27 -> 1287, 28 -> 1270, 29 -> 1253, 30 -> 1236, 31 -> 1202, 32 -> 1176, 33 -> 1135, 34 -> 1094, 35 -> 1068, 36 -> 1027, 37 -> 986, 38 -> 960, 39 -> 2037, 40 -> 2037, 41 -> 2037, 42 -> 2037, 43 -> 592, 44 -> 704, 45 -> 687, 46 -> 670, 47 -> 656, 48 -> 642, 49 -> 625, 50 -> 608, 51 -> 595
      //   592: goto -> 2037
      //   595: aload_0
      //   596: aload_2
      //   597: iload #6
      //   599: invokevirtual getString : (I)Ljava/lang/String;
      //   602: putfield U : Ljava/lang/String;
      //   605: goto -> 2037
      //   608: aload_0
      //   609: aload_2
      //   610: iload #6
      //   612: aload_0
      //   613: getfield Q : I
      //   616: invokevirtual getDimensionPixelOffset : (II)I
      //   619: putfield Q : I
      //   622: goto -> 2037
      //   625: aload_0
      //   626: aload_2
      //   627: iload #6
      //   629: aload_0
      //   630: getfield P : I
      //   633: invokevirtual getDimensionPixelOffset : (II)I
      //   636: putfield P : I
      //   639: goto -> 2037
      //   642: aload_0
      //   643: aload_2
      //   644: iload #6
      //   646: iconst_0
      //   647: invokevirtual getInt : (II)I
      //   650: putfield G : I
      //   653: goto -> 2037
      //   656: aload_0
      //   657: aload_2
      //   658: iload #6
      //   660: iconst_0
      //   661: invokevirtual getInt : (II)I
      //   664: putfield F : I
      //   667: goto -> 2037
      //   670: aload_0
      //   671: aload_2
      //   672: iload #6
      //   674: aload_0
      //   675: getfield E : F
      //   678: invokevirtual getFloat : (IF)F
      //   681: putfield E : F
      //   684: goto -> 2037
      //   687: aload_0
      //   688: aload_2
      //   689: iload #6
      //   691: aload_0
      //   692: getfield D : F
      //   695: invokevirtual getFloat : (IF)F
      //   698: putfield D : F
      //   701: goto -> 2037
      //   704: aload_0
      //   705: aload_2
      //   706: iload #6
      //   708: invokevirtual getString : (I)Ljava/lang/String;
      //   711: putfield B : Ljava/lang/String;
      //   714: aload_0
      //   715: iconst_m1
      //   716: putfield C : I
      //   719: aload_0
      //   720: getfield B : Ljava/lang/String;
      //   723: astore_1
      //   724: aload_1
      //   725: ifnull -> 2037
      //   728: aload_1
      //   729: invokevirtual length : ()I
      //   732: istore #8
      //   734: aload_0
      //   735: getfield B : Ljava/lang/String;
      //   738: bipush #44
      //   740: invokevirtual indexOf : (I)I
      //   743: istore #6
      //   745: iload #6
      //   747: ifle -> 812
      //   750: iload #6
      //   752: iload #8
      //   754: iconst_1
      //   755: isub
      //   756: if_icmpge -> 812
      //   759: aload_0
      //   760: getfield B : Ljava/lang/String;
      //   763: iconst_0
      //   764: iload #6
      //   766: invokevirtual substring : (II)Ljava/lang/String;
      //   769: astore_1
      //   770: aload_1
      //   771: ldc_w 'W'
      //   774: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
      //   777: ifeq -> 788
      //   780: aload_0
      //   781: iconst_0
      //   782: putfield C : I
      //   785: goto -> 803
      //   788: aload_1
      //   789: ldc_w 'H'
      //   792: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
      //   795: ifeq -> 803
      //   798: aload_0
      //   799: iconst_1
      //   800: putfield C : I
      //   803: iload #6
      //   805: iconst_1
      //   806: iadd
      //   807: istore #6
      //   809: goto -> 815
      //   812: iconst_0
      //   813: istore #6
      //   815: aload_0
      //   816: getfield B : Ljava/lang/String;
      //   819: bipush #58
      //   821: invokevirtual indexOf : (I)I
      //   824: istore #9
      //   826: iload #9
      //   828: iflt -> 935
      //   831: iload #9
      //   833: iload #8
      //   835: iconst_1
      //   836: isub
      //   837: if_icmpge -> 935
      //   840: aload_0
      //   841: getfield B : Ljava/lang/String;
      //   844: iload #6
      //   846: iload #9
      //   848: invokevirtual substring : (II)Ljava/lang/String;
      //   851: astore_1
      //   852: aload_0
      //   853: getfield B : Ljava/lang/String;
      //   856: iload #9
      //   858: iconst_1
      //   859: iadd
      //   860: invokevirtual substring : (I)Ljava/lang/String;
      //   863: astore #10
      //   865: aload_1
      //   866: invokevirtual length : ()I
      //   869: ifle -> 2037
      //   872: aload #10
      //   874: invokevirtual length : ()I
      //   877: ifle -> 2037
      //   880: aload_1
      //   881: invokestatic parseFloat : (Ljava/lang/String;)F
      //   884: fstore_3
      //   885: aload #10
      //   887: invokestatic parseFloat : (Ljava/lang/String;)F
      //   890: fstore #4
      //   892: fload_3
      //   893: fconst_0
      //   894: fcmpl
      //   895: ifle -> 2037
      //   898: fload #4
      //   900: fconst_0
      //   901: fcmpl
      //   902: ifle -> 2037
      //   905: aload_0
      //   906: getfield C : I
      //   909: iconst_1
      //   910: if_icmpne -> 924
      //   913: fload #4
      //   915: fload_3
      //   916: fdiv
      //   917: invokestatic abs : (F)F
      //   920: pop
      //   921: goto -> 2037
      //   924: fload_3
      //   925: fload #4
      //   927: fdiv
      //   928: invokestatic abs : (F)F
      //   931: pop
      //   932: goto -> 2037
      //   935: aload_0
      //   936: getfield B : Ljava/lang/String;
      //   939: iload #6
      //   941: invokevirtual substring : (I)Ljava/lang/String;
      //   944: astore_1
      //   945: aload_1
      //   946: invokevirtual length : ()I
      //   949: ifle -> 2037
      //   952: aload_1
      //   953: invokestatic parseFloat : (Ljava/lang/String;)F
      //   956: pop
      //   957: goto -> 2037
      //   960: aload_0
      //   961: fconst_0
      //   962: aload_2
      //   963: iload #6
      //   965: aload_0
      //   966: getfield O : F
      //   969: invokevirtual getFloat : (IF)F
      //   972: invokestatic max : (FF)F
      //   975: putfield O : F
      //   978: aload_0
      //   979: iconst_2
      //   980: putfield I : I
      //   983: goto -> 2037
      //   986: aload_0
      //   987: aload_2
      //   988: iload #6
      //   990: aload_0
      //   991: getfield M : I
      //   994: invokevirtual getDimensionPixelSize : (II)I
      //   997: putfield M : I
      //   1000: goto -> 2037
      //   1003: aload_2
      //   1004: iload #6
      //   1006: aload_0
      //   1007: getfield M : I
      //   1010: invokevirtual getInt : (II)I
      //   1013: bipush #-2
      //   1015: if_icmpne -> 2037
      //   1018: aload_0
      //   1019: bipush #-2
      //   1021: putfield M : I
      //   1024: goto -> 2037
      //   1027: aload_0
      //   1028: aload_2
      //   1029: iload #6
      //   1031: aload_0
      //   1032: getfield K : I
      //   1035: invokevirtual getDimensionPixelSize : (II)I
      //   1038: putfield K : I
      //   1041: goto -> 2037
      //   1044: aload_2
      //   1045: iload #6
      //   1047: aload_0
      //   1048: getfield K : I
      //   1051: invokevirtual getInt : (II)I
      //   1054: bipush #-2
      //   1056: if_icmpne -> 2037
      //   1059: aload_0
      //   1060: bipush #-2
      //   1062: putfield K : I
      //   1065: goto -> 2037
      //   1068: aload_0
      //   1069: fconst_0
      //   1070: aload_2
      //   1071: iload #6
      //   1073: aload_0
      //   1074: getfield N : F
      //   1077: invokevirtual getFloat : (IF)F
      //   1080: invokestatic max : (FF)F
      //   1083: putfield N : F
      //   1086: aload_0
      //   1087: iconst_2
      //   1088: putfield H : I
      //   1091: goto -> 2037
      //   1094: aload_0
      //   1095: aload_2
      //   1096: iload #6
      //   1098: aload_0
      //   1099: getfield L : I
      //   1102: invokevirtual getDimensionPixelSize : (II)I
      //   1105: putfield L : I
      //   1108: goto -> 2037
      //   1111: aload_2
      //   1112: iload #6
      //   1114: aload_0
      //   1115: getfield L : I
      //   1118: invokevirtual getInt : (II)I
      //   1121: bipush #-2
      //   1123: if_icmpne -> 2037
      //   1126: aload_0
      //   1127: bipush #-2
      //   1129: putfield L : I
      //   1132: goto -> 2037
      //   1135: aload_0
      //   1136: aload_2
      //   1137: iload #6
      //   1139: aload_0
      //   1140: getfield J : I
      //   1143: invokevirtual getDimensionPixelSize : (II)I
      //   1146: putfield J : I
      //   1149: goto -> 2037
      //   1152: aload_2
      //   1153: iload #6
      //   1155: aload_0
      //   1156: getfield J : I
      //   1159: invokevirtual getInt : (II)I
      //   1162: bipush #-2
      //   1164: if_icmpne -> 2037
      //   1167: aload_0
      //   1168: bipush #-2
      //   1170: putfield J : I
      //   1173: goto -> 2037
      //   1176: aload_0
      //   1177: aload_2
      //   1178: iload #6
      //   1180: iconst_0
      //   1181: invokevirtual getInt : (II)I
      //   1184: putfield I : I
      //   1187: aload_0
      //   1188: getfield I : I
      //   1191: iconst_1
      //   1192: if_icmpne -> 2037
      //   1195: ldc_w 'layout_constraintHeight_default="wrap" is deprecated.\\nUse layout_height="WRAP_CONTENT" and layout_constrainedHeight="true" instead.'
      //   1198: astore_1
      //   1199: goto -> 1225
      //   1202: aload_0
      //   1203: aload_2
      //   1204: iload #6
      //   1206: iconst_0
      //   1207: invokevirtual getInt : (II)I
      //   1210: putfield H : I
      //   1213: aload_0
      //   1214: getfield H : I
      //   1217: iconst_1
      //   1218: if_icmpne -> 2037
      //   1221: ldc_w 'layout_constraintWidth_default="wrap" is deprecated.\\nUse layout_width="WRAP_CONTENT" and layout_constrainedWidth="true" instead.'
      //   1224: astore_1
      //   1225: ldc_w 'ConstraintLayout'
      //   1228: aload_1
      //   1229: invokestatic e : (Ljava/lang/String;Ljava/lang/String;)I
      //   1232: pop
      //   1233: goto -> 2037
      //   1236: aload_0
      //   1237: aload_2
      //   1238: iload #6
      //   1240: aload_0
      //   1241: getfield A : F
      //   1244: invokevirtual getFloat : (IF)F
      //   1247: putfield A : F
      //   1250: goto -> 2037
      //   1253: aload_0
      //   1254: aload_2
      //   1255: iload #6
      //   1257: aload_0
      //   1258: getfield z : F
      //   1261: invokevirtual getFloat : (IF)F
      //   1264: putfield z : F
      //   1267: goto -> 2037
      //   1270: aload_0
      //   1271: aload_2
      //   1272: iload #6
      //   1274: aload_0
      //   1275: getfield T : Z
      //   1278: invokevirtual getBoolean : (IZ)Z
      //   1281: putfield T : Z
      //   1284: goto -> 2037
      //   1287: aload_0
      //   1288: aload_2
      //   1289: iload #6
      //   1291: aload_0
      //   1292: getfield S : Z
      //   1295: invokevirtual getBoolean : (IZ)Z
      //   1298: putfield S : Z
      //   1301: goto -> 2037
      //   1304: aload_0
      //   1305: aload_2
      //   1306: iload #6
      //   1308: aload_0
      //   1309: getfield y : I
      //   1312: invokevirtual getDimensionPixelSize : (II)I
      //   1315: putfield y : I
      //   1318: goto -> 2037
      //   1321: aload_0
      //   1322: aload_2
      //   1323: iload #6
      //   1325: aload_0
      //   1326: getfield x : I
      //   1329: invokevirtual getDimensionPixelSize : (II)I
      //   1332: putfield x : I
      //   1335: goto -> 2037
      //   1338: aload_0
      //   1339: aload_2
      //   1340: iload #6
      //   1342: aload_0
      //   1343: getfield w : I
      //   1346: invokevirtual getDimensionPixelSize : (II)I
      //   1349: putfield w : I
      //   1352: goto -> 2037
      //   1355: aload_0
      //   1356: aload_2
      //   1357: iload #6
      //   1359: aload_0
      //   1360: getfield v : I
      //   1363: invokevirtual getDimensionPixelSize : (II)I
      //   1366: putfield v : I
      //   1369: goto -> 2037
      //   1372: aload_0
      //   1373: aload_2
      //   1374: iload #6
      //   1376: aload_0
      //   1377: getfield u : I
      //   1380: invokevirtual getDimensionPixelSize : (II)I
      //   1383: putfield u : I
      //   1386: goto -> 2037
      //   1389: aload_0
      //   1390: aload_2
      //   1391: iload #6
      //   1393: aload_0
      //   1394: getfield t : I
      //   1397: invokevirtual getDimensionPixelSize : (II)I
      //   1400: putfield t : I
      //   1403: goto -> 2037
      //   1406: aload_0
      //   1407: aload_2
      //   1408: iload #6
      //   1410: aload_0
      //   1411: getfield s : I
      //   1414: invokevirtual getResourceId : (II)I
      //   1417: putfield s : I
      //   1420: aload_0
      //   1421: getfield s : I
      //   1424: iconst_m1
      //   1425: if_icmpne -> 2037
      //   1428: aload_0
      //   1429: aload_2
      //   1430: iload #6
      //   1432: iconst_m1
      //   1433: invokevirtual getInt : (II)I
      //   1436: putfield s : I
      //   1439: goto -> 2037
      //   1442: aload_0
      //   1443: aload_2
      //   1444: iload #6
      //   1446: aload_0
      //   1447: getfield r : I
      //   1450: invokevirtual getResourceId : (II)I
      //   1453: putfield r : I
      //   1456: aload_0
      //   1457: getfield r : I
      //   1460: iconst_m1
      //   1461: if_icmpne -> 2037
      //   1464: aload_0
      //   1465: aload_2
      //   1466: iload #6
      //   1468: iconst_m1
      //   1469: invokevirtual getInt : (II)I
      //   1472: putfield r : I
      //   1475: goto -> 2037
      //   1478: aload_0
      //   1479: aload_2
      //   1480: iload #6
      //   1482: aload_0
      //   1483: getfield q : I
      //   1486: invokevirtual getResourceId : (II)I
      //   1489: putfield q : I
      //   1492: aload_0
      //   1493: getfield q : I
      //   1496: iconst_m1
      //   1497: if_icmpne -> 2037
      //   1500: aload_0
      //   1501: aload_2
      //   1502: iload #6
      //   1504: iconst_m1
      //   1505: invokevirtual getInt : (II)I
      //   1508: putfield q : I
      //   1511: goto -> 2037
      //   1514: aload_0
      //   1515: aload_2
      //   1516: iload #6
      //   1518: aload_0
      //   1519: getfield p : I
      //   1522: invokevirtual getResourceId : (II)I
      //   1525: putfield p : I
      //   1528: aload_0
      //   1529: getfield p : I
      //   1532: iconst_m1
      //   1533: if_icmpne -> 2037
      //   1536: aload_0
      //   1537: aload_2
      //   1538: iload #6
      //   1540: iconst_m1
      //   1541: invokevirtual getInt : (II)I
      //   1544: putfield p : I
      //   1547: goto -> 2037
      //   1550: aload_0
      //   1551: aload_2
      //   1552: iload #6
      //   1554: aload_0
      //   1555: getfield l : I
      //   1558: invokevirtual getResourceId : (II)I
      //   1561: putfield l : I
      //   1564: aload_0
      //   1565: getfield l : I
      //   1568: iconst_m1
      //   1569: if_icmpne -> 2037
      //   1572: aload_0
      //   1573: aload_2
      //   1574: iload #6
      //   1576: iconst_m1
      //   1577: invokevirtual getInt : (II)I
      //   1580: putfield l : I
      //   1583: goto -> 2037
      //   1586: aload_0
      //   1587: aload_2
      //   1588: iload #6
      //   1590: aload_0
      //   1591: getfield k : I
      //   1594: invokevirtual getResourceId : (II)I
      //   1597: putfield k : I
      //   1600: aload_0
      //   1601: getfield k : I
      //   1604: iconst_m1
      //   1605: if_icmpne -> 2037
      //   1608: aload_0
      //   1609: aload_2
      //   1610: iload #6
      //   1612: iconst_m1
      //   1613: invokevirtual getInt : (II)I
      //   1616: putfield k : I
      //   1619: goto -> 2037
      //   1622: aload_0
      //   1623: aload_2
      //   1624: iload #6
      //   1626: aload_0
      //   1627: getfield j : I
      //   1630: invokevirtual getResourceId : (II)I
      //   1633: putfield j : I
      //   1636: aload_0
      //   1637: getfield j : I
      //   1640: iconst_m1
      //   1641: if_icmpne -> 2037
      //   1644: aload_0
      //   1645: aload_2
      //   1646: iload #6
      //   1648: iconst_m1
      //   1649: invokevirtual getInt : (II)I
      //   1652: putfield j : I
      //   1655: goto -> 2037
      //   1658: aload_0
      //   1659: aload_2
      //   1660: iload #6
      //   1662: aload_0
      //   1663: getfield i : I
      //   1666: invokevirtual getResourceId : (II)I
      //   1669: putfield i : I
      //   1672: aload_0
      //   1673: getfield i : I
      //   1676: iconst_m1
      //   1677: if_icmpne -> 2037
      //   1680: aload_0
      //   1681: aload_2
      //   1682: iload #6
      //   1684: iconst_m1
      //   1685: invokevirtual getInt : (II)I
      //   1688: putfield i : I
      //   1691: goto -> 2037
      //   1694: aload_0
      //   1695: aload_2
      //   1696: iload #6
      //   1698: aload_0
      //   1699: getfield h : I
      //   1702: invokevirtual getResourceId : (II)I
      //   1705: putfield h : I
      //   1708: aload_0
      //   1709: getfield h : I
      //   1712: iconst_m1
      //   1713: if_icmpne -> 2037
      //   1716: aload_0
      //   1717: aload_2
      //   1718: iload #6
      //   1720: iconst_m1
      //   1721: invokevirtual getInt : (II)I
      //   1724: putfield h : I
      //   1727: goto -> 2037
      //   1730: aload_0
      //   1731: aload_2
      //   1732: iload #6
      //   1734: aload_0
      //   1735: getfield g : I
      //   1738: invokevirtual getResourceId : (II)I
      //   1741: putfield g : I
      //   1744: aload_0
      //   1745: getfield g : I
      //   1748: iconst_m1
      //   1749: if_icmpne -> 2037
      //   1752: aload_0
      //   1753: aload_2
      //   1754: iload #6
      //   1756: iconst_m1
      //   1757: invokevirtual getInt : (II)I
      //   1760: putfield g : I
      //   1763: goto -> 2037
      //   1766: aload_0
      //   1767: aload_2
      //   1768: iload #6
      //   1770: aload_0
      //   1771: getfield f : I
      //   1774: invokevirtual getResourceId : (II)I
      //   1777: putfield f : I
      //   1780: aload_0
      //   1781: getfield f : I
      //   1784: iconst_m1
      //   1785: if_icmpne -> 2037
      //   1788: aload_0
      //   1789: aload_2
      //   1790: iload #6
      //   1792: iconst_m1
      //   1793: invokevirtual getInt : (II)I
      //   1796: putfield f : I
      //   1799: goto -> 2037
      //   1802: aload_0
      //   1803: aload_2
      //   1804: iload #6
      //   1806: aload_0
      //   1807: getfield e : I
      //   1810: invokevirtual getResourceId : (II)I
      //   1813: putfield e : I
      //   1816: aload_0
      //   1817: getfield e : I
      //   1820: iconst_m1
      //   1821: if_icmpne -> 2037
      //   1824: aload_0
      //   1825: aload_2
      //   1826: iload #6
      //   1828: iconst_m1
      //   1829: invokevirtual getInt : (II)I
      //   1832: putfield e : I
      //   1835: goto -> 2037
      //   1838: aload_0
      //   1839: aload_2
      //   1840: iload #6
      //   1842: aload_0
      //   1843: getfield d : I
      //   1846: invokevirtual getResourceId : (II)I
      //   1849: putfield d : I
      //   1852: aload_0
      //   1853: getfield d : I
      //   1856: iconst_m1
      //   1857: if_icmpne -> 2037
      //   1860: aload_0
      //   1861: aload_2
      //   1862: iload #6
      //   1864: iconst_m1
      //   1865: invokevirtual getInt : (II)I
      //   1868: putfield d : I
      //   1871: goto -> 2037
      //   1874: aload_0
      //   1875: aload_2
      //   1876: iload #6
      //   1878: aload_0
      //   1879: getfield c : F
      //   1882: invokevirtual getFloat : (IF)F
      //   1885: putfield c : F
      //   1888: goto -> 2037
      //   1891: aload_0
      //   1892: aload_2
      //   1893: iload #6
      //   1895: aload_0
      //   1896: getfield b : I
      //   1899: invokevirtual getDimensionPixelOffset : (II)I
      //   1902: putfield b : I
      //   1905: goto -> 2037
      //   1908: aload_0
      //   1909: aload_2
      //   1910: iload #6
      //   1912: aload_0
      //   1913: getfield a : I
      //   1916: invokevirtual getDimensionPixelOffset : (II)I
      //   1919: putfield a : I
      //   1922: goto -> 2037
      //   1925: aload_0
      //   1926: aload_2
      //   1927: iload #6
      //   1929: aload_0
      //   1930: getfield o : F
      //   1933: invokevirtual getFloat : (IF)F
      //   1936: ldc_w 360.0
      //   1939: frem
      //   1940: putfield o : F
      //   1943: aload_0
      //   1944: getfield o : F
      //   1947: fstore_3
      //   1948: fload_3
      //   1949: fconst_0
      //   1950: fcmpg
      //   1951: ifge -> 2037
      //   1954: aload_0
      //   1955: ldc_w 360.0
      //   1958: fload_3
      //   1959: fsub
      //   1960: ldc_w 360.0
      //   1963: frem
      //   1964: putfield o : F
      //   1967: goto -> 2037
      //   1970: aload_0
      //   1971: aload_2
      //   1972: iload #6
      //   1974: aload_0
      //   1975: getfield n : I
      //   1978: invokevirtual getDimensionPixelSize : (II)I
      //   1981: putfield n : I
      //   1984: goto -> 2037
      //   1987: aload_0
      //   1988: aload_2
      //   1989: iload #6
      //   1991: aload_0
      //   1992: getfield m : I
      //   1995: invokevirtual getResourceId : (II)I
      //   1998: putfield m : I
      //   2001: aload_0
      //   2002: getfield m : I
      //   2005: iconst_m1
      //   2006: if_icmpne -> 2037
      //   2009: aload_0
      //   2010: aload_2
      //   2011: iload #6
      //   2013: iconst_m1
      //   2014: invokevirtual getInt : (II)I
      //   2017: putfield m : I
      //   2020: goto -> 2037
      //   2023: aload_0
      //   2024: aload_2
      //   2025: iload #6
      //   2027: aload_0
      //   2028: getfield R : I
      //   2031: invokevirtual getInt : (II)I
      //   2034: putfield R : I
      //   2037: iload #5
      //   2039: iconst_1
      //   2040: iadd
      //   2041: istore #5
      //   2043: goto -> 346
      //   2046: aload_2
      //   2047: invokevirtual recycle : ()V
      //   2050: aload_0
      //   2051: invokevirtual a : ()V
      //   2054: return
      //   2055: astore_1
      //   2056: goto -> 2037
      //   2059: astore_1
      //   2060: goto -> 1003
      //   2063: astore_1
      //   2064: goto -> 1044
      //   2067: astore_1
      //   2068: goto -> 1111
      //   2071: astore_1
      //   2072: goto -> 1152
      // Exception table:
      //   from	to	target	type
      //   880	892	2055	java/lang/NumberFormatException
      //   905	921	2055	java/lang/NumberFormatException
      //   924	932	2055	java/lang/NumberFormatException
      //   952	957	2055	java/lang/NumberFormatException
      //   986	1000	2059	java/lang/Exception
      //   1027	1041	2063	java/lang/Exception
      //   1094	1108	2067	java/lang/Exception
      //   1135	1149	2071	java/lang/Exception
    }
    
    public b(ViewGroup.LayoutParams param1LayoutParams) {
      super(param1LayoutParams);
    }
    
    public void a() {
      this.Y = false;
      this.V = true;
      this.W = true;
      if (this.width == -2 && this.S) {
        this.V = false;
        if (this.H == 0)
          this.H = 1; 
      } 
      if (this.height == -2 && this.T) {
        this.W = false;
        if (this.I == 0)
          this.I = 1; 
      } 
      if (this.width == 0 || this.width == -1) {
        this.V = false;
        if (this.width == 0 && this.H == 1) {
          this.width = -2;
          this.S = true;
        } 
      } 
      if (this.height == 0 || this.height == -1) {
        this.W = false;
        if (this.height == 0 && this.I == 1) {
          this.height = -2;
          this.T = true;
        } 
      } 
      if (this.c != -1.0F || this.a != -1 || this.b != -1) {
        this.Y = true;
        this.V = true;
        this.W = true;
        if (!(this.m0 instanceof g))
          this.m0 = (e)new g(); 
        ((g)this.m0).u(this.R);
      } 
    }
    
    @TargetApi(17)
    public void resolveLayoutDirection(int param1Int) {
      // Byte code:
      //   0: aload_0
      //   1: getfield leftMargin : I
      //   4: istore #4
      //   6: aload_0
      //   7: getfield rightMargin : I
      //   10: istore #5
      //   12: getstatic android/os/Build$VERSION.SDK_INT : I
      //   15: istore #6
      //   17: iconst_0
      //   18: istore_3
      //   19: iload #6
      //   21: bipush #17
      //   23: if_icmplt -> 44
      //   26: aload_0
      //   27: iload_1
      //   28: invokespecial resolveLayoutDirection : (I)V
      //   31: iconst_1
      //   32: aload_0
      //   33: invokevirtual getLayoutDirection : ()I
      //   36: if_icmpne -> 44
      //   39: iconst_1
      //   40: istore_1
      //   41: goto -> 46
      //   44: iconst_0
      //   45: istore_1
      //   46: aload_0
      //   47: iconst_m1
      //   48: putfield e0 : I
      //   51: aload_0
      //   52: iconst_m1
      //   53: putfield f0 : I
      //   56: aload_0
      //   57: iconst_m1
      //   58: putfield c0 : I
      //   61: aload_0
      //   62: iconst_m1
      //   63: putfield d0 : I
      //   66: aload_0
      //   67: iconst_m1
      //   68: putfield g0 : I
      //   71: aload_0
      //   72: iconst_m1
      //   73: putfield h0 : I
      //   76: aload_0
      //   77: aload_0
      //   78: getfield t : I
      //   81: putfield g0 : I
      //   84: aload_0
      //   85: aload_0
      //   86: getfield v : I
      //   89: putfield h0 : I
      //   92: aload_0
      //   93: aload_0
      //   94: getfield z : F
      //   97: putfield i0 : F
      //   100: aload_0
      //   101: aload_0
      //   102: getfield a : I
      //   105: putfield j0 : I
      //   108: aload_0
      //   109: aload_0
      //   110: getfield b : I
      //   113: putfield k0 : I
      //   116: aload_0
      //   117: aload_0
      //   118: getfield c : F
      //   121: putfield l0 : F
      //   124: iload_1
      //   125: ifeq -> 348
      //   128: aload_0
      //   129: getfield p : I
      //   132: istore_1
      //   133: iload_1
      //   134: iconst_m1
      //   135: if_icmpeq -> 148
      //   138: aload_0
      //   139: iload_1
      //   140: putfield e0 : I
      //   143: iconst_1
      //   144: istore_1
      //   145: goto -> 171
      //   148: aload_0
      //   149: getfield q : I
      //   152: istore #6
      //   154: iload_3
      //   155: istore_1
      //   156: iload #6
      //   158: iconst_m1
      //   159: if_icmpeq -> 171
      //   162: aload_0
      //   163: iload #6
      //   165: putfield f0 : I
      //   168: goto -> 143
      //   171: aload_0
      //   172: getfield r : I
      //   175: istore_3
      //   176: iload_3
      //   177: iconst_m1
      //   178: if_icmpeq -> 188
      //   181: aload_0
      //   182: iload_3
      //   183: putfield d0 : I
      //   186: iconst_1
      //   187: istore_1
      //   188: aload_0
      //   189: getfield s : I
      //   192: istore_3
      //   193: iload_3
      //   194: iconst_m1
      //   195: if_icmpeq -> 205
      //   198: aload_0
      //   199: iload_3
      //   200: putfield c0 : I
      //   203: iconst_1
      //   204: istore_1
      //   205: aload_0
      //   206: getfield x : I
      //   209: istore_3
      //   210: iload_3
      //   211: iconst_m1
      //   212: if_icmpeq -> 220
      //   215: aload_0
      //   216: iload_3
      //   217: putfield h0 : I
      //   220: aload_0
      //   221: getfield y : I
      //   224: istore_3
      //   225: iload_3
      //   226: iconst_m1
      //   227: if_icmpeq -> 235
      //   230: aload_0
      //   231: iload_3
      //   232: putfield g0 : I
      //   235: iload_1
      //   236: ifeq -> 249
      //   239: aload_0
      //   240: fconst_1
      //   241: aload_0
      //   242: getfield z : F
      //   245: fsub
      //   246: putfield i0 : F
      //   249: aload_0
      //   250: getfield Y : Z
      //   253: ifeq -> 438
      //   256: aload_0
      //   257: getfield R : I
      //   260: iconst_1
      //   261: if_icmpne -> 438
      //   264: aload_0
      //   265: getfield c : F
      //   268: fstore_2
      //   269: fload_2
      //   270: ldc -1.0
      //   272: fcmpl
      //   273: ifeq -> 296
      //   276: aload_0
      //   277: fconst_1
      //   278: fload_2
      //   279: fsub
      //   280: putfield l0 : F
      //   283: aload_0
      //   284: iconst_m1
      //   285: putfield j0 : I
      //   288: aload_0
      //   289: iconst_m1
      //   290: putfield k0 : I
      //   293: goto -> 438
      //   296: aload_0
      //   297: getfield a : I
      //   300: istore_1
      //   301: iload_1
      //   302: iconst_m1
      //   303: if_icmpeq -> 325
      //   306: aload_0
      //   307: iload_1
      //   308: putfield k0 : I
      //   311: aload_0
      //   312: iconst_m1
      //   313: putfield j0 : I
      //   316: aload_0
      //   317: ldc -1.0
      //   319: putfield l0 : F
      //   322: goto -> 438
      //   325: aload_0
      //   326: getfield b : I
      //   329: istore_1
      //   330: iload_1
      //   331: iconst_m1
      //   332: if_icmpeq -> 438
      //   335: aload_0
      //   336: iload_1
      //   337: putfield j0 : I
      //   340: aload_0
      //   341: iconst_m1
      //   342: putfield k0 : I
      //   345: goto -> 316
      //   348: aload_0
      //   349: getfield p : I
      //   352: istore_1
      //   353: iload_1
      //   354: iconst_m1
      //   355: if_icmpeq -> 363
      //   358: aload_0
      //   359: iload_1
      //   360: putfield d0 : I
      //   363: aload_0
      //   364: getfield q : I
      //   367: istore_1
      //   368: iload_1
      //   369: iconst_m1
      //   370: if_icmpeq -> 378
      //   373: aload_0
      //   374: iload_1
      //   375: putfield c0 : I
      //   378: aload_0
      //   379: getfield r : I
      //   382: istore_1
      //   383: iload_1
      //   384: iconst_m1
      //   385: if_icmpeq -> 393
      //   388: aload_0
      //   389: iload_1
      //   390: putfield e0 : I
      //   393: aload_0
      //   394: getfield s : I
      //   397: istore_1
      //   398: iload_1
      //   399: iconst_m1
      //   400: if_icmpeq -> 408
      //   403: aload_0
      //   404: iload_1
      //   405: putfield f0 : I
      //   408: aload_0
      //   409: getfield x : I
      //   412: istore_1
      //   413: iload_1
      //   414: iconst_m1
      //   415: if_icmpeq -> 423
      //   418: aload_0
      //   419: iload_1
      //   420: putfield g0 : I
      //   423: aload_0
      //   424: getfield y : I
      //   427: istore_1
      //   428: iload_1
      //   429: iconst_m1
      //   430: if_icmpeq -> 438
      //   433: aload_0
      //   434: iload_1
      //   435: putfield h0 : I
      //   438: aload_0
      //   439: getfield r : I
      //   442: iconst_m1
      //   443: if_icmpne -> 600
      //   446: aload_0
      //   447: getfield s : I
      //   450: iconst_m1
      //   451: if_icmpne -> 600
      //   454: aload_0
      //   455: getfield q : I
      //   458: iconst_m1
      //   459: if_icmpne -> 600
      //   462: aload_0
      //   463: getfield p : I
      //   466: iconst_m1
      //   467: if_icmpne -> 600
      //   470: aload_0
      //   471: getfield f : I
      //   474: istore_1
      //   475: iload_1
      //   476: iconst_m1
      //   477: if_icmpeq -> 506
      //   480: aload_0
      //   481: iload_1
      //   482: putfield e0 : I
      //   485: aload_0
      //   486: getfield rightMargin : I
      //   489: ifgt -> 536
      //   492: iload #5
      //   494: ifle -> 536
      //   497: aload_0
      //   498: iload #5
      //   500: putfield rightMargin : I
      //   503: goto -> 536
      //   506: aload_0
      //   507: getfield g : I
      //   510: istore_1
      //   511: iload_1
      //   512: iconst_m1
      //   513: if_icmpeq -> 536
      //   516: aload_0
      //   517: iload_1
      //   518: putfield f0 : I
      //   521: aload_0
      //   522: getfield rightMargin : I
      //   525: ifgt -> 536
      //   528: iload #5
      //   530: ifle -> 536
      //   533: goto -> 497
      //   536: aload_0
      //   537: getfield d : I
      //   540: istore_1
      //   541: iload_1
      //   542: iconst_m1
      //   543: if_icmpeq -> 570
      //   546: aload_0
      //   547: iload_1
      //   548: putfield c0 : I
      //   551: aload_0
      //   552: getfield leftMargin : I
      //   555: ifgt -> 600
      //   558: iload #4
      //   560: ifle -> 600
      //   563: aload_0
      //   564: iload #4
      //   566: putfield leftMargin : I
      //   569: return
      //   570: aload_0
      //   571: getfield e : I
      //   574: istore_1
      //   575: iload_1
      //   576: iconst_m1
      //   577: if_icmpeq -> 600
      //   580: aload_0
      //   581: iload_1
      //   582: putfield d0 : I
      //   585: aload_0
      //   586: getfield leftMargin : I
      //   589: ifgt -> 600
      //   592: iload #4
      //   594: ifle -> 600
      //   597: goto -> 563
      //   600: return
    }
    
    private static class a {
      public static final SparseIntArray a = new SparseIntArray();
      
      static {
        a.append(k.ConstraintLayout_Layout_layout_constraintLeft_toLeftOf, 8);
        a.append(k.ConstraintLayout_Layout_layout_constraintLeft_toRightOf, 9);
        a.append(k.ConstraintLayout_Layout_layout_constraintRight_toLeftOf, 10);
        a.append(k.ConstraintLayout_Layout_layout_constraintRight_toRightOf, 11);
        a.append(k.ConstraintLayout_Layout_layout_constraintTop_toTopOf, 12);
        a.append(k.ConstraintLayout_Layout_layout_constraintTop_toBottomOf, 13);
        a.append(k.ConstraintLayout_Layout_layout_constraintBottom_toTopOf, 14);
        a.append(k.ConstraintLayout_Layout_layout_constraintBottom_toBottomOf, 15);
        a.append(k.ConstraintLayout_Layout_layout_constraintBaseline_toBaselineOf, 16);
        a.append(k.ConstraintLayout_Layout_layout_constraintCircle, 2);
        a.append(k.ConstraintLayout_Layout_layout_constraintCircleRadius, 3);
        a.append(k.ConstraintLayout_Layout_layout_constraintCircleAngle, 4);
        a.append(k.ConstraintLayout_Layout_layout_editor_absoluteX, 49);
        a.append(k.ConstraintLayout_Layout_layout_editor_absoluteY, 50);
        a.append(k.ConstraintLayout_Layout_layout_constraintGuide_begin, 5);
        a.append(k.ConstraintLayout_Layout_layout_constraintGuide_end, 6);
        a.append(k.ConstraintLayout_Layout_layout_constraintGuide_percent, 7);
        a.append(k.ConstraintLayout_Layout_android_orientation, 1);
        a.append(k.ConstraintLayout_Layout_layout_constraintStart_toEndOf, 17);
        a.append(k.ConstraintLayout_Layout_layout_constraintStart_toStartOf, 18);
        a.append(k.ConstraintLayout_Layout_layout_constraintEnd_toStartOf, 19);
        a.append(k.ConstraintLayout_Layout_layout_constraintEnd_toEndOf, 20);
        a.append(k.ConstraintLayout_Layout_layout_goneMarginLeft, 21);
        a.append(k.ConstraintLayout_Layout_layout_goneMarginTop, 22);
        a.append(k.ConstraintLayout_Layout_layout_goneMarginRight, 23);
        a.append(k.ConstraintLayout_Layout_layout_goneMarginBottom, 24);
        a.append(k.ConstraintLayout_Layout_layout_goneMarginStart, 25);
        a.append(k.ConstraintLayout_Layout_layout_goneMarginEnd, 26);
        a.append(k.ConstraintLayout_Layout_layout_constraintHorizontal_bias, 29);
        a.append(k.ConstraintLayout_Layout_layout_constraintVertical_bias, 30);
        a.append(k.ConstraintLayout_Layout_layout_constraintDimensionRatio, 44);
        a.append(k.ConstraintLayout_Layout_layout_constraintHorizontal_weight, 45);
        a.append(k.ConstraintLayout_Layout_layout_constraintVertical_weight, 46);
        a.append(k.ConstraintLayout_Layout_layout_constraintHorizontal_chainStyle, 47);
        a.append(k.ConstraintLayout_Layout_layout_constraintVertical_chainStyle, 48);
        a.append(k.ConstraintLayout_Layout_layout_constrainedWidth, 27);
        a.append(k.ConstraintLayout_Layout_layout_constrainedHeight, 28);
        a.append(k.ConstraintLayout_Layout_layout_constraintWidth_default, 31);
        a.append(k.ConstraintLayout_Layout_layout_constraintHeight_default, 32);
        a.append(k.ConstraintLayout_Layout_layout_constraintWidth_min, 33);
        a.append(k.ConstraintLayout_Layout_layout_constraintWidth_max, 34);
        a.append(k.ConstraintLayout_Layout_layout_constraintWidth_percent, 35);
        a.append(k.ConstraintLayout_Layout_layout_constraintHeight_min, 36);
        a.append(k.ConstraintLayout_Layout_layout_constraintHeight_max, 37);
        a.append(k.ConstraintLayout_Layout_layout_constraintHeight_percent, 38);
        a.append(k.ConstraintLayout_Layout_layout_constraintLeft_creator, 39);
        a.append(k.ConstraintLayout_Layout_layout_constraintTop_creator, 40);
        a.append(k.ConstraintLayout_Layout_layout_constraintRight_creator, 41);
        a.append(k.ConstraintLayout_Layout_layout_constraintBottom_creator, 42);
        a.append(k.ConstraintLayout_Layout_layout_constraintBaseline_creator, 43);
        a.append(k.ConstraintLayout_Layout_layout_constraintTag, 51);
      }
    }
  }
  
  private static class a {
    public static final SparseIntArray a = new SparseIntArray();
    
    static {
      a.append(k.ConstraintLayout_Layout_layout_constraintLeft_toLeftOf, 8);
      a.append(k.ConstraintLayout_Layout_layout_constraintLeft_toRightOf, 9);
      a.append(k.ConstraintLayout_Layout_layout_constraintRight_toLeftOf, 10);
      a.append(k.ConstraintLayout_Layout_layout_constraintRight_toRightOf, 11);
      a.append(k.ConstraintLayout_Layout_layout_constraintTop_toTopOf, 12);
      a.append(k.ConstraintLayout_Layout_layout_constraintTop_toBottomOf, 13);
      a.append(k.ConstraintLayout_Layout_layout_constraintBottom_toTopOf, 14);
      a.append(k.ConstraintLayout_Layout_layout_constraintBottom_toBottomOf, 15);
      a.append(k.ConstraintLayout_Layout_layout_constraintBaseline_toBaselineOf, 16);
      a.append(k.ConstraintLayout_Layout_layout_constraintCircle, 2);
      a.append(k.ConstraintLayout_Layout_layout_constraintCircleRadius, 3);
      a.append(k.ConstraintLayout_Layout_layout_constraintCircleAngle, 4);
      a.append(k.ConstraintLayout_Layout_layout_editor_absoluteX, 49);
      a.append(k.ConstraintLayout_Layout_layout_editor_absoluteY, 50);
      a.append(k.ConstraintLayout_Layout_layout_constraintGuide_begin, 5);
      a.append(k.ConstraintLayout_Layout_layout_constraintGuide_end, 6);
      a.append(k.ConstraintLayout_Layout_layout_constraintGuide_percent, 7);
      a.append(k.ConstraintLayout_Layout_android_orientation, 1);
      a.append(k.ConstraintLayout_Layout_layout_constraintStart_toEndOf, 17);
      a.append(k.ConstraintLayout_Layout_layout_constraintStart_toStartOf, 18);
      a.append(k.ConstraintLayout_Layout_layout_constraintEnd_toStartOf, 19);
      a.append(k.ConstraintLayout_Layout_layout_constraintEnd_toEndOf, 20);
      a.append(k.ConstraintLayout_Layout_layout_goneMarginLeft, 21);
      a.append(k.ConstraintLayout_Layout_layout_goneMarginTop, 22);
      a.append(k.ConstraintLayout_Layout_layout_goneMarginRight, 23);
      a.append(k.ConstraintLayout_Layout_layout_goneMarginBottom, 24);
      a.append(k.ConstraintLayout_Layout_layout_goneMarginStart, 25);
      a.append(k.ConstraintLayout_Layout_layout_goneMarginEnd, 26);
      a.append(k.ConstraintLayout_Layout_layout_constraintHorizontal_bias, 29);
      a.append(k.ConstraintLayout_Layout_layout_constraintVertical_bias, 30);
      a.append(k.ConstraintLayout_Layout_layout_constraintDimensionRatio, 44);
      a.append(k.ConstraintLayout_Layout_layout_constraintHorizontal_weight, 45);
      a.append(k.ConstraintLayout_Layout_layout_constraintVertical_weight, 46);
      a.append(k.ConstraintLayout_Layout_layout_constraintHorizontal_chainStyle, 47);
      a.append(k.ConstraintLayout_Layout_layout_constraintVertical_chainStyle, 48);
      a.append(k.ConstraintLayout_Layout_layout_constrainedWidth, 27);
      a.append(k.ConstraintLayout_Layout_layout_constrainedHeight, 28);
      a.append(k.ConstraintLayout_Layout_layout_constraintWidth_default, 31);
      a.append(k.ConstraintLayout_Layout_layout_constraintHeight_default, 32);
      a.append(k.ConstraintLayout_Layout_layout_constraintWidth_min, 33);
      a.append(k.ConstraintLayout_Layout_layout_constraintWidth_max, 34);
      a.append(k.ConstraintLayout_Layout_layout_constraintWidth_percent, 35);
      a.append(k.ConstraintLayout_Layout_layout_constraintHeight_min, 36);
      a.append(k.ConstraintLayout_Layout_layout_constraintHeight_max, 37);
      a.append(k.ConstraintLayout_Layout_layout_constraintHeight_percent, 38);
      a.append(k.ConstraintLayout_Layout_layout_constraintLeft_creator, 39);
      a.append(k.ConstraintLayout_Layout_layout_constraintTop_creator, 40);
      a.append(k.ConstraintLayout_Layout_layout_constraintRight_creator, 41);
      a.append(k.ConstraintLayout_Layout_layout_constraintBottom_creator, 42);
      a.append(k.ConstraintLayout_Layout_layout_constraintBaseline_creator, 43);
      a.append(k.ConstraintLayout_Layout_layout_constraintTag, 51);
    }
  }
  
  class c implements b.e.b.k.m.b.b {
    ConstraintLayout a;
    
    int b;
    
    int c;
    
    int d;
    
    int e;
    
    int f;
    
    int g;
    
    public c(ConstraintLayout this$0, ConstraintLayout param1ConstraintLayout1) {
      this.a = param1ConstraintLayout1;
    }
    
    public final void a() {
      int j = this.a.getChildCount();
      boolean bool = false;
      int i;
      for (i = 0; i < j; i++) {
        View view = this.a.getChildAt(i);
        if (view instanceof i)
          ((i)view).a(this.a); 
      } 
      j = ConstraintLayout.a(this.a).size();
      if (j > 0)
        for (i = bool; i < j; i++)
          ((c)ConstraintLayout.a(this.a).get(i)).c(this.a);  
    }
    
    public void a(int param1Int1, int param1Int2, int param1Int3, int param1Int4, int param1Int5, int param1Int6) {
      this.b = param1Int3;
      this.c = param1Int4;
      this.d = param1Int5;
      this.e = param1Int6;
      this.f = param1Int1;
      this.g = param1Int2;
    }
    
    @SuppressLint({"WrongCall"})
    public final void a(e param1e, b.e.b.k.m.b.a param1a) {
      // Byte code:
      //   0: aload_1
      //   1: ifnonnull -> 5
      //   4: return
      //   5: aload_1
      //   6: invokevirtual y : ()I
      //   9: bipush #8
      //   11: if_icmpne -> 37
      //   14: aload_1
      //   15: invokevirtual E : ()Z
      //   18: ifne -> 37
      //   21: aload_2
      //   22: iconst_0
      //   23: putfield e : I
      //   26: aload_2
      //   27: iconst_0
      //   28: putfield f : I
      //   31: aload_2
      //   32: iconst_0
      //   33: putfield g : I
      //   36: return
      //   37: aload_2
      //   38: getfield a : Lb/e/b/k/e$b;
      //   41: astore #20
      //   43: aload_2
      //   44: getfield b : Lb/e/b/k/e$b;
      //   47: astore #21
      //   49: aload_2
      //   50: getfield c : I
      //   53: istore #5
      //   55: aload_2
      //   56: getfield d : I
      //   59: istore #8
      //   61: aload_0
      //   62: getfield b : I
      //   65: aload_0
      //   66: getfield c : I
      //   69: iadd
      //   70: istore #9
      //   72: aload_0
      //   73: getfield d : I
      //   76: istore #4
      //   78: aload_1
      //   79: invokevirtual f : ()Ljava/lang/Object;
      //   82: checkcast android/view/View
      //   85: astore #19
      //   87: getstatic androidx/constraintlayout/widget/ConstraintLayout$a.a : [I
      //   90: aload #20
      //   92: invokevirtual ordinal : ()I
      //   95: iaload
      //   96: istore #6
      //   98: iload #6
      //   100: iconst_1
      //   101: if_icmpeq -> 309
      //   104: iload #6
      //   106: iconst_2
      //   107: if_icmpeq -> 282
      //   110: iload #6
      //   112: iconst_3
      //   113: if_icmpeq -> 255
      //   116: iload #6
      //   118: iconst_4
      //   119: if_icmpeq -> 135
      //   122: iconst_0
      //   123: istore #4
      //   125: iconst_0
      //   126: istore #7
      //   128: iload #4
      //   130: istore #5
      //   132: goto -> 329
      //   135: aload_0
      //   136: getfield f : I
      //   139: iload #4
      //   141: bipush #-2
      //   143: invokestatic getChildMeasureSpec : (III)I
      //   146: istore #7
      //   148: aload_1
      //   149: getfield j : I
      //   152: iconst_1
      //   153: if_icmpne -> 162
      //   156: iconst_1
      //   157: istore #4
      //   159: goto -> 165
      //   162: iconst_0
      //   163: istore #4
      //   165: aload_1
      //   166: getfield g : [I
      //   169: astore #22
      //   171: aload #22
      //   173: iconst_2
      //   174: iconst_0
      //   175: iastore
      //   176: iload #7
      //   178: istore #5
      //   180: aload_2
      //   181: getfield j : Z
      //   184: ifeq -> 303
      //   187: iload #4
      //   189: ifeq -> 210
      //   192: aload #22
      //   194: iconst_3
      //   195: iaload
      //   196: ifeq -> 210
      //   199: aload #22
      //   201: iconst_0
      //   202: iaload
      //   203: aload_1
      //   204: invokevirtual z : ()I
      //   207: if_icmpne -> 218
      //   210: aload #19
      //   212: instanceof androidx/constraintlayout/widget/i
      //   215: ifeq -> 224
      //   218: iconst_1
      //   219: istore #6
      //   221: goto -> 227
      //   224: iconst_0
      //   225: istore #6
      //   227: iload #4
      //   229: ifeq -> 241
      //   232: iload #7
      //   234: istore #5
      //   236: iload #6
      //   238: ifeq -> 303
      //   241: aload_1
      //   242: invokevirtual z : ()I
      //   245: ldc 1073741824
      //   247: invokestatic makeMeasureSpec : (II)I
      //   250: istore #4
      //   252: goto -> 125
      //   255: aload_0
      //   256: getfield f : I
      //   259: iload #4
      //   261: aload_1
      //   262: invokevirtual n : ()I
      //   265: iadd
      //   266: iconst_m1
      //   267: invokestatic getChildMeasureSpec : (III)I
      //   270: istore #4
      //   272: aload_1
      //   273: getfield g : [I
      //   276: iconst_2
      //   277: iconst_m1
      //   278: iastore
      //   279: goto -> 125
      //   282: aload_0
      //   283: getfield f : I
      //   286: iload #4
      //   288: bipush #-2
      //   290: invokestatic getChildMeasureSpec : (III)I
      //   293: istore #5
      //   295: aload_1
      //   296: getfield g : [I
      //   299: iconst_2
      //   300: bipush #-2
      //   302: iastore
      //   303: iconst_1
      //   304: istore #7
      //   306: goto -> 329
      //   309: iload #5
      //   311: ldc 1073741824
      //   313: invokestatic makeMeasureSpec : (II)I
      //   316: istore #4
      //   318: aload_1
      //   319: getfield g : [I
      //   322: iconst_2
      //   323: iload #5
      //   325: iastore
      //   326: goto -> 125
      //   329: getstatic androidx/constraintlayout/widget/ConstraintLayout$a.a : [I
      //   332: aload #21
      //   334: invokevirtual ordinal : ()I
      //   337: iaload
      //   338: istore #4
      //   340: iload #4
      //   342: iconst_1
      //   343: if_icmpeq -> 555
      //   346: iload #4
      //   348: iconst_2
      //   349: if_icmpeq -> 528
      //   352: iload #4
      //   354: iconst_3
      //   355: if_icmpeq -> 501
      //   358: iload #4
      //   360: iconst_4
      //   361: if_icmpeq -> 381
      //   364: iconst_0
      //   365: istore #4
      //   367: iconst_0
      //   368: istore #8
      //   370: iload #4
      //   372: istore #6
      //   374: iload #8
      //   376: istore #4
      //   378: goto -> 575
      //   381: aload_0
      //   382: getfield g : I
      //   385: iload #9
      //   387: bipush #-2
      //   389: invokestatic getChildMeasureSpec : (III)I
      //   392: istore #9
      //   394: aload_1
      //   395: getfield k : I
      //   398: iconst_1
      //   399: if_icmpne -> 408
      //   402: iconst_1
      //   403: istore #4
      //   405: goto -> 411
      //   408: iconst_0
      //   409: istore #4
      //   411: aload_1
      //   412: getfield g : [I
      //   415: astore #22
      //   417: aload #22
      //   419: iconst_3
      //   420: iconst_0
      //   421: iastore
      //   422: iload #9
      //   424: istore #6
      //   426: aload_2
      //   427: getfield j : Z
      //   430: ifeq -> 549
      //   433: iload #4
      //   435: ifeq -> 456
      //   438: aload #22
      //   440: iconst_2
      //   441: iaload
      //   442: ifeq -> 456
      //   445: aload #22
      //   447: iconst_1
      //   448: iaload
      //   449: aload_1
      //   450: invokevirtual j : ()I
      //   453: if_icmpne -> 464
      //   456: aload #19
      //   458: instanceof androidx/constraintlayout/widget/i
      //   461: ifeq -> 470
      //   464: iconst_1
      //   465: istore #8
      //   467: goto -> 473
      //   470: iconst_0
      //   471: istore #8
      //   473: iload #4
      //   475: ifeq -> 487
      //   478: iload #9
      //   480: istore #6
      //   482: iload #8
      //   484: ifeq -> 549
      //   487: aload_1
      //   488: invokevirtual j : ()I
      //   491: ldc 1073741824
      //   493: invokestatic makeMeasureSpec : (II)I
      //   496: istore #4
      //   498: goto -> 367
      //   501: aload_0
      //   502: getfield g : I
      //   505: iload #9
      //   507: aload_1
      //   508: invokevirtual x : ()I
      //   511: iadd
      //   512: iconst_m1
      //   513: invokestatic getChildMeasureSpec : (III)I
      //   516: istore #4
      //   518: aload_1
      //   519: getfield g : [I
      //   522: iconst_3
      //   523: iconst_m1
      //   524: iastore
      //   525: goto -> 367
      //   528: aload_0
      //   529: getfield g : I
      //   532: iload #9
      //   534: bipush #-2
      //   536: invokestatic getChildMeasureSpec : (III)I
      //   539: istore #6
      //   541: aload_1
      //   542: getfield g : [I
      //   545: iconst_3
      //   546: bipush #-2
      //   548: iastore
      //   549: iconst_1
      //   550: istore #4
      //   552: goto -> 575
      //   555: iload #8
      //   557: ldc 1073741824
      //   559: invokestatic makeMeasureSpec : (II)I
      //   562: istore #4
      //   564: aload_1
      //   565: getfield g : [I
      //   568: iconst_3
      //   569: iload #8
      //   571: iastore
      //   572: goto -> 367
      //   575: aload #20
      //   577: getstatic b/e/b/k/e$b.e : Lb/e/b/k/e$b;
      //   580: if_acmpne -> 589
      //   583: iconst_1
      //   584: istore #8
      //   586: goto -> 592
      //   589: iconst_0
      //   590: istore #8
      //   592: aload #21
      //   594: getstatic b/e/b/k/e$b.e : Lb/e/b/k/e$b;
      //   597: if_acmpne -> 606
      //   600: iconst_1
      //   601: istore #13
      //   603: goto -> 609
      //   606: iconst_0
      //   607: istore #13
      //   609: aload #21
      //   611: getstatic b/e/b/k/e$b.f : Lb/e/b/k/e$b;
      //   614: if_acmpeq -> 634
      //   617: aload #21
      //   619: getstatic b/e/b/k/e$b.c : Lb/e/b/k/e$b;
      //   622: if_acmpne -> 628
      //   625: goto -> 634
      //   628: iconst_0
      //   629: istore #9
      //   631: goto -> 637
      //   634: iconst_1
      //   635: istore #9
      //   637: aload #20
      //   639: getstatic b/e/b/k/e$b.f : Lb/e/b/k/e$b;
      //   642: if_acmpeq -> 662
      //   645: aload #20
      //   647: getstatic b/e/b/k/e$b.c : Lb/e/b/k/e$b;
      //   650: if_acmpne -> 656
      //   653: goto -> 662
      //   656: iconst_0
      //   657: istore #10
      //   659: goto -> 665
      //   662: iconst_1
      //   663: istore #10
      //   665: iload #8
      //   667: ifeq -> 685
      //   670: aload_1
      //   671: getfield N : F
      //   674: fconst_0
      //   675: fcmpl
      //   676: ifle -> 685
      //   679: iconst_1
      //   680: istore #11
      //   682: goto -> 688
      //   685: iconst_0
      //   686: istore #11
      //   688: iload #13
      //   690: ifeq -> 708
      //   693: aload_1
      //   694: getfield N : F
      //   697: fconst_0
      //   698: fcmpl
      //   699: ifle -> 708
      //   702: iconst_1
      //   703: istore #12
      //   705: goto -> 711
      //   708: iconst_0
      //   709: istore #12
      //   711: aload #19
      //   713: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
      //   716: checkcast androidx/constraintlayout/widget/ConstraintLayout$b
      //   719: astore #20
      //   721: aload_2
      //   722: getfield j : Z
      //   725: ifne -> 767
      //   728: iload #8
      //   730: ifeq -> 767
      //   733: aload_1
      //   734: getfield j : I
      //   737: ifne -> 767
      //   740: iload #13
      //   742: ifeq -> 767
      //   745: aload_1
      //   746: getfield k : I
      //   749: ifeq -> 755
      //   752: goto -> 767
      //   755: iconst_0
      //   756: istore #5
      //   758: iconst_0
      //   759: istore #7
      //   761: iconst_0
      //   762: istore #4
      //   764: goto -> 1181
      //   767: aload #19
      //   769: instanceof androidx/constraintlayout/widget/l
      //   772: ifeq -> 805
      //   775: aload_1
      //   776: instanceof b/e/b/k/k
      //   779: ifeq -> 805
      //   782: aload_1
      //   783: checkcast b/e/b/k/k
      //   786: astore #21
      //   788: aload #19
      //   790: checkcast androidx/constraintlayout/widget/l
      //   793: aload #21
      //   795: iload #5
      //   797: iload #6
      //   799: invokevirtual a : (Lb/e/b/k/k;II)V
      //   802: goto -> 814
      //   805: aload #19
      //   807: iload #5
      //   809: iload #6
      //   811: invokevirtual measure : (II)V
      //   814: aload #19
      //   816: invokevirtual getMeasuredWidth : ()I
      //   819: istore #14
      //   821: aload #19
      //   823: invokevirtual getMeasuredHeight : ()I
      //   826: istore #13
      //   828: aload #19
      //   830: invokevirtual getBaseline : ()I
      //   833: istore #15
      //   835: iload #7
      //   837: ifeq -> 861
      //   840: aload_1
      //   841: getfield g : [I
      //   844: astore #21
      //   846: aload #21
      //   848: iconst_0
      //   849: iload #14
      //   851: iastore
      //   852: aload #21
      //   854: iconst_2
      //   855: iload #13
      //   857: iastore
      //   858: goto -> 877
      //   861: aload_1
      //   862: getfield g : [I
      //   865: astore #21
      //   867: aload #21
      //   869: iconst_0
      //   870: iconst_0
      //   871: iastore
      //   872: aload #21
      //   874: iconst_2
      //   875: iconst_0
      //   876: iastore
      //   877: iload #4
      //   879: ifeq -> 903
      //   882: aload_1
      //   883: getfield g : [I
      //   886: astore #21
      //   888: aload #21
      //   890: iconst_1
      //   891: iload #13
      //   893: iastore
      //   894: aload #21
      //   896: iconst_3
      //   897: iload #14
      //   899: iastore
      //   900: goto -> 919
      //   903: aload_1
      //   904: getfield g : [I
      //   907: astore #21
      //   909: aload #21
      //   911: iconst_1
      //   912: iconst_0
      //   913: iastore
      //   914: aload #21
      //   916: iconst_3
      //   917: iconst_0
      //   918: iastore
      //   919: aload_1
      //   920: getfield m : I
      //   923: istore #4
      //   925: iload #4
      //   927: ifle -> 942
      //   930: iload #4
      //   932: iload #14
      //   934: invokestatic max : (II)I
      //   937: istore #4
      //   939: goto -> 946
      //   942: iload #14
      //   944: istore #4
      //   946: aload_1
      //   947: getfield n : I
      //   950: istore #8
      //   952: iload #4
      //   954: istore #7
      //   956: iload #8
      //   958: ifle -> 970
      //   961: iload #8
      //   963: iload #4
      //   965: invokestatic min : (II)I
      //   968: istore #7
      //   970: aload_1
      //   971: getfield p : I
      //   974: istore #4
      //   976: iload #4
      //   978: ifle -> 993
      //   981: iload #4
      //   983: iload #13
      //   985: invokestatic max : (II)I
      //   988: istore #8
      //   990: goto -> 997
      //   993: iload #13
      //   995: istore #8
      //   997: aload_1
      //   998: getfield q : I
      //   1001: istore #16
      //   1003: iload #8
      //   1005: istore #4
      //   1007: iload #16
      //   1009: ifle -> 1021
      //   1012: iload #16
      //   1014: iload #8
      //   1016: invokestatic min : (II)I
      //   1019: istore #4
      //   1021: iload #11
      //   1023: ifeq -> 1050
      //   1026: iload #9
      //   1028: ifeq -> 1050
      //   1031: aload_1
      //   1032: getfield N : F
      //   1035: fstore_3
      //   1036: iload #4
      //   1038: i2f
      //   1039: fload_3
      //   1040: fmul
      //   1041: ldc 0.5
      //   1043: fadd
      //   1044: f2i
      //   1045: istore #7
      //   1047: goto -> 1088
      //   1050: iload #4
      //   1052: istore #8
      //   1054: iload #12
      //   1056: ifeq -> 1084
      //   1059: iload #4
      //   1061: istore #8
      //   1063: iload #10
      //   1065: ifeq -> 1084
      //   1068: aload_1
      //   1069: getfield N : F
      //   1072: fstore_3
      //   1073: iload #7
      //   1075: i2f
      //   1076: fload_3
      //   1077: fdiv
      //   1078: ldc 0.5
      //   1080: fadd
      //   1081: f2i
      //   1082: istore #8
      //   1084: iload #8
      //   1086: istore #4
      //   1088: iload #14
      //   1090: iload #7
      //   1092: if_icmpne -> 1116
      //   1095: iload #13
      //   1097: iload #4
      //   1099: if_icmpeq -> 1105
      //   1102: goto -> 1116
      //   1105: iload #4
      //   1107: istore #5
      //   1109: iload #15
      //   1111: istore #4
      //   1113: goto -> 1181
      //   1116: iload #14
      //   1118: iload #7
      //   1120: if_icmpeq -> 1132
      //   1123: iload #7
      //   1125: ldc 1073741824
      //   1127: invokestatic makeMeasureSpec : (II)I
      //   1130: istore #5
      //   1132: iload #13
      //   1134: iload #4
      //   1136: if_icmpeq -> 1148
      //   1139: iload #4
      //   1141: ldc 1073741824
      //   1143: invokestatic makeMeasureSpec : (II)I
      //   1146: istore #6
      //   1148: aload #19
      //   1150: iload #5
      //   1152: iload #6
      //   1154: invokevirtual measure : (II)V
      //   1157: aload #19
      //   1159: invokevirtual getMeasuredWidth : ()I
      //   1162: istore #7
      //   1164: aload #19
      //   1166: invokevirtual getMeasuredHeight : ()I
      //   1169: istore #5
      //   1171: aload #19
      //   1173: invokevirtual getBaseline : ()I
      //   1176: istore #4
      //   1178: goto -> 1113
      //   1181: iload #4
      //   1183: iconst_m1
      //   1184: if_icmpeq -> 1193
      //   1187: iconst_1
      //   1188: istore #17
      //   1190: goto -> 1196
      //   1193: iconst_0
      //   1194: istore #17
      //   1196: iload #7
      //   1198: aload_2
      //   1199: getfield c : I
      //   1202: if_icmpne -> 1223
      //   1205: iload #5
      //   1207: aload_2
      //   1208: getfield d : I
      //   1211: if_icmpeq -> 1217
      //   1214: goto -> 1223
      //   1217: iconst_0
      //   1218: istore #18
      //   1220: goto -> 1226
      //   1223: iconst_1
      //   1224: istore #18
      //   1226: aload_2
      //   1227: iload #18
      //   1229: putfield i : Z
      //   1232: aload #20
      //   1234: getfield X : Z
      //   1237: ifeq -> 1243
      //   1240: iconst_1
      //   1241: istore #17
      //   1243: iload #17
      //   1245: ifeq -> 1268
      //   1248: iload #4
      //   1250: iconst_m1
      //   1251: if_icmpeq -> 1268
      //   1254: aload_1
      //   1255: invokevirtual d : ()I
      //   1258: iload #4
      //   1260: if_icmpeq -> 1268
      //   1263: aload_2
      //   1264: iconst_1
      //   1265: putfield i : Z
      //   1268: aload_2
      //   1269: iload #7
      //   1271: putfield e : I
      //   1274: aload_2
      //   1275: iload #5
      //   1277: putfield f : I
      //   1280: aload_2
      //   1281: iload #17
      //   1283: putfield h : Z
      //   1286: aload_2
      //   1287: iload #4
      //   1289: putfield g : I
      //   1292: return
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/constraintlayout/widget/ConstraintLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */