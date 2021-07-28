package com.BV.LinearGradient;

import android.content.Context;
import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.e1.a;
import com.facebook.react.uimanager.k0;

public class LinearGradientManager extends SimpleViewManager<b> {
  public static final String PROP_ANGLE = "angle";
  
  public static final String PROP_ANGLE_CENTER = "angleCenter";
  
  public static final String PROP_BORDER_RADII = "borderRadii";
  
  public static final String PROP_COLORS = "colors";
  
  public static final String PROP_END_POS = "endPoint";
  
  public static final String PROP_LOCATIONS = "locations";
  
  public static final String PROP_START_POS = "startPoint";
  
  public static final String PROP_USE_ANGLE = "useAngle";
  
  public static final String REACT_CLASS = "BVLinearGradient";
  
  protected b createViewInstance(k0 paramk0) {
    return new b((Context)paramk0);
  }
  
  public String getName() {
    return "BVLinearGradient";
  }
  
  @a(defaultFloat = 45.0F, name = "angle")
  public void setAngle(b paramb, float paramFloat) {
    paramb.setAngle(paramFloat);
  }
  
  @a(name = "angleCenter")
  public void setAngleCenter(b paramb, ReadableArray paramReadableArray) {
    paramb.setAngleCenter(paramReadableArray);
  }
  
  @a(name = "borderRadii")
  public void setBorderRadii(b paramb, ReadableArray paramReadableArray) {
    paramb.setBorderRadii(paramReadableArray);
  }
  
  @a(name = "colors")
  public void setColors(b paramb, ReadableArray paramReadableArray) {
    paramb.setColors(paramReadableArray);
  }
  
  @a(name = "endPoint")
  public void setEndPosition(b paramb, ReadableArray paramReadableArray) {
    paramb.setEndPosition(paramReadableArray);
  }
  
  @a(name = "locations")
  public void setLocations(b paramb, ReadableArray paramReadableArray) {
    if (paramReadableArray != null)
      paramb.setLocations(paramReadableArray); 
  }
  
  @a(name = "startPoint")
  public void setStartPosition(b paramb, ReadableArray paramReadableArray) {
    paramb.setStartPosition(paramReadableArray);
  }
  
  @a(defaultBoolean = false, name = "useAngle")
  public void setUseAngle(b paramb, boolean paramBoolean) {
    paramb.setUseAngle(paramBoolean);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/BV/LinearGradient/LinearGradientManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */