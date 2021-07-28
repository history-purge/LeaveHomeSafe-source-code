package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import android.widget.TextView;
import androidx.core.widget.i;
import b.a.k.a.a;

public class h extends CheckedTextView {
  private static final int[] d = new int[] { 16843016 };
  
  private final y c;
  
  public h(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, 16843720);
  }
  
  public h(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(u0.b(paramContext), paramAttributeSet, paramInt);
    s0.a((View)this, getContext());
    this.c = new y((TextView)this);
    this.c.a(paramAttributeSet, paramInt);
    this.c.a();
    x0 x0 = x0.a(getContext(), paramAttributeSet, d, paramInt, 0);
    setCheckMarkDrawable(x0.b(0));
    x0.b();
  }
  
  protected void drawableStateChanged() {
    super.drawableStateChanged();
    y y1 = this.c;
    if (y1 != null)
      y1.a(); 
  }
  
  public InputConnection onCreateInputConnection(EditorInfo paramEditorInfo) {
    InputConnection inputConnection = super.onCreateInputConnection(paramEditorInfo);
    l.a(inputConnection, paramEditorInfo, (View)this);
    return inputConnection;
  }
  
  public void setCheckMarkDrawable(int paramInt) {
    setCheckMarkDrawable(a.c(getContext(), paramInt));
  }
  
  public void setCustomSelectionActionModeCallback(ActionMode.Callback paramCallback) {
    super.setCustomSelectionActionModeCallback(i.a((TextView)this, paramCallback));
  }
  
  public void setTextAppearance(Context paramContext, int paramInt) {
    super.setTextAppearance(paramContext, paramInt);
    y y1 = this.c;
    if (y1 != null)
      y1.a(paramContext, paramInt); 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/appcompat/widget/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */