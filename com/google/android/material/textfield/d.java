package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import b.g.m.v;
import e.f.a.f.a0.k;

class d extends e {
  private static final boolean o;
  
  private final TextWatcher d = new a(this);
  
  private final TextInputLayout.e e = new b(this, this.a);
  
  private final TextInputLayout.f f = new c(this);
  
  private boolean g = false;
  
  private boolean h = false;
  
  private long i = Long.MAX_VALUE;
  
  private StateListDrawable j;
  
  private e.f.a.f.a0.g k;
  
  private AccessibilityManager l;
  
  private ValueAnimator m;
  
  private ValueAnimator n;
  
  static {
    boolean bool;
    if (Build.VERSION.SDK_INT >= 21) {
      bool = true;
    } else {
      bool = false;
    } 
    o = bool;
  }
  
  d(TextInputLayout paramTextInputLayout) {
    super(paramTextInputLayout);
  }
  
  private ValueAnimator a(int paramInt, float... paramVarArgs) {
    ValueAnimator valueAnimator = ValueAnimator.ofFloat(paramVarArgs);
    valueAnimator.setInterpolator(e.f.a.f.l.a.a);
    valueAnimator.setDuration(paramInt);
    valueAnimator.addUpdateListener(new i(this));
    return valueAnimator;
  }
  
  private AutoCompleteTextView a(EditText paramEditText) {
    if (paramEditText instanceof AutoCompleteTextView)
      return (AutoCompleteTextView)paramEditText; 
    throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
  }
  
  private e.f.a.f.a0.g a(float paramFloat1, float paramFloat2, float paramFloat3, int paramInt) {
    k.b b = k.n();
    b.d(paramFloat1);
    b.e(paramFloat1);
    b.b(paramFloat2);
    b.c(paramFloat2);
    k k = b.a();
    e.f.a.f.a0.g g1 = e.f.a.f.a0.g.a(this.b, paramFloat3);
    g1.setShapeAppearanceModel(k);
    g1.a(0, paramInt, 0, paramInt);
    return g1;
  }
  
  private void a(AutoCompleteTextView paramAutoCompleteTextView) {
    if (paramAutoCompleteTextView.getKeyListener() != null)
      return; 
    int i = this.a.getBoxBackgroundMode();
    e.f.a.f.a0.g g1 = this.a.getBoxBackground();
    int j = e.f.a.f.q.a.a((View)paramAutoCompleteTextView, e.f.a.f.b.colorControlHighlight);
    int[][] arrayOfInt = new int[2][];
    (new int[1])[0] = 16842919;
    arrayOfInt[0] = new int[1];
    arrayOfInt[1] = new int[0];
    if (i == 2) {
      b(paramAutoCompleteTextView, j, arrayOfInt, g1);
      return;
    } 
    if (i == 1)
      a(paramAutoCompleteTextView, j, arrayOfInt, g1); 
  }
  
  private void a(AutoCompleteTextView paramAutoCompleteTextView, int paramInt, int[][] paramArrayOfint, e.f.a.f.a0.g paramg) {
    int i = this.a.getBoxBackgroundColor();
    paramInt = e.f.a.f.q.a.a(paramInt, i, 0.1F);
    int[] arrayOfInt = new int[2];
    arrayOfInt[0] = paramInt;
    arrayOfInt[1] = i;
    if (o) {
      v.a((View)paramAutoCompleteTextView, (Drawable)new RippleDrawable(new ColorStateList(paramArrayOfint, arrayOfInt), (Drawable)paramg, (Drawable)paramg));
      return;
    } 
    e.f.a.f.a0.g g1 = new e.f.a.f.a0.g(paramg.k());
    g1.a(new ColorStateList(paramArrayOfint, arrayOfInt));
    LayerDrawable layerDrawable = new LayerDrawable(new Drawable[] { (Drawable)paramg, (Drawable)g1 });
    paramInt = v.u((View)paramAutoCompleteTextView);
    i = paramAutoCompleteTextView.getPaddingTop();
    int j = v.t((View)paramAutoCompleteTextView);
    int k = paramAutoCompleteTextView.getPaddingBottom();
    v.a((View)paramAutoCompleteTextView, (Drawable)layerDrawable);
    v.a((View)paramAutoCompleteTextView, paramInt, i, j, k);
  }
  
  private void a(boolean paramBoolean) {
    if (this.h != paramBoolean) {
      this.h = paramBoolean;
      this.n.cancel();
      this.m.start();
    } 
  }
  
  private void b(AutoCompleteTextView paramAutoCompleteTextView) {
    if (o) {
      StateListDrawable stateListDrawable;
      int i = this.a.getBoxBackgroundMode();
      if (i == 2) {
        e.f.a.f.a0.g g1 = this.k;
      } else if (i == 1) {
        stateListDrawable = this.j;
      } else {
        return;
      } 
      paramAutoCompleteTextView.setDropDownBackgroundDrawable((Drawable)stateListDrawable);
      return;
    } 
  }
  
  private void b(AutoCompleteTextView paramAutoCompleteTextView, int paramInt, int[][] paramArrayOfint, e.f.a.f.a0.g paramg) {
    LayerDrawable layerDrawable;
    int i = e.f.a.f.q.a.a((View)paramAutoCompleteTextView, e.f.a.f.b.colorSurface);
    e.f.a.f.a0.g g1 = new e.f.a.f.a0.g(paramg.k());
    paramInt = e.f.a.f.q.a.a(paramInt, i, 0.1F);
    g1.a(new ColorStateList(paramArrayOfint, new int[] { paramInt, 0 }));
    if (o) {
      g1.setTint(i);
      ColorStateList colorStateList = new ColorStateList(paramArrayOfint, new int[] { paramInt, i });
      e.f.a.f.a0.g g2 = new e.f.a.f.a0.g(paramg.k());
      g2.setTint(-1);
      layerDrawable = new LayerDrawable(new Drawable[] { (Drawable)new RippleDrawable(colorStateList, (Drawable)g1, (Drawable)g2), (Drawable)paramg });
    } else {
      layerDrawable = new LayerDrawable(new Drawable[] { (Drawable)g1, (Drawable)paramg });
    } 
    v.a((View)paramAutoCompleteTextView, (Drawable)layerDrawable);
  }
  
  private void c() {
    this.n = a(67, new float[] { 0.0F, 1.0F });
    this.m = a(50, new float[] { 1.0F, 0.0F });
    this.m.addListener((Animator.AnimatorListener)new h(this));
  }
  
  private void c(AutoCompleteTextView paramAutoCompleteTextView) {
    paramAutoCompleteTextView.setOnTouchListener(new e(this, paramAutoCompleteTextView));
    paramAutoCompleteTextView.setOnFocusChangeListener(new f(this));
    if (o)
      paramAutoCompleteTextView.setOnDismissListener(new g(this)); 
  }
  
  private void d(AutoCompleteTextView paramAutoCompleteTextView) {
    if (paramAutoCompleteTextView == null)
      return; 
    if (d())
      this.g = false; 
    if (!this.g) {
      if (o) {
        a(this.h ^ true);
      } else {
        this.h ^= 0x1;
        this.c.toggle();
      } 
      if (this.h) {
        paramAutoCompleteTextView.requestFocus();
        paramAutoCompleteTextView.showDropDown();
        return;
      } 
      paramAutoCompleteTextView.dismissDropDown();
      return;
    } 
    this.g = false;
  }
  
  private boolean d() {
    long l = System.currentTimeMillis() - this.i;
    return (l < 0L || l > 300L);
  }
  
  void a() {
    float f1 = this.b.getResources().getDimensionPixelOffset(e.f.a.f.d.mtrl_shape_corner_size_small_component);
    float f2 = this.b.getResources().getDimensionPixelOffset(e.f.a.f.d.mtrl_exposed_dropdown_menu_popup_elevation);
    int i = this.b.getResources().getDimensionPixelOffset(e.f.a.f.d.mtrl_exposed_dropdown_menu_popup_vertical_padding);
    e.f.a.f.a0.g g1 = a(f1, f1, f2, i);
    e.f.a.f.a0.g g2 = a(0.0F, f1, f2, i);
    this.k = g1;
    this.j = new StateListDrawable();
    this.j.addState(new int[] { 16842922 }, (Drawable)g1);
    this.j.addState(new int[0], (Drawable)g2);
    if (o) {
      i = e.f.a.f.e.mtrl_dropdown_arrow;
    } else {
      i = e.f.a.f.e.mtrl_ic_arrow_drop_down;
    } 
    this.a.setEndIconDrawable(b.a.k.a.a.c(this.b, i));
    TextInputLayout textInputLayout = this.a;
    textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(e.f.a.f.i.exposed_dropdown_menu_content_description));
    this.a.setEndIconOnClickListener(new d(this));
    this.a.a(this.f);
    c();
    v.h((View)this.c, 2);
    this.l = (AccessibilityManager)this.b.getSystemService("accessibility");
  }
  
  boolean a(int paramInt) {
    return (paramInt != 0);
  }
  
  boolean b() {
    return true;
  }
  
  class a implements TextWatcher {
    a(d this$0) {}
    
    public void afterTextChanged(Editable param1Editable) {
      d d1 = this.c;
      AutoCompleteTextView autoCompleteTextView = d.a(d1, d1.a.getEditText());
      autoCompleteTextView.post(new a(this, autoCompleteTextView));
    }
    
    public void beforeTextChanged(CharSequence param1CharSequence, int param1Int1, int param1Int2, int param1Int3) {}
    
    public void onTextChanged(CharSequence param1CharSequence, int param1Int1, int param1Int2, int param1Int3) {}
    
    class a implements Runnable {
      a(d.a this$0, AutoCompleteTextView param2AutoCompleteTextView) {}
      
      public void run() {
        boolean bool = this.c.isPopupShowing();
        d.a(this.d.c, bool);
        d.b(this.d.c, bool);
      }
    }
  }
  
  class a implements Runnable {
    a(d this$0, AutoCompleteTextView param1AutoCompleteTextView) {}
    
    public void run() {
      boolean bool = this.c.isPopupShowing();
      d.a(this.d.c, bool);
      d.b(this.d.c, bool);
    }
  }
  
  class b extends TextInputLayout.e {
    b(d this$0, TextInputLayout param1TextInputLayout) {
      super(param1TextInputLayout);
    }
    
    public void a(View param1View, b.g.m.e0.c param1c) {
      super.a(param1View, param1c);
      param1c.a(Spinner.class.getName());
      if (param1c.u())
        param1c.d(null); 
    }
    
    public void c(View param1View, AccessibilityEvent param1AccessibilityEvent) {
      super.c(param1View, param1AccessibilityEvent);
      d d1 = this.e;
      AutoCompleteTextView autoCompleteTextView = d.a(d1, d1.a.getEditText());
      if (param1AccessibilityEvent.getEventType() == 1 && d.d(this.e).isTouchExplorationEnabled())
        d.a(this.e, autoCompleteTextView); 
    }
  }
  
  class c implements TextInputLayout.f {
    c(d this$0) {}
    
    public void a(TextInputLayout param1TextInputLayout) {
      AutoCompleteTextView autoCompleteTextView = d.a(this.a, param1TextInputLayout.getEditText());
      d.b(this.a, autoCompleteTextView);
      d.c(this.a, autoCompleteTextView);
      d.d(this.a, autoCompleteTextView);
      autoCompleteTextView.setThreshold(0);
      autoCompleteTextView.removeTextChangedListener(d.e(this.a));
      autoCompleteTextView.addTextChangedListener(d.e(this.a));
      param1TextInputLayout.setErrorIconDrawable((Drawable)null);
      param1TextInputLayout.setTextInputAccessibilityDelegate(d.f(this.a));
      param1TextInputLayout.setEndIconVisible(true);
    }
  }
  
  class d implements View.OnClickListener {
    d(d this$0) {}
    
    public void onClick(View param1View) {
      AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView)this.c.a.getEditText();
      d.a(this.c, autoCompleteTextView);
    }
  }
  
  class e implements View.OnTouchListener {
    e(d this$0, AutoCompleteTextView param1AutoCompleteTextView) {}
    
    public boolean onTouch(View param1View, MotionEvent param1MotionEvent) {
      if (param1MotionEvent.getAction() == 1) {
        if (d.a(this.d))
          d.b(this.d, false); 
        d.a(this.d, this.c);
        param1View.performClick();
      } 
      return false;
    }
  }
  
  class f implements View.OnFocusChangeListener {
    f(d this$0) {}
    
    public void onFocusChange(View param1View, boolean param1Boolean) {
      this.c.a.setEndIconActivated(param1Boolean);
      if (!param1Boolean) {
        d.a(this.c, false);
        d.b(this.c, false);
      } 
    }
  }
  
  class g implements AutoCompleteTextView.OnDismissListener {
    g(d this$0) {}
    
    public void onDismiss() {
      d.b(this.a, true);
      d.a(this.a, System.currentTimeMillis());
      d.a(this.a, false);
    }
  }
  
  class h extends AnimatorListenerAdapter {
    h(d this$0) {}
    
    public void onAnimationEnd(Animator param1Animator) {
      d d1 = this.a;
      d1.c.setChecked(d.b(d1));
      d.c(this.a).start();
    }
  }
  
  class i implements ValueAnimator.AnimatorUpdateListener {
    i(d this$0) {}
    
    public void onAnimationUpdate(ValueAnimator param1ValueAnimator) {
      float f = ((Float)param1ValueAnimator.getAnimatedValue()).floatValue();
      this.a.c.setAlpha(f);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/material/textfield/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */