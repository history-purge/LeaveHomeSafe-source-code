package okhttp3.internal.ws;

import j.d;
import j.e;
import j.f;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.EventListener;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okhttp3.internal.Internal;
import okhttp3.internal.Util;
import okhttp3.internal.connection.StreamAllocation;

public final class RealWebSocket implements WebSocket, WebSocketReader.FrameCallback {
  private static final long CANCEL_AFTER_CLOSE_MILLIS = 60000L;
  
  private static final long MAX_QUEUE_SIZE = 16777216L;
  
  private static final List<Protocol> ONLY_HTTP1 = Collections.singletonList(Protocol.HTTP_1_1);
  
  private boolean awaitingPong;
  
  private Call call;
  
  private ScheduledFuture<?> cancelFuture;
  
  private boolean enqueuedClose;
  
  private ScheduledExecutorService executor;
  
  private boolean failed;
  
  private final String key;
  
  final WebSocketListener listener;
  
  private final ArrayDeque<Object> messageAndCloseQueue;
  
  private final Request originalRequest;
  
  private final long pingIntervalMillis;
  
  private final ArrayDeque<f> pongQueue;
  
  private long queueSize;
  
  private final Random random;
  
  private WebSocketReader reader;
  
  private int receivedCloseCode;
  
  private String receivedCloseReason;
  
  private int receivedPingCount;
  
  private int receivedPongCount;
  
  private int sentPingCount;
  
  private Streams streams;
  
  private WebSocketWriter writer;
  
  private final Runnable writerRunnable;
  
  public RealWebSocket(Request paramRequest, WebSocketListener paramWebSocketListener, Random paramRandom, long paramLong) {
    byte[] arrayOfByte;
    this.pongQueue = new ArrayDeque<f>();
    this.messageAndCloseQueue = new ArrayDeque();
    this.receivedCloseCode = -1;
    if ("GET".equals(paramRequest.method())) {
      this.originalRequest = paramRequest;
      this.listener = paramWebSocketListener;
      this.random = paramRandom;
      this.pingIntervalMillis = paramLong;
      arrayOfByte = new byte[16];
      paramRandom.nextBytes(arrayOfByte);
      this.key = f.a(arrayOfByte).a();
      this.writerRunnable = new Runnable() {
          public void run() {
            try {
              while (true) {
                boolean bool = RealWebSocket.this.writeOneFrame();
                if (bool)
                  continue; 
                break;
              } 
            } catch (IOException iOException) {
              RealWebSocket.this.failWebSocket(iOException, null);
            } 
          }
        };
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Request must be GET: ");
    stringBuilder.append(arrayOfByte.method());
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  private void runWriter() {
    ScheduledExecutorService scheduledExecutorService = this.executor;
    if (scheduledExecutorService != null)
      scheduledExecutorService.execute(this.writerRunnable); 
  }
  
  private boolean send(f paramf, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield failed : Z
    //   6: ifne -> 88
    //   9: aload_0
    //   10: getfield enqueuedClose : Z
    //   13: ifeq -> 19
    //   16: goto -> 88
    //   19: aload_0
    //   20: getfield queueSize : J
    //   23: aload_1
    //   24: invokevirtual s : ()I
    //   27: i2l
    //   28: ladd
    //   29: ldc2_w 16777216
    //   32: lcmp
    //   33: ifle -> 49
    //   36: aload_0
    //   37: sipush #1001
    //   40: aconst_null
    //   41: invokevirtual close : (ILjava/lang/String;)Z
    //   44: pop
    //   45: aload_0
    //   46: monitorexit
    //   47: iconst_0
    //   48: ireturn
    //   49: aload_0
    //   50: aload_0
    //   51: getfield queueSize : J
    //   54: aload_1
    //   55: invokevirtual s : ()I
    //   58: i2l
    //   59: ladd
    //   60: putfield queueSize : J
    //   63: aload_0
    //   64: getfield messageAndCloseQueue : Ljava/util/ArrayDeque;
    //   67: new okhttp3/internal/ws/RealWebSocket$Message
    //   70: dup
    //   71: iload_2
    //   72: aload_1
    //   73: invokespecial <init> : (ILj/f;)V
    //   76: invokevirtual add : (Ljava/lang/Object;)Z
    //   79: pop
    //   80: aload_0
    //   81: invokespecial runWriter : ()V
    //   84: aload_0
    //   85: monitorexit
    //   86: iconst_1
    //   87: ireturn
    //   88: aload_0
    //   89: monitorexit
    //   90: iconst_0
    //   91: ireturn
    //   92: astore_1
    //   93: aload_0
    //   94: monitorexit
    //   95: aload_1
    //   96: athrow
    // Exception table:
    //   from	to	target	type
    //   2	16	92	finally
    //   19	45	92	finally
    //   49	84	92	finally
  }
  
  void awaitTermination(int paramInt, TimeUnit paramTimeUnit) {
    this.executor.awaitTermination(paramInt, paramTimeUnit);
  }
  
  public void cancel() {
    this.call.cancel();
  }
  
  void checkResponse(Response paramResponse) {
    StringBuilder stringBuilder1;
    if (paramResponse.code() == 101) {
      String str = paramResponse.header("Connection");
      if ("Upgrade".equalsIgnoreCase(str)) {
        str = paramResponse.header("Upgrade");
        if ("websocket".equalsIgnoreCase(str)) {
          String str1 = paramResponse.header("Sec-WebSocket-Accept");
          StringBuilder stringBuilder3 = new StringBuilder();
          stringBuilder3.append(this.key);
          stringBuilder3.append("258EAFA5-E914-47DA-95CA-C5AB0DC85B11");
          str = f.d(stringBuilder3.toString()).q().a();
          if (str.equals(str1))
            return; 
          StringBuilder stringBuilder4 = new StringBuilder();
          stringBuilder4.append("Expected 'Sec-WebSocket-Accept' header value '");
          stringBuilder4.append(str);
          stringBuilder4.append("' but was '");
          stringBuilder4.append(str1);
          stringBuilder4.append("'");
          throw new ProtocolException(stringBuilder4.toString());
        } 
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected 'Upgrade' header value 'websocket' but was '");
        stringBuilder.append(str);
        stringBuilder.append("'");
        throw new ProtocolException(stringBuilder.toString());
      } 
      stringBuilder1 = new StringBuilder();
      stringBuilder1.append("Expected 'Connection' header value 'Upgrade' but was '");
      stringBuilder1.append(str);
      stringBuilder1.append("'");
      throw new ProtocolException(stringBuilder1.toString());
    } 
    StringBuilder stringBuilder2 = new StringBuilder();
    stringBuilder2.append("Expected HTTP 101 response but was '");
    stringBuilder2.append(stringBuilder1.code());
    stringBuilder2.append(" ");
    stringBuilder2.append(stringBuilder1.message());
    stringBuilder2.append("'");
    throw new ProtocolException(stringBuilder2.toString());
  }
  
  public boolean close(int paramInt, String paramString) {
    return close(paramInt, paramString, 60000L);
  }
  
  boolean close(int paramInt, String paramString, long paramLong) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: iload_1
    //   3: invokestatic validateCloseCode : (I)V
    //   6: aconst_null
    //   7: astore #5
    //   9: aload_2
    //   10: ifnull -> 73
    //   13: aload_2
    //   14: invokestatic d : (Ljava/lang/String;)Lj/f;
    //   17: astore #5
    //   19: aload #5
    //   21: invokevirtual s : ()I
    //   24: i2l
    //   25: ldc2_w 123
    //   28: lcmp
    //   29: ifgt -> 35
    //   32: goto -> 73
    //   35: new java/lang/StringBuilder
    //   38: dup
    //   39: invokespecial <init> : ()V
    //   42: astore #5
    //   44: aload #5
    //   46: ldc_w 'reason.size() > 123: '
    //   49: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   52: pop
    //   53: aload #5
    //   55: aload_2
    //   56: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   59: pop
    //   60: new java/lang/IllegalArgumentException
    //   63: dup
    //   64: aload #5
    //   66: invokevirtual toString : ()Ljava/lang/String;
    //   69: invokespecial <init> : (Ljava/lang/String;)V
    //   72: athrow
    //   73: aload_0
    //   74: getfield failed : Z
    //   77: ifne -> 122
    //   80: aload_0
    //   81: getfield enqueuedClose : Z
    //   84: ifeq -> 90
    //   87: goto -> 122
    //   90: aload_0
    //   91: iconst_1
    //   92: putfield enqueuedClose : Z
    //   95: aload_0
    //   96: getfield messageAndCloseQueue : Ljava/util/ArrayDeque;
    //   99: new okhttp3/internal/ws/RealWebSocket$Close
    //   102: dup
    //   103: iload_1
    //   104: aload #5
    //   106: lload_3
    //   107: invokespecial <init> : (ILj/f;J)V
    //   110: invokevirtual add : (Ljava/lang/Object;)Z
    //   113: pop
    //   114: aload_0
    //   115: invokespecial runWriter : ()V
    //   118: aload_0
    //   119: monitorexit
    //   120: iconst_1
    //   121: ireturn
    //   122: aload_0
    //   123: monitorexit
    //   124: iconst_0
    //   125: ireturn
    //   126: astore_2
    //   127: aload_0
    //   128: monitorexit
    //   129: aload_2
    //   130: athrow
    // Exception table:
    //   from	to	target	type
    //   2	6	126	finally
    //   13	32	126	finally
    //   35	73	126	finally
    //   73	87	126	finally
    //   90	118	126	finally
  }
  
  public void connect(OkHttpClient paramOkHttpClient) {
    paramOkHttpClient = paramOkHttpClient.newBuilder().eventListener(EventListener.NONE).protocols(ONLY_HTTP1).build();
    final Request request = this.originalRequest.newBuilder().header("Upgrade", "websocket").header("Connection", "Upgrade").header("Sec-WebSocket-Key", this.key).header("Sec-WebSocket-Version", "13").build();
    this.call = Internal.instance.newWebSocketCall(paramOkHttpClient, request);
    this.call.timeout().clearTimeout();
    this.call.enqueue(new Callback() {
          public void onFailure(Call param1Call, IOException param1IOException) {
            RealWebSocket.this.failWebSocket(param1IOException, null);
          }
          
          public void onResponse(Call param1Call, Response param1Response) {
            String str;
            try {
              RealWebSocket.this.checkResponse(param1Response);
              StreamAllocation streamAllocation = Internal.instance.streamAllocation(param1Call);
              streamAllocation.noNewStreams();
              RealWebSocket.Streams streams = streamAllocation.connection().newWebSocketStreams(streamAllocation);
              try {
                RealWebSocket.this.listener.onOpen(RealWebSocket.this, param1Response);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("OkHttp WebSocket ");
                stringBuilder.append(request.url().redact());
                str = stringBuilder.toString();
                RealWebSocket.this.initReaderAndWriter(str, streams);
                streamAllocation.connection().socket().setSoTimeout(0);
                RealWebSocket.this.loopReader();
                return;
              } catch (Exception exception) {
                RealWebSocket.this.failWebSocket(exception, null);
                return;
              } 
            } catch (ProtocolException protocolException) {
              RealWebSocket.this.failWebSocket(protocolException, (Response)str);
              Util.closeQuietly((Closeable)str);
              return;
            } 
          }
        });
  }
  
  public void failWebSocket(Exception paramException, Response paramResponse) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield failed : Z
    //   6: ifeq -> 12
    //   9: aload_0
    //   10: monitorexit
    //   11: return
    //   12: aload_0
    //   13: iconst_1
    //   14: putfield failed : Z
    //   17: aload_0
    //   18: getfield streams : Lokhttp3/internal/ws/RealWebSocket$Streams;
    //   21: astore_3
    //   22: aload_0
    //   23: aconst_null
    //   24: putfield streams : Lokhttp3/internal/ws/RealWebSocket$Streams;
    //   27: aload_0
    //   28: getfield cancelFuture : Ljava/util/concurrent/ScheduledFuture;
    //   31: ifnull -> 45
    //   34: aload_0
    //   35: getfield cancelFuture : Ljava/util/concurrent/ScheduledFuture;
    //   38: iconst_0
    //   39: invokeinterface cancel : (Z)Z
    //   44: pop
    //   45: aload_0
    //   46: getfield executor : Ljava/util/concurrent/ScheduledExecutorService;
    //   49: ifnull -> 61
    //   52: aload_0
    //   53: getfield executor : Ljava/util/concurrent/ScheduledExecutorService;
    //   56: invokeinterface shutdown : ()V
    //   61: aload_0
    //   62: monitorexit
    //   63: aload_0
    //   64: getfield listener : Lokhttp3/WebSocketListener;
    //   67: aload_0
    //   68: aload_1
    //   69: aload_2
    //   70: invokevirtual onFailure : (Lokhttp3/WebSocket;Ljava/lang/Throwable;Lokhttp3/Response;)V
    //   73: aload_3
    //   74: invokestatic closeQuietly : (Ljava/io/Closeable;)V
    //   77: return
    //   78: astore_1
    //   79: aload_3
    //   80: invokestatic closeQuietly : (Ljava/io/Closeable;)V
    //   83: aload_1
    //   84: athrow
    //   85: astore_1
    //   86: aload_0
    //   87: monitorexit
    //   88: aload_1
    //   89: athrow
    // Exception table:
    //   from	to	target	type
    //   2	11	85	finally
    //   12	45	85	finally
    //   45	61	85	finally
    //   61	63	85	finally
    //   63	73	78	finally
    //   86	88	85	finally
  }
  
  public void initReaderAndWriter(String paramString, Streams paramStreams) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_2
    //   4: putfield streams : Lokhttp3/internal/ws/RealWebSocket$Streams;
    //   7: aload_0
    //   8: new okhttp3/internal/ws/WebSocketWriter
    //   11: dup
    //   12: aload_2
    //   13: getfield client : Z
    //   16: aload_2
    //   17: getfield sink : Lj/d;
    //   20: aload_0
    //   21: getfield random : Ljava/util/Random;
    //   24: invokespecial <init> : (ZLj/d;Ljava/util/Random;)V
    //   27: putfield writer : Lokhttp3/internal/ws/WebSocketWriter;
    //   30: aload_0
    //   31: new java/util/concurrent/ScheduledThreadPoolExecutor
    //   34: dup
    //   35: iconst_1
    //   36: aload_1
    //   37: iconst_0
    //   38: invokestatic threadFactory : (Ljava/lang/String;Z)Ljava/util/concurrent/ThreadFactory;
    //   41: invokespecial <init> : (ILjava/util/concurrent/ThreadFactory;)V
    //   44: putfield executor : Ljava/util/concurrent/ScheduledExecutorService;
    //   47: aload_0
    //   48: getfield pingIntervalMillis : J
    //   51: lconst_0
    //   52: lcmp
    //   53: ifeq -> 85
    //   56: aload_0
    //   57: getfield executor : Ljava/util/concurrent/ScheduledExecutorService;
    //   60: new okhttp3/internal/ws/RealWebSocket$PingRunnable
    //   63: dup
    //   64: aload_0
    //   65: invokespecial <init> : (Lokhttp3/internal/ws/RealWebSocket;)V
    //   68: aload_0
    //   69: getfield pingIntervalMillis : J
    //   72: aload_0
    //   73: getfield pingIntervalMillis : J
    //   76: getstatic java/util/concurrent/TimeUnit.MILLISECONDS : Ljava/util/concurrent/TimeUnit;
    //   79: invokeinterface scheduleAtFixedRate : (Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
    //   84: pop
    //   85: aload_0
    //   86: getfield messageAndCloseQueue : Ljava/util/ArrayDeque;
    //   89: invokevirtual isEmpty : ()Z
    //   92: ifne -> 99
    //   95: aload_0
    //   96: invokespecial runWriter : ()V
    //   99: aload_0
    //   100: monitorexit
    //   101: aload_0
    //   102: new okhttp3/internal/ws/WebSocketReader
    //   105: dup
    //   106: aload_2
    //   107: getfield client : Z
    //   110: aload_2
    //   111: getfield source : Lj/e;
    //   114: aload_0
    //   115: invokespecial <init> : (ZLj/e;Lokhttp3/internal/ws/WebSocketReader$FrameCallback;)V
    //   118: putfield reader : Lokhttp3/internal/ws/WebSocketReader;
    //   121: return
    //   122: astore_1
    //   123: aload_0
    //   124: monitorexit
    //   125: aload_1
    //   126: athrow
    // Exception table:
    //   from	to	target	type
    //   2	85	122	finally
    //   85	99	122	finally
    //   99	101	122	finally
    //   123	125	122	finally
  }
  
  public void loopReader() {
    while (this.receivedCloseCode == -1)
      this.reader.processNextFrame(); 
  }
  
  public void onReadClose(int paramInt, String paramString) {
    // Byte code:
    //   0: iload_1
    //   1: iconst_m1
    //   2: if_icmpeq -> 136
    //   5: aload_0
    //   6: monitorenter
    //   7: aload_0
    //   8: getfield receivedCloseCode : I
    //   11: iconst_m1
    //   12: if_icmpne -> 120
    //   15: aload_0
    //   16: iload_1
    //   17: putfield receivedCloseCode : I
    //   20: aload_0
    //   21: aload_2
    //   22: putfield receivedCloseReason : Ljava/lang/String;
    //   25: aload_0
    //   26: getfield enqueuedClose : Z
    //   29: ifeq -> 144
    //   32: aload_0
    //   33: getfield messageAndCloseQueue : Ljava/util/ArrayDeque;
    //   36: invokevirtual isEmpty : ()Z
    //   39: ifeq -> 144
    //   42: aload_0
    //   43: getfield streams : Lokhttp3/internal/ws/RealWebSocket$Streams;
    //   46: astore_3
    //   47: aload_0
    //   48: aconst_null
    //   49: putfield streams : Lokhttp3/internal/ws/RealWebSocket$Streams;
    //   52: aload_0
    //   53: getfield cancelFuture : Ljava/util/concurrent/ScheduledFuture;
    //   56: ifnull -> 70
    //   59: aload_0
    //   60: getfield cancelFuture : Ljava/util/concurrent/ScheduledFuture;
    //   63: iconst_0
    //   64: invokeinterface cancel : (Z)Z
    //   69: pop
    //   70: aload_0
    //   71: getfield executor : Ljava/util/concurrent/ScheduledExecutorService;
    //   74: invokeinterface shutdown : ()V
    //   79: goto -> 82
    //   82: aload_0
    //   83: monitorexit
    //   84: aload_0
    //   85: getfield listener : Lokhttp3/WebSocketListener;
    //   88: aload_0
    //   89: iload_1
    //   90: aload_2
    //   91: invokevirtual onClosing : (Lokhttp3/WebSocket;ILjava/lang/String;)V
    //   94: aload_3
    //   95: ifnull -> 108
    //   98: aload_0
    //   99: getfield listener : Lokhttp3/WebSocketListener;
    //   102: aload_0
    //   103: iload_1
    //   104: aload_2
    //   105: invokevirtual onClosed : (Lokhttp3/WebSocket;ILjava/lang/String;)V
    //   108: aload_3
    //   109: invokestatic closeQuietly : (Ljava/io/Closeable;)V
    //   112: return
    //   113: astore_2
    //   114: aload_3
    //   115: invokestatic closeQuietly : (Ljava/io/Closeable;)V
    //   118: aload_2
    //   119: athrow
    //   120: new java/lang/IllegalStateException
    //   123: dup
    //   124: ldc_w 'already closed'
    //   127: invokespecial <init> : (Ljava/lang/String;)V
    //   130: athrow
    //   131: astore_2
    //   132: aload_0
    //   133: monitorexit
    //   134: aload_2
    //   135: athrow
    //   136: new java/lang/IllegalArgumentException
    //   139: dup
    //   140: invokespecial <init> : ()V
    //   143: athrow
    //   144: aconst_null
    //   145: astore_3
    //   146: goto -> 82
    // Exception table:
    //   from	to	target	type
    //   7	70	131	finally
    //   70	79	131	finally
    //   82	84	131	finally
    //   84	94	113	finally
    //   98	108	113	finally
    //   120	131	131	finally
    //   132	134	131	finally
  }
  
  public void onReadMessage(f paramf) {
    this.listener.onMessage(this, paramf);
  }
  
  public void onReadMessage(String paramString) {
    this.listener.onMessage(this, paramString);
  }
  
  public void onReadPing(f paramf) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield failed : Z
    //   6: ifne -> 55
    //   9: aload_0
    //   10: getfield enqueuedClose : Z
    //   13: ifeq -> 29
    //   16: aload_0
    //   17: getfield messageAndCloseQueue : Ljava/util/ArrayDeque;
    //   20: invokevirtual isEmpty : ()Z
    //   23: ifeq -> 29
    //   26: goto -> 55
    //   29: aload_0
    //   30: getfield pongQueue : Ljava/util/ArrayDeque;
    //   33: aload_1
    //   34: invokevirtual add : (Ljava/lang/Object;)Z
    //   37: pop
    //   38: aload_0
    //   39: invokespecial runWriter : ()V
    //   42: aload_0
    //   43: aload_0
    //   44: getfield receivedPingCount : I
    //   47: iconst_1
    //   48: iadd
    //   49: putfield receivedPingCount : I
    //   52: aload_0
    //   53: monitorexit
    //   54: return
    //   55: aload_0
    //   56: monitorexit
    //   57: return
    //   58: astore_1
    //   59: aload_0
    //   60: monitorexit
    //   61: aload_1
    //   62: athrow
    // Exception table:
    //   from	to	target	type
    //   2	26	58	finally
    //   29	52	58	finally
  }
  
  public void onReadPong(f paramf) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_0
    //   4: getfield receivedPongCount : I
    //   7: iconst_1
    //   8: iadd
    //   9: putfield receivedPongCount : I
    //   12: aload_0
    //   13: iconst_0
    //   14: putfield awaitingPong : Z
    //   17: aload_0
    //   18: monitorexit
    //   19: return
    //   20: astore_1
    //   21: aload_0
    //   22: monitorexit
    //   23: aload_1
    //   24: athrow
    // Exception table:
    //   from	to	target	type
    //   2	17	20	finally
  }
  
  boolean pong(f paramf) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield failed : Z
    //   6: ifne -> 48
    //   9: aload_0
    //   10: getfield enqueuedClose : Z
    //   13: ifeq -> 29
    //   16: aload_0
    //   17: getfield messageAndCloseQueue : Ljava/util/ArrayDeque;
    //   20: invokevirtual isEmpty : ()Z
    //   23: ifeq -> 29
    //   26: goto -> 48
    //   29: aload_0
    //   30: getfield pongQueue : Ljava/util/ArrayDeque;
    //   33: aload_1
    //   34: invokevirtual add : (Ljava/lang/Object;)Z
    //   37: pop
    //   38: aload_0
    //   39: invokespecial runWriter : ()V
    //   42: iconst_1
    //   43: istore_2
    //   44: aload_0
    //   45: monitorexit
    //   46: iload_2
    //   47: ireturn
    //   48: iconst_0
    //   49: istore_2
    //   50: goto -> 44
    //   53: astore_1
    //   54: aload_0
    //   55: monitorexit
    //   56: goto -> 61
    //   59: aload_1
    //   60: athrow
    //   61: goto -> 59
    // Exception table:
    //   from	to	target	type
    //   2	26	53	finally
    //   29	42	53	finally
  }
  
  boolean processNextFrame() {
    boolean bool = false;
    try {
      this.reader.processNextFrame();
      int i = this.receivedCloseCode;
      if (i == -1)
        bool = true; 
      return bool;
    } catch (Exception exception) {
      failWebSocket(exception, null);
      return false;
    } 
  }
  
  public long queueSize() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield queueSize : J
    //   6: lstore_1
    //   7: aload_0
    //   8: monitorexit
    //   9: lload_1
    //   10: lreturn
    //   11: astore_3
    //   12: aload_0
    //   13: monitorexit
    //   14: aload_3
    //   15: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	11	finally
  }
  
  int receivedPingCount() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield receivedPingCount : I
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
  
  int receivedPongCount() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield receivedPongCount : I
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
  
  public Request request() {
    return this.originalRequest;
  }
  
  public boolean send(f paramf) {
    if (paramf != null)
      return send(paramf, 2); 
    throw new NullPointerException("bytes == null");
  }
  
  public boolean send(String paramString) {
    if (paramString != null)
      return send(f.d(paramString), 1); 
    throw new NullPointerException("text == null");
  }
  
  int sentPingCount() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield sentPingCount : I
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
  
  void tearDown() {
    ScheduledFuture<?> scheduledFuture = this.cancelFuture;
    if (scheduledFuture != null)
      scheduledFuture.cancel(false); 
    this.executor.shutdown();
    this.executor.awaitTermination(10L, TimeUnit.SECONDS);
  }
  
  boolean writeOneFrame() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield failed : Z
    //   6: ifeq -> 13
    //   9: aload_0
    //   10: monitorexit
    //   11: iconst_0
    //   12: ireturn
    //   13: aload_0
    //   14: getfield writer : Lokhttp3/internal/ws/WebSocketWriter;
    //   17: astore #5
    //   19: aload_0
    //   20: getfield pongQueue : Ljava/util/ArrayDeque;
    //   23: invokevirtual poll : ()Ljava/lang/Object;
    //   26: checkcast j/f
    //   29: astore #6
    //   31: aconst_null
    //   32: astore_3
    //   33: aload #6
    //   35: ifnonnull -> 299
    //   38: aload_0
    //   39: getfield messageAndCloseQueue : Ljava/util/ArrayDeque;
    //   42: invokevirtual poll : ()Ljava/lang/Object;
    //   45: astore_2
    //   46: aload_2
    //   47: instanceof okhttp3/internal/ws/RealWebSocket$Close
    //   50: ifeq -> 125
    //   53: aload_0
    //   54: getfield receivedCloseCode : I
    //   57: istore_1
    //   58: aload_0
    //   59: getfield receivedCloseReason : Ljava/lang/String;
    //   62: astore #4
    //   64: iload_1
    //   65: iconst_m1
    //   66: if_icmpeq -> 91
    //   69: aload_0
    //   70: getfield streams : Lokhttp3/internal/ws/RealWebSocket$Streams;
    //   73: astore_3
    //   74: aload_0
    //   75: aconst_null
    //   76: putfield streams : Lokhttp3/internal/ws/RealWebSocket$Streams;
    //   79: aload_0
    //   80: getfield executor : Ljava/util/concurrent/ScheduledExecutorService;
    //   83: invokeinterface shutdown : ()V
    //   88: goto -> 133
    //   91: aload_0
    //   92: aload_0
    //   93: getfield executor : Ljava/util/concurrent/ScheduledExecutorService;
    //   96: new okhttp3/internal/ws/RealWebSocket$CancelRunnable
    //   99: dup
    //   100: aload_0
    //   101: invokespecial <init> : (Lokhttp3/internal/ws/RealWebSocket;)V
    //   104: aload_2
    //   105: checkcast okhttp3/internal/ws/RealWebSocket$Close
    //   108: getfield cancelAfterCloseMillis : J
    //   111: getstatic java/util/concurrent/TimeUnit.MILLISECONDS : Ljava/util/concurrent/TimeUnit;
    //   114: invokeinterface schedule : (Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
    //   119: putfield cancelFuture : Ljava/util/concurrent/ScheduledFuture;
    //   122: goto -> 133
    //   125: aload_2
    //   126: ifnonnull -> 296
    //   129: aload_0
    //   130: monitorexit
    //   131: iconst_0
    //   132: ireturn
    //   133: aload_0
    //   134: monitorexit
    //   135: aload #6
    //   137: ifnull -> 150
    //   140: aload #5
    //   142: aload #6
    //   144: invokevirtual writePong : (Lj/f;)V
    //   147: goto -> 270
    //   150: aload_2
    //   151: instanceof okhttp3/internal/ws/RealWebSocket$Message
    //   154: ifeq -> 230
    //   157: aload_2
    //   158: checkcast okhttp3/internal/ws/RealWebSocket$Message
    //   161: getfield data : Lj/f;
    //   164: astore #4
    //   166: aload #5
    //   168: aload_2
    //   169: checkcast okhttp3/internal/ws/RealWebSocket$Message
    //   172: getfield formatOpcode : I
    //   175: aload #4
    //   177: invokevirtual s : ()I
    //   180: i2l
    //   181: invokevirtual newMessageSink : (IJ)Lj/s;
    //   184: invokestatic a : (Lj/s;)Lj/d;
    //   187: astore_2
    //   188: aload_2
    //   189: aload #4
    //   191: invokeinterface a : (Lj/f;)Lj/d;
    //   196: pop
    //   197: aload_2
    //   198: invokeinterface close : ()V
    //   203: aload_0
    //   204: monitorenter
    //   205: aload_0
    //   206: aload_0
    //   207: getfield queueSize : J
    //   210: aload #4
    //   212: invokevirtual s : ()I
    //   215: i2l
    //   216: lsub
    //   217: putfield queueSize : J
    //   220: aload_0
    //   221: monitorexit
    //   222: goto -> 270
    //   225: astore_2
    //   226: aload_0
    //   227: monitorexit
    //   228: aload_2
    //   229: athrow
    //   230: aload_2
    //   231: instanceof okhttp3/internal/ws/RealWebSocket$Close
    //   234: ifeq -> 276
    //   237: aload_2
    //   238: checkcast okhttp3/internal/ws/RealWebSocket$Close
    //   241: astore_2
    //   242: aload #5
    //   244: aload_2
    //   245: getfield code : I
    //   248: aload_2
    //   249: getfield reason : Lj/f;
    //   252: invokevirtual writeClose : (ILj/f;)V
    //   255: aload_3
    //   256: ifnull -> 270
    //   259: aload_0
    //   260: getfield listener : Lokhttp3/WebSocketListener;
    //   263: aload_0
    //   264: iload_1
    //   265: aload #4
    //   267: invokevirtual onClosed : (Lokhttp3/WebSocket;ILjava/lang/String;)V
    //   270: aload_3
    //   271: invokestatic closeQuietly : (Ljava/io/Closeable;)V
    //   274: iconst_1
    //   275: ireturn
    //   276: new java/lang/AssertionError
    //   279: dup
    //   280: invokespecial <init> : ()V
    //   283: athrow
    //   284: astore_2
    //   285: aload_3
    //   286: invokestatic closeQuietly : (Ljava/io/Closeable;)V
    //   289: aload_2
    //   290: athrow
    //   291: astore_2
    //   292: aload_0
    //   293: monitorexit
    //   294: aload_2
    //   295: athrow
    //   296: goto -> 301
    //   299: aconst_null
    //   300: astore_2
    //   301: aconst_null
    //   302: astore #4
    //   304: iconst_m1
    //   305: istore_1
    //   306: goto -> 133
    // Exception table:
    //   from	to	target	type
    //   2	11	291	finally
    //   13	31	291	finally
    //   38	64	291	finally
    //   69	88	291	finally
    //   91	122	291	finally
    //   129	131	291	finally
    //   133	135	291	finally
    //   140	147	284	finally
    //   150	205	284	finally
    //   205	222	225	finally
    //   226	228	225	finally
    //   228	230	284	finally
    //   230	255	284	finally
    //   259	270	284	finally
    //   276	284	284	finally
    //   292	294	291	finally
  }
  
  void writePingFrame() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield failed : Z
    //   6: ifeq -> 12
    //   9: aload_0
    //   10: monitorexit
    //   11: return
    //   12: aload_0
    //   13: getfield writer : Lokhttp3/internal/ws/WebSocketWriter;
    //   16: astore_2
    //   17: aload_0
    //   18: getfield awaitingPong : Z
    //   21: ifeq -> 141
    //   24: aload_0
    //   25: getfield sentPingCount : I
    //   28: istore_1
    //   29: goto -> 32
    //   32: aload_0
    //   33: aload_0
    //   34: getfield sentPingCount : I
    //   37: iconst_1
    //   38: iadd
    //   39: putfield sentPingCount : I
    //   42: aload_0
    //   43: iconst_1
    //   44: putfield awaitingPong : Z
    //   47: aload_0
    //   48: monitorexit
    //   49: iload_1
    //   50: iconst_m1
    //   51: if_icmpeq -> 120
    //   54: new java/lang/StringBuilder
    //   57: dup
    //   58: invokespecial <init> : ()V
    //   61: astore_2
    //   62: aload_2
    //   63: ldc_w 'sent ping but didn't receive pong within '
    //   66: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   69: pop
    //   70: aload_2
    //   71: aload_0
    //   72: getfield pingIntervalMillis : J
    //   75: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   78: pop
    //   79: aload_2
    //   80: ldc_w 'ms (after '
    //   83: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   86: pop
    //   87: aload_2
    //   88: iload_1
    //   89: iconst_1
    //   90: isub
    //   91: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   94: pop
    //   95: aload_2
    //   96: ldc_w ' successful ping/pongs)'
    //   99: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   102: pop
    //   103: aload_0
    //   104: new java/net/SocketTimeoutException
    //   107: dup
    //   108: aload_2
    //   109: invokevirtual toString : ()Ljava/lang/String;
    //   112: invokespecial <init> : (Ljava/lang/String;)V
    //   115: aconst_null
    //   116: invokevirtual failWebSocket : (Ljava/lang/Exception;Lokhttp3/Response;)V
    //   119: return
    //   120: aload_2
    //   121: getstatic j/f.f : Lj/f;
    //   124: invokevirtual writePing : (Lj/f;)V
    //   127: return
    //   128: astore_2
    //   129: aload_0
    //   130: aload_2
    //   131: aconst_null
    //   132: invokevirtual failWebSocket : (Ljava/lang/Exception;Lokhttp3/Response;)V
    //   135: return
    //   136: astore_2
    //   137: aload_0
    //   138: monitorexit
    //   139: aload_2
    //   140: athrow
    //   141: iconst_m1
    //   142: istore_1
    //   143: goto -> 32
    // Exception table:
    //   from	to	target	type
    //   2	11	136	finally
    //   12	29	136	finally
    //   32	49	136	finally
    //   120	127	128	java/io/IOException
    //   137	139	136	finally
  }
  
  final class CancelRunnable implements Runnable {
    public void run() {
      RealWebSocket.this.cancel();
    }
  }
  
  static final class Close {
    final long cancelAfterCloseMillis;
    
    final int code;
    
    final f reason;
    
    Close(int param1Int, f param1f, long param1Long) {
      this.code = param1Int;
      this.reason = param1f;
      this.cancelAfterCloseMillis = param1Long;
    }
  }
  
  static final class Message {
    final f data;
    
    final int formatOpcode;
    
    Message(int param1Int, f param1f) {
      this.formatOpcode = param1Int;
      this.data = param1f;
    }
  }
  
  private final class PingRunnable implements Runnable {
    public void run() {
      RealWebSocket.this.writePingFrame();
    }
  }
  
  public static abstract class Streams implements Closeable {
    public final boolean client;
    
    public final d sink;
    
    public final e source;
    
    public Streams(boolean param1Boolean, e param1e, d param1d) {
      this.client = param1Boolean;
      this.source = param1e;
      this.sink = param1d;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/okhttp3/internal/ws/RealWebSocket.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */