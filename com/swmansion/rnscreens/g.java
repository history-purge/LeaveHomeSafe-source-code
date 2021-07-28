package com.swmansion.rnscreens;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.n;
import androidx.fragment.app.x;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class g extends d<h> {
  private final ArrayList<h> l = new ArrayList<h>();
  
  private final Set<h> m = new HashSet<h>();
  
  private h n = null;
  
  private boolean o = false;
  
  private final n.o p = new a(this);
  
  private final n.m q = new b(this);
  
  public g(Context paramContext) {
    super(paramContext);
  }
  
  private void g() {
    ((UIManagerModule)((ReactContext)getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher().a(new k(getId()));
  }
  
  private void setupBackHandlerIfNeeded(h paramh) {
    h h1;
    if (!this.n.W())
      return; 
    this.d.b(this.p);
    this.d.a("RN_SCREEN_LAST", 1);
    h h2 = null;
    int i = 0;
    int j = this.l.size();
    while (true) {
      h1 = h2;
      if (i < j) {
        h1 = this.l.get(i);
        if (!this.m.contains(h1))
          break; 
        i++;
        continue;
      } 
      break;
    } 
    if (paramh != h1 && paramh.A0()) {
      x x = this.d.b();
      x.c(paramh);
      x.a("RN_SCREEN_LAST");
      x.b(paramh);
      x.b();
      this.d.a(this.p);
    } 
  }
  
  protected h a(b paramb) {
    return new h(paramb);
  }
  
  public void a(h paramh) {
    this.m.add(paramh);
    a();
  }
  
  protected boolean a(f paramf) {
    return (super.a(paramf) && !this.m.contains(paramf));
  }
  
  protected void b(int paramInt) {
    b b = a(paramInt);
    this.m.remove(b.getFragment());
    super.b(paramInt);
  }
  
  protected void c() {
    // Byte code:
    //   0: aload_0
    //   1: getfield l : Ljava/util/ArrayList;
    //   4: invokevirtual iterator : ()Ljava/util/Iterator;
    //   7: astore_3
    //   8: aload_3
    //   9: invokeinterface hasNext : ()Z
    //   14: ifeq -> 67
    //   17: aload_3
    //   18: invokeinterface next : ()Ljava/lang/Object;
    //   23: checkcast com/swmansion/rnscreens/h
    //   26: astore #4
    //   28: aload_0
    //   29: getfield c : Ljava/util/ArrayList;
    //   32: aload #4
    //   34: invokevirtual contains : (Ljava/lang/Object;)Z
    //   37: ifeq -> 54
    //   40: aload_0
    //   41: getfield m : Ljava/util/Set;
    //   44: aload #4
    //   46: invokeinterface contains : (Ljava/lang/Object;)Z
    //   51: ifeq -> 8
    //   54: aload_0
    //   55: invokevirtual getOrCreateTransaction : ()Landroidx/fragment/app/x;
    //   58: aload #4
    //   60: invokevirtual a : (Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/x;
    //   63: pop
    //   64: goto -> 8
    //   67: aload_0
    //   68: getfield c : Ljava/util/ArrayList;
    //   71: invokevirtual size : ()I
    //   74: iconst_1
    //   75: isub
    //   76: istore_1
    //   77: aconst_null
    //   78: astore #6
    //   80: aconst_null
    //   81: astore_3
    //   82: aload #6
    //   84: astore #4
    //   86: aload_3
    //   87: astore #5
    //   89: iload_1
    //   90: iflt -> 175
    //   93: aload_0
    //   94: getfield c : Ljava/util/ArrayList;
    //   97: iload_1
    //   98: invokevirtual get : (I)Ljava/lang/Object;
    //   101: checkcast com/swmansion/rnscreens/h
    //   104: astore #4
    //   106: aload_3
    //   107: astore #5
    //   109: aload_0
    //   110: getfield m : Ljava/util/Set;
    //   113: aload #4
    //   115: invokeinterface contains : (Ljava/lang/Object;)Z
    //   120: ifne -> 165
    //   123: aload_3
    //   124: ifnonnull -> 159
    //   127: aload #4
    //   129: invokevirtual w0 : ()Lcom/swmansion/rnscreens/b;
    //   132: invokevirtual getStackPresentation : ()Lcom/swmansion/rnscreens/b$d;
    //   135: getstatic com/swmansion/rnscreens/b$d.e : Lcom/swmansion/rnscreens/b$d;
    //   138: if_acmpeq -> 152
    //   141: aload #4
    //   143: astore #5
    //   145: aload #6
    //   147: astore #4
    //   149: goto -> 175
    //   152: aload #4
    //   154: astore #5
    //   156: goto -> 165
    //   159: aload_3
    //   160: astore #5
    //   162: goto -> 175
    //   165: iload_1
    //   166: iconst_1
    //   167: isub
    //   168: istore_1
    //   169: aload #5
    //   171: astore_3
    //   172: goto -> 82
    //   175: aload_0
    //   176: getfield c : Ljava/util/ArrayList;
    //   179: invokevirtual iterator : ()Ljava/util/Iterator;
    //   182: astore_3
    //   183: aload_3
    //   184: invokeinterface hasNext : ()Z
    //   189: ifeq -> 244
    //   192: aload_3
    //   193: invokeinterface next : ()Ljava/lang/Object;
    //   198: checkcast com/swmansion/rnscreens/h
    //   201: astore #6
    //   203: aload #6
    //   205: aload #5
    //   207: if_acmpeq -> 183
    //   210: aload #6
    //   212: aload #4
    //   214: if_acmpeq -> 183
    //   217: aload_0
    //   218: getfield m : Ljava/util/Set;
    //   221: aload #6
    //   223: invokeinterface contains : (Ljava/lang/Object;)Z
    //   228: ifne -> 183
    //   231: aload_0
    //   232: invokevirtual getOrCreateTransaction : ()Landroidx/fragment/app/x;
    //   235: aload #6
    //   237: invokevirtual a : (Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/x;
    //   240: pop
    //   241: goto -> 183
    //   244: aload #4
    //   246: ifnull -> 288
    //   249: aload #4
    //   251: invokevirtual P : ()Z
    //   254: ifne -> 288
    //   257: aload_0
    //   258: invokevirtual getOrCreateTransaction : ()Landroidx/fragment/app/x;
    //   261: astore_3
    //   262: aload_3
    //   263: aload_0
    //   264: invokevirtual getId : ()I
    //   267: aload #4
    //   269: invokevirtual a : (ILandroidx/fragment/app/Fragment;)Landroidx/fragment/app/x;
    //   272: pop
    //   273: aload_3
    //   274: new com/swmansion/rnscreens/g$c
    //   277: dup
    //   278: aload_0
    //   279: aload #5
    //   281: invokespecial <init> : (Lcom/swmansion/rnscreens/g;Lcom/swmansion/rnscreens/h;)V
    //   284: invokevirtual a : (Ljava/lang/Runnable;)Landroidx/fragment/app/x;
    //   287: pop
    //   288: aload #5
    //   290: ifnull -> 315
    //   293: aload #5
    //   295: invokevirtual P : ()Z
    //   298: ifne -> 315
    //   301: aload_0
    //   302: invokevirtual getOrCreateTransaction : ()Landroidx/fragment/app/x;
    //   305: aload_0
    //   306: invokevirtual getId : ()I
    //   309: aload #5
    //   311: invokevirtual a : (ILandroidx/fragment/app/Fragment;)Landroidx/fragment/app/x;
    //   314: pop
    //   315: aload_0
    //   316: getfield l : Ljava/util/ArrayList;
    //   319: aload #5
    //   321: invokevirtual contains : (Ljava/lang/Object;)Z
    //   324: ifne -> 372
    //   327: aload_0
    //   328: getfield n : Lcom/swmansion/rnscreens/h;
    //   331: ifnull -> 443
    //   334: aload #5
    //   336: ifnull -> 443
    //   339: sipush #4097
    //   342: istore_1
    //   343: getstatic com/swmansion/rnscreens/g$d.a : [I
    //   346: aload #5
    //   348: invokevirtual w0 : ()Lcom/swmansion/rnscreens/b;
    //   351: invokevirtual getStackAnimation : ()Lcom/swmansion/rnscreens/b$c;
    //   354: invokevirtual ordinal : ()I
    //   357: iaload
    //   358: istore_2
    //   359: iload_2
    //   360: iconst_1
    //   361: if_icmpeq -> 432
    //   364: iload_2
    //   365: iconst_2
    //   366: if_icmpeq -> 425
    //   369: goto -> 434
    //   372: aload_0
    //   373: getfield n : Lcom/swmansion/rnscreens/h;
    //   376: astore_3
    //   377: aload_3
    //   378: ifnull -> 443
    //   381: aload_3
    //   382: aload #5
    //   384: invokevirtual equals : (Ljava/lang/Object;)Z
    //   387: ifne -> 443
    //   390: sipush #8194
    //   393: istore_1
    //   394: getstatic com/swmansion/rnscreens/g$d.a : [I
    //   397: aload_0
    //   398: getfield n : Lcom/swmansion/rnscreens/h;
    //   401: invokevirtual w0 : ()Lcom/swmansion/rnscreens/b;
    //   404: invokevirtual getStackAnimation : ()Lcom/swmansion/rnscreens/b$c;
    //   407: invokevirtual ordinal : ()I
    //   410: iaload
    //   411: istore_2
    //   412: iload_2
    //   413: iconst_1
    //   414: if_icmpeq -> 432
    //   417: iload_2
    //   418: iconst_2
    //   419: if_icmpeq -> 425
    //   422: goto -> 434
    //   425: sipush #4099
    //   428: istore_1
    //   429: goto -> 434
    //   432: iconst_0
    //   433: istore_1
    //   434: aload_0
    //   435: invokevirtual getOrCreateTransaction : ()Landroidx/fragment/app/x;
    //   438: iload_1
    //   439: invokevirtual a : (I)Landroidx/fragment/app/x;
    //   442: pop
    //   443: aload_0
    //   444: aload #5
    //   446: putfield n : Lcom/swmansion/rnscreens/h;
    //   449: aload_0
    //   450: getfield l : Ljava/util/ArrayList;
    //   453: invokevirtual clear : ()V
    //   456: aload_0
    //   457: getfield l : Ljava/util/ArrayList;
    //   460: aload_0
    //   461: getfield c : Ljava/util/ArrayList;
    //   464: invokevirtual addAll : (Ljava/util/Collection;)Z
    //   467: pop
    //   468: aload_0
    //   469: invokevirtual e : ()V
    //   472: aload_0
    //   473: getfield n : Lcom/swmansion/rnscreens/h;
    //   476: astore_3
    //   477: aload_3
    //   478: ifnull -> 486
    //   481: aload_0
    //   482: aload_3
    //   483: invokespecial setupBackHandlerIfNeeded : (Lcom/swmansion/rnscreens/h;)V
    //   486: aload_0
    //   487: getfield l : Ljava/util/ArrayList;
    //   490: invokevirtual iterator : ()Ljava/util/Iterator;
    //   493: astore_3
    //   494: aload_3
    //   495: invokeinterface hasNext : ()Z
    //   500: ifeq -> 518
    //   503: aload_3
    //   504: invokeinterface next : ()Ljava/lang/Object;
    //   509: checkcast com/swmansion/rnscreens/h
    //   512: invokevirtual B0 : ()V
    //   515: goto -> 494
    //   518: return
  }
  
  protected void d() {
    this.m.clear();
    super.d();
  }
  
  public void endViewTransition(View paramView) {
    super.endViewTransition(paramView);
    if (this.o) {
      this.o = false;
      g();
    } 
  }
  
  public void f() {
    if (!this.o)
      g(); 
  }
  
  public b getRootScreen() {
    int j = getScreenCount();
    for (int i = 0; i < j; i++) {
      b b = a(i);
      if (!this.m.contains(b.getFragment()))
        return b; 
    } 
    IllegalStateException illegalStateException = new IllegalStateException("Stack has no root screen set");
    throw illegalStateException;
  }
  
  public b getTopScreen() {
    h h1 = this.n;
    return (h1 != null) ? h1.w0() : null;
  }
  
  protected void onAttachedToWindow() {
    super.onAttachedToWindow();
    this.d.a(this.q, false);
  }
  
  protected void onDetachedFromWindow() {
    n n = this.d;
    if (n != null) {
      n.b(this.p);
      this.d.a(this.q);
      if (!this.d.D())
        this.d.a("RN_SCREEN_LAST", 1); 
    } 
    super.onDetachedFromWindow();
  }
  
  public void startViewTransition(View paramView) {
    super.startViewTransition(paramView);
    this.o = true;
  }
  
  class a implements n.o {
    a(g this$0) {}
    
    public void a() {
      if (this.a.d.q() == 0) {
        g g1 = this.a;
        g1.a(g.a(g1));
      } 
    }
  }
  
  class b extends n.m {
    b(g this$0) {}
    
    public void d(n param1n, Fragment param1Fragment) {
      if (g.a(this.a) == param1Fragment) {
        g g1 = this.a;
        g.a(g1, g.a(g1));
      } 
    }
  }
  
  class c implements Runnable {
    c(g this$0, h param1h) {}
    
    public void run() {
      this.c.w0().bringToFront();
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/swmansion/rnscreens/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */