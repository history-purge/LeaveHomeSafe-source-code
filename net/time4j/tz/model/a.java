package net.time4j.tz.model;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import net.time4j.a0;
import net.time4j.c1.f;
import net.time4j.c1.g;
import net.time4j.g1.f;
import net.time4j.tz.p;
import net.time4j.tz.q;

final class a extends l {
  private static final long serialVersionUID = -5264909488983076587L;
  
  private final transient q[] c;
  
  private final transient boolean d;
  
  private transient int e = 0;
  
  a(List<q> paramList, boolean paramBoolean1, boolean paramBoolean2) {
    if (!paramList.isEmpty()) {
      q[] arrayOfQ = paramList.<q>toArray(new q[paramList.size()]);
      int j = arrayOfQ.length;
      int i = 0;
      boolean bool = false;
      while (i < j) {
        q q1 = arrayOfQ[i];
        if (bool || q1.a() < 0) {
          bool = true;
        } else {
          bool = false;
        } 
        i++;
      } 
      this.d = bool;
      if (paramBoolean1)
        Arrays.sort((Object[])arrayOfQ); 
      if (paramBoolean2)
        a(arrayOfQ, paramList); 
      this.c = arrayOfQ;
      long l1 = l.a(1);
      a(this.c, 0L, l1);
      return;
    } 
    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Missing timezone transitions.");
    throw illegalArgumentException;
  }
  
  private static int a(long paramLong, q[] paramArrayOfq) {
    int j = paramArrayOfq.length - 1;
    int i = 0;
    while (i <= j) {
      int k = (i + j) / 2;
      if (paramArrayOfq[k].b() <= paramLong) {
        i = k + 1;
        continue;
      } 
      j = k - 1;
    } 
    return i;
  }
  
  private static List<q> a(q[] paramArrayOfq, long paramLong1, long paramLong2) {
    if (paramLong1 <= paramLong2) {
      int j = a(paramLong1, paramArrayOfq);
      int k = a(paramLong2, paramArrayOfq);
      if (k == 0)
        return Collections.emptyList(); 
      int i = j;
      if (j > 0) {
        i = j;
        if (paramArrayOfq[j - 1].b() == paramLong1)
          i = j - 1; 
      } 
      j = --k;
      if (paramArrayOfq[k].b() == paramLong2)
        j = k - 1; 
      if (i > j)
        return Collections.emptyList(); 
      ArrayList<q> arrayList = new ArrayList(j - i + 1);
      while (i <= j) {
        arrayList.add(paramArrayOfq[i]);
        i++;
      } 
      return Collections.unmodifiableList(arrayList);
    } 
    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Start after end.");
    throw illegalArgumentException;
  }
  
  private static void a(q[] paramArrayOfq, List<q> paramList) {
    int j = paramArrayOfq[0].r();
    int i = 1;
    while (i < paramArrayOfq.length) {
      if (j == paramArrayOfq[i].c()) {
        j = paramArrayOfq[i].r();
        i++;
        continue;
      } 
      a0 a0 = a0.a(paramArrayOfq[i].b(), f.c);
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Model inconsistency detected at: ");
      stringBuilder.append(a0);
      stringBuilder.append(" (");
      stringBuilder.append(paramArrayOfq[i].b());
      stringBuilder.append(") ");
      stringBuilder.append(" in transitions: ");
      stringBuilder.append(paramList);
      throw new IllegalArgumentException(stringBuilder.toString());
    } 
  }
  
  private static int b(long paramLong, q[] paramArrayOfq) {
    int j = paramArrayOfq.length - 1;
    int i = 0;
    while (i <= j) {
      int k = (i + j) / 2;
      q q1 = paramArrayOfq[k];
      int m = Math.max(q1.r(), q1.c());
      if (q1.b() + m <= paramLong) {
        i = k + 1;
        continue;
      } 
      j = k - 1;
    } 
    return i;
  }
  
  private void readObject(ObjectInputStream paramObjectInputStream) {
    throw new InvalidObjectException("Serialization proxy required.");
  }
  
  private Object writeReplace() {
    return new SPX(this, 126);
  }
  
  public List<p> a(net.time4j.c1.a parama, g paramg) {
    return b(parama, paramg, null);
  }
  
  q a(net.time4j.c1.a parama, g paramg, j paramj) {
    long l1 = l.c(parama, paramg);
    int i = b(l1, this.c);
    q[] arrayOfQ = this.c;
    if (i == arrayOfQ.length)
      return (paramj == null) ? null : paramj.a(parama, l1); 
    q q1 = arrayOfQ[i];
    if (q1.s()) {
      if (q1.b() + q1.c() <= l1)
        return q1; 
    } else if (q1.t() && q1.b() + q1.r() <= l1) {
      return q1;
    } 
    return null;
  }
  
  public q a(f paramf) {
    int i = a(paramf.b(), this.c);
    return (i == 0) ? null : this.c[i - 1];
  }
  
  void a(int paramInt, ObjectOutput paramObjectOutput) {
    SPX.a(this.c, paramInt, paramObjectOutput);
  }
  
  void a(ObjectOutput paramObjectOutput) {
    a(this.c.length, paramObjectOutput);
  }
  
  public boolean a() {
    return this.d;
  }
  
  boolean a(a parama, int paramInt1, int paramInt2) {
    int i = Math.min(paramInt1, this.c.length);
    if (i != Math.min(paramInt2, parama.c.length))
      return false; 
    for (paramInt1 = 0; paramInt1 < i; paramInt1++) {
      if (!this.c[paramInt1].equals(parama.c[paramInt1]))
        return false; 
    } 
    return true;
  }
  
  List<p> b(net.time4j.c1.a parama, g paramg, j paramj) {
    long l1 = l.c(parama, paramg);
    int i = b(l1, this.c);
    q[] arrayOfQ = this.c;
    if (i == arrayOfQ.length)
      return (paramj == null) ? l.b(arrayOfQ[arrayOfQ.length - 1].r()) : paramj.b(parama, l1); 
    q q1 = arrayOfQ[i];
    if (q1.s()) {
      if (q1.b() + q1.c() <= l1)
        return Collections.emptyList(); 
    } else if (q1.t() && q1.b() + q1.r() <= l1) {
      return l.a(q1.r(), q1.c());
    } 
    return l.b(q1.c());
  }
  
  public p b() {
    return p.f(this.c[0].c());
  }
  
  public q b(net.time4j.c1.a parama, g paramg) {
    return a(parama, paramg, (j)null);
  }
  
  int c(int paramInt) {
    paramInt = Math.min(paramInt, this.c.length);
    q[] arrayOfQ = new q[paramInt];
    System.arraycopy(this.c, 0, arrayOfQ, 0, paramInt);
    return Arrays.hashCode((Object[])arrayOfQ);
  }
  
  q c() {
    q[] arrayOfQ = this.c;
    return arrayOfQ[arrayOfQ.length - 1];
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof a) {
      paramObject = paramObject;
      return Arrays.equals((Object[])this.c, (Object[])((a)paramObject).c);
    } 
    return false;
  }
  
  public int hashCode() {
    int j = this.e;
    int i = j;
    if (j == 0) {
      i = Arrays.hashCode((Object[])this.c);
      this.e = i;
    } 
    return i;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder(32);
    stringBuilder.append(a.class.getName());
    stringBuilder.append("[transition-count=");
    stringBuilder.append(this.c.length);
    stringBuilder.append(",hash=");
    stringBuilder.append(hashCode());
    stringBuilder.append(']');
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/tz/model/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */