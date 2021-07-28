package e.f.a.e.i.n;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

abstract class e3<T extends t2> {
  private static final Logger a = Logger.getLogger(o2.class.getName());
  
  private static String b = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
  
  static <T extends t2> T a(Class<T> paramClass) {
    IllegalArgumentException illegalArgumentException;
    String str;
    ClassLoader classLoader = e3.class.getClassLoader();
    if (paramClass.equals(t2.class)) {
      str = b;
    } else if (paramClass.getPackage().equals(e3.class.getPackage())) {
      str = String.format("%s.BlazeGenerated%sLoader", new Object[] { paramClass.getPackage().getName(), paramClass.getSimpleName() });
    } else {
      illegalArgumentException = new IllegalArgumentException(paramClass.getName());
      throw illegalArgumentException;
    } 
    try {
      Class<?> clazz = Class.forName(str, true, classLoader);
      try {
        e3 e31 = clazz.getConstructor(new Class[0]).newInstance(new Object[0]);
        return (T)illegalArgumentException.cast(e31.a());
      } catch (NoSuchMethodException noSuchMethodException) {
        throw new IllegalStateException(noSuchMethodException);
      } catch (InstantiationException instantiationException) {
        throw new IllegalStateException(instantiationException);
      } catch (IllegalAccessException illegalAccessException) {
        throw new IllegalStateException(illegalAccessException);
      } catch (InvocationTargetException invocationTargetException) {
        throw new IllegalStateException(invocationTargetException);
      } 
    } catch (ClassNotFoundException classNotFoundException) {
      Iterator<e3> iterator = ServiceLoader.<e3>load(e3.class, classLoader).iterator();
      ArrayList<t2> arrayList = new ArrayList();
      while (iterator.hasNext()) {
        try {
          arrayList.add(illegalArgumentException.cast(((e3)iterator.next()).a()));
        } catch (ServiceConfigurationError serviceConfigurationError) {
          Logger logger = a;
          Level level = Level.SEVERE;
          String str1 = String.valueOf(illegalArgumentException.getSimpleName());
          if (str1.length() != 0) {
            str1 = "Unable to load ".concat(str1);
          } else {
            str1 = new String("Unable to load ");
          } 
          logger.logp(level, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", str1, serviceConfigurationError);
        } 
      } 
      if (arrayList.size() == 1)
        return (T)arrayList.get(0); 
      if (arrayList.size() == 0)
        return null; 
      try {
        return (T)illegalArgumentException.getMethod("combine", new Class[] { Collection.class }).invoke(null, new Object[] { arrayList });
      } catch (NoSuchMethodException noSuchMethodException) {
        throw new IllegalStateException(noSuchMethodException);
      } catch (IllegalAccessException illegalAccessException) {
        throw new IllegalStateException(illegalAccessException);
      } catch (InvocationTargetException invocationTargetException) {
        throw new IllegalStateException(invocationTargetException);
      } 
    } 
  }
  
  protected abstract T a();
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/n/e3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */