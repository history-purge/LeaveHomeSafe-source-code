package e.f.a.e.i.d;

import java.util.Collections;
import java.util.List;

final class x1 extends v1 {
  private static final Class<?> c = Collections.unmodifiableList(Collections.emptyList()).getClass();
  
  private x1() {
    super(null);
  }
  
  private static <E> List<E> b(Object paramObject, long paramLong) {
    return (List<E>)a4.f(paramObject, paramLong);
  }
  
  final void a(Object paramObject, long paramLong) {
    List<?> list = (List)a4.f(paramObject, paramLong);
    if (list instanceof u1) {
      list = ((u1)list).z();
    } else {
      if (c.isAssignableFrom(list.getClass()))
        return; 
      list = Collections.unmodifiableList(list);
    } 
    a4.a(paramObject, paramLong, list);
  }
  
  final <E> void a(Object paramObject1, Object paramObject2, long paramLong) {
    // Byte code:
    //   0: aload_2
    //   1: lload_3
    //   2: invokestatic b : (Ljava/lang/Object;J)Ljava/util/List;
    //   5: astore #7
    //   7: aload #7
    //   9: invokeinterface size : ()I
    //   14: istore #5
    //   16: aload_1
    //   17: lload_3
    //   18: invokestatic b : (Ljava/lang/Object;J)Ljava/util/List;
    //   21: astore #8
    //   23: aload #8
    //   25: invokeinterface isEmpty : ()Z
    //   30: ifeq -> 73
    //   33: aload #8
    //   35: instanceof e/f/a/e/i/d/u1
    //   38: ifeq -> 54
    //   41: new e/f/a/e/i/d/t1
    //   44: dup
    //   45: iload #5
    //   47: invokespecial <init> : (I)V
    //   50: astore_2
    //   51: goto -> 64
    //   54: new java/util/ArrayList
    //   57: dup
    //   58: iload #5
    //   60: invokespecial <init> : (I)V
    //   63: astore_2
    //   64: aload_1
    //   65: lload_3
    //   66: aload_2
    //   67: invokestatic a : (Ljava/lang/Object;JLjava/lang/Object;)V
    //   70: goto -> 163
    //   73: getstatic e/f/a/e/i/d/x1.c : Ljava/lang/Class;
    //   76: aload #8
    //   78: invokevirtual getClass : ()Ljava/lang/Class;
    //   81: invokevirtual isAssignableFrom : (Ljava/lang/Class;)Z
    //   84: ifeq -> 121
    //   87: new java/util/ArrayList
    //   90: dup
    //   91: aload #8
    //   93: invokeinterface size : ()I
    //   98: iload #5
    //   100: iadd
    //   101: invokespecial <init> : (I)V
    //   104: astore_2
    //   105: aload_2
    //   106: aload #8
    //   108: invokevirtual addAll : (Ljava/util/Collection;)Z
    //   111: pop
    //   112: aload_1
    //   113: lload_3
    //   114: aload_2
    //   115: invokestatic a : (Ljava/lang/Object;JLjava/lang/Object;)V
    //   118: goto -> 163
    //   121: aload #8
    //   123: astore_2
    //   124: aload #8
    //   126: instanceof e/f/a/e/i/d/x3
    //   129: ifeq -> 163
    //   132: new e/f/a/e/i/d/t1
    //   135: dup
    //   136: aload #8
    //   138: invokeinterface size : ()I
    //   143: iload #5
    //   145: iadd
    //   146: invokespecial <init> : (I)V
    //   149: astore_2
    //   150: aload_2
    //   151: aload #8
    //   153: checkcast e/f/a/e/i/d/x3
    //   156: invokevirtual addAll : (Ljava/util/Collection;)Z
    //   159: pop
    //   160: goto -> 112
    //   163: aload_2
    //   164: invokeinterface size : ()I
    //   169: istore #5
    //   171: aload #7
    //   173: invokeinterface size : ()I
    //   178: istore #6
    //   180: iload #5
    //   182: ifle -> 199
    //   185: iload #6
    //   187: ifle -> 199
    //   190: aload_2
    //   191: aload #7
    //   193: invokeinterface addAll : (Ljava/util/Collection;)Z
    //   198: pop
    //   199: iload #5
    //   201: ifle -> 207
    //   204: aload_2
    //   205: astore #7
    //   207: aload_1
    //   208: lload_3
    //   209: aload #7
    //   211: invokestatic a : (Ljava/lang/Object;JLjava/lang/Object;)V
    //   214: return
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/d/x1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */