package okhttp3;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;

public final class Dispatcher {
  private ExecutorService executorService;
  
  private Runnable idleCallback;
  
  private int maxRequests = 64;
  
  private int maxRequestsPerHost = 5;
  
  private final Deque<RealCall.AsyncCall> readyAsyncCalls = new ArrayDeque<RealCall.AsyncCall>();
  
  private final Deque<RealCall.AsyncCall> runningAsyncCalls = new ArrayDeque<RealCall.AsyncCall>();
  
  private final Deque<RealCall> runningSyncCalls = new ArrayDeque<RealCall>();
  
  public Dispatcher() {}
  
  public Dispatcher(ExecutorService paramExecutorService) {
    this.executorService = paramExecutorService;
  }
  
  private <T> void finished(Deque<T> paramDeque, T paramT) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_1
    //   3: aload_2
    //   4: invokeinterface remove : (Ljava/lang/Object;)Z
    //   9: ifeq -> 37
    //   12: aload_0
    //   13: getfield idleCallback : Ljava/lang/Runnable;
    //   16: astore_1
    //   17: aload_0
    //   18: monitorexit
    //   19: aload_0
    //   20: invokespecial promoteAndExecute : ()Z
    //   23: ifne -> 36
    //   26: aload_1
    //   27: ifnull -> 36
    //   30: aload_1
    //   31: invokeinterface run : ()V
    //   36: return
    //   37: new java/lang/AssertionError
    //   40: dup
    //   41: ldc 'Call wasn't in-flight!'
    //   43: invokespecial <init> : (Ljava/lang/Object;)V
    //   46: athrow
    //   47: astore_1
    //   48: aload_0
    //   49: monitorexit
    //   50: aload_1
    //   51: athrow
    // Exception table:
    //   from	to	target	type
    //   2	19	47	finally
    //   37	47	47	finally
    //   48	50	47	finally
  }
  
  private boolean promoteAndExecute() {
    // Byte code:
    //   0: new java/util/ArrayList
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore #4
    //   9: aload_0
    //   10: monitorenter
    //   11: aload_0
    //   12: getfield readyAsyncCalls : Ljava/util/Deque;
    //   15: invokeinterface iterator : ()Ljava/util/Iterator;
    //   20: astore #5
    //   22: aload #5
    //   24: invokeinterface hasNext : ()Z
    //   29: ifeq -> 111
    //   32: aload #5
    //   34: invokeinterface next : ()Ljava/lang/Object;
    //   39: checkcast okhttp3/RealCall$AsyncCall
    //   42: astore #6
    //   44: aload_0
    //   45: getfield runningAsyncCalls : Ljava/util/Deque;
    //   48: invokeinterface size : ()I
    //   53: aload_0
    //   54: getfield maxRequests : I
    //   57: if_icmplt -> 63
    //   60: goto -> 111
    //   63: aload_0
    //   64: aload #6
    //   66: invokespecial runningCallsForHost : (Lokhttp3/RealCall$AsyncCall;)I
    //   69: aload_0
    //   70: getfield maxRequestsPerHost : I
    //   73: if_icmplt -> 79
    //   76: goto -> 22
    //   79: aload #5
    //   81: invokeinterface remove : ()V
    //   86: aload #4
    //   88: aload #6
    //   90: invokeinterface add : (Ljava/lang/Object;)Z
    //   95: pop
    //   96: aload_0
    //   97: getfield runningAsyncCalls : Ljava/util/Deque;
    //   100: aload #6
    //   102: invokeinterface add : (Ljava/lang/Object;)Z
    //   107: pop
    //   108: goto -> 22
    //   111: aload_0
    //   112: invokevirtual runningCallsCount : ()I
    //   115: istore_2
    //   116: iconst_0
    //   117: istore_1
    //   118: iload_2
    //   119: ifle -> 182
    //   122: iconst_1
    //   123: istore_3
    //   124: goto -> 127
    //   127: aload_0
    //   128: monitorexit
    //   129: aload #4
    //   131: invokeinterface size : ()I
    //   136: istore_2
    //   137: iload_1
    //   138: iload_2
    //   139: if_icmpge -> 167
    //   142: aload #4
    //   144: iload_1
    //   145: invokeinterface get : (I)Ljava/lang/Object;
    //   150: checkcast okhttp3/RealCall$AsyncCall
    //   153: aload_0
    //   154: invokevirtual executorService : ()Ljava/util/concurrent/ExecutorService;
    //   157: invokevirtual executeOn : (Ljava/util/concurrent/ExecutorService;)V
    //   160: iload_1
    //   161: iconst_1
    //   162: iadd
    //   163: istore_1
    //   164: goto -> 137
    //   167: iload_3
    //   168: ireturn
    //   169: astore #4
    //   171: aload_0
    //   172: monitorexit
    //   173: goto -> 179
    //   176: aload #4
    //   178: athrow
    //   179: goto -> 176
    //   182: iconst_0
    //   183: istore_3
    //   184: goto -> 127
    // Exception table:
    //   from	to	target	type
    //   11	22	169	finally
    //   22	60	169	finally
    //   63	76	169	finally
    //   79	108	169	finally
    //   111	116	169	finally
    //   127	129	169	finally
    //   171	173	169	finally
  }
  
  private int runningCallsForHost(RealCall.AsyncCall paramAsyncCall) {
    Iterator<RealCall.AsyncCall> iterator = this.runningAsyncCalls.iterator();
    int i = 0;
    while (iterator.hasNext()) {
      RealCall.AsyncCall asyncCall = iterator.next();
      if (!(asyncCall.get()).forWebSocket && asyncCall.host().equals(paramAsyncCall.host()))
        i++; 
    } 
    return i;
  }
  
  public void cancelAll() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield readyAsyncCalls : Ljava/util/Deque;
    //   6: invokeinterface iterator : ()Ljava/util/Iterator;
    //   11: astore_1
    //   12: aload_1
    //   13: invokeinterface hasNext : ()Z
    //   18: ifeq -> 39
    //   21: aload_1
    //   22: invokeinterface next : ()Ljava/lang/Object;
    //   27: checkcast okhttp3/RealCall$AsyncCall
    //   30: invokevirtual get : ()Lokhttp3/RealCall;
    //   33: invokevirtual cancel : ()V
    //   36: goto -> 12
    //   39: aload_0
    //   40: getfield runningAsyncCalls : Ljava/util/Deque;
    //   43: invokeinterface iterator : ()Ljava/util/Iterator;
    //   48: astore_1
    //   49: aload_1
    //   50: invokeinterface hasNext : ()Z
    //   55: ifeq -> 76
    //   58: aload_1
    //   59: invokeinterface next : ()Ljava/lang/Object;
    //   64: checkcast okhttp3/RealCall$AsyncCall
    //   67: invokevirtual get : ()Lokhttp3/RealCall;
    //   70: invokevirtual cancel : ()V
    //   73: goto -> 49
    //   76: aload_0
    //   77: getfield runningSyncCalls : Ljava/util/Deque;
    //   80: invokeinterface iterator : ()Ljava/util/Iterator;
    //   85: astore_1
    //   86: aload_1
    //   87: invokeinterface hasNext : ()Z
    //   92: ifeq -> 110
    //   95: aload_1
    //   96: invokeinterface next : ()Ljava/lang/Object;
    //   101: checkcast okhttp3/RealCall
    //   104: invokevirtual cancel : ()V
    //   107: goto -> 86
    //   110: aload_0
    //   111: monitorexit
    //   112: return
    //   113: astore_1
    //   114: aload_0
    //   115: monitorexit
    //   116: goto -> 121
    //   119: aload_1
    //   120: athrow
    //   121: goto -> 119
    // Exception table:
    //   from	to	target	type
    //   2	12	113	finally
    //   12	36	113	finally
    //   39	49	113	finally
    //   49	73	113	finally
    //   76	86	113	finally
    //   86	107	113	finally
  }
  
  void enqueue(RealCall.AsyncCall paramAsyncCall) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield readyAsyncCalls : Ljava/util/Deque;
    //   6: aload_1
    //   7: invokeinterface add : (Ljava/lang/Object;)Z
    //   12: pop
    //   13: aload_0
    //   14: monitorexit
    //   15: aload_0
    //   16: invokespecial promoteAndExecute : ()Z
    //   19: pop
    //   20: return
    //   21: astore_1
    //   22: aload_0
    //   23: monitorexit
    //   24: aload_1
    //   25: athrow
    // Exception table:
    //   from	to	target	type
    //   2	15	21	finally
    //   22	24	21	finally
  }
  
  void executed(RealCall paramRealCall) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield runningSyncCalls : Ljava/util/Deque;
    //   6: aload_1
    //   7: invokeinterface add : (Ljava/lang/Object;)Z
    //   12: pop
    //   13: aload_0
    //   14: monitorexit
    //   15: return
    //   16: astore_1
    //   17: aload_0
    //   18: monitorexit
    //   19: aload_1
    //   20: athrow
    // Exception table:
    //   from	to	target	type
    //   2	13	16	finally
  }
  
  public ExecutorService executorService() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield executorService : Ljava/util/concurrent/ExecutorService;
    //   6: ifnonnull -> 42
    //   9: aload_0
    //   10: new java/util/concurrent/ThreadPoolExecutor
    //   13: dup
    //   14: iconst_0
    //   15: ldc 2147483647
    //   17: ldc2_w 60
    //   20: getstatic java/util/concurrent/TimeUnit.SECONDS : Ljava/util/concurrent/TimeUnit;
    //   23: new java/util/concurrent/SynchronousQueue
    //   26: dup
    //   27: invokespecial <init> : ()V
    //   30: ldc 'OkHttp Dispatcher'
    //   32: iconst_0
    //   33: invokestatic threadFactory : (Ljava/lang/String;Z)Ljava/util/concurrent/ThreadFactory;
    //   36: invokespecial <init> : (IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V
    //   39: putfield executorService : Ljava/util/concurrent/ExecutorService;
    //   42: aload_0
    //   43: getfield executorService : Ljava/util/concurrent/ExecutorService;
    //   46: astore_1
    //   47: aload_0
    //   48: monitorexit
    //   49: aload_1
    //   50: areturn
    //   51: astore_1
    //   52: aload_0
    //   53: monitorexit
    //   54: aload_1
    //   55: athrow
    // Exception table:
    //   from	to	target	type
    //   2	42	51	finally
    //   42	47	51	finally
  }
  
  void finished(RealCall.AsyncCall paramAsyncCall) {
    finished(this.runningAsyncCalls, paramAsyncCall);
  }
  
  void finished(RealCall paramRealCall) {
    finished(this.runningSyncCalls, paramRealCall);
  }
  
  public int getMaxRequests() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield maxRequests : I
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
  
  public int getMaxRequestsPerHost() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield maxRequestsPerHost : I
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
  
  public List<Call> queuedCalls() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: new java/util/ArrayList
    //   5: dup
    //   6: invokespecial <init> : ()V
    //   9: astore_1
    //   10: aload_0
    //   11: getfield readyAsyncCalls : Ljava/util/Deque;
    //   14: invokeinterface iterator : ()Ljava/util/Iterator;
    //   19: astore_2
    //   20: aload_2
    //   21: invokeinterface hasNext : ()Z
    //   26: ifeq -> 51
    //   29: aload_1
    //   30: aload_2
    //   31: invokeinterface next : ()Ljava/lang/Object;
    //   36: checkcast okhttp3/RealCall$AsyncCall
    //   39: invokevirtual get : ()Lokhttp3/RealCall;
    //   42: invokeinterface add : (Ljava/lang/Object;)Z
    //   47: pop
    //   48: goto -> 20
    //   51: aload_1
    //   52: invokestatic unmodifiableList : (Ljava/util/List;)Ljava/util/List;
    //   55: astore_1
    //   56: aload_0
    //   57: monitorexit
    //   58: aload_1
    //   59: areturn
    //   60: astore_1
    //   61: aload_0
    //   62: monitorexit
    //   63: goto -> 68
    //   66: aload_1
    //   67: athrow
    //   68: goto -> 66
    // Exception table:
    //   from	to	target	type
    //   2	20	60	finally
    //   20	48	60	finally
    //   51	56	60	finally
  }
  
  public int queuedCallsCount() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield readyAsyncCalls : Ljava/util/Deque;
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
  
  public List<Call> runningCalls() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: new java/util/ArrayList
    //   5: dup
    //   6: invokespecial <init> : ()V
    //   9: astore_1
    //   10: aload_1
    //   11: aload_0
    //   12: getfield runningSyncCalls : Ljava/util/Deque;
    //   15: invokeinterface addAll : (Ljava/util/Collection;)Z
    //   20: pop
    //   21: aload_0
    //   22: getfield runningAsyncCalls : Ljava/util/Deque;
    //   25: invokeinterface iterator : ()Ljava/util/Iterator;
    //   30: astore_2
    //   31: aload_2
    //   32: invokeinterface hasNext : ()Z
    //   37: ifeq -> 62
    //   40: aload_1
    //   41: aload_2
    //   42: invokeinterface next : ()Ljava/lang/Object;
    //   47: checkcast okhttp3/RealCall$AsyncCall
    //   50: invokevirtual get : ()Lokhttp3/RealCall;
    //   53: invokeinterface add : (Ljava/lang/Object;)Z
    //   58: pop
    //   59: goto -> 31
    //   62: aload_1
    //   63: invokestatic unmodifiableList : (Ljava/util/List;)Ljava/util/List;
    //   66: astore_1
    //   67: aload_0
    //   68: monitorexit
    //   69: aload_1
    //   70: areturn
    //   71: astore_1
    //   72: aload_0
    //   73: monitorexit
    //   74: goto -> 79
    //   77: aload_1
    //   78: athrow
    //   79: goto -> 77
    // Exception table:
    //   from	to	target	type
    //   2	31	71	finally
    //   31	59	71	finally
    //   62	67	71	finally
  }
  
  public int runningCallsCount() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield runningAsyncCalls : Ljava/util/Deque;
    //   6: invokeinterface size : ()I
    //   11: istore_1
    //   12: aload_0
    //   13: getfield runningSyncCalls : Ljava/util/Deque;
    //   16: invokeinterface size : ()I
    //   21: istore_2
    //   22: aload_0
    //   23: monitorexit
    //   24: iload_1
    //   25: iload_2
    //   26: iadd
    //   27: ireturn
    //   28: astore_3
    //   29: aload_0
    //   30: monitorexit
    //   31: aload_3
    //   32: athrow
    // Exception table:
    //   from	to	target	type
    //   2	22	28	finally
  }
  
  public void setIdleCallback(Runnable paramRunnable) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_1
    //   4: putfield idleCallback : Ljava/lang/Runnable;
    //   7: aload_0
    //   8: monitorexit
    //   9: return
    //   10: astore_1
    //   11: aload_0
    //   12: monitorexit
    //   13: aload_1
    //   14: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	10	finally
  }
  
  public void setMaxRequests(int paramInt) {
    // Byte code:
    //   0: iload_1
    //   1: iconst_1
    //   2: if_icmplt -> 25
    //   5: aload_0
    //   6: monitorenter
    //   7: aload_0
    //   8: iload_1
    //   9: putfield maxRequests : I
    //   12: aload_0
    //   13: monitorexit
    //   14: aload_0
    //   15: invokespecial promoteAndExecute : ()Z
    //   18: pop
    //   19: return
    //   20: astore_2
    //   21: aload_0
    //   22: monitorexit
    //   23: aload_2
    //   24: athrow
    //   25: new java/lang/StringBuilder
    //   28: dup
    //   29: invokespecial <init> : ()V
    //   32: astore_2
    //   33: aload_2
    //   34: ldc 'max < 1: '
    //   36: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   39: pop
    //   40: aload_2
    //   41: iload_1
    //   42: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   45: pop
    //   46: new java/lang/IllegalArgumentException
    //   49: dup
    //   50: aload_2
    //   51: invokevirtual toString : ()Ljava/lang/String;
    //   54: invokespecial <init> : (Ljava/lang/String;)V
    //   57: athrow
    // Exception table:
    //   from	to	target	type
    //   7	14	20	finally
    //   21	23	20	finally
  }
  
  public void setMaxRequestsPerHost(int paramInt) {
    // Byte code:
    //   0: iload_1
    //   1: iconst_1
    //   2: if_icmplt -> 25
    //   5: aload_0
    //   6: monitorenter
    //   7: aload_0
    //   8: iload_1
    //   9: putfield maxRequestsPerHost : I
    //   12: aload_0
    //   13: monitorexit
    //   14: aload_0
    //   15: invokespecial promoteAndExecute : ()Z
    //   18: pop
    //   19: return
    //   20: astore_2
    //   21: aload_0
    //   22: monitorexit
    //   23: aload_2
    //   24: athrow
    //   25: new java/lang/StringBuilder
    //   28: dup
    //   29: invokespecial <init> : ()V
    //   32: astore_2
    //   33: aload_2
    //   34: ldc 'max < 1: '
    //   36: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   39: pop
    //   40: aload_2
    //   41: iload_1
    //   42: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   45: pop
    //   46: new java/lang/IllegalArgumentException
    //   49: dup
    //   50: aload_2
    //   51: invokevirtual toString : ()Ljava/lang/String;
    //   54: invokespecial <init> : (Ljava/lang/String;)V
    //   57: athrow
    // Exception table:
    //   from	to	target	type
    //   7	14	20	finally
    //   21	23	20	finally
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/okhttp3/Dispatcher.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */