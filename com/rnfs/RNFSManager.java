package com.rnfs;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.database.Cursor;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.util.Base64;
import android.util.SparseArray;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.RCTNativeAppEventEmitter;
import e.e.o.d0.a.a;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.net.URL;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@a(name = "RNFSManager")
public class RNFSManager extends ReactContextBaseJavaModule {
  static final String MODULE_NAME = "RNFSManager";
  
  private static final String RNFSCachesDirectoryPath = "RNFSCachesDirectoryPath";
  
  private static final String RNFSDocumentDirectory = "RNFSDocumentDirectory";
  
  private static final String RNFSDocumentDirectoryPath = "RNFSDocumentDirectoryPath";
  
  private static final String RNFSDownloadDirectoryPath = "RNFSDownloadDirectoryPath";
  
  private static final String RNFSExternalCachesDirectoryPath = "RNFSExternalCachesDirectoryPath";
  
  private static final String RNFSExternalDirectoryPath = "RNFSExternalDirectoryPath";
  
  private static final String RNFSExternalStorageDirectoryPath = "RNFSExternalStorageDirectoryPath";
  
  private static final String RNFSFileTypeDirectory = "RNFSFileTypeDirectory";
  
  private static final String RNFSFileTypeRegular = "RNFSFileTypeRegular";
  
  private static final String RNFSPicturesDirectoryPath = "RNFSPicturesDirectoryPath";
  
  private static final String RNFSTemporaryDirectoryPath = "RNFSTemporaryDirectoryPath";
  
  private SparseArray<c> downloaders = new SparseArray();
  
  private ReactApplicationContext reactContext;
  
  private SparseArray<h> uploaders = new SparseArray();
  
  public RNFSManager(ReactApplicationContext paramReactApplicationContext) {
    super(paramReactApplicationContext);
    this.reactContext = paramReactApplicationContext;
  }
  
  private void DeleteRecursive(File paramFile) {
    if (paramFile.isDirectory()) {
      File[] arrayOfFile = paramFile.listFiles();
      int j = arrayOfFile.length;
      for (int i = 0; i < j; i++)
        DeleteRecursive(arrayOfFile[i]); 
    } 
    paramFile.delete();
  }
  
  private void copyInputStream(InputStream paramInputStream, String paramString1, String paramString2, Promise paramPromise) {
    // Byte code:
    //   0: aload_0
    //   1: aload_3
    //   2: iconst_0
    //   3: invokespecial getOutputStream : (Ljava/lang/String;Z)Ljava/io/OutputStream;
    //   6: astore #6
    //   8: aload #6
    //   10: astore #7
    //   12: sipush #10240
    //   15: newarray byte
    //   17: astore #8
    //   19: aload #6
    //   21: astore #7
    //   23: aload_1
    //   24: aload #8
    //   26: invokevirtual read : ([B)I
    //   29: istore #5
    //   31: iload #5
    //   33: iconst_m1
    //   34: if_icmpeq -> 54
    //   37: aload #6
    //   39: astore #7
    //   41: aload #6
    //   43: aload #8
    //   45: iconst_0
    //   46: iload #5
    //   48: invokevirtual write : ([BII)V
    //   51: goto -> 19
    //   54: aload #6
    //   56: astore #7
    //   58: aload #4
    //   60: aconst_null
    //   61: invokeinterface resolve : (Ljava/lang/Object;)V
    //   66: aload_1
    //   67: ifnull -> 77
    //   70: aload_1
    //   71: invokevirtual close : ()V
    //   74: goto -> 77
    //   77: aload #6
    //   79: ifnull -> 171
    //   82: aload #6
    //   84: invokevirtual close : ()V
    //   87: return
    //   88: astore_2
    //   89: goto -> 172
    //   92: astore #8
    //   94: goto -> 109
    //   97: astore_2
    //   98: aconst_null
    //   99: astore #7
    //   101: goto -> 172
    //   104: astore #8
    //   106: aconst_null
    //   107: astore #6
    //   109: aload #6
    //   111: astore #7
    //   113: aload_0
    //   114: aload #4
    //   116: aload_2
    //   117: new java/lang/Exception
    //   120: dup
    //   121: ldc 'Failed to copy '%s' to %s (%s)'
    //   123: iconst_3
    //   124: anewarray java/lang/Object
    //   127: dup
    //   128: iconst_0
    //   129: aload_2
    //   130: aastore
    //   131: dup
    //   132: iconst_1
    //   133: aload_3
    //   134: aastore
    //   135: dup
    //   136: iconst_2
    //   137: aload #8
    //   139: invokevirtual getLocalizedMessage : ()Ljava/lang/String;
    //   142: aastore
    //   143: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   146: invokespecial <init> : (Ljava/lang/String;)V
    //   149: invokespecial reject : (Lcom/facebook/react/bridge/Promise;Ljava/lang/String;Ljava/lang/Exception;)V
    //   152: aload_1
    //   153: ifnull -> 163
    //   156: aload_1
    //   157: invokevirtual close : ()V
    //   160: goto -> 163
    //   163: aload #6
    //   165: ifnull -> 171
    //   168: goto -> 82
    //   171: return
    //   172: aload_1
    //   173: ifnull -> 183
    //   176: aload_1
    //   177: invokevirtual close : ()V
    //   180: goto -> 183
    //   183: aload #7
    //   185: ifnull -> 193
    //   188: aload #7
    //   190: invokevirtual close : ()V
    //   193: goto -> 198
    //   196: aload_2
    //   197: athrow
    //   198: goto -> 196
    //   201: astore_1
    //   202: goto -> 77
    //   205: astore_1
    //   206: return
    //   207: astore_1
    //   208: goto -> 163
    //   211: astore_1
    //   212: goto -> 183
    //   215: astore_1
    //   216: goto -> 193
    // Exception table:
    //   from	to	target	type
    //   0	8	104	java/lang/Exception
    //   0	8	97	finally
    //   12	19	92	java/lang/Exception
    //   12	19	88	finally
    //   23	31	92	java/lang/Exception
    //   23	31	88	finally
    //   41	51	92	java/lang/Exception
    //   41	51	88	finally
    //   58	66	92	java/lang/Exception
    //   58	66	88	finally
    //   70	74	201	java/io/IOException
    //   82	87	205	java/io/IOException
    //   113	152	88	finally
    //   156	160	207	java/io/IOException
    //   176	180	211	java/io/IOException
    //   188	193	215	java/io/IOException
  }
  
  private Uri getFileUri(String paramString, boolean paramBoolean) {
    StringBuilder stringBuilder;
    Uri uri2 = Uri.parse(paramString);
    Uri uri1 = uri2;
    if (uri2.getScheme() == null) {
      File file = new File(paramString);
      if (paramBoolean || !file.isDirectory()) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("file://");
        stringBuilder1.append(paramString);
        return Uri.parse(stringBuilder1.toString());
      } 
      stringBuilder = new StringBuilder();
      stringBuilder.append("EISDIR: illegal operation on a directory, read '");
      stringBuilder.append(paramString);
      stringBuilder.append("'");
      throw new d("EISDIR", stringBuilder.toString());
    } 
    return (Uri)stringBuilder;
  }
  
  private InputStream getInputStream(String paramString) {
    Uri uri = getFileUri(paramString, false);
    try {
      InputStream inputStream = this.reactContext.getContentResolver().openInputStream(uri);
      if (inputStream != null)
        return inputStream; 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("ENOENT: could not open an input stream for '");
      stringBuilder.append(paramString);
      stringBuilder.append("'");
      throw new d("ENOENT", stringBuilder.toString());
    } catch (FileNotFoundException fileNotFoundException) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("ENOENT: ");
      stringBuilder.append(fileNotFoundException.getMessage());
      stringBuilder.append(", open '");
      stringBuilder.append(paramString);
      stringBuilder.append("'");
      throw new d("ENOENT", stringBuilder.toString());
    } 
  }
  
  private static byte[] getInputStreamBytes(InputStream paramInputStream) {
    // Byte code:
    //   0: new java/io/ByteArrayOutputStream
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_2
    //   8: sipush #1024
    //   11: newarray byte
    //   13: astore_3
    //   14: aload_0
    //   15: aload_3
    //   16: invokevirtual read : ([B)I
    //   19: istore_1
    //   20: iload_1
    //   21: iconst_m1
    //   22: if_icmpeq -> 35
    //   25: aload_2
    //   26: aload_3
    //   27: iconst_0
    //   28: iload_1
    //   29: invokevirtual write : ([BII)V
    //   32: goto -> 14
    //   35: aload_2
    //   36: invokevirtual toByteArray : ()[B
    //   39: astore_0
    //   40: aload_2
    //   41: invokevirtual close : ()V
    //   44: aload_0
    //   45: areturn
    //   46: astore_0
    //   47: aload_2
    //   48: invokevirtual close : ()V
    //   51: goto -> 56
    //   54: aload_0
    //   55: athrow
    //   56: goto -> 54
    //   59: astore_2
    //   60: aload_0
    //   61: areturn
    //   62: astore_2
    //   63: goto -> 51
    // Exception table:
    //   from	to	target	type
    //   14	20	46	finally
    //   25	32	46	finally
    //   35	40	46	finally
    //   40	44	59	java/io/IOException
    //   47	51	62	java/io/IOException
  }
  
  private String getOriginalFilepath(String paramString, boolean paramBoolean) {
    Uri uri = getFileUri(paramString, paramBoolean);
    String str = paramString;
    if (uri.getScheme().equals("content")) {
      String str1 = paramString;
      try {
        Cursor cursor = this.reactContext.getContentResolver().query(uri, null, null, null, null);
        str = paramString;
        str1 = paramString;
        if (cursor.moveToFirst()) {
          str1 = paramString;
          str = cursor.getString(cursor.getColumnIndexOrThrow("_data"));
        } 
        str1 = str;
        cursor.close();
        return str;
      } catch (IllegalArgumentException illegalArgumentException) {
        return str1;
      } 
    } 
    return str;
  }
  
  private OutputStream getOutputStream(String paramString, boolean paramBoolean) {
    Uri uri = getFileUri(paramString, false);
    try {
      String str;
      ContentResolver contentResolver = this.reactContext.getContentResolver();
      if (paramBoolean) {
        str = "wa";
      } else {
        str = "w";
      } 
      OutputStream outputStream = contentResolver.openOutputStream(uri, str);
      if (outputStream != null)
        return outputStream; 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("ENOENT: could not open an output stream for '");
      stringBuilder.append(paramString);
      stringBuilder.append("'");
      throw new d("ENOENT", stringBuilder.toString());
    } catch (FileNotFoundException fileNotFoundException) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("ENOENT: ");
      stringBuilder.append(fileNotFoundException.getMessage());
      stringBuilder.append(", open '");
      stringBuilder.append(paramString);
      stringBuilder.append("'");
      throw new d("ENOENT", stringBuilder.toString());
    } 
  }
  
  private int getResIdentifier(String paramString) {
    int i = paramString.lastIndexOf(".");
    boolean bool2 = true;
    String str2 = paramString.substring(i + 1);
    String str1 = paramString.substring(0, paramString.lastIndexOf("."));
    boolean bool1 = bool2;
    if (!str2.equals("png")) {
      bool1 = bool2;
      if (!str2.equals("jpg")) {
        bool1 = bool2;
        if (!str2.equals("jpeg")) {
          bool1 = bool2;
          if (!str2.equals("bmp")) {
            bool1 = bool2;
            if (!str2.equals("gif")) {
              bool1 = bool2;
              if (!str2.equals("webp")) {
                bool1 = bool2;
                if (!str2.equals("psd")) {
                  bool1 = bool2;
                  if (!str2.equals("svg"))
                    if (str2.equals("tiff")) {
                      bool1 = bool2;
                    } else {
                      bool1 = false;
                    }  
                } 
              } 
            } 
          } 
        } 
      } 
    } 
    Resources resources = getReactApplicationContext().getResources();
    if (Boolean.valueOf(bool1).booleanValue()) {
      paramString = "drawable";
    } else {
      paramString = "raw";
    } 
    return resources.getIdentifier(str1, paramString, getReactApplicationContext().getPackageName());
  }
  
  private void reject(Promise paramPromise, String paramString, Exception paramException) {
    if (paramException instanceof FileNotFoundException) {
      rejectFileNotFound(paramPromise, paramString);
      return;
    } 
    if (paramException instanceof d) {
      paramException = paramException;
      paramString = paramException.a();
    } else {
      paramString = null;
    } 
    paramPromise.reject(paramString, paramException.getMessage());
  }
  
  private void rejectFileIsDirectory(Promise paramPromise) {
    paramPromise.reject("EISDIR", "EISDIR: illegal operation on a directory, read");
  }
  
  private void rejectFileNotFound(Promise paramPromise, String paramString) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("ENOENT: no such file or directory, open '");
    stringBuilder.append(paramString);
    stringBuilder.append("'");
    paramPromise.reject("ENOENT", stringBuilder.toString());
  }
  
  private void sendEvent(ReactContext paramReactContext, String paramString, WritableMap paramWritableMap) {
    ((RCTNativeAppEventEmitter)paramReactContext.getJSModule(RCTNativeAppEventEmitter.class)).emit(paramString, paramWritableMap);
  }
  
  @ReactMethod
  public void appendFile(String paramString1, String paramString2, Promise paramPromise) {
    try {
      byte[] arrayOfByte = Base64.decode(paramString2, 0);
      OutputStream outputStream = getOutputStream(paramString1, true);
      outputStream.write(arrayOfByte);
      outputStream.close();
      paramPromise.resolve(null);
      return;
    } catch (Exception exception) {
      exception.printStackTrace();
      reject(paramPromise, paramString1, exception);
      return;
    } 
  }
  
  @ReactMethod
  public void copyFile(String paramString1, String paramString2, ReadableMap paramReadableMap, Promise paramPromise) {
    (new b(this, paramPromise, paramString1)).execute((Object[])new String[] { paramString1, paramString2 });
  }
  
  @ReactMethod
  public void copyFileAssets(String paramString1, String paramString2, Promise paramPromise) {
    AssetManager assetManager = getReactApplicationContext().getAssets();
    try {
      copyInputStream(assetManager.open(paramString1), paramString1, paramString2, paramPromise);
      return;
    } catch (IOException iOException) {
      reject(paramPromise, paramString1, new Exception(String.format("Asset '%s' could not be opened", new Object[] { paramString1 })));
      return;
    } 
  }
  
  @ReactMethod
  public void copyFileRes(String paramString1, String paramString2, Promise paramPromise) {
    try {
      int i = getResIdentifier(paramString1);
      copyInputStream(getReactApplicationContext().getResources().openRawResource(i), paramString1, paramString2, paramPromise);
      return;
    } catch (Exception exception) {
      reject(paramPromise, paramString1, new Exception(String.format("Res '%s' could not be opened", new Object[] { paramString1 })));
      return;
    } 
  }
  
  @ReactMethod
  public void downloadFile(ReadableMap paramReadableMap, Promise paramPromise) {
    try {
      File file = new File(paramReadableMap.getString("toFile"));
      URL uRL = new URL(paramReadableMap.getString("fromUrl"));
      int i = paramReadableMap.getInt("jobId");
      ReadableMap readableMap = paramReadableMap.getMap("headers");
      int j = paramReadableMap.getInt("progressInterval");
      int k = paramReadableMap.getInt("progressDivider");
      int m = paramReadableMap.getInt("readTimeout");
      int n = paramReadableMap.getInt("connectionTimeout");
      boolean bool1 = paramReadableMap.getBoolean("hasBeginCallback");
      boolean bool2 = paramReadableMap.getBoolean("hasProgressCallback");
      a a = new a();
      a.a = uRL;
      a.b = file;
      a.c = readableMap;
      a.d = j;
      a.e = k;
      a.f = m;
      a.g = n;
      a.h = new c(this, i, paramPromise, paramReadableMap);
      if (bool1)
        a.i = new d(this, i); 
      if (bool2)
        a.j = new e(this, i); 
      c c = new c();
      c.execute((Object[])new a[] { a });
      this.downloaders.put(i, c);
      return;
    } catch (Exception exception) {
      exception.printStackTrace();
      reject(paramPromise, paramReadableMap.getString("toFile"), exception);
      return;
    } 
  }
  
  @ReactMethod
  public void exists(String paramString, Promise paramPromise) {
    try {
      paramPromise.resolve(Boolean.valueOf((new File(paramString)).exists()));
      return;
    } catch (Exception exception) {
      exception.printStackTrace();
      reject(paramPromise, paramString, exception);
      return;
    } 
  }
  
  @ReactMethod
  public void existsAssets(String paramString, Promise paramPromise) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual getReactApplicationContext : ()Lcom/facebook/react/bridge/ReactApplicationContext;
    //   4: invokevirtual getAssets : ()Landroid/content/res/AssetManager;
    //   7: astore #5
    //   9: aload #5
    //   11: aload_1
    //   12: invokevirtual list : (Ljava/lang/String;)[Ljava/lang/String;
    //   15: astore_3
    //   16: aload_3
    //   17: ifnull -> 36
    //   20: aload_3
    //   21: arraylength
    //   22: ifle -> 36
    //   25: aload_2
    //   26: iconst_1
    //   27: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   30: invokeinterface resolve : (Ljava/lang/Object;)V
    //   35: return
    //   36: aconst_null
    //   37: astore_3
    //   38: aconst_null
    //   39: astore #4
    //   41: aload #5
    //   43: aload_1
    //   44: invokevirtual open : (Ljava/lang/String;)Ljava/io/InputStream;
    //   47: astore #5
    //   49: aload #5
    //   51: astore #4
    //   53: aload #5
    //   55: astore_3
    //   56: aload_2
    //   57: iconst_1
    //   58: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   61: invokeinterface resolve : (Ljava/lang/Object;)V
    //   66: aload #5
    //   68: ifnull -> 127
    //   71: aload #5
    //   73: astore_3
    //   74: aload_3
    //   75: invokevirtual close : ()V
    //   78: return
    //   79: astore_3
    //   80: goto -> 103
    //   83: aload_3
    //   84: astore #4
    //   86: aload_2
    //   87: iconst_0
    //   88: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   91: invokeinterface resolve : (Ljava/lang/Object;)V
    //   96: aload_3
    //   97: ifnull -> 127
    //   100: goto -> 74
    //   103: aload #4
    //   105: ifnull -> 113
    //   108: aload #4
    //   110: invokevirtual close : ()V
    //   113: aload_3
    //   114: athrow
    //   115: astore_3
    //   116: aload_3
    //   117: invokevirtual printStackTrace : ()V
    //   120: aload_0
    //   121: aload_2
    //   122: aload_1
    //   123: aload_3
    //   124: invokespecial reject : (Lcom/facebook/react/bridge/Promise;Ljava/lang/String;Ljava/lang/Exception;)V
    //   127: return
    //   128: astore_3
    //   129: goto -> 36
    //   132: astore #4
    //   134: goto -> 83
    //   137: astore_1
    //   138: return
    //   139: astore #4
    //   141: goto -> 113
    // Exception table:
    //   from	to	target	type
    //   0	9	115	java/lang/Exception
    //   9	16	128	java/lang/Exception
    //   20	35	128	java/lang/Exception
    //   41	49	132	java/lang/Exception
    //   41	49	79	finally
    //   56	66	132	java/lang/Exception
    //   56	66	79	finally
    //   74	78	137	java/lang/Exception
    //   86	96	79	finally
    //   108	113	139	java/lang/Exception
    //   113	115	115	java/lang/Exception
  }
  
  @ReactMethod
  public void existsRes(String paramString, Promise paramPromise) {
    try {
      Boolean bool;
      if (getResIdentifier(paramString) > 0) {
        bool = Boolean.valueOf(true);
      } else {
        bool = Boolean.valueOf(false);
      } 
      paramPromise.resolve(bool);
      return;
    } catch (Exception exception) {
      exception.printStackTrace();
      reject(paramPromise, paramString, exception);
      return;
    } 
  }
  
  @ReactMethod
  public void getAllExternalFilesDirs(Promise paramPromise) {
    File[] arrayOfFile = getReactApplicationContext().getExternalFilesDirs(null);
    WritableArray writableArray = Arguments.createArray();
    int j = arrayOfFile.length;
    for (int i = 0; i < j; i++) {
      File file = arrayOfFile[i];
      if (file != null)
        writableArray.pushString(file.getAbsolutePath()); 
    } 
    paramPromise.resolve(writableArray);
  }
  
  public Map<String, Object> getConstants() {
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    Integer integer = Integer.valueOf(0);
    hashMap.put("RNFSDocumentDirectory", integer);
    hashMap.put("RNFSDocumentDirectoryPath", getReactApplicationContext().getFilesDir().getAbsolutePath());
    hashMap.put("RNFSTemporaryDirectoryPath", getReactApplicationContext().getCacheDir().getAbsolutePath());
    hashMap.put("RNFSPicturesDirectoryPath", Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).getAbsolutePath());
    hashMap.put("RNFSCachesDirectoryPath", getReactApplicationContext().getCacheDir().getAbsolutePath());
    hashMap.put("RNFSDownloadDirectoryPath", Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath());
    hashMap.put("RNFSFileTypeRegular", integer);
    hashMap.put("RNFSFileTypeDirectory", Integer.valueOf(1));
    File file = Environment.getExternalStorageDirectory();
    if (file != null) {
      hashMap.put("RNFSExternalStorageDirectoryPath", file.getAbsolutePath());
    } else {
      hashMap.put("RNFSExternalStorageDirectoryPath", null);
    } 
    file = getReactApplicationContext().getExternalFilesDir(null);
    if (file != null) {
      hashMap.put("RNFSExternalDirectoryPath", file.getAbsolutePath());
    } else {
      hashMap.put("RNFSExternalDirectoryPath", null);
    } 
    file = getReactApplicationContext().getExternalCacheDir();
    if (file != null) {
      hashMap.put("RNFSExternalCachesDirectoryPath", file.getAbsolutePath());
      return (Map)hashMap;
    } 
    hashMap.put("RNFSExternalCachesDirectoryPath", null);
    return (Map)hashMap;
  }
  
  @ReactMethod
  public void getFSInfo(Promise paramPromise) {
    long l1;
    long l2;
    long l3;
    long l4;
    StatFs statFs1 = new StatFs(Environment.getDataDirectory().getPath());
    StatFs statFs2 = new StatFs(Environment.getExternalStorageDirectory().getPath());
    if (Build.VERSION.SDK_INT >= 18) {
      l2 = statFs1.getTotalBytes();
      l1 = statFs1.getFreeBytes();
      l4 = statFs2.getTotalBytes();
      l3 = statFs2.getFreeBytes();
    } else {
      l2 = statFs1.getBlockSize();
      l3 = statFs1.getBlockCount();
      l1 = statFs1.getAvailableBlocks() * l2;
      l2 = l3 * l2;
      l3 = 0L;
      l4 = l3;
    } 
    WritableMap writableMap = Arguments.createMap();
    writableMap.putDouble("totalSpace", l2);
    writableMap.putDouble("freeSpace", l1);
    writableMap.putDouble("totalSpaceEx", l4);
    writableMap.putDouble("freeSpaceEx", l3);
    paramPromise.resolve(writableMap);
  }
  
  public String getName() {
    return "RNFSManager";
  }
  
  @ReactMethod
  public void hash(String paramString1, String paramString2, Promise paramPromise) {
    try {
      HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
      hashMap.put("md5", "MD5");
      hashMap.put("sha1", "SHA-1");
      hashMap.put("sha224", "SHA-224");
      hashMap.put("sha256", "SHA-256");
      hashMap.put("sha384", "SHA-384");
      hashMap.put("sha512", "SHA-512");
      if (hashMap.containsKey(paramString2)) {
        File file = new File(paramString1);
        if (file.isDirectory()) {
          rejectFileIsDirectory(paramPromise);
          return;
        } 
        if (!file.exists()) {
          rejectFileNotFound(paramPromise, paramString1);
          return;
        } 
        MessageDigest messageDigest = MessageDigest.getInstance((String)hashMap.get(paramString2));
        FileInputStream fileInputStream = new FileInputStream(paramString1);
        byte[] arrayOfByte = new byte[10240];
        while (true) {
          int i = fileInputStream.read(arrayOfByte);
          if (i != -1) {
            messageDigest.update(arrayOfByte, 0, i);
            continue;
          } 
          StringBuilder stringBuilder = new StringBuilder();
          byte[] arrayOfByte1 = messageDigest.digest();
          int j = arrayOfByte1.length;
          for (i = 0; i < j; i++) {
            stringBuilder.append(String.format("%02x", new Object[] { Byte.valueOf(arrayOfByte1[i]) }));
          } 
          paramPromise.resolve(stringBuilder.toString());
          return;
        } 
      } 
      throw new Exception("Invalid hash algorithm");
    } catch (Exception exception) {
      exception.printStackTrace();
      reject(paramPromise, paramString1, exception);
      return;
    } 
  }
  
  @ReactMethod
  public void mkdir(String paramString, ReadableMap paramReadableMap, Promise paramPromise) {
    try {
      File file = new File(paramString);
      file.mkdirs();
      if (file.exists()) {
        paramPromise.resolve(null);
        return;
      } 
      throw new Exception("Directory could not be created");
    } catch (Exception exception) {
      exception.printStackTrace();
      reject(paramPromise, paramString, exception);
      return;
    } 
  }
  
  @ReactMethod
  public void moveFile(String paramString1, String paramString2, ReadableMap paramReadableMap, Promise paramPromise) {
    try {
      File file = new File(paramString1);
      if (!file.renameTo(new File(paramString2))) {
        (new a(this, file, paramPromise, paramString1)).execute((Object[])new String[] { paramString1, paramString2 });
        return;
      } 
      paramPromise.resolve(Boolean.valueOf(true));
      return;
    } catch (Exception exception) {
      exception.printStackTrace();
      reject(paramPromise, paramString1, exception);
      return;
    } 
  }
  
  @ReactMethod
  public void pathForBundle(String paramString, Promise paramPromise) {}
  
  @ReactMethod
  public void pathForGroup(String paramString, Promise paramPromise) {}
  
  @ReactMethod
  public void read(String paramString, int paramInt1, int paramInt2, Promise paramPromise) {
    try {
      InputStream inputStream = getInputStream(paramString);
      byte[] arrayOfByte = new byte[paramInt1];
      inputStream.skip(paramInt2);
      paramPromise.resolve(Base64.encodeToString(arrayOfByte, 0, inputStream.read(arrayOfByte, 0, paramInt1), 2));
      return;
    } catch (Exception exception) {
      exception.printStackTrace();
      reject(paramPromise, paramString, exception);
      return;
    } 
  }
  
  @ReactMethod
  public void readDir(String paramString, Promise paramPromise) {
    try {
      File file = new File(paramString);
      if (file.exists()) {
        File[] arrayOfFile = file.listFiles();
        WritableArray writableArray = Arguments.createArray();
        int j = arrayOfFile.length;
        int i = 0;
        while (true) {
          if (i < j) {
            boolean bool;
            File file1 = arrayOfFile[i];
            WritableMap writableMap = Arguments.createMap();
            long l = file1.lastModified();
            double d = l;
            Double.isNaN(d);
            d /= 1000.0D;
            writableMap.putDouble("mtime", d);
            writableMap.putString("name", file1.getName());
            writableMap.putString("path", file1.getAbsolutePath());
            writableMap.putDouble("size", file1.length());
            if (file1.isDirectory()) {
              bool = true;
            } else {
              bool = false;
            } 
            writableMap.putInt("type", bool);
            writableArray.pushMap((ReadableMap)writableMap);
            i++;
            continue;
          } 
          paramPromise.resolve(writableArray);
          return;
        } 
      } 
      throw new Exception("Folder does not exist");
    } catch (Exception exception) {
      exception.printStackTrace();
      reject(paramPromise, paramString, exception);
      return;
    } 
  }
  
  @ReactMethod
  public void readDirAssets(String paramString, Promise paramPromise) {
    try {
      AssetManager assetManager = getReactApplicationContext().getAssets();
      String[] arrayOfString = assetManager.list(paramString);
      WritableArray writableArray = Arguments.createArray();
      int j = arrayOfString.length;
      int i = 0;
      while (true) {
        if (i < j) {
          int k;
          boolean bool1;
          String str = arrayOfString[i];
          WritableMap writableMap = Arguments.createMap();
          writableMap.putString("name", str);
          boolean bool = paramString.isEmpty();
          boolean bool2 = true;
          if (!bool)
            str = String.format("%s/%s", new Object[] { paramString, str }); 
          writableMap.putString("path", str);
          try {
            AssetFileDescriptor assetFileDescriptor = assetManager.openFd(str);
            if (assetFileDescriptor != null) {
              long l = assetFileDescriptor.getLength();
              bool1 = (int)l;
              try {
                assetFileDescriptor.close();
                k = 0;
              } catch (IOException iOException) {
                k = iOException.getMessage().contains("compressed") ^ true;
              } 
            } else {
              k = 1;
              bool1 = false;
            } 
          } catch (IOException iOException) {
            bool1 = false;
            k = iOException.getMessage().contains("compressed") ^ true;
          } 
          writableMap.putInt("size", bool1);
          if (k != 0) {
            k = bool2;
          } else {
            k = 0;
          } 
          writableMap.putInt("type", k);
          writableArray.pushMap((ReadableMap)writableMap);
          i++;
          continue;
        } 
        paramPromise.resolve(writableArray);
        return;
      } 
    } catch (IOException iOException) {
      reject(paramPromise, paramString, iOException);
      return;
    } 
  }
  
  @ReactMethod
  public void readFile(String paramString, Promise paramPromise) {
    try {
      paramPromise.resolve(Base64.encodeToString(getInputStreamBytes(getInputStream(paramString)), 2));
      return;
    } catch (Exception exception) {
      exception.printStackTrace();
      reject(paramPromise, paramString, exception);
      return;
    } 
  }
  
  @ReactMethod
  public void readFileAssets(String paramString, Promise paramPromise) {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aconst_null
    //   3: astore #4
    //   5: aload_0
    //   6: invokevirtual getReactApplicationContext : ()Lcom/facebook/react/bridge/ReactApplicationContext;
    //   9: invokevirtual getAssets : ()Landroid/content/res/AssetManager;
    //   12: aload_1
    //   13: iconst_0
    //   14: invokevirtual open : (Ljava/lang/String;I)Ljava/io/InputStream;
    //   17: astore #5
    //   19: aload #5
    //   21: ifnonnull -> 58
    //   24: aload #5
    //   26: astore #4
    //   28: aload #5
    //   30: astore_3
    //   31: aload_0
    //   32: aload_2
    //   33: aload_1
    //   34: new java/lang/Exception
    //   37: dup
    //   38: ldc_w 'Failed to open file'
    //   41: invokespecial <init> : (Ljava/lang/String;)V
    //   44: invokespecial reject : (Lcom/facebook/react/bridge/Promise;Ljava/lang/String;Ljava/lang/Exception;)V
    //   47: aload #5
    //   49: ifnull -> 57
    //   52: aload #5
    //   54: invokevirtual close : ()V
    //   57: return
    //   58: aload #5
    //   60: astore #4
    //   62: aload #5
    //   64: astore_3
    //   65: aload #5
    //   67: invokevirtual available : ()I
    //   70: newarray byte
    //   72: astore #6
    //   74: aload #5
    //   76: astore #4
    //   78: aload #5
    //   80: astore_3
    //   81: aload #5
    //   83: aload #6
    //   85: invokevirtual read : ([B)I
    //   88: pop
    //   89: aload #5
    //   91: astore #4
    //   93: aload #5
    //   95: astore_3
    //   96: aload_2
    //   97: aload #6
    //   99: iconst_2
    //   100: invokestatic encodeToString : ([BI)Ljava/lang/String;
    //   103: invokeinterface resolve : (Ljava/lang/Object;)V
    //   108: aload #5
    //   110: ifnull -> 153
    //   113: aload #5
    //   115: astore_3
    //   116: aload_3
    //   117: invokevirtual close : ()V
    //   120: return
    //   121: astore_1
    //   122: goto -> 154
    //   125: astore #5
    //   127: aload_3
    //   128: astore #4
    //   130: aload #5
    //   132: invokevirtual printStackTrace : ()V
    //   135: aload_3
    //   136: astore #4
    //   138: aload_0
    //   139: aload_2
    //   140: aload_1
    //   141: aload #5
    //   143: invokespecial reject : (Lcom/facebook/react/bridge/Promise;Ljava/lang/String;Ljava/lang/Exception;)V
    //   146: aload_3
    //   147: ifnull -> 153
    //   150: goto -> 116
    //   153: return
    //   154: aload #4
    //   156: ifnull -> 164
    //   159: aload #4
    //   161: invokevirtual close : ()V
    //   164: goto -> 169
    //   167: aload_1
    //   168: athrow
    //   169: goto -> 167
    //   172: astore_1
    //   173: return
    //   174: astore_1
    //   175: return
    //   176: astore_2
    //   177: goto -> 164
    // Exception table:
    //   from	to	target	type
    //   5	19	125	java/lang/Exception
    //   5	19	121	finally
    //   31	47	125	java/lang/Exception
    //   31	47	121	finally
    //   52	57	172	java/io/IOException
    //   65	74	125	java/lang/Exception
    //   65	74	121	finally
    //   81	89	125	java/lang/Exception
    //   81	89	121	finally
    //   96	108	125	java/lang/Exception
    //   96	108	121	finally
    //   116	120	174	java/io/IOException
    //   130	135	121	finally
    //   138	146	121	finally
    //   159	164	176	java/io/IOException
  }
  
  @ReactMethod
  public void readFileRes(String paramString, Promise paramPromise) {
    // Byte code:
    //   0: aconst_null
    //   1: astore #7
    //   3: aconst_null
    //   4: astore #6
    //   6: aload #6
    //   8: astore #5
    //   10: aload #7
    //   12: astore #4
    //   14: aload_0
    //   15: aload_1
    //   16: invokespecial getResIdentifier : (Ljava/lang/String;)I
    //   19: istore_3
    //   20: aload #6
    //   22: astore #5
    //   24: aload #7
    //   26: astore #4
    //   28: aload_0
    //   29: invokevirtual getReactApplicationContext : ()Lcom/facebook/react/bridge/ReactApplicationContext;
    //   32: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   35: iload_3
    //   36: invokevirtual openRawResource : (I)Ljava/io/InputStream;
    //   39: astore #6
    //   41: aload #6
    //   43: ifnonnull -> 81
    //   46: aload #6
    //   48: astore #5
    //   50: aload #6
    //   52: astore #4
    //   54: aload_0
    //   55: aload_2
    //   56: aload_1
    //   57: new java/lang/Exception
    //   60: dup
    //   61: ldc_w 'Failed to open file'
    //   64: invokespecial <init> : (Ljava/lang/String;)V
    //   67: invokespecial reject : (Lcom/facebook/react/bridge/Promise;Ljava/lang/String;Ljava/lang/Exception;)V
    //   70: aload #6
    //   72: ifnull -> 80
    //   75: aload #6
    //   77: invokevirtual close : ()V
    //   80: return
    //   81: aload #6
    //   83: astore #5
    //   85: aload #6
    //   87: astore #4
    //   89: aload #6
    //   91: invokevirtual available : ()I
    //   94: newarray byte
    //   96: astore #7
    //   98: aload #6
    //   100: astore #5
    //   102: aload #6
    //   104: astore #4
    //   106: aload #6
    //   108: aload #7
    //   110: invokevirtual read : ([B)I
    //   113: pop
    //   114: aload #6
    //   116: astore #5
    //   118: aload #6
    //   120: astore #4
    //   122: aload_2
    //   123: aload #7
    //   125: iconst_2
    //   126: invokestatic encodeToString : ([BI)Ljava/lang/String;
    //   129: invokeinterface resolve : (Ljava/lang/Object;)V
    //   134: aload #6
    //   136: ifnull -> 184
    //   139: aload #6
    //   141: astore #4
    //   143: aload #4
    //   145: invokevirtual close : ()V
    //   148: return
    //   149: astore_1
    //   150: goto -> 185
    //   153: astore #6
    //   155: aload #4
    //   157: astore #5
    //   159: aload #6
    //   161: invokevirtual printStackTrace : ()V
    //   164: aload #4
    //   166: astore #5
    //   168: aload_0
    //   169: aload_2
    //   170: aload_1
    //   171: aload #6
    //   173: invokespecial reject : (Lcom/facebook/react/bridge/Promise;Ljava/lang/String;Ljava/lang/Exception;)V
    //   176: aload #4
    //   178: ifnull -> 184
    //   181: goto -> 143
    //   184: return
    //   185: aload #5
    //   187: ifnull -> 195
    //   190: aload #5
    //   192: invokevirtual close : ()V
    //   195: goto -> 200
    //   198: aload_1
    //   199: athrow
    //   200: goto -> 198
    //   203: astore_1
    //   204: return
    //   205: astore_1
    //   206: return
    //   207: astore_2
    //   208: goto -> 195
    // Exception table:
    //   from	to	target	type
    //   14	20	153	java/lang/Exception
    //   14	20	149	finally
    //   28	41	153	java/lang/Exception
    //   28	41	149	finally
    //   54	70	153	java/lang/Exception
    //   54	70	149	finally
    //   75	80	203	java/io/IOException
    //   89	98	153	java/lang/Exception
    //   89	98	149	finally
    //   106	114	153	java/lang/Exception
    //   106	114	149	finally
    //   122	134	153	java/lang/Exception
    //   122	134	149	finally
    //   143	148	205	java/io/IOException
    //   159	164	149	finally
    //   168	176	149	finally
    //   190	195	207	java/io/IOException
  }
  
  @ReactMethod
  public void scanFile(String paramString, Promise paramPromise) {
    ReactApplicationContext reactApplicationContext = getReactApplicationContext();
    i i = new i(this, paramPromise);
    MediaScannerConnection.scanFile((Context)reactApplicationContext, new String[] { paramString }, null, (MediaScannerConnection.OnScanCompletedListener)i);
  }
  
  @ReactMethod
  public void setReadable(String paramString, Boolean paramBoolean1, Boolean paramBoolean2, Promise paramPromise) {
    try {
      File file = new File(paramString);
      if (file.exists()) {
        file.setReadable(paramBoolean1.booleanValue(), paramBoolean2.booleanValue());
        paramPromise.resolve(Boolean.valueOf(true));
        return;
      } 
      throw new Exception("File does not exist");
    } catch (Exception exception) {
      exception.printStackTrace();
      reject(paramPromise, paramString, exception);
      return;
    } 
  }
  
  @ReactMethod
  public void stat(String paramString, Promise paramPromise) {
    boolean bool = true;
    try {
      String str = getOriginalFilepath(paramString, true);
      File file = new File(str);
      if (file.exists()) {
        WritableMap writableMap = Arguments.createMap();
        writableMap.putInt("ctime", (int)(file.lastModified() / 1000L));
        writableMap.putInt("mtime", (int)(file.lastModified() / 1000L));
        writableMap.putDouble("size", file.length());
        if (!file.isDirectory())
          bool = false; 
        writableMap.putInt("type", bool);
        writableMap.putString("originalFilepath", str);
        paramPromise.resolve(writableMap);
        return;
      } 
      throw new Exception("File does not exist");
    } catch (Exception exception) {
      exception.printStackTrace();
      reject(paramPromise, paramString, exception);
      return;
    } 
  }
  
  @ReactMethod
  public void stopDownload(int paramInt) {
    c c = (c)this.downloaders.get(paramInt);
    if (c != null)
      c.a(); 
  }
  
  @ReactMethod
  public void stopUpload(int paramInt) {
    h h = (h)this.uploaders.get(paramInt);
    if (h != null)
      h.a(); 
  }
  
  @ReactMethod
  public void touch(String paramString, double paramDouble1, double paramDouble2, Promise paramPromise) {
    try {
      paramPromise.resolve(Boolean.valueOf((new File(paramString)).setLastModified((long)paramDouble1)));
      return;
    } catch (Exception exception) {
      exception.printStackTrace();
      reject(paramPromise, paramString, exception);
      return;
    } 
  }
  
  @ReactMethod
  public void unlink(String paramString, Promise paramPromise) {
    try {
      File file = new File(paramString);
      if (file.exists()) {
        DeleteRecursive(file);
        paramPromise.resolve(null);
        return;
      } 
      throw new Exception("File does not exist");
    } catch (Exception exception) {
      exception.printStackTrace();
      reject(paramPromise, paramString, exception);
      return;
    } 
  }
  
  @ReactMethod
  public void uploadFiles(ReadableMap paramReadableMap, Promise paramPromise) {
    try {
      ReadableArray readableArray = paramReadableMap.getArray("files");
      URL uRL = new URL(paramReadableMap.getString("toUrl"));
      int j = paramReadableMap.getInt("jobId");
      ReadableMap readableMap1 = paramReadableMap.getMap("headers");
      ReadableMap readableMap2 = paramReadableMap.getMap("fields");
      String str = paramReadableMap.getString("method");
      boolean bool1 = paramReadableMap.getBoolean("binaryStreamOnly");
      boolean bool2 = paramReadableMap.getBoolean("hasBeginCallback");
      boolean bool3 = paramReadableMap.getBoolean("hasProgressCallback");
      ArrayList<ReadableMap> arrayList = new ArrayList();
      f f = new f();
      int i = 0;
      try {
        while (i < readableArray.size()) {
          arrayList.add(readableArray.getMap(i));
          i++;
        } 
        f.a = uRL;
        f.b = arrayList;
        f.d = readableMap1;
        f.f = str;
        f.e = readableMap2;
        f.c = bool1;
        f.g = new f(this, j, paramPromise, paramReadableMap);
        if (bool2)
          f.i = new g(this, j); 
        if (bool3)
          f.h = new h(this, j); 
        h h = new h();
        h.execute((Object[])new f[] { f });
        this.uploaders.put(j, h);
        return;
      } catch (Exception null) {}
    } catch (Exception exception) {}
    exception.printStackTrace();
    reject(paramPromise, paramReadableMap.getString("toUrl"), exception);
  }
  
  @ReactMethod
  public void write(String paramString1, String paramString2, int paramInt, Promise paramPromise) {
    try {
      byte[] arrayOfByte = Base64.decode(paramString2, 0);
      if (paramInt < 0) {
        OutputStream outputStream = getOutputStream(paramString1, true);
        outputStream.write(arrayOfByte);
        outputStream.close();
      } else {
        RandomAccessFile randomAccessFile = new RandomAccessFile(paramString1, "rw");
        randomAccessFile.seek(paramInt);
        randomAccessFile.write(arrayOfByte);
        randomAccessFile.close();
      } 
      paramPromise.resolve(null);
      return;
    } catch (Exception exception) {
      exception.printStackTrace();
      reject(paramPromise, paramString1, exception);
      return;
    } 
  }
  
  @ReactMethod
  public void writeFile(String paramString1, String paramString2, ReadableMap paramReadableMap, Promise paramPromise) {
    try {
      byte[] arrayOfByte = Base64.decode(paramString2, 0);
      OutputStream outputStream = getOutputStream(paramString1, false);
      outputStream.write(arrayOfByte);
      outputStream.close();
      paramPromise.resolve(null);
      return;
    } catch (Exception exception) {
      exception.printStackTrace();
      reject(paramPromise, paramString1, exception);
      return;
    } 
  }
  
  class a extends j {
    a(RNFSManager this$0, File param1File, Promise param1Promise, String param1String) {
      super(this$0, null);
    }
    
    protected void a(Exception param1Exception) {
      if (param1Exception == null) {
        this.b.delete();
        this.c.resolve(Boolean.valueOf(true));
        return;
      } 
      param1Exception.printStackTrace();
      this.e.reject(this.c, this.d, param1Exception);
    }
  }
  
  class b extends j {
    b(RNFSManager this$0, Promise param1Promise, String param1String) {
      super(this$0, null);
    }
    
    protected void a(Exception param1Exception) {
      if (param1Exception == null) {
        this.b.resolve(null);
        return;
      } 
      param1Exception.printStackTrace();
      this.d.reject(this.b, this.c, param1Exception);
    }
  }
  
  class c implements a.c {
    c(RNFSManager this$0, int param1Int, Promise param1Promise, ReadableMap param1ReadableMap) {}
    
    public void a(b param1b) {
      if (param1b.c == null) {
        WritableMap writableMap = Arguments.createMap();
        writableMap.putInt("jobId", this.a);
        writableMap.putInt("statusCode", param1b.a);
        writableMap.putDouble("bytesWritten", param1b.b);
        this.b.resolve(writableMap);
        return;
      } 
      this.d.reject(this.b, this.c.getString("toFile"), param1b.c);
    }
  }
  
  class d implements a.a {
    d(RNFSManager this$0, int param1Int) {}
    
    public void a(int param1Int, long param1Long, Map<String, String> param1Map) {
      WritableMap writableMap2 = Arguments.createMap();
      for (Map.Entry<String, String> entry : param1Map.entrySet())
        writableMap2.putString((String)entry.getKey(), (String)entry.getValue()); 
      WritableMap writableMap1 = Arguments.createMap();
      writableMap1.putInt("jobId", this.a);
      writableMap1.putInt("statusCode", param1Int);
      writableMap1.putDouble("contentLength", param1Long);
      writableMap1.putMap("headers", (ReadableMap)writableMap2);
      RNFSManager rNFSManager = this.b;
      rNFSManager.sendEvent((ReactContext)rNFSManager.getReactApplicationContext(), "DownloadBegin", writableMap1);
    }
  }
  
  class e implements a.b {
    e(RNFSManager this$0, int param1Int) {}
    
    public void a(long param1Long1, long param1Long2) {
      WritableMap writableMap = Arguments.createMap();
      writableMap.putInt("jobId", this.a);
      writableMap.putDouble("contentLength", param1Long1);
      writableMap.putDouble("bytesWritten", param1Long2);
      RNFSManager rNFSManager = this.b;
      rNFSManager.sendEvent((ReactContext)rNFSManager.getReactApplicationContext(), "DownloadProgress", writableMap);
    }
  }
  
  class f implements f.b {
    f(RNFSManager this$0, int param1Int, Promise param1Promise, ReadableMap param1ReadableMap) {}
    
    public void a(g param1g) {
      if (param1g.c == null) {
        WritableMap writableMap = Arguments.createMap();
        writableMap.putInt("jobId", this.a);
        writableMap.putInt("statusCode", param1g.a);
        writableMap.putMap("headers", (ReadableMap)param1g.b);
        writableMap.putString("body", param1g.d);
        this.b.resolve(writableMap);
        return;
      } 
      this.d.reject(this.b, this.c.getString("toUrl"), param1g.c);
    }
  }
  
  class g implements f.a {
    g(RNFSManager this$0, int param1Int) {}
    
    public void a() {
      WritableMap writableMap = Arguments.createMap();
      writableMap.putInt("jobId", this.a);
      RNFSManager rNFSManager = this.b;
      rNFSManager.sendEvent((ReactContext)rNFSManager.getReactApplicationContext(), "UploadBegin", writableMap);
    }
  }
  
  class h implements f.c {
    h(RNFSManager this$0, int param1Int) {}
    
    public void a(int param1Int1, int param1Int2) {
      WritableMap writableMap = Arguments.createMap();
      writableMap.putInt("jobId", this.a);
      writableMap.putInt("totalBytesExpectedToSend", param1Int1);
      writableMap.putInt("totalBytesSent", param1Int2);
      RNFSManager rNFSManager = this.b;
      rNFSManager.sendEvent((ReactContext)rNFSManager.getReactApplicationContext(), "UploadProgress", writableMap);
    }
  }
  
  class i implements MediaScannerConnection.MediaScannerConnectionClient {
    i(RNFSManager this$0, Promise param1Promise) {}
    
    public void onMediaScannerConnected() {}
    
    public void onScanCompleted(String param1String, Uri param1Uri) {
      this.a.resolve(param1String);
    }
  }
  
  private class j extends AsyncTask<String, Void, Exception> {
    private j(RNFSManager this$0) {}
    
    protected Exception a(String... param1VarArgs) {
      String str1 = param1VarArgs[0];
      String str2 = param1VarArgs[1];
      try {
        InputStream inputStream = this.a.getInputStream(str1);
        OutputStream outputStream = this.a.getOutputStream(str2, false);
        byte[] arrayOfByte = new byte[1024];
        while (true) {
          int i = inputStream.read(arrayOfByte);
          if (i > 0) {
            outputStream.write(arrayOfByte, 0, i);
            Thread.yield();
            continue;
          } 
          inputStream.close();
          outputStream.close();
          return null;
        } 
      } catch (Exception null) {
        return null;
      } 
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/rnfs/RNFSManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */