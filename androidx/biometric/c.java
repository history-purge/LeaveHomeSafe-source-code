package androidx.biometric;

import java.util.Arrays;

class c {
  private final int a;
  
  private final CharSequence b;
  
  c(int paramInt, CharSequence paramCharSequence) {
    this.a = paramInt;
    this.b = paramCharSequence;
  }
  
  private static String a(CharSequence paramCharSequence) {
    return (paramCharSequence != null) ? paramCharSequence.toString() : null;
  }
  
  private boolean b(CharSequence paramCharSequence) {
    String str = a(this.b);
    paramCharSequence = a(paramCharSequence);
    return ((str == null && paramCharSequence == null) || (str != null && str.equals(paramCharSequence)));
  }
  
  int a() {
    return this.a;
  }
  
  CharSequence b() {
    return this.b;
  }
  
  public boolean equals(Object paramObject) {
    boolean bool = paramObject instanceof c;
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (bool) {
      paramObject = paramObject;
      bool1 = bool2;
      if (this.a == ((c)paramObject).a) {
        bool1 = bool2;
        if (b(((c)paramObject).b))
          bool1 = true; 
      } 
    } 
    return bool1;
  }
  
  public int hashCode() {
    return Arrays.hashCode(new Object[] { Integer.valueOf(this.a), a(this.b) });
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/biometric/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */