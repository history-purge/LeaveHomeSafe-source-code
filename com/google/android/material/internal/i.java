package com.google.android.material.internal;

import android.annotation.SuppressLint;
import android.widget.ImageButton;

@SuppressLint({"AppCompatCustomView"})
public class i extends ImageButton {
  private int c;
  
  public final void a(int paramInt, boolean paramBoolean) {
    super.setVisibility(paramInt);
    if (paramBoolean)
      this.c = paramInt; 
  }
  
  public final int getUserSetVisibility() {
    return this.c;
  }
  
  public void setVisibility(int paramInt) {
    a(paramInt, true);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/material/internal/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */