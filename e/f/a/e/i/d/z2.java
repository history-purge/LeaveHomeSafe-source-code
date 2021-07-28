package e.f.a.e.i.d;

import java.lang.reflect.Field;
import java.util.Arrays;

final class z2 {
  private int A;
  
  private int B;
  
  private Field C;
  
  private Object D;
  
  private Object E;
  
  private Object F;
  
  private final a3 a;
  
  private final Object[] b;
  
  private Class<?> c;
  
  private final int d;
  
  private final int e;
  
  private final int f;
  
  private final int g;
  
  private final int h;
  
  private final int i;
  
  private final int j;
  
  private final int k;
  
  private final int l;
  
  private final int m;
  
  private final int[] n;
  
  private int o;
  
  private int p;
  
  private int q;
  
  private int r;
  
  private int s;
  
  private int t;
  
  private int u;
  
  private int v;
  
  private int w;
  
  private int x;
  
  private int y;
  
  private int z;
  
  z2(Class<?> paramClass, String paramString, Object[] paramArrayOfObject) {
    int[] arrayOfInt;
    this.q = Integer.MAX_VALUE;
    this.r = Integer.MIN_VALUE;
    this.s = 0;
    this.t = 0;
    this.u = 0;
    this.v = 0;
    this.w = 0;
    this.c = paramClass;
    this.a = new a3(paramString);
    this.b = paramArrayOfObject;
    this.d = this.a.b();
    this.e = this.a.b();
    int i = this.e;
    paramClass = null;
    if (i == 0) {
      this.f = 0;
      this.g = 0;
      this.h = 0;
      this.i = 0;
      this.j = 0;
      this.l = 0;
      this.k = 0;
      this.m = 0;
      this.n = null;
      return;
    } 
    this.f = this.a.b();
    this.g = this.a.b();
    this.h = this.a.b();
    this.i = this.a.b();
    this.l = this.a.b();
    this.k = this.a.b();
    this.j = this.a.b();
    this.m = this.a.b();
    i = this.a.b();
    if (i != 0)
      arrayOfInt = new int[i]; 
    this.n = arrayOfInt;
    this.o = (this.f << 1) + this.g;
  }
  
  private static Field a(Class<?> paramClass, String paramString) {
    try {
      return paramClass.getDeclaredField(paramString);
    } catch (NoSuchFieldException noSuchFieldException) {
      for (Field field : paramClass.getDeclaredFields()) {
        if (paramString.equals(field.getName()))
          return field; 
      } 
      String str1 = paramClass.getName();
      String str2 = Arrays.toString((Object[])noSuchFieldException);
      StringBuilder stringBuilder = new StringBuilder(String.valueOf(paramString).length() + 40 + String.valueOf(str1).length() + String.valueOf(str2).length());
      stringBuilder.append("Field ");
      stringBuilder.append(paramString);
      stringBuilder.append(" for ");
      stringBuilder.append(str1);
      stringBuilder.append(" not found. Known fields are ");
      stringBuilder.append(str2);
      RuntimeException runtimeException = new RuntimeException(stringBuilder.toString());
      throw runtimeException;
    } 
  }
  
  private final Object p() {
    Object[] arrayOfObject = this.b;
    int i = this.o;
    this.o = i + 1;
    return arrayOfObject[i];
  }
  
  private final boolean q() {
    return ((this.d & 0x1) == 1);
  }
  
  final boolean a() {
    boolean bool1 = this.a.a();
    boolean bool = false;
    if (!bool1)
      return false; 
    this.x = this.a.b();
    this.y = this.a.b();
    this.z = this.y & 0xFF;
    int i = this.x;
    if (i < this.q)
      this.q = i; 
    i = this.x;
    if (i > this.r)
      this.r = i; 
    if (this.z == a1.a0.a()) {
      this.s++;
    } else if (this.z >= a1.u.a() && this.z <= a1.Z.a()) {
      this.t++;
    } 
    this.w++;
    if (d3.a(this.q, this.x, this.w)) {
      this.v = this.x + 1;
      i = this.v - this.q;
    } else {
      i = this.u + 1;
    } 
    this.u = i;
    if ((this.y & 0x400) != 0) {
      i = 1;
    } else {
      i = 0;
    } 
    if (i != 0) {
      int[] arrayOfInt = this.n;
      i = this.p;
      this.p = i + 1;
      arrayOfInt[i] = this.x;
    } 
    this.D = null;
    this.E = null;
    this.F = null;
    if (d()) {
      this.A = this.a.b();
      if (this.z == a1.l.a() + 51 || this.z == a1.t.a() + 51) {
        Object object = p();
        this.D = object;
        return true;
      } 
      if (this.z == a1.o.a() + 51 && q()) {
        this.E = p();
        return true;
      } 
    } else {
      this.C = a(this.c, (String)p());
      if (h())
        this.B = this.a.b(); 
      if (this.z == a1.l.a() || this.z == a1.t.a()) {
        Class<?> clazz = this.C.getType();
        this.D = clazz;
        return true;
      } 
      if (this.z == a1.D.a() || this.z == a1.Z.a()) {
        Object object = p();
        this.D = object;
        return true;
      } 
      if (this.z == a1.o.a() || this.z == a1.G.a() || this.z == a1.U.a()) {
        if (q()) {
          this.E = p();
          return true;
        } 
        return true;
      } 
      if (this.z == a1.a0.a()) {
        this.F = p();
        i = bool;
        if ((this.y & 0x800) != 0)
          i = 1; 
        if (i != 0) {
          this.E = p();
          return true;
        } 
      } 
    } 
    return true;
  }
  
  final int b() {
    return this.x;
  }
  
  final int c() {
    return this.z;
  }
  
  final boolean d() {
    return (this.z > a1.a0.a());
  }
  
  final Field e() {
    int i = this.A << 1;
    Object object = this.b[i];
    if (object instanceof Field)
      return (Field)object; 
    object = a(this.c, (String)object);
    this.b[i] = object;
    return (Field)object;
  }
  
  final Field f() {
    int i = (this.A << 1) + 1;
    Object object = this.b[i];
    if (object instanceof Field)
      return (Field)object; 
    object = a(this.c, (String)object);
    this.b[i] = object;
    return (Field)object;
  }
  
  final Field g() {
    return this.C;
  }
  
  final boolean h() {
    return (q() && this.z <= a1.t.a());
  }
  
  final Field i() {
    int i = (this.f << 1) + this.B / 32;
    Object object = this.b[i];
    if (object instanceof Field)
      return (Field)object; 
    object = a(this.c, (String)object);
    this.b[i] = object;
    return (Field)object;
  }
  
  final int j() {
    return this.B % 32;
  }
  
  final boolean k() {
    return ((this.y & 0x100) != 0);
  }
  
  final boolean l() {
    return ((this.y & 0x200) != 0);
  }
  
  final Object m() {
    return this.D;
  }
  
  final Object n() {
    return this.E;
  }
  
  final Object o() {
    return this.F;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/d/z2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */