package com.google.firebase.messaging;

import e.f.a.e.m.l;
import java.util.Map;
import java.util.concurrent.Executor;

class m0 {
  private final Executor a;
  
  private final Map<String, l<String>> b = (Map<String, l<String>>)new b.d.a();
  
  m0(Executor paramExecutor) {
    this.a = paramExecutor;
  }
  
  l<String> a(String paramString, a parama) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield b : Ljava/util/Map;
    //   6: aload_1
    //   7: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   12: checkcast e/f/a/e/m/l
    //   15: astore_3
    //   16: aload_3
    //   17: ifnull -> 72
    //   20: ldc 'FirebaseMessaging'
    //   22: iconst_3
    //   23: invokestatic isLoggable : (Ljava/lang/String;I)Z
    //   26: ifeq -> 68
    //   29: aload_1
    //   30: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   33: astore_1
    //   34: aload_1
    //   35: invokevirtual length : ()I
    //   38: ifeq -> 51
    //   41: ldc 'Joining ongoing request for: '
    //   43: aload_1
    //   44: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   47: astore_1
    //   48: goto -> 61
    //   51: new java/lang/String
    //   54: dup
    //   55: ldc 'Joining ongoing request for: '
    //   57: invokespecial <init> : (Ljava/lang/String;)V
    //   60: astore_1
    //   61: ldc 'FirebaseMessaging'
    //   63: aload_1
    //   64: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
    //   67: pop
    //   68: aload_0
    //   69: monitorexit
    //   70: aload_3
    //   71: areturn
    //   72: ldc 'FirebaseMessaging'
    //   74: iconst_3
    //   75: invokestatic isLoggable : (Ljava/lang/String;I)Z
    //   78: ifeq -> 120
    //   81: aload_1
    //   82: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   85: astore_3
    //   86: aload_3
    //   87: invokevirtual length : ()I
    //   90: ifeq -> 103
    //   93: ldc 'Making new request for: '
    //   95: aload_3
    //   96: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   99: astore_3
    //   100: goto -> 113
    //   103: new java/lang/String
    //   106: dup
    //   107: ldc 'Making new request for: '
    //   109: invokespecial <init> : (Ljava/lang/String;)V
    //   112: astore_3
    //   113: ldc 'FirebaseMessaging'
    //   115: aload_3
    //   116: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
    //   119: pop
    //   120: aload_2
    //   121: invokeinterface start : ()Le/f/a/e/m/l;
    //   126: aload_0
    //   127: getfield a : Ljava/util/concurrent/Executor;
    //   130: new com/google/firebase/messaging/l0
    //   133: dup
    //   134: aload_0
    //   135: aload_1
    //   136: invokespecial <init> : (Lcom/google/firebase/messaging/m0;Ljava/lang/String;)V
    //   139: invokevirtual b : (Ljava/util/concurrent/Executor;Le/f/a/e/m/c;)Le/f/a/e/m/l;
    //   142: astore_2
    //   143: aload_0
    //   144: getfield b : Ljava/util/Map;
    //   147: aload_1
    //   148: aload_2
    //   149: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   154: pop
    //   155: aload_0
    //   156: monitorexit
    //   157: aload_2
    //   158: areturn
    //   159: astore_1
    //   160: aload_0
    //   161: monitorexit
    //   162: aload_1
    //   163: athrow
    // Exception table:
    //   from	to	target	type
    //   2	16	159	finally
    //   20	48	159	finally
    //   51	61	159	finally
    //   61	68	159	finally
    //   72	100	159	finally
    //   103	113	159	finally
    //   113	120	159	finally
    //   120	155	159	finally
  }
  
  static interface a {
    l<String> start();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/firebase/messaging/m0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */