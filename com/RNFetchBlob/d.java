package com.RNFetchBlob;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import android.util.Base64;
import com.RNFetchBlob.Utils.a;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;

class d {
  private static HashMap<String, d> e = new HashMap<String, d>();
  
  private ReactApplicationContext a;
  
  private DeviceEventManagerModule.RCTDeviceEventEmitter b;
  
  private String c = "base64";
  
  private OutputStream d = null;
  
  d(ReactApplicationContext paramReactApplicationContext) {
    this.a = paramReactApplicationContext;
    this.b = (DeviceEventManagerModule.RCTDeviceEventEmitter)paramReactApplicationContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class);
  }
  
  static String a(String paramString) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(RNFetchBlob.RCTContext.getFilesDir());
    stringBuilder.append("/RNFetchBlobTmp_");
    stringBuilder.append(paramString);
    return stringBuilder.toString();
  }
  
  static Map<String, Object> a(ReactApplicationContext paramReactApplicationContext) {
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    hashMap.put("DocumentDir", paramReactApplicationContext.getFilesDir().getAbsolutePath());
    hashMap.put("CacheDir", paramReactApplicationContext.getCacheDir().getAbsolutePath());
    hashMap.put("DCIMDir", Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM).getAbsolutePath());
    hashMap.put("PictureDir", Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).getAbsolutePath());
    hashMap.put("MusicDir", Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MUSIC).getAbsolutePath());
    hashMap.put("DownloadDir", Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath());
    hashMap.put("MovieDir", Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES).getAbsolutePath());
    hashMap.put("RingtoneDir", Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_RINGTONES).getAbsolutePath());
    if (Environment.getExternalStorageState().equals("mounted")) {
      String str;
      hashMap.put("SDCardDir", Environment.getExternalStorageDirectory().getAbsolutePath());
      File file = paramReactApplicationContext.getExternalFilesDir(null);
      if (file != null) {
        str = file.getParentFile().getAbsolutePath();
      } else {
        str = "";
      } 
      hashMap.put("SDCardApplicationDir", str);
    } 
    hashMap.put("MainBundleDir", (paramReactApplicationContext.getApplicationInfo()).dataDir);
    return (Map)hashMap;
  }
  
  static void a(Callback paramCallback) {
    StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
    WritableMap writableMap = Arguments.createMap();
    if (Build.VERSION.SDK_INT >= 18) {
      writableMap.putString("internal_free", String.valueOf(statFs.getFreeBytes()));
      writableMap.putString("internal_total", String.valueOf(statFs.getTotalBytes()));
      statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
      writableMap.putString("external_free", String.valueOf(statFs.getFreeBytes()));
      writableMap.putString("external_total", String.valueOf(statFs.getTotalBytes()));
    } 
    paramCallback.invoke(new Object[] { null, writableMap });
  }
  
  public static void a(Promise paramPromise) {
    if (Environment.getExternalStorageState().equals("mounted")) {
      paramPromise.resolve(Environment.getExternalStorageDirectory().getAbsolutePath());
      return;
    } 
    paramPromise.reject("RNFetchBlob.getSDCardDir", "External storage not mounted");
  }
  
  public static void a(ReactApplicationContext paramReactApplicationContext, Promise paramPromise) {
    String str;
    if (Environment.getExternalStorageState().equals("mounted")) {
      try {
        paramPromise.resolve(paramReactApplicationContext.getExternalFilesDir(null).getParentFile().getAbsolutePath());
        return;
      } catch (Exception exception) {
        str = exception.getLocalizedMessage();
      } 
    } else {
      str = "External storage not mounted";
    } 
    paramPromise.reject("RNFetchBlob.getSDCardApplicationDir", str);
  }
  
  static void a(ReadableArray paramReadableArray, Callback paramCallback) {
    (new c(paramCallback)).execute((Object[])new ReadableArray[] { paramReadableArray });
  }
  
  private static void a(File paramFile) {
    if (paramFile.isDirectory()) {
      File[] arrayOfFile = paramFile.listFiles();
      if (arrayOfFile != null) {
        int j = arrayOfFile.length;
        for (int i = 0; i < j; i++)
          a(arrayOfFile[i]); 
      } else {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("Received null trying to list files of directory '");
        stringBuilder1.append(paramFile);
        stringBuilder1.append("'");
        throw new NullPointerException(stringBuilder1.toString());
      } 
    } 
    if (paramFile.delete())
      return; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Failed to delete '");
    stringBuilder.append(paramFile);
    stringBuilder.append("'");
    IOException iOException = new IOException(stringBuilder.toString());
    throw iOException;
  }
  
  static void a(String paramString, Callback paramCallback) {
    try {
      OutputStream outputStream = ((d)e.get(paramString)).d;
      e.remove(paramString);
      outputStream.close();
      paramCallback.invoke(new Object[0]);
      return;
    } catch (Exception exception) {
      paramCallback.invoke(new Object[] { exception.getLocalizedMessage() });
      return;
    } 
  }
  
  static void a(String paramString, Promise paramPromise) {
    try {
      StringBuilder stringBuilder;
      paramString = e(paramString);
      File file = new File(paramString);
      boolean bool = file.exists();
      if (!bool) {
        stringBuilder = new StringBuilder();
        stringBuilder.append("No such file '");
        stringBuilder.append(paramString);
        stringBuilder.append("'");
        paramPromise.reject("ENOENT", stringBuilder.toString());
        return;
      } 
      if (!stringBuilder.isDirectory()) {
        stringBuilder = new StringBuilder();
        stringBuilder.append("Not a directory '");
        stringBuilder.append(paramString);
        stringBuilder.append("'");
        paramPromise.reject("ENOTDIR", stringBuilder.toString());
        return;
      } 
      String[] arrayOfString = (new File(paramString)).list();
      WritableArray writableArray = Arguments.createArray();
      int j = arrayOfString.length;
      for (int i = 0; i < j; i++)
        writableArray.pushString(arrayOfString[i]); 
      paramPromise.resolve(writableArray);
      return;
    } catch (Exception exception) {
      exception.printStackTrace();
      paramPromise.reject("EUNSPECIFIED", exception.getLocalizedMessage());
      return;
    } 
  }
  
  static void a(String paramString, ReadableArray paramReadableArray, Callback paramCallback) {
    try {
      OutputStream outputStream = ((d)e.get(paramString)).d;
      byte[] arrayOfByte = new byte[paramReadableArray.size()];
      for (int i = 0; i < paramReadableArray.size(); i++)
        arrayOfByte[i] = (byte)paramReadableArray.getInt(i); 
      outputStream.write(arrayOfByte);
      paramCallback.invoke(new Object[0]);
      return;
    } catch (Exception exception) {
      paramCallback.invoke(new Object[] { exception.getLocalizedMessage() });
      return;
    } 
  }
  
  static void a(String paramString, ReadableArray paramReadableArray, Promise paramPromise) {
    try {
      StringBuilder stringBuilder;
      File file = new File(paramString);
      if (!file.createNewFile()) {
        stringBuilder = new StringBuilder();
        stringBuilder.append("File at path `");
        stringBuilder.append(paramString);
        stringBuilder.append("` already exists");
        paramPromise.reject("EEXIST", stringBuilder.toString());
        return;
      } 
      FileOutputStream fileOutputStream = new FileOutputStream(file);
      byte[] arrayOfByte = new byte[stringBuilder.size()];
      for (int i = 0; i < stringBuilder.size(); i++)
        arrayOfByte[i] = (byte)stringBuilder.getInt(i); 
      fileOutputStream.write(arrayOfByte);
      paramPromise.resolve(paramString);
      return;
    } catch (Exception exception) {
      paramPromise.reject("EUNSPECIFIED", exception.getLocalizedMessage());
      return;
    } 
  }
  
  static void a(String paramString, ReadableArray paramReadableArray, boolean paramBoolean, Promise paramPromise) {
    try {
      File file1 = new File(paramString);
      File file2 = file1.getParentFile();
      if (!file1.exists()) {
        if (file2 != null && !file2.exists() && !file2.mkdirs()) {
          null = new StringBuilder();
          null.append("Failed to create parent directory of '");
          null.append(paramString);
          null.append("'");
          paramPromise.reject("ENOTDIR", null.toString());
          return;
        } 
        if (!file1.createNewFile()) {
          null = new StringBuilder();
          null.append("File '");
          null.append(paramString);
          null.append("' does not exist and could not be created");
          paramPromise.reject("ENOENT", null.toString());
          return;
        } 
      } 
      FileOutputStream fileOutputStream = new FileOutputStream(file1, paramBoolean);
      try {
        byte[] arrayOfByte = new byte[null.size()];
        int i;
        for (i = 0; i < null.size(); i++)
          arrayOfByte[i] = (byte)null.getInt(i); 
        fileOutputStream.write(arrayOfByte);
        fileOutputStream.close();
        return;
      } finally {
        fileOutputStream.close();
      } 
    } catch (FileNotFoundException fileNotFoundException) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("File '");
      stringBuilder.append(paramString);
      stringBuilder.append("' does not exist and could not be created");
      paramPromise.reject("ENOENT", stringBuilder.toString());
      return;
    } catch (Exception exception) {
      paramPromise.reject("EUNSPECIFIED", exception.getLocalizedMessage());
      return;
    } 
  }
  
  static void a(String paramString1, String paramString2, int paramInt1, int paramInt2, String paramString3, Promise paramPromise) {
    try {
      StringBuilder stringBuilder1;
      StringBuilder stringBuilder2;
      paramString1 = e(paramString1);
      File file = new File(paramString1);
      if (file.isDirectory()) {
        stringBuilder2 = new StringBuilder();
        stringBuilder2.append("Expecting a file but '");
        stringBuilder2.append(paramString1);
        stringBuilder2.append("' is a directory");
        paramPromise.reject("EISDIR", stringBuilder2.toString());
        return;
      } 
      if (!file.exists()) {
        stringBuilder2 = new StringBuilder();
        stringBuilder2.append("No such file '");
        stringBuilder2.append(paramString1);
        stringBuilder2.append("'");
        paramPromise.reject("ENOENT", stringBuilder2.toString());
        return;
      } 
      int i = (int)file.length();
      paramInt2 = Math.min(i, paramInt2) - paramInt1;
      FileInputStream fileInputStream = new FileInputStream(new File(paramString1));
      FileOutputStream fileOutputStream = new FileOutputStream(new File((String)stringBuilder2));
      int j = (int)fileInputStream.skip(paramInt1);
      if (j != paramInt1) {
        stringBuilder1 = new StringBuilder();
        stringBuilder1.append("Skipped ");
        stringBuilder1.append(j);
        stringBuilder1.append(" instead of the specified ");
        stringBuilder1.append(paramInt1);
        stringBuilder1.append(" bytes, size is ");
        stringBuilder1.append(i);
        paramPromise.reject("EUNSPECIFIED", stringBuilder1.toString());
        return;
      } 
      byte[] arrayOfByte = new byte[10240];
      for (paramInt1 = 0; paramInt1 < paramInt2; paramInt1 += i) {
        i = stringBuilder1.read(arrayOfByte, 0, 10240);
        if (i <= 0)
          break; 
        fileOutputStream.write(arrayOfByte, 0, Math.min(paramInt2 - paramInt1, i));
      } 
      stringBuilder1.close();
      fileOutputStream.flush();
      fileOutputStream.close();
      paramPromise.resolve(stringBuilder2);
      return;
    } catch (Exception exception) {
      exception.printStackTrace();
      paramPromise.reject("EUNSPECIFIED", exception.getLocalizedMessage());
      return;
    } 
  }
  
  static void a(String paramString1, String paramString2, Callback paramCallback) {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic e : (Ljava/lang/String;)Ljava/lang/String;
    //   4: astore #4
    //   6: aconst_null
    //   7: astore #5
    //   9: aconst_null
    //   10: astore_0
    //   11: aload #4
    //   13: invokestatic d : (Ljava/lang/String;)Z
    //   16: ifne -> 68
    //   19: new java/lang/StringBuilder
    //   22: dup
    //   23: invokespecial <init> : ()V
    //   26: astore_1
    //   27: aload_1
    //   28: ldc_w 'Source file at path`'
    //   31: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   34: pop
    //   35: aload_1
    //   36: aload #4
    //   38: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   41: pop
    //   42: aload_1
    //   43: ldc_w '` does not exist'
    //   46: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   49: pop
    //   50: aload_2
    //   51: iconst_1
    //   52: anewarray java/lang/Object
    //   55: dup
    //   56: iconst_0
    //   57: aload_1
    //   58: invokevirtual toString : ()Ljava/lang/String;
    //   61: aastore
    //   62: invokeinterface invoke : ([Ljava/lang/Object;)V
    //   67: return
    //   68: new java/io/File
    //   71: dup
    //   72: aload_1
    //   73: invokespecial <init> : (Ljava/lang/String;)V
    //   76: invokevirtual exists : ()Z
    //   79: ifne -> 149
    //   82: new java/io/File
    //   85: dup
    //   86: aload_1
    //   87: invokespecial <init> : (Ljava/lang/String;)V
    //   90: invokevirtual createNewFile : ()Z
    //   93: ifne -> 149
    //   96: new java/lang/StringBuilder
    //   99: dup
    //   100: invokespecial <init> : ()V
    //   103: astore #4
    //   105: aload #4
    //   107: ldc_w 'Destination file at ''
    //   110: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   113: pop
    //   114: aload #4
    //   116: aload_1
    //   117: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   120: pop
    //   121: aload #4
    //   123: ldc_w '' already exists'
    //   126: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   129: pop
    //   130: aload_2
    //   131: iconst_1
    //   132: anewarray java/lang/Object
    //   135: dup
    //   136: iconst_0
    //   137: aload #4
    //   139: invokevirtual toString : ()Ljava/lang/String;
    //   142: aastore
    //   143: invokeinterface invoke : ([Ljava/lang/Object;)V
    //   148: return
    //   149: aload #4
    //   151: invokestatic b : (Ljava/lang/String;)Ljava/io/InputStream;
    //   154: astore #4
    //   156: new java/io/FileOutputStream
    //   159: dup
    //   160: aload_1
    //   161: invokespecial <init> : (Ljava/lang/String;)V
    //   164: astore_0
    //   165: sipush #10240
    //   168: newarray byte
    //   170: astore_1
    //   171: aload #4
    //   173: aload_1
    //   174: invokevirtual read : ([B)I
    //   177: istore_3
    //   178: iload_3
    //   179: ifle -> 192
    //   182: aload_0
    //   183: aload_1
    //   184: iconst_0
    //   185: iload_3
    //   186: invokevirtual write : ([BII)V
    //   189: goto -> 171
    //   192: aload #4
    //   194: ifnull -> 205
    //   197: aload #4
    //   199: invokevirtual close : ()V
    //   202: goto -> 205
    //   205: aload_0
    //   206: invokevirtual close : ()V
    //   209: ldc ''
    //   211: astore_0
    //   212: goto -> 397
    //   215: new java/lang/StringBuilder
    //   218: dup
    //   219: invokespecial <init> : ()V
    //   222: astore_0
    //   223: aload_0
    //   224: ldc ''
    //   226: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   229: pop
    //   230: aload_0
    //   231: aload_1
    //   232: invokevirtual getLocalizedMessage : ()Ljava/lang/String;
    //   235: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   238: pop
    //   239: aload_0
    //   240: invokevirtual toString : ()Ljava/lang/String;
    //   243: astore_0
    //   244: goto -> 397
    //   247: astore_1
    //   248: goto -> 264
    //   251: astore #5
    //   253: aload_0
    //   254: astore_1
    //   255: aload #5
    //   257: astore_0
    //   258: goto -> 278
    //   261: astore_1
    //   262: aconst_null
    //   263: astore_0
    //   264: aload_1
    //   265: astore_2
    //   266: aload #4
    //   268: astore_1
    //   269: aload_0
    //   270: astore #4
    //   272: goto -> 435
    //   275: astore_0
    //   276: aconst_null
    //   277: astore_1
    //   278: aload #4
    //   280: astore #5
    //   282: aload_0
    //   283: astore #4
    //   285: aload #5
    //   287: astore_0
    //   288: goto -> 305
    //   291: astore_2
    //   292: aconst_null
    //   293: astore #4
    //   295: aload #5
    //   297: astore_1
    //   298: goto -> 435
    //   301: astore #4
    //   303: aconst_null
    //   304: astore_1
    //   305: new java/lang/StringBuilder
    //   308: dup
    //   309: invokespecial <init> : ()V
    //   312: astore #5
    //   314: aload #5
    //   316: ldc ''
    //   318: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   321: pop
    //   322: aload #5
    //   324: aload #4
    //   326: invokevirtual getLocalizedMessage : ()Ljava/lang/String;
    //   329: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   332: pop
    //   333: aload #5
    //   335: invokevirtual toString : ()Ljava/lang/String;
    //   338: astore #4
    //   340: aload_0
    //   341: ifnull -> 351
    //   344: aload_0
    //   345: invokevirtual close : ()V
    //   348: goto -> 351
    //   351: aload #4
    //   353: astore_0
    //   354: aload_1
    //   355: ifnull -> 397
    //   358: aload_1
    //   359: invokevirtual close : ()V
    //   362: aload #4
    //   364: astore_0
    //   365: goto -> 397
    //   368: new java/lang/StringBuilder
    //   371: dup
    //   372: invokespecial <init> : ()V
    //   375: astore_0
    //   376: aload_0
    //   377: aload #4
    //   379: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   382: pop
    //   383: aload_0
    //   384: aload_1
    //   385: invokevirtual getLocalizedMessage : ()Ljava/lang/String;
    //   388: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   391: pop
    //   392: aload_0
    //   393: invokevirtual toString : ()Ljava/lang/String;
    //   396: astore_0
    //   397: aload_0
    //   398: ldc ''
    //   400: if_acmpeq -> 418
    //   403: aload_2
    //   404: iconst_1
    //   405: anewarray java/lang/Object
    //   408: dup
    //   409: iconst_0
    //   410: aload_0
    //   411: aastore
    //   412: invokeinterface invoke : ([Ljava/lang/Object;)V
    //   417: return
    //   418: aload_2
    //   419: iconst_0
    //   420: anewarray java/lang/Object
    //   423: invokeinterface invoke : ([Ljava/lang/Object;)V
    //   428: return
    //   429: astore_2
    //   430: aload_1
    //   431: astore #4
    //   433: aload_0
    //   434: astore_1
    //   435: aload_1
    //   436: ifnull -> 446
    //   439: aload_1
    //   440: invokevirtual close : ()V
    //   443: goto -> 446
    //   446: aload #4
    //   448: ifnull -> 488
    //   451: aload #4
    //   453: invokevirtual close : ()V
    //   456: goto -> 488
    //   459: new java/lang/StringBuilder
    //   462: dup
    //   463: invokespecial <init> : ()V
    //   466: astore_0
    //   467: aload_0
    //   468: ldc ''
    //   470: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   473: pop
    //   474: aload_0
    //   475: aload_1
    //   476: invokevirtual getLocalizedMessage : ()Ljava/lang/String;
    //   479: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   482: pop
    //   483: aload_0
    //   484: invokevirtual toString : ()Ljava/lang/String;
    //   487: pop
    //   488: goto -> 493
    //   491: aload_2
    //   492: athrow
    //   493: goto -> 491
    //   496: astore_1
    //   497: goto -> 215
    //   500: astore_1
    //   501: goto -> 368
    //   504: astore_1
    //   505: goto -> 459
    // Exception table:
    //   from	to	target	type
    //   11	67	301	java/lang/Exception
    //   11	67	291	finally
    //   68	148	301	java/lang/Exception
    //   68	148	291	finally
    //   149	156	301	java/lang/Exception
    //   149	156	291	finally
    //   156	165	275	java/lang/Exception
    //   156	165	261	finally
    //   165	171	251	java/lang/Exception
    //   165	171	247	finally
    //   171	178	251	java/lang/Exception
    //   171	178	247	finally
    //   182	189	251	java/lang/Exception
    //   182	189	247	finally
    //   197	202	496	java/lang/Exception
    //   205	209	496	java/lang/Exception
    //   305	340	429	finally
    //   344	348	500	java/lang/Exception
    //   358	362	500	java/lang/Exception
    //   439	443	504	java/lang/Exception
    //   451	456	504	java/lang/Exception
  }
  
  static void a(String paramString1, String paramString2, Promise paramPromise) {
    try {
      StringBuilder stringBuilder2;
      StringBuilder stringBuilder3;
      HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
      hashMap.put("md5", "MD5");
      hashMap.put("sha1", "SHA-1");
      hashMap.put("sha224", "SHA-224");
      hashMap.put("sha256", "SHA-256");
      hashMap.put("sha384", "SHA-384");
      hashMap.put("sha512", "SHA-512");
      if (!hashMap.containsKey(paramString2)) {
        stringBuilder2 = new StringBuilder();
        stringBuilder2.append("Invalid algorithm '");
        stringBuilder2.append(paramString2);
        stringBuilder2.append("', must be one of md5, sha1, sha224, sha256, sha384, sha512");
        paramPromise.reject("EINVAL", stringBuilder2.toString());
        return;
      } 
      File file = new File((String)stringBuilder2);
      if (file.isDirectory()) {
        stringBuilder3 = new StringBuilder();
        stringBuilder3.append("Expecting a file but '");
        stringBuilder3.append((String)stringBuilder2);
        stringBuilder3.append("' is a directory");
        paramPromise.reject("EISDIR", stringBuilder3.toString());
        return;
      } 
      if (!file.exists()) {
        stringBuilder3 = new StringBuilder();
        stringBuilder3.append("No such file '");
        stringBuilder3.append((String)stringBuilder2);
        stringBuilder3.append("'");
        paramPromise.reject("ENOENT", stringBuilder3.toString());
        return;
      } 
      MessageDigest messageDigest = MessageDigest.getInstance((String)hashMap.get(stringBuilder3));
      FileInputStream fileInputStream = new FileInputStream((String)stringBuilder2);
      byte[] arrayOfByte2 = new byte[1048576];
      if (file.length() != 0L)
        while (true) {
          int k = fileInputStream.read(arrayOfByte2);
          if (k != -1) {
            messageDigest.update(arrayOfByte2, 0, k);
            continue;
          } 
          break;
        }  
      StringBuilder stringBuilder1 = new StringBuilder();
      byte[] arrayOfByte1 = messageDigest.digest();
      int j = arrayOfByte1.length;
      for (int i = 0; i < j; i++) {
        stringBuilder1.append(String.format("%02x", new Object[] { Byte.valueOf(arrayOfByte1[i]) }));
      } 
      paramPromise.resolve(stringBuilder1.toString());
      return;
    } catch (Exception exception) {
      exception.printStackTrace();
      paramPromise.reject("EUNSPECIFIED", exception.getLocalizedMessage());
      return;
    } 
  }
  
  private void a(String paramString1, String paramString2, WritableArray paramWritableArray) {
    WritableMap writableMap = Arguments.createMap();
    writableMap.putString("event", paramString2);
    writableMap.putArray("detail", (ReadableArray)paramWritableArray);
    this.b.emit(paramString1, writableMap);
  }
  
  private void a(String paramString1, String paramString2, String paramString3) {
    WritableMap writableMap = Arguments.createMap();
    writableMap.putString("event", paramString2);
    writableMap.putString("detail", paramString3);
    this.b.emit(paramString1, writableMap);
  }
  
  static void a(String paramString1, String paramString2, String paramString3, Promise paramPromise) {
    try {
      StringBuilder stringBuilder1;
      StringBuilder stringBuilder2;
      FileOutputStream fileOutputStream;
      byte[] arrayOfByte;
      File file = new File(paramString1);
      boolean bool = file.createNewFile();
      if (paramString3.equals("uri")) {
        File file1 = new File(paramString2.replace("RNFetchBlob-file://", ""));
        if (!file1.exists()) {
          stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Source file : ");
          stringBuilder1.append(paramString2);
          stringBuilder1.append(" does not exist");
          paramPromise.reject("ENOENT", stringBuilder1.toString());
          return;
        } 
        FileInputStream fileInputStream = new FileInputStream(file1);
        fileOutputStream = new FileOutputStream(file);
        arrayOfByte = new byte[10240];
        while (true) {
          int i = fileInputStream.read(arrayOfByte);
          if (i > 0) {
            fileOutputStream.write(arrayOfByte, 0, i);
            continue;
          } 
          fileInputStream.close();
          fileOutputStream.close();
          paramPromise.resolve(stringBuilder1);
          return;
        } 
      } 
      if (!bool) {
        stringBuilder2 = new StringBuilder();
        stringBuilder2.append("File `");
        stringBuilder2.append((String)stringBuilder1);
        stringBuilder2.append("` already exists");
        paramPromise.reject("EEXIST", stringBuilder2.toString());
        return;
      } 
      (new FileOutputStream((File)arrayOfByte)).write(a((String)stringBuilder2, (String)fileOutputStream));
      paramPromise.resolve(stringBuilder1);
      return;
    } catch (Exception exception) {
      paramPromise.reject("EUNSPECIFIED", exception.getLocalizedMessage());
      return;
    } 
  }
  
  private void a(String paramString1, String paramString2, String paramString3, String paramString4) {
    WritableMap writableMap = Arguments.createMap();
    writableMap.putString("event", paramString2);
    writableMap.putString("code", paramString3);
    writableMap.putString("detail", paramString4);
    this.b.emit(paramString1, writableMap);
  }
  
  static void a(String paramString1, String paramString2, String paramString3, boolean paramBoolean, Promise paramPromise) {
    // Byte code:
    //   0: new java/io/File
    //   3: dup
    //   4: aload_0
    //   5: invokespecial <init> : (Ljava/lang/String;)V
    //   8: astore #8
    //   10: aload #8
    //   12: invokevirtual getParentFile : ()Ljava/io/File;
    //   15: astore #7
    //   17: aload #8
    //   19: invokevirtual exists : ()Z
    //   22: ifne -> 144
    //   25: aload #7
    //   27: ifnull -> 91
    //   30: aload #7
    //   32: invokevirtual exists : ()Z
    //   35: ifne -> 91
    //   38: aload #7
    //   40: invokevirtual mkdirs : ()Z
    //   43: ifne -> 91
    //   46: new java/lang/StringBuilder
    //   49: dup
    //   50: invokespecial <init> : ()V
    //   53: astore_1
    //   54: aload_1
    //   55: ldc_w 'Failed to create parent directory of ''
    //   58: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   61: pop
    //   62: aload_1
    //   63: aload_0
    //   64: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   67: pop
    //   68: aload_1
    //   69: ldc_w '''
    //   72: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   75: pop
    //   76: aload #4
    //   78: ldc_w 'EUNSPECIFIED'
    //   81: aload_1
    //   82: invokevirtual toString : ()Ljava/lang/String;
    //   85: invokeinterface reject : (Ljava/lang/String;Ljava/lang/String;)V
    //   90: return
    //   91: aload #8
    //   93: invokevirtual createNewFile : ()Z
    //   96: ifne -> 144
    //   99: new java/lang/StringBuilder
    //   102: dup
    //   103: invokespecial <init> : ()V
    //   106: astore_1
    //   107: aload_1
    //   108: ldc_w 'File ''
    //   111: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   114: pop
    //   115: aload_1
    //   116: aload_0
    //   117: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   120: pop
    //   121: aload_1
    //   122: ldc_w '' does not exist and could not be created'
    //   125: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   128: pop
    //   129: aload #4
    //   131: ldc_w 'ENOENT'
    //   134: aload_1
    //   135: invokevirtual toString : ()Ljava/lang/String;
    //   138: invokeinterface reject : (Ljava/lang/String;Ljava/lang/String;)V
    //   143: return
    //   144: aload_1
    //   145: ldc_w 'uri'
    //   148: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   151: ifeq -> 332
    //   154: aload_2
    //   155: invokestatic e : (Ljava/lang/String;)Ljava/lang/String;
    //   158: astore_2
    //   159: new java/io/File
    //   162: dup
    //   163: aload_2
    //   164: invokespecial <init> : (Ljava/lang/String;)V
    //   167: astore_1
    //   168: aload_1
    //   169: invokevirtual exists : ()Z
    //   172: ifne -> 234
    //   175: new java/lang/StringBuilder
    //   178: dup
    //   179: invokespecial <init> : ()V
    //   182: astore_1
    //   183: aload_1
    //   184: ldc_w 'No such file ''
    //   187: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   190: pop
    //   191: aload_1
    //   192: aload_0
    //   193: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   196: pop
    //   197: aload_1
    //   198: ldc_w '' (''
    //   201: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   204: pop
    //   205: aload_1
    //   206: aload_2
    //   207: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   210: pop
    //   211: aload_1
    //   212: ldc_w '')'
    //   215: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   218: pop
    //   219: aload #4
    //   221: ldc_w 'ENOENT'
    //   224: aload_1
    //   225: invokevirtual toString : ()Ljava/lang/String;
    //   228: invokeinterface reject : (Ljava/lang/String;Ljava/lang/String;)V
    //   233: return
    //   234: sipush #10240
    //   237: newarray byte
    //   239: astore #9
    //   241: aconst_null
    //   242: astore_2
    //   243: new java/io/FileInputStream
    //   246: dup
    //   247: aload_1
    //   248: invokespecial <init> : (Ljava/io/File;)V
    //   251: astore #7
    //   253: new java/io/FileOutputStream
    //   256: dup
    //   257: aload #8
    //   259: iload_3
    //   260: invokespecial <init> : (Ljava/io/File;Z)V
    //   263: astore_1
    //   264: iconst_0
    //   265: istore #5
    //   267: aload #7
    //   269: aload #9
    //   271: invokevirtual read : ([B)I
    //   274: istore #6
    //   276: iload #6
    //   278: ifle -> 300
    //   281: aload_1
    //   282: aload #9
    //   284: iconst_0
    //   285: iload #6
    //   287: invokevirtual write : ([BII)V
    //   290: iload #5
    //   292: iload #6
    //   294: iadd
    //   295: istore #5
    //   297: goto -> 267
    //   300: aload #7
    //   302: invokevirtual close : ()V
    //   305: aload_1
    //   306: invokevirtual close : ()V
    //   309: goto -> 361
    //   312: aload #7
    //   314: ifnull -> 322
    //   317: aload #7
    //   319: invokevirtual close : ()V
    //   322: aload_2
    //   323: ifnull -> 330
    //   326: aload_2
    //   327: invokevirtual close : ()V
    //   330: aload_1
    //   331: athrow
    //   332: aload_2
    //   333: aload_1
    //   334: invokestatic a : (Ljava/lang/String;Ljava/lang/String;)[B
    //   337: astore_2
    //   338: new java/io/FileOutputStream
    //   341: dup
    //   342: aload #8
    //   344: iload_3
    //   345: invokespecial <init> : (Ljava/io/File;Z)V
    //   348: astore_1
    //   349: aload_1
    //   350: aload_2
    //   351: invokevirtual write : ([B)V
    //   354: aload_2
    //   355: arraylength
    //   356: istore #5
    //   358: goto -> 305
    //   361: aload #4
    //   363: iload #5
    //   365: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   368: invokeinterface resolve : (Ljava/lang/Object;)V
    //   373: return
    //   374: astore_2
    //   375: aload_1
    //   376: invokevirtual close : ()V
    //   379: aload_2
    //   380: athrow
    //   381: astore_0
    //   382: aload #4
    //   384: ldc_w 'EUNSPECIFIED'
    //   387: aload_0
    //   388: invokevirtual getLocalizedMessage : ()Ljava/lang/String;
    //   391: invokeinterface reject : (Ljava/lang/String;Ljava/lang/String;)V
    //   396: return
    //   397: new java/lang/StringBuilder
    //   400: dup
    //   401: invokespecial <init> : ()V
    //   404: astore_1
    //   405: aload_1
    //   406: ldc_w 'File ''
    //   409: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   412: pop
    //   413: aload_1
    //   414: aload_0
    //   415: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   418: pop
    //   419: aload_1
    //   420: ldc_w '' does not exist and could not be created, or it is a directory'
    //   423: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   426: pop
    //   427: aload #4
    //   429: ldc_w 'ENOENT'
    //   432: aload_1
    //   433: invokevirtual toString : ()Ljava/lang/String;
    //   436: invokeinterface reject : (Ljava/lang/String;Ljava/lang/String;)V
    //   441: return
    //   442: astore_1
    //   443: goto -> 397
    //   446: astore #8
    //   448: aload_1
    //   449: astore_2
    //   450: aload #8
    //   452: astore_1
    //   453: goto -> 312
    //   456: astore_1
    //   457: goto -> 312
    //   460: astore_1
    //   461: aconst_null
    //   462: astore #7
    //   464: goto -> 312
    // Exception table:
    //   from	to	target	type
    //   0	25	442	java/io/FileNotFoundException
    //   0	25	381	java/lang/Exception
    //   30	90	442	java/io/FileNotFoundException
    //   30	90	381	java/lang/Exception
    //   91	143	442	java/io/FileNotFoundException
    //   91	143	381	java/lang/Exception
    //   144	233	442	java/io/FileNotFoundException
    //   144	233	381	java/lang/Exception
    //   234	241	442	java/io/FileNotFoundException
    //   234	241	381	java/lang/Exception
    //   243	253	460	finally
    //   253	264	456	finally
    //   267	276	446	finally
    //   281	290	446	finally
    //   300	305	442	java/io/FileNotFoundException
    //   300	305	381	java/lang/Exception
    //   305	309	442	java/io/FileNotFoundException
    //   305	309	381	java/lang/Exception
    //   317	322	442	java/io/FileNotFoundException
    //   317	322	381	java/lang/Exception
    //   326	330	442	java/io/FileNotFoundException
    //   326	330	381	java/lang/Exception
    //   330	332	442	java/io/FileNotFoundException
    //   330	332	381	java/lang/Exception
    //   332	349	442	java/io/FileNotFoundException
    //   332	349	381	java/lang/Exception
    //   349	358	374	finally
    //   361	373	442	java/io/FileNotFoundException
    //   361	373	381	java/lang/Exception
    //   375	381	442	java/io/FileNotFoundException
    //   375	381	381	java/lang/Exception
  }
  
  private static byte[] a(String paramString1, String paramString2) {
    return paramString2.equalsIgnoreCase("ascii") ? paramString1.getBytes(Charset.forName("US-ASCII")) : (paramString2.toLowerCase().contains("base64") ? Base64.decode(paramString1, 2) : (paramString2.equalsIgnoreCase("utf8") ? paramString1.getBytes(Charset.forName("UTF-8")) : paramString1.getBytes(Charset.forName("US-ASCII"))));
  }
  
  private static InputStream b(String paramString) {
    return paramString.startsWith("bundle-assets://") ? RNFetchBlob.RCTContext.getAssets().open(paramString.replace("bundle-assets://", "")) : new FileInputStream(new File(paramString));
  }
  
  static void b(String paramString, Callback paramCallback) {
    boolean bool = c(paramString);
    Boolean bool1 = Boolean.valueOf(false);
    if (bool)
      try {
        paramString = paramString.replace("bundle-assets://", "");
        RNFetchBlob.RCTContext.getAssets().openFd(paramString);
        paramCallback.invoke(new Object[] { Boolean.valueOf(true), bool1 });
        return;
      } catch (IOException iOException) {
        paramCallback.invoke(new Object[] { bool1, bool1 });
        return;
      }  
    String str = e((String)iOException);
    if (str != null) {
      paramCallback.invoke(new Object[] { Boolean.valueOf((new File(str)).exists()), Boolean.valueOf((new File(str)).isDirectory()) });
      return;
    } 
    paramCallback.invoke(new Object[] { bool1, bool1 });
  }
  
  static void b(String paramString, Promise paramPromise) {
    String str;
    File file = new File(paramString);
    if (file.exists()) {
      StringBuilder stringBuilder = new StringBuilder();
      if (file.isDirectory()) {
        str = "Folder";
      } else {
        str = "File";
      } 
      stringBuilder.append(str);
      stringBuilder.append(" '");
      stringBuilder.append(paramString);
      stringBuilder.append("' already exists");
      paramPromise.reject("EEXIST", stringBuilder.toString());
      return;
    } 
    try {
      if (!str.mkdirs()) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("mkdir failed to create some or all directories in '");
        stringBuilder.append(paramString);
        stringBuilder.append("'");
        paramPromise.reject("EUNSPECIFIED", stringBuilder.toString());
        return;
      } 
      paramPromise.resolve(Boolean.valueOf(true));
      return;
    } catch (Exception exception) {
      paramPromise.reject("EUNSPECIFIED", exception.getLocalizedMessage());
      return;
    } 
  }
  
  static void b(String paramString1, String paramString2, Callback paramCallback) {
    StringBuilder stringBuilder;
    File file = new File(paramString1);
    if (!file.exists()) {
      stringBuilder = new StringBuilder();
      stringBuilder.append("Source file at path `");
      stringBuilder.append(paramString1);
      stringBuilder.append("` does not exist");
      paramCallback.invoke(new Object[] { stringBuilder.toString() });
      return;
    } 
    try {
      FileInputStream fileInputStream = new FileInputStream(paramString1);
      FileOutputStream fileOutputStream = new FileOutputStream((String)stringBuilder);
      byte[] arrayOfByte = new byte[1024];
      while (true) {
        int i = fileInputStream.read(arrayOfByte);
        if (i != -1) {
          fileOutputStream.write(arrayOfByte, 0, i);
          continue;
        } 
        fileInputStream.close();
        fileOutputStream.flush();
        file.delete();
        paramCallback.invoke(new Object[0]);
        return;
      } 
    } catch (FileNotFoundException fileNotFoundException) {
      paramCallback.invoke(new Object[] { "Source file not found." });
      return;
    } catch (Exception exception) {
      paramCallback.invoke(new Object[] { exception.toString() });
      return;
    } 
  }
  
  static void b(String paramString1, String paramString2, Promise paramPromise) {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic e : (Ljava/lang/String;)Ljava/lang/String;
    //   4: astore #7
    //   6: aload_0
    //   7: astore #6
    //   9: aload #7
    //   11: ifnull -> 18
    //   14: aload #7
    //   16: astore #6
    //   18: iconst_0
    //   19: istore #5
    //   21: aload #7
    //   23: ifnull -> 105
    //   26: aload #7
    //   28: ldc_w 'bundle-assets://'
    //   31: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   34: ifeq -> 105
    //   37: aload #6
    //   39: ldc_w 'bundle-assets://'
    //   42: ldc ''
    //   44: invokevirtual replace : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   47: astore #7
    //   49: getstatic com/RNFetchBlob/RNFetchBlob.RCTContext : Lcom/facebook/react/bridge/ReactApplicationContext;
    //   52: invokevirtual getAssets : ()Landroid/content/res/AssetManager;
    //   55: aload #7
    //   57: invokevirtual openFd : (Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;
    //   60: invokevirtual getLength : ()J
    //   63: l2i
    //   64: istore #4
    //   66: iload #4
    //   68: newarray byte
    //   70: astore_0
    //   71: getstatic com/RNFetchBlob/RNFetchBlob.RCTContext : Lcom/facebook/react/bridge/ReactApplicationContext;
    //   74: invokevirtual getAssets : ()Landroid/content/res/AssetManager;
    //   77: aload #7
    //   79: invokevirtual open : (Ljava/lang/String;)Ljava/io/InputStream;
    //   82: astore #7
    //   84: aload #7
    //   86: aload_0
    //   87: iconst_0
    //   88: iload #4
    //   90: invokevirtual read : ([BII)I
    //   93: istore_3
    //   94: aload #7
    //   96: invokevirtual close : ()V
    //   99: aload_0
    //   100: astore #7
    //   102: goto -> 191
    //   105: aload #7
    //   107: ifnonnull -> 148
    //   110: getstatic com/RNFetchBlob/RNFetchBlob.RCTContext : Lcom/facebook/react/bridge/ReactApplicationContext;
    //   113: invokevirtual getContentResolver : ()Landroid/content/ContentResolver;
    //   116: aload #6
    //   118: invokestatic parse : (Ljava/lang/String;)Landroid/net/Uri;
    //   121: invokevirtual openInputStream : (Landroid/net/Uri;)Ljava/io/InputStream;
    //   124: astore #7
    //   126: aload #7
    //   128: invokevirtual available : ()I
    //   131: istore #4
    //   133: iload #4
    //   135: newarray byte
    //   137: astore_0
    //   138: aload #7
    //   140: aload_0
    //   141: invokevirtual read : ([B)I
    //   144: istore_3
    //   145: goto -> 94
    //   148: new java/io/File
    //   151: dup
    //   152: aload #6
    //   154: invokespecial <init> : (Ljava/lang/String;)V
    //   157: astore_0
    //   158: aload_0
    //   159: invokevirtual length : ()J
    //   162: l2i
    //   163: istore #4
    //   165: iload #4
    //   167: newarray byte
    //   169: astore #7
    //   171: new java/io/FileInputStream
    //   174: dup
    //   175: aload_0
    //   176: invokespecial <init> : (Ljava/io/File;)V
    //   179: astore_0
    //   180: aload_0
    //   181: aload #7
    //   183: invokevirtual read : ([B)I
    //   186: istore_3
    //   187: aload_0
    //   188: invokevirtual close : ()V
    //   191: iload_3
    //   192: iload #4
    //   194: if_icmpge -> 248
    //   197: new java/lang/StringBuilder
    //   200: dup
    //   201: invokespecial <init> : ()V
    //   204: astore_0
    //   205: aload_0
    //   206: ldc_w 'Read only '
    //   209: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   212: pop
    //   213: aload_0
    //   214: iload_3
    //   215: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   218: pop
    //   219: aload_0
    //   220: ldc_w ' bytes of '
    //   223: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   226: pop
    //   227: aload_0
    //   228: iload #4
    //   230: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   233: pop
    //   234: aload_2
    //   235: ldc_w 'EUNSPECIFIED'
    //   238: aload_0
    //   239: invokevirtual toString : ()Ljava/lang/String;
    //   242: invokeinterface reject : (Ljava/lang/String;Ljava/lang/String;)V
    //   247: return
    //   248: aload_1
    //   249: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   252: astore_0
    //   253: iconst_m1
    //   254: istore_3
    //   255: aload_0
    //   256: invokevirtual hashCode : ()I
    //   259: istore #4
    //   261: iload #4
    //   263: ldc_w -1396204209
    //   266: if_icmpeq -> 318
    //   269: iload #4
    //   271: ldc_w 3600241
    //   274: if_icmpeq -> 303
    //   277: iload #4
    //   279: ldc_w 93106001
    //   282: if_icmpeq -> 288
    //   285: goto -> 329
    //   288: aload_0
    //   289: ldc_w 'ascii'
    //   292: invokevirtual equals : (Ljava/lang/Object;)Z
    //   295: ifeq -> 329
    //   298: iconst_1
    //   299: istore_3
    //   300: goto -> 329
    //   303: aload_0
    //   304: ldc_w 'utf8'
    //   307: invokevirtual equals : (Ljava/lang/Object;)Z
    //   310: ifeq -> 329
    //   313: iconst_2
    //   314: istore_3
    //   315: goto -> 329
    //   318: aload_0
    //   319: ldc 'base64'
    //   321: invokevirtual equals : (Ljava/lang/Object;)Z
    //   324: ifeq -> 329
    //   327: iconst_0
    //   328: istore_3
    //   329: iload_3
    //   330: ifeq -> 411
    //   333: iload_3
    //   334: iconst_1
    //   335: if_icmpeq -> 374
    //   338: iload_3
    //   339: iconst_2
    //   340: if_icmpeq -> 361
    //   343: new java/lang/String
    //   346: dup
    //   347: aload #7
    //   349: invokespecial <init> : ([B)V
    //   352: astore_0
    //   353: aload_2
    //   354: aload_0
    //   355: invokeinterface resolve : (Ljava/lang/Object;)V
    //   360: return
    //   361: new java/lang/String
    //   364: dup
    //   365: aload #7
    //   367: invokespecial <init> : ([B)V
    //   370: astore_0
    //   371: goto -> 353
    //   374: invokestatic createArray : ()Lcom/facebook/react/bridge/WritableArray;
    //   377: astore_1
    //   378: aload #7
    //   380: arraylength
    //   381: istore #4
    //   383: iload #5
    //   385: istore_3
    //   386: aload_1
    //   387: astore_0
    //   388: iload_3
    //   389: iload #4
    //   391: if_icmpge -> 353
    //   394: aload_1
    //   395: aload #7
    //   397: iload_3
    //   398: baload
    //   399: invokeinterface pushInt : (I)V
    //   404: iload_3
    //   405: iconst_1
    //   406: iadd
    //   407: istore_3
    //   408: goto -> 386
    //   411: aload #7
    //   413: iconst_2
    //   414: invokestatic encodeToString : ([BI)Ljava/lang/String;
    //   417: astore_0
    //   418: goto -> 353
    //   421: astore_0
    //   422: aload_2
    //   423: ldc_w 'EUNSPECIFIED'
    //   426: aload_0
    //   427: invokevirtual getLocalizedMessage : ()Ljava/lang/String;
    //   430: invokeinterface reject : (Ljava/lang/String;Ljava/lang/String;)V
    //   435: return
    //   436: astore_0
    //   437: aload_0
    //   438: invokevirtual getLocalizedMessage : ()Ljava/lang/String;
    //   441: astore_0
    //   442: aload_0
    //   443: ldc_w 'EISDIR'
    //   446: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   449: ifeq -> 503
    //   452: new java/lang/StringBuilder
    //   455: dup
    //   456: invokespecial <init> : ()V
    //   459: astore_1
    //   460: aload_1
    //   461: ldc_w 'Expecting a file but ''
    //   464: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   467: pop
    //   468: aload_1
    //   469: aload #6
    //   471: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   474: pop
    //   475: aload_1
    //   476: ldc_w '' is a directory; '
    //   479: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   482: pop
    //   483: aload_1
    //   484: aload_0
    //   485: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   488: pop
    //   489: aload_2
    //   490: ldc_w 'EISDIR'
    //   493: aload_1
    //   494: invokevirtual toString : ()Ljava/lang/String;
    //   497: invokeinterface reject : (Ljava/lang/String;Ljava/lang/String;)V
    //   502: return
    //   503: new java/lang/StringBuilder
    //   506: dup
    //   507: invokespecial <init> : ()V
    //   510: astore_1
    //   511: aload_1
    //   512: ldc_w 'No such file ''
    //   515: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   518: pop
    //   519: aload_1
    //   520: aload #6
    //   522: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   525: pop
    //   526: aload_1
    //   527: ldc_w ''; '
    //   530: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   533: pop
    //   534: aload_1
    //   535: aload_0
    //   536: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   539: pop
    //   540: aload_2
    //   541: ldc_w 'ENOENT'
    //   544: aload_1
    //   545: invokevirtual toString : ()Ljava/lang/String;
    //   548: invokeinterface reject : (Ljava/lang/String;Ljava/lang/String;)V
    //   553: return
    // Exception table:
    //   from	to	target	type
    //   26	94	436	java/io/FileNotFoundException
    //   26	94	421	java/lang/Exception
    //   94	99	436	java/io/FileNotFoundException
    //   94	99	421	java/lang/Exception
    //   110	145	436	java/io/FileNotFoundException
    //   110	145	421	java/lang/Exception
    //   148	191	436	java/io/FileNotFoundException
    //   148	191	421	java/lang/Exception
    //   197	247	436	java/io/FileNotFoundException
    //   197	247	421	java/lang/Exception
    //   248	253	436	java/io/FileNotFoundException
    //   248	253	421	java/lang/Exception
    //   255	261	436	java/io/FileNotFoundException
    //   255	261	421	java/lang/Exception
    //   288	298	436	java/io/FileNotFoundException
    //   288	298	421	java/lang/Exception
    //   303	313	436	java/io/FileNotFoundException
    //   303	313	421	java/lang/Exception
    //   318	327	436	java/io/FileNotFoundException
    //   318	327	421	java/lang/Exception
    //   343	353	436	java/io/FileNotFoundException
    //   343	353	421	java/lang/Exception
    //   353	360	436	java/io/FileNotFoundException
    //   353	360	421	java/lang/Exception
    //   361	371	436	java/io/FileNotFoundException
    //   361	371	421	java/lang/Exception
    //   374	383	436	java/io/FileNotFoundException
    //   374	383	421	java/lang/Exception
    //   394	404	436	java/io/FileNotFoundException
    //   394	404	421	java/lang/Exception
    //   411	418	436	java/io/FileNotFoundException
    //   411	418	421	java/lang/Exception
  }
  
  static void c(String paramString, Callback paramCallback) {
    paramString = e(paramString);
    (new a(paramCallback)).execute((Object[])new String[] { paramString });
  }
  
  static void c(String paramString1, String paramString2, Callback paramCallback) {
    d d1 = e.get(paramString1);
    OutputStream outputStream = d1.d;
    byte[] arrayOfByte = a(paramString2, d1.c);
    try {
      outputStream.write(arrayOfByte);
      paramCallback.invoke(new Object[0]);
      return;
    } catch (Exception exception) {
      paramCallback.invoke(new Object[] { exception.getLocalizedMessage() });
      return;
    } 
  }
  
  static boolean c(String paramString) {
    return (paramString != null && paramString.startsWith("bundle-assets://"));
  }
  
  static void d(String paramString, Callback paramCallback) {
    try {
      StringBuilder stringBuilder;
      paramString = e(paramString);
      WritableMap writableMap = f(paramString);
      if (writableMap == null) {
        stringBuilder = new StringBuilder();
        stringBuilder.append("failed to stat path `");
        stringBuilder.append(paramString);
        stringBuilder.append("` because it does not exist or it is not a folder");
        paramCallback.invoke(new Object[] { stringBuilder.toString(), null });
        return;
      } 
      paramCallback.invoke(new Object[] { null, stringBuilder });
      return;
    } catch (Exception exception) {
      paramCallback.invoke(new Object[] { exception.getLocalizedMessage() });
      return;
    } 
  }
  
  private static boolean d(String paramString) {
    if (paramString.startsWith("bundle-assets://"))
      try {
        RNFetchBlob.RCTContext.getAssets().open(paramString.replace("bundle-assets://", ""));
        return true;
      } catch (IOException iOException) {
        return false;
      }  
    return (new File((String)iOException)).exists();
  }
  
  static String e(String paramString) {
    if (paramString == null)
      return null; 
    if (!paramString.matches("\\w+\\:.*"))
      return paramString; 
    if (paramString.startsWith("file://"))
      return paramString.replace("file://", ""); 
    Uri uri = Uri.parse(paramString);
    return paramString.startsWith("bundle-assets://") ? paramString : a.a((Context)RNFetchBlob.RCTContext, uri);
  }
  
  static void e(String paramString, Callback paramCallback) {
    try {
      a(new File(e(paramString)));
      paramCallback.invoke(new Object[] { null, Boolean.valueOf(true) });
      return;
    } catch (Exception exception) {
      paramCallback.invoke(new Object[] { exception.getLocalizedMessage(), Boolean.valueOf(false) });
      return;
    } 
  }
  
  static WritableMap f(String paramString) {
    WritableMap writableMap;
    File file;
    try {
      paramString = e(paramString);
      writableMap = Arguments.createMap();
      boolean bool = c(paramString);
      if (bool) {
        String str = paramString.replace("bundle-assets://", "");
        AssetFileDescriptor assetFileDescriptor = RNFetchBlob.RCTContext.getAssets().openFd(str);
        writableMap.putString("filename", str);
        writableMap.putString("path", paramString);
        writableMap.putString("type", "asset");
        writableMap.putString("size", String.valueOf(assetFileDescriptor.getLength()));
        writableMap.putInt("lastModified", 0);
        return writableMap;
      } 
      file = new File(paramString);
      if (!file.exists())
        return null; 
      writableMap.putString("filename", file.getName());
      writableMap.putString("path", file.getPath());
      if (file.isDirectory()) {
        paramString = "directory";
        writableMap.putString("type", paramString);
        writableMap.putString("size", String.valueOf(file.length()));
        writableMap.putString("lastModified", String.valueOf(file.lastModified()));
        return writableMap;
      } 
    } catch (Exception exception) {
      return null;
    } 
    paramString = "file";
    writableMap.putString("type", paramString);
    writableMap.putString("size", String.valueOf(file.length()));
    writableMap.putString("lastModified", String.valueOf(file.lastModified()));
    return writableMap;
  }
  
  void a(String paramString1, String paramString2, int paramInt1, int paramInt2, String paramString3) {
    String str1;
    String str2 = e(paramString1);
    if (str2 != null) {
      str1 = str2;
    } else {
      str1 = paramString1;
    } 
    try {
      InputStream inputStream;
      int i;
      boolean bool = paramString2.equalsIgnoreCase("base64");
      if (bool) {
        i = 4095;
      } else {
        i = 4096;
      } 
      if (paramInt1 > 0)
        i = paramInt1; 
      if (str2 != null && str1.startsWith("bundle-assets://")) {
        inputStream = RNFetchBlob.RCTContext.getAssets().open(str1.replace("bundle-assets://", ""));
      } else if (str2 == null) {
        inputStream = RNFetchBlob.RCTContext.getContentResolver().openInputStream(Uri.parse(str1));
      } else {
        inputStream = new FileInputStream(new File(str1));
      } 
      byte[] arrayOfByte = new byte[i];
      bool = paramString2.equalsIgnoreCase("utf8");
      str2 = "data";
      if (bool) {
        CharsetEncoder charsetEncoder = Charset.forName("UTF-8").newEncoder();
        while (true) {
          paramInt1 = inputStream.read(arrayOfByte);
          if (paramInt1 != -1) {
            charsetEncoder.encode(ByteBuffer.wrap(arrayOfByte).asCharBuffer());
            a(paramString3, "data", new String(arrayOfByte, 0, paramInt1));
            if (paramInt2 > 0)
              SystemClock.sleep(paramInt2); 
            continue;
          } 
          break;
        } 
      } else {
        WritableArray writableArray;
        if (paramString2.equalsIgnoreCase("ascii")) {
          while (true) {
            i = inputStream.read(arrayOfByte);
            if (i != -1) {
              writableArray = Arguments.createArray();
              for (paramInt1 = 0; paramInt1 < i; paramInt1++)
                writableArray.pushInt(arrayOfByte[paramInt1]); 
              a(paramString3, "data", writableArray);
              if (paramInt2 > 0)
                SystemClock.sleep(paramInt2); 
              continue;
            } 
            break;
          } 
        } else if (paramString2.equalsIgnoreCase("base64")) {
          while (true) {
            paramInt1 = inputStream.read(arrayOfByte);
            if (paramInt1 != -1) {
              String str;
              if (paramInt1 < i) {
                byte[] arrayOfByte1 = new byte[paramInt1];
                System.arraycopy(arrayOfByte, 0, arrayOfByte1, 0, paramInt1);
                str = Base64.encodeToString(arrayOfByte1, 2);
              } else {
                str = Base64.encodeToString(arrayOfByte, 2);
              } 
              a(paramString3, (String)writableArray, str);
              if (paramInt2 > 0)
                SystemClock.sleep(paramInt2); 
              continue;
            } 
            break;
          } 
        } else {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Unrecognized encoding `");
          stringBuilder.append(paramString2);
          stringBuilder.append("`, should be one of `base64`, `utf8`, `ascii`");
          a(paramString3, "error", "EINVAL", stringBuilder.toString());
          paramInt1 = 1;
          if (paramInt1 == 0)
            a(paramString3, "end", ""); 
        } 
      } 
    } catch (FileNotFoundException fileNotFoundException) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("No such file '");
      stringBuilder.append(str1);
      stringBuilder.append("'");
      a(paramString3, "error", "ENOENT", stringBuilder.toString());
      return;
    } catch (Exception exception) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Failed to convert data to ");
      stringBuilder.append(paramString2);
      stringBuilder.append(" encoded string. This might be because this encoding cannot be used for this data.");
      a(paramString3, "error", "EUNSPECIFIED", stringBuilder.toString());
      exception.printStackTrace();
      return;
    } 
    paramInt1 = 0;
    if (paramInt1 == 0)
      a(paramString3, "end", ""); 
  }
  
  void a(String paramString1, String paramString2, boolean paramBoolean, Callback paramCallback) {
    try {
      StringBuilder stringBuilder;
      File file1 = new File(paramString1);
      File file2 = file1.getParentFile();
      if (!file1.exists()) {
        if (file2 != null && !file2.exists() && !file2.mkdirs()) {
          stringBuilder = new StringBuilder();
          stringBuilder.append("Failed to create parent directory of '");
          stringBuilder.append(paramString1);
          stringBuilder.append("'");
          paramCallback.invoke(new Object[] { "ENOTDIR", stringBuilder.toString() });
          return;
        } 
        if (!file1.createNewFile()) {
          stringBuilder = new StringBuilder();
          stringBuilder.append("File '");
          stringBuilder.append(paramString1);
          stringBuilder.append("' does not exist and could not be created");
          paramCallback.invoke(new Object[] { "ENOENT", stringBuilder.toString() });
          return;
        } 
      } else if (file1.isDirectory()) {
        stringBuilder = new StringBuilder();
        stringBuilder.append("Expecting a file but '");
        stringBuilder.append(paramString1);
        stringBuilder.append("' is a directory");
        paramCallback.invoke(new Object[] { "EISDIR", stringBuilder.toString() });
        return;
      } 
      FileOutputStream fileOutputStream = new FileOutputStream(paramString1, paramBoolean);
      this.c = (String)stringBuilder;
      String str = UUID.randomUUID().toString();
      e.put(str, this);
      this.d = fileOutputStream;
      paramCallback.invoke(new Object[] { null, null, str });
      return;
    } catch (Exception exception) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Failed to create write stream at path `");
      stringBuilder.append(paramString1);
      stringBuilder.append("`; ");
      stringBuilder.append(exception.getLocalizedMessage());
      paramCallback.invoke(new Object[] { "EUNSPECIFIED", stringBuilder.toString() });
      return;
    } 
  }
  
  void a(String[] paramArrayOfString1, String[] paramArrayOfString2, Callback paramCallback) {
    try {
      MediaScannerConnection.scanFile((Context)this.a, paramArrayOfString1, paramArrayOfString2, new b(this, paramCallback));
      return;
    } catch (Exception exception) {
      paramCallback.invoke(new Object[] { exception.getLocalizedMessage(), null });
      return;
    } 
  }
  
  class a extends AsyncTask<String, Integer, Integer> {
    a(d this$0) {}
    
    protected Integer a(String... param1VarArgs) {
      Callback callback;
      StringBuilder stringBuilder;
      WritableArray writableArray = Arguments.createArray();
      Integer integer = Integer.valueOf(0);
      if (param1VarArgs[0] == null) {
        this.a.invoke(new Object[] { "the path specified for lstat is either `null` or `undefined`." });
        return integer;
      } 
      File file = new File(param1VarArgs[0]);
      if (!file.exists()) {
        callback = this.a;
        stringBuilder = new StringBuilder();
        stringBuilder.append("failed to lstat path `");
        stringBuilder.append(param1VarArgs[0]);
        stringBuilder.append("` because it does not exist or it is not a folder");
        callback.invoke(new Object[] { stringBuilder.toString() });
        return integer;
      } 
      if (stringBuilder.isDirectory()) {
        param1VarArgs = stringBuilder.list();
        int j = param1VarArgs.length;
        for (int i = 0; i < j; i++) {
          String str = param1VarArgs[i];
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append(stringBuilder.getPath());
          stringBuilder1.append("/");
          stringBuilder1.append(str);
          callback.pushMap((ReadableMap)d.f(stringBuilder1.toString()));
        } 
      } else {
        callback.pushMap((ReadableMap)d.f(stringBuilder.getAbsolutePath()));
      } 
      this.a.invoke(new Object[] { null, callback });
      return integer;
    }
  }
  
  class b implements MediaScannerConnection.OnScanCompletedListener {
    b(d this$0, Callback param1Callback) {}
    
    public void onScanCompleted(String param1String, Uri param1Uri) {
      this.a.invoke(new Object[] { null, Boolean.valueOf(true) });
    }
  }
  
  class c extends AsyncTask<ReadableArray, Integer, Integer> {
    c(d this$0) {}
    
    protected Integer a(ReadableArray... param1VarArgs) {
      try {
        ArrayList<String> arrayList = new ArrayList();
        for (int i = 0;; i++) {
          if (i < param1VarArgs[0].size()) {
            String str = param1VarArgs[0].getString(i);
            File file = new File(str);
            if (file.exists() && !file.delete())
              arrayList.add(str); 
          } else {
            if (arrayList.isEmpty()) {
              this.a.invoke(new Object[] { null, Boolean.valueOf(true) });
            } else {
              StringBuilder stringBuilder = new StringBuilder();
              stringBuilder.append("Failed to delete: ");
              Iterator<String> iterator = arrayList.iterator();
              while (iterator.hasNext()) {
                stringBuilder.append(iterator.next());
                stringBuilder.append(", ");
              } 
              this.a.invoke(new Object[] { stringBuilder.toString() });
            } 
            return Integer.valueOf(param1VarArgs[0].size());
          } 
        } 
      } catch (Exception exception) {
        this.a.invoke(new Object[] { exception.getLocalizedMessage() });
      } 
      return Integer.valueOf(param1VarArgs[0].size());
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/RNFetchBlob/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */