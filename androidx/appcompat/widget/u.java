package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.widget.SeekBar;
import b.a.a;

public class u extends SeekBar {
  private final v c;
  
  public u(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, a.seekBarStyle);
  }
  
  public u(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    s0.a((View)this, getContext());
    this.c = new v(this);
    this.c.a(paramAttributeSet, paramInt);
  }
  
  protected void drawableStateChanged() {
    super.drawableStateChanged();
    this.c.b();
  }
  
  public void jumpDrawablesToCurrentState() {
    super.jumpDrawablesToCurrentState();
    this.c.c();
  }
  
  protected void onDraw(Canvas paramCanvas) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_1
    //   4: invokespecial onDraw : (Landroid/graphics/Canvas;)V
    //   7: aload_0
    //   8: getfield c : Landroidx/appcompat/widget/v;
    //   11: aload_1
    //   12: invokevirtual a : (Landroid/graphics/Canvas;)V
    //   15: aload_0
    //   16: monitorexit
    //   17: return
    //   18: astore_1
    //   19: aload_0
    //   20: monitorexit
    //   21: aload_1
    //   22: athrow
    // Exception table:
    //   from	to	target	type
    //   2	15	18	finally
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/appcompat/widget/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */