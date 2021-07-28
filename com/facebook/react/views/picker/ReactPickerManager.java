package com.facebook.react.views.picker;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.c;
import com.facebook.react.uimanager.events.d;
import com.facebook.react.uimanager.k0;
import com.facebook.react.views.picker.d.a;

public abstract class ReactPickerManager extends SimpleViewManager<a> {
  protected void addEventEmitters(k0 paramk0, a parama) {
    parama.setOnSelectListener(new a(parama, ((UIManagerModule)paramk0.getNativeModule(UIManagerModule.class)).getEventDispatcher()));
  }
  
  protected void onAfterUpdateTransaction(a parama) {
    super.onAfterUpdateTransaction((View)parama);
    parama.b();
  }
  
  public void receiveCommand(a parama, String paramString, ReadableArray paramReadableArray) {
    byte b;
    if (paramString.hashCode() == -729039331 && paramString.equals("setNativeSelectedPosition")) {
      b = 0;
    } else {
      b = -1;
    } 
    if (b != 0)
      return; 
    if (paramReadableArray != null)
      parama.setImmediateSelection(paramReadableArray.getInt(0)); 
  }
  
  @com.facebook.react.uimanager.e1.a(customType = "Color", name = "color")
  public void setColor(a parama, Integer paramInteger) {
    parama.setStagedPrimaryTextColor(paramInteger);
  }
  
  @com.facebook.react.uimanager.e1.a(defaultBoolean = true, name = "enabled")
  public void setEnabled(a parama, boolean paramBoolean) {
    parama.setEnabled(paramBoolean);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "items")
  public void setItems(a parama, ReadableArray paramReadableArray) {
    parama.setStagedItems(c.a(paramReadableArray));
  }
  
  @com.facebook.react.uimanager.e1.a(name = "prompt")
  public void setPrompt(a parama, String paramString) {
    parama.setPrompt(paramString);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "selected")
  public void setSelected(a parama, int paramInt) {
    parama.setStagedSelection(paramInt);
  }
  
  private static class a implements a.c {
    private final a a;
    
    private final d b;
    
    public a(a param1a, d param1d) {
      this.a = param1a;
      this.b = param1d;
    }
    
    public void a(int param1Int) {
      this.b.a((c)new a(this.a.getId(), param1Int));
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/picker/ReactPickerManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */