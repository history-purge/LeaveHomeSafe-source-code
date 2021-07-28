package b.r;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import b.d.g;
import b.g.m.v;
import java.util.ArrayList;
import java.util.List;

public abstract class x implements Cloneable {
  private static final int[] I = new int[] { 2, 1, 3, 4 };
  
  private static final p J = new a();
  
  private static ThreadLocal<b.d.a<Animator, d>> K = new ThreadLocal<b.d.a<Animator, d>>();
  
  private boolean A = false;
  
  private boolean B = false;
  
  private ArrayList<f> C = null;
  
  private ArrayList<Animator> D = new ArrayList<Animator>();
  
  a0 E;
  
  private e F;
  
  private b.d.a<String, String> G;
  
  private p H = J;
  
  private String c = getClass().getName();
  
  private long d = -1L;
  
  long e = -1L;
  
  private TimeInterpolator f = null;
  
  ArrayList<Integer> g = new ArrayList<Integer>();
  
  ArrayList<View> h = new ArrayList<View>();
  
  private ArrayList<String> i = null;
  
  private ArrayList<Class<?>> j = null;
  
  private ArrayList<Integer> k = null;
  
  private ArrayList<View> l = null;
  
  private ArrayList<Class<?>> m = null;
  
  private ArrayList<String> n = null;
  
  private ArrayList<Integer> o = null;
  
  private ArrayList<View> p = null;
  
  private ArrayList<Class<?>> q = null;
  
  private e0 r = new e0();
  
  private e0 s = new e0();
  
  b0 t = null;
  
  private int[] u = I;
  
  private ArrayList<d0> v;
  
  private ArrayList<d0> w;
  
  boolean x = false;
  
  ArrayList<Animator> y = new ArrayList<Animator>();
  
  private int z = 0;
  
  private void a(Animator paramAnimator, b.d.a<Animator, d> parama) {
    if (paramAnimator != null) {
      paramAnimator.addListener((Animator.AnimatorListener)new b(this, parama));
      a(paramAnimator);
    } 
  }
  
  private void a(b.d.a<View, d0> parama1, b.d.a<View, d0> parama2) {
    int j;
    byte b = 0;
    int i = 0;
    while (true) {
      j = b;
      if (i < parama1.size()) {
        d0 d0 = (d0)parama1.d(i);
        if (b(d0.b)) {
          this.v.add(d0);
          this.w.add(null);
        } 
        i++;
        continue;
      } 
      break;
    } 
    while (j < parama2.size()) {
      d0 d0 = (d0)parama2.d(j);
      if (b(d0.b)) {
        this.w.add(d0);
        this.v.add(null);
      } 
      j++;
    } 
  }
  
  private void a(b.d.a<View, d0> parama1, b.d.a<View, d0> parama2, SparseArray<View> paramSparseArray1, SparseArray<View> paramSparseArray2) {
    int j = paramSparseArray1.size();
    int i;
    for (i = 0; i < j; i++) {
      View view = (View)paramSparseArray1.valueAt(i);
      if (view != null && b(view)) {
        View view1 = (View)paramSparseArray2.get(paramSparseArray1.keyAt(i));
        if (view1 != null && b(view1)) {
          d0 d01 = (d0)parama1.get(view);
          d0 d02 = (d0)parama2.get(view1);
          if (d01 != null && d02 != null) {
            this.v.add(d01);
            this.w.add(d02);
            parama1.remove(view);
            parama2.remove(view1);
          } 
        } 
      } 
    } 
  }
  
  private void a(b.d.a<View, d0> parama1, b.d.a<View, d0> parama2, b.d.a<String, View> parama3, b.d.a<String, View> parama4) {
    int j = parama3.size();
    int i;
    for (i = 0; i < j; i++) {
      View view = (View)parama3.d(i);
      if (view != null && b(view)) {
        View view1 = (View)parama4.get(parama3.b(i));
        if (view1 != null && b(view1)) {
          d0 d01 = (d0)parama1.get(view);
          d0 d02 = (d0)parama2.get(view1);
          if (d01 != null && d02 != null) {
            this.v.add(d01);
            this.w.add(d02);
            parama1.remove(view);
            parama2.remove(view1);
          } 
        } 
      } 
    } 
  }
  
  private void a(b.d.a<View, d0> parama1, b.d.a<View, d0> parama2, b.d.d<View> paramd1, b.d.d<View> paramd2) {
    int j = paramd1.b();
    int i;
    for (i = 0; i < j; i++) {
      View view = (View)paramd1.c(i);
      if (view != null && b(view)) {
        View view1 = (View)paramd2.a(paramd1.a(i));
        if (view1 != null && b(view1)) {
          d0 d01 = (d0)parama1.get(view);
          d0 d02 = (d0)parama2.get(view1);
          if (d01 != null && d02 != null) {
            this.v.add(d01);
            this.w.add(d02);
            parama1.remove(view);
            parama2.remove(view1);
          } 
        } 
      } 
    } 
  }
  
  private static void a(e0 parame0, View paramView, d0 paramd0) {
    parame0.a.put(paramView, paramd0);
    int i = paramView.getId();
    if (i >= 0)
      if (parame0.b.indexOfKey(i) >= 0) {
        parame0.b.put(i, null);
      } else {
        parame0.b.put(i, paramView);
      }  
    String str = v.x(paramView);
    if (str != null)
      if (parame0.d.containsKey(str)) {
        parame0.d.put(str, null);
      } else {
        parame0.d.put(str, paramView);
      }  
    if (paramView.getParent() instanceof ListView) {
      ListView listView = (ListView)paramView.getParent();
      if (listView.getAdapter().hasStableIds()) {
        long l = listView.getItemIdAtPosition(listView.getPositionForView(paramView));
        if (parame0.c.b(l) >= 0) {
          paramView = (View)parame0.c.a(l);
          if (paramView != null) {
            v.b(paramView, false);
            parame0.c.c(l, null);
            return;
          } 
        } else {
          v.b(paramView, true);
          parame0.c.c(l, paramView);
        } 
      } 
    } 
  }
  
  private void a(e0 parame01, e0 parame02) {
    b.d.a<View, d0> a1 = new b.d.a((g)parame01.a);
    b.d.a<View, d0> a2 = new b.d.a((g)parame02.a);
    int i = 0;
    while (true) {
      int[] arrayOfInt = this.u;
      if (i < arrayOfInt.length) {
        int j = arrayOfInt[i];
        if (j != 1) {
          if (j != 2) {
            if (j != 3) {
              if (j == 4)
                a(a1, a2, parame01.c, parame02.c); 
            } else {
              a(a1, a2, parame01.b, parame02.b);
            } 
          } else {
            a(a1, a2, parame01.d, parame02.d);
          } 
        } else {
          b(a1, a2);
        } 
        i++;
        continue;
      } 
      a(a1, a2);
      return;
    } 
  }
  
  private static boolean a(d0 paramd01, d0 paramd02, String paramString) {
    paramd01 = (d0)paramd01.a.get(paramString);
    paramd02 = (d0)paramd02.a.get(paramString);
    int i = 1;
    if (paramd01 == null && paramd02 == null)
      return false; 
    if (paramd01 != null) {
      if (paramd02 == null)
        return true; 
      i = true ^ paramd01.equals(paramd02);
    } 
    return i;
  }
  
  private void b(b.d.a<View, d0> parama1, b.d.a<View, d0> parama2) {
    for (int i = parama1.size() - 1; i >= 0; i--) {
      View view = (View)parama1.b(i);
      if (view != null && b(view)) {
        d0 d0 = (d0)parama2.remove(view);
        if (d0 != null && b(d0.b)) {
          d0 d01 = (d0)parama1.c(i);
          this.v.add(d01);
          this.w.add(d0);
        } 
      } 
    } 
  }
  
  private void c(View paramView, boolean paramBoolean) {
    if (paramView == null)
      return; 
    int i = paramView.getId();
    ArrayList<Integer> arrayList2 = this.k;
    if (arrayList2 != null && arrayList2.contains(Integer.valueOf(i)))
      return; 
    ArrayList<View> arrayList1 = this.l;
    if (arrayList1 != null && arrayList1.contains(paramView))
      return; 
    ArrayList<Class<?>> arrayList = this.m;
    byte b = 0;
    if (arrayList != null) {
      int k = arrayList.size();
      for (int j = 0; j < k; j++) {
        if (((Class)this.m.get(j)).isInstance(paramView))
          return; 
      } 
    } 
    if (paramView.getParent() instanceof ViewGroup) {
      e0 e01;
      d0 d0 = new d0(paramView);
      if (paramBoolean) {
        c(d0);
      } else {
        a(d0);
      } 
      d0.c.add(this);
      b(d0);
      if (paramBoolean) {
        e01 = this.r;
      } else {
        e01 = this.s;
      } 
      a(e01, paramView, d0);
    } 
    if (paramView instanceof ViewGroup) {
      ArrayList<Integer> arrayList5 = this.o;
      if (arrayList5 != null && arrayList5.contains(Integer.valueOf(i)))
        return; 
      ArrayList<View> arrayList4 = this.p;
      if (arrayList4 != null && arrayList4.contains(paramView))
        return; 
      ArrayList<Class<?>> arrayList3 = this.q;
      if (arrayList3 != null) {
        i = arrayList3.size();
        for (int k = 0; k < i; k++) {
          if (((Class)this.q.get(k)).isInstance(paramView))
            return; 
        } 
      } 
      ViewGroup viewGroup = (ViewGroup)paramView;
      for (int j = b; j < viewGroup.getChildCount(); j++)
        c(viewGroup.getChildAt(j), paramBoolean); 
    } 
  }
  
  private static b.d.a<Animator, d> s() {
    b.d.a<Animator, d> a2 = K.get();
    b.d.a<Animator, d> a1 = a2;
    if (a2 == null) {
      a1 = new b.d.a();
      K.set(a1);
    } 
    return a1;
  }
  
  public Animator a(ViewGroup paramViewGroup, d0 paramd01, d0 paramd02) {
    return null;
  }
  
  d0 a(View paramView, boolean paramBoolean) {
    d0 d0;
    int j;
    ArrayList<d0> arrayList;
    b0 b01 = this.t;
    if (b01 != null)
      return b01.a(paramView, paramBoolean); 
    if (paramBoolean) {
      arrayList = this.v;
    } else {
      arrayList = this.w;
    } 
    View view = null;
    if (arrayList == null)
      return null; 
    int k = arrayList.size();
    byte b = -1;
    int i = 0;
    while (true) {
      j = b;
      if (i < k) {
        d0 d01 = arrayList.get(i);
        if (d01 == null)
          return null; 
        if (d01.b == paramView) {
          j = i;
          break;
        } 
        i++;
        continue;
      } 
      break;
    } 
    paramView = view;
    if (j >= 0) {
      ArrayList<d0> arrayList1;
      if (paramBoolean) {
        arrayList1 = this.w;
      } else {
        arrayList1 = this.v;
      } 
      d0 = arrayList1.get(j);
    } 
    return d0;
  }
  
  public x a(long paramLong) {
    this.e = paramLong;
    return this;
  }
  
  public x a(TimeInterpolator paramTimeInterpolator) {
    this.f = paramTimeInterpolator;
    return this;
  }
  
  public x a(View paramView) {
    this.h.add(paramView);
    return this;
  }
  
  public x a(f paramf) {
    if (this.C == null)
      this.C = new ArrayList<f>(); 
    this.C.add(paramf);
    return this;
  }
  
  String a(String paramString) {
    // Byte code:
    //   0: new java/lang/StringBuilder
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore #4
    //   9: aload #4
    //   11: aload_1
    //   12: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   15: pop
    //   16: aload #4
    //   18: aload_0
    //   19: invokevirtual getClass : ()Ljava/lang/Class;
    //   22: invokevirtual getSimpleName : ()Ljava/lang/String;
    //   25: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   28: pop
    //   29: aload #4
    //   31: ldc_w '@'
    //   34: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   37: pop
    //   38: aload #4
    //   40: aload_0
    //   41: invokevirtual hashCode : ()I
    //   44: invokestatic toHexString : (I)Ljava/lang/String;
    //   47: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   50: pop
    //   51: aload #4
    //   53: ldc_w ': '
    //   56: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   59: pop
    //   60: aload #4
    //   62: invokevirtual toString : ()Ljava/lang/String;
    //   65: astore #4
    //   67: aload #4
    //   69: astore_1
    //   70: aload_0
    //   71: getfield e : J
    //   74: ldc2_w -1
    //   77: lcmp
    //   78: ifeq -> 126
    //   81: new java/lang/StringBuilder
    //   84: dup
    //   85: invokespecial <init> : ()V
    //   88: astore_1
    //   89: aload_1
    //   90: aload #4
    //   92: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   95: pop
    //   96: aload_1
    //   97: ldc_w 'dur('
    //   100: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   103: pop
    //   104: aload_1
    //   105: aload_0
    //   106: getfield e : J
    //   109: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   112: pop
    //   113: aload_1
    //   114: ldc_w ') '
    //   117: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   120: pop
    //   121: aload_1
    //   122: invokevirtual toString : ()Ljava/lang/String;
    //   125: astore_1
    //   126: aload_1
    //   127: astore #4
    //   129: aload_0
    //   130: getfield d : J
    //   133: ldc2_w -1
    //   136: lcmp
    //   137: ifeq -> 191
    //   140: new java/lang/StringBuilder
    //   143: dup
    //   144: invokespecial <init> : ()V
    //   147: astore #4
    //   149: aload #4
    //   151: aload_1
    //   152: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   155: pop
    //   156: aload #4
    //   158: ldc_w 'dly('
    //   161: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   164: pop
    //   165: aload #4
    //   167: aload_0
    //   168: getfield d : J
    //   171: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   174: pop
    //   175: aload #4
    //   177: ldc_w ') '
    //   180: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   183: pop
    //   184: aload #4
    //   186: invokevirtual toString : ()Ljava/lang/String;
    //   189: astore #4
    //   191: aload #4
    //   193: astore_1
    //   194: aload_0
    //   195: getfield f : Landroid/animation/TimeInterpolator;
    //   198: ifnull -> 246
    //   201: new java/lang/StringBuilder
    //   204: dup
    //   205: invokespecial <init> : ()V
    //   208: astore_1
    //   209: aload_1
    //   210: aload #4
    //   212: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   215: pop
    //   216: aload_1
    //   217: ldc_w 'interp('
    //   220: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   223: pop
    //   224: aload_1
    //   225: aload_0
    //   226: getfield f : Landroid/animation/TimeInterpolator;
    //   229: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   232: pop
    //   233: aload_1
    //   234: ldc_w ') '
    //   237: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   240: pop
    //   241: aload_1
    //   242: invokevirtual toString : ()Ljava/lang/String;
    //   245: astore_1
    //   246: aload_0
    //   247: getfield g : Ljava/util/ArrayList;
    //   250: invokevirtual size : ()I
    //   253: ifgt -> 269
    //   256: aload_1
    //   257: astore #4
    //   259: aload_0
    //   260: getfield h : Ljava/util/ArrayList;
    //   263: invokevirtual size : ()I
    //   266: ifle -> 550
    //   269: new java/lang/StringBuilder
    //   272: dup
    //   273: invokespecial <init> : ()V
    //   276: astore #4
    //   278: aload #4
    //   280: aload_1
    //   281: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   284: pop
    //   285: aload #4
    //   287: ldc_w 'tgts('
    //   290: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   293: pop
    //   294: aload #4
    //   296: invokevirtual toString : ()Ljava/lang/String;
    //   299: astore #4
    //   301: aload_0
    //   302: getfield g : Ljava/util/ArrayList;
    //   305: invokevirtual size : ()I
    //   308: istore_2
    //   309: iconst_0
    //   310: istore_3
    //   311: aload #4
    //   313: astore_1
    //   314: iload_2
    //   315: ifle -> 413
    //   318: aload #4
    //   320: astore_1
    //   321: iconst_0
    //   322: istore_2
    //   323: iload_2
    //   324: aload_0
    //   325: getfield g : Ljava/util/ArrayList;
    //   328: invokevirtual size : ()I
    //   331: if_icmpge -> 413
    //   334: aload_1
    //   335: astore #4
    //   337: iload_2
    //   338: ifle -> 373
    //   341: new java/lang/StringBuilder
    //   344: dup
    //   345: invokespecial <init> : ()V
    //   348: astore #4
    //   350: aload #4
    //   352: aload_1
    //   353: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   356: pop
    //   357: aload #4
    //   359: ldc_w ', '
    //   362: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   365: pop
    //   366: aload #4
    //   368: invokevirtual toString : ()Ljava/lang/String;
    //   371: astore #4
    //   373: new java/lang/StringBuilder
    //   376: dup
    //   377: invokespecial <init> : ()V
    //   380: astore_1
    //   381: aload_1
    //   382: aload #4
    //   384: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   387: pop
    //   388: aload_1
    //   389: aload_0
    //   390: getfield g : Ljava/util/ArrayList;
    //   393: iload_2
    //   394: invokevirtual get : (I)Ljava/lang/Object;
    //   397: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   400: pop
    //   401: aload_1
    //   402: invokevirtual toString : ()Ljava/lang/String;
    //   405: astore_1
    //   406: iload_2
    //   407: iconst_1
    //   408: iadd
    //   409: istore_2
    //   410: goto -> 323
    //   413: aload_1
    //   414: astore #4
    //   416: aload_0
    //   417: getfield h : Ljava/util/ArrayList;
    //   420: invokevirtual size : ()I
    //   423: ifle -> 521
    //   426: iload_3
    //   427: istore_2
    //   428: aload_1
    //   429: astore #4
    //   431: iload_2
    //   432: aload_0
    //   433: getfield h : Ljava/util/ArrayList;
    //   436: invokevirtual size : ()I
    //   439: if_icmpge -> 521
    //   442: aload_1
    //   443: astore #4
    //   445: iload_2
    //   446: ifle -> 481
    //   449: new java/lang/StringBuilder
    //   452: dup
    //   453: invokespecial <init> : ()V
    //   456: astore #4
    //   458: aload #4
    //   460: aload_1
    //   461: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   464: pop
    //   465: aload #4
    //   467: ldc_w ', '
    //   470: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   473: pop
    //   474: aload #4
    //   476: invokevirtual toString : ()Ljava/lang/String;
    //   479: astore #4
    //   481: new java/lang/StringBuilder
    //   484: dup
    //   485: invokespecial <init> : ()V
    //   488: astore_1
    //   489: aload_1
    //   490: aload #4
    //   492: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   495: pop
    //   496: aload_1
    //   497: aload_0
    //   498: getfield h : Ljava/util/ArrayList;
    //   501: iload_2
    //   502: invokevirtual get : (I)Ljava/lang/Object;
    //   505: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   508: pop
    //   509: aload_1
    //   510: invokevirtual toString : ()Ljava/lang/String;
    //   513: astore_1
    //   514: iload_2
    //   515: iconst_1
    //   516: iadd
    //   517: istore_2
    //   518: goto -> 428
    //   521: new java/lang/StringBuilder
    //   524: dup
    //   525: invokespecial <init> : ()V
    //   528: astore_1
    //   529: aload_1
    //   530: aload #4
    //   532: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   535: pop
    //   536: aload_1
    //   537: ldc_w ')'
    //   540: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   543: pop
    //   544: aload_1
    //   545: invokevirtual toString : ()Ljava/lang/String;
    //   548: astore #4
    //   550: aload #4
    //   552: areturn
  }
  
  protected void a() {
    this.z--;
    if (this.z == 0) {
      ArrayList<f> arrayList = this.C;
      if (arrayList != null && arrayList.size() > 0) {
        arrayList = (ArrayList<f>)this.C.clone();
        int k = arrayList.size();
        for (int j = 0; j < k; j++)
          ((f)arrayList.get(j)).e(this); 
      } 
      int i;
      for (i = 0; i < this.r.c.b(); i++) {
        View view = (View)this.r.c.c(i);
        if (view != null)
          v.b(view, false); 
      } 
      for (i = 0; i < this.s.c.b(); i++) {
        View view = (View)this.s.c.c(i);
        if (view != null)
          v.b(view, false); 
      } 
      this.B = true;
    } 
  }
  
  protected void a(Animator paramAnimator) {
    if (paramAnimator == null) {
      a();
      return;
    } 
    if (b() >= 0L)
      paramAnimator.setDuration(b()); 
    if (j() >= 0L)
      paramAnimator.setStartDelay(j() + paramAnimator.getStartDelay()); 
    if (f() != null)
      paramAnimator.setInterpolator(f()); 
    paramAnimator.addListener((Animator.AnimatorListener)new c(this));
    paramAnimator.start();
  }
  
  void a(ViewGroup paramViewGroup) {
    this.v = new ArrayList<d0>();
    this.w = new ArrayList<d0>();
    a(this.r, this.s);
    b.d.a<Animator, d> a1 = s();
    int i = a1.size();
    z0 z0 = o0.d((View)paramViewGroup);
    while (--i >= 0) {
      Animator animator = (Animator)a1.b(i);
      if (animator != null) {
        d d = (d)a1.get(animator);
        if (d != null && d.a != null && z0.equals(d.d)) {
          boolean bool;
          d0 d03 = d.c;
          View view = d.a;
          d0 d04 = b(view, true);
          d0 d02 = a(view, true);
          d0 d01 = d02;
          if (d04 == null) {
            d01 = d02;
            if (d02 == null)
              d01 = (d0)this.s.a.get(view); 
          } 
          if ((d04 != null || d01 != null) && d.e.a(d03, d01)) {
            bool = true;
          } else {
            bool = false;
          } 
          if (bool)
            if (animator.isRunning() || animator.isStarted()) {
              animator.cancel();
            } else {
              a1.remove(animator);
            }  
        } 
      } 
      i--;
    } 
    a(paramViewGroup, this.r, this.s, this.v, this.w);
    p();
  }
  
  protected void a(ViewGroup paramViewGroup, e0 parame01, e0 parame02, ArrayList<d0> paramArrayList1, ArrayList<d0> paramArrayList2) {
    Object object;
    b.d.a<Animator, d> a1 = s();
    SparseIntArray sparseIntArray = new SparseIntArray();
    int j = paramArrayList1.size();
    long l = Long.MAX_VALUE;
    int i = 0;
    while (i < j) {
      d0 d02 = paramArrayList1.get(i);
      d0 d01 = paramArrayList2.get(i);
      d0 d03 = d02;
      if (d02 != null) {
        d03 = d02;
        if (!d02.c.contains(this))
          d03 = null; 
      } 
      d0 d04 = d01;
      if (d01 != null) {
        d04 = d01;
        if (!d01.c.contains(this))
          d04 = null; 
      } 
      if (d03 != null || d04 != null) {
        int m;
        if (d03 == null || d04 == null || a(d03, d04)) {
          m = 1;
        } else {
          m = 0;
        } 
        if (m) {
          Animator animator = a(paramViewGroup, d03, d04);
          if (animator != null) {
            d0 d0;
            View view;
            if (d04 != null) {
              View view1 = d04.b;
              String[] arrayOfString = o();
              if (arrayOfString != null && arrayOfString.length > 0) {
                d0 d05 = new d0(view1);
                d02 = (d0)parame02.a.get(view1);
                m = i;
                if (d02 != null) {
                  int i1 = 0;
                  while (true) {
                    m = i;
                    if (i1 < arrayOfString.length) {
                      d05.a.put(arrayOfString[i1], d02.a.get(arrayOfString[i1]));
                      i1++;
                      continue;
                    } 
                    break;
                  } 
                } 
                i = m;
                int n = a1.size();
                m = 0;
                while (true) {
                  if (m < n) {
                    d d = (d)a1.get(a1.b(m));
                    if (d.c != null && d.a == view1 && d.b.equals(g()) && d.c.equals(d05)) {
                      animator = null;
                      d0 d06 = d05;
                      break;
                    } 
                    m++;
                    continue;
                  } 
                  d02 = d05;
                  break;
                } 
              } else {
                d02 = null;
              } 
              Animator animator2 = animator;
              d0 = d02;
              Animator animator1 = animator2;
              view = view1;
            } else {
              view = d03.b;
              d0 d05 = null;
              d02 = d0;
              d0 = d05;
            } 
            Object object2 = object;
            m = i;
            if (d02 != null) {
              a0 a01 = this.E;
              object2 = object;
              if (a01 != null) {
                long l1 = a01.a(paramViewGroup, this, d03, d04);
                sparseIntArray.put(this.D.size(), (int)l1);
                l1 = Math.min(l1, object);
              } 
              a1.put(d02, new d(view, g(), this, o0.d((View)paramViewGroup), d0));
              this.D.add(d02);
              m = i;
            } 
            continue;
          } 
        } 
      } 
      Object object1 = object;
      int k = i;
      continue;
      i = SYNTHETIC_LOCAL_VARIABLE_7 + 1;
      object = SYNTHETIC_LOCAL_VARIABLE_12;
    } 
    if (sparseIntArray.size() != 0)
      for (i = 0; i < sparseIntArray.size(); i++) {
        int k = sparseIntArray.keyAt(i);
        Animator animator = this.D.get(k);
        animator.setStartDelay(sparseIntArray.valueAt(i) - object + animator.getStartDelay());
      }  
  }
  
  void a(ViewGroup paramViewGroup, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: iload_2
    //   2: invokevirtual a : (Z)V
    //   5: aload_0
    //   6: getfield g : Ljava/util/ArrayList;
    //   9: invokevirtual size : ()I
    //   12: istore_3
    //   13: iconst_0
    //   14: istore #5
    //   16: iload_3
    //   17: ifgt -> 30
    //   20: aload_0
    //   21: getfield h : Ljava/util/ArrayList;
    //   24: invokevirtual size : ()I
    //   27: ifle -> 71
    //   30: aload_0
    //   31: getfield i : Ljava/util/ArrayList;
    //   34: astore #7
    //   36: aload #7
    //   38: ifnull -> 49
    //   41: aload #7
    //   43: invokevirtual isEmpty : ()Z
    //   46: ifeq -> 71
    //   49: aload_0
    //   50: getfield j : Ljava/util/ArrayList;
    //   53: astore #7
    //   55: aload #7
    //   57: ifnull -> 80
    //   60: aload #7
    //   62: invokevirtual isEmpty : ()Z
    //   65: ifeq -> 71
    //   68: goto -> 80
    //   71: aload_0
    //   72: aload_1
    //   73: iload_2
    //   74: invokespecial c : (Landroid/view/View;Z)V
    //   77: goto -> 303
    //   80: iconst_0
    //   81: istore_3
    //   82: iload_3
    //   83: aload_0
    //   84: getfield g : Ljava/util/ArrayList;
    //   87: invokevirtual size : ()I
    //   90: if_icmpge -> 199
    //   93: aload_1
    //   94: aload_0
    //   95: getfield g : Ljava/util/ArrayList;
    //   98: iload_3
    //   99: invokevirtual get : (I)Ljava/lang/Object;
    //   102: checkcast java/lang/Integer
    //   105: invokevirtual intValue : ()I
    //   108: invokevirtual findViewById : (I)Landroid/view/View;
    //   111: astore #8
    //   113: aload #8
    //   115: ifnull -> 192
    //   118: new b/r/d0
    //   121: dup
    //   122: aload #8
    //   124: invokespecial <init> : (Landroid/view/View;)V
    //   127: astore #9
    //   129: iload_2
    //   130: ifeq -> 142
    //   133: aload_0
    //   134: aload #9
    //   136: invokevirtual c : (Lb/r/d0;)V
    //   139: goto -> 148
    //   142: aload_0
    //   143: aload #9
    //   145: invokevirtual a : (Lb/r/d0;)V
    //   148: aload #9
    //   150: getfield c : Ljava/util/ArrayList;
    //   153: aload_0
    //   154: invokevirtual add : (Ljava/lang/Object;)Z
    //   157: pop
    //   158: aload_0
    //   159: aload #9
    //   161: invokevirtual b : (Lb/r/d0;)V
    //   164: iload_2
    //   165: ifeq -> 177
    //   168: aload_0
    //   169: getfield r : Lb/r/e0;
    //   172: astore #7
    //   174: goto -> 183
    //   177: aload_0
    //   178: getfield s : Lb/r/e0;
    //   181: astore #7
    //   183: aload #7
    //   185: aload #8
    //   187: aload #9
    //   189: invokestatic a : (Lb/r/e0;Landroid/view/View;Lb/r/d0;)V
    //   192: iload_3
    //   193: iconst_1
    //   194: iadd
    //   195: istore_3
    //   196: goto -> 82
    //   199: iconst_0
    //   200: istore_3
    //   201: iload_3
    //   202: aload_0
    //   203: getfield h : Ljava/util/ArrayList;
    //   206: invokevirtual size : ()I
    //   209: if_icmpge -> 303
    //   212: aload_0
    //   213: getfield h : Ljava/util/ArrayList;
    //   216: iload_3
    //   217: invokevirtual get : (I)Ljava/lang/Object;
    //   220: checkcast android/view/View
    //   223: astore #7
    //   225: new b/r/d0
    //   228: dup
    //   229: aload #7
    //   231: invokespecial <init> : (Landroid/view/View;)V
    //   234: astore #8
    //   236: iload_2
    //   237: ifeq -> 249
    //   240: aload_0
    //   241: aload #8
    //   243: invokevirtual c : (Lb/r/d0;)V
    //   246: goto -> 255
    //   249: aload_0
    //   250: aload #8
    //   252: invokevirtual a : (Lb/r/d0;)V
    //   255: aload #8
    //   257: getfield c : Ljava/util/ArrayList;
    //   260: aload_0
    //   261: invokevirtual add : (Ljava/lang/Object;)Z
    //   264: pop
    //   265: aload_0
    //   266: aload #8
    //   268: invokevirtual b : (Lb/r/d0;)V
    //   271: iload_2
    //   272: ifeq -> 283
    //   275: aload_0
    //   276: getfield r : Lb/r/e0;
    //   279: astore_1
    //   280: goto -> 288
    //   283: aload_0
    //   284: getfield s : Lb/r/e0;
    //   287: astore_1
    //   288: aload_1
    //   289: aload #7
    //   291: aload #8
    //   293: invokestatic a : (Lb/r/e0;Landroid/view/View;Lb/r/d0;)V
    //   296: iload_3
    //   297: iconst_1
    //   298: iadd
    //   299: istore_3
    //   300: goto -> 201
    //   303: iload_2
    //   304: ifne -> 442
    //   307: aload_0
    //   308: getfield G : Lb/d/a;
    //   311: astore_1
    //   312: aload_1
    //   313: ifnull -> 442
    //   316: aload_1
    //   317: invokevirtual size : ()I
    //   320: istore #6
    //   322: new java/util/ArrayList
    //   325: dup
    //   326: iload #6
    //   328: invokespecial <init> : (I)V
    //   331: astore_1
    //   332: iconst_0
    //   333: istore_3
    //   334: iload #5
    //   336: istore #4
    //   338: iload_3
    //   339: iload #6
    //   341: if_icmpge -> 381
    //   344: aload_0
    //   345: getfield G : Lb/d/a;
    //   348: iload_3
    //   349: invokevirtual b : (I)Ljava/lang/Object;
    //   352: checkcast java/lang/String
    //   355: astore #7
    //   357: aload_1
    //   358: aload_0
    //   359: getfield r : Lb/r/e0;
    //   362: getfield d : Lb/d/a;
    //   365: aload #7
    //   367: invokevirtual remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   370: invokevirtual add : (Ljava/lang/Object;)Z
    //   373: pop
    //   374: iload_3
    //   375: iconst_1
    //   376: iadd
    //   377: istore_3
    //   378: goto -> 334
    //   381: iload #4
    //   383: iload #6
    //   385: if_icmpge -> 442
    //   388: aload_1
    //   389: iload #4
    //   391: invokevirtual get : (I)Ljava/lang/Object;
    //   394: checkcast android/view/View
    //   397: astore #7
    //   399: aload #7
    //   401: ifnull -> 433
    //   404: aload_0
    //   405: getfield G : Lb/d/a;
    //   408: iload #4
    //   410: invokevirtual d : (I)Ljava/lang/Object;
    //   413: checkcast java/lang/String
    //   416: astore #8
    //   418: aload_0
    //   419: getfield r : Lb/r/e0;
    //   422: getfield d : Lb/d/a;
    //   425: aload #8
    //   427: aload #7
    //   429: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   432: pop
    //   433: iload #4
    //   435: iconst_1
    //   436: iadd
    //   437: istore #4
    //   439: goto -> 381
    //   442: return
  }
  
  public void a(a0 parama0) {
    this.E = parama0;
  }
  
  public abstract void a(d0 paramd0);
  
  public void a(p paramp) {
    p p1 = paramp;
    if (paramp == null)
      p1 = J; 
    this.H = p1;
  }
  
  public void a(e parame) {
    this.F = parame;
  }
  
  void a(boolean paramBoolean) {
    e0 e01;
    if (paramBoolean) {
      this.r.a.clear();
      this.r.b.clear();
      e01 = this.r;
    } else {
      this.s.a.clear();
      this.s.b.clear();
      e01 = this.s;
    } 
    e01.c.a();
  }
  
  public boolean a(d0 paramd01, d0 paramd02) {
    // Byte code:
    //   0: iconst_0
    //   1: istore #6
    //   3: iload #6
    //   5: istore #5
    //   7: aload_1
    //   8: ifnull -> 120
    //   11: iload #6
    //   13: istore #5
    //   15: aload_2
    //   16: ifnull -> 120
    //   19: aload_0
    //   20: invokevirtual o : ()[Ljava/lang/String;
    //   23: astore #7
    //   25: aload #7
    //   27: ifnull -> 69
    //   30: aload #7
    //   32: arraylength
    //   33: istore #4
    //   35: iconst_0
    //   36: istore_3
    //   37: iload #6
    //   39: istore #5
    //   41: iload_3
    //   42: iload #4
    //   44: if_icmpge -> 120
    //   47: aload_1
    //   48: aload_2
    //   49: aload #7
    //   51: iload_3
    //   52: aaload
    //   53: invokestatic a : (Lb/r/d0;Lb/r/d0;Ljava/lang/String;)Z
    //   56: ifeq -> 62
    //   59: goto -> 117
    //   62: iload_3
    //   63: iconst_1
    //   64: iadd
    //   65: istore_3
    //   66: goto -> 37
    //   69: aload_1
    //   70: getfield a : Ljava/util/Map;
    //   73: invokeinterface keySet : ()Ljava/util/Set;
    //   78: invokeinterface iterator : ()Ljava/util/Iterator;
    //   83: astore #7
    //   85: iload #6
    //   87: istore #5
    //   89: aload #7
    //   91: invokeinterface hasNext : ()Z
    //   96: ifeq -> 120
    //   99: aload_1
    //   100: aload_2
    //   101: aload #7
    //   103: invokeinterface next : ()Ljava/lang/Object;
    //   108: checkcast java/lang/String
    //   111: invokestatic a : (Lb/r/d0;Lb/r/d0;Ljava/lang/String;)Z
    //   114: ifeq -> 85
    //   117: iconst_1
    //   118: istore #5
    //   120: iload #5
    //   122: ireturn
  }
  
  public long b() {
    return this.e;
  }
  
  public d0 b(View paramView, boolean paramBoolean) {
    e0 e01;
    b0 b01 = this.t;
    if (b01 != null)
      return b01.b(paramView, paramBoolean); 
    if (paramBoolean) {
      e01 = this.r;
    } else {
      e01 = this.s;
    } 
    return (d0)e01.a.get(paramView);
  }
  
  public x b(long paramLong) {
    this.d = paramLong;
    return this;
  }
  
  public x b(f paramf) {
    ArrayList<f> arrayList = this.C;
    if (arrayList == null)
      return this; 
    arrayList.remove(paramf);
    if (this.C.size() == 0)
      this.C = null; 
    return this;
  }
  
  void b(d0 paramd0) {
    if (this.E != null && !paramd0.a.isEmpty()) {
      String[] arrayOfString = this.E.a();
      if (arrayOfString == null)
        return; 
      byte b = 0;
      int i = 0;
      while (true) {
        if (i < arrayOfString.length) {
          if (!paramd0.a.containsKey(arrayOfString[i])) {
            i = b;
            break;
          } 
          i++;
          continue;
        } 
        i = 1;
        break;
      } 
      if (i == 0)
        this.E.a(paramd0); 
    } 
  }
  
  boolean b(View paramView) {
    int i = paramView.getId();
    ArrayList<Integer> arrayList2 = this.k;
    if (arrayList2 != null && arrayList2.contains(Integer.valueOf(i)))
      return false; 
    ArrayList<View> arrayList1 = this.l;
    if (arrayList1 != null && arrayList1.contains(paramView))
      return false; 
    ArrayList<Class<?>> arrayList = this.m;
    if (arrayList != null) {
      int k = arrayList.size();
      for (int j = 0; j < k; j++) {
        if (((Class)this.m.get(j)).isInstance(paramView))
          return false; 
      } 
    } 
    if (this.n != null && v.x(paramView) != null && this.n.contains(v.x(paramView)))
      return false; 
    if (this.g.size() == 0 && this.h.size() == 0) {
      arrayList = this.j;
      if (arrayList == null || arrayList.isEmpty()) {
        ArrayList<String> arrayList3 = this.i;
        if (arrayList3 == null || arrayList3.isEmpty())
          return true; 
      } 
    } 
    if (!this.g.contains(Integer.valueOf(i))) {
      if (this.h.contains(paramView))
        return true; 
      ArrayList<String> arrayList3 = this.i;
      if (arrayList3 != null && arrayList3.contains(v.x(paramView)))
        return true; 
      if (this.j != null)
        for (int j = 0; j < this.j.size(); j++) {
          if (((Class)this.j.get(j)).isInstance(paramView))
            return true; 
        }  
      return false;
    } 
    return true;
  }
  
  public Rect c() {
    e e1 = this.F;
    return (e1 == null) ? null : e1.a(this);
  }
  
  public void c(View paramView) {
    if (!this.B) {
      b.d.a<Animator, d> a1 = s();
      int i = a1.size();
      z0 z0 = o0.d(paramView);
      while (--i >= 0) {
        d d = (d)a1.d(i);
        if (d.a != null && z0.equals(d.d))
          a.a((Animator)a1.b(i)); 
        i--;
      } 
      ArrayList<f> arrayList = this.C;
      if (arrayList != null && arrayList.size() > 0) {
        arrayList = (ArrayList<f>)this.C.clone();
        int j = arrayList.size();
        for (i = 0; i < j; i++)
          ((f)arrayList.get(i)).c(this); 
      } 
      this.A = true;
    } 
  }
  
  public abstract void c(d0 paramd0);
  
  protected void cancel() {
    int i;
    for (i = this.y.size() - 1; i >= 0; i--)
      ((Animator)this.y.get(i)).cancel(); 
    ArrayList<f> arrayList = this.C;
    if (arrayList != null && arrayList.size() > 0) {
      arrayList = (ArrayList<f>)this.C.clone();
      int j = arrayList.size();
      for (i = 0; i < j; i++)
        ((f)arrayList.get(i)).b(this); 
    } 
  }
  
  public x clone() {
    try {
      x x1 = (x)super.clone();
      x1.D = new ArrayList<Animator>();
      x1.r = new e0();
      x1.s = new e0();
      x1.v = null;
      x1.w = null;
      return x1;
    } catch (CloneNotSupportedException cloneNotSupportedException) {
      return null;
    } 
  }
  
  public e d() {
    return this.F;
  }
  
  public x d(View paramView) {
    this.h.remove(paramView);
    return this;
  }
  
  public void e(View paramView) {
    if (this.A) {
      if (!this.B) {
        b.d.a<Animator, d> a1 = s();
        int i = a1.size();
        z0 z0 = o0.d(paramView);
        while (--i >= 0) {
          d d = (d)a1.d(i);
          if (d.a != null && z0.equals(d.d))
            a.b((Animator)a1.b(i)); 
          i--;
        } 
        ArrayList<f> arrayList = this.C;
        if (arrayList != null && arrayList.size() > 0) {
          arrayList = (ArrayList<f>)this.C.clone();
          int j = arrayList.size();
          for (i = 0; i < j; i++)
            ((f)arrayList.get(i)).d(this); 
        } 
      } 
      this.A = false;
    } 
  }
  
  public TimeInterpolator f() {
    return this.f;
  }
  
  public String g() {
    return this.c;
  }
  
  public p h() {
    return this.H;
  }
  
  public a0 i() {
    return this.E;
  }
  
  public long j() {
    return this.d;
  }
  
  public List<Integer> k() {
    return this.g;
  }
  
  public List<String> l() {
    return this.i;
  }
  
  public List<Class<?>> m() {
    return this.j;
  }
  
  public List<View> n() {
    return this.h;
  }
  
  public String[] o() {
    return null;
  }
  
  protected void p() {
    q();
    b.d.a<Animator, d> a1 = s();
    for (Animator animator : this.D) {
      if (a1.containsKey(animator)) {
        q();
        a(animator, a1);
      } 
    } 
    this.D.clear();
    a();
  }
  
  protected void q() {
    if (this.z == 0) {
      ArrayList<f> arrayList = this.C;
      if (arrayList != null && arrayList.size() > 0) {
        arrayList = (ArrayList<f>)this.C.clone();
        int j = arrayList.size();
        for (int i = 0; i < j; i++)
          ((f)arrayList.get(i)).a(this); 
      } 
      this.B = false;
    } 
    this.z++;
  }
  
  public String toString() {
    return a("");
  }
  
  static final class a extends p {
    public Path a(float param1Float1, float param1Float2, float param1Float3, float param1Float4) {
      Path path = new Path();
      path.moveTo(param1Float1, param1Float2);
      path.lineTo(param1Float3, param1Float4);
      return path;
    }
  }
  
  class b extends AnimatorListenerAdapter {
    b(x this$0, b.d.a param1a) {}
    
    public void onAnimationEnd(Animator param1Animator) {
      this.a.remove(param1Animator);
      this.b.y.remove(param1Animator);
    }
    
    public void onAnimationStart(Animator param1Animator) {
      this.b.y.add(param1Animator);
    }
  }
  
  class c extends AnimatorListenerAdapter {
    c(x this$0) {}
    
    public void onAnimationEnd(Animator param1Animator) {
      this.a.a();
      param1Animator.removeListener((Animator.AnimatorListener)this);
    }
  }
  
  private static class d {
    View a;
    
    String b;
    
    d0 c;
    
    z0 d;
    
    x e;
    
    d(View param1View, String param1String, x param1x, z0 param1z0, d0 param1d0) {
      this.a = param1View;
      this.b = param1String;
      this.c = param1d0;
      this.d = param1z0;
      this.e = param1x;
    }
  }
  
  public static abstract class e {
    public abstract Rect a(x param1x);
  }
  
  public static interface f {
    void a(x param1x);
    
    void b(x param1x);
    
    void c(x param1x);
    
    void d(x param1x);
    
    void e(x param1x);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/r/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */