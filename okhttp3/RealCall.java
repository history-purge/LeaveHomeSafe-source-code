package okhttp3;

import j.a;
import j.u;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.NamedRunnable;
import okhttp3.internal.cache.CacheInterceptor;
import okhttp3.internal.connection.ConnectInterceptor;
import okhttp3.internal.connection.StreamAllocation;
import okhttp3.internal.http.BridgeInterceptor;
import okhttp3.internal.http.CallServerInterceptor;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http.RetryAndFollowUpInterceptor;
import okhttp3.internal.platform.Platform;

final class RealCall implements Call {
  final OkHttpClient client;
  
  private EventListener eventListener;
  
  private boolean executed;
  
  final boolean forWebSocket;
  
  final Request originalRequest;
  
  final RetryAndFollowUpInterceptor retryAndFollowUpInterceptor;
  
  final a timeout;
  
  private RealCall(OkHttpClient paramOkHttpClient, Request paramRequest, boolean paramBoolean) {
    this.client = paramOkHttpClient;
    this.originalRequest = paramRequest;
    this.forWebSocket = paramBoolean;
    this.retryAndFollowUpInterceptor = new RetryAndFollowUpInterceptor(paramOkHttpClient, paramBoolean);
    this.timeout = new a() {
        protected void timedOut() {
          RealCall.this.cancel();
        }
      };
    this.timeout.timeout(paramOkHttpClient.callTimeoutMillis(), TimeUnit.MILLISECONDS);
  }
  
  private void captureCallStackTrace() {
    Object object = Platform.get().getStackTraceForCloseable("response.body().close()");
    this.retryAndFollowUpInterceptor.setCallStackTrace(object);
  }
  
  static RealCall newRealCall(OkHttpClient paramOkHttpClient, Request paramRequest, boolean paramBoolean) {
    RealCall realCall = new RealCall(paramOkHttpClient, paramRequest, paramBoolean);
    realCall.eventListener = paramOkHttpClient.eventListenerFactory().create(realCall);
    return realCall;
  }
  
  public void cancel() {
    this.retryAndFollowUpInterceptor.cancel();
  }
  
  public RealCall clone() {
    return newRealCall(this.client, this.originalRequest, this.forWebSocket);
  }
  
  public void enqueue(Callback paramCallback) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield executed : Z
    //   6: ifne -> 48
    //   9: aload_0
    //   10: iconst_1
    //   11: putfield executed : Z
    //   14: aload_0
    //   15: monitorexit
    //   16: aload_0
    //   17: invokespecial captureCallStackTrace : ()V
    //   20: aload_0
    //   21: getfield eventListener : Lokhttp3/EventListener;
    //   24: aload_0
    //   25: invokevirtual callStart : (Lokhttp3/Call;)V
    //   28: aload_0
    //   29: getfield client : Lokhttp3/OkHttpClient;
    //   32: invokevirtual dispatcher : ()Lokhttp3/Dispatcher;
    //   35: new okhttp3/RealCall$AsyncCall
    //   38: dup
    //   39: aload_0
    //   40: aload_1
    //   41: invokespecial <init> : (Lokhttp3/RealCall;Lokhttp3/Callback;)V
    //   44: invokevirtual enqueue : (Lokhttp3/RealCall$AsyncCall;)V
    //   47: return
    //   48: new java/lang/IllegalStateException
    //   51: dup
    //   52: ldc 'Already Executed'
    //   54: invokespecial <init> : (Ljava/lang/String;)V
    //   57: athrow
    //   58: astore_1
    //   59: aload_0
    //   60: monitorexit
    //   61: aload_1
    //   62: athrow
    // Exception table:
    //   from	to	target	type
    //   2	16	58	finally
    //   48	58	58	finally
    //   59	61	58	finally
  }
  
  public Response execute() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield executed : Z
    //   6: ifne -> 113
    //   9: aload_0
    //   10: iconst_1
    //   11: putfield executed : Z
    //   14: aload_0
    //   15: monitorexit
    //   16: aload_0
    //   17: invokespecial captureCallStackTrace : ()V
    //   20: aload_0
    //   21: getfield timeout : Lj/a;
    //   24: invokevirtual enter : ()V
    //   27: aload_0
    //   28: getfield eventListener : Lokhttp3/EventListener;
    //   31: aload_0
    //   32: invokevirtual callStart : (Lokhttp3/Call;)V
    //   35: aload_0
    //   36: getfield client : Lokhttp3/OkHttpClient;
    //   39: invokevirtual dispatcher : ()Lokhttp3/Dispatcher;
    //   42: aload_0
    //   43: invokevirtual executed : (Lokhttp3/RealCall;)V
    //   46: aload_0
    //   47: invokevirtual getResponseWithInterceptorChain : ()Lokhttp3/Response;
    //   50: astore_1
    //   51: aload_1
    //   52: ifnull -> 68
    //   55: aload_0
    //   56: getfield client : Lokhttp3/OkHttpClient;
    //   59: invokevirtual dispatcher : ()Lokhttp3/Dispatcher;
    //   62: aload_0
    //   63: invokevirtual finished : (Lokhttp3/RealCall;)V
    //   66: aload_1
    //   67: areturn
    //   68: new java/io/IOException
    //   71: dup
    //   72: ldc 'Canceled'
    //   74: invokespecial <init> : (Ljava/lang/String;)V
    //   77: athrow
    //   78: astore_1
    //   79: goto -> 100
    //   82: astore_1
    //   83: aload_0
    //   84: aload_1
    //   85: invokevirtual timeoutExit : (Ljava/io/IOException;)Ljava/io/IOException;
    //   88: astore_1
    //   89: aload_0
    //   90: getfield eventListener : Lokhttp3/EventListener;
    //   93: aload_0
    //   94: aload_1
    //   95: invokevirtual callFailed : (Lokhttp3/Call;Ljava/io/IOException;)V
    //   98: aload_1
    //   99: athrow
    //   100: aload_0
    //   101: getfield client : Lokhttp3/OkHttpClient;
    //   104: invokevirtual dispatcher : ()Lokhttp3/Dispatcher;
    //   107: aload_0
    //   108: invokevirtual finished : (Lokhttp3/RealCall;)V
    //   111: aload_1
    //   112: athrow
    //   113: new java/lang/IllegalStateException
    //   116: dup
    //   117: ldc 'Already Executed'
    //   119: invokespecial <init> : (Ljava/lang/String;)V
    //   122: athrow
    //   123: astore_1
    //   124: aload_0
    //   125: monitorexit
    //   126: aload_1
    //   127: athrow
    // Exception table:
    //   from	to	target	type
    //   2	16	123	finally
    //   35	51	82	java/io/IOException
    //   35	51	78	finally
    //   68	78	82	java/io/IOException
    //   68	78	78	finally
    //   83	100	78	finally
    //   113	123	123	finally
    //   124	126	123	finally
  }
  
  Response getResponseWithInterceptorChain() {
    ArrayList<Interceptor> arrayList = new ArrayList();
    arrayList.addAll(this.client.interceptors());
    arrayList.add(this.retryAndFollowUpInterceptor);
    arrayList.add(new BridgeInterceptor(this.client.cookieJar()));
    arrayList.add(new CacheInterceptor(this.client.internalCache()));
    arrayList.add(new ConnectInterceptor(this.client));
    if (!this.forWebSocket)
      arrayList.addAll(this.client.networkInterceptors()); 
    arrayList.add(new CallServerInterceptor(this.forWebSocket));
    return (new RealInterceptorChain(arrayList, null, null, null, 0, this.originalRequest, this, this.eventListener, this.client.connectTimeoutMillis(), this.client.readTimeoutMillis(), this.client.writeTimeoutMillis())).proceed(this.originalRequest);
  }
  
  public boolean isCanceled() {
    return this.retryAndFollowUpInterceptor.isCanceled();
  }
  
  public boolean isExecuted() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield executed : Z
    //   6: istore_1
    //   7: aload_0
    //   8: monitorexit
    //   9: iload_1
    //   10: ireturn
    //   11: astore_2
    //   12: aload_0
    //   13: monitorexit
    //   14: aload_2
    //   15: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	11	finally
  }
  
  String redactedUrl() {
    return this.originalRequest.url().redact();
  }
  
  public Request request() {
    return this.originalRequest;
  }
  
  StreamAllocation streamAllocation() {
    return this.retryAndFollowUpInterceptor.streamAllocation();
  }
  
  public u timeout() {
    return (u)this.timeout;
  }
  
  IOException timeoutExit(IOException paramIOException) {
    if (!this.timeout.exit())
      return paramIOException; 
    InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
    if (paramIOException != null)
      interruptedIOException.initCause(paramIOException); 
    return interruptedIOException;
  }
  
  String toLoggableString() {
    String str;
    StringBuilder stringBuilder = new StringBuilder();
    if (isCanceled()) {
      str = "canceled ";
    } else {
      str = "";
    } 
    stringBuilder.append(str);
    if (this.forWebSocket) {
      str = "web socket";
    } else {
      str = "call";
    } 
    stringBuilder.append(str);
    stringBuilder.append(" to ");
    stringBuilder.append(redactedUrl());
    return stringBuilder.toString();
  }
  
  final class AsyncCall extends NamedRunnable {
    private final Callback responseCallback;
    
    AsyncCall(Callback param1Callback) {
      super("OkHttp %s", new Object[] { this$0.redactedUrl() });
      this.responseCallback = param1Callback;
    }
    
    protected void execute() {
      RealCall.this.timeout.enter();
      boolean bool = true;
      try {
        Response response = RealCall.this.getResponseWithInterceptorChain();
        boolean bool1 = RealCall.this.retryAndFollowUpInterceptor.isCanceled();
        if (bool1) {
          try {
            this.responseCallback.onFailure(RealCall.this, new IOException("Canceled"));
            RealCall.this.client.dispatcher().finished(this);
          } catch (IOException null) {}
        } else {
          this.responseCallback.onResponse(RealCall.this, (Response)exception);
          RealCall.this.client.dispatcher().finished(this);
        } 
      } catch (IOException null) {
        bool = false;
      } finally {}
      Exception exception = RealCall.this.timeoutExit((IOException)exception);
      if (bool) {
        Platform platform = Platform.get();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Callback failure for ");
        stringBuilder.append(RealCall.this.toLoggableString());
        platform.log(4, stringBuilder.toString(), exception);
      } else {
        RealCall.this.eventListener.callFailed(RealCall.this, (IOException)exception);
        this.responseCallback.onFailure(RealCall.this, (IOException)exception);
      } 
      RealCall.this.client.dispatcher().finished(this);
    }
    
    void executeOn(ExecutorService param1ExecutorService) {
      try {
        param1ExecutorService.execute((Runnable)this);
        return;
      } catch (RejectedExecutionException rejectedExecutionException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
        interruptedIOException.initCause(rejectedExecutionException);
        RealCall.this.eventListener.callFailed(RealCall.this, interruptedIOException);
        this.responseCallback.onFailure(RealCall.this, interruptedIOException);
        RealCall.this.client.dispatcher().finished(this);
        return;
      } finally {}
      RealCall.this.client.dispatcher().finished(this);
      throw param1ExecutorService;
    }
    
    RealCall get() {
      return RealCall.this;
    }
    
    String host() {
      return RealCall.this.originalRequest.url().host();
    }
    
    Request request() {
      return RealCall.this.originalRequest;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/okhttp3/RealCall.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */