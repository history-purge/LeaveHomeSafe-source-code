package e.e.o.c0;

import android.os.Handler;
import android.util.SparseArray;
import com.facebook.react.bridge.ReactContext;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;

public class b {
  private static final WeakHashMap<ReactContext, b> h = new WeakHashMap<ReactContext, b>();
  
  private final WeakReference<ReactContext> a;
  
  private final Set<c> b = new CopyOnWriteArraySet<c>();
  
  private final AtomicInteger c = new AtomicInteger(0);
  
  private final Handler d = new Handler();
  
  private final Set<Integer> e = new CopyOnWriteArraySet<Integer>();
  
  private final Map<Integer, a> f = new ConcurrentHashMap<Integer, a>();
  
  private final SparseArray<Runnable> g = new SparseArray();
  
  private b(ReactContext paramReactContext) {
    this.a = new WeakReference<ReactContext>(paramReactContext);
  }
  
  public static b a(ReactContext paramReactContext) {
    b b2 = h.get(paramReactContext);
    b b1 = b2;
    if (b2 == null) {
      b1 = new b(paramReactContext);
      h.put(paramReactContext, b1);
    } 
    return b1;
  }
  
  private void a(int paramInt, long paramLong) {
    b b1 = new b(this, paramInt);
    this.g.append(paramInt, b1);
    this.d.postDelayed(b1, paramLong);
  }
  
  private void a(a parama, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: invokestatic assertOnUiThread : ()V
    //   5: aload_0
    //   6: getfield a : Ljava/lang/ref/WeakReference;
    //   9: invokevirtual get : ()Ljava/lang/Object;
    //   12: astore_3
    //   13: aload_3
    //   14: ldc 'Tried to start a task on a react context that has already been destroyed'
    //   16: invokestatic a : (Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    //   19: pop
    //   20: aload_3
    //   21: checkcast com/facebook/react/bridge/ReactContext
    //   24: astore_3
    //   25: aload_3
    //   26: invokevirtual getLifecycleState : ()Lcom/facebook/react/common/LifecycleState;
    //   29: getstatic com/facebook/react/common/LifecycleState.e : Lcom/facebook/react/common/LifecycleState;
    //   32: if_acmpne -> 88
    //   35: aload_1
    //   36: invokevirtual e : ()Z
    //   39: ifeq -> 45
    //   42: goto -> 88
    //   45: new java/lang/StringBuilder
    //   48: dup
    //   49: invokespecial <init> : ()V
    //   52: astore_3
    //   53: aload_3
    //   54: ldc 'Tried to start task '
    //   56: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   59: pop
    //   60: aload_3
    //   61: aload_1
    //   62: invokevirtual c : ()Ljava/lang/String;
    //   65: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   68: pop
    //   69: aload_3
    //   70: ldc ' while in foreground, but this is not allowed.'
    //   72: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   75: pop
    //   76: new java/lang/IllegalStateException
    //   79: dup
    //   80: aload_3
    //   81: invokevirtual toString : ()Ljava/lang/String;
    //   84: invokespecial <init> : (Ljava/lang/String;)V
    //   87: athrow
    //   88: aload_0
    //   89: getfield e : Ljava/util/Set;
    //   92: iload_2
    //   93: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   96: invokeinterface add : (Ljava/lang/Object;)Z
    //   101: pop
    //   102: aload_0
    //   103: getfield f : Ljava/util/Map;
    //   106: iload_2
    //   107: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   110: new e/e/o/c0/a
    //   113: dup
    //   114: aload_1
    //   115: invokespecial <init> : (Le/e/o/c0/a;)V
    //   118: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   123: pop
    //   124: aload_3
    //   125: invokevirtual hasActiveCatalystInstance : ()Z
    //   128: ifeq -> 157
    //   131: aload_3
    //   132: ldc com/facebook/react/modules/appregistry/AppRegistry
    //   134: invokevirtual getJSModule : (Ljava/lang/Class;)Lcom/facebook/react/bridge/JavaScriptModule;
    //   137: checkcast com/facebook/react/modules/appregistry/AppRegistry
    //   140: iload_2
    //   141: aload_1
    //   142: invokevirtual c : ()Ljava/lang/String;
    //   145: aload_1
    //   146: invokevirtual a : ()Lcom/facebook/react/bridge/WritableMap;
    //   149: invokeinterface startHeadlessTask : (ILjava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V
    //   154: goto -> 171
    //   157: ldc 'HeadlessJsTaskContext'
    //   159: new java/lang/RuntimeException
    //   162: dup
    //   163: ldc 'Cannot start headless task, CatalystInstance not available'
    //   165: invokespecial <init> : (Ljava/lang/String;)V
    //   168: invokestatic logSoftException : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   171: aload_1
    //   172: invokevirtual d : ()J
    //   175: lconst_0
    //   176: lcmp
    //   177: ifle -> 189
    //   180: aload_0
    //   181: iload_2
    //   182: aload_1
    //   183: invokevirtual d : ()J
    //   186: invokespecial a : (IJ)V
    //   189: aload_0
    //   190: getfield b : Ljava/util/Set;
    //   193: invokeinterface iterator : ()Ljava/util/Iterator;
    //   198: astore_1
    //   199: aload_1
    //   200: invokeinterface hasNext : ()Z
    //   205: ifeq -> 226
    //   208: aload_1
    //   209: invokeinterface next : ()Ljava/lang/Object;
    //   214: checkcast e/e/o/c0/c
    //   217: iload_2
    //   218: invokeinterface onHeadlessJsTaskStart : (I)V
    //   223: goto -> 199
    //   226: aload_0
    //   227: monitorexit
    //   228: return
    //   229: astore_1
    //   230: aload_0
    //   231: monitorexit
    //   232: goto -> 237
    //   235: aload_1
    //   236: athrow
    //   237: goto -> 235
    // Exception table:
    //   from	to	target	type
    //   2	42	229	finally
    //   45	88	229	finally
    //   88	154	229	finally
    //   157	171	229	finally
    //   171	189	229	finally
    //   189	199	229	finally
    //   199	223	229	finally
  }
  
  private void d(int paramInt) {
    Runnable runnable = (Runnable)this.g.get(paramInt);
    if (runnable != null) {
      this.d.removeCallbacks(runnable);
      this.g.remove(paramInt);
    } 
  }
  
  public int a(a parama) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield c : Ljava/util/concurrent/atomic/AtomicInteger;
    //   6: invokevirtual incrementAndGet : ()I
    //   9: istore_2
    //   10: aload_0
    //   11: aload_1
    //   12: iload_2
    //   13: invokespecial a : (Le/e/o/c0/a;I)V
    //   16: aload_0
    //   17: monitorexit
    //   18: iload_2
    //   19: ireturn
    //   20: astore_1
    //   21: aload_0
    //   22: monitorexit
    //   23: aload_1
    //   24: athrow
    // Exception table:
    //   from	to	target	type
    //   2	16	20	finally
  }
  
  public void a(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield e : Ljava/util/Set;
    //   6: iload_1
    //   7: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   10: invokeinterface remove : (Ljava/lang/Object;)Z
    //   15: istore_2
    //   16: new java/lang/StringBuilder
    //   19: dup
    //   20: invokespecial <init> : ()V
    //   23: astore_3
    //   24: aload_3
    //   25: ldc 'Tried to finish non-existent task with id '
    //   27: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   30: pop
    //   31: aload_3
    //   32: iload_1
    //   33: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   36: pop
    //   37: aload_3
    //   38: ldc '.'
    //   40: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   43: pop
    //   44: iload_2
    //   45: aload_3
    //   46: invokevirtual toString : ()Ljava/lang/String;
    //   49: invokestatic a : (ZLjava/lang/String;)V
    //   52: aload_0
    //   53: getfield f : Ljava/util/Map;
    //   56: iload_1
    //   57: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   60: invokeinterface remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   65: ifnull -> 135
    //   68: iconst_1
    //   69: istore_2
    //   70: goto -> 73
    //   73: new java/lang/StringBuilder
    //   76: dup
    //   77: invokespecial <init> : ()V
    //   80: astore_3
    //   81: aload_3
    //   82: ldc_w 'Tried to remove non-existent task config with id '
    //   85: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   88: pop
    //   89: aload_3
    //   90: iload_1
    //   91: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   94: pop
    //   95: aload_3
    //   96: ldc '.'
    //   98: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   101: pop
    //   102: iload_2
    //   103: aload_3
    //   104: invokevirtual toString : ()Ljava/lang/String;
    //   107: invokestatic a : (ZLjava/lang/String;)V
    //   110: aload_0
    //   111: iload_1
    //   112: invokespecial d : (I)V
    //   115: new e/e/o/c0/b$a
    //   118: dup
    //   119: aload_0
    //   120: iload_1
    //   121: invokespecial <init> : (Le/e/o/c0/b;I)V
    //   124: invokestatic runOnUiThread : (Ljava/lang/Runnable;)V
    //   127: aload_0
    //   128: monitorexit
    //   129: return
    //   130: astore_3
    //   131: aload_0
    //   132: monitorexit
    //   133: aload_3
    //   134: athrow
    //   135: iconst_0
    //   136: istore_2
    //   137: goto -> 73
    // Exception table:
    //   from	to	target	type
    //   2	68	130	finally
    //   73	127	130	finally
  }
  
  public void a(c paramc) {
    this.b.add(paramc);
  }
  
  public boolean a() {
    return (this.e.size() > 0);
  }
  
  public void b(c paramc) {
    this.b.remove(paramc);
  }
  
  public boolean b(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield e : Ljava/util/Set;
    //   6: iload_1
    //   7: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   10: invokeinterface contains : (Ljava/lang/Object;)Z
    //   15: istore_2
    //   16: aload_0
    //   17: monitorexit
    //   18: iload_2
    //   19: ireturn
    //   20: astore_3
    //   21: aload_0
    //   22: monitorexit
    //   23: aload_3
    //   24: athrow
    // Exception table:
    //   from	to	target	type
    //   2	16	20	finally
  }
  
  public boolean c(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield f : Ljava/util/Map;
    //   6: iload_1
    //   7: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   10: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   15: checkcast e/e/o/c0/a
    //   18: astore_3
    //   19: aload_3
    //   20: ifnull -> 132
    //   23: iconst_1
    //   24: istore_2
    //   25: goto -> 28
    //   28: new java/lang/StringBuilder
    //   31: dup
    //   32: invokespecial <init> : ()V
    //   35: astore #4
    //   37: aload #4
    //   39: ldc_w 'Tried to retrieve non-existent task config with id '
    //   42: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   45: pop
    //   46: aload #4
    //   48: iload_1
    //   49: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   52: pop
    //   53: aload #4
    //   55: ldc '.'
    //   57: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   60: pop
    //   61: iload_2
    //   62: aload #4
    //   64: invokevirtual toString : ()Ljava/lang/String;
    //   67: invokestatic a : (ZLjava/lang/String;)V
    //   70: aload_3
    //   71: invokevirtual b : ()Le/e/o/c0/d;
    //   74: astore #4
    //   76: aload #4
    //   78: invokeinterface b : ()Z
    //   83: istore_2
    //   84: iload_2
    //   85: ifne -> 92
    //   88: aload_0
    //   89: monitorexit
    //   90: iconst_0
    //   91: ireturn
    //   92: aload_0
    //   93: iload_1
    //   94: invokespecial d : (I)V
    //   97: aload_3
    //   98: invokevirtual c : ()Ljava/lang/String;
    //   101: pop
    //   102: aload_3
    //   103: invokevirtual a : ()Lcom/facebook/react/bridge/WritableMap;
    //   106: pop
    //   107: aload_3
    //   108: invokevirtual d : ()J
    //   111: pop2
    //   112: aload_3
    //   113: invokevirtual e : ()Z
    //   116: pop
    //   117: aload #4
    //   119: invokeinterface a : ()Le/e/o/c0/d;
    //   124: pop
    //   125: aconst_null
    //   126: athrow
    //   127: astore_3
    //   128: aload_0
    //   129: monitorexit
    //   130: aload_3
    //   131: athrow
    //   132: iconst_0
    //   133: istore_2
    //   134: goto -> 28
    // Exception table:
    //   from	to	target	type
    //   2	19	127	finally
    //   28	84	127	finally
    //   92	125	127	finally
  }
  
  class a implements Runnable {
    a(b this$0, int param1Int) {}
    
    public void run() {
      Iterator<c> iterator = b.a(this.d).iterator();
      while (iterator.hasNext())
        ((c)iterator.next()).onHeadlessJsTaskFinish(this.c); 
    }
  }
  
  class b implements Runnable {
    b(b this$0, int param1Int) {}
    
    public void run() {
      this.d.a(this.c);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/o/c0/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */