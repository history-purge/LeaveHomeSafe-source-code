package com.facebook.imagepipeline.memory;

import android.annotation.SuppressLint;
import android.util.SparseArray;
import android.util.SparseIntArray;
import e.e.e.d.i;
import e.e.e.d.k;
import e.e.e.g.e;
import java.util.Set;

public abstract class a<V> implements e<V> {
  private final Class<?> a = getClass();
  
  final e.e.e.g.c b;
  
  final g0 c;
  
  final SparseArray<f<V>> d;
  
  final Set<V> e;
  
  private boolean f;
  
  final a g;
  
  final a h;
  
  private final h0 i;
  
  public a(e.e.e.g.c paramc, g0 paramg0, h0 paramh0) {
    i.a(paramc);
    this.b = paramc;
    i.a(paramg0);
    this.c = paramg0;
    i.a(paramh0);
    this.i = paramh0;
    this.d = new SparseArray();
    if (this.c.d) {
      e();
    } else {
      b(new SparseIntArray(0));
    } 
    this.e = k.b();
    this.h = new a();
    this.g = new a();
  }
  
  private void a(SparseIntArray paramSparseIntArray) {
    this.d.clear();
    for (int i = 0; i < paramSparseIntArray.size(); i++) {
      int j = paramSparseIntArray.keyAt(i);
      int k = paramSparseIntArray.valueAt(i);
      this.d.put(j, new f(e(j), k, 0, this.c.d));
    } 
  }
  
  private void b(SparseIntArray paramSparseIntArray) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_1
    //   3: invokestatic a : (Ljava/lang/Object;)Ljava/lang/Object;
    //   6: pop
    //   7: aload_0
    //   8: getfield d : Landroid/util/SparseArray;
    //   11: invokevirtual clear : ()V
    //   14: aload_0
    //   15: getfield c : Lcom/facebook/imagepipeline/memory/g0;
    //   18: getfield c : Landroid/util/SparseIntArray;
    //   21: astore #6
    //   23: aload #6
    //   25: ifnull -> 108
    //   28: iconst_0
    //   29: istore_2
    //   30: iload_2
    //   31: aload #6
    //   33: invokevirtual size : ()I
    //   36: if_icmpge -> 100
    //   39: aload #6
    //   41: iload_2
    //   42: invokevirtual keyAt : (I)I
    //   45: istore_3
    //   46: aload #6
    //   48: iload_2
    //   49: invokevirtual valueAt : (I)I
    //   52: istore #4
    //   54: aload_1
    //   55: iload_3
    //   56: iconst_0
    //   57: invokevirtual get : (II)I
    //   60: istore #5
    //   62: aload_0
    //   63: getfield d : Landroid/util/SparseArray;
    //   66: iload_3
    //   67: new com/facebook/imagepipeline/memory/f
    //   70: dup
    //   71: aload_0
    //   72: iload_3
    //   73: invokevirtual e : (I)I
    //   76: iload #4
    //   78: iload #5
    //   80: aload_0
    //   81: getfield c : Lcom/facebook/imagepipeline/memory/g0;
    //   84: getfield d : Z
    //   87: invokespecial <init> : (IIIZ)V
    //   90: invokevirtual put : (ILjava/lang/Object;)V
    //   93: iload_2
    //   94: iconst_1
    //   95: iadd
    //   96: istore_2
    //   97: goto -> 30
    //   100: aload_0
    //   101: iconst_0
    //   102: putfield f : Z
    //   105: goto -> 113
    //   108: aload_0
    //   109: iconst_1
    //   110: putfield f : Z
    //   113: aload_0
    //   114: monitorexit
    //   115: return
    //   116: astore_1
    //   117: aload_0
    //   118: monitorexit
    //   119: goto -> 124
    //   122: aload_1
    //   123: athrow
    //   124: goto -> 122
    // Exception table:
    //   from	to	target	type
    //   2	23	116	finally
    //   30	93	116	finally
    //   100	105	116	finally
    //   108	113	116	finally
  }
  
  private void d() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokevirtual b : ()Z
    //   6: ifeq -> 39
    //   9: aload_0
    //   10: getfield h : Lcom/facebook/imagepipeline/memory/a$a;
    //   13: getfield b : I
    //   16: ifne -> 34
    //   19: goto -> 39
    //   22: iload_1
    //   23: invokestatic b : (Z)V
    //   26: aload_0
    //   27: monitorexit
    //   28: return
    //   29: astore_2
    //   30: aload_0
    //   31: monitorexit
    //   32: aload_2
    //   33: athrow
    //   34: iconst_0
    //   35: istore_1
    //   36: goto -> 22
    //   39: iconst_1
    //   40: istore_1
    //   41: goto -> 22
    // Exception table:
    //   from	to	target	type
    //   2	19	29	finally
    //   22	26	29	finally
  }
  
  private void e() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield c : Lcom/facebook/imagepipeline/memory/g0;
    //   6: getfield c : Landroid/util/SparseIntArray;
    //   9: astore_1
    //   10: aload_1
    //   11: ifnull -> 27
    //   14: aload_0
    //   15: aload_1
    //   16: invokespecial a : (Landroid/util/SparseIntArray;)V
    //   19: aload_0
    //   20: iconst_0
    //   21: putfield f : Z
    //   24: goto -> 32
    //   27: aload_0
    //   28: iconst_1
    //   29: putfield f : Z
    //   32: aload_0
    //   33: monitorexit
    //   34: return
    //   35: astore_1
    //   36: aload_0
    //   37: monitorexit
    //   38: aload_1
    //   39: athrow
    // Exception table:
    //   from	to	target	type
    //   2	10	35	finally
    //   14	24	35	finally
    //   27	32	35	finally
  }
  
  @SuppressLint({"InvalidAccessToGuardedField"})
  private void f() {
    if (e.e.e.e.a.a(2))
      e.e.e.e.a.a(this.a, "Used = (%d, %d); Free = (%d, %d)", Integer.valueOf(this.g.a), Integer.valueOf(this.g.b), Integer.valueOf(this.h.a), Integer.valueOf(this.h.b)); 
  }
  
  private f<V> h(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield d : Landroid/util/SparseArray;
    //   6: iload_1
    //   7: invokevirtual get : (I)Ljava/lang/Object;
    //   10: checkcast com/facebook/imagepipeline/memory/f
    //   13: astore_2
    //   14: aload_0
    //   15: monitorexit
    //   16: aload_2
    //   17: areturn
    //   18: astore_2
    //   19: aload_0
    //   20: monitorexit
    //   21: aload_2
    //   22: athrow
    // Exception table:
    //   from	to	target	type
    //   2	14	18	finally
  }
  
  protected abstract V a(int paramInt);
  
  protected V a(f<V> paramf) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_1
    //   3: invokevirtual b : ()Ljava/lang/Object;
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
  
  protected void a() {
    this.b.a((e.e.e.g.b)this);
    this.i.a(this);
  }
  
  public void a(V paramV) {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic a : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4: pop
    //   5: aload_0
    //   6: aload_1
    //   7: invokevirtual c : (Ljava/lang/Object;)I
    //   10: istore_2
    //   11: aload_0
    //   12: iload_2
    //   13: invokevirtual e : (I)I
    //   16: istore_3
    //   17: aload_0
    //   18: monitorenter
    //   19: aload_0
    //   20: iload_2
    //   21: invokespecial h : (I)Lcom/facebook/imagepipeline/memory/f;
    //   24: astore #4
    //   26: aload_0
    //   27: getfield e : Ljava/util/Set;
    //   30: aload_1
    //   31: invokeinterface remove : (Ljava/lang/Object;)Z
    //   36: ifne -> 89
    //   39: aload_0
    //   40: getfield a : Ljava/lang/Class;
    //   43: ldc 'release (free, value unrecognized) (object, size) = (%x, %s)'
    //   45: iconst_2
    //   46: anewarray java/lang/Object
    //   49: dup
    //   50: iconst_0
    //   51: aload_1
    //   52: invokestatic identityHashCode : (Ljava/lang/Object;)I
    //   55: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   58: aastore
    //   59: dup
    //   60: iconst_1
    //   61: iload_2
    //   62: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   65: aastore
    //   66: invokestatic a : (Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V
    //   69: aload_0
    //   70: aload_1
    //   71: invokevirtual b : (Ljava/lang/Object;)V
    //   74: aload_0
    //   75: getfield i : Lcom/facebook/imagepipeline/memory/h0;
    //   78: astore_1
    //   79: aload_1
    //   80: iload_3
    //   81: invokeinterface c : (I)V
    //   86: goto -> 240
    //   89: aload #4
    //   91: ifnull -> 182
    //   94: aload #4
    //   96: invokevirtual e : ()Z
    //   99: ifne -> 182
    //   102: aload_0
    //   103: invokevirtual b : ()Z
    //   106: ifne -> 182
    //   109: aload_0
    //   110: aload_1
    //   111: invokevirtual d : (Ljava/lang/Object;)Z
    //   114: ifne -> 120
    //   117: goto -> 182
    //   120: aload #4
    //   122: aload_1
    //   123: invokevirtual b : (Ljava/lang/Object;)V
    //   126: aload_0
    //   127: getfield h : Lcom/facebook/imagepipeline/memory/a$a;
    //   130: iload_3
    //   131: invokevirtual b : (I)V
    //   134: aload_0
    //   135: getfield g : Lcom/facebook/imagepipeline/memory/a$a;
    //   138: iload_3
    //   139: invokevirtual a : (I)V
    //   142: aload_0
    //   143: getfield i : Lcom/facebook/imagepipeline/memory/h0;
    //   146: iload_3
    //   147: invokeinterface d : (I)V
    //   152: iconst_2
    //   153: invokestatic a : (I)Z
    //   156: ifeq -> 240
    //   159: aload_0
    //   160: getfield a : Ljava/lang/Class;
    //   163: ldc 'release (reuse) (object, size) = (%x, %s)'
    //   165: aload_1
    //   166: invokestatic identityHashCode : (Ljava/lang/Object;)I
    //   169: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   172: iload_2
    //   173: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   176: invokestatic a : (Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   179: goto -> 240
    //   182: aload #4
    //   184: ifnull -> 192
    //   187: aload #4
    //   189: invokevirtual a : ()V
    //   192: iconst_2
    //   193: invokestatic a : (I)Z
    //   196: ifeq -> 219
    //   199: aload_0
    //   200: getfield a : Ljava/lang/Class;
    //   203: ldc 'release (free) (object, size) = (%x, %s)'
    //   205: aload_1
    //   206: invokestatic identityHashCode : (Ljava/lang/Object;)I
    //   209: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   212: iload_2
    //   213: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   216: invokestatic a : (Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   219: aload_0
    //   220: aload_1
    //   221: invokevirtual b : (Ljava/lang/Object;)V
    //   224: aload_0
    //   225: getfield g : Lcom/facebook/imagepipeline/memory/a$a;
    //   228: iload_3
    //   229: invokevirtual a : (I)V
    //   232: aload_0
    //   233: getfield i : Lcom/facebook/imagepipeline/memory/h0;
    //   236: astore_1
    //   237: goto -> 79
    //   240: aload_0
    //   241: invokespecial f : ()V
    //   244: aload_0
    //   245: monitorexit
    //   246: return
    //   247: astore_1
    //   248: aload_0
    //   249: monitorexit
    //   250: goto -> 255
    //   253: aload_1
    //   254: athrow
    //   255: goto -> 253
    // Exception table:
    //   from	to	target	type
    //   19	79	247	finally
    //   79	86	247	finally
    //   94	117	247	finally
    //   120	179	247	finally
    //   187	192	247	finally
    //   192	219	247	finally
    //   219	237	247	finally
    //   240	246	247	finally
    //   248	250	247	finally
  }
  
  protected abstract void b(V paramV);
  
  boolean b() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield g : Lcom/facebook/imagepipeline/memory/a$a;
    //   6: getfield b : I
    //   9: aload_0
    //   10: getfield h : Lcom/facebook/imagepipeline/memory/a$a;
    //   13: getfield b : I
    //   16: iadd
    //   17: aload_0
    //   18: getfield c : Lcom/facebook/imagepipeline/memory/g0;
    //   21: getfield b : I
    //   24: if_icmple -> 54
    //   27: iconst_1
    //   28: istore_1
    //   29: goto -> 32
    //   32: iload_1
    //   33: ifeq -> 45
    //   36: aload_0
    //   37: getfield i : Lcom/facebook/imagepipeline/memory/h0;
    //   40: invokeinterface b : ()V
    //   45: aload_0
    //   46: monitorexit
    //   47: iload_1
    //   48: ireturn
    //   49: astore_2
    //   50: aload_0
    //   51: monitorexit
    //   52: aload_2
    //   53: athrow
    //   54: iconst_0
    //   55: istore_1
    //   56: goto -> 32
    // Exception table:
    //   from	to	target	type
    //   2	27	49	finally
    //   36	45	49	finally
  }
  
  boolean b(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield c : Lcom/facebook/imagepipeline/memory/g0;
    //   6: getfield a : I
    //   9: istore_2
    //   10: iload_1
    //   11: iload_2
    //   12: aload_0
    //   13: getfield g : Lcom/facebook/imagepipeline/memory/a$a;
    //   16: getfield b : I
    //   19: isub
    //   20: if_icmple -> 36
    //   23: aload_0
    //   24: getfield i : Lcom/facebook/imagepipeline/memory/h0;
    //   27: invokeinterface a : ()V
    //   32: aload_0
    //   33: monitorexit
    //   34: iconst_0
    //   35: ireturn
    //   36: aload_0
    //   37: getfield c : Lcom/facebook/imagepipeline/memory/g0;
    //   40: getfield b : I
    //   43: istore_3
    //   44: iload_1
    //   45: iload_3
    //   46: aload_0
    //   47: getfield g : Lcom/facebook/imagepipeline/memory/a$a;
    //   50: getfield b : I
    //   53: aload_0
    //   54: getfield h : Lcom/facebook/imagepipeline/memory/a$a;
    //   57: getfield b : I
    //   60: iadd
    //   61: isub
    //   62: if_icmple -> 72
    //   65: aload_0
    //   66: iload_3
    //   67: iload_1
    //   68: isub
    //   69: invokevirtual g : (I)V
    //   72: iload_1
    //   73: iload_2
    //   74: aload_0
    //   75: getfield g : Lcom/facebook/imagepipeline/memory/a$a;
    //   78: getfield b : I
    //   81: aload_0
    //   82: getfield h : Lcom/facebook/imagepipeline/memory/a$a;
    //   85: getfield b : I
    //   88: iadd
    //   89: isub
    //   90: if_icmple -> 106
    //   93: aload_0
    //   94: getfield i : Lcom/facebook/imagepipeline/memory/h0;
    //   97: invokeinterface a : ()V
    //   102: aload_0
    //   103: monitorexit
    //   104: iconst_0
    //   105: ireturn
    //   106: aload_0
    //   107: monitorexit
    //   108: iconst_1
    //   109: ireturn
    //   110: astore #4
    //   112: aload_0
    //   113: monitorexit
    //   114: aload #4
    //   116: athrow
    // Exception table:
    //   from	to	target	type
    //   2	32	110	finally
    //   36	72	110	finally
    //   72	102	110	finally
  }
  
  protected abstract int c(V paramV);
  
  f<V> c(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield d : Landroid/util/SparseArray;
    //   6: iload_1
    //   7: invokevirtual get : (I)Ljava/lang/Object;
    //   10: checkcast com/facebook/imagepipeline/memory/f
    //   13: astore_2
    //   14: aload_2
    //   15: ifnonnull -> 67
    //   18: aload_0
    //   19: getfield f : Z
    //   22: ifne -> 28
    //   25: goto -> 67
    //   28: iconst_2
    //   29: invokestatic a : (I)Z
    //   32: ifeq -> 48
    //   35: aload_0
    //   36: getfield a : Ljava/lang/Class;
    //   39: ldc 'creating new bucket %s'
    //   41: iload_1
    //   42: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   45: invokestatic b : (Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)V
    //   48: aload_0
    //   49: iload_1
    //   50: invokevirtual f : (I)Lcom/facebook/imagepipeline/memory/f;
    //   53: astore_2
    //   54: aload_0
    //   55: getfield d : Landroid/util/SparseArray;
    //   58: iload_1
    //   59: aload_2
    //   60: invokevirtual put : (ILjava/lang/Object;)V
    //   63: aload_0
    //   64: monitorexit
    //   65: aload_2
    //   66: areturn
    //   67: aload_0
    //   68: monitorexit
    //   69: aload_2
    //   70: areturn
    //   71: astore_2
    //   72: aload_0
    //   73: monitorexit
    //   74: aload_2
    //   75: athrow
    // Exception table:
    //   from	to	target	type
    //   2	14	71	finally
    //   18	25	71	finally
    //   28	48	71	finally
    //   48	63	71	finally
  }
  
  void c() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokevirtual b : ()Z
    //   6: ifeq -> 20
    //   9: aload_0
    //   10: aload_0
    //   11: getfield c : Lcom/facebook/imagepipeline/memory/g0;
    //   14: getfield b : I
    //   17: invokevirtual g : (I)V
    //   20: aload_0
    //   21: monitorexit
    //   22: return
    //   23: astore_1
    //   24: aload_0
    //   25: monitorexit
    //   26: aload_1
    //   27: athrow
    // Exception table:
    //   from	to	target	type
    //   2	20	23	finally
  }
  
  protected abstract int d(int paramInt);
  
  protected boolean d(V paramV) {
    i.a(paramV);
    return true;
  }
  
  protected abstract int e(int paramInt);
  
  f<V> f(int paramInt) {
    return new f<V>(e(paramInt), 2147483647, 0, this.c.d);
  }
  
  void g(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield g : Lcom/facebook/imagepipeline/memory/a$a;
    //   6: getfield b : I
    //   9: aload_0
    //   10: getfield h : Lcom/facebook/imagepipeline/memory/a$a;
    //   13: getfield b : I
    //   16: iadd
    //   17: iload_1
    //   18: isub
    //   19: aload_0
    //   20: getfield h : Lcom/facebook/imagepipeline/memory/a$a;
    //   23: getfield b : I
    //   26: invokestatic min : (II)I
    //   29: istore_3
    //   30: iload_3
    //   31: ifgt -> 37
    //   34: aload_0
    //   35: monitorexit
    //   36: return
    //   37: iconst_2
    //   38: invokestatic a : (I)Z
    //   41: ifeq -> 79
    //   44: aload_0
    //   45: getfield a : Ljava/lang/Class;
    //   48: ldc 'trimToSize: TargetSize = %d; Initial Size = %d; Bytes to free = %d'
    //   50: iload_1
    //   51: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   54: aload_0
    //   55: getfield g : Lcom/facebook/imagepipeline/memory/a$a;
    //   58: getfield b : I
    //   61: aload_0
    //   62: getfield h : Lcom/facebook/imagepipeline/memory/a$a;
    //   65: getfield b : I
    //   68: iadd
    //   69: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   72: iload_3
    //   73: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   76: invokestatic a : (Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   79: aload_0
    //   80: invokespecial f : ()V
    //   83: iconst_0
    //   84: istore_2
    //   85: iload_2
    //   86: aload_0
    //   87: getfield d : Landroid/util/SparseArray;
    //   90: invokevirtual size : ()I
    //   93: if_icmpge -> 164
    //   96: iload_3
    //   97: ifgt -> 103
    //   100: goto -> 164
    //   103: aload_0
    //   104: getfield d : Landroid/util/SparseArray;
    //   107: iload_2
    //   108: invokevirtual valueAt : (I)Ljava/lang/Object;
    //   111: checkcast com/facebook/imagepipeline/memory/f
    //   114: astore #4
    //   116: iload_3
    //   117: ifle -> 223
    //   120: aload #4
    //   122: invokevirtual f : ()Ljava/lang/Object;
    //   125: astore #5
    //   127: aload #5
    //   129: ifnonnull -> 135
    //   132: goto -> 223
    //   135: aload_0
    //   136: aload #5
    //   138: invokevirtual b : (Ljava/lang/Object;)V
    //   141: iload_3
    //   142: aload #4
    //   144: getfield a : I
    //   147: isub
    //   148: istore_3
    //   149: aload_0
    //   150: getfield h : Lcom/facebook/imagepipeline/memory/a$a;
    //   153: aload #4
    //   155: getfield a : I
    //   158: invokevirtual a : (I)V
    //   161: goto -> 116
    //   164: aload_0
    //   165: invokespecial f : ()V
    //   168: iconst_2
    //   169: invokestatic a : (I)Z
    //   172: ifeq -> 207
    //   175: aload_0
    //   176: getfield a : Ljava/lang/Class;
    //   179: ldc_w 'trimToSize: TargetSize = %d; Final Size = %d'
    //   182: iload_1
    //   183: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   186: aload_0
    //   187: getfield g : Lcom/facebook/imagepipeline/memory/a$a;
    //   190: getfield b : I
    //   193: aload_0
    //   194: getfield h : Lcom/facebook/imagepipeline/memory/a$a;
    //   197: getfield b : I
    //   200: iadd
    //   201: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   204: invokestatic a : (Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   207: aload_0
    //   208: monitorexit
    //   209: return
    //   210: astore #4
    //   212: aload_0
    //   213: monitorexit
    //   214: goto -> 220
    //   217: aload #4
    //   219: athrow
    //   220: goto -> 217
    //   223: iload_2
    //   224: iconst_1
    //   225: iadd
    //   226: istore_2
    //   227: goto -> 85
    // Exception table:
    //   from	to	target	type
    //   2	30	210	finally
    //   37	79	210	finally
    //   79	83	210	finally
    //   85	96	210	finally
    //   103	116	210	finally
    //   120	127	210	finally
    //   135	161	210	finally
    //   164	207	210	finally
  }
  
  public V get(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial d : ()V
    //   4: aload_0
    //   5: iload_1
    //   6: invokevirtual d : (I)I
    //   9: istore_1
    //   10: aload_0
    //   11: monitorenter
    //   12: aload_0
    //   13: iload_1
    //   14: invokevirtual c : (I)Lcom/facebook/imagepipeline/memory/f;
    //   17: astore_3
    //   18: aload_3
    //   19: ifnull -> 125
    //   22: aload_0
    //   23: aload_3
    //   24: invokevirtual a : (Lcom/facebook/imagepipeline/memory/f;)Ljava/lang/Object;
    //   27: astore #4
    //   29: aload #4
    //   31: ifnull -> 125
    //   34: aload_0
    //   35: getfield e : Ljava/util/Set;
    //   38: aload #4
    //   40: invokeinterface add : (Ljava/lang/Object;)Z
    //   45: invokestatic b : (Z)V
    //   48: aload_0
    //   49: aload #4
    //   51: invokevirtual c : (Ljava/lang/Object;)I
    //   54: istore_1
    //   55: aload_0
    //   56: iload_1
    //   57: invokevirtual e : (I)I
    //   60: istore_2
    //   61: aload_0
    //   62: getfield g : Lcom/facebook/imagepipeline/memory/a$a;
    //   65: iload_2
    //   66: invokevirtual b : (I)V
    //   69: aload_0
    //   70: getfield h : Lcom/facebook/imagepipeline/memory/a$a;
    //   73: iload_2
    //   74: invokevirtual a : (I)V
    //   77: aload_0
    //   78: getfield i : Lcom/facebook/imagepipeline/memory/h0;
    //   81: iload_2
    //   82: invokeinterface b : (I)V
    //   87: aload_0
    //   88: invokespecial f : ()V
    //   91: iconst_2
    //   92: invokestatic a : (I)Z
    //   95: ifeq -> 120
    //   98: aload_0
    //   99: getfield a : Ljava/lang/Class;
    //   102: ldc_w 'get (reuse) (object, size) = (%x, %s)'
    //   105: aload #4
    //   107: invokestatic identityHashCode : (Ljava/lang/Object;)I
    //   110: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   113: iload_1
    //   114: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   117: invokestatic a : (Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   120: aload_0
    //   121: monitorexit
    //   122: aload #4
    //   124: areturn
    //   125: aload_0
    //   126: iload_1
    //   127: invokevirtual e : (I)I
    //   130: istore_2
    //   131: aload_0
    //   132: iload_2
    //   133: invokevirtual b : (I)Z
    //   136: ifeq -> 283
    //   139: aload_0
    //   140: getfield g : Lcom/facebook/imagepipeline/memory/a$a;
    //   143: iload_2
    //   144: invokevirtual b : (I)V
    //   147: aload_3
    //   148: ifnull -> 155
    //   151: aload_3
    //   152: invokevirtual d : ()V
    //   155: aload_0
    //   156: monitorexit
    //   157: aconst_null
    //   158: astore_3
    //   159: aload_0
    //   160: iload_1
    //   161: invokevirtual a : (I)Ljava/lang/Object;
    //   164: astore #4
    //   166: aload #4
    //   168: astore_3
    //   169: goto -> 208
    //   172: astore #4
    //   174: aload_0
    //   175: monitorenter
    //   176: aload_0
    //   177: getfield g : Lcom/facebook/imagepipeline/memory/a$a;
    //   180: iload_2
    //   181: invokevirtual a : (I)V
    //   184: aload_0
    //   185: iload_1
    //   186: invokevirtual c : (I)Lcom/facebook/imagepipeline/memory/f;
    //   189: astore #5
    //   191: aload #5
    //   193: ifnull -> 201
    //   196: aload #5
    //   198: invokevirtual a : ()V
    //   201: aload_0
    //   202: monitorexit
    //   203: aload #4
    //   205: invokestatic b : (Ljava/lang/Throwable;)V
    //   208: aload_0
    //   209: monitorenter
    //   210: aload_0
    //   211: getfield e : Ljava/util/Set;
    //   214: aload_3
    //   215: invokeinterface add : (Ljava/lang/Object;)Z
    //   220: invokestatic b : (Z)V
    //   223: aload_0
    //   224: invokevirtual c : ()V
    //   227: aload_0
    //   228: getfield i : Lcom/facebook/imagepipeline/memory/h0;
    //   231: iload_2
    //   232: invokeinterface a : (I)V
    //   237: aload_0
    //   238: invokespecial f : ()V
    //   241: iconst_2
    //   242: invokestatic a : (I)Z
    //   245: ifeq -> 269
    //   248: aload_0
    //   249: getfield a : Ljava/lang/Class;
    //   252: ldc_w 'get (alloc) (object, size) = (%x, %s)'
    //   255: aload_3
    //   256: invokestatic identityHashCode : (Ljava/lang/Object;)I
    //   259: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   262: iload_1
    //   263: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   266: invokestatic a : (Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   269: aload_0
    //   270: monitorexit
    //   271: aload_3
    //   272: areturn
    //   273: astore_3
    //   274: aload_0
    //   275: monitorexit
    //   276: aload_3
    //   277: athrow
    //   278: astore_3
    //   279: aload_0
    //   280: monitorexit
    //   281: aload_3
    //   282: athrow
    //   283: new com/facebook/imagepipeline/memory/a$c
    //   286: dup
    //   287: aload_0
    //   288: getfield c : Lcom/facebook/imagepipeline/memory/g0;
    //   291: getfield a : I
    //   294: aload_0
    //   295: getfield g : Lcom/facebook/imagepipeline/memory/a$a;
    //   298: getfield b : I
    //   301: aload_0
    //   302: getfield h : Lcom/facebook/imagepipeline/memory/a$a;
    //   305: getfield b : I
    //   308: iload_2
    //   309: invokespecial <init> : (IIII)V
    //   312: athrow
    //   313: astore_3
    //   314: aload_0
    //   315: monitorexit
    //   316: aload_3
    //   317: athrow
    // Exception table:
    //   from	to	target	type
    //   12	18	313	finally
    //   22	29	313	finally
    //   34	120	313	finally
    //   120	122	313	finally
    //   125	147	313	finally
    //   151	155	313	finally
    //   155	157	313	finally
    //   159	166	172	finally
    //   176	191	278	finally
    //   196	201	278	finally
    //   201	203	278	finally
    //   210	269	273	finally
    //   269	271	273	finally
    //   274	276	273	finally
    //   279	281	278	finally
    //   283	313	313	finally
    //   314	316	313	finally
  }
  
  static class a {
    int a;
    
    int b;
    
    public void a(int param1Int) {
      int i = this.b;
      if (i >= param1Int) {
        int j = this.a;
        if (j > 0) {
          this.a = j - 1;
          this.b = i - param1Int;
          return;
        } 
      } 
      e.e.e.e.a.d("com.facebook.imagepipeline.memory.BasePool.Counter", "Unexpected decrement of %d. Current numBytes = %d, count = %d", new Object[] { Integer.valueOf(param1Int), Integer.valueOf(this.b), Integer.valueOf(this.a) });
    }
    
    public void b(int param1Int) {
      this.a++;
      this.b += param1Int;
    }
  }
  
  public static class b extends RuntimeException {
    public b(Object param1Object) {
      super(stringBuilder.toString());
    }
  }
  
  public static class c extends RuntimeException {
    public c(int param1Int1, int param1Int2, int param1Int3, int param1Int4) {
      super(stringBuilder.toString());
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/imagepipeline/memory/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */