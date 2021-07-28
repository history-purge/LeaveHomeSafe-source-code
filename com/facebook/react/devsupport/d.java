package com.facebook.react.devsupport;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import e.e.o.k;

public class d extends Dialog {
  public d(Activity paramActivity, View paramView) {
    super((Context)paramActivity, k.Theme_Catalyst_LogBox);
    requestWindowFeature(1);
    setContentView(paramView);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/devsupport/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */