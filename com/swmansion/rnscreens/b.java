package com.swmansion.rnscreens;

import android.content.Context;
import android.graphics.Paint;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerModule;

public class b extends ViewGroup {
  private static View.OnAttachStateChangeListener j = new a();
  
  private f c;
  
  private d d;
  
  private boolean e;
  
  private boolean f;
  
  private d g = d.c;
  
  private c h = c.c;
  
  private boolean i = true;
  
  public b(ReactContext paramReactContext) {
    super((Context)paramReactContext);
    setLayoutParams((ViewGroup.LayoutParams)new WindowManager.LayoutParams(2));
  }
  
  public boolean a() {
    return this.e;
  }
  
  public boolean b() {
    return this.i;
  }
  
  protected void dispatchRestoreInstanceState(SparseArray<Parcelable> paramSparseArray) {}
  
  protected void dispatchSaveInstanceState(SparseArray<Parcelable> paramSparseArray) {}
  
  protected d getContainer() {
    return this.d;
  }
  
  protected f getFragment() {
    return this.c;
  }
  
  public c getStackAnimation() {
    return this.h;
  }
  
  public d getStackPresentation() {
    return this.g;
  }
  
  protected void onAnimationEnd() {
    super.onAnimationEnd();
    f f1 = this.c;
    if (f1 != null)
      f1.x0(); 
  }
  
  protected void onAttachedToWindow() {
    super.onAttachedToWindow();
    View view = getFocusedChild();
    if (view != null) {
      while (view instanceof ViewGroup)
        view = ((ViewGroup)view).getFocusedChild(); 
      if (view instanceof TextView) {
        TextView textView = (TextView)view;
        if (textView.getShowSoftInputOnFocus())
          textView.addOnAttachStateChangeListener(j); 
      } 
    } 
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (paramBoolean) {
      ReactContext reactContext = (ReactContext)getContext();
      reactContext.runOnNativeModulesQueueThread((Runnable)new b(this, reactContext, reactContext, paramInt3 - paramInt1, paramInt4 - paramInt2));
    } 
  }
  
  public void setActive(boolean paramBoolean) {
    if (paramBoolean == this.e)
      return; 
    this.e = paramBoolean;
    d d1 = this.d;
    if (d1 != null)
      d1.b(); 
  }
  
  protected void setContainer(d paramd) {
    this.d = paramd;
  }
  
  protected void setFragment(f paramf) {
    this.c = paramf;
  }
  
  public void setGestureEnabled(boolean paramBoolean) {
    this.i = paramBoolean;
  }
  
  public void setLayerType(int paramInt, Paint paramPaint) {}
  
  public void setStackAnimation(c paramc) {
    this.h = paramc;
  }
  
  public void setStackPresentation(d paramd) {
    this.g = paramd;
  }
  
  public void setTransitioning(boolean paramBoolean) {
    boolean bool;
    if (this.f == paramBoolean)
      return; 
    this.f = paramBoolean;
    if (paramBoolean) {
      bool = true;
    } else {
      bool = false;
    } 
    super.setLayerType(bool, null);
  }
  
  class a implements View.OnAttachStateChangeListener {
    public void onViewAttachedToWindow(View param1View) {
      ((InputMethodManager)param1View.getContext().getSystemService("input_method")).showSoftInput(param1View, 0);
      param1View.removeOnAttachStateChangeListener(b.c());
    }
    
    public void onViewDetachedFromWindow(View param1View) {}
  }
  
  class b extends GuardedRunnable {
    b(b this$0, ReactContext param1ReactContext1, ReactContext param1ReactContext2, int param1Int1, int param1Int2) {
      super(param1ReactContext1);
    }
    
    public void runGuarded() {
      ((UIManagerModule)this.c.getNativeModule(UIManagerModule.class)).updateNodeSize(this.f.getId(), this.d, this.e);
    }
  }
  
  public enum c {
    c, d, e;
  }
  
  public enum d {
    c, d, e;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/swmansion/rnscreens/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */