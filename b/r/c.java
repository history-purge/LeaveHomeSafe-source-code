package b.r;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import java.lang.reflect.Method;

class c {
  private static Method a;
  
  private static Method b;
  
  private static boolean c;
  
  @SuppressLint({"SoonBlockedPrivateApi"})
  static void a(Canvas paramCanvas, boolean paramBoolean) {
    // Byte code:
    //   0: getstatic android/os/Build$VERSION.SDK_INT : I
    //   3: istore_2
    //   4: iload_2
    //   5: bipush #21
    //   7: if_icmpge -> 11
    //   10: return
    //   11: iload_2
    //   12: bipush #29
    //   14: if_icmplt -> 31
    //   17: iload_1
    //   18: ifeq -> 26
    //   21: aload_0
    //   22: invokevirtual enableZ : ()V
    //   25: return
    //   26: aload_0
    //   27: invokevirtual disableZ : ()V
    //   30: return
    //   31: iload_2
    //   32: bipush #28
    //   34: if_icmpeq -> 150
    //   37: getstatic b/r/c.c : Z
    //   40: ifne -> 89
    //   43: ldc android/graphics/Canvas
    //   45: ldc 'insertReorderBarrier'
    //   47: iconst_0
    //   48: anewarray java/lang/Class
    //   51: invokevirtual getDeclaredMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   54: putstatic b/r/c.a : Ljava/lang/reflect/Method;
    //   57: getstatic b/r/c.a : Ljava/lang/reflect/Method;
    //   60: iconst_1
    //   61: invokevirtual setAccessible : (Z)V
    //   64: ldc android/graphics/Canvas
    //   66: ldc 'insertInorderBarrier'
    //   68: iconst_0
    //   69: anewarray java/lang/Class
    //   72: invokevirtual getDeclaredMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   75: putstatic b/r/c.b : Ljava/lang/reflect/Method;
    //   78: getstatic b/r/c.b : Ljava/lang/reflect/Method;
    //   81: iconst_1
    //   82: invokevirtual setAccessible : (Z)V
    //   85: iconst_1
    //   86: putstatic b/r/c.c : Z
    //   89: iload_1
    //   90: ifeq -> 114
    //   93: getstatic b/r/c.a : Ljava/lang/reflect/Method;
    //   96: ifnull -> 114
    //   99: getstatic b/r/c.a : Ljava/lang/reflect/Method;
    //   102: aload_0
    //   103: iconst_0
    //   104: anewarray java/lang/Object
    //   107: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   110: pop
    //   111: goto -> 114
    //   114: iload_1
    //   115: ifne -> 149
    //   118: getstatic b/r/c.b : Ljava/lang/reflect/Method;
    //   121: ifnull -> 149
    //   124: getstatic b/r/c.b : Ljava/lang/reflect/Method;
    //   127: aload_0
    //   128: iconst_0
    //   129: anewarray java/lang/Object
    //   132: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   135: pop
    //   136: return
    //   137: new java/lang/RuntimeException
    //   140: dup
    //   141: aload_0
    //   142: invokevirtual getCause : ()Ljava/lang/Throwable;
    //   145: invokespecial <init> : (Ljava/lang/Throwable;)V
    //   148: athrow
    //   149: return
    //   150: new java/lang/IllegalStateException
    //   153: dup
    //   154: ldc 'This method doesn't work on Pie!'
    //   156: invokespecial <init> : (Ljava/lang/String;)V
    //   159: athrow
    //   160: astore_3
    //   161: goto -> 85
    //   164: astore_0
    //   165: return
    //   166: astore_0
    //   167: goto -> 137
    // Exception table:
    //   from	to	target	type
    //   43	85	160	java/lang/NoSuchMethodException
    //   93	111	164	java/lang/IllegalAccessException
    //   93	111	166	java/lang/reflect/InvocationTargetException
    //   118	136	164	java/lang/IllegalAccessException
    //   118	136	166	java/lang/reflect/InvocationTargetException
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/r/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */