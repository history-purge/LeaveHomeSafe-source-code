package e.f.a.e.i.d;

final class a3 {
  private final String a;
  
  private int b;
  
  a3(String paramString) {
    this.a = paramString;
    this.b = 0;
  }
  
  final boolean a() {
    return (this.b < this.a.length());
  }
  
  final int b() {
    String str = this.a;
    int i = this.b;
    this.b = i + 1;
    i = str.charAt(i);
    if (i < 55296)
      return i; 
    int j = i & 0x1FFF;
    i = 13;
    while (true) {
      str = this.a;
      int k = this.b;
      this.b = k + 1;
      k = str.charAt(k);
      if (k >= 55296) {
        j |= (k & 0x1FFF) << i;
        i += 13;
        continue;
      } 
      return j | k << i;
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/d/a3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */