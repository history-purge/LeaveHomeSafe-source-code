package io.liteglue;

import android.content.Context;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import e.e.e.e.a;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

public class SQLitePlugin extends ReactContextBaseJavaModule {
  public static final String TAG = "SQLitePlugin";
  
  static SQLiteConnector connector;
  
  static ConcurrentHashMap<String, DBRunner> dbrmap = new ConcurrentHashMap<String, DBRunner>();
  
  private Context context;
  
  protected ExecutorService threadPool;
  
  static {
    connector = new SQLiteConnector();
  }
  
  public SQLitePlugin(ReactApplicationContext paramReactApplicationContext) {
    super(paramReactApplicationContext);
    this.context = paramReactApplicationContext.getApplicationContext();
    this.threadPool = Executors.newCachedThreadPool();
  }
  
  private void attachDatabase(String paramString1, String paramString2, String paramString3, CallbackContext paramCallbackContext) {
    String str;
    DBRunner dBRunner = dbrmap.get(paramString1);
    if (dBRunner != null) {
      paramString2 = getContext().getDatabasePath(paramString2).getAbsolutePath();
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("ATTACH DATABASE '");
      stringBuilder.append(paramString2);
      stringBuilder.append("' AS ");
      stringBuilder.append(paramString3);
      DBQuery dBQuery = new DBQuery(new String[] { stringBuilder.toString() }, new String[] { "1111" }, null, paramCallbackContext);
      try {
        dBRunner.q.put(dBQuery);
        return;
      } catch (InterruptedException interruptedException) {
        str = "Can't put querry into the queue";
      } 
    } else {
      str = "Can't attach to database - it's not open yet";
    } 
    paramCallbackContext.error(str);
  }
  
  private void closeDatabase(String paramString, CallbackContext paramCallbackContext) {
    DBRunner dBRunner = dbrmap.get(paramString);
    if (dBRunner != null)
      try {
        dBRunner.q.put(new DBQuery(false, paramCallbackContext));
        return;
      } catch (Exception exception) {
        if (paramCallbackContext != null) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("couldn't close database");
          stringBuilder.append(exception);
          paramCallbackContext.error(stringBuilder.toString());
        } 
        a.b(TAG, "couldn't close database", exception);
        return;
      }  
    if (paramCallbackContext != null)
      paramCallbackContext.success("couldn't close database"); 
  }
  
  private void closeDatabaseNow(String paramString) {
    DBRunner dBRunner = dbrmap.get(paramString);
    if (dBRunner != null) {
      SQLiteAndroidDatabase sQLiteAndroidDatabase = dBRunner.mydb;
      if (sQLiteAndroidDatabase != null)
        sQLiteAndroidDatabase.closeDatabaseNow(); 
    } 
  }
  
  private void closeQuietly(Closeable paramCloseable) {
    if (paramCloseable != null)
      try {
        paramCloseable.close();
        return;
      } catch (IOException iOException) {
        return;
      }  
  }
  
  private void createFromAssets(String paramString, File paramFile, InputStream paramInputStream) {
    StringBuilder stringBuilder1;
    StringBuilder stringBuilder2;
    byte[] arrayOfByte = null;
    try {
      String str = paramFile.getAbsolutePath();
      str = str.substring(0, str.lastIndexOf("/") + 1);
      File file2 = new File(str);
      if (!file2.exists())
        file2.mkdirs(); 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(str);
      stringBuilder.append(paramString);
      File file1 = new File(stringBuilder.toString());
      FileOutputStream fileOutputStream = new FileOutputStream(file1);
    } finally {
      paramFile = null;
    } 
    closeQuietly((Closeable)stringBuilder1);
    throw paramFile;
  }
  
  private void deleteDatabase(String paramString, CallbackContext paramCallbackContext) {
    DBRunner dBRunner = dbrmap.get(paramString);
    if (dBRunner != null)
      try {
        dBRunner.q.put(new DBQuery(true, paramCallbackContext));
        return;
      } catch (Exception exception) {
        if (paramCallbackContext != null) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("couldn't close database");
          stringBuilder.append(exception);
          paramCallbackContext.error(stringBuilder.toString());
        } 
        a.b(TAG, "couldn't close database", exception);
        return;
      }  
    if (deleteDatabaseNow((String)exception)) {
      paramCallbackContext.success("database deleted");
      return;
    } 
    paramCallbackContext.error("couldn't delete database");
  }
  
  private boolean deleteDatabaseNow(String paramString) {
    File file = getContext().getDatabasePath(paramString);
    try {
      return getContext().deleteDatabase(file.getAbsolutePath());
    } catch (Exception exception) {
      a.b(TAG, "couldn't delete database", exception);
      return false;
    } 
  }
  
  private boolean executeAndPossiblyThrow(Action paramAction, ReadableMap paramReadableMap, CallbackContext paramCallbackContext) {
    DBQuery dBQuery;
    String str1;
    String[] arrayOfString1;
    DBRunner dBRunner;
    int i;
    ReadableArray readableArray;
    String[] arrayOfString2;
    String str2;
    ReadableArray[] arrayOfReadableArray;
    String str3;
    switch (paramAction) {
      default:
        return true;
      case executeSqlBatch:
      case null:
        str3 = SQLitePluginConverter.getString((ReadableMap)SQLitePluginConverter.get(paramReadableMap, "dbargs", (Object)null), "dbname", "");
        readableArray = (ReadableArray)SQLitePluginConverter.get(paramReadableMap, "executes", (Object)null);
        i = 0;
        if (readableArray.isNull(0)) {
          arrayOfString1 = new String[0];
          readableArray = null;
          ReadableArray readableArray1 = readableArray;
          ReadableArray readableArray2 = readableArray1;
        } else {
          int j = readableArray.size();
          String[] arrayOfString = new String[j];
          arrayOfString1 = new String[j];
          arrayOfReadableArray = new ReadableArray[j];
          while (i < j) {
            ReadableMap readableMap = (ReadableMap)SQLitePluginConverter.get(readableArray, i, (Object)null);
            arrayOfString[i] = SQLitePluginConverter.getString(readableMap, "sql", "");
            arrayOfString1[i] = SQLitePluginConverter.getString(readableMap, "qid", "");
            arrayOfReadableArray[i] = (ReadableArray)SQLitePluginConverter.get(readableMap, "params", (Object)null);
            i++;
          } 
          arrayOfString2 = arrayOfString1;
          arrayOfString1 = arrayOfString;
        } 
        dBQuery = new DBQuery(arrayOfString1, arrayOfString2, arrayOfReadableArray, paramCallbackContext);
        dBRunner = dbrmap.get(str3);
        if (dBRunner != null) {
          try {
            dBRunner.q.put(dBQuery);
          } catch (Exception exception) {
            a.b(TAG, "couldn't add to queue", exception);
            paramCallbackContext.error("couldn't add to queue");
          } 
        } else {
          paramCallbackContext.error("database not open");
        } 
      case delete:
        deleteDatabase(SQLitePluginConverter.getString((ReadableMap)dBRunner, "path", ""), paramCallbackContext);
      case attach:
        str1 = SQLitePluginConverter.getString((ReadableMap)dBRunner, "path", "");
        str2 = SQLitePluginConverter.getString((ReadableMap)dBRunner, "dbAlias", "");
        attachDatabase(str1, SQLitePluginConverter.getString((ReadableMap)dBRunner, "dbName", ""), str2, paramCallbackContext);
      case close:
        closeDatabase(SQLitePluginConverter.getString((ReadableMap)dBRunner, "path", ""), paramCallbackContext);
      case open:
        startDatabase(SQLitePluginConverter.getString((ReadableMap)dBRunner, "name", ""), (ReadableMap)dBRunner, paramCallbackContext);
      case echoStringValue:
        break;
    } 
    paramCallbackContext.success(SQLitePluginConverter.getString((ReadableMap)dBRunner, "value", ""));
  }
  
  private SQLiteAndroidDatabase openDatabase(String paramString1, String paramString2, int paramInt, CallbackContext paramCallbackContext, boolean paramBoolean) {
    // Byte code:
    //   0: aload_2
    //   1: astore #10
    //   3: aconst_null
    //   4: astore #15
    //   6: aconst_null
    //   7: astore #13
    //   9: aconst_null
    //   10: astore #14
    //   12: aconst_null
    //   13: astore #12
    //   15: iconst_0
    //   16: istore #8
    //   18: aload #10
    //   20: ifnull -> 1047
    //   23: aload #14
    //   25: astore #9
    //   27: aload_2
    //   28: invokevirtual length : ()I
    //   31: ifle -> 1047
    //   34: iconst_1
    //   35: istore #6
    //   37: goto -> 40
    //   40: iload #6
    //   42: ifeq -> 767
    //   45: aload #14
    //   47: astore #9
    //   49: aload #10
    //   51: ldc_w '1'
    //   54: invokevirtual compareTo : (Ljava/lang/String;)I
    //   57: istore #7
    //   59: iload #7
    //   61: ifne -> 281
    //   64: aload #14
    //   66: astore #9
    //   68: new java/lang/StringBuilder
    //   71: dup
    //   72: invokespecial <init> : ()V
    //   75: astore_2
    //   76: aload #14
    //   78: astore #9
    //   80: aload_2
    //   81: ldc_w 'www/'
    //   84: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   87: pop
    //   88: aload #14
    //   90: astore #9
    //   92: aload_2
    //   93: aload_1
    //   94: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   97: pop
    //   98: aload #14
    //   100: astore #9
    //   102: aload_2
    //   103: invokevirtual toString : ()Ljava/lang/String;
    //   106: astore #15
    //   108: aload #14
    //   110: astore #9
    //   112: aload_0
    //   113: invokevirtual getContext : ()Landroid/content/Context;
    //   116: invokevirtual getAssets : ()Landroid/content/res/AssetManager;
    //   119: aload #15
    //   121: invokevirtual open : (Ljava/lang/String;)Ljava/io/InputStream;
    //   124: astore_2
    //   125: aload_2
    //   126: astore #9
    //   128: aload_0
    //   129: invokevirtual getContext : ()Landroid/content/Context;
    //   132: invokevirtual getAssets : ()Landroid/content/res/AssetManager;
    //   135: aload #15
    //   137: invokevirtual open : (Ljava/lang/String;)Ljava/io/InputStream;
    //   140: astore #10
    //   142: aload #10
    //   144: astore #9
    //   146: aload #10
    //   148: astore_2
    //   149: getstatic io/liteglue/SQLitePlugin.TAG : Ljava/lang/String;
    //   152: astore #11
    //   154: aload #10
    //   156: astore #9
    //   158: aload #10
    //   160: astore_2
    //   161: new java/lang/StringBuilder
    //   164: dup
    //   165: invokespecial <init> : ()V
    //   168: astore #14
    //   170: aload #10
    //   172: astore #9
    //   174: aload #10
    //   176: astore_2
    //   177: aload #14
    //   179: ldc_w 'Pre-populated DB asset FOUND  in app bundle www subdirectory: '
    //   182: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   185: pop
    //   186: aload #10
    //   188: astore #9
    //   190: aload #10
    //   192: astore_2
    //   193: aload #14
    //   195: aload #15
    //   197: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   200: pop
    //   201: aload #10
    //   203: astore #9
    //   205: aload #10
    //   207: astore_2
    //   208: aload #11
    //   210: aload #14
    //   212: invokevirtual toString : ()Ljava/lang/String;
    //   215: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)V
    //   218: aload #10
    //   220: astore #9
    //   222: goto -> 416
    //   225: aload #9
    //   227: astore_2
    //   228: getstatic io/liteglue/SQLitePlugin.TAG : Ljava/lang/String;
    //   231: astore #11
    //   233: aload #9
    //   235: astore_2
    //   236: new java/lang/StringBuilder
    //   239: dup
    //   240: invokespecial <init> : ()V
    //   243: astore #10
    //   245: aload #9
    //   247: astore_2
    //   248: aload #10
    //   250: ldc_w 'pre-populated DB asset NOT FOUND in app bundle www subdirectory: '
    //   253: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   256: pop
    //   257: aload #9
    //   259: astore_2
    //   260: aload #10
    //   262: aload #15
    //   264: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   267: pop
    //   268: aload #9
    //   270: astore_2
    //   271: aload #10
    //   273: invokevirtual toString : ()Ljava/lang/String;
    //   276: astore #10
    //   278: goto -> 490
    //   281: aload #14
    //   283: astore #9
    //   285: aload #10
    //   287: iconst_0
    //   288: invokevirtual charAt : (I)C
    //   291: bipush #126
    //   293: if_icmpne -> 509
    //   296: aload #14
    //   298: astore #9
    //   300: aload #10
    //   302: ldc_w '~/'
    //   305: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   308: ifeq -> 326
    //   311: aload #14
    //   313: astore #9
    //   315: aload #10
    //   317: iconst_2
    //   318: invokevirtual substring : (I)Ljava/lang/String;
    //   321: astore #11
    //   323: goto -> 338
    //   326: aload #14
    //   328: astore #9
    //   330: aload #10
    //   332: iconst_1
    //   333: invokevirtual substring : (I)Ljava/lang/String;
    //   336: astore #11
    //   338: aload #14
    //   340: astore #9
    //   342: aload_0
    //   343: invokevirtual getContext : ()Landroid/content/Context;
    //   346: invokevirtual getAssets : ()Landroid/content/res/AssetManager;
    //   349: aload #11
    //   351: invokevirtual open : (Ljava/lang/String;)Ljava/io/InputStream;
    //   354: astore #10
    //   356: aload #10
    //   358: astore_2
    //   359: getstatic io/liteglue/SQLitePlugin.TAG : Ljava/lang/String;
    //   362: astore #9
    //   364: aload #10
    //   366: astore_2
    //   367: new java/lang/StringBuilder
    //   370: dup
    //   371: invokespecial <init> : ()V
    //   374: astore #14
    //   376: aload #10
    //   378: astore_2
    //   379: aload #14
    //   381: ldc_w 'Pre-populated DB asset FOUND in app bundle subdirectory: '
    //   384: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   387: pop
    //   388: aload #10
    //   390: astore_2
    //   391: aload #14
    //   393: aload #11
    //   395: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   398: pop
    //   399: aload #10
    //   401: astore_2
    //   402: aload #9
    //   404: aload #14
    //   406: invokevirtual toString : ()Ljava/lang/String;
    //   409: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)V
    //   412: aload #10
    //   414: astore #9
    //   416: aload #13
    //   418: astore_2
    //   419: iload #8
    //   421: istore #7
    //   423: goto -> 777
    //   426: aconst_null
    //   427: astore #9
    //   429: aload #9
    //   431: astore_2
    //   432: getstatic io/liteglue/SQLitePlugin.TAG : Ljava/lang/String;
    //   435: astore #10
    //   437: aload #9
    //   439: astore_2
    //   440: new java/lang/StringBuilder
    //   443: dup
    //   444: invokespecial <init> : ()V
    //   447: astore #13
    //   449: aload #9
    //   451: astore_2
    //   452: aload #13
    //   454: ldc_w 'pre-populated DB asset NOT FOUND in app bundle www subdirectory: '
    //   457: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   460: pop
    //   461: aload #9
    //   463: astore_2
    //   464: aload #13
    //   466: aload #11
    //   468: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   471: pop
    //   472: aload #9
    //   474: astore_2
    //   475: aload #13
    //   477: invokevirtual toString : ()Ljava/lang/String;
    //   480: astore #13
    //   482: aload #10
    //   484: astore #11
    //   486: aload #13
    //   488: astore #10
    //   490: aload #9
    //   492: astore_2
    //   493: aload #11
    //   495: aload #10
    //   497: invokestatic b : (Ljava/lang/String;Ljava/lang/String;)V
    //   500: aload #12
    //   502: astore_2
    //   503: iconst_1
    //   504: istore #7
    //   506: goto -> 777
    //   509: aload #14
    //   511: astore #9
    //   513: aload_0
    //   514: invokevirtual getContext : ()Landroid/content/Context;
    //   517: invokevirtual getFilesDir : ()Ljava/io/File;
    //   520: astore_2
    //   521: aload #10
    //   523: astore #11
    //   525: aload #14
    //   527: astore #9
    //   529: aload #10
    //   531: ldc '/'
    //   533: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   536: ifeq -> 551
    //   539: aload #14
    //   541: astore #9
    //   543: aload #10
    //   545: iconst_1
    //   546: invokevirtual substring : (I)Ljava/lang/String;
    //   549: astore #11
    //   551: aload #14
    //   553: astore #9
    //   555: new java/io/File
    //   558: dup
    //   559: aload_2
    //   560: aload #11
    //   562: invokespecial <init> : (Ljava/io/File;Ljava/lang/String;)V
    //   565: astore #12
    //   567: aload #14
    //   569: astore #9
    //   571: new java/io/FileInputStream
    //   574: dup
    //   575: aload #12
    //   577: invokespecial <init> : (Ljava/io/File;)V
    //   580: astore #10
    //   582: aload #10
    //   584: astore_2
    //   585: getstatic io/liteglue/SQLitePlugin.TAG : Ljava/lang/String;
    //   588: astore #9
    //   590: aload #10
    //   592: astore_2
    //   593: new java/lang/StringBuilder
    //   596: dup
    //   597: invokespecial <init> : ()V
    //   600: astore #14
    //   602: aload #10
    //   604: astore_2
    //   605: aload #14
    //   607: ldc_w 'Pre-populated DB asset FOUND in Files subdirectory: '
    //   610: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   613: pop
    //   614: aload #10
    //   616: astore_2
    //   617: aload #14
    //   619: aload #12
    //   621: invokevirtual getCanonicalPath : ()Ljava/lang/String;
    //   624: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   627: pop
    //   628: aload #10
    //   630: astore_2
    //   631: aload #9
    //   633: aload #14
    //   635: invokevirtual toString : ()Ljava/lang/String;
    //   638: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)V
    //   641: aload #13
    //   643: astore_2
    //   644: iload #8
    //   646: istore #7
    //   648: aload #10
    //   650: astore #9
    //   652: iload_3
    //   653: iconst_1
    //   654: if_icmpne -> 777
    //   657: aload #10
    //   659: astore_2
    //   660: getstatic io/liteglue/SQLitePlugin.TAG : Ljava/lang/String;
    //   663: ldc_w 'Detected read-only mode request for external asset.'
    //   666: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)V
    //   669: aload #12
    //   671: astore_2
    //   672: iload #8
    //   674: istore #7
    //   676: aload #10
    //   678: astore #9
    //   680: goto -> 777
    //   683: aconst_null
    //   684: astore #9
    //   686: aload #10
    //   688: astore_2
    //   689: aload #9
    //   691: astore #10
    //   693: goto -> 702
    //   696: aconst_null
    //   697: astore #10
    //   699: aload #15
    //   701: astore_2
    //   702: aload_2
    //   703: astore #9
    //   705: getstatic io/liteglue/SQLitePlugin.TAG : Ljava/lang/String;
    //   708: astore #12
    //   710: aload_2
    //   711: astore #9
    //   713: new java/lang/StringBuilder
    //   716: dup
    //   717: invokespecial <init> : ()V
    //   720: astore #13
    //   722: aload_2
    //   723: astore #9
    //   725: aload #13
    //   727: ldc_w 'Error opening pre-populated DB asset in app bundle www subdirectory: '
    //   730: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   733: pop
    //   734: aload_2
    //   735: astore #9
    //   737: aload #13
    //   739: aload #11
    //   741: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   744: pop
    //   745: aload_2
    //   746: astore #9
    //   748: aload #12
    //   750: aload #13
    //   752: invokevirtual toString : ()Ljava/lang/String;
    //   755: invokestatic b : (Ljava/lang/String;Ljava/lang/String;)V
    //   758: aload_2
    //   759: astore #9
    //   761: aload #10
    //   763: astore_2
    //   764: goto -> 503
    //   767: aconst_null
    //   768: astore #9
    //   770: iload #8
    //   772: istore #7
    //   774: aload #13
    //   776: astore_2
    //   777: aload_2
    //   778: astore #10
    //   780: aload_2
    //   781: ifnonnull -> 930
    //   784: aload #9
    //   786: astore_2
    //   787: aload_0
    //   788: invokevirtual getContext : ()Landroid/content/Context;
    //   791: aload_1
    //   792: invokevirtual getDatabasePath : (Ljava/lang/String;)Ljava/io/File;
    //   795: astore #10
    //   797: aload #9
    //   799: astore_2
    //   800: aload #10
    //   802: invokevirtual exists : ()Z
    //   805: ifne -> 904
    //   808: iload #6
    //   810: ifeq -> 904
    //   813: iload #7
    //   815: ifne -> 878
    //   818: aload #9
    //   820: ifnull -> 878
    //   823: aload #9
    //   825: astore_2
    //   826: getstatic io/liteglue/SQLitePlugin.TAG : Ljava/lang/String;
    //   829: ldc_w 'Copying pre-populated db asset to destination'
    //   832: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)V
    //   835: aload #9
    //   837: astore_2
    //   838: aload_0
    //   839: aload_1
    //   840: aload #10
    //   842: aload #9
    //   844: invokespecial createFromAssets : (Ljava/lang/String;Ljava/io/File;Ljava/io/InputStream;)V
    //   847: goto -> 904
    //   850: astore_1
    //   851: aload #9
    //   853: astore_2
    //   854: getstatic io/liteglue/SQLitePlugin.TAG : Ljava/lang/String;
    //   857: ldc_w 'Error importing pre-populated DB asset'
    //   860: aload_1
    //   861: invokestatic b : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   864: aload #9
    //   866: astore_2
    //   867: new java/lang/Exception
    //   870: dup
    //   871: ldc_w 'Error importing pre-populated DB asset'
    //   874: invokespecial <init> : (Ljava/lang/String;)V
    //   877: athrow
    //   878: aload #9
    //   880: astore_2
    //   881: getstatic io/liteglue/SQLitePlugin.TAG : Ljava/lang/String;
    //   884: ldc_w 'Unable to import pre-populated db asset'
    //   887: invokestatic b : (Ljava/lang/String;Ljava/lang/String;)V
    //   890: aload #9
    //   892: astore_2
    //   893: new java/lang/Exception
    //   896: dup
    //   897: ldc_w 'Unable to import pre-populated db asset'
    //   900: invokespecial <init> : (Ljava/lang/String;)V
    //   903: athrow
    //   904: aload #9
    //   906: astore_2
    //   907: aload #10
    //   909: invokevirtual exists : ()Z
    //   912: ifne -> 1053
    //   915: aload #9
    //   917: astore_2
    //   918: aload #10
    //   920: invokevirtual getParentFile : ()Ljava/io/File;
    //   923: invokevirtual mkdirs : ()Z
    //   926: pop
    //   927: goto -> 1053
    //   930: iload #5
    //   932: ifeq -> 949
    //   935: aload #9
    //   937: astore_2
    //   938: new io/liteglue/SQLiteAndroidDatabase
    //   941: dup
    //   942: invokespecial <init> : ()V
    //   945: astore_1
    //   946: goto -> 961
    //   949: aload #9
    //   951: astore_2
    //   952: new io/liteglue/SQLitePlugin$SQLiteDatabaseNDK
    //   955: dup
    //   956: aload_0
    //   957: invokespecial <init> : (Lio/liteglue/SQLitePlugin;)V
    //   960: astore_1
    //   961: aload #9
    //   963: astore_2
    //   964: aload_1
    //   965: aload #10
    //   967: iload_3
    //   968: invokevirtual open : (Ljava/io/File;I)V
    //   971: aload #4
    //   973: ifnull -> 987
    //   976: aload #9
    //   978: astore_2
    //   979: aload #4
    //   981: ldc_w 'database open'
    //   984: invokevirtual success : (Ljava/lang/String;)V
    //   987: aload_0
    //   988: aload #9
    //   990: invokespecial closeQuietly : (Ljava/io/Closeable;)V
    //   993: aload_1
    //   994: areturn
    //   995: aload_0
    //   996: aload_2
    //   997: invokespecial closeQuietly : (Ljava/io/Closeable;)V
    //   1000: goto -> 1005
    //   1003: aload_1
    //   1004: athrow
    //   1005: goto -> 1003
    //   1008: astore_2
    //   1009: goto -> 225
    //   1012: astore_2
    //   1013: goto -> 426
    //   1016: astore_2
    //   1017: aload #10
    //   1019: astore #9
    //   1021: goto -> 429
    //   1024: astore_2
    //   1025: goto -> 696
    //   1028: astore_2
    //   1029: goto -> 683
    //   1032: astore_2
    //   1033: aload #12
    //   1035: astore #9
    //   1037: goto -> 686
    //   1040: astore_1
    //   1041: aload #9
    //   1043: astore_2
    //   1044: goto -> 995
    //   1047: iconst_0
    //   1048: istore #6
    //   1050: goto -> 40
    //   1053: bipush #6
    //   1055: istore_3
    //   1056: goto -> 930
    //   1059: astore_1
    //   1060: goto -> 995
    // Exception table:
    //   from	to	target	type
    //   27	34	1040	finally
    //   49	59	1040	finally
    //   68	76	1040	finally
    //   80	88	1040	finally
    //   92	98	1040	finally
    //   102	108	1040	finally
    //   112	125	1040	finally
    //   128	142	1008	java/lang/Exception
    //   128	142	1059	finally
    //   149	154	1008	java/lang/Exception
    //   149	154	1059	finally
    //   161	170	1008	java/lang/Exception
    //   161	170	1059	finally
    //   177	186	1008	java/lang/Exception
    //   177	186	1059	finally
    //   193	201	1008	java/lang/Exception
    //   193	201	1059	finally
    //   208	218	1008	java/lang/Exception
    //   208	218	1059	finally
    //   228	233	1059	finally
    //   236	245	1059	finally
    //   248	257	1059	finally
    //   260	268	1059	finally
    //   271	278	1059	finally
    //   285	296	1040	finally
    //   300	311	1040	finally
    //   315	323	1040	finally
    //   330	338	1040	finally
    //   342	356	1012	java/lang/Exception
    //   342	356	1040	finally
    //   359	364	1016	java/lang/Exception
    //   359	364	1059	finally
    //   367	376	1016	java/lang/Exception
    //   367	376	1059	finally
    //   379	388	1016	java/lang/Exception
    //   379	388	1059	finally
    //   391	399	1016	java/lang/Exception
    //   391	399	1059	finally
    //   402	412	1016	java/lang/Exception
    //   402	412	1059	finally
    //   432	437	1059	finally
    //   440	449	1059	finally
    //   452	461	1059	finally
    //   464	472	1059	finally
    //   475	482	1059	finally
    //   493	500	1059	finally
    //   513	521	1040	finally
    //   529	539	1040	finally
    //   543	551	1040	finally
    //   555	567	1024	java/lang/Exception
    //   555	567	1040	finally
    //   571	582	1024	java/lang/Exception
    //   571	582	1040	finally
    //   585	590	1028	java/lang/Exception
    //   585	590	1059	finally
    //   593	602	1028	java/lang/Exception
    //   593	602	1059	finally
    //   605	614	1028	java/lang/Exception
    //   605	614	1059	finally
    //   617	628	1028	java/lang/Exception
    //   617	628	1059	finally
    //   631	641	1028	java/lang/Exception
    //   631	641	1059	finally
    //   660	669	1032	java/lang/Exception
    //   660	669	1059	finally
    //   705	710	1040	finally
    //   713	722	1040	finally
    //   725	734	1040	finally
    //   737	745	1040	finally
    //   748	758	1040	finally
    //   787	797	1059	finally
    //   800	808	1059	finally
    //   826	835	1059	finally
    //   838	847	850	java/lang/Exception
    //   838	847	1059	finally
    //   854	864	1059	finally
    //   867	878	1059	finally
    //   881	890	1059	finally
    //   893	904	1059	finally
    //   907	915	1059	finally
    //   918	927	1059	finally
    //   938	946	1059	finally
    //   952	961	1059	finally
    //   964	971	1059	finally
    //   979	987	1059	finally
  }
  
  private void startDatabase(String paramString, ReadableMap paramReadableMap, CallbackContext paramCallbackContext) {
    if ((DBRunner)dbrmap.get(paramString) != null) {
      paramCallbackContext.success("database started");
      return;
    } 
    DBRunner dBRunner = new DBRunner(paramString, paramReadableMap, paramCallbackContext);
    dbrmap.put(paramString, dBRunner);
    getThreadPool().execute(dBRunner);
  }
  
  @ReactMethod
  public void attach(ReadableMap paramReadableMap, Callback paramCallback1, Callback paramCallback2) {
    try {
      execute("attach", paramReadableMap, new CallbackContext(paramCallback1, paramCallback2));
      return;
    } catch (Exception exception) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Unexpected error");
      stringBuilder.append(exception.getMessage());
      paramCallback2.invoke(new Object[] { stringBuilder.toString() });
      return;
    } 
  }
  
  @ReactMethod
  public void backgroundExecuteSqlBatch(ReadableMap paramReadableMap, Callback paramCallback1, Callback paramCallback2) {
    try {
      execute("backgroundExecuteSqlBatch", paramReadableMap, new CallbackContext(paramCallback1, paramCallback2));
      return;
    } catch (Exception exception) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Unexpected error");
      stringBuilder.append(exception.getMessage());
      paramCallback2.invoke(new Object[] { stringBuilder.toString() });
      return;
    } 
  }
  
  @ReactMethod
  public void close(ReadableMap paramReadableMap, Callback paramCallback1, Callback paramCallback2) {
    try {
      execute("close", paramReadableMap, new CallbackContext(paramCallback1, paramCallback2));
      return;
    } catch (Exception exception) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Unexpected error");
      stringBuilder.append(exception.getMessage());
      paramCallback2.invoke(new Object[] { stringBuilder.toString() });
      return;
    } 
  }
  
  public void closeAllOpenDatabases() {
    while (!dbrmap.isEmpty()) {
      String str = dbrmap.keySet().iterator().next();
      closeDatabaseNow(str);
      DBRunner dBRunner = dbrmap.get(str);
      try {
        dBRunner.q.put(new DBQuery());
      } catch (Exception exception) {
        String str1 = TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("couldn't stop db thread for db: ");
        stringBuilder.append(str);
        a.b(str1, stringBuilder.toString(), exception);
      } 
      dbrmap.remove(str);
    } 
  }
  
  @ReactMethod
  public void delete(ReadableMap paramReadableMap, Callback paramCallback1, Callback paramCallback2) {
    try {
      execute("delete", paramReadableMap, new CallbackContext(paramCallback1, paramCallback2));
      return;
    } catch (Exception exception) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Unexpected error");
      stringBuilder.append(exception.getMessage());
      paramCallback2.invoke(new Object[] { stringBuilder.toString() });
      return;
    } 
  }
  
  @ReactMethod
  public void echoStringValue(ReadableMap paramReadableMap, Callback paramCallback1, Callback paramCallback2) {
    try {
      execute("echoStringValue", paramReadableMap, new CallbackContext(paramCallback1, paramCallback2));
      return;
    } catch (Exception exception) {
      paramCallback2.invoke(new Object[] { "Unexpected error" });
      return;
    } 
  }
  
  protected boolean execute(String paramString, ReadableMap paramReadableMap, CallbackContext paramCallbackContext) {
    try {
      Action action = Action.valueOf(paramString);
      try {
        return executeAndPossiblyThrow(action, paramReadableMap, paramCallbackContext);
      } catch (Exception exception) {
        a.b(TAG, "unexpected error", exception);
        paramCallbackContext.error("Unexpected error executing processing SQLite query");
        throw exception;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      a.b(TAG, "unexpected error", illegalArgumentException);
      paramCallbackContext.error("Unexpected error executing processing SQLite query");
      throw illegalArgumentException;
    } 
  }
  
  @ReactMethod
  public void executeSqlBatch(ReadableMap paramReadableMap, Callback paramCallback1, Callback paramCallback2) {
    try {
      execute("executeSqlBatch", paramReadableMap, new CallbackContext(paramCallback1, paramCallback2));
      return;
    } catch (Exception exception) {
      paramCallback2.invoke(new Object[] { "Unexpected error" });
      return;
    } 
  }
  
  protected Context getContext() {
    return this.context;
  }
  
  public String getName() {
    return "SQLite";
  }
  
  protected ExecutorService getThreadPool() {
    return this.threadPool;
  }
  
  @ReactMethod
  public void open(ReadableMap paramReadableMap, Callback paramCallback1, Callback paramCallback2) {
    try {
      execute("open", paramReadableMap, new CallbackContext(paramCallback1, paramCallback2));
      return;
    } catch (Exception exception) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Unexpected error:");
      stringBuilder.append(exception.getMessage());
      paramCallback2.invoke(new Object[] { stringBuilder.toString() });
      return;
    } 
  }
  
  private enum Action {
    attach, backgroundExecuteSqlBatch, close, delete, echoStringValue, executeSqlBatch, open;
    
    static {
      attach = new Action("attach", 2);
      delete = new Action("delete", 3);
      executeSqlBatch = new Action("executeSqlBatch", 4);
      backgroundExecuteSqlBatch = new Action("backgroundExecuteSqlBatch", 5);
      echoStringValue = new Action("echoStringValue", 6);
      $VALUES = new Action[] { open, close, attach, delete, executeSqlBatch, backgroundExecuteSqlBatch, echoStringValue };
    }
  }
  
  private final class DBQuery {
    final CallbackContext cbc = null;
    
    final boolean close = false;
    
    final boolean delete = false;
    
    final String[] queries = null;
    
    final String[] queryIDs = null;
    
    final ReadableArray[] queryParams = null;
    
    final boolean stop = true;
    
    DBQuery() {}
    
    DBQuery(boolean param1Boolean, CallbackContext param1CallbackContext) {}
    
    DBQuery(String[] param1ArrayOfString1, String[] param1ArrayOfString2, ReadableArray[] param1ArrayOfReadableArray, CallbackContext param1CallbackContext) {}
  }
  
  private class DBRunner implements Runnable {
    private boolean androidLockWorkaround;
    
    private String assetFilename;
    
    final String dbname;
    
    SQLiteAndroidDatabase mydb;
    
    private boolean oldImpl;
    
    final CallbackContext openCbc;
    
    final int openFlags;
    
    final BlockingQueue<SQLitePlugin.DBQuery> q;
    
    DBRunner(String param1String, ReadableMap param1ReadableMap, CallbackContext param1CallbackContext) {
      String str;
      byte b1;
      this.dbname = param1String;
      boolean bool = true;
      byte b2 = 6;
      try {
        this.assetFilename = SQLitePluginConverter.getString(param1ReadableMap, "assetFilename", (String)null);
        b1 = b2;
        if (this.assetFilename != null) {
          b1 = b2;
          if (this.assetFilename.length() > 0) {
            boolean bool1 = SQLitePluginConverter.getBoolean(param1ReadableMap, "readOnly", false);
            b1 = b2;
            if (bool1)
              b1 = 1; 
          } 
        } 
      } catch (Exception exception) {
        a.b(SQLitePlugin.TAG, "Error retrieving assetFilename or mode from options:", exception);
        b1 = b2;
      } 
      this.openFlags = b1;
      this.oldImpl = SQLitePluginConverter.getBoolean(param1ReadableMap, "androidOldDatabaseImplementation", false);
      param1String = SQLitePlugin.TAG;
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Android db implementation: ");
      if (this.oldImpl) {
        str = "OLD";
      } else {
        str = "sqlite4java (NDK)";
      } 
      stringBuilder.append(str);
      a.d(param1String, stringBuilder.toString());
      if (!this.oldImpl || !SQLitePluginConverter.getBoolean(param1ReadableMap, "androidLockWorkaround", false))
        bool = false; 
      this.androidLockWorkaround = bool;
      if (this.androidLockWorkaround)
        a.c(SQLitePlugin.TAG, "Android db closing/locking workaround applied"); 
      this.q = new LinkedBlockingQueue<SQLitePlugin.DBQuery>();
      this.openCbc = param1CallbackContext;
    }
    
    public void run() {
      try {
        this.mydb = SQLitePlugin.this.openDatabase(this.dbname, this.assetFilename, this.openFlags, this.openCbc, this.oldImpl);
        SQLitePlugin.DBQuery dBQuery1 = null;
        SQLitePlugin.DBQuery dBQuery2 = null;
        try {
          SQLitePlugin.DBQuery dBQuery = (SQLitePlugin.DBQuery)this.q.take();
          dBQuery1 = dBQuery2;
          while (true) {
            dBQuery = dBQuery;
            dBQuery1 = dBQuery;
            dBQuery2 = dBQuery;
            if (!dBQuery.stop) {
              dBQuery1 = dBQuery;
              this.mydb.executeSqlBatch(dBQuery.queries, dBQuery.queryParams, dBQuery.queryIDs, dBQuery.cbc);
              dBQuery1 = dBQuery;
              if (this.androidLockWorkaround) {
                dBQuery1 = dBQuery;
                if (dBQuery.queries.length == 1) {
                  dBQuery1 = dBQuery;
                  if (dBQuery.queries[0].equals("COMMIT")) {
                    dBQuery1 = dBQuery;
                    this.mydb.bugWorkaround();
                  } 
                } 
              } 
              dBQuery1 = dBQuery;
              dBQuery2 = this.q.take();
              dBQuery1 = dBQuery;
              dBQuery = dBQuery2;
              continue;
            } 
            break;
          } 
        } catch (Exception exception) {
          a.b(SQLitePlugin.TAG, "unexpected error", exception);
          dBQuery2 = dBQuery1;
        } 
        if (dBQuery2 != null && dBQuery2.close)
          try {
            SQLitePlugin.this.closeDatabaseNow(this.dbname);
            SQLitePlugin.dbrmap.remove(this.dbname);
            boolean bool = dBQuery2.delete;
            if (!bool) {
              dBQuery2.cbc.success("database deleted");
              return;
            } 
            try {
              if (SQLitePlugin.this.deleteDatabaseNow(this.dbname)) {
                dBQuery2.cbc.success("database deleted");
                return;
              } 
              dBQuery2.cbc.error("couldn't delete database");
              return;
            } catch (Exception exception) {
              a.b(SQLitePlugin.TAG, "couldn't delete database", exception);
              CallbackContext callbackContext = dBQuery2.cbc;
              StringBuilder stringBuilder = new StringBuilder();
              stringBuilder.append("couldn't delete database: ");
              stringBuilder.append(exception);
              callbackContext.error(stringBuilder.toString());
              return;
            } 
          } catch (Exception exception) {
            a.b(SQLitePlugin.TAG, "couldn't close database", exception);
            CallbackContext callbackContext = dBQuery2.cbc;
            if (callbackContext != null) {
              StringBuilder stringBuilder = new StringBuilder();
              stringBuilder.append("couldn't close database: ");
              stringBuilder.append(exception);
              callbackContext.error(stringBuilder.toString());
            } 
          }  
        return;
      } catch (Exception exception) {
        a.b(SQLitePlugin.TAG, "Error opening database, stopping db thread", exception);
        CallbackContext callbackContext = this.openCbc;
        if (callbackContext != null) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Can't open database.");
          stringBuilder.append(exception);
          callbackContext.error(stringBuilder.toString());
        } 
        SQLitePlugin.dbrmap.remove(this.dbname);
        return;
      } 
    }
  }
  
  class SQLiteDatabaseNDK extends SQLiteAndroidDatabase {
    SQLiteConnection mydb;
    
    private WritableMap executeSqlStatementNDK(String param1String, ReadableArray param1ReadableArray, CallbackContext param1CallbackContext) {
      // Byte code:
      //   0: invokestatic createMap : ()Lcom/facebook/react/bridge/WritableMap;
      //   3: astore #13
      //   5: aconst_null
      //   6: astore #12
      //   8: aconst_null
      //   9: astore_3
      //   10: aload_0
      //   11: getfield mydb : Lio/liteglue/SQLiteConnection;
      //   14: aload_1
      //   15: invokeinterface prepareStatement : (Ljava/lang/String;)Lio/liteglue/SQLiteStatement;
      //   20: astore_1
      //   21: aload_2
      //   22: ifnull -> 192
      //   25: iconst_0
      //   26: istore #6
      //   28: aload_1
      //   29: astore_3
      //   30: aload_1
      //   31: astore #12
      //   33: iload #6
      //   35: aload_2
      //   36: invokeinterface size : ()I
      //   41: if_icmpge -> 192
      //   44: aload_1
      //   45: astore_3
      //   46: aload_1
      //   47: astore #12
      //   49: aload_2
      //   50: iload #6
      //   52: invokeinterface getType : (I)Lcom/facebook/react/bridge/ReadableType;
      //   57: getstatic com/facebook/react/bridge/ReadableType.Number : Lcom/facebook/react/bridge/ReadableType;
      //   60: if_acmpne -> 132
      //   63: aload_1
      //   64: astore_3
      //   65: aload_1
      //   66: astore #12
      //   68: aload_2
      //   69: iload #6
      //   71: invokeinterface getDouble : (I)D
      //   76: dstore #4
      //   78: dload #4
      //   80: d2l
      //   81: lstore #9
      //   83: dload #4
      //   85: lload #9
      //   87: l2d
      //   88: dcmpl
      //   89: ifne -> 112
      //   92: aload_1
      //   93: astore_3
      //   94: aload_1
      //   95: astore #12
      //   97: aload_1
      //   98: iload #6
      //   100: iconst_1
      //   101: iadd
      //   102: lload #9
      //   104: invokeinterface bindLong : (IJ)V
      //   109: goto -> 452
      //   112: aload_1
      //   113: astore_3
      //   114: aload_1
      //   115: astore #12
      //   117: aload_1
      //   118: iload #6
      //   120: iconst_1
      //   121: iadd
      //   122: dload #4
      //   124: invokeinterface bindDouble : (ID)V
      //   129: goto -> 452
      //   132: aload_1
      //   133: astore_3
      //   134: aload_1
      //   135: astore #12
      //   137: aload_2
      //   138: iload #6
      //   140: invokeinterface isNull : (I)Z
      //   145: ifeq -> 166
      //   148: aload_1
      //   149: astore_3
      //   150: aload_1
      //   151: astore #12
      //   153: aload_1
      //   154: iload #6
      //   156: iconst_1
      //   157: iadd
      //   158: invokeinterface bindNull : (I)V
      //   163: goto -> 452
      //   166: aload_1
      //   167: astore_3
      //   168: aload_1
      //   169: astore #12
      //   171: aload_1
      //   172: iload #6
      //   174: iconst_1
      //   175: iadd
      //   176: aload_2
      //   177: iload #6
      //   179: ldc ''
      //   181: invokestatic getString : (Lcom/facebook/react/bridge/ReadableArray;ILjava/lang/String;)Ljava/lang/String;
      //   184: invokeinterface bindTextNativeString : (ILjava/lang/String;)V
      //   189: goto -> 452
      //   192: aload_1
      //   193: astore_3
      //   194: aload_1
      //   195: astore #12
      //   197: aload_1
      //   198: invokeinterface step : ()Z
      //   203: istore #11
      //   205: iload #11
      //   207: ifeq -> 399
      //   210: aload_1
      //   211: astore_3
      //   212: invokestatic createArray : ()Lcom/facebook/react/bridge/WritableArray;
      //   215: astore_2
      //   216: aload_1
      //   217: astore_3
      //   218: aload_1
      //   219: invokeinterface getColumnCount : ()I
      //   224: istore #7
      //   226: aload_1
      //   227: astore_3
      //   228: invokestatic createMap : ()Lcom/facebook/react/bridge/WritableMap;
      //   231: astore #12
      //   233: iconst_0
      //   234: istore #6
      //   236: iload #6
      //   238: iload #7
      //   240: if_icmpge -> 366
      //   243: aload_1
      //   244: astore_3
      //   245: aload_1
      //   246: iload #6
      //   248: invokeinterface getColumnName : (I)Ljava/lang/String;
      //   253: astore #14
      //   255: aload_1
      //   256: astore_3
      //   257: aload_1
      //   258: iload #6
      //   260: invokeinterface getColumnType : (I)I
      //   265: istore #8
      //   267: iload #8
      //   269: iconst_1
      //   270: if_icmpeq -> 343
      //   273: iload #8
      //   275: iconst_2
      //   276: if_icmpeq -> 321
      //   279: iload #8
      //   281: iconst_5
      //   282: if_icmpeq -> 307
      //   285: aload_1
      //   286: astore_3
      //   287: aload #12
      //   289: aload #14
      //   291: aload_1
      //   292: iload #6
      //   294: invokeinterface getColumnTextNativeString : (I)Ljava/lang/String;
      //   299: invokeinterface putString : (Ljava/lang/String;Ljava/lang/String;)V
      //   304: goto -> 461
      //   307: aload_1
      //   308: astore_3
      //   309: aload #12
      //   311: aload #14
      //   313: invokeinterface putNull : (Ljava/lang/String;)V
      //   318: goto -> 461
      //   321: aload_1
      //   322: astore_3
      //   323: aload #12
      //   325: aload #14
      //   327: aload_1
      //   328: iload #6
      //   330: invokeinterface getColumnDouble : (I)D
      //   335: invokeinterface putDouble : (Ljava/lang/String;D)V
      //   340: goto -> 461
      //   343: aload_1
      //   344: astore_3
      //   345: aload #12
      //   347: aload #14
      //   349: aload_1
      //   350: iload #6
      //   352: invokeinterface getColumnLong : (I)J
      //   357: l2d
      //   358: invokeinterface putDouble : (Ljava/lang/String;D)V
      //   363: goto -> 461
      //   366: aload_1
      //   367: astore_3
      //   368: aload_2
      //   369: aload #12
      //   371: invokeinterface pushMap : (Lcom/facebook/react/bridge/ReadableMap;)V
      //   376: aload_1
      //   377: astore_3
      //   378: aload_1
      //   379: invokeinterface step : ()Z
      //   384: ifne -> 226
      //   387: aload_1
      //   388: astore_3
      //   389: aload #13
      //   391: ldc 'rows'
      //   393: aload_2
      //   394: invokeinterface putArray : (Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V
      //   399: aload_1
      //   400: ifnull -> 409
      //   403: aload_1
      //   404: invokeinterface dispose : ()V
      //   409: aload #13
      //   411: areturn
      //   412: astore_1
      //   413: goto -> 434
      //   416: astore_1
      //   417: aload #12
      //   419: astore_3
      //   420: getstatic io/liteglue/SQLitePlugin.TAG : Ljava/lang/String;
      //   423: ldc 'SQLitePlugin.executeSql[Batch]() failed'
      //   425: aload_1
      //   426: invokestatic b : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
      //   429: aload #12
      //   431: astore_3
      //   432: aload_1
      //   433: athrow
      //   434: aload_3
      //   435: ifnull -> 444
      //   438: aload_3
      //   439: invokeinterface dispose : ()V
      //   444: goto -> 449
      //   447: aload_1
      //   448: athrow
      //   449: goto -> 447
      //   452: iload #6
      //   454: iconst_1
      //   455: iadd
      //   456: istore #6
      //   458: goto -> 28
      //   461: iload #6
      //   463: iconst_1
      //   464: iadd
      //   465: istore #6
      //   467: goto -> 236
      // Exception table:
      //   from	to	target	type
      //   10	21	416	java/lang/Exception
      //   10	21	412	finally
      //   33	44	416	java/lang/Exception
      //   33	44	412	finally
      //   49	63	416	java/lang/Exception
      //   49	63	412	finally
      //   68	78	416	java/lang/Exception
      //   68	78	412	finally
      //   97	109	416	java/lang/Exception
      //   97	109	412	finally
      //   117	129	416	java/lang/Exception
      //   117	129	412	finally
      //   137	148	416	java/lang/Exception
      //   137	148	412	finally
      //   153	163	416	java/lang/Exception
      //   153	163	412	finally
      //   171	189	416	java/lang/Exception
      //   171	189	412	finally
      //   197	205	416	java/lang/Exception
      //   197	205	412	finally
      //   212	216	412	finally
      //   218	226	412	finally
      //   228	233	412	finally
      //   245	255	412	finally
      //   257	267	412	finally
      //   287	304	412	finally
      //   309	318	412	finally
      //   323	340	412	finally
      //   345	363	412	finally
      //   368	376	412	finally
      //   378	387	412	finally
      //   389	399	412	finally
      //   420	429	412	finally
      //   432	434	412	finally
    }
    
    void bugWorkaround() {}
    
    void closeDatabaseNow() {
      try {
        if (this.mydb != null) {
          this.mydb.dispose();
          return;
        } 
      } catch (Exception exception) {
        a.b(SQLitePlugin.TAG, "couldn't close database, ignoring", exception);
      } 
    }
    
    void executeSqlBatch(String[] param1ArrayOfString1, ReadableArray[] param1ArrayOfReadableArray, String[] param1ArrayOfString2, CallbackContext param1CallbackContext) {
      if (this.mydb == null) {
        param1CallbackContext.error("database has been closed");
        return;
      } 
      int j = param1ArrayOfString1.length;
      WritableArray writableArray = Arguments.createArray();
      int i = 0;
      while (true) {
        if (i < j) {
          WritableMap writableMap2;
          String str1 = param1ArrayOfString2[i];
          WritableMap writableMap3 = null;
          String str2 = param1ArrayOfString1[i];
          WritableMap writableMap1 = writableMap3;
          try {
            long l = this.mydb.getTotalChanges();
            if (param1ArrayOfReadableArray != null) {
              writableMap = (WritableMap)param1ArrayOfReadableArray[i];
            } else {
              writableMap = null;
            } 
            writableMap1 = writableMap3;
            WritableMap writableMap = executeSqlStatementNDK(str2, (ReadableArray)writableMap, param1CallbackContext);
            writableMap1 = writableMap;
            l = this.mydb.getTotalChanges() - l;
            writableMap1 = writableMap;
            writableMap.putDouble("rowsAffected", l);
            if (l > 0L) {
              writableMap1 = writableMap;
              l = this.mydb.getLastInsertRowid();
              if (l > 0L) {
                writableMap1 = writableMap;
                writableMap.putDouble("insertId", l);
              } 
            } 
            String str4 = "unknown";
            writableMap1 = writableMap;
            String str3 = str4;
          } catch (Exception exception) {
            String str = exception.getMessage();
            a.b(SQLitePlugin.TAG, "SQLitePlugin.executeSql[Batch]() failed", exception);
          } 
          if (writableMap1 != null) {
            try {
              writableMap2 = Arguments.createMap();
              writableMap2.putString("qid", str1);
              writableMap2.putString("type", "success");
              writableMap2.putMap("result", (ReadableMap)writableMap1);
              writableArray.pushMap((ReadableMap)writableMap2);
            } catch (Exception exception) {
              a.b(SQLitePlugin.TAG, "SQLitePlugin.executeSql[Batch]() failed", exception);
            } 
          } else {
            writableMap1 = Arguments.createMap();
            writableMap1.putString("qid", str1);
            writableMap1.putString("type", "error");
            writableMap3 = Arguments.createMap();
            writableMap3.putString("message", (String)writableMap2);
            writableMap1.putMap("result", (ReadableMap)writableMap3);
            writableArray.pushMap((ReadableMap)writableMap1);
          } 
          i++;
          continue;
        } 
        param1CallbackContext.success(writableArray);
        return;
      } 
    }
    
    void open(File param1File) {
      open(param1File, 6);
    }
    
    void open(File param1File, int param1Int) {
      this.mydb = SQLitePlugin.connector.newSQLiteConnection(param1File.getAbsolutePath(), param1Int);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/io/liteglue/SQLitePlugin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */