package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

class w {
  private final ArrayList<Fragment> a = new ArrayList<Fragment>();
  
  private final HashMap<String, v> b = new HashMap<String, v>();
  
  private q c;
  
  void a() {
    this.b.values().removeAll(Collections.singleton(null));
  }
  
  void a(int paramInt) {
    for (v v : this.b.values()) {
      if (v != null)
        v.a(paramInt); 
    } 
  }
  
  void a(Fragment paramFragment) {
    if (!this.a.contains(paramFragment))
      synchronized (this.a) {
        this.a.add(paramFragment);
        paramFragment.n = true;
        return;
      }  
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Fragment already added: ");
    stringBuilder.append(paramFragment);
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  void a(q paramq) {
    this.c = paramq;
  }
  
  void a(v paramv) {
    Fragment fragment = paramv.k();
    if (a(fragment.h))
      return; 
    this.b.put(fragment.h, paramv);
    if (fragment.E) {
      if (fragment.D) {
        this.c.a(fragment);
      } else {
        this.c.e(fragment);
      } 
      fragment.E = false;
    } 
    if (n.d(2)) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Added fragment to active set ");
      stringBuilder.append(fragment);
      Log.v("FragmentManager", stringBuilder.toString());
    } 
  }
  
  void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramString);
    stringBuilder.append("    ");
    String str = stringBuilder.toString();
    if (!this.b.isEmpty()) {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("Active Fragments:");
      for (v v : this.b.values()) {
        paramPrintWriter.print(paramString);
        if (v != null) {
          Fragment fragment = v.k();
          paramPrintWriter.println(fragment);
          fragment.a(str, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
          continue;
        } 
        paramPrintWriter.println("null");
      } 
    } 
    int i = this.a.size();
    if (i > 0) {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Added Fragments:");
      int j;
      for (j = 0; j < i; j++) {
        Fragment fragment = this.a.get(j);
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("  #");
        paramPrintWriter.print(j);
        paramPrintWriter.print(": ");
        paramPrintWriter.println(fragment.toString());
      } 
    } 
  }
  
  void a(List<String> paramList) {
    this.a.clear();
    if (paramList != null) {
      Iterator<String> iterator = paramList.iterator();
      while (iterator.hasNext()) {
        String str = iterator.next();
        Fragment fragment = b(str);
        if (fragment != null) {
          if (n.d(2)) {
            StringBuilder stringBuilder1 = new StringBuilder();
            stringBuilder1.append("restoreSaveState: added (");
            stringBuilder1.append(str);
            stringBuilder1.append("): ");
            stringBuilder1.append(fragment);
            Log.v("FragmentManager", stringBuilder1.toString());
          } 
          a(fragment);
          continue;
        } 
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("No instantiated fragment for (");
        stringBuilder.append(str);
        stringBuilder.append(")");
        throw new IllegalStateException(stringBuilder.toString());
      } 
    } 
  }
  
  boolean a(String paramString) {
    return (this.b.get(paramString) != null);
  }
  
  int b(Fragment paramFragment) {
    int j;
    ViewGroup viewGroup = paramFragment.I;
    if (viewGroup == null)
      return -1; 
    int k = this.a.indexOf(paramFragment);
    int i = k - 1;
    while (true) {
      j = k;
      if (i >= 0) {
        paramFragment = this.a.get(i);
        if (paramFragment.I == viewGroup) {
          View view = paramFragment.J;
          if (view != null)
            return viewGroup.indexOfChild(view) + 1; 
        } 
        i--;
        continue;
      } 
      break;
    } 
    while (true) {
      if (++j < this.a.size()) {
        paramFragment = this.a.get(j);
        if (paramFragment.I == viewGroup) {
          View view = paramFragment.J;
          if (view != null)
            return viewGroup.indexOfChild(view); 
        } 
        continue;
      } 
      return -1;
    } 
  }
  
  Fragment b(int paramInt) {
    for (int i = this.a.size() - 1; i >= 0; i--) {
      Fragment fragment = this.a.get(i);
      if (fragment != null && fragment.y == paramInt)
        return fragment; 
    } 
    for (v v : this.b.values()) {
      if (v != null) {
        Fragment fragment = v.k();
        if (fragment.y == paramInt)
          return fragment; 
      } 
    } 
    return null;
  }
  
  Fragment b(String paramString) {
    v v = this.b.get(paramString);
    return (v != null) ? v.k() : null;
  }
  
  List<v> b() {
    ArrayList<v> arrayList = new ArrayList();
    for (v v : this.b.values()) {
      if (v != null)
        arrayList.add(v); 
    } 
    return arrayList;
  }
  
  void b(v paramv) {
    Fragment fragment = paramv.k();
    if (fragment.D)
      this.c.e(fragment); 
    if ((v)this.b.put(fragment.h, null) == null)
      return; 
    if (n.d(2)) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Removed fragment from active set ");
      stringBuilder.append(fragment);
      Log.v("FragmentManager", stringBuilder.toString());
    } 
  }
  
  Fragment c(String paramString) {
    if (paramString != null)
      for (int i = this.a.size() - 1; i >= 0; i--) {
        Fragment fragment = this.a.get(i);
        if (fragment != null && paramString.equals(fragment.A))
          return fragment; 
      }  
    if (paramString != null)
      for (v v : this.b.values()) {
        if (v != null) {
          Fragment fragment = v.k();
          if (paramString.equals(fragment.A))
            return fragment; 
        } 
      }  
    return null;
  }
  
  List<Fragment> c() {
    ArrayList<v> arrayList = new ArrayList();
    for (v v : this.b.values()) {
      if (v != null) {
        Fragment fragment = v.k();
      } else {
        v = null;
      } 
      arrayList.add(v);
    } 
    return (List)arrayList;
  }
  
  void c(Fragment paramFragment) {
    synchronized (this.a) {
      this.a.remove(paramFragment);
      paramFragment.n = false;
      return;
    } 
  }
  
  Fragment d(String paramString) {
    for (v v : this.b.values()) {
      if (v != null) {
        Fragment fragment = v.k().a(paramString);
        if (fragment != null)
          return fragment; 
      } 
    } 
    return null;
  }
  
  List<Fragment> d() {
    if (this.a.isEmpty())
      return Collections.emptyList(); 
    synchronized (this.a) {
      return new ArrayList<Fragment>(this.a);
    } 
  }
  
  q e() {
    return this.c;
  }
  
  v e(String paramString) {
    return this.b.get(paramString);
  }
  
  void f() {
    for (Fragment fragment : this.a) {
      v v = this.b.get(fragment.h);
      if (v != null)
        v.l(); 
    } 
    for (v v : this.b.values()) {
      if (v != null) {
        boolean bool;
        v.l();
        Fragment fragment = v.k();
        if (fragment.o && !fragment.R()) {
          bool = true;
        } else {
          bool = false;
        } 
        if (bool)
          b(v); 
      } 
    } 
  }
  
  void g() {
    this.b.clear();
  }
  
  ArrayList<u> h() {
    ArrayList<u> arrayList = new ArrayList(this.b.size());
    for (v v : this.b.values()) {
      if (v != null) {
        Fragment fragment = v.k();
        u u = v.o();
        arrayList.add(u);
        if (n.d(2)) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Saved state of ");
          stringBuilder.append(fragment);
          stringBuilder.append(": ");
          stringBuilder.append(u.o);
          Log.v("FragmentManager", stringBuilder.toString());
        } 
      } 
    } 
    return arrayList;
  }
  
  ArrayList<String> i() {
    synchronized (this.a) {
      if (this.a.isEmpty())
        return null; 
      ArrayList<String> arrayList = new ArrayList(this.a.size());
      for (Fragment fragment : this.a) {
        arrayList.add(fragment.h);
        if (n.d(2)) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("saveAllState: adding fragment (");
          stringBuilder.append(fragment.h);
          stringBuilder.append("): ");
          stringBuilder.append(fragment);
          Log.v("FragmentManager", stringBuilder.toString());
        } 
      } 
      return arrayList;
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/fragment/app/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */