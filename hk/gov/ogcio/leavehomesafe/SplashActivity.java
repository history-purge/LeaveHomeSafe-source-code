package hk.gov.ogcio.leavehomesafe;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.d;

public class SplashActivity extends d {
  protected void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    startActivity(new Intent((Context)this, MainActivity.class));
    finish();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/hk/gov/ogcio/leavehomesafe/SplashActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */