package com.swmansion.reanimated.nodes;

import android.graphics.PointF;
import com.facebook.react.bridge.ReadableMap;

public class b extends m {
  private final int a;
  
  private final a b;
  
  public b(int paramInt, ReadableMap paramReadableMap, com.swmansion.reanimated.b paramb) {
    super(paramInt, paramReadableMap, paramb);
    this.a = com.swmansion.reanimated.a.a(paramReadableMap, "input", "Reanimated: Argument passed to bezier node is either of wrong type or is missing.");
    this.b = new a((float)paramReadableMap.getDouble("mX1"), (float)paramReadableMap.getDouble("mY1"), (float)paramReadableMap.getDouble("mX2"), (float)paramReadableMap.getDouble("mY2"));
  }
  
  protected Double evaluate() {
    Double double_ = (Double)this.mNodesManager.b(this.a);
    return Double.valueOf(this.b.b(double_.floatValue()));
  }
  
  private static class a {
    protected PointF a;
    
    protected PointF b;
    
    protected PointF c = new PointF();
    
    protected PointF d = new PointF();
    
    protected PointF e = new PointF();
    
    public a(float param1Float1, float param1Float2, float param1Float3, float param1Float4) {
      this(new PointF(param1Float1, param1Float2), new PointF(param1Float3, param1Float4));
    }
    
    public a(PointF param1PointF1, PointF param1PointF2) {
      this.a = param1PointF1;
      this.b = param1PointF2;
    }
    
    private float d(float param1Float) {
      PointF pointF1 = this.e;
      PointF pointF3 = this.a;
      pointF3.x *= 3.0F;
      PointF pointF2 = this.d;
      pointF2.x = (this.b.x - pointF3.x) * 3.0F - pointF1.x;
      pointF3 = this.c;
      pointF3.x = 1.0F - pointF1.x - pointF2.x;
      return param1Float * (pointF1.x + (pointF2.x + pointF3.x * param1Float) * param1Float);
    }
    
    private float e(float param1Float) {
      return this.e.x + param1Float * (this.d.x * 2.0F + this.c.x * 3.0F * param1Float);
    }
    
    protected float a(float param1Float) {
      PointF pointF1 = this.e;
      PointF pointF3 = this.a;
      pointF3.y *= 3.0F;
      PointF pointF2 = this.d;
      pointF2.y = (this.b.y - pointF3.y) * 3.0F - pointF1.y;
      pointF3 = this.c;
      pointF3.y = 1.0F - pointF1.y - pointF2.y;
      return param1Float * (pointF1.y + (pointF2.y + pointF3.y * param1Float) * param1Float);
    }
    
    public float b(float param1Float) {
      return a(c(param1Float));
    }
    
    protected float c(float param1Float) {
      int i = 1;
      float f = param1Float;
      while (i < 14) {
        float f1 = d(f) - param1Float;
        if (Math.abs(f1) < 0.001D)
          return f; 
        f -= f1 / e(f);
        i++;
      } 
      return f;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/swmansion/reanimated/nodes/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */