package e.e.e.d;

public final class i {
  public static int a(int paramInt1, int paramInt2) {
    b(paramInt1, paramInt2, "index");
    return paramInt1;
  }
  
  public static <T> T a(T paramT) {
    if (paramT != null)
      return paramT; 
    throw new NullPointerException();
  }
  
  public static <T> T a(T paramT, Object paramObject) {
    if (paramT != null)
      return paramT; 
    throw new NullPointerException(String.valueOf(paramObject));
  }
  
  private static String a(int paramInt1, int paramInt2, String paramString) {
    if (paramInt1 < 0)
      return a("%s (%s) must not be negative", new Object[] { paramString, Integer.valueOf(paramInt1) }); 
    if (paramInt2 >= 0)
      return a("%s (%s) must be less than size (%s)", new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }); 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("negative size: ");
    stringBuilder.append(paramInt2);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  static String a(String paramString, Object... paramVarArgs) {
    paramString = String.valueOf(paramString);
    StringBuilder stringBuilder = new StringBuilder(paramString.length() + paramVarArgs.length * 16);
    int j = 0;
    int k = 0;
    while (j < paramVarArgs.length) {
      int m = paramString.indexOf("%s", k);
      if (m == -1)
        break; 
      stringBuilder.append(paramString.substring(k, m));
      stringBuilder.append(paramVarArgs[j]);
      k = m + 2;
      j++;
    } 
    stringBuilder.append(paramString.substring(k));
    if (j < paramVarArgs.length) {
      stringBuilder.append(" [");
      k = j + 1;
      stringBuilder.append(paramVarArgs[j]);
      for (j = k; j < paramVarArgs.length; j++) {
        stringBuilder.append(", ");
        stringBuilder.append(paramVarArgs[j]);
      } 
      stringBuilder.append(']');
    } 
    return stringBuilder.toString();
  }
  
  public static void a(boolean paramBoolean) {
    if (paramBoolean)
      return; 
    throw new IllegalArgumentException();
  }
  
  public static void a(boolean paramBoolean, Object paramObject) {
    if (paramBoolean)
      return; 
    throw new IllegalArgumentException(String.valueOf(paramObject));
  }
  
  public static void a(boolean paramBoolean, String paramString, Object... paramVarArgs) {
    if (paramBoolean)
      return; 
    throw new IllegalArgumentException(a(paramString, paramVarArgs));
  }
  
  public static int b(int paramInt1, int paramInt2, String paramString) {
    if (paramInt1 >= 0 && paramInt1 < paramInt2)
      return paramInt1; 
    throw new IndexOutOfBoundsException(a(paramInt1, paramInt2, paramString));
  }
  
  public static void b(boolean paramBoolean) {
    if (paramBoolean)
      return; 
    throw new IllegalStateException();
  }
  
  public static void b(boolean paramBoolean, Object paramObject) {
    if (paramBoolean)
      return; 
    throw new IllegalStateException(String.valueOf(paramObject));
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/e/d/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */