package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

public class StaggeredGridLayoutManager extends RecyclerView.o implements RecyclerView.z.b {
  boolean A = false;
  
  private BitSet B;
  
  int C = -1;
  
  int D = Integer.MIN_VALUE;
  
  d E = new d();
  
  private int F = 2;
  
  private boolean G;
  
  private boolean H;
  
  private e I;
  
  private int J;
  
  private final Rect K = new Rect();
  
  private final b L = new b(this);
  
  private boolean M = false;
  
  private boolean N = true;
  
  private int[] O;
  
  private final Runnable P = new a(this);
  
  private int s = -1;
  
  f[] t;
  
  k u;
  
  k v;
  
  private int w;
  
  private int x;
  
  private final g y;
  
  boolean z = false;
  
  public StaggeredGridLayoutManager(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2) {
    RecyclerView.o.d d1 = RecyclerView.o.a(paramContext, paramAttributeSet, paramInt1, paramInt2);
    j(d1.a);
    k(d1.b);
    c(d1.c);
    this.y = new g();
    N();
  }
  
  private void N() {
    this.u = k.a(this, this.w);
    this.v = k.a(this, 1 - this.w);
  }
  
  private void O() {
    if (this.v.d() == 1073741824)
      return; 
    int n = e();
    int j = 0;
    int i = 0;
    float f1 = 0.0F;
    while (i < n) {
      View view = d(i);
      float f2 = this.v.b(view);
      if (f2 >= f1) {
        float f3 = f2;
        if (((c)view.getLayoutParams()).f())
          f3 = f2 * 1.0F / this.s; 
        f1 = Math.max(f1, f3);
      } 
      i++;
    } 
    int i1 = this.x;
    int m = Math.round(f1 * this.s);
    i = m;
    if (this.v.d() == Integer.MIN_VALUE)
      i = Math.min(m, this.v.g()); 
    l(i);
    i = j;
    if (this.x == i1)
      return; 
    while (i < n) {
      View view = d(i);
      c c = (c)view.getLayoutParams();
      if (!c.f)
        if (M() && this.w == 1) {
          j = this.s;
          m = c.e.e;
          view.offsetLeftAndRight(-(j - 1 - m) * this.x - -(j - 1 - m) * i1);
        } else {
          m = c.e.e;
          int i2 = this.x;
          j = this.w;
          m = i2 * m - m * i1;
          if (j == 1) {
            view.offsetLeftAndRight(m);
          } else {
            view.offsetTopAndBottom(m);
          } 
        }  
      i++;
    } 
  }
  
  private void P() {
    int i;
    if (this.w == 1 || !M()) {
      boolean bool = this.z;
    } else {
      i = this.z ^ true;
    } 
    this.A = i;
  }
  
  private int a(RecyclerView.v paramv, g paramg, RecyclerView.a0 parama0) {
    // Byte code:
    //   0: aload_0
    //   1: getfield B : Ljava/util/BitSet;
    //   4: iconst_0
    //   5: aload_0
    //   6: getfield s : I
    //   9: iconst_1
    //   10: invokevirtual set : (IIZ)V
    //   13: aload_0
    //   14: getfield y : Landroidx/recyclerview/widget/g;
    //   17: getfield i : Z
    //   20: ifeq -> 45
    //   23: aload_2
    //   24: getfield e : I
    //   27: iconst_1
    //   28: if_icmpne -> 38
    //   31: ldc 2147483647
    //   33: istore #8
    //   35: goto -> 82
    //   38: ldc -2147483648
    //   40: istore #8
    //   42: goto -> 82
    //   45: aload_2
    //   46: getfield e : I
    //   49: iconst_1
    //   50: if_icmpne -> 67
    //   53: aload_2
    //   54: getfield g : I
    //   57: aload_2
    //   58: getfield b : I
    //   61: iadd
    //   62: istore #4
    //   64: goto -> 78
    //   67: aload_2
    //   68: getfield f : I
    //   71: aload_2
    //   72: getfield b : I
    //   75: isub
    //   76: istore #4
    //   78: iload #4
    //   80: istore #8
    //   82: aload_0
    //   83: aload_2
    //   84: getfield e : I
    //   87: iload #8
    //   89: invokespecial e : (II)V
    //   92: aload_0
    //   93: getfield A : Z
    //   96: ifeq -> 111
    //   99: aload_0
    //   100: getfield u : Landroidx/recyclerview/widget/k;
    //   103: invokevirtual b : ()I
    //   106: istore #9
    //   108: goto -> 120
    //   111: aload_0
    //   112: getfield u : Landroidx/recyclerview/widget/k;
    //   115: invokevirtual f : ()I
    //   118: istore #9
    //   120: iconst_0
    //   121: istore #4
    //   123: aload_2
    //   124: aload_3
    //   125: invokevirtual a : (Landroidx/recyclerview/widget/RecyclerView$a0;)Z
    //   128: ifeq -> 889
    //   131: aload_0
    //   132: getfield y : Landroidx/recyclerview/widget/g;
    //   135: getfield i : Z
    //   138: ifne -> 151
    //   141: aload_0
    //   142: getfield B : Ljava/util/BitSet;
    //   145: invokevirtual isEmpty : ()Z
    //   148: ifne -> 889
    //   151: aload_2
    //   152: aload_1
    //   153: invokevirtual a : (Landroidx/recyclerview/widget/RecyclerView$v;)Landroid/view/View;
    //   156: astore #13
    //   158: aload #13
    //   160: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   163: checkcast androidx/recyclerview/widget/StaggeredGridLayoutManager$c
    //   166: astore #14
    //   168: aload #14
    //   170: invokevirtual a : ()I
    //   173: istore #10
    //   175: aload_0
    //   176: getfield E : Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d;
    //   179: iload #10
    //   181: invokevirtual d : (I)I
    //   184: istore #4
    //   186: iload #4
    //   188: iconst_m1
    //   189: if_icmpne -> 198
    //   192: iconst_1
    //   193: istore #6
    //   195: goto -> 201
    //   198: iconst_0
    //   199: istore #6
    //   201: iload #6
    //   203: ifeq -> 246
    //   206: aload #14
    //   208: getfield f : Z
    //   211: ifeq -> 225
    //   214: aload_0
    //   215: getfield t : [Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;
    //   218: iconst_0
    //   219: aaload
    //   220: astore #12
    //   222: goto -> 232
    //   225: aload_0
    //   226: aload_2
    //   227: invokespecial a : (Landroidx/recyclerview/widget/g;)Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;
    //   230: astore #12
    //   232: aload_0
    //   233: getfield E : Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d;
    //   236: iload #10
    //   238: aload #12
    //   240: invokevirtual a : (ILandroidx/recyclerview/widget/StaggeredGridLayoutManager$f;)V
    //   243: goto -> 255
    //   246: aload_0
    //   247: getfield t : [Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;
    //   250: iload #4
    //   252: aaload
    //   253: astore #12
    //   255: aload #14
    //   257: aload #12
    //   259: putfield e : Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;
    //   262: aload_2
    //   263: getfield e : I
    //   266: iconst_1
    //   267: if_icmpne -> 279
    //   270: aload_0
    //   271: aload #13
    //   273: invokevirtual b : (Landroid/view/View;)V
    //   276: goto -> 286
    //   279: aload_0
    //   280: aload #13
    //   282: iconst_0
    //   283: invokevirtual b : (Landroid/view/View;I)V
    //   286: aload_0
    //   287: aload #13
    //   289: aload #14
    //   291: iconst_0
    //   292: invokespecial a : (Landroid/view/View;Landroidx/recyclerview/widget/StaggeredGridLayoutManager$c;Z)V
    //   295: aload_2
    //   296: getfield e : I
    //   299: iconst_1
    //   300: if_icmpne -> 403
    //   303: aload #14
    //   305: getfield f : Z
    //   308: ifeq -> 322
    //   311: aload_0
    //   312: iload #9
    //   314: invokespecial s : (I)I
    //   317: istore #4
    //   319: goto -> 331
    //   322: aload #12
    //   324: iload #9
    //   326: invokevirtual a : (I)I
    //   329: istore #4
    //   331: aload_0
    //   332: getfield u : Landroidx/recyclerview/widget/k;
    //   335: aload #13
    //   337: invokevirtual b : (Landroid/view/View;)I
    //   340: istore #5
    //   342: iload #6
    //   344: ifeq -> 385
    //   347: aload #14
    //   349: getfield f : Z
    //   352: ifeq -> 385
    //   355: aload_0
    //   356: iload #4
    //   358: invokespecial o : (I)Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d$a;
    //   361: astore #15
    //   363: aload #15
    //   365: iconst_m1
    //   366: putfield d : I
    //   369: aload #15
    //   371: iload #10
    //   373: putfield c : I
    //   376: aload_0
    //   377: getfield E : Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d;
    //   380: aload #15
    //   382: invokevirtual a : (Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d$a;)V
    //   385: iload #5
    //   387: iload #4
    //   389: iadd
    //   390: istore #7
    //   392: iload #4
    //   394: istore #5
    //   396: iload #7
    //   398: istore #4
    //   400: goto -> 488
    //   403: aload #14
    //   405: getfield f : Z
    //   408: ifeq -> 422
    //   411: aload_0
    //   412: iload #9
    //   414: invokespecial v : (I)I
    //   417: istore #4
    //   419: goto -> 431
    //   422: aload #12
    //   424: iload #9
    //   426: invokevirtual b : (I)I
    //   429: istore #4
    //   431: iload #4
    //   433: aload_0
    //   434: getfield u : Landroidx/recyclerview/widget/k;
    //   437: aload #13
    //   439: invokevirtual b : (Landroid/view/View;)I
    //   442: isub
    //   443: istore #5
    //   445: iload #6
    //   447: ifeq -> 488
    //   450: aload #14
    //   452: getfield f : Z
    //   455: ifeq -> 488
    //   458: aload_0
    //   459: iload #4
    //   461: invokespecial p : (I)Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d$a;
    //   464: astore #15
    //   466: aload #15
    //   468: iconst_1
    //   469: putfield d : I
    //   472: aload #15
    //   474: iload #10
    //   476: putfield c : I
    //   479: aload_0
    //   480: getfield E : Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d;
    //   483: aload #15
    //   485: invokevirtual a : (Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d$a;)V
    //   488: aload #14
    //   490: getfield f : Z
    //   493: ifeq -> 572
    //   496: aload_2
    //   497: getfield d : I
    //   500: iconst_m1
    //   501: if_icmpne -> 572
    //   504: iload #6
    //   506: ifeq -> 517
    //   509: aload_0
    //   510: iconst_1
    //   511: putfield M : Z
    //   514: goto -> 572
    //   517: aload_2
    //   518: getfield e : I
    //   521: iconst_1
    //   522: if_icmpne -> 534
    //   525: aload_0
    //   526: invokevirtual E : ()Z
    //   529: istore #11
    //   531: goto -> 540
    //   534: aload_0
    //   535: invokevirtual F : ()Z
    //   538: istore #11
    //   540: iload #11
    //   542: iconst_1
    //   543: ixor
    //   544: ifeq -> 572
    //   547: aload_0
    //   548: getfield E : Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d;
    //   551: iload #10
    //   553: invokevirtual c : (I)Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d$a;
    //   556: astore #15
    //   558: aload #15
    //   560: ifnull -> 509
    //   563: aload #15
    //   565: iconst_1
    //   566: putfield f : Z
    //   569: goto -> 509
    //   572: aload_0
    //   573: aload #13
    //   575: aload #14
    //   577: aload_2
    //   578: invokespecial a : (Landroid/view/View;Landroidx/recyclerview/widget/StaggeredGridLayoutManager$c;Landroidx/recyclerview/widget/g;)V
    //   581: aload_0
    //   582: invokevirtual M : ()Z
    //   585: ifeq -> 668
    //   588: aload_0
    //   589: getfield w : I
    //   592: iconst_1
    //   593: if_icmpne -> 668
    //   596: aload #14
    //   598: getfield f : Z
    //   601: ifeq -> 616
    //   604: aload_0
    //   605: getfield v : Landroidx/recyclerview/widget/k;
    //   608: invokevirtual b : ()I
    //   611: istore #6
    //   613: goto -> 643
    //   616: aload_0
    //   617: getfield v : Landroidx/recyclerview/widget/k;
    //   620: invokevirtual b : ()I
    //   623: aload_0
    //   624: getfield s : I
    //   627: iconst_1
    //   628: isub
    //   629: aload #12
    //   631: getfield e : I
    //   634: isub
    //   635: aload_0
    //   636: getfield x : I
    //   639: imul
    //   640: isub
    //   641: istore #6
    //   643: aload_0
    //   644: getfield v : Landroidx/recyclerview/widget/k;
    //   647: aload #13
    //   649: invokevirtual b : (Landroid/view/View;)I
    //   652: istore #10
    //   654: iload #6
    //   656: istore #7
    //   658: iload #6
    //   660: iload #10
    //   662: isub
    //   663: istore #6
    //   665: goto -> 734
    //   668: aload #14
    //   670: getfield f : Z
    //   673: ifeq -> 688
    //   676: aload_0
    //   677: getfield v : Landroidx/recyclerview/widget/k;
    //   680: invokevirtual f : ()I
    //   683: istore #6
    //   685: goto -> 708
    //   688: aload #12
    //   690: getfield e : I
    //   693: aload_0
    //   694: getfield x : I
    //   697: imul
    //   698: aload_0
    //   699: getfield v : Landroidx/recyclerview/widget/k;
    //   702: invokevirtual f : ()I
    //   705: iadd
    //   706: istore #6
    //   708: aload_0
    //   709: getfield v : Landroidx/recyclerview/widget/k;
    //   712: aload #13
    //   714: invokevirtual b : (Landroid/view/View;)I
    //   717: istore #7
    //   719: iload #6
    //   721: istore #10
    //   723: iload #7
    //   725: iload #6
    //   727: iadd
    //   728: istore #7
    //   730: iload #10
    //   732: istore #6
    //   734: aload_0
    //   735: getfield w : I
    //   738: iconst_1
    //   739: if_icmpne -> 757
    //   742: iload #5
    //   744: istore #10
    //   746: iload #6
    //   748: istore #5
    //   750: iload #10
    //   752: istore #6
    //   754: goto -> 769
    //   757: iload #4
    //   759: istore #10
    //   761: iload #7
    //   763: istore #4
    //   765: iload #10
    //   767: istore #7
    //   769: aload_0
    //   770: aload #13
    //   772: iload #5
    //   774: iload #6
    //   776: iload #7
    //   778: iload #4
    //   780: invokevirtual a : (Landroid/view/View;IIII)V
    //   783: aload #14
    //   785: getfield f : Z
    //   788: ifeq -> 807
    //   791: aload_0
    //   792: aload_0
    //   793: getfield y : Landroidx/recyclerview/widget/g;
    //   796: getfield e : I
    //   799: iload #8
    //   801: invokespecial e : (II)V
    //   804: goto -> 822
    //   807: aload_0
    //   808: aload #12
    //   810: aload_0
    //   811: getfield y : Landroidx/recyclerview/widget/g;
    //   814: getfield e : I
    //   817: iload #8
    //   819: invokespecial a : (Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;II)V
    //   822: aload_0
    //   823: aload_1
    //   824: aload_0
    //   825: getfield y : Landroidx/recyclerview/widget/g;
    //   828: invokespecial a : (Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/g;)V
    //   831: aload_0
    //   832: getfield y : Landroidx/recyclerview/widget/g;
    //   835: getfield h : Z
    //   838: ifeq -> 883
    //   841: aload #13
    //   843: invokevirtual hasFocusable : ()Z
    //   846: ifeq -> 883
    //   849: aload #14
    //   851: getfield f : Z
    //   854: ifeq -> 867
    //   857: aload_0
    //   858: getfield B : Ljava/util/BitSet;
    //   861: invokevirtual clear : ()V
    //   864: goto -> 883
    //   867: aload_0
    //   868: getfield B : Ljava/util/BitSet;
    //   871: aload #12
    //   873: getfield e : I
    //   876: iconst_0
    //   877: invokevirtual set : (IZ)V
    //   880: goto -> 883
    //   883: iconst_1
    //   884: istore #4
    //   886: goto -> 123
    //   889: iconst_0
    //   890: istore #5
    //   892: iload #4
    //   894: ifne -> 906
    //   897: aload_0
    //   898: aload_1
    //   899: aload_0
    //   900: getfield y : Landroidx/recyclerview/widget/g;
    //   903: invokespecial a : (Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/g;)V
    //   906: aload_0
    //   907: getfield y : Landroidx/recyclerview/widget/g;
    //   910: getfield e : I
    //   913: iconst_m1
    //   914: if_icmpne -> 945
    //   917: aload_0
    //   918: aload_0
    //   919: getfield u : Landroidx/recyclerview/widget/k;
    //   922: invokevirtual f : ()I
    //   925: invokespecial v : (I)I
    //   928: istore #4
    //   930: aload_0
    //   931: getfield u : Landroidx/recyclerview/widget/k;
    //   934: invokevirtual f : ()I
    //   937: iload #4
    //   939: isub
    //   940: istore #4
    //   942: goto -> 966
    //   945: aload_0
    //   946: aload_0
    //   947: getfield u : Landroidx/recyclerview/widget/k;
    //   950: invokevirtual b : ()I
    //   953: invokespecial s : (I)I
    //   956: aload_0
    //   957: getfield u : Landroidx/recyclerview/widget/k;
    //   960: invokevirtual b : ()I
    //   963: isub
    //   964: istore #4
    //   966: iload #4
    //   968: ifle -> 982
    //   971: aload_2
    //   972: getfield b : I
    //   975: iload #4
    //   977: invokestatic min : (II)I
    //   980: istore #5
    //   982: iload #5
    //   984: ireturn
  }
  
  private f a(g paramg) {
    int i;
    byte b1;
    boolean bool = w(paramg.e);
    int j = -1;
    if (bool) {
      i = this.s - 1;
      b1 = -1;
    } else {
      i = 0;
      j = this.s;
      b1 = 1;
    } 
    int m = paramg.e;
    f f2 = null;
    paramg = null;
    if (m == 1) {
      f f3;
      m = Integer.MAX_VALUE;
      int i1 = this.u.f();
      while (i != j) {
        f2 = this.t[i];
        int i3 = f2.a(i1);
        int i2 = m;
        if (i3 < m) {
          f3 = f2;
          i2 = i3;
        } 
        i += b1;
        m = i2;
      } 
      return f3;
    } 
    m = Integer.MIN_VALUE;
    int n = this.u.b();
    f f1 = f2;
    while (i != j) {
      f2 = this.t[i];
      int i2 = f2.b(n);
      int i1 = m;
      if (i2 > m) {
        f1 = f2;
        i1 = i2;
      } 
      i += b1;
      m = i1;
    } 
    return f1;
  }
  
  private void a(View paramView, int paramInt1, int paramInt2, boolean paramBoolean) {
    a(paramView, this.K);
    c c = (c)paramView.getLayoutParams();
    int i = c.leftMargin;
    Rect rect = this.K;
    paramInt1 = c(paramInt1, i + rect.left, c.rightMargin + rect.right);
    i = c.topMargin;
    rect = this.K;
    paramInt2 = c(paramInt2, i + rect.top, c.bottomMargin + rect.bottom);
    if (paramBoolean) {
      paramBoolean = b(paramView, paramInt1, paramInt2, c);
    } else {
      paramBoolean = a(paramView, paramInt1, paramInt2, c);
    } 
    if (paramBoolean)
      paramView.measure(paramInt1, paramInt2); 
  }
  
  private void a(View paramView, c paramc, g paramg) {
    if (paramg.e == 1) {
      if (paramc.f) {
        p(paramView);
        return;
      } 
      paramc.e.a(paramView);
      return;
    } 
    if (paramc.f) {
      q(paramView);
      return;
    } 
    paramc.e.c(paramView);
  }
  
  private void a(View paramView, c paramc, boolean paramBoolean) {
    int i;
    if (paramc.f) {
      if (this.w == 1) {
        i = this.J;
      } else {
        a(paramView, RecyclerView.o.a(r(), s(), o() + p(), paramc.width, true), this.J, paramBoolean);
        return;
      } 
    } else if (this.w == 1) {
      i = RecyclerView.o.a(this.x, s(), 0, paramc.width, false);
    } else {
      i = RecyclerView.o.a(r(), s(), o() + p(), paramc.width, true);
      int m = RecyclerView.o.a(this.x, i(), 0, paramc.height, false);
      a(paramView, i, m, paramBoolean);
    } 
    int j = RecyclerView.o.a(h(), i(), q() + n(), paramc.height, true);
    a(paramView, i, j, paramBoolean);
  }
  
  private void a(RecyclerView.v paramv, int paramInt) {
    int i = e() - 1;
    while (i >= 0) {
      View view = d(i);
      if (this.u.d(view) >= paramInt && this.u.f(view) >= paramInt) {
        c c = (c)view.getLayoutParams();
        if (c.f) {
          int m;
          byte b1 = 0;
          int j = 0;
          while (true) {
            m = b1;
            if (j < this.s) {
              if ((this.t[j]).a.size() == 1)
                return; 
              j++;
              continue;
            } 
            break;
          } 
          while (m < this.s) {
            this.t[m].j();
            m++;
          } 
        } else {
          if (c.e.a.size() == 1)
            return; 
          c.e.j();
        } 
        a(view, paramv);
        i--;
      } 
    } 
  }
  
  private void a(RecyclerView.v paramv, RecyclerView.a0 parama0, boolean paramBoolean) {
    int i = s(-2147483648);
    if (i == Integer.MIN_VALUE)
      return; 
    i = this.u.b() - i;
    if (i > 0) {
      i -= -c(-i, paramv, parama0);
      if (paramBoolean && i > 0)
        this.u.a(i); 
    } 
  }
  
  private void a(RecyclerView.v paramv, g paramg) {
    // Byte code:
    //   0: aload_2
    //   1: getfield a : Z
    //   4: ifeq -> 141
    //   7: aload_2
    //   8: getfield i : Z
    //   11: ifeq -> 15
    //   14: return
    //   15: aload_2
    //   16: getfield b : I
    //   19: ifne -> 54
    //   22: aload_2
    //   23: getfield e : I
    //   26: iconst_m1
    //   27: if_icmpne -> 42
    //   30: aload_2
    //   31: getfield g : I
    //   34: istore_3
    //   35: aload_0
    //   36: aload_1
    //   37: iload_3
    //   38: invokespecial a : (Landroidx/recyclerview/widget/RecyclerView$v;I)V
    //   41: return
    //   42: aload_2
    //   43: getfield f : I
    //   46: istore_3
    //   47: aload_0
    //   48: aload_1
    //   49: iload_3
    //   50: invokespecial b : (Landroidx/recyclerview/widget/RecyclerView$v;I)V
    //   53: return
    //   54: aload_2
    //   55: getfield e : I
    //   58: iconst_m1
    //   59: if_icmpne -> 99
    //   62: aload_2
    //   63: getfield f : I
    //   66: istore_3
    //   67: iload_3
    //   68: aload_0
    //   69: iload_3
    //   70: invokespecial t : (I)I
    //   73: isub
    //   74: istore_3
    //   75: iload_3
    //   76: ifge -> 82
    //   79: goto -> 30
    //   82: aload_2
    //   83: getfield g : I
    //   86: iload_3
    //   87: aload_2
    //   88: getfield b : I
    //   91: invokestatic min : (II)I
    //   94: isub
    //   95: istore_3
    //   96: goto -> 35
    //   99: aload_0
    //   100: aload_2
    //   101: getfield g : I
    //   104: invokespecial u : (I)I
    //   107: aload_2
    //   108: getfield g : I
    //   111: isub
    //   112: istore_3
    //   113: iload_3
    //   114: ifge -> 120
    //   117: goto -> 42
    //   120: aload_2
    //   121: getfield f : I
    //   124: istore #4
    //   126: iload_3
    //   127: aload_2
    //   128: getfield b : I
    //   131: invokestatic min : (II)I
    //   134: iload #4
    //   136: iadd
    //   137: istore_3
    //   138: goto -> 47
    //   141: return
  }
  
  private void a(b paramb) {
    boolean bool;
    e e2 = this.I;
    int i = e2.e;
    if (i > 0)
      if (i == this.s) {
        for (i = 0; i < this.s; i++) {
          this.t[i].c();
          e2 = this.I;
          int m = e2.f[i];
          int j = m;
          if (m != Integer.MIN_VALUE) {
            if (e2.k) {
              j = this.u.b();
            } else {
              j = this.u.f();
            } 
            j = m + j;
          } 
          this.t[i].d(j);
        } 
      } else {
        e2.f();
        e2 = this.I;
        e2.c = e2.d;
      }  
    e2 = this.I;
    this.H = e2.l;
    c(e2.j);
    P();
    e2 = this.I;
    i = e2.c;
    if (i != -1) {
      this.C = i;
      bool = e2.k;
    } else {
      bool = this.A;
    } 
    paramb.c = bool;
    e e1 = this.I;
    if (e1.g > 1) {
      d d1 = this.E;
      d1.a = e1.h;
      d1.b = e1.i;
    } 
  }
  
  private void a(f paramf, int paramInt1, int paramInt2) {
    int i = paramf.f();
    if ((paramInt1 == -1) ? (paramf.h() + i <= paramInt2) : (paramf.g() - i >= paramInt2))
      this.B.set(paramf.e, false); 
  }
  
  private boolean a(f paramf) {
    if (this.A) {
      if (paramf.g() < this.u.b()) {
        ArrayList<View> arrayList = paramf.a;
        return (paramf.b((View)arrayList.get(arrayList.size() - 1))).f ^ true;
      } 
    } else if (paramf.h() > this.u.f()) {
      return (paramf.b((View)paramf.a.get(0))).f ^ true;
    } 
    return false;
  }
  
  private void b(int paramInt1, int paramInt2, int paramInt3) {
    if (this.A) {
      int m = J();
    } else {
      int m = I();
    } 
    if (paramInt3 == 8) {
      if (paramInt1 < paramInt2) {
        i = paramInt2 + 1;
      } else {
        int m = paramInt1 + 1;
        i = paramInt2;
        this.E.e(i);
      } 
    } else {
      i = paramInt1 + paramInt2;
    } 
    int j = i;
    int i = paramInt1;
    this.E.e(i);
  }
  
  private void b(int paramInt, RecyclerView.a0 parama0) {
    // Byte code:
    //   0: aload_0
    //   1: getfield y : Landroidx/recyclerview/widget/g;
    //   4: astore #7
    //   6: iconst_0
    //   7: istore #5
    //   9: aload #7
    //   11: iconst_0
    //   12: putfield b : I
    //   15: aload #7
    //   17: iload_1
    //   18: putfield c : I
    //   21: aload_0
    //   22: invokevirtual x : ()Z
    //   25: ifeq -> 89
    //   28: aload_2
    //   29: invokevirtual b : ()I
    //   32: istore_3
    //   33: iload_3
    //   34: iconst_m1
    //   35: if_icmpeq -> 89
    //   38: aload_0
    //   39: getfield A : Z
    //   42: istore #6
    //   44: iload_3
    //   45: iload_1
    //   46: if_icmpge -> 55
    //   49: iconst_1
    //   50: istore #4
    //   52: goto -> 58
    //   55: iconst_0
    //   56: istore #4
    //   58: iload #6
    //   60: iload #4
    //   62: if_icmpne -> 76
    //   65: aload_0
    //   66: getfield u : Landroidx/recyclerview/widget/k;
    //   69: invokevirtual g : ()I
    //   72: istore_1
    //   73: goto -> 91
    //   76: aload_0
    //   77: getfield u : Landroidx/recyclerview/widget/k;
    //   80: invokevirtual g : ()I
    //   83: istore_3
    //   84: iconst_0
    //   85: istore_1
    //   86: goto -> 93
    //   89: iconst_0
    //   90: istore_1
    //   91: iconst_0
    //   92: istore_3
    //   93: aload_0
    //   94: invokevirtual f : ()Z
    //   97: ifeq -> 135
    //   100: aload_0
    //   101: getfield y : Landroidx/recyclerview/widget/g;
    //   104: aload_0
    //   105: getfield u : Landroidx/recyclerview/widget/k;
    //   108: invokevirtual f : ()I
    //   111: iload_3
    //   112: isub
    //   113: putfield f : I
    //   116: aload_0
    //   117: getfield y : Landroidx/recyclerview/widget/g;
    //   120: aload_0
    //   121: getfield u : Landroidx/recyclerview/widget/k;
    //   124: invokevirtual b : ()I
    //   127: iload_1
    //   128: iadd
    //   129: putfield g : I
    //   132: goto -> 160
    //   135: aload_0
    //   136: getfield y : Landroidx/recyclerview/widget/g;
    //   139: aload_0
    //   140: getfield u : Landroidx/recyclerview/widget/k;
    //   143: invokevirtual a : ()I
    //   146: iload_1
    //   147: iadd
    //   148: putfield g : I
    //   151: aload_0
    //   152: getfield y : Landroidx/recyclerview/widget/g;
    //   155: iload_3
    //   156: ineg
    //   157: putfield f : I
    //   160: aload_0
    //   161: getfield y : Landroidx/recyclerview/widget/g;
    //   164: astore_2
    //   165: aload_2
    //   166: iconst_0
    //   167: putfield h : Z
    //   170: aload_2
    //   171: iconst_1
    //   172: putfield a : Z
    //   175: iload #5
    //   177: istore #4
    //   179: aload_0
    //   180: getfield u : Landroidx/recyclerview/widget/k;
    //   183: invokevirtual d : ()I
    //   186: ifne -> 206
    //   189: iload #5
    //   191: istore #4
    //   193: aload_0
    //   194: getfield u : Landroidx/recyclerview/widget/k;
    //   197: invokevirtual a : ()I
    //   200: ifne -> 206
    //   203: iconst_1
    //   204: istore #4
    //   206: aload_2
    //   207: iload #4
    //   209: putfield i : Z
    //   212: return
  }
  
  private void b(RecyclerView.v paramv, int paramInt) {
    while (e() > 0) {
      byte b1 = 0;
      View view = d(0);
      if (this.u.a(view) <= paramInt && this.u.e(view) <= paramInt) {
        c c = (c)view.getLayoutParams();
        if (c.f) {
          int j;
          int i = 0;
          while (true) {
            j = b1;
            if (i < this.s) {
              if ((this.t[i]).a.size() == 1)
                return; 
              i++;
              continue;
            } 
            break;
          } 
          while (j < this.s) {
            this.t[j].k();
            j++;
          } 
        } else {
          if (c.e.a.size() == 1)
            return; 
          c.e.k();
        } 
        a(view, paramv);
      } 
    } 
  }
  
  private void b(RecyclerView.v paramv, RecyclerView.a0 parama0, boolean paramBoolean) {
    int i = v(2147483647);
    if (i == Integer.MAX_VALUE)
      return; 
    i -= this.u.f();
    if (i > 0) {
      i -= c(i, paramv, parama0);
      if (paramBoolean && i > 0)
        this.u.a(-i); 
    } 
  }
  
  private int c(int paramInt1, int paramInt2, int paramInt3) {
    if (paramInt2 == 0 && paramInt3 == 0)
      return paramInt1; 
    int i = View.MeasureSpec.getMode(paramInt1);
    return (i == Integer.MIN_VALUE || i == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, View.MeasureSpec.getSize(paramInt1) - paramInt2 - paramInt3), i) : paramInt1;
  }
  
  private void c(RecyclerView.v paramv, RecyclerView.a0 parama0, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: getfield L : Landroidx/recyclerview/widget/StaggeredGridLayoutManager$b;
    //   4: astore #8
    //   6: aload_0
    //   7: getfield I : Landroidx/recyclerview/widget/StaggeredGridLayoutManager$e;
    //   10: ifnonnull -> 21
    //   13: aload_0
    //   14: getfield C : I
    //   17: iconst_m1
    //   18: if_icmpeq -> 39
    //   21: aload_2
    //   22: invokevirtual a : ()I
    //   25: ifne -> 39
    //   28: aload_0
    //   29: aload_1
    //   30: invokevirtual b : (Landroidx/recyclerview/widget/RecyclerView$v;)V
    //   33: aload #8
    //   35: invokevirtual b : ()V
    //   38: return
    //   39: aload #8
    //   41: getfield e : Z
    //   44: istore #7
    //   46: iconst_1
    //   47: istore #5
    //   49: iload #7
    //   51: ifeq -> 78
    //   54: aload_0
    //   55: getfield C : I
    //   58: iconst_m1
    //   59: if_icmpne -> 78
    //   62: aload_0
    //   63: getfield I : Landroidx/recyclerview/widget/StaggeredGridLayoutManager$e;
    //   66: ifnull -> 72
    //   69: goto -> 78
    //   72: iconst_0
    //   73: istore #4
    //   75: goto -> 81
    //   78: iconst_1
    //   79: istore #4
    //   81: iload #4
    //   83: ifeq -> 133
    //   86: aload #8
    //   88: invokevirtual b : ()V
    //   91: aload_0
    //   92: getfield I : Landroidx/recyclerview/widget/StaggeredGridLayoutManager$e;
    //   95: ifnull -> 107
    //   98: aload_0
    //   99: aload #8
    //   101: invokespecial a : (Landroidx/recyclerview/widget/StaggeredGridLayoutManager$b;)V
    //   104: goto -> 120
    //   107: aload_0
    //   108: invokespecial P : ()V
    //   111: aload #8
    //   113: aload_0
    //   114: getfield A : Z
    //   117: putfield c : Z
    //   120: aload_0
    //   121: aload_2
    //   122: aload #8
    //   124: invokevirtual b : (Landroidx/recyclerview/widget/RecyclerView$a0;Landroidx/recyclerview/widget/StaggeredGridLayoutManager$b;)V
    //   127: aload #8
    //   129: iconst_1
    //   130: putfield e : Z
    //   133: aload_0
    //   134: getfield I : Landroidx/recyclerview/widget/StaggeredGridLayoutManager$e;
    //   137: ifnonnull -> 184
    //   140: aload_0
    //   141: getfield C : I
    //   144: iconst_m1
    //   145: if_icmpne -> 184
    //   148: aload #8
    //   150: getfield c : Z
    //   153: aload_0
    //   154: getfield G : Z
    //   157: if_icmpne -> 171
    //   160: aload_0
    //   161: invokevirtual M : ()Z
    //   164: aload_0
    //   165: getfield H : Z
    //   168: if_icmpeq -> 184
    //   171: aload_0
    //   172: getfield E : Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d;
    //   175: invokevirtual a : ()V
    //   178: aload #8
    //   180: iconst_1
    //   181: putfield d : Z
    //   184: aload_0
    //   185: invokevirtual e : ()I
    //   188: ifle -> 395
    //   191: aload_0
    //   192: getfield I : Landroidx/recyclerview/widget/StaggeredGridLayoutManager$e;
    //   195: astore #9
    //   197: aload #9
    //   199: ifnull -> 211
    //   202: aload #9
    //   204: getfield e : I
    //   207: iconst_1
    //   208: if_icmpge -> 395
    //   211: aload #8
    //   213: getfield d : Z
    //   216: ifeq -> 276
    //   219: iconst_0
    //   220: istore #4
    //   222: iload #4
    //   224: aload_0
    //   225: getfield s : I
    //   228: if_icmpge -> 395
    //   231: aload_0
    //   232: getfield t : [Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;
    //   235: iload #4
    //   237: aaload
    //   238: invokevirtual c : ()V
    //   241: aload #8
    //   243: getfield b : I
    //   246: istore #6
    //   248: iload #6
    //   250: ldc -2147483648
    //   252: if_icmpeq -> 267
    //   255: aload_0
    //   256: getfield t : [Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;
    //   259: iload #4
    //   261: aaload
    //   262: iload #6
    //   264: invokevirtual d : (I)V
    //   267: iload #4
    //   269: iconst_1
    //   270: iadd
    //   271: istore #4
    //   273: goto -> 222
    //   276: iload #4
    //   278: ifne -> 344
    //   281: aload_0
    //   282: getfield L : Landroidx/recyclerview/widget/StaggeredGridLayoutManager$b;
    //   285: getfield f : [I
    //   288: ifnonnull -> 294
    //   291: goto -> 344
    //   294: iconst_0
    //   295: istore #4
    //   297: iload #4
    //   299: aload_0
    //   300: getfield s : I
    //   303: if_icmpge -> 395
    //   306: aload_0
    //   307: getfield t : [Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;
    //   310: iload #4
    //   312: aaload
    //   313: astore #9
    //   315: aload #9
    //   317: invokevirtual c : ()V
    //   320: aload #9
    //   322: aload_0
    //   323: getfield L : Landroidx/recyclerview/widget/StaggeredGridLayoutManager$b;
    //   326: getfield f : [I
    //   329: iload #4
    //   331: iaload
    //   332: invokevirtual d : (I)V
    //   335: iload #4
    //   337: iconst_1
    //   338: iadd
    //   339: istore #4
    //   341: goto -> 297
    //   344: iconst_0
    //   345: istore #4
    //   347: iload #4
    //   349: aload_0
    //   350: getfield s : I
    //   353: if_icmpge -> 384
    //   356: aload_0
    //   357: getfield t : [Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;
    //   360: iload #4
    //   362: aaload
    //   363: aload_0
    //   364: getfield A : Z
    //   367: aload #8
    //   369: getfield b : I
    //   372: invokevirtual a : (ZI)V
    //   375: iload #4
    //   377: iconst_1
    //   378: iadd
    //   379: istore #4
    //   381: goto -> 347
    //   384: aload_0
    //   385: getfield L : Landroidx/recyclerview/widget/StaggeredGridLayoutManager$b;
    //   388: aload_0
    //   389: getfield t : [Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;
    //   392: invokevirtual a : ([Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;)V
    //   395: aload_0
    //   396: aload_1
    //   397: invokevirtual a : (Landroidx/recyclerview/widget/RecyclerView$v;)V
    //   400: aload_0
    //   401: getfield y : Landroidx/recyclerview/widget/g;
    //   404: iconst_0
    //   405: putfield a : Z
    //   408: aload_0
    //   409: iconst_0
    //   410: putfield M : Z
    //   413: aload_0
    //   414: aload_0
    //   415: getfield v : Landroidx/recyclerview/widget/k;
    //   418: invokevirtual g : ()I
    //   421: invokevirtual l : (I)V
    //   424: aload_0
    //   425: aload #8
    //   427: getfield a : I
    //   430: aload_2
    //   431: invokespecial b : (ILandroidx/recyclerview/widget/RecyclerView$a0;)V
    //   434: aload #8
    //   436: getfield c : Z
    //   439: ifeq -> 466
    //   442: aload_0
    //   443: iconst_m1
    //   444: invokespecial x : (I)V
    //   447: aload_0
    //   448: aload_1
    //   449: aload_0
    //   450: getfield y : Landroidx/recyclerview/widget/g;
    //   453: aload_2
    //   454: invokespecial a : (Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/g;Landroidx/recyclerview/widget/RecyclerView$a0;)I
    //   457: pop
    //   458: aload_0
    //   459: iconst_1
    //   460: invokespecial x : (I)V
    //   463: goto -> 487
    //   466: aload_0
    //   467: iconst_1
    //   468: invokespecial x : (I)V
    //   471: aload_0
    //   472: aload_1
    //   473: aload_0
    //   474: getfield y : Landroidx/recyclerview/widget/g;
    //   477: aload_2
    //   478: invokespecial a : (Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/g;Landroidx/recyclerview/widget/RecyclerView$a0;)I
    //   481: pop
    //   482: aload_0
    //   483: iconst_m1
    //   484: invokespecial x : (I)V
    //   487: aload_0
    //   488: getfield y : Landroidx/recyclerview/widget/g;
    //   491: astore #9
    //   493: aload #9
    //   495: aload #8
    //   497: getfield a : I
    //   500: aload #9
    //   502: getfield d : I
    //   505: iadd
    //   506: putfield c : I
    //   509: aload_0
    //   510: aload_1
    //   511: aload #9
    //   513: aload_2
    //   514: invokespecial a : (Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/g;Landroidx/recyclerview/widget/RecyclerView$a0;)I
    //   517: pop
    //   518: aload_0
    //   519: invokespecial O : ()V
    //   522: aload_0
    //   523: invokevirtual e : ()I
    //   526: ifle -> 567
    //   529: aload_0
    //   530: getfield A : Z
    //   533: ifeq -> 553
    //   536: aload_0
    //   537: aload_1
    //   538: aload_2
    //   539: iconst_1
    //   540: invokespecial a : (Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;Z)V
    //   543: aload_0
    //   544: aload_1
    //   545: aload_2
    //   546: iconst_0
    //   547: invokespecial b : (Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;Z)V
    //   550: goto -> 567
    //   553: aload_0
    //   554: aload_1
    //   555: aload_2
    //   556: iconst_1
    //   557: invokespecial b : (Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;Z)V
    //   560: aload_0
    //   561: aload_1
    //   562: aload_2
    //   563: iconst_0
    //   564: invokespecial a : (Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;Z)V
    //   567: iload_3
    //   568: ifeq -> 643
    //   571: aload_2
    //   572: invokevirtual d : ()Z
    //   575: ifne -> 643
    //   578: aload_0
    //   579: getfield F : I
    //   582: ifeq -> 612
    //   585: aload_0
    //   586: invokevirtual e : ()I
    //   589: ifle -> 612
    //   592: aload_0
    //   593: getfield M : Z
    //   596: ifne -> 606
    //   599: aload_0
    //   600: invokevirtual K : ()Landroid/view/View;
    //   603: ifnull -> 612
    //   606: iconst_1
    //   607: istore #4
    //   609: goto -> 615
    //   612: iconst_0
    //   613: istore #4
    //   615: iload #4
    //   617: ifeq -> 643
    //   620: aload_0
    //   621: aload_0
    //   622: getfield P : Ljava/lang/Runnable;
    //   625: invokevirtual a : (Ljava/lang/Runnable;)Z
    //   628: pop
    //   629: aload_0
    //   630: invokevirtual G : ()Z
    //   633: ifeq -> 643
    //   636: iload #5
    //   638: istore #4
    //   640: goto -> 646
    //   643: iconst_0
    //   644: istore #4
    //   646: aload_2
    //   647: invokevirtual d : ()Z
    //   650: ifeq -> 660
    //   653: aload_0
    //   654: getfield L : Landroidx/recyclerview/widget/StaggeredGridLayoutManager$b;
    //   657: invokevirtual b : ()V
    //   660: aload_0
    //   661: aload #8
    //   663: getfield c : Z
    //   666: putfield G : Z
    //   669: aload_0
    //   670: aload_0
    //   671: invokevirtual M : ()Z
    //   674: putfield H : Z
    //   677: iload #4
    //   679: ifeq -> 696
    //   682: aload_0
    //   683: getfield L : Landroidx/recyclerview/widget/StaggeredGridLayoutManager$b;
    //   686: invokevirtual b : ()V
    //   689: aload_0
    //   690: aload_1
    //   691: aload_2
    //   692: iconst_0
    //   693: invokespecial c : (Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;Z)V
    //   696: return
  }
  
  private boolean c(RecyclerView.a0 parama0, b paramb) {
    boolean bool = this.G;
    int i = parama0.a();
    if (bool) {
      i = r(i);
    } else {
      i = q(i);
    } 
    paramb.a = i;
    paramb.b = Integer.MIN_VALUE;
    return true;
  }
  
  private void e(int paramInt1, int paramInt2) {
    for (int i = 0; i < this.s; i++) {
      if (!(this.t[i]).a.isEmpty())
        a(this.t[i], paramInt1, paramInt2); 
    } 
  }
  
  private int h(RecyclerView.a0 parama0) {
    return (e() == 0) ? 0 : m.a(parama0, this.u, b(this.N ^ true), a(this.N ^ true), this, this.N);
  }
  
  private int i(RecyclerView.a0 parama0) {
    return (e() == 0) ? 0 : m.a(parama0, this.u, b(this.N ^ true), a(this.N ^ true), this, this.N, this.A);
  }
  
  private int j(RecyclerView.a0 parama0) {
    return (e() == 0) ? 0 : m.b(parama0, this.u, b(this.N ^ true), a(this.N ^ true), this, this.N);
  }
  
  private int m(int paramInt) {
    boolean bool;
    int i = e();
    byte b1 = -1;
    if (i == 0) {
      paramInt = b1;
      if (this.A)
        paramInt = 1; 
      return paramInt;
    } 
    if (paramInt < I()) {
      bool = true;
    } else {
      bool = false;
    } 
    return (bool != this.A) ? -1 : 1;
  }
  
  private int n(int paramInt) {
    return (paramInt != 1) ? ((paramInt != 2) ? ((paramInt != 17) ? ((paramInt != 33) ? ((paramInt != 66) ? ((paramInt != 130) ? Integer.MIN_VALUE : ((this.w == 1) ? 1 : Integer.MIN_VALUE)) : ((this.w == 0) ? 1 : Integer.MIN_VALUE)) : ((this.w == 1) ? -1 : Integer.MIN_VALUE)) : ((this.w == 0) ? -1 : Integer.MIN_VALUE)) : ((this.w == 1) ? 1 : (M() ? -1 : 1))) : ((this.w == 1) ? -1 : (M() ? 1 : -1));
  }
  
  private d.a o(int paramInt) {
    d.a a = new d.a();
    a.e = new int[this.s];
    for (int i = 0; i < this.s; i++)
      a.e[i] = paramInt - this.t[i].a(paramInt); 
    return a;
  }
  
  private d.a p(int paramInt) {
    d.a a = new d.a();
    a.e = new int[this.s];
    for (int i = 0; i < this.s; i++)
      a.e[i] = this.t[i].b(paramInt) - paramInt; 
    return a;
  }
  
  private void p(View paramView) {
    for (int i = this.s - 1; i >= 0; i--)
      this.t[i].a(paramView); 
  }
  
  private int q(int paramInt) {
    int j = e();
    for (int i = 0; i < j; i++) {
      int m = l(d(i));
      if (m >= 0 && m < paramInt)
        return m; 
    } 
    return 0;
  }
  
  private void q(View paramView) {
    for (int i = this.s - 1; i >= 0; i--)
      this.t[i].c(paramView); 
  }
  
  private int r(int paramInt) {
    for (int i = e() - 1; i >= 0; i--) {
      int j = l(d(i));
      if (j >= 0 && j < paramInt)
        return j; 
    } 
    return 0;
  }
  
  private int s(int paramInt) {
    int j = this.t[0].a(paramInt);
    int i = 1;
    while (i < this.s) {
      int n = this.t[i].a(paramInt);
      int m = j;
      if (n > j)
        m = n; 
      i++;
      j = m;
    } 
    return j;
  }
  
  private int t(int paramInt) {
    int j = this.t[0].b(paramInt);
    int i = 1;
    while (i < this.s) {
      int n = this.t[i].b(paramInt);
      int m = j;
      if (n > j)
        m = n; 
      i++;
      j = m;
    } 
    return j;
  }
  
  private int u(int paramInt) {
    int j = this.t[0].a(paramInt);
    int i = 1;
    while (i < this.s) {
      int n = this.t[i].a(paramInt);
      int m = j;
      if (n < j)
        m = n; 
      i++;
      j = m;
    } 
    return j;
  }
  
  private int v(int paramInt) {
    int j = this.t[0].b(paramInt);
    int i = 1;
    while (i < this.s) {
      int n = this.t[i].b(paramInt);
      int m = j;
      if (n < j)
        m = n; 
      i++;
      j = m;
    } 
    return j;
  }
  
  private boolean w(int paramInt) {
    boolean bool;
    if (this.w == 0) {
      if (paramInt == -1) {
        bool = true;
      } else {
        bool = false;
      } 
      return (bool != this.A);
    } 
    if (paramInt == -1) {
      bool = true;
    } else {
      bool = false;
    } 
    if (bool == this.A) {
      bool = true;
    } else {
      bool = false;
    } 
    return (bool == M());
  }
  
  private void x(int paramInt) {
    boolean bool1;
    g g1 = this.y;
    g1.e = paramInt;
    boolean bool2 = this.A;
    boolean bool = true;
    if (paramInt == -1) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    if (bool2 == bool1) {
      paramInt = bool;
    } else {
      paramInt = -1;
    } 
    g1.d = paramInt;
  }
  
  public boolean D() {
    return (this.I == null);
  }
  
  boolean E() {
    int j = this.t[0].a(-2147483648);
    for (int i = 1; i < this.s; i++) {
      if (this.t[i].a(-2147483648) != j)
        return false; 
    } 
    return true;
  }
  
  boolean F() {
    int j = this.t[0].b(-2147483648);
    for (int i = 1; i < this.s; i++) {
      if (this.t[i].b(-2147483648) != j)
        return false; 
    } 
    return true;
  }
  
  boolean G() {
    if (e() != 0 && this.F != 0) {
      int i;
      int j;
      byte b1;
      if (!u())
        return false; 
      if (this.A) {
        i = J();
        j = I();
      } else {
        i = I();
        j = J();
      } 
      if (i == 0 && K() != null) {
        this.E.a();
        A();
        z();
        return true;
      } 
      if (!this.M)
        return false; 
      if (this.A) {
        b1 = -1;
      } else {
        b1 = 1;
      } 
      d d1 = this.E;
      d.a a1 = d1.a(i, ++j, b1, true);
      if (a1 == null) {
        this.M = false;
        this.E.b(j);
        return false;
      } 
      d.a a2 = this.E.a(i, a1.c, b1 * -1, true);
      if (a2 == null) {
        this.E.b(a1.c);
        A();
        z();
        return true;
      } 
      this.E.b(a2.c + 1);
      A();
      z();
      return true;
    } 
    return false;
  }
  
  int H() {
    View view;
    if (this.A) {
      view = a(true);
    } else {
      view = b(true);
    } 
    return (view == null) ? -1 : l(view);
  }
  
  int I() {
    return (e() == 0) ? 0 : l(d(0));
  }
  
  int J() {
    int i = e();
    return (i == 0) ? 0 : l(d(i - 1));
  }
  
  View K() {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual e : ()I
    //   4: iconst_1
    //   5: isub
    //   6: istore_1
    //   7: new java/util/BitSet
    //   10: dup
    //   11: aload_0
    //   12: getfield s : I
    //   15: invokespecial <init> : (I)V
    //   18: astore #7
    //   20: aload #7
    //   22: iconst_0
    //   23: aload_0
    //   24: getfield s : I
    //   27: iconst_1
    //   28: invokevirtual set : (IIZ)V
    //   31: aload_0
    //   32: getfield w : I
    //   35: istore_2
    //   36: iconst_m1
    //   37: istore #5
    //   39: iload_2
    //   40: iconst_1
    //   41: if_icmpne -> 56
    //   44: aload_0
    //   45: invokevirtual M : ()Z
    //   48: ifeq -> 56
    //   51: iconst_1
    //   52: istore_2
    //   53: goto -> 58
    //   56: iconst_m1
    //   57: istore_2
    //   58: aload_0
    //   59: getfield A : Z
    //   62: ifeq -> 70
    //   65: iconst_m1
    //   66: istore_3
    //   67: goto -> 76
    //   70: iload_1
    //   71: iconst_1
    //   72: iadd
    //   73: istore_3
    //   74: iconst_0
    //   75: istore_1
    //   76: iload_1
    //   77: istore #4
    //   79: iload_1
    //   80: iload_3
    //   81: if_icmpge -> 90
    //   84: iconst_1
    //   85: istore #5
    //   87: iload_1
    //   88: istore #4
    //   90: iload #4
    //   92: iload_3
    //   93: if_icmpeq -> 349
    //   96: aload_0
    //   97: iload #4
    //   99: invokevirtual d : (I)Landroid/view/View;
    //   102: astore #8
    //   104: aload #8
    //   106: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   109: checkcast androidx/recyclerview/widget/StaggeredGridLayoutManager$c
    //   112: astore #9
    //   114: aload #7
    //   116: aload #9
    //   118: getfield e : Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;
    //   121: getfield e : I
    //   124: invokevirtual get : (I)Z
    //   127: ifeq -> 158
    //   130: aload_0
    //   131: aload #9
    //   133: getfield e : Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;
    //   136: invokespecial a : (Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;)Z
    //   139: ifeq -> 145
    //   142: aload #8
    //   144: areturn
    //   145: aload #7
    //   147: aload #9
    //   149: getfield e : Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;
    //   152: getfield e : I
    //   155: invokevirtual clear : (I)V
    //   158: aload #9
    //   160: getfield f : Z
    //   163: ifeq -> 169
    //   166: goto -> 339
    //   169: iload #4
    //   171: iload #5
    //   173: iadd
    //   174: istore_1
    //   175: iload_1
    //   176: iload_3
    //   177: if_icmpeq -> 339
    //   180: aload_0
    //   181: iload_1
    //   182: invokevirtual d : (I)Landroid/view/View;
    //   185: astore #10
    //   187: aload_0
    //   188: getfield A : Z
    //   191: ifeq -> 233
    //   194: aload_0
    //   195: getfield u : Landroidx/recyclerview/widget/k;
    //   198: aload #8
    //   200: invokevirtual a : (Landroid/view/View;)I
    //   203: istore_1
    //   204: aload_0
    //   205: getfield u : Landroidx/recyclerview/widget/k;
    //   208: aload #10
    //   210: invokevirtual a : (Landroid/view/View;)I
    //   213: istore #6
    //   215: iload_1
    //   216: iload #6
    //   218: if_icmpge -> 224
    //   221: aload #8
    //   223: areturn
    //   224: iload_1
    //   225: iload #6
    //   227: if_icmpne -> 274
    //   230: goto -> 269
    //   233: aload_0
    //   234: getfield u : Landroidx/recyclerview/widget/k;
    //   237: aload #8
    //   239: invokevirtual d : (Landroid/view/View;)I
    //   242: istore_1
    //   243: aload_0
    //   244: getfield u : Landroidx/recyclerview/widget/k;
    //   247: aload #10
    //   249: invokevirtual d : (Landroid/view/View;)I
    //   252: istore #6
    //   254: iload_1
    //   255: iload #6
    //   257: if_icmple -> 263
    //   260: aload #8
    //   262: areturn
    //   263: iload_1
    //   264: iload #6
    //   266: if_icmpne -> 274
    //   269: iconst_1
    //   270: istore_1
    //   271: goto -> 276
    //   274: iconst_0
    //   275: istore_1
    //   276: iload_1
    //   277: ifeq -> 339
    //   280: aload #10
    //   282: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   285: checkcast androidx/recyclerview/widget/StaggeredGridLayoutManager$c
    //   288: astore #10
    //   290: aload #9
    //   292: getfield e : Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;
    //   295: getfield e : I
    //   298: aload #10
    //   300: getfield e : Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;
    //   303: getfield e : I
    //   306: isub
    //   307: ifge -> 315
    //   310: iconst_1
    //   311: istore_1
    //   312: goto -> 317
    //   315: iconst_0
    //   316: istore_1
    //   317: iload_2
    //   318: ifge -> 327
    //   321: iconst_1
    //   322: istore #6
    //   324: goto -> 330
    //   327: iconst_0
    //   328: istore #6
    //   330: iload_1
    //   331: iload #6
    //   333: if_icmpeq -> 339
    //   336: aload #8
    //   338: areturn
    //   339: iload #4
    //   341: iload #5
    //   343: iadd
    //   344: istore #4
    //   346: goto -> 90
    //   349: aconst_null
    //   350: areturn
  }
  
  public void L() {
    this.E.a();
    z();
  }
  
  boolean M() {
    return (k() == 1);
  }
  
  public int a(int paramInt, RecyclerView.v paramv, RecyclerView.a0 parama0) {
    return c(paramInt, paramv, parama0);
  }
  
  public int a(RecyclerView.a0 parama0) {
    return h(parama0);
  }
  
  public int a(RecyclerView.v paramv, RecyclerView.a0 parama0) {
    return (this.w == 1) ? this.s : super.a(paramv, parama0);
  }
  
  public PointF a(int paramInt) {
    paramInt = m(paramInt);
    PointF pointF = new PointF();
    if (paramInt == 0)
      return null; 
    if (this.w == 0) {
      pointF.x = paramInt;
      pointF.y = 0.0F;
      return pointF;
    } 
    pointF.x = 0.0F;
    pointF.y = paramInt;
    return pointF;
  }
  
  public View a(View paramView, int paramInt, RecyclerView.v paramv, RecyclerView.a0 parama0) {
    if (e() == 0)
      return null; 
    paramView = c(paramView);
    if (paramView == null)
      return null; 
    P();
    int m = n(paramInt);
    if (m == Integer.MIN_VALUE)
      return null; 
    c c = (c)paramView.getLayoutParams();
    boolean bool1 = c.f;
    f f1 = c.e;
    if (m == 1) {
      paramInt = J();
    } else {
      paramInt = I();
    } 
    b(paramInt, parama0);
    x(m);
    g g1 = this.y;
    g1.c = g1.d + paramInt;
    g1.b = (int)(this.u.g() * 0.33333334F);
    g1 = this.y;
    g1.h = true;
    int j = 0;
    g1.a = false;
    a(paramv, g1, parama0);
    this.G = this.A;
    if (!bool1) {
      View view = f1.a(paramInt, m);
      if (view != null && view != paramView)
        return view; 
    } 
    if (w(m)) {
      int n;
      for (n = this.s - 1; n >= 0; n--) {
        View view = this.t[n].a(paramInt, m);
        if (view != null && view != paramView)
          return view; 
      } 
    } else {
      int n;
      for (n = 0; n < this.s; n++) {
        View view = this.t[n].a(paramInt, m);
        if (view != null && view != paramView)
          return view; 
      } 
    } 
    boolean bool2 = this.z;
    if (m == -1) {
      paramInt = 1;
    } else {
      paramInt = 0;
    } 
    if ((bool2 ^ true) == paramInt) {
      paramInt = 1;
    } else {
      paramInt = 0;
    } 
    if (!bool1) {
      int n;
      if (paramInt != 0) {
        n = f1.d();
      } else {
        n = f1.e();
      } 
      View view = c(n);
      if (view != null && view != paramView)
        return view; 
    } 
    int i = j;
    if (w(m)) {
      for (i = this.s - 1; i >= 0; i--) {
        if (i != f1.e) {
          f[] arrayOfF = this.t;
          if (paramInt != 0) {
            j = arrayOfF[i].d();
          } else {
            j = arrayOfF[i].e();
          } 
          View view = c(j);
          if (view != null && view != paramView)
            return view; 
        } 
      } 
    } else {
      while (i < this.s) {
        f[] arrayOfF = this.t;
        if (paramInt != 0) {
          j = arrayOfF[i].d();
        } else {
          j = arrayOfF[i].e();
        } 
        View view = c(j);
        if (view != null && view != paramView)
          return view; 
        i++;
      } 
    } 
    return null;
  }
  
  View a(boolean paramBoolean) {
    int j = this.u.f();
    int m = this.u.b();
    int i = e() - 1;
    View view;
    for (view = null; i >= 0; view = view1) {
      View view2 = d(i);
      int n = this.u.d(view2);
      int i1 = this.u.a(view2);
      View view1 = view;
      if (i1 > j)
        if (n >= m) {
          view1 = view;
        } else if (i1 > m) {
          if (!paramBoolean)
            return view2; 
          view1 = view;
          if (view == null)
            view1 = view2; 
        } else {
          return view2;
        }  
      i--;
    } 
    return view;
  }
  
  public RecyclerView.p a(Context paramContext, AttributeSet paramAttributeSet) {
    return new c(paramContext, paramAttributeSet);
  }
  
  public RecyclerView.p a(ViewGroup.LayoutParams paramLayoutParams) {
    return (paramLayoutParams instanceof ViewGroup.MarginLayoutParams) ? new c((ViewGroup.MarginLayoutParams)paramLayoutParams) : new c(paramLayoutParams);
  }
  
  public void a(int paramInt1, int paramInt2, RecyclerView.a0 parama0, RecyclerView.o.c paramc) {
    if (this.w != 0)
      paramInt1 = paramInt2; 
    if (e() != 0) {
      if (paramInt1 == 0)
        return; 
      a(paramInt1, parama0);
      int[] arrayOfInt = this.O;
      if (arrayOfInt == null || arrayOfInt.length < this.s)
        this.O = new int[this.s]; 
      boolean bool = false;
      paramInt2 = 0;
      for (paramInt1 = 0; paramInt2 < this.s; paramInt1 = i) {
        g g1 = this.y;
        if (g1.d == -1) {
          i = g1.f;
          j = this.t[paramInt2].b(i);
        } else {
          i = this.t[paramInt2].a(g1.g);
          j = this.y.g;
        } 
        int j = i - j;
        int i = paramInt1;
        if (j >= 0) {
          this.O[paramInt1] = j;
          i = paramInt1 + 1;
        } 
        paramInt2++;
      } 
      Arrays.sort(this.O, 0, paramInt1);
      for (paramInt2 = bool; paramInt2 < paramInt1 && this.y.a(parama0); paramInt2++) {
        paramc.a(this.y.c, this.O[paramInt2]);
        g g1 = this.y;
        g1.c += g1.d;
      } 
    } 
  }
  
  void a(int paramInt, RecyclerView.a0 parama0) {
    int i;
    byte b1;
    if (paramInt > 0) {
      i = J();
      b1 = 1;
    } else {
      i = I();
      b1 = -1;
    } 
    this.y.a = true;
    b(i, parama0);
    x(b1);
    g g1 = this.y;
    g1.c = i + g1.d;
    g1.b = Math.abs(paramInt);
  }
  
  public void a(Rect paramRect, int paramInt1, int paramInt2) {
    int i = o() + p();
    int j = q() + n();
    if (this.w == 1) {
      paramInt2 = RecyclerView.o.a(paramInt2, paramRect.height() + j, l());
      i = RecyclerView.o.a(paramInt1, this.x * this.s + i, m());
      paramInt1 = paramInt2;
      paramInt2 = i;
    } else {
      paramInt1 = RecyclerView.o.a(paramInt1, paramRect.width() + i, m());
      i = RecyclerView.o.a(paramInt2, this.x * this.s + j, l());
      paramInt2 = paramInt1;
      paramInt1 = i;
    } 
    c(paramInt2, paramInt1);
  }
  
  public void a(Parcelable paramParcelable) {
    if (paramParcelable instanceof e) {
      this.I = (e)paramParcelable;
      z();
    } 
  }
  
  public void a(AccessibilityEvent paramAccessibilityEvent) {
    super.a(paramAccessibilityEvent);
    if (e() > 0) {
      View view1 = b(false);
      View view2 = a(false);
      if (view1 != null) {
        if (view2 == null)
          return; 
        int i = l(view1);
        int j = l(view2);
        if (i < j) {
          paramAccessibilityEvent.setFromIndex(i);
          paramAccessibilityEvent.setToIndex(j);
          return;
        } 
        paramAccessibilityEvent.setFromIndex(j);
        paramAccessibilityEvent.setToIndex(i);
      } 
    } 
  }
  
  public void a(RecyclerView.v paramv, RecyclerView.a0 parama0, View paramView, b.g.m.e0.c paramc) {
    boolean bool;
    byte b1;
    byte b2;
    int i;
    ViewGroup.LayoutParams layoutParams = paramView.getLayoutParams();
    if (!(layoutParams instanceof c)) {
      a(paramView, paramc);
      return;
    } 
    c c1 = (c)layoutParams;
    if (this.w == 0) {
      b1 = c1.e();
      if (c1.f) {
        bool = this.s;
      } else {
        bool = true;
      } 
      i = -1;
      byte b3 = -1;
      b2 = bool;
      bool = b3;
    } else {
      b1 = -1;
      b2 = -1;
      i = c1.e();
      if (c1.f) {
        bool = this.s;
      } else {
        bool = true;
      } 
    } 
    paramc.b(b.g.m.e0.c.c.a(b1, b2, i, bool, false, false));
  }
  
  public void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2) {
    b(paramInt1, paramInt2, 1);
  }
  
  public void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2, int paramInt3) {
    b(paramInt1, paramInt2, 8);
  }
  
  public void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2, Object paramObject) {
    b(paramInt1, paramInt2, 4);
  }
  
  public void a(RecyclerView paramRecyclerView, RecyclerView.a0 parama0, int paramInt) {
    h h = new h(paramRecyclerView.getContext());
    h.c(paramInt);
    b(h);
  }
  
  public void a(String paramString) {
    if (this.I == null)
      super.a(paramString); 
  }
  
  public boolean a() {
    return (this.w == 0);
  }
  
  boolean a(RecyclerView.a0 parama0, b paramb) {
    boolean bool1 = parama0.d();
    boolean bool = false;
    if (!bool1) {
      int i = this.C;
      if (i == -1)
        return false; 
      if (i < 0 || i >= parama0.a()) {
        this.C = -1;
        this.D = Integer.MIN_VALUE;
        return false;
      } 
      e e1 = this.I;
      if (e1 == null || e1.c == -1 || e1.e < 1) {
        View view = c(this.C);
        if (view != null) {
          if (this.A) {
            i = J();
          } else {
            i = I();
          } 
          paramb.a = i;
          if (this.D != Integer.MIN_VALUE) {
            int j;
            if (paramb.c) {
              i = this.u.b() - this.D;
              j = this.u.a(view);
            } else {
              i = this.u.f() + this.D;
              j = this.u.d(view);
            } 
            paramb.b = i - j;
            return true;
          } 
          if (this.u.b(view) > this.u.g()) {
            if (paramb.c) {
              i = this.u.b();
            } else {
              i = this.u.f();
            } 
            paramb.b = i;
            return true;
          } 
          i = this.u.d(view) - this.u.f();
          if (i < 0) {
            paramb.b = -i;
            return true;
          } 
          i = this.u.b() - this.u.a(view);
          if (i < 0) {
            paramb.b = i;
            return true;
          } 
          paramb.b = Integer.MIN_VALUE;
          return true;
        } 
        paramb.a = this.C;
        i = this.D;
        if (i == Integer.MIN_VALUE) {
          if (m(paramb.a) == 1)
            bool = true; 
          paramb.c = bool;
          paramb.a();
        } else {
          paramb.a(i);
        } 
        paramb.d = true;
        return true;
      } 
      paramb.b = Integer.MIN_VALUE;
      paramb.a = this.C;
      return true;
    } 
    return false;
  }
  
  public boolean a(RecyclerView.p paramp) {
    return paramp instanceof c;
  }
  
  public int b(int paramInt, RecyclerView.v paramv, RecyclerView.a0 parama0) {
    return c(paramInt, paramv, parama0);
  }
  
  public int b(RecyclerView.a0 parama0) {
    return i(parama0);
  }
  
  public int b(RecyclerView.v paramv, RecyclerView.a0 parama0) {
    return (this.w == 0) ? this.s : super.b(paramv, parama0);
  }
  
  View b(boolean paramBoolean) {
    int j = this.u.f();
    int m = this.u.b();
    int n = e();
    View view = null;
    int i = 0;
    while (i < n) {
      View view2 = d(i);
      int i1 = this.u.d(view2);
      View view1 = view;
      if (this.u.a(view2) > j)
        if (i1 >= m) {
          view1 = view;
        } else if (i1 < j) {
          if (!paramBoolean)
            return view2; 
          view1 = view;
          if (view == null)
            view1 = view2; 
        } else {
          return view2;
        }  
      i++;
      view = view1;
    } 
    return view;
  }
  
  void b(RecyclerView.a0 parama0, b paramb) {
    if (a(parama0, paramb))
      return; 
    if (c(parama0, paramb))
      return; 
    paramb.a();
    paramb.a = 0;
  }
  
  public void b(RecyclerView paramRecyclerView, int paramInt1, int paramInt2) {
    b(paramInt1, paramInt2, 2);
  }
  
  public void b(RecyclerView paramRecyclerView, RecyclerView.v paramv) {
    super.b(paramRecyclerView, paramv);
    a(this.P);
    for (int i = 0; i < this.s; i++)
      this.t[i].c(); 
    paramRecyclerView.requestLayout();
  }
  
  public boolean b() {
    return (this.w == 1);
  }
  
  int c(int paramInt, RecyclerView.v paramv, RecyclerView.a0 parama0) {
    if (e() != 0) {
      if (paramInt == 0)
        return 0; 
      a(paramInt, parama0);
      int i = a(paramv, this.y, parama0);
      if (this.y.b >= i)
        if (paramInt < 0) {
          paramInt = -i;
        } else {
          paramInt = i;
        }  
      this.u.a(-paramInt);
      this.G = this.A;
      g g1 = this.y;
      g1.b = 0;
      a(paramv, g1);
      return paramInt;
    } 
    return 0;
  }
  
  public int c(RecyclerView.a0 parama0) {
    return j(parama0);
  }
  
  public RecyclerView.p c() {
    return (this.w == 0) ? new c(-2, -1) : new c(-1, -2);
  }
  
  public void c(boolean paramBoolean) {
    a((String)null);
    e e1 = this.I;
    if (e1 != null && e1.j != paramBoolean)
      e1.j = paramBoolean; 
    this.z = paramBoolean;
    z();
  }
  
  public int d(RecyclerView.a0 parama0) {
    return h(parama0);
  }
  
  public void d(RecyclerView paramRecyclerView) {
    this.E.a();
    z();
  }
  
  public int e(RecyclerView.a0 parama0) {
    return i(parama0);
  }
  
  public void e(int paramInt) {
    super.e(paramInt);
    for (int i = 0; i < this.s; i++)
      this.t[i].c(paramInt); 
  }
  
  public void e(RecyclerView.v paramv, RecyclerView.a0 parama0) {
    c(paramv, parama0, true);
  }
  
  public int f(RecyclerView.a0 parama0) {
    return j(parama0);
  }
  
  public void f(int paramInt) {
    super.f(paramInt);
    for (int i = 0; i < this.s; i++)
      this.t[i].c(paramInt); 
  }
  
  public void g(int paramInt) {
    if (paramInt == 0)
      G(); 
  }
  
  public void g(RecyclerView.a0 parama0) {
    super.g(parama0);
    this.C = -1;
    this.D = Integer.MIN_VALUE;
    this.I = null;
    this.L.b();
  }
  
  public void i(int paramInt) {
    e e1 = this.I;
    if (e1 != null && e1.c != paramInt)
      e1.e(); 
    this.C = paramInt;
    this.D = Integer.MIN_VALUE;
    z();
  }
  
  public void j(int paramInt) {
    if (paramInt == 0 || paramInt == 1) {
      a((String)null);
      if (paramInt == this.w)
        return; 
      this.w = paramInt;
      k k1 = this.u;
      this.u = this.v;
      this.v = k1;
      z();
      return;
    } 
    throw new IllegalArgumentException("invalid orientation.");
  }
  
  public void k(int paramInt) {
    a((String)null);
    if (paramInt != this.s) {
      L();
      this.s = paramInt;
      this.B = new BitSet(this.s);
      this.t = new f[this.s];
      for (paramInt = 0; paramInt < this.s; paramInt++)
        this.t[paramInt] = new f(this, paramInt); 
      z();
    } 
  }
  
  void l(int paramInt) {
    this.x = paramInt / this.s;
    this.J = View.MeasureSpec.makeMeasureSpec(paramInt, this.v.d());
  }
  
  public boolean v() {
    return (this.F != 0);
  }
  
  public Parcelable y() {
    // Byte code:
    //   0: aload_0
    //   1: getfield I : Landroidx/recyclerview/widget/StaggeredGridLayoutManager$e;
    //   4: astore #4
    //   6: aload #4
    //   8: ifnull -> 21
    //   11: new androidx/recyclerview/widget/StaggeredGridLayoutManager$e
    //   14: dup
    //   15: aload #4
    //   17: invokespecial <init> : (Landroidx/recyclerview/widget/StaggeredGridLayoutManager$e;)V
    //   20: areturn
    //   21: new androidx/recyclerview/widget/StaggeredGridLayoutManager$e
    //   24: dup
    //   25: invokespecial <init> : ()V
    //   28: astore #4
    //   30: aload #4
    //   32: aload_0
    //   33: getfield z : Z
    //   36: putfield j : Z
    //   39: aload #4
    //   41: aload_0
    //   42: getfield G : Z
    //   45: putfield k : Z
    //   48: aload #4
    //   50: aload_0
    //   51: getfield H : Z
    //   54: putfield l : Z
    //   57: aload_0
    //   58: getfield E : Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d;
    //   61: astore #5
    //   63: iconst_0
    //   64: istore_2
    //   65: aload #5
    //   67: ifnull -> 113
    //   70: aload #5
    //   72: getfield a : [I
    //   75: astore #6
    //   77: aload #6
    //   79: ifnull -> 113
    //   82: aload #4
    //   84: aload #6
    //   86: putfield h : [I
    //   89: aload #4
    //   91: aload #4
    //   93: getfield h : [I
    //   96: arraylength
    //   97: putfield g : I
    //   100: aload #4
    //   102: aload #5
    //   104: getfield b : Ljava/util/List;
    //   107: putfield i : Ljava/util/List;
    //   110: goto -> 119
    //   113: aload #4
    //   115: iconst_0
    //   116: putfield g : I
    //   119: aload_0
    //   120: invokevirtual e : ()I
    //   123: ifle -> 273
    //   126: aload_0
    //   127: getfield G : Z
    //   130: ifeq -> 141
    //   133: aload_0
    //   134: invokevirtual J : ()I
    //   137: istore_1
    //   138: goto -> 146
    //   141: aload_0
    //   142: invokevirtual I : ()I
    //   145: istore_1
    //   146: aload #4
    //   148: iload_1
    //   149: putfield c : I
    //   152: aload #4
    //   154: aload_0
    //   155: invokevirtual H : ()I
    //   158: putfield d : I
    //   161: aload_0
    //   162: getfield s : I
    //   165: istore_1
    //   166: aload #4
    //   168: iload_1
    //   169: putfield e : I
    //   172: aload #4
    //   174: iload_1
    //   175: newarray int
    //   177: putfield f : [I
    //   180: iload_2
    //   181: aload_0
    //   182: getfield s : I
    //   185: if_icmpge -> 291
    //   188: aload_0
    //   189: getfield G : Z
    //   192: ifeq -> 226
    //   195: aload_0
    //   196: getfield t : [Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;
    //   199: iload_2
    //   200: aaload
    //   201: ldc -2147483648
    //   203: invokevirtual a : (I)I
    //   206: istore_3
    //   207: iload_3
    //   208: istore_1
    //   209: iload_3
    //   210: ldc -2147483648
    //   212: if_icmpeq -> 258
    //   215: aload_0
    //   216: getfield u : Landroidx/recyclerview/widget/k;
    //   219: invokevirtual b : ()I
    //   222: istore_1
    //   223: goto -> 254
    //   226: aload_0
    //   227: getfield t : [Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;
    //   230: iload_2
    //   231: aaload
    //   232: ldc -2147483648
    //   234: invokevirtual b : (I)I
    //   237: istore_3
    //   238: iload_3
    //   239: istore_1
    //   240: iload_3
    //   241: ldc -2147483648
    //   243: if_icmpeq -> 258
    //   246: aload_0
    //   247: getfield u : Landroidx/recyclerview/widget/k;
    //   250: invokevirtual f : ()I
    //   253: istore_1
    //   254: iload_3
    //   255: iload_1
    //   256: isub
    //   257: istore_1
    //   258: aload #4
    //   260: getfield f : [I
    //   263: iload_2
    //   264: iload_1
    //   265: iastore
    //   266: iload_2
    //   267: iconst_1
    //   268: iadd
    //   269: istore_2
    //   270: goto -> 180
    //   273: aload #4
    //   275: iconst_m1
    //   276: putfield c : I
    //   279: aload #4
    //   281: iconst_m1
    //   282: putfield d : I
    //   285: aload #4
    //   287: iconst_0
    //   288: putfield e : I
    //   291: aload #4
    //   293: areturn
  }
  
  class a implements Runnable {
    a(StaggeredGridLayoutManager this$0) {}
    
    public void run() {
      this.c.G();
    }
  }
  
  class b {
    int a;
    
    int b;
    
    boolean c;
    
    boolean d;
    
    boolean e;
    
    int[] f;
    
    b(StaggeredGridLayoutManager this$0) {
      b();
    }
    
    void a() {
      int i;
      if (this.c) {
        i = this.g.u.b();
      } else {
        i = this.g.u.f();
      } 
      this.b = i;
    }
    
    void a(int param1Int) {
      if (this.c) {
        param1Int = this.g.u.b() - param1Int;
      } else {
        param1Int = this.g.u.f() + param1Int;
      } 
      this.b = param1Int;
    }
    
    void a(StaggeredGridLayoutManager.f[] param1ArrayOff) {
      int j = param1ArrayOff.length;
      int[] arrayOfInt = this.f;
      if (arrayOfInt == null || arrayOfInt.length < j)
        this.f = new int[this.g.t.length]; 
      for (int i = 0; i < j; i++)
        this.f[i] = param1ArrayOff[i].b(-2147483648); 
    }
    
    void b() {
      this.a = -1;
      this.b = Integer.MIN_VALUE;
      this.c = false;
      this.d = false;
      this.e = false;
      int[] arrayOfInt = this.f;
      if (arrayOfInt != null)
        Arrays.fill(arrayOfInt, -1); 
    }
  }
  
  public static class c extends RecyclerView.p {
    StaggeredGridLayoutManager.f e;
    
    boolean f;
    
    public c(int param1Int1, int param1Int2) {
      super(param1Int1, param1Int2);
    }
    
    public c(Context param1Context, AttributeSet param1AttributeSet) {
      super(param1Context, param1AttributeSet);
    }
    
    public c(ViewGroup.LayoutParams param1LayoutParams) {
      super(param1LayoutParams);
    }
    
    public c(ViewGroup.MarginLayoutParams param1MarginLayoutParams) {
      super(param1MarginLayoutParams);
    }
    
    public final int e() {
      StaggeredGridLayoutManager.f f1 = this.e;
      return (f1 == null) ? -1 : f1.e;
    }
    
    public boolean f() {
      return this.f;
    }
  }
  
  static class d {
    int[] a;
    
    List<a> b;
    
    private void c(int param1Int1, int param1Int2) {
      List<a> list = this.b;
      if (list == null)
        return; 
      for (int i = list.size() - 1; i >= 0; i--) {
        a a = this.b.get(i);
        int j = a.c;
        if (j >= param1Int1)
          a.c = j + param1Int2; 
      } 
    }
    
    private void d(int param1Int1, int param1Int2) {
      List<a> list = this.b;
      if (list == null)
        return; 
      for (int i = list.size() - 1; i >= 0; i--) {
        a a = this.b.get(i);
        int j = a.c;
        if (j >= param1Int1)
          if (j < param1Int1 + param1Int2) {
            this.b.remove(i);
          } else {
            a.c = j - param1Int2;
          }  
      } 
    }
    
    private int g(int param1Int) {
      // Byte code:
      //   0: aload_0
      //   1: getfield b : Ljava/util/List;
      //   4: ifnonnull -> 9
      //   7: iconst_m1
      //   8: ireturn
      //   9: aload_0
      //   10: iload_1
      //   11: invokevirtual c : (I)Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d$a;
      //   14: astore #4
      //   16: aload #4
      //   18: ifnull -> 33
      //   21: aload_0
      //   22: getfield b : Ljava/util/List;
      //   25: aload #4
      //   27: invokeinterface remove : (Ljava/lang/Object;)Z
      //   32: pop
      //   33: aload_0
      //   34: getfield b : Ljava/util/List;
      //   37: invokeinterface size : ()I
      //   42: istore_3
      //   43: iconst_0
      //   44: istore_2
      //   45: iload_2
      //   46: iload_3
      //   47: if_icmpge -> 80
      //   50: aload_0
      //   51: getfield b : Ljava/util/List;
      //   54: iload_2
      //   55: invokeinterface get : (I)Ljava/lang/Object;
      //   60: checkcast androidx/recyclerview/widget/StaggeredGridLayoutManager$d$a
      //   63: getfield c : I
      //   66: iload_1
      //   67: if_icmplt -> 73
      //   70: goto -> 82
      //   73: iload_2
      //   74: iconst_1
      //   75: iadd
      //   76: istore_2
      //   77: goto -> 45
      //   80: iconst_m1
      //   81: istore_2
      //   82: iload_2
      //   83: iconst_m1
      //   84: if_icmpeq -> 119
      //   87: aload_0
      //   88: getfield b : Ljava/util/List;
      //   91: iload_2
      //   92: invokeinterface get : (I)Ljava/lang/Object;
      //   97: checkcast androidx/recyclerview/widget/StaggeredGridLayoutManager$d$a
      //   100: astore #4
      //   102: aload_0
      //   103: getfield b : Ljava/util/List;
      //   106: iload_2
      //   107: invokeinterface remove : (I)Ljava/lang/Object;
      //   112: pop
      //   113: aload #4
      //   115: getfield c : I
      //   118: ireturn
      //   119: iconst_m1
      //   120: ireturn
    }
    
    public a a(int param1Int1, int param1Int2, int param1Int3, boolean param1Boolean) {
      List<a> list = this.b;
      if (list == null)
        return null; 
      int j = list.size();
      int i;
      for (i = 0; i < j; i++) {
        a a = this.b.get(i);
        int k = a.c;
        if (k >= param1Int2)
          return null; 
        if (k >= param1Int1 && (param1Int3 == 0 || a.d == param1Int3 || (param1Boolean && a.f)))
          return a; 
      } 
      return null;
    }
    
    void a() {
      int[] arrayOfInt = this.a;
      if (arrayOfInt != null)
        Arrays.fill(arrayOfInt, -1); 
      this.b = null;
    }
    
    void a(int param1Int) {
      int[] arrayOfInt = this.a;
      if (arrayOfInt == null) {
        this.a = new int[Math.max(param1Int, 10) + 1];
        Arrays.fill(this.a, -1);
        return;
      } 
      if (param1Int >= arrayOfInt.length) {
        this.a = new int[f(param1Int)];
        System.arraycopy(arrayOfInt, 0, this.a, 0, arrayOfInt.length);
        int[] arrayOfInt1 = this.a;
        Arrays.fill(arrayOfInt1, arrayOfInt.length, arrayOfInt1.length, -1);
      } 
    }
    
    void a(int param1Int1, int param1Int2) {
      int[] arrayOfInt = this.a;
      if (arrayOfInt != null) {
        if (param1Int1 >= arrayOfInt.length)
          return; 
        int i = param1Int1 + param1Int2;
        a(i);
        arrayOfInt = this.a;
        System.arraycopy(arrayOfInt, param1Int1, arrayOfInt, i, arrayOfInt.length - param1Int1 - param1Int2);
        Arrays.fill(this.a, param1Int1, i, -1);
        c(param1Int1, param1Int2);
      } 
    }
    
    void a(int param1Int, StaggeredGridLayoutManager.f param1f) {
      a(param1Int);
      this.a[param1Int] = param1f.e;
    }
    
    public void a(a param1a) {
      if (this.b == null)
        this.b = new ArrayList<a>(); 
      int j = this.b.size();
      for (int i = 0; i < j; i++) {
        a a1 = this.b.get(i);
        if (a1.c == param1a.c)
          this.b.remove(i); 
        if (a1.c >= param1a.c) {
          this.b.add(i, param1a);
          return;
        } 
      } 
      this.b.add(param1a);
    }
    
    int b(int param1Int) {
      List<a> list = this.b;
      if (list != null)
        for (int i = list.size() - 1; i >= 0; i--) {
          if (((a)this.b.get(i)).c >= param1Int)
            this.b.remove(i); 
        }  
      return e(param1Int);
    }
    
    void b(int param1Int1, int param1Int2) {
      int[] arrayOfInt = this.a;
      if (arrayOfInt != null) {
        if (param1Int1 >= arrayOfInt.length)
          return; 
        int i = param1Int1 + param1Int2;
        a(i);
        arrayOfInt = this.a;
        System.arraycopy(arrayOfInt, i, arrayOfInt, param1Int1, arrayOfInt.length - param1Int1 - param1Int2);
        arrayOfInt = this.a;
        Arrays.fill(arrayOfInt, arrayOfInt.length - param1Int2, arrayOfInt.length, -1);
        d(param1Int1, param1Int2);
      } 
    }
    
    public a c(int param1Int) {
      List<a> list = this.b;
      if (list == null)
        return null; 
      for (int i = list.size() - 1; i >= 0; i--) {
        a a = this.b.get(i);
        if (a.c == param1Int)
          return a; 
      } 
      return null;
    }
    
    int d(int param1Int) {
      int[] arrayOfInt = this.a;
      return (arrayOfInt == null || param1Int >= arrayOfInt.length) ? -1 : arrayOfInt[param1Int];
    }
    
    int e(int param1Int) {
      int[] arrayOfInt = this.a;
      if (arrayOfInt == null)
        return -1; 
      if (param1Int >= arrayOfInt.length)
        return -1; 
      int i = g(param1Int);
      if (i == -1) {
        arrayOfInt = this.a;
        Arrays.fill(arrayOfInt, param1Int, arrayOfInt.length, -1);
        return this.a.length;
      } 
      arrayOfInt = this.a;
      Arrays.fill(arrayOfInt, param1Int, ++i, -1);
      return i;
    }
    
    int f(int param1Int) {
      int i;
      for (i = this.a.length; i <= param1Int; i *= 2);
      return i;
    }
    
    @SuppressLint({"BanParcelableUsage"})
    static class a implements Parcelable {
      public static final Parcelable.Creator<a> CREATOR = new a();
      
      int c;
      
      int d;
      
      int[] e;
      
      boolean f;
      
      a() {}
      
      a(Parcel param2Parcel) {
        this.c = param2Parcel.readInt();
        this.d = param2Parcel.readInt();
        int i = param2Parcel.readInt();
        boolean bool = true;
        if (i != 1)
          bool = false; 
        this.f = bool;
        i = param2Parcel.readInt();
        if (i > 0) {
          this.e = new int[i];
          param2Parcel.readIntArray(this.e);
        } 
      }
      
      int a(int param2Int) {
        int[] arrayOfInt = this.e;
        return (arrayOfInt == null) ? 0 : arrayOfInt[param2Int];
      }
      
      public int describeContents() {
        return 0;
      }
      
      public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("FullSpanItem{mPosition=");
        stringBuilder.append(this.c);
        stringBuilder.append(", mGapDir=");
        stringBuilder.append(this.d);
        stringBuilder.append(", mHasUnwantedGapAfter=");
        stringBuilder.append(this.f);
        stringBuilder.append(", mGapPerSpan=");
        stringBuilder.append(Arrays.toString(this.e));
        stringBuilder.append('}');
        return stringBuilder.toString();
      }
      
      public void writeToParcel(Parcel param2Parcel, int param2Int) {
        throw new RuntimeException("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
      }
      
      static final class a implements Parcelable.Creator<a> {
        public StaggeredGridLayoutManager.d.a createFromParcel(Parcel param3Parcel) {
          return new StaggeredGridLayoutManager.d.a(param3Parcel);
        }
        
        public StaggeredGridLayoutManager.d.a[] newArray(int param3Int) {
          return new StaggeredGridLayoutManager.d.a[param3Int];
        }
      }
    }
    
    static final class a implements Parcelable.Creator<a> {
      public StaggeredGridLayoutManager.d.a createFromParcel(Parcel param2Parcel) {
        return new StaggeredGridLayoutManager.d.a(param2Parcel);
      }
      
      public StaggeredGridLayoutManager.d.a[] newArray(int param2Int) {
        return new StaggeredGridLayoutManager.d.a[param2Int];
      }
    }
  }
  
  @SuppressLint({"BanParcelableUsage"})
  static class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new a();
    
    int c;
    
    int d;
    
    int[] e;
    
    boolean f;
    
    a() {}
    
    a(Parcel param1Parcel) {
      this.c = param1Parcel.readInt();
      this.d = param1Parcel.readInt();
      int i = param1Parcel.readInt();
      boolean bool = true;
      if (i != 1)
        bool = false; 
      this.f = bool;
      i = param1Parcel.readInt();
      if (i > 0) {
        this.e = new int[i];
        param1Parcel.readIntArray(this.e);
      } 
    }
    
    int a(int param1Int) {
      int[] arrayOfInt = this.e;
      return (arrayOfInt == null) ? 0 : arrayOfInt[param1Int];
    }
    
    public int describeContents() {
      return 0;
    }
    
    public String toString() {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("FullSpanItem{mPosition=");
      stringBuilder.append(this.c);
      stringBuilder.append(", mGapDir=");
      stringBuilder.append(this.d);
      stringBuilder.append(", mHasUnwantedGapAfter=");
      stringBuilder.append(this.f);
      stringBuilder.append(", mGapPerSpan=");
      stringBuilder.append(Arrays.toString(this.e));
      stringBuilder.append('}');
      return stringBuilder.toString();
    }
    
    public void writeToParcel(Parcel param1Parcel, int param1Int) {
      throw new RuntimeException("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }
    
    static final class a implements Parcelable.Creator<a> {
      public StaggeredGridLayoutManager.d.a createFromParcel(Parcel param3Parcel) {
        return new StaggeredGridLayoutManager.d.a(param3Parcel);
      }
      
      public StaggeredGridLayoutManager.d.a[] newArray(int param3Int) {
        return new StaggeredGridLayoutManager.d.a[param3Int];
      }
    }
  }
  
  static final class a implements Parcelable.Creator<d.a> {
    public StaggeredGridLayoutManager.d.a createFromParcel(Parcel param1Parcel) {
      return new StaggeredGridLayoutManager.d.a(param1Parcel);
    }
    
    public StaggeredGridLayoutManager.d.a[] newArray(int param1Int) {
      return new StaggeredGridLayoutManager.d.a[param1Int];
    }
  }
  
  @SuppressLint({"BanParcelableUsage"})
  public static class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();
    
    int c;
    
    int d;
    
    int e;
    
    int[] f;
    
    int g;
    
    int[] h;
    
    List<StaggeredGridLayoutManager.d.a> i;
    
    boolean j;
    
    boolean k;
    
    boolean l;
    
    public e() {}
    
    e(Parcel param1Parcel) {
      this.c = param1Parcel.readInt();
      this.d = param1Parcel.readInt();
      this.e = param1Parcel.readInt();
      int i = this.e;
      if (i > 0) {
        this.f = new int[i];
        param1Parcel.readIntArray(this.f);
      } 
      this.g = param1Parcel.readInt();
      i = this.g;
      if (i > 0) {
        this.h = new int[i];
        param1Parcel.readIntArray(this.h);
      } 
      i = param1Parcel.readInt();
      boolean bool2 = false;
      if (i == 1) {
        bool1 = true;
      } else {
        bool1 = false;
      } 
      this.j = bool1;
      if (param1Parcel.readInt() == 1) {
        bool1 = true;
      } else {
        bool1 = false;
      } 
      this.k = bool1;
      boolean bool1 = bool2;
      if (param1Parcel.readInt() == 1)
        bool1 = true; 
      this.l = bool1;
      this.i = param1Parcel.readArrayList(StaggeredGridLayoutManager.d.a.class.getClassLoader());
    }
    
    public e(e param1e) {
      this.e = param1e.e;
      this.c = param1e.c;
      this.d = param1e.d;
      this.f = param1e.f;
      this.g = param1e.g;
      this.h = param1e.h;
      this.j = param1e.j;
      this.k = param1e.k;
      this.l = param1e.l;
      this.i = param1e.i;
    }
    
    public int describeContents() {
      return 0;
    }
    
    void e() {
      this.f = null;
      this.e = 0;
      this.c = -1;
      this.d = -1;
    }
    
    void f() {
      this.f = null;
      this.e = 0;
      this.g = 0;
      this.h = null;
      this.i = null;
    }
    
    public void writeToParcel(Parcel param1Parcel, int param1Int) {
      throw new RuntimeException("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }
    
    static final class a implements Parcelable.Creator<e> {
      public StaggeredGridLayoutManager.e createFromParcel(Parcel param2Parcel) {
        return new StaggeredGridLayoutManager.e(param2Parcel);
      }
      
      public StaggeredGridLayoutManager.e[] newArray(int param2Int) {
        return new StaggeredGridLayoutManager.e[param2Int];
      }
    }
  }
  
  static final class a implements Parcelable.Creator<e> {
    public StaggeredGridLayoutManager.e createFromParcel(Parcel param1Parcel) {
      return new StaggeredGridLayoutManager.e(param1Parcel);
    }
    
    public StaggeredGridLayoutManager.e[] newArray(int param1Int) {
      return new StaggeredGridLayoutManager.e[param1Int];
    }
  }
  
  class f {
    ArrayList<View> a = new ArrayList<View>();
    
    int b = Integer.MIN_VALUE;
    
    int c = Integer.MIN_VALUE;
    
    int d = 0;
    
    final int e;
    
    f(StaggeredGridLayoutManager this$0, int param1Int) {
      this.e = param1Int;
    }
    
    int a(int param1Int) {
      int i = this.c;
      if (i != Integer.MIN_VALUE)
        return i; 
      if (this.a.size() == 0)
        return param1Int; 
      a();
      return this.c;
    }
    
    int a(int param1Int1, int param1Int2, boolean param1Boolean) {
      return a(param1Int1, param1Int2, false, false, param1Boolean);
    }
    
    int a(int param1Int1, int param1Int2, boolean param1Boolean1, boolean param1Boolean2, boolean param1Boolean3) {
      // Byte code:
      //   0: aload_0
      //   1: getfield f : Landroidx/recyclerview/widget/StaggeredGridLayoutManager;
      //   4: getfield u : Landroidx/recyclerview/widget/k;
      //   7: invokevirtual f : ()I
      //   10: istore #9
      //   12: aload_0
      //   13: getfield f : Landroidx/recyclerview/widget/StaggeredGridLayoutManager;
      //   16: getfield u : Landroidx/recyclerview/widget/k;
      //   19: invokevirtual b : ()I
      //   22: istore #10
      //   24: iload_2
      //   25: iload_1
      //   26: if_icmple -> 35
      //   29: iconst_1
      //   30: istore #6
      //   32: goto -> 38
      //   35: iconst_m1
      //   36: istore #6
      //   38: iload_1
      //   39: iload_2
      //   40: if_icmpeq -> 219
      //   43: aload_0
      //   44: getfield a : Ljava/util/ArrayList;
      //   47: iload_1
      //   48: invokevirtual get : (I)Ljava/lang/Object;
      //   51: checkcast android/view/View
      //   54: astore #13
      //   56: aload_0
      //   57: getfield f : Landroidx/recyclerview/widget/StaggeredGridLayoutManager;
      //   60: getfield u : Landroidx/recyclerview/widget/k;
      //   63: aload #13
      //   65: invokevirtual d : (Landroid/view/View;)I
      //   68: istore #11
      //   70: aload_0
      //   71: getfield f : Landroidx/recyclerview/widget/StaggeredGridLayoutManager;
      //   74: getfield u : Landroidx/recyclerview/widget/k;
      //   77: aload #13
      //   79: invokevirtual a : (Landroid/view/View;)I
      //   82: istore #12
      //   84: iconst_0
      //   85: istore #8
      //   87: iload #5
      //   89: ifeq -> 102
      //   92: iload #11
      //   94: iload #10
      //   96: if_icmpgt -> 115
      //   99: goto -> 109
      //   102: iload #11
      //   104: iload #10
      //   106: if_icmpge -> 115
      //   109: iconst_1
      //   110: istore #7
      //   112: goto -> 118
      //   115: iconst_0
      //   116: istore #7
      //   118: iload #5
      //   120: ifeq -> 133
      //   123: iload #12
      //   125: iload #9
      //   127: if_icmplt -> 143
      //   130: goto -> 140
      //   133: iload #12
      //   135: iload #9
      //   137: if_icmple -> 143
      //   140: iconst_1
      //   141: istore #8
      //   143: iload #7
      //   145: ifeq -> 211
      //   148: iload #8
      //   150: ifeq -> 211
      //   153: iload_3
      //   154: ifeq -> 186
      //   157: iload #4
      //   159: ifeq -> 186
      //   162: iload #11
      //   164: iload #9
      //   166: if_icmplt -> 211
      //   169: iload #12
      //   171: iload #10
      //   173: if_icmpgt -> 211
      //   176: aload_0
      //   177: getfield f : Landroidx/recyclerview/widget/StaggeredGridLayoutManager;
      //   180: aload #13
      //   182: invokevirtual l : (Landroid/view/View;)I
      //   185: ireturn
      //   186: iload #4
      //   188: ifeq -> 194
      //   191: goto -> 176
      //   194: iload #11
      //   196: iload #9
      //   198: if_icmplt -> 176
      //   201: iload #12
      //   203: iload #10
      //   205: if_icmple -> 211
      //   208: goto -> 176
      //   211: iload_1
      //   212: iload #6
      //   214: iadd
      //   215: istore_1
      //   216: goto -> 38
      //   219: iconst_m1
      //   220: ireturn
    }
    
    public View a(int param1Int1, int param1Int2) {
      // Byte code:
      //   0: aconst_null
      //   1: astore #5
      //   3: aconst_null
      //   4: astore #4
      //   6: iload_2
      //   7: iconst_m1
      //   8: if_icmpne -> 123
      //   11: aload_0
      //   12: getfield a : Ljava/util/ArrayList;
      //   15: invokevirtual size : ()I
      //   18: istore_3
      //   19: iconst_0
      //   20: istore_2
      //   21: aload #4
      //   23: astore #5
      //   25: iload_2
      //   26: iload_3
      //   27: if_icmpge -> 238
      //   30: aload_0
      //   31: getfield a : Ljava/util/ArrayList;
      //   34: iload_2
      //   35: invokevirtual get : (I)Ljava/lang/Object;
      //   38: checkcast android/view/View
      //   41: astore #6
      //   43: aload_0
      //   44: getfield f : Landroidx/recyclerview/widget/StaggeredGridLayoutManager;
      //   47: astore #7
      //   49: aload #7
      //   51: getfield z : Z
      //   54: ifeq -> 72
      //   57: aload #4
      //   59: astore #5
      //   61: aload #7
      //   63: aload #6
      //   65: invokevirtual l : (Landroid/view/View;)I
      //   68: iload_1
      //   69: if_icmple -> 238
      //   72: aload_0
      //   73: getfield f : Landroidx/recyclerview/widget/StaggeredGridLayoutManager;
      //   76: astore #5
      //   78: aload #5
      //   80: getfield z : Z
      //   83: ifne -> 100
      //   86: aload #5
      //   88: aload #6
      //   90: invokevirtual l : (Landroid/view/View;)I
      //   93: iload_1
      //   94: if_icmplt -> 100
      //   97: aload #4
      //   99: areturn
      //   100: aload #4
      //   102: astore #5
      //   104: aload #6
      //   106: invokevirtual hasFocusable : ()Z
      //   109: ifeq -> 238
      //   112: iload_2
      //   113: iconst_1
      //   114: iadd
      //   115: istore_2
      //   116: aload #6
      //   118: astore #4
      //   120: goto -> 21
      //   123: aload_0
      //   124: getfield a : Ljava/util/ArrayList;
      //   127: invokevirtual size : ()I
      //   130: iconst_1
      //   131: isub
      //   132: istore_2
      //   133: aload #5
      //   135: astore #4
      //   137: aload #4
      //   139: astore #5
      //   141: iload_2
      //   142: iflt -> 238
      //   145: aload_0
      //   146: getfield a : Ljava/util/ArrayList;
      //   149: iload_2
      //   150: invokevirtual get : (I)Ljava/lang/Object;
      //   153: checkcast android/view/View
      //   156: astore #6
      //   158: aload_0
      //   159: getfield f : Landroidx/recyclerview/widget/StaggeredGridLayoutManager;
      //   162: astore #7
      //   164: aload #7
      //   166: getfield z : Z
      //   169: ifeq -> 187
      //   172: aload #4
      //   174: astore #5
      //   176: aload #7
      //   178: aload #6
      //   180: invokevirtual l : (Landroid/view/View;)I
      //   183: iload_1
      //   184: if_icmpge -> 238
      //   187: aload_0
      //   188: getfield f : Landroidx/recyclerview/widget/StaggeredGridLayoutManager;
      //   191: astore #5
      //   193: aload #5
      //   195: getfield z : Z
      //   198: ifne -> 215
      //   201: aload #5
      //   203: aload #6
      //   205: invokevirtual l : (Landroid/view/View;)I
      //   208: iload_1
      //   209: if_icmpgt -> 215
      //   212: aload #4
      //   214: areturn
      //   215: aload #4
      //   217: astore #5
      //   219: aload #6
      //   221: invokevirtual hasFocusable : ()Z
      //   224: ifeq -> 238
      //   227: iload_2
      //   228: iconst_1
      //   229: isub
      //   230: istore_2
      //   231: aload #6
      //   233: astore #4
      //   235: goto -> 137
      //   238: aload #5
      //   240: areturn
    }
    
    void a() {
      ArrayList<View> arrayList = this.a;
      View view = arrayList.get(arrayList.size() - 1);
      StaggeredGridLayoutManager.c c = b(view);
      this.c = this.f.u.a(view);
      if (c.f) {
        StaggeredGridLayoutManager.d.a a = this.f.E.c(c.a());
        if (a != null && a.d == 1)
          this.c += a.a(this.e); 
      } 
    }
    
    void a(View param1View) {
      StaggeredGridLayoutManager.c c = b(param1View);
      c.e = this;
      this.a.add(param1View);
      this.c = Integer.MIN_VALUE;
      if (this.a.size() == 1)
        this.b = Integer.MIN_VALUE; 
      if (c.c() || c.b())
        this.d += this.f.u.b(param1View); 
    }
    
    void a(boolean param1Boolean, int param1Int) {
      int i;
      if (param1Boolean) {
        i = a(-2147483648);
      } else {
        i = b(-2147483648);
      } 
      c();
      if (i == Integer.MIN_VALUE)
        return; 
      if ((param1Boolean && i < this.f.u.b()) || (!param1Boolean && i > this.f.u.f()))
        return; 
      int j = i;
      if (param1Int != Integer.MIN_VALUE)
        j = i + param1Int; 
      this.c = j;
      this.b = j;
    }
    
    int b(int param1Int) {
      int i = this.b;
      if (i != Integer.MIN_VALUE)
        return i; 
      if (this.a.size() == 0)
        return param1Int; 
      b();
      return this.b;
    }
    
    StaggeredGridLayoutManager.c b(View param1View) {
      return (StaggeredGridLayoutManager.c)param1View.getLayoutParams();
    }
    
    void b() {
      View view = this.a.get(0);
      StaggeredGridLayoutManager.c c = b(view);
      this.b = this.f.u.d(view);
      if (c.f) {
        StaggeredGridLayoutManager.d.a a = this.f.E.c(c.a());
        if (a != null && a.d == -1)
          this.b -= a.a(this.e); 
      } 
    }
    
    void c() {
      this.a.clear();
      i();
      this.d = 0;
    }
    
    void c(int param1Int) {
      int i = this.b;
      if (i != Integer.MIN_VALUE)
        this.b = i + param1Int; 
      i = this.c;
      if (i != Integer.MIN_VALUE)
        this.c = i + param1Int; 
    }
    
    void c(View param1View) {
      StaggeredGridLayoutManager.c c = b(param1View);
      c.e = this;
      this.a.add(0, param1View);
      this.b = Integer.MIN_VALUE;
      if (this.a.size() == 1)
        this.c = Integer.MIN_VALUE; 
      if (c.c() || c.b())
        this.d += this.f.u.b(param1View); 
    }
    
    public int d() {
      boolean bool;
      int i;
      if (this.f.z) {
        bool = this.a.size() - 1;
        i = -1;
      } else {
        bool = false;
        i = this.a.size();
      } 
      return a(bool, i, true);
    }
    
    void d(int param1Int) {
      this.b = param1Int;
      this.c = param1Int;
    }
    
    public int e() {
      int i;
      byte b;
      if (this.f.z) {
        i = 0;
        b = this.a.size();
      } else {
        i = this.a.size() - 1;
        b = -1;
      } 
      return a(i, b, true);
    }
    
    public int f() {
      return this.d;
    }
    
    int g() {
      int i = this.c;
      if (i != Integer.MIN_VALUE)
        return i; 
      a();
      return this.c;
    }
    
    int h() {
      int i = this.b;
      if (i != Integer.MIN_VALUE)
        return i; 
      b();
      return this.b;
    }
    
    void i() {
      this.b = Integer.MIN_VALUE;
      this.c = Integer.MIN_VALUE;
    }
    
    void j() {
      int i = this.a.size();
      View view = this.a.remove(i - 1);
      StaggeredGridLayoutManager.c c = b(view);
      c.e = null;
      if (c.c() || c.b())
        this.d -= this.f.u.b(view); 
      if (i == 1)
        this.b = Integer.MIN_VALUE; 
      this.c = Integer.MIN_VALUE;
    }
    
    void k() {
      View view = this.a.remove(0);
      StaggeredGridLayoutManager.c c = b(view);
      c.e = null;
      if (this.a.size() == 0)
        this.c = Integer.MIN_VALUE; 
      if (c.c() || c.b())
        this.d -= this.f.u.b(view); 
      this.b = Integer.MIN_VALUE;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/recyclerview/widget/StaggeredGridLayoutManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */