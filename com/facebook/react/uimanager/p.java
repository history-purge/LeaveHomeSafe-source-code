package com.facebook.react.uimanager;

import androidx.core.util.e;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.c;

public class p extends c<p> {
  private static final e<p> j = new e(20);
  
  private int f;
  
  private int g;
  
  private int h;
  
  private int i;
  
  public static p b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    p p2 = (p)j.a();
    p p1 = p2;
    if (p2 == null)
      p1 = new p(); 
    p1.a(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
    return p1;
  }
  
  protected void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    a(paramInt1);
    this.f = paramInt2;
    this.g = paramInt3;
    this.h = paramInt4;
    this.i = paramInt5;
  }
  
  public void a(RCTEventEmitter paramRCTEventEmitter) {
    WritableMap writableMap1 = Arguments.createMap();
    writableMap1.putDouble("x", q.a(this.f));
    writableMap1.putDouble("y", q.a(this.g));
    writableMap1.putDouble("width", q.a(this.h));
    writableMap1.putDouble("height", q.a(this.i));
    WritableMap writableMap2 = Arguments.createMap();
    writableMap2.putMap("layout", (ReadableMap)writableMap1);
    writableMap2.putInt("target", g());
    paramRCTEventEmitter.receiveEvent(g(), d(), writableMap2);
  }
  
  public String d() {
    return "topLayout";
  }
  
  public void i() {
    j.a(this);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/uimanager/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */