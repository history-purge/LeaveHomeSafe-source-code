package e.f.a.e.i.d;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class w0<FieldDescriptorType extends z0<FieldDescriptorType>> {
  private static final w0 d = new w0(true);
  
  private final e3<FieldDescriptorType, Object> a = e3.b(16);
  
  private boolean b;
  
  private boolean c = false;
  
  private w0() {}
  
  private w0(boolean paramBoolean) {
    h();
  }
  
  static int a(i4 parami4, int paramInt, Object paramObject) {
    int i = m0.e(paramInt);
    paramInt = i;
    if (parami4 == i4.l) {
      h1.a((k2)paramObject);
      paramInt = i << 1;
    } 
    return paramInt + b(parami4, paramObject);
  }
  
  private final Object a(FieldDescriptorType paramFieldDescriptorType) {
    paramFieldDescriptorType = (FieldDescriptorType)this.a.get(paramFieldDescriptorType);
    if (!(paramFieldDescriptorType instanceof o1))
      return paramFieldDescriptorType; 
    o1.c();
    throw null;
  }
  
  private static Object a(Object paramObject) {
    if (paramObject instanceof q2)
      return ((q2)paramObject).r(); 
    if (paramObject instanceof byte[]) {
      paramObject = paramObject;
      byte[] arrayOfByte = new byte[paramObject.length];
      System.arraycopy(paramObject, 0, arrayOfByte, 0, paramObject.length);
      return arrayOfByte;
    } 
    return paramObject;
  }
  
  private static void a(i4 parami4, Object paramObject) {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic a : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4: pop
    //   5: getstatic e/f/a/e/i/d/x0.a : [I
    //   8: aload_0
    //   9: invokevirtual a : ()Le/f/a/e/i/d/n4;
    //   12: invokevirtual ordinal : ()I
    //   15: iaload
    //   16: istore_2
    //   17: iconst_0
    //   18: istore_3
    //   19: iload_2
    //   20: tableswitch default -> 72, 1 -> 168, 2 -> 160, 3 -> 152, 4 -> 144, 5 -> 136, 6 -> 128, 7 -> 111, 8 -> 92, 9 -> 75
    //   72: goto -> 173
    //   75: aload_1
    //   76: instanceof e/f/a/e/i/d/k2
    //   79: ifne -> 106
    //   82: aload_1
    //   83: instanceof e/f/a/e/i/d/o1
    //   86: ifeq -> 173
    //   89: goto -> 106
    //   92: aload_1
    //   93: instanceof java/lang/Integer
    //   96: ifne -> 106
    //   99: aload_1
    //   100: instanceof e/f/a/e/i/d/i1
    //   103: ifeq -> 173
    //   106: iconst_1
    //   107: istore_3
    //   108: goto -> 173
    //   111: aload_1
    //   112: instanceof e/f/a/e/i/d/a0
    //   115: ifne -> 106
    //   118: aload_1
    //   119: instanceof [B
    //   122: ifeq -> 173
    //   125: goto -> 106
    //   128: aload_1
    //   129: instanceof java/lang/String
    //   132: istore_3
    //   133: goto -> 173
    //   136: aload_1
    //   137: instanceof java/lang/Boolean
    //   140: istore_3
    //   141: goto -> 173
    //   144: aload_1
    //   145: instanceof java/lang/Double
    //   148: istore_3
    //   149: goto -> 173
    //   152: aload_1
    //   153: instanceof java/lang/Float
    //   156: istore_3
    //   157: goto -> 173
    //   160: aload_1
    //   161: instanceof java/lang/Long
    //   164: istore_3
    //   165: goto -> 173
    //   168: aload_1
    //   169: instanceof java/lang/Integer
    //   172: istore_3
    //   173: iload_3
    //   174: ifeq -> 178
    //   177: return
    //   178: new java/lang/IllegalArgumentException
    //   181: dup
    //   182: ldc 'Wrong object type used with protocol message reflection.'
    //   184: invokespecial <init> : (Ljava/lang/String;)V
    //   187: astore_0
    //   188: goto -> 193
    //   191: aload_0
    //   192: athrow
    //   193: goto -> 191
  }
  
  private final void a(FieldDescriptorType paramFieldDescriptorType, Object paramObject) {
    if (paramFieldDescriptorType.p()) {
      if (paramObject instanceof List) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll((List)paramObject);
        int j = arrayList.size();
        int i = 0;
        while (i < j) {
          paramObject = arrayList.get(i);
          i++;
          a(paramFieldDescriptorType.j(), paramObject);
        } 
        paramObject = arrayList;
      } else {
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
      } 
    } else {
      a(paramFieldDescriptorType.j(), paramObject);
    } 
    if (paramObject instanceof o1)
      this.c = true; 
    this.a.a(paramFieldDescriptorType, paramObject);
  }
  
  private static boolean a(Map.Entry<FieldDescriptorType, Object> paramEntry) {
    z0 z0 = (z0)paramEntry.getKey();
    if (z0.n() == n4.k) {
      Iterator<k2> iterator;
      boolean bool = z0.p();
      paramEntry = (Map.Entry<FieldDescriptorType, Object>)paramEntry.getValue();
      if (bool) {
        iterator = ((List)paramEntry).iterator();
        while (iterator.hasNext()) {
          if (!((k2)iterator.next()).a())
            return false; 
        } 
      } else if (iterator instanceof k2) {
        if (!((k2)iterator).a())
          return false; 
      } else {
        if (iterator instanceof o1)
          return true; 
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
      } 
    } 
    return true;
  }
  
  private static int b(i4 parami4, Object paramObject) {
    switch (x0.b[parami4.ordinal()]) {
      default:
        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
      case 18:
        return (paramObject instanceof i1) ? m0.k(((i1)paramObject).g()) : m0.k(((Integer)paramObject).intValue());
      case 17:
        return m0.f(((Long)paramObject).longValue());
      case 16:
        return m0.h(((Integer)paramObject).intValue());
      case 15:
        return m0.h(((Long)paramObject).longValue());
      case 14:
        return m0.j(((Integer)paramObject).intValue());
      case 13:
        return m0.g(((Integer)paramObject).intValue());
      case 12:
        return (paramObject instanceof a0) ? m0.a((a0)paramObject) : m0.b((byte[])paramObject);
      case 11:
        return (paramObject instanceof a0) ? m0.a((a0)paramObject) : m0.a((String)paramObject);
      case 10:
        return (paramObject instanceof o1) ? m0.a((o1)paramObject) : m0.a((k2)paramObject);
      case 9:
        return m0.b((k2)paramObject);
      case 8:
        return m0.b(((Boolean)paramObject).booleanValue());
      case 7:
        return m0.i(((Integer)paramObject).intValue());
      case 6:
        return m0.g(((Long)paramObject).longValue());
      case 5:
        return m0.f(((Integer)paramObject).intValue());
      case 4:
        return m0.e(((Long)paramObject).longValue());
      case 3:
        return m0.d(((Long)paramObject).longValue());
      case 2:
        return m0.b(((Float)paramObject).floatValue());
      case 1:
        break;
    } 
    return m0.b(((Double)paramObject).doubleValue());
  }
  
  private static int b(z0<?> paramz0, Object paramObject) {
    i4 i4 = paramz0.j();
    int i = paramz0.g();
    if (paramz0.p()) {
      boolean bool1 = paramz0.h();
      boolean bool = false;
      int j = 0;
      List list = (List)paramObject;
      if (bool1) {
        iterator = list.iterator();
        while (iterator.hasNext())
          j += b(i4, iterator.next()); 
        return m0.e(i) + j + m0.m(j);
      } 
      Iterator iterator = iterator.iterator();
      for (j = bool; iterator.hasNext(); j += a(i4, i, iterator.next()));
      return j;
    } 
    return a(i4, i, paramObject);
  }
  
  private final void b(Map.Entry<FieldDescriptorType, Object> paramEntry) {
    z0 z0 = (z0)paramEntry.getKey();
    object = paramEntry.getValue();
    if (!(object instanceof o1)) {
      if (z0.p()) {
        null = a((FieldDescriptorType)z0);
        Object object1 = null;
        if (null == null)
          object1 = new ArrayList(); 
        for (Object object : object)
          ((List<Object>)object1).add(a(object)); 
        this.a.a((FieldDescriptorType)z0, object1);
        return;
      } 
      if (z0.n() == n4.k) {
        Object object1 = a((FieldDescriptorType)z0);
        if (object1 == null) {
          this.a.a((FieldDescriptorType)z0, a(object));
          return;
        } 
        if (!(object1 instanceof q2)) {
          object1 = z0.a(((k2)object1).d(), (k2)object).t();
          this.a.a((FieldDescriptorType)z0, object1);
          return;
        } 
        z0.a((q2)object1, (q2)object);
        throw null;
      } 
      this.a.a((FieldDescriptorType)z0, a(object));
      return;
    } 
    o1.c();
    throw null;
  }
  
  private static int c(Map.Entry<FieldDescriptorType, Object> paramEntry) {
    z0<?> z0 = (z0)paramEntry.getKey();
    Object object = paramEntry.getValue();
    if (z0.n() == n4.k && !z0.p() && !z0.h()) {
      boolean bool = object instanceof o1;
      int i = ((z0)paramEntry.getKey()).g();
      return bool ? m0.b(i, (o1)object) : m0.d(i, (k2)object);
    } 
    return b(z0, object);
  }
  
  public static <T extends z0<T>> w0<T> i() {
    return d;
  }
  
  final Iterator<Map.Entry<FieldDescriptorType, Object>> a() {
    return this.c ? new r1<FieldDescriptorType>(this.a.d().iterator()) : this.a.d().iterator();
  }
  
  public final void a(w0<FieldDescriptorType> paramw0) {
    for (int i = 0; i < paramw0.a.b(); i++)
      b(paramw0.a.a(i)); 
    Iterator<Map.Entry<FieldDescriptorType, Object>> iterator = paramw0.a.c().iterator();
    while (iterator.hasNext())
      b(iterator.next()); 
  }
  
  final boolean b() {
    return this.a.isEmpty();
  }
  
  public final boolean c() {
    return this.b;
  }
  
  public final boolean d() {
    for (int i = 0; i < this.a.b(); i++) {
      if (!a(this.a.a(i)))
        return false; 
    } 
    Iterator<Map.Entry<FieldDescriptorType, Object>> iterator = this.a.c().iterator();
    while (iterator.hasNext()) {
      if (!a(iterator.next()))
        return false; 
    } 
    return true;
  }
  
  public final Iterator<Map.Entry<FieldDescriptorType, Object>> e() {
    return this.c ? new r1<FieldDescriptorType>(this.a.entrySet().iterator()) : this.a.entrySet().iterator();
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof w0))
      return false; 
    paramObject = paramObject;
    return this.a.equals(((w0)paramObject).a);
  }
  
  public final int f() {
    int j = 0;
    int i = 0;
    while (j < this.a.b()) {
      Map.Entry<FieldDescriptorType, Object> entry = this.a.a(j);
      i += b((z0)entry.getKey(), entry.getValue());
      j++;
    } 
    for (Map.Entry<FieldDescriptorType, Object> entry : this.a.c())
      i += b((z0)entry.getKey(), entry.getValue()); 
    return i;
  }
  
  public final int g() {
    int j = 0;
    int i = 0;
    while (j < this.a.b()) {
      i += c(this.a.a(j));
      j++;
    } 
    Iterator<Map.Entry<FieldDescriptorType, Object>> iterator = this.a.c().iterator();
    while (iterator.hasNext())
      i += c(iterator.next()); 
    return i;
  }
  
  public final void h() {
    if (this.b)
      return; 
    this.a.e();
    this.b = true;
  }
  
  public final int hashCode() {
    return this.a.hashCode();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/d/w0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */