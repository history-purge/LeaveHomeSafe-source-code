package com.facebook.react.views.unimplementedview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.z;

public class a extends LinearLayout {
  private z c;
  
  public a(Context paramContext) {
    super(paramContext);
    this.c = new z(paramContext);
    this.c.setLayoutParams((ViewGroup.LayoutParams)new LinearLayout.LayoutParams(-2, -1));
    this.c.setGravity(17);
    this.c.setTextColor(-1);
    setBackgroundColor(1442775040);
    setGravity(1);
    setOrientation(1);
    addView((View)this.c);
  }
  
  public void setName(String paramString) {
    z z1 = this.c;
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("'");
    stringBuilder.append(paramString);
    stringBuilder.append("' is not Fabric compatible yet.");
    z1.setText(stringBuilder.toString());
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/unimplementedview/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */