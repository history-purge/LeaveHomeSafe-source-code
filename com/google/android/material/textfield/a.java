package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import e.f.a.f.i;

class a extends e {
  private final TextWatcher d = new a(this);
  
  private final TextInputLayout.f e = new b(this);
  
  private AnimatorSet f;
  
  private ValueAnimator g;
  
  a(TextInputLayout paramTextInputLayout) {
    super(paramTextInputLayout);
  }
  
  private ValueAnimator a(float... paramVarArgs) {
    ValueAnimator valueAnimator = ValueAnimator.ofFloat(paramVarArgs);
    valueAnimator.setInterpolator(e.f.a.f.l.a.a);
    valueAnimator.setDuration(100L);
    valueAnimator.addUpdateListener(new f(this));
    return valueAnimator;
  }
  
  private static boolean b(Editable paramEditable) {
    return (paramEditable.length() > 0);
  }
  
  private ValueAnimator c() {
    ValueAnimator valueAnimator = ValueAnimator.ofFloat(new float[] { 0.8F, 1.0F });
    valueAnimator.setInterpolator(e.f.a.f.l.a.d);
    valueAnimator.setDuration(150L);
    valueAnimator.addUpdateListener(new g(this));
    return valueAnimator;
  }
  
  private void d() {
    ValueAnimator valueAnimator1 = c();
    ValueAnimator valueAnimator2 = a(new float[] { 0.0F, 1.0F });
    this.f = new AnimatorSet();
    this.f.playTogether(new Animator[] { (Animator)valueAnimator1, (Animator)valueAnimator2 });
    this.f.addListener((Animator.AnimatorListener)new d(this));
    this.g = a(new float[] { 1.0F, 0.0F });
    this.g.addListener((Animator.AnimatorListener)new e(this));
  }
  
  void a() {
    this.a.setEndIconDrawable(b.a.k.a.a.c(this.b, e.f.a.f.e.mtrl_ic_cancel));
    TextInputLayout textInputLayout = this.a;
    textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(i.clear_text_end_icon_content_description));
    this.a.setEndIconOnClickListener(new c(this));
    this.a.a(this.e);
    d();
  }
  
  class a implements TextWatcher {
    a(a this$0) {}
    
    public void afterTextChanged(Editable param1Editable) {
      if (a.a(param1Editable)) {
        if (!this.c.a.a()) {
          a.a(this.c).cancel();
          a.b(this.c).start();
          return;
        } 
      } else {
        a.b(this.c).cancel();
        a.a(this.c).start();
      } 
    }
    
    public void beforeTextChanged(CharSequence param1CharSequence, int param1Int1, int param1Int2, int param1Int3) {}
    
    public void onTextChanged(CharSequence param1CharSequence, int param1Int1, int param1Int2, int param1Int3) {}
  }
  
  class b implements TextInputLayout.f {
    b(a this$0) {}
    
    public void a(TextInputLayout param1TextInputLayout) {
      EditText editText = param1TextInputLayout.getEditText();
      param1TextInputLayout.setEndIconVisible(a.a(editText.getText()));
      param1TextInputLayout.setEndIconCheckable(false);
      editText.removeTextChangedListener(a.c(this.a));
      editText.addTextChangedListener(a.c(this.a));
    }
  }
  
  class c implements View.OnClickListener {
    c(a this$0) {}
    
    public void onClick(View param1View) {
      this.c.a.getEditText().setText(null);
    }
  }
  
  class d extends AnimatorListenerAdapter {
    d(a this$0) {}
    
    public void onAnimationStart(Animator param1Animator) {
      this.a.a.setEndIconVisible(true);
    }
  }
  
  class e extends AnimatorListenerAdapter {
    e(a this$0) {}
    
    public void onAnimationEnd(Animator param1Animator) {
      this.a.a.setEndIconVisible(false);
    }
  }
  
  class f implements ValueAnimator.AnimatorUpdateListener {
    f(a this$0) {}
    
    public void onAnimationUpdate(ValueAnimator param1ValueAnimator) {
      float f1 = ((Float)param1ValueAnimator.getAnimatedValue()).floatValue();
      this.a.c.setAlpha(f1);
    }
  }
  
  class g implements ValueAnimator.AnimatorUpdateListener {
    g(a this$0) {}
    
    public void onAnimationUpdate(ValueAnimator param1ValueAnimator) {
      float f = ((Float)param1ValueAnimator.getAnimatedValue()).floatValue();
      this.a.c.setScaleX(f);
      this.a.c.setScaleY(f);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/material/textfield/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */