package org.reactnative.camera.g;

import android.os.AsyncTask;
import android.util.SparseArray;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import e.f.a.e.n.e.b;
import k.b.b.a;
import k.b.b.b;
import org.reactnative.camera.h.a;
import org.reactnative.facedetector.a;
import org.reactnative.facedetector.b;

public class e extends AsyncTask<Void, Void, SparseArray<b>> {
  private byte[] a;
  
  private int b;
  
  private int c;
  
  private int d;
  
  private b e;
  
  private f f;
  
  private a g;
  
  private double h;
  
  private double i;
  
  private int j;
  
  private int k;
  
  public e(f paramf, b paramb, byte[] paramArrayOfbyte, int paramInt1, int paramInt2, int paramInt3, float paramFloat, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8) {
    this.a = paramArrayOfbyte;
    this.b = paramInt1;
    this.c = paramInt2;
    this.d = paramInt3;
    this.f = paramf;
    this.e = paramb;
    this.g = new a(paramInt1, paramInt2, paramInt3, paramInt4);
    double d1 = paramInt5;
    double d2 = (this.g.d() * paramFloat);
    Double.isNaN(d1);
    Double.isNaN(d2);
    this.h = d1 / d2;
    d1 = paramInt6;
    d2 = (this.g.b() * paramFloat);
    Double.isNaN(d1);
    Double.isNaN(d2);
    this.i = d1 / d2;
    this.j = paramInt7;
    this.k = paramInt8;
  }
  
  private WritableArray b(SparseArray<b> paramSparseArray) {
    WritableArray writableArray = Arguments.createArray();
    for (int i = 0; i < paramSparseArray.size(); i++) {
      WritableMap writableMap = a.a((b)paramSparseArray.valueAt(i), this.h, this.i, this.b, this.c, this.j, this.k);
      if (this.g.a() == 1) {
        a.a(writableMap, this.g.d(), this.h);
      } else {
        a.a(writableMap);
      } 
      writableArray.pushMap((ReadableMap)writableMap);
    } 
    return writableArray;
  }
  
  protected SparseArray<b> a(Void... paramVarArgs) {
    if (!isCancelled() && this.f != null) {
      b b1 = this.e;
      if (b1 != null && b1.a()) {
        a a1 = b.a(this.a, this.b, this.c, this.d);
        return this.e.a(a1);
      } 
    } 
    return null;
  }
  
  protected void a(SparseArray<b> paramSparseArray) {
    super.onPostExecute(paramSparseArray);
    if (paramSparseArray == null) {
      this.f.a(this.e);
      return;
    } 
    if (paramSparseArray.size() > 0)
      this.f.b(b(paramSparseArray)); 
    this.f.c();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/org/reactnative/camera/g/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */