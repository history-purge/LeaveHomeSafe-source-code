package io.liteglue;

import android.annotation.SuppressLint;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.util.Base64;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableMap;
import java.io.File;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class SQLiteAndroidDatabase {
  private static final Pattern FIRST_WORD = Pattern.compile("^\\s*(\\S+)", 2);
  
  File dbFile;
  
  SQLiteDatabase mydb;
  
  int openFlags;
  
  private void bindArgsToStatement(SQLiteStatement paramSQLiteStatement, ReadableArray paramReadableArray) {
    if (paramReadableArray == null)
      return; 
    int i;
    for (i = 0; i < paramReadableArray.size(); i++) {
      if (paramReadableArray.getType(i) == ReadableType.Number) {
        double d = paramReadableArray.getDouble(i);
        long l = (long)d;
        if (d == l) {
          paramSQLiteStatement.bindLong(i + 1, l);
        } else {
          paramSQLiteStatement.bindDouble(i + 1, d);
        } 
      } else if (paramReadableArray.isNull(i)) {
        paramSQLiteStatement.bindNull(i + 1);
      } else {
        paramSQLiteStatement.bindString(i + 1, paramReadableArray.getString(i));
      } 
    } 
  }
  
  @SuppressLint({"NewApi"})
  private void bindRow(WritableMap paramWritableMap, String paramString, Cursor paramCursor, int paramInt) {
    int i = paramCursor.getType(paramInt);
    if (i != 0) {
      double d;
      if (i != 1) {
        if (i != 2) {
          if (i != 4) {
            paramWritableMap.putString(paramString, paramCursor.getString(paramInt));
            return;
          } 
          paramWritableMap.putString(paramString, new String(Base64.encode(paramCursor.getBlob(paramInt), 0)));
          return;
        } 
        d = paramCursor.getDouble(paramInt);
      } else {
        d = paramCursor.getLong(paramInt);
      } 
      paramWritableMap.putDouble(paramString, d);
      return;
    } 
    paramWritableMap.putNull(paramString);
  }
  
  private WritableMap executeSqlStatementQuery(SQLiteDatabase paramSQLiteDatabase, String paramString, ReadableArray paramReadableArray, CallbackContext paramCallbackContext) {
    // Byte code:
    //   0: invokestatic createMap : ()Lcom/facebook/react/bridge/WritableMap;
    //   3: astore #7
    //   5: iconst_0
    //   6: anewarray java/lang/String
    //   9: astore #4
    //   11: aload_3
    //   12: ifnull -> 77
    //   15: aload_3
    //   16: invokeinterface size : ()I
    //   21: istore #6
    //   23: iload #6
    //   25: anewarray java/lang/String
    //   28: astore #4
    //   30: iconst_0
    //   31: istore #5
    //   33: iload #5
    //   35: iload #6
    //   37: if_icmpge -> 215
    //   40: aload_3
    //   41: iload #5
    //   43: invokeinterface isNull : (I)Z
    //   48: ifeq -> 61
    //   51: aload #4
    //   53: iload #5
    //   55: ldc ''
    //   57: aastore
    //   58: goto -> 206
    //   61: aload #4
    //   63: iload #5
    //   65: aload_3
    //   66: iload #5
    //   68: invokeinterface getString : (I)Ljava/lang/String;
    //   73: aastore
    //   74: goto -> 206
    //   77: aload_1
    //   78: aload_2
    //   79: aload #4
    //   81: invokevirtual rawQuery : (Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   84: astore_1
    //   85: aload_1
    //   86: ifnull -> 175
    //   89: aload_1
    //   90: invokeinterface moveToFirst : ()Z
    //   95: ifeq -> 175
    //   98: invokestatic createArray : ()Lcom/facebook/react/bridge/WritableArray;
    //   101: astore_2
    //   102: aload_1
    //   103: invokeinterface getColumnCount : ()I
    //   108: istore #6
    //   110: invokestatic createMap : ()Lcom/facebook/react/bridge/WritableMap;
    //   113: astore_3
    //   114: iconst_0
    //   115: istore #5
    //   117: iload #5
    //   119: iload #6
    //   121: if_icmpge -> 149
    //   124: aload_0
    //   125: aload_3
    //   126: aload_1
    //   127: iload #5
    //   129: invokeinterface getColumnName : (I)Ljava/lang/String;
    //   134: aload_1
    //   135: iload #5
    //   137: invokespecial bindRow : (Lcom/facebook/react/bridge/WritableMap;Ljava/lang/String;Landroid/database/Cursor;I)V
    //   140: iload #5
    //   142: iconst_1
    //   143: iadd
    //   144: istore #5
    //   146: goto -> 117
    //   149: aload_2
    //   150: aload_3
    //   151: invokeinterface pushMap : (Lcom/facebook/react/bridge/ReadableMap;)V
    //   156: aload_1
    //   157: invokeinterface moveToNext : ()Z
    //   162: ifne -> 110
    //   165: aload #7
    //   167: ldc 'rows'
    //   169: aload_2
    //   170: invokeinterface putArray : (Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V
    //   175: aload_1
    //   176: ifnull -> 185
    //   179: aload_1
    //   180: invokeinterface close : ()V
    //   185: aload #7
    //   187: areturn
    //   188: astore_1
    //   189: getstatic io/liteglue/SQLitePlugin.TAG : Ljava/lang/String;
    //   192: ldc 'SQLiteAndroidDatabase.executeSql[Batch]() failed'
    //   194: aload_1
    //   195: invokestatic b : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   198: goto -> 203
    //   201: aload_1
    //   202: athrow
    //   203: goto -> 201
    //   206: iload #5
    //   208: iconst_1
    //   209: iadd
    //   210: istore #5
    //   212: goto -> 33
    //   215: goto -> 77
    // Exception table:
    //   from	to	target	type
    //   5	11	188	java/lang/Exception
    //   15	30	188	java/lang/Exception
    //   40	51	188	java/lang/Exception
    //   61	74	188	java/lang/Exception
    //   77	85	188	java/lang/Exception
  }
  
  static QueryType getQueryType(String paramString) {
    Matcher matcher = FIRST_WORD.matcher(paramString);
    if (matcher.find())
      try {
        return QueryType.valueOf(matcher.group(1).toLowerCase(Locale.US));
      } catch (IllegalArgumentException illegalArgumentException) {} 
    return QueryType.other;
  }
  
  void bugWorkaround() {
    closeDatabaseNow();
    open(this.dbFile, this.openFlags);
  }
  
  void closeDatabaseNow() {
    SQLiteDatabase sQLiteDatabase = this.mydb;
    if (sQLiteDatabase != null) {
      sQLiteDatabase.close();
      this.mydb = null;
    } 
  }
  
  @SuppressLint({"NewApi"})
  void executeSqlBatch(String[] paramArrayOfString1, ReadableArray[] paramArrayOfReadableArray, String[] paramArrayOfString2, CallbackContext paramCallbackContext) {
    // Byte code:
    //   0: aload_0
    //   1: getfield mydb : Landroid/database/sqlite/SQLiteDatabase;
    //   4: ifnonnull -> 15
    //   7: aload #4
    //   9: ldc 'database has been closed'
    //   11: invokevirtual error : (Ljava/lang/String;)V
    //   14: return
    //   15: aload_1
    //   16: arraylength
    //   17: istore #7
    //   19: invokestatic createArray : ()Lcom/facebook/react/bridge/WritableArray;
    //   22: astore #16
    //   24: iconst_0
    //   25: istore #5
    //   27: iload #5
    //   29: iload #7
    //   31: if_icmpge -> 829
    //   34: aload_3
    //   35: iload #5
    //   37: aaload
    //   38: astore #17
    //   40: ldc 'unknown'
    //   42: astore #12
    //   44: aload_1
    //   45: iload #5
    //   47: aaload
    //   48: astore #18
    //   50: aload #18
    //   52: invokestatic getQueryType : (Ljava/lang/String;)Lio/liteglue/SQLiteAndroidDatabase$QueryType;
    //   55: astore #10
    //   57: getstatic io/liteglue/SQLiteAndroidDatabase$QueryType.update : Lio/liteglue/SQLiteAndroidDatabase$QueryType;
    //   60: astore #11
    //   62: iconst_1
    //   63: istore #6
    //   65: aload #10
    //   67: aload #11
    //   69: if_acmpeq -> 502
    //   72: aload #10
    //   74: getstatic io/liteglue/SQLiteAndroidDatabase$QueryType.delete : Lio/liteglue/SQLiteAndroidDatabase$QueryType;
    //   77: if_acmpne -> 83
    //   80: goto -> 502
    //   83: aload #10
    //   85: getstatic io/liteglue/SQLiteAndroidDatabase$QueryType.insert : Lio/liteglue/SQLiteAndroidDatabase$QueryType;
    //   88: if_acmpne -> 220
    //   91: aload_2
    //   92: ifnull -> 220
    //   95: aload_0
    //   96: getfield mydb : Landroid/database/sqlite/SQLiteDatabase;
    //   99: aload #18
    //   101: invokevirtual compileStatement : (Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;
    //   104: astore #10
    //   106: aload_0
    //   107: aload #10
    //   109: aload_2
    //   110: iload #5
    //   112: aaload
    //   113: invokespecial bindArgsToStatement : (Landroid/database/sqlite/SQLiteStatement;Lcom/facebook/react/bridge/ReadableArray;)V
    //   116: aload #10
    //   118: invokevirtual executeInsert : ()J
    //   121: lstore #8
    //   123: invokestatic createMap : ()Lcom/facebook/react/bridge/WritableMap;
    //   126: astore #10
    //   128: lload #8
    //   130: ldc2_w -1
    //   133: lcmp
    //   134: ifeq -> 164
    //   137: aload #10
    //   139: ldc_w 'insertId'
    //   142: lload #8
    //   144: l2d
    //   145: invokeinterface putDouble : (Ljava/lang/String;D)V
    //   150: aload #10
    //   152: ldc_w 'rowsAffected'
    //   155: iconst_1
    //   156: invokeinterface putInt : (Ljava/lang/String;I)V
    //   161: goto -> 175
    //   164: aload #10
    //   166: ldc_w 'rowsAffected'
    //   169: iconst_0
    //   170: invokeinterface putInt : (Ljava/lang/String;I)V
    //   175: goto -> 594
    //   178: astore #12
    //   180: aconst_null
    //   181: astore #11
    //   183: aload #11
    //   185: astore #10
    //   187: aload #12
    //   189: invokevirtual getMessage : ()Ljava/lang/String;
    //   192: astore #13
    //   194: aload #11
    //   196: astore #10
    //   198: getstatic io/liteglue/SQLitePlugin.TAG : Ljava/lang/String;
    //   201: ldc_w 'SQLiteDatabase.executeInsert() failed'
    //   204: aload #12
    //   206: invokestatic b : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   209: aload #11
    //   211: astore #10
    //   213: aload #13
    //   215: astore #12
    //   217: goto -> 318
    //   220: getstatic io/liteglue/SQLiteAndroidDatabase$QueryType.begin : Lio/liteglue/SQLiteAndroidDatabase$QueryType;
    //   223: astore #11
    //   225: aload #10
    //   227: aload #11
    //   229: if_acmpne -> 321
    //   232: aload_0
    //   233: getfield mydb : Landroid/database/sqlite/SQLiteDatabase;
    //   236: invokevirtual beginTransaction : ()V
    //   239: invokestatic createMap : ()Lcom/facebook/react/bridge/WritableMap;
    //   242: astore #11
    //   244: aload #11
    //   246: astore #10
    //   248: aload #11
    //   250: ldc_w 'rowsAffected'
    //   253: iconst_0
    //   254: invokeinterface putInt : (Ljava/lang/String;I)V
    //   259: aload #11
    //   261: astore #10
    //   263: goto -> 594
    //   266: astore #13
    //   268: goto -> 276
    //   271: astore #13
    //   273: aconst_null
    //   274: astore #11
    //   276: aload #11
    //   278: astore #10
    //   280: aload #13
    //   282: invokevirtual getMessage : ()Ljava/lang/String;
    //   285: astore #12
    //   287: aload #11
    //   289: astore #10
    //   291: getstatic io/liteglue/SQLitePlugin.TAG : Ljava/lang/String;
    //   294: astore #14
    //   296: ldc_w 'SQLiteDatabase.beginTransaction() failed'
    //   299: astore #15
    //   301: aload #11
    //   303: astore #10
    //   305: aload #14
    //   307: aload #15
    //   309: aload #13
    //   311: invokestatic b : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   314: aload #11
    //   316: astore #10
    //   318: goto -> 594
    //   321: getstatic io/liteglue/SQLiteAndroidDatabase$QueryType.commit : Lio/liteglue/SQLiteAndroidDatabase$QueryType;
    //   324: astore #11
    //   326: aload #10
    //   328: aload #11
    //   330: if_acmpne -> 412
    //   333: aload_0
    //   334: getfield mydb : Landroid/database/sqlite/SQLiteDatabase;
    //   337: invokevirtual setTransactionSuccessful : ()V
    //   340: aload_0
    //   341: getfield mydb : Landroid/database/sqlite/SQLiteDatabase;
    //   344: invokevirtual endTransaction : ()V
    //   347: invokestatic createMap : ()Lcom/facebook/react/bridge/WritableMap;
    //   350: astore #11
    //   352: aload #11
    //   354: astore #10
    //   356: aload #11
    //   358: ldc_w 'rowsAffected'
    //   361: iconst_0
    //   362: invokeinterface putInt : (Ljava/lang/String;I)V
    //   367: aload #11
    //   369: astore #10
    //   371: goto -> 594
    //   374: astore #13
    //   376: goto -> 384
    //   379: astore #13
    //   381: aconst_null
    //   382: astore #11
    //   384: aload #11
    //   386: astore #10
    //   388: aload #13
    //   390: invokevirtual getMessage : ()Ljava/lang/String;
    //   393: astore #12
    //   395: aload #11
    //   397: astore #10
    //   399: getstatic io/liteglue/SQLitePlugin.TAG : Ljava/lang/String;
    //   402: astore #14
    //   404: ldc_w 'SQLiteDatabase.setTransactionSuccessful/endTransaction() failed'
    //   407: astore #15
    //   409: goto -> 301
    //   412: getstatic io/liteglue/SQLiteAndroidDatabase$QueryType.rollback : Lio/liteglue/SQLiteAndroidDatabase$QueryType;
    //   415: astore #11
    //   417: aload #10
    //   419: aload #11
    //   421: if_acmpne -> 496
    //   424: aload_0
    //   425: getfield mydb : Landroid/database/sqlite/SQLiteDatabase;
    //   428: invokevirtual endTransaction : ()V
    //   431: invokestatic createMap : ()Lcom/facebook/react/bridge/WritableMap;
    //   434: astore #11
    //   436: aload #11
    //   438: astore #10
    //   440: aload #11
    //   442: ldc_w 'rowsAffected'
    //   445: iconst_0
    //   446: invokeinterface putInt : (Ljava/lang/String;I)V
    //   451: aload #11
    //   453: astore #10
    //   455: goto -> 594
    //   458: astore #13
    //   460: goto -> 468
    //   463: astore #13
    //   465: aconst_null
    //   466: astore #11
    //   468: aload #11
    //   470: astore #10
    //   472: aload #13
    //   474: invokevirtual getMessage : ()Ljava/lang/String;
    //   477: astore #12
    //   479: aload #11
    //   481: astore #10
    //   483: getstatic io/liteglue/SQLitePlugin.TAG : Ljava/lang/String;
    //   486: astore #14
    //   488: ldc_w 'SQLiteDatabase.endTransaction() failed'
    //   491: astore #15
    //   493: goto -> 301
    //   496: aconst_null
    //   497: astore #11
    //   499: goto -> 601
    //   502: aload_0
    //   503: getfield mydb : Landroid/database/sqlite/SQLiteDatabase;
    //   506: aload #18
    //   508: invokevirtual compileStatement : (Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;
    //   511: astore #10
    //   513: aload_2
    //   514: ifnull -> 527
    //   517: aload_0
    //   518: aload #10
    //   520: aload_2
    //   521: iload #5
    //   523: aaload
    //   524: invokespecial bindArgsToStatement : (Landroid/database/sqlite/SQLiteStatement;Lcom/facebook/react/bridge/ReadableArray;)V
    //   527: aload #10
    //   529: invokevirtual executeUpdateDelete : ()I
    //   532: istore #6
    //   534: goto -> 560
    //   537: astore #10
    //   539: aload #10
    //   541: invokevirtual getMessage : ()Ljava/lang/String;
    //   544: astore #12
    //   546: getstatic io/liteglue/SQLitePlugin.TAG : Ljava/lang/String;
    //   549: ldc_w 'SQLiteStatement.executeUpdateDelete() failed'
    //   552: aload #10
    //   554: invokestatic b : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   557: iconst_m1
    //   558: istore #6
    //   560: iload #6
    //   562: iconst_m1
    //   563: if_icmpeq -> 591
    //   566: invokestatic createMap : ()Lcom/facebook/react/bridge/WritableMap;
    //   569: astore #10
    //   571: aload #10
    //   573: ldc_w 'rowsAffected'
    //   576: iload #6
    //   578: invokeinterface putInt : (Ljava/lang/String;I)V
    //   583: goto -> 594
    //   586: astore #11
    //   588: goto -> 676
    //   591: aconst_null
    //   592: astore #10
    //   594: iconst_0
    //   595: istore #6
    //   597: aload #10
    //   599: astore #11
    //   601: aload #12
    //   603: astore #13
    //   605: aload #11
    //   607: astore #10
    //   609: iload #6
    //   611: ifeq -> 693
    //   614: aload #11
    //   616: astore #10
    //   618: aload_0
    //   619: getfield mydb : Landroid/database/sqlite/SQLiteDatabase;
    //   622: astore #14
    //   624: aload_2
    //   625: ifnull -> 851
    //   628: aload_2
    //   629: iload #5
    //   631: aaload
    //   632: astore #13
    //   634: goto -> 637
    //   637: aload #11
    //   639: astore #10
    //   641: aload_0
    //   642: aload #14
    //   644: aload #18
    //   646: aload #13
    //   648: aload #4
    //   650: invokespecial executeSqlStatementQuery : (Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;Lio/liteglue/CallbackContext;)Lcom/facebook/react/bridge/WritableMap;
    //   653: astore #11
    //   655: aload #12
    //   657: astore #13
    //   659: aload #11
    //   661: astore #10
    //   663: goto -> 693
    //   666: astore #11
    //   668: goto -> 676
    //   671: astore #11
    //   673: aconst_null
    //   674: astore #10
    //   676: aload #11
    //   678: invokevirtual getMessage : ()Ljava/lang/String;
    //   681: astore #13
    //   683: getstatic io/liteglue/SQLitePlugin.TAG : Ljava/lang/String;
    //   686: ldc 'SQLiteAndroidDatabase.executeSql[Batch]() failed'
    //   688: aload #11
    //   690: invokestatic b : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   693: aload #10
    //   695: ifnull -> 752
    //   698: invokestatic createMap : ()Lcom/facebook/react/bridge/WritableMap;
    //   701: astore #11
    //   703: aload #11
    //   705: ldc_w 'qid'
    //   708: aload #17
    //   710: invokeinterface putString : (Ljava/lang/String;Ljava/lang/String;)V
    //   715: aload #11
    //   717: ldc_w 'type'
    //   720: ldc_w 'success'
    //   723: invokeinterface putString : (Ljava/lang/String;Ljava/lang/String;)V
    //   728: aload #11
    //   730: ldc_w 'result'
    //   733: aload #10
    //   735: invokeinterface putMap : (Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V
    //   740: aload #16
    //   742: aload #11
    //   744: invokeinterface pushMap : (Lcom/facebook/react/bridge/ReadableMap;)V
    //   749: goto -> 820
    //   752: invokestatic createMap : ()Lcom/facebook/react/bridge/WritableMap;
    //   755: astore #10
    //   757: aload #10
    //   759: ldc_w 'qid'
    //   762: aload #17
    //   764: invokeinterface putString : (Ljava/lang/String;Ljava/lang/String;)V
    //   769: aload #10
    //   771: ldc_w 'type'
    //   774: ldc_w 'error'
    //   777: invokeinterface putString : (Ljava/lang/String;Ljava/lang/String;)V
    //   782: invokestatic createMap : ()Lcom/facebook/react/bridge/WritableMap;
    //   785: astore #11
    //   787: aload #11
    //   789: ldc_w 'message'
    //   792: aload #13
    //   794: invokeinterface putString : (Ljava/lang/String;Ljava/lang/String;)V
    //   799: aload #10
    //   801: ldc_w 'result'
    //   804: aload #11
    //   806: invokeinterface putMap : (Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V
    //   811: aload #16
    //   813: aload #10
    //   815: invokeinterface pushMap : (Lcom/facebook/react/bridge/ReadableMap;)V
    //   820: iload #5
    //   822: iconst_1
    //   823: iadd
    //   824: istore #5
    //   826: goto -> 27
    //   829: aload #4
    //   831: aload #16
    //   833: invokevirtual success : (Lcom/facebook/react/bridge/WritableArray;)V
    //   836: return
    //   837: astore #11
    //   839: goto -> 676
    //   842: astore #12
    //   844: aload #10
    //   846: astore #11
    //   848: goto -> 183
    //   851: aconst_null
    //   852: astore #13
    //   854: goto -> 637
    // Exception table:
    //   from	to	target	type
    //   50	62	671	java/lang/Exception
    //   72	80	671	java/lang/Exception
    //   83	91	671	java/lang/Exception
    //   95	116	671	java/lang/Exception
    //   116	128	178	android/database/sqlite/SQLiteException
    //   116	128	671	java/lang/Exception
    //   137	161	842	android/database/sqlite/SQLiteException
    //   137	161	837	java/lang/Exception
    //   164	175	842	android/database/sqlite/SQLiteException
    //   164	175	837	java/lang/Exception
    //   187	194	666	java/lang/Exception
    //   198	209	666	java/lang/Exception
    //   220	225	671	java/lang/Exception
    //   232	244	271	android/database/sqlite/SQLiteException
    //   232	244	671	java/lang/Exception
    //   248	259	266	android/database/sqlite/SQLiteException
    //   248	259	666	java/lang/Exception
    //   280	287	666	java/lang/Exception
    //   291	296	666	java/lang/Exception
    //   305	314	666	java/lang/Exception
    //   321	326	671	java/lang/Exception
    //   333	352	379	android/database/sqlite/SQLiteException
    //   333	352	671	java/lang/Exception
    //   356	367	374	android/database/sqlite/SQLiteException
    //   356	367	666	java/lang/Exception
    //   388	395	666	java/lang/Exception
    //   399	404	666	java/lang/Exception
    //   412	417	671	java/lang/Exception
    //   424	436	463	android/database/sqlite/SQLiteException
    //   424	436	671	java/lang/Exception
    //   440	451	458	android/database/sqlite/SQLiteException
    //   440	451	666	java/lang/Exception
    //   472	479	666	java/lang/Exception
    //   483	488	666	java/lang/Exception
    //   502	513	671	java/lang/Exception
    //   517	527	671	java/lang/Exception
    //   527	534	537	android/database/sqlite/SQLiteException
    //   527	534	671	java/lang/Exception
    //   539	557	671	java/lang/Exception
    //   566	571	671	java/lang/Exception
    //   571	583	586	java/lang/Exception
    //   618	624	666	java/lang/Exception
    //   641	655	666	java/lang/Exception
  }
  
  void open(File paramFile) {
    open(paramFile, 6);
  }
  
  void open(File paramFile, int paramInt) {
    this.dbFile = paramFile;
    this.openFlags = paramInt;
    this.mydb = SQLiteDatabase.openDatabase(paramFile.getAbsolutePath(), null, paramInt);
  }
  
  enum QueryType {
    begin, commit, delete, insert, other, rollback, select, update;
    
    static {
      delete = new QueryType("delete", 2);
      select = new QueryType("select", 3);
      begin = new QueryType("begin", 4);
      commit = new QueryType("commit", 5);
      rollback = new QueryType("rollback", 6);
      other = new QueryType("other", 7);
      $VALUES = new QueryType[] { update, insert, delete, select, begin, commit, rollback, other };
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/io/liteglue/SQLiteAndroidDatabase.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */