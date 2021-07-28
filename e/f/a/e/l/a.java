package e.f.a.e.l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.common.util.m;
import com.google.android.gms.common.util.o;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

public class a {
  private static ScheduledExecutorService l;
  
  private final Object a = this;
  
  private final PowerManager.WakeLock b;
  
  private WorkSource c;
  
  private final int d;
  
  private final String e;
  
  private final String f;
  
  private final Context g;
  
  private boolean h = true;
  
  private final Map<String, Integer[]> i = (Map)new HashMap<String, Integer>();
  
  private int j;
  
  private AtomicInteger k;
  
  static {
    new b();
  }
  
  public a(Context paramContext, int paramInt, String paramString) {
    this(paramContext, paramInt, paramString, null, str);
  }
  
  private a(Context paramContext, int paramInt, String paramString1, String paramString2, String paramString3) {
    this(paramContext, paramInt, paramString1, null, paramString3, null);
  }
  
  @SuppressLint({"UnwrappedWakeLock"})
  private a(Context paramContext, int paramInt, String paramString1, String paramString2, String paramString3, String paramString4) {
    Collections.synchronizedSet(new HashSet());
    this.k = new AtomicInteger(0);
    q.a(paramContext, "WakeLock: context must not be null");
    q.a(paramString1, "WakeLock: wakeLockName must not be empty");
    this.d = paramInt;
    this.f = null;
    this.g = paramContext.getApplicationContext();
    if (!"com.google.android.gms".equals(paramContext.getPackageName())) {
      paramString2 = String.valueOf(paramString1);
      if (paramString2.length() != 0) {
        paramString2 = "*gcore*:".concat(paramString2);
      } else {
        paramString2 = new String("*gcore*:");
      } 
      this.e = paramString2;
    } else {
      this.e = paramString1;
    } 
    this.b = ((PowerManager)paramContext.getSystemService("power")).newWakeLock(paramInt, paramString1);
    if (o.a(paramContext)) {
      paramString1 = paramString3;
      if (m.a(paramString3))
        paramString1 = paramContext.getPackageName(); 
      this.c = o.a(paramContext, paramString1);
      WorkSource workSource = this.c;
      if (workSource != null && o.a(this.g)) {
        WorkSource workSource1 = this.c;
        if (workSource1 != null) {
          workSource1.add(workSource);
        } else {
          this.c = workSource;
        } 
        workSource = this.c;
        try {
          this.b.setWorkSource(workSource);
        } catch (IllegalArgumentException illegalArgumentException) {
          Log.wtf("WakeLock", illegalArgumentException.toString());
        } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {}
      } 
    } 
    if (l == null)
      l = e.f.a.e.e.l.a.a().a(); 
  }
  
  private final String a(String paramString) {
    return this.h ? (!TextUtils.isEmpty(paramString) ? paramString : this.f) : this.f;
  }
  
  private final void a(int paramInt) {
    if (this.b.isHeld()) {
      try {
        this.b.release();
      } catch (RuntimeException runtimeException) {
        if (runtimeException.getClass().equals(RuntimeException.class)) {
          Log.e("WakeLock", String.valueOf(this.e).concat(" was already released!"), runtimeException);
        } else {
          throw runtimeException;
        } 
      } 
      this.b.isHeld();
      return;
    } 
  }
  
  private final List<String> b() {
    return o.a(this.c);
  }
  
  public void a() {
    // Byte code:
    //   0: aload_0
    //   1: getfield k : Ljava/util/concurrent/atomic/AtomicInteger;
    //   4: invokevirtual decrementAndGet : ()I
    //   7: ifge -> 28
    //   10: ldc 'WakeLock'
    //   12: aload_0
    //   13: getfield e : Ljava/lang/String;
    //   16: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   19: ldc ' release without a matched acquire!'
    //   21: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   24: invokestatic e : (Ljava/lang/String;Ljava/lang/String;)I
    //   27: pop
    //   28: aload_0
    //   29: aconst_null
    //   30: invokespecial a : (Ljava/lang/String;)Ljava/lang/String;
    //   33: astore_3
    //   34: aload_0
    //   35: getfield a : Ljava/lang/Object;
    //   38: astore_2
    //   39: aload_2
    //   40: monitorenter
    //   41: aload_0
    //   42: getfield h : Z
    //   45: ifeq -> 117
    //   48: aload_0
    //   49: getfield i : Ljava/util/Map;
    //   52: aload_3
    //   53: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   58: checkcast [Ljava/lang/Integer;
    //   61: astore #4
    //   63: aload #4
    //   65: ifnonnull -> 71
    //   68: goto -> 195
    //   71: aload #4
    //   73: iconst_0
    //   74: aaload
    //   75: invokevirtual intValue : ()I
    //   78: iconst_1
    //   79: if_icmpne -> 98
    //   82: aload_0
    //   83: getfield i : Ljava/util/Map;
    //   86: aload_3
    //   87: invokeinterface remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   92: pop
    //   93: iconst_1
    //   94: istore_1
    //   95: goto -> 197
    //   98: aload #4
    //   100: iconst_0
    //   101: aload #4
    //   103: iconst_0
    //   104: aaload
    //   105: invokevirtual intValue : ()I
    //   108: iconst_1
    //   109: isub
    //   110: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   113: aastore
    //   114: goto -> 195
    //   117: aload_0
    //   118: getfield h : Z
    //   121: ifne -> 176
    //   124: aload_0
    //   125: getfield j : I
    //   128: iconst_1
    //   129: if_icmpne -> 176
    //   132: invokestatic a : ()Le/f/a/e/e/m/c;
    //   135: aload_0
    //   136: getfield g : Landroid/content/Context;
    //   139: aload_0
    //   140: getfield b : Landroid/os/PowerManager$WakeLock;
    //   143: aload_3
    //   144: invokestatic a : (Landroid/os/PowerManager$WakeLock;Ljava/lang/String;)Ljava/lang/String;
    //   147: bipush #8
    //   149: aload_0
    //   150: getfield e : Ljava/lang/String;
    //   153: aload_3
    //   154: aconst_null
    //   155: aload_0
    //   156: getfield d : I
    //   159: aload_0
    //   160: invokespecial b : ()Ljava/util/List;
    //   163: invokevirtual a : (Landroid/content/Context;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;)V
    //   166: aload_0
    //   167: aload_0
    //   168: getfield j : I
    //   171: iconst_1
    //   172: isub
    //   173: putfield j : I
    //   176: aload_2
    //   177: monitorexit
    //   178: aload_0
    //   179: iconst_0
    //   180: invokespecial a : (I)V
    //   183: return
    //   184: astore_3
    //   185: aload_2
    //   186: monitorexit
    //   187: goto -> 192
    //   190: aload_3
    //   191: athrow
    //   192: goto -> 190
    //   195: iconst_0
    //   196: istore_1
    //   197: iload_1
    //   198: ifne -> 132
    //   201: goto -> 117
    // Exception table:
    //   from	to	target	type
    //   41	63	184	finally
    //   71	93	184	finally
    //   98	114	184	finally
    //   117	132	184	finally
    //   132	176	184	finally
    //   176	178	184	finally
    //   185	187	184	finally
  }
  
  public void a(long paramLong) {
    // Byte code:
    //   0: aload_0
    //   1: getfield k : Ljava/util/concurrent/atomic/AtomicInteger;
    //   4: invokevirtual incrementAndGet : ()I
    //   7: pop
    //   8: aload_0
    //   9: aconst_null
    //   10: invokespecial a : (Ljava/lang/String;)Ljava/lang/String;
    //   13: astore #6
    //   15: aload_0
    //   16: getfield a : Ljava/lang/Object;
    //   19: astore #5
    //   21: aload #5
    //   23: monitorenter
    //   24: aload_0
    //   25: getfield i : Ljava/util/Map;
    //   28: invokeinterface isEmpty : ()Z
    //   33: istore #4
    //   35: iconst_0
    //   36: istore_3
    //   37: iload #4
    //   39: ifeq -> 49
    //   42: aload_0
    //   43: getfield j : I
    //   46: ifle -> 73
    //   49: aload_0
    //   50: getfield b : Landroid/os/PowerManager$WakeLock;
    //   53: invokevirtual isHeld : ()Z
    //   56: ifne -> 73
    //   59: aload_0
    //   60: getfield i : Ljava/util/Map;
    //   63: invokeinterface clear : ()V
    //   68: aload_0
    //   69: iconst_0
    //   70: putfield j : I
    //   73: aload_0
    //   74: getfield h : Z
    //   77: ifeq -> 148
    //   80: aload_0
    //   81: getfield i : Ljava/util/Map;
    //   84: aload #6
    //   86: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   91: checkcast [Ljava/lang/Integer;
    //   94: astore #7
    //   96: aload #7
    //   98: ifnonnull -> 129
    //   101: aload_0
    //   102: getfield i : Ljava/util/Map;
    //   105: aload #6
    //   107: iconst_1
    //   108: anewarray java/lang/Integer
    //   111: dup
    //   112: iconst_0
    //   113: iconst_1
    //   114: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   117: aastore
    //   118: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   123: pop
    //   124: iconst_1
    //   125: istore_3
    //   126: goto -> 255
    //   129: aload #7
    //   131: iconst_0
    //   132: aload #7
    //   134: iconst_0
    //   135: aaload
    //   136: invokevirtual intValue : ()I
    //   139: iconst_1
    //   140: iadd
    //   141: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   144: aastore
    //   145: goto -> 255
    //   148: aload_0
    //   149: getfield h : Z
    //   152: ifne -> 209
    //   155: aload_0
    //   156: getfield j : I
    //   159: ifne -> 209
    //   162: invokestatic a : ()Le/f/a/e/e/m/c;
    //   165: aload_0
    //   166: getfield g : Landroid/content/Context;
    //   169: aload_0
    //   170: getfield b : Landroid/os/PowerManager$WakeLock;
    //   173: aload #6
    //   175: invokestatic a : (Landroid/os/PowerManager$WakeLock;Ljava/lang/String;)Ljava/lang/String;
    //   178: bipush #7
    //   180: aload_0
    //   181: getfield e : Ljava/lang/String;
    //   184: aload #6
    //   186: aconst_null
    //   187: aload_0
    //   188: getfield d : I
    //   191: aload_0
    //   192: invokespecial b : ()Ljava/util/List;
    //   195: lload_1
    //   196: invokevirtual a : (Landroid/content/Context;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;J)V
    //   199: aload_0
    //   200: aload_0
    //   201: getfield j : I
    //   204: iconst_1
    //   205: iadd
    //   206: putfield j : I
    //   209: aload #5
    //   211: monitorexit
    //   212: aload_0
    //   213: getfield b : Landroid/os/PowerManager$WakeLock;
    //   216: invokevirtual acquire : ()V
    //   219: lload_1
    //   220: lconst_0
    //   221: lcmp
    //   222: ifle -> 246
    //   225: getstatic e/f/a/e/l/a.l : Ljava/util/concurrent/ScheduledExecutorService;
    //   228: new e/f/a/e/l/c
    //   231: dup
    //   232: aload_0
    //   233: invokespecial <init> : (Le/f/a/e/l/a;)V
    //   236: lload_1
    //   237: getstatic java/util/concurrent/TimeUnit.MILLISECONDS : Ljava/util/concurrent/TimeUnit;
    //   240: invokeinterface schedule : (Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
    //   245: pop
    //   246: return
    //   247: astore #6
    //   249: aload #5
    //   251: monitorexit
    //   252: aload #6
    //   254: athrow
    //   255: iload_3
    //   256: ifne -> 162
    //   259: goto -> 148
    // Exception table:
    //   from	to	target	type
    //   24	35	247	finally
    //   42	49	247	finally
    //   49	73	247	finally
    //   73	96	247	finally
    //   101	124	247	finally
    //   129	145	247	finally
    //   148	162	247	finally
    //   162	209	247	finally
    //   209	212	247	finally
    //   249	252	247	finally
  }
  
  public void a(boolean paramBoolean) {
    this.b.setReferenceCounted(paramBoolean);
    this.h = paramBoolean;
  }
  
  public static interface a {}
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/l/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */