package com.google.mlkit.vision.common.internal;

import androidx.annotation.RecentlyNonNull;
import androidx.lifecycle.g;
import androidx.lifecycle.i;
import androidx.lifecycle.q;
import com.google.android.gms.common.internal.i;
import e.f.a.e.m.b;
import e.f.a.e.m.l;
import e.f.b.a.c.f;
import e.f.b.a.c.h;
import e.f.b.b.a.a;
import java.io.Closeable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

public class MobileVisionBase<DetectionResultT> implements Closeable, i {
  private static final i g = new i("MobileVisionBase", "");
  
  private final AtomicBoolean c = new AtomicBoolean(false);
  
  private final f<DetectionResultT, a> d;
  
  private final b e;
  
  private final Executor f;
  
  public MobileVisionBase(@RecentlyNonNull f<DetectionResultT, a> paramf, @RecentlyNonNull Executor paramExecutor) {
    this.d = paramf;
    this.e = new b();
    this.f = paramExecutor;
    paramf.b();
    paramf.a(this.f, f.a, this.e.b()).a(g.a);
  }
  
  @RecentlyNonNull
  public l<DetectionResultT> b(@RecentlyNonNull a parama) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_1
    //   3: ldc 'InputImage can not be null'
    //   5: invokestatic a : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   8: pop
    //   9: aload_0
    //   10: getfield c : Ljava/util/concurrent/atomic/AtomicBoolean;
    //   13: invokevirtual get : ()Z
    //   16: ifeq -> 38
    //   19: new e/f/b/a/a
    //   22: dup
    //   23: ldc 'This detector is already closed!'
    //   25: bipush #14
    //   27: invokespecial <init> : (Ljava/lang/String;I)V
    //   30: invokestatic a : (Ljava/lang/Exception;)Le/f/a/e/m/l;
    //   33: astore_1
    //   34: aload_0
    //   35: monitorexit
    //   36: aload_1
    //   37: areturn
    //   38: aload_1
    //   39: invokevirtual g : ()I
    //   42: bipush #32
    //   44: if_icmplt -> 88
    //   47: aload_1
    //   48: invokevirtual d : ()I
    //   51: bipush #32
    //   53: if_icmplt -> 88
    //   56: aload_0
    //   57: getfield d : Le/f/b/a/c/f;
    //   60: aload_0
    //   61: getfield f : Ljava/util/concurrent/Executor;
    //   64: new com/google/mlkit/vision/common/internal/h
    //   67: dup
    //   68: aload_0
    //   69: aload_1
    //   70: invokespecial <init> : (Lcom/google/mlkit/vision/common/internal/MobileVisionBase;Le/f/b/b/a/a;)V
    //   73: aload_0
    //   74: getfield e : Le/f/a/e/m/b;
    //   77: invokevirtual b : ()Le/f/a/e/m/a;
    //   80: invokevirtual a : (Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;Le/f/a/e/m/a;)Le/f/a/e/m/l;
    //   83: astore_1
    //   84: aload_0
    //   85: monitorexit
    //   86: aload_1
    //   87: areturn
    //   88: new e/f/b/a/a
    //   91: dup
    //   92: ldc 'InputImage width and height should be at least 32!'
    //   94: iconst_3
    //   95: invokespecial <init> : (Ljava/lang/String;I)V
    //   98: invokestatic a : (Ljava/lang/Exception;)Le/f/a/e/m/l;
    //   101: astore_1
    //   102: aload_0
    //   103: monitorexit
    //   104: aload_1
    //   105: areturn
    //   106: astore_1
    //   107: aload_0
    //   108: monitorexit
    //   109: aload_1
    //   110: athrow
    // Exception table:
    //   from	to	target	type
    //   2	34	106	finally
    //   38	84	106	finally
    //   88	102	106	finally
  }
  
  @q(g.b.ON_DESTROY)
  public void close() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield c : Ljava/util/concurrent/atomic/AtomicBoolean;
    //   6: iconst_1
    //   7: invokevirtual getAndSet : (Z)Z
    //   10: ifne -> 34
    //   13: aload_0
    //   14: getfield e : Le/f/a/e/m/b;
    //   17: invokevirtual a : ()V
    //   20: aload_0
    //   21: getfield d : Le/f/b/a/c/f;
    //   24: aload_0
    //   25: getfield f : Ljava/util/concurrent/Executor;
    //   28: invokevirtual a : (Ljava/util/concurrent/Executor;)V
    //   31: aload_0
    //   32: monitorexit
    //   33: return
    //   34: aload_0
    //   35: monitorexit
    //   36: return
    //   37: astore_1
    //   38: aload_0
    //   39: monitorexit
    //   40: aload_1
    //   41: athrow
    // Exception table:
    //   from	to	target	type
    //   2	31	37	finally
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/mlkit/vision/common/internal/MobileVisionBase.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */