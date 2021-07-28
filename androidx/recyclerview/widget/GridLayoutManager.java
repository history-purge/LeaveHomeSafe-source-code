package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.Arrays;

public class GridLayoutManager extends LinearLayoutManager {
  boolean I = false;
  
  int J = -1;
  
  int[] K;
  
  View[] L;
  
  final SparseIntArray M = new SparseIntArray();
  
  final SparseIntArray N = new SparseIntArray();
  
  c O = new a();
  
  final Rect P = new Rect();
  
  private boolean Q;
  
  public GridLayoutManager(Context paramContext, int paramInt1, int paramInt2, boolean paramBoolean) {
    super(paramContext, paramInt2, paramBoolean);
    l(paramInt1);
  }
  
  public GridLayoutManager(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2) {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
    l((RecyclerView.o.a(paramContext, paramAttributeSet, paramInt1, paramInt2)).b);
  }
  
  private void N() {
    int j = e();
    for (int i = 0; i < j; i++) {
      b b = (b)d(i).getLayoutParams();
      int k = b.a();
      this.M.put(k, b.f());
      this.N.put(k, b.e());
    } 
  }
  
  private void O() {
    this.M.clear();
    this.N.clear();
  }
  
  private void P() {
    View[] arrayOfView = this.L;
    if (arrayOfView == null || arrayOfView.length != this.J)
      this.L = new View[this.J]; 
  }
  
  private void Q() {
    int i;
    int j;
    if (I() == 1) {
      i = r() - p();
      j = o();
    } else {
      i = h() - n();
      j = q();
    } 
    m(i - j);
  }
  
  private int a(RecyclerView.v paramv, RecyclerView.a0 parama0, int paramInt) {
    if (!parama0.d())
      return this.O.a(paramInt, this.J); 
    int i = paramv.a(paramInt);
    if (i == -1) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Cannot find span size for pre layout position. ");
      stringBuilder.append(paramInt);
      Log.w("GridLayoutManager", stringBuilder.toString());
      return 0;
    } 
    return this.O.a(i, this.J);
  }
  
  private void a(float paramFloat, int paramInt) {
    m(Math.max(Math.round(paramFloat * this.J), paramInt));
  }
  
  private void a(View paramView, int paramInt1, int paramInt2, boolean paramBoolean) {
    RecyclerView.p p = (RecyclerView.p)paramView.getLayoutParams();
    if (paramBoolean) {
      paramBoolean = b(paramView, paramInt1, paramInt2, p);
    } else {
      paramBoolean = a(paramView, paramInt1, paramInt2, p);
    } 
    if (paramBoolean)
      paramView.measure(paramInt1, paramInt2); 
  }
  
  private void a(View paramView, int paramInt, boolean paramBoolean) {
    b b = (b)paramView.getLayoutParams();
    Rect rect = b.b;
    int j = rect.top + rect.bottom + b.topMargin + b.bottomMargin;
    int i = rect.left + rect.right + b.leftMargin + b.rightMargin;
    int k = f(b.e, b.f);
    if (this.s == 1) {
      i = RecyclerView.o.a(k, paramInt, i, b.width, false);
      paramInt = RecyclerView.o.a(this.u.g(), i(), j, b.height, true);
    } else {
      paramInt = RecyclerView.o.a(k, paramInt, j, b.height, false);
      i = RecyclerView.o.a(this.u.g(), s(), i, b.width, true);
    } 
    a(paramView, i, paramInt, paramBoolean);
  }
  
  private void a(RecyclerView.v paramv, RecyclerView.a0 parama0, int paramInt, boolean paramBoolean) {
    byte b;
    int j = 0;
    int i = -1;
    if (paramBoolean) {
      boolean bool = false;
      b = 1;
      i = paramInt;
      paramInt = bool;
    } else {
      paramInt--;
      b = -1;
    } 
    while (paramInt != i) {
      View view = this.L[paramInt];
      b b1 = (b)view.getLayoutParams();
      b1.f = c(paramv, parama0, l(view));
      b1.e = j;
      j += b1.f;
      paramInt += b;
    } 
  }
  
  static int[] a(int[] paramArrayOfint, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: iconst_1
    //   1: istore #4
    //   3: aload_0
    //   4: ifnull -> 28
    //   7: aload_0
    //   8: arraylength
    //   9: iload_1
    //   10: iconst_1
    //   11: iadd
    //   12: if_icmpne -> 28
    //   15: aload_0
    //   16: astore #8
    //   18: aload_0
    //   19: aload_0
    //   20: arraylength
    //   21: iconst_1
    //   22: isub
    //   23: iaload
    //   24: iload_2
    //   25: if_icmpeq -> 35
    //   28: iload_1
    //   29: iconst_1
    //   30: iadd
    //   31: newarray int
    //   33: astore #8
    //   35: iconst_0
    //   36: istore #5
    //   38: aload #8
    //   40: iconst_0
    //   41: iconst_0
    //   42: iastore
    //   43: iload_2
    //   44: iload_1
    //   45: idiv
    //   46: istore #6
    //   48: iload_2
    //   49: iload_1
    //   50: irem
    //   51: istore #7
    //   53: iconst_0
    //   54: istore_3
    //   55: iload #5
    //   57: istore_2
    //   58: iload #4
    //   60: iload_1
    //   61: if_icmpgt -> 118
    //   64: iload_2
    //   65: iload #7
    //   67: iadd
    //   68: istore_2
    //   69: iload_2
    //   70: ifle -> 94
    //   73: iload_1
    //   74: iload_2
    //   75: isub
    //   76: iload #7
    //   78: if_icmpge -> 94
    //   81: iload #6
    //   83: iconst_1
    //   84: iadd
    //   85: istore #5
    //   87: iload_2
    //   88: iload_1
    //   89: isub
    //   90: istore_2
    //   91: goto -> 98
    //   94: iload #6
    //   96: istore #5
    //   98: iload_3
    //   99: iload #5
    //   101: iadd
    //   102: istore_3
    //   103: aload #8
    //   105: iload #4
    //   107: iload_3
    //   108: iastore
    //   109: iload #4
    //   111: iconst_1
    //   112: iadd
    //   113: istore #4
    //   115: goto -> 58
    //   118: aload #8
    //   120: areturn
  }
  
  private int b(RecyclerView.v paramv, RecyclerView.a0 parama0, int paramInt) {
    if (!parama0.d())
      return this.O.b(paramInt, this.J); 
    int i = this.N.get(paramInt, -1);
    if (i != -1)
      return i; 
    i = paramv.a(paramInt);
    if (i == -1) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:");
      stringBuilder.append(paramInt);
      Log.w("GridLayoutManager", stringBuilder.toString());
      return 0;
    } 
    return this.O.b(i, this.J);
  }
  
  private void b(RecyclerView.v paramv, RecyclerView.a0 parama0, LinearLayoutManager.a parama, int paramInt) {
    if (paramInt == 1) {
      paramInt = 1;
    } else {
      paramInt = 0;
    } 
    int i = b(paramv, parama0, parama.b);
    if (paramInt != 0) {
      while (i > 0) {
        paramInt = parama.b;
        if (paramInt > 0) {
          parama.b = paramInt - 1;
          i = b(paramv, parama0, parama.b);
        } 
      } 
    } else {
      int j = parama0.a();
      paramInt = parama.b;
      while (paramInt < j - 1) {
        int m = paramInt + 1;
        int k = b(paramv, parama0, m);
        if (k > i) {
          paramInt = m;
          i = k;
        } 
      } 
      parama.b = paramInt;
    } 
  }
  
  private int c(RecyclerView.v paramv, RecyclerView.a0 parama0, int paramInt) {
    if (!parama0.d())
      return this.O.a(paramInt); 
    int i = this.M.get(paramInt, -1);
    if (i != -1)
      return i; 
    i = paramv.a(paramInt);
    if (i == -1) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:");
      stringBuilder.append(paramInt);
      Log.w("GridLayoutManager", stringBuilder.toString());
      return 1;
    } 
    return this.O.a(i);
  }
  
  private int i(RecyclerView.a0 parama0) {
    if (e() != 0) {
      if (parama0.a() == 0)
        return 0; 
      F();
      boolean bool = K();
      View view1 = b(bool ^ true, true);
      View view2 = a(bool ^ true, true);
      if (view1 != null) {
        if (view2 == null)
          return 0; 
        int j = this.O.a(l(view1), this.J);
        int k = this.O.a(l(view2), this.J);
        int i = Math.min(j, k);
        j = Math.max(j, k);
        k = this.O.a(parama0.a() - 1, this.J);
        if (this.x) {
          i = Math.max(0, k + 1 - j - 1);
        } else {
          i = Math.max(0, i);
        } 
        if (!bool)
          return i; 
        j = Math.abs(this.u.a(view2) - this.u.d(view1));
        k = this.O.a(l(view1), this.J);
        int m = this.O.a(l(view2), this.J);
        float f = j / (m - k + 1);
        return Math.round(i * f + (this.u.f() - this.u.d(view1)));
      } 
    } 
    return 0;
  }
  
  private int j(RecyclerView.a0 parama0) {
    if (e() != 0) {
      if (parama0.a() == 0)
        return 0; 
      F();
      View view1 = b(K() ^ true, true);
      View view2 = a(K() ^ true, true);
      if (view1 != null) {
        if (view2 == null)
          return 0; 
        if (!K())
          return this.O.a(parama0.a() - 1, this.J) + 1; 
        int i = this.u.a(view2);
        int j = this.u.d(view1);
        int k = this.O.a(l(view1), this.J);
        int m = this.O.a(l(view2), this.J);
        int n = this.O.a(parama0.a() - 1, this.J);
        return (int)((i - j) / (m - k + 1) * (n + 1));
      } 
    } 
    return 0;
  }
  
  private void m(int paramInt) {
    this.K = a(this.K, this.J, paramInt);
  }
  
  public boolean D() {
    return (this.D == null && !this.I);
  }
  
  public int M() {
    return this.J;
  }
  
  public int a(int paramInt, RecyclerView.v paramv, RecyclerView.a0 parama0) {
    Q();
    P();
    return super.a(paramInt, paramv, parama0);
  }
  
  public int a(RecyclerView.v paramv, RecyclerView.a0 parama0) {
    return (this.s == 1) ? this.J : ((parama0.a() < 1) ? 0 : (a(paramv, parama0, parama0.a() - 1) + 1));
  }
  
  public View a(View paramView, int paramInt, RecyclerView.v paramv, RecyclerView.a0 parama0) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokevirtual c : (Landroid/view/View;)Landroid/view/View;
    //   5: astore #22
    //   7: aconst_null
    //   8: astore #23
    //   10: aload #22
    //   12: ifnonnull -> 17
    //   15: aconst_null
    //   16: areturn
    //   17: aload #22
    //   19: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   22: checkcast androidx/recyclerview/widget/GridLayoutManager$b
    //   25: astore #24
    //   27: aload #24
    //   29: getfield e : I
    //   32: istore #15
    //   34: aload #24
    //   36: getfield f : I
    //   39: iload #15
    //   41: iadd
    //   42: istore #16
    //   44: aload_0
    //   45: aload_1
    //   46: iload_2
    //   47: aload_3
    //   48: aload #4
    //   50: invokespecial a : (Landroid/view/View;ILandroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;)Landroid/view/View;
    //   53: ifnonnull -> 58
    //   56: aconst_null
    //   57: areturn
    //   58: aload_0
    //   59: iload_2
    //   60: invokevirtual j : (I)I
    //   63: iconst_1
    //   64: if_icmpne -> 73
    //   67: iconst_1
    //   68: istore #21
    //   70: goto -> 76
    //   73: iconst_0
    //   74: istore #21
    //   76: iload #21
    //   78: aload_0
    //   79: getfield x : Z
    //   82: if_icmpeq -> 90
    //   85: iconst_1
    //   86: istore_2
    //   87: goto -> 92
    //   90: iconst_0
    //   91: istore_2
    //   92: iload_2
    //   93: ifeq -> 113
    //   96: aload_0
    //   97: invokevirtual e : ()I
    //   100: iconst_1
    //   101: isub
    //   102: istore #7
    //   104: iconst_m1
    //   105: istore #5
    //   107: iconst_m1
    //   108: istore #8
    //   110: goto -> 125
    //   113: aload_0
    //   114: invokevirtual e : ()I
    //   117: istore #5
    //   119: iconst_0
    //   120: istore #7
    //   122: iconst_1
    //   123: istore #8
    //   125: aload_0
    //   126: getfield s : I
    //   129: iconst_1
    //   130: if_icmpne -> 146
    //   133: aload_0
    //   134: invokevirtual J : ()Z
    //   137: ifeq -> 146
    //   140: iconst_1
    //   141: istore #9
    //   143: goto -> 149
    //   146: iconst_0
    //   147: istore #9
    //   149: aload_0
    //   150: aload_3
    //   151: aload #4
    //   153: iload #7
    //   155: invokespecial a : (Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;I)I
    //   158: istore #17
    //   160: aconst_null
    //   161: astore_1
    //   162: iconst_m1
    //   163: istore #11
    //   165: iconst_0
    //   166: istore #12
    //   168: iconst_0
    //   169: istore_2
    //   170: iconst_m1
    //   171: istore #6
    //   173: iload #5
    //   175: istore #10
    //   177: iload #11
    //   179: istore #5
    //   181: iload #7
    //   183: istore #11
    //   185: iload #11
    //   187: iload #10
    //   189: if_icmpeq -> 567
    //   192: aload_0
    //   193: aload_3
    //   194: aload #4
    //   196: iload #11
    //   198: invokespecial a : (Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;I)I
    //   201: istore #7
    //   203: aload_0
    //   204: iload #11
    //   206: invokevirtual d : (I)Landroid/view/View;
    //   209: astore #24
    //   211: aload #24
    //   213: aload #22
    //   215: if_acmpne -> 221
    //   218: goto -> 567
    //   221: aload #24
    //   223: invokevirtual hasFocusable : ()Z
    //   226: ifeq -> 247
    //   229: iload #7
    //   231: iload #17
    //   233: if_icmpeq -> 247
    //   236: aload #23
    //   238: ifnull -> 244
    //   241: goto -> 567
    //   244: goto -> 557
    //   247: aload #24
    //   249: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   252: checkcast androidx/recyclerview/widget/GridLayoutManager$b
    //   255: astore #25
    //   257: aload #25
    //   259: getfield e : I
    //   262: istore #18
    //   264: aload #25
    //   266: getfield f : I
    //   269: iload #18
    //   271: iadd
    //   272: istore #19
    //   274: aload #24
    //   276: invokevirtual hasFocusable : ()Z
    //   279: ifeq -> 299
    //   282: iload #18
    //   284: iload #15
    //   286: if_icmpne -> 299
    //   289: iload #19
    //   291: iload #16
    //   293: if_icmpne -> 299
    //   296: aload #24
    //   298: areturn
    //   299: aload #24
    //   301: invokevirtual hasFocusable : ()Z
    //   304: ifeq -> 312
    //   307: aload #23
    //   309: ifnull -> 324
    //   312: aload #24
    //   314: invokevirtual hasFocusable : ()Z
    //   317: ifne -> 330
    //   320: aload_1
    //   321: ifnonnull -> 330
    //   324: iconst_1
    //   325: istore #7
    //   327: goto -> 478
    //   330: iload #18
    //   332: iload #15
    //   334: invokestatic max : (II)I
    //   337: istore #7
    //   339: iload #19
    //   341: iload #16
    //   343: invokestatic min : (II)I
    //   346: iload #7
    //   348: isub
    //   349: istore #20
    //   351: aload #24
    //   353: invokevirtual hasFocusable : ()Z
    //   356: ifeq -> 402
    //   359: iload #20
    //   361: iload #12
    //   363: if_icmple -> 369
    //   366: goto -> 324
    //   369: iload #20
    //   371: iload #12
    //   373: if_icmpne -> 475
    //   376: iload #18
    //   378: iload #5
    //   380: if_icmple -> 389
    //   383: iconst_1
    //   384: istore #7
    //   386: goto -> 392
    //   389: iconst_0
    //   390: istore #7
    //   392: iload #9
    //   394: iload #7
    //   396: if_icmpne -> 475
    //   399: goto -> 366
    //   402: aload #23
    //   404: ifnonnull -> 475
    //   407: iconst_1
    //   408: istore #14
    //   410: iconst_1
    //   411: istore #7
    //   413: aload_0
    //   414: aload #24
    //   416: iconst_0
    //   417: iconst_1
    //   418: invokevirtual a : (Landroid/view/View;ZZ)Z
    //   421: istore #21
    //   423: iload_2
    //   424: istore #13
    //   426: iload #21
    //   428: ifeq -> 475
    //   431: iload #20
    //   433: iload #13
    //   435: if_icmple -> 445
    //   438: iload #14
    //   440: istore #7
    //   442: goto -> 478
    //   445: iload #20
    //   447: iload #13
    //   449: if_icmpne -> 475
    //   452: iload #18
    //   454: iload #6
    //   456: if_icmple -> 462
    //   459: goto -> 465
    //   462: iconst_0
    //   463: istore #7
    //   465: iload #9
    //   467: iload #7
    //   469: if_icmpne -> 475
    //   472: goto -> 324
    //   475: iconst_0
    //   476: istore #7
    //   478: iload #7
    //   480: ifeq -> 557
    //   483: aload #24
    //   485: invokevirtual hasFocusable : ()Z
    //   488: ifeq -> 522
    //   491: aload #25
    //   493: getfield e : I
    //   496: istore #5
    //   498: iload #19
    //   500: iload #16
    //   502: invokestatic min : (II)I
    //   505: iload #18
    //   507: iload #15
    //   509: invokestatic max : (II)I
    //   512: isub
    //   513: istore #12
    //   515: aload #24
    //   517: astore #23
    //   519: goto -> 557
    //   522: aload #25
    //   524: getfield e : I
    //   527: istore #6
    //   529: iload #19
    //   531: iload #16
    //   533: invokestatic min : (II)I
    //   536: istore_2
    //   537: iload #18
    //   539: iload #15
    //   541: invokestatic max : (II)I
    //   544: istore #7
    //   546: aload #24
    //   548: astore_1
    //   549: iload_2
    //   550: iload #7
    //   552: isub
    //   553: istore_2
    //   554: goto -> 557
    //   557: iload #11
    //   559: iload #8
    //   561: iadd
    //   562: istore #11
    //   564: goto -> 185
    //   567: aload #23
    //   569: ifnull -> 575
    //   572: aload #23
    //   574: areturn
    //   575: aload_1
    //   576: areturn
  }
  
  View a(RecyclerView.v paramv, RecyclerView.a0 parama0, int paramInt1, int paramInt2, int paramInt3) {
    byte b;
    F();
    int i = this.u.f();
    int j = this.u.b();
    if (paramInt2 > paramInt1) {
      b = 1;
    } else {
      b = -1;
    } 
    View view2 = null;
    View view1;
    for (view1 = null; paramInt1 != paramInt2; view1 = view4) {
      View view5 = d(paramInt1);
      int k = l(view5);
      View view3 = view2;
      View view4 = view1;
      if (k >= 0) {
        view3 = view2;
        view4 = view1;
        if (k < paramInt3)
          if (b(paramv, parama0, k) != 0) {
            view3 = view2;
            view4 = view1;
          } else if (((RecyclerView.p)view5.getLayoutParams()).c()) {
            view3 = view2;
            view4 = view1;
            if (view1 == null) {
              view4 = view5;
              view3 = view2;
            } 
          } else if (this.u.d(view5) >= j || this.u.a(view5) < i) {
            view3 = view2;
            view4 = view1;
            if (view2 == null) {
              view3 = view5;
              view4 = view1;
            } 
          } else {
            return view5;
          }  
      } 
      paramInt1 += b;
      view2 = view3;
    } 
    return (view2 != null) ? view2 : view1;
  }
  
  public RecyclerView.p a(Context paramContext, AttributeSet paramAttributeSet) {
    return new b(paramContext, paramAttributeSet);
  }
  
  public RecyclerView.p a(ViewGroup.LayoutParams paramLayoutParams) {
    return (paramLayoutParams instanceof ViewGroup.MarginLayoutParams) ? new b((ViewGroup.MarginLayoutParams)paramLayoutParams) : new b(paramLayoutParams);
  }
  
  public void a(Rect paramRect, int paramInt1, int paramInt2) {
    int[] arrayOfInt;
    if (this.K == null)
      super.a(paramRect, paramInt1, paramInt2); 
    int i = o() + p();
    int j = q() + n();
    if (this.s == 1) {
      paramInt2 = RecyclerView.o.a(paramInt2, paramRect.height() + j, l());
      arrayOfInt = this.K;
      i = RecyclerView.o.a(paramInt1, arrayOfInt[arrayOfInt.length - 1] + i, m());
      paramInt1 = paramInt2;
      paramInt2 = i;
    } else {
      paramInt1 = RecyclerView.o.a(paramInt1, arrayOfInt.width() + i, m());
      arrayOfInt = this.K;
      i = RecyclerView.o.a(paramInt2, arrayOfInt[arrayOfInt.length - 1] + j, l());
      paramInt2 = paramInt1;
      paramInt1 = i;
    } 
    c(paramInt2, paramInt1);
  }
  
  void a(RecyclerView.a0 parama0, LinearLayoutManager.c paramc, RecyclerView.o.c paramc1) {
    int j = this.J;
    int i;
    for (i = 0; i < this.J && paramc.a(parama0) && j > 0; i++) {
      int k = paramc.d;
      paramc1.a(k, Math.max(0, paramc.g));
      j -= this.O.a(k);
      paramc.d += paramc.e;
    } 
  }
  
  public void a(RecyclerView.v paramv, RecyclerView.a0 parama0, View paramView, b.g.m.e0.c paramc) {
    boolean bool;
    int j;
    int k;
    ViewGroup.LayoutParams layoutParams = paramView.getLayoutParams();
    if (!(layoutParams instanceof b)) {
      a(paramView, paramc);
      return;
    } 
    b b = (b)layoutParams;
    int i = a(paramv, parama0, b.a());
    if (this.s == 0) {
      int m = b.e();
      bool = b.f();
      k = 1;
      j = i;
      i = m;
    } else {
      bool = true;
      j = b.e();
      k = b.f();
    } 
    paramc.b(b.g.m.e0.c.c.a(i, bool, j, k, false, false));
  }
  
  void a(RecyclerView.v paramv, RecyclerView.a0 parama0, LinearLayoutManager.a parama, int paramInt) {
    super.a(paramv, parama0, parama, paramInt);
    Q();
    if (parama0.a() > 0 && !parama0.d())
      b(paramv, parama0, parama, paramInt); 
    P();
  }
  
  void a(RecyclerView.v paramv, RecyclerView.a0 parama0, LinearLayoutManager.c paramc, LinearLayoutManager.b paramb) {
    StringBuilder stringBuilder;
    int k;
    int m;
    boolean bool;
    int i2 = this.u.e();
    if (i2 != 1073741824) {
      k = 1;
    } else {
      k = 0;
    } 
    if (e() > 0) {
      m = this.K[this.J];
    } else {
      m = 0;
    } 
    if (k)
      Q(); 
    if (paramc.e == 1) {
      bool = true;
    } else {
      bool = false;
    } 
    int i = this.J;
    if (!bool)
      i = b(paramv, parama0, paramc.d) + c(paramv, parama0, paramc.d); 
    int n = 0;
    while (n < this.J && paramc.a(parama0) && i > 0) {
      int i3 = paramc.d;
      int i4 = c(paramv, parama0, i3);
      if (i4 <= this.J) {
        i -= i4;
        if (i < 0)
          break; 
        View view = paramc.a(paramv);
        if (view == null)
          break; 
        this.L[n] = view;
        n++;
        continue;
      } 
      stringBuilder = new StringBuilder();
      stringBuilder.append("Item at position ");
      stringBuilder.append(i3);
      stringBuilder.append(" requires ");
      stringBuilder.append(i4);
      stringBuilder.append(" spans but GridLayoutManager has only ");
      stringBuilder.append(this.J);
      stringBuilder.append(" spans.");
      throw new IllegalArgumentException(stringBuilder.toString());
    } 
    if (n == 0) {
      paramb.b = true;
      return;
    } 
    float f = 0.0F;
    a((RecyclerView.v)stringBuilder, parama0, n, bool);
    int j = 0;
    i = 0;
    while (j < n) {
      View view = this.L[j];
      if (paramc.l == null) {
        if (bool) {
          b(view);
        } else {
          b(view, 0);
        } 
      } else if (bool) {
        a(view);
      } else {
        a(view, 0);
      } 
      a(view, this.P);
      a(view, i2, false);
      int i4 = this.u.b(view);
      int i3 = i;
      if (i4 > i)
        i3 = i4; 
      b b1 = (b)view.getLayoutParams();
      float f2 = this.u.c(view) * 1.0F / b1.f;
      float f1 = f;
      if (f2 > f)
        f1 = f2; 
      j++;
      i = i3;
      f = f1;
    } 
    j = i;
    if (k) {
      a(f, m);
      k = 0;
      i = 0;
      while (true) {
        j = i;
        if (k < n) {
          View view = this.L[k];
          a(view, 1073741824, true);
          m = this.u.b(view);
          j = i;
          if (m > i)
            j = m; 
          k++;
          i = j;
          continue;
        } 
        break;
      } 
    } 
    for (i = 0; i < n; i++) {
      View view = this.L[i];
      if (this.u.b(view) != j) {
        b b1 = (b)view.getLayoutParams();
        Rect rect = b1.b;
        m = rect.top + rect.bottom + b1.topMargin + b1.bottomMargin;
        k = rect.left + rect.right + b1.leftMargin + b1.rightMargin;
        int i3 = f(b1.e, b1.f);
        if (this.s == 1) {
          k = RecyclerView.o.a(i3, 1073741824, k, b1.width, false);
          m = View.MeasureSpec.makeMeasureSpec(j - m, 1073741824);
        } else {
          k = View.MeasureSpec.makeMeasureSpec(j - k, 1073741824);
          m = RecyclerView.o.a(i3, 1073741824, m, b1.height, false);
        } 
        a(view, k, m, true);
      } 
    } 
    int i1 = 0;
    paramb.a = j;
    if (this.s == 1) {
      k = paramc.f;
      i = paramc.b;
      if (k == -1) {
        k = i - j;
        j = i;
        i = k;
      } else {
        j = i + j;
      } 
      k = 0;
      m = 0;
    } else {
      i = paramc.f;
      m = paramc.b;
      if (i == -1) {
        k = m - j;
        i = 0;
        j = 0;
      } else {
        i = 0;
        boolean bool1 = false;
        j = m + j;
        k = m;
        m = j;
        j = bool1;
      } 
    } 
    while (i1 < n) {
      View view = this.L[i1];
      b b1 = (b)view.getLayoutParams();
      if (this.s == 1) {
        if (J()) {
          i2 = o() + this.K[this.J - b1.e];
          int i5 = this.u.c(view);
          k = i2;
          int i4 = i;
          m = j;
          i = i2 - i5;
          j = i4;
        } else {
          i2 = o() + this.K[b1.e];
          int i5 = this.u.c(view);
          k = i2;
          int i4 = i;
          m = j;
          i2 = i5 + i2;
          i = k;
          j = i4;
          k = i2;
        } 
      } else {
        int i4 = q() + this.K[b1.e];
        i2 = this.u.c(view);
        i = k;
        j = i4;
        i4 = i2 + i4;
        k = m;
        m = i4;
      } 
      a(view, i, j, k, m);
      if (b1.c() || b1.b())
        paramb.c = true; 
      paramb.d |= view.hasFocusable();
      int i3 = i1 + 1;
      i1 = k;
      k = i;
      i = j;
      j = m;
      m = i1;
      i1 = i3;
    } 
    Arrays.fill((Object[])this.L, (Object)null);
  }
  
  public void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2) {
    this.O.b();
    this.O.a();
  }
  
  public void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2, int paramInt3) {
    this.O.b();
    this.O.a();
  }
  
  public void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2, Object paramObject) {
    this.O.b();
    this.O.a();
  }
  
  public boolean a(RecyclerView.p paramp) {
    return paramp instanceof b;
  }
  
  public int b(int paramInt, RecyclerView.v paramv, RecyclerView.a0 parama0) {
    Q();
    P();
    return super.b(paramInt, paramv, parama0);
  }
  
  public int b(RecyclerView.a0 parama0) {
    return this.Q ? i(parama0) : super.b(parama0);
  }
  
  public int b(RecyclerView.v paramv, RecyclerView.a0 parama0) {
    return (this.s == 0) ? this.J : ((parama0.a() < 1) ? 0 : (a(paramv, parama0, parama0.a() - 1) + 1));
  }
  
  public void b(RecyclerView paramRecyclerView, int paramInt1, int paramInt2) {
    this.O.b();
    this.O.a();
  }
  
  public void b(boolean paramBoolean) {
    if (!paramBoolean) {
      super.b(false);
      return;
    } 
    throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
  }
  
  public int c(RecyclerView.a0 parama0) {
    return this.Q ? j(parama0) : super.c(parama0);
  }
  
  public RecyclerView.p c() {
    return (this.s == 0) ? new b(-2, -1) : new b(-1, -2);
  }
  
  public void d(RecyclerView paramRecyclerView) {
    this.O.b();
    this.O.a();
  }
  
  public int e(RecyclerView.a0 parama0) {
    return this.Q ? i(parama0) : super.e(parama0);
  }
  
  public void e(RecyclerView.v paramv, RecyclerView.a0 parama0) {
    if (parama0.d())
      N(); 
    super.e(paramv, parama0);
    O();
  }
  
  int f(int paramInt1, int paramInt2) {
    if (this.s == 1 && J()) {
      int[] arrayOfInt1 = this.K;
      int i = this.J;
      return arrayOfInt1[i - paramInt1] - arrayOfInt1[i - paramInt1 - paramInt2];
    } 
    int[] arrayOfInt = this.K;
    return arrayOfInt[paramInt2 + paramInt1] - arrayOfInt[paramInt1];
  }
  
  public int f(RecyclerView.a0 parama0) {
    return this.Q ? j(parama0) : super.f(parama0);
  }
  
  public void g(RecyclerView.a0 parama0) {
    super.g(parama0);
    this.I = false;
  }
  
  public void l(int paramInt) {
    if (paramInt == this.J)
      return; 
    this.I = true;
    if (paramInt >= 1) {
      this.J = paramInt;
      this.O.b();
      z();
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Span count should be at least 1. Provided ");
    stringBuilder.append(paramInt);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public static final class a extends c {
    public int a(int param1Int) {
      return 1;
    }
    
    public int d(int param1Int1, int param1Int2) {
      return param1Int1 % param1Int2;
    }
  }
  
  public static class b extends RecyclerView.p {
    int e = -1;
    
    int f = 0;
    
    public b(int param1Int1, int param1Int2) {
      super(param1Int1, param1Int2);
    }
    
    public b(Context param1Context, AttributeSet param1AttributeSet) {
      super(param1Context, param1AttributeSet);
    }
    
    public b(ViewGroup.LayoutParams param1LayoutParams) {
      super(param1LayoutParams);
    }
    
    public b(ViewGroup.MarginLayoutParams param1MarginLayoutParams) {
      super(param1MarginLayoutParams);
    }
    
    public int e() {
      return this.e;
    }
    
    public int f() {
      return this.f;
    }
  }
  
  public static abstract class c {
    final SparseIntArray a = new SparseIntArray();
    
    final SparseIntArray b = new SparseIntArray();
    
    private boolean c = false;
    
    private boolean d = false;
    
    static int a(SparseIntArray param1SparseIntArray, int param1Int) {
      int j = param1SparseIntArray.size() - 1;
      int i = 0;
      while (i <= j) {
        int k = i + j >>> 1;
        if (param1SparseIntArray.keyAt(k) < param1Int) {
          i = k + 1;
          continue;
        } 
        j = k - 1;
      } 
      param1Int = i - 1;
      return (param1Int >= 0 && param1Int < param1SparseIntArray.size()) ? param1SparseIntArray.keyAt(param1Int) : -1;
    }
    
    public abstract int a(int param1Int);
    
    int a(int param1Int1, int param1Int2) {
      if (!this.d)
        return c(param1Int1, param1Int2); 
      int i = this.b.get(param1Int1, -1);
      if (i != -1)
        return i; 
      param1Int2 = c(param1Int1, param1Int2);
      this.b.put(param1Int1, param1Int2);
      return param1Int2;
    }
    
    public void a() {
      this.b.clear();
    }
    
    int b(int param1Int1, int param1Int2) {
      if (!this.c)
        return d(param1Int1, param1Int2); 
      int i = this.a.get(param1Int1, -1);
      if (i != -1)
        return i; 
      param1Int2 = d(param1Int1, param1Int2);
      this.a.put(param1Int1, param1Int2);
      return param1Int2;
    }
    
    public void b() {
      this.a.clear();
    }
    
    public int c(int param1Int1, int param1Int2) {
      // Byte code:
      //   0: aload_0
      //   1: getfield d : Z
      //   4: ifeq -> 86
      //   7: aload_0
      //   8: getfield b : Landroid/util/SparseIntArray;
      //   11: iload_1
      //   12: invokestatic a : (Landroid/util/SparseIntArray;I)I
      //   15: istore_3
      //   16: iload_3
      //   17: iconst_m1
      //   18: if_icmpeq -> 86
      //   21: aload_0
      //   22: getfield b : Landroid/util/SparseIntArray;
      //   25: iload_3
      //   26: invokevirtual get : (I)I
      //   29: istore #7
      //   31: iload_3
      //   32: iconst_1
      //   33: iadd
      //   34: istore #6
      //   36: aload_0
      //   37: iload_3
      //   38: iload_2
      //   39: invokevirtual b : (II)I
      //   42: istore #4
      //   44: aload_0
      //   45: iload_3
      //   46: invokevirtual a : (I)I
      //   49: iload #4
      //   51: iadd
      //   52: istore #8
      //   54: iload #8
      //   56: istore_3
      //   57: iload #7
      //   59: istore #4
      //   61: iload #6
      //   63: istore #5
      //   65: iload #8
      //   67: iload_2
      //   68: if_icmpne -> 94
      //   71: iload #7
      //   73: iconst_1
      //   74: iadd
      //   75: istore #4
      //   77: iconst_0
      //   78: istore_3
      //   79: iload #6
      //   81: istore #5
      //   83: goto -> 94
      //   86: iconst_0
      //   87: istore_3
      //   88: iconst_0
      //   89: istore #4
      //   91: iconst_0
      //   92: istore #5
      //   94: aload_0
      //   95: iload_1
      //   96: invokevirtual a : (I)I
      //   99: istore #9
      //   101: iload #5
      //   103: istore #6
      //   105: iload #6
      //   107: iload_1
      //   108: if_icmpge -> 177
      //   111: aload_0
      //   112: iload #6
      //   114: invokevirtual a : (I)I
      //   117: istore #7
      //   119: iload_3
      //   120: iload #7
      //   122: iadd
      //   123: istore #8
      //   125: iload #8
      //   127: iload_2
      //   128: if_icmpne -> 142
      //   131: iload #4
      //   133: iconst_1
      //   134: iadd
      //   135: istore #5
      //   137: iconst_0
      //   138: istore_3
      //   139: goto -> 164
      //   142: iload #8
      //   144: istore_3
      //   145: iload #4
      //   147: istore #5
      //   149: iload #8
      //   151: iload_2
      //   152: if_icmple -> 164
      //   155: iload #4
      //   157: iconst_1
      //   158: iadd
      //   159: istore #5
      //   161: iload #7
      //   163: istore_3
      //   164: iload #6
      //   166: iconst_1
      //   167: iadd
      //   168: istore #6
      //   170: iload #5
      //   172: istore #4
      //   174: goto -> 105
      //   177: iload #4
      //   179: istore_1
      //   180: iload_3
      //   181: iload #9
      //   183: iadd
      //   184: iload_2
      //   185: if_icmple -> 193
      //   188: iload #4
      //   190: iconst_1
      //   191: iadd
      //   192: istore_1
      //   193: iload_1
      //   194: ireturn
    }
    
    public abstract int d(int param1Int1, int param1Int2);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/recyclerview/widget/GridLayoutManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */