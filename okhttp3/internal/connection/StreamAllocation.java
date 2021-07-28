package okhttp3.internal.connection;

import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.ConnectionPool;
import okhttp3.EventListener;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Route;
import okhttp3.internal.Internal;
import okhttp3.internal.Util;
import okhttp3.internal.http.HttpCodec;

public final class StreamAllocation {
  public final Address address;
  
  public final Call call;
  
  private final Object callStackTrace;
  
  private boolean canceled;
  
  private HttpCodec codec;
  
  private RealConnection connection;
  
  private final ConnectionPool connectionPool;
  
  public final EventListener eventListener;
  
  private int refusedStreamCount;
  
  private boolean released;
  
  private boolean reportedAcquired;
  
  private Route route;
  
  private RouteSelector.Selection routeSelection;
  
  private final RouteSelector routeSelector;
  
  public StreamAllocation(ConnectionPool paramConnectionPool, Address paramAddress, Call paramCall, EventListener paramEventListener, Object paramObject) {
    this.connectionPool = paramConnectionPool;
    this.address = paramAddress;
    this.call = paramCall;
    this.eventListener = paramEventListener;
    this.routeSelector = new RouteSelector(paramAddress, routeDatabase(), paramCall, paramEventListener);
    this.callStackTrace = paramObject;
  }
  
  private Socket deallocate(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) {
    if (paramBoolean3)
      this.codec = null; 
    if (paramBoolean2)
      this.released = true; 
    RealConnection realConnection = this.connection;
    if (realConnection != null) {
      if (paramBoolean1)
        realConnection.noNewStreams = true; 
      if (this.codec == null && (this.released || this.connection.noNewStreams)) {
        release(this.connection);
        if (this.connection.allocations.isEmpty()) {
          this.connection.idleAtNanos = System.nanoTime();
          if (Internal.instance.connectionBecameIdle(this.connectionPool, this.connection)) {
            Socket socket = this.connection.socket();
            this.connection = null;
            return socket;
          } 
        } 
        realConnection = null;
        this.connection = null;
        return (Socket)realConnection;
      } 
    } 
    return null;
  }
  
  private RealConnection findConnection(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: getfield connectionPool : Lokhttp3/ConnectionPool;
    //   4: astore #14
    //   6: aload #14
    //   8: monitorenter
    //   9: aload_0
    //   10: getfield released : Z
    //   13: ifne -> 595
    //   16: aload_0
    //   17: getfield codec : Lokhttp3/internal/http/HttpCodec;
    //   20: ifnonnull -> 585
    //   23: aload_0
    //   24: getfield canceled : Z
    //   27: ifne -> 575
    //   30: aload_0
    //   31: getfield connection : Lokhttp3/internal/connection/RealConnection;
    //   34: astore #11
    //   36: aload_0
    //   37: invokespecial releaseIfNoNewStreams : ()Ljava/net/Socket;
    //   40: astore #15
    //   42: aload_0
    //   43: getfield connection : Lokhttp3/internal/connection/RealConnection;
    //   46: astore #10
    //   48: aconst_null
    //   49: astore #13
    //   51: aload #10
    //   53: ifnull -> 619
    //   56: aload_0
    //   57: getfield connection : Lokhttp3/internal/connection/RealConnection;
    //   60: astore #10
    //   62: aconst_null
    //   63: astore #11
    //   65: goto -> 68
    //   68: aload #11
    //   70: astore #12
    //   72: aload_0
    //   73: getfield reportedAcquired : Z
    //   76: ifne -> 82
    //   79: aconst_null
    //   80: astore #12
    //   82: aload #10
    //   84: ifnonnull -> 625
    //   87: getstatic okhttp3/internal/Internal.instance : Lokhttp3/internal/Internal;
    //   90: aload_0
    //   91: getfield connectionPool : Lokhttp3/ConnectionPool;
    //   94: aload_0
    //   95: getfield address : Lokhttp3/Address;
    //   98: aload_0
    //   99: aconst_null
    //   100: invokevirtual get : (Lokhttp3/ConnectionPool;Lokhttp3/Address;Lokhttp3/internal/connection/StreamAllocation;Lokhttp3/Route;)Lokhttp3/internal/connection/RealConnection;
    //   103: pop
    //   104: aload_0
    //   105: getfield connection : Lokhttp3/internal/connection/RealConnection;
    //   108: ifnull -> 126
    //   111: aload_0
    //   112: getfield connection : Lokhttp3/internal/connection/RealConnection;
    //   115: astore #10
    //   117: aconst_null
    //   118: astore #11
    //   120: iconst_1
    //   121: istore #6
    //   123: goto -> 135
    //   126: aload_0
    //   127: getfield route : Lokhttp3/Route;
    //   130: astore #11
    //   132: goto -> 628
    //   135: aload #14
    //   137: monitorexit
    //   138: aload #15
    //   140: invokestatic closeQuietly : (Ljava/net/Socket;)V
    //   143: aload #12
    //   145: ifnull -> 161
    //   148: aload_0
    //   149: getfield eventListener : Lokhttp3/EventListener;
    //   152: aload_0
    //   153: getfield call : Lokhttp3/Call;
    //   156: aload #12
    //   158: invokevirtual connectionReleased : (Lokhttp3/Call;Lokhttp3/Connection;)V
    //   161: iload #6
    //   163: ifeq -> 179
    //   166: aload_0
    //   167: getfield eventListener : Lokhttp3/EventListener;
    //   170: aload_0
    //   171: getfield call : Lokhttp3/Call;
    //   174: aload #10
    //   176: invokevirtual connectionAcquired : (Lokhttp3/Call;Lokhttp3/Connection;)V
    //   179: aload #10
    //   181: ifnull -> 187
    //   184: aload #10
    //   186: areturn
    //   187: aload #11
    //   189: ifnonnull -> 228
    //   192: aload_0
    //   193: getfield routeSelection : Lokhttp3/internal/connection/RouteSelector$Selection;
    //   196: astore #12
    //   198: aload #12
    //   200: ifnull -> 211
    //   203: aload #12
    //   205: invokevirtual hasNext : ()Z
    //   208: ifne -> 228
    //   211: aload_0
    //   212: aload_0
    //   213: getfield routeSelector : Lokhttp3/internal/connection/RouteSelector;
    //   216: invokevirtual next : ()Lokhttp3/internal/connection/RouteSelector$Selection;
    //   219: putfield routeSelection : Lokhttp3/internal/connection/RouteSelector$Selection;
    //   222: iconst_1
    //   223: istore #8
    //   225: goto -> 231
    //   228: iconst_0
    //   229: istore #8
    //   231: aload_0
    //   232: getfield connectionPool : Lokhttp3/ConnectionPool;
    //   235: astore #14
    //   237: aload #14
    //   239: monitorenter
    //   240: aload_0
    //   241: getfield canceled : Z
    //   244: ifne -> 557
    //   247: iload #6
    //   249: istore #7
    //   251: aload #10
    //   253: astore #12
    //   255: iload #8
    //   257: ifeq -> 353
    //   260: aload_0
    //   261: getfield routeSelection : Lokhttp3/internal/connection/RouteSelector$Selection;
    //   264: invokevirtual getAll : ()Ljava/util/List;
    //   267: astore #15
    //   269: aload #15
    //   271: invokeinterface size : ()I
    //   276: istore #9
    //   278: iconst_0
    //   279: istore #8
    //   281: iload #6
    //   283: istore #7
    //   285: aload #10
    //   287: astore #12
    //   289: iload #8
    //   291: iload #9
    //   293: if_icmpge -> 353
    //   296: aload #15
    //   298: iload #8
    //   300: invokeinterface get : (I)Ljava/lang/Object;
    //   305: checkcast okhttp3/Route
    //   308: astore #16
    //   310: getstatic okhttp3/internal/Internal.instance : Lokhttp3/internal/Internal;
    //   313: aload_0
    //   314: getfield connectionPool : Lokhttp3/ConnectionPool;
    //   317: aload_0
    //   318: getfield address : Lokhttp3/Address;
    //   321: aload_0
    //   322: aload #16
    //   324: invokevirtual get : (Lokhttp3/ConnectionPool;Lokhttp3/Address;Lokhttp3/internal/connection/StreamAllocation;Lokhttp3/Route;)Lokhttp3/internal/connection/RealConnection;
    //   327: pop
    //   328: aload_0
    //   329: getfield connection : Lokhttp3/internal/connection/RealConnection;
    //   332: ifnull -> 634
    //   335: aload_0
    //   336: getfield connection : Lokhttp3/internal/connection/RealConnection;
    //   339: astore #12
    //   341: aload_0
    //   342: aload #16
    //   344: putfield route : Lokhttp3/Route;
    //   347: iconst_1
    //   348: istore #7
    //   350: goto -> 353
    //   353: aload #12
    //   355: astore #10
    //   357: iload #7
    //   359: ifne -> 413
    //   362: aload #11
    //   364: astore #10
    //   366: aload #11
    //   368: ifnonnull -> 380
    //   371: aload_0
    //   372: getfield routeSelection : Lokhttp3/internal/connection/RouteSelector$Selection;
    //   375: invokevirtual next : ()Lokhttp3/Route;
    //   378: astore #10
    //   380: aload_0
    //   381: aload #10
    //   383: putfield route : Lokhttp3/Route;
    //   386: aload_0
    //   387: iconst_0
    //   388: putfield refusedStreamCount : I
    //   391: new okhttp3/internal/connection/RealConnection
    //   394: dup
    //   395: aload_0
    //   396: getfield connectionPool : Lokhttp3/ConnectionPool;
    //   399: aload #10
    //   401: invokespecial <init> : (Lokhttp3/ConnectionPool;Lokhttp3/Route;)V
    //   404: astore #10
    //   406: aload_0
    //   407: aload #10
    //   409: iconst_0
    //   410: invokevirtual acquire : (Lokhttp3/internal/connection/RealConnection;Z)V
    //   413: aload #14
    //   415: monitorexit
    //   416: iload #7
    //   418: ifeq -> 437
    //   421: aload_0
    //   422: getfield eventListener : Lokhttp3/EventListener;
    //   425: aload_0
    //   426: getfield call : Lokhttp3/Call;
    //   429: aload #10
    //   431: invokevirtual connectionAcquired : (Lokhttp3/Call;Lokhttp3/Connection;)V
    //   434: aload #10
    //   436: areturn
    //   437: aload #10
    //   439: iload_1
    //   440: iload_2
    //   441: iload_3
    //   442: iload #4
    //   444: iload #5
    //   446: aload_0
    //   447: getfield call : Lokhttp3/Call;
    //   450: aload_0
    //   451: getfield eventListener : Lokhttp3/EventListener;
    //   454: invokevirtual connect : (IIIIZLokhttp3/Call;Lokhttp3/EventListener;)V
    //   457: aload_0
    //   458: invokespecial routeDatabase : ()Lokhttp3/internal/connection/RouteDatabase;
    //   461: aload #10
    //   463: invokevirtual route : ()Lokhttp3/Route;
    //   466: invokevirtual connected : (Lokhttp3/Route;)V
    //   469: aload_0
    //   470: getfield connectionPool : Lokhttp3/ConnectionPool;
    //   473: astore #14
    //   475: aload #14
    //   477: monitorenter
    //   478: aload_0
    //   479: iconst_1
    //   480: putfield reportedAcquired : Z
    //   483: getstatic okhttp3/internal/Internal.instance : Lokhttp3/internal/Internal;
    //   486: aload_0
    //   487: getfield connectionPool : Lokhttp3/ConnectionPool;
    //   490: aload #10
    //   492: invokevirtual put : (Lokhttp3/ConnectionPool;Lokhttp3/internal/connection/RealConnection;)V
    //   495: aload #13
    //   497: astore #12
    //   499: aload #10
    //   501: astore #11
    //   503: aload #10
    //   505: invokevirtual isMultiplexed : ()Z
    //   508: ifeq -> 534
    //   511: getstatic okhttp3/internal/Internal.instance : Lokhttp3/internal/Internal;
    //   514: aload_0
    //   515: getfield connectionPool : Lokhttp3/ConnectionPool;
    //   518: aload_0
    //   519: getfield address : Lokhttp3/Address;
    //   522: aload_0
    //   523: invokevirtual deduplicate : (Lokhttp3/ConnectionPool;Lokhttp3/Address;Lokhttp3/internal/connection/StreamAllocation;)Ljava/net/Socket;
    //   526: astore #12
    //   528: aload_0
    //   529: getfield connection : Lokhttp3/internal/connection/RealConnection;
    //   532: astore #11
    //   534: aload #14
    //   536: monitorexit
    //   537: aload #12
    //   539: invokestatic closeQuietly : (Ljava/net/Socket;)V
    //   542: aload #11
    //   544: astore #10
    //   546: goto -> 421
    //   549: astore #10
    //   551: aload #14
    //   553: monitorexit
    //   554: aload #10
    //   556: athrow
    //   557: new java/io/IOException
    //   560: dup
    //   561: ldc 'Canceled'
    //   563: invokespecial <init> : (Ljava/lang/String;)V
    //   566: athrow
    //   567: astore #10
    //   569: aload #14
    //   571: monitorexit
    //   572: aload #10
    //   574: athrow
    //   575: new java/io/IOException
    //   578: dup
    //   579: ldc 'Canceled'
    //   581: invokespecial <init> : (Ljava/lang/String;)V
    //   584: athrow
    //   585: new java/lang/IllegalStateException
    //   588: dup
    //   589: ldc 'codec != null'
    //   591: invokespecial <init> : (Ljava/lang/String;)V
    //   594: athrow
    //   595: new java/lang/IllegalStateException
    //   598: dup
    //   599: ldc 'released'
    //   601: invokespecial <init> : (Ljava/lang/String;)V
    //   604: athrow
    //   605: astore #10
    //   607: aload #14
    //   609: monitorexit
    //   610: goto -> 616
    //   613: aload #10
    //   615: athrow
    //   616: goto -> 613
    //   619: aconst_null
    //   620: astore #10
    //   622: goto -> 68
    //   625: aconst_null
    //   626: astore #11
    //   628: iconst_0
    //   629: istore #6
    //   631: goto -> 135
    //   634: iload #8
    //   636: iconst_1
    //   637: iadd
    //   638: istore #8
    //   640: goto -> 281
    // Exception table:
    //   from	to	target	type
    //   9	48	605	finally
    //   56	62	605	finally
    //   72	79	605	finally
    //   87	117	605	finally
    //   126	132	605	finally
    //   135	138	605	finally
    //   240	247	567	finally
    //   260	278	567	finally
    //   296	347	567	finally
    //   371	380	567	finally
    //   380	413	567	finally
    //   413	416	567	finally
    //   478	495	549	finally
    //   503	534	549	finally
    //   534	537	549	finally
    //   551	554	549	finally
    //   557	567	567	finally
    //   569	572	567	finally
    //   575	585	605	finally
    //   585	595	605	finally
    //   595	605	605	finally
    //   607	610	605	finally
  }
  
  private RealConnection findHealthyConnection(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean1, boolean paramBoolean2) {
    while (true) {
      null = findConnection(paramInt1, paramInt2, paramInt3, paramInt4, paramBoolean1);
      synchronized (this.connectionPool) {
        if (null.successCount == 0)
          return null; 
        if (!null.isHealthy(paramBoolean2)) {
          noNewStreams();
          continue;
        } 
        return null;
      } 
    } 
  }
  
  private void release(RealConnection paramRealConnection) {
    int j = paramRealConnection.allocations.size();
    for (int i = 0; i < j; i++) {
      if (((Reference<StreamAllocation>)paramRealConnection.allocations.get(i)).get() == this) {
        paramRealConnection.allocations.remove(i);
        return;
      } 
    } 
    IllegalStateException illegalStateException = new IllegalStateException();
    throw illegalStateException;
  }
  
  private Socket releaseIfNoNewStreams() {
    RealConnection realConnection = this.connection;
    return (realConnection != null && realConnection.noNewStreams) ? deallocate(false, false, true) : null;
  }
  
  private RouteDatabase routeDatabase() {
    return Internal.instance.routeDatabase(this.connectionPool);
  }
  
  public void acquire(RealConnection paramRealConnection, boolean paramBoolean) {
    if (this.connection == null) {
      this.connection = paramRealConnection;
      this.reportedAcquired = paramBoolean;
      paramRealConnection.allocations.add(new StreamAllocationReference(this, this.callStackTrace));
      return;
    } 
    throw new IllegalStateException();
  }
  
  public void cancel() {
    synchronized (this.connectionPool) {
      this.canceled = true;
      HttpCodec httpCodec = this.codec;
      RealConnection realConnection = this.connection;
      if (httpCodec != null) {
        httpCodec.cancel();
        return;
      } 
      if (realConnection != null)
        realConnection.cancel(); 
      return;
    } 
  }
  
  public HttpCodec codec() {
    synchronized (this.connectionPool) {
      return this.codec;
    } 
  }
  
  public RealConnection connection() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield connection : Lokhttp3/internal/connection/RealConnection;
    //   6: astore_1
    //   7: aload_0
    //   8: monitorexit
    //   9: aload_1
    //   10: areturn
    //   11: astore_1
    //   12: aload_0
    //   13: monitorexit
    //   14: aload_1
    //   15: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	11	finally
  }
  
  public boolean hasMoreRoutes() {
    if (this.route == null) {
      RouteSelector.Selection selection = this.routeSelection;
      if ((selection == null || !selection.hasNext()) && !this.routeSelector.hasNext())
        return false; 
    } 
    return true;
  }
  
  public HttpCodec newStream(OkHttpClient paramOkHttpClient, Interceptor.Chain paramChain, boolean paramBoolean) {
    int i = paramChain.connectTimeoutMillis();
    int j = paramChain.readTimeoutMillis();
    int k = paramChain.writeTimeoutMillis();
    int m = paramOkHttpClient.pingIntervalMillis();
    boolean bool = paramOkHttpClient.retryOnConnectionFailure();
    try {
      null = findHealthyConnection(i, j, k, m, bool, paramBoolean).newCodec(paramOkHttpClient, paramChain, this);
      synchronized (this.connectionPool) {
        this.codec = null;
        return null;
      } 
    } catch (IOException iOException) {
      throw new RouteException(iOException);
    } 
  }
  
  public void noNewStreams() {
    synchronized (this.connectionPool) {
      RealConnection realConnection = this.connection;
      Socket socket = deallocate(true, false, false);
      if (this.connection != null)
        realConnection = null; 
      Util.closeQuietly(socket);
      if (realConnection != null)
        this.eventListener.connectionReleased(this.call, realConnection); 
      return;
    } 
  }
  
  public void release() {
    synchronized (this.connectionPool) {
      RealConnection realConnection = this.connection;
      Socket socket = deallocate(false, true, false);
      if (this.connection != null)
        realConnection = null; 
      Util.closeQuietly(socket);
      if (realConnection != null) {
        Internal.instance.timeoutExit(this.call, null);
        this.eventListener.connectionReleased(this.call, realConnection);
        this.eventListener.callEnd(this.call);
      } 
      return;
    } 
  }
  
  public Socket releaseAndAcquire(RealConnection paramRealConnection) {
    if (this.codec == null && this.connection.allocations.size() == 1) {
      Reference<StreamAllocation> reference = this.connection.allocations.get(0);
      Socket socket = deallocate(true, false, false);
      this.connection = paramRealConnection;
      paramRealConnection.allocations.add(reference);
      return socket;
    } 
    throw new IllegalStateException();
  }
  
  public Route route() {
    return this.route;
  }
  
  public void streamFailed(IOException paramIOException) {
    // Byte code:
    //   0: aload_0
    //   1: getfield connectionPool : Lokhttp3/ConnectionPool;
    //   4: astore_3
    //   5: aload_3
    //   6: monitorenter
    //   7: aload_1
    //   8: instanceof okhttp3/internal/http2/StreamResetException
    //   11: ifeq -> 65
    //   14: aload_1
    //   15: checkcast okhttp3/internal/http2/StreamResetException
    //   18: getfield errorCode : Lokhttp3/internal/http2/ErrorCode;
    //   21: astore_1
    //   22: aload_1
    //   23: getstatic okhttp3/internal/http2/ErrorCode.REFUSED_STREAM : Lokhttp3/internal/http2/ErrorCode;
    //   26: if_acmpne -> 50
    //   29: aload_0
    //   30: aload_0
    //   31: getfield refusedStreamCount : I
    //   34: iconst_1
    //   35: iadd
    //   36: putfield refusedStreamCount : I
    //   39: aload_0
    //   40: getfield refusedStreamCount : I
    //   43: iconst_1
    //   44: if_icmple -> 196
    //   47: goto -> 57
    //   50: aload_1
    //   51: getstatic okhttp3/internal/http2/ErrorCode.CANCEL : Lokhttp3/internal/http2/ErrorCode;
    //   54: if_acmpeq -> 196
    //   57: aload_0
    //   58: aconst_null
    //   59: putfield route : Lokhttp3/Route;
    //   62: goto -> 191
    //   65: aload_0
    //   66: getfield connection : Lokhttp3/internal/connection/RealConnection;
    //   69: ifnull -> 196
    //   72: aload_0
    //   73: getfield connection : Lokhttp3/internal/connection/RealConnection;
    //   76: invokevirtual isMultiplexed : ()Z
    //   79: ifeq -> 89
    //   82: aload_1
    //   83: instanceof okhttp3/internal/http2/ConnectionShutdownException
    //   86: ifeq -> 196
    //   89: aload_0
    //   90: getfield connection : Lokhttp3/internal/connection/RealConnection;
    //   93: getfield successCount : I
    //   96: ifne -> 191
    //   99: aload_0
    //   100: getfield route : Lokhttp3/Route;
    //   103: ifnull -> 57
    //   106: aload_1
    //   107: ifnull -> 57
    //   110: aload_0
    //   111: getfield routeSelector : Lokhttp3/internal/connection/RouteSelector;
    //   114: aload_0
    //   115: getfield route : Lokhttp3/Route;
    //   118: aload_1
    //   119: invokevirtual connectFailed : (Lokhttp3/Route;Ljava/io/IOException;)V
    //   122: goto -> 57
    //   125: aload_0
    //   126: getfield connection : Lokhttp3/internal/connection/RealConnection;
    //   129: astore_1
    //   130: aload_0
    //   131: iload_2
    //   132: iconst_0
    //   133: iconst_1
    //   134: invokespecial deallocate : (ZZZ)Ljava/net/Socket;
    //   137: astore #4
    //   139: aload_0
    //   140: getfield connection : Lokhttp3/internal/connection/RealConnection;
    //   143: ifnonnull -> 201
    //   146: aload_0
    //   147: getfield reportedAcquired : Z
    //   150: ifne -> 156
    //   153: goto -> 201
    //   156: aload_3
    //   157: monitorexit
    //   158: aload #4
    //   160: invokestatic closeQuietly : (Ljava/net/Socket;)V
    //   163: aload_1
    //   164: ifnull -> 179
    //   167: aload_0
    //   168: getfield eventListener : Lokhttp3/EventListener;
    //   171: aload_0
    //   172: getfield call : Lokhttp3/Call;
    //   175: aload_1
    //   176: invokevirtual connectionReleased : (Lokhttp3/Call;Lokhttp3/Connection;)V
    //   179: return
    //   180: astore_1
    //   181: aload_3
    //   182: monitorexit
    //   183: goto -> 188
    //   186: aload_1
    //   187: athrow
    //   188: goto -> 186
    //   191: iconst_1
    //   192: istore_2
    //   193: goto -> 125
    //   196: iconst_0
    //   197: istore_2
    //   198: goto -> 125
    //   201: aconst_null
    //   202: astore_1
    //   203: goto -> 156
    // Exception table:
    //   from	to	target	type
    //   7	47	180	finally
    //   50	57	180	finally
    //   57	62	180	finally
    //   65	89	180	finally
    //   89	106	180	finally
    //   110	122	180	finally
    //   125	146	180	finally
    //   146	153	180	finally
    //   156	158	180	finally
    //   181	183	180	finally
  }
  
  public void streamFinished(boolean paramBoolean, HttpCodec paramHttpCodec, long paramLong, IOException paramIOException) {
    // Byte code:
    //   0: aload_0
    //   1: getfield eventListener : Lokhttp3/EventListener;
    //   4: aload_0
    //   5: getfield call : Lokhttp3/Call;
    //   8: lload_3
    //   9: invokevirtual responseBodyEnd : (Lokhttp3/Call;J)V
    //   12: aload_0
    //   13: getfield connectionPool : Lokhttp3/ConnectionPool;
    //   16: astore #6
    //   18: aload #6
    //   20: monitorenter
    //   21: aload_2
    //   22: ifnull -> 163
    //   25: aload_2
    //   26: aload_0
    //   27: getfield codec : Lokhttp3/internal/http/HttpCodec;
    //   30: if_acmpne -> 163
    //   33: iload_1
    //   34: ifne -> 52
    //   37: aload_0
    //   38: getfield connection : Lokhttp3/internal/connection/RealConnection;
    //   41: astore_2
    //   42: aload_2
    //   43: aload_2
    //   44: getfield successCount : I
    //   47: iconst_1
    //   48: iadd
    //   49: putfield successCount : I
    //   52: aload_0
    //   53: getfield connection : Lokhttp3/internal/connection/RealConnection;
    //   56: astore_2
    //   57: aload_0
    //   58: iload_1
    //   59: iconst_0
    //   60: iconst_1
    //   61: invokespecial deallocate : (ZZZ)Ljava/net/Socket;
    //   64: astore #7
    //   66: aload_0
    //   67: getfield connection : Lokhttp3/internal/connection/RealConnection;
    //   70: ifnull -> 75
    //   73: aconst_null
    //   74: astore_2
    //   75: aload_0
    //   76: getfield released : Z
    //   79: istore_1
    //   80: aload #6
    //   82: monitorexit
    //   83: aload #7
    //   85: invokestatic closeQuietly : (Ljava/net/Socket;)V
    //   88: aload_2
    //   89: ifnull -> 104
    //   92: aload_0
    //   93: getfield eventListener : Lokhttp3/EventListener;
    //   96: aload_0
    //   97: getfield call : Lokhttp3/Call;
    //   100: aload_2
    //   101: invokevirtual connectionReleased : (Lokhttp3/Call;Lokhttp3/Connection;)V
    //   104: aload #5
    //   106: ifnull -> 135
    //   109: getstatic okhttp3/internal/Internal.instance : Lokhttp3/internal/Internal;
    //   112: aload_0
    //   113: getfield call : Lokhttp3/Call;
    //   116: aload #5
    //   118: invokevirtual timeoutExit : (Lokhttp3/Call;Ljava/io/IOException;)Ljava/io/IOException;
    //   121: astore_2
    //   122: aload_0
    //   123: getfield eventListener : Lokhttp3/EventListener;
    //   126: aload_0
    //   127: getfield call : Lokhttp3/Call;
    //   130: aload_2
    //   131: invokevirtual callFailed : (Lokhttp3/Call;Ljava/io/IOException;)V
    //   134: return
    //   135: iload_1
    //   136: ifeq -> 162
    //   139: getstatic okhttp3/internal/Internal.instance : Lokhttp3/internal/Internal;
    //   142: aload_0
    //   143: getfield call : Lokhttp3/Call;
    //   146: aconst_null
    //   147: invokevirtual timeoutExit : (Lokhttp3/Call;Ljava/io/IOException;)Ljava/io/IOException;
    //   150: pop
    //   151: aload_0
    //   152: getfield eventListener : Lokhttp3/EventListener;
    //   155: aload_0
    //   156: getfield call : Lokhttp3/Call;
    //   159: invokevirtual callEnd : (Lokhttp3/Call;)V
    //   162: return
    //   163: new java/lang/StringBuilder
    //   166: dup
    //   167: invokespecial <init> : ()V
    //   170: astore #5
    //   172: aload #5
    //   174: ldc_w 'expected '
    //   177: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   180: pop
    //   181: aload #5
    //   183: aload_0
    //   184: getfield codec : Lokhttp3/internal/http/HttpCodec;
    //   187: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   190: pop
    //   191: aload #5
    //   193: ldc_w ' but was '
    //   196: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   199: pop
    //   200: aload #5
    //   202: aload_2
    //   203: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   206: pop
    //   207: new java/lang/IllegalStateException
    //   210: dup
    //   211: aload #5
    //   213: invokevirtual toString : ()Ljava/lang/String;
    //   216: invokespecial <init> : (Ljava/lang/String;)V
    //   219: athrow
    //   220: astore_2
    //   221: aload #6
    //   223: monitorexit
    //   224: aload_2
    //   225: athrow
    // Exception table:
    //   from	to	target	type
    //   25	33	220	finally
    //   37	52	220	finally
    //   52	66	220	finally
    //   66	73	220	finally
    //   75	83	220	finally
    //   163	220	220	finally
    //   221	224	220	finally
  }
  
  public String toString() {
    RealConnection realConnection = connection();
    return (realConnection != null) ? realConnection.toString() : this.address.toString();
  }
  
  public static final class StreamAllocationReference extends WeakReference<StreamAllocation> {
    public final Object callStackTrace;
    
    StreamAllocationReference(StreamAllocation param1StreamAllocation, Object param1Object) {
      super(param1StreamAllocation);
      this.callStackTrace = param1Object;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/okhttp3/internal/connection/StreamAllocation.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */