package com.facebook.soloader;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public final class SysUtil {
  public static int a(Context paramContext) {
    PackageManager packageManager = paramContext.getPackageManager();
    if (packageManager != null)
      try {
        return (packageManager.getPackageInfo(paramContext.getPackageName(), 0)).versionCode;
      } catch (android.content.pm.PackageManager.NameNotFoundException|RuntimeException nameNotFoundException) {
        return 0;
      }  
    return 0;
  }
  
  static int a(RandomAccessFile paramRandomAccessFile, InputStream paramInputStream, int paramInt, byte[] paramArrayOfbyte) {
    int i = 0;
    while (i < paramInt) {
      int j = paramInputStream.read(paramArrayOfbyte, 0, Math.min(paramArrayOfbyte.length, paramInt - i));
      if (j != -1) {
        paramRandomAccessFile.write(paramArrayOfbyte, 0, j);
        i += j;
      } 
    } 
    return i;
  }
  
  public static int a(String[] paramArrayOfString, String paramString) {
    for (int i = 0; i < paramArrayOfString.length; i++) {
      if (paramArrayOfString[i] != null && paramString.equals(paramArrayOfString[i]))
        return i; 
    } 
    return -1;
  }
  
  public static void a(File paramFile) {
    if (paramFile.isDirectory()) {
      File[] arrayOfFile = paramFile.listFiles();
      if (arrayOfFile == null)
        return; 
      int j = arrayOfFile.length;
      for (int i = 0; i < j; i++)
        a(arrayOfFile[i]); 
    } 
    if (!paramFile.delete()) {
      if (!paramFile.exists())
        return; 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("could not delete: ");
      stringBuilder.append(paramFile);
      throw new IOException(stringBuilder.toString());
    } 
  }
  
  public static void a(FileDescriptor paramFileDescriptor, long paramLong) {
    if (Build.VERSION.SDK_INT >= 21)
      LollipopSysdeps.fallocateIfSupported(paramFileDescriptor, paramLong); 
  }
  
  public static String[] a() {
    return (Build.VERSION.SDK_INT < 21) ? new String[] { Build.CPU_ABI, Build.CPU_ABI2 } : LollipopSysdeps.getSupportedAbis();
  }
  
  static void b(File paramFile) {
    if (paramFile.isDirectory()) {
      File[] arrayOfFile = paramFile.listFiles();
      if (arrayOfFile != null) {
        for (int i = 0; i < arrayOfFile.length; i++)
          b(arrayOfFile[i]); 
      } else {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("cannot list directory ");
        stringBuilder.append(paramFile);
        throw new IOException(stringBuilder.toString());
      } 
    } else {
      if (paramFile.getPath().endsWith("_lock"))
        return; 
      RandomAccessFile randomAccessFile = new RandomAccessFile(paramFile, "r");
      try {
        randomAccessFile.getFD().sync();
        return;
      } finally {
        null = null;
      } 
    } 
  }
  
  static void c(File paramFile) {
    if (!paramFile.mkdirs()) {
      if (paramFile.isDirectory())
        return; 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("cannot mkdir: ");
      stringBuilder.append(paramFile);
      throw new IOException(stringBuilder.toString());
    } 
  }
  
  @TargetApi(21)
  @d
  private static final class LollipopSysdeps {
    @d
    public static void fallocateIfSupported(FileDescriptor param1FileDescriptor, long param1Long) {
      try {
        Os.posix_fallocate(param1FileDescriptor, 0L, param1Long);
        return;
      } catch (ErrnoException errnoException) {
        int i = errnoException.errno;
        if (i != OsConstants.EOPNOTSUPP && i != OsConstants.ENOSYS) {
          if (i == OsConstants.EINVAL)
            return; 
          throw new IOException(errnoException.toString(), errnoException);
        } 
        return;
      } 
    }
    
    @d
    public static String[] getSupportedAbis() {
      String[] arrayOfString = Build.SUPPORTED_ABIS;
      TreeSet<String> treeSet = new TreeSet();
      int i = 0;
      try {
        String str;
        if (Os.readlink("/proc/self/exe").contains("64")) {
          treeSet.add(i.b.g.toString());
          str = i.b.f.toString();
        } else {
          treeSet.add(i.b.e.toString());
          str = i.b.d.toString();
        } 
        treeSet.add(str);
        ArrayList<String> arrayList = new ArrayList();
        int j = arrayOfString.length;
        while (i < j) {
          String str1 = arrayOfString[i];
          if (treeSet.contains(str1))
            arrayList.add(str1); 
          i++;
        } 
        return arrayList.<String>toArray(new String[arrayList.size()]);
      } catch (ErrnoException errnoException) {
        Log.e("SysUtil", String.format("Could not read /proc/self/exe. Falling back to default ABI list: %s. errno: %d Err msg: %s", new Object[] { Arrays.toString((Object[])arrayOfString), Integer.valueOf(errnoException.errno), errnoException.getMessage() }));
        return Build.SUPPORTED_ABIS;
      } 
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/soloader/SysUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */