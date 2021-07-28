package net.time4j.e1.a0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import net.time4j.tz.k;

class g0 {
  private final b a;
  
  g0(b paramb) {
    this.a = paramb;
  }
  
  private static b a(b paramb, String paramString, int paramInt) {
    if (paramb == null)
      return null; 
    char c = paramString.charAt(paramInt);
    if (c < b.a(paramb)) {
      paramb = b.b(paramb);
      return a(paramb, paramString, paramInt);
    } 
    if (c > b.a(paramb)) {
      paramb = b.c(paramb);
      return a(paramb, paramString, paramInt);
    } 
    if (paramInt < paramString.length() - 1) {
      paramb = b.e(paramb);
      return a(paramb, paramString, ++paramInt);
    } 
    return paramb;
  }
  
  static b a(b paramb, String paramString, k paramk) {
    if (!paramString.isEmpty()) {
      if (paramk != null)
        return a(paramb, paramString, paramk, 0); 
      throw new NullPointerException("Missing timezone id.");
    } 
    throw new IllegalArgumentException("Empty key cannot be inserted.");
  }
  
  private static b a(b paramb, String paramString, k paramk, int paramInt) {
    char c = paramString.charAt(paramInt);
    b b1 = paramb;
    if (paramb == null)
      b1 = new b(c, null); 
    return (c < b.a(b1)) ? b.a(b1, a(b.b(b1), paramString, paramk, paramInt)) : ((c > b.a(b1)) ? b.b(b1, a(b.c(b1), paramString, paramk, paramInt)) : ((paramInt < paramString.length() - 1) ? b.c(b1, a(b.e(b1), paramString, paramk, paramInt + 1)) : b.a(b1, paramk)));
  }
  
  private void a(b paramb, StringBuilder paramStringBuilder, List<String> paramList) {
    if (paramb == null)
      return; 
    a(b.b(paramb), paramStringBuilder, paramList);
    if (b.d(paramb) != null) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(paramStringBuilder.toString());
      stringBuilder.append(b.a(paramb));
      paramList.add(stringBuilder.toString());
    } 
    b b1 = b.e(paramb);
    paramStringBuilder.append(b.a(paramb));
    a(b1, paramStringBuilder, paramList);
    paramStringBuilder.deleteCharAt(paramStringBuilder.length() - 1);
    a(b.c(paramb), paramStringBuilder, paramList);
  }
  
  String a(CharSequence paramCharSequence, int paramInt) {
    b b1 = this.a;
    int k = paramCharSequence.length();
    int i = paramInt;
    int j = i;
    while (b1 != null && i < k) {
      char c = paramCharSequence.charAt(i);
      if (c < b.a(b1)) {
        b1 = b.b(b1);
        continue;
      } 
      if (c > b.a(b1)) {
        b1 = b.c(b1);
        continue;
      } 
      i++;
      if (b.d(b1) != null)
        j = i; 
      b1 = b.e(b1);
    } 
    return (paramInt >= j) ? "" : paramCharSequence.subSequence(paramInt, j).toString();
  }
  
  List<k> a(String paramString) {
    if (paramString.isEmpty())
      return Collections.emptyList(); 
    b b1 = a(this.a, paramString, 0);
    return (b1 == null) ? Collections.emptyList() : Collections.unmodifiableList(b.d(b1));
  }
  
  public String toString() {
    ArrayList<String> arrayList = new ArrayList();
    a(this.a, new StringBuilder(), arrayList);
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("count=");
    stringBuilder.append(arrayList.size());
    stringBuilder.append(",labels={");
    for (String str : arrayList) {
      stringBuilder.append(str);
      stringBuilder.append("=>");
      stringBuilder.append(a(str));
      stringBuilder.append(',');
    } 
    stringBuilder.deleteCharAt(stringBuilder.length() - 1).append('}');
    return stringBuilder.toString();
  }
  
  static class b {
    private final char a;
    
    private final b b;
    
    private final b c;
    
    private final b d;
    
    private final List<k> e;
    
    private b(char param1Char) {
      this(param1Char, null, null, null, null);
    }
    
    private b(char param1Char, b param1b1, b param1b2, b param1b3, List<k> param1List) {
      this.a = param1Char;
      this.b = param1b1;
      this.c = param1b2;
      this.d = param1b3;
      this.e = param1List;
    }
    
    private b a(k param1k) {
      ArrayList<k> arrayList = new ArrayList();
      List<k> list = this.e;
      if (list != null)
        arrayList.addAll(list); 
      arrayList.add(param1k);
      return new b(this.a, this.b, this.c, this.d, arrayList);
    }
    
    private b f(b param1b) {
      return new b(this.a, param1b, this.c, this.d, this.e);
    }
    
    private b g(b param1b) {
      return new b(this.a, this.b, param1b, this.d, this.e);
    }
    
    private b h(b param1b) {
      return new b(this.a, this.b, this.c, param1b, this.e);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/e1/a0/g0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */