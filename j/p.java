package j;

final class p {
  final byte[] a = new byte[8192];
  
  int b;
  
  int c;
  
  boolean d;
  
  boolean e;
  
  p f;
  
  p g;
  
  p() {
    this.e = true;
    this.d = false;
  }
  
  p(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2) {
    this.b = paramInt1;
    this.c = paramInt2;
    this.d = paramBoolean1;
    this.e = paramBoolean2;
  }
  
  public final p a(int paramInt) {
    if (paramInt > 0 && paramInt <= this.c - this.b) {
      p p1;
      if (paramInt >= 1024) {
        p1 = c();
      } else {
        p1 = q.a();
        System.arraycopy(this.a, this.b, p1.a, 0, paramInt);
      } 
      p1.c = p1.b + paramInt;
      this.b += paramInt;
      this.g.a(p1);
      return p1;
    } 
    throw new IllegalArgumentException();
  }
  
  public final p a(p paramp) {
    paramp.g = this;
    paramp.f = this.f;
    this.f.g = paramp;
    this.f = paramp;
    return paramp;
  }
  
  public final void a() {
    p p1 = this.g;
    if (p1 != this) {
      int i;
      if (!p1.e)
        return; 
      int j = this.c - this.b;
      int k = p1.c;
      if (p1.d) {
        i = 0;
      } else {
        i = p1.b;
      } 
      if (j > 8192 - k + i)
        return; 
      a(this.g, j);
      b();
      q.a(this);
      return;
    } 
    throw new IllegalStateException();
  }
  
  public final void a(p paramp, int paramInt) {
    if (paramp.e) {
      int i = paramp.c;
      if (i + paramInt > 8192)
        if (!paramp.d) {
          int j = paramp.b;
          if (i + paramInt - j <= 8192) {
            byte[] arrayOfByte = paramp.a;
            System.arraycopy(arrayOfByte, j, arrayOfByte, 0, i - j);
            paramp.c -= paramp.b;
            paramp.b = 0;
          } else {
            throw new IllegalArgumentException();
          } 
        } else {
          throw new IllegalArgumentException();
        }  
      System.arraycopy(this.a, this.b, paramp.a, paramp.c, paramInt);
      paramp.c += paramInt;
      this.b += paramInt;
      return;
    } 
    throw new IllegalArgumentException();
  }
  
  public final p b() {
    p p1 = this.f;
    if (p1 == this)
      p1 = null; 
    p p2 = this.g;
    p2.f = this.f;
    this.f.g = p2;
    this.f = null;
    this.g = null;
    return p1;
  }
  
  final p c() {
    this.d = true;
    return new p(this.a, this.b, this.c, true, false);
  }
  
  final p d() {
    return new p((byte[])this.a.clone(), this.b, this.c, false, true);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/j/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */