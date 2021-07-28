package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

public class v {
  private final b a;
  
  private final w b;
  
  public v(w paramw, b paramb) {
    this.a = paramb;
    this.b = paramw;
  }
  
  public v(x paramx) {
    this(w1, b1);
  }
  
  public <T extends u> T a(Class<T> paramClass) {
    String str = paramClass.getCanonicalName();
    if (str != null) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("androidx.lifecycle.ViewModelProvider.DefaultKey:");
      stringBuilder.append(str);
      return a(stringBuilder.toString(), paramClass);
    } 
    throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
  }
  
  public <T extends u> T a(String paramString, Class<T> paramClass) {
    b b1;
    u u = this.b.a(paramString);
    if (paramClass.isInstance(u)) {
      b1 = this.a;
      if (b1 instanceof e)
        ((e)b1).a(u); 
      return (T)u;
    } 
    b b2 = this.a;
    if (b2 instanceof c) {
      paramClass = ((c)b2).a((String)b1, (Class)paramClass);
    } else {
      paramClass = b2.a((Class)paramClass);
    } 
    this.b.a((String)b1, (u)paramClass);
    return (T)paramClass;
  }
  
  public static class a extends d {
    private static a c;
    
    private Application b;
    
    public a(Application param1Application) {
      this.b = param1Application;
    }
    
    public static a a(Application param1Application) {
      if (c == null)
        c = new a(param1Application); 
      return c;
    }
    
    public <T extends u> T a(Class<T> param1Class) {
      if (a.class.isAssignableFrom(param1Class))
        try {
          return (T)param1Class.getConstructor(new Class[] { Application.class }).newInstance(new Object[] { this.b });
        } catch (NoSuchMethodException noSuchMethodException) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Cannot create an instance of ");
          stringBuilder.append(param1Class);
          throw new RuntimeException(stringBuilder.toString(), noSuchMethodException);
        } catch (IllegalAccessException illegalAccessException) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Cannot create an instance of ");
          stringBuilder.append(param1Class);
          throw new RuntimeException(stringBuilder.toString(), illegalAccessException);
        } catch (InstantiationException instantiationException) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Cannot create an instance of ");
          stringBuilder.append(param1Class);
          throw new RuntimeException(stringBuilder.toString(), instantiationException);
        } catch (InvocationTargetException invocationTargetException) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Cannot create an instance of ");
          stringBuilder.append(param1Class);
          throw new RuntimeException(stringBuilder.toString(), invocationTargetException);
        }  
      return super.a(param1Class);
    }
  }
  
  public static interface b {
    <T extends u> T a(Class<T> param1Class);
  }
  
  static abstract class c extends e implements b {
    public <T extends u> T a(Class<T> param1Class) {
      throw new UnsupportedOperationException("create(String, Class<?>) must be called on implementaions of KeyedFactory");
    }
    
    public abstract <T extends u> T a(String param1String, Class<T> param1Class);
  }
  
  public static class d implements b {
    private static d a;
    
    static d a() {
      if (a == null)
        a = new d(); 
      return a;
    }
    
    public <T extends u> T a(Class<T> param1Class) {
      try {
        return param1Class.newInstance();
      } catch (InstantiationException instantiationException) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cannot create an instance of ");
        stringBuilder.append(param1Class);
        throw new RuntimeException(stringBuilder.toString(), instantiationException);
      } catch (IllegalAccessException illegalAccessException) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cannot create an instance of ");
        stringBuilder.append(param1Class);
        throw new RuntimeException(stringBuilder.toString(), illegalAccessException);
      } 
    }
  }
  
  static class e {
    void a(u param1u) {}
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/lifecycle/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */