package com.facebook.react.views.textinput;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import b.g.m.v;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.e1.a;
import com.facebook.react.uimanager.k0;
import com.facebook.react.uimanager.v0;
import com.facebook.react.views.text.h;
import com.facebook.react.views.text.q;
import com.facebook.react.views.text.s;
import com.facebook.react.views.view.b;
import com.facebook.yoga.m;
import com.facebook.yoga.n;
import com.facebook.yoga.o;
import com.facebook.yoga.p;
import e.e.m.a.a;

@TargetApi(23)
public class m extends h implements m {
  private int b0;
  
  private EditText c0;
  
  private k d0;
  
  private String e0;
  
  private String f0;
  
  private int g0;
  
  private int h0;
  
  public m() {
    this(null);
  }
  
  public m(s params) {
    super(params);
    boolean bool;
    this.b0 = -1;
    this.e0 = null;
    this.f0 = null;
    this.g0 = -1;
    this.h0 = -1;
    if (Build.VERSION.SDK_INT < 23) {
      bool = false;
    } else {
      bool = true;
    } 
    this.J = bool;
    T();
  }
  
  private void T() {
    a(this);
  }
  
  public boolean I() {
    return true;
  }
  
  public boolean J() {
    return true;
  }
  
  protected EditText Q() {
    return new EditText((Context)h());
  }
  
  public String R() {
    return this.f0;
  }
  
  public String S() {
    return this.e0;
  }
  
  public long a(p paramp, float paramFloat1, n paramn1, float paramFloat2, n paramn2) {
    EditText editText = this.c0;
    a.a(editText);
    editText = editText;
    k k1 = this.d0;
    if (k1 != null) {
      k1.a(editText);
    } else {
      editText.setTextSize(0, this.C.b());
      int i = this.H;
      if (i != -1)
        editText.setLines(i); 
      if (Build.VERSION.SDK_INT >= 23) {
        i = editText.getBreakStrategy();
        int j = this.J;
        if (i != j)
          editText.setBreakStrategy(j); 
      } 
    } 
    editText.setHint(R());
    editText.measure(b.a(paramFloat1, paramn1), b.a(paramFloat2, paramn2));
    return o.a(editText.getMeasuredWidth(), editText.getMeasuredHeight());
  }
  
  public void a(k0 paramk0) {
    super.a(paramk0);
    EditText editText = Q();
    b(4, v.u((View)editText));
    b(1, editText.getPaddingTop());
    b(5, v.t((View)editText));
    b(3, editText.getPaddingBottom());
    this.c0 = editText;
    this.c0.setPadding(0, 0, 0, 0);
    this.c0.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
  }
  
  public void a(v0 paramv0) {
    super.a(paramv0);
    if (this.b0 != -1) {
      q q = new q(a(this, S(), false, null), this.b0, this.Z, f(0), f(1), f(2), f(3), this.I, this.J, this.L, this.g0, this.h0);
      paramv0.a(t(), q);
    } 
  }
  
  public void a(Object paramObject) {
    a.a(paramObject instanceof k);
    this.d0 = (k)paramObject;
    f();
  }
  
  public void e(int paramInt, float paramFloat) {
    super.e(paramInt, paramFloat);
    L();
  }
  
  @a(name = "mostRecentEventCount")
  public void setMostRecentEventCount(int paramInt) {
    this.b0 = paramInt;
  }
  
  @a(name = "placeholder")
  public void setPlaceholder(String paramString) {
    this.f0 = paramString;
    L();
  }
  
  @a(name = "selection")
  public void setSelection(ReadableMap paramReadableMap) {
    this.h0 = -1;
    this.g0 = -1;
    if (paramReadableMap == null)
      return; 
    if (paramReadableMap.hasKey("start") && paramReadableMap.hasKey("end")) {
      this.g0 = paramReadableMap.getInt("start");
      this.h0 = paramReadableMap.getInt("end");
      L();
    } 
  }
  
  @a(name = "text")
  public void setText(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: putfield e0 : Ljava/lang/String;
    //   5: aload_1
    //   6: ifnull -> 47
    //   9: aload_0
    //   10: getfield g0 : I
    //   13: aload_1
    //   14: invokevirtual length : ()I
    //   17: if_icmple -> 28
    //   20: aload_0
    //   21: aload_1
    //   22: invokevirtual length : ()I
    //   25: putfield g0 : I
    //   28: aload_0
    //   29: getfield h0 : I
    //   32: aload_1
    //   33: invokevirtual length : ()I
    //   36: if_icmple -> 59
    //   39: aload_1
    //   40: invokevirtual length : ()I
    //   43: istore_2
    //   44: goto -> 54
    //   47: iconst_m1
    //   48: istore_2
    //   49: aload_0
    //   50: iconst_m1
    //   51: putfield g0 : I
    //   54: aload_0
    //   55: iload_2
    //   56: putfield h0 : I
    //   59: aload_0
    //   60: invokevirtual L : ()V
    //   63: return
  }
  
  public void setTextBreakStrategy(String paramString) {
    byte b;
    if (Build.VERSION.SDK_INT < 23)
      return; 
    if (paramString == null || "simple".equals(paramString)) {
      b = 0;
    } else if ("highQuality".equals(paramString)) {
      b = 1;
    } else if ("balanced".equals(paramString)) {
      b = 2;
    } else {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Invalid textBreakStrategy: ");
      stringBuilder.append(paramString);
      throw new JSApplicationIllegalArgumentException(stringBuilder.toString());
    } 
    this.J = b;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/textinput/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */