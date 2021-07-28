package com.facebook.jni;

import com.facebook.jni.annotations.DoNotStrip;
import java.util.Iterator;

@DoNotStrip
public class IteratorHelper {
  @DoNotStrip
  private Object mElement;
  
  private final Iterator mIterator;
  
  @DoNotStrip
  public IteratorHelper(Iterable paramIterable) {
    this.mIterator = paramIterable.iterator();
  }
  
  @DoNotStrip
  public IteratorHelper(Iterator paramIterator) {
    this.mIterator = paramIterator;
  }
  
  @DoNotStrip
  boolean hasNext() {
    if (this.mIterator.hasNext()) {
      this.mElement = this.mIterator.next();
      return true;
    } 
    this.mElement = null;
    return false;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/jni/IteratorHelper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */