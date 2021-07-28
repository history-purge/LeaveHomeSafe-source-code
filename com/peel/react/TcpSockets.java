package com.peel.react;

import android.util.Base64;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.util.concurrent.ExecutionException;

public final class TcpSockets extends ReactContextBaseJavaModule implements a {
  private static final String TAG = "TcpSockets";
  
  private ReactContext mReactContext;
  
  private boolean mShuttingDown = false;
  
  private b socketManager;
  
  public TcpSockets(ReactApplicationContext paramReactApplicationContext) {
    super(paramReactApplicationContext);
    this.mReactContext = (ReactContext)paramReactApplicationContext;
    try {
      this.socketManager = new b(this);
      return;
    } catch (IOException iOException) {
      iOException.printStackTrace();
      return;
    } 
  }
  
  private void sendEvent(String paramString, WritableMap paramWritableMap) {
    ((DeviceEventManagerModule.RCTDeviceEventEmitter)this.mReactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(paramString, paramWritableMap);
  }
  
  @ReactMethod
  public void connect(Integer paramInteger1, String paramString, Integer paramInteger2, ReadableMap paramReadableMap) {
    (new c(this, (ReactContext)getReactApplicationContext(), paramInteger1, paramString, paramInteger2)).execute((Object[])new Void[0]);
  }
  
  @ReactMethod
  public void destroy(Integer paramInteger) {
    end(paramInteger);
  }
  
  @ReactMethod
  public void end(Integer paramInteger) {
    (new e(this, (ReactContext)getReactApplicationContext(), paramInteger)).execute((Object[])new Void[0]);
  }
  
  public String getName() {
    return "TcpSockets";
  }
  
  public void initialize() {
    this.mShuttingDown = false;
  }
  
  @ReactMethod
  public void listen(Integer paramInteger1, String paramString, Integer paramInteger2) {
    (new b(this, (ReactContext)getReactApplicationContext(), paramInteger1, paramString, paramInteger2)).execute((Object[])new Void[0]);
  }
  
  public void onCatalystInstanceDestroy() {
    this.mShuttingDown = true;
    try {
      (new a(this, (ReactContext)getReactApplicationContext())).execute((Object[])new Void[0]).get();
      return;
    } catch (InterruptedException interruptedException) {
    
    } catch (ExecutionException executionException) {}
    e.e.e.e.a.b("TcpSockets", "onCatalystInstanceDestroy", executionException);
  }
  
  public void onClose(Integer paramInteger, String paramString) {
    boolean bool;
    if (this.mShuttingDown)
      return; 
    if (paramString != null)
      onError(paramInteger, paramString); 
    WritableMap writableMap = Arguments.createMap();
    writableMap.putInt("id", paramInteger.intValue());
    if (paramString != null) {
      bool = true;
    } else {
      bool = false;
    } 
    writableMap.putBoolean("hadError", bool);
    sendEvent("close", writableMap);
  }
  
  public void onConnect(Integer paramInteger, InetSocketAddress paramInetSocketAddress) {
    String str;
    if (this.mShuttingDown)
      return; 
    WritableMap writableMap1 = Arguments.createMap();
    writableMap1.putInt("id", paramInteger.intValue());
    InetAddress inetAddress = paramInetSocketAddress.getAddress();
    WritableMap writableMap2 = Arguments.createMap();
    writableMap2.putString("address", inetAddress.getHostAddress());
    writableMap2.putInt("port", paramInetSocketAddress.getPort());
    if (inetAddress instanceof java.net.Inet6Address) {
      str = "IPv6";
    } else {
      str = "IPv4";
    } 
    writableMap2.putString("family", str);
    writableMap1.putMap("address", (ReadableMap)writableMap2);
    sendEvent("connect", writableMap1);
  }
  
  public void onConnection(Integer paramInteger1, Integer paramInteger2, InetSocketAddress paramInetSocketAddress) {
    String str;
    if (this.mShuttingDown)
      return; 
    WritableMap writableMap2 = Arguments.createMap();
    writableMap2.putInt("id", paramInteger1.intValue());
    WritableMap writableMap3 = Arguments.createMap();
    writableMap3.putInt("id", paramInteger2.intValue());
    InetAddress inetAddress = paramInetSocketAddress.getAddress();
    WritableMap writableMap1 = Arguments.createMap();
    writableMap1.putString("address", inetAddress.getHostAddress());
    writableMap1.putInt("port", paramInetSocketAddress.getPort());
    if (inetAddress instanceof java.net.Inet6Address) {
      str = "IPv6";
    } else {
      str = "IPv4";
    } 
    writableMap1.putString("family", str);
    writableMap3.putMap("address", (ReadableMap)writableMap1);
    writableMap2.putMap("info", (ReadableMap)writableMap3);
    sendEvent("connection", writableMap2);
  }
  
  public void onData(Integer paramInteger, byte[] paramArrayOfbyte) {
    if (this.mShuttingDown)
      return; 
    WritableMap writableMap = Arguments.createMap();
    writableMap.putInt("id", paramInteger.intValue());
    writableMap.putString("data", Base64.encodeToString(paramArrayOfbyte, 2));
    sendEvent("data", writableMap);
  }
  
  public void onError(Integer paramInteger, String paramString) {
    if (this.mShuttingDown)
      return; 
    WritableMap writableMap = Arguments.createMap();
    writableMap.putInt("id", paramInteger.intValue());
    writableMap.putString("error", paramString);
    sendEvent("error", writableMap);
  }
  
  @ReactMethod
  public void write(Integer paramInteger, String paramString, Callback paramCallback) {
    (new d(this, (ReactContext)getReactApplicationContext(), paramInteger, paramString, paramCallback)).execute((Object[])new Void[0]);
  }
  
  class a extends GuardedAsyncTask<Void, Void> {
    a(TcpSockets this$0, ReactContext param1ReactContext) {
      super(param1ReactContext);
    }
    
    protected void a(Void... param1VarArgs) {
      this.a.socketManager.a();
    }
  }
  
  class b extends GuardedAsyncTask<Void, Void> {
    b(TcpSockets this$0, ReactContext param1ReactContext, Integer param1Integer1, String param1String, Integer param1Integer2) {
      super(param1ReactContext);
    }
    
    protected void a(Void... param1VarArgs) {
      Integer integer;
      String str;
      TcpSockets tcpSockets;
      try {
        this.d.socketManager.b(this.a, this.b, this.c);
        return;
      } catch (UnknownHostException unknownHostException) {
        e.e.e.e.a.b("TcpSockets", "listen", unknownHostException);
        tcpSockets = this.d;
        integer = this.a;
        str = unknownHostException.getMessage();
      } catch (IOException iOException) {
        e.e.e.e.a.b("TcpSockets", "listen", iOException);
        tcpSockets = this.d;
        integer = this.a;
        str = iOException.getMessage();
      } 
      tcpSockets.onError(integer, str);
    }
  }
  
  class c extends GuardedAsyncTask<Void, Void> {
    c(TcpSockets this$0, ReactContext param1ReactContext, Integer param1Integer1, String param1String, Integer param1Integer2) {
      super(param1ReactContext);
    }
    
    protected void a(Void... param1VarArgs) {
      Integer integer;
      String str;
      TcpSockets tcpSockets;
      try {
        this.d.socketManager.a(this.a, this.b, this.c);
        return;
      } catch (UnknownHostException unknownHostException) {
        e.e.e.e.a.b("TcpSockets", "connect", unknownHostException);
        tcpSockets = this.d;
        integer = this.a;
        str = unknownHostException.getMessage();
      } catch (IOException iOException) {
        e.e.e.e.a.b("TcpSockets", "connect", iOException);
        tcpSockets = this.d;
        integer = this.a;
        str = iOException.getMessage();
      } 
      tcpSockets.onError(integer, str);
    }
  }
  
  class d extends GuardedAsyncTask<Void, Void> {
    d(TcpSockets this$0, ReactContext param1ReactContext, Integer param1Integer, String param1String, Callback param1Callback) {
      super(param1ReactContext);
    }
    
    protected void a(Void... param1VarArgs) {
      this.d.socketManager.a(this.a, Base64.decode(this.b, 2));
      Callback callback = this.c;
      if (callback != null)
        callback.invoke(new Object[0]); 
    }
  }
  
  class e extends GuardedAsyncTask<Void, Void> {
    e(TcpSockets this$0, ReactContext param1ReactContext, Integer param1Integer) {
      super(param1ReactContext);
    }
    
    protected void a(Void... param1VarArgs) {
      this.b.socketManager.a(this.a);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/peel/react/TcpSockets.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */