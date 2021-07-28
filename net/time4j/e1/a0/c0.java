package net.time4j.e1.a0;

import java.util.List;
import java.util.Set;
import net.time4j.d1.d;
import net.time4j.d1.o;
import net.time4j.d1.p;
import net.time4j.tz.k;
import net.time4j.tz.l;
import net.time4j.tz.p;

enum c0 implements h<k> {
  c;
  
  public int a(o paramo, Appendable paramAppendable, d paramd, Set<g> paramSet, boolean paramBoolean) {
    String str;
    if (paramo.d()) {
      byte b;
      if (paramAppendable instanceof CharSequence) {
        b = ((CharSequence)paramAppendable).length();
      } else {
        b = -1;
      } 
      str = paramo.c().a();
      paramAppendable.append(str);
      int i = str.length();
      if (b != -1 && i > 0 && paramSet != null)
        paramSet.add(new g(b0.c, b, b + i)); 
      return i;
    } 
    paramAppendable = new StringBuilder();
    paramAppendable.append("Cannot extract timezone id from: ");
    paramAppendable.append(str);
    throw new IllegalArgumentException(paramAppendable.toString());
  }
  
  public h<k> a(p<k> paramp) {
    return c;
  }
  
  public h<k> a(c<?> paramc, d paramd, int paramInt) {
    return c;
  }
  
  public void a(CharSequence paramCharSequence, s params, d paramd, t<?> paramt, boolean paramBoolean) {
    int k = paramCharSequence.length();
    int m = params.f();
    if (m >= k) {
      params.a(m, "Missing timezone name.");
      return;
    } 
    StringBuilder stringBuilder2 = new StringBuilder();
    int i = m;
    while (i < k) {
      char c = paramCharSequence.charAt(i);
      if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || c == '-' || c == '_' || c == '/') {
        stringBuilder2.append(c);
        i++;
      } 
    } 
    int j = i;
    if (!Character.isLetter(stringBuilder2.charAt(stringBuilder2.length() - 1))) {
      stringBuilder2.deleteCharAt(stringBuilder2.length() - 1);
      j = i - 1;
    } 
    String str = stringBuilder2.toString();
    if (str.isEmpty()) {
      params.a(m, "Missing valid timezone id.");
      return;
    } 
    if (str.startsWith("Etc/GMT")) {
      params.a(m, "Inverse Etc/GMT-Offsets are not supported, use UTC-Offsets instead.");
      return;
    } 
    if (str.equals("Z")) {
      paramt.c(b0.d, p.m);
      params.a(j);
      return;
    } 
    if (str.equals("UTC") || str.equals("GMT") || str.equals("UT")) {
      if (k > j) {
        i = paramCharSequence.charAt(j);
        if (i == 43 || i == 45) {
          params.a(j);
          e0.h.a(paramCharSequence, params, paramd, paramt, paramBoolean);
          return;
        } 
      } 
      paramt.c(b0.d, p.m);
      params.a(j);
      return;
    } 
    List<k> list = l.b("INCLUDE_ALIAS");
    k = 0;
    i = list.size() - 1;
    while (k <= i) {
      int n = k + i >>> 1;
      k k1 = list.get(n);
      int i1 = k1.a().compareTo(str);
      if (i1 < 0) {
        k = n + 1;
        continue;
      } 
      if (i1 > 0) {
        i = n - 1;
        continue;
      } 
      paramt.c(b0.c, k1);
      params.a(j);
      return;
    } 
    StringBuilder stringBuilder1 = new StringBuilder();
    stringBuilder1.append("Cannot parse to timezone id: ");
    stringBuilder1.append(str);
    params.a(m, stringBuilder1.toString());
  }
  
  public boolean a() {
    return false;
  }
  
  public p<k> b() {
    return b0.c;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/e1/a0/c0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */