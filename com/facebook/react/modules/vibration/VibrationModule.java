package com.facebook.react.modules.vibration;

import android.annotation.SuppressLint;
import android.os.Vibrator;
import com.facebook.fbreact.specs.NativeVibrationSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import e.e.o.d0.a.a;

@a(name = "Vibration")
@SuppressLint({"MissingPermission"})
public class VibrationModule extends NativeVibrationSpec {
  public static final String NAME = "Vibration";
  
  public VibrationModule(ReactApplicationContext paramReactApplicationContext) {
    super(paramReactApplicationContext);
  }
  
  public void cancel() {
    Vibrator vibrator = (Vibrator)getReactApplicationContext().getSystemService("vibrator");
    if (vibrator != null)
      vibrator.cancel(); 
  }
  
  public String getName() {
    return "Vibration";
  }
  
  public void vibrate(double paramDouble) {
    int i = (int)paramDouble;
    Vibrator vibrator = (Vibrator)getReactApplicationContext().getSystemService("vibrator");
    if (vibrator != null)
      vibrator.vibrate(i); 
  }
  
  public void vibrateByPattern(ReadableArray paramReadableArray, double paramDouble) {
    int i = (int)paramDouble;
    Vibrator vibrator = (Vibrator)getReactApplicationContext().getSystemService("vibrator");
    if (vibrator != null) {
      long[] arrayOfLong = new long[paramReadableArray.size()];
      int j;
      for (j = 0; j < paramReadableArray.size(); j++)
        arrayOfLong[j] = paramReadableArray.getInt(j); 
      vibrator.vibrate(arrayOfLong, i);
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/modules/vibration/VibrationModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */