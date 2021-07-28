package com.facebook.react.devsupport;

import android.os.Bundle;
import android.preference.PreferenceActivity;
import e.e.o.j;
import e.e.o.l;

public class DevSettingsActivity extends PreferenceActivity {
  public void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    setTitle(getApplication().getResources().getString(j.catalyst_settings_title));
    addPreferencesFromResource(l.rn_dev_preferences);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/devsupport/DevSettingsActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */