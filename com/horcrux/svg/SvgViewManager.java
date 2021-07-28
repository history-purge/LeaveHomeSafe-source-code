package com.horcrux.svg;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.e1.a;
import com.facebook.react.uimanager.k0;
import com.facebook.react.views.view.ReactViewManager;
import com.facebook.react.views.view.f;

class SvgViewManager extends ReactViewManager {
  private static final String REACT_CLASS = "RNSVGSvgView";
  
  private static final SparseArray<Runnable> mTagToRunnable;
  
  private static final SparseArray<f0> mTagToSvgView = new SparseArray();
  
  static {
    mTagToRunnable = new SparseArray();
  }
  
  static f0 getSvgViewByTag(int paramInt) {
    return (f0)mTagToSvgView.get(paramInt);
  }
  
  static void runWhenViewIsAvailable(int paramInt, Runnable paramRunnable) {
    mTagToRunnable.put(paramInt, paramRunnable);
  }
  
  static void setSvgView(int paramInt, f0 paramf0) {
    mTagToSvgView.put(paramInt, paramf0);
    Runnable runnable = (Runnable)mTagToRunnable.get(paramInt);
    if (runnable != null) {
      runnable.run();
      mTagToRunnable.delete(paramInt);
    } 
  }
  
  public f0 createViewInstance(k0 paramk0) {
    return new f0((ReactContext)paramk0);
  }
  
  public String getName() {
    return "RNSVGSvgView";
  }
  
  public boolean needsCustomLayoutForChildren() {
    return true;
  }
  
  public void onDropViewInstance(f paramf) {
    super.onDropViewInstance((View)paramf);
    mTagToSvgView.remove(paramf.getId());
  }
  
  @a(name = "align")
  public void setAlign(f0 paramf0, String paramString) {
    paramf0.setAlign(paramString);
  }
  
  @a(name = "bbHeight")
  public void setBbHeight(f0 paramf0, Dynamic paramDynamic) {
    paramf0.setBbHeight(paramDynamic);
  }
  
  @a(name = "bbWidth")
  public void setBbWidth(f0 paramf0, Dynamic paramDynamic) {
    paramf0.setBbWidth(paramDynamic);
  }
  
  @a(name = "color")
  public void setColor(f0 paramf0, Integer paramInteger) {
    paramf0.setTintColor(paramInteger);
  }
  
  @a(name = "meetOrSlice")
  public void setMeetOrSlice(f0 paramf0, int paramInt) {
    paramf0.setMeetOrSlice(paramInt);
  }
  
  @a(name = "minX")
  public void setMinX(f0 paramf0, float paramFloat) {
    paramf0.setMinX(paramFloat);
  }
  
  @a(name = "minY")
  public void setMinY(f0 paramf0, float paramFloat) {
    paramf0.setMinY(paramFloat);
  }
  
  @a(name = "tintColor")
  public void setTintColor(f0 paramf0, Integer paramInteger) {
    paramf0.setTintColor(paramInteger);
  }
  
  @a(name = "vbHeight")
  public void setVbHeight(f0 paramf0, float paramFloat) {
    paramf0.setVbHeight(paramFloat);
  }
  
  @a(name = "vbWidth")
  public void setVbWidth(f0 paramf0, float paramFloat) {
    paramf0.setVbWidth(paramFloat);
  }
  
  public void updateExtraData(f paramf, Object paramObject) {
    super.updateExtraData((ViewGroup)paramf, paramObject);
    paramf.invalidate();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/horcrux/svg/SvgViewManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */