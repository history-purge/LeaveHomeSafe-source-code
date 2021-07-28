package com.facebook.react.views.textinput;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.KeyListener;
import android.text.method.QwertyKeyListener;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.appcompat.widget.k;
import b.g.m.v;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.j0;
import com.facebook.react.uimanager.q0;
import com.facebook.react.views.text.q;
import com.facebook.react.views.text.t;
import com.facebook.react.views.text.y;
import com.facebook.react.views.text.z;
import com.facebook.react.views.view.e;
import java.util.ArrayList;
import java.util.Iterator;

public class c extends k {
  private static final KeyListener I = (KeyListener)QwertyKeyListener.getInstanceForFullKeyboard();
  
  private int A = -1;
  
  private int B = -1;
  
  private boolean C = false;
  
  private boolean D = false;
  
  private e E;
  
  protected JavaOnlyMap F = null;
  
  protected j0 G = null;
  
  protected boolean H = false;
  
  private final InputMethodManager f;
  
  protected boolean g;
  
  private int h;
  
  private int i;
  
  protected int j;
  
  private ArrayList<TextWatcher> k;
  
  private c l;
  
  private int m;
  
  protected boolean n;
  
  private Boolean o;
  
  private boolean p;
  
  private String q;
  
  private p r;
  
  private a s;
  
  private o t;
  
  private final b u;
  
  private boolean v = false;
  
  private boolean w = false;
  
  private y x;
  
  private boolean y = false;
  
  private String z = null;
  
  public c(Context paramContext) {
    super(paramContext);
    setFocusableInTouchMode(false);
    this.E = new e((View)this);
    Object object = paramContext.getSystemService("input_method");
    e.e.m.a.a.a(object);
    this.f = (InputMethodManager)object;
    this.h = getGravity() & 0x800007;
    this.i = getGravity() & 0x70;
    this.j = 0;
    this.g = false;
    this.o = null;
    this.p = false;
    this.k = null;
    this.l = null;
    this.m = getInputType();
    this.u = new b();
    this.t = null;
    this.x = new y();
    a();
    int i = Build.VERSION.SDK_INT;
    if (i >= 26 && i <= 27)
      setLayerType(1, null); 
    v.a((View)this, new a(this));
  }
  
  private void a(SpannableStringBuilder paramSpannableStringBuilder) {
    Editable editable = getText();
    int j = length();
    int i = 0;
    Object[] arrayOfObject = editable.getSpans(0, j, Object.class);
    while (i < arrayOfObject.length) {
      if (arrayOfObject[i] instanceof com.facebook.react.views.text.l)
        getText().removeSpan(arrayOfObject[i]); 
      if ((getText().getSpanFlags(arrayOfObject[i]) & 0x21) == 33) {
        Object object = arrayOfObject[i];
        j = getText().getSpanStart(arrayOfObject[i]);
        int m = getText().getSpanEnd(arrayOfObject[i]);
        int n = getText().getSpanFlags(arrayOfObject[i]);
        getText().removeSpan(arrayOfObject[i]);
        if (a(getText(), paramSpannableStringBuilder, j, m))
          paramSpannableStringBuilder.setSpan(object, j, m, n); 
      } 
      i++;
    } 
  }
  
  private static boolean a(Editable paramEditable, SpannableStringBuilder paramSpannableStringBuilder, int paramInt1, int paramInt2) {
    if (paramInt1 <= paramSpannableStringBuilder.length()) {
      if (paramInt2 > paramSpannableStringBuilder.length())
        return false; 
      while (paramInt1 < paramInt2) {
        if (paramEditable.charAt(paramInt1) != paramSpannableStringBuilder.charAt(paramInt1))
          return false; 
        paramInt1++;
      } 
      return true;
    } 
    return false;
  }
  
  private c getTextWatcherDelegator() {
    if (this.l == null)
      this.l = new c(null); 
    return this.l;
  }
  
  private boolean k() {
    return ((getInputType() & 0x90) != 0);
  }
  
  private void l() {
    a a1 = this.s;
    if (a1 != null)
      a1.a(); 
    n();
  }
  
  private boolean m() {
    setFocusableInTouchMode(true);
    boolean bool = super.requestFocus(130, null);
    if (getShowSoftInputOnFocus())
      i(); 
    return bool;
  }
  
  private void n() {
    if (this.G == null) {
      ReactContext reactContext = q0.a((View)this);
      k k1 = new k((EditText)this);
      ((UIManagerModule)reactContext.getNativeModule(UIManagerModule.class)).setViewLocalData(getId(), k1);
    } 
  }
  
  private void o() {
    String str = this.q;
    byte b1 = 4;
    if (str != null) {
      byte b2;
      switch (str.hashCode()) {
        default:
          b2 = -1;
          break;
        case 3526536:
          if (str.equals("send")) {
            b2 = 5;
            break;
          } 
        case 3387192:
          if (str.equals("none")) {
            b2 = 2;
            break;
          } 
        case 3377907:
          if (str.equals("next")) {
            b2 = 1;
            break;
          } 
        case 3089282:
          if (str.equals("done")) {
            b2 = 6;
            break;
          } 
        case 3304:
          if (str.equals("go")) {
            b2 = 0;
            break;
          } 
        case -906336856:
          if (str.equals("search")) {
            b2 = 4;
            break;
          } 
        case -1273775369:
          if (str.equals("previous")) {
            b2 = 3;
            break;
          } 
      } 
      switch (b2) {
        default:
          b1 = 6;
          break;
        case 4:
          b1 = 3;
          break;
        case 3:
          b1 = 7;
          break;
        case 2:
          b1 = 1;
          break;
        case 1:
          b1 = 5;
          break;
        case 0:
          b1 = 2;
          break;
        case 6:
          b1 = 6;
          break;
        case 5:
          break;
      } 
      if (this.p) {
        setImeOptions(0x2000000 | b1);
        return;
      } 
      setImeOptions(b1);
      return;
    } 
  }
  
  protected void a() {
    setTextSize(0, this.x.b());
    if (Build.VERSION.SDK_INT >= 21) {
      float f = this.x.c();
      if (!Float.isNaN(f))
        setLetterSpacing(f); 
    } 
  }
  
  public void a(float paramFloat, int paramInt) {
    this.E.a(paramFloat, paramInt);
  }
  
  public void a(int paramInt, float paramFloat) {
    this.E.a(paramInt, paramFloat);
  }
  
  public void a(int paramInt, float paramFloat1, float paramFloat2) {
    this.E.a(paramInt, paramFloat1, paramFloat2);
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3) {
    if (!a(paramInt1))
      return; 
    if (paramInt2 != -1 && paramInt3 != -1)
      setSelection(paramInt2, paramInt3); 
  }
  
  public void a(q paramq) {
    if (k() && TextUtils.equals((CharSequence)getText(), (CharSequence)paramq.j()))
      return; 
    if (!a(paramq.b()))
      return; 
    ReadableMap readableMap = paramq.m;
    if (readableMap != null)
      this.F = JavaOnlyMap.deepClone(readableMap); 
    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder((CharSequence)paramq.j());
    a(spannableStringBuilder);
    this.n = paramq.a();
    this.H = true;
    if (paramq.j().length() == 0) {
      setText(null);
    } else {
      getText().replace(0, length(), (CharSequence)spannableStringBuilder);
    } 
    this.H = false;
    if (Build.VERSION.SDK_INT >= 23 && getBreakStrategy() != paramq.l())
      setBreakStrategy(paramq.l()); 
  }
  
  public boolean a(int paramInt) {
    return (paramInt >= this.j);
  }
  
  public void addTextChangedListener(TextWatcher paramTextWatcher) {
    if (this.k == null) {
      this.k = new ArrayList<TextWatcher>();
      super.addTextChangedListener(getTextWatcherDelegator());
    } 
    this.k.add(paramTextWatcher);
  }
  
  void b() {
    clearFocus();
  }
  
  public void b(q paramq) {
    this.g = true;
    a(paramq);
    this.g = false;
  }
  
  void c() {
    if (getInputType() != this.m) {
      int i = getSelectionStart();
      int j = getSelectionEnd();
      setInputType(this.m);
      setSelection(i, j);
    } 
  }
  
  public void c(q paramq) {
    a(paramq);
  }
  
  public void clearFocus() {
    setFocusableInTouchMode(false);
    super.clearFocus();
    d();
  }
  
  protected void d() {
    this.f.hideSoftInputFromWindow(getWindowToken(), 0);
  }
  
  public int e() {
    int i = this.j + 1;
    this.j = i;
    return i;
  }
  
  boolean f() {
    return ((getInputType() & 0x20000) != 0);
  }
  
  public void g() {
    if (!this.y)
      return; 
    this.y = false;
    setTypeface(t.a(getTypeface(), this.B, this.A, this.z, getContext().getAssets()));
  }
  
  public boolean getBlurOnSubmit() {
    Boolean bool = this.o;
    return (bool == null) ? (f() ^ true) : bool.booleanValue();
  }
  
  public boolean getDisableFullscreenUI() {
    return this.p;
  }
  
  public String getReturnKeyType() {
    return this.q;
  }
  
  int getStagedInputType() {
    return this.m;
  }
  
  public void h() {
    m();
  }
  
  protected boolean i() {
    return this.f.showSoftInput((View)this, 0);
  }
  
  public void invalidateDrawable(Drawable paramDrawable) {
    if (this.n) {
      Editable editable = getText();
      int j = editable.length();
      int i = 0;
      z[] arrayOfZ = (z[])editable.getSpans(0, j, z.class);
      j = arrayOfZ.length;
      while (i < j) {
        if (arrayOfZ[i].a() == paramDrawable)
          invalidate(); 
        i++;
      } 
    } 
    super.invalidateDrawable(paramDrawable);
  }
  
  public boolean isLayoutRequested() {
    return false;
  }
  
  public void onAttachedToWindow() {
    super.onAttachedToWindow();
    if (this.n) {
      Editable editable = getText();
      int j = editable.length();
      int i = 0;
      z[] arrayOfZ = (z[])editable.getSpans(0, j, z.class);
      j = arrayOfZ.length;
      while (i < j) {
        arrayOfZ[i].c();
        i++;
      } 
    } 
    if (this.C && !this.D)
      m(); 
    this.D = true;
  }
  
  public InputConnection onCreateInputConnection(EditorInfo paramEditorInfo) {
    d d;
    ReactContext reactContext = q0.a((View)this);
    InputConnection inputConnection2 = super.onCreateInputConnection(paramEditorInfo);
    InputConnection inputConnection1 = inputConnection2;
    if (inputConnection2 != null) {
      inputConnection1 = inputConnection2;
      if (this.w)
        d = new d(inputConnection2, reactContext, this); 
    } 
    if (f() && getBlurOnSubmit())
      paramEditorInfo.imeOptions &= 0xBFFFFFFF; 
    return (InputConnection)d;
  }
  
  public void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    if (this.n) {
      Editable editable = getText();
      int j = editable.length();
      int i = 0;
      z[] arrayOfZ = (z[])editable.getSpans(0, j, z.class);
      j = arrayOfZ.length;
      while (i < j) {
        arrayOfZ[i].d();
        i++;
      } 
    } 
  }
  
  public void onFinishTemporaryDetach() {
    super.onFinishTemporaryDetach();
    if (this.n) {
      Editable editable = getText();
      int j = editable.length();
      int i = 0;
      z[] arrayOfZ = (z[])editable.getSpans(0, j, z.class);
      j = arrayOfZ.length;
      while (i < j) {
        arrayOfZ[i].e();
        i++;
      } 
    } 
  }
  
  protected void onFocusChanged(boolean paramBoolean, int paramInt, Rect paramRect) {
    super.onFocusChanged(paramBoolean, paramInt, paramRect);
    if (paramBoolean) {
      p p1 = this.r;
      if (p1 != null)
        p1.a(getSelectionStart(), getSelectionEnd()); 
    } 
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent) {
    if (paramInt == 66 && !f()) {
      d();
      return true;
    } 
    return super.onKeyUp(paramInt, paramKeyEvent);
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    l();
  }
  
  protected void onScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.onScrollChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    o o1 = this.t;
    if (o1 != null)
      o1.a(paramInt1, paramInt2, paramInt3, paramInt4); 
  }
  
  protected void onSelectionChanged(int paramInt1, int paramInt2) {
    super.onSelectionChanged(paramInt1, paramInt2);
    if (this.r != null && hasFocus())
      this.r.a(paramInt1, paramInt2); 
  }
  
  public void onStartTemporaryDetach() {
    super.onStartTemporaryDetach();
    if (this.n) {
      Editable editable = getText();
      int j = editable.length();
      int i = 0;
      z[] arrayOfZ = (z[])editable.getSpans(0, j, z.class);
      j = arrayOfZ.length;
      while (i < j) {
        arrayOfZ[i].f();
        i++;
      } 
    } 
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent) {
    int i = paramMotionEvent.getAction();
    if (i != 0) {
      if (i == 2 && this.v) {
        if (!canScrollVertically(-1) && !canScrollVertically(1) && !canScrollHorizontally(-1) && !canScrollHorizontally(1))
          getParent().requestDisallowInterceptTouchEvent(false); 
        this.v = false;
      } 
    } else {
      this.v = true;
      getParent().requestDisallowInterceptTouchEvent(true);
    } 
    return super.onTouchEvent(paramMotionEvent);
  }
  
  public void removeTextChangedListener(TextWatcher paramTextWatcher) {
    ArrayList<TextWatcher> arrayList = this.k;
    if (arrayList != null) {
      arrayList.remove(paramTextWatcher);
      if (this.k.isEmpty()) {
        this.k = null;
        super.removeTextChangedListener(getTextWatcherDelegator());
      } 
    } 
  }
  
  public boolean requestFocus(int paramInt, Rect paramRect) {
    return isFocused();
  }
  
  public void setAllowFontScaling(boolean paramBoolean) {
    if (this.x.a() != paramBoolean) {
      this.x.a(paramBoolean);
      a();
    } 
  }
  
  public void setAutoFocus(boolean paramBoolean) {
    this.C = paramBoolean;
  }
  
  public void setBackgroundColor(int paramInt) {
    this.E.a(paramInt);
  }
  
  public void setBlurOnSubmit(Boolean paramBoolean) {
    this.o = paramBoolean;
  }
  
  public void setBorderRadius(float paramFloat) {
    this.E.a(paramFloat);
  }
  
  public void setBorderStyle(String paramString) {
    this.E.a(paramString);
  }
  
  public void setContentSizeWatcher(a parama) {
    this.s = parama;
  }
  
  public void setDisableFullscreenUI(boolean paramBoolean) {
    this.p = paramBoolean;
    o();
  }
  
  public void setFontFamily(String paramString) {
    this.z = paramString;
    this.y = true;
  }
  
  public void setFontSize(float paramFloat) {
    this.x.a(paramFloat);
    a();
  }
  
  public void setFontStyle(String paramString) {
    int i = t.a(paramString);
    if (i != this.B) {
      this.B = i;
      this.y = true;
    } 
  }
  
  public void setFontWeight(String paramString) {
    int i = t.b(paramString);
    if (i != this.A) {
      this.A = i;
      this.y = true;
    } 
  }
  
  void setGravityHorizontal(int paramInt) {
    int i = paramInt;
    if (paramInt == 0)
      i = this.h; 
    setGravity(i | getGravity() & 0xFFFFFFF8 & 0xFF7FFFF8);
  }
  
  void setGravityVertical(int paramInt) {
    int i = paramInt;
    if (paramInt == 0)
      i = this.i; 
    setGravity(i | getGravity() & 0xFFFFFF8F);
  }
  
  public void setInputType(int paramInt) {
    Typeface typeface = getTypeface();
    super.setInputType(paramInt);
    this.m = paramInt;
    setTypeface(typeface);
    if (f())
      setSingleLine(false); 
    this.u.a(paramInt);
    setKeyListener(this.u);
  }
  
  public void setLetterSpacingPt(float paramFloat) {
    this.x.c(paramFloat);
    a();
  }
  
  public void setMaxFontSizeMultiplier(float paramFloat) {
    if (paramFloat != this.x.j()) {
      this.x.e(paramFloat);
      a();
    } 
  }
  
  public void setOnKeyPress(boolean paramBoolean) {
    this.w = paramBoolean;
  }
  
  public void setReturnKeyType(String paramString) {
    this.q = paramString;
    o();
  }
  
  public void setScrollWatcher(o paramo) {
    this.t = paramo;
  }
  
  public void setSelection(int paramInt1, int paramInt2) {
    super.setSelection(paramInt1, paramInt2);
  }
  
  public void setSelectionWatcher(p paramp) {
    this.r = paramp;
  }
  
  void setStagedInputType(int paramInt) {
    this.m = paramInt;
  }
  
  protected boolean verifyDrawable(Drawable paramDrawable) {
    if (this.n) {
      Editable editable = getText();
      int j = editable.length();
      int i = 0;
      z[] arrayOfZ = (z[])editable.getSpans(0, j, z.class);
      j = arrayOfZ.length;
      while (i < j) {
        if (arrayOfZ[i].a() == paramDrawable)
          return true; 
        i++;
      } 
    } 
    return super.verifyDrawable(paramDrawable);
  }
  
  class a extends b.g.m.a {
    a(c this$0) {}
    
    public boolean a(View param1View, int param1Int, Bundle param1Bundle) {
      return (param1Int == 16) ? c.a(this.d) : super.a(param1View, param1Int, param1Bundle);
    }
  }
  
  private static class b implements KeyListener {
    private int c = 0;
    
    public void a(int param1Int) {
      this.c = param1Int;
    }
    
    public void clearMetaKeyState(View param1View, Editable param1Editable, int param1Int) {
      c.j().clearMetaKeyState(param1View, param1Editable, param1Int);
    }
    
    public int getInputType() {
      return this.c;
    }
    
    public boolean onKeyDown(View param1View, Editable param1Editable, int param1Int, KeyEvent param1KeyEvent) {
      return c.j().onKeyDown(param1View, param1Editable, param1Int, param1KeyEvent);
    }
    
    public boolean onKeyOther(View param1View, Editable param1Editable, KeyEvent param1KeyEvent) {
      return c.j().onKeyOther(param1View, param1Editable, param1KeyEvent);
    }
    
    public boolean onKeyUp(View param1View, Editable param1Editable, int param1Int, KeyEvent param1KeyEvent) {
      return c.j().onKeyUp(param1View, param1Editable, param1Int, param1KeyEvent);
    }
  }
  
  private class c implements TextWatcher {
    private c(c this$0) {}
    
    public void afterTextChanged(Editable param1Editable) {
      c c1 = this.c;
      if (!c1.g && c.b(c1) != null) {
        Iterator<TextWatcher> iterator = c.b(this.c).iterator();
        while (iterator.hasNext())
          ((TextWatcher)iterator.next()).afterTextChanged(param1Editable); 
      } 
    }
    
    public void beforeTextChanged(CharSequence param1CharSequence, int param1Int1, int param1Int2, int param1Int3) {
      c c1 = this.c;
      if (!c1.g && c.b(c1) != null) {
        Iterator<TextWatcher> iterator = c.b(this.c).iterator();
        while (iterator.hasNext())
          ((TextWatcher)iterator.next()).beforeTextChanged(param1CharSequence, param1Int1, param1Int2, param1Int3); 
      } 
    }
    
    public void onTextChanged(CharSequence param1CharSequence, int param1Int1, int param1Int2, int param1Int3) {
      c c1 = this.c;
      if (!c1.g && c.b(c1) != null) {
        Iterator<TextWatcher> iterator = c.b(this.c).iterator();
        while (iterator.hasNext())
          ((TextWatcher)iterator.next()).onTextChanged(param1CharSequence, param1Int1, param1Int2, param1Int3); 
      } 
      c.c(this.c);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/textinput/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */