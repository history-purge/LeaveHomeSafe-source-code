package com.facebook.react.views.textinput;

import android.os.Build;
import android.text.SpannableStringBuilder;
import android.widget.EditText;

public final class k {
  private final SpannableStringBuilder a;
  
  private final float b;
  
  private final int c;
  
  private final int d;
  
  private final int e;
  
  private final int f;
  
  private final CharSequence g;
  
  public k(EditText paramEditText) {
    boolean bool;
    this.a = new SpannableStringBuilder((CharSequence)paramEditText.getText());
    this.b = paramEditText.getTextSize();
    this.e = paramEditText.getInputType();
    this.g = paramEditText.getHint();
    this.c = paramEditText.getMinLines();
    this.d = paramEditText.getMaxLines();
    if (Build.VERSION.SDK_INT >= 23) {
      bool = paramEditText.getBreakStrategy();
    } else {
      bool = false;
    } 
    this.f = bool;
  }
  
  public void a(EditText paramEditText) {
    paramEditText.setText((CharSequence)this.a);
    paramEditText.setTextSize(0, this.b);
    paramEditText.setMinLines(this.c);
    paramEditText.setMaxLines(this.d);
    paramEditText.setInputType(this.e);
    paramEditText.setHint(this.g);
    if (Build.VERSION.SDK_INT >= 23)
      paramEditText.setBreakStrategy(this.f); 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/textinput/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */