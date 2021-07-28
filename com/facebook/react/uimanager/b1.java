package com.facebook.react.uimanager;

import android.content.Context;
import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.e1.a;
import com.facebook.react.uimanager.e1.b;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

class b1 {
  private static final Map<Class, Map<String, l>> a = (Map)new HashMap<Class<?>, Map<String, l>>();
  
  private static final Map<String, l> b = new HashMap<String, l>();
  
  private static l a(a parama, Method paramMethod, Class<?> paramClass) {
    if (paramClass == Dynamic.class)
      return new h(parama, paramMethod); 
    if (paramClass == boolean.class)
      return new c(parama, paramMethod, parama.defaultBoolean()); 
    if (paramClass == int.class)
      return (l)("Color".equals(parama.customType()) ? new f(parama, paramMethod, parama.defaultInt()) : new j(parama, paramMethod, parama.defaultInt())); 
    if (paramClass == float.class)
      return new i(parama, paramMethod, parama.defaultFloat()); 
    if (paramClass == double.class)
      return new g(parama, paramMethod, parama.defaultDouble()); 
    if (paramClass == String.class)
      return new m(parama, paramMethod); 
    if (paramClass == Boolean.class)
      return new d(parama, paramMethod); 
    if (paramClass == Integer.class)
      return (l)("Color".equals(parama.customType()) ? new f(parama, paramMethod) : new e(parama, paramMethod)); 
    if (paramClass == ReadableArray.class)
      return new b(parama, paramMethod); 
    if (paramClass == ReadableMap.class)
      return new k(parama, paramMethod); 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Unrecognized type: ");
    stringBuilder.append(paramClass);
    stringBuilder.append(" for method: ");
    stringBuilder.append(paramMethod.getDeclaringClass().getName());
    stringBuilder.append("#");
    stringBuilder.append(paramMethod.getName());
    throw new RuntimeException(stringBuilder.toString());
  }
  
  static Map<String, l> a(Class<? extends a0> paramClass) {
    Class[] arrayOfClass = paramClass.getInterfaces();
    int j = arrayOfClass.length;
    for (int i = 0; i < j; i++) {
      if (arrayOfClass[i] == a0.class)
        return b; 
    } 
    Map<String, l> map = a.get(paramClass);
    if (map != null)
      return map; 
    map = new HashMap<String, l>(a((Class)paramClass.getSuperclass()));
    a(paramClass, map);
    a.put(paramClass, map);
    return map;
  }
  
  public static void a() {
    a.clear();
    b.clear();
  }
  
  private static void a(b paramb, Method paramMethod, Class<?> paramClass, Map<String, l> paramMap) {
    String[] arrayOfString = paramb.names();
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = false;
    boolean bool4 = false;
    int i = 0;
    if (paramClass == Dynamic.class) {
      while (i < arrayOfString.length) {
        paramMap.put(arrayOfString[i], new h(paramb, paramMethod, i));
        i++;
      } 
    } else if (paramClass == int.class) {
      for (i = bool1; i < arrayOfString.length; i++)
        paramMap.put(arrayOfString[i], new j(paramb, paramMethod, i, paramb.defaultInt())); 
    } else if (paramClass == float.class) {
      for (i = bool2; i < arrayOfString.length; i++)
        paramMap.put(arrayOfString[i], new i(paramb, paramMethod, i, paramb.defaultFloat())); 
    } else if (paramClass == double.class) {
      for (i = bool3; i < arrayOfString.length; i++)
        paramMap.put(arrayOfString[i], new g(paramb, paramMethod, i, paramb.defaultDouble())); 
    } else {
      if (paramClass == Integer.class) {
        for (i = bool4; i < arrayOfString.length; i++)
          paramMap.put(arrayOfString[i], new e(paramb, paramMethod, i)); 
        return;
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Unrecognized type: ");
      stringBuilder.append(paramClass);
      stringBuilder.append(" for method: ");
      stringBuilder.append(paramMethod.getDeclaringClass().getName());
      stringBuilder.append("#");
      stringBuilder.append(paramMethod.getName());
      RuntimeException runtimeException = new RuntimeException(stringBuilder.toString());
      throw runtimeException;
    } 
  }
  
  private static void a(Class<? extends a0> paramClass, Map<String, l> paramMap) {
    for (Method method : paramClass.getDeclaredMethods()) {
      StringBuilder stringBuilder;
      a a = method.<a>getAnnotation(a.class);
      if (a != null) {
        Class[] arrayOfClass = method.getParameterTypes();
        if (arrayOfClass.length == 1) {
          paramMap.put(a.name(), a(a, method, arrayOfClass[0]));
        } else {
          stringBuilder = new StringBuilder();
          stringBuilder.append("Wrong number of args for prop setter: ");
          stringBuilder.append(paramClass.getName());
          stringBuilder.append("#");
          stringBuilder.append(method.getName());
          throw new RuntimeException(stringBuilder.toString());
        } 
      } 
      b b = method.<b>getAnnotation(b.class);
      if (b != null) {
        Class[] arrayOfClass = method.getParameterTypes();
        if (arrayOfClass.length == 2) {
          if (arrayOfClass[0] == int.class) {
            a(b, method, arrayOfClass[1], (Map<String, l>)stringBuilder);
          } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Second argument should be property index: ");
            stringBuilder.append(paramClass.getName());
            stringBuilder.append("#");
            stringBuilder.append(method.getName());
            throw new RuntimeException(stringBuilder.toString());
          } 
        } else {
          stringBuilder = new StringBuilder();
          stringBuilder.append("Wrong number of args for group prop setter: ");
          stringBuilder.append(paramClass.getName());
          stringBuilder.append("#");
          stringBuilder.append(method.getName());
          throw new RuntimeException(stringBuilder.toString());
        } 
      } 
    } 
  }
  
  static Map<String, l> b(Class<? extends ViewManager> paramClass) {
    if (paramClass == ViewManager.class)
      return b; 
    Map<String, l> map = a.get(paramClass);
    if (map != null)
      return map; 
    map = new HashMap<String, l>(b((Class)paramClass.getSuperclass()));
    b(paramClass, map);
    a.put(paramClass, map);
    return map;
  }
  
  private static void b(Class<? extends ViewManager> paramClass, Map<String, l> paramMap) {
    Method[] arrayOfMethod = paramClass.getDeclaredMethods();
    for (int i = 0; i < arrayOfMethod.length; i++) {
      StringBuilder stringBuilder;
      Method method = arrayOfMethod[i];
      a a = method.<a>getAnnotation(a.class);
      if (a != null) {
        Class[] arrayOfClass = method.getParameterTypes();
        if (arrayOfClass.length == 2) {
          if (View.class.isAssignableFrom(arrayOfClass[0])) {
            paramMap.put(a.name(), a(a, method, arrayOfClass[1]));
          } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append("First param should be a view subclass to be updated: ");
            stringBuilder.append(paramClass.getName());
            stringBuilder.append("#");
            stringBuilder.append(method.getName());
            throw new RuntimeException(stringBuilder.toString());
          } 
        } else {
          stringBuilder = new StringBuilder();
          stringBuilder.append("Wrong number of args for prop setter: ");
          stringBuilder.append(paramClass.getName());
          stringBuilder.append("#");
          stringBuilder.append(method.getName());
          throw new RuntimeException(stringBuilder.toString());
        } 
      } 
      b b = method.<b>getAnnotation(b.class);
      if (b != null) {
        Class[] arrayOfClass = method.getParameterTypes();
        if (arrayOfClass.length == 3) {
          if (View.class.isAssignableFrom(arrayOfClass[0])) {
            if (arrayOfClass[1] == int.class) {
              a(b, method, arrayOfClass[2], (Map<String, l>)stringBuilder);
            } else {
              stringBuilder = new StringBuilder();
              stringBuilder.append("Second argument should be property index: ");
              stringBuilder.append(paramClass.getName());
              stringBuilder.append("#");
              stringBuilder.append(method.getName());
              throw new RuntimeException(stringBuilder.toString());
            } 
          } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append("First param should be a view subclass to be updated: ");
            stringBuilder.append(paramClass.getName());
            stringBuilder.append("#");
            stringBuilder.append(method.getName());
            throw new RuntimeException(stringBuilder.toString());
          } 
        } else {
          stringBuilder = new StringBuilder();
          stringBuilder.append("Wrong number of args for group prop setter: ");
          stringBuilder.append(paramClass.getName());
          stringBuilder.append("#");
          stringBuilder.append(method.getName());
          throw new RuntimeException(stringBuilder.toString());
        } 
      } 
    } 
  }
  
  private static class b extends l {
    public b(a param1a, Method param1Method) {
      super(param1a, "Array", param1Method, (b1.a)null);
    }
    
    protected Object a(Object param1Object, Context param1Context) {
      return param1Object;
    }
  }
  
  private static class c extends l {
    private final boolean i;
    
    public c(a param1a, Method param1Method, boolean param1Boolean) {
      super(param1a, "boolean", param1Method, (b1.a)null);
      this.i = param1Boolean;
    }
    
    protected Object a(Object param1Object, Context param1Context) {
      boolean bool;
      if (param1Object == null) {
        bool = this.i;
      } else {
        bool = ((Boolean)param1Object).booleanValue();
      } 
      return bool ? Boolean.TRUE : Boolean.FALSE;
    }
  }
  
  private static class d extends l {
    public d(a param1a, Method param1Method) {
      super(param1a, "boolean", param1Method, (b1.a)null);
    }
    
    protected Object a(Object param1Object, Context param1Context) {
      return (param1Object != null) ? (((Boolean)param1Object).booleanValue() ? Boolean.TRUE : Boolean.FALSE) : null;
    }
  }
  
  private static class e extends l {
    public e(a param1a, Method param1Method) {
      super(param1a, "number", param1Method, (b1.a)null);
    }
    
    public e(b param1b, Method param1Method, int param1Int) {
      super(param1b, "number", param1Method, param1Int, null);
    }
    
    protected Object a(Object param1Object, Context param1Context) {
      return (param1Object != null) ? ((param1Object instanceof Double) ? Integer.valueOf(((Double)param1Object).intValue()) : (Integer)param1Object) : null;
    }
  }
  
  private static class f extends l {
    private final int i;
    
    public f(a param1a, Method param1Method) {
      this(param1a, param1Method, 0);
    }
    
    public f(a param1a, Method param1Method, int param1Int) {
      super(param1a, "mixed", param1Method, (b1.a)null);
      this.i = param1Int;
    }
    
    protected Object a(Object param1Object, Context param1Context) {
      return (param1Object == null) ? Integer.valueOf(this.i) : ColorPropConverter.getColor(param1Object, param1Context);
    }
  }
  
  private static class g extends l {
    private final double i;
    
    public g(a param1a, Method param1Method, double param1Double) {
      super(param1a, "number", param1Method, (b1.a)null);
      this.i = param1Double;
    }
    
    public g(b param1b, Method param1Method, int param1Int, double param1Double) {
      super(param1b, "number", param1Method, param1Int, null);
      this.i = param1Double;
    }
    
    protected Object a(Object param1Object, Context param1Context) {
      double d;
      if (param1Object == null) {
        d = this.i;
      } else {
        d = ((Double)param1Object).doubleValue();
      } 
      return Double.valueOf(d);
    }
  }
  
  private static class h extends l {
    public h(a param1a, Method param1Method) {
      super(param1a, "mixed", param1Method, (b1.a)null);
    }
    
    public h(b param1b, Method param1Method, int param1Int) {
      super(param1b, "mixed", param1Method, param1Int, null);
    }
    
    protected Object a(Object param1Object, Context param1Context) {
      return (param1Object instanceof Dynamic) ? param1Object : new DynamicFromObject(param1Object);
    }
  }
  
  private static class i extends l {
    private final float i;
    
    public i(a param1a, Method param1Method, float param1Float) {
      super(param1a, "number", param1Method, (b1.a)null);
      this.i = param1Float;
    }
    
    public i(b param1b, Method param1Method, int param1Int, float param1Float) {
      super(param1b, "number", param1Method, param1Int, null);
      this.i = param1Float;
    }
    
    protected Object a(Object param1Object, Context param1Context) {
      float f;
      if (param1Object == null) {
        f = this.i;
      } else {
        f = Float.valueOf(((Double)param1Object).floatValue()).floatValue();
      } 
      return Float.valueOf(f);
    }
  }
  
  private static class j extends l {
    private final int i;
    
    public j(a param1a, Method param1Method, int param1Int) {
      super(param1a, "number", param1Method, (b1.a)null);
      this.i = param1Int;
    }
    
    public j(b param1b, Method param1Method, int param1Int1, int param1Int2) {
      super(param1b, "number", param1Method, param1Int1, null);
      this.i = param1Int2;
    }
    
    protected Object a(Object param1Object, Context param1Context) {
      int i;
      if (param1Object == null) {
        i = this.i;
      } else {
        i = Integer.valueOf(((Double)param1Object).intValue()).intValue();
      } 
      return Integer.valueOf(i);
    }
  }
  
  private static class k extends l {
    public k(a param1a, Method param1Method) {
      super(param1a, "Map", param1Method, (b1.a)null);
    }
    
    protected Object a(Object param1Object, Context param1Context) {
      return param1Object;
    }
  }
  
  static abstract class l {
    private static final Object[] e = new Object[2];
    
    private static final Object[] f = new Object[3];
    
    private static final Object[] g = new Object[1];
    
    private static final Object[] h = new Object[2];
    
    protected final String a;
    
    protected final String b;
    
    protected final Method c;
    
    protected final Integer d;
    
    private l(a param1a, String param1String, Method param1Method) {
      this.a = param1a.name();
      if (!"__default_type__".equals(param1a.customType()))
        param1String = param1a.customType(); 
      this.b = param1String;
      this.c = param1Method;
      this.d = null;
    }
    
    private l(b param1b, String param1String, Method param1Method, int param1Int) {
      this.a = param1b.names()[param1Int];
      if (!"__default_type__".equals(param1b.customType()))
        param1String = param1b.customType(); 
      this.b = param1String;
      this.c = param1Method;
      this.d = Integer.valueOf(param1Int);
    }
    
    protected abstract Object a(Object param1Object, Context param1Context);
    
    public String a() {
      return this.a;
    }
    
    public void a(ViewManager param1ViewManager, View param1View, Object param1Object) {
      try {
        return;
      } finally {
        param1View = null;
        param1Object = new StringBuilder();
        param1Object.append("Error while updating prop ");
        param1Object.append(this.a);
        e.e.e.e.a.a(ViewManager.class, param1Object.toString(), (Throwable)param1View);
        param1Object = new StringBuilder();
        param1Object.append("Error while updating property '");
        param1Object.append(this.a);
        param1Object.append("' of a view managed by: ");
        param1Object.append(param1ViewManager.getName());
      } 
    }
    
    public void a(a0 param1a0, Object param1Object) {
      try {
        return;
      } finally {
        param1Object = null;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Error while updating prop ");
        stringBuilder.append(this.a);
        e.e.e.e.a.a(ViewManager.class, stringBuilder.toString(), (Throwable)param1Object);
        stringBuilder = new StringBuilder();
        stringBuilder.append("Error while updating property '");
        stringBuilder.append(this.a);
        stringBuilder.append("' in shadow node of type: ");
        stringBuilder.append(param1a0.m());
      } 
    }
    
    public String b() {
      return this.b;
    }
  }
  
  private static class m extends l {
    public m(a param1a, Method param1Method) {
      super(param1a, "String", param1Method, (b1.a)null);
    }
    
    protected Object a(Object param1Object, Context param1Context) {
      return param1Object;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/uimanager/b1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */