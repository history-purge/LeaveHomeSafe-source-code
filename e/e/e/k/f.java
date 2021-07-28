package e.e.e.k;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import android.provider.MediaStore;
import java.net.MalformedURLException;
import java.net.URL;

public class f {
  private static final Uri a = Uri.withAppendedPath(ContactsContract.AUTHORITY_URI, "display_photo");
  
  public static Uri a(int paramInt) {
    return (new Uri.Builder()).scheme("res").path(String.valueOf(paramInt)).build();
  }
  
  public static String a(ContentResolver paramContentResolver, Uri paramUri) {
    String str;
    boolean bool = f(paramUri);
    ContentResolver contentResolver2 = null;
    ContentResolver contentResolver1 = null;
    if (bool) {
      try {
        Cursor cursor1;
        ContentResolver contentResolver;
        Cursor cursor2 = paramContentResolver.query(paramUri, null, null, null, null);
        paramContentResolver = contentResolver1;
        if (cursor2 != null) {
          paramContentResolver = contentResolver1;
          try {
            if (cursor2.moveToFirst()) {
              int i = cursor2.getColumnIndex("_data");
              paramContentResolver = contentResolver1;
              if (i != -1)
                String str1 = cursor2.getString(i); 
            } 
          } finally {
            contentResolver1 = null;
            cursor1 = cursor2;
          } 
        } 
      } finally {
        paramContentResolver = null;
        if (paramContentResolver != null)
          paramContentResolver.close(); 
      } 
    } else {
      contentResolver1 = contentResolver2;
      if (g(paramUri))
        str = paramUri.getPath(); 
    } 
    return str;
  }
  
  public static String a(Uri paramUri) {
    return (paramUri == null) ? null : paramUri.getScheme();
  }
  
  public static boolean b(Uri paramUri) {
    return "data".equals(a(paramUri));
  }
  
  public static boolean c(Uri paramUri) {
    return "asset".equals(a(paramUri));
  }
  
  public static boolean d(Uri paramUri) {
    String str = paramUri.toString();
    return (str.startsWith(MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString()) || str.startsWith(MediaStore.Images.Media.INTERNAL_CONTENT_URI.toString()));
  }
  
  public static boolean e(Uri paramUri) {
    return (f(paramUri) && "com.android.contacts".equals(paramUri.getAuthority()) && !paramUri.getPath().startsWith(a.getPath()));
  }
  
  public static boolean f(Uri paramUri) {
    return "content".equals(a(paramUri));
  }
  
  public static boolean g(Uri paramUri) {
    return "file".equals(a(paramUri));
  }
  
  public static boolean h(Uri paramUri) {
    return "res".equals(a(paramUri));
  }
  
  public static boolean i(Uri paramUri) {
    String str = a(paramUri);
    return ("https".equals(str) || "http".equals(str));
  }
  
  public static boolean j(Uri paramUri) {
    return "android.resource".equals(a(paramUri));
  }
  
  public static URL k(Uri paramUri) {
    if (paramUri == null)
      return null; 
    try {
      return new URL(paramUri.toString());
    } catch (MalformedURLException malformedURLException) {
      throw new RuntimeException(malformedURLException);
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/e/k/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */