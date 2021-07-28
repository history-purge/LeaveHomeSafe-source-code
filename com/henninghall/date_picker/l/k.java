package com.henninghall.date_picker.l;

import com.facebook.react.bridge.Dynamic;

public abstract class k<T> {
  private T a;
  
  public k() {}
  
  public k(T paramT) {
    this.a = paramT;
  }
  
  public T a() {
    return this.a;
  }
  
  public void a(Dynamic paramDynamic) {
    this.a = b(paramDynamic);
  }
  
  abstract T b(Dynamic paramDynamic);
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/henninghall/date_picker/l/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */