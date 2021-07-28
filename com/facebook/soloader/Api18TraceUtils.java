package com.facebook.soloader;

import android.annotation.TargetApi;
import android.os.Trace;

@TargetApi(18)
@d
class Api18TraceUtils {
  public static void a() {
    Trace.endSection();
  }
  
  public static void a(String paramString1, String paramString2, String paramString3) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramString1);
    stringBuilder.append(paramString2);
    stringBuilder.append(paramString3);
    String str2 = stringBuilder.toString();
    String str1 = str2;
    if (str2.length() > 127) {
      str1 = str2;
      if (paramString2 != null) {
        int i = paramString1.length();
        int j = paramString3.length();
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(paramString1);
        stringBuilder1.append(paramString2.substring(0, 127 - i - j));
        stringBuilder1.append(paramString3);
        str1 = stringBuilder1.toString();
      } 
    } 
    Trace.beginSection(str1);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/soloader/Api18TraceUtils.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */