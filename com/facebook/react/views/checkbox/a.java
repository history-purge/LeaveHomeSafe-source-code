package com.facebook.react.views.checkbox;

import android.content.Context;
import androidx.appcompat.widget.g;

class a extends g {
  private boolean f = true;
  
  public a(Context paramContext) {
    super(paramContext);
  }
  
  void a(boolean paramBoolean) {
    if (isChecked() != paramBoolean)
      super.setChecked(paramBoolean); 
    this.f = true;
  }
  
  public void setChecked(boolean paramBoolean) {
    if (this.f) {
      this.f = false;
      super.setChecked(paramBoolean);
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/checkbox/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */