package com.swmansion.reanimated.nodes;

import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableMap;

public class o extends m {
  private static final g0 A;
  
  private static final g0 B;
  
  private static final g0 C;
  
  private static final g0 D;
  
  private static final g0 E;
  
  private static final g0 F;
  
  private static final g0 G;
  
  private static final g0 H;
  
  private static final g0 d = new k();
  
  private static final g0 e = new v();
  
  private static final g0 f = new y();
  
  private static final g0 g = new z();
  
  private static final g0 h = new a0();
  
  private static final g0 i = new b0();
  
  private static final g0 j = new c0();
  
  private static final g0 k = new d0();
  
  private static final g0 l = new e0();
  
  private static final g0 m = new a();
  
  private static final g0 n = new b();
  
  private static final g0 o = new c();
  
  private static final g0 p = new d();
  
  private static final g0 q = new e();
  
  private static final g0 r = new f();
  
  private static final g0 s = new g();
  
  private static final g0 t = new h();
  
  private static final g0 u = new i();
  
  private static final g0 v = new j();
  
  private static final g0 w = new l();
  
  private static final g0 x = new m();
  
  private static final g0 y = new n();
  
  private static final g0 z = new o();
  
  private final int[] a;
  
  private final m[] b;
  
  private final g0 c;
  
  static {
    A = new p();
    B = new q();
    C = new r();
    D = new s();
    E = new t();
    F = new u();
    G = new w();
    H = new x();
  }
  
  public o(int paramInt, ReadableMap paramReadableMap, com.swmansion.reanimated.b paramb) {
    super(paramInt, paramReadableMap, paramb);
    g0 g01;
    JSApplicationIllegalArgumentException jSApplicationIllegalArgumentException;
    this.a = com.swmansion.reanimated.e.a(paramReadableMap.getArray("input"));
    this.b = new m[this.a.length];
    String str = paramReadableMap.getString("op");
    if ("add".equals(str)) {
      g01 = d;
    } else if ("sub".equals(g01)) {
      g01 = e;
    } else if ("multiply".equals(g01)) {
      g01 = f;
    } else if ("divide".equals(g01)) {
      g01 = g;
    } else if ("pow".equals(g01)) {
      g01 = h;
    } else if ("modulo".equals(g01)) {
      g01 = i;
    } else if ("sqrt".equals(g01)) {
      g01 = j;
    } else if ("log".equals(g01)) {
      g01 = k;
    } else if ("sin".equals(g01)) {
      g01 = l;
    } else if ("cos".equals(g01)) {
      g01 = m;
    } else if ("tan".equals(g01)) {
      g01 = n;
    } else if ("acos".equals(g01)) {
      g01 = o;
    } else if ("asin".equals(g01)) {
      g01 = p;
    } else if ("atan".equals(g01)) {
      g01 = q;
    } else if ("exp".equals(g01)) {
      g01 = r;
    } else if ("round".equals(g01)) {
      g01 = s;
    } else if ("and".equals(g01)) {
      g01 = y;
    } else if ("or".equals(g01)) {
      g01 = z;
    } else if ("not".equals(g01)) {
      g01 = A;
    } else if ("defined".equals(g01)) {
      g01 = B;
    } else if ("lessThan".equals(g01)) {
      g01 = C;
    } else if ("eq".equals(g01)) {
      g01 = D;
    } else if ("greaterThan".equals(g01)) {
      g01 = E;
    } else if ("lessOrEq".equals(g01)) {
      g01 = F;
    } else if ("greaterOrEq".equals(g01)) {
      g01 = G;
    } else if ("neq".equals(g01)) {
      g01 = H;
    } else if ("abs".equals(g01)) {
      g01 = t;
    } else if ("floor".equals(g01)) {
      g01 = u;
    } else if ("ceil".equals(g01)) {
      g01 = v;
    } else if ("max".equals(g01)) {
      g01 = x;
    } else if ("min".equals(g01)) {
      g01 = w;
    } else {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Unrecognized operator ");
      stringBuilder.append((String)g01);
      jSApplicationIllegalArgumentException = new JSApplicationIllegalArgumentException(stringBuilder.toString());
      throw jSApplicationIllegalArgumentException;
    } 
    this.c = (g0)jSApplicationIllegalArgumentException;
  }
  
  private static boolean b(Object paramObject) {
    return (paramObject != null && !paramObject.equals(Double.valueOf(0.0D)));
  }
  
  protected Object evaluate() {
    int i = 0;
    while (true) {
      int[] arrayOfInt = this.a;
      if (i < arrayOfInt.length) {
        this.b[i] = this.mNodesManager.a(arrayOfInt[i], m.class);
        i++;
        continue;
      } 
      return Double.valueOf(this.c.a(this.b));
    } 
  }
  
  class a extends i0 {
    a() {
      super(null);
    }
    
    public double a(Double param1Double) {
      return Math.cos(param1Double.doubleValue());
    }
  }
  
  class a0 extends h0 {
    a0() {
      super(null);
    }
    
    public double a(Double param1Double1, Double param1Double2) {
      return Math.pow(param1Double1.doubleValue(), param1Double2.doubleValue());
    }
  }
  
  class b extends i0 {
    b() {
      super(null);
    }
    
    public double a(Double param1Double) {
      return Math.tan(param1Double.doubleValue());
    }
  }
  
  class b0 extends h0 {
    b0() {
      super(null);
    }
    
    public double a(Double param1Double1, Double param1Double2) {
      return (param1Double1.doubleValue() % param1Double2.doubleValue() + param1Double2.doubleValue()) % param1Double2.doubleValue();
    }
  }
  
  class c extends i0 {
    c() {
      super(null);
    }
    
    public double a(Double param1Double) {
      return Math.acos(param1Double.doubleValue());
    }
  }
  
  class c0 extends i0 {
    c0() {
      super(null);
    }
    
    public double a(Double param1Double) {
      return Math.sqrt(param1Double.doubleValue());
    }
  }
  
  class d extends i0 {
    d() {
      super(null);
    }
    
    public double a(Double param1Double) {
      return Math.asin(param1Double.doubleValue());
    }
  }
  
  class d0 extends i0 {
    d0() {
      super(null);
    }
    
    public double a(Double param1Double) {
      return Math.log(param1Double.doubleValue());
    }
  }
  
  class e extends i0 {
    e() {
      super(null);
    }
    
    public double a(Double param1Double) {
      return Math.atan(param1Double.doubleValue());
    }
  }
  
  class e0 extends i0 {
    e0() {
      super(null);
    }
    
    public double a(Double param1Double) {
      return Math.sin(param1Double.doubleValue());
    }
  }
  
  class f extends i0 {
    f() {
      super(null);
    }
    
    public double a(Double param1Double) {
      return Math.exp(param1Double.doubleValue());
    }
  }
  
  private static abstract class f0 implements g0 {
    private f0() {}
    
    public double a(m[] param1ArrayOfm) {
      return a((Double)param1ArrayOfm[0].value(), (Double)param1ArrayOfm[1].value()) ? 1.0D : 0.0D;
    }
    
    public abstract boolean a(Double param1Double1, Double param1Double2);
  }
  
  class g extends i0 {
    g() {
      super(null);
    }
    
    public double a(Double param1Double) {
      return Math.round(param1Double.doubleValue());
    }
  }
  
  private static interface g0 {
    double a(m[] param1ArrayOfm);
  }
  
  class h extends i0 {
    h() {
      super(null);
    }
    
    public double a(Double param1Double) {
      return Math.abs(param1Double.doubleValue());
    }
  }
  
  private static abstract class h0 implements g0 {
    private h0() {}
    
    public abstract double a(Double param1Double1, Double param1Double2);
    
    public double a(m[] param1ArrayOfm) {
      double d = param1ArrayOfm[0].doubleValue().doubleValue();
      int i;
      for (i = 1; i < param1ArrayOfm.length; i++)
        d = a(Double.valueOf(d), param1ArrayOfm[i].doubleValue()); 
      return d;
    }
  }
  
  class i extends i0 {
    i() {
      super(null);
    }
    
    public double a(Double param1Double) {
      return Math.floor(param1Double.doubleValue());
    }
  }
  
  private static abstract class i0 implements g0 {
    private i0() {}
    
    public abstract double a(Double param1Double);
    
    public double a(m[] param1ArrayOfm) {
      return a((Double)param1ArrayOfm[0].value());
    }
  }
  
  class j extends i0 {
    j() {
      super(null);
    }
    
    public double a(Double param1Double) {
      return Math.ceil(param1Double.doubleValue());
    }
  }
  
  class k extends h0 {
    k() {
      super(null);
    }
    
    public double a(Double param1Double1, Double param1Double2) {
      return param1Double1.doubleValue() + param1Double2.doubleValue();
    }
  }
  
  class l extends h0 {
    l() {
      super(null);
    }
    
    public double a(Double param1Double1, Double param1Double2) {
      return Math.min(param1Double1.doubleValue(), param1Double2.doubleValue());
    }
  }
  
  class m extends h0 {
    m() {
      super(null);
    }
    
    public double a(Double param1Double1, Double param1Double2) {
      return Math.max(param1Double1.doubleValue(), param1Double2.doubleValue());
    }
  }
  
  class n implements g0 {
    public double a(m[] param1ArrayOfm) {
      boolean bool = o.a(param1ArrayOfm[0].value());
      for (int i = 1; i < param1ArrayOfm.length && bool; i++) {
        if (bool && o.a(param1ArrayOfm[i].value())) {
          bool = true;
        } else {
          bool = false;
        } 
      } 
      return bool ? 1.0D : 0.0D;
    }
  }
  
  class o implements g0 {
    public double a(m[] param1ArrayOfm) {
      boolean bool = o.a(param1ArrayOfm[0].value());
      for (int i = 1; i < param1ArrayOfm.length && !bool; i++) {
        if (bool || o.a(param1ArrayOfm[i].value())) {
          bool = true;
        } else {
          bool = false;
        } 
      } 
      return bool ? 1.0D : 0.0D;
    }
  }
  
  class p implements g0 {
    public double a(m[] param1ArrayOfm) {
      return o.a(param1ArrayOfm[0].value()) ? 0.0D : 1.0D;
    }
  }
  
  class q implements g0 {
    public double a(m[] param1ArrayOfm) {
      Object object = param1ArrayOfm[0].value();
      return (object != null && (!(object instanceof Double) || !((Double)object).isNaN())) ? 1.0D : 0.0D;
    }
  }
  
  class r extends f0 {
    r() {
      super(null);
    }
    
    public boolean a(Double param1Double1, Double param1Double2) {
      boolean bool2 = false;
      boolean bool1 = bool2;
      if (param1Double1 != null) {
        if (param1Double2 == null)
          return false; 
        bool1 = bool2;
        if (param1Double1.doubleValue() < param1Double2.doubleValue())
          bool1 = true; 
      } 
      return bool1;
    }
  }
  
  class s extends f0 {
    s() {
      super(null);
    }
    
    public boolean a(Double param1Double1, Double param1Double2) {
      return (param1Double1 == null || param1Double2 == null) ? ((param1Double1 == param1Double2)) : ((param1Double1.doubleValue() == param1Double2.doubleValue()));
    }
  }
  
  class t extends f0 {
    t() {
      super(null);
    }
    
    public boolean a(Double param1Double1, Double param1Double2) {
      boolean bool2 = false;
      boolean bool1 = bool2;
      if (param1Double1 != null) {
        if (param1Double2 == null)
          return false; 
        bool1 = bool2;
        if (param1Double1.doubleValue() > param1Double2.doubleValue())
          bool1 = true; 
      } 
      return bool1;
    }
  }
  
  class u extends f0 {
    u() {
      super(null);
    }
    
    public boolean a(Double param1Double1, Double param1Double2) {
      return (param1Double1.doubleValue() <= param1Double2.doubleValue());
    }
  }
  
  class v extends h0 {
    v() {
      super(null);
    }
    
    public double a(Double param1Double1, Double param1Double2) {
      return param1Double1.doubleValue() - param1Double2.doubleValue();
    }
  }
  
  class w extends f0 {
    w() {
      super(null);
    }
    
    public boolean a(Double param1Double1, Double param1Double2) {
      return (param1Double1.doubleValue() >= param1Double2.doubleValue());
    }
  }
  
  class x extends f0 {
    x() {
      super(null);
    }
    
    public boolean a(Double param1Double1, Double param1Double2) {
      return (param1Double1 == null || param1Double2 == null) ? ((param1Double1 == param1Double2)) : ((param1Double1.doubleValue() != param1Double2.doubleValue()));
    }
  }
  
  class y extends h0 {
    y() {
      super(null);
    }
    
    public double a(Double param1Double1, Double param1Double2) {
      return param1Double1.doubleValue() * param1Double2.doubleValue();
    }
  }
  
  class z extends h0 {
    z() {
      super(null);
    }
    
    public double a(Double param1Double1, Double param1Double2) {
      return param1Double1.doubleValue() / param1Double2.doubleValue();
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/swmansion/reanimated/nodes/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */