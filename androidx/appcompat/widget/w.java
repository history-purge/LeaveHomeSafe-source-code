package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.view.menu.q;
import b.g.m.u;
import b.g.m.v;

public class w extends Spinner implements u {
  private static final int[] k = new int[] { 16843505 };
  
  private final e c;
  
  private final Context d;
  
  private h0 e;
  
  private SpinnerAdapter f;
  
  private final boolean g;
  
  private g h;
  
  int i;
  
  final Rect j;
  
  public w(Context paramContext, int paramInt) {
    this(paramContext, null, b.a.a.spinnerStyle, paramInt);
  }
  
  public w(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, b.a.a.spinnerStyle);
  }
  
  public w(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    this(paramContext, paramAttributeSet, paramInt, -1);
  }
  
  public w(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2) {
    this(paramContext, paramAttributeSet, paramInt1, paramInt2, null);
  }
  
  public w(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2, Resources.Theme paramTheme) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: aload_2
    //   3: iload_3
    //   4: invokespecial <init> : (Landroid/content/Context;Landroid/util/AttributeSet;I)V
    //   7: aload_0
    //   8: new android/graphics/Rect
    //   11: dup
    //   12: invokespecial <init> : ()V
    //   15: putfield j : Landroid/graphics/Rect;
    //   18: aload_0
    //   19: aload_0
    //   20: invokevirtual getContext : ()Landroid/content/Context;
    //   23: invokestatic a : (Landroid/view/View;Landroid/content/Context;)V
    //   26: aload_1
    //   27: aload_2
    //   28: getstatic b/a/j.Spinner : [I
    //   31: iload_3
    //   32: iconst_0
    //   33: invokestatic a : (Landroid/content/Context;Landroid/util/AttributeSet;[III)Landroidx/appcompat/widget/x0;
    //   36: astore #10
    //   38: aload_0
    //   39: new androidx/appcompat/widget/e
    //   42: dup
    //   43: aload_0
    //   44: invokespecial <init> : (Landroid/view/View;)V
    //   47: putfield c : Landroidx/appcompat/widget/e;
    //   50: aload #5
    //   52: ifnull -> 76
    //   55: new b/a/o/d
    //   58: dup
    //   59: aload_1
    //   60: aload #5
    //   62: invokespecial <init> : (Landroid/content/Context;Landroid/content/res/Resources$Theme;)V
    //   65: astore #5
    //   67: aload_0
    //   68: aload #5
    //   70: putfield d : Landroid/content/Context;
    //   73: goto -> 112
    //   76: aload #10
    //   78: getstatic b/a/j.Spinner_popupTheme : I
    //   81: iconst_0
    //   82: invokevirtual g : (II)I
    //   85: istore #6
    //   87: iload #6
    //   89: ifeq -> 107
    //   92: new b/a/o/d
    //   95: dup
    //   96: aload_1
    //   97: iload #6
    //   99: invokespecial <init> : (Landroid/content/Context;I)V
    //   102: astore #5
    //   104: goto -> 67
    //   107: aload_0
    //   108: aload_1
    //   109: putfield d : Landroid/content/Context;
    //   112: iload #4
    //   114: istore #7
    //   116: iload #4
    //   118: iconst_m1
    //   119: if_icmpne -> 245
    //   122: aload_1
    //   123: aload_2
    //   124: getstatic androidx/appcompat/widget/w.k : [I
    //   127: iload_3
    //   128: iconst_0
    //   129: invokevirtual obtainStyledAttributes : (Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
    //   132: astore #5
    //   134: iload #4
    //   136: istore #6
    //   138: aload #5
    //   140: astore #8
    //   142: aload #5
    //   144: iconst_0
    //   145: invokevirtual hasValue : (I)Z
    //   148: ifeq -> 164
    //   151: aload #5
    //   153: astore #8
    //   155: aload #5
    //   157: iconst_0
    //   158: iconst_0
    //   159: invokevirtual getInt : (II)I
    //   162: istore #6
    //   164: iload #6
    //   166: istore #7
    //   168: aload #5
    //   170: ifnull -> 245
    //   173: iload #6
    //   175: istore #4
    //   177: aload #5
    //   179: invokevirtual recycle : ()V
    //   182: iload #4
    //   184: istore #7
    //   186: goto -> 245
    //   189: astore #9
    //   191: goto -> 206
    //   194: astore_1
    //   195: aconst_null
    //   196: astore #8
    //   198: goto -> 233
    //   201: astore #9
    //   203: aconst_null
    //   204: astore #5
    //   206: aload #5
    //   208: astore #8
    //   210: ldc 'AppCompatSpinner'
    //   212: ldc 'Could not read android:spinnerMode'
    //   214: aload #9
    //   216: invokestatic i : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   219: pop
    //   220: iload #4
    //   222: istore #7
    //   224: aload #5
    //   226: ifnull -> 245
    //   229: goto -> 177
    //   232: astore_1
    //   233: aload #8
    //   235: ifnull -> 243
    //   238: aload #8
    //   240: invokevirtual recycle : ()V
    //   243: aload_1
    //   244: athrow
    //   245: iload #7
    //   247: ifeq -> 359
    //   250: iload #7
    //   252: iconst_1
    //   253: if_icmpeq -> 259
    //   256: goto -> 388
    //   259: new androidx/appcompat/widget/w$e
    //   262: dup
    //   263: aload_0
    //   264: aload_0
    //   265: getfield d : Landroid/content/Context;
    //   268: aload_2
    //   269: iload_3
    //   270: invokespecial <init> : (Landroidx/appcompat/widget/w;Landroid/content/Context;Landroid/util/AttributeSet;I)V
    //   273: astore #5
    //   275: aload_0
    //   276: getfield d : Landroid/content/Context;
    //   279: aload_2
    //   280: getstatic b/a/j.Spinner : [I
    //   283: iload_3
    //   284: iconst_0
    //   285: invokestatic a : (Landroid/content/Context;Landroid/util/AttributeSet;[III)Landroidx/appcompat/widget/x0;
    //   288: astore #8
    //   290: aload_0
    //   291: aload #8
    //   293: getstatic b/a/j.Spinner_android_dropDownWidth : I
    //   296: bipush #-2
    //   298: invokevirtual f : (II)I
    //   301: putfield i : I
    //   304: aload #5
    //   306: aload #8
    //   308: getstatic b/a/j.Spinner_android_popupBackground : I
    //   311: invokevirtual b : (I)Landroid/graphics/drawable/Drawable;
    //   314: invokevirtual a : (Landroid/graphics/drawable/Drawable;)V
    //   317: aload #5
    //   319: aload #10
    //   321: getstatic b/a/j.Spinner_android_prompt : I
    //   324: invokevirtual d : (I)Ljava/lang/String;
    //   327: invokevirtual a : (Ljava/lang/CharSequence;)V
    //   330: aload #8
    //   332: invokevirtual b : ()V
    //   335: aload_0
    //   336: aload #5
    //   338: putfield h : Landroidx/appcompat/widget/w$g;
    //   341: aload_0
    //   342: new androidx/appcompat/widget/w$a
    //   345: dup
    //   346: aload_0
    //   347: aload_0
    //   348: aload #5
    //   350: invokespecial <init> : (Landroidx/appcompat/widget/w;Landroid/view/View;Landroidx/appcompat/widget/w$e;)V
    //   353: putfield e : Landroidx/appcompat/widget/h0;
    //   356: goto -> 388
    //   359: aload_0
    //   360: new androidx/appcompat/widget/w$c
    //   363: dup
    //   364: aload_0
    //   365: invokespecial <init> : (Landroidx/appcompat/widget/w;)V
    //   368: putfield h : Landroidx/appcompat/widget/w$g;
    //   371: aload_0
    //   372: getfield h : Landroidx/appcompat/widget/w$g;
    //   375: aload #10
    //   377: getstatic b/a/j.Spinner_android_prompt : I
    //   380: invokevirtual d : (I)Ljava/lang/String;
    //   383: invokeinterface a : (Ljava/lang/CharSequence;)V
    //   388: aload #10
    //   390: getstatic b/a/j.Spinner_android_entries : I
    //   393: invokevirtual f : (I)[Ljava/lang/CharSequence;
    //   396: astore #5
    //   398: aload #5
    //   400: ifnull -> 428
    //   403: new android/widget/ArrayAdapter
    //   406: dup
    //   407: aload_1
    //   408: ldc 17367048
    //   410: aload #5
    //   412: invokespecial <init> : (Landroid/content/Context;I[Ljava/lang/Object;)V
    //   415: astore_1
    //   416: aload_1
    //   417: getstatic b/a/g.support_simple_spinner_dropdown_item : I
    //   420: invokevirtual setDropDownViewResource : (I)V
    //   423: aload_0
    //   424: aload_1
    //   425: invokevirtual setAdapter : (Landroid/widget/SpinnerAdapter;)V
    //   428: aload #10
    //   430: invokevirtual b : ()V
    //   433: aload_0
    //   434: iconst_1
    //   435: putfield g : Z
    //   438: aload_0
    //   439: getfield f : Landroid/widget/SpinnerAdapter;
    //   442: astore_1
    //   443: aload_1
    //   444: ifnull -> 457
    //   447: aload_0
    //   448: aload_1
    //   449: invokevirtual setAdapter : (Landroid/widget/SpinnerAdapter;)V
    //   452: aload_0
    //   453: aconst_null
    //   454: putfield f : Landroid/widget/SpinnerAdapter;
    //   457: aload_0
    //   458: getfield c : Landroidx/appcompat/widget/e;
    //   461: aload_2
    //   462: iload_3
    //   463: invokevirtual a : (Landroid/util/AttributeSet;I)V
    //   466: return
    // Exception table:
    //   from	to	target	type
    //   122	134	201	java/lang/Exception
    //   122	134	194	finally
    //   142	151	189	java/lang/Exception
    //   142	151	232	finally
    //   155	164	189	java/lang/Exception
    //   155	164	232	finally
    //   210	220	232	finally
  }
  
  int a(SpinnerAdapter paramSpinnerAdapter, Drawable paramDrawable) {
    int k = 0;
    if (paramSpinnerAdapter == null)
      return 0; 
    int m = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
    int n = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
    int i = Math.max(0, getSelectedItemPosition());
    int i1 = Math.min(paramSpinnerAdapter.getCount(), i + 15);
    int j = Math.max(0, i - 15 - i1 - i);
    View view = null;
    i = 0;
    while (j < i1) {
      int i3 = paramSpinnerAdapter.getItemViewType(j);
      int i2 = k;
      if (i3 != k) {
        view = null;
        i2 = i3;
      } 
      view = paramSpinnerAdapter.getView(j, view, (ViewGroup)this);
      if (view.getLayoutParams() == null)
        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2)); 
      view.measure(m, n);
      i = Math.max(i, view.getMeasuredWidth());
      j++;
      k = i2;
    } 
    j = i;
    if (paramDrawable != null) {
      paramDrawable.getPadding(this.j);
      Rect rect = this.j;
      j = i + rect.left + rect.right;
    } 
    return j;
  }
  
  void a() {
    if (Build.VERSION.SDK_INT >= 17) {
      this.h.a(getTextDirection(), getTextAlignment());
      return;
    } 
    this.h.a(-1, -1);
  }
  
  protected void drawableStateChanged() {
    super.drawableStateChanged();
    e e1 = this.c;
    if (e1 != null)
      e1.a(); 
  }
  
  public int getDropDownHorizontalOffset() {
    g g1 = this.h;
    return (g1 != null) ? g1.a() : ((Build.VERSION.SDK_INT >= 16) ? super.getDropDownHorizontalOffset() : 0);
  }
  
  public int getDropDownVerticalOffset() {
    g g1 = this.h;
    return (g1 != null) ? g1.f() : ((Build.VERSION.SDK_INT >= 16) ? super.getDropDownVerticalOffset() : 0);
  }
  
  public int getDropDownWidth() {
    return (this.h != null) ? this.i : ((Build.VERSION.SDK_INT >= 16) ? super.getDropDownWidth() : 0);
  }
  
  final g getInternalPopup() {
    return this.h;
  }
  
  public Drawable getPopupBackground() {
    g g1 = this.h;
    return (g1 != null) ? g1.d() : ((Build.VERSION.SDK_INT >= 16) ? super.getPopupBackground() : null);
  }
  
  public Context getPopupContext() {
    return this.d;
  }
  
  public CharSequence getPrompt() {
    g g1 = this.h;
    return (g1 != null) ? g1.g() : super.getPrompt();
  }
  
  public ColorStateList getSupportBackgroundTintList() {
    e e1 = this.c;
    return (e1 != null) ? e1.b() : null;
  }
  
  public PorterDuff.Mode getSupportBackgroundTintMode() {
    e e1 = this.c;
    return (e1 != null) ? e1.c() : null;
  }
  
  protected void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    g g1 = this.h;
    if (g1 != null && g1.b())
      this.h.dismiss(); 
  }
  
  protected void onMeasure(int paramInt1, int paramInt2) {
    super.onMeasure(paramInt1, paramInt2);
    if (this.h != null && View.MeasureSpec.getMode(paramInt1) == Integer.MIN_VALUE)
      setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(paramInt1)), getMeasuredHeight()); 
  }
  
  public void onRestoreInstanceState(Parcelable paramParcelable) {
    f f = (f)paramParcelable;
    super.onRestoreInstanceState(f.getSuperState());
    if (f.c) {
      ViewTreeObserver viewTreeObserver = getViewTreeObserver();
      if (viewTreeObserver != null)
        viewTreeObserver.addOnGlobalLayoutListener(new b(this)); 
    } 
  }
  
  public Parcelable onSaveInstanceState() {
    boolean bool;
    f f = new f(super.onSaveInstanceState());
    g g1 = this.h;
    if (g1 != null && g1.b()) {
      bool = true;
    } else {
      bool = false;
    } 
    f.c = bool;
    return (Parcelable)f;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent) {
    h0 h01 = this.e;
    return (h01 != null && h01.onTouch((View)this, paramMotionEvent)) ? true : super.onTouchEvent(paramMotionEvent);
  }
  
  public boolean performClick() {
    g g1 = this.h;
    if (g1 != null) {
      if (!g1.b())
        a(); 
      return true;
    } 
    return super.performClick();
  }
  
  public void setAdapter(SpinnerAdapter paramSpinnerAdapter) {
    if (!this.g) {
      this.f = paramSpinnerAdapter;
      return;
    } 
    super.setAdapter(paramSpinnerAdapter);
    if (this.h != null) {
      Context context2 = this.d;
      Context context1 = context2;
      if (context2 == null)
        context1 = getContext(); 
      this.h.a(new d(paramSpinnerAdapter, context1.getTheme()));
    } 
  }
  
  public void setBackgroundDrawable(Drawable paramDrawable) {
    super.setBackgroundDrawable(paramDrawable);
    e e1 = this.c;
    if (e1 != null)
      e1.a(paramDrawable); 
  }
  
  public void setBackgroundResource(int paramInt) {
    super.setBackgroundResource(paramInt);
    e e1 = this.c;
    if (e1 != null)
      e1.a(paramInt); 
  }
  
  public void setDropDownHorizontalOffset(int paramInt) {
    g g1 = this.h;
    if (g1 != null) {
      g1.b(paramInt);
      this.h.c(paramInt);
      return;
    } 
    if (Build.VERSION.SDK_INT >= 16)
      super.setDropDownHorizontalOffset(paramInt); 
  }
  
  public void setDropDownVerticalOffset(int paramInt) {
    g g1 = this.h;
    if (g1 != null) {
      g1.a(paramInt);
      return;
    } 
    if (Build.VERSION.SDK_INT >= 16)
      super.setDropDownVerticalOffset(paramInt); 
  }
  
  public void setDropDownWidth(int paramInt) {
    if (this.h != null) {
      this.i = paramInt;
      return;
    } 
    if (Build.VERSION.SDK_INT >= 16)
      super.setDropDownWidth(paramInt); 
  }
  
  public void setPopupBackgroundDrawable(Drawable paramDrawable) {
    g g1 = this.h;
    if (g1 != null) {
      g1.a(paramDrawable);
      return;
    } 
    if (Build.VERSION.SDK_INT >= 16)
      super.setPopupBackgroundDrawable(paramDrawable); 
  }
  
  public void setPopupBackgroundResource(int paramInt) {
    setPopupBackgroundDrawable(b.a.k.a.a.c(getPopupContext(), paramInt));
  }
  
  public void setPrompt(CharSequence paramCharSequence) {
    g g1 = this.h;
    if (g1 != null) {
      g1.a(paramCharSequence);
      return;
    } 
    super.setPrompt(paramCharSequence);
  }
  
  public void setSupportBackgroundTintList(ColorStateList paramColorStateList) {
    e e1 = this.c;
    if (e1 != null)
      e1.b(paramColorStateList); 
  }
  
  public void setSupportBackgroundTintMode(PorterDuff.Mode paramMode) {
    e e1 = this.c;
    if (e1 != null)
      e1.a(paramMode); 
  }
  
  class a extends h0 {
    a(w this$0, View param1View, w.e param1e) {
      super(param1View);
    }
    
    public q a() {
      return this.l;
    }
    
    @SuppressLint({"SyntheticAccessor"})
    public boolean b() {
      if (!this.m.getInternalPopup().b())
        this.m.a(); 
      return true;
    }
  }
  
  class b implements ViewTreeObserver.OnGlobalLayoutListener {
    b(w this$0) {}
    
    public void onGlobalLayout() {
      if (!this.c.getInternalPopup().b())
        this.c.a(); 
      ViewTreeObserver viewTreeObserver = this.c.getViewTreeObserver();
      if (viewTreeObserver != null) {
        if (Build.VERSION.SDK_INT >= 16) {
          viewTreeObserver.removeOnGlobalLayoutListener(this);
          return;
        } 
        viewTreeObserver.removeGlobalOnLayoutListener(this);
      } 
    }
  }
  
  class c implements g, DialogInterface.OnClickListener {
    androidx.appcompat.app.c c;
    
    private ListAdapter d;
    
    private CharSequence e;
    
    c(w this$0) {}
    
    public int a() {
      return 0;
    }
    
    public void a(int param1Int) {
      Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }
    
    public void a(int param1Int1, int param1Int2) {
      if (this.d == null)
        return; 
      androidx.appcompat.app.c.a a = new androidx.appcompat.app.c.a(this.f.getPopupContext());
      CharSequence charSequence = this.e;
      if (charSequence != null)
        a.a(charSequence); 
      a.a(this.d, this.f.getSelectedItemPosition(), this);
      this.c = a.a();
      ListView listView = this.c.b();
      if (Build.VERSION.SDK_INT >= 17) {
        listView.setTextDirection(param1Int1);
        listView.setTextAlignment(param1Int2);
      } 
      this.c.show();
    }
    
    public void a(Drawable param1Drawable) {
      Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }
    
    public void a(ListAdapter param1ListAdapter) {
      this.d = param1ListAdapter;
    }
    
    public void a(CharSequence param1CharSequence) {
      this.e = param1CharSequence;
    }
    
    public void b(int param1Int) {
      Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }
    
    public boolean b() {
      androidx.appcompat.app.c c1 = this.c;
      return (c1 != null) ? c1.isShowing() : false;
    }
    
    public void c(int param1Int) {
      Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }
    
    public Drawable d() {
      return null;
    }
    
    public void dismiss() {
      androidx.appcompat.app.c c1 = this.c;
      if (c1 != null) {
        c1.dismiss();
        this.c = null;
      } 
    }
    
    public int f() {
      return 0;
    }
    
    public CharSequence g() {
      return this.e;
    }
    
    public void onClick(DialogInterface param1DialogInterface, int param1Int) {
      this.f.setSelection(param1Int);
      if (this.f.getOnItemClickListener() != null)
        this.f.performItemClick(null, param1Int, this.d.getItemId(param1Int)); 
      dismiss();
    }
  }
  
  private static class d implements ListAdapter, SpinnerAdapter {
    private SpinnerAdapter c;
    
    private ListAdapter d;
    
    public d(SpinnerAdapter param1SpinnerAdapter, Resources.Theme param1Theme) {
      this.c = param1SpinnerAdapter;
      if (param1SpinnerAdapter instanceof ListAdapter)
        this.d = (ListAdapter)param1SpinnerAdapter; 
      if (param1Theme != null) {
        ThemedSpinnerAdapter themedSpinnerAdapter;
        if (Build.VERSION.SDK_INT >= 23 && param1SpinnerAdapter instanceof ThemedSpinnerAdapter) {
          themedSpinnerAdapter = (ThemedSpinnerAdapter)param1SpinnerAdapter;
          if (themedSpinnerAdapter.getDropDownViewTheme() != param1Theme) {
            themedSpinnerAdapter.setDropDownViewTheme(param1Theme);
            return;
          } 
        } else if (themedSpinnerAdapter instanceof t0) {
          t0 t0 = (t0)themedSpinnerAdapter;
          if (t0.getDropDownViewTheme() == null)
            t0.setDropDownViewTheme(param1Theme); 
        } 
      } 
    }
    
    public boolean areAllItemsEnabled() {
      ListAdapter listAdapter = this.d;
      return (listAdapter != null) ? listAdapter.areAllItemsEnabled() : true;
    }
    
    public int getCount() {
      SpinnerAdapter spinnerAdapter = this.c;
      return (spinnerAdapter == null) ? 0 : spinnerAdapter.getCount();
    }
    
    public View getDropDownView(int param1Int, View param1View, ViewGroup param1ViewGroup) {
      SpinnerAdapter spinnerAdapter = this.c;
      return (spinnerAdapter == null) ? null : spinnerAdapter.getDropDownView(param1Int, param1View, param1ViewGroup);
    }
    
    public Object getItem(int param1Int) {
      SpinnerAdapter spinnerAdapter = this.c;
      return (spinnerAdapter == null) ? null : spinnerAdapter.getItem(param1Int);
    }
    
    public long getItemId(int param1Int) {
      SpinnerAdapter spinnerAdapter = this.c;
      return (spinnerAdapter == null) ? -1L : spinnerAdapter.getItemId(param1Int);
    }
    
    public int getItemViewType(int param1Int) {
      return 0;
    }
    
    public View getView(int param1Int, View param1View, ViewGroup param1ViewGroup) {
      return getDropDownView(param1Int, param1View, param1ViewGroup);
    }
    
    public int getViewTypeCount() {
      return 1;
    }
    
    public boolean hasStableIds() {
      SpinnerAdapter spinnerAdapter = this.c;
      return (spinnerAdapter != null && spinnerAdapter.hasStableIds());
    }
    
    public boolean isEmpty() {
      return (getCount() == 0);
    }
    
    public boolean isEnabled(int param1Int) {
      ListAdapter listAdapter = this.d;
      return (listAdapter != null) ? listAdapter.isEnabled(param1Int) : true;
    }
    
    public void registerDataSetObserver(DataSetObserver param1DataSetObserver) {
      SpinnerAdapter spinnerAdapter = this.c;
      if (spinnerAdapter != null)
        spinnerAdapter.registerDataSetObserver(param1DataSetObserver); 
    }
    
    public void unregisterDataSetObserver(DataSetObserver param1DataSetObserver) {
      SpinnerAdapter spinnerAdapter = this.c;
      if (spinnerAdapter != null)
        spinnerAdapter.unregisterDataSetObserver(param1DataSetObserver); 
    }
  }
  
  class e extends j0 implements g {
    private CharSequence K;
    
    ListAdapter L;
    
    private final Rect M = new Rect();
    
    private int N;
    
    public e(w this$0, Context param1Context, AttributeSet param1AttributeSet, int param1Int) {
      super(param1Context, param1AttributeSet, param1Int);
      a((View)this$0);
      a(true);
      h(0);
      a(new a(this, this$0));
    }
    
    public void a(int param1Int1, int param1Int2) {
      boolean bool = b();
      m();
      g(2);
      c();
      ListView listView = e();
      listView.setChoiceMode(1);
      if (Build.VERSION.SDK_INT >= 17) {
        listView.setTextDirection(param1Int1);
        listView.setTextAlignment(param1Int2);
      } 
      i(this.O.getSelectedItemPosition());
      if (bool)
        return; 
      ViewTreeObserver viewTreeObserver = this.O.getViewTreeObserver();
      if (viewTreeObserver != null) {
        b b = new b(this);
        viewTreeObserver.addOnGlobalLayoutListener(b);
        a(new c(this, b));
      } 
    }
    
    public void a(ListAdapter param1ListAdapter) {
      super.a(param1ListAdapter);
      this.L = param1ListAdapter;
    }
    
    public void a(CharSequence param1CharSequence) {
      this.K = param1CharSequence;
    }
    
    public void b(int param1Int) {
      this.N = param1Int;
    }
    
    boolean b(View param1View) {
      return (v.G(param1View) && param1View.getGlobalVisibleRect(this.M));
    }
    
    public CharSequence g() {
      return this.K;
    }
    
    void m() {
      // Byte code:
      //   0: aload_0
      //   1: invokevirtual d : ()Landroid/graphics/drawable/Drawable;
      //   4: astore #8
      //   6: iconst_0
      //   7: istore_1
      //   8: aload #8
      //   10: ifnull -> 65
      //   13: aload #8
      //   15: aload_0
      //   16: getfield O : Landroidx/appcompat/widget/w;
      //   19: getfield j : Landroid/graphics/Rect;
      //   22: invokevirtual getPadding : (Landroid/graphics/Rect;)Z
      //   25: pop
      //   26: aload_0
      //   27: getfield O : Landroidx/appcompat/widget/w;
      //   30: invokestatic a : (Landroid/view/View;)Z
      //   33: ifeq -> 50
      //   36: aload_0
      //   37: getfield O : Landroidx/appcompat/widget/w;
      //   40: getfield j : Landroid/graphics/Rect;
      //   43: getfield right : I
      //   46: istore_1
      //   47: goto -> 62
      //   50: aload_0
      //   51: getfield O : Landroidx/appcompat/widget/w;
      //   54: getfield j : Landroid/graphics/Rect;
      //   57: getfield left : I
      //   60: ineg
      //   61: istore_1
      //   62: goto -> 86
      //   65: aload_0
      //   66: getfield O : Landroidx/appcompat/widget/w;
      //   69: getfield j : Landroid/graphics/Rect;
      //   72: astore #8
      //   74: aload #8
      //   76: iconst_0
      //   77: putfield right : I
      //   80: aload #8
      //   82: iconst_0
      //   83: putfield left : I
      //   86: aload_0
      //   87: getfield O : Landroidx/appcompat/widget/w;
      //   90: invokevirtual getPaddingLeft : ()I
      //   93: istore #5
      //   95: aload_0
      //   96: getfield O : Landroidx/appcompat/widget/w;
      //   99: invokevirtual getPaddingRight : ()I
      //   102: istore #6
      //   104: aload_0
      //   105: getfield O : Landroidx/appcompat/widget/w;
      //   108: invokevirtual getWidth : ()I
      //   111: istore #7
      //   113: aload_0
      //   114: getfield O : Landroidx/appcompat/widget/w;
      //   117: astore #8
      //   119: aload #8
      //   121: getfield i : I
      //   124: istore_2
      //   125: iload_2
      //   126: bipush #-2
      //   128: if_icmpne -> 216
      //   131: aload #8
      //   133: aload_0
      //   134: getfield L : Landroid/widget/ListAdapter;
      //   137: checkcast android/widget/SpinnerAdapter
      //   140: aload_0
      //   141: invokevirtual d : ()Landroid/graphics/drawable/Drawable;
      //   144: invokevirtual a : (Landroid/widget/SpinnerAdapter;Landroid/graphics/drawable/Drawable;)I
      //   147: istore_3
      //   148: aload_0
      //   149: getfield O : Landroidx/appcompat/widget/w;
      //   152: invokevirtual getContext : ()Landroid/content/Context;
      //   155: invokevirtual getResources : ()Landroid/content/res/Resources;
      //   158: invokevirtual getDisplayMetrics : ()Landroid/util/DisplayMetrics;
      //   161: getfield widthPixels : I
      //   164: istore_2
      //   165: aload_0
      //   166: getfield O : Landroidx/appcompat/widget/w;
      //   169: getfield j : Landroid/graphics/Rect;
      //   172: astore #8
      //   174: iload_2
      //   175: aload #8
      //   177: getfield left : I
      //   180: isub
      //   181: aload #8
      //   183: getfield right : I
      //   186: isub
      //   187: istore #4
      //   189: iload_3
      //   190: istore_2
      //   191: iload_3
      //   192: iload #4
      //   194: if_icmple -> 200
      //   197: iload #4
      //   199: istore_2
      //   200: iload_2
      //   201: iload #7
      //   203: iload #5
      //   205: isub
      //   206: iload #6
      //   208: isub
      //   209: invokestatic max : (II)I
      //   212: istore_2
      //   213: goto -> 230
      //   216: iload_2
      //   217: iconst_m1
      //   218: if_icmpne -> 238
      //   221: iload #7
      //   223: iload #5
      //   225: isub
      //   226: iload #6
      //   228: isub
      //   229: istore_2
      //   230: aload_0
      //   231: iload_2
      //   232: invokevirtual e : (I)V
      //   235: goto -> 243
      //   238: aload_0
      //   239: iload_2
      //   240: invokevirtual e : (I)V
      //   243: aload_0
      //   244: getfield O : Landroidx/appcompat/widget/w;
      //   247: invokestatic a : (Landroid/view/View;)Z
      //   250: ifeq -> 274
      //   253: iload_1
      //   254: iload #7
      //   256: iload #6
      //   258: isub
      //   259: aload_0
      //   260: invokevirtual j : ()I
      //   263: isub
      //   264: aload_0
      //   265: invokevirtual n : ()I
      //   268: isub
      //   269: iadd
      //   270: istore_1
      //   271: goto -> 284
      //   274: iload_1
      //   275: iload #5
      //   277: aload_0
      //   278: invokevirtual n : ()I
      //   281: iadd
      //   282: iadd
      //   283: istore_1
      //   284: aload_0
      //   285: iload_1
      //   286: invokevirtual c : (I)V
      //   289: return
    }
    
    public int n() {
      return this.N;
    }
    
    class a implements AdapterView.OnItemClickListener {
      a(w.e this$0, w param2w) {}
      
      public void onItemClick(AdapterView<?> param2AdapterView, View param2View, int param2Int, long param2Long) {
        this.c.O.setSelection(param2Int);
        if (this.c.O.getOnItemClickListener() != null) {
          w.e e1 = this.c;
          e1.O.performItemClick(param2View, param2Int, e1.L.getItemId(param2Int));
        } 
        this.c.dismiss();
      }
    }
    
    class b implements ViewTreeObserver.OnGlobalLayoutListener {
      b(w.e this$0) {}
      
      public void onGlobalLayout() {
        w.e e1 = this.c;
        if (!e1.b((View)e1.O)) {
          this.c.dismiss();
          return;
        } 
        this.c.m();
        w.e.a(this.c);
      }
    }
    
    class c implements PopupWindow.OnDismissListener {
      c(w.e this$0, ViewTreeObserver.OnGlobalLayoutListener param2OnGlobalLayoutListener) {}
      
      public void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.d.O.getViewTreeObserver();
        if (viewTreeObserver != null)
          viewTreeObserver.removeGlobalOnLayoutListener(this.c); 
      }
    }
  }
  
  class a implements AdapterView.OnItemClickListener {
    a(w this$0, w param1w) {}
    
    public void onItemClick(AdapterView<?> param1AdapterView, View param1View, int param1Int, long param1Long) {
      this.c.O.setSelection(param1Int);
      if (this.c.O.getOnItemClickListener() != null) {
        w.e e1 = this.c;
        e1.O.performItemClick(param1View, param1Int, e1.L.getItemId(param1Int));
      } 
      this.c.dismiss();
    }
  }
  
  class b implements ViewTreeObserver.OnGlobalLayoutListener {
    b(w this$0) {}
    
    public void onGlobalLayout() {
      w.e e1 = this.c;
      if (!e1.b((View)e1.O)) {
        this.c.dismiss();
        return;
      } 
      this.c.m();
      w.e.a(this.c);
    }
  }
  
  class c implements PopupWindow.OnDismissListener {
    c(w this$0, ViewTreeObserver.OnGlobalLayoutListener param1OnGlobalLayoutListener) {}
    
    public void onDismiss() {
      ViewTreeObserver viewTreeObserver = this.d.O.getViewTreeObserver();
      if (viewTreeObserver != null)
        viewTreeObserver.removeGlobalOnLayoutListener(this.c); 
    }
  }
  
  static class f extends View.BaseSavedState {
    public static final Parcelable.Creator<f> CREATOR = new a();
    
    boolean c;
    
    f(Parcel param1Parcel) {
      super(param1Parcel);
      boolean bool;
      if (param1Parcel.readByte() != 0) {
        bool = true;
      } else {
        bool = false;
      } 
      this.c = bool;
    }
    
    f(Parcelable param1Parcelable) {
      super(param1Parcelable);
    }
    
    public void writeToParcel(Parcel param1Parcel, int param1Int) {
      super.writeToParcel(param1Parcel, param1Int);
      param1Parcel.writeByte((byte)this.c);
    }
    
    class a implements Parcelable.Creator<f> {
      public w.f createFromParcel(Parcel param2Parcel) {
        return new w.f(param2Parcel);
      }
      
      public w.f[] newArray(int param2Int) {
        return new w.f[param2Int];
      }
    }
  }
  
  class a implements Parcelable.Creator<f> {
    public w.f createFromParcel(Parcel param1Parcel) {
      return new w.f(param1Parcel);
    }
    
    public w.f[] newArray(int param1Int) {
      return new w.f[param1Int];
    }
  }
  
  static interface g {
    int a();
    
    void a(int param1Int);
    
    void a(int param1Int1, int param1Int2);
    
    void a(Drawable param1Drawable);
    
    void a(ListAdapter param1ListAdapter);
    
    void a(CharSequence param1CharSequence);
    
    void b(int param1Int);
    
    boolean b();
    
    void c(int param1Int);
    
    Drawable d();
    
    void dismiss();
    
    int f();
    
    CharSequence g();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/appcompat/widget/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */