package com.facebook.imagepipeline.memory;

import android.util.SparseArray;
import java.util.LinkedList;

public class g<T> {
  protected final SparseArray<b<T>> a = new SparseArray();
  
  b<T> b;
  
  b<T> c;
  
  private void a(b<T> paramb) {
    if (paramb != null && paramb.c.isEmpty()) {
      c(paramb);
      this.a.remove(paramb.b);
    } 
  }
  
  private void b(b<T> paramb) {
    if (this.b == paramb)
      return; 
    c(paramb);
    b<T> b1 = this.b;
    if (b1 == null) {
      this.b = paramb;
      this.c = paramb;
      return;
    } 
    paramb.d = b1;
    b1.a = paramb;
    this.b = paramb;
  }
  
  private void c(b<T> paramb) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_1
    //   3: getfield a : Lcom/facebook/imagepipeline/memory/g$b;
    //   6: astore_2
    //   7: aload_1
    //   8: getfield d : Lcom/facebook/imagepipeline/memory/g$b;
    //   11: astore_3
    //   12: aload_2
    //   13: ifnull -> 21
    //   16: aload_2
    //   17: aload_3
    //   18: putfield d : Lcom/facebook/imagepipeline/memory/g$b;
    //   21: aload_3
    //   22: ifnull -> 30
    //   25: aload_3
    //   26: aload_2
    //   27: putfield a : Lcom/facebook/imagepipeline/memory/g$b;
    //   30: aload_1
    //   31: aconst_null
    //   32: putfield a : Lcom/facebook/imagepipeline/memory/g$b;
    //   35: aload_1
    //   36: aconst_null
    //   37: putfield d : Lcom/facebook/imagepipeline/memory/g$b;
    //   40: aload_1
    //   41: aload_0
    //   42: getfield b : Lcom/facebook/imagepipeline/memory/g$b;
    //   45: if_acmpne -> 53
    //   48: aload_0
    //   49: aload_3
    //   50: putfield b : Lcom/facebook/imagepipeline/memory/g$b;
    //   53: aload_1
    //   54: aload_0
    //   55: getfield c : Lcom/facebook/imagepipeline/memory/g$b;
    //   58: if_acmpne -> 66
    //   61: aload_0
    //   62: aload_2
    //   63: putfield c : Lcom/facebook/imagepipeline/memory/g$b;
    //   66: aload_0
    //   67: monitorexit
    //   68: return
    //   69: astore_1
    //   70: aload_0
    //   71: monitorexit
    //   72: aload_1
    //   73: athrow
    // Exception table:
    //   from	to	target	type
    //   2	12	69	finally
    //   16	21	69	finally
    //   25	30	69	finally
    //   30	53	69	finally
    //   53	66	69	finally
  }
  
  public T a() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield c : Lcom/facebook/imagepipeline/memory/g$b;
    //   6: astore_1
    //   7: aload_1
    //   8: ifnonnull -> 15
    //   11: aload_0
    //   12: monitorexit
    //   13: aconst_null
    //   14: areturn
    //   15: aload_1
    //   16: getfield c : Ljava/util/LinkedList;
    //   19: invokevirtual pollLast : ()Ljava/lang/Object;
    //   22: astore_2
    //   23: aload_0
    //   24: aload_1
    //   25: invokespecial a : (Lcom/facebook/imagepipeline/memory/g$b;)V
    //   28: aload_0
    //   29: monitorexit
    //   30: aload_2
    //   31: areturn
    //   32: astore_1
    //   33: aload_0
    //   34: monitorexit
    //   35: aload_1
    //   36: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	32	finally
    //   15	28	32	finally
  }
  
  public T a(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield a : Landroid/util/SparseArray;
    //   6: iload_1
    //   7: invokevirtual get : (I)Ljava/lang/Object;
    //   10: checkcast com/facebook/imagepipeline/memory/g$b
    //   13: astore_2
    //   14: aload_2
    //   15: ifnonnull -> 22
    //   18: aload_0
    //   19: monitorexit
    //   20: aconst_null
    //   21: areturn
    //   22: aload_2
    //   23: getfield c : Ljava/util/LinkedList;
    //   26: invokevirtual pollFirst : ()Ljava/lang/Object;
    //   29: astore_3
    //   30: aload_0
    //   31: aload_2
    //   32: invokespecial b : (Lcom/facebook/imagepipeline/memory/g$b;)V
    //   35: aload_0
    //   36: monitorexit
    //   37: aload_3
    //   38: areturn
    //   39: astore_2
    //   40: aload_0
    //   41: monitorexit
    //   42: aload_2
    //   43: athrow
    // Exception table:
    //   from	to	target	type
    //   2	14	39	finally
    //   22	35	39	finally
  }
  
  public void a(int paramInt, T paramT) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield a : Landroid/util/SparseArray;
    //   6: iload_1
    //   7: invokevirtual get : (I)Ljava/lang/Object;
    //   10: checkcast com/facebook/imagepipeline/memory/g$b
    //   13: astore #4
    //   15: aload #4
    //   17: astore_3
    //   18: aload #4
    //   20: ifnonnull -> 51
    //   23: new com/facebook/imagepipeline/memory/g$b
    //   26: dup
    //   27: aconst_null
    //   28: iload_1
    //   29: new java/util/LinkedList
    //   32: dup
    //   33: invokespecial <init> : ()V
    //   36: aconst_null
    //   37: aconst_null
    //   38: invokespecial <init> : (Lcom/facebook/imagepipeline/memory/g$b;ILjava/util/LinkedList;Lcom/facebook/imagepipeline/memory/g$b;Lcom/facebook/imagepipeline/memory/g$a;)V
    //   41: astore_3
    //   42: aload_0
    //   43: getfield a : Landroid/util/SparseArray;
    //   46: iload_1
    //   47: aload_3
    //   48: invokevirtual put : (ILjava/lang/Object;)V
    //   51: aload_3
    //   52: getfield c : Ljava/util/LinkedList;
    //   55: aload_2
    //   56: invokevirtual addLast : (Ljava/lang/Object;)V
    //   59: aload_0
    //   60: aload_3
    //   61: invokespecial b : (Lcom/facebook/imagepipeline/memory/g$b;)V
    //   64: aload_0
    //   65: monitorexit
    //   66: return
    //   67: astore_2
    //   68: aload_0
    //   69: monitorexit
    //   70: aload_2
    //   71: athrow
    // Exception table:
    //   from	to	target	type
    //   2	15	67	finally
    //   23	51	67	finally
    //   51	64	67	finally
  }
  
  static class b<I> {
    b<I> a;
    
    int b;
    
    LinkedList<I> c;
    
    b<I> d;
    
    private b(b<I> param1b1, int param1Int, LinkedList<I> param1LinkedList, b<I> param1b2) {
      this.a = param1b1;
      this.b = param1Int;
      this.c = param1LinkedList;
      this.d = param1b2;
    }
    
    public String toString() {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("LinkedEntry(key: ");
      stringBuilder.append(this.b);
      stringBuilder.append(")");
      return stringBuilder.toString();
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/imagepipeline/memory/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */