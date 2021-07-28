package io.invertase.firebase.common;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class h {
  private static h b = new h();
  
  private JSONObject a;
  
  private h() {
    try {
      this.a = new JSONObject("{\"messaging_ios_auto_register_for_remote_messages\":false}");
      return;
    } catch (JSONException jSONException) {
      return;
    } 
  }
  
  public static h c() {
    return b;
  }
  
  public long a(String paramString, long paramLong) {
    JSONObject jSONObject = this.a;
    return (jSONObject == null) ? paramLong : jSONObject.optLong(paramString, paramLong);
  }
  
  public WritableMap a() {
    WritableMap writableMap = Arguments.createMap();
    JSONArray jSONArray = this.a.names();
    int i = 0;
    while (true) {
      if (i < jSONArray.length()) {
        try {
          String str = jSONArray.getString(i);
          k.a(str, this.a.get(str), writableMap);
        } catch (JSONException jSONException) {}
        i++;
        continue;
      } 
      return writableMap;
    } 
  }
  
  public String b() {
    return "{\"messaging_ios_auto_register_for_remote_messages\":false}";
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/io/invertase/firebase/common/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */