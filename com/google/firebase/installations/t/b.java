package com.google.firebase.installations.t;

public class b implements a {
  private static b a;
  
  public static b b() {
    if (a == null)
      a = new b(); 
    return a;
  }
  
  public long a() {
    return System.currentTimeMillis();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/firebase/installations/t/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */