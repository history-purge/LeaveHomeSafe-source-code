package com.RNFetchBlob;

import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.RNFetchBlob.i.a;
import com.RNFetchBlob.i.b;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.io.IOException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.ConnectionPool;
import okhttp3.ConnectionSpec;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.TlsVersion;

public class g extends BroadcastReceiver implements Runnable {
  public static HashMap<String, Call> v = new HashMap<String, Call>();
  
  public static HashMap<String, Long> w = new HashMap<String, Long>();
  
  static HashMap<String, f> x = new HashMap<String, f>();
  
  static HashMap<String, f> y = new HashMap<String, f>();
  
  static ConnectionPool z = new ConnectionPool();
  
  b c;
  
  String d;
  
  String e;
  
  String f;
  
  String g;
  
  String h;
  
  ReadableArray i;
  
  ReadableMap j;
  
  Callback k;
  
  long l;
  
  long m;
  
  a n;
  
  e o;
  
  g p;
  
  f q;
  
  WritableMap r;
  
  boolean s;
  
  ArrayList<String> t;
  
  OkHttpClient u;
  
  public g(ReadableMap paramReadableMap1, String paramString1, String paramString2, String paramString3, ReadableMap paramReadableMap2, String paramString4, ReadableArray paramReadableArray, OkHttpClient paramOkHttpClient, Callback paramCallback) {
    g g1;
    e e1;
    this.q = f.c;
    this.s = false;
    this.t = new ArrayList<String>();
    this.e = paramString2.toUpperCase();
    this.c = new b(paramReadableMap1);
    this.d = paramString1;
    this.f = paramString3;
    this.j = paramReadableMap2;
    this.k = paramCallback;
    this.g = paramString4;
    this.i = paramReadableArray;
    this.u = paramOkHttpClient;
    if (this.c.a.booleanValue() || this.c.b != null) {
      g1 = g.d;
    } else {
      g1 = g.c;
    } 
    this.p = g1;
    if (paramString4 != null) {
      e1 = e.d;
    } else if (paramReadableArray != null) {
      e1 = e.c;
    } else {
      e1 = e.f;
    } 
    this.o = e1;
  }
  
  private WritableMap a(Response paramResponse, boolean paramBoolean) {
    WritableMap writableMap1 = Arguments.createMap();
    writableMap1.putInt("status", paramResponse.code());
    writableMap1.putString("state", "2");
    writableMap1.putString("taskId", this.d);
    writableMap1.putBoolean("timeout", this.s);
    WritableMap writableMap2 = Arguments.createMap();
    for (int i = 0; i < paramResponse.headers().size(); i++)
      writableMap2.putString(paramResponse.headers().name(i), paramResponse.headers().value(i)); 
    WritableArray writableArray = Arguments.createArray();
    Iterator<String> iterator = this.t.iterator();
    while (iterator.hasNext())
      writableArray.pushString(iterator.next()); 
    writableMap1.putArray("redirects", (ReadableArray)writableArray);
    writableMap1.putMap("headers", (ReadableMap)writableMap2);
    Headers headers = paramResponse.headers();
    if (paramBoolean) {
      str = "blob";
      writableMap1.putString("respType", str);
      return writableMap1;
    } 
    if (a((Headers)str, "content-type").equalsIgnoreCase("text/")) {
      str = "text";
      writableMap1.putString("respType", str);
      return writableMap1;
    } 
    if (a((Headers)str, "content-type").contains("application/json")) {
      str = "json";
      writableMap1.putString("respType", str);
      return writableMap1;
    } 
    String str = "";
    writableMap1.putString("respType", str);
    return writableMap1;
  }
  
  private String a(HashMap<String, String> paramHashMap, String paramString) {
    String str2 = paramHashMap.get(paramString);
    if (str2 != null)
      return str2; 
    paramString = paramHashMap.get(paramString.toLowerCase());
    String str1 = paramString;
    if (paramString == null)
      str1 = ""; 
    return str1;
  }
  
  private String a(Headers paramHeaders, String paramString) {
    String str = paramHeaders.get(paramString);
    return (str != null) ? str : ((paramHeaders.get(paramString.toLowerCase()) == null) ? "" : paramHeaders.get(paramString.toLowerCase()));
  }
  
  public static OkHttpClient.Builder a(OkHttpClient.Builder paramBuilder) {
    int i = Build.VERSION.SDK_INT;
    if (i >= 16 && i <= 19)
      try {
        ConnectionSpec connectionSpec;
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore)null);
        TrustManager[] arrayOfTrustManager = trustManagerFactory.getTrustManagers();
        if (arrayOfTrustManager.length == 1 && arrayOfTrustManager[0] instanceof X509TrustManager) {
          X509TrustManager x509TrustManager = (X509TrustManager)arrayOfTrustManager[0];
          SSLContext sSLContext = SSLContext.getInstance("SSL");
          sSLContext.init(null, new TrustManager[] { x509TrustManager }, null);
          paramBuilder.sslSocketFactory(sSLContext.getSocketFactory(), x509TrustManager);
          connectionSpec = (new ConnectionSpec.Builder(ConnectionSpec.MODERN_TLS)).tlsVersions(new TlsVersion[] { TlsVersion.TLS_1_2 }).build();
          ArrayList<ConnectionSpec> arrayList = new ArrayList();
          arrayList.add(connectionSpec);
          arrayList.add(ConnectionSpec.COMPATIBLE_TLS);
          arrayList.add(ConnectionSpec.CLEARTEXT);
          paramBuilder.connectionSpecs(arrayList);
          return paramBuilder;
        } 
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unexpected default trust managers:");
        stringBuilder.append(Arrays.toString((Object[])connectionSpec));
        throw new IllegalStateException(stringBuilder.toString());
      } catch (Exception exception) {
        e.e.e.e.a.b("OkHttpClientProvider", "Error while enabling TLS 1.2", exception);
      }  
    return paramBuilder;
  }
  
  private void a() {
    if (v.containsKey(this.d))
      v.remove(this.d); 
    if (w.containsKey(this.d))
      w.remove(this.d); 
    if (y.containsKey(this.d))
      y.remove(this.d); 
    if (x.containsKey(this.d))
      x.remove(this.d); 
    a a1 = this.n;
    if (a1 != null)
      a1.a(); 
  }
  
  private void a(WritableMap paramWritableMap) {
    ((DeviceEventManagerModule.RCTDeviceEventEmitter)RNFetchBlob.RCTContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("RNFetchBlobState", paramWritableMap);
  }
  
  public static void a(String paramString) {
    if (v.containsKey(paramString)) {
      ((Call)v.get(paramString)).cancel();
      v.remove(paramString);
    } 
    if (w.containsKey(paramString)) {
      long l = ((Long)w.get(paramString)).longValue();
      ((DownloadManager)RNFetchBlob.RCTContext.getApplicationContext().getSystemService("download")).remove(new long[] { l });
    } 
  }
  
  private void a(Response paramResponse) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokespecial b : (Lokhttp3/Response;)Z
    //   5: istore #4
    //   7: aload_0
    //   8: aload_0
    //   9: aload_1
    //   10: iload #4
    //   12: invokespecial a : (Lokhttp3/Response;Z)Lcom/facebook/react/bridge/WritableMap;
    //   15: invokespecial a : (Lcom/facebook/react/bridge/WritableMap;)V
    //   18: getstatic com/RNFetchBlob/g$d.b : [I
    //   21: aload_0
    //   22: getfield p : Lcom/RNFetchBlob/g$g;
    //   25: invokevirtual ordinal : ()I
    //   28: iaload
    //   29: istore_2
    //   30: iload_2
    //   31: iconst_1
    //   32: if_icmpeq -> 366
    //   35: iload_2
    //   36: iconst_2
    //   37: if_icmpeq -> 112
    //   40: aload_0
    //   41: getfield k : Lcom/facebook/react/bridge/Callback;
    //   44: iconst_3
    //   45: anewarray java/lang/Object
    //   48: dup
    //   49: iconst_0
    //   50: aconst_null
    //   51: aastore
    //   52: dup
    //   53: iconst_1
    //   54: ldc_w 'utf8'
    //   57: aastore
    //   58: dup
    //   59: iconst_2
    //   60: new java/lang/String
    //   63: dup
    //   64: aload_1
    //   65: invokevirtual body : ()Lokhttp3/ResponseBody;
    //   68: invokevirtual bytes : ()[B
    //   71: ldc_w 'UTF-8'
    //   74: invokespecial <init> : ([BLjava/lang/String;)V
    //   77: aastore
    //   78: invokeinterface invoke : ([Ljava/lang/Object;)V
    //   83: goto -> 735
    //   86: aload_0
    //   87: getfield k : Lcom/facebook/react/bridge/Callback;
    //   90: iconst_2
    //   91: anewarray java/lang/Object
    //   94: dup
    //   95: iconst_0
    //   96: ldc_w 'RNFetchBlob failed to encode response data to UTF8 string.'
    //   99: aastore
    //   100: dup
    //   101: iconst_1
    //   102: aconst_null
    //   103: aastore
    //   104: invokeinterface invoke : ([Ljava/lang/Object;)V
    //   109: goto -> 735
    //   112: aload_1
    //   113: invokevirtual body : ()Lokhttp3/ResponseBody;
    //   116: astore #5
    //   118: aload #5
    //   120: invokevirtual bytes : ()[B
    //   123: pop
    //   124: aload #5
    //   126: checkcast com/RNFetchBlob/i/b
    //   129: astore #6
    //   131: aload #6
    //   133: ifnull -> 170
    //   136: aload #6
    //   138: invokevirtual a : ()Z
    //   141: ifne -> 170
    //   144: aload_0
    //   145: getfield k : Lcom/facebook/react/bridge/Callback;
    //   148: iconst_2
    //   149: anewarray java/lang/Object
    //   152: dup
    //   153: iconst_0
    //   154: ldc_w 'Download interrupted.'
    //   157: aastore
    //   158: dup
    //   159: iconst_1
    //   160: aconst_null
    //   161: aastore
    //   162: invokeinterface invoke : ([Ljava/lang/Object;)V
    //   167: goto -> 735
    //   170: aload_0
    //   171: aload_0
    //   172: getfield h : Ljava/lang/String;
    //   175: ldc_w '?append=true'
    //   178: ldc_w ''
    //   181: invokevirtual replace : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   184: putfield h : Ljava/lang/String;
    //   187: aload_0
    //   188: getfield k : Lcom/facebook/react/bridge/Callback;
    //   191: iconst_3
    //   192: anewarray java/lang/Object
    //   195: dup
    //   196: iconst_0
    //   197: aconst_null
    //   198: aastore
    //   199: dup
    //   200: iconst_1
    //   201: ldc_w 'path'
    //   204: aastore
    //   205: dup
    //   206: iconst_2
    //   207: aload_0
    //   208: getfield h : Ljava/lang/String;
    //   211: aastore
    //   212: invokeinterface invoke : ([Ljava/lang/Object;)V
    //   217: goto -> 735
    //   220: aload #5
    //   222: ifnull -> 342
    //   225: aload #5
    //   227: invokevirtual source : ()Lj/e;
    //   230: invokeinterface f : ()Lj/c;
    //   235: invokevirtual s : ()J
    //   238: lconst_0
    //   239: lcmp
    //   240: ifle -> 771
    //   243: iconst_1
    //   244: istore_2
    //   245: goto -> 248
    //   248: aload #5
    //   250: invokevirtual contentLength : ()J
    //   253: lconst_0
    //   254: lcmp
    //   255: ifle -> 776
    //   258: iconst_1
    //   259: istore_3
    //   260: goto -> 263
    //   263: iload_2
    //   264: ifeq -> 285
    //   267: iload_3
    //   268: ifeq -> 285
    //   271: aload #5
    //   273: invokevirtual string : ()Ljava/lang/String;
    //   276: astore_1
    //   277: goto -> 287
    //   280: astore_1
    //   281: aload_1
    //   282: invokevirtual printStackTrace : ()V
    //   285: aconst_null
    //   286: astore_1
    //   287: aload_0
    //   288: getfield k : Lcom/facebook/react/bridge/Callback;
    //   291: astore #5
    //   293: new java/lang/StringBuilder
    //   296: dup
    //   297: invokespecial <init> : ()V
    //   300: astore #6
    //   302: aload #6
    //   304: ldc_w 'Unexpected FileStorage response file: '
    //   307: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   310: pop
    //   311: aload #6
    //   313: aload_1
    //   314: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   317: pop
    //   318: aload #5
    //   320: iconst_2
    //   321: anewarray java/lang/Object
    //   324: dup
    //   325: iconst_0
    //   326: aload #6
    //   328: invokevirtual toString : ()Ljava/lang/String;
    //   331: aastore
    //   332: dup
    //   333: iconst_1
    //   334: aconst_null
    //   335: aastore
    //   336: invokeinterface invoke : ([Ljava/lang/Object;)V
    //   341: return
    //   342: aload_0
    //   343: getfield k : Lcom/facebook/react/bridge/Callback;
    //   346: iconst_2
    //   347: anewarray java/lang/Object
    //   350: dup
    //   351: iconst_0
    //   352: ldc_w 'Unexpected FileStorage response with no file.'
    //   355: aastore
    //   356: dup
    //   357: iconst_1
    //   358: aconst_null
    //   359: aastore
    //   360: invokeinterface invoke : ([Ljava/lang/Object;)V
    //   365: return
    //   366: iload #4
    //   368: ifeq -> 498
    //   371: aload_0
    //   372: getfield c : Lcom/RNFetchBlob/b;
    //   375: getfield h : Ljava/lang/Boolean;
    //   378: invokevirtual booleanValue : ()Z
    //   381: ifeq -> 498
    //   384: aload_0
    //   385: getfield d : Ljava/lang/String;
    //   388: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   391: astore #5
    //   393: aload_1
    //   394: invokevirtual body : ()Lokhttp3/ResponseBody;
    //   397: invokevirtual byteStream : ()Ljava/io/InputStream;
    //   400: astore #6
    //   402: new java/io/FileOutputStream
    //   405: dup
    //   406: new java/io/File
    //   409: dup
    //   410: aload #5
    //   412: invokespecial <init> : (Ljava/lang/String;)V
    //   415: invokespecial <init> : (Ljava/io/File;)V
    //   418: astore #7
    //   420: sipush #10240
    //   423: newarray byte
    //   425: astore #8
    //   427: aload #6
    //   429: aload #8
    //   431: invokevirtual read : ([B)I
    //   434: istore_2
    //   435: iload_2
    //   436: iconst_m1
    //   437: if_icmpeq -> 452
    //   440: aload #7
    //   442: aload #8
    //   444: iconst_0
    //   445: iload_2
    //   446: invokevirtual write : ([BII)V
    //   449: goto -> 427
    //   452: aload #6
    //   454: invokevirtual close : ()V
    //   457: aload #7
    //   459: invokevirtual flush : ()V
    //   462: aload #7
    //   464: invokevirtual close : ()V
    //   467: aload_0
    //   468: getfield k : Lcom/facebook/react/bridge/Callback;
    //   471: iconst_3
    //   472: anewarray java/lang/Object
    //   475: dup
    //   476: iconst_0
    //   477: aconst_null
    //   478: aastore
    //   479: dup
    //   480: iconst_1
    //   481: ldc_w 'path'
    //   484: aastore
    //   485: dup
    //   486: iconst_2
    //   487: aload #5
    //   489: aastore
    //   490: invokeinterface invoke : ([Ljava/lang/Object;)V
    //   495: goto -> 735
    //   498: aload_1
    //   499: invokevirtual body : ()Lokhttp3/ResponseBody;
    //   502: invokevirtual bytes : ()[B
    //   505: astore #5
    //   507: ldc_w 'UTF-8'
    //   510: invokestatic forName : (Ljava/lang/String;)Ljava/nio/charset/Charset;
    //   513: invokevirtual newEncoder : ()Ljava/nio/charset/CharsetEncoder;
    //   516: astore #6
    //   518: aload_0
    //   519: getfield q : Lcom/RNFetchBlob/g$f;
    //   522: astore #7
    //   524: getstatic com/RNFetchBlob/g$f.e : Lcom/RNFetchBlob/g$f;
    //   527: astore #8
    //   529: aload #7
    //   531: aload #8
    //   533: if_acmpne -> 569
    //   536: aload_0
    //   537: getfield k : Lcom/facebook/react/bridge/Callback;
    //   540: iconst_3
    //   541: anewarray java/lang/Object
    //   544: dup
    //   545: iconst_0
    //   546: aconst_null
    //   547: aastore
    //   548: dup
    //   549: iconst_1
    //   550: ldc_w 'base64'
    //   553: aastore
    //   554: dup
    //   555: iconst_2
    //   556: aload #5
    //   558: iconst_2
    //   559: invokestatic encodeToString : ([BI)Ljava/lang/String;
    //   562: aastore
    //   563: invokeinterface invoke : ([Ljava/lang/Object;)V
    //   568: return
    //   569: aload #6
    //   571: aload #5
    //   573: invokestatic wrap : ([B)Ljava/nio/ByteBuffer;
    //   576: invokevirtual asCharBuffer : ()Ljava/nio/CharBuffer;
    //   579: invokevirtual encode : (Ljava/nio/CharBuffer;)Ljava/nio/ByteBuffer;
    //   582: pop
    //   583: new java/lang/String
    //   586: dup
    //   587: aload #5
    //   589: invokespecial <init> : ([B)V
    //   592: astore #6
    //   594: aload_0
    //   595: getfield k : Lcom/facebook/react/bridge/Callback;
    //   598: iconst_3
    //   599: anewarray java/lang/Object
    //   602: dup
    //   603: iconst_0
    //   604: aconst_null
    //   605: aastore
    //   606: dup
    //   607: iconst_1
    //   608: ldc_w 'utf8'
    //   611: aastore
    //   612: dup
    //   613: iconst_2
    //   614: aload #6
    //   616: aastore
    //   617: invokeinterface invoke : ([Ljava/lang/Object;)V
    //   622: goto -> 735
    //   625: aload_0
    //   626: getfield q : Lcom/RNFetchBlob/g$f;
    //   629: getstatic com/RNFetchBlob/g$f.d : Lcom/RNFetchBlob/g$f;
    //   632: if_acmpne -> 677
    //   635: new java/lang/String
    //   638: dup
    //   639: aload #5
    //   641: invokespecial <init> : ([B)V
    //   644: astore #5
    //   646: aload_0
    //   647: getfield k : Lcom/facebook/react/bridge/Callback;
    //   650: iconst_3
    //   651: anewarray java/lang/Object
    //   654: dup
    //   655: iconst_0
    //   656: aconst_null
    //   657: aastore
    //   658: dup
    //   659: iconst_1
    //   660: ldc_w 'utf8'
    //   663: aastore
    //   664: dup
    //   665: iconst_2
    //   666: aload #5
    //   668: aastore
    //   669: invokeinterface invoke : ([Ljava/lang/Object;)V
    //   674: goto -> 735
    //   677: aload_0
    //   678: getfield k : Lcom/facebook/react/bridge/Callback;
    //   681: iconst_3
    //   682: anewarray java/lang/Object
    //   685: dup
    //   686: iconst_0
    //   687: aconst_null
    //   688: aastore
    //   689: dup
    //   690: iconst_1
    //   691: ldc_w 'base64'
    //   694: aastore
    //   695: dup
    //   696: iconst_2
    //   697: aload #5
    //   699: iconst_2
    //   700: invokestatic encodeToString : ([BI)Ljava/lang/String;
    //   703: aastore
    //   704: invokeinterface invoke : ([Ljava/lang/Object;)V
    //   709: goto -> 735
    //   712: aload_0
    //   713: getfield k : Lcom/facebook/react/bridge/Callback;
    //   716: iconst_2
    //   717: anewarray java/lang/Object
    //   720: dup
    //   721: iconst_0
    //   722: ldc_w 'RNFetchBlob failed to encode response data to BASE64 string.'
    //   725: aastore
    //   726: dup
    //   727: iconst_1
    //   728: aconst_null
    //   729: aastore
    //   730: invokeinterface invoke : ([Ljava/lang/Object;)V
    //   735: aload_1
    //   736: invokevirtual body : ()Lokhttp3/ResponseBody;
    //   739: invokevirtual close : ()V
    //   742: aload_0
    //   743: invokespecial a : ()V
    //   746: return
    //   747: astore #5
    //   749: goto -> 86
    //   752: astore #6
    //   754: goto -> 124
    //   757: astore_1
    //   758: goto -> 220
    //   761: astore #5
    //   763: goto -> 712
    //   766: astore #6
    //   768: goto -> 625
    //   771: iconst_0
    //   772: istore_2
    //   773: goto -> 248
    //   776: iconst_0
    //   777: istore_3
    //   778: goto -> 263
    // Exception table:
    //   from	to	target	type
    //   40	83	747	java/io/IOException
    //   118	124	752	java/lang/Exception
    //   124	131	757	java/lang/ClassCastException
    //   225	243	280	java/io/IOException
    //   248	258	280	java/io/IOException
    //   271	277	280	java/io/IOException
    //   371	427	761	java/io/IOException
    //   427	435	761	java/io/IOException
    //   440	449	761	java/io/IOException
    //   452	495	761	java/io/IOException
    //   498	529	761	java/io/IOException
    //   536	568	761	java/io/IOException
    //   569	622	766	java/nio/charset/CharacterCodingException
    //   569	622	761	java/io/IOException
    //   625	674	761	java/io/IOException
    //   677	709	761	java/io/IOException
  }
  
  public static f b(String paramString) {
    return !x.containsKey(paramString) ? null : x.get(paramString);
  }
  
  private boolean b(Response paramResponse) {
    String str = a(paramResponse.headers(), "Content-Type");
    boolean bool3 = str.equalsIgnoreCase("text/");
    boolean bool2 = true;
    boolean bool4 = str.equalsIgnoreCase("application/json");
    if (this.c.m != null)
      for (int i = 0; i < this.c.m.size(); i++) {
        if (str.toLowerCase().contains(this.c.m.getString(i).toLowerCase())) {
          i = 1;
          // Byte code: goto -> 99
        } 
      }  
    boolean bool1 = false;
    if ((bool4 ^ true) != 0 || (bool3 ^ true) != 0) {
      if (bool1)
        return true; 
      bool2 = false;
    } 
    return bool2;
  }
  
  public static f c(String paramString) {
    return !y.containsKey(paramString) ? null : y.get(paramString);
  }
  
  public void onReceive(Context paramContext, Intent paramIntent) {
    // Byte code:
    //   0: ldc_w 'android.intent.action.DOWNLOAD_COMPLETE'
    //   3: aload_2
    //   4: invokevirtual getAction : ()Ljava/lang/String;
    //   7: invokevirtual equals : (Ljava/lang/Object;)Z
    //   10: ifeq -> 605
    //   13: getstatic com/RNFetchBlob/RNFetchBlob.RCTContext : Lcom/facebook/react/bridge/ReactApplicationContext;
    //   16: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   19: astore_1
    //   20: aload_2
    //   21: invokevirtual getExtras : ()Landroid/os/Bundle;
    //   24: ldc_w 'extra_download_id'
    //   27: invokevirtual getLong : (Ljava/lang/String;)J
    //   30: aload_0
    //   31: getfield m : J
    //   34: lcmp
    //   35: ifne -> 605
    //   38: aload_0
    //   39: invokespecial a : ()V
    //   42: new android/app/DownloadManager$Query
    //   45: dup
    //   46: invokespecial <init> : ()V
    //   49: astore_2
    //   50: aload_2
    //   51: iconst_1
    //   52: newarray long
    //   54: dup
    //   55: iconst_0
    //   56: aload_0
    //   57: getfield m : J
    //   60: lastore
    //   61: invokevirtual setFilterById : ([J)Landroid/app/DownloadManager$Query;
    //   64: pop
    //   65: aload_1
    //   66: ldc_w 'download'
    //   69: invokevirtual getSystemService : (Ljava/lang/String;)Ljava/lang/Object;
    //   72: checkcast android/app/DownloadManager
    //   75: astore #4
    //   77: aload #4
    //   79: aload_2
    //   80: invokevirtual query : (Landroid/app/DownloadManager$Query;)Landroid/database/Cursor;
    //   83: pop
    //   84: aload #4
    //   86: aload_2
    //   87: invokevirtual query : (Landroid/app/DownloadManager$Query;)Landroid/database/Cursor;
    //   90: astore_2
    //   91: aload_2
    //   92: ifnonnull -> 159
    //   95: aload_0
    //   96: getfield k : Lcom/facebook/react/bridge/Callback;
    //   99: astore_1
    //   100: new java/lang/StringBuilder
    //   103: dup
    //   104: invokespecial <init> : ()V
    //   107: astore_2
    //   108: aload_2
    //   109: ldc_w 'Download manager failed to download from  '
    //   112: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   115: pop
    //   116: aload_2
    //   117: aload_0
    //   118: getfield f : Ljava/lang/String;
    //   121: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   124: pop
    //   125: aload_2
    //   126: ldc_w '. Query was unsuccessful '
    //   129: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   132: pop
    //   133: aload_1
    //   134: iconst_3
    //   135: anewarray java/lang/Object
    //   138: dup
    //   139: iconst_0
    //   140: aload_2
    //   141: invokevirtual toString : ()Ljava/lang/String;
    //   144: aastore
    //   145: dup
    //   146: iconst_1
    //   147: aconst_null
    //   148: aastore
    //   149: dup
    //   150: iconst_2
    //   151: aconst_null
    //   152: aastore
    //   153: invokeinterface invoke : ([Ljava/lang/Object;)V
    //   158: return
    //   159: aload_2
    //   160: invokeinterface moveToFirst : ()Z
    //   165: ifeq -> 402
    //   168: aload_2
    //   169: aload_2
    //   170: ldc 'status'
    //   172: invokeinterface getColumnIndex : (Ljava/lang/String;)I
    //   177: invokeinterface getInt : (I)I
    //   182: istore_3
    //   183: iload_3
    //   184: bipush #16
    //   186: if_icmpne -> 275
    //   189: aload_0
    //   190: getfield k : Lcom/facebook/react/bridge/Callback;
    //   193: astore_1
    //   194: new java/lang/StringBuilder
    //   197: dup
    //   198: invokespecial <init> : ()V
    //   201: astore #4
    //   203: aload #4
    //   205: ldc_w 'Download manager failed to download from  '
    //   208: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   211: pop
    //   212: aload #4
    //   214: aload_0
    //   215: getfield f : Ljava/lang/String;
    //   218: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   221: pop
    //   222: aload #4
    //   224: ldc_w '. Status Code = '
    //   227: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   230: pop
    //   231: aload #4
    //   233: iload_3
    //   234: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   237: pop
    //   238: aload_1
    //   239: iconst_3
    //   240: anewarray java/lang/Object
    //   243: dup
    //   244: iconst_0
    //   245: aload #4
    //   247: invokevirtual toString : ()Ljava/lang/String;
    //   250: aastore
    //   251: dup
    //   252: iconst_1
    //   253: aconst_null
    //   254: aastore
    //   255: dup
    //   256: iconst_2
    //   257: aconst_null
    //   258: aastore
    //   259: invokeinterface invoke : ([Ljava/lang/Object;)V
    //   264: aload_2
    //   265: ifnull -> 274
    //   268: aload_2
    //   269: invokeinterface close : ()V
    //   274: return
    //   275: aload_2
    //   276: aload_2
    //   277: ldc_w 'local_uri'
    //   280: invokeinterface getColumnIndex : (Ljava/lang/String;)I
    //   285: invokeinterface getString : (I)Ljava/lang/String;
    //   290: astore #4
    //   292: aload #4
    //   294: ifnull -> 402
    //   297: aload_0
    //   298: getfield c : Lcom/RNFetchBlob/b;
    //   301: getfield d : Lcom/facebook/react/bridge/ReadableMap;
    //   304: ldc_w 'mime'
    //   307: invokeinterface hasKey : (Ljava/lang/String;)Z
    //   312: ifeq -> 402
    //   315: aload_0
    //   316: getfield c : Lcom/RNFetchBlob/b;
    //   319: getfield d : Lcom/facebook/react/bridge/ReadableMap;
    //   322: ldc_w 'mime'
    //   325: invokeinterface getString : (Ljava/lang/String;)Ljava/lang/String;
    //   330: ldc_w 'image'
    //   333: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   336: ifeq -> 402
    //   339: aload #4
    //   341: invokestatic parse : (Ljava/lang/String;)Landroid/net/Uri;
    //   344: astore #4
    //   346: aload_1
    //   347: invokevirtual getContentResolver : ()Landroid/content/ContentResolver;
    //   350: aload #4
    //   352: iconst_1
    //   353: anewarray java/lang/String
    //   356: dup
    //   357: iconst_0
    //   358: ldc_w '_data'
    //   361: aastore
    //   362: aconst_null
    //   363: aconst_null
    //   364: aconst_null
    //   365: invokevirtual query : (Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   368: astore #4
    //   370: aload #4
    //   372: ifnull -> 402
    //   375: aload #4
    //   377: invokeinterface moveToFirst : ()Z
    //   382: pop
    //   383: aload #4
    //   385: iconst_0
    //   386: invokeinterface getString : (I)Ljava/lang/String;
    //   391: astore_1
    //   392: aload #4
    //   394: invokeinterface close : ()V
    //   399: goto -> 404
    //   402: aconst_null
    //   403: astore_1
    //   404: aload_2
    //   405: ifnull -> 414
    //   408: aload_2
    //   409: invokeinterface close : ()V
    //   414: aload_0
    //   415: getfield c : Lcom/RNFetchBlob/b;
    //   418: getfield d : Lcom/facebook/react/bridge/ReadableMap;
    //   421: ldc_w 'path'
    //   424: invokeinterface hasKey : (Ljava/lang/String;)Z
    //   429: ifeq -> 531
    //   432: aload_0
    //   433: getfield c : Lcom/RNFetchBlob/b;
    //   436: getfield d : Lcom/facebook/react/bridge/ReadableMap;
    //   439: ldc_w 'path'
    //   442: invokeinterface getString : (Ljava/lang/String;)Ljava/lang/String;
    //   447: astore_1
    //   448: new java/io/File
    //   451: dup
    //   452: aload_1
    //   453: invokespecial <init> : (Ljava/lang/String;)V
    //   456: invokevirtual exists : ()Z
    //   459: ifeq -> 490
    //   462: aload_0
    //   463: getfield k : Lcom/facebook/react/bridge/Callback;
    //   466: iconst_3
    //   467: anewarray java/lang/Object
    //   470: dup
    //   471: iconst_0
    //   472: aconst_null
    //   473: aastore
    //   474: dup
    //   475: iconst_1
    //   476: ldc_w 'path'
    //   479: aastore
    //   480: dup
    //   481: iconst_2
    //   482: aload_1
    //   483: aastore
    //   484: invokeinterface invoke : ([Ljava/lang/Object;)V
    //   489: return
    //   490: new java/lang/Exception
    //   493: dup
    //   494: ldc_w 'Download manager download failed, the file does not downloaded to destination.'
    //   497: invokespecial <init> : (Ljava/lang/String;)V
    //   500: athrow
    //   501: astore_1
    //   502: aload_1
    //   503: invokevirtual printStackTrace : ()V
    //   506: aload_0
    //   507: getfield k : Lcom/facebook/react/bridge/Callback;
    //   510: iconst_2
    //   511: anewarray java/lang/Object
    //   514: dup
    //   515: iconst_0
    //   516: aload_1
    //   517: invokevirtual getLocalizedMessage : ()Ljava/lang/String;
    //   520: aastore
    //   521: dup
    //   522: iconst_1
    //   523: aconst_null
    //   524: aastore
    //   525: invokeinterface invoke : ([Ljava/lang/Object;)V
    //   530: return
    //   531: aload_0
    //   532: getfield k : Lcom/facebook/react/bridge/Callback;
    //   535: astore_2
    //   536: aload_1
    //   537: ifnonnull -> 567
    //   540: aload_2
    //   541: iconst_3
    //   542: anewarray java/lang/Object
    //   545: dup
    //   546: iconst_0
    //   547: ldc_w 'Download manager could not resolve downloaded file path.'
    //   550: aastore
    //   551: dup
    //   552: iconst_1
    //   553: ldc_w 'path'
    //   556: aastore
    //   557: dup
    //   558: iconst_2
    //   559: aconst_null
    //   560: aastore
    //   561: invokeinterface invoke : ([Ljava/lang/Object;)V
    //   566: return
    //   567: aload_2
    //   568: iconst_3
    //   569: anewarray java/lang/Object
    //   572: dup
    //   573: iconst_0
    //   574: aconst_null
    //   575: aastore
    //   576: dup
    //   577: iconst_1
    //   578: ldc_w 'path'
    //   581: aastore
    //   582: dup
    //   583: iconst_2
    //   584: aload_1
    //   585: aastore
    //   586: invokeinterface invoke : ([Ljava/lang/Object;)V
    //   591: return
    //   592: astore_1
    //   593: aload_2
    //   594: ifnull -> 603
    //   597: aload_2
    //   598: invokeinterface close : ()V
    //   603: aload_1
    //   604: athrow
    //   605: return
    // Exception table:
    //   from	to	target	type
    //   159	183	592	finally
    //   189	264	592	finally
    //   275	292	592	finally
    //   297	370	592	finally
    //   375	399	592	finally
    //   432	489	501	java/lang/Exception
    //   490	501	501	java/lang/Exception
  }
  
  public void run() {
    // Byte code:
    //   0: aload_0
    //   1: getfield c : Lcom/RNFetchBlob/b;
    //   4: getfield d : Lcom/facebook/react/bridge/ReadableMap;
    //   7: astore #4
    //   9: aload #4
    //   11: ifnull -> 459
    //   14: aload #4
    //   16: ldc_w 'useDownloadManager'
    //   19: invokeinterface hasKey : (Ljava/lang/String;)Z
    //   24: ifeq -> 459
    //   27: aload_0
    //   28: getfield c : Lcom/RNFetchBlob/b;
    //   31: getfield d : Lcom/facebook/react/bridge/ReadableMap;
    //   34: ldc_w 'useDownloadManager'
    //   37: invokeinterface getBoolean : (Ljava/lang/String;)Z
    //   42: ifeq -> 459
    //   45: new android/app/DownloadManager$Request
    //   48: dup
    //   49: aload_0
    //   50: getfield f : Ljava/lang/String;
    //   53: invokestatic parse : (Ljava/lang/String;)Landroid/net/Uri;
    //   56: invokespecial <init> : (Landroid/net/Uri;)V
    //   59: astore #4
    //   61: aload_0
    //   62: getfield c : Lcom/RNFetchBlob/b;
    //   65: getfield d : Lcom/facebook/react/bridge/ReadableMap;
    //   68: ldc_w 'notification'
    //   71: invokeinterface hasKey : (Ljava/lang/String;)Z
    //   76: ifeq -> 107
    //   79: aload_0
    //   80: getfield c : Lcom/RNFetchBlob/b;
    //   83: getfield d : Lcom/facebook/react/bridge/ReadableMap;
    //   86: ldc_w 'notification'
    //   89: invokeinterface getBoolean : (Ljava/lang/String;)Z
    //   94: ifeq -> 107
    //   97: aload #4
    //   99: iconst_1
    //   100: invokevirtual setNotificationVisibility : (I)Landroid/app/DownloadManager$Request;
    //   103: pop
    //   104: goto -> 114
    //   107: aload #4
    //   109: iconst_2
    //   110: invokevirtual setNotificationVisibility : (I)Landroid/app/DownloadManager$Request;
    //   113: pop
    //   114: aload_0
    //   115: getfield c : Lcom/RNFetchBlob/b;
    //   118: getfield d : Lcom/facebook/react/bridge/ReadableMap;
    //   121: ldc_w 'title'
    //   124: invokeinterface hasKey : (Ljava/lang/String;)Z
    //   129: ifeq -> 153
    //   132: aload #4
    //   134: aload_0
    //   135: getfield c : Lcom/RNFetchBlob/b;
    //   138: getfield d : Lcom/facebook/react/bridge/ReadableMap;
    //   141: ldc_w 'title'
    //   144: invokeinterface getString : (Ljava/lang/String;)Ljava/lang/String;
    //   149: invokevirtual setTitle : (Ljava/lang/CharSequence;)Landroid/app/DownloadManager$Request;
    //   152: pop
    //   153: aload_0
    //   154: getfield c : Lcom/RNFetchBlob/b;
    //   157: getfield d : Lcom/facebook/react/bridge/ReadableMap;
    //   160: ldc_w 'description'
    //   163: invokeinterface hasKey : (Ljava/lang/String;)Z
    //   168: ifeq -> 192
    //   171: aload #4
    //   173: aload_0
    //   174: getfield c : Lcom/RNFetchBlob/b;
    //   177: getfield d : Lcom/facebook/react/bridge/ReadableMap;
    //   180: ldc_w 'description'
    //   183: invokeinterface getString : (Ljava/lang/String;)Ljava/lang/String;
    //   188: invokevirtual setDescription : (Ljava/lang/CharSequence;)Landroid/app/DownloadManager$Request;
    //   191: pop
    //   192: aload_0
    //   193: getfield c : Lcom/RNFetchBlob/b;
    //   196: getfield d : Lcom/facebook/react/bridge/ReadableMap;
    //   199: ldc_w 'path'
    //   202: invokeinterface hasKey : (Ljava/lang/String;)Z
    //   207: ifeq -> 263
    //   210: new java/lang/StringBuilder
    //   213: dup
    //   214: invokespecial <init> : ()V
    //   217: astore #5
    //   219: aload #5
    //   221: ldc_w 'file://'
    //   224: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   227: pop
    //   228: aload #5
    //   230: aload_0
    //   231: getfield c : Lcom/RNFetchBlob/b;
    //   234: getfield d : Lcom/facebook/react/bridge/ReadableMap;
    //   237: ldc_w 'path'
    //   240: invokeinterface getString : (Ljava/lang/String;)Ljava/lang/String;
    //   245: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   248: pop
    //   249: aload #4
    //   251: aload #5
    //   253: invokevirtual toString : ()Ljava/lang/String;
    //   256: invokestatic parse : (Ljava/lang/String;)Landroid/net/Uri;
    //   259: invokevirtual setDestinationUri : (Landroid/net/Uri;)Landroid/app/DownloadManager$Request;
    //   262: pop
    //   263: aload_0
    //   264: getfield c : Lcom/RNFetchBlob/b;
    //   267: getfield d : Lcom/facebook/react/bridge/ReadableMap;
    //   270: ldc_w 'mime'
    //   273: invokeinterface hasKey : (Ljava/lang/String;)Z
    //   278: ifeq -> 302
    //   281: aload #4
    //   283: aload_0
    //   284: getfield c : Lcom/RNFetchBlob/b;
    //   287: getfield d : Lcom/facebook/react/bridge/ReadableMap;
    //   290: ldc_w 'mime'
    //   293: invokeinterface getString : (Ljava/lang/String;)Ljava/lang/String;
    //   298: invokevirtual setMimeType : (Ljava/lang/String;)Landroid/app/DownloadManager$Request;
    //   301: pop
    //   302: aload_0
    //   303: getfield j : Lcom/facebook/react/bridge/ReadableMap;
    //   306: invokeinterface keySetIterator : ()Lcom/facebook/react/bridge/ReadableMapKeySetIterator;
    //   311: astore #5
    //   313: aload_0
    //   314: getfield c : Lcom/RNFetchBlob/b;
    //   317: getfield d : Lcom/facebook/react/bridge/ReadableMap;
    //   320: ldc_w 'mediaScannable'
    //   323: invokeinterface hasKey : (Ljava/lang/String;)Z
    //   328: ifeq -> 354
    //   331: aload_0
    //   332: getfield c : Lcom/RNFetchBlob/b;
    //   335: getfield d : Lcom/facebook/react/bridge/ReadableMap;
    //   338: ldc_w 'mediaScannable'
    //   341: invokeinterface hasKey : (Ljava/lang/String;)Z
    //   346: ifeq -> 354
    //   349: aload #4
    //   351: invokevirtual allowScanningByMediaScanner : ()V
    //   354: aload #5
    //   356: invokeinterface hasNextKey : ()Z
    //   361: ifeq -> 395
    //   364: aload #5
    //   366: invokeinterface nextKey : ()Ljava/lang/String;
    //   371: astore #6
    //   373: aload #4
    //   375: aload #6
    //   377: aload_0
    //   378: getfield j : Lcom/facebook/react/bridge/ReadableMap;
    //   381: aload #6
    //   383: invokeinterface getString : (Ljava/lang/String;)Ljava/lang/String;
    //   388: invokevirtual addRequestHeader : (Ljava/lang/String;Ljava/lang/String;)Landroid/app/DownloadManager$Request;
    //   391: pop
    //   392: goto -> 354
    //   395: getstatic com/RNFetchBlob/RNFetchBlob.RCTContext : Lcom/facebook/react/bridge/ReactApplicationContext;
    //   398: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   401: astore #5
    //   403: aload_0
    //   404: aload #5
    //   406: ldc_w 'download'
    //   409: invokevirtual getSystemService : (Ljava/lang/String;)Ljava/lang/Object;
    //   412: checkcast android/app/DownloadManager
    //   415: aload #4
    //   417: invokevirtual enqueue : (Landroid/app/DownloadManager$Request;)J
    //   420: putfield m : J
    //   423: getstatic com/RNFetchBlob/g.w : Ljava/util/HashMap;
    //   426: aload_0
    //   427: getfield d : Ljava/lang/String;
    //   430: aload_0
    //   431: getfield m : J
    //   434: invokestatic valueOf : (J)Ljava/lang/Long;
    //   437: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   440: pop
    //   441: aload #5
    //   443: aload_0
    //   444: new android/content/IntentFilter
    //   447: dup
    //   448: ldc_w 'android.intent.action.DOWNLOAD_COMPLETE'
    //   451: invokespecial <init> : (Ljava/lang/String;)V
    //   454: invokevirtual registerReceiver : (Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
    //   457: pop
    //   458: return
    //   459: aload_0
    //   460: getfield d : Ljava/lang/String;
    //   463: astore #4
    //   465: aload_0
    //   466: getfield c : Lcom/RNFetchBlob/b;
    //   469: getfield c : Ljava/lang/String;
    //   472: invokevirtual isEmpty : ()Z
    //   475: ifeq -> 486
    //   478: ldc_w ''
    //   481: astore #5
    //   483: goto -> 524
    //   486: new java/lang/StringBuilder
    //   489: dup
    //   490: invokespecial <init> : ()V
    //   493: astore #5
    //   495: aload #5
    //   497: ldc_w '.'
    //   500: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   503: pop
    //   504: aload #5
    //   506: aload_0
    //   507: getfield c : Lcom/RNFetchBlob/b;
    //   510: getfield c : Ljava/lang/String;
    //   513: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   516: pop
    //   517: aload #5
    //   519: invokevirtual toString : ()Ljava/lang/String;
    //   522: astore #5
    //   524: aload_0
    //   525: getfield c : Lcom/RNFetchBlob/b;
    //   528: getfield g : Ljava/lang/String;
    //   531: astore #6
    //   533: aload #6
    //   535: ifnull -> 642
    //   538: aload #6
    //   540: invokestatic b : (Ljava/lang/String;)Ljava/lang/String;
    //   543: astore #6
    //   545: aload #6
    //   547: astore #4
    //   549: aload #6
    //   551: ifnonnull -> 560
    //   554: aload_0
    //   555: getfield d : Ljava/lang/String;
    //   558: astore #4
    //   560: new java/lang/StringBuilder
    //   563: dup
    //   564: invokespecial <init> : ()V
    //   567: astore #6
    //   569: aload #6
    //   571: aload #4
    //   573: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   576: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   579: pop
    //   580: aload #6
    //   582: aload #5
    //   584: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   587: pop
    //   588: new java/io/File
    //   591: dup
    //   592: aload #6
    //   594: invokevirtual toString : ()Ljava/lang/String;
    //   597: invokespecial <init> : (Ljava/lang/String;)V
    //   600: astore #6
    //   602: aload #6
    //   604: invokevirtual exists : ()Z
    //   607: ifeq -> 642
    //   610: aload_0
    //   611: getfield k : Lcom/facebook/react/bridge/Callback;
    //   614: iconst_3
    //   615: anewarray java/lang/Object
    //   618: dup
    //   619: iconst_0
    //   620: aconst_null
    //   621: aastore
    //   622: dup
    //   623: iconst_1
    //   624: ldc_w 'path'
    //   627: aastore
    //   628: dup
    //   629: iconst_2
    //   630: aload #6
    //   632: invokevirtual getAbsolutePath : ()Ljava/lang/String;
    //   635: aastore
    //   636: invokeinterface invoke : ([Ljava/lang/Object;)V
    //   641: return
    //   642: aload_0
    //   643: getfield c : Lcom/RNFetchBlob/b;
    //   646: astore #6
    //   648: aload #6
    //   650: getfield b : Ljava/lang/String;
    //   653: astore #7
    //   655: aload #7
    //   657: ifnull -> 669
    //   660: aload_0
    //   661: aload #7
    //   663: putfield h : Ljava/lang/String;
    //   666: goto -> 717
    //   669: aload #6
    //   671: getfield a : Ljava/lang/Boolean;
    //   674: invokevirtual booleanValue : ()Z
    //   677: ifeq -> 717
    //   680: new java/lang/StringBuilder
    //   683: dup
    //   684: invokespecial <init> : ()V
    //   687: astore #6
    //   689: aload #6
    //   691: aload #4
    //   693: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   696: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   699: pop
    //   700: aload #6
    //   702: aload #5
    //   704: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   707: pop
    //   708: aload_0
    //   709: aload #6
    //   711: invokevirtual toString : ()Ljava/lang/String;
    //   714: putfield h : Ljava/lang/String;
    //   717: aload_0
    //   718: getfield c : Lcom/RNFetchBlob/b;
    //   721: getfield e : Ljava/lang/Boolean;
    //   724: invokevirtual booleanValue : ()Z
    //   727: ifeq -> 742
    //   730: aload_0
    //   731: getfield u : Lokhttp3/OkHttpClient;
    //   734: invokestatic a : (Lokhttp3/OkHttpClient;)Lokhttp3/OkHttpClient$Builder;
    //   737: astore #6
    //   739: goto -> 751
    //   742: aload_0
    //   743: getfield u : Lokhttp3/OkHttpClient;
    //   746: invokevirtual newBuilder : ()Lokhttp3/OkHttpClient$Builder;
    //   749: astore #6
    //   751: aload_0
    //   752: getfield c : Lcom/RNFetchBlob/b;
    //   755: getfield f : Ljava/lang/Boolean;
    //   758: invokevirtual booleanValue : ()Z
    //   761: ifeq -> 937
    //   764: getstatic android/os/Build$VERSION.SDK_INT : I
    //   767: bipush #21
    //   769: if_icmplt -> 931
    //   772: getstatic com/RNFetchBlob/RNFetchBlob.RCTContext : Lcom/facebook/react/bridge/ReactApplicationContext;
    //   775: astore #4
    //   777: getstatic com/RNFetchBlob/RNFetchBlob.RCTContext : Lcom/facebook/react/bridge/ReactApplicationContext;
    //   780: astore #5
    //   782: aload #4
    //   784: ldc_w 'connectivity'
    //   787: invokevirtual getSystemService : (Ljava/lang/String;)Ljava/lang/Object;
    //   790: checkcast android/net/ConnectivityManager
    //   793: astore #4
    //   795: aload #4
    //   797: invokevirtual getAllNetworks : ()[Landroid/net/Network;
    //   800: astore #5
    //   802: aload #5
    //   804: arraylength
    //   805: istore_2
    //   806: iconst_0
    //   807: istore_1
    //   808: iload_1
    //   809: iload_2
    //   810: if_icmpge -> 2097
    //   813: aload #5
    //   815: iload_1
    //   816: aaload
    //   817: astore #7
    //   819: aload #4
    //   821: aload #7
    //   823: invokevirtual getNetworkInfo : (Landroid/net/Network;)Landroid/net/NetworkInfo;
    //   826: astore #8
    //   828: aload #4
    //   830: aload #7
    //   832: invokevirtual getNetworkCapabilities : (Landroid/net/Network;)Landroid/net/NetworkCapabilities;
    //   835: astore #9
    //   837: aload #9
    //   839: ifnull -> 2090
    //   842: aload #8
    //   844: ifnonnull -> 850
    //   847: goto -> 2090
    //   850: aload #8
    //   852: invokevirtual isConnected : ()Z
    //   855: ifne -> 861
    //   858: goto -> 2090
    //   861: aload #9
    //   863: iconst_1
    //   864: invokevirtual hasTransport : (I)Z
    //   867: ifeq -> 2090
    //   870: aload #6
    //   872: getstatic java/net/Proxy.NO_PROXY : Ljava/net/Proxy;
    //   875: invokevirtual proxy : (Ljava/net/Proxy;)Lokhttp3/OkHttpClient$Builder;
    //   878: pop
    //   879: aload #6
    //   881: aload #7
    //   883: invokevirtual getSocketFactory : ()Ljavax/net/SocketFactory;
    //   886: invokevirtual socketFactory : (Ljavax/net/SocketFactory;)Lokhttp3/OkHttpClient$Builder;
    //   889: pop
    //   890: iconst_1
    //   891: istore_1
    //   892: goto -> 895
    //   895: iload_1
    //   896: ifne -> 937
    //   899: aload_0
    //   900: getfield k : Lcom/facebook/react/bridge/Callback;
    //   903: iconst_3
    //   904: anewarray java/lang/Object
    //   907: dup
    //   908: iconst_0
    //   909: ldc_w 'No available WiFi connections.'
    //   912: aastore
    //   913: dup
    //   914: iconst_1
    //   915: aconst_null
    //   916: aastore
    //   917: dup
    //   918: iconst_2
    //   919: aconst_null
    //   920: aastore
    //   921: invokeinterface invoke : ([Ljava/lang/Object;)V
    //   926: aload_0
    //   927: invokespecial a : ()V
    //   930: return
    //   931: ldc_w 'RNFetchBlob: wifiOnly was set, but SDK < 21. wifiOnly was ignored.'
    //   934: invokestatic a : (Ljava/lang/String;)V
    //   937: new okhttp3/Request$Builder
    //   940: dup
    //   941: invokespecial <init> : ()V
    //   944: astore #7
    //   946: aload #7
    //   948: new java/net/URL
    //   951: dup
    //   952: aload_0
    //   953: getfield f : Ljava/lang/String;
    //   956: invokespecial <init> : (Ljava/lang/String;)V
    //   959: invokevirtual url : (Ljava/net/URL;)Lokhttp3/Request$Builder;
    //   962: pop
    //   963: goto -> 973
    //   966: astore #4
    //   968: aload #4
    //   970: invokevirtual printStackTrace : ()V
    //   973: new java/util/HashMap
    //   976: dup
    //   977: invokespecial <init> : ()V
    //   980: astore #5
    //   982: aload_0
    //   983: getfield j : Lcom/facebook/react/bridge/ReadableMap;
    //   986: ifnull -> 1116
    //   989: aload_0
    //   990: getfield j : Lcom/facebook/react/bridge/ReadableMap;
    //   993: invokeinterface keySetIterator : ()Lcom/facebook/react/bridge/ReadableMapKeySetIterator;
    //   998: astore #8
    //   1000: aload #8
    //   1002: invokeinterface hasNextKey : ()Z
    //   1007: ifeq -> 1116
    //   1010: aload #8
    //   1012: invokeinterface nextKey : ()Ljava/lang/String;
    //   1017: astore #4
    //   1019: aload_0
    //   1020: getfield j : Lcom/facebook/react/bridge/ReadableMap;
    //   1023: aload #4
    //   1025: invokeinterface getString : (Ljava/lang/String;)Ljava/lang/String;
    //   1030: astore #9
    //   1032: aload #4
    //   1034: ldc_w 'RNFB-Response'
    //   1037: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   1040: ifeq -> 1087
    //   1043: aload #9
    //   1045: ldc_w 'base64'
    //   1048: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   1051: ifeq -> 1068
    //   1054: getstatic com/RNFetchBlob/g$f.e : Lcom/RNFetchBlob/g$f;
    //   1057: astore #4
    //   1059: aload_0
    //   1060: aload #4
    //   1062: putfield q : Lcom/RNFetchBlob/g$f;
    //   1065: goto -> 1000
    //   1068: aload #9
    //   1070: ldc_w 'utf8'
    //   1073: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   1076: ifeq -> 1000
    //   1079: getstatic com/RNFetchBlob/g$f.d : Lcom/RNFetchBlob/g$f;
    //   1082: astore #4
    //   1084: goto -> 1059
    //   1087: aload #7
    //   1089: aload #4
    //   1091: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   1094: aload #9
    //   1096: invokevirtual header : (Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;
    //   1099: pop
    //   1100: aload #5
    //   1102: aload #4
    //   1104: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   1107: aload #9
    //   1109: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1112: pop
    //   1113: goto -> 1000
    //   1116: aload_0
    //   1117: getfield e : Ljava/lang/String;
    //   1120: ldc_w 'post'
    //   1123: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   1126: istore_3
    //   1127: iload_3
    //   1128: ifne -> 1174
    //   1131: aload_0
    //   1132: getfield e : Ljava/lang/String;
    //   1135: ldc_w 'put'
    //   1138: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   1141: ifne -> 1174
    //   1144: aload_0
    //   1145: getfield e : Ljava/lang/String;
    //   1148: ldc_w 'patch'
    //   1151: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   1154: ifeq -> 1160
    //   1157: goto -> 1174
    //   1160: getstatic com/RNFetchBlob/g$e.f : Lcom/RNFetchBlob/g$e;
    //   1163: astore #4
    //   1165: aload_0
    //   1166: aload #4
    //   1168: putfield o : Lcom/RNFetchBlob/g$e;
    //   1171: goto -> 1403
    //   1174: aload_0
    //   1175: aload #5
    //   1177: ldc_w 'Content-Type'
    //   1180: invokespecial a : (Ljava/util/HashMap;Ljava/lang/String;)Ljava/lang/String;
    //   1183: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   1186: astore #8
    //   1188: aload_0
    //   1189: getfield i : Lcom/facebook/react/bridge/ReadableArray;
    //   1192: ifnull -> 1209
    //   1195: getstatic com/RNFetchBlob/g$e.c : Lcom/RNFetchBlob/g$e;
    //   1198: astore #4
    //   1200: aload_0
    //   1201: aload #4
    //   1203: putfield o : Lcom/RNFetchBlob/g$e;
    //   1206: goto -> 1248
    //   1209: aload #8
    //   1211: invokevirtual isEmpty : ()Z
    //   1214: ifeq -> 1248
    //   1217: aload #8
    //   1219: ldc_w ''
    //   1222: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   1225: ifne -> 1240
    //   1228: aload #7
    //   1230: ldc_w 'Content-Type'
    //   1233: ldc_w 'application/octet-stream'
    //   1236: invokevirtual header : (Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;
    //   1239: pop
    //   1240: getstatic com/RNFetchBlob/g$e.d : Lcom/RNFetchBlob/g$e;
    //   1243: astore #4
    //   1245: goto -> 1200
    //   1248: aload_0
    //   1249: getfield g : Ljava/lang/String;
    //   1252: ifnull -> 1403
    //   1255: aload_0
    //   1256: getfield g : Ljava/lang/String;
    //   1259: ldc_w 'RNFetchBlob-file://'
    //   1262: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1265: ifne -> 1395
    //   1268: aload_0
    //   1269: getfield g : Ljava/lang/String;
    //   1272: ldc_w 'RNFetchBlob-content://'
    //   1275: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1278: ifeq -> 1284
    //   1281: goto -> 1395
    //   1284: aload #8
    //   1286: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   1289: ldc_w ';base64'
    //   1292: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   1295: ifne -> 1323
    //   1298: aload #8
    //   1300: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   1303: ldc_w 'application/octet'
    //   1306: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1309: ifeq -> 1315
    //   1312: goto -> 1323
    //   1315: getstatic com/RNFetchBlob/g$e.e : Lcom/RNFetchBlob/g$e;
    //   1318: astore #4
    //   1320: goto -> 1165
    //   1323: aload #8
    //   1325: ldc_w ';base64'
    //   1328: ldc_w ''
    //   1331: invokevirtual replace : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   1334: ldc_w ';BASE64'
    //   1337: ldc_w ''
    //   1340: invokevirtual replace : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   1343: astore #4
    //   1345: aload #5
    //   1347: ldc 'content-type'
    //   1349: invokevirtual containsKey : (Ljava/lang/Object;)Z
    //   1352: ifeq -> 1365
    //   1355: aload #5
    //   1357: ldc 'content-type'
    //   1359: aload #4
    //   1361: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1364: pop
    //   1365: aload #5
    //   1367: ldc_w 'Content-Type'
    //   1370: invokevirtual containsKey : (Ljava/lang/Object;)Z
    //   1373: ifeq -> 1387
    //   1376: aload #5
    //   1378: ldc_w 'Content-Type'
    //   1381: aload #4
    //   1383: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1386: pop
    //   1387: getstatic com/RNFetchBlob/g$e.d : Lcom/RNFetchBlob/g$e;
    //   1390: astore #4
    //   1392: goto -> 1165
    //   1395: getstatic com/RNFetchBlob/g$e.d : Lcom/RNFetchBlob/g$e;
    //   1398: astore #4
    //   1400: goto -> 1165
    //   1403: aload_0
    //   1404: aload #5
    //   1406: ldc_w 'Transfer-Encoding'
    //   1409: invokespecial a : (Ljava/util/HashMap;Ljava/lang/String;)Ljava/lang/String;
    //   1412: ldc_w 'chunked'
    //   1415: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   1418: istore_3
    //   1419: getstatic com/RNFetchBlob/g$d.a : [I
    //   1422: aload_0
    //   1423: getfield o : Lcom/RNFetchBlob/g$e;
    //   1426: invokevirtual ordinal : ()I
    //   1429: iaload
    //   1430: istore_1
    //   1431: iload_1
    //   1432: iconst_1
    //   1433: if_icmpeq -> 1752
    //   1436: iload_1
    //   1437: iconst_2
    //   1438: if_icmpeq -> 1674
    //   1441: iload_1
    //   1442: iconst_3
    //   1443: if_icmpeq -> 1538
    //   1446: iload_1
    //   1447: iconst_4
    //   1448: if_icmpeq -> 1454
    //   1451: goto -> 1830
    //   1454: aload_0
    //   1455: getfield e : Ljava/lang/String;
    //   1458: ldc_w 'post'
    //   1461: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   1464: ifne -> 1510
    //   1467: aload_0
    //   1468: getfield e : Ljava/lang/String;
    //   1471: ldc_w 'put'
    //   1474: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   1477: ifne -> 1510
    //   1480: aload_0
    //   1481: getfield e : Ljava/lang/String;
    //   1484: ldc_w 'patch'
    //   1487: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   1490: ifeq -> 1496
    //   1493: goto -> 1510
    //   1496: aload #7
    //   1498: aload_0
    //   1499: getfield e : Ljava/lang/String;
    //   1502: aconst_null
    //   1503: invokevirtual method : (Ljava/lang/String;Lokhttp3/RequestBody;)Lokhttp3/Request$Builder;
    //   1506: pop
    //   1507: goto -> 1830
    //   1510: aload_0
    //   1511: getfield e : Ljava/lang/String;
    //   1514: astore #4
    //   1516: aconst_null
    //   1517: iconst_0
    //   1518: newarray byte
    //   1520: invokestatic create : (Lokhttp3/MediaType;[B)Lokhttp3/RequestBody;
    //   1523: astore #5
    //   1525: aload #7
    //   1527: aload #4
    //   1529: aload #5
    //   1531: invokevirtual method : (Ljava/lang/String;Lokhttp3/RequestBody;)Lokhttp3/Request$Builder;
    //   1534: pop
    //   1535: goto -> 1830
    //   1538: new java/lang/StringBuilder
    //   1541: dup
    //   1542: invokespecial <init> : ()V
    //   1545: astore #4
    //   1547: aload #4
    //   1549: ldc_w 'RNFetchBlob-'
    //   1552: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1555: pop
    //   1556: aload #4
    //   1558: aload_0
    //   1559: getfield d : Ljava/lang/String;
    //   1562: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1565: pop
    //   1566: aload #4
    //   1568: invokevirtual toString : ()Ljava/lang/String;
    //   1571: astore #4
    //   1573: new com/RNFetchBlob/a
    //   1576: dup
    //   1577: aload_0
    //   1578: getfield d : Ljava/lang/String;
    //   1581: invokespecial <init> : (Ljava/lang/String;)V
    //   1584: astore #5
    //   1586: aload #5
    //   1588: iload_3
    //   1589: invokevirtual a : (Z)Lcom/RNFetchBlob/a;
    //   1592: pop
    //   1593: aload #5
    //   1595: aload_0
    //   1596: getfield o : Lcom/RNFetchBlob/g$e;
    //   1599: invokevirtual a : (Lcom/RNFetchBlob/g$e;)Lcom/RNFetchBlob/a;
    //   1602: pop
    //   1603: aload #5
    //   1605: aload_0
    //   1606: getfield i : Lcom/facebook/react/bridge/ReadableArray;
    //   1609: invokevirtual a : (Lcom/facebook/react/bridge/ReadableArray;)Lcom/RNFetchBlob/a;
    //   1612: pop
    //   1613: new java/lang/StringBuilder
    //   1616: dup
    //   1617: invokespecial <init> : ()V
    //   1620: astore #8
    //   1622: aload #8
    //   1624: ldc_w 'multipart/form-data; boundary='
    //   1627: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1630: pop
    //   1631: aload #8
    //   1633: aload #4
    //   1635: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1638: pop
    //   1639: aload #5
    //   1641: aload #8
    //   1643: invokevirtual toString : ()Ljava/lang/String;
    //   1646: invokestatic parse : (Ljava/lang/String;)Lokhttp3/MediaType;
    //   1649: invokevirtual a : (Lokhttp3/MediaType;)Lcom/RNFetchBlob/a;
    //   1652: pop
    //   1653: aload_0
    //   1654: aload #5
    //   1656: putfield n : Lcom/RNFetchBlob/a;
    //   1659: aload_0
    //   1660: getfield e : Ljava/lang/String;
    //   1663: astore #4
    //   1665: aload_0
    //   1666: getfield n : Lcom/RNFetchBlob/a;
    //   1669: astore #5
    //   1671: goto -> 1525
    //   1674: new com/RNFetchBlob/a
    //   1677: dup
    //   1678: aload_0
    //   1679: getfield d : Ljava/lang/String;
    //   1682: invokespecial <init> : (Ljava/lang/String;)V
    //   1685: astore #4
    //   1687: aload #4
    //   1689: iload_3
    //   1690: invokevirtual a : (Z)Lcom/RNFetchBlob/a;
    //   1693: pop
    //   1694: aload #4
    //   1696: aload_0
    //   1697: getfield o : Lcom/RNFetchBlob/g$e;
    //   1700: invokevirtual a : (Lcom/RNFetchBlob/g$e;)Lcom/RNFetchBlob/a;
    //   1703: pop
    //   1704: aload #4
    //   1706: aload_0
    //   1707: getfield g : Ljava/lang/String;
    //   1710: invokevirtual a : (Ljava/lang/String;)Lcom/RNFetchBlob/a;
    //   1713: pop
    //   1714: aload #4
    //   1716: aload_0
    //   1717: aload #5
    //   1719: ldc 'content-type'
    //   1721: invokespecial a : (Ljava/util/HashMap;Ljava/lang/String;)Ljava/lang/String;
    //   1724: invokestatic parse : (Ljava/lang/String;)Lokhttp3/MediaType;
    //   1727: invokevirtual a : (Lokhttp3/MediaType;)Lcom/RNFetchBlob/a;
    //   1730: pop
    //   1731: aload_0
    //   1732: aload #4
    //   1734: putfield n : Lcom/RNFetchBlob/a;
    //   1737: aload_0
    //   1738: getfield e : Ljava/lang/String;
    //   1741: astore #4
    //   1743: aload_0
    //   1744: getfield n : Lcom/RNFetchBlob/a;
    //   1747: astore #5
    //   1749: goto -> 1525
    //   1752: new com/RNFetchBlob/a
    //   1755: dup
    //   1756: aload_0
    //   1757: getfield d : Ljava/lang/String;
    //   1760: invokespecial <init> : (Ljava/lang/String;)V
    //   1763: astore #4
    //   1765: aload #4
    //   1767: iload_3
    //   1768: invokevirtual a : (Z)Lcom/RNFetchBlob/a;
    //   1771: pop
    //   1772: aload #4
    //   1774: aload_0
    //   1775: getfield o : Lcom/RNFetchBlob/g$e;
    //   1778: invokevirtual a : (Lcom/RNFetchBlob/g$e;)Lcom/RNFetchBlob/a;
    //   1781: pop
    //   1782: aload #4
    //   1784: aload_0
    //   1785: getfield g : Ljava/lang/String;
    //   1788: invokevirtual a : (Ljava/lang/String;)Lcom/RNFetchBlob/a;
    //   1791: pop
    //   1792: aload #4
    //   1794: aload_0
    //   1795: aload #5
    //   1797: ldc 'content-type'
    //   1799: invokespecial a : (Ljava/util/HashMap;Ljava/lang/String;)Ljava/lang/String;
    //   1802: invokestatic parse : (Ljava/lang/String;)Lokhttp3/MediaType;
    //   1805: invokevirtual a : (Lokhttp3/MediaType;)Lcom/RNFetchBlob/a;
    //   1808: pop
    //   1809: aload_0
    //   1810: aload #4
    //   1812: putfield n : Lcom/RNFetchBlob/a;
    //   1815: aload_0
    //   1816: getfield e : Ljava/lang/String;
    //   1819: astore #4
    //   1821: aload_0
    //   1822: getfield n : Lcom/RNFetchBlob/a;
    //   1825: astore #5
    //   1827: goto -> 1525
    //   1830: aload #7
    //   1832: invokevirtual build : ()Lokhttp3/Request;
    //   1835: astore #4
    //   1837: aload #6
    //   1839: new com/RNFetchBlob/g$a
    //   1842: dup
    //   1843: aload_0
    //   1844: invokespecial <init> : (Lcom/RNFetchBlob/g;)V
    //   1847: invokevirtual addNetworkInterceptor : (Lokhttp3/Interceptor;)Lokhttp3/OkHttpClient$Builder;
    //   1850: pop
    //   1851: aload #6
    //   1853: new com/RNFetchBlob/g$b
    //   1856: dup
    //   1857: aload_0
    //   1858: aload #4
    //   1860: invokespecial <init> : (Lcom/RNFetchBlob/g;Lokhttp3/Request;)V
    //   1863: invokevirtual addInterceptor : (Lokhttp3/Interceptor;)Lokhttp3/OkHttpClient$Builder;
    //   1866: pop
    //   1867: aload_0
    //   1868: getfield c : Lcom/RNFetchBlob/b;
    //   1871: getfield j : J
    //   1874: lconst_0
    //   1875: lcmp
    //   1876: iflt -> 1911
    //   1879: aload #6
    //   1881: aload_0
    //   1882: getfield c : Lcom/RNFetchBlob/b;
    //   1885: getfield j : J
    //   1888: getstatic java/util/concurrent/TimeUnit.MILLISECONDS : Ljava/util/concurrent/TimeUnit;
    //   1891: invokevirtual connectTimeout : (JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;
    //   1894: pop
    //   1895: aload #6
    //   1897: aload_0
    //   1898: getfield c : Lcom/RNFetchBlob/b;
    //   1901: getfield j : J
    //   1904: getstatic java/util/concurrent/TimeUnit.MILLISECONDS : Ljava/util/concurrent/TimeUnit;
    //   1907: invokevirtual readTimeout : (JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;
    //   1910: pop
    //   1911: aload #6
    //   1913: getstatic com/RNFetchBlob/g.z : Lokhttp3/ConnectionPool;
    //   1916: invokevirtual connectionPool : (Lokhttp3/ConnectionPool;)Lokhttp3/OkHttpClient$Builder;
    //   1919: pop
    //   1920: aload #6
    //   1922: iconst_0
    //   1923: invokevirtual retryOnConnectionFailure : (Z)Lokhttp3/OkHttpClient$Builder;
    //   1926: pop
    //   1927: aload #6
    //   1929: aload_0
    //   1930: getfield c : Lcom/RNFetchBlob/b;
    //   1933: getfield l : Ljava/lang/Boolean;
    //   1936: invokevirtual booleanValue : ()Z
    //   1939: invokevirtual followRedirects : (Z)Lokhttp3/OkHttpClient$Builder;
    //   1942: pop
    //   1943: aload #6
    //   1945: aload_0
    //   1946: getfield c : Lcom/RNFetchBlob/b;
    //   1949: getfield l : Ljava/lang/Boolean;
    //   1952: invokevirtual booleanValue : ()Z
    //   1955: invokevirtual followSslRedirects : (Z)Lokhttp3/OkHttpClient$Builder;
    //   1958: pop
    //   1959: aload #6
    //   1961: iconst_1
    //   1962: invokevirtual retryOnConnectionFailure : (Z)Lokhttp3/OkHttpClient$Builder;
    //   1965: pop
    //   1966: aload #6
    //   1968: invokestatic a : (Lokhttp3/OkHttpClient$Builder;)Lokhttp3/OkHttpClient$Builder;
    //   1971: pop
    //   1972: aload #6
    //   1974: invokevirtual build : ()Lokhttp3/OkHttpClient;
    //   1977: aload #4
    //   1979: invokevirtual newCall : (Lokhttp3/Request;)Lokhttp3/Call;
    //   1982: astore #4
    //   1984: getstatic com/RNFetchBlob/g.v : Ljava/util/HashMap;
    //   1987: aload_0
    //   1988: getfield d : Ljava/lang/String;
    //   1991: aload #4
    //   1993: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1996: pop
    //   1997: aload #4
    //   1999: new com/RNFetchBlob/g$c
    //   2002: dup
    //   2003: aload_0
    //   2004: invokespecial <init> : (Lcom/RNFetchBlob/g;)V
    //   2007: invokeinterface enqueue : (Lokhttp3/Callback;)V
    //   2012: return
    //   2013: astore #4
    //   2015: aload #4
    //   2017: invokevirtual printStackTrace : ()V
    //   2020: aload_0
    //   2021: invokespecial a : ()V
    //   2024: aload_0
    //   2025: getfield k : Lcom/facebook/react/bridge/Callback;
    //   2028: astore #5
    //   2030: new java/lang/StringBuilder
    //   2033: dup
    //   2034: invokespecial <init> : ()V
    //   2037: astore #6
    //   2039: aload #6
    //   2041: ldc_w 'RNFetchBlob request error: '
    //   2044: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2047: pop
    //   2048: aload #6
    //   2050: aload #4
    //   2052: invokevirtual getMessage : ()Ljava/lang/String;
    //   2055: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2058: pop
    //   2059: aload #6
    //   2061: aload #4
    //   2063: invokevirtual getCause : ()Ljava/lang/Throwable;
    //   2066: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   2069: pop
    //   2070: aload #5
    //   2072: iconst_1
    //   2073: anewarray java/lang/Object
    //   2076: dup
    //   2077: iconst_0
    //   2078: aload #6
    //   2080: invokevirtual toString : ()Ljava/lang/String;
    //   2083: aastore
    //   2084: invokeinterface invoke : ([Ljava/lang/Object;)V
    //   2089: return
    //   2090: iload_1
    //   2091: iconst_1
    //   2092: iadd
    //   2093: istore_1
    //   2094: goto -> 808
    //   2097: iconst_0
    //   2098: istore_1
    //   2099: goto -> 895
    // Exception table:
    //   from	to	target	type
    //   717	739	2013	java/lang/Exception
    //   742	751	2013	java/lang/Exception
    //   751	806	2013	java/lang/Exception
    //   819	837	2013	java/lang/Exception
    //   850	858	2013	java/lang/Exception
    //   861	890	2013	java/lang/Exception
    //   899	930	2013	java/lang/Exception
    //   931	937	2013	java/lang/Exception
    //   937	946	2013	java/lang/Exception
    //   946	963	966	java/net/MalformedURLException
    //   946	963	2013	java/lang/Exception
    //   968	973	2013	java/lang/Exception
    //   973	1000	2013	java/lang/Exception
    //   1000	1059	2013	java/lang/Exception
    //   1059	1065	2013	java/lang/Exception
    //   1068	1084	2013	java/lang/Exception
    //   1087	1113	2013	java/lang/Exception
    //   1116	1127	2013	java/lang/Exception
    //   1131	1157	2013	java/lang/Exception
    //   1160	1165	2013	java/lang/Exception
    //   1165	1171	2013	java/lang/Exception
    //   1174	1200	2013	java/lang/Exception
    //   1200	1206	2013	java/lang/Exception
    //   1209	1240	2013	java/lang/Exception
    //   1240	1245	2013	java/lang/Exception
    //   1248	1281	2013	java/lang/Exception
    //   1284	1312	2013	java/lang/Exception
    //   1315	1320	2013	java/lang/Exception
    //   1323	1365	2013	java/lang/Exception
    //   1365	1387	2013	java/lang/Exception
    //   1387	1392	2013	java/lang/Exception
    //   1395	1400	2013	java/lang/Exception
    //   1403	1431	2013	java/lang/Exception
    //   1454	1493	2013	java/lang/Exception
    //   1496	1507	2013	java/lang/Exception
    //   1510	1525	2013	java/lang/Exception
    //   1525	1535	2013	java/lang/Exception
    //   1538	1671	2013	java/lang/Exception
    //   1674	1749	2013	java/lang/Exception
    //   1752	1827	2013	java/lang/Exception
    //   1830	1911	2013	java/lang/Exception
    //   1911	2012	2013	java/lang/Exception
  }
  
  class a implements Interceptor {
    a(g this$0) {}
    
    public Response intercept(Interceptor.Chain param1Chain) {
      this.a.t.add(param1Chain.request().url().toString());
      return param1Chain.proceed(param1Chain.request());
    }
  }
  
  class b implements Interceptor {
    b(g this$0, Request param1Request) {}
    
    public Response intercept(Interceptor.Chain param1Chain) {
      try {
        a a;
        Response response = param1Chain.proceed(this.a);
        int i = g.d.b[this.b.p.ordinal()];
        if (i != 1) {
          if (i != 2) {
            a = new a(RNFetchBlob.RCTContext, this.b.d, response.body(), this.b.c.k.booleanValue());
          } else {
            b b1 = new b(RNFetchBlob.RCTContext, this.b.d, response.body(), this.b.h, this.b.c.i.booleanValue());
          } 
        } else {
          a = new a(RNFetchBlob.RCTContext, this.b.d, response.body(), this.b.c.k.booleanValue());
        } 
        return response.newBuilder().body((ResponseBody)a).build();
      } catch (SocketException|SocketTimeoutException socketException) {
        this.b.s = true;
      } catch (Exception exception) {}
      return param1Chain.proceed(param1Chain.request());
    }
  }
  
  class c implements Callback {
    c(g this$0) {}
    
    public void onFailure(Call param1Call, IOException param1IOException) {
      g.a(this.a.d);
      g g1 = this.a;
      if (g1.r == null)
        g1.r = Arguments.createMap(); 
      if (param1IOException.getClass().equals(SocketTimeoutException.class)) {
        this.a.r.putBoolean("timeout", true);
        this.a.k.invoke(new Object[] { "The request timed out.", null, null });
      } else {
        this.a.k.invoke(new Object[] { param1IOException.getLocalizedMessage(), null, null });
      } 
      g.a(this.a);
    }
    
    public void onResponse(Call param1Call, Response param1Response) {
      ReadableMap readableMap = this.a.c.d;
      if (readableMap != null) {
        String str1;
        boolean bool1;
        String str3;
        boolean bool = readableMap.hasKey("title");
        String str2 = "";
        if (bool) {
          str1 = this.a.c.d.getString("title");
        } else {
          str1 = "";
        } 
        if (readableMap.hasKey("description"))
          str2 = readableMap.getString("description"); 
        if (readableMap.hasKey("mime")) {
          str3 = readableMap.getString("mime");
        } else {
          str3 = "text/plain";
        } 
        if (readableMap.hasKey("mediaScannable")) {
          bool = readableMap.getBoolean("mediaScannable");
        } else {
          bool = false;
        } 
        if (readableMap.hasKey("notification")) {
          bool1 = readableMap.getBoolean("notification");
        } else {
          bool1 = false;
        } 
        DownloadManager downloadManager = (DownloadManager)RNFetchBlob.RCTContext.getSystemService("download");
        g g1 = this.a;
        downloadManager.addCompletedDownload(str1, str2, bool, str3, g1.h, g1.l, bool1);
      } 
      g.a(this.a, param1Response);
    }
  }
  
  enum e {
    c, d, e, f, g;
  }
  
  enum f {
    c, d, e;
  }
  
  enum g {
    c, d;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/RNFetchBlob/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */