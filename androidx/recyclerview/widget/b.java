package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

class b {
  final b a;
  
  final a b;
  
  final List<View> c;
  
  b(b paramb) {
    this.a = paramb;
    this.b = new a();
    this.c = new ArrayList<View>();
  }
  
  private int f(int paramInt) {
    if (paramInt < 0)
      return -1; 
    int j = this.a.a();
    for (int i = paramInt; i < j; i += k) {
      int k = paramInt - i - this.b.b(i);
      if (k == 0) {
        while (this.b.c(i))
          i++; 
        return i;
      } 
    } 
    return -1;
  }
  
  private void g(View paramView) {
    this.c.add(paramView);
    this.a.a(paramView);
  }
  
  private boolean h(View paramView) {
    if (this.c.remove(paramView)) {
      this.a.c(paramView);
      return true;
    } 
    return false;
  }
  
  int a() {
    return this.a.a() - this.c.size();
  }
  
  void a(int paramInt) {
    paramInt = f(paramInt);
    this.b.d(paramInt);
    this.a.b(paramInt);
  }
  
  void a(View paramView) {
    int i = this.a.d(paramView);
    if (i >= 0) {
      this.b.e(i);
      g(paramView);
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("view is not a child, cannot hide ");
    stringBuilder.append(paramView);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  void a(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams, boolean paramBoolean) {
    if (paramInt < 0) {
      paramInt = this.a.a();
    } else {
      paramInt = f(paramInt);
    } 
    this.b.a(paramInt, paramBoolean);
    if (paramBoolean)
      g(paramView); 
    this.a.a(paramView, paramInt, paramLayoutParams);
  }
  
  void a(View paramView, int paramInt, boolean paramBoolean) {
    if (paramInt < 0) {
      paramInt = this.a.a();
    } else {
      paramInt = f(paramInt);
    } 
    this.b.a(paramInt, paramBoolean);
    if (paramBoolean)
      g(paramView); 
    this.a.a(paramView, paramInt);
  }
  
  void a(View paramView, boolean paramBoolean) {
    a(paramView, -1, paramBoolean);
  }
  
  int b() {
    return this.a.a();
  }
  
  int b(View paramView) {
    int i = this.a.d(paramView);
    return (i == -1) ? -1 : (this.b.c(i) ? -1 : (i - this.b.b(i)));
  }
  
  View b(int paramInt) {
    int j = this.c.size();
    for (int i = 0; i < j; i++) {
      View view = this.c.get(i);
      RecyclerView.d0 d0 = this.a.b(view);
      if (d0.i() == paramInt && !d0.o() && !d0.q())
        return view; 
    } 
    return null;
  }
  
  View c(int paramInt) {
    paramInt = f(paramInt);
    return this.a.a(paramInt);
  }
  
  void c() {
    this.b.a();
    for (int i = this.c.size() - 1; i >= 0; i--) {
      this.a.c(this.c.get(i));
      this.c.remove(i);
    } 
    this.a.b();
  }
  
  boolean c(View paramView) {
    return this.c.contains(paramView);
  }
  
  View d(int paramInt) {
    return this.a.a(paramInt);
  }
  
  void d(View paramView) {
    int i = this.a.d(paramView);
    if (i < 0)
      return; 
    if (this.b.d(i))
      h(paramView); 
    this.a.c(i);
  }
  
  void e(int paramInt) {
    paramInt = f(paramInt);
    View view = this.a.a(paramInt);
    if (view == null)
      return; 
    if (this.b.d(paramInt))
      h(view); 
    this.a.c(paramInt);
  }
  
  boolean e(View paramView) {
    int i = this.a.d(paramView);
    if (i == -1) {
      h(paramView);
      return true;
    } 
    if (this.b.c(i)) {
      this.b.d(i);
      h(paramView);
      this.a.c(i);
      return true;
    } 
    return false;
  }
  
  void f(View paramView) {
    int i = this.a.d(paramView);
    if (i >= 0) {
      if (this.b.c(i)) {
        this.b.a(i);
        h(paramView);
        return;
      } 
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("trying to unhide a view that was not hidden");
      stringBuilder1.append(paramView);
      throw new RuntimeException(stringBuilder1.toString());
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("view is not a child, cannot hide ");
    stringBuilder.append(paramView);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(this.b.toString());
    stringBuilder.append(", hidden list:");
    stringBuilder.append(this.c.size());
    return stringBuilder.toString();
  }
  
  static class a {
    long a = 0L;
    
    a b;
    
    private void b() {
      if (this.b == null)
        this.b = new a(); 
    }
    
    void a() {
      this.a = 0L;
      a a1 = this.b;
      if (a1 != null)
        a1.a(); 
    }
    
    void a(int param1Int) {
      if (param1Int >= 64) {
        a a1 = this.b;
        if (a1 != null) {
          a1.a(param1Int - 64);
          return;
        } 
      } else {
        this.a &= 1L << param1Int ^ 0xFFFFFFFFFFFFFFFFL;
      } 
    }
    
    void a(int param1Int, boolean param1Boolean) {
      boolean bool;
      if (param1Int >= 64) {
        b();
        this.b.a(param1Int - 64, param1Boolean);
        return;
      } 
      if ((this.a & Long.MIN_VALUE) != 0L) {
        bool = true;
      } else {
        bool = false;
      } 
      long l1 = (1L << param1Int) - 1L;
      long l2 = this.a;
      this.a = (l2 & (l1 ^ 0xFFFFFFFFFFFFFFFFL)) << 1L | l2 & l1;
      if (param1Boolean) {
        e(param1Int);
      } else {
        a(param1Int);
      } 
      if (bool || this.b != null) {
        b();
        this.b.a(0, bool);
      } 
    }
    
    int b(int param1Int) {
      a a1 = this.b;
      return (a1 == null) ? ((param1Int >= 64) ? Long.bitCount(this.a) : Long.bitCount(this.a & (1L << param1Int) - 1L)) : ((param1Int < 64) ? Long.bitCount(this.a & (1L << param1Int) - 1L) : (a1.b(param1Int - 64) + Long.bitCount(this.a)));
    }
    
    boolean c(int param1Int) {
      if (param1Int >= 64) {
        b();
        return this.b.c(param1Int - 64);
      } 
      return ((this.a & 1L << param1Int) != 0L);
    }
    
    boolean d(int param1Int) {
      boolean bool;
      if (param1Int >= 64) {
        b();
        return this.b.d(param1Int - 64);
      } 
      long l1 = 1L << param1Int;
      if ((this.a & l1) != 0L) {
        bool = true;
      } else {
        bool = false;
      } 
      this.a &= l1 ^ 0xFFFFFFFFFFFFFFFFL;
      l1--;
      long l2 = this.a;
      this.a = Long.rotateRight(l2 & (l1 ^ 0xFFFFFFFFFFFFFFFFL), 1) | l2 & l1;
      a a1 = this.b;
      if (a1 != null) {
        if (a1.c(0))
          e(63); 
        this.b.d(0);
      } 
      return bool;
    }
    
    void e(int param1Int) {
      if (param1Int >= 64) {
        b();
        this.b.e(param1Int - 64);
        return;
      } 
      this.a |= 1L << param1Int;
    }
    
    public String toString() {
      if (this.b == null)
        return Long.toBinaryString(this.a); 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(this.b.toString());
      stringBuilder.append("xx");
      stringBuilder.append(Long.toBinaryString(this.a));
      return stringBuilder.toString();
    }
  }
  
  static interface b {
    int a();
    
    View a(int param1Int);
    
    void a(View param1View);
    
    void a(View param1View, int param1Int);
    
    void a(View param1View, int param1Int, ViewGroup.LayoutParams param1LayoutParams);
    
    RecyclerView.d0 b(View param1View);
    
    void b();
    
    void b(int param1Int);
    
    void c(int param1Int);
    
    void c(View param1View);
    
    int d(View param1View);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/recyclerview/widget/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */