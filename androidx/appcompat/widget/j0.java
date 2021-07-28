package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.q;
import androidx.core.widget.h;
import b.a.j;
import b.g.m.v;
import java.lang.reflect.Method;

public class j0 implements q {
  private static Method H;
  
  private static Method I;
  
  private static Method J;
  
  private final e A = new e(this);
  
  private final c B = new c(this);
  
  final Handler C;
  
  private final Rect D = new Rect();
  
  private Rect E;
  
  private boolean F;
  
  PopupWindow G;
  
  private Context c;
  
  private ListAdapter d;
  
  f0 e;
  
  private int f = -2;
  
  private int g = -2;
  
  private int h;
  
  private int i;
  
  private int j = 1002;
  
  private boolean k;
  
  private boolean l;
  
  private boolean m;
  
  private int n = 0;
  
  private boolean o = false;
  
  private boolean p = false;
  
  int q = Integer.MAX_VALUE;
  
  private View r;
  
  private int s = 0;
  
  private DataSetObserver t;
  
  private View u;
  
  private Drawable v;
  
  private AdapterView.OnItemClickListener w;
  
  private AdapterView.OnItemSelectedListener x;
  
  final g y = new g(this);
  
  private final f z = new f(this);
  
  static {
    if (Build.VERSION.SDK_INT <= 28) {
      try {
        H = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", new Class[] { boolean.class });
      } catch (NoSuchMethodException noSuchMethodException) {
        Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
      } 
      try {
        J = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", new Class[] { Rect.class });
      } catch (NoSuchMethodException noSuchMethodException) {
        Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
      } 
    } 
    if (Build.VERSION.SDK_INT <= 23)
      try {
        Class<int> clazz = int.class;
        Class<boolean> clazz1 = boolean.class;
        I = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", new Class[] { View.class, clazz, clazz1 });
        return;
      } catch (NoSuchMethodException noSuchMethodException) {
        Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
      }  
  }
  
  public j0(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    this(paramContext, paramAttributeSet, paramInt, 0);
  }
  
  public j0(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2) {
    this.c = paramContext;
    this.C = new Handler(paramContext.getMainLooper());
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, j.ListPopupWindow, paramInt1, paramInt2);
    this.h = typedArray.getDimensionPixelOffset(j.ListPopupWindow_android_dropDownHorizontalOffset, 0);
    this.i = typedArray.getDimensionPixelOffset(j.ListPopupWindow_android_dropDownVerticalOffset, 0);
    if (this.i != 0)
      this.k = true; 
    typedArray.recycle();
    this.G = new q(paramContext, paramAttributeSet, paramInt1, paramInt2);
    this.G.setInputMethodMode(1);
  }
  
  private int a(View paramView, int paramInt, boolean paramBoolean) {
    if (Build.VERSION.SDK_INT <= 23) {
      Method method = I;
      if (method != null)
        try {
          return ((Integer)method.invoke(this.G, new Object[] { paramView, Integer.valueOf(paramInt), Boolean.valueOf(paramBoolean) })).intValue();
        } catch (Exception exception) {
          Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
        }  
      return this.G.getMaxAvailableHeight(paramView, paramInt);
    } 
    return this.G.getMaxAvailableHeight(paramView, paramInt, paramBoolean);
  }
  
  private void c(boolean paramBoolean) {
    if (Build.VERSION.SDK_INT <= 28) {
      Method method = H;
      if (method != null)
        try {
          method.invoke(this.G, new Object[] { Boolean.valueOf(paramBoolean) });
          return;
        } catch (Exception exception) {
          Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
          return;
        }  
    } else {
      this.G.setIsClippedToScreen(paramBoolean);
    } 
  }
  
  private int m() {
    // Byte code:
    //   0: aload_0
    //   1: getfield e : Landroidx/appcompat/widget/f0;
    //   4: astore #7
    //   6: ldc_w -2147483648
    //   9: istore_3
    //   10: iconst_1
    //   11: istore #6
    //   13: aload #7
    //   15: ifnonnull -> 370
    //   18: aload_0
    //   19: getfield c : Landroid/content/Context;
    //   22: astore #7
    //   24: new androidx/appcompat/widget/j0$a
    //   27: dup
    //   28: aload_0
    //   29: invokespecial <init> : (Landroidx/appcompat/widget/j0;)V
    //   32: pop
    //   33: aload_0
    //   34: aload_0
    //   35: aload #7
    //   37: aload_0
    //   38: getfield F : Z
    //   41: iconst_1
    //   42: ixor
    //   43: invokevirtual a : (Landroid/content/Context;Z)Landroidx/appcompat/widget/f0;
    //   46: putfield e : Landroidx/appcompat/widget/f0;
    //   49: aload_0
    //   50: getfield v : Landroid/graphics/drawable/Drawable;
    //   53: astore #8
    //   55: aload #8
    //   57: ifnull -> 69
    //   60: aload_0
    //   61: getfield e : Landroidx/appcompat/widget/f0;
    //   64: aload #8
    //   66: invokevirtual setSelector : (Landroid/graphics/drawable/Drawable;)V
    //   69: aload_0
    //   70: getfield e : Landroidx/appcompat/widget/f0;
    //   73: aload_0
    //   74: getfield d : Landroid/widget/ListAdapter;
    //   77: invokevirtual setAdapter : (Landroid/widget/ListAdapter;)V
    //   80: aload_0
    //   81: getfield e : Landroidx/appcompat/widget/f0;
    //   84: aload_0
    //   85: getfield w : Landroid/widget/AdapterView$OnItemClickListener;
    //   88: invokevirtual setOnItemClickListener : (Landroid/widget/AdapterView$OnItemClickListener;)V
    //   91: aload_0
    //   92: getfield e : Landroidx/appcompat/widget/f0;
    //   95: iconst_1
    //   96: invokevirtual setFocusable : (Z)V
    //   99: aload_0
    //   100: getfield e : Landroidx/appcompat/widget/f0;
    //   103: iconst_1
    //   104: invokevirtual setFocusableInTouchMode : (Z)V
    //   107: aload_0
    //   108: getfield e : Landroidx/appcompat/widget/f0;
    //   111: new androidx/appcompat/widget/j0$b
    //   114: dup
    //   115: aload_0
    //   116: invokespecial <init> : (Landroidx/appcompat/widget/j0;)V
    //   119: invokevirtual setOnItemSelectedListener : (Landroid/widget/AdapterView$OnItemSelectedListener;)V
    //   122: aload_0
    //   123: getfield e : Landroidx/appcompat/widget/f0;
    //   126: aload_0
    //   127: getfield A : Landroidx/appcompat/widget/j0$e;
    //   130: invokevirtual setOnScrollListener : (Landroid/widget/AbsListView$OnScrollListener;)V
    //   133: aload_0
    //   134: getfield x : Landroid/widget/AdapterView$OnItemSelectedListener;
    //   137: astore #8
    //   139: aload #8
    //   141: ifnull -> 153
    //   144: aload_0
    //   145: getfield e : Landroidx/appcompat/widget/f0;
    //   148: aload #8
    //   150: invokevirtual setOnItemSelectedListener : (Landroid/widget/AdapterView$OnItemSelectedListener;)V
    //   153: aload_0
    //   154: getfield e : Landroidx/appcompat/widget/f0;
    //   157: astore #8
    //   159: aload_0
    //   160: getfield r : Landroid/view/View;
    //   163: astore #9
    //   165: aload #9
    //   167: ifnull -> 352
    //   170: new android/widget/LinearLayout
    //   173: dup
    //   174: aload #7
    //   176: invokespecial <init> : (Landroid/content/Context;)V
    //   179: astore #7
    //   181: aload #7
    //   183: iconst_1
    //   184: invokevirtual setOrientation : (I)V
    //   187: new android/widget/LinearLayout$LayoutParams
    //   190: dup
    //   191: iconst_m1
    //   192: iconst_0
    //   193: fconst_1
    //   194: invokespecial <init> : (IIF)V
    //   197: astore #10
    //   199: aload_0
    //   200: getfield s : I
    //   203: istore_1
    //   204: iload_1
    //   205: ifeq -> 274
    //   208: iload_1
    //   209: iconst_1
    //   210: if_icmpeq -> 255
    //   213: new java/lang/StringBuilder
    //   216: dup
    //   217: invokespecial <init> : ()V
    //   220: astore #8
    //   222: aload #8
    //   224: ldc_w 'Invalid hint position '
    //   227: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   230: pop
    //   231: aload #8
    //   233: aload_0
    //   234: getfield s : I
    //   237: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   240: pop
    //   241: ldc 'ListPopupWindow'
    //   243: aload #8
    //   245: invokevirtual toString : ()Ljava/lang/String;
    //   248: invokestatic e : (Ljava/lang/String;Ljava/lang/String;)I
    //   251: pop
    //   252: goto -> 290
    //   255: aload #7
    //   257: aload #8
    //   259: aload #10
    //   261: invokevirtual addView : (Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    //   264: aload #7
    //   266: aload #9
    //   268: invokevirtual addView : (Landroid/view/View;)V
    //   271: goto -> 290
    //   274: aload #7
    //   276: aload #9
    //   278: invokevirtual addView : (Landroid/view/View;)V
    //   281: aload #7
    //   283: aload #8
    //   285: aload #10
    //   287: invokevirtual addView : (Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    //   290: aload_0
    //   291: getfield g : I
    //   294: istore_1
    //   295: iload_1
    //   296: iflt -> 306
    //   299: ldc_w -2147483648
    //   302: istore_2
    //   303: goto -> 310
    //   306: iconst_0
    //   307: istore_1
    //   308: iconst_0
    //   309: istore_2
    //   310: aload #9
    //   312: iload_1
    //   313: iload_2
    //   314: invokestatic makeMeasureSpec : (II)I
    //   317: iconst_0
    //   318: invokevirtual measure : (II)V
    //   321: aload #9
    //   323: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   326: checkcast android/widget/LinearLayout$LayoutParams
    //   329: astore #8
    //   331: aload #9
    //   333: invokevirtual getMeasuredHeight : ()I
    //   336: aload #8
    //   338: getfield topMargin : I
    //   341: iadd
    //   342: aload #8
    //   344: getfield bottomMargin : I
    //   347: iadd
    //   348: istore_1
    //   349: goto -> 358
    //   352: iconst_0
    //   353: istore_1
    //   354: aload #8
    //   356: astore #7
    //   358: aload_0
    //   359: getfield G : Landroid/widget/PopupWindow;
    //   362: aload #7
    //   364: invokevirtual setContentView : (Landroid/view/View;)V
    //   367: goto -> 426
    //   370: aload_0
    //   371: getfield G : Landroid/widget/PopupWindow;
    //   374: invokevirtual getContentView : ()Landroid/view/View;
    //   377: checkcast android/view/ViewGroup
    //   380: astore #7
    //   382: aload_0
    //   383: getfield r : Landroid/view/View;
    //   386: astore #7
    //   388: aload #7
    //   390: ifnull -> 424
    //   393: aload #7
    //   395: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   398: checkcast android/widget/LinearLayout$LayoutParams
    //   401: astore #8
    //   403: aload #7
    //   405: invokevirtual getMeasuredHeight : ()I
    //   408: aload #8
    //   410: getfield topMargin : I
    //   413: iadd
    //   414: aload #8
    //   416: getfield bottomMargin : I
    //   419: iadd
    //   420: istore_1
    //   421: goto -> 426
    //   424: iconst_0
    //   425: istore_1
    //   426: aload_0
    //   427: getfield G : Landroid/widget/PopupWindow;
    //   430: invokevirtual getBackground : ()Landroid/graphics/drawable/Drawable;
    //   433: astore #7
    //   435: aload #7
    //   437: ifnull -> 496
    //   440: aload #7
    //   442: aload_0
    //   443: getfield D : Landroid/graphics/Rect;
    //   446: invokevirtual getPadding : (Landroid/graphics/Rect;)Z
    //   449: pop
    //   450: aload_0
    //   451: getfield D : Landroid/graphics/Rect;
    //   454: astore #7
    //   456: aload #7
    //   458: getfield top : I
    //   461: istore #5
    //   463: aload #7
    //   465: getfield bottom : I
    //   468: iload #5
    //   470: iadd
    //   471: istore #4
    //   473: iload #4
    //   475: istore_2
    //   476: aload_0
    //   477: getfield k : Z
    //   480: ifne -> 505
    //   483: aload_0
    //   484: iload #5
    //   486: ineg
    //   487: putfield i : I
    //   490: iload #4
    //   492: istore_2
    //   493: goto -> 505
    //   496: aload_0
    //   497: getfield D : Landroid/graphics/Rect;
    //   500: invokevirtual setEmpty : ()V
    //   503: iconst_0
    //   504: istore_2
    //   505: aload_0
    //   506: getfield G : Landroid/widget/PopupWindow;
    //   509: invokevirtual getInputMethodMode : ()I
    //   512: iconst_2
    //   513: if_icmpne -> 519
    //   516: goto -> 522
    //   519: iconst_0
    //   520: istore #6
    //   522: aload_0
    //   523: aload_0
    //   524: invokevirtual i : ()Landroid/view/View;
    //   527: aload_0
    //   528: getfield i : I
    //   531: iload #6
    //   533: invokespecial a : (Landroid/view/View;IZ)I
    //   536: istore #4
    //   538: aload_0
    //   539: getfield o : Z
    //   542: ifne -> 683
    //   545: aload_0
    //   546: getfield f : I
    //   549: iconst_m1
    //   550: if_icmpne -> 556
    //   553: goto -> 683
    //   556: aload_0
    //   557: getfield g : I
    //   560: istore #5
    //   562: iload #5
    //   564: bipush #-2
    //   566: if_icmpeq -> 591
    //   569: ldc_w 1073741824
    //   572: istore_3
    //   573: iload #5
    //   575: iconst_m1
    //   576: if_icmpeq -> 591
    //   579: iload #5
    //   581: ldc_w 1073741824
    //   584: invokestatic makeMeasureSpec : (II)I
    //   587: istore_3
    //   588: goto -> 634
    //   591: aload_0
    //   592: getfield c : Landroid/content/Context;
    //   595: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   598: invokevirtual getDisplayMetrics : ()Landroid/util/DisplayMetrics;
    //   601: getfield widthPixels : I
    //   604: istore #5
    //   606: aload_0
    //   607: getfield D : Landroid/graphics/Rect;
    //   610: astore #7
    //   612: iload #5
    //   614: aload #7
    //   616: getfield left : I
    //   619: aload #7
    //   621: getfield right : I
    //   624: iadd
    //   625: isub
    //   626: iload_3
    //   627: invokestatic makeMeasureSpec : (II)I
    //   630: istore_3
    //   631: goto -> 588
    //   634: aload_0
    //   635: getfield e : Landroidx/appcompat/widget/f0;
    //   638: iload_3
    //   639: iconst_0
    //   640: iconst_m1
    //   641: iload #4
    //   643: iload_1
    //   644: isub
    //   645: iconst_m1
    //   646: invokevirtual a : (IIIII)I
    //   649: istore #4
    //   651: iload_1
    //   652: istore_3
    //   653: iload #4
    //   655: ifle -> 678
    //   658: iload_1
    //   659: iload_2
    //   660: aload_0
    //   661: getfield e : Landroidx/appcompat/widget/f0;
    //   664: invokevirtual getPaddingTop : ()I
    //   667: aload_0
    //   668: getfield e : Landroidx/appcompat/widget/f0;
    //   671: invokevirtual getPaddingBottom : ()I
    //   674: iadd
    //   675: iadd
    //   676: iadd
    //   677: istore_3
    //   678: iload #4
    //   680: iload_3
    //   681: iadd
    //   682: ireturn
    //   683: iload #4
    //   685: iload_2
    //   686: iadd
    //   687: ireturn
  }
  
  private void n() {
    View view = this.r;
    if (view != null) {
      ViewParent viewParent = view.getParent();
      if (viewParent instanceof ViewGroup)
        ((ViewGroup)viewParent).removeView(this.r); 
    } 
  }
  
  public int a() {
    return this.h;
  }
  
  f0 a(Context paramContext, boolean paramBoolean) {
    return new f0(paramContext, paramBoolean);
  }
  
  public void a(int paramInt) {
    this.i = paramInt;
    this.k = true;
  }
  
  public void a(Rect paramRect) {
    if (paramRect != null) {
      paramRect = new Rect(paramRect);
    } else {
      paramRect = null;
    } 
    this.E = paramRect;
  }
  
  public void a(Drawable paramDrawable) {
    this.G.setBackgroundDrawable(paramDrawable);
  }
  
  public void a(View paramView) {
    this.u = paramView;
  }
  
  public void a(AdapterView.OnItemClickListener paramOnItemClickListener) {
    this.w = paramOnItemClickListener;
  }
  
  public void a(ListAdapter paramListAdapter) {
    DataSetObserver dataSetObserver = this.t;
    if (dataSetObserver == null) {
      this.t = new d(this);
    } else {
      ListAdapter listAdapter = this.d;
      if (listAdapter != null)
        listAdapter.unregisterDataSetObserver(dataSetObserver); 
    } 
    this.d = paramListAdapter;
    if (paramListAdapter != null)
      paramListAdapter.registerDataSetObserver(this.t); 
    f0 f01 = this.e;
    if (f01 != null)
      f01.setAdapter(this.d); 
  }
  
  public void a(PopupWindow.OnDismissListener paramOnDismissListener) {
    this.G.setOnDismissListener(paramOnDismissListener);
  }
  
  public void a(boolean paramBoolean) {
    this.F = paramBoolean;
    this.G.setFocusable(paramBoolean);
  }
  
  public void b(boolean paramBoolean) {
    this.m = true;
    this.l = paramBoolean;
  }
  
  public boolean b() {
    return this.G.isShowing();
  }
  
  public void c() {
    int i;
    int j = m();
    boolean bool1 = k();
    h.a(this.G, this.j);
    boolean bool2 = this.G.isShowing();
    boolean bool = true;
    if (bool2) {
      if (!v.G(i()))
        return; 
      int m = this.g;
      if (m == -1) {
        i = -1;
      } else {
        i = m;
        if (m == -2)
          i = i().getWidth(); 
      } 
      m = this.f;
      if (m == -1) {
        if (!bool1)
          j = -1; 
        if (bool1) {
          PopupWindow popupWindow2 = this.G;
          if (this.g == -1) {
            m = -1;
          } else {
            m = 0;
          } 
          popupWindow2.setWidth(m);
          this.G.setHeight(0);
        } else {
          PopupWindow popupWindow2 = this.G;
          if (this.g == -1) {
            m = -1;
          } else {
            m = 0;
          } 
          popupWindow2.setWidth(m);
          this.G.setHeight(-1);
        } 
      } else if (m != -2) {
        j = m;
      } 
      PopupWindow popupWindow1 = this.G;
      if (this.p || this.o)
        bool = false; 
      popupWindow1.setOutsideTouchable(bool);
      popupWindow1 = this.G;
      View view = i();
      m = this.h;
      int n = this.i;
      if (i < 0)
        i = -1; 
      if (j < 0)
        j = -1; 
      popupWindow1.update(view, m, n, i, j);
      return;
    } 
    int k = this.g;
    if (k == -1) {
      i = -1;
    } else {
      i = k;
      if (k == -2)
        i = i().getWidth(); 
    } 
    k = this.f;
    if (k == -1) {
      j = -1;
    } else if (k != -2) {
      j = k;
    } 
    this.G.setWidth(i);
    this.G.setHeight(j);
    c(true);
    PopupWindow popupWindow = this.G;
    if (!this.p && !this.o) {
      bool = true;
    } else {
      bool = false;
    } 
    popupWindow.setOutsideTouchable(bool);
    this.G.setTouchInterceptor(this.z);
    if (this.m)
      h.a(this.G, this.l); 
    if (Build.VERSION.SDK_INT <= 28) {
      Method method = J;
      if (method != null)
        try {
          method.invoke(this.G, new Object[] { this.E });
        } catch (Exception exception) {
          Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", exception);
        }  
    } else {
      this.G.setEpicenterBounds(this.E);
    } 
    h.a(this.G, i(), this.h, this.i, this.n);
    this.e.setSelection(-1);
    if (!this.F || this.e.isInTouchMode())
      h(); 
    if (!this.F)
      this.C.post(this.B); 
  }
  
  public void c(int paramInt) {
    this.h = paramInt;
  }
  
  public Drawable d() {
    return this.G.getBackground();
  }
  
  public void d(int paramInt) {
    this.G.setAnimationStyle(paramInt);
  }
  
  public void dismiss() {
    this.G.dismiss();
    n();
    this.G.setContentView(null);
    this.e = null;
    this.C.removeCallbacks(this.y);
  }
  
  public ListView e() {
    return this.e;
  }
  
  public void e(int paramInt) {
    Drawable drawable = this.G.getBackground();
    if (drawable != null) {
      drawable.getPadding(this.D);
      Rect rect = this.D;
      this.g = rect.left + rect.right + paramInt;
      return;
    } 
    j(paramInt);
  }
  
  public int f() {
    return !this.k ? 0 : this.i;
  }
  
  public void f(int paramInt) {
    this.n = paramInt;
  }
  
  public void g(int paramInt) {
    this.G.setInputMethodMode(paramInt);
  }
  
  public void h() {
    f0 f01 = this.e;
    if (f01 != null) {
      f01.setListSelectionHidden(true);
      f01.requestLayout();
    } 
  }
  
  public void h(int paramInt) {
    this.s = paramInt;
  }
  
  public View i() {
    return this.u;
  }
  
  public void i(int paramInt) {
    f0 f01 = this.e;
    if (b() && f01 != null) {
      f01.setListSelectionHidden(false);
      f01.setSelection(paramInt);
      if (f01.getChoiceMode() != 0)
        f01.setItemChecked(paramInt, true); 
    } 
  }
  
  public int j() {
    return this.g;
  }
  
  public void j(int paramInt) {
    this.g = paramInt;
  }
  
  public boolean k() {
    return (this.G.getInputMethodMode() == 2);
  }
  
  public boolean l() {
    return this.F;
  }
  
  class a implements Runnable {
    a(j0 this$0) {}
    
    public void run() {
      View view = this.c.i();
      if (view != null && view.getWindowToken() != null)
        this.c.c(); 
    }
  }
  
  class b implements AdapterView.OnItemSelectedListener {
    b(j0 this$0) {}
    
    public void onItemSelected(AdapterView<?> param1AdapterView, View param1View, int param1Int, long param1Long) {
      if (param1Int != -1) {
        f0 f0 = this.c.e;
        if (f0 != null)
          f0.setListSelectionHidden(false); 
      } 
    }
    
    public void onNothingSelected(AdapterView<?> param1AdapterView) {}
  }
  
  private class c implements Runnable {
    c(j0 this$0) {}
    
    public void run() {
      this.c.h();
    }
  }
  
  private class d extends DataSetObserver {
    d(j0 this$0) {}
    
    public void onChanged() {
      if (this.a.b())
        this.a.c(); 
    }
    
    public void onInvalidated() {
      this.a.dismiss();
    }
  }
  
  private class e implements AbsListView.OnScrollListener {
    e(j0 this$0) {}
    
    public void onScroll(AbsListView param1AbsListView, int param1Int1, int param1Int2, int param1Int3) {}
    
    public void onScrollStateChanged(AbsListView param1AbsListView, int param1Int) {
      if (param1Int == 1 && !this.a.k() && this.a.G.getContentView() != null) {
        j0 j01 = this.a;
        j01.C.removeCallbacks(j01.y);
        this.a.y.run();
      } 
    }
  }
  
  private class f implements View.OnTouchListener {
    f(j0 this$0) {}
    
    public boolean onTouch(View param1View, MotionEvent param1MotionEvent) {
      int i = param1MotionEvent.getAction();
      int j = (int)param1MotionEvent.getX();
      int k = (int)param1MotionEvent.getY();
      if (i == 0) {
        PopupWindow popupWindow = this.c.G;
        if (popupWindow != null && popupWindow.isShowing() && j >= 0 && j < this.c.G.getWidth() && k >= 0 && k < this.c.G.getHeight()) {
          j0 j01 = this.c;
          j01.C.postDelayed(j01.y, 250L);
          return false;
        } 
      } 
      if (i == 1) {
        j0 j01 = this.c;
        j01.C.removeCallbacks(j01.y);
      } 
      return false;
    }
  }
  
  private class g implements Runnable {
    g(j0 this$0) {}
    
    public void run() {
      f0 f0 = this.c.e;
      if (f0 != null && v.G((View)f0) && this.c.e.getCount() > this.c.e.getChildCount()) {
        int i = this.c.e.getChildCount();
        j0 j01 = this.c;
        if (i <= j01.q) {
          j01.G.setInputMethodMode(2);
          this.c.c();
        } 
      } 
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/appcompat/widget/j0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */