package com.facebook.react.modules.websocket;

import com.facebook.fbreact.specs.NativeWebSocketModuleSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.network.c;
import e.e.o.d0.a.a;
import j.f;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;

@a(hasConstants = false, name = "WebSocketModule")
public final class WebSocketModule extends NativeWebSocketModuleSpec {
  public static final String NAME = "WebSocketModule";
  
  public static final String TAG = "WebSocketModule";
  
  private final Map<Integer, b> mContentHandlers = new ConcurrentHashMap<Integer, b>();
  
  private c mCookieHandler;
  
  private final Map<Integer, WebSocket> mWebSocketConnections = new ConcurrentHashMap<Integer, WebSocket>();
  
  public WebSocketModule(ReactApplicationContext paramReactApplicationContext) {
    super(paramReactApplicationContext);
    this.mCookieHandler = new c((ReactContext)paramReactApplicationContext);
  }
  
  private String getCookie(String paramString) {
    try {
      URI uRI = new URI(getDefaultOrigin(paramString));
      List<String> list = (List)this.mCookieHandler.get(uRI, new HashMap<Object, Object>()).get("Cookie");
      return (list == null || list.isEmpty()) ? null : list.get(0);
    } catch (URISyntaxException|java.io.IOException uRISyntaxException) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Unable to get cookie from ");
      stringBuilder.append(paramString);
      throw new IllegalArgumentException(stringBuilder.toString());
    } 
  }
  
  private static String getDefaultOrigin(String paramString) {
    // Byte code:
    //   0: ldc ''
    //   2: astore_2
    //   3: new java/net/URI
    //   6: dup
    //   7: aload_0
    //   8: invokespecial <init> : (Ljava/lang/String;)V
    //   11: astore_3
    //   12: aload_3
    //   13: invokevirtual getScheme : ()Ljava/lang/String;
    //   16: astore #4
    //   18: aload #4
    //   20: invokevirtual hashCode : ()I
    //   23: istore_1
    //   24: iload_1
    //   25: sipush #3804
    //   28: if_icmpeq -> 97
    //   31: iload_1
    //   32: ldc 118039
    //   34: if_icmpeq -> 82
    //   37: iload_1
    //   38: ldc 3213448
    //   40: if_icmpeq -> 67
    //   43: iload_1
    //   44: ldc 99617003
    //   46: if_icmpeq -> 52
    //   49: goto -> 308
    //   52: aload #4
    //   54: ldc 'https'
    //   56: invokevirtual equals : (Ljava/lang/Object;)Z
    //   59: ifeq -> 308
    //   62: iconst_3
    //   63: istore_1
    //   64: goto -> 310
    //   67: aload #4
    //   69: ldc 'http'
    //   71: invokevirtual equals : (Ljava/lang/Object;)Z
    //   74: ifeq -> 308
    //   77: iconst_2
    //   78: istore_1
    //   79: goto -> 310
    //   82: aload #4
    //   84: ldc 'wss'
    //   86: invokevirtual equals : (Ljava/lang/Object;)Z
    //   89: ifeq -> 308
    //   92: iconst_0
    //   93: istore_1
    //   94: goto -> 310
    //   97: aload #4
    //   99: ldc 'ws'
    //   101: invokevirtual equals : (Ljava/lang/Object;)Z
    //   104: ifeq -> 308
    //   107: iconst_1
    //   108: istore_1
    //   109: goto -> 310
    //   112: new java/lang/StringBuilder
    //   115: dup
    //   116: invokespecial <init> : ()V
    //   119: astore_2
    //   120: aload_2
    //   121: ldc ''
    //   123: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   126: pop
    //   127: aload_2
    //   128: aload_3
    //   129: invokevirtual getScheme : ()Ljava/lang/String;
    //   132: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   135: pop
    //   136: aload_2
    //   137: invokevirtual toString : ()Ljava/lang/String;
    //   140: astore_2
    //   141: goto -> 194
    //   144: new java/lang/StringBuilder
    //   147: dup
    //   148: invokespecial <init> : ()V
    //   151: astore_2
    //   152: aload_2
    //   153: ldc ''
    //   155: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   158: pop
    //   159: aload_2
    //   160: ldc 'http'
    //   162: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   165: pop
    //   166: goto -> 136
    //   169: new java/lang/StringBuilder
    //   172: dup
    //   173: invokespecial <init> : ()V
    //   176: astore_2
    //   177: aload_2
    //   178: ldc ''
    //   180: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   183: pop
    //   184: aload_2
    //   185: ldc 'https'
    //   187: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   190: pop
    //   191: goto -> 136
    //   194: aload_3
    //   195: invokevirtual getPort : ()I
    //   198: iconst_m1
    //   199: if_icmpeq -> 233
    //   202: ldc '%s://%s:%s'
    //   204: iconst_3
    //   205: anewarray java/lang/Object
    //   208: dup
    //   209: iconst_0
    //   210: aload_2
    //   211: aastore
    //   212: dup
    //   213: iconst_1
    //   214: aload_3
    //   215: invokevirtual getHost : ()Ljava/lang/String;
    //   218: aastore
    //   219: dup
    //   220: iconst_2
    //   221: aload_3
    //   222: invokevirtual getPort : ()I
    //   225: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   228: aastore
    //   229: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   232: areturn
    //   233: ldc '%s://%s'
    //   235: iconst_2
    //   236: anewarray java/lang/Object
    //   239: dup
    //   240: iconst_0
    //   241: aload_2
    //   242: aastore
    //   243: dup
    //   244: iconst_1
    //   245: aload_3
    //   246: invokevirtual getHost : ()Ljava/lang/String;
    //   249: aastore
    //   250: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   253: astore_2
    //   254: aload_2
    //   255: areturn
    //   256: new java/lang/StringBuilder
    //   259: dup
    //   260: invokespecial <init> : ()V
    //   263: astore_2
    //   264: aload_2
    //   265: ldc 'Unable to set '
    //   267: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   270: pop
    //   271: aload_2
    //   272: aload_0
    //   273: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   276: pop
    //   277: aload_2
    //   278: ldc ' as default origin header'
    //   280: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   283: pop
    //   284: new java/lang/IllegalArgumentException
    //   287: dup
    //   288: aload_2
    //   289: invokevirtual toString : ()Ljava/lang/String;
    //   292: invokespecial <init> : (Ljava/lang/String;)V
    //   295: astore_0
    //   296: goto -> 301
    //   299: aload_0
    //   300: athrow
    //   301: goto -> 299
    //   304: astore_2
    //   305: goto -> 256
    //   308: iconst_m1
    //   309: istore_1
    //   310: iload_1
    //   311: ifeq -> 169
    //   314: iload_1
    //   315: iconst_1
    //   316: if_icmpeq -> 144
    //   319: iload_1
    //   320: iconst_2
    //   321: if_icmpeq -> 112
    //   324: iload_1
    //   325: iconst_3
    //   326: if_icmpeq -> 112
    //   329: goto -> 194
    // Exception table:
    //   from	to	target	type
    //   3	24	304	java/net/URISyntaxException
    //   52	62	304	java/net/URISyntaxException
    //   67	77	304	java/net/URISyntaxException
    //   82	92	304	java/net/URISyntaxException
    //   97	107	304	java/net/URISyntaxException
    //   112	136	304	java/net/URISyntaxException
    //   136	141	304	java/net/URISyntaxException
    //   144	166	304	java/net/URISyntaxException
    //   169	191	304	java/net/URISyntaxException
    //   194	233	304	java/net/URISyntaxException
    //   233	254	304	java/net/URISyntaxException
  }
  
  private void notifyWebSocketFailed(int paramInt, String paramString) {
    WritableMap writableMap = Arguments.createMap();
    writableMap.putInt("id", paramInt);
    writableMap.putString("message", paramString);
    sendEvent("websocketFailed", writableMap);
  }
  
  private void sendEvent(String paramString, WritableMap paramWritableMap) {
    ReactApplicationContext reactApplicationContext = getReactApplicationContextIfActiveOrWarn();
    if (reactApplicationContext != null)
      ((DeviceEventManagerModule.RCTDeviceEventEmitter)reactApplicationContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(paramString, paramWritableMap); 
  }
  
  public void addListener(String paramString) {}
  
  public void close(double paramDouble1, String paramString, double paramDouble2) {
    int i = (int)paramDouble2;
    WebSocket webSocket = this.mWebSocketConnections.get(Integer.valueOf(i));
    if (webSocket == null)
      return; 
    int j = (int)paramDouble1;
    try {
      webSocket.close(j, paramString);
      this.mWebSocketConnections.remove(Integer.valueOf(i));
      this.mContentHandlers.remove(Integer.valueOf(i));
      return;
    } catch (Exception exception) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Could not close WebSocket connection for id ");
      stringBuilder.append(i);
      e.e.e.e.a.b("ReactNative", stringBuilder.toString(), exception);
      return;
    } 
  }
  
  public void connect(String paramString, ReadableArray paramReadableArray, ReadableMap paramReadableMap, double paramDouble) {
    boolean bool;
    int i = (int)paramDouble;
    OkHttpClient okHttpClient = (new OkHttpClient.Builder()).connectTimeout(10L, TimeUnit.SECONDS).writeTimeout(10L, TimeUnit.SECONDS).readTimeout(0L, TimeUnit.MINUTES).build();
    Request.Builder builder = (new Request.Builder()).tag(Integer.valueOf(i)).url(paramString);
    String str = getCookie(paramString);
    if (str != null)
      builder.addHeader("Cookie", str); 
    byte b = 0;
    if (paramReadableMap != null && paramReadableMap.hasKey("headers") && paramReadableMap.getType("headers").equals(ReadableType.Map)) {
      paramReadableMap = paramReadableMap.getMap("headers");
      ReadableMapKeySetIterator readableMapKeySetIterator = paramReadableMap.keySetIterator();
      boolean bool1 = false;
      while (true) {
        bool = bool1;
        if (readableMapKeySetIterator.hasNextKey()) {
          String str1 = readableMapKeySetIterator.nextKey();
          if (ReadableType.String.equals(paramReadableMap.getType(str1))) {
            if (str1.equalsIgnoreCase("origin"))
              bool1 = true; 
            builder.addHeader(str1, paramReadableMap.getString(str1));
            continue;
          } 
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Ignoring: requested ");
          stringBuilder.append(str1);
          stringBuilder.append(", value not a string");
          e.e.e.e.a.e("ReactNative", stringBuilder.toString());
          continue;
        } 
        break;
      } 
    } else {
      bool = false;
    } 
    if (!bool)
      builder.addHeader("origin", getDefaultOrigin(paramString)); 
    if (paramReadableArray != null && paramReadableArray.size() > 0) {
      StringBuilder stringBuilder = new StringBuilder("");
      int j;
      for (j = b; j < paramReadableArray.size(); j++) {
        String str1 = paramReadableArray.getString(j).trim();
        if (!str1.isEmpty() && !str1.contains(",")) {
          stringBuilder.append(str1);
          stringBuilder.append(",");
        } 
      } 
      if (stringBuilder.length() > 0) {
        stringBuilder.replace(stringBuilder.length() - 1, stringBuilder.length(), "");
        builder.addHeader("Sec-WebSocket-Protocol", stringBuilder.toString());
      } 
    } 
    okHttpClient.newWebSocket(builder.build(), new a(this, i));
    okHttpClient.dispatcher().executorService().shutdown();
  }
  
  public String getName() {
    return "WebSocketModule";
  }
  
  public void ping(double paramDouble) {
    WritableMap writableMap;
    int i = (int)paramDouble;
    WebSocket webSocket = this.mWebSocketConnections.get(Integer.valueOf(i));
    if (webSocket == null) {
      writableMap = Arguments.createMap();
      writableMap.putInt("id", i);
      writableMap.putString("message", "client is null");
      sendEvent("websocketFailed", writableMap);
      writableMap = Arguments.createMap();
      writableMap.putInt("id", i);
      writableMap.putInt("code", 0);
      writableMap.putString("reason", "client is null");
      sendEvent("websocketClosed", writableMap);
      this.mWebSocketConnections.remove(Integer.valueOf(i));
      this.mContentHandlers.remove(Integer.valueOf(i));
      return;
    } 
    try {
      writableMap.send(f.f);
      return;
    } catch (Exception exception) {
      notifyWebSocketFailed(i, exception.getMessage());
      return;
    } 
  }
  
  public void removeListeners(double paramDouble) {}
  
  public void send(String paramString, double paramDouble) {
    WritableMap writableMap;
    int i = (int)paramDouble;
    WebSocket webSocket = this.mWebSocketConnections.get(Integer.valueOf(i));
    if (webSocket == null) {
      writableMap = Arguments.createMap();
      writableMap.putInt("id", i);
      writableMap.putString("message", "client is null");
      sendEvent("websocketFailed", writableMap);
      writableMap = Arguments.createMap();
      writableMap.putInt("id", i);
      writableMap.putInt("code", 0);
      writableMap.putString("reason", "client is null");
      sendEvent("websocketClosed", writableMap);
      this.mWebSocketConnections.remove(Integer.valueOf(i));
      this.mContentHandlers.remove(Integer.valueOf(i));
      return;
    } 
    try {
      webSocket.send((String)writableMap);
      return;
    } catch (Exception exception) {
      notifyWebSocketFailed(i, exception.getMessage());
      return;
    } 
  }
  
  public void sendBinary(f paramf, int paramInt) {
    WritableMap writableMap;
    WebSocket webSocket = this.mWebSocketConnections.get(Integer.valueOf(paramInt));
    if (webSocket == null) {
      writableMap = Arguments.createMap();
      writableMap.putInt("id", paramInt);
      writableMap.putString("message", "client is null");
      sendEvent("websocketFailed", writableMap);
      writableMap = Arguments.createMap();
      writableMap.putInt("id", paramInt);
      writableMap.putInt("code", 0);
      writableMap.putString("reason", "client is null");
      sendEvent("websocketClosed", writableMap);
      this.mWebSocketConnections.remove(Integer.valueOf(paramInt));
      this.mContentHandlers.remove(Integer.valueOf(paramInt));
      return;
    } 
    try {
      webSocket.send((f)writableMap);
      return;
    } catch (Exception exception) {
      notifyWebSocketFailed(paramInt, exception.getMessage());
      return;
    } 
  }
  
  public void sendBinary(String paramString, double paramDouble) {
    WritableMap writableMap;
    int i = (int)paramDouble;
    WebSocket webSocket = this.mWebSocketConnections.get(Integer.valueOf(i));
    if (webSocket == null) {
      writableMap = Arguments.createMap();
      writableMap.putInt("id", i);
      writableMap.putString("message", "client is null");
      sendEvent("websocketFailed", writableMap);
      writableMap = Arguments.createMap();
      writableMap.putInt("id", i);
      writableMap.putInt("code", 0);
      writableMap.putString("reason", "client is null");
      sendEvent("websocketClosed", writableMap);
      this.mWebSocketConnections.remove(Integer.valueOf(i));
      this.mContentHandlers.remove(Integer.valueOf(i));
      return;
    } 
    try {
      webSocket.send(f.a((String)writableMap));
      return;
    } catch (Exception exception) {
      notifyWebSocketFailed(i, exception.getMessage());
      return;
    } 
  }
  
  public void setContentHandler(int paramInt, b paramb) {
    if (paramb != null) {
      this.mContentHandlers.put(Integer.valueOf(paramInt), paramb);
      return;
    } 
    this.mContentHandlers.remove(Integer.valueOf(paramInt));
  }
  
  class a extends WebSocketListener {
    a(WebSocketModule this$0, int param1Int) {}
    
    public void onClosed(WebSocket param1WebSocket, int param1Int, String param1String) {
      WritableMap writableMap = Arguments.createMap();
      writableMap.putInt("id", this.a);
      writableMap.putInt("code", param1Int);
      writableMap.putString("reason", param1String);
      this.b.sendEvent("websocketClosed", writableMap);
    }
    
    public void onClosing(WebSocket param1WebSocket, int param1Int, String param1String) {
      param1WebSocket.close(param1Int, param1String);
    }
    
    public void onFailure(WebSocket param1WebSocket, Throwable param1Throwable, Response param1Response) {
      this.b.notifyWebSocketFailed(this.a, param1Throwable.getMessage());
    }
    
    public void onMessage(WebSocket param1WebSocket, f param1f) {
      WritableMap writableMap = Arguments.createMap();
      writableMap.putInt("id", this.a);
      writableMap.putString("type", "binary");
      WebSocketModule.b b = (WebSocketModule.b)this.b.mContentHandlers.get(Integer.valueOf(this.a));
      if (b != null) {
        b.a(param1f, writableMap);
      } else {
        writableMap.putString("data", param1f.a());
      } 
      this.b.sendEvent("websocketMessage", writableMap);
    }
    
    public void onMessage(WebSocket param1WebSocket, String param1String) {
      WritableMap writableMap = Arguments.createMap();
      writableMap.putInt("id", this.a);
      writableMap.putString("type", "text");
      WebSocketModule.b b = (WebSocketModule.b)this.b.mContentHandlers.get(Integer.valueOf(this.a));
      if (b != null) {
        b.a(param1String, writableMap);
      } else {
        writableMap.putString("data", param1String);
      } 
      this.b.sendEvent("websocketMessage", writableMap);
    }
    
    public void onOpen(WebSocket param1WebSocket, Response param1Response) {
      this.b.mWebSocketConnections.put(Integer.valueOf(this.a), param1WebSocket);
      WritableMap writableMap = Arguments.createMap();
      writableMap.putInt("id", this.a);
      writableMap.putString("protocol", param1Response.header("Sec-WebSocket-Protocol", ""));
      this.b.sendEvent("websocketOpen", writableMap);
    }
  }
  
  public static interface b {
    void a(f param1f, WritableMap param1WritableMap);
    
    void a(String param1String, WritableMap param1WritableMap);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/modules/websocket/WebSocketModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */