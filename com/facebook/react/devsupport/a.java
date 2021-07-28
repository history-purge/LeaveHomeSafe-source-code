package com.facebook.react.devsupport;

import android.content.Context;
import com.facebook.react.devsupport.h.a;
import com.facebook.react.devsupport.h.c;
import java.util.Map;

public class a {
  public static c a(Context paramContext, e parame, String paramString, boolean paramBoolean, f paramf, a parama, int paramInt, Map<String, Object> paramMap) {
    if (!paramBoolean)
      return new b(); 
    try {
      StringBuilder stringBuilder = new StringBuilder("com.facebook.react.devsupport");
      stringBuilder.append(".");
      stringBuilder.append("DevSupportManagerImpl");
      return Class.forName(stringBuilder.toString()).getConstructor(new Class[] { Context.class, e.class, String.class, boolean.class, f.class, a.class, int.class, Map.class }).newInstance(new Object[] { paramContext, parame, paramString, Boolean.valueOf(true), paramf, parama, Integer.valueOf(paramInt), paramMap });
    } catch (Exception exception) {
      throw new RuntimeException("Requested enabled DevSupportManager, but DevSupportManagerImpl class was not found or could not be created", exception);
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/devsupport/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */