package net.time4j.history;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
import net.time4j.d1.a0;
import net.time4j.f0;
import net.time4j.history.q.b;

final class SPX implements Externalizable {
  private static final int[] e = new int[0];
  
  private static final long serialVersionUID = 1L;
  
  private transient Object c;
  
  private transient int d;
  
  public SPX() {}
  
  SPX(Object paramObject, int paramInt) {
    this.c = paramObject;
    this.d = paramInt;
  }
  
  private static a a(DataInput paramDataInput) {
    int i = paramDataInput.readInt();
    if (i > 0) {
      int[] arrayOfInt = new int[i];
      for (int j = 0; j < i; j++)
        arrayOfInt[j] = 1 - paramDataInput.readInt(); 
      return a.a(arrayOfInt);
    } 
    return null;
  }
  
  private d a(DataInput paramDataInput, byte paramByte) {
    b b = a(paramByte & 0xF);
    int i = a.a[b.ordinal()];
    return (i != 1) ? ((i != 2) ? ((i != 3) ? ((i != 4) ? ((i != 5) ? d.b(f0.a(paramDataInput.readLong(), a0.e)) : d.s()) : d.t()) : d.u) : d.t) : d.s;
  }
  
  private static b a(int paramInt) {
    for (b b : b.values()) {
      if (b.a() == paramInt)
        return b; 
    } 
    StreamCorruptedException streamCorruptedException = new StreamCorruptedException("Unknown variant of chronological history.");
    throw streamCorruptedException;
  }
  
  private void a(DataOutput paramDataOutput) {
    int[] arrayOfInt;
    d d = (d)this.c;
    paramDataOutput.writeByte(d.k().a() | this.d << 4);
    b b1 = d.k();
    b b2 = b.g;
    int i = 0;
    if (b1 == b2)
      paramDataOutput.writeLong(((f)d.i().get(0)).a); 
    if (d.n()) {
      arrayOfInt = d.f().b();
    } else {
      arrayOfInt = e;
    } 
    paramDataOutput.writeInt(arrayOfInt.length);
    while (i < arrayOfInt.length) {
      paramDataOutput.writeInt(arrayOfInt[i]);
      i++;
    } 
    d.l().a(paramDataOutput);
    d.h().a(paramDataOutput);
  }
  
  private Object readResolve() {
    return this.c;
  }
  
  public void readExternal(ObjectInput paramObjectInput) {
    d d;
    byte b = paramObjectInput.readByte();
    int i = (b & 0xFF) >> 4;
    if (i != 1) {
      if (i != 2) {
        if (i == 3) {
          d d2 = a(paramObjectInput, b);
          a a = a(paramObjectInput);
          d d1 = d2;
          if (a != null)
            d1 = d2.a(a); 
          d = d1.a(o.a(paramObjectInput)).a(g.a(paramObjectInput));
        } else {
          throw new StreamCorruptedException("Unknown serialized type.");
        } 
      } else {
        d d1 = a((DataInput)d, b);
        a a = a((DataInput)d);
        if (a != null) {
          d d2 = d1.a(a);
        } else {
          d = d1;
        } 
      } 
    } else {
      d = a((DataInput)d, b);
    } 
    this.c = d;
  }
  
  public void writeExternal(ObjectOutput paramObjectOutput) {
    int i = this.d;
    if (i == 1 || i == 2 || i == 3) {
      a(paramObjectOutput);
      return;
    } 
    throw new InvalidClassException("Unknown serialized type.");
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/history/SPX.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */