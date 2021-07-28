package com.RNFetchBlob.Utils;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import com.RNFetchBlob.h;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

public class a {
  private static String a(ContentResolver paramContentResolver, Uri paramUri) {
    Cursor cursor = paramContentResolver.query(paramUri, null, null, null, null);
    cursor.moveToFirst();
    int i = cursor.getColumnIndex("_display_name");
    if (i >= 0) {
      String str = cursor.getString(i);
      cursor.close();
      return str;
    } 
    return null;
  }
  
  @TargetApi(19)
  public static String a(Context paramContext, Uri paramUri) {
    FileOutputStream fileOutputStream;
    boolean bool;
    if (Build.VERSION.SDK_INT >= 19) {
      bool = true;
    } else {
      bool = false;
    } 
    String str = null;
    if (bool && DocumentsContract.isDocumentUri(paramContext, paramUri)) {
      String[] arrayOfString;
      StringBuilder stringBuilder;
      if (b(paramUri)) {
        arrayOfString = DocumentsContract.getDocumentId(paramUri).split(":");
        if ("primary".equalsIgnoreCase(arrayOfString[0])) {
          stringBuilder = new StringBuilder();
          stringBuilder.append(Environment.getExternalStorageDirectory());
          stringBuilder.append("/");
          stringBuilder.append(arrayOfString[1]);
          return stringBuilder.toString();
        } 
      } else {
        String str1;
        Uri uri;
        if (a((Uri)stringBuilder))
          try {
            str1 = DocumentsContract.getDocumentId((Uri)stringBuilder);
            return (str1 != null && str1.startsWith("raw:/")) ? Uri.parse(str1).getPath() : a((Context)arrayOfString, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(str1).longValue()), null, null);
          } catch (Exception null) {
            return null;
          }  
        if (d((Uri)str1)) {
          String[] arrayOfString1 = DocumentsContract.getDocumentId((Uri)str1).split(":");
          String str2 = arrayOfString1[0];
          if ("image".equals(str2)) {
            uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
          } else if ("video".equals(str2)) {
            uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
          } else {
            str1 = str;
            if ("audio".equals(str2))
              uri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI; 
          } 
          return a((Context)exception, uri, "_id=?", new String[] { arrayOfString1[1] });
        } 
        if ("content".equalsIgnoreCase(uri.getScheme()))
          return c(uri) ? uri.getLastPathSegment() : a((Context)exception, uri, null, null); 
        try {
          InputStream inputStream = exception.getContentResolver().openInputStream(uri);
          if (inputStream != null) {
            String str2 = a(exception.getContentResolver(), uri);
            if (str2 != null) {
              File file = new File(exception.getCacheDir(), str2);
              fileOutputStream = new FileOutputStream(file);
              byte[] arrayOfByte = new byte[1024];
              while (inputStream.read(arrayOfByte) > 0)
                fileOutputStream.write(arrayOfByte); 
              fileOutputStream.close();
              inputStream.close();
              return file.getAbsolutePath();
            } 
          } 
        } catch (Exception exception) {
          h.a(exception.toString());
          return null;
        } 
      } 
    } else {
      if ("content".equalsIgnoreCase(fileOutputStream.getScheme()))
        return c((Uri)fileOutputStream) ? fileOutputStream.getLastPathSegment() : a((Context)exception, (Uri)fileOutputStream, null, null); 
      if ("file".equalsIgnoreCase(fileOutputStream.getScheme()))
        return fileOutputStream.getPath(); 
    } 
    return null;
  }
  
  public static String a(Context paramContext, Uri paramUri, String paramString, String[] paramArrayOfString) {
    // Byte code:
    //   0: aconst_null
    //   1: astore #4
    //   3: aload_0
    //   4: invokevirtual getContentResolver : ()Landroid/content/ContentResolver;
    //   7: aload_1
    //   8: iconst_1
    //   9: anewarray java/lang/String
    //   12: dup
    //   13: iconst_0
    //   14: ldc '_data'
    //   16: aastore
    //   17: aload_2
    //   18: aload_3
    //   19: aconst_null
    //   20: invokevirtual query : (Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   23: astore_1
    //   24: aload #4
    //   26: astore_2
    //   27: aload_1
    //   28: ifnull -> 69
    //   31: aload #4
    //   33: astore_2
    //   34: aload_1
    //   35: astore_0
    //   36: aload_1
    //   37: invokeinterface moveToFirst : ()Z
    //   42: ifeq -> 69
    //   45: aload_1
    //   46: astore_0
    //   47: aload_1
    //   48: aload_1
    //   49: ldc '_data'
    //   51: invokeinterface getColumnIndexOrThrow : (Ljava/lang/String;)I
    //   56: invokeinterface getString : (I)Ljava/lang/String;
    //   61: astore_2
    //   62: goto -> 69
    //   65: astore_2
    //   66: goto -> 90
    //   69: aload_1
    //   70: ifnull -> 79
    //   73: aload_1
    //   74: invokeinterface close : ()V
    //   79: aload_2
    //   80: areturn
    //   81: astore_1
    //   82: aconst_null
    //   83: astore_0
    //   84: goto -> 109
    //   87: astore_2
    //   88: aconst_null
    //   89: astore_1
    //   90: aload_1
    //   91: astore_0
    //   92: aload_2
    //   93: invokevirtual printStackTrace : ()V
    //   96: aload_1
    //   97: ifnull -> 106
    //   100: aload_1
    //   101: invokeinterface close : ()V
    //   106: aconst_null
    //   107: areturn
    //   108: astore_1
    //   109: aload_0
    //   110: ifnull -> 119
    //   113: aload_0
    //   114: invokeinterface close : ()V
    //   119: aload_1
    //   120: athrow
    // Exception table:
    //   from	to	target	type
    //   3	24	87	java/lang/Exception
    //   3	24	81	finally
    //   36	45	65	java/lang/Exception
    //   36	45	108	finally
    //   47	62	65	java/lang/Exception
    //   47	62	108	finally
    //   92	96	108	finally
  }
  
  public static boolean a(Uri paramUri) {
    return "com.android.providers.downloads.documents".equals(paramUri.getAuthority());
  }
  
  public static boolean b(Uri paramUri) {
    return "com.android.externalstorage.documents".equals(paramUri.getAuthority());
  }
  
  public static boolean c(Uri paramUri) {
    return "com.google.android.apps.photos.content".equals(paramUri.getAuthority());
  }
  
  public static boolean d(Uri paramUri) {
    return "com.android.providers.media.documents".equals(paramUri.getAuthority());
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/RNFetchBlob/Utils/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */