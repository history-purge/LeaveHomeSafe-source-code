package e.e.e.e;

import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;

public class b implements c {
  public static final b c = new b();
  
  private String a = "unknown";
  
  private int b = 5;
  
  public static b a() {
    return c;
  }
  
  private String a(String paramString) {
    String str = paramString;
    if (this.a != null) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(this.a);
      stringBuilder.append(":");
      stringBuilder.append(paramString);
      str = stringBuilder.toString();
    } 
    return str;
  }
  
  private static String a(String paramString, Throwable paramThrowable) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramString);
    stringBuilder.append('\n');
    stringBuilder.append(a(paramThrowable));
    return stringBuilder.toString();
  }
  
  private static String a(Throwable paramThrowable) {
    if (paramThrowable == null)
      return ""; 
    StringWriter stringWriter = new StringWriter();
    paramThrowable.printStackTrace(new PrintWriter(stringWriter));
    return stringWriter.toString();
  }
  
  private void a(int paramInt, String paramString1, String paramString2) {
    Log.println(paramInt, a(paramString1), paramString2);
  }
  
  private void a(int paramInt, String paramString1, String paramString2, Throwable paramThrowable) {
    Log.println(paramInt, a(paramString1), a(paramString2, paramThrowable));
  }
  
  public void a(String paramString1, String paramString2) {
    a(5, paramString1, paramString2);
  }
  
  public void a(String paramString1, String paramString2, Throwable paramThrowable) {
    a(3, paramString1, paramString2, paramThrowable);
  }
  
  public boolean a(int paramInt) {
    return (this.b <= paramInt);
  }
  
  public void b(String paramString1, String paramString2) {
    a(4, paramString1, paramString2);
  }
  
  public void b(String paramString1, String paramString2, Throwable paramThrowable) {
    a(6, paramString1, paramString2, paramThrowable);
  }
  
  public void c(String paramString1, String paramString2) {
    a(6, paramString1, paramString2);
  }
  
  public void c(String paramString1, String paramString2, Throwable paramThrowable) {
    a(5, paramString1, paramString2, paramThrowable);
  }
  
  public void d(String paramString1, String paramString2) {
    a(2, paramString1, paramString2);
  }
  
  public void d(String paramString1, String paramString2, Throwable paramThrowable) {
    a(6, paramString1, paramString2, paramThrowable);
  }
  
  public void e(String paramString1, String paramString2) {
    a(6, paramString1, paramString2);
  }
  
  public void f(String paramString1, String paramString2) {
    a(3, paramString1, paramString2);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/e/e/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */