package e.f.a.e.i.j;

final class v6 extends s6 {
  private final u6 a = new u6();
  
  public final void a(Throwable paramThrowable1, Throwable paramThrowable2) {
    if (paramThrowable2 != paramThrowable1) {
      this.a.a(paramThrowable1, true).add(paramThrowable2);
      return;
    } 
    throw new IllegalArgumentException("Self suppression is not allowed.", paramThrowable2);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/j/v6.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */