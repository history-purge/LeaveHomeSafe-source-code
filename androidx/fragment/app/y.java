package androidx.fragment.app;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.n;
import b.g.m.s;
import b.g.m.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

class y {
  private static final int[] a = new int[] { 
      0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 
      10 };
  
  static final a0 b;
  
  static final a0 c = a();
  
  static View a(b.d.a<String, View> parama, h paramh, Object<String> paramObject, boolean paramBoolean) {
    a a1 = paramh.c;
    if (paramObject != null && parama != null) {
      paramObject = (Object<String>)a1.n;
      if (paramObject != null && !paramObject.isEmpty()) {
        ArrayList<String> arrayList;
        if (paramBoolean) {
          arrayList = a1.n;
        } else {
          arrayList = ((x)arrayList).o;
        } 
        return (View)parama.get(arrayList.get(0));
      } 
    } 
    return null;
  }
  
  private static a0 a() {
    try {
      return Class.forName("b.r.h").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
    } catch (Exception exception) {
      return null;
    } 
  }
  
  private static a0 a(Fragment paramFragment1, Fragment paramFragment2) {
    ArrayList<Object> arrayList = new ArrayList();
    if (paramFragment1 != null) {
      Object object2 = paramFragment1.t();
      if (object2 != null)
        arrayList.add(object2); 
      object2 = paramFragment1.G();
      if (object2 != null)
        arrayList.add(object2); 
      Object object1 = paramFragment1.I();
      if (object1 != null)
        arrayList.add(object1); 
    } 
    if (paramFragment2 != null) {
      Object object = paramFragment2.q();
      if (object != null)
        arrayList.add(object); 
      object = paramFragment2.E();
      if (object != null)
        arrayList.add(object); 
      object = paramFragment2.H();
      if (object != null)
        arrayList.add(object); 
    } 
    if (arrayList.isEmpty())
      return null; 
    a0 a01 = b;
    if (a01 != null && a(a01, arrayList))
      return b; 
    a01 = c;
    if (a01 != null && a(a01, arrayList))
      return c; 
    if (b == null && c == null)
      return null; 
    throw new IllegalArgumentException("Invalid Transition types");
  }
  
  private static h a(h paramh, SparseArray<h> paramSparseArray, int paramInt) {
    h h1 = paramh;
    if (paramh == null) {
      h1 = new h();
      paramSparseArray.put(paramInt, h1);
    } 
    return h1;
  }
  
  private static b.d.a<String, String> a(int paramInt1, ArrayList<a> paramArrayList, ArrayList<Boolean> paramArrayList1, int paramInt2, int paramInt3) {
    b.d.a<String, String> a = new b.d.a();
    while (--paramInt3 >= paramInt2) {
      a a1 = paramArrayList.get(paramInt3);
      if (a1.c(paramInt1)) {
        boolean bool = ((Boolean)paramArrayList1.get(paramInt3)).booleanValue();
        ArrayList<String> arrayList = a1.n;
        if (arrayList != null) {
          ArrayList<String> arrayList1;
          int j = arrayList.size();
          if (bool) {
            arrayList1 = a1.n;
            arrayList = a1.o;
          } else {
            arrayList = a1.n;
            arrayList1 = a1.o;
          } 
          int i;
          for (i = 0; i < j; i++) {
            String str1 = arrayList.get(i);
            String str2 = arrayList1.get(i);
            String str3 = (String)a.remove(str2);
            if (str3 != null) {
              a.put(str1, str3);
            } else {
              a.put(str1, str2);
            } 
          } 
        } 
      } 
      paramInt3--;
    } 
    return a;
  }
  
  static b.d.a<String, View> a(a0 parama0, b.d.a<String, String> parama, Object paramObject, h paramh) {
    ArrayList<String> arrayList;
    Fragment fragment = paramh.a;
    View view = fragment.M();
    if (parama.isEmpty() || paramObject == null || view == null) {
      parama.clear();
      return null;
    } 
    b.d.a<String, View> a2 = new b.d.a();
    parama0.a((Map<String, View>)a2, view);
    a a1 = paramh.c;
    if (paramh.b) {
      paramObject = fragment.u();
      arrayList = a1.n;
    } else {
      paramObject = fragment.r();
      arrayList = ((x)arrayList).o;
    } 
    if (arrayList != null) {
      a2.a(arrayList);
      a2.a(parama.values());
    } 
    if (paramObject != null) {
      paramObject.a(arrayList, (Map)a2);
      int i;
      for (i = arrayList.size() - 1; i >= 0; i--) {
        String str = arrayList.get(i);
        paramObject = a2.get(str);
        if (paramObject == null) {
          paramObject = a(parama, str);
          if (paramObject != null)
            parama.remove(paramObject); 
        } else if (!str.equals(v.x((View)paramObject))) {
          str = a(parama, str);
          if (str != null)
            parama.put(str, v.x((View)paramObject)); 
        } 
      } 
    } else {
      a(parama, a2);
    } 
    return a2;
  }
  
  private static Object a(a0 parama0, ViewGroup paramViewGroup, View paramView, b.d.a<String, String> parama, h paramh, ArrayList<View> paramArrayList1, ArrayList<View> paramArrayList2, Object paramObject1, Object paramObject2) {
    Fragment fragment1 = paramh.a;
    Fragment fragment2 = paramh.d;
    if (fragment1 != null) {
      Object object;
      if (fragment2 == null)
        return null; 
      boolean bool = paramh.b;
      if (parama.isEmpty()) {
        object = null;
      } else {
        object = a(parama0, fragment1, fragment2, bool);
      } 
      b.d.a<String, View> a1 = b(parama0, parama, object, paramh);
      if (parama.isEmpty()) {
        object = null;
      } else {
        paramArrayList1.addAll(a1.values());
      } 
      if (paramObject1 == null && paramObject2 == null && object == null)
        return null; 
      a(fragment1, fragment2, bool, a1, true);
      if (object != null) {
        Rect rect = new Rect();
        parama0.b(object, paramView, paramArrayList1);
        a(parama0, object, paramObject2, a1, paramh.e, paramh.f);
        paramObject2 = rect;
        if (paramObject1 != null) {
          parama0.a(paramObject1, rect);
          paramObject2 = rect;
        } 
      } else {
        paramObject2 = null;
      } 
      s.a((View)paramViewGroup, new f(parama0, parama, object, paramh, paramArrayList2, paramView, fragment1, fragment2, bool, paramArrayList1, paramObject1, (Rect)paramObject2));
      return object;
    } 
    return null;
  }
  
  private static Object a(a0 parama0, Fragment paramFragment1, Fragment paramFragment2, boolean paramBoolean) {
    Object object;
    if (paramFragment1 == null || paramFragment2 == null)
      return null; 
    if (paramBoolean) {
      object = paramFragment2.I();
    } else {
      object = object.H();
    } 
    return parama0.c(parama0.b(object));
  }
  
  private static Object a(a0 parama0, Fragment paramFragment, boolean paramBoolean) {
    Object object;
    if (paramFragment == null)
      return null; 
    if (paramBoolean) {
      object = paramFragment.E();
    } else {
      object = object.q();
    } 
    return parama0.b(object);
  }
  
  private static Object a(a0 parama0, Object paramObject1, Object paramObject2, Object paramObject3, Fragment paramFragment, boolean paramBoolean) {
    if (paramObject1 != null && paramObject2 != null && paramFragment != null) {
      if (paramBoolean) {
        paramBoolean = paramFragment.j();
      } else {
        paramBoolean = paramFragment.i();
      } 
    } else {
      paramBoolean = true;
    } 
    return paramBoolean ? parama0.b(paramObject2, paramObject1, paramObject3) : parama0.a(paramObject2, paramObject1, paramObject3);
  }
  
  static String a(b.d.a<String, String> parama, String paramString) {
    int j = parama.size();
    for (int i = 0; i < j; i++) {
      if (paramString.equals(parama.d(i)))
        return (String)parama.b(i); 
    } 
    return null;
  }
  
  static ArrayList<View> a(a0 parama0, Object paramObject, Fragment paramFragment, ArrayList<View> paramArrayList, View paramView) {
    if (paramObject != null) {
      ArrayList<View> arrayList2 = new ArrayList();
      View view = paramFragment.M();
      if (view != null)
        parama0.a(arrayList2, view); 
      if (paramArrayList != null)
        arrayList2.removeAll(paramArrayList); 
      ArrayList<View> arrayList1 = arrayList2;
      if (!arrayList2.isEmpty()) {
        arrayList2.add(paramView);
        parama0.a(paramObject, arrayList2);
        return arrayList2;
      } 
    } else {
      paramFragment = null;
    } 
    return (ArrayList<View>)paramFragment;
  }
  
  static void a(Context paramContext, g paramg, ArrayList<a> paramArrayList, ArrayList<Boolean> paramArrayList1, int paramInt1, int paramInt2, boolean paramBoolean, g paramg1) {
    SparseArray<h> sparseArray = new SparseArray();
    int i;
    for (i = paramInt1; i < paramInt2; i++) {
      a a = paramArrayList.get(i);
      if (((Boolean)paramArrayList1.get(i)).booleanValue()) {
        b(a, sparseArray, paramBoolean);
      } else {
        a(a, sparseArray, paramBoolean);
      } 
    } 
    if (sparseArray.size() != 0) {
      View view = new View(paramContext);
      int j = sparseArray.size();
      for (i = 0; i < j; i++) {
        int k = sparseArray.keyAt(i);
        b.d.a<String, String> a = a(k, paramArrayList, paramArrayList1, paramInt1, paramInt2);
        h h = (h)sparseArray.valueAt(i);
        if (paramg.c()) {
          ViewGroup viewGroup = (ViewGroup)paramg.a(k);
          if (viewGroup != null)
            if (paramBoolean) {
              b(viewGroup, h, view, a, paramg1);
            } else {
              a(viewGroup, h, view, a, paramg1);
            }  
        } 
      } 
    } 
  }
  
  private static void a(ViewGroup paramViewGroup, h paramh, View paramView, b.d.a<String, String> parama, g paramg) {
    Fragment fragment1 = paramh.a;
    Fragment fragment2 = paramh.d;
    a0 a01 = a(fragment2, fragment1);
    if (a01 == null)
      return; 
    boolean bool1 = paramh.b;
    boolean bool2 = paramh.e;
    Object object3 = a(a01, fragment1, bool1);
    Object object2 = b(a01, fragment2, bool2);
    ArrayList<View> arrayList3 = new ArrayList();
    ArrayList<View> arrayList1 = new ArrayList();
    Object object4 = a(a01, paramViewGroup, paramView, parama, paramh, arrayList3, arrayList1, object3, object2);
    if (object3 == null && object4 == null && object2 == null)
      return; 
    ArrayList<View> arrayList2 = a(a01, object2, fragment2, arrayList3, paramView);
    if (arrayList2 == null || arrayList2.isEmpty())
      object2 = null; 
    a01.a(object3, paramView);
    Object object1 = a(a01, object3, object2, object4, fragment1, paramh.b);
    if (fragment2 != null && arrayList2 != null && (arrayList2.size() > 0 || arrayList3.size() > 0)) {
      b.g.j.a a1 = new b.g.j.a();
      paramg.b(fragment2, a1);
      a01.a(fragment2, object1, a1, new c(paramg, fragment2, a1));
    } 
    if (object1 != null) {
      ArrayList<View> arrayList = new ArrayList();
      a01.a(object1, object3, arrayList, object2, arrayList2, object4, arrayList1);
      a(a01, paramViewGroup, fragment1, paramView, arrayList1, object3, arrayList, object2, arrayList2);
      a01.a((View)paramViewGroup, arrayList1, (Map<String, String>)parama);
      a01.a(paramViewGroup, object1);
      a01.a(paramViewGroup, arrayList1, (Map<String, String>)parama);
    } 
  }
  
  static void a(Fragment paramFragment1, Fragment paramFragment2, boolean paramBoolean1, b.d.a<String, View> parama, boolean paramBoolean2) {
    n n;
    if (paramBoolean1) {
      n = paramFragment2.r();
    } else {
      n = n.r();
    } 
    if (n != null) {
      int i;
      ArrayList<Object> arrayList1 = new ArrayList();
      ArrayList<Object> arrayList2 = new ArrayList();
      int j = 0;
      if (parama == null) {
        i = 0;
      } else {
        i = parama.size();
      } 
      while (j < i) {
        arrayList2.add(parama.b(j));
        arrayList1.add(parama.d(j));
        j++;
      } 
      if (paramBoolean2) {
        n.b(arrayList2, arrayList1, null);
        return;
      } 
      n.a(arrayList2, arrayList1, null);
    } 
  }
  
  private static void a(a0 parama0, ViewGroup paramViewGroup, Fragment paramFragment, View paramView, ArrayList<View> paramArrayList1, Object paramObject1, ArrayList<View> paramArrayList2, Object paramObject2, ArrayList<View> paramArrayList3) {
    s.a((View)paramViewGroup, new d(paramObject1, parama0, paramView, paramFragment, paramArrayList1, paramArrayList2, paramArrayList3, paramObject2));
  }
  
  private static void a(a0 parama0, Object paramObject, Fragment paramFragment, ArrayList<View> paramArrayList) {
    if (paramFragment != null && paramObject != null && paramFragment.n && paramFragment.B && paramFragment.O) {
      paramFragment.h(true);
      parama0.a(paramObject, paramFragment.M(), paramArrayList);
      s.a((View)paramFragment.I, new b(paramArrayList));
    } 
  }
  
  private static void a(a0 parama0, Object paramObject1, Object paramObject2, b.d.a<String, View> parama, boolean paramBoolean, a parama1) {
    ArrayList<String> arrayList = parama1.n;
    if (arrayList != null && !arrayList.isEmpty()) {
      ArrayList<String> arrayList1;
      if (paramBoolean) {
        arrayList1 = parama1.o;
      } else {
        arrayList1 = ((x)arrayList1).n;
      } 
      View view = (View)parama.get(arrayList1.get(0));
      parama0.c(paramObject1, view);
      if (paramObject2 != null)
        parama0.c(paramObject2, view); 
    } 
  }
  
  public static void a(a parama, SparseArray<h> paramSparseArray, boolean paramBoolean) {
    int j = parama.a.size();
    for (int i = 0; i < j; i++)
      a(parama, parama.a.get(i), paramSparseArray, false, paramBoolean); 
  }
  
  private static void a(a parama, x.a parama1, SparseArray<h> paramSparseArray, boolean paramBoolean1, boolean paramBoolean2) {
    // Byte code:
    //   0: aload_1
    //   1: getfield b : Landroidx/fragment/app/Fragment;
    //   4: astore #12
    //   6: aload #12
    //   8: ifnonnull -> 12
    //   11: return
    //   12: aload #12
    //   14: getfield z : I
    //   17: istore #8
    //   19: iload #8
    //   21: ifne -> 25
    //   24: return
    //   25: iload_3
    //   26: ifeq -> 42
    //   29: getstatic androidx/fragment/app/y.a : [I
    //   32: aload_1
    //   33: getfield a : I
    //   36: iaload
    //   37: istore #5
    //   39: goto -> 48
    //   42: aload_1
    //   43: getfield a : I
    //   46: istore #5
    //   48: iconst_0
    //   49: istore #9
    //   51: iconst_0
    //   52: istore #10
    //   54: iconst_1
    //   55: istore #6
    //   57: iload #5
    //   59: iconst_1
    //   60: if_icmpeq -> 289
    //   63: iload #5
    //   65: iconst_3
    //   66: if_icmpeq -> 204
    //   69: iload #5
    //   71: iconst_4
    //   72: if_icmpeq -> 153
    //   75: iload #5
    //   77: iconst_5
    //   78: if_icmpeq -> 111
    //   81: iload #5
    //   83: bipush #6
    //   85: if_icmpeq -> 204
    //   88: iload #5
    //   90: bipush #7
    //   92: if_icmpeq -> 289
    //   95: iconst_0
    //   96: istore #5
    //   98: iload #10
    //   100: istore #9
    //   102: iconst_0
    //   103: istore #7
    //   105: iconst_0
    //   106: istore #6
    //   108: goto -> 336
    //   111: iload #4
    //   113: ifeq -> 143
    //   116: aload #12
    //   118: getfield O : Z
    //   121: ifeq -> 326
    //   124: aload #12
    //   126: getfield B : Z
    //   129: ifne -> 326
    //   132: aload #12
    //   134: getfield n : Z
    //   137: ifeq -> 326
    //   140: goto -> 320
    //   143: aload #12
    //   145: getfield B : Z
    //   148: istore #9
    //   150: goto -> 329
    //   153: iload #4
    //   155: ifeq -> 185
    //   158: aload #12
    //   160: getfield O : Z
    //   163: ifeq -> 254
    //   166: aload #12
    //   168: getfield n : Z
    //   171: ifeq -> 254
    //   174: aload #12
    //   176: getfield B : Z
    //   179: ifeq -> 254
    //   182: goto -> 248
    //   185: aload #12
    //   187: getfield n : Z
    //   190: ifeq -> 254
    //   193: aload #12
    //   195: getfield B : Z
    //   198: ifne -> 254
    //   201: goto -> 182
    //   204: aload #12
    //   206: getfield n : Z
    //   209: istore #10
    //   211: iload #4
    //   213: ifeq -> 260
    //   216: iload #10
    //   218: ifne -> 254
    //   221: aload #12
    //   223: getfield J : Landroid/view/View;
    //   226: astore_1
    //   227: aload_1
    //   228: ifnull -> 254
    //   231: aload_1
    //   232: invokevirtual getVisibility : ()I
    //   235: ifne -> 254
    //   238: aload #12
    //   240: getfield P : F
    //   243: fconst_0
    //   244: fcmpl
    //   245: iflt -> 254
    //   248: iconst_1
    //   249: istore #5
    //   251: goto -> 276
    //   254: iconst_0
    //   255: istore #5
    //   257: goto -> 276
    //   260: iload #10
    //   262: ifeq -> 254
    //   265: aload #12
    //   267: getfield B : Z
    //   270: ifne -> 254
    //   273: goto -> 248
    //   276: iload #5
    //   278: istore #6
    //   280: iconst_1
    //   281: istore #7
    //   283: iconst_0
    //   284: istore #5
    //   286: goto -> 336
    //   289: iload #4
    //   291: ifeq -> 304
    //   294: aload #12
    //   296: getfield N : Z
    //   299: istore #9
    //   301: goto -> 329
    //   304: aload #12
    //   306: getfield n : Z
    //   309: ifne -> 326
    //   312: aload #12
    //   314: getfield B : Z
    //   317: ifne -> 326
    //   320: iconst_1
    //   321: istore #9
    //   323: goto -> 329
    //   326: iconst_0
    //   327: istore #9
    //   329: iload #6
    //   331: istore #5
    //   333: goto -> 102
    //   336: aload_2
    //   337: iload #8
    //   339: invokevirtual get : (I)Ljava/lang/Object;
    //   342: checkcast androidx/fragment/app/y$h
    //   345: astore #11
    //   347: aload #11
    //   349: astore_1
    //   350: iload #9
    //   352: ifeq -> 380
    //   355: aload #11
    //   357: aload_2
    //   358: iload #8
    //   360: invokestatic a : (Landroidx/fragment/app/y$h;Landroid/util/SparseArray;I)Landroidx/fragment/app/y$h;
    //   363: astore_1
    //   364: aload_1
    //   365: aload #12
    //   367: putfield a : Landroidx/fragment/app/Fragment;
    //   370: aload_1
    //   371: iload_3
    //   372: putfield b : Z
    //   375: aload_1
    //   376: aload_0
    //   377: putfield c : Landroidx/fragment/app/a;
    //   380: iload #4
    //   382: ifne -> 447
    //   385: iload #5
    //   387: ifeq -> 447
    //   390: aload_1
    //   391: ifnull -> 408
    //   394: aload_1
    //   395: getfield d : Landroidx/fragment/app/Fragment;
    //   398: aload #12
    //   400: if_acmpne -> 408
    //   403: aload_1
    //   404: aconst_null
    //   405: putfield d : Landroidx/fragment/app/Fragment;
    //   408: aload_0
    //   409: getfield p : Z
    //   412: ifne -> 447
    //   415: aload_0
    //   416: getfield r : Landroidx/fragment/app/n;
    //   419: astore #11
    //   421: aload #11
    //   423: aload #12
    //   425: invokevirtual c : (Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/v;
    //   428: astore #13
    //   430: aload #11
    //   432: invokevirtual t : ()Landroidx/fragment/app/w;
    //   435: aload #13
    //   437: invokevirtual a : (Landroidx/fragment/app/v;)V
    //   440: aload #11
    //   442: aload #12
    //   444: invokevirtual l : (Landroidx/fragment/app/Fragment;)V
    //   447: aload_1
    //   448: astore #11
    //   450: iload #6
    //   452: ifeq -> 497
    //   455: aload_1
    //   456: ifnull -> 469
    //   459: aload_1
    //   460: astore #11
    //   462: aload_1
    //   463: getfield d : Landroidx/fragment/app/Fragment;
    //   466: ifnonnull -> 497
    //   469: aload_1
    //   470: aload_2
    //   471: iload #8
    //   473: invokestatic a : (Landroidx/fragment/app/y$h;Landroid/util/SparseArray;I)Landroidx/fragment/app/y$h;
    //   476: astore #11
    //   478: aload #11
    //   480: aload #12
    //   482: putfield d : Landroidx/fragment/app/Fragment;
    //   485: aload #11
    //   487: iload_3
    //   488: putfield e : Z
    //   491: aload #11
    //   493: aload_0
    //   494: putfield f : Landroidx/fragment/app/a;
    //   497: iload #4
    //   499: ifne -> 528
    //   502: iload #7
    //   504: ifeq -> 528
    //   507: aload #11
    //   509: ifnull -> 528
    //   512: aload #11
    //   514: getfield a : Landroidx/fragment/app/Fragment;
    //   517: aload #12
    //   519: if_acmpne -> 528
    //   522: aload #11
    //   524: aconst_null
    //   525: putfield a : Landroidx/fragment/app/Fragment;
    //   528: return
  }
  
  static void a(b.d.a<String, String> parama, b.d.a<String, View> parama1) {
    for (int i = parama.size() - 1; i >= 0; i--) {
      if (!parama1.containsKey(parama.d(i)))
        parama.c(i); 
    } 
  }
  
  static void a(ArrayList<View> paramArrayList, int paramInt) {
    if (paramArrayList == null)
      return; 
    for (int i = paramArrayList.size() - 1; i >= 0; i--)
      ((View)paramArrayList.get(i)).setVisibility(paramInt); 
  }
  
  private static void a(ArrayList<View> paramArrayList, b.d.a<String, View> parama, Collection<String> paramCollection) {
    for (int i = parama.size() - 1; i >= 0; i--) {
      View view = (View)parama.d(i);
      if (paramCollection.contains(v.x(view)))
        paramArrayList.add(view); 
    } 
  }
  
  private static boolean a(a0 parama0, List<Object> paramList) {
    int j = paramList.size();
    for (int i = 0; i < j; i++) {
      if (!parama0.a(paramList.get(i)))
        return false; 
    } 
    return true;
  }
  
  private static b.d.a<String, View> b(a0 parama0, b.d.a<String, String> parama, Object paramObject, h paramh) {
    ArrayList<String> arrayList;
    if (parama.isEmpty() || paramObject == null) {
      parama.clear();
      return null;
    } 
    paramObject = paramh.d;
    b.d.a<String, View> a2 = new b.d.a();
    parama0.a((Map<String, View>)a2, paramObject.u0());
    a a1 = paramh.f;
    if (paramh.e) {
      paramObject = paramObject.r();
      arrayList = a1.o;
    } else {
      paramObject = paramObject.u();
      arrayList = ((x)arrayList).n;
    } 
    if (arrayList != null)
      a2.a(arrayList); 
    if (paramObject != null) {
      paramObject.a(arrayList, (Map)a2);
      int i;
      for (i = arrayList.size() - 1; i >= 0; i--) {
        String str = arrayList.get(i);
        paramObject = a2.get(str);
        if (paramObject == null) {
          parama.remove(str);
        } else if (!str.equals(v.x((View)paramObject))) {
          str = (String)parama.remove(str);
          parama.put(v.x((View)paramObject), str);
        } 
      } 
    } else {
      parama.a(a2.keySet());
    } 
    return a2;
  }
  
  private static Object b(a0 parama0, ViewGroup paramViewGroup, View paramView, b.d.a<String, String> parama, h paramh, ArrayList<View> paramArrayList1, ArrayList<View> paramArrayList2, Object paramObject1, Object paramObject2) {
    Fragment fragment1 = paramh.a;
    Fragment fragment2 = paramh.d;
    if (fragment1 != null)
      fragment1.u0().setVisibility(0); 
    if (fragment1 != null) {
      Object object1;
      View view1;
      View view2;
      Object object2;
      if (fragment2 == null)
        return null; 
      boolean bool = paramh.b;
      if (parama.isEmpty()) {
        object2 = null;
      } else {
        object2 = a(parama0, fragment1, fragment2, bool);
      } 
      b.d.a<String, View> a2 = b(parama0, parama, object2, paramh);
      b.d.a<String, View> a1 = a(parama0, parama, object2, paramh);
      if (parama.isEmpty()) {
        if (a2 != null)
          a2.clear(); 
        if (a1 != null)
          a1.clear(); 
        parama = null;
      } else {
        a(paramArrayList1, a2, parama.keySet());
        a(paramArrayList2, a1, parama.values());
        object1 = object2;
      } 
      if (paramObject1 == null && paramObject2 == null && object1 == null)
        return null; 
      a(fragment1, fragment2, bool, a2, true);
      if (object1 != null) {
        paramArrayList2.add(paramView);
        parama0.b(object1, paramView, paramArrayList1);
        a(parama0, object1, paramObject2, a2, paramh.e, paramh.f);
        Rect rect1 = new Rect();
        view1 = a(a1, paramh, paramObject1, bool);
        if (view1 != null)
          parama0.a(paramObject1, rect1); 
        Rect rect2 = rect1;
      } else {
        paramView = null;
        view2 = paramView;
        view1 = paramView;
      } 
      s.a((View)paramViewGroup, new e(fragment1, fragment2, bool, a1, view1, parama0, (Rect)view2));
      return object1;
    } 
    return null;
  }
  
  private static Object b(a0 parama0, Fragment paramFragment, boolean paramBoolean) {
    Object object;
    if (paramFragment == null)
      return null; 
    if (paramBoolean) {
      object = paramFragment.G();
    } else {
      object = object.t();
    } 
    return parama0.b(object);
  }
  
  private static void b(ViewGroup paramViewGroup, h paramh, View paramView, b.d.a<String, String> parama, g paramg) {
    Fragment fragment2 = paramh.a;
    Fragment fragment1 = paramh.d;
    a0 a01 = a(fragment1, fragment2);
    if (a01 == null)
      return; 
    boolean bool1 = paramh.b;
    boolean bool2 = paramh.e;
    ArrayList<View> arrayList2 = new ArrayList();
    ArrayList<View> arrayList3 = new ArrayList();
    Object object3 = a(a01, fragment2, bool1);
    Object<View> object2 = (Object<View>)b(a01, fragment1, bool2);
    Object object4 = b(a01, paramViewGroup, paramView, parama, paramh, arrayList3, arrayList2, object3, object2);
    if (object3 == null && object4 == null && object2 == null)
      return; 
    Object<View> object1 = object2;
    object2 = (Object<View>)a(a01, object1, fragment1, arrayList3, paramView);
    ArrayList<View> arrayList1 = a(a01, object3, fragment2, arrayList2, paramView);
    a(arrayList1, 4);
    Object object5 = a(a01, object3, object1, object4, fragment2, bool1);
    if (fragment1 != null && object2 != null && (object2.size() > 0 || arrayList3.size() > 0)) {
      b.g.j.a a1 = new b.g.j.a();
      paramg.b(fragment1, a1);
      a01.a(fragment1, object5, a1, new a(paramg, fragment1, a1));
    } 
    if (object5 != null) {
      a(a01, object1, fragment1, (ArrayList<View>)object2);
      ArrayList<String> arrayList = a01.a(arrayList2);
      a01.a(object5, object3, arrayList1, object1, (ArrayList<View>)object2, object4, arrayList2);
      a01.a(paramViewGroup, object5);
      a01.a((View)paramViewGroup, arrayList3, arrayList2, arrayList, (Map<String, String>)parama);
      a(arrayList1, 0);
      a01.b(object4, arrayList3, arrayList2);
    } 
  }
  
  public static void b(a parama, SparseArray<h> paramSparseArray, boolean paramBoolean) {
    if (!parama.r.r().c())
      return; 
    for (int i = parama.a.size() - 1; i >= 0; i--)
      a(parama, parama.a.get(i), paramSparseArray, true, paramBoolean); 
  }
  
  static {
    a0 a01;
  }
  
  static {
    if (Build.VERSION.SDK_INT >= 21) {
      a01 = new z();
    } else {
      a01 = null;
    } 
    b = a01;
  }
  
  class a implements Runnable {
    a(y this$0, Fragment param1Fragment, b.g.j.a param1a) {}
    
    public void run() {
      this.c.a(this.d, this.e);
    }
  }
  
  class b implements Runnable {
    b(y this$0) {}
    
    public void run() {
      y.a(this.c, 4);
    }
  }
  
  class c implements Runnable {
    c(y this$0, Fragment param1Fragment, b.g.j.a param1a) {}
    
    public void run() {
      this.c.a(this.d, this.e);
    }
  }
  
  class d implements Runnable {
    d(y this$0, a0 param1a0, View param1View, Fragment param1Fragment, ArrayList param1ArrayList1, ArrayList param1ArrayList2, ArrayList param1ArrayList3, Object param1Object1) {}
    
    public void run() {
      Object<View> object = (Object<View>)this.c;
      if (object != null) {
        this.d.b(object, this.e);
        object = (Object<View>)y.a(this.d, this.c, this.f, this.g, this.e);
        this.h.addAll((Collection<? extends View>)object);
      } 
      if (this.i != null) {
        if (this.j != null) {
          object = (Object<View>)new ArrayList();
          object.add(this.e);
          this.d.a(this.j, this.i, (ArrayList<View>)object);
        } 
        this.i.clear();
        this.i.add(this.e);
      } 
    }
  }
  
  class e implements Runnable {
    e(y this$0, Fragment param1Fragment1, boolean param1Boolean, b.d.a param1a, View param1View, a0 param1a0, Rect param1Rect) {}
    
    public void run() {
      y.a(this.c, this.d, this.e, this.f, false);
      View view = this.g;
      if (view != null)
        this.h.a(view, this.i); 
    }
  }
  
  class f implements Runnable {
    f(y this$0, b.d.a param1a, Object param1Object1, y.h param1h, ArrayList param1ArrayList1, View param1View, Fragment param1Fragment1, Fragment param1Fragment2, boolean param1Boolean, ArrayList param1ArrayList2, Object param1Object2, Rect param1Rect) {}
    
    public void run() {
      b.d.a<String, View> a1 = y.a(this.c, this.d, this.e, this.f);
      if (a1 != null) {
        this.g.addAll(a1.values());
        this.g.add(this.h);
      } 
      y.a(this.i, this.j, this.k, a1, false);
      Object object = this.e;
      if (object != null) {
        this.c.b(object, this.l, this.g);
        View view = y.a(a1, this.f, this.m, this.k);
        if (view != null)
          this.c.a(view, this.n); 
      } 
    }
  }
  
  static interface g {
    void a(Fragment param1Fragment, b.g.j.a param1a);
    
    void b(Fragment param1Fragment, b.g.j.a param1a);
  }
  
  static class h {
    public Fragment a;
    
    public boolean b;
    
    public a c;
    
    public Fragment d;
    
    public boolean e;
    
    public a f;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/fragment/app/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */