package androidx.fragment.app;

import b.d.g;

public class j {
  private static final g<ClassLoader, g<String, Class<?>>> a = new g();
  
  static boolean b(ClassLoader paramClassLoader, String paramString) {
    try {
      return Fragment.class.isAssignableFrom(c(paramClassLoader, paramString));
    } catch (ClassNotFoundException classNotFoundException) {
      return false;
    } 
  }
  
  private static Class<?> c(ClassLoader paramClassLoader, String paramString) {
    g g2 = (g)a.get(paramClassLoader);
    g g1 = g2;
    if (g2 == null) {
      g1 = new g();
      a.put(paramClassLoader, g1);
    } 
    Class<?> clazz2 = (Class)g1.get(paramString);
    Class<?> clazz1 = clazz2;
    if (clazz2 == null) {
      clazz1 = Class.forName(paramString, false, paramClassLoader);
      g1.put(paramString, clazz1);
    } 
    return clazz1;
  }
  
  public static Class<? extends Fragment> d(ClassLoader paramClassLoader, String paramString) {
    try {
      return (Class)c(paramClassLoader, paramString);
    } catch (ClassNotFoundException classNotFoundException) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Unable to instantiate fragment ");
      stringBuilder.append(paramString);
      stringBuilder.append(": make sure class name exists");
      throw new Fragment.f(stringBuilder.toString(), classNotFoundException);
    } catch (ClassCastException classCastException) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Unable to instantiate fragment ");
      stringBuilder.append(paramString);
      stringBuilder.append(": make sure class is a valid subclass of Fragment");
      throw new Fragment.f(stringBuilder.toString(), classCastException);
    } 
  }
  
  public Fragment a(ClassLoader paramClassLoader, String paramString) {
    throw null;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/fragment/app/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */