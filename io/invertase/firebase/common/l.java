package io.invertase.firebase.common;

import android.content.SharedPreferences;
import io.invertase.firebase.app.a;

public class l {
  private static l b = new l();
  
  private SharedPreferences a;
  
  private SharedPreferences a() {
    if (this.a == null)
      this.a = a.a().getSharedPreferences("io.invertase.firebase", 0); 
    return this.a;
  }
  
  public static l b() {
    return b;
  }
  
  public SharedPreferences.Editor a(String paramString) {
    return a().edit().remove(paramString);
  }
  
  public String a(String paramString1, String paramString2) {
    return a().getString(paramString1, paramString2);
  }
  
  public void b(String paramString1, String paramString2) {
    a().edit().putString(paramString1, paramString2).apply();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/io/invertase/firebase/common/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */