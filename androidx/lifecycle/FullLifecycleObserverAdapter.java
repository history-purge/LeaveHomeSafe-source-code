package androidx.lifecycle;

class FullLifecycleObserverAdapter implements h {
  private final c c;
  
  private final h d;
  
  FullLifecycleObserverAdapter(c paramc, h paramh) {
    this.c = paramc;
    this.d = paramh;
  }
  
  public void a(j paramj, g.b paramb) {
    switch (a.a[paramb.ordinal()]) {
      case 7:
        throw new IllegalArgumentException("ON_ANY must not been send by anybody");
      case 6:
        this.c.b(paramj);
        break;
      case 5:
        this.c.f(paramj);
        break;
      case 4:
        this.c.d(paramj);
        break;
      case 3:
        this.c.a(paramj);
        break;
      case 2:
        this.c.e(paramj);
        break;
      case 1:
        this.c.c(paramj);
        break;
    } 
    h h1 = this.d;
    if (h1 != null)
      h1.a(paramj, paramb); 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/lifecycle/FullLifecycleObserverAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */