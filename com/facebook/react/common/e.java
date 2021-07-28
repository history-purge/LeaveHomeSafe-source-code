package com.facebook.react.common;

public class e {
  private long[] a;
  
  private int b;
  
  private e(int paramInt) {
    this.a = new long[paramInt];
    this.b = 0;
  }
  
  private void b() {
    int i = this.b;
    if (i == this.a.length) {
      double d = i;
      Double.isNaN(d);
      long[] arrayOfLong = new long[Math.max(i + 1, (int)(d * 1.8D))];
      System.arraycopy(this.a, 0, arrayOfLong, 0, this.b);
      this.a = arrayOfLong;
    } 
  }
  
  public static e c(int paramInt) {
    return new e(paramInt);
  }
  
  public int a() {
    return this.b;
  }
  
  public void a(int paramInt) {
    int i = this.b;
    if (paramInt <= i) {
      this.b = i - paramInt;
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Trying to drop ");
    stringBuilder.append(paramInt);
    stringBuilder.append(" items from array of length ");
    stringBuilder.append(this.b);
    throw new IndexOutOfBoundsException(stringBuilder.toString());
  }
  
  public void a(int paramInt, long paramLong) {
    if (paramInt < this.b) {
      this.a[paramInt] = paramLong;
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("");
    stringBuilder.append(paramInt);
    stringBuilder.append(" >= ");
    stringBuilder.append(this.b);
    throw new IndexOutOfBoundsException(stringBuilder.toString());
  }
  
  public void a(long paramLong) {
    b();
    long[] arrayOfLong = this.a;
    int i = this.b;
    this.b = i + 1;
    arrayOfLong[i] = paramLong;
  }
  
  public long b(int paramInt) {
    if (paramInt < this.b)
      return this.a[paramInt]; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("");
    stringBuilder.append(paramInt);
    stringBuilder.append(" >= ");
    stringBuilder.append(this.b);
    throw new IndexOutOfBoundsException(stringBuilder.toString());
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/common/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */