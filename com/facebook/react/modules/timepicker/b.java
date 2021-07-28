package com.facebook.react.modules.timepicker;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.text.format.DateFormat;
import androidx.fragment.app.d;
import java.util.Calendar;
import java.util.Locale;

public class b extends d {
  private TimePickerDialog.OnTimeSetListener r0;
  
  private DialogInterface.OnDismissListener s0;
  
  static Dialog a(Bundle paramBundle, Context paramContext, TimePickerDialog.OnTimeSetListener paramOnTimeSetListener) {
    Calendar calendar = Calendar.getInstance();
    int i = calendar.get(11);
    int j = calendar.get(12);
    boolean bool = DateFormat.is24HourFormat(paramContext);
    c c2 = c.e;
    c c1 = c2;
    if (paramBundle != null) {
      c1 = c2;
      if (paramBundle.getString("mode", null) != null)
        c1 = c.valueOf(paramBundle.getString("mode").toUpperCase(Locale.US)); 
    } 
    if (paramBundle != null) {
      i = paramBundle.getInt("hour", calendar.get(11));
      j = paramBundle.getInt("minute", calendar.get(12));
      bool = paramBundle.getBoolean("is24Hour", DateFormat.is24HourFormat(paramContext));
    } 
    if (Build.VERSION.SDK_INT >= 21) {
      if (c1 == c.c)
        return (Dialog)new a(paramContext, paramContext.getResources().getIdentifier("ClockTimePickerDialog", "style", paramContext.getPackageName()), paramOnTimeSetListener, i, j, bool); 
      if (c1 == c.d)
        return (Dialog)new a(paramContext, paramContext.getResources().getIdentifier("SpinnerTimePickerDialog", "style", paramContext.getPackageName()), paramOnTimeSetListener, i, j, bool); 
    } 
    return (Dialog)new a(paramContext, paramOnTimeSetListener, i, j, bool);
  }
  
  public void a(TimePickerDialog.OnTimeSetListener paramOnTimeSetListener) {
    this.r0 = paramOnTimeSetListener;
  }
  
  public void a(DialogInterface.OnDismissListener paramOnDismissListener) {
    this.s0 = paramOnDismissListener;
  }
  
  public Dialog n(Bundle paramBundle) {
    return a(m(), (Context)h(), this.r0);
  }
  
  public void onDismiss(DialogInterface paramDialogInterface) {
    super.onDismiss(paramDialogInterface);
    DialogInterface.OnDismissListener onDismissListener = this.s0;
    if (onDismissListener != null)
      onDismissListener.onDismiss(paramDialogInterface); 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/modules/timepicker/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */