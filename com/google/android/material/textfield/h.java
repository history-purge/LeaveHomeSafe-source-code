package com.google.android.material.textfield;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.view.View;
import android.widget.EditText;
import e.f.a.f.e;
import e.f.a.f.i;

class h extends e {
  private final TextWatcher d = new a(this);
  
  private final TextInputLayout.f e = new b(this);
  
  private final TextInputLayout.g f = new c(this);
  
  h(TextInputLayout paramTextInputLayout) {
    super(paramTextInputLayout);
  }
  
  private boolean c() {
    EditText editText = this.a.getEditText();
    return (editText != null && editText.getTransformationMethod() instanceof PasswordTransformationMethod);
  }
  
  void a() {
    this.a.setEndIconDrawable(b.a.k.a.a.c(this.b, e.design_password_eye));
    TextInputLayout textInputLayout = this.a;
    textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(i.password_toggle_content_description));
    this.a.setEndIconOnClickListener(new d(this));
    this.a.a(this.e);
    this.a.a(this.f);
  }
  
  class a implements TextWatcher {
    a(h this$0) {}
    
    public void afterTextChanged(Editable param1Editable) {}
    
    public void beforeTextChanged(CharSequence param1CharSequence, int param1Int1, int param1Int2, int param1Int3) {
      h h1 = this.c;
      h1.c.setChecked(h.a(h1) ^ true);
    }
    
    public void onTextChanged(CharSequence param1CharSequence, int param1Int1, int param1Int2, int param1Int3) {}
  }
  
  class b implements TextInputLayout.f {
    b(h this$0) {}
    
    public void a(TextInputLayout param1TextInputLayout) {
      EditText editText = param1TextInputLayout.getEditText();
      param1TextInputLayout.setEndIconVisible(true);
      h h1 = this.a;
      h1.c.setChecked(h.a(h1) ^ true);
      editText.removeTextChangedListener(h.b(this.a));
      editText.addTextChangedListener(h.b(this.a));
    }
  }
  
  class c implements TextInputLayout.g {
    c(h this$0) {}
    
    public void a(TextInputLayout param1TextInputLayout, int param1Int) {
      EditText editText = param1TextInputLayout.getEditText();
      if (editText != null && param1Int == 1)
        editText.setTransformationMethod((TransformationMethod)PasswordTransformationMethod.getInstance()); 
    }
  }
  
  class d implements View.OnClickListener {
    d(h this$0) {}
    
    public void onClick(View param1View) {
      PasswordTransformationMethod passwordTransformationMethod;
      EditText editText = this.c.a.getEditText();
      if (editText == null)
        return; 
      int i = editText.getSelectionEnd();
      if (h.a(this.c)) {
        param1View = null;
      } else {
        passwordTransformationMethod = PasswordTransformationMethod.getInstance();
      } 
      editText.setTransformationMethod((TransformationMethod)passwordTransformationMethod);
      if (i >= 0)
        editText.setSelection(i); 
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/material/textfield/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */