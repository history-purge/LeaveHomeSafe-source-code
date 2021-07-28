package com.facebook.react.views.picker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import e.e.m.a.a;
import java.util.List;

class b extends ArrayAdapter<c> {
  private final LayoutInflater c;
  
  private Integer d;
  
  private Integer e;
  
  public b(Context paramContext, List<c> paramList) {
    super(paramContext, 0, paramList);
    Object object = paramContext.getSystemService("layout_inflater");
    a.a(object);
    this.c = (LayoutInflater)object;
  }
  
  private View a(int paramInt, View paramView, ViewGroup paramViewGroup, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: iload_1
    //   2: invokevirtual getItem : (I)Ljava/lang/Object;
    //   5: checkcast com/facebook/react/views/picker/c
    //   8: astore #6
    //   10: iconst_0
    //   11: istore_1
    //   12: aload_2
    //   13: astore #5
    //   15: aload_2
    //   16: ifnonnull -> 60
    //   19: iload #4
    //   21: ifeq -> 30
    //   24: ldc 17367049
    //   26: istore_1
    //   27: goto -> 33
    //   30: ldc 17367048
    //   32: istore_1
    //   33: aload_0
    //   34: getfield c : Landroid/view/LayoutInflater;
    //   37: iload_1
    //   38: aload_3
    //   39: iconst_0
    //   40: invokevirtual inflate : (ILandroid/view/ViewGroup;Z)Landroid/view/View;
    //   43: astore #5
    //   45: aload #5
    //   47: aload #5
    //   49: checkcast android/widget/TextView
    //   52: invokevirtual getTextColors : ()Landroid/content/res/ColorStateList;
    //   55: invokevirtual setTag : (Ljava/lang/Object;)V
    //   58: iconst_1
    //   59: istore_1
    //   60: aload #5
    //   62: checkcast android/widget/TextView
    //   65: astore_2
    //   66: aload_2
    //   67: aload #6
    //   69: getfield a : Ljava/lang/String;
    //   72: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   75: iload #4
    //   77: ifne -> 97
    //   80: aload_0
    //   81: getfield d : Ljava/lang/Integer;
    //   84: astore_3
    //   85: aload_3
    //   86: ifnull -> 97
    //   89: aload_3
    //   90: invokevirtual intValue : ()I
    //   93: istore_1
    //   94: goto -> 112
    //   97: aload #6
    //   99: getfield b : Ljava/lang/Integer;
    //   102: astore_3
    //   103: aload_3
    //   104: ifnull -> 120
    //   107: aload_3
    //   108: invokevirtual intValue : ()I
    //   111: istore_1
    //   112: aload_2
    //   113: iload_1
    //   114: invokevirtual setTextColor : (I)V
    //   117: goto -> 142
    //   120: aload_2
    //   121: invokevirtual getTag : ()Ljava/lang/Object;
    //   124: ifnull -> 142
    //   127: iload_1
    //   128: ifne -> 142
    //   131: aload_2
    //   132: aload_2
    //   133: invokevirtual getTag : ()Ljava/lang/Object;
    //   136: checkcast android/content/res/ColorStateList
    //   139: invokevirtual setTextColor : (Landroid/content/res/ColorStateList;)V
    //   142: aload_0
    //   143: getfield e : Ljava/lang/Integer;
    //   146: astore_3
    //   147: aload_3
    //   148: ifnull -> 159
    //   151: aload_2
    //   152: aload_3
    //   153: invokevirtual intValue : ()I
    //   156: invokevirtual setBackgroundColor : (I)V
    //   159: aload_2
    //   160: areturn
  }
  
  public Integer a() {
    return this.e;
  }
  
  public void a(Integer paramInteger) {
    this.e = paramInteger;
    notifyDataSetChanged();
  }
  
  public Integer b() {
    return this.d;
  }
  
  public void b(Integer paramInteger) {
    this.d = paramInteger;
    notifyDataSetChanged();
  }
  
  public View getDropDownView(int paramInt, View paramView, ViewGroup paramViewGroup) {
    return a(paramInt, paramView, paramViewGroup, true);
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup) {
    return a(paramInt, paramView, paramViewGroup, false);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/picker/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */