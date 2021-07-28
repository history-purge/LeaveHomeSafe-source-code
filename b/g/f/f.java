package b.g.f;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import b.d.g;
import b.g.e.d.c;
import b.g.k.b;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

class f extends j {
  private static final Class<?> b;
  
  private static final Constructor<?> c;
  
  private static final Method d;
  
  private static final Method e;
  
  static {
    ClassNotFoundException classNotFoundException1;
    ClassNotFoundException classNotFoundException2;
    Constructor<?> constructor = null;
    try {
      Class<?> clazz = Class.forName("android.graphics.FontFamily");
      Constructor<?> constructor1 = clazz.getConstructor(new Class[0]);
      Method method2 = clazz.getMethod("addFontWeightStyle", new Class[] { ByteBuffer.class, int.class, List.class, int.class, boolean.class });
      Method method1 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[] { Array.newInstance(clazz, 1).getClass() });
      constructor = constructor1;
    } catch (ClassNotFoundException classNotFoundException) {
      Log.e("TypefaceCompatApi24Impl", classNotFoundException.getClass().getName(), classNotFoundException);
      classNotFoundException1 = null;
      classNotFoundException = classNotFoundException1;
      classNotFoundException2 = classNotFoundException;
    } catch (NoSuchMethodException noSuchMethodException) {}
    c = constructor;
    b = (Class<?>)classNotFoundException1;
    d = (Method)classNotFoundException2;
    e = (Method)noSuchMethodException;
  }
  
  private static Typeface a(Object paramObject) {
    try {
      Object object = Array.newInstance(b, 1);
      Array.set(object, 0, paramObject);
      return (Typeface)e.invoke(null, new Object[] { object });
    } catch (IllegalAccessException|java.lang.reflect.InvocationTargetException illegalAccessException) {
      return null;
    } 
  }
  
  public static boolean a() {
    if (d == null)
      Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation."); 
    return (d != null);
  }
  
  private static boolean a(Object paramObject, ByteBuffer paramByteBuffer, int paramInt1, int paramInt2, boolean paramBoolean) {
    try {
      return ((Boolean)d.invoke(paramObject, new Object[] { paramByteBuffer, Integer.valueOf(paramInt1), null, Integer.valueOf(paramInt2), Boolean.valueOf(paramBoolean) })).booleanValue();
    } catch (IllegalAccessException|java.lang.reflect.InvocationTargetException illegalAccessException) {
      return false;
    } 
  }
  
  private static Object b() {
    try {
      return c.newInstance(new Object[0]);
    } catch (IllegalAccessException|InstantiationException|java.lang.reflect.InvocationTargetException illegalAccessException) {
      return null;
    } 
  }
  
  public Typeface a(Context paramContext, CancellationSignal paramCancellationSignal, b.f[] paramArrayOff, int paramInt) {
    Object object = b();
    if (object == null)
      return null; 
    g g = new g();
    int k = paramArrayOff.length;
    int i;
    for (i = 0; i < k; i++) {
      b.f f1 = paramArrayOff[i];
      Uri uri = f1.c();
      ByteBuffer byteBuffer2 = (ByteBuffer)g.get(uri);
      ByteBuffer byteBuffer1 = byteBuffer2;
      if (byteBuffer2 == null) {
        byteBuffer1 = k.a(paramContext, paramCancellationSignal, uri);
        g.put(uri, byteBuffer1);
      } 
      if (byteBuffer1 == null)
        return null; 
      if (!a(object, byteBuffer1, f1.b(), f1.d(), f1.e()))
        return null; 
    } 
    Typeface typeface = a(object);
    return (typeface == null) ? null : Typeface.create(typeface, paramInt);
  }
  
  public Typeface a(Context paramContext, c.b paramb, Resources paramResources, int paramInt) {
    Object object = b();
    if (object == null)
      return null; 
    c.c[] arrayOfC = paramb.a();
    int i = arrayOfC.length;
    for (paramInt = 0; paramInt < i; paramInt++) {
      c.c c = arrayOfC[paramInt];
      ByteBuffer byteBuffer = k.a(paramContext, paramResources, c.b());
      if (byteBuffer == null)
        return null; 
      if (!a(object, byteBuffer, c.c(), c.e(), c.f()))
        return null; 
    } 
    return a(object);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/g/f/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */