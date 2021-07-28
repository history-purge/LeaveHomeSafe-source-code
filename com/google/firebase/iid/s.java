package com.google.firebase.iid;

import android.util.Pair;
import e.f.a.e.m.l;
import java.util.Map;
import java.util.concurrent.Executor;

class s {
  private final Executor a;
  
  private final Map<Pair<String, String>, l<l>> b = (Map<Pair<String, String>, l<l>>)new b.d.a();
  
  s(Executor paramExecutor) {
    this.a = paramExecutor;
  }
  
  l<l> a(String paramString1, String paramString2, a parama) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: new android/util/Pair
    //   5: dup
    //   6: aload_1
    //   7: aload_2
    //   8: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
    //   11: astore_1
    //   12: aload_0
    //   13: getfield b : Ljava/util/Map;
    //   16: aload_1
    //   17: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   22: checkcast e/f/a/e/m/l
    //   25: astore_2
    //   26: aload_2
    //   27: ifnull -> 89
    //   30: ldc 'FirebaseInstanceId'
    //   32: iconst_3
    //   33: invokestatic isLoggable : (Ljava/lang/String;I)Z
    //   36: ifeq -> 85
    //   39: aload_1
    //   40: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   43: astore_1
    //   44: new java/lang/StringBuilder
    //   47: dup
    //   48: aload_1
    //   49: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   52: invokevirtual length : ()I
    //   55: bipush #29
    //   57: iadd
    //   58: invokespecial <init> : (I)V
    //   61: astore_3
    //   62: aload_3
    //   63: ldc 'Joining ongoing request for: '
    //   65: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   68: pop
    //   69: aload_3
    //   70: aload_1
    //   71: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   74: pop
    //   75: ldc 'FirebaseInstanceId'
    //   77: aload_3
    //   78: invokevirtual toString : ()Ljava/lang/String;
    //   81: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
    //   84: pop
    //   85: aload_0
    //   86: monitorexit
    //   87: aload_2
    //   88: areturn
    //   89: ldc 'FirebaseInstanceId'
    //   91: iconst_3
    //   92: invokestatic isLoggable : (Ljava/lang/String;I)Z
    //   95: ifeq -> 148
    //   98: aload_1
    //   99: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   102: astore_2
    //   103: new java/lang/StringBuilder
    //   106: dup
    //   107: aload_2
    //   108: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   111: invokevirtual length : ()I
    //   114: bipush #24
    //   116: iadd
    //   117: invokespecial <init> : (I)V
    //   120: astore #4
    //   122: aload #4
    //   124: ldc 'Making new request for: '
    //   126: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   129: pop
    //   130: aload #4
    //   132: aload_2
    //   133: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   136: pop
    //   137: ldc 'FirebaseInstanceId'
    //   139: aload #4
    //   141: invokevirtual toString : ()Ljava/lang/String;
    //   144: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
    //   147: pop
    //   148: aload_3
    //   149: invokeinterface start : ()Le/f/a/e/m/l;
    //   154: aload_0
    //   155: getfield a : Ljava/util/concurrent/Executor;
    //   158: new com/google/firebase/iid/r
    //   161: dup
    //   162: aload_0
    //   163: aload_1
    //   164: invokespecial <init> : (Lcom/google/firebase/iid/s;Landroid/util/Pair;)V
    //   167: invokevirtual b : (Ljava/util/concurrent/Executor;Le/f/a/e/m/c;)Le/f/a/e/m/l;
    //   170: astore_2
    //   171: aload_0
    //   172: getfield b : Ljava/util/Map;
    //   175: aload_1
    //   176: aload_2
    //   177: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   182: pop
    //   183: aload_0
    //   184: monitorexit
    //   185: aload_2
    //   186: areturn
    //   187: astore_1
    //   188: aload_0
    //   189: monitorexit
    //   190: aload_1
    //   191: athrow
    // Exception table:
    //   from	to	target	type
    //   2	26	187	finally
    //   30	85	187	finally
    //   89	148	187	finally
    //   148	183	187	finally
  }
  
  static interface a {
    l<l> start();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/firebase/iid/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */