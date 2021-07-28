package b.g.f;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import b.g.e.d.c;
import b.g.k.b;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class e extends j {
  private static Class<?> b;
  
  private static Constructor<?> c;
  
  private static Method d;
  
  private static Method e;
  
  private static boolean f = false;
  
  private static Typeface a(Object paramObject) {
    a();
    try {
      Object object = Array.newInstance(b, 1);
      Array.set(object, 0, paramObject);
      return (Typeface)e.invoke(null, new Object[] { object });
    } catch (IllegalAccessException illegalAccessException) {
    
    } catch (InvocationTargetException invocationTargetException) {}
    throw new RuntimeException(invocationTargetException);
  }
  
  private File a(ParcelFileDescriptor paramParcelFileDescriptor) {
    try {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("/proc/self/fd/");
      stringBuilder.append(paramParcelFileDescriptor.getFd());
      String str = Os.readlink(stringBuilder.toString());
      return OsConstants.S_ISREG((Os.stat(str)).st_mode) ? new File(str) : null;
    } catch (ErrnoException errnoException) {
      return null;
    } 
  }
  
  private static void a() {
    ClassNotFoundException classNotFoundException1;
    ClassNotFoundException classNotFoundException2;
    if (f)
      return; 
    f = true;
    Constructor<?> constructor = null;
    try {
      Class<?> clazz = Class.forName("android.graphics.FontFamily");
      Constructor<?> constructor1 = clazz.getConstructor(new Class[0]);
      Method method2 = clazz.getMethod("addFontWeightStyle", new Class[] { String.class, int.class, boolean.class });
      Method method1 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[] { Array.newInstance(clazz, 1).getClass() });
      constructor = constructor1;
    } catch (ClassNotFoundException classNotFoundException) {
      Log.e("TypefaceCompatApi21Impl", classNotFoundException.getClass().getName(), classNotFoundException);
      classNotFoundException1 = null;
      classNotFoundException = classNotFoundException1;
      classNotFoundException2 = classNotFoundException;
    } catch (NoSuchMethodException noSuchMethodException) {}
    c = constructor;
    b = (Class<?>)noSuchMethodException;
    d = (Method)classNotFoundException2;
    e = (Method)classNotFoundException1;
  }
  
  private static boolean a(Object paramObject, String paramString, int paramInt, boolean paramBoolean) {
    a();
    try {
      return ((Boolean)d.invoke(paramObject, new Object[] { paramString, Integer.valueOf(paramInt), Boolean.valueOf(paramBoolean) })).booleanValue();
    } catch (IllegalAccessException illegalAccessException) {
    
    } catch (InvocationTargetException invocationTargetException) {}
    throw new RuntimeException(invocationTargetException);
  }
  
  private static Object b() {
    a();
    try {
      return c.newInstance(new Object[0]);
    } catch (IllegalAccessException illegalAccessException) {
    
    } catch (InstantiationException instantiationException) {
    
    } catch (InvocationTargetException invocationTargetException) {}
    throw new RuntimeException(invocationTargetException);
  }
  
  public Typeface a(Context paramContext, CancellationSignal paramCancellationSignal, b.f[] paramArrayOff, int paramInt) {
    if (paramArrayOff.length < 1)
      return null; 
    b.f f1 = a(paramArrayOff, paramInt);
    ContentResolver contentResolver = paramContext.getContentResolver();
    try {
      ParcelFileDescriptor parcelFileDescriptor = contentResolver.openFileDescriptor(f1.c(), "r", paramCancellationSignal);
      if (parcelFileDescriptor == null) {
        if (parcelFileDescriptor != null)
          parcelFileDescriptor.close(); 
        return null;
      } 
      try {
        FileInputStream fileInputStream;
        File file = a(parcelFileDescriptor);
        if (file == null || !file.canRead()) {
          fileInputStream = new FileInputStream(parcelFileDescriptor.getFileDescriptor());
          try {
            return a(paramContext, fileInputStream);
          } finally {
            try {
              fileInputStream.close();
            } finally {}
          } 
        } 
        return Typeface.createFromFile((File)fileInputStream);
      } finally {
        if (parcelFileDescriptor != null)
          try {
            parcelFileDescriptor.close();
          } finally {} 
      } 
    } catch (IOException iOException) {
      return null;
    } 
  }
  
  public Typeface a(Context paramContext, c.b paramb, Resources paramResources, int paramInt) {
    Object object = b();
    c.c[] arrayOfC = paramb.a();
    int i = arrayOfC.length;
    paramInt = 0;
    while (true) {
      if (paramInt < i) {
        c.c c = arrayOfC[paramInt];
        File file = k.a(paramContext);
        if (file == null)
          return null; 
        try {
          boolean bool = k.a(file, paramResources, c.b());
          if (!bool)
            return null; 
          bool = a(object, file.getPath(), c.e(), c.f());
          file.delete();
          if (!bool)
            return null; 
        } catch (RuntimeException runtimeException) {
          return null;
        } finally {
          file.delete();
        } 
        continue;
      } 
      return a(object);
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/g/f/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */