package g.c.a;

import java.util.Arrays;

public class b {
  private static <T extends Throwable> T a(T paramT) {
    a(paramT, b.class.getName());
    return paramT;
  }
  
  static <T extends Throwable> T a(T paramT, String paramString) {
    StackTraceElement[] arrayOfStackTraceElement = paramT.getStackTrace();
    int k = arrayOfStackTraceElement.length;
    int j = -1;
    for (int i = 0; i < k; i++) {
      if (paramString.equals(arrayOfStackTraceElement[i].getClassName()))
        j = i; 
    } 
    paramT.setStackTrace(Arrays.<StackTraceElement>copyOfRange(arrayOfStackTraceElement, j + 1, k));
    return paramT;
  }
  
  public static void a(Object paramObject, String paramString) {
    if (paramObject != null)
      return; 
    paramObject = new StringBuilder();
    paramObject.append(paramString);
    paramObject.append(" must not be null");
    paramObject = new IllegalStateException(paramObject.toString());
    a(paramObject);
    throw (IllegalStateException)paramObject;
  }
  
  private static void a(String paramString) {
    StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
    String str1 = stackTraceElement.getClassName();
    String str2 = stackTraceElement.getMethodName();
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Parameter specified as non-null is null: method ");
    stringBuilder.append(str1);
    stringBuilder.append(".");
    stringBuilder.append(str2);
    stringBuilder.append(", parameter ");
    stringBuilder.append(paramString);
    IllegalArgumentException illegalArgumentException = new IllegalArgumentException(stringBuilder.toString());
    a(illegalArgumentException);
    throw illegalArgumentException;
  }
  
  public static void b(Object paramObject, String paramString) {
    if (paramObject != null)
      return; 
    a(paramString);
    throw null;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/g/c/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */