package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

final class c0 extends Writer {
  private final String c;
  
  private StringBuilder d = new StringBuilder(128);
  
  c0(String paramString) {
    this.c = paramString;
  }
  
  private void a() {
    if (this.d.length() > 0) {
      Log.d(this.c, this.d.toString());
      StringBuilder stringBuilder = this.d;
      stringBuilder.delete(0, stringBuilder.length());
    } 
  }
  
  public void close() {
    a();
  }
  
  public void flush() {
    a();
  }
  
  public void write(char[] paramArrayOfchar, int paramInt1, int paramInt2) {
    int i;
    for (i = 0; i < paramInt2; i++) {
      char c = paramArrayOfchar[paramInt1 + i];
      if (c == '\n') {
        a();
      } else {
        this.d.append(c);
      } 
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/fragment/app/c0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */