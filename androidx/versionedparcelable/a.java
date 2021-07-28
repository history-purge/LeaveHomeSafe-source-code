package androidx.versionedparcelable;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class a {
  protected final b.d.a<String, Method> a;
  
  protected final b.d.a<String, Method> b;
  
  protected final b.d.a<String, Class> c;
  
  public a(b.d.a<String, Method> parama1, b.d.a<String, Method> parama2, b.d.a<String, Class> parama) {
    this.a = parama1;
    this.b = parama2;
    this.c = parama;
  }
  
  private Class a(Class<? extends c> paramClass) {
    Class<?> clazz2 = (Class)this.c.get(paramClass.getName());
    Class<?> clazz1 = clazz2;
    if (clazz2 == null) {
      clazz1 = Class.forName(String.format("%s.%sParcelizer", new Object[] { paramClass.getPackage().getName(), paramClass.getSimpleName() }), false, paramClass.getClassLoader());
      this.c.put(paramClass.getName(), clazz1);
    } 
    return clazz1;
  }
  
  private Method b(Class<? extends c> paramClass) {
    Method method2 = (Method)this.b.get(paramClass.getName());
    Method method1 = method2;
    if (method2 == null) {
      Class clazz = a(paramClass);
      System.currentTimeMillis();
      method1 = clazz.getDeclaredMethod("write", new Class[] { paramClass, a.class });
      this.b.put(paramClass.getName(), method1);
    } 
    return method1;
  }
  
  private Method b(String paramString) {
    Method method2 = (Method)this.a.get(paramString);
    Method method1 = method2;
    if (method2 == null) {
      System.currentTimeMillis();
      method1 = Class.forName(paramString, true, a.class.getClassLoader()).getDeclaredMethod("read", new Class[] { a.class });
      this.a.put(paramString, method1);
    } 
    return method1;
  }
  
  private void b(c paramc) {
    try {
      Class clazz = a((Class)paramc.getClass());
      a(clazz.getName());
      return;
    } catch (ClassNotFoundException classNotFoundException) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(paramc.getClass().getSimpleName());
      stringBuilder.append(" does not have a Parcelizer");
      throw new RuntimeException(stringBuilder.toString(), classNotFoundException);
    } 
  }
  
  public int a(int paramInt1, int paramInt2) {
    return !a(paramInt2) ? paramInt1 : g();
  }
  
  public <T extends Parcelable> T a(T paramT, int paramInt) {
    return !a(paramInt) ? paramT : h();
  }
  
  public <T extends c> T a(T paramT, int paramInt) {
    return !a(paramInt) ? paramT : j();
  }
  
  protected <T extends c> T a(String paramString, a parama) {
    try {
      return (T)b(paramString).invoke(null, new Object[] { parama });
    } catch (IllegalAccessException illegalAccessException) {
      throw new RuntimeException("VersionedParcel encountered IllegalAccessException", illegalAccessException);
    } catch (InvocationTargetException invocationTargetException) {
      if (invocationTargetException.getCause() instanceof RuntimeException)
        throw (RuntimeException)invocationTargetException.getCause(); 
      throw new RuntimeException("VersionedParcel encountered InvocationTargetException", invocationTargetException);
    } catch (NoSuchMethodException noSuchMethodException) {
      throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", noSuchMethodException);
    } catch (ClassNotFoundException classNotFoundException) {
      throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", classNotFoundException);
    } 
  }
  
  public CharSequence a(CharSequence paramCharSequence, int paramInt) {
    return !a(paramInt) ? paramCharSequence : f();
  }
  
  public String a(String paramString, int paramInt) {
    return !a(paramInt) ? paramString : i();
  }
  
  protected abstract void a();
  
  protected abstract void a(Parcelable paramParcelable);
  
  protected void a(c paramc) {
    if (paramc == null) {
      a((String)null);
      return;
    } 
    b(paramc);
    a a1 = b();
    a(paramc, a1);
    a1.a();
  }
  
  protected <T extends c> void a(T paramT, a parama) {
    try {
      b(paramT.getClass()).invoke(null, new Object[] { paramT, parama });
      return;
    } catch (IllegalAccessException illegalAccessException) {
      throw new RuntimeException("VersionedParcel encountered IllegalAccessException", illegalAccessException);
    } catch (InvocationTargetException invocationTargetException) {
      if (invocationTargetException.getCause() instanceof RuntimeException)
        throw (RuntimeException)invocationTargetException.getCause(); 
      throw new RuntimeException("VersionedParcel encountered InvocationTargetException", invocationTargetException);
    } catch (NoSuchMethodException noSuchMethodException) {
      throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", noSuchMethodException);
    } catch (ClassNotFoundException classNotFoundException) {
      throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", classNotFoundException);
    } 
  }
  
  protected abstract void a(CharSequence paramCharSequence);
  
  protected abstract void a(String paramString);
  
  protected abstract void a(boolean paramBoolean);
  
  public void a(boolean paramBoolean1, boolean paramBoolean2) {}
  
  protected abstract void a(byte[] paramArrayOfbyte);
  
  protected abstract boolean a(int paramInt);
  
  public boolean a(boolean paramBoolean, int paramInt) {
    return !a(paramInt) ? paramBoolean : d();
  }
  
  public byte[] a(byte[] paramArrayOfbyte, int paramInt) {
    return !a(paramInt) ? paramArrayOfbyte : e();
  }
  
  protected abstract a b();
  
  protected abstract void b(int paramInt);
  
  public void b(int paramInt1, int paramInt2) {
    b(paramInt2);
    c(paramInt1);
  }
  
  public void b(Parcelable paramParcelable, int paramInt) {
    b(paramInt);
    a(paramParcelable);
  }
  
  public void b(c paramc, int paramInt) {
    b(paramInt);
    a(paramc);
  }
  
  public void b(CharSequence paramCharSequence, int paramInt) {
    b(paramInt);
    a(paramCharSequence);
  }
  
  public void b(String paramString, int paramInt) {
    b(paramInt);
    a(paramString);
  }
  
  public void b(boolean paramBoolean, int paramInt) {
    b(paramInt);
    a(paramBoolean);
  }
  
  public void b(byte[] paramArrayOfbyte, int paramInt) {
    b(paramInt);
    a(paramArrayOfbyte);
  }
  
  protected abstract void c(int paramInt);
  
  public boolean c() {
    return false;
  }
  
  protected abstract boolean d();
  
  protected abstract byte[] e();
  
  protected abstract CharSequence f();
  
  protected abstract int g();
  
  protected abstract <T extends Parcelable> T h();
  
  protected abstract String i();
  
  protected <T extends c> T j() {
    String str = i();
    return (str == null) ? null : a(str, b());
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/versionedparcelable/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */