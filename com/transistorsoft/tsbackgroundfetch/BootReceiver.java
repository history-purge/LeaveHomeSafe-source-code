package com.transistorsoft.tsbackgroundfetch;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class BootReceiver extends BroadcastReceiver {
  public void onReceive(Context paramContext, Intent paramIntent) {
    String str = paramIntent.getAction();
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("BootReceiver: ");
    stringBuilder.append(str);
    Log.d("TSBackgroundFetch", stringBuilder.toString());
    b.e().execute(new a(this, paramContext));
  }
  
  class a implements Runnable {
    a(BootReceiver this$0, Context param1Context) {}
    
    public void run() {
      b.a(this.c.getApplicationContext()).c();
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/transistorsoft/tsbackgroundfetch/BootReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */