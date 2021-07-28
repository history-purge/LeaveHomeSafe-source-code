package e.f.a.e.i.i;

public final class k0 {
  public static int a(int paramInt1, int paramInt2, String paramString) {
    if (paramInt1 < 0 || paramInt1 >= paramInt2) {
      if (paramInt1 >= 0) {
        if (paramInt2 < 0) {
          StringBuilder stringBuilder = new StringBuilder(26);
          stringBuilder.append("negative size: ");
          stringBuilder.append(paramInt2);
          throw new IllegalArgumentException(stringBuilder.toString());
        } 
        paramString = b.a("%s (%s) must be less than size (%s)", new Object[] { "index", Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      } else {
        paramString = b.a("%s (%s) must not be negative", new Object[] { "index", Integer.valueOf(paramInt1) });
      } 
      throw new IndexOutOfBoundsException(paramString);
    } 
    return paramInt1;
  }
  
  public static void a(int paramInt1, int paramInt2, int paramInt3) {
    if (paramInt1 < 0 || paramInt2 < paramInt1 || paramInt2 > paramInt3) {
      String str;
      if (paramInt1 >= 0 && paramInt1 <= paramInt3) {
        if (paramInt2 < 0 || paramInt2 > paramInt3) {
          String str1 = c(paramInt2, paramInt3, "end index");
          throw new IndexOutOfBoundsException(str1);
        } 
        str = b.a("end index (%s) must not be less than start index (%s)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt1) });
      } else {
        str = c(paramInt1, paramInt3, "start index");
      } 
      throw new IndexOutOfBoundsException(str);
    } 
  }
  
  public static int b(int paramInt1, int paramInt2, String paramString) {
    if (paramInt1 >= 0 && paramInt1 <= paramInt2)
      return paramInt1; 
    throw new IndexOutOfBoundsException(c(paramInt1, paramInt2, "index"));
  }
  
  private static String c(int paramInt1, int paramInt2, String paramString) {
    if (paramInt1 < 0)
      return b.a("%s (%s) must not be negative", new Object[] { paramString, Integer.valueOf(paramInt1) }); 
    if (paramInt2 >= 0)
      return b.a("%s (%s) must not be greater than size (%s)", new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }); 
    StringBuilder stringBuilder = new StringBuilder(26);
    stringBuilder.append("negative size: ");
    stringBuilder.append(paramInt2);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/i/k0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */