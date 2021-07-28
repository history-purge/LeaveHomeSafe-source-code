package com.facebook.react.modules.camera;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.facebook.fbreact.specs.NativeCameraRollManagerSpec;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import e.e.o.d0.a.a;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.util.ArrayList;

@a(name = "CameraRollManager")
public class CameraRollManager extends NativeCameraRollManagerSpec {
  private static final String ASSET_TYPE_ALL = "All";
  
  private static final String ASSET_TYPE_PHOTOS = "Photos";
  
  private static final String ASSET_TYPE_VIDEOS = "Videos";
  
  private static final String ERROR_UNABLE_TO_FILTER = "E_UNABLE_TO_FILTER";
  
  private static final String ERROR_UNABLE_TO_LOAD = "E_UNABLE_TO_LOAD";
  
  private static final String ERROR_UNABLE_TO_LOAD_PERMISSION = "E_UNABLE_TO_LOAD_PERMISSION";
  
  private static final String ERROR_UNABLE_TO_SAVE = "E_UNABLE_TO_SAVE";
  
  public static final String NAME = "CameraRollManager";
  
  private static final String[] PROJECTION = new String[] { "_id", "mime_type", "bucket_display_name", "datetaken", "width", "height", "longitude", "latitude", "_data" };
  
  private static final String SELECTION_BUCKET = "bucket_display_name = ?";
  
  private static final String SELECTION_DATE_TAKEN = "datetaken < ?";
  
  private static final String SELECTION_MEDIA_SIZE = "_size < ?";
  
  public CameraRollManager(ReactApplicationContext paramReactApplicationContext) {
    super(paramReactApplicationContext);
  }
  
  private static void putBasicNodeInfo(Cursor paramCursor, WritableMap paramWritableMap, int paramInt1, int paramInt2, int paramInt3) {
    paramWritableMap.putString("type", paramCursor.getString(paramInt1));
    paramWritableMap.putString("group_name", paramCursor.getString(paramInt2));
    double d = paramCursor.getLong(paramInt3);
    Double.isNaN(d);
    paramWritableMap.putDouble("timestamp", d / 1000.0D);
  }
  
  private static void putEdges(ContentResolver paramContentResolver, Cursor paramCursor, WritableMap paramWritableMap, int paramInt) {
    WritableNativeArray writableNativeArray = new WritableNativeArray();
    paramCursor.moveToFirst();
    int k = paramCursor.getColumnIndex("_id");
    int i1 = paramCursor.getColumnIndex("mime_type");
    int i2 = paramCursor.getColumnIndex("bucket_display_name");
    int i3 = paramCursor.getColumnIndex("datetaken");
    int j = paramCursor.getColumnIndex("width");
    int i4 = paramCursor.getColumnIndex("height");
    int m = paramCursor.getColumnIndex("longitude");
    int n = paramCursor.getColumnIndex("latitude");
    int i5 = paramCursor.getColumnIndex("_data");
    int i;
    for (i = 0; i < paramInt && !paramCursor.isAfterLast(); i++) {
      WritableNativeMap writableNativeMap1 = new WritableNativeMap();
      WritableNativeMap writableNativeMap2 = new WritableNativeMap();
      if (putImageInfo(paramContentResolver, paramCursor, (WritableMap)writableNativeMap2, k, j, i4, i5, i1)) {
        putBasicNodeInfo(paramCursor, (WritableMap)writableNativeMap2, i1, i2, i3);
        putLocationInfo(paramCursor, (WritableMap)writableNativeMap2, m, n);
        writableNativeMap1.putMap("node", (ReadableMap)writableNativeMap2);
        writableNativeArray.pushMap((ReadableMap)writableNativeMap1);
      } else {
        i--;
      } 
      paramCursor.moveToNext();
    } 
    paramWritableMap.putArray("edges", (ReadableArray)writableNativeArray);
  }
  
  private static boolean putImageInfo(ContentResolver paramContentResolver, Cursor paramCursor, WritableMap paramWritableMap, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    // Byte code:
    //   0: new com/facebook/react/bridge/WritableNativeMap
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore #13
    //   9: new java/lang/StringBuilder
    //   12: dup
    //   13: invokespecial <init> : ()V
    //   16: astore #12
    //   18: aload #12
    //   20: ldc 'file://'
    //   22: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   25: pop
    //   26: aload #12
    //   28: aload_1
    //   29: iload #6
    //   31: invokeinterface getString : (I)Ljava/lang/String;
    //   36: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   39: pop
    //   40: aload #12
    //   42: invokevirtual toString : ()Ljava/lang/String;
    //   45: invokestatic parse : (Ljava/lang/String;)Landroid/net/Uri;
    //   48: astore #12
    //   50: aload #13
    //   52: ldc 'uri'
    //   54: aload #12
    //   56: invokevirtual toString : ()Ljava/lang/String;
    //   59: invokeinterface putString : (Ljava/lang/String;Ljava/lang/String;)V
    //   64: aload_1
    //   65: iload #4
    //   67: invokeinterface getInt : (I)I
    //   72: i2f
    //   73: fstore #11
    //   75: aload_1
    //   76: iload #5
    //   78: invokeinterface getInt : (I)I
    //   83: i2f
    //   84: fstore #10
    //   86: aload_1
    //   87: iload #7
    //   89: invokeinterface getString : (I)Ljava/lang/String;
    //   94: astore_1
    //   95: fload #11
    //   97: fstore #9
    //   99: fload #10
    //   101: fstore #8
    //   103: aload_1
    //   104: ifnull -> 340
    //   107: fload #11
    //   109: fstore #9
    //   111: fload #10
    //   113: fstore #8
    //   115: aload_1
    //   116: ldc 'video'
    //   118: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   121: ifeq -> 340
    //   124: aload_0
    //   125: aload #12
    //   127: ldc 'r'
    //   129: invokevirtual openAssetFileDescriptor : (Landroid/net/Uri;Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;
    //   132: astore_1
    //   133: new android/media/MediaMetadataRetriever
    //   136: dup
    //   137: invokespecial <init> : ()V
    //   140: astore #14
    //   142: aload #14
    //   144: aload_1
    //   145: invokevirtual getFileDescriptor : ()Ljava/io/FileDescriptor;
    //   148: invokevirtual setDataSource : (Ljava/io/FileDescriptor;)V
    //   151: fload #11
    //   153: fconst_0
    //   154: fcmpg
    //   155: ifle -> 173
    //   158: fload #11
    //   160: fstore #9
    //   162: fload #10
    //   164: fstore #8
    //   166: fload #10
    //   168: fconst_0
    //   169: fcmpg
    //   170: ifgt -> 199
    //   173: aload #14
    //   175: bipush #18
    //   177: invokevirtual extractMetadata : (I)Ljava/lang/String;
    //   180: invokestatic parseInt : (Ljava/lang/String;)I
    //   183: i2f
    //   184: fstore #9
    //   186: aload #14
    //   188: bipush #19
    //   190: invokevirtual extractMetadata : (I)Ljava/lang/String;
    //   193: invokestatic parseInt : (Ljava/lang/String;)I
    //   196: i2f
    //   197: fstore #8
    //   199: aload #13
    //   201: ldc 'playableDuration'
    //   203: aload #14
    //   205: bipush #9
    //   207: invokevirtual extractMetadata : (I)Ljava/lang/String;
    //   210: invokestatic parseInt : (Ljava/lang/String;)I
    //   213: sipush #1000
    //   216: idiv
    //   217: invokeinterface putInt : (Ljava/lang/String;I)V
    //   222: aload #14
    //   224: invokevirtual release : ()V
    //   227: aload_1
    //   228: invokevirtual close : ()V
    //   231: goto -> 340
    //   234: astore_0
    //   235: goto -> 287
    //   238: astore_0
    //   239: new java/lang/StringBuilder
    //   242: dup
    //   243: invokespecial <init> : ()V
    //   246: astore_2
    //   247: aload_2
    //   248: ldc_w 'Number format exception occurred while trying to fetch video metadata for '
    //   251: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   254: pop
    //   255: aload_2
    //   256: aload #12
    //   258: invokevirtual toString : ()Ljava/lang/String;
    //   261: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   264: pop
    //   265: ldc_w 'ReactNative'
    //   268: aload_2
    //   269: invokevirtual toString : ()Ljava/lang/String;
    //   272: aload_0
    //   273: invokestatic b : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   276: aload #14
    //   278: invokevirtual release : ()V
    //   281: aload_1
    //   282: invokevirtual close : ()V
    //   285: iconst_0
    //   286: ireturn
    //   287: aload #14
    //   289: invokevirtual release : ()V
    //   292: aload_1
    //   293: invokevirtual close : ()V
    //   296: aload_0
    //   297: athrow
    //   298: astore_0
    //   299: new java/lang/StringBuilder
    //   302: dup
    //   303: invokespecial <init> : ()V
    //   306: astore_1
    //   307: ldc_w 'Could not get video metadata for '
    //   310: astore_2
    //   311: aload_1
    //   312: aload_2
    //   313: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   316: pop
    //   317: aload_1
    //   318: aload #12
    //   320: invokevirtual toString : ()Ljava/lang/String;
    //   323: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   326: pop
    //   327: ldc_w 'ReactNative'
    //   330: aload_1
    //   331: invokevirtual toString : ()Ljava/lang/String;
    //   334: aload_0
    //   335: invokestatic b : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   338: iconst_0
    //   339: ireturn
    //   340: fload #9
    //   342: fconst_0
    //   343: fcmpg
    //   344: ifle -> 362
    //   347: fload #9
    //   349: fstore #10
    //   351: fload #8
    //   353: fstore #9
    //   355: fload #8
    //   357: fconst_0
    //   358: fcmpg
    //   359: ifgt -> 416
    //   362: aload_0
    //   363: aload #12
    //   365: ldc 'r'
    //   367: invokevirtual openAssetFileDescriptor : (Landroid/net/Uri;Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;
    //   370: astore_0
    //   371: new android/graphics/BitmapFactory$Options
    //   374: dup
    //   375: invokespecial <init> : ()V
    //   378: astore_1
    //   379: aload_1
    //   380: iconst_1
    //   381: putfield inJustDecodeBounds : Z
    //   384: aload_0
    //   385: invokevirtual getFileDescriptor : ()Ljava/io/FileDescriptor;
    //   388: aconst_null
    //   389: aload_1
    //   390: invokestatic decodeFileDescriptor : (Ljava/io/FileDescriptor;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   393: pop
    //   394: aload_1
    //   395: getfield outWidth : I
    //   398: i2f
    //   399: fstore #8
    //   401: aload_1
    //   402: getfield outHeight : I
    //   405: i2f
    //   406: fstore #9
    //   408: aload_0
    //   409: invokevirtual close : ()V
    //   412: fload #8
    //   414: fstore #10
    //   416: aload #13
    //   418: ldc 'width'
    //   420: fload #10
    //   422: f2d
    //   423: invokeinterface putDouble : (Ljava/lang/String;D)V
    //   428: aload #13
    //   430: ldc 'height'
    //   432: fload #9
    //   434: f2d
    //   435: invokeinterface putDouble : (Ljava/lang/String;D)V
    //   440: aload_2
    //   441: ldc_w 'image'
    //   444: aload #13
    //   446: invokeinterface putMap : (Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V
    //   451: iconst_1
    //   452: ireturn
    //   453: astore_0
    //   454: new java/lang/StringBuilder
    //   457: dup
    //   458: invokespecial <init> : ()V
    //   461: astore_1
    //   462: ldc_w 'Could not get width/height for '
    //   465: astore_2
    //   466: goto -> 311
    // Exception table:
    //   from	to	target	type
    //   124	151	298	java/lang/Exception
    //   173	199	238	java/lang/NumberFormatException
    //   173	199	234	finally
    //   199	222	238	java/lang/NumberFormatException
    //   199	222	234	finally
    //   222	231	298	java/lang/Exception
    //   239	276	234	finally
    //   276	285	298	java/lang/Exception
    //   287	298	298	java/lang/Exception
    //   362	412	453	java/io/IOException
  }
  
  private static void putLocationInfo(Cursor paramCursor, WritableMap paramWritableMap, int paramInt1, int paramInt2) {
    double d1 = paramCursor.getDouble(paramInt1);
    double d2 = paramCursor.getDouble(paramInt2);
    if (d1 > 0.0D || d2 > 0.0D) {
      WritableNativeMap writableNativeMap = new WritableNativeMap();
      writableNativeMap.putDouble("longitude", d1);
      writableNativeMap.putDouble("latitude", d2);
      paramWritableMap.putMap("location", (ReadableMap)writableNativeMap);
    } 
  }
  
  private static void putPageInfo(Cursor paramCursor, WritableMap paramWritableMap, int paramInt) {
    boolean bool;
    WritableNativeMap writableNativeMap = new WritableNativeMap();
    if (paramInt < paramCursor.getCount()) {
      bool = true;
    } else {
      bool = false;
    } 
    writableNativeMap.putBoolean("has_next_page", bool);
    if (paramInt < paramCursor.getCount()) {
      paramCursor.moveToPosition(paramInt - 1);
      writableNativeMap.putString("end_cursor", paramCursor.getString(paramCursor.getColumnIndex("datetaken")));
    } 
    paramWritableMap.putMap("page_info", (ReadableMap)writableNativeMap);
  }
  
  public void deletePhotos(ReadableArray paramReadableArray, Promise paramPromise) {}
  
  public String getName() {
    return "CameraRollManager";
  }
  
  public void getPhotos(ReadableMap paramReadableMap, Promise paramPromise) {
    String str1;
    String str2;
    String str3;
    Integer integer;
    ReadableArray readableArray;
    int i = paramReadableMap.getInt("first");
    if (paramReadableMap.hasKey("after")) {
      str1 = paramReadableMap.getString("after");
    } else {
      str1 = null;
    } 
    if (paramReadableMap.hasKey("groupName")) {
      str2 = paramReadableMap.getString("groupName");
    } else {
      str2 = null;
    } 
    if (paramReadableMap.hasKey("assetType")) {
      str3 = paramReadableMap.getString("assetType");
    } else {
      str3 = "Photos";
    } 
    if (paramReadableMap.hasKey("maxSize")) {
      integer = Integer.valueOf(paramReadableMap.getInt("maxSize"));
    } else {
      integer = null;
    } 
    if (paramReadableMap.hasKey("mimeTypes")) {
      readableArray = paramReadableMap.getArray("mimeTypes");
    } else {
      readableArray = null;
    } 
    if (!paramReadableMap.hasKey("groupTypes")) {
      (new b((ReactContext)getReactApplicationContext(), i, str1, str2, readableArray, str3, integer, paramPromise, null)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new Void[0]);
      return;
    } 
    throw new JSApplicationIllegalArgumentException("groupTypes is not supported on Android");
  }
  
  public void saveToCameraRoll(String paramString1, String paramString2, Promise paramPromise) {
    (new c((ReactContext)getReactApplicationContext(), Uri.parse(paramString1), paramPromise)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new Void[0]);
  }
  
  private static class b extends GuardedAsyncTask<Void, Void> {
    private final Context a;
    
    private final int b;
    
    private final String c;
    
    private final String d;
    
    private final ReadableArray e;
    
    private final Promise f;
    
    private final String g;
    
    private final Integer h;
    
    private b(ReactContext param1ReactContext, int param1Int, String param1String1, String param1String2, ReadableArray param1ReadableArray, String param1String3, Integer param1Integer, Promise param1Promise) {
      super(param1ReactContext);
      this.a = (Context)param1ReactContext;
      this.b = param1Int;
      this.c = param1String1;
      this.d = param1String2;
      this.e = param1ReadableArray;
      this.f = param1Promise;
      this.g = param1String3;
      this.h = param1Integer;
    }
    
    protected void a(Void... param1VarArgs) {
      StringBuilder stringBuilder1;
      StringBuilder stringBuilder2 = new StringBuilder("1");
      ArrayList<String> arrayList = new ArrayList();
      if (!TextUtils.isEmpty(this.c)) {
        stringBuilder2.append(" AND datetaken < ?");
        arrayList.add(this.c);
      } 
      if (!TextUtils.isEmpty(this.d)) {
        stringBuilder2.append(" AND bucket_display_name = ?");
        arrayList.add(this.d);
      } 
      if (this.h != null) {
        stringBuilder2.append(" AND _size < ?");
        arrayList.add(this.h.toString());
      } 
      String str = this.g;
      int i = -1;
      int j = str.hashCode();
      byte b1 = 0;
      if (j != -1905167199) {
        if (j != -1732810888) {
          if (j == 65921 && str.equals("All"))
            i = 2; 
        } else if (str.equals("Videos")) {
          i = 1;
        } 
      } else if (str.equals("Photos")) {
        i = 0;
      } 
      if (i != 0) {
        if (i != 1) {
          if (i != 2) {
            Promise promise = this.f;
            stringBuilder1 = new StringBuilder();
            stringBuilder1.append("Invalid filter option: '");
            stringBuilder1.append(this.g);
            stringBuilder1.append("'. Expected one of '");
            stringBuilder1.append("Photos");
            stringBuilder1.append("', '");
            stringBuilder1.append("Videos");
            stringBuilder1.append("' or '");
            stringBuilder1.append("All");
            stringBuilder1.append("'.");
            promise.reject("E_UNABLE_TO_FILTER", stringBuilder1.toString());
            return;
          } 
          str = " AND media_type IN (3,1)";
        } else {
          str = " AND media_type = 3";
        } 
      } else {
        str = " AND media_type = 1";
      } 
      stringBuilder2.append(str);
      ReadableArray readableArray = this.e;
      if (readableArray != null && readableArray.size() > 0) {
        stringBuilder2.append(" AND mime_type IN (");
        for (i = b1; i < this.e.size(); i++) {
          stringBuilder2.append("?,");
          stringBuilder1.add(this.e.getString(i));
        } 
        stringBuilder2.replace(stringBuilder2.length() - 1, stringBuilder2.length(), ")");
      } 
      WritableNativeMap writableNativeMap = new WritableNativeMap();
      ContentResolver contentResolver = this.a.getContentResolver();
      try {
        Uri uri = MediaStore.Files.getContentUri("external");
        String[] arrayOfString2 = CameraRollManager.PROJECTION;
        null = stringBuilder2.toString();
        String[] arrayOfString1 = (String[])stringBuilder1.toArray((Object[])new String[stringBuilder1.size()]);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("datetaken DESC, date_modified DESC LIMIT ");
        stringBuilder.append(this.b + 1);
        Cursor cursor = contentResolver.query(uri, arrayOfString2, null, arrayOfString1, stringBuilder.toString());
        if (cursor == null) {
          this.f.reject("E_UNABLE_TO_LOAD", "Could not get media");
          return;
        } 
        try {
          CameraRollManager.putEdges(contentResolver, cursor, (WritableMap)writableNativeMap, this.b);
          CameraRollManager.putPageInfo(cursor, (WritableMap)writableNativeMap, this.b);
          return;
        } finally {
          cursor.close();
          this.f.resolve(writableNativeMap);
        } 
      } catch (SecurityException securityException) {
        this.f.reject("E_UNABLE_TO_LOAD_PERMISSION", "Could not get media: need READ_EXTERNAL_STORAGE permission", securityException);
        return;
      } 
    }
  }
  
  private static class c extends GuardedAsyncTask<Void, Void> {
    private final Context a;
    
    private final Uri b;
    
    private final Promise c;
    
    public c(ReactContext param1ReactContext, Uri param1Uri, Promise param1Promise) {
      super(param1ReactContext);
      this.a = (Context)param1ReactContext;
      this.b = param1Uri;
      this.c = param1Promise;
    }
    
    protected void a(Void... param1VarArgs) {
      a a1;
      File file1 = new File(this.b.getPath());
      a a2 = null;
      File file2 = null;
      try {
        ReadableByteChannel readableByteChannel1;
        a a3;
        String str = this.b.getScheme();
        if (str.equals("http") || str.equals("https")) {
          readableByteChannel1 = Channels.newChannel((new URL(this.b.toString())).openStream());
        } else {
          readableByteChannel1 = (new FileInputStream(file1)).getChannel();
        } 
        try {
          int i;
          String str1;
          File file3;
          String str2;
          File file4 = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM);
          file4.mkdirs();
          if (!file4.isDirectory())
            return; 
          file2 = new File(file4, file1.getName());
          String str3 = file1.getName();
          if (str3.indexOf('.') >= 0) {
            str1 = str3.substring(0, str3.lastIndexOf('.'));
            str2 = str3.substring(str3.lastIndexOf('.'));
            i = 0;
          } else {
            str2 = "";
            i = 0;
            str1 = str3;
          } 
          while (!file2.createNewFile()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str1);
            stringBuilder.append("_");
            stringBuilder.append(i);
            stringBuilder.append(str2);
            file3 = new File(file4, stringBuilder.toString());
            i++;
          } 
          FileChannel fileChannel = (new FileOutputStream(file3)).getChannel();
        } catch (IOException iOException1) {
        
        } finally {
          file1 = null;
        } 
        a a4 = a3;
      } catch (IOException iOException) {
      
      } finally {
        file1 = null;
        param1VarArgs = null;
      } 
      try {
        return;
      } finally {
        IOException iOException1;
        iOException = null;
        Void[] arrayOfVoid1 = param1VarArgs;
        a a = a1;
        Void[] arrayOfVoid2 = arrayOfVoid1;
      } 
    }
    
    class a implements MediaScannerConnection.OnScanCompletedListener {
      a(CameraRollManager.c this$0) {}
      
      public void onScanCompleted(String param2String, Uri param2Uri) {
        Promise promise = CameraRollManager.c.a(this.a);
        if (param2Uri != null) {
          promise.resolve(param2Uri.toString());
          return;
        } 
        promise.reject("E_UNABLE_TO_SAVE", "Could not add image to gallery");
      }
    }
  }
  
  class a implements MediaScannerConnection.OnScanCompletedListener {
    a(CameraRollManager this$0) {}
    
    public void onScanCompleted(String param1String, Uri param1Uri) {
      Promise promise = CameraRollManager.c.a(this.a);
      if (param1Uri != null) {
        promise.resolve(param1Uri.toString());
        return;
      } 
      promise.reject("E_UNABLE_TO_SAVE", "Could not add image to gallery");
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/modules/camera/CameraRollManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */