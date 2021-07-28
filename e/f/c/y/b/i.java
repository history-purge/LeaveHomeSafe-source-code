package e.f.c.y.b;

import e.f.c.p;

public final class i {
  private final boolean a;
  
  i(boolean paramBoolean) {
    this.a = paramBoolean;
  }
  
  public void a(p[] paramArrayOfp) {
    if (this.a && paramArrayOfp != null) {
      if (paramArrayOfp.length < 3)
        return; 
      p p1 = paramArrayOfp[0];
      paramArrayOfp[0] = paramArrayOfp[2];
      paramArrayOfp[2] = p1;
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/c/y/b/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */