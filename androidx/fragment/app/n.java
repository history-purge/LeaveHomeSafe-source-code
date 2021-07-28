package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.w;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class n implements t {
  private static boolean O = false;
  
  static boolean P = true;
  
  private androidx.activity.result.d<androidx.activity.result.g> A;
  
  private androidx.activity.result.d<String[]> B;
  
  ArrayDeque<n> C = new ArrayDeque<n>();
  
  private boolean D;
  
  private boolean E;
  
  private boolean F;
  
  private boolean G;
  
  private boolean H;
  
  private ArrayList<a> I;
  
  private ArrayList<Boolean> J;
  
  private ArrayList<Fragment> K;
  
  private ArrayList<r> L;
  
  private q M;
  
  private Runnable N = new g(this);
  
  private final ArrayList<p> a = new ArrayList<p>();
  
  private boolean b;
  
  private final w c = new w();
  
  ArrayList<a> d;
  
  private ArrayList<Fragment> e;
  
  private final l f = new l(this);
  
  private OnBackPressedDispatcher g;
  
  private final androidx.activity.b h = new c(this, false);
  
  private final AtomicInteger i = new AtomicInteger();
  
  private final Map<String, Bundle> j = Collections.synchronizedMap(new HashMap<String, Bundle>());
  
  private final Map<String, Object> k = Collections.synchronizedMap(new HashMap<String, Object>());
  
  private ArrayList<o> l;
  
  private Map<Fragment, HashSet<b.g.j.a>> m = Collections.synchronizedMap(new HashMap<Fragment, HashSet<b.g.j.a>>());
  
  private final y.g n = new d(this);
  
  private final m o = new m(this);
  
  private final CopyOnWriteArrayList<r> p = new CopyOnWriteArrayList<r>();
  
  int q = -1;
  
  private k<?> r;
  
  private g s;
  
  private Fragment t;
  
  Fragment u;
  
  private j v = null;
  
  private j w = new e(this);
  
  private e0 x = null;
  
  private e0 y = new f(this);
  
  private androidx.activity.result.d<Intent> z;
  
  private void I() {
    if (!D())
      return; 
    throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
  }
  
  private void J() {
    this.b = false;
    this.J.clear();
    this.I.clear();
  }
  
  private Set<d0> K() {
    HashSet<d0> hashSet = new HashSet();
    Iterator<v> iterator = this.c.b().iterator();
    while (iterator.hasNext()) {
      ViewGroup viewGroup = (((v)iterator.next()).k()).I;
      if (viewGroup != null)
        hashSet.add(d0.a(viewGroup, A())); 
    } 
    return hashSet;
  }
  
  private void L() {
    if (this.H) {
      this.H = false;
      P();
    } 
  }
  
  private void M() {
    if (P) {
      Iterator<d0> iterator = K().iterator();
      while (iterator.hasNext())
        ((d0)iterator.next()).b(); 
    } else if (!this.m.isEmpty()) {
      for (Fragment fragment : this.m.keySet()) {
        p(fragment);
        l(fragment);
      } 
    } 
  }
  
  private void N() {
    if (P) {
      Iterator<d0> iterator = K().iterator();
      while (iterator.hasNext())
        ((d0)iterator.next()).c(); 
    } else if (this.L != null) {
      while (!this.L.isEmpty())
        ((r)this.L.remove(0)).d(); 
    } 
  }
  
  private void O() {
    if (this.l != null)
      for (int i = 0; i < this.l.size(); i++)
        ((o)this.l.get(i)).a();  
  }
  
  private void P() {
    Iterator<v> iterator = this.c.b().iterator();
    while (iterator.hasNext())
      a(iterator.next()); 
  }
  
  private void Q() {
    ArrayList<p> arrayList;
    androidx.activity.b b1;
    synchronized (this.a) {
      boolean bool1 = this.a.isEmpty();
      boolean bool = true;
      if (!bool1) {
        this.h.a(true);
        return;
      } 
      b1 = this.h;
      if (q() <= 0 || !j(this.t))
        bool = false; 
      b1.a(bool);
      return;
    } 
  }
  
  private int a(ArrayList<a> paramArrayList, ArrayList<Boolean> paramArrayList1, int paramInt1, int paramInt2, b.d.b<Fragment> paramb) {
    int i = paramInt2 - 1;
    int i1;
    for (i1 = paramInt2; i >= paramInt1; i1 = i2) {
      boolean bool;
      a a = paramArrayList.get(i);
      boolean bool1 = ((Boolean)paramArrayList1.get(i)).booleanValue();
      if (a.h() && !a.a(paramArrayList, i + 1, paramInt2)) {
        bool = true;
      } else {
        bool = false;
      } 
      int i2 = i1;
      if (bool) {
        if (this.L == null)
          this.L = new ArrayList<r>(); 
        r r = new r(a, bool1);
        this.L.add(r);
        a.a(r);
        if (bool1) {
          a.f();
        } else {
          a.c(false);
        } 
        i2 = i1 - 1;
        if (i != i2) {
          paramArrayList.remove(i);
          paramArrayList.add(i2, a);
        } 
        a(paramb);
      } 
      i--;
    } 
    return i1;
  }
  
  static Fragment a(View paramView) {
    Object object = paramView.getTag(b.l.b.fragment_container_view_tag);
    return (object instanceof Fragment) ? (Fragment)object : null;
  }
  
  private Set<d0> a(ArrayList<a> paramArrayList, int paramInt1, int paramInt2) {
    HashSet<d0> hashSet = new HashSet();
    while (paramInt1 < paramInt2) {
      Iterator<x.a> iterator = ((a)paramArrayList.get(paramInt1)).a.iterator();
      while (iterator.hasNext()) {
        Fragment fragment = ((x.a)iterator.next()).b;
        if (fragment != null) {
          ViewGroup viewGroup = fragment.I;
          if (viewGroup != null)
            hashSet.add(d0.a(viewGroup, this)); 
        } 
      } 
      paramInt1++;
    } 
    return hashSet;
  }
  
  private void a(b.d.b<Fragment> paramb) {
    int i = this.q;
    if (i < 1)
      return; 
    i = Math.min(i, 5);
    for (Fragment fragment : this.c.d()) {
      if (fragment.c < i) {
        a(fragment, i);
        if (fragment.J != null && !fragment.B && fragment.N)
          paramb.add(fragment); 
      } 
    } 
  }
  
  private void a(ArrayList<a> paramArrayList, ArrayList<Boolean> paramArrayList1) {
    // Byte code:
    //   0: aload_0
    //   1: getfield L : Ljava/util/ArrayList;
    //   4: astore #7
    //   6: aload #7
    //   8: ifnonnull -> 16
    //   11: iconst_0
    //   12: istore_3
    //   13: goto -> 22
    //   16: aload #7
    //   18: invokevirtual size : ()I
    //   21: istore_3
    //   22: iconst_0
    //   23: istore #4
    //   25: iload_3
    //   26: istore #6
    //   28: iload #4
    //   30: iload #6
    //   32: if_icmpge -> 255
    //   35: aload_0
    //   36: getfield L : Ljava/util/ArrayList;
    //   39: iload #4
    //   41: invokevirtual get : (I)Ljava/lang/Object;
    //   44: checkcast androidx/fragment/app/n$r
    //   47: astore #7
    //   49: aload_1
    //   50: ifnull -> 123
    //   53: aload #7
    //   55: getfield a : Z
    //   58: ifne -> 123
    //   61: aload_1
    //   62: aload #7
    //   64: getfield b : Landroidx/fragment/app/a;
    //   67: invokevirtual indexOf : (Ljava/lang/Object;)I
    //   70: istore_3
    //   71: iload_3
    //   72: iconst_m1
    //   73: if_icmpeq -> 123
    //   76: aload_2
    //   77: ifnull -> 123
    //   80: aload_2
    //   81: iload_3
    //   82: invokevirtual get : (I)Ljava/lang/Object;
    //   85: checkcast java/lang/Boolean
    //   88: invokevirtual booleanValue : ()Z
    //   91: ifeq -> 123
    //   94: aload_0
    //   95: getfield L : Ljava/util/ArrayList;
    //   98: iload #4
    //   100: invokevirtual remove : (I)Ljava/lang/Object;
    //   103: pop
    //   104: iload #4
    //   106: iconst_1
    //   107: isub
    //   108: istore #5
    //   110: iload #6
    //   112: iconst_1
    //   113: isub
    //   114: istore_3
    //   115: aload #7
    //   117: invokevirtual c : ()V
    //   120: goto -> 243
    //   123: aload #7
    //   125: invokevirtual e : ()Z
    //   128: ifne -> 166
    //   131: iload #4
    //   133: istore #5
    //   135: iload #6
    //   137: istore_3
    //   138: aload_1
    //   139: ifnull -> 243
    //   142: iload #4
    //   144: istore #5
    //   146: iload #6
    //   148: istore_3
    //   149: aload #7
    //   151: getfield b : Landroidx/fragment/app/a;
    //   154: aload_1
    //   155: iconst_0
    //   156: aload_1
    //   157: invokevirtual size : ()I
    //   160: invokevirtual a : (Ljava/util/ArrayList;II)Z
    //   163: ifeq -> 243
    //   166: aload_0
    //   167: getfield L : Ljava/util/ArrayList;
    //   170: iload #4
    //   172: invokevirtual remove : (I)Ljava/lang/Object;
    //   175: pop
    //   176: iload #4
    //   178: iconst_1
    //   179: isub
    //   180: istore #5
    //   182: iload #6
    //   184: iconst_1
    //   185: isub
    //   186: istore_3
    //   187: aload_1
    //   188: ifnull -> 238
    //   191: aload #7
    //   193: getfield a : Z
    //   196: ifne -> 238
    //   199: aload_1
    //   200: aload #7
    //   202: getfield b : Landroidx/fragment/app/a;
    //   205: invokevirtual indexOf : (Ljava/lang/Object;)I
    //   208: istore #4
    //   210: iload #4
    //   212: iconst_m1
    //   213: if_icmpeq -> 238
    //   216: aload_2
    //   217: ifnull -> 238
    //   220: aload_2
    //   221: iload #4
    //   223: invokevirtual get : (I)Ljava/lang/Object;
    //   226: checkcast java/lang/Boolean
    //   229: invokevirtual booleanValue : ()Z
    //   232: ifeq -> 238
    //   235: goto -> 115
    //   238: aload #7
    //   240: invokevirtual d : ()V
    //   243: iload #5
    //   245: iconst_1
    //   246: iadd
    //   247: istore #4
    //   249: iload_3
    //   250: istore #6
    //   252: goto -> 28
    //   255: return
  }
  
  private static void a(ArrayList<a> paramArrayList, ArrayList<Boolean> paramArrayList1, int paramInt1, int paramInt2) {
    while (paramInt1 < paramInt2) {
      a a = paramArrayList.get(paramInt1);
      boolean bool1 = ((Boolean)paramArrayList1.get(paramInt1)).booleanValue();
      boolean bool = true;
      if (bool1) {
        a.b(-1);
        if (paramInt1 != paramInt2 - 1)
          bool = false; 
        a.c(bool);
      } else {
        a.b(1);
        a.f();
      } 
      paramInt1++;
    } 
  }
  
  private boolean a(String paramString, int paramInt1, int paramInt2) {
    c(false);
    d(true);
    Fragment fragment = this.u;
    if (fragment != null && paramInt1 < 0 && paramString == null && fragment.n().F())
      return true; 
    boolean bool = a(this.I, this.J, paramString, paramInt1, paramInt2);
    if (bool) {
      this.b = true;
      try {
        c(this.I, this.J);
      } finally {
        J();
      } 
    } 
    Q();
    L();
    this.c.a();
    return bool;
  }
  
  private void b(b.d.b<Fragment> paramb) {
    int i1 = paramb.size();
    for (int i = 0; i < i1; i++) {
      Fragment fragment = (Fragment)paramb.c(i);
      if (!fragment.n) {
        View view = fragment.u0();
        fragment.P = view.getAlpha();
        view.setAlpha(0.0F);
      } 
    } 
  }
  
  private void b(ArrayList<a> paramArrayList, ArrayList<Boolean> paramArrayList1, int paramInt1, int paramInt2) {
    boolean bool1 = ((a)paramArrayList.get(paramInt1)).p;
    ArrayList<Fragment> arrayList = this.K;
    if (arrayList == null) {
      this.K = new ArrayList<Fragment>();
    } else {
      arrayList.clear();
    } 
    this.K.addAll(this.c.d());
    Fragment fragment = z();
    int i = paramInt1;
    boolean bool = false;
    while (i < paramInt2) {
      a a = paramArrayList.get(i);
      if (!((Boolean)paramArrayList1.get(i)).booleanValue()) {
        fragment = a.a(this.K, fragment);
      } else {
        fragment = a.b(this.K, fragment);
      } 
      if (bool || a.g) {
        bool = true;
      } else {
        bool = false;
      } 
      i++;
    } 
    this.K.clear();
    if (!bool1 && this.q >= 1)
      if (P) {
        for (i = paramInt1; i < paramInt2; i++) {
          Iterator<x.a> iterator = ((a)paramArrayList.get(i)).a.iterator();
          while (iterator.hasNext()) {
            Fragment fragment1 = ((x.a)iterator.next()).b;
            if (fragment1 != null && fragment1.u != null) {
              v v = c(fragment1);
              this.c.a(v);
            } 
          } 
        } 
      } else {
        y.a(this.r.f(), this.s, paramArrayList, paramArrayList1, paramInt1, paramInt2, false, this.n);
      }  
    a(paramArrayList, paramArrayList1, paramInt1, paramInt2);
    if (P) {
      bool1 = ((Boolean)paramArrayList1.get(paramInt2 - 1)).booleanValue();
      for (i = paramInt1; i < paramInt2; i++) {
        a a = paramArrayList.get(i);
        if (bool1) {
          int i1;
          for (i1 = a.a.size() - 1; i1 >= 0; i1--) {
            Fragment fragment1 = ((x.a)a.a.get(i1)).b;
            if (fragment1 != null)
              c(fragment1).l(); 
          } 
        } else {
          Iterator<x.a> iterator = a.a.iterator();
          while (iterator.hasNext()) {
            Fragment fragment1 = ((x.a)iterator.next()).b;
            if (fragment1 != null)
              c(fragment1).l(); 
          } 
        } 
      } 
      a(this.q, true);
      for (d0 d0 : a(paramArrayList, paramInt1, paramInt2)) {
        d0.a(bool1);
        d0.e();
        d0.a();
      } 
    } else {
      if (bool1) {
        b.d.b<Fragment> b1 = new b.d.b();
        a(b1);
        i = a(paramArrayList, paramArrayList1, paramInt1, paramInt2, b1);
        b(b1);
      } else {
        i = paramInt2;
      } 
      ArrayList<Boolean> arrayList1 = paramArrayList1;
      if (i != paramInt1 && bool1) {
        if (this.q >= 1)
          y.a(this.r.f(), this.s, paramArrayList, paramArrayList1, paramInt1, i, true, this.n); 
        paramArrayList1 = arrayList1;
        a(this.q, true);
      } else {
        paramArrayList1 = arrayList1;
      } 
    } 
    while (paramInt1 < paramInt2) {
      a a = paramArrayList.get(paramInt1);
      if (((Boolean)paramArrayList1.get(paramInt1)).booleanValue() && a.t >= 0)
        a.t = -1; 
      a.i();
      paramInt1++;
    } 
    if (bool)
      O(); 
  }
  
  private boolean b(ArrayList<a> paramArrayList, ArrayList<Boolean> paramArrayList1) {
    synchronized (this.a) {
      boolean bool = this.a.isEmpty();
      int i = 0;
      if (bool)
        return false; 
      int i1 = this.a.size();
      bool = false;
      while (i < i1) {
        bool |= ((p)this.a.get(i)).a(paramArrayList, paramArrayList1);
        i++;
      } 
      this.a.clear();
      this.r.h().removeCallbacks(this.N);
      return bool;
    } 
  }
  
  private void c(int paramInt) {
    try {
      this.b = true;
      this.c.a(paramInt);
      a(paramInt, false);
      if (P) {
        Iterator<d0> iterator = K().iterator();
        while (iterator.hasNext())
          ((d0)iterator.next()).b(); 
      } 
      this.b = false;
      return;
    } finally {
      this.b = false;
    } 
  }
  
  private void c(ArrayList<a> paramArrayList, ArrayList<Boolean> paramArrayList1) {
    if (paramArrayList.isEmpty())
      return; 
    if (paramArrayList.size() == paramArrayList1.size()) {
      a(paramArrayList, paramArrayList1);
      int i2 = paramArrayList.size();
      int i = 0;
      int i1;
      for (i1 = 0; i < i2; i1 = i3) {
        int i4 = i;
        int i3 = i1;
        if (!((a)paramArrayList.get(i)).p) {
          if (i1 != i)
            b(paramArrayList, paramArrayList1, i1, i); 
          i1 = i + 1;
          i3 = i1;
          if (((Boolean)paramArrayList1.get(i)).booleanValue())
            while (true) {
              i3 = i1;
              if (i1 < i2) {
                i3 = i1;
                if (((Boolean)paramArrayList1.get(i1)).booleanValue()) {
                  i3 = i1;
                  if (!((a)paramArrayList.get(i1)).p) {
                    i1++;
                    continue;
                  } 
                } 
              } 
              break;
            }  
          b(paramArrayList, paramArrayList1, i, i3);
          i4 = i3 - 1;
        } 
        i = i4 + 1;
      } 
      if (i1 != i2)
        b(paramArrayList, paramArrayList1, i1, i2); 
      return;
    } 
    IllegalStateException illegalStateException = new IllegalStateException("Internal error with the back stack records");
    throw illegalStateException;
  }
  
  private void d(boolean paramBoolean) {
    if (!this.b) {
      if (this.r == null) {
        if (this.G)
          throw new IllegalStateException("FragmentManager has been destroyed"); 
        throw new IllegalStateException("FragmentManager has not been attached to a host.");
      } 
      if (Looper.myLooper() == this.r.h().getLooper()) {
        if (!paramBoolean)
          I(); 
        if (this.I == null) {
          this.I = new ArrayList<a>();
          this.J = new ArrayList<Boolean>();
        } 
        this.b = true;
        try {
          a((ArrayList<a>)null, (ArrayList<Boolean>)null);
          return;
        } finally {
          this.b = false;
        } 
      } 
      throw new IllegalStateException("Must be called from main thread of fragment host");
    } 
    throw new IllegalStateException("FragmentManager is already executing transactions");
  }
  
  static boolean d(int paramInt) {
    return (O || Log.isLoggable("FragmentManager", paramInt));
  }
  
  static int e(int paramInt) {
    char c = ' ';
    if (paramInt != 4097) {
      if (paramInt != 4099)
        return (paramInt != 8194) ? 0 : 4097; 
      c = 'ဃ';
    } 
    return c;
  }
  
  private void p(Fragment paramFragment) {
    HashSet hashSet = this.m.get(paramFragment);
    if (hashSet != null) {
      Iterator<b.g.j.a> iterator = hashSet.iterator();
      while (iterator.hasNext())
        ((b.g.j.a)iterator.next()).a(); 
      hashSet.clear();
      r(paramFragment);
      this.m.remove(paramFragment);
    } 
  }
  
  private void q(Fragment paramFragment) {
    // Byte code:
    //   0: aload_1
    //   1: getfield J : Landroid/view/View;
    //   4: ifnull -> 199
    //   7: aload_0
    //   8: getfield r : Landroidx/fragment/app/k;
    //   11: invokevirtual f : ()Landroid/content/Context;
    //   14: aload_1
    //   15: aload_1
    //   16: getfield B : Z
    //   19: iconst_1
    //   20: ixor
    //   21: aload_1
    //   22: invokevirtual A : ()Z
    //   25: invokestatic a : (Landroid/content/Context;Landroidx/fragment/app/Fragment;ZZ)Landroidx/fragment/app/f$d;
    //   28: astore_3
    //   29: aload_3
    //   30: ifnull -> 135
    //   33: aload_3
    //   34: getfield b : Landroid/animation/Animator;
    //   37: astore #4
    //   39: aload #4
    //   41: ifnull -> 135
    //   44: aload #4
    //   46: aload_1
    //   47: getfield J : Landroid/view/View;
    //   50: invokevirtual setTarget : (Ljava/lang/Object;)V
    //   53: aload_1
    //   54: getfield B : Z
    //   57: ifeq -> 117
    //   60: aload_1
    //   61: invokevirtual Q : ()Z
    //   64: ifeq -> 75
    //   67: aload_1
    //   68: iconst_0
    //   69: invokevirtual h : (Z)V
    //   72: goto -> 125
    //   75: aload_1
    //   76: getfield I : Landroid/view/ViewGroup;
    //   79: astore #4
    //   81: aload_1
    //   82: getfield J : Landroid/view/View;
    //   85: astore #5
    //   87: aload #4
    //   89: aload #5
    //   91: invokevirtual startViewTransition : (Landroid/view/View;)V
    //   94: aload_3
    //   95: getfield b : Landroid/animation/Animator;
    //   98: new androidx/fragment/app/n$h
    //   101: dup
    //   102: aload_0
    //   103: aload #4
    //   105: aload #5
    //   107: aload_1
    //   108: invokespecial <init> : (Landroidx/fragment/app/n;Landroid/view/ViewGroup;Landroid/view/View;Landroidx/fragment/app/Fragment;)V
    //   111: invokevirtual addListener : (Landroid/animation/Animator$AnimatorListener;)V
    //   114: goto -> 125
    //   117: aload_1
    //   118: getfield J : Landroid/view/View;
    //   121: iconst_0
    //   122: invokevirtual setVisibility : (I)V
    //   125: aload_3
    //   126: getfield b : Landroid/animation/Animator;
    //   129: invokevirtual start : ()V
    //   132: goto -> 199
    //   135: aload_3
    //   136: ifnull -> 157
    //   139: aload_1
    //   140: getfield J : Landroid/view/View;
    //   143: aload_3
    //   144: getfield a : Landroid/view/animation/Animation;
    //   147: invokevirtual startAnimation : (Landroid/view/animation/Animation;)V
    //   150: aload_3
    //   151: getfield a : Landroid/view/animation/Animation;
    //   154: invokevirtual start : ()V
    //   157: aload_1
    //   158: getfield B : Z
    //   161: ifeq -> 177
    //   164: aload_1
    //   165: invokevirtual Q : ()Z
    //   168: ifne -> 177
    //   171: bipush #8
    //   173: istore_2
    //   174: goto -> 179
    //   177: iconst_0
    //   178: istore_2
    //   179: aload_1
    //   180: getfield J : Landroid/view/View;
    //   183: iload_2
    //   184: invokevirtual setVisibility : (I)V
    //   187: aload_1
    //   188: invokevirtual Q : ()Z
    //   191: ifeq -> 199
    //   194: aload_1
    //   195: iconst_0
    //   196: invokevirtual h : (Z)V
    //   199: aload_0
    //   200: aload_1
    //   201: invokevirtual h : (Landroidx/fragment/app/Fragment;)V
    //   204: aload_1
    //   205: iconst_0
    //   206: putfield O : Z
    //   209: aload_1
    //   210: aload_1
    //   211: getfield B : Z
    //   214: invokevirtual b : (Z)V
    //   217: return
  }
  
  private void r(Fragment paramFragment) {
    paramFragment.j0();
    this.o.i(paramFragment, false);
    paramFragment.I = null;
    paramFragment.J = null;
    paramFragment.U = null;
    paramFragment.V.b(null);
    paramFragment.q = false;
  }
  
  private void s(Fragment paramFragment) {
    if (paramFragment != null && paramFragment.equals(b(paramFragment.h)))
      paramFragment.n0(); 
  }
  
  private q t(Fragment paramFragment) {
    return this.M.c(paramFragment);
  }
  
  private ViewGroup u(Fragment paramFragment) {
    ViewGroup viewGroup = paramFragment.I;
    if (viewGroup != null)
      return viewGroup; 
    if (paramFragment.z <= 0)
      return null; 
    if (this.s.c()) {
      View view = this.s.a(paramFragment.z);
      if (view instanceof ViewGroup)
        return (ViewGroup)view; 
    } 
    return null;
  }
  
  private boolean v(Fragment paramFragment) {
    return ((paramFragment.F && paramFragment.G) || paramFragment.w.c());
  }
  
  private void w(Fragment paramFragment) {
    ViewGroup viewGroup = u(paramFragment);
    if (viewGroup != null && paramFragment.p() + paramFragment.s() + paramFragment.B() + paramFragment.C() > 0) {
      if (viewGroup.getTag(b.l.b.visible_removing_fragment_view_tag) == null)
        viewGroup.setTag(b.l.b.visible_removing_fragment_view_tag, paramFragment); 
      ((Fragment)viewGroup.getTag(b.l.b.visible_removing_fragment_view_tag)).i(paramFragment.A());
    } 
  }
  
  e0 A() {
    e0 e01 = this.x;
    if (e01 != null)
      return e01; 
    Fragment fragment = this.t;
    return (fragment != null) ? fragment.u.A() : this.y;
  }
  
  void B() {
    c(true);
    if (this.h.b()) {
      F();
      return;
    } 
    this.g.a();
  }
  
  public boolean C() {
    return this.G;
  }
  
  public boolean D() {
    return (this.E || this.F);
  }
  
  void E() {
    if (this.r == null)
      return; 
    this.E = false;
    this.F = false;
    this.M.a(false);
    for (Fragment fragment : this.c.d()) {
      if (fragment != null)
        fragment.Y(); 
    } 
  }
  
  public boolean F() {
    return a((String)null, -1, 0);
  }
  
  Parcelable G() {
    StringBuilder stringBuilder;
    N();
    M();
    c(true);
    this.E = true;
    this.M.a(true);
    ArrayList<u> arrayList = this.c.h();
    boolean bool = arrayList.isEmpty();
    b[] arrayOfB2 = null;
    if (bool) {
      if (d(2))
        Log.v("FragmentManager", "saveAllState: no fragments!"); 
      return null;
    } 
    ArrayList<String> arrayList1 = this.c.i();
    ArrayList<a> arrayList2 = this.d;
    b[] arrayOfB1 = arrayOfB2;
    if (arrayList2 != null) {
      int i = arrayList2.size();
      arrayOfB1 = arrayOfB2;
      if (i > 0) {
        arrayOfB2 = new b[i];
        int i1 = 0;
        while (true) {
          arrayOfB1 = arrayOfB2;
          if (i1 < i) {
            arrayOfB2[i1] = new b(this.d.get(i1));
            if (d(2)) {
              stringBuilder = new StringBuilder();
              stringBuilder.append("saveAllState: adding back stack #");
              stringBuilder.append(i1);
              stringBuilder.append(": ");
              stringBuilder.append(this.d.get(i1));
              Log.v("FragmentManager", stringBuilder.toString());
            } 
            i1++;
            continue;
          } 
          break;
        } 
      } 
    } 
    p p = new p();
    p.c = arrayList;
    p.d = arrayList1;
    p.e = (b[])stringBuilder;
    p.f = this.i.get();
    Fragment fragment = this.u;
    if (fragment != null)
      p.g = fragment.h; 
    p.h.addAll(this.j.keySet());
    p.i.addAll(this.j.values());
    p.j = new ArrayList<n>(this.C);
    return p;
  }
  
  void H() {
    boolean bool1;
    boolean bool2;
    synchronized (this.a) {
      ArrayList<r> arrayList = this.L;
      bool2 = false;
      if (arrayList != null && !this.L.isEmpty()) {
        bool1 = true;
      } else {
        bool1 = false;
      } 
      if (this.a.size() == 1)
        bool2 = true; 
    } 
    if (bool1 || bool2) {
      this.r.h().removeCallbacks(this.N);
      this.r.h().post(this.N);
      Q();
    } 
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=SYNTHETIC_LOCAL_VARIABLE_3} */
  }
  
  int a() {
    return this.i.getAndIncrement();
  }
  
  public Fragment a(int paramInt) {
    return this.c.b(paramInt);
  }
  
  v a(Fragment paramFragment) {
    if (d(2)) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("add: ");
      stringBuilder.append(paramFragment);
      Log.v("FragmentManager", stringBuilder.toString());
    } 
    v v = c(paramFragment);
    paramFragment.u = this;
    this.c.a(v);
    if (!paramFragment.C) {
      this.c.a(paramFragment);
      paramFragment.o = false;
      if (paramFragment.J == null)
        paramFragment.O = false; 
      if (v(paramFragment))
        this.D = true; 
    } 
    return v;
  }
  
  public void a(int paramInt1, int paramInt2) {
    if (paramInt1 >= 0) {
      a(new q(this, null, paramInt1, paramInt2), false);
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Bad id: ");
    stringBuilder.append(paramInt1);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  void a(int paramInt, boolean paramBoolean) {
    if (this.r != null || paramInt == -1) {
      if (!paramBoolean && paramInt == this.q)
        return; 
      this.q = paramInt;
      if (P) {
        this.c.f();
      } else {
        null = this.c.d().iterator();
        while (null.hasNext())
          k(null.next()); 
        for (v v : this.c.b()) {
          Fragment fragment = v.k();
          if (!fragment.N)
            k(fragment); 
          if (fragment.o && !fragment.R()) {
            paramInt = 1;
          } else {
            paramInt = 0;
          } 
          if (paramInt != 0)
            this.c.b(v); 
        } 
      } 
      P();
      if (this.D) {
        k<?> k1 = this.r;
        if (k1 != null && this.q == 7) {
          k1.k();
          this.D = false;
        } 
      } 
      return;
    } 
    throw new IllegalStateException("No activity");
  }
  
  void a(Configuration paramConfiguration) {
    for (Fragment fragment : this.c.d()) {
      if (fragment != null)
        fragment.a(paramConfiguration); 
    } 
  }
  
  void a(Parcelable paramParcelable) {
    if (paramParcelable == null)
      return; 
    p p = (p)paramParcelable;
    if (p.c == null)
      return; 
    this.c.g();
    for (Parcelable paramParcelable : p.c) {
      if (paramParcelable != null) {
        v v;
        Fragment fragment = this.M.b(((u)paramParcelable).d);
        if (fragment != null) {
          if (d(2)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("restoreSaveState: re-attaching retained ");
            stringBuilder.append(fragment);
            Log.v("FragmentManager", stringBuilder.toString());
          } 
          v = new v(this.o, this.c, fragment, (u)paramParcelable);
        } else {
          v = new v(this.o, this.c, this.r.f().getClassLoader(), s(), (u)v);
        } 
        fragment = v.k();
        fragment.u = this;
        if (d(2)) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("restoreSaveState: active (");
          stringBuilder.append(fragment.h);
          stringBuilder.append("): ");
          stringBuilder.append(fragment);
          Log.v("FragmentManager", stringBuilder.toString());
        } 
        v.a(this.r.f().getClassLoader());
        this.c.a(v);
        v.a(this.q);
      } 
    } 
    for (Fragment fragment : this.M.c()) {
      if (!this.c.a(fragment.h)) {
        if (d(2)) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Discarding retained Fragment ");
          stringBuilder.append(fragment);
          stringBuilder.append(" that was not found in the set of active Fragments ");
          stringBuilder.append(p.c);
          Log.v("FragmentManager", stringBuilder.toString());
        } 
        this.M.e(fragment);
        fragment.u = this;
        v v = new v(this.o, this.c, fragment);
        v.a(1);
        v.l();
        fragment.o = true;
        v.l();
      } 
    } 
    this.c.a(p.d);
    b[] arrayOfB = p.e;
    byte b1 = 0;
    if (arrayOfB != null) {
      this.d = new ArrayList<a>(arrayOfB.length);
      int i = 0;
      while (true) {
        arrayOfB = p.e;
        if (i < arrayOfB.length) {
          a a = arrayOfB[i].a(this);
          if (d(2)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("restoreAllState: back stack #");
            stringBuilder.append(i);
            stringBuilder.append(" (index ");
            stringBuilder.append(a.t);
            stringBuilder.append("): ");
            stringBuilder.append(a);
            Log.v("FragmentManager", stringBuilder.toString());
            PrintWriter printWriter = new PrintWriter(new c0("FragmentManager"));
            a.a("  ", printWriter, false);
            printWriter.close();
          } 
          this.d.add(a);
          i++;
          continue;
        } 
        break;
      } 
    } else {
      this.d = null;
    } 
    this.i.set(p.f);
    String str = p.g;
    if (str != null) {
      this.u = b(str);
      s(this.u);
    } 
    ArrayList<String> arrayList = p.h;
    if (arrayList != null)
      for (int i = b1; i < arrayList.size(); i++)
        this.j.put(arrayList.get(i), p.i.get(i));  
    this.C = new ArrayDeque<n>(p.j);
  }
  
  void a(Menu paramMenu) {
    if (this.q < 1)
      return; 
    for (Fragment fragment : this.c.d()) {
      if (fragment != null)
        fragment.c(paramMenu); 
    } 
  }
  
  void a(Fragment paramFragment, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield c : Landroidx/fragment/app/w;
    //   4: aload_1
    //   5: getfield h : Ljava/lang/String;
    //   8: invokevirtual e : (Ljava/lang/String;)Landroidx/fragment/app/v;
    //   11: astore #7
    //   13: aload #7
    //   15: astore #6
    //   17: aload #7
    //   19: ifnonnull -> 46
    //   22: new androidx/fragment/app/v
    //   25: dup
    //   26: aload_0
    //   27: getfield o : Landroidx/fragment/app/m;
    //   30: aload_0
    //   31: getfield c : Landroidx/fragment/app/w;
    //   34: aload_1
    //   35: invokespecial <init> : (Landroidx/fragment/app/m;Landroidx/fragment/app/w;Landroidx/fragment/app/Fragment;)V
    //   38: astore #6
    //   40: aload #6
    //   42: iconst_1
    //   43: invokevirtual a : (I)V
    //   46: iload_2
    //   47: istore_3
    //   48: aload_1
    //   49: getfield p : Z
    //   52: ifeq -> 80
    //   55: iload_2
    //   56: istore_3
    //   57: aload_1
    //   58: getfield q : Z
    //   61: ifeq -> 80
    //   64: iload_2
    //   65: istore_3
    //   66: aload_1
    //   67: getfield c : I
    //   70: iconst_2
    //   71: if_icmpne -> 80
    //   74: iload_2
    //   75: iconst_2
    //   76: invokestatic max : (II)I
    //   79: istore_3
    //   80: iload_3
    //   81: aload #6
    //   83: invokevirtual d : ()I
    //   86: invokestatic min : (II)I
    //   89: istore_3
    //   90: aload_1
    //   91: getfield c : I
    //   94: istore #5
    //   96: iload #5
    //   98: iload_3
    //   99: if_icmpgt -> 243
    //   102: iload #5
    //   104: iload_3
    //   105: if_icmpge -> 125
    //   108: aload_0
    //   109: getfield m : Ljava/util/Map;
    //   112: invokeinterface isEmpty : ()Z
    //   117: ifne -> 125
    //   120: aload_0
    //   121: aload_1
    //   122: invokespecial p : (Landroidx/fragment/app/Fragment;)V
    //   125: aload_1
    //   126: getfield c : I
    //   129: istore_2
    //   130: iload_2
    //   131: iconst_m1
    //   132: if_icmpeq -> 165
    //   135: iload_2
    //   136: ifeq -> 175
    //   139: iload_2
    //   140: iconst_1
    //   141: if_icmpeq -> 184
    //   144: iload_2
    //   145: iconst_2
    //   146: if_icmpeq -> 204
    //   149: iload_2
    //   150: iconst_4
    //   151: if_icmpeq -> 214
    //   154: iload_2
    //   155: iconst_5
    //   156: if_icmpeq -> 224
    //   159: iload_3
    //   160: istore #4
    //   162: goto -> 707
    //   165: iload_3
    //   166: iconst_m1
    //   167: if_icmple -> 175
    //   170: aload #6
    //   172: invokevirtual c : ()V
    //   175: iload_3
    //   176: ifle -> 184
    //   179: aload #6
    //   181: invokevirtual e : ()V
    //   184: iload_3
    //   185: iconst_m1
    //   186: if_icmple -> 194
    //   189: aload #6
    //   191: invokevirtual j : ()V
    //   194: iload_3
    //   195: iconst_1
    //   196: if_icmple -> 204
    //   199: aload #6
    //   201: invokevirtual f : ()V
    //   204: iload_3
    //   205: iconst_2
    //   206: if_icmple -> 214
    //   209: aload #6
    //   211: invokevirtual a : ()V
    //   214: iload_3
    //   215: iconst_4
    //   216: if_icmple -> 224
    //   219: aload #6
    //   221: invokevirtual q : ()V
    //   224: iload_3
    //   225: istore #4
    //   227: iload_3
    //   228: iconst_5
    //   229: if_icmple -> 707
    //   232: aload #6
    //   234: invokevirtual n : ()V
    //   237: iload_3
    //   238: istore #4
    //   240: goto -> 707
    //   243: iload_3
    //   244: istore #4
    //   246: iload #5
    //   248: iload_3
    //   249: if_icmple -> 707
    //   252: iload_3
    //   253: istore_2
    //   254: iload #5
    //   256: ifeq -> 692
    //   259: iload #5
    //   261: iconst_1
    //   262: if_icmpeq -> 660
    //   265: iload #5
    //   267: iconst_2
    //   268: if_icmpeq -> 396
    //   271: iload #5
    //   273: iconst_4
    //   274: if_icmpeq -> 317
    //   277: iload #5
    //   279: iconst_5
    //   280: if_icmpeq -> 307
    //   283: iload #5
    //   285: bipush #7
    //   287: if_icmpeq -> 296
    //   290: iload_3
    //   291: istore #4
    //   293: goto -> 707
    //   296: iload_3
    //   297: bipush #7
    //   299: if_icmpge -> 307
    //   302: aload #6
    //   304: invokevirtual m : ()V
    //   307: iload_3
    //   308: iconst_5
    //   309: if_icmpge -> 317
    //   312: aload #6
    //   314: invokevirtual r : ()V
    //   317: iload_3
    //   318: iconst_4
    //   319: if_icmpge -> 396
    //   322: iconst_3
    //   323: invokestatic d : (I)Z
    //   326: ifeq -> 366
    //   329: new java/lang/StringBuilder
    //   332: dup
    //   333: invokespecial <init> : ()V
    //   336: astore #7
    //   338: aload #7
    //   340: ldc_w 'movefrom ACTIVITY_CREATED: '
    //   343: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   346: pop
    //   347: aload #7
    //   349: aload_1
    //   350: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   353: pop
    //   354: ldc_w 'FragmentManager'
    //   357: aload #7
    //   359: invokevirtual toString : ()Ljava/lang/String;
    //   362: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
    //   365: pop
    //   366: aload_1
    //   367: getfield J : Landroid/view/View;
    //   370: ifnull -> 396
    //   373: aload_0
    //   374: getfield r : Landroidx/fragment/app/k;
    //   377: aload_1
    //   378: invokevirtual a : (Landroidx/fragment/app/Fragment;)Z
    //   381: ifeq -> 396
    //   384: aload_1
    //   385: getfield e : Landroid/util/SparseArray;
    //   388: ifnonnull -> 396
    //   391: aload #6
    //   393: invokevirtual p : ()V
    //   396: iload_3
    //   397: iconst_2
    //   398: if_icmpge -> 660
    //   401: aconst_null
    //   402: astore #8
    //   404: aload_1
    //   405: getfield J : Landroid/view/View;
    //   408: astore #7
    //   410: aload #7
    //   412: ifnull -> 642
    //   415: aload_1
    //   416: getfield I : Landroid/view/ViewGroup;
    //   419: astore #9
    //   421: aload #9
    //   423: ifnull -> 642
    //   426: aload #9
    //   428: aload #7
    //   430: invokevirtual endViewTransition : (Landroid/view/View;)V
    //   433: aload_1
    //   434: getfield J : Landroid/view/View;
    //   437: invokevirtual clearAnimation : ()V
    //   440: aload_1
    //   441: invokevirtual V : ()Z
    //   444: ifne -> 642
    //   447: aload #8
    //   449: astore #7
    //   451: aload_0
    //   452: getfield q : I
    //   455: iconst_m1
    //   456: if_icmple -> 515
    //   459: aload #8
    //   461: astore #7
    //   463: aload_0
    //   464: getfield G : Z
    //   467: ifne -> 515
    //   470: aload #8
    //   472: astore #7
    //   474: aload_1
    //   475: getfield J : Landroid/view/View;
    //   478: invokevirtual getVisibility : ()I
    //   481: ifne -> 515
    //   484: aload #8
    //   486: astore #7
    //   488: aload_1
    //   489: getfield P : F
    //   492: fconst_0
    //   493: fcmpl
    //   494: iflt -> 515
    //   497: aload_0
    //   498: getfield r : Landroidx/fragment/app/k;
    //   501: invokevirtual f : ()Landroid/content/Context;
    //   504: aload_1
    //   505: iconst_0
    //   506: aload_1
    //   507: invokevirtual A : ()Z
    //   510: invokestatic a : (Landroid/content/Context;Landroidx/fragment/app/Fragment;ZZ)Landroidx/fragment/app/f$d;
    //   513: astore #7
    //   515: aload_1
    //   516: fconst_0
    //   517: putfield P : F
    //   520: aload_1
    //   521: getfield I : Landroid/view/ViewGroup;
    //   524: astore #8
    //   526: aload_1
    //   527: getfield J : Landroid/view/View;
    //   530: astore #9
    //   532: aload #7
    //   534: ifnull -> 547
    //   537: aload_1
    //   538: aload #7
    //   540: aload_0
    //   541: getfield n : Landroidx/fragment/app/y$g;
    //   544: invokestatic a : (Landroidx/fragment/app/Fragment;Landroidx/fragment/app/f$d;Landroidx/fragment/app/y$g;)V
    //   547: aload #8
    //   549: aload #9
    //   551: invokevirtual removeView : (Landroid/view/View;)V
    //   554: iconst_2
    //   555: invokestatic d : (I)Z
    //   558: ifeq -> 632
    //   561: new java/lang/StringBuilder
    //   564: dup
    //   565: invokespecial <init> : ()V
    //   568: astore #7
    //   570: aload #7
    //   572: ldc_w 'Removing view '
    //   575: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   578: pop
    //   579: aload #7
    //   581: aload #9
    //   583: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   586: pop
    //   587: aload #7
    //   589: ldc_w ' for fragment '
    //   592: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   595: pop
    //   596: aload #7
    //   598: aload_1
    //   599: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   602: pop
    //   603: aload #7
    //   605: ldc_w ' from container '
    //   608: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   611: pop
    //   612: aload #7
    //   614: aload #8
    //   616: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   619: pop
    //   620: ldc_w 'FragmentManager'
    //   623: aload #7
    //   625: invokevirtual toString : ()Ljava/lang/String;
    //   628: invokestatic v : (Ljava/lang/String;Ljava/lang/String;)I
    //   631: pop
    //   632: aload #8
    //   634: aload_1
    //   635: getfield I : Landroid/view/ViewGroup;
    //   638: if_acmpeq -> 642
    //   641: return
    //   642: aload_0
    //   643: getfield m : Ljava/util/Map;
    //   646: aload_1
    //   647: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   652: ifnonnull -> 660
    //   655: aload #6
    //   657: invokevirtual h : ()V
    //   660: iload_3
    //   661: istore_2
    //   662: iload_3
    //   663: iconst_1
    //   664: if_icmpge -> 692
    //   667: aload_0
    //   668: getfield m : Ljava/util/Map;
    //   671: aload_1
    //   672: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   677: ifnull -> 685
    //   680: iconst_1
    //   681: istore_2
    //   682: goto -> 692
    //   685: aload #6
    //   687: invokevirtual g : ()V
    //   690: iload_3
    //   691: istore_2
    //   692: iload_2
    //   693: istore #4
    //   695: iload_2
    //   696: ifge -> 707
    //   699: aload #6
    //   701: invokevirtual i : ()V
    //   704: iload_2
    //   705: istore #4
    //   707: aload_1
    //   708: getfield c : I
    //   711: iload #4
    //   713: if_icmpeq -> 802
    //   716: iconst_3
    //   717: invokestatic d : (I)Z
    //   720: ifeq -> 796
    //   723: new java/lang/StringBuilder
    //   726: dup
    //   727: invokespecial <init> : ()V
    //   730: astore #6
    //   732: aload #6
    //   734: ldc_w 'moveToState: Fragment state for '
    //   737: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   740: pop
    //   741: aload #6
    //   743: aload_1
    //   744: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   747: pop
    //   748: aload #6
    //   750: ldc_w ' not updated inline; expected state '
    //   753: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   756: pop
    //   757: aload #6
    //   759: iload #4
    //   761: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   764: pop
    //   765: aload #6
    //   767: ldc_w ' found '
    //   770: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   773: pop
    //   774: aload #6
    //   776: aload_1
    //   777: getfield c : I
    //   780: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   783: pop
    //   784: ldc_w 'FragmentManager'
    //   787: aload #6
    //   789: invokevirtual toString : ()Ljava/lang/String;
    //   792: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
    //   795: pop
    //   796: aload_1
    //   797: iload #4
    //   799: putfield c : I
    //   802: return
  }
  
  void a(Fragment paramFragment, @SuppressLint({"UnknownNullness"}) Intent paramIntent, int paramInt, Bundle paramBundle) {
    n n1;
    if (this.z != null) {
      n1 = new n(paramFragment.h, paramInt);
      this.C.addLast(n1);
      if (paramIntent != null && paramBundle != null)
        paramIntent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", paramBundle); 
      this.z.a(paramIntent);
      return;
    } 
    this.r.a((Fragment)n1, paramIntent, paramInt, paramBundle);
  }
  
  void a(Fragment paramFragment, androidx.lifecycle.g.c paramc) {
    if (paramFragment.equals(b(paramFragment.h)) && (paramFragment.v == null || paramFragment.u == this)) {
      paramFragment.S = paramc;
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Fragment ");
    stringBuilder.append(paramFragment);
    stringBuilder.append(" is not an active fragment of FragmentManager ");
    stringBuilder.append(this);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  void a(Fragment paramFragment, b.g.j.a parama) {
    if (this.m.get(paramFragment) == null)
      this.m.put(paramFragment, new HashSet<b.g.j.a>()); 
    ((HashSet<b.g.j.a>)this.m.get(paramFragment)).add(parama);
  }
  
  void a(Fragment paramFragment, boolean paramBoolean) {
    ViewGroup viewGroup = u(paramFragment);
    if (viewGroup != null && viewGroup instanceof h)
      ((h)viewGroup).setDrawDisappearingViewsLast(paramBoolean ^ true); 
  }
  
  void a(a parama) {
    if (this.d == null)
      this.d = new ArrayList<a>(); 
    this.d.add(parama);
  }
  
  void a(a parama, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) {
    if (paramBoolean1) {
      parama.c(paramBoolean3);
    } else {
      parama.f();
    } 
    ArrayList<a> arrayList = new ArrayList(1);
    ArrayList<Boolean> arrayList1 = new ArrayList(1);
    arrayList.add(parama);
    arrayList1.add(Boolean.valueOf(paramBoolean1));
    if (paramBoolean2 && this.q >= 1)
      y.a(this.r.f(), this.s, arrayList, arrayList1, 0, 1, true, this.n); 
    if (paramBoolean3)
      a(this.q, true); 
    for (Fragment fragment : this.c.c()) {
      if (fragment != null && fragment.J != null && fragment.N && parama.c(fragment.z)) {
        float f = fragment.P;
        if (f > 0.0F)
          fragment.J.setAlpha(f); 
        if (paramBoolean3) {
          fragment.P = 0.0F;
          continue;
        } 
        fragment.P = -1.0F;
        fragment.N = false;
      } 
    } 
  }
  
  void a(h paramh) {
    for (v v : this.c.b()) {
      Fragment fragment = v.k();
      if (fragment.z == paramh.getId()) {
        View view = fragment.J;
        if (view != null && view.getParent() == null) {
          fragment.I = (ViewGroup)paramh;
          v.b();
        } 
      } 
    } 
  }
  
  @SuppressLint({"SyntheticAccessor"})
  void a(k<?> paramk, g paramg, Fragment paramFragment) {
    // Byte code:
    //   0: aload_0
    //   1: getfield r : Landroidx/fragment/app/k;
    //   4: ifnonnull -> 429
    //   7: aload_0
    //   8: aload_1
    //   9: putfield r : Landroidx/fragment/app/k;
    //   12: aload_0
    //   13: aload_2
    //   14: putfield s : Landroidx/fragment/app/g;
    //   17: aload_0
    //   18: aload_3
    //   19: putfield t : Landroidx/fragment/app/Fragment;
    //   22: aload_0
    //   23: getfield t : Landroidx/fragment/app/Fragment;
    //   26: ifnull -> 47
    //   29: new androidx/fragment/app/n$i
    //   32: dup
    //   33: aload_0
    //   34: aload_3
    //   35: invokespecial <init> : (Landroidx/fragment/app/n;Landroidx/fragment/app/Fragment;)V
    //   38: astore_2
    //   39: aload_0
    //   40: aload_2
    //   41: invokevirtual a : (Landroidx/fragment/app/r;)V
    //   44: goto -> 62
    //   47: aload_1
    //   48: instanceof androidx/fragment/app/r
    //   51: ifeq -> 62
    //   54: aload_1
    //   55: checkcast androidx/fragment/app/r
    //   58: astore_2
    //   59: goto -> 39
    //   62: aload_0
    //   63: getfield t : Landroidx/fragment/app/Fragment;
    //   66: ifnull -> 73
    //   69: aload_0
    //   70: invokespecial Q : ()V
    //   73: aload_1
    //   74: instanceof androidx/activity/c
    //   77: ifeq -> 113
    //   80: aload_1
    //   81: checkcast androidx/activity/c
    //   84: astore_2
    //   85: aload_0
    //   86: aload_2
    //   87: invokeinterface b : ()Landroidx/activity/OnBackPressedDispatcher;
    //   92: putfield g : Landroidx/activity/OnBackPressedDispatcher;
    //   95: aload_3
    //   96: ifnull -> 101
    //   99: aload_3
    //   100: astore_2
    //   101: aload_0
    //   102: getfield g : Landroidx/activity/OnBackPressedDispatcher;
    //   105: aload_2
    //   106: aload_0
    //   107: getfield h : Landroidx/activity/b;
    //   110: invokevirtual a : (Landroidx/lifecycle/j;Landroidx/activity/b;)V
    //   113: aload_3
    //   114: ifnull -> 134
    //   117: aload_3
    //   118: getfield u : Landroidx/fragment/app/n;
    //   121: aload_3
    //   122: invokespecial t : (Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/q;
    //   125: astore_1
    //   126: aload_0
    //   127: aload_1
    //   128: putfield M : Landroidx/fragment/app/q;
    //   131: goto -> 169
    //   134: aload_1
    //   135: instanceof androidx/lifecycle/x
    //   138: ifeq -> 157
    //   141: aload_1
    //   142: checkcast androidx/lifecycle/x
    //   145: invokeinterface d : ()Landroidx/lifecycle/w;
    //   150: invokestatic a : (Landroidx/lifecycle/w;)Landroidx/fragment/app/q;
    //   153: astore_1
    //   154: goto -> 126
    //   157: new androidx/fragment/app/q
    //   160: dup
    //   161: iconst_0
    //   162: invokespecial <init> : (Z)V
    //   165: astore_1
    //   166: goto -> 126
    //   169: aload_0
    //   170: getfield M : Landroidx/fragment/app/q;
    //   173: aload_0
    //   174: invokevirtual D : ()Z
    //   177: invokevirtual a : (Z)V
    //   180: aload_0
    //   181: getfield c : Landroidx/fragment/app/w;
    //   184: aload_0
    //   185: getfield M : Landroidx/fragment/app/q;
    //   188: invokevirtual a : (Landroidx/fragment/app/q;)V
    //   191: aload_0
    //   192: getfield r : Landroidx/fragment/app/k;
    //   195: astore_1
    //   196: aload_1
    //   197: instanceof androidx/activity/result/f
    //   200: ifeq -> 428
    //   203: aload_1
    //   204: checkcast androidx/activity/result/f
    //   207: invokeinterface g : ()Landroidx/activity/result/e;
    //   212: astore_2
    //   213: aload_3
    //   214: ifnull -> 250
    //   217: new java/lang/StringBuilder
    //   220: dup
    //   221: invokespecial <init> : ()V
    //   224: astore_1
    //   225: aload_1
    //   226: aload_3
    //   227: getfield h : Ljava/lang/String;
    //   230: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   233: pop
    //   234: aload_1
    //   235: ldc_w ':'
    //   238: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   241: pop
    //   242: aload_1
    //   243: invokevirtual toString : ()Ljava/lang/String;
    //   246: astore_1
    //   247: goto -> 254
    //   250: ldc_w ''
    //   253: astore_1
    //   254: new java/lang/StringBuilder
    //   257: dup
    //   258: invokespecial <init> : ()V
    //   261: astore_3
    //   262: aload_3
    //   263: ldc_w 'FragmentManager:'
    //   266: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   269: pop
    //   270: aload_3
    //   271: aload_1
    //   272: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   275: pop
    //   276: aload_3
    //   277: invokevirtual toString : ()Ljava/lang/String;
    //   280: astore_1
    //   281: new java/lang/StringBuilder
    //   284: dup
    //   285: invokespecial <init> : ()V
    //   288: astore_3
    //   289: aload_3
    //   290: aload_1
    //   291: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   294: pop
    //   295: aload_3
    //   296: ldc_w 'StartActivityForResult'
    //   299: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   302: pop
    //   303: aload_0
    //   304: aload_2
    //   305: aload_3
    //   306: invokevirtual toString : ()Ljava/lang/String;
    //   309: new androidx/activity/result/h/c
    //   312: dup
    //   313: invokespecial <init> : ()V
    //   316: new androidx/fragment/app/n$j
    //   319: dup
    //   320: aload_0
    //   321: invokespecial <init> : (Landroidx/fragment/app/n;)V
    //   324: invokevirtual a : (Ljava/lang/String;Landroidx/activity/result/h/a;Landroidx/activity/result/b;)Landroidx/activity/result/d;
    //   327: putfield z : Landroidx/activity/result/d;
    //   330: new java/lang/StringBuilder
    //   333: dup
    //   334: invokespecial <init> : ()V
    //   337: astore_3
    //   338: aload_3
    //   339: aload_1
    //   340: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   343: pop
    //   344: aload_3
    //   345: ldc_w 'StartIntentSenderForResult'
    //   348: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   351: pop
    //   352: aload_0
    //   353: aload_2
    //   354: aload_3
    //   355: invokevirtual toString : ()Ljava/lang/String;
    //   358: new androidx/fragment/app/n$l
    //   361: dup
    //   362: invokespecial <init> : ()V
    //   365: new androidx/fragment/app/n$a
    //   368: dup
    //   369: aload_0
    //   370: invokespecial <init> : (Landroidx/fragment/app/n;)V
    //   373: invokevirtual a : (Ljava/lang/String;Landroidx/activity/result/h/a;Landroidx/activity/result/b;)Landroidx/activity/result/d;
    //   376: putfield A : Landroidx/activity/result/d;
    //   379: new java/lang/StringBuilder
    //   382: dup
    //   383: invokespecial <init> : ()V
    //   386: astore_3
    //   387: aload_3
    //   388: aload_1
    //   389: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   392: pop
    //   393: aload_3
    //   394: ldc_w 'RequestPermissions'
    //   397: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   400: pop
    //   401: aload_0
    //   402: aload_2
    //   403: aload_3
    //   404: invokevirtual toString : ()Ljava/lang/String;
    //   407: new androidx/activity/result/h/b
    //   410: dup
    //   411: invokespecial <init> : ()V
    //   414: new androidx/fragment/app/n$b
    //   417: dup
    //   418: aload_0
    //   419: invokespecial <init> : (Landroidx/fragment/app/n;)V
    //   422: invokevirtual a : (Ljava/lang/String;Landroidx/activity/result/h/a;Landroidx/activity/result/b;)Landroidx/activity/result/d;
    //   425: putfield B : Landroidx/activity/result/d;
    //   428: return
    //   429: new java/lang/IllegalStateException
    //   432: dup
    //   433: ldc_w 'Already attached'
    //   436: invokespecial <init> : (Ljava/lang/String;)V
    //   439: astore_1
    //   440: goto -> 445
    //   443: aload_1
    //   444: athrow
    //   445: goto -> 443
  }
  
  public void a(m paramm) {
    this.o.a(paramm);
  }
  
  public void a(m paramm, boolean paramBoolean) {
    this.o.a(paramm, paramBoolean);
  }
  
  public void a(o paramo) {
    if (this.l == null)
      this.l = new ArrayList<o>(); 
    this.l.add(paramo);
  }
  
  void a(p paramp, boolean paramBoolean) {
    if (!paramBoolean) {
      if (this.r == null) {
        if (this.G)
          throw new IllegalStateException("FragmentManager has been destroyed"); 
        throw new IllegalStateException("FragmentManager has not been attached to a host.");
      } 
      I();
    } 
    synchronized (this.a) {
      if (this.r == null) {
        if (paramBoolean)
          return; 
        throw new IllegalStateException("Activity has been destroyed");
      } 
      this.a.add(paramp);
      H();
      return;
    } 
  }
  
  public void a(r paramr) {
    this.p.add(paramr);
  }
  
  void a(v paramv) {
    Fragment fragment = paramv.k();
    if (fragment.K) {
      if (this.b) {
        this.H = true;
        return;
      } 
      fragment.K = false;
      if (P) {
        paramv.l();
        return;
      } 
      l(fragment);
    } 
  }
  
  public final void a(String paramString) {
    this.j.remove(paramString);
  }
  
  public void a(String paramString, int paramInt) {
    a(new q(this, paramString, -1, paramInt), false);
  }
  
  public void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString) {
    StringBuilder stringBuilder2 = new StringBuilder();
    stringBuilder2.append(paramString);
    stringBuilder2.append("    ");
    String str = stringBuilder2.toString();
    this.c.a(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    ArrayList<Fragment> arrayList1 = this.e;
    byte b1 = 0;
    if (arrayList1 != null) {
      int i = arrayList1.size();
      if (i > 0) {
        paramPrintWriter.print(paramString);
        paramPrintWriter.println("Fragments Created Menus:");
        int i1;
        for (i1 = 0; i1 < i; i1++) {
          Fragment fragment = this.e.get(i1);
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(i1);
          paramPrintWriter.print(": ");
          paramPrintWriter.println(fragment.toString());
        } 
      } 
    } 
    ArrayList<a> arrayList = this.d;
    if (arrayList != null) {
      int i = arrayList.size();
      if (i > 0) {
        paramPrintWriter.print(paramString);
        paramPrintWriter.println("Back Stack:");
        int i1;
        for (i1 = 0; i1 < i; i1++) {
          a a = this.d.get(i1);
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(i1);
          paramPrintWriter.print(": ");
          paramPrintWriter.println(a.toString());
          a.a(str, paramPrintWriter);
        } 
      } 
    } 
    paramPrintWriter.print(paramString);
    StringBuilder stringBuilder1 = new StringBuilder();
    stringBuilder1.append("Back Stack Index: ");
    stringBuilder1.append(this.i.get());
    paramPrintWriter.println(stringBuilder1.toString());
    synchronized (this.a) {
      int i = this.a.size();
      if (i > 0) {
        paramPrintWriter.print(paramString);
        paramPrintWriter.println("Pending Actions:");
        int i1;
        for (i1 = b1; i1 < i; i1++) {
          p p = this.a.get(i1);
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(i1);
          paramPrintWriter.print(": ");
          paramPrintWriter.println(p);
        } 
      } 
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("FragmentManager misc state:");
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("  mHost=");
      paramPrintWriter.println(this.r);
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("  mContainer=");
      paramPrintWriter.println(this.s);
      if (this.t != null) {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("  mParent=");
        paramPrintWriter.println(this.t);
      } 
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("  mCurState=");
      paramPrintWriter.print(this.q);
      paramPrintWriter.print(" mStateSaved=");
      paramPrintWriter.print(this.E);
      paramPrintWriter.print(" mStopped=");
      paramPrintWriter.print(this.F);
      paramPrintWriter.print(" mDestroyed=");
      paramPrintWriter.println(this.G);
      if (this.D) {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("  mNeedMenuInvalidate=");
        paramPrintWriter.println(this.D);
      } 
      return;
    } 
  }
  
  void a(boolean paramBoolean) {
    for (Fragment fragment : this.c.d()) {
      if (fragment != null)
        fragment.f(paramBoolean); 
    } 
  }
  
  boolean a(Menu paramMenu, MenuInflater paramMenuInflater) {
    int i1 = this.q;
    int i = 0;
    if (i1 < 1)
      return false; 
    ArrayList<Fragment> arrayList = null;
    Iterator<Fragment> iterator = this.c.d().iterator();
    boolean bool = false;
    while (iterator.hasNext()) {
      Fragment fragment = iterator.next();
      if (fragment != null && i(fragment) && fragment.b(paramMenu, paramMenuInflater)) {
        ArrayList<Fragment> arrayList1 = arrayList;
        if (arrayList == null)
          arrayList1 = new ArrayList(); 
        arrayList1.add(fragment);
        bool = true;
        arrayList = arrayList1;
      } 
    } 
    if (this.e != null)
      while (i < this.e.size()) {
        Fragment fragment = this.e.get(i);
        if (arrayList == null || !arrayList.contains(fragment))
          fragment.a0(); 
        i++;
      }  
    this.e = arrayList;
    return bool;
  }
  
  boolean a(MenuItem paramMenuItem) {
    if (this.q < 1)
      return false; 
    for (Fragment fragment : this.c.d()) {
      if (fragment != null && fragment.c(paramMenuItem))
        return true; 
    } 
    return false;
  }
  
  boolean a(ArrayList<a> paramArrayList, ArrayList<Boolean> paramArrayList1, String paramString, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: getfield d : Ljava/util/ArrayList;
    //   4: astore #8
    //   6: aload #8
    //   8: ifnonnull -> 13
    //   11: iconst_0
    //   12: ireturn
    //   13: aload_3
    //   14: ifnonnull -> 70
    //   17: iload #4
    //   19: ifge -> 70
    //   22: iload #5
    //   24: iconst_1
    //   25: iand
    //   26: ifne -> 70
    //   29: aload #8
    //   31: invokevirtual size : ()I
    //   34: iconst_1
    //   35: isub
    //   36: istore #4
    //   38: iload #4
    //   40: ifge -> 45
    //   43: iconst_0
    //   44: ireturn
    //   45: aload_1
    //   46: aload_0
    //   47: getfield d : Ljava/util/ArrayList;
    //   50: iload #4
    //   52: invokevirtual remove : (I)Ljava/lang/Object;
    //   55: invokevirtual add : (Ljava/lang/Object;)Z
    //   58: pop
    //   59: aload_2
    //   60: iconst_1
    //   61: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   64: invokevirtual add : (Ljava/lang/Object;)Z
    //   67: pop
    //   68: iconst_1
    //   69: ireturn
    //   70: aload_3
    //   71: ifnonnull -> 88
    //   74: iload #4
    //   76: iflt -> 82
    //   79: goto -> 88
    //   82: iconst_m1
    //   83: istore #7
    //   85: goto -> 261
    //   88: aload_0
    //   89: getfield d : Ljava/util/ArrayList;
    //   92: invokevirtual size : ()I
    //   95: iconst_1
    //   96: isub
    //   97: istore #6
    //   99: iload #6
    //   101: iflt -> 164
    //   104: aload_0
    //   105: getfield d : Ljava/util/ArrayList;
    //   108: iload #6
    //   110: invokevirtual get : (I)Ljava/lang/Object;
    //   113: checkcast androidx/fragment/app/a
    //   116: astore #8
    //   118: aload_3
    //   119: ifnull -> 137
    //   122: aload_3
    //   123: aload #8
    //   125: invokevirtual g : ()Ljava/lang/String;
    //   128: invokevirtual equals : (Ljava/lang/Object;)Z
    //   131: ifeq -> 137
    //   134: goto -> 164
    //   137: iload #4
    //   139: iflt -> 155
    //   142: iload #4
    //   144: aload #8
    //   146: getfield t : I
    //   149: if_icmpne -> 155
    //   152: goto -> 164
    //   155: iload #6
    //   157: iconst_1
    //   158: isub
    //   159: istore #6
    //   161: goto -> 99
    //   164: iload #6
    //   166: ifge -> 171
    //   169: iconst_0
    //   170: ireturn
    //   171: iload #6
    //   173: istore #7
    //   175: iload #5
    //   177: iconst_1
    //   178: iand
    //   179: ifeq -> 261
    //   182: iload #6
    //   184: iconst_1
    //   185: isub
    //   186: istore #5
    //   188: iload #5
    //   190: istore #7
    //   192: iload #5
    //   194: iflt -> 261
    //   197: aload_0
    //   198: getfield d : Ljava/util/ArrayList;
    //   201: iload #5
    //   203: invokevirtual get : (I)Ljava/lang/Object;
    //   206: checkcast androidx/fragment/app/a
    //   209: astore #8
    //   211: aload_3
    //   212: ifnull -> 231
    //   215: iload #5
    //   217: istore #6
    //   219: aload_3
    //   220: aload #8
    //   222: invokevirtual g : ()Ljava/lang/String;
    //   225: invokevirtual equals : (Ljava/lang/Object;)Z
    //   228: ifne -> 182
    //   231: iload #5
    //   233: istore #7
    //   235: iload #4
    //   237: iflt -> 261
    //   240: iload #5
    //   242: istore #7
    //   244: iload #4
    //   246: aload #8
    //   248: getfield t : I
    //   251: if_icmpne -> 261
    //   254: iload #5
    //   256: istore #6
    //   258: goto -> 182
    //   261: iload #7
    //   263: aload_0
    //   264: getfield d : Ljava/util/ArrayList;
    //   267: invokevirtual size : ()I
    //   270: iconst_1
    //   271: isub
    //   272: if_icmpne -> 277
    //   275: iconst_0
    //   276: ireturn
    //   277: aload_0
    //   278: getfield d : Ljava/util/ArrayList;
    //   281: invokevirtual size : ()I
    //   284: iconst_1
    //   285: isub
    //   286: istore #4
    //   288: iload #4
    //   290: iload #7
    //   292: if_icmple -> 327
    //   295: aload_1
    //   296: aload_0
    //   297: getfield d : Ljava/util/ArrayList;
    //   300: iload #4
    //   302: invokevirtual remove : (I)Ljava/lang/Object;
    //   305: invokevirtual add : (Ljava/lang/Object;)Z
    //   308: pop
    //   309: aload_2
    //   310: iconst_1
    //   311: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   314: invokevirtual add : (Ljava/lang/Object;)Z
    //   317: pop
    //   318: iload #4
    //   320: iconst_1
    //   321: isub
    //   322: istore #4
    //   324: goto -> 288
    //   327: iconst_1
    //   328: ireturn
  }
  
  Fragment b(String paramString) {
    return this.c.b(paramString);
  }
  
  public x b() {
    return new a(this);
  }
  
  void b(Fragment paramFragment) {
    if (d(2)) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("attach: ");
      stringBuilder.append(paramFragment);
      Log.v("FragmentManager", stringBuilder.toString());
    } 
    if (paramFragment.C) {
      paramFragment.C = false;
      if (!paramFragment.n) {
        this.c.a(paramFragment);
        if (d(2)) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("add from attach: ");
          stringBuilder.append(paramFragment);
          Log.v("FragmentManager", stringBuilder.toString());
        } 
        if (v(paramFragment))
          this.D = true; 
      } 
    } 
  }
  
  void b(Fragment paramFragment, b.g.j.a parama) {
    HashSet hashSet = this.m.get(paramFragment);
    if (hashSet != null && hashSet.remove(parama) && hashSet.isEmpty()) {
      this.m.remove(paramFragment);
      if (paramFragment.c < 5) {
        r(paramFragment);
        l(paramFragment);
      } 
    } 
  }
  
  public void b(o paramo) {
    ArrayList<o> arrayList = this.l;
    if (arrayList != null)
      arrayList.remove(paramo); 
  }
  
  void b(p paramp, boolean paramBoolean) {
    if (paramBoolean && (this.r == null || this.G))
      return; 
    d(paramBoolean);
    if (paramp.a(this.I, this.J)) {
      this.b = true;
      try {
        c(this.I, this.J);
      } finally {
        J();
      } 
    } 
    Q();
    L();
    this.c.a();
  }
  
  void b(boolean paramBoolean) {
    for (Fragment fragment : this.c.d()) {
      if (fragment != null)
        fragment.g(paramBoolean); 
    } 
  }
  
  boolean b(int paramInt) {
    return (this.q >= paramInt);
  }
  
  boolean b(Menu paramMenu) {
    int i = this.q;
    boolean bool = false;
    if (i < 1)
      return false; 
    for (Fragment fragment : this.c.d()) {
      if (fragment != null && i(fragment) && fragment.d(paramMenu))
        bool = true; 
    } 
    return bool;
  }
  
  boolean b(MenuItem paramMenuItem) {
    if (this.q < 1)
      return false; 
    for (Fragment fragment : this.c.d()) {
      if (fragment != null && fragment.d(paramMenuItem))
        return true; 
    } 
    return false;
  }
  
  public Fragment c(String paramString) {
    return this.c.c(paramString);
  }
  
  v c(Fragment paramFragment) {
    v v2 = this.c.e(paramFragment.h);
    if (v2 != null)
      return v2; 
    v v1 = new v(this.o, this.c, paramFragment);
    v1.a(this.r.f().getClassLoader());
    v1.a(this.q);
    return v1;
  }
  
  boolean c() {
    Iterator<Fragment> iterator = this.c.c().iterator();
    boolean bool = false;
    while (iterator.hasNext()) {
      Fragment fragment = iterator.next();
      boolean bool1 = bool;
      if (fragment != null)
        bool1 = v(fragment); 
      bool = bool1;
      if (bool1)
        return true; 
    } 
    return false;
  }
  
  boolean c(boolean paramBoolean) {
    d(paramBoolean);
    paramBoolean = false;
    while (b(this.I, this.J)) {
      this.b = true;
      try {
        c(this.I, this.J);
        J();
      } finally {
        J();
      } 
    } 
    Q();
    L();
    this.c.a();
    return paramBoolean;
  }
  
  Fragment d(String paramString) {
    return this.c.d(paramString);
  }
  
  void d() {
    this.E = false;
    this.F = false;
    this.M.a(false);
    c(4);
  }
  
  void d(Fragment paramFragment) {
    if (d(2)) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("detach: ");
      stringBuilder.append(paramFragment);
      Log.v("FragmentManager", stringBuilder.toString());
    } 
    if (!paramFragment.C) {
      paramFragment.C = true;
      if (paramFragment.n) {
        if (d(2)) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("remove from detach: ");
          stringBuilder.append(paramFragment);
          Log.v("FragmentManager", stringBuilder.toString());
        } 
        this.c.c(paramFragment);
        if (v(paramFragment))
          this.D = true; 
        w(paramFragment);
      } 
    } 
  }
  
  void e() {
    this.E = false;
    this.F = false;
    this.M.a(false);
    c(0);
  }
  
  void e(Fragment paramFragment) {
    Iterator<r> iterator = this.p.iterator();
    while (iterator.hasNext())
      ((r)iterator.next()).a(this, paramFragment); 
  }
  
  w f(Fragment paramFragment) {
    return this.M.d(paramFragment);
  }
  
  void f() {
    this.E = false;
    this.F = false;
    this.M.a(false);
    c(1);
  }
  
  void g() {
    this.G = true;
    c(true);
    M();
    c(-1);
    this.r = null;
    this.s = null;
    this.t = null;
    if (this.g != null) {
      this.h.c();
      this.g = null;
    } 
    androidx.activity.result.d<Intent> d1 = this.z;
    if (d1 != null) {
      d1.a();
      this.A.a();
      this.B.a();
    } 
  }
  
  void g(Fragment paramFragment) {
    if (d(2)) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("hide: ");
      stringBuilder.append(paramFragment);
      Log.v("FragmentManager", stringBuilder.toString());
    } 
    if (!paramFragment.B) {
      paramFragment.B = true;
      paramFragment.O = true ^ paramFragment.O;
      w(paramFragment);
    } 
  }
  
  void h() {
    c(1);
  }
  
  void h(Fragment paramFragment) {
    if (paramFragment.n && v(paramFragment))
      this.D = true; 
  }
  
  void i() {
    for (Fragment fragment : this.c.d()) {
      if (fragment != null)
        fragment.l0(); 
    } 
  }
  
  boolean i(Fragment paramFragment) {
    return (paramFragment == null) ? true : paramFragment.S();
  }
  
  void j() {
    c(5);
  }
  
  boolean j(Fragment paramFragment) {
    if (paramFragment == null)
      return true; 
    n n1 = paramFragment.u;
    return (paramFragment.equals(n1.z()) && j(n1.t));
  }
  
  void k() {
    Q();
    s(this.u);
  }
  
  void k(Fragment paramFragment) {
    if (!this.c.a(paramFragment.h)) {
      if (d(3)) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Ignoring moving ");
        stringBuilder.append(paramFragment);
        stringBuilder.append(" to state ");
        stringBuilder.append(this.q);
        stringBuilder.append("since it is not added to ");
        stringBuilder.append(this);
        Log.d("FragmentManager", stringBuilder.toString());
      } 
      return;
    } 
    l(paramFragment);
    View view = paramFragment.J;
    if (view != null && paramFragment.N && paramFragment.I != null) {
      float f = paramFragment.P;
      if (f > 0.0F)
        view.setAlpha(f); 
      paramFragment.P = 0.0F;
      paramFragment.N = false;
      f.d d1 = f.a(this.r.f(), paramFragment, true, paramFragment.A());
      if (d1 != null) {
        Animation animation = d1.a;
        if (animation != null) {
          paramFragment.J.startAnimation(animation);
        } else {
          d1.b.setTarget(paramFragment.J);
          d1.b.start();
        } 
      } 
    } 
    if (paramFragment.O)
      q(paramFragment); 
  }
  
  void l() {
    this.E = false;
    this.F = false;
    this.M.a(false);
    c(7);
  }
  
  void l(Fragment paramFragment) {
    a(paramFragment, this.q);
  }
  
  void m() {
    this.E = false;
    this.F = false;
    this.M.a(false);
    c(5);
  }
  
  void m(Fragment paramFragment) {
    if (d(2)) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("remove: ");
      stringBuilder.append(paramFragment);
      stringBuilder.append(" nesting=");
      stringBuilder.append(paramFragment.t);
      Log.v("FragmentManager", stringBuilder.toString());
    } 
    boolean bool = paramFragment.R();
    if (!paramFragment.C || (bool ^ true) != 0) {
      this.c.c(paramFragment);
      if (v(paramFragment))
        this.D = true; 
      paramFragment.o = true;
      w(paramFragment);
    } 
  }
  
  void n() {
    this.F = true;
    this.M.a(true);
    c(4);
  }
  
  void n(Fragment paramFragment) {
    if (paramFragment == null || (paramFragment.equals(b(paramFragment.h)) && (paramFragment.v == null || paramFragment.u == this))) {
      Fragment fragment = this.u;
      this.u = paramFragment;
      s(fragment);
      s(this.u);
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Fragment ");
    stringBuilder.append(paramFragment);
    stringBuilder.append(" is not an active fragment of FragmentManager ");
    stringBuilder.append(this);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  void o() {
    c(2);
  }
  
  void o(Fragment paramFragment) {
    if (d(2)) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("show: ");
      stringBuilder.append(paramFragment);
      Log.v("FragmentManager", stringBuilder.toString());
    } 
    if (paramFragment.B) {
      paramFragment.B = false;
      paramFragment.O ^= 0x1;
    } 
  }
  
  public boolean p() {
    boolean bool = c(true);
    N();
    return bool;
  }
  
  public int q() {
    ArrayList<a> arrayList = this.d;
    return (arrayList != null) ? arrayList.size() : 0;
  }
  
  g r() {
    return this.s;
  }
  
  public j s() {
    j j1 = this.v;
    if (j1 != null)
      return j1; 
    Fragment fragment = this.t;
    return (fragment != null) ? fragment.u.s() : this.w;
  }
  
  w t() {
    return this.c;
  }
  
  public String toString() {
    k<?> k1;
    StringBuilder stringBuilder = new StringBuilder(128);
    stringBuilder.append("FragmentManager{");
    stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    stringBuilder.append(" in ");
    Fragment fragment = this.t;
    if (fragment != null) {
      stringBuilder.append(fragment.getClass().getSimpleName());
      stringBuilder.append("{");
      fragment = this.t;
    } else {
      k1 = this.r;
      if (k1 != null) {
        stringBuilder.append(k1.getClass().getSimpleName());
        stringBuilder.append("{");
        k1 = this.r;
      } else {
        stringBuilder.append("null");
        stringBuilder.append("}}");
        return stringBuilder.toString();
      } 
    } 
    stringBuilder.append(Integer.toHexString(System.identityHashCode(k1)));
    stringBuilder.append("}");
    stringBuilder.append("}}");
    return stringBuilder.toString();
  }
  
  public List<Fragment> u() {
    return this.c.d();
  }
  
  k<?> v() {
    return this.r;
  }
  
  LayoutInflater.Factory2 w() {
    return this.f;
  }
  
  m x() {
    return this.o;
  }
  
  Fragment y() {
    return this.t;
  }
  
  public Fragment z() {
    return this.u;
  }
  
  class a implements androidx.activity.result.b<androidx.activity.result.a> {
    a(n this$0) {}
    
    public void a(androidx.activity.result.a param1a) {
      StringBuilder stringBuilder;
      n.n n1 = this.a.C.pollFirst();
      if (n1 == null) {
        stringBuilder = new StringBuilder();
        stringBuilder.append("No IntentSenders were started for ");
        stringBuilder.append(this);
        Log.w("FragmentManager", stringBuilder.toString());
        return;
      } 
      String str = n1.c;
      int i = n1.d;
      Fragment fragment = n.c(this.a).d(str);
      if (fragment == null) {
        stringBuilder = new StringBuilder();
        stringBuilder.append("Intent Sender result delivered for unknown Fragment ");
        stringBuilder.append(str);
        Log.w("FragmentManager", stringBuilder.toString());
        return;
      } 
      fragment.a(i, stringBuilder.f(), stringBuilder.e());
    }
  }
  
  class b implements androidx.activity.result.b<Map<String, Boolean>> {
    b(n this$0) {}
    
    @SuppressLint({"SyntheticAccessor"})
    public void a(Map<String, Boolean> param1Map) {
      StringBuilder stringBuilder;
      String[] arrayOfString = (String[])param1Map.keySet().toArray((Object[])new String[0]);
      ArrayList<Boolean> arrayList = new ArrayList(param1Map.values());
      int[] arrayOfInt = new int[arrayList.size()];
      int i;
      for (i = 0; i < arrayList.size(); i++) {
        byte b1;
        if (((Boolean)arrayList.get(i)).booleanValue()) {
          b1 = 0;
        } else {
          b1 = -1;
        } 
        arrayOfInt[i] = b1;
      } 
      n.n n1 = this.a.C.pollFirst();
      if (n1 == null) {
        stringBuilder = new StringBuilder();
        stringBuilder.append("No permissions were requested for ");
        stringBuilder.append(this);
      } else {
        String str = n1.c;
        i = n1.d;
        Fragment fragment = n.c(this.a).d(str);
        if (fragment == null) {
          stringBuilder = new StringBuilder();
          stringBuilder.append("Permission request result delivered for unknown Fragment ");
          stringBuilder.append(str);
        } else {
          fragment.a(i, arrayOfString, (int[])stringBuilder);
          return;
        } 
      } 
      Log.w("FragmentManager", stringBuilder.toString());
    }
  }
  
  class c extends androidx.activity.b {
    c(n this$0, boolean param1Boolean) {
      super(param1Boolean);
    }
    
    public void a() {
      this.c.B();
    }
  }
  
  class d implements y.g {
    d(n this$0) {}
    
    public void a(Fragment param1Fragment, b.g.j.a param1a) {
      if (!param1a.c())
        this.a.b(param1Fragment, param1a); 
    }
    
    public void b(Fragment param1Fragment, b.g.j.a param1a) {
      this.a.a(param1Fragment, param1a);
    }
  }
  
  class e extends j {
    e(n this$0) {}
    
    public Fragment a(ClassLoader param1ClassLoader, String param1String) {
      return this.b.v().a(this.b.v().f(), param1String, null);
    }
  }
  
  class f implements e0 {
    f(n this$0) {}
    
    public d0 a(ViewGroup param1ViewGroup) {
      return new c(param1ViewGroup);
    }
  }
  
  class g implements Runnable {
    g(n this$0) {}
    
    public void run() {
      this.c.c(true);
    }
  }
  
  class h extends AnimatorListenerAdapter {
    h(n this$0, ViewGroup param1ViewGroup, View param1View, Fragment param1Fragment) {}
    
    public void onAnimationEnd(Animator param1Animator) {
      this.a.endViewTransition(this.b);
      param1Animator.removeListener((Animator.AnimatorListener)this);
      Fragment fragment = this.c;
      View view = fragment.J;
      if (view != null && fragment.B)
        view.setVisibility(8); 
    }
  }
  
  class i implements r {
    i(n this$0, Fragment param1Fragment) {}
    
    public void a(n param1n, Fragment param1Fragment) {
      this.c.a(param1Fragment);
    }
  }
  
  class j implements androidx.activity.result.b<androidx.activity.result.a> {
    j(n this$0) {}
    
    public void a(androidx.activity.result.a param1a) {
      StringBuilder stringBuilder;
      n.n n1 = this.a.C.pollFirst();
      if (n1 == null) {
        stringBuilder = new StringBuilder();
        stringBuilder.append("No Activities were started for result for ");
        stringBuilder.append(this);
        Log.w("FragmentManager", stringBuilder.toString());
        return;
      } 
      String str = n1.c;
      int i = n1.d;
      Fragment fragment = n.c(this.a).d(str);
      if (fragment == null) {
        stringBuilder = new StringBuilder();
        stringBuilder.append("Activity result delivered for unknown Fragment ");
        stringBuilder.append(str);
        Log.w("FragmentManager", stringBuilder.toString());
        return;
      } 
      fragment.a(i, stringBuilder.f(), stringBuilder.e());
    }
  }
  
  public static interface k {}
  
  static class l extends androidx.activity.result.h.a<androidx.activity.result.g, androidx.activity.result.a> {
    public Intent a(Context param1Context, androidx.activity.result.g param1g) {
      Intent intent1 = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
      Intent intent2 = param1g.e();
      androidx.activity.result.g g1 = param1g;
      if (intent2 != null) {
        Bundle bundle = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        g1 = param1g;
        if (bundle != null) {
          intent1.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
          intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
          g1 = param1g;
          if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
            androidx.activity.result.g.b b = new androidx.activity.result.g.b(param1g.h());
            b.a(null);
            b.a(param1g.g(), param1g.f());
            g1 = b.a();
          } 
        } 
      } 
      intent1.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", (Parcelable)g1);
      if (n.d(2)) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CreateIntent created the following intent: ");
        stringBuilder.append(intent1);
        Log.v("FragmentManager", stringBuilder.toString());
      } 
      return intent1;
    }
    
    public androidx.activity.result.a a(int param1Int, Intent param1Intent) {
      return new androidx.activity.result.a(param1Int, param1Intent);
    }
  }
  
  public static abstract class m {
    public void a(n param1n, Fragment param1Fragment) {}
    
    public void a(n param1n, Fragment param1Fragment, Context param1Context) {}
    
    @Deprecated
    public void a(n param1n, Fragment param1Fragment, Bundle param1Bundle) {}
    
    public void a(n param1n, Fragment param1Fragment, View param1View, Bundle param1Bundle) {}
    
    public void b(n param1n, Fragment param1Fragment) {}
    
    public void b(n param1n, Fragment param1Fragment, Context param1Context) {}
    
    public void b(n param1n, Fragment param1Fragment, Bundle param1Bundle) {}
    
    public void c(n param1n, Fragment param1Fragment) {}
    
    public void c(n param1n, Fragment param1Fragment, Bundle param1Bundle) {}
    
    public abstract void d(n param1n, Fragment param1Fragment);
    
    public void d(n param1n, Fragment param1Fragment, Bundle param1Bundle) {}
    
    public void e(n param1n, Fragment param1Fragment) {}
    
    public void f(n param1n, Fragment param1Fragment) {}
    
    public void g(n param1n, Fragment param1Fragment) {}
  }
  
  @SuppressLint({"BanParcelableUsage"})
  static class n implements Parcelable {
    public static final Parcelable.Creator<n> CREATOR = new a();
    
    String c;
    
    int d;
    
    n(Parcel param1Parcel) {
      this.c = param1Parcel.readString();
      this.d = param1Parcel.readInt();
    }
    
    n(String param1String, int param1Int) {
      this.c = param1String;
      this.d = param1Int;
    }
    
    public int describeContents() {
      return 0;
    }
    
    public void writeToParcel(Parcel param1Parcel, int param1Int) {
      param1Parcel.writeString(this.c);
      param1Parcel.writeInt(this.d);
    }
    
    class a implements Parcelable.Creator<n> {
      public n.n createFromParcel(Parcel param2Parcel) {
        return new n.n(param2Parcel);
      }
      
      public n.n[] newArray(int param2Int) {
        return new n.n[param2Int];
      }
    }
  }
  
  class a implements Parcelable.Creator<n> {
    public n.n createFromParcel(Parcel param1Parcel) {
      return new n.n(param1Parcel);
    }
    
    public n.n[] newArray(int param1Int) {
      return new n.n[param1Int];
    }
  }
  
  public static interface o {
    void a();
  }
  
  static interface p {
    boolean a(ArrayList<a> param1ArrayList, ArrayList<Boolean> param1ArrayList1);
  }
  
  private class q implements p {
    final String a;
    
    final int b;
    
    final int c;
    
    q(n this$0, String param1String, int param1Int1, int param1Int2) {
      this.a = param1String;
      this.b = param1Int1;
      this.c = param1Int2;
    }
    
    public boolean a(ArrayList<a> param1ArrayList, ArrayList<Boolean> param1ArrayList1) {
      Fragment fragment = this.d.u;
      return (fragment != null && this.b < 0 && this.a == null && fragment.n().F()) ? false : this.d.a(param1ArrayList, param1ArrayList1, this.a, this.b, this.c);
    }
  }
  
  static class r implements Fragment.h {
    final boolean a;
    
    final a b;
    
    private int c;
    
    r(a param1a, boolean param1Boolean) {
      this.a = param1Boolean;
      this.b = param1a;
    }
    
    public void a() {
      this.c--;
      if (this.c != 0)
        return; 
      this.b.r.H();
    }
    
    public void b() {
      this.c++;
    }
    
    void c() {
      a a1 = this.b;
      a1.r.a(a1, this.a, false, false);
    }
    
    void d() {
      boolean bool;
      if (this.c > 0) {
        bool = true;
      } else {
        bool = false;
      } 
      for (Fragment fragment : this.b.r.u()) {
        fragment.a((Fragment.h)null);
        if (bool && fragment.T())
          fragment.v0(); 
      } 
      a a1 = this.b;
      a1.r.a(a1, this.a, bool ^ true, true);
    }
    
    public boolean e() {
      return (this.c == 0);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/fragment/app/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */