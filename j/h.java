package j;

public abstract class h implements t {
  private final t delegate;
  
  public h(t paramt) {
    if (paramt != null) {
      this.delegate = paramt;
      return;
    } 
    throw new IllegalArgumentException("delegate == null");
  }
  
  public void close() {
    this.delegate.close();
  }
  
  public final t delegate() {
    return this.delegate;
  }
  
  public long read(c paramc, long paramLong) {
    return this.delegate.read(paramc, paramLong);
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
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/j/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */