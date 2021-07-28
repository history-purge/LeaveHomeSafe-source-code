package net.time4j.tz;

import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;

final class SPX implements Externalizable {
  private static final long serialVersionUID = -1000776907354520172L;
  
  private transient Object c;
  
  private transient int d;
  
  public SPX() {}
  
  SPX(Object paramObject, int paramInt) {
    this.c = paramObject;
    this.d = paramInt;
  }
  
  private Object a(byte paramByte) {
    int i = paramByte & 0xF;
    return n.a(b.values()[i / 2], g.values()[i % 2]);
  }
  
  private Object a(ObjectInput paramObjectInput, byte paramByte) {
    return new a((k)paramObjectInput.readObject(), (l)paramObjectInput.readObject());
  }
  
  private void a(ObjectOutput paramObjectOutput) {
    a a = (a)this.c;
    paramObjectOutput.writeByte(192);
    paramObjectOutput.writeObject(a.d());
    paramObjectOutput.writeObject(a.q());
  }
  
  private Object b(ObjectInput paramObjectInput, byte paramByte) {
    int i = paramObjectInput.readInt();
    if ((paramByte & 0xF) == 1) {
      int j = paramObjectInput.readInt();
    } else {
      paramByte = 0;
    } 
    return p.b(i, paramByte);
  }
  
  private void b(ObjectOutput paramObjectOutput) {
    boolean bool;
    p p = (p)this.c;
    if (p.q() != 0) {
      bool = true;
    } else {
      bool = false;
    } 
    char c = 'ð';
    if (bool)
      c = 'ñ'; 
    paramObjectOutput.writeByte(c);
    paramObjectOutput.writeInt(p.r());
    if (bool)
      paramObjectOutput.writeInt(p.q()); 
  }
  
  private Object c(ObjectInput paramObjectInput, byte paramByte) {
    k k = (k)paramObjectInput.readObject();
    m m = (m)paramObjectInput.readObject();
    o o = l.e;
    if ((paramByte & 0xF) == 1)
      o = (o)paramObjectInput.readObject(); 
    return new c(k, m, o);
  }
  
  private void c(ObjectOutput paramObjectOutput) {
    paramObjectOutput.writeByte(((n)this.c).a() | 0xD0);
  }
  
  private void d(ObjectOutput paramObjectOutput) {
    boolean bool;
    char c;
    c c1 = (c)this.c;
    if (c1.e() != l.e) {
      bool = true;
    } else {
      bool = false;
    } 
    if (bool) {
      c = 'á';
    } else {
      c = 'à';
    } 
    paramObjectOutput.writeByte(c);
    paramObjectOutput.writeObject(c1.d());
    paramObjectOutput.writeObject(c1.c());
    if (bool)
      paramObjectOutput.writeObject(c1.e()); 
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
      case 15:
        object = b(paramObjectInput, b);
        break;
      case 14:
        object = c((ObjectInput)object, b);
        break;
      case 13:
        object = a(b);
        break;
      case 12:
        object = a((ObjectInput)object, b);
        break;
    } 
    this.c = object;
  }
  
  public void writeExternal(ObjectOutput paramObjectOutput) {
    switch (this.d) {
      default:
        throw new InvalidClassException("Unknown serialized type.");
      case 15:
        b(paramObjectOutput);
        return;
      case 14:
        d(paramObjectOutput);
        return;
      case 13:
        c(paramObjectOutput);
        return;
      case 12:
        break;
    } 
    a(paramObjectOutput);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/tz/SPX.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */