package androidx.recyclerview.widget;

import androidx.core.util.Pools;
import androidx.core.util.d;
import b.d.d;
import b.d.g;

class q {
  final g<RecyclerView.d0, a> a = new g();
  
  final d<RecyclerView.d0> b = new d();
  
  private RecyclerView.l.c a(RecyclerView.d0 paramd0, int paramInt) {
    int i = this.a.a(paramd0);
    if (i < 0)
      return null; 
    a a = (a)this.a.d(i);
    if (a != null) {
      int j = a.a;
      if ((j & paramInt) != 0) {
        RecyclerView.l.c c;
        a.a = (paramInt ^ 0xFFFFFFFF) & j;
        if (paramInt == 4) {
          c = a.b;
        } else if (paramInt == 8) {
          c = a.c;
        } else {
          throw new IllegalArgumentException("Must provide flag PRE or POST");
        } 
        if ((a.a & 0xC) == 0) {
          this.a.c(i);
          a.a(a);
        } 
        return c;
      } 
    } 
    return null;
  }
  
  RecyclerView.d0 a(long paramLong) {
    return (RecyclerView.d0)this.b.a(paramLong);
  }
  
  void a() {
    this.a.clear();
    this.b.a();
  }
  
  void a(long paramLong, RecyclerView.d0 paramd0) {
    this.b.c(paramLong, paramd0);
  }
  
  void a(RecyclerView.d0 paramd0) {
    a a2 = (a)this.a.get(paramd0);
    a a1 = a2;
    if (a2 == null) {
      a1 = a.b();
      this.a.put(paramd0, a1);
    } 
    a1.a |= 0x1;
  }
  
  void a(RecyclerView.d0 paramd0, RecyclerView.l.c paramc) {
    a a2 = (a)this.a.get(paramd0);
    a a1 = a2;
    if (a2 == null) {
      a1 = a.b();
      this.a.put(paramd0, a1);
    } 
    a1.a |= 0x2;
    a1.b = paramc;
  }
  
  void a(b paramb) {
    // Byte code:
    //   0: aload_0
    //   1: getfield a : Lb/d/g;
    //   4: invokevirtual size : ()I
    //   7: iconst_1
    //   8: isub
    //   9: istore_2
    //   10: iload_2
    //   11: iflt -> 208
    //   14: aload_0
    //   15: getfield a : Lb/d/g;
    //   18: iload_2
    //   19: invokevirtual b : (I)Ljava/lang/Object;
    //   22: checkcast androidx/recyclerview/widget/RecyclerView$d0
    //   25: astore #6
    //   27: aload_0
    //   28: getfield a : Lb/d/g;
    //   31: iload_2
    //   32: invokevirtual c : (I)Ljava/lang/Object;
    //   35: checkcast androidx/recyclerview/widget/q$a
    //   38: astore #7
    //   40: aload #7
    //   42: getfield a : I
    //   45: istore_3
    //   46: iload_3
    //   47: iconst_3
    //   48: iand
    //   49: iconst_3
    //   50: if_icmpne -> 64
    //   53: aload_1
    //   54: aload #6
    //   56: invokeinterface a : (Landroidx/recyclerview/widget/RecyclerView$d0;)V
    //   61: goto -> 196
    //   64: iload_3
    //   65: iconst_1
    //   66: iand
    //   67: ifeq -> 107
    //   70: aload #7
    //   72: getfield b : Landroidx/recyclerview/widget/RecyclerView$l$c;
    //   75: astore #4
    //   77: aload #4
    //   79: ifnonnull -> 85
    //   82: goto -> 53
    //   85: aload #7
    //   87: getfield c : Landroidx/recyclerview/widget/RecyclerView$l$c;
    //   90: astore #5
    //   92: aload_1
    //   93: aload #6
    //   95: aload #4
    //   97: aload #5
    //   99: invokeinterface b : (Landroidx/recyclerview/widget/RecyclerView$d0;Landroidx/recyclerview/widget/RecyclerView$l$c;Landroidx/recyclerview/widget/RecyclerView$l$c;)V
    //   104: goto -> 196
    //   107: iload_3
    //   108: bipush #14
    //   110: iand
    //   111: bipush #14
    //   113: if_icmpne -> 137
    //   116: aload_1
    //   117: aload #6
    //   119: aload #7
    //   121: getfield b : Landroidx/recyclerview/widget/RecyclerView$l$c;
    //   124: aload #7
    //   126: getfield c : Landroidx/recyclerview/widget/RecyclerView$l$c;
    //   129: invokeinterface a : (Landroidx/recyclerview/widget/RecyclerView$d0;Landroidx/recyclerview/widget/RecyclerView$l$c;Landroidx/recyclerview/widget/RecyclerView$l$c;)V
    //   134: goto -> 196
    //   137: iload_3
    //   138: bipush #12
    //   140: iand
    //   141: bipush #12
    //   143: if_icmpne -> 167
    //   146: aload_1
    //   147: aload #6
    //   149: aload #7
    //   151: getfield b : Landroidx/recyclerview/widget/RecyclerView$l$c;
    //   154: aload #7
    //   156: getfield c : Landroidx/recyclerview/widget/RecyclerView$l$c;
    //   159: invokeinterface c : (Landroidx/recyclerview/widget/RecyclerView$d0;Landroidx/recyclerview/widget/RecyclerView$l$c;Landroidx/recyclerview/widget/RecyclerView$l$c;)V
    //   164: goto -> 196
    //   167: iload_3
    //   168: iconst_4
    //   169: iand
    //   170: ifeq -> 186
    //   173: aload #7
    //   175: getfield b : Landroidx/recyclerview/widget/RecyclerView$l$c;
    //   178: astore #4
    //   180: aconst_null
    //   181: astore #5
    //   183: goto -> 92
    //   186: iload_3
    //   187: bipush #8
    //   189: iand
    //   190: ifeq -> 196
    //   193: goto -> 116
    //   196: aload #7
    //   198: invokestatic a : (Landroidx/recyclerview/widget/q$a;)V
    //   201: iload_2
    //   202: iconst_1
    //   203: isub
    //   204: istore_2
    //   205: goto -> 10
    //   208: return
  }
  
  void b() {
    a.a();
  }
  
  void b(RecyclerView.d0 paramd0, RecyclerView.l.c paramc) {
    a a2 = (a)this.a.get(paramd0);
    a a1 = a2;
    if (a2 == null) {
      a1 = a.b();
      this.a.put(paramd0, a1);
    } 
    a1.c = paramc;
    a1.a |= 0x8;
  }
  
  boolean b(RecyclerView.d0 paramd0) {
    a a = (a)this.a.get(paramd0);
    return (a != null && (a.a & 0x1) != 0);
  }
  
  void c(RecyclerView.d0 paramd0, RecyclerView.l.c paramc) {
    a a2 = (a)this.a.get(paramd0);
    a a1 = a2;
    if (a2 == null) {
      a1 = a.b();
      this.a.put(paramd0, a1);
    } 
    a1.b = paramc;
    a1.a |= 0x4;
  }
  
  boolean c(RecyclerView.d0 paramd0) {
    a a = (a)this.a.get(paramd0);
    return (a != null && (a.a & 0x4) != 0);
  }
  
  public void d(RecyclerView.d0 paramd0) {
    g(paramd0);
  }
  
  RecyclerView.l.c e(RecyclerView.d0 paramd0) {
    return a(paramd0, 8);
  }
  
  RecyclerView.l.c f(RecyclerView.d0 paramd0) {
    return a(paramd0, 4);
  }
  
  void g(RecyclerView.d0 paramd0) {
    a a = (a)this.a.get(paramd0);
    if (a == null)
      return; 
    a.a &= 0xFFFFFFFE;
  }
  
  void h(RecyclerView.d0 paramd0) {
    for (int i = this.b.b() - 1; i >= 0; i--) {
      if (paramd0 == this.b.c(i)) {
        this.b.b(i);
        break;
      } 
    } 
    a a = (a)this.a.remove(paramd0);
    if (a != null)
      a.a(a); 
  }
  
  static class a {
    static d<a> d = (d<a>)new Pools.SimplePool(20);
    
    int a;
    
    RecyclerView.l.c b;
    
    RecyclerView.l.c c;
    
    static void a() {
      while (d.a() != null);
    }
    
    static void a(a param1a) {
      param1a.a = 0;
      param1a.b = null;
      param1a.c = null;
      d.a(param1a);
    }
    
    static a b() {
      a a2 = (a)d.a();
      a a1 = a2;
      if (a2 == null)
        a1 = new a(); 
      return a1;
    }
  }
  
  static interface b {
    void a(RecyclerView.d0 param1d0);
    
    void a(RecyclerView.d0 param1d0, RecyclerView.l.c param1c1, RecyclerView.l.c param1c2);
    
    void b(RecyclerView.d0 param1d0, RecyclerView.l.c param1c1, RecyclerView.l.c param1c2);
    
    void c(RecyclerView.d0 param1d0, RecyclerView.l.c param1c1, RecyclerView.l.c param1c2);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/recyclerview/widget/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */