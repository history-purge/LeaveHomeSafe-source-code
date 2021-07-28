package com.RNFetchBlob;

import android.app.Activity;
import android.app.DownloadManager;
import android.content.Intent;
import android.net.Uri;
import android.util.SparseArray;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import java.net.CookieHandler;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.CookieJar;
import okhttp3.JavaNetCookieJar;
import okhttp3.OkHttpClient;

public class RNFetchBlob extends ReactContextBaseJavaModule {
  private static boolean ActionViewVisible;
  
  static ReactApplicationContext RCTContext;
  
  static LinkedBlockingQueue<Runnable> fsTaskQueue;
  
  private static ThreadPoolExecutor fsThreadPool;
  
  private static SparseArray<Promise> promiseTable;
  
  private static LinkedBlockingQueue<Runnable> taskQueue = new LinkedBlockingQueue<Runnable>();
  
  private static ThreadPoolExecutor threadPool = new ThreadPoolExecutor(5, 10, 5000L, TimeUnit.MILLISECONDS, taskQueue);
  
  private final OkHttpClient mClient = com.facebook.react.modules.network.g.c();
  
  static {
    fsTaskQueue = new LinkedBlockingQueue<Runnable>();
    fsThreadPool = new ThreadPoolExecutor(2, 10, 5000L, TimeUnit.MILLISECONDS, taskQueue);
    ActionViewVisible = false;
    promiseTable = new SparseArray();
  }
  
  public RNFetchBlob(ReactApplicationContext paramReactApplicationContext) {
    super(paramReactApplicationContext);
    com.facebook.react.modules.network.c c = new com.facebook.react.modules.network.c((ReactContext)paramReactApplicationContext);
    ((com.facebook.react.modules.network.a)this.mClient.cookieJar()).a((CookieJar)new JavaNetCookieJar((CookieHandler)c));
    RCTContext = paramReactApplicationContext;
    paramReactApplicationContext.addActivityEventListener(new d(this));
  }
  
  @ReactMethod
  public void actionViewIntent(String paramString1, String paramString2, Promise paramPromise) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual getCurrentActivity : ()Landroid/app/Activity;
    //   4: astore #5
    //   6: new java/lang/StringBuilder
    //   9: dup
    //   10: invokespecial <init> : ()V
    //   13: astore #6
    //   15: aload #6
    //   17: aload_0
    //   18: invokevirtual getReactApplicationContext : ()Lcom/facebook/react/bridge/ReactApplicationContext;
    //   21: invokevirtual getPackageName : ()Ljava/lang/String;
    //   24: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   27: pop
    //   28: aload #6
    //   30: ldc '.provider'
    //   32: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   35: pop
    //   36: aload #5
    //   38: aload #6
    //   40: invokevirtual toString : ()Ljava/lang/String;
    //   43: new java/io/File
    //   46: dup
    //   47: aload_1
    //   48: invokespecial <init> : (Ljava/lang/String;)V
    //   51: invokestatic a : (Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Landroid/net/Uri;
    //   54: astore #5
    //   56: getstatic android/os/Build$VERSION.SDK_INT : I
    //   59: istore #4
    //   61: iload #4
    //   63: bipush #24
    //   65: if_icmplt -> 124
    //   68: new android/content/Intent
    //   71: dup
    //   72: ldc 'android.intent.action.VIEW'
    //   74: invokespecial <init> : (Ljava/lang/String;)V
    //   77: aload #5
    //   79: aload_2
    //   80: invokevirtual setDataAndType : (Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;
    //   83: astore_1
    //   84: aload_1
    //   85: iconst_1
    //   86: invokevirtual setFlags : (I)Landroid/content/Intent;
    //   89: pop
    //   90: aload_1
    //   91: ldc 268435456
    //   93: invokevirtual addFlags : (I)Landroid/content/Intent;
    //   96: pop
    //   97: aload_1
    //   98: aload_0
    //   99: invokevirtual getCurrentActivity : ()Landroid/app/Activity;
    //   102: invokevirtual getPackageManager : ()Landroid/content/pm/PackageManager;
    //   105: invokevirtual resolveActivity : (Landroid/content/pm/PackageManager;)Landroid/content/ComponentName;
    //   108: ifnull -> 187
    //   111: aload_0
    //   112: invokevirtual getReactApplicationContext : ()Lcom/facebook/react/bridge/ReactApplicationContext;
    //   115: astore_2
    //   116: aload_2
    //   117: aload_1
    //   118: invokevirtual startActivity : (Landroid/content/Intent;)V
    //   121: goto -> 187
    //   124: new android/content/Intent
    //   127: dup
    //   128: ldc 'android.intent.action.VIEW'
    //   130: invokespecial <init> : (Ljava/lang/String;)V
    //   133: astore #5
    //   135: new java/lang/StringBuilder
    //   138: dup
    //   139: invokespecial <init> : ()V
    //   142: astore #6
    //   144: aload #6
    //   146: ldc 'file://'
    //   148: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   151: pop
    //   152: aload #6
    //   154: aload_1
    //   155: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   158: pop
    //   159: aload #5
    //   161: aload #6
    //   163: invokevirtual toString : ()Ljava/lang/String;
    //   166: invokestatic parse : (Ljava/lang/String;)Landroid/net/Uri;
    //   169: aload_2
    //   170: invokevirtual setDataAndType : (Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;
    //   173: ldc 268435456
    //   175: invokevirtual setFlags : (I)Landroid/content/Intent;
    //   178: astore_1
    //   179: aload_0
    //   180: invokevirtual getReactApplicationContext : ()Lcom/facebook/react/bridge/ReactApplicationContext;
    //   183: astore_2
    //   184: goto -> 116
    //   187: iconst_1
    //   188: putstatic com/RNFetchBlob/RNFetchBlob.ActionViewVisible : Z
    //   191: new com/RNFetchBlob/RNFetchBlob$g
    //   194: dup
    //   195: aload_0
    //   196: aload_3
    //   197: invokespecial <init> : (Lcom/RNFetchBlob/RNFetchBlob;Lcom/facebook/react/bridge/Promise;)V
    //   200: astore_1
    //   201: getstatic com/RNFetchBlob/RNFetchBlob.RCTContext : Lcom/facebook/react/bridge/ReactApplicationContext;
    //   204: aload_1
    //   205: invokevirtual addLifecycleEventListener : (Lcom/facebook/react/bridge/LifecycleEventListener;)V
    //   208: return
    //   209: astore_1
    //   210: aload_3
    //   211: ldc 'EUNSPECIFIED'
    //   213: aload_1
    //   214: invokevirtual getLocalizedMessage : ()Ljava/lang/String;
    //   217: invokeinterface reject : (Ljava/lang/String;Ljava/lang/String;)V
    //   222: return
    // Exception table:
    //   from	to	target	type
    //   0	61	209	java/lang/Exception
    //   68	116	209	java/lang/Exception
    //   116	121	209	java/lang/Exception
    //   124	184	209	java/lang/Exception
    //   187	208	209	java/lang/Exception
  }
  
  @ReactMethod
  public void addCompleteDownload(ReadableMap paramReadableMap, Promise paramPromise) {
    String str;
    DownloadManager downloadManager = (DownloadManager)RCTContext.getSystemService("download");
    if (paramReadableMap == null || !paramReadableMap.hasKey("path")) {
      str = "RNFetchblob.addCompleteDownload config or path missing.";
    } else {
      String str1 = d.e(str.getString("path"));
      if (str1 == null) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("RNFetchblob.addCompleteDownload can not resolve URI:");
        stringBuilder.append(str.getString("path"));
        str = stringBuilder.toString();
      } else {
        try {
          String str2;
          String str4;
          WritableMap writableMap = d.f(str1);
          boolean bool = str.hasKey("title");
          String str3 = "";
          if (bool) {
            str2 = str.getString("title");
          } else {
            str2 = "";
          } 
          if (str.hasKey("description"))
            str3 = str.getString("description"); 
          if (str.hasKey("mime")) {
            str4 = str.getString("mime");
          } else {
            str4 = null;
          } 
          long l = Long.valueOf(writableMap.getString("size")).longValue();
          if (str.hasKey("showNotification") && str.getBoolean("showNotification")) {
            bool = true;
          } else {
            bool = false;
          } 
          downloadManager.addCompletedDownload(str2, str3, true, str4, str1, l, bool);
          paramPromise.resolve(null);
          return;
        } catch (Exception exception) {
          paramPromise.reject("EUNSPECIFIED", exception.getLocalizedMessage());
          return;
        } 
      } 
    } 
    paramPromise.reject("EINVAL", (String)exception);
  }
  
  @ReactMethod
  public void cancelRequest(String paramString, Callback paramCallback) {
    try {
      g.a(paramString);
      paramCallback.invoke(new Object[] { null, paramString });
      return;
    } catch (Exception exception) {
      paramCallback.invoke(new Object[] { exception.getLocalizedMessage(), null });
      return;
    } 
  }
  
  @ReactMethod
  public void closeStream(String paramString, Callback paramCallback) {
    d.a(paramString, paramCallback);
  }
  
  @ReactMethod
  public void cp(String paramString1, String paramString2, Callback paramCallback) {
    threadPool.execute(new h(this, paramString1, paramString2, paramCallback));
  }
  
  @ReactMethod
  public void createFile(String paramString1, String paramString2, String paramString3, Promise paramPromise) {
    threadPool.execute(new e(this, paramString1, paramString2, paramString3, paramPromise));
  }
  
  @ReactMethod
  public void createFileASCII(String paramString, ReadableArray paramReadableArray, Promise paramPromise) {
    threadPool.execute(new f(this, paramString, paramReadableArray, paramPromise));
  }
  
  @ReactMethod
  public void df(Callback paramCallback) {
    fsThreadPool.execute(new c(this, paramCallback));
  }
  
  @ReactMethod
  public void enableProgressReport(String paramString, int paramInt1, int paramInt2) {
    f f = new f(true, paramInt1, paramInt2, f.a.d);
    g.x.put(paramString, f);
  }
  
  @ReactMethod
  public void enableUploadProgressReport(String paramString, int paramInt1, int paramInt2) {
    f f = new f(true, paramInt1, paramInt2, f.a.c);
    g.y.put(paramString, f);
  }
  
  @ReactMethod
  public void exists(String paramString, Callback paramCallback) {
    d.b(paramString, paramCallback);
  }
  
  @ReactMethod
  public void fetchBlob(ReadableMap paramReadableMap1, String paramString1, String paramString2, String paramString3, ReadableMap paramReadableMap2, String paramString4, Callback paramCallback) {
    (new g(paramReadableMap1, paramString1, paramString2, paramString3, paramReadableMap2, paramString4, null, this.mClient, paramCallback)).run();
  }
  
  @ReactMethod
  public void fetchBlobForm(ReadableMap paramReadableMap1, String paramString1, String paramString2, String paramString3, ReadableMap paramReadableMap2, ReadableArray paramReadableArray, Callback paramCallback) {
    (new g(paramReadableMap1, paramString1, paramString2, paramString3, paramReadableMap2, null, paramReadableArray, this.mClient, paramCallback)).run();
  }
  
  public Map<String, Object> getConstants() {
    return d.a(getReactApplicationContext());
  }
  
  @ReactMethod
  public void getContentIntent(String paramString, Promise paramPromise) {
    Intent intent = new Intent("android.intent.action.GET_CONTENT");
    if (paramString == null)
      paramString = "*/*"; 
    intent.setType(paramString);
    promiseTable.put(c.a.intValue(), paramPromise);
    getReactApplicationContext().startActivityForResult(intent, c.a.intValue(), null);
  }
  
  public String getName() {
    return "RNFetchBlob";
  }
  
  @ReactMethod
  public void getSDCardApplicationDir(Promise paramPromise) {
    d.a(getReactApplicationContext(), paramPromise);
  }
  
  @ReactMethod
  public void getSDCardDir(Promise paramPromise) {
    d.a(paramPromise);
  }
  
  @ReactMethod
  public void hash(String paramString1, String paramString2, Promise paramPromise) {
    threadPool.execute(new a(this, paramString1, paramString2, paramPromise));
  }
  
  @ReactMethod
  public void ls(String paramString, Promise paramPromise) {
    d.a(paramString, paramPromise);
  }
  
  @ReactMethod
  public void lstat(String paramString, Callback paramCallback) {
    d.c(paramString, paramCallback);
  }
  
  @ReactMethod
  public void mkdir(String paramString, Promise paramPromise) {
    d.b(paramString, paramPromise);
  }
  
  @ReactMethod
  public void mv(String paramString1, String paramString2, Callback paramCallback) {
    d.b(paramString1, paramString2, paramCallback);
  }
  
  @ReactMethod
  public void readFile(String paramString1, String paramString2, Promise paramPromise) {
    threadPool.execute(new i(this, paramString1, paramString2, paramPromise));
  }
  
  @ReactMethod
  public void readStream(String paramString1, String paramString2, int paramInt1, int paramInt2, String paramString3) {
    ReactApplicationContext reactApplicationContext = getReactApplicationContext();
    fsThreadPool.execute(new b(this, reactApplicationContext, paramString1, paramString2, paramInt1, paramInt2, paramString3));
  }
  
  @ReactMethod
  public void removeSession(ReadableArray paramReadableArray, Callback paramCallback) {
    d.a(paramReadableArray, paramCallback);
  }
  
  @ReactMethod
  public void scanFile(ReadableArray paramReadableArray, Callback paramCallback) {
    ReactApplicationContext reactApplicationContext = getReactApplicationContext();
    threadPool.execute(new l(this, paramReadableArray, reactApplicationContext, paramCallback));
  }
  
  @ReactMethod
  public void slice(String paramString1, String paramString2, int paramInt1, int paramInt2, Promise paramPromise) {
    d.a(paramString1, paramString2, paramInt1, paramInt2, "", paramPromise);
  }
  
  @ReactMethod
  public void stat(String paramString, Callback paramCallback) {
    d.d(paramString, paramCallback);
  }
  
  @ReactMethod
  public void unlink(String paramString, Callback paramCallback) {
    d.e(paramString, paramCallback);
  }
  
  @ReactMethod
  public void writeArrayChunk(String paramString, ReadableArray paramReadableArray, Callback paramCallback) {
    d.a(paramString, paramReadableArray, paramCallback);
  }
  
  @ReactMethod
  public void writeChunk(String paramString1, String paramString2, Callback paramCallback) {
    d.c(paramString1, paramString2, paramCallback);
  }
  
  @ReactMethod
  public void writeFile(String paramString1, String paramString2, String paramString3, boolean paramBoolean, Promise paramPromise) {
    threadPool.execute(new k(this, paramString1, paramString2, paramString3, paramBoolean, paramPromise));
  }
  
  @ReactMethod
  public void writeFileArray(String paramString, ReadableArray paramReadableArray, boolean paramBoolean, Promise paramPromise) {
    threadPool.execute(new j(this, paramString, paramReadableArray, paramBoolean, paramPromise));
  }
  
  @ReactMethod
  public void writeStream(String paramString1, String paramString2, boolean paramBoolean, Callback paramCallback) {
    (new d(getReactApplicationContext())).a(paramString1, paramString2, paramBoolean, paramCallback);
  }
  
  class a implements Runnable {
    a(RNFetchBlob this$0, String param1String1, String param1String2, Promise param1Promise) {}
    
    public void run() {
      d.a(this.c, this.d, this.e);
    }
  }
  
  class b implements Runnable {
    b(RNFetchBlob this$0, ReactApplicationContext param1ReactApplicationContext, String param1String1, String param1String2, int param1Int1, int param1Int2, String param1String3) {}
    
    public void run() {
      (new d(this.c)).a(this.d, this.e, this.f, this.g, this.h);
    }
  }
  
  class c implements Runnable {
    c(RNFetchBlob this$0, Callback param1Callback) {}
    
    public void run() {
      d.a(this.c);
    }
  }
  
  class d implements ActivityEventListener {
    d(RNFetchBlob this$0) {}
    
    public void onActivityResult(Activity param1Activity, int param1Int1, int param1Int2, Intent param1Intent) {
      if (param1Int1 == c.a.intValue() && param1Int2 == -1) {
        Uri uri = param1Intent.getData();
        ((Promise)RNFetchBlob.promiseTable.get(c.a.intValue())).resolve(uri.toString());
        RNFetchBlob.promiseTable.remove(c.a.intValue());
      } 
    }
    
    public void onNewIntent(Intent param1Intent) {}
  }
  
  class e implements Runnable {
    e(RNFetchBlob this$0, String param1String1, String param1String2, String param1String3, Promise param1Promise) {}
    
    public void run() {
      d.a(this.c, this.d, this.e, this.f);
    }
  }
  
  class f implements Runnable {
    f(RNFetchBlob this$0, String param1String, ReadableArray param1ReadableArray, Promise param1Promise) {}
    
    public void run() {
      d.a(this.c, this.d, this.e);
    }
  }
  
  class g implements LifecycleEventListener {
    g(RNFetchBlob this$0, Promise param1Promise) {}
    
    public void onHostDestroy() {}
    
    public void onHostPause() {}
    
    public void onHostResume() {
      if (RNFetchBlob.ActionViewVisible)
        this.c.resolve(null); 
      RNFetchBlob.RCTContext.removeLifecycleEventListener(this);
    }
  }
  
  class h implements Runnable {
    h(RNFetchBlob this$0, String param1String1, String param1String2, Callback param1Callback) {}
    
    public void run() {
      d.a(this.c, this.d, this.e);
    }
  }
  
  class i implements Runnable {
    i(RNFetchBlob this$0, String param1String1, String param1String2, Promise param1Promise) {}
    
    public void run() {
      d.b(this.c, this.d, this.e);
    }
  }
  
  class j implements Runnable {
    j(RNFetchBlob this$0, String param1String, ReadableArray param1ReadableArray, boolean param1Boolean, Promise param1Promise) {}
    
    public void run() {
      d.a(this.c, this.d, this.e, this.f);
    }
  }
  
  class k implements Runnable {
    k(RNFetchBlob this$0, String param1String1, String param1String2, String param1String3, boolean param1Boolean, Promise param1Promise) {}
    
    public void run() {
      d.a(this.c, this.d, this.e, this.f, this.g);
    }
  }
  
  class l implements Runnable {
    l(RNFetchBlob this$0, ReadableArray param1ReadableArray, ReactApplicationContext param1ReactApplicationContext, Callback param1Callback) {}
    
    public void run() {
      int j = this.c.size();
      String[] arrayOfString1 = new String[j];
      String[] arrayOfString2 = new String[j];
      for (int i = 0; i < j; i++) {
        ReadableMap readableMap = this.c.getMap(i);
        if (readableMap.hasKey("path")) {
          arrayOfString1[i] = readableMap.getString("path");
          if (readableMap.hasKey("mime")) {
            arrayOfString2[i] = readableMap.getString("mime");
          } else {
            arrayOfString2[i] = null;
          } 
        } 
      } 
      (new d(this.d)).a(arrayOfString1, arrayOfString2, this.e);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/RNFetchBlob/RNFetchBlob.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */