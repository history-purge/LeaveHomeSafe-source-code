package net.time4j.tz;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class p implements Comparable<p>, k, Serializable {
  private static final ConcurrentMap<Integer, p> f = new ConcurrentHashMap<Integer, p>();
  
  private static final BigDecimal g = new BigDecimal(60);
  
  private static final BigDecimal h = new BigDecimal(3600);
  
  private static final BigDecimal i = new BigDecimal(-180);
  
  private static final BigDecimal j = new BigDecimal(180);
  
  private static final BigDecimal k = new BigDecimal(240);
  
  private static final BigDecimal l = new BigDecimal(1000000000);
  
  public static final p m = new p(0, 0);
  
  private static final long serialVersionUID = -1410512619471503090L;
  
  private final transient int c;
  
  private final transient int d;
  
  private final transient String e;
  
  static {
    f.put(Integer.valueOf(0), m);
  }
  
  private p(int paramInt1, int paramInt2) {
    byte b;
    if (paramInt2 == 0) {
      if (paramInt1 < -64800 || paramInt1 > 64800) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("Total seconds out of range: ");
        stringBuilder1.append(paramInt1);
        throw new IllegalArgumentException(stringBuilder1.toString());
      } 
    } else if (Math.abs(paramInt2) <= 999999999) {
      if (paramInt1 >= -39600 && paramInt1 <= 39600) {
        if ((paramInt1 < 0 && paramInt2 > 0) || (paramInt1 > 0 && paramInt2 < 0)) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Different signs: offset=");
          stringBuilder1.append(paramInt1);
          stringBuilder1.append(", fraction=");
          stringBuilder1.append(paramInt2);
          throw new IllegalArgumentException(stringBuilder1.toString());
        } 
      } else {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("Total seconds out of range while fraction is non-zero: ");
        stringBuilder1.append(paramInt1);
        throw new IllegalArgumentException(stringBuilder1.toString());
      } 
    } else {
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("Fraction out of range: ");
      stringBuilder1.append(paramInt2);
      IllegalArgumentException illegalArgumentException = new IllegalArgumentException(stringBuilder1.toString());
      throw illegalArgumentException;
    } 
    boolean bool = false;
    if (paramInt1 < 0 || paramInt2 < 0) {
      i = 1;
    } else {
      i = 0;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    if (i) {
      b = 45;
    } else {
      b = 43;
    } 
    stringBuilder.append(b);
    int m = Math.abs(paramInt1);
    int i = m / 3600;
    int j = m / 60 % 60;
    m %= 60;
    if (i < 10)
      stringBuilder.append('0'); 
    stringBuilder.append(i);
    stringBuilder.append(':');
    if (j < 10)
      stringBuilder.append('0'); 
    stringBuilder.append(j);
    if (m != 0 || paramInt2 != 0) {
      stringBuilder.append(':');
      if (m < 10)
        stringBuilder.append('0'); 
      stringBuilder.append(m);
      if (paramInt2 != 0) {
        stringBuilder.append('.');
        String str = String.valueOf(Math.abs(paramInt2));
        j = str.length();
        for (i = bool; i < 9 - j; i++)
          stringBuilder.append('0'); 
        stringBuilder.append(str);
      } 
    } 
    this.e = stringBuilder.toString();
    this.c = paramInt1;
    this.d = paramInt2;
  }
  
  private static int a(String paramString, int paramInt1, int paramInt2) {
    int j = Math.min(paramString.length() - paramInt1, paramInt2);
    int i = 0;
    paramInt2 = -1;
    while (i < j) {
      char c = paramString.charAt(paramInt1 + i);
      if (c >= '0' && c <= '9') {
        if (paramInt2 == -1) {
          paramInt2 = c - 48;
        } else {
          paramInt2 = paramInt2 * 10 + c - 48;
        } 
        i++;
      } 
    } 
    return paramInt2;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("[hours=");
    stringBuilder.append(paramInt1);
    stringBuilder.append(",minutes=");
    stringBuilder.append(paramInt2);
    stringBuilder.append(']');
    return stringBuilder.toString();
  }
  
  static p a(String paramString, boolean paramBoolean) {
    if (paramString.equals("Z"))
      return m; 
    int i = paramString.length();
    int j = 3;
    if (i >= 3) {
      String str1;
      if (paramString.startsWith("UTC")) {
        str1 = paramString.substring(3);
        i -= 3;
      } else {
        if (paramString.startsWith("GMT")) {
          if (!paramBoolean)
            return null; 
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Use UTC-prefix for canonical offset instead: ");
          stringBuilder1.append(paramString);
          throw new IllegalArgumentException(stringBuilder1.toString());
        } 
        str1 = paramString;
      } 
      if (i >= 2) {
        f f;
        if (str1.charAt(0) == '-') {
          f = f.c;
        } else if (str1.charAt(0) == '+') {
          f = f.d;
        } else {
          f = null;
        } 
        int m = a(str1, 1, 2);
        if (m >= 0) {
          if (i <= 3)
            return a(f, m); 
          if (str1.charAt(2) != ':')
            j = 4; 
          int n = a(str1, j, 2);
          if (str1.charAt(j - 1) == ':' && n >= 0) {
            int i2 = j + 2;
            if (i == i2)
              return a(f, m, n); 
            int i1 = j + 5;
            if (i >= i1 && str1.charAt(i2) == ':') {
              i2 = a(str1, j + 3, 2);
              if (i2 >= 0) {
                n = m * 3600 + n * 60 + i2;
                m = n;
                if (f == f.c)
                  m = -n; 
                if (i == i1)
                  return f(m); 
                if (i == j + 15 && str1.charAt(i1) == '.') {
                  j = a(str1, j + 6, 9);
                  if (j >= 0) {
                    i = j;
                    if (f == f.c)
                      i = -j; 
                    return b(m, i);
                  } 
                } 
              } 
            } 
          } 
        } 
      } 
      if (!paramBoolean)
        return null; 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("No canonical zonal offset: ");
      stringBuilder.append(paramString);
      throw new IllegalArgumentException(stringBuilder.toString());
    } 
    String str = paramString;
  }
  
  public static p a(BigDecimal paramBigDecimal) {
    if (paramBigDecimal.compareTo(j) <= 0 && paramBigDecimal.compareTo(i) >= 0) {
      BigDecimal bigDecimal = paramBigDecimal.multiply(k);
      paramBigDecimal = bigDecimal.setScale(0, RoundingMode.DOWN);
      bigDecimal = bigDecimal.subtract(paramBigDecimal).setScale(9, RoundingMode.HALF_UP).multiply(l);
      int i = paramBigDecimal.intValueExact();
      int j = bigDecimal.intValueExact();
      return (j == 0) ? f(i) : ((j == 1000000000) ? f(++i) : ((j == -1000000000) ? f(--i) : new p(i, j)));
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Out of range: ");
    stringBuilder.append(paramBigDecimal);
    IllegalArgumentException illegalArgumentException = new IllegalArgumentException(stringBuilder.toString());
    throw illegalArgumentException;
  }
  
  public static p a(f paramf, int paramInt) {
    return a(paramf, paramInt, 0);
  }
  
  public static p a(f paramf, int paramInt1, int paramInt2) {
    if (paramf != null) {
      if (paramInt1 >= 0 && paramInt1 <= 18) {
        if (paramInt2 >= 0 && paramInt2 <= 59) {
          if (paramInt1 != 18 || paramInt2 == 0) {
            paramInt2 = paramInt1 * 3600 + paramInt2 * 60;
            paramInt1 = paramInt2;
            if (paramf == f.c)
              paramInt1 = -paramInt2; 
            return f(paramInt1);
          } 
          StringBuilder stringBuilder2 = new StringBuilder();
          stringBuilder2.append("Time zone offset out of range (-18:00:00 <= offset <= 18:00:00) in: ");
          stringBuilder2.append(a(paramInt1, paramInt2));
          throw new IllegalArgumentException(stringBuilder2.toString());
        } 
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("Minute part out of range (0 <= minutes <= 59) in: ");
        stringBuilder1.append(a(paramInt1, paramInt2));
        throw new IllegalArgumentException(stringBuilder1.toString());
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Hour part out of range (0 <= hours <= 18) in: ");
      stringBuilder.append(a(paramInt1, paramInt2));
      throw new IllegalArgumentException(stringBuilder.toString());
    } 
    throw new NullPointerException("Missing sign.");
  }
  
  public static p a(f paramf, int paramInt1, int paramInt2, double paramDouble) {
    if (paramf != null) {
      if (paramInt1 >= 0 && paramInt1 <= 180) {
        if (paramInt2 >= 0 && paramInt2 <= 59) {
          if (Double.compare(paramDouble, 0.0D) >= 0 && Double.compare(paramDouble, 60.0D) < 0) {
            BigDecimal bigDecimal2 = BigDecimal.valueOf(paramInt1);
            BigDecimal bigDecimal1 = bigDecimal2;
            if (paramInt2 != 0)
              bigDecimal1 = bigDecimal2.add(BigDecimal.valueOf(paramInt2).setScale(15, RoundingMode.UNNECESSARY).divide(g, RoundingMode.HALF_UP)); 
            bigDecimal2 = bigDecimal1;
            if (paramDouble != 0.0D)
              bigDecimal2 = bigDecimal1.add(BigDecimal.valueOf(paramDouble).setScale(15, RoundingMode.FLOOR).divide(h, RoundingMode.HALF_UP)); 
            bigDecimal1 = bigDecimal2;
            if (paramf == f.c)
              bigDecimal1 = bigDecimal2.negate(); 
            return a(bigDecimal1);
          } 
          throw new IllegalArgumentException("Arc second out of range (0.0 <= arcSeconds < 60.0).");
        } 
        throw new IllegalArgumentException("Arc minute out of range (0 <= arcMinutes <= 59).");
      } 
      throw new IllegalArgumentException("Degrees of longitude out of range (0 <= degrees <= 180).");
    } 
    throw new NullPointerException("Missing sign.");
  }
  
  public static p b(int paramInt1, int paramInt2) {
    if (paramInt2 != 0)
      return new p(paramInt1, paramInt2); 
    if (paramInt1 == 0)
      return m; 
    if (paramInt1 % 900 == 0) {
      Integer integer = Integer.valueOf(paramInt1);
      p p2 = f.get(integer);
      p p1 = p2;
      if (p2 == null) {
        p1 = new p(paramInt1, 0);
        f.putIfAbsent(integer, p1);
        p1 = f.get(integer);
      } 
      return p1;
    } 
    return new p(paramInt1, 0);
  }
  
  public static p f(int paramInt) {
    return b(paramInt, 0);
  }
  
  private void readObject(ObjectInputStream paramObjectInputStream) {
    throw new InvalidObjectException("Serialization proxy required.");
  }
  
  private Object writeReplace() {
    return new SPX(this, 15);
  }
  
  public int a(p paramp) {
    int i = this.c;
    int j = paramp.c;
    if (i < j)
      return -1; 
    if (i > j)
      return 1; 
    i = this.d - paramp.d;
    return (i < 0) ? -1 : ((i == 0) ? 0 : 1);
  }
  
  public String a() {
    if (this.c == 0 && this.d == 0)
      return "Z"; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("UTC");
    stringBuilder.append(this.e);
    return stringBuilder.toString();
  }
  
  public String a(Locale paramLocale) {
    boolean bool;
    if (this.c == 0 && this.d == 0) {
      bool = true;
    } else {
      bool = false;
    } 
    try {
      return l.t.a(bool, paramLocale);
    } finally {
      paramLocale = null;
    } 
  }
  
  public int b() {
    return Math.abs(this.c) / 3600;
  }
  
  public int c() {
    return Math.abs(this.c) / 60 % 60;
  }
  
  public int d() {
    return Math.abs(this.c) % 60;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof p) {
      paramObject = paramObject;
      return (this.c == ((p)paramObject).c && this.d == ((p)paramObject).d);
    } 
    return false;
  }
  
  public int hashCode() {
    return (this.c ^ 0xFFFFFFFF) + this.d % 64000;
  }
  
  public int q() {
    return this.d;
  }
  
  public int r() {
    return this.c;
  }
  
  j s() {
    return j.a(this);
  }
  
  public f t() {
    return (this.c < 0 || this.d < 0) ? f.c : f.d;
  }
  
  public String toString() {
    return this.e;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/tz/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */