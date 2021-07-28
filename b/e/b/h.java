package b.e.b;

import java.util.Arrays;
import java.util.Comparator;

public class h extends b {
  private int g = 128;
  
  private i[] h;
  
  private i[] i;
  
  private int j;
  
  b k;
  
  public h(c paramc) {
    super(paramc);
    int j = this.g;
    this.h = new i[j];
    this.i = new i[j];
    this.j = 0;
    this.k = new b(this, this);
  }
  
  private final void e(i parami) {
    int j = this.j;
    i[] arrayOfI = this.h;
    if (j + 1 > arrayOfI.length) {
      this.h = Arrays.<i>copyOf(arrayOfI, arrayOfI.length * 2);
      arrayOfI = this.h;
      this.i = Arrays.<i>copyOf(arrayOfI, arrayOfI.length * 2);
    } 
    arrayOfI = this.h;
    j = this.j;
    arrayOfI[j] = parami;
    this.j = j + 1;
    j = this.j;
    if (j > 1 && (arrayOfI[j - 1]).c > parami.c) {
      boolean bool = false;
      j = 0;
      while (true) {
        int k = this.j;
        if (j < k) {
          this.i[j] = this.h[j];
          j++;
          continue;
        } 
        Arrays.sort(this.i, 0, k, new a(this));
        for (j = bool; j < this.j; j++)
          this.h[j] = this.i[j]; 
        break;
      } 
    } 
    parami.a = true;
    parami.a(this);
  }
  
  private final void f(i parami) {
    for (int j = 0; j < this.j; j++) {
      if (this.h[j] == parami)
        while (true) {
          int k = this.j;
          if (j < k - 1) {
            i[] arrayOfI = this.h;
            k = j + 1;
            arrayOfI[j] = arrayOfI[k];
            j = k;
            continue;
          } 
          this.j = k - 1;
          parami.a = false;
          return;
        }  
    } 
  }
  
  public i a(d paramd, boolean[] paramArrayOfboolean) {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: iconst_m1
    //   3: istore #4
    //   5: iload_3
    //   6: aload_0
    //   7: getfield j : I
    //   10: if_icmpge -> 101
    //   13: aload_0
    //   14: getfield h : [Lb/e/b/i;
    //   17: iload_3
    //   18: aaload
    //   19: astore_1
    //   20: aload_2
    //   21: aload_1
    //   22: getfield c : I
    //   25: baload
    //   26: ifeq -> 36
    //   29: iload #4
    //   31: istore #5
    //   33: goto -> 90
    //   36: aload_0
    //   37: getfield k : Lb/e/b/h$b;
    //   40: aload_1
    //   41: invokevirtual a : (Lb/e/b/i;)V
    //   44: aload_0
    //   45: getfield k : Lb/e/b/h$b;
    //   48: astore_1
    //   49: iload #4
    //   51: iconst_m1
    //   52: if_icmpne -> 69
    //   55: iload #4
    //   57: istore #5
    //   59: aload_1
    //   60: invokevirtual a : ()Z
    //   63: ifeq -> 90
    //   66: goto -> 87
    //   69: iload #4
    //   71: istore #5
    //   73: aload_1
    //   74: aload_0
    //   75: getfield h : [Lb/e/b/i;
    //   78: iload #4
    //   80: aaload
    //   81: invokevirtual b : (Lb/e/b/i;)Z
    //   84: ifeq -> 90
    //   87: iload_3
    //   88: istore #5
    //   90: iload_3
    //   91: iconst_1
    //   92: iadd
    //   93: istore_3
    //   94: iload #5
    //   96: istore #4
    //   98: goto -> 5
    //   101: iload #4
    //   103: iconst_m1
    //   104: if_icmpne -> 109
    //   107: aconst_null
    //   108: areturn
    //   109: aload_0
    //   110: getfield h : [Lb/e/b/i;
    //   113: iload #4
    //   115: aaload
    //   116: areturn
  }
  
  public void a(b paramb, boolean paramBoolean) {
    i i1 = paramb.a;
    if (i1 == null)
      return; 
    b.a a = paramb.e;
    int k = a.a();
    int j;
    for (j = 0; j < k; j++) {
      i i2 = a.b(j);
      float f = a.a(j);
      this.k.a(i2);
      if (this.k.a(i1, f))
        e(i2); 
      this.b += paramb.b * f;
    } 
    f(i1);
  }
  
  public void a(i parami) {
    this.k.a(parami);
    this.k.b();
    parami.i[parami.e] = 1.0F;
    e(parami);
  }
  
  public void clear() {
    this.j = 0;
    this.b = 0.0F;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("");
    stringBuilder.append(" goal -> (");
    stringBuilder.append(this.b);
    stringBuilder.append(") : ");
    String str = stringBuilder.toString();
    for (int j = 0; j < this.j; j++) {
      i i1 = this.h[j];
      this.k.a(i1);
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append(str);
      stringBuilder1.append(this.k);
      stringBuilder1.append(" ");
      str = stringBuilder1.toString();
    } 
    return str;
  }
  
  class a implements Comparator<i> {
    a(h this$0) {}
    
    public int a(i param1i1, i param1i2) {
      return param1i1.c - param1i2.c;
    }
  }
  
  class b implements Comparable {
    i c;
    
    public b(h this$0, h param1h1) {}
    
    public void a(i param1i) {
      this.c = param1i;
    }
    
    public final boolean a() {
      for (int j = 8; j >= 0; j--) {
        float f = this.c.i[j];
        if (f > 0.0F)
          return false; 
        if (f < 0.0F)
          return true; 
      } 
      return false;
    }
    
    public boolean a(i param1i, float param1Float) {
      boolean bool1 = this.c.a;
      boolean bool = true;
      int j = 0;
      if (bool1) {
        for (j = 0; j < 9; j++) {
          float[] arrayOfFloat = this.c.i;
          arrayOfFloat[j] = arrayOfFloat[j] + param1i.i[j] * param1Float;
          if (Math.abs(arrayOfFloat[j]) < 1.0E-4F) {
            this.c.i[j] = 0.0F;
          } else {
            bool = false;
          } 
        } 
        if (bool)
          h.a(this.d, this.c); 
        return false;
      } 
      while (j < 9) {
        float f = param1i.i[j];
        if (f != 0.0F) {
          float f1 = f * param1Float;
          f = f1;
          if (Math.abs(f1) < 1.0E-4F)
            f = 0.0F; 
          this.c.i[j] = f;
        } else {
          this.c.i[j] = 0.0F;
        } 
        j++;
      } 
      return true;
    }
    
    public void b() {
      Arrays.fill(this.c.i, 0.0F);
    }
    
    public final boolean b(i param1i) {
      int j = 8;
      while (j >= 0) {
        float f1 = param1i.i[j];
        float f2 = this.c.i[j];
        if (f2 == f1) {
          j--;
          continue;
        } 
        if (f2 < f1)
          return true; 
      } 
      return false;
    }
    
    public int compareTo(Object param1Object) {
      param1Object = param1Object;
      return this.c.c - ((i)param1Object).c;
    }
    
    public String toString() {
      StringBuilder stringBuilder2;
      i i1 = this.c;
      String str1 = "[ ";
      String str2 = str1;
      if (i1 != null) {
        int j = 0;
        while (true) {
          str2 = str1;
          if (j < 9) {
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append(str1);
            stringBuilder2.append(this.c.i[j]);
            stringBuilder2.append(" ");
            str1 = stringBuilder2.toString();
            j++;
            continue;
          } 
          break;
        } 
      } 
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append((String)stringBuilder2);
      stringBuilder1.append("] ");
      stringBuilder1.append(this.c);
      return stringBuilder1.toString();
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/e/b/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */