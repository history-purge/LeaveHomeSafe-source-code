package com.facebook.react.views.scroll;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.q;
import java.util.Map;

public class f {
  public static Map<String, Integer> a() {
    return com.facebook.react.common.f.a("scrollTo", Integer.valueOf(1), "scrollToEnd", Integer.valueOf(2), "flashScrollIndicators", Integer.valueOf(3));
  }
  
  public static <T> void a(a<T> parama, T paramT, int paramInt, ReadableArray paramReadableArray) {
    e.e.m.a.a.a(parama);
    e.e.m.a.a.a(paramT);
    e.e.m.a.a.a(paramReadableArray);
    if (paramInt != 1) {
      if (paramInt != 2) {
        if (paramInt == 3) {
          parama.flashScrollIndicators(paramT);
          return;
        } 
        throw new IllegalArgumentException(String.format("Unsupported command %d received by %s.", new Object[] { Integer.valueOf(paramInt), parama.getClass().getSimpleName() }));
      } 
      b(parama, paramT, paramReadableArray);
      return;
    } 
    a(parama, paramT, paramReadableArray);
  }
  
  private static <T> void a(a<T> parama, T paramT, ReadableArray paramReadableArray) {
    parama.scrollTo(paramT, new b(Math.round(q.a(paramReadableArray.getDouble(0))), Math.round(q.a(paramReadableArray.getDouble(1))), paramReadableArray.getBoolean(2)));
  }
  
  public static <T> void a(a<T> parama, T paramT, String paramString, ReadableArray paramReadableArray) {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic a : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4: pop
    //   5: aload_1
    //   6: invokestatic a : (Ljava/lang/Object;)Ljava/lang/Object;
    //   9: pop
    //   10: aload_3
    //   11: invokestatic a : (Ljava/lang/Object;)Ljava/lang/Object;
    //   14: pop
    //   15: aload_2
    //   16: invokevirtual hashCode : ()I
    //   19: istore #4
    //   21: iload #4
    //   23: ldc -402165208
    //   25: if_icmpeq -> 75
    //   28: iload #4
    //   30: ldc 28425985
    //   32: if_icmpeq -> 60
    //   35: iload #4
    //   37: ldc 2055114131
    //   39: if_icmpeq -> 45
    //   42: goto -> 90
    //   45: aload_2
    //   46: ldc 'scrollToEnd'
    //   48: invokevirtual equals : (Ljava/lang/Object;)Z
    //   51: ifeq -> 90
    //   54: iconst_1
    //   55: istore #4
    //   57: goto -> 93
    //   60: aload_2
    //   61: ldc 'flashScrollIndicators'
    //   63: invokevirtual equals : (Ljava/lang/Object;)Z
    //   66: ifeq -> 90
    //   69: iconst_2
    //   70: istore #4
    //   72: goto -> 93
    //   75: aload_2
    //   76: ldc 'scrollTo'
    //   78: invokevirtual equals : (Ljava/lang/Object;)Z
    //   81: ifeq -> 90
    //   84: iconst_0
    //   85: istore #4
    //   87: goto -> 93
    //   90: iconst_m1
    //   91: istore #4
    //   93: iload #4
    //   95: ifeq -> 156
    //   98: iload #4
    //   100: iconst_1
    //   101: if_icmpeq -> 149
    //   104: iload #4
    //   106: iconst_2
    //   107: if_icmpne -> 118
    //   110: aload_0
    //   111: aload_1
    //   112: invokeinterface flashScrollIndicators : (Ljava/lang/Object;)V
    //   117: return
    //   118: new java/lang/IllegalArgumentException
    //   121: dup
    //   122: ldc 'Unsupported command %s received by %s.'
    //   124: iconst_2
    //   125: anewarray java/lang/Object
    //   128: dup
    //   129: iconst_0
    //   130: aload_2
    //   131: aastore
    //   132: dup
    //   133: iconst_1
    //   134: aload_0
    //   135: invokevirtual getClass : ()Ljava/lang/Class;
    //   138: invokevirtual getSimpleName : ()Ljava/lang/String;
    //   141: aastore
    //   142: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   145: invokespecial <init> : (Ljava/lang/String;)V
    //   148: athrow
    //   149: aload_0
    //   150: aload_1
    //   151: aload_3
    //   152: invokestatic b : (Lcom/facebook/react/views/scroll/f$a;Ljava/lang/Object;Lcom/facebook/react/bridge/ReadableArray;)V
    //   155: return
    //   156: aload_0
    //   157: aload_1
    //   158: aload_3
    //   159: invokestatic a : (Lcom/facebook/react/views/scroll/f$a;Ljava/lang/Object;Lcom/facebook/react/bridge/ReadableArray;)V
    //   162: return
  }
  
  private static <T> void b(a<T> parama, T paramT, ReadableArray paramReadableArray) {
    parama.scrollToEnd(paramT, new c(paramReadableArray.getBoolean(0)));
  }
  
  public static interface a<T> {
    void flashScrollIndicators(T param1T);
    
    void scrollTo(T param1T, f.b param1b);
    
    void scrollToEnd(T param1T, f.c param1c);
  }
  
  public static class b {
    public final int a;
    
    public final int b;
    
    public final boolean c;
    
    b(int param1Int1, int param1Int2, boolean param1Boolean) {
      this.a = param1Int1;
      this.b = param1Int2;
      this.c = param1Boolean;
    }
  }
  
  public static class c {
    public final boolean a;
    
    c(boolean param1Boolean) {
      this.a = param1Boolean;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/scroll/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */