package com.learnium.RNDeviceInfo.d;

import android.app.UiModeManager;
import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.learnium.RNDeviceInfo.a;

public class b {
  private final Context a;
  
  public b(Context paramContext) {
    this.a = paramContext;
  }
  
  private a c() {
    WindowManager windowManager = (WindowManager)this.a.getSystemService("window");
    if (windowManager == null)
      return a.f; 
    DisplayMetrics displayMetrics = new DisplayMetrics();
    int i = Build.VERSION.SDK_INT;
    Display display = windowManager.getDefaultDisplay();
    if (i >= 17) {
      display.getRealMetrics(displayMetrics);
    } else {
      display.getMetrics(displayMetrics);
    } 
    double d1 = displayMetrics.widthPixels;
    double d2 = displayMetrics.xdpi;
    Double.isNaN(d1);
    Double.isNaN(d2);
    d1 /= d2;
    d2 = displayMetrics.heightPixels;
    double d3 = displayMetrics.ydpi;
    Double.isNaN(d2);
    Double.isNaN(d3);
    d2 /= d3;
    d1 = Math.sqrt(Math.pow(d1, 2.0D) + Math.pow(d2, 2.0D));
    return (d1 >= 3.0D && d1 <= 6.9D) ? a.c : ((d1 > 6.9D && d1 <= 18.0D) ? a.d : a.f);
  }
  
  private a d() {
    int i = (this.a.getResources().getConfiguration()).smallestScreenWidthDp;
    return (i == 0) ? a.f : ((i >= 600) ? a.d : a.c);
  }
  
  public a a() {
    if (this.a.getPackageManager().hasSystemFeature("amazon.hardware.fire_tv"))
      return a.e; 
    UiModeManager uiModeManager = (UiModeManager)this.a.getSystemService("uimode");
    if (uiModeManager != null && uiModeManager.getCurrentModeType() == 4)
      return a.e; 
    a a = d();
    return (a != null && a != a.f) ? a : c();
  }
  
  public boolean b() {
    return (a() == a.d);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/learnium/RNDeviceInfo/d/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */