package androidx.fragment.app;

import android.view.ViewGroup;
import androidx.lifecycle.g;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

public abstract class x {
  ArrayList<a> a = new ArrayList<a>();
  
  int b;
  
  int c;
  
  int d;
  
  int e;
  
  int f;
  
  boolean g;
  
  boolean h = true;
  
  String i;
  
  int j;
  
  CharSequence k;
  
  int l;
  
  CharSequence m;
  
  ArrayList<String> n;
  
  ArrayList<String> o;
  
  boolean p = false;
  
  ArrayList<Runnable> q;
  
  x(j paramj, ClassLoader paramClassLoader) {}
  
  public abstract int a();
  
  public x a(int paramInt) {
    this.f = paramInt;
    return this;
  }
  
  public x a(int paramInt, Fragment paramFragment) {
    a(paramInt, paramFragment, null, 1);
    return this;
  }
  
  public x a(int paramInt, Fragment paramFragment, String paramString) {
    a(paramInt, paramFragment, paramString, 1);
    return this;
  }
  
  x a(ViewGroup paramViewGroup, Fragment paramFragment, String paramString) {
    paramFragment.I = paramViewGroup;
    a(paramViewGroup.getId(), paramFragment, paramString);
    return this;
  }
  
  public x a(Fragment paramFragment) {
    a(new a(3, paramFragment));
    return this;
  }
  
  public x a(Fragment paramFragment, String paramString) {
    a(0, paramFragment, paramString, 1);
    return this;
  }
  
  public x a(Runnable paramRunnable) {
    e();
    if (this.q == null)
      this.q = new ArrayList<Runnable>(); 
    this.q.add(paramRunnable);
    return this;
  }
  
  public x a(String paramString) {
    if (this.h) {
      this.g = true;
      this.i = paramString;
      return this;
    } 
    throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
  }
  
  public x a(boolean paramBoolean) {
    this.p = paramBoolean;
    return this;
  }
  
  void a(int paramInt1, Fragment paramFragment, String paramString, int paramInt2) {
    StringBuilder stringBuilder2;
    Class<?> clazz = paramFragment.getClass();
    int i = clazz.getModifiers();
    if (!clazz.isAnonymousClass() && Modifier.isPublic(i) && (!clazz.isMemberClass() || Modifier.isStatic(i))) {
      if (paramString != null) {
        String str = paramFragment.A;
        if (str == null || paramString.equals(str)) {
          paramFragment.A = paramString;
        } else {
          stringBuilder2 = new StringBuilder();
          stringBuilder2.append("Can't change tag of fragment ");
          stringBuilder2.append(paramFragment);
          stringBuilder2.append(": was ");
          stringBuilder2.append(paramFragment.A);
          stringBuilder2.append(" now ");
          stringBuilder2.append(paramString);
          throw new IllegalStateException(stringBuilder2.toString());
        } 
      } 
      if (paramInt1 != 0) {
        StringBuilder stringBuilder;
        if (paramInt1 != -1) {
          i = paramFragment.y;
          if (i == 0 || i == paramInt1) {
            paramFragment.y = paramInt1;
            paramFragment.z = paramInt1;
          } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Can't change container ID of fragment ");
            stringBuilder.append(paramFragment);
            stringBuilder.append(": was ");
            stringBuilder.append(paramFragment.y);
            stringBuilder.append(" now ");
            stringBuilder.append(paramInt1);
            throw new IllegalStateException(stringBuilder.toString());
          } 
        } else {
          stringBuilder2 = new StringBuilder();
          stringBuilder2.append("Can't add fragment ");
          stringBuilder2.append(paramFragment);
          stringBuilder2.append(" with tag ");
          stringBuilder2.append((String)stringBuilder);
          stringBuilder2.append(" to container view with no id");
          throw new IllegalArgumentException(stringBuilder2.toString());
        } 
      } 
      a(new a(paramInt2, paramFragment));
      return;
    } 
    StringBuilder stringBuilder1 = new StringBuilder();
    stringBuilder1.append("Fragment ");
    stringBuilder1.append(stringBuilder2.getCanonicalName());
    stringBuilder1.append(" must be a public static class to be  properly recreated from instance state.");
    throw new IllegalStateException(stringBuilder1.toString());
  }
  
  void a(a parama) {
    this.a.add(parama);
    parama.c = this.b;
    parama.d = this.c;
    parama.e = this.d;
    parama.f = this.e;
  }
  
  public abstract int b();
  
  public x b(int paramInt, Fragment paramFragment) {
    b(paramInt, paramFragment, null);
    return this;
  }
  
  public x b(int paramInt, Fragment paramFragment, String paramString) {
    if (paramInt != 0) {
      a(paramInt, paramFragment, paramString, 2);
      return this;
    } 
    throw new IllegalArgumentException("Must use non-zero containerViewId");
  }
  
  public x b(Fragment paramFragment) {
    a(new a(8, paramFragment));
    return this;
  }
  
  public x c(Fragment paramFragment) {
    a(new a(5, paramFragment));
    return this;
  }
  
  public abstract void c();
  
  public abstract void d();
  
  public x e() {
    if (!this.g) {
      this.h = false;
      return this;
    } 
    throw new IllegalStateException("This transaction is already being added to the back stack");
  }
  
  static final class a {
    int a;
    
    Fragment b;
    
    int c;
    
    int d;
    
    int e;
    
    int f;
    
    g.c g;
    
    g.c h;
    
    a() {}
    
    a(int param1Int, Fragment param1Fragment) {
      this.a = param1Int;
      this.b = param1Fragment;
      g.c c1 = g.c.g;
      this.g = c1;
      this.h = c1;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/fragment/app/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */