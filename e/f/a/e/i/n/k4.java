package e.f.a.e.i.n;

final class k4 implements s4 {
  private s4[] a;
  
  k4(s4... paramVarArgs) {
    this.a = paramVarArgs;
  }
  
  public final boolean a(Class<?> paramClass) {
    s4[] arrayOfS4 = this.a;
    int j = arrayOfS4.length;
    for (int i = 0; i < j; i++) {
      if (arrayOfS4[i].a(paramClass))
        return true; 
    } 
    return false;
  }
  
  public final p4 b(Class<?> paramClass) {
    for (s4 s41 : this.a) {
      if (s41.a(paramClass))
        return s41.b(paramClass); 
    } 
    String str = String.valueOf(paramClass.getName());
    if (str.length() != 0) {
      str = "No factory is available for message type: ".concat(str);
    } else {
      str = new String("No factory is available for message type: ");
    } 
    UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException(str);
    throw unsupportedOperationException;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/n/k4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */