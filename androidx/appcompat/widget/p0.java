package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;

public class p0 extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {
  Runnable c;
  
  private c d;
  
  i0 e;
  
  private Spinner f;
  
  private boolean g;
  
  int h;
  
  int i;
  
  private int j;
  
  private int k;
  
  static {
    new DecelerateInterpolator();
  }
  
  private Spinner a() {
    w w = new w(getContext(), null, b.a.a.actionDropDownStyle);
    w.setLayoutParams((ViewGroup.LayoutParams)new i0.a(-2, -1));
    w.setOnItemSelectedListener(this);
    return w;
  }
  
  private boolean b() {
    Spinner spinner = this.f;
    return (spinner != null && spinner.getParent() == this);
  }
  
  private void c() {
    if (b())
      return; 
    if (this.f == null)
      this.f = a(); 
    removeView((View)this.e);
    addView((View)this.f, new ViewGroup.LayoutParams(-2, -1));
    if (this.f.getAdapter() == null)
      this.f.setAdapter((SpinnerAdapter)new b(this)); 
    Runnable runnable = this.c;
    if (runnable != null) {
      removeCallbacks(runnable);
      this.c = null;
    } 
    this.f.setSelection(this.k);
  }
  
  private boolean d() {
    if (!b())
      return false; 
    removeView((View)this.f);
    addView((View)this.e, new ViewGroup.LayoutParams(-2, -1));
    setTabSelected(this.f.getSelectedItemPosition());
    return false;
  }
  
  d a(androidx.appcompat.app.a.c paramc, boolean paramBoolean) {
    d d = new d(this, getContext(), paramc, paramBoolean);
    if (paramBoolean) {
      d.setBackgroundDrawable(null);
      d.setLayoutParams((ViewGroup.LayoutParams)new AbsListView.LayoutParams(-1, this.j));
      return d;
    } 
    d.setFocusable(true);
    if (this.d == null)
      this.d = new c(this); 
    d.setOnClickListener(this.d);
    return d;
  }
  
  public void a(int paramInt) {
    View view = this.e.getChildAt(paramInt);
    Runnable runnable = this.c;
    if (runnable != null)
      removeCallbacks(runnable); 
    this.c = new a(this, view);
    post(this.c);
  }
  
  public void onAttachedToWindow() {
    super.onAttachedToWindow();
    Runnable runnable = this.c;
    if (runnable != null)
      post(runnable); 
  }
  
  protected void onConfigurationChanged(Configuration paramConfiguration) {
    super.onConfigurationChanged(paramConfiguration);
    b.a.o.a a = b.a.o.a.a(getContext());
    setContentHeight(a.e());
    this.i = a.d();
  }
  
  public void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    Runnable runnable = this.c;
    if (runnable != null)
      removeCallbacks(runnable); 
  }
  
  public void onItemSelected(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong) {
    ((d)paramView).a().e();
  }
  
  public void onMeasure(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: iload_1
    //   1: invokestatic getMode : (I)I
    //   4: istore_2
    //   5: iconst_1
    //   6: istore_3
    //   7: iload_2
    //   8: ldc 1073741824
    //   10: if_icmpne -> 19
    //   13: iconst_1
    //   14: istore #5
    //   16: goto -> 22
    //   19: iconst_0
    //   20: istore #5
    //   22: aload_0
    //   23: iload #5
    //   25: invokevirtual setFillViewport : (Z)V
    //   28: aload_0
    //   29: getfield e : Landroidx/appcompat/widget/i0;
    //   32: invokevirtual getChildCount : ()I
    //   35: istore #4
    //   37: iload #4
    //   39: iconst_1
    //   40: if_icmple -> 102
    //   43: iload_2
    //   44: ldc 1073741824
    //   46: if_icmpeq -> 55
    //   49: iload_2
    //   50: ldc -2147483648
    //   52: if_icmpne -> 102
    //   55: iload #4
    //   57: iconst_2
    //   58: if_icmple -> 77
    //   61: aload_0
    //   62: iload_1
    //   63: invokestatic getSize : (I)I
    //   66: i2f
    //   67: ldc 0.4
    //   69: fmul
    //   70: f2i
    //   71: putfield h : I
    //   74: goto -> 87
    //   77: aload_0
    //   78: iload_1
    //   79: invokestatic getSize : (I)I
    //   82: iconst_2
    //   83: idiv
    //   84: putfield h : I
    //   87: aload_0
    //   88: getfield h : I
    //   91: aload_0
    //   92: getfield i : I
    //   95: invokestatic min : (II)I
    //   98: istore_2
    //   99: goto -> 104
    //   102: iconst_m1
    //   103: istore_2
    //   104: aload_0
    //   105: iload_2
    //   106: putfield h : I
    //   109: aload_0
    //   110: getfield j : I
    //   113: ldc 1073741824
    //   115: invokestatic makeMeasureSpec : (II)I
    //   118: istore #4
    //   120: iload #5
    //   122: ifne -> 137
    //   125: aload_0
    //   126: getfield g : Z
    //   129: ifeq -> 137
    //   132: iload_3
    //   133: istore_2
    //   134: goto -> 139
    //   137: iconst_0
    //   138: istore_2
    //   139: iload_2
    //   140: ifeq -> 174
    //   143: aload_0
    //   144: getfield e : Landroidx/appcompat/widget/i0;
    //   147: iconst_0
    //   148: iload #4
    //   150: invokevirtual measure : (II)V
    //   153: aload_0
    //   154: getfield e : Landroidx/appcompat/widget/i0;
    //   157: invokevirtual getMeasuredWidth : ()I
    //   160: iload_1
    //   161: invokestatic getSize : (I)I
    //   164: if_icmple -> 174
    //   167: aload_0
    //   168: invokespecial c : ()V
    //   171: goto -> 179
    //   174: aload_0
    //   175: invokespecial d : ()Z
    //   178: pop
    //   179: aload_0
    //   180: invokevirtual getMeasuredWidth : ()I
    //   183: istore_2
    //   184: aload_0
    //   185: iload_1
    //   186: iload #4
    //   188: invokespecial onMeasure : (II)V
    //   191: aload_0
    //   192: invokevirtual getMeasuredWidth : ()I
    //   195: istore_1
    //   196: iload #5
    //   198: ifeq -> 214
    //   201: iload_2
    //   202: iload_1
    //   203: if_icmpeq -> 214
    //   206: aload_0
    //   207: aload_0
    //   208: getfield k : I
    //   211: invokevirtual setTabSelected : (I)V
    //   214: return
  }
  
  public void onNothingSelected(AdapterView<?> paramAdapterView) {}
  
  public void setAllowCollapse(boolean paramBoolean) {
    this.g = paramBoolean;
  }
  
  public void setContentHeight(int paramInt) {
    this.j = paramInt;
    requestLayout();
  }
  
  public void setTabSelected(int paramInt) {
    this.k = paramInt;
    int j = this.e.getChildCount();
    for (int i = 0; i < j; i++) {
      boolean bool;
      View view = this.e.getChildAt(i);
      if (i == paramInt) {
        bool = true;
      } else {
        bool = false;
      } 
      view.setSelected(bool);
      if (bool)
        a(paramInt); 
    } 
    Spinner spinner = this.f;
    if (spinner != null && paramInt >= 0)
      spinner.setSelection(paramInt); 
  }
  
  class a implements Runnable {
    a(p0 this$0, View param1View) {}
    
    public void run() {
      int i = this.c.getLeft();
      int j = (this.d.getWidth() - this.c.getWidth()) / 2;
      this.d.smoothScrollTo(i - j, 0);
      this.d.c = null;
    }
  }
  
  private class b extends BaseAdapter {
    b(p0 this$0) {}
    
    public int getCount() {
      return this.c.e.getChildCount();
    }
    
    public Object getItem(int param1Int) {
      return ((p0.d)this.c.e.getChildAt(param1Int)).a();
    }
    
    public long getItemId(int param1Int) {
      return param1Int;
    }
    
    public View getView(int param1Int, View param1View, ViewGroup param1ViewGroup) {
      if (param1View == null)
        return (View)this.c.a((androidx.appcompat.app.a.c)getItem(param1Int), true); 
      ((p0.d)param1View).a((androidx.appcompat.app.a.c)getItem(param1Int));
      return param1View;
    }
  }
  
  private class c implements View.OnClickListener {
    c(p0 this$0) {}
    
    public void onClick(View param1View) {
      ((p0.d)param1View).a().e();
      int j = this.c.e.getChildCount();
      for (int i = 0; i < j; i++) {
        boolean bool;
        View view = this.c.e.getChildAt(i);
        if (view == param1View) {
          bool = true;
        } else {
          bool = false;
        } 
        view.setSelected(bool);
      } 
    }
  }
  
  private class d extends LinearLayout {
    private final int[] c = new int[] { 16842964 };
    
    private androidx.appcompat.app.a.c d;
    
    private TextView e;
    
    private ImageView f;
    
    private View g;
    
    public d(p0 this$0, Context param1Context, androidx.appcompat.app.a.c param1c, boolean param1Boolean) {
      super(param1Context, null, b.a.a.actionBarTabStyle);
      this.d = param1c;
      x0 x0 = x0.a(param1Context, null, this.c, b.a.a.actionBarTabStyle, 0);
      if (x0.g(0))
        setBackgroundDrawable(x0.b(0)); 
      x0.b();
      if (param1Boolean)
        setGravity(8388627); 
      b();
    }
    
    public androidx.appcompat.app.a.c a() {
      return this.d;
    }
    
    public void a(androidx.appcompat.app.a.c param1c) {
      this.d = param1c;
      b();
    }
    
    public void b() {
      androidx.appcompat.app.a.c c1 = this.d;
      View view = c1.b();
      ViewParent viewParent = null;
      if (view != null) {
        viewParent = view.getParent();
        if (viewParent != this) {
          if (viewParent != null)
            ((ViewGroup)viewParent).removeView(view); 
          addView(view);
        } 
        this.g = view;
        TextView textView = this.e;
        if (textView != null)
          textView.setVisibility(8); 
        ImageView imageView = this.f;
        if (imageView != null) {
          imageView.setVisibility(8);
          this.f.setImageDrawable(null);
          return;
        } 
      } else {
        CharSequence charSequence1;
        view = this.g;
        if (view != null) {
          removeView(view);
          this.g = null;
        } 
        Drawable drawable = c1.c();
        CharSequence charSequence2 = c1.d();
        if (drawable != null) {
          if (this.f == null) {
            o o = new o(getContext());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 16;
            o.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
            addView((View)o, 0);
            this.f = o;
          } 
          this.f.setImageDrawable(drawable);
          this.f.setVisibility(0);
        } else {
          ImageView imageView1 = this.f;
          if (imageView1 != null) {
            imageView1.setVisibility(8);
            this.f.setImageDrawable(null);
          } 
        } 
        int i = TextUtils.isEmpty(charSequence2) ^ true;
        if (i != 0) {
          if (this.e == null) {
            z z = new z(getContext(), null, b.a.a.actionBarTabTextStyle);
            z.setEllipsize(TextUtils.TruncateAt.END);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 16;
            z.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
            addView((View)z);
            this.e = z;
          } 
          this.e.setText(charSequence2);
          this.e.setVisibility(0);
        } else {
          TextView textView = this.e;
          if (textView != null) {
            textView.setVisibility(8);
            this.e.setText(null);
          } 
        } 
        ImageView imageView = this.f;
        if (imageView != null)
          imageView.setContentDescription(c1.a()); 
        if (i == 0)
          charSequence1 = c1.a(); 
        z0.a((View)this, charSequence1);
      } 
    }
    
    public void onInitializeAccessibilityEvent(AccessibilityEvent param1AccessibilityEvent) {
      super.onInitializeAccessibilityEvent(param1AccessibilityEvent);
      param1AccessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
    }
    
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo param1AccessibilityNodeInfo) {
      super.onInitializeAccessibilityNodeInfo(param1AccessibilityNodeInfo);
      param1AccessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
    }
    
    public void onMeasure(int param1Int1, int param1Int2) {
      super.onMeasure(param1Int1, param1Int2);
      if (this.h.h > 0) {
        param1Int1 = getMeasuredWidth();
        int i = this.h.h;
        if (param1Int1 > i)
          super.onMeasure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), param1Int2); 
      } 
    }
    
    public void setSelected(boolean param1Boolean) {
      boolean bool;
      if (isSelected() != param1Boolean) {
        bool = true;
      } else {
        bool = false;
      } 
      super.setSelected(param1Boolean);
      if (bool && param1Boolean)
        sendAccessibilityEvent(4); 
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/appcompat/widget/p0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */