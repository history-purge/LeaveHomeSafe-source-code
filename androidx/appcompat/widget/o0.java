package androidx.appcompat.widget;

class o0 {
  private int a = 0;
  
  private int b = 0;
  
  private int c = Integer.MIN_VALUE;
  
  private int d = Integer.MIN_VALUE;
  
  private int e = 0;
  
  private int f = 0;
  
  private boolean g = false;
  
  private boolean h = false;
  
  public int a() {
    return this.g ? this.a : this.b;
  }
  
  public void a(int paramInt1, int paramInt2) {
    this.h = false;
    if (paramInt1 != Integer.MIN_VALUE) {
      this.e = paramInt1;
      this.a = paramInt1;
    } 
    if (paramInt2 != Integer.MIN_VALUE) {
      this.f = paramInt2;
      this.b = paramInt2;
    } 
  }
  
  public void a(boolean paramBoolean) {
    if (paramBoolean == this.g)
      return; 
    this.g = paramBoolean;
    if (this.h) {
      if (paramBoolean) {
        int j = this.d;
        if (j == Integer.MIN_VALUE)
          j = this.e; 
        this.a = j;
        j = this.c;
        if (j != Integer.MIN_VALUE) {
          this.b = j;
          return;
        } 
      } else {
        int j = this.c;
        if (j == Integer.MIN_VALUE)
          j = this.e; 
        this.a = j;
        j = this.d;
        if (j != Integer.MIN_VALUE) {
          this.b = j;
          return;
        } 
      } 
    } else {
      this.a = this.e;
    } 
    int i = this.f;
    this.b = i;
  }
  
  public int b() {
    return this.a;
  }
  
  public void b(int paramInt1, int paramInt2) {
    this.c = paramInt1;
    this.d = paramInt2;
    this.h = true;
    if (this.g) {
      if (paramInt2 != Integer.MIN_VALUE)
        this.a = paramInt2; 
      if (paramInt1 != Integer.MIN_VALUE) {
        this.b = paramInt1;
        return;
      } 
    } else {
      if (paramInt1 != Integer.MIN_VALUE)
        this.a = paramInt1; 
      if (paramInt2 != Integer.MIN_VALUE)
        this.b = paramInt2; 
    } 
  }
  
  public int c() {
    return this.b;
  }
  
  public int d() {
    return this.g ? this.b : this.a;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/appcompat/widget/o0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */