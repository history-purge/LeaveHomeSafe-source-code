package i.a.a.a;

import i.a.a.e.b;
import i.a.a.e.c;
import i.a.a.e.d;
import i.a.a.e.e;
import i.a.a.e.f;
import i.a.a.e.g;
import i.a.a.e.i;
import i.a.a.e.j;
import i.a.a.e.k;
import i.a.a.e.l;
import i.a.a.h.d;
import i.a.a.h.e;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public class a {
  private RandomAccessFile a = null;
  
  private l b;
  
  public a(RandomAccessFile paramRandomAccessFile) {
    this.a = paramRandomAccessFile;
  }
  
  private i.a.a.e.a a(ArrayList<e> paramArrayList) {
    if (paramArrayList == null)
      return null; 
    for (int i = 0; i < paramArrayList.size(); i++) {
      e e = paramArrayList.get(i);
      if (e != null && e.b() == 39169L) {
        if (e.a() != null) {
          i.a.a.e.a a1 = new i.a.a.e.a();
          a1.a(39169L);
          a1.c(e.c());
          byte[] arrayOfByte1 = e.a();
          a1.d(d.d(arrayOfByte1, 0));
          byte[] arrayOfByte2 = new byte[2];
          System.arraycopy(arrayOfByte1, 2, arrayOfByte2, 0, 2);
          a1.a(new String(arrayOfByte2));
          a1.a(arrayOfByte1[4] & 0xFF);
          a1.b(d.d(arrayOfByte1, 5));
          return a1;
        } 
        throw new i.a.a.c.a("corrput AES extra data records");
      } 
    } 
    return null;
  }
  
  private b a() {
    if (this.a != null) {
      if (this.b.b() != null)
        try {
          b b = new b();
          ArrayList<f> arrayList = new ArrayList();
          d d = this.b.b();
          long l1 = d.f();
          int i = d.h();
          if (this.b.k()) {
            l1 = this.b.h().b();
            i = (int)this.b.h().d();
          } 
          this.a.seek(l1);
          byte[] arrayOfByte1 = new byte[4];
          byte[] arrayOfByte2 = new byte[2];
          int j = 0;
          while (true) {
            if (j < i) {
              f f = new f();
              a(this.a, arrayOfByte1);
              int k = d.a(arrayOfByte1, 0);
              l1 = k;
              boolean bool = true;
              if (l1 == 33639248L) {
                boolean bool1;
                f.g(k);
                a(this.a, arrayOfByte2);
                f.h(d.d(arrayOfByte2, 0));
                a(this.a, arrayOfByte2);
                f.i(d.d(arrayOfByte2, 0));
                a(this.a, arrayOfByte2);
                if ((d.d(arrayOfByte2, 0) & 0x800) != 0) {
                  bool1 = true;
                } else {
                  bool1 = false;
                } 
                f.d(bool1);
                k = arrayOfByte2[0];
                if ((k & 0x1) != 0)
                  f.c(true); 
                f.c((byte[])arrayOfByte2.clone());
                if (k >> 3 == 1) {
                  bool1 = true;
                } else {
                  bool1 = false;
                } 
                f.a(bool1);
                a(this.a, arrayOfByte2);
                f.a(d.d(arrayOfByte2, 0));
                a(this.a, arrayOfByte1);
                f.f(d.a(arrayOfByte1, 0));
                a(this.a, arrayOfByte1);
                f.b(d.a(arrayOfByte1, 0));
                f.a((byte[])arrayOfByte1.clone());
                a(this.a, arrayOfByte1);
                f.a(d.b(a(arrayOfByte1), 0));
                a(this.a, arrayOfByte1);
                f.d(d.b(a(arrayOfByte1), 0));
                a(this.a, arrayOfByte2);
                k = d.d(arrayOfByte2, 0);
                f.e(k);
                a(this.a, arrayOfByte2);
                f.d(d.d(arrayOfByte2, 0));
                a(this.a, arrayOfByte2);
                int m = d.d(arrayOfByte2, 0);
                f.a(new String(arrayOfByte2));
                a(this.a, arrayOfByte2);
                f.b(d.d(arrayOfByte2, 0));
                a(this.a, arrayOfByte2);
                f.d((byte[])arrayOfByte2.clone());
                a(this.a, arrayOfByte1);
                f.b((byte[])arrayOfByte1.clone());
                a(this.a, arrayOfByte1);
                f.c(d.b(a(arrayOfByte1), 0) & 0xFFFFFFFFL);
                if (k > 0) {
                  String str;
                  byte[] arrayOfByte = new byte[k];
                  a(this.a, arrayOfByte);
                  if (e.h(this.b.c())) {
                    str = new String(arrayOfByte, this.b.c());
                  } else {
                    str = e.a((byte[])str, f.x());
                  } 
                  if (str != null) {
                    StringBuilder stringBuilder1 = new StringBuilder();
                    stringBuilder1.append(":");
                    stringBuilder1.append(System.getProperty("file.separator"));
                    if (str.indexOf(stringBuilder1.toString()) >= 0) {
                      stringBuilder1 = new StringBuilder();
                      stringBuilder1.append(":");
                      stringBuilder1.append(System.getProperty("file.separator"));
                      str = str.substring(str.indexOf(stringBuilder1.toString()) + 2);
                    } 
                    f.b(str);
                    bool1 = bool;
                    if (!str.endsWith("/"))
                      if (str.endsWith("\\")) {
                        bool1 = bool;
                      } else {
                        bool1 = false;
                      }  
                    f.b(bool1);
                  } else {
                    throw new i.a.a.c.a("fileName is null when reading central directory");
                  } 
                } else {
                  f.b(null);
                } 
                c(f);
                d(f);
                b(f);
                if (m > 0) {
                  byte[] arrayOfByte = new byte[m];
                  a(this.a, arrayOfByte);
                  f.a(new String(arrayOfByte));
                } 
                arrayList.add(f);
                j++;
                continue;
              } 
              StringBuilder stringBuilder = new StringBuilder();
              stringBuilder.append("Expected central directory entry not found (#");
              stringBuilder.append(j + 1);
              stringBuilder.append(")");
              throw new i.a.a.c.a(stringBuilder.toString());
            } 
            b.a(arrayList);
            c c = new c();
            a(this.a, arrayOfByte1);
            i = d.a(arrayOfByte1, 0);
            if (i != 84233040L)
              return b; 
            c.a(i);
            a(this.a, arrayOfByte2);
            i = d.d(arrayOfByte2, 0);
            c.b(i);
            if (i > 0) {
              byte[] arrayOfByte = new byte[i];
              a(this.a, arrayOfByte);
              c.a(new String(arrayOfByte));
            } 
            return b;
          } 
        } catch (IOException iOException) {
          throw new i.a.a.c.a(iOException);
        }  
      throw new i.a.a.c.a("EndCentralRecord was null, maybe a corrupt zip file");
    } 
    i.a.a.c.a a1 = new i.a.a.c.a("random access file was null", 3);
    throw a1;
  }
  
  private k a(ArrayList<e> paramArrayList, long paramLong1, long paramLong2, long paramLong3, int paramInt) {
    int i;
    for (i = 0; i < paramArrayList.size(); i++) {
      e e = paramArrayList.get(i);
      if (e != null && e.b() == 1L) {
        k k = new k();
        byte[] arrayOfByte1 = e.a();
        if (e.c() <= 0)
          break; 
        byte[] arrayOfByte2 = new byte[8];
        byte[] arrayOfByte3 = new byte[4];
        if ((paramLong1 & 0xFFFFL) == 65535L && e.c() > 0) {
          System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, 8);
          k.c(d.b(arrayOfByte2, 0));
          m = 8;
          n = 1;
        } else {
          m = 0;
          n = 0;
        } 
        int j = m;
        i = n;
        if ((paramLong2 & 0xFFFFL) == 65535L) {
          j = m;
          i = n;
          if (m < e.c()) {
            System.arraycopy(arrayOfByte1, m, arrayOfByte2, 0, 8);
            k.a(d.b(arrayOfByte2, 0));
            j = m + 8;
            i = 1;
          } 
        } 
        int n = j;
        int m = i;
        if ((paramLong3 & 0xFFFFL) == 65535L) {
          n = j;
          m = i;
          if (j < e.c()) {
            System.arraycopy(arrayOfByte1, j, arrayOfByte2, 0, 8);
            k.b(d.b(arrayOfByte2, 0));
            n = j + 8;
            m = 1;
          } 
        } 
        i = m;
        if ((paramInt & 0xFFFF) == 65535) {
          i = m;
          if (n < e.c()) {
            System.arraycopy(arrayOfByte1, n, arrayOfByte3, 0, 4);
            k.a(d.a(arrayOfByte3, 0));
            i = 1;
          } 
        } 
        if (i != 0)
          return k; 
        break;
      } 
    } 
    return null;
  }
  
  private ArrayList a(int paramInt) {
    if (paramInt <= 0)
      return null; 
    try {
      byte[] arrayOfByte = new byte[paramInt];
      this.a.read(arrayOfByte);
      ArrayList<e> arrayList = new ArrayList();
      int i = 0;
      while (i < paramInt) {
        e e = new e();
        e.a(d.d(arrayOfByte, i));
        int k = i + 2;
        int j = d.d(arrayOfByte, k);
        i = j;
        if (j + 2 > paramInt) {
          j = d.c(arrayOfByte, k);
          i = j;
          if (j + 2 > paramInt)
            break; 
        } 
        e.a(i);
        j = k + 2;
        if (i > 0) {
          byte[] arrayOfByte1 = new byte[i];
          System.arraycopy(arrayOfByte, j, arrayOfByte1, 0, i);
          e.a(arrayOfByte1);
        } 
        i = j + i;
        arrayList.add(e);
      } 
      paramInt = arrayList.size();
      return (paramInt > 0) ? arrayList : null;
    } catch (IOException iOException) {
      i.a.a.c.a a1 = new i.a.a.c.a(iOException);
      throw a1;
    } 
  }
  
  private void a(g paramg) {
    if (paramg != null) {
      if (paramg.f() != null) {
        if (paramg.f().size() <= 0)
          return; 
        i.a.a.e.a a1 = a(paramg.f());
        if (a1 != null) {
          paramg.a(a1);
          paramg.b(99);
        } 
      } 
      return;
    } 
    throw new i.a.a.c.a("file header is null in reading Zip64 Extended Info");
  }
  
  private byte[] a(RandomAccessFile paramRandomAccessFile, byte[] paramArrayOfbyte) {
    try {
      if (paramRandomAccessFile.read(paramArrayOfbyte, 0, paramArrayOfbyte.length) != -1)
        return paramArrayOfbyte; 
      throw new i.a.a.c.a("unexpected end of file when reading short buff");
    } catch (IOException iOException) {
      throw new i.a.a.c.a("IOException when reading short buff", iOException);
    } 
  }
  
  private byte[] a(byte[] paramArrayOfbyte) {
    if (paramArrayOfbyte != null) {
      if (paramArrayOfbyte.length == 4)
        return new byte[] { paramArrayOfbyte[0], paramArrayOfbyte[1], paramArrayOfbyte[2], paramArrayOfbyte[3], 0, 0, 0, 0 }; 
      throw new i.a.a.c.a("invalid byte length, cannot expand to 8 bytes");
    } 
    throw new i.a.a.c.a("input parameter is null, cannot expand to 8 bytes");
  }
  
  private d b() {
    RandomAccessFile randomAccessFile = this.a;
    if (randomAccessFile != null)
      try {
        byte[] arrayOfByte = new byte[4];
        long l1 = randomAccessFile.length() - 22L;
        d d = new d();
        int i = 0;
        while (true) {
          this.a.seek(l1);
          if (d.a(this.a, arrayOfByte) == 101010256L || ++i > 3000) {
            if (d.a(arrayOfByte, 0) == 101010256L) {
              arrayOfByte = new byte[4];
              byte[] arrayOfByte1 = new byte[2];
              d.b(101010256L);
              a(this.a, arrayOfByte1);
              d.b(d.d(arrayOfByte1, 0));
              a(this.a, arrayOfByte1);
              d.c(d.d(arrayOfByte1, 0));
              a(this.a, arrayOfByte1);
              d.f(d.d(arrayOfByte1, 0));
              a(this.a, arrayOfByte1);
              d.e(d.d(arrayOfByte1, 0));
              a(this.a, arrayOfByte);
              d.d(d.a(arrayOfByte, 0));
              a(this.a, arrayOfByte);
              d.a(d.b(a(arrayOfByte), 0));
              a(this.a, arrayOfByte1);
              i = d.d(arrayOfByte1, 0);
              d.a(i);
              if (i > 0) {
                arrayOfByte = new byte[i];
                a(this.a, arrayOfByte);
                d.a(new String(arrayOfByte));
                d.a(arrayOfByte);
              } else {
                d.a(null);
              } 
              if (d.d() > 0) {
                this.b.a(true);
                return d;
              } 
              this.b.a(false);
              return d;
            } 
            throw new i.a.a.c.a("zip headers not found. probably not a zip file");
          } 
          l1--;
        } 
      } catch (IOException iOException) {
        throw new i.a.a.c.a("Probably not a zip file or a corrupted zip file", iOException, 4);
      }  
    i.a.a.c.a a1 = new i.a.a.c.a("random access file was null", 3);
    throw a1;
  }
  
  private void b(f paramf) {
    if (paramf != null) {
      if (paramf.i() != null) {
        if (paramf.i().size() <= 0)
          return; 
        i.a.a.e.a a1 = a(paramf.i());
        if (a1 != null) {
          paramf.a(a1);
          paramf.c(99);
        } 
      } 
      return;
    } 
    throw new i.a.a.c.a("file header is null in reading Zip64 Extended Info");
  }
  
  private void b(g paramg) {
    if (this.a != null) {
      if (paramg != null) {
        int i = paramg.g();
        if (i <= 0)
          return; 
        paramg.a(a(i));
        return;
      } 
      throw new i.a.a.c.a("file header is null");
    } 
    throw new i.a.a.c.a("invalid file handler when trying to read extra data record");
  }
  
  private i c() {
    if (this.a != null)
      try {
        i i = new i();
        e();
        byte[] arrayOfByte1 = new byte[4];
        byte[] arrayOfByte2 = new byte[8];
        a(this.a, arrayOfByte1);
        long l1 = d.a(arrayOfByte1, 0);
        if (l1 == 117853008L) {
          this.b.b(true);
          i.b(l1);
          a(this.a, arrayOfByte1);
          i.a(d.a(arrayOfByte1, 0));
          a(this.a, arrayOfByte2);
          i.a(d.b(arrayOfByte2, 0));
          a(this.a, arrayOfByte1);
          i.b(d.a(arrayOfByte1, 0));
          return i;
        } 
        this.b.b(false);
        return null;
      } catch (Exception exception) {
        throw new i.a.a.c.a(exception);
      }  
    throw new i.a.a.c.a("invalid file handler when trying to read Zip64EndCentralDirLocator");
  }
  
  private void c(f paramf) {
    if (this.a != null) {
      if (paramf != null) {
        int i = paramf.j();
        if (i <= 0)
          return; 
        paramf.a(a(i));
        return;
      } 
      throw new i.a.a.c.a("file header is null");
    } 
    throw new i.a.a.c.a("invalid file handler when trying to read extra data record");
  }
  
  private void c(g paramg) {
    if (paramg != null) {
      if (paramg.f() != null) {
        if (paramg.f().size() <= 0)
          return; 
        k k = a(paramg.f(), paramg.o(), paramg.b(), -1L, -1);
        if (k != null) {
          paramg.a(k);
          if (k.d() != -1L)
            paramg.d(k.d()); 
          if (k.a() != -1L)
            paramg.a(k.a()); 
        } 
      } 
      return;
    } 
    throw new i.a.a.c.a("file header is null in reading Zip64 Extended Info");
  }
  
  private j d() {
    if (this.b.g() != null) {
      long l1 = this.b.g().b();
      if (l1 >= 0L) {
        try {
          this.a.seek(l1);
          j j = new j();
          byte[] arrayOfByte1 = new byte[2];
          byte[] arrayOfByte2 = new byte[4];
          byte[] arrayOfByte3 = new byte[8];
          a(this.a, arrayOfByte2);
          l1 = d.a(arrayOfByte2, 0);
          if (l1 == 101075792L) {
            j.b(l1);
            a(this.a, arrayOfByte3);
            j.d(d.b(arrayOfByte3, 0));
            a(this.a, arrayOfByte1);
            j.c(d.d(arrayOfByte1, 0));
            a(this.a, arrayOfByte1);
            j.d(d.d(arrayOfByte1, 0));
            a(this.a, arrayOfByte2);
            j.a(d.a(arrayOfByte2, 0));
            a(this.a, arrayOfByte2);
            j.b(d.a(arrayOfByte2, 0));
            a(this.a, arrayOfByte3);
            j.f(d.b(arrayOfByte3, 0));
            a(this.a, arrayOfByte3);
            j.e(d.b(arrayOfByte3, 0));
            a(this.a, arrayOfByte3);
            j.c(d.b(arrayOfByte3, 0));
            a(this.a, arrayOfByte3);
            j.a(d.b(arrayOfByte3, 0));
            l1 = j.c() - 44L;
            if (l1 > 0L) {
              arrayOfByte1 = new byte[(int)l1];
              a(this.a, arrayOfByte1);
              j.a(arrayOfByte1);
              return j;
            } 
          } else {
            throw new i.a.a.c.a("invalid signature for zip64 end of central directory record");
          } 
        } catch (IOException iOException) {
          throw new i.a.a.c.a(iOException);
        } 
      } else {
        throw new i.a.a.c.a("invalid offset for start of end of central directory record");
      } 
    } else {
      throw new i.a.a.c.a("invalid zip64 end of central directory locator");
    } 
    return (j)iOException;
  }
  
  private void d(f paramf) {
    if (paramf != null) {
      if (paramf.i() != null) {
        if (paramf.i().size() <= 0)
          return; 
        k k = a(paramf.i(), paramf.r(), paramf.b(), paramf.o(), paramf.f());
        if (k != null) {
          paramf.a(k);
          if (k.d() != -1L)
            paramf.d(k.d()); 
          if (k.a() != -1L)
            paramf.a(k.a()); 
          if (k.c() != -1L)
            paramf.c(k.c()); 
          if (k.b() != -1)
            paramf.b(k.b()); 
        } 
      } 
      return;
    } 
    throw new i.a.a.c.a("file header is null in reading Zip64 Extended Info");
  }
  
  private void e() {
    try {
      byte[] arrayOfByte = new byte[4];
      for (long l1 = this.a.length() - 22L;; l1--) {
        this.a.seek(l1);
        if (d.a(this.a, arrayOfByte) == 101010256L) {
          this.a.seek(this.a.getFilePointer() - 4L - 4L - 8L - 4L - 4L);
          return;
        } 
      } 
    } catch (IOException iOException) {
      i.a.a.c.a a1 = new i.a.a.c.a(iOException);
      throw a1;
    } 
  }
  
  public g a(f paramf) {
    g g;
    if (paramf != null && this.a != null) {
      long l2 = paramf.o();
      long l1 = l2;
      if (paramf.u() != null) {
        l1 = l2;
        if (paramf.u().c() > 0L)
          l1 = paramf.o(); 
      } 
      if (l1 >= 0L) {
        try {
          this.a.seek(l1);
          g = new g();
          byte[] arrayOfByte1 = new byte[2];
          byte[] arrayOfByte2 = new byte[4];
          a(this.a, arrayOfByte2);
          int i = d.a(arrayOfByte2, 0);
          if (i == 67324752L) {
            boolean bool;
            g.f(i);
            a(this.a, arrayOfByte1);
            g.g(d.d(arrayOfByte1, 0));
            a(this.a, arrayOfByte1);
            if ((d.d(arrayOfByte1, 0) & 0x800) != 0) {
              bool = true;
            } else {
              bool = false;
            } 
            g.c(bool);
            byte b = arrayOfByte1[0];
            if ((b & 0x1) != 0)
              g.b(true); 
            g.b(arrayOfByte1);
            String str = Integer.toBinaryString(b);
            if (str.length() >= 4) {
              if (str.charAt(3) == '1') {
                bool = true;
              } else {
                bool = false;
              } 
              g.a(bool);
            } 
            a(this.a, arrayOfByte1);
            g.a(d.d(arrayOfByte1, 0));
            a(this.a, arrayOfByte2);
            g.e(d.a(arrayOfByte2, 0));
            a(this.a, arrayOfByte2);
            g.b(d.a(arrayOfByte2, 0));
            g.a((byte[])arrayOfByte2.clone());
            a(this.a, arrayOfByte2);
            g.a(d.b(a(arrayOfByte2), 0));
            a(this.a, arrayOfByte2);
            g.d(d.b(a(arrayOfByte2), 0));
            a(this.a, arrayOfByte1);
            int k = d.d(arrayOfByte1, 0);
            g.d(k);
            a(this.a, arrayOfByte1);
            int j = d.d(arrayOfByte1, 0);
            g.c(j);
            i = 30;
            if (k > 0) {
              arrayOfByte1 = new byte[k];
              a(this.a, arrayOfByte1);
              String str1 = e.a(arrayOfByte1, g.r());
              if (str1 != null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(":");
                stringBuilder.append(System.getProperty("file.separator"));
                String str2 = str1;
                if (str1.indexOf(stringBuilder.toString()) >= 0) {
                  StringBuilder stringBuilder1 = new StringBuilder();
                  stringBuilder1.append(":");
                  stringBuilder1.append(System.getProperty("file.separator"));
                  str2 = str1.substring(str1.indexOf(stringBuilder1.toString()) + 2);
                } 
                g.a(str2);
                i = 30 + k;
              } else {
                throw new i.a.a.c.a("file name is null, cannot assign file name to local file header");
              } 
            } else {
              g.a(null);
            } 
            b(g);
            g.c(l1 + (i + j));
            g.a(paramf.p());
            c(g);
            a(g);
            if (g.q() && g.e() != 99)
              if ((b & 0x40) == 64) {
                g.b(1);
              } else {
                g.b(0);
              }  
            if (g.d() <= 0L) {
              g.b(paramf.d());
              g.a(paramf.e());
            } 
            if (g.b() <= 0L)
              g.a(paramf.b()); 
            if (g.o() <= 0L) {
              g.d(paramf.r());
              return g;
            } 
          } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("invalid local header signature for file: ");
            stringBuilder.append(paramf.k());
            throw new i.a.a.c.a(stringBuilder.toString());
          } 
        } catch (IOException iOException) {
          throw new i.a.a.c.a(iOException);
        } 
      } else {
        throw new i.a.a.c.a("invalid local header offset");
      } 
    } else {
      throw new i.a.a.c.a("invalid read parameters for local header");
    } 
    return g;
  }
  
  public l a(String paramString) {
    this.b = new l();
    this.b.a(paramString);
    this.b.a(b());
    this.b.a(c());
    if (this.b.k()) {
      l l1;
      boolean bool;
      this.b.a(d());
      if (this.b.h() != null && this.b.h().a() > 0) {
        l1 = this.b;
        bool = true;
      } else {
        l1 = this.b;
        bool = false;
      } 
      l1.a(bool);
    } 
    this.b.a(a());
    return this.b;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/i/a/a/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */