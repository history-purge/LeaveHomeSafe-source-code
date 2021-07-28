package e.f.a.e.i.d;

import java.util.Map;

final class t0 extends s0<f1.d> {
  final int a(Map.Entry<?, ?> paramEntry) {
    return ((f1.d)paramEntry.getKey()).c;
  }
  
  final w0<f1.d> a(Object paramObject) {
    return ((f1.c)paramObject).zzjv;
  }
  
  final void a(o4 paramo4, Map.Entry<?, ?> paramEntry) {
    f1.d d = (f1.d)paramEntry.getKey();
    switch (u0.a[d.d.ordinal()]) {
      default:
        return;
      case 18:
        paramo4.a(d.c, paramEntry.getValue(), w2.a().a(paramEntry.getValue().getClass()));
        return;
      case 17:
        paramo4.b(d.c, paramEntry.getValue(), w2.a().a(paramEntry.getValue().getClass()));
        return;
      case 16:
        paramo4.a(d.c, (String)paramEntry.getValue());
        return;
      case 15:
        paramo4.a(d.c, (a0)paramEntry.getValue());
        return;
      case 14:
        paramo4.c(d.c, ((Integer)paramEntry.getValue()).intValue());
        return;
      case 13:
        paramo4.a(d.c, ((Long)paramEntry.getValue()).longValue());
        return;
      case 12:
        paramo4.e(d.c, ((Integer)paramEntry.getValue()).intValue());
        return;
      case 11:
        paramo4.d(d.c, ((Long)paramEntry.getValue()).longValue());
        return;
      case 10:
        paramo4.g(d.c, ((Integer)paramEntry.getValue()).intValue());
        return;
      case 9:
        paramo4.d(d.c, ((Integer)paramEntry.getValue()).intValue());
        return;
      case 8:
        paramo4.a(d.c, ((Boolean)paramEntry.getValue()).booleanValue());
        return;
      case 7:
        paramo4.b(d.c, ((Integer)paramEntry.getValue()).intValue());
        return;
      case 6:
        paramo4.b(d.c, ((Long)paramEntry.getValue()).longValue());
        return;
      case 5:
        paramo4.c(d.c, ((Integer)paramEntry.getValue()).intValue());
        return;
      case 4:
        paramo4.c(d.c, ((Long)paramEntry.getValue()).longValue());
        return;
      case 3:
        paramo4.e(d.c, ((Long)paramEntry.getValue()).longValue());
        return;
      case 2:
        paramo4.a(d.c, ((Float)paramEntry.getValue()).floatValue());
        return;
      case 1:
        break;
    } 
    paramo4.a(d.c, ((Double)paramEntry.getValue()).doubleValue());
  }
  
  final void a(Object paramObject, w0<f1.d> paramw0) {
    ((f1.c)paramObject).zzjv = paramw0;
  }
  
  final boolean a(k2 paramk2) {
    return paramk2 instanceof f1.c;
  }
  
  final w0<f1.d> b(Object paramObject) {
    w0<f1.d> w02 = a(paramObject);
    w0<f1.d> w01 = w02;
    if (w02.c()) {
      w01 = (w0<f1.d>)w02.clone();
      a(paramObject, w01);
    } 
    return w01;
  }
  
  final void c(Object paramObject) {
    a(paramObject).h();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/d/t0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */