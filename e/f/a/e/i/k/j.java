package e.f.a.e.i.k;

final class j {
  static int a(Object paramObject) {
    int i;
    if (paramObject == null) {
      i = 0;
    } else {
      i = paramObject.hashCode();
    } 
    return (int)(Integer.rotateLeft((int)(i * -862048943L), 15) * 461845907L);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/k/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */