package com.facebook.react.views.scroll;

import androidx.core.util.e;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.c;
import com.facebook.react.uimanager.q;
import e.e.m.a.a;

public class h extends c<h> {
  private static final e<h> o = new e(3);
  
  private int f;
  
  private int g;
  
  private double h;
  
  private double i;
  
  private int j;
  
  private int k;
  
  private int l;
  
  private int m;
  
  private i n;
  
  private void a(int paramInt1, i parami, int paramInt2, int paramInt3, float paramFloat1, float paramFloat2, int paramInt4, int paramInt5, int paramInt6, int paramInt7) {
    a(paramInt1);
    this.n = parami;
    this.f = paramInt2;
    this.g = paramInt3;
    this.h = paramFloat1;
    this.i = paramFloat2;
    this.j = paramInt4;
    this.k = paramInt5;
    this.l = paramInt6;
    this.m = paramInt7;
  }
  
  public static h b(int paramInt1, i parami, int paramInt2, int paramInt3, float paramFloat1, float paramFloat2, int paramInt4, int paramInt5, int paramInt6, int paramInt7) {
    h h2 = (h)o.a();
    h h1 = h2;
    if (h2 == null)
      h1 = new h(); 
    h1.a(paramInt1, parami, paramInt2, paramInt3, paramFloat1, paramFloat2, paramInt4, paramInt5, paramInt6, paramInt7);
    return h1;
  }
  
  private WritableMap j() {
    WritableMap writableMap1 = Arguments.createMap();
    writableMap1.putDouble("top", 0.0D);
    writableMap1.putDouble("bottom", 0.0D);
    writableMap1.putDouble("left", 0.0D);
    writableMap1.putDouble("right", 0.0D);
    WritableMap writableMap2 = Arguments.createMap();
    writableMap2.putDouble("x", q.a(this.f));
    writableMap2.putDouble("y", q.a(this.g));
    WritableMap writableMap3 = Arguments.createMap();
    writableMap3.putDouble("width", q.a(this.j));
    writableMap3.putDouble("height", q.a(this.k));
    WritableMap writableMap4 = Arguments.createMap();
    writableMap4.putDouble("width", q.a(this.l));
    writableMap4.putDouble("height", q.a(this.m));
    WritableMap writableMap5 = Arguments.createMap();
    writableMap5.putDouble("x", this.h);
    writableMap5.putDouble("y", this.i);
    WritableMap writableMap6 = Arguments.createMap();
    writableMap6.putMap("contentInset", (ReadableMap)writableMap1);
    writableMap6.putMap("contentOffset", (ReadableMap)writableMap2);
    writableMap6.putMap("contentSize", (ReadableMap)writableMap3);
    writableMap6.putMap("layoutMeasurement", (ReadableMap)writableMap4);
    writableMap6.putMap("velocity", (ReadableMap)writableMap5);
    writableMap6.putInt("target", g());
    writableMap6.putBoolean("responderIgnoreScroll", true);
    return writableMap6;
  }
  
  public void a(RCTEventEmitter paramRCTEventEmitter) {
    paramRCTEventEmitter.receiveEvent(g(), d(), j());
  }
  
  public boolean a() {
    return (this.n == i.e);
  }
  
  public short c() {
    return 0;
  }
  
  public String d() {
    i i1 = this.n;
    a.a(i1);
    return i.a(i1);
  }
  
  public void i() {
    o.a(this);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/scroll/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */