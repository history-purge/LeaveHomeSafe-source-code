package com.th3rdwave.safeareacontext;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.c1;
import com.facebook.react.uimanager.e1.b;
import com.facebook.react.uimanager.i;
import com.facebook.react.uimanager.n;
import com.facebook.react.uimanager.q;
import java.util.EnumSet;

public class k extends i {
  private i B;
  
  private float[] C;
  
  private float[] D;
  
  private boolean E;
  
  public k() {
    int j = 0;
    this.E = false;
    int[] arrayOfInt = c1.b;
    this.C = new float[arrayOfInt.length];
    this.D = new float[arrayOfInt.length];
    while (j < c1.b.length) {
      this.C[j] = Float.NaN;
      this.D[j] = Float.NaN;
      j++;
    } 
  }
  
  private void Q() {
    float f1;
    float f2;
    float f3;
    float[] arrayOfFloat;
    i i1 = this.B;
    if (i1 == null)
      return; 
    if (i1.c() == j.c) {
      arrayOfFloat = this.C;
    } else {
      arrayOfFloat = this.D;
    } 
    float f4 = arrayOfFloat[8];
    boolean bool = Float.isNaN(f4);
    float f5 = 0.0F;
    if (!bool) {
      f3 = f4;
      f1 = f3;
      f2 = f1;
    } else {
      f4 = 0.0F;
      f3 = 0.0F;
      f1 = 0.0F;
      f2 = 0.0F;
    } 
    float f6 = arrayOfFloat[7];
    if (!Float.isNaN(f6)) {
      f4 = f6;
      f1 = f4;
    } 
    f6 = arrayOfFloat[6];
    if (!Float.isNaN(f6)) {
      f3 = f6;
      f2 = f3;
    } 
    f6 = arrayOfFloat[1];
    if (!Float.isNaN(f6))
      f4 = f6; 
    f6 = arrayOfFloat[2];
    if (!Float.isNaN(f6))
      f3 = f6; 
    f6 = arrayOfFloat[3];
    if (!Float.isNaN(f6))
      f1 = f6; 
    f6 = arrayOfFloat[0];
    if (!Float.isNaN(f6))
      f2 = f6; 
    f6 = q.b(f4);
    float f7 = q.b(f3);
    float f8 = q.b(f1);
    float f9 = q.b(f2);
    EnumSet<h> enumSet = this.B.a();
    a a = this.B.b();
    if (enumSet.contains(h.c)) {
      f1 = a.a;
    } else {
      f1 = 0.0F;
    } 
    if (enumSet.contains(h.d)) {
      f2 = a.b;
    } else {
      f2 = 0.0F;
    } 
    if (enumSet.contains(h.e)) {
      f3 = a.c;
    } else {
      f3 = 0.0F;
    } 
    f4 = f5;
    if (enumSet.contains(h.f))
      f4 = a.d; 
    j j1 = this.B.c();
    j j2 = j.c;
    f1 += f6;
    if (j1 == j2) {
      e(1, f1);
      e(2, f2 + f7);
      e(3, f3 + f8);
      e(0, f4 + f9);
      return;
    } 
    c(1, f1);
    c(2, f2 + f7);
    c(3, f3 + f8);
    c(0, f4 + f9);
  }
  
  private void a(j paramj) {
    if (paramj == j.c) {
      e(1, this.C[1]);
      e(2, this.C[1]);
      e(3, this.C[3]);
      e(0, this.C[0]);
      return;
    } 
    c(1, this.D[1]);
    c(2, this.D[1]);
    c(3, this.D[3]);
    c(0, this.D[0]);
  }
  
  public void a(n paramn) {
    if (this.E) {
      this.E = false;
      Q();
    } 
  }
  
  public void a(Object paramObject) {
    if (!(paramObject instanceof i))
      return; 
    paramObject = paramObject;
    i i1 = this.B;
    if (i1 != null && i1.c() != paramObject.c())
      a(this.B.c()); 
    this.B = (i)paramObject;
    this.E = false;
    Q();
  }
  
  @b(names = {"margin", "marginVertical", "marginHorizontal", "marginStart", "marginEnd", "marginTop", "marginBottom", "marginLeft", "marginRight"})
  public void setMargins(int paramInt, Dynamic paramDynamic) {
    float f;
    int j = c1.b[paramInt];
    float[] arrayOfFloat = this.D;
    if (paramDynamic.getType() == ReadableType.Number) {
      f = (float)paramDynamic.asDouble();
    } else {
      f = Float.NaN;
    } 
    arrayOfFloat[j] = f;
    super.setMargins(paramInt, paramDynamic);
    this.E = true;
  }
  
  @b(names = {"padding", "paddingVertical", "paddingHorizontal", "paddingStart", "paddingEnd", "paddingTop", "paddingBottom", "paddingLeft", "paddingRight"})
  public void setPaddings(int paramInt, Dynamic paramDynamic) {
    float f;
    int j = c1.b[paramInt];
    float[] arrayOfFloat = this.C;
    if (paramDynamic.getType() == ReadableType.Number) {
      f = (float)paramDynamic.asDouble();
    } else {
      f = Float.NaN;
    } 
    arrayOfFloat[j] = f;
    super.setPaddings(paramInt, paramDynamic);
    this.E = true;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/th3rdwave/safeareacontext/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */