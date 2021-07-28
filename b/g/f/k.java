package b.g.f;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class k {
  public static File a(Context paramContext) {
    File file = paramContext.getCacheDir();
    if (file == null)
      return null; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(".font");
    stringBuilder.append(Process.myPid());
    stringBuilder.append("-");
    stringBuilder.append(Process.myTid());
    stringBuilder.append("-");
    String str = stringBuilder.toString();
    int i = 0;
    while (true) {
      if (i < 100) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(str);
        stringBuilder1.append(i);
        File file1 = new File(file, stringBuilder1.toString());
        try {
          boolean bool = file1.createNewFile();
          if (bool)
            return file1; 
        } catch (IOException iOException) {}
        i++;
        continue;
      } 
      return null;
    } 
  }
  
  public static ByteBuffer a(Context paramContext, Resources paramResources, int paramInt) {
    File file = a(paramContext);
    if (file == null)
      return null; 
    try {
      boolean bool = a(file, paramResources, paramInt);
      if (!bool)
        return null; 
      return a(file);
    } finally {
      file.delete();
    } 
  }
  
  public static ByteBuffer a(Context paramContext, CancellationSignal paramCancellationSignal, Uri paramUri) {
    ContentResolver contentResolver = paramContext.getContentResolver();
    try {
      ParcelFileDescriptor parcelFileDescriptor = contentResolver.openFileDescriptor(paramUri, "r", paramCancellationSignal);
      if (parcelFileDescriptor == null) {
        if (parcelFileDescriptor != null)
          parcelFileDescriptor.close(); 
        return null;
      } 
      try {
        FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptor.getFileDescriptor());
      } finally {
        if (parcelFileDescriptor != null)
          try {
            parcelFileDescriptor.close();
          } finally {} 
      } 
    } catch (IOException iOException) {
      return null;
    } 
  }
  
  private static ByteBuffer a(File paramFile) {
    try {
      FileInputStream fileInputStream = new FileInputStream(paramFile);
      try {
        FileChannel fileChannel = fileInputStream.getChannel();
        long l = fileChannel.size();
        return fileChannel.map(FileChannel.MapMode.READ_ONLY, 0L, l);
      } finally {
        try {
          fileInputStream.close();
        } finally {}
      } 
    } catch (IOException iOException) {
      return null;
    } 
  }
  
  public static void a(Closeable paramCloseable) {
    if (paramCloseable != null)
      try {
        paramCloseable.close();
        return;
      } catch (IOException iOException) {
        return;
      }  
  }
  
  public static boolean a(File paramFile, Resources paramResources, int paramInt) {
    try {
      InputStream inputStream = paramResources.openRawResource(paramInt);
    } finally {
      paramFile = null;
    } 
    a((Closeable)paramResources);
    throw paramFile;
  }
  
  public static boolean a(File paramFile, InputStream paramInputStream) {
    StrictMode.ThreadPolicy threadPolicy = StrictMode.allowThreadDiskWrites();
    File file2 = null;
    byte[] arrayOfByte = null;
    try {
      FileOutputStream fileOutputStream = new FileOutputStream(paramFile, false);
      try {
        arrayOfByte = new byte[1024];
        while (true) {
          int i = paramInputStream.read(arrayOfByte);
          if (i != -1) {
            fileOutputStream.write(arrayOfByte, 0, i);
            continue;
          } 
          return true;
        } 
      } catch (IOException null) {
      
      } finally {
        InputStream inputStream;
        paramInputStream = null;
        FileOutputStream fileOutputStream1 = fileOutputStream;
      } 
    } catch (IOException iOException) {
      paramFile = file2;
    } finally {}
    File file1 = paramFile;
    StringBuilder stringBuilder = new StringBuilder();
    file1 = paramFile;
    stringBuilder.append("Error copying resource contents to temp file: ");
    file1 = paramFile;
    stringBuilder.append(iOException.getMessage());
    file1 = paramFile;
    Log.e("TypefaceCompatUtil", stringBuilder.toString());
    a((Closeable)paramFile);
    StrictMode.setThreadPolicy(threadPolicy);
    return false;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/g/f/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */