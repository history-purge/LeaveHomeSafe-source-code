package com.facebook.react.views.picker;

import android.content.Context;
import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.b;
import com.facebook.react.uimanager.e1.a;
import com.facebook.react.uimanager.k0;
import com.facebook.react.uimanager.y0;
import e.e.o.d0.a.a;
import e.e.o.h0.a;
import e.e.o.h0.b;

@a(name = "AndroidDialogPicker")
public class ReactDialogPickerManager extends ReactPickerManager implements b<a> {
  public static final String REACT_CLASS = "AndroidDialogPicker";
  
  private final y0<a> mDelegate = (y0<a>)new a((b)this);
  
  protected a createViewInstance(k0 paramk0) {
    return new a((Context)paramk0, 0);
  }
  
  protected y0<a> getDelegate() {
    return this.mDelegate;
  }
  
  public String getName() {
    return "AndroidDialogPicker";
  }
  
  public void setBackgroundColor(a parama, Integer paramInteger) {
    parama.setStagedBackgroundColor(paramInteger);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/picker/ReactDialogPickerManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */