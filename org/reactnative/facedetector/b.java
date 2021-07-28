package org.reactnative.facedetector;

import android.content.Context;
import android.util.SparseArray;
import e.f.a.e.n.e.c;
import k.b.b.a;
import org.reactnative.camera.h.a;

public class b {
  public static int h = 1;
  
  public static int i = 0;
  
  public static int j = 1;
  
  public static int k = 0;
  
  public static int l = 1;
  
  public static int m;
  
  private c a = null;
  
  private a b;
  
  private c.a c = null;
  
  private int d = i;
  
  private int e = k;
  
  private float f = 0.15F;
  
  private int g = m;
  
  public b(Context paramContext) {
    this.c = new c.a(paramContext);
    this.c.a(this.f);
    this.c.c(this.g);
    this.c.b(this.e);
    this.c.a(this.d);
  }
  
  private void c() {
    this.a = this.c.a();
  }
  
  private void d() {
    c c1 = this.a;
    if (c1 != null) {
      c1.a();
      this.a = null;
    } 
  }
  
  public SparseArray<e.f.a.e.n.e.b> a(a parama) {
    if (!parama.a().equals(this.b))
      d(); 
    if (this.a == null) {
      c();
      this.b = parama.a();
    } 
    return this.a.a(parama.b());
  }
  
  public void a(int paramInt) {
    if (paramInt != this.d) {
      b();
      this.c.a(paramInt);
      this.d = paramInt;
    } 
  }
  
  public void a(boolean paramBoolean) {
    b();
    this.c.a(paramBoolean);
  }
  
  public boolean a() {
    if (this.a == null)
      c(); 
    return this.a.b();
  }
  
  public void b() {
    d();
    this.b = null;
  }
  
  public void b(int paramInt) {
    if (paramInt != this.e) {
      b();
      this.c.b(paramInt);
      this.e = paramInt;
    } 
  }
  
  public void c(int paramInt) {
    if (paramInt != this.g) {
      b();
      this.c.c(paramInt);
      this.g = paramInt;
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/org/reactnative/facedetector/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */