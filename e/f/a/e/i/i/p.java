package e.f.a.e.i.i;

final class p extends m {
  private final o a = new o();
  
  public final void a(Throwable paramThrowable1, Throwable paramThrowable2) {
    if (paramThrowable2 != paramThrowable1) {
      this.a.a(paramThrowable1, true).add(paramThrowable2);
      return;
    } 
    throw new IllegalArgumentException("Self suppression is not allowed.", paramThrowable2);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/i/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */