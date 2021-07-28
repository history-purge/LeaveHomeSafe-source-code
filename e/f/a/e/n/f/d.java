package e.f.a.e.n.f;

import android.graphics.Point;
import android.graphics.Rect;
import android.util.SparseArray;
import androidx.annotation.RecentlyNonNull;
import e.f.a.e.i.n.c;
import e.f.a.e.i.n.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class d implements c {
  private i[] a;
  
  private Point[] b;
  
  private List<b> c;
  
  private String d;
  
  private Rect e;
  
  d(SparseArray<i> paramSparseArray) {
    this.a = new i[paramSparseArray.size()];
    int j = 0;
    while (true) {
      i[] arrayOfI = this.a;
      if (j < arrayOfI.length) {
        arrayOfI[j] = (i)paramSparseArray.valueAt(j);
        j++;
        continue;
      } 
      break;
    } 
  }
  
  @RecentlyNonNull
  public Rect a() {
    if (this.e == null)
      this.e = h.a(this); 
    return this.e;
  }
  
  @RecentlyNonNull
  public Point[] b() {
    d d1 = this;
    if (d1.b == null)
      if (d1.a.length == 0) {
        d1.b = new Point[0];
      } else {
        int j = Integer.MAX_VALUE;
        int k = 0;
        int m = Integer.MAX_VALUE;
        int n = Integer.MIN_VALUE;
        int i1 = Integer.MIN_VALUE;
        while (true) {
          Point[] arrayOfPoint2;
          i[] arrayOfI = this.a;
          if (k < arrayOfI.length) {
            c c2 = (arrayOfI[k]).d;
            c c3 = (arrayOfI[0]).d;
            int i4 = -c3.c;
            int i5 = -c3.d;
            double d4 = Math.sin(Math.toRadians(c3.g));
            double d5 = Math.cos(Math.toRadians(c3.g));
            arrayOfPoint2 = new Point[4];
            arrayOfPoint2[0] = new Point(c2.c, c2.d);
            arrayOfPoint2[0].offset(i4, i5);
            double d6 = (arrayOfPoint2[0]).x;
            Double.isNaN(d6);
            double d7 = (arrayOfPoint2[0]).y;
            Double.isNaN(d7);
            i4 = (int)(d6 * d5 + d7 * d4);
            d6 = -(arrayOfPoint2[0]).x;
            Double.isNaN(d6);
            d7 = (arrayOfPoint2[0]).y;
            Double.isNaN(d7);
            i5 = (int)(d6 * d4 + d7 * d5);
            (arrayOfPoint2[0]).x = i4;
            (arrayOfPoint2[0]).y = i5;
            arrayOfPoint2[1] = new Point(c2.e + i4, i5);
            arrayOfPoint2[2] = new Point(c2.e + i4, c2.f + i5);
            arrayOfPoint2[3] = new Point(i4, i5 + c2.f);
            for (i4 = 0; i4 < 4; i4++) {
              Point point1 = arrayOfPoint2[i4];
              j = Math.min(j, point1.x);
              n = Math.max(n, point1.x);
              m = Math.min(m, point1.y);
              i1 = Math.max(i1, point1.y);
            } 
            k++;
            continue;
          } 
          c c1 = ((i)arrayOfPoint2[0]).d;
          int i2 = c1.c;
          int i3 = c1.d;
          double d2 = Math.sin(Math.toRadians(c1.g));
          double d3 = Math.cos(Math.toRadians(c1.g));
          Point[] arrayOfPoint1 = new Point[4];
          Point point = new Point(j, m);
          k = 0;
          arrayOfPoint1[0] = point;
          arrayOfPoint1[1] = new Point(n, m);
          arrayOfPoint1[2] = new Point(n, i1);
          arrayOfPoint1[3] = new Point(j, i1);
          for (j = k; j < 4; j++) {
            double d4 = (arrayOfPoint1[j]).x;
            Double.isNaN(d4);
            double d5 = (arrayOfPoint1[j]).y;
            Double.isNaN(d5);
            k = (int)(d4 * d3 - d5 * d2);
            d4 = (arrayOfPoint1[j]).x;
            Double.isNaN(d4);
            d5 = (arrayOfPoint1[j]).y;
            Double.isNaN(d5);
            m = (int)(d4 * d2 + d5 * d3);
            (arrayOfPoint1[j]).x = k;
            (arrayOfPoint1[j]).y = m;
            arrayOfPoint1[j].offset(i2, i3);
          } 
          this.b = arrayOfPoint1;
          break;
        } 
      }  
    return this.b;
  }
  
  @RecentlyNonNull
  public String c() {
    String str2 = this.d;
    if (str2 != null)
      return str2; 
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    for (i i1 : this.a) {
      byte b;
      if (hashMap.containsKey(i1.i)) {
        b = ((Integer)hashMap.get(i1.i)).intValue();
      } else {
        b = 0;
      } 
      hashMap.put(i1.i, Integer.valueOf(b + 1));
    } 
    this.d = (String)((Map.Entry)Collections.<Map.Entry>max((Collection)hashMap.entrySet(), new f(this))).getKey();
    String str1 = this.d;
    if (str1 == null || str1.isEmpty())
      this.d = "und"; 
    return this.d;
  }
  
  @RecentlyNonNull
  public List<? extends c> getComponents() {
    i[] arrayOfI = this.a;
    int k = arrayOfI.length;
    int j = 0;
    if (k == 0)
      return new ArrayList<c>(0); 
    if (this.c == null) {
      this.c = new ArrayList<b>(arrayOfI.length);
      arrayOfI = this.a;
      k = arrayOfI.length;
      while (j < k) {
        i i1 = arrayOfI[j];
        this.c.add(new b(i1));
        j++;
      } 
    } 
    return (List)this.c;
  }
  
  @RecentlyNonNull
  public String getValue() {
    i[] arrayOfI = this.a;
    if (arrayOfI.length == 0)
      return ""; 
    StringBuilder stringBuilder = new StringBuilder((arrayOfI[0]).g);
    for (int j = 1; j < this.a.length; j++) {
      stringBuilder.append("\n");
      stringBuilder.append((this.a[j]).g);
    } 
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/n/f/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */