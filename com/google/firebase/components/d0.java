package com.google.firebase.components;

public final class d0 {
  public static <T> T a(T paramT) {
    if (paramT != null)
      return paramT; 
    throw new NullPointerException();
  }
  
  public static <T> T a(T paramT, String paramString) {
    if (paramT != null)
      return paramT; 
    throw new NullPointerException(paramString);
  }
  
  public static void a(boolean paramBoolean, String paramString) {
    if (paramBoolean)
      return; 
    throw new IllegalArgumentException(paramString);
  }
  
  public static void b(boolean paramBoolean, String paramString) {
    if (paramBoolean)
      return; 
    throw new IllegalStateException(paramString);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/firebase/components/d0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */