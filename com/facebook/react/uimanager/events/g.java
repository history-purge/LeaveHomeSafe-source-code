package com.facebook.react.uimanager.events;

import android.view.MotionEvent;
import androidx.core.util.e;

public class g extends c<g> {
  private static final e<g> k = new e(3);
  
  private MotionEvent f;
  
  private i g;
  
  private short h;
  
  private float i;
  
  private float j;
  
  private void a(int paramInt, i parami, MotionEvent paramMotionEvent, long paramLong, float paramFloat1, float paramFloat2, h paramh) {
    // Byte code:
    //   0: aload_0
    //   1: iload_1
    //   2: invokespecial a : (I)V
    //   5: iconst_0
    //   6: istore #9
    //   8: lload #4
    //   10: ldc2_w -9223372036854775808
    //   13: lcmp
    //   14: ifeq -> 23
    //   17: iconst_1
    //   18: istore #10
    //   20: goto -> 26
    //   23: iconst_0
    //   24: istore #10
    //   26: iload #10
    //   28: ldc 'Gesture start time must be initialized'
    //   30: invokestatic assertCondition : (ZLjava/lang/String;)V
    //   33: aload_3
    //   34: invokevirtual getAction : ()I
    //   37: sipush #255
    //   40: iand
    //   41: istore_1
    //   42: iload_1
    //   43: ifeq -> 140
    //   46: iload_1
    //   47: iconst_1
    //   48: if_icmpeq -> 130
    //   51: iload_1
    //   52: iconst_2
    //   53: if_icmpeq -> 118
    //   56: iload_1
    //   57: iconst_3
    //   58: if_icmpeq -> 130
    //   61: iload_1
    //   62: iconst_5
    //   63: if_icmpeq -> 108
    //   66: iload_1
    //   67: bipush #6
    //   69: if_icmpne -> 75
    //   72: goto -> 108
    //   75: new java/lang/StringBuilder
    //   78: dup
    //   79: invokespecial <init> : ()V
    //   82: astore_2
    //   83: aload_2
    //   84: ldc 'Unhandled MotionEvent action: '
    //   86: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   89: pop
    //   90: aload_2
    //   91: iload_1
    //   92: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   95: pop
    //   96: new java/lang/RuntimeException
    //   99: dup
    //   100: aload_2
    //   101: invokevirtual toString : ()Ljava/lang/String;
    //   104: invokespecial <init> : (Ljava/lang/String;)V
    //   107: athrow
    //   108: aload #8
    //   110: lload #4
    //   112: invokevirtual d : (J)V
    //   115: goto -> 147
    //   118: aload #8
    //   120: lload #4
    //   122: invokevirtual b : (J)S
    //   125: istore #9
    //   127: goto -> 147
    //   130: aload #8
    //   132: lload #4
    //   134: invokevirtual e : (J)V
    //   137: goto -> 147
    //   140: aload #8
    //   142: lload #4
    //   144: invokevirtual a : (J)V
    //   147: aload_0
    //   148: aload_2
    //   149: putfield g : Lcom/facebook/react/uimanager/events/i;
    //   152: aload_0
    //   153: aload_3
    //   154: invokestatic obtain : (Landroid/view/MotionEvent;)Landroid/view/MotionEvent;
    //   157: putfield f : Landroid/view/MotionEvent;
    //   160: aload_0
    //   161: iload #9
    //   163: putfield h : S
    //   166: aload_0
    //   167: fload #6
    //   169: putfield i : F
    //   172: aload_0
    //   173: fload #7
    //   175: putfield j : F
    //   178: return
  }
  
  public static g b(int paramInt, i parami, MotionEvent paramMotionEvent, long paramLong, float paramFloat1, float paramFloat2, h paramh) {
    g g2 = (g)k.a();
    g g1 = g2;
    if (g2 == null)
      g1 = new g(); 
    g1.a(paramInt, parami, paramMotionEvent, paramLong, paramFloat1, paramFloat2, paramh);
    return g1;
  }
  
  public void a(RCTEventEmitter paramRCTEventEmitter) {
    i i1 = this.g;
    e.e.m.a.a.a(i1);
    j.a(paramRCTEventEmitter, i1, g(), this);
  }
  
  public boolean a() {
    int[] arrayOfInt = a.a;
    i i1 = this.g;
    e.e.m.a.a.a(i1);
    int j = arrayOfInt[i1.ordinal()];
    if (j != 1 && j != 2 && j != 3) {
      if (j == 4)
        return true; 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Unknown touch event type: ");
      stringBuilder.append(this.g);
      throw new RuntimeException(stringBuilder.toString());
    } 
    return false;
  }
  
  public short c() {
    return this.h;
  }
  
  public String d() {
    i i1 = this.g;
    e.e.m.a.a.a(i1);
    return i.a(i1);
  }
  
  public void i() {
    MotionEvent motionEvent = this.f;
    e.e.m.a.a.a(motionEvent);
    motionEvent.recycle();
    this.f = null;
    k.a(this);
  }
  
  public MotionEvent j() {
    e.e.m.a.a.a(this.f);
    return this.f;
  }
  
  public float k() {
    return this.i;
  }
  
  public float l() {
    return this.j;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/uimanager/events/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */