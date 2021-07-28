package com.facebook.react.modules.datepicker;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.widget.DatePicker;
import androidx.fragment.app.d;
import java.util.Calendar;
import java.util.Locale;

@SuppressLint({"ValidFragment"})
public class a extends d {
  private DatePickerDialog.OnDateSetListener r0;
  
  private DialogInterface.OnDismissListener s0;
  
  static Dialog a(Bundle paramBundle, Context paramContext, DatePickerDialog.OnDateSetListener paramOnDateSetListener) {
    c c;
    long l;
    Calendar calendar = Calendar.getInstance();
    if (paramBundle != null && paramBundle.containsKey("date"))
      calendar.setTimeInMillis(paramBundle.getLong("date")); 
    int i = calendar.get(1);
    int j = calendar.get(2);
    int k = calendar.get(5);
    b b2 = b.e;
    b b1 = b2;
    if (paramBundle != null) {
      b1 = b2;
      if (paramBundle.getString("mode", null) != null)
        b1 = b.valueOf(paramBundle.getString("mode").toUpperCase(Locale.US)); 
    } 
    if (Build.VERSION.SDK_INT >= 21) {
      int m = a.a[b1.ordinal()];
      if (m != 1) {
        if (m != 2) {
          if (m != 3) {
            paramContext = null;
          } else {
            c = new c(paramContext, paramOnDateSetListener, i, j, k);
          } 
        } else {
          c = new c((Context)c, 16973939, paramOnDateSetListener, i, j, k);
          c.getWindow().setBackgroundDrawable((Drawable)new ColorDrawable(0));
        } 
      } else {
        c = new c((Context)c, c.getResources().getIdentifier("CalendarDatePickerDialog", "style", c.getPackageName()), paramOnDateSetListener, i, j, k);
      } 
    } else {
      c = new c((Context)c, paramOnDateSetListener, i, j, k);
      i = a.a[b1.ordinal()];
      if (i != 1) {
        if (i == 2)
          c.getDatePicker().setCalendarViewShown(false); 
      } else {
        c.getDatePicker().setCalendarViewShown(true);
        c.getDatePicker().setSpinnersShown(false);
      } 
    } 
    DatePicker datePicker = c.getDatePicker();
    if (paramBundle != null && paramBundle.containsKey("minDate")) {
      calendar.setTimeInMillis(paramBundle.getLong("minDate"));
      calendar.set(11, 0);
      calendar.set(12, 0);
      calendar.set(13, 0);
      calendar.set(14, 0);
      l = calendar.getTimeInMillis();
    } else {
      l = -2208988800001L;
    } 
    datePicker.setMinDate(l);
    if (paramBundle != null && paramBundle.containsKey("maxDate")) {
      calendar.setTimeInMillis(paramBundle.getLong("maxDate"));
      calendar.set(11, 23);
      calendar.set(12, 59);
      calendar.set(13, 59);
      calendar.set(14, 999);
      datePicker.setMaxDate(calendar.getTimeInMillis());
    } 
    return (Dialog)c;
  }
  
  void a(DatePickerDialog.OnDateSetListener paramOnDateSetListener) {
    this.r0 = paramOnDateSetListener;
  }
  
  void a(DialogInterface.OnDismissListener paramOnDismissListener) {
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


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/modules/datepicker/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */