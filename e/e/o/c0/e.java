package e.e.o.c0;

public class e implements d {
  public static final e a = new e();
  
  public d a() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Should not update as canRetry is: ");
    stringBuilder.append(b());
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  public boolean b() {
    return false;
  }
  
  public d copy() {
    return this;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/o/c0/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */