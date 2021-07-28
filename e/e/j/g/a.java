package e.e.j.g;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

public class a {
  a a;
  
  final float b;
  
  boolean c;
  
  boolean d;
  
  long e;
  
  float f;
  
  float g;
  
  public a(Context paramContext) {
    this.b = ViewConfiguration.get(paramContext).getScaledTouchSlop();
    a();
  }
  
  public static a a(Context paramContext) {
    return new a(paramContext);
  }
  
  public void a() {
    this.a = null;
    c();
  }
  
  public void a(a parama) {
    this.a = parama;
  }
  
  public boolean a(MotionEvent paramMotionEvent) {
    a a1;
    int i = paramMotionEvent.getAction();
    if (i != 0) {
      if (i != 1) {
        if (i != 2) {
          if (i != 3)
            return true; 
          this.c = false;
          this.d = false;
          return true;
        } 
        if (Math.abs(paramMotionEvent.getX() - this.f) > this.b || Math.abs(paramMotionEvent.getY() - this.g) > this.b) {
          this.d = false;
          return true;
        } 
      } else {
        this.c = false;
        if (Math.abs(paramMotionEvent.getX() - this.f) > this.b || Math.abs(paramMotionEvent.getY() - this.g) > this.b)
          this.d = false; 
        if (this.d && paramMotionEvent.getEventTime() - this.e <= ViewConfiguration.getLongPressTimeout()) {
          a1 = this.a;
          if (a1 != null)
            a1.e(); 
        } 
        this.d = false;
        return true;
      } 
    } else {
      this.c = true;
      this.d = true;
      this.e = a1.getEventTime();
      this.f = a1.getX();
      this.g = a1.getY();
    } 
    return true;
  }
  
  public boolean b() {
    return this.c;
  }
  
  public void c() {
    this.c = false;
    this.d = false;
  }
  
  public static interface a {
    boolean e();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/j/g/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */