package com.facebook.react.views.switchview;

import android.content.Context;
import android.view.View;
import android.widget.CompoundButton;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
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
import e.e.o.h0.k;
import e.e.o.h0.l;

public class ReactSwitchManager extends SimpleViewManager<a> implements l<a> {
  private static final CompoundButton.OnCheckedChangeListener ON_CHECKED_CHANGE_LISTENER = new a();
  
  public static final String REACT_CLASS = "AndroidSwitch";
  
  private final y0<a> mDelegate = (y0<a>)new k((com.facebook.react.uimanager.b)this);
  
  private static void setValueInternal(a parama, boolean paramBoolean) {
    parama.setOnCheckedChangeListener(null);
    parama.a(paramBoolean);
    parama.setOnCheckedChangeListener(ON_CHECKED_CHANGE_LISTENER);
  }
  
  protected void addEventEmitters(k0 paramk0, a parama) {
    parama.setOnCheckedChangeListener(ON_CHECKED_CHANGE_LISTENER);
  }
  
  public i createShadowNodeInstance() {
    return new b(null);
  }
  
  protected a createViewInstance(k0 paramk0) {
    a a = new a((Context)paramk0);
    a.setShowText(false);
    return a;
  }
  
  protected y0<a> getDelegate() {
    return this.mDelegate;
  }
  
  public String getName() {
    return "AndroidSwitch";
  }
  
  public Class getShadowNodeClass() {
    return b.class;
  }
  
  public long measure(Context paramContext, ReadableMap paramReadableMap1, ReadableMap paramReadableMap2, ReadableMap paramReadableMap3, float paramFloat1, n paramn1, float paramFloat2, n paramn2, int[] paramArrayOfint) {
    a a = new a(paramContext);
    a.setShowText(false);
    int i = View.MeasureSpec.makeMeasureSpec(0, 0);
    a.measure(i, i);
    return o.a(q.a(a.getMeasuredWidth()), q.a(a.getMeasuredHeight()));
  }
  
  public void receiveCommand(a parama, String paramString, ReadableArray paramReadableArray) {
    int i = paramString.hashCode();
    boolean bool2 = false;
    if (i == -669744680 && paramString.equals("setNativeValue")) {
      i = 0;
    } else {
      i = -1;
    } 
    if (i != 0)
      return; 
    boolean bool1 = bool2;
    if (paramReadableArray != null) {
      bool1 = bool2;
      if (paramReadableArray.getBoolean(0))
        bool1 = true; 
    } 
    setValueInternal(parama, bool1);
  }
  
  @com.facebook.react.uimanager.e1.a(defaultBoolean = false, name = "disabled")
  public void setDisabled(a parama, boolean paramBoolean) {
    parama.setEnabled(paramBoolean ^ true);
  }
  
  @com.facebook.react.uimanager.e1.a(defaultBoolean = true, name = "enabled")
  public void setEnabled(a parama, boolean paramBoolean) {
    parama.setEnabled(paramBoolean);
  }
  
  public void setNativeValue(a parama, boolean paramBoolean) {}
  
  @com.facebook.react.uimanager.e1.a(name = "on")
  public void setOn(a parama, boolean paramBoolean) {
    setValueInternal(parama, paramBoolean);
  }
  
  @com.facebook.react.uimanager.e1.a(customType = "Color", name = "thumbColor")
  public void setThumbColor(a parama, Integer paramInteger) {
    parama.a(paramInteger);
  }
  
  @com.facebook.react.uimanager.e1.a(customType = "Color", name = "thumbTintColor")
  public void setThumbTintColor(a parama, Integer paramInteger) {
    setThumbColor(parama, paramInteger);
  }
  
  @com.facebook.react.uimanager.e1.a(customType = "Color", name = "trackColorForFalse")
  public void setTrackColorForFalse(a parama, Integer paramInteger) {
    parama.c(paramInteger);
  }
  
  @com.facebook.react.uimanager.e1.a(customType = "Color", name = "trackColorForTrue")
  public void setTrackColorForTrue(a parama, Integer paramInteger) {
    parama.d(paramInteger);
  }
  
  @com.facebook.react.uimanager.e1.a(customType = "Color", name = "trackTintColor")
  public void setTrackTintColor(a parama, Integer paramInteger) {
    parama.b(paramInteger);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "value")
  public void setValue(a parama, boolean paramBoolean) {
    setValueInternal(parama, paramBoolean);
  }
  
  static final class a implements CompoundButton.OnCheckedChangeListener {
    public void onCheckedChanged(CompoundButton param1CompoundButton, boolean param1Boolean) {
      ((UIManagerModule)((ReactContext)param1CompoundButton.getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher().a(new b(param1CompoundButton.getId(), param1Boolean));
    }
  }
  
  static class b extends i implements m {
    private int B;
    
    private int C;
    
    private boolean D;
    
    private b() {
      Q();
    }
    
    private void Q() {
      a(this);
    }
    
    public long a(p param1p, float param1Float1, n param1n1, float param1Float2, n param1n2) {
      if (!this.D) {
        a a = new a((Context)h());
        a.setShowText(false);
        int j = View.MeasureSpec.makeMeasureSpec(0, 0);
        a.measure(j, j);
        this.B = a.getMeasuredWidth();
        this.C = a.getMeasuredHeight();
        this.D = true;
      } 
      return o.a(this.B, this.C);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/switchview/ReactSwitchManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */