package e.b.a.a;

import android.os.Bundle;

public class d {
  private final Bundle a;
  
  public d(Bundle paramBundle) {
    this.a = paramBundle;
  }
  
  public long a() {
    return this.a.getLong("install_begin_timestamp_seconds");
  }
  
  public String b() {
    return this.a.getString("install_referrer");
  }
  
  public long c() {
    return this.a.getLong("referrer_click_timestamp_seconds");
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/b/a/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */