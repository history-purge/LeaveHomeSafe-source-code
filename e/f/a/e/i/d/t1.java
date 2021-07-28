package e.f.a.e.i.d;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class t1 extends t<String> implements u1, RandomAccess {
  private static final t1 e;
  
  private final List<Object> d;
  
  static {
    t1 t11 = new t1();
    e = t11;
    t11.x();
  }
  
  public t1() {
    this(10);
  }
  
  public t1(int paramInt) {
    this(new ArrayList(paramInt));
  }
  
  private t1(ArrayList<Object> paramArrayList) {
    this.d = paramArrayList;
  }
  
  private static String a(Object paramObject) {
    return (paramObject instanceof String) ? (String)paramObject : ((paramObject instanceof a0) ? ((a0)paramObject).c() : h1.c((byte[])paramObject));
  }
  
  public final boolean addAll(int paramInt, Collection<? extends String> paramCollection) {
    a();
    Collection<? extends String> collection = paramCollection;
    if (paramCollection instanceof u1)
      collection = (Collection)((u1)paramCollection).y(); 
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
  
  public final Object i(int paramInt) {
    return this.d.get(paramInt);
  }
  
  public final int size() {
    return this.d.size();
  }
  
  public final List<?> y() {
    return Collections.unmodifiableList(this.d);
  }
  
  public final u1 z() {
    return (u1)(w() ? new x3(this) : this);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/d/t1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */