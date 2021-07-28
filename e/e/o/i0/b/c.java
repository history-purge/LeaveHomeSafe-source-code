package e.e.o.i0.b;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;

public class c {
  private static volatile c b;
  
  private Map<String, Integer> a = new HashMap<String, Integer>();
  
  public static c a() {
    // Byte code:
    //   0: getstatic e/e/o/i0/b/c.b : Le/e/o/i0/b/c;
    //   3: ifnonnull -> 37
    //   6: ldc e/e/o/i0/b/c
    //   8: monitorenter
    //   9: getstatic e/e/o/i0/b/c.b : Le/e/o/i0/b/c;
    //   12: ifnonnull -> 25
    //   15: new e/e/o/i0/b/c
    //   18: dup
    //   19: invokespecial <init> : ()V
    //   22: putstatic e/e/o/i0/b/c.b : Le/e/o/i0/b/c;
    //   25: ldc e/e/o/i0/b/c
    //   27: monitorexit
    //   28: goto -> 37
    //   31: astore_0
    //   32: ldc e/e/o/i0/b/c
    //   34: monitorexit
    //   35: aload_0
    //   36: athrow
    //   37: getstatic e/e/o/i0/b/c.b : Le/e/o/i0/b/c;
    //   40: areturn
    // Exception table:
    //   from	to	target	type
    //   9	25	31	finally
    //   25	28	31	finally
    //   32	35	31	finally
  }
  
  public Drawable a(Context paramContext, String paramString) {
    int i = b(paramContext, paramString);
    return (i > 0) ? paramContext.getResources().getDrawable(i) : null;
  }
  
  public int b(Context paramContext, String paramString) {
    // Byte code:
    //   0: aload_2
    //   1: ifnull -> 108
    //   4: aload_2
    //   5: invokevirtual isEmpty : ()Z
    //   8: ifeq -> 14
    //   11: goto -> 108
    //   14: aload_2
    //   15: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   18: ldc '-'
    //   20: ldc '_'
    //   22: invokevirtual replace : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   25: astore_2
    //   26: aload_2
    //   27: invokestatic parseInt : (Ljava/lang/String;)I
    //   30: istore_3
    //   31: iload_3
    //   32: ireturn
    //   33: aload_0
    //   34: monitorenter
    //   35: aload_0
    //   36: getfield a : Ljava/util/Map;
    //   39: aload_2
    //   40: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   45: ifeq -> 69
    //   48: aload_0
    //   49: getfield a : Ljava/util/Map;
    //   52: aload_2
    //   53: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   58: checkcast java/lang/Integer
    //   61: invokevirtual intValue : ()I
    //   64: istore_3
    //   65: aload_0
    //   66: monitorexit
    //   67: iload_3
    //   68: ireturn
    //   69: aload_1
    //   70: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   73: aload_2
    //   74: ldc 'drawable'
    //   76: aload_1
    //   77: invokevirtual getPackageName : ()Ljava/lang/String;
    //   80: invokevirtual getIdentifier : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
    //   83: istore_3
    //   84: aload_0
    //   85: getfield a : Ljava/util/Map;
    //   88: aload_2
    //   89: iload_3
    //   90: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   93: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   98: pop
    //   99: aload_0
    //   100: monitorexit
    //   101: iload_3
    //   102: ireturn
    //   103: astore_1
    //   104: aload_0
    //   105: monitorexit
    //   106: aload_1
    //   107: athrow
    //   108: iconst_0
    //   109: ireturn
    //   110: astore #4
    //   112: goto -> 33
    // Exception table:
    //   from	to	target	type
    //   26	31	110	java/lang/NumberFormatException
    //   35	67	103	finally
    //   69	101	103	finally
    //   104	106	103	finally
  }
  
  public Uri c(Context paramContext, String paramString) {
    int i = b(paramContext, paramString);
    return (i > 0) ? (new Uri.Builder()).scheme("res").path(String.valueOf(i)).build() : Uri.EMPTY;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/o/i0/b/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */