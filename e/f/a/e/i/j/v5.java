package e.f.a.e.i.j;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.common.internal.n;
import e.f.a.e.m.l;
import e.f.b.a.c.c;
import e.f.b.a.c.g;
import e.f.b.a.c.m;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public final class v5 {
  private static o6<String> i;
  
  private final String a;
  
  private final String b;
  
  private final m c;
  
  private final l<String> d;
  
  private final l<String> e;
  
  private final String f;
  
  private final Map<c4, Long> g = new HashMap<c4, Long>();
  
  private final a6 h;
  
  public v5(Context paramContext, m paramm, a6 parama6, String paramString, byte[] paramArrayOfbyte) {
    new HashMap<Object, Object>();
    this.a = paramContext.getPackageName();
    this.b = c.a(paramContext);
    this.c = paramm;
    this.h = parama6;
    this.f = paramString;
    this.d = g.a().a(new r5(paramString));
    g g = g.a();
    paramm.getClass();
    this.e = g.a(s5.a(paramm));
  }
  
  private static o6<String> a() {
    // Byte code:
    //   0: ldc e/f/a/e/i/j/v5
    //   2: monitorenter
    //   3: getstatic e/f/a/e/i/j/v5.i : Le/f/a/e/i/j/o6;
    //   6: ifnull -> 18
    //   9: getstatic e/f/a/e/i/j/v5.i : Le/f/a/e/i/j/o6;
    //   12: astore_1
    //   13: ldc e/f/a/e/i/j/v5
    //   15: monitorexit
    //   16: aload_1
    //   17: areturn
    //   18: invokestatic getSystem : ()Landroid/content/res/Resources;
    //   21: invokevirtual getConfiguration : ()Landroid/content/res/Configuration;
    //   24: invokestatic a : (Landroid/content/res/Configuration;)Lb/g/j/c;
    //   27: astore_1
    //   28: new e/f/a/e/i/j/l6
    //   31: dup
    //   32: invokespecial <init> : ()V
    //   35: astore_2
    //   36: iconst_0
    //   37: istore_0
    //   38: iload_0
    //   39: aload_1
    //   40: invokevirtual a : ()I
    //   43: if_icmpge -> 66
    //   46: aload_2
    //   47: aload_1
    //   48: iload_0
    //   49: invokevirtual a : (I)Ljava/util/Locale;
    //   52: invokestatic a : (Ljava/util/Locale;)Ljava/lang/String;
    //   55: invokevirtual b : (Ljava/lang/Object;)Le/f/a/e/i/j/l6;
    //   58: pop
    //   59: iload_0
    //   60: iconst_1
    //   61: iadd
    //   62: istore_0
    //   63: goto -> 38
    //   66: aload_2
    //   67: invokevirtual a : ()Le/f/a/e/i/j/o6;
    //   70: astore_1
    //   71: aload_1
    //   72: putstatic e/f/a/e/i/j/v5.i : Le/f/a/e/i/j/o6;
    //   75: ldc e/f/a/e/i/j/v5
    //   77: monitorexit
    //   78: aload_1
    //   79: areturn
    //   80: astore_1
    //   81: ldc e/f/a/e/i/j/v5
    //   83: monitorexit
    //   84: goto -> 89
    //   87: aload_1
    //   88: athrow
    //   89: goto -> 87
    // Exception table:
    //   from	to	target	type
    //   3	13	80	finally
    //   18	36	80	finally
    //   38	59	80	finally
    //   66	75	80	finally
  }
  
  public final void a(u5 paramu5, c4 paramc4) {
    long l1 = SystemClock.elapsedRealtime();
    if (this.g.get(paramc4) != null && l1 - ((Long)this.g.get(paramc4)).longValue() <= TimeUnit.SECONDS.toMillis(30L))
      return; 
    this.g.put(paramc4, Long.valueOf(l1));
    q5 q5 = paramu5.zza();
    g.b().execute(new t5(this, q5, paramc4, null));
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/j/v5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */