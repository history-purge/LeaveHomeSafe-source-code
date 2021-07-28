package com.facebook.react.modules.timepicker;

import android.app.Activity;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.TimePicker;
import androidx.fragment.app.d;
import androidx.fragment.app.e;
import androidx.fragment.app.n;
import com.facebook.fbreact.specs.NativeTimePickerAndroidSpec;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableNativeMap;
import e.e.o.d0.a.a;

@a(name = "TimePickerAndroid")
public class TimePickerDialogModule extends NativeTimePickerAndroidSpec {
  static final String ACTION_DISMISSED = "dismissedAction";
  
  static final String ACTION_TIME_SET = "timeSetAction";
  
  static final String ARG_HOUR = "hour";
  
  static final String ARG_IS24HOUR = "is24Hour";
  
  static final String ARG_MINUTE = "minute";
  
  static final String ARG_MODE = "mode";
  
  private static final String ERROR_NO_ACTIVITY = "E_NO_ACTIVITY";
  
  public static final String FRAGMENT_TAG = "TimePickerAndroid";
  
  public TimePickerDialogModule(ReactApplicationContext paramReactApplicationContext) {
    super(paramReactApplicationContext);
  }
  
  private Bundle createFragmentArguments(ReadableMap paramReadableMap) {
    Bundle bundle = new Bundle();
    if (paramReadableMap.hasKey("hour") && !paramReadableMap.isNull("hour"))
      bundle.putInt("hour", paramReadableMap.getInt("hour")); 
    if (paramReadableMap.hasKey("minute") && !paramReadableMap.isNull("minute"))
      bundle.putInt("minute", paramReadableMap.getInt("minute")); 
    if (paramReadableMap.hasKey("is24Hour") && !paramReadableMap.isNull("is24Hour"))
      bundle.putBoolean("is24Hour", paramReadableMap.getBoolean("is24Hour")); 
    if (paramReadableMap.hasKey("mode") && !paramReadableMap.isNull("mode"))
      bundle.putString("mode", paramReadableMap.getString("mode")); 
    return bundle;
  }
  
  public String getName() {
    return "TimePickerAndroid";
  }
  
  public void open(ReadableMap paramReadableMap, Promise paramPromise) {
    Activity activity = getCurrentActivity();
    if (activity == null || !(activity instanceof e)) {
      paramPromise.reject("E_NO_ACTIVITY", "Tried to open a DatePicker dialog while not attached to a FragmentActivity");
      return;
    } 
    n n = ((e)activity).k();
    d d = (d)n.c("TimePickerAndroid");
    if (d != null)
      d.w0(); 
    d = new b();
    if (paramReadableMap != null)
      d.m(createFragmentArguments(paramReadableMap)); 
    a a = new a(this, paramPromise);
    d.a(a);
    d.a(a);
    d.a(n, "TimePickerAndroid");
  }
  
  private class a implements TimePickerDialog.OnTimeSetListener, DialogInterface.OnDismissListener {
    private final Promise c;
    
    private boolean d = false;
    
    public a(TimePickerDialogModule this$0, Promise param1Promise) {
      this.c = param1Promise;
    }
    
    public void onDismiss(DialogInterface param1DialogInterface) {
      if (!this.d && this.e.getReactApplicationContext().hasActiveCatalystInstance()) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("action", "dismissedAction");
        this.c.resolve(writableNativeMap);
        this.d = true;
      } 
    }
    
    public void onTimeSet(TimePicker param1TimePicker, int param1Int1, int param1Int2) {
      if (!this.d && this.e.getReactApplicationContext().hasActiveCatalystInstance()) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("action", "timeSetAction");
        writableNativeMap.putInt("hour", param1Int1);
        writableNativeMap.putInt("minute", param1Int2);
        this.c.resolve(writableNativeMap);
        this.d = true;
      } 
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/modules/timepicker/TimePickerDialogModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */