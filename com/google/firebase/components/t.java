package com.google.firebase.components;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

class t {
  private static Set<b> a(Set<b> paramSet) {
    HashSet<b> hashSet = new HashSet();
    for (b b : paramSet) {
      if (b.d())
        hashSet.add(b); 
    } 
    return hashSet;
  }
  
  static void a(List<n<?>> paramList) {
    Set<b> set1 = b(paramList);
    Set<b> set2 = a(set1);
    int i = 0;
    label26: while (!set2.isEmpty()) {
      b b = set2.iterator().next();
      set2.remove(b);
      int j = i + 1;
      Iterator<b> iterator = b.b().iterator();
      while (true) {
        i = j;
        if (iterator.hasNext()) {
          b b1 = iterator.next();
          b1.c(b);
          if (b1.d())
            set2.add(b1); 
          continue;
        } 
        continue label26;
      } 
    } 
    if (i == paramList.size())
      return; 
    paramList = new ArrayList<n<?>>();
    for (b b : set1) {
      if (!b.d() && !b.c())
        paramList.add(b.a()); 
    } 
    v v = new v(paramList);
    throw v;
  }
  
  private static Set<b> b(List<n<?>> paramList) {
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>(paramList.size());
    for (n<?> n : paramList) {
      b b = new b(n);
      for (Class<?> clazz : n.c()) {
        c c = new c(clazz, n.g() ^ true, null);
        if (!hashMap.containsKey(c))
          hashMap.put(c, new HashSet()); 
        Set<b> set = (Set)hashMap.get(c);
        if (set.isEmpty() || c.a(c)) {
          set.add(b);
          continue;
        } 
        throw new IllegalArgumentException(String.format("Multiple components provide %s.", new Object[] { clazz }));
      } 
    } 
    Iterator<Set> iterator1 = hashMap.values().iterator();
    while (iterator1.hasNext()) {
      for (b b : iterator1.next()) {
        for (u u : b.a().a()) {
          if (!u.c())
            continue; 
          Set set = (Set)hashMap.get(new c(u.a(), u.e(), null));
          if (set == null)
            continue; 
          for (b b1 : set) {
            b.a(b1);
            b1.b(b);
          } 
        } 
      } 
    } 
    HashSet<b> hashSet = new HashSet();
    Iterator<Set> iterator2 = hashMap.values().iterator();
    while (iterator2.hasNext())
      hashSet.addAll(iterator2.next()); 
    return hashSet;
  }
  
  private static class b {
    private final n<?> a;
    
    private final Set<b> b = new HashSet<b>();
    
    private final Set<b> c = new HashSet<b>();
    
    b(n<?> param1n) {
      this.a = param1n;
    }
    
    n<?> a() {
      return this.a;
    }
    
    void a(b param1b) {
      this.b.add(param1b);
    }
    
    Set<b> b() {
      return this.b;
    }
    
    void b(b param1b) {
      this.c.add(param1b);
    }
    
    void c(b param1b) {
      this.c.remove(param1b);
    }
    
    boolean c() {
      return this.b.isEmpty();
    }
    
    boolean d() {
      return this.c.isEmpty();
    }
  }
  
  private static class c {
    private final Class<?> a;
    
    private final boolean b;
    
    private c(Class<?> param1Class, boolean param1Boolean) {
      this.a = param1Class;
      this.b = param1Boolean;
    }
    
    public boolean equals(Object param1Object) {
      boolean bool = param1Object instanceof c;
      boolean bool2 = false;
      boolean bool1 = bool2;
      if (bool) {
        param1Object = param1Object;
        bool1 = bool2;
        if (((c)param1Object).a.equals(this.a)) {
          bool1 = bool2;
          if (((c)param1Object).b == this.b)
            bool1 = true; 
        } 
      } 
      return bool1;
    }
    
    public int hashCode() {
      return (this.a.hashCode() ^ 0xF4243) * 1000003 ^ Boolean.valueOf(this.b).hashCode();
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/firebase/components/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */