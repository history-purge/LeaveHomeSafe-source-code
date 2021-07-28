package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.concurrent.CopyOnWriteArrayList;

class m {
  private final CopyOnWriteArrayList<a> a = new CopyOnWriteArrayList<a>();
  
  private final n b;
  
  m(n paramn) {
    this.b = paramn;
  }
  
  void a(Fragment paramFragment, Bundle paramBundle, boolean paramBoolean) {
    Fragment fragment = this.b.y();
    if (fragment != null)
      fragment.z().x().a(paramFragment, paramBundle, true); 
    for (a a : this.a) {
      if (!paramBoolean || a.b)
        a.a.a(this.b, paramFragment, paramBundle); 
    } 
  }
  
  void a(Fragment paramFragment, View paramView, Bundle paramBundle, boolean paramBoolean) {
    Fragment fragment = this.b.y();
    if (fragment != null)
      fragment.z().x().a(paramFragment, paramView, paramBundle, true); 
    for (a a : this.a) {
      if (!paramBoolean || a.b)
        a.a.a(this.b, paramFragment, paramView, paramBundle); 
    } 
  }
  
  void a(Fragment paramFragment, boolean paramBoolean) {
    Context context = this.b.v().f();
    Fragment fragment = this.b.y();
    if (fragment != null)
      fragment.z().x().a(paramFragment, true); 
    for (a a : this.a) {
      if (!paramBoolean || a.b)
        a.a.a(this.b, paramFragment, context); 
    } 
  }
  
  public void a(n.m paramm) {
    // Byte code:
    //   0: aload_0
    //   1: getfield a : Ljava/util/concurrent/CopyOnWriteArrayList;
    //   4: astore #4
    //   6: aload #4
    //   8: monitorenter
    //   9: iconst_0
    //   10: istore_2
    //   11: aload_0
    //   12: getfield a : Ljava/util/concurrent/CopyOnWriteArrayList;
    //   15: invokevirtual size : ()I
    //   18: istore_3
    //   19: iload_2
    //   20: iload_3
    //   21: if_icmpge -> 54
    //   24: aload_0
    //   25: getfield a : Ljava/util/concurrent/CopyOnWriteArrayList;
    //   28: iload_2
    //   29: invokevirtual get : (I)Ljava/lang/Object;
    //   32: checkcast androidx/fragment/app/m$a
    //   35: getfield a : Landroidx/fragment/app/n$m;
    //   38: aload_1
    //   39: if_acmpne -> 70
    //   42: aload_0
    //   43: getfield a : Ljava/util/concurrent/CopyOnWriteArrayList;
    //   46: iload_2
    //   47: invokevirtual remove : (I)Ljava/lang/Object;
    //   50: pop
    //   51: goto -> 54
    //   54: aload #4
    //   56: monitorexit
    //   57: return
    //   58: astore_1
    //   59: aload #4
    //   61: monitorexit
    //   62: goto -> 67
    //   65: aload_1
    //   66: athrow
    //   67: goto -> 65
    //   70: iload_2
    //   71: iconst_1
    //   72: iadd
    //   73: istore_2
    //   74: goto -> 19
    // Exception table:
    //   from	to	target	type
    //   11	19	58	finally
    //   24	51	58	finally
    //   54	57	58	finally
    //   59	62	58	finally
  }
  
  public void a(n.m paramm, boolean paramBoolean) {
    this.a.add(new a(paramm, paramBoolean));
  }
  
  void b(Fragment paramFragment, Bundle paramBundle, boolean paramBoolean) {
    Fragment fragment = this.b.y();
    if (fragment != null)
      fragment.z().x().b(paramFragment, paramBundle, true); 
    for (a a : this.a) {
      if (!paramBoolean || a.b)
        a.a.b(this.b, paramFragment, paramBundle); 
    } 
  }
  
  void b(Fragment paramFragment, boolean paramBoolean) {
    Fragment fragment = this.b.y();
    if (fragment != null)
      fragment.z().x().b(paramFragment, true); 
    for (a a : this.a) {
      if (!paramBoolean || a.b)
        a.a.a(this.b, paramFragment); 
    } 
  }
  
  void c(Fragment paramFragment, Bundle paramBundle, boolean paramBoolean) {
    Fragment fragment = this.b.y();
    if (fragment != null)
      fragment.z().x().c(paramFragment, paramBundle, true); 
    for (a a : this.a) {
      if (!paramBoolean || a.b)
        a.a.c(this.b, paramFragment, paramBundle); 
    } 
  }
  
  void c(Fragment paramFragment, boolean paramBoolean) {
    Fragment fragment = this.b.y();
    if (fragment != null)
      fragment.z().x().c(paramFragment, true); 
    for (a a : this.a) {
      if (!paramBoolean || a.b)
        a.a.b(this.b, paramFragment); 
    } 
  }
  
  void d(Fragment paramFragment, Bundle paramBundle, boolean paramBoolean) {
    Fragment fragment = this.b.y();
    if (fragment != null)
      fragment.z().x().d(paramFragment, paramBundle, true); 
    for (a a : this.a) {
      if (!paramBoolean || a.b)
        a.a.d(this.b, paramFragment, paramBundle); 
    } 
  }
  
  void d(Fragment paramFragment, boolean paramBoolean) {
    Fragment fragment = this.b.y();
    if (fragment != null)
      fragment.z().x().d(paramFragment, true); 
    for (a a : this.a) {
      if (!paramBoolean || a.b)
        a.a.c(this.b, paramFragment); 
    } 
  }
  
  void e(Fragment paramFragment, boolean paramBoolean) {
    Context context = this.b.v().f();
    Fragment fragment = this.b.y();
    if (fragment != null)
      fragment.z().x().e(paramFragment, true); 
    for (a a : this.a) {
      if (!paramBoolean || a.b)
        a.a.b(this.b, paramFragment, context); 
    } 
  }
  
  void f(Fragment paramFragment, boolean paramBoolean) {
    Fragment fragment = this.b.y();
    if (fragment != null)
      fragment.z().x().f(paramFragment, true); 
    for (a a : this.a) {
      if (!paramBoolean || a.b)
        a.a.d(this.b, paramFragment); 
    } 
  }
  
  void g(Fragment paramFragment, boolean paramBoolean) {
    Fragment fragment = this.b.y();
    if (fragment != null)
      fragment.z().x().g(paramFragment, true); 
    for (a a : this.a) {
      if (!paramBoolean || a.b)
        a.a.e(this.b, paramFragment); 
    } 
  }
  
  void h(Fragment paramFragment, boolean paramBoolean) {
    Fragment fragment = this.b.y();
    if (fragment != null)
      fragment.z().x().h(paramFragment, true); 
    for (a a : this.a) {
      if (!paramBoolean || a.b)
        a.a.f(this.b, paramFragment); 
    } 
  }
  
  void i(Fragment paramFragment, boolean paramBoolean) {
    Fragment fragment = this.b.y();
    if (fragment != null)
      fragment.z().x().i(paramFragment, true); 
    for (a a : this.a) {
      if (!paramBoolean || a.b)
        a.a.g(this.b, paramFragment); 
    } 
  }
  
  private static final class a {
    final n.m a;
    
    final boolean b;
    
    a(n.m param1m, boolean param1Boolean) {
      this.a = param1m;
      this.b = param1Boolean;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/fragment/app/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */