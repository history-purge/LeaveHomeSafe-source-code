package com.facebook.react.modules.datepicker;

import android.app.DatePickerDialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.DatePicker;
import java.lang.reflect.Field;

public class c extends DatePickerDialog {
  public c(Context paramContext, int paramInt1, DatePickerDialog.OnDateSetListener paramOnDateSetListener, int paramInt2, int paramInt3, int paramInt4) {
    super(paramContext, paramInt1, paramOnDateSetListener, paramInt2, paramInt3, paramInt4);
    a(paramContext, paramInt2, paramInt3, paramInt4);
  }
  
  public c(Context paramContext, DatePickerDialog.OnDateSetListener paramOnDateSetListener, int paramInt1, int paramInt2, int paramInt3) {
    super(paramContext, paramOnDateSetListener, paramInt1, paramInt2, paramInt3);
    a(paramContext, paramInt1, paramInt2, paramInt3);
  }
  
  private static Field a(Class paramClass1, Class<?> paramClass2, String paramString) {
    try {
      Field field = paramClass1.getDeclaredField(paramString);
      field.setAccessible(true);
      return field;
    } catch (NoSuchFieldException noSuchFieldException) {
      for (Field field : paramClass1.getDeclaredFields()) {
        if (field.getType() == paramClass2) {
          field.setAccessible(true);
          return field;
        } 
      } 
      return null;
    } 
  }
  
  private void a(Context paramContext, int paramInt1, int paramInt2, int paramInt3) {
    if (Build.VERSION.SDK_INT == 24)
      try {
        Class<?> clazz = Class.forName("com.android.internal.R$styleable");
        TypedArray typedArray = paramContext.obtainStyledAttributes(null, (int[])clazz.getField("DatePicker").get(null), 16843612, 0);
        int i = typedArray.getInt(clazz.getField("DatePicker_datePickerMode").getInt(null), 2);
        typedArray.recycle();
        if (i == 2) {
          DatePicker datePicker = (DatePicker)a(DatePickerDialog.class, DatePicker.class, "mDatePicker").get(this);
          Field field = a(DatePicker.class, Class.forName("android.widget.DatePickerSpinnerDelegate"), "mDelegate");
          Object object = field.get(datePicker);
          Class<?> clazz1 = Class.forName("android.widget.DatePickerSpinnerDelegate");
          if (object.getClass() != clazz1) {
            field.set(datePicker, null);
            datePicker.removeAllViews();
            object = DatePicker.class.getDeclaredMethod("createSpinnerUIDelegate", new Class[] { Context.class, AttributeSet.class, int.class, int.class });
            object.setAccessible(true);
            field.set(datePicker, object.invoke(datePicker, new Object[] { paramContext, null, Integer.valueOf(16843612), Integer.valueOf(0) }));
            datePicker.setCalendarViewShown(false);
            datePicker.init(paramInt1, paramInt2, paramInt3, (DatePicker.OnDateChangedListener)this);
            return;
          } 
        } 
      } catch (Exception exception) {
        throw new RuntimeException(exception);
      }  
  }
  
  protected void onStop() {
    if (Build.VERSION.SDK_INT > 19)
      super.onStop(); 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/modules/datepicker/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */