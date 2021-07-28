package e.f.a.e.i.n;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class h3<MessageType extends h3<MessageType, BuilderType>, BuilderType extends h3.b<MessageType, BuilderType>> extends o1<MessageType, BuilderType> {
  private static Map<Object, h3<?, ?>> zzd = new ConcurrentHashMap<Object, h3<?, ?>>();
  
  protected d6 zzb = d6.d();
  
  private int zzc = -1;
  
  static <T extends h3<?, ?>> T a(Class<T> paramClass) {
    h3<?, ?> h32 = zzd.get(paramClass);
    h3<?, ?> h31 = h32;
    if (h32 == null)
      try {
        Class.forName(paramClass.getName(), true, paramClass.getClassLoader());
        h31 = zzd.get(paramClass);
      } catch (ClassNotFoundException classNotFoundException) {
        throw new IllegalStateException("Class initialization cannot fail.", classNotFoundException);
      }  
    if (h31 == null) {
      h31 = (h3)((h3)h6.<h3>a((Class<h3>)classNotFoundException)).a(f.f, (Object)null, (Object)null);
      if (h31 != null) {
        zzd.put(classNotFoundException, h31);
        return (T)h31;
      } 
      throw new IllegalStateException();
    } 
    return (T)h31;
  }
  
  protected static <E> r3<E> a(r3<E> paramr3) {
    int i = paramr3.size();
    if (i == 0) {
      i = 10;
    } else {
      i <<= 1;
    } 
    return paramr3.f(i);
  }
  
  protected static Object a(r4 paramr4, String paramString, Object[] paramArrayOfObject) {
    return new h5(paramr4, paramString, paramArrayOfObject);
  }
  
  static Object a(Method paramMethod, Object paramObject, Object... paramVarArgs) {
    try {
      return paramMethod.invoke(paramObject, paramVarArgs);
    } catch (IllegalAccessException illegalAccessException) {
      throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", illegalAccessException);
    } catch (InvocationTargetException invocationTargetException) {
      Throwable throwable = invocationTargetException.getCause();
      if (!(throwable instanceof RuntimeException)) {
        if (throwable instanceof Error)
          throw (Error)throwable; 
        throw new RuntimeException("Unexpected exception thrown by generated accessor method.", throwable);
      } 
      throw (RuntimeException)throwable;
    } 
  }
  
  protected static <T extends h3<?, ?>> void a(Class<T> paramClass, T paramT) {
    zzd.put(paramClass, (h3<?, ?>)paramT);
  }
  
  protected static final <T extends h3<T, ?>> boolean a(T paramT, boolean paramBoolean) {
    byte b = ((Byte)paramT.a(f.a, (Object)null, (Object)null)).byteValue();
    if (b == 1)
      return true; 
    if (b == 0)
      return false; 
    boolean bool = e5.a().<T>a(paramT).d(paramT);
    if (paramBoolean) {
      Object object;
      int i = f.b;
      if (bool) {
        T t = paramT;
      } else {
        object = null;
      } 
      paramT.a(i, object, (Object)null);
    } 
    return bool;
  }
  
  protected static p3 k() {
    return (p3)j3.f();
  }
  
  protected static <E> r3<E> l() {
    return i5.f();
  }
  
  protected abstract Object a(int paramInt, Object paramObject1, Object paramObject2);
  
  final void a(int paramInt) {
    this.zzc = paramInt;
  }
  
  public final void a(o2 paramo2) {
    e5.a().<h3>a(this).a(this, q2.a(paramo2));
  }
  
  public final boolean d() {
    return a(this, Boolean.TRUE.booleanValue());
  }
  
  public boolean equals(Object paramObject) {
    return (this == paramObject) ? true : ((paramObject == null) ? false : ((getClass() != paramObject.getClass()) ? false : e5.a().<h3>a(this).a(this, (h3)paramObject)));
  }
  
  public final int f() {
    if (this.zzc == -1)
      this.zzc = e5.a().<h3>a(this).b(this); 
    return this.zzc;
  }
  
  public int hashCode() {
    int i = this.zza;
    if (i != 0)
      return i; 
    this.zza = e5.a().<h3>a(this).c(this);
    return this.zza;
  }
  
  final int i() {
    return this.zzc;
  }
  
  protected final <MessageType extends h3<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> BuilderType j() {
    return (BuilderType)a(f.e, (Object)null, (Object)null);
  }
  
  public String toString() {
    return w4.a(this, super.toString());
  }
  
  protected static final class a<T extends h3<T, ?>> extends p1<T> {
    public a(T param1T) {}
  }
  
  public static class b<MessageType extends h3<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> extends n1<MessageType, BuilderType> {
    private final MessageType c;
    
    protected MessageType d;
    
    protected boolean e;
    
    protected b(MessageType param1MessageType) {
      this.c = param1MessageType;
      this.d = (MessageType)param1MessageType.a(h3.f.d, (Object)null, (Object)null);
      this.e = false;
    }
    
    private static void a(MessageType param1MessageType1, MessageType param1MessageType2) {
      e5.a().<MessageType>a(param1MessageType1).b(param1MessageType1, param1MessageType2);
    }
    
    private final BuilderType b(byte[] param1ArrayOfbyte, int param1Int1, int param1Int2, t2 param1t2) {
      if (this.e) {
        h();
        this.e = false;
      } 
      try {
        e5.a().<MessageType>a(this.d).a(this.d, param1ArrayOfbyte, 0, param1Int2, new v1(param1t2));
        return (BuilderType)this;
      } catch (q3 q3) {
        throw q3;
      } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
        throw q3.a();
      } catch (IOException iOException) {
        throw new RuntimeException("Reading from byte array should not throw IOException.", iOException);
      } 
    }
    
    public final BuilderType a(MessageType param1MessageType) {
      if (this.e) {
        h();
        this.e = false;
      } 
      a(this.d, param1MessageType);
      return (BuilderType)this;
    }
    
    protected void h() {
      h3 h31 = (h3)this.d.a(h3.f.d, (Object)null, (Object)null);
      a((MessageType)h31, this.d);
      this.d = (MessageType)h31;
    }
    
    public MessageType i() {
      if (this.e)
        return this.d; 
      MessageType messageType = this.d;
      e5.a().<MessageType>a(messageType).a(messageType);
      this.e = true;
      return this.d;
    }
    
    public final MessageType j() {
      h3 h31 = (h3)e();
      if (h31.d())
        return (MessageType)h31; 
      throw new b6(h31);
    }
  }
  
  public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType> extends h3<MessageType, BuilderType> implements t4 {
    protected z2<h3.e> zzc = z2.g();
    
    final z2<h3.e> zza() {
      if (this.zzc.b())
        this.zzc = (z2<h3.e>)this.zzc.clone(); 
      return this.zzc;
    }
  }
  
  public static final class d<ContainingType extends r4, Type> extends r2<ContainingType, Type> {
    final r4 a;
    
    final h3.e b;
  }
  
  static final class e implements b3<e> {
    final int c;
    
    final s6 d;
    
    final boolean e;
    
    public final u4 a(u4 param1u4, r4 param1r4) {
      param1u4 = param1u4;
      param1u4.a(param1r4);
      return param1u4;
    }
    
    public final z4 a(z4 param1z41, z4 param1z42) {
      throw new UnsupportedOperationException();
    }
    
    public final boolean e() {
      return false;
    }
    
    public final boolean f() {
      return this.e;
    }
    
    public final v6 g() {
      return this.d.zza();
    }
    
    public final int zza() {
      return this.c;
    }
    
    public final s6 zzb() {
      return this.d;
    }
  }
  
  public enum f {
    a, b, c, d, e, f, g;
    
    public static int[] a() {
      return (int[])h.clone();
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/n/h3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */