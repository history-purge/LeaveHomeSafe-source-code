package e.f.a.e.d;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import b.d.g;
import e.f.a.e.m.l;
import e.f.a.e.m.m;
import e.f.a.e.m.o;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class d {
  private static int h;
  
  private static PendingIntent i;
  
  private static final Executor j = d0.c;
  
  private final g<String, m<Bundle>> a = new g();
  
  private final Context b;
  
  private final v c;
  
  private final ScheduledExecutorService d;
  
  private Messenger e;
  
  private Messenger f;
  
  private e g;
  
  public d(Context paramContext) {
    this.b = paramContext;
    this.c = new v(paramContext);
    this.e = new Messenger((Handler)new c0(this, Looper.getMainLooper()));
    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
    scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
    scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
    this.d = scheduledThreadPoolExecutor;
  }
  
  private static String a() {
    // Byte code:
    //   0: ldc e/f/a/e/d/d
    //   2: monitorenter
    //   3: getstatic e/f/a/e/d/d.h : I
    //   6: istore_0
    //   7: iload_0
    //   8: iconst_1
    //   9: iadd
    //   10: putstatic e/f/a/e/d/d.h : I
    //   13: iload_0
    //   14: invokestatic toString : (I)Ljava/lang/String;
    //   17: astore_1
    //   18: ldc e/f/a/e/d/d
    //   20: monitorexit
    //   21: aload_1
    //   22: areturn
    //   23: astore_1
    //   24: ldc e/f/a/e/d/d
    //   26: monitorexit
    //   27: aload_1
    //   28: athrow
    // Exception table:
    //   from	to	target	type
    //   3	18	23	finally
  }
  
  private static void a(Context paramContext, Intent paramIntent) {
    // Byte code:
    //   0: ldc e/f/a/e/d/d
    //   2: monitorenter
    //   3: getstatic e/f/a/e/d/d.i : Landroid/app/PendingIntent;
    //   6: ifnonnull -> 34
    //   9: new android/content/Intent
    //   12: dup
    //   13: invokespecial <init> : ()V
    //   16: astore_2
    //   17: aload_2
    //   18: ldc 'com.google.example.invalidpackage'
    //   20: invokevirtual setPackage : (Ljava/lang/String;)Landroid/content/Intent;
    //   23: pop
    //   24: aload_0
    //   25: iconst_0
    //   26: aload_2
    //   27: iconst_0
    //   28: invokestatic getBroadcast : (Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
    //   31: putstatic e/f/a/e/d/d.i : Landroid/app/PendingIntent;
    //   34: aload_1
    //   35: ldc 'app'
    //   37: getstatic e/f/a/e/d/d.i : Landroid/app/PendingIntent;
    //   40: invokevirtual putExtra : (Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
    //   43: pop
    //   44: ldc e/f/a/e/d/d
    //   46: monitorexit
    //   47: return
    //   48: astore_0
    //   49: ldc e/f/a/e/d/d
    //   51: monitorexit
    //   52: aload_0
    //   53: athrow
    // Exception table:
    //   from	to	target	type
    //   3	34	48	finally
    //   34	44	48	finally
  }
  
  private final void a(Message paramMessage) {
    // Byte code:
    //   0: aload_1
    //   1: ifnull -> 575
    //   4: aload_1
    //   5: getfield obj : Ljava/lang/Object;
    //   8: astore_3
    //   9: aload_3
    //   10: instanceof android/content/Intent
    //   13: ifeq -> 575
    //   16: aload_3
    //   17: checkcast android/content/Intent
    //   20: astore_3
    //   21: aload_3
    //   22: new e/f/a/e/d/e$a
    //   25: dup
    //   26: invokespecial <init> : ()V
    //   29: invokevirtual setExtrasClassLoader : (Ljava/lang/ClassLoader;)V
    //   32: aload_3
    //   33: ldc 'google.messenger'
    //   35: invokevirtual hasExtra : (Ljava/lang/String;)Z
    //   38: ifeq -> 78
    //   41: aload_3
    //   42: ldc 'google.messenger'
    //   44: invokevirtual getParcelableExtra : (Ljava/lang/String;)Landroid/os/Parcelable;
    //   47: astore_3
    //   48: aload_3
    //   49: instanceof e/f/a/e/d/e
    //   52: ifeq -> 63
    //   55: aload_0
    //   56: aload_3
    //   57: checkcast e/f/a/e/d/e
    //   60: putfield g : Le/f/a/e/d/e;
    //   63: aload_3
    //   64: instanceof android/os/Messenger
    //   67: ifeq -> 78
    //   70: aload_0
    //   71: aload_3
    //   72: checkcast android/os/Messenger
    //   75: putfield f : Landroid/os/Messenger;
    //   78: aload_1
    //   79: getfield obj : Ljava/lang/Object;
    //   82: checkcast android/content/Intent
    //   85: astore #4
    //   87: aload #4
    //   89: invokevirtual getAction : ()Ljava/lang/String;
    //   92: astore_1
    //   93: ldc 'com.google.android.c2dm.intent.REGISTRATION'
    //   95: aload_1
    //   96: invokevirtual equals : (Ljava/lang/Object;)Z
    //   99: ifne -> 151
    //   102: ldc 'Rpc'
    //   104: iconst_3
    //   105: invokestatic isLoggable : (Ljava/lang/String;I)Z
    //   108: ifeq -> 150
    //   111: aload_1
    //   112: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   115: astore_1
    //   116: aload_1
    //   117: invokevirtual length : ()I
    //   120: ifeq -> 133
    //   123: ldc 'Unexpected response action: '
    //   125: aload_1
    //   126: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   129: astore_1
    //   130: goto -> 143
    //   133: new java/lang/String
    //   136: dup
    //   137: ldc 'Unexpected response action: '
    //   139: invokespecial <init> : (Ljava/lang/String;)V
    //   142: astore_1
    //   143: ldc 'Rpc'
    //   145: aload_1
    //   146: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
    //   149: pop
    //   150: return
    //   151: aload #4
    //   153: ldc 'registration_id'
    //   155: invokevirtual getStringExtra : (Ljava/lang/String;)Ljava/lang/String;
    //   158: astore_3
    //   159: aload_3
    //   160: astore_1
    //   161: aload_3
    //   162: ifnonnull -> 173
    //   165: aload #4
    //   167: ldc 'unregistered'
    //   169: invokevirtual getStringExtra : (Ljava/lang/String;)Ljava/lang/String;
    //   172: astore_1
    //   173: aload_1
    //   174: ifnonnull -> 467
    //   177: aload #4
    //   179: ldc 'error'
    //   181: invokevirtual getStringExtra : (Ljava/lang/String;)Ljava/lang/String;
    //   184: astore_3
    //   185: aload_3
    //   186: ifnonnull -> 240
    //   189: aload #4
    //   191: invokevirtual getExtras : ()Landroid/os/Bundle;
    //   194: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   197: astore_1
    //   198: new java/lang/StringBuilder
    //   201: dup
    //   202: aload_1
    //   203: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   206: invokevirtual length : ()I
    //   209: bipush #49
    //   211: iadd
    //   212: invokespecial <init> : (I)V
    //   215: astore_3
    //   216: aload_3
    //   217: ldc 'Unexpected response, no error or registration id '
    //   219: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   222: pop
    //   223: aload_3
    //   224: aload_1
    //   225: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   228: pop
    //   229: ldc 'Rpc'
    //   231: aload_3
    //   232: invokevirtual toString : ()Ljava/lang/String;
    //   235: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   238: pop
    //   239: return
    //   240: ldc 'Rpc'
    //   242: iconst_3
    //   243: invokestatic isLoggable : (Ljava/lang/String;I)Z
    //   246: ifeq -> 288
    //   249: aload_3
    //   250: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   253: astore_1
    //   254: aload_1
    //   255: invokevirtual length : ()I
    //   258: ifeq -> 271
    //   261: ldc 'Received InstanceID error '
    //   263: aload_1
    //   264: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   267: astore_1
    //   268: goto -> 281
    //   271: new java/lang/String
    //   274: dup
    //   275: ldc 'Received InstanceID error '
    //   277: invokespecial <init> : (Ljava/lang/String;)V
    //   280: astore_1
    //   281: ldc 'Rpc'
    //   283: aload_1
    //   284: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
    //   287: pop
    //   288: aload_3
    //   289: ldc '|'
    //   291: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   294: ifeq -> 412
    //   297: aload_3
    //   298: ldc '\|'
    //   300: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
    //   303: astore_1
    //   304: aload_1
    //   305: arraylength
    //   306: iconst_2
    //   307: if_icmple -> 370
    //   310: ldc_w 'ID'
    //   313: aload_1
    //   314: iconst_1
    //   315: aaload
    //   316: invokevirtual equals : (Ljava/lang/Object;)Z
    //   319: ifne -> 325
    //   322: goto -> 370
    //   325: aload_1
    //   326: iconst_2
    //   327: aaload
    //   328: astore #5
    //   330: aload_1
    //   331: iconst_3
    //   332: aaload
    //   333: astore_3
    //   334: aload_3
    //   335: astore_1
    //   336: aload_3
    //   337: ldc_w ':'
    //   340: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   343: ifeq -> 352
    //   346: aload_3
    //   347: iconst_1
    //   348: invokevirtual substring : (I)Ljava/lang/String;
    //   351: astore_1
    //   352: aload_0
    //   353: aload #5
    //   355: aload #4
    //   357: ldc 'error'
    //   359: aload_1
    //   360: invokevirtual putExtra : (Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   363: invokevirtual getExtras : ()Landroid/os/Bundle;
    //   366: invokespecial a : (Ljava/lang/String;Landroid/os/Bundle;)V
    //   369: return
    //   370: aload_3
    //   371: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   374: astore_1
    //   375: aload_1
    //   376: invokevirtual length : ()I
    //   379: ifeq -> 393
    //   382: ldc_w 'Unexpected structured response '
    //   385: aload_1
    //   386: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   389: astore_1
    //   390: goto -> 404
    //   393: new java/lang/String
    //   396: dup
    //   397: ldc_w 'Unexpected structured response '
    //   400: invokespecial <init> : (Ljava/lang/String;)V
    //   403: astore_1
    //   404: ldc 'Rpc'
    //   406: aload_1
    //   407: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   410: pop
    //   411: return
    //   412: aload_0
    //   413: getfield a : Lb/d/g;
    //   416: astore_1
    //   417: aload_1
    //   418: monitorenter
    //   419: iconst_0
    //   420: istore_2
    //   421: iload_2
    //   422: aload_0
    //   423: getfield a : Lb/d/g;
    //   426: invokevirtual size : ()I
    //   429: if_icmpge -> 459
    //   432: aload_0
    //   433: aload_0
    //   434: getfield a : Lb/d/g;
    //   437: iload_2
    //   438: invokevirtual b : (I)Ljava/lang/Object;
    //   441: checkcast java/lang/String
    //   444: aload #4
    //   446: invokevirtual getExtras : ()Landroid/os/Bundle;
    //   449: invokespecial a : (Ljava/lang/String;Landroid/os/Bundle;)V
    //   452: iload_2
    //   453: iconst_1
    //   454: iadd
    //   455: istore_2
    //   456: goto -> 421
    //   459: aload_1
    //   460: monitorexit
    //   461: return
    //   462: astore_3
    //   463: aload_1
    //   464: monitorexit
    //   465: aload_3
    //   466: athrow
    //   467: ldc_w '\|ID\|([^|]+)\|:?+(.*)'
    //   470: invokestatic compile : (Ljava/lang/String;)Ljava/util/regex/Pattern;
    //   473: aload_1
    //   474: invokevirtual matcher : (Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
    //   477: astore_3
    //   478: aload_3
    //   479: invokevirtual matches : ()Z
    //   482: ifne -> 536
    //   485: ldc 'Rpc'
    //   487: iconst_3
    //   488: invokestatic isLoggable : (Ljava/lang/String;I)Z
    //   491: ifeq -> 535
    //   494: aload_1
    //   495: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   498: astore_1
    //   499: aload_1
    //   500: invokevirtual length : ()I
    //   503: ifeq -> 517
    //   506: ldc_w 'Unexpected response string: '
    //   509: aload_1
    //   510: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   513: astore_1
    //   514: goto -> 528
    //   517: new java/lang/String
    //   520: dup
    //   521: ldc_w 'Unexpected response string: '
    //   524: invokespecial <init> : (Ljava/lang/String;)V
    //   527: astore_1
    //   528: ldc 'Rpc'
    //   530: aload_1
    //   531: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
    //   534: pop
    //   535: return
    //   536: aload_3
    //   537: iconst_1
    //   538: invokevirtual group : (I)Ljava/lang/String;
    //   541: astore_1
    //   542: aload_3
    //   543: iconst_2
    //   544: invokevirtual group : (I)Ljava/lang/String;
    //   547: astore_3
    //   548: aload_1
    //   549: ifnull -> 574
    //   552: aload #4
    //   554: invokevirtual getExtras : ()Landroid/os/Bundle;
    //   557: astore #4
    //   559: aload #4
    //   561: ldc 'registration_id'
    //   563: aload_3
    //   564: invokevirtual putString : (Ljava/lang/String;Ljava/lang/String;)V
    //   567: aload_0
    //   568: aload_1
    //   569: aload #4
    //   571: invokespecial a : (Ljava/lang/String;Landroid/os/Bundle;)V
    //   574: return
    //   575: ldc 'Rpc'
    //   577: ldc_w 'Dropping invalid message'
    //   580: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   583: pop
    //   584: return
    // Exception table:
    //   from	to	target	type
    //   421	452	462	finally
    //   459	461	462	finally
    //   463	465	462	finally
  }
  
  private final void a(String paramString, Bundle paramBundle) {
    synchronized (this.a) {
      m m = (m)this.a.remove(paramString);
      if (m == null) {
        paramString = String.valueOf(paramString);
        if (paramString.length() != 0) {
          paramString = "Missing callback for ".concat(paramString);
        } else {
          paramString = new String("Missing callback for ");
        } 
        Log.w("Rpc", paramString);
        return;
      } 
      m.a(paramBundle);
      return;
    } 
  }
  
  private static boolean c(Bundle paramBundle) {
    return (paramBundle != null && paramBundle.containsKey("google.messenger"));
  }
  
  private final l<Bundle> d(Bundle paramBundle) {
    g<String, m<Bundle>> g1;
    StringBuilder stringBuilder;
    String str = a();
    m m = new m();
    synchronized (this.a) {
      String str1;
      this.a.put(str, m);
      Intent intent = new Intent();
      intent.setPackage("com.google.android.gms");
      if (this.c.a() == 2) {
        str1 = "com.google.iid.TOKEN_REQUEST";
      } else {
        str1 = "com.google.android.c2dm.intent.REGISTER";
      } 
      intent.setAction(str1);
      intent.putExtras(paramBundle);
      a(this.b, intent);
      StringBuilder stringBuilder1 = new StringBuilder(String.valueOf(str).length() + 5);
      stringBuilder1.append("|ID|");
      stringBuilder1.append(str);
      stringBuilder1.append("|");
      intent.putExtra("kid", stringBuilder1.toString());
      if (Log.isLoggable("Rpc", 3)) {
        String str2 = String.valueOf(intent.getExtras());
        stringBuilder = new StringBuilder(String.valueOf(str2).length() + 8);
        stringBuilder.append("Sending ");
        stringBuilder.append(str2);
        Log.d("Rpc", stringBuilder.toString());
      } 
      intent.putExtra("google.messenger", (Parcelable)this.e);
      if (this.f != null || this.g != null) {
        Message message = Message.obtain();
        message.obj = intent;
        try {
          if (this.f != null) {
            this.f.send(message);
          } else {
            this.g.a(message);
          } 
          ScheduledFuture<?> scheduledFuture1 = this.d.schedule(new y(m), 30L, TimeUnit.SECONDS);
          m.a().a(j, new b0(this, str, scheduledFuture1));
          return m.a();
        } catch (RemoteException remoteException) {
          if (Log.isLoggable("Rpc", 3))
            Log.d("Rpc", "Messenger failed, fallback to startService"); 
        } 
      } 
      if (this.c.a() == 2) {
        this.b.sendBroadcast(intent);
      } else {
        this.b.startService(intent);
      } 
      ScheduledFuture<?> scheduledFuture = this.d.schedule(new y(m), 30L, TimeUnit.SECONDS);
      m.a().a(j, new b0(this, str, scheduledFuture));
      return m.a();
    } 
  }
  
  public l<Bundle> a(Bundle paramBundle) {
    int i = this.c.b();
    boolean bool = true;
    if (i >= 12000000)
      return i.a(this.b).b(1, paramBundle).a(j, x.a); 
    if (this.c.a() == 0)
      bool = false; 
    return !bool ? o.a(new IOException("MISSING_INSTANCEID_SERVICE")) : d(paramBundle).b(j, new z(this, paramBundle));
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/d/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */