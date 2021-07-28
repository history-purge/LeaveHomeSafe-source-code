package com.facebook.react.animated;

import com.facebook.react.bridge.JavaOnlyArray;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import java.util.ArrayList;
import java.util.List;

class r extends b {
  private final l e;
  
  private final List<d> f;
  
  r(ReadableMap paramReadableMap, l paraml) {
    ReadableArray readableArray = paramReadableMap.getArray("transforms");
    this.f = new ArrayList<d>(readableArray.size());
    for (int i = 0; i < readableArray.size(); i++) {
      c c;
      ReadableMap readableMap = readableArray.getMap(i);
      String str = readableMap.getString("property");
      if (readableMap.getString("type").equals("animated")) {
        b b1 = new b(null);
        b1.a = str;
        b1.b = readableMap.getInt("nodeTag");
      } else {
        c = new c(null);
        c.a = str;
        c.b = readableMap.getDouble("value");
      } 
      this.f.add(c);
    } 
    this.e = paraml;
  }
  
  public void a(JavaOnlyMap paramJavaOnlyMap) {
    StringBuilder stringBuilder;
    ArrayList<JavaOnlyMap> arrayList = new ArrayList(this.f.size());
    for (d d1 : this.f) {
      double d;
      if (d1 instanceof b) {
        int i = ((b)d1).b;
        b b1 = this.e.d(i);
        if (b1 != null) {
          if (b1 instanceof s) {
            d = ((s)b1).e();
          } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Unsupported type of node used as a transform child node ");
            stringBuilder.append(b1.getClass());
            throw new IllegalArgumentException(stringBuilder.toString());
          } 
        } else {
          throw new IllegalArgumentException("Mapped style node does not exists");
        } 
      } else {
        d = ((c)d1).b;
      } 
      arrayList.add(JavaOnlyMap.of(new Object[] { d1.a, Double.valueOf(d) }));
    } 
    stringBuilder.putArray("transform", (ReadableArray)JavaOnlyArray.from(arrayList));
  }
  
  private class b extends d {
    public int b;
    
    private b(r this$0) {
      super(null);
    }
  }
  
  private class c extends d {
    public double b;
    
    private c(r this$0) {
      super(null);
    }
  }
  
  private class d {
    public String a;
    
    private d(r this$0) {}
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/animated/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */