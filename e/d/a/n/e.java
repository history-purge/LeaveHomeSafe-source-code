package e.d.a.n;

public enum e {
  c(0, "Greyscale", new int[] { 1, 2, 4, 8, 16 }),
  d(2, "True Color", new int[] { 8, 16 }),
  e(3, "Indexed Color", new int[] { 1, 2, 4, 8 }),
  f(4, "Greyscale with Alpha", new int[] { 8, 16 }),
  g(6, "True Color with Alpha", new int[] { 8, 16 });
  
  private final int[] _allowedBitDepths;
  
  private final String _description;
  
  private final int _numericValue;
  
  e(int paramInt1, String paramString1, int... paramVarArgs) {
    this._numericValue = paramInt1;
    this._description = paramString1;
    this._allowedBitDepths = paramVarArgs;
  }
  
  public static e f(int paramInt) {
    for (e e1 : (e[])e.class.getEnumConstants()) {
      if (e1.b() == paramInt)
        return e1; 
    } 
    return null;
  }
  
  public String a() {
    return this._description;
  }
  
  public int b() {
    return this._numericValue;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/a/n/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */