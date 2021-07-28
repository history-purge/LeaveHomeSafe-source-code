package com.facebook.react.uimanager;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.uimanager.events.d;
import com.facebook.react.uimanager.g1.a;
import com.facebook.yoga.h;
import java.util.Iterator;
import java.util.Map;

public class o0 {
  protected Object a = new Object();
  
  protected final d b;
  
  protected final ReactApplicationContext c;
  
  protected final h0 d = new h0();
  
  private final a1 e;
  
  private final v0 f;
  
  private final n g;
  
  private final int[] h = new int[4];
  
  private long i = 0L;
  
  protected b j;
  
  o0(ReactApplicationContext paramReactApplicationContext, a1 parama1, d paramd, int paramInt) {
    this(paramReactApplicationContext, parama1, new v0(paramReactApplicationContext, new m(parama1), paramInt), paramd);
  }
  
  protected o0(ReactApplicationContext paramReactApplicationContext, a1 parama1, v0 paramv0, d paramd) {
    this.c = paramReactApplicationContext;
    this.e = parama1;
    this.f = paramv0;
    this.g = new n(this.f, this.d);
    this.b = paramd;
  }
  
  private void a(int paramInt1, int paramInt2, int[] paramArrayOfint) {
    StringBuilder stringBuilder;
    a0<Object> a0 = this.d.a(paramInt1);
    a0 a01 = this.d.a(paramInt2);
    if (a0 == null || a01 == null) {
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("Tag ");
      if (a0 != null)
        paramInt1 = paramInt2; 
      stringBuilder1.append(paramInt1);
      stringBuilder1.append(" does not exist");
      g g = new g(stringBuilder1.toString());
      throw g;
    } 
    if (a0 != a01) {
      a0<a0> a02 = (a0<a0>)a0.getParent();
      while (a02 != a01) {
        if (a02 != null) {
          a02 = a02.getParent();
          continue;
        } 
        stringBuilder = new StringBuilder();
        stringBuilder.append("Tag ");
        stringBuilder.append(paramInt2);
        stringBuilder.append(" is not an ancestor of tag ");
        stringBuilder.append(paramInt1);
        throw new g(stringBuilder.toString());
      } 
    } 
    a(a0, a01, (int[])stringBuilder);
  }
  
  private void a(int paramInt, String paramString) {
    if (this.d.a(paramInt) != null)
      return; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Unable to execute operation ");
    stringBuilder.append(paramString);
    stringBuilder.append(" on view with tag: ");
    stringBuilder.append(paramInt);
    stringBuilder.append(", since the view does not exists");
    throw new g(stringBuilder.toString());
  }
  
  private void a(int paramInt, int[] paramArrayOfint) {
    a0<Object> a0 = this.d.a(paramInt);
    if (a0 != null) {
      a0 a01 = (a0)a0.getParent();
      if (a01 != null) {
        a(a0, a01, paramArrayOfint);
        return;
      } 
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("View with tag ");
      stringBuilder1.append(paramInt);
      stringBuilder1.append(" doesn't have a parent!");
      throw new g(stringBuilder1.toString());
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("No native view for tag ");
    stringBuilder.append(paramInt);
    stringBuilder.append(" exists!");
    throw new g(stringBuilder.toString());
  }
  
  private void a(a0<Object> parama01, a0 parama02, int[] paramArrayOfint) {
    boolean bool1;
    boolean bool2;
    if (parama01 != parama02) {
      bool2 = Math.round(parama01.u());
      bool1 = Math.round(parama01.p());
      for (a0<a0> a01 = (a0<a0>)parama01.getParent(); a01 != parama02; a01 = a01.getParent()) {
        e.e.m.a.a.a(a01);
        c(a01);
        bool2 += Math.round(a01.u());
        bool1 += Math.round(a01.p());
      } 
      c(parama02);
    } else {
      bool2 = false;
      bool1 = false;
    } 
    paramArrayOfint[0] = bool2;
    paramArrayOfint[1] = bool1;
    paramArrayOfint[2] = parama01.b();
    paramArrayOfint[3] = parama01.c();
  }
  
  private void c(a0 parama0) {
    ViewManager viewManager = this.e.a(parama0.m());
    e.e.m.a.a.a(viewManager);
    viewManager = viewManager;
    if (viewManager instanceof f) {
      f f = (f)viewManager;
      if (f != null) {
        if (!f.needsCustomLayoutForChildren())
          return; 
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("Trying to measure a view using measureLayout/measureLayoutRelativeToParent relative to an ancestor that requires custom layout for it's children (");
        stringBuilder1.append(parama0.m());
        stringBuilder1.append("). Use measure instead.");
        throw new g(stringBuilder1.toString());
      } 
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Trying to use view ");
    stringBuilder.append(parama0.m());
    stringBuilder.append(" as a parent, but its Manager doesn't extends ViewGroupManager");
    throw new g(stringBuilder.toString());
  }
  
  private void d(a0<a0> parama0) {
    if (!parama0.n())
      return; 
    for (int i = 0; i < parama0.a(); i++)
      d(parama0.a(i)); 
    parama0.a(this.g);
  }
  
  private void e(a0<a0> parama0) {
    n.e(parama0);
    this.d.d(parama0.t());
    for (int i = parama0.a() - 1; i >= 0; i--)
      e(parama0.a(i)); 
    parama0.s();
  }
  
  private void k() {
    if (this.f.e())
      a(-1); 
  }
  
  protected a0 a(String paramString) {
    return (a0)this.e.a(paramString).createShadowNodeInstance(this.c);
  }
  
  public void a() {
    this.f.a();
  }
  
  public void a(int paramInt) {
    null = com.facebook.systrace.b.a(0L, "UIImplementation.dispatchViewUpdates");
    null.a("batchId", paramInt);
    null.a();
    long l = SystemClock.uptimeMillis();
    try {
      j();
      this.g.a();
      this.f.a(paramInt, l, this.i);
      return;
    } finally {
      com.facebook.systrace.a.a(0L);
    } 
  }
  
  public void a(int paramInt, float paramFloat1, float paramFloat2, Callback paramCallback) {
    this.f.a(paramInt, paramFloat1, paramFloat2, paramCallback);
  }
  
  public void a(int paramInt1, int paramInt2) {
    if (!this.d.c(paramInt1) && !this.d.c(paramInt2)) {
      a0<Object> a0 = this.d.a(paramInt1);
      if (a0 != null) {
        a0<a0<Object>> a01 = (a0<a0<Object>>)a0.getParent();
        if (a01 != null) {
          paramInt1 = a01.a(a0);
          if (paramInt1 >= 0) {
            WritableArray writableArray1 = Arguments.createArray();
            writableArray1.pushInt(paramInt2);
            WritableArray writableArray2 = Arguments.createArray();
            writableArray2.pushInt(paramInt1);
            WritableArray writableArray3 = Arguments.createArray();
            writableArray3.pushInt(paramInt1);
            a(a01.t(), null, null, (ReadableArray)writableArray1, (ReadableArray)writableArray2, (ReadableArray)writableArray3);
            return;
          } 
          throw new IllegalStateException("Didn't find child tag in parent");
        } 
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("Node is not attached to a parent: ");
        stringBuilder1.append(paramInt1);
        throw new g(stringBuilder1.toString());
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Trying to replace unknown view tag: ");
      stringBuilder.append(paramInt1);
      throw new g(stringBuilder.toString());
    } 
    throw new g("Trying to add or replace a root tag!");
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3) {
    StringBuilder stringBuilder;
    a0 a0 = this.d.a(paramInt1);
    if (a0 == null) {
      stringBuilder = new StringBuilder();
      stringBuilder.append("Tried to update size of non-existent tag: ");
      stringBuilder.append(paramInt1);
      e.e.e.e.a.e("ReactNative", stringBuilder.toString());
      return;
    } 
    stringBuilder.b(paramInt2);
    stringBuilder.a(paramInt3);
    k();
  }
  
  @Deprecated
  public void a(int paramInt1, int paramInt2, Callback paramCallback) {
    a0<a0> a0 = this.d.a(paramInt1);
    a0 a01 = this.d.a(paramInt2);
    if (a0 == null || a01 == null) {
      paramCallback.invoke(new Object[] { Boolean.valueOf(false) });
      return;
    } 
    paramCallback.invoke(new Object[] { Boolean.valueOf(a0.c(a01)) });
  }
  
  public void a(int paramInt1, int paramInt2, Callback paramCallback1, Callback paramCallback2) {
    try {
      a(paramInt1, paramInt2, this.h);
      paramCallback2.invoke(new Object[] { Float.valueOf(q.a(this.h[0])), Float.valueOf(q.a(this.h[1])), Float.valueOf(q.a(this.h[2])), Float.valueOf(q.a(this.h[3])) });
      return;
    } catch (g g) {
      paramCallback1.invoke(new Object[] { g.getMessage() });
      return;
    } 
  }
  
  @Deprecated
  public void a(int paramInt1, int paramInt2, ReadableArray paramReadableArray) {
    a(paramInt1, "dispatchViewManagerCommand");
    this.f.a(paramInt1, paramInt2, paramReadableArray);
  }
  
  public void a(int paramInt, Callback paramCallback) {
    this.f.a(paramInt, paramCallback);
  }
  
  public void a(int paramInt, Callback paramCallback1, Callback paramCallback2) {
    try {
      a(paramInt, this.h);
      paramCallback2.invoke(new Object[] { Float.valueOf(q.a(this.h[0])), Float.valueOf(q.a(this.h[1])), Float.valueOf(q.a(this.h[2])), Float.valueOf(q.a(this.h[3])) });
      return;
    } catch (g g) {
      paramCallback1.invoke(new Object[] { g.getMessage() });
      return;
    } 
  }
  
  public void a(int paramInt, ReadableArray paramReadableArray) {
    synchronized (this.a) {
      StringBuilder stringBuilder;
      a0<a0> a0 = this.d.a(paramInt);
      paramInt = 0;
      while (paramInt < paramReadableArray.size()) {
        a0 a01 = this.d.a(paramReadableArray.getInt(paramInt));
        if (a01 != null) {
          a0.a(a01, paramInt);
          paramInt++;
          continue;
        } 
        stringBuilder = new StringBuilder();
        stringBuilder.append("Trying to add unknown view tag: ");
        stringBuilder.append(paramReadableArray.getInt(paramInt));
        throw new g(stringBuilder.toString());
      } 
      this.g.a((a0)stringBuilder, paramReadableArray);
      return;
    } 
  }
  
  public void a(int paramInt, ReadableArray paramReadableArray, Callback paramCallback1, Callback paramCallback2) {
    a(paramInt, "showPopupMenu");
    this.f.a(paramInt, paramReadableArray, paramCallback1, paramCallback2);
  }
  
  public void a(int paramInt, ReadableArray paramReadableArray1, ReadableArray paramReadableArray2, ReadableArray paramReadableArray3, ReadableArray paramReadableArray4, ReadableArray paramReadableArray5) {
    // Byte code:
    //   0: aload_0
    //   1: getfield a : Ljava/lang/Object;
    //   4: astore #17
    //   6: aload #17
    //   8: monitorenter
    //   9: aload_0
    //   10: getfield d : Lcom/facebook/react/uimanager/h0;
    //   13: iload_1
    //   14: invokevirtual a : (I)Lcom/facebook/react/uimanager/a0;
    //   17: astore #14
    //   19: aload_2
    //   20: ifnonnull -> 29
    //   23: iconst_0
    //   24: istore #7
    //   26: goto -> 681
    //   29: aload_2
    //   30: invokeinterface size : ()I
    //   35: istore #7
    //   37: goto -> 681
    //   40: aload #4
    //   42: invokeinterface size : ()I
    //   47: istore #9
    //   49: goto -> 689
    //   52: aload #6
    //   54: invokeinterface size : ()I
    //   59: istore #8
    //   61: iload #7
    //   63: ifeq -> 95
    //   66: aload_3
    //   67: ifnull -> 84
    //   70: iload #7
    //   72: aload_3
    //   73: invokeinterface size : ()I
    //   78: if_icmpne -> 84
    //   81: goto -> 95
    //   84: new com/facebook/react/uimanager/g
    //   87: dup
    //   88: ldc_w 'Size of moveFrom != size of moveTo!'
    //   91: invokespecial <init> : (Ljava/lang/String;)V
    //   94: athrow
    //   95: iload #9
    //   97: ifeq -> 131
    //   100: aload #5
    //   102: ifnull -> 120
    //   105: iload #9
    //   107: aload #5
    //   109: invokeinterface size : ()I
    //   114: if_icmpne -> 120
    //   117: goto -> 131
    //   120: new com/facebook/react/uimanager/g
    //   123: dup
    //   124: ldc_w 'Size of addChildTags != size of addAtIndices!'
    //   127: invokespecial <init> : (Ljava/lang/String;)V
    //   130: athrow
    //   131: iload #7
    //   133: iload #9
    //   135: iadd
    //   136: anewarray com/facebook/react/uimanager/w0
    //   139: astore #18
    //   141: iload #7
    //   143: iload #8
    //   145: iadd
    //   146: newarray int
    //   148: astore #19
    //   150: aload #19
    //   152: arraylength
    //   153: newarray int
    //   155: astore #20
    //   157: iload #8
    //   159: newarray int
    //   161: astore #15
    //   163: aload #14
    //   165: astore #13
    //   167: aload #15
    //   169: astore #16
    //   171: iload #7
    //   173: ifle -> 275
    //   176: aload_2
    //   177: invokestatic a : (Ljava/lang/Object;)Ljava/lang/Object;
    //   180: pop
    //   181: aload_3
    //   182: invokestatic a : (Ljava/lang/Object;)Ljava/lang/Object;
    //   185: pop
    //   186: iconst_0
    //   187: istore #10
    //   189: aload #14
    //   191: astore #13
    //   193: aload #15
    //   195: astore #16
    //   197: iload #10
    //   199: iload #7
    //   201: if_icmpge -> 275
    //   204: aload_2
    //   205: iload #10
    //   207: invokeinterface getInt : (I)I
    //   212: istore #11
    //   214: aload #14
    //   216: iload #11
    //   218: invokeinterface a : (I)Lcom/facebook/react/uimanager/a0;
    //   223: invokeinterface t : ()I
    //   228: istore #12
    //   230: aload #18
    //   232: iload #10
    //   234: new com/facebook/react/uimanager/w0
    //   237: dup
    //   238: iload #12
    //   240: aload_3
    //   241: iload #10
    //   243: invokeinterface getInt : (I)I
    //   248: invokespecial <init> : (II)V
    //   251: aastore
    //   252: aload #19
    //   254: iload #10
    //   256: iload #11
    //   258: iastore
    //   259: aload #20
    //   261: iload #10
    //   263: iload #12
    //   265: iastore
    //   266: iload #10
    //   268: iconst_1
    //   269: iadd
    //   270: istore #10
    //   272: goto -> 189
    //   275: iload #9
    //   277: ifle -> 344
    //   280: aload #4
    //   282: invokestatic a : (Ljava/lang/Object;)Ljava/lang/Object;
    //   285: pop
    //   286: aload #5
    //   288: invokestatic a : (Ljava/lang/Object;)Ljava/lang/Object;
    //   291: pop
    //   292: iconst_0
    //   293: istore #10
    //   295: iload #10
    //   297: iload #9
    //   299: if_icmpge -> 344
    //   302: aload #18
    //   304: iload #7
    //   306: iload #10
    //   308: iadd
    //   309: new com/facebook/react/uimanager/w0
    //   312: dup
    //   313: aload #4
    //   315: iload #10
    //   317: invokeinterface getInt : (I)I
    //   322: aload #5
    //   324: iload #10
    //   326: invokeinterface getInt : (I)I
    //   331: invokespecial <init> : (II)V
    //   334: aastore
    //   335: iload #10
    //   337: iconst_1
    //   338: iadd
    //   339: istore #10
    //   341: goto -> 295
    //   344: aload #13
    //   346: astore_2
    //   347: iload #8
    //   349: ifle -> 435
    //   352: aload #6
    //   354: invokestatic a : (Ljava/lang/Object;)Ljava/lang/Object;
    //   357: pop
    //   358: iconst_0
    //   359: istore #9
    //   361: aload #13
    //   363: astore_2
    //   364: iload #9
    //   366: iload #8
    //   368: if_icmpge -> 435
    //   371: aload #6
    //   373: iload #9
    //   375: invokeinterface getInt : (I)I
    //   380: istore #10
    //   382: aload #13
    //   384: iload #10
    //   386: invokeinterface a : (I)Lcom/facebook/react/uimanager/a0;
    //   391: invokeinterface t : ()I
    //   396: istore #11
    //   398: iload #7
    //   400: iload #9
    //   402: iadd
    //   403: istore #12
    //   405: aload #19
    //   407: iload #12
    //   409: iload #10
    //   411: iastore
    //   412: aload #20
    //   414: iload #12
    //   416: iload #11
    //   418: iastore
    //   419: aload #16
    //   421: iload #9
    //   423: iload #11
    //   425: iastore
    //   426: iload #9
    //   428: iconst_1
    //   429: iadd
    //   430: istore #9
    //   432: goto -> 361
    //   435: aload #18
    //   437: getstatic com/facebook/react/uimanager/w0.c : Ljava/util/Comparator;
    //   440: invokestatic sort : ([Ljava/lang/Object;Ljava/util/Comparator;)V
    //   443: aload #19
    //   445: invokestatic sort : ([I)V
    //   448: aload #19
    //   450: arraylength
    //   451: iconst_1
    //   452: isub
    //   453: istore #7
    //   455: iconst_m1
    //   456: istore #8
    //   458: iload #7
    //   460: iflt -> 704
    //   463: aload #19
    //   465: iload #7
    //   467: iaload
    //   468: iload #8
    //   470: if_icmpeq -> 501
    //   473: aload_2
    //   474: aload #19
    //   476: iload #7
    //   478: iaload
    //   479: invokeinterface b : (I)Lcom/facebook/react/uimanager/a0;
    //   484: pop
    //   485: aload #19
    //   487: iload #7
    //   489: iaload
    //   490: istore #8
    //   492: iload #7
    //   494: iconst_1
    //   495: isub
    //   496: istore #7
    //   498: goto -> 458
    //   501: new java/lang/StringBuilder
    //   504: dup
    //   505: invokespecial <init> : ()V
    //   508: astore_2
    //   509: aload_2
    //   510: ldc_w 'Repeated indices in Removal list for view tag: '
    //   513: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   516: pop
    //   517: aload_2
    //   518: iload_1
    //   519: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   522: pop
    //   523: new com/facebook/react/uimanager/g
    //   526: dup
    //   527: aload_2
    //   528: invokevirtual toString : ()Ljava/lang/String;
    //   531: invokespecial <init> : (Ljava/lang/String;)V
    //   534: athrow
    //   535: iload_1
    //   536: aload #18
    //   538: arraylength
    //   539: if_icmpge -> 621
    //   542: aload #18
    //   544: iload_1
    //   545: aaload
    //   546: astore_3
    //   547: aload_0
    //   548: getfield d : Lcom/facebook/react/uimanager/h0;
    //   551: aload_3
    //   552: getfield a : I
    //   555: invokevirtual a : (I)Lcom/facebook/react/uimanager/a0;
    //   558: astore #4
    //   560: aload #4
    //   562: ifnull -> 584
    //   565: aload_2
    //   566: aload #4
    //   568: aload_3
    //   569: getfield b : I
    //   572: invokeinterface a : (Lcom/facebook/react/uimanager/a0;I)V
    //   577: iload_1
    //   578: iconst_1
    //   579: iadd
    //   580: istore_1
    //   581: goto -> 535
    //   584: new java/lang/StringBuilder
    //   587: dup
    //   588: invokespecial <init> : ()V
    //   591: astore_2
    //   592: aload_2
    //   593: ldc_w 'Trying to add unknown view tag: '
    //   596: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   599: pop
    //   600: aload_2
    //   601: aload_3
    //   602: getfield a : I
    //   605: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   608: pop
    //   609: new com/facebook/react/uimanager/g
    //   612: dup
    //   613: aload_2
    //   614: invokevirtual toString : ()Ljava/lang/String;
    //   617: invokespecial <init> : (Ljava/lang/String;)V
    //   620: athrow
    //   621: aload_0
    //   622: getfield g : Lcom/facebook/react/uimanager/n;
    //   625: aload_2
    //   626: aload #19
    //   628: aload #20
    //   630: aload #18
    //   632: aload #16
    //   634: invokevirtual a : (Lcom/facebook/react/uimanager/a0;[I[I[Lcom/facebook/react/uimanager/w0;[I)V
    //   637: iconst_0
    //   638: istore_1
    //   639: iload_1
    //   640: aload #16
    //   642: arraylength
    //   643: if_icmpge -> 668
    //   646: aload_0
    //   647: aload_0
    //   648: getfield d : Lcom/facebook/react/uimanager/h0;
    //   651: aload #16
    //   653: iload_1
    //   654: iaload
    //   655: invokevirtual a : (I)Lcom/facebook/react/uimanager/a0;
    //   658: invokevirtual b : (Lcom/facebook/react/uimanager/a0;)V
    //   661: iload_1
    //   662: iconst_1
    //   663: iadd
    //   664: istore_1
    //   665: goto -> 639
    //   668: aload #17
    //   670: monitorexit
    //   671: return
    //   672: aload #17
    //   674: monitorexit
    //   675: aload_2
    //   676: athrow
    //   677: astore_2
    //   678: goto -> 672
    //   681: aload #4
    //   683: ifnonnull -> 40
    //   686: iconst_0
    //   687: istore #9
    //   689: aload #6
    //   691: ifnonnull -> 52
    //   694: iconst_0
    //   695: istore #8
    //   697: goto -> 61
    //   700: astore_2
    //   701: goto -> 672
    //   704: iconst_0
    //   705: istore_1
    //   706: goto -> 535
    //   709: astore_2
    //   710: goto -> 672
    // Exception table:
    //   from	to	target	type
    //   9	19	709	finally
    //   29	37	709	finally
    //   40	49	709	finally
    //   52	61	709	finally
    //   70	81	709	finally
    //   84	95	709	finally
    //   105	117	709	finally
    //   120	131	709	finally
    //   131	163	709	finally
    //   176	186	700	finally
    //   204	252	700	finally
    //   280	292	700	finally
    //   302	335	700	finally
    //   352	358	700	finally
    //   371	398	700	finally
    //   435	455	700	finally
    //   473	485	700	finally
    //   501	535	700	finally
    //   535	542	700	finally
    //   547	560	677	finally
    //   565	577	677	finally
    //   584	621	677	finally
    //   621	637	677	finally
    //   639	661	677	finally
    //   668	671	677	finally
    //   672	675	677	finally
  }
  
  public void a(int paramInt, c0 paramc0) {
    UiThreadUtil.assertOnUiThread();
    this.f.c().a(paramInt, paramc0);
  }
  
  public void a(int paramInt, Object paramObject) {
    a0 a0 = this.d.a(paramInt);
    if (a0 == null) {
      paramObject = new StringBuilder();
      paramObject.append("Attempt to set local data for view with unknown tag: ");
      paramObject.append(paramInt);
      e.e.e.e.a.e("ReactNative", paramObject.toString());
      return;
    } 
    a0.a(paramObject);
    k();
  }
  
  public void a(int paramInt1, String paramString, int paramInt2, ReadableMap paramReadableMap) {
    synchronized (this.a) {
      c0 c0;
      a0 a01 = a(paramString);
      a0 a02 = this.d.a(paramInt2);
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Root node with tag ");
      stringBuilder.append(paramInt2);
      stringBuilder.append(" doesn't exist");
      e.e.m.a.a.a(a02, stringBuilder.toString());
      a01.c(paramInt1);
      a01.a(paramString);
      a01.e(a02.t());
      a01.a(a02.h());
      this.d.a(a01);
      paramString = null;
      if (paramReadableMap != null) {
        c0 = new c0(paramReadableMap);
        a01.a(c0);
      } 
      a(a01, paramInt2, c0);
      return;
    } 
  }
  
  public void a(int paramInt, String paramString, ReadableArray paramReadableArray) {
    a(paramInt, "dispatchViewManagerCommand");
    this.f.a(paramInt, paramString, paramReadableArray);
  }
  
  public void a(int paramInt, String paramString, ReadableMap paramReadableMap) {
    StringBuilder stringBuilder1;
    if (this.e.a(paramString) != null) {
      a0 a0 = this.d.a(paramInt);
      if (a0 != null) {
        if (paramReadableMap != null) {
          c0 c0 = new c0(paramReadableMap);
          a0.a(c0);
          a(a0, paramString, c0);
        } 
        return;
      } 
      stringBuilder1 = new StringBuilder();
      stringBuilder1.append("Trying to update non-existent view with tag ");
      stringBuilder1.append(paramInt);
      throw new g(stringBuilder1.toString());
    } 
    StringBuilder stringBuilder2 = new StringBuilder();
    stringBuilder2.append("Got unknown view type: ");
    stringBuilder2.append((String)stringBuilder1);
    throw new g(stringBuilder2.toString());
  }
  
  public void a(int paramInt, boolean paramBoolean) {
    a0<a0> a02 = this.d.a(paramInt);
    a0<a0> a01 = a02;
    if (a02 == null)
      return; 
    while (a01.i() == l.e)
      a01 = a01.getParent(); 
    this.f.a(a01.t(), paramInt, paramBoolean);
  }
  
  public <T extends View> void a(T paramT, int paramInt, k0 paramk0) {
    synchronized (this.a) {
      a0 a0 = b();
      a0.c(paramInt);
      a0.a(paramk0);
      paramk0.runOnNativeModulesQueueThread(new a(this, a0));
      this.f.a(paramInt, (View)paramT);
      return;
    } 
  }
  
  public void a(ReadableMap paramReadableMap, Callback paramCallback) {
    this.f.a(paramReadableMap, paramCallback);
  }
  
  protected void a(a0 parama0) {
    com.facebook.systrace.b.b b1 = com.facebook.systrace.b.a(0L, "cssRoot.calculateLayout");
    b1.a("rootTag", parama0.t());
    b1.a();
    long l = SystemClock.uptimeMillis();
    try {
      float f1;
      int i = parama0.getWidthMeasureSpec().intValue();
      int j = parama0.getHeightMeasureSpec().intValue();
      int k = View.MeasureSpec.getMode(i);
      float f2 = Float.NaN;
      if (k == 0) {
        f1 = Float.NaN;
      } else {
        f1 = View.MeasureSpec.getSize(i);
      } 
      if (View.MeasureSpec.getMode(j) != 0)
        f2 = View.MeasureSpec.getSize(j); 
      parama0.a(f1, f2);
      return;
    } finally {
      com.facebook.systrace.a.a(0L);
      this.i = SystemClock.uptimeMillis() - l;
    } 
  }
  
  protected void a(a0 parama0, float paramFloat1, float paramFloat2) {
    if (!parama0.n())
      return; 
    Iterable<? extends a0> iterable = parama0.r();
    if (iterable != null) {
      Iterator<? extends a0> iterator = iterable.iterator();
      while (iterator.hasNext())
        a(iterator.next(), parama0.u() + paramFloat1, parama0.p() + paramFloat2); 
    } 
    int i = parama0.t();
    if (!this.d.c(i) && parama0.a(paramFloat1, paramFloat2, this.f, this.g) && parama0.k())
      this.b.a(p.b(i, parama0.q(), parama0.g(), parama0.b(), parama0.c())); 
    parama0.e();
    if (e.e.o.b0.a.h)
      this.g.c(parama0); 
  }
  
  public void a(a0 parama0, int paramInt1, int paramInt2) {
    parama0.a(paramInt1, paramInt2);
  }
  
  protected void a(a0 parama0, int paramInt, c0 paramc0) {
    if (!parama0.y())
      this.g.a(parama0, parama0.h(), paramc0); 
  }
  
  protected void a(a0 parama0, String paramString, c0 paramc0) {
    if (!parama0.y())
      this.g.a(parama0, paramString, paramc0); 
  }
  
  public void a(a parama) {
    this.f.a(parama);
  }
  
  public void a(n0 paramn0) {
    this.f.a(paramn0);
  }
  
  public void a(boolean paramBoolean) {
    this.f.a(paramBoolean);
  }
  
  protected final ViewManager b(String paramString) {
    return this.e.b(paramString);
  }
  
  protected a0 b() {
    b0 b0 = new b0();
    if (com.facebook.react.modules.i18nmanager.a.a().b((Context)this.c))
      b0.a(h.e); 
    b0.a("Root");
    return b0;
  }
  
  public void b(int paramInt) {
    synchronized (this.a) {
      this.d.e(paramInt);
      return;
    } 
  }
  
  public void b(int paramInt1, int paramInt2) {
    this.f.a(paramInt1, paramInt2);
  }
  
  public void b(int paramInt1, int paramInt2, int paramInt3) {
    StringBuilder stringBuilder;
    a0 a0 = this.d.a(paramInt1);
    if (a0 == null) {
      stringBuilder = new StringBuilder();
      stringBuilder.append("Tried to update non-existent root tag: ");
      stringBuilder.append(paramInt1);
      e.e.e.e.a.e("ReactNative", stringBuilder.toString());
      return;
    } 
    a((a0)stringBuilder, paramInt2, paramInt3);
  }
  
  public void b(int paramInt, Callback paramCallback) {
    this.f.b(paramInt, paramCallback);
  }
  
  protected final void b(a0 parama0) {
    e(parama0);
    parama0.dispose();
  }
  
  public void b(n0 paramn0) {
    this.f.b(paramn0);
  }
  
  public void c() {
    this.f.b();
  }
  
  public void c(int paramInt) {
    b(paramInt);
    this.f.a(paramInt);
  }
  
  public Map<String, Long> d() {
    return this.f.d();
  }
  
  public void d(int paramInt) {
    a0 a0 = this.d.a(paramInt);
    if (a0 != null) {
      WritableArray writableArray = Arguments.createArray();
      for (int i = 0; i < a0.a(); i++)
        writableArray.pushInt(i); 
      a(paramInt, null, null, null, null, (ReadableArray)writableArray);
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Trying to remove subviews of an unknown view tag: ");
    stringBuilder.append(paramInt);
    g g = new g(stringBuilder.toString());
    throw g;
  }
  
  public int e(int paramInt) {
    if (this.d.c(paramInt))
      return paramInt; 
    a0 a0 = f(paramInt);
    if (a0 != null)
      return a0.j(); 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Warning : attempted to resolve a non-existent react shadow node. reactTag=");
    stringBuilder.append(paramInt);
    e.e.e.e.a.e("ReactNative", stringBuilder.toString());
    return 0;
  }
  
  v0 e() {
    return this.f;
  }
  
  public final a0 f(int paramInt) {
    return this.d.a(paramInt);
  }
  
  public void f() {}
  
  public void g() {
    this.f.f();
  }
  
  public void h() {
    this.f.h();
  }
  
  public void i() {
    this.f.g();
  }
  
  protected void j() {
    com.facebook.systrace.a.a(0L, "UIImplementation.updateViewHierarchy");
    int i = 0;
    try {
      while (i < this.d.a()) {
        int j = this.d.b(i);
        a0 a0 = this.d.a(j);
        if (a0.getWidthMeasureSpec() != null && a0.getHeightMeasureSpec() != null) {
          com.facebook.systrace.b.b b1 = com.facebook.systrace.b.a(0L, "UIImplementation.notifyOnBeforeLayoutRecursive");
          b1.a("rootTag", a0.t());
          b1.a();
          try {
            d(a0);
            com.facebook.systrace.a.a(0L);
            a(a0);
            b1 = com.facebook.systrace.b.a(0L, "UIImplementation.applyUpdatesRecursive");
            b1.a("rootTag", a0.t());
            b1.a();
          } finally {
            com.facebook.systrace.a.a(0L);
          } 
        } 
        i++;
      } 
      return;
    } finally {
      com.facebook.systrace.a.a(0L);
    } 
  }
  
  class a implements Runnable {
    a(o0 this$0, a0 param1a0) {}
    
    public void run() {
      this.d.d.b(this.c);
    }
  }
  
  public static interface b {
    void a(a0 param1a0);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/uimanager/o0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */