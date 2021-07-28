package e.f.a.e.i.g;

final class w extends t {
  private final v a = new v();
  
  public final void a(Throwable paramThrowable1, Throwable paramThrowable2) {
    if (paramThrowable2 != paramThrowable1) {
      this.a.a(paramThrowable1, true).add(paramThrowable2);
      return;
    } 
    throw new IllegalArgumentException("Self suppression is not allowed.", paramThrowable2);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/g/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */