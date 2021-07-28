package io.invertase.firebase.messaging;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.google.firebase.messaging.j0;
import io.invertase.firebase.common.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class r implements p {
  private String a(String paramString1, String paramString2) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramString1);
    stringBuilder.append(",");
    return paramString2.replace(stringBuilder.toString(), "");
  }
  
  private List<String> c(String paramString) {
    return new ArrayList<String>(Arrays.asList(paramString.split(",")));
  }
  
  public void a(j0 paramj0) {
    try {
      String str2 = m.a((ReadableMap)o.a(paramj0)).toString();
      l l = l.b();
      l.b(paramj0.e(), str2);
      str2 = l.a("all_notification_ids", "");
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(str2);
      stringBuilder.append(paramj0.e());
      stringBuilder.append(",");
      str2 = stringBuilder.toString();
      List<String> list = c(str2);
      String str1 = str2;
      if (list.size() > 100) {
        str1 = list.get(0);
        l.a(str1);
        str1 = a(str1, str2);
      } 
      l.b("all_notification_ids", str1);
      return;
    } catch (JSONException jSONException) {
      jSONException.printStackTrace();
      return;
    } 
  }
  
  public void a(String paramString) {
    l l = l.b();
    l.a(paramString);
    String str = l.a("all_notification_ids", "");
    if (!str.isEmpty())
      l.b("all_notification_ids", a(paramString, str)); 
  }
  
  public j0 b(String paramString) {
    String str = l.b().a(paramString, null);
    if (str != null)
      try {
        WritableMap writableMap = m.a(new JSONObject(str));
        writableMap.putString("to", paramString);
        return o.a((ReadableMap)writableMap);
      } catch (JSONException jSONException) {
        jSONException.printStackTrace();
      }  
    return null;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/io/invertase/firebase/messaging/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */