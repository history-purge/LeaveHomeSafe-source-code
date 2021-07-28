package j;

public abstract class g implements s {
  private final s delegate;
  
  public g(s params) {
    if (params != null) {
      this.delegate = params;
      return;
    } 
    throw new IllegalArgumentException("delegate == null");
  }
  
  public void close() {
    this.delegate.close();
  }
  
  public final s delegate() {
    return this.delegate;
  }
  
  public void flush() {
    this.delegate.flush();
  }
  
  public u timeout() {
    return this.delegate.timeout();
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(getClass().getSimpleName());
    stringBuilder.append("(");
    stringBuilder.append(this.delegate.toString());
    stringBuilder.append(")");
    return stringBuilder.toString();
  }
  
  public void write(c paramc, long paramLong) {
    this.delegate.write(paramc, paramLong);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/j/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */