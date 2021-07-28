package com.facebook.react.modules.debug;

import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.modules.core.a;
import com.facebook.react.uimanager.UIManagerModule;
import java.util.Map;
import java.util.TreeMap;

public class b extends a.a {
  private a b;
  
  private final ReactContext c;
  
  private final UIManagerModule d;
  
  private final a e;
  
  private boolean f = false;
  
  private long g = -1L;
  
  private long h = -1L;
  
  private int i = 0;
  
  private int j = 0;
  
  private int k = 0;
  
  private int l = 0;
  
  private boolean m = false;
  
  private TreeMap<Long, b> n;
  
  public b(ReactContext paramReactContext) {
    this.c = paramReactContext;
    this.d = (UIManagerModule)paramReactContext.getNativeModule(UIManagerModule.class);
    this.e = new a();
  }
  
  public void a(long paramLong) {
    if (this.f)
      return; 
    if (this.g == -1L)
      this.g = paramLong; 
    long l = this.h;
    this.h = paramLong;
    if (this.e.a(l, paramLong))
      this.l++; 
    this.i++;
    int i = b();
    if (i - this.j - 1 >= 4)
      this.k++; 
    if (this.m) {
      e.e.m.a.a.a(this.n);
      b b1 = new b(e(), f(), i, this.k, c(), d(), g());
      this.n.put(Long.valueOf(System.currentTimeMillis()), b1);
    } 
    this.j = i;
    a a1 = this.b;
    if (a1 != null)
      a1.a(this); 
  }
  
  public int b() {
    double d = g();
    Double.isNaN(d);
    return (int)(d / 16.9D + 1.0D);
  }
  
  public b b(long paramLong) {
    e.e.m.a.a.a(this.n, "FPS was not recorded at each frame!");
    Map.Entry<Long, b> entry = this.n.floorEntry(Long.valueOf(paramLong));
    return (entry == null) ? null : entry.getValue();
  }
  
  public double c() {
    if (this.h == this.g)
      return 0.0D; 
    double d1 = e();
    Double.isNaN(d1);
    double d2 = (this.h - this.g);
    Double.isNaN(d2);
    return d1 * 1.0E9D / d2;
  }
  
  public double d() {
    if (this.h == this.g)
      return 0.0D; 
    double d1 = f();
    Double.isNaN(d1);
    double d2 = (this.h - this.g);
    Double.isNaN(d2);
    return d1 * 1.0E9D / d2;
  }
  
  public int e() {
    return this.i - 1;
  }
  
  public int f() {
    return this.l - 1;
  }
  
  public int g() {
    double d1 = this.h;
    double d2 = this.g;
    Double.isNaN(d1);
    Double.isNaN(d2);
    return (int)(d1 - d2) / 1000000;
  }
  
  public void h() {
    this.f = false;
    this.c.getCatalystInstance().addBridgeIdleDebugListener(this.e);
    this.d.setViewHierarchyUpdateDebugListener(this.e);
    UiThreadUtil.runOnUiThread(new a(this, this));
  }
  
  public void i() {
    this.n = new TreeMap<Long, b>();
    this.m = true;
    h();
  }
  
  public void j() {
    this.f = true;
    this.c.getCatalystInstance().removeBridgeIdleDebugListener(this.e);
    this.d.setViewHierarchyUpdateDebugListener(null);
  }
  
  class a implements Runnable {
    a(b this$0, b param1b1) {}
    
    public void run() {
      b.a(this.d, a.b());
      b.a(this.d).a(this.c);
    }
  }
  
  public static class b {
    public final int a;
    
    public final int b;
    
    public final int c;
    
    public final double d;
    
    public final double e;
    
    public final int f;
    
    public b(int param1Int1, int param1Int2, int param1Int3, int param1Int4, double param1Double1, double param1Double2, int param1Int5) {
      this.a = param1Int1;
      this.b = param1Int2;
      this.c = param1Int3;
      this.d = param1Double1;
      this.e = param1Double2;
      this.f = param1Int5;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/modules/debug/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */