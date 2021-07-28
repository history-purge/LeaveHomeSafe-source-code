package e.f.a.e.m;

public final class d extends IllegalStateException {
  private d(String paramString, Throwable paramThrowable) {
    super(paramString, paramThrowable);
  }
  
  public static IllegalStateException a(l<?> paraml) {
    if (!paraml.d())
      return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task."); 
    Exception exception = paraml.a();
    if (exception != null) {
      str = "failure";
    } else if (str.e()) {
      str = String.valueOf(str.b());
      StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 7);
      stringBuilder.append("result ");
      stringBuilder.append(str);
      str = stringBuilder.toString();
    } else if (str.c()) {
      str = "cancellation";
    } else {
      str = "unknown issue";
    } 
    String str = String.valueOf(str);
    if (str.length() != 0) {
      str = "Complete with: ".concat(str);
    } else {
      str = new String("Complete with: ");
    } 
    return new d(str, exception);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/m/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */