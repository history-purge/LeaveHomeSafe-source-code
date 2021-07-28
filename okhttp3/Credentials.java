package okhttp3;

import j.f;
import java.nio.charset.Charset;
import okhttp3.internal.Util;

public final class Credentials {
  public static String basic(String paramString1, String paramString2) {
    return basic(paramString1, paramString2, Util.ISO_8859_1);
  }
  
  public static String basic(String paramString1, String paramString2, Charset paramCharset) {
    StringBuilder stringBuilder2 = new StringBuilder();
    stringBuilder2.append(paramString1);
    stringBuilder2.append(":");
    stringBuilder2.append(paramString2);
    paramString1 = f.a(stringBuilder2.toString(), paramCharset).a();
    StringBuilder stringBuilder1 = new StringBuilder();
    stringBuilder1.append("Basic ");
    stringBuilder1.append(paramString1);
    return stringBuilder1.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/okhttp3/Credentials.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */