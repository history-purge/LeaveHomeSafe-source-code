package com.facebook.react.uimanager;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

public interface b<T extends android.view.View> {
  void setAccessibilityActions(T paramT, ReadableArray paramReadableArray);
  
  void setAccessibilityHint(T paramT, String paramString);
  
  void setAccessibilityLabel(T paramT, String paramString);
  
  void setAccessibilityLiveRegion(T paramT, String paramString);
  
  void setAccessibilityRole(T paramT, String paramString);
  
  void setBackgroundColor(T paramT, int paramInt);
  
  void setBorderBottomLeftRadius(T paramT, float paramFloat);
  
  void setBorderBottomRightRadius(T paramT, float paramFloat);
  
  void setBorderRadius(T paramT, float paramFloat);
  
  void setBorderTopLeftRadius(T paramT, float paramFloat);
  
  void setBorderTopRightRadius(T paramT, float paramFloat);
  
  void setElevation(T paramT, float paramFloat);
  
  void setImportantForAccessibility(T paramT, String paramString);
  
  void setNativeId(T paramT, String paramString);
  
  void setOpacity(T paramT, float paramFloat);
  
  void setRenderToHardwareTexture(T paramT, boolean paramBoolean);
  
  void setRotation(T paramT, float paramFloat);
  
  void setScaleX(T paramT, float paramFloat);
  
  void setScaleY(T paramT, float paramFloat);
  
  void setTestId(T paramT, String paramString);
  
  void setTransform(T paramT, ReadableArray paramReadableArray);
  
  void setTranslateX(T paramT, float paramFloat);
  
  void setTranslateY(T paramT, float paramFloat);
  
  void setViewState(T paramT, ReadableMap paramReadableMap);
  
  void setZIndex(T paramT, float paramFloat);
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/uimanager/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */