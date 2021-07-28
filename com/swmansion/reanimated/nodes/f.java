package com.swmansion.reanimated.nodes;

import com.facebook.react.bridge.ReadableMap;

public abstract class f extends m {
  private int a;
  
  public f(int paramInt, ReadableMap paramReadableMap, com.swmansion.reanimated.b paramb) {
    super(paramInt, paramReadableMap, paramb);
    this.a = com.swmansion.reanimated.a.a(paramReadableMap, "clock", "Reanimated: Argument passed to clock node is either of wrong type or is missing.");
  }
  
  protected abstract Double a(m paramm);
  
  protected Double evaluate() {
    return a(this.mNodesManager.a(this.a, m.class));
  }
  
  public static class a extends f {
    public a(int param1Int, ReadableMap param1ReadableMap, com.swmansion.reanimated.b param1b) {
      super(param1Int, param1ReadableMap, param1b);
    }
    
    protected Double a(m param1m) {
      if (param1m instanceof p) {
        ((p)param1m).e();
      } else {
        ((e)param1m).c();
      } 
      return m.ZERO;
    }
  }
  
  public static class b extends f {
    public b(int param1Int, ReadableMap param1ReadableMap, com.swmansion.reanimated.b param1b) {
      super(param1Int, param1ReadableMap, param1b);
    }
    
    protected Double a(m param1m) {
      if (param1m instanceof p) {
        ((p)param1m).f();
      } else {
        ((e)param1m).d();
      } 
      return m.ZERO;
    }
  }
  
  public static class c extends f {
    public c(int param1Int, ReadableMap param1ReadableMap, com.swmansion.reanimated.b param1b) {
      super(param1Int, param1ReadableMap, param1b);
    }
    
    protected Double a(m param1m) {
      boolean bool = param1m instanceof p;
      double d = 1.0D;
      if (bool) {
        if (!((p)param1m).d())
          d = 0.0D; 
        return Double.valueOf(d);
      } 
      if (!((e)param1m).a)
        d = 0.0D; 
      return Double.valueOf(d);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/swmansion/reanimated/nodes/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */