package e.f.a.e.n.f;

import android.graphics.Point;
import android.graphics.Rect;
import e.f.a.e.i.n.c;

final class h {
  static Rect a(c paramc) {
    Point[] arrayOfPoint = paramc.b();
    int i1 = arrayOfPoint.length;
    int n = Integer.MAX_VALUE;
    int j = 0;
    int m = Integer.MAX_VALUE;
    int k = Integer.MIN_VALUE;
    int i = Integer.MIN_VALUE;
    while (j < i1) {
      Point point = arrayOfPoint[j];
      n = Math.min(n, point.x);
      k = Math.max(k, point.x);
      m = Math.min(m, point.y);
      i = Math.max(i, point.y);
      j++;
    } 
    return new Rect(n, m, k, i);
  }
  
  static Point[] a(c paramc) {
    Point[] arrayOfPoint = new Point[4];
    double d2 = Math.sin(Math.toRadians(paramc.g));
    double d1 = Math.cos(Math.toRadians(paramc.g));
    arrayOfPoint[0] = new Point(paramc.c, paramc.d);
    double d3 = paramc.c;
    int i = paramc.e;
    double d4 = i;
    Double.isNaN(d4);
    Double.isNaN(d3);
    int j = (int)(d3 + d4 * d1);
    d3 = paramc.d;
    d4 = i;
    Double.isNaN(d4);
    Double.isNaN(d3);
    arrayOfPoint[1] = new Point(j, (int)(d3 + d4 * d2));
    d3 = (arrayOfPoint[1]).x;
    i = paramc.f;
    d4 = i;
    Double.isNaN(d4);
    Double.isNaN(d3);
    j = (int)(d3 - d4 * d2);
    d2 = (arrayOfPoint[1]).y;
    d3 = i;
    Double.isNaN(d3);
    Double.isNaN(d2);
    arrayOfPoint[2] = new Point(j, (int)(d2 + d3 * d1));
    arrayOfPoint[3] = new Point((arrayOfPoint[0]).x + (arrayOfPoint[2]).x - (arrayOfPoint[1]).x, (arrayOfPoint[0]).y + (arrayOfPoint[2]).y - (arrayOfPoint[1]).y);
    return arrayOfPoint;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/n/f/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */