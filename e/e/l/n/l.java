package e.e.l.n;

import android.net.Uri;
import android.util.Base64;
import e.e.e.b.a;
import e.e.e.d.i;
import e.e.e.g.h;
import e.e.l.k.d;
import e.e.l.o.c;
import java.io.ByteArrayInputStream;
import java.util.concurrent.Executor;

public class l extends z {
  public l(h paramh) {
    super((Executor)a.a(), paramh);
  }
  
  static byte[] a(String paramString) {
    i.a(paramString.substring(0, 5).equals("data:"));
    int i = paramString.indexOf(',');
    String str = paramString.substring(i + 1, paramString.length());
    return b(paramString.substring(0, i)) ? Base64.decode(str, 0) : Uri.decode(str).getBytes();
  }
  
  static boolean b(String paramString) {
    if (!paramString.contains(";"))
      return false; 
    String[] arrayOfString = paramString.split(";");
    return arrayOfString[arrayOfString.length - 1].equals("base64");
  }
  
  protected d a(c paramc) {
    byte[] arrayOfByte = a(paramc.p().toString());
    return a(new ByteArrayInputStream(arrayOfByte), arrayOfByte.length);
  }
  
  protected String a() {
    return "DataFetchProducer";
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/l/n/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */