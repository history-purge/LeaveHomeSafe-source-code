package androidx.lifecycle;

class CompositeGeneratedAdaptersObserver implements h {
  private final d[] c;
  
  CompositeGeneratedAdaptersObserver(d[] paramArrayOfd) {
    this.c = paramArrayOfd;
  }
  
  public void a(j paramj, g.b paramb) {
    n n = new n();
    d[] arrayOfD = this.c;
    int k = arrayOfD.length;
    boolean bool = false;
    int i;
    for (i = 0; i < k; i++)
      arrayOfD[i].a(paramj, paramb, false, n); 
    arrayOfD = this.c;
    k = arrayOfD.length;
    for (i = bool; i < k; i++)
      arrayOfD[i].a(paramj, paramb, true, n); 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/lifecycle/CompositeGeneratedAdaptersObserver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */