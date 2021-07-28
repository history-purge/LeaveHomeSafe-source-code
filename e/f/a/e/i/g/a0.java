package e.f.a.e.i.g;

import java.lang.annotation.Annotation;

final class a0 implements f0 {
  private final int a;
  
  private final e0 b;
  
  a0(int paramInt, e0 parame0) {
    this.a = paramInt;
    this.b = parame0;
  }
  
  public final Class<? extends Annotation> annotationType() {
    return (Class)f0.class;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof f0))
      return false; 
    paramObject = paramObject;
    return (this.a == paramObject.zza() && this.b.equals(paramObject.zzb()));
  }
  
  public final int hashCode() {
    return (this.a ^ 0xDE0D66) + (this.b.hashCode() ^ 0x79AD669E);
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("@com.google.firebase.encoders.proto.Protobuf");
    stringBuilder.append("(tag=");
    stringBuilder.append(this.a);
    stringBuilder.append("intEncoding=");
    stringBuilder.append(this.b);
    stringBuilder.append(')');
    return stringBuilder.toString();
  }
  
  public final int zza() {
    return this.a;
  }
  
  public final e0 zzb() {
    return this.b;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/g/a0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */