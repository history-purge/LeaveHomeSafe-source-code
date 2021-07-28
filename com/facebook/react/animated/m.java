package com.facebook.react.animated;

import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.UIManager;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class m extends b {
  private int e = -1;
  
  private final l f;
  
  private final UIManager g;
  
  private final Map<String, Integer> h;
  
  private final JavaOnlyMap i;
  
  m(ReadableMap paramReadableMap, l paraml, UIManager paramUIManager) {
    paramReadableMap = paramReadableMap.getMap("props");
    ReadableMapKeySetIterator readableMapKeySetIterator = paramReadableMap.keySetIterator();
    this.h = new HashMap<String, Integer>();
    while (readableMapKeySetIterator.hasNextKey()) {
      String str = readableMapKeySetIterator.nextKey();
      int i = paramReadableMap.getInt(str);
      this.h.put(str, Integer.valueOf(i));
    } 
    this.i = new JavaOnlyMap();
    this.f = paraml;
    this.g = paramUIManager;
  }
  
  public void a(int paramInt) {
    if (this.e == -1) {
      this.e = paramInt;
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Animated node ");
    stringBuilder.append(this.d);
    stringBuilder.append(" is already attached to a view");
    throw new JSApplicationIllegalArgumentException(stringBuilder.toString());
  }
  
  public void b() {
    ReadableMapKeySetIterator readableMapKeySetIterator = this.i.keySetIterator();
    while (readableMapKeySetIterator.hasNextKey())
      this.i.putNull(readableMapKeySetIterator.nextKey()); 
    this.g.synchronouslyUpdateViewOnUIThread(this.e, (ReadableMap)this.i);
  }
  
  public void b(int paramInt) {
    if (this.e == paramInt) {
      this.e = -1;
      return;
    } 
    throw new JSApplicationIllegalArgumentException("Attempting to disconnect view that has not been connected with the given animated node");
  }
  
  public final void c() {
    if (this.e == -1)
      return; 
    Iterator<Map.Entry> iterator = this.h.entrySet().iterator();
    while (iterator.hasNext()) {
      Map.Entry entry = iterator.next();
      b b1 = this.f.d(((Integer)entry.getValue()).intValue());
      if (b1 != null) {
        if (b1 instanceof o) {
          ((o)b1).a(this.i);
          continue;
        } 
        if (b1 instanceof s) {
          b1 = b1;
          Object object = b1.d();
          if (object instanceof String) {
            this.i.putString((String)entry.getKey(), (String)object);
            continue;
          } 
          this.i.putDouble((String)entry.getKey(), b1.e());
          continue;
        } 
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unsupported type of node used in property node ");
        stringBuilder.append(b1.getClass());
        throw new IllegalArgumentException(stringBuilder.toString());
      } 
      throw new IllegalArgumentException("Mapped property node does not exists");
    } 
    this.g.synchronouslyUpdateViewOnUIThread(this.e, (ReadableMap)this.i);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/animated/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */