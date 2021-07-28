package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.widget.k0;
import androidx.appcompat.widget.l0;
import b.a.g;
import b.g.m.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class d extends l implements n, View.OnKeyListener, PopupWindow.OnDismissListener {
  private static final int D = g.abc_cascading_menu_item_layout;
  
  ViewTreeObserver A;
  
  private PopupWindow.OnDismissListener B;
  
  boolean C;
  
  private final Context d;
  
  private final int e;
  
  private final int f;
  
  private final int g;
  
  private final boolean h;
  
  final Handler i;
  
  private final List<g> j = new ArrayList<g>();
  
  final List<d> k = new ArrayList<d>();
  
  final ViewTreeObserver.OnGlobalLayoutListener l = new a(this);
  
  private final View.OnAttachStateChangeListener m = new b(this);
  
  private final k0 n = new c(this);
  
  private int o = 0;
  
  private int p = 0;
  
  private View q;
  
  View r;
  
  private int s;
  
  private boolean t;
  
  private boolean u;
  
  private int v;
  
  private int w;
  
  private boolean x;
  
  private boolean y;
  
  private n.a z;
  
  public d(Context paramContext, View paramView, int paramInt1, int paramInt2, boolean paramBoolean) {
    this.d = paramContext;
    this.q = paramView;
    this.f = paramInt1;
    this.g = paramInt2;
    this.h = paramBoolean;
    this.x = false;
    this.s = h();
    Resources resources = paramContext.getResources();
    this.e = Math.max((resources.getDisplayMetrics()).widthPixels / 2, resources.getDimensionPixelSize(b.a.d.abc_config_prefDialogWidth));
    this.i = new Handler();
  }
  
  private MenuItem a(g paramg1, g paramg2) {
    int j = paramg1.size();
    for (int i = 0; i < j; i++) {
      MenuItem menuItem = paramg1.getItem(i);
      if (menuItem.hasSubMenu() && paramg2 == menuItem.getSubMenu())
        return menuItem; 
    } 
    return null;
  }
  
  private View a(d paramd, g paramg) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: getfield b : Landroidx/appcompat/view/menu/g;
    //   5: aload_2
    //   6: invokespecial a : (Landroidx/appcompat/view/menu/g;Landroidx/appcompat/view/menu/g;)Landroid/view/MenuItem;
    //   9: astore_2
    //   10: aload_2
    //   11: ifnonnull -> 16
    //   14: aconst_null
    //   15: areturn
    //   16: aload_1
    //   17: invokevirtual a : ()Landroid/widget/ListView;
    //   20: astore #7
    //   22: aload #7
    //   24: invokevirtual getAdapter : ()Landroid/widget/ListAdapter;
    //   27: astore_1
    //   28: aload_1
    //   29: instanceof android/widget/HeaderViewListAdapter
    //   32: istore #6
    //   34: iconst_0
    //   35: istore_3
    //   36: iload #6
    //   38: ifeq -> 63
    //   41: aload_1
    //   42: checkcast android/widget/HeaderViewListAdapter
    //   45: astore_1
    //   46: aload_1
    //   47: invokevirtual getHeadersCount : ()I
    //   50: istore #4
    //   52: aload_1
    //   53: invokevirtual getWrappedAdapter : ()Landroid/widget/ListAdapter;
    //   56: checkcast androidx/appcompat/view/menu/f
    //   59: astore_1
    //   60: goto -> 71
    //   63: aload_1
    //   64: checkcast androidx/appcompat/view/menu/f
    //   67: astore_1
    //   68: iconst_0
    //   69: istore #4
    //   71: aload_1
    //   72: invokevirtual getCount : ()I
    //   75: istore #5
    //   77: iload_3
    //   78: iload #5
    //   80: if_icmpge -> 102
    //   83: aload_2
    //   84: aload_1
    //   85: iload_3
    //   86: invokevirtual getItem : (I)Landroidx/appcompat/view/menu/j;
    //   89: if_acmpne -> 95
    //   92: goto -> 104
    //   95: iload_3
    //   96: iconst_1
    //   97: iadd
    //   98: istore_3
    //   99: goto -> 77
    //   102: iconst_m1
    //   103: istore_3
    //   104: iload_3
    //   105: iconst_m1
    //   106: if_icmpne -> 111
    //   109: aconst_null
    //   110: areturn
    //   111: iload_3
    //   112: iload #4
    //   114: iadd
    //   115: aload #7
    //   117: invokevirtual getFirstVisiblePosition : ()I
    //   120: isub
    //   121: istore_3
    //   122: iload_3
    //   123: iflt -> 144
    //   126: iload_3
    //   127: aload #7
    //   129: invokevirtual getChildCount : ()I
    //   132: if_icmplt -> 137
    //   135: aconst_null
    //   136: areturn
    //   137: aload #7
    //   139: iload_3
    //   140: invokevirtual getChildAt : (I)Landroid/view/View;
    //   143: areturn
    //   144: aconst_null
    //   145: areturn
  }
  
  private int c(g paramg) {
    int j = this.k.size();
    for (int i = 0; i < j; i++) {
      if (paramg == ((d)this.k.get(i)).b)
        return i; 
    } 
    return -1;
  }
  
  private int d(int paramInt) {
    List<d> list = this.k;
    ListView listView = ((d)list.get(list.size() - 1)).a();
    int[] arrayOfInt = new int[2];
    listView.getLocationOnScreen(arrayOfInt);
    Rect rect = new Rect();
    this.r.getWindowVisibleDisplayFrame(rect);
    return (this.s == 1) ? ((arrayOfInt[0] + listView.getWidth() + paramInt > rect.right) ? 0 : 1) : ((arrayOfInt[0] - paramInt < 0) ? 1 : 0);
  }
  
  private void d(g paramg) {
    // Byte code:
    //   0: aload_0
    //   1: getfield d : Landroid/content/Context;
    //   4: invokestatic from : (Landroid/content/Context;)Landroid/view/LayoutInflater;
    //   7: astore #9
    //   9: new androidx/appcompat/view/menu/f
    //   12: dup
    //   13: aload_1
    //   14: aload #9
    //   16: aload_0
    //   17: getfield h : Z
    //   20: getstatic androidx/appcompat/view/menu/d.D : I
    //   23: invokespecial <init> : (Landroidx/appcompat/view/menu/g;Landroid/view/LayoutInflater;ZI)V
    //   26: astore #6
    //   28: aload_0
    //   29: invokevirtual b : ()Z
    //   32: ifne -> 51
    //   35: aload_0
    //   36: getfield x : Z
    //   39: ifeq -> 51
    //   42: aload #6
    //   44: iconst_1
    //   45: invokevirtual a : (Z)V
    //   48: goto -> 67
    //   51: aload_0
    //   52: invokevirtual b : ()Z
    //   55: ifeq -> 67
    //   58: aload #6
    //   60: aload_1
    //   61: invokestatic b : (Landroidx/appcompat/view/menu/g;)Z
    //   64: invokevirtual a : (Z)V
    //   67: aload #6
    //   69: aconst_null
    //   70: aload_0
    //   71: getfield d : Landroid/content/Context;
    //   74: aload_0
    //   75: getfield e : I
    //   78: invokestatic a : (Landroid/widget/ListAdapter;Landroid/view/ViewGroup;Landroid/content/Context;I)I
    //   81: istore_3
    //   82: aload_0
    //   83: invokespecial g : ()Landroidx/appcompat/widget/l0;
    //   86: astore #8
    //   88: aload #8
    //   90: aload #6
    //   92: invokevirtual a : (Landroid/widget/ListAdapter;)V
    //   95: aload #8
    //   97: iload_3
    //   98: invokevirtual e : (I)V
    //   101: aload #8
    //   103: aload_0
    //   104: getfield p : I
    //   107: invokevirtual f : (I)V
    //   110: aload_0
    //   111: getfield k : Ljava/util/List;
    //   114: invokeinterface size : ()I
    //   119: ifle -> 161
    //   122: aload_0
    //   123: getfield k : Ljava/util/List;
    //   126: astore #6
    //   128: aload #6
    //   130: aload #6
    //   132: invokeinterface size : ()I
    //   137: iconst_1
    //   138: isub
    //   139: invokeinterface get : (I)Ljava/lang/Object;
    //   144: checkcast androidx/appcompat/view/menu/d$d
    //   147: astore #6
    //   149: aload_0
    //   150: aload #6
    //   152: aload_1
    //   153: invokespecial a : (Landroidx/appcompat/view/menu/d$d;Landroidx/appcompat/view/menu/g;)Landroid/view/View;
    //   156: astore #7
    //   158: goto -> 168
    //   161: aconst_null
    //   162: astore #6
    //   164: aload #6
    //   166: astore #7
    //   168: aload #7
    //   170: ifnull -> 393
    //   173: aload #8
    //   175: iconst_0
    //   176: invokevirtual c : (Z)V
    //   179: aload #8
    //   181: aconst_null
    //   182: invokevirtual a : (Ljava/lang/Object;)V
    //   185: aload_0
    //   186: iload_3
    //   187: invokespecial d : (I)I
    //   190: istore_2
    //   191: iload_2
    //   192: iconst_1
    //   193: if_icmpne -> 202
    //   196: iconst_1
    //   197: istore #4
    //   199: goto -> 205
    //   202: iconst_0
    //   203: istore #4
    //   205: aload_0
    //   206: iload_2
    //   207: putfield s : I
    //   210: getstatic android/os/Build$VERSION.SDK_INT : I
    //   213: bipush #26
    //   215: if_icmplt -> 233
    //   218: aload #8
    //   220: aload #7
    //   222: invokevirtual a : (Landroid/view/View;)V
    //   225: iconst_0
    //   226: istore_2
    //   227: iconst_0
    //   228: istore #5
    //   230: goto -> 321
    //   233: iconst_2
    //   234: newarray int
    //   236: astore #10
    //   238: aload_0
    //   239: getfield q : Landroid/view/View;
    //   242: aload #10
    //   244: invokevirtual getLocationOnScreen : ([I)V
    //   247: iconst_2
    //   248: newarray int
    //   250: astore #11
    //   252: aload #7
    //   254: aload #11
    //   256: invokevirtual getLocationOnScreen : ([I)V
    //   259: aload_0
    //   260: getfield p : I
    //   263: bipush #7
    //   265: iand
    //   266: iconst_5
    //   267: if_icmpne -> 300
    //   270: aload #10
    //   272: iconst_0
    //   273: aload #10
    //   275: iconst_0
    //   276: iaload
    //   277: aload_0
    //   278: getfield q : Landroid/view/View;
    //   281: invokevirtual getWidth : ()I
    //   284: iadd
    //   285: iastore
    //   286: aload #11
    //   288: iconst_0
    //   289: aload #11
    //   291: iconst_0
    //   292: iaload
    //   293: aload #7
    //   295: invokevirtual getWidth : ()I
    //   298: iadd
    //   299: iastore
    //   300: aload #11
    //   302: iconst_0
    //   303: iaload
    //   304: aload #10
    //   306: iconst_0
    //   307: iaload
    //   308: isub
    //   309: istore #5
    //   311: aload #11
    //   313: iconst_1
    //   314: iaload
    //   315: aload #10
    //   317: iconst_1
    //   318: iaload
    //   319: isub
    //   320: istore_2
    //   321: aload_0
    //   322: getfield p : I
    //   325: iconst_5
    //   326: iand
    //   327: iconst_5
    //   328: if_icmpne -> 348
    //   331: iload #4
    //   333: ifeq -> 339
    //   336: goto -> 359
    //   339: aload #7
    //   341: invokevirtual getWidth : ()I
    //   344: istore_3
    //   345: goto -> 367
    //   348: iload #4
    //   350: ifeq -> 367
    //   353: aload #7
    //   355: invokevirtual getWidth : ()I
    //   358: istore_3
    //   359: iload #5
    //   361: iload_3
    //   362: iadd
    //   363: istore_3
    //   364: goto -> 372
    //   367: iload #5
    //   369: iload_3
    //   370: isub
    //   371: istore_3
    //   372: aload #8
    //   374: iload_3
    //   375: invokevirtual c : (I)V
    //   378: aload #8
    //   380: iconst_1
    //   381: invokevirtual b : (Z)V
    //   384: aload #8
    //   386: iload_2
    //   387: invokevirtual a : (I)V
    //   390: goto -> 434
    //   393: aload_0
    //   394: getfield t : Z
    //   397: ifeq -> 409
    //   400: aload #8
    //   402: aload_0
    //   403: getfield v : I
    //   406: invokevirtual c : (I)V
    //   409: aload_0
    //   410: getfield u : Z
    //   413: ifeq -> 425
    //   416: aload #8
    //   418: aload_0
    //   419: getfield w : I
    //   422: invokevirtual a : (I)V
    //   425: aload #8
    //   427: aload_0
    //   428: invokevirtual f : ()Landroid/graphics/Rect;
    //   431: invokevirtual a : (Landroid/graphics/Rect;)V
    //   434: new androidx/appcompat/view/menu/d$d
    //   437: dup
    //   438: aload #8
    //   440: aload_1
    //   441: aload_0
    //   442: getfield s : I
    //   445: invokespecial <init> : (Landroidx/appcompat/widget/l0;Landroidx/appcompat/view/menu/g;I)V
    //   448: astore #7
    //   450: aload_0
    //   451: getfield k : Ljava/util/List;
    //   454: aload #7
    //   456: invokeinterface add : (Ljava/lang/Object;)Z
    //   461: pop
    //   462: aload #8
    //   464: invokevirtual c : ()V
    //   467: aload #8
    //   469: invokevirtual e : ()Landroid/widget/ListView;
    //   472: astore #7
    //   474: aload #7
    //   476: aload_0
    //   477: invokevirtual setOnKeyListener : (Landroid/view/View$OnKeyListener;)V
    //   480: aload #6
    //   482: ifnonnull -> 557
    //   485: aload_0
    //   486: getfield y : Z
    //   489: ifeq -> 557
    //   492: aload_1
    //   493: invokevirtual h : ()Ljava/lang/CharSequence;
    //   496: ifnull -> 557
    //   499: aload #9
    //   501: getstatic b/a/g.abc_popup_menu_header_item_layout : I
    //   504: aload #7
    //   506: iconst_0
    //   507: invokevirtual inflate : (ILandroid/view/ViewGroup;Z)Landroid/view/View;
    //   510: checkcast android/widget/FrameLayout
    //   513: astore #6
    //   515: aload #6
    //   517: ldc_w 16908310
    //   520: invokevirtual findViewById : (I)Landroid/view/View;
    //   523: checkcast android/widget/TextView
    //   526: astore #9
    //   528: aload #6
    //   530: iconst_0
    //   531: invokevirtual setEnabled : (Z)V
    //   534: aload #9
    //   536: aload_1
    //   537: invokevirtual h : ()Ljava/lang/CharSequence;
    //   540: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   543: aload #7
    //   545: aload #6
    //   547: aconst_null
    //   548: iconst_0
    //   549: invokevirtual addHeaderView : (Landroid/view/View;Ljava/lang/Object;Z)V
    //   552: aload #8
    //   554: invokevirtual c : ()V
    //   557: return
  }
  
  private l0 g() {
    l0 l0 = new l0(this.d, null, this.f, this.g);
    l0.a(this.n);
    l0.a(this);
    l0.a(this);
    l0.a(this.q);
    l0.f(this.p);
    l0.a(true);
    l0.g(2);
    return l0;
  }
  
  private int h() {
    int i = v.p(this.q);
    boolean bool = true;
    if (i == 1)
      bool = false; 
    return bool;
  }
  
  public void a(int paramInt) {
    if (this.o != paramInt) {
      this.o = paramInt;
      this.p = b.g.m.d.a(paramInt, v.p(this.q));
    } 
  }
  
  public void a(View paramView) {
    if (this.q != paramView) {
      this.q = paramView;
      this.p = b.g.m.d.a(this.o, v.p(this.q));
    } 
  }
  
  public void a(PopupWindow.OnDismissListener paramOnDismissListener) {
    this.B = paramOnDismissListener;
  }
  
  public void a(g paramg) {
    paramg.a(this, this.d);
    if (b()) {
      d(paramg);
      return;
    } 
    this.j.add(paramg);
  }
  
  public void a(g paramg, boolean paramBoolean) {
    int i = c(paramg);
    if (i < 0)
      return; 
    int j = i + 1;
    if (j < this.k.size())
      ((d)this.k.get(j)).b.a(false); 
    d d1 = this.k.remove(i);
    d1.b.b(this);
    if (this.C) {
      d1.a.b(null);
      d1.a.d(0);
    } 
    d1.a.dismiss();
    j = this.k.size();
    if (j > 0) {
      i = ((d)this.k.get(j - 1)).c;
    } else {
      i = h();
    } 
    this.s = i;
    if (j == 0) {
      dismiss();
      n.a a1 = this.z;
      if (a1 != null)
        a1.a(paramg, true); 
      ViewTreeObserver viewTreeObserver = this.A;
      if (viewTreeObserver != null) {
        if (viewTreeObserver.isAlive())
          this.A.removeGlobalOnLayoutListener(this.l); 
        this.A = null;
      } 
      this.r.removeOnAttachStateChangeListener(this.m);
      this.B.onDismiss();
      return;
    } 
    if (paramBoolean)
      ((d)this.k.get(0)).b.a(false); 
  }
  
  public void a(n.a parama) {
    this.z = parama;
  }
  
  public void a(boolean paramBoolean) {
    Iterator<d> iterator = this.k.iterator();
    while (iterator.hasNext())
      l.a(((d)iterator.next()).a().getAdapter()).notifyDataSetChanged(); 
  }
  
  public boolean a() {
    return false;
  }
  
  public boolean a(s params) {
    for (d d1 : this.k) {
      if (params == d1.b) {
        d1.a().requestFocus();
        return true;
      } 
    } 
    if (params.hasVisibleItems()) {
      a(params);
      n.a a1 = this.z;
      if (a1 != null)
        a1.a(params); 
      return true;
    } 
    return false;
  }
  
  public void b(int paramInt) {
    this.t = true;
    this.v = paramInt;
  }
  
  public void b(boolean paramBoolean) {
    this.x = paramBoolean;
  }
  
  public boolean b() {
    int i = this.k.size();
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (i > 0) {
      bool1 = bool2;
      if (((d)this.k.get(0)).a.b())
        bool1 = true; 
    } 
    return bool1;
  }
  
  public void c() {
    if (b())
      return; 
    Iterator<g> iterator = this.j.iterator();
    while (iterator.hasNext())
      d(iterator.next()); 
    this.j.clear();
    this.r = this.q;
    if (this.r != null) {
      boolean bool;
      if (this.A == null) {
        bool = true;
      } else {
        bool = false;
      } 
      this.A = this.r.getViewTreeObserver();
      if (bool)
        this.A.addOnGlobalLayoutListener(this.l); 
      this.r.addOnAttachStateChangeListener(this.m);
    } 
  }
  
  public void c(int paramInt) {
    this.u = true;
    this.w = paramInt;
  }
  
  public void c(boolean paramBoolean) {
    this.y = paramBoolean;
  }
  
  protected boolean d() {
    return false;
  }
  
  public void dismiss() {
    int i = this.k.size();
    if (i > 0) {
      d[] arrayOfD = this.k.<d>toArray(new d[i]);
      while (--i >= 0) {
        d d1 = arrayOfD[i];
        if (d1.a.b())
          d1.a.dismiss(); 
        i--;
      } 
    } 
  }
  
  public ListView e() {
    if (this.k.isEmpty())
      return null; 
    List<d> list = this.k;
    return ((d)list.get(list.size() - 1)).a();
  }
  
  public void onDismiss() {
    // Byte code:
    //   0: aload_0
    //   1: getfield k : Ljava/util/List;
    //   4: invokeinterface size : ()I
    //   9: istore_2
    //   10: iconst_0
    //   11: istore_1
    //   12: iload_1
    //   13: iload_2
    //   14: if_icmpge -> 51
    //   17: aload_0
    //   18: getfield k : Ljava/util/List;
    //   21: iload_1
    //   22: invokeinterface get : (I)Ljava/lang/Object;
    //   27: checkcast androidx/appcompat/view/menu/d$d
    //   30: astore_3
    //   31: aload_3
    //   32: getfield a : Landroidx/appcompat/widget/l0;
    //   35: invokevirtual b : ()Z
    //   38: ifne -> 44
    //   41: goto -> 53
    //   44: iload_1
    //   45: iconst_1
    //   46: iadd
    //   47: istore_1
    //   48: goto -> 12
    //   51: aconst_null
    //   52: astore_3
    //   53: aload_3
    //   54: ifnull -> 65
    //   57: aload_3
    //   58: getfield b : Landroidx/appcompat/view/menu/g;
    //   61: iconst_0
    //   62: invokevirtual a : (Z)V
    //   65: return
  }
  
  public boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent) {
    if (paramKeyEvent.getAction() == 1 && paramInt == 82) {
      dismiss();
      return true;
    } 
    return false;
  }
  
  class a implements ViewTreeObserver.OnGlobalLayoutListener {
    a(d this$0) {}
    
    public void onGlobalLayout() {
      if (this.c.b() && this.c.k.size() > 0 && !((d.d)this.c.k.get(0)).a.l()) {
        View view = this.c.r;
        if (view == null || !view.isShown()) {
          this.c.dismiss();
          return;
        } 
        Iterator<d.d> iterator = this.c.k.iterator();
        while (iterator.hasNext())
          ((d.d)iterator.next()).a.c(); 
      } 
    }
  }
  
  class b implements View.OnAttachStateChangeListener {
    b(d this$0) {}
    
    public void onViewAttachedToWindow(View param1View) {}
    
    public void onViewDetachedFromWindow(View param1View) {
      ViewTreeObserver viewTreeObserver = this.c.A;
      if (viewTreeObserver != null) {
        if (!viewTreeObserver.isAlive())
          this.c.A = param1View.getViewTreeObserver(); 
        d d1 = this.c;
        d1.A.removeGlobalOnLayoutListener(d1.l);
      } 
      param1View.removeOnAttachStateChangeListener(this);
    }
  }
  
  class c implements k0 {
    c(d this$0) {}
    
    public void a(g param1g, MenuItem param1MenuItem) {
      // Byte code:
      //   0: aload_0
      //   1: getfield c : Landroidx/appcompat/view/menu/d;
      //   4: getfield i : Landroid/os/Handler;
      //   7: astore #8
      //   9: aconst_null
      //   10: astore #7
      //   12: aload #8
      //   14: aconst_null
      //   15: invokevirtual removeCallbacksAndMessages : (Ljava/lang/Object;)V
      //   18: aload_0
      //   19: getfield c : Landroidx/appcompat/view/menu/d;
      //   22: getfield k : Ljava/util/List;
      //   25: invokeinterface size : ()I
      //   30: istore #4
      //   32: iconst_0
      //   33: istore_3
      //   34: iload_3
      //   35: iload #4
      //   37: if_icmpge -> 73
      //   40: aload_1
      //   41: aload_0
      //   42: getfield c : Landroidx/appcompat/view/menu/d;
      //   45: getfield k : Ljava/util/List;
      //   48: iload_3
      //   49: invokeinterface get : (I)Ljava/lang/Object;
      //   54: checkcast androidx/appcompat/view/menu/d$d
      //   57: getfield b : Landroidx/appcompat/view/menu/g;
      //   60: if_acmpne -> 66
      //   63: goto -> 75
      //   66: iload_3
      //   67: iconst_1
      //   68: iadd
      //   69: istore_3
      //   70: goto -> 34
      //   73: iconst_m1
      //   74: istore_3
      //   75: iload_3
      //   76: iconst_m1
      //   77: if_icmpne -> 81
      //   80: return
      //   81: iload_3
      //   82: iconst_1
      //   83: iadd
      //   84: istore_3
      //   85: iload_3
      //   86: aload_0
      //   87: getfield c : Landroidx/appcompat/view/menu/d;
      //   90: getfield k : Ljava/util/List;
      //   93: invokeinterface size : ()I
      //   98: if_icmpge -> 119
      //   101: aload_0
      //   102: getfield c : Landroidx/appcompat/view/menu/d;
      //   105: getfield k : Ljava/util/List;
      //   108: iload_3
      //   109: invokeinterface get : (I)Ljava/lang/Object;
      //   114: checkcast androidx/appcompat/view/menu/d$d
      //   117: astore #7
      //   119: new androidx/appcompat/view/menu/d$c$a
      //   122: dup
      //   123: aload_0
      //   124: aload #7
      //   126: aload_2
      //   127: aload_1
      //   128: invokespecial <init> : (Landroidx/appcompat/view/menu/d$c;Landroidx/appcompat/view/menu/d$d;Landroid/view/MenuItem;Landroidx/appcompat/view/menu/g;)V
      //   131: astore_2
      //   132: invokestatic uptimeMillis : ()J
      //   135: lstore #5
      //   137: aload_0
      //   138: getfield c : Landroidx/appcompat/view/menu/d;
      //   141: getfield i : Landroid/os/Handler;
      //   144: aload_2
      //   145: aload_1
      //   146: lload #5
      //   148: ldc2_w 200
      //   151: ladd
      //   152: invokevirtual postAtTime : (Ljava/lang/Runnable;Ljava/lang/Object;J)Z
      //   155: pop
      //   156: return
    }
    
    public void b(g param1g, MenuItem param1MenuItem) {
      this.c.i.removeCallbacksAndMessages(param1g);
    }
    
    class a implements Runnable {
      a(d.c this$0, d.d param2d, MenuItem param2MenuItem, g param2g) {}
      
      public void run() {
        d.d d1 = this.c;
        if (d1 != null) {
          this.f.c.C = true;
          d1.b.a(false);
          this.f.c.C = false;
        } 
        if (this.d.isEnabled() && this.d.hasSubMenu())
          this.e.a(this.d, 4); 
      }
    }
  }
  
  class a implements Runnable {
    a(d this$0, d.d param1d, MenuItem param1MenuItem, g param1g) {}
    
    public void run() {
      d.d d1 = this.c;
      if (d1 != null) {
        this.f.c.C = true;
        d1.b.a(false);
        this.f.c.C = false;
      } 
      if (this.d.isEnabled() && this.d.hasSubMenu())
        this.e.a(this.d, 4); 
    }
  }
  
  private static class d {
    public final l0 a;
    
    public final g b;
    
    public final int c;
    
    public d(l0 param1l0, g param1g, int param1Int) {
      this.a = param1l0;
      this.b = param1g;
      this.c = param1Int;
    }
    
    public ListView a() {
      return this.a.e();
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/appcompat/view/menu/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */