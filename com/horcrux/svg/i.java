package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.e1.a;

@SuppressLint({"ViewConstructor"})
class i extends l {
  c0 M0;
  
  c0 N0;
  
  c0 O0;
  
  c0 P0;
  
  Bitmap Q0 = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
  
  Canvas R0 = new Canvas(this.Q0);
  
  public i(ReactContext paramReactContext) {
    super(paramReactContext);
  }
  
  void a(Canvas paramCanvas, Paint paramPaint, float paramFloat) {
    float f1 = (float)c(this.M0);
    float f2 = (float)a(this.N0);
    float f3 = (float)c(this.O0);
    float f4 = (float)a(this.P0);
    paramCanvas.translate(f1, f2);
    paramCanvas.clipRect(0.0F, 0.0F, f3, f4);
    super.a(paramCanvas, paramPaint, paramFloat);
  }
  
  void d(Canvas paramCanvas, Paint paramPaint, float paramFloat) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual n : ()V
    //   4: aload_0
    //   5: invokevirtual getSvgView : ()Lcom/horcrux/svg/f0;
    //   8: astore #7
    //   10: new android/graphics/RectF
    //   13: dup
    //   14: invokespecial <init> : ()V
    //   17: astore #8
    //   19: iconst_0
    //   20: istore #4
    //   22: iload #4
    //   24: aload_0
    //   25: invokevirtual getChildCount : ()I
    //   28: if_icmpge -> 230
    //   31: aload_0
    //   32: iload #4
    //   34: invokevirtual getChildAt : (I)Landroid/view/View;
    //   37: astore #9
    //   39: aload #9
    //   41: instanceof com/horcrux/svg/q
    //   44: ifeq -> 50
    //   47: goto -> 221
    //   50: aload #9
    //   52: instanceof com/horcrux/svg/x0
    //   55: ifeq -> 183
    //   58: aload #9
    //   60: checkcast com/horcrux/svg/x0
    //   63: astore #9
    //   65: ldc 'none'
    //   67: aload #9
    //   69: getfield O : Ljava/lang/String;
    //   72: invokevirtual equals : (Ljava/lang/Object;)Z
    //   75: ifeq -> 81
    //   78: goto -> 221
    //   81: aload #9
    //   83: instanceof com/horcrux/svg/b0
    //   86: istore #6
    //   88: iload #6
    //   90: ifeq -> 102
    //   93: aload #9
    //   95: checkcast com/horcrux/svg/b0
    //   98: aload_0
    //   99: invokevirtual a : (Lcom/horcrux/svg/b0;)V
    //   102: aload #9
    //   104: aload_1
    //   105: aload_0
    //   106: getfield w : Landroid/graphics/Matrix;
    //   109: invokevirtual a : (Landroid/graphics/Canvas;Landroid/graphics/Matrix;)I
    //   112: istore #5
    //   114: aload #9
    //   116: aload_1
    //   117: aload_2
    //   118: aload_0
    //   119: getfield v : F
    //   122: fload_3
    //   123: fmul
    //   124: invokevirtual b : (Landroid/graphics/Canvas;Landroid/graphics/Paint;F)V
    //   127: aload #9
    //   129: invokevirtual getClientRect : ()Landroid/graphics/RectF;
    //   132: astore #10
    //   134: aload #10
    //   136: ifnull -> 146
    //   139: aload #8
    //   141: aload #10
    //   143: invokevirtual union : (Landroid/graphics/RectF;)V
    //   146: aload #9
    //   148: aload_1
    //   149: iload #5
    //   151: invokevirtual a : (Landroid/graphics/Canvas;I)V
    //   154: iload #6
    //   156: ifeq -> 167
    //   159: aload #9
    //   161: checkcast com/horcrux/svg/b0
    //   164: invokevirtual j : ()V
    //   167: aload #9
    //   169: invokevirtual g : ()Z
    //   172: ifeq -> 221
    //   175: aload #7
    //   177: invokevirtual e : ()V
    //   180: goto -> 221
    //   183: aload #9
    //   185: instanceof com/horcrux/svg/f0
    //   188: ifeq -> 215
    //   191: aload #9
    //   193: checkcast com/horcrux/svg/f0
    //   196: astore #9
    //   198: aload #9
    //   200: aload_1
    //   201: invokevirtual a : (Landroid/graphics/Canvas;)V
    //   204: aload #9
    //   206: invokevirtual f : ()Z
    //   209: ifeq -> 221
    //   212: goto -> 175
    //   215: aload #9
    //   217: aload_1
    //   218: invokevirtual draw : (Landroid/graphics/Canvas;)V
    //   221: iload #4
    //   223: iconst_1
    //   224: iadd
    //   225: istore #4
    //   227: goto -> 22
    //   230: aload_0
    //   231: aload #8
    //   233: invokevirtual setClientRect : (Landroid/graphics/RectF;)V
    //   236: aload_0
    //   237: invokevirtual m : ()V
    //   240: return
  }
  
  protected void dispatchDraw(Canvas paramCanvas) {
    super.dispatchDraw(this.R0);
  }
  
  protected boolean drawChild(Canvas paramCanvas, View paramView, long paramLong) {
    return super.drawChild(this.R0, paramView, paramLong);
  }
  
  public void onDescendantInvalidated(View paramView1, View paramView2) {
    super.onDescendantInvalidated(paramView1, paramView2);
    invalidate();
  }
  
  @a(name = "height")
  public void setHeight(Dynamic paramDynamic) {
    this.P0 = c0.b(paramDynamic);
    invalidate();
  }
  
  @a(name = "width")
  public void setWidth(Dynamic paramDynamic) {
    this.O0 = c0.b(paramDynamic);
    invalidate();
  }
  
  @a(name = "x")
  public void setX(Dynamic paramDynamic) {
    this.M0 = c0.b(paramDynamic);
    invalidate();
  }
  
  @a(name = "y")
  public void setY(Dynamic paramDynamic) {
    this.N0 = c0.b(paramDynamic);
    invalidate();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/horcrux/svg/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */