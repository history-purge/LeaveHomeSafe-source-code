package e.e.e.d;

import java.util.Arrays;

public final class h {
  public static int a(Object... paramVarArgs) {
    return Arrays.hashCode(paramVarArgs);
  }
  
  public static b a(Object paramObject) {
    return new b(a(paramObject.getClass()), null);
  }
  
  private static String a(Class<?> paramClass) {
    String str = paramClass.getName().replaceAll("\\$[0-9]+", "\\$");
    int j = str.lastIndexOf('$');
    int i = j;
    if (j == -1)
      i = str.lastIndexOf('.'); 
    return str.substring(i + 1);
  }
  
  public static boolean a(Object paramObject1, Object paramObject2) {
    return (paramObject1 == paramObject2 || (paramObject1 != null && paramObject1.equals(paramObject2)));
  }
  
  public static final class b {
    private final String a;
    
    private a b = new a(null);
    
    private a c = this.b;
    
    private boolean d = false;
    
    private b(String param1String) {
      i.a(param1String);
      this.a = param1String;
    }
    
    private a a() {
      a a1 = new a(null);
      this.c.c = a1;
      this.c = a1;
      return a1;
    }
    
    private b b(String param1String, Object param1Object) {
      a a1 = a();
      a1.b = param1Object;
      i.a(param1String);
      a1.a = param1String;
      return this;
    }
    
    public b a(String param1String, int param1Int) {
      b(param1String, String.valueOf(param1Int));
      return this;
    }
    
    public b a(String param1String, Object param1Object) {
      b(param1String, param1Object);
      return this;
    }
    
    public b a(String param1String, boolean param1Boolean) {
      b(param1String, String.valueOf(param1Boolean));
      return this;
    }
    
    public String toString() {
      // Byte code:
      //   0: aload_0
      //   1: getfield d : Z
      //   4: istore_1
      //   5: new java/lang/StringBuilder
      //   8: dup
      //   9: bipush #32
      //   11: invokespecial <init> : (I)V
      //   14: astore #5
      //   16: aload #5
      //   18: aload_0
      //   19: getfield a : Ljava/lang/String;
      //   22: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   25: pop
      //   26: aload #5
      //   28: bipush #123
      //   30: invokevirtual append : (C)Ljava/lang/StringBuilder;
      //   33: pop
      //   34: aload_0
      //   35: getfield b : Le/e/e/d/h$b$a;
      //   38: getfield c : Le/e/e/d/h$b$a;
      //   41: astore_2
      //   42: ldc ''
      //   44: astore_3
      //   45: aload_2
      //   46: ifnull -> 119
      //   49: iload_1
      //   50: ifeq -> 63
      //   53: aload_3
      //   54: astore #4
      //   56: aload_2
      //   57: getfield b : Ljava/lang/Object;
      //   60: ifnull -> 108
      //   63: aload #5
      //   65: aload_3
      //   66: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   69: pop
      //   70: aload_2
      //   71: getfield a : Ljava/lang/String;
      //   74: astore_3
      //   75: aload_3
      //   76: ifnull -> 94
      //   79: aload #5
      //   81: aload_3
      //   82: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   85: pop
      //   86: aload #5
      //   88: bipush #61
      //   90: invokevirtual append : (C)Ljava/lang/StringBuilder;
      //   93: pop
      //   94: aload #5
      //   96: aload_2
      //   97: getfield b : Ljava/lang/Object;
      //   100: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      //   103: pop
      //   104: ldc ', '
      //   106: astore #4
      //   108: aload_2
      //   109: getfield c : Le/e/e/d/h$b$a;
      //   112: astore_2
      //   113: aload #4
      //   115: astore_3
      //   116: goto -> 45
      //   119: aload #5
      //   121: bipush #125
      //   123: invokevirtual append : (C)Ljava/lang/StringBuilder;
      //   126: pop
      //   127: aload #5
      //   129: invokevirtual toString : ()Ljava/lang/String;
      //   132: areturn
    }
    
    private static final class a {
      String a;
      
      Object b;
      
      a c;
      
      private a() {}
    }
  }
  
  private static final class a {
    String a;
    
    Object b;
    
    a c;
    
    private a() {}
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/e/d/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */