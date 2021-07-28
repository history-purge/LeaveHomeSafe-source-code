package com.google.firebase.components;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class p<T> {
  private final T a;
  
  private final c<T> b;
  
  p(T paramT, c<T> paramc) {
    this.a = paramT;
    this.b = paramc;
  }
  
  public static p<Context> a(Context paramContext, Class<? extends Service> paramClass) {
    return new p<Context>(paramContext, new b(paramClass, null));
  }
  
  private static r a(String paramString) {
    try {
      Class<?> clazz = Class.forName(paramString);
      if (r.class.isAssignableFrom(clazz))
        return clazz.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]); 
      throw new y(String.format("Class %s is not an instance of %s", new Object[] { paramString, "com.google.firebase.components.ComponentRegistrar" }));
    } catch (ClassNotFoundException classNotFoundException) {
      Log.w("ComponentDiscovery", String.format("Class %s is not an found.", new Object[] { paramString }));
      return null;
    } catch (IllegalAccessException illegalAccessException) {
      throw new y(String.format("Could not instantiate %s.", new Object[] { paramString }), illegalAccessException);
    } catch (InstantiationException instantiationException) {
      throw new y(String.format("Could not instantiate %s.", new Object[] { paramString }), instantiationException);
    } catch (NoSuchMethodException noSuchMethodException) {
      throw new y(String.format("Could not instantiate %s", new Object[] { paramString }), noSuchMethodException);
    } catch (InvocationTargetException invocationTargetException) {
      throw new y(String.format("Could not instantiate %s", new Object[] { paramString }), invocationTargetException);
    } 
  }
  
  @Deprecated
  public List<r> a() {
    ArrayList<r> arrayList = new ArrayList();
    for (String str : this.b.a(this.a)) {
      try {
        r r = a(str);
        if (r != null)
          arrayList.add(r); 
      } catch (y y) {
        Log.w("ComponentDiscovery", "Invalid component registrar.", y);
      } 
    } 
    return arrayList;
  }
  
  public List<com.google.firebase.p.b<r>> b() {
    ArrayList<c> arrayList = new ArrayList();
    Iterator<String> iterator = this.b.a(this.a).iterator();
    while (iterator.hasNext())
      arrayList.add(new c(iterator.next())); 
    return (List)arrayList;
  }
  
  private static class b implements c<Context> {
    private final Class<? extends Service> a;
    
    private b(Class<? extends Service> param1Class) {
      this.a = param1Class;
    }
    
    private Bundle b(Context param1Context) {
      try {
        StringBuilder stringBuilder;
        PackageManager packageManager = param1Context.getPackageManager();
        if (packageManager == null) {
          Log.w("ComponentDiscovery", "Context has no PackageManager.");
          return null;
        } 
        ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(param1Context, this.a), 128);
        if (serviceInfo == null) {
          stringBuilder = new StringBuilder();
          stringBuilder.append(this.a);
          stringBuilder.append(" has no service info.");
          Log.w("ComponentDiscovery", stringBuilder.toString());
          return null;
        } 
        return ((ServiceInfo)stringBuilder).metaData;
      } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {
        Log.w("ComponentDiscovery", "Application info not found.");
        return null;
      } 
    }
    
    public List<String> a(Context param1Context) {
      Bundle bundle = b(param1Context);
      if (bundle == null) {
        Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
        return Collections.emptyList();
      } 
      ArrayList<String> arrayList = new ArrayList();
      for (String str : bundle.keySet()) {
        if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str)) && str.startsWith("com.google.firebase.components:"))
          arrayList.add(str.substring(31)); 
      } 
      return arrayList;
    }
  }
  
  static interface c<T> {
    List<String> a(T param1T);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/firebase/components/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */