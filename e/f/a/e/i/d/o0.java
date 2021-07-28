package e.f.a.e.i.d;

import java.util.List;

final class o0 implements o4 {
  private final m0 a;
  
  private o0(m0 paramm0) {
    h1.a(paramm0, "output");
    this.a = paramm0;
    this.a.a = this;
  }
  
  public static o0 a(m0 paramm0) {
    o0 o01 = paramm0.a;
    return (o01 != null) ? o01 : new o0(paramm0);
  }
  
  public final int a() {
    return f1.e.k;
  }
  
  public final void a(int paramInt) {
    this.a.a(paramInt, 3);
  }
  
  public final void a(int paramInt, double paramDouble) {
    this.a.a(paramInt, paramDouble);
  }
  
  public final void a(int paramInt, float paramFloat) {
    this.a.a(paramInt, paramFloat);
  }
  
  public final void a(int paramInt, long paramLong) {
    this.a.b(paramInt, paramLong);
  }
  
  public final void a(int paramInt, a0 parama0) {
    this.a.a(paramInt, parama0);
  }
  
  public final void a(int paramInt, Object paramObject) {
    if (paramObject instanceof a0) {
      this.a.b(paramInt, (a0)paramObject);
      return;
    } 
    this.a.b(paramInt, (k2)paramObject);
  }
  
  public final void a(int paramInt, Object paramObject, b3 paramb3) {
    this.a.a(paramInt, (k2)paramObject, paramb3);
  }
  
  public final void a(int paramInt, String paramString) {
    this.a.a(paramInt, paramString);
  }
  
  public final void a(int paramInt, List<a0> paramList) {
    for (int i = 0; i < paramList.size(); i++)
      this.a.a(paramInt, paramList.get(i)); 
  }
  
  public final void a(int paramInt, List<?> paramList, b3 paramb3) {
    int i;
    for (i = 0; i < paramList.size(); i++)
      b(paramInt, paramList.get(i), paramb3); 
  }
  
  public final void a(int paramInt, List<Long> paramList, boolean paramBoolean) {
    int i = 0;
    boolean bool = false;
    if (paramBoolean) {
      this.a.a(paramInt, 2);
      paramInt = 0;
      i = 0;
      while (paramInt < paramList.size()) {
        i += m0.g(((Long)paramList.get(paramInt)).longValue());
        paramInt++;
      } 
      this.a.b(i);
      for (paramInt = bool; paramInt < paramList.size(); paramInt++)
        this.a.c(((Long)paramList.get(paramInt)).longValue()); 
      return;
    } 
    while (i < paramList.size()) {
      this.a.c(paramInt, ((Long)paramList.get(i)).longValue());
      i++;
    } 
  }
  
  public final void a(int paramInt, boolean paramBoolean) {
    this.a.a(paramInt, paramBoolean);
  }
  
  public final void b(int paramInt) {
    this.a.a(paramInt, 4);
  }
  
  public final void b(int paramInt1, int paramInt2) {
    this.a.e(paramInt1, paramInt2);
  }
  
  public final void b(int paramInt, long paramLong) {
    this.a.c(paramInt, paramLong);
  }
  
  public final void b(int paramInt, Object paramObject, b3<Object> paramb3) {
    m0 m01 = this.a;
    paramObject = paramObject;
    m01.a(paramInt, 3);
    paramb3.a(paramObject, m01.a);
    m01.a(paramInt, 4);
  }
  
  public final void b(int paramInt, List<String> paramList) {
    boolean bool = paramList instanceof u1;
    int i = 0;
    byte b = 0;
    if (bool) {
      u1 u1 = (u1)paramList;
      for (i = b; i < paramList.size(); i++) {
        Object object = u1.i(i);
        if (object instanceof String) {
          this.a.a(paramInt, (String)object);
        } else {
          this.a.a(paramInt, (a0)object);
        } 
      } 
      return;
    } 
    while (i < paramList.size()) {
      this.a.a(paramInt, paramList.get(i));
      i++;
    } 
  }
  
  public final void b(int paramInt, List<?> paramList, b3 paramb3) {
    int i;
    for (i = 0; i < paramList.size(); i++)
      a(paramInt, paramList.get(i), paramb3); 
  }
  
  public final void b(int paramInt, List<Boolean> paramList, boolean paramBoolean) {
    int i = 0;
    boolean bool = false;
    if (paramBoolean) {
      this.a.a(paramInt, 2);
      paramInt = 0;
      i = 0;
      while (paramInt < paramList.size()) {
        i += m0.b(((Boolean)paramList.get(paramInt)).booleanValue());
        paramInt++;
      } 
      this.a.b(i);
      for (paramInt = bool; paramInt < paramList.size(); paramInt++)
        this.a.a(((Boolean)paramList.get(paramInt)).booleanValue()); 
      return;
    } 
    while (i < paramList.size()) {
      this.a.a(paramInt, ((Boolean)paramList.get(i)).booleanValue());
      i++;
    } 
  }
  
  public final void c(int paramInt1, int paramInt2) {
    this.a.b(paramInt1, paramInt2);
  }
  
  public final void c(int paramInt, long paramLong) {
    this.a.a(paramInt, paramLong);
  }
  
  public final void c(int paramInt, List<Long> paramList, boolean paramBoolean) {
    int i = 0;
    boolean bool = false;
    if (paramBoolean) {
      this.a.a(paramInt, 2);
      paramInt = 0;
      i = 0;
      while (paramInt < paramList.size()) {
        i += m0.f(((Long)paramList.get(paramInt)).longValue());
        paramInt++;
      } 
      this.a.b(i);
      for (paramInt = bool; paramInt < paramList.size(); paramInt++)
        this.a.b(((Long)paramList.get(paramInt)).longValue()); 
      return;
    } 
    while (i < paramList.size()) {
      this.a.b(paramInt, ((Long)paramList.get(i)).longValue());
      i++;
    } 
  }
  
  public final void d(int paramInt1, int paramInt2) {
    this.a.c(paramInt1, paramInt2);
  }
  
  public final void d(int paramInt, long paramLong) {
    this.a.c(paramInt, paramLong);
  }
  
  public final void d(int paramInt, List<Integer> paramList, boolean paramBoolean) {
    int i = 0;
    boolean bool = false;
    if (paramBoolean) {
      this.a.a(paramInt, 2);
      paramInt = 0;
      i = 0;
      while (paramInt < paramList.size()) {
        i += m0.f(((Integer)paramList.get(paramInt)).intValue());
        paramInt++;
      } 
      this.a.b(i);
      for (paramInt = bool; paramInt < paramList.size(); paramInt++)
        this.a.a(((Integer)paramList.get(paramInt)).intValue()); 
      return;
    } 
    while (i < paramList.size()) {
      this.a.b(paramInt, ((Integer)paramList.get(i)).intValue());
      i++;
    } 
  }
  
  public final void e(int paramInt1, int paramInt2) {
    this.a.d(paramInt1, paramInt2);
  }
  
  public final void e(int paramInt, long paramLong) {
    this.a.a(paramInt, paramLong);
  }
  
  public final void e(int paramInt, List<Long> paramList, boolean paramBoolean) {
    int i = 0;
    boolean bool = false;
    if (paramBoolean) {
      this.a.a(paramInt, 2);
      paramInt = 0;
      i = 0;
      while (paramInt < paramList.size()) {
        i += m0.e(((Long)paramList.get(paramInt)).longValue());
        paramInt++;
      } 
      this.a.b(i);
      for (paramInt = bool; paramInt < paramList.size(); paramInt++)
        this.a.a(((Long)paramList.get(paramInt)).longValue()); 
      return;
    } 
    while (i < paramList.size()) {
      this.a.a(paramInt, ((Long)paramList.get(i)).longValue());
      i++;
    } 
  }
  
  public final void f(int paramInt1, int paramInt2) {
    this.a.b(paramInt1, paramInt2);
  }
  
  public final void f(int paramInt, List<Integer> paramList, boolean paramBoolean) {
    int i = 0;
    boolean bool = false;
    if (paramBoolean) {
      this.a.a(paramInt, 2);
      paramInt = 0;
      i = 0;
      while (paramInt < paramList.size()) {
        i += m0.k(((Integer)paramList.get(paramInt)).intValue());
        paramInt++;
      } 
      this.a.b(i);
      for (paramInt = bool; paramInt < paramList.size(); paramInt++)
        this.a.a(((Integer)paramList.get(paramInt)).intValue()); 
      return;
    } 
    while (i < paramList.size()) {
      this.a.b(paramInt, ((Integer)paramList.get(i)).intValue());
      i++;
    } 
  }
  
  public final void g(int paramInt1, int paramInt2) {
    this.a.e(paramInt1, paramInt2);
  }
  
  public final void g(int paramInt, List<Integer> paramList, boolean paramBoolean) {
    int i = 0;
    boolean bool = false;
    if (paramBoolean) {
      this.a.a(paramInt, 2);
      paramInt = 0;
      i = 0;
      while (paramInt < paramList.size()) {
        i += m0.h(((Integer)paramList.get(paramInt)).intValue());
        paramInt++;
      } 
      this.a.b(i);
      for (paramInt = bool; paramInt < paramList.size(); paramInt++)
        this.a.c(((Integer)paramList.get(paramInt)).intValue()); 
      return;
    } 
    while (i < paramList.size()) {
      this.a.d(paramInt, ((Integer)paramList.get(i)).intValue());
      i++;
    } 
  }
  
  public final void h(int paramInt, List<Long> paramList, boolean paramBoolean) {
    int i = 0;
    boolean bool = false;
    if (paramBoolean) {
      this.a.a(paramInt, 2);
      paramInt = 0;
      i = 0;
      while (paramInt < paramList.size()) {
        i += m0.d(((Long)paramList.get(paramInt)).longValue());
        paramInt++;
      } 
      this.a.b(i);
      for (paramInt = bool; paramInt < paramList.size(); paramInt++)
        this.a.a(((Long)paramList.get(paramInt)).longValue()); 
      return;
    } 
    while (i < paramList.size()) {
      this.a.a(paramInt, ((Long)paramList.get(i)).longValue());
      i++;
    } 
  }
  
  public final void i(int paramInt, List<Double> paramList, boolean paramBoolean) {
    int i = 0;
    boolean bool = false;
    if (paramBoolean) {
      this.a.a(paramInt, 2);
      paramInt = 0;
      i = 0;
      while (paramInt < paramList.size()) {
        i += m0.b(((Double)paramList.get(paramInt)).doubleValue());
        paramInt++;
      } 
      this.a.b(i);
      for (paramInt = bool; paramInt < paramList.size(); paramInt++)
        this.a.a(((Double)paramList.get(paramInt)).doubleValue()); 
      return;
    } 
    while (i < paramList.size()) {
      this.a.a(paramInt, ((Double)paramList.get(i)).doubleValue());
      i++;
    } 
  }
  
  public final void j(int paramInt, List<Long> paramList, boolean paramBoolean) {
    int i = 0;
    boolean bool = false;
    if (paramBoolean) {
      this.a.a(paramInt, 2);
      paramInt = 0;
      i = 0;
      while (paramInt < paramList.size()) {
        i += m0.h(((Long)paramList.get(paramInt)).longValue());
        paramInt++;
      } 
      this.a.b(i);
      for (paramInt = bool; paramInt < paramList.size(); paramInt++)
        this.a.c(((Long)paramList.get(paramInt)).longValue()); 
      return;
    } 
    while (i < paramList.size()) {
      this.a.c(paramInt, ((Long)paramList.get(i)).longValue());
      i++;
    } 
  }
  
  public final void k(int paramInt, List<Integer> paramList, boolean paramBoolean) {
    int i = 0;
    boolean bool = false;
    if (paramBoolean) {
      this.a.a(paramInt, 2);
      paramInt = 0;
      i = 0;
      while (paramInt < paramList.size()) {
        i += m0.i(((Integer)paramList.get(paramInt)).intValue());
        paramInt++;
      } 
      this.a.b(i);
      for (paramInt = bool; paramInt < paramList.size(); paramInt++)
        this.a.d(((Integer)paramList.get(paramInt)).intValue()); 
      return;
    } 
    while (i < paramList.size()) {
      this.a.e(paramInt, ((Integer)paramList.get(i)).intValue());
      i++;
    } 
  }
  
  public final void l(int paramInt, List<Float> paramList, boolean paramBoolean) {
    int i = 0;
    boolean bool = false;
    if (paramBoolean) {
      this.a.a(paramInt, 2);
      paramInt = 0;
      i = 0;
      while (paramInt < paramList.size()) {
        i += m0.b(((Float)paramList.get(paramInt)).floatValue());
        paramInt++;
      } 
      this.a.b(i);
      for (paramInt = bool; paramInt < paramList.size(); paramInt++)
        this.a.a(((Float)paramList.get(paramInt)).floatValue()); 
      return;
    } 
    while (i < paramList.size()) {
      this.a.a(paramInt, ((Float)paramList.get(i)).floatValue());
      i++;
    } 
  }
  
  public final void m(int paramInt, List<Integer> paramList, boolean paramBoolean) {
    int i = 0;
    boolean bool = false;
    if (paramBoolean) {
      this.a.a(paramInt, 2);
      paramInt = 0;
      i = 0;
      while (paramInt < paramList.size()) {
        i += m0.g(((Integer)paramList.get(paramInt)).intValue());
        paramInt++;
      } 
      this.a.b(i);
      for (paramInt = bool; paramInt < paramList.size(); paramInt++)
        this.a.b(((Integer)paramList.get(paramInt)).intValue()); 
      return;
    } 
    while (i < paramList.size()) {
      this.a.c(paramInt, ((Integer)paramList.get(i)).intValue());
      i++;
    } 
  }
  
  public final void n(int paramInt, List<Integer> paramList, boolean paramBoolean) {
    int i = 0;
    boolean bool = false;
    if (paramBoolean) {
      this.a.a(paramInt, 2);
      paramInt = 0;
      i = 0;
      while (paramInt < paramList.size()) {
        i += m0.j(((Integer)paramList.get(paramInt)).intValue());
        paramInt++;
      } 
      this.a.b(i);
      for (paramInt = bool; paramInt < paramList.size(); paramInt++)
        this.a.d(((Integer)paramList.get(paramInt)).intValue()); 
      return;
    } 
    while (i < paramList.size()) {
      this.a.e(paramInt, ((Integer)paramList.get(i)).intValue());
      i++;
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/d/o0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */