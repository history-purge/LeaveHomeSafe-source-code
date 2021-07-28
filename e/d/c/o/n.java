package e.d.c.o;

import e.d.a.k.a;
import e.d.a.k.b;
import e.d.a.s.b;
import e.d.a.s.d;
import e.d.a.s.e;
import e.d.b.a;
import e.d.b.f;
import e.d.b.k;
import e.d.b.o;
import e.d.c.b;
import e.d.c.c0.a;
import e.d.c.e;
import e.d.c.f0.c;
import e.d.c.h;
import e.d.c.o.a0.b;
import e.d.c.o.a0.b0;
import e.d.c.o.a0.b1;
import e.d.c.o.a0.d;
import e.d.c.o.a0.d0;
import e.d.c.o.a0.d1;
import e.d.c.o.a0.f;
import e.d.c.o.a0.f0;
import e.d.c.o.a0.f1;
import e.d.c.o.a0.h;
import e.d.c.o.a0.h0;
import e.d.c.o.a0.j;
import e.d.c.o.a0.j0;
import e.d.c.o.a0.l;
import e.d.c.o.a0.l0;
import e.d.c.o.a0.n;
import e.d.c.o.a0.n0;
import e.d.c.o.a0.p;
import e.d.c.o.a0.p0;
import e.d.c.o.a0.r;
import e.d.c.o.a0.r0;
import e.d.c.o.a0.t;
import e.d.c.o.a0.t0;
import e.d.c.o.a0.v;
import e.d.c.o.a0.v0;
import e.d.c.o.a0.x;
import e.d.c.o.a0.x0;
import e.d.c.o.a0.z;
import e.d.c.o.a0.z0;
import e.d.c.t.c;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Set;

public class n extends a {
  public n(e parame, b paramb) {
    super(parame, paramb);
  }
  
  private static String a(k paramk, int paramInt1, int paramInt2) {
    try {
      return paramk.c(paramInt1, paramInt2, f.a);
    } catch (a a1) {
      return "";
    } 
  }
  
  private static void a(b paramb, int paramInt1, k paramk, int paramInt2, Boolean paramBoolean, int paramInt3) {
    int i;
    for (i = 0; i < paramInt2; i = j + 1) {
      int j = i;
      if (paramb.u(i))
        if (i < paramInt2 - 1 && paramb.u(i + 1)) {
          Integer integer;
          if (paramBoolean.booleanValue()) {
            Short short_ = Short.valueOf(paramk.e(i * 2 + paramInt1));
          } else {
            integer = Integer.valueOf(paramk.k(i * 2 + paramInt1));
          } 
          paramb.a(i, integer);
          j = i;
        } else {
          if (paramBoolean.booleanValue()) {
            short[] arrayOfShort = new short[paramInt3];
            for (j = 0; j < arrayOfShort.length; j++)
              arrayOfShort[j] = paramk.e((i + j) * 2 + paramInt1); 
            paramb.b(i, arrayOfShort);
          } else {
            int[] arrayOfInt = new int[paramInt3];
            for (j = 0; j < arrayOfInt.length; j++)
              arrayOfInt[j] = paramk.k((i + j) * 2 + paramInt1); 
            paramb.b(i, arrayOfInt);
          } 
          j = i + paramInt3 - 1;
        }  
    } 
  }
  
  private static void a(l paraml, int paramInt, k paramk) {
    paramInt += 8;
    try {
      paraml.a(0, paramk.d(paramInt, 8, f.a));
      paraml.a(9, paramk.m(paramInt + 9));
      paraml.a(10, paramk.m(paramInt + 10));
      paraml.a(12, paramk.k(paramInt + 12));
      paraml.a(14, paramk.k(paramInt + 14));
      paraml.a(16, paramk.k(paramInt + 16));
      paraml.a(18, paramk.a(paramInt + 18, 2));
      paraml.a(20, paramk.a(paramInt + 20, 4));
      paraml.a(24, paramk.k(paramInt + 24));
      paraml.a(27, paramk.m(paramInt + 27));
      paraml.a(28, paramk.m(paramInt + 28));
      paraml.a(29, paramk.m(paramInt + 29));
      paraml.a(30, paramk.k(paramInt + 30));
      paraml.a(32, paramk.l(paramInt + 32));
      paraml.a(36, paramk.e(paramInt + 36));
      paraml.a(56, paramk.m(paramInt + 56));
      paraml.a(64, paramk.m(paramInt + 64));
      paraml.a(92, paramk.m(paramInt + 92));
      paraml.a(93, paramk.m(paramInt + 93));
      paraml.a(94, paramk.k(paramInt + 94));
      paraml.a(96, paramk.k(paramInt + 96));
      paraml.a(98, paramk.k(paramInt + 98));
      paraml.a(100, paramk.k(paramInt + 100));
      paraml.a(102, paramk.k(paramInt + 102));
      paraml.a(104, paramk.k(paramInt + 104));
      paraml.a(107, paramk.i(paramInt + 107));
      return;
    } catch (IOException iOException) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Error processing Kodak makernote data: ");
      stringBuilder.append(iOException.getMessage());
      paraml.a(stringBuilder.toString());
      return;
    } 
  }
  
  private static void a(r0 paramr0, int paramInt, k paramk) {
    paramr0.a(0, Integer.valueOf(paramk.k(paramInt)));
    int i = paramInt + 2;
    int j = paramk.k(i);
    int m = paramk.k(i + 2);
    int i1 = paramk.k(i + 4);
    String str1 = String.format("%04X", new Object[] { Integer.valueOf(paramk.k(i + 6)) });
    String str2 = String.format("%04X", new Object[] { Integer.valueOf(paramk.k(i + 8)) });
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(str1);
    stringBuilder.append(str2);
    str2 = stringBuilder.toString();
    try {
      Integer integer = Integer.valueOf(Integer.parseInt(str2));
    } catch (NumberFormatException numberFormatException) {
      numberFormatException = null;
    } 
    if (numberFormatException != null) {
      paramr0.a(2, String.format("%d.%d.%d.%s", new Object[] { Integer.valueOf(j), Integer.valueOf(m), Integer.valueOf(i1), numberFormatException }));
    } else {
      paramr0.a(2, String.format("%d.%d.%d", new Object[] { Integer.valueOf(j), Integer.valueOf(m), Integer.valueOf(i1) }));
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("Error processing Reconyx HyperFire makernote data: build '");
      stringBuilder1.append(str2);
      stringBuilder1.append("' is not in the expected format and will be omitted from Firmware Version.");
      paramr0.a(stringBuilder1.toString());
    } 
    paramr0.a(12, String.valueOf((char)paramk.k(paramInt + 12)));
    i = paramInt + 14;
    paramr0.a(14, new int[] { paramk.k(i), paramk.k(i + 2) });
    i = paramInt + 18;
    paramr0.a(18, (paramk.k(i) << 16) + paramk.k(i + 2));
    int i3 = paramInt + 22;
    i = paramk.k(i3);
    j = paramk.k(i3 + 2);
    m = paramk.k(i3 + 4);
    i1 = paramk.k(i3 + 6);
    int i2 = paramk.k(i3 + 8);
    i3 = paramk.k(i3 + 10);
    if (i >= 0 && i < 60 && j >= 0 && j < 60 && m >= 0 && m < 24 && i1 >= 1 && i1 < 13 && i2 >= 1 && i2 < 32 && i3 >= 1 && i3 <= 9999) {
      paramr0.a(22, String.format("%4d:%2d:%2d %2d:%2d:%2d", new Object[] { Integer.valueOf(i3), Integer.valueOf(i1), Integer.valueOf(i2), Integer.valueOf(m), Integer.valueOf(j), Integer.valueOf(i) }));
    } else {
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("Error processing Reconyx HyperFire makernote data: Date/Time Original ");
      stringBuilder1.append(i3);
      stringBuilder1.append("-");
      stringBuilder1.append(i1);
      stringBuilder1.append("-");
      stringBuilder1.append(i2);
      stringBuilder1.append(" ");
      stringBuilder1.append(m);
      stringBuilder1.append(":");
      stringBuilder1.append(j);
      stringBuilder1.append(":");
      stringBuilder1.append(i);
      stringBuilder1.append(" is not a valid date/time.");
      paramr0.a(stringBuilder1.toString());
    } 
    paramr0.a(36, paramk.k(paramInt + 36));
    paramr0.a(38, paramk.e(paramInt + 38));
    paramr0.a(40, paramk.e(paramInt + 40));
    paramr0.a(42, new h(paramk.a(paramInt + 42, 28), f.e));
    paramr0.a(72, paramk.k(paramInt + 72));
    paramr0.a(74, paramk.k(paramInt + 74));
    paramr0.a(76, paramk.k(paramInt + 76));
    paramr0.a(78, paramk.k(paramInt + 78));
    paramr0.a(80, paramk.k(paramInt + 80));
    paramr0.a(82, paramk.k(paramInt + 82));
    double d = paramk.k(paramInt + 84);
    Double.isNaN(d);
    paramr0.a(84, d / 1000.0D);
    paramr0.a(86, paramk.a(paramInt + 86, 44, f.a));
  }
  
  private static void a(t0 paramt0, int paramInt, k paramk) {
    paramt0.a(0, paramk.c(paramInt, 9, f.a));
    paramt0.a(52, paramk.c(paramInt + 52, 1, f.a));
    int i = paramInt + 53;
    paramt0.a(53, new int[] { paramk.b(i), paramk.b(i + 1) });
    i = paramInt + 59;
    paramk.b(i);
    paramk.b(i + 1);
    paramk.b(i + 2);
    paramk.b(i + 3);
    paramk.b(i + 4);
    paramt0.a(67, paramk.b(paramInt + 67));
    paramt0.a(72, paramk.b(paramInt + 72));
    paramt0.a(75, new h(paramk.a(paramInt + 75, 14), f.a));
    paramt0.a(80, paramk.a(paramInt + 80, 20, f.a));
  }
  
  private static void a(z paramz, int paramInt1, k paramk, int paramInt2) {
    String str;
    if (paramInt2 == 0) {
      str = "Empty PrintIM data";
    } else if (paramInt2 <= 15) {
      str = "Bad PrintIM data";
    } else {
      String str1 = str.c(paramInt1, 12, f.a);
      if (!str1.startsWith("PrintIM")) {
        str = "Invalid PrintIM header";
      } else {
        int j = paramInt1 + 14;
        int i = str.k(j);
        if (paramInt2 < i * 6 + 16) {
          boolean bool = str.b();
          str.a(str.b() ^ true);
          i = str.k(j);
          if (paramInt2 < i * 6 + 16) {
            str = "Bad PrintIM size";
          } else {
            Boolean bool1 = Boolean.valueOf(bool);
            paramInt2 = i;
            str1 = str1.substring(8, 12);
            i = 0;
            paramz.a(0, str1);
          } 
        } else {
          Object object = null;
          paramInt2 = i;
          str1 = str1.substring(8, 12);
          i = 0;
          paramz.a(0, str1);
        } 
      } 
    } 
    paramz.a(str);
  }
  
  private boolean a(int paramInt1, Set<Integer> paramSet, int paramInt2, k paramk) {
    String str1;
    int i = paramInt1;
    b b = this.d.b(d.class);
    if (b == null) {
      b = null;
    } else {
      str1 = b.p(271);
    } 
    String str2 = a(paramk, i, 2);
    String str3 = a(paramk, i, 3);
    String str4 = a(paramk, i, 4);
    String str5 = a(paramk, i, 5);
    String str6 = a(paramk, i, 6);
    String str7 = a(paramk, i, 7);
    String str8 = a(paramk, i, 8);
    String str9 = a(paramk, i, 9);
    String str10 = a(paramk, i, 10);
    String str11 = a(paramk, i, 12);
    boolean bool = paramk.b();
    if ("OLYMP\000".equals(str6) || "EPSON".equals(str5) || "AGFA".equals(str4)) {
      a(f0.class);
    } else {
      t0 t0;
      if ("OLYMPUS\000II".equals(str10)) {
        a(f0.class);
        paramInt1 = i + 12;
      } else {
        if (str1 != null && str1.toUpperCase().startsWith("MINOLTA")) {
          a(f0.class);
          paramInt1 = i;
        } else {
          if (str1 != null && str1.trim().toUpperCase().startsWith("NIKON")) {
            if ("Nikon".equals(str5)) {
              paramInt1 = paramk.m(i + 6);
              if (paramInt1 != 1) {
                if (paramInt1 != 2) {
                  this.c.a("Unsupported Nikon makernote data ignored.");
                } else {
                  a(v.class);
                  paramInt1 = i + 18;
                  i += 10;
                  e.a((b)this, paramk, paramSet, paramInt1, i);
                } 
              } else {
                a(t.class);
                paramInt1 = 8;
              } 
            } else {
              a(v.class);
              paramInt1 = i;
              e.a((b)this, paramk, paramSet, paramInt1, paramInt2);
            } 
          } else {
            if ("SONY CAM".equals(str8) || "SONY DSC".equals(str8)) {
              a(d1.class);
            } else {
              if (str1 != null && str1.startsWith("SONY") && !Arrays.equals(paramk.a(i, 2), new byte[] { 1, 0 })) {
                a(d1.class);
                paramInt1 = i;
              } else if ("SEMC MS\000\000\000\000\000".equals(str11)) {
                paramk.a(true);
                a(f1.class);
                paramInt1 = i + 20;
              } else {
                if ("SIGMA\000\000\000".equals(str8) || "FOVEON\000\000".equals(str8)) {
                  a(b1.class);
                  paramInt1 = 10;
                } else {
                  l l;
                  if ("KDK".equals(str3)) {
                    paramk.a(str7.equals("KDK INFO"));
                    l = new l();
                    this.d.a((b)l);
                    a(l, i, paramk);
                  } else {
                    Class<d> clazz1;
                    Class<x0> clazz;
                    if ("Canon".equalsIgnoreCase(str1)) {
                      clazz1 = d.class;
                    } else {
                      Class<f> clazz2;
                      if (clazz1 != null && clazz1.toUpperCase().startsWith("CASIO")) {
                        if ("QVC\000\000\000".equals(str6)) {
                          a(h.class);
                          paramInt1 = 6;
                        } else {
                          clazz2 = f.class;
                          a(clazz2);
                          paramInt1 = i;
                        } 
                      } else {
                        if ("FUJIFILM".equals(str8) || "Fujifilm".equalsIgnoreCase((String)clazz2)) {
                          paramk.a(false);
                          paramInt1 = paramk.g(i + 8) + i;
                          a(j.class);
                        } else {
                          if ("KYOCERA".equals(str7)) {
                            a(n.class);
                            paramInt1 = i + 22;
                          } else {
                            Class<r> clazz3;
                            if ("LEICA".equals(str5)) {
                              paramk.a(false);
                              if ("LEICA\000\001\000".equals(str8) || "LEICA\000\004\000".equals(str8) || "LEICA\000\005\000".equals(str8) || "LEICA\000\006\000".equals(str8) || "LEICA\000\007\000".equals(str8)) {
                                clazz3 = r.class;
                              } else {
                                if ("Leica Camera AG".equals(clazz3)) {
                                  a(p.class);
                                } else if ("LEICA".equals(clazz3)) {
                                  a(n0.class);
                                } else {
                                  return false;
                                } 
                                paramInt1 = i + 8;
                                e.a((b)this, paramk, (Set)l, paramInt1, paramInt2);
                              } 
                            } else {
                              if ("Panasonic\000\000\000".equals(str11)) {
                                a(n0.class);
                              } else {
                                if ("AOC\000".equals(str4)) {
                                  a(h.class);
                                  paramInt1 = i + 6;
                                } else {
                                  if (clazz3 != null && (clazz3.toUpperCase().startsWith("PENTAX") || clazz3.toUpperCase().startsWith("ASAHI"))) {
                                    a(p0.class);
                                    e.a((b)this, paramk, (Set)l, i, i);
                                  } else {
                                    Class<z0> clazz4;
                                    if ("SANYO\000\001\000".equals(str8)) {
                                      clazz4 = z0.class;
                                    } else {
                                      Class<v0> clazz5;
                                      if (clazz4 != null && clazz4.toLowerCase().startsWith("ricoh")) {
                                        if (!str2.equals("Rv")) {
                                          if (str3.equals("Rev"))
                                            return false; 
                                          if (str5.equalsIgnoreCase("Ricoh")) {
                                            paramk.a(true);
                                            clazz5 = v0.class;
                                          } else {
                                            paramk.a(bool);
                                            return true;
                                          } 
                                        } else {
                                          return false;
                                        } 
                                      } else {
                                        if (str10.equals("Apple iOS\000")) {
                                          boolean bool1 = paramk.b();
                                          paramk.a(true);
                                          a(b.class);
                                          e.a((b)this, paramk, (Set)l, i + 14, i);
                                          paramk.a(bool1);
                                        } else if (paramk.k(i) == 61697) {
                                          r0 r0 = new r0();
                                          this.d.a((b)r0);
                                          a(r0, i, paramk);
                                        } else if (str9.equalsIgnoreCase("RECONYXUF")) {
                                          t0 = new t0();
                                          this.d.a((b)t0);
                                          a(t0, i, paramk);
                                        } else {
                                          if ("SAMSUNG".equals(clazz5)) {
                                            clazz = x0.class;
                                          } else {
                                            return false;
                                          } 
                                          a(clazz);
                                          paramInt1 = i;
                                        } 
                                        paramk.a(bool);
                                        return true;
                                      } 
                                    } 
                                    a(clazz);
                                    paramInt1 = i + 8;
                                  } 
                                  paramk.a(bool);
                                  return true;
                                } 
                                e.a((b)this, paramk, (Set)t0, paramInt1, i);
                              } 
                              paramInt1 = 12;
                            } 
                            a(clazz);
                            paramInt1 = i + 8;
                          } 
                          e.a((b)this, paramk, (Set)t0, paramInt1, paramInt2);
                        } 
                        e.a((b)this, paramk, (Set)t0, paramInt1, i);
                      } 
                      paramInt1 = i + paramInt1;
                    } 
                    a(clazz);
                    paramInt1 = i;
                  } 
                  paramk.a(bool);
                  return true;
                } 
                paramInt1 = i + paramInt1;
              } 
              e.a((b)this, paramk, (Set)t0, paramInt1, paramInt2);
            } 
            paramInt1 = 12;
          } 
          paramk.a(bool);
          return true;
        } 
        e.a((b)this, paramk, (Set)t0, paramInt1, paramInt2);
      } 
      e.a((b)this, paramk, (Set)t0, paramInt1, i);
    } 
    paramInt1 = 8;
  }
  
  private static boolean a(b paramb, int paramInt) {
    return (paramInt == 50341) ? true : ((paramInt == 3584 && (paramb instanceof h || paramb instanceof n || paramb instanceof v || paramb instanceof f0 || paramb instanceof n0 || paramb instanceof p0 || paramb instanceof v0 || paramb instanceof z0 || paramb instanceof d1)));
  }
  
  public Long a(int paramInt1, int paramInt2, long paramLong) {
    return (paramInt2 == 13) ? Long.valueOf(paramLong * 4L) : ((paramInt2 == 0) ? Long.valueOf(0L) : null);
  }
  
  public void a(int paramInt) {
    if (paramInt != 42)
      if (paramInt != 85) {
        if (paramInt != 20306 && paramInt != 21330)
          throw new d(String.format("Unexpected TIFF marker: 0x%X", new Object[] { Integer.valueOf(paramInt) })); 
      } else {
        Class<t> clazz1 = t.class;
        a(clazz1);
      }  
    Class<d> clazz = d.class;
    a(clazz);
  }
  
  public boolean a() {
    Class<m> clazz;
    b b = this.c;
    if (b instanceof d || b instanceof f) {
      if (this.c.a(297)) {
        Class<f> clazz1 = f.class;
      } else {
        clazz = m.class;
      } 
      a(clazz);
      return true;
    } 
    return (clazz instanceof m);
  }
  
  public boolean a(int paramInt1, Set<Integer> paramSet, int paramInt2, k paramk, int paramInt3, int paramInt4) {
    z z;
    if (paramInt3 == 0) {
      if (this.c.a(paramInt3))
        return false; 
      if (paramInt4 == 0)
        return true; 
    } 
    if (paramInt3 == 37500 && this.c instanceof k)
      return a(paramInt1, paramSet, paramInt2, paramk); 
    if (paramInt3 == 33723 && this.c instanceof d) {
      if (paramk.i(paramInt1) == 28) {
        byte[] arrayOfByte = paramk.a(paramInt1, paramInt4);
        (new c()).a((o)new e.d.b.n(arrayOfByte), this.d, arrayOfByte.length, this.c);
        return true;
      } 
      return false;
    } 
    if (paramInt3 == 700 && this.c instanceof d) {
      (new c()).a(paramk.b(paramInt1, paramInt4), this.d, this.c);
      return true;
    } 
    if (a(this.c, paramInt3)) {
      z = new z();
      z.a(this.c);
      this.d.a(z);
      a(z, paramInt1, paramk, paramInt4);
      return true;
    } 
    if (this.c instanceof f0)
      if (paramInt3 != 8208) {
        if (paramInt3 != 8224) {
          if (paramInt3 != 8256) {
            if (paramInt3 != 8272) {
              if (paramInt3 != 12288) {
                if (paramInt3 != 16384) {
                  if (paramInt3 != 8240) {
                    if (paramInt3 == 8241) {
                      a(h0.class);
                      e.a((b)this, paramk, (Set)z, paramInt1, paramInt2);
                      return true;
                    } 
                  } else {
                    a(j0.class);
                    e.a((b)this, paramk, (Set)z, paramInt1, paramInt2);
                    return true;
                  } 
                } else {
                  a(f0.class);
                  e.a((b)this, paramk, (Set)z, paramInt1, paramInt2);
                  return true;
                } 
              } else {
                a(l0.class);
                e.a((b)this, paramk, (Set)z, paramInt1, paramInt2);
                return true;
              } 
            } else {
              a(b0.class);
              e.a((b)this, paramk, (Set)z, paramInt1, paramInt2);
              return true;
            } 
          } else {
            a(d0.class);
            e.a((b)this, paramk, (Set)z, paramInt1, paramInt2);
            return true;
          } 
        } else {
          a(x.class);
          e.a((b)this, paramk, (Set)z, paramInt1, paramInt2);
          return true;
        } 
      } else {
        a(z.class);
        e.a((b)this, paramk, (Set)z, paramInt1, paramInt2);
        return true;
      }  
    if (this.c instanceof t)
      if (paramInt3 != 19) {
        if (paramInt3 != 39) {
          if (paramInt3 == 281) {
            r r = new r();
            r.a(this.c);
            this.d.a(r);
            a(r, paramInt1, paramk, paramInt4, Boolean.valueOf(true), 1);
            return true;
          } 
        } else {
          v v = new v();
          v.a(this.c);
          this.d.a(v);
          a(v, paramInt1, paramk, paramInt4, Boolean.valueOf(false), 3);
          return true;
        } 
      } else {
        x x = new x();
        x.a(this.c);
        this.d.a(x);
        a(x, paramInt1, paramk, paramInt4, Boolean.valueOf(false), 2);
        return true;
      }  
    if (paramInt3 == 46 && this.c instanceof t) {
      String str;
      b b;
      StringBuilder stringBuilder;
      ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(paramk.a(paramInt1, paramInt4));
      try {
        for (b null : a.a(byteArrayInputStream).a()) {
          b.a(this.c);
          this.d.a(b);
        } 
        return true;
      } catch (b b1) {
        b = this.c;
        stringBuilder = new StringBuilder();
        stringBuilder.append("Error processing JpgFromRaw: ");
        str = b1.getMessage();
      } catch (IOException iOException) {
        b = this.c;
        stringBuilder = new StringBuilder();
        stringBuilder.append("Error reading JpgFromRaw: ");
        str = iOException.getMessage();
      } 
      stringBuilder.append(str);
      b.a(stringBuilder.toString());
    } 
    return false;
  }
  
  public boolean b(int paramInt) {
    if (paramInt == 330) {
      a(k.class);
      return true;
    } 
    b b = this.c;
    if (b instanceof d || b instanceof t) {
      if (paramInt == 34665) {
        a(k.class);
        return true;
      } 
      if (paramInt == 34853) {
        Class<p> clazz = p.class;
        a(clazz);
        return true;
      } 
    } 
    if (this.c instanceof k && paramInt == 40965) {
      Class<h> clazz = h.class;
      a(clazz);
      return true;
    } 
    if (this.c instanceof f0) {
      if (paramInt != 8208) {
        if (paramInt != 8224) {
          if (paramInt != 8256) {
            if (paramInt != 8272) {
              if (paramInt != 12288) {
                if (paramInt != 16384) {
                  if (paramInt != 8240) {
                    if (paramInt != 8241)
                      return false; 
                    Class<h0> clazz7 = h0.class;
                    a(clazz7);
                    return true;
                  } 
                  Class<j0> clazz6 = j0.class;
                  a(clazz6);
                  return true;
                } 
                Class<f0> clazz5 = f0.class;
                a(clazz5);
                return true;
              } 
              Class<l0> clazz4 = l0.class;
              a(clazz4);
              return true;
            } 
            Class<b0> clazz3 = b0.class;
            a(clazz3);
            return true;
          } 
          Class<d0> clazz2 = d0.class;
          a(clazz2);
          return true;
        } 
        Class<x> clazz1 = x.class;
        a(clazz1);
        return true;
      } 
      Class<z> clazz = z.class;
      a(clazz);
      return true;
    } 
    return false;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/o/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */