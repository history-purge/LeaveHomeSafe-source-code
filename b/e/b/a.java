package b.e.b;

import java.util.Arrays;

public class a implements b.a {
  private static float l = 0.001F;
  
  int a = 0;
  
  private final b b;
  
  protected final c c;
  
  private int d = 8;
  
  private i e = null;
  
  private int[] f;
  
  private int[] g;
  
  private float[] h;
  
  private int i;
  
  private int j;
  
  private boolean k;
  
  a(b paramb, c paramc) {
    int j = this.d;
    this.f = new int[j];
    this.g = new int[j];
    this.h = new float[j];
    this.i = -1;
    this.j = -1;
    this.k = false;
    this.b = paramb;
    this.c = paramc;
  }
  
  public float a(int paramInt) {
    int k = this.i;
    for (int j = 0; k != -1 && j < this.a; j++) {
      if (j == paramInt)
        return this.h[k]; 
      k = this.g[k];
    } 
    return 0.0F;
  }
  
  public float a(b paramb, boolean paramBoolean) {
    float f = a(paramb.a);
    a(paramb.a, paramBoolean);
    b.a a1 = paramb.e;
    int k = a1.a();
    int j;
    for (j = 0; j < k; j++) {
      i i1 = a1.b(j);
      a(i1, a1.a(i1) * f, paramBoolean);
    } 
    return f;
  }
  
  public final float a(i parami) {
    int k = this.i;
    for (int j = 0; k != -1 && j < this.a; j++) {
      if (this.f[k] == parami.c)
        return this.h[k]; 
      k = this.g[k];
    } 
    return 0.0F;
  }
  
  public final float a(i parami, boolean paramBoolean) {
    if (this.e == parami)
      this.e = null; 
    int j = this.i;
    if (j == -1)
      return 0.0F; 
    int k = 0;
    int m = -1;
    while (j != -1 && k < this.a) {
      if (this.f[j] == parami.c) {
        if (j == this.i) {
          this.i = this.g[j];
        } else {
          int[] arrayOfInt = this.g;
          arrayOfInt[m] = arrayOfInt[j];
        } 
        if (paramBoolean)
          parami.b(this.b); 
        parami.m--;
        this.a--;
        this.f[j] = -1;
        if (this.k)
          this.j = j; 
        return this.h[j];
      } 
      int n = this.g[j];
      k++;
      m = j;
      j = n;
    } 
    return 0.0F;
  }
  
  public int a() {
    return this.a;
  }
  
  public void a(float paramFloat) {
    int k = this.i;
    for (int j = 0; k != -1 && j < this.a; j++) {
      float[] arrayOfFloat = this.h;
      arrayOfFloat[k] = arrayOfFloat[k] / paramFloat;
      k = this.g[k];
    } 
  }
  
  public final void a(i parami, float paramFloat) {
    if (paramFloat == 0.0F) {
      a(parami, true);
      return;
    } 
    int j = this.i;
    if (j == -1) {
      this.i = 0;
      float[] arrayOfFloat = this.h;
      j = this.i;
      arrayOfFloat[j] = paramFloat;
      this.f[j] = parami.c;
      this.g[j] = -1;
      parami.m++;
      parami.a(this.b);
      this.a++;
      if (!this.k) {
        j = ++this.j;
        arrayOfInt1 = this.f;
        if (j >= arrayOfInt1.length) {
          this.k = true;
          this.j = arrayOfInt1.length - 1;
        } 
      } 
      return;
    } 
    int k = 0;
    int m = -1;
    while (j != -1 && k < this.a) {
      int[] arrayOfInt = this.f;
      int i1 = arrayOfInt[j];
      int n = ((i)arrayOfInt1).c;
      if (i1 == n) {
        this.h[j] = paramFloat;
        return;
      } 
      if (arrayOfInt[j] < n)
        m = j; 
      j = this.g[j];
      k++;
    } 
    j = this.j;
    if (this.k) {
      int[] arrayOfInt = this.f;
      if (arrayOfInt[j] != -1)
        j = arrayOfInt.length; 
    } else {
      j++;
    } 
    int[] arrayOfInt2 = this.f;
    k = j;
    if (j >= arrayOfInt2.length) {
      k = j;
      if (this.a < arrayOfInt2.length) {
        int n = 0;
        while (true) {
          arrayOfInt2 = this.f;
          k = j;
          if (n < arrayOfInt2.length) {
            if (arrayOfInt2[n] == -1) {
              k = n;
              break;
            } 
            n++;
            continue;
          } 
          break;
        } 
      } 
    } 
    arrayOfInt2 = this.f;
    j = k;
    if (k >= arrayOfInt2.length) {
      j = arrayOfInt2.length;
      this.d *= 2;
      this.k = false;
      this.j = j - 1;
      this.h = Arrays.copyOf(this.h, this.d);
      this.f = Arrays.copyOf(this.f, this.d);
      this.g = Arrays.copyOf(this.g, this.d);
    } 
    this.f[j] = ((i)arrayOfInt1).c;
    this.h[j] = paramFloat;
    arrayOfInt2 = this.g;
    if (m != -1) {
      arrayOfInt2[j] = arrayOfInt2[m];
      arrayOfInt2[m] = j;
    } else {
      arrayOfInt2[j] = this.i;
      this.i = j;
    } 
    ((i)arrayOfInt1).m++;
    arrayOfInt1.a(this.b);
    this.a++;
    if (!this.k)
      this.j++; 
    if (this.a >= this.f.length)
      this.k = true; 
    j = this.j;
    int[] arrayOfInt1 = this.f;
    if (j >= arrayOfInt1.length) {
      this.k = true;
      this.j = arrayOfInt1.length - 1;
    } 
  }
  
  public void a(i parami, float paramFloat, boolean paramBoolean) {
    float f = l;
    if (paramFloat > -f && paramFloat < f)
      return; 
    int j = this.i;
    if (j == -1) {
      this.i = 0;
      float[] arrayOfFloat = this.h;
      j = this.i;
      arrayOfFloat[j] = paramFloat;
      this.f[j] = parami.c;
      this.g[j] = -1;
      parami.m++;
      parami.a(this.b);
      this.a++;
      if (!this.k) {
        j = ++this.j;
        arrayOfInt1 = this.f;
        if (j >= arrayOfInt1.length) {
          this.k = true;
          this.j = arrayOfInt1.length - 1;
        } 
      } 
      return;
    } 
    int k = 0;
    int m = -1;
    while (j != -1 && k < this.a) {
      int[] arrayOfInt = this.f;
      int i1 = arrayOfInt[j];
      int n = ((i)arrayOfInt1).c;
      if (i1 == n) {
        f = this.h[j] + paramFloat;
        float f1 = l;
        paramFloat = f;
        if (f > -f1) {
          paramFloat = f;
          if (f < f1)
            paramFloat = 0.0F; 
        } 
        this.h[j] = paramFloat;
        if (paramFloat == 0.0F) {
          if (j == this.i) {
            this.i = this.g[j];
          } else {
            arrayOfInt = this.g;
            arrayOfInt[m] = arrayOfInt[j];
          } 
          if (paramBoolean)
            arrayOfInt1.b(this.b); 
          if (this.k)
            this.j = j; 
          ((i)arrayOfInt1).m--;
          this.a--;
        } 
        return;
      } 
      if (arrayOfInt[j] < n)
        m = j; 
      j = this.g[j];
      k++;
    } 
    j = this.j;
    if (this.k) {
      int[] arrayOfInt = this.f;
      if (arrayOfInt[j] != -1)
        j = arrayOfInt.length; 
    } else {
      j++;
    } 
    int[] arrayOfInt2 = this.f;
    k = j;
    if (j >= arrayOfInt2.length) {
      k = j;
      if (this.a < arrayOfInt2.length) {
        int n = 0;
        while (true) {
          arrayOfInt2 = this.f;
          k = j;
          if (n < arrayOfInt2.length) {
            if (arrayOfInt2[n] == -1) {
              k = n;
              break;
            } 
            n++;
            continue;
          } 
          break;
        } 
      } 
    } 
    arrayOfInt2 = this.f;
    j = k;
    if (k >= arrayOfInt2.length) {
      j = arrayOfInt2.length;
      this.d *= 2;
      this.k = false;
      this.j = j - 1;
      this.h = Arrays.copyOf(this.h, this.d);
      this.f = Arrays.copyOf(this.f, this.d);
      this.g = Arrays.copyOf(this.g, this.d);
    } 
    this.f[j] = ((i)arrayOfInt1).c;
    this.h[j] = paramFloat;
    arrayOfInt2 = this.g;
    if (m != -1) {
      arrayOfInt2[j] = arrayOfInt2[m];
      arrayOfInt2[m] = j;
    } else {
      arrayOfInt2[j] = this.i;
      this.i = j;
    } 
    ((i)arrayOfInt1).m++;
    arrayOfInt1.a(this.b);
    this.a++;
    if (!this.k)
      this.j++; 
    j = this.j;
    int[] arrayOfInt1 = this.f;
    if (j >= arrayOfInt1.length) {
      this.k = true;
      this.j = arrayOfInt1.length - 1;
    } 
  }
  
  public i b(int paramInt) {
    int k = this.i;
    for (int j = 0; k != -1 && j < this.a; j++) {
      if (j == paramInt)
        return this.c.d[this.f[k]]; 
      k = this.g[k];
    } 
    return null;
  }
  
  public void b() {
    int k = this.i;
    for (int j = 0; k != -1 && j < this.a; j++) {
      float[] arrayOfFloat = this.h;
      arrayOfFloat[k] = arrayOfFloat[k] * -1.0F;
      k = this.g[k];
    } 
  }
  
  public boolean b(i parami) {
    int k = this.i;
    if (k == -1)
      return false; 
    for (int j = 0; k != -1 && j < this.a; j++) {
      if (this.f[k] == parami.c)
        return true; 
      k = this.g[k];
    } 
    return false;
  }
  
  public final void clear() {
    int k = this.i;
    for (int j = 0; k != -1 && j < this.a; j++) {
      i i1 = this.c.d[this.f[k]];
      if (i1 != null)
        i1.b(this.b); 
      k = this.g[k];
    } 
    this.i = -1;
    this.j = -1;
    this.k = false;
    this.a = 0;
  }
  
  public String toString() {
    int k = this.i;
    String str = "";
    for (int j = 0; k != -1 && j < this.a; j++) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(str);
      stringBuilder.append(" -> ");
      str = stringBuilder.toString();
      stringBuilder = new StringBuilder();
      stringBuilder.append(str);
      stringBuilder.append(this.h[k]);
      stringBuilder.append(" : ");
      str = stringBuilder.toString();
      stringBuilder = new StringBuilder();
      stringBuilder.append(str);
      stringBuilder.append(this.c.d[this.f[k]]);
      str = stringBuilder.toString();
      k = this.g[k];
    } 
    return str;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/e/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */