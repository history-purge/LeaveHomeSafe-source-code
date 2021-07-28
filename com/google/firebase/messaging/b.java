package com.google.firebase.messaging;

import android.os.Bundle;
import java.util.concurrent.TimeUnit;

public final class b {
  public static final long a = TimeUnit.MINUTES.toMillis(3L);
  
  public static final class a {
    public static b.d.a<String, String> a(Bundle param1Bundle) {
      b.d.a<String, String> a1 = new b.d.a();
      for (String str : param1Bundle.keySet()) {
        Object object = param1Bundle.get(str);
        if (object instanceof String) {
          object = object;
          if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key"))
            a1.put(str, object); 
        } 
      } 
      return a1;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/firebase/messaging/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */