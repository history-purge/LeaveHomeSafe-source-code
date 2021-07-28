package io.invertase.firebase.common;

import android.content.SharedPreferences;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import io.invertase.firebase.app.a;
import java.util.Map;

public class j {
  private static j b = new j();
  
  private SharedPreferences a;
  
  private SharedPreferences c() {
    if (this.a == null)
      this.a = a.a().getSharedPreferences("io.invertase.firebase", 0); 
    return this.a;
  }
  
  public static j d() {
    return b;
  }
  
  public void a() {
    c().edit().clear().apply();
  }
  
  public void a(String paramString1, String paramString2) {
    c().edit().putString(paramString1, paramString2).apply();
  }
  
  public void a(String paramString, boolean paramBoolean) {
    c().edit().putBoolean(paramString, paramBoolean).apply();
  }
  
  public WritableMap b() {
    WritableMap writableMap = Arguments.createMap();
    for (Map.Entry entry : c().getAll().entrySet())
      k.a((String)entry.getKey(), entry.getValue(), writableMap); 
    return writableMap;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/io/invertase/firebase/common/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */