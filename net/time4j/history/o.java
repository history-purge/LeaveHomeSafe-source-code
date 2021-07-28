package net.time4j.history;

import java.io.DataInput;
import java.io.DataOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public final class o {
  static final o d = new o(n.c, 2147483647);
  
  private static final Comparator<o> e = new b(null);
  
  private final List<o> a;
  
  private final n b;
  
  private final int c;
  
  o(List<o> paramList) {
    Collections.sort(paramList, e);
    Iterator<o> iterator = paramList.iterator();
    StringBuilder stringBuilder = null;
    while (iterator.hasNext()) {
      o o2 = iterator.next();
      if (stringBuilder != null && o2.c == ((o)stringBuilder).c) {
        if (o2.b == ((o)stringBuilder).b) {
          iterator.remove();
          continue;
        } 
        stringBuilder = new StringBuilder();
        stringBuilder.append("Multiple strategies with overlapping validity range: ");
        stringBuilder.append(paramList);
        throw new IllegalArgumentException(stringBuilder.toString());
      } 
      o o1 = o2;
    } 
    this.a = Collections.unmodifiableList(paramList);
    this.b = n.c;
    this.c = Integer.MAX_VALUE;
  }
  
  o(n paramn, int paramInt) {
    this.a = Collections.emptyList();
    this.b = paramn;
    this.c = paramInt;
  }
  
  static o a(DataInput paramDataInput) {
    int j = paramDataInput.readInt();
    if (j == 0) {
      n n1 = n.valueOf(paramDataInput.readUTF());
      int k = paramDataInput.readInt();
      return (k == Integer.MAX_VALUE && n1 == n.c) ? d : new o(n1, k);
    } 
    ArrayList<o> arrayList = new ArrayList(j);
    for (int i = 0; i < j; i++)
      arrayList.add(new o(n.valueOf(paramDataInput.readUTF()), paramDataInput.readInt())); 
    return new o(arrayList);
  }
  
  int a(h paramh) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual b : ()Lnet/time4j/history/j;
    //   4: aload_1
    //   5: invokevirtual c : ()I
    //   8: invokevirtual f : (I)I
    //   11: istore #4
    //   13: aload_0
    //   14: getfield a : Ljava/util/List;
    //   17: invokeinterface size : ()I
    //   22: istore #5
    //   24: ldc -2147483648
    //   26: istore_3
    //   27: iconst_0
    //   28: istore_2
    //   29: iload_2
    //   30: iload #5
    //   32: if_icmpge -> 94
    //   35: aload_0
    //   36: getfield a : Ljava/util/List;
    //   39: iload_2
    //   40: invokeinterface get : (I)Ljava/lang/Object;
    //   45: checkcast net/time4j/history/o
    //   48: astore #6
    //   50: iload #4
    //   52: iload_3
    //   53: if_icmplt -> 81
    //   56: iload #4
    //   58: aload #6
    //   60: getfield c : I
    //   63: if_icmpge -> 81
    //   66: aload #6
    //   68: getfield b : Lnet/time4j/history/n;
    //   71: astore #6
    //   73: aload #6
    //   75: aload_0
    //   76: aload_1
    //   77: invokevirtual a : (Lnet/time4j/history/o;Lnet/time4j/history/h;)I
    //   80: ireturn
    //   81: aload #6
    //   83: getfield c : I
    //   86: istore_3
    //   87: iload_2
    //   88: iconst_1
    //   89: iadd
    //   90: istore_2
    //   91: goto -> 29
    //   94: aload_0
    //   95: getfield b : Lnet/time4j/history/n;
    //   98: astore #6
    //   100: goto -> 73
  }
  
  h a(j paramj, int paramInt) {
    return b(paramj, paramInt).a(paramj, paramInt);
  }
  
  public o a(o paramo) {
    ArrayList<o> arrayList = new ArrayList();
    arrayList.addAll(this.a);
    if (arrayList.isEmpty())
      arrayList.add(this); 
    if (paramo.a.isEmpty()) {
      arrayList.add(paramo);
    } else {
      arrayList.addAll(paramo.a);
    } 
    return new o(arrayList);
  }
  
  void a(DataOutput paramDataOutput) {
    int j = this.a.size();
    paramDataOutput.writeInt(j);
    if (j == 0) {
      paramDataOutput.writeUTF(this.b.name());
      paramDataOutput.writeInt(this.c);
      return;
    } 
    for (int i = 0; i < j; i++) {
      o o1 = this.a.get(i);
      paramDataOutput.writeUTF(o1.b.name());
      paramDataOutput.writeInt(o1.c);
    } 
  }
  
  n b(j paramj, int paramInt) {
    n n1;
    int k = paramj.f(paramInt);
    int m = this.a.size();
    int i = Integer.MIN_VALUE;
    o o1 = null;
    for (paramInt = 0; paramInt < m; paramInt++) {
      o1 = this.a.get(paramInt);
      if (k >= i && k < o1.c)
        return o1.b; 
      i = o1.c;
      n1 = o1.b;
    } 
    return (k == i && paramj == j.f && n1 == n.e) ? n1 : this.b;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof o) {
      paramObject = paramObject;
      return (this.a.equals(((o)paramObject).a) && this.b == ((o)paramObject).b && this.c == ((o)paramObject).c);
    } 
    return false;
  }
  
  public int hashCode() {
    return this.a.hashCode() * 17 + this.b.hashCode() * 37 + this.c;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    if (this.a.isEmpty()) {
      stringBuilder.append('[');
      stringBuilder.append(this.b);
      if (this.c != Integer.MAX_VALUE) {
        stringBuilder.append("->");
        stringBuilder.append(this.c);
      } 
    } else {
      boolean bool = true;
      for (o o1 : this.a) {
        if (bool) {
          stringBuilder.append('[');
          bool = false;
        } else {
          stringBuilder.append(',');
        } 
        stringBuilder.append(o1.b);
        stringBuilder.append("->");
        stringBuilder.append(o1.c);
      } 
    } 
    stringBuilder.append(']');
    return stringBuilder.toString();
  }
  
  private static class b implements Comparator<o> {
    private b() {}
    
    public int a(o param1o1, o param1o2) {
      return (o.b(param1o1) < o.b(param1o2)) ? -1 : ((o.b(param1o1) > o.b(param1o2)) ? 1 : 0);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/history/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */