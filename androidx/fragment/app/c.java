package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.core.app.n;
import b.g.m.s;
import b.g.m.v;
import b.g.m.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

class c extends d0 {
  c(ViewGroup paramViewGroup) {
    super(paramViewGroup);
  }
  
  private Map<d0.e, Boolean> a(List<m> paramList, boolean paramBoolean, d0.e parame1, d0.e parame2) {
    StringBuilder stringBuilder;
    d0.e e1 = parame1;
    d0.e e2 = parame2;
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    Iterator<m> iterator1 = paramList.iterator();
    a0 a01 = null;
    while (iterator1.hasNext()) {
      m m1 = iterator1.next();
      if (m1.d())
        continue; 
      a0 a0 = m1.e();
      if (a01 == null) {
        a01 = a0;
        continue;
      } 
      if (a0 == null || a01 == a0)
        continue; 
      stringBuilder = new StringBuilder();
      stringBuilder.append("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
      stringBuilder.append(m1.b().d());
      stringBuilder.append(" returned Transition ");
      stringBuilder.append(m1.g());
      stringBuilder.append(" which uses a different Transition  type than other Fragments.");
      throw new IllegalArgumentException(stringBuilder.toString());
    } 
    if (a01 == null) {
      for (m m : stringBuilder) {
        hashMap.put(m.b(), Boolean.valueOf(false));
        m.a();
      } 
      return (Map)hashMap;
    } 
    View view = new View(d().getContext());
    Rect<String> rect = new Rect();
    ArrayList<View> arrayList1 = new ArrayList();
    ArrayList<View> arrayList2 = new ArrayList();
    b.d.a<String, String> a = new b.d.a();
    Iterator<m> iterator2 = stringBuilder.iterator();
    ArrayList<String> arrayList = null;
    a0 a03 = null;
    boolean bool = false;
    a0 a02 = a01;
    a01 = a03;
    while (true) {
      d0.e e3;
      d0.e e4;
      m m1;
      Object object3;
      boolean bool1 = paramBoolean;
      if (iterator2.hasNext()) {
        d0.e e5;
        m m2;
        m m3;
        d0.e e6;
        m m4 = iterator2.next();
        if (m4.h() && e1 != null && e2 != null) {
          Rect<String> rect1;
          n n1;
          n n2;
          Object object = a02.c(a02.b(m4.f()));
          ArrayList<String> arrayList6 = parame2.d().J();
          arrayList = m.d().J();
          ArrayList<String> arrayList7 = m.d().K();
          int i;
          for (i = 0; i < arrayList7.size(); i++) {
            int k = arrayList6.indexOf(arrayList7.get(i));
            if (k != -1)
              arrayList6.set(k, arrayList.get(i)); 
          } 
          ArrayList<String> arrayList8 = parame2.d().K();
          Fragment fragment = m.d();
          if (!bool1) {
            n2 = fragment.u();
            n1 = parame2.d().r();
          } else {
            n2 = n1.r();
            n1 = parame2.d().u();
          } 
          i = arrayList6.size();
          int j;
          for (j = 0; j < i; j++)
            a.put(arrayList6.get(j), arrayList8.get(j)); 
          b.d.a<String, View> a1 = new b.d.a();
          a((Map<String, View>)a1, (m.d()).J);
          a1.a(arrayList6);
          if (n2 != null) {
            n2.a(arrayList6, (Map)a1);
            for (i = arrayList6.size() - 1; i >= 0; i--) {
              String str = arrayList6.get(i);
              View view5 = (View)a1.get(str);
              if (view5 == null) {
                a.remove(str);
              } else if (!str.equals(v.x(view5))) {
                str = (String)a.remove(str);
                a.put(v.x(view5), str);
              } 
            } 
          } else {
            a.a(a1.keySet());
          } 
          object3 = new b.d.a();
          a((Map<String, View>)object3, (parame2.d()).J);
          object3.a(arrayList8);
          object3.a(a.values());
          if (n1 != null) {
            n1.a(arrayList8, (Map)object3);
            for (i = arrayList8.size() - 1; i >= 0; i--) {
              String str1;
              String str2 = arrayList8.get(i);
              View view5 = (View)object3.get(str2);
              if (view5 == null) {
                str1 = y.a(a, str2);
                if (str1 != null)
                  a.remove(str1); 
              } else if (!str2.equals(v.x((View)str1))) {
                str2 = y.a(a, str2);
                if (str2 != null)
                  a.put(str2, v.x((View)str1)); 
              } 
            } 
          } else {
            y.a(a, (b.d.a<String, View>)object3);
          } 
          a(a1, a.keySet());
          a((b.d.a<String, View>)object3, a.values());
          if (a.isEmpty()) {
            arrayList1.clear();
            arrayList2.clear();
            rect1 = rect;
            object3 = null;
            e5 = parame2;
            m3 = m;
          } else {
            y.a(parame2.d(), m.d(), bool1, a1, true);
            s.a((View)d(), new g(this, parame2, (d0.e)m, paramBoolean, (b.d.a)object3));
            Iterator<View> iterator4 = a1.values().iterator();
            while (iterator4.hasNext())
              a(arrayList1, iterator4.next()); 
            if (!rect1.isEmpty()) {
              object2 = a1.get(rect1.get(0));
              a02.c(object, (View)object2);
            } 
            Iterator<View> iterator3 = object3.values().iterator();
            while (iterator3.hasNext())
              a(arrayList2, iterator3.next()); 
            if (!arrayList8.isEmpty()) {
              View view5 = (View)object3.get(arrayList8.get(0));
              if (view5 != null) {
                s.a((View)d(), new h(this, a02, view5, (Rect)e5));
                bool = true;
              } 
            } 
            a02.b(object, view, arrayList1);
            e4 = e5;
            a02.a(object, null, null, null, null, object, arrayList2);
            m3 = m;
            HashMap<Object, Object> hashMap3 = hashMap;
            hashMap3.put(m3, Boolean.valueOf(true));
            e5 = parame2;
            hashMap3.put(e5, Boolean.valueOf(true));
            object3 = object;
          } 
        } else {
          m4 = m3;
          e6 = e4;
          e4 = e5;
          m2 = m4;
        } 
        View view4 = view;
        d0.e e7 = e4;
        e4 = e6;
        m1 = m2;
        e3 = e7;
        view1 = view4;
        continue;
      } 
      View view2 = view1;
      HashMap<Object, Object> hashMap1 = hashMap;
      ArrayList<View> arrayList4 = arrayList2;
      ArrayList<View> arrayList5 = new ArrayList();
      Iterator<m> iterator = stringBuilder.iterator();
      iterator2 = null;
      View view3 = null;
      View view1 = (View)object2;
      HashMap<Object, Object> hashMap2 = hashMap1;
      Object object2 = view3;
      Object object1 = iterator2;
      while (iterator.hasNext()) {
        boolean bool2;
        m m2 = iterator.next();
        if (m2.d()) {
          hashMap2.put(m2.b(), Boolean.valueOf(false));
          m2.a();
          continue;
        } 
        Object object = a02.b(m2.g());
        d0.e e5 = m2.b();
        if (object3 != null && (e5 == e4 || e5 == m1)) {
          bool2 = true;
        } else {
          bool2 = false;
        } 
        if (object == null) {
          if (!bool2) {
            hashMap2.put(e5, Boolean.valueOf(false));
            m2.a();
          } 
          continue;
        } 
        ArrayList<View> arrayList6 = new ArrayList();
        a(arrayList6, (e5.d()).J);
        if (bool2)
          if (e5 == e4) {
            arrayList6.removeAll(arrayList1);
          } else {
            arrayList6.removeAll(arrayList4);
          }  
        if (arrayList6.isEmpty()) {
          a02.a(object, view2);
        } else {
          a02.a(object, arrayList6);
          d0.e e6 = e5;
          a02.a(object, object, arrayList6, null, null, null, null);
          if (e6.c() == d0.e.c.e) {
            a02.a(object, (e6.d()).J, arrayList6);
            s.a((View)d(), new i(this, arrayList6));
          } 
        } 
        if (e5.c() == d0.e.c.d) {
          arrayList5.addAll(arrayList6);
          if (bool)
            a02.a(object, (Rect)e3); 
        } else {
          a02.c(object, view1);
        } 
        hashMap2.put(e5, Boolean.valueOf(true));
        if (m2.i()) {
          object2 = a02.b(object2, object, (Object)null);
          continue;
        } 
        object1 = a02.b(object1, object, (Object)null);
      } 
      object1 = a02.a(object2, object1, object3);
      for (m m2 : stringBuilder) {
        if (m2.d())
          continue; 
        Object object = m2.g();
        object2 = m2.b();
        if (object3 != null && (object2 == e4 || object2 == m1)) {
          bool = true;
        } else {
          bool = false;
        } 
        if (object != null || bool) {
          if (!v.I((View)d())) {
            if (n.d(2)) {
              object = new StringBuilder();
              object.append("SpecialEffectsController: Container ");
              object.append(d());
              object.append(" has not been laid out. Completing operation ");
              object.append(object2);
              Log.v("FragmentManager", object.toString());
            } 
            m2.a();
            continue;
          } 
          a02.a(m2.b().d(), object1, m2.c(), new j(this, m2));
        } 
      } 
      if (!v.I((View)d()))
        return (Map)hashMap2; 
      y.a(arrayList5, 4);
      ArrayList<String> arrayList3 = a02.a(arrayList4);
      a02.a(d(), object1);
      a02.a((View)d(), arrayList1, arrayList4, arrayList3, (Map<String, String>)a);
      y.a(arrayList5, 0);
      a02.b(object3, arrayList1, arrayList4);
      return (Map)hashMap2;
    } 
  }
  
  private void a(List<k> paramList, List<d0.e> paramList1, boolean paramBoolean, Map<d0.e, Boolean> paramMap) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual d : ()Landroid/view/ViewGroup;
    //   4: astore #7
    //   6: aload #7
    //   8: invokevirtual getContext : ()Landroid/content/Context;
    //   11: astore #8
    //   13: new java/util/ArrayList
    //   16: dup
    //   17: invokespecial <init> : ()V
    //   20: astore #9
    //   22: aload_1
    //   23: invokeinterface iterator : ()Ljava/util/Iterator;
    //   28: astore_1
    //   29: iconst_0
    //   30: istore #5
    //   32: aload_1
    //   33: invokeinterface hasNext : ()Z
    //   38: ifeq -> 309
    //   41: aload_1
    //   42: invokeinterface next : ()Ljava/lang/Object;
    //   47: checkcast androidx/fragment/app/c$k
    //   50: astore #10
    //   52: aload #10
    //   54: invokevirtual d : ()Z
    //   57: ifeq -> 68
    //   60: aload #10
    //   62: invokevirtual a : ()V
    //   65: goto -> 32
    //   68: aload #10
    //   70: aload #8
    //   72: invokevirtual a : (Landroid/content/Context;)Landroidx/fragment/app/f$d;
    //   75: astore #11
    //   77: aload #11
    //   79: ifnonnull -> 85
    //   82: goto -> 60
    //   85: aload #11
    //   87: getfield b : Landroid/animation/Animator;
    //   90: astore #11
    //   92: aload #11
    //   94: ifnonnull -> 108
    //   97: aload #9
    //   99: aload #10
    //   101: invokevirtual add : (Ljava/lang/Object;)Z
    //   104: pop
    //   105: goto -> 65
    //   108: aload #10
    //   110: invokevirtual b : ()Landroidx/fragment/app/d0$e;
    //   113: astore #12
    //   115: aload #12
    //   117: invokevirtual d : ()Landroidx/fragment/app/Fragment;
    //   120: astore #13
    //   122: getstatic java/lang/Boolean.TRUE : Ljava/lang/Boolean;
    //   125: aload #4
    //   127: aload #12
    //   129: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   134: invokevirtual equals : (Ljava/lang/Object;)Z
    //   137: ifeq -> 202
    //   140: iconst_2
    //   141: invokestatic d : (I)Z
    //   144: ifeq -> 194
    //   147: new java/lang/StringBuilder
    //   150: dup
    //   151: invokespecial <init> : ()V
    //   154: astore #11
    //   156: aload #11
    //   158: ldc_w 'Ignoring Animator set on '
    //   161: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   164: pop
    //   165: aload #11
    //   167: aload #13
    //   169: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   172: pop
    //   173: aload #11
    //   175: ldc_w ' as this Fragment was involved in a Transition.'
    //   178: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   181: pop
    //   182: ldc_w 'FragmentManager'
    //   185: aload #11
    //   187: invokevirtual toString : ()Ljava/lang/String;
    //   190: invokestatic v : (Ljava/lang/String;Ljava/lang/String;)I
    //   193: pop
    //   194: aload #10
    //   196: invokevirtual a : ()V
    //   199: goto -> 32
    //   202: aload #12
    //   204: invokevirtual c : ()Landroidx/fragment/app/d0$e$c;
    //   207: getstatic androidx/fragment/app/d0$e$c.e : Landroidx/fragment/app/d0$e$c;
    //   210: if_acmpne -> 219
    //   213: iconst_1
    //   214: istore #6
    //   216: goto -> 222
    //   219: iconst_0
    //   220: istore #6
    //   222: iload #6
    //   224: ifeq -> 236
    //   227: aload_2
    //   228: aload #12
    //   230: invokeinterface remove : (Ljava/lang/Object;)Z
    //   235: pop
    //   236: aload #13
    //   238: getfield J : Landroid/view/View;
    //   241: astore #13
    //   243: aload #7
    //   245: aload #13
    //   247: invokevirtual startViewTransition : (Landroid/view/View;)V
    //   250: aload #11
    //   252: new androidx/fragment/app/c$c
    //   255: dup
    //   256: aload_0
    //   257: aload #7
    //   259: aload #13
    //   261: iload #6
    //   263: aload #12
    //   265: aload #10
    //   267: invokespecial <init> : (Landroidx/fragment/app/c;Landroid/view/ViewGroup;Landroid/view/View;ZLandroidx/fragment/app/d0$e;Landroidx/fragment/app/c$k;)V
    //   270: invokevirtual addListener : (Landroid/animation/Animator$AnimatorListener;)V
    //   273: aload #11
    //   275: aload #13
    //   277: invokevirtual setTarget : (Ljava/lang/Object;)V
    //   280: aload #11
    //   282: invokevirtual start : ()V
    //   285: aload #10
    //   287: invokevirtual c : ()Lb/g/j/a;
    //   290: new androidx/fragment/app/c$d
    //   293: dup
    //   294: aload_0
    //   295: aload #11
    //   297: invokespecial <init> : (Landroidx/fragment/app/c;Landroid/animation/Animator;)V
    //   300: invokevirtual a : (Lb/g/j/a$a;)V
    //   303: iconst_1
    //   304: istore #5
    //   306: goto -> 32
    //   309: aload #9
    //   311: invokevirtual iterator : ()Ljava/util/Iterator;
    //   314: astore #4
    //   316: aload #4
    //   318: invokeinterface hasNext : ()Z
    //   323: ifeq -> 584
    //   326: aload #4
    //   328: invokeinterface next : ()Ljava/lang/Object;
    //   333: checkcast androidx/fragment/app/c$k
    //   336: astore #9
    //   338: aload #9
    //   340: invokevirtual b : ()Landroidx/fragment/app/d0$e;
    //   343: astore_1
    //   344: aload_1
    //   345: invokevirtual d : ()Landroidx/fragment/app/Fragment;
    //   348: astore_2
    //   349: iload_3
    //   350: ifeq -> 411
    //   353: iconst_2
    //   354: invokestatic d : (I)Z
    //   357: ifeq -> 403
    //   360: new java/lang/StringBuilder
    //   363: dup
    //   364: invokespecial <init> : ()V
    //   367: astore_1
    //   368: aload_1
    //   369: ldc_w 'Ignoring Animation set on '
    //   372: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   375: pop
    //   376: aload_1
    //   377: aload_2
    //   378: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   381: pop
    //   382: ldc_w ' as Animations cannot run alongside Transitions.'
    //   385: astore_2
    //   386: aload_1
    //   387: aload_2
    //   388: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   391: pop
    //   392: ldc_w 'FragmentManager'
    //   395: aload_1
    //   396: invokevirtual toString : ()Ljava/lang/String;
    //   399: invokestatic v : (Ljava/lang/String;Ljava/lang/String;)I
    //   402: pop
    //   403: aload #9
    //   405: invokevirtual a : ()V
    //   408: goto -> 316
    //   411: iload #5
    //   413: ifeq -> 452
    //   416: iconst_2
    //   417: invokestatic d : (I)Z
    //   420: ifeq -> 403
    //   423: new java/lang/StringBuilder
    //   426: dup
    //   427: invokespecial <init> : ()V
    //   430: astore_1
    //   431: aload_1
    //   432: ldc_w 'Ignoring Animation set on '
    //   435: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   438: pop
    //   439: aload_1
    //   440: aload_2
    //   441: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   444: pop
    //   445: ldc_w ' as Animations cannot run alongside Animators.'
    //   448: astore_2
    //   449: goto -> 386
    //   452: aload_2
    //   453: getfield J : Landroid/view/View;
    //   456: astore_2
    //   457: aload #9
    //   459: aload #8
    //   461: invokevirtual a : (Landroid/content/Context;)Landroidx/fragment/app/f$d;
    //   464: astore #10
    //   466: aload #10
    //   468: invokestatic a : (Ljava/lang/Object;)Ljava/lang/Object;
    //   471: pop
    //   472: aload #10
    //   474: checkcast androidx/fragment/app/f$d
    //   477: getfield a : Landroid/view/animation/Animation;
    //   480: astore #10
    //   482: aload #10
    //   484: invokestatic a : (Ljava/lang/Object;)Ljava/lang/Object;
    //   487: pop
    //   488: aload #10
    //   490: checkcast android/view/animation/Animation
    //   493: astore #10
    //   495: aload_1
    //   496: invokevirtual c : ()Landroidx/fragment/app/d0$e$c;
    //   499: getstatic androidx/fragment/app/d0$e$c.c : Landroidx/fragment/app/d0$e$c;
    //   502: if_acmpeq -> 519
    //   505: aload_2
    //   506: aload #10
    //   508: invokevirtual startAnimation : (Landroid/view/animation/Animation;)V
    //   511: aload #9
    //   513: invokevirtual a : ()V
    //   516: goto -> 560
    //   519: aload #7
    //   521: aload_2
    //   522: invokevirtual startViewTransition : (Landroid/view/View;)V
    //   525: new androidx/fragment/app/f$e
    //   528: dup
    //   529: aload #10
    //   531: aload #7
    //   533: aload_2
    //   534: invokespecial <init> : (Landroid/view/animation/Animation;Landroid/view/ViewGroup;Landroid/view/View;)V
    //   537: astore_1
    //   538: aload_1
    //   539: new androidx/fragment/app/c$e
    //   542: dup
    //   543: aload_0
    //   544: aload #7
    //   546: aload_2
    //   547: aload #9
    //   549: invokespecial <init> : (Landroidx/fragment/app/c;Landroid/view/ViewGroup;Landroid/view/View;Landroidx/fragment/app/c$k;)V
    //   552: invokevirtual setAnimationListener : (Landroid/view/animation/Animation$AnimationListener;)V
    //   555: aload_2
    //   556: aload_1
    //   557: invokevirtual startAnimation : (Landroid/view/animation/Animation;)V
    //   560: aload #9
    //   562: invokevirtual c : ()Lb/g/j/a;
    //   565: new androidx/fragment/app/c$f
    //   568: dup
    //   569: aload_0
    //   570: aload_2
    //   571: aload #7
    //   573: aload #9
    //   575: invokespecial <init> : (Landroidx/fragment/app/c;Landroid/view/View;Landroid/view/ViewGroup;Landroidx/fragment/app/c$k;)V
    //   578: invokevirtual a : (Lb/g/j/a$a;)V
    //   581: goto -> 316
    //   584: return
  }
  
  void a(d0.e parame) {
    View view = (parame.d()).J;
    parame.c().a(view);
  }
  
  void a(b.d.a<String, View> parama, Collection<String> paramCollection) {
    Iterator<Map.Entry> iterator = parama.entrySet().iterator();
    while (iterator.hasNext()) {
      if (!paramCollection.contains(v.x((View)((Map.Entry)iterator.next()).getValue())))
        iterator.remove(); 
    } 
  }
  
  void a(ArrayList<View> paramArrayList, View paramView) {
    ViewGroup viewGroup;
    if (paramView instanceof ViewGroup) {
      viewGroup = (ViewGroup)paramView;
      if (x.a(viewGroup)) {
        paramArrayList.add(viewGroup);
        return;
      } 
      int j = viewGroup.getChildCount();
      for (int i = 0; i < j; i++) {
        View view = viewGroup.getChildAt(i);
        if (view.getVisibility() == 0)
          a(paramArrayList, view); 
      } 
    } else if (!paramArrayList.contains(viewGroup)) {
      paramArrayList.add(viewGroup);
      return;
    } 
  }
  
  void a(List<d0.e> paramList, boolean paramBoolean) {
    Iterator<d0.e> iterator2 = paramList.iterator();
    d0.e e2 = null;
    d0.e e1 = null;
    while (iterator2.hasNext()) {
      d0.e e = iterator2.next();
      d0.e.c c1 = d0.e.c.b((e.d()).J);
      int i = a.a[e.c().ordinal()];
      if (i != 1 && i != 2 && i != 3) {
        if (i == 4 && c1 != d0.e.c.d)
          e1 = e; 
        continue;
      } 
      if (c1 == d0.e.c.d && e2 == null)
        e2 = e; 
    } 
    ArrayList<k> arrayList1 = new ArrayList();
    ArrayList<m> arrayList2 = new ArrayList();
    ArrayList<d0.e> arrayList = new ArrayList<d0.e>(paramList);
    for (d0.e e : paramList) {
      b.g.j.a a = new b.g.j.a();
      e.b(a);
      arrayList1.add(new k(e, a, paramBoolean));
      a = new b.g.j.a();
      e.b(a);
      boolean bool = false;
      if (paramBoolean ? (e == e2) : (e == e1))
        bool = true; 
      arrayList2.add(new m(e, a, paramBoolean, bool));
      e.a(new b(this, arrayList, e));
    } 
    Map<d0.e, Boolean> map = a(arrayList2, paramBoolean, e2, e1);
    a(arrayList1, arrayList, map.containsValue(Boolean.valueOf(true)), map);
    Iterator<d0.e> iterator1 = arrayList.iterator();
    while (iterator1.hasNext())
      a(iterator1.next()); 
    arrayList.clear();
  }
  
  void a(Map<String, View> paramMap, View paramView) {
    String str = v.x(paramView);
    if (str != null)
      paramMap.put(str, paramView); 
    if (paramView instanceof ViewGroup) {
      ViewGroup viewGroup = (ViewGroup)paramView;
      int j = viewGroup.getChildCount();
      for (int i = 0; i < j; i++) {
        View view = viewGroup.getChildAt(i);
        if (view.getVisibility() == 0)
          a(paramMap, view); 
      } 
    } 
  }
  
  class b implements Runnable {
    b(c this$0, List param1List, d0.e param1e) {}
    
    public void run() {
      if (this.c.contains(this.d)) {
        this.c.remove(this.d);
        this.e.a(this.d);
      } 
    }
  }
  
  class c extends AnimatorListenerAdapter {
    c(c this$0, ViewGroup param1ViewGroup, View param1View, boolean param1Boolean, d0.e param1e, c.k param1k) {}
    
    public void onAnimationEnd(Animator param1Animator) {
      this.a.endViewTransition(this.b);
      if (this.c)
        this.d.c().a(this.b); 
      this.e.a();
    }
  }
  
  class d implements b.g.j.a.a {
    d(c this$0, Animator param1Animator) {}
    
    public void a() {
      this.a.end();
    }
  }
  
  class e implements Animation.AnimationListener {
    e(c this$0, ViewGroup param1ViewGroup, View param1View, c.k param1k) {}
    
    public void onAnimationEnd(Animation param1Animation) {
      this.a.post(new a(this));
    }
    
    public void onAnimationRepeat(Animation param1Animation) {}
    
    public void onAnimationStart(Animation param1Animation) {}
    
    class a implements Runnable {
      a(c.e this$0) {}
      
      public void run() {
        c.e e1 = this.c;
        e1.a.endViewTransition(e1.b);
        this.c.c.a();
      }
    }
  }
  
  class a implements Runnable {
    a(c this$0) {}
    
    public void run() {
      c.e e1 = this.c;
      e1.a.endViewTransition(e1.b);
      this.c.c.a();
    }
  }
  
  class f implements b.g.j.a.a {
    f(c this$0, View param1View, ViewGroup param1ViewGroup, c.k param1k) {}
    
    public void a() {
      this.a.clearAnimation();
      this.b.endViewTransition(this.a);
      this.c.a();
    }
  }
  
  class g implements Runnable {
    g(c this$0, d0.e param1e1, d0.e param1e2, boolean param1Boolean, b.d.a param1a) {}
    
    public void run() {
      y.a(this.c.d(), this.d.d(), this.e, this.f, false);
    }
  }
  
  class h implements Runnable {
    h(c this$0, a0 param1a0, View param1View, Rect param1Rect) {}
    
    public void run() {
      this.c.a(this.d, this.e);
    }
  }
  
  class i implements Runnable {
    i(c this$0, ArrayList param1ArrayList) {}
    
    public void run() {
      y.a(this.c, 4);
    }
  }
  
  class j implements Runnable {
    j(c this$0, c.m param1m) {}
    
    public void run() {
      this.c.a();
    }
  }
  
  private static class k extends l {
    private boolean c;
    
    private boolean d = false;
    
    private f.d e;
    
    k(d0.e param1e, b.g.j.a param1a, boolean param1Boolean) {
      super(param1e, param1a);
      this.c = param1Boolean;
    }
    
    f.d a(Context param1Context) {
      boolean bool;
      if (this.d)
        return this.e; 
      Fragment fragment = b().d();
      if (b().c() == d0.e.c.d) {
        bool = true;
      } else {
        bool = false;
      } 
      this.e = f.a(param1Context, fragment, bool, this.c);
      this.d = true;
      return this.e;
    }
  }
  
  private static class l {
    private final d0.e a;
    
    private final b.g.j.a b;
    
    l(d0.e param1e, b.g.j.a param1a) {
      this.a = param1e;
      this.b = param1a;
    }
    
    void a() {
      this.a.a(this.b);
    }
    
    d0.e b() {
      return this.a;
    }
    
    b.g.j.a c() {
      return this.b;
    }
    
    boolean d() {
      d0.e.c c1 = d0.e.c.b((this.a.d()).J);
      d0.e.c c2 = this.a.c();
      if (c1 != c2) {
        d0.e.c c = d0.e.c.d;
        if (c1 == c || c2 == c)
          return false; 
      } 
      return true;
    }
  }
  
  private static class m extends l {
    private final Object c;
    
    private final boolean d;
    
    private final Object e;
    
    m(d0.e param1e, b.g.j.a param1a, boolean param1Boolean1, boolean param1Boolean2) {
      super(param1e, param1a);
      boolean bool;
      if (param1e.c() == d0.e.c.d) {
        Object object = param1e.d();
        if (param1Boolean1) {
          object = object.E();
        } else {
          object = object.q();
        } 
        this.c = object;
        object = param1e.d();
        if (param1Boolean1) {
          bool = object.j();
        } else {
          bool = object.i();
        } 
      } else {
        Object object = param1e.d();
        if (param1Boolean1) {
          object = object.G();
        } else {
          object = object.t();
        } 
        this.c = object;
        bool = true;
      } 
      this.d = bool;
      if (param1Boolean2) {
        Object object = param1e.d();
        if (param1Boolean1) {
          object = object.I();
        } else {
          object = object.H();
        } 
      } else {
        param1e = null;
      } 
      this.e = param1e;
    }
    
    private a0 a(Object param1Object) {
      if (param1Object == null)
        return null; 
      a0 a0 = y.b;
      if (a0 != null && a0.a(param1Object))
        return y.b; 
      a0 = y.c;
      if (a0 != null && a0.a(param1Object))
        return y.c; 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Transition ");
      stringBuilder.append(param1Object);
      stringBuilder.append(" for fragment ");
      stringBuilder.append(b().d());
      stringBuilder.append(" is not a valid framework Transition or AndroidX Transition");
      throw new IllegalArgumentException(stringBuilder.toString());
    }
    
    a0 e() {
      a0 a01 = a(this.c);
      a0 a02 = a(this.e);
      if (a01 == null || a02 == null || a01 == a02)
        return (a01 != null) ? a01 : a02; 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
      stringBuilder.append(b().d());
      stringBuilder.append(" returned Transition ");
      stringBuilder.append(this.c);
      stringBuilder.append(" which uses a different Transition  type than its shared element transition ");
      stringBuilder.append(this.e);
      throw new IllegalArgumentException(stringBuilder.toString());
    }
    
    public Object f() {
      return this.e;
    }
    
    Object g() {
      return this.c;
    }
    
    public boolean h() {
      return (this.e != null);
    }
    
    boolean i() {
      return this.d;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/fragment/app/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */