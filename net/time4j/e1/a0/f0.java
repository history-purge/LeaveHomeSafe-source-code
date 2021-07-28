package net.time4j.e1.a0;

import java.util.Set;
import net.time4j.c1.c;
import net.time4j.d1.d;
import net.time4j.d1.o;
import net.time4j.d1.p;
import net.time4j.e1.a;
import net.time4j.e1.g;

final class f0 implements h<Integer> {
  private final p<Integer> c;
  
  private final int d;
  
  private final char e;
  
  private final g f;
  
  private final int g;
  
  private final int h;
  
  f0(p<Integer> paramp) {
    if (paramp.name().startsWith("YEAR")) {
      this.c = paramp;
      this.d = 0;
      this.e = '0';
      this.f = g.d;
      this.g = 0;
      this.h = 100;
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Year element required: ");
    stringBuilder.append(paramp);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  private f0(p<Integer> paramp, int paramInt1, char paramChar, g paramg, int paramInt2, int paramInt3) {
    this.c = paramp;
    this.d = paramInt1;
    this.e = paramChar;
    this.f = paramg;
    this.g = paramInt2;
    this.h = paramInt3;
  }
  
  private static int a(int paramInt1, int paramInt2) {
    int j = paramInt2 / 100;
    int i = j;
    if (paramInt1 >= paramInt2 % 100)
      i = j - 1; 
    return i * 100 + paramInt1;
  }
  
  private int a(boolean paramBoolean, d paramd) {
    int i;
    if (paramBoolean) {
      i = this.h;
    } else {
      i = ((Integer)paramd.a(a.q, Integer.valueOf(this.h))).intValue();
    } 
    if (i >= 100)
      return i; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Pivot year must not be smaller than 100: ");
    stringBuilder.append(i);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public int a(o paramo, Appendable paramAppendable, d paramd, Set<g> paramSet, boolean paramBoolean) {
    char c;
    byte b;
    int i = paramo.a(this.c);
    if (i < 0) {
      if (i == Integer.MIN_VALUE) {
        paramAppendable = new StringBuilder();
        paramAppendable.append("Format context has no year: ");
        paramAppendable.append(paramo);
        throw new IllegalArgumentException(paramAppendable.toString());
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Negative year cannot be printed as two-digit-year: ");
      stringBuilder.append(i);
      throw new IllegalArgumentException(stringBuilder.toString());
    } 
    if (a(paramBoolean, paramd) != 100)
      i = c.b(i, 100); 
    String str2 = Integer.toString(i);
    if (paramBoolean) {
      c = this.e;
    } else {
      c = ((Character)paramd.a(a.m, Character.valueOf('0'))).charValue();
    } 
    byte b1 = 0;
    String str1 = str2;
    if (c != '0') {
      char[] arrayOfChar = str2.toCharArray();
      for (b = 0; b < arrayOfChar.length; b++)
        arrayOfChar[b] = (char)(arrayOfChar[b] + c - 48); 
      str1 = new String(arrayOfChar);
    } 
    if (paramAppendable instanceof CharSequence) {
      b = ((CharSequence)paramAppendable).length();
    } else {
      b = -1;
    } 
    if (i < 10) {
      paramAppendable.append(c);
      b1 = 1;
    } 
    paramAppendable.append(str1);
    i = b1 + str1.length();
    if (b != -1 && i > 0 && paramSet != null)
      paramSet.add(new g(this.c, b, b + i)); 
    return i;
  }
  
  public h<Integer> a(p<Integer> paramp) {
    return (this.c == paramp) ? this : new f0(paramp);
  }
  
  public h<Integer> a(c<?> paramc, d paramd, int paramInt) {
    return new f0(this.c, paramInt, ((Character)paramd.a(a.m, Character.valueOf('0'))).charValue(), (g)paramd.a(a.f, g.d), ((Integer)paramd.a(a.s, Integer.valueOf(0))).intValue(), ((Integer)paramd.a(a.q, Integer.valueOf(paramc.c().c()))).intValue());
  }
  
  public void a(CharSequence paramCharSequence, s params, d paramd, t<?> paramt, boolean paramBoolean) {
    char c;
    g g1;
    int i = paramCharSequence.length();
    int j = params.f();
    if (paramBoolean) {
      m = this.g;
    } else {
      m = ((Integer)paramd.a(a.s, Integer.valueOf(0))).intValue();
    } 
    int k = i;
    if (m > 0)
      k = i - m; 
    if (j >= k) {
      paramCharSequence = new StringBuilder();
      paramCharSequence.append("Missing digits for: ");
      paramCharSequence.append(this.c.name());
      params.a(j, paramCharSequence.toString());
      params.k();
      return;
    } 
    if (paramBoolean) {
      g1 = this.f;
    } else {
      g1 = (g)paramd.a(a.f, g.d);
    } 
    if (g1.c()) {
      i = 2;
    } else {
      i = 9;
    } 
    if (paramBoolean) {
      c = this.e;
    } else {
      c = ((Character)paramd.a(a.m, Character.valueOf('0'))).charValue();
    } 
    int n = i;
    if (this.d > 0) {
      n = i;
      if (m <= 0) {
        m = j;
        n = 0;
        while (m < k) {
          int i2 = paramCharSequence.charAt(m) - c;
          if (i2 >= 0 && i2 <= 9) {
            n++;
            m++;
          } 
        } 
        n = Math.min(i, n - this.d);
      } 
    } 
    int i1 = j + 2;
    n = Math.min(k, n + j);
    k = j;
    i = 0;
    int m = 1;
    while (k < n) {
      int i2 = paramCharSequence.charAt(k) - c;
      if (i2 >= 0 && i2 <= 9) {
        i = i * 10 + i2;
        k++;
        m = 0;
        continue;
      } 
      if (m != 0) {
        params.a(j, "Digit expected.");
        return;
      } 
    } 
    if (k < i1) {
      paramCharSequence = new StringBuilder();
      paramCharSequence.append("Not enough digits found for: ");
      paramCharSequence.append(this.c.name());
      params.a(j, paramCharSequence.toString());
      return;
    } 
    j = i;
    if (k == i1)
      j = a(i, a(paramBoolean, paramd)); 
    paramt.b(this.c, j);
    params.a(k);
  }
  
  public boolean a() {
    return true;
  }
  
  public p<Integer> b() {
    return this.c;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof f0) {
      paramObject = paramObject;
      return this.c.equals(((f0)paramObject).c);
    } 
    return false;
  }
  
  public int hashCode() {
    return this.c.hashCode();
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder(64);
    stringBuilder.append(f0.class.getName());
    stringBuilder.append("[element=");
    stringBuilder.append(this.c.name());
    stringBuilder.append(']');
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/e1/a0/f0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */