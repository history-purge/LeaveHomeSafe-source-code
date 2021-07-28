package net.time4j.tz.model;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import net.time4j.b0;
import net.time4j.c1.c;
import net.time4j.d1.p;
import net.time4j.g0;
import net.time4j.tz.p;
import net.time4j.tz.q;
import net.time4j.w0;

final class SPX implements Externalizable {
  private static final long serialVersionUID = 6526945678752534989L;
  
  private transient Object c;
  
  private transient int d;
  
  public SPX() {}
  
  SPX(Object paramObject, int paramInt) {
    this.c = paramObject;
    this.d = paramInt;
  }
  
  private static int a(int paramInt) {
    paramInt /= 3;
    return (paramInt != 0) ? ((paramInt != 1) ? ((paramInt != 2) ? ((paramInt != 3) ? -1 : 7200) : 3600) : 1800) : 0;
  }
  
  private static int a(g paramg) {
    return paramg.e().a((p)g0.B) + c.a(paramg.b() * 86400L);
  }
  
  private static int a(q paramq, int paramInt, DataOutput paramDataOutput) {
    boolean bool1;
    int i = paramq.q();
    byte b = 1;
    boolean bool2 = false;
    if (i != paramInt) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    if (bool1) {
      b1 = (byte)128;
    } else {
      b1 = 0;
    } 
    int j = paramq.a();
    if (j != 0)
      if (j != 3600) {
        if (j != 7200) {
          b = 0;
        } else {
          b = 3;
        } 
      } else {
        b = 2;
      }  
    byte b1 = (byte)(b1 | b << 5);
    long l = paramq.b() + paramInt + 7200L;
    paramInt = bool2;
    if (l >= -4575744000L) {
      paramInt = bool2;
      if (l < 18067104000L)
        paramInt = c(c.b(l, 86400)); 
    } 
    b1 = (byte)(paramInt << 2 | b1);
    if (paramInt == 0) {
      paramDataOutput.writeByte(b1);
      paramDataOutput.writeLong(paramq.b());
    } else {
      paramInt = (int)((l + 4575744000L) / 86400L);
      paramDataOutput.writeByte((byte)(b1 | (byte)(paramInt >>> 16 & 0x3)));
      paramDataOutput.writeByte(paramInt >>> 8 & 0xFF);
      paramDataOutput.writeByte(paramInt & 0xFF);
    } 
    if (b == 0)
      a(paramDataOutput, j); 
    if (bool1)
      a(paramDataOutput, i); 
    return i;
  }
  
  private static Object a(ObjectInput paramObjectInput) {
    return new a(e(paramObjectInput), false, false);
  }
  
  private static d a(DataInput paramDataInput) {
    boolean bool;
    int i = paramDataInput.readByte() & 0xFF;
    b0 b0 = b0.f(i >>> 4);
    i &= 0xF;
    i i1 = i.f[i % 3];
    int j = a(i);
    int k = paramDataInput.readByte() & 0xFF;
    w0 w0 = w0.g(k & 0x7);
    i = paramDataInput.readByte() & 0xFF;
    if (i >>> 7 == 1) {
      bool = true;
    } else {
      bool = false;
    } 
    int m = i & 0x3F;
    i = j;
    if (j == -1)
      i = d(paramDataInput); 
    if (m == 63) {
      j = paramDataInput.readInt();
    } else {
      j = m * 1800;
    } 
    return new c(b0, k >>> 3, w0, j, i1, i, bool);
  }
  
  private static void a(DataOutput paramDataOutput, int paramInt) {
    if (paramInt % 900 == 0) {
      paramDataOutput.writeByte(paramInt / 900);
      return;
    } 
    paramDataOutput.writeByte(127);
    paramDataOutput.writeInt(paramInt);
  }
  
  private static void a(Object paramObject, DataOutput paramDataOutput) {
    int i;
    paramObject = paramObject;
    boolean bool1 = a((g)paramObject, paramDataOutput);
    paramDataOutput.writeByte((paramObject.h() << 3 | paramObject.i()) & 0xFF);
    boolean bool2 = paramObject.j();
    boolean bool = false;
    if (bool2) {
      i = 128;
    } else {
      i = 0;
    } 
    int j = a((g)paramObject);
    if (j % 1800 == 0) {
      i |= j / 1800;
      bool = true;
    } else {
      i |= 0x3F;
    } 
    paramDataOutput.writeByte(i & 0xFF);
    if (!bool1)
      a(paramDataOutput, paramObject.d()); 
    if (!bool)
      paramDataOutput.writeInt(j); 
  }
  
  private static void a(Object paramObject, ObjectOutput paramObjectOutput) {
    ((a)paramObject).a(paramObjectOutput);
  }
  
  private static void a(List<d> paramList, ObjectOutput paramObjectOutput) {
    paramObjectOutput.writeByte(paramList.size());
    for (d d : paramList) {
      paramObjectOutput.writeByte(d.f());
      switch (d.f()) {
        default:
          paramObjectOutput.writeObject(d);
          continue;
        case 122:
          c(d, paramObjectOutput);
          continue;
        case 121:
          a(d, paramObjectOutput);
          continue;
        case 120:
          break;
      } 
      b(d, paramObjectOutput);
    } 
  }
  
  static void a(q[] paramArrayOfq, int paramInt, DataOutput paramDataOutput) {
    int i = Math.min(paramInt, paramArrayOfq.length);
    paramDataOutput.writeInt(i);
    if (i > 0) {
      paramInt = 0;
      int j = paramArrayOfq[0].c();
      a(paramDataOutput, j);
      while (paramInt < i) {
        j = a(paramArrayOfq[paramInt], j, paramDataOutput);
        paramInt++;
      } 
    } 
  }
  
  private static boolean a(g paramg, DataOutput paramDataOutput) {
    byte b = paramg.g();
    int j = paramg.c().ordinal();
    int k = paramg.d();
    boolean bool2 = true;
    int i = j;
    boolean bool1 = bool2;
    if (k != 0)
      if (k != 1800) {
        if (k != 3600) {
          if (k != 7200) {
            bool1 = false;
            i = j + 12;
          } else {
            i = j + 9;
            bool1 = bool2;
          } 
        } else {
          i = j + 6;
          bool1 = bool2;
        } 
      } else {
        i = j + 3;
        bool1 = bool2;
      }  
    paramDataOutput.writeByte((b << 4 | i) & 0xFF);
    return bool1;
  }
  
  private static int b(int paramInt) {
    return (paramInt != 0) ? ((paramInt != 3600) ? ((paramInt != 7200) ? ((paramInt != 10800) ? ((paramInt != 79200) ? ((paramInt != 82800) ? ((paramInt != 86400) ? 0 : 7) : 6) : 5) : 4) : 3) : 2) : 1;
  }
  
  private static Object b(ObjectInput paramObjectInput) {
    List<q> list = e(paramObjectInput);
    return l.a(p.f(((q)list.get(0)).c()), list, d(paramObjectInput), false, false);
  }
  
  private static d b(DataInput paramDataInput) {
    int m = paramDataInput.readByte() & 0xFF;
    int i = m & 0xF;
    i i1 = i.f[i % 3];
    int k = a(i);
    int n = paramDataInput.readByte() & 0xFF;
    int j = d(n & 0x7);
    i = k;
    if (k == -1)
      i = d(paramDataInput); 
    if (j == -1)
      j = paramDataInput.readInt(); 
    return new f(b0.f(m >>> 4), n >>> 3, j, i1, i);
  }
  
  private static void b(Object paramObject, DataOutput paramDataOutput) {
    paramObject = paramObject;
    boolean bool = a((g)paramObject, paramDataOutput);
    int i = paramObject.h();
    int j = a((g)paramObject);
    int k = b(j);
    paramDataOutput.writeByte((i << 3 | k) & 0xFF);
    if (!bool)
      a(paramDataOutput, paramObject.d()); 
    if (k == 0)
      paramDataOutput.writeInt(j); 
  }
  
  private static void b(Object paramObject, ObjectOutput paramObjectOutput) {
    paramObject = paramObject;
    paramObject.a(paramObjectOutput);
    a(paramObject.c(), paramObjectOutput);
  }
  
  private static int c(int paramInt) {
    return (paramInt != 0) ? ((paramInt != 60) ? ((paramInt != 3600) ? ((paramInt != 7200) ? ((paramInt != 10800) ? ((paramInt != 14400) ? ((paramInt != 18000) ? 0 : 7) : 6) : 5) : 4) : 3) : 2) : 1;
  }
  
  private static Object c(ObjectInput paramObjectInput) {
    long l;
    int i = paramObjectInput.readByte() & 0xFF;
    if (i == 255) {
      l = paramObjectInput.readLong();
    } else {
      l = ((i << 16) + ((paramObjectInput.readByte() & 0xFF) << 8) + (0xFF & paramObjectInput.readByte())) * 900L - 4575744000L;
    } 
    return new j(new q(l, d(paramObjectInput), d(paramObjectInput), d(paramObjectInput)), d(paramObjectInput), false);
  }
  
  private static d c(DataInput paramDataInput) {
    int i = paramDataInput.readByte() & 0xFF;
    b0 b0 = b0.f(i >>> 4);
    i &= 0xF;
    i i1 = i.f[i % 3];
    int j = a(i);
    i = paramDataInput.readByte() & 0xFF;
    w0 w0 = w0.g(i >>> 5);
    int k = i & 0x1F;
    i = j;
    if (j == -1)
      i = d(paramDataInput); 
    if (k == 31) {
      j = paramDataInput.readInt();
    } else {
      j = k * 3600;
    } 
    return new h(b0, w0, j, i1, i);
  }
  
  private static void c(Object paramObject, DataOutput paramDataOutput) {
    boolean bool;
    paramObject = paramObject;
    boolean bool1 = a((g)paramObject, paramDataOutput);
    int i = paramObject.h() << 5;
    int j = a((g)paramObject);
    if (j % 3600 == 0) {
      i |= j / 3600;
      bool = true;
    } else {
      i |= 0x1F;
      bool = false;
    } 
    paramDataOutput.writeByte(i & 0xFF);
    if (!bool1)
      a(paramDataOutput, paramObject.d()); 
    if (!bool)
      paramDataOutput.writeInt(j); 
  }
  
  private static void c(Object paramObject, ObjectOutput paramObjectOutput) {
    paramObject = paramObject;
    q q = paramObject.c();
    long l = q.b();
    if (l >= -4575744000L && l < 10464767099L && l % 900L == 0L) {
      int i = (int)((l + 4575744000L) / 900L);
      paramObjectOutput.writeByte(i >>> 16 & 0xFF);
      paramObjectOutput.writeByte(i >>> 8 & 0xFF);
      paramObjectOutput.writeByte(i & 0xFF);
    } else {
      paramObjectOutput.writeByte(255);
      paramObjectOutput.writeLong(q.b());
    } 
    a(paramObjectOutput, q.c());
    a(paramObjectOutput, q.r());
    a(paramObjectOutput, q.a());
    a(paramObject.d(), paramObjectOutput);
  }
  
  private static int d(int paramInt) {
    switch (paramInt) {
      default:
        return -1;
      case 7:
        return 86400;
      case 6:
        return 82800;
      case 5:
        return 79200;
      case 4:
        return 10800;
      case 3:
        return 7200;
      case 2:
        return 3600;
      case 1:
        break;
    } 
    return 0;
  }
  
  private static int d(DataInput paramDataInput) {
    byte b = paramDataInput.readByte();
    return (b == Byte.MAX_VALUE) ? paramDataInput.readInt() : (b * 900);
  }
  
  private static List<d> d(ObjectInput paramObjectInput) {
    byte b = paramObjectInput.readByte();
    if (b == 0)
      return Collections.emptyList(); 
    ArrayList<d> arrayList = new ArrayList(b);
    d d = null;
    int i = 0;
    while (i < b) {
      d d1;
      switch (paramObjectInput.readByte()) {
        default:
          d1 = (d)paramObjectInput.readObject();
          break;
        case 122:
          d1 = c(paramObjectInput);
          break;
        case 121:
          d1 = a(paramObjectInput);
          break;
        case 120:
          d1 = b(paramObjectInput);
          break;
      } 
      if (d == null || k.c.a(d, d1) < 0) {
        arrayList.add(d1);
        i++;
        d = d1;
        continue;
      } 
      throw new InvalidObjectException("Order of daylight saving rules is not ascending.");
    } 
    return arrayList;
  }
  
  private static int e(int paramInt) {
    switch (paramInt) {
      default:
        return -1;
      case 7:
        return 18000;
      case 6:
        return 14400;
      case 5:
        return 10800;
      case 4:
        return 7200;
      case 3:
        return 3600;
      case 2:
        return 60;
      case 1:
        break;
    } 
    return 0;
  }
  
  private static List<q> e(ObjectInput paramObjectInput) {
    int m = paramObjectInput.readInt();
    if (m == 0)
      return Collections.emptyList(); 
    ArrayList<q> arrayList = new ArrayList(m);
    int i = d(paramObjectInput);
    long l = Long.MIN_VALUE;
    int k = i;
    int j = 0;
    while (j < m) {
      int n;
      long l1;
      byte b = paramObjectInput.readByte();
      if (b < 0) {
        n = 1;
      } else {
        n = 0;
      } 
      int i1 = b >>> 5 & 0x3;
      int i2 = e(b >>> 2 & 0x7);
      if (i2 == -1) {
        l1 = paramObjectInput.readLong();
      } else {
        l1 = ((b & 0x3) << 16 | (paramObjectInput.readByte() & 0xFF) << 8 | paramObjectInput.readByte() & 0xFF) * 86400L - 4575744000L + i2 - 7200L - k;
      } 
      if (l1 > l) {
        if (i1 != 1) {
          if (i1 != 2) {
            if (i1 != 3) {
              int i3 = d(paramObjectInput);
            } else {
              char c = 'ᰠ';
            } 
          } else {
            char c = 'ฐ';
          } 
        } else {
          b = 0;
        } 
        if (n)
          k = d(paramObjectInput); 
        if (b == Integer.MAX_VALUE) {
          n = 0;
        } else {
          n = b;
        } 
        n += k;
        arrayList.add(new q(l1, i, n, b));
        j++;
        i = n;
        l = l1;
        continue;
      } 
      throw new StreamCorruptedException("Wrong order of transitions.");
    } 
    return arrayList;
  }
  
  private Object readResolve() {
    return this.c;
  }
  
  public void readExternal(ObjectInput paramObjectInput) {
    Object object;
    switch (paramObjectInput.readByte()) {
      default:
        throw new StreamCorruptedException("Unknown serialized type.");
      case 127:
        object = b(paramObjectInput);
        break;
      case 126:
        object = a((ObjectInput)object);
        break;
      case 125:
        object = c((ObjectInput)object);
        break;
      case 122:
        object = c((DataInput)object);
        break;
      case 121:
        object = a((DataInput)object);
        break;
      case 120:
        object = b((DataInput)object);
        break;
    } 
    this.c = object;
  }
  
  public void writeExternal(ObjectOutput paramObjectOutput) {
    paramObjectOutput.writeByte(this.d);
    switch (this.d) {
      default:
        throw new InvalidClassException("Unknown serialized type.");
      case 127:
        b(this.c, paramObjectOutput);
        return;
      case 126:
        a(this.c, paramObjectOutput);
        return;
      case 125:
        c(this.c, paramObjectOutput);
        return;
      case 122:
        c(this.c, paramObjectOutput);
        return;
      case 121:
        a(this.c, paramObjectOutput);
        return;
      case 120:
        break;
    } 
    b(this.c, paramObjectOutput);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/tz/model/SPX.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */