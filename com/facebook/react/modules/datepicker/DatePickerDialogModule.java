package com.facebook.react.modules.datepicker;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.DatePicker;
import androidx.fragment.app.d;
import androidx.fragment.app.e;
import androidx.fragment.app.n;
import com.facebook.fbreact.specs.NativeDatePickerAndroidSpec;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableNativeMap;
import e.e.o.d0.a.a;

@a(name = "DatePickerAndroid")
public class DatePickerDialogModule extends NativeDatePickerAndroidSpec {
  static final String ACTION_DATE_SET = "dateSetAction";
  
  static final String ACTION_DISMISSED = "dismissedAction";
  
  static final String ARG_DATE = "date";
  
  static final String ARG_MAXDATE = "maxDate";
  
  static final String ARG_MINDATE = "minDate";
  
  static final String ARG_MODE = "mode";
  
  private static final String ERROR_NO_ACTIVITY = "E_NO_ACTIVITY";
  
  public static final String FRAGMENT_TAG = "DatePickerAndroid";
  
  public DatePickerDialogModule(ReactApplicationContext paramReactApplicationContext) {
    super(paramReactApplicationContext);
  }
  
  private Bundle createFragmentArguments(ReadableMap paramReadableMap) {
    Bundle bundle = new Bundle();
    if (paramReadableMap.hasKey("date") && !paramReadableMap.isNull("date"))
      bundle.putLong("date", (long)paramReadableMap.getDouble("date")); 
    if (paramReadableMap.hasKey("minDate") && !paramReadableMap.isNull("minDate"))
      bundle.putLong("minDate", (long)paramReadableMap.getDouble("minDate")); 
    if (paramReadableMap.hasKey("maxDate") && !paramReadableMap.isNull("maxDate"))
      bundle.putLong("maxDate", (long)paramReadableMap.getDouble("maxDate")); 
    if (paramReadableMap.hasKey("mode") && !paramReadableMap.isNull("mode"))
      bundle.putString("mode", paramReadableMap.getString("mode")); 
    return bundle;
  }
  
  public String getName() {
    return "DatePickerAndroid";
  }
  
  public void open(ReadableMap paramReadableMap, Promise paramPromise) {
    Activity activity = getCurrentActivity();
    if (activity == null || !(activity instanceof e)) {
      paramPromise.reject("E_NO_ACTIVITY", "Tried to open a DatePicker dialog while not attached to a FragmentActivity");
      return;
    } 
    n n = ((e)activity).k();
    d d = (d)n.c("DatePickerAndroid");
    if (d != null)
      d.w0(); 
    d = new a();
    if (paramReadableMap != null)
      d.m(createFragmentArguments(paramReadableMap)); 
    a a = new a(this, paramPromise);
    d.a(a);
    d.a(a);
    d.a(n, "DatePickerAndroid");
  }
  
  private class a implements DatePickerDialog.OnDateSetListener, DialogInterface.OnDismissListener {
    private final Promise c;
    
    private boolean d = false;
    
    public a(DatePickerDialogModule this$0, Promise param1Promise) {
      this.c = param1Promise;
    }
    
    public void onDateSet(DatePicker param1DatePicker, int param1Int1, int param1Int2, int param1Int3) {
      if (!this.d && this.e.getReactApplicationContext().hasActiveCatalystInstance()) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("action", "dateSetAction");
        writableNativeMap.putInt("year", param1Int1);
        writableNativeMap.putInt("month", param1Int2);
        writableNativeMap.putInt("day", param1Int3);
        this.c.resolve(writableNativeMap);
        this.d = true;
      } 
    }
    
    public void onDismiss(DialogInterface param1DialogInterface) {
      if (!this.d && this.e.getReactApplicationContext().hasActiveCatalystInstance()) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("action", "dismissedAction");
        this.c.resolve(writableNativeMap);
        this.d = true;
      } 
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/modules/datepicker/DatePickerDialogModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */