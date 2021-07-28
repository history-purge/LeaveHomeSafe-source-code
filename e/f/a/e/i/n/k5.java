package e.f.a.e.i.n;

import java.util.Iterator;
import java.util.List;

final class k5 {
  private static final Class<?> a = d();
  
  private static final a6<?, ?> b = a(false);
  
  private static final a6<?, ?> c = a(true);
  
  private static final a6<?, ?> d = new c6();
  
  static int a(int paramInt, Object paramObject, j5 paramj5) {
    return (paramObject instanceof z3) ? o2.a(paramInt, (z3)paramObject) : o2.b(paramInt, (r4)paramObject, paramj5);
  }
  
  static int a(int paramInt, List<?> paramList) {
    int k = paramList.size();
    int i = 0;
    byte b = 0;
    if (k == 0)
      return 0; 
    int j = o2.e(paramInt) * k;
    paramInt = j;
    if (paramList instanceof b4) {
      paramList = paramList;
      paramInt = j;
      i = b;
      while (true) {
        j = paramInt;
        if (i < k) {
          Object object = paramList.g(i);
          if (object instanceof z1) {
            j = o2.a((z1)object);
          } else {
            j = o2.a((String)object);
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
          if (object instanceof z1) {
            j = o2.a((z1)object);
          } else {
            j = o2.a((String)object);
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
  
  static int a(int paramInt, List<?> paramList, j5 paramj5) {
    int k = paramList.size();
    int j = 0;
    if (k == 0)
      return 0; 
    int i = o2.e(paramInt) * k;
    for (paramInt = j; paramInt < k; paramInt++) {
      Object object = paramList.get(paramInt);
      if (object instanceof z3) {
        j = o2.a((z3)object);
      } else {
        j = o2.a((r4)object, paramj5);
      } 
      i += j;
    } 
    return i;
  }
  
  static int a(int paramInt, List<Long> paramList, boolean paramBoolean) {
    return (paramList.size() == 0) ? 0 : (a(paramList) + paramList.size() * o2.e(paramInt));
  }
  
  static int a(List<Long> paramList) {
    int k = paramList.size();
    int i = 0;
    int j = 0;
    if (k == 0)
      return 0; 
    if (paramList instanceof e4) {
      paramList = paramList;
      int m = 0;
      while (true) {
        i = m;
        if (j < k) {
          m += o2.d(paramList.g(j));
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
          m += o2.d(((Long)paramList.get(j)).longValue());
          j++;
          continue;
        } 
        break;
      } 
    } 
    return i;
  }
  
  public static a6<?, ?> a() {
    return b;
  }
  
  private static a6<?, ?> a(boolean paramBoolean) {
    try {
      return (clazz == null) ? null : clazz.getConstructor(new Class[] { boolean.class }).newInstance(new Object[] { Boolean.valueOf(paramBoolean) });
    } finally {
      Exception exception = null;
    } 
  }
  
  static <UT, UB> UB a(int paramInt1, int paramInt2, UB paramUB, a6<UT, UB> parama6) {
    UB uB = paramUB;
    if (paramUB == null)
      uB = parama6.a(); 
    parama6.a(uB, paramInt1, paramInt2);
    return uB;
  }
  
  static <UT, UB> UB a(int paramInt, List<Integer> paramList, m3 paramm3, UB paramUB, a6<UT, UB> parama6) {
    UB uB;
    if (paramm3 == null)
      return paramUB; 
    if (paramList instanceof java.util.RandomAccess) {
      int k = paramList.size();
      int i = 0;
      int j = 0;
      while (i < k) {
        int m = ((Integer)paramList.get(i)).intValue();
        if (paramm3.f(m)) {
          if (i != j)
            paramList.set(j, Integer.valueOf(m)); 
          j++;
        } else {
          paramUB = a(paramInt, m, paramUB, parama6);
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
          if (!paramm3.f(i)) {
            paramUB = a(paramInt, i, paramUB, parama6);
            iterator.remove();
          } 
          continue;
        } 
        break;
      } 
    } 
    return uB;
  }
  
  public static void a(int paramInt, List<String> paramList, y6 paramy6) {
    if (paramList != null && !paramList.isEmpty())
      paramy6.b(paramInt, paramList); 
  }
  
  public static void a(int paramInt, List<?> paramList, y6 paramy6, j5 paramj5) {
    if (paramList != null && !paramList.isEmpty())
      paramy6.b(paramInt, paramList, paramj5); 
  }
  
  public static void a(int paramInt, List<Double> paramList, y6 paramy6, boolean paramBoolean) {
    if (paramList != null && !paramList.isEmpty())
      paramy6.i(paramInt, paramList, paramBoolean); 
  }
  
  static <T, UT, UB> void a(a6<UT, UB> parama6, T paramT1, T paramT2) {
    parama6.a(paramT1, parama6.c(parama6.a(paramT1), parama6.a(paramT2)));
  }
  
  static <T> void a(o4 paramo4, T paramT1, T paramT2, long paramLong) {
    h6.a(paramT1, paramLong, paramo4.a(h6.f(paramT1, paramLong), h6.f(paramT2, paramLong)));
  }
  
  static <T, FT extends b3<FT>> void a(v2<FT> paramv2, T paramT1, T paramT2) {
    z2<FT> z2 = paramv2.a(paramT2);
    if (!z2.a.isEmpty())
      paramv2.b(paramT1).a(z2); 
  }
  
  public static void a(Class<?> paramClass) {
    if (!h3.class.isAssignableFrom(paramClass)) {
      Class<?> clazz = a;
      if (clazz != null) {
        if (clazz.isAssignableFrom(paramClass))
          return; 
        throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
      } 
    } 
  }
  
  static boolean a(Object paramObject1, Object paramObject2) {
    return (paramObject1 == paramObject2 || (paramObject1 != null && paramObject1.equals(paramObject2)));
  }
  
  static int b(int paramInt, List<z1> paramList) {
    int j = paramList.size();
    int i = 0;
    if (j == 0)
      return 0; 
    j *= o2.e(paramInt);
    paramInt = i;
    i = j;
    while (paramInt < paramList.size()) {
      i += o2.a(paramList.get(paramInt));
      paramInt++;
    } 
    return i;
  }
  
  static int b(int paramInt, List<r4> paramList, j5 paramj5) {
    int k = paramList.size();
    int i = 0;
    if (k == 0)
      return 0; 
    int j = 0;
    while (i < k) {
      j += o2.c(paramInt, paramList.get(i), paramj5);
      i++;
    } 
    return j;
  }
  
  static int b(int paramInt, List<Long> paramList, boolean paramBoolean) {
    int i = paramList.size();
    return (i == 0) ? 0 : (b(paramList) + i * o2.e(paramInt));
  }
  
  static int b(List<Long> paramList) {
    int k = paramList.size();
    int i = 0;
    int j = 0;
    if (k == 0)
      return 0; 
    if (paramList instanceof e4) {
      paramList = paramList;
      int m = 0;
      while (true) {
        i = m;
        if (j < k) {
          m += o2.e(paramList.g(j));
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
          m += o2.e(((Long)paramList.get(j)).longValue());
          j++;
          continue;
        } 
        break;
      } 
    } 
    return i;
  }
  
  public static a6<?, ?> b() {
    return c;
  }
  
  public static void b(int paramInt, List<z1> paramList, y6 paramy6) {
    if (paramList != null && !paramList.isEmpty())
      paramy6.a(paramInt, paramList); 
  }
  
  public static void b(int paramInt, List<?> paramList, y6 paramy6, j5 paramj5) {
    if (paramList != null && !paramList.isEmpty())
      paramy6.a(paramInt, paramList, paramj5); 
  }
  
  public static void b(int paramInt, List<Float> paramList, y6 paramy6, boolean paramBoolean) {
    if (paramList != null && !paramList.isEmpty())
      paramy6.l(paramInt, paramList, paramBoolean); 
  }
  
  static int c(int paramInt, List<Long> paramList, boolean paramBoolean) {
    int i = paramList.size();
    return (i == 0) ? 0 : (c(paramList) + i * o2.e(paramInt));
  }
  
  static int c(List<Long> paramList) {
    int k = paramList.size();
    int i = 0;
    int j = 0;
    if (k == 0)
      return 0; 
    if (paramList instanceof e4) {
      paramList = paramList;
      int m = 0;
      while (true) {
        i = m;
        if (j < k) {
          m += o2.f(paramList.g(j));
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
          m += o2.f(((Long)paramList.get(j)).longValue());
          j++;
          continue;
        } 
        break;
      } 
    } 
    return i;
  }
  
  public static a6<?, ?> c() {
    return d;
  }
  
  public static void c(int paramInt, List<Long> paramList, y6 paramy6, boolean paramBoolean) {
    if (paramList != null && !paramList.isEmpty())
      paramy6.h(paramInt, paramList, paramBoolean); 
  }
  
  static int d(int paramInt, List<Integer> paramList, boolean paramBoolean) {
    int i = paramList.size();
    return (i == 0) ? 0 : (d(paramList) + i * o2.e(paramInt));
  }
  
  static int d(List<Integer> paramList) {
    int k = paramList.size();
    int i = 0;
    int j = 0;
    if (k == 0)
      return 0; 
    if (paramList instanceof j3) {
      paramList = paramList;
      int m = 0;
      while (true) {
        i = m;
        if (j < k) {
          m += o2.k(paramList.g(j));
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
          m += o2.k(((Integer)paramList.get(j)).intValue());
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
  
  public static void d(int paramInt, List<Long> paramList, y6 paramy6, boolean paramBoolean) {
    if (paramList != null && !paramList.isEmpty())
      paramy6.e(paramInt, paramList, paramBoolean); 
  }
  
  static int e(int paramInt, List<Integer> paramList, boolean paramBoolean) {
    int i = paramList.size();
    return (i == 0) ? 0 : (e(paramList) + i * o2.e(paramInt));
  }
  
  static int e(List<Integer> paramList) {
    int k = paramList.size();
    int i = 0;
    int j = 0;
    if (k == 0)
      return 0; 
    if (paramList instanceof j3) {
      paramList = paramList;
      int m = 0;
      while (true) {
        i = m;
        if (j < k) {
          m += o2.f(paramList.g(j));
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
          m += o2.f(((Integer)paramList.get(j)).intValue());
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
  
  public static void e(int paramInt, List<Long> paramList, y6 paramy6, boolean paramBoolean) {
    if (paramList != null && !paramList.isEmpty())
      paramy6.c(paramInt, paramList, paramBoolean); 
  }
  
  static int f(int paramInt, List<Integer> paramList, boolean paramBoolean) {
    int i = paramList.size();
    return (i == 0) ? 0 : (f(paramList) + i * o2.e(paramInt));
  }
  
  static int f(List<Integer> paramList) {
    int k = paramList.size();
    int i = 0;
    int j = 0;
    if (k == 0)
      return 0; 
    if (paramList instanceof j3) {
      paramList = paramList;
      int m = 0;
      while (true) {
        i = m;
        if (j < k) {
          m += o2.g(paramList.g(j));
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
          m += o2.g(((Integer)paramList.get(j)).intValue());
          j++;
          continue;
        } 
        break;
      } 
    } 
    return i;
  }
  
  public static void f(int paramInt, List<Long> paramList, y6 paramy6, boolean paramBoolean) {
    if (paramList != null && !paramList.isEmpty())
      paramy6.a(paramInt, paramList, paramBoolean); 
  }
  
  static int g(int paramInt, List<Integer> paramList, boolean paramBoolean) {
    int i = paramList.size();
    return (i == 0) ? 0 : (g(paramList) + i * o2.e(paramInt));
  }
  
  static int g(List<Integer> paramList) {
    int k = paramList.size();
    int i = 0;
    int j = 0;
    if (k == 0)
      return 0; 
    if (paramList instanceof j3) {
      paramList = paramList;
      int m = 0;
      while (true) {
        i = m;
        if (j < k) {
          m += o2.h(paramList.g(j));
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
          m += o2.h(((Integer)paramList.get(j)).intValue());
          j++;
          continue;
        } 
        break;
      } 
    } 
    return i;
  }
  
  public static void g(int paramInt, List<Long> paramList, y6 paramy6, boolean paramBoolean) {
    if (paramList != null && !paramList.isEmpty())
      paramy6.j(paramInt, paramList, paramBoolean); 
  }
  
  static int h(int paramInt, List<?> paramList, boolean paramBoolean) {
    int i = paramList.size();
    return (i == 0) ? 0 : (i * o2.i(paramInt, 0));
  }
  
  static int h(List<?> paramList) {
    return paramList.size() << 2;
  }
  
  public static void h(int paramInt, List<Integer> paramList, y6 paramy6, boolean paramBoolean) {
    if (paramList != null && !paramList.isEmpty())
      paramy6.d(paramInt, paramList, paramBoolean); 
  }
  
  static int i(int paramInt, List<?> paramList, boolean paramBoolean) {
    int i = paramList.size();
    return (i == 0) ? 0 : (i * o2.g(paramInt, 0L));
  }
  
  static int i(List<?> paramList) {
    return paramList.size() << 3;
  }
  
  public static void i(int paramInt, List<Integer> paramList, y6 paramy6, boolean paramBoolean) {
    if (paramList != null && !paramList.isEmpty())
      paramy6.m(paramInt, paramList, paramBoolean); 
  }
  
  static int j(int paramInt, List<?> paramList, boolean paramBoolean) {
    int i = paramList.size();
    return (i == 0) ? 0 : (i * o2.b(paramInt, true));
  }
  
  static int j(List<?> paramList) {
    return paramList.size();
  }
  
  public static void j(int paramInt, List<Integer> paramList, y6 paramy6, boolean paramBoolean) {
    if (paramList != null && !paramList.isEmpty())
      paramy6.g(paramInt, paramList, paramBoolean); 
  }
  
  public static void k(int paramInt, List<Integer> paramList, y6 paramy6, boolean paramBoolean) {
    if (paramList != null && !paramList.isEmpty())
      paramy6.k(paramInt, paramList, paramBoolean); 
  }
  
  public static void l(int paramInt, List<Integer> paramList, y6 paramy6, boolean paramBoolean) {
    if (paramList != null && !paramList.isEmpty())
      paramy6.n(paramInt, paramList, paramBoolean); 
  }
  
  public static void m(int paramInt, List<Integer> paramList, y6 paramy6, boolean paramBoolean) {
    if (paramList != null && !paramList.isEmpty())
      paramy6.f(paramInt, paramList, paramBoolean); 
  }
  
  public static void n(int paramInt, List<Boolean> paramList, y6 paramy6, boolean paramBoolean) {
    if (paramList != null && !paramList.isEmpty())
      paramy6.b(paramInt, paramList, paramBoolean); 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/n/k5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */