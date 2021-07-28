package e.f.a.e.i.n;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

final class c4 extends a4 {
  private static final Class<?> c = Collections.unmodifiableList(Collections.emptyList()).getClass();
  
  private c4() {
    super(null);
  }
  
  private static <L> List<L> a(Object paramObject, long paramLong, int paramInt) {
    List<?> list = b(paramObject, paramLong);
    if (list.isEmpty()) {
      ArrayList<L> arrayList;
      if (list instanceof b4) {
        y3 y3 = new y3(paramInt);
      } else if (list instanceof c5 && list instanceof r3) {
        r3 r3 = ((r3)list).f(paramInt);
      } else {
        arrayList = new ArrayList(paramInt);
      } 
      h6.a(paramObject, paramLong, arrayList);
      return arrayList;
    } 
    if (c.isAssignableFrom(list.getClass())) {
      ArrayList<?> arrayList = new ArrayList(list.size() + paramInt);
      arrayList.addAll(list);
      h6.a(paramObject, paramLong, arrayList);
      return (List)arrayList;
    } 
    if (list instanceof f6) {
      y3 y3 = new y3(list.size() + paramInt);
      y3.addAll((f6)list);
      h6.a(paramObject, paramLong, y3);
      return y3;
    } 
    if (list instanceof c5 && list instanceof r3) {
      r3<L> r3 = (r3)list;
      if (!r3.zza()) {
        r3 = r3.f(list.size() + paramInt);
        h6.a(paramObject, paramLong, r3);
        return r3;
      } 
    } 
    return (List)list;
  }
  
  private static <E> List<E> b(Object paramObject, long paramLong) {
    return (List<E>)h6.f(paramObject, paramLong);
  }
  
  final void a(Object paramObject, long paramLong) {
    List<?> list = (List)h6.f(paramObject, paramLong);
    if (list instanceof b4) {
      list = ((b4)list).e();
    } else {
      if (c.isAssignableFrom(list.getClass()))
        return; 
      if (list instanceof c5 && list instanceof r3) {
        paramObject = list;
        if (paramObject.zza())
          paramObject.zzb(); 
        return;
      } 
      list = Collections.unmodifiableList(list);
    } 
    h6.a(paramObject, paramLong, list);
  }
  
  final <E> void a(Object paramObject1, Object<?> paramObject2, long paramLong) {
    paramObject2 = b(paramObject2, paramLong);
    List<?> list = a(paramObject1, paramLong, paramObject2.size());
    int i = list.size();
    int j = paramObject2.size();
    if (i > 0 && j > 0)
      list.addAll((Collection<?>)paramObject2); 
    if (i > 0)
      paramObject2 = (Object<?>)list; 
    h6.a(paramObject1, paramLong, paramObject2);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/n/c4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */