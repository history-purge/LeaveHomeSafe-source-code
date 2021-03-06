package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import b.g.m.v;
import e.f.a.f.f;
import e.f.a.f.k;

public class SnackbarContentLayout extends LinearLayout implements e {
  private TextView c;
  
  private Button d;
  
  private int e;
  
  private int f;
  
  public SnackbarContentLayout(Context paramContext) {
    this(paramContext, null);
  }
  
  public SnackbarContentLayout(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, k.SnackbarLayout);
    this.e = typedArray.getDimensionPixelSize(k.SnackbarLayout_android_maxWidth, -1);
    this.f = typedArray.getDimensionPixelSize(k.SnackbarLayout_maxActionInlineWidth, -1);
    typedArray.recycle();
  }
  
  private static void a(View paramView, int paramInt1, int paramInt2) {
    if (v.K(paramView)) {
      v.a(paramView, v.u(paramView), paramInt1, v.t(paramView), paramInt2);
      return;
    } 
    paramView.setPadding(paramView.getPaddingLeft(), paramInt1, paramView.getPaddingRight(), paramInt2);
  }
  
  private boolean a(int paramInt1, int paramInt2, int paramInt3) {
    boolean bool;
    if (paramInt1 != getOrientation()) {
      setOrientation(paramInt1);
      bool = true;
    } else {
      bool = false;
    } 
    if (this.c.getPaddingTop() != paramInt2 || this.c.getPaddingBottom() != paramInt3) {
      a((View)this.c, paramInt2, paramInt3);
      bool = true;
    } 
    return bool;
  }
  
  public Button getActionView() {
    return this.d;
  }
  
  public TextView getMessageView() {
    return this.c;
  }
  
  protected void onFinishInflate() {
    super.onFinishInflate();
    this.c = (TextView)findViewById(f.snackbar_text);
    this.d = (Button)findViewById(f.snackbar_action);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: iload_1
    //   2: iload_2
    //   3: invokespecial onMeasure : (II)V
    //   6: iload_1
    //   7: istore_3
    //   8: aload_0
    //   9: getfield e : I
    //   12: ifle -> 50
    //   15: aload_0
    //   16: invokevirtual getMeasuredWidth : ()I
    //   19: istore #4
    //   21: aload_0
    //   22: getfield e : I
    //   25: istore #5
    //   27: iload_1
    //   28: istore_3
    //   29: iload #4
    //   31: iload #5
    //   33: if_icmple -> 50
    //   36: iload #5
    //   38: ldc 1073741824
    //   40: invokestatic makeMeasureSpec : (II)I
    //   43: istore_3
    //   44: aload_0
    //   45: iload_3
    //   46: iload_2
    //   47: invokespecial onMeasure : (II)V
    //   50: aload_0
    //   51: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   54: getstatic e/f/a/f/d.design_snackbar_padding_vertical_2lines : I
    //   57: invokevirtual getDimensionPixelSize : (I)I
    //   60: istore #5
    //   62: aload_0
    //   63: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   66: getstatic e/f/a/f/d.design_snackbar_padding_vertical : I
    //   69: invokevirtual getDimensionPixelSize : (I)I
    //   72: istore #6
    //   74: aload_0
    //   75: getfield c : Landroid/widget/TextView;
    //   78: invokevirtual getLayout : ()Landroid/text/Layout;
    //   81: invokevirtual getLineCount : ()I
    //   84: istore_1
    //   85: iconst_1
    //   86: istore #4
    //   88: iload_1
    //   89: iconst_1
    //   90: if_icmple -> 98
    //   93: iconst_1
    //   94: istore_1
    //   95: goto -> 100
    //   98: iconst_0
    //   99: istore_1
    //   100: iload_1
    //   101: ifeq -> 146
    //   104: aload_0
    //   105: getfield f : I
    //   108: ifle -> 146
    //   111: aload_0
    //   112: getfield d : Landroid/widget/Button;
    //   115: invokevirtual getMeasuredWidth : ()I
    //   118: aload_0
    //   119: getfield f : I
    //   122: if_icmple -> 146
    //   125: aload_0
    //   126: iconst_1
    //   127: iload #5
    //   129: iload #5
    //   131: iload #6
    //   133: isub
    //   134: invokespecial a : (III)Z
    //   137: ifeq -> 175
    //   140: iload #4
    //   142: istore_1
    //   143: goto -> 177
    //   146: iload_1
    //   147: ifeq -> 156
    //   150: iload #5
    //   152: istore_1
    //   153: goto -> 159
    //   156: iload #6
    //   158: istore_1
    //   159: aload_0
    //   160: iconst_0
    //   161: iload_1
    //   162: iload_1
    //   163: invokespecial a : (III)Z
    //   166: ifeq -> 175
    //   169: iload #4
    //   171: istore_1
    //   172: goto -> 177
    //   175: iconst_0
    //   176: istore_1
    //   177: iload_1
    //   178: ifeq -> 187
    //   181: aload_0
    //   182: iload_3
    //   183: iload_2
    //   184: invokespecial onMeasure : (II)V
    //   187: return
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/material/snackbar/SnackbarContentLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */