package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import b.a.f;

public class ActionBarContainer extends FrameLayout {
  private boolean c;
  
  private View d;
  
  private View e;
  
  private View f;
  
  Drawable g;
  
  Drawable h;
  
  Drawable i;
  
  boolean j;
  
  boolean k;
  
  private int l;
  
  public ActionBarContainer(Context paramContext) {
    this(paramContext, null);
  }
  
  public ActionBarContainer(Context paramContext, AttributeSet paramAttributeSet) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: aload_2
    //   3: invokespecial <init> : (Landroid/content/Context;Landroid/util/AttributeSet;)V
    //   6: aload_0
    //   7: new androidx/appcompat/widget/b
    //   10: dup
    //   11: aload_0
    //   12: invokespecial <init> : (Landroidx/appcompat/widget/ActionBarContainer;)V
    //   15: invokestatic a : (Landroid/view/View;Landroid/graphics/drawable/Drawable;)V
    //   18: aload_1
    //   19: aload_2
    //   20: getstatic b/a/j.ActionBar : [I
    //   23: invokevirtual obtainStyledAttributes : (Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
    //   26: astore_1
    //   27: aload_0
    //   28: aload_1
    //   29: getstatic b/a/j.ActionBar_background : I
    //   32: invokevirtual getDrawable : (I)Landroid/graphics/drawable/Drawable;
    //   35: putfield g : Landroid/graphics/drawable/Drawable;
    //   38: aload_0
    //   39: aload_1
    //   40: getstatic b/a/j.ActionBar_backgroundStacked : I
    //   43: invokevirtual getDrawable : (I)Landroid/graphics/drawable/Drawable;
    //   46: putfield h : Landroid/graphics/drawable/Drawable;
    //   49: aload_0
    //   50: aload_1
    //   51: getstatic b/a/j.ActionBar_height : I
    //   54: iconst_m1
    //   55: invokevirtual getDimensionPixelSize : (II)I
    //   58: putfield l : I
    //   61: aload_0
    //   62: invokevirtual getId : ()I
    //   65: getstatic b/a/f.split_action_bar : I
    //   68: if_icmpne -> 87
    //   71: aload_0
    //   72: iconst_1
    //   73: putfield j : Z
    //   76: aload_0
    //   77: aload_1
    //   78: getstatic b/a/j.ActionBar_backgroundSplit : I
    //   81: invokevirtual getDrawable : (I)Landroid/graphics/drawable/Drawable;
    //   84: putfield i : Landroid/graphics/drawable/Drawable;
    //   87: aload_1
    //   88: invokevirtual recycle : ()V
    //   91: aload_0
    //   92: getfield j : Z
    //   95: istore_3
    //   96: iconst_0
    //   97: istore #4
    //   99: iload_3
    //   100: ifeq -> 118
    //   103: iload #4
    //   105: istore_3
    //   106: aload_0
    //   107: getfield i : Landroid/graphics/drawable/Drawable;
    //   110: ifnonnull -> 141
    //   113: iconst_1
    //   114: istore_3
    //   115: goto -> 141
    //   118: iload #4
    //   120: istore_3
    //   121: aload_0
    //   122: getfield g : Landroid/graphics/drawable/Drawable;
    //   125: ifnonnull -> 141
    //   128: iload #4
    //   130: istore_3
    //   131: aload_0
    //   132: getfield h : Landroid/graphics/drawable/Drawable;
    //   135: ifnonnull -> 141
    //   138: goto -> 113
    //   141: aload_0
    //   142: iload_3
    //   143: invokevirtual setWillNotDraw : (Z)V
    //   146: return
  }
  
  private int a(View paramView) {
    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)paramView.getLayoutParams();
    return paramView.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
  }
  
  private boolean b(View paramView) {
    return (paramView == null || paramView.getVisibility() == 8 || paramView.getMeasuredHeight() == 0);
  }
  
  protected void drawableStateChanged() {
    super.drawableStateChanged();
    Drawable drawable = this.g;
    if (drawable != null && drawable.isStateful())
      this.g.setState(getDrawableState()); 
    drawable = this.h;
    if (drawable != null && drawable.isStateful())
      this.h.setState(getDrawableState()); 
    drawable = this.i;
    if (drawable != null && drawable.isStateful())
      this.i.setState(getDrawableState()); 
  }
  
  public View getTabContainer() {
    return this.d;
  }
  
  public void jumpDrawablesToCurrentState() {
    super.jumpDrawablesToCurrentState();
    Drawable drawable = this.g;
    if (drawable != null)
      drawable.jumpToCurrentState(); 
    drawable = this.h;
    if (drawable != null)
      drawable.jumpToCurrentState(); 
    drawable = this.i;
    if (drawable != null)
      drawable.jumpToCurrentState(); 
  }
  
  public void onFinishInflate() {
    super.onFinishInflate();
    this.e = findViewById(f.action_bar);
    this.f = findViewById(f.action_context_bar);
  }
  
  public boolean onHoverEvent(MotionEvent paramMotionEvent) {
    super.onHoverEvent(paramMotionEvent);
    return true;
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent) {
    return (this.c || super.onInterceptTouchEvent(paramMotionEvent));
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    // Byte code:
    //   0: aload_0
    //   1: iload_1
    //   2: iload_2
    //   3: iload_3
    //   4: iload #4
    //   6: iload #5
    //   8: invokespecial onLayout : (ZIIII)V
    //   11: aload_0
    //   12: getfield d : Landroid/view/View;
    //   15: astore #9
    //   17: iconst_1
    //   18: istore #5
    //   20: iconst_0
    //   21: istore_3
    //   22: aload #9
    //   24: ifnull -> 42
    //   27: aload #9
    //   29: invokevirtual getVisibility : ()I
    //   32: bipush #8
    //   34: if_icmpeq -> 42
    //   37: iconst_1
    //   38: istore_1
    //   39: goto -> 44
    //   42: iconst_0
    //   43: istore_1
    //   44: aload #9
    //   46: ifnull -> 105
    //   49: aload #9
    //   51: invokevirtual getVisibility : ()I
    //   54: bipush #8
    //   56: if_icmpeq -> 105
    //   59: aload_0
    //   60: invokevirtual getMeasuredHeight : ()I
    //   63: istore #6
    //   65: aload #9
    //   67: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   70: checkcast android/widget/FrameLayout$LayoutParams
    //   73: astore #7
    //   75: aload #9
    //   77: iload_2
    //   78: iload #6
    //   80: aload #9
    //   82: invokevirtual getMeasuredHeight : ()I
    //   85: isub
    //   86: aload #7
    //   88: getfield bottomMargin : I
    //   91: isub
    //   92: iload #4
    //   94: iload #6
    //   96: aload #7
    //   98: getfield bottomMargin : I
    //   101: isub
    //   102: invokevirtual layout : (IIII)V
    //   105: aload_0
    //   106: getfield j : Z
    //   109: ifeq -> 149
    //   112: aload_0
    //   113: getfield i : Landroid/graphics/drawable/Drawable;
    //   116: astore #7
    //   118: aload #7
    //   120: ifnull -> 144
    //   123: aload #7
    //   125: iconst_0
    //   126: iconst_0
    //   127: aload_0
    //   128: invokevirtual getMeasuredWidth : ()I
    //   131: aload_0
    //   132: invokevirtual getMeasuredHeight : ()I
    //   135: invokevirtual setBounds : (IIII)V
    //   138: iload #5
    //   140: istore_2
    //   141: goto -> 345
    //   144: iconst_0
    //   145: istore_2
    //   146: goto -> 345
    //   149: iload_3
    //   150: istore_2
    //   151: aload_0
    //   152: getfield g : Landroid/graphics/drawable/Drawable;
    //   155: ifnull -> 294
    //   158: aload_0
    //   159: getfield e : Landroid/view/View;
    //   162: invokevirtual getVisibility : ()I
    //   165: ifne -> 222
    //   168: aload_0
    //   169: getfield g : Landroid/graphics/drawable/Drawable;
    //   172: astore #8
    //   174: aload_0
    //   175: getfield e : Landroid/view/View;
    //   178: invokevirtual getLeft : ()I
    //   181: istore_3
    //   182: aload_0
    //   183: getfield e : Landroid/view/View;
    //   186: invokevirtual getTop : ()I
    //   189: istore #4
    //   191: aload_0
    //   192: getfield e : Landroid/view/View;
    //   195: invokevirtual getRight : ()I
    //   198: istore_2
    //   199: aload_0
    //   200: getfield e : Landroid/view/View;
    //   203: astore #7
    //   205: aload #8
    //   207: iload_3
    //   208: iload #4
    //   210: iload_2
    //   211: aload #7
    //   213: invokevirtual getBottom : ()I
    //   216: invokevirtual setBounds : (IIII)V
    //   219: goto -> 292
    //   222: aload_0
    //   223: getfield f : Landroid/view/View;
    //   226: astore #7
    //   228: aload #7
    //   230: ifnull -> 281
    //   233: aload #7
    //   235: invokevirtual getVisibility : ()I
    //   238: ifne -> 281
    //   241: aload_0
    //   242: getfield g : Landroid/graphics/drawable/Drawable;
    //   245: astore #8
    //   247: aload_0
    //   248: getfield f : Landroid/view/View;
    //   251: invokevirtual getLeft : ()I
    //   254: istore_3
    //   255: aload_0
    //   256: getfield f : Landroid/view/View;
    //   259: invokevirtual getTop : ()I
    //   262: istore #4
    //   264: aload_0
    //   265: getfield f : Landroid/view/View;
    //   268: invokevirtual getRight : ()I
    //   271: istore_2
    //   272: aload_0
    //   273: getfield f : Landroid/view/View;
    //   276: astore #7
    //   278: goto -> 205
    //   281: aload_0
    //   282: getfield g : Landroid/graphics/drawable/Drawable;
    //   285: iconst_0
    //   286: iconst_0
    //   287: iconst_0
    //   288: iconst_0
    //   289: invokevirtual setBounds : (IIII)V
    //   292: iconst_1
    //   293: istore_2
    //   294: aload_0
    //   295: iload_1
    //   296: putfield k : Z
    //   299: iload_1
    //   300: ifeq -> 345
    //   303: aload_0
    //   304: getfield h : Landroid/graphics/drawable/Drawable;
    //   307: astore #7
    //   309: aload #7
    //   311: ifnull -> 345
    //   314: aload #7
    //   316: aload #9
    //   318: invokevirtual getLeft : ()I
    //   321: aload #9
    //   323: invokevirtual getTop : ()I
    //   326: aload #9
    //   328: invokevirtual getRight : ()I
    //   331: aload #9
    //   333: invokevirtual getBottom : ()I
    //   336: invokevirtual setBounds : (IIII)V
    //   339: iload #5
    //   341: istore_2
    //   342: goto -> 345
    //   345: iload_2
    //   346: ifeq -> 353
    //   349: aload_0
    //   350: invokevirtual invalidate : ()V
    //   353: return
  }
  
  public void onMeasure(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: iload_2
    //   1: istore_3
    //   2: aload_0
    //   3: getfield e : Landroid/view/View;
    //   6: ifnonnull -> 48
    //   9: iload_2
    //   10: istore_3
    //   11: iload_2
    //   12: invokestatic getMode : (I)I
    //   15: ldc -2147483648
    //   17: if_icmpne -> 48
    //   20: aload_0
    //   21: getfield l : I
    //   24: istore #4
    //   26: iload_2
    //   27: istore_3
    //   28: iload #4
    //   30: iflt -> 48
    //   33: iload #4
    //   35: iload_2
    //   36: invokestatic getSize : (I)I
    //   39: invokestatic min : (II)I
    //   42: ldc -2147483648
    //   44: invokestatic makeMeasureSpec : (II)I
    //   47: istore_3
    //   48: aload_0
    //   49: iload_1
    //   50: iload_3
    //   51: invokespecial onMeasure : (II)V
    //   54: aload_0
    //   55: getfield e : Landroid/view/View;
    //   58: ifnonnull -> 62
    //   61: return
    //   62: iload_3
    //   63: invokestatic getMode : (I)I
    //   66: istore_2
    //   67: aload_0
    //   68: getfield d : Landroid/view/View;
    //   71: astore #5
    //   73: aload #5
    //   75: ifnull -> 182
    //   78: aload #5
    //   80: invokevirtual getVisibility : ()I
    //   83: bipush #8
    //   85: if_icmpeq -> 182
    //   88: iload_2
    //   89: ldc 1073741824
    //   91: if_icmpeq -> 182
    //   94: aload_0
    //   95: aload_0
    //   96: getfield e : Landroid/view/View;
    //   99: invokespecial b : (Landroid/view/View;)Z
    //   102: ifne -> 121
    //   105: aload_0
    //   106: getfield e : Landroid/view/View;
    //   109: astore #5
    //   111: aload_0
    //   112: aload #5
    //   114: invokespecial a : (Landroid/view/View;)I
    //   117: istore_1
    //   118: goto -> 143
    //   121: aload_0
    //   122: aload_0
    //   123: getfield f : Landroid/view/View;
    //   126: invokespecial b : (Landroid/view/View;)Z
    //   129: ifne -> 141
    //   132: aload_0
    //   133: getfield f : Landroid/view/View;
    //   136: astore #5
    //   138: goto -> 111
    //   141: iconst_0
    //   142: istore_1
    //   143: iload_2
    //   144: ldc -2147483648
    //   146: if_icmpne -> 157
    //   149: iload_3
    //   150: invokestatic getSize : (I)I
    //   153: istore_2
    //   154: goto -> 160
    //   157: ldc 2147483647
    //   159: istore_2
    //   160: aload_0
    //   161: aload_0
    //   162: invokevirtual getMeasuredWidth : ()I
    //   165: iload_1
    //   166: aload_0
    //   167: aload_0
    //   168: getfield d : Landroid/view/View;
    //   171: invokespecial a : (Landroid/view/View;)I
    //   174: iadd
    //   175: iload_2
    //   176: invokestatic min : (II)I
    //   179: invokevirtual setMeasuredDimension : (II)V
    //   182: return
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent) {
    super.onTouchEvent(paramMotionEvent);
    return true;
  }
  
  public void setPrimaryBackground(Drawable paramDrawable) {
    Drawable drawable = this.g;
    if (drawable != null) {
      drawable.setCallback(null);
      unscheduleDrawable(this.g);
    } 
    this.g = paramDrawable;
    if (paramDrawable != null) {
      paramDrawable.setCallback((Drawable.Callback)this);
      View view = this.e;
      if (view != null)
        this.g.setBounds(view.getLeft(), this.e.getTop(), this.e.getRight(), this.e.getBottom()); 
    } 
    boolean bool1 = this.j;
    boolean bool = true;
    if (bool1 ? (this.i == null) : (this.g == null && this.h == null))
      bool = false; 
    setWillNotDraw(bool);
    invalidate();
    if (Build.VERSION.SDK_INT >= 21)
      invalidateOutline(); 
  }
  
  public void setSplitBackground(Drawable paramDrawable) {
    // Byte code:
    //   0: aload_0
    //   1: getfield i : Landroid/graphics/drawable/Drawable;
    //   4: astore #4
    //   6: aload #4
    //   8: ifnull -> 25
    //   11: aload #4
    //   13: aconst_null
    //   14: invokevirtual setCallback : (Landroid/graphics/drawable/Drawable$Callback;)V
    //   17: aload_0
    //   18: aload_0
    //   19: getfield i : Landroid/graphics/drawable/Drawable;
    //   22: invokevirtual unscheduleDrawable : (Landroid/graphics/drawable/Drawable;)V
    //   25: aload_0
    //   26: aload_1
    //   27: putfield i : Landroid/graphics/drawable/Drawable;
    //   30: iconst_0
    //   31: istore_3
    //   32: aload_1
    //   33: ifnull -> 71
    //   36: aload_1
    //   37: aload_0
    //   38: invokevirtual setCallback : (Landroid/graphics/drawable/Drawable$Callback;)V
    //   41: aload_0
    //   42: getfield j : Z
    //   45: ifeq -> 71
    //   48: aload_0
    //   49: getfield i : Landroid/graphics/drawable/Drawable;
    //   52: astore_1
    //   53: aload_1
    //   54: ifnull -> 71
    //   57: aload_1
    //   58: iconst_0
    //   59: iconst_0
    //   60: aload_0
    //   61: invokevirtual getMeasuredWidth : ()I
    //   64: aload_0
    //   65: invokevirtual getMeasuredHeight : ()I
    //   68: invokevirtual setBounds : (IIII)V
    //   71: aload_0
    //   72: getfield j : Z
    //   75: ifeq -> 92
    //   78: iload_3
    //   79: istore_2
    //   80: aload_0
    //   81: getfield i : Landroid/graphics/drawable/Drawable;
    //   84: ifnonnull -> 113
    //   87: iconst_1
    //   88: istore_2
    //   89: goto -> 113
    //   92: iload_3
    //   93: istore_2
    //   94: aload_0
    //   95: getfield g : Landroid/graphics/drawable/Drawable;
    //   98: ifnonnull -> 113
    //   101: iload_3
    //   102: istore_2
    //   103: aload_0
    //   104: getfield h : Landroid/graphics/drawable/Drawable;
    //   107: ifnonnull -> 113
    //   110: goto -> 87
    //   113: aload_0
    //   114: iload_2
    //   115: invokevirtual setWillNotDraw : (Z)V
    //   118: aload_0
    //   119: invokevirtual invalidate : ()V
    //   122: getstatic android/os/Build$VERSION.SDK_INT : I
    //   125: bipush #21
    //   127: if_icmplt -> 134
    //   130: aload_0
    //   131: invokevirtual invalidateOutline : ()V
    //   134: return
  }
  
  public void setStackedBackground(Drawable paramDrawable) {
    Drawable drawable = this.h;
    if (drawable != null) {
      drawable.setCallback(null);
      unscheduleDrawable(this.h);
    } 
    this.h = paramDrawable;
    if (paramDrawable != null) {
      paramDrawable.setCallback((Drawable.Callback)this);
      if (this.k) {
        paramDrawable = this.h;
        if (paramDrawable != null)
          paramDrawable.setBounds(this.d.getLeft(), this.d.getTop(), this.d.getRight(), this.d.getBottom()); 
      } 
    } 
    boolean bool1 = this.j;
    boolean bool = true;
    if (bool1 ? (this.i == null) : (this.g == null && this.h == null))
      bool = false; 
    setWillNotDraw(bool);
    invalidate();
    if (Build.VERSION.SDK_INT >= 21)
      invalidateOutline(); 
  }
  
  public void setTabContainer(p0 paramp0) {
    View view = this.d;
    if (view != null)
      removeView(view); 
    this.d = (View)paramp0;
    if (paramp0 != null) {
      addView((View)paramp0);
      ViewGroup.LayoutParams layoutParams = paramp0.getLayoutParams();
      layoutParams.width = -1;
      layoutParams.height = -2;
      paramp0.setAllowCollapse(false);
    } 
  }
  
  public void setTransitioning(boolean paramBoolean) {
    int i;
    this.c = paramBoolean;
    if (paramBoolean) {
      i = 393216;
    } else {
      i = 262144;
    } 
    setDescendantFocusability(i);
  }
  
  public void setVisibility(int paramInt) {
    boolean bool;
    super.setVisibility(paramInt);
    if (paramInt == 0) {
      bool = true;
    } else {
      bool = false;
    } 
    Drawable drawable = this.g;
    if (drawable != null)
      drawable.setVisible(bool, false); 
    drawable = this.h;
    if (drawable != null)
      drawable.setVisible(bool, false); 
    drawable = this.i;
    if (drawable != null)
      drawable.setVisible(bool, false); 
  }
  
  public ActionMode startActionModeForChild(View paramView, ActionMode.Callback paramCallback) {
    return null;
  }
  
  public ActionMode startActionModeForChild(View paramView, ActionMode.Callback paramCallback, int paramInt) {
    return (paramInt != 0) ? super.startActionModeForChild(paramView, paramCallback, paramInt) : null;
  }
  
  protected boolean verifyDrawable(Drawable paramDrawable) {
    return ((paramDrawable == this.g && !this.j) || (paramDrawable == this.h && this.k) || (paramDrawable == this.i && this.j) || super.verifyDrawable(paramDrawable));
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/appcompat/widget/ActionBarContainer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */