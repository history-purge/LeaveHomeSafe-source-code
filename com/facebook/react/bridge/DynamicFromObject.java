package com.facebook.react.bridge;

import e.e.e.e.a;

public class DynamicFromObject implements Dynamic {
  private Object mObject;
  
  public DynamicFromObject(Object paramObject) {
    this.mObject = paramObject;
  }
  
  public ReadableArray asArray() {
    return (ReadableArray)this.mObject;
  }
  
  public boolean asBoolean() {
    return ((Boolean)this.mObject).booleanValue();
  }
  
  public double asDouble() {
    return ((Double)this.mObject).doubleValue();
  }
  
  public int asInt() {
    return ((Double)this.mObject).intValue();
  }
  
  public ReadableMap asMap() {
    return (ReadableMap)this.mObject;
  }
  
  public String asString() {
    return (String)this.mObject;
  }
  
  public ReadableType getType() {
    if (isNull())
      return ReadableType.Null; 
    Object object = this.mObject;
    if (object instanceof Boolean)
      return ReadableType.Boolean; 
    if (object instanceof Number)
      return ReadableType.Number; 
    if (object instanceof String)
      return ReadableType.String; 
    if (object instanceof ReadableMap)
      return ReadableType.Map; 
    if (object instanceof ReadableArray)
      return ReadableType.Array; 
    object = new StringBuilder();
    object.append("Unmapped object type ");
    object.append(this.mObject.getClass().getName());
    a.b("ReactNative", object.toString());
    return ReadableType.Null;
  }
  
  public boolean isNull() {
    return (this.mObject == null);
  }
  
  public void recycle() {}
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/bridge/DynamicFromObject.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */