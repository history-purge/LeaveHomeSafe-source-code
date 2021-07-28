package com.facebook.react.modules.toast;

import android.content.Context;
import android.widget.Toast;
import com.facebook.fbreact.specs.NativeToastAndroidSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.f;
import e.e.o.d0.a.a;
import java.util.HashMap;
import java.util.Map;

@a(name = "ToastAndroid")
public class ToastModule extends NativeToastAndroidSpec {
  private static final String DURATION_LONG_KEY = "LONG";
  
  private static final String DURATION_SHORT_KEY = "SHORT";
  
  private static final String GRAVITY_BOTTOM_KEY = "BOTTOM";
  
  private static final String GRAVITY_CENTER = "CENTER";
  
  private static final String GRAVITY_TOP_KEY = "TOP";
  
  public static final String NAME = "ToastAndroid";
  
  public ToastModule(ReactApplicationContext paramReactApplicationContext) {
    super(paramReactApplicationContext);
  }
  
  public String getName() {
    return "ToastAndroid";
  }
  
  public Map<String, Object> getTypedExportedConstants() {
    HashMap<String, Integer> hashMap = f.b();
    hashMap.put("SHORT", Integer.valueOf(0));
    hashMap.put("LONG", Integer.valueOf(1));
    hashMap.put("TOP", Integer.valueOf(49));
    hashMap.put("BOTTOM", Integer.valueOf(81));
    hashMap.put("CENTER", Integer.valueOf(17));
    return (Map)hashMap;
  }
  
  public void show(String paramString, double paramDouble) {
    UiThreadUtil.runOnUiThread(new a(this, paramString, (int)paramDouble));
  }
  
  public void showWithGravity(String paramString, double paramDouble1, double paramDouble2) {
    UiThreadUtil.runOnUiThread(new b(this, paramString, (int)paramDouble1, (int)paramDouble2));
  }
  
  public void showWithGravityAndOffset(String paramString, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4) {
    UiThreadUtil.runOnUiThread(new c(this, paramString, (int)paramDouble1, (int)paramDouble2, (int)paramDouble3, (int)paramDouble4));
  }
  
  class a implements Runnable {
    a(ToastModule this$0, String param1String, int param1Int) {}
    
    public void run() {
      Toast.makeText((Context)this.e.getReactApplicationContext(), this.c, this.d).show();
    }
  }
  
  class b implements Runnable {
    b(ToastModule this$0, String param1String, int param1Int1, int param1Int2) {}
    
    public void run() {
      Toast toast = Toast.makeText((Context)this.f.getReactApplicationContext(), this.c, this.d);
      toast.setGravity(this.e, 0, 0);
      toast.show();
    }
  }
  
  class c implements Runnable {
    c(ToastModule this$0, String param1String, int param1Int1, int param1Int2, int param1Int3, int param1Int4) {}
    
    public void run() {
      Toast toast = Toast.makeText((Context)this.h.getReactApplicationContext(), this.c, this.d);
      toast.setGravity(this.e, this.f, this.g);
      toast.show();
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/modules/toast/ToastModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */