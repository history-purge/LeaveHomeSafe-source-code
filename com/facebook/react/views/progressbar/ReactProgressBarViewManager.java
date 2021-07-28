package com.facebook.react.views.progressbar;

import android.content.Context;
import android.view.View;
import android.widget.ProgressBar;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.a0;
import com.facebook.react.uimanager.b;
import com.facebook.react.uimanager.e1.a;
import com.facebook.react.uimanager.k0;
import com.facebook.react.uimanager.y0;
import e.e.o.d0.a.a;
import e.e.o.h0.g;
import e.e.o.h0.h;

@a(name = "AndroidProgressBar")
public class ReactProgressBarViewManager extends BaseViewManager<a, b> implements h<a> {
  static final String DEFAULT_STYLE = "Normal";
  
  static final String PROP_ANIMATING = "animating";
  
  static final String PROP_INDETERMINATE = "indeterminate";
  
  static final String PROP_PROGRESS = "progress";
  
  static final String PROP_STYLE = "styleAttr";
  
  public static final String REACT_CLASS = "AndroidProgressBar";
  
  private static Object sProgressBarCtorLock = new Object();
  
  private final y0<a> mDelegate = (y0<a>)new g((b)this);
  
  public static ProgressBar createProgressBar(Context paramContext, int paramInt) {
    synchronized (sProgressBarCtorLock) {
      return new ProgressBar(paramContext, null, paramInt);
    } 
  }
  
  static int getStyleFromString(String paramString) {
    if (paramString != null) {
      if (paramString.equals("Horizontal"))
        return 16842872; 
      if (paramString.equals("Small"))
        return 16842873; 
      if (paramString.equals("Large"))
        return 16842874; 
      if (paramString.equals("Inverse"))
        return 16843399; 
      if (paramString.equals("SmallInverse"))
        return 16843400; 
      if (paramString.equals("LargeInverse"))
        return 16843401; 
      if (paramString.equals("Normal"))
        return 16842871; 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Unknown ProgressBar style: ");
      stringBuilder.append(paramString);
      throw new JSApplicationIllegalArgumentException(stringBuilder.toString());
    } 
    throw new JSApplicationIllegalArgumentException("ProgressBar needs to have a style, null received");
  }
  
  public b createShadowNodeInstance() {
    return new b();
  }
  
  protected a createViewInstance(k0 paramk0) {
    return new a((Context)paramk0);
  }
  
  protected y0<a> getDelegate() {
    return this.mDelegate;
  }
  
  public String getName() {
    return "AndroidProgressBar";
  }
  
  public Class<b> getShadowNodeClass() {
    return b.class;
  }
  
  protected void onAfterUpdateTransaction(a parama) {
    parama.a();
  }
  
  @a(name = "animating")
  public void setAnimating(a parama, boolean paramBoolean) {
    parama.a(paramBoolean);
  }
  
  @a(customType = "Color", name = "color")
  public void setColor(a parama, Integer paramInteger) {
    parama.a(paramInteger);
  }
  
  @a(name = "indeterminate")
  public void setIndeterminate(a parama, boolean paramBoolean) {
    parama.b(paramBoolean);
  }
  
  @a(name = "progress")
  public void setProgress(a parama, double paramDouble) {
    parama.a(paramDouble);
  }
  
  @a(name = "styleAttr")
  public void setStyleAttr(a parama, String paramString) {
    parama.a(paramString);
  }
  
  public void setTestID(a parama, String paramString) {
    setTestId((View)parama, paramString);
  }
  
  public void setTypeAttr(a parama, String paramString) {}
  
  public void updateExtraData(a parama, Object paramObject) {}
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/progressbar/ReactProgressBarViewManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */