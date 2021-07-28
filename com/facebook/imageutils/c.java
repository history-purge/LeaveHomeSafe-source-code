package com.facebook.imageutils;

import e.e.e.d.i;
import java.io.IOException;
import java.io.InputStream;

public class c {
  public static int a(int paramInt) {
    return e.a(paramInt);
  }
  
  public static int a(InputStream paramInputStream) {
    try {
      null = b(paramInputStream);
      return (null == 0) ? 0 : e.a(paramInputStream, null);
    } catch (IOException iOException) {
      return 0;
    } 
  }
  
  public static boolean a(InputStream paramInputStream, int paramInt) {
    i.a(paramInputStream);
    while (d.a(paramInputStream, 1, false) == 255) {
      int i;
      for (i = 255; i == 255; i = d.a(paramInputStream, 1, false));
      if (paramInt == 192 && b(i))
        return true; 
      if (i == paramInt)
        return true; 
      if (i == 216 || i == 1)
        continue; 
      if (i != 217) {
        if (i == 218)
          return false; 
        paramInputStream.skip((d.a(paramInputStream, 2, false) - 2));
      } 
    } 
    return false;
  }
  
  private static int b(InputStream paramInputStream) {
    if (a(paramInputStream, 225)) {
      int i = d.a(paramInputStream, 2, false) - 2;
      if (i > 6) {
        int j = d.a(paramInputStream, 4, false);
        int k = d.a(paramInputStream, 2, false);
        if (j == 1165519206 && k == 0)
          return i - 4 - 2; 
      } 
    } 
    return 0;
  }
  
  private static boolean b(int paramInt) {
    switch (paramInt) {
      default:
        return false;
      case 192:
      case 193:
      case 194:
      case 195:
      case 197:
      case 198:
      case 199:
      case 201:
      case 202:
      case 203:
      case 205:
      case 206:
      case 207:
        break;
    } 
    return true;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/imageutils/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */