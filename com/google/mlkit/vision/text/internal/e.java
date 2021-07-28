package com.google.mlkit.vision.text.internal;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.common.internal.q;
import com.google.mlkit.vision.common.internal.d;
import e.f.a.e.i.k.a7;
import e.f.a.e.i.k.a8;
import e.f.a.e.i.k.e1;
import e.f.a.e.i.k.f1;
import e.f.a.e.i.k.l7;
import e.f.a.e.i.k.o5;
import e.f.a.e.i.k.p7;
import e.f.a.e.i.k.r7;
import e.f.a.e.i.k.u5;
import e.f.a.e.i.k.v5;
import e.f.a.e.i.k.x5;
import e.f.a.e.i.k.z6;
import e.f.b.a.c.f;
import e.f.b.a.c.h;
import e.f.b.a.c.i;
import e.f.b.b.a.a;
import e.f.b.b.b.a;

public final class e extends f<a, a> {
  static boolean g = true;
  
  private static final d h = d.a();
  
  private e.f.a.e.n.f.e d;
  
  private final Context e;
  
  private final r7 f;
  
  public e(i parami) {
    q.a(parami, "MlKitContext can not be null");
    this.e = parami.a();
    this.f = r71;
    new a(this.e);
  }
  
  private final void a(u5 paramu5, long paramLong, a parama) {
    paramLong = SystemClock.elapsedRealtime() - paramLong;
    c c = new c(paramLong, paramu5, parama);
    this.f.a(c, v5.g);
    e1 e1 = new e1();
    e1.a(paramu5);
    e1.a(Boolean.valueOf(g));
    e1.a(a8.a(h.a(parama), h.b(parama)));
    f1 f1 = e1.a();
    p7 p7 = d.a;
    this.f.a(f1, paramLong, v5.e1, p7);
  }
  
  public final a a(a parama) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: invokestatic elapsedRealtime : ()J
    //   5: lstore_2
    //   6: aload_0
    //   7: getfield d : Le/f/a/e/n/f/e;
    //   10: astore #5
    //   12: aload #5
    //   14: ifnull -> 177
    //   17: aload #5
    //   19: invokevirtual b : ()Z
    //   22: ifeq -> 156
    //   25: aload_1
    //   26: invokevirtual c : ()I
    //   29: iconst_m1
    //   30: if_icmpne -> 88
    //   33: new e/f/a/e/n/b$a
    //   36: dup
    //   37: invokespecial <init> : ()V
    //   40: astore #4
    //   42: aload_1
    //   43: invokevirtual a : ()Landroid/graphics/Bitmap;
    //   46: astore #6
    //   48: aload #6
    //   50: invokestatic a : (Ljava/lang/Object;)Ljava/lang/Object;
    //   53: pop
    //   54: aload #4
    //   56: aload #6
    //   58: checkcast android/graphics/Bitmap
    //   61: invokevirtual a : (Landroid/graphics/Bitmap;)Le/f/a/e/n/b$a;
    //   64: pop
    //   65: aload #4
    //   67: aload_1
    //   68: invokevirtual f : ()I
    //   71: invokestatic a : (I)I
    //   74: invokevirtual a : (I)Le/f/a/e/n/b$a;
    //   77: pop
    //   78: aload #4
    //   80: invokevirtual a : ()Le/f/a/e/n/b;
    //   83: astore #4
    //   85: goto -> 120
    //   88: new e/f/a/e/n/b$a
    //   91: dup
    //   92: invokespecial <init> : ()V
    //   95: astore #4
    //   97: aload #4
    //   99: invokestatic a : ()Lcom/google/mlkit/vision/common/internal/c;
    //   102: aload_1
    //   103: invokevirtual a : (Le/f/b/b/a/a;)Landroid/graphics/Bitmap;
    //   106: invokevirtual a : (Landroid/graphics/Bitmap;)Le/f/a/e/n/b$a;
    //   109: pop
    //   110: aload #4
    //   112: iconst_0
    //   113: invokevirtual a : (I)Le/f/a/e/n/b$a;
    //   116: pop
    //   117: goto -> 78
    //   120: aload #5
    //   122: aload #4
    //   124: invokevirtual a : (Le/f/a/e/n/b;)Landroid/util/SparseArray;
    //   127: astore #4
    //   129: aload_0
    //   130: getstatic e/f/a/e/i/k/u5.c : Le/f/a/e/i/k/u5;
    //   133: lload_2
    //   134: aload_1
    //   135: invokespecial a : (Le/f/a/e/i/k/u5;JLe/f/b/b/a/a;)V
    //   138: iconst_0
    //   139: putstatic com/google/mlkit/vision/text/internal/e.g : Z
    //   142: new e/f/b/b/b/a
    //   145: dup
    //   146: aload #4
    //   148: invokespecial <init> : (Landroid/util/SparseArray;)V
    //   151: astore_1
    //   152: aload_0
    //   153: monitorexit
    //   154: aload_1
    //   155: areturn
    //   156: aload_0
    //   157: getstatic e/f/a/e/i/k/u5.m : Le/f/a/e/i/k/u5;
    //   160: lload_2
    //   161: aload_1
    //   162: invokespecial a : (Le/f/a/e/i/k/u5;JLe/f/b/b/a/a;)V
    //   165: new e/f/b/a/a
    //   168: dup
    //   169: ldc 'Waiting for the text recognition model to be downloaded. Please wait.'
    //   171: bipush #14
    //   173: invokespecial <init> : (Ljava/lang/String;I)V
    //   176: athrow
    //   177: aload_0
    //   178: getstatic e/f/a/e/i/k/u5.D : Le/f/a/e/i/k/u5;
    //   181: lload_2
    //   182: aload_1
    //   183: invokespecial a : (Le/f/a/e/i/k/u5;JLe/f/b/b/a/a;)V
    //   186: new e/f/b/a/a
    //   189: dup
    //   190: ldc_w 'Model source is unavailable. Please load the model resource first.'
    //   193: bipush #13
    //   195: invokespecial <init> : (Ljava/lang/String;I)V
    //   198: athrow
    //   199: astore_1
    //   200: aload_0
    //   201: monitorexit
    //   202: goto -> 207
    //   205: aload_1
    //   206: athrow
    //   207: goto -> 205
    // Exception table:
    //   from	to	target	type
    //   2	12	199	finally
    //   17	78	199	finally
    //   78	85	199	finally
    //   88	117	199	finally
    //   120	152	199	finally
    //   156	177	199	finally
    //   177	199	199	finally
  }
  
  public final void a() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield d : Le/f/a/e/n/f/e;
    //   6: ifnonnull -> 30
    //   9: aload_0
    //   10: new e/f/a/e/n/f/e$a
    //   13: dup
    //   14: aload_0
    //   15: getfield e : Landroid/content/Context;
    //   18: invokespecial <init> : (Landroid/content/Context;)V
    //   21: invokevirtual a : ()Le/f/a/e/n/f/e;
    //   24: putfield d : Le/f/a/e/n/f/e;
    //   27: aload_0
    //   28: monitorexit
    //   29: return
    //   30: aload_0
    //   31: monitorexit
    //   32: return
    //   33: astore_1
    //   34: aload_0
    //   35: monitorexit
    //   36: aload_1
    //   37: athrow
    // Exception table:
    //   from	to	target	type
    //   2	27	33	finally
  }
  
  public final void c() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: iconst_1
    //   3: putstatic com/google/mlkit/vision/text/internal/e.g : Z
    //   6: aload_0
    //   7: getfield d : Le/f/a/e/n/f/e;
    //   10: astore_1
    //   11: aload_1
    //   12: ifnull -> 27
    //   15: aload_1
    //   16: invokevirtual a : ()V
    //   19: aload_0
    //   20: aconst_null
    //   21: putfield d : Le/f/a/e/n/f/e;
    //   24: aload_0
    //   25: monitorexit
    //   26: return
    //   27: aload_0
    //   28: monitorexit
    //   29: return
    //   30: astore_1
    //   31: aload_0
    //   32: monitorexit
    //   33: aload_1
    //   34: athrow
    // Exception table:
    //   from	to	target	type
    //   2	11	30	finally
    //   15	24	30	finally
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/mlkit/vision/text/internal/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */