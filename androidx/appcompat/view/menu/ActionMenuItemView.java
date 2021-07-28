package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.h0;
import androidx.appcompat.widget.z;
import b.a.j;

public class ActionMenuItemView extends z implements o.a, View.OnClickListener, ActionMenuView.a {
  j g;
  
  private CharSequence h;
  
  private Drawable i;
  
  g.b j;
  
  private h0 k;
  
  b l;
  
  private boolean m;
  
  private boolean n;
  
  private int o;
  
  private int p;
  
  private int q;
  
  public ActionMenuItemView(Context paramContext) {
    this(paramContext, null);
  }
  
  public ActionMenuItemView(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public ActionMenuItemView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    Resources resources = paramContext.getResources();
    this.m = e();
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, j.ActionMenuItemView, paramInt, 0);
    this.o = typedArray.getDimensionPixelSize(j.ActionMenuItemView_android_minWidth, 0);
    typedArray.recycle();
    this.q = (int)((resources.getDisplayMetrics()).density * 32.0F + 0.5F);
    setOnClickListener(this);
    this.p = -1;
    setSaveEnabled(false);
  }
  
  private boolean e() {
    Configuration configuration = getContext().getResources().getConfiguration();
    int i = configuration.screenWidthDp;
    int k = configuration.screenHeightDp;
    return (i >= 480 || (i >= 640 && k >= 480) || configuration.orientation == 2);
  }
  
  private void f() {
    // Byte code:
    //   0: aload_0
    //   1: getfield h : Ljava/lang/CharSequence;
    //   4: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   7: istore_3
    //   8: iconst_1
    //   9: istore_2
    //   10: iload_2
    //   11: istore_1
    //   12: aload_0
    //   13: getfield i : Landroid/graphics/drawable/Drawable;
    //   16: ifnull -> 52
    //   19: aload_0
    //   20: getfield g : Landroidx/appcompat/view/menu/j;
    //   23: invokevirtual n : ()Z
    //   26: ifeq -> 50
    //   29: iload_2
    //   30: istore_1
    //   31: aload_0
    //   32: getfield m : Z
    //   35: ifne -> 52
    //   38: aload_0
    //   39: getfield n : Z
    //   42: ifeq -> 50
    //   45: iload_2
    //   46: istore_1
    //   47: goto -> 52
    //   50: iconst_0
    //   51: istore_1
    //   52: iload_3
    //   53: iconst_1
    //   54: ixor
    //   55: iload_1
    //   56: iand
    //   57: istore_1
    //   58: aconst_null
    //   59: astore #5
    //   61: iload_1
    //   62: ifeq -> 74
    //   65: aload_0
    //   66: getfield h : Ljava/lang/CharSequence;
    //   69: astore #4
    //   71: goto -> 77
    //   74: aconst_null
    //   75: astore #4
    //   77: aload_0
    //   78: aload #4
    //   80: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   83: aload_0
    //   84: getfield g : Landroidx/appcompat/view/menu/j;
    //   87: invokevirtual getContentDescription : ()Ljava/lang/CharSequence;
    //   90: astore #6
    //   92: aload #6
    //   94: astore #4
    //   96: aload #6
    //   98: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   101: ifeq -> 123
    //   104: iload_1
    //   105: ifeq -> 114
    //   108: aconst_null
    //   109: astore #4
    //   111: goto -> 123
    //   114: aload_0
    //   115: getfield g : Landroidx/appcompat/view/menu/j;
    //   118: invokevirtual getTitle : ()Ljava/lang/CharSequence;
    //   121: astore #4
    //   123: aload_0
    //   124: aload #4
    //   126: invokevirtual setContentDescription : (Ljava/lang/CharSequence;)V
    //   129: aload_0
    //   130: getfield g : Landroidx/appcompat/view/menu/j;
    //   133: invokevirtual getTooltipText : ()Ljava/lang/CharSequence;
    //   136: astore #4
    //   138: aload #4
    //   140: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   143: ifeq -> 173
    //   146: iload_1
    //   147: ifeq -> 157
    //   150: aload #5
    //   152: astore #4
    //   154: goto -> 166
    //   157: aload_0
    //   158: getfield g : Landroidx/appcompat/view/menu/j;
    //   161: invokevirtual getTitle : ()Ljava/lang/CharSequence;
    //   164: astore #4
    //   166: aload_0
    //   167: aload #4
    //   169: invokestatic a : (Landroid/view/View;Ljava/lang/CharSequence;)V
    //   172: return
    //   173: aload_0
    //   174: aload #4
    //   176: invokestatic a : (Landroid/view/View;Ljava/lang/CharSequence;)V
    //   179: return
  }
  
  public void a(j paramj, int paramInt) {
    this.g = paramj;
    setIcon(paramj.getIcon());
    setTitle(paramj.a(this));
    setId(paramj.getItemId());
    if (paramj.isVisible()) {
      paramInt = 0;
    } else {
      paramInt = 8;
    } 
    setVisibility(paramInt);
    setEnabled(paramj.isEnabled());
    if (paramj.hasSubMenu() && this.k == null)
      this.k = new a(this); 
  }
  
  public boolean a() {
    return true;
  }
  
  public boolean b() {
    return d();
  }
  
  public boolean c() {
    return (d() && this.g.getIcon() == null);
  }
  
  public boolean d() {
    return TextUtils.isEmpty(getText()) ^ true;
  }
  
  public j getItemData() {
    return this.g;
  }
  
  public void onClick(View paramView) {
    g.b b1 = this.j;
    if (b1 != null)
      b1.a(this.g); 
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration) {
    super.onConfigurationChanged(paramConfiguration);
    this.m = e();
    f();
  }
  
  protected void onMeasure(int paramInt1, int paramInt2) {
    boolean bool = d();
    if (bool) {
      int m = this.p;
      if (m >= 0)
        super.setPadding(m, getPaddingTop(), getPaddingRight(), getPaddingBottom()); 
    } 
    super.onMeasure(paramInt1, paramInt2);
    int i = View.MeasureSpec.getMode(paramInt1);
    paramInt1 = View.MeasureSpec.getSize(paramInt1);
    int k = getMeasuredWidth();
    if (i == Integer.MIN_VALUE) {
      paramInt1 = Math.min(paramInt1, this.o);
    } else {
      paramInt1 = this.o;
    } 
    if (i != 1073741824 && this.o > 0 && k < paramInt1)
      super.onMeasure(View.MeasureSpec.makeMeasureSpec(paramInt1, 1073741824), paramInt2); 
    if (!bool && this.i != null)
      super.setPadding((getMeasuredWidth() - this.i.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom()); 
  }
  
  public void onRestoreInstanceState(Parcelable paramParcelable) {
    super.onRestoreInstanceState(null);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent) {
    if (this.g.hasSubMenu()) {
      h0 h01 = this.k;
      if (h01 != null && h01.onTouch((View)this, paramMotionEvent))
        return true; 
    } 
    return super.onTouchEvent(paramMotionEvent);
  }
  
  public void setCheckable(boolean paramBoolean) {}
  
  public void setChecked(boolean paramBoolean) {}
  
  public void setExpandedFormat(boolean paramBoolean) {
    if (this.n != paramBoolean) {
      this.n = paramBoolean;
      j j1 = this.g;
      if (j1 != null)
        j1.b(); 
    } 
  }
  
  public void setIcon(Drawable paramDrawable) {
    this.i = paramDrawable;
    if (paramDrawable != null) {
      int n = paramDrawable.getIntrinsicWidth();
      int i1 = paramDrawable.getIntrinsicHeight();
      int m = this.q;
      int k = n;
      int i = i1;
      if (n > m) {
        float f = m / n;
        i = (int)(i1 * f);
        k = m;
      } 
      i1 = this.q;
      n = k;
      m = i;
      if (i > i1) {
        float f = i1 / i;
        n = (int)(k * f);
        m = i1;
      } 
      paramDrawable.setBounds(0, 0, n, m);
    } 
    setCompoundDrawables(paramDrawable, null, null, null);
    f();
  }
  
  public void setItemInvoker(g.b paramb) {
    this.j = paramb;
  }
  
  public void setPadding(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.p = paramInt1;
    super.setPadding(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public void setPopupCallback(b paramb) {
    this.l = paramb;
  }
  
  public void setTitle(CharSequence paramCharSequence) {
    this.h = paramCharSequence;
    f();
  }
  
  private class a extends h0 {
    public a(ActionMenuItemView this$0) {
      super((View)this$0);
    }
    
    public q a() {
      ActionMenuItemView.b b = this.l.l;
      return (b != null) ? b.a() : null;
    }
    
    protected boolean b() {
      ActionMenuItemView actionMenuItemView = this.l;
      g.b b = actionMenuItemView.j;
      boolean bool2 = false;
      boolean bool1 = bool2;
      if (b != null) {
        bool1 = bool2;
        if (b.a(actionMenuItemView.g)) {
          q q = a();
          bool1 = bool2;
          if (q != null) {
            bool1 = bool2;
            if (q.b())
              bool1 = true; 
          } 
        } 
      } 
      return bool1;
    }
  }
  
  public static abstract class b {
    public abstract q a();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/appcompat/view/menu/ActionMenuItemView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */