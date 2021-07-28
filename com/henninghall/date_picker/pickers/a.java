package com.henninghall.date_picker.pickers;

import android.graphics.Paint;
import android.view.View;

public interface a {
  void a(int paramInt);
  
  void a(int paramInt, boolean paramBoolean);
  
  boolean a();
  
  int getMaxValue();
  
  int getValue();
  
  View getView();
  
  boolean getWrapSelectorWheel();
  
  void setDisplayedValues(String[] paramArrayOfString);
  
  void setDividerHeight(int paramInt);
  
  void setItemPaddingHorizontal(int paramInt);
  
  void setMaxValue(int paramInt);
  
  void setMinValue(int paramInt);
  
  void setNormalTextColor(int paramInt);
  
  void setOnValueChangeListenerInScrolling(b paramb);
  
  void setOnValueChangedListener(a parama);
  
  void setSelectedTextColor(int paramInt);
  
  void setShownCount(int paramInt);
  
  void setTextAlign(Paint.Align paramAlign);
  
  void setValue(int paramInt);
  
  void setVisibility(int paramInt);
  
  void setWrapSelectorWheel(boolean paramBoolean);
  
  public static interface a {
    void a();
  }
  
  public static interface b {
    void a(a param1a, int param1Int1, int param1Int2);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/henninghall/date_picker/pickers/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */