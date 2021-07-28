package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.b;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.view.menu.o;
import androidx.appcompat.view.menu.q;
import androidx.appcompat.view.menu.s;
import b.a.g;
import b.g.m.b;
import java.util.ArrayList;

class c extends b implements b.a {
  c A;
  
  private b B;
  
  final f C = new f(this);
  
  int D;
  
  d k;
  
  private Drawable l;
  
  private boolean m;
  
  private boolean n;
  
  private boolean o;
  
  private int p;
  
  private int q;
  
  private int r;
  
  private boolean s;
  
  private boolean t;
  
  private boolean u;
  
  private boolean v;
  
  private int w;
  
  private final SparseBooleanArray x = new SparseBooleanArray();
  
  e y;
  
  a z;
  
  public c(Context paramContext) {
    super(paramContext, g.abc_action_menu_layout, g.abc_action_menu_item_layout);
  }
  
  private View a(MenuItem paramMenuItem) {
    ViewGroup viewGroup = (ViewGroup)this.j;
    if (viewGroup == null)
      return null; 
    int j = viewGroup.getChildCount();
    for (int i = 0; i < j; i++) {
      View view = viewGroup.getChildAt(i);
      if (view instanceof o.a && ((o.a)view).getItemData() == paramMenuItem)
        return view; 
    } 
    return null;
  }
  
  public View a(j paramj, View paramView, ViewGroup paramViewGroup) {
    boolean bool;
    View view = paramj.getActionView();
    if (view == null || paramj.f())
      view = super.a(paramj, paramView, paramViewGroup); 
    if (paramj.isActionViewExpanded()) {
      bool = true;
    } else {
      bool = false;
    } 
    view.setVisibility(bool);
    ActionMenuView actionMenuView = (ActionMenuView)paramViewGroup;
    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
    if (!actionMenuView.checkLayoutParams(layoutParams))
      view.setLayoutParams((ViewGroup.LayoutParams)actionMenuView.generateLayoutParams(layoutParams)); 
    return view;
  }
  
  public void a(Context paramContext, g paramg) {
    super.a(paramContext, paramg);
    Resources resources = paramContext.getResources();
    b.a.o.a a1 = b.a.o.a.a(paramContext);
    if (!this.o)
      this.n = a1.g(); 
    if (!this.u)
      this.p = a1.b(); 
    if (!this.s)
      this.r = a1.c(); 
    int i = this.p;
    if (this.n) {
      if (this.k == null) {
        this.k = new d(this, this.c);
        if (this.m) {
          this.k.setImageDrawable(this.l);
          this.l = null;
          this.m = false;
        } 
        int j = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.k.measure(j, j);
      } 
      i -= this.k.getMeasuredWidth();
    } else {
      this.k = null;
    } 
    this.q = i;
    this.w = (int)((resources.getDisplayMetrics()).density * 56.0F);
  }
  
  public void a(Configuration paramConfiguration) {
    if (!this.s)
      this.r = b.a.o.a.a(this.d).c(); 
    g g = this.e;
    if (g != null)
      g.b(true); 
  }
  
  public void a(Drawable paramDrawable) {
    d d1 = this.k;
    if (d1 != null) {
      d1.setImageDrawable(paramDrawable);
      return;
    } 
    this.m = true;
    this.l = paramDrawable;
  }
  
  public void a(g paramg, boolean paramBoolean) {
    c();
    super.a(paramg, paramBoolean);
  }
  
  public void a(j paramj, o.a parama) {
    parama.a(paramj, 0);
    ActionMenuView actionMenuView = (ActionMenuView)this.j;
    ActionMenuItemView actionMenuItemView = (ActionMenuItemView)parama;
    actionMenuItemView.setItemInvoker(actionMenuView);
    if (this.B == null)
      this.B = new b(this); 
    actionMenuItemView.setPopupCallback(this.B);
  }
  
  public void a(ActionMenuView paramActionMenuView) {
    this.j = paramActionMenuView;
    paramActionMenuView.a(this.e);
  }
  
  public void a(boolean paramBoolean) {
    ViewGroup viewGroup;
    super.a(paramBoolean);
    ((View)this.j).requestLayout();
    g<j> g = this.e;
    byte b1 = 0;
    if (g != null) {
      ArrayList<j> arrayList = g.c();
      int k = arrayList.size();
      for (int j = 0; j < k; j++) {
        b b2 = ((j)arrayList.get(j)).a();
        if (b2 != null)
          b2.a(this); 
      } 
    } 
    g = this.e;
    if (g != null) {
      ArrayList arrayList = g.j();
    } else {
      g = null;
    } 
    int i = b1;
    if (this.n) {
      i = b1;
      if (g != null) {
        int j = g.size();
        if (j == 1) {
          i = ((j)g.get(0)).isActionViewExpanded() ^ true;
        } else {
          i = b1;
          if (j > 0)
            i = 1; 
        } 
      } 
    } 
    d d1 = this.k;
    if (i != 0) {
      if (d1 == null)
        this.k = new d(this, this.c); 
      viewGroup = (ViewGroup)this.k.getParent();
      if (viewGroup != this.j) {
        if (viewGroup != null)
          viewGroup.removeView((View)this.k); 
        viewGroup = (ActionMenuView)this.j;
        viewGroup.addView((View)this.k, (ViewGroup.LayoutParams)viewGroup.e());
      } 
    } else if (viewGroup != null) {
      ViewParent viewParent = viewGroup.getParent();
      o o = this.j;
      if (viewParent == o)
        ((ViewGroup)o).removeView((View)this.k); 
    } 
    ((ActionMenuView)this.j).setOverflowReserved(this.n);
  }
  
  public boolean a() {
    // Byte code:
    //   0: aload_0
    //   1: astore #18
    //   3: aload #18
    //   5: getfield e : Landroidx/appcompat/view/menu/g;
    //   8: astore #17
    //   10: aload #17
    //   12: ifnull -> 32
    //   15: aload #17
    //   17: invokevirtual n : ()Ljava/util/ArrayList;
    //   20: astore #17
    //   22: aload #17
    //   24: invokevirtual size : ()I
    //   27: istore #4
    //   29: goto -> 38
    //   32: aconst_null
    //   33: astore #17
    //   35: iconst_0
    //   36: istore #4
    //   38: aload #18
    //   40: getfield r : I
    //   43: istore_1
    //   44: aload #18
    //   46: getfield q : I
    //   49: istore #9
    //   51: iconst_0
    //   52: iconst_0
    //   53: invokestatic makeMeasureSpec : (II)I
    //   56: istore #11
    //   58: aload #18
    //   60: getfield j : Landroidx/appcompat/view/menu/o;
    //   63: checkcast android/view/ViewGroup
    //   66: astore #19
    //   68: iconst_0
    //   69: istore #5
    //   71: iconst_0
    //   72: istore #6
    //   74: iconst_0
    //   75: istore_2
    //   76: iconst_0
    //   77: istore_3
    //   78: iload #5
    //   80: iload #4
    //   82: if_icmpge -> 167
    //   85: aload #17
    //   87: iload #5
    //   89: invokevirtual get : (I)Ljava/lang/Object;
    //   92: checkcast androidx/appcompat/view/menu/j
    //   95: astore #20
    //   97: aload #20
    //   99: invokevirtual k : ()Z
    //   102: ifeq -> 112
    //   105: iload_2
    //   106: iconst_1
    //   107: iadd
    //   108: istore_2
    //   109: goto -> 130
    //   112: aload #20
    //   114: invokevirtual j : ()Z
    //   117: ifeq -> 127
    //   120: iload_3
    //   121: iconst_1
    //   122: iadd
    //   123: istore_3
    //   124: goto -> 130
    //   127: iconst_1
    //   128: istore #6
    //   130: iload_1
    //   131: istore #7
    //   133: aload #18
    //   135: getfield v : Z
    //   138: ifeq -> 155
    //   141: iload_1
    //   142: istore #7
    //   144: aload #20
    //   146: invokevirtual isActionViewExpanded : ()Z
    //   149: ifeq -> 155
    //   152: iconst_0
    //   153: istore #7
    //   155: iload #5
    //   157: iconst_1
    //   158: iadd
    //   159: istore #5
    //   161: iload #7
    //   163: istore_1
    //   164: goto -> 78
    //   167: iload_1
    //   168: istore #5
    //   170: aload #18
    //   172: getfield n : Z
    //   175: ifeq -> 198
    //   178: iload #6
    //   180: ifne -> 193
    //   183: iload_1
    //   184: istore #5
    //   186: iload_3
    //   187: iload_2
    //   188: iadd
    //   189: iload_1
    //   190: if_icmple -> 198
    //   193: iload_1
    //   194: iconst_1
    //   195: isub
    //   196: istore #5
    //   198: iload #5
    //   200: iload_2
    //   201: isub
    //   202: istore_1
    //   203: aload #18
    //   205: getfield x : Landroid/util/SparseBooleanArray;
    //   208: astore #20
    //   210: aload #20
    //   212: invokevirtual clear : ()V
    //   215: aload #18
    //   217: getfield t : Z
    //   220: ifeq -> 247
    //   223: aload #18
    //   225: getfield w : I
    //   228: istore_2
    //   229: iload #9
    //   231: iload_2
    //   232: idiv
    //   233: istore_3
    //   234: iload_2
    //   235: iload #9
    //   237: iload_2
    //   238: irem
    //   239: iload_3
    //   240: idiv
    //   241: iadd
    //   242: istore #8
    //   244: goto -> 252
    //   247: iconst_0
    //   248: istore #8
    //   250: iconst_0
    //   251: istore_3
    //   252: iload #9
    //   254: istore #5
    //   256: iconst_0
    //   257: istore #10
    //   259: iconst_0
    //   260: istore_2
    //   261: iload #4
    //   263: istore #9
    //   265: aload_0
    //   266: astore #18
    //   268: iload #10
    //   270: iload #9
    //   272: if_icmpge -> 759
    //   275: aload #17
    //   277: iload #10
    //   279: invokevirtual get : (I)Ljava/lang/Object;
    //   282: checkcast androidx/appcompat/view/menu/j
    //   285: astore #21
    //   287: aload #21
    //   289: invokevirtual k : ()Z
    //   292: ifeq -> 404
    //   295: aload #18
    //   297: aload #21
    //   299: aconst_null
    //   300: aload #19
    //   302: invokevirtual a : (Landroidx/appcompat/view/menu/j;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    //   305: astore #22
    //   307: aload #18
    //   309: getfield t : Z
    //   312: ifeq -> 332
    //   315: iload_3
    //   316: aload #22
    //   318: iload #8
    //   320: iload_3
    //   321: iload #11
    //   323: iconst_0
    //   324: invokestatic a : (Landroid/view/View;IIII)I
    //   327: isub
    //   328: istore_3
    //   329: goto -> 341
    //   332: aload #22
    //   334: iload #11
    //   336: iload #11
    //   338: invokevirtual measure : (II)V
    //   341: aload #22
    //   343: invokevirtual getMeasuredWidth : ()I
    //   346: istore #4
    //   348: iload #5
    //   350: iload #4
    //   352: isub
    //   353: istore #6
    //   355: iload_2
    //   356: ifne -> 365
    //   359: iload #4
    //   361: istore_2
    //   362: goto -> 365
    //   365: aload #21
    //   367: invokevirtual getGroupId : ()I
    //   370: istore #4
    //   372: iload #4
    //   374: ifeq -> 385
    //   377: aload #20
    //   379: iload #4
    //   381: iconst_1
    //   382: invokevirtual put : (IZ)V
    //   385: aload #21
    //   387: iconst_1
    //   388: invokevirtual d : (Z)V
    //   391: iload_2
    //   392: istore #4
    //   394: iload #6
    //   396: istore #5
    //   398: iload #4
    //   400: istore_2
    //   401: goto -> 750
    //   404: aload #21
    //   406: invokevirtual j : ()Z
    //   409: ifeq -> 744
    //   412: aload #21
    //   414: invokevirtual getGroupId : ()I
    //   417: istore #12
    //   419: aload #20
    //   421: iload #12
    //   423: invokevirtual get : (I)Z
    //   426: istore #16
    //   428: iload_1
    //   429: ifgt -> 437
    //   432: iload #16
    //   434: ifeq -> 460
    //   437: iload #5
    //   439: ifle -> 460
    //   442: aload #18
    //   444: getfield t : Z
    //   447: ifeq -> 454
    //   450: iload_3
    //   451: ifle -> 460
    //   454: iconst_1
    //   455: istore #13
    //   457: goto -> 463
    //   460: iconst_0
    //   461: istore #13
    //   463: iload #13
    //   465: istore #14
    //   467: iload #13
    //   469: istore #15
    //   471: iload_3
    //   472: istore #7
    //   474: iload #5
    //   476: istore #6
    //   478: iload_2
    //   479: istore #4
    //   481: iload #13
    //   483: ifeq -> 620
    //   486: aload #18
    //   488: aload #21
    //   490: aconst_null
    //   491: aload #19
    //   493: invokevirtual a : (Landroidx/appcompat/view/menu/j;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    //   496: astore #22
    //   498: aload #18
    //   500: getfield t : Z
    //   503: ifeq -> 542
    //   506: aload #22
    //   508: iload #8
    //   510: iload_3
    //   511: iload #11
    //   513: iconst_0
    //   514: invokestatic a : (Landroid/view/View;IIII)I
    //   517: istore #4
    //   519: iload_3
    //   520: iload #4
    //   522: isub
    //   523: istore_3
    //   524: iload #4
    //   526: ifne -> 535
    //   529: iconst_0
    //   530: istore #13
    //   532: goto -> 539
    //   535: iload #14
    //   537: istore #13
    //   539: goto -> 555
    //   542: aload #22
    //   544: iload #11
    //   546: iload #11
    //   548: invokevirtual measure : (II)V
    //   551: iload #14
    //   553: istore #13
    //   555: aload #22
    //   557: invokevirtual getMeasuredWidth : ()I
    //   560: istore #7
    //   562: iload #5
    //   564: iload #7
    //   566: isub
    //   567: istore #6
    //   569: iload_2
    //   570: istore #4
    //   572: iload_2
    //   573: ifne -> 580
    //   576: iload #7
    //   578: istore #4
    //   580: aload #18
    //   582: getfield t : Z
    //   585: ifeq -> 596
    //   588: iload #6
    //   590: iflt -> 609
    //   593: goto -> 604
    //   596: iload #6
    //   598: iload #4
    //   600: iadd
    //   601: ifle -> 609
    //   604: iconst_1
    //   605: istore_2
    //   606: goto -> 611
    //   609: iconst_0
    //   610: istore_2
    //   611: iload #13
    //   613: iload_2
    //   614: iand
    //   615: istore #15
    //   617: iload_3
    //   618: istore #7
    //   620: iload #15
    //   622: ifeq -> 643
    //   625: iload #12
    //   627: ifeq -> 643
    //   630: aload #20
    //   632: iload #12
    //   634: iconst_1
    //   635: invokevirtual put : (IZ)V
    //   638: iload_1
    //   639: istore_2
    //   640: goto -> 720
    //   643: iload_1
    //   644: istore_2
    //   645: iload #16
    //   647: ifeq -> 720
    //   650: aload #20
    //   652: iload #12
    //   654: iconst_0
    //   655: invokevirtual put : (IZ)V
    //   658: iconst_0
    //   659: istore_3
    //   660: iload_1
    //   661: istore_2
    //   662: iload_3
    //   663: iload #10
    //   665: if_icmpge -> 720
    //   668: aload #17
    //   670: iload_3
    //   671: invokevirtual get : (I)Ljava/lang/Object;
    //   674: checkcast androidx/appcompat/view/menu/j
    //   677: astore #18
    //   679: iload_1
    //   680: istore_2
    //   681: aload #18
    //   683: invokevirtual getGroupId : ()I
    //   686: iload #12
    //   688: if_icmpne -> 711
    //   691: iload_1
    //   692: istore_2
    //   693: aload #18
    //   695: invokevirtual h : ()Z
    //   698: ifeq -> 705
    //   701: iload_1
    //   702: iconst_1
    //   703: iadd
    //   704: istore_2
    //   705: aload #18
    //   707: iconst_0
    //   708: invokevirtual d : (Z)V
    //   711: iload_3
    //   712: iconst_1
    //   713: iadd
    //   714: istore_3
    //   715: iload_2
    //   716: istore_1
    //   717: goto -> 660
    //   720: iload_2
    //   721: istore_1
    //   722: iload #15
    //   724: ifeq -> 731
    //   727: iload_2
    //   728: iconst_1
    //   729: isub
    //   730: istore_1
    //   731: aload #21
    //   733: iload #15
    //   735: invokevirtual d : (Z)V
    //   738: iload #7
    //   740: istore_3
    //   741: goto -> 394
    //   744: aload #21
    //   746: iconst_0
    //   747: invokevirtual d : (Z)V
    //   750: iload #10
    //   752: iconst_1
    //   753: iadd
    //   754: istore #10
    //   756: goto -> 265
    //   759: iconst_1
    //   760: ireturn
  }
  
  public boolean a(int paramInt, j paramj) {
    return paramj.h();
  }
  
  public boolean a(ViewGroup paramViewGroup, int paramInt) {
    return (paramViewGroup.getChildAt(paramInt) == this.k) ? false : super.a(paramViewGroup, paramInt);
  }
  
  public boolean a(s params) {
    boolean bool = params.hasVisibleItems();
    boolean bool1 = false;
    if (!bool)
      return false; 
    s s1;
    for (s1 = params; s1.t() != this.e; s1 = (s)s1.t());
    View view = a(s1.getItem());
    if (view == null)
      return false; 
    params.getItem().getItemId();
    int j = params.size();
    int i = 0;
    while (true) {
      bool = bool1;
      if (i < j) {
        MenuItem menuItem = params.getItem(i);
        if (menuItem.isVisible() && menuItem.getIcon() != null) {
          bool = true;
          break;
        } 
        i++;
        continue;
      } 
      break;
    } 
    this.z = new a(this, this.d, params, view);
    this.z.a(bool);
    this.z.e();
    super.a(params);
    return true;
  }
  
  public o b(ViewGroup paramViewGroup) {
    o o2 = this.j;
    o o1 = super.b(paramViewGroup);
    if (o2 != o1)
      ((ActionMenuView)o1).setPresenter(this); 
    return o1;
  }
  
  public void b(boolean paramBoolean) {
    this.v = paramBoolean;
  }
  
  public void c(boolean paramBoolean) {
    this.n = paramBoolean;
    this.o = true;
  }
  
  public boolean c() {
    return e() | f();
  }
  
  public Drawable d() {
    d d1 = this.k;
    return (d1 != null) ? d1.getDrawable() : (this.m ? this.l : null);
  }
  
  public boolean e() {
    c c1 = this.A;
    if (c1 != null) {
      o o = this.j;
      if (o != null) {
        ((View)o).removeCallbacks(c1);
        this.A = null;
        return true;
      } 
    } 
    e e1 = this.y;
    if (e1 != null) {
      e1.a();
      return true;
    } 
    return false;
  }
  
  public boolean f() {
    a a1 = this.z;
    if (a1 != null) {
      a1.a();
      return true;
    } 
    return false;
  }
  
  public boolean g() {
    return (this.A != null || h());
  }
  
  public boolean h() {
    e e1 = this.y;
    return (e1 != null && e1.c());
  }
  
  public boolean i() {
    if (this.n && !h()) {
      g g = this.e;
      if (g != null && this.j != null && this.A == null && !g.j().isEmpty()) {
        this.A = new c(this, new e(this, this.d, this.e, (View)this.k, true));
        ((View)this.j).post(this.A);
        return true;
      } 
    } 
    return false;
  }
  
  private class a extends m {
    public a(c this$0, Context param1Context, s param1s, View param1View) {
      super(param1Context, (g)param1s, param1View, false, b.a.a.actionOverflowMenuStyle);
      if (!((j)param1s.getItem()).h()) {
        View view;
        c.d d2 = this$0.k;
        c.d d1 = d2;
        if (d2 == null)
          view = (View)c.c(this$0); 
        a(view);
      } 
      a(this$0.C);
    }
    
    protected void d() {
      c c1 = this.m;
      c1.z = null;
      c1.D = 0;
      super.d();
    }
  }
  
  private class b extends ActionMenuItemView.b {
    b(c this$0) {}
    
    public q a() {
      c.a a = this.a.z;
      return (q)((a != null) ? a.b() : null);
    }
  }
  
  private class c implements Runnable {
    private c.e c;
    
    public c(c this$0, c.e param1e) {
      this.c = param1e;
    }
    
    public void run() {
      if (c.e(this.d) != null)
        c.f(this.d).a(); 
      View view = (View)c.g(this.d);
      if (view != null && view.getWindowToken() != null && this.c.f())
        this.d.y = this.c; 
      this.d.A = null;
    }
  }
  
  private class d extends o implements ActionMenuView.a {
    public d(c this$0, Context param1Context) {
      super(param1Context, null, b.a.a.actionOverflowButtonStyle);
      setClickable(true);
      setFocusable(true);
      setVisibility(0);
      setEnabled(true);
      z0.a((View)this, getContentDescription());
      setOnTouchListener(new a(this, (View)this, this$0));
    }
    
    public boolean b() {
      return false;
    }
    
    public boolean c() {
      return false;
    }
    
    public boolean performClick() {
      if (super.performClick())
        return true; 
      playSoundEffect(0);
      this.e.i();
      return true;
    }
    
    protected boolean setFrame(int param1Int1, int param1Int2, int param1Int3, int param1Int4) {
      boolean bool = super.setFrame(param1Int1, param1Int2, param1Int3, param1Int4);
      Drawable drawable1 = getDrawable();
      Drawable drawable2 = getBackground();
      if (drawable1 != null && drawable2 != null) {
        int i = getWidth();
        param1Int2 = getHeight();
        param1Int1 = Math.max(i, param1Int2) / 2;
        int j = getPaddingLeft();
        int k = getPaddingRight();
        param1Int3 = getPaddingTop();
        param1Int4 = getPaddingBottom();
        i = (i + j - k) / 2;
        param1Int2 = (param1Int2 + param1Int3 - param1Int4) / 2;
        androidx.core.graphics.drawable.a.a(drawable2, i - param1Int1, param1Int2 - param1Int1, i + param1Int1, param1Int2 + param1Int1);
      } 
      return bool;
    }
    
    class a extends h0 {
      a(c.d this$0, View param2View, c param2c) {
        super(param2View);
      }
      
      public q a() {
        c.e e = this.l.e.y;
        return (q)((e == null) ? null : e.b());
      }
      
      public boolean b() {
        this.l.e.i();
        return true;
      }
      
      public boolean c() {
        c c = this.l.e;
        if (c.A != null)
          return false; 
        c.e();
        return true;
      }
    }
  }
  
  class a extends h0 {
    a(c this$0, View param1View, c param1c) {
      super(param1View);
    }
    
    public q a() {
      c.e e = this.l.e.y;
      return (q)((e == null) ? null : e.b());
    }
    
    public boolean b() {
      this.l.e.i();
      return true;
    }
    
    public boolean c() {
      c c = this.l.e;
      if (c.A != null)
        return false; 
      c.e();
      return true;
    }
  }
  
  private class e extends m {
    public e(c this$0, Context param1Context, g param1g, View param1View, boolean param1Boolean) {
      super(param1Context, param1g, param1View, param1Boolean, b.a.a.actionOverflowMenuStyle);
      a(8388613);
      a(this$0.C);
    }
    
    protected void d() {
      if (c.a(this.m) != null)
        c.b(this.m).close(); 
      this.m.y = null;
      super.d();
    }
  }
  
  private class f implements n.a {
    f(c this$0) {}
    
    public void a(g param1g, boolean param1Boolean) {
      if (param1g instanceof s)
        param1g.m().a(false); 
      n.a a1 = this.c.b();
      if (a1 != null)
        a1.a(param1g, param1Boolean); 
    }
    
    public boolean a(g param1g) {
      g g1 = c.d(this.c);
      boolean bool = false;
      if (param1g == g1)
        return false; 
      this.c.D = ((s)param1g).getItem().getItemId();
      n.a a1 = this.c.b();
      if (a1 != null)
        bool = a1.a(param1g); 
      return bool;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/appcompat/widget/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */