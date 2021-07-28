package e.f.c.y.c;

import e.f.c.j;
import e.f.c.p;
import e.f.c.q;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class e {
  private final e.f.c.s.b a;
  
  private final List<d> b;
  
  private boolean c;
  
  private final int[] d;
  
  private final q e;
  
  public e(e.f.c.s.b paramb, q paramq) {
    this.a = paramb;
    this.b = new ArrayList<d>();
    this.d = new int[5];
    this.e = paramq;
  }
  
  private float a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    e.f.c.s.b b1 = this.a;
    int k = b1.f();
    int[] arrayOfInt = b();
    int i;
    for (i = paramInt1; i >= 0 && b1.b(i, paramInt2); i--)
      arrayOfInt[2] = arrayOfInt[2] + 1; 
    int j = i;
    if (i < 0)
      return Float.NaN; 
    while (j >= 0 && !b1.b(j, paramInt2) && arrayOfInt[1] <= paramInt3) {
      arrayOfInt[1] = arrayOfInt[1] + 1;
      j--;
    } 
    if (j >= 0) {
      if (arrayOfInt[1] > paramInt3)
        return Float.NaN; 
      while (j >= 0 && b1.b(j, paramInt2) && arrayOfInt[0] <= paramInt3) {
        arrayOfInt[0] = arrayOfInt[0] + 1;
        j--;
      } 
      if (arrayOfInt[0] > paramInt3)
        return Float.NaN; 
      while (++paramInt1 < k && b1.b(paramInt1, paramInt2)) {
        arrayOfInt[2] = arrayOfInt[2] + 1;
        paramInt1++;
      } 
      i = paramInt1;
      if (paramInt1 == k)
        return Float.NaN; 
      while (i < k && !b1.b(i, paramInt2) && arrayOfInt[3] < paramInt3) {
        arrayOfInt[3] = arrayOfInt[3] + 1;
        i++;
      } 
      if (i != k) {
        if (arrayOfInt[3] >= paramInt3)
          return Float.NaN; 
        while (i < k && b1.b(i, paramInt2) && arrayOfInt[4] < paramInt3) {
          arrayOfInt[4] = arrayOfInt[4] + 1;
          i++;
        } 
        if (arrayOfInt[4] >= paramInt3)
          return Float.NaN; 
        if (Math.abs(arrayOfInt[0] + arrayOfInt[1] + arrayOfInt[2] + arrayOfInt[3] + arrayOfInt[4] - paramInt4) * 5 >= paramInt4)
          return Float.NaN; 
        if (c(arrayOfInt))
          return a(arrayOfInt, i); 
      } 
    } 
    return Float.NaN;
  }
  
  private static float a(int[] paramArrayOfint, int paramInt) {
    return (paramInt - paramArrayOfint[4] - paramArrayOfint[3]) - paramArrayOfint[2] / 2.0F;
  }
  
  private int a() {
    if (this.b.size() <= 1)
      return 0; 
    d d = null;
    for (d d1 : this.b) {
      if (d1.c() >= 2) {
        if (d == null) {
          d = d1;
          continue;
        } 
        this.c = true;
        return (int)(Math.abs(d.a() - d1.a()) - Math.abs(d.b() - d1.b())) / 2;
      } 
    } 
    return 0;
  }
  
  private boolean a(int paramInt1, int paramInt2) {
    int[] arrayOfInt = b();
    int i;
    for (i = 0; paramInt1 >= i && paramInt2 >= i && this.a.b(paramInt2 - i, paramInt1 - i); i++)
      arrayOfInt[2] = arrayOfInt[2] + 1; 
    if (arrayOfInt[2] == 0)
      return false; 
    while (paramInt1 >= i && paramInt2 >= i && !this.a.b(paramInt2 - i, paramInt1 - i)) {
      arrayOfInt[1] = arrayOfInt[1] + 1;
      i++;
    } 
    if (arrayOfInt[1] == 0)
      return false; 
    while (paramInt1 >= i && paramInt2 >= i && this.a.b(paramInt2 - i, paramInt1 - i)) {
      arrayOfInt[0] = arrayOfInt[0] + 1;
      i++;
    } 
    if (arrayOfInt[0] == 0)
      return false; 
    int k = this.a.c();
    int m = this.a.f();
    int j = 1;
    while (true) {
      int n = paramInt1 + j;
      i = j;
      if (n < k) {
        int i1 = paramInt2 + j;
        i = j;
        if (i1 < m) {
          i = j;
          if (this.a.b(i1, n)) {
            arrayOfInt[2] = arrayOfInt[2] + 1;
            j++;
            continue;
          } 
        } 
      } 
      break;
    } 
    while (true) {
      j = paramInt1 + i;
      if (j < k) {
        int n = paramInt2 + i;
        if (n < m && !this.a.b(n, j)) {
          arrayOfInt[3] = arrayOfInt[3] + 1;
          i++;
          continue;
        } 
      } 
      break;
    } 
    if (arrayOfInt[3] == 0)
      return false; 
    while (true) {
      j = paramInt1 + i;
      if (j < k) {
        int n = paramInt2 + i;
        if (n < m && this.a.b(n, j)) {
          arrayOfInt[4] = arrayOfInt[4] + 1;
          i++;
          continue;
        } 
      } 
      break;
    } 
    return (arrayOfInt[4] == 0) ? false : d(arrayOfInt);
  }
  
  private float b(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    e.f.c.s.b b1 = this.a;
    int k = b1.c();
    int[] arrayOfInt = b();
    int i;
    for (i = paramInt1; i >= 0 && b1.b(paramInt2, i); i--)
      arrayOfInt[2] = arrayOfInt[2] + 1; 
    int j = i;
    if (i < 0)
      return Float.NaN; 
    while (j >= 0 && !b1.b(paramInt2, j) && arrayOfInt[1] <= paramInt3) {
      arrayOfInt[1] = arrayOfInt[1] + 1;
      j--;
    } 
    if (j >= 0) {
      if (arrayOfInt[1] > paramInt3)
        return Float.NaN; 
      while (j >= 0 && b1.b(paramInt2, j) && arrayOfInt[0] <= paramInt3) {
        arrayOfInt[0] = arrayOfInt[0] + 1;
        j--;
      } 
      if (arrayOfInt[0] > paramInt3)
        return Float.NaN; 
      while (++paramInt1 < k && b1.b(paramInt2, paramInt1)) {
        arrayOfInt[2] = arrayOfInt[2] + 1;
        paramInt1++;
      } 
      i = paramInt1;
      if (paramInt1 == k)
        return Float.NaN; 
      while (i < k && !b1.b(paramInt2, i) && arrayOfInt[3] < paramInt3) {
        arrayOfInt[3] = arrayOfInt[3] + 1;
        i++;
      } 
      if (i != k) {
        if (arrayOfInt[3] >= paramInt3)
          return Float.NaN; 
        while (i < k && b1.b(paramInt2, i) && arrayOfInt[4] < paramInt3) {
          arrayOfInt[4] = arrayOfInt[4] + 1;
          i++;
        } 
        if (arrayOfInt[4] >= paramInt3)
          return Float.NaN; 
        if (Math.abs(arrayOfInt[0] + arrayOfInt[1] + arrayOfInt[2] + arrayOfInt[3] + arrayOfInt[4] - paramInt4) * 5 >= paramInt4 * 2)
          return Float.NaN; 
        if (c(arrayOfInt))
          return a(arrayOfInt, i); 
      } 
    } 
    return Float.NaN;
  }
  
  private int[] b() {
    a(this.d);
    return this.d;
  }
  
  private boolean c() {
    int j = this.b.size();
    Iterator<d> iterator = this.b.iterator();
    float f2 = 0.0F;
    int i = 0;
    float f1 = 0.0F;
    while (iterator.hasNext()) {
      d d = iterator.next();
      if (d.c() >= 2) {
        i++;
        f1 += d.d();
      } 
    } 
    if (i < 3)
      return false; 
    float f3 = f1 / j;
    iterator = this.b.iterator();
    while (iterator.hasNext())
      f2 += Math.abs(((d)iterator.next()).d() - f3); 
    return (f2 <= f1 * 0.05F);
  }
  
  protected static boolean c(int[] paramArrayOfint) {
    int i = 0;
    int j = 0;
    while (i < 5) {
      int k = paramArrayOfint[i];
      if (k == 0)
        return false; 
      j += k;
      i++;
    } 
    if (j < 7)
      return false; 
    float f1 = j / 7.0F;
    float f2 = f1 / 2.0F;
    return (Math.abs(f1 - paramArrayOfint[0]) < f2 && Math.abs(f1 - paramArrayOfint[1]) < f2 && Math.abs(f1 * 3.0F - paramArrayOfint[2]) < 3.0F * f2 && Math.abs(f1 - paramArrayOfint[3]) < f2 && Math.abs(f1 - paramArrayOfint[4]) < f2);
  }
  
  protected static boolean d(int[] paramArrayOfint) {
    int i = 0;
    int j = 0;
    while (i < 5) {
      int k = paramArrayOfint[i];
      if (k == 0)
        return false; 
      j += k;
      i++;
    } 
    if (j < 7)
      return false; 
    float f1 = j / 7.0F;
    float f2 = f1 / 1.333F;
    return (Math.abs(f1 - paramArrayOfint[0]) < f2 && Math.abs(f1 - paramArrayOfint[1]) < f2 && Math.abs(f1 * 3.0F - paramArrayOfint[2]) < 3.0F * f2 && Math.abs(f1 - paramArrayOfint[3]) < f2 && Math.abs(f1 - paramArrayOfint[4]) < f2);
  }
  
  private d[] d() {
    int i = this.b.size();
    if (i >= 3) {
      float f = 0.0F;
      if (i > 3) {
        Iterator<d> iterator = this.b.iterator();
        float f2 = 0.0F;
        float f1;
        for (f1 = 0.0F; iterator.hasNext(); f1 += f4 * f4) {
          float f4 = ((d)iterator.next()).d();
          f2 += f4;
        } 
        float f3 = i;
        f2 /= f3;
        f1 = (float)Math.sqrt((f1 / f3 - f2 * f2));
        Collections.sort(this.b, new c(f2, null));
        f1 = Math.max(0.2F * f2, f1);
        for (i = 0; i < this.b.size() && this.b.size() > 3; i = k + 1) {
          int k = i;
          if (Math.abs(((d)this.b.get(i)).d() - f2) > f1) {
            this.b.remove(i);
            k = i - 1;
          } 
        } 
      } 
      if (this.b.size() > 3) {
        Iterator<d> iterator = this.b.iterator();
        float f1;
        for (f1 = f; iterator.hasNext(); f1 += ((d)iterator.next()).d());
        f1 /= this.b.size();
        Collections.sort(this.b, new b(f1, null));
        List<d> list = this.b;
        list.subList(3, list.size()).clear();
      } 
      return new d[] { this.b.get(0), this.b.get(1), this.b.get(2) };
    } 
    j j = j.a();
    throw j;
  }
  
  final f a(Map<e.f.c.e, ?> paramMap) {
    int j;
    if (paramMap != null && paramMap.containsKey(e.f.c.e.f)) {
      j = 1;
    } else {
      j = 0;
    } 
    int m = this.a.c();
    int n = this.a.f();
    int i = m * 3 / 388;
    if (i < 3 || j)
      i = 3; 
    int[] arrayOfInt = new int[5];
    int k = i - 1;
    boolean bool = false;
    while (k < m && !bool) {
      a(arrayOfInt);
      j = 0;
      int i2 = 0;
      int i1 = i;
      i = i2;
      while (j < n) {
        if (this.a.b(j, k)) {
          i2 = i;
          if ((i & 0x1) == 1)
            i2 = i + 1; 
          arrayOfInt[i2] = arrayOfInt[i2] + 1;
          i = i2;
        } else if ((i & 0x1) == 0) {
          if (i == 4) {
            if (c(arrayOfInt) && a(arrayOfInt, k, j)) {
              boolean bool1;
              if (this.c) {
                bool1 = c();
                i = k;
              } else {
                i1 = a();
                i = k;
                bool1 = bool;
                if (i1 > arrayOfInt[2]) {
                  i = k + i1 - arrayOfInt[2] - 2;
                  j = n - 1;
                  bool1 = bool;
                } 
              } 
              a(arrayOfInt);
              i2 = 0;
              i1 = 2;
              k = i;
              i = i2;
              bool = bool1;
            } else {
              b(arrayOfInt);
              i = 3;
            } 
          } else {
            arrayOfInt[++i] = arrayOfInt[i] + 1;
          } 
        } else {
          arrayOfInt[i] = arrayOfInt[i] + 1;
        } 
        j++;
      } 
      if (c(arrayOfInt) && a(arrayOfInt, k, n)) {
        i = arrayOfInt[0];
        if (this.c)
          bool = c(); 
      } else {
        i = i1;
      } 
      k += i;
    } 
    d[] arrayOfD = d();
    p.a((p[])arrayOfD);
    return new f(arrayOfD);
  }
  
  protected final void a(int[] paramArrayOfint) {
    for (int i = 0; i < paramArrayOfint.length; i++)
      paramArrayOfint[i] = 0; 
  }
  
  protected final boolean a(int[] paramArrayOfint, int paramInt1, int paramInt2) {
    boolean bool = false;
    int i = paramArrayOfint[0] + paramArrayOfint[1] + paramArrayOfint[2] + paramArrayOfint[3] + paramArrayOfint[4];
    paramInt2 = (int)a(paramArrayOfint, paramInt2);
    float f = b(paramInt1, paramInt2, paramArrayOfint[2], i);
    if (!Float.isNaN(f)) {
      paramInt1 = (int)f;
      float f1 = a(paramInt2, paramInt1, paramArrayOfint[2], i);
      if (!Float.isNaN(f1) && a(paramInt1, (int)f1)) {
        float f2 = i / 7.0F;
        paramInt1 = 0;
        while (true) {
          paramInt2 = bool;
          if (paramInt1 < this.b.size()) {
            d d = this.b.get(paramInt1);
            if (d.a(f2, f, f1)) {
              this.b.set(paramInt1, d.b(f, f1, f2));
              paramInt2 = 1;
              break;
            } 
            paramInt1++;
            continue;
          } 
          break;
        } 
        if (paramInt2 == 0) {
          d d = new d(f1, f, f2);
          this.b.add(d);
          q q1 = this.e;
          if (q1 != null)
            q1.a(d); 
        } 
        return true;
      } 
    } 
    return false;
  }
  
  protected final void b(int[] paramArrayOfint) {
    paramArrayOfint[0] = paramArrayOfint[2];
    paramArrayOfint[1] = paramArrayOfint[3];
    paramArrayOfint[2] = paramArrayOfint[4];
    paramArrayOfint[3] = 1;
    paramArrayOfint[4] = 0;
  }
  
  private static final class b implements Serializable, Comparator<d> {
    private final float average;
    
    private b(float param1Float) {
      this.average = param1Float;
    }
    
    public int a(d param1d1, d param1d2) {
      int i = Integer.compare(param1d2.c(), param1d1.c());
      return (i == 0) ? Float.compare(Math.abs(param1d1.d() - this.average), Math.abs(param1d2.d() - this.average)) : i;
    }
  }
  
  private static final class c implements Serializable, Comparator<d> {
    private final float average;
    
    private c(float param1Float) {
      this.average = param1Float;
    }
    
    public int a(d param1d1, d param1d2) {
      return Float.compare(Math.abs(param1d2.d() - this.average), Math.abs(param1d1.d() - this.average));
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/c/y/c/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */