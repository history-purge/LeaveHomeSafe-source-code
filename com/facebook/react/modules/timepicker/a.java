package com.facebook.react.modules.timepicker;

import android.app.TimePickerDialog;
import android.content.Context;
import android.os.Build;

public class a extends TimePickerDialog {
  public a(Context paramContext, int paramInt1, TimePickerDialog.OnTimeSetListener paramOnTimeSetListener, int paramInt2, int paramInt3, boolean paramBoolean) {
    super(paramContext, paramInt1, paramOnTimeSetListener, paramInt2, paramInt3, paramBoolean);
  }
  
  public a(Context paramContext, TimePickerDialog.OnTimeSetListener paramOnTimeSetListener, int paramInt1, int paramInt2, boolean paramBoolean) {
    super(paramContext, paramOnTimeSetListener, paramInt1, paramInt2, paramBoolean);
  }
  
  protected void onStop() {
    if (Build.VERSION.SDK_INT > 19)
      super.onStop(); 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/modules/timepicker/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */