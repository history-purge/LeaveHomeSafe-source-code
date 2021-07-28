package com.facebook.react.modules.i18nmanager;

import android.content.Context;
import android.content.SharedPreferences;
import b.g.l.f;
import java.util.Locale;

public class a {
  private static a a;
  
  public static a a() {
    if (a == null)
      a = new a(); 
    return a;
  }
  
  private boolean a(Context paramContext, String paramString, boolean paramBoolean) {
    return paramContext.getSharedPreferences("com.facebook.react.modules.i18nmanager.I18nUtil", 0).getBoolean(paramString, paramBoolean);
  }
  
  private void b(Context paramContext, String paramString, boolean paramBoolean) {
    SharedPreferences.Editor editor = paramContext.getSharedPreferences("com.facebook.react.modules.i18nmanager.I18nUtil", 0).edit();
    editor.putBoolean(paramString, paramBoolean);
    editor.apply();
  }
  
  private boolean b() {
    return (f.b(Locale.getDefault()) == 1);
  }
  
  private boolean c(Context paramContext) {
    return a(paramContext, "RCTI18nUtil_allowRTL", true);
  }
  
  private boolean d(Context paramContext) {
    return a(paramContext, "RCTI18nUtil_forceRTL", false);
  }
  
  public void a(Context paramContext, boolean paramBoolean) {
    b(paramContext, "RCTI18nUtil_allowRTL", paramBoolean);
  }
  
  public boolean a(Context paramContext) {
    return a(paramContext, "RCTI18nUtil_makeRTLFlipLeftAndRightStyles", true);
  }
  
  public void b(Context paramContext, boolean paramBoolean) {
    b(paramContext, "RCTI18nUtil_forceRTL", paramBoolean);
  }
  
  public boolean b(Context paramContext) {
    return d(paramContext) ? true : ((c(paramContext) && b()));
  }
  
  public void c(Context paramContext, boolean paramBoolean) {
    b(paramContext, "RCTI18nUtil_makeRTLFlipLeftAndRightStyles", paramBoolean);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/modules/i18nmanager/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */