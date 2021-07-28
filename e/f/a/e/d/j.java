package e.f.a.e.d;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import e.f.a.e.i.e.e;
import java.util.ArrayDeque;
import java.util.Queue;

final class j implements ServiceConnection {
  int a = 0;
  
  final Messenger b = new Messenger((Handler)new e(Looper.getMainLooper(), new m(this)));
  
  s c;
  
  final Queue<u<?>> d = new ArrayDeque<u<?>>();
  
  final SparseArray<u<?>> e = new SparseArray();
  
  private j(i parami) {}
  
  final void a() {
    i.b(this.f).execute(new n(this));
  }
  
  final void a(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield e : Landroid/util/SparseArray;
    //   6: iload_1
    //   7: invokevirtual get : (I)Ljava/lang/Object;
    //   10: checkcast e/f/a/e/d/u
    //   13: astore_2
    //   14: aload_2
    //   15: ifnull -> 77
    //   18: new java/lang/StringBuilder
    //   21: dup
    //   22: bipush #31
    //   24: invokespecial <init> : (I)V
    //   27: astore_3
    //   28: aload_3
    //   29: ldc 'Timing out request: '
    //   31: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   34: pop
    //   35: aload_3
    //   36: iload_1
    //   37: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   40: pop
    //   41: ldc 'MessengerIpcClient'
    //   43: aload_3
    //   44: invokevirtual toString : ()Ljava/lang/String;
    //   47: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   50: pop
    //   51: aload_0
    //   52: getfield e : Landroid/util/SparseArray;
    //   55: iload_1
    //   56: invokevirtual remove : (I)V
    //   59: aload_2
    //   60: new e/f/a/e/d/t
    //   63: dup
    //   64: iconst_3
    //   65: ldc 'Timed out waiting for response'
    //   67: invokespecial <init> : (ILjava/lang/String;)V
    //   70: invokevirtual a : (Le/f/a/e/d/t;)V
    //   73: aload_0
    //   74: invokevirtual b : ()V
    //   77: aload_0
    //   78: monitorexit
    //   79: return
    //   80: astore_2
    //   81: aload_0
    //   82: monitorexit
    //   83: aload_2
    //   84: athrow
    // Exception table:
    //   from	to	target	type
    //   2	14	80	finally
    //   18	77	80	finally
  }
  
  final void a(int paramInt, String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc 'MessengerIpcClient'
    //   4: iconst_3
    //   5: invokestatic isLoggable : (Ljava/lang/String;I)Z
    //   8: ifeq -> 56
    //   11: aload_2
    //   12: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   15: astore #4
    //   17: aload #4
    //   19: invokevirtual length : ()I
    //   22: ifeq -> 37
    //   25: ldc 'Disconnected: '
    //   27: aload #4
    //   29: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   32: astore #4
    //   34: goto -> 48
    //   37: new java/lang/String
    //   40: dup
    //   41: ldc 'Disconnected: '
    //   43: invokespecial <init> : (Ljava/lang/String;)V
    //   46: astore #4
    //   48: ldc 'MessengerIpcClient'
    //   50: aload #4
    //   52: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
    //   55: pop
    //   56: aload_0
    //   57: getfield a : I
    //   60: istore_3
    //   61: iload_3
    //   62: ifeq -> 274
    //   65: iload_3
    //   66: iconst_1
    //   67: if_icmpeq -> 136
    //   70: iload_3
    //   71: iconst_2
    //   72: if_icmpeq -> 136
    //   75: iload_3
    //   76: iconst_3
    //   77: if_icmpeq -> 128
    //   80: iload_3
    //   81: iconst_4
    //   82: if_icmpne -> 88
    //   85: aload_0
    //   86: monitorexit
    //   87: return
    //   88: aload_0
    //   89: getfield a : I
    //   92: istore_1
    //   93: new java/lang/StringBuilder
    //   96: dup
    //   97: bipush #26
    //   99: invokespecial <init> : (I)V
    //   102: astore_2
    //   103: aload_2
    //   104: ldc 'Unknown state: '
    //   106: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   109: pop
    //   110: aload_2
    //   111: iload_1
    //   112: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   115: pop
    //   116: new java/lang/IllegalStateException
    //   119: dup
    //   120: aload_2
    //   121: invokevirtual toString : ()Ljava/lang/String;
    //   124: invokespecial <init> : (Ljava/lang/String;)V
    //   127: athrow
    //   128: aload_0
    //   129: iconst_4
    //   130: putfield a : I
    //   133: aload_0
    //   134: monitorexit
    //   135: return
    //   136: ldc 'MessengerIpcClient'
    //   138: iconst_2
    //   139: invokestatic isLoggable : (Ljava/lang/String;I)Z
    //   142: ifeq -> 153
    //   145: ldc 'MessengerIpcClient'
    //   147: ldc 'Unbinding service'
    //   149: invokestatic v : (Ljava/lang/String;Ljava/lang/String;)I
    //   152: pop
    //   153: aload_0
    //   154: iconst_4
    //   155: putfield a : I
    //   158: invokestatic a : ()Le/f/a/e/e/m/a;
    //   161: aload_0
    //   162: getfield f : Le/f/a/e/d/i;
    //   165: invokestatic a : (Le/f/a/e/d/i;)Landroid/content/Context;
    //   168: aload_0
    //   169: invokevirtual a : (Landroid/content/Context;Landroid/content/ServiceConnection;)V
    //   172: new e/f/a/e/d/t
    //   175: dup
    //   176: iload_1
    //   177: aload_2
    //   178: invokespecial <init> : (ILjava/lang/String;)V
    //   181: astore_2
    //   182: aload_0
    //   183: getfield d : Ljava/util/Queue;
    //   186: invokeinterface iterator : ()Ljava/util/Iterator;
    //   191: astore #4
    //   193: aload #4
    //   195: invokeinterface hasNext : ()Z
    //   200: ifeq -> 220
    //   203: aload #4
    //   205: invokeinterface next : ()Ljava/lang/Object;
    //   210: checkcast e/f/a/e/d/u
    //   213: aload_2
    //   214: invokevirtual a : (Le/f/a/e/d/t;)V
    //   217: goto -> 193
    //   220: aload_0
    //   221: getfield d : Ljava/util/Queue;
    //   224: invokeinterface clear : ()V
    //   229: iconst_0
    //   230: istore_1
    //   231: iload_1
    //   232: aload_0
    //   233: getfield e : Landroid/util/SparseArray;
    //   236: invokevirtual size : ()I
    //   239: if_icmpge -> 264
    //   242: aload_0
    //   243: getfield e : Landroid/util/SparseArray;
    //   246: iload_1
    //   247: invokevirtual valueAt : (I)Ljava/lang/Object;
    //   250: checkcast e/f/a/e/d/u
    //   253: aload_2
    //   254: invokevirtual a : (Le/f/a/e/d/t;)V
    //   257: iload_1
    //   258: iconst_1
    //   259: iadd
    //   260: istore_1
    //   261: goto -> 231
    //   264: aload_0
    //   265: getfield e : Landroid/util/SparseArray;
    //   268: invokevirtual clear : ()V
    //   271: aload_0
    //   272: monitorexit
    //   273: return
    //   274: new java/lang/IllegalStateException
    //   277: dup
    //   278: invokespecial <init> : ()V
    //   281: athrow
    //   282: astore_2
    //   283: aload_0
    //   284: monitorexit
    //   285: goto -> 290
    //   288: aload_2
    //   289: athrow
    //   290: goto -> 288
    // Exception table:
    //   from	to	target	type
    //   2	34	282	finally
    //   37	48	282	finally
    //   48	56	282	finally
    //   56	61	282	finally
    //   88	128	282	finally
    //   128	133	282	finally
    //   136	153	282	finally
    //   153	193	282	finally
    //   193	217	282	finally
    //   220	229	282	finally
    //   231	257	282	finally
    //   264	271	282	finally
    //   274	282	282	finally
  }
  
  final boolean a(Message paramMessage) {
    // Byte code:
    //   0: aload_1
    //   1: getfield arg1 : I
    //   4: istore_2
    //   5: ldc 'MessengerIpcClient'
    //   7: iconst_3
    //   8: invokestatic isLoggable : (Ljava/lang/String;I)Z
    //   11: ifeq -> 47
    //   14: new java/lang/StringBuilder
    //   17: dup
    //   18: bipush #41
    //   20: invokespecial <init> : (I)V
    //   23: astore_3
    //   24: aload_3
    //   25: ldc 'Received response to request: '
    //   27: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   30: pop
    //   31: aload_3
    //   32: iload_2
    //   33: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   36: pop
    //   37: ldc 'MessengerIpcClient'
    //   39: aload_3
    //   40: invokevirtual toString : ()Ljava/lang/String;
    //   43: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
    //   46: pop
    //   47: aload_0
    //   48: monitorenter
    //   49: aload_0
    //   50: getfield e : Landroid/util/SparseArray;
    //   53: iload_2
    //   54: invokevirtual get : (I)Ljava/lang/Object;
    //   57: checkcast e/f/a/e/d/u
    //   60: astore_3
    //   61: aload_3
    //   62: ifnonnull -> 102
    //   65: new java/lang/StringBuilder
    //   68: dup
    //   69: bipush #50
    //   71: invokespecial <init> : (I)V
    //   74: astore_1
    //   75: aload_1
    //   76: ldc 'Received response for unknown request: '
    //   78: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   81: pop
    //   82: aload_1
    //   83: iload_2
    //   84: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   87: pop
    //   88: ldc 'MessengerIpcClient'
    //   90: aload_1
    //   91: invokevirtual toString : ()Ljava/lang/String;
    //   94: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   97: pop
    //   98: aload_0
    //   99: monitorexit
    //   100: iconst_1
    //   101: ireturn
    //   102: aload_0
    //   103: getfield e : Landroid/util/SparseArray;
    //   106: iload_2
    //   107: invokevirtual remove : (I)V
    //   110: aload_0
    //   111: invokevirtual b : ()V
    //   114: aload_0
    //   115: monitorexit
    //   116: aload_1
    //   117: invokevirtual getData : ()Landroid/os/Bundle;
    //   120: astore_1
    //   121: aload_1
    //   122: ldc 'unsupported'
    //   124: iconst_0
    //   125: invokevirtual getBoolean : (Ljava/lang/String;Z)Z
    //   128: ifeq -> 147
    //   131: aload_3
    //   132: new e/f/a/e/d/t
    //   135: dup
    //   136: iconst_4
    //   137: ldc 'Not supported by GmsCore'
    //   139: invokespecial <init> : (ILjava/lang/String;)V
    //   142: invokevirtual a : (Le/f/a/e/d/t;)V
    //   145: iconst_1
    //   146: ireturn
    //   147: aload_3
    //   148: aload_1
    //   149: invokevirtual a : (Landroid/os/Bundle;)V
    //   152: iconst_1
    //   153: ireturn
    //   154: astore_1
    //   155: aload_0
    //   156: monitorexit
    //   157: aload_1
    //   158: athrow
    // Exception table:
    //   from	to	target	type
    //   49	61	154	finally
    //   65	100	154	finally
    //   102	116	154	finally
    //   155	157	154	finally
  }
  
  final boolean a(u<?> paramu) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield a : I
    //   6: istore_2
    //   7: iload_2
    //   8: ifeq -> 112
    //   11: iload_2
    //   12: iconst_1
    //   13: if_icmpeq -> 97
    //   16: iload_2
    //   17: iconst_2
    //   18: if_icmpeq -> 78
    //   21: iload_2
    //   22: iconst_3
    //   23: if_icmpeq -> 74
    //   26: iload_2
    //   27: iconst_4
    //   28: if_icmpne -> 34
    //   31: goto -> 74
    //   34: aload_0
    //   35: getfield a : I
    //   38: istore_2
    //   39: new java/lang/StringBuilder
    //   42: dup
    //   43: bipush #26
    //   45: invokespecial <init> : (I)V
    //   48: astore_1
    //   49: aload_1
    //   50: ldc 'Unknown state: '
    //   52: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   55: pop
    //   56: aload_1
    //   57: iload_2
    //   58: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   61: pop
    //   62: new java/lang/IllegalStateException
    //   65: dup
    //   66: aload_1
    //   67: invokevirtual toString : ()Ljava/lang/String;
    //   70: invokespecial <init> : (Ljava/lang/String;)V
    //   73: athrow
    //   74: aload_0
    //   75: monitorexit
    //   76: iconst_0
    //   77: ireturn
    //   78: aload_0
    //   79: getfield d : Ljava/util/Queue;
    //   82: aload_1
    //   83: invokeinterface add : (Ljava/lang/Object;)Z
    //   88: pop
    //   89: aload_0
    //   90: invokevirtual a : ()V
    //   93: aload_0
    //   94: monitorexit
    //   95: iconst_1
    //   96: ireturn
    //   97: aload_0
    //   98: getfield d : Ljava/util/Queue;
    //   101: aload_1
    //   102: invokeinterface add : (Ljava/lang/Object;)Z
    //   107: pop
    //   108: aload_0
    //   109: monitorexit
    //   110: iconst_1
    //   111: ireturn
    //   112: aload_0
    //   113: getfield d : Ljava/util/Queue;
    //   116: aload_1
    //   117: invokeinterface add : (Ljava/lang/Object;)Z
    //   122: pop
    //   123: aload_0
    //   124: getfield a : I
    //   127: ifne -> 244
    //   130: iconst_1
    //   131: istore_3
    //   132: goto -> 135
    //   135: iload_3
    //   136: invokestatic b : (Z)V
    //   139: ldc 'MessengerIpcClient'
    //   141: iconst_2
    //   142: invokestatic isLoggable : (Ljava/lang/String;I)Z
    //   145: ifeq -> 156
    //   148: ldc 'MessengerIpcClient'
    //   150: ldc 'Starting bind to GmsCore'
    //   152: invokestatic v : (Ljava/lang/String;Ljava/lang/String;)I
    //   155: pop
    //   156: aload_0
    //   157: iconst_1
    //   158: putfield a : I
    //   161: new android/content/Intent
    //   164: dup
    //   165: ldc 'com.google.android.c2dm.intent.REGISTER'
    //   167: invokespecial <init> : (Ljava/lang/String;)V
    //   170: astore_1
    //   171: aload_1
    //   172: ldc 'com.google.android.gms'
    //   174: invokevirtual setPackage : (Ljava/lang/String;)Landroid/content/Intent;
    //   177: pop
    //   178: invokestatic a : ()Le/f/a/e/e/m/a;
    //   181: aload_0
    //   182: getfield f : Le/f/a/e/d/i;
    //   185: invokestatic a : (Le/f/a/e/d/i;)Landroid/content/Context;
    //   188: aload_1
    //   189: aload_0
    //   190: iconst_1
    //   191: invokevirtual a : (Landroid/content/Context;Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
    //   194: ifne -> 208
    //   197: aload_0
    //   198: iconst_0
    //   199: ldc_w 'Unable to bind to service'
    //   202: invokevirtual a : (ILjava/lang/String;)V
    //   205: goto -> 235
    //   208: aload_0
    //   209: getfield f : Le/f/a/e/d/i;
    //   212: invokestatic b : (Le/f/a/e/d/i;)Ljava/util/concurrent/ScheduledExecutorService;
    //   215: new e/f/a/e/d/l
    //   218: dup
    //   219: aload_0
    //   220: invokespecial <init> : (Le/f/a/e/d/j;)V
    //   223: ldc2_w 30
    //   226: getstatic java/util/concurrent/TimeUnit.SECONDS : Ljava/util/concurrent/TimeUnit;
    //   229: invokeinterface schedule : (Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
    //   234: pop
    //   235: aload_0
    //   236: monitorexit
    //   237: iconst_1
    //   238: ireturn
    //   239: astore_1
    //   240: aload_0
    //   241: monitorexit
    //   242: aload_1
    //   243: athrow
    //   244: iconst_0
    //   245: istore_3
    //   246: goto -> 135
    // Exception table:
    //   from	to	target	type
    //   2	7	239	finally
    //   34	74	239	finally
    //   78	93	239	finally
    //   97	108	239	finally
    //   112	130	239	finally
    //   135	156	239	finally
    //   156	205	239	finally
    //   208	235	239	finally
  }
  
  final void b() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield a : I
    //   6: iconst_2
    //   7: if_icmpne -> 69
    //   10: aload_0
    //   11: getfield d : Ljava/util/Queue;
    //   14: invokeinterface isEmpty : ()Z
    //   19: ifeq -> 69
    //   22: aload_0
    //   23: getfield e : Landroid/util/SparseArray;
    //   26: invokevirtual size : ()I
    //   29: ifne -> 69
    //   32: ldc 'MessengerIpcClient'
    //   34: iconst_2
    //   35: invokestatic isLoggable : (Ljava/lang/String;I)Z
    //   38: ifeq -> 50
    //   41: ldc 'MessengerIpcClient'
    //   43: ldc_w 'Finished handling requests, unbinding'
    //   46: invokestatic v : (Ljava/lang/String;Ljava/lang/String;)I
    //   49: pop
    //   50: aload_0
    //   51: iconst_3
    //   52: putfield a : I
    //   55: invokestatic a : ()Le/f/a/e/e/m/a;
    //   58: aload_0
    //   59: getfield f : Le/f/a/e/d/i;
    //   62: invokestatic a : (Le/f/a/e/d/i;)Landroid/content/Context;
    //   65: aload_0
    //   66: invokevirtual a : (Landroid/content/Context;Landroid/content/ServiceConnection;)V
    //   69: aload_0
    //   70: monitorexit
    //   71: return
    //   72: astore_1
    //   73: aload_0
    //   74: monitorexit
    //   75: aload_1
    //   76: athrow
    // Exception table:
    //   from	to	target	type
    //   2	50	72	finally
    //   50	69	72	finally
  }
  
  final void c() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield a : I
    //   6: iconst_1
    //   7: if_icmpne -> 18
    //   10: aload_0
    //   11: iconst_1
    //   12: ldc_w 'Timed out while binding'
    //   15: invokevirtual a : (ILjava/lang/String;)V
    //   18: aload_0
    //   19: monitorexit
    //   20: return
    //   21: astore_1
    //   22: aload_0
    //   23: monitorexit
    //   24: aload_1
    //   25: athrow
    // Exception table:
    //   from	to	target	type
    //   2	18	21	finally
  }
  
  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder) {
    if (Log.isLoggable("MessengerIpcClient", 2))
      Log.v("MessengerIpcClient", "Service connected"); 
    i.b(this.f).execute(new o(this, paramIBinder));
  }
  
  public final void onServiceDisconnected(ComponentName paramComponentName) {
    if (Log.isLoggable("MessengerIpcClient", 2))
      Log.v("MessengerIpcClient", "Service disconnected"); 
    i.b(this.f).execute(new q(this));
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/d/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */