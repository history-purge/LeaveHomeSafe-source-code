package e.f.a.e.i.d;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class f1<MessageType extends f1<MessageType, BuilderType>, BuilderType extends f1.a<MessageType, BuilderType>> extends q<MessageType, BuilderType> {
  private static Map<Object, f1<?, ?>> zzjr = new ConcurrentHashMap<Object, f1<?, ?>>();
  
  protected u3 zzjp = u3.d();
  
  private int zzjq = -1;
  
  private static <T extends f1<T, ?>> T a(T paramT, byte[] paramArrayOfbyte) {
    f1 f11 = (f1)paramT.a(e.d, (Object)null, (Object)null);
    try {
      w2.a().<f1>a(f11).a(f11, paramArrayOfbyte, 0, paramArrayOfbyte.length, new w());
      w2.a().<f1>a(f11).a(f11);
      if (f11.zzex == 0)
        return (T)f11; 
      throw new RuntimeException();
    } catch (IOException iOException) {
      if (iOException.getCause() instanceof l1)
        throw (l1)iOException.getCause(); 
      throw (new l1(iOException.getMessage())).a(f11);
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw l1.a().a(f11);
    } 
  }
  
  static <T extends f1<?, ?>> T a(Class<T> paramClass) {
    f1 f12 = zzjr.get(paramClass);
    f1 f11 = f12;
    if (f12 == null)
      try {
        Class.forName(paramClass.getName(), true, paramClass.getClassLoader());
        f11 = zzjr.get(paramClass);
      } catch (ClassNotFoundException classNotFoundException) {
        throw new IllegalStateException("Class initialization cannot fail.", classNotFoundException);
      }  
    if (f11 == null) {
      String str = String.valueOf(classNotFoundException.getName());
      if (str.length() != 0) {
        str = "Unable to get default instance for: ".concat(str);
      } else {
        str = new String("Unable to get default instance for: ");
      } 
      throw new IllegalStateException(str);
    } 
    return (T)f11;
  }
  
  protected static Object a(k2 paramk2, String paramString, Object[] paramArrayOfObject) {
    return new y2(paramk2, paramString, paramArrayOfObject);
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
  
  protected static <T extends f1<?, ?>> void a(Class<T> paramClass, T paramT) {
    zzjr.put(paramClass, (f1<?, ?>)paramT);
  }
  
  protected static <T extends f1<T, ?>> T b(T paramT, byte[] paramArrayOfbyte) {
    paramArrayOfbyte = a((byte[])paramT, paramArrayOfbyte);
    if (paramArrayOfbyte != null) {
      boolean bool2 = Boolean.TRUE.booleanValue();
      byte b = ((Byte)paramArrayOfbyte.a(e.a, (Object)null, (Object)null)).byteValue();
      boolean bool1 = true;
      if (b != 1)
        if (b == 0) {
          bool1 = false;
        } else {
          boolean bool = w2.a().<byte[]>a(paramArrayOfbyte).c(paramArrayOfbyte);
          bool1 = bool;
          if (bool2) {
            int i = e.b;
            if (bool) {
              byte[] arrayOfByte = paramArrayOfbyte;
            } else {
              paramT = null;
            } 
            paramArrayOfbyte.a(i, paramT, (Object)null);
            bool1 = bool;
          } 
        }  
      if (bool1)
        return (T)paramArrayOfbyte; 
      throw (new l1((new s3(paramArrayOfbyte)).getMessage())).a(paramArrayOfbyte);
    } 
    return (T)paramArrayOfbyte;
  }
  
  protected static <E> k1<E> h() {
    return x2.b();
  }
  
  protected abstract Object a(int paramInt, Object paramObject1, Object paramObject2);
  
  final void a(int paramInt) {
    this.zzjq = paramInt;
  }
  
  public final void a(m0 paramm0) {
    w2.a().a(getClass()).a(this, o0.a(paramm0));
  }
  
  public final boolean a() {
    boolean bool1 = Boolean.TRUE.booleanValue();
    byte b = ((Byte)a(e.a, (Object)null, (Object)null)).byteValue();
    if (b == 1)
      return true; 
    if (b == 0)
      return false; 
    boolean bool2 = w2.a().<f1>a(this).c(this);
    if (bool1) {
      Object object;
      int i = e.b;
      if (bool2) {
        object = this;
      } else {
        object = null;
      } 
      a(i, object, (Object)null);
    } 
    return bool2;
  }
  
  public boolean equals(Object paramObject) {
    return (this == paramObject) ? true : (!((f1)a(e.f, (Object)null, (Object)null)).getClass().isInstance(paramObject) ? false : w2.a().<f1>a(this).b(this, (f1)paramObject));
  }
  
  public final int f() {
    if (this.zzjq == -1)
      this.zzjq = w2.a().<f1>a(this).b(this); 
    return this.zzjq;
  }
  
  final int g() {
    return this.zzjq;
  }
  
  public int hashCode() {
    int i = this.zzex;
    if (i != 0)
      return i; 
    this.zzex = w2.a().<f1>a(this).d(this);
    return this.zzex;
  }
  
  public String toString() {
    return n2.a(this, super.toString());
  }
  
  public static class a<MessageType extends f1<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends r<MessageType, BuilderType> {
    private final MessageType c;
    
    protected MessageType d;
    
    protected boolean e;
    
    protected a(MessageType param1MessageType) {
      this.c = param1MessageType;
      this.d = (MessageType)param1MessageType.a(f1.e.d, (Object)null, (Object)null);
      this.e = false;
    }
    
    private static void a(MessageType param1MessageType1, MessageType param1MessageType2) {
      w2.a().<MessageType>a(param1MessageType1).a(param1MessageType1, param1MessageType2);
    }
    
    public final BuilderType a(MessageType param1MessageType) {
      g();
      a(this.d, param1MessageType);
      return (BuilderType)this;
    }
    
    protected void g() {
      if (this.e) {
        f1 f11 = (f1)this.d.a(f1.e.d, (Object)null, (Object)null);
        a((MessageType)f11, this.d);
        this.d = (MessageType)f11;
        this.e = false;
      } 
    }
    
    public MessageType h() {
      if (this.e)
        return this.d; 
      MessageType messageType = this.d;
      w2.a().<MessageType>a(messageType).a(messageType);
      this.e = true;
      return this.d;
    }
    
    public final MessageType i() {
      f1 f11 = (f1)v();
      boolean bool2 = Boolean.TRUE.booleanValue();
      byte b = ((Byte)f11.a(f1.e.a, (Object)null, (Object)null)).byteValue();
      boolean bool1 = true;
      if (b != 1)
        if (b == 0) {
          bool1 = false;
        } else {
          boolean bool = w2.a().<f1>a(f11).c(f11);
          bool1 = bool;
          if (bool2) {
            Object object;
            int i = f1.e.b;
            if (bool) {
              object = f11;
            } else {
              object = null;
            } 
            f11.a(i, object, (Object)null);
            bool1 = bool;
          } 
        }  
      if (bool1)
        return (MessageType)f11; 
      throw new s3(f11);
    }
  }
  
  public static final class b<T extends f1<T, ?>> extends s<T> {
    public b(T param1T) {}
  }
  
  public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType> extends f1<MessageType, BuilderType> implements m2 {
    protected w0<f1.d> zzjv = w0.i();
  }
  
  static final class d implements z0<d> {
    final int c;
    
    final i4 d;
    
    public final l2 a(l2 param1l2, k2 param1k2) {
      return ((f1.a<f1, l2>)param1l2).a((f1)param1k2);
    }
    
    public final q2 a(q2 param1q21, q2 param1q22) {
      throw new UnsupportedOperationException();
    }
    
    public final int g() {
      return this.c;
    }
    
    public final boolean h() {
      return false;
    }
    
    public final i4 j() {
      return this.d;
    }
    
    public final n4 n() {
      return this.d.a();
    }
    
    public final boolean p() {
      return false;
    }
  }
  
  public enum e {
    a, b, c, d, e, f, g, i, j, k, l;
    
    static {
      int i = i;
      i = j;
      i = k;
      i = l;
    }
    
    public static int[] a() {
      return (int[])h.clone();
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/d/f1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */