package e.a.a.k;

import e.a.a.d;

public abstract class c {
  private int a = 0;
  
  public c() {}
  
  public c(int paramInt) {
    d(paramInt);
    c(paramInt);
  }
  
  private void d(int paramInt) {
    int i = (b() ^ 0xFFFFFFFF) & paramInt;
    if (i == 0) {
      a(paramInt);
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("The option bit(s) 0x");
    stringBuilder.append(Integer.toHexString(i));
    stringBuilder.append(" are invalid!");
    throw new d(stringBuilder.toString(), 103);
  }
  
  public int a() {
    return this.a;
  }
  
  protected void a(int paramInt) {}
  
  public void a(int paramInt, boolean paramBoolean) {
    if (paramBoolean) {
      paramInt |= this.a;
    } else {
      paramInt = (paramInt ^ 0xFFFFFFFF) & this.a;
    } 
    this.a = paramInt;
  }
  
  protected abstract int b();
  
  protected boolean b(int paramInt) {
    return ((paramInt & this.a) != 0);
  }
  
  public void c(int paramInt) {
    d(paramInt);
    this.a = paramInt;
  }
  
  public boolean equals(Object paramObject) {
    return (a() == ((c)paramObject).a());
  }
  
  public int hashCode() {
    return a();
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("0x");
    stringBuilder.append(Integer.toHexString(this.a));
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/a/a/k/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */