package b.e.b;

import java.util.Arrays;

public class i {
  private static int n = 1;
  
  public boolean a;
  
  private String b;
  
  public int c = -1;
  
  int d = -1;
  
  public int e = 0;
  
  public float f;
  
  public boolean g = false;
  
  float[] h = new float[9];
  
  float[] i = new float[9];
  
  a j;
  
  b[] k = new b[16];
  
  int l = 0;
  
  public int m = 0;
  
  public i(a parama, String paramString) {
    this.j = parama;
  }
  
  static void b() {
    n++;
  }
  
  public void a() {
    this.b = null;
    this.j = a.g;
    this.e = 0;
    this.c = -1;
    this.d = -1;
    this.f = 0.0F;
    this.g = false;
    int k = this.l;
    for (int j = 0; j < k; j++)
      this.k[j] = null; 
    this.l = 0;
    this.m = 0;
    this.a = false;
    Arrays.fill(this.i, 0.0F);
  }
  
  public final void a(b paramb) {
    int j = 0;
    while (true) {
      int k = this.l;
      if (j < k) {
        if (this.k[j] == paramb)
          return; 
        j++;
        continue;
      } 
      b[] arrayOfB = this.k;
      if (k >= arrayOfB.length)
        this.k = Arrays.<b>copyOf(arrayOfB, arrayOfB.length * 2); 
      arrayOfB = this.k;
      j = this.l;
      arrayOfB[j] = paramb;
      this.l = j + 1;
      return;
    } 
  }
  
  public void a(d paramd, float paramFloat) {
    this.f = paramFloat;
    this.g = true;
    int k = this.l;
    for (int j = 0; j < k; j++)
      this.k[j].a(paramd, this, false); 
    this.l = 0;
  }
  
  public void a(a parama, String paramString) {
    this.j = parama;
  }
  
  public final void b(b paramb) {
    int k = this.l;
    for (int j = 0; j < k; j++) {
      if (this.k[j] == paramb) {
        while (j < k - 1) {
          b[] arrayOfB = this.k;
          int m = j + 1;
          arrayOfB[j] = arrayOfB[m];
          j = m;
        } 
        this.l--;
        return;
      } 
    } 
  }
  
  public final void c(b paramb) {
    int k = this.l;
    for (int j = 0; j < k; j++)
      this.k[j].a(paramb, false); 
    this.l = 0;
  }
  
  public String toString() {
    StringBuilder stringBuilder;
    if (this.b != null) {
      stringBuilder = new StringBuilder();
      stringBuilder.append("");
      stringBuilder.append(this.b);
    } else {
      stringBuilder = new StringBuilder();
      stringBuilder.append("");
      stringBuilder.append(this.c);
    } 
    return stringBuilder.toString();
  }
  
  public enum a {
    c, d, e, f, g;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/e/b/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */