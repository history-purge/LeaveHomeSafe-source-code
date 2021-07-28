package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import android.widget.ToggleButton;

public class b0 extends ToggleButton {
  private final y c;
  
  public b0(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, 16842827);
  }
  
  public b0(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    s0.a((View)this, getContext());
    this.c = new y((TextView)this);
    this.c.a(paramAttributeSet, paramInt);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/appcompat/widget/b0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */