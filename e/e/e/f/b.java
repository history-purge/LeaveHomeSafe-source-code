package e.e.e.f;

import android.webkit.MimeTypeMap;
import e.e.e.d.f;
import java.util.Map;

public class b {
  private static final MimeTypeMap a = MimeTypeMap.getSingleton();
  
  private static final Map<String, String> b = f.of("heif", "image/heif", "heic", "image/heic");
  
  public static String a(String paramString) {
    String str = b.get(paramString);
    return (str != null) ? str : a.getMimeTypeFromExtension(paramString);
  }
  
  static {
    f.of("image/heif", "heif", "image/heic", "heic");
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/e/f/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */