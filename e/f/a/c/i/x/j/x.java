package e.f.a.c.i.x.j;

import e.f.a.c.i.i;
import e.f.a.c.i.n;

final class x extends e0 {
  private final long a;
  
  private final n b;
  
  private final i c;
  
  x(long paramLong, n paramn, i parami) {
    this.a = paramLong;
    if (paramn != null) {
      this.b = paramn;
      if (parami != null) {
        this.c = parami;
        return;
      } 
      throw new NullPointerException("Null event");
    } 
    throw new NullPointerException("Null transportContext");
  }
  
  public i a() {
    return this.c;
  }
  
  public long b() {
    return this.a;
  }
  
  public n c() {
    return this.b;
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (paramObject instanceof e0) {
      paramObject = paramObject;
      return (this.a == paramObject.b() && this.b.equals(paramObject.c()) && this.c.equals(paramObject.a()));
    } 
    return false;
  }
  
  public int hashCode() {
    long l = this.a;
    int j = (int)(l ^ l >>> 32L);
    int k = this.b.hashCode();
    return this.c.hashCode() ^ ((j ^ 0xF4243) * 1000003 ^ k) * 1000003;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("PersistedEvent{id=");
    stringBuilder.append(this.a);
    stringBuilder.append(", transportContext=");
    stringBuilder.append(this.b);
    stringBuilder.append(", event=");
    stringBuilder.append(this.c);
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/c/i/x/j/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */