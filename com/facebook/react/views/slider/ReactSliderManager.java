package com.facebook.react.views.slider;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import b.g.m.v;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.f;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.a0;
import com.facebook.react.uimanager.i;
import com.facebook.react.uimanager.k0;
import com.facebook.react.uimanager.q;
import com.facebook.react.uimanager.y0;
import com.facebook.yoga.m;
import com.facebook.yoga.n;
import com.facebook.yoga.o;
import com.facebook.yoga.p;
import e.e.o.h0.q;
import e.e.o.h0.r;
import java.util.Map;

public class ReactSliderManager extends SimpleViewManager<a> implements r<a> {
  private static final SeekBar.OnSeekBarChangeListener ON_CHANGE_LISTENER = new a();
  
  public static final String REACT_CLASS = "RCTSlider";
  
  private static final int STYLE = 16842875;
  
  protected static b sAccessibilityDelegate = new b();
  
  private final y0<a> mDelegate = (y0<a>)new q((com.facebook.react.uimanager.b)this);
  
  protected void addEventEmitters(k0 paramk0, a parama) {
    parama.setOnSeekBarChangeListener(ON_CHANGE_LISTENER);
  }
  
  public i createShadowNodeInstance() {
    return new c(null);
  }
  
  protected a createViewInstance(k0 paramk0) {
    a a = new a((Context)paramk0, null, 16842875);
    v.a((View)a, sAccessibilityDelegate);
    return a;
  }
  
  protected y0<a> getDelegate() {
    return this.mDelegate;
  }
  
  public Map getExportedCustomDirectEventTypeConstants() {
    return f.a("topSlidingComplete", f.a("registrationName", "onSlidingComplete"));
  }
  
  public String getName() {
    return "RCTSlider";
  }
  
  public Class getShadowNodeClass() {
    return c.class;
  }
  
  public long measure(Context paramContext, ReadableMap paramReadableMap1, ReadableMap paramReadableMap2, ReadableMap paramReadableMap3, float paramFloat1, n paramn1, float paramFloat2, n paramn2, int[] paramArrayOfint) {
    a a = new a(paramContext, null, 16842875);
    int i = View.MeasureSpec.makeMeasureSpec(-2, 0);
    a.measure(i, i);
    return o.a(q.a(a.getMeasuredWidth()), q.a(a.getMeasuredHeight()));
  }
  
  public void setDisabled(a parama, boolean paramBoolean) {}
  
  @com.facebook.react.uimanager.e1.a(defaultBoolean = true, name = "enabled")
  public void setEnabled(a parama, boolean paramBoolean) {
    parama.setEnabled(paramBoolean);
  }
  
  public void setMaximumTrackImage(a parama, ReadableMap paramReadableMap) {}
  
  @com.facebook.react.uimanager.e1.a(customType = "Color", name = "maximumTrackTintColor")
  public void setMaximumTrackTintColor(a parama, Integer paramInteger) {
    Drawable drawable = ((LayerDrawable)parama.getProgressDrawable().getCurrent()).findDrawableByLayerId(16908288);
    if (paramInteger == null) {
      drawable.clearColorFilter();
      return;
    } 
    drawable.setColorFilter(paramInteger.intValue(), PorterDuff.Mode.SRC_IN);
  }
  
  @com.facebook.react.uimanager.e1.a(defaultDouble = 1.0D, name = "maximumValue")
  public void setMaximumValue(a parama, double paramDouble) {
    parama.setMaxValue(paramDouble);
  }
  
  public void setMinimumTrackImage(a parama, ReadableMap paramReadableMap) {}
  
  @com.facebook.react.uimanager.e1.a(customType = "Color", name = "minimumTrackTintColor")
  public void setMinimumTrackTintColor(a parama, Integer paramInteger) {
    Drawable drawable = ((LayerDrawable)parama.getProgressDrawable().getCurrent()).findDrawableByLayerId(16908301);
    if (paramInteger == null) {
      drawable.clearColorFilter();
      return;
    } 
    drawable.setColorFilter(paramInteger.intValue(), PorterDuff.Mode.SRC_IN);
  }
  
  @com.facebook.react.uimanager.e1.a(defaultDouble = 0.0D, name = "minimumValue")
  public void setMinimumValue(a parama, double paramDouble) {
    parama.setMinValue(paramDouble);
  }
  
  @com.facebook.react.uimanager.e1.a(defaultDouble = 0.0D, name = "step")
  public void setStep(a parama, double paramDouble) {
    parama.setStep(paramDouble);
  }
  
  public void setTestID(a parama, String paramString) {
    setTestId((View)parama, paramString);
  }
  
  public void setThumbImage(a parama, ReadableMap paramReadableMap) {}
  
  @com.facebook.react.uimanager.e1.a(customType = "Color", name = "thumbTintColor")
  public void setThumbTintColor(a parama, Integer paramInteger) {
    Drawable drawable = parama.getThumb();
    if (paramInteger == null) {
      drawable.clearColorFilter();
      return;
    } 
    drawable.setColorFilter(paramInteger.intValue(), PorterDuff.Mode.SRC_IN);
  }
  
  public void setTrackImage(a parama, ReadableMap paramReadableMap) {}
  
  @com.facebook.react.uimanager.e1.a(defaultDouble = 0.0D, name = "value")
  public void setValue(a parama, double paramDouble) {
    parama.setOnSeekBarChangeListener(null);
    parama.setValue(paramDouble);
    parama.setOnSeekBarChangeListener(ON_CHANGE_LISTENER);
  }
  
  static final class a implements SeekBar.OnSeekBarChangeListener {
    public void onProgressChanged(SeekBar param1SeekBar, int param1Int, boolean param1Boolean) {
      ((UIManagerModule)((ReactContext)param1SeekBar.getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher().a(new b(param1SeekBar.getId(), ((a)param1SeekBar).a(param1Int), param1Boolean));
    }
    
    public void onStartTrackingTouch(SeekBar param1SeekBar) {}
    
    public void onStopTrackingTouch(SeekBar param1SeekBar) {
      ((UIManagerModule)((ReactContext)param1SeekBar.getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher().a(new c(param1SeekBar.getId(), ((a)param1SeekBar).a(param1SeekBar.getProgress())));
    }
  }
  
  protected static class b extends b.g.m.a {
    private static boolean a(int param1Int) {
      return (param1Int == b.g.m.e0.c.a.i.a() || param1Int == b.g.m.e0.c.a.j.a() || param1Int == b.g.m.e0.c.a.p.a());
    }
    
    public boolean a(View param1View, int param1Int, Bundle param1Bundle) {
      if (a(param1Int))
        ReactSliderManager.ON_CHANGE_LISTENER.onStartTrackingTouch((SeekBar)param1View); 
      boolean bool = super.a(param1View, param1Int, param1Bundle);
      if (a(param1Int))
        ReactSliderManager.ON_CHANGE_LISTENER.onStopTrackingTouch((SeekBar)param1View); 
      return bool;
    }
  }
  
  static class c extends i implements m {
    private int B;
    
    private int C;
    
    private boolean D;
    
    private c() {
      Q();
    }
    
    private void Q() {
      a(this);
    }
    
    public long a(p param1p, float param1Float1, n param1n1, float param1Float2, n param1n2) {
      if (!this.D) {
        a a = new a((Context)h(), null, 16842875);
        int j = View.MeasureSpec.makeMeasureSpec(-2, 0);
        a.measure(j, j);
        this.B = a.getMeasuredWidth();
        this.C = a.getMeasuredHeight();
        this.D = true;
      } 
      return o.a(this.B, this.C);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/slider/ReactSliderManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */