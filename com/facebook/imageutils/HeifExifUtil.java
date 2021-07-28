package com.facebook.imageutils;

import android.media.ExifInterface;
import android.os.Build;
import com.facebook.soloader.d;
import e.e.e.e.a;
import java.io.IOException;
import java.io.InputStream;

public class HeifExifUtil {
  public static int a(InputStream paramInputStream) {
    if (Build.VERSION.SDK_INT >= 24)
      return HeifExifUtilAndroidN.a(paramInputStream); 
    a.a("HeifExifUtil", "Trying to read Heif Exif information before Android N -> ignoring");
    return 0;
  }
  
  @d
  private static class HeifExifUtilAndroidN {
    static int a(InputStream param1InputStream) {
      try {
        return (new ExifInterface(param1InputStream)).getAttributeInt("Orientation", 1);
      } catch (IOException iOException) {
        a.a("HeifExifUtil", "Failed reading Heif Exif orientation -> ignoring", iOException);
        return 0;
      } 
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/imageutils/HeifExifUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */