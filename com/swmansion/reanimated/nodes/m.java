package com.swmansion.reanimated.nodes;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.swmansion.reanimated.b;
import com.swmansion.reanimated.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public abstract class m {
  public static final Double ONE;
  
  public static final Double ZERO = Double.valueOf(0.0D);
  
  private List<m> mChildren;
  
  private final Map<String, Long> mLastLoopID = new HashMap<String, Long>();
  
  private final Map<String, Object> mMemoizedValue = new HashMap<String, Object>();
  
  protected final int mNodeID;
  
  protected final b mNodesManager;
  
  protected final d mUpdateContext;
  
  static {
    ONE = Double.valueOf(1.0D);
  }
  
  public m(int paramInt, ReadableMap paramReadableMap, b paramb) {
    this.mLastLoopID.put("", Long.valueOf(-1L));
    this.mNodeID = paramInt;
    this.mNodesManager = paramb;
    this.mUpdateContext = paramb.p;
  }
  
  private static void findAndUpdateNodes(m paramm, Set<m> paramSet, Stack<j> paramStack) {
    if (paramSet.contains(paramm))
      return; 
    paramSet.add(paramm);
    List<m> list = paramm.mChildren;
    if (list != null) {
      Iterator<m> iterator = list.iterator();
      while (iterator.hasNext())
        findAndUpdateNodes(iterator.next(), paramSet, paramStack); 
    } 
    if (paramm instanceof j)
      paramStack.push((j)paramm); 
  }
  
  public static void runUpdates(d paramd) {
    UiThreadUtil.assertOnUiThread();
    ArrayList<m> arrayList = paramd.c;
    HashSet<m> hashSet = new HashSet();
    Stack<j> stack = new Stack();
    for (int i = 0; i < arrayList.size(); i++) {
      findAndUpdateNodes(arrayList.get(i), hashSet, stack);
      if (i == arrayList.size() - 1)
        while (!stack.isEmpty())
          ((j)stack.pop()).a();  
    } 
    arrayList.clear();
    paramd.a++;
  }
  
  public void addChild(m paramm) {
    if (this.mChildren == null)
      this.mChildren = new ArrayList<m>(); 
    this.mChildren.add(paramm);
    paramm.dangerouslyRescheduleEvaluate();
  }
  
  protected final void dangerouslyRescheduleEvaluate() {
    this.mLastLoopID.put(this.mUpdateContext.b, Long.valueOf(-1L));
    markUpdated();
  }
  
  public final Double doubleValue() {
    Object object = value();
    if (object == null)
      return ZERO; 
    if (object instanceof Double)
      return (Double)object; 
    if (object instanceof Number)
      return Double.valueOf(((Number)object).doubleValue()); 
    if (object instanceof Boolean)
      return ((Boolean)object).booleanValue() ? ONE : ZERO; 
    object = new StringBuilder();
    object.append("Value of node ");
    object.append(this);
    object.append(" cannot be cast to a number");
    throw new IllegalStateException(object.toString());
  }
  
  protected abstract Object evaluate();
  
  protected final void forceUpdateMemoizedValue(Object paramObject) {
    this.mMemoizedValue.put(this.mUpdateContext.b, paramObject);
    markUpdated();
  }
  
  protected void markUpdated() {
    UiThreadUtil.assertOnUiThread();
    this.mUpdateContext.c.add(this);
    this.mNodesManager.c();
  }
  
  public void removeChild(m paramm) {
    List<m> list = this.mChildren;
    if (list != null)
      list.remove(paramm); 
  }
  
  public final Object value() {
    if (this.mLastLoopID.containsKey(this.mUpdateContext.b)) {
      long l = ((Long)this.mLastLoopID.get(this.mUpdateContext.b)).longValue();
      d d2 = this.mUpdateContext;
      if (l >= d2.a)
        return this.mMemoizedValue.get(d2.b); 
    } 
    Map<String, Long> map = this.mLastLoopID;
    d d1 = this.mUpdateContext;
    map.put(d1.b, Long.valueOf(d1.a));
    Object object = evaluate();
    this.mMemoizedValue.put(this.mUpdateContext.b, object);
    return object;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/swmansion/reanimated/nodes/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */