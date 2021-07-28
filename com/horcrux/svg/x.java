package com.horcrux.svg;

import java.util.ArrayList;
import java.util.Iterator;

class x {
  private static ArrayList<x> d;
  
  private static int e;
  
  private static v f;
  
  private static v g;
  
  private static v h;
  
  private static v i;
  
  private static boolean j;
  
  y a;
  
  v b;
  
  double c;
  
  private x(y paramy, v paramv, double paramDouble) {
    this.a = paramy;
    this.b = paramv;
    this.c = paramDouble;
  }
  
  private static double a(double paramDouble) {
    return paramDouble * 57.29577951308232D;
  }
  
  private static double a(double paramDouble1, double paramDouble2) {
    double d = paramDouble1;
    if (Math.abs(paramDouble1 - paramDouble2) > 180.0D)
      d = paramDouble1 + 360.0D; 
    return (d + paramDouble2) / 2.0D;
  }
  
  private static double a(v paramv) {
    return Math.atan2(paramv.b, paramv.a);
  }
  
  private static double a(y paramy) {
    double d1 = a(a(h));
    double d2 = a(a(i));
    int i = a.a[paramy.ordinal()];
    if (i != 1) {
      if (i != 2) {
        if (i != 3)
          d1 = 0.0D; 
        return d1;
      } 
      return a(d1, d2);
    } 
    d1 = d2;
    if (j)
      d1 = d2 + 180.0D; 
    return d1;
  }
  
  private static d0 a(r paramr) {
    d0 d0 = new d0();
    v[] arrayOfV = paramr.b;
    int i = a.b[paramr.a.ordinal()];
    if (i != 1) {
      if (i != 2) {
        v v4;
        if (i != 3 && i != 4) {
          if (i != 5)
            return d0; 
          v4 = g;
        } else {
          v4 = arrayOfV[0];
        } 
        d0.c = v4;
        d0.a = a(d0.c, f);
        d0.b = a(d0.c, f);
        return d0;
      } 
      d0.c = arrayOfV[1];
      v v3 = f;
      v v2 = arrayOfV[0];
      v v1 = arrayOfV[1];
      a(d0, v3, v2, v1);
      return d0;
    } 
    d0.c = arrayOfV[2];
    d0.a = a(arrayOfV[0], f);
    d0.b = a(arrayOfV[2], arrayOfV[1]);
    if (b(d0.a)) {
      a(d0, arrayOfV[0], arrayOfV[1], arrayOfV[2]);
      return d0;
    } 
    if (b(d0.b)) {
      v v3 = f;
      v v2 = arrayOfV[0];
      v v1 = arrayOfV[1];
      a(d0, v3, v2, v1);
      return d0;
    } 
    return d0;
  }
  
  private static v a(v paramv1, v paramv2) {
    return new v(paramv2.a - paramv1.a, paramv2.b - paramv1.b);
  }
  
  static ArrayList<x> a(ArrayList<r> paramArrayList) {
    d = new ArrayList<x>();
    e = 0;
    f = new v(0.0D, 0.0D);
    g = new v(0.0D, 0.0D);
    Iterator<r> iterator = paramArrayList.iterator();
    while (iterator.hasNext())
      b(iterator.next()); 
    a();
    return d;
  }
  
  private static void a() {
    double d = a(y.e);
    d.add(new x(y.e, f, d));
  }
  
  private static void a(d0 paramd0, v paramv1, v paramv2, v paramv3) {
    paramd0.a = a(paramv2, paramv1);
    paramd0.b = a(paramv3, paramv2);
    if (b(paramd0.a)) {
      paramd0.a = paramd0.b;
      return;
    } 
    if (b(paramd0.b))
      paramd0.b = paramd0.a; 
  }
  
  private static void b(r paramr) {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic a : (Lcom/horcrux/svg/r;)Lcom/horcrux/svg/d0;
    //   4: astore #5
    //   6: aload #5
    //   8: getfield a : Lcom/horcrux/svg/v;
    //   11: putstatic com/horcrux/svg/x.i : Lcom/horcrux/svg/v;
    //   14: getstatic com/horcrux/svg/x.e : I
    //   17: istore_3
    //   18: iload_3
    //   19: ifle -> 66
    //   22: iload_3
    //   23: iconst_1
    //   24: if_icmpne -> 35
    //   27: getstatic com/horcrux/svg/y.c : Lcom/horcrux/svg/y;
    //   30: astore #4
    //   32: goto -> 40
    //   35: getstatic com/horcrux/svg/y.d : Lcom/horcrux/svg/y;
    //   38: astore #4
    //   40: aload #4
    //   42: invokestatic a : (Lcom/horcrux/svg/y;)D
    //   45: dstore_1
    //   46: getstatic com/horcrux/svg/x.d : Ljava/util/ArrayList;
    //   49: new com/horcrux/svg/x
    //   52: dup
    //   53: aload #4
    //   55: getstatic com/horcrux/svg/x.f : Lcom/horcrux/svg/v;
    //   58: dload_1
    //   59: invokespecial <init> : (Lcom/horcrux/svg/y;Lcom/horcrux/svg/v;D)V
    //   62: invokevirtual add : (Ljava/lang/Object;)Z
    //   65: pop
    //   66: aload #5
    //   68: getfield b : Lcom/horcrux/svg/v;
    //   71: putstatic com/horcrux/svg/x.h : Lcom/horcrux/svg/v;
    //   74: aload #5
    //   76: getfield c : Lcom/horcrux/svg/v;
    //   79: putstatic com/horcrux/svg/x.f : Lcom/horcrux/svg/v;
    //   82: aload_0
    //   83: getfield a : Lcom/horcrux/svg/f;
    //   86: astore #4
    //   88: aload #4
    //   90: getstatic com/horcrux/svg/f.e : Lcom/horcrux/svg/f;
    //   93: if_acmpne -> 110
    //   96: aload_0
    //   97: getfield b : [Lcom/horcrux/svg/v;
    //   100: iconst_0
    //   101: aaload
    //   102: astore_0
    //   103: aload_0
    //   104: putstatic com/horcrux/svg/x.g : Lcom/horcrux/svg/v;
    //   107: goto -> 131
    //   110: aload #4
    //   112: getstatic com/horcrux/svg/f.g : Lcom/horcrux/svg/f;
    //   115: if_acmpne -> 131
    //   118: new com/horcrux/svg/v
    //   121: dup
    //   122: dconst_0
    //   123: dconst_0
    //   124: invokespecial <init> : (DD)V
    //   127: astore_0
    //   128: goto -> 103
    //   131: getstatic com/horcrux/svg/x.e : I
    //   134: iconst_1
    //   135: iadd
    //   136: putstatic com/horcrux/svg/x.e : I
    //   139: return
  }
  
  private static boolean b(v paramv) {
    return (paramv.a == 0.0D && paramv.b == 0.0D);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/horcrux/svg/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */