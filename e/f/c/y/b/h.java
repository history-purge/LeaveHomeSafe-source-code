package e.f.c.y.b;

public enum h {
  c(new int[] { 0, 0, 0 }, 0),
  d(new int[] { 10, 12, 14 }, 1),
  e(new int[] { 9, 11, 13 }, 2),
  f(new int[] { 0, 0, 0 }, 3),
  g(new int[] { 8, 16, 16 }, 4),
  h(new int[] { 0, 0, 0 }, 7),
  i(new int[] { 8, 10, 12 }, 8),
  j(new int[] { 0, 0, 0 }, 5),
  k(new int[] { 0, 0, 0 }, 9),
  l(new int[] { 8, 10, 12 }, 13);
  
  private final int bits;
  
  private final int[] characterCountBitsForVersions;
  
  h(int[] paramArrayOfint, int paramInt1) {
    this.characterCountBitsForVersions = paramArrayOfint;
    this.bits = paramInt1;
  }
  
  public static h f(int paramInt) {
    if (paramInt != 0) {
      if (paramInt != 1) {
        if (paramInt != 2) {
          if (paramInt != 3) {
            if (paramInt != 4) {
              if (paramInt != 5) {
                if (paramInt != 7) {
                  if (paramInt != 8) {
                    if (paramInt != 9) {
                      if (paramInt == 13)
                        return l; 
                      throw new IllegalArgumentException();
                    } 
                    return k;
                  } 
                  return i;
                } 
                return h;
              } 
              return j;
            } 
            return g;
          } 
          return f;
        } 
        return e;
      } 
      return d;
    } 
    return c;
  }
  
  public int a(j paramj) {
    int i = paramj.e();
    if (i <= 9) {
      i = 0;
    } else if (i <= 26) {
      i = 1;
    } else {
      i = 2;
    } 
    return this.characterCountBitsForVersions[i];
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/c/y/b/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */