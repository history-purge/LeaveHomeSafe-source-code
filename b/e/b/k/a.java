package b.e.b.k;

import b.e.b.d;
import b.e.b.i;

public class a extends i {
  private int i0 = 0;
  
  private boolean j0 = true;
  
  private int k0 = 0;
  
  public boolean H() {
    return this.j0;
  }
  
  public int I() {
    return this.i0;
  }
  
  public int J() {
    return this.k0;
  }
  
  protected void K() {
    for (int j = 0; j < this.h0; j++) {
      e e = this.g0[j];
      int k = this.i0;
      if (k == 0 || k == 1) {
        e.a(0, true);
      } else if (k == 2 || k == 3) {
        e.a(1, true);
      } 
    } 
  }
  
  public void a(d paramd) {
    d[] arrayOfD = this.G;
    arrayOfD[0] = this.y;
    arrayOfD[2] = this.z;
    arrayOfD[1] = this.A;
    arrayOfD[3] = this.B;
    for (int j = 0;; j++) {
      arrayOfD = this.G;
      if (j < arrayOfD.length)
        continue; 
      j = this.i0;
      if (j >= 0 && j < 4) {
        i i1;
        d d2;
        d d1 = arrayOfD[j];
        j = 0;
        while (true)
          j++; 
        if (this.y.g() || this.A.g()) {
          j = 1;
        } else {
          j = 0;
        } 
        if (this.z.g() || this.B.g()) {
          k = 1;
        } else {
          k = 0;
        } 
        if (SYNTHETIC_LOCAL_VARIABLE_6 == null && ((this.i0 == 0 && j != 0) || (this.i0 == 2 && k) || (this.i0 == 1 && j != 0) || (this.i0 == 3 && k))) {
          k = 1;
        } else {
          k = 0;
        } 
        j = 5;
        if (!k)
          j = 4; 
        for (int k = 0; k < this.h0; k++) {
          e e = this.g0[k];
          if (this.j0 || e.c()) {
            i i2 = paramd.a(e.G[this.i0]);
            d[] arrayOfD1 = e.G;
            int m = this.i0;
            (arrayOfD1[m]).g = i2;
            if ((arrayOfD1[m]).d != null && (arrayOfD1[m]).d.b == this) {
              m = (arrayOfD1[m]).e + 0;
            } else {
              m = 0;
            } 
            int n = this.i0;
            if (n == 0 || n == 2) {
              paramd.b(d1.g, i2, this.k0 - m, SYNTHETIC_LOCAL_VARIABLE_6);
            } else {
              paramd.a(d1.g, i2, this.k0 + m, SYNTHETIC_LOCAL_VARIABLE_6);
            } 
            paramd.a(d1.g, i2, this.k0 + m, j);
          } 
        } 
        j = this.i0;
        if (j == 0) {
          paramd.a(this.A.g, this.y.g, 0, 8);
          paramd.a(this.y.g, this.K.A.g, 0, 4);
          i1 = this.y.g;
          d2 = this.K.y;
        } else if (j == 1) {
          paramd.a(this.y.g, this.A.g, 0, 8);
          paramd.a(this.y.g, this.K.y.g, 0, 4);
          i1 = this.y.g;
          d2 = this.K.A;
        } else if (j == 2) {
          paramd.a(this.B.g, this.z.g, 0, 8);
          paramd.a(this.z.g, this.K.B.g, 0, 4);
          i1 = this.z.g;
          d2 = this.K.z;
        } else if (j == 3) {
          paramd.a(this.z.g, this.B.g, 0, 8);
          paramd.a(this.z.g, this.K.z.g, 0, 4);
          i1 = this.z.g;
          d2 = this.K.B;
        } else {
          return;
        } 
        paramd.a(i1, d2.g, 0, 0);
        return;
      } 
      return;
      (arrayOfD[j]).g = paramd.a(arrayOfD[j]);
    } 
  }
  
  public boolean c() {
    return true;
  }
  
  public void d(boolean paramBoolean) {
    this.j0 = paramBoolean;
  }
  
  public void s(int paramInt) {
    this.i0 = paramInt;
  }
  
  public void t(int paramInt) {
    this.k0 = paramInt;
  }
  
  public String toString() {
    StringBuilder stringBuilder1 = new StringBuilder();
    stringBuilder1.append("[Barrier] ");
    stringBuilder1.append(g());
    stringBuilder1.append(" {");
    String str = stringBuilder1.toString();
    for (int j = 0; j < this.h0; j++) {
      e e = this.g0[j];
      String str1 = str;
      if (j > 0) {
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append(str);
        stringBuilder3.append(", ");
        str1 = stringBuilder3.toString();
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(str1);
      stringBuilder.append(e.g());
      str = stringBuilder.toString();
    } 
    StringBuilder stringBuilder2 = new StringBuilder();
    stringBuilder2.append(str);
    stringBuilder2.append("}");
    return stringBuilder2.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/e/b/k/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */