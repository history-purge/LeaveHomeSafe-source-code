package b.e.b;

import java.util.Arrays;

public class j implements b.a {
  private static float m = 0.001F;
  
  private int a = 16;
  
  private int b = 16;
  
  int[] c;
  
  int[] d;
  
  int[] e;
  
  float[] f;
  
  int[] g;
  
  int[] h;
  
  int i;
  
  int j;
  
  private final b k;
  
  protected final c l;
  
  j(b paramb, c paramc) {
    int i = this.a;
    this.c = new int[i];
    this.d = new int[i];
    this.e = new int[i];
    this.f = new float[i];
    this.g = new int[i];
    this.h = new int[i];
    this.i = 0;
    this.j = -1;
    this.k = paramb;
    this.l = paramc;
    clear();
  }
  
  private void a(int paramInt, i parami, float paramFloat) {
    this.e[paramInt] = parami.c;
    this.f[paramInt] = paramFloat;
    this.g[paramInt] = -1;
    this.h[paramInt] = -1;
    parami.a(this.k);
    parami.m++;
    this.i++;
  }
  
  private void a(i parami, int paramInt) {
    int n = parami.c % this.b;
    int[] arrayOfInt = this.c;
    int m = arrayOfInt[n];
    int k = m;
    if (m == -1) {
      arrayOfInt[n] = paramInt;
    } else {
      while (true) {
        arrayOfInt = this.d;
        if (arrayOfInt[k] != -1) {
          k = arrayOfInt[k];
          continue;
        } 
        arrayOfInt[k] = paramInt;
        this.d[paramInt] = -1;
        return;
      } 
    } 
    this.d[paramInt] = -1;
  }
  
  private void b(int paramInt, i parami, float paramFloat) {
    int k = c();
    a(k, parami, paramFloat);
    if (paramInt != -1) {
      this.g[k] = paramInt;
      int[] arrayOfInt1 = this.h;
      arrayOfInt1[k] = arrayOfInt1[paramInt];
      arrayOfInt1[paramInt] = k;
    } else {
      this.g[k] = -1;
      if (this.i > 0) {
        this.h[k] = this.j;
        this.j = k;
      } else {
        this.h[k] = -1;
      } 
    } 
    int[] arrayOfInt = this.h;
    if (arrayOfInt[k] != -1)
      this.g[arrayOfInt[k]] = k; 
    a(parami, k);
  }
  
  private int c() {
    for (int i = 0; i < this.a; i++) {
      if (this.e[i] == -1)
        return i; 
    } 
    return -1;
  }
  
  private void d() {
    int k = this.a * 2;
    this.e = Arrays.copyOf(this.e, k);
    this.f = Arrays.copyOf(this.f, k);
    this.g = Arrays.copyOf(this.g, k);
    this.h = Arrays.copyOf(this.h, k);
    this.d = Arrays.copyOf(this.d, k);
    for (int i = this.a; i < k; i++) {
      this.e[i] = -1;
      this.d[i] = -1;
    } 
    this.a = k;
  }
  
  private void d(i parami) {
    int n = parami.c;
    int i1 = n % this.b;
    int[] arrayOfInt = this.c;
    int m = arrayOfInt[i1];
    if (m == -1)
      return; 
    int k = m;
    if (this.e[m] == n) {
      int[] arrayOfInt1 = this.d;
      arrayOfInt[i1] = arrayOfInt1[m];
      arrayOfInt1[m] = -1;
      return;
    } 
    while (true) {
      arrayOfInt = this.d;
      if (arrayOfInt[k] != -1 && this.e[arrayOfInt[k]] != n) {
        k = arrayOfInt[k];
        continue;
      } 
      break;
    } 
    arrayOfInt = this.d;
    m = arrayOfInt[k];
    if (m != -1 && this.e[m] == n) {
      arrayOfInt[k] = arrayOfInt[m];
      arrayOfInt[m] = -1;
    } 
  }
  
  public float a(int paramInt) {
    int m = this.i;
    int k = this.j;
    for (int i = 0; i < m; i++) {
      if (i == paramInt)
        return this.f[k]; 
      k = this.h[k];
      if (k == -1)
        break; 
    } 
    return 0.0F;
  }
  
  public float a(b paramb, boolean paramBoolean) {
    float f = a(paramb.a);
    a(paramb.a, paramBoolean);
    j j1 = (j)paramb.e;
    int m = j1.a();
    int i = j1.j;
    int k = 0;
    i = 0;
    while (k < m) {
      int[] arrayOfInt = j1.e;
      int n = k;
      if (arrayOfInt[i] != -1) {
        float f1 = j1.f[i];
        a(this.l.d[arrayOfInt[i]], f1 * f, paramBoolean);
        n = k + 1;
      } 
      i++;
      k = n;
    } 
    return f;
  }
  
  public float a(i parami) {
    int k = c(parami);
    return (k != -1) ? this.f[k] : 0.0F;
  }
  
  public float a(i parami, boolean paramBoolean) {
    int k = c(parami);
    if (k == -1)
      return 0.0F; 
    d(parami);
    float f = this.f[k];
    if (this.j == k)
      this.j = this.h[k]; 
    this.e[k] = -1;
    int[] arrayOfInt = this.g;
    if (arrayOfInt[k] != -1) {
      int[] arrayOfInt1 = this.h;
      arrayOfInt1[arrayOfInt[k]] = arrayOfInt1[k];
    } 
    arrayOfInt = this.h;
    if (arrayOfInt[k] != -1) {
      int[] arrayOfInt1 = this.g;
      arrayOfInt1[arrayOfInt[k]] = arrayOfInt1[k];
    } 
    this.i--;
    parami.m--;
    if (paramBoolean)
      parami.b(this.k); 
    return f;
  }
  
  public int a() {
    return this.i;
  }
  
  public void a(float paramFloat) {
    int m = this.i;
    int k = this.j;
    for (int i = 0; i < m; i++) {
      float[] arrayOfFloat = this.f;
      arrayOfFloat[k] = arrayOfFloat[k] / paramFloat;
      k = this.h[k];
      if (k == -1)
        return; 
    } 
  }
  
  public void a(i parami, float paramFloat) {
    int i1;
    float f = m;
    if (paramFloat > -f && paramFloat < f) {
      a(parami, true);
      return;
    } 
    int k = this.i;
    int n = 0;
    if (k == 0) {
      a(0, parami, paramFloat);
      a(parami, 0);
      this.j = 0;
      return;
    } 
    k = c(parami);
    if (k != -1) {
      this.f[k] = paramFloat;
      return;
    } 
    if (this.i + 1 >= this.a)
      d(); 
    int i2 = this.i;
    k = this.j;
    int m = -1;
    while (true) {
      i1 = m;
      if (n < i2) {
        int[] arrayOfInt = this.e;
        int i3 = arrayOfInt[k];
        i1 = parami.c;
        if (i3 == i1) {
          this.f[k] = paramFloat;
          return;
        } 
        if (arrayOfInt[k] < i1)
          m = k; 
        k = this.h[k];
        if (k == -1) {
          i1 = m;
          break;
        } 
        n++;
        continue;
      } 
      break;
    } 
    b(i1, parami, paramFloat);
  }
  
  public void a(i parami, float paramFloat, boolean paramBoolean) {
    float f = m;
    if (paramFloat > -f && paramFloat < f)
      return; 
    int k = c(parami);
    if (k == -1) {
      a(parami, paramFloat);
      return;
    } 
    float[] arrayOfFloat = this.f;
    arrayOfFloat[k] = arrayOfFloat[k] + paramFloat;
    paramFloat = arrayOfFloat[k];
    f = m;
    if (paramFloat > -f && arrayOfFloat[k] < f) {
      arrayOfFloat[k] = 0.0F;
      a(parami, paramBoolean);
    } 
  }
  
  public i b(int paramInt) {
    int m = this.i;
    if (m == 0)
      return null; 
    int k = this.j;
    for (int i = 0; i < m; i++) {
      if (i == paramInt && k != -1)
        return this.l.d[this.e[k]]; 
      k = this.h[k];
      if (k == -1)
        return null; 
    } 
    return null;
  }
  
  public void b() {
    int m = this.i;
    int k = this.j;
    for (int i = 0; i < m; i++) {
      float[] arrayOfFloat = this.f;
      arrayOfFloat[k] = arrayOfFloat[k] * -1.0F;
      k = this.h[k];
      if (k == -1)
        return; 
    } 
  }
  
  public boolean b(i parami) {
    return (c(parami) != -1);
  }
  
  public int c(i parami) {
    if (this.i == 0)
      return -1; 
    int n = parami.c;
    int k = this.b;
    int m = this.c[n % k];
    if (m == -1)
      return -1; 
    k = m;
    if (this.e[m] == n)
      return m; 
    while (true) {
      int[] arrayOfInt1 = this.d;
      if (arrayOfInt1[k] != -1 && this.e[arrayOfInt1[k]] != n) {
        k = arrayOfInt1[k];
        continue;
      } 
      break;
    } 
    int[] arrayOfInt = this.d;
    return (arrayOfInt[k] == -1) ? -1 : ((this.e[arrayOfInt[k]] == n) ? arrayOfInt[k] : -1);
  }
  
  public void clear() {
    int k = this.i;
    int i;
    for (i = 0; i < k; i++) {
      i i1 = b(i);
      if (i1 != null)
        i1.b(this.k); 
    } 
    for (i = 0; i < this.a; i++) {
      this.e[i] = -1;
      this.d[i] = -1;
    } 
    for (i = 0; i < this.b; i++)
      this.c[i] = -1; 
    this.i = 0;
    this.j = -1;
  }
  
  public String toString() {
    StringBuilder stringBuilder1 = new StringBuilder();
    stringBuilder1.append(hashCode());
    stringBuilder1.append(" { ");
    String str = stringBuilder1.toString();
    int k = this.i;
    for (int i = 0; i < k; i++) {
      i i1 = b(i);
      if (i1 != null) {
        StringBuilder stringBuilder3;
        StringBuilder stringBuilder6 = new StringBuilder();
        stringBuilder6.append(str);
        stringBuilder6.append(i1);
        stringBuilder6.append(" = ");
        stringBuilder6.append(a(i));
        stringBuilder6.append(" ");
        str = stringBuilder6.toString();
        int m = c(i1);
        StringBuilder stringBuilder5 = new StringBuilder();
        stringBuilder5.append(str);
        stringBuilder5.append("[p: ");
        String str1 = stringBuilder5.toString();
        if (this.g[m] != -1) {
          stringBuilder3 = new StringBuilder();
          stringBuilder3.append(str1);
          stringBuilder3.append(this.l.d[this.e[this.g[m]]]);
        } else {
          stringBuilder3 = new StringBuilder();
          stringBuilder3.append(str1);
          stringBuilder3.append("none");
        } 
        str = stringBuilder3.toString();
        StringBuilder stringBuilder4 = new StringBuilder();
        stringBuilder4.append(str);
        stringBuilder4.append(", n: ");
        str = stringBuilder4.toString();
        if (this.h[m] != -1) {
          stringBuilder4 = new StringBuilder();
          stringBuilder4.append(str);
          stringBuilder4.append(this.l.d[this.e[this.h[m]]]);
          str = stringBuilder4.toString();
        } else {
          stringBuilder4 = new StringBuilder();
          stringBuilder4.append(str);
          stringBuilder4.append("none");
          str = stringBuilder4.toString();
        } 
        stringBuilder4 = new StringBuilder();
        stringBuilder4.append(str);
        stringBuilder4.append("]");
        str = stringBuilder4.toString();
      } 
    } 
    StringBuilder stringBuilder2 = new StringBuilder();
    stringBuilder2.append(str);
    stringBuilder2.append(" }");
    return stringBuilder2.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/e/b/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */