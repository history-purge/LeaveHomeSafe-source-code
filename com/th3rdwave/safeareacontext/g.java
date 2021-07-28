package com.th3rdwave.safeareacontext;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.views.view.f;
import java.util.EnumSet;
import java.util.concurrent.atomic.AtomicBoolean;

@SuppressLint({"ViewConstructor"})
public class g extends f implements ViewTreeObserver.OnPreDrawListener {
  private j u = j.c;
  
  private a v;
  
  private EnumSet<h> w;
  
  private View x;
  
  public g(Context paramContext) {
    super(paramContext);
  }
  
  private static ReactContext b(View paramView) {
    Context context2 = paramView.getContext();
    Context context1 = context2;
    if (!(context2 instanceof ReactContext)) {
      context1 = context2;
      if (context2 instanceof ContextWrapper)
        context1 = ((ContextWrapper)context2).getBaseContext(); 
    } 
    return (ReactContext)context1;
  }
  
  private View e() {
    for (ViewParent viewParent = getParent(); viewParent != null; viewParent = viewParent.getParent()) {
      if (viewParent instanceof e)
        return (View)viewParent; 
    } 
    return (View)this;
  }
  
  private boolean f() {
    View view = this.x;
    if (view == null)
      return false; 
    a a1 = f.b(view);
    if (a1 != null) {
      a a2 = this.v;
      if (a2 == null || !a2.a(a1)) {
        this.v = a1;
        g();
        return true;
      } 
    } 
    return false;
  }
  
  private void g() {
    if (this.v != null) {
      EnumSet<h> enumSet = this.w;
      if (enumSet == null)
        enumSet = EnumSet.allOf(h.class); 
      i i = new i(this.v, this.u, enumSet);
      UIManagerModule uIManagerModule = (UIManagerModule)b((View)this).getNativeModule(UIManagerModule.class);
      if (uIManagerModule != null) {
        uIManagerModule.setViewLocalData(getId(), i);
        h();
      } 
    } 
  }
  
  private void h() {
    // Byte code:
    //   0: new java/util/concurrent/atomic/AtomicBoolean
    //   3: dup
    //   4: iconst_0
    //   5: invokespecial <init> : (Z)V
    //   8: astore #6
    //   10: invokestatic nanoTime : ()J
    //   13: lstore_3
    //   14: aload_0
    //   15: invokestatic b : (Landroid/view/View;)Lcom/facebook/react/bridge/ReactContext;
    //   18: new com/th3rdwave/safeareacontext/g$a
    //   21: dup
    //   22: aload_0
    //   23: aload #6
    //   25: invokespecial <init> : (Lcom/th3rdwave/safeareacontext/g;Ljava/util/concurrent/atomic/AtomicBoolean;)V
    //   28: invokevirtual runOnNativeModulesQueueThread : (Ljava/lang/Runnable;)V
    //   31: aload #6
    //   33: monitorenter
    //   34: lconst_0
    //   35: lstore_1
    //   36: aload #6
    //   38: invokevirtual get : ()Z
    //   41: istore #5
    //   43: iload #5
    //   45: ifne -> 83
    //   48: lload_1
    //   49: ldc2_w 5000000000
    //   52: lcmp
    //   53: ifge -> 83
    //   56: aload #6
    //   58: ldc2_w 5000
    //   61: invokevirtual wait : (J)V
    //   64: goto -> 74
    //   67: astore #7
    //   69: aload #7
    //   71: invokevirtual printStackTrace : ()V
    //   74: invokestatic nanoTime : ()J
    //   77: lload_3
    //   78: lsub
    //   79: lstore_1
    //   80: goto -> 36
    //   83: lload_1
    //   84: ldc2_w 5000000000
    //   87: lcmp
    //   88: iflt -> 99
    //   91: ldc 'SafeAreaView'
    //   93: ldc 'Timed out waiting for layout.'
    //   95: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   98: pop
    //   99: aload #6
    //   101: monitorexit
    //   102: return
    //   103: astore #7
    //   105: aload #6
    //   107: monitorexit
    //   108: goto -> 114
    //   111: aload #7
    //   113: athrow
    //   114: goto -> 111
    // Exception table:
    //   from	to	target	type
    //   36	43	103	finally
    //   56	64	67	java/lang/InterruptedException
    //   56	64	103	finally
    //   69	74	103	finally
    //   74	80	103	finally
    //   91	99	103	finally
    //   99	102	103	finally
    //   105	108	103	finally
  }
  
  protected void onAttachedToWindow() {
    super.onAttachedToWindow();
    this.x = e();
    this.x.getViewTreeObserver().addOnPreDrawListener(this);
    f();
  }
  
  protected void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    View view = this.x;
    if (view != null)
      view.getViewTreeObserver().removeOnPreDrawListener(this); 
    this.x = null;
  }
  
  public boolean onPreDraw() {
    boolean bool = f();
    if (bool)
      requestLayout(); 
    return bool ^ true;
  }
  
  public void setEdges(EnumSet<h> paramEnumSet) {
    this.w = paramEnumSet;
    g();
  }
  
  public void setMode(j paramj) {
    this.u = paramj;
    g();
  }
  
  class a implements Runnable {
    a(g this$0, AtomicBoolean param1AtomicBoolean) {}
    
    public void run() {
      synchronized (this.c) {
        this.c.set(true);
        this.c.notify();
        return;
      } 
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/th3rdwave/safeareacontext/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */