package com.facebook.react.views.image;

import android.graphics.Shader;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import e.e.j.e.r;

public class d {
  public static Shader.TileMode a() {
    return Shader.TileMode.CLAMP;
  }
  
  public static r.b a(String paramString) {
    if ("contain".equals(paramString))
      return r.b.b; 
    if ("cover".equals(paramString))
      return r.b.e; 
    if ("stretch".equals(paramString))
      return r.b.a; 
    if ("center".equals(paramString))
      return r.b.d; 
    if ("repeat".equals(paramString))
      return h.g; 
    if (paramString == null)
      return b(); 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Invalid resize mode: '");
    stringBuilder.append(paramString);
    stringBuilder.append("'");
    throw new JSApplicationIllegalArgumentException(stringBuilder.toString());
  }
  
  public static Shader.TileMode b(String paramString) {
    if ("contain".equals(paramString) || "cover".equals(paramString) || "stretch".equals(paramString) || "center".equals(paramString))
      return Shader.TileMode.CLAMP; 
    if ("repeat".equals(paramString))
      return Shader.TileMode.REPEAT; 
    if (paramString == null)
      return a(); 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Invalid resize mode: '");
    stringBuilder.append(paramString);
    stringBuilder.append("'");
    throw new JSApplicationIllegalArgumentException(stringBuilder.toString());
  }
  
  public static r.b b() {
    return r.b.e;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/image/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */