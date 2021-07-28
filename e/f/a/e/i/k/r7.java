package e.f.a.e.i.k;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.common.internal.n;
import e.f.a.e.m.l;
import e.f.b.a.c.c;
import e.f.b.a.c.g;
import e.f.b.a.c.m;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public final class r7 {
  private static r<String> j;
  
  private final String a;
  
  private final String b;
  
  private final m c;
  
  private final l<String> d;
  
  private final l<String> e;
  
  private final String f;
  
  private final Map<v5, Long> g = new HashMap<v5, Long>();
  
  private final Map<v5, t<Object, Long>> h = new HashMap<v5, t<Object, Long>>();
  
  private final w7 i;
  
  public r7(Context paramContext, m paramm, w7 paramw7, String paramString, byte[] paramArrayOfbyte) {
    this.a = paramContext.getPackageName();
    this.b = c.a(paramContext);
    this.c = paramm;
    this.i = paramw7;
    this.f = paramString;
    this.d = g.a().a(new m7(paramString));
    g g = g.a();
    paramm.getClass();
    this.e = g.a(n7.a(paramm));
  }
  
  static long a(List<Long> paramList, double paramDouble) {
    paramDouble /= 100.0D;
    double d = paramList.size();
    Double.isNaN(d);
    return ((Long)paramList.get(Math.max((int)Math.ceil(paramDouble * d) - 1, 0))).longValue();
  }
  
  private static r<String> a() {
    // Byte code:
    //   0: ldc e/f/a/e/i/k/r7
    //   2: monitorenter
    //   3: getstatic e/f/a/e/i/k/r7.j : Le/f/a/e/i/k/r;
    //   6: ifnull -> 18
    //   9: getstatic e/f/a/e/i/k/r7.j : Le/f/a/e/i/k/r;
    //   12: astore_1
    //   13: ldc e/f/a/e/i/k/r7
    //   15: monitorexit
    //   16: aload_1
    //   17: areturn
    //   18: invokestatic getSystem : ()Landroid/content/res/Resources;
    //   21: invokevirtual getConfiguration : ()Landroid/content/res/Configuration;
    //   24: invokestatic a : (Landroid/content/res/Configuration;)Lb/g/j/c;
    //   27: astore_1
    //   28: new e/f/a/e/i/k/o
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
    //   55: invokevirtual b : (Ljava/lang/Object;)Le/f/a/e/i/k/o;
    //   58: pop
    //   59: iload_0
    //   60: iconst_1
    //   61: iadd
    //   62: istore_0
    //   63: goto -> 38
    //   66: aload_2
    //   67: invokevirtual a : ()Le/f/a/e/i/k/r;
    //   70: astore_1
    //   71: aload_1
    //   72: putstatic e/f/a/e/i/k/r7.j : Le/f/a/e/i/k/r;
    //   75: ldc e/f/a/e/i/k/r7
    //   77: monitorexit
    //   78: aload_1
    //   79: areturn
    //   80: astore_1
    //   81: ldc e/f/a/e/i/k/r7
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
  
  private final boolean a(v5 paramv5, long paramLong1, long paramLong2) {
    return (this.g.get(paramv5) == null) ? true : ((paramLong1 - ((Long)this.g.get(paramv5)).longValue() > TimeUnit.SECONDS.toMillis(30L)));
  }
  
  public final void a(l7 paraml7, v5 paramv5) {
    g.b().execute(new o7(this, paraml7, paramv5, null));
  }
  
  public final void a(q7 paramq7, v5 paramv5) {
    long l1 = SystemClock.elapsedRealtime();
    if (!a(paramv5, l1, 30L))
      return; 
    this.g.put(paramv5, Long.valueOf(l1));
    a(paramq7.zza(), paramv5);
  }
  
  public final <K> void a(K paramK, long paramLong, v5 paramv5, p7<K> paramp7) {
    // Byte code:
    //   0: aload_0
    //   1: getfield h : Ljava/util/Map;
    //   4: aload #4
    //   6: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   11: ifne -> 29
    //   14: aload_0
    //   15: getfield h : Ljava/util/Map;
    //   18: aload #4
    //   20: invokestatic g : ()Le/f/a/e/i/k/p8;
    //   23: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   28: pop
    //   29: aload_0
    //   30: getfield h : Ljava/util/Map;
    //   33: aload #4
    //   35: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   40: checkcast e/f/a/e/i/k/t
    //   43: astore #5
    //   45: aload #5
    //   47: aload_1
    //   48: lload_2
    //   49: invokestatic valueOf : (J)Ljava/lang/Long;
    //   52: invokeinterface a : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   57: pop
    //   58: invokestatic elapsedRealtime : ()J
    //   61: lstore_2
    //   62: aload_0
    //   63: aload #4
    //   65: lload_2
    //   66: ldc2_w 30
    //   69: invokespecial a : (Le/f/a/e/i/k/v5;JJ)Z
    //   72: ifne -> 76
    //   75: return
    //   76: aload_0
    //   77: getfield g : Ljava/util/Map;
    //   80: aload #4
    //   82: lload_2
    //   83: invokestatic valueOf : (J)Ljava/lang/Long;
    //   86: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   91: pop
    //   92: aload #5
    //   94: invokeinterface a : ()Ljava/util/Set;
    //   99: invokeinterface iterator : ()Ljava/util/Iterator;
    //   104: astore_1
    //   105: aload_1
    //   106: invokeinterface hasNext : ()Z
    //   111: ifeq -> 399
    //   114: aload_1
    //   115: invokeinterface next : ()Ljava/lang/Object;
    //   120: astore #7
    //   122: aload #5
    //   124: aload #7
    //   126: invokeinterface b : (Ljava/lang/Object;)Ljava/util/List;
    //   131: astore #8
    //   133: aload #8
    //   135: invokestatic sort : (Ljava/util/List;)V
    //   138: new e/f/a/e/i/k/g5
    //   141: dup
    //   142: invokespecial <init> : ()V
    //   145: astore #9
    //   147: aload #8
    //   149: invokeinterface iterator : ()Ljava/util/Iterator;
    //   154: astore #10
    //   156: lconst_0
    //   157: lstore_2
    //   158: aload #10
    //   160: invokeinterface hasNext : ()Z
    //   165: ifeq -> 187
    //   168: lload_2
    //   169: aload #10
    //   171: invokeinterface next : ()Ljava/lang/Object;
    //   176: checkcast java/lang/Long
    //   179: invokevirtual longValue : ()J
    //   182: ladd
    //   183: lstore_2
    //   184: goto -> 158
    //   187: aload #9
    //   189: lload_2
    //   190: aload #8
    //   192: invokeinterface size : ()I
    //   197: i2l
    //   198: ldiv
    //   199: invokestatic valueOf : (J)Ljava/lang/Long;
    //   202: invokevirtual c : (Ljava/lang/Long;)Le/f/a/e/i/k/g5;
    //   205: pop
    //   206: aload #9
    //   208: aload #8
    //   210: ldc2_w 100.0
    //   213: invokestatic a : (Ljava/util/List;D)J
    //   216: invokestatic valueOf : (J)Ljava/lang/Long;
    //   219: invokevirtual a : (Ljava/lang/Long;)Le/f/a/e/i/k/g5;
    //   222: pop
    //   223: aload #9
    //   225: aload #8
    //   227: ldc2_w 75.0
    //   230: invokestatic a : (Ljava/util/List;D)J
    //   233: invokestatic valueOf : (J)Ljava/lang/Long;
    //   236: invokevirtual f : (Ljava/lang/Long;)Le/f/a/e/i/k/g5;
    //   239: pop
    //   240: aload #9
    //   242: aload #8
    //   244: ldc2_w 50.0
    //   247: invokestatic a : (Ljava/util/List;D)J
    //   250: invokestatic valueOf : (J)Ljava/lang/Long;
    //   253: invokevirtual e : (Ljava/lang/Long;)Le/f/a/e/i/k/g5;
    //   256: pop
    //   257: aload #9
    //   259: aload #8
    //   261: ldc2_w 25.0
    //   264: invokestatic a : (Ljava/util/List;D)J
    //   267: invokestatic valueOf : (J)Ljava/lang/Long;
    //   270: invokevirtual d : (Ljava/lang/Long;)Le/f/a/e/i/k/g5;
    //   273: pop
    //   274: aload #9
    //   276: aload #8
    //   278: dconst_0
    //   279: invokestatic a : (Ljava/util/List;D)J
    //   282: invokestatic valueOf : (J)Ljava/lang/Long;
    //   285: invokevirtual b : (Ljava/lang/Long;)Le/f/a/e/i/k/g5;
    //   288: pop
    //   289: aload #9
    //   291: invokevirtual a : ()Le/f/a/e/i/k/h5;
    //   294: astore #8
    //   296: aload #5
    //   298: aload #7
    //   300: invokeinterface b : (Ljava/lang/Object;)Ljava/util/List;
    //   305: invokeinterface size : ()I
    //   310: istore #6
    //   312: aload #7
    //   314: checkcast e/f/a/e/i/k/f1
    //   317: astore #7
    //   319: new e/f/a/e/i/k/x5
    //   322: dup
    //   323: invokespecial <init> : ()V
    //   326: astore #9
    //   328: aload #9
    //   330: iconst_0
    //   331: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   334: invokevirtual a : (Ljava/lang/Boolean;)Le/f/a/e/i/k/x5;
    //   337: pop
    //   338: new e/f/a/e/i/k/d1
    //   341: dup
    //   342: invokespecial <init> : ()V
    //   345: astore #10
    //   347: aload #10
    //   349: iload #6
    //   351: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   354: invokevirtual a : (Ljava/lang/Integer;)Le/f/a/e/i/k/d1;
    //   357: pop
    //   358: aload #10
    //   360: aload #7
    //   362: invokevirtual a : (Le/f/a/e/i/k/f1;)Le/f/a/e/i/k/d1;
    //   365: pop
    //   366: aload #10
    //   368: aload #8
    //   370: invokevirtual a : (Le/f/a/e/i/k/h5;)Le/f/a/e/i/k/d1;
    //   373: pop
    //   374: aload #9
    //   376: aload #10
    //   378: invokevirtual a : ()Le/f/a/e/i/k/g1;
    //   381: invokevirtual a : (Le/f/a/e/i/k/g1;)Le/f/a/e/i/k/x5;
    //   384: pop
    //   385: aload_0
    //   386: aload #9
    //   388: invokestatic a : (Le/f/a/e/i/k/x5;)Le/f/a/e/i/k/l7;
    //   391: aload #4
    //   393: invokevirtual a : (Le/f/a/e/i/k/l7;Le/f/a/e/i/k/v5;)V
    //   396: goto -> 105
    //   399: aload_0
    //   400: getfield h : Ljava/util/Map;
    //   403: aload #4
    //   405: invokeinterface remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   410: pop
    //   411: return
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/k/r7.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */