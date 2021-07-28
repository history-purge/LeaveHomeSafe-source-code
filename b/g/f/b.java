package b.g.f;

import android.graphics.Insets;

public final class b {
  public static final b e = new b(0, 0, 0, 0);
  
  public final int a;
  
  public final int b;
  
  public final int c;
  
  public final int d;
  
  private b(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramInt3;
    this.d = paramInt4;
  }
  
  public static b a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return (paramInt1 == 0 && paramInt2 == 0 && paramInt3 == 0 && paramInt4 == 0) ? e : new b(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public Insets a() {
    return Insets.of(this.a, this.b, this.c, this.d);
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject != null) {
      if (b.class != paramObject.getClass())
        return false; 
      paramObject = paramObject;
      return (this.d != ((b)paramObject).d) ? false : ((this.a != ((b)paramObject).a) ? false : ((this.c != ((b)paramObject).c) ? false : (!(this.b != ((b)paramObject).b))));
    } 
    return false;
  }
  
  public int hashCode() {
    return ((this.a * 31 + this.b) * 31 + this.c) * 31 + this.d;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Insets{left=");
    stringBuilder.append(this.a);
    stringBuilder.append(", top=");
    stringBuilder.append(this.b);
    stringBuilder.append(", right=");
    stringBuilder.append(this.c);
    stringBuilder.append(", bottom=");
    stringBuilder.append(this.d);
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/g/f/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */