package com.google.android.material.textfield;

import android.content.Context;
import com.google.android.material.internal.CheckableImageButton;

abstract class e {
  TextInputLayout a;
  
  Context b;
  
  CheckableImageButton c;
  
  e(TextInputLayout paramTextInputLayout) {
    this.a = paramTextInputLayout;
    this.b = paramTextInputLayout.getContext();
    this.c = paramTextInputLayout.getEndIconView();
  }
  
  abstract void a();
  
  boolean a(int paramInt) {
    return true;
  }
  
  boolean b() {
    return false;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/material/textfield/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */