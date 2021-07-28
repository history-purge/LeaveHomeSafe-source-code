package com.facebook.react.modules.network;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import com.facebook.fbreact.specs.NativeNetworkingAndroidSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import e.e.o.d0.a.a;
import j.j;
import j.l;
import j.t;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.JavaNetCookieJar;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

@a(name = "Networking")
public final class NetworkingModule extends NativeNetworkingAndroidSpec {
  private static final int CHUNK_TIMEOUT_NS = 100000000;
  
  private static final String CONTENT_ENCODING_HEADER_NAME = "content-encoding";
  
  private static final String CONTENT_TYPE_HEADER_NAME = "content-type";
  
  private static final int MAX_CHUNK_SIZE_BETWEEN_FLUSHES = 8192;
  
  public static final String NAME = "Networking";
  
  private static final String REQUEST_BODY_KEY_BASE64 = "base64";
  
  private static final String REQUEST_BODY_KEY_FORMDATA = "formData";
  
  private static final String REQUEST_BODY_KEY_STRING = "string";
  
  private static final String REQUEST_BODY_KEY_URI = "uri";
  
  private static final String TAG = "NetworkingModule";
  
  private static final String USER_AGENT_HEADER_NAME = "user-agent";
  
  private static e customClientBuilder;
  
  private final OkHttpClient mClient;
  
  private final c mCookieHandler;
  
  private final a mCookieJarContainer;
  
  private final String mDefaultUserAgent;
  
  private final List<f> mRequestBodyHandlers = new ArrayList<f>();
  
  private final Set<Integer> mRequestIds;
  
  private final List<g> mResponseHandlers = new ArrayList<g>();
  
  private boolean mShuttingDown;
  
  private final List<h> mUriHandlers = new ArrayList<h>();
  
  public NetworkingModule(ReactApplicationContext paramReactApplicationContext) {
    this(paramReactApplicationContext, null, g.a((Context)paramReactApplicationContext), null);
  }
  
  public NetworkingModule(ReactApplicationContext paramReactApplicationContext, String paramString) {
    this(paramReactApplicationContext, paramString, g.a((Context)paramReactApplicationContext), null);
  }
  
  NetworkingModule(ReactApplicationContext paramReactApplicationContext, String paramString, OkHttpClient paramOkHttpClient) {
    this(paramReactApplicationContext, paramString, paramOkHttpClient, null);
  }
  
  NetworkingModule(ReactApplicationContext paramReactApplicationContext, String paramString, OkHttpClient paramOkHttpClient, List<e> paramList) {
    super(paramReactApplicationContext);
    OkHttpClient okHttpClient = paramOkHttpClient;
    if (paramList != null) {
      OkHttpClient.Builder builder = paramOkHttpClient.newBuilder();
      Iterator<e> iterator = paramList.iterator();
      while (iterator.hasNext())
        builder.addNetworkInterceptor(((e)iterator.next()).create()); 
      okHttpClient = builder.build();
    } 
    this.mClient = okHttpClient;
    this.mCookieHandler = new c((ReactContext)paramReactApplicationContext);
    this.mCookieJarContainer = (a)this.mClient.cookieJar();
    this.mShuttingDown = false;
    this.mDefaultUserAgent = paramString;
    this.mRequestIds = new HashSet<Integer>();
  }
  
  public NetworkingModule(ReactApplicationContext paramReactApplicationContext, List<e> paramList) {
    this(paramReactApplicationContext, null, g.a((Context)paramReactApplicationContext), paramList);
  }
  
  private void addRequest(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield mRequestIds : Ljava/util/Set;
    //   6: iload_1
    //   7: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   10: invokeinterface add : (Ljava/lang/Object;)Z
    //   15: pop
    //   16: aload_0
    //   17: monitorexit
    //   18: return
    //   19: astore_2
    //   20: aload_0
    //   21: monitorexit
    //   22: aload_2
    //   23: athrow
    // Exception table:
    //   from	to	target	type
    //   2	16	19	finally
  }
  
  private static void applyCustomBuilder(OkHttpClient.Builder paramBuilder) {
    e e1 = customClientBuilder;
    if (e1 != null)
      e1.a(paramBuilder); 
  }
  
  private void cancelAllRequests() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield mRequestIds : Ljava/util/Set;
    //   6: invokeinterface iterator : ()Ljava/util/Iterator;
    //   11: astore_1
    //   12: aload_1
    //   13: invokeinterface hasNext : ()Z
    //   18: ifeq -> 40
    //   21: aload_0
    //   22: aload_1
    //   23: invokeinterface next : ()Ljava/lang/Object;
    //   28: checkcast java/lang/Integer
    //   31: invokevirtual intValue : ()I
    //   34: invokespecial cancelRequest : (I)V
    //   37: goto -> 12
    //   40: aload_0
    //   41: getfield mRequestIds : Ljava/util/Set;
    //   44: invokeinterface clear : ()V
    //   49: aload_0
    //   50: monitorexit
    //   51: return
    //   52: astore_1
    //   53: aload_0
    //   54: monitorexit
    //   55: goto -> 60
    //   58: aload_1
    //   59: athrow
    //   60: goto -> 58
    // Exception table:
    //   from	to	target	type
    //   2	12	52	finally
    //   12	37	52	finally
    //   40	49	52	finally
  }
  
  private void cancelRequest(int paramInt) {
    (new d(this, (ReactContext)getReactApplicationContext(), paramInt)).execute((Object[])new Void[0]);
  }
  
  private MultipartBody.Builder constructMultipartBody(ReadableArray paramReadableArray, String paramString, int paramInt) {
    DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter = getEventEmitter("constructMultipartBody");
    MultipartBody.Builder builder = new MultipartBody.Builder();
    builder.setType(MediaType.parse(paramString));
    int j = paramReadableArray.size();
    int i;
    for (i = 0;; i++) {
      if (i < j) {
        RequestBody requestBody;
        ReadableMap readableMap = paramReadableArray.getMap(i);
        Headers headers = extractHeaders(readableMap.getArray("headers"), null);
        if (headers == null) {
          String str1 = "Missing or invalid header format for FormData part.";
          n.a(rCTDeviceEventEmitter, paramInt, str1, (Throwable)null);
          return null;
        } 
        String str = headers.get("content-type");
        if (str != null) {
          MediaType mediaType = MediaType.parse(str);
          headers = headers.newBuilder().removeAll("content-type").build();
        } else {
          str = null;
        } 
        if (readableMap.hasKey("string")) {
          requestBody = RequestBody.create((MediaType)str, readableMap.getString("string"));
        } else if (readableMap.hasKey("uri")) {
          if (requestBody == null) {
            String str2 = "Binary FormData part needs a content-type header.";
            n.a(rCTDeviceEventEmitter, paramInt, str2, (Throwable)null);
            return null;
          } 
          String str1 = readableMap.getString("uri");
          InputStream inputStream = m.a((Context)getReactApplicationContext(), str1);
          if (inputStream == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Could not retrieve file for uri ");
            stringBuilder.append(str1);
            String str2 = stringBuilder.toString();
            n.a(rCTDeviceEventEmitter, paramInt, str2, (Throwable)null);
            return null;
          } 
          requestBody = m.a((MediaType)requestBody, inputStream);
        } else {
          n.a(rCTDeviceEventEmitter, paramInt, "Unrecognized FormData part.", (Throwable)null);
          i++;
        } 
        builder.addPart(headers, requestBody);
      } else {
        break;
      } 
    } 
    return builder;
  }
  
  private Headers extractHeaders(ReadableArray paramReadableArray, ReadableMap paramReadableMap) {
    if (paramReadableArray == null)
      return null; 
    Headers.Builder builder = new Headers.Builder();
    int j = paramReadableArray.size();
    boolean bool = false;
    int i = 0;
    while (i < j) {
      ReadableArray readableArray = paramReadableArray.getArray(i);
      if (readableArray != null) {
        if (readableArray.size() != 2)
          return null; 
        String str1 = d.a(readableArray.getString(0));
        String str2 = d.b(readableArray.getString(1));
        if (str1 != null) {
          if (str2 == null)
            return null; 
          builder.add(str1, str2);
          i++;
          continue;
        } 
      } 
      return null;
    } 
    if (builder.get("user-agent") == null) {
      String str = this.mDefaultUserAgent;
      if (str != null)
        builder.add("user-agent", str); 
    } 
    i = bool;
    if (paramReadableMap != null) {
      i = bool;
      if (paramReadableMap.hasKey("string"))
        i = 1; 
    } 
    if (i == 0)
      builder.removeAll("content-encoding"); 
    return builder.build();
  }
  
  private DeviceEventManagerModule.RCTDeviceEventEmitter getEventEmitter(String paramString) {
    return (getReactApplicationContextIfActiveOrWarn() != null) ? (DeviceEventManagerModule.RCTDeviceEventEmitter)getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class) : null;
  }
  
  private void readWithProgress(DeviceEventManagerModule.RCTDeviceEventEmitter paramRCTDeviceEventEmitter, int paramInt, ResponseBody paramResponseBody) {
    long l2;
    Charset charset;
    long l1 = -1L;
    try {
      j j = (j)paramResponseBody;
      l2 = j.a();
      try {
        long l = j.contentLength();
        l1 = l;
      } catch (ClassCastException classCastException) {}
    } catch (ClassCastException classCastException) {
      l2 = -1L;
    } 
    if (paramResponseBody.contentType() == null) {
      charset = com.facebook.react.common.h.a;
    } else {
      charset = paramResponseBody.contentType().charset(com.facebook.react.common.h.a);
    } 
    k k = new k(charset);
    InputStream inputStream = paramResponseBody.byteStream();
    try {
      byte[] arrayOfByte = new byte[8192];
      while (true) {
        int i = inputStream.read(arrayOfByte);
        if (i != -1) {
          n.a(paramRCTDeviceEventEmitter, paramInt, k.a(arrayOfByte, i), l2, l1);
          continue;
        } 
        return;
      } 
    } finally {
      inputStream.close();
    } 
  }
  
  private void removeRequest(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield mRequestIds : Ljava/util/Set;
    //   6: iload_1
    //   7: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   10: invokeinterface remove : (Ljava/lang/Object;)Z
    //   15: pop
    //   16: aload_0
    //   17: monitorexit
    //   18: return
    //   19: astore_2
    //   20: aload_0
    //   21: monitorexit
    //   22: aload_2
    //   23: athrow
    // Exception table:
    //   from	to	target	type
    //   2	16	19	finally
  }
  
  public static void setCustomClientBuilder(e parame) {
    customClientBuilder = parame;
  }
  
  private static boolean shouldDispatch(long paramLong1, long paramLong2) {
    return (paramLong2 + 100000000L < paramLong1);
  }
  
  private static WritableMap translateHeaders(Headers paramHeaders) {
    Bundle bundle = new Bundle();
    for (int i = 0; i < paramHeaders.size(); i++) {
      String str1;
      String str2 = paramHeaders.name(i);
      if (bundle.containsKey(str2)) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(bundle.getString(str2));
        stringBuilder.append(", ");
        stringBuilder.append(paramHeaders.value(i));
        str1 = stringBuilder.toString();
      } else {
        str1 = paramHeaders.value(i);
      } 
      bundle.putString(str2, str1);
    } 
    return Arguments.fromBundle(bundle);
  }
  
  private RequestBody wrapRequestBodyWithProgressEmitter(RequestBody paramRequestBody, DeviceEventManagerModule.RCTDeviceEventEmitter paramRCTDeviceEventEmitter, int paramInt) {
    return (paramRequestBody == null) ? null : m.a(paramRequestBody, new c(this, paramRCTDeviceEventEmitter, paramInt));
  }
  
  public void abortRequest(double paramDouble) {
    int i = (int)paramDouble;
    cancelRequest(i);
    removeRequest(i);
  }
  
  public void addListener(String paramString) {}
  
  public void addRequestBodyHandler(f paramf) {
    this.mRequestBodyHandlers.add(paramf);
  }
  
  public void addResponseHandler(g paramg) {
    this.mResponseHandlers.add(paramg);
  }
  
  public void addUriHandler(h paramh) {
    this.mUriHandlers.add(paramh);
  }
  
  @ReactMethod
  public void clearCookies(Callback paramCallback) {
    this.mCookieHandler.a(paramCallback);
  }
  
  public String getName() {
    return "Networking";
  }
  
  public void initialize() {
    this.mCookieJarContainer.a((CookieJar)new JavaNetCookieJar(this.mCookieHandler));
  }
  
  public void onCatalystInstanceDestroy() {
    this.mShuttingDown = true;
    cancelAllRequests();
    this.mCookieHandler.a();
    this.mCookieJarContainer.a();
    this.mRequestBodyHandlers.clear();
    this.mResponseHandlers.clear();
    this.mUriHandlers.clear();
  }
  
  public void removeListeners(double paramDouble) {}
  
  public void removeRequestBodyHandler(f paramf) {
    this.mRequestBodyHandlers.remove(paramf);
  }
  
  public void removeResponseHandler(g paramg) {
    this.mResponseHandlers.remove(paramg);
  }
  
  public void removeUriHandler(h paramh) {
    this.mUriHandlers.remove(paramh);
  }
  
  public void sendRequest(String paramString1, String paramString2, double paramDouble1, ReadableArray paramReadableArray, ReadableMap paramReadableMap, String paramString3, boolean paramBoolean1, double paramDouble2, boolean paramBoolean2) {
    int i = (int)paramDouble1;
    int j = (int)paramDouble2;
    try {
      return;
    } finally {
      paramString1 = null;
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Failed to send url request: ");
      stringBuilder.append(paramString2);
      e.e.e.e.a.b("NetworkingModule", stringBuilder.toString(), (Throwable)paramString1);
      DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter = getEventEmitter("sendRequest error");
      if (rCTDeviceEventEmitter != null)
        n.a(rCTDeviceEventEmitter, i, paramString1.getMessage(), (Throwable)paramString1); 
    } 
  }
  
  public void sendRequestInternal(String paramString1, String paramString2, int paramInt1, ReadableArray paramReadableArray, ReadableMap paramReadableMap, String paramString3, boolean paramBoolean1, int paramInt2, boolean paramBoolean2) {
    // Byte code:
    //   0: aload_0
    //   1: ldc_w 'sendRequestInternal'
    //   4: invokespecial getEventEmitter : (Ljava/lang/String;)Lcom/facebook/react/modules/core/DeviceEventManagerModule$RCTDeviceEventEmitter;
    //   7: astore #10
    //   9: aload_2
    //   10: invokestatic parse : (Ljava/lang/String;)Landroid/net/Uri;
    //   13: astore #11
    //   15: aload_0
    //   16: getfield mUriHandlers : Ljava/util/List;
    //   19: invokeinterface iterator : ()Ljava/util/Iterator;
    //   24: astore #12
    //   26: aload #12
    //   28: invokeinterface hasNext : ()Z
    //   33: ifeq -> 84
    //   36: aload #12
    //   38: invokeinterface next : ()Ljava/lang/Object;
    //   43: checkcast com/facebook/react/modules/network/NetworkingModule$h
    //   46: astore #13
    //   48: aload #13
    //   50: aload #11
    //   52: aload #6
    //   54: invokeinterface a : (Landroid/net/Uri;Ljava/lang/String;)Z
    //   59: ifeq -> 26
    //   62: aload #10
    //   64: iload_3
    //   65: aload #13
    //   67: aload #11
    //   69: invokeinterface a : (Landroid/net/Uri;)Lcom/facebook/react/bridge/WritableMap;
    //   74: invokestatic a : (Lcom/facebook/react/modules/core/DeviceEventManagerModule$RCTDeviceEventEmitter;ILcom/facebook/react/bridge/WritableMap;)V
    //   77: aload #10
    //   79: iload_3
    //   80: invokestatic a : (Lcom/facebook/react/modules/core/DeviceEventManagerModule$RCTDeviceEventEmitter;I)V
    //   83: return
    //   84: new okhttp3/Request$Builder
    //   87: dup
    //   88: invokespecial <init> : ()V
    //   91: aload_2
    //   92: invokevirtual url : (Ljava/lang/String;)Lokhttp3/Request$Builder;
    //   95: astore #11
    //   97: iload_3
    //   98: ifeq -> 111
    //   101: aload #11
    //   103: iload_3
    //   104: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   107: invokevirtual tag : (Ljava/lang/Object;)Lokhttp3/Request$Builder;
    //   110: pop
    //   111: aload_0
    //   112: getfield mClient : Lokhttp3/OkHttpClient;
    //   115: invokevirtual newBuilder : ()Lokhttp3/OkHttpClient$Builder;
    //   118: astore_2
    //   119: aload_2
    //   120: invokestatic applyCustomBuilder : (Lokhttp3/OkHttpClient$Builder;)V
    //   123: iload #9
    //   125: ifne -> 136
    //   128: aload_2
    //   129: getstatic okhttp3/CookieJar.NO_COOKIES : Lokhttp3/CookieJar;
    //   132: invokevirtual cookieJar : (Lokhttp3/CookieJar;)Lokhttp3/OkHttpClient$Builder;
    //   135: pop
    //   136: iload #7
    //   138: ifeq -> 159
    //   141: aload_2
    //   142: new com/facebook/react/modules/network/NetworkingModule$a
    //   145: dup
    //   146: aload_0
    //   147: aload #6
    //   149: aload #10
    //   151: iload_3
    //   152: invokespecial <init> : (Lcom/facebook/react/modules/network/NetworkingModule;Ljava/lang/String;Lcom/facebook/react/modules/core/DeviceEventManagerModule$RCTDeviceEventEmitter;I)V
    //   155: invokevirtual addNetworkInterceptor : (Lokhttp3/Interceptor;)Lokhttp3/OkHttpClient$Builder;
    //   158: pop
    //   159: iload #8
    //   161: aload_0
    //   162: getfield mClient : Lokhttp3/OkHttpClient;
    //   165: invokevirtual connectTimeoutMillis : ()I
    //   168: if_icmpeq -> 182
    //   171: aload_2
    //   172: iload #8
    //   174: i2l
    //   175: getstatic java/util/concurrent/TimeUnit.MILLISECONDS : Ljava/util/concurrent/TimeUnit;
    //   178: invokevirtual connectTimeout : (JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;
    //   181: pop
    //   182: aload_2
    //   183: invokevirtual build : ()Lokhttp3/OkHttpClient;
    //   186: astore #12
    //   188: aload_0
    //   189: aload #4
    //   191: aload #5
    //   193: invokespecial extractHeaders : (Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/ReadableMap;)Lokhttp3/Headers;
    //   196: astore_2
    //   197: aload_2
    //   198: ifnonnull -> 212
    //   201: aload #10
    //   203: iload_3
    //   204: ldc_w 'Unrecognized headers format'
    //   207: aconst_null
    //   208: invokestatic a : (Lcom/facebook/react/modules/core/DeviceEventManagerModule$RCTDeviceEventEmitter;ILjava/lang/String;Ljava/lang/Throwable;)V
    //   211: return
    //   212: aload_2
    //   213: ldc 'content-type'
    //   215: invokevirtual get : (Ljava/lang/String;)Ljava/lang/String;
    //   218: astore #4
    //   220: aload_2
    //   221: ldc 'content-encoding'
    //   223: invokevirtual get : (Ljava/lang/String;)Ljava/lang/String;
    //   226: astore #13
    //   228: aload #11
    //   230: aload_2
    //   231: invokevirtual headers : (Lokhttp3/Headers;)Lokhttp3/Request$Builder;
    //   234: pop
    //   235: aload #5
    //   237: ifnull -> 286
    //   240: aload_0
    //   241: getfield mRequestBodyHandlers : Ljava/util/List;
    //   244: invokeinterface iterator : ()Ljava/util/Iterator;
    //   249: astore #14
    //   251: aload #14
    //   253: invokeinterface hasNext : ()Z
    //   258: ifeq -> 286
    //   261: aload #14
    //   263: invokeinterface next : ()Ljava/lang/Object;
    //   268: checkcast com/facebook/react/modules/network/NetworkingModule$f
    //   271: astore_2
    //   272: aload_2
    //   273: aload #5
    //   275: invokeinterface a : (Lcom/facebook/react/bridge/ReadableMap;)Z
    //   280: ifeq -> 251
    //   283: goto -> 288
    //   286: aconst_null
    //   287: astore_2
    //   288: aload #5
    //   290: ifnull -> 664
    //   293: aload_1
    //   294: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   297: ldc_w 'get'
    //   300: invokevirtual equals : (Ljava/lang/Object;)Z
    //   303: ifne -> 664
    //   306: aload_1
    //   307: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   310: ldc_w 'head'
    //   313: invokevirtual equals : (Ljava/lang/Object;)Z
    //   316: ifeq -> 322
    //   319: goto -> 664
    //   322: aload_2
    //   323: ifnull -> 340
    //   326: aload_2
    //   327: aload #5
    //   329: aload #4
    //   331: invokeinterface a : (Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Lokhttp3/RequestBody;
    //   336: astore_2
    //   337: goto -> 669
    //   340: aload #5
    //   342: ldc 'string'
    //   344: invokeinterface hasKey : (Ljava/lang/String;)Z
    //   349: ifeq -> 456
    //   352: aload #4
    //   354: ifnonnull -> 368
    //   357: aload #10
    //   359: iload_3
    //   360: ldc_w 'Payload is set but no content-type header specified'
    //   363: aconst_null
    //   364: invokestatic a : (Lcom/facebook/react/modules/core/DeviceEventManagerModule$RCTDeviceEventEmitter;ILjava/lang/String;Ljava/lang/Throwable;)V
    //   367: return
    //   368: aload #5
    //   370: ldc 'string'
    //   372: invokeinterface getString : (Ljava/lang/String;)Ljava/lang/String;
    //   377: astore #5
    //   379: aload #4
    //   381: invokestatic parse : (Ljava/lang/String;)Lokhttp3/MediaType;
    //   384: astore #4
    //   386: aload #13
    //   388: invokestatic b : (Ljava/lang/String;)Z
    //   391: ifeq -> 422
    //   394: aload #4
    //   396: aload #5
    //   398: invokestatic a : (Lokhttp3/MediaType;Ljava/lang/String;)Lokhttp3/RequestBody;
    //   401: astore #4
    //   403: aload #4
    //   405: astore_2
    //   406: aload #4
    //   408: ifnonnull -> 669
    //   411: aload #10
    //   413: iload_3
    //   414: ldc_w 'Failed to gzip request body'
    //   417: aconst_null
    //   418: invokestatic a : (Lcom/facebook/react/modules/core/DeviceEventManagerModule$RCTDeviceEventEmitter;ILjava/lang/String;Ljava/lang/Throwable;)V
    //   421: return
    //   422: getstatic com/facebook/react/common/h.a : Ljava/nio/charset/Charset;
    //   425: astore_2
    //   426: aload #4
    //   428: ifnonnull -> 434
    //   431: goto -> 441
    //   434: aload #4
    //   436: aload_2
    //   437: invokevirtual charset : (Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;
    //   440: astore_2
    //   441: aload #4
    //   443: aload #5
    //   445: aload_2
    //   446: invokevirtual getBytes : (Ljava/nio/charset/Charset;)[B
    //   449: invokestatic create : (Lokhttp3/MediaType;[B)Lokhttp3/RequestBody;
    //   452: astore_2
    //   453: goto -> 669
    //   456: aload #5
    //   458: ldc 'base64'
    //   460: invokeinterface hasKey : (Ljava/lang/String;)Z
    //   465: ifeq -> 510
    //   468: aload #4
    //   470: ifnonnull -> 484
    //   473: aload #10
    //   475: iload_3
    //   476: ldc_w 'Payload is set but no content-type header specified'
    //   479: aconst_null
    //   480: invokestatic a : (Lcom/facebook/react/modules/core/DeviceEventManagerModule$RCTDeviceEventEmitter;ILjava/lang/String;Ljava/lang/Throwable;)V
    //   483: return
    //   484: aload #5
    //   486: ldc 'base64'
    //   488: invokeinterface getString : (Ljava/lang/String;)Ljava/lang/String;
    //   493: astore_2
    //   494: aload #4
    //   496: invokestatic parse : (Ljava/lang/String;)Lokhttp3/MediaType;
    //   499: aload_2
    //   500: invokestatic a : (Ljava/lang/String;)Lj/f;
    //   503: invokestatic create : (Lokhttp3/MediaType;Lj/f;)Lokhttp3/RequestBody;
    //   506: astore_2
    //   507: goto -> 669
    //   510: aload #5
    //   512: ldc 'uri'
    //   514: invokeinterface hasKey : (Ljava/lang/String;)Z
    //   519: ifeq -> 611
    //   522: aload #4
    //   524: ifnonnull -> 538
    //   527: aload #10
    //   529: iload_3
    //   530: ldc_w 'Payload is set but no content-type header specified'
    //   533: aconst_null
    //   534: invokestatic a : (Lcom/facebook/react/modules/core/DeviceEventManagerModule$RCTDeviceEventEmitter;ILjava/lang/String;Ljava/lang/Throwable;)V
    //   537: return
    //   538: aload #5
    //   540: ldc 'uri'
    //   542: invokeinterface getString : (Ljava/lang/String;)Ljava/lang/String;
    //   547: astore_2
    //   548: aload_0
    //   549: invokevirtual getReactApplicationContext : ()Lcom/facebook/react/bridge/ReactApplicationContext;
    //   552: aload_2
    //   553: invokestatic a : (Landroid/content/Context;Ljava/lang/String;)Ljava/io/InputStream;
    //   556: astore #5
    //   558: aload #5
    //   560: ifnonnull -> 597
    //   563: new java/lang/StringBuilder
    //   566: dup
    //   567: invokespecial <init> : ()V
    //   570: astore_1
    //   571: aload_1
    //   572: ldc_w 'Could not retrieve file for uri '
    //   575: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   578: pop
    //   579: aload_1
    //   580: aload_2
    //   581: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   584: pop
    //   585: aload #10
    //   587: iload_3
    //   588: aload_1
    //   589: invokevirtual toString : ()Ljava/lang/String;
    //   592: aconst_null
    //   593: invokestatic a : (Lcom/facebook/react/modules/core/DeviceEventManagerModule$RCTDeviceEventEmitter;ILjava/lang/String;Ljava/lang/Throwable;)V
    //   596: return
    //   597: aload #4
    //   599: invokestatic parse : (Ljava/lang/String;)Lokhttp3/MediaType;
    //   602: aload #5
    //   604: invokestatic a : (Lokhttp3/MediaType;Ljava/io/InputStream;)Lokhttp3/RequestBody;
    //   607: astore_2
    //   608: goto -> 669
    //   611: aload #5
    //   613: ldc 'formData'
    //   615: invokeinterface hasKey : (Ljava/lang/String;)Z
    //   620: ifeq -> 664
    //   623: aload #4
    //   625: astore_2
    //   626: aload #4
    //   628: ifnonnull -> 635
    //   631: ldc_w 'multipart/form-data'
    //   634: astore_2
    //   635: aload_0
    //   636: aload #5
    //   638: ldc 'formData'
    //   640: invokeinterface getArray : (Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableArray;
    //   645: aload_2
    //   646: iload_3
    //   647: invokespecial constructMultipartBody : (Lcom/facebook/react/bridge/ReadableArray;Ljava/lang/String;I)Lokhttp3/MultipartBody$Builder;
    //   650: astore_2
    //   651: aload_2
    //   652: ifnonnull -> 656
    //   655: return
    //   656: aload_2
    //   657: invokevirtual build : ()Lokhttp3/MultipartBody;
    //   660: astore_2
    //   661: goto -> 669
    //   664: aload_1
    //   665: invokestatic a : (Ljava/lang/String;)Lokhttp3/RequestBody;
    //   668: astore_2
    //   669: aload #11
    //   671: aload_1
    //   672: aload_0
    //   673: aload_2
    //   674: aload #10
    //   676: iload_3
    //   677: invokespecial wrapRequestBodyWithProgressEmitter : (Lokhttp3/RequestBody;Lcom/facebook/react/modules/core/DeviceEventManagerModule$RCTDeviceEventEmitter;I)Lokhttp3/RequestBody;
    //   680: invokevirtual method : (Ljava/lang/String;Lokhttp3/RequestBody;)Lokhttp3/Request$Builder;
    //   683: pop
    //   684: aload_0
    //   685: iload_3
    //   686: invokespecial addRequest : (I)V
    //   689: aload #12
    //   691: aload #11
    //   693: invokevirtual build : ()Lokhttp3/Request;
    //   696: invokevirtual newCall : (Lokhttp3/Request;)Lokhttp3/Call;
    //   699: new com/facebook/react/modules/network/NetworkingModule$b
    //   702: dup
    //   703: aload_0
    //   704: iload_3
    //   705: aload #10
    //   707: aload #6
    //   709: iload #7
    //   711: invokespecial <init> : (Lcom/facebook/react/modules/network/NetworkingModule;ILcom/facebook/react/modules/core/DeviceEventManagerModule$RCTDeviceEventEmitter;Ljava/lang/String;Z)V
    //   714: invokeinterface enqueue : (Lokhttp3/Callback;)V
    //   719: return
    //   720: astore_1
    //   721: aload #10
    //   723: iload_3
    //   724: aload_1
    //   725: invokevirtual getMessage : ()Ljava/lang/String;
    //   728: aconst_null
    //   729: invokestatic a : (Lcom/facebook/react/modules/core/DeviceEventManagerModule$RCTDeviceEventEmitter;ILjava/lang/String;Ljava/lang/Throwable;)V
    //   732: return
    //   733: astore_1
    //   734: aload #10
    //   736: iload_3
    //   737: aload_1
    //   738: invokevirtual getMessage : ()Ljava/lang/String;
    //   741: aload_1
    //   742: invokestatic a : (Lcom/facebook/react/modules/core/DeviceEventManagerModule$RCTDeviceEventEmitter;ILjava/lang/String;Ljava/lang/Throwable;)V
    //   745: return
    // Exception table:
    //   from	to	target	type
    //   9	26	733	java/io/IOException
    //   26	83	733	java/io/IOException
    //   84	97	720	java/lang/Exception
  }
  
  class a implements Interceptor {
    a(NetworkingModule this$0, String param1String, DeviceEventManagerModule.RCTDeviceEventEmitter param1RCTDeviceEventEmitter, int param1Int) {}
    
    public Response intercept(Interceptor.Chain param1Chain) {
      Response response = param1Chain.proceed(param1Chain.request());
      j j = new j(response.body(), new a(this));
      return response.newBuilder().body(j).build();
    }
    
    class a implements h {
      long a = System.nanoTime();
      
      a(NetworkingModule.a this$0) {}
      
      public void a(long param2Long1, long param2Long2, boolean param2Boolean) {
        long l = System.nanoTime();
        if (!param2Boolean && !NetworkingModule.shouldDispatch(l, this.a))
          return; 
        if (this.b.a.equals("text"))
          return; 
        NetworkingModule.a a1 = this.b;
        n.a(a1.b, a1.c, param2Long1, param2Long2);
        this.a = l;
      }
    }
  }
  
  class a implements h {
    long a = System.nanoTime();
    
    a(NetworkingModule this$0) {}
    
    public void a(long param1Long1, long param1Long2, boolean param1Boolean) {
      long l = System.nanoTime();
      if (!param1Boolean && !NetworkingModule.shouldDispatch(l, this.a))
        return; 
      if (this.b.a.equals("text"))
        return; 
      NetworkingModule.a a1 = this.b;
      n.a(a1.b, a1.c, param1Long1, param1Long2);
      this.a = l;
    }
  }
  
  class b implements Callback {
    b(NetworkingModule this$0, int param1Int, DeviceEventManagerModule.RCTDeviceEventEmitter param1RCTDeviceEventEmitter, String param1String, boolean param1Boolean) {}
    
    public void onFailure(Call param1Call, IOException param1IOException) {
      String str;
      if (this.e.mShuttingDown)
        return; 
      this.e.removeRequest(this.a);
      if (param1IOException.getMessage() != null) {
        str = param1IOException.getMessage();
      } else {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Error while executing request: ");
        stringBuilder.append(param1IOException.getClass().getSimpleName());
        str = stringBuilder.toString();
      } 
      n.a(this.b, this.a, str, param1IOException);
    }
    
    public void onResponse(Call param1Call, Response param1Response) {
      if (this.e.mShuttingDown)
        return; 
      this.e.removeRequest(this.a);
      n.a(this.b, this.a, param1Response.code(), NetworkingModule.translateHeaders(param1Response.headers()), param1Response.request().url().toString());
      try {
        ResponseBody responseBody1 = param1Response.body();
        ResponseBody responseBody2 = responseBody1;
        if ("gzip".equalsIgnoreCase(param1Response.header("Content-Encoding"))) {
          responseBody2 = responseBody1;
          if (responseBody1 != null) {
            j j = new j((t)responseBody1.source());
            String str1 = param1Response.header("Content-Type");
            if (str1 != null) {
              MediaType mediaType = MediaType.parse(str1);
            } else {
              str1 = null;
            } 
            responseBody2 = ResponseBody.create((MediaType)str1, -1L, l.a((t)j));
          } 
        } 
        Iterator<NetworkingModule.g> iterator = this.e.mResponseHandlers.iterator();
        while (iterator.hasNext()) {
          NetworkingModule.g g = iterator.next();
          if (g.a(this.c)) {
            WritableMap writableMap = g.a(responseBody2);
            n.a(this.b, this.a, writableMap);
            n.a(this.b, this.a);
            return;
          } 
        } 
        boolean bool = this.d;
        if (bool && this.c.equals("text")) {
          this.e.readWithProgress(this.b, this.a, responseBody2);
          n.a(this.b, this.a);
          return;
        } 
        String str = "";
        bool = this.c.equals("text");
        if (bool) {
          try {
            String str1 = responseBody2.string();
            str = str1;
          } catch (IOException iOException) {
            if (!param1Response.request().method().equalsIgnoreCase("HEAD"))
              n.a(this.b, this.a, iOException.getMessage(), iOException); 
          } 
        } else if (this.c.equals("base64")) {
          str = Base64.encodeToString(iOException.bytes(), 2);
        } 
        n.a(this.b, this.a, str);
        n.a(this.b, this.a);
        return;
      } catch (IOException iOException) {
        n.a(this.b, this.a, iOException.getMessage(), iOException);
        return;
      } 
    }
  }
  
  class c implements h {
    long a = System.nanoTime();
    
    c(NetworkingModule this$0, DeviceEventManagerModule.RCTDeviceEventEmitter param1RCTDeviceEventEmitter, int param1Int) {}
    
    public void a(long param1Long1, long param1Long2, boolean param1Boolean) {
      long l = System.nanoTime();
      if (param1Boolean || NetworkingModule.shouldDispatch(l, this.a)) {
        n.b(this.b, this.c, param1Long1, param1Long2);
        this.a = l;
      } 
    }
  }
  
  class d extends GuardedAsyncTask<Void, Void> {
    d(NetworkingModule this$0, ReactContext param1ReactContext, int param1Int) {
      super(param1ReactContext);
    }
    
    protected void a(Void... param1VarArgs) {
      com.facebook.react.common.j.a.a(this.b.mClient, Integer.valueOf(this.a));
    }
  }
  
  public static interface e {
    void a(OkHttpClient.Builder param1Builder);
  }
  
  public static interface f {
    RequestBody a(ReadableMap param1ReadableMap, String param1String);
    
    boolean a(ReadableMap param1ReadableMap);
  }
  
  public static interface g {
    WritableMap a(ResponseBody param1ResponseBody);
    
    boolean a(String param1String);
  }
  
  public static interface h {
    WritableMap a(Uri param1Uri);
    
    boolean a(Uri param1Uri, String param1String);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/modules/network/NetworkingModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */