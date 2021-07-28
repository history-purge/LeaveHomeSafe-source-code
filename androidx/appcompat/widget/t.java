package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import b.a.a;

public class t extends RatingBar {
  private final r c;
  
  public t(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, a.ratingBarStyle);
  }
  
  public t(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    s0.a((View)this, getContext());
    this.c = new r((ProgressBar)this);
    this.c.a(paramAttributeSet, paramInt);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: iload_1
    //   4: iload_2
    //   5: invokespecial onMeasure : (II)V
    //   8: aload_0
    //   9: getfield c : Landroidx/appcompat/widget/r;
    //   12: invokevirtual a : ()Landroid/graphics/Bitmap;
    //   15: astore_3
    //   16: aload_3
    //   17: ifnull -> 42
    //   20: aload_0
    //   21: aload_3
    //   22: invokevirtual getWidth : ()I
    //   25: aload_0
    //   26: invokevirtual getNumStars : ()I
    //   29: imul
    //   30: iload_1
    //   31: iconst_0
    //   32: invokestatic resolveSizeAndState : (III)I
    //   35: aload_0
    //   36: invokevirtual getMeasuredHeight : ()I
    //   39: invokevirtual setMeasuredDimension : (II)V
    //   42: aload_0
    //   43: monitorexit
    //   44: return
    //   45: astore_3
    //   46: aload_0
    //   47: monitorexit
    //   48: aload_3
    //   49: athrow
    // Exception table:
    //   from	to	target	type
    //   2	16	45	finally
    //   20	42	45	finally
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/appcompat/widget/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */