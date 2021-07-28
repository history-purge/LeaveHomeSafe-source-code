package e.d.a.n;

import e.d.b.c;
import e.d.b.f;
import e.d.b.h;
import e.d.b.j;
import e.d.b.k;
import e.d.b.l;
import e.d.b.n;
import e.d.b.o;
import e.d.b.p;
import e.d.b.q;
import e.d.c.b;
import e.d.c.b0.a;
import e.d.c.b0.c;
import e.d.c.e;
import e.d.c.f0.c;
import e.d.c.h;
import e.d.c.r.c;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.zip.InflaterInputStream;
import java.util.zip.ZipException;

public class g {
  private static Set<d> a;
  
  private static Charset b = f.b;
  
  static {
    HashSet<d> hashSet = new HashSet();
    hashSet.add(d.d);
    hashSet.add(d.e);
    hashSet.add(d.m);
    hashSet.add(d.g);
    hashSet.add(d.k);
    hashSet.add(d.h);
    hashSet.add(d.i);
    hashSet.add(d.l);
    hashSet.add(d.q);
    hashSet.add(d.r);
    hashSet.add(d.p);
    hashSet.add(d.o);
    hashSet.add(d.n);
    hashSet.add(d.j);
    a = Collections.unmodifiableSet(hashSet);
  }
  
  public static e a(InputStream paramInputStream) {
    Iterable<b> iterable = (new c()).a((o)new p(paramInputStream), a);
    e e = new e();
    for (b b : iterable) {
      try {
        a(e, b);
      } catch (Exception exception) {
        exception.printStackTrace(System.err);
      } 
    } 
    return e;
  }
  
  private static void a(e parame, b paramb) {
    c c;
    f f;
    d d = paramb.b();
    byte[] arrayOfByte = paramb.a();
    if (d.equals(d.d)) {
      f = new f(arrayOfByte);
      c = new c(d.d);
      c.a(1, f.f());
      c.a(2, f.e());
      c.a(3, f.a());
      c.a(4, f.b().b());
      c.a(5, f.c() & 0xFF);
      c.a(6, f.d());
      c.a(7, f.g());
    } else {
      if (d.equals(d.e)) {
        c = new c(d.e);
        c.a(8, f.length / 3);
      } else if (d.equals(d.m)) {
        c = new c(d.m);
        c.a(9, 1);
      } else {
        if (d.equals(d.k)) {
          f f1 = f[0];
          c = new c(d.k);
          c.a(10, f1);
        } else {
          a a;
          if (d.equals(d.g)) {
            a = new a((byte[])f);
            a a1 = new a();
            a1.a(1, a.g());
            a1.a(2, a.h());
            a1.a(3, a.e());
            a1.a(4, a.f());
            a1.a(5, a.c());
            a1.a(6, a.d());
            a1.a(7, a.a());
            a1.a(8, a.b());
          } else if (d.equals(d.h)) {
            int i = c.a((byte[])a);
            (new n((byte[])a)).d();
            c = new c(d.h);
            double d1 = i;
            Double.isNaN(d1);
            c.a(11, d1 / 100000.0D);
          } else {
            byte b1;
            ArrayList<j> arrayList;
            n n;
            if (d.equals(d.i)) {
              n = new n((byte[])a);
              byte[] arrayOfByte1 = n.b(80);
              c = new c(d.i);
              c.a(12, new h(arrayOfByte1, b));
              if (n.f() == 0) {
                byte[] arrayOfByte2 = n.a(a.length - arrayOfByte1.length + 1 + 1);
                try {
                  InflaterInputStream inflaterInputStream = new InflaterInputStream(new ByteArrayInputStream(arrayOfByte2));
                  (new c()).a((k)new l(inflaterInputStream), parame, (b)c);
                  inflaterInputStream.close();
                } catch (ZipException zipException) {
                  c.a(String.format("Exception decompressing PNG iCCP chunk : %s", new Object[] { zipException.getMessage() }));
                  parame.a((b)c);
                } 
              } else {
                c.a("Invalid compression method value");
              } 
              parame.a((b)c);
              return;
            } 
            if (n.equals(d.l)) {
              c = new c(d.l);
              b1 = 15;
            } else {
              h h;
              if (n.equals(d.q)) {
                n = new n((byte[])zipException);
                h h1 = n.b(80, b);
                String str = h1.toString();
                h = n.b(zipException.length - (h1.a()).length + 1, b);
                arrayList = new ArrayList();
                arrayList.add(new j(str, h));
                c = new c(d.q);
                c.a(13, arrayList);
              } else {
                String str;
                if (h.equals(d.r)) {
                  n n1 = new n((byte[])arrayList);
                  h h1 = n1.b(80, b);
                  str = h1.toString();
                  b1 = n1.f();
                  int i = arrayList.length - (h1.a()).length + 1 + 1;
                  if (b1 == 0) {
                    try {
                      byte[] arrayOfByte1 = q.a(new InflaterInputStream(new ByteArrayInputStream((byte[])arrayList, arrayList.length - i, i)));
                    } catch (ZipException zipException1) {
                      c c1 = new c(d.r);
                      c1.a(String.format("Exception decompressing PNG zTXt chunk with keyword \"%s\": %s", new Object[] { str, zipException1.getMessage() }));
                      parame.a((b)c1);
                      zipException1 = null;
                    } 
                  } else {
                    c = new c(d.r);
                    c.a("Invalid compression method value");
                    parame.a((b)c);
                    c = null;
                  } 
                  if (c != null) {
                    if (str.equals("XML:com.adobe.xmp")) {
                      (new c()).a((byte[])c, parame);
                      return;
                    } 
                    arrayList = new ArrayList<j>();
                    arrayList.add(new j(str, new h((byte[])c, b)));
                    c = new c(d.r);
                  } else {
                    return;
                  } 
                } else if (str.equals(d.p)) {
                  n n1 = new n((byte[])arrayList);
                  h h1 = n1.b(80, b);
                  str = h1.toString();
                  b1 = n1.f();
                  byte b2 = n1.f();
                  byte[] arrayOfByte1 = n1.b(arrayList.length);
                  byte[] arrayOfByte2 = n1.b(arrayList.length);
                  int i = arrayList.length - (h1.a()).length + 1 + 1 + 1 + arrayOfByte1.length + 1 + arrayOfByte2.length + 1;
                  if (b1 == 0) {
                    byte[] arrayOfByte3 = n1.b(i);
                  } else if (b1 == 1) {
                    if (b2 == 0) {
                      try {
                        byte[] arrayOfByte3 = q.a(new InflaterInputStream(new ByteArrayInputStream((byte[])arrayList, arrayList.length - i, i)));
                      } catch (ZipException zipException1) {
                        c c1 = new c(d.p);
                        c1.a(String.format("Exception decompressing PNG iTXt chunk with keyword \"%s\": %s", new Object[] { str, zipException1.getMessage() }));
                        parame.a((b)c1);
                        zipException1 = null;
                      } 
                    } else {
                      c = new c(d.p);
                      c.a("Invalid compression method value");
                      parame.a((b)c);
                    } 
                  } else {
                    c = new c(d.p);
                    c.a("Invalid compression flag value");
                    parame.a((b)c);
                  } 
                  if (c != null) {
                    if (str.equals("XML:com.adobe.xmp")) {
                      (new c()).a((byte[])c, parame);
                      return;
                    } 
                    arrayList = new ArrayList<j>();
                    arrayList.add(new j(str, new h((byte[])c, b)));
                    c = new c(d.p);
                  } else {
                    return;
                  } 
                } else {
                  if (str.equals(d.o)) {
                    n n1 = new n((byte[])arrayList);
                    b1 = n1.h();
                    short s1 = n1.j();
                    short s2 = n1.j();
                    short s3 = n1.j();
                    short s4 = n1.j();
                    short s5 = n1.j();
                    c = new c(d.o);
                    if (h.a(b1, s1 - 1, s2) && h.b(s3, s4, s5)) {
                      c.a(14, String.format("%04d:%02d:%02d %02d:%02d:%02d", new Object[] { Integer.valueOf(b1), Integer.valueOf(s1), Integer.valueOf(s2), Integer.valueOf(s3), Integer.valueOf(s4), Integer.valueOf(s5) }));
                    } else {
                      c.a(String.format("PNG tIME data describes an invalid date/time: year=%d month=%d day=%d hour=%d minute=%d second=%d", new Object[] { Integer.valueOf(b1), Integer.valueOf(s1), Integer.valueOf(s2), Integer.valueOf(s3), Integer.valueOf(s4), Integer.valueOf(s5) }));
                    } 
                    parame.a((b)c);
                    return;
                  } 
                  if (str.equals(d.n)) {
                    n n1 = new n((byte[])arrayList);
                    b1 = n1.d();
                    int i = n1.d();
                    byte b2 = n1.f();
                    c = new c(d.n);
                    c.a(16, b1);
                    c.a(17, i);
                    c.a(18, b2);
                    parame.a((b)c);
                    return;
                  } 
                  if (str.equals(d.j)) {
                    c = new c(d.j);
                    b1 = 19;
                  } else {
                    return;
                  } 
                  c.a(b1, (byte[])arrayList);
                } 
                c.a(13, arrayList);
                parame.a((b)c);
              } 
              parame.a((b)c);
            } 
            c.a(b1, (byte[])arrayList);
          } 
        } 
        parame.a((b)c);
      } 
      parame.a((b)c);
    } 
    parame.a((b)c);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/a/n/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */