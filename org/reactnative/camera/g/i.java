package org.reactnative.camera.g;

import android.content.Context;
import android.os.AsyncTask;
import android.util.SparseArray;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.k0;
import e.f.a.e.n.f.c;
import e.f.a.e.n.f.d;
import e.f.a.e.n.f.e;
import java.util.Iterator;
import k.b.b.a;
import k.b.b.b;
import org.reactnative.camera.h.a;
import org.reactnative.facedetector.a;

public class i extends AsyncTask<Void, Void, SparseArray<d>> {
  private j a;
  
  private k0 b;
  
  private e c;
  
  private byte[] d;
  
  private int e;
  
  private int f;
  
  private int g;
  
  private a h;
  
  private double i;
  
  private double j;
  
  private int k;
  
  private int l;
  
  public i(j paramj, k0 paramk0, byte[] paramArrayOfbyte, int paramInt1, int paramInt2, int paramInt3, float paramFloat, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8) {
    this.a = paramj;
    this.b = paramk0;
    this.d = paramArrayOfbyte;
    this.e = paramInt1;
    this.f = paramInt2;
    this.g = paramInt3;
    this.h = new a(paramInt1, paramInt2, paramInt3, paramInt4);
    double d1 = paramInt5;
    double d2 = (this.h.d() * paramFloat);
    Double.isNaN(d1);
    Double.isNaN(d2);
    this.i = d1 / d2;
    d1 = paramInt6;
    d2 = (this.h.b() * paramFloat);
    Double.isNaN(d1);
    Double.isNaN(d2);
    this.j = d1 / d2;
    this.k = paramInt7;
    this.l = paramInt8;
  }
  
  private WritableMap a(WritableMap paramWritableMap) {
    ReadableMap readableMap = paramWritableMap.getMap("bounds");
    WritableMap writableMap1 = a.a((ReadableMap)a.a(readableMap.getMap("origin"), this.h.d(), this.i), -readableMap.getMap("size").getDouble("width"));
    WritableMap writableMap2 = Arguments.createMap();
    writableMap2.merge(readableMap);
    writableMap2.putMap("origin", (ReadableMap)writableMap1);
    paramWritableMap.putMap("bounds", (ReadableMap)writableMap2);
    ReadableArray readableArray = paramWritableMap.getArray("components");
    WritableArray writableArray = Arguments.createArray();
    for (int k = 0; k < readableArray.size(); k++) {
      writableMap2 = Arguments.createMap();
      writableMap2.merge(readableArray.getMap(k));
      a(writableMap2);
      writableArray.pushMap((ReadableMap)writableMap2);
    } 
    paramWritableMap.putArray("components", (ReadableArray)writableArray);
    return paramWritableMap;
  }
  
  private WritableMap a(c paramc) {
    String str;
    int k;
    WritableMap writableMap1 = Arguments.createMap();
    WritableArray writableArray = Arguments.createArray();
    Iterator<c> iterator = paramc.getComponents().iterator();
    while (iterator.hasNext())
      writableArray.pushMap((ReadableMap)a(iterator.next())); 
    writableMap1.putArray("components", (ReadableArray)writableArray);
    writableMap1.putString("value", paramc.getValue());
    int m = (paramc.a()).left;
    int n = (paramc.a()).top;
    if ((paramc.a()).left < this.e / 2) {
      k = m + this.k / 2;
    } else {
      k = m;
      if ((paramc.a()).left > this.e / 2)
        k = m - this.k / 2; 
    } 
    if (paramc.a().height() < this.f / 2) {
      m = n + this.l / 2;
    } else {
      m = n;
      if (paramc.a().height() > this.f / 2)
        m = n - this.l / 2; 
    } 
    WritableMap writableMap2 = Arguments.createMap();
    double d1 = k;
    double d2 = this.i;
    Double.isNaN(d1);
    writableMap2.putDouble("x", d1 * d2);
    d1 = m;
    d2 = this.j;
    Double.isNaN(d1);
    writableMap2.putDouble("y", d1 * d2);
    WritableMap writableMap3 = Arguments.createMap();
    d1 = paramc.a().width();
    d2 = this.i;
    Double.isNaN(d1);
    writableMap3.putDouble("width", d1 * d2);
    d1 = paramc.a().height();
    d2 = this.j;
    Double.isNaN(d1);
    writableMap3.putDouble("height", d1 * d2);
    WritableMap writableMap4 = Arguments.createMap();
    writableMap4.putMap("origin", (ReadableMap)writableMap2);
    writableMap4.putMap("size", (ReadableMap)writableMap3);
    writableMap1.putMap("bounds", (ReadableMap)writableMap4);
    if (paramc instanceof d) {
      str = "block";
    } else if (str instanceof e.f.a.e.n.f.b) {
      str = "line";
    } else {
      str = "element";
    } 
    writableMap1.putString("type", str);
    return writableMap1;
  }
  
  protected SparseArray<d> a(Void... paramVarArgs) {
    if (isCancelled() || this.a == null)
      return null; 
    this.c = (new e.a((Context)this.b)).a();
    a a1 = b.a(this.d, this.e, this.f, this.g);
    return this.c.a(a1.b());
  }
  
  protected void a(SparseArray<d> paramSparseArray) {
    super.onPostExecute(paramSparseArray);
    e e1 = this.c;
    if (e1 != null)
      e1.a(); 
    if (paramSparseArray != null) {
      WritableArray writableArray = Arguments.createArray();
      for (int k = 0; k < paramSparseArray.size(); k++) {
        WritableMap writableMap = a((c)paramSparseArray.valueAt(k));
        if (this.h.a() == 1)
          a(writableMap); 
        writableArray.pushMap((ReadableMap)writableMap);
      } 
      this.a.a(writableArray);
    } 
    this.a.a();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/org/reactnative/camera/g/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */