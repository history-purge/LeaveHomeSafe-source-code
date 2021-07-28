package com.facebook.react.views.checkbox;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.TypedValue;
import android.view.View;
import android.widget.CompoundButton;
import androidx.appcompat.widget.u0;
import androidx.core.widget.c;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.k0;

public class ReactCheckBoxManager extends SimpleViewManager<a> {
  private static final CompoundButton.OnCheckedChangeListener ON_CHECKED_CHANGE_LISTENER = new a();
  
  public static final String REACT_CLASS = "AndroidCheckBox";
  
  private static int getIdentifier(Context paramContext, String paramString) {
    return paramContext.getResources().getIdentifier(paramString, "attr", paramContext.getPackageName());
  }
  
  private static int getThemeColor(Context paramContext, String paramString) {
    TypedValue typedValue = new TypedValue();
    paramContext.getTheme().resolveAttribute(getIdentifier(paramContext, paramString), typedValue, true);
    return typedValue.data;
  }
  
  protected void addEventEmitters(k0 paramk0, a parama) {
    parama.setOnCheckedChangeListener(ON_CHECKED_CHANGE_LISTENER);
  }
  
  protected a createViewInstance(k0 paramk0) {
    return new a((Context)paramk0);
  }
  
  public String getName() {
    return "AndroidCheckBox";
  }
  
  public void receiveCommand(a parama, String paramString, ReadableArray paramReadableArray) {
    byte b;
    if (paramString.hashCode() == -669744680 && paramString.equals("setNativeValue")) {
      b = 0;
    } else {
      b = -1;
    } 
    if (b != 0)
      return; 
    if (paramReadableArray != null)
      setOn(parama, paramReadableArray.getBoolean(0)); 
  }
  
  @com.facebook.react.uimanager.e1.a(defaultBoolean = true, name = "enabled")
  public void setEnabled(a parama, boolean paramBoolean) {
    parama.setEnabled(paramBoolean);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "on")
  public void setOn(a parama, boolean paramBoolean) {
    parama.setOnCheckedChangeListener(null);
    parama.a(paramBoolean);
    parama.setOnCheckedChangeListener(ON_CHECKED_CHANGE_LISTENER);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "tintColors")
  public void setTintColors(a parama, ReadableMap paramReadableMap) {
    int i;
    int j;
    if (paramReadableMap == null || !paramReadableMap.hasKey("true")) {
      i = getThemeColor(parama.getContext(), "colorAccent");
    } else {
      i = paramReadableMap.getInt("true");
    } 
    if (paramReadableMap == null || !paramReadableMap.hasKey("false")) {
      j = getThemeColor(parama.getContext(), "colorPrimaryDark");
    } else {
      j = paramReadableMap.getInt("false");
    } 
    int[] arrayOfInt = { -16842912 };
    c.a((CompoundButton)parama, new ColorStateList(new int[][] { { 16842912 }, , arrayOfInt }, new int[] { i, j }));
  }
  
  static final class a implements CompoundButton.OnCheckedChangeListener {
    private ReactContext a(CompoundButton param1CompoundButton) {
      Context context1;
      Context context2 = param1CompoundButton.getContext();
      if (context2 instanceof u0) {
        context1 = ((u0)context2).getBaseContext();
      } else {
        context1 = context1.getContext();
      } 
      return (ReactContext)context1;
    }
    
    public void onCheckedChanged(CompoundButton param1CompoundButton, boolean param1Boolean) {
      ((UIManagerModule)a(param1CompoundButton).getNativeModule(UIManagerModule.class)).getEventDispatcher().a(new b(param1CompoundButton.getId(), param1Boolean));
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/checkbox/ReactCheckBoxManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */