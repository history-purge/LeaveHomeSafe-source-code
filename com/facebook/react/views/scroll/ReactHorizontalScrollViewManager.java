package com.facebook.react.views.scroll;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import b.g.m.v;
import com.facebook.react.bridge.ReadableArray;
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

@a(name = "AndroidHorizontalScrollView")
public class ReactHorizontalScrollViewManager extends ViewGroupManager<d> implements f.a<d> {
  public static final String REACT_CLASS = "AndroidHorizontalScrollView";
  
  private static final int[] SPACING_TYPES = new int[] { 8, 0, 2, 1, 3 };
  
  private a mFpsListener = null;
  
  public ReactHorizontalScrollViewManager() {
    this(null);
  }
  
  public ReactHorizontalScrollViewManager(a parama) {
    this.mFpsListener = parama;
  }
  
  public d createViewInstance(k0 paramk0) {
    return new d((Context)paramk0, this.mFpsListener);
  }
  
  public void flashScrollIndicators(d paramd) {
    paramd.b();
  }
  
  public String getName() {
    return "AndroidHorizontalScrollView";
  }
  
  public void receiveCommand(d paramd, int paramInt, ReadableArray paramReadableArray) {
    f.a(this, paramd, paramInt, paramReadableArray);
  }
  
  public void receiveCommand(d paramd, String paramString, ReadableArray paramReadableArray) {
    f.a(this, paramd, paramString, paramReadableArray);
  }
  
  public void scrollTo(d paramd, f.b paramb) {
    if (paramb.c) {
      paramd.b(paramb.a, paramb.b);
      return;
    } 
    paramd.a(paramb.a, paramb.b);
  }
  
  public void scrollToEnd(d paramd, f.c paramc) {
    int i = paramd.getChildAt(0).getWidth() + paramd.getPaddingRight();
    if (paramc.a) {
      paramd.b(i, paramd.getScrollY());
      return;
    } 
    paramd.a(i, paramd.getScrollY());
  }
  
  @b(customType = "Color", names = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor"})
  public void setBorderColor(d paramd, int paramInt, Integer paramInteger) {
    float f1;
    float f2 = Float.NaN;
    if (paramInteger == null) {
      f1 = Float.NaN;
    } else {
      f1 = (paramInteger.intValue() & 0xFFFFFF);
    } 
    if (paramInteger != null)
      f2 = (paramInteger.intValue() >>> 24); 
    paramd.a(SPACING_TYPES[paramInt], f1, f2);
  }
  
  @b(defaultFloat = NaNF, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"})
  public void setBorderRadius(d paramd, int paramInt, float paramFloat) {
    float f = paramFloat;
    if (!g.a(paramFloat))
      f = q.b(paramFloat); 
    if (paramInt == 0) {
      paramd.setBorderRadius(f);
      return;
    } 
    paramd.a(f, paramInt - 1);
  }
  
  @a(name = "borderStyle")
  public void setBorderStyle(d paramd, String paramString) {
    paramd.setBorderStyle(paramString);
  }
  
  @b(defaultFloat = NaNF, names = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth"})
  public void setBorderWidth(d paramd, int paramInt, float paramFloat) {
    float f = paramFloat;
    if (!g.a(paramFloat))
      f = q.b(paramFloat); 
    paramd.a(SPACING_TYPES[paramInt], f);
  }
  
  @a(customType = "Color", defaultInt = 0, name = "endFillColor")
  public void setBottomFillColor(d paramd, int paramInt) {
    paramd.setEndFillColor(paramInt);
  }
  
  @a(name = "decelerationRate")
  public void setDecelerationRate(d paramd, float paramFloat) {
    paramd.setDecelerationRate(paramFloat);
  }
  
  @a(name = "disableIntervalMomentum")
  public void setDisableIntervalMomentum(d paramd, boolean paramBoolean) {
    paramd.setDisableIntervalMomentum(paramBoolean);
  }
  
  @a(name = "fadingEdgeLength")
  public void setFadingEdgeLength(d paramd, int paramInt) {
    if (paramInt > 0) {
      paramd.setHorizontalFadingEdgeEnabled(true);
    } else {
      paramInt = 0;
      paramd.setHorizontalFadingEdgeEnabled(false);
    } 
    paramd.setFadingEdgeLength(paramInt);
  }
  
  @a(name = "nestedScrollEnabled")
  public void setNestedScrollEnabled(d paramd, boolean paramBoolean) {
    v.c((View)paramd, paramBoolean);
  }
  
  @a(name = "overScrollMode")
  public void setOverScrollMode(d paramd, String paramString) {
    paramd.setOverScrollMode(g.a(paramString));
  }
  
  @a(name = "overflow")
  public void setOverflow(d paramd, String paramString) {
    paramd.setOverflow(paramString);
  }
  
  @a(name = "pagingEnabled")
  public void setPagingEnabled(d paramd, boolean paramBoolean) {
    paramd.setPagingEnabled(paramBoolean);
  }
  
  @a(name = "persistentScrollbar")
  public void setPersistentScrollbar(d paramd, boolean paramBoolean) {
    paramd.setScrollbarFadingEnabled(paramBoolean ^ true);
  }
  
  @a(name = "removeClippedSubviews")
  public void setRemoveClippedSubviews(d paramd, boolean paramBoolean) {
    paramd.setRemoveClippedSubviews(paramBoolean);
  }
  
  @a(defaultBoolean = true, name = "scrollEnabled")
  public void setScrollEnabled(d paramd, boolean paramBoolean) {
    paramd.setScrollEnabled(paramBoolean);
  }
  
  @a(name = "scrollPerfTag")
  public void setScrollPerfTag(d paramd, String paramString) {
    paramd.setScrollPerfTag(paramString);
  }
  
  @a(name = "sendMomentumEvents")
  public void setSendMomentumEvents(d paramd, boolean paramBoolean) {
    paramd.setSendMomentumEvents(paramBoolean);
  }
  
  @a(name = "showsHorizontalScrollIndicator")
  public void setShowsHorizontalScrollIndicator(d paramd, boolean paramBoolean) {
    paramd.setHorizontalScrollBarEnabled(paramBoolean);
  }
  
  @a(name = "snapToEnd")
  public void setSnapToEnd(d paramd, boolean paramBoolean) {
    paramd.setSnapToEnd(paramBoolean);
  }
  
  @a(name = "snapToInterval")
  public void setSnapToInterval(d paramd, float paramFloat) {
    paramd.setSnapInterval((int)(paramFloat * (c.a()).density));
  }
  
  @a(name = "snapToOffsets")
  public void setSnapToOffsets(d paramd, ReadableArray paramReadableArray) {
    DisplayMetrics displayMetrics = c.a();
    ArrayList<Integer> arrayList = new ArrayList();
    int i;
    for (i = 0; i < paramReadableArray.size(); i++) {
      double d1 = paramReadableArray.getDouble(i);
      double d2 = displayMetrics.density;
      Double.isNaN(d2);
      arrayList.add(Integer.valueOf((int)(d1 * d2)));
    } 
    paramd.setSnapOffsets(arrayList);
  }
  
  @a(name = "snapToStart")
  public void setSnapToStart(d paramd, boolean paramBoolean) {
    paramd.setSnapToStart(paramBoolean);
  }
  
  public Object updateState(d paramd, c0 paramc0, j0 paramj0) {
    paramd.a(paramj0);
    return null;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/scroll/ReactHorizontalScrollViewManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */