package net.time4j.d1;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;

public interface m0<U> {
  List<a<U>> a();
  
  public static final class a<U> implements Serializable {
    private static final long serialVersionUID = 1564804888291509484L;
    
    private final long amount;
    
    private final U unit;
    
    private a(long param1Long, U param1U) {
      if (param1U != null) {
        if (param1Long >= 0L) {
          this.amount = param1Long;
          this.unit = param1U;
          return;
        } 
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Temporal amount must be positive or zero: ");
        stringBuilder.append(param1Long);
        throw new IllegalArgumentException(stringBuilder.toString());
      } 
      throw new NullPointerException("Missing chronological unit.");
    }
    
    public static <U> a<U> a(long param1Long, U param1U) {
      return new a<U>(param1Long, param1U);
    }
    
    private void readObject(ObjectInputStream param1ObjectInputStream) {
      param1ObjectInputStream.defaultReadObject();
      if (this.unit != null && this.amount >= 0L)
        return; 
      throw new InvalidObjectException("Inconsistent state.");
    }
    
    public long a() {
      return this.amount;
    }
    
    public U b() {
      return this.unit;
    }
    
    public boolean equals(Object param1Object) {
      if (this == param1Object)
        return true; 
      if (param1Object instanceof a) {
        param1Object = a.class.cast(param1Object);
        return (this.amount == ((a)param1Object).amount && this.unit.equals(((a)param1Object).unit));
      } 
      return false;
    }
    
    public int hashCode() {
      int i = this.unit.hashCode();
      long l = this.amount;
      return i * 29 + (int)(l ^ l >>> 32L);
    }
    
    public String toString() {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append('P');
      stringBuilder.append(this.amount);
      stringBuilder.append('{');
      stringBuilder.append(this.unit);
      stringBuilder.append('}');
      return stringBuilder.toString();
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/d1/m0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */