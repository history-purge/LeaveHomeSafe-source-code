package e.e.l.n;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import e.e.e.g.h;
import e.e.e.k.f;
import e.e.l.k.d;
import e.e.l.o.c;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;

public class w extends z {
  private static final String[] d = new String[] { "_id", "_data" };
  
  private final ContentResolver c;
  
  public w(Executor paramExecutor, h paramh, ContentResolver paramContentResolver) {
    super(paramExecutor, paramh);
    this.c = paramContentResolver;
  }
  
  private static int a(String paramString) {
    return (paramString == null) ? -1 : (int)(new File(paramString)).length();
  }
  
  private d a(Uri paramUri) {
    Cursor cursor = this.c.query(paramUri, d, null, null, null);
    if (cursor == null)
      return null; 
    try {
      int i = cursor.getCount();
      if (i == 0)
        return null; 
      cursor.moveToFirst();
      String str = cursor.getString(cursor.getColumnIndex("_data"));
      if (str != null)
        return b(new FileInputStream(str), a(str)); 
      return null;
    } finally {
      cursor.close();
    } 
  }
  
  protected d a(c paramc) {
    Uri uri = paramc.p();
    if (f.e(uri)) {
      StringBuilder stringBuilder;
      if (uri.toString().endsWith("/photo")) {
        InputStream inputStream = this.c.openInputStream(uri);
      } else {
        if (uri.toString().endsWith("/display_photo"))
          try {
            FileInputStream fileInputStream = this.c.openAssetFileDescriptor(uri, "r").createInputStream();
            return b(fileInputStream, -1);
          } catch (IOException iOException) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Contact photo does not exist: ");
            stringBuilder.append(uri);
            throw new IOException(stringBuilder.toString());
          }  
        InputStream inputStream = ContactsContract.Contacts.openContactPhotoInputStream(this.c, uri);
        if (inputStream == null) {
          stringBuilder = new StringBuilder();
          stringBuilder.append("Contact photo does not exist: ");
          stringBuilder.append(uri);
          throw new IOException(stringBuilder.toString());
        } 
      } 
      return b((InputStream)stringBuilder, -1);
    } 
    if (f.d(uri)) {
      d d = a(uri);
      if (d != null)
        return d; 
    } 
    return b(this.c.openInputStream(uri), -1);
  }
  
  protected String a() {
    return "LocalContentUriFetchProducer";
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/l/n/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */