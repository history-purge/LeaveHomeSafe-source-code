package com.swmansion.gesturehandler.react;

import android.util.SparseArray;
import android.view.View;
import e.h.a.b;
import e.h.a.e;
import java.util.ArrayList;

public class f implements e {
  private final SparseArray<b> a = new SparseArray();
  
  private final SparseArray<Integer> b = new SparseArray();
  
  private final SparseArray<ArrayList<b>> c = new SparseArray();
  
  private void a(int paramInt, b paramb) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield b : Landroid/util/SparseArray;
    //   6: aload_2
    //   7: invokevirtual m : ()I
    //   10: invokevirtual get : (I)Ljava/lang/Object;
    //   13: ifnonnull -> 83
    //   16: aload_0
    //   17: getfield b : Landroid/util/SparseArray;
    //   20: aload_2
    //   21: invokevirtual m : ()I
    //   24: iload_1
    //   25: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   28: invokevirtual put : (ILjava/lang/Object;)V
    //   31: aload_0
    //   32: getfield c : Landroid/util/SparseArray;
    //   35: iload_1
    //   36: invokevirtual get : (I)Ljava/lang/Object;
    //   39: checkcast java/util/ArrayList
    //   42: astore_3
    //   43: aload_3
    //   44: ifnonnull -> 74
    //   47: new java/util/ArrayList
    //   50: dup
    //   51: iconst_1
    //   52: invokespecial <init> : (I)V
    //   55: astore_3
    //   56: aload_3
    //   57: aload_2
    //   58: invokevirtual add : (Ljava/lang/Object;)Z
    //   61: pop
    //   62: aload_0
    //   63: getfield c : Landroid/util/SparseArray;
    //   66: iload_1
    //   67: aload_3
    //   68: invokevirtual put : (ILjava/lang/Object;)V
    //   71: goto -> 80
    //   74: aload_3
    //   75: aload_2
    //   76: invokevirtual add : (Ljava/lang/Object;)Z
    //   79: pop
    //   80: aload_0
    //   81: monitorexit
    //   82: return
    //   83: new java/lang/StringBuilder
    //   86: dup
    //   87: invokespecial <init> : ()V
    //   90: astore_3
    //   91: aload_3
    //   92: ldc 'Handler '
    //   94: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   97: pop
    //   98: aload_3
    //   99: aload_2
    //   100: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   103: pop
    //   104: aload_3
    //   105: ldc ' already attached'
    //   107: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   110: pop
    //   111: new java/lang/IllegalStateException
    //   114: dup
    //   115: aload_3
    //   116: invokevirtual toString : ()Ljava/lang/String;
    //   119: invokespecial <init> : (Ljava/lang/String;)V
    //   122: athrow
    //   123: astore_2
    //   124: aload_0
    //   125: monitorexit
    //   126: aload_2
    //   127: athrow
    // Exception table:
    //   from	to	target	type
    //   2	43	123	finally
    //   47	71	123	finally
    //   74	80	123	finally
    //   83	123	123	finally
  }
  
  private void b(b paramb) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield b : Landroid/util/SparseArray;
    //   6: aload_1
    //   7: invokevirtual m : ()I
    //   10: invokevirtual get : (I)Ljava/lang/Object;
    //   13: checkcast java/lang/Integer
    //   16: astore_2
    //   17: aload_2
    //   18: ifnull -> 75
    //   21: aload_0
    //   22: getfield b : Landroid/util/SparseArray;
    //   25: aload_1
    //   26: invokevirtual m : ()I
    //   29: invokevirtual remove : (I)V
    //   32: aload_0
    //   33: getfield c : Landroid/util/SparseArray;
    //   36: aload_2
    //   37: invokevirtual intValue : ()I
    //   40: invokevirtual get : (I)Ljava/lang/Object;
    //   43: checkcast java/util/ArrayList
    //   46: astore_3
    //   47: aload_3
    //   48: ifnull -> 75
    //   51: aload_3
    //   52: aload_1
    //   53: invokevirtual remove : (Ljava/lang/Object;)Z
    //   56: pop
    //   57: aload_3
    //   58: invokevirtual size : ()I
    //   61: ifne -> 75
    //   64: aload_0
    //   65: getfield c : Landroid/util/SparseArray;
    //   68: aload_2
    //   69: invokevirtual intValue : ()I
    //   72: invokevirtual remove : (I)V
    //   75: aload_1
    //   76: invokevirtual n : ()Landroid/view/View;
    //   79: ifnull -> 86
    //   82: aload_1
    //   83: invokevirtual c : ()V
    //   86: aload_0
    //   87: monitorexit
    //   88: return
    //   89: astore_1
    //   90: aload_0
    //   91: monitorexit
    //   92: aload_1
    //   93: athrow
    // Exception table:
    //   from	to	target	type
    //   2	17	89	finally
    //   21	47	89	finally
    //   51	75	89	finally
    //   75	86	89	finally
  }
  
  public ArrayList<b> a(View paramView) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_1
    //   4: invokevirtual getId : ()I
    //   7: invokevirtual c : (I)Ljava/util/ArrayList;
    //   10: astore_1
    //   11: aload_0
    //   12: monitorexit
    //   13: aload_1
    //   14: areturn
    //   15: astore_1
    //   16: aload_0
    //   17: monitorexit
    //   18: aload_1
    //   19: athrow
    // Exception table:
    //   from	to	target	type
    //   2	11	15	finally
  }
  
  public void a() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield a : Landroid/util/SparseArray;
    //   6: invokevirtual clear : ()V
    //   9: aload_0
    //   10: getfield b : Landroid/util/SparseArray;
    //   13: invokevirtual clear : ()V
    //   16: aload_0
    //   17: getfield c : Landroid/util/SparseArray;
    //   20: invokevirtual clear : ()V
    //   23: aload_0
    //   24: monitorexit
    //   25: return
    //   26: astore_1
    //   27: aload_0
    //   28: monitorexit
    //   29: aload_1
    //   30: athrow
    // Exception table:
    //   from	to	target	type
    //   2	23	26	finally
  }
  
  public void a(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield a : Landroid/util/SparseArray;
    //   6: iload_1
    //   7: invokevirtual get : (I)Ljava/lang/Object;
    //   10: checkcast e/h/a/b
    //   13: astore_2
    //   14: aload_2
    //   15: ifnull -> 31
    //   18: aload_0
    //   19: aload_2
    //   20: invokespecial b : (Le/h/a/b;)V
    //   23: aload_0
    //   24: getfield a : Landroid/util/SparseArray;
    //   27: iload_1
    //   28: invokevirtual remove : (I)V
    //   31: aload_0
    //   32: monitorexit
    //   33: return
    //   34: astore_2
    //   35: aload_0
    //   36: monitorexit
    //   37: aload_2
    //   38: athrow
    // Exception table:
    //   from	to	target	type
    //   2	14	34	finally
    //   18	31	34	finally
  }
  
  public void a(b paramb) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield a : Landroid/util/SparseArray;
    //   6: aload_1
    //   7: invokevirtual m : ()I
    //   10: aload_1
    //   11: invokevirtual put : (ILjava/lang/Object;)V
    //   14: aload_0
    //   15: monitorexit
    //   16: return
    //   17: astore_1
    //   18: aload_0
    //   19: monitorexit
    //   20: aload_1
    //   21: athrow
    // Exception table:
    //   from	to	target	type
    //   2	14	17	finally
  }
  
  public boolean a(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield a : Landroid/util/SparseArray;
    //   6: iload_1
    //   7: invokevirtual get : (I)Ljava/lang/Object;
    //   10: checkcast e/h/a/b
    //   13: astore #4
    //   15: aload #4
    //   17: ifnull -> 39
    //   20: aload_0
    //   21: aload #4
    //   23: invokespecial b : (Le/h/a/b;)V
    //   26: aload_0
    //   27: iload_2
    //   28: aload #4
    //   30: invokespecial a : (ILe/h/a/b;)V
    //   33: iconst_1
    //   34: istore_3
    //   35: aload_0
    //   36: monitorexit
    //   37: iload_3
    //   38: ireturn
    //   39: iconst_0
    //   40: istore_3
    //   41: goto -> 35
    //   44: astore #4
    //   46: aload_0
    //   47: monitorexit
    //   48: goto -> 54
    //   51: aload #4
    //   53: athrow
    //   54: goto -> 51
    // Exception table:
    //   from	to	target	type
    //   2	15	44	finally
    //   20	33	44	finally
  }
  
  public b b(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield a : Landroid/util/SparseArray;
    //   6: iload_1
    //   7: invokevirtual get : (I)Ljava/lang/Object;
    //   10: checkcast e/h/a/b
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
  
  public ArrayList<b> c(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield c : Landroid/util/SparseArray;
    //   6: iload_1
    //   7: invokevirtual get : (I)Ljava/lang/Object;
    //   10: checkcast java/util/ArrayList
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
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/swmansion/gesturehandler/react/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */