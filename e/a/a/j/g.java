package e.a.a.j;

import e.a.a.d;

class g {
  private String a;
  
  private int b = 0;
  
  public g(String paramString) {
    this.a = paramString;
  }
  
  public char a() {
    return (this.b < this.a.length()) ? this.a.charAt(this.b) : Character.MIN_VALUE;
  }
  
  public char a(int paramInt) {
    return (paramInt < this.a.length()) ? this.a.charAt(paramInt) : Character.MIN_VALUE;
  }
  
  public int a(String paramString, int paramInt) {
    char c = a(this.b);
    int i = 0;
    boolean bool;
    for (bool = false; '0' <= c && c <= '9'; bool = true) {
      i = i * 10 + c - 48;
      this.b++;
      c = a(this.b);
    } 
    if (bool)
      return (i > paramInt) ? paramInt : ((i < 0) ? 0 : i); 
    d d = new d(paramString, 5);
    throw d;
  }
  
  public boolean b() {
    return (this.b < this.a.length());
  }
  
  public int c() {
    return this.b;
  }
  
  public void d() {
    this.b++;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/a/a/j/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */