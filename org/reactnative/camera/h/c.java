package org.reactnative.camera.h;

import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

public class c {
  public static File a(File paramFile) {
    if (!paramFile.isDirectory()) {
      if (paramFile.mkdirs())
        return paramFile; 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Couldn't create directory '");
      stringBuilder.append(paramFile);
      stringBuilder.append("'");
      throw new IOException(stringBuilder.toString());
    } 
    return paramFile;
  }
  
  public static String a(File paramFile, String paramString) {
    a(paramFile);
    String str = UUID.randomUUID().toString();
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramFile);
    stringBuilder.append(File.separator);
    stringBuilder.append(str);
    stringBuilder.append(paramString);
    return stringBuilder.toString();
  }
  
  public static Uri b(File paramFile) {
    return Uri.fromFile(paramFile);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/org/reactnative/camera/h/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */