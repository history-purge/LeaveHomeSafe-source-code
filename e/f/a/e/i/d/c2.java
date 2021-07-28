package e.f.a.e.i.d;

final class c2 implements j2 {
  private j2[] a;
  
  c2(j2... paramVarArgs) {
    this.a = paramVarArgs;
  }
  
  public final boolean a(Class<?> paramClass) {
    j2[] arrayOfJ2 = this.a;
    int j = arrayOfJ2.length;
    for (int i = 0; i < j; i++) {
      if (arrayOfJ2[i].a(paramClass))
        return true; 
    } 
    return false;
  }
  
  public final i2 b(Class<?> paramClass) {
    for (j2 j21 : this.a) {
      if (j21.a(paramClass))
        return j21.b(paramClass); 
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


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/d/c2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */