package org.reactnative.camera.g;

import android.graphics.Rect;
import android.os.AsyncTask;
import android.util.SparseArray;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import e.f.a.e.n.d.a;
import k.b.a.a;
import k.b.a.b;
import k.b.b.a;
import k.b.b.b;
import org.reactnative.camera.h.a;

public class c extends AsyncTask<Void, Void, SparseArray<a>> {
  private byte[] a;
  
  private int b;
  
  private int c;
  
  private int d;
  
  private b e;
  
  private d f;
  
  private double g;
  
  private double h;
  
  private a i;
  
  private int j;
  
  private int k;
  
  public c(d paramd, b paramb, byte[] paramArrayOfbyte, int paramInt1, int paramInt2, int paramInt3, float paramFloat, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8) {
    this.a = paramArrayOfbyte;
    this.b = paramInt1;
    this.c = paramInt2;
    this.d = paramInt3;
    this.f = paramd;
    this.e = paramb;
    this.i = new a(paramInt1, paramInt2, paramInt3, paramInt4);
    double d1 = paramInt5;
    double d2 = (this.i.d() * paramFloat);
    Double.isNaN(d1);
    Double.isNaN(d2);
    this.g = d1 / d2;
    d1 = paramInt6;
    d2 = (this.i.b() * paramFloat);
    Double.isNaN(d1);
    Double.isNaN(d2);
    this.h = d1 / d2;
    this.j = paramInt7;
    this.k = paramInt8;
  }
  
  private WritableMap a(Rect paramRect) {
    int i;
    WritableMap writableMap2 = Arguments.createMap();
    int j = paramRect.left;
    int k = paramRect.top;
    int m = this.b;
    if (j < m / 2) {
      i = j + this.j / 2;
    } else {
      i = j;
      if (j > m / 2)
        i = j - this.j / 2; 
    } 
    m = paramRect.top;
    int n = this.c;
    if (m < n / 2) {
      j = k + this.k / 2;
    } else {
      j = k;
      if (m > n / 2)
        j = k - this.k / 2; 
    } 
    double d1 = i;
    double d2 = this.g;
    Double.isNaN(d1);
    writableMap2.putDouble("x", d1 * d2);
    d1 = j;
    d2 = this.h;
    Double.isNaN(d1);
    writableMap2.putDouble("y", d1 * d2);
    WritableMap writableMap3 = Arguments.createMap();
    d1 = paramRect.width();
    d2 = this.g;
    Double.isNaN(d1);
    writableMap3.putDouble("width", d1 * d2);
    d1 = paramRect.height();
    d2 = this.h;
    Double.isNaN(d1);
    writableMap3.putDouble("height", d1 * d2);
    WritableMap writableMap1 = Arguments.createMap();
    writableMap1.putMap("origin", (ReadableMap)writableMap2);
    writableMap1.putMap("size", (ReadableMap)writableMap3);
    return writableMap1;
  }
  
  private WritableArray b(SparseArray<a> paramSparseArray) {
    WritableArray writableArray = Arguments.createArray();
    for (int i = 0; i < paramSparseArray.size(); i++) {
      a a1 = (a)paramSparseArray.valueAt(i);
      WritableMap writableMap = Arguments.createMap();
      writableMap.putString("data", a1.e);
      writableMap.putString("rawData", a1.d);
      writableMap.putString("type", a.a(a1.c));
      writableMap.putMap("bounds", (ReadableMap)a(a1.b()));
      writableArray.pushMap((ReadableMap)writableMap);
    } 
    return writableArray;
  }
  
  protected SparseArray<a> a(Void... paramVarArgs) {
    if (!isCancelled() && this.f != null) {
      b b1 = this.e;
      if (b1 != null && b1.a()) {
        a a1 = b.a(this.a, this.b, this.c, this.d);
        return this.e.a(a1);
      } 
    } 
    return null;
  }
  
  protected void a(SparseArray<a> paramSparseArray) {
    super.onPostExecute(paramSparseArray);
    if (paramSparseArray == null) {
      this.f.a(this.e);
      return;
    } 
    if (paramSparseArray.size() > 0)
      this.f.a(b(paramSparseArray), this.b, this.c, this.a); 
    this.f.d();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/org/reactnative/camera/g/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */