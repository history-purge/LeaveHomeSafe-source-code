package com.facebook.react.views.text;

import com.facebook.react.uimanager.b0;
import com.facebook.react.uimanager.e1.a;

public class k extends b0 {
  private String A = null;
  
  public String Q() {
    return this.A;
  }
  
  @a(name = "text")
  public void setText(String paramString) {
    this.A = paramString;
    L();
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(m());
    stringBuilder.append(" [text: ");
    stringBuilder.append(this.A);
    stringBuilder.append("]");
    return stringBuilder.toString();
  }
  
  public boolean y() {
    return true;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/text/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */