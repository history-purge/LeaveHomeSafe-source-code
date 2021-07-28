package com.google.android.material.datepicker;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

class m extends BaseAdapter {
  static final int g = r.d().getMaximum(4);
  
  final l c;
  
  final d<?> d;
  
  c e;
  
  final a f;
  
  m(l paraml, d<?> paramd, a parama) {
    this.c = paraml;
    this.d = paramd;
    this.f = parama;
  }
  
  private void a(Context paramContext) {
    if (this.e == null)
      this.e = new c(paramContext); 
  }
  
  int a() {
    return this.c.q();
  }
  
  int a(int paramInt) {
    return a() + paramInt - 1;
  }
  
  int b() {
    return this.c.q() + this.c.h - 1;
  }
  
  boolean b(int paramInt) {
    return (paramInt % this.c.g == 0);
  }
  
  boolean c(int paramInt) {
    return ((paramInt + 1) % this.c.g == 0);
  }
  
  int d(int paramInt) {
    return paramInt - this.c.q() + 1;
  }
  
  boolean e(int paramInt) {
    return (paramInt >= a() && paramInt <= b());
  }
  
  public int getCount() {
    return this.c.h + a();
  }
  
  public Long getItem(int paramInt) {
    return (paramInt < this.c.q() || paramInt > b()) ? null : Long.valueOf(this.c.f(d(paramInt)));
  }
  
  public long getItemId(int paramInt) {
    return (paramInt / this.c.g);
  }
  
  public TextView getView(int paramInt, View paramView, ViewGroup paramViewGroup) {
    // Byte code:
    //   0: aload_0
    //   1: aload_3
    //   2: invokevirtual getContext : ()Landroid/content/Context;
    //   5: invokespecial a : (Landroid/content/Context;)V
    //   8: aload_2
    //   9: checkcast android/widget/TextView
    //   12: astore #7
    //   14: aload_2
    //   15: ifnonnull -> 38
    //   18: aload_3
    //   19: invokevirtual getContext : ()Landroid/content/Context;
    //   22: invokestatic from : (Landroid/content/Context;)Landroid/view/LayoutInflater;
    //   25: getstatic e/f/a/f/h.mtrl_calendar_day : I
    //   28: aload_3
    //   29: iconst_0
    //   30: invokevirtual inflate : (ILandroid/view/ViewGroup;Z)Landroid/view/View;
    //   33: checkcast android/widget/TextView
    //   36: astore #7
    //   38: iload_1
    //   39: aload_0
    //   40: invokevirtual a : ()I
    //   43: isub
    //   44: istore #4
    //   46: iload #4
    //   48: iflt -> 153
    //   51: aload_0
    //   52: getfield c : Lcom/google/android/material/datepicker/l;
    //   55: astore_2
    //   56: iload #4
    //   58: aload_2
    //   59: getfield h : I
    //   62: if_icmplt -> 68
    //   65: goto -> 153
    //   68: iload #4
    //   70: iconst_1
    //   71: iadd
    //   72: istore #4
    //   74: aload #7
    //   76: aload_2
    //   77: invokevirtual setTag : (Ljava/lang/Object;)V
    //   80: aload #7
    //   82: iload #4
    //   84: invokestatic valueOf : (I)Ljava/lang/String;
    //   87: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   90: aload_0
    //   91: getfield c : Lcom/google/android/material/datepicker/l;
    //   94: iload #4
    //   96: invokevirtual f : (I)J
    //   99: lstore #5
    //   101: aload_0
    //   102: getfield c : Lcom/google/android/material/datepicker/l;
    //   105: getfield f : I
    //   108: invokestatic t : ()Lcom/google/android/material/datepicker/l;
    //   111: getfield f : I
    //   114: if_icmpne -> 126
    //   117: lload #5
    //   119: invokestatic a : (J)Ljava/lang/String;
    //   122: astore_2
    //   123: goto -> 132
    //   126: lload #5
    //   128: invokestatic b : (J)Ljava/lang/String;
    //   131: astore_2
    //   132: aload #7
    //   134: aload_2
    //   135: invokevirtual setContentDescription : (Ljava/lang/CharSequence;)V
    //   138: aload #7
    //   140: iconst_0
    //   141: invokevirtual setVisibility : (I)V
    //   144: aload #7
    //   146: iconst_1
    //   147: invokevirtual setEnabled : (Z)V
    //   150: goto -> 166
    //   153: aload #7
    //   155: bipush #8
    //   157: invokevirtual setVisibility : (I)V
    //   160: aload #7
    //   162: iconst_0
    //   163: invokevirtual setEnabled : (Z)V
    //   166: aload_0
    //   167: iload_1
    //   168: invokevirtual getItem : (I)Ljava/lang/Long;
    //   171: astore_2
    //   172: aload_2
    //   173: ifnonnull -> 179
    //   176: aload #7
    //   178: areturn
    //   179: aload_0
    //   180: getfield f : Lcom/google/android/material/datepicker/a;
    //   183: invokevirtual e : ()Lcom/google/android/material/datepicker/a$c;
    //   186: aload_2
    //   187: invokevirtual longValue : ()J
    //   190: invokeinterface a : (J)Z
    //   195: ifeq -> 311
    //   198: aload #7
    //   200: iconst_1
    //   201: invokevirtual setEnabled : (Z)V
    //   204: aload_0
    //   205: getfield d : Lcom/google/android/material/datepicker/d;
    //   208: invokeinterface c : ()Ljava/util/Collection;
    //   213: invokeinterface iterator : ()Ljava/util/Iterator;
    //   218: astore_3
    //   219: aload_3
    //   220: invokeinterface hasNext : ()Z
    //   225: ifeq -> 275
    //   228: aload_3
    //   229: invokeinterface next : ()Ljava/lang/Object;
    //   234: checkcast java/lang/Long
    //   237: invokevirtual longValue : ()J
    //   240: lstore #5
    //   242: aload_2
    //   243: invokevirtual longValue : ()J
    //   246: invokestatic a : (J)J
    //   249: lload #5
    //   251: invokestatic a : (J)J
    //   254: lcmp
    //   255: ifne -> 219
    //   258: aload_0
    //   259: getfield e : Lcom/google/android/material/datepicker/c;
    //   262: getfield b : Lcom/google/android/material/datepicker/b;
    //   265: astore_2
    //   266: aload_2
    //   267: aload #7
    //   269: invokevirtual a : (Landroid/widget/TextView;)V
    //   272: aload #7
    //   274: areturn
    //   275: invokestatic b : ()Ljava/util/Calendar;
    //   278: invokevirtual getTimeInMillis : ()J
    //   281: aload_2
    //   282: invokevirtual longValue : ()J
    //   285: lcmp
    //   286: ifne -> 300
    //   289: aload_0
    //   290: getfield e : Lcom/google/android/material/datepicker/c;
    //   293: getfield c : Lcom/google/android/material/datepicker/b;
    //   296: astore_2
    //   297: goto -> 266
    //   300: aload_0
    //   301: getfield e : Lcom/google/android/material/datepicker/c;
    //   304: getfield a : Lcom/google/android/material/datepicker/b;
    //   307: astore_2
    //   308: goto -> 266
    //   311: aload #7
    //   313: iconst_0
    //   314: invokevirtual setEnabled : (Z)V
    //   317: aload_0
    //   318: getfield e : Lcom/google/android/material/datepicker/c;
    //   321: getfield g : Lcom/google/android/material/datepicker/b;
    //   324: astore_2
    //   325: goto -> 266
  }
  
  public boolean hasStableIds() {
    return true;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/material/datepicker/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */