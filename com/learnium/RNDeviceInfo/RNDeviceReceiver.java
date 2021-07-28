package com.learnium.RNDeviceInfo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

public class RNDeviceReceiver extends BroadcastReceiver {
  public void onReceive(Context paramContext, Intent paramIntent) {
    if ("com.android.vending.INSTALL_REFERRER".equals(paramIntent.getAction())) {
      SharedPreferences.Editor editor = paramContext.getSharedPreferences("react-native-device-info", 0).edit();
      editor.putString("installReferrer", paramIntent.getStringExtra("referrer"));
      editor.apply();
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/learnium/RNDeviceInfo/RNDeviceReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */