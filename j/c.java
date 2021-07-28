package j;

import java.io.Closeable;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

public final class c implements e, d, Cloneable, ByteChannel {
  private static final byte[] e = new byte[] { 
      48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 
      97, 98, 99, 100, 101, 102 };
  
  p c;
  
  long d;
  
  public final byte a(long paramLong) {
    v.a(this.d, paramLong, 1L);
    long l = this.d;
    if (l - paramLong > paramLong)
      for (p p2 = this.c;; p2 = p2.f) {
        int i = p2.c;
        int j = p2.b;
        l = (i - j);
        if (paramLong < l)
          return p2.a[j + (int)paramLong]; 
        paramLong -= l;
      }  
    paramLong -= l;
    p p1 = this.c;
    while (true) {
      p p2 = p1.g;
      int i = p2.c;
      int j = p2.b;
      l = paramLong + (i - j);
      p1 = p2;
      paramLong = l;
      if (l >= 0L)
        return p2.a[j + (int)l]; 
    } 
  }
  
  public int a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    v.a(paramArrayOfbyte.length, paramInt1, paramInt2);
    p p1 = this.c;
    if (p1 == null)
      return -1; 
    paramInt2 = Math.min(paramInt2, p1.c - p1.b);
    System.arraycopy(p1.a, p1.b, paramArrayOfbyte, paramInt1, paramInt2);
    p1.b += paramInt2;
    this.d -= paramInt2;
    if (p1.b == p1.c) {
      this.c = p1.b();
      q.a(p1);
    } 
    return paramInt2;
  }
  
  public long a(byte paramByte) {
    return a(paramByte, 0L, Long.MAX_VALUE);
  }
  
  public long a(byte paramByte, long paramLong1, long paramLong2) {
    long l = 0L;
    if (paramLong1 >= 0L && paramLong2 >= paramLong1) {
      long l1 = this.d;
      if (paramLong2 <= l1)
        l1 = paramLong2; 
      if (paramLong1 == l1)
        return -1L; 
      p p2 = this.c;
      if (p2 == null)
        return -1L; 
      long l2 = this.d;
      paramLong2 = l;
      p p1 = p2;
      if (l2 - paramLong1 < paramLong1) {
        l = l2;
        p1 = p2;
        while (true) {
          p2 = p1;
          paramLong2 = l;
          if (l > paramLong1) {
            p1 = p1.g;
            l -= (p1.c - p1.b);
            continue;
          } 
          break;
        } 
      } else {
        while (true) {
          l = (p1.c - p1.b) + paramLong2;
          p2 = p1;
          if (l < paramLong1) {
            p1 = p1.f;
            paramLong2 = l;
            continue;
          } 
          break;
        } 
      } 
      while (paramLong2 < l1) {
        byte[] arrayOfByte = p2.a;
        int j = (int)Math.min(p2.c, p2.b + l1 - paramLong2);
        int i;
        for (i = (int)(p2.b + paramLong1 - paramLong2); i < j; i++) {
          if (arrayOfByte[i] == paramByte)
            return (i - p2.b) + paramLong2; 
        } 
        paramLong1 = (p2.c - p2.b) + paramLong2;
        p2 = p2.f;
        paramLong2 = paramLong1;
      } 
      return -1L;
    } 
    IllegalArgumentException illegalArgumentException = new IllegalArgumentException(String.format("size=%s fromIndex=%s toIndex=%s", new Object[] { Long.valueOf(this.d), Long.valueOf(paramLong1), Long.valueOf(paramLong2) }));
    throw illegalArgumentException;
  }
  
  public long a(f paramf, long paramLong) {
    long l = 0L;
    if (paramLong >= 0L) {
      p p1;
      p p2 = this.c;
      if (p2 == null)
        return -1L; 
      long l1 = this.d;
      p p3 = p2;
      if (l1 - paramLong < paramLong) {
        p3 = p2;
        while (true) {
          p2 = p3;
          l = l1;
          if (l1 > paramLong) {
            p3 = p3.g;
            l1 -= (p3.c - p3.b);
            continue;
          } 
          break;
        } 
      } else {
        while (true) {
          l1 = (p3.c - p3.b) + l;
          p2 = p3;
          if (l1 < paramLong) {
            p3 = p3.f;
            l = l1;
            continue;
          } 
          break;
        } 
      } 
      if (paramf.s() == 2) {
        byte b1 = paramf.f(0);
        byte b2 = paramf.f(1);
        while (l < this.d) {
          byte[] arrayOfByte = p2.a;
          int i = (int)(p2.b + paramLong - l);
          int j = p2.c;
          while (i < j) {
            byte b = arrayOfByte[i];
            p1 = p2;
            paramLong = l;
            int k = i;
            if (b != b1)
              if (b == b2) {
                p1 = p2;
                paramLong = l;
                k = i;
              } else {
                i++;
                continue;
              }  
            return (k - p1.b) + paramLong;
          } 
          paramLong = (p2.c - p2.b) + l;
          p2 = p2.f;
          l = paramLong;
        } 
      } else {
        byte[] arrayOfByte = p1.c();
        while (l < this.d) {
          byte[] arrayOfByte1 = p2.a;
          int i = (int)(p2.b + paramLong - l);
          int j = p2.c;
          while (i < j) {
            byte b = arrayOfByte1[i];
            int m = arrayOfByte.length;
            int k;
            for (k = 0; k < m; k++) {
              if (b == arrayOfByte[k]) {
                p p4 = p2;
                paramLong = l;
                k = i;
                return (k - p4.b) + paramLong;
              } 
            } 
            i++;
          } 
          paramLong = (p2.c - p2.b) + l;
          p2 = p2.f;
          l = paramLong;
        } 
      } 
      return -1L;
    } 
    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("fromIndex < 0");
    throw illegalArgumentException;
  }
  
  public long a(t paramt) {
    if (paramt != null) {
      long l = 0L;
      while (true) {
        long l1 = paramt.read(this, 8192L);
        if (l1 != -1L) {
          l += l1;
          continue;
        } 
        return l;
      } 
    } 
    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("source == null");
    throw illegalArgumentException;
  }
  
  public final c a(c paramc) {
    if (paramc.c == null) {
      paramc.c = this;
      paramc.d = true;
      return paramc;
    } 
    throw new IllegalStateException("already attached to a buffer");
  }
  
  public final c a(c paramc, long paramLong1, long paramLong2) {
    if (paramc != null) {
      long l1;
      long l2;
      p p2;
      v.a(this.d, paramLong1, paramLong2);
      if (paramLong2 == 0L)
        return this; 
      paramc.d += paramLong2;
      p p1 = this.c;
      while (true) {
        int i = p1.c;
        int j = p1.b;
        p2 = p1;
        l1 = paramLong1;
        l2 = paramLong2;
        if (paramLong1 >= (i - j)) {
          paramLong1 -= (i - j);
          p1 = p1.f;
          continue;
        } 
        break;
      } 
      while (l2 > 0L) {
        p1 = p2.c();
        p1.b = (int)(p1.b + l1);
        p1.c = Math.min(p1.b + (int)l2, p1.c);
        p p3 = paramc.c;
        if (p3 == null) {
          p1.g = p1;
          p1.f = p1;
          paramc.c = p1;
        } else {
          p3.g.a(p1);
        } 
        l2 -= (p1.c - p1.b);
        p2 = p2.f;
        l1 = 0L;
      } 
      return this;
    } 
    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("out == null");
    throw illegalArgumentException;
  }
  
  public c a(f paramf) {
    if (paramf != null) {
      paramf.a(this);
      return this;
    } 
    throw new IllegalArgumentException("byteString == null");
  }
  
  public c a(String paramString) {
    a(paramString, 0, paramString.length());
    return this;
  }
  
  public c a(String paramString, int paramInt1, int paramInt2) {
    if (paramString != null) {
      if (paramInt1 >= 0) {
        if (paramInt2 >= paramInt1) {
          if (paramInt2 <= paramString.length()) {
            while (paramInt1 < paramInt2) {
              int i;
              char c1 = paramString.charAt(paramInt1);
              if (c1 < '') {
                p p1 = b(1);
                byte[] arrayOfByte = p1.a;
                int j = p1.c - paramInt1;
                int k = Math.min(paramInt2, 8192 - j);
                i = paramInt1 + 1;
                arrayOfByte[paramInt1 + j] = (byte)c1;
                for (paramInt1 = i; paramInt1 < k; paramInt1++) {
                  i = paramString.charAt(paramInt1);
                  if (i >= 128)
                    break; 
                  arrayOfByte[paramInt1 + j] = (byte)i;
                } 
                i = p1.c;
                j = j + paramInt1 - i;
                p1.c = i + j;
                this.d += j;
                continue;
              } 
              if (c1 < 'ࠀ') {
                i = c1 >> 6 | 0xC0;
              } else if (c1 < '?' || c1 > '?') {
                writeByte(c1 >> 12 | 0xE0);
                i = c1 >> 6 & 0x3F | 0x80;
              } else {
                int j = paramInt1 + 1;
                if (j < paramInt2) {
                  i = paramString.charAt(j);
                } else {
                  i = 0;
                } 
                if (c1 > '?' || i < 56320 || i > 57343) {
                  writeByte(63);
                  paramInt1 = j;
                  continue;
                } 
                i = ((c1 & 0xFFFF27FF) << 10 | 0xFFFF23FF & i) + 65536;
                writeByte(i >> 18 | 0xF0);
                writeByte(i >> 12 & 0x3F | 0x80);
                writeByte(i >> 6 & 0x3F | 0x80);
                writeByte(i & 0x3F | 0x80);
                paramInt1 += 2;
                continue;
              } 
              writeByte(i);
              writeByte(c1 & 0x3F | 0x80);
              paramInt1++;
            } 
            return this;
          } 
          StringBuilder stringBuilder2 = new StringBuilder();
          stringBuilder2.append("endIndex > string.length: ");
          stringBuilder2.append(paramInt2);
          stringBuilder2.append(" > ");
          stringBuilder2.append(paramString.length());
          throw new IllegalArgumentException(stringBuilder2.toString());
        } 
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("endIndex < beginIndex: ");
        stringBuilder1.append(paramInt2);
        stringBuilder1.append(" < ");
        stringBuilder1.append(paramInt1);
        throw new IllegalArgumentException(stringBuilder1.toString());
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("beginIndex < 0: ");
      stringBuilder.append(paramInt1);
      throw new IllegalArgumentException(stringBuilder.toString());
    } 
    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("string == null");
    throw illegalArgumentException;
  }
  
  public c a(String paramString, int paramInt1, int paramInt2, Charset paramCharset) {
    if (paramString != null) {
      if (paramInt1 >= 0) {
        if (paramInt2 >= paramInt1) {
          byte[] arrayOfByte;
          if (paramInt2 <= paramString.length()) {
            if (paramCharset != null) {
              if (paramCharset.equals(v.a)) {
                a(paramString, paramInt1, paramInt2);
                return this;
              } 
              arrayOfByte = paramString.substring(paramInt1, paramInt2).getBytes(paramCharset);
              write(arrayOfByte, 0, arrayOfByte.length);
              return this;
            } 
            throw new IllegalArgumentException("charset == null");
          } 
          StringBuilder stringBuilder2 = new StringBuilder();
          stringBuilder2.append("endIndex > string.length: ");
          stringBuilder2.append(paramInt2);
          stringBuilder2.append(" > ");
          stringBuilder2.append(arrayOfByte.length());
          throw new IllegalArgumentException(stringBuilder2.toString());
        } 
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("endIndex < beginIndex: ");
        stringBuilder1.append(paramInt2);
        stringBuilder1.append(" < ");
        stringBuilder1.append(paramInt1);
        throw new IllegalArgumentException(stringBuilder1.toString());
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("beginIndex < 0: ");
      stringBuilder.append(paramInt1);
      throw new IllegalAccessError(stringBuilder.toString());
    } 
    throw new IllegalArgumentException("string == null");
  }
  
  public c a(String paramString, Charset paramCharset) {
    a(paramString, 0, paramString.length(), paramCharset);
    return this;
  }
  
  public final f a(int paramInt) {
    return (paramInt == 0) ? f.f : new r(this, paramInt);
  }
  
  public String a(long paramLong, Charset paramCharset) {
    v.a(this.d, 0L, paramLong);
    if (paramCharset != null) {
      if (paramLong <= 2147483647L) {
        if (paramLong == 0L)
          return ""; 
        p p1 = this.c;
        int i = p1.b;
        if (i + paramLong > p1.c)
          return new String(e(paramLong), paramCharset); 
        String str = new String(p1.a, i, (int)paramLong, paramCharset);
        p1.b = (int)(p1.b + paramLong);
        this.d -= paramLong;
        if (p1.b == p1.c) {
          this.c = p1.b();
          q.a(p1);
        } 
        return str;
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("byteCount > Integer.MAX_VALUE: ");
      stringBuilder.append(paramLong);
      throw new IllegalArgumentException(stringBuilder.toString());
    } 
    throw new IllegalArgumentException("charset == null");
  }
  
  public String a(Charset paramCharset) {
    try {
      return a(this.d, paramCharset);
    } catch (EOFException eOFException) {
      throw new AssertionError(eOFException);
    } 
  }
  
  public final void a() {
    try {
      skip(this.d);
      return;
    } catch (EOFException eOFException) {
      throw new AssertionError(eOFException);
    } 
  }
  
  public void a(c paramc, long paramLong) {
    long l = this.d;
    if (l >= paramLong) {
      paramc.write(this, paramLong);
      return;
    } 
    paramc.write(this, l);
    throw new EOFException();
  }
  
  public boolean a(long paramLong, f paramf) {
    return a(paramLong, paramf, 0, paramf.s());
  }
  
  public boolean a(long paramLong, f paramf, int paramInt1, int paramInt2) {
    if (paramLong >= 0L && paramInt1 >= 0 && paramInt2 >= 0 && this.d - paramLong >= paramInt2) {
      if (paramf.s() - paramInt1 < paramInt2)
        return false; 
      int i;
      for (i = 0; i < paramInt2; i++) {
        if (a(i + paramLong) != paramf.f(paramInt1 + i))
          return false; 
      } 
      return true;
    } 
    return false;
  }
  
  public final long b() {
    long l2 = this.d;
    if (l2 == 0L)
      return 0L; 
    p p1 = this.c.g;
    int i = p1.c;
    long l1 = l2;
    if (i < 8192) {
      l1 = l2;
      if (p1.e)
        l1 = l2 - (i - p1.b); 
    } 
    return l1;
  }
  
  public long b(f paramf) {
    return a(paramf, 0L);
  }
  
  p b(int paramInt) {
    if (paramInt >= 1 && paramInt <= 8192) {
      p p1 = this.c;
      if (p1 == null) {
        this.c = q.a();
        p1 = this.c;
        p1.g = p1;
        p1.f = p1;
        return p1;
      } 
      p1 = p1.g;
      if (p1.c + paramInt > 8192 || !p1.e) {
        p p2 = q.a();
        p1.a(p2);
        return p2;
      } 
      return p1;
    } 
    throw new IllegalArgumentException();
  }
  
  public String b(long paramLong) {
    return a(paramLong, v.a);
  }
  
  public c c(int paramInt) {
    if (paramInt >= 128) {
      int i;
      if (paramInt < 2048) {
        i = paramInt >> 6 | 0xC0;
      } else {
        if (paramInt < 65536) {
          if (paramInt >= 55296 && paramInt <= 57343) {
            writeByte(63);
            return this;
          } 
          i = paramInt >> 12 | 0xE0;
        } else if (paramInt <= 1114111) {
          writeByte(paramInt >> 18 | 0xF0);
          i = paramInt >> 12 & 0x3F | 0x80;
        } else {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Unexpected code point: ");
          stringBuilder.append(Integer.toHexString(paramInt));
          IllegalArgumentException illegalArgumentException = new IllegalArgumentException(stringBuilder.toString());
          throw illegalArgumentException;
        } 
        writeByte(i);
        i = paramInt >> 6 & 0x3F | 0x80;
      } 
      writeByte(i);
      paramInt = paramInt & 0x3F | 0x80;
    } 
    writeByte(paramInt);
    return this;
  }
  
  public f c() {
    return new f(h());
  }
  
  public f c(long paramLong) {
    return new f(e(paramLong));
  }
  
  public c clone() {
    c c1 = new c();
    if (this.d == 0L)
      return c1; 
    c1.c = this.c.c();
    p p1 = c1.c;
    p1.g = p1;
    p1.f = p1;
    p1 = this.c;
    while (true) {
      p1 = p1.f;
      if (p1 != this.c) {
        c1.c.g.a(p1.c());
        continue;
      } 
      c1.d = this.d;
      return c1;
    } 
  }
  
  public void close() {}
  
  public String d() {
    try {
      return a(this.d, v.a);
    } catch (EOFException eOFException) {
      throw new AssertionError(eOFException);
    } 
  }
  
  public boolean d(long paramLong) {
    return (this.d >= paramLong);
  }
  
  public byte[] e(long paramLong) {
    v.a(this.d, 0L, paramLong);
    if (paramLong <= 2147483647L) {
      byte[] arrayOfByte = new byte[(int)paramLong];
      readFully(arrayOfByte);
      return arrayOfByte;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("byteCount > Integer.MAX_VALUE: ");
    stringBuilder.append(paramLong);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof c))
      return false; 
    paramObject = paramObject;
    long l2 = this.d;
    if (l2 != ((c)paramObject).d)
      return false; 
    long l1 = 0L;
    if (l2 == 0L)
      return true; 
    p p1 = this.c;
    paramObject = ((c)paramObject).c;
    int j = p1.b;
    int i = ((p)paramObject).b;
    while (l1 < this.d) {
      l2 = Math.min(p1.c - j, ((p)paramObject).c - i);
      int k = 0;
      while (k < l2) {
        if (p1.a[j] != ((p)paramObject).a[i])
          return false; 
        k++;
        j++;
        i++;
      } 
      if (j == p1.c) {
        p1 = p1.f;
        j = p1.b;
      } 
      if (i == ((p)paramObject).c) {
        paramObject = ((p)paramObject).f;
        i = ((p)paramObject).b;
      } 
      l1 += l2;
    } 
    return true;
  }
  
  public c f() {
    return this;
  }
  
  public String f(long paramLong) {
    if (paramLong >= 0L) {
      long l1 = Long.MAX_VALUE;
      if (paramLong != Long.MAX_VALUE)
        l1 = paramLong + 1L; 
      long l2 = a((byte)10, 0L, l1);
      if (l2 != -1L)
        return j(l2); 
      if (l1 < s() && a(l1 - 1L) == 13 && a(l1) == 10)
        return j(l1); 
      c c1 = new c();
      a(c1, 0L, Math.min(32L, s()));
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("\\n not found: limit=");
      stringBuilder1.append(Math.min(s(), paramLong));
      stringBuilder1.append(" content=");
      stringBuilder1.append(c1.c().b());
      stringBuilder1.append('…');
      throw new EOFException(stringBuilder1.toString());
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("limit < 0: ");
    stringBuilder.append(paramLong);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public void flush() {}
  
  public String g() {
    return f(Long.MAX_VALUE);
  }
  
  public void g(long paramLong) {
    if (this.d >= paramLong)
      return; 
    throw new EOFException();
  }
  
  public c h(long paramLong) {
    if (paramLong == 0L) {
      writeByte(48);
      return this;
    } 
    int j = Long.numberOfTrailingZeros(Long.highestOneBit(paramLong)) / 4 + 1;
    p p1 = b(j);
    byte[] arrayOfByte = p1.a;
    int k = p1.c;
    for (int i = k + j - 1; i >= k; i--) {
      arrayOfByte[i] = e[(int)(0xFL & paramLong)];
      paramLong >>>= 4L;
    } 
    p1.c += j;
    this.d += j;
    return this;
  }
  
  public byte[] h() {
    try {
      return e(this.d);
    } catch (EOFException eOFException) {
      throw new AssertionError(eOFException);
    } 
  }
  
  public int hashCode() {
    p p1 = this.c;
    if (p1 == null)
      return 0; 
    int i = 1;
    while (true) {
      int k = p1.b;
      int m = p1.c;
      int j = i;
      while (k < m) {
        j = j * 31 + p1.a[k];
        k++;
      } 
      p p2 = p1.f;
      p1 = p2;
      i = j;
      if (p2 == this.c)
        return j; 
    } 
  }
  
  public int i() {
    return v.a(readInt());
  }
  
  public c i(long paramLong) {
    if (paramLong == 0L) {
      writeByte(48);
      return this;
    } 
    boolean bool = false;
    int i = 1;
    long l = paramLong;
    if (paramLong < 0L) {
      l = -paramLong;
      if (l < 0L) {
        a("-9223372036854775808");
        return this;
      } 
      bool = true;
    } 
    if (l < 100000000L) {
      if (l < 10000L) {
        if (l < 100L) {
          if (l >= 10L)
            i = 2; 
        } else if (l < 1000L) {
          i = 3;
        } else {
          i = 4;
        } 
      } else if (l < 1000000L) {
        if (l < 100000L) {
          i = 5;
        } else {
          i = 6;
        } 
      } else if (l < 10000000L) {
        i = 7;
      } else {
        i = 8;
      } 
    } else if (l < 1000000000000L) {
      if (l < 10000000000L) {
        if (l < 1000000000L) {
          i = 9;
        } else {
          i = 10;
        } 
      } else if (l < 100000000000L) {
        i = 11;
      } else {
        i = 12;
      } 
    } else if (l < 1000000000000000L) {
      if (l < 10000000000000L) {
        i = 13;
      } else if (l < 100000000000000L) {
        i = 14;
      } else {
        i = 15;
      } 
    } else if (l < 100000000000000000L) {
      if (l < 10000000000000000L) {
        i = 16;
      } else {
        i = 17;
      } 
    } else if (l < 1000000000000000000L) {
      i = 18;
    } else {
      i = 19;
    } 
    int j = i;
    if (bool)
      j = i + 1; 
    p p1 = b(j);
    byte[] arrayOfByte = p1.a;
    i = p1.c + j;
    while (l != 0L) {
      int k = (int)(l % 10L);
      arrayOfByte[--i] = e[k];
      l /= 10L;
    } 
    if (bool)
      arrayOfByte[i - 1] = 45; 
    p1.c += j;
    this.d += j;
    return this;
  }
  
  public boolean isOpen() {
    return true;
  }
  
  String j(long paramLong) {
    long l = 1L;
    if (paramLong > 0L) {
      long l1 = paramLong - 1L;
      if (a(l1) == 13) {
        String str1 = b(l1);
        paramLong = 2L;
        skip(paramLong);
        return str1;
      } 
    } 
    String str = b(paramLong);
    paramLong = l;
    skip(paramLong);
    return str;
  }
  
  public boolean j() {
    return (this.d == 0L);
  }
  
  public c k(long paramLong) {
    p p1 = b(8);
    byte[] arrayOfByte = p1.a;
    int j = p1.c;
    int i = j + 1;
    arrayOfByte[j] = (byte)(int)(paramLong >>> 56L & 0xFFL);
    j = i + 1;
    arrayOfByte[i] = (byte)(int)(paramLong >>> 48L & 0xFFL);
    i = j + 1;
    arrayOfByte[j] = (byte)(int)(paramLong >>> 40L & 0xFFL);
    j = i + 1;
    arrayOfByte[i] = (byte)(int)(paramLong >>> 32L & 0xFFL);
    i = j + 1;
    arrayOfByte[j] = (byte)(int)(paramLong >>> 24L & 0xFFL);
    j = i + 1;
    arrayOfByte[i] = (byte)(int)(paramLong >>> 16L & 0xFFL);
    i = j + 1;
    arrayOfByte[j] = (byte)(int)(paramLong >>> 8L & 0xFFL);
    arrayOfByte[i] = (byte)(int)(paramLong & 0xFFL);
    p1.c = i + 1;
    this.d += 8L;
    return this;
  }
  
  public short k() {
    return v.a(readShort());
  }
  
  public long l() {
    long l1 = this.d;
    long l2 = 0L;
    if (l1 != 0L) {
      int j;
      int k;
      int m = 0;
      long l = -7L;
      int n = 0;
      int i = 0;
      while (true) {
        StringBuilder stringBuilder;
        p p1 = this.c;
        byte[] arrayOfByte = p1.a;
        int i1 = p1.b;
        int i2 = p1.c;
        j = m;
        k = n;
        l1 = l2;
        while (true) {
          m = i;
          if (i1 < i2) {
            m = arrayOfByte[i1];
            if (m >= 48 && m <= 57) {
              n = 48 - m;
              if (l1 < -922337203685477580L || (l1 == -922337203685477580L && n < l)) {
                c c1 = new c();
                c1.i(l1);
                c1.writeByte(m);
                if (k == 0)
                  c1.readByte(); 
                StringBuilder stringBuilder1 = new StringBuilder();
                stringBuilder1.append("Number too large: ");
                stringBuilder1.append(c1.d());
                throw new NumberFormatException(stringBuilder1.toString());
              } 
              l1 = l1 * 10L + n;
            } else if (m == 45 && j == 0) {
              l--;
              k = 1;
            } else {
              if (j != 0) {
                m = 1;
                break;
              } 
              stringBuilder = new StringBuilder();
              stringBuilder.append("Expected leading [0-9] or '-' character but was 0x");
              stringBuilder.append(Integer.toHexString(m));
              throw new NumberFormatException(stringBuilder.toString());
            } 
            i1++;
            j++;
            continue;
          } 
          break;
        } 
        if (i1 == i2) {
          this.c = stringBuilder.b();
          q.a((p)stringBuilder);
        } else {
          ((p)stringBuilder).b = i1;
        } 
        if (m == 0) {
          l2 = l1;
          n = k;
          i = m;
          m = j;
          if (this.c == null)
            break; 
          continue;
        } 
        break;
      } 
      this.d -= j;
      return (k != 0) ? l1 : -l1;
    } 
    IllegalStateException illegalStateException = new IllegalStateException("size == 0");
    throw illegalStateException;
  }
  
  public long m() {
    if (this.d != 0L) {
      int j;
      long l2;
      int i = 0;
      long l1 = 0L;
      int k = 0;
      while (true) {
        c c1;
        p p1 = this.c;
        byte[] arrayOfByte = p1.a;
        int m = p1.b;
        int n = p1.c;
        l2 = l1;
        j = k;
        while (true) {
          k = i;
          if (m < n) {
            byte b = arrayOfByte[m];
            if (b >= 48 && b <= 57) {
              k = b - 48;
            } else {
              if (b >= 97 && b <= 102) {
                k = b - 97;
              } else if (b >= 65 && b <= 70) {
                k = b - 65;
              } else {
                if (j != 0) {
                  k = 1;
                  break;
                } 
                StringBuilder stringBuilder1 = new StringBuilder();
                stringBuilder1.append("Expected leading [0-9a-fA-F] character but was 0x");
                stringBuilder1.append(Integer.toHexString(b));
                throw new NumberFormatException(stringBuilder1.toString());
              } 
              k += 10;
            } 
            if ((0xF000000000000000L & l2) == 0L) {
              l2 = l2 << 4L | k;
              m++;
              j++;
              continue;
            } 
            c1 = new c();
            c1.h(l2);
            c1.writeByte(b);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Number too large: ");
            stringBuilder.append(c1.d());
            throw new NumberFormatException(stringBuilder.toString());
          } 
          break;
        } 
        if (m == n) {
          this.c = c1.b();
          q.a((p)c1);
        } else {
          ((p)c1).b = m;
        } 
        if (k == 0) {
          i = k;
          k = j;
          l1 = l2;
          if (this.c == null)
            break; 
          continue;
        } 
        break;
      } 
      this.d -= j;
      return l2;
    } 
    IllegalStateException illegalStateException = new IllegalStateException("size == 0");
    throw illegalStateException;
  }
  
  public InputStream n() {
    return new b(this);
  }
  
  public d o() {
    return this;
  }
  
  public c p() {
    return this;
  }
  
  public OutputStream q() {
    return new a(this);
  }
  
  public int read(ByteBuffer paramByteBuffer) {
    p p1 = this.c;
    if (p1 == null)
      return -1; 
    int i = Math.min(paramByteBuffer.remaining(), p1.c - p1.b);
    paramByteBuffer.put(p1.a, p1.b, i);
    p1.b += i;
    this.d -= i;
    if (p1.b == p1.c) {
      this.c = p1.b();
      q.a(p1);
    } 
    return i;
  }
  
  public long read(c paramc, long paramLong) {
    if (paramc != null) {
      if (paramLong >= 0L) {
        long l2 = this.d;
        if (l2 == 0L)
          return -1L; 
        long l1 = paramLong;
        if (paramLong > l2)
          l1 = l2; 
        paramc.write(this, l1);
        return l1;
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("byteCount < 0: ");
      stringBuilder.append(paramLong);
      throw new IllegalArgumentException(stringBuilder.toString());
    } 
    throw new IllegalArgumentException("sink == null");
  }
  
  public byte readByte() {
    long l = this.d;
    if (l != 0L) {
      p p1 = this.c;
      int i = p1.b;
      int j = p1.c;
      byte[] arrayOfByte = p1.a;
      int k = i + 1;
      byte b = arrayOfByte[i];
      this.d = l - 1L;
      if (k == j) {
        this.c = p1.b();
        q.a(p1);
        return b;
      } 
      p1.b = k;
      return b;
    } 
    throw new IllegalStateException("size == 0");
  }
  
  public void readFully(byte[] paramArrayOfbyte) {
    int i = 0;
    while (i < paramArrayOfbyte.length) {
      int j = a(paramArrayOfbyte, i, paramArrayOfbyte.length - i);
      if (j != -1) {
        i += j;
        continue;
      } 
      throw new EOFException();
    } 
  }
  
  public int readInt() {
    long l = this.d;
    if (l >= 4L) {
      p p1 = this.c;
      int j = p1.b;
      int i = p1.c;
      if (i - j < 4)
        return (readByte() & 0xFF) << 24 | (readByte() & 0xFF) << 16 | (readByte() & 0xFF) << 8 | readByte() & 0xFF; 
      byte[] arrayOfByte = p1.a;
      int k = j + 1;
      j = arrayOfByte[j];
      int n = k + 1;
      k = arrayOfByte[k];
      int m = n + 1;
      byte b = arrayOfByte[n];
      n = m + 1;
      j = (j & 0xFF) << 24 | (k & 0xFF) << 16 | (b & 0xFF) << 8 | arrayOfByte[m] & 0xFF;
      this.d = l - 4L;
      if (n == i) {
        this.c = p1.b();
        q.a(p1);
        return j;
      } 
      p1.b = n;
      return j;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("size < 4: ");
    stringBuilder.append(this.d);
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  public long readLong() {
    long l = this.d;
    if (l >= 8L) {
      p p1 = this.c;
      int k = p1.b;
      int i = p1.c;
      if (i - k < 8)
        return (readInt() & 0xFFFFFFFFL) << 32L | 0xFFFFFFFFL & readInt(); 
      byte[] arrayOfByte = p1.a;
      int j = k + 1;
      long l1 = arrayOfByte[k];
      k = j + 1;
      long l2 = arrayOfByte[j];
      j = k + 1;
      long l3 = arrayOfByte[k];
      k = j + 1;
      long l4 = arrayOfByte[j];
      j = k + 1;
      long l5 = arrayOfByte[k];
      k = j + 1;
      long l6 = arrayOfByte[j];
      j = k + 1;
      long l7 = arrayOfByte[k];
      k = j + 1;
      l1 = (l2 & 0xFFL) << 48L | (l1 & 0xFFL) << 56L | (l3 & 0xFFL) << 40L | (l4 & 0xFFL) << 32L | (l5 & 0xFFL) << 24L | (l6 & 0xFFL) << 16L | (l7 & 0xFFL) << 8L | arrayOfByte[j] & 0xFFL;
      this.d = l - 8L;
      if (k == i) {
        this.c = p1.b();
        q.a(p1);
        return l1;
      } 
      p1.b = k;
      return l1;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("size < 8: ");
    stringBuilder.append(this.d);
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  public short readShort() {
    long l = this.d;
    if (l >= 2L) {
      p p1 = this.c;
      int k = p1.b;
      int i = p1.c;
      if (i - k < 2)
        return (short)((readByte() & 0xFF) << 8 | readByte() & 0xFF); 
      byte[] arrayOfByte = p1.a;
      int j = k + 1;
      k = arrayOfByte[k];
      int m = j + 1;
      j = arrayOfByte[j];
      this.d = l - 2L;
      if (m == i) {
        this.c = p1.b();
        q.a(p1);
      } else {
        p1.b = m;
      } 
      return (short)((k & 0xFF) << 8 | j & 0xFF);
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("size < 2: ");
    stringBuilder.append(this.d);
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  public final long s() {
    return this.d;
  }
  
  public void skip(long paramLong) {
    while (paramLong > 0L) {
      p p1 = this.c;
      if (p1 != null) {
        int i = (int)Math.min(paramLong, (p1.c - p1.b));
        long l1 = this.d;
        long l2 = i;
        this.d = l1 - l2;
        l1 = paramLong - l2;
        p1 = this.c;
        p1.b += i;
        paramLong = l1;
        if (p1.b == p1.c) {
          this.c = p1.b();
          q.a(p1);
          paramLong = l1;
        } 
        continue;
      } 
      throw new EOFException();
    } 
  }
  
  public u timeout() {
    return u.NONE;
  }
  
  public String toString() {
    return w().toString();
  }
  
  public final f w() {
    long l = this.d;
    if (l <= 2147483647L)
      return a((int)l); 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("size > Integer.MAX_VALUE: ");
    stringBuilder.append(this.d);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public int write(ByteBuffer paramByteBuffer) {
    if (paramByteBuffer != null) {
      int j = paramByteBuffer.remaining();
      int i = j;
      while (i > 0) {
        p p1 = b(1);
        int k = Math.min(i, 8192 - p1.c);
        paramByteBuffer.get(p1.a, p1.c, k);
        i -= k;
        p1.c += k;
      } 
      this.d += j;
      return j;
    } 
    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("source == null");
    throw illegalArgumentException;
  }
  
  public c write(byte[] paramArrayOfbyte) {
    if (paramArrayOfbyte != null) {
      write(paramArrayOfbyte, 0, paramArrayOfbyte.length);
      return this;
    } 
    throw new IllegalArgumentException("source == null");
  }
  
  public c write(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    if (paramArrayOfbyte != null) {
      long l1 = paramArrayOfbyte.length;
      long l2 = paramInt1;
      long l3 = paramInt2;
      v.a(l1, l2, l3);
      paramInt2 += paramInt1;
      while (paramInt1 < paramInt2) {
        p p1 = b(1);
        int i = Math.min(paramInt2 - paramInt1, 8192 - p1.c);
        System.arraycopy(paramArrayOfbyte, paramInt1, p1.a, p1.c, i);
        paramInt1 += i;
        p1.c += i;
      } 
      this.d += l3;
      return this;
    } 
    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("source == null");
    throw illegalArgumentException;
  }
  
  public void write(c paramc, long paramLong) {
    if (paramc != null) {
      if (paramc != this) {
        v.a(paramc.d, 0L, paramLong);
        while (paramLong > 0L) {
          p p1 = paramc.c;
          if (paramLong < (p1.c - p1.b)) {
            p1 = this.c;
            if (p1 != null) {
              p1 = p1.g;
            } else {
              p1 = null;
            } 
            if (p1 != null && p1.e) {
              int i;
              long l1 = p1.c;
              if (p1.d) {
                i = 0;
              } else {
                i = p1.b;
              } 
              if (l1 + paramLong - i <= 8192L) {
                paramc.c.a(p1, (int)paramLong);
                paramc.d -= paramLong;
                this.d += paramLong;
                return;
              } 
            } 
            paramc.c = paramc.c.a((int)paramLong);
          } 
          p1 = paramc.c;
          long l = (p1.c - p1.b);
          paramc.c = p1.b();
          p p2 = this.c;
          if (p2 == null) {
            this.c = p1;
            p1 = this.c;
            p1.g = p1;
            p1.f = p1;
          } else {
            p2.g.a(p1);
            p1.a();
          } 
          paramc.d -= l;
          this.d += l;
          paramLong -= l;
        } 
        return;
      } 
      throw new IllegalArgumentException("source == this");
    } 
    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("source == null");
    throw illegalArgumentException;
  }
  
  public c writeByte(int paramInt) {
    p p1 = b(1);
    byte[] arrayOfByte = p1.a;
    int i = p1.c;
    p1.c = i + 1;
    arrayOfByte[i] = (byte)paramInt;
    this.d++;
    return this;
  }
  
  public c writeInt(int paramInt) {
    p p1 = b(4);
    byte[] arrayOfByte = p1.a;
    int j = p1.c;
    int i = j + 1;
    arrayOfByte[j] = (byte)(paramInt >>> 24 & 0xFF);
    j = i + 1;
    arrayOfByte[i] = (byte)(paramInt >>> 16 & 0xFF);
    i = j + 1;
    arrayOfByte[j] = (byte)(paramInt >>> 8 & 0xFF);
    arrayOfByte[i] = (byte)(paramInt & 0xFF);
    p1.c = i + 1;
    this.d += 4L;
    return this;
  }
  
  public c writeShort(int paramInt) {
    p p1 = b(2);
    byte[] arrayOfByte = p1.a;
    int i = p1.c;
    int j = i + 1;
    arrayOfByte[i] = (byte)(paramInt >>> 8 & 0xFF);
    arrayOfByte[j] = (byte)(paramInt & 0xFF);
    p1.c = j + 1;
    this.d += 2L;
    return this;
  }
  
  class a extends OutputStream {
    a(c this$0) {}
    
    public void close() {}
    
    public void flush() {}
    
    public String toString() {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(this.c);
      stringBuilder.append(".outputStream()");
      return stringBuilder.toString();
    }
    
    public void write(int param1Int) {
      this.c.writeByte((byte)param1Int);
    }
    
    public void write(byte[] param1ArrayOfbyte, int param1Int1, int param1Int2) {
      this.c.write(param1ArrayOfbyte, param1Int1, param1Int2);
    }
  }
  
  class b extends InputStream {
    b(c this$0) {}
    
    public int available() {
      return (int)Math.min(this.c.d, 2147483647L);
    }
    
    public void close() {}
    
    public int read() {
      c c1 = this.c;
      return (c1.d > 0L) ? (c1.readByte() & 0xFF) : -1;
    }
    
    public int read(byte[] param1ArrayOfbyte, int param1Int1, int param1Int2) {
      return this.c.a(param1ArrayOfbyte, param1Int1, param1Int2);
    }
    
    public String toString() {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(this.c);
      stringBuilder.append(".inputStream()");
      return stringBuilder.toString();
    }
  }
  
  public static final class c implements Closeable {
    public c c;
    
    public boolean d;
    
    private p e;
    
    public long f = -1L;
    
    public byte[] g;
    
    public int h = -1;
    
    public int i = -1;
    
    public final int a() {
      long l = this.f;
      if (l != this.c.d) {
        if (l == -1L) {
          l = 0L;
          return a(l);
        } 
        l += (this.i - this.h);
        return a(l);
      } 
      IllegalStateException illegalStateException = new IllegalStateException();
      throw illegalStateException;
    }
    
    public final int a(long param1Long) {
      if (param1Long >= -1L) {
        c c1 = this.c;
        long l = c1.d;
        if (param1Long <= l) {
          long l1;
          if (param1Long == -1L || param1Long == l) {
            this.e = null;
            this.f = param1Long;
            this.g = null;
            this.h = -1;
            this.i = -1;
            return -1;
          } 
          long l2 = 0L;
          p p2 = c1.c;
          p p1 = this.e;
          if (p1 != null) {
            l1 = this.f - (this.h - p1.b);
            if (l1 > param1Long) {
              l = l1;
              p p3 = p2;
              l1 = l2;
              p2 = p1;
              p1 = p3;
            } 
          } else {
            p1 = p2;
            l1 = l2;
          } 
          if (l - param1Long > param1Long - l1) {
            p2 = p1;
            while (true) {
              int i = p2.c;
              int j = p2.b;
              l = l1;
              p1 = p2;
              if (param1Long >= (i - j) + l1) {
                l1 += (i - j);
                p2 = p2.f;
                continue;
              } 
              break;
            } 
          } else {
            l1 = l;
            while (true) {
              l = l1;
              p1 = p2;
              if (l1 > param1Long) {
                p2 = p2.g;
                l1 -= (p2.c - p2.b);
                continue;
              } 
              break;
            } 
          } 
          if (this.d && p1.d) {
            p2 = p1.d();
            c c2 = this.c;
            if (c2.c == p1)
              c2.c = p2; 
            p1.a(p2);
            p2.g.b();
            p1 = p2;
          } 
          this.e = p1;
          this.f = param1Long;
          this.g = p1.a;
          this.h = p1.b + (int)(param1Long - l);
          this.i = p1.c;
          return this.i - this.h;
        } 
      } 
      ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException = new ArrayIndexOutOfBoundsException(String.format("offset=%s > size=%s", new Object[] { Long.valueOf(param1Long), Long.valueOf(this.c.d) }));
      throw arrayIndexOutOfBoundsException;
    }
    
    public void close() {
      if (this.c != null) {
        this.c = null;
        this.e = null;
        this.f = -1L;
        this.g = null;
        this.h = -1;
        this.i = -1;
        return;
      } 
      throw new IllegalStateException("not attached to a buffer");
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/j/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */