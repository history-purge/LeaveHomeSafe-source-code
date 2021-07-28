package com.facebook.react.views.image;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.f;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.e1.a;
import com.facebook.react.uimanager.e1.b;
import com.facebook.react.uimanager.k0;
import com.facebook.react.uimanager.q;
import com.facebook.yoga.g;
import e.e.j.a.a.c;
import e.e.j.c.b;
import e.e.o.d0.a.a;
import java.util.Map;

@a(name = "RCTImageView")
public class ReactImageManager extends SimpleViewManager<g> {
  public static final String REACT_CLASS = "RCTImageView";
  
  private final Object mCallerContext;
  
  private final f mCallerContextFactory;
  
  private b mDraweeControllerBuilder = null;
  
  private a mGlobalImageLoadListener;
  
  public ReactImageManager() {
    this.mCallerContext = null;
    this.mCallerContextFactory = null;
  }
  
  public ReactImageManager(b paramb, a parama, f paramf) {
    this.mGlobalImageLoadListener = parama;
    this.mCallerContextFactory = paramf;
    this.mCallerContext = null;
  }
  
  @Deprecated
  public ReactImageManager(b paramb, a parama, Object paramObject) {
    this.mGlobalImageLoadListener = parama;
    this.mCallerContext = paramObject;
    this.mCallerContextFactory = null;
  }
  
  public ReactImageManager(b paramb, f paramf) {
    this(paramb, (a)null, paramf);
  }
  
  @Deprecated
  public ReactImageManager(b paramb, Object paramObject) {
    this(paramb, (a)null, paramObject);
  }
  
  public g createViewInstance(k0 paramk0) {
    Object object = this.mCallerContextFactory;
    if (object != null) {
      Object object1 = object.a(paramk0, null);
    } else {
      object = getCallerContext();
    } 
    return new g((Context)paramk0, getDraweeControllerBuilder(), this.mGlobalImageLoadListener, object);
  }
  
  @Deprecated
  public Object getCallerContext() {
    return this.mCallerContext;
  }
  
  public b getDraweeControllerBuilder() {
    if (this.mDraweeControllerBuilder == null)
      this.mDraweeControllerBuilder = (b)c.d(); 
    return this.mDraweeControllerBuilder;
  }
  
  public Map getExportedCustomDirectEventTypeConstants() {
    return f.a(b.b(4), f.a("registrationName", "onLoadStart"), b.b(2), f.a("registrationName", "onLoad"), b.b(1), f.a("registrationName", "onError"), b.b(3), f.a("registrationName", "onLoadEnd"));
  }
  
  public String getName() {
    return "RCTImageView";
  }
  
  protected void onAfterUpdateTransaction(g paramg) {
    super.onAfterUpdateTransaction((View)paramg);
    paramg.e();
  }
  
  @a(name = "blurRadius")
  public void setBlurRadius(g paramg, float paramFloat) {
    paramg.setBlurRadius(paramFloat);
  }
  
  @a(customType = "Color", name = "borderColor")
  public void setBorderColor(g paramg, Integer paramInteger) {
    int i;
    if (paramInteger == null) {
      i = 0;
    } else {
      i = paramInteger.intValue();
    } 
    paramg.setBorderColor(i);
  }
  
  @b(defaultFloat = NaNF, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"})
  public void setBorderRadius(g paramg, int paramInt, float paramFloat) {
    float f1 = paramFloat;
    if (!g.a(paramFloat))
      f1 = q.b(paramFloat); 
    if (paramInt == 0) {
      paramg.setBorderRadius(f1);
      return;
    } 
    paramg.a(f1, paramInt - 1);
  }
  
  @a(name = "borderWidth")
  public void setBorderWidth(g paramg, float paramFloat) {
    paramg.setBorderWidth(paramFloat);
  }
  
  @a(name = "defaultSrc")
  public void setDefaultSource(g paramg, String paramString) {
    paramg.setDefaultSource(paramString);
  }
  
  @a(name = "fadeDuration")
  public void setFadeDuration(g paramg, int paramInt) {
    paramg.setFadeDuration(paramInt);
  }
  
  @a(name = "headers")
  public void setHeaders(g paramg, ReadableMap paramReadableMap) {
    paramg.setHeaders(paramReadableMap);
  }
  
  @a(name = "internal_analyticTag")
  public void setInternal_AnalyticsTag(g paramg, String paramString) {
    f f1 = this.mCallerContextFactory;
    if (f1 != null)
      paramg.a(f1.a((k0)paramg.getContext(), paramString)); 
  }
  
  @a(name = "shouldNotifyLoadEvents")
  public void setLoadHandlersRegistered(g paramg, boolean paramBoolean) {
    paramg.setShouldNotifyLoadEvents(paramBoolean);
  }
  
  @a(name = "loadingIndicatorSrc")
  public void setLoadingIndicatorSource(g paramg, String paramString) {
    paramg.setLoadingIndicatorSource(paramString);
  }
  
  @a(customType = "Color", name = "overlayColor")
  public void setOverlayColor(g paramg, Integer paramInteger) {
    int i;
    if (paramInteger == null) {
      i = 0;
    } else {
      i = paramInteger.intValue();
    } 
    paramg.setOverlayColor(i);
  }
  
  @a(name = "progressiveRenderingEnabled")
  public void setProgressiveRenderingEnabled(g paramg, boolean paramBoolean) {
    paramg.setProgressiveRenderingEnabled(paramBoolean);
  }
  
  @a(name = "resizeMethod")
  public void setResizeMethod(g paramg, String paramString) {
    StringBuilder stringBuilder;
    c c;
    if (paramString == null || "auto".equals(paramString)) {
      c = c.c;
    } else if ("resize".equals(c)) {
      c = c.d;
    } else if ("scale".equals(c)) {
      c = c.e;
    } else {
      stringBuilder = new StringBuilder();
      stringBuilder.append("Invalid resize method: '");
      stringBuilder.append((String)c);
      stringBuilder.append("'");
      throw new JSApplicationIllegalArgumentException(stringBuilder.toString());
    } 
    stringBuilder.setResizeMethod(c);
  }
  
  @a(name = "resizeMode")
  public void setResizeMode(g paramg, String paramString) {
    paramg.setScaleType(d.a(paramString));
    paramg.setTileMode(d.b(paramString));
  }
  
  @a(name = "src")
  public void setSource(g paramg, ReadableArray paramReadableArray) {
    paramg.setSource(paramReadableArray);
  }
  
  @a(customType = "Color", name = "tintColor")
  public void setTintColor(g paramg, Integer paramInteger) {
    if (paramInteger == null) {
      paramg.clearColorFilter();
      return;
    } 
    paramg.setColorFilter(paramInteger.intValue(), PorterDuff.Mode.SRC_IN);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/image/ReactImageManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */