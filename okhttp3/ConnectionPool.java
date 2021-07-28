package okhttp3;

import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.connection.RouteDatabase;
import okhttp3.internal.connection.StreamAllocation;
import okhttp3.internal.platform.Platform;

public final class ConnectionPool {
  private static final Executor executor = new ThreadPoolExecutor(0, 2147483647, 60L, TimeUnit.SECONDS, new SynchronousQueue<Runnable>(), Util.threadFactory("OkHttp ConnectionPool", true));
  
  private final Runnable cleanupRunnable = new Runnable() {
      public void run() {
        while (true) {
          long l = ConnectionPool.this.cleanup(System.nanoTime());
          if (l == -1L)
            return; 
          if (l > 0L) {
            long l1 = l / 1000000L;
            synchronized (ConnectionPool.this) {
              ConnectionPool.this.wait(l1, (int)(l - 1000000L * l1));
            } 
            /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=SYNTHETIC_LOCAL_VARIABLE_5} */
          } 
        } 
      }
    };
  
  boolean cleanupRunning;
  
  private final Deque<RealConnection> connections = new ArrayDeque<RealConnection>();
  
  private final long keepAliveDurationNs;
  
  private final int maxIdleConnections;
  
  final RouteDatabase routeDatabase = new RouteDatabase();
  
  public ConnectionPool() {
    this(5, 5L, TimeUnit.MINUTES);
  }
  
  public ConnectionPool(int paramInt, long paramLong, TimeUnit paramTimeUnit) {
    this.maxIdleConnections = paramInt;
    this.keepAliveDurationNs = paramTimeUnit.toNanos(paramLong);
    if (paramLong > 0L)
      return; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("keepAliveDuration <= 0: ");
    stringBuilder.append(paramLong);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  private int pruneAndGetAllocationCount(RealConnection paramRealConnection, long paramLong) {
    List<Reference> list = paramRealConnection.allocations;
    int i = 0;
    while (i < list.size()) {
      Reference reference = list.get(i);
      if (reference.get() != null) {
        i++;
        continue;
      } 
      StreamAllocation.StreamAllocationReference streamAllocationReference = (StreamAllocation.StreamAllocationReference)reference;
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("A connection to ");
      stringBuilder.append(paramRealConnection.route().address().url());
      stringBuilder.append(" was leaked. Did you forget to close a response body?");
      String str = stringBuilder.toString();
      Platform.get().logCloseableLeak(str, streamAllocationReference.callStackTrace);
      list.remove(i);
      paramRealConnection.noNewStreams = true;
      if (list.isEmpty()) {
        paramRealConnection.idleAtNanos = paramLong - this.keepAliveDurationNs;
        return 0;
      } 
    } 
    return list.size();
  }
  
  long cleanup(long paramLong) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield connections : Ljava/util/Deque;
    //   6: invokeinterface iterator : ()Ljava/util/Iterator;
    //   11: astore #12
    //   13: ldc2_w -9223372036854775808
    //   16: lstore #6
    //   18: aconst_null
    //   19: astore #10
    //   21: iconst_0
    //   22: istore_3
    //   23: iconst_0
    //   24: istore #4
    //   26: aload #12
    //   28: invokeinterface hasNext : ()Z
    //   33: ifeq -> 106
    //   36: aload #12
    //   38: invokeinterface next : ()Ljava/lang/Object;
    //   43: checkcast okhttp3/internal/connection/RealConnection
    //   46: astore #11
    //   48: aload_0
    //   49: aload #11
    //   51: lload_1
    //   52: invokespecial pruneAndGetAllocationCount : (Lokhttp3/internal/connection/RealConnection;J)I
    //   55: ifle -> 67
    //   58: iload #4
    //   60: iconst_1
    //   61: iadd
    //   62: istore #4
    //   64: goto -> 26
    //   67: iload_3
    //   68: iconst_1
    //   69: iadd
    //   70: istore #5
    //   72: lload_1
    //   73: aload #11
    //   75: getfield idleAtNanos : J
    //   78: lsub
    //   79: lstore #8
    //   81: iload #5
    //   83: istore_3
    //   84: lload #8
    //   86: lload #6
    //   88: lcmp
    //   89: ifle -> 26
    //   92: aload #11
    //   94: astore #10
    //   96: lload #8
    //   98: lstore #6
    //   100: iload #5
    //   102: istore_3
    //   103: goto -> 26
    //   106: lload #6
    //   108: aload_0
    //   109: getfield keepAliveDurationNs : J
    //   112: lcmp
    //   113: ifge -> 168
    //   116: iload_3
    //   117: aload_0
    //   118: getfield maxIdleConnections : I
    //   121: if_icmple -> 127
    //   124: goto -> 168
    //   127: iload_3
    //   128: ifle -> 143
    //   131: aload_0
    //   132: getfield keepAliveDurationNs : J
    //   135: lstore_1
    //   136: aload_0
    //   137: monitorexit
    //   138: lload_1
    //   139: lload #6
    //   141: lsub
    //   142: lreturn
    //   143: iload #4
    //   145: ifle -> 157
    //   148: aload_0
    //   149: getfield keepAliveDurationNs : J
    //   152: lstore_1
    //   153: aload_0
    //   154: monitorexit
    //   155: lload_1
    //   156: lreturn
    //   157: aload_0
    //   158: iconst_0
    //   159: putfield cleanupRunning : Z
    //   162: aload_0
    //   163: monitorexit
    //   164: ldc2_w -1
    //   167: lreturn
    //   168: aload_0
    //   169: getfield connections : Ljava/util/Deque;
    //   172: aload #10
    //   174: invokeinterface remove : (Ljava/lang/Object;)Z
    //   179: pop
    //   180: aload_0
    //   181: monitorexit
    //   182: aload #10
    //   184: invokevirtual socket : ()Ljava/net/Socket;
    //   187: invokestatic closeQuietly : (Ljava/net/Socket;)V
    //   190: lconst_0
    //   191: lreturn
    //   192: astore #10
    //   194: aload_0
    //   195: monitorexit
    //   196: goto -> 202
    //   199: aload #10
    //   201: athrow
    //   202: goto -> 199
    // Exception table:
    //   from	to	target	type
    //   2	13	192	finally
    //   26	58	192	finally
    //   72	81	192	finally
    //   106	124	192	finally
    //   131	138	192	finally
    //   148	155	192	finally
    //   157	164	192	finally
    //   168	182	192	finally
    //   194	196	192	finally
  }
  
  boolean connectionBecameIdle(RealConnection paramRealConnection) {
    if (paramRealConnection.noNewStreams || this.maxIdleConnections == 0) {
      this.connections.remove(paramRealConnection);
      return true;
    } 
    notifyAll();
    return false;
  }
  
  public int connectionCount() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield connections : Ljava/util/Deque;
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
  
  Socket deduplicate(Address paramAddress, StreamAllocation paramStreamAllocation) {
    for (RealConnection realConnection : this.connections) {
      if (realConnection.isEligible(paramAddress, null) && realConnection.isMultiplexed() && realConnection != paramStreamAllocation.connection())
        return paramStreamAllocation.releaseAndAcquire(realConnection); 
    } 
    return null;
  }
  
  public void evictAll() {
    // Byte code:
    //   0: new java/util/ArrayList
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_1
    //   8: aload_0
    //   9: monitorenter
    //   10: aload_0
    //   11: getfield connections : Ljava/util/Deque;
    //   14: invokeinterface iterator : ()Ljava/util/Iterator;
    //   19: astore_2
    //   20: aload_2
    //   21: invokeinterface hasNext : ()Z
    //   26: ifeq -> 73
    //   29: aload_2
    //   30: invokeinterface next : ()Ljava/lang/Object;
    //   35: checkcast okhttp3/internal/connection/RealConnection
    //   38: astore_3
    //   39: aload_3
    //   40: getfield allocations : Ljava/util/List;
    //   43: invokeinterface isEmpty : ()Z
    //   48: ifeq -> 20
    //   51: aload_3
    //   52: iconst_1
    //   53: putfield noNewStreams : Z
    //   56: aload_1
    //   57: aload_3
    //   58: invokeinterface add : (Ljava/lang/Object;)Z
    //   63: pop
    //   64: aload_2
    //   65: invokeinterface remove : ()V
    //   70: goto -> 20
    //   73: aload_0
    //   74: monitorexit
    //   75: aload_1
    //   76: invokeinterface iterator : ()Ljava/util/Iterator;
    //   81: astore_1
    //   82: aload_1
    //   83: invokeinterface hasNext : ()Z
    //   88: ifeq -> 109
    //   91: aload_1
    //   92: invokeinterface next : ()Ljava/lang/Object;
    //   97: checkcast okhttp3/internal/connection/RealConnection
    //   100: invokevirtual socket : ()Ljava/net/Socket;
    //   103: invokestatic closeQuietly : (Ljava/net/Socket;)V
    //   106: goto -> 82
    //   109: return
    //   110: astore_1
    //   111: aload_0
    //   112: monitorexit
    //   113: goto -> 118
    //   116: aload_1
    //   117: athrow
    //   118: goto -> 116
    // Exception table:
    //   from	to	target	type
    //   10	20	110	finally
    //   20	70	110	finally
    //   73	75	110	finally
    //   111	113	110	finally
  }
  
  RealConnection get(Address paramAddress, StreamAllocation paramStreamAllocation, Route paramRoute) {
    for (RealConnection realConnection : this.connections) {
      if (realConnection.isEligible(paramAddress, paramRoute)) {
        paramStreamAllocation.acquire(realConnection, true);
        return realConnection;
      } 
    } 
    return null;
  }
  
  public int idleConnectionCount() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: iconst_0
    //   3: istore_1
    //   4: aload_0
    //   5: getfield connections : Ljava/util/Deque;
    //   8: invokeinterface iterator : ()Ljava/util/Iterator;
    //   13: astore_3
    //   14: aload_3
    //   15: invokeinterface hasNext : ()Z
    //   20: ifeq -> 52
    //   23: aload_3
    //   24: invokeinterface next : ()Ljava/lang/Object;
    //   29: checkcast okhttp3/internal/connection/RealConnection
    //   32: getfield allocations : Ljava/util/List;
    //   35: invokeinterface isEmpty : ()Z
    //   40: istore_2
    //   41: iload_2
    //   42: ifeq -> 14
    //   45: iload_1
    //   46: iconst_1
    //   47: iadd
    //   48: istore_1
    //   49: goto -> 14
    //   52: aload_0
    //   53: monitorexit
    //   54: iload_1
    //   55: ireturn
    //   56: astore_3
    //   57: aload_0
    //   58: monitorexit
    //   59: goto -> 64
    //   62: aload_3
    //   63: athrow
    //   64: goto -> 62
    // Exception table:
    //   from	to	target	type
    //   4	14	56	finally
    //   14	41	56	finally
  }
  
  void put(RealConnection paramRealConnection) {
    if (!this.cleanupRunning) {
      this.cleanupRunning = true;
      executor.execute(this.cleanupRunnable);
    } 
    this.connections.add(paramRealConnection);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/okhttp3/ConnectionPool.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */