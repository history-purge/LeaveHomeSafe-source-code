package com.facebook.react.uimanager;

import android.view.View;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class z0 {
  private static final Map<Class<?>, f<?, ?>> a = new HashMap<Class<?>, f<?, ?>>();
  
  private static final Map<Class<?>, e<?>> b = new HashMap<Class<?>, e<?>>();
  
  private static <T> T a(Class<?> paramClass) {
    StringBuilder stringBuilder;
    String str = paramClass.getName();
    try {
      null = new StringBuilder();
      null.append(str);
      null.append("$$PropsSetter");
      return (T)Class.forName(null.toString()).newInstance();
    } catch (ClassNotFoundException classNotFoundException) {
      stringBuilder = new StringBuilder();
      stringBuilder.append("Could not find generated setter for ");
      stringBuilder.append(paramClass);
      e.e.e.e.a.e("ViewManagerPropertyUpdater", stringBuilder.toString());
      return null;
    } catch (InstantiationException instantiationException) {
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("Unable to instantiate methods getter for ");
      stringBuilder1.append((String)stringBuilder);
      throw new RuntimeException(stringBuilder1.toString(), instantiationException);
    } catch (IllegalAccessException illegalAccessException) {
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("Unable to instantiate methods getter for ");
      stringBuilder1.append((String)stringBuilder);
      throw new RuntimeException(stringBuilder1.toString(), illegalAccessException);
    } 
  }
  
  public static Map<String, String> a(Class<? extends ViewManager> paramClass, Class<? extends a0> paramClass1) {
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    b(paramClass).a((Map)hashMap);
    c(paramClass1).a((Map)hashMap);
    return (Map)hashMap;
  }
  
  public static void a() {
    b1.a();
    a.clear();
    b.clear();
  }
  
  public static <T extends ViewManager, V extends View> void a(T paramT, V paramV, c0 paramc0) {
    f<ViewManager, View> f = b((Class)paramT.getClass());
    Iterator<Map.Entry> iterator = paramc0.a.getEntryIterator();
    while (iterator.hasNext()) {
      Map.Entry entry = iterator.next();
      f.a((ViewManager)paramT, (View)paramV, (String)entry.getKey(), entry.getValue());
    } 
  }
  
  public static <T extends a0> void a(T paramT, c0 paramc0) {
    e<a0> e = c((Class)paramT.getClass());
    Iterator<Map.Entry> iterator = paramc0.a.getEntryIterator();
    while (iterator.hasNext()) {
      Map.Entry entry = iterator.next();
      e.a((a0)paramT, (String)entry.getKey(), entry.getValue());
    } 
  }
  
  public static <T extends y0<V>, V extends View> void a(T paramT, V paramV, c0 paramc0) {
    Iterator<Map.Entry> iterator = paramc0.a.getEntryIterator();
    while (iterator.hasNext()) {
      Map.Entry entry = iterator.next();
      paramT.a(paramV, (String)entry.getKey(), entry.getValue());
    } 
  }
  
  private static <T extends ViewManager, V extends View> f<T, V> b(Class<? extends ViewManager> paramClass) {
    f<ViewManager, View> f2 = (f)a.get(paramClass);
    f<ViewManager, View> f1 = f2;
    if (f2 == null) {
      f2 = a(paramClass);
      f1 = f2;
      if (f2 == null)
        f1 = new c<ViewManager, View>(paramClass, null); 
      a.put(paramClass, f1);
    } 
    return (f)f1;
  }
  
  private static <T extends a0> e<T> c(Class<? extends a0> paramClass) {
    e<a0> e2 = (e)b.get(paramClass);
    e<a0> e1 = e2;
    if (e2 == null) {
      e2 = a(paramClass);
      e1 = e2;
      if (e2 == null)
        e1 = new b<a0>(paramClass, null); 
      b.put(paramClass, e1);
    } 
    return (e)e1;
  }
  
  private static class b<T extends a0> implements e<T> {
    private final Map<String, b1.l> a;
    
    private b(Class<? extends a0> param1Class) {
      this.a = b1.a(param1Class);
    }
    
    public void a(a0 param1a0, String param1String, Object param1Object) {
      b1.l l = this.a.get(param1String);
      if (l != null)
        l.a(param1a0, param1Object); 
    }
    
    public void a(Map<String, String> param1Map) {
      for (b1.l l : this.a.values())
        param1Map.put(l.a(), l.b()); 
    }
  }
  
  private static class c<T extends ViewManager, V extends View> implements f<T, V> {
    private final Map<String, b1.l> a;
    
    private c(Class<? extends ViewManager> param1Class) {
      this.a = b1.b(param1Class);
    }
    
    public void a(T param1T, V param1V, String param1String, Object param1Object) {
      b1.l l = this.a.get(param1String);
      if (l != null)
        l.a((ViewManager)param1T, (View)param1V, param1Object); 
    }
    
    public void a(Map<String, String> param1Map) {
      for (b1.l l : this.a.values())
        param1Map.put(l.a(), l.b()); 
    }
  }
  
  public static interface d {
    void a(Map<String, String> param1Map);
  }
  
  public static interface e<T extends a0> extends d {
    void a(T param1T, String param1String, Object param1Object);
  }
  
  public static interface f<T extends ViewManager, V extends View> extends d {
    void a(T param1T, V param1V, String param1String, Object param1Object);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/uimanager/z0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */