package com.facebook.imageutils;

import java.io.InputStream;

class e {
  private static final Class<?> a = e.class;
  
  public static int a(int paramInt) {
    return (paramInt != 0 && paramInt != 1) ? ((paramInt != 3) ? ((paramInt != 6) ? ((paramInt != 8) ? 0 : 270) : 90) : 180) : 0;
  }
  
  public static int a(InputStream paramInputStream, int paramInt) {
    b b = new b(null);
    paramInt = a(paramInputStream, paramInt, b);
    int i = b.c - 8;
    if (paramInt == 0 || i > paramInt)
      return 0; 
    paramInputStream.skip(i);
    return a(paramInputStream, a(paramInputStream, paramInt - i, b.a, 274), b.a);
  }
  
  private static int a(InputStream paramInputStream, int paramInt, b paramb) {
    Class<?> clazz;
    String str;
    boolean bool;
    if (paramInt <= 8)
      return 0; 
    paramb.b = d.a(paramInputStream, 4, false);
    int i = paramb.b;
    if (i != 1229531648 && i != 1296891946) {
      clazz = a;
      str = "Invalid TIFF header";
      e.e.e.e.a.a(clazz, str);
      return 0;
    } 
    if (((b)str).b == 1229531648) {
      bool = true;
    } else {
      bool = false;
    } 
    ((b)str).a = bool;
    ((b)str).c = d.a((InputStream)clazz, 4, ((b)str).a);
    paramInt = paramInt - 4 - 4;
    i = ((b)str).c;
    if (i < 8 || i - 8 > paramInt) {
      clazz = a;
      str = "Invalid offset";
      e.e.e.e.a.a(clazz, str);
      return 0;
    } 
    return paramInt;
  }
  
  private static int a(InputStream paramInputStream, int paramInt, boolean paramBoolean) {
    if (paramInt < 10)
      return 0; 
    if (d.a(paramInputStream, 2, paramBoolean) != 3)
      return 0; 
    if (d.a(paramInputStream, 4, paramBoolean) != 1)
      return 0; 
    paramInt = d.a(paramInputStream, 2, paramBoolean);
    d.a(paramInputStream, 2, paramBoolean);
    return paramInt;
  }
  
  private static int a(InputStream paramInputStream, int paramInt1, boolean paramBoolean, int paramInt2) {
    if (paramInt1 < 14)
      return 0; 
    int j = d.a(paramInputStream, 2, paramBoolean);
    int i = paramInt1 - 2;
    for (paramInt1 = j; paramInt1 > 0 && i >= 12; paramInt1--) {
      j = d.a(paramInputStream, 2, paramBoolean);
      i -= 2;
      if (j == paramInt2)
        return i; 
      paramInputStream.skip(10L);
      i -= 10;
    } 
    return 0;
  }
  
  private static class b {
    boolean a;
    
    int b;
    
    int c;
    
    private b() {}
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/imageutils/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */