package com.henninghall.date_picker;

import android.content.Context;
import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.f;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.e1.b;
import com.facebook.react.uimanager.k0;
import java.lang.reflect.Method;
import java.util.Map;
import net.time4j.android.ApplicationStarter;

public class DatePickerManager extends SimpleViewManager<f> {
  private static final String REACT_CLASS = "DatePickerManager";
  
  private static final int SCROLL = 1;
  
  public static k0 context;
  
  private b getMethodAnnotation(String paramString) {
    Method[] arrayOfMethod = DatePickerManager.class.getMethods();
    int j = arrayOfMethod.length;
    Method method = null;
    for (int i = 0; i < j; i++) {
      Method method1 = arrayOfMethod[i];
      if (method1.getName().equals(paramString))
        method = method1; 
    } 
    return method.<b>getAnnotation(b.class);
  }
  
  private void updateProp(String paramString, f paramf, int paramInt, Dynamic paramDynamic) {
    paramf.a(getMethodAnnotation(paramString).names()[paramInt], paramDynamic);
  }
  
  public f createViewInstance(k0 paramk0) {
    context = paramk0;
    ApplicationStarter.a((Context)paramk0, false);
    return new f();
  }
  
  public Map<String, Integer> getCommandsMap() {
    return f.a("scroll", Integer.valueOf(1));
  }
  
  public Map getExportedCustomBubblingEventTypeConstants() {
    f.b b = f.a();
    b.a("dateChange", f.a("phasedRegistrationNames", f.a("bubbled", "onChange")));
    return b.a();
  }
  
  public String getName() {
    return "DatePickerManager";
  }
  
  protected void onAfterUpdateTransaction(f paramf) {
    super.onAfterUpdateTransaction((View)paramf);
    try {
      paramf.a();
      return;
    } catch (Exception exception) {
      exception.printStackTrace();
      return;
    } 
  }
  
  public void receiveCommand(f paramf, int paramInt, ReadableArray paramReadableArray) {
    if (paramInt == 1)
      paramf.a(paramReadableArray.getInt(0), paramReadableArray.getInt(1)); 
  }
  
  @b(names = {"date", "mode", "locale", "maximumDate", "minimumDate", "fadeToColor", "textColor", "utc", "minuteInterval", "androidVariant", "dividerHeight", "is24hourSource"})
  public void setProps(f paramf, int paramInt, Dynamic paramDynamic) {
    updateProp("setProps", paramf, paramInt, paramDynamic);
  }
  
  @b(customType = "Style", names = {"height"})
  public void setStyle(f paramf, int paramInt, Dynamic paramDynamic) {
    updateProp("setStyle", paramf, paramInt, paramDynamic);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/henninghall/date_picker/DatePickerManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */