package com.swmansion.rnscreens;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.d;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import java.util.ArrayList;

public class i extends ViewGroup {
  private final ArrayList<j> c = new ArrayList<j>(3);
  
  private String d;
  
  private int e;
  
  private String f;
  
  private float g;
  
  private int h;
  
  private boolean i;
  
  private boolean j;
  
  private boolean k;
  
  private boolean l;
  
  private boolean m;
  
  private boolean n = true;
  
  private int o;
  
  private final Toolbar p;
  
  private boolean q = false;
  
  private int r;
  
  private int s;
  
  private View.OnClickListener t = new a(this);
  
  public i(Context paramContext) {
    super(paramContext);
    setVisibility(8);
    this.p = new Toolbar(paramContext);
    this.r = this.p.getContentInsetStart();
    this.s = this.p.getContentInsetStartWithNavigation();
    TypedValue typedValue = new TypedValue();
    if (paramContext.getTheme().resolveAttribute(16843827, typedValue, true))
      this.p.setBackgroundColor(typedValue.data); 
  }
  
  private void d() {
    if (getParent() != null && !this.l)
      b(); 
  }
  
  private b getScreen() {
    ViewParent viewParent = getParent();
    return (viewParent instanceof b) ? (b)viewParent : null;
  }
  
  private h getScreenFragment() {
    ViewParent viewParent = getParent();
    if (viewParent instanceof b) {
      f f = ((b)viewParent).getFragment();
      if (f instanceof h)
        return (h)f; 
    } 
    return null;
  }
  
  private g getScreenStack() {
    b b = getScreen();
    if (b != null) {
      d d = b.getContainer();
      if (d instanceof g)
        return (g)d; 
    } 
    return null;
  }
  
  private TextView getTitleTextView() {
    int k = this.p.getChildCount();
    for (int j = 0; j < k; j++) {
      View view = this.p.getChildAt(j);
      if (view instanceof TextView) {
        TextView textView = (TextView)view;
        if (textView.getText().equals(this.p.getTitle()))
          return textView; 
      } 
    } 
    return null;
  }
  
  public j a(int paramInt) {
    return this.c.get(paramInt);
  }
  
  public void a() {
    this.l = true;
  }
  
  public void a(j paramj, int paramInt) {
    this.c.add(paramInt, paramj);
    d();
  }
  
  public void b() {
    int j;
    b b = (b)getParent();
    g g = getScreenStack();
    if (g == null || g.getTopScreen() == b) {
      j = 1;
    } else {
      j = 0;
    } 
    if (this.q && j) {
      boolean bool;
      if (this.l)
        return; 
      d d = (d)getScreenFragment().h();
      if (d == null)
        return; 
      if (this.i) {
        if (this.p.getParent() != null)
          getScreenFragment().C0(); 
        return;
      } 
      if (this.p.getParent() == null)
        getScreenFragment().a(this.p); 
      if (this.n) {
        Toolbar toolbar1;
        if (Build.VERSION.SDK_INT >= 23) {
          toolbar1 = this.p;
          j = getRootWindowInsets().getSystemWindowInsetTop();
        } else {
          toolbar1 = this.p;
          j = (int)((getResources().getDisplayMetrics()).density * 25.0F);
        } 
        toolbar1.setPadding(0, j, 0, 0);
      } else if (this.p.getPaddingTop() > 0) {
        this.p.setPadding(0, 0, 0, 0);
      } 
      d.a(this.p);
      androidx.appcompat.app.a a = d.q();
      this.p.setContentInsetStartWithNavigation(this.s);
      Toolbar toolbar = this.p;
      j = this.r;
      toolbar.a(j, j);
      if (getScreenFragment().y0() && !this.j) {
        bool = true;
      } else {
        bool = false;
      } 
      a.d(bool);
      this.p.setNavigationOnClickListener(this.t);
      getScreenFragment().j(this.k);
      a.a(this.d);
      if (TextUtils.isEmpty(this.d))
        this.p.setContentInsetStartWithNavigation(0); 
      TextView textView = getTitleTextView();
      j = this.e;
      if (j != 0)
        this.p.setTitleTextColor(j); 
      if (textView != null) {
        if (this.f != null)
          textView.setTypeface(com.facebook.react.views.text.i.a().a(this.f, 0, getContext().getAssets())); 
        float f = this.g;
        if (f > 0.0F)
          textView.setTextSize(f); 
      } 
      j = this.h;
      if (j != 0)
        this.p.setBackgroundColor(j); 
      if (this.o != 0) {
        Drawable drawable = this.p.getNavigationIcon();
        if (drawable != null)
          drawable.setColorFilter(this.o, PorterDuff.Mode.SRC_ATOP); 
      } 
      for (j = this.p.getChildCount() - 1; j >= 0; j--) {
        if (this.p.getChildAt(j) instanceof j)
          this.p.removeViewAt(j); 
      } 
      int k = this.c.size();
      for (j = 0; j < k; j++) {
        View view;
        j j1 = this.c.get(j);
        j.a a1 = j1.getType();
        if (a1 == j.a.f) {
          view = j1.getChildAt(0);
          if (view instanceof ImageView) {
            a.a(((ImageView)view).getDrawable());
          } else {
            throw new JSApplicationIllegalArgumentException("Back button header config view should have Image as first child");
          } 
        } else {
          Toolbar.e e = new Toolbar.e(-2, -1);
          int m = b.a[a1.ordinal()];
          if (m != 1) {
            if (m != 2) {
              if (m == 3) {
                ((ViewGroup.MarginLayoutParams)e).width = -1;
                ((androidx.appcompat.app.a.a)e).a = 1;
                this.p.setTitle(null);
              } 
            } else {
              ((androidx.appcompat.app.a.a)e).a = 5;
            } 
          } else {
            if (!this.m)
              this.p.setNavigationIcon(null); 
            this.p.setTitle(null);
            ((androidx.appcompat.app.a.a)e).a = 3;
          } 
          view.setLayoutParams((ViewGroup.LayoutParams)e);
          this.p.addView(view);
        } 
      } 
    } 
  }
  
  public void b(int paramInt) {
    this.c.remove(paramInt);
    d();
  }
  
  public void c() {
    this.c.clear();
    d();
  }
  
  public int getConfigSubviewsCount() {
    return this.c.size();
  }
  
  protected void onAttachedToWindow() {
    super.onAttachedToWindow();
    this.q = true;
    b();
  }
  
  protected void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    this.q = false;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
  
  public void setBackButtonInCustomView(boolean paramBoolean) {
    this.m = paramBoolean;
  }
  
  public void setBackgroundColor(int paramInt) {
    this.h = paramInt;
  }
  
  public void setHidden(boolean paramBoolean) {
    this.i = paramBoolean;
  }
  
  public void setHideBackButton(boolean paramBoolean) {
    this.j = paramBoolean;
  }
  
  public void setHideShadow(boolean paramBoolean) {
    this.k = paramBoolean;
  }
  
  public void setTintColor(int paramInt) {
    this.o = paramInt;
  }
  
  public void setTitle(String paramString) {
    this.d = paramString;
  }
  
  public void setTitleColor(int paramInt) {
    this.e = paramInt;
  }
  
  public void setTitleFontFamily(String paramString) {
    this.f = paramString;
  }
  
  public void setTitleFontSize(float paramFloat) {
    this.g = paramFloat;
  }
  
  public void setTopInsetEnabled(boolean paramBoolean) {
    this.n = paramBoolean;
  }
  
  class a implements View.OnClickListener {
    a(i this$0) {}
    
    public void onClick(View param1View) {
      h h = i.a(this.c);
      if (h != null) {
        g g = i.b(this.c);
        Fragment fragment = h;
        if (g != null) {
          fragment = h;
          if (g.getRootScreen() == h.w0()) {
            fragment = h.y();
            if (fragment instanceof h) {
              fragment = fragment;
            } else {
              return;
            } 
          } 
        } 
        fragment.z0();
      } 
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/swmansion/rnscreens/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */