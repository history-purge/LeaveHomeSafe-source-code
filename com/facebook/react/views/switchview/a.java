package com.facebook.react.views.switchview;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.r0;

class a extends r0 {
  private boolean R = true;
  
  private Integer S = null;
  
  private Integer T = null;
  
  public a(Context paramContext) {
    super(paramContext);
  }
  
  private void b(boolean paramBoolean) {
    if (this.T != null || this.S != null) {
      Integer integer;
      if (paramBoolean) {
        integer = this.T;
      } else {
        integer = this.S;
      } 
      b(integer);
    } 
  }
  
  void a(Drawable paramDrawable, Integer paramInteger) {
    if (paramInteger == null) {
      paramDrawable.clearColorFilter();
      return;
    } 
    paramDrawable.setColorFilter(paramInteger.intValue(), PorterDuff.Mode.MULTIPLY);
  }
  
  public void a(Integer paramInteger) {
    a(getThumbDrawable(), paramInteger);
  }
  
  void a(boolean paramBoolean) {
    if (isChecked() != paramBoolean) {
      super.setChecked(paramBoolean);
      b(paramBoolean);
    } 
    this.R = true;
  }
  
  public void b(Integer paramInteger) {
    a(getTrackDrawable(), paramInteger);
  }
  
  public void c(Integer paramInteger) {
    if (paramInteger == this.S)
      return; 
    this.S = paramInteger;
    if (!isChecked())
      b(this.S); 
  }
  
  public void d(Integer paramInteger) {
    if (paramInteger == this.T)
      return; 
    this.T = paramInteger;
    if (isChecked())
      b(this.T); 
  }
  
  public void setChecked(boolean paramBoolean) {
    if (this.R && isChecked() != paramBoolean) {
      this.R = false;
      super.setChecked(paramBoolean);
      b(paramBoolean);
      return;
    } 
    super.setChecked(isChecked());
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/switchview/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */