package com.facebook.react.devsupport;

import e.e.n.a.a;

@a
public class JSException extends Exception {
  private final String mStack;
  
  @a
  public JSException(String paramString1, String paramString2, Throwable paramThrowable) {
    super(paramString1, paramThrowable);
    this.mStack = paramString2;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/devsupport/JSException.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */