package com.facebook.react.uimanager;

import android.util.SparseBooleanArray;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMapKeySetIterator;

public class n {
  private final v0 a;
  
  private final h0 b;
  
  private final SparseBooleanArray c = new SparseBooleanArray();
  
  public n(v0 paramv0, h0 paramh0) {
    this.a = paramv0;
    this.b = paramh0;
  }
  
  private a a(a0<Object> parama0, int paramInt) {
    a0<a0<Object>> a01;
    while (parama0.i() != l.c) {
      byte b;
      a0<a0<Object>> a02 = (a0<a0<Object>>)parama0.getParent();
      if (a02 == null)
        return null; 
      if (parama0.i() == l.d) {
        b = 1;
      } else {
        b = 0;
      } 
      paramInt = paramInt + b + a02.d(parama0);
      a01 = a02;
    } 
    return new a(a01, paramInt);
  }
  
  private void a(a0<Object> parama0, int paramInt1, int paramInt2) {
    if (parama0.i() != l.e && parama0.A() != null) {
      int j = parama0.t();
      this.a.a(parama0.x().t(), j, paramInt1, paramInt2, parama0.b(), parama0.c());
      return;
    } 
    int i;
    for (i = 0; i < parama0.a(); i++) {
      a0 a01 = (a0)parama0.a(i);
      int j = a01.t();
      if (!this.c.get(j)) {
        this.c.put(j, true);
        a(a01, a01.q() + paramInt1, a01.g() + paramInt2);
      } 
    } 
  }
  
  private void a(a0 parama01, a0<Object> parama02, int paramInt) {
    boolean bool;
    if (parama02.i() != l.c) {
      bool = true;
    } else {
      bool = false;
    } 
    e.e.m.a.a.a(bool);
    int i = paramInt;
    for (paramInt = 0; paramInt < parama02.a(); paramInt++) {
      a0 a01 = (a0)parama02.a(paramInt);
      if (a01.A() == null) {
        bool = true;
      } else {
        bool = false;
      } 
      e.e.m.a.a.a(bool);
      int j = parama01.z();
      if (a01.i() == l.e) {
        d(parama01, a01, i);
      } else {
        b(parama01, a01, i);
      } 
      i += parama01.z() - j;
    } 
  }
  
  private void a(a0<Object> parama0, c0 paramc0) {
    a0<a0<Object>> a01 = (a0<a0<Object>>)parama0.getParent();
    boolean bool1 = false;
    if (a01 == null) {
      parama0.a(false);
      return;
    } 
    int i = a01.a(parama0);
    a01.b(i);
    a(parama0, false);
    parama0.a(false);
    this.a.a(parama0.h(), parama0.t(), parama0.m(), paramc0);
    a01.a(parama0, i);
    c(a01, parama0, i);
    for (i = 0; i < parama0.a(); i++)
      c(parama0, (a0)parama0.a(i), i); 
    boolean bool = e.e.o.b0.a.h;
    boolean bool2 = true;
    if (bool) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Transitioning LayoutOnlyView - tag: ");
      stringBuilder.append(parama0.t());
      stringBuilder.append(" - rootTag: ");
      stringBuilder.append(parama0.j());
      stringBuilder.append(" - hasProps: ");
      if (paramc0 != null) {
        bool = true;
      } else {
        bool = false;
      } 
      stringBuilder.append(bool);
      stringBuilder.append(" - tagsWithLayout.size: ");
      stringBuilder.append(this.c.size());
      e.e.e.e.a.c("NativeViewHierarchyOptimizer", stringBuilder.toString());
    } 
    if (this.c.size() == 0) {
      bool = bool2;
    } else {
      bool = false;
    } 
    e.e.m.a.a.a(bool);
    d(parama0);
    for (i = bool1; i < parama0.a(); i++)
      d((a0)parama0.a(i)); 
    this.c.clear();
  }
  
  private void a(a0<a0> parama0, boolean paramBoolean) {
    if (parama0.i() != l.c)
      for (int i = parama0.a() - 1; i >= 0; i--)
        a(parama0.a(i), paramBoolean);  
    a0<a0<a0>> a01 = (a0<a0<a0>>)parama0.A();
    if (a01 != null) {
      int i = a01.e(parama0);
      a01.d(i);
      v0 v01 = this.a;
      int j = a01.t();
      if (paramBoolean) {
        int[] arrayOfInt2 = new int[1];
        arrayOfInt2[0] = parama0.t();
        int[] arrayOfInt1 = arrayOfInt2;
      } else {
        parama0 = null;
      } 
      v01.a(j, new int[] { i }, (w0[])null, (int[])parama0);
    } 
  }
  
  private static boolean a(c0 paramc0) {
    if (paramc0 == null)
      return true; 
    if (paramc0.d("collapsable") && !paramc0.a("collapsable", true))
      return false; 
    ReadableMapKeySetIterator readableMapKeySetIterator = paramc0.a.keySetIterator();
    while (readableMapKeySetIterator.hasNextKey()) {
      if (!c1.a(paramc0.a, readableMapKeySetIterator.nextKey()))
        return false; 
    } 
    return true;
  }
  
  private void b(a0<a0> parama01, a0 parama02, int paramInt) {
    parama01.b(parama02, paramInt);
    this.a.a(parama01.t(), (int[])null, new w0[] { new w0(parama02.t(), paramInt) }(int[])null);
    if (parama02.i() != l.c)
      a(parama01, parama02, paramInt + 1); 
  }
  
  private void c(a0 parama01, a0 parama02, int paramInt) {
    int i = parama01.d(parama01.a(paramInt));
    a0 a01 = parama01;
    paramInt = i;
    if (parama01.i() != l.c) {
      a a = a(parama01, i);
      if (a == null)
        return; 
      a01 = a.a;
      paramInt = a.b;
    } 
    if (parama02.i() != l.e) {
      b(a01, parama02, paramInt);
      return;
    } 
    d(a01, parama02, paramInt);
  }
  
  private void d(a0<Object> parama0) {
    int i = parama0.t();
    if (this.c.get(i))
      return; 
    this.c.put(i, true);
    a0<a0> a01 = (a0<a0>)parama0.getParent();
    int j = parama0.q();
    for (i = parama0.g(); a01 != null && a01.i() != l.c; i = k) {
      int m = j;
      int k = i;
      if (!a01.y()) {
        m = j + Math.round(a01.u());
        k = i + Math.round(a01.p());
      } 
      a01 = a01.getParent();
      j = m;
    } 
    a(parama0, j, i);
  }
  
  private void d(a0 parama01, a0 parama02, int paramInt) {
    a(parama01, parama02, paramInt);
  }
  
  public static void e(a0 parama0) {
    parama0.v();
  }
  
  public void a() {
    this.c.clear();
  }
  
  public void a(a0 parama0) {
    if (parama0.B())
      a(parama0, (c0)null); 
  }
  
  public void a(a0 parama0, ReadableArray paramReadableArray) {
    for (int i = 0; i < paramReadableArray.size(); i++)
      c(parama0, this.b.a(paramReadableArray.getInt(i)), i); 
  }
  
  public void a(a0 parama0, k0 paramk0, c0 paramc0) {
    boolean bool;
    if (parama0.m().equals("RCTView") && a(paramc0)) {
      bool = true;
    } else {
      bool = false;
    } 
    parama0.a(bool);
    if (parama0.i() != l.e)
      this.a.a(paramk0, parama0.t(), parama0.m(), paramc0); 
  }
  
  public void a(a0 parama0, String paramString, c0 paramc0) {
    boolean bool;
    if (parama0.B() && !a(paramc0)) {
      bool = true;
    } else {
      bool = false;
    } 
    if (bool) {
      a(parama0, paramc0);
      return;
    } 
    if (!parama0.B())
      this.a.a(parama0.t(), paramString, paramc0); 
  }
  
  public void a(a0 parama0, int[] paramArrayOfint1, int[] paramArrayOfint2, w0[] paramArrayOfw0, int[] paramArrayOfint3) {
    int j;
    byte b = 0;
    int i = 0;
    while (true) {
      j = b;
      if (i < paramArrayOfint2.length) {
        boolean bool;
        int k = paramArrayOfint2[i];
        j = 0;
        while (true) {
          if (j < paramArrayOfint3.length) {
            if (paramArrayOfint3[j] == k) {
              boolean bool1 = true;
              break;
            } 
            j++;
            continue;
          } 
          bool = false;
          break;
        } 
        a(this.b.a(k), bool);
        i++;
        continue;
      } 
      break;
    } 
    while (j < paramArrayOfw0.length) {
      w0 w01 = paramArrayOfw0[j];
      c(parama0, this.b.a(w01.a), w01.b);
      j++;
    } 
  }
  
  public void b(a0 parama0) {
    d(parama0);
  }
  
  void c(a0 parama0) {
    this.c.clear();
  }
  
  private static class a {
    public final a0 a;
    
    public final int b;
    
    a(a0 param1a0, int param1Int) {
      this.a = param1a0;
      this.b = param1Int;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/uimanager/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */