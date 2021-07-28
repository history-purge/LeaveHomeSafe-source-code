package com.swmansion.reanimated.nodes;

import com.facebook.react.bridge.JavaOnlyArray;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableArray;
import java.util.ArrayList;
import java.util.List;

public class t extends m {
  private List<d> a;
  
  public t(int paramInt, ReadableMap paramReadableMap, com.swmansion.reanimated.b paramb) {
    super(paramInt, paramReadableMap, paramb);
    this.a = a(paramReadableMap.getArray("transform"));
  }
  
  private static List<d> a(ReadableArray paramReadableArray) {
    ArrayList<b> arrayList = new ArrayList(paramReadableArray.size());
    for (int i = 0; i < paramReadableArray.size(); i++) {
      ReadableMap readableMap = paramReadableArray.getMap(i);
      String str = readableMap.getString("property");
      if (readableMap.hasKey("nodeID")) {
        b b = new b(null);
        b.a = str;
        b.b = readableMap.getInt("nodeID");
        arrayList.add(b);
      } else {
        String str1;
        ReadableArray readableArray;
        c c = new c(null);
        c.a = str;
        ReadableType readableType = readableMap.getType("value");
        if (readableType == ReadableType.String) {
          str1 = readableMap.getString("value");
        } else if (readableType == ReadableType.Array) {
          readableArray = str1.getArray("value");
        } else {
          readableArray.getDouble("value");
          arrayList.add(c);
        } 
        c.b = readableArray;
        arrayList.add(c);
      } 
    } 
    return (List)arrayList;
  }
  
  protected WritableArray evaluate() {
    ArrayList<JavaOnlyMap> arrayList = new ArrayList(this.a.size());
    for (d d : this.a) {
      arrayList.add(JavaOnlyMap.of(new Object[] { d.a, d.a(this.mNodesManager) }));
    } 
    return (WritableArray)JavaOnlyArray.from(arrayList);
  }
  
  private static class b extends d {
    public int b;
    
    private b() {
      super(null);
    }
    
    public Object a(com.swmansion.reanimated.b param1b) {
      return param1b.b(this.b);
    }
  }
  
  private static class c extends d {
    public Object b;
    
    private c() {
      super(null);
    }
    
    public Object a(com.swmansion.reanimated.b param1b) {
      return this.b;
    }
  }
  
  private static abstract class d {
    public String a;
    
    private d() {}
    
    public abstract Object a(com.swmansion.reanimated.b param1b);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/swmansion/reanimated/nodes/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */