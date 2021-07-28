package e.a.a.j;

import e.a.a.a;
import e.a.a.d;

class e implements a {
  public static void a(Object paramObject) {
    if (paramObject != null) {
      if (paramObject instanceof String) {
        if (((String)paramObject).length() != 0)
          return; 
        throw new d("Parameter must not be null or empty", 4);
      } 
      return;
    } 
    throw new d("Parameter must not be null", 4);
  }
  
  public static void a(String paramString) {
    if (paramString != null && paramString.length() != 0)
      return; 
    throw new d("Empty array name", 4);
  }
  
  public static void b(String paramString) {
    if (paramString != null && paramString.length() != 0)
      return; 
    throw new d("Empty prefix", 4);
  }
  
  public static void c(String paramString) {
    if (paramString != null && paramString.length() != 0)
      return; 
    throw new d("Empty property name", 4);
  }
  
  public static void d(String paramString) {
    if (paramString != null && paramString.length() != 0)
      return; 
    throw new d("Empty schema namespace URI", 4);
  }
  
  public static void e(String paramString) {
    if (paramString != null && paramString.length() != 0)
      return; 
    throw new d("Empty specific language", 4);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/a/a/j/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */