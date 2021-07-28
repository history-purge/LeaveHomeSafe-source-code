package androidx.lifecycle;

class ReflectiveGenericLifecycleObserver implements h {
  private final Object c;
  
  private final b.a d;
  
  ReflectiveGenericLifecycleObserver(Object paramObject) {
    this.c = paramObject;
    this.d = b.c.a(this.c.getClass());
  }
  
  public void a(j paramj, g.b paramb) {
    this.d.a(paramj, paramb, this.c);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/lifecycle/ReflectiveGenericLifecycleObserver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */