package com.facebook.jni;

import com.facebook.jni.annotations.DoNotStrip;
import java.util.Iterator;
import java.util.Map;

@DoNotStrip
public class MapIteratorHelper {
  @DoNotStrip
  private final Iterator<Map.Entry> mIterator;
  
  @DoNotStrip
  private Object mKey;
  
  @DoNotStrip
  private Object mValue;
  
  @DoNotStrip
  public MapIteratorHelper(Map paramMap) {
    this.mIterator = paramMap.entrySet().iterator();
  }
  
  @DoNotStrip
  boolean hasNext() {
    if (this.mIterator.hasNext()) {
      Map.Entry entry = this.mIterator.next();
      this.mKey = entry.getKey();
      this.mValue = entry.getValue();
      return true;
    } 
    this.mKey = null;
    this.mValue = null;
    return false;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/jni/MapIteratorHelper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */