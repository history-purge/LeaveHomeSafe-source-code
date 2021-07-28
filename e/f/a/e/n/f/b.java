package e.f.a.e.n.f;

import android.graphics.Point;
import android.graphics.Rect;
import androidx.annotation.RecentlyNonNull;
import e.f.a.e.i.n.i;
import e.f.a.e.i.n.p;
import java.util.ArrayList;
import java.util.List;

public class b implements c {
  private i a;
  
  private List<a> b;
  
  b(i parami) {
    this.a = parami;
  }
  
  @RecentlyNonNull
  public Rect a() {
    return h.a(this);
  }
  
  @RecentlyNonNull
  public Point[] b() {
    return h.a(this.a.d);
  }
  
  @RecentlyNonNull
  public String c() {
    return this.a.i;
  }
  
  @RecentlyNonNull
  public List<? extends c> getComponents() {
    p[] arrayOfP = this.a.c;
    int k = arrayOfP.length;
    int j = 0;
    if (k == 0)
      return new ArrayList<c>(0); 
    if (this.b == null) {
      this.b = new ArrayList<a>(arrayOfP.length);
      arrayOfP = this.a.c;
      k = arrayOfP.length;
      while (j < k) {
        p p = arrayOfP[j];
        this.b.add(new a(p));
        j++;
      } 
    } 
    return (List)this.b;
  }
  
  @RecentlyNonNull
  public String getValue() {
    return this.a.g;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/n/f/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */