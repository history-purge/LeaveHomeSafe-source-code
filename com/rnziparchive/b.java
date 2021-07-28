package com.rnziparchive;

import e.e.e.d.i;
import java.io.InputStream;
import java.io.OutputStream;

public class b {
  public static long a(InputStream paramInputStream, OutputStream paramOutputStream, a parama) {
    i.a(paramInputStream);
    i.a(paramOutputStream);
    byte[] arrayOfByte = new byte[4096];
    long l = 0L;
    while (true) {
      int i = paramInputStream.read(arrayOfByte);
      if (i == -1)
        return l; 
      paramOutputStream.write(arrayOfByte, 0, i);
      long l2 = i;
      long l1 = l + l2;
      l = l1;
      if (parama != null) {
        parama.a(l2);
        l = l1;
      } 
    } 
  }
  
  public static interface a {
    void a(long param1Long);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/rnziparchive/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */