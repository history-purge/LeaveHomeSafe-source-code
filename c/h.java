package c;

class h {
  private f<?> a;
  
  public h(f<?> paramf) {
    this.a = paramf;
  }
  
  public void a() {
    this.a = null;
  }
  
  protected void finalize() {
    try {
      f<?> f1 = this.a;
      if (f1 != null) {
        f.d d = f.g();
        if (d != null)
          d.a(f1, new i(f1.a())); 
      } 
      return;
    } finally {
      super.finalize();
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/c/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */