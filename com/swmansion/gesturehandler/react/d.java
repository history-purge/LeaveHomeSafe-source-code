package com.swmansion.gesturehandler.react;

import android.util.SparseArray;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import e.h.a.b;
import e.h.a.c;

public class d implements c {
  private SparseArray<int[]> a = new SparseArray();
  
  private SparseArray<int[]> b = new SparseArray();
  
  private int[] a(ReadableMap paramReadableMap, String paramString) {
    ReadableArray readableArray = paramReadableMap.getArray(paramString);
    int[] arrayOfInt = new int[readableArray.size()];
    for (int i = 0; i < arrayOfInt.length; i++)
      arrayOfInt[i] = readableArray.getInt(i); 
    return arrayOfInt;
  }
  
  public void a() {
    this.a.clear();
    this.b.clear();
  }
  
  public void a(int paramInt) {
    this.a.remove(paramInt);
    this.b.remove(paramInt);
  }
  
  public void a(b paramb, ReadableMap paramReadableMap) {
    paramb.a(this);
    if (paramReadableMap.hasKey("waitFor")) {
      int[] arrayOfInt = a(paramReadableMap, "waitFor");
      this.a.put(paramb.m(), arrayOfInt);
    } 
    if (paramReadableMap.hasKey("simultaneousHandlers")) {
      int[] arrayOfInt = a(paramReadableMap, "simultaneousHandlers");
      this.b.put(paramb.m(), arrayOfInt);
    } 
  }
  
  public boolean a(b paramb1, b paramb2) {
    int[] arrayOfInt = (int[])this.b.get(paramb1.m());
    if (arrayOfInt != null)
      for (int i = 0; i < arrayOfInt.length; i++) {
        if (arrayOfInt[i] == paramb2.m())
          return true; 
      }  
    return false;
  }
  
  public boolean b(b paramb1, b paramb2) {
    int[] arrayOfInt = (int[])this.a.get(paramb1.m());
    if (arrayOfInt != null)
      for (int i = 0; i < arrayOfInt.length; i++) {
        if (arrayOfInt[i] == paramb2.m())
          return true; 
      }  
    return false;
  }
  
  public boolean c(b paramb1, b paramb2) {
    return false;
  }
  
  public boolean d(b paramb1, b paramb2) {
    return false;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/swmansion/gesturehandler/react/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */