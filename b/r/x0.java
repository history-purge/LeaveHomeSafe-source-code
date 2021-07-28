package b.r;

import android.os.IBinder;

class x0 implements z0 {
  private final IBinder a;
  
  x0(IBinder paramIBinder) {
    this.a = paramIBinder;
  }
  
  public boolean equals(Object paramObject) {
    return (paramObject instanceof x0 && ((x0)paramObject).a.equals(this.a));
  }
  
  public int hashCode() {
    return this.a.hashCode();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/r/x0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */