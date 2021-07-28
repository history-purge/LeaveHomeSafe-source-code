package com.facebook.react.views.scroll;

import android.util.DisplayMetrics;
import android.view.View;
import b.g.m.v;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.RetryableMountingLayerException;
import com.facebook.react.common.f;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.c;
import com.facebook.react.uimanager.c0;
import com.facebook.react.uimanager.e1.a;
import com.facebook.react.uimanager.e1.b;
import com.facebook.react.uimanager.j0;
import com.facebook.react.uimanager.k0;
import com.facebook.react.uimanager.q;
import com.facebook.yoga.g;
import e.e.o.d0.a.a;
import java.util.ArrayList;
import java.util.Map;

@a(name = "RCTScrollView")
public class ReactScrollViewManager extends ViewGroupManager<e> implements f.a<e> {
  public static final String REACT_CLASS = "RCTScrollView";
  
  private static final int[] SPACING_TYPES = new int[] { 8, 0, 2, 1, 3 };
  
  private a mFpsListener = null;
  
  public ReactScrollViewManager() {
    this(null);
  }
  
  public ReactScrollViewManager(a parama) {
    this.mFpsListener = parama;
  }
  
  public static Map<String, Object> createExportedCustomDirectEventTypeConstants() {
    f.b b = f.a();
    b.a(i.a(i.e), f.a("registrationName", "onScroll"));
    b.a(i.a(i.c), f.a("registrationName", "onScrollBeginDrag"));
    b.a(i.a(i.d), f.a("registrationName", "onScrollEndDrag"));
    b.a(i.a(i.f), f.a("registrationName", "onMomentumScrollBegin"));
    b.a(i.a(i.g), f.a("registrationName", "onMomentumScrollEnd"));
    return b.a();
  }
  
  public e createViewInstance(k0 paramk0) {
    return new e((ReactContext)paramk0, this.mFpsListener);
  }
  
  public void flashScrollIndicators(e parame) {
    parame.b();
  }
  
  public Map<String, Integer> getCommandsMap() {
    return f.a();
  }
  
  public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
    return createExportedCustomDirectEventTypeConstants();
  }
  
  public String getName() {
    return "RCTScrollView";
  }
  
  public void receiveCommand(e parame, int paramInt, ReadableArray paramReadableArray) {
    f.a(this, parame, paramInt, paramReadableArray);
  }
  
  public void receiveCommand(e parame, String paramString, ReadableArray paramReadableArray) {
    f.a(this, parame, paramString, paramReadableArray);
  }
  
  public void scrollTo(e parame, f.b paramb) {
    if (paramb.c) {
      parame.b(paramb.a, paramb.b);
      return;
    } 
    parame.a(paramb.a, paramb.b);
  }
  
  public void scrollToEnd(e parame, f.c paramc) {
    View view = parame.getChildAt(0);
    if (view != null) {
      int i = view.getHeight() + parame.getPaddingBottom();
      if (paramc.a) {
        parame.b(parame.getScrollX(), i);
        return;
      } 
      parame.a(parame.getScrollX(), i);
      return;
    } 
    throw new RetryableMountingLayerException("scrollToEnd called on ScrollView without child");
  }
  
  @b(customType = "Color", names = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor"})
  public void setBorderColor(e parame, int paramInt, Integer paramInteger) {
    float f1;
    float f2 = Float.NaN;
    if (paramInteger == null) {
      f1 = Float.NaN;
    } else {
      f1 = (paramInteger.intValue() & 0xFFFFFF);
    } 
    if (paramInteger != null)
      f2 = (paramInteger.intValue() >>> 24); 
    parame.a(SPACING_TYPES[paramInt], f1, f2);
  }
  
  @b(defaultFloat = NaNF, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"})
  public void setBorderRadius(e parame, int paramInt, float paramFloat) {
    float f = paramFloat;
    if (!g.a(paramFloat))
      f = q.b(paramFloat); 
    if (paramInt == 0) {
      parame.setBorderRadius(f);
      return;
    } 
    parame.a(f, paramInt - 1);
  }
  
  @a(name = "borderStyle")
  public void setBorderStyle(e parame, String paramString) {
    parame.setBorderStyle(paramString);
  }
  
  @b(defaultFloat = NaNF, names = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth"})
  public void setBorderWidth(e parame, int paramInt, float paramFloat) {
    float f = paramFloat;
    if (!g.a(paramFloat))
      f = q.b(paramFloat); 
    parame.a(SPACING_TYPES[paramInt], f);
  }
  
  @a(customType = "Color", defaultInt = 0, name = "endFillColor")
  public void setBottomFillColor(e parame, int paramInt) {
    parame.setEndFillColor(paramInt);
  }
  
  @a(name = "decelerationRate")
  public void setDecelerationRate(e parame, float paramFloat) {
    parame.setDecelerationRate(paramFloat);
  }
  
  @a(name = "disableIntervalMomentum")
  public void setDisableIntervalMomentum(e parame, boolean paramBoolean) {
    parame.setDisableIntervalMomentum(paramBoolean);
  }
  
  @a(name = "fadingEdgeLength")
  public void setFadingEdgeLength(e parame, int paramInt) {
    if (paramInt > 0) {
      parame.setVerticalFadingEdgeEnabled(true);
    } else {
      paramInt = 0;
      parame.setVerticalFadingEdgeEnabled(false);
    } 
    parame.setFadingEdgeLength(paramInt);
  }
  
  @a(name = "nestedScrollEnabled")
  public void setNestedScrollEnabled(e parame, boolean paramBoolean) {
    v.c((View)parame, paramBoolean);
  }
  
  @a(name = "overScrollMode")
  public void setOverScrollMode(e parame, String paramString) {
    parame.setOverScrollMode(g.a(paramString));
  }
  
  @a(name = "overflow")
  public void setOverflow(e parame, String paramString) {
    parame.setOverflow(paramString);
  }
  
  @a(name = "pagingEnabled")
  public void setPagingEnabled(e parame, boolean paramBoolean) {
    parame.setPagingEnabled(paramBoolean);
  }
  
  @a(name = "persistentScrollbar")
  public void setPersistentScrollbar(e parame, boolean paramBoolean) {
    parame.setScrollbarFadingEnabled(paramBoolean ^ true);
  }
  
  @a(name = "removeClippedSubviews")
  public void setRemoveClippedSubviews(e parame, boolean paramBoolean) {
    parame.setRemoveClippedSubviews(paramBoolean);
  }
  
  @a(defaultBoolean = true, name = "scrollEnabled")
  public void setScrollEnabled(e parame, boolean paramBoolean) {
    parame.setScrollEnabled(paramBoolean);
    parame.setFocusable(paramBoolean);
  }
  
  @a(name = "scrollPerfTag")
  public void setScrollPerfTag(e parame, String paramString) {
    parame.setScrollPerfTag(paramString);
  }
  
  @a(name = "sendMomentumEvents")
  public void setSendMomentumEvents(e parame, boolean paramBoolean) {
    parame.setSendMomentumEvents(paramBoolean);
  }
  
  @a(name = "showsVerticalScrollIndicator")
  public void setShowsVerticalScrollIndicator(e parame, boolean paramBoolean) {
    parame.setVerticalScrollBarEnabled(paramBoolean);
  }
  
  @a(name = "snapToEnd")
  public void setSnapToEnd(e parame, boolean paramBoolean) {
    parame.setSnapToEnd(paramBoolean);
  }
  
  @a(name = "snapToInterval")
  public void setSnapToInterval(e parame, float paramFloat) {
    parame.setSnapInterval((int)(paramFloat * (c.a()).density));
  }
  
  @a(name = "snapToOffsets")
  public void setSnapToOffsets(e parame, ReadableArray paramReadableArray) {
    DisplayMetrics displayMetrics = c.a();
    ArrayList<Integer> arrayList = new ArrayList();
    int i;
    for (i = 0; i < paramReadableArray.size(); i++) {
      double d1 = paramReadableArray.getDouble(i);
      double d2 = displayMetrics.density;
      Double.isNaN(d2);
      arrayList.add(Integer.valueOf((int)(d1 * d2)));
    } 
    parame.setSnapOffsets(arrayList);
  }
  
  @a(name = "snapToStart")
  public void setSnapToStart(e parame, boolean paramBoolean) {
    parame.setSnapToStart(paramBoolean);
  }
  
  public Object updateState(e parame, c0 paramc0, j0 paramj0) {
    parame.a(paramj0);
    return null;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/scroll/ReactScrollViewManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */