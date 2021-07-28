package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.internal.a0;
import com.google.android.gms.common.internal.j;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.common.util.h;
import e.f.a.e.e.d;
import e.f.a.e.e.e;
import e.f.a.e.i.c.d;
import e.f.a.e.m.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class g implements Handler.Callback {
  @RecentlyNonNull
  public static final Status o = new Status(4, "Sign-out occurred while this API call was in progress.");
  
  private static final Status p = new Status(4, "The user must be signed in to make this API call.");
  
  private static final Object q = new Object();
  
  private static g r;
  
  private long a = 5000L;
  
  private long b = 120000L;
  
  private long c = 10000L;
  
  private final Context d;
  
  private final d e;
  
  private final a0 f;
  
  private final AtomicInteger g = new AtomicInteger(1);
  
  private final AtomicInteger h = new AtomicInteger(0);
  
  private final Map<b<?>, a<?>> i = new ConcurrentHashMap<b<?>, a<?>>(5, 0.75F, 1);
  
  private y0 j = null;
  
  private final Set<b<?>> k = (Set<b<?>>)new b.d.b();
  
  private final Set<b<?>> l = (Set<b<?>>)new b.d.b();
  
  private final Handler m;
  
  private volatile boolean n = true;
  
  private g(Context paramContext, Looper paramLooper, d paramd) {
    this.d = paramContext;
    this.m = (Handler)new d(paramLooper, this);
    this.e = paramd;
    this.f = new a0((e)paramd);
    if (h.a(paramContext))
      this.n = false; 
    Handler handler = this.m;
    handler.sendMessage(handler.obtainMessage(6));
  }
  
  @RecentlyNonNull
  public static g a(@RecentlyNonNull Context paramContext) {
    synchronized (q) {
      if (r == null) {
        HandlerThread handlerThread = new HandlerThread("GoogleApiHandler", 9);
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        r = new g(paramContext.getApplicationContext(), looper, d.a());
      } 
      return r;
    } 
  }
  
  private static Status b(b<?> paramb, e.f.a.e.e.a parama) {
    String str1 = paramb.a();
    String str2 = String.valueOf(parama);
    StringBuilder stringBuilder = new StringBuilder(String.valueOf(str1).length() + 63 + String.valueOf(str2).length());
    stringBuilder.append("API: ");
    stringBuilder.append(str1);
    stringBuilder.append(" is not available on this device. Connection failed with: ");
    stringBuilder.append(str2);
    return new Status(parama, stringBuilder.toString());
  }
  
  private final a<?> b(e<?> parame) {
    b<?> b = parame.c();
    a<?> a2 = this.i.get(b);
    a<?> a1 = a2;
    if (a2 == null) {
      a1 = new a(this, parame);
      this.i.put(b, a1);
    } 
    if (a1.k())
      this.l.add(b); 
    a1.i();
    return a1;
  }
  
  public static void c() {
    synchronized (q) {
      if (r != null) {
        g g1 = r;
        g1.h.incrementAndGet();
        g1.m.sendMessageAtFrontOfQueue(g1.m.obtainMessage(10));
      } 
      return;
    } 
  }
  
  @RecentlyNonNull
  public final int a() {
    return this.g.getAndIncrement();
  }
  
  public final void a(@RecentlyNonNull e<?> parame) {
    Handler handler = this.m;
    handler.sendMessage(handler.obtainMessage(7, parame));
  }
  
  public final <O extends com.google.android.gms.common.api.a.d> void a(@RecentlyNonNull e<O> parame, @RecentlyNonNull int paramInt, @RecentlyNonNull d<? extends l, com.google.android.gms.common.api.a.b> paramd) {
    m0<d<? extends l, com.google.android.gms.common.api.a.b>> m0 = new m0<d<? extends l, com.google.android.gms.common.api.a.b>>(paramInt, paramd);
    Handler handler = this.m;
    handler.sendMessage(handler.obtainMessage(4, new d0(m0, this.h.get(), parame)));
  }
  
  final boolean a(e.f.a.e.e.a parama, int paramInt) {
    return this.e.a(this.d, parama, paramInt);
  }
  
  public final void b() {
    Handler handler = this.m;
    handler.sendMessage(handler.obtainMessage(3));
  }
  
  public final void b(@RecentlyNonNull e.f.a.e.e.a parama, @RecentlyNonNull int paramInt) {
    if (!a(parama, paramInt)) {
      Handler handler = this.m;
      handler.sendMessage(handler.obtainMessage(5, paramInt, 0, parama));
    } 
  }
  
  @RecentlyNonNull
  public boolean handleMessage(@RecentlyNonNull Message paramMessage) {
    // Byte code:
    //   0: aload_1
    //   1: getfield what : I
    //   4: istore_2
    //   5: ldc2_w 300000
    //   8: lstore_3
    //   9: iload_2
    //   10: tableswitch default -> 88, 1 -> 1098, 2 -> 950, 3 -> 902, 4 -> 803, 5 -> 554, 6 -> 495, 7 -> 481, 8 -> 803, 9 -> 444, 10 -> 374, 11 -> 337, 12 -> 299, 13 -> 803, 14 -> 217, 15 -> 171, 16 -> 125
    //   88: new java/lang/StringBuilder
    //   91: dup
    //   92: bipush #31
    //   94: invokespecial <init> : (I)V
    //   97: astore_1
    //   98: aload_1
    //   99: ldc_w 'Unknown message id: '
    //   102: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   105: pop
    //   106: aload_1
    //   107: iload_2
    //   108: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   111: pop
    //   112: ldc_w 'GoogleApiManager'
    //   115: aload_1
    //   116: invokevirtual toString : ()Ljava/lang/String;
    //   119: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   122: pop
    //   123: iconst_0
    //   124: ireturn
    //   125: aload_1
    //   126: getfield obj : Ljava/lang/Object;
    //   129: checkcast com/google/android/gms/common/api/internal/g$b
    //   132: astore_1
    //   133: aload_0
    //   134: getfield i : Ljava/util/Map;
    //   137: aload_1
    //   138: invokestatic a : (Lcom/google/android/gms/common/api/internal/g$b;)Lcom/google/android/gms/common/api/internal/b;
    //   141: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   146: ifeq -> 1192
    //   149: aload_0
    //   150: getfield i : Ljava/util/Map;
    //   153: aload_1
    //   154: invokestatic a : (Lcom/google/android/gms/common/api/internal/g$b;)Lcom/google/android/gms/common/api/internal/b;
    //   157: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   162: checkcast com/google/android/gms/common/api/internal/g$a
    //   165: aload_1
    //   166: invokestatic b : (Lcom/google/android/gms/common/api/internal/g$a;Lcom/google/android/gms/common/api/internal/g$b;)V
    //   169: iconst_1
    //   170: ireturn
    //   171: aload_1
    //   172: getfield obj : Ljava/lang/Object;
    //   175: checkcast com/google/android/gms/common/api/internal/g$b
    //   178: astore_1
    //   179: aload_0
    //   180: getfield i : Ljava/util/Map;
    //   183: aload_1
    //   184: invokestatic a : (Lcom/google/android/gms/common/api/internal/g$b;)Lcom/google/android/gms/common/api/internal/b;
    //   187: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   192: ifeq -> 1192
    //   195: aload_0
    //   196: getfield i : Ljava/util/Map;
    //   199: aload_1
    //   200: invokestatic a : (Lcom/google/android/gms/common/api/internal/g$b;)Lcom/google/android/gms/common/api/internal/b;
    //   203: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   208: checkcast com/google/android/gms/common/api/internal/g$a
    //   211: aload_1
    //   212: invokestatic a : (Lcom/google/android/gms/common/api/internal/g$a;Lcom/google/android/gms/common/api/internal/g$b;)V
    //   215: iconst_1
    //   216: ireturn
    //   217: aload_1
    //   218: getfield obj : Ljava/lang/Object;
    //   221: checkcast com/google/android/gms/common/api/internal/r
    //   224: astore_1
    //   225: aload_1
    //   226: invokevirtual a : ()Lcom/google/android/gms/common/api/internal/b;
    //   229: astore #6
    //   231: aload_0
    //   232: getfield i : Ljava/util/Map;
    //   235: aload #6
    //   237: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   242: ifne -> 259
    //   245: aload_1
    //   246: invokevirtual b : ()Le/f/a/e/m/m;
    //   249: astore #6
    //   251: iconst_0
    //   252: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   255: astore_1
    //   256: goto -> 291
    //   259: aload_0
    //   260: getfield i : Ljava/util/Map;
    //   263: aload #6
    //   265: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   270: checkcast com/google/android/gms/common/api/internal/g$a
    //   273: iconst_0
    //   274: invokestatic a : (Lcom/google/android/gms/common/api/internal/g$a;Z)Z
    //   277: istore #5
    //   279: aload_1
    //   280: invokevirtual b : ()Le/f/a/e/m/m;
    //   283: astore #6
    //   285: iload #5
    //   287: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   290: astore_1
    //   291: aload #6
    //   293: aload_1
    //   294: invokevirtual a : (Ljava/lang/Object;)V
    //   297: iconst_1
    //   298: ireturn
    //   299: aload_0
    //   300: getfield i : Ljava/util/Map;
    //   303: aload_1
    //   304: getfield obj : Ljava/lang/Object;
    //   307: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   312: ifeq -> 1192
    //   315: aload_0
    //   316: getfield i : Ljava/util/Map;
    //   319: aload_1
    //   320: getfield obj : Ljava/lang/Object;
    //   323: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   328: checkcast com/google/android/gms/common/api/internal/g$a
    //   331: invokevirtual h : ()Z
    //   334: pop
    //   335: iconst_1
    //   336: ireturn
    //   337: aload_0
    //   338: getfield i : Ljava/util/Map;
    //   341: aload_1
    //   342: getfield obj : Ljava/lang/Object;
    //   345: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   350: ifeq -> 1192
    //   353: aload_0
    //   354: getfield i : Ljava/util/Map;
    //   357: aload_1
    //   358: getfield obj : Ljava/lang/Object;
    //   361: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   366: checkcast com/google/android/gms/common/api/internal/g$a
    //   369: invokevirtual g : ()V
    //   372: iconst_1
    //   373: ireturn
    //   374: aload_0
    //   375: getfield l : Ljava/util/Set;
    //   378: invokeinterface iterator : ()Ljava/util/Iterator;
    //   383: astore_1
    //   384: aload_1
    //   385: invokeinterface hasNext : ()Z
    //   390: ifeq -> 433
    //   393: aload_1
    //   394: invokeinterface next : ()Ljava/lang/Object;
    //   399: checkcast com/google/android/gms/common/api/internal/b
    //   402: astore #6
    //   404: aload_0
    //   405: getfield i : Ljava/util/Map;
    //   408: aload #6
    //   410: invokeinterface remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   415: checkcast com/google/android/gms/common/api/internal/g$a
    //   418: astore #6
    //   420: aload #6
    //   422: ifnull -> 384
    //   425: aload #6
    //   427: invokevirtual a : ()V
    //   430: goto -> 384
    //   433: aload_0
    //   434: getfield l : Ljava/util/Set;
    //   437: invokeinterface clear : ()V
    //   442: iconst_1
    //   443: ireturn
    //   444: aload_0
    //   445: getfield i : Ljava/util/Map;
    //   448: aload_1
    //   449: getfield obj : Ljava/lang/Object;
    //   452: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   457: ifeq -> 1192
    //   460: aload_0
    //   461: getfield i : Ljava/util/Map;
    //   464: aload_1
    //   465: getfield obj : Ljava/lang/Object;
    //   468: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   473: checkcast com/google/android/gms/common/api/internal/g$a
    //   476: invokevirtual f : ()V
    //   479: iconst_1
    //   480: ireturn
    //   481: aload_0
    //   482: aload_1
    //   483: getfield obj : Ljava/lang/Object;
    //   486: checkcast com/google/android/gms/common/api/e
    //   489: invokespecial b : (Lcom/google/android/gms/common/api/e;)Lcom/google/android/gms/common/api/internal/g$a;
    //   492: pop
    //   493: iconst_1
    //   494: ireturn
    //   495: aload_0
    //   496: getfield d : Landroid/content/Context;
    //   499: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   502: instanceof android/app/Application
    //   505: ifeq -> 1192
    //   508: aload_0
    //   509: getfield d : Landroid/content/Context;
    //   512: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   515: checkcast android/app/Application
    //   518: invokestatic a : (Landroid/app/Application;)V
    //   521: invokestatic b : ()Lcom/google/android/gms/common/api/internal/c;
    //   524: new com/google/android/gms/common/api/internal/t
    //   527: dup
    //   528: aload_0
    //   529: invokespecial <init> : (Lcom/google/android/gms/common/api/internal/g;)V
    //   532: invokevirtual a : (Lcom/google/android/gms/common/api/internal/c$a;)V
    //   535: invokestatic b : ()Lcom/google/android/gms/common/api/internal/c;
    //   538: iconst_1
    //   539: invokevirtual a : (Z)Z
    //   542: ifne -> 1192
    //   545: aload_0
    //   546: ldc2_w 300000
    //   549: putfield c : J
    //   552: iconst_1
    //   553: ireturn
    //   554: aload_1
    //   555: getfield arg1 : I
    //   558: istore_2
    //   559: aload_1
    //   560: getfield obj : Ljava/lang/Object;
    //   563: checkcast e/f/a/e/e/a
    //   566: astore #6
    //   568: aload_0
    //   569: getfield i : Ljava/util/Map;
    //   572: invokeinterface values : ()Ljava/util/Collection;
    //   577: invokeinterface iterator : ()Ljava/util/Iterator;
    //   582: astore #7
    //   584: aload #7
    //   586: invokeinterface hasNext : ()Z
    //   591: ifeq -> 616
    //   594: aload #7
    //   596: invokeinterface next : ()Ljava/lang/Object;
    //   601: checkcast com/google/android/gms/common/api/internal/g$a
    //   604: astore_1
    //   605: aload_1
    //   606: invokevirtual l : ()I
    //   609: iload_2
    //   610: if_icmpne -> 584
    //   613: goto -> 618
    //   616: aconst_null
    //   617: astore_1
    //   618: aload_1
    //   619: ifnull -> 751
    //   622: aload #6
    //   624: invokevirtual b : ()I
    //   627: bipush #13
    //   629: if_icmpne -> 736
    //   632: aload_0
    //   633: getfield e : Le/f/a/e/e/d;
    //   636: aload #6
    //   638: invokevirtual b : ()I
    //   641: invokevirtual a : (I)Ljava/lang/String;
    //   644: astore #7
    //   646: aload #6
    //   648: invokevirtual c : ()Ljava/lang/String;
    //   651: astore #6
    //   653: new java/lang/StringBuilder
    //   656: dup
    //   657: aload #7
    //   659: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   662: invokevirtual length : ()I
    //   665: bipush #69
    //   667: iadd
    //   668: aload #6
    //   670: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   673: invokevirtual length : ()I
    //   676: iadd
    //   677: invokespecial <init> : (I)V
    //   680: astore #8
    //   682: aload #8
    //   684: ldc_w 'Error resolution was canceled by the user, original error message: '
    //   687: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   690: pop
    //   691: aload #8
    //   693: aload #7
    //   695: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   698: pop
    //   699: aload #8
    //   701: ldc_w ': '
    //   704: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   707: pop
    //   708: aload #8
    //   710: aload #6
    //   712: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   715: pop
    //   716: aload_1
    //   717: new com/google/android/gms/common/api/Status
    //   720: dup
    //   721: bipush #17
    //   723: aload #8
    //   725: invokevirtual toString : ()Ljava/lang/String;
    //   728: invokespecial <init> : (ILjava/lang/String;)V
    //   731: invokestatic a : (Lcom/google/android/gms/common/api/internal/g$a;Lcom/google/android/gms/common/api/Status;)V
    //   734: iconst_1
    //   735: ireturn
    //   736: aload_1
    //   737: aload_1
    //   738: invokestatic a : (Lcom/google/android/gms/common/api/internal/g$a;)Lcom/google/android/gms/common/api/internal/b;
    //   741: aload #6
    //   743: invokestatic b : (Lcom/google/android/gms/common/api/internal/b;Le/f/a/e/e/a;)Lcom/google/android/gms/common/api/Status;
    //   746: invokestatic a : (Lcom/google/android/gms/common/api/internal/g$a;Lcom/google/android/gms/common/api/Status;)V
    //   749: iconst_1
    //   750: ireturn
    //   751: new java/lang/StringBuilder
    //   754: dup
    //   755: bipush #76
    //   757: invokespecial <init> : (I)V
    //   760: astore_1
    //   761: aload_1
    //   762: ldc_w 'Could not find API instance '
    //   765: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   768: pop
    //   769: aload_1
    //   770: iload_2
    //   771: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   774: pop
    //   775: aload_1
    //   776: ldc_w ' while trying to fail enqueued calls.'
    //   779: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   782: pop
    //   783: ldc_w 'GoogleApiManager'
    //   786: aload_1
    //   787: invokevirtual toString : ()Ljava/lang/String;
    //   790: new java/lang/Exception
    //   793: dup
    //   794: invokespecial <init> : ()V
    //   797: invokestatic wtf : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   800: pop
    //   801: iconst_1
    //   802: ireturn
    //   803: aload_1
    //   804: getfield obj : Ljava/lang/Object;
    //   807: checkcast com/google/android/gms/common/api/internal/d0
    //   810: astore #7
    //   812: aload_0
    //   813: getfield i : Ljava/util/Map;
    //   816: aload #7
    //   818: getfield c : Lcom/google/android/gms/common/api/e;
    //   821: invokevirtual c : ()Lcom/google/android/gms/common/api/internal/b;
    //   824: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   829: checkcast com/google/android/gms/common/api/internal/g$a
    //   832: astore #6
    //   834: aload #6
    //   836: astore_1
    //   837: aload #6
    //   839: ifnonnull -> 852
    //   842: aload_0
    //   843: aload #7
    //   845: getfield c : Lcom/google/android/gms/common/api/e;
    //   848: invokespecial b : (Lcom/google/android/gms/common/api/e;)Lcom/google/android/gms/common/api/internal/g$a;
    //   851: astore_1
    //   852: aload_1
    //   853: invokevirtual k : ()Z
    //   856: ifeq -> 891
    //   859: aload_0
    //   860: getfield h : Ljava/util/concurrent/atomic/AtomicInteger;
    //   863: invokevirtual get : ()I
    //   866: aload #7
    //   868: getfield b : I
    //   871: if_icmpeq -> 891
    //   874: aload #7
    //   876: getfield a : Lcom/google/android/gms/common/api/internal/f0;
    //   879: getstatic com/google/android/gms/common/api/internal/g.o : Lcom/google/android/gms/common/api/Status;
    //   882: invokevirtual a : (Lcom/google/android/gms/common/api/Status;)V
    //   885: aload_1
    //   886: invokevirtual a : ()V
    //   889: iconst_1
    //   890: ireturn
    //   891: aload_1
    //   892: aload #7
    //   894: getfield a : Lcom/google/android/gms/common/api/internal/f0;
    //   897: invokevirtual a : (Lcom/google/android/gms/common/api/internal/f0;)V
    //   900: iconst_1
    //   901: ireturn
    //   902: aload_0
    //   903: getfield i : Ljava/util/Map;
    //   906: invokeinterface values : ()Ljava/util/Collection;
    //   911: invokeinterface iterator : ()Ljava/util/Iterator;
    //   916: astore_1
    //   917: aload_1
    //   918: invokeinterface hasNext : ()Z
    //   923: ifeq -> 1192
    //   926: aload_1
    //   927: invokeinterface next : ()Ljava/lang/Object;
    //   932: checkcast com/google/android/gms/common/api/internal/g$a
    //   935: astore #6
    //   937: aload #6
    //   939: invokevirtual d : ()V
    //   942: aload #6
    //   944: invokevirtual i : ()V
    //   947: goto -> 917
    //   950: aload_1
    //   951: getfield obj : Ljava/lang/Object;
    //   954: checkcast com/google/android/gms/common/api/internal/p0
    //   957: astore_1
    //   958: aload_1
    //   959: invokevirtual a : ()Ljava/util/Set;
    //   962: invokeinterface iterator : ()Ljava/util/Iterator;
    //   967: astore #6
    //   969: aload #6
    //   971: invokeinterface hasNext : ()Z
    //   976: ifeq -> 1192
    //   979: aload #6
    //   981: invokeinterface next : ()Ljava/lang/Object;
    //   986: checkcast com/google/android/gms/common/api/internal/b
    //   989: astore #7
    //   991: aload_0
    //   992: getfield i : Ljava/util/Map;
    //   995: aload #7
    //   997: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1002: checkcast com/google/android/gms/common/api/internal/g$a
    //   1005: astore #8
    //   1007: aload #8
    //   1009: ifnonnull -> 1030
    //   1012: aload_1
    //   1013: aload #7
    //   1015: new e/f/a/e/e/a
    //   1018: dup
    //   1019: bipush #13
    //   1021: invokespecial <init> : (I)V
    //   1024: aconst_null
    //   1025: invokevirtual a : (Lcom/google/android/gms/common/api/internal/b;Le/f/a/e/e/a;Ljava/lang/String;)V
    //   1028: iconst_1
    //   1029: ireturn
    //   1030: aload #8
    //   1032: invokevirtual j : ()Z
    //   1035: ifeq -> 1060
    //   1038: aload_1
    //   1039: aload #7
    //   1041: getstatic e/f/a/e/e/a.g : Le/f/a/e/e/a;
    //   1044: aload #8
    //   1046: invokevirtual b : ()Lcom/google/android/gms/common/api/a$f;
    //   1049: invokeinterface g : ()Ljava/lang/String;
    //   1054: invokevirtual a : (Lcom/google/android/gms/common/api/internal/b;Le/f/a/e/e/a;Ljava/lang/String;)V
    //   1057: goto -> 969
    //   1060: aload #8
    //   1062: invokevirtual e : ()Le/f/a/e/e/a;
    //   1065: astore #9
    //   1067: aload #9
    //   1069: ifnull -> 1084
    //   1072: aload_1
    //   1073: aload #7
    //   1075: aload #9
    //   1077: aconst_null
    //   1078: invokevirtual a : (Lcom/google/android/gms/common/api/internal/b;Le/f/a/e/e/a;Ljava/lang/String;)V
    //   1081: goto -> 969
    //   1084: aload #8
    //   1086: aload_1
    //   1087: invokevirtual a : (Lcom/google/android/gms/common/api/internal/p0;)V
    //   1090: aload #8
    //   1092: invokevirtual i : ()V
    //   1095: goto -> 969
    //   1098: aload_1
    //   1099: getfield obj : Ljava/lang/Object;
    //   1102: checkcast java/lang/Boolean
    //   1105: invokevirtual booleanValue : ()Z
    //   1108: ifeq -> 1115
    //   1111: ldc2_w 10000
    //   1114: lstore_3
    //   1115: aload_0
    //   1116: lload_3
    //   1117: putfield c : J
    //   1120: aload_0
    //   1121: getfield m : Landroid/os/Handler;
    //   1124: bipush #12
    //   1126: invokevirtual removeMessages : (I)V
    //   1129: aload_0
    //   1130: getfield i : Ljava/util/Map;
    //   1133: invokeinterface keySet : ()Ljava/util/Set;
    //   1138: invokeinterface iterator : ()Ljava/util/Iterator;
    //   1143: astore_1
    //   1144: aload_1
    //   1145: invokeinterface hasNext : ()Z
    //   1150: ifeq -> 1192
    //   1153: aload_1
    //   1154: invokeinterface next : ()Ljava/lang/Object;
    //   1159: checkcast com/google/android/gms/common/api/internal/b
    //   1162: astore #6
    //   1164: aload_0
    //   1165: getfield m : Landroid/os/Handler;
    //   1168: astore #7
    //   1170: aload #7
    //   1172: aload #7
    //   1174: bipush #12
    //   1176: aload #6
    //   1178: invokevirtual obtainMessage : (ILjava/lang/Object;)Landroid/os/Message;
    //   1181: aload_0
    //   1182: getfield c : J
    //   1185: invokevirtual sendMessageDelayed : (Landroid/os/Message;J)Z
    //   1188: pop
    //   1189: goto -> 1144
    //   1192: iconst_1
    //   1193: ireturn
  }
  
  public final class a<O extends com.google.android.gms.common.api.a.d> implements f.a, f.b, v0 {
    private final Queue<f0> a = new LinkedList<f0>();
    
    private final com.google.android.gms.common.api.a.f b;
    
    private final b<O> c;
    
    private final x0 d;
    
    private final Set<p0> e = new HashSet<p0>();
    
    private final Map<j<?>, e0> f = new HashMap<j<?>, e0>();
    
    private final int g;
    
    private final g0 h;
    
    private boolean i;
    
    private final List<g.b> j = new ArrayList<g.b>();
    
    private e.f.a.e.e.a k = null;
    
    public a(g this$0, e<O> param1e) {
      this.b = param1e.a(g.a(this$0).getLooper(), this);
      this.c = param1e.c();
      this.d = new x0();
      this.g = param1e.f();
      if (this.b.j()) {
        this.h = param1e.a(g.b(this$0), g.a(this$0));
        return;
      } 
      this.h = null;
    }
    
    private final e.f.a.e.e.c a(e.f.a.e.e.c[] param1ArrayOfc) {
      if (param1ArrayOfc != null) {
        if (param1ArrayOfc.length == 0)
          return null; 
        e.f.a.e.e.c[] arrayOfC2 = this.b.f();
        boolean bool = false;
        e.f.a.e.e.c[] arrayOfC1 = arrayOfC2;
        if (arrayOfC2 == null)
          arrayOfC1 = new e.f.a.e.e.c[0]; 
        b.d.a<String, Long> a1 = new b.d.a(arrayOfC1.length);
        int j = arrayOfC1.length;
        int i;
        for (i = 0; i < j; i++) {
          e.f.a.e.e.c c1 = arrayOfC1[i];
          a1.put(c1.b(), Long.valueOf(c1.c()));
        } 
        j = param1ArrayOfc.length;
        i = bool;
        while (i < j) {
          e.f.a.e.e.c c1 = param1ArrayOfc[i];
          Long long_ = a1.get(c1.b());
          if (long_ != null) {
            if (long_.longValue() < c1.c())
              return c1; 
            i++;
            continue;
          } 
          return c1;
        } 
      } 
      return null;
    }
    
    private final void a(int param1Int) {
      d();
      this.i = true;
      this.d.a(param1Int, this.b.h());
      g.a(this.l).sendMessageDelayed(Message.obtain(g.a(this.l), 9, this.c), g.c(this.l));
      g.a(this.l).sendMessageDelayed(Message.obtain(g.a(this.l), 11, this.c), g.d(this.l));
      g.e(this.l).a();
      Iterator iterator = this.f.values().iterator();
      while (iterator.hasNext())
        ((e0)iterator.next()).c.run(); 
    }
    
    private final void a(Status param1Status) {
      q.a(g.a(this.l));
      a(param1Status, null, false);
    }
    
    private final void a(Status param1Status, Exception param1Exception, boolean param1Boolean) {
      boolean bool1;
      q.a(g.a(this.l));
      boolean bool2 = true;
      if (param1Status == null) {
        bool1 = true;
      } else {
        bool1 = false;
      } 
      if (param1Exception != null)
        bool2 = false; 
      if (bool1 != bool2) {
        Iterator<f0> iterator = this.a.iterator();
        while (iterator.hasNext()) {
          f0 f0 = iterator.next();
          if (!param1Boolean || f0.a == 2) {
            if (param1Status != null) {
              f0.a(param1Status);
            } else {
              f0.a(param1Exception);
            } 
            iterator.remove();
          } 
        } 
        return;
      } 
      IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Status XOR exception should be null");
      throw illegalArgumentException;
    }
    
    private final void a(g.b param1b) {
      if (!this.j.contains(param1b))
        return; 
      if (!this.i) {
        if (!this.b.a()) {
          i();
          return;
        } 
        n();
      } 
    }
    
    private final void a(e.f.a.e.e.a param1a, Exception param1Exception) {
      q.a(g.a(this.l));
      g0 g01 = this.h;
      if (g01 != null)
        g01.e(); 
      d();
      g.e(this.l).a();
      c(param1a);
      if (param1a.b() == 4) {
        a(g.e());
        return;
      } 
      if (this.a.isEmpty()) {
        this.k = param1a;
        return;
      } 
      if (param1Exception != null) {
        q.a(g.a(this.l));
        a(null, param1Exception, false);
        return;
      } 
      if (!g.h(this.l)) {
        a(d(param1a));
        return;
      } 
      a(d(param1a), null, true);
      if (this.a.isEmpty())
        return; 
      if (b(param1a))
        return; 
      if (!this.l.a(param1a, this.g)) {
        if (param1a.b() == 18)
          this.i = true; 
        if (this.i) {
          g.a(this.l).sendMessageDelayed(Message.obtain(g.a(this.l), 9, this.c), g.c(this.l));
          return;
        } 
        a(d(param1a));
      } 
    }
    
    private final boolean a(boolean param1Boolean) {
      q.a(g.a(this.l));
      if (this.b.a() && this.f.size() == 0) {
        if (this.d.a()) {
          if (param1Boolean)
            p(); 
          return false;
        } 
        this.b.a("Timing out service connection.");
        return true;
      } 
      return false;
    }
    
    private final void b(g.b param1b) {
      if (this.j.remove(param1b)) {
        g.a(this.l).removeMessages(15, param1b);
        g.a(this.l).removeMessages(16, param1b);
        e.f.a.e.e.c c = g.b.b(param1b);
        ArrayList<f0> arrayList = new ArrayList(this.a.size());
        for (f0 f0 : this.a) {
          if (f0 instanceof s) {
            e.f.a.e.e.c[] arrayOfC = ((s)f0).b(this);
            if (arrayOfC != null && com.google.android.gms.common.util.b.a((Object[])arrayOfC, c))
              arrayList.add(f0); 
          } 
        } 
        int j = arrayList.size();
        int i = 0;
        while (i < j) {
          f0 f0 = (f0)arrayList.get(i);
          i++;
          f0 = f0;
          this.a.remove(f0);
          f0.a((Exception)new o(c));
        } 
      } 
    }
    
    private final boolean b(f0 param1f0) {
      if (!(param1f0 instanceof s)) {
        c(param1f0);
        return true;
      } 
      s s = (s)param1f0;
      e.f.a.e.e.c c = a(s.b(this));
      if (c == null) {
        c(param1f0);
        return true;
      } 
      String str1 = this.b.getClass().getName();
      String str2 = c.b();
      long l = c.c();
      StringBuilder stringBuilder = new StringBuilder(String.valueOf(str1).length() + 77 + String.valueOf(str2).length());
      stringBuilder.append(str1);
      stringBuilder.append(" could not execute call because it requires feature (");
      stringBuilder.append(str2);
      stringBuilder.append(", ");
      stringBuilder.append(l);
      stringBuilder.append(").");
      Log.w("GoogleApiManager", stringBuilder.toString());
      if (g.h(this.l) && s.c(this)) {
        g.b b1 = new g.b(this.c, c, null);
        int i = this.j.indexOf(b1);
        if (i >= 0) {
          b1 = this.j.get(i);
          g.a(this.l).removeMessages(15, b1);
          g.a(this.l).sendMessageDelayed(Message.obtain(g.a(this.l), 15, b1), g.c(this.l));
        } else {
          this.j.add(b1);
          g.a(this.l).sendMessageDelayed(Message.obtain(g.a(this.l), 15, b1), g.c(this.l));
          g.a(this.l).sendMessageDelayed(Message.obtain(g.a(this.l), 16, b1), g.d(this.l));
          e.f.a.e.e.a a1 = new e.f.a.e.e.a(2, null);
          if (!b(a1))
            this.l.a(a1, this.g); 
        } 
        return false;
      } 
      s.a((Exception)new o(c));
      return true;
    }
    
    private final boolean b(e.f.a.e.e.a param1a) {
      synchronized (g.d()) {
        if (g.f(this.l) != null && g.g(this.l).contains(this.c)) {
          g.f(this.l).b(param1a, this.g);
          return true;
        } 
        return false;
      } 
    }
    
    private final void c(f0 param1f0) {
      param1f0.a(this.d, k());
      try {
        return;
      } catch (DeadObjectException deadObjectException) {
        onConnectionSuspended(1);
        return;
      } finally {
        param1f0 = null;
      } 
    }
    
    private final void c(e.f.a.e.e.a param1a) {
      for (p0 p0 : this.e) {
        String str = null;
        if (o.a(param1a, e.f.a.e.e.a.g))
          str = this.b.g(); 
        p0.a(this.c, param1a, str);
      } 
      this.e.clear();
    }
    
    private final Status d(e.f.a.e.e.a param1a) {
      return g.a(this.c, param1a);
    }
    
    private final void m() {
      d();
      c(e.f.a.e.e.a.g);
      o();
      Iterator<e0> iterator = this.f.values().iterator();
      while (true) {
        if (iterator.hasNext()) {
          e0 e0 = iterator.next();
          if (a(e0.a.b()) == null)
            try {
              e0.a.a(this.b, new m());
              continue;
            } catch (DeadObjectException deadObjectException) {
              onConnectionSuspended(3);
              this.b.a("DeadObjectException thrown while calling register listener method.");
              n();
              p();
              return;
            } catch (RemoteException remoteException) {} 
          deadObjectException.remove();
          continue;
        } 
        n();
        p();
        return;
      } 
    }
    
    private final void n() {
      ArrayList<f0> arrayList = new ArrayList<f0>(this.a);
      int j = arrayList.size();
      int i = 0;
      while (i < j) {
        f0 f0 = (f0)arrayList.get(i);
        int k = i + 1;
        f0 = f0;
        if (this.b.a()) {
          i = k;
          if (b(f0)) {
            this.a.remove(f0);
            i = k;
          } 
        } 
      } 
    }
    
    private final void o() {
      if (this.i) {
        g.a(this.l).removeMessages(11, this.c);
        g.a(this.l).removeMessages(9, this.c);
        this.i = false;
      } 
    }
    
    private final void p() {
      g.a(this.l).removeMessages(12, this.c);
      g.a(this.l).sendMessageDelayed(g.a(this.l).obtainMessage(12, this.c), g.j(this.l));
    }
    
    public final void a() {
      q.a(g.a(this.l));
      a(g.o);
      this.d.b();
      Set<j<?>> set = this.f.keySet();
      int i = 0;
      j[] arrayOfJ = set.<j>toArray(new j[0]);
      int j = arrayOfJ.length;
      while (i < j) {
        a(new o0(arrayOfJ[i], new m()));
        i++;
      } 
      c(new e.f.a.e.e.a(4));
      if (this.b.a())
        this.b.a(new w(this)); 
    }
    
    public final void a(f0 param1f0) {
      q.a(g.a(this.l));
      if (this.b.a()) {
        if (b(param1f0)) {
          p();
          return;
        } 
        this.a.add(param1f0);
        return;
      } 
      this.a.add(param1f0);
      e.f.a.e.e.a a1 = this.k;
      if (a1 != null && a1.e()) {
        onConnectionFailed(this.k);
        return;
      } 
      i();
    }
    
    public final void a(p0 param1p0) {
      q.a(g.a(this.l));
      this.e.add(param1p0);
    }
    
    public final void a(e.f.a.e.e.a param1a) {
      q.a(g.a(this.l));
      com.google.android.gms.common.api.a.f f1 = this.b;
      String str1 = f1.getClass().getName();
      String str2 = String.valueOf(param1a);
      StringBuilder stringBuilder = new StringBuilder(String.valueOf(str1).length() + 25 + String.valueOf(str2).length());
      stringBuilder.append("onSignInFailed for ");
      stringBuilder.append(str1);
      stringBuilder.append(" with ");
      stringBuilder.append(str2);
      f1.a(stringBuilder.toString());
      onConnectionFailed(param1a);
    }
    
    public final com.google.android.gms.common.api.a.f b() {
      return this.b;
    }
    
    public final Map<j<?>, e0> c() {
      return this.f;
    }
    
    public final void d() {
      q.a(g.a(this.l));
      this.k = null;
    }
    
    public final e.f.a.e.e.a e() {
      q.a(g.a(this.l));
      return this.k;
    }
    
    public final void f() {
      q.a(g.a(this.l));
      if (this.i)
        i(); 
    }
    
    public final void g() {
      q.a(g.a(this.l));
      if (this.i) {
        Status status;
        o();
        if (g.i(this.l).a(g.b(this.l)) == 18) {
          status = new Status(21, "Connection timed out waiting for Google Play services update to complete.");
        } else {
          status = new Status(22, "API failed to connect while resuming due to an unknown error.");
        } 
        a(status);
        this.b.a("Timing out connection while resuming.");
      } 
    }
    
    public final boolean h() {
      return a(true);
    }
    
    public final void i() {
      q.a(g.a(this.l));
      if (!this.b.a()) {
        e.f.a.e.e.a a1;
        if (this.b.e())
          return; 
        try {
          int i = g.e(this.l).a(g.b(this.l), this.b);
          if (i != 0) {
            e.f.a.e.e.a a2 = new e.f.a.e.e.a(i, null);
            String str1 = this.b.getClass().getName();
            String str2 = String.valueOf(a2);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str1).length() + 35 + String.valueOf(str2).length());
            stringBuilder.append("The service for ");
            stringBuilder.append(str1);
            stringBuilder.append(" is not available: ");
            stringBuilder.append(str2);
            Log.w("GoogleApiManager", stringBuilder.toString());
            onConnectionFailed(a2);
            return;
          } 
          g.c c = new g.c(this.l, this.b, this.c);
          if (this.b.j()) {
            g0 g01 = this.h;
            q.a(g01);
            g01.a(c);
          } 
          try {
            this.b.a(c);
            return;
          } catch (SecurityException securityException) {
            a1 = new e.f.a.e.e.a(10);
          } 
        } catch (IllegalStateException illegalStateException) {
          a1 = new e.f.a.e.e.a(10);
        } 
        a(a1, illegalStateException);
        return;
      } 
    }
    
    final boolean j() {
      return this.b.a();
    }
    
    public final boolean k() {
      return this.b.j();
    }
    
    public final int l() {
      return this.g;
    }
    
    public final void onConnected(Bundle param1Bundle) {
      if (Looper.myLooper() == g.a(this.l).getLooper()) {
        m();
        return;
      } 
      g.a(this.l).post(new v(this));
    }
    
    public final void onConnectionFailed(e.f.a.e.e.a param1a) {
      a(param1a, (Exception)null);
    }
    
    public final void onConnectionSuspended(int param1Int) {
      if (Looper.myLooper() == g.a(this.l).getLooper()) {
        a(param1Int);
        return;
      } 
      g.a(this.l).post(new u(this, param1Int));
    }
  }
  
  private static final class b {
    private final b<?> a;
    
    private final e.f.a.e.e.c b;
    
    private b(b<?> param1b, e.f.a.e.e.c param1c) {
      this.a = param1b;
      this.b = param1c;
    }
    
    public final boolean equals(Object param1Object) {
      if (param1Object != null && param1Object instanceof b) {
        param1Object = param1Object;
        if (o.a(this.a, ((b)param1Object).a) && o.a(this.b, ((b)param1Object).b))
          return true; 
      } 
      return false;
    }
    
    public final int hashCode() {
      return o.a(new Object[] { this.a, this.b });
    }
    
    public final String toString() {
      o.a a = o.a(this);
      a.a("key", this.a);
      a.a("feature", this.b);
      return a.toString();
    }
  }
  
  private final class c implements j0, com.google.android.gms.common.internal.c.c {
    private final com.google.android.gms.common.api.a.f a;
    
    private final b<?> b;
    
    private j c = null;
    
    private Set<Scope> d = null;
    
    private boolean e = false;
    
    public c(g this$0, com.google.android.gms.common.api.a.f param1f, b<?> param1b) {
      this.a = param1f;
      this.b = param1b;
    }
    
    private final void a() {
      if (this.e) {
        j j1 = this.c;
        if (j1 != null)
          this.a.a(j1, this.d); 
      } 
    }
    
    public final void a(j param1j, Set<Scope> param1Set) {
      if (param1j == null || param1Set == null) {
        Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
        b(new e.f.a.e.e.a(4));
        return;
      } 
      this.c = param1j;
      this.d = param1Set;
      a();
    }
    
    public final void a(e.f.a.e.e.a param1a) {
      g.a(this.f).post(new y(this, param1a));
    }
    
    public final void b(e.f.a.e.e.a param1a) {
      g.a a1 = (g.a)g.k(this.f).get(this.b);
      if (a1 != null)
        a1.a(param1a); 
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/common/api/internal/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */