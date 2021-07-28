package com.facebook.imageutils;

import java.io.IOException;
import java.io.InputStream;

class d {
  public static int a(InputStream paramInputStream, int paramInt, boolean paramBoolean) {
    int j = 0;
    int i = 0;
    while (j < paramInt) {
      int k = paramInputStream.read();
      if (k != -1) {
        if (paramBoolean) {
          k = (k & 0xFF) << j * 8;
        } else {
          i <<= 8;
          k &= 0xFF;
        } 
        i |= k;
        j++;
        continue;
      } 
      throw new IOException("no more bytes");
    } 
    return i;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/imageutils/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */