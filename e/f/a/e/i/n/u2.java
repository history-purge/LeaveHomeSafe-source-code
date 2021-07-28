package e.f.a.e.i.n;

import java.util.List;
import java.util.Map;

final class u2 extends v2<h3.e> {
  final int a(Map.Entry<?, ?> paramEntry) {
    return ((h3.e)paramEntry.getKey()).c;
  }
  
  final z2<h3.e> a(Object paramObject) {
    return ((h3.c)paramObject).zzc;
  }
  
  final Object a(t2 paramt2, r4 paramr4, int paramInt) {
    return paramt2.a(paramr4, paramInt);
  }
  
  final void a(y6 paramy6, Map.Entry<?, ?> paramEntry) {
    h3.e e = (h3.e)paramEntry.getKey();
    if (e.e) {
      List<E> list;
      switch (x2.a[e.d.ordinal()]) {
        default:
          return;
        case 18:
          list = (List)paramEntry.getValue();
          if (list != null && !list.isEmpty()) {
            k5.a(e.c, (List)paramEntry.getValue(), paramy6, e5.a().a(list.get(0).getClass()));
            return;
          } 
          return;
        case 17:
          list = (List<E>)paramEntry.getValue();
          if (list != null && !list.isEmpty())
            k5.b(e.c, (List)paramEntry.getValue(), paramy6, e5.a().a(list.get(0).getClass())); 
          return;
        case 16:
          k5.a(e.c, (List<String>)paramEntry.getValue(), paramy6);
          return;
        case 15:
          k5.b(e.c, (List<z1>)paramEntry.getValue(), paramy6);
          return;
        case 14:
          k5.h(e.c, (List<Integer>)paramEntry.getValue(), paramy6, false);
          return;
        case 13:
          k5.e(e.c, (List<Long>)paramEntry.getValue(), paramy6, false);
          return;
        case 12:
          k5.j(e.c, (List<Integer>)paramEntry.getValue(), paramy6, false);
          return;
        case 11:
          k5.g(e.c, (List<Long>)paramEntry.getValue(), paramy6, false);
          return;
        case 10:
          k5.l(e.c, (List<Integer>)paramEntry.getValue(), paramy6, false);
          return;
        case 9:
          k5.i(e.c, (List<Integer>)paramEntry.getValue(), paramy6, false);
          return;
        case 8:
          k5.n(e.c, (List<Boolean>)paramEntry.getValue(), paramy6, false);
          return;
        case 7:
          k5.k(e.c, (List<Integer>)paramEntry.getValue(), paramy6, false);
          return;
        case 6:
          k5.f(e.c, (List<Long>)paramEntry.getValue(), paramy6, false);
          return;
        case 5:
          k5.h(e.c, (List<Integer>)paramEntry.getValue(), paramy6, false);
          return;
        case 4:
          k5.d(e.c, (List<Long>)paramEntry.getValue(), paramy6, false);
          return;
        case 3:
          k5.c(e.c, (List<Long>)paramEntry.getValue(), paramy6, false);
          return;
        case 2:
          k5.b(e.c, (List<Float>)paramEntry.getValue(), paramy6, false);
          return;
        case 1:
          break;
      } 
      k5.a(e.c, (List<Double>)paramEntry.getValue(), paramy6, false);
      return;
    } 
    switch (x2.a[e.d.ordinal()]) {
      default:
        return;
      case 18:
        paramy6.a(e.c, paramEntry.getValue(), e5.a().a(paramEntry.getValue().getClass()));
        return;
      case 17:
        paramy6.b(e.c, paramEntry.getValue(), e5.a().a(paramEntry.getValue().getClass()));
        return;
      case 16:
        paramy6.a(e.c, (String)paramEntry.getValue());
        return;
      case 15:
        paramy6.a(e.c, (z1)paramEntry.getValue());
        return;
      case 14:
        paramy6.c(e.c, ((Integer)paramEntry.getValue()).intValue());
        return;
      case 13:
        paramy6.e(e.c, ((Long)paramEntry.getValue()).longValue());
        return;
      case 12:
        paramy6.b(e.c, ((Integer)paramEntry.getValue()).intValue());
        return;
      case 11:
        paramy6.a(e.c, ((Long)paramEntry.getValue()).longValue());
        return;
      case 10:
        paramy6.a(e.c, ((Integer)paramEntry.getValue()).intValue());
        return;
      case 9:
        paramy6.e(e.c, ((Integer)paramEntry.getValue()).intValue());
        return;
      case 8:
        paramy6.a(e.c, ((Boolean)paramEntry.getValue()).booleanValue());
        return;
      case 7:
        paramy6.d(e.c, ((Integer)paramEntry.getValue()).intValue());
        return;
      case 6:
        paramy6.d(e.c, ((Long)paramEntry.getValue()).longValue());
        return;
      case 5:
        paramy6.c(e.c, ((Integer)paramEntry.getValue()).intValue());
        return;
      case 4:
        paramy6.b(e.c, ((Long)paramEntry.getValue()).longValue());
        return;
      case 3:
        paramy6.c(e.c, ((Long)paramEntry.getValue()).longValue());
        return;
      case 2:
        paramy6.a(e.c, ((Float)paramEntry.getValue()).floatValue());
        return;
      case 1:
        break;
    } 
    paramy6.a(e.c, ((Double)paramEntry.getValue()).doubleValue());
  }
  
  final boolean a(r4 paramr4) {
    return paramr4 instanceof h3.c;
  }
  
  final z2<h3.e> b(Object paramObject) {
    return ((h3.c)paramObject).zza();
  }
  
  final void c(Object paramObject) {
    a(paramObject).a();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/n/u2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */