package e.g.a;

import android.os.Build;
import android.util.Log;
import e.g.a.r.b;
import e.g.a.r.d;
import e.g.a.s.a;
import e.g.a.s.d;
import e.g.a.s.e;
import e.g.a.s.g;
import e.g.a.s.h;
import e.g.a.t.b;
import java.io.Closeable;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.channels.SelectionKey;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class d {
  static d e = new d();
  
  private static ExecutorService f = e();
  
  static final WeakHashMap<Thread, d> g = new WeakHashMap<Thread, d>();
  
  private m a;
  
  String b;
  
  PriorityQueue<m> c = new PriorityQueue<m>(1, n.c);
  
  Thread d;
  
  public d() {
    this(null);
  }
  
  public d(String paramString) {
    String str = paramString;
    if (paramString == null)
      str = "AsyncServer"; 
    this.b = str;
  }
  
  private static long a(d paramd, PriorityQueue<m> paramPriorityQueue) {
    long l = Long.MAX_VALUE;
    while (true) {
      synchronized (null) {
        long l2 = System.currentTimeMillis();
        long l1 = l;
        m m1 = null;
        if (paramPriorityQueue.size() > 0) {
          m1 = paramPriorityQueue.remove();
          if (m1.b <= l2) {
            l1 = l;
          } else {
            l1 = m1.b - l2;
            paramPriorityQueue.add(m1);
            m1 = null;
          } 
        } 
        /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{e/g/a/d}, name=paramd} */
        if (m1 == null)
          return l1; 
        m1.a.run();
        l = l1;
      } 
    } 
  }
  
  private static void a(m paramm) {
    b(paramm);
    try {
      paramm.a();
      return;
    } catch (Exception exception) {
      return;
    } 
  }
  
  private void a(boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield a : Le/g/a/m;
    //   6: ifnull -> 34
    //   9: ldc 'NIO'
    //   11: ldc 'Reentrant call'
    //   13: invokestatic i : (Ljava/lang/String;Ljava/lang/String;)I
    //   16: pop
    //   17: iconst_1
    //   18: istore_2
    //   19: aload_0
    //   20: getfield a : Le/g/a/m;
    //   23: astore #4
    //   25: aload_0
    //   26: getfield c : Ljava/util/PriorityQueue;
    //   29: astore #5
    //   31: goto -> 143
    //   34: new e/g/a/m
    //   37: dup
    //   38: invokestatic provider : ()Ljava/nio/channels/spi/SelectorProvider;
    //   41: invokevirtual openSelector : ()Ljava/nio/channels/spi/AbstractSelector;
    //   44: invokespecial <init> : (Ljava/nio/channels/Selector;)V
    //   47: astore #6
    //   49: aload_0
    //   50: aload #6
    //   52: putfield a : Le/g/a/m;
    //   55: aload_0
    //   56: getfield c : Ljava/util/PriorityQueue;
    //   59: astore #5
    //   61: iload_1
    //   62: ifeq -> 92
    //   65: new e/g/a/d$a
    //   68: dup
    //   69: aload_0
    //   70: aload_0
    //   71: getfield b : Ljava/lang/String;
    //   74: aload #6
    //   76: aload #5
    //   78: invokespecial <init> : (Le/g/a/d;Ljava/lang/String;Le/g/a/m;Ljava/util/PriorityQueue;)V
    //   81: astore #4
    //   83: aload_0
    //   84: aload #4
    //   86: putfield d : Ljava/lang/Thread;
    //   89: goto -> 100
    //   92: invokestatic currentThread : ()Ljava/lang/Thread;
    //   95: astore #4
    //   97: goto -> 83
    //   100: aload_0
    //   101: invokespecial c : ()Z
    //   104: istore_3
    //   105: iload_3
    //   106: ifne -> 129
    //   109: aload_0
    //   110: getfield a : Le/g/a/m;
    //   113: invokevirtual a : ()V
    //   116: aload_0
    //   117: aconst_null
    //   118: putfield a : Le/g/a/m;
    //   121: aload_0
    //   122: aconst_null
    //   123: putfield d : Ljava/lang/Thread;
    //   126: aload_0
    //   127: monitorexit
    //   128: return
    //   129: iload_1
    //   130: ifeq -> 217
    //   133: aload_0
    //   134: getfield d : Ljava/lang/Thread;
    //   137: invokevirtual start : ()V
    //   140: aload_0
    //   141: monitorexit
    //   142: return
    //   143: aload_0
    //   144: monitorexit
    //   145: iload_2
    //   146: ifeq -> 179
    //   149: aload_0
    //   150: aload #4
    //   152: aload #5
    //   154: invokestatic c : (Le/g/a/d;Le/g/a/m;Ljava/util/PriorityQueue;)V
    //   157: return
    //   158: astore #5
    //   160: ldc 'NIO'
    //   162: ldc 'Selector closed'
    //   164: aload #5
    //   166: invokestatic i : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   169: pop
    //   170: aload #4
    //   172: invokevirtual b : ()Ljava/nio/channels/Selector;
    //   175: invokevirtual close : ()V
    //   178: return
    //   179: aload_0
    //   180: aload #4
    //   182: aload #5
    //   184: invokestatic b : (Le/g/a/d;Le/g/a/m;Ljava/util/PriorityQueue;)V
    //   187: return
    //   188: aload_0
    //   189: monitorexit
    //   190: return
    //   191: astore #4
    //   193: aload_0
    //   194: monitorexit
    //   195: goto -> 201
    //   198: aload #4
    //   200: athrow
    //   201: goto -> 198
    //   204: astore #4
    //   206: goto -> 188
    //   209: astore #4
    //   211: goto -> 116
    //   214: astore #4
    //   216: return
    //   217: iconst_0
    //   218: istore_2
    //   219: aload #6
    //   221: astore #4
    //   223: goto -> 143
    // Exception table:
    //   from	to	target	type
    //   2	17	191	finally
    //   19	31	191	finally
    //   34	61	204	java/io/IOException
    //   34	61	191	finally
    //   65	83	191	finally
    //   83	89	191	finally
    //   92	97	191	finally
    //   100	105	191	finally
    //   109	116	209	java/lang/Exception
    //   109	116	191	finally
    //   116	128	191	finally
    //   133	142	191	finally
    //   143	145	191	finally
    //   149	157	158	e/g/a/d$i
    //   170	178	214	java/lang/Exception
    //   188	190	191	finally
    //   193	195	191	finally
  }
  
  private j b(InetSocketAddress paramInetSocketAddress, b paramb) {
    j j = new j(null);
    a(new e(this, j, paramb, paramInetSocketAddress));
    return j;
  }
  
  private static void b(d paramd, m paramm, PriorityQueue<m> paramPriorityQueue) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: aload_2
    //   3: invokestatic c : (Le/g/a/d;Le/g/a/m;Ljava/util/PriorityQueue;)V
    //   6: goto -> 26
    //   9: astore_3
    //   10: ldc 'NIO'
    //   12: ldc 'Selector exception, shutting down'
    //   14: aload_3
    //   15: invokestatic i : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   18: pop
    //   19: aload_1
    //   20: invokevirtual b : ()Ljava/nio/channels/Selector;
    //   23: invokevirtual close : ()V
    //   26: aload_0
    //   27: monitorenter
    //   28: aload_1
    //   29: invokevirtual c : ()Z
    //   32: ifeq -> 59
    //   35: aload_1
    //   36: invokevirtual d : ()Ljava/util/Set;
    //   39: invokeinterface size : ()I
    //   44: ifgt -> 54
    //   47: aload_2
    //   48: invokevirtual size : ()I
    //   51: ifle -> 59
    //   54: aload_0
    //   55: monitorexit
    //   56: goto -> 0
    //   59: aload_1
    //   60: invokestatic a : (Le/g/a/m;)V
    //   63: aload_0
    //   64: getfield a : Le/g/a/m;
    //   67: aload_1
    //   68: if_acmpne -> 96
    //   71: aload_0
    //   72: new java/util/PriorityQueue
    //   75: dup
    //   76: iconst_1
    //   77: getstatic e/g/a/d$n.c : Le/g/a/d$n;
    //   80: invokespecial <init> : (ILjava/util/Comparator;)V
    //   83: putfield c : Ljava/util/PriorityQueue;
    //   86: aload_0
    //   87: aconst_null
    //   88: putfield a : Le/g/a/m;
    //   91: aload_0
    //   92: aconst_null
    //   93: putfield d : Ljava/lang/Thread;
    //   96: aload_0
    //   97: monitorexit
    //   98: getstatic e/g/a/d.g : Ljava/util/WeakHashMap;
    //   101: astore_0
    //   102: aload_0
    //   103: monitorenter
    //   104: getstatic e/g/a/d.g : Ljava/util/WeakHashMap;
    //   107: invokestatic currentThread : ()Ljava/lang/Thread;
    //   110: invokevirtual remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   113: pop
    //   114: aload_0
    //   115: monitorexit
    //   116: return
    //   117: astore_1
    //   118: aload_0
    //   119: monitorexit
    //   120: aload_1
    //   121: athrow
    //   122: astore_1
    //   123: aload_0
    //   124: monitorexit
    //   125: goto -> 130
    //   128: aload_1
    //   129: athrow
    //   130: goto -> 128
    //   133: astore_3
    //   134: goto -> 26
    // Exception table:
    //   from	to	target	type
    //   0	6	9	e/g/a/d$i
    //   19	26	133	java/lang/Exception
    //   28	54	122	finally
    //   54	56	122	finally
    //   59	96	122	finally
    //   96	98	122	finally
    //   104	116	117	finally
    //   118	120	117	finally
    //   123	125	122	finally
  }
  
  private static void b(m paramm) {
    try {
      Iterator<SelectionKey> iterator = paramm.d().iterator();
      while (true) {
        if (iterator.hasNext()) {
          SelectionKey selectionKey = iterator.next();
          b.a(new Closeable[] { selectionKey.channel() });
          try {
            selectionKey.cancel();
          } catch (Exception exception) {}
          continue;
        } 
        return;
      } 
    } catch (Exception exception) {
      return;
    } 
  }
  
  private static void c(d paramd, m paramm, PriorityQueue<m> paramPriorityQueue) {
    // Byte code:
    //   0: aload_0
    //   1: aload_2
    //   2: invokestatic a : (Le/g/a/d;Ljava/util/PriorityQueue;)J
    //   5: lstore #4
    //   7: aload_0
    //   8: monitorenter
    //   9: aload_1
    //   10: invokevirtual f : ()I
    //   13: ifne -> 562
    //   16: aload_1
    //   17: invokevirtual d : ()Ljava/util/Set;
    //   20: invokeinterface size : ()I
    //   25: ifne -> 557
    //   28: lload #4
    //   30: ldc2_w 9223372036854775807
    //   33: lcmp
    //   34: ifne -> 557
    //   37: aload_0
    //   38: monitorexit
    //   39: return
    //   40: aload_0
    //   41: monitorexit
    //   42: iload_3
    //   43: ifeq -> 68
    //   46: lload #4
    //   48: ldc2_w 9223372036854775807
    //   51: lcmp
    //   52: ifne -> 62
    //   55: aload_1
    //   56: invokevirtual e : ()V
    //   59: goto -> 68
    //   62: aload_1
    //   63: lload #4
    //   65: invokevirtual a : (J)V
    //   68: aload_1
    //   69: invokevirtual g : ()Ljava/util/Set;
    //   72: astore #9
    //   74: aload #9
    //   76: invokeinterface iterator : ()Ljava/util/Iterator;
    //   81: astore #10
    //   83: aload #10
    //   85: invokeinterface hasNext : ()Z
    //   90: ifeq -> 512
    //   93: aload #10
    //   95: invokeinterface next : ()Ljava/lang/Object;
    //   100: checkcast java/nio/channels/SelectionKey
    //   103: astore #11
    //   105: aload #11
    //   107: invokevirtual isAcceptable : ()Z
    //   110: istore #6
    //   112: aconst_null
    //   113: astore #8
    //   115: aconst_null
    //   116: astore_2
    //   117: iload #6
    //   119: ifeq -> 281
    //   122: aload #11
    //   124: invokevirtual channel : ()Ljava/nio/channels/SelectableChannel;
    //   127: checkcast java/nio/channels/ServerSocketChannel
    //   130: astore #7
    //   132: aload #7
    //   134: invokevirtual accept : ()Ljava/nio/channels/SocketChannel;
    //   137: astore #7
    //   139: aload #7
    //   141: ifnonnull -> 147
    //   144: goto -> 83
    //   147: aload #8
    //   149: astore_2
    //   150: aload #7
    //   152: iconst_0
    //   153: invokevirtual configureBlocking : (Z)Ljava/nio/channels/SelectableChannel;
    //   156: pop
    //   157: aload #8
    //   159: astore_2
    //   160: aload #7
    //   162: aload_1
    //   163: invokevirtual b : ()Ljava/nio/channels/Selector;
    //   166: iconst_1
    //   167: invokevirtual register : (Ljava/nio/channels/Selector;I)Ljava/nio/channels/SelectionKey;
    //   170: astore #8
    //   172: aload #8
    //   174: astore_2
    //   175: aload #11
    //   177: invokevirtual attachment : ()Ljava/lang/Object;
    //   180: checkcast e/g/a/r/d
    //   183: astore #11
    //   185: aload #8
    //   187: astore_2
    //   188: new e/g/a/b
    //   191: dup
    //   192: invokespecial <init> : ()V
    //   195: astore #12
    //   197: aload #8
    //   199: astore_2
    //   200: aload #12
    //   202: aload #7
    //   204: aload #7
    //   206: invokevirtual socket : ()Ljava/net/Socket;
    //   209: invokevirtual getRemoteSocketAddress : ()Ljava/net/SocketAddress;
    //   212: checkcast java/net/InetSocketAddress
    //   215: invokevirtual a : (Ljava/nio/channels/SocketChannel;Ljava/net/InetSocketAddress;)V
    //   218: aload #8
    //   220: astore_2
    //   221: aload #12
    //   223: aload_0
    //   224: aload #8
    //   226: invokevirtual a : (Le/g/a/d;Ljava/nio/channels/SelectionKey;)V
    //   229: aload #8
    //   231: astore_2
    //   232: aload #8
    //   234: aload #12
    //   236: invokevirtual attach : (Ljava/lang/Object;)Ljava/lang/Object;
    //   239: pop
    //   240: aload #8
    //   242: astore_2
    //   243: aload #11
    //   245: aload #12
    //   247: invokeinterface a : (Le/g/a/f;)V
    //   252: goto -> 83
    //   255: aconst_null
    //   256: astore #7
    //   258: iconst_1
    //   259: anewarray java/io/Closeable
    //   262: dup
    //   263: iconst_0
    //   264: aload #7
    //   266: aastore
    //   267: invokestatic a : ([Ljava/io/Closeable;)V
    //   270: aload_2
    //   271: ifnull -> 83
    //   274: aload_2
    //   275: invokevirtual cancel : ()V
    //   278: goto -> 83
    //   281: aload #11
    //   283: invokevirtual isReadable : ()Z
    //   286: ifeq -> 307
    //   289: aload_0
    //   290: aload #11
    //   292: invokevirtual attachment : ()Ljava/lang/Object;
    //   295: checkcast e/g/a/b
    //   298: invokevirtual g : ()I
    //   301: invokevirtual a : (I)V
    //   304: goto -> 83
    //   307: aload #11
    //   309: invokevirtual isWritable : ()Z
    //   312: ifeq -> 329
    //   315: aload #11
    //   317: invokevirtual attachment : ()Ljava/lang/Object;
    //   320: checkcast e/g/a/b
    //   323: invokevirtual f : ()V
    //   326: goto -> 83
    //   329: aload #11
    //   331: invokevirtual isConnectable : ()Z
    //   334: ifeq -> 489
    //   337: aload #11
    //   339: invokevirtual attachment : ()Ljava/lang/Object;
    //   342: checkcast e/g/a/d$j
    //   345: astore_2
    //   346: aload #11
    //   348: invokevirtual channel : ()Ljava/nio/channels/SelectableChannel;
    //   351: checkcast java/nio/channels/SocketChannel
    //   354: astore #7
    //   356: aload #11
    //   358: iconst_1
    //   359: invokevirtual interestOps : (I)Ljava/nio/channels/SelectionKey;
    //   362: pop
    //   363: aload #7
    //   365: invokevirtual finishConnect : ()Z
    //   368: pop
    //   369: new e/g/a/b
    //   372: dup
    //   373: invokespecial <init> : ()V
    //   376: astore #8
    //   378: aload #8
    //   380: aload_0
    //   381: aload #11
    //   383: invokevirtual a : (Le/g/a/d;Ljava/nio/channels/SelectionKey;)V
    //   386: aload #8
    //   388: aload #7
    //   390: aload #7
    //   392: invokevirtual socket : ()Ljava/net/Socket;
    //   395: invokevirtual getRemoteSocketAddress : ()Ljava/net/SocketAddress;
    //   398: checkcast java/net/InetSocketAddress
    //   401: invokevirtual a : (Ljava/nio/channels/SocketChannel;Ljava/net/InetSocketAddress;)V
    //   404: aload #11
    //   406: aload #8
    //   408: invokevirtual attach : (Ljava/lang/Object;)Ljava/lang/Object;
    //   411: pop
    //   412: aload_2
    //   413: aload #8
    //   415: invokevirtual a : (Ljava/lang/Object;)Z
    //   418: ifeq -> 83
    //   421: aload_2
    //   422: getfield l : Le/g/a/r/b;
    //   425: aconst_null
    //   426: aload #8
    //   428: invokeinterface a : (Ljava/lang/Exception;Le/g/a/f;)V
    //   433: goto -> 83
    //   436: astore_2
    //   437: new java/lang/RuntimeException
    //   440: dup
    //   441: aload_2
    //   442: invokespecial <init> : (Ljava/lang/Throwable;)V
    //   445: athrow
    //   446: astore #8
    //   448: aload #11
    //   450: invokevirtual cancel : ()V
    //   453: iconst_1
    //   454: anewarray java/io/Closeable
    //   457: dup
    //   458: iconst_0
    //   459: aload #7
    //   461: aastore
    //   462: invokestatic a : ([Ljava/io/Closeable;)V
    //   465: aload_2
    //   466: aload #8
    //   468: invokevirtual a : (Ljava/lang/Exception;)Z
    //   471: ifeq -> 83
    //   474: aload_2
    //   475: getfield l : Le/g/a/r/b;
    //   478: aload #8
    //   480: aconst_null
    //   481: invokeinterface a : (Ljava/lang/Exception;Le/g/a/f;)V
    //   486: goto -> 83
    //   489: ldc 'NIO'
    //   491: ldc_w 'wtf'
    //   494: invokestatic i : (Ljava/lang/String;Ljava/lang/String;)I
    //   497: pop
    //   498: new java/lang/RuntimeException
    //   501: dup
    //   502: ldc_w 'Unknown key state.'
    //   505: invokespecial <init> : (Ljava/lang/String;)V
    //   508: athrow
    //   509: goto -> 83
    //   512: aload #9
    //   514: invokeinterface clear : ()V
    //   519: return
    //   520: astore_1
    //   521: aload_0
    //   522: monitorexit
    //   523: aload_1
    //   524: athrow
    //   525: astore_0
    //   526: new e/g/a/d$i
    //   529: dup
    //   530: aload_0
    //   531: invokespecial <init> : (Ljava/lang/Exception;)V
    //   534: astore_0
    //   535: goto -> 540
    //   538: aload_0
    //   539: athrow
    //   540: goto -> 538
    //   543: astore_2
    //   544: goto -> 509
    //   547: astore #7
    //   549: goto -> 255
    //   552: astore #8
    //   554: goto -> 258
    //   557: iconst_1
    //   558: istore_3
    //   559: goto -> 40
    //   562: iconst_0
    //   563: istore_3
    //   564: goto -> 40
    // Exception table:
    //   from	to	target	type
    //   7	9	525	java/lang/Exception
    //   9	28	520	finally
    //   37	39	520	finally
    //   40	42	520	finally
    //   55	59	525	java/lang/Exception
    //   62	68	525	java/lang/Exception
    //   105	112	543	java/nio/channels/CancelledKeyException
    //   122	132	543	java/nio/channels/CancelledKeyException
    //   132	139	547	java/io/IOException
    //   132	139	543	java/nio/channels/CancelledKeyException
    //   150	157	552	java/io/IOException
    //   150	157	543	java/nio/channels/CancelledKeyException
    //   160	172	552	java/io/IOException
    //   160	172	543	java/nio/channels/CancelledKeyException
    //   175	185	552	java/io/IOException
    //   175	185	543	java/nio/channels/CancelledKeyException
    //   188	197	552	java/io/IOException
    //   188	197	543	java/nio/channels/CancelledKeyException
    //   200	218	552	java/io/IOException
    //   200	218	543	java/nio/channels/CancelledKeyException
    //   221	229	552	java/io/IOException
    //   221	229	543	java/nio/channels/CancelledKeyException
    //   232	240	552	java/io/IOException
    //   232	240	543	java/nio/channels/CancelledKeyException
    //   243	252	552	java/io/IOException
    //   243	252	543	java/nio/channels/CancelledKeyException
    //   258	270	543	java/nio/channels/CancelledKeyException
    //   274	278	543	java/nio/channels/CancelledKeyException
    //   281	304	543	java/nio/channels/CancelledKeyException
    //   307	326	543	java/nio/channels/CancelledKeyException
    //   329	363	543	java/nio/channels/CancelledKeyException
    //   363	412	446	java/io/IOException
    //   363	412	543	java/nio/channels/CancelledKeyException
    //   412	433	436	java/lang/Exception
    //   437	446	543	java/nio/channels/CancelledKeyException
    //   448	486	543	java/nio/channels/CancelledKeyException
    //   489	509	543	java/nio/channels/CancelledKeyException
    //   521	523	520	finally
    //   523	525	525	java/lang/Exception
  }
  
  private static void c(m paramm) {
    f.execute(new b(paramm));
  }
  
  private boolean c() {
    synchronized (g) {
      if ((d)g.get(this.d) != null)
        return false; 
      g.put(this.d, this);
      return true;
    } 
  }
  
  public static d d() {
    return e;
  }
  
  private static ExecutorService e() {
    k k = new k("AsyncServer-worker-");
    return new ThreadPoolExecutor(1, 4, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(), k);
  }
  
  public e a(InetAddress paramInetAddress, int paramInt, d paramd) {
    l l = new l(null);
    b(new d(this, paramInetAddress, paramInt, paramd, l));
    return (e)l.a;
  }
  
  public a a(InetSocketAddress paramInetSocketAddress, b paramb) {
    if (!paramInetSocketAddress.isUnresolved())
      return (a)b(paramInetSocketAddress, paramb); 
    g g = new g();
    d<InetAddress> d1 = b(paramInetSocketAddress.getHostName());
    g.a((a)d1);
    d1.b(new f(this, paramb, g, paramInetSocketAddress));
    return (a)g;
  }
  
  public d<InetAddress[]> a(String paramString) {
    g g = new g();
    f.execute(new g(this, paramString, g));
    return (d<InetAddress[]>)g;
  }
  
  public Object a(Runnable paramRunnable) {
    return a(paramRunnable, 0L);
  }
  
  public Object a(Runnable paramRunnable, long paramLong) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: lload_2
    //   3: lconst_0
    //   4: lcmp
    //   5: ifeq -> 17
    //   8: invokestatic currentTimeMillis : ()J
    //   11: lload_2
    //   12: ladd
    //   13: lstore_2
    //   14: goto -> 26
    //   17: aload_0
    //   18: getfield c : Ljava/util/PriorityQueue;
    //   21: invokevirtual size : ()I
    //   24: i2l
    //   25: lstore_2
    //   26: aload_0
    //   27: getfield c : Ljava/util/PriorityQueue;
    //   30: astore #4
    //   32: new e/g/a/d$m
    //   35: dup
    //   36: aload_1
    //   37: lload_2
    //   38: invokespecial <init> : (Ljava/lang/Runnable;J)V
    //   41: astore_1
    //   42: aload #4
    //   44: aload_1
    //   45: invokevirtual add : (Ljava/lang/Object;)Z
    //   48: pop
    //   49: aload_0
    //   50: getfield a : Le/g/a/m;
    //   53: ifnonnull -> 61
    //   56: aload_0
    //   57: iconst_1
    //   58: invokespecial a : (Z)V
    //   61: aload_0
    //   62: invokevirtual b : ()Z
    //   65: ifne -> 75
    //   68: aload_0
    //   69: getfield a : Le/g/a/m;
    //   72: invokestatic c : (Le/g/a/m;)V
    //   75: aload_0
    //   76: monitorexit
    //   77: aload_1
    //   78: areturn
    //   79: astore_1
    //   80: aload_0
    //   81: monitorexit
    //   82: aload_1
    //   83: athrow
    // Exception table:
    //   from	to	target	type
    //   8	14	79	finally
    //   17	26	79	finally
    //   26	61	79	finally
    //   61	75	79	finally
    //   75	77	79	finally
    //   80	82	79	finally
  }
  
  public Thread a() {
    return this.d;
  }
  
  protected void a(int paramInt) {}
  
  public d<InetAddress> b(String paramString) {
    d<InetAddress[]> d1 = a(paramString);
    h h = new h(this);
    d1.a((e)h);
    return (d<InetAddress>)h;
  }
  
  protected void b(int paramInt) {}
  
  public void b(Runnable paramRunnable) {
    if (Thread.currentThread() == this.d) {
      a(paramRunnable);
      a(this, this.c);
      return;
    } 
    Semaphore semaphore = new Semaphore(0);
    a(new c(this, paramRunnable, semaphore));
    try {
      semaphore.acquire();
      return;
    } catch (InterruptedException interruptedException) {
      Log.e("NIO", "run", interruptedException);
      return;
    } 
  }
  
  public boolean b() {
    return (this.d == Thread.currentThread());
  }
  
  static {
    try {
      if (Build.VERSION.SDK_INT <= 8) {
        System.setProperty("java.net.preferIPv4Stack", "true");
        System.setProperty("java.net.preferIPv6Addresses", "false");
      } 
    } finally {
      Exception exception;
    } 
  }
  
  class a extends Thread {
    a(d this$0, String param1String, m param1m, PriorityQueue param1PriorityQueue) {
      super(param1String);
    }
    
    public void run() {
      d.a(this.e, this.c, this.d);
    }
  }
  
  static final class b implements Runnable {
    b(m param1m) {}
    
    public void run() {
      try {
        this.c.h();
        return;
      } catch (Exception exception) {
        Log.i("NIO", "Selector Exception? L Preview?");
        return;
      } 
    }
  }
  
  class c implements Runnable {
    c(d this$0, Runnable param1Runnable, Semaphore param1Semaphore) {}
    
    public void run() {
      this.c.run();
      this.d.release();
    }
  }
  
  class d implements Runnable {
    d(d this$0, InetAddress param1InetAddress, int param1Int, d param1d, d.l param1l) {}
    
    public void run() {
      Closeable closeable1;
      Closeable closeable2;
      try {
        closeable2 = ServerSocketChannel.open();
        try {
          closeable1 = new n((ServerSocketChannel)closeable2);
          try {
            InetSocketAddress inetSocketAddress;
            if (this.c == null) {
              inetSocketAddress = new InetSocketAddress(this.d);
            } else {
              inetSocketAddress = new InetSocketAddress(this.c, this.d);
            } 
            closeable2.socket().bind(inetSocketAddress);
            SelectionKey selectionKey = closeable1.a(d.a(this.g).b());
            selectionKey.attach(this.e);
            d d1 = this.e;
            d.l l1 = this.f;
            a a = new a(this, (ServerSocketChannel)closeable2, (n)closeable1, selectionKey);
            l1.a = (T)a;
            d1.a(a);
            return;
          } catch (IOException null) {}
        } catch (IOException null) {
          closeable1 = null;
        } 
      } catch (IOException iOException) {
        closeable1 = null;
        closeable2 = closeable1;
      } 
      b.a(new Closeable[] { closeable1, closeable2 });
      this.e.a(iOException);
    }
    
    class a implements e {
      a(d.d this$0, ServerSocketChannel param2ServerSocketChannel, n param2n, SelectionKey param2SelectionKey) {}
      
      public void stop() {
        b.a(new Closeable[] { this.a });
        try {
          this.b.cancel();
          return;
        } catch (Exception exception) {
          return;
        } 
      }
    }
  }
  
  class a implements e {
    a(d this$0, ServerSocketChannel param1ServerSocketChannel, n param1n, SelectionKey param1SelectionKey) {}
    
    public void stop() {
      b.a(new Closeable[] { this.a });
      try {
        this.b.cancel();
        return;
      } catch (Exception exception) {
        return;
      } 
    }
  }
  
  class e implements Runnable {
    e(d this$0, d.j param1j, b param1b, InetSocketAddress param1InetSocketAddress) {}
    
    public void run() {
      Closeable closeable;
      if (this.c.isCancelled())
        return; 
      d.j j1 = this.c;
      j1.l = this.d;
      SelectionKey selectionKey1 = null;
      SelectionKey selectionKey2 = null;
      try {
        closeable = SocketChannel.open();
        j1.k = (SocketChannel)closeable;
        selectionKey1 = selectionKey2;
      } finally {
        selectionKey2 = null;
      } 
      if (selectionKey1 != null)
        selectionKey1.cancel(); 
      b.a(new Closeable[] { closeable });
      this.c.a(new RuntimeException((Throwable)selectionKey2));
    }
  }
  
  class f implements e<InetAddress> {
    f(d this$0, b param1b, g param1g, InetSocketAddress param1InetSocketAddress) {}
    
    public void a(Exception param1Exception, InetAddress param1InetAddress) {
      if (param1Exception != null) {
        this.c.a(param1Exception, null);
        this.d.a(param1Exception);
        return;
      } 
      this.d.a((d)d.a(this.f, new InetSocketAddress(param1InetAddress, this.e.getPort()), this.c));
    }
  }
  
  class g implements Runnable {
    g(d this$0, String param1String, g param1g) {}
    
    public void run() {
      try {
        InetAddress[] arrayOfInetAddress = InetAddress.getAllByName(this.c);
        if (arrayOfInetAddress != null && arrayOfInetAddress.length != 0) {
          this.e.a(new a(this, arrayOfInetAddress));
          return;
        } 
        throw new l("no addresses for host");
      } catch (Exception exception) {
        this.e.a(new b(this, exception));
        return;
      } 
    }
    
    class a implements Runnable {
      a(d.g this$0, InetAddress[] param2ArrayOfInetAddress) {}
      
      public void run() {
        this.d.d.b(null, this.c);
      }
    }
    
    class b implements Runnable {
      b(d.g this$0, Exception param2Exception) {}
      
      public void run() {
        this.d.d.b(this.c, null);
      }
    }
  }
  
  class a implements Runnable {
    a(d this$0, InetAddress[] param1ArrayOfInetAddress) {}
    
    public void run() {
      this.d.d.b(null, this.c);
    }
  }
  
  class b implements Runnable {
    b(d this$0, Exception param1Exception) {}
    
    public void run() {
      this.d.d.b(this.c, null);
    }
  }
  
  class h extends h<InetAddress, InetAddress[]> {
    h(d this$0) {}
    
    protected void a(InetAddress[] param1ArrayOfInetAddress) {
      a(param1ArrayOfInetAddress[0]);
    }
  }
  
  private static class i extends IOException {
    public i(Exception param1Exception) {
      super(param1Exception);
    }
  }
  
  private class j extends g<b> {
    SocketChannel k;
    
    b l;
    
    private j(d this$0) {}
    
    protected void a() {
      super.a();
      try {
        if (this.k != null)
          this.k.close(); 
        return;
      } catch (IOException iOException) {
        return;
      } 
    }
  }
  
  private static class k implements ThreadFactory {
    private final ThreadGroup a;
    
    private final AtomicInteger b;
    
    private final String c;
    
    k(String param1String) {
      ThreadGroup threadGroup;
      this.b = new AtomicInteger(1);
      SecurityManager securityManager = System.getSecurityManager();
      if (securityManager != null) {
        threadGroup = securityManager.getThreadGroup();
      } else {
        threadGroup = Thread.currentThread().getThreadGroup();
      } 
      this.a = threadGroup;
      this.c = param1String;
    }
    
    public Thread newThread(Runnable param1Runnable) {
      ThreadGroup threadGroup = this.a;
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(this.c);
      stringBuilder.append(this.b.getAndIncrement());
      param1Runnable = new Thread(threadGroup, param1Runnable, stringBuilder.toString(), 0L);
      if (param1Runnable.isDaemon())
        param1Runnable.setDaemon(false); 
      if (param1Runnable.getPriority() != 5)
        param1Runnable.setPriority(5); 
      return (Thread)param1Runnable;
    }
  }
  
  private static class l<T> {
    T a;
    
    private l() {}
  }
  
  private static class m {
    public Runnable a;
    
    public long b;
    
    public m(Runnable param1Runnable, long param1Long) {
      this.a = param1Runnable;
      this.b = param1Long;
    }
  }
  
  static class n implements Comparator<m> {
    public static n c = new n();
    
    public int a(d.m param1m1, d.m param1m2) {
      long l1 = param1m1.b;
      long l2 = param1m2.b;
      return (l1 == l2) ? 0 : ((l1 > l2) ? 1 : -1);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/g/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */