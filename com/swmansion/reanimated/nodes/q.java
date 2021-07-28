package com.swmansion.reanimated.nodes;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.c0;
import com.facebook.react.uimanager.o0;
import com.swmansion.reanimated.b;
import com.swmansion.reanimated.e;
import java.util.Iterator;
import java.util.Map;

public class q extends m implements j {
  private final Map<String, Integer> a;
  
  private final o0 b;
  
  private int c = -1;
  
  private final JavaOnlyMap d;
  
  private final c0 e;
  
  public q(int paramInt, ReadableMap paramReadableMap, b paramb, o0 paramo0) {
    super(paramInt, paramReadableMap, paramb);
    this.a = e.a(paramReadableMap.getMap("props"));
    this.b = paramo0;
    this.d = new JavaOnlyMap();
    this.e = new c0((ReadableMap)this.d);
  }
  
  private static void a(WritableMap paramWritableMap, String paramString, Object paramObject) {
    IllegalStateException illegalStateException;
    double d;
    if (paramObject == null) {
      paramWritableMap.putNull(paramString);
      return;
    } 
    if (paramObject instanceof Double) {
      d = ((Double)paramObject).doubleValue();
    } else {
      if (paramObject instanceof Integer) {
        paramWritableMap.putInt(paramString, ((Integer)paramObject).intValue());
        return;
      } 
      if (paramObject instanceof Number) {
        d = ((Number)paramObject).doubleValue();
      } else {
        if (paramObject instanceof Boolean) {
          paramWritableMap.putBoolean(paramString, ((Boolean)paramObject).booleanValue());
          return;
        } 
        if (paramObject instanceof String) {
          paramWritableMap.putString(paramString, (String)paramObject);
          return;
        } 
        if (paramObject instanceof com.facebook.react.bridge.WritableArray) {
          paramWritableMap.putArray(paramString, (ReadableArray)paramObject);
          return;
        } 
        if (paramObject instanceof WritableMap) {
          paramWritableMap.putMap(paramString, (ReadableMap)paramObject);
          return;
        } 
        illegalStateException = new IllegalStateException("Unknown type of animated value");
        throw illegalStateException;
      } 
    } 
    illegalStateException.putDouble(paramString, d);
  }
  
  public void a() {
    if (this.c == -1)
      return; 
    value();
  }
  
  public void a(int paramInt) {
    this.c = paramInt;
    dangerouslyRescheduleEvaluate();
  }
  
  public void b(int paramInt) {
    this.c = -1;
  }
  
  protected Double evaluate() {
    WritableMap writableMap1 = Arguments.createMap();
    WritableMap writableMap2 = Arguments.createMap();
    Iterator<Map.Entry> iterator = this.a.entrySet().iterator();
    boolean bool1 = false;
    int k = 0;
    boolean bool2 = false;
    label44: while (iterator.hasNext()) {
      StringBuilder stringBuilder;
      WritableMap writableMap;
      Map.Entry entry = iterator.next();
      m m1 = this.mNodesManager.a(((Integer)entry.getValue()).intValue(), m.class);
      if (m1 instanceof s) {
        writableMap = (WritableMap)m1.value();
        ReadableMapKeySetIterator readableMapKeySetIterator = writableMap.keySetIterator();
        boolean bool4 = bool2;
        int n = k;
        boolean bool3 = bool1;
        while (true) {
          bool1 = bool3;
          k = n;
          bool2 = bool4;
          if (readableMapKeySetIterator.hasNextKey()) {
            WritableMap writableMap3;
            String str1 = readableMapKeySetIterator.nextKey();
            if (this.mNodesManager.q.contains(str1)) {
              JavaOnlyMap javaOnlyMap = this.d;
              bool3 = true;
            } else if (this.mNodesManager.r.contains(str1)) {
              n = 1;
              writableMap3 = writableMap2;
            } else {
              bool4 = true;
              writableMap3 = writableMap1;
            } 
            ReadableType readableType = writableMap.getType(str1);
            k = a.a[readableType.ordinal()];
            if (k != 1) {
              if (k != 2) {
                if (k == 3) {
                  writableMap3.putArray(str1, writableMap.getArray(str1));
                  continue;
                } 
                stringBuilder = new StringBuilder();
                stringBuilder.append("Unexpected type ");
                stringBuilder.append(readableType);
                throw new IllegalArgumentException(stringBuilder.toString());
              } 
              stringBuilder.putString(str1, writableMap.getString(str1));
              continue;
            } 
            stringBuilder.putDouble(str1, writableMap.getDouble(str1));
            continue;
          } 
          continue label44;
        } 
      } 
      String str = (String)writableMap.getKey();
      Object object = stringBuilder.value();
      if (this.mNodesManager.q.contains(str)) {
        a((WritableMap)this.d, str, object);
        bool1 = true;
        continue;
      } 
      a(writableMap2, str, object);
      k = 1;
    } 
    int i = this.c;
    if (i != -1) {
      if (bool1)
        this.b.a(i, this.e); 
      if (k != 0)
        this.mNodesManager.a(this.c, writableMap2); 
      if (bool2) {
        WritableMap writableMap = Arguments.createMap();
        writableMap.putInt("viewTag", this.c);
        writableMap.putMap("props", (ReadableMap)writableMap1);
        this.mNodesManager.a("onReanimatedPropsChange", writableMap);
      } 
    } 
    return m.ZERO;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/swmansion/reanimated/nodes/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */