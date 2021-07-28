package k.a.a.a;

public class b {
  public static boolean a(CharSequence paramCharSequence) {
    if (paramCharSequence != null) {
      if (c(paramCharSequence))
        return false; 
      int j = paramCharSequence.length();
      for (int i = 0; i < j; i++) {
        if (!Character.isLowerCase(paramCharSequence.charAt(i)))
          return false; 
      } 
      return true;
    } 
    return false;
  }
  
  public static boolean b(CharSequence paramCharSequence) {
    if (paramCharSequence != null) {
      if (c(paramCharSequence))
        return false; 
      int j = paramCharSequence.length();
      for (int i = 0; i < j; i++) {
        if (!Character.isUpperCase(paramCharSequence.charAt(i)))
          return false; 
      } 
      return true;
    } 
    return false;
  }
  
  public static boolean c(CharSequence paramCharSequence) {
    return (paramCharSequence == null || paramCharSequence.length() == 0);
  }
  
  public static boolean d(CharSequence paramCharSequence) {
    if (c(paramCharSequence))
      return false; 
    int j = paramCharSequence.length();
    for (int i = 0; i < j; i++) {
      if (!Character.isDigit(paramCharSequence.charAt(i)))
        return false; 
    } 
    return true;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/k/a/a/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */