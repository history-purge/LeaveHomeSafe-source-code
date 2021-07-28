package com.google.android.datatransport.runtime.backends;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class k implements e {
  private final a a;
  
  private final i b;
  
  private final Map<String, m> c = new HashMap<String, m>();
  
  k(Context paramContext, i parami) {
    this(new a(paramContext), parami);
  }
  
  k(a parama, i parami) {
    this.a = parama;
    this.b = parami;
  }
  
  public m a(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield c : Ljava/util/Map;
    //   6: aload_1
    //   7: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   12: ifeq -> 33
    //   15: aload_0
    //   16: getfield c : Ljava/util/Map;
    //   19: aload_1
    //   20: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   25: checkcast com/google/android/datatransport/runtime/backends/m
    //   28: astore_1
    //   29: aload_0
    //   30: monitorexit
    //   31: aload_1
    //   32: areturn
    //   33: aload_0
    //   34: getfield a : Lcom/google/android/datatransport/runtime/backends/k$a;
    //   37: aload_1
    //   38: invokevirtual a : (Ljava/lang/String;)Lcom/google/android/datatransport/runtime/backends/d;
    //   41: astore_2
    //   42: aload_2
    //   43: ifnonnull -> 50
    //   46: aload_0
    //   47: monitorexit
    //   48: aconst_null
    //   49: areturn
    //   50: aload_2
    //   51: aload_0
    //   52: getfield b : Lcom/google/android/datatransport/runtime/backends/i;
    //   55: aload_1
    //   56: invokevirtual a : (Ljava/lang/String;)Lcom/google/android/datatransport/runtime/backends/h;
    //   59: invokeinterface create : (Lcom/google/android/datatransport/runtime/backends/h;)Lcom/google/android/datatransport/runtime/backends/m;
    //   64: astore_2
    //   65: aload_0
    //   66: getfield c : Ljava/util/Map;
    //   69: aload_1
    //   70: aload_2
    //   71: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   76: pop
    //   77: aload_0
    //   78: monitorexit
    //   79: aload_2
    //   80: areturn
    //   81: astore_1
    //   82: aload_0
    //   83: monitorexit
    //   84: aload_1
    //   85: athrow
    // Exception table:
    //   from	to	target	type
    //   2	29	81	finally
    //   33	42	81	finally
    //   50	77	81	finally
  }
  
  static class a {
    private final Context a;
    
    private Map<String, String> b = null;
    
    a(Context param1Context) {
      this.a = param1Context;
    }
    
    private Map<String, String> a() {
      if (this.b == null)
        this.b = a(this.a); 
      return this.b;
    }
    
    private Map<String, String> a(Context param1Context) {
      Bundle bundle = b(param1Context);
      if (bundle == null) {
        Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
        return Collections.emptyMap();
      } 
      HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
      for (String str : bundle.keySet()) {
        Object object = bundle.get(str);
        if (object instanceof String && str.startsWith("backend:")) {
          object = ((String)object).split(",", -1);
          int j = object.length;
          for (int i = 0; i < j; i++) {
            String str1 = object[i].trim();
            if (!str1.isEmpty())
              hashMap.put(str1, str.substring(8)); 
          } 
        } 
      } 
      return (Map)hashMap;
    }
    
    private static Bundle b(Context param1Context) {
      try {
        PackageManager packageManager = param1Context.getPackageManager();
        if (packageManager == null) {
          Log.w("BackendRegistry", "Context has no PackageManager.");
          return null;
        } 
        ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(param1Context, TransportBackendDiscovery.class), 128);
        if (serviceInfo == null) {
          Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
          return null;
        } 
        return serviceInfo.metaData;
      } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {
        Log.w("BackendRegistry", "Application info not found.");
        return null;
      } 
    }
    
    d a(String param1String) {
      String str = a().get(param1String);
      if (str == null)
        return null; 
      try {
        return Class.forName(str).<d>asSubclass(d.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
      } catch (ClassNotFoundException classNotFoundException) {
        str = String.format("Class %s is not found.", new Object[] { str });
      } catch (IllegalAccessException illegalAccessException) {
        str = String.format("Could not instantiate %s.", new Object[] { str });
      } catch (InstantiationException instantiationException) {
        str = String.format("Could not instantiate %s.", new Object[] { str });
      } catch (NoSuchMethodException noSuchMethodException) {
        str = String.format("Could not instantiate %s", new Object[] { str });
        Log.w("BackendRegistry", str, noSuchMethodException);
        return null;
      } catch (InvocationTargetException invocationTargetException) {
        str = String.format("Could not instantiate %s", new Object[] { str });
        Log.w("BackendRegistry", str, invocationTargetException);
        return null;
      } 
      Log.w("BackendRegistry", str, invocationTargetException);
      return null;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/datatransport/runtime/backends/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */