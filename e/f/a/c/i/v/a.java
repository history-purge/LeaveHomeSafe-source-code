package e.f.a.c.i.v;

import android.util.Log;

public final class a {
  private static String a(String paramString) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("TransportRuntime.");
    stringBuilder.append(paramString);
    return stringBuilder.toString();
  }
  
  public static void a(String paramString1, String paramString2) {
    Log.i(a(paramString1), paramString2);
  }
  
  public static void a(String paramString1, String paramString2, Object paramObject) {
    Log.d(a(paramString1), String.format(paramString2, new Object[] { paramObject }));
  }
  
  public static void a(String paramString1, String paramString2, Throwable paramThrowable) {
    Log.e(a(paramString1), paramString2, paramThrowable);
  }
  
  public static void a(String paramString1, String paramString2, Object... paramVarArgs) {
    Log.d(a(paramString1), String.format(paramString2, paramVarArgs));
  }
  
  public static void b(String paramString1, String paramString2, Object paramObject) {
    Log.w(a(paramString1), String.format(paramString2, new Object[] { paramObject }));
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/c/i/v/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */