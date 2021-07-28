package com.google.firebase.components;

public final class u {
  private final Class<?> a;
  
  private final int b;
  
  private final int c;
  
  private u(Class<?> paramClass, int paramInt1, int paramInt2) {
    d0.a(paramClass, "Null dependency anInterface.");
    this.a = paramClass;
    this.b = paramInt1;
    this.c = paramInt2;
  }
  
  @Deprecated
  public static u a(Class<?> paramClass) {
    return new u(paramClass, 0, 0);
  }
  
  private static String a(int paramInt) {
    if (paramInt != 0) {
      if (paramInt != 1) {
        if (paramInt == 2)
          return "deferred"; 
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unsupported injection: ");
        stringBuilder.append(paramInt);
        throw new AssertionError(stringBuilder.toString());
      } 
      return "provider";
    } 
    return "direct";
  }
  
  public static u b(Class<?> paramClass) {
    return new u(paramClass, 0, 1);
  }
  
  public static u c(Class<?> paramClass) {
    return new u(paramClass, 1, 0);
  }
  
  public static u d(Class<?> paramClass) {
    return new u(paramClass, 1, 1);
  }
  
  public static u e(Class<?> paramClass) {
    return new u(paramClass, 2, 0);
  }
  
  public Class<?> a() {
    return this.a;
  }
  
  public boolean b() {
    return (this.c == 2);
  }
  
  public boolean c() {
    return (this.c == 0);
  }
  
  public boolean d() {
    return (this.b == 1);
  }
  
  public boolean e() {
    return (this.b == 2);
  }
  
  public boolean equals(Object paramObject) {
    boolean bool = paramObject instanceof u;
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (bool) {
      paramObject = paramObject;
      bool1 = bool2;
      if (this.a == ((u)paramObject).a) {
        bool1 = bool2;
        if (this.b == ((u)paramObject).b) {
          bool1 = bool2;
          if (this.c == ((u)paramObject).c)
            bool1 = true; 
        } 
      } 
    } 
    return bool1;
  }
  
  public int hashCode() {
    return ((this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b) * 1000003 ^ this.c;
  }
  
  public String toString() {
    String str;
    StringBuilder stringBuilder = new StringBuilder("Dependency{anInterface=");
    stringBuilder.append(this.a);
    stringBuilder.append(", type=");
    int i = this.b;
    if (i == 1) {
      str = "required";
    } else if (i == 0) {
      str = "optional";
    } else {
      str = "set";
    } 
    stringBuilder.append(str);
    stringBuilder.append(", injection=");
    stringBuilder.append(a(this.c));
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/firebase/components/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */