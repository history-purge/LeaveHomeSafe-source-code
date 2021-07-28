package net.time4j.f1;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PushbackInputStream;
import java.io.Reader;

class g extends Reader {
  private final PushbackInputStream c;
  
  private BufferedReader d = null;
  
  g(InputStream paramInputStream) {
    this.c = new PushbackInputStream(paramInputStream, 3);
  }
  
  private void b() {
    if (this.d != null)
      return; 
    byte[] arrayOfByte = new byte[3];
    int i = this.c.read(arrayOfByte, 0, 3);
    boolean bool = true;
    if (i != 3 || arrayOfByte[0] != -17 || arrayOfByte[1] != -69 || arrayOfByte[2] != -65)
      bool = false; 
    if (!bool && i > 0)
      this.c.unread(arrayOfByte, 0, i); 
    this.d = new BufferedReader(new InputStreamReader(this.c, "UTF-8"));
  }
  
  public String a() {
    b();
    return this.d.readLine();
  }
  
  public void close() {
    BufferedReader bufferedReader = this.d;
    if (bufferedReader == null) {
      this.c.close();
      return;
    } 
    bufferedReader.close();
  }
  
  public int read(char[] paramArrayOfchar, int paramInt1, int paramInt2) {
    b();
    return this.d.read(paramArrayOfchar, paramInt1, paramInt2);
  }
  
  public boolean ready() {
    b();
    return this.d.ready();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/f1/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */