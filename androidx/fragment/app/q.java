package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.u;
import androidx.lifecycle.v;
import androidx.lifecycle.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

final class q extends u {
  private static final v.b j = new a();
  
  private final HashMap<String, Fragment> c = new HashMap<String, Fragment>();
  
  private final HashMap<String, q> d = new HashMap<String, q>();
  
  private final HashMap<String, w> e = new HashMap<String, w>();
  
  private final boolean f;
  
  private boolean g = false;
  
  private boolean h = false;
  
  private boolean i = false;
  
  q(boolean paramBoolean) {
    this.f = paramBoolean;
  }
  
  static q a(w paramw) {
    return (q)(new v(paramw, j)).a(q.class);
  }
  
  void a(Fragment paramFragment) {
    if (this.i) {
      if (n.d(2))
        Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved"); 
      return;
    } 
    if (this.c.containsKey(paramFragment.h))
      return; 
    this.c.put(paramFragment.h, paramFragment);
    if (n.d(2)) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Updating retained Fragments: Added ");
      stringBuilder.append(paramFragment);
      Log.v("FragmentManager", stringBuilder.toString());
    } 
  }
  
  void a(boolean paramBoolean) {
    this.i = paramBoolean;
  }
  
  Fragment b(String paramString) {
    return this.c.get(paramString);
  }
  
  protected void b() {
    if (n.d(3)) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("onCleared called for ");
      stringBuilder.append(this);
      Log.d("FragmentManager", stringBuilder.toString());
    } 
    this.g = true;
  }
  
  void b(Fragment paramFragment) {
    if (n.d(3)) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Clearing non-config state for ");
      stringBuilder.append(paramFragment);
      Log.d("FragmentManager", stringBuilder.toString());
    } 
    q q1 = this.d.get(paramFragment.h);
    if (q1 != null) {
      q1.b();
      this.d.remove(paramFragment.h);
    } 
    w w = this.e.get(paramFragment.h);
    if (w != null) {
      w.a();
      this.e.remove(paramFragment.h);
    } 
  }
  
  q c(Fragment paramFragment) {
    q q2 = this.d.get(paramFragment.h);
    q q1 = q2;
    if (q2 == null) {
      q1 = new q(this.f);
      this.d.put(paramFragment.h, q1);
    } 
    return q1;
  }
  
  Collection<Fragment> c() {
    return new ArrayList<Fragment>(this.c.values());
  }
  
  w d(Fragment paramFragment) {
    w w2 = this.e.get(paramFragment.h);
    w w1 = w2;
    if (w2 == null) {
      w1 = new w();
      this.e.put(paramFragment.h, w1);
    } 
    return w1;
  }
  
  boolean d() {
    return this.g;
  }
  
  void e(Fragment paramFragment) {
    boolean bool;
    if (this.i) {
      if (n.d(2))
        Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved"); 
      return;
    } 
    if (this.c.remove(paramFragment.h) != null) {
      bool = true;
    } else {
      bool = false;
    } 
    if (bool && n.d(2)) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Updating retained Fragments: Removed ");
      stringBuilder.append(paramFragment);
      Log.v("FragmentManager", stringBuilder.toString());
    } 
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject != null) {
      if (q.class != paramObject.getClass())
        return false; 
      paramObject = paramObject;
      return (this.c.equals(((q)paramObject).c) && this.d.equals(((q)paramObject).d) && this.e.equals(((q)paramObject).e));
    } 
    return false;
  }
  
  boolean f(Fragment paramFragment) {
    return !this.c.containsKey(paramFragment.h) ? true : (this.f ? this.g : (this.h ^ true));
  }
  
  public int hashCode() {
    return (this.c.hashCode() * 31 + this.d.hashCode()) * 31 + this.e.hashCode();
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder("FragmentManagerViewModel{");
    stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    stringBuilder.append("} Fragments (");
    Iterator<String> iterator = this.c.values().iterator();
    while (iterator.hasNext()) {
      stringBuilder.append(iterator.next());
      if (iterator.hasNext())
        stringBuilder.append(", "); 
    } 
    stringBuilder.append(") Child Non Config (");
    iterator = this.d.keySet().iterator();
    while (iterator.hasNext()) {
      stringBuilder.append(iterator.next());
      if (iterator.hasNext())
        stringBuilder.append(", "); 
    } 
    stringBuilder.append(") ViewModelStores (");
    iterator = this.e.keySet().iterator();
    while (iterator.hasNext()) {
      stringBuilder.append(iterator.next());
      if (iterator.hasNext())
        stringBuilder.append(", "); 
    } 
    stringBuilder.append(')');
    return stringBuilder.toString();
  }
  
  class a implements v.b {
    public <T extends u> T a(Class<T> param1Class) {
      return (T)new q(true);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/fragment/app/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */