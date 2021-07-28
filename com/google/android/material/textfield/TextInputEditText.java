package com.google.android.material.textfield;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.appcompat.widget.k;
import e.f.a.f.b;

public class TextInputEditText extends k {
  public TextInputEditText(Context paramContext) {
    this(paramContext, null);
  }
  
  public TextInputEditText(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, b.editTextStyle);
  }
  
  public TextInputEditText(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  private CharSequence getHintFromLayout() {
    TextInputLayout textInputLayout = getTextInputLayout();
    return (textInputLayout != null) ? textInputLayout.getHint() : null;
  }
  
  private TextInputLayout getTextInputLayout() {
    for (ViewParent viewParent = getParent(); viewParent instanceof android.view.View; viewParent = viewParent.getParent()) {
      if (viewParent instanceof TextInputLayout)
        return (TextInputLayout)viewParent; 
    } 
    return null;
  }
  
  public CharSequence getHint() {
    TextInputLayout textInputLayout = getTextInputLayout();
    return (textInputLayout != null && textInputLayout.c()) ? textInputLayout.getHint() : super.getHint();
  }
  
  protected void onAttachedToWindow() {
    super.onAttachedToWindow();
    TextInputLayout textInputLayout = getTextInputLayout();
    if (textInputLayout != null && textInputLayout.c() && super.getHint() == null && Build.MANUFACTURER.equalsIgnoreCase("Meizu"))
      setHint(""); 
  }
  
  public InputConnection onCreateInputConnection(EditorInfo paramEditorInfo) {
    InputConnection inputConnection = super.onCreateInputConnection(paramEditorInfo);
    if (inputConnection != null && paramEditorInfo.hintText == null)
      paramEditorInfo.hintText = getHintFromLayout(); 
    return inputConnection;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/material/textfield/TextInputEditText.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */