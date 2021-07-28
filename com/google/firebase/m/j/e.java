package com.google.firebase.m.j;

import android.util.Base64;
import android.util.JsonWriter;
import com.google.firebase.m.c;
import com.google.firebase.m.d;
import com.google.firebase.m.f;
import com.google.firebase.m.g;
import com.google.firebase.m.h;
import java.io.Writer;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

final class e implements f, h {
  private e a = null;
  
  private boolean b = true;
  
  private final JsonWriter c;
  
  private final Map<Class<?>, com.google.firebase.m.e<?>> d;
  
  private final Map<Class<?>, g<?>> e;
  
  private final com.google.firebase.m.e<Object> f;
  
  private final boolean g;
  
  e(Writer paramWriter, Map<Class<?>, com.google.firebase.m.e<?>> paramMap, Map<Class<?>, g<?>> paramMap1, com.google.firebase.m.e<Object> parame, boolean paramBoolean) {
    this.c = new JsonWriter(paramWriter);
    this.d = paramMap;
    this.e = paramMap1;
    this.f = parame;
    this.g = paramBoolean;
  }
  
  private boolean a(Object paramObject) {
    return (paramObject == null || paramObject.getClass().isArray() || paramObject instanceof Collection || paramObject instanceof java.util.Date || paramObject instanceof Enum || paramObject instanceof Number);
  }
  
  private e b(String paramString, Object paramObject) {
    b();
    this.c.name(paramString);
    if (paramObject == null) {
      this.c.nullValue();
      return this;
    } 
    return a(paramObject, false);
  }
  
  private void b() {
    if (this.b) {
      e e1 = this.a;
      if (e1 != null) {
        e1.b();
        this.a.b = false;
        this.a = null;
        this.c.endObject();
      } 
      return;
    } 
    throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
  }
  
  private e c(String paramString, Object paramObject) {
    if (paramObject == null)
      return this; 
    b();
    this.c.name(paramString);
    return a(paramObject, false);
  }
  
  public f a(d paramd, int paramInt) {
    a(paramd.a(), paramInt);
    return this;
  }
  
  public f a(d paramd, long paramLong) {
    a(paramd.a(), paramLong);
    return this;
  }
  
  public f a(d paramd, Object paramObject) {
    return a(paramd.a(), paramObject);
  }
  
  public e a(int paramInt) {
    b();
    this.c.value(paramInt);
    return this;
  }
  
  public e a(long paramLong) {
    b();
    this.c.value(paramLong);
    return this;
  }
  
  e a(com.google.firebase.m.e<Object> parame, Object paramObject, boolean paramBoolean) {
    if (!paramBoolean)
      this.c.beginObject(); 
    parame.a(paramObject, this);
    if (!paramBoolean)
      this.c.endObject(); 
    return this;
  }
  
  e a(Object<?> paramObject, boolean paramBoolean) {
    Object[] arrayOfObject;
    Iterator iterator;
    Map map;
    int j = 0;
    int k = 0;
    boolean bool = false;
    int i = 0;
    if (paramBoolean && a(paramObject)) {
      if (paramObject == null) {
        paramObject = null;
      } else {
        paramObject = (Object<?>)paramObject.getClass();
      } 
      throw new c(String.format("%s cannot be encoded inline", new Object[] { paramObject }));
    } 
    if (paramObject == null) {
      this.c.nullValue();
      return this;
    } 
    if (paramObject instanceof Number) {
      this.c.value((Number)paramObject);
      return this;
    } 
    if (paramObject.getClass().isArray()) {
      int[] arrayOfInt;
      if (paramObject instanceof byte[]) {
        a((byte[])paramObject);
        return this;
      } 
      this.c.beginArray();
      if (paramObject instanceof int[]) {
        arrayOfInt = (int[])paramObject;
        j = arrayOfInt.length;
        while (i < j) {
          k = arrayOfInt[i];
          this.c.value(k);
          i++;
        } 
      } else {
        long[] arrayOfLong;
        if (arrayOfInt instanceof long[]) {
          arrayOfLong = (long[])arrayOfInt;
          k = arrayOfLong.length;
          for (i = j; i < k; i++)
            a(arrayOfLong[i]); 
        } else {
          double[] arrayOfDouble;
          if (arrayOfLong instanceof double[]) {
            arrayOfDouble = (double[])arrayOfLong;
            j = arrayOfDouble.length;
            for (i = k; i < j; i++) {
              double d = arrayOfDouble[i];
              this.c.value(d);
            } 
          } else {
            boolean[] arrayOfBoolean;
            if (arrayOfDouble instanceof boolean[]) {
              arrayOfBoolean = (boolean[])arrayOfDouble;
              j = arrayOfBoolean.length;
              for (i = bool; i < j; i++) {
                paramBoolean = arrayOfBoolean[i];
                this.c.value(paramBoolean);
              } 
            } else {
              Number[] arrayOfNumber;
              if (arrayOfBoolean instanceof Number[]) {
                arrayOfNumber = (Number[])arrayOfBoolean;
                j = arrayOfNumber.length;
                for (i = 0; i < j; i++)
                  a(arrayOfNumber[i], false); 
              } else {
                arrayOfObject = (Object[])arrayOfNumber;
                j = arrayOfObject.length;
                for (i = 0; i < j; i++)
                  a(arrayOfObject[i], false); 
              } 
            } 
          } 
        } 
      } 
      this.c.endArray();
      return this;
    } 
    if (arrayOfObject instanceof Collection) {
      Collection collection = (Collection)arrayOfObject;
      this.c.beginArray();
      iterator = collection.iterator();
      while (iterator.hasNext())
        a(iterator.next(), false); 
      this.c.endArray();
      return this;
    } 
    if (iterator instanceof Map) {
      map = (Map)iterator;
      this.c.beginObject();
      Iterator<Map.Entry> iterator1 = map.entrySet().iterator();
      while (iterator1.hasNext()) {
        Map.Entry entry = iterator1.next();
        map = (Map)entry.getKey();
        try {
          a((String)map, entry.getValue());
        } catch (ClassCastException classCastException) {
          throw new c(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", new Object[] { map, map.getClass() }), classCastException);
        } 
      } 
      this.c.endObject();
      return this;
    } 
    com.google.firebase.m.e<Object> e1 = (com.google.firebase.m.e)this.d.get(map.getClass());
    if (e1 != null) {
      a(e1, map, paramBoolean);
      return this;
    } 
    g g = this.e.get(map.getClass());
    if (g != null) {
      g.a(map, this);
      return this;
    } 
    if (map instanceof Enum) {
      a(((Enum)map).name());
      return this;
    } 
    a(this.f, map, paramBoolean);
    return this;
  }
  
  public e a(String paramString) {
    b();
    this.c.value(paramString);
    return this;
  }
  
  public e a(String paramString, int paramInt) {
    b();
    this.c.name(paramString);
    a(paramInt);
    return this;
  }
  
  public e a(String paramString, long paramLong) {
    b();
    this.c.name(paramString);
    a(paramLong);
    return this;
  }
  
  public e a(String paramString, Object paramObject) {
    return this.g ? c(paramString, paramObject) : b(paramString, paramObject);
  }
  
  public e a(boolean paramBoolean) {
    b();
    this.c.value(paramBoolean);
    return this;
  }
  
  public e a(byte[] paramArrayOfbyte) {
    b();
    if (paramArrayOfbyte == null) {
      this.c.nullValue();
      return this;
    } 
    this.c.value(Base64.encodeToString(paramArrayOfbyte, 2));
    return this;
  }
  
  void a() {
    b();
    this.c.flush();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/firebase/m/j/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */