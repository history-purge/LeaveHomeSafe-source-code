package e.e.e.f;

import e.e.e.d.f;
import java.util.Locale;
import java.util.Map;

public class a {
  public static final Map<String, String> a = f.of("mkv", "video/x-matroska", "glb", "model/gltf-binary");
  
  private static String a(String paramString) {
    int i = paramString.lastIndexOf('.');
    return (i < 0 || i == paramString.length() - 1) ? null : paramString.substring(i + 1);
  }
  
  public static String b(String paramString) {
    paramString = a(paramString);
    if (paramString == null)
      return null; 
    String str2 = paramString.toLowerCase(Locale.US);
    String str1 = b.a(str2);
    paramString = str1;
    if (str1 == null)
      paramString = a.get(str2); 
    return paramString;
  }
  
  public static boolean c(String paramString) {
    return (paramString != null && paramString.startsWith("video/"));
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/e/f/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */