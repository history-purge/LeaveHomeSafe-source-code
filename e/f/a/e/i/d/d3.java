package e.f.a.e.i.d;

import java.util.Iterator;
import java.util.List;

final class d3 {
  private static final Class<?> a = d();
  
  private static final t3<?, ?> b = a(false);
  
  private static final t3<?, ?> c = a(true);
  
  private static final t3<?, ?> d = new v3();
  
  static int a(int paramInt, Object paramObject, b3 paramb3) {
    return (paramObject instanceof s1) ? m0.a(paramInt, (s1)paramObject) : m0.b(paramInt, (k2)paramObject, paramb3);
  }
  
  static int a(int paramInt, List<?> paramList) {
    int k = paramList.size();
    int i = 0;
    byte b = 0;
    if (k == 0)
      return 0; 
    int j = m0.e(paramInt) * k;
    paramInt = j;
    if (paramList instanceof u1) {
      paramList = paramList;
      paramInt = j;
      i = b;
      while (true) {
        j = paramInt;
        if (i < k) {
          Object object = paramList.i(i);
          if (object instanceof a0) {
            j = m0.a((a0)object);
          } else {
            j = m0.a((String)object);
          } 
          paramInt += j;
          i++;
          continue;
        } 
        break;
      } 
    } else {
      while (true) {
        j = paramInt;
        if (i < k) {
          Object object = paramList.get(i);
          if (object instanceof a0) {
            j = m0.a((a0)object);
          } else {
            j = m0.a((String)object);
          } 
          paramInt += j;
          i++;
          continue;
        } 
        break;
      } 
    } 
    return j;
  }
  
  static int a(int paramInt, List<?> paramList, b3 paramb3) {
    int k = paramList.size();
    int j = 0;
    if (k == 0)
      return 0; 
    int i = m0.e(paramInt) * k;
    for (paramInt = j; paramInt < k; paramInt++) {
      Object object = paramList.get(paramInt);
      if (object instanceof s1) {
        j = m0.a((s1)object);
      } else {
        j = m0.a((k2)object, paramb3);
      } 
      i += j;
    } 
    return i;
  }
  
  static int a(int paramInt, List<Long> paramList, boolean paramBoolean) {
    return (paramList.size() == 0) ? 0 : (a(paramList) + paramList.size() * m0.e(paramInt));
  }
  
  static int a(List<Long> paramList) {
    int k = paramList.size();
    int i = 0;
    int j = 0;
    if (k == 0)
      return 0; 
    if (paramList instanceof z1) {
      paramList = paramList;
      int m = 0;
      while (true) {
        i = m;
        if (j < k) {
          m += m0.d(paramList.a(j));
          j++;
          continue;
        } 
        break;
      } 
    } else {
      int m = 0;
      j = i;
      while (true) {
        i = m;
        if (j < k) {
          m += m0.d(((Long)paramList.get(j)).longValue());
          j++;
          continue;
        } 
        break;
      } 
    } 
    return i;
  }
  
  public static t3<?, ?> a() {
    return b;
  }
  
  private static t3<?, ?> a(boolean paramBoolean) {
    try {
      return (clazz == null) ? null : clazz.getConstructor(new Class[] { boolean.class }).newInstance(new Object[] { Boolean.valueOf(paramBoolean) });
    } finally {
      Exception exception = null;
    } 
  }
  
  private static <UT, UB> UB a(int paramInt1, int paramInt2, UB paramUB, t3<UT, UB> paramt3) {
    UB uB = paramUB;
    if (paramUB == null)
      uB = paramt3.a(); 
    paramt3.a(uB, paramInt1, paramInt2);
    return uB;
  }
  
  static <UT, UB> UB a(int paramInt, List<Integer> paramList, j1<?> paramj1, UB paramUB, t3<UT, UB> paramt3) {
    UB uB;
    if (paramj1 == null)
      return paramUB; 
    if (paramList instanceof java.util.RandomAccess) {
      int k = paramList.size();
      int i = 0;
      int j = 0;
      while (i < k) {
        int m = ((Integer)paramList.get(i)).intValue();
        if (paramj1.g(m) != null) {
          if (i != j)
            paramList.set(j, Integer.valueOf(m)); 
          j++;
        } else {
          paramUB = a(paramInt, m, paramUB, paramt3);
        } 
        i++;
      } 
      uB = paramUB;
      if (j != k) {
        paramList.subList(j, k).clear();
        return paramUB;
      } 
    } else {
      Iterator<Integer> iterator = paramList.iterator();
      while (true) {
        uB = paramUB;
        if (iterator.hasNext()) {
          int i = ((Integer)iterator.next()).intValue();
          if (paramj1.g(i) == null) {
            paramUB = a(paramInt, i, paramUB, paramt3);
            iterator.remove();
          } 
          continue;
        } 
        break;
      } 
    } 
    return uB;
  }
  
  public static void a(int paramInt, List<String> paramList, o4 paramo4) {
    if (paramList != null && !paramList.isEmpty())
      paramo4.b(paramInt, paramList); 
  }
  
  public static void a(int paramInt, List<?> paramList, o4 paramo4, b3 paramb3) {
    if (paramList != null && !paramList.isEmpty())
      paramo4.b(paramInt, paramList, paramb3); 
  }
  
  public static void a(int paramInt, List<Double> paramList, o4 paramo4, boolean paramBoolean) {
    if (paramList != null && !paramList.isEmpty())
      paramo4.i(paramInt, paramList, paramBoolean); 
  }
  
  static <T> void a(f2 paramf2, T paramT1, T paramT2, long paramLong) {
    a4.a(paramT1, paramLong, paramf2.b(a4.f(paramT1, paramLong), a4.f(paramT2, paramLong)));
  }
  
  static <T, FT extends z0<FT>> void a(s0<FT> params0, T paramT1, T paramT2) {
    w0<FT> w0 = params0.a(paramT2);
    if (!w0.b())
      params0.b(paramT1).a(w0); 
  }
  
  static <T, UT, UB> void a(t3<UT, UB> paramt3, T paramT1, T paramT2) {
    paramt3.a(paramT1, paramt3.c(paramt3.c(paramT1), paramt3.c(paramT2)));
  }
  
  public static void a(Class<?> paramClass) {
    if (!f1.class.isAssignableFrom(paramClass)) {
      Class<?> clazz = a;
      if (clazz != null) {
        if (clazz.isAssignableFrom(paramClass))
          return; 
        throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
      } 
    } 
  }
  
  public static boolean a(int paramInt1, int paramInt2, int paramInt3) {
    if (paramInt2 < 40)
      return true; 
    long l1 = paramInt2;
    long l2 = paramInt1;
    long l3 = paramInt3;
    return (l1 - l2 + 1L + 9L <= 2L * l3 + 3L + (l3 + 3L) * 3L);
  }
  
  static boolean a(Object paramObject1, Object paramObject2) {
    return (paramObject1 == paramObject2 || (paramObject1 != null && paramObject1.equals(paramObject2)));
  }
  
  static int b(int paramInt, List<a0> paramList) {
    int j = paramList.size();
    int i = 0;
    if (j == 0)
      return 0; 
    j *= m0.e(paramInt);
    paramInt = i;
    i = j;
    while (paramInt < paramList.size()) {
      i += m0.a(paramList.get(paramInt));
      paramInt++;
    } 
    return i;
  }
  
  static int b(int paramInt, List<k2> paramList, b3 paramb3) {
    int k = paramList.size();
    int i = 0;
    if (k == 0)
      return 0; 
    int j = 0;
    while (i < k) {
      j += m0.c(paramInt, paramList.get(i), paramb3);
      i++;
    } 
    return j;
  }
  
  static int b(int paramInt, List<Long> paramList, boolean paramBoolean) {
    int i = paramList.size();
    return (i == 0) ? 0 : (b(paramList) + i * m0.e(paramInt));
  }
  
  static int b(List<Long> paramList) {
    int k = paramList.size();
    int i = 0;
    int j = 0;
    if (k == 0)
      return 0; 
    if (paramList instanceof z1) {
      paramList = paramList;
      int m = 0;
      while (true) {
        i = m;
        if (j < k) {
          m += m0.e(paramList.a(j));
          j++;
          continue;
        } 
        break;
      } 
    } else {
      int m = 0;
      j = i;
      while (true) {
        i = m;
        if (j < k) {
          m += m0.e(((Long)paramList.get(j)).longValue());
          j++;
          continue;
        } 
        break;
      } 
    } 
    return i;
  }
  
  public static t3<?, ?> b() {
    return c;
  }
  
  public static void b(int paramInt, List<a0> paramList, o4 paramo4) {
    if (paramList != null && !paramList.isEmpty())
      paramo4.a(paramInt, paramList); 
  }
  
  public static void b(int paramInt, List<?> paramList, o4 paramo4, b3 paramb3) {
    if (paramList != null && !paramList.isEmpty())
      paramo4.a(paramInt, paramList, paramb3); 
  }
  
  public static void b(int paramInt, List<Float> paramList, o4 paramo4, boolean paramBoolean) {
    if (paramList != null && !paramList.isEmpty())
      paramo4.l(paramInt, paramList, paramBoolean); 
  }
  
  static int c(int paramInt, List<Long> paramList, boolean paramBoolean) {
    int i = paramList.size();
    return (i == 0) ? 0 : (c(paramList) + i * m0.e(paramInt));
  }
  
  static int c(List<Long> paramList) {
    int k = paramList.size();
    int i = 0;
    int j = 0;
    if (k == 0)
      return 0; 
    if (paramList instanceof z1) {
      paramList = paramList;
      int m = 0;
      while (true) {
        i = m;
        if (j < k) {
          m += m0.f(paramList.a(j));
          j++;
          continue;
        } 
        break;
      } 
    } else {
      int m = 0;
      j = i;
      while (true) {
        i = m;
        if (j < k) {
          m += m0.f(((Long)paramList.get(j)).longValue());
          j++;
          continue;
        } 
        break;
      } 
    } 
    return i;
  }
  
  public static t3<?, ?> c() {
    return d;
  }
  
  public static void c(int paramInt, List<Long> paramList, o4 paramo4, boolean paramBoolean) {
    if (paramList != null && !paramList.isEmpty())
      paramo4.h(paramInt, paramList, paramBoolean); 
  }
  
  static int d(int paramInt, List<Integer> paramList, boolean paramBoolean) {
    int i = paramList.size();
    return (i == 0) ? 0 : (d(paramList) + i * m0.e(paramInt));
  }
  
  static int d(List<Integer> paramList) {
    int k = paramList.size();
    int i = 0;
    int j = 0;
    if (k == 0)
      return 0; 
    if (paramList instanceof g1) {
      paramList = paramList;
      int m = 0;
      while (true) {
        i = m;
        if (j < k) {
          m += m0.k(paramList.a(j));
          j++;
          continue;
        } 
        break;
      } 
    } else {
      int m = 0;
      j = i;
      while (true) {
        i = m;
        if (j < k) {
          m += m0.k(((Integer)paramList.get(j)).intValue());
          j++;
          continue;
        } 
        break;
      } 
    } 
    return i;
  }
  
  private static Class<?> d() {
    try {
      return Class.forName("com.google.protobuf.GeneratedMessage");
    } finally {
      Exception exception = null;
    } 
  }
  
  public static void d(int paramInt, List<Long> paramList, o4 paramo4, boolean paramBoolean) {
    if (paramList != null && !paramList.isEmpty())
      paramo4.e(paramInt, paramList, paramBoolean); 
  }
  
  static int e(int paramInt, List<Integer> paramList, boolean paramBoolean) {
    int i = paramList.size();
    return (i == 0) ? 0 : (e(paramList) + i * m0.e(paramInt));
  }
  
  static int e(List<Integer> paramList) {
    int k = paramList.size();
    int i = 0;
    int j = 0;
    if (k == 0)
      return 0; 
    if (paramList instanceof g1) {
      paramList = paramList;
      int m = 0;
      while (true) {
        i = m;
        if (j < k) {
          m += m0.f(paramList.a(j));
          j++;
          continue;
        } 
        break;
      } 
    } else {
      int m = 0;
      j = i;
      while (true) {
        i = m;
        if (j < k) {
          m += m0.f(((Integer)paramList.get(j)).intValue());
          j++;
          continue;
        } 
        break;
      } 
    } 
    return i;
  }
  
  private static Class<?> e() {
    try {
      return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
    } finally {
      Exception exception = null;
    } 
  }
  
  public static void e(int paramInt, List<Long> paramList, o4 paramo4, boolean paramBoolean) {
    if (paramList != null && !paramList.isEmpty())
      paramo4.c(paramInt, paramList, paramBoolean); 
  }
  
  static int f(int paramInt, List<Integer> paramList, boolean paramBoolean) {
    int i = paramList.size();
    return (i == 0) ? 0 : (f(paramList) + i * m0.e(paramInt));
  }
  
  static int f(List<Integer> paramList) {
    int k = paramList.size();
    int i = 0;
    int j = 0;
    if (k == 0)
      return 0; 
    if (paramList instanceof g1) {
      paramList = paramList;
      int m = 0;
      while (true) {
        i = m;
        if (j < k) {
          m += m0.g(paramList.a(j));
          j++;
          continue;
        } 
        break;
      } 
    } else {
      int m = 0;
      j = i;
      while (true) {
        i = m;
        if (j < k) {
          m += m0.g(((Integer)paramList.get(j)).intValue());
          j++;
          continue;
        } 
        break;
      } 
    } 
    return i;
  }
  
  public static void f(int paramInt, List<Long> paramList, o4 paramo4, boolean paramBoolean) {
    if (paramList != null && !paramList.isEmpty())
      paramo4.a(paramInt, paramList, paramBoolean); 
  }
  
  static int g(int paramInt, List<Integer> paramList, boolean paramBoolean) {
    int i = paramList.size();
    return (i == 0) ? 0 : (g(paramList) + i * m0.e(paramInt));
  }
  
  static int g(List<Integer> paramList) {
    int k = paramList.size();
    int i = 0;
    int j = 0;
    if (k == 0)
      return 0; 
    if (paramList instanceof g1) {
      paramList = paramList;
      int m = 0;
      while (true) {
        i = m;
        if (j < k) {
          m += m0.h(paramList.a(j));
          j++;
          continue;
        } 
        break;
      } 
    } else {
      int m = 0;
      j = i;
      while (true) {
        i = m;
        if (j < k) {
          m += m0.h(((Integer)paramList.get(j)).intValue());
          j++;
          continue;
        } 
        break;
      } 
    } 
    return i;
  }
  
  public static void g(int paramInt, List<Long> paramList, o4 paramo4, boolean paramBoolean) {
    if (paramList != null && !paramList.isEmpty())
      paramo4.j(paramInt, paramList, paramBoolean); 
  }
  
  static int h(int paramInt, List<?> paramList, boolean paramBoolean) {
    int i = paramList.size();
    return (i == 0) ? 0 : (i * m0.i(paramInt, 0));
  }
  
  static int h(List<?> paramList) {
    return paramList.size() << 2;
  }
  
  public static void h(int paramInt, List<Integer> paramList, o4 paramo4, boolean paramBoolean) {
    if (paramList != null && !paramList.isEmpty())
      paramo4.d(paramInt, paramList, paramBoolean); 
  }
  
  static int i(int paramInt, List<?> paramList, boolean paramBoolean) {
    int i = paramList.size();
    return (i == 0) ? 0 : (i * m0.g(paramInt, 0L));
  }
  
  static int i(List<?> paramList) {
    return paramList.size() << 3;
  }
  
  public static void i(int paramInt, List<Integer> paramList, o4 paramo4, boolean paramBoolean) {
    if (paramList != null && !paramList.isEmpty())
      paramo4.m(paramInt, paramList, paramBoolean); 
  }
  
  static int j(int paramInt, List<?> paramList, boolean paramBoolean) {
    int i = paramList.size();
    return (i == 0) ? 0 : (i * m0.b(paramInt, true));
  }
  
  static int j(List<?> paramList) {
    return paramList.size();
  }
  
  public static void j(int paramInt, List<Integer> paramList, o4 paramo4, boolean paramBoolean) {
    if (paramList != null && !paramList.isEmpty())
      paramo4.g(paramInt, paramList, paramBoolean); 
  }
  
  public static void k(int paramInt, List<Integer> paramList, o4 paramo4, boolean paramBoolean) {
    if (paramList != null && !paramList.isEmpty())
      paramo4.k(paramInt, paramList, paramBoolean); 
  }
  
  public static void l(int paramInt, List<Integer> paramList, o4 paramo4, boolean paramBoolean) {
    if (paramList != null && !paramList.isEmpty())
      paramo4.n(paramInt, paramList, paramBoolean); 
  }
  
  public static void m(int paramInt, List<Integer> paramList, o4 paramo4, boolean paramBoolean) {
    if (paramList != null && !paramList.isEmpty())
      paramo4.f(paramInt, paramList, paramBoolean); 
  }
  
  public static void n(int paramInt, List<Boolean> paramList, o4 paramo4, boolean paramBoolean) {
    if (paramList != null && !paramList.isEmpty())
      paramo4.b(paramInt, paramList, paramBoolean); 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/d/d3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */