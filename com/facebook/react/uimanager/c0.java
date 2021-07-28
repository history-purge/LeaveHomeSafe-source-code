package com.facebook.react.uimanager;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

public class c0 {
  final ReadableMap a;
  
  public c0(ReadableMap paramReadableMap) {
    this.a = paramReadableMap;
  }
  
  public float a(String paramString, float paramFloat) {
    return this.a.isNull(paramString) ? paramFloat : (float)this.a.getDouble(paramString);
  }
  
  public int a(String paramString, int paramInt) {
    return this.a.isNull(paramString) ? paramInt : this.a.getInt(paramString);
  }
  
  public ReadableArray a(String paramString) {
    return this.a.getArray(paramString);
  }
  
  public boolean a(String paramString, boolean paramBoolean) {
    return this.a.isNull(paramString) ? paramBoolean : this.a.getBoolean(paramString);
  }
  
  public ReadableMap b(String paramString) {
    return this.a.getMap(paramString);
  }
  
  public String c(String paramString) {
    return this.a.getString(paramString);
  }
  
  public boolean d(String paramString) {
    return this.a.hasKey(paramString);
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("{ ");
    stringBuilder.append(c0.class.getSimpleName());
    stringBuilder.append(": ");
    stringBuilder.append(this.a.toString());
    stringBuilder.append(" }");
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/uimanager/c0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */