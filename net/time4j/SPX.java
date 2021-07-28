package net.time4j;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import net.time4j.d1.m0;
import net.time4j.g1.f;

final class SPX implements Externalizable {
  private static final long serialVersionUID = 1L;
  
  private transient Object c;
  
  private transient int d;
  
  public SPX() {}
  
  SPX(Object paramObject, int paramInt) {
    this.c = paramObject;
    this.d = paramInt;
  }
  
  private Object a(ObjectInput paramObjectInput, byte paramByte) {
    Locale locale;
    boolean bool;
    if ((paramByte & 0x1) == 1) {
      bool = true;
    } else {
      bool = false;
    } 
    if ((paramByte & 0x2) == 2) {
      paramByte = 1;
    } else {
      paramByte = 0;
    } 
    if (paramByte != 0)
      return new k.b(bool, k.a((Map<g0, String>)paramObjectInput.readObject())); 
    String str2 = paramObjectInput.readUTF();
    String str1 = paramObjectInput.readUTF();
    int i = str2.indexOf("-");
    if (i == -1) {
      locale = new Locale(str2);
    } else {
      locale = new Locale(str2.substring(0, i), str2.substring(i + 1));
    } 
    return new k.b(bool, locale, str1);
  }
  
  private f0 a(DataInput paramDataInput, byte paramByte) {
    byte b = paramDataInput.readByte();
    int i = b >> 5 & 0x3;
    if (i != 1) {
      if (i != 2) {
        if (i == 3) {
          i = paramDataInput.readInt();
        } else {
          throw new StreamCorruptedException("Unknown year range.");
        } 
      } else {
        i = paramDataInput.readShort();
      } 
    } else {
      i = paramDataInput.readByte() + 1850 + 128;
    } 
    return f0.a(i, b0.f(paramByte & 0xF), b & 0x1F);
  }
  
  private g0 a(DataInput paramDataInput) {
    int i;
    byte b = paramDataInput.readByte();
    if (b < 0)
      return g0.g(b ^ 0xFFFFFFFF); 
    int j = paramDataInput.readByte();
    int k = 0;
    if (j < 0) {
      j = j ^ 0xFFFFFFFF;
      i = 0;
    } else {
      i = paramDataInput.readByte();
      if (i < 0) {
        i = i ^ 0xFFFFFFFF;
      } else {
        k = paramDataInput.readInt();
      } 
    } 
    return g0.a(b, j, i, k);
  }
  
  private void a(DataOutput paramDataOutput) {
    a((f0)this.c, 1, paramDataOutput);
  }
  
  private void a(ObjectOutput paramObjectOutput) {
    byte b;
    k.b b1 = k.b.class.cast(this.c);
    Locale locale = b1.j();
    if (b1.k()) {
      b = 113;
    } else {
      b = 112;
    } 
    int i = b;
    if (locale == null)
      i = b | 0x2; 
    paramObjectOutput.writeByte(i);
    if (locale == null) {
      paramObjectOutput.writeObject(b1.i());
      return;
    } 
    String str2 = locale.getLanguage();
    String str1 = str2;
    if (!locale.getCountry().isEmpty()) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(str2);
      stringBuilder.append("-");
      stringBuilder.append(locale.getCountry());
      str1 = stringBuilder.toString();
    } 
    paramObjectOutput.writeUTF(str1);
    paramObjectOutput.writeUTF(b1.h());
  }
  
  private static void a(f0 paramf0, int paramInt, DataOutput paramDataOutput) {
    byte b;
    int i = paramf0.getYear();
    if (i >= 1850 && i <= 2100) {
      b = 1;
    } else if (Math.abs(i) < 10000) {
      b = 2;
    } else {
      b = 3;
    } 
    paramDataOutput.writeByte(paramInt << 4 | paramf0.getMonth());
    paramDataOutput.writeByte(paramf0.r() | b << 5);
    if (b == 1) {
      paramDataOutput.writeByte(i - 1850 - 128);
      return;
    } 
    if (b == 2) {
      paramDataOutput.writeShort(i);
      return;
    } 
    paramDataOutput.writeInt(i);
  }
  
  private static void a(g0 paramg0, DataOutput paramDataOutput) {
    if (paramg0.a() == 0) {
      int i;
      if (paramg0.getSecond() == 0) {
        if (paramg0.getMinute() == 0) {
          i = paramg0.getHour();
        } else {
          paramDataOutput.writeByte(paramg0.getHour());
          i = paramg0.getMinute();
        } 
      } else {
        paramDataOutput.writeByte(paramg0.getHour());
        paramDataOutput.writeByte(paramg0.getMinute());
        i = paramg0.getSecond();
      } 
      paramDataOutput.writeByte(i ^ 0xFFFFFFFF);
      return;
    } 
    paramDataOutput.writeByte(paramg0.getHour());
    paramDataOutput.writeByte(paramg0.getMinute());
    paramDataOutput.writeByte(paramg0.getSecond());
    paramDataOutput.writeInt(paramg0.a());
  }
  
  private Object b(DataInput paramDataInput, byte paramByte) {
    boolean bool1;
    boolean bool2 = true;
    if ((paramByte & 0x1) != 0) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    if ((paramByte & 0x2) >>> 1 == 0)
      bool2 = false; 
    return a0.a(paramDataInput, bool1, bool2);
  }
  
  private Object b(ObjectInput paramObjectInput, int paramByte) {
    int i = 0;
    int j = 1;
    if ((paramByte & 0xF) == 1) {
      paramByte = j;
    } else {
      paramByte = 0;
    } 
    j = paramObjectInput.readInt();
    if (j == 0)
      return n.e(); 
    ArrayList<m0.a> arrayList = new ArrayList(j);
    while (i < j) {
      long l;
      if (paramByte != 0) {
        l = paramObjectInput.readLong();
      } else {
        l = paramObjectInput.readInt();
      } 
      arrayList.add(m0.a.a(l, paramObjectInput.readObject()));
      i++;
    } 
    return new n<w>((List)arrayList, paramObjectInput.readBoolean());
  }
  
  private void b(DataOutput paramDataOutput) {
    ((a0)this.c).a(paramDataOutput);
  }
  
  private void b(ObjectOutput paramObjectOutput) {
    n n = n.class.cast(this.c);
    int k = n.a().size();
    int j = Math.min(k, 6);
    boolean bool = false;
    int i = 0;
    while (true) {
      if (i < j) {
        if (((m0.a)n.a().get(i)).a() >= 1000L) {
          i = 1;
          break;
        } 
        i++;
        continue;
      } 
      i = 0;
      break;
    } 
    j = 96;
    if (i != 0)
      j = 97; 
    paramObjectOutput.writeByte(j);
    paramObjectOutput.writeInt(k);
    for (j = bool; j < k; j++) {
      m0.a a = n.a().get(j);
      long l = a.a();
      if (i != 0) {
        paramObjectOutput.writeLong(l);
      } else {
        paramObjectOutput.writeInt((int)l);
      } 
      paramObjectOutput.writeObject(a.b());
    } 
    if (k > 0)
      paramObjectOutput.writeBoolean(n.c()); 
  }
  
  private Object c(DataInput paramDataInput, byte paramByte) {
    return h0.a(a(paramDataInput, paramByte), a(paramDataInput));
  }
  
  private Object c(ObjectInput paramObjectInput, byte paramByte) {
    f f;
    if ((paramByte & 0x1) == 1) {
      f = f.d;
    } else {
      f = f.c;
    } 
    long l = paramObjectInput.readLong();
    if ((paramByte & 0x2) == 2) {
      int i = paramObjectInput.readInt();
    } else {
      paramByte = 0;
    } 
    return (f == f.d) ? y.b(l, paramByte) : y.a(l, paramByte);
  }
  
  private void c(DataOutput paramDataOutput) {
    g0 g0 = (g0)this.c;
    paramDataOutput.writeByte(32);
    a(g0, paramDataOutput);
  }
  
  private void c(ObjectOutput paramObjectOutput) {
    byte b;
    y y = y.class.cast(this.c);
    if (y.c() == f.d) {
      b = 81;
    } else {
      b = 80;
    } 
    if (y.b() == 0) {
      paramObjectOutput.writeByte(b);
      paramObjectOutput.writeLong(y.d());
      return;
    } 
    paramObjectOutput.writeByte(b | 0x2);
    paramObjectOutput.writeLong(y.d());
    paramObjectOutput.writeInt(y.b());
  }
  
  private Object d(DataInput paramDataInput, byte paramByte) {
    byte b = paramDataInput.readByte();
    w0 w03 = w0.g(b >> 4);
    w0 w01 = w0.h;
    w0 w02 = w0.i;
    if ((paramByte & 0xF) == 1) {
      paramByte = paramDataInput.readByte();
      w01 = w0.g(paramByte >> 4);
      w02 = w0.g(paramByte & 0xF);
    } 
    return y0.a(w03, b & 0xF, w01, w02);
  }
  
  private void d(DataOutput paramDataOutput) {
    h0 h0 = (h0)this.c;
    a(h0.w(), 8, paramDataOutput);
    a(h0.x(), paramDataOutput);
  }
  
  private void e(DataOutput paramDataOutput) {
    int i;
    y0 y0 = (y0)this.c;
    if (y0.g() == w0.h && y0.d() == w0.i) {
      i = 1;
    } else {
      i = 0;
    } 
    byte b = 48;
    if (!i)
      b = 49; 
    paramDataOutput.writeByte(b);
    paramDataOutput.writeByte(y0.e().a() << 4 | y0.f());
    if (!i) {
      i = y0.g().a();
      paramDataOutput.writeByte(y0.d().a() | i << 4);
    } 
  }
  
  private Object readResolve() {
    return this.c;
  }
  
  public void readExternal(ObjectInput paramObjectInput) {
    Object object;
    byte b = paramObjectInput.readByte();
    switch ((b & 0xFF) >> 4) {
      default:
        throw new StreamCorruptedException("Unknown serialized type.");
      case 8:
        object = c(paramObjectInput, b);
        break;
      case 7:
        object = a((ObjectInput)object, b);
        break;
      case 6:
        object = b((ObjectInput)object, b);
        break;
      case 5:
        object = c((ObjectInput)object, b);
        break;
      case 4:
        object = b((DataInput)object, b);
        break;
      case 3:
        object = d((DataInput)object, b);
        break;
      case 2:
        object = a((DataInput)object);
        break;
      case 1:
        object = a((DataInput)object, b);
        break;
    } 
    this.c = object;
  }
  
  public void writeExternal(ObjectOutput paramObjectOutput) {
    switch (this.d) {
      default:
        throw new InvalidClassException("Unknown serialized type.");
      case 8:
        d(paramObjectOutput);
        return;
      case 7:
        a(paramObjectOutput);
        return;
      case 6:
        b(paramObjectOutput);
        return;
      case 5:
        c(paramObjectOutput);
        return;
      case 4:
        b(paramObjectOutput);
        return;
      case 3:
        e(paramObjectOutput);
        return;
      case 2:
        c(paramObjectOutput);
        return;
      case 1:
        break;
    } 
    a(paramObjectOutput);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/SPX.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */