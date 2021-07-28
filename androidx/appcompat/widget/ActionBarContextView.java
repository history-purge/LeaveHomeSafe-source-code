package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import b.a.f;
import b.a.g;
import b.a.j;
import b.a.o.b;
import b.g.m.v;

public class ActionBarContextView extends a {
  private CharSequence k;
  
  private CharSequence l;
  
  private View m;
  
  private View n;
  
  private LinearLayout o;
  
  private TextView p;
  
  private TextView q;
  
  private int r;
  
  private int s;
  
  private boolean t;
  
  private int u;
  
  public ActionBarContextView(Context paramContext) {
    this(paramContext, null);
  }
  
  public ActionBarContextView(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, b.a.a.actionModeStyle);
  }
  
  public ActionBarContextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    x0 x0 = x0.a(paramContext, paramAttributeSet, j.ActionMode, paramInt, 0);
    v.a((View)this, x0.b(j.ActionMode_background));
    this.r = x0.g(j.ActionMode_titleTextStyle, 0);
    this.s = x0.g(j.ActionMode_subtitleTextStyle, 0);
    this.g = x0.f(j.ActionMode_height, 0);
    this.u = x0.g(j.ActionMode_closeItemLayout, g.abc_action_mode_close_item_material);
    x0.b();
  }
  
  private void e() {
    if (this.o == null) {
      LayoutInflater.from(getContext()).inflate(g.abc_action_bar_title_item, this);
      this.o = (LinearLayout)getChildAt(getChildCount() - 1);
      this.p = (TextView)this.o.findViewById(f.action_bar_title);
      this.q = (TextView)this.o.findViewById(f.action_bar_subtitle);
      if (this.r != 0)
        this.p.setTextAppearance(getContext(), this.r); 
      if (this.s != 0)
        this.q.setTextAppearance(getContext(), this.s); 
    } 
    this.p.setText(this.k);
    this.q.setText(this.l);
    boolean bool1 = TextUtils.isEmpty(this.k);
    int i = TextUtils.isEmpty(this.l) ^ true;
    TextView textView = this.q;
    boolean bool = false;
    if (i != 0) {
      b = 0;
    } else {
      b = 8;
    } 
    textView.setVisibility(b);
    LinearLayout linearLayout = this.o;
    byte b = bool;
    if ((bool1 ^ true) == 0)
      if (i != 0) {
        b = bool;
      } else {
        b = 8;
      }  
    linearLayout.setVisibility(b);
    if (this.o.getParent() == null)
      addView((View)this.o); 
  }
  
  public void a() {
    if (this.m == null)
      c(); 
  }
  
  public void a(b paramb) {
    // Byte code:
    //   0: aload_0
    //   1: getfield m : Landroid/view/View;
    //   4: astore_2
    //   5: aload_2
    //   6: ifnonnull -> 40
    //   9: aload_0
    //   10: aload_0
    //   11: invokevirtual getContext : ()Landroid/content/Context;
    //   14: invokestatic from : (Landroid/content/Context;)Landroid/view/LayoutInflater;
    //   17: aload_0
    //   18: getfield u : I
    //   21: aload_0
    //   22: iconst_0
    //   23: invokevirtual inflate : (ILandroid/view/ViewGroup;Z)Landroid/view/View;
    //   26: putfield m : Landroid/view/View;
    //   29: aload_0
    //   30: aload_0
    //   31: getfield m : Landroid/view/View;
    //   34: invokevirtual addView : (Landroid/view/View;)V
    //   37: goto -> 50
    //   40: aload_2
    //   41: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   44: ifnonnull -> 50
    //   47: goto -> 29
    //   50: aload_0
    //   51: getfield m : Landroid/view/View;
    //   54: getstatic b/a/f.action_mode_close_button : I
    //   57: invokevirtual findViewById : (I)Landroid/view/View;
    //   60: new androidx/appcompat/widget/ActionBarContextView$a
    //   63: dup
    //   64: aload_0
    //   65: aload_1
    //   66: invokespecial <init> : (Landroidx/appcompat/widget/ActionBarContextView;Lb/a/o/b;)V
    //   69: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   72: aload_1
    //   73: invokevirtual c : ()Landroid/view/Menu;
    //   76: checkcast androidx/appcompat/view/menu/g
    //   79: astore_1
    //   80: aload_0
    //   81: getfield f : Landroidx/appcompat/widget/c;
    //   84: astore_2
    //   85: aload_2
    //   86: ifnull -> 94
    //   89: aload_2
    //   90: invokevirtual c : ()Z
    //   93: pop
    //   94: aload_0
    //   95: new androidx/appcompat/widget/c
    //   98: dup
    //   99: aload_0
    //   100: invokevirtual getContext : ()Landroid/content/Context;
    //   103: invokespecial <init> : (Landroid/content/Context;)V
    //   106: putfield f : Landroidx/appcompat/widget/c;
    //   109: aload_0
    //   110: getfield f : Landroidx/appcompat/widget/c;
    //   113: iconst_1
    //   114: invokevirtual c : (Z)V
    //   117: new android/view/ViewGroup$LayoutParams
    //   120: dup
    //   121: bipush #-2
    //   123: iconst_m1
    //   124: invokespecial <init> : (II)V
    //   127: astore_2
    //   128: aload_1
    //   129: aload_0
    //   130: getfield f : Landroidx/appcompat/widget/c;
    //   133: aload_0
    //   134: getfield d : Landroid/content/Context;
    //   137: invokevirtual a : (Landroidx/appcompat/view/menu/n;Landroid/content/Context;)V
    //   140: aload_0
    //   141: aload_0
    //   142: getfield f : Landroidx/appcompat/widget/c;
    //   145: aload_0
    //   146: invokevirtual b : (Landroid/view/ViewGroup;)Landroidx/appcompat/view/menu/o;
    //   149: checkcast androidx/appcompat/widget/ActionMenuView
    //   152: putfield e : Landroidx/appcompat/widget/ActionMenuView;
    //   155: aload_0
    //   156: getfield e : Landroidx/appcompat/widget/ActionMenuView;
    //   159: aconst_null
    //   160: invokestatic a : (Landroid/view/View;Landroid/graphics/drawable/Drawable;)V
    //   163: aload_0
    //   164: aload_0
    //   165: getfield e : Landroidx/appcompat/widget/ActionMenuView;
    //   168: aload_2
    //   169: invokevirtual addView : (Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    //   172: return
  }
  
  public boolean b() {
    return this.t;
  }
  
  public void c() {
    removeAllViews();
    this.n = null;
    this.e = null;
  }
  
  public boolean d() {
    c c = this.f;
    return (c != null) ? c.i() : false;
  }
  
  protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
    return (ViewGroup.LayoutParams)new ViewGroup.MarginLayoutParams(-1, -2);
  }
  
  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet) {
    return (ViewGroup.LayoutParams)new ViewGroup.MarginLayoutParams(getContext(), paramAttributeSet);
  }
  
  public CharSequence getSubtitle() {
    return this.l;
  }
  
  public CharSequence getTitle() {
    return this.k;
  }
  
  public void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    c c = this.f;
    if (c != null) {
      c.e();
      this.f.f();
    } 
  }
  
  public void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent) {
    if (paramAccessibilityEvent.getEventType() == 32) {
      paramAccessibilityEvent.setSource((View)this);
      paramAccessibilityEvent.setClassName(ActionBarContextView.class.getName());
      paramAccessibilityEvent.setPackageName(getContext().getPackageName());
      paramAccessibilityEvent.setContentDescription(this.k);
      return;
    } 
    super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i;
    paramBoolean = d1.a((View)this);
    if (paramBoolean) {
      i = paramInt3 - paramInt1 - getPaddingRight();
    } else {
      i = getPaddingLeft();
    } 
    int j = getPaddingTop();
    int k = paramInt4 - paramInt2 - getPaddingTop() - getPaddingBottom();
    View view2 = this.m;
    if (view2 != null && view2.getVisibility() != 8) {
      ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)this.m.getLayoutParams();
      if (paramBoolean) {
        paramInt2 = marginLayoutParams.rightMargin;
      } else {
        paramInt2 = marginLayoutParams.leftMargin;
      } 
      if (paramBoolean) {
        paramInt4 = marginLayoutParams.leftMargin;
      } else {
        paramInt4 = marginLayoutParams.rightMargin;
      } 
      paramInt2 = a.a(i, paramInt2, paramBoolean);
      paramInt2 = a.a(paramInt2 + a(this.m, paramInt2, j, k, paramBoolean), paramInt4, paramBoolean);
    } else {
      paramInt2 = i;
    } 
    LinearLayout linearLayout = this.o;
    paramInt4 = paramInt2;
    if (linearLayout != null) {
      paramInt4 = paramInt2;
      if (this.n == null) {
        paramInt4 = paramInt2;
        if (linearLayout.getVisibility() != 8)
          paramInt4 = paramInt2 + a((View)this.o, paramInt2, j, k, paramBoolean); 
      } 
    } 
    View view1 = this.n;
    if (view1 != null)
      a(view1, paramInt4, j, k, paramBoolean); 
    if (paramBoolean) {
      paramInt1 = getPaddingLeft();
    } else {
      paramInt1 = paramInt3 - paramInt1 - getPaddingRight();
    } 
    ActionMenuView actionMenuView = this.e;
    if (actionMenuView != null)
      a((View)actionMenuView, paramInt1, j, k, paramBoolean ^ true); 
  }
  
  protected void onMeasure(int paramInt1, int paramInt2) {
    int i = View.MeasureSpec.getMode(paramInt1);
    int j = 1073741824;
    if (i == 1073741824) {
      if (View.MeasureSpec.getMode(paramInt2) != 0) {
        int n = View.MeasureSpec.getSize(paramInt1);
        i = this.g;
        if (i <= 0)
          i = View.MeasureSpec.getSize(paramInt2); 
        int i1 = getPaddingTop() + getPaddingBottom();
        paramInt1 = n - getPaddingLeft() - getPaddingRight();
        int m = i - i1;
        int k = View.MeasureSpec.makeMeasureSpec(m, -2147483648);
        View view2 = this.m;
        boolean bool = false;
        paramInt2 = paramInt1;
        if (view2 != null) {
          paramInt1 = a(view2, paramInt1, k, 0);
          ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)this.m.getLayoutParams();
          paramInt2 = paramInt1 - marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
        } 
        ActionMenuView actionMenuView = this.e;
        paramInt1 = paramInt2;
        if (actionMenuView != null) {
          paramInt1 = paramInt2;
          if (actionMenuView.getParent() == this)
            paramInt1 = a((View)this.e, paramInt2, k, 0); 
        } 
        LinearLayout linearLayout = this.o;
        paramInt2 = paramInt1;
        if (linearLayout != null) {
          paramInt2 = paramInt1;
          if (this.n == null)
            if (this.t) {
              paramInt2 = View.MeasureSpec.makeMeasureSpec(0, 0);
              this.o.measure(paramInt2, k);
              int i2 = this.o.getMeasuredWidth();
              if (i2 <= paramInt1) {
                k = 1;
              } else {
                k = 0;
              } 
              paramInt2 = paramInt1;
              if (k != 0)
                paramInt2 = paramInt1 - i2; 
              linearLayout = this.o;
              if (k != 0) {
                paramInt1 = 0;
              } else {
                paramInt1 = 8;
              } 
              linearLayout.setVisibility(paramInt1);
            } else {
              paramInt2 = a((View)linearLayout, paramInt1, k, 0);
            }  
        } 
        View view1 = this.n;
        if (view1 != null) {
          ViewGroup.LayoutParams layoutParams = view1.getLayoutParams();
          if (layoutParams.width != -2) {
            paramInt1 = 1073741824;
          } else {
            paramInt1 = Integer.MIN_VALUE;
          } 
          int i2 = layoutParams.width;
          k = paramInt2;
          if (i2 >= 0)
            k = Math.min(i2, paramInt2); 
          if (layoutParams.height != -2) {
            paramInt2 = j;
          } else {
            paramInt2 = Integer.MIN_VALUE;
          } 
          i2 = layoutParams.height;
          j = m;
          if (i2 >= 0)
            j = Math.min(i2, m); 
          this.n.measure(View.MeasureSpec.makeMeasureSpec(k, paramInt1), View.MeasureSpec.makeMeasureSpec(j, paramInt2));
        } 
        if (this.g <= 0) {
          j = getChildCount();
          paramInt2 = 0;
          paramInt1 = bool;
          while (paramInt1 < j) {
            k = getChildAt(paramInt1).getMeasuredHeight() + i1;
            i = paramInt2;
            if (k > paramInt2)
              i = k; 
            paramInt1++;
            paramInt2 = i;
          } 
          setMeasuredDimension(n, paramInt2);
          return;
        } 
        setMeasuredDimension(n, i);
        return;
      } 
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append(ActionBarContextView.class.getSimpleName());
      stringBuilder1.append(" can only be used with android:layout_height=\"wrap_content\"");
      throw new IllegalStateException(stringBuilder1.toString());
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(ActionBarContextView.class.getSimpleName());
    stringBuilder.append(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
    IllegalStateException illegalStateException = new IllegalStateException(stringBuilder.toString());
    throw illegalStateException;
  }
  
  public void setContentHeight(int paramInt) {
    this.g = paramInt;
  }
  
  public void setCustomView(View paramView) {
    View view = this.n;
    if (view != null)
      removeView(view); 
    this.n = paramView;
    if (paramView != null) {
      LinearLayout linearLayout = this.o;
      if (linearLayout != null) {
        removeView((View)linearLayout);
        this.o = null;
      } 
    } 
    if (paramView != null)
      addView(paramView); 
    requestLayout();
  }
  
  public void setSubtitle(CharSequence paramCharSequence) {
    this.l = paramCharSequence;
    e();
  }
  
  public void setTitle(CharSequence paramCharSequence) {
    this.k = paramCharSequence;
    e();
  }
  
  public void setTitleOptional(boolean paramBoolean) {
    if (paramBoolean != this.t)
      requestLayout(); 
    this.t = paramBoolean;
  }
  
  public boolean shouldDelayChildPressedState() {
    return false;
  }
  
  class a implements View.OnClickListener {
    a(ActionBarContextView this$0, b param1b) {}
    
    public void onClick(View param1View) {
      this.c.a();
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/appcompat/widget/ActionBarContextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */