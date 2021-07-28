package com.google.android.gms.common.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.internal.q;
import e.f.a.e.e.n.b;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class o {
  private static final Method a = a();
  
  private static final Method b = b();
  
  private static final Method c = c();
  
  private static final Method d = e();
  
  static {
    f();
    g();
  }
  
  private static WorkSource a(int paramInt, String paramString) {
    WorkSource workSource = new WorkSource();
    a(workSource, paramInt, paramString);
    return workSource;
  }
  
  @RecentlyNullable
  public static WorkSource a(@RecentlyNonNull Context paramContext, String paramString) {
    if (paramContext != null && paramContext.getPackageManager() != null) {
      if (paramString == null)
        return null; 
      try {
        String str;
        ApplicationInfo applicationInfo = b.a(paramContext).a(paramString, 0);
        if (applicationInfo == null) {
          str = String.valueOf(paramString);
          if (str.length() != 0) {
            str = "Could not get applicationInfo from package: ".concat(str);
          } else {
            str = new String("Could not get applicationInfo from package: ");
          } 
          Log.e("WorkSourceUtil", str);
          return null;
        } 
        return a(((ApplicationInfo)str).uid, paramString);
      } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {
        String str = String.valueOf(paramString);
        if (str.length() != 0) {
          str = "Could not find package: ".concat(str);
        } else {
          str = new String("Could not find package: ");
        } 
        Log.e("WorkSourceUtil", str);
      } 
    } 
    return null;
  }
  
  private static String a(WorkSource paramWorkSource, int paramInt) {
    Method method = d;
    if (method != null)
      try {
        return (String)method.invoke(paramWorkSource, new Object[] { Integer.valueOf(paramInt) });
      } catch (Exception exception) {
        Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", exception);
      }  
    return null;
  }
  
  private static Method a() {
    try {
      return WorkSource.class.getMethod("add", new Class[] { int.class });
    } catch (Exception exception) {
      return null;
    } 
  }
  
  @RecentlyNonNull
  public static List<String> a(WorkSource paramWorkSource) {
    int i;
    ArrayList<String> arrayList = new ArrayList();
    int j = 0;
    if (paramWorkSource == null) {
      i = 0;
    } else {
      i = b(paramWorkSource);
    } 
    if (i == 0)
      return arrayList; 
    while (j < i) {
      String str = a(paramWorkSource, j);
      if (!m.a(str)) {
        q.a(str);
        arrayList.add(str);
      } 
      j++;
    } 
    return arrayList;
  }
  
  private static void a(WorkSource paramWorkSource, int paramInt, String paramString) {
    if (b != null) {
      String str = paramString;
      if (paramString == null)
        str = ""; 
      try {
        b.invoke(paramWorkSource, new Object[] { Integer.valueOf(paramInt), str });
        return;
      } catch (Exception exception) {
        Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", exception);
        return;
      } 
    } 
    Method method = a;
    if (method != null)
      try {
        method.invoke(exception, new Object[] { Integer.valueOf(paramInt) });
        return;
      } catch (Exception exception1) {
        Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", exception1);
      }  
  }
  
  @RecentlyNonNull
  public static boolean a(@RecentlyNonNull Context paramContext) {
    return (paramContext == null) ? false : ((paramContext.getPackageManager() == null) ? false : ((b.a(paramContext).a("android.permission.UPDATE_DEVICE_STATS", paramContext.getPackageName()) == 0)));
  }
  
  private static int b(WorkSource paramWorkSource) {
    Method method = c;
    if (method != null)
      try {
        Object object = method.invoke(paramWorkSource, new Object[0]);
        q.a(object);
        return ((Integer)object).intValue();
      } catch (Exception exception) {
        Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", exception);
      }  
    return 0;
  }
  
  private static Method b() {
    if (k.c())
      try {
        return WorkSource.class.getMethod("add", new Class[] { int.class, String.class });
      } catch (Exception exception) {} 
    return null;
  }
  
  private static Method c() {
    try {
      return WorkSource.class.getMethod("size", new Class[0]);
    } catch (Exception exception) {
      return null;
    } 
  }
  
  private static Method d() {
    try {
      return WorkSource.class.getMethod("get", new Class[] { int.class });
    } catch (Exception exception) {
      return null;
    } 
  }
  
  private static Method e() {
    if (k.c())
      try {
        return WorkSource.class.getMethod("getName", new Class[] { int.class });
      } catch (Exception exception) {} 
    return null;
  }
  
  private static final Method f() {
    if (k.i())
      try {
        return WorkSource.class.getMethod("createWorkChain", new Class[0]);
      } catch (Exception exception) {
        Log.w("WorkSourceUtil", "Missing WorkChain API createWorkChain", exception);
      }  
    return null;
  }
  
  @SuppressLint({"PrivateApi"})
  private static final Method g() {
    if (k.i())
      try {
        return Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", new Class[] { int.class, String.class });
      } catch (Exception exception) {
        Log.w("WorkSourceUtil", "Missing WorkChain class", exception);
      }  
    return null;
  }
  
  static {
    Process.myUid();
  }
  
  static {
    d();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/common/util/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */