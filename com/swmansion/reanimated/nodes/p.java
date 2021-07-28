package com.swmansion.reanimated.nodes;

import com.facebook.react.bridge.ReadableMap;
import com.swmansion.reanimated.b;
import com.swmansion.reanimated.d;
import java.util.Stack;

public class p extends u {
  private final Stack<Integer> b = new Stack<Integer>();
  
  private String c;
  
  public p(int paramInt, ReadableMap paramReadableMap, b paramb) {
    super(paramInt, paramReadableMap, paramb);
  }
  
  public void a(Integer paramInteger, String paramString) {
    this.c = paramString;
    this.b.push(paramInteger);
  }
  
  public void a(Object paramObject) {
    m m = this.mNodesManager.a(((Integer)this.b.peek()).intValue(), m.class);
    d d = this.mUpdateContext;
    String str = d.b;
    d.b = this.c;
    ((u)m).a(paramObject);
    this.mUpdateContext.b = str;
    forceUpdateMemoizedValue(paramObject);
  }
  
  public void c() {
    this.b.pop();
  }
  
  public boolean d() {
    m m = this.mNodesManager.a(((Integer)this.b.peek()).intValue(), m.class);
    return (m instanceof p) ? ((p)m).d() : ((e)m).a;
  }
  
  public void e() {
    m m = this.mNodesManager.a(((Integer)this.b.peek()).intValue(), m.class);
    if (m instanceof p) {
      ((p)m).e();
      return;
    } 
    ((e)m).c();
  }
  
  protected Object evaluate() {
    d d = this.mUpdateContext;
    String str = d.b;
    d.b = this.c;
    Object object = this.mNodesManager.a(((Integer)this.b.peek()).intValue(), m.class).value();
    this.mUpdateContext.b = str;
    return object;
  }
  
  public void f() {
    m m = this.mNodesManager.a(((Integer)this.b.peek()).intValue(), m.class);
    if (m instanceof p) {
      ((p)m).f();
      return;
    } 
    ((e)m).d();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/swmansion/reanimated/nodes/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */