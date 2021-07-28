package e.f.a.e.i.n;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class y3 extends s1<String> implements b4, RandomAccess {
  private static final y3 e;
  
  private final List<Object> d;
  
  static {
    y3 y31 = new y3();
    e = y31;
    y31.zzb();
  }
  
  public y3() {
    this(10);
  }
  
  public y3(int paramInt) {
    this(new ArrayList(paramInt));
  }
  
  private y3(ArrayList<Object> paramArrayList) {
    this.d = paramArrayList;
  }
  
  private static String a(Object paramObject) {
    return (paramObject instanceof String) ? (String)paramObject : ((paramObject instanceof z1) ? ((z1)paramObject).zzb() : l3.b((byte[])paramObject));
  }
  
  public final void a(z1 paramz1) {
    a();
    this.d.add(paramz1);
    this.modCount++;
  }
  
  public final boolean addAll(int paramInt, Collection<? extends String> paramCollection) {
    a();
    Collection<? extends String> collection = paramCollection;
    if (paramCollection instanceof b4)
      collection = (Collection)((b4)paramCollection).f(); 
    boolean bool = this.d.addAll(paramInt, collection);
    this.modCount++;
    return bool;
  }
  
  public final boolean addAll(Collection<? extends String> paramCollection) {
    return addAll(size(), paramCollection);
  }
  
  public final void clear() {
    a();
    this.d.clear();
    this.modCount++;
  }
  
  public final b4 e() {
    return (b4)(zza() ? new f6(this) : this);
  }
  
  public final List<?> f() {
    return Collections.unmodifiableList(this.d);
  }
  
  public final Object g(int paramInt) {
    return this.d.get(paramInt);
  }
  
  public final int size() {
    return this.d.size();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/n/y3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */