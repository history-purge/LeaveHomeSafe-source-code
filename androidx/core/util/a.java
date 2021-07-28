package androidx.core.util;

public class a {
  public static void a(Object paramObject, StringBuilder paramStringBuilder) {
    // Byte code:
    //   0: aload_0
    //   1: ifnonnull -> 14
    //   4: ldc 'null'
    //   6: astore_0
    //   7: aload_1
    //   8: aload_0
    //   9: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   12: pop
    //   13: return
    //   14: aload_0
    //   15: invokevirtual getClass : ()Ljava/lang/Class;
    //   18: invokevirtual getSimpleName : ()Ljava/lang/String;
    //   21: astore #4
    //   23: aload #4
    //   25: ifnull -> 39
    //   28: aload #4
    //   30: astore_3
    //   31: aload #4
    //   33: invokevirtual length : ()I
    //   36: ifgt -> 72
    //   39: aload_0
    //   40: invokevirtual getClass : ()Ljava/lang/Class;
    //   43: invokevirtual getName : ()Ljava/lang/String;
    //   46: astore #4
    //   48: aload #4
    //   50: bipush #46
    //   52: invokevirtual lastIndexOf : (I)I
    //   55: istore_2
    //   56: aload #4
    //   58: astore_3
    //   59: iload_2
    //   60: ifle -> 72
    //   63: aload #4
    //   65: iload_2
    //   66: iconst_1
    //   67: iadd
    //   68: invokevirtual substring : (I)Ljava/lang/String;
    //   71: astore_3
    //   72: aload_1
    //   73: aload_3
    //   74: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   77: pop
    //   78: aload_1
    //   79: bipush #123
    //   81: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   84: pop
    //   85: aload_0
    //   86: invokestatic identityHashCode : (Ljava/lang/Object;)I
    //   89: invokestatic toHexString : (I)Ljava/lang/String;
    //   92: astore_0
    //   93: goto -> 7
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/core/util/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */