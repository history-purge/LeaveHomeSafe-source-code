package com.facebook.react.views.picker;

import android.content.Context;
import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.b;
import com.facebook.react.uimanager.e1.a;
import com.facebook.react.uimanager.k0;
import com.facebook.react.uimanager.y0;
import e.e.o.d0.a.a;
import e.e.o.h0.e;
import e.e.o.h0.f;

@a(name = "AndroidDropdownPicker")
public class ReactDropdownPickerManager extends ReactPickerManager implements f<a> {
  public static final String REACT_CLASS = "AndroidDropdownPicker";
  
  private final y0<a> mDelegate = (y0<a>)new e((b)this);
  
  protected a createViewInstance(k0 paramk0) {
    return new a((Context)paramk0, 1);
  }
  
  protected y0<a> getDelegate() {
    return this.mDelegate;
  }
  
  public String getName() {
    return "AndroidDropdownPicker";
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/picker/ReactDropdownPickerManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */