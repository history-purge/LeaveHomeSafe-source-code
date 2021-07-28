package com.facebook.react.modules.i18nmanager;

import android.content.Context;
import com.facebook.react.bridge.ContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.common.f;
import e.e.o.d0.a.a;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

@a(name = "I18nManager")
public class I18nManagerModule extends ContextBaseJavaModule {
  public static final String NAME = "I18nManager";
  
  private final a sharedI18nUtilInstance = a.a();
  
  public I18nManagerModule(Context paramContext) {
    super(paramContext);
  }
  
  @ReactMethod
  public void allowRTL(boolean paramBoolean) {
    this.sharedI18nUtilInstance.a(getContext(), paramBoolean);
  }
  
  @ReactMethod
  public void forceRTL(boolean paramBoolean) {
    this.sharedI18nUtilInstance.b(getContext(), paramBoolean);
  }
  
  public Map<String, Object> getConstants() {
    Context context = getContext();
    Locale locale = (context.getResources().getConfiguration()).locale;
    HashMap<String, Boolean> hashMap = f.b();
    hashMap.put("isRTL", Boolean.valueOf(this.sharedI18nUtilInstance.b(context)));
    hashMap.put("doLeftAndRightSwapInRTL", Boolean.valueOf(this.sharedI18nUtilInstance.a(context)));
    hashMap.put("localeIdentifier", locale.toString());
    return (Map)hashMap;
  }
  
  public String getName() {
    return "I18nManager";
  }
  
  @ReactMethod
  public void swapLeftAndRightInRTL(boolean paramBoolean) {
    this.sharedI18nUtilInstance.c(getContext(), paramBoolean);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/modules/i18nmanager/I18nManagerModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */