package com.facebook.react.bridge;

public interface Dynamic {
  ReadableArray asArray();
  
  boolean asBoolean();
  
  double asDouble();
  
  int asInt();
  
  ReadableMap asMap();
  
  String asString();
  
  ReadableType getType();
  
  boolean isNull();
  
  void recycle();
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/bridge/Dynamic.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */