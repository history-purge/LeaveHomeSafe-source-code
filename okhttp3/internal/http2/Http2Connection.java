package okhttp3.internal.http2;

import j.c;
import j.d;
import j.e;
import j.f;
import j.l;
import java.io.Closeable;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.Headers;
import okhttp3.Protocol;
import okhttp3.internal.NamedRunnable;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;

public final class Http2Connection implements Closeable {
  static final int OKHTTP_CLIENT_WINDOW_SIZE = 16777216;
  
  private static final ExecutorService listenerExecutor = new ThreadPoolExecutor(0, 2147483647, 60L, TimeUnit.SECONDS, new SynchronousQueue<Runnable>(), Util.threadFactory("OkHttp Http2Connection", true));
  
  private boolean awaitingPong;
  
  long bytesLeftInWriteWindow;
  
  final boolean client;
  
  final Set<Integer> currentPushRequests;
  
  final String hostname;
  
  int lastGoodStreamId;
  
  final Listener listener;
  
  int nextStreamId;
  
  Settings okHttpSettings;
  
  final Settings peerSettings;
  
  private final ExecutorService pushExecutor;
  
  final PushObserver pushObserver;
  
  final ReaderRunnable readerRunnable;
  
  boolean receivedInitialPeerSettings;
  
  boolean shutdown;
  
  final Socket socket;
  
  final Map<Integer, Http2Stream> streams;
  
  long unacknowledgedBytesRead;
  
  final Http2Writer writer;
  
  private final ScheduledExecutorService writerExecutor;
  
  Http2Connection(Builder paramBuilder) {
    int i;
    this.streams = new LinkedHashMap<Integer, Http2Stream>();
    this.unacknowledgedBytesRead = 0L;
    this.okHttpSettings = new Settings();
    this.peerSettings = new Settings();
    this.receivedInitialPeerSettings = false;
    this.currentPushRequests = new LinkedHashSet<Integer>();
    this.pushObserver = paramBuilder.pushObserver;
    boolean bool = paramBuilder.client;
    this.client = bool;
    this.listener = paramBuilder.listener;
    if (bool) {
      i = 1;
    } else {
      i = 2;
    } 
    this.nextStreamId = i;
    if (paramBuilder.client)
      this.nextStreamId += 2; 
    if (paramBuilder.client)
      this.okHttpSettings.set(7, 16777216); 
    this.hostname = paramBuilder.hostname;
    this.writerExecutor = new ScheduledThreadPoolExecutor(1, Util.threadFactory(Util.format("OkHttp %s Writer", new Object[] { this.hostname }), false));
    if (paramBuilder.pingIntervalMillis != 0) {
      ScheduledExecutorService scheduledExecutorService = this.writerExecutor;
      PingRunnable pingRunnable = new PingRunnable(false, 0, 0);
      i = paramBuilder.pingIntervalMillis;
      scheduledExecutorService.scheduleAtFixedRate((Runnable)pingRunnable, i, i, TimeUnit.MILLISECONDS);
    } 
    this.pushExecutor = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(), Util.threadFactory(Util.format("OkHttp %s Push Observer", new Object[] { this.hostname }), true));
    this.peerSettings.set(7, 65535);
    this.peerSettings.set(5, 16384);
    this.bytesLeftInWriteWindow = this.peerSettings.getInitialWindowSize();
    this.socket = paramBuilder.socket;
    this.writer = new Http2Writer(paramBuilder.sink, this.client);
    this.readerRunnable = new ReaderRunnable(new Http2Reader(paramBuilder.source, this.client));
  }
  
  private void failConnection() {
    try {
      close(ErrorCode.PROTOCOL_ERROR, ErrorCode.PROTOCOL_ERROR);
      return;
    } catch (IOException iOException) {
      return;
    } 
  }
  
  private Http2Stream newStream(int paramInt, List<Header> paramList, boolean paramBoolean) {
    // Byte code:
    //   0: iload_3
    //   1: iconst_1
    //   2: ixor
    //   3: istore #6
    //   5: aload_0
    //   6: getfield writer : Lokhttp3/internal/http2/Http2Writer;
    //   9: astore #7
    //   11: aload #7
    //   13: monitorenter
    //   14: aload_0
    //   15: monitorenter
    //   16: aload_0
    //   17: getfield nextStreamId : I
    //   20: ldc 1073741823
    //   22: if_icmple -> 32
    //   25: aload_0
    //   26: getstatic okhttp3/internal/http2/ErrorCode.REFUSED_STREAM : Lokhttp3/internal/http2/ErrorCode;
    //   29: invokevirtual shutdown : (Lokhttp3/internal/http2/ErrorCode;)V
    //   32: aload_0
    //   33: getfield shutdown : Z
    //   36: ifne -> 191
    //   39: aload_0
    //   40: getfield nextStreamId : I
    //   43: istore #5
    //   45: aload_0
    //   46: aload_0
    //   47: getfield nextStreamId : I
    //   50: iconst_2
    //   51: iadd
    //   52: putfield nextStreamId : I
    //   55: new okhttp3/internal/http2/Http2Stream
    //   58: dup
    //   59: iload #5
    //   61: aload_0
    //   62: iload #6
    //   64: iconst_0
    //   65: aconst_null
    //   66: invokespecial <init> : (ILokhttp3/internal/http2/Http2Connection;ZZLokhttp3/Headers;)V
    //   69: astore #8
    //   71: iload_3
    //   72: ifeq -> 216
    //   75: aload_0
    //   76: getfield bytesLeftInWriteWindow : J
    //   79: lconst_0
    //   80: lcmp
    //   81: ifeq -> 216
    //   84: aload #8
    //   86: getfield bytesLeftInWriteWindow : J
    //   89: lconst_0
    //   90: lcmp
    //   91: ifne -> 210
    //   94: goto -> 216
    //   97: aload #8
    //   99: invokevirtual isOpen : ()Z
    //   102: ifeq -> 122
    //   105: aload_0
    //   106: getfield streams : Ljava/util/Map;
    //   109: iload #5
    //   111: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   114: aload #8
    //   116: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   121: pop
    //   122: aload_0
    //   123: monitorexit
    //   124: iload_1
    //   125: ifne -> 144
    //   128: aload_0
    //   129: getfield writer : Lokhttp3/internal/http2/Http2Writer;
    //   132: iload #6
    //   134: iload #5
    //   136: iload_1
    //   137: aload_2
    //   138: invokevirtual synStream : (ZIILjava/util/List;)V
    //   141: goto -> 162
    //   144: aload_0
    //   145: getfield client : Z
    //   148: ifne -> 180
    //   151: aload_0
    //   152: getfield writer : Lokhttp3/internal/http2/Http2Writer;
    //   155: iload_1
    //   156: iload #5
    //   158: aload_2
    //   159: invokevirtual pushPromise : (IILjava/util/List;)V
    //   162: aload #7
    //   164: monitorexit
    //   165: iload #4
    //   167: ifeq -> 177
    //   170: aload_0
    //   171: getfield writer : Lokhttp3/internal/http2/Http2Writer;
    //   174: invokevirtual flush : ()V
    //   177: aload #8
    //   179: areturn
    //   180: new java/lang/IllegalArgumentException
    //   183: dup
    //   184: ldc_w 'client streams shouldn't have associated stream IDs'
    //   187: invokespecial <init> : (Ljava/lang/String;)V
    //   190: athrow
    //   191: new okhttp3/internal/http2/ConnectionShutdownException
    //   194: dup
    //   195: invokespecial <init> : ()V
    //   198: athrow
    //   199: astore_2
    //   200: aload_0
    //   201: monitorexit
    //   202: aload_2
    //   203: athrow
    //   204: astore_2
    //   205: aload #7
    //   207: monitorexit
    //   208: aload_2
    //   209: athrow
    //   210: iconst_0
    //   211: istore #4
    //   213: goto -> 97
    //   216: iconst_1
    //   217: istore #4
    //   219: goto -> 97
    // Exception table:
    //   from	to	target	type
    //   14	16	204	finally
    //   16	32	199	finally
    //   32	71	199	finally
    //   75	94	199	finally
    //   97	122	199	finally
    //   122	124	199	finally
    //   128	141	204	finally
    //   144	162	204	finally
    //   162	165	204	finally
    //   180	191	204	finally
    //   191	199	199	finally
    //   200	202	199	finally
    //   202	204	204	finally
    //   205	208	204	finally
  }
  
  private void pushExecutorExecute(NamedRunnable paramNamedRunnable) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokevirtual isShutdown : ()Z
    //   6: ifne -> 19
    //   9: aload_0
    //   10: getfield pushExecutor : Ljava/util/concurrent/ExecutorService;
    //   13: aload_1
    //   14: invokeinterface execute : (Ljava/lang/Runnable;)V
    //   19: aload_0
    //   20: monitorexit
    //   21: return
    //   22: astore_1
    //   23: aload_0
    //   24: monitorexit
    //   25: aload_1
    //   26: athrow
    // Exception table:
    //   from	to	target	type
    //   2	19	22	finally
  }
  
  void awaitPong() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield awaitingPong : Z
    //   6: ifeq -> 16
    //   9: aload_0
    //   10: invokevirtual wait : ()V
    //   13: goto -> 2
    //   16: aload_0
    //   17: monitorexit
    //   18: return
    //   19: astore_1
    //   20: aload_0
    //   21: monitorexit
    //   22: goto -> 27
    //   25: aload_1
    //   26: athrow
    //   27: goto -> 25
    // Exception table:
    //   from	to	target	type
    //   2	13	19	finally
  }
  
  public void close() {
    close(ErrorCode.NO_ERROR, ErrorCode.CANCEL);
  }
  
  void close(ErrorCode paramErrorCode1, ErrorCode paramErrorCode2) {
    // Byte code:
    //   0: aconst_null
    //   1: astore #6
    //   3: aload_0
    //   4: aload_1
    //   5: invokevirtual shutdown : (Lokhttp3/internal/http2/ErrorCode;)V
    //   8: aconst_null
    //   9: astore_1
    //   10: goto -> 14
    //   13: astore_1
    //   14: aload_0
    //   15: monitorenter
    //   16: aload_0
    //   17: getfield streams : Ljava/util/Map;
    //   20: invokeinterface isEmpty : ()Z
    //   25: ifne -> 68
    //   28: aload_0
    //   29: getfield streams : Ljava/util/Map;
    //   32: invokeinterface values : ()Ljava/util/Collection;
    //   37: aload_0
    //   38: getfield streams : Ljava/util/Map;
    //   41: invokeinterface size : ()I
    //   46: anewarray okhttp3/internal/http2/Http2Stream
    //   49: invokeinterface toArray : ([Ljava/lang/Object;)[Ljava/lang/Object;
    //   54: checkcast [Lokhttp3/internal/http2/Http2Stream;
    //   57: astore #6
    //   59: aload_0
    //   60: getfield streams : Ljava/util/Map;
    //   63: invokeinterface clear : ()V
    //   68: aload_0
    //   69: monitorexit
    //   70: aload_1
    //   71: astore #5
    //   73: aload #6
    //   75: ifnull -> 135
    //   78: aload #6
    //   80: arraylength
    //   81: istore #4
    //   83: iconst_0
    //   84: istore_3
    //   85: aload_1
    //   86: astore #5
    //   88: iload_3
    //   89: iload #4
    //   91: if_icmpge -> 135
    //   94: aload #6
    //   96: iload_3
    //   97: aaload
    //   98: astore #5
    //   100: aload #5
    //   102: aload_2
    //   103: invokevirtual close : (Lokhttp3/internal/http2/ErrorCode;)V
    //   106: aload_1
    //   107: astore #5
    //   109: goto -> 125
    //   112: astore #7
    //   114: aload_1
    //   115: astore #5
    //   117: aload_1
    //   118: ifnull -> 125
    //   121: aload #7
    //   123: astore #5
    //   125: iload_3
    //   126: iconst_1
    //   127: iadd
    //   128: istore_3
    //   129: aload #5
    //   131: astore_1
    //   132: goto -> 85
    //   135: aload_0
    //   136: getfield writer : Lokhttp3/internal/http2/Http2Writer;
    //   139: invokevirtual close : ()V
    //   142: aload #5
    //   144: astore_1
    //   145: goto -> 159
    //   148: astore_2
    //   149: aload #5
    //   151: astore_1
    //   152: aload #5
    //   154: ifnonnull -> 159
    //   157: aload_2
    //   158: astore_1
    //   159: aload_0
    //   160: getfield socket : Ljava/net/Socket;
    //   163: invokevirtual close : ()V
    //   166: goto -> 170
    //   169: astore_1
    //   170: aload_0
    //   171: getfield writerExecutor : Ljava/util/concurrent/ScheduledExecutorService;
    //   174: invokeinterface shutdown : ()V
    //   179: aload_0
    //   180: getfield pushExecutor : Ljava/util/concurrent/ExecutorService;
    //   183: invokeinterface shutdown : ()V
    //   188: aload_1
    //   189: ifnonnull -> 193
    //   192: return
    //   193: aload_1
    //   194: athrow
    //   195: astore_1
    //   196: aload_0
    //   197: monitorexit
    //   198: goto -> 203
    //   201: aload_1
    //   202: athrow
    //   203: goto -> 201
    // Exception table:
    //   from	to	target	type
    //   3	8	13	java/io/IOException
    //   16	68	195	finally
    //   68	70	195	finally
    //   100	106	112	java/io/IOException
    //   135	142	148	java/io/IOException
    //   159	166	169	java/io/IOException
    //   196	198	195	finally
  }
  
  public void flush() {
    this.writer.flush();
  }
  
  public Protocol getProtocol() {
    return Protocol.HTTP_2;
  }
  
  Http2Stream getStream(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield streams : Ljava/util/Map;
    //   6: iload_1
    //   7: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   10: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   15: checkcast okhttp3/internal/http2/Http2Stream
    //   18: astore_2
    //   19: aload_0
    //   20: monitorexit
    //   21: aload_2
    //   22: areturn
    //   23: astore_2
    //   24: aload_0
    //   25: monitorexit
    //   26: aload_2
    //   27: athrow
    // Exception table:
    //   from	to	target	type
    //   2	19	23	finally
  }
  
  public boolean isShutdown() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield shutdown : Z
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
  
  public int maxConcurrentStreams() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield peerSettings : Lokhttp3/internal/http2/Settings;
    //   6: ldc 2147483647
    //   8: invokevirtual getMaxConcurrentStreams : (I)I
    //   11: istore_1
    //   12: aload_0
    //   13: monitorexit
    //   14: iload_1
    //   15: ireturn
    //   16: astore_2
    //   17: aload_0
    //   18: monitorexit
    //   19: aload_2
    //   20: athrow
    // Exception table:
    //   from	to	target	type
    //   2	12	16	finally
  }
  
  public Http2Stream newStream(List<Header> paramList, boolean paramBoolean) {
    return newStream(0, paramList, paramBoolean);
  }
  
  public int openStreamCount() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield streams : Ljava/util/Map;
    //   6: invokeinterface size : ()I
    //   11: istore_1
    //   12: aload_0
    //   13: monitorexit
    //   14: iload_1
    //   15: ireturn
    //   16: astore_2
    //   17: aload_0
    //   18: monitorexit
    //   19: aload_2
    //   20: athrow
    // Exception table:
    //   from	to	target	type
    //   2	12	16	finally
  }
  
  void pushDataLater(final int streamId, e parame, final int byteCount, final boolean inFinished) {
    final c buffer = new c();
    long l = byteCount;
    parame.g(l);
    parame.read(c, l);
    if (c.s() == l) {
      pushExecutorExecute(new NamedRunnable("OkHttp %s Push Data[%s]", new Object[] { this.hostname, Integer.valueOf(streamId) }) {
            public void execute() {
              try {
                boolean bool = Http2Connection.this.pushObserver.onData(streamId, (e)buffer, byteCount, inFinished);
                if (bool)
                  Http2Connection.this.writer.rstStream(streamId, ErrorCode.CANCEL); 
                if (bool || inFinished)
                  synchronized (Http2Connection.this) {
                    Http2Connection.this.currentPushRequests.remove(Integer.valueOf(streamId));
                    return;
                  }  
                return;
              } catch (IOException iOException) {
                return;
              } 
            }
          });
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(c.s());
    stringBuilder.append(" != ");
    stringBuilder.append(byteCount);
    throw new IOException(stringBuilder.toString());
  }
  
  void pushHeadersLater(final int streamId, final List<Header> requestHeaders, final boolean inFinished) {
    try {
      pushExecutorExecute(new NamedRunnable("OkHttp %s Push Headers[%s]", new Object[] { this.hostname, Integer.valueOf(streamId) }) {
            public void execute() {
              // Byte code:
              //   0: aload_0
              //   1: getfield this$0 : Lokhttp3/internal/http2/Http2Connection;
              //   4: getfield pushObserver : Lokhttp3/internal/http2/PushObserver;
              //   7: aload_0
              //   8: getfield val$streamId : I
              //   11: aload_0
              //   12: getfield val$requestHeaders : Ljava/util/List;
              //   15: aload_0
              //   16: getfield val$inFinished : Z
              //   19: invokeinterface onHeaders : (ILjava/util/List;Z)Z
              //   24: istore_1
              //   25: iload_1
              //   26: ifeq -> 46
              //   29: aload_0
              //   30: getfield this$0 : Lokhttp3/internal/http2/Http2Connection;
              //   33: getfield writer : Lokhttp3/internal/http2/Http2Writer;
              //   36: aload_0
              //   37: getfield val$streamId : I
              //   40: getstatic okhttp3/internal/http2/ErrorCode.CANCEL : Lokhttp3/internal/http2/ErrorCode;
              //   43: invokevirtual rstStream : (ILokhttp3/internal/http2/ErrorCode;)V
              //   46: iload_1
              //   47: ifne -> 57
              //   50: aload_0
              //   51: getfield val$inFinished : Z
              //   54: ifeq -> 92
              //   57: aload_0
              //   58: getfield this$0 : Lokhttp3/internal/http2/Http2Connection;
              //   61: astore_2
              //   62: aload_2
              //   63: monitorenter
              //   64: aload_0
              //   65: getfield this$0 : Lokhttp3/internal/http2/Http2Connection;
              //   68: getfield currentPushRequests : Ljava/util/Set;
              //   71: aload_0
              //   72: getfield val$streamId : I
              //   75: invokestatic valueOf : (I)Ljava/lang/Integer;
              //   78: invokeinterface remove : (Ljava/lang/Object;)Z
              //   83: pop
              //   84: aload_2
              //   85: monitorexit
              //   86: return
              //   87: astore_3
              //   88: aload_2
              //   89: monitorexit
              //   90: aload_3
              //   91: athrow
              //   92: return
              //   93: astore_2
              //   94: return
              // Exception table:
              //   from	to	target	type
              //   29	46	93	java/io/IOException
              //   50	57	93	java/io/IOException
              //   57	64	93	java/io/IOException
              //   64	86	87	finally
              //   88	90	87	finally
              //   90	92	93	java/io/IOException
            }
          });
      return;
    } catch (RejectedExecutionException rejectedExecutionException) {
      return;
    } 
  }
  
  void pushRequestLater(int paramInt, List<Header> paramList) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield currentPushRequests : Ljava/util/Set;
    //   6: iload_1
    //   7: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   10: invokeinterface contains : (Ljava/lang/Object;)Z
    //   15: ifeq -> 29
    //   18: aload_0
    //   19: iload_1
    //   20: getstatic okhttp3/internal/http2/ErrorCode.PROTOCOL_ERROR : Lokhttp3/internal/http2/ErrorCode;
    //   23: invokevirtual writeSynResetLater : (ILokhttp3/internal/http2/ErrorCode;)V
    //   26: aload_0
    //   27: monitorexit
    //   28: return
    //   29: aload_0
    //   30: getfield currentPushRequests : Ljava/util/Set;
    //   33: iload_1
    //   34: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   37: invokeinterface add : (Ljava/lang/Object;)Z
    //   42: pop
    //   43: aload_0
    //   44: monitorexit
    //   45: aload_0
    //   46: new okhttp3/internal/http2/Http2Connection$3
    //   49: dup
    //   50: aload_0
    //   51: ldc_w 'OkHttp %s Push Request[%s]'
    //   54: iconst_2
    //   55: anewarray java/lang/Object
    //   58: dup
    //   59: iconst_0
    //   60: aload_0
    //   61: getfield hostname : Ljava/lang/String;
    //   64: aastore
    //   65: dup
    //   66: iconst_1
    //   67: iload_1
    //   68: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   71: aastore
    //   72: iload_1
    //   73: aload_2
    //   74: invokespecial <init> : (Lokhttp3/internal/http2/Http2Connection;Ljava/lang/String;[Ljava/lang/Object;ILjava/util/List;)V
    //   77: invokespecial pushExecutorExecute : (Lokhttp3/internal/NamedRunnable;)V
    //   80: return
    //   81: astore_2
    //   82: aload_0
    //   83: monitorexit
    //   84: aload_2
    //   85: athrow
    //   86: astore_2
    //   87: return
    // Exception table:
    //   from	to	target	type
    //   2	28	81	finally
    //   29	45	81	finally
    //   45	80	86	java/util/concurrent/RejectedExecutionException
    //   82	84	81	finally
  }
  
  void pushResetLater(final int streamId, final ErrorCode errorCode) {
    pushExecutorExecute(new NamedRunnable("OkHttp %s Push Reset[%s]", new Object[] { this.hostname, Integer.valueOf(streamId) }) {
          public void execute() {
            Http2Connection.this.pushObserver.onReset(streamId, errorCode);
            synchronized (Http2Connection.this) {
              Http2Connection.this.currentPushRequests.remove(Integer.valueOf(streamId));
              return;
            } 
          }
        });
  }
  
  public Http2Stream pushStream(int paramInt, List<Header> paramList, boolean paramBoolean) {
    if (!this.client)
      return newStream(paramInt, paramList, paramBoolean); 
    throw new IllegalStateException("Client cannot push requests.");
  }
  
  boolean pushedStream(int paramInt) {
    return (paramInt != 0 && (paramInt & 0x1) == 0);
  }
  
  Http2Stream removeStream(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield streams : Ljava/util/Map;
    //   6: iload_1
    //   7: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   10: invokeinterface remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   15: checkcast okhttp3/internal/http2/Http2Stream
    //   18: astore_2
    //   19: aload_0
    //   20: invokevirtual notifyAll : ()V
    //   23: aload_0
    //   24: monitorexit
    //   25: aload_2
    //   26: areturn
    //   27: astore_2
    //   28: aload_0
    //   29: monitorexit
    //   30: aload_2
    //   31: athrow
    // Exception table:
    //   from	to	target	type
    //   2	23	27	finally
  }
  
  public void setSettings(Settings paramSettings) {
    // Byte code:
    //   0: aload_0
    //   1: getfield writer : Lokhttp3/internal/http2/Http2Writer;
    //   4: astore_2
    //   5: aload_2
    //   6: monitorenter
    //   7: aload_0
    //   8: monitorenter
    //   9: aload_0
    //   10: getfield shutdown : Z
    //   13: ifne -> 37
    //   16: aload_0
    //   17: getfield okHttpSettings : Lokhttp3/internal/http2/Settings;
    //   20: aload_1
    //   21: invokevirtual merge : (Lokhttp3/internal/http2/Settings;)V
    //   24: aload_0
    //   25: monitorexit
    //   26: aload_0
    //   27: getfield writer : Lokhttp3/internal/http2/Http2Writer;
    //   30: aload_1
    //   31: invokevirtual settings : (Lokhttp3/internal/http2/Settings;)V
    //   34: aload_2
    //   35: monitorexit
    //   36: return
    //   37: new okhttp3/internal/http2/ConnectionShutdownException
    //   40: dup
    //   41: invokespecial <init> : ()V
    //   44: athrow
    //   45: astore_1
    //   46: aload_0
    //   47: monitorexit
    //   48: aload_1
    //   49: athrow
    //   50: astore_1
    //   51: aload_2
    //   52: monitorexit
    //   53: aload_1
    //   54: athrow
    // Exception table:
    //   from	to	target	type
    //   7	9	50	finally
    //   9	26	45	finally
    //   26	36	50	finally
    //   37	45	45	finally
    //   46	48	45	finally
    //   48	50	50	finally
    //   51	53	50	finally
  }
  
  public void shutdown(ErrorCode paramErrorCode) {
    // Byte code:
    //   0: aload_0
    //   1: getfield writer : Lokhttp3/internal/http2/Http2Writer;
    //   4: astore_3
    //   5: aload_3
    //   6: monitorenter
    //   7: aload_0
    //   8: monitorenter
    //   9: aload_0
    //   10: getfield shutdown : Z
    //   13: ifeq -> 21
    //   16: aload_0
    //   17: monitorexit
    //   18: aload_3
    //   19: monitorexit
    //   20: return
    //   21: aload_0
    //   22: iconst_1
    //   23: putfield shutdown : Z
    //   26: aload_0
    //   27: getfield lastGoodStreamId : I
    //   30: istore_2
    //   31: aload_0
    //   32: monitorexit
    //   33: aload_0
    //   34: getfield writer : Lokhttp3/internal/http2/Http2Writer;
    //   37: iload_2
    //   38: aload_1
    //   39: getstatic okhttp3/internal/Util.EMPTY_BYTE_ARRAY : [B
    //   42: invokevirtual goAway : (ILokhttp3/internal/http2/ErrorCode;[B)V
    //   45: aload_3
    //   46: monitorexit
    //   47: return
    //   48: astore_1
    //   49: aload_0
    //   50: monitorexit
    //   51: aload_1
    //   52: athrow
    //   53: astore_1
    //   54: aload_3
    //   55: monitorexit
    //   56: aload_1
    //   57: athrow
    // Exception table:
    //   from	to	target	type
    //   7	9	53	finally
    //   9	18	48	finally
    //   18	20	53	finally
    //   21	33	48	finally
    //   33	47	53	finally
    //   49	51	48	finally
    //   51	53	53	finally
    //   54	56	53	finally
  }
  
  public void start() {
    start(true);
  }
  
  void start(boolean paramBoolean) {
    if (paramBoolean) {
      this.writer.connectionPreface();
      this.writer.settings(this.okHttpSettings);
      int i = this.okHttpSettings.getInitialWindowSize();
      if (i != 65535)
        this.writer.windowUpdate(0, (i - 65535)); 
    } 
    (new Thread((Runnable)this.readerRunnable)).start();
  }
  
  void updateConnectionFlowControl(long paramLong) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_0
    //   4: getfield unacknowledgedBytesRead : J
    //   7: lload_1
    //   8: ladd
    //   9: putfield unacknowledgedBytesRead : J
    //   12: aload_0
    //   13: getfield unacknowledgedBytesRead : J
    //   16: aload_0
    //   17: getfield okHttpSettings : Lokhttp3/internal/http2/Settings;
    //   20: invokevirtual getInitialWindowSize : ()I
    //   23: iconst_2
    //   24: idiv
    //   25: i2l
    //   26: lcmp
    //   27: iflt -> 44
    //   30: aload_0
    //   31: iconst_0
    //   32: aload_0
    //   33: getfield unacknowledgedBytesRead : J
    //   36: invokevirtual writeWindowUpdateLater : (IJ)V
    //   39: aload_0
    //   40: lconst_0
    //   41: putfield unacknowledgedBytesRead : J
    //   44: aload_0
    //   45: monitorexit
    //   46: return
    //   47: astore_3
    //   48: aload_0
    //   49: monitorexit
    //   50: aload_3
    //   51: athrow
    // Exception table:
    //   from	to	target	type
    //   2	44	47	finally
  }
  
  public void writeData(int paramInt, boolean paramBoolean, c paramc, long paramLong) {
    // Byte code:
    //   0: lload #4
    //   2: lstore #8
    //   4: lload #4
    //   6: lconst_0
    //   7: lcmp
    //   8: ifne -> 23
    //   11: aload_0
    //   12: getfield writer : Lokhttp3/internal/http2/Http2Writer;
    //   15: iload_2
    //   16: iload_1
    //   17: aload_3
    //   18: iconst_0
    //   19: invokevirtual data : (ZILj/c;I)V
    //   22: return
    //   23: lload #8
    //   25: lconst_0
    //   26: lcmp
    //   27: ifle -> 188
    //   30: aload_0
    //   31: monitorenter
    //   32: aload_0
    //   33: getfield bytesLeftInWriteWindow : J
    //   36: lconst_0
    //   37: lcmp
    //   38: ifgt -> 75
    //   41: aload_0
    //   42: getfield streams : Ljava/util/Map;
    //   45: iload_1
    //   46: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   49: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   54: ifeq -> 64
    //   57: aload_0
    //   58: invokevirtual wait : ()V
    //   61: goto -> 32
    //   64: new java/io/IOException
    //   67: dup
    //   68: ldc_w 'stream closed'
    //   71: invokespecial <init> : (Ljava/lang/String;)V
    //   74: athrow
    //   75: lload #8
    //   77: aload_0
    //   78: getfield bytesLeftInWriteWindow : J
    //   81: invokestatic min : (JJ)J
    //   84: l2i
    //   85: aload_0
    //   86: getfield writer : Lokhttp3/internal/http2/Http2Writer;
    //   89: invokevirtual maxDataLength : ()I
    //   92: invokestatic min : (II)I
    //   95: istore #6
    //   97: aload_0
    //   98: getfield bytesLeftInWriteWindow : J
    //   101: lstore #4
    //   103: iload #6
    //   105: i2l
    //   106: lstore #10
    //   108: aload_0
    //   109: lload #4
    //   111: lload #10
    //   113: lsub
    //   114: putfield bytesLeftInWriteWindow : J
    //   117: aload_0
    //   118: monitorexit
    //   119: lload #8
    //   121: lload #10
    //   123: lsub
    //   124: lstore #8
    //   126: aload_0
    //   127: getfield writer : Lokhttp3/internal/http2/Http2Writer;
    //   130: astore #12
    //   132: iload_2
    //   133: ifeq -> 149
    //   136: lload #8
    //   138: lconst_0
    //   139: lcmp
    //   140: ifne -> 149
    //   143: iconst_1
    //   144: istore #7
    //   146: goto -> 152
    //   149: iconst_0
    //   150: istore #7
    //   152: aload #12
    //   154: iload #7
    //   156: iload_1
    //   157: aload_3
    //   158: iload #6
    //   160: invokevirtual data : (ZILj/c;I)V
    //   163: goto -> 23
    //   166: astore_3
    //   167: goto -> 184
    //   170: invokestatic currentThread : ()Ljava/lang/Thread;
    //   173: invokevirtual interrupt : ()V
    //   176: new java/io/InterruptedIOException
    //   179: dup
    //   180: invokespecial <init> : ()V
    //   183: athrow
    //   184: aload_0
    //   185: monitorexit
    //   186: aload_3
    //   187: athrow
    //   188: return
    //   189: astore_3
    //   190: goto -> 170
    // Exception table:
    //   from	to	target	type
    //   32	61	189	java/lang/InterruptedException
    //   32	61	166	finally
    //   64	75	189	java/lang/InterruptedException
    //   64	75	166	finally
    //   75	103	166	finally
    //   108	119	166	finally
    //   170	184	166	finally
    //   184	186	166	finally
  }
  
  void writePing(boolean paramBoolean, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: iload_1
    //   1: ifne -> 36
    //   4: aload_0
    //   5: monitorenter
    //   6: aload_0
    //   7: getfield awaitingPong : Z
    //   10: istore #4
    //   12: aload_0
    //   13: iconst_1
    //   14: putfield awaitingPong : Z
    //   17: aload_0
    //   18: monitorexit
    //   19: iload #4
    //   21: ifeq -> 36
    //   24: aload_0
    //   25: invokespecial failConnection : ()V
    //   28: return
    //   29: astore #5
    //   31: aload_0
    //   32: monitorexit
    //   33: aload #5
    //   35: athrow
    //   36: aload_0
    //   37: getfield writer : Lokhttp3/internal/http2/Http2Writer;
    //   40: iload_1
    //   41: iload_2
    //   42: iload_3
    //   43: invokevirtual ping : (ZII)V
    //   46: return
    //   47: aload_0
    //   48: invokespecial failConnection : ()V
    //   51: return
    //   52: astore #5
    //   54: goto -> 47
    // Exception table:
    //   from	to	target	type
    //   6	19	29	finally
    //   31	33	29	finally
    //   36	46	52	java/io/IOException
  }
  
  void writePingAndAwaitPong() {
    writePing(false, 1330343787, -257978967);
    awaitPong();
  }
  
  void writeSynReply(int paramInt, boolean paramBoolean, List<Header> paramList) {
    this.writer.synReply(paramBoolean, paramInt, paramList);
  }
  
  void writeSynReset(int paramInt, ErrorCode paramErrorCode) {
    this.writer.rstStream(paramInt, paramErrorCode);
  }
  
  void writeSynResetLater(final int streamId, final ErrorCode errorCode) {
    try {
      this.writerExecutor.execute((Runnable)new NamedRunnable("OkHttp %s stream %d", new Object[] { this.hostname, Integer.valueOf(streamId) }) {
            public void execute() {
              try {
                Http2Connection.this.writeSynReset(streamId, errorCode);
                return;
              } catch (IOException iOException) {
                Http2Connection.this.failConnection();
                return;
              } 
            }
          });
      return;
    } catch (RejectedExecutionException rejectedExecutionException) {
      return;
    } 
  }
  
  void writeWindowUpdateLater(final int streamId, final long unacknowledgedBytesRead) {
    try {
      this.writerExecutor.execute((Runnable)new NamedRunnable("OkHttp Window Update %s stream %d", new Object[] { this.hostname, Integer.valueOf(streamId) }) {
            public void execute() {
              try {
                Http2Connection.this.writer.windowUpdate(streamId, unacknowledgedBytesRead);
                return;
              } catch (IOException iOException) {
                Http2Connection.this.failConnection();
                return;
              } 
            }
          });
      return;
    } catch (RejectedExecutionException rejectedExecutionException) {
      return;
    } 
  }
  
  public static class Builder {
    boolean client;
    
    String hostname;
    
    Http2Connection.Listener listener = Http2Connection.Listener.REFUSE_INCOMING_STREAMS;
    
    int pingIntervalMillis;
    
    PushObserver pushObserver = PushObserver.CANCEL;
    
    d sink;
    
    Socket socket;
    
    e source;
    
    public Builder(boolean param1Boolean) {
      this.client = param1Boolean;
    }
    
    public Http2Connection build() {
      return new Http2Connection(this);
    }
    
    public Builder listener(Http2Connection.Listener param1Listener) {
      this.listener = param1Listener;
      return this;
    }
    
    public Builder pingIntervalMillis(int param1Int) {
      this.pingIntervalMillis = param1Int;
      return this;
    }
    
    public Builder pushObserver(PushObserver param1PushObserver) {
      this.pushObserver = param1PushObserver;
      return this;
    }
    
    public Builder socket(Socket param1Socket) {
      return socket(param1Socket, ((InetSocketAddress)param1Socket.getRemoteSocketAddress()).getHostName(), l.a(l.b(param1Socket)), l.a(l.a(param1Socket)));
    }
    
    public Builder socket(Socket param1Socket, String param1String, e param1e, d param1d) {
      this.socket = param1Socket;
      this.hostname = param1String;
      this.source = param1e;
      this.sink = param1d;
      return this;
    }
  }
  
  public static abstract class Listener {
    public static final Listener REFUSE_INCOMING_STREAMS = new Listener() {
        public void onStream(Http2Stream param2Http2Stream) {
          param2Http2Stream.close(ErrorCode.REFUSED_STREAM);
        }
      };
    
    public void onSettings(Http2Connection param1Http2Connection) {}
    
    public abstract void onStream(Http2Stream param1Http2Stream);
  }
  
  class null extends Listener {
    public void onStream(Http2Stream param1Http2Stream) {
      param1Http2Stream.close(ErrorCode.REFUSED_STREAM);
    }
  }
  
  final class PingRunnable extends NamedRunnable {
    final int payload1;
    
    final int payload2;
    
    final boolean reply;
    
    PingRunnable(boolean param1Boolean, int param1Int1, int param1Int2) {
      super("OkHttp %s ping %08x%08x", new Object[] { this$0.hostname, Integer.valueOf(param1Int1), Integer.valueOf(param1Int2) });
      this.reply = param1Boolean;
      this.payload1 = param1Int1;
      this.payload2 = param1Int2;
    }
    
    public void execute() {
      Http2Connection.this.writePing(this.reply, this.payload1, this.payload2);
    }
  }
  
  class ReaderRunnable extends NamedRunnable implements Http2Reader.Handler {
    final Http2Reader reader;
    
    ReaderRunnable(Http2Reader param1Http2Reader) {
      super("OkHttp %s", new Object[] { this$0.hostname });
      this.reader = param1Http2Reader;
    }
    
    private void applyAndAckSettings(final Settings peerSettings) {
      try {
        Http2Connection.this.writerExecutor.execute((Runnable)new NamedRunnable("OkHttp %s ACK Settings", new Object[] { this.this$0.hostname }) {
              public void execute() {
                try {
                  Http2Connection.this.writer.applyAndAckSettings(peerSettings);
                  return;
                } catch (IOException iOException) {
                  Http2Connection.this.failConnection();
                  return;
                } 
              }
            });
        return;
      } catch (RejectedExecutionException rejectedExecutionException) {
        return;
      } 
    }
    
    public void ackSettings() {}
    
    public void alternateService(int param1Int1, String param1String1, f param1f, String param1String2, int param1Int2, long param1Long) {}
    
    public void data(boolean param1Boolean, int param1Int1, e param1e, int param1Int2) {
      Http2Connection http2Connection;
      if (Http2Connection.this.pushedStream(param1Int1)) {
        Http2Connection.this.pushDataLater(param1Int1, param1e, param1Int2, param1Boolean);
        return;
      } 
      Http2Stream http2Stream = Http2Connection.this.getStream(param1Int1);
      if (http2Stream == null) {
        Http2Connection.this.writeSynResetLater(param1Int1, ErrorCode.PROTOCOL_ERROR);
        http2Connection = Http2Connection.this;
        long l = param1Int2;
        http2Connection.updateConnectionFlowControl(l);
        param1e.skip(l);
        return;
      } 
      http2Connection.receiveData(param1e, param1Int2);
      if (param1Boolean)
        http2Connection.receiveFin(); 
    }
    
    protected void execute() {
      ErrorCode errorCode3 = ErrorCode.INTERNAL_ERROR;
      try {
        this.reader.readConnectionPreface(this);
        while (this.reader.nextFrame(false, this));
      } catch (IOException iOException) {
      
      } finally {
        Http2Connection http2Connection1 = http2Connection;
        try {
          Http2Connection.this.close((ErrorCode)http2Connection1, (ErrorCode)http2Connection);
        } catch (IOException iOException) {}
        Util.closeQuietly(this.reader);
      } 
      ErrorCode errorCode2 = ErrorCode.PROTOCOL_ERROR;
      ErrorCode errorCode1 = errorCode2;
      ErrorCode errorCode4 = ErrorCode.PROTOCOL_ERROR;
      Http2Connection http2Connection = Http2Connection.this;
      errorCode1 = errorCode4;
      http2Connection.close(errorCode2, errorCode1);
    }
    
    public void goAway(int param1Int, ErrorCode param1ErrorCode, f param1f) {
      Http2Connection http2Connection;
      Http2Stream http2Stream;
      param1f.s();
      synchronized (Http2Connection.this) {
        Http2Stream[] arrayOfHttp2Stream = (Http2Stream[])Http2Connection.this.streams.values().toArray((Object[])new Http2Stream[Http2Connection.this.streams.size()]);
        Http2Connection.this.shutdown = true;
        int j = arrayOfHttp2Stream.length;
        int i;
        for (i = 0; i < j; i++) {
          http2Stream = arrayOfHttp2Stream[i];
          if (http2Stream.getId() > param1Int && http2Stream.isLocallyInitiated()) {
            http2Stream.receiveRstStream(ErrorCode.REFUSED_STREAM);
            Http2Connection.this.removeStream(http2Stream.getId());
          } 
        } 
        return;
      } 
    }
    
    public void headers(boolean param1Boolean, int param1Int1, int param1Int2, List<Header> param1List) {
      if (Http2Connection.this.pushedStream(param1Int1)) {
        Http2Connection.this.pushHeadersLater(param1Int1, param1List, param1Boolean);
        return;
      } 
      synchronized (Http2Connection.this) {
        final Http2Stream newStream;
        Http2Stream http2Stream2 = Http2Connection.this.getStream(param1Int1);
        if (http2Stream2 == null) {
          if (Http2Connection.this.shutdown)
            return; 
          if (param1Int1 <= Http2Connection.this.lastGoodStreamId)
            return; 
          if (param1Int1 % 2 == Http2Connection.this.nextStreamId % 2)
            return; 
          Headers headers = Util.toHeaders(param1List);
          http2Stream1 = new Http2Stream(param1Int1, Http2Connection.this, false, param1Boolean, headers);
          Http2Connection.this.lastGoodStreamId = param1Int1;
          Http2Connection.this.streams.put(Integer.valueOf(param1Int1), http2Stream1);
          Http2Connection.listenerExecutor.execute((Runnable)new NamedRunnable("OkHttp %s stream %d", new Object[] { this.this$0.hostname, Integer.valueOf(param1Int1) }) {
                public void execute() {
                  try {
                    Http2Connection.this.listener.onStream(newStream);
                    return;
                  } catch (IOException iOException) {
                    Platform platform = Platform.get();
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Http2Connection.Listener failure for ");
                    stringBuilder.append(Http2Connection.this.hostname);
                    platform.log(4, stringBuilder.toString(), iOException);
                    try {
                      newStream.close(ErrorCode.PROTOCOL_ERROR);
                      return;
                    } catch (IOException iOException1) {
                      return;
                    } 
                  } 
                }
              });
          return;
        } 
        http2Stream2.receiveHeaders((List<Header>)http2Stream1);
        if (param1Boolean)
          http2Stream2.receiveFin(); 
        return;
      } 
    }
    
    public void ping(boolean param1Boolean, int param1Int1, int param1Int2) {
      if (param1Boolean)
        synchronized (Http2Connection.this) {
          Http2Connection.access$302(Http2Connection.this, false);
          Http2Connection.this.notifyAll();
          return;
        }  
      try {
        Http2Connection.this.writerExecutor.execute((Runnable)new Http2Connection.PingRunnable(true, param1Int1, param1Int2));
        return;
      } catch (RejectedExecutionException rejectedExecutionException) {
        return;
      } 
    }
    
    public void priority(int param1Int1, int param1Int2, int param1Int3, boolean param1Boolean) {}
    
    public void pushPromise(int param1Int1, int param1Int2, List<Header> param1List) {
      Http2Connection.this.pushRequestLater(param1Int2, param1List);
    }
    
    public void rstStream(int param1Int, ErrorCode param1ErrorCode) {
      if (Http2Connection.this.pushedStream(param1Int)) {
        Http2Connection.this.pushResetLater(param1Int, param1ErrorCode);
        return;
      } 
      Http2Stream http2Stream = Http2Connection.this.removeStream(param1Int);
      if (http2Stream != null)
        http2Stream.receiveRstStream(param1ErrorCode); 
    }
    
    public void settings(boolean param1Boolean, Settings param1Settings) {
      synchronized (Http2Connection.this) {
        Http2Stream[] arrayOfHttp2Stream;
        long l;
        int i = Http2Connection.this.peerSettings.getInitialWindowSize();
        if (param1Boolean)
          Http2Connection.this.peerSettings.clear(); 
        Http2Connection.this.peerSettings.merge(param1Settings);
        applyAndAckSettings(param1Settings);
        int j = Http2Connection.this.peerSettings.getInitialWindowSize();
        param1Settings = null;
        if (j != -1 && j != i) {
          long l1 = (j - i);
          if (!Http2Connection.this.receivedInitialPeerSettings)
            Http2Connection.this.receivedInitialPeerSettings = true; 
          l = l1;
          if (!Http2Connection.this.streams.isEmpty()) {
            arrayOfHttp2Stream = (Http2Stream[])Http2Connection.this.streams.values().toArray((Object[])new Http2Stream[Http2Connection.this.streams.size()]);
            l = l1;
          } 
        } else {
          l = 0L;
        } 
        ExecutorService executorService = Http2Connection.listenerExecutor;
        String str = Http2Connection.this.hostname;
        i = 0;
        executorService.execute((Runnable)new NamedRunnable("OkHttp %s settings", new Object[] { str }) {
              public void execute() {
                Http2Connection http2Connection = Http2Connection.this;
                http2Connection.listener.onSettings(http2Connection);
              }
            });
        if (arrayOfHttp2Stream != null && l != 0L) {
          j = arrayOfHttp2Stream.length;
          while (i < j) {
            synchronized (arrayOfHttp2Stream[i]) {
              null.addBytesToWriteWindow(l);
              i++;
            } 
          } 
        } 
        return;
      } 
    }
    
    public void windowUpdate(int param1Int, long param1Long) {
      // Byte code:
      //   0: aload_0
      //   1: getfield this$0 : Lokhttp3/internal/http2/Http2Connection;
      //   4: astore #4
      //   6: iload_1
      //   7: ifne -> 50
      //   10: aload #4
      //   12: monitorenter
      //   13: aload_0
      //   14: getfield this$0 : Lokhttp3/internal/http2/Http2Connection;
      //   17: astore #5
      //   19: aload #5
      //   21: aload #5
      //   23: getfield bytesLeftInWriteWindow : J
      //   26: lload_2
      //   27: ladd
      //   28: putfield bytesLeftInWriteWindow : J
      //   31: aload_0
      //   32: getfield this$0 : Lokhttp3/internal/http2/Http2Connection;
      //   35: invokevirtual notifyAll : ()V
      //   38: aload #4
      //   40: monitorexit
      //   41: return
      //   42: astore #5
      //   44: aload #4
      //   46: monitorexit
      //   47: aload #5
      //   49: athrow
      //   50: aload #4
      //   52: iload_1
      //   53: invokevirtual getStream : (I)Lokhttp3/internal/http2/Http2Stream;
      //   56: astore #4
      //   58: aload #4
      //   60: ifnull -> 84
      //   63: aload #4
      //   65: monitorenter
      //   66: aload #4
      //   68: lload_2
      //   69: invokevirtual addBytesToWriteWindow : (J)V
      //   72: aload #4
      //   74: monitorexit
      //   75: return
      //   76: astore #5
      //   78: aload #4
      //   80: monitorexit
      //   81: aload #5
      //   83: athrow
      //   84: return
      // Exception table:
      //   from	to	target	type
      //   13	41	42	finally
      //   44	47	42	finally
      //   66	75	76	finally
      //   78	81	76	finally
    }
  }
  
  class null extends NamedRunnable {
    null(String param1String, Object[] param1ArrayOfObject) {
      super(param1String, param1ArrayOfObject);
    }
    
    public void execute() {
      try {
        Http2Connection.this.listener.onStream(newStream);
        return;
      } catch (IOException iOException) {
        Platform platform = Platform.get();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Http2Connection.Listener failure for ");
        stringBuilder.append(Http2Connection.this.hostname);
        platform.log(4, stringBuilder.toString(), iOException);
        try {
          newStream.close(ErrorCode.PROTOCOL_ERROR);
          return;
        } catch (IOException iOException1) {
          return;
        } 
      } 
    }
  }
  
  class null extends NamedRunnable {
    null(String param1String, Object... param1VarArgs) {
      super(param1String, param1VarArgs);
    }
    
    public void execute() {
      Http2Connection http2Connection = Http2Connection.this;
      http2Connection.listener.onSettings(http2Connection);
    }
  }
  
  class null extends NamedRunnable {
    null(String param1String, Object[] param1ArrayOfObject) {
      super(param1String, param1ArrayOfObject);
    }
    
    public void execute() {
      try {
        Http2Connection.this.writer.applyAndAckSettings(peerSettings);
        return;
      } catch (IOException iOException) {
        Http2Connection.this.failConnection();
        return;
      } 
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/okhttp3/internal/http2/Http2Connection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */