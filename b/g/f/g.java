package b.g.f;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.os.CancellationSignal;
import android.util.Log;
import b.g.e.d.c;
import b.g.k.b;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

public class g extends e {
  protected final Class<?> g;
  
  protected final Constructor<?> h;
  
  protected final Method i;
  
  protected final Method j;
  
  protected final Method k;
  
  protected final Method l;
  
  protected final Method m;
  
  public g() {
    ClassNotFoundException classNotFoundException1;
    ClassNotFoundException classNotFoundException2;
    ClassNotFoundException classNotFoundException3;
    ClassNotFoundException classNotFoundException4;
    ClassNotFoundException classNotFoundException5;
    ClassNotFoundException classNotFoundException6;
    ClassNotFoundException classNotFoundException7 = null;
    try {
      Class<?> clazz = a();
      Constructor<?> constructor = e(clazz);
      Method method2 = b(clazz);
      Method method3 = c(clazz);
      Method method4 = f(clazz);
      Method method5 = a(clazz);
      Method method1 = d(clazz);
    } catch (ClassNotFoundException classNotFoundException8) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Unable to collect necessary methods for class ");
      stringBuilder.append(classNotFoundException8.getClass().getName());
      Log.e("TypefaceCompatApi26Impl", stringBuilder.toString(), classNotFoundException8);
      ClassNotFoundException classNotFoundException9 = null;
      classNotFoundException8 = classNotFoundException9;
      classNotFoundException1 = classNotFoundException8;
      classNotFoundException2 = classNotFoundException1;
      classNotFoundException3 = classNotFoundException2;
      classNotFoundException6 = classNotFoundException3;
      classNotFoundException5 = classNotFoundException3;
      classNotFoundException4 = classNotFoundException2;
      classNotFoundException3 = classNotFoundException1;
      classNotFoundException2 = classNotFoundException8;
      classNotFoundException1 = classNotFoundException9;
      classNotFoundException8 = classNotFoundException7;
    } catch (NoSuchMethodException noSuchMethodException) {}
    this.g = (Class<?>)noSuchMethodException;
    this.h = (Constructor<?>)classNotFoundException2;
    this.i = (Method)classNotFoundException3;
    this.j = (Method)classNotFoundException4;
    this.k = (Method)classNotFoundException5;
    this.l = (Method)classNotFoundException6;
    this.m = (Method)classNotFoundException1;
  }
  
  private boolean a(Context paramContext, Object paramObject, String paramString, int paramInt1, int paramInt2, int paramInt3, FontVariationAxis[] paramArrayOfFontVariationAxis) {
    try {
      return ((Boolean)this.i.invoke(paramObject, new Object[] { paramContext.getAssets(), paramString, Integer.valueOf(0), Boolean.valueOf(false), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramArrayOfFontVariationAxis })).booleanValue();
    } catch (IllegalAccessException|java.lang.reflect.InvocationTargetException illegalAccessException) {
      return false;
    } 
  }
  
  private boolean a(Object paramObject, ByteBuffer paramByteBuffer, int paramInt1, int paramInt2, int paramInt3) {
    try {
      return ((Boolean)this.j.invoke(paramObject, new Object[] { paramByteBuffer, Integer.valueOf(paramInt1), null, Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) })).booleanValue();
    } catch (IllegalAccessException|java.lang.reflect.InvocationTargetException illegalAccessException) {
      return false;
    } 
  }
  
  private void b(Object paramObject) {
    try {
      this.l.invoke(paramObject, new Object[0]);
      return;
    } catch (IllegalAccessException|java.lang.reflect.InvocationTargetException illegalAccessException) {
      return;
    } 
  }
  
  private boolean b() {
    if (this.i == null)
      Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation."); 
    return (this.i != null);
  }
  
  private Object c() {
    try {
      return this.h.newInstance(new Object[0]);
    } catch (IllegalAccessException|InstantiationException|java.lang.reflect.InvocationTargetException illegalAccessException) {
      return null;
    } 
  }
  
  private boolean c(Object paramObject) {
    try {
      return ((Boolean)this.k.invoke(paramObject, new Object[0])).booleanValue();
    } catch (IllegalAccessException|java.lang.reflect.InvocationTargetException illegalAccessException) {
      return false;
    } 
  }
  
  public Typeface a(Context paramContext, Resources paramResources, int paramInt1, String paramString, int paramInt2) {
    if (!b())
      return super.a(paramContext, paramResources, paramInt1, paramString, paramInt2); 
    Object object = c();
    if (object == null)
      return null; 
    if (!a(paramContext, object, paramString, 0, -1, -1, null)) {
      b(object);
      return null;
    } 
    return !c(object) ? null : a(object);
  }
  
  public Typeface a(Context paramContext, CancellationSignal paramCancellationSignal, b.f[] paramArrayOff, int paramInt) {
    throw new RuntimeException("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
  
  public Typeface a(Context paramContext, c.b paramb, Resources paramResources, int paramInt) {
    throw new RuntimeException("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
  
  protected Typeface a(Object paramObject) {
    try {
      Object object = Array.newInstance(this.g, 1);
      Array.set(object, 0, paramObject);
      return (Typeface)this.m.invoke(null, new Object[] { object, Integer.valueOf(-1), Integer.valueOf(-1) });
    } catch (IllegalAccessException|java.lang.reflect.InvocationTargetException illegalAccessException) {
      return null;
    } 
  }
  
  protected Class<?> a() {
    return Class.forName("android.graphics.FontFamily");
  }
  
  protected Method a(Class<?> paramClass) {
    return paramClass.getMethod("abortCreation", new Class[0]);
  }
  
  protected Method b(Class<?> paramClass) {
    Class<int> clazz1 = int.class;
    Class<boolean> clazz = boolean.class;
    Class<int> clazz2 = int.class;
    return paramClass.getMethod("addFontFromAssetManager", new Class[] { AssetManager.class, String.class, clazz1, clazz, clazz2, clazz2, clazz2, FontVariationAxis[].class });
  }
  
  protected Method c(Class<?> paramClass) {
    Class<int> clazz = int.class;
    return paramClass.getMethod("addFontFromBuffer", new Class[] { ByteBuffer.class, clazz, FontVariationAxis[].class, clazz, clazz });
  }
  
  protected Method d(Class<?> paramClass) {
    paramClass = Array.newInstance(paramClass, 1).getClass();
    Class<int> clazz = int.class;
    Method method = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[] { paramClass, clazz, clazz });
    method.setAccessible(true);
    return method;
  }
  
  protected Constructor<?> e(Class<?> paramClass) {
    return paramClass.getConstructor(new Class[0]);
  }
  
  protected Method f(Class<?> paramClass) {
    return paramClass.getMethod("freeze", new Class[0]);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/g/f/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */