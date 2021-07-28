package b.i.b;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class b {
  private static int a(int paramInt1, int paramInt2) {
    return paramInt1 * 13 * paramInt1 + paramInt2 * paramInt2;
  }
  
  public static <L, T> T a(L paramL, b<L, T> paramb, a<T> parama, T paramT, int paramInt, boolean paramBoolean1, boolean paramBoolean2) {
    int j = paramb.a(paramL);
    ArrayList<?> arrayList = new ArrayList(j);
    int i;
    for (i = 0; i < j; i++)
      arrayList.add(paramb.a(paramL, i)); 
    Collections.sort(arrayList, new c(paramBoolean1, parama));
    if (paramInt != 1) {
      if (paramInt == 2)
        return a(paramT, (ArrayList)arrayList, paramBoolean2); 
      throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
    } 
    return b(paramT, (ArrayList)arrayList, paramBoolean2);
  }
  
  public static <L, T> T a(L paramL, b<L, T> paramb, a<T> parama, T paramT, Rect paramRect, int paramInt) {
    T t;
    Rect rect1 = new Rect(paramRect);
    byte b1 = 0;
    if (paramInt != 17) {
      int k;
      if (paramInt != 33) {
        if (paramInt != 66) {
          if (paramInt == 130) {
            k = -(paramRect.height() + 1);
          } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
          } 
        } else {
          k = -(paramRect.width() + 1);
          rect1.offset(k, 0);
        } 
      } else {
        k = paramRect.height() + 1;
      } 
      rect1.offset(0, k);
    } else {
      int k = paramRect.width() + 1;
      rect1.offset(k, 0);
    } 
    Object object = null;
    int j = paramb.a(paramL);
    Rect rect2 = new Rect();
    int i;
    for (i = b1; i < j; i++) {
      T t1 = paramb.a(paramL, i);
      if (t1 != paramT) {
        parama.a(t1, rect2);
        if (b(paramInt, paramRect, rect2, rect1)) {
          rect1.set(rect2);
          t = t1;
        } 
      } 
    } 
    return t;
  }
  
  private static <T> T a(T paramT, ArrayList<T> paramArrayList, boolean paramBoolean) {
    int i;
    int j = paramArrayList.size();
    if (paramT == null) {
      i = -1;
    } else {
      i = paramArrayList.lastIndexOf(paramT);
    } 
    return (++i < j) ? paramArrayList.get(i) : ((paramBoolean && j > 0) ? paramArrayList.get(0) : null);
  }
  
  private static boolean a(int paramInt, Rect paramRect1, Rect paramRect2) {
    // Byte code:
    //   0: iload_0
    //   1: bipush #17
    //   3: if_icmpeq -> 64
    //   6: iload_0
    //   7: bipush #33
    //   9: if_icmpeq -> 38
    //   12: iload_0
    //   13: bipush #66
    //   15: if_icmpeq -> 64
    //   18: iload_0
    //   19: sipush #130
    //   22: if_icmpne -> 28
    //   25: goto -> 38
    //   28: new java/lang/IllegalArgumentException
    //   31: dup
    //   32: ldc 'direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.'
    //   34: invokespecial <init> : (Ljava/lang/String;)V
    //   37: athrow
    //   38: aload_2
    //   39: getfield right : I
    //   42: aload_1
    //   43: getfield left : I
    //   46: if_icmplt -> 62
    //   49: aload_2
    //   50: getfield left : I
    //   53: aload_1
    //   54: getfield right : I
    //   57: if_icmpgt -> 62
    //   60: iconst_1
    //   61: ireturn
    //   62: iconst_0
    //   63: ireturn
    //   64: aload_2
    //   65: getfield bottom : I
    //   68: aload_1
    //   69: getfield top : I
    //   72: if_icmplt -> 88
    //   75: aload_2
    //   76: getfield top : I
    //   79: aload_1
    //   80: getfield bottom : I
    //   83: if_icmpgt -> 88
    //   86: iconst_1
    //   87: ireturn
    //   88: iconst_0
    //   89: ireturn
  }
  
  private static boolean a(int paramInt, Rect paramRect1, Rect paramRect2, Rect paramRect3) {
    boolean bool = a(paramInt, paramRect1, paramRect2);
    if (!a(paramInt, paramRect1, paramRect3)) {
      if (!bool)
        return false; 
      boolean bool1 = b(paramInt, paramRect1, paramRect3);
      bool = true;
      if (!bool1)
        return true; 
      if (paramInt != 17) {
        if (paramInt == 66)
          return true; 
        if (c(paramInt, paramRect1, paramRect2) < e(paramInt, paramRect1, paramRect3))
          return true; 
        bool = false;
      } 
      return bool;
    } 
    return false;
  }
  
  private static boolean a(Rect paramRect1, Rect paramRect2, int paramInt) {
    if (paramInt != 17) {
      if (paramInt != 33) {
        if (paramInt != 66) {
          if (paramInt == 130) {
            paramInt = paramRect1.top;
            int m = paramRect2.top;
            return ((paramInt < m || paramRect1.bottom <= m) && paramRect1.bottom < paramRect2.bottom);
          } 
          throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        } 
        paramInt = paramRect1.left;
        int k = paramRect2.left;
        return ((paramInt < k || paramRect1.right <= k) && paramRect1.right < paramRect2.right);
      } 
      paramInt = paramRect1.bottom;
      int j = paramRect2.bottom;
      return ((paramInt > j || paramRect1.top >= j) && paramRect1.top > paramRect2.top);
    } 
    paramInt = paramRect1.right;
    int i = paramRect2.right;
    return ((paramInt > i || paramRect1.left >= i) && paramRect1.left > paramRect2.left);
  }
  
  private static <T> T b(T paramT, ArrayList<T> paramArrayList, boolean paramBoolean) {
    int i;
    int j = paramArrayList.size();
    if (paramT == null) {
      i = j;
    } else {
      i = paramArrayList.indexOf(paramT);
    } 
    return (--i >= 0) ? paramArrayList.get(i) : ((paramBoolean && j > 0) ? paramArrayList.get(j - 1) : null);
  }
  
  private static boolean b(int paramInt, Rect paramRect1, Rect paramRect2) {
    if (paramInt != 17) {
      if (paramInt != 33) {
        if (paramInt != 66) {
          if (paramInt == 130)
            return (paramRect1.bottom <= paramRect2.top); 
          throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        } 
        return (paramRect1.right <= paramRect2.left);
      } 
      return (paramRect1.top >= paramRect2.bottom);
    } 
    return (paramRect1.left >= paramRect2.right);
  }
  
  private static boolean b(int paramInt, Rect paramRect1, Rect paramRect2, Rect paramRect3) {
    boolean bool1 = a(paramRect1, paramRect2, paramInt);
    boolean bool = false;
    if (!bool1)
      return false; 
    if (!a(paramRect1, paramRect3, paramInt))
      return true; 
    if (a(paramInt, paramRect1, paramRect2, paramRect3))
      return true; 
    if (a(paramInt, paramRect1, paramRect3, paramRect2))
      return false; 
    if (a(c(paramInt, paramRect1, paramRect2), g(paramInt, paramRect1, paramRect2)) < a(c(paramInt, paramRect1, paramRect3), g(paramInt, paramRect1, paramRect3)))
      bool = true; 
    return bool;
  }
  
  private static int c(int paramInt, Rect paramRect1, Rect paramRect2) {
    return Math.max(0, d(paramInt, paramRect1, paramRect2));
  }
  
  private static int d(int paramInt, Rect paramRect1, Rect paramRect2) {
    if (paramInt != 17) {
      if (paramInt != 33) {
        if (paramInt != 66) {
          if (paramInt == 130) {
            paramInt = paramRect2.top;
            int m = paramRect1.bottom;
            return paramInt - m;
          } 
          throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        } 
        paramInt = paramRect2.left;
        int k = paramRect1.right;
        return paramInt - k;
      } 
      paramInt = paramRect1.top;
      int j = paramRect2.bottom;
      return paramInt - j;
    } 
    paramInt = paramRect1.left;
    int i = paramRect2.right;
    return paramInt - i;
  }
  
  private static int e(int paramInt, Rect paramRect1, Rect paramRect2) {
    return Math.max(1, f(paramInt, paramRect1, paramRect2));
  }
  
  private static int f(int paramInt, Rect paramRect1, Rect paramRect2) {
    if (paramInt != 17) {
      if (paramInt != 33) {
        if (paramInt != 66) {
          if (paramInt == 130) {
            paramInt = paramRect2.bottom;
            int m = paramRect1.bottom;
            return paramInt - m;
          } 
          throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        } 
        paramInt = paramRect2.right;
        int k = paramRect1.right;
        return paramInt - k;
      } 
      paramInt = paramRect1.top;
      int j = paramRect2.top;
      return paramInt - j;
    } 
    paramInt = paramRect1.left;
    int i = paramRect2.left;
    return paramInt - i;
  }
  
  private static int g(int paramInt, Rect paramRect1, Rect paramRect2) {
    // Byte code:
    //   0: iload_0
    //   1: bipush #17
    //   3: if_icmpeq -> 73
    //   6: iload_0
    //   7: bipush #33
    //   9: if_icmpeq -> 38
    //   12: iload_0
    //   13: bipush #66
    //   15: if_icmpeq -> 73
    //   18: iload_0
    //   19: sipush #130
    //   22: if_icmpne -> 28
    //   25: goto -> 38
    //   28: new java/lang/IllegalArgumentException
    //   31: dup
    //   32: ldc 'direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.'
    //   34: invokespecial <init> : (Ljava/lang/String;)V
    //   37: athrow
    //   38: aload_1
    //   39: getfield left : I
    //   42: aload_1
    //   43: invokevirtual width : ()I
    //   46: iconst_2
    //   47: idiv
    //   48: iadd
    //   49: istore_0
    //   50: aload_2
    //   51: getfield left : I
    //   54: istore_3
    //   55: aload_2
    //   56: invokevirtual width : ()I
    //   59: istore #4
    //   61: iload_0
    //   62: iload_3
    //   63: iload #4
    //   65: iconst_2
    //   66: idiv
    //   67: iadd
    //   68: isub
    //   69: invokestatic abs : (I)I
    //   72: ireturn
    //   73: aload_1
    //   74: getfield top : I
    //   77: aload_1
    //   78: invokevirtual height : ()I
    //   81: iconst_2
    //   82: idiv
    //   83: iadd
    //   84: istore_0
    //   85: aload_2
    //   86: getfield top : I
    //   89: istore_3
    //   90: aload_2
    //   91: invokevirtual height : ()I
    //   94: istore #4
    //   96: goto -> 61
  }
  
  public static interface a<T> {
    void a(T param1T, Rect param1Rect);
  }
  
  public static interface b<T, V> {
    int a(T param1T);
    
    V a(T param1T, int param1Int);
  }
  
  private static class c<T> implements Comparator<T> {
    private final Rect c = new Rect();
    
    private final Rect d = new Rect();
    
    private final boolean e;
    
    private final b.a<T> f;
    
    c(boolean param1Boolean, b.a<T> param1a) {
      this.e = param1Boolean;
      this.f = param1a;
    }
    
    public int compare(T param1T1, T param1T2) {
      Rect rect1 = this.c;
      Rect rect2 = this.d;
      this.f.a(param1T1, rect1);
      this.f.a(param1T2, rect2);
      int i = rect1.top;
      int j = rect2.top;
      byte b = -1;
      if (i < j)
        return -1; 
      if (i > j)
        return 1; 
      i = rect1.left;
      j = rect2.left;
      if (i < j) {
        if (this.e)
          b = 1; 
        return b;
      } 
      if (i > j)
        return this.e ? -1 : 1; 
      i = rect1.bottom;
      j = rect2.bottom;
      if (i < j)
        return -1; 
      if (i > j)
        return 1; 
      i = rect1.right;
      j = rect2.right;
      if (i < j) {
        if (this.e)
          b = 1; 
        return b;
      } 
      return (i > j) ? (this.e ? -1 : 1) : 0;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/i/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */