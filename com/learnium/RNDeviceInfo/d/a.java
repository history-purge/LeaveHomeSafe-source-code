package com.learnium.RNDeviceInfo.d;

import android.content.Context;

public class a {
  private final Context a;
  
  public a(Context paramContext) {
    this.a = paramContext;
  }
  
  String a() {
    Object object = Class.forName("com.google.firebase.iid.FirebaseInstanceId").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
    return (String)object.getClass().getMethod("getId", new Class[0]).invoke(object, new Object[0]);
  }
  
  String b() {
    Object object = Class.forName("e.f.a.e.h.a").getDeclaredMethod("getInstance", new Class[] { Context.class }).invoke(null, new Object[] { this.a });
    return (String)object.getClass().getMethod("getId", new Class[0]).invoke(object, new Object[0]);
  }
  
  public String c() {
    try {
      return a();
    } catch (ClassNotFoundException classNotFoundException) {
    
    } catch (NoSuchMethodException|SecurityException|IllegalAccessException|java.lang.reflect.InvocationTargetException noSuchMethodException) {
      System.err.println("N/A: Unsupported version of com.google.firebase:firebase-iid in your project.");
    } 
    try {
      return b();
    } catch (ClassNotFoundException classNotFoundException) {
    
    } catch (NoSuchMethodException|SecurityException|IllegalAccessException|java.lang.reflect.InvocationTargetException noSuchMethodException) {
      System.err.println("N/A: Unsupported version of com.google.android.gms.iid in your project.");
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/learnium/RNDeviceInfo/d/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */