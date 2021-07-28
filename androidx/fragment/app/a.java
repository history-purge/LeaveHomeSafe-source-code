package androidx.fragment.app;

import android.util.Log;
import java.io.PrintWriter;
import java.util.ArrayList;

final class a extends x implements n.k, n.p {
  final n r;
  
  boolean s;
  
  int t;
  
  a(n paramn) {
    super(j, classLoader);
    ClassLoader classLoader;
    this.t = -1;
    this.r = paramn;
  }
  
  private static boolean b(x.a parama) {
    Fragment fragment = parama.b;
    return (fragment != null && fragment.n && fragment.J != null && !fragment.C && !fragment.B && fragment.T());
  }
  
  public int a() {
    return b(false);
  }
  
  Fragment a(ArrayList<Fragment> paramArrayList, Fragment paramFragment) {
    int i = 0;
    Fragment fragment;
    for (fragment = paramFragment; i < this.a.size(); fragment = paramFragment) {
      Fragment fragment1;
      x.a a1 = this.a.get(i);
      int j = a1.a;
      if (j != 1)
        if (j != 2) {
          if (j != 3 && j != 6) {
            if (j != 7) {
              if (j != 8) {
                j = i;
                paramFragment = fragment;
              } else {
                this.a.add(i, new x.a(9, fragment));
                j = i + 1;
                paramFragment = a1.b;
              } 
              continue;
            } 
          } else {
            paramArrayList.remove(a1.b);
            fragment1 = a1.b;
            j = i;
            paramFragment = fragment;
            if (fragment1 == fragment) {
              this.a.add(i, new x.a(9, fragment1));
              j = i + 1;
              paramFragment = null;
            } 
            continue;
          } 
        } else {
          Fragment fragment2 = ((x.a)fragment1).b;
          int i1 = fragment2.z;
          j = paramArrayList.size() - 1;
          paramFragment = fragment;
          int m = 0;
          while (j >= 0) {
            Fragment fragment3 = paramArrayList.get(j);
            int i2 = m;
            int i3 = i;
            fragment = paramFragment;
            if (fragment3.z == i1)
              if (fragment3 == fragment2) {
                i2 = 1;
                i3 = i;
                fragment = paramFragment;
              } else {
                i2 = i;
                fragment = paramFragment;
                if (fragment3 == paramFragment) {
                  this.a.add(i, new x.a(9, fragment3));
                  i2 = i + 1;
                  fragment = null;
                } 
                x.a a2 = new x.a(3, fragment3);
                a2.c = ((x.a)fragment1).c;
                a2.e = ((x.a)fragment1).e;
                a2.d = ((x.a)fragment1).d;
                a2.f = ((x.a)fragment1).f;
                this.a.add(i2, a2);
                paramArrayList.remove(fragment3);
                i3 = i2 + 1;
                i2 = m;
              }  
            j--;
            m = i2;
            i = i3;
            paramFragment = fragment;
          } 
          if (m != 0) {
            this.a.remove(i);
            i--;
          } else {
            ((x.a)fragment1).a = 1;
            paramArrayList.add(fragment2);
          } 
          j = i;
          continue;
        }  
      paramArrayList.add(((x.a)fragment1).b);
      paramFragment = fragment;
      j = i;
      continue;
      i = SYNTHETIC_LOCAL_VARIABLE_4 + 1;
    } 
    return fragment;
  }
  
  public x a(Fragment paramFragment) {
    n n1 = paramFragment.u;
    if (n1 == null || n1 == this.r) {
      super.a(paramFragment);
      return this;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Cannot remove Fragment attached to a different FragmentManager. Fragment ");
    stringBuilder.append(paramFragment.toString());
    stringBuilder.append(" is already attached to a FragmentManager.");
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  void a(int paramInt1, Fragment paramFragment, String paramString, int paramInt2) {
    super.a(paramInt1, paramFragment, paramString, paramInt2);
    paramFragment.u = this.r;
  }
  
  void a(Fragment.h paramh) {
    for (int i = 0; i < this.a.size(); i++) {
      x.a a1 = this.a.get(i);
      if (b(a1))
        a1.b.a(paramh); 
    } 
  }
  
  public void a(String paramString, PrintWriter paramPrintWriter) {
    a(paramString, paramPrintWriter, true);
  }
  
  public void a(String paramString, PrintWriter paramPrintWriter, boolean paramBoolean) {
    if (paramBoolean) {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mName=");
      paramPrintWriter.print(this.i);
      paramPrintWriter.print(" mIndex=");
      paramPrintWriter.print(this.t);
      paramPrintWriter.print(" mCommitted=");
      paramPrintWriter.println(this.s);
      if (this.f != 0) {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mTransition=#");
        paramPrintWriter.print(Integer.toHexString(this.f));
      } 
      if (this.b != 0 || this.c != 0) {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mEnterAnim=#");
        paramPrintWriter.print(Integer.toHexString(this.b));
        paramPrintWriter.print(" mExitAnim=#");
        paramPrintWriter.println(Integer.toHexString(this.c));
      } 
      if (this.d != 0 || this.e != 0) {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mPopEnterAnim=#");
        paramPrintWriter.print(Integer.toHexString(this.d));
        paramPrintWriter.print(" mPopExitAnim=#");
        paramPrintWriter.println(Integer.toHexString(this.e));
      } 
      if (this.j != 0 || this.k != null) {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mBreadCrumbTitleRes=#");
        paramPrintWriter.print(Integer.toHexString(this.j));
        paramPrintWriter.print(" mBreadCrumbTitleText=");
        paramPrintWriter.println(this.k);
      } 
      if (this.l != 0 || this.m != null) {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mBreadCrumbShortTitleRes=#");
        paramPrintWriter.print(Integer.toHexString(this.l));
        paramPrintWriter.print(" mBreadCrumbShortTitleText=");
        paramPrintWriter.println(this.m);
      } 
    } 
    if (!this.a.isEmpty()) {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Operations:");
      int j = this.a.size();
      int i;
      for (i = 0; i < j; i++) {
        StringBuilder stringBuilder;
        String str;
        x.a a1 = this.a.get(i);
        switch (a1.a) {
          default:
            stringBuilder = new StringBuilder();
            stringBuilder.append("cmd=");
            stringBuilder.append(a1.a);
            str = stringBuilder.toString();
            break;
          case 10:
            str = "OP_SET_MAX_LIFECYCLE";
            break;
          case 9:
            str = "UNSET_PRIMARY_NAV";
            break;
          case 8:
            str = "SET_PRIMARY_NAV";
            break;
          case 7:
            str = "ATTACH";
            break;
          case 6:
            str = "DETACH";
            break;
          case 5:
            str = "SHOW";
            break;
          case 4:
            str = "HIDE";
            break;
          case 3:
            str = "REMOVE";
            break;
          case 2:
            str = "REPLACE";
            break;
          case 1:
            str = "ADD";
            break;
          case 0:
            str = "NULL";
            break;
        } 
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("  Op #");
        paramPrintWriter.print(i);
        paramPrintWriter.print(": ");
        paramPrintWriter.print(str);
        paramPrintWriter.print(" ");
        paramPrintWriter.println(a1.b);
        if (paramBoolean) {
          if (a1.c != 0 || a1.d != 0) {
            paramPrintWriter.print(paramString);
            paramPrintWriter.print("enterAnim=#");
            paramPrintWriter.print(Integer.toHexString(a1.c));
            paramPrintWriter.print(" exitAnim=#");
            paramPrintWriter.println(Integer.toHexString(a1.d));
          } 
          if (a1.e != 0 || a1.f != 0) {
            paramPrintWriter.print(paramString);
            paramPrintWriter.print("popEnterAnim=#");
            paramPrintWriter.print(Integer.toHexString(a1.e));
            paramPrintWriter.print(" popExitAnim=#");
            paramPrintWriter.println(Integer.toHexString(a1.f));
          } 
        } 
      } 
    } 
  }
  
  boolean a(ArrayList<a> paramArrayList, int paramInt1, int paramInt2) {
    if (paramInt2 == paramInt1)
      return false; 
    int m = this.a.size();
    int i = 0;
    int j;
    for (j = -1; i < m; j = i2) {
      int i1;
      Fragment fragment = ((x.a)this.a.get(i)).b;
      if (fragment != null) {
        i1 = fragment.z;
      } else {
        i1 = 0;
      } 
      int i2 = j;
      if (i1) {
        i2 = j;
        if (i1 != j) {
          for (j = paramInt1; j < paramInt2; j++) {
            a a1 = paramArrayList.get(j);
            int i3 = a1.a.size();
            for (i2 = 0; i2 < i3; i2++) {
              int i4;
              Fragment fragment1 = ((x.a)a1.a.get(i2)).b;
              if (fragment1 != null) {
                i4 = fragment1.z;
              } else {
                i4 = 0;
              } 
              if (i4 == i1)
                return true; 
            } 
          } 
          i2 = i1;
        } 
      } 
      i++;
    } 
    return false;
  }
  
  public boolean a(ArrayList<a> paramArrayList, ArrayList<Boolean> paramArrayList1) {
    if (n.d(2)) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Run: ");
      stringBuilder.append(this);
      Log.v("FragmentManager", stringBuilder.toString());
    } 
    paramArrayList.add(this);
    paramArrayList1.add(Boolean.valueOf(false));
    if (this.g)
      this.r.a(this); 
    return true;
  }
  
  public int b() {
    return b(true);
  }
  
  int b(boolean paramBoolean) {
    if (!this.s) {
      byte b;
      if (n.d(2)) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Commit: ");
        stringBuilder.append(this);
        Log.v("FragmentManager", stringBuilder.toString());
        PrintWriter printWriter = new PrintWriter(new c0("FragmentManager"));
        a("  ", printWriter);
        printWriter.close();
      } 
      this.s = true;
      if (this.g) {
        b = this.r.a();
      } else {
        b = -1;
      } 
      this.t = b;
      this.r.a(this, paramBoolean);
      return this.t;
    } 
    throw new IllegalStateException("commit already called");
  }
  
  Fragment b(ArrayList<Fragment> paramArrayList, Fragment paramFragment) {
    int i = this.a.size() - 1;
    while (i >= 0) {
      x.a a1 = this.a.get(i);
      int j = a1.a;
      if (j != 1)
        if (j != 3) {
          switch (j) {
            case 10:
              a1.h = a1.g;
              break;
            case 9:
              paramFragment = a1.b;
              break;
            case 8:
              paramFragment = null;
              break;
            case 6:
              paramArrayList.add(a1.b);
              break;
            case 7:
              paramArrayList.remove(a1.b);
              break;
          } 
          i--;
        }  
    } 
    return paramFragment;
  }
  
  public x b(Fragment paramFragment) {
    if (paramFragment != null) {
      n n1 = paramFragment.u;
      if (n1 != null && n1 != this.r) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment ");
        stringBuilder.append(paramFragment.toString());
        stringBuilder.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(stringBuilder.toString());
      } 
    } 
    super.b(paramFragment);
    return this;
  }
  
  void b(int paramInt) {
    if (!this.g)
      return; 
    if (n.d(2)) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Bump nesting in ");
      stringBuilder.append(this);
      stringBuilder.append(" by ");
      stringBuilder.append(paramInt);
      Log.v("FragmentManager", stringBuilder.toString());
    } 
    int j = this.a.size();
    for (int i = 0; i < j; i++) {
      x.a a1 = this.a.get(i);
      Fragment fragment = a1.b;
      if (fragment != null) {
        fragment.t += paramInt;
        if (n.d(2)) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Bump nesting of ");
          stringBuilder.append(a1.b);
          stringBuilder.append(" to ");
          stringBuilder.append(a1.b.t);
          Log.v("FragmentManager", stringBuilder.toString());
        } 
      } 
    } 
  }
  
  public x c(Fragment paramFragment) {
    n n1 = paramFragment.u;
    if (n1 == null || n1 == this.r) {
      super.c(paramFragment);
      return this;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Cannot show Fragment attached to a different FragmentManager. Fragment ");
    stringBuilder.append(paramFragment.toString());
    stringBuilder.append(" is already attached to a FragmentManager.");
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  public void c() {
    e();
    this.r.b(this, false);
  }
  
  void c(boolean paramBoolean) {
    for (int i = this.a.size() - 1; i >= 0; i--) {
      StringBuilder stringBuilder;
      x.a a1 = this.a.get(i);
      Fragment fragment = a1.b;
      if (fragment != null) {
        fragment.i(true);
        fragment.a(a1.c, a1.d, a1.e, a1.f);
        fragment.b(n.e(this.f));
        fragment.a(this.o, this.n);
      } 
      switch (a1.a) {
        default:
          stringBuilder = new StringBuilder();
          stringBuilder.append("Unknown cmd: ");
          stringBuilder.append(a1.a);
          throw new IllegalArgumentException(stringBuilder.toString());
        case 10:
          this.r.a((Fragment)stringBuilder, a1.g);
          break;
        case 9:
          this.r.n((Fragment)stringBuilder);
          break;
        case 8:
          this.r.n(null);
          break;
        case 7:
          this.r.a((Fragment)stringBuilder, true);
          this.r.d((Fragment)stringBuilder);
          break;
        case 6:
          this.r.b((Fragment)stringBuilder);
          break;
        case 5:
          this.r.a((Fragment)stringBuilder, true);
          this.r.g((Fragment)stringBuilder);
          break;
        case 4:
          this.r.o((Fragment)stringBuilder);
          break;
        case 3:
          this.r.a((Fragment)stringBuilder);
          break;
        case 1:
          this.r.a((Fragment)stringBuilder, true);
          this.r.m((Fragment)stringBuilder);
          break;
      } 
      if (!this.p && a1.a != 3 && stringBuilder != null && !n.P)
        this.r.k((Fragment)stringBuilder); 
    } 
    if (!this.p && paramBoolean && !n.P) {
      n n1 = this.r;
      n1.a(n1.q, true);
    } 
  }
  
  boolean c(int paramInt) {
    int j = this.a.size();
    for (int i = 0; i < j; i++) {
      int m;
      Fragment fragment = ((x.a)this.a.get(i)).b;
      if (fragment != null) {
        m = fragment.z;
      } else {
        m = 0;
      } 
      if (m && m == paramInt)
        return true; 
    } 
    return false;
  }
  
  public void d() {
    e();
    this.r.b(this, true);
  }
  
  void f() {
    int j = this.a.size();
    for (int i = 0; i < j; i++) {
      StringBuilder stringBuilder;
      x.a a1 = this.a.get(i);
      Fragment fragment = a1.b;
      if (fragment != null) {
        fragment.i(false);
        fragment.a(a1.c, a1.d, a1.e, a1.f);
        fragment.b(this.f);
        fragment.a(this.n, this.o);
      } 
      switch (a1.a) {
        default:
          stringBuilder = new StringBuilder();
          stringBuilder.append("Unknown cmd: ");
          stringBuilder.append(a1.a);
          throw new IllegalArgumentException(stringBuilder.toString());
        case 10:
          this.r.a((Fragment)stringBuilder, a1.h);
          break;
        case 9:
          this.r.n(null);
          break;
        case 8:
          this.r.n((Fragment)stringBuilder);
          break;
        case 7:
          this.r.a((Fragment)stringBuilder, false);
          this.r.b((Fragment)stringBuilder);
          break;
        case 6:
          this.r.d((Fragment)stringBuilder);
          break;
        case 5:
          this.r.a((Fragment)stringBuilder, false);
          this.r.o((Fragment)stringBuilder);
          break;
        case 4:
          this.r.g((Fragment)stringBuilder);
          break;
        case 3:
          this.r.m((Fragment)stringBuilder);
          break;
        case 1:
          this.r.a((Fragment)stringBuilder, false);
          this.r.a((Fragment)stringBuilder);
          break;
      } 
      if (!this.p && a1.a != 1 && stringBuilder != null && !n.P)
        this.r.k((Fragment)stringBuilder); 
    } 
    if (!this.p && !n.P) {
      n n1 = this.r;
      n1.a(n1.q, true);
    } 
  }
  
  public String g() {
    return this.i;
  }
  
  boolean h() {
    for (int i = 0; i < this.a.size(); i++) {
      if (b(this.a.get(i)))
        return true; 
    } 
    return false;
  }
  
  public void i() {
    if (this.q != null) {
      for (int i = 0; i < this.q.size(); i++)
        ((Runnable)this.q.get(i)).run(); 
      this.q = null;
    } 
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder(128);
    stringBuilder.append("BackStackEntry{");
    stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    if (this.t >= 0) {
      stringBuilder.append(" #");
      stringBuilder.append(this.t);
    } 
    if (this.i != null) {
      stringBuilder.append(" ");
      stringBuilder.append(this.i);
    } 
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/fragment/app/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */