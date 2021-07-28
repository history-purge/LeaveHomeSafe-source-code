package net.time4j.e1.a0;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Set;
import net.time4j.d1.d;
import net.time4j.d1.o;
import net.time4j.d1.p;
import net.time4j.d1.q;
import net.time4j.e1.a;
import net.time4j.e1.g;

final class j implements h<Integer> {
  private final h<Void> c;
  
  private final p<Integer> d;
  
  private final int e;
  
  private final int f;
  
  private final boolean g;
  
  private final char h;
  
  private final g i;
  
  j(p<Integer> paramp, int paramInt1, int paramInt2, boolean paramBoolean) {
    boolean bool;
    h h1;
    this.d = paramp;
    this.e = paramInt1;
    this.f = paramInt2;
    if (!paramBoolean && paramInt1 == paramInt2) {
      bool = true;
    } else {
      bool = false;
    } 
    this.g = bool;
    if (paramBoolean) {
      h1 = new m(a.o);
    } else {
      h1 = null;
    } 
    this.c = h1;
    if (paramp != null) {
      if (paramInt1 >= 0) {
        if (paramInt1 <= paramInt2) {
          if (paramInt1 <= 9) {
            if (paramInt2 <= 9) {
              this.h = '0';
              this.i = g.d;
              return;
            } 
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append("Max digits out of range: ");
            stringBuilder3.append(paramInt2);
            throw new IllegalArgumentException(stringBuilder3.toString());
          } 
          StringBuilder stringBuilder2 = new StringBuilder();
          stringBuilder2.append("Min digits out of range: ");
          stringBuilder2.append(paramInt1);
          throw new IllegalArgumentException(stringBuilder2.toString());
        } 
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("Max smaller than min: ");
        stringBuilder1.append(paramInt2);
        stringBuilder1.append(" < ");
        stringBuilder1.append(paramInt1);
        throw new IllegalArgumentException(stringBuilder1.toString());
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Negative min digits: ");
      stringBuilder.append(paramInt1);
      throw new IllegalArgumentException(stringBuilder.toString());
    } 
    throw new NullPointerException("Missing element.");
  }
  
  private j(h<Void> paramh, p<Integer> paramp, int paramInt1, int paramInt2, boolean paramBoolean, char paramChar, g paramg) {
    this.c = paramh;
    this.d = paramp;
    this.e = paramInt1;
    this.f = paramInt2;
    this.g = paramBoolean;
    this.h = paramChar;
    this.i = paramg;
  }
  
  private int a(BigDecimal paramBigDecimal, int paramInt1, int paramInt2) {
    BigDecimal bigDecimal = BigDecimal.valueOf(paramInt1);
    return paramBigDecimal.multiply(BigDecimal.valueOf(paramInt2).subtract(bigDecimal).add(BigDecimal.ONE)).setScale(0, RoundingMode.FLOOR).add(bigDecimal).intValueExact();
  }
  
  private static BigDecimal a(Number paramNumber) {
    return BigDecimal.valueOf(paramNumber.longValue());
  }
  
  private boolean c() {
    return (this.c != null);
  }
  
  public int a(o paramo, Appendable paramAppendable, d paramd, Set<g> paramSet, boolean paramBoolean) {
    char c;
    byte b;
    BigDecimal bigDecimal3 = a((Number)paramo.e(this.d));
    BigDecimal bigDecimal4 = a((Number)paramo.d(this.d));
    BigDecimal bigDecimal2 = a((Number)paramo.b(this.d));
    BigDecimal bigDecimal1 = bigDecimal3;
    if (bigDecimal3.compareTo(bigDecimal2) > 0)
      bigDecimal1 = bigDecimal2; 
    bigDecimal1 = bigDecimal1.subtract(bigDecimal4).divide(bigDecimal2.subtract(bigDecimal4).add(BigDecimal.ONE), 9, RoundingMode.FLOOR);
    if (bigDecimal1.compareTo(BigDecimal.ZERO) == 0) {
      bigDecimal1 = BigDecimal.ZERO;
    } else {
      bigDecimal1 = bigDecimal1.stripTrailingZeros();
    } 
    if (paramBoolean) {
      c = this.h;
    } else {
      c = ((Character)paramd.a(a.m, Character.valueOf('0'))).charValue();
    } 
    if (paramAppendable instanceof CharSequence) {
      b = ((CharSequence)paramAppendable).length();
    } else {
      b = -1;
    } 
    int n = bigDecimal1.scale();
    int i = 0;
    int k = 0;
    int m = 0;
    if (n == 0) {
      if (this.e > 0) {
        if (c()) {
          this.c.a(paramo, paramAppendable, paramd, paramSet, paramBoolean);
          i = 1;
          k = m;
        } else {
          i = 0;
          k = m;
        } 
        while (true) {
          m = this.e;
          if (k < m) {
            paramAppendable.append(c);
            k++;
            continue;
          } 
          k = i + m;
          break;
        } 
      } 
    } else {
      if (c()) {
        this.c.a(paramo, paramAppendable, paramd, paramSet, paramBoolean);
        i = 1;
      } 
      String str = bigDecimal1.setScale(Math.min(Math.max(bigDecimal1.scale(), this.e), this.f), RoundingMode.FLOOR).toPlainString();
      m = 2;
      n = str.length();
      while (true) {
        k = i;
        if (m < n) {
          paramAppendable.append((char)(str.charAt(m) + c - 48));
          i++;
          m++;
          continue;
        } 
        break;
      } 
    } 
    if (b != -1 && k > 1 && paramSet != null)
      paramSet.add(new g(this.d, b + 1, b + k)); 
    return k;
  }
  
  q<?> a(q<?> paramq1, q<?> paramq2) {
    if (!paramq2.c(k.c))
      return paramq1; 
    int i = a((BigDecimal)paramq2.e(k.c), ((Integer)paramq1.d(this.d)).intValue(), ((Integer)paramq1.b(this.d)).intValue());
    paramq2.b(k.c, null);
    paramq2.a(this.d, i);
    return paramq1.a(this.d, i);
  }
  
  public h<Integer> a(p<Integer> paramp) {
    return (this.d == paramp) ? this : new j(paramp, this.e, this.f, c());
  }
  
  public h<Integer> a(c<?> paramc, d paramd, int paramInt) {
    return new j(this.c, this.d, this.e, this.f, this.g, ((Character)paramd.a(a.m, Character.valueOf('0'))).charValue(), (g)paramd.a(a.f, g.d));
  }
  
  public void a(CharSequence paramCharSequence, s params, d paramd, t<?> paramt, boolean paramBoolean) {
    p<Integer> p1;
    int i;
    int k;
    g g1;
    if (paramBoolean) {
      g1 = this.i;
    } else {
      g1 = (g)paramd.a(a.f, g.d);
    } 
    if (!g1.a() || this.g) {
      i = this.e;
      k = this.f;
    } else {
      i = 0;
      k = 9;
    } 
    int i2 = paramCharSequence.length();
    if (params.f() >= i2) {
      if (i) {
        i = params.f();
        paramCharSequence = new StringBuilder();
        paramCharSequence.append("Expected fraction digits not found for: ");
        paramCharSequence.append(this.d.name());
        params.a(i, paramCharSequence.toString());
      } 
      return;
    } 
    if (c()) {
      this.c.a(paramCharSequence, params, paramd, (t<?>)null, paramBoolean);
      if (params.i()) {
        if (i == 0)
          params.a(); 
        return;
      } 
    } 
    int m = params.f();
    int n = m + i;
    int i1 = Math.min(k + m, i2);
    if (n > i2 && g1.c()) {
      k = params.f();
      paramCharSequence = new StringBuilder();
    } else {
      if (paramBoolean) {
        k = this.h;
      } else {
        k = ((Character)paramd.a(a.m, Character.valueOf('0'))).charValue();
      } 
      long l = 0L;
      while (true) {
        if (m < i1) {
          i2 = paramCharSequence.charAt(m) - k;
          if (i2 >= 0 && i2 <= 9) {
            l = l * 10L + i2;
            m++;
            continue;
          } 
          if (m < n && g1.c()) {
            k = params.f();
            paramCharSequence = new StringBuilder();
          } else {
            break;
          } 
        } else {
          break;
        } 
        paramCharSequence.append("Expected at least ");
        paramCharSequence.append(i);
        paramCharSequence.append(" digits.");
        params.a(k, paramCharSequence.toString());
        return;
      } 
      BigDecimal bigDecimal = (new BigDecimal(l)).movePointLeft(m - params.f());
      if (this.d.name().equals("NANO_OF_SECOND")) {
        i = a(bigDecimal, 0, 999999999);
        paramt.b(this.d, i);
      } else {
        paramt.c(k.c, bigDecimal);
        p1 = this.d;
        paramt.c(p1, p1.q());
      } 
      params.a(m);
      return;
    } 
    p1.append("Expected at least ");
    p1.append(i);
    p1.append(" digits.");
    params.a(k, p1.toString());
  }
  
  public boolean a() {
    return true;
  }
  
  public p<Integer> b() {
    return this.d;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof j) {
      paramObject = paramObject;
      return (this.d.equals(((j)paramObject).d) && this.e == ((j)paramObject).e && this.f == ((j)paramObject).f && c() == paramObject.c());
    } 
    return false;
  }
  
  public int hashCode() {
    return this.d.hashCode() * 7 + (this.e + this.f * 10) * 31;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder(64);
    stringBuilder.append(j.class.getName());
    stringBuilder.append("[element=");
    stringBuilder.append(this.d.name());
    stringBuilder.append(", min-digits=");
    stringBuilder.append(this.e);
    stringBuilder.append(", max-digits=");
    stringBuilder.append(this.f);
    stringBuilder.append(']');
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/e1/a0/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */