package com.facebook.react.devsupport;

import android.os.Handler;
import android.view.View;

public class c {
  private boolean a = false;
  
  public boolean a(int paramInt, View paramView) {
    if (paramInt == 46 && !(paramView instanceof android.widget.EditText)) {
      if (this.a) {
        this.a = false;
        return true;
      } 
      this.a = true;
      (new Handler()).postDelayed(new a(this), 200L);
    } 
    return false;
  }
  
  class a implements Runnable {
    a(c this$0) {}
    
    public void run() {
      c.a(this.c, false);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/devsupport/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */