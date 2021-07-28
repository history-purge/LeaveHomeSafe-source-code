package com.facebook.react.uimanager.i1;

import android.view.View;
import e.e.o.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class a {
  private static final List<b> a = new ArrayList<b>();
  
  private static final Map<a, Set<String>> b = new HashMap<a, Set<String>>();
  
  private static String a(View paramView) {
    Object object = paramView.getTag(h.view_tag_native_id);
    return (object instanceof String) ? (String)object : null;
  }
  
  public static void b(View paramView) {
    String str = a(paramView);
    if (str == null)
      return; 
    null = a.iterator();
    while (null.hasNext()) {
      b b = null.next();
      if (str != null && str.equals(b.a())) {
        b.a(paramView);
        null.remove();
      } 
    } 
    for (Map.Entry<a, Set<String>> entry : b.entrySet()) {
      Set set = (Set)entry.getValue();
      if (set != null && set.contains(str))
        ((a)entry.getKey()).a(paramView, str); 
    } 
  }
  
  public static interface a {
    void a(View param1View, String param1String);
  }
  
  public static interface b {
    String a();
    
    void a(View param1View);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/uimanager/i1/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */