package e.f.a.e.n.e;

import android.graphics.PointF;
import androidx.annotation.RecentlyNonNull;
import java.util.Arrays;
import java.util.List;

public class b {
  private int a;
  
  private PointF b;
  
  private float c;
  
  private float d;
  
  private float e;
  
  private float f;
  
  private List<d> g;
  
  private float h;
  
  private float i;
  
  private float j;
  
  public b(int paramInt, @RecentlyNonNull PointF paramPointF, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, @RecentlyNonNull d[] paramArrayOfd, @RecentlyNonNull a[] paramArrayOfa, float paramFloat6, float paramFloat7, float paramFloat8, float paramFloat9) {
    this.a = paramInt;
    this.b = paramPointF;
    this.c = paramFloat1;
    this.d = paramFloat2;
    this.e = paramFloat3;
    this.f = paramFloat4;
    this.g = Arrays.asList(paramArrayOfd);
    Arrays.asList(paramArrayOfa);
    this.h = a(paramFloat6);
    this.i = a(paramFloat7);
    this.j = a(paramFloat8);
    a(paramFloat9);
  }
  
  private static float a(float paramFloat) {
    return (paramFloat >= 0.0F && paramFloat <= 1.0F) ? paramFloat : -1.0F;
  }
  
  public float a() {
    return this.e;
  }
  
  public float b() {
    return this.f;
  }
  
  public float c() {
    return this.d;
  }
  
  public int d() {
    return this.a;
  }
  
  public float e() {
    return this.h;
  }
  
  public float f() {
    return this.i;
  }
  
  public float g() {
    return this.j;
  }
  
  @RecentlyNonNull
  public List<d> h() {
    return this.g;
  }
  
  @RecentlyNonNull
  public PointF i() {
    PointF pointF = this.b;
    return new PointF(pointF.x - this.c / 2.0F, pointF.y - this.d / 2.0F);
  }
  
  public float j() {
    return this.c;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/n/e/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */