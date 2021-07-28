package net.time4j.e1.a0;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import net.time4j.a0;
import net.time4j.d1.b0;
import net.time4j.d1.f0;
import net.time4j.d1.j;
import net.time4j.d1.l;
import net.time4j.d1.m;
import net.time4j.d1.n;
import net.time4j.d1.o;
import net.time4j.d1.o0;
import net.time4j.d1.p;
import net.time4j.d1.q;
import net.time4j.d1.s;
import net.time4j.d1.t;
import net.time4j.d1.u;
import net.time4j.d1.x;
import net.time4j.d1.y;
import net.time4j.e1.g;
import net.time4j.e1.s;
import net.time4j.e1.u;
import net.time4j.e1.w;
import net.time4j.f0;
import net.time4j.g0;
import net.time4j.h0;
import net.time4j.j0;
import net.time4j.k;
import net.time4j.r;
import net.time4j.tz.k;
import net.time4j.tz.l;
import net.time4j.tz.p;

public final class c<T> implements e<T>, d<T>, s<T> {
  private final x<T> a;
  
  private final e<?> b;
  
  private final b c;
  
  private final List<i> d;
  
  private final Map<p<?>, Object> e;
  
  private final j f;
  
  private final boolean g;
  
  private final boolean h;
  
  private final boolean i;
  
  private final int j;
  
  private final g k;
  
  private final boolean l;
  
  private final boolean m;
  
  private final boolean n;
  
  private final x<?> o;
  
  private final int p;
  
  private final boolean q;
  
  static {
    i();
  }
  
  private c(x<T> paramx, x<?> paramx1, Locale paramLocale, List<i> paramList, Map<p<?>, Object> paramMap, net.time4j.e1.a parama, x<?> paramx2) {
    if (paramx != null) {
      if (!paramList.isEmpty()) {
        j j1;
        this.a = paramx;
        this.b = e.a(paramx1);
        this.o = paramx2;
        if (paramx1 == null) {
          paramx2 = paramx;
        } else {
          paramx2 = paramx1;
        } 
        this.c = b.a(paramx2, parama, paramLocale);
        this.k = this.c.<g>a(net.time4j.e1.a.f, g.d);
        this.e = Collections.unmodifiableMap(paramMap);
        paramLocale = null;
        Iterator<i> iterator = paramList.iterator();
        boolean bool2 = false;
        boolean bool3 = false;
        boolean bool = false;
        int i = 0;
        boolean bool1 = true;
        while (iterator.hasNext()) {
          j j2;
          i i1 = iterator.next();
          boolean bool4 = bool3;
          if (i1.e())
            bool4 = true; 
          Locale locale = paramLocale;
          if (paramLocale == null) {
            locale = paramLocale;
            if (i1.b() instanceof j)
              j2 = j.class.cast(i1.b()); 
          } 
          boolean bool5 = bool2;
          if (!bool2) {
            bool5 = bool2;
            if (i1.a() > 0)
              bool5 = true; 
          } 
          p<?> p = i1.b().b();
          bool2 = bool5;
          bool3 = bool4;
          j1 = j2;
          if (p != null) {
            int k = i + 1;
            boolean bool6 = bool1;
            if (bool1) {
              bool6 = bool1;
              if (!v.h(p))
                bool6 = false; 
            } 
            bool2 = bool5;
            bool3 = bool4;
            i = k;
            bool1 = bool6;
            j1 = j2;
            if (!bool) {
              bool = c(paramx, paramx1, p);
              bool2 = bool5;
              bool3 = bool4;
              i = k;
              bool1 = bool6;
              j1 = j2;
            } 
          } 
        } 
        this.f = j1;
        this.g = bool2;
        this.h = bool3;
        this.i = bool;
        this.j = i;
        this.l = bool1;
        this.m = ((Boolean)this.c.<Boolean>a(net.time4j.e1.a.r, Boolean.FALSE)).booleanValue();
        this.n = h();
        this.p = paramList.size();
        this.d = a(paramList);
        this.q = g();
        return;
      } 
      throw new IllegalStateException("No format processors defined.");
    } 
    NullPointerException nullPointerException = new NullPointerException("Missing chronology.");
    throw nullPointerException;
  }
  
  private c(c<T> paramc, Map<p<?>, Object> paramMap) {
    x<?> x1;
    e<?> e1 = paramc.b;
    if (e1 == null) {
      e1 = null;
    } else {
      x1 = e1.d();
    } 
    for (p<?> p : paramMap.keySet())
      b(paramc.a, x1, p); 
    this.a = paramc.a;
    this.b = paramc.b;
    this.o = paramc.o;
    this.c = paramc.c;
    this.k = paramc.k;
    this.f = paramc.f;
    this.g = paramc.g;
    this.h = paramc.h;
    this.i = paramc.i;
    this.j = paramc.j;
    this.m = paramc.m;
    HashMap<p<?>, Object> hashMap = new HashMap<p<?>, Object>(paramc.e);
    boolean bool = paramc.l;
    for (p<?> p : paramMap.keySet()) {
      Object object = paramMap.get(p);
      if (object == null) {
        hashMap.remove(p);
        continue;
      } 
      hashMap.put(p, object);
      if (bool && v.h(p)) {
        bool = true;
        continue;
      } 
      bool = false;
    } 
    this.e = Collections.unmodifiableMap(hashMap);
    this.l = bool;
    this.n = h();
    this.p = paramc.p;
    this.d = a(paramc.d);
    this.q = g();
  }
  
  private c(c<T> paramc, b paramb) {
    this(paramc, paramb, (net.time4j.history.d)null);
  }
  
  private c(c<T> paramc, b paramb, net.time4j.history.d paramd) {
    if (paramb != null) {
      this.a = paramc.a;
      this.b = paramc.b;
      this.o = paramc.o;
      this.c = paramb;
      this.k = this.c.<g>a(net.time4j.e1.a.f, g.d);
      this.e = Collections.unmodifiableMap(new q(paramc.e));
      this.f = paramc.f;
      this.g = paramc.g;
      this.h = paramc.h;
      if (paramc.i || paramd != null) {
        bool = true;
      } else {
        bool = false;
      } 
      this.i = bool;
      this.j = paramc.j;
      int k = paramc.d.size();
      ArrayList<i> arrayList = new ArrayList<i>(paramc.d);
      boolean bool = paramc.l;
      int i;
      for (i = 0; i < k; i++) {
        i i1 = arrayList.get(i);
        p<?> p = i1.b().b();
        x<T> x2 = this.a;
        x<T> x1 = x2;
        if (x2 == a0.y())
          x1 = x2.b(); 
        boolean bool1 = bool;
        if (p != null) {
          bool1 = bool;
          if (!x1.c(p)) {
            Iterator<s> iterator = x1.f().iterator();
            while (true) {
              bool1 = bool;
              if (iterator.hasNext()) {
                s s1 = iterator.next();
                if (s1.a(paramc.e(), paramc.c).contains(p)) {
                  iterator = s1.a(paramb.d(), paramb).iterator();
                  while (true) {
                    bool1 = bool;
                    if (iterator.hasNext()) {
                      p<?> p1 = (p)iterator.next();
                      if (p1.name().equals(p.name())) {
                        bool1 = bool;
                        if (p1 != p) {
                          arrayList.set(i, i1.a(p1));
                          bool1 = false;
                        } 
                        break;
                      } 
                      continue;
                    } 
                    break;
                  } 
                  break;
                } 
                continue;
              } 
              break;
            } 
          } 
        } 
        bool = bool1;
        if (paramd != null) {
          p<?> p1;
          x1 = null;
          if (p == f0.r) {
            u u = paramd.q();
          } else if (p == f0.u || p == f0.v) {
            u u = paramd.p();
          } else if (p == f0.w) {
            p1 = paramd.c();
          } else if (p == f0.y) {
            p1 = paramd.d();
          } 
          if (p1 != null)
            arrayList.set(i, i1.a(p1)); 
          bool = false;
        } 
      } 
      this.l = bool;
      this.m = ((Boolean)this.c.<Boolean>a(net.time4j.e1.a.r, Boolean.FALSE)).booleanValue();
      this.n = h();
      this.p = arrayList.size();
      this.d = a(arrayList);
      this.q = g();
      return;
    } 
    NullPointerException nullPointerException = new NullPointerException("Missing global format attributes.");
    throw nullPointerException;
  }
  
  private c(c<T> paramc, net.time4j.e1.a parama) {
    this(paramc, paramc.c.a(parama), (net.time4j.history.d)null);
  }
  
  private static <T> T a(q<?> paramq, T paramT, CharSequence paramCharSequence, s params) {
    StringBuilder stringBuilder;
    if (paramT instanceof net.time4j.c1.f) {
      StringBuilder stringBuilder1;
      net.time4j.c1.f f = net.time4j.c1.f.class.cast(paramT);
      if (paramq.c(b0.c) && paramq.c(b0.d)) {
        k k1 = (k)paramq.e(b0.c);
        k k2 = (k)paramq.e(b0.d);
        if (!l.a(k1).b(f).equals(k2)) {
          int i = paramCharSequence.length();
          stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Ambivalent offset information: ");
          stringBuilder1.append(k1);
          stringBuilder1.append(" versus ");
          stringBuilder1.append(k2);
          params.a(i, stringBuilder1.toString());
          return null;
        } 
      } 
      if (stringBuilder1.c((p)b0.d)) {
        k k = stringBuilder1.c();
        try {
          boolean bool = l.a(k).c(f);
          if (bool != ((Boolean)stringBuilder1.e((p)b0.d)).booleanValue()) {
            stringBuilder1 = new StringBuilder(256);
            stringBuilder1.append("Conflict found: ");
            stringBuilder1.append("Parsed entity is ");
            if (!bool)
              stringBuilder1.append("not "); 
            stringBuilder1.append("daylight-saving, but timezone name");
            stringBuilder1.append(" has not the appropriate form in {");
            stringBuilder1.append(paramCharSequence.toString());
            stringBuilder1.append("}.");
            params.a(paramCharSequence.length(), stringBuilder1.toString());
            return null;
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          stringBuilder = new StringBuilder(256);
          stringBuilder.append("Unable to check timezone name: ");
          stringBuilder.append(illegalArgumentException.getMessage());
          params.a(paramCharSequence.length(), stringBuilder.toString());
          return null;
        } 
      } 
    } else if (stringBuilder instanceof o) {
      o o1;
      o o2 = (o)stringBuilder;
      if (stringBuilder instanceof h0 && ((h0)h0.class.cast(stringBuilder)).getHour() == 0 && (illegalArgumentException.a((p)g0.x) == 24 || (illegalArgumentException.c((p)g0.r) && ((g0)illegalArgumentException.e((p)g0.r)).getHour() == 24))) {
        o1 = (o)((h0)h0.class.cast(stringBuilder)).y().a(1L, net.time4j.f.j);
      } else {
        o1 = null;
      } 
      for (p p : illegalArgumentException.u()) {
        g0 g01;
        j0 j0 = g0.A;
        if (p == j0 && illegalArgumentException.a((p)j0) == 60)
          continue; 
        o o = o2;
        if (o1 != null)
          if (p.d()) {
            o = o1;
          } else {
            o = o2;
            if (p.s())
              g01 = g0.G(); 
          }  
        g0 g02 = g01;
        if (g01.c(p)) {
          Object object;
          boolean bool = true;
          if (p.getType() == Integer.class) {
            d(p);
            object = p;
            int i = illegalArgumentException.a((p)object);
            if (g01.a((p)object) != i) {
              Integer integer = Integer.valueOf(i);
              bool = false;
            } else {
              object = null;
            } 
          } else {
            object = illegalArgumentException.e(p);
            bool = g01.e(p).equals(object);
          } 
          g02 = g01;
          if (!bool) {
            StringBuilder stringBuilder1 = new StringBuilder(256);
            stringBuilder1.append("Conflict found: ");
            stringBuilder1.append("Text {");
            stringBuilder1.append(paramCharSequence.toString());
            stringBuilder1.append("} with element ");
            stringBuilder1.append(p.name());
            stringBuilder1.append(" {");
            stringBuilder1.append(object);
            stringBuilder1.append("}, but parsed entity ");
            stringBuilder1.append("has element value {");
            stringBuilder1.append(g01.e(p));
            stringBuilder1.append("}.");
            params.a(paramCharSequence.length(), stringBuilder1.toString());
            return null;
          } 
        } 
      } 
    } 
    return (T)stringBuilder;
  }
  
  private static <T> T a(c<?> paramc, u<T> paramu, List<s> paramList, CharSequence paramCharSequence, s params, net.time4j.d1.d paramd, g paramg, boolean paramBoolean1, boolean paramBoolean2) {
    // Byte code:
    //   0: aload_3
    //   1: invokeinterface length : ()I
    //   6: istore #11
    //   8: aload #4
    //   10: invokevirtual f : ()I
    //   13: iload #11
    //   15: if_icmpge -> 655
    //   18: aload_0
    //   19: getfield q : Z
    //   22: ifeq -> 112
    //   25: iload #7
    //   27: ifne -> 112
    //   30: new net/time4j/e1/a0/u
    //   33: dup
    //   34: invokespecial <init> : ()V
    //   37: astore #13
    //   39: aload_0
    //   40: getfield d : Ljava/util/List;
    //   43: iconst_0
    //   44: invokeinterface get : (I)Ljava/lang/Object;
    //   49: checkcast net/time4j/e1/a0/i
    //   52: aload_3
    //   53: aload #4
    //   55: aload #5
    //   57: aload #13
    //   59: iload #8
    //   61: invokevirtual a : (Ljava/lang/CharSequence;Lnet/time4j/e1/a0/s;Lnet/time4j/d1/d;Lnet/time4j/e1/a0/t;Z)V
    //   64: aload #4
    //   66: invokevirtual i : ()Z
    //   69: istore #8
    //   71: iload #8
    //   73: ifeq -> 78
    //   76: aconst_null
    //   77: areturn
    //   78: aload #13
    //   80: invokevirtual v : ()Ljava/lang/Object;
    //   83: astore #14
    //   85: aload #14
    //   87: ifnull -> 93
    //   90: aload #14
    //   92: areturn
    //   93: aload #4
    //   95: aload #13
    //   97: invokevirtual a : (Lnet/time4j/d1/q;)V
    //   100: goto -> 184
    //   103: astore #15
    //   105: aload #13
    //   107: astore #14
    //   109: goto -> 153
    //   112: aload_0
    //   113: aload_3
    //   114: aload #4
    //   116: aload #5
    //   118: iload #8
    //   120: aload_0
    //   121: getfield j : I
    //   124: invokespecial a : (Ljava/lang/CharSequence;Lnet/time4j/e1/a0/s;Lnet/time4j/d1/d;ZI)Lnet/time4j/d1/q;
    //   127: astore #14
    //   129: aload #4
    //   131: aload #14
    //   133: invokevirtual a : (Lnet/time4j/d1/q;)V
    //   136: aload #14
    //   138: astore #13
    //   140: goto -> 184
    //   143: astore #15
    //   145: goto -> 153
    //   148: astore #15
    //   150: aconst_null
    //   151: astore #14
    //   153: aload #14
    //   155: astore #13
    //   157: aload #4
    //   159: invokevirtual i : ()Z
    //   162: ifne -> 184
    //   165: aload #4
    //   167: aload #4
    //   169: invokevirtual f : ()I
    //   172: aload #15
    //   174: invokevirtual getMessage : ()Ljava/lang/String;
    //   177: invokevirtual a : (ILjava/lang/String;)V
    //   180: aload #14
    //   182: astore #13
    //   184: aload #13
    //   186: ifnull -> 653
    //   189: aload #4
    //   191: invokevirtual i : ()Z
    //   194: ifeq -> 199
    //   197: aconst_null
    //   198: areturn
    //   199: aload_0
    //   200: getfield e : Ljava/util/Map;
    //   203: invokeinterface isEmpty : ()Z
    //   208: ifne -> 391
    //   211: aload_0
    //   212: getfield e : Ljava/util/Map;
    //   215: invokeinterface keySet : ()Ljava/util/Set;
    //   220: invokeinterface iterator : ()Ljava/util/Iterator;
    //   225: astore #17
    //   227: aconst_null
    //   228: astore #15
    //   230: aload #17
    //   232: invokeinterface hasNext : ()Z
    //   237: ifeq -> 391
    //   240: aload #17
    //   242: invokeinterface next : ()Ljava/lang/Object;
    //   247: checkcast net/time4j/d1/p
    //   250: astore #18
    //   252: aload #13
    //   254: aload #18
    //   256: invokevirtual c : (Lnet/time4j/d1/p;)Z
    //   259: ifne -> 230
    //   262: aload #18
    //   264: invokeinterface a : ()C
    //   269: istore #12
    //   271: iconst_1
    //   272: istore #10
    //   274: aload #15
    //   276: astore #16
    //   278: iload #10
    //   280: istore #9
    //   282: iload #12
    //   284: ifeq -> 357
    //   287: aload #15
    //   289: astore #14
    //   291: aload #15
    //   293: ifnonnull -> 303
    //   296: aload #13
    //   298: invokevirtual u : ()Ljava/util/Set;
    //   301: astore #14
    //   303: aload #14
    //   305: invokeinterface iterator : ()Ljava/util/Iterator;
    //   310: astore #15
    //   312: aload #14
    //   314: astore #16
    //   316: iload #10
    //   318: istore #9
    //   320: aload #15
    //   322: invokeinterface hasNext : ()Z
    //   327: ifeq -> 357
    //   330: aload #15
    //   332: invokeinterface next : ()Ljava/lang/Object;
    //   337: checkcast net/time4j/d1/p
    //   340: invokeinterface a : ()C
    //   345: iload #12
    //   347: if_icmpne -> 312
    //   350: iconst_0
    //   351: istore #9
    //   353: aload #14
    //   355: astore #16
    //   357: aload #16
    //   359: astore #15
    //   361: iload #9
    //   363: ifeq -> 230
    //   366: aload #13
    //   368: aload #18
    //   370: aload_0
    //   371: getfield e : Ljava/util/Map;
    //   374: aload #18
    //   376: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   381: invokestatic a : (Lnet/time4j/d1/q;Lnet/time4j/d1/p;Ljava/lang/Object;)V
    //   384: aload #16
    //   386: astore #15
    //   388: goto -> 230
    //   391: aload #13
    //   393: astore #14
    //   395: aload_0
    //   396: getfield i : Z
    //   399: ifeq -> 506
    //   402: aload #13
    //   404: astore #15
    //   406: aload_2
    //   407: invokeinterface iterator : ()Ljava/util/Iterator;
    //   412: astore_2
    //   413: aload #13
    //   415: astore #15
    //   417: aload #13
    //   419: astore #14
    //   421: aload_2
    //   422: invokeinterface hasNext : ()Z
    //   427: ifeq -> 506
    //   430: aload #13
    //   432: astore #15
    //   434: aload_2
    //   435: invokeinterface next : ()Ljava/lang/Object;
    //   440: checkcast net/time4j/d1/s
    //   443: aload #13
    //   445: aload_0
    //   446: invokevirtual e : ()Ljava/util/Locale;
    //   449: aload #5
    //   451: invokeinterface a : (Lnet/time4j/d1/q;Ljava/util/Locale;Lnet/time4j/d1/d;)Lnet/time4j/d1/q;
    //   456: astore #13
    //   458: goto -> 413
    //   461: astore_0
    //   462: new java/lang/StringBuilder
    //   465: dup
    //   466: invokespecial <init> : ()V
    //   469: astore_1
    //   470: aload #15
    //   472: astore #14
    //   474: aload_1
    //   475: aload_0
    //   476: invokevirtual getMessage : ()Ljava/lang/String;
    //   479: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   482: pop
    //   483: aload_1
    //   484: aload #14
    //   486: invokestatic a : (Lnet/time4j/d1/q;)Ljava/lang/String;
    //   489: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   492: pop
    //   493: aload #4
    //   495: iload #11
    //   497: aload_1
    //   498: invokevirtual toString : ()Ljava/lang/String;
    //   501: invokevirtual a : (ILjava/lang/String;)V
    //   504: aconst_null
    //   505: areturn
    //   506: aload_1
    //   507: aload #14
    //   509: aload #5
    //   511: aload #6
    //   513: invokevirtual a : ()Z
    //   516: iload #7
    //   518: invokeinterface a : (Lnet/time4j/d1/q;Lnet/time4j/d1/d;ZZ)Ljava/lang/Object;
    //   523: astore_2
    //   524: aload_2
    //   525: astore_1
    //   526: aload_0
    //   527: getfield f : Lnet/time4j/e1/a0/j;
    //   530: ifnull -> 569
    //   533: aload_2
    //   534: astore_1
    //   535: aload_2
    //   536: instanceof net/time4j/d1/q
    //   539: ifeq -> 569
    //   542: ldc_w net/time4j/d1/q
    //   545: aload_2
    //   546: invokevirtual cast : (Ljava/lang/Object;)Ljava/lang/Object;
    //   549: checkcast net/time4j/d1/q
    //   552: astore_1
    //   553: aload_0
    //   554: getfield f : Lnet/time4j/e1/a0/j;
    //   557: aload_1
    //   558: aload #14
    //   560: invokevirtual a : (Lnet/time4j/d1/q;Lnet/time4j/d1/q;)Lnet/time4j/d1/q;
    //   563: astore_1
    //   564: aload_1
    //   565: invokestatic d : (Ljava/lang/Object;)Ljava/lang/Object;
    //   568: pop
    //   569: aload_1
    //   570: ifnonnull -> 619
    //   573: iload #7
    //   575: ifne -> 617
    //   578: new java/lang/StringBuilder
    //   581: dup
    //   582: invokespecial <init> : ()V
    //   585: astore_0
    //   586: aload_0
    //   587: aload #14
    //   589: invokestatic b : (Lnet/time4j/d1/q;)Ljava/lang/String;
    //   592: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   595: pop
    //   596: aload_0
    //   597: aload #14
    //   599: invokestatic a : (Lnet/time4j/d1/q;)Ljava/lang/String;
    //   602: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   605: pop
    //   606: aload #4
    //   608: iload #11
    //   610: aload_0
    //   611: invokevirtual toString : ()Ljava/lang/String;
    //   614: invokevirtual a : (ILjava/lang/String;)V
    //   617: aconst_null
    //   618: areturn
    //   619: aload_1
    //   620: astore_0
    //   621: aload #6
    //   623: invokevirtual c : ()Z
    //   626: ifeq -> 639
    //   629: aload #14
    //   631: aload_1
    //   632: aload_3
    //   633: aload #4
    //   635: invokestatic a : (Lnet/time4j/d1/q;Ljava/lang/Object;Ljava/lang/CharSequence;Lnet/time4j/e1/a0/s;)Ljava/lang/Object;
    //   638: astore_0
    //   639: aload_0
    //   640: areturn
    //   641: astore_0
    //   642: new java/lang/StringBuilder
    //   645: dup
    //   646: invokespecial <init> : ()V
    //   649: astore_1
    //   650: goto -> 474
    //   653: aconst_null
    //   654: areturn
    //   655: new java/lang/StringBuilder
    //   658: dup
    //   659: invokespecial <init> : ()V
    //   662: astore_0
    //   663: aload_0
    //   664: ldc_w '['
    //   667: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   670: pop
    //   671: aload_0
    //   672: aload #4
    //   674: invokevirtual f : ()I
    //   677: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   680: pop
    //   681: aload_0
    //   682: ldc_w ']: '
    //   685: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   688: pop
    //   689: aload_0
    //   690: aload_3
    //   691: invokeinterface toString : ()Ljava/lang/String;
    //   696: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   699: pop
    //   700: new java/lang/IndexOutOfBoundsException
    //   703: dup
    //   704: aload_0
    //   705: invokevirtual toString : ()Ljava/lang/String;
    //   708: invokespecial <init> : (Ljava/lang/String;)V
    //   711: astore_0
    //   712: goto -> 717
    //   715: aload_0
    //   716: athrow
    //   717: goto -> 715
    //   720: astore #14
    //   722: goto -> 93
    // Exception table:
    //   from	to	target	type
    //   18	25	148	net/time4j/e1/a0/a
    //   30	71	148	net/time4j/e1/a0/a
    //   78	85	720	java/lang/ClassCastException
    //   78	85	148	net/time4j/e1/a0/a
    //   93	100	103	net/time4j/e1/a0/a
    //   112	129	148	net/time4j/e1/a0/a
    //   129	136	143	net/time4j/e1/a0/a
    //   406	413	461	java/lang/RuntimeException
    //   421	430	461	java/lang/RuntimeException
    //   434	458	461	java/lang/RuntimeException
    //   506	524	641	java/lang/RuntimeException
  }
  
  private static <C> C a(c<?> paramc, x<C> paramx, int paramInt, CharSequence paramCharSequence, s params, net.time4j.d1.d paramd, g paramg, boolean paramBoolean) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual b : ()Lnet/time4j/d1/x;
    //   4: astore #10
    //   6: aload #10
    //   8: ifnull -> 356
    //   11: aload_0
    //   12: getfield o : Lnet/time4j/d1/x;
    //   15: astore #9
    //   17: aload_1
    //   18: aload #9
    //   20: if_acmpne -> 26
    //   23: goto -> 356
    //   26: aload #10
    //   28: aload #9
    //   30: if_acmpne -> 58
    //   33: aload_0
    //   34: aload #10
    //   36: aload #10
    //   38: invokevirtual f : ()Ljava/util/List;
    //   41: aload_3
    //   42: aload #4
    //   44: aload #5
    //   46: aload #6
    //   48: iconst_1
    //   49: iload #7
    //   51: invokestatic a : (Lnet/time4j/e1/a0/c;Lnet/time4j/d1/u;Ljava/util/List;Ljava/lang/CharSequence;Lnet/time4j/e1/a0/s;Lnet/time4j/d1/d;Lnet/time4j/e1/g;ZZ)Ljava/lang/Object;
    //   54: astore_0
    //   55: goto -> 77
    //   58: aload_0
    //   59: aload #10
    //   61: iload_2
    //   62: iconst_1
    //   63: iadd
    //   64: aload_3
    //   65: aload #4
    //   67: aload #5
    //   69: aload #6
    //   71: iload #7
    //   73: invokestatic a : (Lnet/time4j/e1/a0/c;Lnet/time4j/d1/x;ILjava/lang/CharSequence;Lnet/time4j/e1/a0/s;Lnet/time4j/d1/d;Lnet/time4j/e1/g;Z)Ljava/lang/Object;
    //   76: astore_0
    //   77: aload #4
    //   79: invokevirtual i : ()Z
    //   82: ifeq -> 87
    //   85: aconst_null
    //   86: areturn
    //   87: aload_0
    //   88: ifnonnull -> 144
    //   91: aload #4
    //   93: invokevirtual g : ()Lnet/time4j/d1/q;
    //   96: astore_0
    //   97: aload_3
    //   98: invokeinterface length : ()I
    //   103: istore_2
    //   104: new java/lang/StringBuilder
    //   107: dup
    //   108: invokespecial <init> : ()V
    //   111: astore_1
    //   112: aload_1
    //   113: aload_0
    //   114: invokestatic b : (Lnet/time4j/d1/q;)Ljava/lang/String;
    //   117: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   120: pop
    //   121: aload_1
    //   122: aload_0
    //   123: invokestatic a : (Lnet/time4j/d1/q;)Ljava/lang/String;
    //   126: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   129: pop
    //   130: aload_1
    //   131: invokevirtual toString : ()Ljava/lang/String;
    //   134: astore_0
    //   135: aload #4
    //   137: iload_2
    //   138: aload_0
    //   139: invokevirtual a : (ILjava/lang/String;)V
    //   142: aconst_null
    //   143: areturn
    //   144: aload #4
    //   146: invokevirtual h : ()Lnet/time4j/d1/q;
    //   149: astore #9
    //   151: aload #10
    //   153: instanceof net/time4j/d1/i0
    //   156: ifeq -> 275
    //   159: aload #9
    //   161: ldc_w net/time4j/d1/i0
    //   164: aload #10
    //   166: invokevirtual cast : (Ljava/lang/Object;)Ljava/lang/Object;
    //   169: checkcast net/time4j/d1/i0
    //   172: invokevirtual h : ()Lnet/time4j/d1/p;
    //   175: aload_0
    //   176: invokestatic b : (Lnet/time4j/d1/q;Lnet/time4j/d1/p;Ljava/lang/Object;)V
    //   179: aload_1
    //   180: aload #9
    //   182: aload #5
    //   184: aload #6
    //   186: invokevirtual a : ()Z
    //   189: iconst_0
    //   190: invokevirtual a : (Lnet/time4j/d1/q;Lnet/time4j/d1/d;ZZ)Ljava/lang/Object;
    //   193: astore_1
    //   194: aload_1
    //   195: ifnonnull -> 253
    //   198: aload #4
    //   200: invokevirtual i : ()Z
    //   203: ifne -> 251
    //   206: aload_3
    //   207: invokeinterface length : ()I
    //   212: istore_2
    //   213: new java/lang/StringBuilder
    //   216: dup
    //   217: invokespecial <init> : ()V
    //   220: astore_0
    //   221: aload_0
    //   222: aload #9
    //   224: invokestatic b : (Lnet/time4j/d1/q;)Ljava/lang/String;
    //   227: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   230: pop
    //   231: aload_0
    //   232: aload #9
    //   234: invokestatic a : (Lnet/time4j/d1/q;)Ljava/lang/String;
    //   237: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   240: pop
    //   241: aload #4
    //   243: iload_2
    //   244: aload_0
    //   245: invokevirtual toString : ()Ljava/lang/String;
    //   248: invokevirtual a : (ILjava/lang/String;)V
    //   251: aconst_null
    //   252: areturn
    //   253: aload_1
    //   254: astore_0
    //   255: aload #6
    //   257: invokevirtual c : ()Z
    //   260: ifeq -> 273
    //   263: aload #9
    //   265: aload_1
    //   266: aload_3
    //   267: aload #4
    //   269: invokestatic a : (Lnet/time4j/d1/q;Ljava/lang/Object;Ljava/lang/CharSequence;Lnet/time4j/e1/a0/s;)Ljava/lang/Object;
    //   272: astore_0
    //   273: aload_0
    //   274: areturn
    //   275: new java/lang/StringBuilder
    //   278: dup
    //   279: invokespecial <init> : ()V
    //   282: astore_0
    //   283: aload_0
    //   284: ldc_w 'Unsupported chronology or preparser: '
    //   287: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   290: pop
    //   291: aload_0
    //   292: aload_1
    //   293: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   296: pop
    //   297: new java/lang/IllegalStateException
    //   300: dup
    //   301: aload_0
    //   302: invokevirtual toString : ()Ljava/lang/String;
    //   305: invokespecial <init> : (Ljava/lang/String;)V
    //   308: athrow
    //   309: astore_0
    //   310: goto -> 314
    //   313: astore_0
    //   314: aload_3
    //   315: invokeinterface length : ()I
    //   320: istore_2
    //   321: new java/lang/StringBuilder
    //   324: dup
    //   325: invokespecial <init> : ()V
    //   328: astore_1
    //   329: aload_1
    //   330: aload_0
    //   331: invokevirtual getMessage : ()Ljava/lang/String;
    //   334: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   337: pop
    //   338: aload_1
    //   339: aload #9
    //   341: invokestatic a : (Lnet/time4j/d1/q;)Ljava/lang/String;
    //   344: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   347: pop
    //   348: aload_1
    //   349: invokevirtual toString : ()Ljava/lang/String;
    //   352: astore_0
    //   353: goto -> 135
    //   356: aload_1
    //   357: invokevirtual f : ()Ljava/util/List;
    //   360: astore #9
    //   362: iload_2
    //   363: ifle -> 372
    //   366: iconst_1
    //   367: istore #8
    //   369: goto -> 375
    //   372: iconst_0
    //   373: istore #8
    //   375: aload_0
    //   376: aload_1
    //   377: aload #9
    //   379: aload_3
    //   380: aload #4
    //   382: aload #5
    //   384: aload #6
    //   386: iload #8
    //   388: iload #7
    //   390: invokestatic a : (Lnet/time4j/e1/a0/c;Lnet/time4j/d1/u;Ljava/util/List;Ljava/lang/CharSequence;Lnet/time4j/e1/a0/s;Lnet/time4j/d1/d;Lnet/time4j/e1/g;ZZ)Ljava/lang/Object;
    //   393: areturn
    // Exception table:
    //   from	to	target	type
    //   151	194	313	java/lang/RuntimeException
    //   275	309	309	java/lang/RuntimeException
  }
  
  private static String a(int paramInt, CharSequence paramCharSequence) {
    int i = paramCharSequence.length();
    if (i - paramInt <= 10)
      return paramCharSequence.subSequence(paramInt, i).toString(); 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramCharSequence.subSequence(paramInt, paramInt + 10).toString());
    stringBuilder.append("...");
    return stringBuilder.toString();
  }
  
  private String a(o paramo) {
    StringBuilder stringBuilder = new StringBuilder(this.d.size() * 8);
    try {
      a(paramo, stringBuilder, this.c, false);
      return stringBuilder.toString();
    } catch (IOException iOException) {
      throw new IllegalStateException(iOException);
    } 
  }
  
  private static String a(q<?> paramq) {
    Set set = paramq.u();
    StringBuilder stringBuilder = new StringBuilder(set.size() * 16);
    stringBuilder.append(" [parsed={");
    Iterator<p> iterator = set.iterator();
    boolean bool = true;
    while (iterator.hasNext()) {
      p p = iterator.next();
      if (bool) {
        bool = false;
      } else {
        stringBuilder.append(", ");
      } 
      stringBuilder.append(p.name());
      stringBuilder.append('=');
      stringBuilder.append(paramq.e(p));
    } 
    stringBuilder.append("}]");
    return stringBuilder.toString();
  }
  
  private List<i> a(List<i> paramList) {
    ArrayList<i> arrayList = new ArrayList(paramList.size());
    Iterator<i> iterator = paramList.iterator();
    while (iterator.hasNext())
      arrayList.add(((i)iterator.next()).a(this)); 
    return Collections.unmodifiableList(arrayList);
  }
  
  private o a(T paramT, net.time4j.d1.d paramd) {
    e<?> e1 = this.b;
    if (e1 == null)
      return this.a.a(paramT, paramd); 
    try {
      StringBuilder stringBuilder;
      x<?> x1;
      Class<?> clazz = e1.d().e();
      f0 f0 = (f0)paramd.a(net.time4j.e1.a.u, this.b.a());
      a0 a0 = a0.class.cast(paramT);
      k k = (k)paramd.a(net.time4j.e1.a.d);
      if (l.class.isAssignableFrom(clazz)) {
        x1 = this.b.d();
        d(x1);
        r r = a0.a((j)x1, (String)paramd.a(net.time4j.e1.a.t), k, f0);
      } else {
        if (m.class.isAssignableFrom((Class<?>)x1)) {
          r r = a0.a(this.b.d(), k, f0);
          return new f(r, k, null);
        } 
        stringBuilder = new StringBuilder();
        stringBuilder.append("Unexpected calendar override: ");
        stringBuilder.append(x1);
        throw new IllegalStateException(stringBuilder.toString());
      } 
      return new f((r)stringBuilder, k, null);
    } catch (ClassCastException classCastException) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Not formattable: ");
      stringBuilder.append(paramT);
      throw new IllegalArgumentException(stringBuilder.toString(), classCastException);
    } catch (NoSuchElementException noSuchElementException) {
      throw new IllegalArgumentException(noSuchElementException.getMessage(), noSuchElementException);
    } 
  }
  
  private q<?> a(CharSequence paramCharSequence, s params, net.time4j.d1.d paramd, boolean paramBoolean, int paramInt) {
    // Byte code:
    //   0: new net/time4j/e1/a0/v
    //   3: dup
    //   4: iload #5
    //   6: aload_0
    //   7: getfield l : Z
    //   10: invokespecial <init> : (IZ)V
    //   13: astore #13
    //   15: aload #13
    //   17: aload_2
    //   18: invokevirtual f : ()I
    //   21: invokevirtual f : (I)V
    //   24: aload_0
    //   25: getfield g : Z
    //   28: ifeq -> 52
    //   31: new java/util/LinkedList
    //   34: dup
    //   35: invokespecial <init> : ()V
    //   38: astore #15
    //   40: aload #15
    //   42: aload #13
    //   44: invokeinterface push : (Ljava/lang/Object;)V
    //   49: goto -> 55
    //   52: aconst_null
    //   53: astore #15
    //   55: aload_0
    //   56: getfield d : Ljava/util/List;
    //   59: invokeinterface size : ()I
    //   64: istore #11
    //   66: iconst_0
    //   67: istore #6
    //   69: iconst_0
    //   70: istore #8
    //   72: iconst_0
    //   73: istore #7
    //   75: aload #13
    //   77: astore #14
    //   79: iload #6
    //   81: istore #9
    //   83: iload #7
    //   85: iload #11
    //   87: if_icmpge -> 780
    //   90: aload_0
    //   91: getfield d : Ljava/util/List;
    //   94: iload #7
    //   96: invokeinterface get : (I)Ljava/lang/Object;
    //   101: checkcast net/time4j/e1/a0/i
    //   104: astore #17
    //   106: aload #15
    //   108: ifnonnull -> 126
    //   111: aload #13
    //   113: astore #16
    //   115: aload #13
    //   117: astore #14
    //   119: aload #16
    //   121: astore #13
    //   123: goto -> 251
    //   126: aload #17
    //   128: invokevirtual a : ()I
    //   131: istore #9
    //   133: iload #9
    //   135: istore #6
    //   137: iload #6
    //   139: istore #10
    //   141: iload #6
    //   143: iload #8
    //   145: if_icmple -> 192
    //   148: new net/time4j/e1/a0/v
    //   151: dup
    //   152: iload #5
    //   154: iconst_1
    //   155: iushr
    //   156: aload_0
    //   157: getfield l : Z
    //   160: invokespecial <init> : (IZ)V
    //   163: astore #13
    //   165: aload #13
    //   167: aload_2
    //   168: invokevirtual f : ()I
    //   171: invokevirtual f : (I)V
    //   174: aload #15
    //   176: aload #13
    //   178: invokeinterface push : (Ljava/lang/Object;)V
    //   183: iload #6
    //   185: iconst_1
    //   186: isub
    //   187: istore #6
    //   189: goto -> 137
    //   192: iload #10
    //   194: iload #8
    //   196: if_icmpge -> 235
    //   199: aload #15
    //   201: invokeinterface pop : ()Ljava/lang/Object;
    //   206: checkcast net/time4j/e1/a0/v
    //   209: astore #13
    //   211: aload #15
    //   213: invokeinterface peek : ()Ljava/lang/Object;
    //   218: checkcast net/time4j/e1/a0/v
    //   221: aload #13
    //   223: invokevirtual a : (Lnet/time4j/e1/a0/v;)V
    //   226: iload #10
    //   228: iconst_1
    //   229: iadd
    //   230: istore #10
    //   232: goto -> 192
    //   235: aload #15
    //   237: invokeinterface peek : ()Ljava/lang/Object;
    //   242: checkcast net/time4j/e1/a0/v
    //   245: astore #14
    //   247: iload #9
    //   249: istore #6
    //   251: aload_2
    //   252: invokevirtual b : ()V
    //   255: aload #17
    //   257: aload_1
    //   258: aload_2
    //   259: aload_3
    //   260: aload #14
    //   262: iload #4
    //   264: invokevirtual a : (Ljava/lang/CharSequence;Lnet/time4j/e1/a0/s;Lnet/time4j/d1/d;Lnet/time4j/e1/a0/t;Z)V
    //   267: aload_2
    //   268: invokevirtual j : ()Z
    //   271: ifeq -> 341
    //   274: aload #17
    //   276: invokevirtual b : ()Lnet/time4j/e1/a0/h;
    //   279: invokeinterface b : ()Lnet/time4j/d1/p;
    //   284: astore #16
    //   286: aload #16
    //   288: ifnull -> 341
    //   291: aload_0
    //   292: getfield e : Ljava/util/Map;
    //   295: aload #16
    //   297: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   302: ifeq -> 341
    //   305: aload #14
    //   307: aload #16
    //   309: aload_0
    //   310: getfield e : Ljava/util/Map;
    //   313: aload #16
    //   315: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   320: invokevirtual c : (Lnet/time4j/d1/p;Ljava/lang/Object;)V
    //   323: aload #14
    //   325: getstatic net/time4j/d1/o0.c : Lnet/time4j/d1/o0;
    //   328: aconst_null
    //   329: invokevirtual b : (Lnet/time4j/d1/p;Ljava/lang/Object;)Lnet/time4j/e1/a0/t;
    //   332: pop
    //   333: aload_2
    //   334: invokevirtual a : ()V
    //   337: aload_2
    //   338: invokevirtual b : ()V
    //   341: aload_2
    //   342: invokevirtual i : ()Z
    //   345: ifeq -> 736
    //   348: aload #17
    //   350: invokevirtual c : ()I
    //   353: istore #10
    //   355: aload #17
    //   357: invokevirtual e : ()Z
    //   360: ifne -> 422
    //   363: iload #7
    //   365: iconst_1
    //   366: iadd
    //   367: istore #8
    //   369: iload #8
    //   371: iload #11
    //   373: if_icmpge -> 422
    //   376: aload_0
    //   377: getfield d : Ljava/util/List;
    //   380: iload #8
    //   382: invokeinterface get : (I)Ljava/lang/Object;
    //   387: checkcast net/time4j/e1/a0/i
    //   390: astore #14
    //   392: aload #14
    //   394: invokevirtual e : ()Z
    //   397: ifeq -> 413
    //   400: aload #14
    //   402: invokevirtual c : ()I
    //   405: iload #10
    //   407: if_icmpne -> 413
    //   410: goto -> 426
    //   413: iload #8
    //   415: iconst_1
    //   416: iadd
    //   417: istore #8
    //   419: goto -> 369
    //   422: iload #7
    //   424: istore #8
    //   426: iload #8
    //   428: iload #7
    //   430: if_icmpgt -> 648
    //   433: aload #17
    //   435: invokevirtual e : ()Z
    //   438: ifeq -> 444
    //   441: goto -> 648
    //   444: iload #6
    //   446: ifne -> 474
    //   449: aload #15
    //   451: ifnull -> 466
    //   454: aload #15
    //   456: invokeinterface peek : ()Ljava/lang/Object;
    //   461: checkcast net/time4j/e1/a0/v
    //   464: astore #13
    //   466: aload #13
    //   468: invokevirtual y : ()V
    //   471: aload #13
    //   473: areturn
    //   474: aload #17
    //   476: invokevirtual a : ()I
    //   479: istore #12
    //   481: iload #7
    //   483: iconst_1
    //   484: iadd
    //   485: istore #9
    //   487: iload #8
    //   489: istore #7
    //   491: iload #9
    //   493: istore #8
    //   495: iload #8
    //   497: iload #11
    //   499: if_icmpge -> 537
    //   502: aload_0
    //   503: getfield d : Ljava/util/List;
    //   506: iload #8
    //   508: invokeinterface get : (I)Ljava/lang/Object;
    //   513: checkcast net/time4j/e1/a0/i
    //   516: invokevirtual a : ()I
    //   519: iload #12
    //   521: if_icmple -> 537
    //   524: iload #8
    //   526: istore #7
    //   528: iload #8
    //   530: iconst_1
    //   531: iadd
    //   532: istore #8
    //   534: goto -> 495
    //   537: iload #11
    //   539: iconst_1
    //   540: isub
    //   541: istore #8
    //   543: iload #8
    //   545: iload #7
    //   547: if_icmple -> 584
    //   550: aload_0
    //   551: getfield d : Ljava/util/List;
    //   554: iload #8
    //   556: invokeinterface get : (I)Ljava/lang/Object;
    //   561: checkcast net/time4j/e1/a0/i
    //   564: invokevirtual c : ()I
    //   567: iload #10
    //   569: if_icmpne -> 575
    //   572: goto -> 588
    //   575: iload #8
    //   577: iconst_1
    //   578: isub
    //   579: istore #8
    //   581: goto -> 543
    //   584: iload #7
    //   586: istore #8
    //   588: iload #6
    //   590: iconst_1
    //   591: isub
    //   592: istore #7
    //   594: getstatic net/time4j/e1/a0/c.r : Z
    //   597: ifne -> 616
    //   600: aload #15
    //   602: ifnull -> 608
    //   605: goto -> 616
    //   608: new java/lang/AssertionError
    //   611: dup
    //   612: invokespecial <init> : ()V
    //   615: athrow
    //   616: aload #15
    //   618: invokeinterface pop : ()Ljava/lang/Object;
    //   623: checkcast net/time4j/e1/a0/v
    //   626: astore #13
    //   628: aload_2
    //   629: invokevirtual a : ()V
    //   632: aload_2
    //   633: aload #13
    //   635: invokevirtual w : ()I
    //   638: invokevirtual a : (I)V
    //   641: iload #8
    //   643: istore #9
    //   645: goto -> 725
    //   648: aload #15
    //   650: ifnull -> 665
    //   653: aload #15
    //   655: invokeinterface pop : ()Ljava/lang/Object;
    //   660: checkcast net/time4j/e1/a0/v
    //   663: astore #13
    //   665: aload #13
    //   667: astore #14
    //   669: aload_2
    //   670: invokevirtual a : ()V
    //   673: aload_2
    //   674: aload #14
    //   676: invokevirtual w : ()I
    //   679: invokevirtual a : (I)V
    //   682: aload #14
    //   684: invokevirtual x : ()V
    //   687: aload #14
    //   689: astore #13
    //   691: iload #8
    //   693: istore #9
    //   695: iload #6
    //   697: istore #7
    //   699: aload #15
    //   701: ifnull -> 725
    //   704: aload #15
    //   706: aload #14
    //   708: invokeinterface push : (Ljava/lang/Object;)V
    //   713: iload #6
    //   715: istore #7
    //   717: iload #8
    //   719: istore #9
    //   721: aload #14
    //   723: astore #13
    //   725: iload #9
    //   727: istore #8
    //   729: iload #7
    //   731: istore #6
    //   733: goto -> 755
    //   736: aload #17
    //   738: invokevirtual e : ()Z
    //   741: ifeq -> 751
    //   744: aload #17
    //   746: invokevirtual g : ()I
    //   749: istore #7
    //   751: iload #7
    //   753: istore #8
    //   755: iload #6
    //   757: istore #7
    //   759: iload #8
    //   761: iconst_1
    //   762: iadd
    //   763: istore #9
    //   765: iload #7
    //   767: istore #6
    //   769: iload #7
    //   771: istore #8
    //   773: iload #9
    //   775: istore #7
    //   777: goto -> 75
    //   780: iload #9
    //   782: ifle -> 843
    //   785: getstatic net/time4j/e1/a0/c.r : Z
    //   788: ifne -> 807
    //   791: aload #15
    //   793: ifnull -> 799
    //   796: goto -> 807
    //   799: new java/lang/AssertionError
    //   802: dup
    //   803: invokespecial <init> : ()V
    //   806: athrow
    //   807: aload #15
    //   809: invokeinterface pop : ()Ljava/lang/Object;
    //   814: checkcast net/time4j/e1/a0/v
    //   817: astore #14
    //   819: aload #15
    //   821: invokeinterface peek : ()Ljava/lang/Object;
    //   826: checkcast net/time4j/e1/a0/v
    //   829: aload #14
    //   831: invokevirtual a : (Lnet/time4j/e1/a0/v;)V
    //   834: iload #9
    //   836: iconst_1
    //   837: isub
    //   838: istore #9
    //   840: goto -> 780
    //   843: aload #15
    //   845: ifnull -> 860
    //   848: aload #15
    //   850: invokeinterface peek : ()Ljava/lang/Object;
    //   855: checkcast net/time4j/e1/a0/v
    //   858: astore #14
    //   860: aload #14
    //   862: invokevirtual y : ()V
    //   865: aload #14
    //   867: areturn
  }
  
  public static <T extends q<T>> d<T> a(Class<T> paramClass, Locale paramLocale) {
    if (paramClass != null) {
      x x1 = x.a(paramClass);
      if (x1 != null)
        return new d<T>(x1, paramLocale, null); 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Not formattable: ");
      stringBuilder.append(paramClass);
      throw new IllegalArgumentException(stringBuilder.toString());
    } 
    throw new NullPointerException("Missing chronological type.");
  }
  
  public static <T> c<T> a(String paramString, w paramw, Locale paramLocale, x<T> paramx) {
    d<?> d1 = new d(paramx, paramLocale, null);
    a(d1, paramString, paramw);
    try {
      return (c)d1.h();
    } catch (IllegalStateException illegalStateException) {
      throw new IllegalArgumentException(illegalStateException);
    } 
  }
  
  public static c<a0> a(net.time4j.e1.e parame1, net.time4j.e1.e parame2, Locale paramLocale, k paramk) {
    d<a0> d1 = new d((x)a0.y(), paramLocale, null);
    d.a(d1, new z((y)parame1, (y)parame2));
    return d1.h().a(paramk);
  }
  
  private static <V> void a(q<?> paramq, p<V> paramp, Object paramObject) {
    paramq.b(paramp, paramp.getType().cast(paramObject));
  }
  
  private static void a(d<a0> paramd) {
    paramd.l();
    paramd.a(net.time4j.e1.a.g, w.d);
    paramd.a((p<Enum>)f0.x);
    paramd.i();
    paramd.a(", ");
    paramd.i();
    paramd.a((p<Integer>)f0.w, 1, 2);
    paramd.a(' ');
    paramd.a(net.time4j.e1.a.g, w.d);
    paramd.a((p<Enum>)f0.u);
    paramd.i();
    paramd.a(' ');
    paramd.a((p<Integer>)f0.r, 4);
    paramd.a(' ');
    paramd.a((p<Integer>)g0.w, 2);
    paramd.a(':');
    paramd.a((p<Integer>)g0.y, 2);
    paramd.l();
    paramd.a(':');
    paramd.a((p<Integer>)g0.A, 2);
    paramd.i();
    paramd.a(' ');
  }
  
  private static <T> void a(d<T> paramd, String paramString, w paramw) {
    StringBuilder stringBuilder1;
    int m = paramString.length();
    StringBuilder stringBuilder2 = new StringBuilder(m);
    int k;
    for (k = 0; k < m; k = n + 1) {
      int n;
      char c1 = paramString.charAt(k);
      if (c1 == '\'') {
        boolean bool;
        n = k + 1;
        if (paramString.charAt(n) == 'Z') {
          bool = true;
        } else {
          bool = false;
        } 
        while (n < m) {
          int i1 = n;
          if (paramString.charAt(n) == '\'') {
            i1 = n + 1;
            if (i1 >= m || paramString.charAt(i1) != '\'') {
              if (!bool || n != k + 2 || !d.a(d.a(paramd)))
                break; 
              stringBuilder1 = new StringBuilder();
              stringBuilder1.append("Z-literal (=UTC+00) should not be escaped: ");
              stringBuilder1.append(paramString);
              throw new IllegalArgumentException(stringBuilder1.toString());
            } 
          } 
          n = i1 + 1;
        } 
      } else {
        stringBuilder2.append(c1);
        n = k;
      } 
    } 
    String str = stringBuilder2.toString();
    int i = c.a[paramw.ordinal()];
    if (i == 1 || i == 2 || i == 3 || i == 4)
      if ((!str.contains("h") && !str.contains("K")) || str.contains("a") || str.contains("b") || str.contains("B")) {
        if (!str.contains("Y") || (!str.contains("M") && !str.contains("L")) || str.contains("w")) {
          if (str.contains("D") && (str.contains("M") || str.contains("L")) && !str.contains("d")) {
            stringBuilder1 = new StringBuilder();
            stringBuilder1.append("D is the day of year but not the day of month: ");
            stringBuilder1.append(paramString);
            throw new IllegalArgumentException(stringBuilder1.toString());
          } 
        } else {
          stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Y as week-based-year requires a week-date-format: ");
          stringBuilder1.append(paramString);
          throw new IllegalArgumentException(stringBuilder1.toString());
        } 
      } else {
        stringBuilder1 = new StringBuilder();
        stringBuilder1.append("12-hour-clock requires am/pm-marker or dayperiod: ");
        stringBuilder1.append(paramString);
        throw new IllegalArgumentException(stringBuilder1.toString());
      }  
    stringBuilder1.a(paramString, paramw);
  }
  
  private static boolean a(Object paramObject1, Object paramObject2) {
    return (paramObject1 == null) ? ((paramObject2 == null)) : paramObject1.equals(paramObject2);
  }
  
  private static int b(x<?> paramx1, x<?> paramx2, x<?> paramx3) {
    if (paramx3 != null)
      return -1; 
    boolean bool = paramx1.equals(paramx2);
    int i = 0;
    if (bool)
      return 0; 
    while (true) {
      paramx3 = paramx2.b();
      if (paramx3 != null) {
        int k = i + 1;
        i = k;
        paramx2 = paramx3;
        if (paramx1.equals(paramx3))
          return k; 
        continue;
      } 
      return Integer.MAX_VALUE;
    } 
  }
  
  private static String b(q<?> paramq) {
    if (paramq.c((p)o0.c)) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Validation failed => ");
      stringBuilder.append((String)paramq.e((p)o0.c));
      String str = stringBuilder.toString();
      paramq.b((p)o0.c, null);
      return str;
    } 
    return "Insufficient data:";
  }
  
  private static x<?> b(x<?> paramx1, x<?> paramx2, p<?> paramp) {
    if (paramx1.d(paramp))
      return paramx1; 
    if (paramx2 == null) {
      while (true) {
        paramx2 = paramx1.b();
        if (paramx2 != null) {
          paramx1 = paramx2;
          if (paramx2.d(paramp))
            return paramx2; 
          continue;
        } 
        break;
      } 
    } else {
      if (paramp.d() && paramx2.d(paramp))
        return paramx2; 
      if (paramp.s() && g0.C().d(paramp))
        return (x<?>)g0.C(); 
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Unsupported element: ");
    stringBuilder.append(paramp.name());
    IllegalArgumentException illegalArgumentException = new IllegalArgumentException(stringBuilder.toString());
    throw illegalArgumentException;
  }
  
  private static <T> void b(q<?> paramq, p<T> paramp, Object paramObject) {
    paramq.b(paramp, paramp.getType().cast(paramObject));
  }
  
  private static boolean c(x<?> paramx1, x<?> paramx2, p<?> paramp) {
    Iterator<s> iterator = paramx1.f().iterator();
    while (iterator.hasNext()) {
      if (((s)iterator.next()).a(paramp))
        return true; 
    } 
    if (paramx2 == null) {
      label30: while (true) {
        paramx2 = paramx1.b();
        if (paramx2 != null) {
          iterator = paramx2.f().iterator();
          while (true) {
            paramx1 = paramx2;
            if (iterator.hasNext()) {
              if (((s)iterator.next()).a(paramp))
                return true; 
              continue;
            } 
            continue label30;
          } 
        } 
        break;
      } 
    } else if (paramp.d()) {
      Iterator<s> iterator1 = paramx2.f().iterator();
      while (iterator1.hasNext()) {
        if (((s)iterator1.next()).a(paramp))
          return true; 
      } 
    } else if (paramp.s() && g0.C().d(paramp)) {
      Iterator<s> iterator1 = g0.C().f().iterator();
      while (iterator1.hasNext()) {
        if (((s)iterator1.next()).a(paramp))
          return true; 
      } 
    } 
    return false;
  }
  
  private static <T> T d(Object paramObject) {
    return (T)paramObject;
  }
  
  private boolean g() {
    boolean bool2 = f();
    boolean bool1 = bool2;
    if (bool2) {
      h<?> h = ((i)this.d.get(0)).b();
      if (h instanceof f)
        return ((f)f.class.cast(h)).c(); 
      bool1 = bool2;
      if (!(h instanceof z))
        bool1 = false; 
    } 
    return bool1;
  }
  
  private boolean h() {
    return (this.a.b() == null && this.b == null);
  }
  
  private static c<a0> i() {
    d<a0> d1 = a(a0.class, Locale.ENGLISH);
    a(d1);
    d1.a(net.time4j.e1.e.f, false, Arrays.asList(new String[] { "GMT", "UT", "Z" }));
    d1.k();
    a(d1);
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    hashMap.put("EST", p.a(net.time4j.tz.f.c, 5));
    hashMap.put("EDT", p.a(net.time4j.tz.f.c, 4));
    hashMap.put("CST", p.a(net.time4j.tz.f.c, 6));
    hashMap.put("CDT", p.a(net.time4j.tz.f.c, 5));
    hashMap.put("MST", p.a(net.time4j.tz.f.c, 7));
    hashMap.put("MDT", p.a(net.time4j.tz.f.c, 6));
    hashMap.put("PST", p.a(net.time4j.tz.f.c, 8));
    hashMap.put("PDT", p.a(net.time4j.tz.f.c, 7));
    d.a(d1, new f(b0.d, new a(), new b(hashMap)));
    return d1.h().a((k)p.m);
  }
  
  public T a(CharSequence paramCharSequence) {
    StringBuilder stringBuilder;
    s s1 = new s();
    T t = a(paramCharSequence, s1);
    if (t != null) {
      int i = s1.f();
      if (!this.m) {
        if (i >= paramCharSequence.length())
          return t; 
        stringBuilder = new StringBuilder();
        stringBuilder.append("Unparsed trailing characters: ");
        stringBuilder.append(a(i, paramCharSequence));
        throw new ParseException(stringBuilder.toString(), i);
      } 
      return t;
    } 
    throw new ParseException(stringBuilder.d(), stringBuilder.c());
  }
  
  public T a(CharSequence paramCharSequence, s params) {
    if (this.n) {
      x<T> x1 = this.a;
      return a(this, (u<T>)x1, x1.f(), paramCharSequence, params, this.c, this.k, false, true);
    } 
    return a(paramCharSequence, params, this.c);
  }
  
  public T a(CharSequence paramCharSequence, s params, net.time4j.d1.d paramd) {
    // Byte code:
    //   0: aload_0
    //   1: getfield k : Lnet/time4j/e1/g;
    //   4: astore #6
    //   6: aload_0
    //   7: getfield c : Lnet/time4j/e1/a0/b;
    //   10: astore #5
    //   12: aload_3
    //   13: aload #5
    //   15: if_acmpeq -> 54
    //   18: new net/time4j/e1/a0/p
    //   21: dup
    //   22: aload_3
    //   23: aload #5
    //   25: invokespecial <init> : (Lnet/time4j/d1/d;Lnet/time4j/d1/d;)V
    //   28: astore #7
    //   30: aload #7
    //   32: getstatic net/time4j/e1/a.f : Lnet/time4j/d1/c;
    //   35: getstatic net/time4j/e1/g.d : Lnet/time4j/e1/g;
    //   38: invokeinterface a : (Lnet/time4j/d1/c;Ljava/lang/Object;)Ljava/lang/Object;
    //   43: checkcast net/time4j/e1/g
    //   46: astore #6
    //   48: iconst_0
    //   49: istore #4
    //   51: goto -> 60
    //   54: aload_3
    //   55: astore #7
    //   57: iconst_1
    //   58: istore #4
    //   60: aload_0
    //   61: getfield b : Lnet/time4j/e1/a0/c$e;
    //   64: astore #5
    //   66: aload #5
    //   68: ifnull -> 403
    //   71: aload #5
    //   73: invokevirtual e : ()Ljava/util/List;
    //   76: astore #5
    //   78: aload_0
    //   79: getfield b : Lnet/time4j/e1/a0/c$e;
    //   82: astore #10
    //   84: aload_0
    //   85: aload #10
    //   87: aload #5
    //   89: aload_1
    //   90: aload_2
    //   91: aload #7
    //   93: aload #6
    //   95: iconst_1
    //   96: iload #4
    //   98: invokestatic a : (Lnet/time4j/e1/a0/c;Lnet/time4j/d1/u;Ljava/util/List;Ljava/lang/CharSequence;Lnet/time4j/e1/a0/s;Lnet/time4j/d1/d;Lnet/time4j/e1/g;ZZ)Ljava/lang/Object;
    //   101: checkcast net/time4j/r
    //   104: astore #9
    //   106: aload_2
    //   107: invokevirtual i : ()Z
    //   110: ifeq -> 115
    //   113: aconst_null
    //   114: areturn
    //   115: aload_2
    //   116: invokevirtual h : ()Lnet/time4j/d1/q;
    //   119: astore #8
    //   121: aload #8
    //   123: invokevirtual d : ()Z
    //   126: ifeq -> 139
    //   129: aload #8
    //   131: invokevirtual c : ()Lnet/time4j/tz/k;
    //   134: astore #5
    //   136: goto -> 173
    //   139: aload #7
    //   141: getstatic net/time4j/e1/a.d : Lnet/time4j/d1/c;
    //   144: invokeinterface b : (Lnet/time4j/d1/c;)Z
    //   149: ifeq -> 170
    //   152: aload #7
    //   154: getstatic net/time4j/e1/a.d : Lnet/time4j/d1/c;
    //   157: invokeinterface a : (Lnet/time4j/d1/c;)Ljava/lang/Object;
    //   162: checkcast net/time4j/tz/k
    //   165: astore #5
    //   167: goto -> 173
    //   170: aconst_null
    //   171: astore #5
    //   173: aload #5
    //   175: ifnull -> 345
    //   178: aload_3
    //   179: getstatic net/time4j/e1/a.u : Lnet/time4j/d1/c;
    //   182: aload #10
    //   184: invokeinterface a : ()Lnet/time4j/d1/f0;
    //   189: invokeinterface a : (Lnet/time4j/d1/c;Ljava/lang/Object;)Ljava/lang/Object;
    //   194: checkcast net/time4j/d1/f0
    //   197: astore #10
    //   199: aload #8
    //   201: getstatic net/time4j/d1/b0.d : Lnet/time4j/d1/b0;
    //   204: invokevirtual c : (Lnet/time4j/d1/p;)Z
    //   207: ifeq -> 283
    //   210: aload #8
    //   212: getstatic net/time4j/d1/b0.d : Lnet/time4j/d1/b0;
    //   215: invokevirtual e : (Lnet/time4j/d1/p;)Ljava/lang/Object;
    //   218: checkcast java/lang/Boolean
    //   221: invokevirtual booleanValue : ()Z
    //   224: istore #4
    //   226: aload #7
    //   228: getstatic net/time4j/e1/a.e : Lnet/time4j/d1/c;
    //   231: getstatic net/time4j/tz/l.e : Lnet/time4j/tz/o;
    //   234: invokeinterface a : (Lnet/time4j/d1/c;Ljava/lang/Object;)Ljava/lang/Object;
    //   239: checkcast net/time4j/tz/o
    //   242: astore #7
    //   244: iload #4
    //   246: ifeq -> 256
    //   249: getstatic net/time4j/tz/g.c : Lnet/time4j/tz/g;
    //   252: astore_3
    //   253: goto -> 260
    //   256: getstatic net/time4j/tz/g.d : Lnet/time4j/tz/g;
    //   259: astore_3
    //   260: aload #7
    //   262: aload_3
    //   263: invokeinterface a : (Lnet/time4j/tz/g;)Lnet/time4j/tz/o;
    //   268: astore #7
    //   270: aload #5
    //   272: invokestatic a : (Lnet/time4j/tz/k;)Lnet/time4j/tz/l;
    //   275: astore_3
    //   276: aload #7
    //   278: astore #5
    //   280: goto -> 324
    //   283: aload #7
    //   285: getstatic net/time4j/e1/a.e : Lnet/time4j/d1/c;
    //   288: invokeinterface b : (Lnet/time4j/d1/c;)Z
    //   293: istore #4
    //   295: aload #5
    //   297: invokestatic a : (Lnet/time4j/tz/k;)Lnet/time4j/tz/l;
    //   300: astore_3
    //   301: aload_3
    //   302: astore #5
    //   304: iload #4
    //   306: ifeq -> 332
    //   309: aload #7
    //   311: getstatic net/time4j/e1/a.e : Lnet/time4j/d1/c;
    //   314: invokeinterface a : (Lnet/time4j/d1/c;)Ljava/lang/Object;
    //   319: checkcast net/time4j/tz/o
    //   322: astore #5
    //   324: aload_3
    //   325: aload #5
    //   327: invokevirtual a : (Lnet/time4j/tz/o;)Lnet/time4j/tz/l;
    //   330: astore #5
    //   332: aload #9
    //   334: aload #5
    //   336: aload #10
    //   338: invokevirtual a : (Lnet/time4j/tz/l;Lnet/time4j/d1/f0;)Lnet/time4j/a0;
    //   341: astore_3
    //   342: goto -> 347
    //   345: aconst_null
    //   346: astore_3
    //   347: aload_3
    //   348: ifnonnull -> 366
    //   351: aload_2
    //   352: aload_1
    //   353: invokeinterface length : ()I
    //   358: ldc_w 'Missing timezone or offset.'
    //   361: invokevirtual a : (ILjava/lang/String;)V
    //   364: aconst_null
    //   365: areturn
    //   366: aload #8
    //   368: invokestatic y : ()Lnet/time4j/d1/i0;
    //   371: invokevirtual h : ()Lnet/time4j/d1/p;
    //   374: aload_3
    //   375: invokevirtual b : (Lnet/time4j/d1/p;Ljava/lang/Object;)Lnet/time4j/d1/q;
    //   378: pop
    //   379: aload_3
    //   380: invokestatic d : (Ljava/lang/Object;)Ljava/lang/Object;
    //   383: pop
    //   384: aload #6
    //   386: invokevirtual c : ()Z
    //   389: ifeq -> 401
    //   392: aload #8
    //   394: aload_3
    //   395: aload_1
    //   396: aload_2
    //   397: invokestatic a : (Lnet/time4j/d1/q;Ljava/lang/Object;Ljava/lang/CharSequence;Lnet/time4j/e1/a0/s;)Ljava/lang/Object;
    //   400: pop
    //   401: aload_3
    //   402: areturn
    //   403: aload_0
    //   404: aload_0
    //   405: getfield a : Lnet/time4j/d1/x;
    //   408: iconst_0
    //   409: aload_1
    //   410: aload_2
    //   411: aload #7
    //   413: aload #6
    //   415: iload #4
    //   417: invokestatic a : (Lnet/time4j/e1/a0/c;Lnet/time4j/d1/x;ILjava/lang/CharSequence;Lnet/time4j/e1/a0/s;Lnet/time4j/d1/d;Lnet/time4j/e1/g;Z)Ljava/lang/Object;
    //   420: areturn
  }
  
  public <R> R a(T paramT, Appendable paramAppendable, net.time4j.d1.d paramd, t<o, R> paramt) {
    o o = a(paramT, paramd);
    a(o, paramAppendable, paramd, false);
    return (R)paramt.a(o);
  }
  
  public String a(T paramT) {
    return b(paramT);
  }
  
  public Set<g> a(T paramT, Appendable paramAppendable, net.time4j.d1.d paramd) {
    return a(a(paramT, paramd), paramAppendable, paramd, true);
  }
  
  Set<g> a(o paramo, Appendable paramAppendable, net.time4j.d1.d paramd, boolean paramBoolean) {
    // Byte code:
    //   0: aload_2
    //   1: ifnull -> 912
    //   4: aload_0
    //   5: getfield d : Ljava/util/List;
    //   8: invokeinterface size : ()I
    //   13: istore #10
    //   15: aload_0
    //   16: getfield c : Lnet/time4j/e1/a0/b;
    //   19: astore #12
    //   21: iconst_0
    //   22: istore #8
    //   24: aload_3
    //   25: aload #12
    //   27: if_acmpne -> 36
    //   30: iconst_1
    //   31: istore #11
    //   33: goto -> 39
    //   36: iconst_0
    //   37: istore #11
    //   39: iload #4
    //   41: ifeq -> 58
    //   44: new java/util/LinkedHashSet
    //   47: dup
    //   48: iload #10
    //   50: invokespecial <init> : (I)V
    //   53: astore #12
    //   55: goto -> 61
    //   58: aconst_null
    //   59: astore #12
    //   61: aload_0
    //   62: getfield h : Z
    //   65: ifeq -> 796
    //   68: new java/util/LinkedList
    //   71: dup
    //   72: invokespecial <init> : ()V
    //   75: astore #15
    //   77: aload #15
    //   79: new java/lang/StringBuilder
    //   82: dup
    //   83: iload #10
    //   85: iconst_2
    //   86: ishl
    //   87: invokespecial <init> : (I)V
    //   90: invokeinterface push : (Ljava/lang/Object;)V
    //   95: iload #4
    //   97: ifeq -> 121
    //   100: new java/util/LinkedList
    //   103: dup
    //   104: invokespecial <init> : ()V
    //   107: astore #13
    //   109: aload #13
    //   111: aload #12
    //   113: invokeinterface push : (Ljava/lang/Object;)V
    //   118: goto -> 124
    //   121: aconst_null
    //   122: astore #13
    //   124: iconst_0
    //   125: istore #5
    //   127: aload #13
    //   129: astore #14
    //   131: iload #5
    //   133: iload #10
    //   135: if_icmpge -> 739
    //   138: aload_0
    //   139: getfield d : Ljava/util/List;
    //   142: iload #5
    //   144: invokeinterface get : (I)Ljava/lang/Object;
    //   149: checkcast net/time4j/e1/a0/i
    //   152: astore #16
    //   154: aload #16
    //   156: invokevirtual a : ()I
    //   159: istore #7
    //   161: iload #7
    //   163: istore #6
    //   165: aload #12
    //   167: astore #13
    //   169: iload #6
    //   171: istore #9
    //   173: aload #13
    //   175: astore #12
    //   177: iload #6
    //   179: iload #8
    //   181: if_icmple -> 268
    //   184: new java/lang/StringBuilder
    //   187: dup
    //   188: invokespecial <init> : ()V
    //   191: astore #12
    //   193: aload #12
    //   195: aload #15
    //   197: invokeinterface peek : ()Ljava/lang/Object;
    //   202: checkcast java/lang/CharSequence
    //   205: invokevirtual append : (Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;
    //   208: pop
    //   209: aload #15
    //   211: aload #12
    //   213: invokeinterface push : (Ljava/lang/Object;)V
    //   218: iload #4
    //   220: ifeq -> 259
    //   223: new java/util/LinkedHashSet
    //   226: dup
    //   227: invokespecial <init> : ()V
    //   230: astore #13
    //   232: aload #13
    //   234: aload #14
    //   236: invokeinterface peek : ()Ljava/lang/Object;
    //   241: checkcast java/util/Collection
    //   244: invokeinterface addAll : (Ljava/util/Collection;)Z
    //   249: pop
    //   250: aload #14
    //   252: aload #13
    //   254: invokeinterface push : (Ljava/lang/Object;)V
    //   259: iload #6
    //   261: iconst_1
    //   262: isub
    //   263: istore #6
    //   265: goto -> 169
    //   268: iload #9
    //   270: iload #8
    //   272: if_icmpge -> 347
    //   275: aload #15
    //   277: invokeinterface pop : ()Ljava/lang/Object;
    //   282: checkcast java/lang/StringBuilder
    //   285: astore #13
    //   287: aload #15
    //   289: invokeinterface pop : ()Ljava/lang/Object;
    //   294: pop
    //   295: aload #15
    //   297: aload #13
    //   299: invokeinterface push : (Ljava/lang/Object;)V
    //   304: iload #4
    //   306: ifeq -> 338
    //   309: aload #14
    //   311: invokeinterface pop : ()Ljava/lang/Object;
    //   316: checkcast java/util/Set
    //   319: astore #12
    //   321: aload #14
    //   323: invokeinterface pop : ()Ljava/lang/Object;
    //   328: pop
    //   329: aload #14
    //   331: aload #12
    //   333: invokeinterface push : (Ljava/lang/Object;)V
    //   338: iload #9
    //   340: iconst_1
    //   341: iadd
    //   342: istore #9
    //   344: goto -> 268
    //   347: aload #15
    //   349: invokeinterface peek : ()Ljava/lang/Object;
    //   354: checkcast java/lang/StringBuilder
    //   357: astore #13
    //   359: iload #4
    //   361: ifeq -> 379
    //   364: aload #14
    //   366: invokeinterface peek : ()Ljava/lang/Object;
    //   371: checkcast java/util/Set
    //   374: astore #12
    //   376: goto -> 379
    //   379: aload #16
    //   381: aload_1
    //   382: aload #13
    //   384: aload_3
    //   385: aload #12
    //   387: iload #11
    //   389: invokevirtual a : (Lnet/time4j/d1/o;Ljava/lang/Appendable;Lnet/time4j/d1/d;Ljava/util/Set;Z)I
    //   392: istore #6
    //   394: aconst_null
    //   395: astore #13
    //   397: goto -> 410
    //   400: astore #13
    //   402: goto -> 407
    //   405: astore #13
    //   407: iconst_m1
    //   408: istore #6
    //   410: iload #6
    //   412: iconst_m1
    //   413: if_icmpne -> 704
    //   416: aload #16
    //   418: invokevirtual c : ()I
    //   421: istore #8
    //   423: aload #16
    //   425: invokevirtual e : ()Z
    //   428: ifne -> 490
    //   431: iload #5
    //   433: iconst_1
    //   434: iadd
    //   435: istore #6
    //   437: iload #6
    //   439: iload #10
    //   441: if_icmpge -> 490
    //   444: aload_0
    //   445: getfield d : Ljava/util/List;
    //   448: iload #6
    //   450: invokeinterface get : (I)Ljava/lang/Object;
    //   455: checkcast net/time4j/e1/a0/i
    //   458: astore #17
    //   460: aload #17
    //   462: invokevirtual e : ()Z
    //   465: ifeq -> 481
    //   468: aload #17
    //   470: invokevirtual c : ()I
    //   473: iload #8
    //   475: if_icmpne -> 481
    //   478: goto -> 494
    //   481: iload #6
    //   483: iconst_1
    //   484: iadd
    //   485: istore #6
    //   487: goto -> 437
    //   490: iload #5
    //   492: istore #6
    //   494: iload #6
    //   496: iload #5
    //   498: if_icmpgt -> 587
    //   501: aload #16
    //   503: invokevirtual e : ()Z
    //   506: ifeq -> 512
    //   509: goto -> 587
    //   512: aload #13
    //   514: ifnonnull -> 551
    //   517: new java/lang/StringBuilder
    //   520: dup
    //   521: invokespecial <init> : ()V
    //   524: astore_2
    //   525: aload_2
    //   526: ldc_w 'Not formattable: '
    //   529: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   532: pop
    //   533: aload_2
    //   534: aload_1
    //   535: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   538: pop
    //   539: new java/lang/IllegalArgumentException
    //   542: dup
    //   543: aload_2
    //   544: invokevirtual toString : ()Ljava/lang/String;
    //   547: invokespecial <init> : (Ljava/lang/String;)V
    //   550: athrow
    //   551: new java/lang/StringBuilder
    //   554: dup
    //   555: invokespecial <init> : ()V
    //   558: astore_2
    //   559: aload_2
    //   560: ldc_w 'Not formattable: '
    //   563: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   566: pop
    //   567: aload_2
    //   568: aload_1
    //   569: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   572: pop
    //   573: new java/lang/IllegalArgumentException
    //   576: dup
    //   577: aload_2
    //   578: invokevirtual toString : ()Ljava/lang/String;
    //   581: aload #13
    //   583: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   586: athrow
    //   587: aload #15
    //   589: invokeinterface pop : ()Ljava/lang/Object;
    //   594: pop
    //   595: new java/lang/StringBuilder
    //   598: dup
    //   599: invokespecial <init> : ()V
    //   602: astore #13
    //   604: aload #15
    //   606: invokeinterface isEmpty : ()Z
    //   611: ifne -> 630
    //   614: aload #13
    //   616: aload #15
    //   618: invokeinterface peek : ()Ljava/lang/Object;
    //   623: checkcast java/lang/CharSequence
    //   626: invokevirtual append : (Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;
    //   629: pop
    //   630: aload #15
    //   632: aload #13
    //   634: invokeinterface push : (Ljava/lang/Object;)V
    //   639: iload #4
    //   641: ifeq -> 701
    //   644: aload #14
    //   646: invokeinterface pop : ()Ljava/lang/Object;
    //   651: pop
    //   652: new java/util/LinkedHashSet
    //   655: dup
    //   656: invokespecial <init> : ()V
    //   659: astore #13
    //   661: aload #14
    //   663: invokeinterface isEmpty : ()Z
    //   668: ifne -> 689
    //   671: aload #13
    //   673: aload #14
    //   675: invokeinterface peek : ()Ljava/lang/Object;
    //   680: checkcast java/util/Collection
    //   683: invokeinterface addAll : (Ljava/util/Collection;)Z
    //   688: pop
    //   689: aload #14
    //   691: aload #13
    //   693: invokeinterface push : (Ljava/lang/Object;)V
    //   698: goto -> 726
    //   701: goto -> 726
    //   704: aload #16
    //   706: invokevirtual e : ()Z
    //   709: ifeq -> 722
    //   712: aload #16
    //   714: invokevirtual g : ()I
    //   717: istore #6
    //   719: goto -> 726
    //   722: iload #5
    //   724: istore #6
    //   726: iload #6
    //   728: iconst_1
    //   729: iadd
    //   730: istore #5
    //   732: iload #7
    //   734: istore #8
    //   736: goto -> 131
    //   739: aload #15
    //   741: invokeinterface peek : ()Ljava/lang/Object;
    //   746: checkcast java/lang/StringBuilder
    //   749: astore_1
    //   750: aload #15
    //   752: invokeinterface clear : ()V
    //   757: aload_2
    //   758: aload_1
    //   759: invokeinterface append : (Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    //   764: pop
    //   765: aload #12
    //   767: astore #13
    //   769: iload #4
    //   771: ifeq -> 899
    //   774: aload #14
    //   776: invokeinterface peek : ()Ljava/lang/Object;
    //   781: checkcast java/util/Set
    //   784: astore #13
    //   786: aload #14
    //   788: invokeinterface clear : ()V
    //   793: goto -> 899
    //   796: iconst_0
    //   797: istore #5
    //   799: aload #12
    //   801: astore #13
    //   803: iload #5
    //   805: iload #10
    //   807: if_icmpge -> 899
    //   810: aload_0
    //   811: getfield d : Ljava/util/List;
    //   814: iload #5
    //   816: invokeinterface get : (I)Ljava/lang/Object;
    //   821: checkcast net/time4j/e1/a0/i
    //   824: astore #13
    //   826: aload #13
    //   828: aload_1
    //   829: aload_2
    //   830: aload_3
    //   831: aload #12
    //   833: iload #11
    //   835: invokevirtual a : (Lnet/time4j/d1/o;Ljava/lang/Appendable;Lnet/time4j/d1/d;Ljava/util/Set;Z)I
    //   838: pop
    //   839: aload #13
    //   841: invokevirtual e : ()Z
    //   844: ifeq -> 854
    //   847: aload #13
    //   849: invokevirtual g : ()I
    //   852: istore #5
    //   854: iload #5
    //   856: iconst_1
    //   857: iadd
    //   858: istore #5
    //   860: goto -> 799
    //   863: astore_2
    //   864: new java/lang/StringBuilder
    //   867: dup
    //   868: invokespecial <init> : ()V
    //   871: astore_3
    //   872: aload_3
    //   873: ldc_w 'Not formattable: '
    //   876: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   879: pop
    //   880: aload_3
    //   881: aload_1
    //   882: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   885: pop
    //   886: new java/lang/IllegalArgumentException
    //   889: dup
    //   890: aload_3
    //   891: invokevirtual toString : ()Ljava/lang/String;
    //   894: aload_2
    //   895: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   898: athrow
    //   899: iload #4
    //   901: ifeq -> 910
    //   904: aload #13
    //   906: invokestatic unmodifiableSet : (Ljava/util/Set;)Ljava/util/Set;
    //   909: areturn
    //   910: aconst_null
    //   911: areturn
    //   912: new java/lang/NullPointerException
    //   915: dup
    //   916: ldc_w 'Missing text result buffer.'
    //   919: invokespecial <init> : (Ljava/lang/String;)V
    //   922: astore_1
    //   923: goto -> 928
    //   926: aload_1
    //   927: athrow
    //   928: goto -> 926
    // Exception table:
    //   from	to	target	type
    //   379	394	405	net/time4j/d1/r
    //   379	394	400	java/lang/IllegalArgumentException
    //   810	839	863	net/time4j/d1/r
    //   839	854	863	net/time4j/d1/r
  }
  
  public net.time4j.d1.d a() {
    return this.c;
  }
  
  c<T> a(Map<p<?>, Object> paramMap, b paramb) {
    paramb = b.a(paramb, this.c);
    return new c(new c(this, paramMap), paramb, paramb.<net.time4j.history.d>a(net.time4j.history.q.a.a, (net.time4j.history.d)null));
  }
  
  public <A extends Enum<A>> c<T> a(net.time4j.d1.c<A> paramc, A paramA) {
    net.time4j.e1.a.b b1 = new net.time4j.e1.a.b();
    b1.a(this.c.a());
    b1.a(paramc, (Enum)paramA);
    return new c(this, b1.a());
  }
  
  public c<T> a(g paramg) {
    return a(net.time4j.e1.a.f, paramg);
  }
  
  public c<T> a(k paramk) {
    return a(l.a(paramk));
  }
  
  public c<T> a(l paraml) {
    if (paraml != null) {
      net.time4j.e1.a.b b1 = new net.time4j.e1.a.b();
      b1.a(this.c.a());
      b1.a(paraml.d());
      net.time4j.e1.a a = b1.a();
      return new c(this, this.c.a(a).b(net.time4j.e1.a.e, paraml.e()));
    } 
    throw new NullPointerException("Missing timezone id.");
  }
  
  public String b(T paramT) {
    return a(a(paramT, this.c));
  }
  
  b b() {
    return this.c;
  }
  
  public x<T> c() {
    return this.a;
  }
  
  Map<p<?>, Object> d() {
    return this.e;
  }
  
  public Locale e() {
    return this.c.d();
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof c) {
      paramObject = paramObject;
      return (this.a.equals(((c)paramObject).a) && a(this.b, ((c)paramObject).b) && this.c.equals(((c)paramObject).c) && this.e.equals(((c)paramObject).e) && this.d.equals(((c)paramObject).d));
    } 
    return false;
  }
  
  boolean f() {
    return (this.p == 1 && !this.g);
  }
  
  public int hashCode() {
    return this.a.hashCode() * 7 + this.c.hashCode() * 31 + this.d.hashCode() * 37;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder(256);
    stringBuilder.append("net.time4j.format.ChronoFormatter[chronology=");
    stringBuilder.append(this.a.e().getName());
    if (this.b != null) {
      stringBuilder.append(", override=");
      stringBuilder.append(this.b);
    } 
    stringBuilder.append(", default-attributes=");
    stringBuilder.append(this.c);
    stringBuilder.append(", default-values=");
    stringBuilder.append(this.e);
    stringBuilder.append(", processors=");
    boolean bool = true;
    for (i i : this.d) {
      byte b1;
      if (bool) {
        bool = false;
        b1 = 123;
      } else {
        b1 = 124;
      } 
      stringBuilder.append(b1);
      stringBuilder.append(i);
    } 
    stringBuilder.append("}]");
    return stringBuilder.toString();
  }
  
  static final class a implements e<k> {
    public <R> R a(k param1k, Appendable param1Appendable, net.time4j.d1.d param1d, t<o, R> param1t) {
      return null;
    }
  }
  
  static final class b implements d<k> {
    b(Map param1Map) {}
    
    public k a(CharSequence param1CharSequence, s param1s, net.time4j.d1.d param1d) {
      int i = param1s.f();
      int j = i + 3;
      if (j <= param1CharSequence.length()) {
        param1CharSequence = param1CharSequence.subSequence(i, j).toString();
        k k = (k)this.a.get(param1CharSequence);
        if (k != null) {
          param1s.a(j);
          return k;
        } 
        param1s.a(i, "No time zone information found.");
      } 
      return null;
    }
  }
  
  public static final class d<T> {
    private static final net.time4j.d1.c<k> n = net.time4j.e1.a.a("CUSTOM_DAY_PERIOD", k.class);
    
    private final x<T> a;
    
    private final x<?> b;
    
    private final Locale c;
    
    private List<i> d;
    
    private LinkedList<b> e;
    
    private int f;
    
    private int g;
    
    private int h;
    
    private String i;
    
    private k j;
    
    private Map<p<?>, Object> k;
    
    private x<?> l;
    
    private int m;
    
    private d(x<T> param1x, Locale param1Locale) {
      this(param1x, param1Locale, (x<?>)null);
    }
    
    private d(x<T> param1x, Locale param1Locale, x<?> param1x1) {
      if (param1x != null) {
        if (param1Locale != null) {
          this.a = param1x;
          this.b = param1x1;
          this.c = param1Locale;
          this.d = new ArrayList<i>();
          this.e = new LinkedList<b>();
          this.f = 0;
          this.g = -1;
          this.h = 0;
          this.i = null;
          this.j = null;
          this.k = new HashMap<p<?>, Object>();
          this.l = param1x;
          this.m = 0;
          return;
        } 
        throw new NullPointerException("Missing locale.");
      } 
      throw new NullPointerException("Missing chronology.");
    }
    
    private static int a(b param1b) {
      return (param1b == null) ? 0 : param1b.c();
    }
    
    private <V> d<T> a(p<V> param1p, boolean param1Boolean, int param1Int1, int param1Int2, x param1x) {
      a(param1p, param1Boolean, param1Int1, param1Int2, param1x, false);
      return this;
    }
    
    private <V> d<T> a(p<V> param1p, boolean param1Boolean1, int param1Int1, int param1Int2, x param1x, boolean param1Boolean2) {
      i i1;
      d(param1p);
      i i2 = c(param1p);
      r<V> r = new r<V>(param1p, param1Boolean1, param1Int1, param1Int2, param1x, param1Boolean2);
      if (param1Boolean1) {
        param1Int2 = this.g;
        if (param1Int2 == -1) {
          a(r);
          return this;
        } 
        i i = this.d.get(param1Int2);
        a(r);
        List<i> list = this.d;
        i1 = list.get(list.size() - 1);
        if (i.c() == i1.c()) {
          this.g = param1Int2;
          this.d.set(param1Int2, i.b(param1Int1));
          return this;
        } 
      } else {
        if (i2 == null || !i2.f() || i2.e()) {
          a((h<?>)i1);
          this.g = this.d.size() - 1;
          return this;
        } 
        throw new IllegalStateException("Numerical element with variable width can't be inserted after another numerical element. Consider \"addFixedXXX()\" instead.");
      } 
      return this;
    }
    
    private u<?> a(boolean param1Boolean, k param1k) {
      b b;
      net.time4j.e1.a a2 = (new net.time4j.e1.a.b(j())).a();
      net.time4j.e1.a a1 = a2;
      if (param1k != null) {
        if (this.e.isEmpty()) {
          b = new b(a2, this.c);
        } else {
          b = this.e.getLast();
        } 
        b = b.b(n, param1k);
      } 
      Iterator<s> iterator = g0.C().f().iterator();
      while (iterator.hasNext()) {
        for (p<?> p : (Iterable<p<?>>)((s)iterator.next()).a(this.c, b)) {
          if ((param1Boolean && p.a() == 'b' && e(p)) || (!param1Boolean && p.a() == 'B' && e(p))) {
            c.c(p);
            return (u)p;
          } 
        } 
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Day periods are not supported: ");
      stringBuilder.append(j().e());
      IllegalStateException illegalStateException = new IllegalStateException(stringBuilder.toString());
      throw illegalStateException;
    }
    
    private void a(StringBuilder param1StringBuilder) {
      if (param1StringBuilder.length() > 0) {
        a(param1StringBuilder.toString());
        param1StringBuilder.setLength(0);
      } 
    }
    
    private static void a(net.time4j.d1.c<?> param1c) {
      if (param1c.name().charAt(0) != '_')
        return; 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Internal attribute not allowed: ");
      stringBuilder.append(param1c.name());
      throw new IllegalArgumentException(stringBuilder.toString());
    }
    
    private void a(h<?> param1h) {
      boolean bool;
      this.g = -1;
      if (!this.e.isEmpty()) {
        i2 = (i)this.e.getLast();
        i = i2.c();
        bool = i2.e();
      } else {
        i2 = null;
        i = 0;
        bool = false;
      } 
      i i2 = new i(param1h, i, bool, (b)i2);
      int i = this.h;
      i i1 = i2;
      if (i > 0) {
        i1 = i2.a(i, 0);
        this.h = 0;
      } 
      this.d.add(i1);
    }
    
    private void a(boolean param1Boolean1, boolean param1Boolean2) {
      n();
      if (!param1Boolean1 && !param1Boolean2) {
        if (this.g == -1)
          return; 
        throw new IllegalArgumentException("Cannot add fractional element with variable width after another numerical element with variable width.");
      } 
    }
    
    private static boolean b(char param1Char) {
      return ((param1Char >= 'A' && param1Char <= 'Z') || (param1Char >= 'a' && param1Char <= 'z'));
    }
    
    private static boolean b(x<?> param1x) {
      while (true) {
        if (net.time4j.c1.f.class.isAssignableFrom(param1x.e()))
          return true; 
        x<?> x1 = param1x.b();
        param1x = x1;
        if (x1 == null)
          return false; 
      } 
    }
    
    private i c(p<?> param1p) {
      i i;
      StringBuilder stringBuilder;
      if (this.d.isEmpty()) {
        i = null;
      } else {
        List<i> list = this.d;
        i = list.get(list.size() - 1);
      } 
      if (i == null)
        return null; 
      if (i.d()) {
        if (i.e())
          return i; 
        stringBuilder = new StringBuilder();
        stringBuilder.append(param1p.name());
        stringBuilder.append(" can't be inserted after an element");
        stringBuilder.append(" with decimal digits.");
        throw new IllegalStateException(stringBuilder.toString());
      } 
      return (i)stringBuilder;
    }
    
    private void d(p<?> param1p) {
      x<?> x1 = c.a(this.a, this.b, param1p);
      int i = c.a(x1, this.a, this.b);
      if (i >= this.m) {
        this.l = x1;
        this.m = i;
      } 
    }
    
    private boolean e(p<?> param1p) {
      if (!param1p.name().endsWith("_DAY_PERIOD"))
        return false; 
      if (this.b == null && !this.a.d(param1p)) {
        x<T> x1 = this.a;
        while (true) {
          x<T> x2 = x1.b();
          if (x2 != null) {
            x1 = x2;
            if (x2.d(param1p))
              return true; 
            continue;
          } 
          return false;
        } 
      } 
      return true;
    }
    
    private void m() {
      if (b(this.a))
        return; 
      throw new IllegalStateException("Timezone names in specific non-location format can only be reliably combined with instant-like types, for example \"Moment\".");
    }
    
    private void n() {
      int i = this.d.size() - 1;
      while (i >= 0) {
        i i1 = this.d.get(i);
        if (i1.e())
          return; 
        if (!i1.d()) {
          i--;
          continue;
        } 
        throw new IllegalArgumentException("Cannot define more than one element with decimal digits.");
      } 
    }
    
    private void o() {
      this.h = 0;
    }
    
    public d<T> a() {
      a(a(false, (k)null));
      return this;
    }
    
    public d<T> a(char param1Char) {
      a(String.valueOf(param1Char));
      return this;
    }
    
    public d<T> a(char param1Char1, char param1Char2) {
      a(new m(param1Char1, param1Char2));
      return this;
    }
    
    public d<T> a(String param1String) {
      List<i> list;
      m m = new m(param1String);
      int i = m.c();
      if (i > 0) {
        i i1;
        if (this.d.isEmpty()) {
          param1String = null;
        } else {
          List<i> list1 = this.d;
          i1 = list1.get(list1.size() - 1);
        } 
        if (i1 != null && i1.d() && !i1.e())
          throw new IllegalStateException("Numerical literal can't be inserted after an element with decimal digits."); 
      } 
      if (i != 0) {
        int j = this.g;
        if (j == -1) {
          a(m);
          return this;
        } 
        i i1 = this.d.get(j);
        a(m);
        int n = i1.c();
        list = this.d;
        if (n == ((i)list.get(list.size() - 1)).c()) {
          this.g = j;
          this.d.set(j, i1.b(i));
          return this;
        } 
        return this;
      } 
      a((h<?>)list);
      return this;
    }
    
    public d<T> a(String param1String, w param1w) {
      if (param1w != null) {
        Map<?, ?> map = Collections.emptyMap();
        int j = param1String.length();
        Locale locale = this.c;
        StringBuilder stringBuilder = new StringBuilder();
        if (!this.e.isEmpty())
          locale = ((b)this.e.getLast()).d(); 
        boolean bool = false;
        int i;
        for (i = 0; i < j; i++) {
          int m;
          char c1 = param1String.charAt(i);
          if (b(c1)) {
            a(stringBuilder);
            for (m = i + 1; m < j && param1String.charAt(m) == c1; m++);
            Map<p<?>, p<?>> map1 = param1w.a(this, locale, c1, m - i);
            if (!map1.isEmpty())
              if (map.isEmpty()) {
                map = map1;
              } else {
                map = new HashMap<Object, Object>(map);
                map.putAll(map1);
              }  
            i = m - 1;
          } else if (c1 == '\'') {
            a(stringBuilder);
            int n = i + 1;
            for (i = n; i < j; i = m + 1) {
              m = i;
              if (param1String.charAt(i) == '\'') {
                m = i + 1;
                if (m < j && param1String.charAt(m) == '\'')
                  continue; 
                break;
              } 
              continue;
            } 
            if (i < j) {
              if (n == i) {
                a('\'');
              } else {
                a(param1String.substring(n, i).replace("''", "'"));
              } 
            } else {
              StringBuilder stringBuilder1 = new StringBuilder();
              stringBuilder1.append("String literal in pattern not closed: ");
              stringBuilder1.append(param1String);
              throw new IllegalArgumentException(stringBuilder1.toString());
            } 
          } else if (c1 == '[') {
            a(stringBuilder);
            l();
          } else if (c1 == ']') {
            a(stringBuilder);
            i();
          } else if (c1 == '|') {
            try {
              a(stringBuilder);
              k();
            } catch (IllegalStateException illegalStateException) {
              throw new IllegalArgumentException(illegalStateException);
            } 
          } else if (c1 != '#' && c1 != '{' && c1 != '}') {
            stringBuilder.append(c1);
          } else {
            StringBuilder stringBuilder1 = new StringBuilder();
            stringBuilder1.append("Pattern contains reserved character: '");
            stringBuilder1.append(c1);
            stringBuilder1.append("'");
            throw new IllegalArgumentException(stringBuilder1.toString());
          } 
        } 
        a(stringBuilder);
        if (!map.isEmpty()) {
          int m = this.d.size();
          for (i = bool; i < m; i++) {
            i i1 = this.d.get(i);
            p<?> p = i1.b().b();
            if (map.containsKey(p)) {
              p = (p)map.get(p);
              this.d.set(i, i1.a(p));
            } 
          } 
        } 
        if (this.i != null)
          param1String = ""; 
        this.i = param1String;
        return this;
      } 
      NullPointerException nullPointerException = new NullPointerException("Missing pattern type.");
      throw nullPointerException;
    }
    
    public d<T> a(net.time4j.d1.c<Character> param1c, char param1Char) {
      b b;
      a(param1c);
      o();
      if (this.e.isEmpty()) {
        net.time4j.e1.a.b b1 = new net.time4j.e1.a.b();
        b1.a(param1c, param1Char);
        b = new b(b1.a(), this.c);
      } else {
        b b1 = this.e.getLast();
        net.time4j.e1.a.b b2 = new net.time4j.e1.a.b();
        b2.a(b1.a());
        b2.a((net.time4j.d1.c)b, param1Char);
        b = b1.a(b2.a());
      } 
      this.e.addLast(b);
      return this;
    }
    
    public d<T> a(net.time4j.d1.c<Integer> param1c, int param1Int) {
      b b;
      a(param1c);
      o();
      if (this.e.isEmpty()) {
        net.time4j.e1.a.b b1 = new net.time4j.e1.a.b();
        b1.a(param1c, param1Int);
        b = new b(b1.a(), this.c);
      } else {
        b b1 = this.e.getLast();
        net.time4j.e1.a.b b2 = new net.time4j.e1.a.b();
        b2.a(b1.a());
        b2.a((net.time4j.d1.c)b, param1Int);
        b = b1.a(b2.a());
      } 
      this.e.addLast(b);
      return this;
    }
    
    public <A extends Enum<A>> d<T> a(net.time4j.d1.c<A> param1c, A param1A) {
      b b;
      a(param1c);
      o();
      if (this.e.isEmpty()) {
        net.time4j.e1.a.b b1 = new net.time4j.e1.a.b();
        b1.a(param1c, (Enum)param1A);
        b = new b(b1.a(), this.c);
      } else {
        b b1 = this.e.getLast();
        net.time4j.e1.a.b b2 = new net.time4j.e1.a.b();
        b2.a(b1.a());
        b2.a((net.time4j.d1.c)b, (Enum)param1A);
        b = b1.a(b2.a());
      } 
      this.e.addLast(b);
      return this;
    }
    
    public d<T> a(n<o> param1n) {
      n<o> n1;
      o();
      net.time4j.e1.a.b b = new net.time4j.e1.a.b();
      boolean bool = this.e.isEmpty();
      b b2 = null;
      if (!bool) {
        b2 = this.e.getLast();
        b.a(b2.a());
        n1 = b2.b();
      } else {
        n1 = null;
      } 
      int i = a(b2);
      int j = this.f + 1;
      this.f = j;
      if (param1n != null) {
        if (n1 != null)
          param1n = new a(this, n1, param1n); 
      } else {
        param1n = n1;
      } 
      b b1 = new b(b.a(), this.c, i + 1, j, param1n);
      this.e.addLast(b1);
      return this;
    }
    
    public d<T> a(n<Character> param1n, int param1Int) {
      a(new y(param1n, param1Int));
      return this;
    }
    
    public <V extends Enum<V>> d<T> a(p<V> param1p) {
      d(param1p);
      if (param1p instanceof u) {
        a(a0.a(u.class.cast(param1p)));
        return this;
      } 
      HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
      for (Enum enum_ : (Enum[])param1p.getType().getEnumConstants())
        hashMap.put(enum_, enum_.toString()); 
      a(new o(param1p, (Map)hashMap));
      return this;
    }
    
    public d<T> a(p<Integer> param1p, int param1Int) {
      a(param1p, true, param1Int, param1Int, x.c);
      return this;
    }
    
    public d<T> a(p<Integer> param1p, int param1Int1, int param1Int2) {
      a(param1p, false, param1Int1, param1Int2, x.c);
      return this;
    }
    
    public d<T> a(p<Integer> param1p, int param1Int1, int param1Int2, x param1x) {
      a(param1p, false, param1Int1, param1Int2, param1x);
      return this;
    }
    
    public d<T> a(p<Integer> param1p, int param1Int1, int param1Int2, boolean param1Boolean) {
      boolean bool;
      i i;
      d(param1p);
      if (!param1Boolean && param1Int1 == param1Int2) {
        bool = true;
      } else {
        bool = false;
      } 
      a(bool, param1Boolean);
      j j = new j(param1p, param1Int1, param1Int2, param1Boolean);
      param1Int2 = this.g;
      if (param1Int2 != -1 && bool) {
        i i1 = this.d.get(param1Int2);
        a(j);
        List<i> list = this.d;
        i = list.get(list.size() - 1);
        if (i1.c() == i.c()) {
          this.g = param1Int2;
          this.d.set(param1Int2, i1.b(param1Int1));
          return this;
        } 
      } else {
        a((h<?>)i);
      } 
      return this;
    }
    
    d<T> a(p<Integer> param1p, int param1Int, boolean param1Boolean) {
      i i;
      if (this.d.isEmpty()) {
        i = null;
      } else {
        List<i> list = this.d;
        i = list.get(list.size() - 1);
      } 
      if (i == null || i.e() || !i.f() || param1Int != 4) {
        boolean bool1 = false;
        byte b1 = 10;
        x x2 = x.d;
        a(param1p, bool1, param1Int, b1, x2, param1Boolean);
        return this;
      } 
      boolean bool = true;
      param1Int = 4;
      byte b = 4;
      x x1 = x.c;
      a(param1p, bool, param1Int, b, x1, param1Boolean);
      return this;
    }
    
    public <V> d<T> a(p<V> param1p, e<V> param1e, d<V> param1d) {
      d(param1p);
      a(new f(param1p, param1e, param1d));
      return this;
    }
    
    public d<T> a(net.time4j.e1.e param1e, boolean param1Boolean, List<String> param1List) {
      a(new e0(param1e, param1Boolean, param1List));
      return this;
    }
    
    public d<T> a(u<?> param1u) {
      d((p<?>)param1u);
      a(a0.a(param1u));
      return this;
    }
    
    public c<T> a(net.time4j.e1.a param1a) {
      // Byte code:
      //   0: aload_0
      //   1: getfield d : Ljava/util/List;
      //   4: invokeinterface size : ()I
      //   9: istore #4
      //   11: aconst_null
      //   12: astore #6
      //   14: iconst_0
      //   15: istore_2
      //   16: iload_2
      //   17: iload #4
      //   19: if_icmpge -> 174
      //   22: aload_0
      //   23: getfield d : Ljava/util/List;
      //   26: iload_2
      //   27: invokeinterface get : (I)Ljava/lang/Object;
      //   32: checkcast net/time4j/e1/a0/i
      //   35: astore #8
      //   37: aload #6
      //   39: astore #7
      //   41: aload #8
      //   43: invokevirtual e : ()Z
      //   46: ifeq -> 163
      //   49: aload #8
      //   51: invokevirtual c : ()I
      //   54: istore #5
      //   56: iload #4
      //   58: iconst_1
      //   59: isub
      //   60: istore_3
      //   61: iload_3
      //   62: iload_2
      //   63: if_icmple -> 139
      //   66: aload_0
      //   67: getfield d : Ljava/util/List;
      //   70: iload_3
      //   71: invokeinterface get : (I)Ljava/lang/Object;
      //   76: checkcast net/time4j/e1/a0/i
      //   79: invokevirtual c : ()I
      //   82: iload #5
      //   84: if_icmpne -> 132
      //   87: aload #6
      //   89: astore #7
      //   91: aload #6
      //   93: ifnonnull -> 105
      //   96: new java/util/HashMap
      //   99: dup
      //   100: invokespecial <init> : ()V
      //   103: astore #7
      //   105: aload #7
      //   107: iload_2
      //   108: invokestatic valueOf : (I)Ljava/lang/Integer;
      //   111: aload #8
      //   113: iload_3
      //   114: invokevirtual a : (I)Lnet/time4j/e1/a0/i;
      //   117: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      //   122: pop
      //   123: iconst_1
      //   124: istore_3
      //   125: aload #7
      //   127: astore #6
      //   129: goto -> 141
      //   132: iload_3
      //   133: iconst_1
      //   134: isub
      //   135: istore_3
      //   136: goto -> 61
      //   139: iconst_0
      //   140: istore_3
      //   141: iload_3
      //   142: ifeq -> 152
      //   145: aload #6
      //   147: astore #7
      //   149: goto -> 163
      //   152: new java/lang/IllegalStateException
      //   155: dup
      //   156: ldc_w 'Missing format processor after or-operator.'
      //   159: invokespecial <init> : (Ljava/lang/String;)V
      //   162: athrow
      //   163: iload_2
      //   164: iconst_1
      //   165: iadd
      //   166: istore_2
      //   167: aload #7
      //   169: astore #6
      //   171: goto -> 16
      //   174: aload #6
      //   176: ifnull -> 242
      //   179: aload #6
      //   181: invokeinterface keySet : ()Ljava/util/Set;
      //   186: invokeinterface iterator : ()Ljava/util/Iterator;
      //   191: astore #7
      //   193: aload #7
      //   195: invokeinterface hasNext : ()Z
      //   200: ifeq -> 242
      //   203: aload #7
      //   205: invokeinterface next : ()Ljava/lang/Object;
      //   210: checkcast java/lang/Integer
      //   213: astore #8
      //   215: aload_0
      //   216: getfield d : Ljava/util/List;
      //   219: aload #8
      //   221: invokevirtual intValue : ()I
      //   224: aload #6
      //   226: aload #8
      //   228: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
      //   233: invokeinterface set : (ILjava/lang/Object;)Ljava/lang/Object;
      //   238: pop
      //   239: goto -> 193
      //   242: new net/time4j/e1/a0/c
      //   245: dup
      //   246: aload_0
      //   247: getfield a : Lnet/time4j/d1/x;
      //   250: aload_0
      //   251: getfield b : Lnet/time4j/d1/x;
      //   254: aload_0
      //   255: getfield c : Ljava/util/Locale;
      //   258: aload_0
      //   259: getfield d : Ljava/util/List;
      //   262: aload_0
      //   263: getfield k : Ljava/util/Map;
      //   266: aload_1
      //   267: aload_0
      //   268: getfield l : Lnet/time4j/d1/x;
      //   271: aconst_null
      //   272: invokespecial <init> : (Lnet/time4j/d1/x;Lnet/time4j/d1/x;Ljava/util/Locale;Ljava/util/List;Ljava/util/Map;Lnet/time4j/e1/a;Lnet/time4j/d1/x;Lnet/time4j/e1/a0/c$a;)V
      //   275: astore #7
      //   277: aload_0
      //   278: getfield j : Lnet/time4j/k;
      //   281: ifnonnull -> 309
      //   284: aload_0
      //   285: getfield i : Ljava/lang/String;
      //   288: astore #6
      //   290: aload #7
      //   292: astore_1
      //   293: aload #6
      //   295: ifnull -> 392
      //   298: aload #7
      //   300: astore_1
      //   301: aload #6
      //   303: invokevirtual isEmpty : ()Z
      //   306: ifne -> 392
      //   309: aload #7
      //   311: invokestatic a : (Lnet/time4j/e1/a0/c;)Lnet/time4j/e1/a0/b;
      //   314: astore #6
      //   316: aload_0
      //   317: getfield i : Ljava/lang/String;
      //   320: astore #8
      //   322: aload #6
      //   324: astore_1
      //   325: aload #8
      //   327: ifnull -> 354
      //   330: aload #6
      //   332: astore_1
      //   333: aload #8
      //   335: invokevirtual isEmpty : ()Z
      //   338: ifne -> 354
      //   341: aload #6
      //   343: getstatic net/time4j/e1/a.x : Lnet/time4j/d1/c;
      //   346: aload_0
      //   347: getfield i : Ljava/lang/String;
      //   350: invokevirtual b : (Lnet/time4j/d1/c;Ljava/lang/Object;)Lnet/time4j/e1/a0/b;
      //   353: astore_1
      //   354: aload_0
      //   355: getfield j : Lnet/time4j/k;
      //   358: astore #8
      //   360: aload_1
      //   361: astore #6
      //   363: aload #8
      //   365: ifnull -> 379
      //   368: aload_1
      //   369: getstatic net/time4j/e1/a0/c$d.n : Lnet/time4j/d1/c;
      //   372: aload #8
      //   374: invokevirtual b : (Lnet/time4j/d1/c;Ljava/lang/Object;)Lnet/time4j/e1/a0/b;
      //   377: astore #6
      //   379: new net/time4j/e1/a0/c
      //   382: dup
      //   383: aload #7
      //   385: aload #6
      //   387: aconst_null
      //   388: invokespecial <init> : (Lnet/time4j/e1/a0/c;Lnet/time4j/e1/a0/b;Lnet/time4j/e1/a0/c$a;)V
      //   391: astore_1
      //   392: aload_1
      //   393: areturn
    }
    
    public d<T> b() {
      a(a(true, (k)null));
      return this;
    }
    
    public d<T> b(p<Integer> param1p) {
      d(param1p);
      c(param1p);
      f0 f0 = new f0(param1p);
      int i = this.g;
      if (i == -1) {
        a(f0);
        this.g = this.d.size() - 1;
        return this;
      } 
      i i1 = this.d.get(i);
      a(net.time4j.e1.a.f, g.c);
      a(f0);
      i();
      List<i> list = this.d;
      i i2 = list.get(list.size() - 1);
      if (i1.c() == i2.c()) {
        this.g = i;
        this.d.set(i, i1.b(2));
      } 
      return this;
    }
    
    public <V extends Enum<V>> d<T> b(p<V> param1p, int param1Int) {
      a(param1p, true, param1Int, param1Int, x.c);
      return this;
    }
    
    public <V extends Enum<V>> d<T> b(p<V> param1p, int param1Int1, int param1Int2) {
      a(param1p, false, param1Int1, param1Int2, x.c);
      return this;
    }
    
    public d<T> b(p<Long> param1p, int param1Int1, int param1Int2, x param1x) {
      a(param1p, false, param1Int1, param1Int2, param1x);
      return this;
    }
    
    public d<T> c() {
      a(new n(false));
      return this;
    }
    
    public d<T> d() {
      m();
      a(new d0(false));
      return this;
    }
    
    public d<T> e() {
      a(new n(true));
      return this;
    }
    
    public d<T> f() {
      m();
      a(new d0(true));
      return this;
    }
    
    public d<T> g() {
      if (b(this.a)) {
        a(c0.c);
        return this;
      } 
      throw new IllegalStateException("Only unix timestamps can have a timezone id.");
    }
    
    public c<T> h() {
      return a(net.time4j.e1.a.a());
    }
    
    public d<T> i() {
      this.e.removeLast();
      o();
      return this;
    }
    
    public x<?> j() {
      x<?> x2 = this.b;
      x<?> x1 = x2;
      if (x2 == null)
        x1 = this.a; 
      return x1;
    }
    
    public d<T> k() {
      byte b1;
      byte b2;
      byte b3;
      i i;
      if (!this.e.isEmpty()) {
        b1 = ((b)this.e.getLast()).e();
      } else {
        b1 = 0;
      } 
      if (!this.d.isEmpty()) {
        b2 = this.d.size() - 1;
        i = this.d.get(b2);
        b3 = i.c();
      } else {
        i = null;
        b2 = -1;
        b3 = -1;
      } 
      if (b1 == b3) {
        this.d.set(b2, i.h());
        o();
        this.g = -1;
        return this;
      } 
      throw new IllegalStateException("Cannot start or-block without any previous step in current section.");
    }
    
    public d<T> l() {
      a((n<o>)null);
      return this;
    }
    
    class a implements n<o> {
      a(c.d this$0, n param2n1, n param2n2) {}
      
      public boolean a(o param2o) {
        return (this.c.b(param2o) && this.d.b(param2o));
      }
    }
  }
  
  class a implements n<o> {
    a(c this$0, n param1n1, n param1n2) {}
    
    public boolean a(o param1o) {
      return (this.c.b(param1o) && this.d.b(param1o));
    }
  }
  
  private static class e<C> implements u<r<C>> {
    private final x<C> c;
    
    private final List<s> d;
    
    private e(x<C> param1x) {
      this.c = param1x;
      ArrayList<? extends s> arrayList = new ArrayList();
      arrayList.addAll(this.c.f());
      arrayList.addAll(g0.C().f());
      this.d = Collections.unmodifiableList(arrayList);
    }
    
    static <C> e<C> a(x<C> param1x) {
      return (param1x == null) ? null : new e<C>(param1x);
    }
    
    public String a(y param1y, Locale param1Locale) {
      throw new UnsupportedOperationException("Not used.");
    }
    
    public f0 a() {
      return this.c.a();
    }
    
    public o a(r<C> param1r, net.time4j.d1.d param1d) {
      throw new UnsupportedOperationException("Not used.");
    }
    
    public r<C> a(q<?> param1q, net.time4j.d1.d param1d, boolean param1Boolean1, boolean param1Boolean2) {
      r<C> r;
      StringBuilder stringBuilder;
      Object object = this.c.a(param1q, param1d, param1Boolean1, param1Boolean2);
      g0 g0 = (g0)g0.C().a(param1q, param1d, param1Boolean1, param1Boolean2);
      if (object instanceof l) {
        r = r.a(l.class.cast(object), g0);
      } else {
        if (object instanceof m) {
          r = r.a(m.class.cast(object), (g0)r);
          c.c(r);
          return r;
        } 
        stringBuilder = new StringBuilder();
        stringBuilder.append("Cannot determine calendar type: ");
        stringBuilder.append(object);
        throw new IllegalStateException(stringBuilder.toString());
      } 
      c.c(stringBuilder);
      return (r<C>)stringBuilder;
    }
    
    public x<?> b() {
      throw new UnsupportedOperationException("Not used.");
    }
    
    public int c() {
      return this.c.c();
    }
    
    public x<?> d() {
      return this.c;
    }
    
    public List<s> e() {
      return this.d;
    }
    
    public boolean equals(Object param1Object) {
      if (this == param1Object)
        return true; 
      if (param1Object instanceof e) {
        param1Object = param1Object;
        return this.c.equals(((e)param1Object).c);
      } 
      return false;
    }
    
    public int hashCode() {
      return this.c.hashCode();
    }
    
    public String toString() {
      return this.c.e().getName();
    }
  }
  
  private static class f implements o, net.time4j.c1.f {
    private final r<?> c;
    
    private final k d;
    
    private f(r<?> param1r, k param1k) {
      this.c = param1r;
      this.d = param1k;
    }
    
    private net.time4j.c1.f e() {
      f0 f0;
      try {
        f0 = x.a(this.c.a().getClass()).a();
      } catch (RuntimeException runtimeException) {
        f0 = f0.a;
      } 
      return (net.time4j.c1.f)this.c.a(l.a(this.d), f0);
    }
    
    public int a() {
      return e().a();
    }
    
    public int a(p<Integer> param1p) {
      return this.c.a(param1p);
    }
    
    public long b() {
      return e().b();
    }
    
    public <V> V b(p<V> param1p) {
      return (V)this.c.b(param1p);
    }
    
    public k c() {
      return this.d;
    }
    
    public boolean c(p<?> param1p) {
      return this.c.c(param1p);
    }
    
    public <V> V d(p<V> param1p) {
      return (V)this.c.d(param1p);
    }
    
    public boolean d() {
      return true;
    }
    
    public <V> V e(p<V> param1p) {
      return (V)this.c.e(param1p);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/e1/a0/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */